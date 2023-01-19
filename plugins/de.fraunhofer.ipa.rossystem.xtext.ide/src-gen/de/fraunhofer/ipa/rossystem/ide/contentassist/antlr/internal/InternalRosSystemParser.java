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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "ParameterAny", "GraphName", "NameSpace", "Parameter", "Boolean", "Integer", "Default", "Base64", "Double", "String", "Struct", "Array", "From", "Parts", "Value", "Date", "List", "Name", "Type", "Any", "Comma", "Colon", "LeftCurlyBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Any", "'Any'");
    		tokenNameToValue.put("Date", "'Date'");
    		tokenNameToValue.put("List", "'List'");
    		tokenNameToValue.put("Name", "'name'");
    		tokenNameToValue.put("Type", "'type'");
    		tokenNameToValue.put("Array", "'Array'");
    		tokenNameToValue.put("From", "'from:'");
    		tokenNameToValue.put("Parts", "'parts'");
    		tokenNameToValue.put("Value", "'value'");
    		tokenNameToValue.put("Base64", "'Base64'");
    		tokenNameToValue.put("Double", "'Double'");
    		tokenNameToValue.put("String", "'String'");
    		tokenNameToValue.put("Struct", "'Struct'");
    		tokenNameToValue.put("Boolean", "'Boolean'");
    		tokenNameToValue.put("Integer", "'Integer'");
    		tokenNameToValue.put("Default", "'default'");
    		tokenNameToValue.put("GraphName", "'GraphName'");
    		tokenNameToValue.put("NameSpace", "'NameSpace'");
    		tokenNameToValue.put("Parameter", "'Parameter'");
    		tokenNameToValue.put("ParameterAny", "'ParameterAny'");
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



    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystemParser.g:82:1: entryRuleRosSystem : ruleRosSystem EOF ;
    public final void entryRuleRosSystem() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:83:1: ( ruleRosSystem EOF )
            // InternalRosSystemParser.g:84:1: ruleRosSystem EOF
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
    // InternalRosSystemParser.g:91:1: ruleRosSystem : ( ( rule__RosSystem__Group__0 ) ) ;
    public final void ruleRosSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:95:2: ( ( ( rule__RosSystem__Group__0 ) ) )
            // InternalRosSystemParser.g:96:2: ( ( rule__RosSystem__Group__0 ) )
            {
            // InternalRosSystemParser.g:96:2: ( ( rule__RosSystem__Group__0 ) )
            // InternalRosSystemParser.g:97:3: ( rule__RosSystem__Group__0 )
            {
             before(grammarAccess.getRosSystemAccess().getGroup()); 
            // InternalRosSystemParser.g:98:3: ( rule__RosSystem__Group__0 )
            // InternalRosSystemParser.g:98:4: rule__RosSystem__Group__0
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


    // $ANTLR start "entryRuleRosNode"
    // InternalRosSystemParser.g:107:1: entryRuleRosNode : ruleRosNode EOF ;
    public final void entryRuleRosNode() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:108:1: ( ruleRosNode EOF )
            // InternalRosSystemParser.g:109:1: ruleRosNode EOF
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
    // InternalRosSystemParser.g:116:1: ruleRosNode : ( ( rule__RosNode__Group__0 ) ) ;
    public final void ruleRosNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:120:2: ( ( ( rule__RosNode__Group__0 ) ) )
            // InternalRosSystemParser.g:121:2: ( ( rule__RosNode__Group__0 ) )
            {
            // InternalRosSystemParser.g:121:2: ( ( rule__RosNode__Group__0 ) )
            // InternalRosSystemParser.g:122:3: ( rule__RosNode__Group__0 )
            {
             before(grammarAccess.getRosNodeAccess().getGroup()); 
            // InternalRosSystemParser.g:123:3: ( rule__RosNode__Group__0 )
            // InternalRosSystemParser.g:123:4: rule__RosNode__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalRosSystemParser.g:132:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:133:1: ( ruleEString EOF )
            // InternalRosSystemParser.g:134:1: ruleEString EOF
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
    // InternalRosSystemParser.g:141:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:145:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRosSystemParser.g:146:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRosSystemParser.g:146:2: ( ( rule__EString__Alternatives ) )
            // InternalRosSystemParser.g:147:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRosSystemParser.g:148:3: ( rule__EString__Alternatives )
            // InternalRosSystemParser.g:148:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleParameterType"
    // InternalRosSystemParser.g:157:1: entryRuleParameterType : ruleParameterType EOF ;
    public final void entryRuleParameterType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:158:1: ( ruleParameterType EOF )
            // InternalRosSystemParser.g:159:1: ruleParameterType EOF
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
    // InternalRosSystemParser.g:166:1: ruleParameterType : ( ( rule__ParameterType__Alternatives ) ) ;
    public final void ruleParameterType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:170:2: ( ( ( rule__ParameterType__Alternatives ) ) )
            // InternalRosSystemParser.g:171:2: ( ( rule__ParameterType__Alternatives ) )
            {
            // InternalRosSystemParser.g:171:2: ( ( rule__ParameterType__Alternatives ) )
            // InternalRosSystemParser.g:172:3: ( rule__ParameterType__Alternatives )
            {
             before(grammarAccess.getParameterTypeAccess().getAlternatives()); 
            // InternalRosSystemParser.g:173:3: ( rule__ParameterType__Alternatives )
            // InternalRosSystemParser.g:173:4: rule__ParameterType__Alternatives
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
    // InternalRosSystemParser.g:182:1: entryRuleParameterValue : ruleParameterValue EOF ;
    public final void entryRuleParameterValue() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:183:1: ( ruleParameterValue EOF )
            // InternalRosSystemParser.g:184:1: ruleParameterValue EOF
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
    // InternalRosSystemParser.g:191:1: ruleParameterValue : ( ( rule__ParameterValue__Alternatives ) ) ;
    public final void ruleParameterValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:195:2: ( ( ( rule__ParameterValue__Alternatives ) ) )
            // InternalRosSystemParser.g:196:2: ( ( rule__ParameterValue__Alternatives ) )
            {
            // InternalRosSystemParser.g:196:2: ( ( rule__ParameterValue__Alternatives ) )
            // InternalRosSystemParser.g:197:3: ( rule__ParameterValue__Alternatives )
            {
             before(grammarAccess.getParameterValueAccess().getAlternatives()); 
            // InternalRosSystemParser.g:198:3: ( rule__ParameterValue__Alternatives )
            // InternalRosSystemParser.g:198:4: rule__ParameterValue__Alternatives
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
    // InternalRosSystemParser.g:207:1: entryRuleParameterListType : ruleParameterListType EOF ;
    public final void entryRuleParameterListType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:208:1: ( ruleParameterListType EOF )
            // InternalRosSystemParser.g:209:1: ruleParameterListType EOF
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
    // InternalRosSystemParser.g:216:1: ruleParameterListType : ( ( rule__ParameterListType__Group__0 ) ) ;
    public final void ruleParameterListType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:220:2: ( ( ( rule__ParameterListType__Group__0 ) ) )
            // InternalRosSystemParser.g:221:2: ( ( rule__ParameterListType__Group__0 ) )
            {
            // InternalRosSystemParser.g:221:2: ( ( rule__ParameterListType__Group__0 ) )
            // InternalRosSystemParser.g:222:3: ( rule__ParameterListType__Group__0 )
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:223:3: ( rule__ParameterListType__Group__0 )
            // InternalRosSystemParser.g:223:4: rule__ParameterListType__Group__0
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
    // InternalRosSystemParser.g:232:1: entryRuleParameterStructType : ruleParameterStructType EOF ;
    public final void entryRuleParameterStructType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:233:1: ( ruleParameterStructType EOF )
            // InternalRosSystemParser.g:234:1: ruleParameterStructType EOF
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
    // InternalRosSystemParser.g:241:1: ruleParameterStructType : ( ( rule__ParameterStructType__Group__0 ) ) ;
    public final void ruleParameterStructType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:245:2: ( ( ( rule__ParameterStructType__Group__0 ) ) )
            // InternalRosSystemParser.g:246:2: ( ( rule__ParameterStructType__Group__0 ) )
            {
            // InternalRosSystemParser.g:246:2: ( ( rule__ParameterStructType__Group__0 ) )
            // InternalRosSystemParser.g:247:3: ( rule__ParameterStructType__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:248:3: ( rule__ParameterStructType__Group__0 )
            // InternalRosSystemParser.g:248:4: rule__ParameterStructType__Group__0
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
    // InternalRosSystemParser.g:257:1: entryRuleParameterIntegerType : ruleParameterIntegerType EOF ;
    public final void entryRuleParameterIntegerType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:258:1: ( ruleParameterIntegerType EOF )
            // InternalRosSystemParser.g:259:1: ruleParameterIntegerType EOF
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
    // InternalRosSystemParser.g:266:1: ruleParameterIntegerType : ( ( rule__ParameterIntegerType__Group__0 ) ) ;
    public final void ruleParameterIntegerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:270:2: ( ( ( rule__ParameterIntegerType__Group__0 ) ) )
            // InternalRosSystemParser.g:271:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            {
            // InternalRosSystemParser.g:271:2: ( ( rule__ParameterIntegerType__Group__0 ) )
            // InternalRosSystemParser.g:272:3: ( rule__ParameterIntegerType__Group__0 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:273:3: ( rule__ParameterIntegerType__Group__0 )
            // InternalRosSystemParser.g:273:4: rule__ParameterIntegerType__Group__0
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
    // InternalRosSystemParser.g:282:1: entryRuleParameterStringType : ruleParameterStringType EOF ;
    public final void entryRuleParameterStringType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:283:1: ( ruleParameterStringType EOF )
            // InternalRosSystemParser.g:284:1: ruleParameterStringType EOF
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
    // InternalRosSystemParser.g:291:1: ruleParameterStringType : ( ( rule__ParameterStringType__Group__0 ) ) ;
    public final void ruleParameterStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:295:2: ( ( ( rule__ParameterStringType__Group__0 ) ) )
            // InternalRosSystemParser.g:296:2: ( ( rule__ParameterStringType__Group__0 ) )
            {
            // InternalRosSystemParser.g:296:2: ( ( rule__ParameterStringType__Group__0 ) )
            // InternalRosSystemParser.g:297:3: ( rule__ParameterStringType__Group__0 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:298:3: ( rule__ParameterStringType__Group__0 )
            // InternalRosSystemParser.g:298:4: rule__ParameterStringType__Group__0
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
    // InternalRosSystemParser.g:307:1: entryRuleParameterDoubleType : ruleParameterDoubleType EOF ;
    public final void entryRuleParameterDoubleType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:308:1: ( ruleParameterDoubleType EOF )
            // InternalRosSystemParser.g:309:1: ruleParameterDoubleType EOF
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
    // InternalRosSystemParser.g:316:1: ruleParameterDoubleType : ( ( rule__ParameterDoubleType__Group__0 ) ) ;
    public final void ruleParameterDoubleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:320:2: ( ( ( rule__ParameterDoubleType__Group__0 ) ) )
            // InternalRosSystemParser.g:321:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            {
            // InternalRosSystemParser.g:321:2: ( ( rule__ParameterDoubleType__Group__0 ) )
            // InternalRosSystemParser.g:322:3: ( rule__ParameterDoubleType__Group__0 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:323:3: ( rule__ParameterDoubleType__Group__0 )
            // InternalRosSystemParser.g:323:4: rule__ParameterDoubleType__Group__0
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
    // InternalRosSystemParser.g:332:1: entryRuleParameterBooleanType : ruleParameterBooleanType EOF ;
    public final void entryRuleParameterBooleanType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:333:1: ( ruleParameterBooleanType EOF )
            // InternalRosSystemParser.g:334:1: ruleParameterBooleanType EOF
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
    // InternalRosSystemParser.g:341:1: ruleParameterBooleanType : ( ( rule__ParameterBooleanType__Group__0 ) ) ;
    public final void ruleParameterBooleanType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:345:2: ( ( ( rule__ParameterBooleanType__Group__0 ) ) )
            // InternalRosSystemParser.g:346:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            {
            // InternalRosSystemParser.g:346:2: ( ( rule__ParameterBooleanType__Group__0 ) )
            // InternalRosSystemParser.g:347:3: ( rule__ParameterBooleanType__Group__0 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:348:3: ( rule__ParameterBooleanType__Group__0 )
            // InternalRosSystemParser.g:348:4: rule__ParameterBooleanType__Group__0
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
    // InternalRosSystemParser.g:357:1: entryRuleParameterBase64Type : ruleParameterBase64Type EOF ;
    public final void entryRuleParameterBase64Type() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:358:1: ( ruleParameterBase64Type EOF )
            // InternalRosSystemParser.g:359:1: ruleParameterBase64Type EOF
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
    // InternalRosSystemParser.g:366:1: ruleParameterBase64Type : ( ( rule__ParameterBase64Type__Group__0 ) ) ;
    public final void ruleParameterBase64Type() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:370:2: ( ( ( rule__ParameterBase64Type__Group__0 ) ) )
            // InternalRosSystemParser.g:371:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            {
            // InternalRosSystemParser.g:371:2: ( ( rule__ParameterBase64Type__Group__0 ) )
            // InternalRosSystemParser.g:372:3: ( rule__ParameterBase64Type__Group__0 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup()); 
            // InternalRosSystemParser.g:373:3: ( rule__ParameterBase64Type__Group__0 )
            // InternalRosSystemParser.g:373:4: rule__ParameterBase64Type__Group__0
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
    // InternalRosSystemParser.g:382:1: entryRuleParameterArrayType : ruleParameterArrayType EOF ;
    public final void entryRuleParameterArrayType() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:383:1: ( ruleParameterArrayType EOF )
            // InternalRosSystemParser.g:384:1: ruleParameterArrayType EOF
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
    // InternalRosSystemParser.g:391:1: ruleParameterArrayType : ( ( rule__ParameterArrayType__Group__0 ) ) ;
    public final void ruleParameterArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:395:2: ( ( ( rule__ParameterArrayType__Group__0 ) ) )
            // InternalRosSystemParser.g:396:2: ( ( rule__ParameterArrayType__Group__0 ) )
            {
            // InternalRosSystemParser.g:396:2: ( ( rule__ParameterArrayType__Group__0 ) )
            // InternalRosSystemParser.g:397:3: ( rule__ParameterArrayType__Group__0 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup()); 
            // InternalRosSystemParser.g:398:3: ( rule__ParameterArrayType__Group__0 )
            // InternalRosSystemParser.g:398:4: rule__ParameterArrayType__Group__0
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
    // InternalRosSystemParser.g:407:1: entryRuleParameterList : ruleParameterList EOF ;
    public final void entryRuleParameterList() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:408:1: ( ruleParameterList EOF )
            // InternalRosSystemParser.g:409:1: ruleParameterList EOF
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
    // InternalRosSystemParser.g:416:1: ruleParameterList : ( ( rule__ParameterList__Group__0 ) ) ;
    public final void ruleParameterList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:420:2: ( ( ( rule__ParameterList__Group__0 ) ) )
            // InternalRosSystemParser.g:421:2: ( ( rule__ParameterList__Group__0 ) )
            {
            // InternalRosSystemParser.g:421:2: ( ( rule__ParameterList__Group__0 ) )
            // InternalRosSystemParser.g:422:3: ( rule__ParameterList__Group__0 )
            {
             before(grammarAccess.getParameterListAccess().getGroup()); 
            // InternalRosSystemParser.g:423:3: ( rule__ParameterList__Group__0 )
            // InternalRosSystemParser.g:423:4: rule__ParameterList__Group__0
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
    // InternalRosSystemParser.g:432:1: entryRuleParameterAny : ruleParameterAny EOF ;
    public final void entryRuleParameterAny() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:433:1: ( ruleParameterAny EOF )
            // InternalRosSystemParser.g:434:1: ruleParameterAny EOF
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
    // InternalRosSystemParser.g:441:1: ruleParameterAny : ( ( rule__ParameterAny__Group__0 ) ) ;
    public final void ruleParameterAny() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:445:2: ( ( ( rule__ParameterAny__Group__0 ) ) )
            // InternalRosSystemParser.g:446:2: ( ( rule__ParameterAny__Group__0 ) )
            {
            // InternalRosSystemParser.g:446:2: ( ( rule__ParameterAny__Group__0 ) )
            // InternalRosSystemParser.g:447:3: ( rule__ParameterAny__Group__0 )
            {
             before(grammarAccess.getParameterAnyAccess().getGroup()); 
            // InternalRosSystemParser.g:448:3: ( rule__ParameterAny__Group__0 )
            // InternalRosSystemParser.g:448:4: rule__ParameterAny__Group__0
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
    // InternalRosSystemParser.g:457:1: entryRuleParameterString : ruleParameterString EOF ;
    public final void entryRuleParameterString() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:458:1: ( ruleParameterString EOF )
            // InternalRosSystemParser.g:459:1: ruleParameterString EOF
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
    // InternalRosSystemParser.g:466:1: ruleParameterString : ( ( rule__ParameterString__ValueAssignment ) ) ;
    public final void ruleParameterString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:470:2: ( ( ( rule__ParameterString__ValueAssignment ) ) )
            // InternalRosSystemParser.g:471:2: ( ( rule__ParameterString__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:471:2: ( ( rule__ParameterString__ValueAssignment ) )
            // InternalRosSystemParser.g:472:3: ( rule__ParameterString__ValueAssignment )
            {
             before(grammarAccess.getParameterStringAccess().getValueAssignment()); 
            // InternalRosSystemParser.g:473:3: ( rule__ParameterString__ValueAssignment )
            // InternalRosSystemParser.g:473:4: rule__ParameterString__ValueAssignment
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
    // InternalRosSystemParser.g:482:1: entryRuleParameterBase64 : ruleParameterBase64 EOF ;
    public final void entryRuleParameterBase64() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:483:1: ( ruleParameterBase64 EOF )
            // InternalRosSystemParser.g:484:1: ruleParameterBase64 EOF
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
    // InternalRosSystemParser.g:491:1: ruleParameterBase64 : ( ( rule__ParameterBase64__ValueAssignment ) ) ;
    public final void ruleParameterBase64() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:495:2: ( ( ( rule__ParameterBase64__ValueAssignment ) ) )
            // InternalRosSystemParser.g:496:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:496:2: ( ( rule__ParameterBase64__ValueAssignment ) )
            // InternalRosSystemParser.g:497:3: ( rule__ParameterBase64__ValueAssignment )
            {
             before(grammarAccess.getParameterBase64Access().getValueAssignment()); 
            // InternalRosSystemParser.g:498:3: ( rule__ParameterBase64__ValueAssignment )
            // InternalRosSystemParser.g:498:4: rule__ParameterBase64__ValueAssignment
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
    // InternalRosSystemParser.g:507:1: entryRuleParameterInteger : ruleParameterInteger EOF ;
    public final void entryRuleParameterInteger() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:508:1: ( ruleParameterInteger EOF )
            // InternalRosSystemParser.g:509:1: ruleParameterInteger EOF
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
    // InternalRosSystemParser.g:516:1: ruleParameterInteger : ( ( rule__ParameterInteger__ValueAssignment ) ) ;
    public final void ruleParameterInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:520:2: ( ( ( rule__ParameterInteger__ValueAssignment ) ) )
            // InternalRosSystemParser.g:521:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:521:2: ( ( rule__ParameterInteger__ValueAssignment ) )
            // InternalRosSystemParser.g:522:3: ( rule__ParameterInteger__ValueAssignment )
            {
             before(grammarAccess.getParameterIntegerAccess().getValueAssignment()); 
            // InternalRosSystemParser.g:523:3: ( rule__ParameterInteger__ValueAssignment )
            // InternalRosSystemParser.g:523:4: rule__ParameterInteger__ValueAssignment
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
    // InternalRosSystemParser.g:532:1: entryRuleParameterDouble : ruleParameterDouble EOF ;
    public final void entryRuleParameterDouble() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:533:1: ( ruleParameterDouble EOF )
            // InternalRosSystemParser.g:534:1: ruleParameterDouble EOF
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
    // InternalRosSystemParser.g:541:1: ruleParameterDouble : ( ( rule__ParameterDouble__ValueAssignment ) ) ;
    public final void ruleParameterDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:545:2: ( ( ( rule__ParameterDouble__ValueAssignment ) ) )
            // InternalRosSystemParser.g:546:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:546:2: ( ( rule__ParameterDouble__ValueAssignment ) )
            // InternalRosSystemParser.g:547:3: ( rule__ParameterDouble__ValueAssignment )
            {
             before(grammarAccess.getParameterDoubleAccess().getValueAssignment()); 
            // InternalRosSystemParser.g:548:3: ( rule__ParameterDouble__ValueAssignment )
            // InternalRosSystemParser.g:548:4: rule__ParameterDouble__ValueAssignment
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
    // InternalRosSystemParser.g:557:1: entryRuleParameterBoolean : ruleParameterBoolean EOF ;
    public final void entryRuleParameterBoolean() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:558:1: ( ruleParameterBoolean EOF )
            // InternalRosSystemParser.g:559:1: ruleParameterBoolean EOF
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
    // InternalRosSystemParser.g:566:1: ruleParameterBoolean : ( ( rule__ParameterBoolean__ValueAssignment ) ) ;
    public final void ruleParameterBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:570:2: ( ( ( rule__ParameterBoolean__ValueAssignment ) ) )
            // InternalRosSystemParser.g:571:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:571:2: ( ( rule__ParameterBoolean__ValueAssignment ) )
            // InternalRosSystemParser.g:572:3: ( rule__ParameterBoolean__ValueAssignment )
            {
             before(grammarAccess.getParameterBooleanAccess().getValueAssignment()); 
            // InternalRosSystemParser.g:573:3: ( rule__ParameterBoolean__ValueAssignment )
            // InternalRosSystemParser.g:573:4: rule__ParameterBoolean__ValueAssignment
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


    // $ANTLR start "entryRuleParameterDate"
    // InternalRosSystemParser.g:582:1: entryRuleParameterDate : ruleParameterDate EOF ;
    public final void entryRuleParameterDate() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:583:1: ( ruleParameterDate EOF )
            // InternalRosSystemParser.g:584:1: ruleParameterDate EOF
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
    // InternalRosSystemParser.g:591:1: ruleParameterDate : ( ( rule__ParameterDate__ValueAssignment ) ) ;
    public final void ruleParameterDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:595:2: ( ( ( rule__ParameterDate__ValueAssignment ) ) )
            // InternalRosSystemParser.g:596:2: ( ( rule__ParameterDate__ValueAssignment ) )
            {
            // InternalRosSystemParser.g:596:2: ( ( rule__ParameterDate__ValueAssignment ) )
            // InternalRosSystemParser.g:597:3: ( rule__ParameterDate__ValueAssignment )
            {
             before(grammarAccess.getParameterDateAccess().getValueAssignment()); 
            // InternalRosSystemParser.g:598:3: ( rule__ParameterDate__ValueAssignment )
            // InternalRosSystemParser.g:598:4: rule__ParameterDate__ValueAssignment
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


    // $ANTLR start "entryRuleParameterStruct"
    // InternalRosSystemParser.g:607:1: entryRuleParameterStruct : ruleParameterStruct EOF ;
    public final void entryRuleParameterStruct() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:608:1: ( ruleParameterStruct EOF )
            // InternalRosSystemParser.g:609:1: ruleParameterStruct EOF
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
    // InternalRosSystemParser.g:616:1: ruleParameterStruct : ( ( rule__ParameterStruct__Group__0 ) ) ;
    public final void ruleParameterStruct() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:620:2: ( ( ( rule__ParameterStruct__Group__0 ) ) )
            // InternalRosSystemParser.g:621:2: ( ( rule__ParameterStruct__Group__0 ) )
            {
            // InternalRosSystemParser.g:621:2: ( ( rule__ParameterStruct__Group__0 ) )
            // InternalRosSystemParser.g:622:3: ( rule__ParameterStruct__Group__0 )
            {
             before(grammarAccess.getParameterStructAccess().getGroup()); 
            // InternalRosSystemParser.g:623:3: ( rule__ParameterStruct__Group__0 )
            // InternalRosSystemParser.g:623:4: rule__ParameterStruct__Group__0
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


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalRosSystemParser.g:632:1: entryRuleParameterStructMember : ruleParameterStructMember EOF ;
    public final void entryRuleParameterStructMember() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:633:1: ( ruleParameterStructMember EOF )
            // InternalRosSystemParser.g:634:1: ruleParameterStructMember EOF
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
    // InternalRosSystemParser.g:641:1: ruleParameterStructMember : ( ( rule__ParameterStructMember__Group__0 ) ) ;
    public final void ruleParameterStructMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:645:2: ( ( ( rule__ParameterStructMember__Group__0 ) ) )
            // InternalRosSystemParser.g:646:2: ( ( rule__ParameterStructMember__Group__0 ) )
            {
            // InternalRosSystemParser.g:646:2: ( ( rule__ParameterStructMember__Group__0 ) )
            // InternalRosSystemParser.g:647:3: ( rule__ParameterStructMember__Group__0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getGroup()); 
            // InternalRosSystemParser.g:648:3: ( rule__ParameterStructMember__Group__0 )
            // InternalRosSystemParser.g:648:4: rule__ParameterStructMember__Group__0
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
    // InternalRosSystemParser.g:657:1: entryRuleParameterStructTypeMember : ruleParameterStructTypeMember EOF ;
    public final void entryRuleParameterStructTypeMember() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:658:1: ( ruleParameterStructTypeMember EOF )
            // InternalRosSystemParser.g:659:1: ruleParameterStructTypeMember EOF
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
    // InternalRosSystemParser.g:666:1: ruleParameterStructTypeMember : ( ( rule__ParameterStructTypeMember__Group__0 ) ) ;
    public final void ruleParameterStructTypeMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:670:2: ( ( ( rule__ParameterStructTypeMember__Group__0 ) ) )
            // InternalRosSystemParser.g:671:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            {
            // InternalRosSystemParser.g:671:2: ( ( rule__ParameterStructTypeMember__Group__0 ) )
            // InternalRosSystemParser.g:672:3: ( rule__ParameterStructTypeMember__Group__0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getGroup()); 
            // InternalRosSystemParser.g:673:3: ( rule__ParameterStructTypeMember__Group__0 )
            // InternalRosSystemParser.g:673:4: rule__ParameterStructTypeMember__Group__0
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
    // InternalRosSystemParser.g:682:1: entryRuleBase64Binary : ruleBase64Binary EOF ;
    public final void entryRuleBase64Binary() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:683:1: ( ruleBase64Binary EOF )
            // InternalRosSystemParser.g:684:1: ruleBase64Binary EOF
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
    // InternalRosSystemParser.g:691:1: ruleBase64Binary : ( RULE_BINARY ) ;
    public final void ruleBase64Binary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:695:2: ( ( RULE_BINARY ) )
            // InternalRosSystemParser.g:696:2: ( RULE_BINARY )
            {
            // InternalRosSystemParser.g:696:2: ( RULE_BINARY )
            // InternalRosSystemParser.g:697:3: RULE_BINARY
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
    // InternalRosSystemParser.g:707:1: entryRuleboolean0 : ruleboolean0 EOF ;
    public final void entryRuleboolean0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:708:1: ( ruleboolean0 EOF )
            // InternalRosSystemParser.g:709:1: ruleboolean0 EOF
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
    // InternalRosSystemParser.g:716:1: ruleboolean0 : ( RULE_BOOLEAN ) ;
    public final void ruleboolean0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:720:2: ( ( RULE_BOOLEAN ) )
            // InternalRosSystemParser.g:721:2: ( RULE_BOOLEAN )
            {
            // InternalRosSystemParser.g:721:2: ( RULE_BOOLEAN )
            // InternalRosSystemParser.g:722:3: RULE_BOOLEAN
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
    // InternalRosSystemParser.g:732:1: entryRuleDouble0 : ruleDouble0 EOF ;
    public final void entryRuleDouble0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:733:1: ( ruleDouble0 EOF )
            // InternalRosSystemParser.g:734:1: ruleDouble0 EOF
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
    // InternalRosSystemParser.g:741:1: ruleDouble0 : ( RULE_DOUBLE ) ;
    public final void ruleDouble0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:745:2: ( ( RULE_DOUBLE ) )
            // InternalRosSystemParser.g:746:2: ( RULE_DOUBLE )
            {
            // InternalRosSystemParser.g:746:2: ( RULE_DOUBLE )
            // InternalRosSystemParser.g:747:3: RULE_DOUBLE
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
    // InternalRosSystemParser.g:757:1: entryRuleInteger0 : ruleInteger0 EOF ;
    public final void entryRuleInteger0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:758:1: ( ruleInteger0 EOF )
            // InternalRosSystemParser.g:759:1: ruleInteger0 EOF
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
    // InternalRosSystemParser.g:766:1: ruleInteger0 : ( RULE_DECINT ) ;
    public final void ruleInteger0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:770:2: ( ( RULE_DECINT ) )
            // InternalRosSystemParser.g:771:2: ( RULE_DECINT )
            {
            // InternalRosSystemParser.g:771:2: ( RULE_DECINT )
            // InternalRosSystemParser.g:772:3: RULE_DECINT
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
    // InternalRosSystemParser.g:782:1: entryRuleDateTime0 : ruleDateTime0 EOF ;
    public final void entryRuleDateTime0() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:783:1: ( ruleDateTime0 EOF )
            // InternalRosSystemParser.g:784:1: ruleDateTime0 EOF
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
    // InternalRosSystemParser.g:791:1: ruleDateTime0 : ( RULE_DATE_TIME ) ;
    public final void ruleDateTime0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:795:2: ( ( RULE_DATE_TIME ) )
            // InternalRosSystemParser.g:796:2: ( RULE_DATE_TIME )
            {
            // InternalRosSystemParser.g:796:2: ( RULE_DATE_TIME )
            // InternalRosSystemParser.g:797:3: RULE_DATE_TIME
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


    // $ANTLR start "entryRuleNamespace"
    // InternalRosSystemParser.g:807:1: entryRuleNamespace : ruleNamespace EOF ;
    public final void entryRuleNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:808:1: ( ruleNamespace EOF )
            // InternalRosSystemParser.g:809:1: ruleNamespace EOF
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
    // InternalRosSystemParser.g:816:1: ruleNamespace : ( ( rule__Namespace__Alternatives ) ) ;
    public final void ruleNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:820:2: ( ( ( rule__Namespace__Alternatives ) ) )
            // InternalRosSystemParser.g:821:2: ( ( rule__Namespace__Alternatives ) )
            {
            // InternalRosSystemParser.g:821:2: ( ( rule__Namespace__Alternatives ) )
            // InternalRosSystemParser.g:822:3: ( rule__Namespace__Alternatives )
            {
             before(grammarAccess.getNamespaceAccess().getAlternatives()); 
            // InternalRosSystemParser.g:823:3: ( rule__Namespace__Alternatives )
            // InternalRosSystemParser.g:823:4: rule__Namespace__Alternatives
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


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalRosSystemParser.g:832:1: entryRuleGlobalNamespace : ruleGlobalNamespace EOF ;
    public final void entryRuleGlobalNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:833:1: ( ruleGlobalNamespace EOF )
            // InternalRosSystemParser.g:834:1: ruleGlobalNamespace EOF
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
    // InternalRosSystemParser.g:841:1: ruleGlobalNamespace : ( ( rule__GlobalNamespace__Group__0 ) ) ;
    public final void ruleGlobalNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:845:2: ( ( ( rule__GlobalNamespace__Group__0 ) ) )
            // InternalRosSystemParser.g:846:2: ( ( rule__GlobalNamespace__Group__0 ) )
            {
            // InternalRosSystemParser.g:846:2: ( ( rule__GlobalNamespace__Group__0 ) )
            // InternalRosSystemParser.g:847:3: ( rule__GlobalNamespace__Group__0 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup()); 
            // InternalRosSystemParser.g:848:3: ( rule__GlobalNamespace__Group__0 )
            // InternalRosSystemParser.g:848:4: rule__GlobalNamespace__Group__0
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
    // InternalRosSystemParser.g:857:1: entryRuleRelativeNamespace_Impl : ruleRelativeNamespace_Impl EOF ;
    public final void entryRuleRelativeNamespace_Impl() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:858:1: ( ruleRelativeNamespace_Impl EOF )
            // InternalRosSystemParser.g:859:1: ruleRelativeNamespace_Impl EOF
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
    // InternalRosSystemParser.g:866:1: ruleRelativeNamespace_Impl : ( ( rule__RelativeNamespace_Impl__Group__0 ) ) ;
    public final void ruleRelativeNamespace_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:870:2: ( ( ( rule__RelativeNamespace_Impl__Group__0 ) ) )
            // InternalRosSystemParser.g:871:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            {
            // InternalRosSystemParser.g:871:2: ( ( rule__RelativeNamespace_Impl__Group__0 ) )
            // InternalRosSystemParser.g:872:3: ( rule__RelativeNamespace_Impl__Group__0 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup()); 
            // InternalRosSystemParser.g:873:3: ( rule__RelativeNamespace_Impl__Group__0 )
            // InternalRosSystemParser.g:873:4: rule__RelativeNamespace_Impl__Group__0
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
    // InternalRosSystemParser.g:882:1: entryRulePrivateNamespace : rulePrivateNamespace EOF ;
    public final void entryRulePrivateNamespace() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:883:1: ( rulePrivateNamespace EOF )
            // InternalRosSystemParser.g:884:1: rulePrivateNamespace EOF
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
    // InternalRosSystemParser.g:891:1: rulePrivateNamespace : ( ( rule__PrivateNamespace__Group__0 ) ) ;
    public final void rulePrivateNamespace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:895:2: ( ( ( rule__PrivateNamespace__Group__0 ) ) )
            // InternalRosSystemParser.g:896:2: ( ( rule__PrivateNamespace__Group__0 ) )
            {
            // InternalRosSystemParser.g:896:2: ( ( rule__PrivateNamespace__Group__0 ) )
            // InternalRosSystemParser.g:897:3: ( rule__PrivateNamespace__Group__0 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup()); 
            // InternalRosSystemParser.g:898:3: ( rule__PrivateNamespace__Group__0 )
            // InternalRosSystemParser.g:898:4: rule__PrivateNamespace__Group__0
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


    // $ANTLR start "entryRuleGraphName"
    // InternalRosSystemParser.g:907:1: entryRuleGraphName : ruleGraphName EOF ;
    public final void entryRuleGraphName() throws RecognitionException {
        try {
            // InternalRosSystemParser.g:908:1: ( ruleGraphName EOF )
            // InternalRosSystemParser.g:909:1: ruleGraphName EOF
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
    // InternalRosSystemParser.g:916:1: ruleGraphName : ( GraphName ) ;
    public final void ruleGraphName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:920:2: ( ( GraphName ) )
            // InternalRosSystemParser.g:921:2: ( GraphName )
            {
            // InternalRosSystemParser.g:921:2: ( GraphName )
            // InternalRosSystemParser.g:922:3: GraphName
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


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRosSystemParser.g:931:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:935:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRosSystemParser.g:936:2: ( RULE_STRING )
                    {
                    // InternalRosSystemParser.g:936:2: ( RULE_STRING )
                    // InternalRosSystemParser.g:937:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:942:2: ( RULE_ID )
                    {
                    // InternalRosSystemParser.g:942:2: ( RULE_ID )
                    // InternalRosSystemParser.g:943:3: RULE_ID
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


    // $ANTLR start "rule__ParameterType__Alternatives"
    // InternalRosSystemParser.g:952:1: rule__ParameterType__Alternatives : ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) );
    public final void rule__ParameterType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:956:1: ( ( ruleParameterListType ) | ( ruleParameterStructType ) | ( ruleParameterIntegerType ) | ( ruleParameterStringType ) | ( ruleParameterDoubleType ) | ( ruleParameterBooleanType ) | ( ruleParameterBase64Type ) | ( ruleParameterArrayType ) )
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
            case Array:
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
                    // InternalRosSystemParser.g:957:2: ( ruleParameterListType )
                    {
                    // InternalRosSystemParser.g:957:2: ( ruleParameterListType )
                    // InternalRosSystemParser.g:958:3: ruleParameterListType
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
                    // InternalRosSystemParser.g:963:2: ( ruleParameterStructType )
                    {
                    // InternalRosSystemParser.g:963:2: ( ruleParameterStructType )
                    // InternalRosSystemParser.g:964:3: ruleParameterStructType
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
                    // InternalRosSystemParser.g:969:2: ( ruleParameterIntegerType )
                    {
                    // InternalRosSystemParser.g:969:2: ( ruleParameterIntegerType )
                    // InternalRosSystemParser.g:970:3: ruleParameterIntegerType
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
                    // InternalRosSystemParser.g:975:2: ( ruleParameterStringType )
                    {
                    // InternalRosSystemParser.g:975:2: ( ruleParameterStringType )
                    // InternalRosSystemParser.g:976:3: ruleParameterStringType
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
                    // InternalRosSystemParser.g:981:2: ( ruleParameterDoubleType )
                    {
                    // InternalRosSystemParser.g:981:2: ( ruleParameterDoubleType )
                    // InternalRosSystemParser.g:982:3: ruleParameterDoubleType
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
                    // InternalRosSystemParser.g:987:2: ( ruleParameterBooleanType )
                    {
                    // InternalRosSystemParser.g:987:2: ( ruleParameterBooleanType )
                    // InternalRosSystemParser.g:988:3: ruleParameterBooleanType
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
                    // InternalRosSystemParser.g:993:2: ( ruleParameterBase64Type )
                    {
                    // InternalRosSystemParser.g:993:2: ( ruleParameterBase64Type )
                    // InternalRosSystemParser.g:994:3: ruleParameterBase64Type
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
                    // InternalRosSystemParser.g:999:2: ( ruleParameterArrayType )
                    {
                    // InternalRosSystemParser.g:999:2: ( ruleParameterArrayType )
                    // InternalRosSystemParser.g:1000:3: ruleParameterArrayType
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
    // InternalRosSystemParser.g:1009:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );
    public final void rule__ParameterValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1013:1: ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalRosSystemParser.g:1014:2: ( ruleParameterString )
                    {
                    // InternalRosSystemParser.g:1014:2: ( ruleParameterString )
                    // InternalRosSystemParser.g:1015:3: ruleParameterString
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
                    // InternalRosSystemParser.g:1020:2: ( ruleParameterBase64 )
                    {
                    // InternalRosSystemParser.g:1020:2: ( ruleParameterBase64 )
                    // InternalRosSystemParser.g:1021:3: ruleParameterBase64
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
                    // InternalRosSystemParser.g:1026:2: ( ruleParameterInteger )
                    {
                    // InternalRosSystemParser.g:1026:2: ( ruleParameterInteger )
                    // InternalRosSystemParser.g:1027:3: ruleParameterInteger
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
                    // InternalRosSystemParser.g:1032:2: ( ruleParameterDouble )
                    {
                    // InternalRosSystemParser.g:1032:2: ( ruleParameterDouble )
                    // InternalRosSystemParser.g:1033:3: ruleParameterDouble
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
                    // InternalRosSystemParser.g:1038:2: ( ruleParameterBoolean )
                    {
                    // InternalRosSystemParser.g:1038:2: ( ruleParameterBoolean )
                    // InternalRosSystemParser.g:1039:3: ruleParameterBoolean
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
                    // InternalRosSystemParser.g:1044:2: ( ruleParameterList )
                    {
                    // InternalRosSystemParser.g:1044:2: ( ruleParameterList )
                    // InternalRosSystemParser.g:1045:3: ruleParameterList
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
                    // InternalRosSystemParser.g:1050:2: ( ruleParameterStruct )
                    {
                    // InternalRosSystemParser.g:1050:2: ( ruleParameterStruct )
                    // InternalRosSystemParser.g:1051:3: ruleParameterStruct
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


    // $ANTLR start "rule__Namespace__Alternatives"
    // InternalRosSystemParser.g:1060:1: rule__Namespace__Alternatives : ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) );
    public final void rule__Namespace__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1064:1: ( ( ruleGlobalNamespace ) | ( ruleRelativeNamespace_Impl ) | ( rulePrivateNamespace ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt4=1;
                }
                break;
            case RelativeNamespace:
                {
                alt4=2;
                }
                break;
            case PrivateNamespace:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRosSystemParser.g:1065:2: ( ruleGlobalNamespace )
                    {
                    // InternalRosSystemParser.g:1065:2: ( ruleGlobalNamespace )
                    // InternalRosSystemParser.g:1066:3: ruleGlobalNamespace
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
                    // InternalRosSystemParser.g:1071:2: ( ruleRelativeNamespace_Impl )
                    {
                    // InternalRosSystemParser.g:1071:2: ( ruleRelativeNamespace_Impl )
                    // InternalRosSystemParser.g:1072:3: ruleRelativeNamespace_Impl
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
                    // InternalRosSystemParser.g:1077:2: ( rulePrivateNamespace )
                    {
                    // InternalRosSystemParser.g:1077:2: ( rulePrivateNamespace )
                    // InternalRosSystemParser.g:1078:3: rulePrivateNamespace
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


    // $ANTLR start "rule__RosSystem__Group__0"
    // InternalRosSystemParser.g:1087:1: rule__RosSystem__Group__0 : rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 ;
    public final void rule__RosSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1091:1: ( rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 )
            // InternalRosSystemParser.g:1092:2: rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1
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
    // InternalRosSystemParser.g:1099:1: rule__RosSystem__Group__0__Impl : ( () ) ;
    public final void rule__RosSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1103:1: ( ( () ) )
            // InternalRosSystemParser.g:1104:1: ( () )
            {
            // InternalRosSystemParser.g:1104:1: ( () )
            // InternalRosSystemParser.g:1105:2: ()
            {
             before(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); 
            // InternalRosSystemParser.g:1106:2: ()
            // InternalRosSystemParser.g:1106:3: 
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
    // InternalRosSystemParser.g:1114:1: rule__RosSystem__Group__1 : rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 ;
    public final void rule__RosSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1118:1: ( rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 )
            // InternalRosSystemParser.g:1119:2: rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2
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
    // InternalRosSystemParser.g:1126:1: rule__RosSystem__Group__1__Impl : ( ( rule__RosSystem__NameAssignment_1 ) ) ;
    public final void rule__RosSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1130:1: ( ( ( rule__RosSystem__NameAssignment_1 ) ) )
            // InternalRosSystemParser.g:1131:1: ( ( rule__RosSystem__NameAssignment_1 ) )
            {
            // InternalRosSystemParser.g:1131:1: ( ( rule__RosSystem__NameAssignment_1 ) )
            // InternalRosSystemParser.g:1132:2: ( rule__RosSystem__NameAssignment_1 )
            {
             before(grammarAccess.getRosSystemAccess().getNameAssignment_1()); 
            // InternalRosSystemParser.g:1133:2: ( rule__RosSystem__NameAssignment_1 )
            // InternalRosSystemParser.g:1133:3: rule__RosSystem__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1141:1: rule__RosSystem__Group__2 : rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 ;
    public final void rule__RosSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1145:1: ( rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 )
            // InternalRosSystemParser.g:1146:2: rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3
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
    // InternalRosSystemParser.g:1153:1: rule__RosSystem__Group__2__Impl : ( Colon ) ;
    public final void rule__RosSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1157:1: ( ( Colon ) )
            // InternalRosSystemParser.g:1158:1: ( Colon )
            {
            // InternalRosSystemParser.g:1158:1: ( Colon )
            // InternalRosSystemParser.g:1159:2: Colon
            {
             before(grammarAccess.getRosSystemAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1168:1: rule__RosSystem__Group__3 : rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 ;
    public final void rule__RosSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1172:1: ( rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 )
            // InternalRosSystemParser.g:1173:2: rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalRosSystemParser.g:1180:1: rule__RosSystem__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1184:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:1185:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:1185:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:1186:2: RULE_BEGIN
            {
             before(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1195:1: rule__RosSystem__Group__4 : rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 ;
    public final void rule__RosSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1199:1: ( rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 )
            // InternalRosSystemParser.g:1200:2: rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystemParser.g:1207:1: rule__RosSystem__Group__4__Impl : ( ( rule__RosSystem__RosnodeAssignment_4 ) ) ;
    public final void rule__RosSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1211:1: ( ( ( rule__RosSystem__RosnodeAssignment_4 ) ) )
            // InternalRosSystemParser.g:1212:1: ( ( rule__RosSystem__RosnodeAssignment_4 ) )
            {
            // InternalRosSystemParser.g:1212:1: ( ( rule__RosSystem__RosnodeAssignment_4 ) )
            // InternalRosSystemParser.g:1213:2: ( rule__RosSystem__RosnodeAssignment_4 )
            {
             before(grammarAccess.getRosSystemAccess().getRosnodeAssignment_4()); 
            // InternalRosSystemParser.g:1214:2: ( rule__RosSystem__RosnodeAssignment_4 )
            // InternalRosSystemParser.g:1214:3: rule__RosSystem__RosnodeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__RosnodeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getRosnodeAssignment_4()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1222:1: rule__RosSystem__Group__5 : rule__RosSystem__Group__5__Impl ;
    public final void rule__RosSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1226:1: ( rule__RosSystem__Group__5__Impl )
            // InternalRosSystemParser.g:1227:2: rule__RosSystem__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:1233:1: rule__RosSystem__Group__5__Impl : ( RULE_END ) ;
    public final void rule__RosSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1237:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:1238:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:1238:1: ( RULE_END )
            // InternalRosSystemParser.g:1239:2: RULE_END
            {
             before(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__RosNode__Group__0"
    // InternalRosSystemParser.g:1249:1: rule__RosNode__Group__0 : rule__RosNode__Group__0__Impl rule__RosNode__Group__1 ;
    public final void rule__RosNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1253:1: ( rule__RosNode__Group__0__Impl rule__RosNode__Group__1 )
            // InternalRosSystemParser.g:1254:2: rule__RosNode__Group__0__Impl rule__RosNode__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalRosSystemParser.g:1261:1: rule__RosNode__Group__0__Impl : ( ( rule__RosNode__NameAssignment_0 ) ) ;
    public final void rule__RosNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1265:1: ( ( ( rule__RosNode__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:1266:1: ( ( rule__RosNode__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:1266:1: ( ( rule__RosNode__NameAssignment_0 ) )
            // InternalRosSystemParser.g:1267:2: ( rule__RosNode__NameAssignment_0 )
            {
             before(grammarAccess.getRosNodeAccess().getNameAssignment_0()); 
            // InternalRosSystemParser.g:1268:2: ( rule__RosNode__NameAssignment_0 )
            // InternalRosSystemParser.g:1268:3: rule__RosNode__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRosNodeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__Group__0__Impl"


    // $ANTLR start "rule__RosNode__Group__1"
    // InternalRosSystemParser.g:1276:1: rule__RosNode__Group__1 : rule__RosNode__Group__1__Impl rule__RosNode__Group__2 ;
    public final void rule__RosNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1280:1: ( rule__RosNode__Group__1__Impl rule__RosNode__Group__2 )
            // InternalRosSystemParser.g:1281:2: rule__RosNode__Group__1__Impl rule__RosNode__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalRosSystemParser.g:1288:1: rule__RosNode__Group__1__Impl : ( Colon ) ;
    public final void rule__RosNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1292:1: ( ( Colon ) )
            // InternalRosSystemParser.g:1293:1: ( Colon )
            {
            // InternalRosSystemParser.g:1293:1: ( Colon )
            // InternalRosSystemParser.g:1294:2: Colon
            {
             before(grammarAccess.getRosNodeAccess().getColonKeyword_1()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1303:1: rule__RosNode__Group__2 : rule__RosNode__Group__2__Impl rule__RosNode__Group__3 ;
    public final void rule__RosNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1307:1: ( rule__RosNode__Group__2__Impl rule__RosNode__Group__3 )
            // InternalRosSystemParser.g:1308:2: rule__RosNode__Group__2__Impl rule__RosNode__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalRosSystemParser.g:1315:1: rule__RosNode__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__RosNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1319:1: ( ( RULE_BEGIN ) )
            // InternalRosSystemParser.g:1320:1: ( RULE_BEGIN )
            {
            // InternalRosSystemParser.g:1320:1: ( RULE_BEGIN )
            // InternalRosSystemParser.g:1321:2: RULE_BEGIN
            {
             before(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1330:1: rule__RosNode__Group__3 : rule__RosNode__Group__3__Impl rule__RosNode__Group__4 ;
    public final void rule__RosNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1334:1: ( rule__RosNode__Group__3__Impl rule__RosNode__Group__4 )
            // InternalRosSystemParser.g:1335:2: rule__RosNode__Group__3__Impl rule__RosNode__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalRosSystemParser.g:1342:1: rule__RosNode__Group__3__Impl : ( From ) ;
    public final void rule__RosNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1346:1: ( ( From ) )
            // InternalRosSystemParser.g:1347:1: ( From )
            {
            // InternalRosSystemParser.g:1347:1: ( From )
            // InternalRosSystemParser.g:1348:2: From
            {
             before(grammarAccess.getRosNodeAccess().getFromKeyword_3()); 
            match(input,From,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getFromKeyword_3()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1357:1: rule__RosNode__Group__4 : rule__RosNode__Group__4__Impl rule__RosNode__Group__5 ;
    public final void rule__RosNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1361:1: ( rule__RosNode__Group__4__Impl rule__RosNode__Group__5 )
            // InternalRosSystemParser.g:1362:2: rule__RosNode__Group__4__Impl rule__RosNode__Group__5
            {
            pushFollow(FOLLOW_6);
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
    // InternalRosSystemParser.g:1369:1: rule__RosNode__Group__4__Impl : ( ( rule__RosNode__FromAssignment_4 ) ) ;
    public final void rule__RosNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1373:1: ( ( ( rule__RosNode__FromAssignment_4 ) ) )
            // InternalRosSystemParser.g:1374:1: ( ( rule__RosNode__FromAssignment_4 ) )
            {
            // InternalRosSystemParser.g:1374:1: ( ( rule__RosNode__FromAssignment_4 ) )
            // InternalRosSystemParser.g:1375:2: ( rule__RosNode__FromAssignment_4 )
            {
             before(grammarAccess.getRosNodeAccess().getFromAssignment_4()); 
            // InternalRosSystemParser.g:1376:2: ( rule__RosNode__FromAssignment_4 )
            // InternalRosSystemParser.g:1376:3: rule__RosNode__FromAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__FromAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRosNodeAccess().getFromAssignment_4()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1384:1: rule__RosNode__Group__5 : rule__RosNode__Group__5__Impl ;
    public final void rule__RosNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1388:1: ( rule__RosNode__Group__5__Impl )
            // InternalRosSystemParser.g:1389:2: rule__RosNode__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosNode__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:1395:1: rule__RosNode__Group__5__Impl : ( RULE_END ) ;
    public final void rule__RosNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1399:1: ( ( RULE_END ) )
            // InternalRosSystemParser.g:1400:1: ( RULE_END )
            {
            // InternalRosSystemParser.g:1400:1: ( RULE_END )
            // InternalRosSystemParser.g:1401:2: RULE_END
            {
             before(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParameterListType__Group__0"
    // InternalRosSystemParser.g:1411:1: rule__ParameterListType__Group__0 : rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 ;
    public final void rule__ParameterListType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1415:1: ( rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1 )
            // InternalRosSystemParser.g:1416:2: rule__ParameterListType__Group__0__Impl rule__ParameterListType__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalRosSystemParser.g:1423:1: rule__ParameterListType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterListType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1427:1: ( ( () ) )
            // InternalRosSystemParser.g:1428:1: ( () )
            {
            // InternalRosSystemParser.g:1428:1: ( () )
            // InternalRosSystemParser.g:1429:2: ()
            {
             before(grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0()); 
            // InternalRosSystemParser.g:1430:2: ()
            // InternalRosSystemParser.g:1430:3: 
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
    // InternalRosSystemParser.g:1438:1: rule__ParameterListType__Group__1 : rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 ;
    public final void rule__ParameterListType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1442:1: ( rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2 )
            // InternalRosSystemParser.g:1443:2: rule__ParameterListType__Group__1__Impl rule__ParameterListType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystemParser.g:1450:1: rule__ParameterListType__Group__1__Impl : ( List ) ;
    public final void rule__ParameterListType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1454:1: ( ( List ) )
            // InternalRosSystemParser.g:1455:1: ( List )
            {
            // InternalRosSystemParser.g:1455:1: ( List )
            // InternalRosSystemParser.g:1456:2: List
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
    // InternalRosSystemParser.g:1465:1: rule__ParameterListType__Group__2 : rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 ;
    public final void rule__ParameterListType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1469:1: ( rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3 )
            // InternalRosSystemParser.g:1470:2: rule__ParameterListType__Group__2__Impl rule__ParameterListType__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalRosSystemParser.g:1477:1: rule__ParameterListType__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ParameterListType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1481:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:1482:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:1482:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:1483:2: LeftCurlyBracket
            {
             before(grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1492:1: rule__ParameterListType__Group__3 : rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 ;
    public final void rule__ParameterListType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1496:1: ( rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4 )
            // InternalRosSystemParser.g:1497:2: rule__ParameterListType__Group__3__Impl rule__ParameterListType__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:1504:1: rule__ParameterListType__Group__3__Impl : ( ( rule__ParameterListType__SequenceAssignment_3 ) ) ;
    public final void rule__ParameterListType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1508:1: ( ( ( rule__ParameterListType__SequenceAssignment_3 ) ) )
            // InternalRosSystemParser.g:1509:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            {
            // InternalRosSystemParser.g:1509:1: ( ( rule__ParameterListType__SequenceAssignment_3 ) )
            // InternalRosSystemParser.g:1510:2: ( rule__ParameterListType__SequenceAssignment_3 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3()); 
            // InternalRosSystemParser.g:1511:2: ( rule__ParameterListType__SequenceAssignment_3 )
            // InternalRosSystemParser.g:1511:3: rule__ParameterListType__SequenceAssignment_3
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
    // InternalRosSystemParser.g:1519:1: rule__ParameterListType__Group__4 : rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 ;
    public final void rule__ParameterListType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1523:1: ( rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5 )
            // InternalRosSystemParser.g:1524:2: rule__ParameterListType__Group__4__Impl rule__ParameterListType__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:1531:1: rule__ParameterListType__Group__4__Impl : ( ( rule__ParameterListType__Group_4__0 )* ) ;
    public final void rule__ParameterListType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1535:1: ( ( ( rule__ParameterListType__Group_4__0 )* ) )
            // InternalRosSystemParser.g:1536:1: ( ( rule__ParameterListType__Group_4__0 )* )
            {
            // InternalRosSystemParser.g:1536:1: ( ( rule__ParameterListType__Group_4__0 )* )
            // InternalRosSystemParser.g:1537:2: ( rule__ParameterListType__Group_4__0 )*
            {
             before(grammarAccess.getParameterListTypeAccess().getGroup_4()); 
            // InternalRosSystemParser.g:1538:2: ( rule__ParameterListType__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Comma) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRosSystemParser.g:1538:3: rule__ParameterListType__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ParameterListType__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // InternalRosSystemParser.g:1546:1: rule__ParameterListType__Group__5 : rule__ParameterListType__Group__5__Impl ;
    public final void rule__ParameterListType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1550:1: ( rule__ParameterListType__Group__5__Impl )
            // InternalRosSystemParser.g:1551:2: rule__ParameterListType__Group__5__Impl
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
    // InternalRosSystemParser.g:1557:1: rule__ParameterListType__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__ParameterListType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1561:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:1562:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:1562:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:1563:2: RightCurlyBracket
            {
             before(grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1573:1: rule__ParameterListType__Group_4__0 : rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 ;
    public final void rule__ParameterListType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1577:1: ( rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1 )
            // InternalRosSystemParser.g:1578:2: rule__ParameterListType__Group_4__0__Impl rule__ParameterListType__Group_4__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRosSystemParser.g:1585:1: rule__ParameterListType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterListType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1589:1: ( ( Comma ) )
            // InternalRosSystemParser.g:1590:1: ( Comma )
            {
            // InternalRosSystemParser.g:1590:1: ( Comma )
            // InternalRosSystemParser.g:1591:2: Comma
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
    // InternalRosSystemParser.g:1600:1: rule__ParameterListType__Group_4__1 : rule__ParameterListType__Group_4__1__Impl ;
    public final void rule__ParameterListType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1604:1: ( rule__ParameterListType__Group_4__1__Impl )
            // InternalRosSystemParser.g:1605:2: rule__ParameterListType__Group_4__1__Impl
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
    // InternalRosSystemParser.g:1611:1: rule__ParameterListType__Group_4__1__Impl : ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) ;
    public final void rule__ParameterListType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1615:1: ( ( ( rule__ParameterListType__SequenceAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:1616:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:1616:1: ( ( rule__ParameterListType__SequenceAssignment_4_1 ) )
            // InternalRosSystemParser.g:1617:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            {
             before(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1()); 
            // InternalRosSystemParser.g:1618:2: ( rule__ParameterListType__SequenceAssignment_4_1 )
            // InternalRosSystemParser.g:1618:3: rule__ParameterListType__SequenceAssignment_4_1
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
    // InternalRosSystemParser.g:1627:1: rule__ParameterStructType__Group__0 : rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 ;
    public final void rule__ParameterStructType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1631:1: ( rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1 )
            // InternalRosSystemParser.g:1632:2: rule__ParameterStructType__Group__0__Impl rule__ParameterStructType__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRosSystemParser.g:1639:1: rule__ParameterStructType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStructType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1643:1: ( ( () ) )
            // InternalRosSystemParser.g:1644:1: ( () )
            {
            // InternalRosSystemParser.g:1644:1: ( () )
            // InternalRosSystemParser.g:1645:2: ()
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0()); 
            // InternalRosSystemParser.g:1646:2: ()
            // InternalRosSystemParser.g:1646:3: 
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
    // InternalRosSystemParser.g:1654:1: rule__ParameterStructType__Group__1 : rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 ;
    public final void rule__ParameterStructType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1658:1: ( rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2 )
            // InternalRosSystemParser.g:1659:2: rule__ParameterStructType__Group__1__Impl rule__ParameterStructType__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystemParser.g:1666:1: rule__ParameterStructType__Group__1__Impl : ( Struct ) ;
    public final void rule__ParameterStructType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1670:1: ( ( Struct ) )
            // InternalRosSystemParser.g:1671:1: ( Struct )
            {
            // InternalRosSystemParser.g:1671:1: ( Struct )
            // InternalRosSystemParser.g:1672:2: Struct
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
    // InternalRosSystemParser.g:1681:1: rule__ParameterStructType__Group__2 : rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 ;
    public final void rule__ParameterStructType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1685:1: ( rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3 )
            // InternalRosSystemParser.g:1686:2: rule__ParameterStructType__Group__2__Impl rule__ParameterStructType__Group__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalRosSystemParser.g:1693:1: rule__ParameterStructType__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ParameterStructType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1697:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:1698:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:1698:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:1699:2: LeftCurlyBracket
            {
             before(grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1708:1: rule__ParameterStructType__Group__3 : rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 ;
    public final void rule__ParameterStructType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1712:1: ( rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4 )
            // InternalRosSystemParser.g:1713:2: rule__ParameterStructType__Group__3__Impl rule__ParameterStructType__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:1720:1: rule__ParameterStructType__Group__3__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) ;
    public final void rule__ParameterStructType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1724:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) ) )
            // InternalRosSystemParser.g:1725:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            {
            // InternalRosSystemParser.g:1725:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 ) )
            // InternalRosSystemParser.g:1726:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3()); 
            // InternalRosSystemParser.g:1727:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_3 )
            // InternalRosSystemParser.g:1727:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_3
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
    // InternalRosSystemParser.g:1735:1: rule__ParameterStructType__Group__4 : rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 ;
    public final void rule__ParameterStructType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1739:1: ( rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5 )
            // InternalRosSystemParser.g:1740:2: rule__ParameterStructType__Group__4__Impl rule__ParameterStructType__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:1747:1: rule__ParameterStructType__Group__4__Impl : ( ( rule__ParameterStructType__Group_4__0 )* ) ;
    public final void rule__ParameterStructType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1751:1: ( ( ( rule__ParameterStructType__Group_4__0 )* ) )
            // InternalRosSystemParser.g:1752:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            {
            // InternalRosSystemParser.g:1752:1: ( ( rule__ParameterStructType__Group_4__0 )* )
            // InternalRosSystemParser.g:1753:2: ( rule__ParameterStructType__Group_4__0 )*
            {
             before(grammarAccess.getParameterStructTypeAccess().getGroup_4()); 
            // InternalRosSystemParser.g:1754:2: ( rule__ParameterStructType__Group_4__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Comma) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRosSystemParser.g:1754:3: rule__ParameterStructType__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ParameterStructType__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalRosSystemParser.g:1762:1: rule__ParameterStructType__Group__5 : rule__ParameterStructType__Group__5__Impl ;
    public final void rule__ParameterStructType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1766:1: ( rule__ParameterStructType__Group__5__Impl )
            // InternalRosSystemParser.g:1767:2: rule__ParameterStructType__Group__5__Impl
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
    // InternalRosSystemParser.g:1773:1: rule__ParameterStructType__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__ParameterStructType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1777:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:1778:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:1778:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:1779:2: RightCurlyBracket
            {
             before(grammarAccess.getParameterStructTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:1789:1: rule__ParameterStructType__Group_4__0 : rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 ;
    public final void rule__ParameterStructType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1793:1: ( rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1 )
            // InternalRosSystemParser.g:1794:2: rule__ParameterStructType__Group_4__0__Impl rule__ParameterStructType__Group_4__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRosSystemParser.g:1801:1: rule__ParameterStructType__Group_4__0__Impl : ( Comma ) ;
    public final void rule__ParameterStructType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1805:1: ( ( Comma ) )
            // InternalRosSystemParser.g:1806:1: ( Comma )
            {
            // InternalRosSystemParser.g:1806:1: ( Comma )
            // InternalRosSystemParser.g:1807:2: Comma
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
    // InternalRosSystemParser.g:1816:1: rule__ParameterStructType__Group_4__1 : rule__ParameterStructType__Group_4__1__Impl ;
    public final void rule__ParameterStructType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1820:1: ( rule__ParameterStructType__Group_4__1__Impl )
            // InternalRosSystemParser.g:1821:2: rule__ParameterStructType__Group_4__1__Impl
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
    // InternalRosSystemParser.g:1827:1: rule__ParameterStructType__Group_4__1__Impl : ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) ;
    public final void rule__ParameterStructType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1831:1: ( ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:1832:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:1832:1: ( ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 ) )
            // InternalRosSystemParser.g:1833:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            {
             before(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1()); 
            // InternalRosSystemParser.g:1834:2: ( rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 )
            // InternalRosSystemParser.g:1834:3: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1
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
    // InternalRosSystemParser.g:1843:1: rule__ParameterIntegerType__Group__0 : rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 ;
    public final void rule__ParameterIntegerType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1847:1: ( rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1 )
            // InternalRosSystemParser.g:1848:2: rule__ParameterIntegerType__Group__0__Impl rule__ParameterIntegerType__Group__1
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
    // InternalRosSystemParser.g:1855:1: rule__ParameterIntegerType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterIntegerType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1859:1: ( ( () ) )
            // InternalRosSystemParser.g:1860:1: ( () )
            {
            // InternalRosSystemParser.g:1860:1: ( () )
            // InternalRosSystemParser.g:1861:2: ()
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0()); 
            // InternalRosSystemParser.g:1862:2: ()
            // InternalRosSystemParser.g:1862:3: 
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
    // InternalRosSystemParser.g:1870:1: rule__ParameterIntegerType__Group__1 : rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 ;
    public final void rule__ParameterIntegerType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1874:1: ( rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2 )
            // InternalRosSystemParser.g:1875:2: rule__ParameterIntegerType__Group__1__Impl rule__ParameterIntegerType__Group__2
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
    // InternalRosSystemParser.g:1882:1: rule__ParameterIntegerType__Group__1__Impl : ( Integer ) ;
    public final void rule__ParameterIntegerType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1886:1: ( ( Integer ) )
            // InternalRosSystemParser.g:1887:1: ( Integer )
            {
            // InternalRosSystemParser.g:1887:1: ( Integer )
            // InternalRosSystemParser.g:1888:2: Integer
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
    // InternalRosSystemParser.g:1897:1: rule__ParameterIntegerType__Group__2 : rule__ParameterIntegerType__Group__2__Impl ;
    public final void rule__ParameterIntegerType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1901:1: ( rule__ParameterIntegerType__Group__2__Impl )
            // InternalRosSystemParser.g:1902:2: rule__ParameterIntegerType__Group__2__Impl
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
    // InternalRosSystemParser.g:1908:1: rule__ParameterIntegerType__Group__2__Impl : ( ( rule__ParameterIntegerType__Group_2__0 )? ) ;
    public final void rule__ParameterIntegerType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1912:1: ( ( ( rule__ParameterIntegerType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:1913:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:1913:1: ( ( rule__ParameterIntegerType__Group_2__0 )? )
            // InternalRosSystemParser.g:1914:2: ( rule__ParameterIntegerType__Group_2__0 )?
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getGroup_2()); 
            // InternalRosSystemParser.g:1915:2: ( rule__ParameterIntegerType__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Default) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_DECINT) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalRosSystemParser.g:1915:3: rule__ParameterIntegerType__Group_2__0
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
    // InternalRosSystemParser.g:1924:1: rule__ParameterIntegerType__Group_2__0 : rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 ;
    public final void rule__ParameterIntegerType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1928:1: ( rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1 )
            // InternalRosSystemParser.g:1929:2: rule__ParameterIntegerType__Group_2__0__Impl rule__ParameterIntegerType__Group_2__1
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
    // InternalRosSystemParser.g:1936:1: rule__ParameterIntegerType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterIntegerType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1940:1: ( ( Default ) )
            // InternalRosSystemParser.g:1941:1: ( Default )
            {
            // InternalRosSystemParser.g:1941:1: ( Default )
            // InternalRosSystemParser.g:1942:2: Default
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
    // InternalRosSystemParser.g:1951:1: rule__ParameterIntegerType__Group_2__1 : rule__ParameterIntegerType__Group_2__1__Impl ;
    public final void rule__ParameterIntegerType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1955:1: ( rule__ParameterIntegerType__Group_2__1__Impl )
            // InternalRosSystemParser.g:1956:2: rule__ParameterIntegerType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:1962:1: rule__ParameterIntegerType__Group_2__1__Impl : ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterIntegerType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1966:1: ( ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:1967:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:1967:1: ( ( rule__ParameterIntegerType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:1968:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1()); 
            // InternalRosSystemParser.g:1969:2: ( rule__ParameterIntegerType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:1969:3: rule__ParameterIntegerType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:1978:1: rule__ParameterStringType__Group__0 : rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 ;
    public final void rule__ParameterStringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1982:1: ( rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1 )
            // InternalRosSystemParser.g:1983:2: rule__ParameterStringType__Group__0__Impl rule__ParameterStringType__Group__1
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
    // InternalRosSystemParser.g:1990:1: rule__ParameterStringType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:1994:1: ( ( () ) )
            // InternalRosSystemParser.g:1995:1: ( () )
            {
            // InternalRosSystemParser.g:1995:1: ( () )
            // InternalRosSystemParser.g:1996:2: ()
            {
             before(grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0()); 
            // InternalRosSystemParser.g:1997:2: ()
            // InternalRosSystemParser.g:1997:3: 
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
    // InternalRosSystemParser.g:2005:1: rule__ParameterStringType__Group__1 : rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 ;
    public final void rule__ParameterStringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2009:1: ( rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2 )
            // InternalRosSystemParser.g:2010:2: rule__ParameterStringType__Group__1__Impl rule__ParameterStringType__Group__2
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
    // InternalRosSystemParser.g:2017:1: rule__ParameterStringType__Group__1__Impl : ( String ) ;
    public final void rule__ParameterStringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2021:1: ( ( String ) )
            // InternalRosSystemParser.g:2022:1: ( String )
            {
            // InternalRosSystemParser.g:2022:1: ( String )
            // InternalRosSystemParser.g:2023:2: String
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
    // InternalRosSystemParser.g:2032:1: rule__ParameterStringType__Group__2 : rule__ParameterStringType__Group__2__Impl ;
    public final void rule__ParameterStringType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2036:1: ( rule__ParameterStringType__Group__2__Impl )
            // InternalRosSystemParser.g:2037:2: rule__ParameterStringType__Group__2__Impl
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
    // InternalRosSystemParser.g:2043:1: rule__ParameterStringType__Group__2__Impl : ( ( rule__ParameterStringType__Group_2__0 )? ) ;
    public final void rule__ParameterStringType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2047:1: ( ( ( rule__ParameterStringType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:2048:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:2048:1: ( ( rule__ParameterStringType__Group_2__0 )? )
            // InternalRosSystemParser.g:2049:2: ( rule__ParameterStringType__Group_2__0 )?
            {
             before(grammarAccess.getParameterStringTypeAccess().getGroup_2()); 
            // InternalRosSystemParser.g:2050:2: ( rule__ParameterStringType__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Default) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID||LA8_1==RULE_STRING) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalRosSystemParser.g:2050:3: rule__ParameterStringType__Group_2__0
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
    // InternalRosSystemParser.g:2059:1: rule__ParameterStringType__Group_2__0 : rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 ;
    public final void rule__ParameterStringType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2063:1: ( rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1 )
            // InternalRosSystemParser.g:2064:2: rule__ParameterStringType__Group_2__0__Impl rule__ParameterStringType__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRosSystemParser.g:2071:1: rule__ParameterStringType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterStringType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2075:1: ( ( Default ) )
            // InternalRosSystemParser.g:2076:1: ( Default )
            {
            // InternalRosSystemParser.g:2076:1: ( Default )
            // InternalRosSystemParser.g:2077:2: Default
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
    // InternalRosSystemParser.g:2086:1: rule__ParameterStringType__Group_2__1 : rule__ParameterStringType__Group_2__1__Impl ;
    public final void rule__ParameterStringType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2090:1: ( rule__ParameterStringType__Group_2__1__Impl )
            // InternalRosSystemParser.g:2091:2: rule__ParameterStringType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:2097:1: rule__ParameterStringType__Group_2__1__Impl : ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterStringType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2101:1: ( ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:2102:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:2102:1: ( ( rule__ParameterStringType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:2103:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1()); 
            // InternalRosSystemParser.g:2104:2: ( rule__ParameterStringType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:2104:3: rule__ParameterStringType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:2113:1: rule__ParameterDoubleType__Group__0 : rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 ;
    public final void rule__ParameterDoubleType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2117:1: ( rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1 )
            // InternalRosSystemParser.g:2118:2: rule__ParameterDoubleType__Group__0__Impl rule__ParameterDoubleType__Group__1
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
    // InternalRosSystemParser.g:2125:1: rule__ParameterDoubleType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDoubleType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2129:1: ( ( () ) )
            // InternalRosSystemParser.g:2130:1: ( () )
            {
            // InternalRosSystemParser.g:2130:1: ( () )
            // InternalRosSystemParser.g:2131:2: ()
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0()); 
            // InternalRosSystemParser.g:2132:2: ()
            // InternalRosSystemParser.g:2132:3: 
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
    // InternalRosSystemParser.g:2140:1: rule__ParameterDoubleType__Group__1 : rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 ;
    public final void rule__ParameterDoubleType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2144:1: ( rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2 )
            // InternalRosSystemParser.g:2145:2: rule__ParameterDoubleType__Group__1__Impl rule__ParameterDoubleType__Group__2
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
    // InternalRosSystemParser.g:2152:1: rule__ParameterDoubleType__Group__1__Impl : ( Double ) ;
    public final void rule__ParameterDoubleType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2156:1: ( ( Double ) )
            // InternalRosSystemParser.g:2157:1: ( Double )
            {
            // InternalRosSystemParser.g:2157:1: ( Double )
            // InternalRosSystemParser.g:2158:2: Double
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
    // InternalRosSystemParser.g:2167:1: rule__ParameterDoubleType__Group__2 : rule__ParameterDoubleType__Group__2__Impl ;
    public final void rule__ParameterDoubleType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2171:1: ( rule__ParameterDoubleType__Group__2__Impl )
            // InternalRosSystemParser.g:2172:2: rule__ParameterDoubleType__Group__2__Impl
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
    // InternalRosSystemParser.g:2178:1: rule__ParameterDoubleType__Group__2__Impl : ( ( rule__ParameterDoubleType__Group_2__0 )? ) ;
    public final void rule__ParameterDoubleType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2182:1: ( ( ( rule__ParameterDoubleType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:2183:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:2183:1: ( ( rule__ParameterDoubleType__Group_2__0 )? )
            // InternalRosSystemParser.g:2184:2: ( rule__ParameterDoubleType__Group_2__0 )?
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getGroup_2()); 
            // InternalRosSystemParser.g:2185:2: ( rule__ParameterDoubleType__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Default) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==RULE_DOUBLE) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalRosSystemParser.g:2185:3: rule__ParameterDoubleType__Group_2__0
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
    // InternalRosSystemParser.g:2194:1: rule__ParameterDoubleType__Group_2__0 : rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 ;
    public final void rule__ParameterDoubleType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2198:1: ( rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1 )
            // InternalRosSystemParser.g:2199:2: rule__ParameterDoubleType__Group_2__0__Impl rule__ParameterDoubleType__Group_2__1
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
    // InternalRosSystemParser.g:2206:1: rule__ParameterDoubleType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterDoubleType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2210:1: ( ( Default ) )
            // InternalRosSystemParser.g:2211:1: ( Default )
            {
            // InternalRosSystemParser.g:2211:1: ( Default )
            // InternalRosSystemParser.g:2212:2: Default
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
    // InternalRosSystemParser.g:2221:1: rule__ParameterDoubleType__Group_2__1 : rule__ParameterDoubleType__Group_2__1__Impl ;
    public final void rule__ParameterDoubleType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2225:1: ( rule__ParameterDoubleType__Group_2__1__Impl )
            // InternalRosSystemParser.g:2226:2: rule__ParameterDoubleType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:2232:1: rule__ParameterDoubleType__Group_2__1__Impl : ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterDoubleType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2236:1: ( ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:2237:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:2237:1: ( ( rule__ParameterDoubleType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:2238:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1()); 
            // InternalRosSystemParser.g:2239:2: ( rule__ParameterDoubleType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:2239:3: rule__ParameterDoubleType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:2248:1: rule__ParameterBooleanType__Group__0 : rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 ;
    public final void rule__ParameterBooleanType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2252:1: ( rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1 )
            // InternalRosSystemParser.g:2253:2: rule__ParameterBooleanType__Group__0__Impl rule__ParameterBooleanType__Group__1
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
    // InternalRosSystemParser.g:2260:1: rule__ParameterBooleanType__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBooleanType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2264:1: ( ( () ) )
            // InternalRosSystemParser.g:2265:1: ( () )
            {
            // InternalRosSystemParser.g:2265:1: ( () )
            // InternalRosSystemParser.g:2266:2: ()
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0()); 
            // InternalRosSystemParser.g:2267:2: ()
            // InternalRosSystemParser.g:2267:3: 
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
    // InternalRosSystemParser.g:2275:1: rule__ParameterBooleanType__Group__1 : rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 ;
    public final void rule__ParameterBooleanType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2279:1: ( rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2 )
            // InternalRosSystemParser.g:2280:2: rule__ParameterBooleanType__Group__1__Impl rule__ParameterBooleanType__Group__2
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
    // InternalRosSystemParser.g:2287:1: rule__ParameterBooleanType__Group__1__Impl : ( Boolean ) ;
    public final void rule__ParameterBooleanType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2291:1: ( ( Boolean ) )
            // InternalRosSystemParser.g:2292:1: ( Boolean )
            {
            // InternalRosSystemParser.g:2292:1: ( Boolean )
            // InternalRosSystemParser.g:2293:2: Boolean
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
    // InternalRosSystemParser.g:2302:1: rule__ParameterBooleanType__Group__2 : rule__ParameterBooleanType__Group__2__Impl ;
    public final void rule__ParameterBooleanType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2306:1: ( rule__ParameterBooleanType__Group__2__Impl )
            // InternalRosSystemParser.g:2307:2: rule__ParameterBooleanType__Group__2__Impl
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
    // InternalRosSystemParser.g:2313:1: rule__ParameterBooleanType__Group__2__Impl : ( ( rule__ParameterBooleanType__Group_2__0 )? ) ;
    public final void rule__ParameterBooleanType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2317:1: ( ( ( rule__ParameterBooleanType__Group_2__0 )? ) )
            // InternalRosSystemParser.g:2318:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:2318:1: ( ( rule__ParameterBooleanType__Group_2__0 )? )
            // InternalRosSystemParser.g:2319:2: ( rule__ParameterBooleanType__Group_2__0 )?
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getGroup_2()); 
            // InternalRosSystemParser.g:2320:2: ( rule__ParameterBooleanType__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Default) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_BOOLEAN) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalRosSystemParser.g:2320:3: rule__ParameterBooleanType__Group_2__0
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
    // InternalRosSystemParser.g:2329:1: rule__ParameterBooleanType__Group_2__0 : rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 ;
    public final void rule__ParameterBooleanType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2333:1: ( rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1 )
            // InternalRosSystemParser.g:2334:2: rule__ParameterBooleanType__Group_2__0__Impl rule__ParameterBooleanType__Group_2__1
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
    // InternalRosSystemParser.g:2341:1: rule__ParameterBooleanType__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBooleanType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2345:1: ( ( Default ) )
            // InternalRosSystemParser.g:2346:1: ( Default )
            {
            // InternalRosSystemParser.g:2346:1: ( Default )
            // InternalRosSystemParser.g:2347:2: Default
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
    // InternalRosSystemParser.g:2356:1: rule__ParameterBooleanType__Group_2__1 : rule__ParameterBooleanType__Group_2__1__Impl ;
    public final void rule__ParameterBooleanType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2360:1: ( rule__ParameterBooleanType__Group_2__1__Impl )
            // InternalRosSystemParser.g:2361:2: rule__ParameterBooleanType__Group_2__1__Impl
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
    // InternalRosSystemParser.g:2367:1: rule__ParameterBooleanType__Group_2__1__Impl : ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBooleanType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2371:1: ( ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:2372:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:2372:1: ( ( rule__ParameterBooleanType__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:2373:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1()); 
            // InternalRosSystemParser.g:2374:2: ( rule__ParameterBooleanType__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:2374:3: rule__ParameterBooleanType__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:2383:1: rule__ParameterBase64Type__Group__0 : rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 ;
    public final void rule__ParameterBase64Type__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2387:1: ( rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1 )
            // InternalRosSystemParser.g:2388:2: rule__ParameterBase64Type__Group__0__Impl rule__ParameterBase64Type__Group__1
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
    // InternalRosSystemParser.g:2395:1: rule__ParameterBase64Type__Group__0__Impl : ( () ) ;
    public final void rule__ParameterBase64Type__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2399:1: ( ( () ) )
            // InternalRosSystemParser.g:2400:1: ( () )
            {
            // InternalRosSystemParser.g:2400:1: ( () )
            // InternalRosSystemParser.g:2401:2: ()
            {
             before(grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0()); 
            // InternalRosSystemParser.g:2402:2: ()
            // InternalRosSystemParser.g:2402:3: 
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
    // InternalRosSystemParser.g:2410:1: rule__ParameterBase64Type__Group__1 : rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 ;
    public final void rule__ParameterBase64Type__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2414:1: ( rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2 )
            // InternalRosSystemParser.g:2415:2: rule__ParameterBase64Type__Group__1__Impl rule__ParameterBase64Type__Group__2
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
    // InternalRosSystemParser.g:2422:1: rule__ParameterBase64Type__Group__1__Impl : ( Base64 ) ;
    public final void rule__ParameterBase64Type__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2426:1: ( ( Base64 ) )
            // InternalRosSystemParser.g:2427:1: ( Base64 )
            {
            // InternalRosSystemParser.g:2427:1: ( Base64 )
            // InternalRosSystemParser.g:2428:2: Base64
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
    // InternalRosSystemParser.g:2437:1: rule__ParameterBase64Type__Group__2 : rule__ParameterBase64Type__Group__2__Impl ;
    public final void rule__ParameterBase64Type__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2441:1: ( rule__ParameterBase64Type__Group__2__Impl )
            // InternalRosSystemParser.g:2442:2: rule__ParameterBase64Type__Group__2__Impl
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
    // InternalRosSystemParser.g:2448:1: rule__ParameterBase64Type__Group__2__Impl : ( ( rule__ParameterBase64Type__Group_2__0 )? ) ;
    public final void rule__ParameterBase64Type__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2452:1: ( ( ( rule__ParameterBase64Type__Group_2__0 )? ) )
            // InternalRosSystemParser.g:2453:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            {
            // InternalRosSystemParser.g:2453:1: ( ( rule__ParameterBase64Type__Group_2__0 )? )
            // InternalRosSystemParser.g:2454:2: ( rule__ParameterBase64Type__Group_2__0 )?
            {
             before(grammarAccess.getParameterBase64TypeAccess().getGroup_2()); 
            // InternalRosSystemParser.g:2455:2: ( rule__ParameterBase64Type__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Default) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==RULE_BINARY) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalRosSystemParser.g:2455:3: rule__ParameterBase64Type__Group_2__0
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
    // InternalRosSystemParser.g:2464:1: rule__ParameterBase64Type__Group_2__0 : rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 ;
    public final void rule__ParameterBase64Type__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2468:1: ( rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1 )
            // InternalRosSystemParser.g:2469:2: rule__ParameterBase64Type__Group_2__0__Impl rule__ParameterBase64Type__Group_2__1
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
    // InternalRosSystemParser.g:2476:1: rule__ParameterBase64Type__Group_2__0__Impl : ( Default ) ;
    public final void rule__ParameterBase64Type__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2480:1: ( ( Default ) )
            // InternalRosSystemParser.g:2481:1: ( Default )
            {
            // InternalRosSystemParser.g:2481:1: ( Default )
            // InternalRosSystemParser.g:2482:2: Default
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
    // InternalRosSystemParser.g:2491:1: rule__ParameterBase64Type__Group_2__1 : rule__ParameterBase64Type__Group_2__1__Impl ;
    public final void rule__ParameterBase64Type__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2495:1: ( rule__ParameterBase64Type__Group_2__1__Impl )
            // InternalRosSystemParser.g:2496:2: rule__ParameterBase64Type__Group_2__1__Impl
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
    // InternalRosSystemParser.g:2502:1: rule__ParameterBase64Type__Group_2__1__Impl : ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) ;
    public final void rule__ParameterBase64Type__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2506:1: ( ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) ) )
            // InternalRosSystemParser.g:2507:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            {
            // InternalRosSystemParser.g:2507:1: ( ( rule__ParameterBase64Type__DefaultAssignment_2_1 ) )
            // InternalRosSystemParser.g:2508:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            {
             before(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1()); 
            // InternalRosSystemParser.g:2509:2: ( rule__ParameterBase64Type__DefaultAssignment_2_1 )
            // InternalRosSystemParser.g:2509:3: rule__ParameterBase64Type__DefaultAssignment_2_1
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
    // InternalRosSystemParser.g:2518:1: rule__ParameterArrayType__Group__0 : rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 ;
    public final void rule__ParameterArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2522:1: ( rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1 )
            // InternalRosSystemParser.g:2523:2: rule__ParameterArrayType__Group__0__Impl rule__ParameterArrayType__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystemParser.g:2530:1: rule__ParameterArrayType__Group__0__Impl : ( Array ) ;
    public final void rule__ParameterArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2534:1: ( ( Array ) )
            // InternalRosSystemParser.g:2535:1: ( Array )
            {
            // InternalRosSystemParser.g:2535:1: ( Array )
            // InternalRosSystemParser.g:2536:2: Array
            {
             before(grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0()); 
            match(input,Array,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:2545:1: rule__ParameterArrayType__Group__1 : rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 ;
    public final void rule__ParameterArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2549:1: ( rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2 )
            // InternalRosSystemParser.g:2550:2: rule__ParameterArrayType__Group__1__Impl rule__ParameterArrayType__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalRosSystemParser.g:2557:1: rule__ParameterArrayType__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ParameterArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2561:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:2562:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:2562:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:2563:2: LeftCurlyBracket
            {
             before(grammarAccess.getParameterArrayTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:2572:1: rule__ParameterArrayType__Group__2 : rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 ;
    public final void rule__ParameterArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2576:1: ( rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3 )
            // InternalRosSystemParser.g:2577:2: rule__ParameterArrayType__Group__2__Impl rule__ParameterArrayType__Group__3
            {
            pushFollow(FOLLOW_10);
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
    // InternalRosSystemParser.g:2584:1: rule__ParameterArrayType__Group__2__Impl : ( Type ) ;
    public final void rule__ParameterArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2588:1: ( ( Type ) )
            // InternalRosSystemParser.g:2589:1: ( Type )
            {
            // InternalRosSystemParser.g:2589:1: ( Type )
            // InternalRosSystemParser.g:2590:2: Type
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:2599:1: rule__ParameterArrayType__Group__3 : rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 ;
    public final void rule__ParameterArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2603:1: ( rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4 )
            // InternalRosSystemParser.g:2604:2: rule__ParameterArrayType__Group__3__Impl rule__ParameterArrayType__Group__4
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
    // InternalRosSystemParser.g:2611:1: rule__ParameterArrayType__Group__3__Impl : ( ( rule__ParameterArrayType__TypeAssignment_3 ) ) ;
    public final void rule__ParameterArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2615:1: ( ( ( rule__ParameterArrayType__TypeAssignment_3 ) ) )
            // InternalRosSystemParser.g:2616:1: ( ( rule__ParameterArrayType__TypeAssignment_3 ) )
            {
            // InternalRosSystemParser.g:2616:1: ( ( rule__ParameterArrayType__TypeAssignment_3 ) )
            // InternalRosSystemParser.g:2617:2: ( rule__ParameterArrayType__TypeAssignment_3 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_3()); 
            // InternalRosSystemParser.g:2618:2: ( rule__ParameterArrayType__TypeAssignment_3 )
            // InternalRosSystemParser.g:2618:3: rule__ParameterArrayType__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:2626:1: rule__ParameterArrayType__Group__4 : rule__ParameterArrayType__Group__4__Impl rule__ParameterArrayType__Group__5 ;
    public final void rule__ParameterArrayType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2630:1: ( rule__ParameterArrayType__Group__4__Impl rule__ParameterArrayType__Group__5 )
            // InternalRosSystemParser.g:2631:2: rule__ParameterArrayType__Group__4__Impl rule__ParameterArrayType__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__ParameterArrayType__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__5();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:2638:1: rule__ParameterArrayType__Group__4__Impl : ( ( rule__ParameterArrayType__Group_4__0 )? ) ;
    public final void rule__ParameterArrayType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2642:1: ( ( ( rule__ParameterArrayType__Group_4__0 )? ) )
            // InternalRosSystemParser.g:2643:1: ( ( rule__ParameterArrayType__Group_4__0 )? )
            {
            // InternalRosSystemParser.g:2643:1: ( ( rule__ParameterArrayType__Group_4__0 )? )
            // InternalRosSystemParser.g:2644:2: ( rule__ParameterArrayType__Group_4__0 )?
            {
             before(grammarAccess.getParameterArrayTypeAccess().getGroup_4()); 
            // InternalRosSystemParser.g:2645:2: ( rule__ParameterArrayType__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Default) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosSystemParser.g:2645:3: rule__ParameterArrayType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterArrayType__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterArrayTypeAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParameterArrayType__Group__5"
    // InternalRosSystemParser.g:2653:1: rule__ParameterArrayType__Group__5 : rule__ParameterArrayType__Group__5__Impl ;
    public final void rule__ParameterArrayType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2657:1: ( rule__ParameterArrayType__Group__5__Impl )
            // InternalRosSystemParser.g:2658:2: rule__ParameterArrayType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__5"


    // $ANTLR start "rule__ParameterArrayType__Group__5__Impl"
    // InternalRosSystemParser.g:2664:1: rule__ParameterArrayType__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__ParameterArrayType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2668:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:2669:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:2669:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:2670:2: RightCurlyBracket
            {
             before(grammarAccess.getParameterArrayTypeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group__5__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group_4__0"
    // InternalRosSystemParser.g:2680:1: rule__ParameterArrayType__Group_4__0 : rule__ParameterArrayType__Group_4__0__Impl rule__ParameterArrayType__Group_4__1 ;
    public final void rule__ParameterArrayType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2684:1: ( rule__ParameterArrayType__Group_4__0__Impl rule__ParameterArrayType__Group_4__1 )
            // InternalRosSystemParser.g:2685:2: rule__ParameterArrayType__Group_4__0__Impl rule__ParameterArrayType__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__ParameterArrayType__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__0"


    // $ANTLR start "rule__ParameterArrayType__Group_4__0__Impl"
    // InternalRosSystemParser.g:2692:1: rule__ParameterArrayType__Group_4__0__Impl : ( Default ) ;
    public final void rule__ParameterArrayType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2696:1: ( ( Default ) )
            // InternalRosSystemParser.g:2697:1: ( Default )
            {
            // InternalRosSystemParser.g:2697:1: ( Default )
            // InternalRosSystemParser.g:2698:2: Default
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0()); 
            match(input,Default,FOLLOW_2); 
             after(grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__0__Impl"


    // $ANTLR start "rule__ParameterArrayType__Group_4__1"
    // InternalRosSystemParser.g:2707:1: rule__ParameterArrayType__Group_4__1 : rule__ParameterArrayType__Group_4__1__Impl ;
    public final void rule__ParameterArrayType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2711:1: ( rule__ParameterArrayType__Group_4__1__Impl )
            // InternalRosSystemParser.g:2712:2: rule__ParameterArrayType__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__1"


    // $ANTLR start "rule__ParameterArrayType__Group_4__1__Impl"
    // InternalRosSystemParser.g:2718:1: rule__ParameterArrayType__Group_4__1__Impl : ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) ) ;
    public final void rule__ParameterArrayType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2722:1: ( ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) ) )
            // InternalRosSystemParser.g:2723:1: ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) )
            {
            // InternalRosSystemParser.g:2723:1: ( ( rule__ParameterArrayType__DefaultAssignment_4_1 ) )
            // InternalRosSystemParser.g:2724:2: ( rule__ParameterArrayType__DefaultAssignment_4_1 )
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1()); 
            // InternalRosSystemParser.g:2725:2: ( rule__ParameterArrayType__DefaultAssignment_4_1 )
            // InternalRosSystemParser.g:2725:3: rule__ParameterArrayType__DefaultAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterArrayType__DefaultAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__Group_4__1__Impl"


    // $ANTLR start "rule__ParameterList__Group__0"
    // InternalRosSystemParser.g:2734:1: rule__ParameterList__Group__0 : rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 ;
    public final void rule__ParameterList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2738:1: ( rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1 )
            // InternalRosSystemParser.g:2739:2: rule__ParameterList__Group__0__Impl rule__ParameterList__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystemParser.g:2746:1: rule__ParameterList__Group__0__Impl : ( () ) ;
    public final void rule__ParameterList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2750:1: ( ( () ) )
            // InternalRosSystemParser.g:2751:1: ( () )
            {
            // InternalRosSystemParser.g:2751:1: ( () )
            // InternalRosSystemParser.g:2752:2: ()
            {
             before(grammarAccess.getParameterListAccess().getParameterSequenceAction_0()); 
            // InternalRosSystemParser.g:2753:2: ()
            // InternalRosSystemParser.g:2753:3: 
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
    // InternalRosSystemParser.g:2761:1: rule__ParameterList__Group__1 : rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 ;
    public final void rule__ParameterList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2765:1: ( rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2 )
            // InternalRosSystemParser.g:2766:2: rule__ParameterList__Group__1__Impl rule__ParameterList__Group__2
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
    // InternalRosSystemParser.g:2773:1: rule__ParameterList__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ParameterList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2777:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:2778:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:2778:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:2779:2: LeftCurlyBracket
            {
             before(grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:2788:1: rule__ParameterList__Group__2 : rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 ;
    public final void rule__ParameterList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2792:1: ( rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3 )
            // InternalRosSystemParser.g:2793:2: rule__ParameterList__Group__2__Impl rule__ParameterList__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:2800:1: rule__ParameterList__Group__2__Impl : ( ( rule__ParameterList__ValueAssignment_2 ) ) ;
    public final void rule__ParameterList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2804:1: ( ( ( rule__ParameterList__ValueAssignment_2 ) ) )
            // InternalRosSystemParser.g:2805:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            {
            // InternalRosSystemParser.g:2805:1: ( ( rule__ParameterList__ValueAssignment_2 ) )
            // InternalRosSystemParser.g:2806:2: ( rule__ParameterList__ValueAssignment_2 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_2()); 
            // InternalRosSystemParser.g:2807:2: ( rule__ParameterList__ValueAssignment_2 )
            // InternalRosSystemParser.g:2807:3: rule__ParameterList__ValueAssignment_2
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
    // InternalRosSystemParser.g:2815:1: rule__ParameterList__Group__3 : rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 ;
    public final void rule__ParameterList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2819:1: ( rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4 )
            // InternalRosSystemParser.g:2820:2: rule__ParameterList__Group__3__Impl rule__ParameterList__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:2827:1: rule__ParameterList__Group__3__Impl : ( ( rule__ParameterList__Group_3__0 )* ) ;
    public final void rule__ParameterList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2831:1: ( ( ( rule__ParameterList__Group_3__0 )* ) )
            // InternalRosSystemParser.g:2832:1: ( ( rule__ParameterList__Group_3__0 )* )
            {
            // InternalRosSystemParser.g:2832:1: ( ( rule__ParameterList__Group_3__0 )* )
            // InternalRosSystemParser.g:2833:2: ( rule__ParameterList__Group_3__0 )*
            {
             before(grammarAccess.getParameterListAccess().getGroup_3()); 
            // InternalRosSystemParser.g:2834:2: ( rule__ParameterList__Group_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Comma) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRosSystemParser.g:2834:3: rule__ParameterList__Group_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ParameterList__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRosSystemParser.g:2842:1: rule__ParameterList__Group__4 : rule__ParameterList__Group__4__Impl ;
    public final void rule__ParameterList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2846:1: ( rule__ParameterList__Group__4__Impl )
            // InternalRosSystemParser.g:2847:2: rule__ParameterList__Group__4__Impl
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
    // InternalRosSystemParser.g:2853:1: rule__ParameterList__Group__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__ParameterList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2857:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:2858:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:2858:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:2859:2: RightCurlyBracket
            {
             before(grammarAccess.getParameterListAccess().getRightCurlyBracketKeyword_4()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterListAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:2869:1: rule__ParameterList__Group_3__0 : rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 ;
    public final void rule__ParameterList__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2873:1: ( rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1 )
            // InternalRosSystemParser.g:2874:2: rule__ParameterList__Group_3__0__Impl rule__ParameterList__Group_3__1
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
    // InternalRosSystemParser.g:2881:1: rule__ParameterList__Group_3__0__Impl : ( Comma ) ;
    public final void rule__ParameterList__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2885:1: ( ( Comma ) )
            // InternalRosSystemParser.g:2886:1: ( Comma )
            {
            // InternalRosSystemParser.g:2886:1: ( Comma )
            // InternalRosSystemParser.g:2887:2: Comma
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
    // InternalRosSystemParser.g:2896:1: rule__ParameterList__Group_3__1 : rule__ParameterList__Group_3__1__Impl ;
    public final void rule__ParameterList__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2900:1: ( rule__ParameterList__Group_3__1__Impl )
            // InternalRosSystemParser.g:2901:2: rule__ParameterList__Group_3__1__Impl
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
    // InternalRosSystemParser.g:2907:1: rule__ParameterList__Group_3__1__Impl : ( ( rule__ParameterList__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterList__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2911:1: ( ( ( rule__ParameterList__ValueAssignment_3_1 ) ) )
            // InternalRosSystemParser.g:2912:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            {
            // InternalRosSystemParser.g:2912:1: ( ( rule__ParameterList__ValueAssignment_3_1 ) )
            // InternalRosSystemParser.g:2913:2: ( rule__ParameterList__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterListAccess().getValueAssignment_3_1()); 
            // InternalRosSystemParser.g:2914:2: ( rule__ParameterList__ValueAssignment_3_1 )
            // InternalRosSystemParser.g:2914:3: rule__ParameterList__ValueAssignment_3_1
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
    // InternalRosSystemParser.g:2923:1: rule__ParameterAny__Group__0 : rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 ;
    public final void rule__ParameterAny__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2927:1: ( rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1 )
            // InternalRosSystemParser.g:2928:2: rule__ParameterAny__Group__0__Impl rule__ParameterAny__Group__1
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
    // InternalRosSystemParser.g:2935:1: rule__ParameterAny__Group__0__Impl : ( () ) ;
    public final void rule__ParameterAny__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2939:1: ( ( () ) )
            // InternalRosSystemParser.g:2940:1: ( () )
            {
            // InternalRosSystemParser.g:2940:1: ( () )
            // InternalRosSystemParser.g:2941:2: ()
            {
             before(grammarAccess.getParameterAnyAccess().getParameterAnyAction_0()); 
            // InternalRosSystemParser.g:2942:2: ()
            // InternalRosSystemParser.g:2942:3: 
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
    // InternalRosSystemParser.g:2950:1: rule__ParameterAny__Group__1 : rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 ;
    public final void rule__ParameterAny__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2954:1: ( rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2 )
            // InternalRosSystemParser.g:2955:2: rule__ParameterAny__Group__1__Impl rule__ParameterAny__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystemParser.g:2962:1: rule__ParameterAny__Group__1__Impl : ( ParameterAny ) ;
    public final void rule__ParameterAny__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2966:1: ( ( ParameterAny ) )
            // InternalRosSystemParser.g:2967:1: ( ParameterAny )
            {
            // InternalRosSystemParser.g:2967:1: ( ParameterAny )
            // InternalRosSystemParser.g:2968:2: ParameterAny
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
    // InternalRosSystemParser.g:2977:1: rule__ParameterAny__Group__2 : rule__ParameterAny__Group__2__Impl rule__ParameterAny__Group__3 ;
    public final void rule__ParameterAny__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2981:1: ( rule__ParameterAny__Group__2__Impl rule__ParameterAny__Group__3 )
            // InternalRosSystemParser.g:2982:2: rule__ParameterAny__Group__2__Impl rule__ParameterAny__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__ParameterAny__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__3();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:2989:1: rule__ParameterAny__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ParameterAny__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:2993:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:2994:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:2994:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:2995:2: LeftCurlyBracket
            {
             before(grammarAccess.getParameterAnyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterAnyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParameterAny__Group__3"
    // InternalRosSystemParser.g:3004:1: rule__ParameterAny__Group__3 : rule__ParameterAny__Group__3__Impl rule__ParameterAny__Group__4 ;
    public final void rule__ParameterAny__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3008:1: ( rule__ParameterAny__Group__3__Impl rule__ParameterAny__Group__4 )
            // InternalRosSystemParser.g:3009:2: rule__ParameterAny__Group__3__Impl rule__ParameterAny__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ParameterAny__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__3"


    // $ANTLR start "rule__ParameterAny__Group__3__Impl"
    // InternalRosSystemParser.g:3016:1: rule__ParameterAny__Group__3__Impl : ( ( rule__ParameterAny__Group_3__0 )? ) ;
    public final void rule__ParameterAny__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3020:1: ( ( ( rule__ParameterAny__Group_3__0 )? ) )
            // InternalRosSystemParser.g:3021:1: ( ( rule__ParameterAny__Group_3__0 )? )
            {
            // InternalRosSystemParser.g:3021:1: ( ( rule__ParameterAny__Group_3__0 )? )
            // InternalRosSystemParser.g:3022:2: ( rule__ParameterAny__Group_3__0 )?
            {
             before(grammarAccess.getParameterAnyAccess().getGroup_3()); 
            // InternalRosSystemParser.g:3023:2: ( rule__ParameterAny__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Value) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosSystemParser.g:3023:3: rule__ParameterAny__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterAny__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterAnyAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__3__Impl"


    // $ANTLR start "rule__ParameterAny__Group__4"
    // InternalRosSystemParser.g:3031:1: rule__ParameterAny__Group__4 : rule__ParameterAny__Group__4__Impl ;
    public final void rule__ParameterAny__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3035:1: ( rule__ParameterAny__Group__4__Impl )
            // InternalRosSystemParser.g:3036:2: rule__ParameterAny__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__4"


    // $ANTLR start "rule__ParameterAny__Group__4__Impl"
    // InternalRosSystemParser.g:3042:1: rule__ParameterAny__Group__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__ParameterAny__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3046:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:3047:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:3047:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:3048:2: RightCurlyBracket
            {
             before(grammarAccess.getParameterAnyAccess().getRightCurlyBracketKeyword_4()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterAnyAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group__4__Impl"


    // $ANTLR start "rule__ParameterAny__Group_3__0"
    // InternalRosSystemParser.g:3058:1: rule__ParameterAny__Group_3__0 : rule__ParameterAny__Group_3__0__Impl rule__ParameterAny__Group_3__1 ;
    public final void rule__ParameterAny__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3062:1: ( rule__ParameterAny__Group_3__0__Impl rule__ParameterAny__Group_3__1 )
            // InternalRosSystemParser.g:3063:2: rule__ParameterAny__Group_3__0__Impl rule__ParameterAny__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterAny__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_3__0"


    // $ANTLR start "rule__ParameterAny__Group_3__0__Impl"
    // InternalRosSystemParser.g:3070:1: rule__ParameterAny__Group_3__0__Impl : ( Value ) ;
    public final void rule__ParameterAny__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3074:1: ( ( Value ) )
            // InternalRosSystemParser.g:3075:1: ( Value )
            {
            // InternalRosSystemParser.g:3075:1: ( Value )
            // InternalRosSystemParser.g:3076:2: Value
            {
             before(grammarAccess.getParameterAnyAccess().getValueKeyword_3_0()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getParameterAnyAccess().getValueKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterAny__Group_3__1"
    // InternalRosSystemParser.g:3085:1: rule__ParameterAny__Group_3__1 : rule__ParameterAny__Group_3__1__Impl ;
    public final void rule__ParameterAny__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3089:1: ( rule__ParameterAny__Group_3__1__Impl )
            // InternalRosSystemParser.g:3090:2: rule__ParameterAny__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_3__1"


    // $ANTLR start "rule__ParameterAny__Group_3__1__Impl"
    // InternalRosSystemParser.g:3096:1: rule__ParameterAny__Group_3__1__Impl : ( ( rule__ParameterAny__ValueAssignment_3_1 ) ) ;
    public final void rule__ParameterAny__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3100:1: ( ( ( rule__ParameterAny__ValueAssignment_3_1 ) ) )
            // InternalRosSystemParser.g:3101:1: ( ( rule__ParameterAny__ValueAssignment_3_1 ) )
            {
            // InternalRosSystemParser.g:3101:1: ( ( rule__ParameterAny__ValueAssignment_3_1 ) )
            // InternalRosSystemParser.g:3102:2: ( rule__ParameterAny__ValueAssignment_3_1 )
            {
             before(grammarAccess.getParameterAnyAccess().getValueAssignment_3_1()); 
            // InternalRosSystemParser.g:3103:2: ( rule__ParameterAny__ValueAssignment_3_1 )
            // InternalRosSystemParser.g:3103:3: rule__ParameterAny__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterAny__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAnyAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__Group_3__1__Impl"


    // $ANTLR start "rule__ParameterStruct__Group__0"
    // InternalRosSystemParser.g:3112:1: rule__ParameterStruct__Group__0 : rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 ;
    public final void rule__ParameterStruct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3116:1: ( rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1 )
            // InternalRosSystemParser.g:3117:2: rule__ParameterStruct__Group__0__Impl rule__ParameterStruct__Group__1
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
    // InternalRosSystemParser.g:3124:1: rule__ParameterStruct__Group__0__Impl : ( () ) ;
    public final void rule__ParameterStruct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3128:1: ( ( () ) )
            // InternalRosSystemParser.g:3129:1: ( () )
            {
            // InternalRosSystemParser.g:3129:1: ( () )
            // InternalRosSystemParser.g:3130:2: ()
            {
             before(grammarAccess.getParameterStructAccess().getParameterStructAction_0()); 
            // InternalRosSystemParser.g:3131:2: ()
            // InternalRosSystemParser.g:3131:3: 
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
    // InternalRosSystemParser.g:3139:1: rule__ParameterStruct__Group__1 : rule__ParameterStruct__Group__1__Impl ;
    public final void rule__ParameterStruct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3143:1: ( rule__ParameterStruct__Group__1__Impl )
            // InternalRosSystemParser.g:3144:2: rule__ParameterStruct__Group__1__Impl
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
    // InternalRosSystemParser.g:3150:1: rule__ParameterStruct__Group__1__Impl : ( ( rule__ParameterStruct__Group_1__0 )? ) ;
    public final void rule__ParameterStruct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3154:1: ( ( ( rule__ParameterStruct__Group_1__0 )? ) )
            // InternalRosSystemParser.g:3155:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            {
            // InternalRosSystemParser.g:3155:1: ( ( rule__ParameterStruct__Group_1__0 )? )
            // InternalRosSystemParser.g:3156:2: ( rule__ParameterStruct__Group_1__0 )?
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1()); 
            // InternalRosSystemParser.g:3157:2: ( rule__ParameterStruct__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftCurlyBracket) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystemParser.g:3157:3: rule__ParameterStruct__Group_1__0
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
    // InternalRosSystemParser.g:3166:1: rule__ParameterStruct__Group_1__0 : rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 ;
    public final void rule__ParameterStruct__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3170:1: ( rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1 )
            // InternalRosSystemParser.g:3171:2: rule__ParameterStruct__Group_1__0__Impl rule__ParameterStruct__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRosSystemParser.g:3178:1: rule__ParameterStruct__Group_1__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ParameterStruct__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3182:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:3183:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:3183:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:3184:2: LeftCurlyBracket
            {
             before(grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:3193:1: rule__ParameterStruct__Group_1__1 : rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 ;
    public final void rule__ParameterStruct__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3197:1: ( rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2 )
            // InternalRosSystemParser.g:3198:2: rule__ParameterStruct__Group_1__1__Impl rule__ParameterStruct__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:3205:1: rule__ParameterStruct__Group_1__1__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) ;
    public final void rule__ParameterStruct__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3209:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_1 ) ) )
            // InternalRosSystemParser.g:3210:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            {
            // InternalRosSystemParser.g:3210:1: ( ( rule__ParameterStruct__ValueAssignment_1_1 ) )
            // InternalRosSystemParser.g:3211:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_1()); 
            // InternalRosSystemParser.g:3212:2: ( rule__ParameterStruct__ValueAssignment_1_1 )
            // InternalRosSystemParser.g:3212:3: rule__ParameterStruct__ValueAssignment_1_1
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
    // InternalRosSystemParser.g:3220:1: rule__ParameterStruct__Group_1__2 : rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 ;
    public final void rule__ParameterStruct__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3224:1: ( rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3 )
            // InternalRosSystemParser.g:3225:2: rule__ParameterStruct__Group_1__2__Impl rule__ParameterStruct__Group_1__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalRosSystemParser.g:3232:1: rule__ParameterStruct__Group_1__2__Impl : ( ( rule__ParameterStruct__Group_1_2__0 )* ) ;
    public final void rule__ParameterStruct__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3236:1: ( ( ( rule__ParameterStruct__Group_1_2__0 )* ) )
            // InternalRosSystemParser.g:3237:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            {
            // InternalRosSystemParser.g:3237:1: ( ( rule__ParameterStruct__Group_1_2__0 )* )
            // InternalRosSystemParser.g:3238:2: ( rule__ParameterStruct__Group_1_2__0 )*
            {
             before(grammarAccess.getParameterStructAccess().getGroup_1_2()); 
            // InternalRosSystemParser.g:3239:2: ( rule__ParameterStruct__Group_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRosSystemParser.g:3239:3: rule__ParameterStruct__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ParameterStruct__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalRosSystemParser.g:3247:1: rule__ParameterStruct__Group_1__3 : rule__ParameterStruct__Group_1__3__Impl ;
    public final void rule__ParameterStruct__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3251:1: ( rule__ParameterStruct__Group_1__3__Impl )
            // InternalRosSystemParser.g:3252:2: rule__ParameterStruct__Group_1__3__Impl
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
    // InternalRosSystemParser.g:3258:1: rule__ParameterStruct__Group_1__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ParameterStruct__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3262:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:3263:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:3263:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:3264:2: RightCurlyBracket
            {
             before(grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_3()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:3274:1: rule__ParameterStruct__Group_1_2__0 : rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 ;
    public final void rule__ParameterStruct__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3278:1: ( rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1 )
            // InternalRosSystemParser.g:3279:2: rule__ParameterStruct__Group_1_2__0__Impl rule__ParameterStruct__Group_1_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystemParser.g:3286:1: rule__ParameterStruct__Group_1_2__0__Impl : ( Comma ) ;
    public final void rule__ParameterStruct__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3290:1: ( ( Comma ) )
            // InternalRosSystemParser.g:3291:1: ( Comma )
            {
            // InternalRosSystemParser.g:3291:1: ( Comma )
            // InternalRosSystemParser.g:3292:2: Comma
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
    // InternalRosSystemParser.g:3301:1: rule__ParameterStruct__Group_1_2__1 : rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 ;
    public final void rule__ParameterStruct__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3305:1: ( rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2 )
            // InternalRosSystemParser.g:3306:2: rule__ParameterStruct__Group_1_2__1__Impl rule__ParameterStruct__Group_1_2__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalRosSystemParser.g:3313:1: rule__ParameterStruct__Group_1_2__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3317:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:3318:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:3318:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:3319:2: LeftCurlyBracket
            {
             before(grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:3328:1: rule__ParameterStruct__Group_1_2__2 : rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 ;
    public final void rule__ParameterStruct__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3332:1: ( rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3 )
            // InternalRosSystemParser.g:3333:2: rule__ParameterStruct__Group_1_2__2__Impl rule__ParameterStruct__Group_1_2__3
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
    // InternalRosSystemParser.g:3340:1: rule__ParameterStruct__Group_1_2__2__Impl : ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) ;
    public final void rule__ParameterStruct__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3344:1: ( ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) ) )
            // InternalRosSystemParser.g:3345:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            {
            // InternalRosSystemParser.g:3345:1: ( ( rule__ParameterStruct__ValueAssignment_1_2_2 ) )
            // InternalRosSystemParser.g:3346:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            {
             before(grammarAccess.getParameterStructAccess().getValueAssignment_1_2_2()); 
            // InternalRosSystemParser.g:3347:2: ( rule__ParameterStruct__ValueAssignment_1_2_2 )
            // InternalRosSystemParser.g:3347:3: rule__ParameterStruct__ValueAssignment_1_2_2
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
    // InternalRosSystemParser.g:3355:1: rule__ParameterStruct__Group_1_2__3 : rule__ParameterStruct__Group_1_2__3__Impl ;
    public final void rule__ParameterStruct__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3359:1: ( rule__ParameterStruct__Group_1_2__3__Impl )
            // InternalRosSystemParser.g:3360:2: rule__ParameterStruct__Group_1_2__3__Impl
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
    // InternalRosSystemParser.g:3366:1: rule__ParameterStruct__Group_1_2__3__Impl : ( RightCurlyBracket ) ;
    public final void rule__ParameterStruct__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3370:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:3371:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:3371:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:3372:2: RightCurlyBracket
            {
             before(grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:3382:1: rule__ParameterStructMember__Group__0 : rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 ;
    public final void rule__ParameterStructMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3386:1: ( rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1 )
            // InternalRosSystemParser.g:3387:2: rule__ParameterStructMember__Group__0__Impl rule__ParameterStructMember__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystemParser.g:3394:1: rule__ParameterStructMember__Group__0__Impl : ( ( rule__ParameterStructMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3398:1: ( ( ( rule__ParameterStructMember__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:3399:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:3399:1: ( ( rule__ParameterStructMember__NameAssignment_0 ) )
            // InternalRosSystemParser.g:3400:2: ( rule__ParameterStructMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0()); 
            // InternalRosSystemParser.g:3401:2: ( rule__ParameterStructMember__NameAssignment_0 )
            // InternalRosSystemParser.g:3401:3: rule__ParameterStructMember__NameAssignment_0
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
    // InternalRosSystemParser.g:3409:1: rule__ParameterStructMember__Group__1 : rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 ;
    public final void rule__ParameterStructMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3413:1: ( rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2 )
            // InternalRosSystemParser.g:3414:2: rule__ParameterStructMember__Group__1__Impl rule__ParameterStructMember__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalRosSystemParser.g:3421:1: rule__ParameterStructMember__Group__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ParameterStructMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3425:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:3426:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:3426:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:3427:2: LeftCurlyBracket
            {
             before(grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:3436:1: rule__ParameterStructMember__Group__2 : rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 ;
    public final void rule__ParameterStructMember__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3440:1: ( rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3 )
            // InternalRosSystemParser.g:3441:2: rule__ParameterStructMember__Group__2__Impl rule__ParameterStructMember__Group__3
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
    // InternalRosSystemParser.g:3448:1: rule__ParameterStructMember__Group__2__Impl : ( Value ) ;
    public final void rule__ParameterStructMember__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3452:1: ( ( Value ) )
            // InternalRosSystemParser.g:3453:1: ( Value )
            {
            // InternalRosSystemParser.g:3453:1: ( Value )
            // InternalRosSystemParser.g:3454:2: Value
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueKeyword_2()); 
            match(input,Value,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getValueKeyword_2()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:3463:1: rule__ParameterStructMember__Group__3 : rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 ;
    public final void rule__ParameterStructMember__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3467:1: ( rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4 )
            // InternalRosSystemParser.g:3468:2: rule__ParameterStructMember__Group__3__Impl rule__ParameterStructMember__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalRosSystemParser.g:3475:1: rule__ParameterStructMember__Group__3__Impl : ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) ;
    public final void rule__ParameterStructMember__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3479:1: ( ( ( rule__ParameterStructMember__ValueAssignment_3 ) ) )
            // InternalRosSystemParser.g:3480:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            {
            // InternalRosSystemParser.g:3480:1: ( ( rule__ParameterStructMember__ValueAssignment_3 ) )
            // InternalRosSystemParser.g:3481:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            {
             before(grammarAccess.getParameterStructMemberAccess().getValueAssignment_3()); 
            // InternalRosSystemParser.g:3482:2: ( rule__ParameterStructMember__ValueAssignment_3 )
            // InternalRosSystemParser.g:3482:3: rule__ParameterStructMember__ValueAssignment_3
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
    // InternalRosSystemParser.g:3490:1: rule__ParameterStructMember__Group__4 : rule__ParameterStructMember__Group__4__Impl ;
    public final void rule__ParameterStructMember__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3494:1: ( rule__ParameterStructMember__Group__4__Impl )
            // InternalRosSystemParser.g:3495:2: rule__ParameterStructMember__Group__4__Impl
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
    // InternalRosSystemParser.g:3501:1: rule__ParameterStructMember__Group__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__ParameterStructMember__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3505:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:3506:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:3506:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:3507:2: RightCurlyBracket
            {
             before(grammarAccess.getParameterStructMemberAccess().getRightCurlyBracketKeyword_4()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterStructMemberAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalRosSystemParser.g:3517:1: rule__ParameterStructTypeMember__Group__0 : rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 ;
    public final void rule__ParameterStructTypeMember__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3521:1: ( rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1 )
            // InternalRosSystemParser.g:3522:2: rule__ParameterStructTypeMember__Group__0__Impl rule__ParameterStructTypeMember__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRosSystemParser.g:3529:1: rule__ParameterStructTypeMember__Group__0__Impl : ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3533:1: ( ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) ) )
            // InternalRosSystemParser.g:3534:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            {
            // InternalRosSystemParser.g:3534:1: ( ( rule__ParameterStructTypeMember__NameAssignment_0 ) )
            // InternalRosSystemParser.g:3535:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0()); 
            // InternalRosSystemParser.g:3536:2: ( rule__ParameterStructTypeMember__NameAssignment_0 )
            // InternalRosSystemParser.g:3536:3: rule__ParameterStructTypeMember__NameAssignment_0
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
    // InternalRosSystemParser.g:3544:1: rule__ParameterStructTypeMember__Group__1 : rule__ParameterStructTypeMember__Group__1__Impl ;
    public final void rule__ParameterStructTypeMember__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3548:1: ( rule__ParameterStructTypeMember__Group__1__Impl )
            // InternalRosSystemParser.g:3549:2: rule__ParameterStructTypeMember__Group__1__Impl
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
    // InternalRosSystemParser.g:3555:1: rule__ParameterStructTypeMember__Group__1__Impl : ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) ;
    public final void rule__ParameterStructTypeMember__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3559:1: ( ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) ) )
            // InternalRosSystemParser.g:3560:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            {
            // InternalRosSystemParser.g:3560:1: ( ( rule__ParameterStructTypeMember__TypeAssignment_1 ) )
            // InternalRosSystemParser.g:3561:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            {
             before(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1()); 
            // InternalRosSystemParser.g:3562:2: ( rule__ParameterStructTypeMember__TypeAssignment_1 )
            // InternalRosSystemParser.g:3562:3: rule__ParameterStructTypeMember__TypeAssignment_1
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


    // $ANTLR start "rule__GlobalNamespace__Group__0"
    // InternalRosSystemParser.g:3571:1: rule__GlobalNamespace__Group__0 : rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 ;
    public final void rule__GlobalNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3575:1: ( rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1 )
            // InternalRosSystemParser.g:3576:2: rule__GlobalNamespace__Group__0__Impl rule__GlobalNamespace__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalRosSystemParser.g:3583:1: rule__GlobalNamespace__Group__0__Impl : ( () ) ;
    public final void rule__GlobalNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3587:1: ( ( () ) )
            // InternalRosSystemParser.g:3588:1: ( () )
            {
            // InternalRosSystemParser.g:3588:1: ( () )
            // InternalRosSystemParser.g:3589:2: ()
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0()); 
            // InternalRosSystemParser.g:3590:2: ()
            // InternalRosSystemParser.g:3590:3: 
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
    // InternalRosSystemParser.g:3598:1: rule__GlobalNamespace__Group__1 : rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 ;
    public final void rule__GlobalNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3602:1: ( rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2 )
            // InternalRosSystemParser.g:3603:2: rule__GlobalNamespace__Group__1__Impl rule__GlobalNamespace__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystemParser.g:3610:1: rule__GlobalNamespace__Group__1__Impl : ( GlobalNamespace ) ;
    public final void rule__GlobalNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3614:1: ( ( GlobalNamespace ) )
            // InternalRosSystemParser.g:3615:1: ( GlobalNamespace )
            {
            // InternalRosSystemParser.g:3615:1: ( GlobalNamespace )
            // InternalRosSystemParser.g:3616:2: GlobalNamespace
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
    // InternalRosSystemParser.g:3625:1: rule__GlobalNamespace__Group__2 : rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 ;
    public final void rule__GlobalNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3629:1: ( rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3 )
            // InternalRosSystemParser.g:3630:2: rule__GlobalNamespace__Group__2__Impl rule__GlobalNamespace__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__GlobalNamespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__3();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:3637:1: rule__GlobalNamespace__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GlobalNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3641:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:3642:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:3642:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:3643:2: LeftCurlyBracket
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__GlobalNamespace__Group__3"
    // InternalRosSystemParser.g:3652:1: rule__GlobalNamespace__Group__3 : rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 ;
    public final void rule__GlobalNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3656:1: ( rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4 )
            // InternalRosSystemParser.g:3657:2: rule__GlobalNamespace__Group__3__Impl rule__GlobalNamespace__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__GlobalNamespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__3"


    // $ANTLR start "rule__GlobalNamespace__Group__3__Impl"
    // InternalRosSystemParser.g:3664:1: rule__GlobalNamespace__Group__3__Impl : ( ( rule__GlobalNamespace__Group_3__0 )? ) ;
    public final void rule__GlobalNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3668:1: ( ( ( rule__GlobalNamespace__Group_3__0 )? ) )
            // InternalRosSystemParser.g:3669:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            {
            // InternalRosSystemParser.g:3669:1: ( ( rule__GlobalNamespace__Group_3__0 )? )
            // InternalRosSystemParser.g:3670:2: ( rule__GlobalNamespace__Group_3__0 )?
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3()); 
            // InternalRosSystemParser.g:3671:2: ( rule__GlobalNamespace__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Parts) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosSystemParser.g:3671:3: rule__GlobalNamespace__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GlobalNamespace__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__3__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group__4"
    // InternalRosSystemParser.g:3679:1: rule__GlobalNamespace__Group__4 : rule__GlobalNamespace__Group__4__Impl ;
    public final void rule__GlobalNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3683:1: ( rule__GlobalNamespace__Group__4__Impl )
            // InternalRosSystemParser.g:3684:2: rule__GlobalNamespace__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__4"


    // $ANTLR start "rule__GlobalNamespace__Group__4__Impl"
    // InternalRosSystemParser.g:3690:1: rule__GlobalNamespace__Group__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__GlobalNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3694:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:3695:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:3695:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:3696:2: RightCurlyBracket
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group__4__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__0"
    // InternalRosSystemParser.g:3706:1: rule__GlobalNamespace__Group_3__0 : rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 ;
    public final void rule__GlobalNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3710:1: ( rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1 )
            // InternalRosSystemParser.g:3711:2: rule__GlobalNamespace__Group_3__0__Impl rule__GlobalNamespace__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__GlobalNamespace__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__0"


    // $ANTLR start "rule__GlobalNamespace__Group_3__0__Impl"
    // InternalRosSystemParser.g:3718:1: rule__GlobalNamespace__Group_3__0__Impl : ( Parts ) ;
    public final void rule__GlobalNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3722:1: ( ( Parts ) )
            // InternalRosSystemParser.g:3723:1: ( Parts )
            {
            // InternalRosSystemParser.g:3723:1: ( Parts )
            // InternalRosSystemParser.g:3724:2: Parts
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,Parts,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__1"
    // InternalRosSystemParser.g:3733:1: rule__GlobalNamespace__Group_3__1 : rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 ;
    public final void rule__GlobalNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3737:1: ( rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2 )
            // InternalRosSystemParser.g:3738:2: rule__GlobalNamespace__Group_3__1__Impl rule__GlobalNamespace__Group_3__2
            {
            pushFollow(FOLLOW_33);
            rule__GlobalNamespace__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__1"


    // $ANTLR start "rule__GlobalNamespace__Group_3__1__Impl"
    // InternalRosSystemParser.g:3745:1: rule__GlobalNamespace__Group_3__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__GlobalNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3749:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:3750:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:3750:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:3751:2: LeftCurlyBracket
            {
             before(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__1__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__2"
    // InternalRosSystemParser.g:3760:1: rule__GlobalNamespace__Group_3__2 : rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 ;
    public final void rule__GlobalNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3764:1: ( rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3 )
            // InternalRosSystemParser.g:3765:2: rule__GlobalNamespace__Group_3__2__Impl rule__GlobalNamespace__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__GlobalNamespace__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__2"


    // $ANTLR start "rule__GlobalNamespace__Group_3__2__Impl"
    // InternalRosSystemParser.g:3772:1: rule__GlobalNamespace__Group_3__2__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__GlobalNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3776:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) ) )
            // InternalRosSystemParser.g:3777:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            {
            // InternalRosSystemParser.g:3777:1: ( ( rule__GlobalNamespace__PartsAssignment_3_2 ) )
            // InternalRosSystemParser.g:3778:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalRosSystemParser.g:3779:2: ( rule__GlobalNamespace__PartsAssignment_3_2 )
            // InternalRosSystemParser.g:3779:3: rule__GlobalNamespace__PartsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__2__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__3"
    // InternalRosSystemParser.g:3787:1: rule__GlobalNamespace__Group_3__3 : rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 ;
    public final void rule__GlobalNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3791:1: ( rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4 )
            // InternalRosSystemParser.g:3792:2: rule__GlobalNamespace__Group_3__3__Impl rule__GlobalNamespace__Group_3__4
            {
            pushFollow(FOLLOW_11);
            rule__GlobalNamespace__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__3"


    // $ANTLR start "rule__GlobalNamespace__Group_3__3__Impl"
    // InternalRosSystemParser.g:3799:1: rule__GlobalNamespace__Group_3__3__Impl : ( ( rule__GlobalNamespace__Group_3_3__0 )* ) ;
    public final void rule__GlobalNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3803:1: ( ( ( rule__GlobalNamespace__Group_3_3__0 )* ) )
            // InternalRosSystemParser.g:3804:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            {
            // InternalRosSystemParser.g:3804:1: ( ( rule__GlobalNamespace__Group_3_3__0 )* )
            // InternalRosSystemParser.g:3805:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3()); 
            // InternalRosSystemParser.g:3806:2: ( rule__GlobalNamespace__Group_3_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Comma) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRosSystemParser.g:3806:3: rule__GlobalNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__GlobalNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getGlobalNamespaceAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__3__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3__4"
    // InternalRosSystemParser.g:3814:1: rule__GlobalNamespace__Group_3__4 : rule__GlobalNamespace__Group_3__4__Impl ;
    public final void rule__GlobalNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3818:1: ( rule__GlobalNamespace__Group_3__4__Impl )
            // InternalRosSystemParser.g:3819:2: rule__GlobalNamespace__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__4"


    // $ANTLR start "rule__GlobalNamespace__Group_3__4__Impl"
    // InternalRosSystemParser.g:3825:1: rule__GlobalNamespace__Group_3__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__GlobalNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3829:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:3830:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:3830:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:3831:2: RightCurlyBracket
            {
             before(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3__4__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__0"
    // InternalRosSystemParser.g:3841:1: rule__GlobalNamespace__Group_3_3__0 : rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 ;
    public final void rule__GlobalNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3845:1: ( rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1 )
            // InternalRosSystemParser.g:3846:2: rule__GlobalNamespace__Group_3_3__0__Impl rule__GlobalNamespace__Group_3_3__1
            {
            pushFollow(FOLLOW_33);
            rule__GlobalNamespace__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__0"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__0__Impl"
    // InternalRosSystemParser.g:3853:1: rule__GlobalNamespace__Group_3_3__0__Impl : ( Comma ) ;
    public final void rule__GlobalNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3857:1: ( ( Comma ) )
            // InternalRosSystemParser.g:3858:1: ( Comma )
            {
            // InternalRosSystemParser.g:3858:1: ( Comma )
            // InternalRosSystemParser.g:3859:2: Comma
            {
             before(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__0__Impl"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__1"
    // InternalRosSystemParser.g:3868:1: rule__GlobalNamespace__Group_3_3__1 : rule__GlobalNamespace__Group_3_3__1__Impl ;
    public final void rule__GlobalNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3872:1: ( rule__GlobalNamespace__Group_3_3__1__Impl )
            // InternalRosSystemParser.g:3873:2: rule__GlobalNamespace__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__1"


    // $ANTLR start "rule__GlobalNamespace__Group_3_3__1__Impl"
    // InternalRosSystemParser.g:3879:1: rule__GlobalNamespace__Group_3_3__1__Impl : ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__GlobalNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3883:1: ( ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalRosSystemParser.g:3884:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalRosSystemParser.g:3884:1: ( ( rule__GlobalNamespace__PartsAssignment_3_3_1 ) )
            // InternalRosSystemParser.g:3885:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalRosSystemParser.g:3886:2: ( rule__GlobalNamespace__PartsAssignment_3_3_1 )
            // InternalRosSystemParser.g:3886:3: rule__GlobalNamespace__PartsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__GlobalNamespace__PartsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__Group_3_3__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__0"
    // InternalRosSystemParser.g:3895:1: rule__RelativeNamespace_Impl__Group__0 : rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 ;
    public final void rule__RelativeNamespace_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3899:1: ( rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1 )
            // InternalRosSystemParser.g:3900:2: rule__RelativeNamespace_Impl__Group__0__Impl rule__RelativeNamespace_Impl__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalRosSystemParser.g:3907:1: rule__RelativeNamespace_Impl__Group__0__Impl : ( () ) ;
    public final void rule__RelativeNamespace_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3911:1: ( ( () ) )
            // InternalRosSystemParser.g:3912:1: ( () )
            {
            // InternalRosSystemParser.g:3912:1: ( () )
            // InternalRosSystemParser.g:3913:2: ()
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0()); 
            // InternalRosSystemParser.g:3914:2: ()
            // InternalRosSystemParser.g:3914:3: 
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
    // InternalRosSystemParser.g:3922:1: rule__RelativeNamespace_Impl__Group__1 : rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 ;
    public final void rule__RelativeNamespace_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3926:1: ( rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2 )
            // InternalRosSystemParser.g:3927:2: rule__RelativeNamespace_Impl__Group__1__Impl rule__RelativeNamespace_Impl__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystemParser.g:3934:1: rule__RelativeNamespace_Impl__Group__1__Impl : ( RelativeNamespace ) ;
    public final void rule__RelativeNamespace_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3938:1: ( ( RelativeNamespace ) )
            // InternalRosSystemParser.g:3939:1: ( RelativeNamespace )
            {
            // InternalRosSystemParser.g:3939:1: ( RelativeNamespace )
            // InternalRosSystemParser.g:3940:2: RelativeNamespace
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
    // InternalRosSystemParser.g:3949:1: rule__RelativeNamespace_Impl__Group__2 : rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 ;
    public final void rule__RelativeNamespace_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3953:1: ( rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3 )
            // InternalRosSystemParser.g:3954:2: rule__RelativeNamespace_Impl__Group__2__Impl rule__RelativeNamespace_Impl__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__RelativeNamespace_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__3();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:3961:1: rule__RelativeNamespace_Impl__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3965:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:3966:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:3966:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:3967:2: LeftCurlyBracket
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__3"
    // InternalRosSystemParser.g:3976:1: rule__RelativeNamespace_Impl__Group__3 : rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 ;
    public final void rule__RelativeNamespace_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3980:1: ( rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4 )
            // InternalRosSystemParser.g:3981:2: rule__RelativeNamespace_Impl__Group__3__Impl rule__RelativeNamespace_Impl__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__RelativeNamespace_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__3"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__3__Impl"
    // InternalRosSystemParser.g:3988:1: rule__RelativeNamespace_Impl__Group__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) ;
    public final void rule__RelativeNamespace_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:3992:1: ( ( ( rule__RelativeNamespace_Impl__Group_3__0 )? ) )
            // InternalRosSystemParser.g:3993:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            {
            // InternalRosSystemParser.g:3993:1: ( ( rule__RelativeNamespace_Impl__Group_3__0 )? )
            // InternalRosSystemParser.g:3994:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3()); 
            // InternalRosSystemParser.g:3995:2: ( rule__RelativeNamespace_Impl__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Parts) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosSystemParser.g:3995:3: rule__RelativeNamespace_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RelativeNamespace_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__3__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__4"
    // InternalRosSystemParser.g:4003:1: rule__RelativeNamespace_Impl__Group__4 : rule__RelativeNamespace_Impl__Group__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4007:1: ( rule__RelativeNamespace_Impl__Group__4__Impl )
            // InternalRosSystemParser.g:4008:2: rule__RelativeNamespace_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__4"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group__4__Impl"
    // InternalRosSystemParser.g:4014:1: rule__RelativeNamespace_Impl__Group__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4018:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:4019:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:4019:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:4020:2: RightCurlyBracket
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group__4__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__0"
    // InternalRosSystemParser.g:4030:1: rule__RelativeNamespace_Impl__Group_3__0 : rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4034:1: ( rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1 )
            // InternalRosSystemParser.g:4035:2: rule__RelativeNamespace_Impl__Group_3__0__Impl rule__RelativeNamespace_Impl__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__RelativeNamespace_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__0__Impl"
    // InternalRosSystemParser.g:4042:1: rule__RelativeNamespace_Impl__Group_3__0__Impl : ( Parts ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4046:1: ( ( Parts ) )
            // InternalRosSystemParser.g:4047:1: ( Parts )
            {
            // InternalRosSystemParser.g:4047:1: ( Parts )
            // InternalRosSystemParser.g:4048:2: Parts
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0()); 
            match(input,Parts,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__1"
    // InternalRosSystemParser.g:4057:1: rule__RelativeNamespace_Impl__Group_3__1 : rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 ;
    public final void rule__RelativeNamespace_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4061:1: ( rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2 )
            // InternalRosSystemParser.g:4062:2: rule__RelativeNamespace_Impl__Group_3__1__Impl rule__RelativeNamespace_Impl__Group_3__2
            {
            pushFollow(FOLLOW_33);
            rule__RelativeNamespace_Impl__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__1__Impl"
    // InternalRosSystemParser.g:4069:1: rule__RelativeNamespace_Impl__Group_3__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4073:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:4074:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:4074:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:4075:2: LeftCurlyBracket
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__2"
    // InternalRosSystemParser.g:4084:1: rule__RelativeNamespace_Impl__Group_3__2 : rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 ;
    public final void rule__RelativeNamespace_Impl__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4088:1: ( rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3 )
            // InternalRosSystemParser.g:4089:2: rule__RelativeNamespace_Impl__Group_3__2__Impl rule__RelativeNamespace_Impl__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__RelativeNamespace_Impl__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__2"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__2__Impl"
    // InternalRosSystemParser.g:4096:1: rule__RelativeNamespace_Impl__Group_3__2__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4100:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) ) )
            // InternalRosSystemParser.g:4101:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            {
            // InternalRosSystemParser.g:4101:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 ) )
            // InternalRosSystemParser.g:4102:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2()); 
            // InternalRosSystemParser.g:4103:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_2 )
            // InternalRosSystemParser.g:4103:3: rule__RelativeNamespace_Impl__PartsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__2__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__3"
    // InternalRosSystemParser.g:4111:1: rule__RelativeNamespace_Impl__Group_3__3 : rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 ;
    public final void rule__RelativeNamespace_Impl__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4115:1: ( rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4 )
            // InternalRosSystemParser.g:4116:2: rule__RelativeNamespace_Impl__Group_3__3__Impl rule__RelativeNamespace_Impl__Group_3__4
            {
            pushFollow(FOLLOW_11);
            rule__RelativeNamespace_Impl__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__3"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__3__Impl"
    // InternalRosSystemParser.g:4123:1: rule__RelativeNamespace_Impl__Group_3__3__Impl : ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4127:1: ( ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* ) )
            // InternalRosSystemParser.g:4128:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            {
            // InternalRosSystemParser.g:4128:1: ( ( rule__RelativeNamespace_Impl__Group_3_3__0 )* )
            // InternalRosSystemParser.g:4129:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3()); 
            // InternalRosSystemParser.g:4130:2: ( rule__RelativeNamespace_Impl__Group_3_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==Comma) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRosSystemParser.g:4130:3: rule__RelativeNamespace_Impl__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__RelativeNamespace_Impl__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__3__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__4"
    // InternalRosSystemParser.g:4138:1: rule__RelativeNamespace_Impl__Group_3__4 : rule__RelativeNamespace_Impl__Group_3__4__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4142:1: ( rule__RelativeNamespace_Impl__Group_3__4__Impl )
            // InternalRosSystemParser.g:4143:2: rule__RelativeNamespace_Impl__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__4"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3__4__Impl"
    // InternalRosSystemParser.g:4149:1: rule__RelativeNamespace_Impl__Group_3__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__RelativeNamespace_Impl__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4153:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:4154:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:4154:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:4155:2: RightCurlyBracket
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3__4__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__0"
    // InternalRosSystemParser.g:4165:1: rule__RelativeNamespace_Impl__Group_3_3__0 : rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4169:1: ( rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1 )
            // InternalRosSystemParser.g:4170:2: rule__RelativeNamespace_Impl__Group_3_3__0__Impl rule__RelativeNamespace_Impl__Group_3_3__1
            {
            pushFollow(FOLLOW_33);
            rule__RelativeNamespace_Impl__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__0"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__0__Impl"
    // InternalRosSystemParser.g:4177:1: rule__RelativeNamespace_Impl__Group_3_3__0__Impl : ( Comma ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4181:1: ( ( Comma ) )
            // InternalRosSystemParser.g:4182:1: ( Comma )
            {
            // InternalRosSystemParser.g:4182:1: ( Comma )
            // InternalRosSystemParser.g:4183:2: Comma
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__0__Impl"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__1"
    // InternalRosSystemParser.g:4192:1: rule__RelativeNamespace_Impl__Group_3_3__1 : rule__RelativeNamespace_Impl__Group_3_3__1__Impl ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4196:1: ( rule__RelativeNamespace_Impl__Group_3_3__1__Impl )
            // InternalRosSystemParser.g:4197:2: rule__RelativeNamespace_Impl__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__1"


    // $ANTLR start "rule__RelativeNamespace_Impl__Group_3_3__1__Impl"
    // InternalRosSystemParser.g:4203:1: rule__RelativeNamespace_Impl__Group_3_3__1__Impl : ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) ;
    public final void rule__RelativeNamespace_Impl__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4207:1: ( ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) ) )
            // InternalRosSystemParser.g:4208:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            {
            // InternalRosSystemParser.g:4208:1: ( ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 ) )
            // InternalRosSystemParser.g:4209:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1()); 
            // InternalRosSystemParser.g:4210:2: ( rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 )
            // InternalRosSystemParser.g:4210:3: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RelativeNamespace_Impl__PartsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__Group_3_3__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__0"
    // InternalRosSystemParser.g:4219:1: rule__PrivateNamespace__Group__0 : rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 ;
    public final void rule__PrivateNamespace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4223:1: ( rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1 )
            // InternalRosSystemParser.g:4224:2: rule__PrivateNamespace__Group__0__Impl rule__PrivateNamespace__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalRosSystemParser.g:4231:1: rule__PrivateNamespace__Group__0__Impl : ( () ) ;
    public final void rule__PrivateNamespace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4235:1: ( ( () ) )
            // InternalRosSystemParser.g:4236:1: ( () )
            {
            // InternalRosSystemParser.g:4236:1: ( () )
            // InternalRosSystemParser.g:4237:2: ()
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0()); 
            // InternalRosSystemParser.g:4238:2: ()
            // InternalRosSystemParser.g:4238:3: 
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
    // InternalRosSystemParser.g:4246:1: rule__PrivateNamespace__Group__1 : rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 ;
    public final void rule__PrivateNamespace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4250:1: ( rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2 )
            // InternalRosSystemParser.g:4251:2: rule__PrivateNamespace__Group__1__Impl rule__PrivateNamespace__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalRosSystemParser.g:4258:1: rule__PrivateNamespace__Group__1__Impl : ( PrivateNamespace ) ;
    public final void rule__PrivateNamespace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4262:1: ( ( PrivateNamespace ) )
            // InternalRosSystemParser.g:4263:1: ( PrivateNamespace )
            {
            // InternalRosSystemParser.g:4263:1: ( PrivateNamespace )
            // InternalRosSystemParser.g:4264:2: PrivateNamespace
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
    // InternalRosSystemParser.g:4273:1: rule__PrivateNamespace__Group__2 : rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 ;
    public final void rule__PrivateNamespace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4277:1: ( rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3 )
            // InternalRosSystemParser.g:4278:2: rule__PrivateNamespace__Group__2__Impl rule__PrivateNamespace__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__PrivateNamespace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__3();

            state._fsp--;


            }

        }
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
    // InternalRosSystemParser.g:4285:1: rule__PrivateNamespace__Group__2__Impl : ( LeftCurlyBracket ) ;
    public final void rule__PrivateNamespace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4289:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:4290:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:4290:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:4291:2: LeftCurlyBracket
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__PrivateNamespace__Group__3"
    // InternalRosSystemParser.g:4300:1: rule__PrivateNamespace__Group__3 : rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 ;
    public final void rule__PrivateNamespace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4304:1: ( rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4 )
            // InternalRosSystemParser.g:4305:2: rule__PrivateNamespace__Group__3__Impl rule__PrivateNamespace__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__PrivateNamespace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__3"


    // $ANTLR start "rule__PrivateNamespace__Group__3__Impl"
    // InternalRosSystemParser.g:4312:1: rule__PrivateNamespace__Group__3__Impl : ( ( rule__PrivateNamespace__Group_3__0 )? ) ;
    public final void rule__PrivateNamespace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4316:1: ( ( ( rule__PrivateNamespace__Group_3__0 )? ) )
            // InternalRosSystemParser.g:4317:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            {
            // InternalRosSystemParser.g:4317:1: ( ( rule__PrivateNamespace__Group_3__0 )? )
            // InternalRosSystemParser.g:4318:2: ( rule__PrivateNamespace__Group_3__0 )?
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3()); 
            // InternalRosSystemParser.g:4319:2: ( rule__PrivateNamespace__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Parts) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRosSystemParser.g:4319:3: rule__PrivateNamespace__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrivateNamespace__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__3__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group__4"
    // InternalRosSystemParser.g:4327:1: rule__PrivateNamespace__Group__4 : rule__PrivateNamespace__Group__4__Impl ;
    public final void rule__PrivateNamespace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4331:1: ( rule__PrivateNamespace__Group__4__Impl )
            // InternalRosSystemParser.g:4332:2: rule__PrivateNamespace__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__4"


    // $ANTLR start "rule__PrivateNamespace__Group__4__Impl"
    // InternalRosSystemParser.g:4338:1: rule__PrivateNamespace__Group__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__PrivateNamespace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4342:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:4343:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:4343:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:4344:2: RightCurlyBracket
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group__4__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__0"
    // InternalRosSystemParser.g:4354:1: rule__PrivateNamespace__Group_3__0 : rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 ;
    public final void rule__PrivateNamespace__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4358:1: ( rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1 )
            // InternalRosSystemParser.g:4359:2: rule__PrivateNamespace__Group_3__0__Impl rule__PrivateNamespace__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__PrivateNamespace__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__0"


    // $ANTLR start "rule__PrivateNamespace__Group_3__0__Impl"
    // InternalRosSystemParser.g:4366:1: rule__PrivateNamespace__Group_3__0__Impl : ( Parts ) ;
    public final void rule__PrivateNamespace__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4370:1: ( ( Parts ) )
            // InternalRosSystemParser.g:4371:1: ( Parts )
            {
            // InternalRosSystemParser.g:4371:1: ( Parts )
            // InternalRosSystemParser.g:4372:2: Parts
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0()); 
            match(input,Parts,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__1"
    // InternalRosSystemParser.g:4381:1: rule__PrivateNamespace__Group_3__1 : rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 ;
    public final void rule__PrivateNamespace__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4385:1: ( rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2 )
            // InternalRosSystemParser.g:4386:2: rule__PrivateNamespace__Group_3__1__Impl rule__PrivateNamespace__Group_3__2
            {
            pushFollow(FOLLOW_33);
            rule__PrivateNamespace__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__1"


    // $ANTLR start "rule__PrivateNamespace__Group_3__1__Impl"
    // InternalRosSystemParser.g:4393:1: rule__PrivateNamespace__Group_3__1__Impl : ( LeftCurlyBracket ) ;
    public final void rule__PrivateNamespace__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4397:1: ( ( LeftCurlyBracket ) )
            // InternalRosSystemParser.g:4398:1: ( LeftCurlyBracket )
            {
            // InternalRosSystemParser.g:4398:1: ( LeftCurlyBracket )
            // InternalRosSystemParser.g:4399:2: LeftCurlyBracket
            {
             before(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__1__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__2"
    // InternalRosSystemParser.g:4408:1: rule__PrivateNamespace__Group_3__2 : rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 ;
    public final void rule__PrivateNamespace__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4412:1: ( rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3 )
            // InternalRosSystemParser.g:4413:2: rule__PrivateNamespace__Group_3__2__Impl rule__PrivateNamespace__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__PrivateNamespace__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__2"


    // $ANTLR start "rule__PrivateNamespace__Group_3__2__Impl"
    // InternalRosSystemParser.g:4420:1: rule__PrivateNamespace__Group_3__2__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) ;
    public final void rule__PrivateNamespace__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4424:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) ) )
            // InternalRosSystemParser.g:4425:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            {
            // InternalRosSystemParser.g:4425:1: ( ( rule__PrivateNamespace__PartsAssignment_3_2 ) )
            // InternalRosSystemParser.g:4426:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2()); 
            // InternalRosSystemParser.g:4427:2: ( rule__PrivateNamespace__PartsAssignment_3_2 )
            // InternalRosSystemParser.g:4427:3: rule__PrivateNamespace__PartsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__2__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__3"
    // InternalRosSystemParser.g:4435:1: rule__PrivateNamespace__Group_3__3 : rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 ;
    public final void rule__PrivateNamespace__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4439:1: ( rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4 )
            // InternalRosSystemParser.g:4440:2: rule__PrivateNamespace__Group_3__3__Impl rule__PrivateNamespace__Group_3__4
            {
            pushFollow(FOLLOW_11);
            rule__PrivateNamespace__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__3"


    // $ANTLR start "rule__PrivateNamespace__Group_3__3__Impl"
    // InternalRosSystemParser.g:4447:1: rule__PrivateNamespace__Group_3__3__Impl : ( ( rule__PrivateNamespace__Group_3_3__0 )* ) ;
    public final void rule__PrivateNamespace__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4451:1: ( ( ( rule__PrivateNamespace__Group_3_3__0 )* ) )
            // InternalRosSystemParser.g:4452:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            {
            // InternalRosSystemParser.g:4452:1: ( ( rule__PrivateNamespace__Group_3_3__0 )* )
            // InternalRosSystemParser.g:4453:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            {
             before(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3()); 
            // InternalRosSystemParser.g:4454:2: ( rule__PrivateNamespace__Group_3_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRosSystemParser.g:4454:3: rule__PrivateNamespace__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__PrivateNamespace__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getPrivateNamespaceAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__3__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3__4"
    // InternalRosSystemParser.g:4462:1: rule__PrivateNamespace__Group_3__4 : rule__PrivateNamespace__Group_3__4__Impl ;
    public final void rule__PrivateNamespace__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4466:1: ( rule__PrivateNamespace__Group_3__4__Impl )
            // InternalRosSystemParser.g:4467:2: rule__PrivateNamespace__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__4"


    // $ANTLR start "rule__PrivateNamespace__Group_3__4__Impl"
    // InternalRosSystemParser.g:4473:1: rule__PrivateNamespace__Group_3__4__Impl : ( RightCurlyBracket ) ;
    public final void rule__PrivateNamespace__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4477:1: ( ( RightCurlyBracket ) )
            // InternalRosSystemParser.g:4478:1: ( RightCurlyBracket )
            {
            // InternalRosSystemParser.g:4478:1: ( RightCurlyBracket )
            // InternalRosSystemParser.g:4479:2: RightCurlyBracket
            {
             before(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3__4__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__0"
    // InternalRosSystemParser.g:4489:1: rule__PrivateNamespace__Group_3_3__0 : rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 ;
    public final void rule__PrivateNamespace__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4493:1: ( rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1 )
            // InternalRosSystemParser.g:4494:2: rule__PrivateNamespace__Group_3_3__0__Impl rule__PrivateNamespace__Group_3_3__1
            {
            pushFollow(FOLLOW_33);
            rule__PrivateNamespace__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__0"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__0__Impl"
    // InternalRosSystemParser.g:4501:1: rule__PrivateNamespace__Group_3_3__0__Impl : ( Comma ) ;
    public final void rule__PrivateNamespace__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4505:1: ( ( Comma ) )
            // InternalRosSystemParser.g:4506:1: ( Comma )
            {
            // InternalRosSystemParser.g:4506:1: ( Comma )
            // InternalRosSystemParser.g:4507:2: Comma
            {
             before(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__0__Impl"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__1"
    // InternalRosSystemParser.g:4516:1: rule__PrivateNamespace__Group_3_3__1 : rule__PrivateNamespace__Group_3_3__1__Impl ;
    public final void rule__PrivateNamespace__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4520:1: ( rule__PrivateNamespace__Group_3_3__1__Impl )
            // InternalRosSystemParser.g:4521:2: rule__PrivateNamespace__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__1"


    // $ANTLR start "rule__PrivateNamespace__Group_3_3__1__Impl"
    // InternalRosSystemParser.g:4527:1: rule__PrivateNamespace__Group_3_3__1__Impl : ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) ;
    public final void rule__PrivateNamespace__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4531:1: ( ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) ) )
            // InternalRosSystemParser.g:4532:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            {
            // InternalRosSystemParser.g:4532:1: ( ( rule__PrivateNamespace__PartsAssignment_3_3_1 ) )
            // InternalRosSystemParser.g:4533:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1()); 
            // InternalRosSystemParser.g:4534:2: ( rule__PrivateNamespace__PartsAssignment_3_3_1 )
            // InternalRosSystemParser.g:4534:3: rule__PrivateNamespace__PartsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateNamespace__PartsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__Group_3_3__1__Impl"


    // $ANTLR start "rule__RosSystem__NameAssignment_1"
    // InternalRosSystemParser.g:4543:1: rule__RosSystem__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RosSystem__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4547:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:4548:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:4548:2: ( ruleEString )
            // InternalRosSystemParser.g:4549:3: ruleEString
            {
             before(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__NameAssignment_1"


    // $ANTLR start "rule__RosSystem__RosnodeAssignment_4"
    // InternalRosSystemParser.g:4558:1: rule__RosSystem__RosnodeAssignment_4 : ( ruleRosNode ) ;
    public final void rule__RosSystem__RosnodeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4562:1: ( ( ruleRosNode ) )
            // InternalRosSystemParser.g:4563:2: ( ruleRosNode )
            {
            // InternalRosSystemParser.g:4563:2: ( ruleRosNode )
            // InternalRosSystemParser.g:4564:3: ruleRosNode
            {
             before(grammarAccess.getRosSystemAccess().getRosnodeRosNodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRosNode();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getRosnodeRosNodeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__RosnodeAssignment_4"


    // $ANTLR start "rule__RosNode__NameAssignment_0"
    // InternalRosSystemParser.g:4573:1: rule__RosNode__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__RosNode__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4577:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:4578:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:4578:2: ( ruleEString )
            // InternalRosSystemParser.g:4579:3: ruleEString
            {
             before(grammarAccess.getRosNodeAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosNodeAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__NameAssignment_0"


    // $ANTLR start "rule__RosNode__FromAssignment_4"
    // InternalRosSystemParser.g:4588:1: rule__RosNode__FromAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RosNode__FromAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4592:1: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:4593:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:4593:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:4594:3: ( ruleEString )
            {
             before(grammarAccess.getRosNodeAccess().getFromNodeCrossReference_4_0()); 
            // InternalRosSystemParser.g:4595:3: ( ruleEString )
            // InternalRosSystemParser.g:4596:4: ruleEString
            {
             before(grammarAccess.getRosNodeAccess().getFromNodeEStringParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosNodeAccess().getFromNodeEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRosNodeAccess().getFromNodeCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNode__FromAssignment_4"


    // $ANTLR start "rule__ParameterListType__SequenceAssignment_3"
    // InternalRosSystemParser.g:4607:1: rule__ParameterListType__SequenceAssignment_3 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4611:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:4612:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:4612:2: ( ruleParameterType )
            // InternalRosSystemParser.g:4613:3: ruleParameterType
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
    // InternalRosSystemParser.g:4622:1: rule__ParameterListType__SequenceAssignment_4_1 : ( ruleParameterType ) ;
    public final void rule__ParameterListType__SequenceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4626:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:4627:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:4627:2: ( ruleParameterType )
            // InternalRosSystemParser.g:4628:3: ruleParameterType
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
    // InternalRosSystemParser.g:4637:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_3 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4641:1: ( ( ruleParameterStructTypeMember ) )
            // InternalRosSystemParser.g:4642:2: ( ruleParameterStructTypeMember )
            {
            // InternalRosSystemParser.g:4642:2: ( ruleParameterStructTypeMember )
            // InternalRosSystemParser.g:4643:3: ruleParameterStructTypeMember
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
    // InternalRosSystemParser.g:4652:1: rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1 : ( ruleParameterStructTypeMember ) ;
    public final void rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4656:1: ( ( ruleParameterStructTypeMember ) )
            // InternalRosSystemParser.g:4657:2: ( ruleParameterStructTypeMember )
            {
            // InternalRosSystemParser.g:4657:2: ( ruleParameterStructTypeMember )
            // InternalRosSystemParser.g:4658:3: ruleParameterStructTypeMember
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
    // InternalRosSystemParser.g:4667:1: rule__ParameterIntegerType__DefaultAssignment_2_1 : ( ruleParameterInteger ) ;
    public final void rule__ParameterIntegerType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4671:1: ( ( ruleParameterInteger ) )
            // InternalRosSystemParser.g:4672:2: ( ruleParameterInteger )
            {
            // InternalRosSystemParser.g:4672:2: ( ruleParameterInteger )
            // InternalRosSystemParser.g:4673:3: ruleParameterInteger
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
    // InternalRosSystemParser.g:4682:1: rule__ParameterStringType__DefaultAssignment_2_1 : ( ruleParameterString ) ;
    public final void rule__ParameterStringType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4686:1: ( ( ruleParameterString ) )
            // InternalRosSystemParser.g:4687:2: ( ruleParameterString )
            {
            // InternalRosSystemParser.g:4687:2: ( ruleParameterString )
            // InternalRosSystemParser.g:4688:3: ruleParameterString
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
    // InternalRosSystemParser.g:4697:1: rule__ParameterDoubleType__DefaultAssignment_2_1 : ( ruleParameterDouble ) ;
    public final void rule__ParameterDoubleType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4701:1: ( ( ruleParameterDouble ) )
            // InternalRosSystemParser.g:4702:2: ( ruleParameterDouble )
            {
            // InternalRosSystemParser.g:4702:2: ( ruleParameterDouble )
            // InternalRosSystemParser.g:4703:3: ruleParameterDouble
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
    // InternalRosSystemParser.g:4712:1: rule__ParameterBooleanType__DefaultAssignment_2_1 : ( ruleParameterBoolean ) ;
    public final void rule__ParameterBooleanType__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4716:1: ( ( ruleParameterBoolean ) )
            // InternalRosSystemParser.g:4717:2: ( ruleParameterBoolean )
            {
            // InternalRosSystemParser.g:4717:2: ( ruleParameterBoolean )
            // InternalRosSystemParser.g:4718:3: ruleParameterBoolean
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
    // InternalRosSystemParser.g:4727:1: rule__ParameterBase64Type__DefaultAssignment_2_1 : ( ruleParameterBase64 ) ;
    public final void rule__ParameterBase64Type__DefaultAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4731:1: ( ( ruleParameterBase64 ) )
            // InternalRosSystemParser.g:4732:2: ( ruleParameterBase64 )
            {
            // InternalRosSystemParser.g:4732:2: ( ruleParameterBase64 )
            // InternalRosSystemParser.g:4733:3: ruleParameterBase64
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


    // $ANTLR start "rule__ParameterArrayType__TypeAssignment_3"
    // InternalRosSystemParser.g:4742:1: rule__ParameterArrayType__TypeAssignment_3 : ( ruleParameterType ) ;
    public final void rule__ParameterArrayType__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4746:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:4747:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:4747:2: ( ruleParameterType )
            // InternalRosSystemParser.g:4748:3: ruleParameterType
            {
             before(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterType();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__TypeAssignment_3"


    // $ANTLR start "rule__ParameterArrayType__DefaultAssignment_4_1"
    // InternalRosSystemParser.g:4757:1: rule__ParameterArrayType__DefaultAssignment_4_1 : ( ruleParameterList ) ;
    public final void rule__ParameterArrayType__DefaultAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4761:1: ( ( ruleParameterList ) )
            // InternalRosSystemParser.g:4762:2: ( ruleParameterList )
            {
            // InternalRosSystemParser.g:4762:2: ( ruleParameterList )
            // InternalRosSystemParser.g:4763:3: ruleParameterList
            {
             before(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterList();

            state._fsp--;

             after(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterArrayType__DefaultAssignment_4_1"


    // $ANTLR start "rule__ParameterList__ValueAssignment_2"
    // InternalRosSystemParser.g:4772:1: rule__ParameterList__ValueAssignment_2 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4776:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:4777:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:4777:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:4778:3: ruleParameterValue
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
    // InternalRosSystemParser.g:4787:1: rule__ParameterList__ValueAssignment_3_1 : ( ruleParameterValue ) ;
    public final void rule__ParameterList__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4791:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:4792:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:4792:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:4793:3: ruleParameterValue
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


    // $ANTLR start "rule__ParameterAny__ValueAssignment_3_1"
    // InternalRosSystemParser.g:4802:1: rule__ParameterAny__ValueAssignment_3_1 : ( ruleEString ) ;
    public final void rule__ParameterAny__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4806:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:4807:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:4807:2: ( ruleEString )
            // InternalRosSystemParser.g:4808:3: ruleEString
            {
             before(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterAny__ValueAssignment_3_1"


    // $ANTLR start "rule__ParameterString__ValueAssignment"
    // InternalRosSystemParser.g:4817:1: rule__ParameterString__ValueAssignment : ( ruleEString ) ;
    public final void rule__ParameterString__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4821:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:4822:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:4822:2: ( ruleEString )
            // InternalRosSystemParser.g:4823:3: ruleEString
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
    // InternalRosSystemParser.g:4832:1: rule__ParameterBase64__ValueAssignment : ( ruleBase64Binary ) ;
    public final void rule__ParameterBase64__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4836:1: ( ( ruleBase64Binary ) )
            // InternalRosSystemParser.g:4837:2: ( ruleBase64Binary )
            {
            // InternalRosSystemParser.g:4837:2: ( ruleBase64Binary )
            // InternalRosSystemParser.g:4838:3: ruleBase64Binary
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
    // InternalRosSystemParser.g:4847:1: rule__ParameterInteger__ValueAssignment : ( ruleInteger0 ) ;
    public final void rule__ParameterInteger__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4851:1: ( ( ruleInteger0 ) )
            // InternalRosSystemParser.g:4852:2: ( ruleInteger0 )
            {
            // InternalRosSystemParser.g:4852:2: ( ruleInteger0 )
            // InternalRosSystemParser.g:4853:3: ruleInteger0
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
    // InternalRosSystemParser.g:4862:1: rule__ParameterDouble__ValueAssignment : ( ruleDouble0 ) ;
    public final void rule__ParameterDouble__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4866:1: ( ( ruleDouble0 ) )
            // InternalRosSystemParser.g:4867:2: ( ruleDouble0 )
            {
            // InternalRosSystemParser.g:4867:2: ( ruleDouble0 )
            // InternalRosSystemParser.g:4868:3: ruleDouble0
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
    // InternalRosSystemParser.g:4877:1: rule__ParameterBoolean__ValueAssignment : ( ruleboolean0 ) ;
    public final void rule__ParameterBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4881:1: ( ( ruleboolean0 ) )
            // InternalRosSystemParser.g:4882:2: ( ruleboolean0 )
            {
            // InternalRosSystemParser.g:4882:2: ( ruleboolean0 )
            // InternalRosSystemParser.g:4883:3: ruleboolean0
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


    // $ANTLR start "rule__ParameterDate__ValueAssignment"
    // InternalRosSystemParser.g:4892:1: rule__ParameterDate__ValueAssignment : ( ruleDateTime0 ) ;
    public final void rule__ParameterDate__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4896:1: ( ( ruleDateTime0 ) )
            // InternalRosSystemParser.g:4897:2: ( ruleDateTime0 )
            {
            // InternalRosSystemParser.g:4897:2: ( ruleDateTime0 )
            // InternalRosSystemParser.g:4898:3: ruleDateTime0
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


    // $ANTLR start "rule__ParameterStruct__ValueAssignment_1_1"
    // InternalRosSystemParser.g:4907:1: rule__ParameterStruct__ValueAssignment_1_1 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4911:1: ( ( ruleParameterStructMember ) )
            // InternalRosSystemParser.g:4912:2: ( ruleParameterStructMember )
            {
            // InternalRosSystemParser.g:4912:2: ( ruleParameterStructMember )
            // InternalRosSystemParser.g:4913:3: ruleParameterStructMember
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
    // InternalRosSystemParser.g:4922:1: rule__ParameterStruct__ValueAssignment_1_2_2 : ( ruleParameterStructMember ) ;
    public final void rule__ParameterStruct__ValueAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4926:1: ( ( ruleParameterStructMember ) )
            // InternalRosSystemParser.g:4927:2: ( ruleParameterStructMember )
            {
            // InternalRosSystemParser.g:4927:2: ( ruleParameterStructMember )
            // InternalRosSystemParser.g:4928:3: ruleParameterStructMember
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


    // $ANTLR start "rule__ParameterStructMember__NameAssignment_0"
    // InternalRosSystemParser.g:4937:1: rule__ParameterStructMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4941:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:4942:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:4942:2: ( ruleEString )
            // InternalRosSystemParser.g:4943:3: ruleEString
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
    // InternalRosSystemParser.g:4952:1: rule__ParameterStructMember__ValueAssignment_3 : ( ruleParameterValue ) ;
    public final void rule__ParameterStructMember__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4956:1: ( ( ruleParameterValue ) )
            // InternalRosSystemParser.g:4957:2: ( ruleParameterValue )
            {
            // InternalRosSystemParser.g:4957:2: ( ruleParameterValue )
            // InternalRosSystemParser.g:4958:3: ruleParameterValue
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
    // InternalRosSystemParser.g:4967:1: rule__ParameterStructTypeMember__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__ParameterStructTypeMember__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4971:1: ( ( ruleEString ) )
            // InternalRosSystemParser.g:4972:2: ( ruleEString )
            {
            // InternalRosSystemParser.g:4972:2: ( ruleEString )
            // InternalRosSystemParser.g:4973:3: ruleEString
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
    // InternalRosSystemParser.g:4982:1: rule__ParameterStructTypeMember__TypeAssignment_1 : ( ruleParameterType ) ;
    public final void rule__ParameterStructTypeMember__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:4986:1: ( ( ruleParameterType ) )
            // InternalRosSystemParser.g:4987:2: ( ruleParameterType )
            {
            // InternalRosSystemParser.g:4987:2: ( ruleParameterType )
            // InternalRosSystemParser.g:4988:3: ruleParameterType
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


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_3_2"
    // InternalRosSystemParser.g:4997:1: rule__GlobalNamespace__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5001:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:5002:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:5002:2: ( ruleGraphName )
            // InternalRosSystemParser.g:5003:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_3_2"


    // $ANTLR start "rule__GlobalNamespace__PartsAssignment_3_3_1"
    // InternalRosSystemParser.g:5012:1: rule__GlobalNamespace__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__GlobalNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5016:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:5017:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:5017:2: ( ruleGraphName )
            // InternalRosSystemParser.g:5018:3: ruleGraphName
            {
             before(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalNamespace__PartsAssignment_3_3_1"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_3_2"
    // InternalRosSystemParser.g:5027:1: rule__RelativeNamespace_Impl__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5031:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:5032:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:5032:2: ( ruleGraphName )
            // InternalRosSystemParser.g:5033:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_3_2"


    // $ANTLR start "rule__RelativeNamespace_Impl__PartsAssignment_3_3_1"
    // InternalRosSystemParser.g:5042:1: rule__RelativeNamespace_Impl__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__RelativeNamespace_Impl__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5046:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:5047:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:5047:2: ( ruleGraphName )
            // InternalRosSystemParser.g:5048:3: ruleGraphName
            {
             before(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelativeNamespace_Impl__PartsAssignment_3_3_1"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_3_2"
    // InternalRosSystemParser.g:5057:1: rule__PrivateNamespace__PartsAssignment_3_2 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5061:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:5062:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:5062:2: ( ruleGraphName )
            // InternalRosSystemParser.g:5063:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_3_2"


    // $ANTLR start "rule__PrivateNamespace__PartsAssignment_3_3_1"
    // InternalRosSystemParser.g:5072:1: rule__PrivateNamespace__PartsAssignment_3_3_1 : ( ruleGraphName ) ;
    public final void rule__PrivateNamespace__PartsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystemParser.g:5076:1: ( ( ruleGraphName ) )
            // InternalRosSystemParser.g:5077:2: ( ruleGraphName )
            {
            // InternalRosSystemParser.g:5077:2: ( ruleGraphName )
            // InternalRosSystemParser.g:5078:3: ruleGraphName
            {
             before(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGraphName();

            state._fsp--;

             after(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateNamespace__PartsAssignment_3_3_1"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\7\12\uffff";
    static final String dfa_3s = "\1\33\5\uffff\1\33\1\uffff\2\33\1\uffff";
    static final String dfa_4s = "\1\57\5\uffff\1\57\1\uffff\2\36\1\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\2\uffff\1\6";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\7\1\uffff\1\6\1\7\4\uffff\1\2\1\5\1\3\1\4\6\uffff\1\1\1\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\2\12\4\uffff\4\12\6\uffff\1\11\1\uffff\1\10",
            "",
            "\1\12\1\uffff\1\7\1\12",
            "\1\12\1\uffff\1\7\1\12",
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
            return "1009:1: rule__ParameterValue__Alternatives : ( ( ruleParameterString ) | ( ruleParameterBase64 ) | ( ruleParameterInteger ) | ( ruleParameterDouble ) | ( ruleParameterBoolean ) | ( ruleParameterList ) | ( ruleParameterStruct ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000087D800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040002000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000A07820000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000020L});

}