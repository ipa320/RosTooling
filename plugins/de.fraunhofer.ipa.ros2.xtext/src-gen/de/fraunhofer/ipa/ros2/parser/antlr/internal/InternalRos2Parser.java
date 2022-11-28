package de.fraunhofer.ipa.ros2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.ros2.services.Ros2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRos2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ParameterStructMember", "ExternalDependency", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "Transient_local", "Serviceclient", "Serviceserver", "Actionclient", "Actionserver", "Dependencies", "Parameter_qos", "ParameterAny", "FromGitRepo", "Reliability", "Services_qos", "Subscribers", "Best_effort", "Default_qos", "Durability", "Parameters", "Publishers", "Artifacts", "Sensor_qos", "GraphName", "Feedback_1", "Float32_1", "Float64_1", "Keep_last", "Response", "Duration", "Feedback", "History", "Keep_all", "Message_1", "Profile", "Reliable", "Request", "String_2", "Uint16_1", "Uint32_1", "Uint64_1", "Volatile", "Boolean", "Integer", "Action_1", "Default", "Float32", "Float64", "Int16_1", "Int32_1", "Int64_1", "Message", "Result_1", "Service", "Uint8_1", "Array", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Depth", "Int8_1", "Result", "Specs", "String_1", "Uint16", "Uint32", "Uint64", "Goal_1", "Int16", "Int32", "Int64", "Node_1", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Goal", "Int8", "Msg", "Name", "Node", "Qos", "Srv", "Time", "Type", "Any", "Ns", "LeftSquareBracketRightSquareBracket", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ID", "RULE_ROS_CONVENTION_A", "RULE_STRING", "RULE_ROS_CONVENTION_PARAM", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Float32_1=30;
    public static final int Node=93;
    public static final int RULE_DATE_TIME=123;
    public static final int Uint64_1=45;
    public static final int String=64;
    public static final int History=36;
    public static final int Int16=78;
    public static final int Float32=51;
    public static final int Goal=89;
    public static final int Bool=87;
    public static final int Uint16=74;
    public static final int Boolean=47;
    public static final int ExternalDependency=5;
    public static final int Uint8=83;
    public static final int Parameters=24;
    public static final int RULE_ID=109;
    public static final int Actionclient=12;
    public static final int RULE_DIGIT=113;
    public static final int GlobalNamespace=8;
    public static final int Artifacts=26;
    public static final int Node_1=81;
    public static final int Int16_1=53;
    public static final int Header=63;
    public static final int RULE_INT=124;
    public static final int Byte=88;
    public static final int RULE_ML_COMMENT=126;
    public static final int LeftSquareBracket=103;
    public static final int Specs=72;
    public static final int Base64=61;
    public static final int Message_1=38;
    public static final int Profile=39;
    public static final int Depth=69;
    public static final int Comma=101;
    public static final int RULE_MESSAGE_ASIGMENT=125;
    public static final int Goal_1=77;
    public static final int LeftSquareBracketRightSquareBracket=100;
    public static final int Int32=79;
    public static final int Publishers=25;
    public static final int Serviceserver=11;
    public static final int Parameter_qos=15;
    public static final int RightCurlyBracket=105;
    public static final int RULE_DECINT=116;
    public static final int Reliable=40;
    public static final int Uint32=75;
    public static final int FromGitRepo=17;
    public static final int Msg=91;
    public static final int RULE_HOUR=121;
    public static final int Int8=90;
    public static final int Default=50;
    public static final int Actionserver=13;
    public static final int Int8_1=70;
    public static final int Uint16_1=43;
    public static final int Type=97;
    public static final int Float64=52;
    public static final int Int32_1=54;
    public static final int Result_1=57;
    public static final int Keep_all=37;
    public static final int RULE_BINARY=114;
    public static final int String_1=73;
    public static final int Subscribers=20;
    public static final int String_2=42;
    public static final int RULE_BEGIN=106;
    public static final int RULE_DAY=118;
    public static final int Services_qos=19;
    public static final int RULE_BOOLEAN=115;
    public static final int RelativeNamespace=6;
    public static final int RULE_YEAR=120;
    public static final int Feedback_1=29;
    public static final int Result=71;
    public static final int Name=92;
    public static final int RULE_MIN_SEC=122;
    public static final int Default_qos=22;
    public static final int ParameterAny=16;
    public static final int List=86;
    public static final int Dependencies=14;
    public static final int RightSquareBracket=104;
    public static final int PrivateNamespace=7;
    public static final int GraphName=28;
    public static final int Byte_1=68;
    public static final int Float64_1=31;
    public static final int Durability=23;
    public static final int Duration=34;
    public static final int Uint32_1=44;
    public static final int Action_1=49;
    public static final int Double=62;
    public static final int Keep_last=32;
    public static final int Type_1=82;
    public static final int Value=84;
    public static final int Transient_local=9;
    public static final int Uint64=76;
    public static final int Action=66;
    public static final int RULE_END=107;
    public static final int Message=56;
    public static final int Time=96;
    public static final int RULE_STRING=111;
    public static final int Best_effort=21;
    public static final int Bool_1=67;
    public static final int Any=98;
    public static final int Struct=65;
    public static final int RULE_SL_COMMENT=108;
    public static final int Uint8_1=59;
    public static final int RULE_DOUBLE=117;
    public static final int Feedback=35;
    public static final int ParameterStructMember=4;
    public static final int Srv=95;
    public static final int RULE_ROS_CONVENTION_A=110;
    public static final int RULE_ROS_CONVENTION_PARAM=112;
    public static final int Colon=102;
    public static final int EOF=-1;
    public static final int Ns=99;
    public static final int RULE_WS=127;
    public static final int Request=41;
    public static final int Int64_1=55;
    public static final int Service=58;
    public static final int Sensor_qos=27;
    public static final int RULE_ANY_OTHER=128;
    public static final int Volatile=46;
    public static final int Date=85;
    public static final int Response=33;
    public static final int Integer=48;
    public static final int Array=60;
    public static final int Serviceclient=10;
    public static final int Qos=94;
    public static final int Int64=80;
    public static final int RULE_MONTH=119;
    public static final int Reliability=18;

    // delegates
    // delegators


        public InternalRos2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRos2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRos2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalRos2Parser.g"; }



     	private Ros2GrammarAccess grammarAccess;

        public InternalRos2Parser(TokenStream input, Ros2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Package";
       	}

       	@Override
       	protected Ros2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackage"
    // InternalRos2Parser.g:57:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalRos2Parser.g:57:48: (iv_rulePackage= rulePackage EOF )
            // InternalRos2Parser.g:58:2: iv_rulePackage= rulePackage EOF
            {
             newCompositeNode(grammarAccess.getPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage=rulePackage();

            state._fsp--;

             current =iv_rulePackage; 
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
    // $ANTLR end "entryRulePackage"


    // $ANTLR start "rulePackage"
    // InternalRos2Parser.g:64:1: rulePackage returns [EObject current=null] : this_AmentPackage_0= ruleAmentPackage ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        EObject this_AmentPackage_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:70:2: (this_AmentPackage_0= ruleAmentPackage )
            // InternalRos2Parser.g:71:2: this_AmentPackage_0= ruleAmentPackage
            {

            		newCompositeNode(grammarAccess.getPackageAccess().getAmentPackageParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_AmentPackage_0=ruleAmentPackage();

            state._fsp--;


            		current = this_AmentPackage_0;
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleAmentPackage"
    // InternalRos2Parser.g:82:1: entryRuleAmentPackage returns [EObject current=null] : iv_ruleAmentPackage= ruleAmentPackage EOF ;
    public final EObject entryRuleAmentPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmentPackage = null;


        try {
            // InternalRos2Parser.g:82:53: (iv_ruleAmentPackage= ruleAmentPackage EOF )
            // InternalRos2Parser.g:83:2: iv_ruleAmentPackage= ruleAmentPackage EOF
            {
             newCompositeNode(grammarAccess.getAmentPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAmentPackage=ruleAmentPackage();

            state._fsp--;

             current =iv_ruleAmentPackage; 
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
    // $ANTLR end "entryRuleAmentPackage"


    // $ANTLR start "ruleAmentPackage"
    // InternalRos2Parser.g:89:1: ruleAmentPackage returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END ) ;
    public final EObject ruleAmentPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_fromGitRepo_5_0 = null;

        EObject lv_artifact_8_0 = null;

        EObject lv_dependency_12_0 = null;

        EObject lv_dependency_14_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:95:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:96:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:96:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END )
            // InternalRos2Parser.g:97:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:97:3: ()
            // InternalRos2Parser.g:98:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAmentPackageAccess().getAmentPackageAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:104:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:105:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:105:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:106:5: lv_name_1_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getAmentPackageAccess().getNameRosNamesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAmentPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAmentPackageAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_5); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getAmentPackageAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRos2Parser.g:131:3: (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==FromGitRepo) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRos2Parser.g:132:4: otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,FromGitRepo,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAmentPackageAccess().getFromGitRepoKeyword_4_0());
                    			
                    // InternalRos2Parser.g:136:4: ( (lv_fromGitRepo_5_0= ruleEString ) )
                    // InternalRos2Parser.g:137:5: (lv_fromGitRepo_5_0= ruleEString )
                    {
                    // InternalRos2Parser.g:137:5: (lv_fromGitRepo_5_0= ruleEString )
                    // InternalRos2Parser.g:138:6: lv_fromGitRepo_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAmentPackageAccess().getFromGitRepoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_fromGitRepo_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmentPackageRule());
                    						}
                    						set(
                    							current,
                    							"fromGitRepo",
                    							lv_fromGitRepo_5_0,
                    							"de.fraunhofer.ipa.ros.Ros.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:156:3: (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Artifacts) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRos2Parser.g:157:4: otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Artifacts,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAmentPackageAccess().getArtifactsKeyword_5_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getAmentPackageAccess().getBEGINTerminalRuleCall_5_1());
                    			
                    // InternalRos2Parser.g:165:4: ( (lv_artifact_8_0= ruleArtifact ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Node||(LA2_0>=RULE_ID && LA2_0<=RULE_ROS_CONVENTION_A)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRos2Parser.g:166:5: (lv_artifact_8_0= ruleArtifact )
                    	    {
                    	    // InternalRos2Parser.g:166:5: (lv_artifact_8_0= ruleArtifact )
                    	    // InternalRos2Parser.g:167:6: lv_artifact_8_0= ruleArtifact
                    	    {

                    	    						newCompositeNode(grammarAccess.getAmentPackageAccess().getArtifactArtifactParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_artifact_8_0=ruleArtifact();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAmentPackageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"artifact",
                    	    							lv_artifact_8_0,
                    	    							"de.fraunhofer.ipa.ros.Ros.Artifact");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_9); 

                    				newLeafNode(this_END_9, grammarAccess.getAmentPackageAccess().getENDTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalRos2Parser.g:189:3: (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Dependencies) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRos2Parser.g:190:4: otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket
                    {
                    otherlv_10=(Token)match(input,Dependencies,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getAmentPackageAccess().getDependenciesKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,LeftSquareBracket,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getAmentPackageAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalRos2Parser.g:198:4: ( (lv_dependency_12_0= ruleDependency ) )
                    // InternalRos2Parser.g:199:5: (lv_dependency_12_0= ruleDependency )
                    {
                    // InternalRos2Parser.g:199:5: (lv_dependency_12_0= ruleDependency )
                    // InternalRos2Parser.g:200:6: lv_dependency_12_0= ruleDependency
                    {

                    						newCompositeNode(grammarAccess.getAmentPackageAccess().getDependencyDependencyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_dependency_12_0=ruleDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAmentPackageRule());
                    						}
                    						add(
                    							current,
                    							"dependency",
                    							lv_dependency_12_0,
                    							"de.fraunhofer.ipa.ros.Ros.Dependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:217:4: (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRos2Parser.g:218:5: otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAmentPackageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRos2Parser.g:222:5: ( (lv_dependency_14_0= ruleDependency ) )
                    	    // InternalRos2Parser.g:223:6: (lv_dependency_14_0= ruleDependency )
                    	    {
                    	    // InternalRos2Parser.g:223:6: (lv_dependency_14_0= ruleDependency )
                    	    // InternalRos2Parser.g:224:7: lv_dependency_14_0= ruleDependency
                    	    {

                    	    							newCompositeNode(grammarAccess.getAmentPackageAccess().getDependencyDependencyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_dependency_14_0=ruleDependency();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAmentPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dependency",
                    	    								lv_dependency_14_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Dependency");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,RightSquareBracket,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getAmentPackageAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getAmentPackageAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "ruleAmentPackage"


    // $ANTLR start "entryRuleQualityOfService"
    // InternalRos2Parser.g:255:1: entryRuleQualityOfService returns [EObject current=null] : iv_ruleQualityOfService= ruleQualityOfService EOF ;
    public final EObject entryRuleQualityOfService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityOfService = null;


        try {
            // InternalRos2Parser.g:255:57: (iv_ruleQualityOfService= ruleQualityOfService EOF )
            // InternalRos2Parser.g:256:2: iv_ruleQualityOfService= ruleQualityOfService EOF
            {
             newCompositeNode(grammarAccess.getQualityOfServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualityOfService=ruleQualityOfService();

            state._fsp--;

             current =iv_ruleQualityOfService; 
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
    // $ANTLR end "entryRuleQualityOfService"


    // $ANTLR start "ruleQualityOfService"
    // InternalRos2Parser.g:262:1: ruleQualityOfService returns [EObject current=null] : ( () (otherlv_1= Profile ( ( (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos ) ) ) )? (otherlv_3= History ( ( (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all ) ) ) )? (otherlv_5= Depth ( (lv_Depth_6_0= ruleInteger0 ) ) )? (otherlv_7= Reliability ( ( (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable ) ) ) )? (otherlv_9= Durability ( ( (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile ) ) ) )? ) ;
    public final EObject ruleQualityOfService() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_QoSProfile_2_1=null;
        Token lv_QoSProfile_2_2=null;
        Token lv_QoSProfile_2_3=null;
        Token lv_QoSProfile_2_4=null;
        Token otherlv_3=null;
        Token lv_History_4_1=null;
        Token lv_History_4_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_Reliability_8_1=null;
        Token lv_Reliability_8_2=null;
        Token otherlv_9=null;
        Token lv_Durability_10_1=null;
        Token lv_Durability_10_2=null;
        AntlrDatatypeRuleToken lv_Depth_6_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:268:2: ( ( () (otherlv_1= Profile ( ( (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos ) ) ) )? (otherlv_3= History ( ( (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all ) ) ) )? (otherlv_5= Depth ( (lv_Depth_6_0= ruleInteger0 ) ) )? (otherlv_7= Reliability ( ( (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable ) ) ) )? (otherlv_9= Durability ( ( (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile ) ) ) )? ) )
            // InternalRos2Parser.g:269:2: ( () (otherlv_1= Profile ( ( (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos ) ) ) )? (otherlv_3= History ( ( (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all ) ) ) )? (otherlv_5= Depth ( (lv_Depth_6_0= ruleInteger0 ) ) )? (otherlv_7= Reliability ( ( (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable ) ) ) )? (otherlv_9= Durability ( ( (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile ) ) ) )? )
            {
            // InternalRos2Parser.g:269:2: ( () (otherlv_1= Profile ( ( (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos ) ) ) )? (otherlv_3= History ( ( (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all ) ) ) )? (otherlv_5= Depth ( (lv_Depth_6_0= ruleInteger0 ) ) )? (otherlv_7= Reliability ( ( (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable ) ) ) )? (otherlv_9= Durability ( ( (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile ) ) ) )? )
            // InternalRos2Parser.g:270:3: () (otherlv_1= Profile ( ( (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos ) ) ) )? (otherlv_3= History ( ( (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all ) ) ) )? (otherlv_5= Depth ( (lv_Depth_6_0= ruleInteger0 ) ) )? (otherlv_7= Reliability ( ( (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable ) ) ) )? (otherlv_9= Durability ( ( (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile ) ) ) )?
            {
            // InternalRos2Parser.g:270:3: ()
            // InternalRos2Parser.g:271:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQualityOfServiceAccess().getQualityOfServiceAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:277:3: (otherlv_1= Profile ( ( (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos ) ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Profile) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRos2Parser.g:278:4: otherlv_1= Profile ( ( (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos ) ) )
                    {
                    otherlv_1=(Token)match(input,Profile,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getQualityOfServiceAccess().getProfileKeyword_1_0());
                    			
                    // InternalRos2Parser.g:282:4: ( ( (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos ) ) )
                    // InternalRos2Parser.g:283:5: ( (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos ) )
                    {
                    // InternalRos2Parser.g:283:5: ( (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos ) )
                    // InternalRos2Parser.g:284:6: (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos )
                    {
                    // InternalRos2Parser.g:284:6: (lv_QoSProfile_2_1= Default_qos | lv_QoSProfile_2_2= Services_qos | lv_QoSProfile_2_3= Sensor_qos | lv_QoSProfile_2_4= Parameter_qos )
                    int alt6=4;
                    switch ( input.LA(1) ) {
                    case Default_qos:
                        {
                        alt6=1;
                        }
                        break;
                    case Services_qos:
                        {
                        alt6=2;
                        }
                        break;
                    case Sensor_qos:
                        {
                        alt6=3;
                        }
                        break;
                    case Parameter_qos:
                        {
                        alt6=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // InternalRos2Parser.g:285:7: lv_QoSProfile_2_1= Default_qos
                            {
                            lv_QoSProfile_2_1=(Token)match(input,Default_qos,FOLLOW_15); 

                            							newLeafNode(lv_QoSProfile_2_1, grammarAccess.getQualityOfServiceAccess().getQoSProfileDefault_qosKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQualityOfServiceRule());
                            							}
                            							setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_2_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalRos2Parser.g:296:7: lv_QoSProfile_2_2= Services_qos
                            {
                            lv_QoSProfile_2_2=(Token)match(input,Services_qos,FOLLOW_15); 

                            							newLeafNode(lv_QoSProfile_2_2, grammarAccess.getQualityOfServiceAccess().getQoSProfileServices_qosKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQualityOfServiceRule());
                            							}
                            							setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_2_2, null);
                            						

                            }
                            break;
                        case 3 :
                            // InternalRos2Parser.g:307:7: lv_QoSProfile_2_3= Sensor_qos
                            {
                            lv_QoSProfile_2_3=(Token)match(input,Sensor_qos,FOLLOW_15); 

                            							newLeafNode(lv_QoSProfile_2_3, grammarAccess.getQualityOfServiceAccess().getQoSProfileSensor_qosKeyword_1_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQualityOfServiceRule());
                            							}
                            							setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_2_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalRos2Parser.g:318:7: lv_QoSProfile_2_4= Parameter_qos
                            {
                            lv_QoSProfile_2_4=(Token)match(input,Parameter_qos,FOLLOW_15); 

                            							newLeafNode(lv_QoSProfile_2_4, grammarAccess.getQualityOfServiceAccess().getQoSProfileParameter_qosKeyword_1_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQualityOfServiceRule());
                            							}
                            							setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_2_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:332:3: (otherlv_3= History ( ( (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all ) ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==History) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRos2Parser.g:333:4: otherlv_3= History ( ( (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all ) ) )
                    {
                    otherlv_3=(Token)match(input,History,FOLLOW_16); 

                    				newLeafNode(otherlv_3, grammarAccess.getQualityOfServiceAccess().getHistoryKeyword_2_0());
                    			
                    // InternalRos2Parser.g:337:4: ( ( (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all ) ) )
                    // InternalRos2Parser.g:338:5: ( (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all ) )
                    {
                    // InternalRos2Parser.g:338:5: ( (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all ) )
                    // InternalRos2Parser.g:339:6: (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all )
                    {
                    // InternalRos2Parser.g:339:6: (lv_History_4_1= Keep_last | lv_History_4_2= Keep_all )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Keep_last) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==Keep_all) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRos2Parser.g:340:7: lv_History_4_1= Keep_last
                            {
                            lv_History_4_1=(Token)match(input,Keep_last,FOLLOW_17); 

                            							newLeafNode(lv_History_4_1, grammarAccess.getQualityOfServiceAccess().getHistoryKeep_lastKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQualityOfServiceRule());
                            							}
                            							setWithLastConsumed(current, "History", lv_History_4_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalRos2Parser.g:351:7: lv_History_4_2= Keep_all
                            {
                            lv_History_4_2=(Token)match(input,Keep_all,FOLLOW_17); 

                            							newLeafNode(lv_History_4_2, grammarAccess.getQualityOfServiceAccess().getHistoryKeep_allKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQualityOfServiceRule());
                            							}
                            							setWithLastConsumed(current, "History", lv_History_4_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:365:3: (otherlv_5= Depth ( (lv_Depth_6_0= ruleInteger0 ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Depth) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRos2Parser.g:366:4: otherlv_5= Depth ( (lv_Depth_6_0= ruleInteger0 ) )
                    {
                    otherlv_5=(Token)match(input,Depth,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getQualityOfServiceAccess().getDepthKeyword_3_0());
                    			
                    // InternalRos2Parser.g:370:4: ( (lv_Depth_6_0= ruleInteger0 ) )
                    // InternalRos2Parser.g:371:5: (lv_Depth_6_0= ruleInteger0 )
                    {
                    // InternalRos2Parser.g:371:5: (lv_Depth_6_0= ruleInteger0 )
                    // InternalRos2Parser.g:372:6: lv_Depth_6_0= ruleInteger0
                    {

                    						newCompositeNode(grammarAccess.getQualityOfServiceAccess().getDepthInteger0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_Depth_6_0=ruleInteger0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQualityOfServiceRule());
                    						}
                    						set(
                    							current,
                    							"Depth",
                    							lv_Depth_6_0,
                    							"de.fraunhofer.ipa.ros.Ros.Integer0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:390:3: (otherlv_7= Reliability ( ( (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable ) ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Reliability) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRos2Parser.g:391:4: otherlv_7= Reliability ( ( (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable ) ) )
                    {
                    otherlv_7=(Token)match(input,Reliability,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getQualityOfServiceAccess().getReliabilityKeyword_4_0());
                    			
                    // InternalRos2Parser.g:395:4: ( ( (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable ) ) )
                    // InternalRos2Parser.g:396:5: ( (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable ) )
                    {
                    // InternalRos2Parser.g:396:5: ( (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable ) )
                    // InternalRos2Parser.g:397:6: (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable )
                    {
                    // InternalRos2Parser.g:397:6: (lv_Reliability_8_1= Best_effort | lv_Reliability_8_2= Reliable )
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Best_effort) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==Reliable) ) {
                        alt11=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalRos2Parser.g:398:7: lv_Reliability_8_1= Best_effort
                            {
                            lv_Reliability_8_1=(Token)match(input,Best_effort,FOLLOW_21); 

                            							newLeafNode(lv_Reliability_8_1, grammarAccess.getQualityOfServiceAccess().getReliabilityBest_effortKeyword_4_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQualityOfServiceRule());
                            							}
                            							setWithLastConsumed(current, "Reliability", lv_Reliability_8_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalRos2Parser.g:409:7: lv_Reliability_8_2= Reliable
                            {
                            lv_Reliability_8_2=(Token)match(input,Reliable,FOLLOW_21); 

                            							newLeafNode(lv_Reliability_8_2, grammarAccess.getQualityOfServiceAccess().getReliabilityReliableKeyword_4_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQualityOfServiceRule());
                            							}
                            							setWithLastConsumed(current, "Reliability", lv_Reliability_8_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:423:3: (otherlv_9= Durability ( ( (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile ) ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Durability) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRos2Parser.g:424:4: otherlv_9= Durability ( ( (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile ) ) )
                    {
                    otherlv_9=(Token)match(input,Durability,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getQualityOfServiceAccess().getDurabilityKeyword_5_0());
                    			
                    // InternalRos2Parser.g:428:4: ( ( (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile ) ) )
                    // InternalRos2Parser.g:429:5: ( (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile ) )
                    {
                    // InternalRos2Parser.g:429:5: ( (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile ) )
                    // InternalRos2Parser.g:430:6: (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile )
                    {
                    // InternalRos2Parser.g:430:6: (lv_Durability_10_1= Transient_local | lv_Durability_10_2= Volatile )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Transient_local) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==Volatile) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalRos2Parser.g:431:7: lv_Durability_10_1= Transient_local
                            {
                            lv_Durability_10_1=(Token)match(input,Transient_local,FOLLOW_2); 

                            							newLeafNode(lv_Durability_10_1, grammarAccess.getQualityOfServiceAccess().getDurabilityTransient_localKeyword_5_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQualityOfServiceRule());
                            							}
                            							setWithLastConsumed(current, "Durability", lv_Durability_10_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalRos2Parser.g:442:7: lv_Durability_10_2= Volatile
                            {
                            lv_Durability_10_2=(Token)match(input,Volatile,FOLLOW_2); 

                            							newLeafNode(lv_Durability_10_2, grammarAccess.getQualityOfServiceAccess().getDurabilityVolatileKeyword_5_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getQualityOfServiceRule());
                            							}
                            							setWithLastConsumed(current, "Durability", lv_Durability_10_2, null);
                            						

                            }
                            break;

                    }


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
    // $ANTLR end "ruleQualityOfService"


    // $ANTLR start "entryRulePublisher"
    // InternalRos2Parser.g:460:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRos2Parser.g:460:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRos2Parser.g:461:2: iv_rulePublisher= rulePublisher EOF
            {
             newCompositeNode(grammarAccess.getPublisherRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePublisher=rulePublisher();

            state._fsp--;

             current =iv_rulePublisher; 
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
    // $ANTLR end "entryRulePublisher"


    // $ANTLR start "rulePublisher"
    // InternalRos2Parser.g:467:1: rulePublisher returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )? this_END_12= RULE_END ) ;
    public final EObject rulePublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        EObject lv_qos_10_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:473:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )? this_END_12= RULE_END ) )
            // InternalRos2Parser.g:474:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )? this_END_12= RULE_END )
            {
            // InternalRos2Parser.g:474:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )? this_END_12= RULE_END )
            // InternalRos2Parser.g:475:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )? this_END_12= RULE_END
            {
            // InternalRos2Parser.g:475:3: ()
            // InternalRos2Parser.g:476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublisherAccess().getPublisherAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:482:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:483:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:483:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:484:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublisherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getPublisherAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:513:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:514:4: ( ruleEString )
            {
            // InternalRos2Parser.g:514:4: ( ruleEString )
            // InternalRos2Parser.g:515:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:529:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Ns) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRos2Parser.g:530:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:534:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:535:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:535:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:536:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Ros.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:554:3: (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Qos) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRos2Parser.g:555:4: otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getPublisherAccess().getQosKeyword_7_0());
                    			
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_27); 

                    				newLeafNode(this_BEGIN_9, grammarAccess.getPublisherAccess().getBEGINTerminalRuleCall_7_1());
                    			
                    // InternalRos2Parser.g:563:4: ( (lv_qos_10_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:564:5: (lv_qos_10_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:564:5: (lv_qos_10_0= ruleQualityOfService )
                    // InternalRos2Parser.g:565:6: lv_qos_10_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getQosQualityOfServiceParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_10_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_10_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_11=(Token)match(input,RULE_END,FOLLOW_13); 

                    				newLeafNode(this_END_11, grammarAccess.getPublisherAccess().getENDTerminalRuleCall_7_3());
                    			

                    }
                    break;

            }

            this_END_12=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_12, grammarAccess.getPublisherAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "rulePublisher"


    // $ANTLR start "entryRuleSubscriber"
    // InternalRos2Parser.g:595:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRos2Parser.g:595:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRos2Parser.g:596:2: iv_ruleSubscriber= ruleSubscriber EOF
            {
             newCompositeNode(grammarAccess.getSubscriberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubscriber=ruleSubscriber();

            state._fsp--;

             current =iv_ruleSubscriber; 
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
    // $ANTLR end "entryRuleSubscriber"


    // $ANTLR start "ruleSubscriber"
    // InternalRos2Parser.g:602:1: ruleSubscriber returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        EObject lv_qos_9_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:608:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) )
            // InternalRos2Parser.g:609:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            {
            // InternalRos2Parser.g:609:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            // InternalRos2Parser.g:610:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END
            {
            // InternalRos2Parser.g:610:3: ()
            // InternalRos2Parser.g:611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubscriberAccess().getSubscriberAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:617:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:618:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:618:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:619:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubscriberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSubscriberAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:648:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:649:4: ( ruleEString )
            {
            // InternalRos2Parser.g:649:4: ( ruleEString )
            // InternalRos2Parser.g:650:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:664:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Ns) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRos2Parser.g:665:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:669:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:670:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:670:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:671:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Ros.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:689:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Qos) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRos2Parser.g:690:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getSubscriberAccess().getQosKeyword_7_0());
                    			
                    // InternalRos2Parser.g:694:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:695:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:695:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:696:6: lv_qos_9_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getQosQualityOfServiceParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_9_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_9_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getSubscriberAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleSubscriber"


    // $ANTLR start "entryRuleServiceServer"
    // InternalRos2Parser.g:722:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRos2Parser.g:722:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRos2Parser.g:723:2: iv_ruleServiceServer= ruleServiceServer EOF
            {
             newCompositeNode(grammarAccess.getServiceServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceServer=ruleServiceServer();

            state._fsp--;

             current =iv_ruleServiceServer; 
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
    // $ANTLR end "entryRuleServiceServer"


    // $ANTLR start "ruleServiceServer"
    // InternalRos2Parser.g:729:1: ruleServiceServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        EObject lv_qos_9_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:735:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) )
            // InternalRos2Parser.g:736:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            {
            // InternalRos2Parser.g:736:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            // InternalRos2Parser.g:737:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END
            {
            // InternalRos2Parser.g:737:3: ()
            // InternalRos2Parser.g:738:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceServerAccess().getServiceServerAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:744:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:745:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:745:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:746:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceServerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getServiceServerAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceServerAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:775:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:776:4: ( ruleEString )
            {
            // InternalRos2Parser.g:776:4: ( ruleEString )
            // InternalRos2Parser.g:777:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceServerAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:791:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Ns) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRos2Parser.g:792:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceServerAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:796:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:797:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:797:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:798:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Ros.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:816:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Qos) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRos2Parser.g:817:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getServiceServerAccess().getQosKeyword_7_0());
                    			
                    // InternalRos2Parser.g:821:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:822:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:822:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:823:6: lv_qos_9_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getQosQualityOfServiceParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_9_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_9_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getServiceServerAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleServiceServer"


    // $ANTLR start "entryRuleServiceClient"
    // InternalRos2Parser.g:849:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRos2Parser.g:849:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRos2Parser.g:850:2: iv_ruleServiceClient= ruleServiceClient EOF
            {
             newCompositeNode(grammarAccess.getServiceClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceClient=ruleServiceClient();

            state._fsp--;

             current =iv_ruleServiceClient; 
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
    // $ANTLR end "entryRuleServiceClient"


    // $ANTLR start "ruleServiceClient"
    // InternalRos2Parser.g:856:1: ruleServiceClient returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        EObject lv_qos_9_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:862:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) )
            // InternalRos2Parser.g:863:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            {
            // InternalRos2Parser.g:863:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            // InternalRos2Parser.g:864:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END
            {
            // InternalRos2Parser.g:864:3: ()
            // InternalRos2Parser.g:865:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceClientAccess().getServiceClientAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:871:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:872:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:872:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:873:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceClientAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceClientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getServiceClientAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceClientAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:902:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:903:4: ( ruleEString )
            {
            // InternalRos2Parser.g:903:4: ( ruleEString )
            // InternalRos2Parser.g:904:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceClientAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:918:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Ns) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRos2Parser.g:919:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:923:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:924:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:924:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:925:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Ros.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:943:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Qos) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRos2Parser.g:944:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getServiceClientAccess().getQosKeyword_7_0());
                    			
                    // InternalRos2Parser.g:948:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:949:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:949:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:950:6: lv_qos_9_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getQosQualityOfServiceParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_9_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_9_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getServiceClientAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleServiceClient"


    // $ANTLR start "entryRuleActionServer"
    // InternalRos2Parser.g:976:1: entryRuleActionServer returns [EObject current=null] : iv_ruleActionServer= ruleActionServer EOF ;
    public final EObject entryRuleActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionServer = null;


        try {
            // InternalRos2Parser.g:976:53: (iv_ruleActionServer= ruleActionServer EOF )
            // InternalRos2Parser.g:977:2: iv_ruleActionServer= ruleActionServer EOF
            {
             newCompositeNode(grammarAccess.getActionServerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionServer=ruleActionServer();

            state._fsp--;

             current =iv_ruleActionServer; 
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
    // $ANTLR end "entryRuleActionServer"


    // $ANTLR start "ruleActionServer"
    // InternalRos2Parser.g:983:1: ruleActionServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleActionServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        EObject lv_qos_9_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:989:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) )
            // InternalRos2Parser.g:990:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            {
            // InternalRos2Parser.g:990:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            // InternalRos2Parser.g:991:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END
            {
            // InternalRos2Parser.g:991:3: ()
            // InternalRos2Parser.g:992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionServerAccess().getActionServerAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:998:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:999:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:999:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1000:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionServerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getActionServerAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getActionServerAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getActionServerAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:1029:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:1030:4: ( ruleEString )
            {
            // InternalRos2Parser.g:1030:4: ( ruleEString )
            // InternalRos2Parser.g:1031:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionServerAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:1045:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Ns) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRos2Parser.g:1046:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionServerAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:1050:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1051:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1051:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1052:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionServerRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Ros.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:1070:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Qos) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRos2Parser.g:1071:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionServerAccess().getQosKeyword_7_0());
                    			
                    // InternalRos2Parser.g:1075:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1076:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1076:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1077:6: lv_qos_9_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getActionServerAccess().getQosQualityOfServiceParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_9_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionServerRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_9_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getActionServerAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleActionServer"


    // $ANTLR start "entryRuleActionClient"
    // InternalRos2Parser.g:1103:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // InternalRos2Parser.g:1103:53: (iv_ruleActionClient= ruleActionClient EOF )
            // InternalRos2Parser.g:1104:2: iv_ruleActionClient= ruleActionClient EOF
            {
             newCompositeNode(grammarAccess.getActionClientRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionClient=ruleActionClient();

            state._fsp--;

             current =iv_ruleActionClient; 
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
    // $ANTLR end "entryRuleActionClient"


    // $ANTLR start "ruleActionClient"
    // InternalRos2Parser.g:1110:1: ruleActionClient returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleActionClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        EObject lv_qos_9_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1116:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) )
            // InternalRos2Parser.g:1117:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            {
            // InternalRos2Parser.g:1117:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            // InternalRos2Parser.g:1118:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END
            {
            // InternalRos2Parser.g:1118:3: ()
            // InternalRos2Parser.g:1119:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionClientAccess().getActionClientAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:1125:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1126:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1126:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1127:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionClientAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionClientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getActionClientAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getActionClientAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getActionClientAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:1156:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:1157:4: ( ruleEString )
            {
            // InternalRos2Parser.g:1157:4: ( ruleEString )
            // InternalRos2Parser.g:1158:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionClientAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:1172:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Ns) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRos2Parser.g:1173:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:1177:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1178:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1178:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1179:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionClientRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Ros.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:1197:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Qos) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRos2Parser.g:1198:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionClientAccess().getQosKeyword_7_0());
                    			
                    // InternalRos2Parser.g:1202:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1203:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1203:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1204:6: lv_qos_9_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getActionClientAccess().getQosQualityOfServiceParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_9_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionClientRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_9_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getActionClientAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleActionClient"


    // $ANTLR start "entryRuleParameter"
    // InternalRos2Parser.g:1230:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRos2Parser.g:1230:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRos2Parser.g:1231:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRos2Parser.g:1237:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END otherlv_11= RightCurlyBracket ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_namespace_7_0 = null;

        EObject lv_qos_9_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1243:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END otherlv_11= RightCurlyBracket ) )
            // InternalRos2Parser.g:1244:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END otherlv_11= RightCurlyBracket )
            {
            // InternalRos2Parser.g:1244:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END otherlv_11= RightCurlyBracket )
            // InternalRos2Parser.g:1245:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END otherlv_11= RightCurlyBracket
            {
            // InternalRos2Parser.g:1245:3: ()
            // InternalRos2Parser.g:1246:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:1252:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1253:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1253:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1254:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type,FOLLOW_29); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:1283:3: ( (lv_type_5_0= ruleParameterType ) )
            // InternalRos2Parser.g:1284:4: (lv_type_5_0= ruleParameterType )
            {
            // InternalRos2Parser.g:1284:4: (lv_type_5_0= ruleParameterType )
            // InternalRos2Parser.g:1285:5: lv_type_5_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_24);
            lv_type_5_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"de.fraunhofer.ipa.ros.Ros.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:1302:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Ns) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRos2Parser.g:1303:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:1307:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1308:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1308:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1309:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Ros.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:1327:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Qos) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRos2Parser.g:1328:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getQosKeyword_7_0());
                    			
                    // InternalRos2Parser.g:1332:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1333:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1333:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1334:6: lv_qos_9_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getQosQualityOfServiceParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_9_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_9_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_10=(Token)match(input,RULE_END,FOLLOW_30); 

            			newLeafNode(this_END_10, grammarAccess.getParameterAccess().getENDTerminalRuleCall_8());
            		
            otherlv_11=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEString"
    // InternalRos2Parser.g:1364:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRos2Parser.g:1364:47: (iv_ruleEString= ruleEString EOF )
            // InternalRos2Parser.g:1365:2: iv_ruleEString= ruleEString EOF
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
    // InternalRos2Parser.g:1371:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:1377:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRos2Parser.g:1378:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRos2Parser.g:1378:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalRos2Parser.g:1379:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:1387:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRosNames"
    // InternalRos2Parser.g:1398:1: entryRuleRosNames returns [String current=null] : iv_ruleRosNames= ruleRosNames EOF ;
    public final String entryRuleRosNames() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRosNames = null;


        try {
            // InternalRos2Parser.g:1398:48: (iv_ruleRosNames= ruleRosNames EOF )
            // InternalRos2Parser.g:1399:2: iv_ruleRosNames= ruleRosNames EOF
            {
             newCompositeNode(grammarAccess.getRosNamesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRosNames=ruleRosNames();

            state._fsp--;

             current =iv_ruleRosNames.getText(); 
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
    // $ANTLR end "entryRuleRosNames"


    // $ANTLR start "ruleRosNames"
    // InternalRos2Parser.g:1405:1: ruleRosNames returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node ) ;
    public final AntlrDatatypeRuleToken ruleRosNames() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ROS_CONVENTION_A_0=null;
        Token this_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:1411:2: ( (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node ) )
            // InternalRos2Parser.g:1412:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node )
            {
            // InternalRos2Parser.g:1412:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node )
            int alt30=3;
            switch ( input.LA(1) ) {
            case RULE_ROS_CONVENTION_A:
                {
                alt30=1;
                }
                break;
            case RULE_ID:
                {
                alt30=2;
                }
                break;
            case Node:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalRos2Parser.g:1413:3: this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A
                    {
                    this_ROS_CONVENTION_A_0=(Token)match(input,RULE_ROS_CONVENTION_A,FOLLOW_2); 

                    			current.merge(this_ROS_CONVENTION_A_0);
                    		

                    			newLeafNode(this_ROS_CONVENTION_A_0, grammarAccess.getRosNamesAccess().getROS_CONVENTION_ATerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:1421:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getRosNamesAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:1429:3: kw= Node
                    {
                    kw=(Token)match(input,Node,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRosNamesAccess().getNodeKeyword_2());
                    		

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
    // $ANTLR end "ruleRosNames"


    // $ANTLR start "entryRulePackage_Impl"
    // InternalRos2Parser.g:1438:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // InternalRos2Parser.g:1438:53: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // InternalRos2Parser.g:1439:2: iv_rulePackage_Impl= rulePackage_Impl EOF
            {
             newCompositeNode(grammarAccess.getPackage_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackage_Impl=rulePackage_Impl();

            state._fsp--;

             current =iv_rulePackage_Impl; 
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
    // $ANTLR end "entryRulePackage_Impl"


    // $ANTLR start "rulePackage_Impl"
    // InternalRos2Parser.g:1445:1: rulePackage_Impl returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN ( (lv_spec_8_0= ruleSpecBase ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END ) ;
    public final EObject rulePackage_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_fromGitRepo_5_0 = null;

        EObject lv_spec_8_0 = null;

        EObject lv_dependency_12_0 = null;

        EObject lv_dependency_14_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1451:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN ( (lv_spec_8_0= ruleSpecBase ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:1452:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN ( (lv_spec_8_0= ruleSpecBase ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:1452:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN ( (lv_spec_8_0= ruleSpecBase ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END )
            // InternalRos2Parser.g:1453:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN ( (lv_spec_8_0= ruleSpecBase ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:1453:3: ()
            // InternalRos2Parser.g:1454:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackage_ImplAccess().getPackageAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:1460:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:1461:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:1461:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:1462:5: lv_name_1_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getPackage_ImplAccess().getNameRosNamesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPackage_ImplAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_31); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRos2Parser.g:1487:3: (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==FromGitRepo) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRos2Parser.g:1488:4: otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,FromGitRepo,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackage_ImplAccess().getFromGitRepoKeyword_4_0());
                    			
                    // InternalRos2Parser.g:1492:4: ( (lv_fromGitRepo_5_0= ruleEString ) )
                    // InternalRos2Parser.g:1493:5: (lv_fromGitRepo_5_0= ruleEString )
                    {
                    // InternalRos2Parser.g:1493:5: (lv_fromGitRepo_5_0= ruleEString )
                    // InternalRos2Parser.g:1494:6: lv_fromGitRepo_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getFromGitRepoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_fromGitRepo_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    						}
                    						set(
                    							current,
                    							"fromGitRepo",
                    							lv_fromGitRepo_5_0,
                    							"de.fraunhofer.ipa.ros.Ros.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:1512:3: (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN ( (lv_spec_8_0= ruleSpecBase ) )* this_END_9= RULE_END )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Specs) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRos2Parser.g:1513:4: otherlv_6= Specs this_BEGIN_7= RULE_BEGIN ( (lv_spec_8_0= ruleSpecBase ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Specs,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getPackage_ImplAccess().getSpecsKeyword_5_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_33); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_5_1());
                    			
                    // InternalRos2Parser.g:1521:4: ( (lv_spec_8_0= ruleSpecBase ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Action_1||LA32_0==Msg||LA32_0==Srv) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalRos2Parser.g:1522:5: (lv_spec_8_0= ruleSpecBase )
                    	    {
                    	    // InternalRos2Parser.g:1522:5: (lv_spec_8_0= ruleSpecBase )
                    	    // InternalRos2Parser.g:1523:6: lv_spec_8_0= ruleSpecBase
                    	    {

                    	    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_5_2_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
                    	    lv_spec_8_0=ruleSpecBase();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"spec",
                    	    							lv_spec_8_0,
                    	    							"de.fraunhofer.ipa.ros.Ros.SpecBase");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_9); 

                    				newLeafNode(this_END_9, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_5_3());
                    			

                    }
                    break;

            }

            // InternalRos2Parser.g:1545:3: (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Dependencies) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRos2Parser.g:1546:4: otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket
                    {
                    otherlv_10=(Token)match(input,Dependencies,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getPackage_ImplAccess().getDependenciesKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,LeftSquareBracket,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getPackage_ImplAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalRos2Parser.g:1554:4: ( (lv_dependency_12_0= ruleDependency ) )
                    // InternalRos2Parser.g:1555:5: (lv_dependency_12_0= ruleDependency )
                    {
                    // InternalRos2Parser.g:1555:5: (lv_dependency_12_0= ruleDependency )
                    // InternalRos2Parser.g:1556:6: lv_dependency_12_0= ruleDependency
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getDependencyDependencyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_dependency_12_0=ruleDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    						}
                    						add(
                    							current,
                    							"dependency",
                    							lv_dependency_12_0,
                    							"de.fraunhofer.ipa.ros.Ros.Dependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:1573:4: (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==Comma) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalRos2Parser.g:1574:5: otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getPackage_ImplAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRos2Parser.g:1578:5: ( (lv_dependency_14_0= ruleDependency ) )
                    	    // InternalRos2Parser.g:1579:6: (lv_dependency_14_0= ruleDependency )
                    	    {
                    	    // InternalRos2Parser.g:1579:6: (lv_dependency_14_0= ruleDependency )
                    	    // InternalRos2Parser.g:1580:7: lv_dependency_14_0= ruleDependency
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getDependencyDependencyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_dependency_14_0=ruleDependency();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dependency",
                    	    								lv_dependency_14_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Dependency");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,RightSquareBracket,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getPackage_ImplAccess().getRightSquareBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_7());
            		

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
    // $ANTLR end "rulePackage_Impl"


    // $ANTLR start "entryRuleArtifact"
    // InternalRos2Parser.g:1611:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalRos2Parser.g:1611:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalRos2Parser.g:1612:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
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
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // InternalRos2Parser.g:1618:1: ruleArtifact returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_node_4_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1624:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END ) )
            // InternalRos2Parser.g:1625:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END )
            {
            // InternalRos2Parser.g:1625:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END )
            // InternalRos2Parser.g:1626:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END
            {
            // InternalRos2Parser.g:1626:3: ()
            // InternalRos2Parser.g:1627:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:1633:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:1634:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:1634:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:1635:5: lv_name_1_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getArtifactAccess().getNameRosNamesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtifactRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_34); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getArtifactAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRos2Parser.g:1660:3: ( (lv_node_4_0= ruleNode ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==Node_1) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRos2Parser.g:1661:4: (lv_node_4_0= ruleNode )
                    {
                    // InternalRos2Parser.g:1661:4: (lv_node_4_0= ruleNode )
                    // InternalRos2Parser.g:1662:5: lv_node_4_0= ruleNode
                    {

                    					newCompositeNode(grammarAccess.getArtifactAccess().getNodeNodeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_13);
                    lv_node_4_0=ruleNode();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getArtifactRule());
                    					}
                    					set(
                    						current,
                    						"node",
                    						lv_node_4_0,
                    						"de.fraunhofer.ipa.ros.Ros.Node");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getArtifactAccess().getENDTerminalRuleCall_5());
            		

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
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleNode"
    // InternalRos2Parser.g:1687:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRos2Parser.g:1687:45: (iv_ruleNode= ruleNode EOF )
            // InternalRos2Parser.g:1688:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalRos2Parser.g:1694:1: ruleNode returns [EObject current=null] : (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END ) | (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END ) | (otherlv_11= Serviceserver this_BEGIN_12= RULE_BEGIN ( (lv_serviceserver_13_0= ruleServiceServer ) )* this_END_14= RULE_END ) | (otherlv_15= Serviceclient this_BEGIN_16= RULE_BEGIN ( (lv_serviceclient_17_0= ruleServiceClient ) )* this_END_18= RULE_END ) | (otherlv_19= Actionserver this_BEGIN_20= RULE_BEGIN ( (lv_actionserver_21_0= ruleActionServer ) )* this_END_22= RULE_END ) | (otherlv_23= Actionclient this_BEGIN_24= RULE_BEGIN ( (lv_actionclient_25_0= ruleActionClient ) )* this_END_26= RULE_END ) | (otherlv_27= Parameters this_BEGIN_28= RULE_BEGIN ( (lv_parameter_29_0= ruleParameter ) )* this_END_30= RULE_END ) )* this_END_31= RULE_END ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
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
        Token otherlv_19=null;
        Token this_BEGIN_20=null;
        Token this_END_22=null;
        Token otherlv_23=null;
        Token this_BEGIN_24=null;
        Token this_END_26=null;
        Token otherlv_27=null;
        Token this_BEGIN_28=null;
        Token this_END_30=null;
        Token this_END_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_publisher_5_0 = null;

        EObject lv_subscriber_9_0 = null;

        EObject lv_serviceserver_13_0 = null;

        EObject lv_serviceclient_17_0 = null;

        EObject lv_actionserver_21_0 = null;

        EObject lv_actionclient_25_0 = null;

        EObject lv_parameter_29_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1700:2: ( (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END ) | (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END ) | (otherlv_11= Serviceserver this_BEGIN_12= RULE_BEGIN ( (lv_serviceserver_13_0= ruleServiceServer ) )* this_END_14= RULE_END ) | (otherlv_15= Serviceclient this_BEGIN_16= RULE_BEGIN ( (lv_serviceclient_17_0= ruleServiceClient ) )* this_END_18= RULE_END ) | (otherlv_19= Actionserver this_BEGIN_20= RULE_BEGIN ( (lv_actionserver_21_0= ruleActionServer ) )* this_END_22= RULE_END ) | (otherlv_23= Actionclient this_BEGIN_24= RULE_BEGIN ( (lv_actionclient_25_0= ruleActionClient ) )* this_END_26= RULE_END ) | (otherlv_27= Parameters this_BEGIN_28= RULE_BEGIN ( (lv_parameter_29_0= ruleParameter ) )* this_END_30= RULE_END ) )* this_END_31= RULE_END ) )
            // InternalRos2Parser.g:1701:2: (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END ) | (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END ) | (otherlv_11= Serviceserver this_BEGIN_12= RULE_BEGIN ( (lv_serviceserver_13_0= ruleServiceServer ) )* this_END_14= RULE_END ) | (otherlv_15= Serviceclient this_BEGIN_16= RULE_BEGIN ( (lv_serviceclient_17_0= ruleServiceClient ) )* this_END_18= RULE_END ) | (otherlv_19= Actionserver this_BEGIN_20= RULE_BEGIN ( (lv_actionserver_21_0= ruleActionServer ) )* this_END_22= RULE_END ) | (otherlv_23= Actionclient this_BEGIN_24= RULE_BEGIN ( (lv_actionclient_25_0= ruleActionClient ) )* this_END_26= RULE_END ) | (otherlv_27= Parameters this_BEGIN_28= RULE_BEGIN ( (lv_parameter_29_0= ruleParameter ) )* this_END_30= RULE_END ) )* this_END_31= RULE_END )
            {
            // InternalRos2Parser.g:1701:2: (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END ) | (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END ) | (otherlv_11= Serviceserver this_BEGIN_12= RULE_BEGIN ( (lv_serviceserver_13_0= ruleServiceServer ) )* this_END_14= RULE_END ) | (otherlv_15= Serviceclient this_BEGIN_16= RULE_BEGIN ( (lv_serviceclient_17_0= ruleServiceClient ) )* this_END_18= RULE_END ) | (otherlv_19= Actionserver this_BEGIN_20= RULE_BEGIN ( (lv_actionserver_21_0= ruleActionServer ) )* this_END_22= RULE_END ) | (otherlv_23= Actionclient this_BEGIN_24= RULE_BEGIN ( (lv_actionclient_25_0= ruleActionClient ) )* this_END_26= RULE_END ) | (otherlv_27= Parameters this_BEGIN_28= RULE_BEGIN ( (lv_parameter_29_0= ruleParameter ) )* this_END_30= RULE_END ) )* this_END_31= RULE_END )
            // InternalRos2Parser.g:1702:3: otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) this_BEGIN_2= RULE_BEGIN ( (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END ) | (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END ) | (otherlv_11= Serviceserver this_BEGIN_12= RULE_BEGIN ( (lv_serviceserver_13_0= ruleServiceServer ) )* this_END_14= RULE_END ) | (otherlv_15= Serviceclient this_BEGIN_16= RULE_BEGIN ( (lv_serviceclient_17_0= ruleServiceClient ) )* this_END_18= RULE_END ) | (otherlv_19= Actionserver this_BEGIN_20= RULE_BEGIN ( (lv_actionserver_21_0= ruleActionServer ) )* this_END_22= RULE_END ) | (otherlv_23= Actionclient this_BEGIN_24= RULE_BEGIN ( (lv_actionclient_25_0= ruleActionClient ) )* this_END_26= RULE_END ) | (otherlv_27= Parameters this_BEGIN_28= RULE_BEGIN ( (lv_parameter_29_0= ruleParameter ) )* this_END_30= RULE_END ) )* this_END_31= RULE_END
            {
            otherlv_0=(Token)match(input,Node_1,FOLLOW_35); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalRos2Parser.g:1706:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:1707:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:1707:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:1708:5: lv_name_1_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameRosNamesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRos2Parser.g:1729:3: ( (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END ) | (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END ) | (otherlv_11= Serviceserver this_BEGIN_12= RULE_BEGIN ( (lv_serviceserver_13_0= ruleServiceServer ) )* this_END_14= RULE_END ) | (otherlv_15= Serviceclient this_BEGIN_16= RULE_BEGIN ( (lv_serviceclient_17_0= ruleServiceClient ) )* this_END_18= RULE_END ) | (otherlv_19= Actionserver this_BEGIN_20= RULE_BEGIN ( (lv_actionserver_21_0= ruleActionServer ) )* this_END_22= RULE_END ) | (otherlv_23= Actionclient this_BEGIN_24= RULE_BEGIN ( (lv_actionclient_25_0= ruleActionClient ) )* this_END_26= RULE_END ) | (otherlv_27= Parameters this_BEGIN_28= RULE_BEGIN ( (lv_parameter_29_0= ruleParameter ) )* this_END_30= RULE_END ) )*
            loop44:
            do {
                int alt44=8;
                switch ( input.LA(1) ) {
                case Publishers:
                    {
                    alt44=1;
                    }
                    break;
                case Subscribers:
                    {
                    alt44=2;
                    }
                    break;
                case Serviceserver:
                    {
                    alt44=3;
                    }
                    break;
                case Serviceclient:
                    {
                    alt44=4;
                    }
                    break;
                case Actionserver:
                    {
                    alt44=5;
                    }
                    break;
                case Actionclient:
                    {
                    alt44=6;
                    }
                    break;
                case Parameters:
                    {
                    alt44=7;
                    }
                    break;

                }

                switch (alt44) {
            	case 1 :
            	    // InternalRos2Parser.g:1730:4: (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END )
            	    {
            	    // InternalRos2Parser.g:1730:4: (otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END )
            	    // InternalRos2Parser.g:1731:5: otherlv_3= Publishers this_BEGIN_4= RULE_BEGIN ( (lv_publisher_5_0= rulePublisher ) )* this_END_6= RULE_END
            	    {
            	    otherlv_3=(Token)match(input,Publishers,FOLLOW_4); 

            	    					newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getPublishersKeyword_3_0_0());
            	    				
            	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            	    					newLeafNode(this_BEGIN_4, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_0_1());
            	    				
            	    // InternalRos2Parser.g:1739:5: ( (lv_publisher_5_0= rulePublisher ) )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==RULE_ID||LA37_0==RULE_STRING) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:1740:6: (lv_publisher_5_0= rulePublisher )
            	    	    {
            	    	    // InternalRos2Parser.g:1740:6: (lv_publisher_5_0= rulePublisher )
            	    	    // InternalRos2Parser.g:1741:7: lv_publisher_5_0= rulePublisher
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_3_0_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_37);
            	    	    lv_publisher_5_0=rulePublisher();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"publisher",
            	    	    								lv_publisher_5_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.Publisher");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);

            	    this_END_6=(Token)match(input,RULE_END,FOLLOW_36); 

            	    					newLeafNode(this_END_6, grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRos2Parser.g:1764:4: (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END )
            	    {
            	    // InternalRos2Parser.g:1764:4: (otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END )
            	    // InternalRos2Parser.g:1765:5: otherlv_7= Subscribers this_BEGIN_8= RULE_BEGIN ( (lv_subscriber_9_0= ruleSubscriber ) )* this_END_10= RULE_END
            	    {
            	    otherlv_7=(Token)match(input,Subscribers,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getSubscribersKeyword_3_1_0());
            	    				
            	    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            	    					newLeafNode(this_BEGIN_8, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_1_1());
            	    				
            	    // InternalRos2Parser.g:1773:5: ( (lv_subscriber_9_0= ruleSubscriber ) )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==RULE_ID||LA38_0==RULE_STRING) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:1774:6: (lv_subscriber_9_0= ruleSubscriber )
            	    	    {
            	    	    // InternalRos2Parser.g:1774:6: (lv_subscriber_9_0= ruleSubscriber )
            	    	    // InternalRos2Parser.g:1775:7: lv_subscriber_9_0= ruleSubscriber
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_3_1_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_37);
            	    	    lv_subscriber_9_0=ruleSubscriber();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"subscriber",
            	    	    								lv_subscriber_9_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.Subscriber");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop38;
            	        }
            	    } while (true);

            	    this_END_10=(Token)match(input,RULE_END,FOLLOW_36); 

            	    					newLeafNode(this_END_10, grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRos2Parser.g:1798:4: (otherlv_11= Serviceserver this_BEGIN_12= RULE_BEGIN ( (lv_serviceserver_13_0= ruleServiceServer ) )* this_END_14= RULE_END )
            	    {
            	    // InternalRos2Parser.g:1798:4: (otherlv_11= Serviceserver this_BEGIN_12= RULE_BEGIN ( (lv_serviceserver_13_0= ruleServiceServer ) )* this_END_14= RULE_END )
            	    // InternalRos2Parser.g:1799:5: otherlv_11= Serviceserver this_BEGIN_12= RULE_BEGIN ( (lv_serviceserver_13_0= ruleServiceServer ) )* this_END_14= RULE_END
            	    {
            	    otherlv_11=(Token)match(input,Serviceserver,FOLLOW_4); 

            	    					newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getServiceserverKeyword_3_2_0());
            	    				
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            	    					newLeafNode(this_BEGIN_12, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_2_1());
            	    				
            	    // InternalRos2Parser.g:1807:5: ( (lv_serviceserver_13_0= ruleServiceServer ) )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==RULE_ID||LA39_0==RULE_STRING) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:1808:6: (lv_serviceserver_13_0= ruleServiceServer )
            	    	    {
            	    	    // InternalRos2Parser.g:1808:6: (lv_serviceserver_13_0= ruleServiceServer )
            	    	    // InternalRos2Parser.g:1809:7: lv_serviceserver_13_0= ruleServiceServer
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_3_2_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_37);
            	    	    lv_serviceserver_13_0=ruleServiceServer();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"serviceserver",
            	    	    								lv_serviceserver_13_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.ServiceServer");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);

            	    this_END_14=(Token)match(input,RULE_END,FOLLOW_36); 

            	    					newLeafNode(this_END_14, grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_2_3());
            	    				

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRos2Parser.g:1832:4: (otherlv_15= Serviceclient this_BEGIN_16= RULE_BEGIN ( (lv_serviceclient_17_0= ruleServiceClient ) )* this_END_18= RULE_END )
            	    {
            	    // InternalRos2Parser.g:1832:4: (otherlv_15= Serviceclient this_BEGIN_16= RULE_BEGIN ( (lv_serviceclient_17_0= ruleServiceClient ) )* this_END_18= RULE_END )
            	    // InternalRos2Parser.g:1833:5: otherlv_15= Serviceclient this_BEGIN_16= RULE_BEGIN ( (lv_serviceclient_17_0= ruleServiceClient ) )* this_END_18= RULE_END
            	    {
            	    otherlv_15=(Token)match(input,Serviceclient,FOLLOW_4); 

            	    					newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getServiceclientKeyword_3_3_0());
            	    				
            	    this_BEGIN_16=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            	    					newLeafNode(this_BEGIN_16, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_3_1());
            	    				
            	    // InternalRos2Parser.g:1841:5: ( (lv_serviceclient_17_0= ruleServiceClient ) )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==RULE_ID||LA40_0==RULE_STRING) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:1842:6: (lv_serviceclient_17_0= ruleServiceClient )
            	    	    {
            	    	    // InternalRos2Parser.g:1842:6: (lv_serviceclient_17_0= ruleServiceClient )
            	    	    // InternalRos2Parser.g:1843:7: lv_serviceclient_17_0= ruleServiceClient
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_3_3_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_37);
            	    	    lv_serviceclient_17_0=ruleServiceClient();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"serviceclient",
            	    	    								lv_serviceclient_17_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.ServiceClient");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);

            	    this_END_18=(Token)match(input,RULE_END,FOLLOW_36); 

            	    					newLeafNode(this_END_18, grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_3_3());
            	    				

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRos2Parser.g:1866:4: (otherlv_19= Actionserver this_BEGIN_20= RULE_BEGIN ( (lv_actionserver_21_0= ruleActionServer ) )* this_END_22= RULE_END )
            	    {
            	    // InternalRos2Parser.g:1866:4: (otherlv_19= Actionserver this_BEGIN_20= RULE_BEGIN ( (lv_actionserver_21_0= ruleActionServer ) )* this_END_22= RULE_END )
            	    // InternalRos2Parser.g:1867:5: otherlv_19= Actionserver this_BEGIN_20= RULE_BEGIN ( (lv_actionserver_21_0= ruleActionServer ) )* this_END_22= RULE_END
            	    {
            	    otherlv_19=(Token)match(input,Actionserver,FOLLOW_4); 

            	    					newLeafNode(otherlv_19, grammarAccess.getNodeAccess().getActionserverKeyword_3_4_0());
            	    				
            	    this_BEGIN_20=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            	    					newLeafNode(this_BEGIN_20, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_4_1());
            	    				
            	    // InternalRos2Parser.g:1875:5: ( (lv_actionserver_21_0= ruleActionServer ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==RULE_ID||LA41_0==RULE_STRING) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:1876:6: (lv_actionserver_21_0= ruleActionServer )
            	    	    {
            	    	    // InternalRos2Parser.g:1876:6: (lv_actionserver_21_0= ruleActionServer )
            	    	    // InternalRos2Parser.g:1877:7: lv_actionserver_21_0= ruleActionServer
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_3_4_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_37);
            	    	    lv_actionserver_21_0=ruleActionServer();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"actionserver",
            	    	    								lv_actionserver_21_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.ActionServer");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);

            	    this_END_22=(Token)match(input,RULE_END,FOLLOW_36); 

            	    					newLeafNode(this_END_22, grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_4_3());
            	    				

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRos2Parser.g:1900:4: (otherlv_23= Actionclient this_BEGIN_24= RULE_BEGIN ( (lv_actionclient_25_0= ruleActionClient ) )* this_END_26= RULE_END )
            	    {
            	    // InternalRos2Parser.g:1900:4: (otherlv_23= Actionclient this_BEGIN_24= RULE_BEGIN ( (lv_actionclient_25_0= ruleActionClient ) )* this_END_26= RULE_END )
            	    // InternalRos2Parser.g:1901:5: otherlv_23= Actionclient this_BEGIN_24= RULE_BEGIN ( (lv_actionclient_25_0= ruleActionClient ) )* this_END_26= RULE_END
            	    {
            	    otherlv_23=(Token)match(input,Actionclient,FOLLOW_4); 

            	    					newLeafNode(otherlv_23, grammarAccess.getNodeAccess().getActionclientKeyword_3_5_0());
            	    				
            	    this_BEGIN_24=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            	    					newLeafNode(this_BEGIN_24, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_5_1());
            	    				
            	    // InternalRos2Parser.g:1909:5: ( (lv_actionclient_25_0= ruleActionClient ) )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==RULE_ID||LA42_0==RULE_STRING) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:1910:6: (lv_actionclient_25_0= ruleActionClient )
            	    	    {
            	    	    // InternalRos2Parser.g:1910:6: (lv_actionclient_25_0= ruleActionClient )
            	    	    // InternalRos2Parser.g:1911:7: lv_actionclient_25_0= ruleActionClient
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_3_5_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_37);
            	    	    lv_actionclient_25_0=ruleActionClient();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"actionclient",
            	    	    								lv_actionclient_25_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.ActionClient");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop42;
            	        }
            	    } while (true);

            	    this_END_26=(Token)match(input,RULE_END,FOLLOW_36); 

            	    					newLeafNode(this_END_26, grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_5_3());
            	    				

            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRos2Parser.g:1934:4: (otherlv_27= Parameters this_BEGIN_28= RULE_BEGIN ( (lv_parameter_29_0= ruleParameter ) )* this_END_30= RULE_END )
            	    {
            	    // InternalRos2Parser.g:1934:4: (otherlv_27= Parameters this_BEGIN_28= RULE_BEGIN ( (lv_parameter_29_0= ruleParameter ) )* this_END_30= RULE_END )
            	    // InternalRos2Parser.g:1935:5: otherlv_27= Parameters this_BEGIN_28= RULE_BEGIN ( (lv_parameter_29_0= ruleParameter ) )* this_END_30= RULE_END
            	    {
            	    otherlv_27=(Token)match(input,Parameters,FOLLOW_4); 

            	    					newLeafNode(otherlv_27, grammarAccess.getNodeAccess().getParametersKeyword_3_6_0());
            	    				
            	    this_BEGIN_28=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            	    					newLeafNode(this_BEGIN_28, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_6_1());
            	    				
            	    // InternalRos2Parser.g:1943:5: ( (lv_parameter_29_0= ruleParameter ) )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==RULE_ID||LA43_0==RULE_STRING) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:1944:6: (lv_parameter_29_0= ruleParameter )
            	    	    {
            	    	    // InternalRos2Parser.g:1944:6: (lv_parameter_29_0= ruleParameter )
            	    	    // InternalRos2Parser.g:1945:7: lv_parameter_29_0= ruleParameter
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_3_6_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_37);
            	    	    lv_parameter_29_0=ruleParameter();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"parameter",
            	    	    								lv_parameter_29_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.Parameter");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);

            	    this_END_30=(Token)match(input,RULE_END,FOLLOW_36); 

            	    					newLeafNode(this_END_30, grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_6_3());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            this_END_31=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_31, grammarAccess.getNodeAccess().getENDTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleSpecBase"
    // InternalRos2Parser.g:1976:1: entryRuleSpecBase returns [EObject current=null] : iv_ruleSpecBase= ruleSpecBase EOF ;
    public final EObject entryRuleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBase = null;


        try {
            // InternalRos2Parser.g:1976:49: (iv_ruleSpecBase= ruleSpecBase EOF )
            // InternalRos2Parser.g:1977:2: iv_ruleSpecBase= ruleSpecBase EOF
            {
             newCompositeNode(grammarAccess.getSpecBaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecBase=ruleSpecBase();

            state._fsp--;

             current =iv_ruleSpecBase; 
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
    // $ANTLR end "entryRuleSpecBase"


    // $ANTLR start "ruleSpecBase"
    // InternalRos2Parser.g:1983:1: ruleSpecBase returns [EObject current=null] : (this_TopicSpec_0= ruleTopicSpec | this_ServiceSpec_1= ruleServiceSpec | this_ActionSpec_2= ruleActionSpec ) ;
    public final EObject ruleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject this_TopicSpec_0 = null;

        EObject this_ServiceSpec_1 = null;

        EObject this_ActionSpec_2 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1989:2: ( (this_TopicSpec_0= ruleTopicSpec | this_ServiceSpec_1= ruleServiceSpec | this_ActionSpec_2= ruleActionSpec ) )
            // InternalRos2Parser.g:1990:2: (this_TopicSpec_0= ruleTopicSpec | this_ServiceSpec_1= ruleServiceSpec | this_ActionSpec_2= ruleActionSpec )
            {
            // InternalRos2Parser.g:1990:2: (this_TopicSpec_0= ruleTopicSpec | this_ServiceSpec_1= ruleServiceSpec | this_ActionSpec_2= ruleActionSpec )
            int alt45=3;
            switch ( input.LA(1) ) {
            case Msg:
                {
                alt45=1;
                }
                break;
            case Srv:
                {
                alt45=2;
                }
                break;
            case Action_1:
                {
                alt45=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalRos2Parser.g:1991:3: this_TopicSpec_0= ruleTopicSpec
                    {

                    			newCompositeNode(grammarAccess.getSpecBaseAccess().getTopicSpecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TopicSpec_0=ruleTopicSpec();

                    state._fsp--;


                    			current = this_TopicSpec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:2000:3: this_ServiceSpec_1= ruleServiceSpec
                    {

                    			newCompositeNode(grammarAccess.getSpecBaseAccess().getServiceSpecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServiceSpec_1=ruleServiceSpec();

                    state._fsp--;


                    			current = this_ServiceSpec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:2009:3: this_ActionSpec_2= ruleActionSpec
                    {

                    			newCompositeNode(grammarAccess.getSpecBaseAccess().getActionSpecParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ActionSpec_2=ruleActionSpec();

                    state._fsp--;


                    			current = this_ActionSpec_2;
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
    // $ANTLR end "ruleSpecBase"


    // $ANTLR start "entryRuleTopicSpec"
    // InternalRos2Parser.g:2021:1: entryRuleTopicSpec returns [EObject current=null] : iv_ruleTopicSpec= ruleTopicSpec EOF ;
    public final EObject entryRuleTopicSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpec = null;


        try {
            // InternalRos2Parser.g:2021:50: (iv_ruleTopicSpec= ruleTopicSpec EOF )
            // InternalRos2Parser.g:2022:2: iv_ruleTopicSpec= ruleTopicSpec EOF
            {
             newCompositeNode(grammarAccess.getTopicSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopicSpec=ruleTopicSpec();

            state._fsp--;

             current =iv_ruleTopicSpec; 
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
    // $ANTLR end "entryRuleTopicSpec"


    // $ANTLR start "ruleTopicSpec"
    // InternalRos2Parser.g:2028:1: ruleTopicSpec returns [EObject current=null] : ( () otherlv_1= Msg ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Message_1 (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? this_END_8= RULE_END ) ;
    public final EObject ruleTopicSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_2=null;
        Token lv_name_2_3=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_2_1 = null;

        EObject lv_message_6_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2034:2: ( ( () otherlv_1= Msg ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Message_1 (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? this_END_8= RULE_END ) )
            // InternalRos2Parser.g:2035:2: ( () otherlv_1= Msg ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Message_1 (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? this_END_8= RULE_END )
            {
            // InternalRos2Parser.g:2035:2: ( () otherlv_1= Msg ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Message_1 (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? this_END_8= RULE_END )
            // InternalRos2Parser.g:2036:3: () otherlv_1= Msg ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Message_1 (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? this_END_8= RULE_END
            {
            // InternalRos2Parser.g:2036:3: ()
            // InternalRos2Parser.g:2037:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicSpecAccess().getTopicSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Msg,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicSpecAccess().getMsgKeyword_1());
            		
            // InternalRos2Parser.g:2047:3: ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) )
            // InternalRos2Parser.g:2048:4: ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) )
            {
            // InternalRos2Parser.g:2048:4: ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) )
            // InternalRos2Parser.g:2049:5: (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String )
            {
            // InternalRos2Parser.g:2049:5: (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String )
            int alt46=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt46=1;
                }
                break;
            case Header:
                {
                alt46=2;
                }
                break;
            case String:
                {
                alt46=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalRos2Parser.g:2050:6: lv_name_2_1= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTopicSpecAccess().getNameEStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_2_1=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopicSpecRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_2_1,
                    							"de.fraunhofer.ipa.ros.Ros.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:2066:6: lv_name_2_2= Header
                    {
                    lv_name_2_2=(Token)match(input,Header,FOLLOW_4); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getTopicSpecAccess().getNameHeaderKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicSpecRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:2077:6: lv_name_2_3= String
                    {
                    lv_name_2_3=(Token)match(input,String,FOLLOW_4); 

                    						newLeafNode(lv_name_2_3, grammarAccess.getTopicSpecAccess().getNameStringKeyword_2_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicSpecRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_2_3, null);
                    					

                    }
                    break;

            }


            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getTopicSpecAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Message_1,FOLLOW_40); 

            			newLeafNode(otherlv_4, grammarAccess.getTopicSpecAccess().getMessageKeyword_4());
            		
            // InternalRos2Parser.g:2098:3: (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_BEGIN) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRos2Parser.g:2099:4: this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

                    				newLeafNode(this_BEGIN_5, grammarAccess.getTopicSpecAccess().getBEGINTerminalRuleCall_5_0());
                    			
                    // InternalRos2Parser.g:2103:4: ( (lv_message_6_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2104:5: (lv_message_6_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2104:5: (lv_message_6_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2105:6: lv_message_6_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getTopicSpecAccess().getMessageMessageDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_message_6_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopicSpecRule());
                    						}
                    						set(
                    							current,
                    							"message",
                    							lv_message_6_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_13); 

                    				newLeafNode(this_END_7, grammarAccess.getTopicSpecAccess().getENDTerminalRuleCall_5_2());
                    			

                    }
                    break;

            }

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getTopicSpecAccess().getENDTerminalRuleCall_6());
            		

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
    // $ANTLR end "ruleTopicSpec"


    // $ANTLR start "entryRuleServiceSpec"
    // InternalRos2Parser.g:2135:1: entryRuleServiceSpec returns [EObject current=null] : iv_ruleServiceSpec= ruleServiceSpec EOF ;
    public final EObject entryRuleServiceSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSpec = null;


        try {
            // InternalRos2Parser.g:2135:52: (iv_ruleServiceSpec= ruleServiceSpec EOF )
            // InternalRos2Parser.g:2136:2: iv_ruleServiceSpec= ruleServiceSpec EOF
            {
             newCompositeNode(grammarAccess.getServiceSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceSpec=ruleServiceSpec();

            state._fsp--;

             current =iv_ruleServiceSpec; 
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
    // $ANTLR end "entryRuleServiceSpec"


    // $ANTLR start "ruleServiceSpec"
    // InternalRos2Parser.g:2142:1: ruleServiceSpec returns [EObject current=null] : ( () otherlv_1= Srv ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Request (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Response (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? this_END_12= RULE_END ) ;
    public final EObject ruleServiceSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_request_6_0 = null;

        EObject lv_response_10_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2148:2: ( ( () otherlv_1= Srv ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Request (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Response (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? this_END_12= RULE_END ) )
            // InternalRos2Parser.g:2149:2: ( () otherlv_1= Srv ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Request (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Response (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? this_END_12= RULE_END )
            {
            // InternalRos2Parser.g:2149:2: ( () otherlv_1= Srv ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Request (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Response (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? this_END_12= RULE_END )
            // InternalRos2Parser.g:2150:3: () otherlv_1= Srv ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Request (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Response (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? this_END_12= RULE_END
            {
            // InternalRos2Parser.g:2150:3: ()
            // InternalRos2Parser.g:2151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceSpecAccess().getServiceSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Srv,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceSpecAccess().getSrvKeyword_1());
            		
            // InternalRos2Parser.g:2161:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos2Parser.g:2162:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos2Parser.g:2162:4: (lv_name_2_0= ruleEString )
            // InternalRos2Parser.g:2163:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceSpecAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceSpecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Request,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceSpecAccess().getRequestKeyword_4());
            		
            // InternalRos2Parser.g:2188:3: (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_BEGIN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRos2Parser.g:2189:4: this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

                    				newLeafNode(this_BEGIN_5, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_5_0());
                    			
                    // InternalRos2Parser.g:2193:4: ( (lv_request_6_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2194:5: (lv_request_6_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2194:5: (lv_request_6_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2195:6: lv_request_6_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getRequestMessageDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_request_6_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceSpecRule());
                    						}
                    						set(
                    							current,
                    							"request",
                    							lv_request_6_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_44); 

                    				newLeafNode(this_END_7, grammarAccess.getServiceSpecAccess().getENDTerminalRuleCall_5_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,Response,FOLLOW_40); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceSpecAccess().getResponseKeyword_6());
            		
            // InternalRos2Parser.g:2221:3: (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_BEGIN) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRos2Parser.g:2222:4: this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END
                    {
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

                    				newLeafNode(this_BEGIN_9, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_7_0());
                    			
                    // InternalRos2Parser.g:2226:4: ( (lv_response_10_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2227:5: (lv_response_10_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2227:5: (lv_response_10_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2228:6: lv_response_10_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getResponseMessageDefinitionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_response_10_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceSpecRule());
                    						}
                    						set(
                    							current,
                    							"response",
                    							lv_response_10_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_11=(Token)match(input,RULE_END,FOLLOW_13); 

                    				newLeafNode(this_END_11, grammarAccess.getServiceSpecAccess().getENDTerminalRuleCall_7_2());
                    			

                    }
                    break;

            }

            this_END_12=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_12, grammarAccess.getServiceSpecAccess().getENDTerminalRuleCall_8());
            		

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
    // $ANTLR end "ruleServiceSpec"


    // $ANTLR start "entryRuleActionSpec"
    // InternalRos2Parser.g:2258:1: entryRuleActionSpec returns [EObject current=null] : iv_ruleActionSpec= ruleActionSpec EOF ;
    public final EObject entryRuleActionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSpec = null;


        try {
            // InternalRos2Parser.g:2258:51: (iv_ruleActionSpec= ruleActionSpec EOF )
            // InternalRos2Parser.g:2259:2: iv_ruleActionSpec= ruleActionSpec EOF
            {
             newCompositeNode(grammarAccess.getActionSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActionSpec=ruleActionSpec();

            state._fsp--;

             current =iv_ruleActionSpec; 
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
    // $ANTLR end "entryRuleActionSpec"


    // $ANTLR start "ruleActionSpec"
    // InternalRos2Parser.g:2265:1: ruleActionSpec returns [EObject current=null] : ( () otherlv_1= Action_1 ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Goal_1 (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Result_1 (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? otherlv_12= Feedback_1 (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )? this_END_16= RULE_END ) ;
    public final EObject ruleActionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        Token otherlv_12=null;
        Token this_BEGIN_13=null;
        Token this_END_15=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_goal_6_0 = null;

        EObject lv_result_10_0 = null;

        EObject lv_feedback_14_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2271:2: ( ( () otherlv_1= Action_1 ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Goal_1 (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Result_1 (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? otherlv_12= Feedback_1 (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:2272:2: ( () otherlv_1= Action_1 ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Goal_1 (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Result_1 (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? otherlv_12= Feedback_1 (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:2272:2: ( () otherlv_1= Action_1 ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Goal_1 (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Result_1 (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? otherlv_12= Feedback_1 (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )? this_END_16= RULE_END )
            // InternalRos2Parser.g:2273:3: () otherlv_1= Action_1 ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Goal_1 (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Result_1 (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? otherlv_12= Feedback_1 (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:2273:3: ()
            // InternalRos2Parser.g:2274:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionSpecAccess().getActionSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Action_1,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getActionSpecAccess().getActionKeyword_1());
            		
            // InternalRos2Parser.g:2284:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos2Parser.g:2285:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos2Parser.g:2285:4: (lv_name_2_0= ruleEString )
            // InternalRos2Parser.g:2286:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionSpecAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionSpecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_45); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Goal_1,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getActionSpecAccess().getGoalKeyword_4());
            		
            // InternalRos2Parser.g:2311:3: (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_BEGIN) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRos2Parser.g:2312:4: this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

                    				newLeafNode(this_BEGIN_5, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_5_0());
                    			
                    // InternalRos2Parser.g:2316:4: ( (lv_goal_6_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2317:5: (lv_goal_6_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2317:5: (lv_goal_6_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2318:6: lv_goal_6_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getGoalMessageDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_goal_6_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"goal",
                    							lv_goal_6_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_47); 

                    				newLeafNode(this_END_7, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_5_2());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,Result_1,FOLLOW_48); 

            			newLeafNode(otherlv_8, grammarAccess.getActionSpecAccess().getResultKeyword_6());
            		
            // InternalRos2Parser.g:2344:3: (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_BEGIN) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRos2Parser.g:2345:4: this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END
                    {
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

                    				newLeafNode(this_BEGIN_9, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_7_0());
                    			
                    // InternalRos2Parser.g:2349:4: ( (lv_result_10_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2350:5: (lv_result_10_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2350:5: (lv_result_10_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2351:6: lv_result_10_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getResultMessageDefinitionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_result_10_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"result",
                    							lv_result_10_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_11=(Token)match(input,RULE_END,FOLLOW_49); 

                    				newLeafNode(this_END_11, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_7_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,Feedback_1,FOLLOW_40); 

            			newLeafNode(otherlv_12, grammarAccess.getActionSpecAccess().getFeedbackKeyword_8());
            		
            // InternalRos2Parser.g:2377:3: (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_BEGIN) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRos2Parser.g:2378:4: this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END
                    {
                    this_BEGIN_13=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

                    				newLeafNode(this_BEGIN_13, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_9_0());
                    			
                    // InternalRos2Parser.g:2382:4: ( (lv_feedback_14_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2383:5: (lv_feedback_14_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2383:5: (lv_feedback_14_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2384:6: lv_feedback_14_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getFeedbackMessageDefinitionParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_feedback_14_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"feedback",
                    							lv_feedback_14_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_15=(Token)match(input,RULE_END,FOLLOW_13); 

                    				newLeafNode(this_END_15, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_9_2());
                    			

                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_10());
            		

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
    // $ANTLR end "ruleActionSpec"


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalRos2Parser.g:2414:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalRos2Parser.g:2414:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalRos2Parser.g:2415:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
            {
             newCompositeNode(grammarAccess.getMessageDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageDefinition=ruleMessageDefinition();

            state._fsp--;

             current =iv_ruleMessageDefinition; 
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
    // $ANTLR end "entryRuleMessageDefinition"


    // $ANTLR start "ruleMessageDefinition"
    // InternalRos2Parser.g:2421:1: ruleMessageDefinition returns [EObject current=null] : ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_MessagePart_1_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2427:2: ( ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* ) )
            // InternalRos2Parser.g:2428:2: ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* )
            {
            // InternalRos2Parser.g:2428:2: ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* )
            // InternalRos2Parser.g:2429:3: () ( (lv_MessagePart_1_0= ruleMessagePart ) )*
            {
            // InternalRos2Parser.g:2429:3: ()
            // InternalRos2Parser.g:2430:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:2436:3: ( (lv_MessagePart_1_0= ruleMessagePart ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( ((LA53_0>=Float32_1 && LA53_0<=Float64_1)||LA53_0==Duration||(LA53_0>=String_2 && LA53_0<=Uint64_1)||(LA53_0>=Float32 && LA53_0<=Int64_1)||LA53_0==Uint8_1||LA53_0==Header||(LA53_0>=Bool_1 && LA53_0<=Byte_1)||LA53_0==Int8_1||(LA53_0>=String_1 && LA53_0<=Uint64)||(LA53_0>=Int16 && LA53_0<=Int64)||LA53_0==Uint8||(LA53_0>=Bool && LA53_0<=Byte)||LA53_0==Int8||LA53_0==Time||LA53_0==RULE_ID||LA53_0==RULE_STRING) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalRos2Parser.g:2437:4: (lv_MessagePart_1_0= ruleMessagePart )
            	    {
            	    // InternalRos2Parser.g:2437:4: (lv_MessagePart_1_0= ruleMessagePart )
            	    // InternalRos2Parser.g:2438:5: lv_MessagePart_1_0= ruleMessagePart
            	    {

            	    					newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_50);
            	    lv_MessagePart_1_0=ruleMessagePart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMessageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"MessagePart",
            	    						lv_MessagePart_1_0,
            	    						"de.fraunhofer.ipa.ros.Ros.MessagePart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


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
    // $ANTLR end "ruleMessageDefinition"


    // $ANTLR start "entryRuleDependency"
    // InternalRos2Parser.g:2459:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalRos2Parser.g:2459:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalRos2Parser.g:2460:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalRos2Parser.g:2466:1: ruleDependency returns [EObject current=null] : (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDependency_0 = null;

        EObject this_ExternalDependency_1 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2472:2: ( (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) )
            // InternalRos2Parser.g:2473:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            {
            // InternalRos2Parser.g:2473:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID||LA54_0==RULE_STRING) ) {
                alt54=1;
            }
            else if ( (LA54_0==ExternalDependency) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalRos2Parser.g:2474:3: this_PackageDependency_0= rulePackageDependency
                    {

                    			newCompositeNode(grammarAccess.getDependencyAccess().getPackageDependencyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDependency_0=rulePackageDependency();

                    state._fsp--;


                    			current = this_PackageDependency_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:2483:3: this_ExternalDependency_1= ruleExternalDependency
                    {

                    			newCompositeNode(grammarAccess.getDependencyAccess().getExternalDependencyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalDependency_1=ruleExternalDependency();

                    state._fsp--;


                    			current = this_ExternalDependency_1;
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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRulePackageDependency"
    // InternalRos2Parser.g:2495:1: entryRulePackageDependency returns [EObject current=null] : iv_rulePackageDependency= rulePackageDependency EOF ;
    public final EObject entryRulePackageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDependency = null;


        try {
            // InternalRos2Parser.g:2495:58: (iv_rulePackageDependency= rulePackageDependency EOF )
            // InternalRos2Parser.g:2496:2: iv_rulePackageDependency= rulePackageDependency EOF
            {
             newCompositeNode(grammarAccess.getPackageDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDependency=rulePackageDependency();

            state._fsp--;

             current =iv_rulePackageDependency; 
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
    // $ANTLR end "entryRulePackageDependency"


    // $ANTLR start "rulePackageDependency"
    // InternalRos2Parser.g:2502:1: rulePackageDependency returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject rulePackageDependency() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRos2Parser.g:2508:2: ( ( ( ruleEString ) ) )
            // InternalRos2Parser.g:2509:2: ( ( ruleEString ) )
            {
            // InternalRos2Parser.g:2509:2: ( ( ruleEString ) )
            // InternalRos2Parser.g:2510:3: ( ruleEString )
            {
            // InternalRos2Parser.g:2510:3: ( ruleEString )
            // InternalRos2Parser.g:2511:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getPackageDependencyRule());
            				}
            			

            				newCompositeNode(grammarAccess.getPackageDependencyAccess().getPackagePackageCrossReference_0());
            			
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
    // $ANTLR end "rulePackageDependency"


    // $ANTLR start "entryRuleExternalDependency"
    // InternalRos2Parser.g:2528:1: entryRuleExternalDependency returns [EObject current=null] : iv_ruleExternalDependency= ruleExternalDependency EOF ;
    public final EObject entryRuleExternalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDependency = null;


        try {
            // InternalRos2Parser.g:2528:59: (iv_ruleExternalDependency= ruleExternalDependency EOF )
            // InternalRos2Parser.g:2529:2: iv_ruleExternalDependency= ruleExternalDependency EOF
            {
             newCompositeNode(grammarAccess.getExternalDependencyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalDependency=ruleExternalDependency();

            state._fsp--;

             current =iv_ruleExternalDependency; 
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
    // $ANTLR end "entryRuleExternalDependency"


    // $ANTLR start "ruleExternalDependency"
    // InternalRos2Parser.g:2535:1: ruleExternalDependency returns [EObject current=null] : ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2541:2: ( ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRos2Parser.g:2542:2: ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRos2Parser.g:2542:2: ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) )
            // InternalRos2Parser.g:2543:3: () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRos2Parser.g:2543:3: ()
            // InternalRos2Parser.g:2544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ExternalDependency,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1());
            		
            // InternalRos2Parser.g:2554:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos2Parser.g:2555:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos2Parser.g:2555:4: (lv_name_2_0= ruleEString )
            // InternalRos2Parser.g:2556:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalDependencyAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalDependencyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
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
    // $ANTLR end "ruleExternalDependency"


    // $ANTLR start "entryRuleNamespace"
    // InternalRos2Parser.g:2577:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRos2Parser.g:2577:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRos2Parser.g:2578:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalRos2Parser.g:2584:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2590:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRos2Parser.g:2591:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRos2Parser.g:2591:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt55=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt55=1;
                }
                break;
            case RelativeNamespace:
                {
                alt55=2;
                }
                break;
            case PrivateNamespace:
                {
                alt55=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalRos2Parser.g:2592:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalRos2Parser.g:2601:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalRos2Parser.g:2610:3: this_PrivateNamespace_2= rulePrivateNamespace
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
    // InternalRos2Parser.g:2622:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRos2Parser.g:2622:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRos2Parser.g:2623:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalRos2Parser.g:2629:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= GraphName ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:2635:2: (kw= GraphName )
            // InternalRos2Parser.g:2636:2: kw= GraphName
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
    // InternalRos2Parser.g:2644:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRos2Parser.g:2644:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRos2Parser.g:2645:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalRos2Parser.g:2651:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:2657:2: ( ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRos2Parser.g:2658:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:2658:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRos2Parser.g:2659:3: () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRos2Parser.g:2659:3: ()
            // InternalRos2Parser.g:2660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,GlobalNamespace,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            // InternalRos2Parser.g:2670:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==LeftSquareBracket) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRos2Parser.g:2671:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_52); 

                    				newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRos2Parser.g:2675:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRos2Parser.g:2676:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRos2Parser.g:2676:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRos2Parser.g:2677:6: lv_parts_3_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_3_0,
                    							"de.fraunhofer.ipa.ros.Ros.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:2694:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==Comma) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalRos2Parser.g:2695:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_52); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRos2Parser.g:2699:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRos2Parser.g:2700:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRos2Parser.g:2700:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRos2Parser.g:2701:7: lv_parts_5_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_5_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
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
    // InternalRos2Parser.g:2728:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRos2Parser.g:2728:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRos2Parser.g:2729:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalRos2Parser.g:2735:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:2741:2: ( ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRos2Parser.g:2742:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:2742:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRos2Parser.g:2743:3: () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRos2Parser.g:2743:3: ()
            // InternalRos2Parser.g:2744:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,RelativeNamespace,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            // InternalRos2Parser.g:2754:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==LeftSquareBracket) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRos2Parser.g:2755:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_52); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRos2Parser.g:2759:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRos2Parser.g:2760:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRos2Parser.g:2760:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRos2Parser.g:2761:6: lv_parts_3_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_3_0,
                    							"de.fraunhofer.ipa.ros.Ros.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:2778:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==Comma) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalRos2Parser.g:2779:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_52); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRos2Parser.g:2783:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRos2Parser.g:2784:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRos2Parser.g:2784:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRos2Parser.g:2785:7: lv_parts_5_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_5_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
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
    // InternalRos2Parser.g:2812:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRos2Parser.g:2812:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRos2Parser.g:2813:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalRos2Parser.g:2819:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:2825:2: ( ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRos2Parser.g:2826:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:2826:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRos2Parser.g:2827:3: () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRos2Parser.g:2827:3: ()
            // InternalRos2Parser.g:2828:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,PrivateNamespace,FOLLOW_51); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            // InternalRos2Parser.g:2838:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==LeftSquareBracket) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRos2Parser.g:2839:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_52); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRos2Parser.g:2843:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRos2Parser.g:2844:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRos2Parser.g:2844:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRos2Parser.g:2845:6: lv_parts_3_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_3_0,
                    							"de.fraunhofer.ipa.ros.Ros.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:2862:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==Comma) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalRos2Parser.g:2863:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_52); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRos2Parser.g:2867:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRos2Parser.g:2868:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRos2Parser.g:2868:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRos2Parser.g:2869:7: lv_parts_5_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_5_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
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
    // InternalRos2Parser.g:2896:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRos2Parser.g:2896:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRos2Parser.g:2897:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalRos2Parser.g:2903:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
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
            // InternalRos2Parser.g:2909:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalRos2Parser.g:2910:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalRos2Parser.g:2910:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt62=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt62=1;
                }
                break;
            case Struct:
                {
                alt62=2;
                }
                break;
            case Integer:
                {
                alt62=3;
                }
                break;
            case String:
                {
                alt62=4;
                }
                break;
            case Double:
                {
                alt62=5;
                }
                break;
            case Boolean:
                {
                alt62=6;
                }
                break;
            case Base64:
                {
                alt62=7;
                }
                break;
            case Array:
                {
                alt62=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalRos2Parser.g:2911:3: this_ParameterListType_0= ruleParameterListType
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
                    // InternalRos2Parser.g:2920:3: this_ParameterStructType_1= ruleParameterStructType
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
                    // InternalRos2Parser.g:2929:3: this_ParameterIntegerType_2= ruleParameterIntegerType
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
                    // InternalRos2Parser.g:2938:3: this_ParameterStringType_3= ruleParameterStringType
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
                    // InternalRos2Parser.g:2947:3: this_ParameterDoubleType_4= ruleParameterDoubleType
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
                    // InternalRos2Parser.g:2956:3: this_ParameterBooleanType_5= ruleParameterBooleanType
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
                    // InternalRos2Parser.g:2965:3: this_ParameterBase64Type_6= ruleParameterBase64Type
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
                    // InternalRos2Parser.g:2974:3: this_ParameterArrayType_7= ruleParameterArrayType
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
    // InternalRos2Parser.g:2986:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRos2Parser.g:2986:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRos2Parser.g:2987:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalRos2Parser.g:2993:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
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
            // InternalRos2Parser.g:2999:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalRos2Parser.g:3000:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalRos2Parser.g:3000:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt63=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt63=1;
                }
                break;
            case RULE_BINARY:
                {
                alt63=2;
                }
                break;
            case RULE_DECINT:
                {
                alt63=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt63=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt63=5;
                }
                break;
            case LeftSquareBracket:
                {
                int LA63_6 = input.LA(2);

                if ( (LA63_6==ParameterStructMember) ) {
                    alt63=7;
                }
                else if ( (LA63_6==Comma||(LA63_6>=LeftSquareBracket && LA63_6<=RightSquareBracket)||LA63_6==RULE_ID||LA63_6==RULE_STRING||(LA63_6>=RULE_BINARY && LA63_6<=RULE_DOUBLE)) ) {
                    alt63=6;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 63, 6, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case Comma:
            case RightSquareBracket:
            case RULE_END:
                {
                alt63=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalRos2Parser.g:3001:3: this_ParameterString_0= ruleParameterString
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
                    // InternalRos2Parser.g:3010:3: this_ParameterBase64_1= ruleParameterBase64
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
                    // InternalRos2Parser.g:3019:3: this_ParameterInteger_2= ruleParameterInteger
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
                    // InternalRos2Parser.g:3028:3: this_ParameterDouble_3= ruleParameterDouble
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
                    // InternalRos2Parser.g:3037:3: this_ParameterBoolean_4= ruleParameterBoolean
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
                    // InternalRos2Parser.g:3046:3: this_ParameterList_5= ruleParameterList
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
                    // InternalRos2Parser.g:3055:3: this_ParameterStruct_6= ruleParameterStruct
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
    // InternalRos2Parser.g:3067:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRos2Parser.g:3067:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRos2Parser.g:3068:2: iv_ruleParameterListType= ruleParameterListType EOF
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
    // InternalRos2Parser.g:3074:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) ;
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
            // InternalRos2Parser.g:3080:2: ( ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRos2Parser.g:3081:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRos2Parser.g:3081:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            // InternalRos2Parser.g:3082:3: () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRos2Parser.g:3082:3: ()
            // InternalRos2Parser.g:3083:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,List,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalRos2Parser.g:3097:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalRos2Parser.g:3098:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalRos2Parser.g:3098:4: (lv_sequence_3_0= ruleParameterType )
            // InternalRos2Parser.g:3099:5: lv_sequence_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_sequence_3_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
            					}
            					add(
            						current,
            						"sequence",
            						lv_sequence_3_0,
            						"de.fraunhofer.ipa.ros.Ros.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:3116:3: (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==Comma) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalRos2Parser.g:3117:4: otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_29); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRos2Parser.g:3121:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalRos2Parser.g:3122:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalRos2Parser.g:3122:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalRos2Parser.g:3123:6: lv_sequence_5_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_sequence_5_0=ruleParameterType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sequence",
            	    							lv_sequence_5_0,
            	    							"de.fraunhofer.ipa.ros.Ros.ParameterType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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
    // InternalRos2Parser.g:3149:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRos2Parser.g:3149:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRos2Parser.g:3150:2: iv_ruleParameterStructType= ruleParameterStructType EOF
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
    // InternalRos2Parser.g:3156:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) ;
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
            // InternalRos2Parser.g:3162:2: ( ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRos2Parser.g:3163:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRos2Parser.g:3163:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            // InternalRos2Parser.g:3164:3: () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRos2Parser.g:3164:3: ()
            // InternalRos2Parser.g:3165:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Struct,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalRos2Parser.g:3179:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalRos2Parser.g:3180:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalRos2Parser.g:3180:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalRos2Parser.g:3181:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_parameterstructypetmember_3_0=ruleParameterStructTypeMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
            					}
            					add(
            						current,
            						"parameterstructypetmember",
            						lv_parameterstructypetmember_3_0,
            						"de.fraunhofer.ipa.ros.Ros.ParameterStructTypeMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:3198:3: (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==Comma) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalRos2Parser.g:3199:4: otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRos2Parser.g:3203:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalRos2Parser.g:3204:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalRos2Parser.g:3204:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalRos2Parser.g:3205:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
            	    {

            	    						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_parameterstructypetmember_5_0=ruleParameterStructTypeMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameterstructypetmember",
            	    							lv_parameterstructypetmember_5_0,
            	    							"de.fraunhofer.ipa.ros.Ros.ParameterStructTypeMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
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
    // InternalRos2Parser.g:3231:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRos2Parser.g:3231:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRos2Parser.g:3232:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
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
    // InternalRos2Parser.g:3238:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3244:2: ( ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) )
            // InternalRos2Parser.g:3245:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            {
            // InternalRos2Parser.g:3245:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            // InternalRos2Parser.g:3246:3: () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            {
            // InternalRos2Parser.g:3246:3: ()
            // InternalRos2Parser.g:3247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Integer,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
            		
            // InternalRos2Parser.g:3257:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Default) ) {
                int LA66_1 = input.LA(2);

                if ( (LA66_1==RULE_DECINT) ) {
                    alt66=1;
                }
            }
            switch (alt66) {
                case 1 :
                    // InternalRos2Parser.g:3258:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3262:4: ( (lv_default_3_0= ruleParameterInteger ) )
                    // InternalRos2Parser.g:3263:5: (lv_default_3_0= ruleParameterInteger )
                    {
                    // InternalRos2Parser.g:3263:5: (lv_default_3_0= ruleParameterInteger )
                    // InternalRos2Parser.g:3264:6: lv_default_3_0= ruleParameterInteger
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
                    							"de.fraunhofer.ipa.ros.Ros.ParameterInteger");
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
    // InternalRos2Parser.g:3286:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRos2Parser.g:3286:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRos2Parser.g:3287:2: iv_ruleParameterStringType= ruleParameterStringType EOF
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
    // InternalRos2Parser.g:3293:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3299:2: ( ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) )
            // InternalRos2Parser.g:3300:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            {
            // InternalRos2Parser.g:3300:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            // InternalRos2Parser.g:3301:3: () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            {
            // InternalRos2Parser.g:3301:3: ()
            // InternalRos2Parser.g:3302:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            		
            // InternalRos2Parser.g:3312:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Default) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==RULE_ID||LA67_1==RULE_STRING) ) {
                    alt67=1;
                }
            }
            switch (alt67) {
                case 1 :
                    // InternalRos2Parser.g:3313:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3317:4: ( (lv_default_3_0= ruleParameterString ) )
                    // InternalRos2Parser.g:3318:5: (lv_default_3_0= ruleParameterString )
                    {
                    // InternalRos2Parser.g:3318:5: (lv_default_3_0= ruleParameterString )
                    // InternalRos2Parser.g:3319:6: lv_default_3_0= ruleParameterString
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
                    							"de.fraunhofer.ipa.ros.Ros.ParameterString");
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
    // InternalRos2Parser.g:3341:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRos2Parser.g:3341:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRos2Parser.g:3342:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
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
    // InternalRos2Parser.g:3348:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3354:2: ( ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) )
            // InternalRos2Parser.g:3355:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            {
            // InternalRos2Parser.g:3355:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            // InternalRos2Parser.g:3356:3: () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            {
            // InternalRos2Parser.g:3356:3: ()
            // InternalRos2Parser.g:3357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Double,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
            		
            // InternalRos2Parser.g:3367:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==Default) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==RULE_DOUBLE) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // InternalRos2Parser.g:3368:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_54); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3372:4: ( (lv_default_3_0= ruleParameterDouble ) )
                    // InternalRos2Parser.g:3373:5: (lv_default_3_0= ruleParameterDouble )
                    {
                    // InternalRos2Parser.g:3373:5: (lv_default_3_0= ruleParameterDouble )
                    // InternalRos2Parser.g:3374:6: lv_default_3_0= ruleParameterDouble
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
                    							"de.fraunhofer.ipa.ros.Ros.ParameterDouble");
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
    // InternalRos2Parser.g:3396:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRos2Parser.g:3396:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRos2Parser.g:3397:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
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
    // InternalRos2Parser.g:3403:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3409:2: ( ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) )
            // InternalRos2Parser.g:3410:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            {
            // InternalRos2Parser.g:3410:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            // InternalRos2Parser.g:3411:3: () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            {
            // InternalRos2Parser.g:3411:3: ()
            // InternalRos2Parser.g:3412:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Boolean,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
            		
            // InternalRos2Parser.g:3422:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Default) ) {
                int LA69_1 = input.LA(2);

                if ( (LA69_1==RULE_BOOLEAN) ) {
                    alt69=1;
                }
            }
            switch (alt69) {
                case 1 :
                    // InternalRos2Parser.g:3423:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_55); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3427:4: ( (lv_default_3_0= ruleParameterBoolean ) )
                    // InternalRos2Parser.g:3428:5: (lv_default_3_0= ruleParameterBoolean )
                    {
                    // InternalRos2Parser.g:3428:5: (lv_default_3_0= ruleParameterBoolean )
                    // InternalRos2Parser.g:3429:6: lv_default_3_0= ruleParameterBoolean
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
                    							"de.fraunhofer.ipa.ros.Ros.ParameterBoolean");
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
    // InternalRos2Parser.g:3451:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRos2Parser.g:3451:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRos2Parser.g:3452:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
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
    // InternalRos2Parser.g:3458:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3464:2: ( ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) )
            // InternalRos2Parser.g:3465:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            {
            // InternalRos2Parser.g:3465:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            // InternalRos2Parser.g:3466:3: () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            {
            // InternalRos2Parser.g:3466:3: ()
            // InternalRos2Parser.g:3467:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Base64,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
            		
            // InternalRos2Parser.g:3477:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==Default) ) {
                int LA70_1 = input.LA(2);

                if ( (LA70_1==RULE_BINARY) ) {
                    alt70=1;
                }
            }
            switch (alt70) {
                case 1 :
                    // InternalRos2Parser.g:3478:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_56); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3482:4: ( (lv_default_3_0= ruleParameterBase64 ) )
                    // InternalRos2Parser.g:3483:5: (lv_default_3_0= ruleParameterBase64 )
                    {
                    // InternalRos2Parser.g:3483:5: (lv_default_3_0= ruleParameterBase64 )
                    // InternalRos2Parser.g:3484:6: lv_default_3_0= ruleParameterBase64
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
                    							"de.fraunhofer.ipa.ros.Ros.ParameterBase64");
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
    // InternalRos2Parser.g:3506:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRos2Parser.g:3506:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRos2Parser.g:3507:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
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
    // InternalRos2Parser.g:3513:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= Array this_BEGIN_1= RULE_BEGIN otherlv_2= Type ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? this_END_6= RULE_END ) ;
    public final EObject ruleParameterArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_END_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3519:2: ( (otherlv_0= Array this_BEGIN_1= RULE_BEGIN otherlv_2= Type ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? this_END_6= RULE_END ) )
            // InternalRos2Parser.g:3520:2: (otherlv_0= Array this_BEGIN_1= RULE_BEGIN otherlv_2= Type ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? this_END_6= RULE_END )
            {
            // InternalRos2Parser.g:3520:2: (otherlv_0= Array this_BEGIN_1= RULE_BEGIN otherlv_2= Type ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? this_END_6= RULE_END )
            // InternalRos2Parser.g:3521:3: otherlv_0= Array this_BEGIN_1= RULE_BEGIN otherlv_2= Type ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? this_END_6= RULE_END
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_28); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_1());
            		
            otherlv_2=(Token)match(input,Type,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalRos2Parser.g:3533:3: ( (lv_type_3_0= ruleParameterType ) )
            // InternalRos2Parser.g:3534:4: (lv_type_3_0= ruleParameterType )
            {
            // InternalRos2Parser.g:3534:4: (lv_type_3_0= ruleParameterType )
            // InternalRos2Parser.g:3535:5: lv_type_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_57);
            lv_type_3_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"de.fraunhofer.ipa.ros.Ros.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:3552:3: (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Default) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRos2Parser.g:3553:4: otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) )
                    {
                    otherlv_4=(Token)match(input,Default,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRos2Parser.g:3557:4: ( (lv_default_5_0= ruleParameterList ) )
                    // InternalRos2Parser.g:3558:5: (lv_default_5_0= ruleParameterList )
                    {
                    // InternalRos2Parser.g:3558:5: (lv_default_5_0= ruleParameterList )
                    // InternalRos2Parser.g:3559:6: lv_default_5_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_default_5_0=ruleParameterList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_6=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_6, grammarAccess.getParameterArrayTypeAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalRos2Parser.g:3585:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalRos2Parser.g:3585:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalRos2Parser.g:3586:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalRos2Parser.g:3592:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3598:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalRos2Parser.g:3599:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalRos2Parser.g:3599:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            // InternalRos2Parser.g:3600:3: () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalRos2Parser.g:3600:3: ()
            // InternalRos2Parser.g:3601:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_58); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRos2Parser.g:3611:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRos2Parser.g:3612:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRos2Parser.g:3612:4: (lv_value_2_0= ruleParameterValue )
            // InternalRos2Parser.g:3613:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.fraunhofer.ipa.ros.Ros.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:3630:3: (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==Comma) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalRos2Parser.g:3631:4: otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_58); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRos2Parser.g:3635:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalRos2Parser.g:3636:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalRos2Parser.g:3636:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalRos2Parser.g:3637:6: lv_value_4_0= ruleParameterValue
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_value_4_0=ruleParameterValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_4_0,
            	    							"de.fraunhofer.ipa.ros.Ros.ParameterValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // InternalRos2Parser.g:3663:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRos2Parser.g:3663:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRos2Parser.g:3664:2: iv_ruleParameterAny= ruleParameterAny EOF
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
    // InternalRos2Parser.g:3670:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3676:2: ( ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) )
            // InternalRos2Parser.g:3677:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            {
            // InternalRos2Parser.g:3677:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            // InternalRos2Parser.g:3678:3: () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            {
            // InternalRos2Parser.g:3678:3: ()
            // InternalRos2Parser.g:3679:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ParameterAny,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            // InternalRos2Parser.g:3689:3: (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==Value) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalRos2Parser.g:3690:4: otherlv_2= Value ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Value,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getValueKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3694:4: ( (lv_value_3_0= ruleEString ) )
                    // InternalRos2Parser.g:3695:5: (lv_value_3_0= ruleEString )
                    {
                    // InternalRos2Parser.g:3695:5: (lv_value_3_0= ruleEString )
                    // InternalRos2Parser.g:3696:6: lv_value_3_0= ruleEString
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
                    							"de.fraunhofer.ipa.ros.Ros.EString");
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
    // InternalRos2Parser.g:3718:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRos2Parser.g:3718:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRos2Parser.g:3719:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalRos2Parser.g:3725:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3731:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRos2Parser.g:3732:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRos2Parser.g:3732:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRos2Parser.g:3733:3: (lv_value_0_0= ruleEString )
            {
            // InternalRos2Parser.g:3733:3: (lv_value_0_0= ruleEString )
            // InternalRos2Parser.g:3734:4: lv_value_0_0= ruleEString
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
            					"de.fraunhofer.ipa.ros.Ros.EString");
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
    // InternalRos2Parser.g:3754:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRos2Parser.g:3754:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRos2Parser.g:3755:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalRos2Parser.g:3761:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3767:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalRos2Parser.g:3768:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalRos2Parser.g:3768:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalRos2Parser.g:3769:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalRos2Parser.g:3769:3: (lv_value_0_0= ruleBase64Binary )
            // InternalRos2Parser.g:3770:4: lv_value_0_0= ruleBase64Binary
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
            					"de.fraunhofer.ipa.ros.Ros.Base64Binary");
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
    // InternalRos2Parser.g:3790:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRos2Parser.g:3790:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRos2Parser.g:3791:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalRos2Parser.g:3797:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3803:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalRos2Parser.g:3804:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalRos2Parser.g:3804:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalRos2Parser.g:3805:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalRos2Parser.g:3805:3: (lv_value_0_0= ruleInteger0 )
            // InternalRos2Parser.g:3806:4: lv_value_0_0= ruleInteger0
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
            					"de.fraunhofer.ipa.ros.Ros.Integer0");
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
    // InternalRos2Parser.g:3826:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRos2Parser.g:3826:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRos2Parser.g:3827:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalRos2Parser.g:3833:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3839:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalRos2Parser.g:3840:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalRos2Parser.g:3840:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalRos2Parser.g:3841:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalRos2Parser.g:3841:3: (lv_value_0_0= ruleDouble0 )
            // InternalRos2Parser.g:3842:4: lv_value_0_0= ruleDouble0
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
            					"de.fraunhofer.ipa.ros.Ros.Double0");
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
    // InternalRos2Parser.g:3862:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRos2Parser.g:3862:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRos2Parser.g:3863:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalRos2Parser.g:3869:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3875:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalRos2Parser.g:3876:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalRos2Parser.g:3876:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalRos2Parser.g:3877:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalRos2Parser.g:3877:3: (lv_value_0_0= ruleboolean0 )
            // InternalRos2Parser.g:3878:4: lv_value_0_0= ruleboolean0
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
            					"de.fraunhofer.ipa.ros.Ros.boolean0");
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
    // InternalRos2Parser.g:3898:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRos2Parser.g:3898:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRos2Parser.g:3899:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalRos2Parser.g:3905:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:3911:2: ( ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? ) )
            // InternalRos2Parser.g:3912:2: ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:3912:2: ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? )
            // InternalRos2Parser.g:3913:3: () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )?
            {
            // InternalRos2Parser.g:3913:3: ()
            // InternalRos2Parser.g:3914:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:3920:3: (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==LeftSquareBracket) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalRos2Parser.g:3921:4: otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_60); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalRos2Parser.g:3925:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalRos2Parser.g:3926:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalRos2Parser.g:3926:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalRos2Parser.g:3927:6: lv_value_2_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_value_2_0=ruleParameterStructMember();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterStructMember");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:3944:4: (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==Comma) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalRos2Parser.g:3945:5: otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_60); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_2_1());
                    	    				
                    	    // InternalRos2Parser.g:3953:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalRos2Parser.g:3954:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRos2Parser.g:3954:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalRos2Parser.g:3955:7: lv_value_5_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_61);
                    	    lv_value_5_0=ruleParameterStructMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_5_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.ParameterStructMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_12); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_2_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop74;
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
    // InternalRos2Parser.g:3986:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRos2Parser.g:3986:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRos2Parser.g:3987:2: iv_ruleParameterDate= ruleParameterDate EOF
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
    // InternalRos2Parser.g:3993:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3999:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalRos2Parser.g:4000:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalRos2Parser.g:4000:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalRos2Parser.g:4001:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalRos2Parser.g:4001:3: (lv_value_0_0= ruleDateTime0 )
            // InternalRos2Parser.g:4002:4: lv_value_0_0= ruleDateTime0
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
            					"de.fraunhofer.ipa.ros.Ros.DateTime0");
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
    // InternalRos2Parser.g:4022:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRos2Parser.g:4022:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRos2Parser.g:4023:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalRos2Parser.g:4029:1: ruleParameterStructMember returns [EObject current=null] : (otherlv_0= ParameterStructMember ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_value_4_0= ruleParameterValue ) ) this_END_5= RULE_END ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4035:2: ( (otherlv_0= ParameterStructMember ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_value_4_0= ruleParameterValue ) ) this_END_5= RULE_END ) )
            // InternalRos2Parser.g:4036:2: (otherlv_0= ParameterStructMember ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_value_4_0= ruleParameterValue ) ) this_END_5= RULE_END )
            {
            // InternalRos2Parser.g:4036:2: (otherlv_0= ParameterStructMember ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_value_4_0= ruleParameterValue ) ) this_END_5= RULE_END )
            // InternalRos2Parser.g:4037:3: otherlv_0= ParameterStructMember ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_value_4_0= ruleParameterValue ) ) this_END_5= RULE_END
            {
            otherlv_0=(Token)match(input,ParameterStructMember,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructMemberAccess().getParameterStructMemberKeyword_0());
            		
            // InternalRos2Parser.g:4041:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:4042:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:4042:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:4043:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_58); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRos2Parser.g:4068:3: ( (lv_value_4_0= ruleParameterValue ) )
            // InternalRos2Parser.g:4069:4: (lv_value_4_0= ruleParameterValue )
            {
            // InternalRos2Parser.g:4069:4: (lv_value_4_0= ruleParameterValue )
            // InternalRos2Parser.g:4070:5: lv_value_4_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_value_4_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"de.fraunhofer.ipa.ros.Ros.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_5, grammarAccess.getParameterStructMemberAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalRos2Parser.g:4095:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRos2Parser.g:4095:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRos2Parser.g:4096:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
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
    // InternalRos2Parser.g:4102:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4108:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalRos2Parser.g:4109:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalRos2Parser.g:4109:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalRos2Parser.g:4110:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalRos2Parser.g:4110:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRos2Parser.g:4111:4: (lv_name_0_0= ruleEString )
            {
            // InternalRos2Parser.g:4111:4: (lv_name_0_0= ruleEString )
            // InternalRos2Parser.g:4112:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_29);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:4129:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalRos2Parser.g:4130:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalRos2Parser.g:4130:4: (lv_type_1_0= ruleParameterType )
            // InternalRos2Parser.g:4131:5: lv_type_1_0= ruleParameterType
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
            						"de.fraunhofer.ipa.ros.Ros.ParameterType");
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
    // InternalRos2Parser.g:4152:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRos2Parser.g:4152:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRos2Parser.g:4153:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalRos2Parser.g:4159:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4165:2: (this_BINARY_0= RULE_BINARY )
            // InternalRos2Parser.g:4166:2: this_BINARY_0= RULE_BINARY
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
    // InternalRos2Parser.g:4176:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalRos2Parser.g:4176:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalRos2Parser.g:4177:2: iv_ruleboolean0= ruleboolean0 EOF
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
    // InternalRos2Parser.g:4183:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4189:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalRos2Parser.g:4190:2: this_BOOLEAN_0= RULE_BOOLEAN
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
    // InternalRos2Parser.g:4200:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalRos2Parser.g:4200:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalRos2Parser.g:4201:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalRos2Parser.g:4207:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4213:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalRos2Parser.g:4214:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalRos2Parser.g:4224:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalRos2Parser.g:4224:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalRos2Parser.g:4225:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalRos2Parser.g:4231:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4237:2: (this_DECINT_0= RULE_DECINT )
            // InternalRos2Parser.g:4238:2: this_DECINT_0= RULE_DECINT
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
    // InternalRos2Parser.g:4248:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalRos2Parser.g:4248:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalRos2Parser.g:4249:2: iv_ruleDateTime0= ruleDateTime0 EOF
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
    // InternalRos2Parser.g:4255:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4261:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalRos2Parser.g:4262:2: this_DATE_TIME_0= RULE_DATE_TIME
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


    // $ANTLR start "entryRuleMessagePart"
    // InternalRos2Parser.g:4272:1: entryRuleMessagePart returns [EObject current=null] : iv_ruleMessagePart= ruleMessagePart EOF ;
    public final EObject entryRuleMessagePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessagePart = null;


        try {
            // InternalRos2Parser.g:4272:52: (iv_ruleMessagePart= ruleMessagePart EOF )
            // InternalRos2Parser.g:4273:2: iv_ruleMessagePart= ruleMessagePart EOF
            {
             newCompositeNode(grammarAccess.getMessagePartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessagePart=ruleMessagePart();

            state._fsp--;

             current =iv_ruleMessagePart; 
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
    // $ANTLR end "entryRuleMessagePart"


    // $ANTLR start "ruleMessagePart"
    // InternalRos2Parser.g:4279:1: ruleMessagePart returns [EObject current=null] : ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) ) ;
    public final EObject ruleMessagePart() throws RecognitionException {
        EObject current = null;

        Token lv_Data_1_2=null;
        EObject lv_Type_0_0 = null;

        AntlrDatatypeRuleToken lv_Data_1_1 = null;

        AntlrDatatypeRuleToken lv_Data_1_3 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4285:2: ( ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) ) )
            // InternalRos2Parser.g:4286:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) )
            {
            // InternalRos2Parser.g:4286:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) )
            // InternalRos2Parser.g:4287:3: ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) )
            {
            // InternalRos2Parser.g:4287:3: ( (lv_Type_0_0= ruleAbstractType ) )
            // InternalRos2Parser.g:4288:4: (lv_Type_0_0= ruleAbstractType )
            {
            // InternalRos2Parser.g:4288:4: (lv_Type_0_0= ruleAbstractType )
            // InternalRos2Parser.g:4289:5: lv_Type_0_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getMessagePartAccess().getTypeAbstractTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_62);
            lv_Type_0_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessagePartRule());
            					}
            					set(
            						current,
            						"Type",
            						lv_Type_0_0,
            						"de.fraunhofer.ipa.ros.Ros.AbstractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:4306:3: ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) )
            // InternalRos2Parser.g:4307:4: ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) )
            {
            // InternalRos2Parser.g:4307:4: ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) )
            // InternalRos2Parser.g:4308:5: (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString )
            {
            // InternalRos2Parser.g:4308:5: (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString )
            int alt76=3;
            switch ( input.LA(1) ) {
            case Duration:
            case Feedback:
            case Message:
            case Service:
            case Action:
            case Result:
            case Value:
            case Goal:
            case Name:
            case Time:
            case Type:
                {
                alt76=1;
                }
                break;
            case RULE_MESSAGE_ASIGMENT:
                {
                alt76=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalRos2Parser.g:4309:6: lv_Data_1_1= ruleKEYWORD
                    {

                    						newCompositeNode(grammarAccess.getMessagePartAccess().getDataKEYWORDParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Data_1_1=ruleKEYWORD();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessagePartRule());
                    						}
                    						set(
                    							current,
                    							"Data",
                    							lv_Data_1_1,
                    							"de.fraunhofer.ipa.ros.Ros.KEYWORD");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:4325:6: lv_Data_1_2= RULE_MESSAGE_ASIGMENT
                    {
                    lv_Data_1_2=(Token)match(input,RULE_MESSAGE_ASIGMENT,FOLLOW_2); 

                    						newLeafNode(lv_Data_1_2, grammarAccess.getMessagePartAccess().getDataMESSAGE_ASIGMENTTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMessagePartRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"Data",
                    							lv_Data_1_2,
                    							"de.fraunhofer.ipa.ros.Ros.MESSAGE_ASIGMENT");
                    					

                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:4340:6: lv_Data_1_3= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMessagePartAccess().getDataEStringParserRuleCall_1_0_2());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Data_1_3=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessagePartRule());
                    						}
                    						set(
                    							current,
                    							"Data",
                    							lv_Data_1_3,
                    							"de.fraunhofer.ipa.ros.Ros.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleMessagePart"


    // $ANTLR start "entryRuleAbstractType"
    // InternalRos2Parser.g:4362:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalRos2Parser.g:4362:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalRos2Parser.g:4363:2: iv_ruleAbstractType= ruleAbstractType EOF
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
    // InternalRos2Parser.g:4369:1: ruleAbstractType returns [EObject current=null] : (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef ) ;
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

        EObject this_TopicSpecRef_29 = null;

        EObject this_ArrayTopicSpecRef_30 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4375:2: ( (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef ) )
            // InternalRos2Parser.g:4376:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )
            {
            // InternalRos2Parser.g:4376:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )
            int alt77=31;
            alt77 = dfa77.predict(input);
            switch (alt77) {
                case 1 :
                    // InternalRos2Parser.g:4377:3: this_bool_0= rulebool
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
                    // InternalRos2Parser.g:4386:3: this_int8_1= ruleint8
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
                    // InternalRos2Parser.g:4395:3: this_uint8_2= ruleuint8
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
                    // InternalRos2Parser.g:4404:3: this_int16_3= ruleint16
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
                    // InternalRos2Parser.g:4413:3: this_uint16_4= ruleuint16
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
                    // InternalRos2Parser.g:4422:3: this_int32_5= ruleint32
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
                    // InternalRos2Parser.g:4431:3: this_uint32_6= ruleuint32
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
                    // InternalRos2Parser.g:4440:3: this_int64_7= ruleint64
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
                    // InternalRos2Parser.g:4449:3: this_uint64_8= ruleuint64
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
                    // InternalRos2Parser.g:4458:3: this_float32_9= rulefloat32
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
                    // InternalRos2Parser.g:4467:3: this_float64_10= rulefloat64
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
                    // InternalRos2Parser.g:4476:3: this_string0_11= rulestring0
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
                    // InternalRos2Parser.g:4485:3: this_byte_12= rulebyte
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
                    // InternalRos2Parser.g:4494:3: this_time_13= ruletime
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
                    // InternalRos2Parser.g:4503:3: this_duration_14= ruleduration
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
                    // InternalRos2Parser.g:4512:3: this_Header_15= ruleHeader
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
                    // InternalRos2Parser.g:4521:3: this_boolArray_16= ruleboolArray
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
                    // InternalRos2Parser.g:4530:3: this_int8Array_17= ruleint8Array
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
                    // InternalRos2Parser.g:4539:3: this_uint8Array_18= ruleuint8Array
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
                    // InternalRos2Parser.g:4548:3: this_int16Array_19= ruleint16Array
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
                    // InternalRos2Parser.g:4557:3: this_uint16Array_20= ruleuint16Array
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
                    // InternalRos2Parser.g:4566:3: this_int32Array_21= ruleint32Array
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
                    // InternalRos2Parser.g:4575:3: this_uint32Array_22= ruleuint32Array
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
                    // InternalRos2Parser.g:4584:3: this_int64Array_23= ruleint64Array
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
                    // InternalRos2Parser.g:4593:3: this_uint64Array_24= ruleuint64Array
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
                    // InternalRos2Parser.g:4602:3: this_float32Array_25= rulefloat32Array
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
                    // InternalRos2Parser.g:4611:3: this_float64Array_26= rulefloat64Array
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
                    // InternalRos2Parser.g:4620:3: this_string0Array_27= rulestring0Array
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
                    // InternalRos2Parser.g:4629:3: this_byteArray_28= rulebyteArray
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
                    // InternalRos2Parser.g:4638:3: this_TopicSpecRef_29= ruleTopicSpecRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getTopicSpecRefParserRuleCall_29());
                    		
                    pushFollow(FOLLOW_2);
                    this_TopicSpecRef_29=ruleTopicSpecRef();

                    state._fsp--;


                    			current = this_TopicSpecRef_29;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 31 :
                    // InternalRos2Parser.g:4647:3: this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getArrayTopicSpecRefParserRuleCall_30());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayTopicSpecRef_30=ruleArrayTopicSpecRef();

                    state._fsp--;


                    			current = this_ArrayTopicSpecRef_30;
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
    // InternalRos2Parser.g:4659:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalRos2Parser.g:4659:45: (iv_rulebool= rulebool EOF )
            // InternalRos2Parser.g:4660:2: iv_rulebool= rulebool EOF
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
    // InternalRos2Parser.g:4666:1: rulebool returns [EObject current=null] : ( () otherlv_1= Bool ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4672:2: ( ( () otherlv_1= Bool ) )
            // InternalRos2Parser.g:4673:2: ( () otherlv_1= Bool )
            {
            // InternalRos2Parser.g:4673:2: ( () otherlv_1= Bool )
            // InternalRos2Parser.g:4674:3: () otherlv_1= Bool
            {
            // InternalRos2Parser.g:4674:3: ()
            // InternalRos2Parser.g:4675:4: 
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
    // InternalRos2Parser.g:4689:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalRos2Parser.g:4689:45: (iv_ruleint8= ruleint8 EOF )
            // InternalRos2Parser.g:4690:2: iv_ruleint8= ruleint8 EOF
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
    // InternalRos2Parser.g:4696:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= Int8 ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4702:2: ( ( () otherlv_1= Int8 ) )
            // InternalRos2Parser.g:4703:2: ( () otherlv_1= Int8 )
            {
            // InternalRos2Parser.g:4703:2: ( () otherlv_1= Int8 )
            // InternalRos2Parser.g:4704:3: () otherlv_1= Int8
            {
            // InternalRos2Parser.g:4704:3: ()
            // InternalRos2Parser.g:4705:4: 
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
    // InternalRos2Parser.g:4719:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalRos2Parser.g:4719:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalRos2Parser.g:4720:2: iv_ruleuint8= ruleuint8 EOF
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
    // InternalRos2Parser.g:4726:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= Uint8 ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4732:2: ( ( () otherlv_1= Uint8 ) )
            // InternalRos2Parser.g:4733:2: ( () otherlv_1= Uint8 )
            {
            // InternalRos2Parser.g:4733:2: ( () otherlv_1= Uint8 )
            // InternalRos2Parser.g:4734:3: () otherlv_1= Uint8
            {
            // InternalRos2Parser.g:4734:3: ()
            // InternalRos2Parser.g:4735:4: 
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
    // InternalRos2Parser.g:4749:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalRos2Parser.g:4749:46: (iv_ruleint16= ruleint16 EOF )
            // InternalRos2Parser.g:4750:2: iv_ruleint16= ruleint16 EOF
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
    // InternalRos2Parser.g:4756:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= Int16 ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4762:2: ( ( () otherlv_1= Int16 ) )
            // InternalRos2Parser.g:4763:2: ( () otherlv_1= Int16 )
            {
            // InternalRos2Parser.g:4763:2: ( () otherlv_1= Int16 )
            // InternalRos2Parser.g:4764:3: () otherlv_1= Int16
            {
            // InternalRos2Parser.g:4764:3: ()
            // InternalRos2Parser.g:4765:4: 
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
    // InternalRos2Parser.g:4779:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalRos2Parser.g:4779:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalRos2Parser.g:4780:2: iv_ruleuint16= ruleuint16 EOF
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
    // InternalRos2Parser.g:4786:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= Uint16 ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4792:2: ( ( () otherlv_1= Uint16 ) )
            // InternalRos2Parser.g:4793:2: ( () otherlv_1= Uint16 )
            {
            // InternalRos2Parser.g:4793:2: ( () otherlv_1= Uint16 )
            // InternalRos2Parser.g:4794:3: () otherlv_1= Uint16
            {
            // InternalRos2Parser.g:4794:3: ()
            // InternalRos2Parser.g:4795:4: 
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
    // InternalRos2Parser.g:4809:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalRos2Parser.g:4809:46: (iv_ruleint32= ruleint32 EOF )
            // InternalRos2Parser.g:4810:2: iv_ruleint32= ruleint32 EOF
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
    // InternalRos2Parser.g:4816:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= Int32 ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4822:2: ( ( () otherlv_1= Int32 ) )
            // InternalRos2Parser.g:4823:2: ( () otherlv_1= Int32 )
            {
            // InternalRos2Parser.g:4823:2: ( () otherlv_1= Int32 )
            // InternalRos2Parser.g:4824:3: () otherlv_1= Int32
            {
            // InternalRos2Parser.g:4824:3: ()
            // InternalRos2Parser.g:4825:4: 
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
    // InternalRos2Parser.g:4839:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalRos2Parser.g:4839:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalRos2Parser.g:4840:2: iv_ruleuint32= ruleuint32 EOF
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
    // InternalRos2Parser.g:4846:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= Uint32 ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4852:2: ( ( () otherlv_1= Uint32 ) )
            // InternalRos2Parser.g:4853:2: ( () otherlv_1= Uint32 )
            {
            // InternalRos2Parser.g:4853:2: ( () otherlv_1= Uint32 )
            // InternalRos2Parser.g:4854:3: () otherlv_1= Uint32
            {
            // InternalRos2Parser.g:4854:3: ()
            // InternalRos2Parser.g:4855:4: 
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
    // InternalRos2Parser.g:4869:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalRos2Parser.g:4869:46: (iv_ruleint64= ruleint64 EOF )
            // InternalRos2Parser.g:4870:2: iv_ruleint64= ruleint64 EOF
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
    // InternalRos2Parser.g:4876:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= Int64 ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4882:2: ( ( () otherlv_1= Int64 ) )
            // InternalRos2Parser.g:4883:2: ( () otherlv_1= Int64 )
            {
            // InternalRos2Parser.g:4883:2: ( () otherlv_1= Int64 )
            // InternalRos2Parser.g:4884:3: () otherlv_1= Int64
            {
            // InternalRos2Parser.g:4884:3: ()
            // InternalRos2Parser.g:4885:4: 
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
    // InternalRos2Parser.g:4899:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalRos2Parser.g:4899:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalRos2Parser.g:4900:2: iv_ruleuint64= ruleuint64 EOF
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
    // InternalRos2Parser.g:4906:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= Uint64 ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4912:2: ( ( () otherlv_1= Uint64 ) )
            // InternalRos2Parser.g:4913:2: ( () otherlv_1= Uint64 )
            {
            // InternalRos2Parser.g:4913:2: ( () otherlv_1= Uint64 )
            // InternalRos2Parser.g:4914:3: () otherlv_1= Uint64
            {
            // InternalRos2Parser.g:4914:3: ()
            // InternalRos2Parser.g:4915:4: 
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
    // InternalRos2Parser.g:4929:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalRos2Parser.g:4929:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalRos2Parser.g:4930:2: iv_rulefloat32= rulefloat32 EOF
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
    // InternalRos2Parser.g:4936:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= Float32 ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4942:2: ( ( () otherlv_1= Float32 ) )
            // InternalRos2Parser.g:4943:2: ( () otherlv_1= Float32 )
            {
            // InternalRos2Parser.g:4943:2: ( () otherlv_1= Float32 )
            // InternalRos2Parser.g:4944:3: () otherlv_1= Float32
            {
            // InternalRos2Parser.g:4944:3: ()
            // InternalRos2Parser.g:4945:4: 
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
    // InternalRos2Parser.g:4959:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalRos2Parser.g:4959:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalRos2Parser.g:4960:2: iv_rulefloat64= rulefloat64 EOF
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
    // InternalRos2Parser.g:4966:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= Float64 ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4972:2: ( ( () otherlv_1= Float64 ) )
            // InternalRos2Parser.g:4973:2: ( () otherlv_1= Float64 )
            {
            // InternalRos2Parser.g:4973:2: ( () otherlv_1= Float64 )
            // InternalRos2Parser.g:4974:3: () otherlv_1= Float64
            {
            // InternalRos2Parser.g:4974:3: ()
            // InternalRos2Parser.g:4975:4: 
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
    // InternalRos2Parser.g:4989:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalRos2Parser.g:4989:48: (iv_rulestring0= rulestring0 EOF )
            // InternalRos2Parser.g:4990:2: iv_rulestring0= rulestring0 EOF
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
    // InternalRos2Parser.g:4996:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= String_1 ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5002:2: ( ( () otherlv_1= String_1 ) )
            // InternalRos2Parser.g:5003:2: ( () otherlv_1= String_1 )
            {
            // InternalRos2Parser.g:5003:2: ( () otherlv_1= String_1 )
            // InternalRos2Parser.g:5004:3: () otherlv_1= String_1
            {
            // InternalRos2Parser.g:5004:3: ()
            // InternalRos2Parser.g:5005:4: 
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
    // InternalRos2Parser.g:5019:1: entryRulebyte returns [EObject current=null] : iv_rulebyte= rulebyte EOF ;
    public final EObject entryRulebyte() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyte = null;


        try {
            // InternalRos2Parser.g:5019:45: (iv_rulebyte= rulebyte EOF )
            // InternalRos2Parser.g:5020:2: iv_rulebyte= rulebyte EOF
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
    // InternalRos2Parser.g:5026:1: rulebyte returns [EObject current=null] : ( () otherlv_1= Byte ) ;
    public final EObject rulebyte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5032:2: ( ( () otherlv_1= Byte ) )
            // InternalRos2Parser.g:5033:2: ( () otherlv_1= Byte )
            {
            // InternalRos2Parser.g:5033:2: ( () otherlv_1= Byte )
            // InternalRos2Parser.g:5034:3: () otherlv_1= Byte
            {
            // InternalRos2Parser.g:5034:3: ()
            // InternalRos2Parser.g:5035:4: 
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
    // InternalRos2Parser.g:5049:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalRos2Parser.g:5049:45: (iv_ruletime= ruletime EOF )
            // InternalRos2Parser.g:5050:2: iv_ruletime= ruletime EOF
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
    // InternalRos2Parser.g:5056:1: ruletime returns [EObject current=null] : ( () otherlv_1= Time ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5062:2: ( ( () otherlv_1= Time ) )
            // InternalRos2Parser.g:5063:2: ( () otherlv_1= Time )
            {
            // InternalRos2Parser.g:5063:2: ( () otherlv_1= Time )
            // InternalRos2Parser.g:5064:3: () otherlv_1= Time
            {
            // InternalRos2Parser.g:5064:3: ()
            // InternalRos2Parser.g:5065:4: 
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
    // InternalRos2Parser.g:5079:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalRos2Parser.g:5079:49: (iv_ruleduration= ruleduration EOF )
            // InternalRos2Parser.g:5080:2: iv_ruleduration= ruleduration EOF
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
    // InternalRos2Parser.g:5086:1: ruleduration returns [EObject current=null] : ( () otherlv_1= Duration ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5092:2: ( ( () otherlv_1= Duration ) )
            // InternalRos2Parser.g:5093:2: ( () otherlv_1= Duration )
            {
            // InternalRos2Parser.g:5093:2: ( () otherlv_1= Duration )
            // InternalRos2Parser.g:5094:3: () otherlv_1= Duration
            {
            // InternalRos2Parser.g:5094:3: ()
            // InternalRos2Parser.g:5095:4: 
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
    // InternalRos2Parser.g:5109:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalRos2Parser.g:5109:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalRos2Parser.g:5110:2: iv_ruleboolArray= ruleboolArray EOF
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
    // InternalRos2Parser.g:5116:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= Bool_1 ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5122:2: ( ( () otherlv_1= Bool_1 ) )
            // InternalRos2Parser.g:5123:2: ( () otherlv_1= Bool_1 )
            {
            // InternalRos2Parser.g:5123:2: ( () otherlv_1= Bool_1 )
            // InternalRos2Parser.g:5124:3: () otherlv_1= Bool_1
            {
            // InternalRos2Parser.g:5124:3: ()
            // InternalRos2Parser.g:5125:4: 
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
    // InternalRos2Parser.g:5139:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalRos2Parser.g:5139:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalRos2Parser.g:5140:2: iv_ruleint8Array= ruleint8Array EOF
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
    // InternalRos2Parser.g:5146:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= Int8_1 ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5152:2: ( ( () otherlv_1= Int8_1 ) )
            // InternalRos2Parser.g:5153:2: ( () otherlv_1= Int8_1 )
            {
            // InternalRos2Parser.g:5153:2: ( () otherlv_1= Int8_1 )
            // InternalRos2Parser.g:5154:3: () otherlv_1= Int8_1
            {
            // InternalRos2Parser.g:5154:3: ()
            // InternalRos2Parser.g:5155:4: 
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
    // InternalRos2Parser.g:5169:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalRos2Parser.g:5169:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalRos2Parser.g:5170:2: iv_ruleuint8Array= ruleuint8Array EOF
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
    // InternalRos2Parser.g:5176:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= Uint8_1 ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5182:2: ( ( () otherlv_1= Uint8_1 ) )
            // InternalRos2Parser.g:5183:2: ( () otherlv_1= Uint8_1 )
            {
            // InternalRos2Parser.g:5183:2: ( () otherlv_1= Uint8_1 )
            // InternalRos2Parser.g:5184:3: () otherlv_1= Uint8_1
            {
            // InternalRos2Parser.g:5184:3: ()
            // InternalRos2Parser.g:5185:4: 
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
    // InternalRos2Parser.g:5199:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalRos2Parser.g:5199:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalRos2Parser.g:5200:2: iv_ruleint16Array= ruleint16Array EOF
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
    // InternalRos2Parser.g:5206:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= Int16_1 ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5212:2: ( ( () otherlv_1= Int16_1 ) )
            // InternalRos2Parser.g:5213:2: ( () otherlv_1= Int16_1 )
            {
            // InternalRos2Parser.g:5213:2: ( () otherlv_1= Int16_1 )
            // InternalRos2Parser.g:5214:3: () otherlv_1= Int16_1
            {
            // InternalRos2Parser.g:5214:3: ()
            // InternalRos2Parser.g:5215:4: 
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
    // InternalRos2Parser.g:5229:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalRos2Parser.g:5229:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalRos2Parser.g:5230:2: iv_ruleuint16Array= ruleuint16Array EOF
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
    // InternalRos2Parser.g:5236:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= Uint16_1 ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5242:2: ( ( () otherlv_1= Uint16_1 ) )
            // InternalRos2Parser.g:5243:2: ( () otherlv_1= Uint16_1 )
            {
            // InternalRos2Parser.g:5243:2: ( () otherlv_1= Uint16_1 )
            // InternalRos2Parser.g:5244:3: () otherlv_1= Uint16_1
            {
            // InternalRos2Parser.g:5244:3: ()
            // InternalRos2Parser.g:5245:4: 
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
    // InternalRos2Parser.g:5259:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalRos2Parser.g:5259:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalRos2Parser.g:5260:2: iv_ruleint32Array= ruleint32Array EOF
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
    // InternalRos2Parser.g:5266:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= Int32_1 ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5272:2: ( ( () otherlv_1= Int32_1 ) )
            // InternalRos2Parser.g:5273:2: ( () otherlv_1= Int32_1 )
            {
            // InternalRos2Parser.g:5273:2: ( () otherlv_1= Int32_1 )
            // InternalRos2Parser.g:5274:3: () otherlv_1= Int32_1
            {
            // InternalRos2Parser.g:5274:3: ()
            // InternalRos2Parser.g:5275:4: 
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
    // InternalRos2Parser.g:5289:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalRos2Parser.g:5289:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalRos2Parser.g:5290:2: iv_ruleuint32Array= ruleuint32Array EOF
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
    // InternalRos2Parser.g:5296:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= Uint32_1 ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5302:2: ( ( () otherlv_1= Uint32_1 ) )
            // InternalRos2Parser.g:5303:2: ( () otherlv_1= Uint32_1 )
            {
            // InternalRos2Parser.g:5303:2: ( () otherlv_1= Uint32_1 )
            // InternalRos2Parser.g:5304:3: () otherlv_1= Uint32_1
            {
            // InternalRos2Parser.g:5304:3: ()
            // InternalRos2Parser.g:5305:4: 
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
    // InternalRos2Parser.g:5319:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalRos2Parser.g:5319:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalRos2Parser.g:5320:2: iv_ruleint64Array= ruleint64Array EOF
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
    // InternalRos2Parser.g:5326:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= Int64_1 ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5332:2: ( ( () otherlv_1= Int64_1 ) )
            // InternalRos2Parser.g:5333:2: ( () otherlv_1= Int64_1 )
            {
            // InternalRos2Parser.g:5333:2: ( () otherlv_1= Int64_1 )
            // InternalRos2Parser.g:5334:3: () otherlv_1= Int64_1
            {
            // InternalRos2Parser.g:5334:3: ()
            // InternalRos2Parser.g:5335:4: 
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
    // InternalRos2Parser.g:5349:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalRos2Parser.g:5349:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalRos2Parser.g:5350:2: iv_ruleuint64Array= ruleuint64Array EOF
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
    // InternalRos2Parser.g:5356:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= Uint64_1 ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5362:2: ( ( () otherlv_1= Uint64_1 ) )
            // InternalRos2Parser.g:5363:2: ( () otherlv_1= Uint64_1 )
            {
            // InternalRos2Parser.g:5363:2: ( () otherlv_1= Uint64_1 )
            // InternalRos2Parser.g:5364:3: () otherlv_1= Uint64_1
            {
            // InternalRos2Parser.g:5364:3: ()
            // InternalRos2Parser.g:5365:4: 
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
    // InternalRos2Parser.g:5379:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalRos2Parser.g:5379:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalRos2Parser.g:5380:2: iv_rulefloat32Array= rulefloat32Array EOF
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
    // InternalRos2Parser.g:5386:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= Float32_1 ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5392:2: ( ( () otherlv_1= Float32_1 ) )
            // InternalRos2Parser.g:5393:2: ( () otherlv_1= Float32_1 )
            {
            // InternalRos2Parser.g:5393:2: ( () otherlv_1= Float32_1 )
            // InternalRos2Parser.g:5394:3: () otherlv_1= Float32_1
            {
            // InternalRos2Parser.g:5394:3: ()
            // InternalRos2Parser.g:5395:4: 
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
    // InternalRos2Parser.g:5409:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalRos2Parser.g:5409:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalRos2Parser.g:5410:2: iv_rulefloat64Array= rulefloat64Array EOF
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
    // InternalRos2Parser.g:5416:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= Float64_1 ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5422:2: ( ( () otherlv_1= Float64_1 ) )
            // InternalRos2Parser.g:5423:2: ( () otherlv_1= Float64_1 )
            {
            // InternalRos2Parser.g:5423:2: ( () otherlv_1= Float64_1 )
            // InternalRos2Parser.g:5424:3: () otherlv_1= Float64_1
            {
            // InternalRos2Parser.g:5424:3: ()
            // InternalRos2Parser.g:5425:4: 
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
    // InternalRos2Parser.g:5439:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalRos2Parser.g:5439:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalRos2Parser.g:5440:2: iv_rulestring0Array= rulestring0Array EOF
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
    // InternalRos2Parser.g:5446:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= String_2 ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5452:2: ( ( () otherlv_1= String_2 ) )
            // InternalRos2Parser.g:5453:2: ( () otherlv_1= String_2 )
            {
            // InternalRos2Parser.g:5453:2: ( () otherlv_1= String_2 )
            // InternalRos2Parser.g:5454:3: () otherlv_1= String_2
            {
            // InternalRos2Parser.g:5454:3: ()
            // InternalRos2Parser.g:5455:4: 
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
    // InternalRos2Parser.g:5469:1: entryRulebyteArray returns [EObject current=null] : iv_rulebyteArray= rulebyteArray EOF ;
    public final EObject entryRulebyteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyteArray = null;


        try {
            // InternalRos2Parser.g:5469:50: (iv_rulebyteArray= rulebyteArray EOF )
            // InternalRos2Parser.g:5470:2: iv_rulebyteArray= rulebyteArray EOF
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
    // InternalRos2Parser.g:5476:1: rulebyteArray returns [EObject current=null] : ( () otherlv_1= Byte_1 ) ;
    public final EObject rulebyteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5482:2: ( ( () otherlv_1= Byte_1 ) )
            // InternalRos2Parser.g:5483:2: ( () otherlv_1= Byte_1 )
            {
            // InternalRos2Parser.g:5483:2: ( () otherlv_1= Byte_1 )
            // InternalRos2Parser.g:5484:3: () otherlv_1= Byte_1
            {
            // InternalRos2Parser.g:5484:3: ()
            // InternalRos2Parser.g:5485:4: 
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
    // InternalRos2Parser.g:5499:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRos2Parser.g:5499:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRos2Parser.g:5500:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalRos2Parser.g:5506:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= Header ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5512:2: ( ( () otherlv_1= Header ) )
            // InternalRos2Parser.g:5513:2: ( () otherlv_1= Header )
            {
            // InternalRos2Parser.g:5513:2: ( () otherlv_1= Header )
            // InternalRos2Parser.g:5514:3: () otherlv_1= Header
            {
            // InternalRos2Parser.g:5514:3: ()
            // InternalRos2Parser.g:5515:4: 
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


    // $ANTLR start "entryRuleTopicSpecRef"
    // InternalRos2Parser.g:5529:1: entryRuleTopicSpecRef returns [EObject current=null] : iv_ruleTopicSpecRef= ruleTopicSpecRef EOF ;
    public final EObject entryRuleTopicSpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpecRef = null;


        try {
            // InternalRos2Parser.g:5529:53: (iv_ruleTopicSpecRef= ruleTopicSpecRef EOF )
            // InternalRos2Parser.g:5530:2: iv_ruleTopicSpecRef= ruleTopicSpecRef EOF
            {
             newCompositeNode(grammarAccess.getTopicSpecRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopicSpecRef=ruleTopicSpecRef();

            state._fsp--;

             current =iv_ruleTopicSpecRef; 
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
    // $ANTLR end "entryRuleTopicSpecRef"


    // $ANTLR start "ruleTopicSpecRef"
    // InternalRos2Parser.g:5536:1: ruleTopicSpecRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleTopicSpecRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5542:2: ( ( ( ruleEString ) ) )
            // InternalRos2Parser.g:5543:2: ( ( ruleEString ) )
            {
            // InternalRos2Parser.g:5543:2: ( ( ruleEString ) )
            // InternalRos2Parser.g:5544:3: ( ruleEString )
            {
            // InternalRos2Parser.g:5544:3: ( ruleEString )
            // InternalRos2Parser.g:5545:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTopicSpecRefRule());
            				}
            			

            				newCompositeNode(grammarAccess.getTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0());
            			
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
    // $ANTLR end "ruleTopicSpecRef"


    // $ANTLR start "entryRuleArrayTopicSpecRef"
    // InternalRos2Parser.g:5562:1: entryRuleArrayTopicSpecRef returns [EObject current=null] : iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF ;
    public final EObject entryRuleArrayTopicSpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTopicSpecRef = null;


        try {
            // InternalRos2Parser.g:5562:58: (iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF )
            // InternalRos2Parser.g:5563:2: iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF
            {
             newCompositeNode(grammarAccess.getArrayTopicSpecRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayTopicSpecRef=ruleArrayTopicSpecRef();

            state._fsp--;

             current =iv_ruleArrayTopicSpecRef; 
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
    // $ANTLR end "entryRuleArrayTopicSpecRef"


    // $ANTLR start "ruleArrayTopicSpecRef"
    // InternalRos2Parser.g:5569:1: ruleArrayTopicSpecRef returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) ;
    public final EObject ruleArrayTopicSpecRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5575:2: ( ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) )
            // InternalRos2Parser.g:5576:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            {
            // InternalRos2Parser.g:5576:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            // InternalRos2Parser.g:5577:3: ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket
            {
            // InternalRos2Parser.g:5577:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:5578:4: ( ruleEString )
            {
            // InternalRos2Parser.g:5578:4: ( ruleEString )
            // InternalRos2Parser.g:5579:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayTopicSpecRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0_0());
            				
            pushFollow(FOLLOW_63);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,LeftSquareBracketRightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getArrayTopicSpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
            		

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
    // $ANTLR end "ruleArrayTopicSpecRef"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalRos2Parser.g:5601:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalRos2Parser.g:5601:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalRos2Parser.g:5602:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalRos2Parser.g:5608:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5614:2: ( (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) )
            // InternalRos2Parser.g:5615:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            {
            // InternalRos2Parser.g:5615:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            int alt78=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt78=1;
                }
                break;
            case Message:
                {
                alt78=2;
                }
                break;
            case Result:
                {
                alt78=3;
                }
                break;
            case Feedback:
                {
                alt78=4;
                }
                break;
            case Name:
                {
                alt78=5;
                }
                break;
            case Value:
                {
                alt78=6;
                }
                break;
            case Service:
                {
                alt78=7;
                }
                break;
            case Type:
                {
                alt78=8;
                }
                break;
            case Action:
                {
                alt78=9;
                }
                break;
            case Duration:
                {
                alt78=10;
                }
                break;
            case Time:
                {
                alt78=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalRos2Parser.g:5616:3: kw= Goal
                    {
                    kw=(Token)match(input,Goal,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:5622:3: kw= Message
                    {
                    kw=(Token)match(input,Message,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:5628:3: kw= Result
                    {
                    kw=(Token)match(input,Result,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRos2Parser.g:5634:3: kw= Feedback
                    {
                    kw=(Token)match(input,Feedback,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRos2Parser.g:5640:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRos2Parser.g:5646:3: kw= Value
                    {
                    kw=(Token)match(input,Value,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRos2Parser.g:5652:3: kw= Service
                    {
                    kw=(Token)match(input,Service,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRos2Parser.g:5658:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRos2Parser.g:5664:3: kw= Action
                    {
                    kw=(Token)match(input,Action,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRos2Parser.g:5670:3: kw= Duration
                    {
                    kw=(Token)match(input,Duration,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRos2Parser.g:5676:3: kw= Time
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

    // Delegated rules


    protected DFA77 dfa77 = new DFA77(this);
    static final String dfa_1s = "\42\uffff";
    static final String dfa_2s = "\36\uffff\2\41\2\uffff";
    static final String dfa_3s = "\1\36\35\uffff\2\42\2\uffff";
    static final String dfa_4s = "\1\157\35\uffff\2\175\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\37\1\36";
    static final String dfa_6s = "\42\uffff}>";
    static final String[] dfa_7s = {
            "\1\32\1\33\2\uffff\1\17\7\uffff\1\34\1\25\1\27\1\31\5\uffff\1\12\1\13\1\24\1\26\1\30\3\uffff\1\23\3\uffff\1\20\3\uffff\1\21\1\35\1\uffff\1\22\2\uffff\1\14\1\5\1\7\1\11\1\uffff\1\4\1\6\1\10\2\uffff\1\3\3\uffff\1\1\1\15\1\uffff\1\2\5\uffff\1\16\14\uffff\1\37\1\uffff\1\36",
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
            "\2\41\24\uffff\1\41\1\uffff\1\41\7\uffff\1\41\4\uffff\1\41\14\uffff\1\41\4\uffff\1\41\2\uffff\1\41\3\uffff\2\41\2\uffff\1\40\10\uffff\1\41\1\uffff\1\41\15\uffff\1\41",
            "\2\41\24\uffff\1\41\1\uffff\1\41\7\uffff\1\41\4\uffff\1\41\14\uffff\1\41\4\uffff\1\41\2\uffff\1\41\3\uffff\2\41\2\uffff\1\40\10\uffff\1\41\1\uffff\1\41\15\uffff\1\41",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA77 extends DFA {

        public DFA77(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 77;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4376:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004024000L,0x0000080000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000A00000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004004000L,0x0000080000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000680020000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L,0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L,0x0000A00000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000012000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008488000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000840002L,0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000840002L,0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000400000000200L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000080840000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000080040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000009000840000L,0x0000080000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x7001800000000000L,0x0000000000400003L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000024000L,0x0000080000000100L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000004000L,0x0000080000000100L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L,0x0000080088000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000080000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000600020000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000003103C00L,0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000A80000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8000000000000000L,0x0000A00000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x88F83C04C0000000L,0x0000A8010589DE58L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000200000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000020000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x88F83C04C0000002L,0x0000A0010589DE58L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0004000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x003CA08000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0500000C00000000L,0x2000A00312100084L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});

}