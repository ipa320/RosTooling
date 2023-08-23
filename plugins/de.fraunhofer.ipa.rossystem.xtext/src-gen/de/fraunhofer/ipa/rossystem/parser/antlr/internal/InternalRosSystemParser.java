package de.fraunhofer.ipa.rossystem.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRosSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "ParameterAny", "Connections", "Interfaces", "Parameters", "Processes", "GraphName", "Float32_1", "Float64_1", "Default", "Duration", "Feedback", "String_2", "Threads", "Uint16_1", "Uint32_1", "Uint64_1", "Boolean", "Integer", "Float32", "Float64", "Int16_1", "Int32_1", "Int64_1", "Message", "Service", "Uint8_1", "Array", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Char_1", "Int8_1", "Nodes", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "From", "Int16", "Int32", "Int64", "Pub", "Sub", "Type_1", "Uint8", "Value", "Date", "List", "Ac", "As", "Bool", "Byte", "Char", "Goal", "Int8", "Name", "Node", "Sc", "Ss", "Time", "Type", "Any", "Ns", "HyphenMinusLeftSquareBracket", "LeftSquareBracketRightSquareBracket", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Connections=8;
    public static final int Float32_1=13;
    public static final int Node=70;
    public static final int RULE_DATE_TIME=94;
    public static final int Uint64_1=22;
    public static final int String=37;
    public static final int Processes=11;
    public static final int Int16=52;
    public static final int Float32=25;
    public static final int Goal=67;
    public static final int Bool=64;
    public static final int Uint16=47;
    public static final int Boolean=23;
    public static final int Sub=56;
    public static final int Uint8=58;
    public static final int Parameters=10;
    public static final int RULE_ID=95;
    public static final int RULE_DIGIT=84;
    public static final int GlobalNamespace=6;
    public static final int Int16_1=27;
    public static final int Header=36;
    public static final int RULE_INT=97;
    public static final int Byte=65;
    public static final int RULE_ML_COMMENT=104;
    public static final int LeftSquareBracket=82;
    public static final int Ac=62;
    public static final int Base64=34;
    public static final int Comma=79;
    public static final int As=63;
    public static final int HyphenMinus=80;
    public static final int RULE_MESSAGE_ASIGMENT=98;
    public static final int LeftSquareBracketRightSquareBracket=78;
    public static final int Int32=53;
    public static final int Char=66;
    public static final int RULE_DECINT=87;
    public static final int Uint32=48;
    public static final int RULE_HOUR=92;
    public static final int Int8=68;
    public static final int Default=15;
    public static final int Int8_1=43;
    public static final int Uint16_1=20;
    public static final int Sc=71;
    public static final int Type=74;
    public static final int Float64=26;
    public static final int Int32_1=28;
    public static final int RULE_BINARY=85;
    public static final int String_1=46;
    public static final int String_2=18;
    public static final int Ss=72;
    public static final int RULE_DAY=89;
    public static final int RULE_BEGIN=99;
    public static final int RULE_BOOLEAN=86;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=91;
    public static final int Result=45;
    public static final int Name=69;
    public static final int RULE_MIN_SEC=93;
    public static final int Char_1=42;
    public static final int ParameterAny=7;
    public static final int List=61;
    public static final int RightSquareBracket=83;
    public static final int PrivateNamespace=5;
    public static final int GraphName=12;
    public static final int Byte_1=41;
    public static final int Float64_1=14;
    public static final int Duration=16;
    public static final int Uint32_1=21;
    public static final int Double=35;
    public static final int Type_1=57;
    public static final int Value=59;
    public static final int Uint64=49;
    public static final int Action=39;
    public static final int RULE_END=100;
    public static final int Message=30;
    public static final int Value_1=50;
    public static final int Time=73;
    public static final int RULE_STRING=96;
    public static final int Bool_1=40;
    public static final int Any=75;
    public static final int Struct=38;
    public static final int RULE_SL_COMMENT=101;
    public static final int Uint8_1=32;
    public static final int RULE_DOUBLE=88;
    public static final int Feedback=17;
    public static final int RULE_ROS_CONVENTION_A=102;
    public static final int RULE_ROS_CONVENTION_PARAM=103;
    public static final int Colon=81;
    public static final int Pub=55;
    public static final int EOF=-1;
    public static final int Ns=76;
    public static final int RULE_WS=105;
    public static final int HyphenMinusLeftSquareBracket=77;
    public static final int Int64_1=29;
    public static final int Service=31;
    public static final int From=51;
    public static final int RULE_ANY_OTHER=106;
    public static final int Nodes=44;
    public static final int Date=60;
    public static final int Interfaces=9;
    public static final int Threads=19;
    public static final int Integer=24;
    public static final int Array=33;
    public static final int Int64=54;
    public static final int RULE_MONTH=90;

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

        public InternalRosSystemParser(TokenStream input, RosSystemGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "System";
       	}

       	@Override
       	protected RosSystemGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSystem"
    // InternalRosSystemParser.g:57:1: entryRuleSystem returns [EObject current=null] : iv_ruleSystem= ruleSystem EOF ;
    public final EObject entryRuleSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystem = null;


        try {
            // InternalRosSystemParser.g:57:47: (iv_ruleSystem= ruleSystem EOF )
            // InternalRosSystemParser.g:58:2: iv_ruleSystem= ruleSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSystem"


    // $ANTLR start "ruleSystem"
    // InternalRosSystemParser.g:64:1: ruleSystem returns [EObject current=null] : this_RosSystem_0= ruleRosSystem ;
    public final EObject ruleSystem() throws RecognitionException {
        EObject current = null;

        EObject this_RosSystem_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:70:2: (this_RosSystem_0= ruleRosSystem )
            // InternalRosSystemParser.g:71:2: this_RosSystem_0= ruleRosSystem
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSystemAccess().getRosSystemParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_RosSystem_0=ruleRosSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_RosSystem_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSystem"


    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystemParser.g:82:1: entryRuleRosSystem returns [EObject current=null] : iv_ruleRosSystem= ruleRosSystem EOF ;
    public final EObject entryRuleRosSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSystem = null;


        try {
            // InternalRosSystemParser.g:82:50: (iv_ruleRosSystem= ruleRosSystem EOF )
            // InternalRosSystemParser.g:83:2: iv_ruleRosSystem= ruleRosSystem EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosSystemRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosSystem=ruleRosSystem();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosSystem; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosSystem"


    // $ANTLR start "ruleRosSystem"
    // InternalRosSystemParser.g:89:1: ruleRosSystem returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleConnection ) )* this_END_18= RULE_END ) )* this_END_19= RULE_END ) ;
    public final EObject ruleRosSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token this_END_14=null;
        Token otherlv_15=null;
        Token this_BEGIN_16=null;
        Token this_END_18=null;
        Token this_END_19=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_processes_5_0 = null;

        EObject lv_components_9_0 = null;

        EObject lv_parameter_13_0 = null;

        EObject lv_connections_17_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:95:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleConnection ) )* this_END_18= RULE_END ) )* this_END_19= RULE_END ) )
            // InternalRosSystemParser.g:96:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleConnection ) )* this_END_18= RULE_END ) )* this_END_19= RULE_END )
            {
            // InternalRosSystemParser.g:96:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleConnection ) )* this_END_18= RULE_END ) )* this_END_19= RULE_END )
            // InternalRosSystemParser.g:97:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleConnection ) )* this_END_18= RULE_END ) )* this_END_19= RULE_END
            {
            // InternalRosSystemParser.g:97:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystemParser.g:98:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:98:4: (lv_name_0_0= ruleEString )
            // InternalRosSystemParser.g:99:5: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosSystemRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRosSystemAccess().getColonKeyword_1());
              		
            }
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalRosSystemParser.g:124:3: ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleConnection ) )* this_END_18= RULE_END ) )*
            loop5:
            do {
                int alt5=5;
                switch ( input.LA(1) ) {
                case Processes:
                    {
                    alt5=1;
                    }
                    break;
                case Nodes:
                    {
                    alt5=2;
                    }
                    break;
                case Parameters:
                    {
                    alt5=3;
                    }
                    break;
                case Connections:
                    {
                    alt5=4;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // InternalRosSystemParser.g:125:4: (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END )
            	    {
            	    // InternalRosSystemParser.g:125:4: (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END )
            	    // InternalRosSystemParser.g:126:5: otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END
            	    {
            	    otherlv_3=(Token)match(input,Processes,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getRosSystemAccess().getProcessesKeyword_3_0_0());
            	      				
            	    }
            	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_BEGIN_4, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_0_1());
            	      				
            	    }
            	    // InternalRosSystemParser.g:134:5: ( (lv_processes_5_0= ruleProcess ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalRosSystemParser.g:135:6: (lv_processes_5_0= ruleProcess )
            	    	    {
            	    	    // InternalRosSystemParser.g:135:6: (lv_processes_5_0= ruleProcess )
            	    	    // InternalRosSystemParser.g:136:7: lv_processes_5_0= ruleProcess
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getRosSystemAccess().getProcessesProcessParserRuleCall_3_0_2_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_processes_5_0=ruleProcess();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"processes",
            	    	      								lv_processes_5_0,
            	    	      								"de.fraunhofer.ipa.rossystem.RosSystem.Process");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    this_END_6=(Token)match(input,RULE_END,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_END_6, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_0_3());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystemParser.g:159:4: (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END )
            	    {
            	    // InternalRosSystemParser.g:159:4: (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END )
            	    // InternalRosSystemParser.g:160:5: otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END
            	    {
            	    otherlv_7=(Token)match(input,Nodes,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_7, grammarAccess.getRosSystemAccess().getNodesKeyword_3_1_0());
            	      				
            	    }
            	    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_BEGIN_8, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_1_1());
            	      				
            	    }
            	    // InternalRosSystemParser.g:168:5: ( (lv_components_9_0= ruleRosNode ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalRosSystemParser.g:169:6: (lv_components_9_0= ruleRosNode )
            	    	    {
            	    	    // InternalRosSystemParser.g:169:6: (lv_components_9_0= ruleRosNode )
            	    	    // InternalRosSystemParser.g:170:7: lv_components_9_0= ruleRosNode
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getRosSystemAccess().getComponentsRosNodeParserRuleCall_3_1_2_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_components_9_0=ruleRosNode();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"components",
            	    	      								lv_components_9_0,
            	    	      								"de.fraunhofer.ipa.rossystem.RosSystem.RosNode");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    this_END_10=(Token)match(input,RULE_END,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_END_10, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_1_3());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRosSystemParser.g:193:4: (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END )
            	    {
            	    // InternalRosSystemParser.g:193:4: (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END )
            	    // InternalRosSystemParser.g:194:5: otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END
            	    {
            	    otherlv_11=(Token)match(input,Parameters,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_11, grammarAccess.getRosSystemAccess().getParametersKeyword_3_2_0());
            	      				
            	    }
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_BEGIN_12, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_2_1());
            	      				
            	    }
            	    // InternalRosSystemParser.g:202:5: ( (lv_parameter_13_0= ruleRosParameter ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalRosSystemParser.g:203:6: (lv_parameter_13_0= ruleRosParameter )
            	    	    {
            	    	    // InternalRosSystemParser.g:203:6: (lv_parameter_13_0= ruleRosParameter )
            	    	    // InternalRosSystemParser.g:204:7: lv_parameter_13_0= ruleRosParameter
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getRosSystemAccess().getParameterRosParameterParserRuleCall_3_2_2_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_parameter_13_0=ruleRosParameter();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"parameter",
            	    	      								lv_parameter_13_0,
            	    	      								"de.fraunhofer.ipa.rossystem.RosSystem.RosParameter");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    this_END_14=(Token)match(input,RULE_END,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_END_14, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_2_3());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRosSystemParser.g:227:4: (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleConnection ) )* this_END_18= RULE_END )
            	    {
            	    // InternalRosSystemParser.g:227:4: (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleConnection ) )* this_END_18= RULE_END )
            	    // InternalRosSystemParser.g:228:5: otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleConnection ) )* this_END_18= RULE_END
            	    {
            	    otherlv_15=(Token)match(input,Connections,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_15, grammarAccess.getRosSystemAccess().getConnectionsKeyword_3_3_0());
            	      				
            	    }
            	    this_BEGIN_16=(Token)match(input,RULE_BEGIN,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_BEGIN_16, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_3_1());
            	      				
            	    }
            	    // InternalRosSystemParser.g:236:5: ( (lv_connections_17_0= ruleConnection ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==HyphenMinusLeftSquareBracket) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalRosSystemParser.g:237:6: (lv_connections_17_0= ruleConnection )
            	    	    {
            	    	    // InternalRosSystemParser.g:237:6: (lv_connections_17_0= ruleConnection )
            	    	    // InternalRosSystemParser.g:238:7: lv_connections_17_0= ruleConnection
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      							newCompositeNode(grammarAccess.getRosSystemAccess().getConnectionsConnectionParserRuleCall_3_3_2_0());
            	    	      						
            	    	    }
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_connections_17_0=ruleConnection();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      							if (current==null) {
            	    	      								current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	    	      							}
            	    	      							add(
            	    	      								current,
            	    	      								"connections",
            	    	      								lv_connections_17_0,
            	    	      								"de.fraunhofer.ipa.rossystem.RosSystem.Connection");
            	    	      							afterParserOrEnumRuleCall();
            	    	      						
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    this_END_18=(Token)match(input,RULE_END,FOLLOW_5); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_END_18, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_3_3());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_END_19=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_19, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosSystem"


    // $ANTLR start "entryRuleProcess"
    // InternalRosSystemParser.g:269:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalRosSystemParser.g:269:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalRosSystemParser.g:270:2: iv_ruleProcess= ruleProcess EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getProcessRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleProcess; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalRosSystemParser.g:276:1: ruleProcess returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )? this_END_12= RULE_END ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_threads_11_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:282:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )? this_END_12= RULE_END ) )
            // InternalRosSystemParser.g:283:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )? this_END_12= RULE_END )
            {
            // InternalRosSystemParser.g:283:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )? this_END_12= RULE_END )
            // InternalRosSystemParser.g:284:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )? this_END_12= RULE_END
            {
            // InternalRosSystemParser.g:284:3: ()
            // InternalRosSystemParser.g:285:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getProcessAccess().getProcessAction_0(),
              					current);
              			
            }

            }

            // InternalRosSystemParser.g:291:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosSystemParser.g:292:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosSystemParser.g:292:4: (lv_name_1_0= ruleEString )
            // InternalRosSystemParser.g:293:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getProcessRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getColonKeyword_2());
              		
            }
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getProcessAccess().getBEGINTerminalRuleCall_3());
              		
            }
            // InternalRosSystemParser.g:318:3: (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Nodes) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRosSystemParser.g:319:4: otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket
                    {
                    otherlv_4=(Token)match(input,Nodes,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getNodesKeyword_4_0());
                      			
                    }
                    otherlv_5=(Token)match(input,LeftSquareBracket,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_4_1());
                      			
                    }
                    // InternalRosSystemParser.g:327:4: ( ( ruleEString ) )
                    // InternalRosSystemParser.g:328:5: ( ruleEString )
                    {
                    // InternalRosSystemParser.g:328:5: ( ruleEString )
                    // InternalRosSystemParser.g:329:6: ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getProcessRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcessAccess().getComponentsRosNodeCrossReference_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRosSystemParser.g:343:4: (otherlv_7= Comma ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==Comma) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:344:5: otherlv_7= Comma ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalRosSystemParser.g:348:5: ( ( ruleEString ) )
                    	    // InternalRosSystemParser.g:349:6: ( ruleEString )
                    	    {
                    	    // InternalRosSystemParser.g:349:6: ( ruleEString )
                    	    // InternalRosSystemParser.g:350:7: ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getProcessRule());
                    	      							}
                    	      						
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getProcessAccess().getComponentsRosNodeCrossReference_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,RightSquareBracket,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getRightSquareBracketKeyword_4_4());
                      			
                    }

                    }
                    break;

            }

            // InternalRosSystemParser.g:370:3: (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Threads) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRosSystemParser.g:371:4: otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) )
                    {
                    otherlv_10=(Token)match(input,Threads,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getThreadsKeyword_5_0());
                      			
                    }
                    // InternalRosSystemParser.g:375:4: ( (lv_threads_11_0= ruleInteger0 ) )
                    // InternalRosSystemParser.g:376:5: (lv_threads_11_0= ruleInteger0 )
                    {
                    // InternalRosSystemParser.g:376:5: (lv_threads_11_0= ruleInteger0 )
                    // InternalRosSystemParser.g:377:6: lv_threads_11_0= ruleInteger0
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getProcessAccess().getThreadsInteger0ParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_threads_11_0=ruleInteger0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getProcessRule());
                      						}
                      						set(
                      							current,
                      							"threads",
                      							lv_threads_11_0,
                      							"de.fraunhofer.ipa.ros.Basics.Integer0");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            this_END_12=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_12, grammarAccess.getProcessAccess().getENDTerminalRuleCall_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleRosNode"
    // InternalRosSystemParser.g:403:1: entryRuleRosNode returns [EObject current=null] : iv_ruleRosNode= ruleRosNode EOF ;
    public final EObject entryRuleRosNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosNode = null;


        try {
            // InternalRosSystemParser.g:403:48: (iv_ruleRosNode= ruleRosNode EOF )
            // InternalRosSystemParser.g:404:2: iv_ruleRosNode= ruleRosNode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosNode=ruleRosNode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosNode; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosNode"


    // $ANTLR start "ruleRosNode"
    // InternalRosSystemParser.g:410:1: ruleRosNode returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= From ( ( ruleEString ) ) (otherlv_6= Interfaces this_BEGIN_7= RULE_BEGIN ( (lv_rosinterfaces_8_0= ruleRosInterface ) )* this_END_9= RULE_END )? (otherlv_10= Parameters this_BEGIN_11= RULE_BEGIN ( (lv_rosparameters_12_0= ruleRosParameter ) )* this_END_13= RULE_END )? this_END_14= RULE_END ) ;
    public final EObject ruleRosNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token this_END_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rosinterfaces_8_0 = null;

        EObject lv_rosparameters_12_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:416:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= From ( ( ruleEString ) ) (otherlv_6= Interfaces this_BEGIN_7= RULE_BEGIN ( (lv_rosinterfaces_8_0= ruleRosInterface ) )* this_END_9= RULE_END )? (otherlv_10= Parameters this_BEGIN_11= RULE_BEGIN ( (lv_rosparameters_12_0= ruleRosParameter ) )* this_END_13= RULE_END )? this_END_14= RULE_END ) )
            // InternalRosSystemParser.g:417:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= From ( ( ruleEString ) ) (otherlv_6= Interfaces this_BEGIN_7= RULE_BEGIN ( (lv_rosinterfaces_8_0= ruleRosInterface ) )* this_END_9= RULE_END )? (otherlv_10= Parameters this_BEGIN_11= RULE_BEGIN ( (lv_rosparameters_12_0= ruleRosParameter ) )* this_END_13= RULE_END )? this_END_14= RULE_END )
            {
            // InternalRosSystemParser.g:417:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= From ( ( ruleEString ) ) (otherlv_6= Interfaces this_BEGIN_7= RULE_BEGIN ( (lv_rosinterfaces_8_0= ruleRosInterface ) )* this_END_9= RULE_END )? (otherlv_10= Parameters this_BEGIN_11= RULE_BEGIN ( (lv_rosparameters_12_0= ruleRosParameter ) )* this_END_13= RULE_END )? this_END_14= RULE_END )
            // InternalRosSystemParser.g:418:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= From ( ( ruleEString ) ) (otherlv_6= Interfaces this_BEGIN_7= RULE_BEGIN ( (lv_rosinterfaces_8_0= ruleRosInterface ) )* this_END_9= RULE_END )? (otherlv_10= Parameters this_BEGIN_11= RULE_BEGIN ( (lv_rosparameters_12_0= ruleRosParameter ) )* this_END_13= RULE_END )? this_END_14= RULE_END
            {
            // InternalRosSystemParser.g:418:3: ()
            // InternalRosSystemParser.g:419:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosNodeAccess().getRosNodeAction_0(),
              					current);
              			
            }

            }

            // InternalRosSystemParser.g:425:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosSystemParser.g:426:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosSystemParser.g:426:4: (lv_name_1_0= ruleEString )
            // InternalRosSystemParser.g:427:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosNodeAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosNodeRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRosNodeAccess().getColonKeyword_2());
              		
            }
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_3());
              		
            }
            otherlv_4=(Token)match(input,From,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRosNodeAccess().getFromKeyword_4());
              		
            }
            // InternalRosSystemParser.g:456:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:457:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:457:4: ( ruleEString )
            // InternalRosSystemParser.g:458:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosNodeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosNodeAccess().getFromNodeCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRosSystemParser.g:472:3: (otherlv_6= Interfaces this_BEGIN_7= RULE_BEGIN ( (lv_rosinterfaces_8_0= ruleRosInterface ) )* this_END_9= RULE_END )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Interfaces) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRosSystemParser.g:473:4: otherlv_6= Interfaces this_BEGIN_7= RULE_BEGIN ( (lv_rosinterfaces_8_0= ruleRosInterface ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Interfaces,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getRosNodeAccess().getInterfacesKeyword_6_0());
                      			
                    }
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_7, grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_6_1());
                      			
                    }
                    // InternalRosSystemParser.g:481:4: ( (lv_rosinterfaces_8_0= ruleRosInterface ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==HyphenMinus) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:482:5: (lv_rosinterfaces_8_0= ruleRosInterface )
                    	    {
                    	    // InternalRosSystemParser.g:482:5: (lv_rosinterfaces_8_0= ruleRosInterface )
                    	    // InternalRosSystemParser.g:483:6: lv_rosinterfaces_8_0= ruleRosInterface
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getRosNodeAccess().getRosinterfacesRosInterfaceParserRuleCall_6_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_rosinterfaces_8_0=ruleRosInterface();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getRosNodeRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"rosinterfaces",
                    	      							lv_rosinterfaces_8_0,
                    	      							"de.fraunhofer.ipa.rossystem.RosSystem.RosInterface");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_9, grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_6_3());
                      			
                    }

                    }
                    break;

            }

            // InternalRosSystemParser.g:505:3: (otherlv_10= Parameters this_BEGIN_11= RULE_BEGIN ( (lv_rosparameters_12_0= ruleRosParameter ) )* this_END_13= RULE_END )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Parameters) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosSystemParser.g:506:4: otherlv_10= Parameters this_BEGIN_11= RULE_BEGIN ( (lv_rosparameters_12_0= ruleRosParameter ) )* this_END_13= RULE_END
                    {
                    otherlv_10=(Token)match(input,Parameters,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getRosNodeAccess().getParametersKeyword_7_0());
                      			
                    }
                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_BEGIN_11, grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_7_1());
                      			
                    }
                    // InternalRosSystemParser.g:514:4: ( (lv_rosparameters_12_0= ruleRosParameter ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:515:5: (lv_rosparameters_12_0= ruleRosParameter )
                    	    {
                    	    // InternalRosSystemParser.g:515:5: (lv_rosparameters_12_0= ruleRosParameter )
                    	    // InternalRosSystemParser.g:516:6: lv_rosparameters_12_0= ruleRosParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      						newCompositeNode(grammarAccess.getRosNodeAccess().getRosparametersRosParameterParserRuleCall_7_2_0());
                    	      					
                    	    }
                    	    pushFollow(FOLLOW_6);
                    	    lv_rosparameters_12_0=ruleRosParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						if (current==null) {
                    	      							current = createModelElementForParent(grammarAccess.getRosNodeRule());
                    	      						}
                    	      						add(
                    	      							current,
                    	      							"rosparameters",
                    	      							lv_rosparameters_12_0,
                    	      							"de.fraunhofer.ipa.rossystem.RosSystem.RosParameter");
                    	      						afterParserOrEnumRuleCall();
                    	      					
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    this_END_13=(Token)match(input,RULE_END,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_END_13, grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_7_3());
                      			
                    }

                    }
                    break;

            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_14, grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosNode"


    // $ANTLR start "entryRuleRosInterface"
    // InternalRosSystemParser.g:546:1: entryRuleRosInterface returns [EObject current=null] : iv_ruleRosInterface= ruleRosInterface EOF ;
    public final EObject entryRuleRosInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosInterface = null;


        try {
            // InternalRosSystemParser.g:546:53: (iv_ruleRosInterface= ruleRosInterface EOF )
            // InternalRosSystemParser.g:547:2: iv_ruleRosInterface= ruleRosInterface EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosInterfaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosInterface=ruleRosInterface();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosInterface; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosInterface"


    // $ANTLR start "ruleRosInterface"
    // InternalRosSystemParser.g:553:1: ruleRosInterface returns [EObject current=null] : (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_reference_3_0= ruleInterfaceReference ) ) ) ;
    public final EObject ruleRosInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_reference_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:559:2: ( (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_reference_3_0= ruleInterfaceReference ) ) ) )
            // InternalRosSystemParser.g:560:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_reference_3_0= ruleInterfaceReference ) ) )
            {
            // InternalRosSystemParser.g:560:2: (otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_reference_3_0= ruleInterfaceReference ) ) )
            // InternalRosSystemParser.g:561:3: otherlv_0= HyphenMinus ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon ( (lv_reference_3_0= ruleInterfaceReference ) )
            {
            otherlv_0=(Token)match(input,HyphenMinus,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosInterfaceAccess().getHyphenMinusKeyword_0());
              		
            }
            // InternalRosSystemParser.g:565:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosSystemParser.g:566:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosSystemParser.g:566:4: (lv_name_1_0= ruleEString )
            // InternalRosSystemParser.g:567:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosInterfaceAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosInterfaceRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRosInterfaceAccess().getColonKeyword_2());
              		
            }
            // InternalRosSystemParser.g:588:3: ( (lv_reference_3_0= ruleInterfaceReference ) )
            // InternalRosSystemParser.g:589:4: (lv_reference_3_0= ruleInterfaceReference )
            {
            // InternalRosSystemParser.g:589:4: (lv_reference_3_0= ruleInterfaceReference )
            // InternalRosSystemParser.g:590:5: lv_reference_3_0= ruleInterfaceReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosInterfaceAccess().getReferenceInterfaceReferenceParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_reference_3_0=ruleInterfaceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosInterfaceRule());
              					}
              					set(
              						current,
              						"reference",
              						lv_reference_3_0,
              						"de.fraunhofer.ipa.rossystem.RosSystem.InterfaceReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosInterface"


    // $ANTLR start "entryRuleInterfaceReference"
    // InternalRosSystemParser.g:611:1: entryRuleInterfaceReference returns [EObject current=null] : iv_ruleInterfaceReference= ruleInterfaceReference EOF ;
    public final EObject entryRuleInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceReference = null;


        try {
            // InternalRosSystemParser.g:611:59: (iv_ruleInterfaceReference= ruleInterfaceReference EOF )
            // InternalRosSystemParser.g:612:2: iv_ruleInterfaceReference= ruleInterfaceReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInterfaceReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceReference=ruleInterfaceReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInterfaceReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceReference"


    // $ANTLR start "ruleInterfaceReference"
    // InternalRosSystemParser.g:618:1: ruleInterfaceReference returns [EObject current=null] : (this_RosPublisherReference_0= ruleRosPublisherReference | this_RosSubscriberReference_1= ruleRosSubscriberReference | this_RosServiceServerReference_2= ruleRosServiceServerReference | this_RosServerClientReference_3= ruleRosServerClientReference | this_RosActionServerReference_4= ruleRosActionServerReference | this_RosActionClientReference_5= ruleRosActionClientReference ) ;
    public final EObject ruleInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject this_RosPublisherReference_0 = null;

        EObject this_RosSubscriberReference_1 = null;

        EObject this_RosServiceServerReference_2 = null;

        EObject this_RosServerClientReference_3 = null;

        EObject this_RosActionServerReference_4 = null;

        EObject this_RosActionClientReference_5 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:624:2: ( (this_RosPublisherReference_0= ruleRosPublisherReference | this_RosSubscriberReference_1= ruleRosSubscriberReference | this_RosServiceServerReference_2= ruleRosServiceServerReference | this_RosServerClientReference_3= ruleRosServerClientReference | this_RosActionServerReference_4= ruleRosActionServerReference | this_RosActionClientReference_5= ruleRosActionClientReference ) )
            // InternalRosSystemParser.g:625:2: (this_RosPublisherReference_0= ruleRosPublisherReference | this_RosSubscriberReference_1= ruleRosSubscriberReference | this_RosServiceServerReference_2= ruleRosServiceServerReference | this_RosServerClientReference_3= ruleRosServerClientReference | this_RosActionServerReference_4= ruleRosActionServerReference | this_RosActionClientReference_5= ruleRosActionClientReference )
            {
            // InternalRosSystemParser.g:625:2: (this_RosPublisherReference_0= ruleRosPublisherReference | this_RosSubscriberReference_1= ruleRosSubscriberReference | this_RosServiceServerReference_2= ruleRosServiceServerReference | this_RosServerClientReference_3= ruleRosServerClientReference | this_RosActionServerReference_4= ruleRosActionServerReference | this_RosActionClientReference_5= ruleRosActionClientReference )
            int alt13=6;
            switch ( input.LA(1) ) {
            case Pub:
                {
                alt13=1;
                }
                break;
            case Sub:
                {
                alt13=2;
                }
                break;
            case Ss:
                {
                alt13=3;
                }
                break;
            case Sc:
                {
                alt13=4;
                }
                break;
            case As:
                {
                alt13=5;
                }
                break;
            case Ac:
                {
                alt13=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRosSystemParser.g:626:3: this_RosPublisherReference_0= ruleRosPublisherReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosPublisherReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosPublisherReference_0=ruleRosPublisherReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosPublisherReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:635:3: this_RosSubscriberReference_1= ruleRosSubscriberReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosSubscriberReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosSubscriberReference_1=ruleRosSubscriberReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosSubscriberReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:644:3: this_RosServiceServerReference_2= ruleRosServiceServerReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosServiceServerReferenceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosServiceServerReference_2=ruleRosServiceServerReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosServiceServerReference_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:653:3: this_RosServerClientReference_3= ruleRosServerClientReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosServerClientReferenceParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosServerClientReference_3=ruleRosServerClientReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosServerClientReference_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:662:3: this_RosActionServerReference_4= ruleRosActionServerReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosActionServerReferenceParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosActionServerReference_4=ruleRosActionServerReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosActionServerReference_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:671:3: this_RosActionClientReference_5= ruleRosActionClientReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosActionClientReferenceParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosActionClientReference_5=ruleRosActionClientReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosActionClientReference_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceReference"


    // $ANTLR start "entryRuleRosPublisherReference"
    // InternalRosSystemParser.g:683:1: entryRuleRosPublisherReference returns [EObject current=null] : iv_ruleRosPublisherReference= ruleRosPublisherReference EOF ;
    public final EObject entryRuleRosPublisherReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisherReference = null;


        try {
            // InternalRosSystemParser.g:683:62: (iv_ruleRosPublisherReference= ruleRosPublisherReference EOF )
            // InternalRosSystemParser.g:684:2: iv_ruleRosPublisherReference= ruleRosPublisherReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosPublisherReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosPublisherReference=ruleRosPublisherReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosPublisherReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosPublisherReference"


    // $ANTLR start "ruleRosPublisherReference"
    // InternalRosSystemParser.g:690:1: ruleRosPublisherReference returns [EObject current=null] : (otherlv_0= Pub () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosPublisherReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:696:2: ( (otherlv_0= Pub () ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:697:2: (otherlv_0= Pub () ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:697:2: (otherlv_0= Pub () ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:698:3: otherlv_0= Pub () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,Pub,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosPublisherReferenceAccess().getPubKeyword_0());
              		
            }
            // InternalRosSystemParser.g:702:3: ()
            // InternalRosSystemParser.g:703:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosPublisherReferenceAccess().getRosPublisherReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalRosSystemParser.g:709:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:710:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:710:4: ( ruleEString )
            // InternalRosSystemParser.g:711:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosPublisherReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosPublisherReference"


    // $ANTLR start "entryRuleRosSubscriberReference"
    // InternalRosSystemParser.g:729:1: entryRuleRosSubscriberReference returns [EObject current=null] : iv_ruleRosSubscriberReference= ruleRosSubscriberReference EOF ;
    public final EObject entryRuleRosSubscriberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriberReference = null;


        try {
            // InternalRosSystemParser.g:729:63: (iv_ruleRosSubscriberReference= ruleRosSubscriberReference EOF )
            // InternalRosSystemParser.g:730:2: iv_ruleRosSubscriberReference= ruleRosSubscriberReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosSubscriberReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosSubscriberReference=ruleRosSubscriberReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosSubscriberReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosSubscriberReference"


    // $ANTLR start "ruleRosSubscriberReference"
    // InternalRosSystemParser.g:736:1: ruleRosSubscriberReference returns [EObject current=null] : (otherlv_0= Sub () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosSubscriberReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:742:2: ( (otherlv_0= Sub () ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:743:2: (otherlv_0= Sub () ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:743:2: (otherlv_0= Sub () ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:744:3: otherlv_0= Sub () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,Sub,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosSubscriberReferenceAccess().getSubKeyword_0());
              		
            }
            // InternalRosSystemParser.g:748:3: ()
            // InternalRosSystemParser.g:749:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosSubscriberReferenceAccess().getRosSubscriberReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalRosSystemParser.g:755:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:756:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:756:4: ( ruleEString )
            // InternalRosSystemParser.g:757:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosSubscriberReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosSubscriberReference"


    // $ANTLR start "entryRuleRosServiceServerReference"
    // InternalRosSystemParser.g:775:1: entryRuleRosServiceServerReference returns [EObject current=null] : iv_ruleRosServiceServerReference= ruleRosServiceServerReference EOF ;
    public final EObject entryRuleRosServiceServerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServerReference = null;


        try {
            // InternalRosSystemParser.g:775:66: (iv_ruleRosServiceServerReference= ruleRosServiceServerReference EOF )
            // InternalRosSystemParser.g:776:2: iv_ruleRosServiceServerReference= ruleRosServiceServerReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosServiceServerReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceServerReference=ruleRosServiceServerReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosServiceServerReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosServiceServerReference"


    // $ANTLR start "ruleRosServiceServerReference"
    // InternalRosSystemParser.g:782:1: ruleRosServiceServerReference returns [EObject current=null] : (otherlv_0= Ss () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosServiceServerReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:788:2: ( (otherlv_0= Ss () ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:789:2: (otherlv_0= Ss () ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:789:2: (otherlv_0= Ss () ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:790:3: otherlv_0= Ss () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,Ss,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosServiceServerReferenceAccess().getSsKeyword_0());
              		
            }
            // InternalRosSystemParser.g:794:3: ()
            // InternalRosSystemParser.g:795:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosServiceServerReferenceAccess().getRosServiceServerReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalRosSystemParser.g:801:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:802:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:802:4: ( ruleEString )
            // InternalRosSystemParser.g:803:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosServiceServerReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosServiceServerReference"


    // $ANTLR start "entryRuleRosServerClientReference"
    // InternalRosSystemParser.g:821:1: entryRuleRosServerClientReference returns [EObject current=null] : iv_ruleRosServerClientReference= ruleRosServerClientReference EOF ;
    public final EObject entryRuleRosServerClientReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServerClientReference = null;


        try {
            // InternalRosSystemParser.g:821:65: (iv_ruleRosServerClientReference= ruleRosServerClientReference EOF )
            // InternalRosSystemParser.g:822:2: iv_ruleRosServerClientReference= ruleRosServerClientReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosServerClientReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosServerClientReference=ruleRosServerClientReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosServerClientReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosServerClientReference"


    // $ANTLR start "ruleRosServerClientReference"
    // InternalRosSystemParser.g:828:1: ruleRosServerClientReference returns [EObject current=null] : (otherlv_0= Sc () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosServerClientReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:834:2: ( (otherlv_0= Sc () ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:835:2: (otherlv_0= Sc () ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:835:2: (otherlv_0= Sc () ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:836:3: otherlv_0= Sc () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,Sc,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosServerClientReferenceAccess().getScKeyword_0());
              		
            }
            // InternalRosSystemParser.g:840:3: ()
            // InternalRosSystemParser.g:841:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosServerClientReferenceAccess().getRosServiceClientReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalRosSystemParser.g:847:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:848:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:848:4: ( ruleEString )
            // InternalRosSystemParser.g:849:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosServerClientReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosServerClientReference"


    // $ANTLR start "entryRuleRosActionServerReference"
    // InternalRosSystemParser.g:867:1: entryRuleRosActionServerReference returns [EObject current=null] : iv_ruleRosActionServerReference= ruleRosActionServerReference EOF ;
    public final EObject entryRuleRosActionServerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServerReference = null;


        try {
            // InternalRosSystemParser.g:867:65: (iv_ruleRosActionServerReference= ruleRosActionServerReference EOF )
            // InternalRosSystemParser.g:868:2: iv_ruleRosActionServerReference= ruleRosActionServerReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosActionServerReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosActionServerReference=ruleRosActionServerReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosActionServerReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosActionServerReference"


    // $ANTLR start "ruleRosActionServerReference"
    // InternalRosSystemParser.g:874:1: ruleRosActionServerReference returns [EObject current=null] : (otherlv_0= As () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosActionServerReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:880:2: ( (otherlv_0= As () ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:881:2: (otherlv_0= As () ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:881:2: (otherlv_0= As () ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:882:3: otherlv_0= As () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,As,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosActionServerReferenceAccess().getAsKeyword_0());
              		
            }
            // InternalRosSystemParser.g:886:3: ()
            // InternalRosSystemParser.g:887:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosActionServerReferenceAccess().getRosActionServerReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalRosSystemParser.g:893:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:894:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:894:4: ( ruleEString )
            // InternalRosSystemParser.g:895:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosActionServerReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosActionServerReference"


    // $ANTLR start "entryRuleRosActionClientReference"
    // InternalRosSystemParser.g:913:1: entryRuleRosActionClientReference returns [EObject current=null] : iv_ruleRosActionClientReference= ruleRosActionClientReference EOF ;
    public final EObject entryRuleRosActionClientReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClientReference = null;


        try {
            // InternalRosSystemParser.g:913:65: (iv_ruleRosActionClientReference= ruleRosActionClientReference EOF )
            // InternalRosSystemParser.g:914:2: iv_ruleRosActionClientReference= ruleRosActionClientReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosActionClientReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosActionClientReference=ruleRosActionClientReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosActionClientReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosActionClientReference"


    // $ANTLR start "ruleRosActionClientReference"
    // InternalRosSystemParser.g:920:1: ruleRosActionClientReference returns [EObject current=null] : (otherlv_0= Ac () ( ( ruleEString ) ) ) ;
    public final EObject ruleRosActionClientReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:926:2: ( (otherlv_0= Ac () ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:927:2: (otherlv_0= Ac () ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:927:2: (otherlv_0= Ac () ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:928:3: otherlv_0= Ac () ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,Ac,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosActionClientReferenceAccess().getAcKeyword_0());
              		
            }
            // InternalRosSystemParser.g:932:3: ()
            // InternalRosSystemParser.g:933:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRosActionClientReferenceAccess().getRosActionClientReferenceAction_1(),
              					current);
              			
            }

            }

            // InternalRosSystemParser.g:939:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:940:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:940:4: ( ruleEString )
            // InternalRosSystemParser.g:941:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosActionClientReferenceRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosActionClientReference"


    // $ANTLR start "entryRuleRosParameter"
    // InternalRosSystemParser.g:959:1: entryRuleRosParameter returns [EObject current=null] : iv_ruleRosParameter= ruleRosParameter EOF ;
    public final EObject entryRuleRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosParameter = null;


        try {
            // InternalRosSystemParser.g:959:53: (iv_ruleRosParameter= ruleRosParameter EOF )
            // InternalRosSystemParser.g:960:2: iv_ruleRosParameter= ruleRosParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosParameter=ruleRosParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosParameter"


    // $ANTLR start "ruleRosParameter"
    // InternalRosSystemParser.g:966:1: ruleRosParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( ( ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Value_1 ( (lv_value_5_0= ruleParameterValue ) ) this_END_6= RULE_END ) ;
    public final EObject ruleRosParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:972:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( ( ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Value_1 ( (lv_value_5_0= ruleParameterValue ) ) this_END_6= RULE_END ) )
            // InternalRosSystemParser.g:973:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( ( ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Value_1 ( (lv_value_5_0= ruleParameterValue ) ) this_END_6= RULE_END )
            {
            // InternalRosSystemParser.g:973:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( ( ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Value_1 ( (lv_value_5_0= ruleParameterValue ) ) this_END_6= RULE_END )
            // InternalRosSystemParser.g:974:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( ( ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Value_1 ( (lv_value_5_0= ruleParameterValue ) ) this_END_6= RULE_END
            {
            // InternalRosSystemParser.g:974:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystemParser.g:975:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:975:4: (lv_name_0_0= ruleEString )
            // InternalRosSystemParser.g:976:5: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosParameterRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRosParameterAccess().getColonKeyword_1());
              		
            }
            // InternalRosSystemParser.g:997:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:998:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:998:4: ( ruleEString )
            // InternalRosSystemParser.g:999:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosParameterRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosParameterAccess().getFromParameterCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_3, grammarAccess.getRosParameterAccess().getBEGINTerminalRuleCall_3());
              		
            }
            otherlv_4=(Token)match(input,Value_1,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRosParameterAccess().getValueKeyword_4());
              		
            }
            // InternalRosSystemParser.g:1021:3: ( (lv_value_5_0= ruleParameterValue ) )
            // InternalRosSystemParser.g:1022:4: (lv_value_5_0= ruleParameterValue )
            {
            // InternalRosSystemParser.g:1022:4: (lv_value_5_0= ruleParameterValue )
            // InternalRosSystemParser.g:1023:5: lv_value_5_0= ruleParameterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_value_5_0=ruleParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getRosParameterRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_5_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_6, grammarAccess.getRosParameterAccess().getENDTerminalRuleCall_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosParameter"


    // $ANTLR start "entryRuleConnection"
    // InternalRosSystemParser.g:1048:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // InternalRosSystemParser.g:1048:51: (iv_ruleConnection= ruleConnection EOF )
            // InternalRosSystemParser.g:1049:2: iv_ruleConnection= ruleConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConnection=ruleConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalRosSystemParser.g:1055:1: ruleConnection returns [EObject current=null] : ( ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection ) | this_RosConnection_1= ruleRosConnection ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        EObject this_RosSystemConnection_0 = null;

        EObject this_RosConnection_1 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1061:2: ( ( ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection ) | this_RosConnection_1= ruleRosConnection ) )
            // InternalRosSystemParser.g:1062:2: ( ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection ) | this_RosConnection_1= ruleRosConnection )
            {
            // InternalRosSystemParser.g:1062:2: ( ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection ) | this_RosConnection_1= ruleRosConnection )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalRosSystemParser.g:1063:3: ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection )
                    {
                    // InternalRosSystemParser.g:1063:3: ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection )
                    // InternalRosSystemParser.g:1064:4: ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getConnectionAccess().getRosSystemConnectionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_RosSystemConnection_0=ruleRosSystemConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RosSystemConnection_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:1075:3: this_RosConnection_1= ruleRosConnection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getConnectionAccess().getRosConnectionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosConnection_1=ruleRosConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosConnection_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleRosSystemConnection"
    // InternalRosSystemParser.g:1087:1: entryRuleRosSystemConnection returns [EObject current=null] : iv_ruleRosSystemConnection= ruleRosSystemConnection EOF ;
    public final EObject entryRuleRosSystemConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSystemConnection = null;


        try {
            // InternalRosSystemParser.g:1087:60: (iv_ruleRosSystemConnection= ruleRosSystemConnection EOF )
            // InternalRosSystemParser.g:1088:2: iv_ruleRosSystemConnection= ruleRosSystemConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosSystemConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosSystemConnection=ruleRosSystemConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosSystemConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosSystemConnection"


    // $ANTLR start "ruleRosSystemConnection"
    // InternalRosSystemParser.g:1094:1: ruleRosSystemConnection returns [EObject current=null] : (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleRosSystemConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:1100:2: ( (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket ) )
            // InternalRosSystemParser.g:1101:2: (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket )
            {
            // InternalRosSystemParser.g:1101:2: (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket )
            // InternalRosSystemParser.g:1102:3: otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,HyphenMinusLeftSquareBracket,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosSystemConnectionAccess().getHyphenMinusLeftSquareBracketKeyword_0());
              		
            }
            // InternalRosSystemParser.g:1106:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:1107:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:1107:4: ( ruleEString )
            // InternalRosSystemParser.g:1108:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosSystemConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosSystemConnectionAccess().getFromRosInterfaceCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRosSystemConnectionAccess().getCommaKeyword_2());
              		
            }
            // InternalRosSystemParser.g:1126:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:1127:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:1127:4: ( ruleEString )
            // InternalRosSystemParser.g:1128:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosSystemConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosSystemConnectionAccess().getToRosInterfaceCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRosSystemConnectionAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosSystemConnection"


    // $ANTLR start "entryRuleRosConnection"
    // InternalRosSystemParser.g:1150:1: entryRuleRosConnection returns [EObject current=null] : iv_ruleRosConnection= ruleRosConnection EOF ;
    public final EObject entryRuleRosConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosConnection = null;


        try {
            // InternalRosSystemParser.g:1150:54: (iv_ruleRosConnection= ruleRosConnection EOF )
            // InternalRosSystemParser.g:1151:2: iv_ruleRosConnection= ruleRosConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosConnection=ruleRosConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosConnection"


    // $ANTLR start "ruleRosConnection"
    // InternalRosSystemParser.g:1157:1: ruleRosConnection returns [EObject current=null] : ( ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection ) | ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection ) | this_RosActionConnection_2= ruleRosActionConnection ) ;
    public final EObject ruleRosConnection() throws RecognitionException {
        EObject current = null;

        EObject this_RosTopicConnection_0 = null;

        EObject this_RosServiceConnection_1 = null;

        EObject this_RosActionConnection_2 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1163:2: ( ( ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection ) | ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection ) | this_RosActionConnection_2= ruleRosActionConnection ) )
            // InternalRosSystemParser.g:1164:2: ( ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection ) | ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection ) | this_RosActionConnection_2= ruleRosActionConnection )
            {
            // InternalRosSystemParser.g:1164:2: ( ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection ) | ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection ) | this_RosActionConnection_2= ruleRosActionConnection )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalRosSystemParser.g:1165:3: ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection )
                    {
                    // InternalRosSystemParser.g:1165:3: ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection )
                    // InternalRosSystemParser.g:1166:4: ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRosConnectionAccess().getRosTopicConnectionParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_RosTopicConnection_0=ruleRosTopicConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RosTopicConnection_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:1177:3: ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection )
                    {
                    // InternalRosSystemParser.g:1177:3: ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection )
                    // InternalRosSystemParser.g:1178:4: ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getRosConnectionAccess().getRosServiceConnectionParserRuleCall_1());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_RosServiceConnection_1=ruleRosServiceConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_RosServiceConnection_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:1189:3: this_RosActionConnection_2= ruleRosActionConnection
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getRosConnectionAccess().getRosActionConnectionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RosActionConnection_2=ruleRosActionConnection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RosActionConnection_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosConnection"


    // $ANTLR start "entryRuleRosTopicConnection"
    // InternalRosSystemParser.g:1201:1: entryRuleRosTopicConnection returns [EObject current=null] : iv_ruleRosTopicConnection= ruleRosTopicConnection EOF ;
    public final EObject entryRuleRosTopicConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosTopicConnection = null;


        try {
            // InternalRosSystemParser.g:1201:59: (iv_ruleRosTopicConnection= ruleRosTopicConnection EOF )
            // InternalRosSystemParser.g:1202:2: iv_ruleRosTopicConnection= ruleRosTopicConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosTopicConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosTopicConnection=ruleRosTopicConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosTopicConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosTopicConnection"


    // $ANTLR start "ruleRosTopicConnection"
    // InternalRosSystemParser.g:1208:1: ruleRosTopicConnection returns [EObject current=null] : (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleRosTopicConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:1214:2: ( (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket ) )
            // InternalRosSystemParser.g:1215:2: (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket )
            {
            // InternalRosSystemParser.g:1215:2: (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket )
            // InternalRosSystemParser.g:1216:3: otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,HyphenMinusLeftSquareBracket,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosTopicConnectionAccess().getHyphenMinusLeftSquareBracketKeyword_0());
              		
            }
            // InternalRosSystemParser.g:1220:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:1221:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:1221:4: ( ruleEString )
            // InternalRosSystemParser.g:1222:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosTopicConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosTopicConnectionAccess().getFromPublisherCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRosTopicConnectionAccess().getCommaKeyword_2());
              		
            }
            // InternalRosSystemParser.g:1240:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:1241:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:1241:4: ( ruleEString )
            // InternalRosSystemParser.g:1242:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosTopicConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosTopicConnectionAccess().getToSubscriberCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRosTopicConnectionAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosTopicConnection"


    // $ANTLR start "entryRuleRosServiceConnection"
    // InternalRosSystemParser.g:1264:1: entryRuleRosServiceConnection returns [EObject current=null] : iv_ruleRosServiceConnection= ruleRosServiceConnection EOF ;
    public final EObject entryRuleRosServiceConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceConnection = null;


        try {
            // InternalRosSystemParser.g:1264:61: (iv_ruleRosServiceConnection= ruleRosServiceConnection EOF )
            // InternalRosSystemParser.g:1265:2: iv_ruleRosServiceConnection= ruleRosServiceConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosServiceConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceConnection=ruleRosServiceConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosServiceConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosServiceConnection"


    // $ANTLR start "ruleRosServiceConnection"
    // InternalRosSystemParser.g:1271:1: ruleRosServiceConnection returns [EObject current=null] : (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleRosServiceConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:1277:2: ( (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket ) )
            // InternalRosSystemParser.g:1278:2: (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket )
            {
            // InternalRosSystemParser.g:1278:2: (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket )
            // InternalRosSystemParser.g:1279:3: otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,HyphenMinusLeftSquareBracket,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosServiceConnectionAccess().getHyphenMinusLeftSquareBracketKeyword_0());
              		
            }
            // InternalRosSystemParser.g:1283:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:1284:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:1284:4: ( ruleEString )
            // InternalRosSystemParser.g:1285:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosServiceConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosServiceConnectionAccess().getFromServiceServerCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRosServiceConnectionAccess().getCommaKeyword_2());
              		
            }
            // InternalRosSystemParser.g:1303:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:1304:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:1304:4: ( ruleEString )
            // InternalRosSystemParser.g:1305:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosServiceConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosServiceConnectionAccess().getToServiceClientCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRosServiceConnectionAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosServiceConnection"


    // $ANTLR start "entryRuleRosActionConnection"
    // InternalRosSystemParser.g:1327:1: entryRuleRosActionConnection returns [EObject current=null] : iv_ruleRosActionConnection= ruleRosActionConnection EOF ;
    public final EObject entryRuleRosActionConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionConnection = null;


        try {
            // InternalRosSystemParser.g:1327:60: (iv_ruleRosActionConnection= ruleRosActionConnection EOF )
            // InternalRosSystemParser.g:1328:2: iv_ruleRosActionConnection= ruleRosActionConnection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRosActionConnectionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRosActionConnection=ruleRosActionConnection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRosActionConnection; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRosActionConnection"


    // $ANTLR start "ruleRosActionConnection"
    // InternalRosSystemParser.g:1334:1: ruleRosActionConnection returns [EObject current=null] : (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleRosActionConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:1340:2: ( (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket ) )
            // InternalRosSystemParser.g:1341:2: (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket )
            {
            // InternalRosSystemParser.g:1341:2: (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket )
            // InternalRosSystemParser.g:1342:3: otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,HyphenMinusLeftSquareBracket,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRosActionConnectionAccess().getHyphenMinusLeftSquareBracketKeyword_0());
              		
            }
            // InternalRosSystemParser.g:1346:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:1347:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:1347:4: ( ruleEString )
            // InternalRosSystemParser.g:1348:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosActionConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosActionConnectionAccess().getFromActionServerCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getRosActionConnectionAccess().getCommaKeyword_2());
              		
            }
            // InternalRosSystemParser.g:1366:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:1367:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:1367:4: ( ruleEString )
            // InternalRosSystemParser.g:1368:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getRosActionConnectionRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRosActionConnectionAccess().getToActionClientCrossReference_3_0());
              				
            }
            pushFollow(FOLLOW_23);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getRosActionConnectionAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRosActionConnection"


    // $ANTLR start "entryRuleNamespace"
    // InternalRosSystemParser.g:1390:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRosSystemParser.g:1390:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRosSystemParser.g:1391:2: iv_ruleNamespace= ruleNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamespace; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalRosSystemParser.g:1397:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1403:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRosSystemParser.g:1404:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRosSystemParser.g:1404:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt16=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt16=1;
                }
                break;
            case RelativeNamespace:
                {
                alt16=2;
                }
                break;
            case PrivateNamespace:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalRosSystemParser.g:1405:3: this_GlobalNamespace_0= ruleGlobalNamespace
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_GlobalNamespace_0=ruleGlobalNamespace();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_GlobalNamespace_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:1414:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_RelativeNamespace_Impl_1=ruleRelativeNamespace_Impl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_RelativeNamespace_Impl_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:1423:3: this_PrivateNamespace_2= rulePrivateNamespace
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PrivateNamespace_2=rulePrivateNamespace();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PrivateNamespace_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGraphName"
    // InternalRosSystemParser.g:1435:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRosSystemParser.g:1435:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRosSystemParser.g:1436:2: iv_ruleGraphName= ruleGraphName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGraphNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGraphName=ruleGraphName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGraphName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalRosSystemParser.g:1442:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= GraphName ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:1448:2: (kw= GraphName )
            // InternalRosSystemParser.g:1449:2: kw= GraphName
            {
            kw=(Token)match(input,GraphName,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getGraphNameAccess().getGraphNameKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphName"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalRosSystemParser.g:1457:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRosSystemParser.g:1457:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRosSystemParser.g:1458:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGlobalNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleGlobalNamespace=ruleGlobalNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGlobalNamespace; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalRosSystemParser.g:1464:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject ruleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_parts_3_0 = null;

        AntlrDatatypeRuleToken lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1470:2: ( ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRosSystemParser.g:1471:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRosSystemParser.g:1471:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRosSystemParser.g:1472:3: () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRosSystemParser.g:1472:3: ()
            // InternalRosSystemParser.g:1473:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,GlobalNamespace,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
              		
            }
            // InternalRosSystemParser.g:1483:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LeftSquareBracket) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRosSystemParser.g:1484:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    // InternalRosSystemParser.g:1488:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRosSystemParser.g:1489:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRosSystemParser.g:1489:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRosSystemParser.g:1490:6: lv_parts_3_0= ruleGraphName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                      						}
                      						add(
                      							current,
                      							"parts",
                      							lv_parts_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.GraphName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRosSystemParser.g:1507:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==Comma) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:1508:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalRosSystemParser.g:1512:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRosSystemParser.g:1513:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystemParser.g:1513:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRosSystemParser.g:1514:7: lv_parts_5_0= ruleGraphName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parts",
                    	      								lv_parts_5_0,
                    	      								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalRosSystemParser.g:1541:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRosSystemParser.g:1541:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRosSystemParser.g:1542:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelativeNamespace_ImplRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelativeNamespace_Impl=ruleRelativeNamespace_Impl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelativeNamespace_Impl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalRosSystemParser.g:1548:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject ruleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_parts_3_0 = null;

        AntlrDatatypeRuleToken lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1554:2: ( ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRosSystemParser.g:1555:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRosSystemParser.g:1555:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRosSystemParser.g:1556:3: () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRosSystemParser.g:1556:3: ()
            // InternalRosSystemParser.g:1557:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,RelativeNamespace,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
              		
            }
            // InternalRosSystemParser.g:1567:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==LeftSquareBracket) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRosSystemParser.g:1568:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    // InternalRosSystemParser.g:1572:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRosSystemParser.g:1573:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRosSystemParser.g:1573:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRosSystemParser.g:1574:6: lv_parts_3_0= ruleGraphName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                      						}
                      						add(
                      							current,
                      							"parts",
                      							lv_parts_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.GraphName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRosSystemParser.g:1591:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==Comma) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:1592:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalRosSystemParser.g:1596:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRosSystemParser.g:1597:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystemParser.g:1597:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRosSystemParser.g:1598:7: lv_parts_5_0= ruleGraphName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parts",
                    	      								lv_parts_5_0,
                    	      								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalRosSystemParser.g:1625:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRosSystemParser.g:1625:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRosSystemParser.g:1626:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrivateNamespaceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrivateNamespace=rulePrivateNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrivateNamespace; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalRosSystemParser.g:1632:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject rulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_parts_3_0 = null;

        AntlrDatatypeRuleToken lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1638:2: ( ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRosSystemParser.g:1639:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRosSystemParser.g:1639:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRosSystemParser.g:1640:3: () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRosSystemParser.g:1640:3: ()
            // InternalRosSystemParser.g:1641:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,PrivateNamespace,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
              		
            }
            // InternalRosSystemParser.g:1651:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LeftSquareBracket) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRosSystemParser.g:1652:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                      			
                    }
                    // InternalRosSystemParser.g:1656:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRosSystemParser.g:1657:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRosSystemParser.g:1657:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRosSystemParser.g:1658:6: lv_parts_3_0= ruleGraphName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                      						}
                      						add(
                      							current,
                      							"parts",
                      							lv_parts_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.GraphName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRosSystemParser.g:1675:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==Comma) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:1676:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0());
                    	      				
                    	    }
                    	    // InternalRosSystemParser.g:1680:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRosSystemParser.g:1681:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystemParser.g:1681:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRosSystemParser.g:1682:7: lv_parts_5_0= ruleGraphName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_11);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"parts",
                    	      								lv_parts_5_0,
                    	      								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getRightSquareBracketKeyword_2_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleParameterType"
    // InternalRosSystemParser.g:1709:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRosSystemParser.g:1709:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRosSystemParser.g:1710:2: iv_ruleParameterType= ruleParameterType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalRosSystemParser.g:1716:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterListType_0 = null;

        EObject this_ParameterStructType_1 = null;

        EObject this_ParameterIntegerType_2 = null;

        EObject this_ParameterStringType_3 = null;

        EObject this_ParameterDoubleType_4 = null;

        EObject this_ParameterBooleanType_5 = null;

        EObject this_ParameterBase64Type_6 = null;

        EObject this_ParameterArrayType_7 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1722:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalRosSystemParser.g:1723:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalRosSystemParser.g:1723:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt23=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt23=1;
                }
                break;
            case Struct:
                {
                alt23=2;
                }
                break;
            case Integer:
                {
                alt23=3;
                }
                break;
            case String:
                {
                alt23=4;
                }
                break;
            case Double:
                {
                alt23=5;
                }
                break;
            case Boolean:
                {
                alt23=6;
                }
                break;
            case Base64:
                {
                alt23=7;
                }
                break;
            case RULE_BEGIN:
                {
                alt23=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalRosSystemParser.g:1724:3: this_ParameterListType_0= ruleParameterListType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterListType_0=ruleParameterListType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterListType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:1733:3: this_ParameterStructType_1= ruleParameterStructType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterStructType_1=ruleParameterStructType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterStructType_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:1742:3: this_ParameterIntegerType_2= ruleParameterIntegerType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterIntegerType_2=ruleParameterIntegerType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterIntegerType_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:1751:3: this_ParameterStringType_3= ruleParameterStringType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterStringType_3=ruleParameterStringType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterStringType_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:1760:3: this_ParameterDoubleType_4= ruleParameterDoubleType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterDoubleType_4=ruleParameterDoubleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterDoubleType_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:1769:3: this_ParameterBooleanType_5= ruleParameterBooleanType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterBooleanType_5=ruleParameterBooleanType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterBooleanType_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:1778:3: this_ParameterBase64Type_6= ruleParameterBase64Type
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64Type_6=ruleParameterBase64Type();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterBase64Type_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:1787:3: this_ParameterArrayType_7= ruleParameterArrayType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterArrayType_7=ruleParameterArrayType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterArrayType_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameterValue"
    // InternalRosSystemParser.g:1799:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRosSystemParser.g:1799:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRosSystemParser.g:1800:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalRosSystemParser.g:1806:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterString_0 = null;

        EObject this_ParameterBase64_1 = null;

        EObject this_ParameterInteger_2 = null;

        EObject this_ParameterDouble_3 = null;

        EObject this_ParameterBoolean_4 = null;

        EObject this_ParameterList_5 = null;

        EObject this_ParameterStruct_6 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1812:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalRosSystemParser.g:1813:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalRosSystemParser.g:1813:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt24=7;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalRosSystemParser.g:1814:3: this_ParameterString_0= ruleParameterString
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterString_0=ruleParameterString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterString_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:1823:3: this_ParameterBase64_1= ruleParameterBase64
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64_1=ruleParameterBase64();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterBase64_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:1832:3: this_ParameterInteger_2= ruleParameterInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterInteger_2=ruleParameterInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterInteger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:1841:3: this_ParameterDouble_3= ruleParameterDouble
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterDouble_3=ruleParameterDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterDouble_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:1850:3: this_ParameterBoolean_4= ruleParameterBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterBoolean_4=ruleParameterBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterBoolean_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:1859:3: this_ParameterList_5= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterList_5=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterList_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:1868:3: this_ParameterStruct_6= ruleParameterStruct
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterStruct_6=ruleParameterStruct();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterStruct_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleParameterListType"
    // InternalRosSystemParser.g:1880:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRosSystemParser.g:1880:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRosSystemParser.g:1881:2: iv_ruleParameterListType= ruleParameterListType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterListType=ruleParameterListType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterListType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterListType"


    // $ANTLR start "ruleParameterListType"
    // InternalRosSystemParser.g:1887:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) ;
    public final EObject ruleParameterListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sequence_3_0 = null;

        EObject lv_sequence_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1893:2: ( ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRosSystemParser.g:1894:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRosSystemParser.g:1894:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            // InternalRosSystemParser.g:1895:3: () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRosSystemParser.g:1895:3: ()
            // InternalRosSystemParser.g:1896:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,List,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalRosSystemParser.g:1910:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalRosSystemParser.g:1911:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalRosSystemParser.g:1911:4: (lv_sequence_3_0= ruleParameterType )
            // InternalRosSystemParser.g:1912:5: lv_sequence_3_0= ruleParameterType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_sequence_3_0=ruleParameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
              					}
              					add(
              						current,
              						"sequence",
              						lv_sequence_3_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRosSystemParser.g:1929:3: (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==Comma) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRosSystemParser.g:1930:4: otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_26); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalRosSystemParser.g:1934:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalRosSystemParser.g:1935:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalRosSystemParser.g:1935:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalRosSystemParser.g:1936:6: lv_sequence_5_0= ruleParameterType
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_sequence_5_0=ruleParameterType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"sequence",
            	      							lv_sequence_5_0,
            	      							"de.fraunhofer.ipa.ros.Basics.ParameterType");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterListType"


    // $ANTLR start "entryRuleParameterStructType"
    // InternalRosSystemParser.g:1962:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRosSystemParser.g:1962:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRosSystemParser.g:1963:2: iv_ruleParameterStructType= ruleParameterStructType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStructTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructType=ruleParameterStructType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterStructType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStructType"


    // $ANTLR start "ruleParameterStructType"
    // InternalRosSystemParser.g:1969:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) ;
    public final EObject ruleParameterStructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterstructypetmember_3_0 = null;

        EObject lv_parameterstructypetmember_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1975:2: ( ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRosSystemParser.g:1976:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRosSystemParser.g:1976:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            // InternalRosSystemParser.g:1977:3: () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRosSystemParser.g:1977:3: ()
            // InternalRosSystemParser.g:1978:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Struct,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2());
              		
            }
            // InternalRosSystemParser.g:1992:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalRosSystemParser.g:1993:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalRosSystemParser.g:1993:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalRosSystemParser.g:1994:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_parameterstructypetmember_3_0=ruleParameterStructTypeMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
              					}
              					add(
              						current,
              						"parameterstructypetmember",
              						lv_parameterstructypetmember_3_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterStructTypeMember");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRosSystemParser.g:2011:3: (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRosSystemParser.g:2012:4: otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalRosSystemParser.g:2016:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalRosSystemParser.g:2017:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalRosSystemParser.g:2017:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalRosSystemParser.g:2018:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_parameterstructypetmember_5_0=ruleParameterStructTypeMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
            	      						}
            	      						add(
            	      							current,
            	      							"parameterstructypetmember",
            	      							lv_parameterstructypetmember_5_0,
            	      							"de.fraunhofer.ipa.ros.Basics.ParameterStructTypeMember");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getRightSquareBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructType"


    // $ANTLR start "entryRuleParameterIntegerType"
    // InternalRosSystemParser.g:2044:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRosSystemParser.g:2044:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRosSystemParser.g:2045:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterIntegerTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterIntegerType=ruleParameterIntegerType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterIntegerType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterIntegerType"


    // $ANTLR start "ruleParameterIntegerType"
    // InternalRosSystemParser.g:2051:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2057:2: ( ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) )
            // InternalRosSystemParser.g:2058:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            {
            // InternalRosSystemParser.g:2058:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            // InternalRosSystemParser.g:2059:3: () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            {
            // InternalRosSystemParser.g:2059:3: ()
            // InternalRosSystemParser.g:2060:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Integer,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
              		
            }
            // InternalRosSystemParser.g:2070:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Default) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_DECINT) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalRosSystemParser.g:2071:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());
                      			
                    }
                    // InternalRosSystemParser.g:2075:4: ( (lv_default_3_0= ruleParameterInteger ) )
                    // InternalRosSystemParser.g:2076:5: (lv_default_3_0= ruleParameterInteger )
                    {
                    // InternalRosSystemParser.g:2076:5: (lv_default_3_0= ruleParameterInteger )
                    // InternalRosSystemParser.g:2077:6: lv_default_3_0= ruleParameterInteger
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterIntegerTypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterInteger");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterIntegerType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalRosSystemParser.g:2099:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRosSystemParser.g:2099:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRosSystemParser.g:2100:2: iv_ruleParameterStringType= ruleParameterStringType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStringTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterStringType=ruleParameterStringType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterStringType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalRosSystemParser.g:2106:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2112:2: ( ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) )
            // InternalRosSystemParser.g:2113:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            {
            // InternalRosSystemParser.g:2113:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            // InternalRosSystemParser.g:2114:3: () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            {
            // InternalRosSystemParser.g:2114:3: ()
            // InternalRosSystemParser.g:2115:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,String,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
              		
            }
            // InternalRosSystemParser.g:2125:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Default) ) {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1>=RULE_ID && LA28_1<=RULE_STRING)) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalRosSystemParser.g:2126:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());
                      			
                    }
                    // InternalRosSystemParser.g:2130:4: ( (lv_default_3_0= ruleParameterString ) )
                    // InternalRosSystemParser.g:2131:5: (lv_default_3_0= ruleParameterString )
                    {
                    // InternalRosSystemParser.g:2131:5: (lv_default_3_0= ruleParameterString )
                    // InternalRosSystemParser.g:2132:6: lv_default_3_0= ruleParameterString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterStringTypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterDoubleType"
    // InternalRosSystemParser.g:2154:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRosSystemParser.g:2154:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRosSystemParser.g:2155:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDoubleTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDoubleType=ruleParameterDoubleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDoubleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDoubleType"


    // $ANTLR start "ruleParameterDoubleType"
    // InternalRosSystemParser.g:2161:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2167:2: ( ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) )
            // InternalRosSystemParser.g:2168:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            {
            // InternalRosSystemParser.g:2168:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            // InternalRosSystemParser.g:2169:3: () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            {
            // InternalRosSystemParser.g:2169:3: ()
            // InternalRosSystemParser.g:2170:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Double,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
              		
            }
            // InternalRosSystemParser.g:2180:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Default) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==RULE_DOUBLE) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystemParser.g:2181:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());
                      			
                    }
                    // InternalRosSystemParser.g:2185:4: ( (lv_default_3_0= ruleParameterDouble ) )
                    // InternalRosSystemParser.g:2186:5: (lv_default_3_0= ruleParameterDouble )
                    {
                    // InternalRosSystemParser.g:2186:5: (lv_default_3_0= ruleParameterDouble )
                    // InternalRosSystemParser.g:2187:6: lv_default_3_0= ruleParameterDouble
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterDouble();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterDoubleTypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterDouble");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDoubleType"


    // $ANTLR start "entryRuleParameterBooleanType"
    // InternalRosSystemParser.g:2209:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRosSystemParser.g:2209:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRosSystemParser.g:2210:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterBooleanTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterBooleanType=ruleParameterBooleanType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterBooleanType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBooleanType"


    // $ANTLR start "ruleParameterBooleanType"
    // InternalRosSystemParser.g:2216:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2222:2: ( ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) )
            // InternalRosSystemParser.g:2223:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            {
            // InternalRosSystemParser.g:2223:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            // InternalRosSystemParser.g:2224:3: () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            {
            // InternalRosSystemParser.g:2224:3: ()
            // InternalRosSystemParser.g:2225:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Boolean,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
              		
            }
            // InternalRosSystemParser.g:2235:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Default) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==RULE_BOOLEAN) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // InternalRosSystemParser.g:2236:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());
                      			
                    }
                    // InternalRosSystemParser.g:2240:4: ( (lv_default_3_0= ruleParameterBoolean ) )
                    // InternalRosSystemParser.g:2241:5: (lv_default_3_0= ruleParameterBoolean )
                    {
                    // InternalRosSystemParser.g:2241:5: (lv_default_3_0= ruleParameterBoolean )
                    // InternalRosSystemParser.g:2242:6: lv_default_3_0= ruleParameterBoolean
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterBooleanTypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterBoolean");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBooleanType"


    // $ANTLR start "entryRuleParameterBase64Type"
    // InternalRosSystemParser.g:2264:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRosSystemParser.g:2264:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRosSystemParser.g:2265:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterBase64TypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64Type=ruleParameterBase64Type();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterBase64Type; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBase64Type"


    // $ANTLR start "ruleParameterBase64Type"
    // InternalRosSystemParser.g:2271:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2277:2: ( ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) )
            // InternalRosSystemParser.g:2278:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            {
            // InternalRosSystemParser.g:2278:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            // InternalRosSystemParser.g:2279:3: () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            {
            // InternalRosSystemParser.g:2279:3: ()
            // InternalRosSystemParser.g:2280:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Base64,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
              		
            }
            // InternalRosSystemParser.g:2290:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Default) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_BINARY) ) {
                    alt31=1;
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystemParser.g:2291:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());
                      			
                    }
                    // InternalRosSystemParser.g:2295:4: ( (lv_default_3_0= ruleParameterBase64 ) )
                    // InternalRosSystemParser.g:2296:5: (lv_default_3_0= ruleParameterBase64 )
                    {
                    // InternalRosSystemParser.g:2296:5: (lv_default_3_0= ruleParameterBase64 )
                    // InternalRosSystemParser.g:2297:6: lv_default_3_0= ruleParameterBase64
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterBase64();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterBase64TypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterBase64");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBase64Type"


    // $ANTLR start "entryRuleParameterArrayType"
    // InternalRosSystemParser.g:2319:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRosSystemParser.g:2319:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRosSystemParser.g:2320:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterArrayTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterArrayType=ruleParameterArrayType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterArrayType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterArrayType"


    // $ANTLR start "ruleParameterArrayType"
    // InternalRosSystemParser.g:2326:1: ruleParameterArrayType returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END ) ;
    public final EObject ruleParameterArrayType() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_END_5=null;
        EObject lv_type_2_0 = null;

        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2332:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END ) )
            // InternalRosSystemParser.g:2333:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END )
            {
            // InternalRosSystemParser.g:2333:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END )
            // InternalRosSystemParser.g:2334:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_0, grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_0());
              		
            }
            otherlv_1=(Token)match(input,Array,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_1());
              		
            }
            // InternalRosSystemParser.g:2342:3: ( (lv_type_2_0= ruleParameterType ) )
            // InternalRosSystemParser.g:2343:4: (lv_type_2_0= ruleParameterType )
            {
            // InternalRosSystemParser.g:2343:4: (lv_type_2_0= ruleParameterType )
            // InternalRosSystemParser.g:2344:5: lv_type_2_0= ruleParameterType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_32);
            lv_type_2_0=ruleParameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRosSystemParser.g:2361:3: (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Default) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRosSystemParser.g:2362:4: otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) )
                    {
                    otherlv_3=(Token)match(input,Default,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_3_0());
                      			
                    }
                    // InternalRosSystemParser.g:2366:4: ( (lv_default_4_0= ruleParameterList ) )
                    // InternalRosSystemParser.g:2367:5: (lv_default_4_0= ruleParameterList )
                    {
                    // InternalRosSystemParser.g:2367:5: (lv_default_4_0= ruleParameterList )
                    // InternalRosSystemParser.g:2368:6: lv_default_4_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_default_4_0=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_4_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterList");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_5, grammarAccess.getParameterArrayTypeAccess().getENDTerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterArrayType"


    // $ANTLR start "entryRuleParameterList"
    // InternalRosSystemParser.g:2394:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalRosSystemParser.g:2394:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalRosSystemParser.g:2395:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalRosSystemParser.g:2401:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2407:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalRosSystemParser.g:2408:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalRosSystemParser.g:2408:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            // InternalRosSystemParser.g:2409:3: () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalRosSystemParser.g:2409:3: ()
            // InternalRosSystemParser.g:2410:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1());
              		
            }
            // InternalRosSystemParser.g:2420:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRosSystemParser.g:2421:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRosSystemParser.g:2421:4: (lv_value_2_0= ruleParameterValue )
            // InternalRosSystemParser.g:2422:5: lv_value_2_0= ruleParameterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterListRule());
              					}
              					add(
              						current,
              						"value",
              						lv_value_2_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRosSystemParser.g:2439:3: (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==Comma) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRosSystemParser.g:2440:4: otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalRosSystemParser.g:2444:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalRosSystemParser.g:2445:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalRosSystemParser.g:2445:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalRosSystemParser.g:2446:6: lv_value_4_0= ruleParameterValue
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_value_4_0=ruleParameterValue();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	      						}
            	      						add(
            	      							current,
            	      							"value",
            	      							lv_value_4_0,
            	      							"de.fraunhofer.ipa.ros.Basics.ParameterValue");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getParameterListAccess().getRightSquareBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterAny"
    // InternalRosSystemParser.g:2472:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRosSystemParser.g:2472:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRosSystemParser.g:2473:2: iv_ruleParameterAny= ruleParameterAny EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterAnyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterAny=ruleParameterAny();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterAny; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterAny"


    // $ANTLR start "ruleParameterAny"
    // InternalRosSystemParser.g:2479:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2485:2: ( ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) )
            // InternalRosSystemParser.g:2486:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            {
            // InternalRosSystemParser.g:2486:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            // InternalRosSystemParser.g:2487:3: () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            {
            // InternalRosSystemParser.g:2487:3: ()
            // InternalRosSystemParser.g:2488:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,ParameterAny,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
              		
            }
            // InternalRosSystemParser.g:2498:3: (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Value) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRosSystemParser.g:2499:4: otherlv_2= Value ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Value,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getValueKeyword_2_0());
                      			
                    }
                    // InternalRosSystemParser.g:2503:4: ( (lv_value_3_0= ruleEString ) )
                    // InternalRosSystemParser.g:2504:5: (lv_value_3_0= ruleEString )
                    {
                    // InternalRosSystemParser.g:2504:5: (lv_value_3_0= ruleEString )
                    // InternalRosSystemParser.g:2505:6: lv_value_3_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterAnyRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"de.fraunhofer.ipa.ros.Basics.EString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterAny"


    // $ANTLR start "entryRuleParameterString"
    // InternalRosSystemParser.g:2527:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRosSystemParser.g:2527:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRosSystemParser.g:2528:2: iv_ruleParameterString= ruleParameterString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterString=ruleParameterString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterString; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalRosSystemParser.g:2534:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2540:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRosSystemParser.g:2541:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRosSystemParser.g:2541:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRosSystemParser.g:2542:3: (lv_value_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:2542:3: (lv_value_0_0= ruleEString )
            // InternalRosSystemParser.g:2543:4: lv_value_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterStringRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.EString");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterBase64"
    // InternalRosSystemParser.g:2563:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRosSystemParser.g:2563:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRosSystemParser.g:2564:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterBase64Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64=ruleParameterBase64();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterBase64; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBase64"


    // $ANTLR start "ruleParameterBase64"
    // InternalRosSystemParser.g:2570:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2576:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalRosSystemParser.g:2577:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalRosSystemParser.g:2577:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalRosSystemParser.g:2578:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalRosSystemParser.g:2578:3: (lv_value_0_0= ruleBase64Binary )
            // InternalRosSystemParser.g:2579:4: lv_value_0_0= ruleBase64Binary
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBase64Binary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterBase64Rule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.Base64Binary");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBase64"


    // $ANTLR start "entryRuleParameterInteger"
    // InternalRosSystemParser.g:2599:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRosSystemParser.g:2599:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRosSystemParser.g:2600:2: iv_ruleParameterInteger= ruleParameterInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterIntegerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterInteger=ruleParameterInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterInteger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterInteger"


    // $ANTLR start "ruleParameterInteger"
    // InternalRosSystemParser.g:2606:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2612:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalRosSystemParser.g:2613:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalRosSystemParser.g:2613:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalRosSystemParser.g:2614:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalRosSystemParser.g:2614:3: (lv_value_0_0= ruleInteger0 )
            // InternalRosSystemParser.g:2615:4: lv_value_0_0= ruleInteger0
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleInteger0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterIntegerRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.Integer0");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterInteger"


    // $ANTLR start "entryRuleParameterDouble"
    // InternalRosSystemParser.g:2635:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRosSystemParser.g:2635:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRosSystemParser.g:2636:2: iv_ruleParameterDouble= ruleParameterDouble EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDoubleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDouble=ruleParameterDouble();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDouble; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDouble"


    // $ANTLR start "ruleParameterDouble"
    // InternalRosSystemParser.g:2642:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2648:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalRosSystemParser.g:2649:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalRosSystemParser.g:2649:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalRosSystemParser.g:2650:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalRosSystemParser.g:2650:3: (lv_value_0_0= ruleDouble0 )
            // InternalRosSystemParser.g:2651:4: lv_value_0_0= ruleDouble0
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDouble0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterDoubleRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.Double0");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDouble"


    // $ANTLR start "entryRuleParameterBoolean"
    // InternalRosSystemParser.g:2671:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRosSystemParser.g:2671:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRosSystemParser.g:2672:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterBooleanRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterBoolean=ruleParameterBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterBoolean; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterBoolean"


    // $ANTLR start "ruleParameterBoolean"
    // InternalRosSystemParser.g:2678:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2684:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalRosSystemParser.g:2685:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalRosSystemParser.g:2685:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalRosSystemParser.g:2686:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalRosSystemParser.g:2686:3: (lv_value_0_0= ruleboolean0 )
            // InternalRosSystemParser.g:2687:4: lv_value_0_0= ruleboolean0
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleboolean0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterBooleanRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.boolean0");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBoolean"


    // $ANTLR start "entryRuleParameterStruct"
    // InternalRosSystemParser.g:2707:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRosSystemParser.g:2707:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRosSystemParser.g:2708:2: iv_ruleParameterStruct= ruleParameterStruct EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStructRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterStruct=ruleParameterStruct();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterStruct; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStruct"


    // $ANTLR start "ruleParameterStruct"
    // InternalRosSystemParser.g:2714:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? ) ;
    public final EObject ruleParameterStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2720:2: ( ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? ) )
            // InternalRosSystemParser.g:2721:2: ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? )
            {
            // InternalRosSystemParser.g:2721:2: ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? )
            // InternalRosSystemParser.g:2722:3: () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )?
            {
            // InternalRosSystemParser.g:2722:3: ()
            // InternalRosSystemParser.g:2723:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
              					current);
              			
            }

            }

            // InternalRosSystemParser.g:2729:3: (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LeftSquareBracket) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRosSystemParser.g:2730:4: otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0());
                      			
                    }
                    // InternalRosSystemParser.g:2734:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalRosSystemParser.g:2735:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalRosSystemParser.g:2735:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalRosSystemParser.g:2736:6: lv_value_2_0= ruleParameterStructMember
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_value_2_0=ruleParameterStructMember();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getParameterStructRule());
                      						}
                      						add(
                      							current,
                      							"value",
                      							lv_value_2_0,
                      							"de.fraunhofer.ipa.ros.Basics.ParameterStructMember");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalRosSystemParser.g:2753:4: (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==Comma) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:2754:5: otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_9); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_10); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_2_1());
                    	      				
                    	    }
                    	    // InternalRosSystemParser.g:2762:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalRosSystemParser.g:2763:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRosSystemParser.g:2763:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalRosSystemParser.g:2764:7: lv_value_5_0= ruleParameterStructMember
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_value_5_0=ruleParameterStructMember();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"value",
                    	      								lv_value_5_0,
                    	      								"de.fraunhofer.ipa.ros.Basics.ParameterStructMember");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_11); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_2_3());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStruct"


    // $ANTLR start "entryRuleParameterDate"
    // InternalRosSystemParser.g:2795:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRosSystemParser.g:2795:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRosSystemParser.g:2796:2: iv_ruleParameterDate= ruleParameterDate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDate=ruleParameterDate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDate"


    // $ANTLR start "ruleParameterDate"
    // InternalRosSystemParser.g:2802:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2808:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalRosSystemParser.g:2809:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalRosSystemParser.g:2809:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalRosSystemParser.g:2810:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalRosSystemParser.g:2810:3: (lv_value_0_0= ruleDateTime0 )
            // InternalRosSystemParser.g:2811:4: lv_value_0_0= ruleDateTime0
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDateTime0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getParameterDateRule());
              				}
              				set(
              					current,
              					"value",
              					lv_value_0_0,
              					"de.fraunhofer.ipa.ros.Basics.DateTime0");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDate"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalRosSystemParser.g:2831:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRosSystemParser.g:2831:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRosSystemParser.g:2832:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStructMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructMember=ruleParameterStructMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterStructMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStructMember"


    // $ANTLR start "ruleParameterStructMember"
    // InternalRosSystemParser.g:2838:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2844:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END ) )
            // InternalRosSystemParser.g:2845:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END )
            {
            // InternalRosSystemParser.g:2845:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END )
            // InternalRosSystemParser.g:2846:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END
            {
            // InternalRosSystemParser.g:2846:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystemParser.g:2847:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:2847:4: (lv_name_0_0= ruleEString )
            // InternalRosSystemParser.g:2848:5: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getColonKeyword_1());
              		
            }
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_BEGIN_2, grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_2());
              		
            }
            // InternalRosSystemParser.g:2873:3: ( (lv_value_3_0= ruleParameterValue ) )
            // InternalRosSystemParser.g:2874:4: (lv_value_3_0= ruleParameterValue )
            {
            // InternalRosSystemParser.g:2874:4: (lv_value_3_0= ruleParameterValue )
            // InternalRosSystemParser.g:2875:5: lv_value_3_0= ruleParameterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_value_3_0=ruleParameterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_3_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_END_4, grammarAccess.getParameterStructMemberAccess().getENDTerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructMember"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalRosSystemParser.g:2900:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRosSystemParser.g:2900:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRosSystemParser.g:2901:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterStructTypeMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructTypeMember=ruleParameterStructTypeMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterStructTypeMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterStructTypeMember"


    // $ANTLR start "ruleParameterStructTypeMember"
    // InternalRosSystemParser.g:2907:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2913:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalRosSystemParser.g:2914:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalRosSystemParser.g:2914:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalRosSystemParser.g:2915:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalRosSystemParser.g:2915:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystemParser.g:2916:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:2916:4: (lv_name_0_0= ruleEString )
            // InternalRosSystemParser.g:2917:5: lv_name_0_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_26);
            lv_name_0_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_0_0,
              						"de.fraunhofer.ipa.ros.Basics.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalRosSystemParser.g:2934:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalRosSystemParser.g:2935:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalRosSystemParser.g:2935:4: (lv_type_1_0= ruleParameterType )
            // InternalRosSystemParser.g:2936:5: lv_type_1_0= ruleParameterType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleParameterType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_1_0,
              						"de.fraunhofer.ipa.ros.Basics.ParameterType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructTypeMember"


    // $ANTLR start "entryRuleBase64Binary"
    // InternalRosSystemParser.g:2957:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRosSystemParser.g:2957:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRosSystemParser.g:2958:2: iv_ruleBase64Binary= ruleBase64Binary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBase64BinaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBase64Binary=ruleBase64Binary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBase64Binary.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // InternalRosSystemParser.g:2964:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:2970:2: (this_BINARY_0= RULE_BINARY )
            // InternalRosSystemParser.g:2971:2: this_BINARY_0= RULE_BINARY
            {
            this_BINARY_0=(Token)match(input,RULE_BINARY,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_BINARY_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_BINARY_0, grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleboolean0"
    // InternalRosSystemParser.g:2981:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalRosSystemParser.g:2981:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalRosSystemParser.g:2982:2: iv_ruleboolean0= ruleboolean0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolean0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleboolean0=ruleboolean0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolean0.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleboolean0"


    // $ANTLR start "ruleboolean0"
    // InternalRosSystemParser.g:2988:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:2994:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalRosSystemParser.g:2995:2: this_BOOLEAN_0= RULE_BOOLEAN
            {
            this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_BOOLEAN_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_BOOLEAN_0, grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolean0"


    // $ANTLR start "entryRuleDouble0"
    // InternalRosSystemParser.g:3005:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalRosSystemParser.g:3005:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalRosSystemParser.g:3006:2: iv_ruleDouble0= ruleDouble0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDouble0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDouble0=ruleDouble0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDouble0.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalRosSystemParser.g:3012:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3018:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalRosSystemParser.g:3019:2: this_DOUBLE_0= RULE_DOUBLE
            {
            this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DOUBLE_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_DOUBLE_0, grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "entryRuleInteger0"
    // InternalRosSystemParser.g:3029:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalRosSystemParser.g:3029:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalRosSystemParser.g:3030:2: iv_ruleInteger0= ruleInteger0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInteger0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInteger0=ruleInteger0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger0.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalRosSystemParser.g:3036:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3042:2: (this_DECINT_0= RULE_DECINT )
            // InternalRosSystemParser.g:3043:2: this_DECINT_0= RULE_DECINT
            {
            this_DECINT_0=(Token)match(input,RULE_DECINT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DECINT_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_DECINT_0, grammarAccess.getInteger0Access().getDECINTTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "entryRuleDateTime0"
    // InternalRosSystemParser.g:3053:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalRosSystemParser.g:3053:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalRosSystemParser.g:3054:2: iv_ruleDateTime0= ruleDateTime0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateTime0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDateTime0=ruleDateTime0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateTime0.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTime0"


    // $ANTLR start "ruleDateTime0"
    // InternalRosSystemParser.g:3060:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3066:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalRosSystemParser.g:3067:2: this_DATE_TIME_0= RULE_DATE_TIME
            {
            this_DATE_TIME_0=(Token)match(input,RULE_DATE_TIME,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_DATE_TIME_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_DATE_TIME_0, grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTime0"


    // $ANTLR start "entryRuleAbstractType"
    // InternalRosSystemParser.g:3077:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalRosSystemParser.g:3077:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalRosSystemParser.g:3078:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalRosSystemParser.g:3084:1: ruleAbstractType returns [EObject current=null] : (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject this_bool_0 = null;

        EObject this_int8_1 = null;

        EObject this_uint8_2 = null;

        EObject this_int16_3 = null;

        EObject this_uint16_4 = null;

        EObject this_int32_5 = null;

        EObject this_uint32_6 = null;

        EObject this_int64_7 = null;

        EObject this_uint64_8 = null;

        EObject this_float32_9 = null;

        EObject this_float64_10 = null;

        EObject this_string0_11 = null;

        EObject this_byte_12 = null;

        EObject this_time_13 = null;

        EObject this_duration_14 = null;

        EObject this_Header_15 = null;

        EObject this_boolArray_16 = null;

        EObject this_int8Array_17 = null;

        EObject this_uint8Array_18 = null;

        EObject this_int16Array_19 = null;

        EObject this_uint16Array_20 = null;

        EObject this_int32Array_21 = null;

        EObject this_uint32Array_22 = null;

        EObject this_int64Array_23 = null;

        EObject this_uint64Array_24 = null;

        EObject this_float32Array_25 = null;

        EObject this_float64Array_26 = null;

        EObject this_string0Array_27 = null;

        EObject this_byteArray_28 = null;

        EObject this_SpecBaseRef_29 = null;

        EObject this_ArraySpecRef_30 = null;

        EObject this_char_31 = null;

        EObject this_charArray_32 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:3090:2: ( (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray ) )
            // InternalRosSystemParser.g:3091:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )
            {
            // InternalRosSystemParser.g:3091:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )
            int alt37=33;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalRosSystemParser.g:3092:3: this_bool_0= rulebool
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_bool_0=rulebool();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_bool_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:3101:3: this_int8_1= ruleint8
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int8_1=ruleint8();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int8_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:3110:3: this_uint8_2= ruleuint8
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint8_2=ruleuint8();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint8_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:3119:3: this_int16_3= ruleint16
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int16_3=ruleint16();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int16_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:3128:3: this_uint16_4= ruleuint16
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint16_4=ruleuint16();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint16_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:3137:3: this_int32_5= ruleint32
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int32_5=ruleint32();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int32_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:3146:3: this_uint32_6= ruleuint32
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint32_6=ruleuint32();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint32_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:3155:3: this_int64_7= ruleint64
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int64_7=ruleint64();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int64_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalRosSystemParser.g:3164:3: this_uint64_8= ruleuint64
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint64_8=ruleuint64();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint64_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalRosSystemParser.g:3173:3: this_float32_9= rulefloat32
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_float32_9=rulefloat32();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_float32_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalRosSystemParser.g:3182:3: this_float64_10= rulefloat64
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_float64_10=rulefloat64();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_float64_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalRosSystemParser.g:3191:3: this_string0_11= rulestring0
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_string0_11=rulestring0();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_string0_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalRosSystemParser.g:3200:3: this_byte_12= rulebyte
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getByteParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_byte_12=rulebyte();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_byte_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalRosSystemParser.g:3209:3: this_time_13= ruletime
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getTimeParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_time_13=ruletime();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_time_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalRosSystemParser.g:3218:3: this_duration_14= ruleduration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getDurationParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_duration_14=ruleduration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_duration_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalRosSystemParser.g:3227:3: this_Header_15= ruleHeader
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getHeaderParserRuleCall_15());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Header_15=ruleHeader();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Header_15;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalRosSystemParser.g:3236:3: this_boolArray_16= ruleboolArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_16());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_boolArray_16=ruleboolArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_boolArray_16;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalRosSystemParser.g:3245:3: this_int8Array_17= ruleint8Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_17());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int8Array_17=ruleint8Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int8Array_17;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalRosSystemParser.g:3254:3: this_uint8Array_18= ruleuint8Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_18());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint8Array_18=ruleuint8Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint8Array_18;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalRosSystemParser.g:3263:3: this_int16Array_19= ruleint16Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_19());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int16Array_19=ruleint16Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int16Array_19;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 21 :
                    // InternalRosSystemParser.g:3272:3: this_uint16Array_20= ruleuint16Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_20());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint16Array_20=ruleuint16Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint16Array_20;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 22 :
                    // InternalRosSystemParser.g:3281:3: this_int32Array_21= ruleint32Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_21());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int32Array_21=ruleint32Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int32Array_21;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 23 :
                    // InternalRosSystemParser.g:3290:3: this_uint32Array_22= ruleuint32Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_22());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint32Array_22=ruleuint32Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint32Array_22;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 24 :
                    // InternalRosSystemParser.g:3299:3: this_int64Array_23= ruleint64Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_23());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_int64Array_23=ruleint64Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_int64Array_23;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 25 :
                    // InternalRosSystemParser.g:3308:3: this_uint64Array_24= ruleuint64Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_24());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_uint64Array_24=ruleuint64Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_uint64Array_24;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 26 :
                    // InternalRosSystemParser.g:3317:3: this_float32Array_25= rulefloat32Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_25());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_float32Array_25=rulefloat32Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_float32Array_25;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 27 :
                    // InternalRosSystemParser.g:3326:3: this_float64Array_26= rulefloat64Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_26());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_float64Array_26=rulefloat64Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_float64Array_26;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 28 :
                    // InternalRosSystemParser.g:3335:3: this_string0Array_27= rulestring0Array
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_27());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_string0Array_27=rulestring0Array();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_string0Array_27;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 29 :
                    // InternalRosSystemParser.g:3344:3: this_byteArray_28= rulebyteArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getByteArrayParserRuleCall_28());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_byteArray_28=rulebyteArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_byteArray_28;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 30 :
                    // InternalRosSystemParser.g:3353:3: this_SpecBaseRef_29= ruleSpecBaseRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getSpecBaseRefParserRuleCall_29());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_SpecBaseRef_29=ruleSpecBaseRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SpecBaseRef_29;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 31 :
                    // InternalRosSystemParser.g:3362:3: this_ArraySpecRef_30= ruleArraySpecRef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getArraySpecRefParserRuleCall_30());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArraySpecRef_30=ruleArraySpecRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArraySpecRef_30;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 32 :
                    // InternalRosSystemParser.g:3371:3: this_char_31= rulechar
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getCharParserRuleCall_31());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_char_31=rulechar();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_char_31;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 33 :
                    // InternalRosSystemParser.g:3380:3: this_charArray_32= rulecharArray
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAbstractTypeAccess().getCharArrayParserRuleCall_32());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_charArray_32=rulecharArray();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_charArray_32;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRulebool"
    // InternalRosSystemParser.g:3392:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalRosSystemParser.g:3392:45: (iv_rulebool= rulebool EOF )
            // InternalRosSystemParser.g:3393:2: iv_rulebool= rulebool EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebool=rulebool();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebool; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // InternalRosSystemParser.g:3399:1: rulebool returns [EObject current=null] : ( () otherlv_1= Bool ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3405:2: ( ( () otherlv_1= Bool ) )
            // InternalRosSystemParser.g:3406:2: ( () otherlv_1= Bool )
            {
            // InternalRosSystemParser.g:3406:2: ( () otherlv_1= Bool )
            // InternalRosSystemParser.g:3407:3: () otherlv_1= Bool
            {
            // InternalRosSystemParser.g:3407:3: ()
            // InternalRosSystemParser.g:3408:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolAccess().getBoolAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Bool,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getBoolKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleint8"
    // InternalRosSystemParser.g:3422:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalRosSystemParser.g:3422:45: (iv_ruleint8= ruleint8 EOF )
            // InternalRosSystemParser.g:3423:2: iv_ruleint8= ruleint8 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt8Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint8=ruleint8();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint8; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint8"


    // $ANTLR start "ruleint8"
    // InternalRosSystemParser.g:3429:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= Int8 ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3435:2: ( ( () otherlv_1= Int8 ) )
            // InternalRosSystemParser.g:3436:2: ( () otherlv_1= Int8 )
            {
            // InternalRosSystemParser.g:3436:2: ( () otherlv_1= Int8 )
            // InternalRosSystemParser.g:3437:3: () otherlv_1= Int8
            {
            // InternalRosSystemParser.g:3437:3: ()
            // InternalRosSystemParser.g:3438:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt8Access().getInt8Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int8,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt8Access().getInt8Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint8"


    // $ANTLR start "entryRuleuint8"
    // InternalRosSystemParser.g:3452:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalRosSystemParser.g:3452:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalRosSystemParser.g:3453:2: iv_ruleuint8= ruleuint8 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint8Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint8=ruleuint8();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint8; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint8"


    // $ANTLR start "ruleuint8"
    // InternalRosSystemParser.g:3459:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= Uint8 ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3465:2: ( ( () otherlv_1= Uint8 ) )
            // InternalRosSystemParser.g:3466:2: ( () otherlv_1= Uint8 )
            {
            // InternalRosSystemParser.g:3466:2: ( () otherlv_1= Uint8 )
            // InternalRosSystemParser.g:3467:3: () otherlv_1= Uint8
            {
            // InternalRosSystemParser.g:3467:3: ()
            // InternalRosSystemParser.g:3468:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint8Access().getUint8Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint8,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint8Access().getUint8Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint8"


    // $ANTLR start "entryRuleint16"
    // InternalRosSystemParser.g:3482:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalRosSystemParser.g:3482:46: (iv_ruleint16= ruleint16 EOF )
            // InternalRosSystemParser.g:3483:2: iv_ruleint16= ruleint16 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt16Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint16=ruleint16();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint16; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint16"


    // $ANTLR start "ruleint16"
    // InternalRosSystemParser.g:3489:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= Int16 ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3495:2: ( ( () otherlv_1= Int16 ) )
            // InternalRosSystemParser.g:3496:2: ( () otherlv_1= Int16 )
            {
            // InternalRosSystemParser.g:3496:2: ( () otherlv_1= Int16 )
            // InternalRosSystemParser.g:3497:3: () otherlv_1= Int16
            {
            // InternalRosSystemParser.g:3497:3: ()
            // InternalRosSystemParser.g:3498:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt16Access().getInt16Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt16Access().getInt16Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint16"


    // $ANTLR start "entryRuleuint16"
    // InternalRosSystemParser.g:3512:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalRosSystemParser.g:3512:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalRosSystemParser.g:3513:2: iv_ruleuint16= ruleuint16 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint16Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint16=ruleuint16();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint16; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint16"


    // $ANTLR start "ruleuint16"
    // InternalRosSystemParser.g:3519:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= Uint16 ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3525:2: ( ( () otherlv_1= Uint16 ) )
            // InternalRosSystemParser.g:3526:2: ( () otherlv_1= Uint16 )
            {
            // InternalRosSystemParser.g:3526:2: ( () otherlv_1= Uint16 )
            // InternalRosSystemParser.g:3527:3: () otherlv_1= Uint16
            {
            // InternalRosSystemParser.g:3527:3: ()
            // InternalRosSystemParser.g:3528:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint16Access().getUint16Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint16,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint16Access().getUint16Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint16"


    // $ANTLR start "entryRuleint32"
    // InternalRosSystemParser.g:3542:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalRosSystemParser.g:3542:46: (iv_ruleint32= ruleint32 EOF )
            // InternalRosSystemParser.g:3543:2: iv_ruleint32= ruleint32 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt32Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint32=ruleint32();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint32; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint32"


    // $ANTLR start "ruleint32"
    // InternalRosSystemParser.g:3549:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= Int32 ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3555:2: ( ( () otherlv_1= Int32 ) )
            // InternalRosSystemParser.g:3556:2: ( () otherlv_1= Int32 )
            {
            // InternalRosSystemParser.g:3556:2: ( () otherlv_1= Int32 )
            // InternalRosSystemParser.g:3557:3: () otherlv_1= Int32
            {
            // InternalRosSystemParser.g:3557:3: ()
            // InternalRosSystemParser.g:3558:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt32Access().getInt32Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt32Access().getInt32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint32"


    // $ANTLR start "entryRuleuint32"
    // InternalRosSystemParser.g:3572:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalRosSystemParser.g:3572:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalRosSystemParser.g:3573:2: iv_ruleuint32= ruleuint32 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint32Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint32=ruleuint32();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint32; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint32"


    // $ANTLR start "ruleuint32"
    // InternalRosSystemParser.g:3579:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= Uint32 ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3585:2: ( ( () otherlv_1= Uint32 ) )
            // InternalRosSystemParser.g:3586:2: ( () otherlv_1= Uint32 )
            {
            // InternalRosSystemParser.g:3586:2: ( () otherlv_1= Uint32 )
            // InternalRosSystemParser.g:3587:3: () otherlv_1= Uint32
            {
            // InternalRosSystemParser.g:3587:3: ()
            // InternalRosSystemParser.g:3588:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint32Access().getUint32Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint32Access().getUint32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint32"


    // $ANTLR start "entryRuleint64"
    // InternalRosSystemParser.g:3602:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalRosSystemParser.g:3602:46: (iv_ruleint64= ruleint64 EOF )
            // InternalRosSystemParser.g:3603:2: iv_ruleint64= ruleint64 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt64Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint64=ruleint64();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint64; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint64"


    // $ANTLR start "ruleint64"
    // InternalRosSystemParser.g:3609:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= Int64 ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3615:2: ( ( () otherlv_1= Int64 ) )
            // InternalRosSystemParser.g:3616:2: ( () otherlv_1= Int64 )
            {
            // InternalRosSystemParser.g:3616:2: ( () otherlv_1= Int64 )
            // InternalRosSystemParser.g:3617:3: () otherlv_1= Int64
            {
            // InternalRosSystemParser.g:3617:3: ()
            // InternalRosSystemParser.g:3618:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt64Access().getInt64Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt64Access().getInt64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint64"


    // $ANTLR start "entryRuleuint64"
    // InternalRosSystemParser.g:3632:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalRosSystemParser.g:3632:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalRosSystemParser.g:3633:2: iv_ruleuint64= ruleuint64 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint64Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint64=ruleuint64();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint64; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint64"


    // $ANTLR start "ruleuint64"
    // InternalRosSystemParser.g:3639:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= Uint64 ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3645:2: ( ( () otherlv_1= Uint64 ) )
            // InternalRosSystemParser.g:3646:2: ( () otherlv_1= Uint64 )
            {
            // InternalRosSystemParser.g:3646:2: ( () otherlv_1= Uint64 )
            // InternalRosSystemParser.g:3647:3: () otherlv_1= Uint64
            {
            // InternalRosSystemParser.g:3647:3: ()
            // InternalRosSystemParser.g:3648:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint64Access().getUint64Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint64Access().getUint64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint64"


    // $ANTLR start "entryRulefloat32"
    // InternalRosSystemParser.g:3662:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalRosSystemParser.g:3662:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalRosSystemParser.g:3663:2: iv_rulefloat32= rulefloat32 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat32Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloat32=rulefloat32();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloat32; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefloat32"


    // $ANTLR start "rulefloat32"
    // InternalRosSystemParser.g:3669:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= Float32 ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3675:2: ( ( () otherlv_1= Float32 ) )
            // InternalRosSystemParser.g:3676:2: ( () otherlv_1= Float32 )
            {
            // InternalRosSystemParser.g:3676:2: ( () otherlv_1= Float32 )
            // InternalRosSystemParser.g:3677:3: () otherlv_1= Float32
            {
            // InternalRosSystemParser.g:3677:3: ()
            // InternalRosSystemParser.g:3678:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFloat32Access().getFloat32Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Float32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFloat32Access().getFloat32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat32"


    // $ANTLR start "entryRulefloat64"
    // InternalRosSystemParser.g:3692:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalRosSystemParser.g:3692:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalRosSystemParser.g:3693:2: iv_rulefloat64= rulefloat64 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat64Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloat64=rulefloat64();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloat64; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefloat64"


    // $ANTLR start "rulefloat64"
    // InternalRosSystemParser.g:3699:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= Float64 ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3705:2: ( ( () otherlv_1= Float64 ) )
            // InternalRosSystemParser.g:3706:2: ( () otherlv_1= Float64 )
            {
            // InternalRosSystemParser.g:3706:2: ( () otherlv_1= Float64 )
            // InternalRosSystemParser.g:3707:3: () otherlv_1= Float64
            {
            // InternalRosSystemParser.g:3707:3: ()
            // InternalRosSystemParser.g:3708:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFloat64Access().getFloat64Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Float64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFloat64Access().getFloat64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat64"


    // $ANTLR start "entryRulestring0"
    // InternalRosSystemParser.g:3722:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalRosSystemParser.g:3722:48: (iv_rulestring0= rulestring0 EOF )
            // InternalRosSystemParser.g:3723:2: iv_rulestring0= rulestring0 EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getString0Rule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestring0=rulestring0();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestring0; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestring0"


    // $ANTLR start "rulestring0"
    // InternalRosSystemParser.g:3729:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= String_1 ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3735:2: ( ( () otherlv_1= String_1 ) )
            // InternalRosSystemParser.g:3736:2: ( () otherlv_1= String_1 )
            {
            // InternalRosSystemParser.g:3736:2: ( () otherlv_1= String_1 )
            // InternalRosSystemParser.g:3737:3: () otherlv_1= String_1
            {
            // InternalRosSystemParser.g:3737:3: ()
            // InternalRosSystemParser.g:3738:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getString0Access().getStringAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,String_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestring0"


    // $ANTLR start "entryRulechar"
    // InternalRosSystemParser.g:3752:1: entryRulechar returns [EObject current=null] : iv_rulechar= rulechar EOF ;
    public final EObject entryRulechar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechar = null;


        try {
            // InternalRosSystemParser.g:3752:45: (iv_rulechar= rulechar EOF )
            // InternalRosSystemParser.g:3753:2: iv_rulechar= rulechar EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulechar=rulechar();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulechar; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulechar"


    // $ANTLR start "rulechar"
    // InternalRosSystemParser.g:3759:1: rulechar returns [EObject current=null] : ( () otherlv_1= Char ) ;
    public final EObject rulechar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3765:2: ( ( () otherlv_1= Char ) )
            // InternalRosSystemParser.g:3766:2: ( () otherlv_1= Char )
            {
            // InternalRosSystemParser.g:3766:2: ( () otherlv_1= Char )
            // InternalRosSystemParser.g:3767:3: () otherlv_1= Char
            {
            // InternalRosSystemParser.g:3767:3: ()
            // InternalRosSystemParser.g:3768:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCharAccess().getChar0Action_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Char,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCharAccess().getCharKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulechar"


    // $ANTLR start "entryRulebyte"
    // InternalRosSystemParser.g:3782:1: entryRulebyte returns [EObject current=null] : iv_rulebyte= rulebyte EOF ;
    public final EObject entryRulebyte() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyte = null;


        try {
            // InternalRosSystemParser.g:3782:45: (iv_rulebyte= rulebyte EOF )
            // InternalRosSystemParser.g:3783:2: iv_rulebyte= rulebyte EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getByteRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebyte=rulebyte();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebyte; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebyte"


    // $ANTLR start "rulebyte"
    // InternalRosSystemParser.g:3789:1: rulebyte returns [EObject current=null] : ( () otherlv_1= Byte ) ;
    public final EObject rulebyte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3795:2: ( ( () otherlv_1= Byte ) )
            // InternalRosSystemParser.g:3796:2: ( () otherlv_1= Byte )
            {
            // InternalRosSystemParser.g:3796:2: ( () otherlv_1= Byte )
            // InternalRosSystemParser.g:3797:3: () otherlv_1= Byte
            {
            // InternalRosSystemParser.g:3797:3: ()
            // InternalRosSystemParser.g:3798:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getByteAccess().getByteAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Byte,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getByteAccess().getByteKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebyte"


    // $ANTLR start "entryRuletime"
    // InternalRosSystemParser.g:3812:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalRosSystemParser.g:3812:45: (iv_ruletime= ruletime EOF )
            // InternalRosSystemParser.g:3813:2: iv_ruletime= ruletime EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruletime=ruletime();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruletime; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuletime"


    // $ANTLR start "ruletime"
    // InternalRosSystemParser.g:3819:1: ruletime returns [EObject current=null] : ( () otherlv_1= Time ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3825:2: ( ( () otherlv_1= Time ) )
            // InternalRosSystemParser.g:3826:2: ( () otherlv_1= Time )
            {
            // InternalRosSystemParser.g:3826:2: ( () otherlv_1= Time )
            // InternalRosSystemParser.g:3827:3: () otherlv_1= Time
            {
            // InternalRosSystemParser.g:3827:3: ()
            // InternalRosSystemParser.g:3828:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTimeAccess().getTimeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Time,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getTimeKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletime"


    // $ANTLR start "entryRuleduration"
    // InternalRosSystemParser.g:3842:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalRosSystemParser.g:3842:49: (iv_ruleduration= ruleduration EOF )
            // InternalRosSystemParser.g:3843:2: iv_ruleduration= ruleduration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDurationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleduration=ruleduration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleduration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleduration"


    // $ANTLR start "ruleduration"
    // InternalRosSystemParser.g:3849:1: ruleduration returns [EObject current=null] : ( () otherlv_1= Duration ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3855:2: ( ( () otherlv_1= Duration ) )
            // InternalRosSystemParser.g:3856:2: ( () otherlv_1= Duration )
            {
            // InternalRosSystemParser.g:3856:2: ( () otherlv_1= Duration )
            // InternalRosSystemParser.g:3857:3: () otherlv_1= Duration
            {
            // InternalRosSystemParser.g:3857:3: ()
            // InternalRosSystemParser.g:3858:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getDurationAccess().getDurationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Duration,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getDurationAccess().getDurationKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleduration"


    // $ANTLR start "entryRuleboolArray"
    // InternalRosSystemParser.g:3872:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalRosSystemParser.g:3872:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalRosSystemParser.g:3873:2: iv_ruleboolArray= ruleboolArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoolArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleboolArray=ruleboolArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleboolArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleboolArray"


    // $ANTLR start "ruleboolArray"
    // InternalRosSystemParser.g:3879:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= Bool_1 ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3885:2: ( ( () otherlv_1= Bool_1 ) )
            // InternalRosSystemParser.g:3886:2: ( () otherlv_1= Bool_1 )
            {
            // InternalRosSystemParser.g:3886:2: ( () otherlv_1= Bool_1 )
            // InternalRosSystemParser.g:3887:3: () otherlv_1= Bool_1
            {
            // InternalRosSystemParser.g:3887:3: ()
            // InternalRosSystemParser.g:3888:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getBoolArrayAccess().getBoolArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Bool_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBoolArrayAccess().getBoolKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolArray"


    // $ANTLR start "entryRuleint8Array"
    // InternalRosSystemParser.g:3902:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalRosSystemParser.g:3902:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalRosSystemParser.g:3903:2: iv_ruleint8Array= ruleint8Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt8ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint8Array=ruleint8Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint8Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint8Array"


    // $ANTLR start "ruleint8Array"
    // InternalRosSystemParser.g:3909:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= Int8_1 ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3915:2: ( ( () otherlv_1= Int8_1 ) )
            // InternalRosSystemParser.g:3916:2: ( () otherlv_1= Int8_1 )
            {
            // InternalRosSystemParser.g:3916:2: ( () otherlv_1= Int8_1 )
            // InternalRosSystemParser.g:3917:3: () otherlv_1= Int8_1
            {
            // InternalRosSystemParser.g:3917:3: ()
            // InternalRosSystemParser.g:3918:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int8_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt8ArrayAccess().getInt8Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint8Array"


    // $ANTLR start "entryRuleuint8Array"
    // InternalRosSystemParser.g:3932:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalRosSystemParser.g:3932:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalRosSystemParser.g:3933:2: iv_ruleuint8Array= ruleuint8Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint8ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint8Array=ruleuint8Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint8Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint8Array"


    // $ANTLR start "ruleuint8Array"
    // InternalRosSystemParser.g:3939:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= Uint8_1 ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3945:2: ( ( () otherlv_1= Uint8_1 ) )
            // InternalRosSystemParser.g:3946:2: ( () otherlv_1= Uint8_1 )
            {
            // InternalRosSystemParser.g:3946:2: ( () otherlv_1= Uint8_1 )
            // InternalRosSystemParser.g:3947:3: () otherlv_1= Uint8_1
            {
            // InternalRosSystemParser.g:3947:3: ()
            // InternalRosSystemParser.g:3948:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint8_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint8ArrayAccess().getUint8Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint8Array"


    // $ANTLR start "entryRuleint16Array"
    // InternalRosSystemParser.g:3962:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalRosSystemParser.g:3962:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalRosSystemParser.g:3963:2: iv_ruleint16Array= ruleint16Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt16ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint16Array=ruleint16Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint16Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint16Array"


    // $ANTLR start "ruleint16Array"
    // InternalRosSystemParser.g:3969:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= Int16_1 ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3975:2: ( ( () otherlv_1= Int16_1 ) )
            // InternalRosSystemParser.g:3976:2: ( () otherlv_1= Int16_1 )
            {
            // InternalRosSystemParser.g:3976:2: ( () otherlv_1= Int16_1 )
            // InternalRosSystemParser.g:3977:3: () otherlv_1= Int16_1
            {
            // InternalRosSystemParser.g:3977:3: ()
            // InternalRosSystemParser.g:3978:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int16_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt16ArrayAccess().getInt16Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint16Array"


    // $ANTLR start "entryRuleuint16Array"
    // InternalRosSystemParser.g:3992:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalRosSystemParser.g:3992:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalRosSystemParser.g:3993:2: iv_ruleuint16Array= ruleuint16Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint16ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint16Array=ruleuint16Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint16Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint16Array"


    // $ANTLR start "ruleuint16Array"
    // InternalRosSystemParser.g:3999:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= Uint16_1 ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4005:2: ( ( () otherlv_1= Uint16_1 ) )
            // InternalRosSystemParser.g:4006:2: ( () otherlv_1= Uint16_1 )
            {
            // InternalRosSystemParser.g:4006:2: ( () otherlv_1= Uint16_1 )
            // InternalRosSystemParser.g:4007:3: () otherlv_1= Uint16_1
            {
            // InternalRosSystemParser.g:4007:3: ()
            // InternalRosSystemParser.g:4008:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint16_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint16ArrayAccess().getUint16Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint16Array"


    // $ANTLR start "entryRuleint32Array"
    // InternalRosSystemParser.g:4022:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalRosSystemParser.g:4022:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalRosSystemParser.g:4023:2: iv_ruleint32Array= ruleint32Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt32ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint32Array=ruleint32Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint32Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint32Array"


    // $ANTLR start "ruleint32Array"
    // InternalRosSystemParser.g:4029:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= Int32_1 ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4035:2: ( ( () otherlv_1= Int32_1 ) )
            // InternalRosSystemParser.g:4036:2: ( () otherlv_1= Int32_1 )
            {
            // InternalRosSystemParser.g:4036:2: ( () otherlv_1= Int32_1 )
            // InternalRosSystemParser.g:4037:3: () otherlv_1= Int32_1
            {
            // InternalRosSystemParser.g:4037:3: ()
            // InternalRosSystemParser.g:4038:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int32_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt32ArrayAccess().getInt32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint32Array"


    // $ANTLR start "entryRuleuint32Array"
    // InternalRosSystemParser.g:4052:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalRosSystemParser.g:4052:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalRosSystemParser.g:4053:2: iv_ruleuint32Array= ruleuint32Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint32ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint32Array=ruleuint32Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint32Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint32Array"


    // $ANTLR start "ruleuint32Array"
    // InternalRosSystemParser.g:4059:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= Uint32_1 ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4065:2: ( ( () otherlv_1= Uint32_1 ) )
            // InternalRosSystemParser.g:4066:2: ( () otherlv_1= Uint32_1 )
            {
            // InternalRosSystemParser.g:4066:2: ( () otherlv_1= Uint32_1 )
            // InternalRosSystemParser.g:4067:3: () otherlv_1= Uint32_1
            {
            // InternalRosSystemParser.g:4067:3: ()
            // InternalRosSystemParser.g:4068:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint32_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint32ArrayAccess().getUint32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint32Array"


    // $ANTLR start "entryRuleint64Array"
    // InternalRosSystemParser.g:4082:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalRosSystemParser.g:4082:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalRosSystemParser.g:4083:2: iv_ruleint64Array= ruleint64Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInt64ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleint64Array=ruleint64Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleint64Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleint64Array"


    // $ANTLR start "ruleint64Array"
    // InternalRosSystemParser.g:4089:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= Int64_1 ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4095:2: ( ( () otherlv_1= Int64_1 ) )
            // InternalRosSystemParser.g:4096:2: ( () otherlv_1= Int64_1 )
            {
            // InternalRosSystemParser.g:4096:2: ( () otherlv_1= Int64_1 )
            // InternalRosSystemParser.g:4097:3: () otherlv_1= Int64_1
            {
            // InternalRosSystemParser.g:4097:3: ()
            // InternalRosSystemParser.g:4098:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Int64_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInt64ArrayAccess().getInt64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint64Array"


    // $ANTLR start "entryRuleuint64Array"
    // InternalRosSystemParser.g:4112:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalRosSystemParser.g:4112:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalRosSystemParser.g:4113:2: iv_ruleuint64Array= ruleuint64Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUint64ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuint64Array=ruleuint64Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuint64Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuint64Array"


    // $ANTLR start "ruleuint64Array"
    // InternalRosSystemParser.g:4119:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= Uint64_1 ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4125:2: ( ( () otherlv_1= Uint64_1 ) )
            // InternalRosSystemParser.g:4126:2: ( () otherlv_1= Uint64_1 )
            {
            // InternalRosSystemParser.g:4126:2: ( () otherlv_1= Uint64_1 )
            // InternalRosSystemParser.g:4127:3: () otherlv_1= Uint64_1
            {
            // InternalRosSystemParser.g:4127:3: ()
            // InternalRosSystemParser.g:4128:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Uint64_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getUint64ArrayAccess().getUint64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint64Array"


    // $ANTLR start "entryRulefloat32Array"
    // InternalRosSystemParser.g:4142:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalRosSystemParser.g:4142:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalRosSystemParser.g:4143:2: iv_rulefloat32Array= rulefloat32Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat32ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloat32Array=rulefloat32Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloat32Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefloat32Array"


    // $ANTLR start "rulefloat32Array"
    // InternalRosSystemParser.g:4149:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= Float32_1 ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4155:2: ( ( () otherlv_1= Float32_1 ) )
            // InternalRosSystemParser.g:4156:2: ( () otherlv_1= Float32_1 )
            {
            // InternalRosSystemParser.g:4156:2: ( () otherlv_1= Float32_1 )
            // InternalRosSystemParser.g:4157:3: () otherlv_1= Float32_1
            {
            // InternalRosSystemParser.g:4157:3: ()
            // InternalRosSystemParser.g:4158:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Float32_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFloat32ArrayAccess().getFloat32Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat32Array"


    // $ANTLR start "entryRulefloat64Array"
    // InternalRosSystemParser.g:4172:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalRosSystemParser.g:4172:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalRosSystemParser.g:4173:2: iv_rulefloat64Array= rulefloat64Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFloat64ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulefloat64Array=rulefloat64Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulefloat64Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulefloat64Array"


    // $ANTLR start "rulefloat64Array"
    // InternalRosSystemParser.g:4179:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= Float64_1 ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4185:2: ( ( () otherlv_1= Float64_1 ) )
            // InternalRosSystemParser.g:4186:2: ( () otherlv_1= Float64_1 )
            {
            // InternalRosSystemParser.g:4186:2: ( () otherlv_1= Float64_1 )
            // InternalRosSystemParser.g:4187:3: () otherlv_1= Float64_1
            {
            // InternalRosSystemParser.g:4187:3: ()
            // InternalRosSystemParser.g:4188:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Float64_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFloat64ArrayAccess().getFloat64Keyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat64Array"


    // $ANTLR start "entryRulestring0Array"
    // InternalRosSystemParser.g:4202:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalRosSystemParser.g:4202:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalRosSystemParser.g:4203:2: iv_rulestring0Array= rulestring0Array EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getString0ArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulestring0Array=rulestring0Array();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulestring0Array; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulestring0Array"


    // $ANTLR start "rulestring0Array"
    // InternalRosSystemParser.g:4209:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= String_2 ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4215:2: ( ( () otherlv_1= String_2 ) )
            // InternalRosSystemParser.g:4216:2: ( () otherlv_1= String_2 )
            {
            // InternalRosSystemParser.g:4216:2: ( () otherlv_1= String_2 )
            // InternalRosSystemParser.g:4217:3: () otherlv_1= String_2
            {
            // InternalRosSystemParser.g:4217:3: ()
            // InternalRosSystemParser.g:4218:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getString0ArrayAccess().getStringArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,String_2,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getString0ArrayAccess().getStringKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestring0Array"


    // $ANTLR start "entryRulebyteArray"
    // InternalRosSystemParser.g:4232:1: entryRulebyteArray returns [EObject current=null] : iv_rulebyteArray= rulebyteArray EOF ;
    public final EObject entryRulebyteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyteArray = null;


        try {
            // InternalRosSystemParser.g:4232:50: (iv_rulebyteArray= rulebyteArray EOF )
            // InternalRosSystemParser.g:4233:2: iv_rulebyteArray= rulebyteArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getByteArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulebyteArray=rulebyteArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulebyteArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulebyteArray"


    // $ANTLR start "rulebyteArray"
    // InternalRosSystemParser.g:4239:1: rulebyteArray returns [EObject current=null] : ( () otherlv_1= Byte_1 ) ;
    public final EObject rulebyteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4245:2: ( ( () otherlv_1= Byte_1 ) )
            // InternalRosSystemParser.g:4246:2: ( () otherlv_1= Byte_1 )
            {
            // InternalRosSystemParser.g:4246:2: ( () otherlv_1= Byte_1 )
            // InternalRosSystemParser.g:4247:3: () otherlv_1= Byte_1
            {
            // InternalRosSystemParser.g:4247:3: ()
            // InternalRosSystemParser.g:4248:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getByteArrayAccess().getByteArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Byte_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getByteArrayAccess().getByteKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebyteArray"


    // $ANTLR start "entryRulecharArray"
    // InternalRosSystemParser.g:4262:1: entryRulecharArray returns [EObject current=null] : iv_rulecharArray= rulecharArray EOF ;
    public final EObject entryRulecharArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharArray = null;


        try {
            // InternalRosSystemParser.g:4262:50: (iv_rulecharArray= rulecharArray EOF )
            // InternalRosSystemParser.g:4263:2: iv_rulecharArray= rulecharArray EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCharArrayRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulecharArray=rulecharArray();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulecharArray; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecharArray"


    // $ANTLR start "rulecharArray"
    // InternalRosSystemParser.g:4269:1: rulecharArray returns [EObject current=null] : ( () otherlv_1= Char_1 ) ;
    public final EObject rulecharArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4275:2: ( ( () otherlv_1= Char_1 ) )
            // InternalRosSystemParser.g:4276:2: ( () otherlv_1= Char_1 )
            {
            // InternalRosSystemParser.g:4276:2: ( () otherlv_1= Char_1 )
            // InternalRosSystemParser.g:4277:3: () otherlv_1= Char_1
            {
            // InternalRosSystemParser.g:4277:3: ()
            // InternalRosSystemParser.g:4278:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getCharArrayAccess().getCharArrayAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Char_1,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getCharArrayAccess().getCharKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecharArray"


    // $ANTLR start "entryRuleHeader"
    // InternalRosSystemParser.g:4292:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRosSystemParser.g:4292:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRosSystemParser.g:4293:2: iv_ruleHeader= ruleHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalRosSystemParser.g:4299:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= Header ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4305:2: ( ( () otherlv_1= Header ) )
            // InternalRosSystemParser.g:4306:2: ( () otherlv_1= Header )
            {
            // InternalRosSystemParser.g:4306:2: ( () otherlv_1= Header )
            // InternalRosSystemParser.g:4307:3: () otherlv_1= Header
            {
            // InternalRosSystemParser.g:4307:3: ()
            // InternalRosSystemParser.g:4308:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHeaderAccess().getHeaderAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,Header,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getHeaderKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleSpecBaseRef"
    // InternalRosSystemParser.g:4322:1: entryRuleSpecBaseRef returns [EObject current=null] : iv_ruleSpecBaseRef= ruleSpecBaseRef EOF ;
    public final EObject entryRuleSpecBaseRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBaseRef = null;


        try {
            // InternalRosSystemParser.g:4322:52: (iv_ruleSpecBaseRef= ruleSpecBaseRef EOF )
            // InternalRosSystemParser.g:4323:2: iv_ruleSpecBaseRef= ruleSpecBaseRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSpecBaseRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSpecBaseRef=ruleSpecBaseRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSpecBaseRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecBaseRef"


    // $ANTLR start "ruleSpecBaseRef"
    // InternalRosSystemParser.g:4329:1: ruleSpecBaseRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSpecBaseRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4335:2: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:4336:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:4336:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:4337:3: ( ruleEString )
            {
            // InternalRosSystemParser.g:4337:3: ( ruleEString )
            // InternalRosSystemParser.g:4338:4: ruleEString
            {
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSpecBaseRefRule());
              				}
              			
            }
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecCrossReference_0());
              			
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecBaseRef"


    // $ANTLR start "entryRuleArraySpecRef"
    // InternalRosSystemParser.g:4355:1: entryRuleArraySpecRef returns [EObject current=null] : iv_ruleArraySpecRef= ruleArraySpecRef EOF ;
    public final EObject entryRuleArraySpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecRef = null;


        try {
            // InternalRosSystemParser.g:4355:53: (iv_ruleArraySpecRef= ruleArraySpecRef EOF )
            // InternalRosSystemParser.g:4356:2: iv_ruleArraySpecRef= ruleArraySpecRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySpecRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArraySpecRef=ruleArraySpecRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySpecRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArraySpecRef"


    // $ANTLR start "ruleArraySpecRef"
    // InternalRosSystemParser.g:4362:1: ruleArraySpecRef returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) ;
    public final EObject ruleArraySpecRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4368:2: ( ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) )
            // InternalRosSystemParser.g:4369:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            {
            // InternalRosSystemParser.g:4369:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            // InternalRosSystemParser.g:4370:3: ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket
            {
            // InternalRosSystemParser.g:4370:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:4371:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:4371:4: ( ruleEString )
            // InternalRosSystemParser.g:4372:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getArraySpecRefRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,LeftSquareBracketRightSquareBracket,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArraySpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArraySpecRef"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalRosSystemParser.g:4394:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalRosSystemParser.g:4394:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalRosSystemParser.g:4395:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getKEYWORDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleKEYWORD.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalRosSystemParser.g:4401:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4407:2: ( (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) )
            // InternalRosSystemParser.g:4408:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            {
            // InternalRosSystemParser.g:4408:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            int alt38=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt38=1;
                }
                break;
            case Message:
                {
                alt38=2;
                }
                break;
            case Result:
                {
                alt38=3;
                }
                break;
            case Feedback:
                {
                alt38=4;
                }
                break;
            case Name:
                {
                alt38=5;
                }
                break;
            case Value:
                {
                alt38=6;
                }
                break;
            case Service:
                {
                alt38=7;
                }
                break;
            case Type:
                {
                alt38=8;
                }
                break;
            case Action:
                {
                alt38=9;
                }
                break;
            case Duration:
                {
                alt38=10;
                }
                break;
            case Time:
                {
                alt38=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalRosSystemParser.g:4409:3: kw= Goal
                    {
                    kw=(Token)match(input,Goal,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:4415:3: kw= Message
                    {
                    kw=(Token)match(input,Message,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:4421:3: kw= Result
                    {
                    kw=(Token)match(input,Result,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:4427:3: kw= Feedback
                    {
                    kw=(Token)match(input,Feedback,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:4433:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:4439:3: kw= Value
                    {
                    kw=(Token)match(input,Value,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:4445:3: kw= Service
                    {
                    kw=(Token)match(input,Service,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:4451:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalRosSystemParser.g:4457:3: kw= Action
                    {
                    kw=(Token)match(input,Action,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalRosSystemParser.g:4463:3: kw= Duration
                    {
                    kw=(Token)match(input,Duration,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalRosSystemParser.g:4469:3: kw= Time
                    {
                    kw=(Token)match(input,Time,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTimeKeyword_10());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "entryRuleEString"
    // InternalRosSystemParser.g:4478:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosSystemParser.g:4478:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosSystemParser.g:4479:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRosSystemParser.g:4485:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4491:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosSystemParser.g:4492:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosSystemParser.g:4492:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalRosSystemParser.g:4493:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:4501:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // $ANTLR start synpred1_InternalRosSystemParser
    public final void synpred1_InternalRosSystemParser_fragment() throws RecognitionException {   
        // InternalRosSystemParser.g:1064:4: ( ruleRosSystemConnection )
        // InternalRosSystemParser.g:1064:5: ruleRosSystemConnection
        {
        pushFollow(FOLLOW_2);
        ruleRosSystemConnection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalRosSystemParser

    // $ANTLR start synpred2_InternalRosSystemParser
    public final void synpred2_InternalRosSystemParser_fragment() throws RecognitionException {   
        // InternalRosSystemParser.g:1166:4: ( ruleRosTopicConnection )
        // InternalRosSystemParser.g:1166:5: ruleRosTopicConnection
        {
        pushFollow(FOLLOW_2);
        ruleRosTopicConnection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalRosSystemParser

    // $ANTLR start synpred3_InternalRosSystemParser
    public final void synpred3_InternalRosSystemParser_fragment() throws RecognitionException {   
        // InternalRosSystemParser.g:1178:4: ( ruleRosServiceConnection )
        // InternalRosSystemParser.g:1178:5: ruleRosServiceConnection
        {
        pushFollow(FOLLOW_2);
        ruleRosServiceConnection();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalRosSystemParser

    // Delegated rules

    public final boolean synpred1_InternalRosSystemParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalRosSystemParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalRosSystemParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalRosSystemParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalRosSystemParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalRosSystemParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\115\1\137\2\117\1\137\2\123\1\0\2\uffff";
    static final String dfa_3s = "\1\115\1\140\2\117\1\140\2\123\1\0\2\uffff";
    static final String dfa_4s = "\10\uffff\1\1\1\2";
    static final String dfa_5s = "\7\uffff\1\0\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\3\1\2",
            "\1\4",
            "\1\4",
            "\1\6\1\5",
            "\1\7",
            "\1\7",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1062:2: ( ( ( ruleRosSystemConnection )=>this_RosSystemConnection_0= ruleRosSystemConnection ) | this_RosConnection_1= ruleRosConnection )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_7 = input.LA(1);

                         
                        int index14_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalRosSystemParser()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index14_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\13\uffff";
    static final String dfa_8s = "\1\115\1\137\2\117\1\137\2\123\1\0\3\uffff";
    static final String dfa_9s = "\1\115\1\140\2\117\1\140\2\123\1\0\3\uffff";
    static final String dfa_10s = "\10\uffff\1\1\1\2\1\3";
    static final String dfa_11s = "\7\uffff\1\0\3\uffff}>";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\3\1\2",
            "\1\4",
            "\1\4",
            "\1\6\1\5",
            "\1\7",
            "\1\7",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1164:2: ( ( ( ruleRosTopicConnection )=>this_RosTopicConnection_0= ruleRosTopicConnection ) | ( ( ruleRosServiceConnection )=>this_RosServiceConnection_1= ruleRosServiceConnection ) | this_RosActionConnection_2= ruleRosActionConnection )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_7 = input.LA(1);

                         
                        int index15_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalRosSystemParser()) ) {s = 8;}

                        else if ( (synpred3_InternalRosSystemParser()) ) {s = 9;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index15_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\1\7\12\uffff";
    static final String dfa_14s = "\1\117\5\uffff\1\117\1\uffff\2\117\1\uffff";
    static final String dfa_15s = "\1\144\5\uffff\1\140\1\uffff\2\123\1\uffff";
    static final String dfa_16s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\2\uffff\1\6";
    static final String dfa_17s = "\13\uffff}>";
    static final String[] dfa_18s = {
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
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_7;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1813:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )";
        }
    }
    static final String dfa_19s = "\44\uffff";
    static final String dfa_20s = "\36\uffff\2\43\4\uffff";
    static final String dfa_21s = "\1\15\35\uffff\2\116\4\uffff";
    static final String dfa_22s = "\1\140\35\uffff\2\116\4\uffff";
    static final String dfa_23s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\40\1\41\1\37\1\36";
    static final String dfa_24s = "\44\uffff}>";
    static final String[] dfa_25s = {
            "\1\32\1\33\1\uffff\1\17\1\uffff\1\34\1\uffff\1\25\1\27\1\31\2\uffff\1\12\1\13\1\24\1\26\1\30\2\uffff\1\23\3\uffff\1\20\3\uffff\1\21\1\35\1\41\1\22\2\uffff\1\14\1\5\1\7\1\11\2\uffff\1\4\1\6\1\10\3\uffff\1\3\5\uffff\1\1\1\15\1\40\1\uffff\1\2\4\uffff\1\16\25\uffff\1\37\1\36",
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
            "\1\42",
            "\1\42",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_19;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "3091:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000100000000D00L,0x0000001000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000001180000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000001000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000100000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000180000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000088000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000600L,0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000001000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000400L,0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xC180000000000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000181E40000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000002L,0x0000000000040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x2000006C01800000L,0x0000000800000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008000L,0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});

}