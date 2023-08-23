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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "ParameterAny", "GraphName", "Float32_1", "Float64_1", "Default", "Duration", "Feedback", "String_2", "Uint16_1", "Uint32_1", "Uint64_1", "Boolean", "Integer", "Float32", "Float64", "Int16_1", "Int32_1", "Int64_1", "Message", "Service", "Uint8_1", "Array", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Char_1", "Int8_1", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "Int16", "Int32", "Int64", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Char", "Goal", "Int8", "Name", "Node", "Time", "Type", "Any", "Ns", "LeftSquareBracketRightSquareBracket", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("LeftSquareBracketRightSquareBracket", "'[]'");
    		tokenNameToValue.put("Any", "'Any'");
    		tokenNameToValue.put("Ns", "'ns:'");
    		tokenNameToValue.put("Date", "'Date'");
    		tokenNameToValue.put("List", "'List'");
    		tokenNameToValue.put("Bool", "'bool'");
    		tokenNameToValue.put("Byte", "'byte'");
    		tokenNameToValue.put("Char", "'char'");
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
    		tokenNameToValue.put("Action", "'action'");
    		tokenNameToValue.put("Bool_1", "'bool[]'");
    		tokenNameToValue.put("Byte_1", "'byte[]'");
    		tokenNameToValue.put("Char_1", "'char[]'");
    		tokenNameToValue.put("Int8_1", "'int8[]'");
    		tokenNameToValue.put("Result", "'result'");
    		tokenNameToValue.put("String_1", "'string'");
    		tokenNameToValue.put("Uint16", "'uint16'");
    		tokenNameToValue.put("Uint32", "'uint32'");
    		tokenNameToValue.put("Uint64", "'uint64'");
    		tokenNameToValue.put("Value_1", "'value:'");
    		tokenNameToValue.put("Boolean", "'Boolean'");
    		tokenNameToValue.put("Integer", "'Integer'");
    		tokenNameToValue.put("Float32", "'float32'");
    		tokenNameToValue.put("Float64", "'float64'");
    		tokenNameToValue.put("Int16_1", "'int16[]'");
    		tokenNameToValue.put("Int32_1", "'int32[]'");
    		tokenNameToValue.put("Int64_1", "'int64[]'");
    		tokenNameToValue.put("Message", "'message'");
    		tokenNameToValue.put("Service", "'service'");
    		tokenNameToValue.put("Uint8_1", "'uint8[]'");
    		tokenNameToValue.put("Default", "'default:'");
    		tokenNameToValue.put("Duration", "'duration'");
    		tokenNameToValue.put("Feedback", "'feedback'");
    		tokenNameToValue.put("String_2", "'string[]'");
    		tokenNameToValue.put("Uint16_1", "'uint16[]'");
    		tokenNameToValue.put("Uint32_1", "'uint32[]'");
    		tokenNameToValue.put("Uint64_1", "'uint64[]'");
    		tokenNameToValue.put("GraphName", "'GraphName'");
    		tokenNameToValue.put("Float32_1", "'float32[]'");
    		tokenNameToValue.put("Float64_1", "'float64[]'");
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
    // InternalBasicsParser.g:120:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalBasicsParser.g:121:1: ( ruleNamespace EOF )
            // InternalBasicsParser.g:122:1: ruleNamespace EOF
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
    // InternalBasicsParser.g:129:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:133:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalBasicsParser.g:134:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalBasicsParser.g:134:2: ( ( rule__Namespace__Alternatives ) )
            // InternalBasicsParser.g:135:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives()); 
            // InternalBasicsParser.g:136:3: ( rule__Namespace__Alternatives )
            // InternalBasicsParser.g:136:4: rule__Namespace__Alternatives
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
    // InternalBasicsParser.g:145:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalBasicsParser.g:146:1: ( ruleGraphName EOF )
            // InternalBasicsParser.g:147:1: ruleGraphName EOF
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
    // InternalBasicsParser.g:154:1: ruleGraphName : ( GraphName ) ;
    public final void ruleGraphName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:158:2: ( ( GraphName ) )
            // InternalBasicsParser.g:159:2: ( GraphName )
            {
            // InternalBasicsParser.g:159:2: ( GraphName )
            // InternalBasicsParser.g:160:3: GraphName
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
    // InternalBasicsParser.g:170:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalBasicsParser.g:171:1: ( ruleGlobalNamespace EOF )
            // InternalBasicsParser.g:172:1: ruleGlobalNamespace EOF
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
    // InternalBasicsParser.g:179:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:183:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalBasicsParser.g:184:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalBasicsParser.g:184:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalBasicsParser.g:185:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup()); 
            // InternalBasicsParser.g:186:3: ( rule__GlobalNamespace__Group__0 )
            // InternalBasicsParser.g:186:4: rule__GlobalNamespace__Group__0
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
    // InternalBasicsParser.g:195:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalBasicsParser.g:196:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalBasicsParser.g:197:1: ruleRelativeNamespace_Impl EOF
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
    // InternalBasicsParser.g:204:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:208:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalBasicsParser.g:209:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalBasicsParser.g:209:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalBasicsParser.g:210:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 
            // InternalBasicsParser.g:211:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalBasicsParser.g:211:4: rule__RelativeNamespace_Impl__Group__0
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
    // InternalBasicsParser.g:220:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalBasicsParser.g:221:1: ( rulePrivateNamespace EOF )
            // InternalBasicsParser.g:222:1: rulePrivateNamespace EOF
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
    // InternalBasicsParser.g:229:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:233:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalBasicsParser.g:234:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalBasicsParser.g:234:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalBasicsParser.g:235:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup()); 
            // InternalBasicsParser.g:236:3: ( rule__PrivateNamespace__Group__0 )
            // InternalBasicsParser.g:236:4: rule__PrivateNamespace__Group__0
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
    // InternalBasicsParser.g:245:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:246:1: ( ruleParameterType EOF )
            // InternalBasicsParser.g:247:1: ruleParameterType EOF
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
    // InternalBasicsParser.g:254:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:258:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalBasicsParser.g:259:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalBasicsParser.g:259:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalBasicsParser.g:260:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalBasicsParser.g:261:3: ( rule__ParameterType__Alternatives )
            // InternalBasicsParser.g:261:4: rule__ParameterType__Alternatives
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
    // InternalBasicsParser.g:270:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalBasicsParser.g:271:1: ( ruleParameterValue EOF )
            // InternalBasicsParser.g:272:1: ruleParameterValue EOF
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
    // InternalBasicsParser.g:279:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:283:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalBasicsParser.g:284:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalBasicsParser.g:284:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalBasicsParser.g:285:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalBasicsParser.g:286:3: ( rule__ParameterValue__Alternatives )
            // InternalBasicsParser.g:286:4: rule__ParameterValue__Alternatives
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
    // InternalBasicsParser.g:295:1: entryRuleParameterListType : ruleParameterListType EOF ;
    public final void entryRuleParameterListType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:296:1: ( ruleParameterListType EOF )
            // InternalBasicsParser.g:297:1: ruleParameterListType EOF
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
    // InternalBasicsParser.g:304:1: ruleParameterListType : ( ( rule__ParameterListType__Group__0 ) ) ;
    public final void ruleParameterListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:308:2: ( ( ( rule__ParameterListType__Group__0 ) ) )
            // InternalBasicsParser.g:309:2: ( ( rule__ParameterListType__Group__0 ) )
            {
            // InternalBasicsParser.g:309:2: ( ( rule__ParameterListType__Group__0 ) )
            // InternalBasicsParser.g:310:3: ( rule__ParameterListType__Group__0 )
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup()); 
            // InternalBasicsParser.g:311:3: ( rule__ParameterListType__Group__0 )
            // InternalBasicsParser.g:311:4: rule__ParameterListType__Group__0
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
    // InternalBasicsParser.g:320:1: entryRuleParameterStructType : ruleParameterStructType EOF ;
    public final void entryRuleParameterStructType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:321:1: ( ruleParameterStructType EOF )
            // InternalBasicsParser.g:322:1: ruleParameterStructType EOF
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
    // InternalBasicsParser.g:329:1: ruleParameterStructType : ( ( rule__ParameterStructType__Group__0 ) ) ;
    public final void ruleParameterStructType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:333:2: ( ( ( rule__ParameterStructType__Group__0 ) ) )
            // InternalBasicsParser.g:334:2: ( ( rule__ParameterStructType__Group__0 ) )
            {
            // InternalBasicsParser.g:334:2: ( ( rule__ParameterStructType__Group__0 ) )
            // InternalBasicsParser.g:335:3: ( rule__ParameterStructType__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup()); 
            // InternalBasicsParser.g:336:3: ( rule__ParameterStructType__Group__0 )
            // InternalBasicsParser.g:336:4: rule__ParameterStructType__Group__0
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
    // InternalBasicsParser.g:345:1: entryRuleParameterIntegerType : ruleParameterIntegerType EOF ;
    public final void entryRuleParameterIntegerType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:346:1: ( ruleParameterIntegerType EOF )
            // InternalBasicsParser.g:347:1: ruleParameterIntegerType EOF
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
    // InternalBasicsParser.g:354:1: ruleParameterIntegerType : ( ( rule__ParameterIntegerType__Group__0 ) ) ;
    public final void ruleParameterIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:358:2: ( ( ( rule__ParameterIntegerType__Group__0 ) ) )
            // InternalBasicsParser.g:359:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            {
            // InternalBasicsParser.g:359:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            // InternalBasicsParser.g:360:3: ( rule__ParameterIntegerType__Group__0 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup()); 
            // InternalBasicsParser.g:361:3: ( rule__ParameterIntegerType__Group__0 )
            // InternalBasicsParser.g:361:4: rule__ParameterIntegerType__Group__0
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
    // InternalBasicsParser.g:370:1: entryRuleParameterStringType : ruleParameterStringType EOF ;
    public final void entryRuleParameterStringType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:371:1: ( ruleParameterStringType EOF )
            // InternalBasicsParser.g:372:1: ruleParameterStringType EOF
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
    // InternalBasicsParser.g:379:1: ruleParameterStringType : ( ( rule__ParameterStringType__Group__0 ) ) ;
    public final void ruleParameterStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:383:2: ( ( ( rule__ParameterStringType__Group__0 ) ) )
            // InternalBasicsParser.g:384:2: ( ( rule__ParameterStringType__Group__0 ) )
            {
            // InternalBasicsParser.g:384:2: ( ( rule__ParameterStringType__Group__0 ) )
            // InternalBasicsParser.g:385:3: ( rule__ParameterStringType__Group__0 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup()); 
            // InternalBasicsParser.g:386:3: ( rule__ParameterStringType__Group__0 )
            // InternalBasicsParser.g:386:4: rule__ParameterStringType__Group__0
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
    // InternalBasicsParser.g:395:1: entryRuleParameterDoubleType : ruleParameterDoubleType EOF ;
    public final void entryRuleParameterDoubleType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:396:1: ( ruleParameterDoubleType EOF )
            // InternalBasicsParser.g:397:1: ruleParameterDoubleType EOF
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
    // InternalBasicsParser.g:404:1: ruleParameterDoubleType : ( ( rule__ParameterDoubleType__Group__0 ) ) ;
    public final void ruleParameterDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:408:2: ( ( ( rule__ParameterDoubleType__Group__0 ) ) )
            // InternalBasicsParser.g:409:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            {
            // InternalBasicsParser.g:409:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            // InternalBasicsParser.g:410:3: ( rule__ParameterDoubleType__Group__0 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup()); 
            // InternalBasicsParser.g:411:3: ( rule__ParameterDoubleType__Group__0 )
            // InternalBasicsParser.g:411:4: rule__ParameterDoubleType__Group__0
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
    // InternalBasicsParser.g:420:1: entryRuleParameterBooleanType : ruleParameterBooleanType EOF ;
    public final void entryRuleParameterBooleanType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:421:1: ( ruleParameterBooleanType EOF )
            // InternalBasicsParser.g:422:1: ruleParameterBooleanType EOF
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
    // InternalBasicsParser.g:429:1: ruleParameterBooleanType : ( ( rule__ParameterBooleanType__Group__0 ) ) ;
    public final void ruleParameterBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:433:2: ( ( ( rule__ParameterBooleanType__Group__0 ) ) )
            // InternalBasicsParser.g:434:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            {
            // InternalBasicsParser.g:434:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            // InternalBasicsParser.g:435:3: ( rule__ParameterBooleanType__Group__0 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup()); 
            // InternalBasicsParser.g:436:3: ( rule__ParameterBooleanType__Group__0 )
            // InternalBasicsParser.g:436:4: rule__ParameterBooleanType__Group__0
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
    // InternalBasicsParser.g:445:1: entryRuleParameterBase64Type : ruleParameterBase64Type EOF ;
    public final void entryRuleParameterBase64Type() throws RecognitionException {
        try {
            // InternalBasicsParser.g:446:1: ( ruleParameterBase64Type EOF )
            // InternalBasicsParser.g:447:1: ruleParameterBase64Type EOF
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
    // InternalBasicsParser.g:454:1: ruleParameterBase64Type : ( ( rule__ParameterBase64Type__Group__0 ) ) ;
    public final void ruleParameterBase64Type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:458:2: ( ( ( rule__ParameterBase64Type__Group__0 ) ) )
            // InternalBasicsParser.g:459:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            {
            // InternalBasicsParser.g:459:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            // InternalBasicsParser.g:460:3: ( rule__ParameterBase64Type__Group__0 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup()); 
            // InternalBasicsParser.g:461:3: ( rule__ParameterBase64Type__Group__0 )
            // InternalBasicsParser.g:461:4: rule__ParameterBase64Type__Group__0
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
    // InternalBasicsParser.g:470:1: entryRuleParameterArrayType : ruleParameterArrayType EOF ;
    public final void entryRuleParameterArrayType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:471:1: ( ruleParameterArrayType EOF )
            // InternalBasicsParser.g:472:1: ruleParameterArrayType EOF
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
    // InternalBasicsParser.g:479:1: ruleParameterArrayType : ( ( rule__ParameterArrayType__Group__0 ) ) ;
    public final void ruleParameterArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:483:2: ( ( ( rule__ParameterArrayType__Group__0 ) ) )
            // InternalBasicsParser.g:484:2: ( ( rule__ParameterArrayType__Group__0 ) )
            {
            // InternalBasicsParser.g:484:2: ( ( rule__ParameterArrayType__Group__0 ) )
            // InternalBasicsParser.g:485:3: ( rule__ParameterArrayType__Group__0 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup()); 
            // InternalBasicsParser.g:486:3: ( rule__ParameterArrayType__Group__0 )
            // InternalBasicsParser.g:486:4: rule__ParameterArrayType__Group__0
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
    // InternalBasicsParser.g:495:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // InternalBasicsParser.g:496:1: ( ruleParameterList EOF )
            // InternalBasicsParser.g:497:1: ruleParameterList EOF
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
    // InternalBasicsParser.g:504:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:508:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // InternalBasicsParser.g:509:2: ( ( rule__ParameterList__Group__0 ) )
            {
            // InternalBasicsParser.g:509:2: ( ( rule__ParameterList__Group__0 ) )
            // InternalBasicsParser.g:510:3: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // InternalBasicsParser.g:511:3: ( rule__ParameterList__Group__0 )
            // InternalBasicsParser.g:511:4: rule__ParameterList__Group__0
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
    // InternalBasicsParser.g:520:1: entryRuleParameterAny : ruleParameterAny EOF ;
    public final void entryRuleParameterAny() throws RecognitionException {
        try {
            // InternalBasicsParser.g:521:1: ( ruleParameterAny EOF )
            // InternalBasicsParser.g:522:1: ruleParameterAny EOF
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
    // InternalBasicsParser.g:529:1: ruleParameterAny : ( ( rule__ParameterAny__Group__0 ) ) ;
    public final void ruleParameterAny() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:533:2: ( ( ( rule__ParameterAny__Group__0 ) ) )
            // InternalBasicsParser.g:534:2: ( ( rule__ParameterAny__Group__0 ) )
            {
            // InternalBasicsParser.g:534:2: ( ( rule__ParameterAny__Group__0 ) )
            // InternalBasicsParser.g:535:3: ( rule__ParameterAny__Group__0 )
            {
             before(grammarAccess.getParameterAnyAccess().getGroup()); 
            // InternalBasicsParser.g:536:3: ( rule__ParameterAny__Group__0 )
            // InternalBasicsParser.g:536:4: rule__ParameterAny__Group__0
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
    // InternalBasicsParser.g:545:1: entryRuleParameterString : ruleParameterString EOF ;
    public final void entryRuleParameterString() throws RecognitionException {
        try {
            // InternalBasicsParser.g:546:1: ( ruleParameterString EOF )
            // InternalBasicsParser.g:547:1: ruleParameterString EOF
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
    // InternalBasicsParser.g:554:1: ruleParameterString : ( ( rule__ParameterString__ValueAssignment ) ) ;
    public final void ruleParameterString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:558:2: ( ( ( rule__ParameterString__ValueAssignment ) ) )
            // InternalBasicsParser.g:559:2: ( ( rule__ParameterString__ValueAssignment ) )
            {
            // InternalBasicsParser.g:559:2: ( ( rule__ParameterString__ValueAssignment ) )
            // InternalBasicsParser.g:560:3: ( rule__ParameterString__ValueAssignment )
            {
             before(grammarAccess.getParameterStringAccess().getValueAssignment()); 
            // InternalBasicsParser.g:561:3: ( rule__ParameterString__ValueAssignment )
            // InternalBasicsParser.g:561:4: rule__ParameterString__ValueAssignment
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
    // InternalBasicsParser.g:570:1: entryRuleParameterBase64 : ruleParameterBase64 EOF ;
    public final void entryRuleParameterBase64() throws RecognitionException {
        try {
            // InternalBasicsParser.g:571:1: ( ruleParameterBase64 EOF )
            // InternalBasicsParser.g:572:1: ruleParameterBase64 EOF
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
    // InternalBasicsParser.g:579:1: ruleParameterBase64 : ( ( rule__ParameterBase64__ValueAssignment ) ) ;
    public final void ruleParameterBase64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:583:2: ( ( ( rule__ParameterBase64__ValueAssignment ) ) )
            // InternalBasicsParser.g:584:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            {
            // InternalBasicsParser.g:584:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            // InternalBasicsParser.g:585:3: ( rule__ParameterBase64__ValueAssignment )
            {
             before(grammarAccess.getParameterBase64Access().getValueAssignment()); 
            // InternalBasicsParser.g:586:3: ( rule__ParameterBase64__ValueAssignment )
            // InternalBasicsParser.g:586:4: rule__ParameterBase64__ValueAssignment
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
    // InternalBasicsParser.g:595:1: entryRuleParameterInteger : ruleParameterInteger EOF ;
    public final void entryRuleParameterInteger() throws RecognitionException {
        try {
            // InternalBasicsParser.g:596:1: ( ruleParameterInteger EOF )
            // InternalBasicsParser.g:597:1: ruleParameterInteger EOF
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
    // InternalBasicsParser.g:604:1: ruleParameterInteger : ( ( rule__ParameterInteger__ValueAssignment ) ) ;
    public final void ruleParameterInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:608:2: ( ( ( rule__ParameterInteger__ValueAssignment ) ) )
            // InternalBasicsParser.g:609:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            {
            // InternalBasicsParser.g:609:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            // InternalBasicsParser.g:610:3: ( rule__ParameterInteger__ValueAssignment )
            {
             before(grammarAccess.getParameterIntegerAccess().getValueAssignment()); 
            // InternalBasicsParser.g:611:3: ( rule__ParameterInteger__ValueAssignment )
            // InternalBasicsParser.g:611:4: rule__ParameterInteger__ValueAssignment
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
    // InternalBasicsParser.g:620:1: entryRuleParameterDouble : ruleParameterDouble EOF ;
    public final void entryRuleParameterDouble() throws RecognitionException {
        try {
            // InternalBasicsParser.g:621:1: ( ruleParameterDouble EOF )
            // InternalBasicsParser.g:622:1: ruleParameterDouble EOF
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
    // InternalBasicsParser.g:629:1: ruleParameterDouble : ( ( rule__ParameterDouble__ValueAssignment ) ) ;
    public final void ruleParameterDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:633:2: ( ( ( rule__ParameterDouble__ValueAssignment ) ) )
            // InternalBasicsParser.g:634:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            {
            // InternalBasicsParser.g:634:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            // InternalBasicsParser.g:635:3: ( rule__ParameterDouble__ValueAssignment )
            {
             before(grammarAccess.getParameterDoubleAccess().getValueAssignment()); 
            // InternalBasicsParser.g:636:3: ( rule__ParameterDouble__ValueAssignment )
            // InternalBasicsParser.g:636:4: rule__ParameterDouble__ValueAssignment
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
    // InternalBasicsParser.g:645:1: entryRuleParameterBoolean : ruleParameterBoolean EOF ;
    public final void entryRuleParameterBoolean() throws RecognitionException {
        try {
            // InternalBasicsParser.g:646:1: ( ruleParameterBoolean EOF )
            // InternalBasicsParser.g:647:1: ruleParameterBoolean EOF
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
    // InternalBasicsParser.g:654:1: ruleParameterBoolean : ( ( rule__ParameterBoolean__ValueAssignment ) ) ;
    public final void ruleParameterBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:658:2: ( ( ( rule__ParameterBoolean__ValueAssignment ) ) )
            // InternalBasicsParser.g:659:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            {
            // InternalBasicsParser.g:659:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            // InternalBasicsParser.g:660:3: ( rule__ParameterBoolean__ValueAssignment )
            {
             before(grammarAccess.getParameterBooleanAccess().getValueAssignment()); 
            // InternalBasicsParser.g:661:3: ( rule__ParameterBoolean__ValueAssignment )
            // InternalBasicsParser.g:661:4: rule__ParameterBoolean__ValueAssignment
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
    // InternalBasicsParser.g:670:1: entryRuleParameterStruct : ruleParameterStruct EOF ;
    public final void entryRuleParameterStruct() throws RecognitionException {
        try {
            // InternalBasicsParser.g:671:1: ( ruleParameterStruct EOF )
            // InternalBasicsParser.g:672:1: ruleParameterStruct EOF
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
    // InternalBasicsParser.g:679:1: ruleParameterStruct : ( ( rule__ParameterStruct__Group__0 ) ) ;
    public final void ruleParameterStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:683:2: ( ( ( rule__ParameterStruct__Group__0 ) ) )
            // InternalBasicsParser.g:684:2: ( ( rule__ParameterStruct__Group__0 ) )
            {
            // InternalBasicsParser.g:684:2: ( ( rule__ParameterStruct__Group__0 ) )
            // InternalBasicsParser.g:685:3: ( rule__ParameterStruct__Group__0 )
            {
             before(grammarAccess.getParameterStructAccess().getGroup()); 
            // InternalBasicsParser.g:686:3: ( rule__ParameterStruct__Group__0 )
            // InternalBasicsParser.g:686:4: rule__ParameterStruct__Group__0
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
    // InternalBasicsParser.g:695:1: entryRuleParameterDate : ruleParameterDate EOF ;
    public final void entryRuleParameterDate() throws RecognitionException {
        try {
            // InternalBasicsParser.g:696:1: ( ruleParameterDate EOF )
            // InternalBasicsParser.g:697:1: ruleParameterDate EOF
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
    // InternalBasicsParser.g:704:1: ruleParameterDate : ( ( rule__ParameterDate__ValueAssignment ) ) ;
    public final void ruleParameterDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:708:2: ( ( ( rule__ParameterDate__ValueAssignment ) ) )
            // InternalBasicsParser.g:709:2: ( ( rule__ParameterDate__ValueAssignment ) )
            {
            // InternalBasicsParser.g:709:2: ( ( rule__ParameterDate__ValueAssignment ) )
            // InternalBasicsParser.g:710:3: ( rule__ParameterDate__ValueAssignment )
            {
             before(grammarAccess.getParameterDateAccess().getValueAssignment()); 
            // InternalBasicsParser.g:711:3: ( rule__ParameterDate__ValueAssignment )
            // InternalBasicsParser.g:711:4: rule__ParameterDate__ValueAssignment
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
    // InternalBasicsParser.g:720:1: entryRuleParameterStructMember : ruleParameterStructMember EOF ;
    public final void entryRuleParameterStructMember() throws RecognitionException {
        try {
            // InternalBasicsParser.g:721:1: ( ruleParameterStructMember EOF )
            // InternalBasicsParser.g:722:1: ruleParameterStructMember EOF
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
    // InternalBasicsParser.g:729:1: ruleParameterStructMember : ( ( rule__ParameterStructMember__Group__0 ) ) ;
    public final void ruleParameterStructMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:733:2: ( ( ( rule__ParameterStructMember__Group__0 ) ) )
            // InternalBasicsParser.g:734:2: ( ( rule__ParameterStructMember__Group__0 ) )
            {
            // InternalBasicsParser.g:734:2: ( ( rule__ParameterStructMember__Group__0 ) )
            // InternalBasicsParser.g:735:3: ( rule__ParameterStructMember__Group__0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getGroup()); 
            // InternalBasicsParser.g:736:3: ( rule__ParameterStructMember__Group__0 )
            // InternalBasicsParser.g:736:4: rule__ParameterStructMember__Group__0
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
    // InternalBasicsParser.g:745:1: entryRuleParameterStructTypeMember : ruleParameterStructTypeMember EOF ;
    public final void entryRuleParameterStructTypeMember() throws RecognitionException {
        try {
            // InternalBasicsParser.g:746:1: ( ruleParameterStructTypeMember EOF )
            // InternalBasicsParser.g:747:1: ruleParameterStructTypeMember EOF
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
    // InternalBasicsParser.g:754:1: ruleParameterStructTypeMember : ( ( rule__ParameterStructTypeMember__Group__0 ) ) ;
    public final void ruleParameterStructTypeMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:758:2: ( ( ( rule__ParameterStructTypeMember__Group__0 ) ) )
            // InternalBasicsParser.g:759:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            {
            // InternalBasicsParser.g:759:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            // InternalBasicsParser.g:760:3: ( rule__ParameterStructTypeMember__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getGroup()); 
            // InternalBasicsParser.g:761:3: ( rule__ParameterStructTypeMember__Group__0 )
            // InternalBasicsParser.g:761:4: rule__ParameterStructTypeMember__Group__0
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
    // InternalBasicsParser.g:770:1: entryRuleBase64Binary : ruleBase64Binary EOF ;
    public final void entryRuleBase64Binary() throws RecognitionException {
        try {
            // InternalBasicsParser.g:771:1: ( ruleBase64Binary EOF )
            // InternalBasicsParser.g:772:1: ruleBase64Binary EOF
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
    // InternalBasicsParser.g:779:1: ruleBase64Binary : ( RULE_BINARY ) ;
    public final void ruleBase64Binary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:783:2: ( ( RULE_BINARY ) )
            // InternalBasicsParser.g:784:2: ( RULE_BINARY )
            {
            // InternalBasicsParser.g:784:2: ( RULE_BINARY )
            // InternalBasicsParser.g:785:3: RULE_BINARY
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
    // InternalBasicsParser.g:795:1: entryRuleboolean0 : ruleboolean0 EOF ;
    public final void entryRuleboolean0() throws RecognitionException {
        try {
            // InternalBasicsParser.g:796:1: ( ruleboolean0 EOF )
            // InternalBasicsParser.g:797:1: ruleboolean0 EOF
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
    // InternalBasicsParser.g:804:1: ruleboolean0 : ( RULE_BOOLEAN ) ;
    public final void ruleboolean0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:808:2: ( ( RULE_BOOLEAN ) )
            // InternalBasicsParser.g:809:2: ( RULE_BOOLEAN )
            {
            // InternalBasicsParser.g:809:2: ( RULE_BOOLEAN )
            // InternalBasicsParser.g:810:3: RULE_BOOLEAN
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
    // InternalBasicsParser.g:820:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalBasicsParser.g:821:1: ( ruleDouble0 EOF )
            // InternalBasicsParser.g:822:1: ruleDouble0 EOF
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
    // InternalBasicsParser.g:829:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:833:2: ( ( RULE_DOUBLE ) )
            // InternalBasicsParser.g:834:2: ( RULE_DOUBLE )
            {
            // InternalBasicsParser.g:834:2: ( RULE_DOUBLE )
            // InternalBasicsParser.g:835:3: RULE_DOUBLE
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
    // InternalBasicsParser.g:845:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalBasicsParser.g:846:1: ( ruleInteger0 EOF )
            // InternalBasicsParser.g:847:1: ruleInteger0 EOF
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
    // InternalBasicsParser.g:854:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:858:2: ( ( RULE_DECINT ) )
            // InternalBasicsParser.g:859:2: ( RULE_DECINT )
            {
            // InternalBasicsParser.g:859:2: ( RULE_DECINT )
            // InternalBasicsParser.g:860:3: RULE_DECINT
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
    // InternalBasicsParser.g:870:1: entryRuleDateTime0 : ruleDateTime0 EOF ;
    public final void entryRuleDateTime0() throws RecognitionException {
        try {
            // InternalBasicsParser.g:871:1: ( ruleDateTime0 EOF )
            // InternalBasicsParser.g:872:1: ruleDateTime0 EOF
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
    // InternalBasicsParser.g:879:1: ruleDateTime0 : ( RULE_DATE_TIME ) ;
    public final void ruleDateTime0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:883:2: ( ( RULE_DATE_TIME ) )
            // InternalBasicsParser.g:884:2: ( RULE_DATE_TIME )
            {
            // InternalBasicsParser.g:884:2: ( RULE_DATE_TIME )
            // InternalBasicsParser.g:885:3: RULE_DATE_TIME
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
    // InternalBasicsParser.g:895:1: entryRuleAbstractType : ruleAbstractType EOF ;
    public final void entryRuleAbstractType() throws RecognitionException {
        try {
            // InternalBasicsParser.g:896:1: ( ruleAbstractType EOF )
            // InternalBasicsParser.g:897:1: ruleAbstractType EOF
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
    // InternalBasicsParser.g:904:1: ruleAbstractType : ( ( rule__AbstractType__Alternatives ) ) ;
    public final void ruleAbstractType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:908:2: ( ( ( rule__AbstractType__Alternatives ) ) )
            // InternalBasicsParser.g:909:2: ( ( rule__AbstractType__Alternatives ) )
            {
            // InternalBasicsParser.g:909:2: ( ( rule__AbstractType__Alternatives ) )
            // InternalBasicsParser.g:910:3: ( rule__AbstractType__Alternatives )
            {
             before(grammarAccess.getAbstractTypeAccess().getAlternatives()); 
            // InternalBasicsParser.g:911:3: ( rule__AbstractType__Alternatives )
            // InternalBasicsParser.g:911:4: rule__AbstractType__Alternatives
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
    // InternalBasicsParser.g:920:1: entryRulebool : rulebool EOF ;
    public final void entryRulebool() throws RecognitionException {
        try {
            // InternalBasicsParser.g:921:1: ( rulebool EOF )
            // InternalBasicsParser.g:922:1: rulebool EOF
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
    // InternalBasicsParser.g:929:1: rulebool : ( ( rule__Bool__Group__0 ) ) ;
    public final void rulebool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:933:2: ( ( ( rule__Bool__Group__0 ) ) )
            // InternalBasicsParser.g:934:2: ( ( rule__Bool__Group__0 ) )
            {
            // InternalBasicsParser.g:934:2: ( ( rule__Bool__Group__0 ) )
            // InternalBasicsParser.g:935:3: ( rule__Bool__Group__0 )
            {
             before(grammarAccess.getBoolAccess().getGroup()); 
            // InternalBasicsParser.g:936:3: ( rule__Bool__Group__0 )
            // InternalBasicsParser.g:936:4: rule__Bool__Group__0
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
    // InternalBasicsParser.g:945:1: entryRuleint8 : ruleint8 EOF ;
    public final void entryRuleint8() throws RecognitionException {
        try {
            // InternalBasicsParser.g:946:1: ( ruleint8 EOF )
            // InternalBasicsParser.g:947:1: ruleint8 EOF
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
    // InternalBasicsParser.g:954:1: ruleint8 : ( ( rule__Int8__Group__0 ) ) ;
    public final void ruleint8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:958:2: ( ( ( rule__Int8__Group__0 ) ) )
            // InternalBasicsParser.g:959:2: ( ( rule__Int8__Group__0 ) )
            {
            // InternalBasicsParser.g:959:2: ( ( rule__Int8__Group__0 ) )
            // InternalBasicsParser.g:960:3: ( rule__Int8__Group__0 )
            {
             before(grammarAccess.getInt8Access().getGroup()); 
            // InternalBasicsParser.g:961:3: ( rule__Int8__Group__0 )
            // InternalBasicsParser.g:961:4: rule__Int8__Group__0
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
    // InternalBasicsParser.g:970:1: entryRuleuint8 : ruleuint8 EOF ;
    public final void entryRuleuint8() throws RecognitionException {
        try {
            // InternalBasicsParser.g:971:1: ( ruleuint8 EOF )
            // InternalBasicsParser.g:972:1: ruleuint8 EOF
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
    // InternalBasicsParser.g:979:1: ruleuint8 : ( ( rule__Uint8__Group__0 ) ) ;
    public final void ruleuint8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:983:2: ( ( ( rule__Uint8__Group__0 ) ) )
            // InternalBasicsParser.g:984:2: ( ( rule__Uint8__Group__0 ) )
            {
            // InternalBasicsParser.g:984:2: ( ( rule__Uint8__Group__0 ) )
            // InternalBasicsParser.g:985:3: ( rule__Uint8__Group__0 )
            {
             before(grammarAccess.getUint8Access().getGroup()); 
            // InternalBasicsParser.g:986:3: ( rule__Uint8__Group__0 )
            // InternalBasicsParser.g:986:4: rule__Uint8__Group__0
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
    // InternalBasicsParser.g:995:1: entryRuleint16 : ruleint16 EOF ;
    public final void entryRuleint16() throws RecognitionException {
        try {
            // InternalBasicsParser.g:996:1: ( ruleint16 EOF )
            // InternalBasicsParser.g:997:1: ruleint16 EOF
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
    // InternalBasicsParser.g:1004:1: ruleint16 : ( ( rule__Int16__Group__0 ) ) ;
    public final void ruleint16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1008:2: ( ( ( rule__Int16__Group__0 ) ) )
            // InternalBasicsParser.g:1009:2: ( ( rule__Int16__Group__0 ) )
            {
            // InternalBasicsParser.g:1009:2: ( ( rule__Int16__Group__0 ) )
            // InternalBasicsParser.g:1010:3: ( rule__Int16__Group__0 )
            {
             before(grammarAccess.getInt16Access().getGroup()); 
            // InternalBasicsParser.g:1011:3: ( rule__Int16__Group__0 )
            // InternalBasicsParser.g:1011:4: rule__Int16__Group__0
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
    // InternalBasicsParser.g:1020:1: entryRuleuint16 : ruleuint16 EOF ;
    public final void entryRuleuint16() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1021:1: ( ruleuint16 EOF )
            // InternalBasicsParser.g:1022:1: ruleuint16 EOF
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
    // InternalBasicsParser.g:1029:1: ruleuint16 : ( ( rule__Uint16__Group__0 ) ) ;
    public final void ruleuint16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1033:2: ( ( ( rule__Uint16__Group__0 ) ) )
            // InternalBasicsParser.g:1034:2: ( ( rule__Uint16__Group__0 ) )
            {
            // InternalBasicsParser.g:1034:2: ( ( rule__Uint16__Group__0 ) )
            // InternalBasicsParser.g:1035:3: ( rule__Uint16__Group__0 )
            {
             before(grammarAccess.getUint16Access().getGroup()); 
            // InternalBasicsParser.g:1036:3: ( rule__Uint16__Group__0 )
            // InternalBasicsParser.g:1036:4: rule__Uint16__Group__0
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
    // InternalBasicsParser.g:1045:1: entryRuleint32 : ruleint32 EOF ;
    public final void entryRuleint32() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1046:1: ( ruleint32 EOF )
            // InternalBasicsParser.g:1047:1: ruleint32 EOF
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
    // InternalBasicsParser.g:1054:1: ruleint32 : ( ( rule__Int32__Group__0 ) ) ;
    public final void ruleint32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1058:2: ( ( ( rule__Int32__Group__0 ) ) )
            // InternalBasicsParser.g:1059:2: ( ( rule__Int32__Group__0 ) )
            {
            // InternalBasicsParser.g:1059:2: ( ( rule__Int32__Group__0 ) )
            // InternalBasicsParser.g:1060:3: ( rule__Int32__Group__0 )
            {
             before(grammarAccess.getInt32Access().getGroup()); 
            // InternalBasicsParser.g:1061:3: ( rule__Int32__Group__0 )
            // InternalBasicsParser.g:1061:4: rule__Int32__Group__0
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
    // InternalBasicsParser.g:1070:1: entryRuleuint32 : ruleuint32 EOF ;
    public final void entryRuleuint32() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1071:1: ( ruleuint32 EOF )
            // InternalBasicsParser.g:1072:1: ruleuint32 EOF
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
    // InternalBasicsParser.g:1079:1: ruleuint32 : ( ( rule__Uint32__Group__0 ) ) ;
    public final void ruleuint32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1083:2: ( ( ( rule__Uint32__Group__0 ) ) )
            // InternalBasicsParser.g:1084:2: ( ( rule__Uint32__Group__0 ) )
            {
            // InternalBasicsParser.g:1084:2: ( ( rule__Uint32__Group__0 ) )
            // InternalBasicsParser.g:1085:3: ( rule__Uint32__Group__0 )
            {
             before(grammarAccess.getUint32Access().getGroup()); 
            // InternalBasicsParser.g:1086:3: ( rule__Uint32__Group__0 )
            // InternalBasicsParser.g:1086:4: rule__Uint32__Group__0
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
    // InternalBasicsParser.g:1095:1: entryRuleint64 : ruleint64 EOF ;
    public final void entryRuleint64() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1096:1: ( ruleint64 EOF )
            // InternalBasicsParser.g:1097:1: ruleint64 EOF
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
    // InternalBasicsParser.g:1104:1: ruleint64 : ( ( rule__Int64__Group__0 ) ) ;
    public final void ruleint64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1108:2: ( ( ( rule__Int64__Group__0 ) ) )
            // InternalBasicsParser.g:1109:2: ( ( rule__Int64__Group__0 ) )
            {
            // InternalBasicsParser.g:1109:2: ( ( rule__Int64__Group__0 ) )
            // InternalBasicsParser.g:1110:3: ( rule__Int64__Group__0 )
            {
             before(grammarAccess.getInt64Access().getGroup()); 
            // InternalBasicsParser.g:1111:3: ( rule__Int64__Group__0 )
            // InternalBasicsParser.g:1111:4: rule__Int64__Group__0
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
    // InternalBasicsParser.g:1120:1: entryRuleuint64 : ruleuint64 EOF ;
    public final void entryRuleuint64() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1121:1: ( ruleuint64 EOF )
            // InternalBasicsParser.g:1122:1: ruleuint64 EOF
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
    // InternalBasicsParser.g:1129:1: ruleuint64 : ( ( rule__Uint64__Group__0 ) ) ;
    public final void ruleuint64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1133:2: ( ( ( rule__Uint64__Group__0 ) ) )
            // InternalBasicsParser.g:1134:2: ( ( rule__Uint64__Group__0 ) )
            {
            // InternalBasicsParser.g:1134:2: ( ( rule__Uint64__Group__0 ) )
            // InternalBasicsParser.g:1135:3: ( rule__Uint64__Group__0 )
            {
             before(grammarAccess.getUint64Access().getGroup()); 
            // InternalBasicsParser.g:1136:3: ( rule__Uint64__Group__0 )
            // InternalBasicsParser.g:1136:4: rule__Uint64__Group__0
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
    // InternalBasicsParser.g:1145:1: entryRulefloat32 : rulefloat32 EOF ;
    public final void entryRulefloat32() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1146:1: ( rulefloat32 EOF )
            // InternalBasicsParser.g:1147:1: rulefloat32 EOF
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
    // InternalBasicsParser.g:1154:1: rulefloat32 : ( ( rule__Float32__Group__0 ) ) ;
    public final void rulefloat32() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1158:2: ( ( ( rule__Float32__Group__0 ) ) )
            // InternalBasicsParser.g:1159:2: ( ( rule__Float32__Group__0 ) )
            {
            // InternalBasicsParser.g:1159:2: ( ( rule__Float32__Group__0 ) )
            // InternalBasicsParser.g:1160:3: ( rule__Float32__Group__0 )
            {
             before(grammarAccess.getFloat32Access().getGroup()); 
            // InternalBasicsParser.g:1161:3: ( rule__Float32__Group__0 )
            // InternalBasicsParser.g:1161:4: rule__Float32__Group__0
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
    // InternalBasicsParser.g:1170:1: entryRulefloat64 : rulefloat64 EOF ;
    public final void entryRulefloat64() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1171:1: ( rulefloat64 EOF )
            // InternalBasicsParser.g:1172:1: rulefloat64 EOF
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
    // InternalBasicsParser.g:1179:1: rulefloat64 : ( ( rule__Float64__Group__0 ) ) ;
    public final void rulefloat64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1183:2: ( ( ( rule__Float64__Group__0 ) ) )
            // InternalBasicsParser.g:1184:2: ( ( rule__Float64__Group__0 ) )
            {
            // InternalBasicsParser.g:1184:2: ( ( rule__Float64__Group__0 ) )
            // InternalBasicsParser.g:1185:3: ( rule__Float64__Group__0 )
            {
             before(grammarAccess.getFloat64Access().getGroup()); 
            // InternalBasicsParser.g:1186:3: ( rule__Float64__Group__0 )
            // InternalBasicsParser.g:1186:4: rule__Float64__Group__0
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
    // InternalBasicsParser.g:1195:1: entryRulestring0 : rulestring0 EOF ;
    public final void entryRulestring0() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1196:1: ( rulestring0 EOF )
            // InternalBasicsParser.g:1197:1: rulestring0 EOF
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
    // InternalBasicsParser.g:1204:1: rulestring0 : ( ( rule__String0__Group__0 ) ) ;
    public final void rulestring0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1208:2: ( ( ( rule__String0__Group__0 ) ) )
            // InternalBasicsParser.g:1209:2: ( ( rule__String0__Group__0 ) )
            {
            // InternalBasicsParser.g:1209:2: ( ( rule__String0__Group__0 ) )
            // InternalBasicsParser.g:1210:3: ( rule__String0__Group__0 )
            {
             before(grammarAccess.getString0Access().getGroup()); 
            // InternalBasicsParser.g:1211:3: ( rule__String0__Group__0 )
            // InternalBasicsParser.g:1211:4: rule__String0__Group__0
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


    // $ANTLR start "entryRulechar"
    // InternalBasicsParser.g:1220:1: entryRulechar : rulechar EOF ;
    public final void entryRulechar() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1221:1: ( rulechar EOF )
            // InternalBasicsParser.g:1222:1: rulechar EOF
            {
             before(grammarAccess.getCharRule()); 
            pushFollow(FOLLOW_1);
            rulechar();

            state._fsp--;

             after(grammarAccess.getCharRule()); 
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
    // $ANTLR end "entryRulechar"


    // $ANTLR start "rulechar"
    // InternalBasicsParser.g:1229:1: rulechar : ( ( rule__Char__Group__0 ) ) ;
    public final void rulechar() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1233:2: ( ( ( rule__Char__Group__0 ) ) )
            // InternalBasicsParser.g:1234:2: ( ( rule__Char__Group__0 ) )
            {
            // InternalBasicsParser.g:1234:2: ( ( rule__Char__Group__0 ) )
            // InternalBasicsParser.g:1235:3: ( rule__Char__Group__0 )
            {
             before(grammarAccess.getCharAccess().getGroup()); 
            // InternalBasicsParser.g:1236:3: ( rule__Char__Group__0 )
            // InternalBasicsParser.g:1236:4: rule__Char__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Char__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulechar"


    // $ANTLR start "entryRulebyte"
    // InternalBasicsParser.g:1245:1: entryRulebyte : rulebyte EOF ;
    public final void entryRulebyte() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1246:1: ( rulebyte EOF )
            // InternalBasicsParser.g:1247:1: rulebyte EOF
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
    // InternalBasicsParser.g:1254:1: rulebyte : ( ( rule__Byte__Group__0 ) ) ;
    public final void rulebyte() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1258:2: ( ( ( rule__Byte__Group__0 ) ) )
            // InternalBasicsParser.g:1259:2: ( ( rule__Byte__Group__0 ) )
            {
            // InternalBasicsParser.g:1259:2: ( ( rule__Byte__Group__0 ) )
            // InternalBasicsParser.g:1260:3: ( rule__Byte__Group__0 )
            {
             before(grammarAccess.getByteAccess().getGroup()); 
            // InternalBasicsParser.g:1261:3: ( rule__Byte__Group__0 )
            // InternalBasicsParser.g:1261:4: rule__Byte__Group__0
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
    // InternalBasicsParser.g:1270:1: entryRuletime : ruletime EOF ;
    public final void entryRuletime() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1271:1: ( ruletime EOF )
            // InternalBasicsParser.g:1272:1: ruletime EOF
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
    // InternalBasicsParser.g:1279:1: ruletime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruletime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1283:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalBasicsParser.g:1284:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalBasicsParser.g:1284:2: ( ( rule__Time__Group__0 ) )
            // InternalBasicsParser.g:1285:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalBasicsParser.g:1286:3: ( rule__Time__Group__0 )
            // InternalBasicsParser.g:1286:4: rule__Time__Group__0
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
    // InternalBasicsParser.g:1295:1: entryRuleduration : ruleduration EOF ;
    public final void entryRuleduration() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1296:1: ( ruleduration EOF )
            // InternalBasicsParser.g:1297:1: ruleduration EOF
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
    // InternalBasicsParser.g:1304:1: ruleduration : ( ( rule__Duration__Group__0 ) ) ;
    public final void ruleduration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1308:2: ( ( ( rule__Duration__Group__0 ) ) )
            // InternalBasicsParser.g:1309:2: ( ( rule__Duration__Group__0 ) )
            {
            // InternalBasicsParser.g:1309:2: ( ( rule__Duration__Group__0 ) )
            // InternalBasicsParser.g:1310:3: ( rule__Duration__Group__0 )
            {
             before(grammarAccess.getDurationAccess().getGroup()); 
            // InternalBasicsParser.g:1311:3: ( rule__Duration__Group__0 )
            // InternalBasicsParser.g:1311:4: rule__Duration__Group__0
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
    // InternalBasicsParser.g:1320:1: entryRuleboolArray : ruleboolArray EOF ;
    public final void entryRuleboolArray() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1321:1: ( ruleboolArray EOF )
            // InternalBasicsParser.g:1322:1: ruleboolArray EOF
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
    // InternalBasicsParser.g:1329:1: ruleboolArray : ( ( rule__BoolArray__Group__0 ) ) ;
    public final void ruleboolArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1333:2: ( ( ( rule__BoolArray__Group__0 ) ) )
            // InternalBasicsParser.g:1334:2: ( ( rule__BoolArray__Group__0 ) )
            {
            // InternalBasicsParser.g:1334:2: ( ( rule__BoolArray__Group__0 ) )
            // InternalBasicsParser.g:1335:3: ( rule__BoolArray__Group__0 )
            {
             before(grammarAccess.getBoolArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1336:3: ( rule__BoolArray__Group__0 )
            // InternalBasicsParser.g:1336:4: rule__BoolArray__Group__0
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
    // InternalBasicsParser.g:1345:1: entryRuleint8Array : ruleint8Array EOF ;
    public final void entryRuleint8Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1346:1: ( ruleint8Array EOF )
            // InternalBasicsParser.g:1347:1: ruleint8Array EOF
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
    // InternalBasicsParser.g:1354:1: ruleint8Array : ( ( rule__Int8Array__Group__0 ) ) ;
    public final void ruleint8Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1358:2: ( ( ( rule__Int8Array__Group__0 ) ) )
            // InternalBasicsParser.g:1359:2: ( ( rule__Int8Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1359:2: ( ( rule__Int8Array__Group__0 ) )
            // InternalBasicsParser.g:1360:3: ( rule__Int8Array__Group__0 )
            {
             before(grammarAccess.getInt8ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1361:3: ( rule__Int8Array__Group__0 )
            // InternalBasicsParser.g:1361:4: rule__Int8Array__Group__0
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
    // InternalBasicsParser.g:1370:1: entryRuleuint8Array : ruleuint8Array EOF ;
    public final void entryRuleuint8Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1371:1: ( ruleuint8Array EOF )
            // InternalBasicsParser.g:1372:1: ruleuint8Array EOF
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
    // InternalBasicsParser.g:1379:1: ruleuint8Array : ( ( rule__Uint8Array__Group__0 ) ) ;
    public final void ruleuint8Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1383:2: ( ( ( rule__Uint8Array__Group__0 ) ) )
            // InternalBasicsParser.g:1384:2: ( ( rule__Uint8Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1384:2: ( ( rule__Uint8Array__Group__0 ) )
            // InternalBasicsParser.g:1385:3: ( rule__Uint8Array__Group__0 )
            {
             before(grammarAccess.getUint8ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1386:3: ( rule__Uint8Array__Group__0 )
            // InternalBasicsParser.g:1386:4: rule__Uint8Array__Group__0
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
    // InternalBasicsParser.g:1395:1: entryRuleint16Array : ruleint16Array EOF ;
    public final void entryRuleint16Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1396:1: ( ruleint16Array EOF )
            // InternalBasicsParser.g:1397:1: ruleint16Array EOF
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
    // InternalBasicsParser.g:1404:1: ruleint16Array : ( ( rule__Int16Array__Group__0 ) ) ;
    public final void ruleint16Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1408:2: ( ( ( rule__Int16Array__Group__0 ) ) )
            // InternalBasicsParser.g:1409:2: ( ( rule__Int16Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1409:2: ( ( rule__Int16Array__Group__0 ) )
            // InternalBasicsParser.g:1410:3: ( rule__Int16Array__Group__0 )
            {
             before(grammarAccess.getInt16ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1411:3: ( rule__Int16Array__Group__0 )
            // InternalBasicsParser.g:1411:4: rule__Int16Array__Group__0
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
    // InternalBasicsParser.g:1420:1: entryRuleuint16Array : ruleuint16Array EOF ;
    public final void entryRuleuint16Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1421:1: ( ruleuint16Array EOF )
            // InternalBasicsParser.g:1422:1: ruleuint16Array EOF
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
    // InternalBasicsParser.g:1429:1: ruleuint16Array : ( ( rule__Uint16Array__Group__0 ) ) ;
    public final void ruleuint16Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1433:2: ( ( ( rule__Uint16Array__Group__0 ) ) )
            // InternalBasicsParser.g:1434:2: ( ( rule__Uint16Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1434:2: ( ( rule__Uint16Array__Group__0 ) )
            // InternalBasicsParser.g:1435:3: ( rule__Uint16Array__Group__0 )
            {
             before(grammarAccess.getUint16ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1436:3: ( rule__Uint16Array__Group__0 )
            // InternalBasicsParser.g:1436:4: rule__Uint16Array__Group__0
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
    // InternalBasicsParser.g:1445:1: entryRuleint32Array : ruleint32Array EOF ;
    public final void entryRuleint32Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1446:1: ( ruleint32Array EOF )
            // InternalBasicsParser.g:1447:1: ruleint32Array EOF
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
    // InternalBasicsParser.g:1454:1: ruleint32Array : ( ( rule__Int32Array__Group__0 ) ) ;
    public final void ruleint32Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1458:2: ( ( ( rule__Int32Array__Group__0 ) ) )
            // InternalBasicsParser.g:1459:2: ( ( rule__Int32Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1459:2: ( ( rule__Int32Array__Group__0 ) )
            // InternalBasicsParser.g:1460:3: ( rule__Int32Array__Group__0 )
            {
             before(grammarAccess.getInt32ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1461:3: ( rule__Int32Array__Group__0 )
            // InternalBasicsParser.g:1461:4: rule__Int32Array__Group__0
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
    // InternalBasicsParser.g:1470:1: entryRuleuint32Array : ruleuint32Array EOF ;
    public final void entryRuleuint32Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1471:1: ( ruleuint32Array EOF )
            // InternalBasicsParser.g:1472:1: ruleuint32Array EOF
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
    // InternalBasicsParser.g:1479:1: ruleuint32Array : ( ( rule__Uint32Array__Group__0 ) ) ;
    public final void ruleuint32Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1483:2: ( ( ( rule__Uint32Array__Group__0 ) ) )
            // InternalBasicsParser.g:1484:2: ( ( rule__Uint32Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1484:2: ( ( rule__Uint32Array__Group__0 ) )
            // InternalBasicsParser.g:1485:3: ( rule__Uint32Array__Group__0 )
            {
             before(grammarAccess.getUint32ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1486:3: ( rule__Uint32Array__Group__0 )
            // InternalBasicsParser.g:1486:4: rule__Uint32Array__Group__0
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
    // InternalBasicsParser.g:1495:1: entryRuleint64Array : ruleint64Array EOF ;
    public final void entryRuleint64Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1496:1: ( ruleint64Array EOF )
            // InternalBasicsParser.g:1497:1: ruleint64Array EOF
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
    // InternalBasicsParser.g:1504:1: ruleint64Array : ( ( rule__Int64Array__Group__0 ) ) ;
    public final void ruleint64Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1508:2: ( ( ( rule__Int64Array__Group__0 ) ) )
            // InternalBasicsParser.g:1509:2: ( ( rule__Int64Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1509:2: ( ( rule__Int64Array__Group__0 ) )
            // InternalBasicsParser.g:1510:3: ( rule__Int64Array__Group__0 )
            {
             before(grammarAccess.getInt64ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1511:3: ( rule__Int64Array__Group__0 )
            // InternalBasicsParser.g:1511:4: rule__Int64Array__Group__0
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
    // InternalBasicsParser.g:1520:1: entryRuleuint64Array : ruleuint64Array EOF ;
    public final void entryRuleuint64Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1521:1: ( ruleuint64Array EOF )
            // InternalBasicsParser.g:1522:1: ruleuint64Array EOF
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
    // InternalBasicsParser.g:1529:1: ruleuint64Array : ( ( rule__Uint64Array__Group__0 ) ) ;
    public final void ruleuint64Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1533:2: ( ( ( rule__Uint64Array__Group__0 ) ) )
            // InternalBasicsParser.g:1534:2: ( ( rule__Uint64Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1534:2: ( ( rule__Uint64Array__Group__0 ) )
            // InternalBasicsParser.g:1535:3: ( rule__Uint64Array__Group__0 )
            {
             before(grammarAccess.getUint64ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1536:3: ( rule__Uint64Array__Group__0 )
            // InternalBasicsParser.g:1536:4: rule__Uint64Array__Group__0
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
    // InternalBasicsParser.g:1545:1: entryRulefloat32Array : rulefloat32Array EOF ;
    public final void entryRulefloat32Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1546:1: ( rulefloat32Array EOF )
            // InternalBasicsParser.g:1547:1: rulefloat32Array EOF
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
    // InternalBasicsParser.g:1554:1: rulefloat32Array : ( ( rule__Float32Array__Group__0 ) ) ;
    public final void rulefloat32Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1558:2: ( ( ( rule__Float32Array__Group__0 ) ) )
            // InternalBasicsParser.g:1559:2: ( ( rule__Float32Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1559:2: ( ( rule__Float32Array__Group__0 ) )
            // InternalBasicsParser.g:1560:3: ( rule__Float32Array__Group__0 )
            {
             before(grammarAccess.getFloat32ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1561:3: ( rule__Float32Array__Group__0 )
            // InternalBasicsParser.g:1561:4: rule__Float32Array__Group__0
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
    // InternalBasicsParser.g:1570:1: entryRulefloat64Array : rulefloat64Array EOF ;
    public final void entryRulefloat64Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1571:1: ( rulefloat64Array EOF )
            // InternalBasicsParser.g:1572:1: rulefloat64Array EOF
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
    // InternalBasicsParser.g:1579:1: rulefloat64Array : ( ( rule__Float64Array__Group__0 ) ) ;
    public final void rulefloat64Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1583:2: ( ( ( rule__Float64Array__Group__0 ) ) )
            // InternalBasicsParser.g:1584:2: ( ( rule__Float64Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1584:2: ( ( rule__Float64Array__Group__0 ) )
            // InternalBasicsParser.g:1585:3: ( rule__Float64Array__Group__0 )
            {
             before(grammarAccess.getFloat64ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1586:3: ( rule__Float64Array__Group__0 )
            // InternalBasicsParser.g:1586:4: rule__Float64Array__Group__0
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
    // InternalBasicsParser.g:1595:1: entryRulestring0Array : rulestring0Array EOF ;
    public final void entryRulestring0Array() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1596:1: ( rulestring0Array EOF )
            // InternalBasicsParser.g:1597:1: rulestring0Array EOF
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
    // InternalBasicsParser.g:1604:1: rulestring0Array : ( ( rule__String0Array__Group__0 ) ) ;
    public final void rulestring0Array() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1608:2: ( ( ( rule__String0Array__Group__0 ) ) )
            // InternalBasicsParser.g:1609:2: ( ( rule__String0Array__Group__0 ) )
            {
            // InternalBasicsParser.g:1609:2: ( ( rule__String0Array__Group__0 ) )
            // InternalBasicsParser.g:1610:3: ( rule__String0Array__Group__0 )
            {
             before(grammarAccess.getString0ArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1611:3: ( rule__String0Array__Group__0 )
            // InternalBasicsParser.g:1611:4: rule__String0Array__Group__0
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
    // InternalBasicsParser.g:1620:1: entryRulebyteArray : rulebyteArray EOF ;
    public final void entryRulebyteArray() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1621:1: ( rulebyteArray EOF )
            // InternalBasicsParser.g:1622:1: rulebyteArray EOF
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
    // InternalBasicsParser.g:1629:1: rulebyteArray : ( ( rule__ByteArray__Group__0 ) ) ;
    public final void rulebyteArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1633:2: ( ( ( rule__ByteArray__Group__0 ) ) )
            // InternalBasicsParser.g:1634:2: ( ( rule__ByteArray__Group__0 ) )
            {
            // InternalBasicsParser.g:1634:2: ( ( rule__ByteArray__Group__0 ) )
            // InternalBasicsParser.g:1635:3: ( rule__ByteArray__Group__0 )
            {
             before(grammarAccess.getByteArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1636:3: ( rule__ByteArray__Group__0 )
            // InternalBasicsParser.g:1636:4: rule__ByteArray__Group__0
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


    // $ANTLR start "entryRulecharArray"
    // InternalBasicsParser.g:1645:1: entryRulecharArray : rulecharArray EOF ;
    public final void entryRulecharArray() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1646:1: ( rulecharArray EOF )
            // InternalBasicsParser.g:1647:1: rulecharArray EOF
            {
             before(grammarAccess.getCharArrayRule()); 
            pushFollow(FOLLOW_1);
            rulecharArray();

            state._fsp--;

             after(grammarAccess.getCharArrayRule()); 
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
    // $ANTLR end "entryRulecharArray"


    // $ANTLR start "rulecharArray"
    // InternalBasicsParser.g:1654:1: rulecharArray : ( ( rule__CharArray__Group__0 ) ) ;
    public final void rulecharArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1658:2: ( ( ( rule__CharArray__Group__0 ) ) )
            // InternalBasicsParser.g:1659:2: ( ( rule__CharArray__Group__0 ) )
            {
            // InternalBasicsParser.g:1659:2: ( ( rule__CharArray__Group__0 ) )
            // InternalBasicsParser.g:1660:3: ( rule__CharArray__Group__0 )
            {
             before(grammarAccess.getCharArrayAccess().getGroup()); 
            // InternalBasicsParser.g:1661:3: ( rule__CharArray__Group__0 )
            // InternalBasicsParser.g:1661:4: rule__CharArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CharArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCharArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulecharArray"


    // $ANTLR start "entryRuleHeader"
    // InternalBasicsParser.g:1670:1: entryRuleHeader : ruleHeader EOF ;
    public final void entryRuleHeader() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1671:1: ( ruleHeader EOF )
            // InternalBasicsParser.g:1672:1: ruleHeader EOF
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
    // InternalBasicsParser.g:1679:1: ruleHeader : ( ( rule__Header__Group__0 ) ) ;
    public final void ruleHeader() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1683:2: ( ( ( rule__Header__Group__0 ) ) )
            // InternalBasicsParser.g:1684:2: ( ( rule__Header__Group__0 ) )
            {
            // InternalBasicsParser.g:1684:2: ( ( rule__Header__Group__0 ) )
            // InternalBasicsParser.g:1685:3: ( rule__Header__Group__0 )
            {
             before(grammarAccess.getHeaderAccess().getGroup()); 
            // InternalBasicsParser.g:1686:3: ( rule__Header__Group__0 )
            // InternalBasicsParser.g:1686:4: rule__Header__Group__0
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


    // $ANTLR start "entryRuleSpecBaseRef"
    // InternalBasicsParser.g:1695:1: entryRuleSpecBaseRef : ruleSpecBaseRef EOF ;
    public final void entryRuleSpecBaseRef() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1696:1: ( ruleSpecBaseRef EOF )
            // InternalBasicsParser.g:1697:1: ruleSpecBaseRef EOF
            {
             before(grammarAccess.getSpecBaseRefRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecBaseRef();

            state._fsp--;

             after(grammarAccess.getSpecBaseRefRule()); 
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
    // $ANTLR end "entryRuleSpecBaseRef"


    // $ANTLR start "ruleSpecBaseRef"
    // InternalBasicsParser.g:1704:1: ruleSpecBaseRef : ( ( rule__SpecBaseRef__ReferenceAssignment ) ) ;
    public final void ruleSpecBaseRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1708:2: ( ( ( rule__SpecBaseRef__ReferenceAssignment ) ) )
            // InternalBasicsParser.g:1709:2: ( ( rule__SpecBaseRef__ReferenceAssignment ) )
            {
            // InternalBasicsParser.g:1709:2: ( ( rule__SpecBaseRef__ReferenceAssignment ) )
            // InternalBasicsParser.g:1710:3: ( rule__SpecBaseRef__ReferenceAssignment )
            {
             before(grammarAccess.getSpecBaseRefAccess().getReferenceAssignment()); 
            // InternalBasicsParser.g:1711:3: ( rule__SpecBaseRef__ReferenceAssignment )
            // InternalBasicsParser.g:1711:4: rule__SpecBaseRef__ReferenceAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SpecBaseRef__ReferenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSpecBaseRefAccess().getReferenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecBaseRef"


    // $ANTLR start "entryRuleArraySpecRef"
    // InternalBasicsParser.g:1720:1: entryRuleArraySpecRef : ruleArraySpecRef EOF ;
    public final void entryRuleArraySpecRef() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1721:1: ( ruleArraySpecRef EOF )
            // InternalBasicsParser.g:1722:1: ruleArraySpecRef EOF
            {
             before(grammarAccess.getArraySpecRefRule()); 
            pushFollow(FOLLOW_1);
            ruleArraySpecRef();

            state._fsp--;

             after(grammarAccess.getArraySpecRefRule()); 
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
    // $ANTLR end "entryRuleArraySpecRef"


    // $ANTLR start "ruleArraySpecRef"
    // InternalBasicsParser.g:1729:1: ruleArraySpecRef : ( ( rule__ArraySpecRef__Group__0 ) ) ;
    public final void ruleArraySpecRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1733:2: ( ( ( rule__ArraySpecRef__Group__0 ) ) )
            // InternalBasicsParser.g:1734:2: ( ( rule__ArraySpecRef__Group__0 ) )
            {
            // InternalBasicsParser.g:1734:2: ( ( rule__ArraySpecRef__Group__0 ) )
            // InternalBasicsParser.g:1735:3: ( rule__ArraySpecRef__Group__0 )
            {
             before(grammarAccess.getArraySpecRefAccess().getGroup()); 
            // InternalBasicsParser.g:1736:3: ( rule__ArraySpecRef__Group__0 )
            // InternalBasicsParser.g:1736:4: rule__ArraySpecRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArraySpecRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArraySpecRef"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalBasicsParser.g:1745:1: entryRuleKEYWORD : ruleKEYWORD EOF ;
    public final void entryRuleKEYWORD() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1746:1: ( ruleKEYWORD EOF )
            // InternalBasicsParser.g:1747:1: ruleKEYWORD EOF
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
    // InternalBasicsParser.g:1754:1: ruleKEYWORD : ( ( rule__KEYWORD__Alternatives ) ) ;
    public final void ruleKEYWORD() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1758:2: ( ( ( rule__KEYWORD__Alternatives ) ) )
            // InternalBasicsParser.g:1759:2: ( ( rule__KEYWORD__Alternatives ) )
            {
            // InternalBasicsParser.g:1759:2: ( ( rule__KEYWORD__Alternatives ) )
            // InternalBasicsParser.g:1760:3: ( rule__KEYWORD__Alternatives )
            {
             before(grammarAccess.getKEYWORDAccess().getAlternatives()); 
            // InternalBasicsParser.g:1761:3: ( rule__KEYWORD__Alternatives )
            // InternalBasicsParser.g:1761:4: rule__KEYWORD__Alternatives
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
    // InternalBasicsParser.g:1770:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalBasicsParser.g:1771:1: ( ruleEString EOF )
            // InternalBasicsParser.g:1772:1: ruleEString EOF
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
    // InternalBasicsParser.g:1779:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1783:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalBasicsParser.g:1784:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalBasicsParser.g:1784:2: ( ( rule__EString__Alternatives ) )
            // InternalBasicsParser.g:1785:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalBasicsParser.g:1786:3: ( rule__EString__Alternatives )
            // InternalBasicsParser.g:1786:4: rule__EString__Alternatives
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
    // InternalBasicsParser.g:1794:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1798:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
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
                    // InternalBasicsParser.g:1799:2: ( ruleGlobalNamespace )
                    {
                    // InternalBasicsParser.g:1799:2: ( ruleGlobalNamespace )
                    // InternalBasicsParser.g:1800:3: ruleGlobalNamespace
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
                    // InternalBasicsParser.g:1805:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalBasicsParser.g:1805:2: ( ruleRelativeNamespace_Impl )
                    // InternalBasicsParser.g:1806:3: ruleRelativeNamespace_Impl
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
                    // InternalBasicsParser.g:1811:2: ( rulePrivateNamespace )
                    {
                    // InternalBasicsParser.g:1811:2: ( rulePrivateNamespace )
                    // InternalBasicsParser.g:1812:3: rulePrivateNamespace
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
    // InternalBasicsParser.g:1821:1: rule__ParameterType__Alternatives : ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1825:1: ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) )
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
                    // InternalBasicsParser.g:1826:2: ( ruleParameterListType )
                    {
                    // InternalBasicsParser.g:1826:2: ( ruleParameterListType )
                    // InternalBasicsParser.g:1827:3: ruleParameterListType
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
                    // InternalBasicsParser.g:1832:2: ( ruleParameterStructType )
                    {
                    // InternalBasicsParser.g:1832:2: ( ruleParameterStructType )
                    // InternalBasicsParser.g:1833:3: ruleParameterStructType
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
                    // InternalBasicsParser.g:1838:2: ( ruleParameterIntegerType )
                    {
                    // InternalBasicsParser.g:1838:2: ( ruleParameterIntegerType )
                    // InternalBasicsParser.g:1839:3: ruleParameterIntegerType
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
                    // InternalBasicsParser.g:1844:2: ( ruleParameterStringType )
                    {
                    // InternalBasicsParser.g:1844:2: ( ruleParameterStringType )
                    // InternalBasicsParser.g:1845:3: ruleParameterStringType
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
                    // InternalBasicsParser.g:1850:2: ( ruleParameterDoubleType )
                    {
                    // InternalBasicsParser.g:1850:2: ( ruleParameterDoubleType )
                    // InternalBasicsParser.g:1851:3: ruleParameterDoubleType
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
                    // InternalBasicsParser.g:1856:2: ( ruleParameterBooleanType )
                    {
                    // InternalBasicsParser.g:1856:2: ( ruleParameterBooleanType )
                    // InternalBasicsParser.g:1857:3: ruleParameterBooleanType
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
                    // InternalBasicsParser.g:1862:2: ( ruleParameterBase64Type )
                    {
                    // InternalBasicsParser.g:1862:2: ( ruleParameterBase64Type )
                    // InternalBasicsParser.g:1863:3: ruleParameterBase64Type
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
                    // InternalBasicsParser.g:1868:2: ( ruleParameterArrayType )
                    {
                    // InternalBasicsParser.g:1868:2: ( ruleParameterArrayType )
                    // InternalBasicsParser.g:1869:3: ruleParameterArrayType
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
    // InternalBasicsParser.g:1878:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1882:1: ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalBasicsParser.g:1883:2: ( ruleParameterString )
                    {
                    // InternalBasicsParser.g:1883:2: ( ruleParameterString )
                    // InternalBasicsParser.g:1884:3: ruleParameterString
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
                    // InternalBasicsParser.g:1889:2: ( ruleParameterBase64 )
                    {
                    // InternalBasicsParser.g:1889:2: ( ruleParameterBase64 )
                    // InternalBasicsParser.g:1890:3: ruleParameterBase64
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
                    // InternalBasicsParser.g:1895:2: ( ruleParameterInteger )
                    {
                    // InternalBasicsParser.g:1895:2: ( ruleParameterInteger )
                    // InternalBasicsParser.g:1896:3: ruleParameterInteger
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
                    // InternalBasicsParser.g:1901:2: ( ruleParameterDouble )
                    {
                    // InternalBasicsParser.g:1901:2: ( ruleParameterDouble )
                    // InternalBasicsParser.g:1902:3: ruleParameterDouble
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
                    // InternalBasicsParser.g:1907:2: ( ruleParameterBoolean )
                    {
                    // InternalBasicsParser.g:1907:2: ( ruleParameterBoolean )
                    // InternalBasicsParser.g:1908:3: ruleParameterBoolean
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
                    // InternalBasicsParser.g:1913:2: ( ruleParameterList )
                    {
                    // InternalBasicsParser.g:1913:2: ( ruleParameterList )
                    // InternalBasicsParser.g:1914:3: ruleParameterList
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
                    // InternalBasicsParser.g:1919:2: ( ruleParameterStruct )
                    {
                    // InternalBasicsParser.g:1919:2: ( ruleParameterStruct )
                    // InternalBasicsParser.g:1920:3: ruleParameterStruct
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
    // InternalBasicsParser.g:1929:1: rule__AbstractType__Alternatives : ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleSpecBaseRef ) | ( ruleArraySpecRef ) | ( rulechar ) | ( rulecharArray ) );
    public final void rule__AbstractType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:1933:1: ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleSpecBaseRef ) | ( ruleArraySpecRef ) | ( rulechar ) | ( rulecharArray ) )
            int alt4=33;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalBasicsParser.g:1934:2: ( rulebool )
                    {
                    // InternalBasicsParser.g:1934:2: ( rulebool )
                    // InternalBasicsParser.g:1935:3: rulebool
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
                    // InternalBasicsParser.g:1940:2: ( ruleint8 )
                    {
                    // InternalBasicsParser.g:1940:2: ( ruleint8 )
                    // InternalBasicsParser.g:1941:3: ruleint8
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
                    // InternalBasicsParser.g:1946:2: ( ruleuint8 )
                    {
                    // InternalBasicsParser.g:1946:2: ( ruleuint8 )
                    // InternalBasicsParser.g:1947:3: ruleuint8
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
                    // InternalBasicsParser.g:1952:2: ( ruleint16 )
                    {
                    // InternalBasicsParser.g:1952:2: ( ruleint16 )
                    // InternalBasicsParser.g:1953:3: ruleint16
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
                    // InternalBasicsParser.g:1958:2: ( ruleuint16 )
                    {
                    // InternalBasicsParser.g:1958:2: ( ruleuint16 )
                    // InternalBasicsParser.g:1959:3: ruleuint16
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
                    // InternalBasicsParser.g:1964:2: ( ruleint32 )
                    {
                    // InternalBasicsParser.g:1964:2: ( ruleint32 )
                    // InternalBasicsParser.g:1965:3: ruleint32
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
                    // InternalBasicsParser.g:1970:2: ( ruleuint32 )
                    {
                    // InternalBasicsParser.g:1970:2: ( ruleuint32 )
                    // InternalBasicsParser.g:1971:3: ruleuint32
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
                    // InternalBasicsParser.g:1976:2: ( ruleint64 )
                    {
                    // InternalBasicsParser.g:1976:2: ( ruleint64 )
                    // InternalBasicsParser.g:1977:3: ruleint64
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
                    // InternalBasicsParser.g:1982:2: ( ruleuint64 )
                    {
                    // InternalBasicsParser.g:1982:2: ( ruleuint64 )
                    // InternalBasicsParser.g:1983:3: ruleuint64
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
                    // InternalBasicsParser.g:1988:2: ( rulefloat32 )
                    {
                    // InternalBasicsParser.g:1988:2: ( rulefloat32 )
                    // InternalBasicsParser.g:1989:3: rulefloat32
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
                    // InternalBasicsParser.g:1994:2: ( rulefloat64 )
                    {
                    // InternalBasicsParser.g:1994:2: ( rulefloat64 )
                    // InternalBasicsParser.g:1995:3: rulefloat64
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
                    // InternalBasicsParser.g:2000:2: ( rulestring0 )
                    {
                    // InternalBasicsParser.g:2000:2: ( rulestring0 )
                    // InternalBasicsParser.g:2001:3: rulestring0
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
                    // InternalBasicsParser.g:2006:2: ( rulebyte )
                    {
                    // InternalBasicsParser.g:2006:2: ( rulebyte )
                    // InternalBasicsParser.g:2007:3: rulebyte
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
                    // InternalBasicsParser.g:2012:2: ( ruletime )
                    {
                    // InternalBasicsParser.g:2012:2: ( ruletime )
                    // InternalBasicsParser.g:2013:3: ruletime
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
                    // InternalBasicsParser.g:2018:2: ( ruleduration )
                    {
                    // InternalBasicsParser.g:2018:2: ( ruleduration )
                    // InternalBasicsParser.g:2019:3: ruleduration
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
                    // InternalBasicsParser.g:2024:2: ( ruleHeader )
                    {
                    // InternalBasicsParser.g:2024:2: ( ruleHeader )
                    // InternalBasicsParser.g:2025:3: ruleHeader
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
                    // InternalBasicsParser.g:2030:2: ( ruleboolArray )
                    {
                    // InternalBasicsParser.g:2030:2: ( ruleboolArray )
                    // InternalBasicsParser.g:2031:3: ruleboolArray
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
                    // InternalBasicsParser.g:2036:2: ( ruleint8Array )
                    {
                    // InternalBasicsParser.g:2036:2: ( ruleint8Array )
                    // InternalBasicsParser.g:2037:3: ruleint8Array
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
                    // InternalBasicsParser.g:2042:2: ( ruleuint8Array )
                    {
                    // InternalBasicsParser.g:2042:2: ( ruleuint8Array )
                    // InternalBasicsParser.g:2043:3: ruleuint8Array
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
                    // InternalBasicsParser.g:2048:2: ( ruleint16Array )
                    {
                    // InternalBasicsParser.g:2048:2: ( ruleint16Array )
                    // InternalBasicsParser.g:2049:3: ruleint16Array
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
                    // InternalBasicsParser.g:2054:2: ( ruleuint16Array )
                    {
                    // InternalBasicsParser.g:2054:2: ( ruleuint16Array )
                    // InternalBasicsParser.g:2055:3: ruleuint16Array
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
                    // InternalBasicsParser.g:2060:2: ( ruleint32Array )
                    {
                    // InternalBasicsParser.g:2060:2: ( ruleint32Array )
                    // InternalBasicsParser.g:2061:3: ruleint32Array
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
                    // InternalBasicsParser.g:2066:2: ( ruleuint32Array )
                    {
                    // InternalBasicsParser.g:2066:2: ( ruleuint32Array )
                    // InternalBasicsParser.g:2067:3: ruleuint32Array
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
                    // InternalBasicsParser.g:2072:2: ( ruleint64Array )
                    {
                    // InternalBasicsParser.g:2072:2: ( ruleint64Array )
                    // InternalBasicsParser.g:2073:3: ruleint64Array
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
                    // InternalBasicsParser.g:2078:2: ( ruleuint64Array )
                    {
                    // InternalBasicsParser.g:2078:2: ( ruleuint64Array )
                    // InternalBasicsParser.g:2079:3: ruleuint64Array
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
                    // InternalBasicsParser.g:2084:2: ( rulefloat32Array )
                    {
                    // InternalBasicsParser.g:2084:2: ( rulefloat32Array )
                    // InternalBasicsParser.g:2085:3: rulefloat32Array
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
                    // InternalBasicsParser.g:2090:2: ( rulefloat64Array )
                    {
                    // InternalBasicsParser.g:2090:2: ( rulefloat64Array )
                    // InternalBasicsParser.g:2091:3: rulefloat64Array
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
                    // InternalBasicsParser.g:2096:2: ( rulestring0Array )
                    {
                    // InternalBasicsParser.g:2096:2: ( rulestring0Array )
                    // InternalBasicsParser.g:2097:3: rulestring0Array
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
                    // InternalBasicsParser.g:2102:2: ( rulebyteArray )
                    {
                    // InternalBasicsParser.g:2102:2: ( rulebyteArray )
                    // InternalBasicsParser.g:2103:3: rulebyteArray
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
                    // InternalBasicsParser.g:2108:2: ( ruleSpecBaseRef )
                    {
                    // InternalBasicsParser.g:2108:2: ( ruleSpecBaseRef )
                    // InternalBasicsParser.g:2109:3: ruleSpecBaseRef
                    {
                     before(grammarAccess.getAbstractTypeAccess().getSpecBaseRefParserRuleCall_29()); 
                    pushFollow(FOLLOW_2);
                    ruleSpecBaseRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getSpecBaseRefParserRuleCall_29()); 

                    }


                    }
                    break;
                case 31 :
                    // InternalBasicsParser.g:2114:2: ( ruleArraySpecRef )
                    {
                    // InternalBasicsParser.g:2114:2: ( ruleArraySpecRef )
                    // InternalBasicsParser.g:2115:3: ruleArraySpecRef
                    {
                     before(grammarAccess.getAbstractTypeAccess().getArraySpecRefParserRuleCall_30()); 
                    pushFollow(FOLLOW_2);
                    ruleArraySpecRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getArraySpecRefParserRuleCall_30()); 

                    }


                    }
                    break;
                case 32 :
                    // InternalBasicsParser.g:2120:2: ( rulechar )
                    {
                    // InternalBasicsParser.g:2120:2: ( rulechar )
                    // InternalBasicsParser.g:2121:3: rulechar
                    {
                     before(grammarAccess.getAbstractTypeAccess().getCharParserRuleCall_31()); 
                    pushFollow(FOLLOW_2);
                    rulechar();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getCharParserRuleCall_31()); 

                    }


                    }
                    break;
                case 33 :
                    // InternalBasicsParser.g:2126:2: ( rulecharArray )
                    {
                    // InternalBasicsParser.g:2126:2: ( rulecharArray )
                    // InternalBasicsParser.g:2127:3: rulecharArray
                    {
                     before(grammarAccess.getAbstractTypeAccess().getCharArrayParserRuleCall_32()); 
                    pushFollow(FOLLOW_2);
                    rulecharArray();

                    state._fsp--;

                     after(grammarAccess.getAbstractTypeAccess().getCharArrayParserRuleCall_32()); 

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
    // InternalBasicsParser.g:2136:1: rule__KEYWORD__Alternatives : ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) );
    public final void rule__KEYWORD__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2140:1: ( ( Goal ) | ( Message ) | ( Result ) | ( Feedback ) | ( Name ) | ( Value ) | ( Service ) | ( Type ) | ( Action ) | ( Duration ) | ( Time ) )
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
                    // InternalBasicsParser.g:2141:2: ( Goal )
                    {
                    // InternalBasicsParser.g:2141:2: ( Goal )
                    // InternalBasicsParser.g:2142:3: Goal
                    {
                     before(grammarAccess.getKEYWORDAccess().getGoalKeyword_0()); 
                    match(input,Goal,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getGoalKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicsParser.g:2147:2: ( Message )
                    {
                    // InternalBasicsParser.g:2147:2: ( Message )
                    // InternalBasicsParser.g:2148:3: Message
                    {
                     before(grammarAccess.getKEYWORDAccess().getMessageKeyword_1()); 
                    match(input,Message,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getMessageKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalBasicsParser.g:2153:2: ( Result )
                    {
                    // InternalBasicsParser.g:2153:2: ( Result )
                    // InternalBasicsParser.g:2154:3: Result
                    {
                     before(grammarAccess.getKEYWORDAccess().getResultKeyword_2()); 
                    match(input,Result,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getResultKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalBasicsParser.g:2159:2: ( Feedback )
                    {
                    // InternalBasicsParser.g:2159:2: ( Feedback )
                    // InternalBasicsParser.g:2160:3: Feedback
                    {
                     before(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3()); 
                    match(input,Feedback,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalBasicsParser.g:2165:2: ( Name )
                    {
                    // InternalBasicsParser.g:2165:2: ( Name )
                    // InternalBasicsParser.g:2166:3: Name
                    {
                     before(grammarAccess.getKEYWORDAccess().getNameKeyword_4()); 
                    match(input,Name,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getNameKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalBasicsParser.g:2171:2: ( Value )
                    {
                    // InternalBasicsParser.g:2171:2: ( Value )
                    // InternalBasicsParser.g:2172:3: Value
                    {
                     before(grammarAccess.getKEYWORDAccess().getValueKeyword_5()); 
                    match(input,Value,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getValueKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalBasicsParser.g:2177:2: ( Service )
                    {
                    // InternalBasicsParser.g:2177:2: ( Service )
                    // InternalBasicsParser.g:2178:3: Service
                    {
                     before(grammarAccess.getKEYWORDAccess().getServiceKeyword_6()); 
                    match(input,Service,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getServiceKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalBasicsParser.g:2183:2: ( Type )
                    {
                    // InternalBasicsParser.g:2183:2: ( Type )
                    // InternalBasicsParser.g:2184:3: Type
                    {
                     before(grammarAccess.getKEYWORDAccess().getTypeKeyword_7()); 
                    match(input,Type,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getTypeKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalBasicsParser.g:2189:2: ( Action )
                    {
                    // InternalBasicsParser.g:2189:2: ( Action )
                    // InternalBasicsParser.g:2190:3: Action
                    {
                     before(grammarAccess.getKEYWORDAccess().getActionKeyword_8()); 
                    match(input,Action,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getActionKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalBasicsParser.g:2195:2: ( Duration )
                    {
                    // InternalBasicsParser.g:2195:2: ( Duration )
                    // InternalBasicsParser.g:2196:3: Duration
                    {
                     before(grammarAccess.getKEYWORDAccess().getDurationKeyword_9()); 
                    match(input,Duration,FOLLOW_2); 
                     after(grammarAccess.getKEYWORDAccess().getDurationKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalBasicsParser.g:2201:2: ( Time )
                    {
                    // InternalBasicsParser.g:2201:2: ( Time )
                    // InternalBasicsParser.g:2202:3: Time
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
    // InternalBasicsParser.g:2211:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2215:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalBasicsParser.g:2216:2: ( RULE_STRING )
                    {
                    // InternalBasicsParser.g:2216:2: ( RULE_STRING )
                    // InternalBasicsParser.g:2217:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBasicsParser.g:2222:2: ( RULE_ID )
                    {
                    // InternalBasicsParser.g:2222:2: ( RULE_ID )
                    // InternalBasicsParser.g:2223:3: RULE_ID
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
    // InternalBasicsParser.g:2232:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2236:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalBasicsParser.g:2237:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
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
    // InternalBasicsParser.g:2244:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2248:1: ( ( () ) )
            // InternalBasicsParser.g:2249:1: ( () )
            {
            // InternalBasicsParser.g:2249:1: ( () )
            // InternalBasicsParser.g:2250:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 
            // InternalBasicsParser.g:2251:2: ()
            // InternalBasicsParser.g:2251:3: 
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
    // InternalBasicsParser.g:2259:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2263:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalBasicsParser.g:2264:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
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
    // InternalBasicsParser.g:2271:1: rule__GlobalNamespace__Group__1__Impl : ( GlobalNamespace ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2275:1: ( ( GlobalNamespace ) )
            // InternalBasicsParser.g:2276:1: ( GlobalNamespace )
            {
            // InternalBasicsParser.g:2276:1: ( GlobalNamespace )
            // InternalBasicsParser.g:2277:2: GlobalNamespace
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
    // InternalBasicsParser.g:2286:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2290:1: ( rule__GlobalNamespace__Group__2__Impl )
            // InternalBasicsParser.g:2291:2: rule__GlobalNamespace__Group__2__Impl
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
    // InternalBasicsParser.g:2297:1: rule__GlobalNamespace__Group__2__Impl : ( ( rule__GlobalNamespace__Group_2__0 )? ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2301:1: ( ( ( rule__GlobalNamespace__Group_2__0 )? ) )
            // InternalBasicsParser.g:2302:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            {
            // InternalBasicsParser.g:2302:1: ( ( rule__GlobalNamespace__Group_2__0 )? )
            // InternalBasicsParser.g:2303:2: ( rule__GlobalNamespace__Group_2__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2()); 
            // InternalBasicsParser.g:2304:2: ( rule__GlobalNamespace__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LeftSquareBracket) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalBasicsParser.g:2304:3: rule__GlobalNamespace__Group_2__0
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
    // InternalBasicsParser.g:2313:1: rule__GlobalNamespace__Group_2__0 : rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 ;
    public final void rule__GlobalNamespace__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2317:1: ( rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1 )
            // InternalBasicsParser.g:2318:2: rule__GlobalNamespace__Group_2__0__Impl rule__GlobalNamespace__Group_2__1
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
    // InternalBasicsParser.g:2325:1: rule__GlobalNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2329:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:2330:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:2330:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:2331:2: LeftSquareBracket
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
    // InternalBasicsParser.g:2340:1: rule__GlobalNamespace__Group_2__1 : rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 ;
    public final void rule__GlobalNamespace__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2344:1: ( rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2 )
            // InternalBasicsParser.g:2345:2: rule__GlobalNamespace__Group_2__1__Impl rule__GlobalNamespace__Group_2__2
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
    // InternalBasicsParser.g:2352:1: rule__GlobalNamespace__Group_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2356:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) ) )
            // InternalBasicsParser.g:2357:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:2357:1: ( ( rule__GlobalNamespace__PartsAssignment_2_1 ) )
            // InternalBasicsParser.g:2358:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1()); 
            // InternalBasicsParser.g:2359:2: ( rule__GlobalNamespace__PartsAssignment_2_1 )
            // InternalBasicsParser.g:2359:3: rule__GlobalNamespace__PartsAssignment_2_1
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
    // InternalBasicsParser.g:2367:1: rule__GlobalNamespace__Group_2__2 : rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 ;
    public final void rule__GlobalNamespace__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2371:1: ( rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3 )
            // InternalBasicsParser.g:2372:2: rule__GlobalNamespace__Group_2__2__Impl rule__GlobalNamespace__Group_2__3
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
    // InternalBasicsParser.g:2379:1: rule__GlobalNamespace__Group_2__2__Impl : ( ( rule__GlobalNamespace__Group_2_2__0 )* ) ;
    public final void rule__GlobalNamespace__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2383:1: ( ( ( rule__GlobalNamespace__Group_2_2__0 )* ) )
            // InternalBasicsParser.g:2384:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            {
            // InternalBasicsParser.g:2384:1: ( ( rule__GlobalNamespace__Group_2_2__0 )* )
            // InternalBasicsParser.g:2385:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2()); 
            // InternalBasicsParser.g:2386:2: ( rule__GlobalNamespace__Group_2_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalBasicsParser.g:2386:3: rule__GlobalNamespace__Group_2_2__0
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
    // InternalBasicsParser.g:2394:1: rule__GlobalNamespace__Group_2__3 : rule__GlobalNamespace__Group_2__3__Impl ;
    public final void rule__GlobalNamespace__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2398:1: ( rule__GlobalNamespace__Group_2__3__Impl )
            // InternalBasicsParser.g:2399:2: rule__GlobalNamespace__Group_2__3__Impl
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
    // InternalBasicsParser.g:2405:1: rule__GlobalNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__GlobalNamespace__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2409:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:2410:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:2410:1: ( RightSquareBracket )
            // InternalBasicsParser.g:2411:2: RightSquareBracket
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
    // InternalBasicsParser.g:2421:1: rule__GlobalNamespace__Group_2_2__0 : rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 ;
    public final void rule__GlobalNamespace__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2425:1: ( rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1 )
            // InternalBasicsParser.g:2426:2: rule__GlobalNamespace__Group_2_2__0__Impl rule__GlobalNamespace__Group_2_2__1
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
    // InternalBasicsParser.g:2433:1: rule__GlobalNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__GlobalNamespace__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2437:1: ( ( Comma ) )
            // InternalBasicsParser.g:2438:1: ( Comma )
            {
            // InternalBasicsParser.g:2438:1: ( Comma )
            // InternalBasicsParser.g:2439:2: Comma
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
    // InternalBasicsParser.g:2448:1: rule__GlobalNamespace__Group_2_2__1 : rule__GlobalNamespace__Group_2_2__1__Impl ;
    public final void rule__GlobalNamespace__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2452:1: ( rule__GlobalNamespace__Group_2_2__1__Impl )
            // InternalBasicsParser.g:2453:2: rule__GlobalNamespace__Group_2_2__1__Impl
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
    // InternalBasicsParser.g:2459:1: rule__GlobalNamespace__Group_2_2__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__GlobalNamespace__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2463:1: ( ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalBasicsParser.g:2464:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalBasicsParser.g:2464:1: ( ( rule__GlobalNamespace__PartsAssignment_2_2_1 ) )
            // InternalBasicsParser.g:2465:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1()); 
            // InternalBasicsParser.g:2466:2: ( rule__GlobalNamespace__PartsAssignment_2_2_1 )
            // InternalBasicsParser.g:2466:3: rule__GlobalNamespace__PartsAssignment_2_2_1
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
    // InternalBasicsParser.g:2475:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2479:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalBasicsParser.g:2480:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
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
    // InternalBasicsParser.g:2487:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2491:1: ( ( () ) )
            // InternalBasicsParser.g:2492:1: ( () )
            {
            // InternalBasicsParser.g:2492:1: ( () )
            // InternalBasicsParser.g:2493:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 
            // InternalBasicsParser.g:2494:2: ()
            // InternalBasicsParser.g:2494:3: 
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
    // InternalBasicsParser.g:2502:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2506:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalBasicsParser.g:2507:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
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
    // InternalBasicsParser.g:2514:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( RelativeNamespace ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2518:1: ( ( RelativeNamespace ) )
            // InternalBasicsParser.g:2519:1: ( RelativeNamespace )
            {
            // InternalBasicsParser.g:2519:1: ( RelativeNamespace )
            // InternalBasicsParser.g:2520:2: RelativeNamespace
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
    // InternalBasicsParser.g:2529:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2533:1: ( rule__RelativeNamespace_Impl__Group__2__Impl )
            // InternalBasicsParser.g:2534:2: rule__RelativeNamespace_Impl__Group__2__Impl
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
    // InternalBasicsParser.g:2540:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2544:1: ( ( ( rule__RelativeNamespace_Impl__Group_2__0 )? ) )
            // InternalBasicsParser.g:2545:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            {
            // InternalBasicsParser.g:2545:1: ( ( rule__RelativeNamespace_Impl__Group_2__0 )? )
            // InternalBasicsParser.g:2546:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2()); 
            // InternalBasicsParser.g:2547:2: ( rule__RelativeNamespace_Impl__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==LeftSquareBracket) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalBasicsParser.g:2547:3: rule__RelativeNamespace_Impl__Group_2__0
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
    // InternalBasicsParser.g:2556:1: rule__RelativeNamespace_Impl__Group_2__0 : rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2560:1: ( rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1 )
            // InternalBasicsParser.g:2561:2: rule__RelativeNamespace_Impl__Group_2__0__Impl rule__RelativeNamespace_Impl__Group_2__1
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
    // InternalBasicsParser.g:2568:1: rule__RelativeNamespace_Impl__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2572:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:2573:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:2573:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:2574:2: LeftSquareBracket
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
    // InternalBasicsParser.g:2583:1: rule__RelativeNamespace_Impl__Group_2__1 : rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 ;
    public final void rule__RelativeNamespace_Impl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2587:1: ( rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2 )
            // InternalBasicsParser.g:2588:2: rule__RelativeNamespace_Impl__Group_2__1__Impl rule__RelativeNamespace_Impl__Group_2__2
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
    // InternalBasicsParser.g:2595:1: rule__RelativeNamespace_Impl__Group_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2599:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) ) )
            // InternalBasicsParser.g:2600:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:2600:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 ) )
            // InternalBasicsParser.g:2601:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1()); 
            // InternalBasicsParser.g:2602:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_1 )
            // InternalBasicsParser.g:2602:3: rule__RelativeNamespace_Impl__PartsAssignment_2_1
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
    // InternalBasicsParser.g:2610:1: rule__RelativeNamespace_Impl__Group_2__2 : rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 ;
    public final void rule__RelativeNamespace_Impl__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2614:1: ( rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3 )
            // InternalBasicsParser.g:2615:2: rule__RelativeNamespace_Impl__Group_2__2__Impl rule__RelativeNamespace_Impl__Group_2__3
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
    // InternalBasicsParser.g:2622:1: rule__RelativeNamespace_Impl__Group_2__2__Impl : ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2626:1: ( ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* ) )
            // InternalBasicsParser.g:2627:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            {
            // InternalBasicsParser.g:2627:1: ( ( rule__RelativeNamespace_Impl__Group_2_2__0 )* )
            // InternalBasicsParser.g:2628:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2()); 
            // InternalBasicsParser.g:2629:2: ( rule__RelativeNamespace_Impl__Group_2_2__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalBasicsParser.g:2629:3: rule__RelativeNamespace_Impl__Group_2_2__0
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
    // InternalBasicsParser.g:2637:1: rule__RelativeNamespace_Impl__Group_2__3 : rule__RelativeNamespace_Impl__Group_2__3__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2641:1: ( rule__RelativeNamespace_Impl__Group_2__3__Impl )
            // InternalBasicsParser.g:2642:2: rule__RelativeNamespace_Impl__Group_2__3__Impl
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
    // InternalBasicsParser.g:2648:1: rule__RelativeNamespace_Impl__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2652:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:2653:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:2653:1: ( RightSquareBracket )
            // InternalBasicsParser.g:2654:2: RightSquareBracket
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
    // InternalBasicsParser.g:2664:1: rule__RelativeNamespace_Impl__Group_2_2__0 : rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2668:1: ( rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1 )
            // InternalBasicsParser.g:2669:2: rule__RelativeNamespace_Impl__Group_2_2__0__Impl rule__RelativeNamespace_Impl__Group_2_2__1
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
    // InternalBasicsParser.g:2676:1: rule__RelativeNamespace_Impl__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2680:1: ( ( Comma ) )
            // InternalBasicsParser.g:2681:1: ( Comma )
            {
            // InternalBasicsParser.g:2681:1: ( Comma )
            // InternalBasicsParser.g:2682:2: Comma
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
    // InternalBasicsParser.g:2691:1: rule__RelativeNamespace_Impl__Group_2_2__1 : rule__RelativeNamespace_Impl__Group_2_2__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2695:1: ( rule__RelativeNamespace_Impl__Group_2_2__1__Impl )
            // InternalBasicsParser.g:2696:2: rule__RelativeNamespace_Impl__Group_2_2__1__Impl
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
    // InternalBasicsParser.g:2702:1: rule__RelativeNamespace_Impl__Group_2_2__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2706:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) ) )
            // InternalBasicsParser.g:2707:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            {
            // InternalBasicsParser.g:2707:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 ) )
            // InternalBasicsParser.g:2708:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1()); 
            // InternalBasicsParser.g:2709:2: ( rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 )
            // InternalBasicsParser.g:2709:3: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1
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
    // InternalBasicsParser.g:2718:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2722:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalBasicsParser.g:2723:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
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
    // InternalBasicsParser.g:2730:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2734:1: ( ( () ) )
            // InternalBasicsParser.g:2735:1: ( () )
            {
            // InternalBasicsParser.g:2735:1: ( () )
            // InternalBasicsParser.g:2736:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 
            // InternalBasicsParser.g:2737:2: ()
            // InternalBasicsParser.g:2737:3: 
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
    // InternalBasicsParser.g:2745:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2749:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalBasicsParser.g:2750:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
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
    // InternalBasicsParser.g:2757:1: rule__PrivateNamespace__Group__1__Impl : ( PrivateNamespace ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2761:1: ( ( PrivateNamespace ) )
            // InternalBasicsParser.g:2762:1: ( PrivateNamespace )
            {
            // InternalBasicsParser.g:2762:1: ( PrivateNamespace )
            // InternalBasicsParser.g:2763:2: PrivateNamespace
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
    // InternalBasicsParser.g:2772:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2776:1: ( rule__PrivateNamespace__Group__2__Impl )
            // InternalBasicsParser.g:2777:2: rule__PrivateNamespace__Group__2__Impl
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
    // InternalBasicsParser.g:2783:1: rule__PrivateNamespace__Group__2__Impl : ( ( rule__PrivateNamespace__Group_2__0 )? ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2787:1: ( ( ( rule__PrivateNamespace__Group_2__0 )? ) )
            // InternalBasicsParser.g:2788:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            {
            // InternalBasicsParser.g:2788:1: ( ( rule__PrivateNamespace__Group_2__0 )? )
            // InternalBasicsParser.g:2789:2: ( rule__PrivateNamespace__Group_2__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2()); 
            // InternalBasicsParser.g:2790:2: ( rule__PrivateNamespace__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==LeftSquareBracket) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalBasicsParser.g:2790:3: rule__PrivateNamespace__Group_2__0
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
    // InternalBasicsParser.g:2799:1: rule__PrivateNamespace__Group_2__0 : rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 ;
    public final void rule__PrivateNamespace__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2803:1: ( rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1 )
            // InternalBasicsParser.g:2804:2: rule__PrivateNamespace__Group_2__0__Impl rule__PrivateNamespace__Group_2__1
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
    // InternalBasicsParser.g:2811:1: rule__PrivateNamespace__Group_2__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2815:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:2816:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:2816:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:2817:2: LeftSquareBracket
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
    // InternalBasicsParser.g:2826:1: rule__PrivateNamespace__Group_2__1 : rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 ;
    public final void rule__PrivateNamespace__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2830:1: ( rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2 )
            // InternalBasicsParser.g:2831:2: rule__PrivateNamespace__Group_2__1__Impl rule__PrivateNamespace__Group_2__2
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
    // InternalBasicsParser.g:2838:1: rule__PrivateNamespace__Group_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2842:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) ) )
            // InternalBasicsParser.g:2843:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:2843:1: ( ( rule__PrivateNamespace__PartsAssignment_2_1 ) )
            // InternalBasicsParser.g:2844:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1()); 
            // InternalBasicsParser.g:2845:2: ( rule__PrivateNamespace__PartsAssignment_2_1 )
            // InternalBasicsParser.g:2845:3: rule__PrivateNamespace__PartsAssignment_2_1
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
    // InternalBasicsParser.g:2853:1: rule__PrivateNamespace__Group_2__2 : rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 ;
    public final void rule__PrivateNamespace__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2857:1: ( rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3 )
            // InternalBasicsParser.g:2858:2: rule__PrivateNamespace__Group_2__2__Impl rule__PrivateNamespace__Group_2__3
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
    // InternalBasicsParser.g:2865:1: rule__PrivateNamespace__Group_2__2__Impl : ( ( rule__PrivateNamespace__Group_2_2__0 )* ) ;
    public final void rule__PrivateNamespace__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2869:1: ( ( ( rule__PrivateNamespace__Group_2_2__0 )* ) )
            // InternalBasicsParser.g:2870:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            {
            // InternalBasicsParser.g:2870:1: ( ( rule__PrivateNamespace__Group_2_2__0 )* )
            // InternalBasicsParser.g:2871:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2()); 
            // InternalBasicsParser.g:2872:2: ( rule__PrivateNamespace__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalBasicsParser.g:2872:3: rule__PrivateNamespace__Group_2_2__0
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
    // InternalBasicsParser.g:2880:1: rule__PrivateNamespace__Group_2__3 : rule__PrivateNamespace__Group_2__3__Impl ;
    public final void rule__PrivateNamespace__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2884:1: ( rule__PrivateNamespace__Group_2__3__Impl )
            // InternalBasicsParser.g:2885:2: rule__PrivateNamespace__Group_2__3__Impl
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
    // InternalBasicsParser.g:2891:1: rule__PrivateNamespace__Group_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__PrivateNamespace__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2895:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:2896:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:2896:1: ( RightSquareBracket )
            // InternalBasicsParser.g:2897:2: RightSquareBracket
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
    // InternalBasicsParser.g:2907:1: rule__PrivateNamespace__Group_2_2__0 : rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 ;
    public final void rule__PrivateNamespace__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2911:1: ( rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1 )
            // InternalBasicsParser.g:2912:2: rule__PrivateNamespace__Group_2_2__0__Impl rule__PrivateNamespace__Group_2_2__1
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
    // InternalBasicsParser.g:2919:1: rule__PrivateNamespace__Group_2_2__0__Impl : ( Comma ) ;
    public final void rule__PrivateNamespace__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2923:1: ( ( Comma ) )
            // InternalBasicsParser.g:2924:1: ( Comma )
            {
            // InternalBasicsParser.g:2924:1: ( Comma )
            // InternalBasicsParser.g:2925:2: Comma
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
    // InternalBasicsParser.g:2934:1: rule__PrivateNamespace__Group_2_2__1 : rule__PrivateNamespace__Group_2_2__1__Impl ;
    public final void rule__PrivateNamespace__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2938:1: ( rule__PrivateNamespace__Group_2_2__1__Impl )
            // InternalBasicsParser.g:2939:2: rule__PrivateNamespace__Group_2_2__1__Impl
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
    // InternalBasicsParser.g:2945:1: rule__PrivateNamespace__Group_2_2__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) ;
    public final void rule__PrivateNamespace__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2949:1: ( ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) ) )
            // InternalBasicsParser.g:2950:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            {
            // InternalBasicsParser.g:2950:1: ( ( rule__PrivateNamespace__PartsAssignment_2_2_1 ) )
            // InternalBasicsParser.g:2951:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1()); 
            // InternalBasicsParser.g:2952:2: ( rule__PrivateNamespace__PartsAssignment_2_2_1 )
            // InternalBasicsParser.g:2952:3: rule__PrivateNamespace__PartsAssignment_2_2_1
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
    // InternalBasicsParser.g:2961:1: rule__ParameterListType__Group__0 : rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 ;
    public final void rule__ParameterListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2965:1: ( rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 )
            // InternalBasicsParser.g:2966:2: rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1
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
    // InternalBasicsParser.g:2973:1: rule__ParameterListType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2977:1: ( ( () ) )
            // InternalBasicsParser.g:2978:1: ( () )
            {
            // InternalBasicsParser.g:2978:1: ( () )
            // InternalBasicsParser.g:2979:2: ()
            {
             before(grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0()); 
            // InternalBasicsParser.g:2980:2: ()
            // InternalBasicsParser.g:2980:3: 
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
    // InternalBasicsParser.g:2988:1: rule__ParameterListType__Group__1 : rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 ;
    public final void rule__ParameterListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:2992:1: ( rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 )
            // InternalBasicsParser.g:2993:2: rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2
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
    // InternalBasicsParser.g:3000:1: rule__ParameterListType__Group__1__Impl : ( List ) ;
    public final void rule__ParameterListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3004:1: ( ( List ) )
            // InternalBasicsParser.g:3005:1: ( List )
            {
            // InternalBasicsParser.g:3005:1: ( List )
            // InternalBasicsParser.g:3006:2: List
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
    // InternalBasicsParser.g:3015:1: rule__ParameterListType__Group__2 : rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 ;
    public final void rule__ParameterListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3019:1: ( rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 )
            // InternalBasicsParser.g:3020:2: rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3
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
    // InternalBasicsParser.g:3027:1: rule__ParameterListType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3031:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:3032:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:3032:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:3033:2: LeftSquareBracket
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
    // InternalBasicsParser.g:3042:1: rule__ParameterListType__Group__3 : rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 ;
    public final void rule__ParameterListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3046:1: ( rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 )
            // InternalBasicsParser.g:3047:2: rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4
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
    // InternalBasicsParser.g:3054:1: rule__ParameterListType__Group__3__Impl : ( ( rule__ParameterListType__SequenceAssignment_3 ) ) ;
    public final void rule__ParameterListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3058:1: ( ( ( rule__ParameterListType__SequenceAssignment_3 ) ) )
            // InternalBasicsParser.g:3059:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            {
            // InternalBasicsParser.g:3059:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            // InternalBasicsParser.g:3060:2: ( rule__ParameterListType__SequenceAssignment_3 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3()); 
            // InternalBasicsParser.g:3061:2: ( rule__ParameterListType__SequenceAssignment_3 )
            // InternalBasicsParser.g:3061:3: rule__ParameterListType__SequenceAssignment_3
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
    // InternalBasicsParser.g:3069:1: rule__ParameterListType__Group__4 : rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 ;
    public final void rule__ParameterListType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3073:1: ( rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 )
            // InternalBasicsParser.g:3074:2: rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5
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
    // InternalBasicsParser.g:3081:1: rule__ParameterListType__Group__4__Impl : ( ( rule__ParameterListType__Group_4__0 )* ) ;
    public final void rule__ParameterListType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3085:1: ( ( ( rule__ParameterListType__Group_4__0 )* ) )
            // InternalBasicsParser.g:3086:1: ( ( rule__ParameterListType__Group_4__0 )* )
            {
            // InternalBasicsParser.g:3086:1: ( ( rule__ParameterListType__Group_4__0 )* )
            // InternalBasicsParser.g:3087:2: ( rule__ParameterListType__Group_4__0 )*
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup_4()); 
            // InternalBasicsParser.g:3088:2: ( rule__ParameterListType__Group_4__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comma) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalBasicsParser.g:3088:3: rule__ParameterListType__Group_4__0
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
    // InternalBasicsParser.g:3096:1: rule__ParameterListType__Group__5 : rule__ParameterListType__Group__5__Impl ;
    public final void rule__ParameterListType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3100:1: ( rule__ParameterListType__Group__5__Impl )
            // InternalBasicsParser.g:3101:2: rule__ParameterListType__Group__5__Impl
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
    // InternalBasicsParser.g:3107:1: rule__ParameterListType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterListType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3111:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:3112:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:3112:1: ( RightSquareBracket )
            // InternalBasicsParser.g:3113:2: RightSquareBracket
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
    // InternalBasicsParser.g:3123:1: rule__ParameterListType__Group_4__0 : rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 ;
    public final void rule__ParameterListType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3127:1: ( rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 )
            // InternalBasicsParser.g:3128:2: rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1
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
    // InternalBasicsParser.g:3135:1: rule__ParameterListType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterListType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3139:1: ( ( Comma ) )
            // InternalBasicsParser.g:3140:1: ( Comma )
            {
            // InternalBasicsParser.g:3140:1: ( Comma )
            // InternalBasicsParser.g:3141:2: Comma
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
    // InternalBasicsParser.g:3150:1: rule__ParameterListType__Group_4__1 : rule__ParameterListType__Group_4__1__Impl ;
    public final void rule__ParameterListType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3154:1: ( rule__ParameterListType__Group_4__1__Impl )
            // InternalBasicsParser.g:3155:2: rule__ParameterListType__Group_4__1__Impl
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
    // InternalBasicsParser.g:3161:1: rule__ParameterListType__Group_4__1__Impl : ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) ;
    public final void rule__ParameterListType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3165:1: ( ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) )
            // InternalBasicsParser.g:3166:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            {
            // InternalBasicsParser.g:3166:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            // InternalBasicsParser.g:3167:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1()); 
            // InternalBasicsParser.g:3168:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            // InternalBasicsParser.g:3168:3: rule__ParameterListType__SequenceAssignment_4_1
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
    // InternalBasicsParser.g:3177:1: rule__ParameterStructType__Group__0 : rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 ;
    public final void rule__ParameterStructType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3181:1: ( rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 )
            // InternalBasicsParser.g:3182:2: rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1
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
    // InternalBasicsParser.g:3189:1: rule__ParameterStructType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStructType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3193:1: ( ( () ) )
            // InternalBasicsParser.g:3194:1: ( () )
            {
            // InternalBasicsParser.g:3194:1: ( () )
            // InternalBasicsParser.g:3195:2: ()
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0()); 
            // InternalBasicsParser.g:3196:2: ()
            // InternalBasicsParser.g:3196:3: 
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
    // InternalBasicsParser.g:3204:1: rule__ParameterStructType__Group__1 : rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 ;
    public final void rule__ParameterStructType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3208:1: ( rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 )
            // InternalBasicsParser.g:3209:2: rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2
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
    // InternalBasicsParser.g:3216:1: rule__ParameterStructType__Group__1__Impl : ( Struct ) ;
    public final void rule__ParameterStructType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3220:1: ( ( Struct ) )
            // InternalBasicsParser.g:3221:1: ( Struct )
            {
            // InternalBasicsParser.g:3221:1: ( Struct )
            // InternalBasicsParser.g:3222:2: Struct
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
    // InternalBasicsParser.g:3231:1: rule__ParameterStructType__Group__2 : rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 ;
    public final void rule__ParameterStructType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3235:1: ( rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 )
            // InternalBasicsParser.g:3236:2: rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3
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
    // InternalBasicsParser.g:3243:1: rule__ParameterStructType__Group__2__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStructType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3247:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:3248:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:3248:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:3249:2: LeftSquareBracket
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
    // InternalBasicsParser.g:3258:1: rule__ParameterStructType__Group__3 : rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 ;
    public final void rule__ParameterStructType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3262:1: ( rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 )
            // InternalBasicsParser.g:3263:2: rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4
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
    // InternalBasicsParser.g:3270:1: rule__ParameterStructType__Group__3__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) ;
    public final void rule__ParameterStructType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3274:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) )
            // InternalBasicsParser.g:3275:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            {
            // InternalBasicsParser.g:3275:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            // InternalBasicsParser.g:3276:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3()); 
            // InternalBasicsParser.g:3277:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            // InternalBasicsParser.g:3277:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_3
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
    // InternalBasicsParser.g:3285:1: rule__ParameterStructType__Group__4 : rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 ;
    public final void rule__ParameterStructType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3289:1: ( rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 )
            // InternalBasicsParser.g:3290:2: rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5
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
    // InternalBasicsParser.g:3297:1: rule__ParameterStructType__Group__4__Impl : ( ( rule__ParameterStructType__Group_4__0 )* ) ;
    public final void rule__ParameterStructType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3301:1: ( ( ( rule__ParameterStructType__Group_4__0 )* ) )
            // InternalBasicsParser.g:3302:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            {
            // InternalBasicsParser.g:3302:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            // InternalBasicsParser.g:3303:2: ( rule__ParameterStructType__Group_4__0 )*
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup_4()); 
            // InternalBasicsParser.g:3304:2: ( rule__ParameterStructType__Group_4__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Comma) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalBasicsParser.g:3304:3: rule__ParameterStructType__Group_4__0
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
    // InternalBasicsParser.g:3312:1: rule__ParameterStructType__Group__5 : rule__ParameterStructType__Group__5__Impl ;
    public final void rule__ParameterStructType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3316:1: ( rule__ParameterStructType__Group__5__Impl )
            // InternalBasicsParser.g:3317:2: rule__ParameterStructType__Group__5__Impl
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
    // InternalBasicsParser.g:3323:1: rule__ParameterStructType__Group__5__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStructType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3327:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:3328:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:3328:1: ( RightSquareBracket )
            // InternalBasicsParser.g:3329:2: RightSquareBracket
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
    // InternalBasicsParser.g:3339:1: rule__ParameterStructType__Group_4__0 : rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 ;
    public final void rule__ParameterStructType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3343:1: ( rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 )
            // InternalBasicsParser.g:3344:2: rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1
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
    // InternalBasicsParser.g:3351:1: rule__ParameterStructType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterStructType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3355:1: ( ( Comma ) )
            // InternalBasicsParser.g:3356:1: ( Comma )
            {
            // InternalBasicsParser.g:3356:1: ( Comma )
            // InternalBasicsParser.g:3357:2: Comma
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
    // InternalBasicsParser.g:3366:1: rule__ParameterStructType__Group_4__1 : rule__ParameterStructType__Group_4__1__Impl ;
    public final void rule__ParameterStructType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3370:1: ( rule__ParameterStructType__Group_4__1__Impl )
            // InternalBasicsParser.g:3371:2: rule__ParameterStructType__Group_4__1__Impl
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
    // InternalBasicsParser.g:3377:1: rule__ParameterStructType__Group_4__1__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) ;
    public final void rule__ParameterStructType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3381:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) )
            // InternalBasicsParser.g:3382:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            {
            // InternalBasicsParser.g:3382:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            // InternalBasicsParser.g:3383:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1()); 
            // InternalBasicsParser.g:3384:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            // InternalBasicsParser.g:3384:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1
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
    // InternalBasicsParser.g:3393:1: rule__ParameterIntegerType__Group__0 : rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 ;
    public final void rule__ParameterIntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3397:1: ( rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 )
            // InternalBasicsParser.g:3398:2: rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1
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
    // InternalBasicsParser.g:3405:1: rule__ParameterIntegerType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterIntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3409:1: ( ( () ) )
            // InternalBasicsParser.g:3410:1: ( () )
            {
            // InternalBasicsParser.g:3410:1: ( () )
            // InternalBasicsParser.g:3411:2: ()
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0()); 
            // InternalBasicsParser.g:3412:2: ()
            // InternalBasicsParser.g:3412:3: 
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
    // InternalBasicsParser.g:3420:1: rule__ParameterIntegerType__Group__1 : rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 ;
    public final void rule__ParameterIntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3424:1: ( rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 )
            // InternalBasicsParser.g:3425:2: rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2
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
    // InternalBasicsParser.g:3432:1: rule__ParameterIntegerType__Group__1__Impl : ( Integer ) ;
    public final void rule__ParameterIntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3436:1: ( ( Integer ) )
            // InternalBasicsParser.g:3437:1: ( Integer )
            {
            // InternalBasicsParser.g:3437:1: ( Integer )
            // InternalBasicsParser.g:3438:2: Integer
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
    // InternalBasicsParser.g:3447:1: rule__ParameterIntegerType__Group__2 : rule__ParameterIntegerType__Group__2__Impl ;
    public final void rule__ParameterIntegerType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3451:1: ( rule__ParameterIntegerType__Group__2__Impl )
            // InternalBasicsParser.g:3452:2: rule__ParameterIntegerType__Group__2__Impl
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
    // InternalBasicsParser.g:3458:1: rule__ParameterIntegerType__Group__2__Impl : ( ( rule__ParameterIntegerType__Group_2__0 )? ) ;
    public final void rule__ParameterIntegerType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3462:1: ( ( ( rule__ParameterIntegerType__Group_2__0 )? ) )
            // InternalBasicsParser.g:3463:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            {
            // InternalBasicsParser.g:3463:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            // InternalBasicsParser.g:3464:2: ( rule__ParameterIntegerType__Group_2__0 )?
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup_2()); 
            // InternalBasicsParser.g:3465:2: ( rule__ParameterIntegerType__Group_2__0 )?
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
                    // InternalBasicsParser.g:3465:3: rule__ParameterIntegerType__Group_2__0
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
    // InternalBasicsParser.g:3474:1: rule__ParameterIntegerType__Group_2__0 : rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 ;
    public final void rule__ParameterIntegerType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3478:1: ( rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 )
            // InternalBasicsParser.g:3479:2: rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1
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
    // InternalBasicsParser.g:3486:1: rule__ParameterIntegerType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterIntegerType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3490:1: ( ( Default ) )
            // InternalBasicsParser.g:3491:1: ( Default )
            {
            // InternalBasicsParser.g:3491:1: ( Default )
            // InternalBasicsParser.g:3492:2: Default
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
    // InternalBasicsParser.g:3501:1: rule__ParameterIntegerType__Group_2__1 : rule__ParameterIntegerType__Group_2__1__Impl ;
    public final void rule__ParameterIntegerType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3505:1: ( rule__ParameterIntegerType__Group_2__1__Impl )
            // InternalBasicsParser.g:3506:2: rule__ParameterIntegerType__Group_2__1__Impl
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
    // InternalBasicsParser.g:3512:1: rule__ParameterIntegerType__Group_2__1__Impl : ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterIntegerType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3516:1: ( ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) )
            // InternalBasicsParser.g:3517:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:3517:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            // InternalBasicsParser.g:3518:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1()); 
            // InternalBasicsParser.g:3519:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            // InternalBasicsParser.g:3519:3: rule__ParameterIntegerType__DefaultAssignment_2_1
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
    // InternalBasicsParser.g:3528:1: rule__ParameterStringType__Group__0 : rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 ;
    public final void rule__ParameterStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3532:1: ( rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 )
            // InternalBasicsParser.g:3533:2: rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1
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
    // InternalBasicsParser.g:3540:1: rule__ParameterStringType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3544:1: ( ( () ) )
            // InternalBasicsParser.g:3545:1: ( () )
            {
            // InternalBasicsParser.g:3545:1: ( () )
            // InternalBasicsParser.g:3546:2: ()
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 
            // InternalBasicsParser.g:3547:2: ()
            // InternalBasicsParser.g:3547:3: 
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
    // InternalBasicsParser.g:3555:1: rule__ParameterStringType__Group__1 : rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 ;
    public final void rule__ParameterStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3559:1: ( rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 )
            // InternalBasicsParser.g:3560:2: rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2
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
    // InternalBasicsParser.g:3567:1: rule__ParameterStringType__Group__1__Impl : ( String ) ;
    public final void rule__ParameterStringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3571:1: ( ( String ) )
            // InternalBasicsParser.g:3572:1: ( String )
            {
            // InternalBasicsParser.g:3572:1: ( String )
            // InternalBasicsParser.g:3573:2: String
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
    // InternalBasicsParser.g:3582:1: rule__ParameterStringType__Group__2 : rule__ParameterStringType__Group__2__Impl ;
    public final void rule__ParameterStringType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3586:1: ( rule__ParameterStringType__Group__2__Impl )
            // InternalBasicsParser.g:3587:2: rule__ParameterStringType__Group__2__Impl
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
    // InternalBasicsParser.g:3593:1: rule__ParameterStringType__Group__2__Impl : ( ( rule__ParameterStringType__Group_2__0 )? ) ;
    public final void rule__ParameterStringType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3597:1: ( ( ( rule__ParameterStringType__Group_2__0 )? ) )
            // InternalBasicsParser.g:3598:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            {
            // InternalBasicsParser.g:3598:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            // InternalBasicsParser.g:3599:2: ( rule__ParameterStringType__Group_2__0 )?
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup_2()); 
            // InternalBasicsParser.g:3600:2: ( rule__ParameterStringType__Group_2__0 )?
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
                    // InternalBasicsParser.g:3600:3: rule__ParameterStringType__Group_2__0
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
    // InternalBasicsParser.g:3609:1: rule__ParameterStringType__Group_2__0 : rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 ;
    public final void rule__ParameterStringType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3613:1: ( rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 )
            // InternalBasicsParser.g:3614:2: rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1
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
    // InternalBasicsParser.g:3621:1: rule__ParameterStringType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterStringType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3625:1: ( ( Default ) )
            // InternalBasicsParser.g:3626:1: ( Default )
            {
            // InternalBasicsParser.g:3626:1: ( Default )
            // InternalBasicsParser.g:3627:2: Default
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
    // InternalBasicsParser.g:3636:1: rule__ParameterStringType__Group_2__1 : rule__ParameterStringType__Group_2__1__Impl ;
    public final void rule__ParameterStringType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3640:1: ( rule__ParameterStringType__Group_2__1__Impl )
            // InternalBasicsParser.g:3641:2: rule__ParameterStringType__Group_2__1__Impl
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
    // InternalBasicsParser.g:3647:1: rule__ParameterStringType__Group_2__1__Impl : ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterStringType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3651:1: ( ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) )
            // InternalBasicsParser.g:3652:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:3652:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            // InternalBasicsParser.g:3653:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1()); 
            // InternalBasicsParser.g:3654:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            // InternalBasicsParser.g:3654:3: rule__ParameterStringType__DefaultAssignment_2_1
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
    // InternalBasicsParser.g:3663:1: rule__ParameterDoubleType__Group__0 : rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 ;
    public final void rule__ParameterDoubleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3667:1: ( rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 )
            // InternalBasicsParser.g:3668:2: rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1
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
    // InternalBasicsParser.g:3675:1: rule__ParameterDoubleType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDoubleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3679:1: ( ( () ) )
            // InternalBasicsParser.g:3680:1: ( () )
            {
            // InternalBasicsParser.g:3680:1: ( () )
            // InternalBasicsParser.g:3681:2: ()
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0()); 
            // InternalBasicsParser.g:3682:2: ()
            // InternalBasicsParser.g:3682:3: 
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
    // InternalBasicsParser.g:3690:1: rule__ParameterDoubleType__Group__1 : rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 ;
    public final void rule__ParameterDoubleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3694:1: ( rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 )
            // InternalBasicsParser.g:3695:2: rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2
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
    // InternalBasicsParser.g:3702:1: rule__ParameterDoubleType__Group__1__Impl : ( Double ) ;
    public final void rule__ParameterDoubleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3706:1: ( ( Double ) )
            // InternalBasicsParser.g:3707:1: ( Double )
            {
            // InternalBasicsParser.g:3707:1: ( Double )
            // InternalBasicsParser.g:3708:2: Double
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
    // InternalBasicsParser.g:3717:1: rule__ParameterDoubleType__Group__2 : rule__ParameterDoubleType__Group__2__Impl ;
    public final void rule__ParameterDoubleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3721:1: ( rule__ParameterDoubleType__Group__2__Impl )
            // InternalBasicsParser.g:3722:2: rule__ParameterDoubleType__Group__2__Impl
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
    // InternalBasicsParser.g:3728:1: rule__ParameterDoubleType__Group__2__Impl : ( ( rule__ParameterDoubleType__Group_2__0 )? ) ;
    public final void rule__ParameterDoubleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3732:1: ( ( ( rule__ParameterDoubleType__Group_2__0 )? ) )
            // InternalBasicsParser.g:3733:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            {
            // InternalBasicsParser.g:3733:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            // InternalBasicsParser.g:3734:2: ( rule__ParameterDoubleType__Group_2__0 )?
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup_2()); 
            // InternalBasicsParser.g:3735:2: ( rule__ParameterDoubleType__Group_2__0 )?
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
                    // InternalBasicsParser.g:3735:3: rule__ParameterDoubleType__Group_2__0
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
    // InternalBasicsParser.g:3744:1: rule__ParameterDoubleType__Group_2__0 : rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 ;
    public final void rule__ParameterDoubleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3748:1: ( rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 )
            // InternalBasicsParser.g:3749:2: rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1
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
    // InternalBasicsParser.g:3756:1: rule__ParameterDoubleType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterDoubleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3760:1: ( ( Default ) )
            // InternalBasicsParser.g:3761:1: ( Default )
            {
            // InternalBasicsParser.g:3761:1: ( Default )
            // InternalBasicsParser.g:3762:2: Default
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
    // InternalBasicsParser.g:3771:1: rule__ParameterDoubleType__Group_2__1 : rule__ParameterDoubleType__Group_2__1__Impl ;
    public final void rule__ParameterDoubleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3775:1: ( rule__ParameterDoubleType__Group_2__1__Impl )
            // InternalBasicsParser.g:3776:2: rule__ParameterDoubleType__Group_2__1__Impl
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
    // InternalBasicsParser.g:3782:1: rule__ParameterDoubleType__Group_2__1__Impl : ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterDoubleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3786:1: ( ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) )
            // InternalBasicsParser.g:3787:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:3787:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            // InternalBasicsParser.g:3788:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1()); 
            // InternalBasicsParser.g:3789:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            // InternalBasicsParser.g:3789:3: rule__ParameterDoubleType__DefaultAssignment_2_1
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
    // InternalBasicsParser.g:3798:1: rule__ParameterBooleanType__Group__0 : rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 ;
    public final void rule__ParameterBooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3802:1: ( rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 )
            // InternalBasicsParser.g:3803:2: rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1
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
    // InternalBasicsParser.g:3810:1: rule__ParameterBooleanType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3814:1: ( ( () ) )
            // InternalBasicsParser.g:3815:1: ( () )
            {
            // InternalBasicsParser.g:3815:1: ( () )
            // InternalBasicsParser.g:3816:2: ()
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0()); 
            // InternalBasicsParser.g:3817:2: ()
            // InternalBasicsParser.g:3817:3: 
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
    // InternalBasicsParser.g:3825:1: rule__ParameterBooleanType__Group__1 : rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 ;
    public final void rule__ParameterBooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3829:1: ( rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 )
            // InternalBasicsParser.g:3830:2: rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2
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
    // InternalBasicsParser.g:3837:1: rule__ParameterBooleanType__Group__1__Impl : ( Boolean ) ;
    public final void rule__ParameterBooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3841:1: ( ( Boolean ) )
            // InternalBasicsParser.g:3842:1: ( Boolean )
            {
            // InternalBasicsParser.g:3842:1: ( Boolean )
            // InternalBasicsParser.g:3843:2: Boolean
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
    // InternalBasicsParser.g:3852:1: rule__ParameterBooleanType__Group__2 : rule__ParameterBooleanType__Group__2__Impl ;
    public final void rule__ParameterBooleanType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3856:1: ( rule__ParameterBooleanType__Group__2__Impl )
            // InternalBasicsParser.g:3857:2: rule__ParameterBooleanType__Group__2__Impl
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
    // InternalBasicsParser.g:3863:1: rule__ParameterBooleanType__Group__2__Impl : ( ( rule__ParameterBooleanType__Group_2__0 )? ) ;
    public final void rule__ParameterBooleanType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3867:1: ( ( ( rule__ParameterBooleanType__Group_2__0 )? ) )
            // InternalBasicsParser.g:3868:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            {
            // InternalBasicsParser.g:3868:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            // InternalBasicsParser.g:3869:2: ( rule__ParameterBooleanType__Group_2__0 )?
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup_2()); 
            // InternalBasicsParser.g:3870:2: ( rule__ParameterBooleanType__Group_2__0 )?
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
                    // InternalBasicsParser.g:3870:3: rule__ParameterBooleanType__Group_2__0
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
    // InternalBasicsParser.g:3879:1: rule__ParameterBooleanType__Group_2__0 : rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 ;
    public final void rule__ParameterBooleanType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3883:1: ( rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 )
            // InternalBasicsParser.g:3884:2: rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1
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
    // InternalBasicsParser.g:3891:1: rule__ParameterBooleanType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBooleanType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3895:1: ( ( Default ) )
            // InternalBasicsParser.g:3896:1: ( Default )
            {
            // InternalBasicsParser.g:3896:1: ( Default )
            // InternalBasicsParser.g:3897:2: Default
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
    // InternalBasicsParser.g:3906:1: rule__ParameterBooleanType__Group_2__1 : rule__ParameterBooleanType__Group_2__1__Impl ;
    public final void rule__ParameterBooleanType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3910:1: ( rule__ParameterBooleanType__Group_2__1__Impl )
            // InternalBasicsParser.g:3911:2: rule__ParameterBooleanType__Group_2__1__Impl
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
    // InternalBasicsParser.g:3917:1: rule__ParameterBooleanType__Group_2__1__Impl : ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBooleanType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3921:1: ( ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) )
            // InternalBasicsParser.g:3922:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:3922:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            // InternalBasicsParser.g:3923:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1()); 
            // InternalBasicsParser.g:3924:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            // InternalBasicsParser.g:3924:3: rule__ParameterBooleanType__DefaultAssignment_2_1
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
    // InternalBasicsParser.g:3933:1: rule__ParameterBase64Type__Group__0 : rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 ;
    public final void rule__ParameterBase64Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3937:1: ( rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 )
            // InternalBasicsParser.g:3938:2: rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1
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
    // InternalBasicsParser.g:3945:1: rule__ParameterBase64Type__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBase64Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3949:1: ( ( () ) )
            // InternalBasicsParser.g:3950:1: ( () )
            {
            // InternalBasicsParser.g:3950:1: ( () )
            // InternalBasicsParser.g:3951:2: ()
            {
             before(grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0()); 
            // InternalBasicsParser.g:3952:2: ()
            // InternalBasicsParser.g:3952:3: 
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
    // InternalBasicsParser.g:3960:1: rule__ParameterBase64Type__Group__1 : rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 ;
    public final void rule__ParameterBase64Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3964:1: ( rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 )
            // InternalBasicsParser.g:3965:2: rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2
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
    // InternalBasicsParser.g:3972:1: rule__ParameterBase64Type__Group__1__Impl : ( Base64 ) ;
    public final void rule__ParameterBase64Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3976:1: ( ( Base64 ) )
            // InternalBasicsParser.g:3977:1: ( Base64 )
            {
            // InternalBasicsParser.g:3977:1: ( Base64 )
            // InternalBasicsParser.g:3978:2: Base64
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
    // InternalBasicsParser.g:3987:1: rule__ParameterBase64Type__Group__2 : rule__ParameterBase64Type__Group__2__Impl ;
    public final void rule__ParameterBase64Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:3991:1: ( rule__ParameterBase64Type__Group__2__Impl )
            // InternalBasicsParser.g:3992:2: rule__ParameterBase64Type__Group__2__Impl
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
    // InternalBasicsParser.g:3998:1: rule__ParameterBase64Type__Group__2__Impl : ( ( rule__ParameterBase64Type__Group_2__0 )? ) ;
    public final void rule__ParameterBase64Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4002:1: ( ( ( rule__ParameterBase64Type__Group_2__0 )? ) )
            // InternalBasicsParser.g:4003:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            {
            // InternalBasicsParser.g:4003:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            // InternalBasicsParser.g:4004:2: ( rule__ParameterBase64Type__Group_2__0 )?
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup_2()); 
            // InternalBasicsParser.g:4005:2: ( rule__ParameterBase64Type__Group_2__0 )?
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
                    // InternalBasicsParser.g:4005:3: rule__ParameterBase64Type__Group_2__0
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
    // InternalBasicsParser.g:4014:1: rule__ParameterBase64Type__Group_2__0 : rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 ;
    public final void rule__ParameterBase64Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4018:1: ( rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 )
            // InternalBasicsParser.g:4019:2: rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1
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
    // InternalBasicsParser.g:4026:1: rule__ParameterBase64Type__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBase64Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4030:1: ( ( Default ) )
            // InternalBasicsParser.g:4031:1: ( Default )
            {
            // InternalBasicsParser.g:4031:1: ( Default )
            // InternalBasicsParser.g:4032:2: Default
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
    // InternalBasicsParser.g:4041:1: rule__ParameterBase64Type__Group_2__1 : rule__ParameterBase64Type__Group_2__1__Impl ;
    public final void rule__ParameterBase64Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4045:1: ( rule__ParameterBase64Type__Group_2__1__Impl )
            // InternalBasicsParser.g:4046:2: rule__ParameterBase64Type__Group_2__1__Impl
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
    // InternalBasicsParser.g:4052:1: rule__ParameterBase64Type__Group_2__1__Impl : ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBase64Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4056:1: ( ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) )
            // InternalBasicsParser.g:4057:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:4057:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            // InternalBasicsParser.g:4058:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1()); 
            // InternalBasicsParser.g:4059:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            // InternalBasicsParser.g:4059:3: rule__ParameterBase64Type__DefaultAssignment_2_1
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
    // InternalBasicsParser.g:4068:1: rule__ParameterArrayType__Group__0 : rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 ;
    public final void rule__ParameterArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4072:1: ( rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 )
            // InternalBasicsParser.g:4073:2: rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1
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
    // InternalBasicsParser.g:4080:1: rule__ParameterArrayType__Group__0__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4084:1: ( ( RULE_BEGIN ) )
            // InternalBasicsParser.g:4085:1: ( RULE_BEGIN )
            {
            // InternalBasicsParser.g:4085:1: ( RULE_BEGIN )
            // InternalBasicsParser.g:4086:2: RULE_BEGIN
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
    // InternalBasicsParser.g:4095:1: rule__ParameterArrayType__Group__1 : rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 ;
    public final void rule__ParameterArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4099:1: ( rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 )
            // InternalBasicsParser.g:4100:2: rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2
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
    // InternalBasicsParser.g:4107:1: rule__ParameterArrayType__Group__1__Impl : ( Array ) ;
    public final void rule__ParameterArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4111:1: ( ( Array ) )
            // InternalBasicsParser.g:4112:1: ( Array )
            {
            // InternalBasicsParser.g:4112:1: ( Array )
            // InternalBasicsParser.g:4113:2: Array
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
    // InternalBasicsParser.g:4122:1: rule__ParameterArrayType__Group__2 : rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 ;
    public final void rule__ParameterArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4126:1: ( rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 )
            // InternalBasicsParser.g:4127:2: rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3
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
    // InternalBasicsParser.g:4134:1: rule__ParameterArrayType__Group__2__Impl : ( ( rule__ParameterArrayType__TypeAssignment_2 ) ) ;
    public final void rule__ParameterArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4138:1: ( ( ( rule__ParameterArrayType__TypeAssignment_2 ) ) )
            // InternalBasicsParser.g:4139:1: ( ( rule__ParameterArrayType__TypeAssignment_2 ) )
            {
            // InternalBasicsParser.g:4139:1: ( ( rule__ParameterArrayType__TypeAssignment_2 ) )
            // InternalBasicsParser.g:4140:2: ( rule__ParameterArrayType__TypeAssignment_2 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_2()); 
            // InternalBasicsParser.g:4141:2: ( rule__ParameterArrayType__TypeAssignment_2 )
            // InternalBasicsParser.g:4141:3: rule__ParameterArrayType__TypeAssignment_2
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
    // InternalBasicsParser.g:4149:1: rule__ParameterArrayType__Group__3 : rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 ;
    public final void rule__ParameterArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4153:1: ( rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 )
            // InternalBasicsParser.g:4154:2: rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4
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
    // InternalBasicsParser.g:4161:1: rule__ParameterArrayType__Group__3__Impl : ( ( rule__ParameterArrayType__Group_3__0 )? ) ;
    public final void rule__ParameterArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4165:1: ( ( ( rule__ParameterArrayType__Group_3__0 )? ) )
            // InternalBasicsParser.g:4166:1: ( ( rule__ParameterArrayType__Group_3__0 )? )
            {
            // InternalBasicsParser.g:4166:1: ( ( rule__ParameterArrayType__Group_3__0 )? )
            // InternalBasicsParser.g:4167:2: ( rule__ParameterArrayType__Group_3__0 )?
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup_3()); 
            // InternalBasicsParser.g:4168:2: ( rule__ParameterArrayType__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Default) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalBasicsParser.g:4168:3: rule__ParameterArrayType__Group_3__0
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
    // InternalBasicsParser.g:4176:1: rule__ParameterArrayType__Group__4 : rule__ParameterArrayType__Group__4__Impl ;
    public final void rule__ParameterArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4180:1: ( rule__ParameterArrayType__Group__4__Impl )
            // InternalBasicsParser.g:4181:2: rule__ParameterArrayType__Group__4__Impl
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
    // InternalBasicsParser.g:4187:1: rule__ParameterArrayType__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ParameterArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4191:1: ( ( RULE_END ) )
            // InternalBasicsParser.g:4192:1: ( RULE_END )
            {
            // InternalBasicsParser.g:4192:1: ( RULE_END )
            // InternalBasicsParser.g:4193:2: RULE_END
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
    // InternalBasicsParser.g:4203:1: rule__ParameterArrayType__Group_3__0 : rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1 ;
    public final void rule__ParameterArrayType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4207:1: ( rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1 )
            // InternalBasicsParser.g:4208:2: rule__ParameterArrayType__Group_3__0__Impl rule__ParameterArrayType__Group_3__1
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
    // InternalBasicsParser.g:4215:1: rule__ParameterArrayType__Group_3__0__Impl : ( Default ) ;
    public final void rule__ParameterArrayType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4219:1: ( ( Default ) )
            // InternalBasicsParser.g:4220:1: ( Default )
            {
            // InternalBasicsParser.g:4220:1: ( Default )
            // InternalBasicsParser.g:4221:2: Default
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
    // InternalBasicsParser.g:4230:1: rule__ParameterArrayType__Group_3__1 : rule__ParameterArrayType__Group_3__1__Impl ;
    public final void rule__ParameterArrayType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4234:1: ( rule__ParameterArrayType__Group_3__1__Impl )
            // InternalBasicsParser.g:4235:2: rule__ParameterArrayType__Group_3__1__Impl
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
    // InternalBasicsParser.g:4241:1: rule__ParameterArrayType__Group_3__1__Impl : ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) ) ;
    public final void rule__ParameterArrayType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4245:1: ( ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) ) )
            // InternalBasicsParser.g:4246:1: ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) )
            {
            // InternalBasicsParser.g:4246:1: ( ( rule__ParameterArrayType__DefaultAssignment_3_1 ) )
            // InternalBasicsParser.g:4247:2: ( rule__ParameterArrayType__DefaultAssignment_3_1 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_3_1()); 
            // InternalBasicsParser.g:4248:2: ( rule__ParameterArrayType__DefaultAssignment_3_1 )
            // InternalBasicsParser.g:4248:3: rule__ParameterArrayType__DefaultAssignment_3_1
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
    // InternalBasicsParser.g:4257:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4261:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // InternalBasicsParser.g:4262:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
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
    // InternalBasicsParser.g:4269:1: rule__ParameterList__Group__0__Impl : ( () ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4273:1: ( ( () ) )
            // InternalBasicsParser.g:4274:1: ( () )
            {
            // InternalBasicsParser.g:4274:1: ( () )
            // InternalBasicsParser.g:4275:2: ()
            {
             before(grammarAccess.getParameterListAccess().getParameterSequenceAction_0()); 
            // InternalBasicsParser.g:4276:2: ()
            // InternalBasicsParser.g:4276:3: 
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
    // InternalBasicsParser.g:4284:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4288:1: ( rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 )
            // InternalBasicsParser.g:4289:2: rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2
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
    // InternalBasicsParser.g:4296:1: rule__ParameterList__Group__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4300:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:4301:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:4301:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:4302:2: LeftSquareBracket
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
    // InternalBasicsParser.g:4311:1: rule__ParameterList__Group__2 : rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4315:1: ( rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 )
            // InternalBasicsParser.g:4316:2: rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3
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
    // InternalBasicsParser.g:4323:1: rule__ParameterList__Group__2__Impl : ( ( rule__ParameterList__ValueAssignment_2 ) ) ;
    public final void rule__ParameterList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4327:1: ( ( ( rule__ParameterList__ValueAssignment_2 ) ) )
            // InternalBasicsParser.g:4328:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            {
            // InternalBasicsParser.g:4328:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            // InternalBasicsParser.g:4329:2: ( rule__ParameterList__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_2()); 
            // InternalBasicsParser.g:4330:2: ( rule__ParameterList__ValueAssignment_2 )
            // InternalBasicsParser.g:4330:3: rule__ParameterList__ValueAssignment_2
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
    // InternalBasicsParser.g:4338:1: rule__ParameterList__Group__3 : rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 ;
    public final void rule__ParameterList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4342:1: ( rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 )
            // InternalBasicsParser.g:4343:2: rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4
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
    // InternalBasicsParser.g:4350:1: rule__ParameterList__Group__3__Impl : ( ( rule__ParameterList__Group_3__0 )* ) ;
    public final void rule__ParameterList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4354:1: ( ( ( rule__ParameterList__Group_3__0 )* ) )
            // InternalBasicsParser.g:4355:1: ( ( rule__ParameterList__Group_3__0 )* )
            {
            // InternalBasicsParser.g:4355:1: ( ( rule__ParameterList__Group_3__0 )* )
            // InternalBasicsParser.g:4356:2: ( rule__ParameterList__Group_3__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_3()); 
            // InternalBasicsParser.g:4357:2: ( rule__ParameterList__Group_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalBasicsParser.g:4357:3: rule__ParameterList__Group_3__0
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
    // InternalBasicsParser.g:4365:1: rule__ParameterList__Group__4 : rule__ParameterList__Group__4__Impl ;
    public final void rule__ParameterList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4369:1: ( rule__ParameterList__Group__4__Impl )
            // InternalBasicsParser.g:4370:2: rule__ParameterList__Group__4__Impl
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
    // InternalBasicsParser.g:4376:1: rule__ParameterList__Group__4__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4380:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:4381:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:4381:1: ( RightSquareBracket )
            // InternalBasicsParser.g:4382:2: RightSquareBracket
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
    // InternalBasicsParser.g:4392:1: rule__ParameterList__Group_3__0 : rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 ;
    public final void rule__ParameterList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4396:1: ( rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 )
            // InternalBasicsParser.g:4397:2: rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1
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
    // InternalBasicsParser.g:4404:1: rule__ParameterList__Group_3__0__Impl : ( Comma ) ;
    public final void rule__ParameterList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4408:1: ( ( Comma ) )
            // InternalBasicsParser.g:4409:1: ( Comma )
            {
            // InternalBasicsParser.g:4409:1: ( Comma )
            // InternalBasicsParser.g:4410:2: Comma
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
    // InternalBasicsParser.g:4419:1: rule__ParameterList__Group_3__1 : rule__ParameterList__Group_3__1__Impl ;
    public final void rule__ParameterList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4423:1: ( rule__ParameterList__Group_3__1__Impl )
            // InternalBasicsParser.g:4424:2: rule__ParameterList__Group_3__1__Impl
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
    // InternalBasicsParser.g:4430:1: rule__ParameterList__Group_3__1__Impl : ( ( rule__ParameterList__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4434:1: ( ( ( rule__ParameterList__ValueAssignment_3_1 ) ) )
            // InternalBasicsParser.g:4435:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            {
            // InternalBasicsParser.g:4435:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            // InternalBasicsParser.g:4436:2: ( rule__ParameterList__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_3_1()); 
            // InternalBasicsParser.g:4437:2: ( rule__ParameterList__ValueAssignment_3_1 )
            // InternalBasicsParser.g:4437:3: rule__ParameterList__ValueAssignment_3_1
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
    // InternalBasicsParser.g:4446:1: rule__ParameterAny__Group__0 : rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 ;
    public final void rule__ParameterAny__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4450:1: ( rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 )
            // InternalBasicsParser.g:4451:2: rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1
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
    // InternalBasicsParser.g:4458:1: rule__ParameterAny__Group__0__Impl : ( () ) ;
    public final void rule__ParameterAny__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4462:1: ( ( () ) )
            // InternalBasicsParser.g:4463:1: ( () )
            {
            // InternalBasicsParser.g:4463:1: ( () )
            // InternalBasicsParser.g:4464:2: ()
            {
             before(grammarAccess.getParameterAnyAccess().getParameterAnyAction_0()); 
            // InternalBasicsParser.g:4465:2: ()
            // InternalBasicsParser.g:4465:3: 
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
    // InternalBasicsParser.g:4473:1: rule__ParameterAny__Group__1 : rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 ;
    public final void rule__ParameterAny__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4477:1: ( rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 )
            // InternalBasicsParser.g:4478:2: rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2
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
    // InternalBasicsParser.g:4485:1: rule__ParameterAny__Group__1__Impl : ( ParameterAny ) ;
    public final void rule__ParameterAny__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4489:1: ( ( ParameterAny ) )
            // InternalBasicsParser.g:4490:1: ( ParameterAny )
            {
            // InternalBasicsParser.g:4490:1: ( ParameterAny )
            // InternalBasicsParser.g:4491:2: ParameterAny
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
    // InternalBasicsParser.g:4500:1: rule__ParameterAny__Group__2 : rule__ParameterAny__Group__2__Impl ;
    public final void rule__ParameterAny__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4504:1: ( rule__ParameterAny__Group__2__Impl )
            // InternalBasicsParser.g:4505:2: rule__ParameterAny__Group__2__Impl
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
    // InternalBasicsParser.g:4511:1: rule__ParameterAny__Group__2__Impl : ( ( rule__ParameterAny__Group_2__0 )? ) ;
    public final void rule__ParameterAny__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4515:1: ( ( ( rule__ParameterAny__Group_2__0 )? ) )
            // InternalBasicsParser.g:4516:1: ( ( rule__ParameterAny__Group_2__0 )? )
            {
            // InternalBasicsParser.g:4516:1: ( ( rule__ParameterAny__Group_2__0 )? )
            // InternalBasicsParser.g:4517:2: ( rule__ParameterAny__Group_2__0 )?
            {
             before(grammarAccess.getParameterAnyAccess().getGroup_2()); 
            // InternalBasicsParser.g:4518:2: ( rule__ParameterAny__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Value) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalBasicsParser.g:4518:3: rule__ParameterAny__Group_2__0
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
    // InternalBasicsParser.g:4527:1: rule__ParameterAny__Group_2__0 : rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 ;
    public final void rule__ParameterAny__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4531:1: ( rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1 )
            // InternalBasicsParser.g:4532:2: rule__ParameterAny__Group_2__0__Impl rule__ParameterAny__Group_2__1
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
    // InternalBasicsParser.g:4539:1: rule__ParameterAny__Group_2__0__Impl : ( Value ) ;
    public final void rule__ParameterAny__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4543:1: ( ( Value ) )
            // InternalBasicsParser.g:4544:1: ( Value )
            {
            // InternalBasicsParser.g:4544:1: ( Value )
            // InternalBasicsParser.g:4545:2: Value
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
    // InternalBasicsParser.g:4554:1: rule__ParameterAny__Group_2__1 : rule__ParameterAny__Group_2__1__Impl ;
    public final void rule__ParameterAny__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4558:1: ( rule__ParameterAny__Group_2__1__Impl )
            // InternalBasicsParser.g:4559:2: rule__ParameterAny__Group_2__1__Impl
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
    // InternalBasicsParser.g:4565:1: rule__ParameterAny__Group_2__1__Impl : ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) ;
    public final void rule__ParameterAny__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4569:1: ( ( ( rule__ParameterAny__ValueAssignment_2_1 ) ) )
            // InternalBasicsParser.g:4570:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            {
            // InternalBasicsParser.g:4570:1: ( ( rule__ParameterAny__ValueAssignment_2_1 ) )
            // InternalBasicsParser.g:4571:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            {
             before(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1()); 
            // InternalBasicsParser.g:4572:2: ( rule__ParameterAny__ValueAssignment_2_1 )
            // InternalBasicsParser.g:4572:3: rule__ParameterAny__ValueAssignment_2_1
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
    // InternalBasicsParser.g:4581:1: rule__ParameterStruct__Group__0 : rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 ;
    public final void rule__ParameterStruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4585:1: ( rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 )
            // InternalBasicsParser.g:4586:2: rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1
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
    // InternalBasicsParser.g:4593:1: rule__ParameterStruct__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4597:1: ( ( () ) )
            // InternalBasicsParser.g:4598:1: ( () )
            {
            // InternalBasicsParser.g:4598:1: ( () )
            // InternalBasicsParser.g:4599:2: ()
            {
             before(grammarAccess.getParameterStructAccess().getParameterStructAction_0()); 
            // InternalBasicsParser.g:4600:2: ()
            // InternalBasicsParser.g:4600:3: 
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
    // InternalBasicsParser.g:4608:1: rule__ParameterStruct__Group__1 : rule__ParameterStruct__Group__1__Impl ;
    public final void rule__ParameterStruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4612:1: ( rule__ParameterStruct__Group__1__Impl )
            // InternalBasicsParser.g:4613:2: rule__ParameterStruct__Group__1__Impl
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
    // InternalBasicsParser.g:4619:1: rule__ParameterStruct__Group__1__Impl : ( ( rule__ParameterStruct__Group_1__0 )? ) ;
    public final void rule__ParameterStruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4623:1: ( ( ( rule__ParameterStruct__Group_1__0 )? ) )
            // InternalBasicsParser.g:4624:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            {
            // InternalBasicsParser.g:4624:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            // InternalBasicsParser.g:4625:2: ( rule__ParameterStruct__Group_1__0 )?
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1()); 
            // InternalBasicsParser.g:4626:2: ( rule__ParameterStruct__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftSquareBracket) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalBasicsParser.g:4626:3: rule__ParameterStruct__Group_1__0
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
    // InternalBasicsParser.g:4635:1: rule__ParameterStruct__Group_1__0 : rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 ;
    public final void rule__ParameterStruct__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4639:1: ( rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 )
            // InternalBasicsParser.g:4640:2: rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1
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
    // InternalBasicsParser.g:4647:1: rule__ParameterStruct__Group_1__0__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4651:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:4652:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:4652:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:4653:2: LeftSquareBracket
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
    // InternalBasicsParser.g:4662:1: rule__ParameterStruct__Group_1__1 : rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 ;
    public final void rule__ParameterStruct__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4666:1: ( rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 )
            // InternalBasicsParser.g:4667:2: rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2
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
    // InternalBasicsParser.g:4674:1: rule__ParameterStruct__Group_1__1__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) ;
    public final void rule__ParameterStruct__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4678:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) )
            // InternalBasicsParser.g:4679:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            {
            // InternalBasicsParser.g:4679:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            // InternalBasicsParser.g:4680:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_1()); 
            // InternalBasicsParser.g:4681:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            // InternalBasicsParser.g:4681:3: rule__ParameterStruct__ValueAssignment_1_1
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
    // InternalBasicsParser.g:4689:1: rule__ParameterStruct__Group_1__2 : rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 ;
    public final void rule__ParameterStruct__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4693:1: ( rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 )
            // InternalBasicsParser.g:4694:2: rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3
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
    // InternalBasicsParser.g:4701:1: rule__ParameterStruct__Group_1__2__Impl : ( ( rule__ParameterStruct__Group_1_2__0 )* ) ;
    public final void rule__ParameterStruct__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4705:1: ( ( ( rule__ParameterStruct__Group_1_2__0 )* ) )
            // InternalBasicsParser.g:4706:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            {
            // InternalBasicsParser.g:4706:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            // InternalBasicsParser.g:4707:2: ( rule__ParameterStruct__Group_1_2__0 )*
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1_2()); 
            // InternalBasicsParser.g:4708:2: ( rule__ParameterStruct__Group_1_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalBasicsParser.g:4708:3: rule__ParameterStruct__Group_1_2__0
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
    // InternalBasicsParser.g:4716:1: rule__ParameterStruct__Group_1__3 : rule__ParameterStruct__Group_1__3__Impl ;
    public final void rule__ParameterStruct__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4720:1: ( rule__ParameterStruct__Group_1__3__Impl )
            // InternalBasicsParser.g:4721:2: rule__ParameterStruct__Group_1__3__Impl
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
    // InternalBasicsParser.g:4727:1: rule__ParameterStruct__Group_1__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4731:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:4732:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:4732:1: ( RightSquareBracket )
            // InternalBasicsParser.g:4733:2: RightSquareBracket
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
    // InternalBasicsParser.g:4743:1: rule__ParameterStruct__Group_1_2__0 : rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 ;
    public final void rule__ParameterStruct__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4747:1: ( rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 )
            // InternalBasicsParser.g:4748:2: rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1
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
    // InternalBasicsParser.g:4755:1: rule__ParameterStruct__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__ParameterStruct__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4759:1: ( ( Comma ) )
            // InternalBasicsParser.g:4760:1: ( Comma )
            {
            // InternalBasicsParser.g:4760:1: ( Comma )
            // InternalBasicsParser.g:4761:2: Comma
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
    // InternalBasicsParser.g:4770:1: rule__ParameterStruct__Group_1_2__1 : rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 ;
    public final void rule__ParameterStruct__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4774:1: ( rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 )
            // InternalBasicsParser.g:4775:2: rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2
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
    // InternalBasicsParser.g:4782:1: rule__ParameterStruct__Group_1_2__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4786:1: ( ( LeftSquareBracket ) )
            // InternalBasicsParser.g:4787:1: ( LeftSquareBracket )
            {
            // InternalBasicsParser.g:4787:1: ( LeftSquareBracket )
            // InternalBasicsParser.g:4788:2: LeftSquareBracket
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
    // InternalBasicsParser.g:4797:1: rule__ParameterStruct__Group_1_2__2 : rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 ;
    public final void rule__ParameterStruct__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4801:1: ( rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 )
            // InternalBasicsParser.g:4802:2: rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3
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
    // InternalBasicsParser.g:4809:1: rule__ParameterStruct__Group_1_2__2__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) ;
    public final void rule__ParameterStruct__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4813:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) )
            // InternalBasicsParser.g:4814:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            {
            // InternalBasicsParser.g:4814:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            // InternalBasicsParser.g:4815:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2()); 
            // InternalBasicsParser.g:4816:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            // InternalBasicsParser.g:4816:3: rule__ParameterStruct__ValueAssignment_1_2_2
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
    // InternalBasicsParser.g:4824:1: rule__ParameterStruct__Group_1_2__3 : rule__ParameterStruct__Group_1_2__3__Impl ;
    public final void rule__ParameterStruct__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4828:1: ( rule__ParameterStruct__Group_1_2__3__Impl )
            // InternalBasicsParser.g:4829:2: rule__ParameterStruct__Group_1_2__3__Impl
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
    // InternalBasicsParser.g:4835:1: rule__ParameterStruct__Group_1_2__3__Impl : ( RightSquareBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4839:1: ( ( RightSquareBracket ) )
            // InternalBasicsParser.g:4840:1: ( RightSquareBracket )
            {
            // InternalBasicsParser.g:4840:1: ( RightSquareBracket )
            // InternalBasicsParser.g:4841:2: RightSquareBracket
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
    // InternalBasicsParser.g:4851:1: rule__ParameterStructMember__Group__0 : rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 ;
    public final void rule__ParameterStructMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4855:1: ( rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 )
            // InternalBasicsParser.g:4856:2: rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1
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
    // InternalBasicsParser.g:4863:1: rule__ParameterStructMember__Group__0__Impl : ( ( rule__ParameterStructMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4867:1: ( ( ( rule__ParameterStructMember__NameAssignment_0 ) ) )
            // InternalBasicsParser.g:4868:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            {
            // InternalBasicsParser.g:4868:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            // InternalBasicsParser.g:4869:2: ( rule__ParameterStructMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0()); 
            // InternalBasicsParser.g:4870:2: ( rule__ParameterStructMember__NameAssignment_0 )
            // InternalBasicsParser.g:4870:3: rule__ParameterStructMember__NameAssignment_0
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
    // InternalBasicsParser.g:4878:1: rule__ParameterStructMember__Group__1 : rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 ;
    public final void rule__ParameterStructMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4882:1: ( rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 )
            // InternalBasicsParser.g:4883:2: rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2
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
    // InternalBasicsParser.g:4890:1: rule__ParameterStructMember__Group__1__Impl : ( Colon ) ;
    public final void rule__ParameterStructMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4894:1: ( ( Colon ) )
            // InternalBasicsParser.g:4895:1: ( Colon )
            {
            // InternalBasicsParser.g:4895:1: ( Colon )
            // InternalBasicsParser.g:4896:2: Colon
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
    // InternalBasicsParser.g:4905:1: rule__ParameterStructMember__Group__2 : rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 ;
    public final void rule__ParameterStructMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4909:1: ( rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 )
            // InternalBasicsParser.g:4910:2: rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3
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
    // InternalBasicsParser.g:4917:1: rule__ParameterStructMember__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__ParameterStructMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4921:1: ( ( RULE_BEGIN ) )
            // InternalBasicsParser.g:4922:1: ( RULE_BEGIN )
            {
            // InternalBasicsParser.g:4922:1: ( RULE_BEGIN )
            // InternalBasicsParser.g:4923:2: RULE_BEGIN
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
    // InternalBasicsParser.g:4932:1: rule__ParameterStructMember__Group__3 : rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 ;
    public final void rule__ParameterStructMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4936:1: ( rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 )
            // InternalBasicsParser.g:4937:2: rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4
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
    // InternalBasicsParser.g:4944:1: rule__ParameterStructMember__Group__3__Impl : ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) ;
    public final void rule__ParameterStructMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4948:1: ( ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) )
            // InternalBasicsParser.g:4949:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            {
            // InternalBasicsParser.g:4949:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            // InternalBasicsParser.g:4950:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueAssignment_3()); 
            // InternalBasicsParser.g:4951:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            // InternalBasicsParser.g:4951:3: rule__ParameterStructMember__ValueAssignment_3
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
    // InternalBasicsParser.g:4959:1: rule__ParameterStructMember__Group__4 : rule__ParameterStructMember__Group__4__Impl ;
    public final void rule__ParameterStructMember__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4963:1: ( rule__ParameterStructMember__Group__4__Impl )
            // InternalBasicsParser.g:4964:2: rule__ParameterStructMember__Group__4__Impl
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
    // InternalBasicsParser.g:4970:1: rule__ParameterStructMember__Group__4__Impl : ( RULE_END ) ;
    public final void rule__ParameterStructMember__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4974:1: ( ( RULE_END ) )
            // InternalBasicsParser.g:4975:1: ( RULE_END )
            {
            // InternalBasicsParser.g:4975:1: ( RULE_END )
            // InternalBasicsParser.g:4976:2: RULE_END
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
    // InternalBasicsParser.g:4986:1: rule__ParameterStructTypeMember__Group__0 : rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 ;
    public final void rule__ParameterStructTypeMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:4990:1: ( rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 )
            // InternalBasicsParser.g:4991:2: rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1
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
    // InternalBasicsParser.g:4998:1: rule__ParameterStructTypeMember__Group__0__Impl : ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5002:1: ( ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) )
            // InternalBasicsParser.g:5003:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            {
            // InternalBasicsParser.g:5003:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            // InternalBasicsParser.g:5004:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0()); 
            // InternalBasicsParser.g:5005:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            // InternalBasicsParser.g:5005:3: rule__ParameterStructTypeMember__NameAssignment_0
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
    // InternalBasicsParser.g:5013:1: rule__ParameterStructTypeMember__Group__1 : rule__ParameterStructTypeMember__Group__1__Impl ;
    public final void rule__ParameterStructTypeMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5017:1: ( rule__ParameterStructTypeMember__Group__1__Impl )
            // InternalBasicsParser.g:5018:2: rule__ParameterStructTypeMember__Group__1__Impl
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
    // InternalBasicsParser.g:5024:1: rule__ParameterStructTypeMember__Group__1__Impl : ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5028:1: ( ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) )
            // InternalBasicsParser.g:5029:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            {
            // InternalBasicsParser.g:5029:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            // InternalBasicsParser.g:5030:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1()); 
            // InternalBasicsParser.g:5031:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            // InternalBasicsParser.g:5031:3: rule__ParameterStructTypeMember__TypeAssignment_1
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
    // InternalBasicsParser.g:5040:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5044:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // InternalBasicsParser.g:5045:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
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
    // InternalBasicsParser.g:5052:1: rule__Bool__Group__0__Impl : ( () ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5056:1: ( ( () ) )
            // InternalBasicsParser.g:5057:1: ( () )
            {
            // InternalBasicsParser.g:5057:1: ( () )
            // InternalBasicsParser.g:5058:2: ()
            {
             before(grammarAccess.getBoolAccess().getBoolAction_0()); 
            // InternalBasicsParser.g:5059:2: ()
            // InternalBasicsParser.g:5059:3: 
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
    // InternalBasicsParser.g:5067:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl ;
    public final void rule__Bool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5071:1: ( rule__Bool__Group__1__Impl )
            // InternalBasicsParser.g:5072:2: rule__Bool__Group__1__Impl
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
    // InternalBasicsParser.g:5078:1: rule__Bool__Group__1__Impl : ( Bool ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5082:1: ( ( Bool ) )
            // InternalBasicsParser.g:5083:1: ( Bool )
            {
            // InternalBasicsParser.g:5083:1: ( Bool )
            // InternalBasicsParser.g:5084:2: Bool
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
    // InternalBasicsParser.g:5094:1: rule__Int8__Group__0 : rule__Int8__Group__0__Impl rule__Int8__Group__1 ;
    public final void rule__Int8__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5098:1: ( rule__Int8__Group__0__Impl rule__Int8__Group__1 )
            // InternalBasicsParser.g:5099:2: rule__Int8__Group__0__Impl rule__Int8__Group__1
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
    // InternalBasicsParser.g:5106:1: rule__Int8__Group__0__Impl : ( () ) ;
    public final void rule__Int8__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5110:1: ( ( () ) )
            // InternalBasicsParser.g:5111:1: ( () )
            {
            // InternalBasicsParser.g:5111:1: ( () )
            // InternalBasicsParser.g:5112:2: ()
            {
             before(grammarAccess.getInt8Access().getInt8Action_0()); 
            // InternalBasicsParser.g:5113:2: ()
            // InternalBasicsParser.g:5113:3: 
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
    // InternalBasicsParser.g:5121:1: rule__Int8__Group__1 : rule__Int8__Group__1__Impl ;
    public final void rule__Int8__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5125:1: ( rule__Int8__Group__1__Impl )
            // InternalBasicsParser.g:5126:2: rule__Int8__Group__1__Impl
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
    // InternalBasicsParser.g:5132:1: rule__Int8__Group__1__Impl : ( Int8 ) ;
    public final void rule__Int8__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5136:1: ( ( Int8 ) )
            // InternalBasicsParser.g:5137:1: ( Int8 )
            {
            // InternalBasicsParser.g:5137:1: ( Int8 )
            // InternalBasicsParser.g:5138:2: Int8
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
    // InternalBasicsParser.g:5148:1: rule__Uint8__Group__0 : rule__Uint8__Group__0__Impl rule__Uint8__Group__1 ;
    public final void rule__Uint8__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5152:1: ( rule__Uint8__Group__0__Impl rule__Uint8__Group__1 )
            // InternalBasicsParser.g:5153:2: rule__Uint8__Group__0__Impl rule__Uint8__Group__1
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
    // InternalBasicsParser.g:5160:1: rule__Uint8__Group__0__Impl : ( () ) ;
    public final void rule__Uint8__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5164:1: ( ( () ) )
            // InternalBasicsParser.g:5165:1: ( () )
            {
            // InternalBasicsParser.g:5165:1: ( () )
            // InternalBasicsParser.g:5166:2: ()
            {
             before(grammarAccess.getUint8Access().getUint8Action_0()); 
            // InternalBasicsParser.g:5167:2: ()
            // InternalBasicsParser.g:5167:3: 
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
    // InternalBasicsParser.g:5175:1: rule__Uint8__Group__1 : rule__Uint8__Group__1__Impl ;
    public final void rule__Uint8__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5179:1: ( rule__Uint8__Group__1__Impl )
            // InternalBasicsParser.g:5180:2: rule__Uint8__Group__1__Impl
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
    // InternalBasicsParser.g:5186:1: rule__Uint8__Group__1__Impl : ( Uint8 ) ;
    public final void rule__Uint8__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5190:1: ( ( Uint8 ) )
            // InternalBasicsParser.g:5191:1: ( Uint8 )
            {
            // InternalBasicsParser.g:5191:1: ( Uint8 )
            // InternalBasicsParser.g:5192:2: Uint8
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
    // InternalBasicsParser.g:5202:1: rule__Int16__Group__0 : rule__Int16__Group__0__Impl rule__Int16__Group__1 ;
    public final void rule__Int16__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5206:1: ( rule__Int16__Group__0__Impl rule__Int16__Group__1 )
            // InternalBasicsParser.g:5207:2: rule__Int16__Group__0__Impl rule__Int16__Group__1
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
    // InternalBasicsParser.g:5214:1: rule__Int16__Group__0__Impl : ( () ) ;
    public final void rule__Int16__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5218:1: ( ( () ) )
            // InternalBasicsParser.g:5219:1: ( () )
            {
            // InternalBasicsParser.g:5219:1: ( () )
            // InternalBasicsParser.g:5220:2: ()
            {
             before(grammarAccess.getInt16Access().getInt16Action_0()); 
            // InternalBasicsParser.g:5221:2: ()
            // InternalBasicsParser.g:5221:3: 
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
    // InternalBasicsParser.g:5229:1: rule__Int16__Group__1 : rule__Int16__Group__1__Impl ;
    public final void rule__Int16__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5233:1: ( rule__Int16__Group__1__Impl )
            // InternalBasicsParser.g:5234:2: rule__Int16__Group__1__Impl
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
    // InternalBasicsParser.g:5240:1: rule__Int16__Group__1__Impl : ( Int16 ) ;
    public final void rule__Int16__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5244:1: ( ( Int16 ) )
            // InternalBasicsParser.g:5245:1: ( Int16 )
            {
            // InternalBasicsParser.g:5245:1: ( Int16 )
            // InternalBasicsParser.g:5246:2: Int16
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
    // InternalBasicsParser.g:5256:1: rule__Uint16__Group__0 : rule__Uint16__Group__0__Impl rule__Uint16__Group__1 ;
    public final void rule__Uint16__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5260:1: ( rule__Uint16__Group__0__Impl rule__Uint16__Group__1 )
            // InternalBasicsParser.g:5261:2: rule__Uint16__Group__0__Impl rule__Uint16__Group__1
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
    // InternalBasicsParser.g:5268:1: rule__Uint16__Group__0__Impl : ( () ) ;
    public final void rule__Uint16__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5272:1: ( ( () ) )
            // InternalBasicsParser.g:5273:1: ( () )
            {
            // InternalBasicsParser.g:5273:1: ( () )
            // InternalBasicsParser.g:5274:2: ()
            {
             before(grammarAccess.getUint16Access().getUint16Action_0()); 
            // InternalBasicsParser.g:5275:2: ()
            // InternalBasicsParser.g:5275:3: 
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
    // InternalBasicsParser.g:5283:1: rule__Uint16__Group__1 : rule__Uint16__Group__1__Impl ;
    public final void rule__Uint16__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5287:1: ( rule__Uint16__Group__1__Impl )
            // InternalBasicsParser.g:5288:2: rule__Uint16__Group__1__Impl
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
    // InternalBasicsParser.g:5294:1: rule__Uint16__Group__1__Impl : ( Uint16 ) ;
    public final void rule__Uint16__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5298:1: ( ( Uint16 ) )
            // InternalBasicsParser.g:5299:1: ( Uint16 )
            {
            // InternalBasicsParser.g:5299:1: ( Uint16 )
            // InternalBasicsParser.g:5300:2: Uint16
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
    // InternalBasicsParser.g:5310:1: rule__Int32__Group__0 : rule__Int32__Group__0__Impl rule__Int32__Group__1 ;
    public final void rule__Int32__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5314:1: ( rule__Int32__Group__0__Impl rule__Int32__Group__1 )
            // InternalBasicsParser.g:5315:2: rule__Int32__Group__0__Impl rule__Int32__Group__1
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
    // InternalBasicsParser.g:5322:1: rule__Int32__Group__0__Impl : ( () ) ;
    public final void rule__Int32__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5326:1: ( ( () ) )
            // InternalBasicsParser.g:5327:1: ( () )
            {
            // InternalBasicsParser.g:5327:1: ( () )
            // InternalBasicsParser.g:5328:2: ()
            {
             before(grammarAccess.getInt32Access().getInt32Action_0()); 
            // InternalBasicsParser.g:5329:2: ()
            // InternalBasicsParser.g:5329:3: 
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
    // InternalBasicsParser.g:5337:1: rule__Int32__Group__1 : rule__Int32__Group__1__Impl ;
    public final void rule__Int32__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5341:1: ( rule__Int32__Group__1__Impl )
            // InternalBasicsParser.g:5342:2: rule__Int32__Group__1__Impl
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
    // InternalBasicsParser.g:5348:1: rule__Int32__Group__1__Impl : ( Int32 ) ;
    public final void rule__Int32__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5352:1: ( ( Int32 ) )
            // InternalBasicsParser.g:5353:1: ( Int32 )
            {
            // InternalBasicsParser.g:5353:1: ( Int32 )
            // InternalBasicsParser.g:5354:2: Int32
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
    // InternalBasicsParser.g:5364:1: rule__Uint32__Group__0 : rule__Uint32__Group__0__Impl rule__Uint32__Group__1 ;
    public final void rule__Uint32__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5368:1: ( rule__Uint32__Group__0__Impl rule__Uint32__Group__1 )
            // InternalBasicsParser.g:5369:2: rule__Uint32__Group__0__Impl rule__Uint32__Group__1
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
    // InternalBasicsParser.g:5376:1: rule__Uint32__Group__0__Impl : ( () ) ;
    public final void rule__Uint32__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5380:1: ( ( () ) )
            // InternalBasicsParser.g:5381:1: ( () )
            {
            // InternalBasicsParser.g:5381:1: ( () )
            // InternalBasicsParser.g:5382:2: ()
            {
             before(grammarAccess.getUint32Access().getUint32Action_0()); 
            // InternalBasicsParser.g:5383:2: ()
            // InternalBasicsParser.g:5383:3: 
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
    // InternalBasicsParser.g:5391:1: rule__Uint32__Group__1 : rule__Uint32__Group__1__Impl ;
    public final void rule__Uint32__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5395:1: ( rule__Uint32__Group__1__Impl )
            // InternalBasicsParser.g:5396:2: rule__Uint32__Group__1__Impl
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
    // InternalBasicsParser.g:5402:1: rule__Uint32__Group__1__Impl : ( Uint32 ) ;
    public final void rule__Uint32__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5406:1: ( ( Uint32 ) )
            // InternalBasicsParser.g:5407:1: ( Uint32 )
            {
            // InternalBasicsParser.g:5407:1: ( Uint32 )
            // InternalBasicsParser.g:5408:2: Uint32
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
    // InternalBasicsParser.g:5418:1: rule__Int64__Group__0 : rule__Int64__Group__0__Impl rule__Int64__Group__1 ;
    public final void rule__Int64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5422:1: ( rule__Int64__Group__0__Impl rule__Int64__Group__1 )
            // InternalBasicsParser.g:5423:2: rule__Int64__Group__0__Impl rule__Int64__Group__1
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
    // InternalBasicsParser.g:5430:1: rule__Int64__Group__0__Impl : ( () ) ;
    public final void rule__Int64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5434:1: ( ( () ) )
            // InternalBasicsParser.g:5435:1: ( () )
            {
            // InternalBasicsParser.g:5435:1: ( () )
            // InternalBasicsParser.g:5436:2: ()
            {
             before(grammarAccess.getInt64Access().getInt64Action_0()); 
            // InternalBasicsParser.g:5437:2: ()
            // InternalBasicsParser.g:5437:3: 
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
    // InternalBasicsParser.g:5445:1: rule__Int64__Group__1 : rule__Int64__Group__1__Impl ;
    public final void rule__Int64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5449:1: ( rule__Int64__Group__1__Impl )
            // InternalBasicsParser.g:5450:2: rule__Int64__Group__1__Impl
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
    // InternalBasicsParser.g:5456:1: rule__Int64__Group__1__Impl : ( Int64 ) ;
    public final void rule__Int64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5460:1: ( ( Int64 ) )
            // InternalBasicsParser.g:5461:1: ( Int64 )
            {
            // InternalBasicsParser.g:5461:1: ( Int64 )
            // InternalBasicsParser.g:5462:2: Int64
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
    // InternalBasicsParser.g:5472:1: rule__Uint64__Group__0 : rule__Uint64__Group__0__Impl rule__Uint64__Group__1 ;
    public final void rule__Uint64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5476:1: ( rule__Uint64__Group__0__Impl rule__Uint64__Group__1 )
            // InternalBasicsParser.g:5477:2: rule__Uint64__Group__0__Impl rule__Uint64__Group__1
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
    // InternalBasicsParser.g:5484:1: rule__Uint64__Group__0__Impl : ( () ) ;
    public final void rule__Uint64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5488:1: ( ( () ) )
            // InternalBasicsParser.g:5489:1: ( () )
            {
            // InternalBasicsParser.g:5489:1: ( () )
            // InternalBasicsParser.g:5490:2: ()
            {
             before(grammarAccess.getUint64Access().getUint64Action_0()); 
            // InternalBasicsParser.g:5491:2: ()
            // InternalBasicsParser.g:5491:3: 
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
    // InternalBasicsParser.g:5499:1: rule__Uint64__Group__1 : rule__Uint64__Group__1__Impl ;
    public final void rule__Uint64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5503:1: ( rule__Uint64__Group__1__Impl )
            // InternalBasicsParser.g:5504:2: rule__Uint64__Group__1__Impl
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
    // InternalBasicsParser.g:5510:1: rule__Uint64__Group__1__Impl : ( Uint64 ) ;
    public final void rule__Uint64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5514:1: ( ( Uint64 ) )
            // InternalBasicsParser.g:5515:1: ( Uint64 )
            {
            // InternalBasicsParser.g:5515:1: ( Uint64 )
            // InternalBasicsParser.g:5516:2: Uint64
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
    // InternalBasicsParser.g:5526:1: rule__Float32__Group__0 : rule__Float32__Group__0__Impl rule__Float32__Group__1 ;
    public final void rule__Float32__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5530:1: ( rule__Float32__Group__0__Impl rule__Float32__Group__1 )
            // InternalBasicsParser.g:5531:2: rule__Float32__Group__0__Impl rule__Float32__Group__1
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
    // InternalBasicsParser.g:5538:1: rule__Float32__Group__0__Impl : ( () ) ;
    public final void rule__Float32__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5542:1: ( ( () ) )
            // InternalBasicsParser.g:5543:1: ( () )
            {
            // InternalBasicsParser.g:5543:1: ( () )
            // InternalBasicsParser.g:5544:2: ()
            {
             before(grammarAccess.getFloat32Access().getFloat32Action_0()); 
            // InternalBasicsParser.g:5545:2: ()
            // InternalBasicsParser.g:5545:3: 
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
    // InternalBasicsParser.g:5553:1: rule__Float32__Group__1 : rule__Float32__Group__1__Impl ;
    public final void rule__Float32__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5557:1: ( rule__Float32__Group__1__Impl )
            // InternalBasicsParser.g:5558:2: rule__Float32__Group__1__Impl
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
    // InternalBasicsParser.g:5564:1: rule__Float32__Group__1__Impl : ( Float32 ) ;
    public final void rule__Float32__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5568:1: ( ( Float32 ) )
            // InternalBasicsParser.g:5569:1: ( Float32 )
            {
            // InternalBasicsParser.g:5569:1: ( Float32 )
            // InternalBasicsParser.g:5570:2: Float32
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
    // InternalBasicsParser.g:5580:1: rule__Float64__Group__0 : rule__Float64__Group__0__Impl rule__Float64__Group__1 ;
    public final void rule__Float64__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5584:1: ( rule__Float64__Group__0__Impl rule__Float64__Group__1 )
            // InternalBasicsParser.g:5585:2: rule__Float64__Group__0__Impl rule__Float64__Group__1
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
    // InternalBasicsParser.g:5592:1: rule__Float64__Group__0__Impl : ( () ) ;
    public final void rule__Float64__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5596:1: ( ( () ) )
            // InternalBasicsParser.g:5597:1: ( () )
            {
            // InternalBasicsParser.g:5597:1: ( () )
            // InternalBasicsParser.g:5598:2: ()
            {
             before(grammarAccess.getFloat64Access().getFloat64Action_0()); 
            // InternalBasicsParser.g:5599:2: ()
            // InternalBasicsParser.g:5599:3: 
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
    // InternalBasicsParser.g:5607:1: rule__Float64__Group__1 : rule__Float64__Group__1__Impl ;
    public final void rule__Float64__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5611:1: ( rule__Float64__Group__1__Impl )
            // InternalBasicsParser.g:5612:2: rule__Float64__Group__1__Impl
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
    // InternalBasicsParser.g:5618:1: rule__Float64__Group__1__Impl : ( Float64 ) ;
    public final void rule__Float64__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5622:1: ( ( Float64 ) )
            // InternalBasicsParser.g:5623:1: ( Float64 )
            {
            // InternalBasicsParser.g:5623:1: ( Float64 )
            // InternalBasicsParser.g:5624:2: Float64
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
    // InternalBasicsParser.g:5634:1: rule__String0__Group__0 : rule__String0__Group__0__Impl rule__String0__Group__1 ;
    public final void rule__String0__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5638:1: ( rule__String0__Group__0__Impl rule__String0__Group__1 )
            // InternalBasicsParser.g:5639:2: rule__String0__Group__0__Impl rule__String0__Group__1
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
    // InternalBasicsParser.g:5646:1: rule__String0__Group__0__Impl : ( () ) ;
    public final void rule__String0__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5650:1: ( ( () ) )
            // InternalBasicsParser.g:5651:1: ( () )
            {
            // InternalBasicsParser.g:5651:1: ( () )
            // InternalBasicsParser.g:5652:2: ()
            {
             before(grammarAccess.getString0Access().getStringAction_0()); 
            // InternalBasicsParser.g:5653:2: ()
            // InternalBasicsParser.g:5653:3: 
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
    // InternalBasicsParser.g:5661:1: rule__String0__Group__1 : rule__String0__Group__1__Impl ;
    public final void rule__String0__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5665:1: ( rule__String0__Group__1__Impl )
            // InternalBasicsParser.g:5666:2: rule__String0__Group__1__Impl
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
    // InternalBasicsParser.g:5672:1: rule__String0__Group__1__Impl : ( String_1 ) ;
    public final void rule__String0__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5676:1: ( ( String_1 ) )
            // InternalBasicsParser.g:5677:1: ( String_1 )
            {
            // InternalBasicsParser.g:5677:1: ( String_1 )
            // InternalBasicsParser.g:5678:2: String_1
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


    // $ANTLR start "rule__Char__Group__0"
    // InternalBasicsParser.g:5688:1: rule__Char__Group__0 : rule__Char__Group__0__Impl rule__Char__Group__1 ;
    public final void rule__Char__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5692:1: ( rule__Char__Group__0__Impl rule__Char__Group__1 )
            // InternalBasicsParser.g:5693:2: rule__Char__Group__0__Impl rule__Char__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Char__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Char__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__0"


    // $ANTLR start "rule__Char__Group__0__Impl"
    // InternalBasicsParser.g:5700:1: rule__Char__Group__0__Impl : ( () ) ;
    public final void rule__Char__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5704:1: ( ( () ) )
            // InternalBasicsParser.g:5705:1: ( () )
            {
            // InternalBasicsParser.g:5705:1: ( () )
            // InternalBasicsParser.g:5706:2: ()
            {
             before(grammarAccess.getCharAccess().getChar0Action_0()); 
            // InternalBasicsParser.g:5707:2: ()
            // InternalBasicsParser.g:5707:3: 
            {
            }

             after(grammarAccess.getCharAccess().getChar0Action_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__0__Impl"


    // $ANTLR start "rule__Char__Group__1"
    // InternalBasicsParser.g:5715:1: rule__Char__Group__1 : rule__Char__Group__1__Impl ;
    public final void rule__Char__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5719:1: ( rule__Char__Group__1__Impl )
            // InternalBasicsParser.g:5720:2: rule__Char__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Char__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__1"


    // $ANTLR start "rule__Char__Group__1__Impl"
    // InternalBasicsParser.g:5726:1: rule__Char__Group__1__Impl : ( Char ) ;
    public final void rule__Char__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5730:1: ( ( Char ) )
            // InternalBasicsParser.g:5731:1: ( Char )
            {
            // InternalBasicsParser.g:5731:1: ( Char )
            // InternalBasicsParser.g:5732:2: Char
            {
             before(grammarAccess.getCharAccess().getCharKeyword_1()); 
            match(input,Char,FOLLOW_2); 
             after(grammarAccess.getCharAccess().getCharKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Char__Group__1__Impl"


    // $ANTLR start "rule__Byte__Group__0"
    // InternalBasicsParser.g:5742:1: rule__Byte__Group__0 : rule__Byte__Group__0__Impl rule__Byte__Group__1 ;
    public final void rule__Byte__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5746:1: ( rule__Byte__Group__0__Impl rule__Byte__Group__1 )
            // InternalBasicsParser.g:5747:2: rule__Byte__Group__0__Impl rule__Byte__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalBasicsParser.g:5754:1: rule__Byte__Group__0__Impl : ( () ) ;
    public final void rule__Byte__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5758:1: ( ( () ) )
            // InternalBasicsParser.g:5759:1: ( () )
            {
            // InternalBasicsParser.g:5759:1: ( () )
            // InternalBasicsParser.g:5760:2: ()
            {
             before(grammarAccess.getByteAccess().getByteAction_0()); 
            // InternalBasicsParser.g:5761:2: ()
            // InternalBasicsParser.g:5761:3: 
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
    // InternalBasicsParser.g:5769:1: rule__Byte__Group__1 : rule__Byte__Group__1__Impl ;
    public final void rule__Byte__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5773:1: ( rule__Byte__Group__1__Impl )
            // InternalBasicsParser.g:5774:2: rule__Byte__Group__1__Impl
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
    // InternalBasicsParser.g:5780:1: rule__Byte__Group__1__Impl : ( Byte ) ;
    public final void rule__Byte__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5784:1: ( ( Byte ) )
            // InternalBasicsParser.g:5785:1: ( Byte )
            {
            // InternalBasicsParser.g:5785:1: ( Byte )
            // InternalBasicsParser.g:5786:2: Byte
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
    // InternalBasicsParser.g:5796:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5800:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalBasicsParser.g:5801:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalBasicsParser.g:5808:1: rule__Time__Group__0__Impl : ( () ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5812:1: ( ( () ) )
            // InternalBasicsParser.g:5813:1: ( () )
            {
            // InternalBasicsParser.g:5813:1: ( () )
            // InternalBasicsParser.g:5814:2: ()
            {
             before(grammarAccess.getTimeAccess().getTimeAction_0()); 
            // InternalBasicsParser.g:5815:2: ()
            // InternalBasicsParser.g:5815:3: 
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
    // InternalBasicsParser.g:5823:1: rule__Time__Group__1 : rule__Time__Group__1__Impl ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5827:1: ( rule__Time__Group__1__Impl )
            // InternalBasicsParser.g:5828:2: rule__Time__Group__1__Impl
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
    // InternalBasicsParser.g:5834:1: rule__Time__Group__1__Impl : ( Time ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5838:1: ( ( Time ) )
            // InternalBasicsParser.g:5839:1: ( Time )
            {
            // InternalBasicsParser.g:5839:1: ( Time )
            // InternalBasicsParser.g:5840:2: Time
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
    // InternalBasicsParser.g:5850:1: rule__Duration__Group__0 : rule__Duration__Group__0__Impl rule__Duration__Group__1 ;
    public final void rule__Duration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5854:1: ( rule__Duration__Group__0__Impl rule__Duration__Group__1 )
            // InternalBasicsParser.g:5855:2: rule__Duration__Group__0__Impl rule__Duration__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalBasicsParser.g:5862:1: rule__Duration__Group__0__Impl : ( () ) ;
    public final void rule__Duration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5866:1: ( ( () ) )
            // InternalBasicsParser.g:5867:1: ( () )
            {
            // InternalBasicsParser.g:5867:1: ( () )
            // InternalBasicsParser.g:5868:2: ()
            {
             before(grammarAccess.getDurationAccess().getDurationAction_0()); 
            // InternalBasicsParser.g:5869:2: ()
            // InternalBasicsParser.g:5869:3: 
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
    // InternalBasicsParser.g:5877:1: rule__Duration__Group__1 : rule__Duration__Group__1__Impl ;
    public final void rule__Duration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5881:1: ( rule__Duration__Group__1__Impl )
            // InternalBasicsParser.g:5882:2: rule__Duration__Group__1__Impl
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
    // InternalBasicsParser.g:5888:1: rule__Duration__Group__1__Impl : ( Duration ) ;
    public final void rule__Duration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5892:1: ( ( Duration ) )
            // InternalBasicsParser.g:5893:1: ( Duration )
            {
            // InternalBasicsParser.g:5893:1: ( Duration )
            // InternalBasicsParser.g:5894:2: Duration
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
    // InternalBasicsParser.g:5904:1: rule__BoolArray__Group__0 : rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 ;
    public final void rule__BoolArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5908:1: ( rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1 )
            // InternalBasicsParser.g:5909:2: rule__BoolArray__Group__0__Impl rule__BoolArray__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalBasicsParser.g:5916:1: rule__BoolArray__Group__0__Impl : ( () ) ;
    public final void rule__BoolArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5920:1: ( ( () ) )
            // InternalBasicsParser.g:5921:1: ( () )
            {
            // InternalBasicsParser.g:5921:1: ( () )
            // InternalBasicsParser.g:5922:2: ()
            {
             before(grammarAccess.getBoolArrayAccess().getBoolArrayAction_0()); 
            // InternalBasicsParser.g:5923:2: ()
            // InternalBasicsParser.g:5923:3: 
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
    // InternalBasicsParser.g:5931:1: rule__BoolArray__Group__1 : rule__BoolArray__Group__1__Impl ;
    public final void rule__BoolArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5935:1: ( rule__BoolArray__Group__1__Impl )
            // InternalBasicsParser.g:5936:2: rule__BoolArray__Group__1__Impl
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
    // InternalBasicsParser.g:5942:1: rule__BoolArray__Group__1__Impl : ( Bool_1 ) ;
    public final void rule__BoolArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5946:1: ( ( Bool_1 ) )
            // InternalBasicsParser.g:5947:1: ( Bool_1 )
            {
            // InternalBasicsParser.g:5947:1: ( Bool_1 )
            // InternalBasicsParser.g:5948:2: Bool_1
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
    // InternalBasicsParser.g:5958:1: rule__Int8Array__Group__0 : rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 ;
    public final void rule__Int8Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5962:1: ( rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1 )
            // InternalBasicsParser.g:5963:2: rule__Int8Array__Group__0__Impl rule__Int8Array__Group__1
            {
            pushFollow(FOLLOW_50);
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
    // InternalBasicsParser.g:5970:1: rule__Int8Array__Group__0__Impl : ( () ) ;
    public final void rule__Int8Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5974:1: ( ( () ) )
            // InternalBasicsParser.g:5975:1: ( () )
            {
            // InternalBasicsParser.g:5975:1: ( () )
            // InternalBasicsParser.g:5976:2: ()
            {
             before(grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0()); 
            // InternalBasicsParser.g:5977:2: ()
            // InternalBasicsParser.g:5977:3: 
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
    // InternalBasicsParser.g:5985:1: rule__Int8Array__Group__1 : rule__Int8Array__Group__1__Impl ;
    public final void rule__Int8Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:5989:1: ( rule__Int8Array__Group__1__Impl )
            // InternalBasicsParser.g:5990:2: rule__Int8Array__Group__1__Impl
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
    // InternalBasicsParser.g:5996:1: rule__Int8Array__Group__1__Impl : ( Int8_1 ) ;
    public final void rule__Int8Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6000:1: ( ( Int8_1 ) )
            // InternalBasicsParser.g:6001:1: ( Int8_1 )
            {
            // InternalBasicsParser.g:6001:1: ( Int8_1 )
            // InternalBasicsParser.g:6002:2: Int8_1
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
    // InternalBasicsParser.g:6012:1: rule__Uint8Array__Group__0 : rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 ;
    public final void rule__Uint8Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6016:1: ( rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1 )
            // InternalBasicsParser.g:6017:2: rule__Uint8Array__Group__0__Impl rule__Uint8Array__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalBasicsParser.g:6024:1: rule__Uint8Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint8Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6028:1: ( ( () ) )
            // InternalBasicsParser.g:6029:1: ( () )
            {
            // InternalBasicsParser.g:6029:1: ( () )
            // InternalBasicsParser.g:6030:2: ()
            {
             before(grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0()); 
            // InternalBasicsParser.g:6031:2: ()
            // InternalBasicsParser.g:6031:3: 
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
    // InternalBasicsParser.g:6039:1: rule__Uint8Array__Group__1 : rule__Uint8Array__Group__1__Impl ;
    public final void rule__Uint8Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6043:1: ( rule__Uint8Array__Group__1__Impl )
            // InternalBasicsParser.g:6044:2: rule__Uint8Array__Group__1__Impl
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
    // InternalBasicsParser.g:6050:1: rule__Uint8Array__Group__1__Impl : ( Uint8_1 ) ;
    public final void rule__Uint8Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6054:1: ( ( Uint8_1 ) )
            // InternalBasicsParser.g:6055:1: ( Uint8_1 )
            {
            // InternalBasicsParser.g:6055:1: ( Uint8_1 )
            // InternalBasicsParser.g:6056:2: Uint8_1
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
    // InternalBasicsParser.g:6066:1: rule__Int16Array__Group__0 : rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 ;
    public final void rule__Int16Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6070:1: ( rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1 )
            // InternalBasicsParser.g:6071:2: rule__Int16Array__Group__0__Impl rule__Int16Array__Group__1
            {
            pushFollow(FOLLOW_52);
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
    // InternalBasicsParser.g:6078:1: rule__Int16Array__Group__0__Impl : ( () ) ;
    public final void rule__Int16Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6082:1: ( ( () ) )
            // InternalBasicsParser.g:6083:1: ( () )
            {
            // InternalBasicsParser.g:6083:1: ( () )
            // InternalBasicsParser.g:6084:2: ()
            {
             before(grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0()); 
            // InternalBasicsParser.g:6085:2: ()
            // InternalBasicsParser.g:6085:3: 
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
    // InternalBasicsParser.g:6093:1: rule__Int16Array__Group__1 : rule__Int16Array__Group__1__Impl ;
    public final void rule__Int16Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6097:1: ( rule__Int16Array__Group__1__Impl )
            // InternalBasicsParser.g:6098:2: rule__Int16Array__Group__1__Impl
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
    // InternalBasicsParser.g:6104:1: rule__Int16Array__Group__1__Impl : ( Int16_1 ) ;
    public final void rule__Int16Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6108:1: ( ( Int16_1 ) )
            // InternalBasicsParser.g:6109:1: ( Int16_1 )
            {
            // InternalBasicsParser.g:6109:1: ( Int16_1 )
            // InternalBasicsParser.g:6110:2: Int16_1
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
    // InternalBasicsParser.g:6120:1: rule__Uint16Array__Group__0 : rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 ;
    public final void rule__Uint16Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6124:1: ( rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1 )
            // InternalBasicsParser.g:6125:2: rule__Uint16Array__Group__0__Impl rule__Uint16Array__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalBasicsParser.g:6132:1: rule__Uint16Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint16Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6136:1: ( ( () ) )
            // InternalBasicsParser.g:6137:1: ( () )
            {
            // InternalBasicsParser.g:6137:1: ( () )
            // InternalBasicsParser.g:6138:2: ()
            {
             before(grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0()); 
            // InternalBasicsParser.g:6139:2: ()
            // InternalBasicsParser.g:6139:3: 
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
    // InternalBasicsParser.g:6147:1: rule__Uint16Array__Group__1 : rule__Uint16Array__Group__1__Impl ;
    public final void rule__Uint16Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6151:1: ( rule__Uint16Array__Group__1__Impl )
            // InternalBasicsParser.g:6152:2: rule__Uint16Array__Group__1__Impl
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
    // InternalBasicsParser.g:6158:1: rule__Uint16Array__Group__1__Impl : ( Uint16_1 ) ;
    public final void rule__Uint16Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6162:1: ( ( Uint16_1 ) )
            // InternalBasicsParser.g:6163:1: ( Uint16_1 )
            {
            // InternalBasicsParser.g:6163:1: ( Uint16_1 )
            // InternalBasicsParser.g:6164:2: Uint16_1
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
    // InternalBasicsParser.g:6174:1: rule__Int32Array__Group__0 : rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 ;
    public final void rule__Int32Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6178:1: ( rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1 )
            // InternalBasicsParser.g:6179:2: rule__Int32Array__Group__0__Impl rule__Int32Array__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalBasicsParser.g:6186:1: rule__Int32Array__Group__0__Impl : ( () ) ;
    public final void rule__Int32Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6190:1: ( ( () ) )
            // InternalBasicsParser.g:6191:1: ( () )
            {
            // InternalBasicsParser.g:6191:1: ( () )
            // InternalBasicsParser.g:6192:2: ()
            {
             before(grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0()); 
            // InternalBasicsParser.g:6193:2: ()
            // InternalBasicsParser.g:6193:3: 
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
    // InternalBasicsParser.g:6201:1: rule__Int32Array__Group__1 : rule__Int32Array__Group__1__Impl ;
    public final void rule__Int32Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6205:1: ( rule__Int32Array__Group__1__Impl )
            // InternalBasicsParser.g:6206:2: rule__Int32Array__Group__1__Impl
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
    // InternalBasicsParser.g:6212:1: rule__Int32Array__Group__1__Impl : ( Int32_1 ) ;
    public final void rule__Int32Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6216:1: ( ( Int32_1 ) )
            // InternalBasicsParser.g:6217:1: ( Int32_1 )
            {
            // InternalBasicsParser.g:6217:1: ( Int32_1 )
            // InternalBasicsParser.g:6218:2: Int32_1
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
    // InternalBasicsParser.g:6228:1: rule__Uint32Array__Group__0 : rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 ;
    public final void rule__Uint32Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6232:1: ( rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1 )
            // InternalBasicsParser.g:6233:2: rule__Uint32Array__Group__0__Impl rule__Uint32Array__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalBasicsParser.g:6240:1: rule__Uint32Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint32Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6244:1: ( ( () ) )
            // InternalBasicsParser.g:6245:1: ( () )
            {
            // InternalBasicsParser.g:6245:1: ( () )
            // InternalBasicsParser.g:6246:2: ()
            {
             before(grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0()); 
            // InternalBasicsParser.g:6247:2: ()
            // InternalBasicsParser.g:6247:3: 
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
    // InternalBasicsParser.g:6255:1: rule__Uint32Array__Group__1 : rule__Uint32Array__Group__1__Impl ;
    public final void rule__Uint32Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6259:1: ( rule__Uint32Array__Group__1__Impl )
            // InternalBasicsParser.g:6260:2: rule__Uint32Array__Group__1__Impl
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
    // InternalBasicsParser.g:6266:1: rule__Uint32Array__Group__1__Impl : ( Uint32_1 ) ;
    public final void rule__Uint32Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6270:1: ( ( Uint32_1 ) )
            // InternalBasicsParser.g:6271:1: ( Uint32_1 )
            {
            // InternalBasicsParser.g:6271:1: ( Uint32_1 )
            // InternalBasicsParser.g:6272:2: Uint32_1
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
    // InternalBasicsParser.g:6282:1: rule__Int64Array__Group__0 : rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 ;
    public final void rule__Int64Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6286:1: ( rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1 )
            // InternalBasicsParser.g:6287:2: rule__Int64Array__Group__0__Impl rule__Int64Array__Group__1
            {
            pushFollow(FOLLOW_56);
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
    // InternalBasicsParser.g:6294:1: rule__Int64Array__Group__0__Impl : ( () ) ;
    public final void rule__Int64Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6298:1: ( ( () ) )
            // InternalBasicsParser.g:6299:1: ( () )
            {
            // InternalBasicsParser.g:6299:1: ( () )
            // InternalBasicsParser.g:6300:2: ()
            {
             before(grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0()); 
            // InternalBasicsParser.g:6301:2: ()
            // InternalBasicsParser.g:6301:3: 
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
    // InternalBasicsParser.g:6309:1: rule__Int64Array__Group__1 : rule__Int64Array__Group__1__Impl ;
    public final void rule__Int64Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6313:1: ( rule__Int64Array__Group__1__Impl )
            // InternalBasicsParser.g:6314:2: rule__Int64Array__Group__1__Impl
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
    // InternalBasicsParser.g:6320:1: rule__Int64Array__Group__1__Impl : ( Int64_1 ) ;
    public final void rule__Int64Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6324:1: ( ( Int64_1 ) )
            // InternalBasicsParser.g:6325:1: ( Int64_1 )
            {
            // InternalBasicsParser.g:6325:1: ( Int64_1 )
            // InternalBasicsParser.g:6326:2: Int64_1
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
    // InternalBasicsParser.g:6336:1: rule__Uint64Array__Group__0 : rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 ;
    public final void rule__Uint64Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6340:1: ( rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1 )
            // InternalBasicsParser.g:6341:2: rule__Uint64Array__Group__0__Impl rule__Uint64Array__Group__1
            {
            pushFollow(FOLLOW_57);
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
    // InternalBasicsParser.g:6348:1: rule__Uint64Array__Group__0__Impl : ( () ) ;
    public final void rule__Uint64Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6352:1: ( ( () ) )
            // InternalBasicsParser.g:6353:1: ( () )
            {
            // InternalBasicsParser.g:6353:1: ( () )
            // InternalBasicsParser.g:6354:2: ()
            {
             before(grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0()); 
            // InternalBasicsParser.g:6355:2: ()
            // InternalBasicsParser.g:6355:3: 
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
    // InternalBasicsParser.g:6363:1: rule__Uint64Array__Group__1 : rule__Uint64Array__Group__1__Impl ;
    public final void rule__Uint64Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6367:1: ( rule__Uint64Array__Group__1__Impl )
            // InternalBasicsParser.g:6368:2: rule__Uint64Array__Group__1__Impl
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
    // InternalBasicsParser.g:6374:1: rule__Uint64Array__Group__1__Impl : ( Uint64_1 ) ;
    public final void rule__Uint64Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6378:1: ( ( Uint64_1 ) )
            // InternalBasicsParser.g:6379:1: ( Uint64_1 )
            {
            // InternalBasicsParser.g:6379:1: ( Uint64_1 )
            // InternalBasicsParser.g:6380:2: Uint64_1
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
    // InternalBasicsParser.g:6390:1: rule__Float32Array__Group__0 : rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 ;
    public final void rule__Float32Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6394:1: ( rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1 )
            // InternalBasicsParser.g:6395:2: rule__Float32Array__Group__0__Impl rule__Float32Array__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalBasicsParser.g:6402:1: rule__Float32Array__Group__0__Impl : ( () ) ;
    public final void rule__Float32Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6406:1: ( ( () ) )
            // InternalBasicsParser.g:6407:1: ( () )
            {
            // InternalBasicsParser.g:6407:1: ( () )
            // InternalBasicsParser.g:6408:2: ()
            {
             before(grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0()); 
            // InternalBasicsParser.g:6409:2: ()
            // InternalBasicsParser.g:6409:3: 
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
    // InternalBasicsParser.g:6417:1: rule__Float32Array__Group__1 : rule__Float32Array__Group__1__Impl ;
    public final void rule__Float32Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6421:1: ( rule__Float32Array__Group__1__Impl )
            // InternalBasicsParser.g:6422:2: rule__Float32Array__Group__1__Impl
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
    // InternalBasicsParser.g:6428:1: rule__Float32Array__Group__1__Impl : ( Float32_1 ) ;
    public final void rule__Float32Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6432:1: ( ( Float32_1 ) )
            // InternalBasicsParser.g:6433:1: ( Float32_1 )
            {
            // InternalBasicsParser.g:6433:1: ( Float32_1 )
            // InternalBasicsParser.g:6434:2: Float32_1
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
    // InternalBasicsParser.g:6444:1: rule__Float64Array__Group__0 : rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 ;
    public final void rule__Float64Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6448:1: ( rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1 )
            // InternalBasicsParser.g:6449:2: rule__Float64Array__Group__0__Impl rule__Float64Array__Group__1
            {
            pushFollow(FOLLOW_59);
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
    // InternalBasicsParser.g:6456:1: rule__Float64Array__Group__0__Impl : ( () ) ;
    public final void rule__Float64Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6460:1: ( ( () ) )
            // InternalBasicsParser.g:6461:1: ( () )
            {
            // InternalBasicsParser.g:6461:1: ( () )
            // InternalBasicsParser.g:6462:2: ()
            {
             before(grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0()); 
            // InternalBasicsParser.g:6463:2: ()
            // InternalBasicsParser.g:6463:3: 
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
    // InternalBasicsParser.g:6471:1: rule__Float64Array__Group__1 : rule__Float64Array__Group__1__Impl ;
    public final void rule__Float64Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6475:1: ( rule__Float64Array__Group__1__Impl )
            // InternalBasicsParser.g:6476:2: rule__Float64Array__Group__1__Impl
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
    // InternalBasicsParser.g:6482:1: rule__Float64Array__Group__1__Impl : ( Float64_1 ) ;
    public final void rule__Float64Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6486:1: ( ( Float64_1 ) )
            // InternalBasicsParser.g:6487:1: ( Float64_1 )
            {
            // InternalBasicsParser.g:6487:1: ( Float64_1 )
            // InternalBasicsParser.g:6488:2: Float64_1
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
    // InternalBasicsParser.g:6498:1: rule__String0Array__Group__0 : rule__String0Array__Group__0__Impl rule__String0Array__Group__1 ;
    public final void rule__String0Array__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6502:1: ( rule__String0Array__Group__0__Impl rule__String0Array__Group__1 )
            // InternalBasicsParser.g:6503:2: rule__String0Array__Group__0__Impl rule__String0Array__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalBasicsParser.g:6510:1: rule__String0Array__Group__0__Impl : ( () ) ;
    public final void rule__String0Array__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6514:1: ( ( () ) )
            // InternalBasicsParser.g:6515:1: ( () )
            {
            // InternalBasicsParser.g:6515:1: ( () )
            // InternalBasicsParser.g:6516:2: ()
            {
             before(grammarAccess.getString0ArrayAccess().getStringArrayAction_0()); 
            // InternalBasicsParser.g:6517:2: ()
            // InternalBasicsParser.g:6517:3: 
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
    // InternalBasicsParser.g:6525:1: rule__String0Array__Group__1 : rule__String0Array__Group__1__Impl ;
    public final void rule__String0Array__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6529:1: ( rule__String0Array__Group__1__Impl )
            // InternalBasicsParser.g:6530:2: rule__String0Array__Group__1__Impl
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
    // InternalBasicsParser.g:6536:1: rule__String0Array__Group__1__Impl : ( String_2 ) ;
    public final void rule__String0Array__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6540:1: ( ( String_2 ) )
            // InternalBasicsParser.g:6541:1: ( String_2 )
            {
            // InternalBasicsParser.g:6541:1: ( String_2 )
            // InternalBasicsParser.g:6542:2: String_2
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
    // InternalBasicsParser.g:6552:1: rule__ByteArray__Group__0 : rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 ;
    public final void rule__ByteArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6556:1: ( rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1 )
            // InternalBasicsParser.g:6557:2: rule__ByteArray__Group__0__Impl rule__ByteArray__Group__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalBasicsParser.g:6564:1: rule__ByteArray__Group__0__Impl : ( () ) ;
    public final void rule__ByteArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6568:1: ( ( () ) )
            // InternalBasicsParser.g:6569:1: ( () )
            {
            // InternalBasicsParser.g:6569:1: ( () )
            // InternalBasicsParser.g:6570:2: ()
            {
             before(grammarAccess.getByteArrayAccess().getByteArrayAction_0()); 
            // InternalBasicsParser.g:6571:2: ()
            // InternalBasicsParser.g:6571:3: 
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
    // InternalBasicsParser.g:6579:1: rule__ByteArray__Group__1 : rule__ByteArray__Group__1__Impl ;
    public final void rule__ByteArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6583:1: ( rule__ByteArray__Group__1__Impl )
            // InternalBasicsParser.g:6584:2: rule__ByteArray__Group__1__Impl
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
    // InternalBasicsParser.g:6590:1: rule__ByteArray__Group__1__Impl : ( Byte_1 ) ;
    public final void rule__ByteArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6594:1: ( ( Byte_1 ) )
            // InternalBasicsParser.g:6595:1: ( Byte_1 )
            {
            // InternalBasicsParser.g:6595:1: ( Byte_1 )
            // InternalBasicsParser.g:6596:2: Byte_1
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


    // $ANTLR start "rule__CharArray__Group__0"
    // InternalBasicsParser.g:6606:1: rule__CharArray__Group__0 : rule__CharArray__Group__0__Impl rule__CharArray__Group__1 ;
    public final void rule__CharArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6610:1: ( rule__CharArray__Group__0__Impl rule__CharArray__Group__1 )
            // InternalBasicsParser.g:6611:2: rule__CharArray__Group__0__Impl rule__CharArray__Group__1
            {
            pushFollow(FOLLOW_62);
            rule__CharArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CharArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharArray__Group__0"


    // $ANTLR start "rule__CharArray__Group__0__Impl"
    // InternalBasicsParser.g:6618:1: rule__CharArray__Group__0__Impl : ( () ) ;
    public final void rule__CharArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6622:1: ( ( () ) )
            // InternalBasicsParser.g:6623:1: ( () )
            {
            // InternalBasicsParser.g:6623:1: ( () )
            // InternalBasicsParser.g:6624:2: ()
            {
             before(grammarAccess.getCharArrayAccess().getCharArrayAction_0()); 
            // InternalBasicsParser.g:6625:2: ()
            // InternalBasicsParser.g:6625:3: 
            {
            }

             after(grammarAccess.getCharArrayAccess().getCharArrayAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharArray__Group__0__Impl"


    // $ANTLR start "rule__CharArray__Group__1"
    // InternalBasicsParser.g:6633:1: rule__CharArray__Group__1 : rule__CharArray__Group__1__Impl ;
    public final void rule__CharArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6637:1: ( rule__CharArray__Group__1__Impl )
            // InternalBasicsParser.g:6638:2: rule__CharArray__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CharArray__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharArray__Group__1"


    // $ANTLR start "rule__CharArray__Group__1__Impl"
    // InternalBasicsParser.g:6644:1: rule__CharArray__Group__1__Impl : ( Char_1 ) ;
    public final void rule__CharArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6648:1: ( ( Char_1 ) )
            // InternalBasicsParser.g:6649:1: ( Char_1 )
            {
            // InternalBasicsParser.g:6649:1: ( Char_1 )
            // InternalBasicsParser.g:6650:2: Char_1
            {
             before(grammarAccess.getCharArrayAccess().getCharKeyword_1()); 
            match(input,Char_1,FOLLOW_2); 
             after(grammarAccess.getCharArrayAccess().getCharKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CharArray__Group__1__Impl"


    // $ANTLR start "rule__Header__Group__0"
    // InternalBasicsParser.g:6660:1: rule__Header__Group__0 : rule__Header__Group__0__Impl rule__Header__Group__1 ;
    public final void rule__Header__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6664:1: ( rule__Header__Group__0__Impl rule__Header__Group__1 )
            // InternalBasicsParser.g:6665:2: rule__Header__Group__0__Impl rule__Header__Group__1
            {
            pushFollow(FOLLOW_63);
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
    // InternalBasicsParser.g:6672:1: rule__Header__Group__0__Impl : ( () ) ;
    public final void rule__Header__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6676:1: ( ( () ) )
            // InternalBasicsParser.g:6677:1: ( () )
            {
            // InternalBasicsParser.g:6677:1: ( () )
            // InternalBasicsParser.g:6678:2: ()
            {
             before(grammarAccess.getHeaderAccess().getHeaderAction_0()); 
            // InternalBasicsParser.g:6679:2: ()
            // InternalBasicsParser.g:6679:3: 
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
    // InternalBasicsParser.g:6687:1: rule__Header__Group__1 : rule__Header__Group__1__Impl ;
    public final void rule__Header__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6691:1: ( rule__Header__Group__1__Impl )
            // InternalBasicsParser.g:6692:2: rule__Header__Group__1__Impl
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
    // InternalBasicsParser.g:6698:1: rule__Header__Group__1__Impl : ( Header ) ;
    public final void rule__Header__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6702:1: ( ( Header ) )
            // InternalBasicsParser.g:6703:1: ( Header )
            {
            // InternalBasicsParser.g:6703:1: ( Header )
            // InternalBasicsParser.g:6704:2: Header
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


    // $ANTLR start "rule__ArraySpecRef__Group__0"
    // InternalBasicsParser.g:6714:1: rule__ArraySpecRef__Group__0 : rule__ArraySpecRef__Group__0__Impl rule__ArraySpecRef__Group__1 ;
    public final void rule__ArraySpecRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6718:1: ( rule__ArraySpecRef__Group__0__Impl rule__ArraySpecRef__Group__1 )
            // InternalBasicsParser.g:6719:2: rule__ArraySpecRef__Group__0__Impl rule__ArraySpecRef__Group__1
            {
            pushFollow(FOLLOW_64);
            rule__ArraySpecRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArraySpecRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySpecRef__Group__0"


    // $ANTLR start "rule__ArraySpecRef__Group__0__Impl"
    // InternalBasicsParser.g:6726:1: rule__ArraySpecRef__Group__0__Impl : ( ( rule__ArraySpecRef__ReferenceAssignment_0 ) ) ;
    public final void rule__ArraySpecRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6730:1: ( ( ( rule__ArraySpecRef__ReferenceAssignment_0 ) ) )
            // InternalBasicsParser.g:6731:1: ( ( rule__ArraySpecRef__ReferenceAssignment_0 ) )
            {
            // InternalBasicsParser.g:6731:1: ( ( rule__ArraySpecRef__ReferenceAssignment_0 ) )
            // InternalBasicsParser.g:6732:2: ( rule__ArraySpecRef__ReferenceAssignment_0 )
            {
             before(grammarAccess.getArraySpecRefAccess().getReferenceAssignment_0()); 
            // InternalBasicsParser.g:6733:2: ( rule__ArraySpecRef__ReferenceAssignment_0 )
            // InternalBasicsParser.g:6733:3: rule__ArraySpecRef__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecRef__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getArraySpecRefAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySpecRef__Group__0__Impl"


    // $ANTLR start "rule__ArraySpecRef__Group__1"
    // InternalBasicsParser.g:6741:1: rule__ArraySpecRef__Group__1 : rule__ArraySpecRef__Group__1__Impl ;
    public final void rule__ArraySpecRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6745:1: ( rule__ArraySpecRef__Group__1__Impl )
            // InternalBasicsParser.g:6746:2: rule__ArraySpecRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArraySpecRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySpecRef__Group__1"


    // $ANTLR start "rule__ArraySpecRef__Group__1__Impl"
    // InternalBasicsParser.g:6752:1: rule__ArraySpecRef__Group__1__Impl : ( LeftSquareBracketRightSquareBracket ) ;
    public final void rule__ArraySpecRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6756:1: ( ( LeftSquareBracketRightSquareBracket ) )
            // InternalBasicsParser.g:6757:1: ( LeftSquareBracketRightSquareBracket )
            {
            // InternalBasicsParser.g:6757:1: ( LeftSquareBracketRightSquareBracket )
            // InternalBasicsParser.g:6758:2: LeftSquareBracketRightSquareBracket
            {
             before(grammarAccess.getArraySpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 
            match(input,LeftSquareBracketRightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getArraySpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySpecRef__Group__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_2_1"
    // InternalBasicsParser.g:6768:1: rule__GlobalNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6772:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6773:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6773:2: ( ruleGraphName )
            // InternalBasicsParser.g:6774:3: ruleGraphName
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
    // InternalBasicsParser.g:6783:1: rule__GlobalNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6787:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6788:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6788:2: ( ruleGraphName )
            // InternalBasicsParser.g:6789:3: ruleGraphName
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
    // InternalBasicsParser.g:6798:1: rule__RelativeNamespace_Impl__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6802:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6803:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6803:2: ( ruleGraphName )
            // InternalBasicsParser.g:6804:3: ruleGraphName
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
    // InternalBasicsParser.g:6813:1: rule__RelativeNamespace_Impl__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6817:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6818:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6818:2: ( ruleGraphName )
            // InternalBasicsParser.g:6819:3: ruleGraphName
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
    // InternalBasicsParser.g:6828:1: rule__PrivateNamespace__PartsAssignment_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6832:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6833:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6833:2: ( ruleGraphName )
            // InternalBasicsParser.g:6834:3: ruleGraphName
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
    // InternalBasicsParser.g:6843:1: rule__PrivateNamespace__PartsAssignment_2_2_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6847:1: ( ( ruleGraphName ) )
            // InternalBasicsParser.g:6848:2: ( ruleGraphName )
            {
            // InternalBasicsParser.g:6848:2: ( ruleGraphName )
            // InternalBasicsParser.g:6849:3: ruleGraphName
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
    // InternalBasicsParser.g:6858:1: rule__ParameterListType__SequenceAssignment_3 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6862:1: ( ( ruleParameterType ) )
            // InternalBasicsParser.g:6863:2: ( ruleParameterType )
            {
            // InternalBasicsParser.g:6863:2: ( ruleParameterType )
            // InternalBasicsParser.g:6864:3: ruleParameterType
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
    // InternalBasicsParser.g:6873:1: rule__ParameterListType__SequenceAssignment_4_1 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6877:1: ( ( ruleParameterType ) )
            // InternalBasicsParser.g:6878:2: ( ruleParameterType )
            {
            // InternalBasicsParser.g:6878:2: ( ruleParameterType )
            // InternalBasicsParser.g:6879:3: ruleParameterType
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
    // InternalBasicsParser.g:6888:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_3 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6892:1: ( ( ruleParameterStructTypeMember ) )
            // InternalBasicsParser.g:6893:2: ( ruleParameterStructTypeMember )
            {
            // InternalBasicsParser.g:6893:2: ( ruleParameterStructTypeMember )
            // InternalBasicsParser.g:6894:3: ruleParameterStructTypeMember
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
    // InternalBasicsParser.g:6903:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6907:1: ( ( ruleParameterStructTypeMember ) )
            // InternalBasicsParser.g:6908:2: ( ruleParameterStructTypeMember )
            {
            // InternalBasicsParser.g:6908:2: ( ruleParameterStructTypeMember )
            // InternalBasicsParser.g:6909:3: ruleParameterStructTypeMember
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
    // InternalBasicsParser.g:6918:1: rule__ParameterIntegerType__DefaultAssignment_2_1 : ( ruleParameterInteger ) ;
    public final void rule__ParameterIntegerType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6922:1: ( ( ruleParameterInteger ) )
            // InternalBasicsParser.g:6923:2: ( ruleParameterInteger )
            {
            // InternalBasicsParser.g:6923:2: ( ruleParameterInteger )
            // InternalBasicsParser.g:6924:3: ruleParameterInteger
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
    // InternalBasicsParser.g:6933:1: rule__ParameterStringType__DefaultAssignment_2_1 : ( ruleParameterString ) ;
    public final void rule__ParameterStringType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6937:1: ( ( ruleParameterString ) )
            // InternalBasicsParser.g:6938:2: ( ruleParameterString )
            {
            // InternalBasicsParser.g:6938:2: ( ruleParameterString )
            // InternalBasicsParser.g:6939:3: ruleParameterString
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
    // InternalBasicsParser.g:6948:1: rule__ParameterDoubleType__DefaultAssignment_2_1 : ( ruleParameterDouble ) ;
    public final void rule__ParameterDoubleType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6952:1: ( ( ruleParameterDouble ) )
            // InternalBasicsParser.g:6953:2: ( ruleParameterDouble )
            {
            // InternalBasicsParser.g:6953:2: ( ruleParameterDouble )
            // InternalBasicsParser.g:6954:3: ruleParameterDouble
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
    // InternalBasicsParser.g:6963:1: rule__ParameterBooleanType__DefaultAssignment_2_1 : ( ruleParameterBoolean ) ;
    public final void rule__ParameterBooleanType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6967:1: ( ( ruleParameterBoolean ) )
            // InternalBasicsParser.g:6968:2: ( ruleParameterBoolean )
            {
            // InternalBasicsParser.g:6968:2: ( ruleParameterBoolean )
            // InternalBasicsParser.g:6969:3: ruleParameterBoolean
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
    // InternalBasicsParser.g:6978:1: rule__ParameterBase64Type__DefaultAssignment_2_1 : ( ruleParameterBase64 ) ;
    public final void rule__ParameterBase64Type__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6982:1: ( ( ruleParameterBase64 ) )
            // InternalBasicsParser.g:6983:2: ( ruleParameterBase64 )
            {
            // InternalBasicsParser.g:6983:2: ( ruleParameterBase64 )
            // InternalBasicsParser.g:6984:3: ruleParameterBase64
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
    // InternalBasicsParser.g:6993:1: rule__ParameterArrayType__TypeAssignment_2 : ( ruleParameterType ) ;
    public final void rule__ParameterArrayType__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:6997:1: ( ( ruleParameterType ) )
            // InternalBasicsParser.g:6998:2: ( ruleParameterType )
            {
            // InternalBasicsParser.g:6998:2: ( ruleParameterType )
            // InternalBasicsParser.g:6999:3: ruleParameterType
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
    // InternalBasicsParser.g:7008:1: rule__ParameterArrayType__DefaultAssignment_3_1 : ( ruleParameterList ) ;
    public final void rule__ParameterArrayType__DefaultAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7012:1: ( ( ruleParameterList ) )
            // InternalBasicsParser.g:7013:2: ( ruleParameterList )
            {
            // InternalBasicsParser.g:7013:2: ( ruleParameterList )
            // InternalBasicsParser.g:7014:3: ruleParameterList
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
    // InternalBasicsParser.g:7023:1: rule__ParameterList__ValueAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7027:1: ( ( ruleParameterValue ) )
            // InternalBasicsParser.g:7028:2: ( ruleParameterValue )
            {
            // InternalBasicsParser.g:7028:2: ( ruleParameterValue )
            // InternalBasicsParser.g:7029:3: ruleParameterValue
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
    // InternalBasicsParser.g:7038:1: rule__ParameterList__ValueAssignment_3_1 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7042:1: ( ( ruleParameterValue ) )
            // InternalBasicsParser.g:7043:2: ( ruleParameterValue )
            {
            // InternalBasicsParser.g:7043:2: ( ruleParameterValue )
            // InternalBasicsParser.g:7044:3: ruleParameterValue
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
    // InternalBasicsParser.g:7053:1: rule__ParameterAny__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ParameterAny__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7057:1: ( ( ruleEString ) )
            // InternalBasicsParser.g:7058:2: ( ruleEString )
            {
            // InternalBasicsParser.g:7058:2: ( ruleEString )
            // InternalBasicsParser.g:7059:3: ruleEString
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
    // InternalBasicsParser.g:7068:1: rule__ParameterString__ValueAssignment : ( ruleEString ) ;
    public final void rule__ParameterString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7072:1: ( ( ruleEString ) )
            // InternalBasicsParser.g:7073:2: ( ruleEString )
            {
            // InternalBasicsParser.g:7073:2: ( ruleEString )
            // InternalBasicsParser.g:7074:3: ruleEString
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
    // InternalBasicsParser.g:7083:1: rule__ParameterBase64__ValueAssignment : ( ruleBase64Binary ) ;
    public final void rule__ParameterBase64__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7087:1: ( ( ruleBase64Binary ) )
            // InternalBasicsParser.g:7088:2: ( ruleBase64Binary )
            {
            // InternalBasicsParser.g:7088:2: ( ruleBase64Binary )
            // InternalBasicsParser.g:7089:3: ruleBase64Binary
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
    // InternalBasicsParser.g:7098:1: rule__ParameterInteger__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__ParameterInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7102:1: ( ( ruleInteger0 ) )
            // InternalBasicsParser.g:7103:2: ( ruleInteger0 )
            {
            // InternalBasicsParser.g:7103:2: ( ruleInteger0 )
            // InternalBasicsParser.g:7104:3: ruleInteger0
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
    // InternalBasicsParser.g:7113:1: rule__ParameterDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__ParameterDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7117:1: ( ( ruleDouble0 ) )
            // InternalBasicsParser.g:7118:2: ( ruleDouble0 )
            {
            // InternalBasicsParser.g:7118:2: ( ruleDouble0 )
            // InternalBasicsParser.g:7119:3: ruleDouble0
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
    // InternalBasicsParser.g:7128:1: rule__ParameterBoolean__ValueAssignment : ( ruleboolean0 ) ;
    public final void rule__ParameterBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7132:1: ( ( ruleboolean0 ) )
            // InternalBasicsParser.g:7133:2: ( ruleboolean0 )
            {
            // InternalBasicsParser.g:7133:2: ( ruleboolean0 )
            // InternalBasicsParser.g:7134:3: ruleboolean0
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
    // InternalBasicsParser.g:7143:1: rule__ParameterStruct__ValueAssignment_1_1 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7147:1: ( ( ruleParameterStructMember ) )
            // InternalBasicsParser.g:7148:2: ( ruleParameterStructMember )
            {
            // InternalBasicsParser.g:7148:2: ( ruleParameterStructMember )
            // InternalBasicsParser.g:7149:3: ruleParameterStructMember
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
    // InternalBasicsParser.g:7158:1: rule__ParameterStruct__ValueAssignment_1_2_2 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7162:1: ( ( ruleParameterStructMember ) )
            // InternalBasicsParser.g:7163:2: ( ruleParameterStructMember )
            {
            // InternalBasicsParser.g:7163:2: ( ruleParameterStructMember )
            // InternalBasicsParser.g:7164:3: ruleParameterStructMember
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
    // InternalBasicsParser.g:7173:1: rule__ParameterDate__ValueAssignment : ( ruleDateTime0 ) ;
    public final void rule__ParameterDate__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7177:1: ( ( ruleDateTime0 ) )
            // InternalBasicsParser.g:7178:2: ( ruleDateTime0 )
            {
            // InternalBasicsParser.g:7178:2: ( ruleDateTime0 )
            // InternalBasicsParser.g:7179:3: ruleDateTime0
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
    // InternalBasicsParser.g:7188:1: rule__ParameterStructMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7192:1: ( ( ruleEString ) )
            // InternalBasicsParser.g:7193:2: ( ruleEString )
            {
            // InternalBasicsParser.g:7193:2: ( ruleEString )
            // InternalBasicsParser.g:7194:3: ruleEString
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
    // InternalBasicsParser.g:7203:1: rule__ParameterStructMember__ValueAssignment_3 : ( ruleParameterValue ) ;
    public final void rule__ParameterStructMember__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7207:1: ( ( ruleParameterValue ) )
            // InternalBasicsParser.g:7208:2: ( ruleParameterValue )
            {
            // InternalBasicsParser.g:7208:2: ( ruleParameterValue )
            // InternalBasicsParser.g:7209:3: ruleParameterValue
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
    // InternalBasicsParser.g:7218:1: rule__ParameterStructTypeMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructTypeMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7222:1: ( ( ruleEString ) )
            // InternalBasicsParser.g:7223:2: ( ruleEString )
            {
            // InternalBasicsParser.g:7223:2: ( ruleEString )
            // InternalBasicsParser.g:7224:3: ruleEString
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
    // InternalBasicsParser.g:7233:1: rule__ParameterStructTypeMember__TypeAssignment_1 : ( ruleParameterType ) ;
    public final void rule__ParameterStructTypeMember__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7237:1: ( ( ruleParameterType ) )
            // InternalBasicsParser.g:7238:2: ( ruleParameterType )
            {
            // InternalBasicsParser.g:7238:2: ( ruleParameterType )
            // InternalBasicsParser.g:7239:3: ruleParameterType
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


    // $ANTLR start "rule__SpecBaseRef__ReferenceAssignment"
    // InternalBasicsParser.g:7248:1: rule__SpecBaseRef__ReferenceAssignment : ( ( ruleEString ) ) ;
    public final void rule__SpecBaseRef__ReferenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7252:1: ( ( ( ruleEString ) ) )
            // InternalBasicsParser.g:7253:2: ( ( ruleEString ) )
            {
            // InternalBasicsParser.g:7253:2: ( ( ruleEString ) )
            // InternalBasicsParser.g:7254:3: ( ruleEString )
            {
             before(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecCrossReference_0()); 
            // InternalBasicsParser.g:7255:3: ( ruleEString )
            // InternalBasicsParser.g:7256:4: ruleEString
            {
             before(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecEStringParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SpecBaseRef__ReferenceAssignment"


    // $ANTLR start "rule__ArraySpecRef__ReferenceAssignment_0"
    // InternalBasicsParser.g:7267:1: rule__ArraySpecRef__ReferenceAssignment_0 : ( ( ruleEString ) ) ;
    public final void rule__ArraySpecRef__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBasicsParser.g:7271:1: ( ( ( ruleEString ) ) )
            // InternalBasicsParser.g:7272:2: ( ( ruleEString ) )
            {
            // InternalBasicsParser.g:7272:2: ( ( ruleEString ) )
            // InternalBasicsParser.g:7273:3: ( ruleEString )
            {
             before(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecCrossReference_0_0()); 
            // InternalBasicsParser.g:7274:3: ( ruleEString )
            // InternalBasicsParser.g:7275:4: ruleEString
            {
             before(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecEStringParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecEStringParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArraySpecRef__ReferenceAssignment_0"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\7\12\uffff";
    static final String dfa_3s = "\1\101\5\uffff\1\101\1\uffff\2\101\1\uffff";
    static final String dfa_4s = "\1\125\5\uffff\1\121\1\uffff\2\104\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\2\uffff\1\6";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\uffff\1\6\1\7\1\uffff\1\2\1\5\1\3\1\4\6\uffff\2\1\3\uffff\1\7",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\2\12\1\uffff\4\12\6\uffff\1\11\1\10",
            "",
            "\1\12\1\7\1\uffff\1\12",
            "\1\12\1\7\1\uffff\1\12",
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
            return "1878:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );";
        }
    }
    static final String dfa_8s = "\44\uffff";
    static final String dfa_9s = "\36\uffff\2\42\4\uffff";
    static final String dfa_10s = "\1\11\35\uffff\2\100\4\uffff";
    static final String dfa_11s = "\1\121\35\uffff\2\100\4\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\40\1\41\1\36\1\37";
    static final String dfa_13s = "\44\uffff}>";
    static final String[] dfa_14s = {
            "\1\32\1\33\1\uffff\1\17\1\uffff\1\34\1\25\1\27\1\31\2\uffff\1\12\1\13\1\24\1\26\1\30\2\uffff\1\23\3\uffff\1\20\3\uffff\1\21\1\35\1\41\1\22\1\uffff\1\14\1\5\1\7\1\11\1\uffff\1\4\1\6\1\10\1\uffff\1\3\3\uffff\1\1\1\15\1\40\1\uffff\1\2\2\uffff\1\16\23\uffff\1\37\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43",
            "\1\43",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1929:1: rule__AbstractType__Alternatives : ( ( rulebool ) | ( ruleint8 ) | ( ruleuint8 ) | ( ruleint16 ) | ( ruleuint16 ) | ( ruleint32 ) | ( ruleuint32 ) | ( ruleint64 ) | ( ruleuint64 ) | ( rulefloat32 ) | ( rulefloat64 ) | ( rulestring0 ) | ( rulebyte ) | ( ruletime ) | ( ruleduration ) | ( ruleHeader ) | ( ruleboolArray ) | ( ruleint8Array ) | ( ruleuint8Array ) | ( ruleint16Array ) | ( ruleuint16Array ) | ( ruleint32Array ) | ( ruleuint32Array ) | ( ruleint64Array ) | ( ruleuint64Array ) | ( rulefloat32Array ) | ( rulefloat64Array ) | ( rulestring0Array ) | ( rulebyteArray ) | ( ruleSpecBaseRef ) | ( ruleArraySpecRef ) | ( rulechar ) | ( rulecharArray ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000012L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00100003600C0000L,0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000800L,0x0000000000200000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x00000000000303C8L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});

}