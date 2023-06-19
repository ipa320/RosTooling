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

@SuppressWarnings("all")
public class InternalRosSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "ParameterAny", "Connections", "Interfaces", "Parameters", "Processes", "GraphName", "Float32_1", "Float64_1", "Default", "Duration", "Feedback", "FromPub", "FromSub", "String_2", "Threads", "Uint16_1", "Uint32_1", "Uint64_1", "Boolean", "Integer", "Float32", "Float64", "FromAC", "FromAS", "FromSC", "FromSS", "Int16_1", "Int32_1", "Int64_1", "Message", "Service", "Uint8_1", "Array", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Int8_1", "Nodes", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "From", "Int16", "Int32", "Int64", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Goal", "Int8", "Name", "Node", "Time", "Type", "Any", "Ns", "HyphenMinusLeftSquareBracket", "LeftSquareBracketRightSquareBracket", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Connections=8;
    public static final int Float32_1=13;
    public static final int Node=70;
    public static final int RULE_DATE_TIME=91;
    public static final int Uint64_1=24;
    public static final int String=43;
    public static final int Processes=11;
    public static final int Int16=57;
    public static final int Float32=27;
    public static final int Goal=67;
    public static final int Bool=65;
    public static final int FromPub=18;
    public static final int Uint16=52;
    public static final int Boolean=25;
    public static final int Uint8=61;
    public static final int Parameters=10;
    public static final int RULE_ID=92;
    public static final int RULE_DIGIT=81;
    public static final int GlobalNamespace=6;
    public static final int Int16_1=33;
    public static final int Header=42;
    public static final int RULE_INT=94;
    public static final int Byte=66;
    public static final int RULE_ML_COMMENT=101;
    public static final int LeftSquareBracket=79;
    public static final int Base64=40;
    public static final int FromSS=32;
    public static final int Comma=77;
    public static final int RULE_MESSAGE_ASIGMENT=95;
    public static final int LeftSquareBracketRightSquareBracket=76;
    public static final int Int32=58;
    public static final int RULE_DECINT=84;
    public static final int Uint32=53;
    public static final int RULE_HOUR=89;
    public static final int Int8=68;
    public static final int Default=15;
    public static final int Int8_1=48;
    public static final int Uint16_1=22;
    public static final int Type=72;
    public static final int Float64=28;
    public static final int Int32_1=34;
    public static final int FromSC=31;
    public static final int RULE_BINARY=82;
    public static final int String_1=51;
    public static final int String_2=20;
    public static final int FromAC=29;
    public static final int RULE_DAY=86;
    public static final int RULE_BEGIN=96;
    public static final int RULE_BOOLEAN=83;
    public static final int RelativeNamespace=4;
    public static final int RULE_YEAR=88;
    public static final int Result=50;
    public static final int Name=69;
    public static final int RULE_MIN_SEC=90;
    public static final int FromAS=30;
    public static final int ParameterAny=7;
    public static final int List=64;
    public static final int RightSquareBracket=80;
    public static final int PrivateNamespace=5;
    public static final int GraphName=12;
    public static final int Byte_1=47;
    public static final int Float64_1=14;
    public static final int Duration=16;
    public static final int Uint32_1=23;
    public static final int Double=41;
    public static final int Type_1=60;
    public static final int Value=62;
    public static final int Uint64=54;
    public static final int Action=45;
    public static final int RULE_END=97;
    public static final int Message=36;
    public static final int Value_1=55;
    public static final int Time=71;
    public static final int RULE_STRING=93;
    public static final int Bool_1=46;
    public static final int Any=73;
    public static final int Struct=44;
    public static final int RULE_SL_COMMENT=98;
    public static final int Uint8_1=38;
    public static final int RULE_DOUBLE=85;
    public static final int Feedback=17;
    public static final int RULE_ROS_CONVENTION_A=99;
    public static final int RULE_ROS_CONVENTION_PARAM=100;
    public static final int Colon=78;
    public static final int EOF=-1;
    public static final int FromSub=19;
    public static final int Ns=74;
    public static final int RULE_WS=102;
    public static final int HyphenMinusLeftSquareBracket=75;
    public static final int Int64_1=35;
    public static final int Service=37;
    public static final int From=56;
    public static final int RULE_ANY_OTHER=103;
    public static final int Nodes=49;
    public static final int Date=63;
    public static final int Interfaces=9;
    public static final int Threads=21;
    public static final int Integer=26;
    public static final int Array=39;
    public static final int Int64=59;
    public static final int RULE_MONTH=87;

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
             newCompositeNode(grammarAccess.getSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSystem=ruleSystem();

            state._fsp--;

             current =iv_ruleSystem; 
            match(input,EOF,FOLLOW_2); 

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

            		newCompositeNode(grammarAccess.getSystemAccess().getRosSystemParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_RosSystem_0=ruleRosSystem();

            state._fsp--;


            		current = this_RosSystem_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getRosSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSystem=ruleRosSystem();

            state._fsp--;

             current =iv_ruleRosSystem; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:89:1: ruleRosSystem returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleRosConnection ) )* this_END_18= RULE_END ) )* this_END_19= RULE_END ) ;
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
            // InternalRosSystemParser.g:95:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleRosConnection ) )* this_END_18= RULE_END ) )* this_END_19= RULE_END ) )
            // InternalRosSystemParser.g:96:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleRosConnection ) )* this_END_18= RULE_END ) )* this_END_19= RULE_END )
            {
            // InternalRosSystemParser.g:96:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleRosConnection ) )* this_END_18= RULE_END ) )* this_END_19= RULE_END )
            // InternalRosSystemParser.g:97:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleRosConnection ) )* this_END_18= RULE_END ) )* this_END_19= RULE_END
            {
            // InternalRosSystemParser.g:97:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystemParser.g:98:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:98:4: (lv_name_0_0= ruleEString )
            // InternalRosSystemParser.g:99:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


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

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRosSystemAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_5); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRosSystemParser.g:124:3: ( (otherlv_3= Processes this_BEGIN_4= RULE_BEGIN ( (lv_processes_5_0= ruleProcess ) )* this_END_6= RULE_END ) | (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END ) | (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END ) | (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleRosConnection ) )* this_END_18= RULE_END ) )*
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
            	    otherlv_3=(Token)match(input,Processes,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getRosSystemAccess().getProcessesKeyword_3_0_0());
            	    				
            	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            	    					newLeafNode(this_BEGIN_4, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_0_1());
            	    				
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

            	    	    							newCompositeNode(grammarAccess.getRosSystemAccess().getProcessesProcessParserRuleCall_3_0_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_processes_5_0=ruleProcess();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);

            	    this_END_6=(Token)match(input,RULE_END,FOLLOW_5); 

            	    					newLeafNode(this_END_6, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRosSystemParser.g:159:4: (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END )
            	    {
            	    // InternalRosSystemParser.g:159:4: (otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END )
            	    // InternalRosSystemParser.g:160:5: otherlv_7= Nodes this_BEGIN_8= RULE_BEGIN ( (lv_components_9_0= ruleRosNode ) )* this_END_10= RULE_END
            	    {
            	    otherlv_7=(Token)match(input,Nodes,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getRosSystemAccess().getNodesKeyword_3_1_0());
            	    				
            	    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            	    					newLeafNode(this_BEGIN_8, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_1_1());
            	    				
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

            	    	    							newCompositeNode(grammarAccess.getRosSystemAccess().getComponentsRosNodeParserRuleCall_3_1_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_components_9_0=ruleRosNode();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);

            	    this_END_10=(Token)match(input,RULE_END,FOLLOW_5); 

            	    					newLeafNode(this_END_10, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRosSystemParser.g:193:4: (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END )
            	    {
            	    // InternalRosSystemParser.g:193:4: (otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END )
            	    // InternalRosSystemParser.g:194:5: otherlv_11= Parameters this_BEGIN_12= RULE_BEGIN ( (lv_parameter_13_0= ruleRosParameter ) )* this_END_14= RULE_END
            	    {
            	    otherlv_11=(Token)match(input,Parameters,FOLLOW_4); 

            	    					newLeafNode(otherlv_11, grammarAccess.getRosSystemAccess().getParametersKeyword_3_2_0());
            	    				
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            	    					newLeafNode(this_BEGIN_12, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_2_1());
            	    				
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

            	    	    							newCompositeNode(grammarAccess.getRosSystemAccess().getParameterRosParameterParserRuleCall_3_2_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_parameter_13_0=ruleRosParameter();

            	    	    state._fsp--;


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
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    this_END_14=(Token)match(input,RULE_END,FOLLOW_5); 

            	    					newLeafNode(this_END_14, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_2_3());
            	    				

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRosSystemParser.g:227:4: (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleRosConnection ) )* this_END_18= RULE_END )
            	    {
            	    // InternalRosSystemParser.g:227:4: (otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleRosConnection ) )* this_END_18= RULE_END )
            	    // InternalRosSystemParser.g:228:5: otherlv_15= Connections this_BEGIN_16= RULE_BEGIN ( (lv_connections_17_0= ruleRosConnection ) )* this_END_18= RULE_END
            	    {
            	    otherlv_15=(Token)match(input,Connections,FOLLOW_4); 

            	    					newLeafNode(otherlv_15, grammarAccess.getRosSystemAccess().getConnectionsKeyword_3_3_0());
            	    				
            	    this_BEGIN_16=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    					newLeafNode(this_BEGIN_16, grammarAccess.getRosSystemAccess().getBEGINTerminalRuleCall_3_3_1());
            	    				
            	    // InternalRosSystemParser.g:236:5: ( (lv_connections_17_0= ruleRosConnection ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==HyphenMinusLeftSquareBracket) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalRosSystemParser.g:237:6: (lv_connections_17_0= ruleRosConnection )
            	    	    {
            	    	    // InternalRosSystemParser.g:237:6: (lv_connections_17_0= ruleRosConnection )
            	    	    // InternalRosSystemParser.g:238:7: lv_connections_17_0= ruleRosConnection
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getRosSystemAccess().getConnectionsRosConnectionParserRuleCall_3_3_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_connections_17_0=ruleRosConnection();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getRosSystemRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"connections",
            	    	    								lv_connections_17_0,
            	    	    								"de.fraunhofer.ipa.rossystem.RosSystem.RosConnection");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    this_END_18=(Token)match(input,RULE_END,FOLLOW_5); 

            	    					newLeafNode(this_END_18, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_3_3_3());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            this_END_19=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_19, grammarAccess.getRosSystemAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:276:1: ruleProcess returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) ) this_END_12= RULE_END ) ;
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
            // InternalRosSystemParser.g:282:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) ) this_END_12= RULE_END ) )
            // InternalRosSystemParser.g:283:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) ) this_END_12= RULE_END )
            {
            // InternalRosSystemParser.g:283:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) ) this_END_12= RULE_END )
            // InternalRosSystemParser.g:284:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Nodes otherlv_5= LeftSquareBracket ( ( ruleEString ) ) (otherlv_7= Comma ( ( ruleEString ) ) )* otherlv_9= RightSquareBracket )? (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) ) this_END_12= RULE_END
            {
            // InternalRosSystemParser.g:284:3: ()
            // InternalRosSystemParser.g:285:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProcessAccess().getProcessAction_0(),
            					current);
            			

            }

            // InternalRosSystemParser.g:291:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosSystemParser.g:292:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosSystemParser.g:292:4: (lv_name_1_0= ruleEString )
            // InternalRosSystemParser.g:293:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


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

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getProcessAccess().getBEGINTerminalRuleCall_3());
            		
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
                    otherlv_4=(Token)match(input,Nodes,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getProcessAccess().getNodesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,LeftSquareBracket,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getLeftSquareBracketKeyword_4_1());
                    			
                    // InternalRosSystemParser.g:327:4: ( ( ruleEString ) )
                    // InternalRosSystemParser.g:328:5: ( ruleEString )
                    {
                    // InternalRosSystemParser.g:328:5: ( ruleEString )
                    // InternalRosSystemParser.g:329:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcessRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getProcessAccess().getComponentsComponentCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

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
                    	    otherlv_7=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getProcessAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRosSystemParser.g:348:5: ( ( ruleEString ) )
                    	    // InternalRosSystemParser.g:349:6: ( ruleEString )
                    	    {
                    	    // InternalRosSystemParser.g:349:6: ( ruleEString )
                    	    // InternalRosSystemParser.g:350:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getProcessRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getProcessAccess().getComponentsComponentCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,RightSquareBracket,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getProcessAccess().getRightSquareBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRosSystemParser.g:370:3: (otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) ) )
            // InternalRosSystemParser.g:371:4: otherlv_10= Threads ( (lv_threads_11_0= ruleInteger0 ) )
            {
            otherlv_10=(Token)match(input,Threads,FOLLOW_13); 

            				newLeafNode(otherlv_10, grammarAccess.getProcessAccess().getThreadsKeyword_5_0());
            			
            // InternalRosSystemParser.g:375:4: ( (lv_threads_11_0= ruleInteger0 ) )
            // InternalRosSystemParser.g:376:5: (lv_threads_11_0= ruleInteger0 )
            {
            // InternalRosSystemParser.g:376:5: (lv_threads_11_0= ruleInteger0 )
            // InternalRosSystemParser.g:377:6: lv_threads_11_0= ruleInteger0
            {

            						newCompositeNode(grammarAccess.getProcessAccess().getThreadsInteger0ParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_14);
            lv_threads_11_0=ruleInteger0();

            state._fsp--;


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

            this_END_12=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_12, grammarAccess.getProcessAccess().getENDTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getRosNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosNode=ruleRosNode();

            state._fsp--;

             current =iv_ruleRosNode; 
            match(input,EOF,FOLLOW_2); 

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

            				current = forceCreateModelElement(
            					grammarAccess.getRosNodeAccess().getRosNodeAction_0(),
            					current);
            			

            }

            // InternalRosSystemParser.g:425:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosSystemParser.g:426:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosSystemParser.g:426:4: (lv_name_1_0= ruleEString )
            // InternalRosSystemParser.g:427:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosNodeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


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

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRosNodeAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,From,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getRosNodeAccess().getFromKeyword_4());
            		
            // InternalRosSystemParser.g:456:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:457:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:457:4: ( ruleEString )
            // InternalRosSystemParser.g:458:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosNodeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosNodeAccess().getFromNodeCrossReference_5_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosSystemParser.g:472:3: (otherlv_6= Interfaces this_BEGIN_7= RULE_BEGIN ( (lv_rosinterfaces_8_0= ruleRosInterface ) )* this_END_9= RULE_END )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Interfaces) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosSystemParser.g:473:4: otherlv_6= Interfaces this_BEGIN_7= RULE_BEGIN ( (lv_rosinterfaces_8_0= ruleRosInterface ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Interfaces,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRosNodeAccess().getInterfacesKeyword_6_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_6_1());
                    			
                    // InternalRosSystemParser.g:481:4: ( (lv_rosinterfaces_8_0= ruleRosInterface ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:482:5: (lv_rosinterfaces_8_0= ruleRosInterface )
                    	    {
                    	    // InternalRosSystemParser.g:482:5: (lv_rosinterfaces_8_0= ruleRosInterface )
                    	    // InternalRosSystemParser.g:483:6: lv_rosinterfaces_8_0= ruleRosInterface
                    	    {

                    	    						newCompositeNode(grammarAccess.getRosNodeAccess().getRosinterfacesRosInterfaceParserRuleCall_6_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_rosinterfaces_8_0=ruleRosInterface();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_17); 

                    				newLeafNode(this_END_9, grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_6_3());
                    			

                    }
                    break;

            }

            // InternalRosSystemParser.g:505:3: (otherlv_10= Parameters this_BEGIN_11= RULE_BEGIN ( (lv_rosparameters_12_0= ruleRosParameter ) )* this_END_13= RULE_END )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Parameters) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRosSystemParser.g:506:4: otherlv_10= Parameters this_BEGIN_11= RULE_BEGIN ( (lv_rosparameters_12_0= ruleRosParameter ) )* this_END_13= RULE_END
                    {
                    otherlv_10=(Token)match(input,Parameters,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getRosNodeAccess().getParametersKeyword_7_0());
                    			
                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

                    				newLeafNode(this_BEGIN_11, grammarAccess.getRosNodeAccess().getBEGINTerminalRuleCall_7_1());
                    			
                    // InternalRosSystemParser.g:514:4: ( (lv_rosparameters_12_0= ruleRosParameter ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:515:5: (lv_rosparameters_12_0= ruleRosParameter )
                    	    {
                    	    // InternalRosSystemParser.g:515:5: (lv_rosparameters_12_0= ruleRosParameter )
                    	    // InternalRosSystemParser.g:516:6: lv_rosparameters_12_0= ruleRosParameter
                    	    {

                    	    						newCompositeNode(grammarAccess.getRosNodeAccess().getRosparametersRosParameterParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_rosparameters_12_0=ruleRosParameter();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    this_END_13=(Token)match(input,RULE_END,FOLLOW_14); 

                    				newLeafNode(this_END_13, grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            this_END_14=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_14, grammarAccess.getRosNodeAccess().getENDTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

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
             newCompositeNode(grammarAccess.getRosInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosInterface=ruleRosInterface();

            state._fsp--;

             current =iv_ruleRosInterface; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:553:1: ruleRosInterface returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_reference_3_0= ruleInterfaceReference ) ) this_END_4= RULE_END ) ;
    public final EObject ruleRosInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_reference_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:559:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_reference_3_0= ruleInterfaceReference ) ) this_END_4= RULE_END ) )
            // InternalRosSystemParser.g:560:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_reference_3_0= ruleInterfaceReference ) ) this_END_4= RULE_END )
            {
            // InternalRosSystemParser.g:560:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_reference_3_0= ruleInterfaceReference ) ) this_END_4= RULE_END )
            // InternalRosSystemParser.g:561:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_reference_3_0= ruleInterfaceReference ) ) this_END_4= RULE_END
            {
            // InternalRosSystemParser.g:561:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystemParser.g:562:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:562:4: (lv_name_0_0= ruleEString )
            // InternalRosSystemParser.g:563:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosInterfaceAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRosInterfaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRosInterfaceAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getRosInterfaceAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRosSystemParser.g:588:3: ( (lv_reference_3_0= ruleInterfaceReference ) )
            // InternalRosSystemParser.g:589:4: (lv_reference_3_0= ruleInterfaceReference )
            {
            // InternalRosSystemParser.g:589:4: (lv_reference_3_0= ruleInterfaceReference )
            // InternalRosSystemParser.g:590:5: lv_reference_3_0= ruleInterfaceReference
            {

            					newCompositeNode(grammarAccess.getRosInterfaceAccess().getReferenceInterfaceReferenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_reference_3_0=ruleInterfaceReference();

            state._fsp--;


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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getRosInterfaceAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:615:1: entryRuleInterfaceReference returns [EObject current=null] : iv_ruleInterfaceReference= ruleInterfaceReference EOF ;
    public final EObject entryRuleInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceReference = null;


        try {
            // InternalRosSystemParser.g:615:59: (iv_ruleInterfaceReference= ruleInterfaceReference EOF )
            // InternalRosSystemParser.g:616:2: iv_ruleInterfaceReference= ruleInterfaceReference EOF
            {
             newCompositeNode(grammarAccess.getInterfaceReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceReference=ruleInterfaceReference();

            state._fsp--;

             current =iv_ruleInterfaceReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:622:1: ruleInterfaceReference returns [EObject current=null] : (this_InterfaceReference_Impl_0= ruleInterfaceReference_Impl | this_RosPublisherReference_1= ruleRosPublisherReference | this_RosSubscriberReference_2= ruleRosSubscriberReference | this_RosServiceServerReference_3= ruleRosServiceServerReference | this_RosServerClientReference_4= ruleRosServerClientReference | this_RosActionServerReference_5= ruleRosActionServerReference | this_RosActionClientReference_6= ruleRosActionClientReference ) ;
    public final EObject ruleInterfaceReference() throws RecognitionException {
        EObject current = null;

        EObject this_InterfaceReference_Impl_0 = null;

        EObject this_RosPublisherReference_1 = null;

        EObject this_RosSubscriberReference_2 = null;

        EObject this_RosServiceServerReference_3 = null;

        EObject this_RosServerClientReference_4 = null;

        EObject this_RosActionServerReference_5 = null;

        EObject this_RosActionClientReference_6 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:628:2: ( (this_InterfaceReference_Impl_0= ruleInterfaceReference_Impl | this_RosPublisherReference_1= ruleRosPublisherReference | this_RosSubscriberReference_2= ruleRosSubscriberReference | this_RosServiceServerReference_3= ruleRosServiceServerReference | this_RosServerClientReference_4= ruleRosServerClientReference | this_RosActionServerReference_5= ruleRosActionServerReference | this_RosActionClientReference_6= ruleRosActionClientReference ) )
            // InternalRosSystemParser.g:629:2: (this_InterfaceReference_Impl_0= ruleInterfaceReference_Impl | this_RosPublisherReference_1= ruleRosPublisherReference | this_RosSubscriberReference_2= ruleRosSubscriberReference | this_RosServiceServerReference_3= ruleRosServiceServerReference | this_RosServerClientReference_4= ruleRosServerClientReference | this_RosActionServerReference_5= ruleRosActionServerReference | this_RosActionClientReference_6= ruleRosActionClientReference )
            {
            // InternalRosSystemParser.g:629:2: (this_InterfaceReference_Impl_0= ruleInterfaceReference_Impl | this_RosPublisherReference_1= ruleRosPublisherReference | this_RosSubscriberReference_2= ruleRosSubscriberReference | this_RosServiceServerReference_3= ruleRosServiceServerReference | this_RosServerClientReference_4= ruleRosServerClientReference | this_RosActionServerReference_5= ruleRosActionServerReference | this_RosActionClientReference_6= ruleRosActionClientReference )
            int alt12=7;
            switch ( input.LA(1) ) {
            case EOF:
            case RULE_END:
                {
                alt12=1;
                }
                break;
            case FromPub:
                {
                alt12=2;
                }
                break;
            case FromSub:
                {
                alt12=3;
                }
                break;
            case FromSS:
                {
                alt12=4;
                }
                break;
            case FromSC:
                {
                alt12=5;
                }
                break;
            case FromAS:
                {
                alt12=6;
                }
                break;
            case FromAC:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRosSystemParser.g:630:3: this_InterfaceReference_Impl_0= ruleInterfaceReference_Impl
                    {

                    			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getInterfaceReference_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_InterfaceReference_Impl_0=ruleInterfaceReference_Impl();

                    state._fsp--;


                    			current = this_InterfaceReference_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:639:3: this_RosPublisherReference_1= ruleRosPublisherReference
                    {

                    			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosPublisherReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosPublisherReference_1=ruleRosPublisherReference();

                    state._fsp--;


                    			current = this_RosPublisherReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:648:3: this_RosSubscriberReference_2= ruleRosSubscriberReference
                    {

                    			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosSubscriberReferenceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosSubscriberReference_2=ruleRosSubscriberReference();

                    state._fsp--;


                    			current = this_RosSubscriberReference_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:657:3: this_RosServiceServerReference_3= ruleRosServiceServerReference
                    {

                    			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosServiceServerReferenceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosServiceServerReference_3=ruleRosServiceServerReference();

                    state._fsp--;


                    			current = this_RosServiceServerReference_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:666:3: this_RosServerClientReference_4= ruleRosServerClientReference
                    {

                    			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosServerClientReferenceParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosServerClientReference_4=ruleRosServerClientReference();

                    state._fsp--;


                    			current = this_RosServerClientReference_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:675:3: this_RosActionServerReference_5= ruleRosActionServerReference
                    {

                    			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosActionServerReferenceParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosActionServerReference_5=ruleRosActionServerReference();

                    state._fsp--;


                    			current = this_RosActionServerReference_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:684:3: this_RosActionClientReference_6= ruleRosActionClientReference
                    {

                    			newCompositeNode(grammarAccess.getInterfaceReferenceAccess().getRosActionClientReferenceParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RosActionClientReference_6=ruleRosActionClientReference();

                    state._fsp--;


                    			current = this_RosActionClientReference_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleInterfaceReference_Impl"
    // InternalRosSystemParser.g:696:1: entryRuleInterfaceReference_Impl returns [EObject current=null] : iv_ruleInterfaceReference_Impl= ruleInterfaceReference_Impl EOF ;
    public final EObject entryRuleInterfaceReference_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceReference_Impl = null;


        try {
            // InternalRosSystemParser.g:696:64: (iv_ruleInterfaceReference_Impl= ruleInterfaceReference_Impl EOF )
            // InternalRosSystemParser.g:697:2: iv_ruleInterfaceReference_Impl= ruleInterfaceReference_Impl EOF
            {
             newCompositeNode(grammarAccess.getInterfaceReference_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInterfaceReference_Impl=ruleInterfaceReference_Impl();

            state._fsp--;

             current =iv_ruleInterfaceReference_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInterfaceReference_Impl"


    // $ANTLR start "ruleInterfaceReference_Impl"
    // InternalRosSystemParser.g:703:1: ruleInterfaceReference_Impl returns [EObject current=null] : () ;
    public final EObject ruleInterfaceReference_Impl() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:709:2: ( () )
            // InternalRosSystemParser.g:710:2: ()
            {
            // InternalRosSystemParser.g:710:2: ()
            // InternalRosSystemParser.g:711:3: 
            {

            			current = forceCreateModelElement(
            				grammarAccess.getInterfaceReference_ImplAccess().getInterfaceReferenceAction(),
            				current);
            		

            }


            }


            	leaveRule();

        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceReference_Impl"


    // $ANTLR start "entryRuleRosPublisherReference"
    // InternalRosSystemParser.g:720:1: entryRuleRosPublisherReference returns [EObject current=null] : iv_ruleRosPublisherReference= ruleRosPublisherReference EOF ;
    public final EObject entryRuleRosPublisherReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosPublisherReference = null;


        try {
            // InternalRosSystemParser.g:720:62: (iv_ruleRosPublisherReference= ruleRosPublisherReference EOF )
            // InternalRosSystemParser.g:721:2: iv_ruleRosPublisherReference= ruleRosPublisherReference EOF
            {
             newCompositeNode(grammarAccess.getRosPublisherReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosPublisherReference=ruleRosPublisherReference();

            state._fsp--;

             current =iv_ruleRosPublisherReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:727:1: ruleRosPublisherReference returns [EObject current=null] : (otherlv_0= FromPub ( ( ruleEString ) ) ) ;
    public final EObject ruleRosPublisherReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:733:2: ( (otherlv_0= FromPub ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:734:2: (otherlv_0= FromPub ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:734:2: (otherlv_0= FromPub ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:735:3: otherlv_0= FromPub ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,FromPub,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRosPublisherReferenceAccess().getFromPubKeyword_0());
            		
            // InternalRosSystemParser.g:739:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:740:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:740:4: ( ruleEString )
            // InternalRosSystemParser.g:741:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosPublisherReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosPublisherReferenceAccess().getFromPublisherCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:759:1: entryRuleRosSubscriberReference returns [EObject current=null] : iv_ruleRosSubscriberReference= ruleRosSubscriberReference EOF ;
    public final EObject entryRuleRosSubscriberReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosSubscriberReference = null;


        try {
            // InternalRosSystemParser.g:759:63: (iv_ruleRosSubscriberReference= ruleRosSubscriberReference EOF )
            // InternalRosSystemParser.g:760:2: iv_ruleRosSubscriberReference= ruleRosSubscriberReference EOF
            {
             newCompositeNode(grammarAccess.getRosSubscriberReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosSubscriberReference=ruleRosSubscriberReference();

            state._fsp--;

             current =iv_ruleRosSubscriberReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:766:1: ruleRosSubscriberReference returns [EObject current=null] : (otherlv_0= FromSub ( ( ruleEString ) ) ) ;
    public final EObject ruleRosSubscriberReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:772:2: ( (otherlv_0= FromSub ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:773:2: (otherlv_0= FromSub ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:773:2: (otherlv_0= FromSub ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:774:3: otherlv_0= FromSub ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,FromSub,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRosSubscriberReferenceAccess().getFromSubKeyword_0());
            		
            // InternalRosSystemParser.g:778:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:779:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:779:4: ( ruleEString )
            // InternalRosSystemParser.g:780:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosSubscriberReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosSubscriberReferenceAccess().getFromSubscriberCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:798:1: entryRuleRosServiceServerReference returns [EObject current=null] : iv_ruleRosServiceServerReference= ruleRosServiceServerReference EOF ;
    public final EObject entryRuleRosServiceServerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServiceServerReference = null;


        try {
            // InternalRosSystemParser.g:798:66: (iv_ruleRosServiceServerReference= ruleRosServiceServerReference EOF )
            // InternalRosSystemParser.g:799:2: iv_ruleRosServiceServerReference= ruleRosServiceServerReference EOF
            {
             newCompositeNode(grammarAccess.getRosServiceServerReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosServiceServerReference=ruleRosServiceServerReference();

            state._fsp--;

             current =iv_ruleRosServiceServerReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:805:1: ruleRosServiceServerReference returns [EObject current=null] : (otherlv_0= FromSS ( ( ruleEString ) ) ) ;
    public final EObject ruleRosServiceServerReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:811:2: ( (otherlv_0= FromSS ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:812:2: (otherlv_0= FromSS ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:812:2: (otherlv_0= FromSS ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:813:3: otherlv_0= FromSS ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,FromSS,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRosServiceServerReferenceAccess().getFromSSKeyword_0());
            		
            // InternalRosSystemParser.g:817:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:818:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:818:4: ( ruleEString )
            // InternalRosSystemParser.g:819:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServiceServerReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServiceServerReferenceAccess().getFromServiceServerCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:837:1: entryRuleRosServerClientReference returns [EObject current=null] : iv_ruleRosServerClientReference= ruleRosServerClientReference EOF ;
    public final EObject entryRuleRosServerClientReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosServerClientReference = null;


        try {
            // InternalRosSystemParser.g:837:65: (iv_ruleRosServerClientReference= ruleRosServerClientReference EOF )
            // InternalRosSystemParser.g:838:2: iv_ruleRosServerClientReference= ruleRosServerClientReference EOF
            {
             newCompositeNode(grammarAccess.getRosServerClientReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosServerClientReference=ruleRosServerClientReference();

            state._fsp--;

             current =iv_ruleRosServerClientReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:844:1: ruleRosServerClientReference returns [EObject current=null] : (otherlv_0= FromSC ( ( ruleEString ) ) ) ;
    public final EObject ruleRosServerClientReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:850:2: ( (otherlv_0= FromSC ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:851:2: (otherlv_0= FromSC ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:851:2: (otherlv_0= FromSC ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:852:3: otherlv_0= FromSC ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,FromSC,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRosServerClientReferenceAccess().getFromSCKeyword_0());
            		
            // InternalRosSystemParser.g:856:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:857:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:857:4: ( ruleEString )
            // InternalRosSystemParser.g:858:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosServerClientReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosServerClientReferenceAccess().getFromServiceClientCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:876:1: entryRuleRosActionServerReference returns [EObject current=null] : iv_ruleRosActionServerReference= ruleRosActionServerReference EOF ;
    public final EObject entryRuleRosActionServerReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionServerReference = null;


        try {
            // InternalRosSystemParser.g:876:65: (iv_ruleRosActionServerReference= ruleRosActionServerReference EOF )
            // InternalRosSystemParser.g:877:2: iv_ruleRosActionServerReference= ruleRosActionServerReference EOF
            {
             newCompositeNode(grammarAccess.getRosActionServerReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosActionServerReference=ruleRosActionServerReference();

            state._fsp--;

             current =iv_ruleRosActionServerReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:883:1: ruleRosActionServerReference returns [EObject current=null] : (otherlv_0= FromAS ( ( ruleEString ) ) ) ;
    public final EObject ruleRosActionServerReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:889:2: ( (otherlv_0= FromAS ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:890:2: (otherlv_0= FromAS ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:890:2: (otherlv_0= FromAS ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:891:3: otherlv_0= FromAS ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,FromAS,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRosActionServerReferenceAccess().getFromASKeyword_0());
            		
            // InternalRosSystemParser.g:895:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:896:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:896:4: ( ruleEString )
            // InternalRosSystemParser.g:897:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionServerReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionServerReferenceAccess().getFromActionServerCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:915:1: entryRuleRosActionClientReference returns [EObject current=null] : iv_ruleRosActionClientReference= ruleRosActionClientReference EOF ;
    public final EObject entryRuleRosActionClientReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosActionClientReference = null;


        try {
            // InternalRosSystemParser.g:915:65: (iv_ruleRosActionClientReference= ruleRosActionClientReference EOF )
            // InternalRosSystemParser.g:916:2: iv_ruleRosActionClientReference= ruleRosActionClientReference EOF
            {
             newCompositeNode(grammarAccess.getRosActionClientReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosActionClientReference=ruleRosActionClientReference();

            state._fsp--;

             current =iv_ruleRosActionClientReference; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:922:1: ruleRosActionClientReference returns [EObject current=null] : (otherlv_0= FromAC ( ( ruleEString ) ) ) ;
    public final EObject ruleRosActionClientReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:928:2: ( (otherlv_0= FromAC ( ( ruleEString ) ) ) )
            // InternalRosSystemParser.g:929:2: (otherlv_0= FromAC ( ( ruleEString ) ) )
            {
            // InternalRosSystemParser.g:929:2: (otherlv_0= FromAC ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:930:3: otherlv_0= FromAC ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,FromAC,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRosActionClientReferenceAccess().getFromACKeyword_0());
            		
            // InternalRosSystemParser.g:934:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:935:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:935:4: ( ruleEString )
            // InternalRosSystemParser.g:936:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosActionClientReferenceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosActionClientReferenceAccess().getFromActionClientCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:954:1: entryRuleRosParameter returns [EObject current=null] : iv_ruleRosParameter= ruleRosParameter EOF ;
    public final EObject entryRuleRosParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosParameter = null;


        try {
            // InternalRosSystemParser.g:954:53: (iv_ruleRosParameter= ruleRosParameter EOF )
            // InternalRosSystemParser.g:955:2: iv_ruleRosParameter= ruleRosParameter EOF
            {
             newCompositeNode(grammarAccess.getRosParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosParameter=ruleRosParameter();

            state._fsp--;

             current =iv_ruleRosParameter; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:961:1: ruleRosParameter returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( ( ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Value_1 ( (lv_value_5_0= ruleParameterValue ) ) this_END_6= RULE_END ) ;
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
            // InternalRosSystemParser.g:967:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( ( ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Value_1 ( (lv_value_5_0= ruleParameterValue ) ) this_END_6= RULE_END ) )
            // InternalRosSystemParser.g:968:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( ( ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Value_1 ( (lv_value_5_0= ruleParameterValue ) ) this_END_6= RULE_END )
            {
            // InternalRosSystemParser.g:968:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( ( ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Value_1 ( (lv_value_5_0= ruleParameterValue ) ) this_END_6= RULE_END )
            // InternalRosSystemParser.g:969:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( ( ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Value_1 ( (lv_value_5_0= ruleParameterValue ) ) this_END_6= RULE_END
            {
            // InternalRosSystemParser.g:969:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystemParser.g:970:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:970:4: (lv_name_0_0= ruleEString )
            // InternalRosSystemParser.g:971:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRosParameterAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


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

            otherlv_1=(Token)match(input,Colon,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getRosParameterAccess().getColonKeyword_1());
            		
            // InternalRosSystemParser.g:992:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:993:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:993:4: ( ruleEString )
            // InternalRosSystemParser.g:994:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosParameterRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosParameterAccess().getFromParameterCrossReference_2_0());
            				
            pushFollow(FOLLOW_4);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_19); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getRosParameterAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Value_1,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getRosParameterAccess().getValueKeyword_4());
            		
            // InternalRosSystemParser.g:1016:3: ( (lv_value_5_0= ruleParameterValue ) )
            // InternalRosSystemParser.g:1017:4: (lv_value_5_0= ruleParameterValue )
            {
            // InternalRosSystemParser.g:1017:4: (lv_value_5_0= ruleParameterValue )
            // InternalRosSystemParser.g:1018:5: lv_value_5_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getRosParameterAccess().getValueParameterValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_value_5_0=ruleParameterValue();

            state._fsp--;


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

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getRosParameterAccess().getENDTerminalRuleCall_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleRosConnection"
    // InternalRosSystemParser.g:1043:1: entryRuleRosConnection returns [EObject current=null] : iv_ruleRosConnection= ruleRosConnection EOF ;
    public final EObject entryRuleRosConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRosConnection = null;


        try {
            // InternalRosSystemParser.g:1043:54: (iv_ruleRosConnection= ruleRosConnection EOF )
            // InternalRosSystemParser.g:1044:2: iv_ruleRosConnection= ruleRosConnection EOF
            {
             newCompositeNode(grammarAccess.getRosConnectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosConnection=ruleRosConnection();

            state._fsp--;

             current =iv_ruleRosConnection; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1050:1: ruleRosConnection returns [EObject current=null] : (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket ) ;
    public final EObject ruleRosConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:1056:2: ( (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket ) )
            // InternalRosSystemParser.g:1057:2: (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket )
            {
            // InternalRosSystemParser.g:1057:2: (otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket )
            // InternalRosSystemParser.g:1058:3: otherlv_0= HyphenMinusLeftSquareBracket ( ( ruleEString ) ) otherlv_2= Comma ( ( ruleEString ) ) otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,HyphenMinusLeftSquareBracket,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRosConnectionAccess().getHyphenMinusLeftSquareBracketKeyword_0());
            		
            // InternalRosSystemParser.g:1062:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:1063:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:1063:4: ( ruleEString )
            // InternalRosSystemParser.g:1064:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosConnectionAccess().getFromRosInterfaceCrossReference_1_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Comma,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRosConnectionAccess().getCommaKeyword_2());
            		
            // InternalRosSystemParser.g:1082:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:1083:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:1083:4: ( ruleEString )
            // InternalRosSystemParser.g:1084:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRosConnectionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRosConnectionAccess().getToRosInterfaceCrossReference_3_0());
            				
            pushFollow(FOLLOW_22);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRosConnectionAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleNamespace"
    // InternalRosSystemParser.g:1106:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRosSystemParser.g:1106:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRosSystemParser.g:1107:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1113:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1119:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRosSystemParser.g:1120:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRosSystemParser.g:1120:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt13=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt13=1;
                }
                break;
            case RelativeNamespace:
                {
                alt13=2;
                }
                break;
            case PrivateNamespace:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRosSystemParser.g:1121:3: this_GlobalNamespace_0= ruleGlobalNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalNamespace_0=ruleGlobalNamespace();

                    state._fsp--;


                    			current = this_GlobalNamespace_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:1130:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeNamespace_Impl_1=ruleRelativeNamespace_Impl();

                    state._fsp--;


                    			current = this_RelativeNamespace_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:1139:3: this_PrivateNamespace_2= rulePrivateNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrivateNamespace_2=rulePrivateNamespace();

                    state._fsp--;


                    			current = this_PrivateNamespace_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1151:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRosSystemParser.g:1151:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRosSystemParser.g:1152:2: iv_ruleGraphName= ruleGraphName EOF
            {
             newCompositeNode(grammarAccess.getGraphNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphName=ruleGraphName();

            state._fsp--;

             current =iv_ruleGraphName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1158:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= GraphName ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:1164:2: (kw= GraphName )
            // InternalRosSystemParser.g:1165:2: kw= GraphName
            {
            kw=(Token)match(input,GraphName,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGraphNameAccess().getGraphNameKeyword());
            	

            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1173:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRosSystemParser.g:1173:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRosSystemParser.g:1174:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
            {
             newCompositeNode(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalNamespace=ruleGlobalNamespace();

            state._fsp--;

             current =iv_ruleGlobalNamespace; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1180:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRosSystemParser.g:1186:2: ( ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRosSystemParser.g:1187:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRosSystemParser.g:1187:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRosSystemParser.g:1188:3: () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRosSystemParser.g:1188:3: ()
            // InternalRosSystemParser.g:1189:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,GlobalNamespace,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            // InternalRosSystemParser.g:1199:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==LeftSquareBracket) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosSystemParser.g:1200:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRosSystemParser.g:1204:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRosSystemParser.g:1205:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRosSystemParser.g:1205:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRosSystemParser.g:1206:6: lv_parts_3_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;


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

                    // InternalRosSystemParser.g:1223:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==Comma) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:1224:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_24); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRosSystemParser.g:1228:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRosSystemParser.g:1229:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystemParser.g:1229:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRosSystemParser.g:1230:7: lv_parts_5_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1257:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRosSystemParser.g:1257:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRosSystemParser.g:1258:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeNamespace_Impl=ruleRelativeNamespace_Impl();

            state._fsp--;

             current =iv_ruleRelativeNamespace_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1264:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRosSystemParser.g:1270:2: ( ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRosSystemParser.g:1271:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRosSystemParser.g:1271:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRosSystemParser.g:1272:3: () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRosSystemParser.g:1272:3: ()
            // InternalRosSystemParser.g:1273:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,RelativeNamespace,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            // InternalRosSystemParser.g:1283:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LeftSquareBracket) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRosSystemParser.g:1284:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRosSystemParser.g:1288:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRosSystemParser.g:1289:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRosSystemParser.g:1289:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRosSystemParser.g:1290:6: lv_parts_3_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;


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

                    // InternalRosSystemParser.g:1307:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==Comma) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:1308:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_24); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRosSystemParser.g:1312:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRosSystemParser.g:1313:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystemParser.g:1313:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRosSystemParser.g:1314:7: lv_parts_5_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1341:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRosSystemParser.g:1341:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRosSystemParser.g:1342:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
            {
             newCompositeNode(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivateNamespace=rulePrivateNamespace();

            state._fsp--;

             current =iv_rulePrivateNamespace; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1348:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRosSystemParser.g:1354:2: ( ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRosSystemParser.g:1355:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRosSystemParser.g:1355:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRosSystemParser.g:1356:3: () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRosSystemParser.g:1356:3: ()
            // InternalRosSystemParser.g:1357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,PrivateNamespace,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            // InternalRosSystemParser.g:1367:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftSquareBracket) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRosSystemParser.g:1368:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_24); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRosSystemParser.g:1372:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRosSystemParser.g:1373:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRosSystemParser.g:1373:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRosSystemParser.g:1374:6: lv_parts_3_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;


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

                    // InternalRosSystemParser.g:1391:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:1392:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_24); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRosSystemParser.g:1396:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRosSystemParser.g:1397:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRosSystemParser.g:1397:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRosSystemParser.g:1398:7: lv_parts_5_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;


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
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1425:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRosSystemParser.g:1425:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRosSystemParser.g:1426:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1432:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
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
            // InternalRosSystemParser.g:1438:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalRosSystemParser.g:1439:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalRosSystemParser.g:1439:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt20=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt20=1;
                }
                break;
            case Struct:
                {
                alt20=2;
                }
                break;
            case Integer:
                {
                alt20=3;
                }
                break;
            case String:
                {
                alt20=4;
                }
                break;
            case Double:
                {
                alt20=5;
                }
                break;
            case Boolean:
                {
                alt20=6;
                }
                break;
            case Base64:
                {
                alt20=7;
                }
                break;
            case RULE_BEGIN:
                {
                alt20=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalRosSystemParser.g:1440:3: this_ParameterListType_0= ruleParameterListType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterListType_0=ruleParameterListType();

                    state._fsp--;


                    			current = this_ParameterListType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:1449:3: this_ParameterStructType_1= ruleParameterStructType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStructType_1=ruleParameterStructType();

                    state._fsp--;


                    			current = this_ParameterStructType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:1458:3: this_ParameterIntegerType_2= ruleParameterIntegerType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterIntegerType_2=ruleParameterIntegerType();

                    state._fsp--;


                    			current = this_ParameterIntegerType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:1467:3: this_ParameterStringType_3= ruleParameterStringType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStringType_3=ruleParameterStringType();

                    state._fsp--;


                    			current = this_ParameterStringType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:1476:3: this_ParameterDoubleType_4= ruleParameterDoubleType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDoubleType_4=ruleParameterDoubleType();

                    state._fsp--;


                    			current = this_ParameterDoubleType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:1485:3: this_ParameterBooleanType_5= ruleParameterBooleanType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBooleanType_5=ruleParameterBooleanType();

                    state._fsp--;


                    			current = this_ParameterBooleanType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:1494:3: this_ParameterBase64Type_6= ruleParameterBase64Type
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64Type_6=ruleParameterBase64Type();

                    state._fsp--;


                    			current = this_ParameterBase64Type_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:1503:3: this_ParameterArrayType_7= ruleParameterArrayType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterArrayType_7=ruleParameterArrayType();

                    state._fsp--;


                    			current = this_ParameterArrayType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1515:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRosSystemParser.g:1515:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRosSystemParser.g:1516:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1522:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
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
            // InternalRosSystemParser.g:1528:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalRosSystemParser.g:1529:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalRosSystemParser.g:1529:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt21=7;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalRosSystemParser.g:1530:3: this_ParameterString_0= ruleParameterString
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterString_0=ruleParameterString();

                    state._fsp--;


                    			current = this_ParameterString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:1539:3: this_ParameterBase64_1= ruleParameterBase64
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64_1=ruleParameterBase64();

                    state._fsp--;


                    			current = this_ParameterBase64_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:1548:3: this_ParameterInteger_2= ruleParameterInteger
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterInteger_2=ruleParameterInteger();

                    state._fsp--;


                    			current = this_ParameterInteger_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:1557:3: this_ParameterDouble_3= ruleParameterDouble
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDouble_3=ruleParameterDouble();

                    state._fsp--;


                    			current = this_ParameterDouble_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:1566:3: this_ParameterBoolean_4= ruleParameterBoolean
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBoolean_4=ruleParameterBoolean();

                    state._fsp--;


                    			current = this_ParameterBoolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:1575:3: this_ParameterList_5= ruleParameterList
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterList_5=ruleParameterList();

                    state._fsp--;


                    			current = this_ParameterList_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:1584:3: this_ParameterStruct_6= ruleParameterStruct
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStruct_6=ruleParameterStruct();

                    state._fsp--;


                    			current = this_ParameterStruct_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1596:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRosSystemParser.g:1596:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRosSystemParser.g:1597:2: iv_ruleParameterListType= ruleParameterListType EOF
            {
             newCompositeNode(grammarAccess.getParameterListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterListType=ruleParameterListType();

            state._fsp--;

             current =iv_ruleParameterListType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1603:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) ;
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
            // InternalRosSystemParser.g:1609:2: ( ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRosSystemParser.g:1610:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRosSystemParser.g:1610:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            // InternalRosSystemParser.g:1611:3: () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRosSystemParser.g:1611:3: ()
            // InternalRosSystemParser.g:1612:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,List,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalRosSystemParser.g:1626:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalRosSystemParser.g:1627:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalRosSystemParser.g:1627:4: (lv_sequence_3_0= ruleParameterType )
            // InternalRosSystemParser.g:1628:5: lv_sequence_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_sequence_3_0=ruleParameterType();

            state._fsp--;


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

            // InternalRosSystemParser.g:1645:3: (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==Comma) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRosSystemParser.g:1646:4: otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_25); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRosSystemParser.g:1650:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalRosSystemParser.g:1651:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalRosSystemParser.g:1651:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalRosSystemParser.g:1652:6: lv_sequence_5_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_sequence_5_0=ruleParameterType();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1678:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRosSystemParser.g:1678:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRosSystemParser.g:1679:2: iv_ruleParameterStructType= ruleParameterStructType EOF
            {
             newCompositeNode(grammarAccess.getParameterStructTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructType=ruleParameterStructType();

            state._fsp--;

             current =iv_ruleParameterStructType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1685:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) ;
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
            // InternalRosSystemParser.g:1691:2: ( ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRosSystemParser.g:1692:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRosSystemParser.g:1692:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            // InternalRosSystemParser.g:1693:3: () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRosSystemParser.g:1693:3: ()
            // InternalRosSystemParser.g:1694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Struct,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalRosSystemParser.g:1708:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalRosSystemParser.g:1709:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalRosSystemParser.g:1709:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalRosSystemParser.g:1710:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_parameterstructypetmember_3_0=ruleParameterStructTypeMember();

            state._fsp--;


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

            // InternalRosSystemParser.g:1727:3: (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==Comma) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRosSystemParser.g:1728:4: otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_10); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRosSystemParser.g:1732:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalRosSystemParser.g:1733:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalRosSystemParser.g:1733:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalRosSystemParser.g:1734:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
            	    {

            	    						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_parameterstructypetmember_5_0=ruleParameterStructTypeMember();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1760:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRosSystemParser.g:1760:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRosSystemParser.g:1761:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
            {
             newCompositeNode(grammarAccess.getParameterIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterIntegerType=ruleParameterIntegerType();

            state._fsp--;

             current =iv_ruleParameterIntegerType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1767:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1773:2: ( ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) )
            // InternalRosSystemParser.g:1774:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            {
            // InternalRosSystemParser.g:1774:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            // InternalRosSystemParser.g:1775:3: () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            {
            // InternalRosSystemParser.g:1775:3: ()
            // InternalRosSystemParser.g:1776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Integer,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
            		
            // InternalRosSystemParser.g:1786:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Default) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==RULE_DECINT) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // InternalRosSystemParser.g:1787:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRosSystemParser.g:1791:4: ( (lv_default_3_0= ruleParameterInteger ) )
                    // InternalRosSystemParser.g:1792:5: (lv_default_3_0= ruleParameterInteger )
                    {
                    // InternalRosSystemParser.g:1792:5: (lv_default_3_0= ruleParameterInteger )
                    // InternalRosSystemParser.g:1793:6: lv_default_3_0= ruleParameterInteger
                    {

                    						newCompositeNode(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterInteger();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1815:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRosSystemParser.g:1815:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRosSystemParser.g:1816:2: iv_ruleParameterStringType= ruleParameterStringType EOF
            {
             newCompositeNode(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStringType=ruleParameterStringType();

            state._fsp--;

             current =iv_ruleParameterStringType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1822:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1828:2: ( ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) )
            // InternalRosSystemParser.g:1829:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            {
            // InternalRosSystemParser.g:1829:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            // InternalRosSystemParser.g:1830:3: () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            {
            // InternalRosSystemParser.g:1830:3: ()
            // InternalRosSystemParser.g:1831:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            		
            // InternalRosSystemParser.g:1841:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Default) ) {
                int LA25_1 = input.LA(2);

                if ( ((LA25_1>=RULE_ID && LA25_1<=RULE_STRING)) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalRosSystemParser.g:1842:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRosSystemParser.g:1846:4: ( (lv_default_3_0= ruleParameterString ) )
                    // InternalRosSystemParser.g:1847:5: (lv_default_3_0= ruleParameterString )
                    {
                    // InternalRosSystemParser.g:1847:5: (lv_default_3_0= ruleParameterString )
                    // InternalRosSystemParser.g:1848:6: lv_default_3_0= ruleParameterString
                    {

                    						newCompositeNode(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterString();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1870:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRosSystemParser.g:1870:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRosSystemParser.g:1871:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
            {
             newCompositeNode(grammarAccess.getParameterDoubleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDoubleType=ruleParameterDoubleType();

            state._fsp--;

             current =iv_ruleParameterDoubleType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1877:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1883:2: ( ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) )
            // InternalRosSystemParser.g:1884:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            {
            // InternalRosSystemParser.g:1884:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            // InternalRosSystemParser.g:1885:3: () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            {
            // InternalRosSystemParser.g:1885:3: ()
            // InternalRosSystemParser.g:1886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Double,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
            		
            // InternalRosSystemParser.g:1896:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Default) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==RULE_DOUBLE) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // InternalRosSystemParser.g:1897:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRosSystemParser.g:1901:4: ( (lv_default_3_0= ruleParameterDouble ) )
                    // InternalRosSystemParser.g:1902:5: (lv_default_3_0= ruleParameterDouble )
                    {
                    // InternalRosSystemParser.g:1902:5: (lv_default_3_0= ruleParameterDouble )
                    // InternalRosSystemParser.g:1903:6: lv_default_3_0= ruleParameterDouble
                    {

                    						newCompositeNode(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterDouble();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1925:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRosSystemParser.g:1925:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRosSystemParser.g:1926:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
            {
             newCompositeNode(grammarAccess.getParameterBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBooleanType=ruleParameterBooleanType();

            state._fsp--;

             current =iv_ruleParameterBooleanType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1932:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1938:2: ( ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) )
            // InternalRosSystemParser.g:1939:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            {
            // InternalRosSystemParser.g:1939:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            // InternalRosSystemParser.g:1940:3: () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            {
            // InternalRosSystemParser.g:1940:3: ()
            // InternalRosSystemParser.g:1941:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Boolean,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
            		
            // InternalRosSystemParser.g:1951:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Default) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==RULE_BOOLEAN) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalRosSystemParser.g:1952:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRosSystemParser.g:1956:4: ( (lv_default_3_0= ruleParameterBoolean ) )
                    // InternalRosSystemParser.g:1957:5: (lv_default_3_0= ruleParameterBoolean )
                    {
                    // InternalRosSystemParser.g:1957:5: (lv_default_3_0= ruleParameterBoolean )
                    // InternalRosSystemParser.g:1958:6: lv_default_3_0= ruleParameterBoolean
                    {

                    						newCompositeNode(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterBoolean();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:1980:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRosSystemParser.g:1980:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRosSystemParser.g:1981:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
            {
             newCompositeNode(grammarAccess.getParameterBase64TypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64Type=ruleParameterBase64Type();

            state._fsp--;

             current =iv_ruleParameterBase64Type; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:1987:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:1993:2: ( ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) )
            // InternalRosSystemParser.g:1994:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            {
            // InternalRosSystemParser.g:1994:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            // InternalRosSystemParser.g:1995:3: () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            {
            // InternalRosSystemParser.g:1995:3: ()
            // InternalRosSystemParser.g:1996:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Base64,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
            		
            // InternalRosSystemParser.g:2006:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Default) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_BINARY) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalRosSystemParser.g:2007:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_29); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRosSystemParser.g:2011:4: ( (lv_default_3_0= ruleParameterBase64 ) )
                    // InternalRosSystemParser.g:2012:5: (lv_default_3_0= ruleParameterBase64 )
                    {
                    // InternalRosSystemParser.g:2012:5: (lv_default_3_0= ruleParameterBase64 )
                    // InternalRosSystemParser.g:2013:6: lv_default_3_0= ruleParameterBase64
                    {

                    						newCompositeNode(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterBase64();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2035:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRosSystemParser.g:2035:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRosSystemParser.g:2036:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
            {
             newCompositeNode(grammarAccess.getParameterArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterArrayType=ruleParameterArrayType();

            state._fsp--;

             current =iv_ruleParameterArrayType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2042:1: ruleParameterArrayType returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END ) ;
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
            // InternalRosSystemParser.g:2048:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END ) )
            // InternalRosSystemParser.g:2049:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END )
            {
            // InternalRosSystemParser.g:2049:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END )
            // InternalRosSystemParser.g:2050:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Array,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_1());
            		
            // InternalRosSystemParser.g:2058:3: ( (lv_type_2_0= ruleParameterType ) )
            // InternalRosSystemParser.g:2059:4: (lv_type_2_0= ruleParameterType )
            {
            // InternalRosSystemParser.g:2059:4: (lv_type_2_0= ruleParameterType )
            // InternalRosSystemParser.g:2060:5: lv_type_2_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_31);
            lv_type_2_0=ruleParameterType();

            state._fsp--;


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

            // InternalRosSystemParser.g:2077:3: (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Default) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosSystemParser.g:2078:4: otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) )
                    {
                    otherlv_3=(Token)match(input,Default,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRosSystemParser.g:2082:4: ( (lv_default_4_0= ruleParameterList ) )
                    // InternalRosSystemParser.g:2083:5: (lv_default_4_0= ruleParameterList )
                    {
                    // InternalRosSystemParser.g:2083:5: (lv_default_4_0= ruleParameterList )
                    // InternalRosSystemParser.g:2084:6: lv_default_4_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_default_4_0=ruleParameterList();

                    state._fsp--;


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
                    break;

            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getParameterArrayTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2110:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalRosSystemParser.g:2110:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalRosSystemParser.g:2111:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2117:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2123:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalRosSystemParser.g:2124:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalRosSystemParser.g:2124:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            // InternalRosSystemParser.g:2125:3: () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalRosSystemParser.g:2125:3: ()
            // InternalRosSystemParser.g:2126:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRosSystemParser.g:2136:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRosSystemParser.g:2137:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRosSystemParser.g:2137:4: (lv_value_2_0= ruleParameterValue )
            // InternalRosSystemParser.g:2138:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;


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

            // InternalRosSystemParser.g:2155:3: (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Comma) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRosSystemParser.g:2156:4: otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_20); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRosSystemParser.g:2160:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalRosSystemParser.g:2161:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalRosSystemParser.g:2161:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalRosSystemParser.g:2162:6: lv_value_4_0= ruleParameterValue
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_value_4_0=ruleParameterValue();

            	    state._fsp--;


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
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterListAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2188:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRosSystemParser.g:2188:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRosSystemParser.g:2189:2: iv_ruleParameterAny= ruleParameterAny EOF
            {
             newCompositeNode(grammarAccess.getParameterAnyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterAny=ruleParameterAny();

            state._fsp--;

             current =iv_ruleParameterAny; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2195:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2201:2: ( ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) )
            // InternalRosSystemParser.g:2202:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            {
            // InternalRosSystemParser.g:2202:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            // InternalRosSystemParser.g:2203:3: () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            {
            // InternalRosSystemParser.g:2203:3: ()
            // InternalRosSystemParser.g:2204:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ParameterAny,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            // InternalRosSystemParser.g:2214:3: (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Value) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosSystemParser.g:2215:4: otherlv_2= Value ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Value,FOLLOW_10); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getValueKeyword_2_0());
                    			
                    // InternalRosSystemParser.g:2219:4: ( (lv_value_3_0= ruleEString ) )
                    // InternalRosSystemParser.g:2220:5: (lv_value_3_0= ruleEString )
                    {
                    // InternalRosSystemParser.g:2220:5: (lv_value_3_0= ruleEString )
                    // InternalRosSystemParser.g:2221:6: lv_value_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEString();

                    state._fsp--;


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
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2243:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRosSystemParser.g:2243:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRosSystemParser.g:2244:2: iv_ruleParameterString= ruleParameterString EOF
            {
             newCompositeNode(grammarAccess.getParameterStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterString=ruleParameterString();

            state._fsp--;

             current =iv_ruleParameterString; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2250:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2256:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRosSystemParser.g:2257:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRosSystemParser.g:2257:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRosSystemParser.g:2258:3: (lv_value_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:2258:3: (lv_value_0_0= ruleEString )
            // InternalRosSystemParser.g:2259:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


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


            	leaveRule();

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
    // InternalRosSystemParser.g:2279:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRosSystemParser.g:2279:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRosSystemParser.g:2280:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
            {
             newCompositeNode(grammarAccess.getParameterBase64Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64=ruleParameterBase64();

            state._fsp--;

             current =iv_ruleParameterBase64; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2286:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2292:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalRosSystemParser.g:2293:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalRosSystemParser.g:2293:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalRosSystemParser.g:2294:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalRosSystemParser.g:2294:3: (lv_value_0_0= ruleBase64Binary )
            // InternalRosSystemParser.g:2295:4: lv_value_0_0= ruleBase64Binary
            {

            				newCompositeNode(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBase64Binary();

            state._fsp--;


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


            	leaveRule();

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
    // InternalRosSystemParser.g:2315:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRosSystemParser.g:2315:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRosSystemParser.g:2316:2: iv_ruleParameterInteger= ruleParameterInteger EOF
            {
             newCompositeNode(grammarAccess.getParameterIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterInteger=ruleParameterInteger();

            state._fsp--;

             current =iv_ruleParameterInteger; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2322:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2328:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalRosSystemParser.g:2329:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalRosSystemParser.g:2329:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalRosSystemParser.g:2330:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalRosSystemParser.g:2330:3: (lv_value_0_0= ruleInteger0 )
            // InternalRosSystemParser.g:2331:4: lv_value_0_0= ruleInteger0
            {

            				newCompositeNode(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleInteger0();

            state._fsp--;


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


            	leaveRule();

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
    // InternalRosSystemParser.g:2351:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRosSystemParser.g:2351:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRosSystemParser.g:2352:2: iv_ruleParameterDouble= ruleParameterDouble EOF
            {
             newCompositeNode(grammarAccess.getParameterDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDouble=ruleParameterDouble();

            state._fsp--;

             current =iv_ruleParameterDouble; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2358:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2364:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalRosSystemParser.g:2365:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalRosSystemParser.g:2365:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalRosSystemParser.g:2366:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalRosSystemParser.g:2366:3: (lv_value_0_0= ruleDouble0 )
            // InternalRosSystemParser.g:2367:4: lv_value_0_0= ruleDouble0
            {

            				newCompositeNode(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDouble0();

            state._fsp--;


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


            	leaveRule();

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
    // InternalRosSystemParser.g:2387:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRosSystemParser.g:2387:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRosSystemParser.g:2388:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
            {
             newCompositeNode(grammarAccess.getParameterBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBoolean=ruleParameterBoolean();

            state._fsp--;

             current =iv_ruleParameterBoolean; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2394:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2400:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalRosSystemParser.g:2401:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalRosSystemParser.g:2401:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalRosSystemParser.g:2402:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalRosSystemParser.g:2402:3: (lv_value_0_0= ruleboolean0 )
            // InternalRosSystemParser.g:2403:4: lv_value_0_0= ruleboolean0
            {

            				newCompositeNode(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleboolean0();

            state._fsp--;


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


            	leaveRule();

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
    // InternalRosSystemParser.g:2423:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRosSystemParser.g:2423:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRosSystemParser.g:2424:2: iv_ruleParameterStruct= ruleParameterStruct EOF
            {
             newCompositeNode(grammarAccess.getParameterStructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStruct=ruleParameterStruct();

            state._fsp--;

             current =iv_ruleParameterStruct; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2430:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? ) ;
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
            // InternalRosSystemParser.g:2436:2: ( ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? ) )
            // InternalRosSystemParser.g:2437:2: ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? )
            {
            // InternalRosSystemParser.g:2437:2: ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? )
            // InternalRosSystemParser.g:2438:3: () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )?
            {
            // InternalRosSystemParser.g:2438:3: ()
            // InternalRosSystemParser.g:2439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalRosSystemParser.g:2445:3: (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==LeftSquareBracket) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRosSystemParser.g:2446:4: otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalRosSystemParser.g:2450:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalRosSystemParser.g:2451:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalRosSystemParser.g:2451:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalRosSystemParser.g:2452:6: lv_value_2_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_value_2_0=ruleParameterStructMember();

                    state._fsp--;


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

                    // InternalRosSystemParser.g:2469:4: (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Comma) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalRosSystemParser.g:2470:5: otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_9); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_10); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_2_1());
                    	    				
                    	    // InternalRosSystemParser.g:2478:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalRosSystemParser.g:2479:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRosSystemParser.g:2479:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalRosSystemParser.g:2480:7: lv_value_5_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_value_5_0=ruleParameterStructMember();

                    	    state._fsp--;


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

                    	    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_11); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_2_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2511:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRosSystemParser.g:2511:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRosSystemParser.g:2512:2: iv_ruleParameterDate= ruleParameterDate EOF
            {
             newCompositeNode(grammarAccess.getParameterDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDate=ruleParameterDate();

            state._fsp--;

             current =iv_ruleParameterDate; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2518:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2524:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalRosSystemParser.g:2525:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalRosSystemParser.g:2525:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalRosSystemParser.g:2526:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalRosSystemParser.g:2526:3: (lv_value_0_0= ruleDateTime0 )
            // InternalRosSystemParser.g:2527:4: lv_value_0_0= ruleDateTime0
            {

            				newCompositeNode(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDateTime0();

            state._fsp--;


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


            	leaveRule();

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
    // InternalRosSystemParser.g:2547:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRosSystemParser.g:2547:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRosSystemParser.g:2548:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
            {
             newCompositeNode(grammarAccess.getParameterStructMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructMember=ruleParameterStructMember();

            state._fsp--;

             current =iv_ruleParameterStructMember; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2554:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2560:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END ) )
            // InternalRosSystemParser.g:2561:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END )
            {
            // InternalRosSystemParser.g:2561:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END )
            // InternalRosSystemParser.g:2562:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END
            {
            // InternalRosSystemParser.g:2562:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystemParser.g:2563:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:2563:4: (lv_name_0_0= ruleEString )
            // InternalRosSystemParser.g:2564:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_0_0=ruleEString();

            state._fsp--;


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

            otherlv_1=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_20); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRosSystemParser.g:2589:3: ( (lv_value_3_0= ruleParameterValue ) )
            // InternalRosSystemParser.g:2590:4: (lv_value_3_0= ruleParameterValue )
            {
            // InternalRosSystemParser.g:2590:4: (lv_value_3_0= ruleParameterValue )
            // InternalRosSystemParser.g:2591:5: lv_value_3_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_14);
            lv_value_3_0=ruleParameterValue();

            state._fsp--;


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

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getParameterStructMemberAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2616:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRosSystemParser.g:2616:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRosSystemParser.g:2617:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
            {
             newCompositeNode(grammarAccess.getParameterStructTypeMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructTypeMember=ruleParameterStructTypeMember();

            state._fsp--;

             current =iv_ruleParameterStructTypeMember; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2623:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRosSystemParser.g:2629:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalRosSystemParser.g:2630:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalRosSystemParser.g:2630:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalRosSystemParser.g:2631:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalRosSystemParser.g:2631:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosSystemParser.g:2632:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosSystemParser.g:2632:4: (lv_name_0_0= ruleEString )
            // InternalRosSystemParser.g:2633:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_name_0_0=ruleEString();

            state._fsp--;


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

            // InternalRosSystemParser.g:2650:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalRosSystemParser.g:2651:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalRosSystemParser.g:2651:4: (lv_type_1_0= ruleParameterType )
            // InternalRosSystemParser.g:2652:5: lv_type_1_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleParameterType();

            state._fsp--;


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


            	leaveRule();

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
    // InternalRosSystemParser.g:2673:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRosSystemParser.g:2673:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRosSystemParser.g:2674:2: iv_ruleBase64Binary= ruleBase64Binary EOF
            {
             newCompositeNode(grammarAccess.getBase64BinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBase64Binary=ruleBase64Binary();

            state._fsp--;

             current =iv_ruleBase64Binary.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2680:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:2686:2: (this_BINARY_0= RULE_BINARY )
            // InternalRosSystemParser.g:2687:2: this_BINARY_0= RULE_BINARY
            {
            this_BINARY_0=(Token)match(input,RULE_BINARY,FOLLOW_2); 

            		current.merge(this_BINARY_0);
            	

            		newLeafNode(this_BINARY_0, grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2697:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalRosSystemParser.g:2697:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalRosSystemParser.g:2698:2: iv_ruleboolean0= ruleboolean0 EOF
            {
             newCompositeNode(grammarAccess.getBoolean0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleboolean0=ruleboolean0();

            state._fsp--;

             current =iv_ruleboolean0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2704:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:2710:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalRosSystemParser.g:2711:2: this_BOOLEAN_0= RULE_BOOLEAN
            {
            this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            		current.merge(this_BOOLEAN_0);
            	

            		newLeafNode(this_BOOLEAN_0, grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2721:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalRosSystemParser.g:2721:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalRosSystemParser.g:2722:2: iv_ruleDouble0= ruleDouble0 EOF
            {
             newCompositeNode(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble0=ruleDouble0();

            state._fsp--;

             current =iv_ruleDouble0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2728:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:2734:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalRosSystemParser.g:2735:2: this_DOUBLE_0= RULE_DOUBLE
            {
            this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            		current.merge(this_DOUBLE_0);
            	

            		newLeafNode(this_DOUBLE_0, grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2745:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalRosSystemParser.g:2745:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalRosSystemParser.g:2746:2: iv_ruleInteger0= ruleInteger0 EOF
            {
             newCompositeNode(grammarAccess.getInteger0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger0=ruleInteger0();

            state._fsp--;

             current =iv_ruleInteger0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2752:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:2758:2: (this_DECINT_0= RULE_DECINT )
            // InternalRosSystemParser.g:2759:2: this_DECINT_0= RULE_DECINT
            {
            this_DECINT_0=(Token)match(input,RULE_DECINT,FOLLOW_2); 

            		current.merge(this_DECINT_0);
            	

            		newLeafNode(this_DECINT_0, grammarAccess.getInteger0Access().getDECINTTerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2769:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalRosSystemParser.g:2769:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalRosSystemParser.g:2770:2: iv_ruleDateTime0= ruleDateTime0 EOF
            {
             newCompositeNode(grammarAccess.getDateTime0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateTime0=ruleDateTime0();

            state._fsp--;

             current =iv_ruleDateTime0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2776:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:2782:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalRosSystemParser.g:2783:2: this_DATE_TIME_0= RULE_DATE_TIME
            {
            this_DATE_TIME_0=(Token)match(input,RULE_DATE_TIME,FOLLOW_2); 

            		current.merge(this_DATE_TIME_0);
            	

            		newLeafNode(this_DATE_TIME_0, grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalRosSystemParser.g:2793:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalRosSystemParser.g:2793:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalRosSystemParser.g:2794:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:2800:1: ruleAbstractType returns [EObject current=null] : (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef ) ;
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



        	enterRule();

        try {
            // InternalRosSystemParser.g:2806:2: ( (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef ) )
            // InternalRosSystemParser.g:2807:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef )
            {
            // InternalRosSystemParser.g:2807:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef )
            int alt34=31;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalRosSystemParser.g:2808:3: this_bool_0= rulebool
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_bool_0=rulebool();

                    state._fsp--;


                    			current = this_bool_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:2817:3: this_int8_1= ruleint8
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_int8_1=ruleint8();

                    state._fsp--;


                    			current = this_int8_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:2826:3: this_uint8_2= ruleuint8
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint8_2=ruleuint8();

                    state._fsp--;


                    			current = this_uint8_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:2835:3: this_int16_3= ruleint16
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_int16_3=ruleint16();

                    state._fsp--;


                    			current = this_int16_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:2844:3: this_uint16_4= ruleuint16
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint16_4=ruleuint16();

                    state._fsp--;


                    			current = this_uint16_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:2853:3: this_int32_5= ruleint32
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_int32_5=ruleint32();

                    state._fsp--;


                    			current = this_int32_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:2862:3: this_uint32_6= ruleuint32
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint32_6=ruleuint32();

                    state._fsp--;


                    			current = this_uint32_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:2871:3: this_int64_7= ruleint64
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_int64_7=ruleint64();

                    state._fsp--;


                    			current = this_int64_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRosSystemParser.g:2880:3: this_uint64_8= ruleuint64
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint64_8=ruleuint64();

                    state._fsp--;


                    			current = this_uint64_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRosSystemParser.g:2889:3: this_float32_9= rulefloat32
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_float32_9=rulefloat32();

                    state._fsp--;


                    			current = this_float32_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRosSystemParser.g:2898:3: this_float64_10= rulefloat64
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_float64_10=rulefloat64();

                    state._fsp--;


                    			current = this_float64_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalRosSystemParser.g:2907:3: this_string0_11= rulestring0
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_string0_11=rulestring0();

                    state._fsp--;


                    			current = this_string0_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalRosSystemParser.g:2916:3: this_byte_12= rulebyte
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getByteParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_byte_12=rulebyte();

                    state._fsp--;


                    			current = this_byte_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalRosSystemParser.g:2925:3: this_time_13= ruletime
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getTimeParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_time_13=ruletime();

                    state._fsp--;


                    			current = this_time_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalRosSystemParser.g:2934:3: this_duration_14= ruleduration
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getDurationParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_duration_14=ruleduration();

                    state._fsp--;


                    			current = this_duration_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalRosSystemParser.g:2943:3: this_Header_15= ruleHeader
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getHeaderParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_Header_15=ruleHeader();

                    state._fsp--;


                    			current = this_Header_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalRosSystemParser.g:2952:3: this_boolArray_16= ruleboolArray
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_boolArray_16=ruleboolArray();

                    state._fsp--;


                    			current = this_boolArray_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalRosSystemParser.g:2961:3: this_int8Array_17= ruleint8Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_int8Array_17=ruleint8Array();

                    state._fsp--;


                    			current = this_int8Array_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalRosSystemParser.g:2970:3: this_uint8Array_18= ruleuint8Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint8Array_18=ruleuint8Array();

                    state._fsp--;


                    			current = this_uint8Array_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalRosSystemParser.g:2979:3: this_int16Array_19= ruleint16Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_int16Array_19=ruleint16Array();

                    state._fsp--;


                    			current = this_int16Array_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalRosSystemParser.g:2988:3: this_uint16Array_20= ruleuint16Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint16Array_20=ruleuint16Array();

                    state._fsp--;


                    			current = this_uint16Array_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalRosSystemParser.g:2997:3: this_int32Array_21= ruleint32Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_int32Array_21=ruleint32Array();

                    state._fsp--;


                    			current = this_int32Array_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 23 :
                    // InternalRosSystemParser.g:3006:3: this_uint32Array_22= ruleuint32Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_22());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint32Array_22=ruleuint32Array();

                    state._fsp--;


                    			current = this_uint32Array_22;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 24 :
                    // InternalRosSystemParser.g:3015:3: this_int64Array_23= ruleint64Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_23());
                    		
                    pushFollow(FOLLOW_2);
                    this_int64Array_23=ruleint64Array();

                    state._fsp--;


                    			current = this_int64Array_23;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 25 :
                    // InternalRosSystemParser.g:3024:3: this_uint64Array_24= ruleuint64Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_24());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint64Array_24=ruleuint64Array();

                    state._fsp--;


                    			current = this_uint64Array_24;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 26 :
                    // InternalRosSystemParser.g:3033:3: this_float32Array_25= rulefloat32Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_25());
                    		
                    pushFollow(FOLLOW_2);
                    this_float32Array_25=rulefloat32Array();

                    state._fsp--;


                    			current = this_float32Array_25;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 27 :
                    // InternalRosSystemParser.g:3042:3: this_float64Array_26= rulefloat64Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_26());
                    		
                    pushFollow(FOLLOW_2);
                    this_float64Array_26=rulefloat64Array();

                    state._fsp--;


                    			current = this_float64Array_26;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 28 :
                    // InternalRosSystemParser.g:3051:3: this_string0Array_27= rulestring0Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_27());
                    		
                    pushFollow(FOLLOW_2);
                    this_string0Array_27=rulestring0Array();

                    state._fsp--;


                    			current = this_string0Array_27;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 29 :
                    // InternalRosSystemParser.g:3060:3: this_byteArray_28= rulebyteArray
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getByteArrayParserRuleCall_28());
                    		
                    pushFollow(FOLLOW_2);
                    this_byteArray_28=rulebyteArray();

                    state._fsp--;


                    			current = this_byteArray_28;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 30 :
                    // InternalRosSystemParser.g:3069:3: this_SpecBaseRef_29= ruleSpecBaseRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getSpecBaseRefParserRuleCall_29());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecBaseRef_29=ruleSpecBaseRef();

                    state._fsp--;


                    			current = this_SpecBaseRef_29;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 31 :
                    // InternalRosSystemParser.g:3078:3: this_ArraySpecRef_30= ruleArraySpecRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getArraySpecRefParserRuleCall_30());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArraySpecRef_30=ruleArraySpecRef();

                    state._fsp--;


                    			current = this_ArraySpecRef_30;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3090:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalRosSystemParser.g:3090:45: (iv_rulebool= rulebool EOF )
            // InternalRosSystemParser.g:3091:2: iv_rulebool= rulebool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebool=rulebool();

            state._fsp--;

             current =iv_rulebool; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3097:1: rulebool returns [EObject current=null] : ( () otherlv_1= Bool ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3103:2: ( ( () otherlv_1= Bool ) )
            // InternalRosSystemParser.g:3104:2: ( () otherlv_1= Bool )
            {
            // InternalRosSystemParser.g:3104:2: ( () otherlv_1= Bool )
            // InternalRosSystemParser.g:3105:3: () otherlv_1= Bool
            {
            // InternalRosSystemParser.g:3105:3: ()
            // InternalRosSystemParser.g:3106:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Bool,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getBoolKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3120:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalRosSystemParser.g:3120:45: (iv_ruleint8= ruleint8 EOF )
            // InternalRosSystemParser.g:3121:2: iv_ruleint8= ruleint8 EOF
            {
             newCompositeNode(grammarAccess.getInt8Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint8=ruleint8();

            state._fsp--;

             current =iv_ruleint8; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3127:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= Int8 ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3133:2: ( ( () otherlv_1= Int8 ) )
            // InternalRosSystemParser.g:3134:2: ( () otherlv_1= Int8 )
            {
            // InternalRosSystemParser.g:3134:2: ( () otherlv_1= Int8 )
            // InternalRosSystemParser.g:3135:3: () otherlv_1= Int8
            {
            // InternalRosSystemParser.g:3135:3: ()
            // InternalRosSystemParser.g:3136:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt8Access().getInt8Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int8,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt8Access().getInt8Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3150:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalRosSystemParser.g:3150:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalRosSystemParser.g:3151:2: iv_ruleuint8= ruleuint8 EOF
            {
             newCompositeNode(grammarAccess.getUint8Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint8=ruleuint8();

            state._fsp--;

             current =iv_ruleuint8; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3157:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= Uint8 ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3163:2: ( ( () otherlv_1= Uint8 ) )
            // InternalRosSystemParser.g:3164:2: ( () otherlv_1= Uint8 )
            {
            // InternalRosSystemParser.g:3164:2: ( () otherlv_1= Uint8 )
            // InternalRosSystemParser.g:3165:3: () otherlv_1= Uint8
            {
            // InternalRosSystemParser.g:3165:3: ()
            // InternalRosSystemParser.g:3166:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint8Access().getUint8Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint8,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint8Access().getUint8Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3180:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalRosSystemParser.g:3180:46: (iv_ruleint16= ruleint16 EOF )
            // InternalRosSystemParser.g:3181:2: iv_ruleint16= ruleint16 EOF
            {
             newCompositeNode(grammarAccess.getInt16Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint16=ruleint16();

            state._fsp--;

             current =iv_ruleint16; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3187:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= Int16 ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3193:2: ( ( () otherlv_1= Int16 ) )
            // InternalRosSystemParser.g:3194:2: ( () otherlv_1= Int16 )
            {
            // InternalRosSystemParser.g:3194:2: ( () otherlv_1= Int16 )
            // InternalRosSystemParser.g:3195:3: () otherlv_1= Int16
            {
            // InternalRosSystemParser.g:3195:3: ()
            // InternalRosSystemParser.g:3196:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt16Access().getInt16Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt16Access().getInt16Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3210:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalRosSystemParser.g:3210:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalRosSystemParser.g:3211:2: iv_ruleuint16= ruleuint16 EOF
            {
             newCompositeNode(grammarAccess.getUint16Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint16=ruleuint16();

            state._fsp--;

             current =iv_ruleuint16; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3217:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= Uint16 ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3223:2: ( ( () otherlv_1= Uint16 ) )
            // InternalRosSystemParser.g:3224:2: ( () otherlv_1= Uint16 )
            {
            // InternalRosSystemParser.g:3224:2: ( () otherlv_1= Uint16 )
            // InternalRosSystemParser.g:3225:3: () otherlv_1= Uint16
            {
            // InternalRosSystemParser.g:3225:3: ()
            // InternalRosSystemParser.g:3226:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint16Access().getUint16Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint16Access().getUint16Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3240:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalRosSystemParser.g:3240:46: (iv_ruleint32= ruleint32 EOF )
            // InternalRosSystemParser.g:3241:2: iv_ruleint32= ruleint32 EOF
            {
             newCompositeNode(grammarAccess.getInt32Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint32=ruleint32();

            state._fsp--;

             current =iv_ruleint32; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3247:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= Int32 ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3253:2: ( ( () otherlv_1= Int32 ) )
            // InternalRosSystemParser.g:3254:2: ( () otherlv_1= Int32 )
            {
            // InternalRosSystemParser.g:3254:2: ( () otherlv_1= Int32 )
            // InternalRosSystemParser.g:3255:3: () otherlv_1= Int32
            {
            // InternalRosSystemParser.g:3255:3: ()
            // InternalRosSystemParser.g:3256:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt32Access().getInt32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt32Access().getInt32Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3270:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalRosSystemParser.g:3270:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalRosSystemParser.g:3271:2: iv_ruleuint32= ruleuint32 EOF
            {
             newCompositeNode(grammarAccess.getUint32Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint32=ruleuint32();

            state._fsp--;

             current =iv_ruleuint32; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3277:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= Uint32 ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3283:2: ( ( () otherlv_1= Uint32 ) )
            // InternalRosSystemParser.g:3284:2: ( () otherlv_1= Uint32 )
            {
            // InternalRosSystemParser.g:3284:2: ( () otherlv_1= Uint32 )
            // InternalRosSystemParser.g:3285:3: () otherlv_1= Uint32
            {
            // InternalRosSystemParser.g:3285:3: ()
            // InternalRosSystemParser.g:3286:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint32Access().getUint32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint32Access().getUint32Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3300:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalRosSystemParser.g:3300:46: (iv_ruleint64= ruleint64 EOF )
            // InternalRosSystemParser.g:3301:2: iv_ruleint64= ruleint64 EOF
            {
             newCompositeNode(grammarAccess.getInt64Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint64=ruleint64();

            state._fsp--;

             current =iv_ruleint64; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3307:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= Int64 ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3313:2: ( ( () otherlv_1= Int64 ) )
            // InternalRosSystemParser.g:3314:2: ( () otherlv_1= Int64 )
            {
            // InternalRosSystemParser.g:3314:2: ( () otherlv_1= Int64 )
            // InternalRosSystemParser.g:3315:3: () otherlv_1= Int64
            {
            // InternalRosSystemParser.g:3315:3: ()
            // InternalRosSystemParser.g:3316:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt64Access().getInt64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt64Access().getInt64Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3330:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalRosSystemParser.g:3330:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalRosSystemParser.g:3331:2: iv_ruleuint64= ruleuint64 EOF
            {
             newCompositeNode(grammarAccess.getUint64Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint64=ruleuint64();

            state._fsp--;

             current =iv_ruleuint64; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3337:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= Uint64 ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3343:2: ( ( () otherlv_1= Uint64 ) )
            // InternalRosSystemParser.g:3344:2: ( () otherlv_1= Uint64 )
            {
            // InternalRosSystemParser.g:3344:2: ( () otherlv_1= Uint64 )
            // InternalRosSystemParser.g:3345:3: () otherlv_1= Uint64
            {
            // InternalRosSystemParser.g:3345:3: ()
            // InternalRosSystemParser.g:3346:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint64Access().getUint64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint64Access().getUint64Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3360:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalRosSystemParser.g:3360:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalRosSystemParser.g:3361:2: iv_rulefloat32= rulefloat32 EOF
            {
             newCompositeNode(grammarAccess.getFloat32Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulefloat32=rulefloat32();

            state._fsp--;

             current =iv_rulefloat32; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3367:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= Float32 ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3373:2: ( ( () otherlv_1= Float32 ) )
            // InternalRosSystemParser.g:3374:2: ( () otherlv_1= Float32 )
            {
            // InternalRosSystemParser.g:3374:2: ( () otherlv_1= Float32 )
            // InternalRosSystemParser.g:3375:3: () otherlv_1= Float32
            {
            // InternalRosSystemParser.g:3375:3: ()
            // InternalRosSystemParser.g:3376:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat32Access().getFloat32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Float32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloat32Access().getFloat32Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3390:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalRosSystemParser.g:3390:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalRosSystemParser.g:3391:2: iv_rulefloat64= rulefloat64 EOF
            {
             newCompositeNode(grammarAccess.getFloat64Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulefloat64=rulefloat64();

            state._fsp--;

             current =iv_rulefloat64; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3397:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= Float64 ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3403:2: ( ( () otherlv_1= Float64 ) )
            // InternalRosSystemParser.g:3404:2: ( () otherlv_1= Float64 )
            {
            // InternalRosSystemParser.g:3404:2: ( () otherlv_1= Float64 )
            // InternalRosSystemParser.g:3405:3: () otherlv_1= Float64
            {
            // InternalRosSystemParser.g:3405:3: ()
            // InternalRosSystemParser.g:3406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat64Access().getFloat64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Float64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloat64Access().getFloat64Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3420:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalRosSystemParser.g:3420:48: (iv_rulestring0= rulestring0 EOF )
            // InternalRosSystemParser.g:3421:2: iv_rulestring0= rulestring0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulestring0=rulestring0();

            state._fsp--;

             current =iv_rulestring0; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3427:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= String_1 ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3433:2: ( ( () otherlv_1= String_1 ) )
            // InternalRosSystemParser.g:3434:2: ( () otherlv_1= String_1 )
            {
            // InternalRosSystemParser.g:3434:2: ( () otherlv_1= String_1 )
            // InternalRosSystemParser.g:3435:3: () otherlv_1= String_1
            {
            // InternalRosSystemParser.g:3435:3: ()
            // InternalRosSystemParser.g:3436:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulebyte"
    // InternalRosSystemParser.g:3450:1: entryRulebyte returns [EObject current=null] : iv_rulebyte= rulebyte EOF ;
    public final EObject entryRulebyte() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyte = null;


        try {
            // InternalRosSystemParser.g:3450:45: (iv_rulebyte= rulebyte EOF )
            // InternalRosSystemParser.g:3451:2: iv_rulebyte= rulebyte EOF
            {
             newCompositeNode(grammarAccess.getByteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebyte=rulebyte();

            state._fsp--;

             current =iv_rulebyte; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3457:1: rulebyte returns [EObject current=null] : ( () otherlv_1= Byte ) ;
    public final EObject rulebyte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3463:2: ( ( () otherlv_1= Byte ) )
            // InternalRosSystemParser.g:3464:2: ( () otherlv_1= Byte )
            {
            // InternalRosSystemParser.g:3464:2: ( () otherlv_1= Byte )
            // InternalRosSystemParser.g:3465:3: () otherlv_1= Byte
            {
            // InternalRosSystemParser.g:3465:3: ()
            // InternalRosSystemParser.g:3466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getByteAccess().getByteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Byte,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getByteAccess().getByteKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3480:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalRosSystemParser.g:3480:45: (iv_ruletime= ruletime EOF )
            // InternalRosSystemParser.g:3481:2: iv_ruletime= ruletime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletime=ruletime();

            state._fsp--;

             current =iv_ruletime; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3487:1: ruletime returns [EObject current=null] : ( () otherlv_1= Time ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3493:2: ( ( () otherlv_1= Time ) )
            // InternalRosSystemParser.g:3494:2: ( () otherlv_1= Time )
            {
            // InternalRosSystemParser.g:3494:2: ( () otherlv_1= Time )
            // InternalRosSystemParser.g:3495:3: () otherlv_1= Time
            {
            // InternalRosSystemParser.g:3495:3: ()
            // InternalRosSystemParser.g:3496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeAccess().getTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Time,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getTimeKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3510:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalRosSystemParser.g:3510:49: (iv_ruleduration= ruleduration EOF )
            // InternalRosSystemParser.g:3511:2: iv_ruleduration= ruleduration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleduration=ruleduration();

            state._fsp--;

             current =iv_ruleduration; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3517:1: ruleduration returns [EObject current=null] : ( () otherlv_1= Duration ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3523:2: ( ( () otherlv_1= Duration ) )
            // InternalRosSystemParser.g:3524:2: ( () otherlv_1= Duration )
            {
            // InternalRosSystemParser.g:3524:2: ( () otherlv_1= Duration )
            // InternalRosSystemParser.g:3525:3: () otherlv_1= Duration
            {
            // InternalRosSystemParser.g:3525:3: ()
            // InternalRosSystemParser.g:3526:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Duration,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDurationAccess().getDurationKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3540:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalRosSystemParser.g:3540:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalRosSystemParser.g:3541:2: iv_ruleboolArray= ruleboolArray EOF
            {
             newCompositeNode(grammarAccess.getBoolArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleboolArray=ruleboolArray();

            state._fsp--;

             current =iv_ruleboolArray; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3547:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= Bool_1 ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3553:2: ( ( () otherlv_1= Bool_1 ) )
            // InternalRosSystemParser.g:3554:2: ( () otherlv_1= Bool_1 )
            {
            // InternalRosSystemParser.g:3554:2: ( () otherlv_1= Bool_1 )
            // InternalRosSystemParser.g:3555:3: () otherlv_1= Bool_1
            {
            // InternalRosSystemParser.g:3555:3: ()
            // InternalRosSystemParser.g:3556:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolArrayAccess().getBoolArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Bool_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolArrayAccess().getBoolKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3570:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalRosSystemParser.g:3570:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalRosSystemParser.g:3571:2: iv_ruleint8Array= ruleint8Array EOF
            {
             newCompositeNode(grammarAccess.getInt8ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint8Array=ruleint8Array();

            state._fsp--;

             current =iv_ruleint8Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3577:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= Int8_1 ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3583:2: ( ( () otherlv_1= Int8_1 ) )
            // InternalRosSystemParser.g:3584:2: ( () otherlv_1= Int8_1 )
            {
            // InternalRosSystemParser.g:3584:2: ( () otherlv_1= Int8_1 )
            // InternalRosSystemParser.g:3585:3: () otherlv_1= Int8_1
            {
            // InternalRosSystemParser.g:3585:3: ()
            // InternalRosSystemParser.g:3586:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int8_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt8ArrayAccess().getInt8Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3600:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalRosSystemParser.g:3600:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalRosSystemParser.g:3601:2: iv_ruleuint8Array= ruleuint8Array EOF
            {
             newCompositeNode(grammarAccess.getUint8ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint8Array=ruleuint8Array();

            state._fsp--;

             current =iv_ruleuint8Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3607:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= Uint8_1 ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3613:2: ( ( () otherlv_1= Uint8_1 ) )
            // InternalRosSystemParser.g:3614:2: ( () otherlv_1= Uint8_1 )
            {
            // InternalRosSystemParser.g:3614:2: ( () otherlv_1= Uint8_1 )
            // InternalRosSystemParser.g:3615:3: () otherlv_1= Uint8_1
            {
            // InternalRosSystemParser.g:3615:3: ()
            // InternalRosSystemParser.g:3616:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint8_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint8ArrayAccess().getUint8Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3630:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalRosSystemParser.g:3630:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalRosSystemParser.g:3631:2: iv_ruleint16Array= ruleint16Array EOF
            {
             newCompositeNode(grammarAccess.getInt16ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint16Array=ruleint16Array();

            state._fsp--;

             current =iv_ruleint16Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3637:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= Int16_1 ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3643:2: ( ( () otherlv_1= Int16_1 ) )
            // InternalRosSystemParser.g:3644:2: ( () otherlv_1= Int16_1 )
            {
            // InternalRosSystemParser.g:3644:2: ( () otherlv_1= Int16_1 )
            // InternalRosSystemParser.g:3645:3: () otherlv_1= Int16_1
            {
            // InternalRosSystemParser.g:3645:3: ()
            // InternalRosSystemParser.g:3646:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int16_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt16ArrayAccess().getInt16Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3660:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalRosSystemParser.g:3660:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalRosSystemParser.g:3661:2: iv_ruleuint16Array= ruleuint16Array EOF
            {
             newCompositeNode(grammarAccess.getUint16ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint16Array=ruleuint16Array();

            state._fsp--;

             current =iv_ruleuint16Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3667:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= Uint16_1 ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3673:2: ( ( () otherlv_1= Uint16_1 ) )
            // InternalRosSystemParser.g:3674:2: ( () otherlv_1= Uint16_1 )
            {
            // InternalRosSystemParser.g:3674:2: ( () otherlv_1= Uint16_1 )
            // InternalRosSystemParser.g:3675:3: () otherlv_1= Uint16_1
            {
            // InternalRosSystemParser.g:3675:3: ()
            // InternalRosSystemParser.g:3676:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint16_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint16ArrayAccess().getUint16Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3690:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalRosSystemParser.g:3690:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalRosSystemParser.g:3691:2: iv_ruleint32Array= ruleint32Array EOF
            {
             newCompositeNode(grammarAccess.getInt32ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint32Array=ruleint32Array();

            state._fsp--;

             current =iv_ruleint32Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3697:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= Int32_1 ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3703:2: ( ( () otherlv_1= Int32_1 ) )
            // InternalRosSystemParser.g:3704:2: ( () otherlv_1= Int32_1 )
            {
            // InternalRosSystemParser.g:3704:2: ( () otherlv_1= Int32_1 )
            // InternalRosSystemParser.g:3705:3: () otherlv_1= Int32_1
            {
            // InternalRosSystemParser.g:3705:3: ()
            // InternalRosSystemParser.g:3706:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int32_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt32ArrayAccess().getInt32Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3720:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalRosSystemParser.g:3720:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalRosSystemParser.g:3721:2: iv_ruleuint32Array= ruleuint32Array EOF
            {
             newCompositeNode(grammarAccess.getUint32ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint32Array=ruleuint32Array();

            state._fsp--;

             current =iv_ruleuint32Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3727:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= Uint32_1 ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3733:2: ( ( () otherlv_1= Uint32_1 ) )
            // InternalRosSystemParser.g:3734:2: ( () otherlv_1= Uint32_1 )
            {
            // InternalRosSystemParser.g:3734:2: ( () otherlv_1= Uint32_1 )
            // InternalRosSystemParser.g:3735:3: () otherlv_1= Uint32_1
            {
            // InternalRosSystemParser.g:3735:3: ()
            // InternalRosSystemParser.g:3736:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint32_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint32ArrayAccess().getUint32Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3750:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalRosSystemParser.g:3750:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalRosSystemParser.g:3751:2: iv_ruleint64Array= ruleint64Array EOF
            {
             newCompositeNode(grammarAccess.getInt64ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint64Array=ruleint64Array();

            state._fsp--;

             current =iv_ruleint64Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3757:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= Int64_1 ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3763:2: ( ( () otherlv_1= Int64_1 ) )
            // InternalRosSystemParser.g:3764:2: ( () otherlv_1= Int64_1 )
            {
            // InternalRosSystemParser.g:3764:2: ( () otherlv_1= Int64_1 )
            // InternalRosSystemParser.g:3765:3: () otherlv_1= Int64_1
            {
            // InternalRosSystemParser.g:3765:3: ()
            // InternalRosSystemParser.g:3766:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int64_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt64ArrayAccess().getInt64Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3780:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalRosSystemParser.g:3780:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalRosSystemParser.g:3781:2: iv_ruleuint64Array= ruleuint64Array EOF
            {
             newCompositeNode(grammarAccess.getUint64ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint64Array=ruleuint64Array();

            state._fsp--;

             current =iv_ruleuint64Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3787:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= Uint64_1 ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3793:2: ( ( () otherlv_1= Uint64_1 ) )
            // InternalRosSystemParser.g:3794:2: ( () otherlv_1= Uint64_1 )
            {
            // InternalRosSystemParser.g:3794:2: ( () otherlv_1= Uint64_1 )
            // InternalRosSystemParser.g:3795:3: () otherlv_1= Uint64_1
            {
            // InternalRosSystemParser.g:3795:3: ()
            // InternalRosSystemParser.g:3796:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint64_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint64ArrayAccess().getUint64Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3810:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalRosSystemParser.g:3810:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalRosSystemParser.g:3811:2: iv_rulefloat32Array= rulefloat32Array EOF
            {
             newCompositeNode(grammarAccess.getFloat32ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefloat32Array=rulefloat32Array();

            state._fsp--;

             current =iv_rulefloat32Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3817:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= Float32_1 ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3823:2: ( ( () otherlv_1= Float32_1 ) )
            // InternalRosSystemParser.g:3824:2: ( () otherlv_1= Float32_1 )
            {
            // InternalRosSystemParser.g:3824:2: ( () otherlv_1= Float32_1 )
            // InternalRosSystemParser.g:3825:3: () otherlv_1= Float32_1
            {
            // InternalRosSystemParser.g:3825:3: ()
            // InternalRosSystemParser.g:3826:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Float32_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloat32ArrayAccess().getFloat32Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3840:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalRosSystemParser.g:3840:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalRosSystemParser.g:3841:2: iv_rulefloat64Array= rulefloat64Array EOF
            {
             newCompositeNode(grammarAccess.getFloat64ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefloat64Array=rulefloat64Array();

            state._fsp--;

             current =iv_rulefloat64Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3847:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= Float64_1 ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3853:2: ( ( () otherlv_1= Float64_1 ) )
            // InternalRosSystemParser.g:3854:2: ( () otherlv_1= Float64_1 )
            {
            // InternalRosSystemParser.g:3854:2: ( () otherlv_1= Float64_1 )
            // InternalRosSystemParser.g:3855:3: () otherlv_1= Float64_1
            {
            // InternalRosSystemParser.g:3855:3: ()
            // InternalRosSystemParser.g:3856:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Float64_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloat64ArrayAccess().getFloat64Keyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3870:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalRosSystemParser.g:3870:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalRosSystemParser.g:3871:2: iv_rulestring0Array= rulestring0Array EOF
            {
             newCompositeNode(grammarAccess.getString0ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestring0Array=rulestring0Array();

            state._fsp--;

             current =iv_rulestring0Array; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3877:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= String_2 ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3883:2: ( ( () otherlv_1= String_2 ) )
            // InternalRosSystemParser.g:3884:2: ( () otherlv_1= String_2 )
            {
            // InternalRosSystemParser.g:3884:2: ( () otherlv_1= String_2 )
            // InternalRosSystemParser.g:3885:3: () otherlv_1= String_2
            {
            // InternalRosSystemParser.g:3885:3: ()
            // InternalRosSystemParser.g:3886:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0ArrayAccess().getStringArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String_2,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getString0ArrayAccess().getStringKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3900:1: entryRulebyteArray returns [EObject current=null] : iv_rulebyteArray= rulebyteArray EOF ;
    public final EObject entryRulebyteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyteArray = null;


        try {
            // InternalRosSystemParser.g:3900:50: (iv_rulebyteArray= rulebyteArray EOF )
            // InternalRosSystemParser.g:3901:2: iv_rulebyteArray= rulebyteArray EOF
            {
             newCompositeNode(grammarAccess.getByteArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebyteArray=rulebyteArray();

            state._fsp--;

             current =iv_rulebyteArray; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3907:1: rulebyteArray returns [EObject current=null] : ( () otherlv_1= Byte_1 ) ;
    public final EObject rulebyteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3913:2: ( ( () otherlv_1= Byte_1 ) )
            // InternalRosSystemParser.g:3914:2: ( () otherlv_1= Byte_1 )
            {
            // InternalRosSystemParser.g:3914:2: ( () otherlv_1= Byte_1 )
            // InternalRosSystemParser.g:3915:3: () otherlv_1= Byte_1
            {
            // InternalRosSystemParser.g:3915:3: ()
            // InternalRosSystemParser.g:3916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getByteArrayAccess().getByteArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Byte_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getByteArrayAccess().getByteKeyword_1());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleHeader"
    // InternalRosSystemParser.g:3930:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRosSystemParser.g:3930:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRosSystemParser.g:3931:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3937:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= Header ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3943:2: ( ( () otherlv_1= Header ) )
            // InternalRosSystemParser.g:3944:2: ( () otherlv_1= Header )
            {
            // InternalRosSystemParser.g:3944:2: ( () otherlv_1= Header )
            // InternalRosSystemParser.g:3945:3: () otherlv_1= Header
            {
            // InternalRosSystemParser.g:3945:3: ()
            // InternalRosSystemParser.g:3946:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeaderAccess().getHeaderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Header,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getHeaderKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3960:1: entryRuleSpecBaseRef returns [EObject current=null] : iv_ruleSpecBaseRef= ruleSpecBaseRef EOF ;
    public final EObject entryRuleSpecBaseRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBaseRef = null;


        try {
            // InternalRosSystemParser.g:3960:52: (iv_ruleSpecBaseRef= ruleSpecBaseRef EOF )
            // InternalRosSystemParser.g:3961:2: iv_ruleSpecBaseRef= ruleSpecBaseRef EOF
            {
             newCompositeNode(grammarAccess.getSpecBaseRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecBaseRef=ruleSpecBaseRef();

            state._fsp--;

             current =iv_ruleSpecBaseRef; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:3967:1: ruleSpecBaseRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSpecBaseRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:3973:2: ( ( ( ruleEString ) ) )
            // InternalRosSystemParser.g:3974:2: ( ( ruleEString ) )
            {
            // InternalRosSystemParser.g:3974:2: ( ( ruleEString ) )
            // InternalRosSystemParser.g:3975:3: ( ruleEString )
            {
            // InternalRosSystemParser.g:3975:3: ( ruleEString )
            // InternalRosSystemParser.g:3976:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSpecBaseRefRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:3993:1: entryRuleArraySpecRef returns [EObject current=null] : iv_ruleArraySpecRef= ruleArraySpecRef EOF ;
    public final EObject entryRuleArraySpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecRef = null;


        try {
            // InternalRosSystemParser.g:3993:53: (iv_ruleArraySpecRef= ruleArraySpecRef EOF )
            // InternalRosSystemParser.g:3994:2: iv_ruleArraySpecRef= ruleArraySpecRef EOF
            {
             newCompositeNode(grammarAccess.getArraySpecRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArraySpecRef=ruleArraySpecRef();

            state._fsp--;

             current =iv_ruleArraySpecRef; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:4000:1: ruleArraySpecRef returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) ;
    public final EObject ruleArraySpecRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4006:2: ( ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) )
            // InternalRosSystemParser.g:4007:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            {
            // InternalRosSystemParser.g:4007:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            // InternalRosSystemParser.g:4008:3: ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket
            {
            // InternalRosSystemParser.g:4008:3: ( ( ruleEString ) )
            // InternalRosSystemParser.g:4009:4: ( ruleEString )
            {
            // InternalRosSystemParser.g:4009:4: ( ruleEString )
            // InternalRosSystemParser.g:4010:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArraySpecRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecCrossReference_0_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,LeftSquareBracketRightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getArraySpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:4032:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalRosSystemParser.g:4032:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalRosSystemParser.g:4033:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
             newCompositeNode(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;

             current =iv_ruleKEYWORD.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:4039:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4045:2: ( (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) )
            // InternalRosSystemParser.g:4046:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            {
            // InternalRosSystemParser.g:4046:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            int alt35=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt35=1;
                }
                break;
            case Message:
                {
                alt35=2;
                }
                break;
            case Result:
                {
                alt35=3;
                }
                break;
            case Feedback:
                {
                alt35=4;
                }
                break;
            case Name:
                {
                alt35=5;
                }
                break;
            case Value:
                {
                alt35=6;
                }
                break;
            case Service:
                {
                alt35=7;
                }
                break;
            case Type:
                {
                alt35=8;
                }
                break;
            case Action:
                {
                alt35=9;
                }
                break;
            case Duration:
                {
                alt35=10;
                }
                break;
            case Time:
                {
                alt35=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalRosSystemParser.g:4047:3: kw= Goal
                    {
                    kw=(Token)match(input,Goal,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:4053:3: kw= Message
                    {
                    kw=(Token)match(input,Message,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRosSystemParser.g:4059:3: kw= Result
                    {
                    kw=(Token)match(input,Result,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRosSystemParser.g:4065:3: kw= Feedback
                    {
                    kw=(Token)match(input,Feedback,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRosSystemParser.g:4071:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRosSystemParser.g:4077:3: kw= Value
                    {
                    kw=(Token)match(input,Value,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRosSystemParser.g:4083:3: kw= Service
                    {
                    kw=(Token)match(input,Service,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRosSystemParser.g:4089:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRosSystemParser.g:4095:3: kw= Action
                    {
                    kw=(Token)match(input,Action,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRosSystemParser.g:4101:3: kw= Duration
                    {
                    kw=(Token)match(input,Duration,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRosSystemParser.g:4107:3: kw= Time
                    {
                    kw=(Token)match(input,Time,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTimeKeyword_10());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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
    // InternalRosSystemParser.g:4116:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosSystemParser.g:4116:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosSystemParser.g:4117:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalRosSystemParser.g:4123:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosSystemParser.g:4129:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosSystemParser.g:4130:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosSystemParser.g:4130:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalRosSystemParser.g:4131:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosSystemParser.g:4139:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA34 dfa34 = new DFA34(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\7\12\uffff";
    static final String dfa_3s = "\1\115\5\uffff\1\115\1\uffff\2\115\1\uffff";
    static final String dfa_4s = "\1\141\5\uffff\1\135\1\uffff\2\120\1\uffff";
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

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1529:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )";
        }
    }
    static final String dfa_8s = "\42\uffff";
    static final String dfa_9s = "\36\uffff\2\41\2\uffff";
    static final String dfa_10s = "\1\15\35\uffff\2\114\2\uffff";
    static final String dfa_11s = "\1\135\35\uffff\2\114\2\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\37\1\36";
    static final String dfa_13s = "\42\uffff}>";
    static final String[] dfa_14s = {
            "\1\32\1\33\1\uffff\1\17\3\uffff\1\34\1\uffff\1\25\1\27\1\31\2\uffff\1\12\1\13\4\uffff\1\24\1\26\1\30\2\uffff\1\23\3\uffff\1\20\3\uffff\1\21\1\35\1\22\2\uffff\1\14\1\5\1\7\1\11\2\uffff\1\4\1\6\1\10\1\uffff\1\3\3\uffff\1\1\1\15\1\uffff\1\2\2\uffff\1\16\24\uffff\1\37\1\36",
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
            "\1\40",
            "\1\40",
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

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2807:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000000000D00L,0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000230000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000012000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000600L,0x0000000200000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000400L,0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000001E00C0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x00000000303C8000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00001B0006000000L,0x0000000100000001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000008000L,0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});

}