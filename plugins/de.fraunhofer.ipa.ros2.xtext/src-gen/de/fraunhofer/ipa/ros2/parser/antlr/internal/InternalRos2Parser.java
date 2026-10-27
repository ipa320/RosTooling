package de.fraunhofer.ipa.ros2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExternalDependency", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "Lease_duration", "Serviceclients", "Serviceservers", "Transient_local", "Actionclients", "Actionservers", "Dependencies", "Parameter_qos", "ParameterAny", "Unconfigured", "FromGitRepo", "Reliability", "Services_qos", "Subscribers", "Best_effort", "Default_qos", "Durability", "Liveliness", "Parameters", "Publishers", "Active_in", "Artifacts", "Lifecycle", "Sensor_qos", "Finalized", "GraphName", "Automatic", "Deadline", "Float32_1", "Float64_1", "Keep_last", "Lifespan", "Inactive", "Actions", "Default", "Duration", "Feedback", "History", "Infinite", "Keep_all", "Profile", "Reliable", "Response", "String_2", "Uint16_1", "Uint32_1", "Uint64_1", "Volatile", "Boolean", "Integer", "Float32", "Float64", "Int16_1", "Int32_1", "Int64_1", "Message", "Request", "Service", "Uint8_1", "Active", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Char_1", "Depth", "Int8_1", "Manual", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "Array", "Int16", "Int32", "Int64", "Msgs", "Node_1", "Srvs", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Char", "Goal", "Int8", "Name", "Node", "Qos", "Time", "Type", "Any", "Ns", "LeftSquareBracketRightSquareBracket", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Float32_1=36;
    public static final int Node=104;
    public static final int RULE_DATE_TIME=125;
    public static final int Uint64_1=54;
    public static final int Manual=79;
    public static final int Serviceclients=9;
    public static final int String=71;
    public static final int History=45;
    public static final int Int16=87;
    public static final int Float32=58;
    public static final int Goal=101;
    public static final int Actionservers=13;
    public static final int Bool=98;
    public static final int Msgs=90;
    public static final int Infinite=46;
    public static final int Uint16=82;
    public static final int Boolean=56;
    public static final int ExternalDependency=4;
    public static final int Uint8=94;
    public static final int Parameters=26;
    public static final int RULE_ID=126;
    public static final int Actions=41;
    public static final int Lifecycle=30;
    public static final int RULE_DIGIT=115;
    public static final int GlobalNamespace=7;
    public static final int Artifacts=29;
    public static final int Node_1=91;
    public static final int Int16_1=60;
    public static final int Header=70;
    public static final int RULE_INT=128;
    public static final int Byte=99;
    public static final int RULE_ML_COMMENT=135;
    public static final int LeftSquareBracket=113;
    public static final int Automatic=34;
    public static final int Base64=68;
    public static final int Finalized=32;
    public static final int Profile=48;
    public static final int Depth=77;
    public static final int Comma=111;
    public static final int RULE_MESSAGE_ASIGMENT=129;
    public static final int LeftSquareBracketRightSquareBracket=110;
    public static final int Int32=88;
    public static final int Char=100;
    public static final int Publishers=27;
    public static final int Parameter_qos=15;
    public static final int Srvs=92;
    public static final int RULE_DECINT=118;
    public static final int Reliable=49;
    public static final int Uint32=83;
    public static final int FromGitRepo=18;
    public static final int RULE_HOUR=123;
    public static final int Unconfigured=17;
    public static final int Int8=102;
    public static final int Default=42;
    public static final int Int8_1=78;
    public static final int Uint16_1=52;
    public static final int Type=107;
    public static final int Float64=59;
    public static final int Int32_1=61;
    public static final int Keep_all=47;
    public static final int RULE_BINARY=116;
    public static final int String_1=81;
    public static final int Subscribers=21;
    public static final int Active_in=28;
    public static final int String_2=51;
    public static final int Lifespan=39;
    public static final int Actionclients=12;
    public static final int RULE_DAY=120;
    public static final int RULE_BEGIN=130;
    public static final int Services_qos=20;
    public static final int RULE_BOOLEAN=117;
    public static final int RelativeNamespace=5;
    public static final int Serviceservers=10;
    public static final int RULE_YEAR=122;
    public static final int Result=80;
    public static final int Name=103;
    public static final int RULE_MIN_SEC=124;
    public static final int Default_qos=23;
    public static final int Char_1=76;
    public static final int ParameterAny=16;
    public static final int List=97;
    public static final int Dependencies=14;
    public static final int RightSquareBracket=114;
    public static final int PrivateNamespace=6;
    public static final int GraphName=33;
    public static final int Liveliness=25;
    public static final int Byte_1=75;
    public static final int Deadline=35;
    public static final int Float64_1=37;
    public static final int Durability=24;
    public static final int Duration=43;
    public static final int Uint32_1=53;
    public static final int Double=69;
    public static final int Active=67;
    public static final int Keep_last=38;
    public static final int Type_1=93;
    public static final int Value=95;
    public static final int Transient_local=11;
    public static final int Uint64=84;
    public static final int Lease_duration=8;
    public static final int Action=73;
    public static final int RULE_END=131;
    public static final int Message=63;
    public static final int Value_1=85;
    public static final int Time=106;
    public static final int RULE_STRING=127;
    public static final int Best_effort=22;
    public static final int Bool_1=74;
    public static final int Any=108;
    public static final int Struct=72;
    public static final int RULE_SL_COMMENT=132;
    public static final int Uint8_1=66;
    public static final int RULE_DOUBLE=119;
    public static final int Feedback=44;
    public static final int RULE_ROS_CONVENTION_A=133;
    public static final int Inactive=40;
    public static final int RULE_ROS_CONVENTION_PARAM=134;
    public static final int Colon=112;
    public static final int EOF=-1;
    public static final int Ns=109;
    public static final int RULE_WS=136;
    public static final int Int64_1=62;
    public static final int Request=64;
    public static final int Service=65;
    public static final int Sensor_qos=31;
    public static final int RULE_ANY_OTHER=137;
    public static final int Volatile=55;
    public static final int Date=96;
    public static final int Response=50;
    public static final int Integer=57;
    public static final int Array=86;
    public static final int Qos=105;
    public static final int Int64=89;
    public static final int RULE_MONTH=121;
    public static final int Reliability=19;

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
    // InternalRos2Parser.g:58:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalRos2Parser.g:58:48: (iv_rulePackage= rulePackage EOF )
            // InternalRos2Parser.g:59:2: iv_rulePackage= rulePackage EOF
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
    // InternalRos2Parser.g:65:1: rulePackage returns [EObject current=null] : this_AmentPackage_0= ruleAmentPackage ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        EObject this_AmentPackage_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:71:2: (this_AmentPackage_0= ruleAmentPackage )
            // InternalRos2Parser.g:72:2: this_AmentPackage_0= ruleAmentPackage
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
    // InternalRos2Parser.g:83:1: entryRuleAmentPackage returns [EObject current=null] : iv_ruleAmentPackage= ruleAmentPackage EOF ;
    public final EObject entryRuleAmentPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAmentPackage = null;


        try {
            // InternalRos2Parser.g:83:53: (iv_ruleAmentPackage= ruleAmentPackage EOF )
            // InternalRos2Parser.g:84:2: iv_ruleAmentPackage= ruleAmentPackage EOF
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
    // InternalRos2Parser.g:90:1: ruleAmentPackage returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END ) ;
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
            // InternalRos2Parser.g:96:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:97:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:97:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END )
            // InternalRos2Parser.g:98:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )? (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:98:3: ()
            // InternalRos2Parser.g:99:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAmentPackageAccess().getAmentPackageAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:105:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:106:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:106:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:107:5: lv_name_1_0= ruleRosNames
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
            						"de.fraunhofer.ipa.ros.Basics.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getAmentPackageAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_5); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getAmentPackageAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRos2Parser.g:132:3: (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==FromGitRepo) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRos2Parser.g:133:4: otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,FromGitRepo,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getAmentPackageAccess().getFromGitRepoKeyword_4_0());
                    			
                    // InternalRos2Parser.g:137:4: ( (lv_fromGitRepo_5_0= ruleEString ) )
                    // InternalRos2Parser.g:138:5: (lv_fromGitRepo_5_0= ruleEString )
                    {
                    // InternalRos2Parser.g:138:5: (lv_fromGitRepo_5_0= ruleEString )
                    // InternalRos2Parser.g:139:6: lv_fromGitRepo_5_0= ruleEString
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
                    							"de.fraunhofer.ipa.ros.Basics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:157:3: (otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Artifacts) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRos2Parser.g:158:4: otherlv_6= Artifacts this_BEGIN_7= RULE_BEGIN ( (lv_artifact_8_0= ruleArtifact ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Artifacts,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getAmentPackageAccess().getArtifactsKeyword_5_0());
                    			
                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_8); 

                    				newLeafNode(this_BEGIN_7, grammarAccess.getAmentPackageAccess().getBEGINTerminalRuleCall_5_1());
                    			
                    // InternalRos2Parser.g:166:4: ( (lv_artifact_8_0= ruleArtifact ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Node||LA2_0==RULE_ID||LA2_0==RULE_ROS_CONVENTION_A) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRos2Parser.g:167:5: (lv_artifact_8_0= ruleArtifact )
                    	    {
                    	    // InternalRos2Parser.g:167:5: (lv_artifact_8_0= ruleArtifact )
                    	    // InternalRos2Parser.g:168:6: lv_artifact_8_0= ruleArtifact
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

            // InternalRos2Parser.g:190:3: (otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Dependencies) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRos2Parser.g:191:4: otherlv_10= Dependencies otherlv_11= LeftSquareBracket ( (lv_dependency_12_0= ruleDependency ) ) (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )* otherlv_15= RightSquareBracket
                    {
                    otherlv_10=(Token)match(input,Dependencies,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getAmentPackageAccess().getDependenciesKeyword_6_0());
                    			
                    otherlv_11=(Token)match(input,LeftSquareBracket,FOLLOW_11); 

                    				newLeafNode(otherlv_11, grammarAccess.getAmentPackageAccess().getLeftSquareBracketKeyword_6_1());
                    			
                    // InternalRos2Parser.g:199:4: ( (lv_dependency_12_0= ruleDependency ) )
                    // InternalRos2Parser.g:200:5: (lv_dependency_12_0= ruleDependency )
                    {
                    // InternalRos2Parser.g:200:5: (lv_dependency_12_0= ruleDependency )
                    // InternalRos2Parser.g:201:6: lv_dependency_12_0= ruleDependency
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

                    // InternalRos2Parser.g:218:4: (otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalRos2Parser.g:219:5: otherlv_13= Comma ( (lv_dependency_14_0= ruleDependency ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getAmentPackageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRos2Parser.g:223:5: ( (lv_dependency_14_0= ruleDependency ) )
                    	    // InternalRos2Parser.g:224:6: (lv_dependency_14_0= ruleDependency )
                    	    {
                    	    // InternalRos2Parser.g:224:6: (lv_dependency_14_0= ruleDependency )
                    	    // InternalRos2Parser.g:225:7: lv_dependency_14_0= ruleDependency
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


    // $ANTLR start "entryRuleNode"
    // InternalRos2Parser.g:256:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRos2Parser.g:256:45: (iv_ruleNode= ruleNode EOF )
            // InternalRos2Parser.g:257:2: iv_ruleNode= ruleNode EOF
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
    // InternalRos2Parser.g:263:1: ruleNode returns [EObject current=null] : (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Lifecycle ( (lv_isLifecycle_3_0= ruleboolean0 ) ) ) | (otherlv_4= Publishers this_BEGIN_5= RULE_BEGIN ( (lv_publisher_6_0= rulePublisher ) )* this_END_7= RULE_END ) | (otherlv_8= Subscribers this_BEGIN_9= RULE_BEGIN ( (lv_subscriber_10_0= ruleSubscriber ) )* this_END_11= RULE_END ) | (otherlv_12= Serviceservers this_BEGIN_13= RULE_BEGIN ( (lv_serviceserver_14_0= ruleServiceServer ) )* this_END_15= RULE_END ) | (otherlv_16= Serviceclients this_BEGIN_17= RULE_BEGIN ( (lv_serviceclient_18_0= ruleServiceClient ) )* this_END_19= RULE_END ) | (otherlv_20= Actionservers this_BEGIN_21= RULE_BEGIN ( (lv_actionserver_22_0= ruleActionServer ) )* this_END_23= RULE_END ) | (otherlv_24= Actionclients this_BEGIN_25= RULE_BEGIN ( (lv_actionclient_26_0= ruleActionClient ) )* this_END_27= RULE_END ) | (otherlv_28= Parameters this_BEGIN_29= RULE_BEGIN ( (lv_parameter_30_0= ruleParameter ) )* this_END_31= RULE_END ) )* ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        Token otherlv_12=null;
        Token this_BEGIN_13=null;
        Token this_END_15=null;
        Token otherlv_16=null;
        Token this_BEGIN_17=null;
        Token this_END_19=null;
        Token otherlv_20=null;
        Token this_BEGIN_21=null;
        Token this_END_23=null;
        Token otherlv_24=null;
        Token this_BEGIN_25=null;
        Token this_END_27=null;
        Token otherlv_28=null;
        Token this_BEGIN_29=null;
        Token this_END_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_isLifecycle_3_0 = null;

        EObject lv_publisher_6_0 = null;

        EObject lv_subscriber_10_0 = null;

        EObject lv_serviceserver_14_0 = null;

        EObject lv_serviceclient_18_0 = null;

        EObject lv_actionserver_22_0 = null;

        EObject lv_actionclient_26_0 = null;

        EObject lv_parameter_30_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:269:2: ( (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Lifecycle ( (lv_isLifecycle_3_0= ruleboolean0 ) ) ) | (otherlv_4= Publishers this_BEGIN_5= RULE_BEGIN ( (lv_publisher_6_0= rulePublisher ) )* this_END_7= RULE_END ) | (otherlv_8= Subscribers this_BEGIN_9= RULE_BEGIN ( (lv_subscriber_10_0= ruleSubscriber ) )* this_END_11= RULE_END ) | (otherlv_12= Serviceservers this_BEGIN_13= RULE_BEGIN ( (lv_serviceserver_14_0= ruleServiceServer ) )* this_END_15= RULE_END ) | (otherlv_16= Serviceclients this_BEGIN_17= RULE_BEGIN ( (lv_serviceclient_18_0= ruleServiceClient ) )* this_END_19= RULE_END ) | (otherlv_20= Actionservers this_BEGIN_21= RULE_BEGIN ( (lv_actionserver_22_0= ruleActionServer ) )* this_END_23= RULE_END ) | (otherlv_24= Actionclients this_BEGIN_25= RULE_BEGIN ( (lv_actionclient_26_0= ruleActionClient ) )* this_END_27= RULE_END ) | (otherlv_28= Parameters this_BEGIN_29= RULE_BEGIN ( (lv_parameter_30_0= ruleParameter ) )* this_END_31= RULE_END ) )* ) )
            // InternalRos2Parser.g:270:2: (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Lifecycle ( (lv_isLifecycle_3_0= ruleboolean0 ) ) ) | (otherlv_4= Publishers this_BEGIN_5= RULE_BEGIN ( (lv_publisher_6_0= rulePublisher ) )* this_END_7= RULE_END ) | (otherlv_8= Subscribers this_BEGIN_9= RULE_BEGIN ( (lv_subscriber_10_0= ruleSubscriber ) )* this_END_11= RULE_END ) | (otherlv_12= Serviceservers this_BEGIN_13= RULE_BEGIN ( (lv_serviceserver_14_0= ruleServiceServer ) )* this_END_15= RULE_END ) | (otherlv_16= Serviceclients this_BEGIN_17= RULE_BEGIN ( (lv_serviceclient_18_0= ruleServiceClient ) )* this_END_19= RULE_END ) | (otherlv_20= Actionservers this_BEGIN_21= RULE_BEGIN ( (lv_actionserver_22_0= ruleActionServer ) )* this_END_23= RULE_END ) | (otherlv_24= Actionclients this_BEGIN_25= RULE_BEGIN ( (lv_actionclient_26_0= ruleActionClient ) )* this_END_27= RULE_END ) | (otherlv_28= Parameters this_BEGIN_29= RULE_BEGIN ( (lv_parameter_30_0= ruleParameter ) )* this_END_31= RULE_END ) )* )
            {
            // InternalRos2Parser.g:270:2: (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Lifecycle ( (lv_isLifecycle_3_0= ruleboolean0 ) ) ) | (otherlv_4= Publishers this_BEGIN_5= RULE_BEGIN ( (lv_publisher_6_0= rulePublisher ) )* this_END_7= RULE_END ) | (otherlv_8= Subscribers this_BEGIN_9= RULE_BEGIN ( (lv_subscriber_10_0= ruleSubscriber ) )* this_END_11= RULE_END ) | (otherlv_12= Serviceservers this_BEGIN_13= RULE_BEGIN ( (lv_serviceserver_14_0= ruleServiceServer ) )* this_END_15= RULE_END ) | (otherlv_16= Serviceclients this_BEGIN_17= RULE_BEGIN ( (lv_serviceclient_18_0= ruleServiceClient ) )* this_END_19= RULE_END ) | (otherlv_20= Actionservers this_BEGIN_21= RULE_BEGIN ( (lv_actionserver_22_0= ruleActionServer ) )* this_END_23= RULE_END ) | (otherlv_24= Actionclients this_BEGIN_25= RULE_BEGIN ( (lv_actionclient_26_0= ruleActionClient ) )* this_END_27= RULE_END ) | (otherlv_28= Parameters this_BEGIN_29= RULE_BEGIN ( (lv_parameter_30_0= ruleParameter ) )* this_END_31= RULE_END ) )* )
            // InternalRos2Parser.g:271:3: otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Lifecycle ( (lv_isLifecycle_3_0= ruleboolean0 ) ) ) | (otherlv_4= Publishers this_BEGIN_5= RULE_BEGIN ( (lv_publisher_6_0= rulePublisher ) )* this_END_7= RULE_END ) | (otherlv_8= Subscribers this_BEGIN_9= RULE_BEGIN ( (lv_subscriber_10_0= ruleSubscriber ) )* this_END_11= RULE_END ) | (otherlv_12= Serviceservers this_BEGIN_13= RULE_BEGIN ( (lv_serviceserver_14_0= ruleServiceServer ) )* this_END_15= RULE_END ) | (otherlv_16= Serviceclients this_BEGIN_17= RULE_BEGIN ( (lv_serviceclient_18_0= ruleServiceClient ) )* this_END_19= RULE_END ) | (otherlv_20= Actionservers this_BEGIN_21= RULE_BEGIN ( (lv_actionserver_22_0= ruleActionServer ) )* this_END_23= RULE_END ) | (otherlv_24= Actionclients this_BEGIN_25= RULE_BEGIN ( (lv_actionclient_26_0= ruleActionClient ) )* this_END_27= RULE_END ) | (otherlv_28= Parameters this_BEGIN_29= RULE_BEGIN ( (lv_parameter_30_0= ruleParameter ) )* this_END_31= RULE_END ) )*
            {
            otherlv_0=(Token)match(input,Node_1,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalRos2Parser.g:275:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:276:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:276:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:277:5: lv_name_1_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameRosNamesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_name_1_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Basics.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:294:3: ( (otherlv_2= Lifecycle ( (lv_isLifecycle_3_0= ruleboolean0 ) ) ) | (otherlv_4= Publishers this_BEGIN_5= RULE_BEGIN ( (lv_publisher_6_0= rulePublisher ) )* this_END_7= RULE_END ) | (otherlv_8= Subscribers this_BEGIN_9= RULE_BEGIN ( (lv_subscriber_10_0= ruleSubscriber ) )* this_END_11= RULE_END ) | (otherlv_12= Serviceservers this_BEGIN_13= RULE_BEGIN ( (lv_serviceserver_14_0= ruleServiceServer ) )* this_END_15= RULE_END ) | (otherlv_16= Serviceclients this_BEGIN_17= RULE_BEGIN ( (lv_serviceclient_18_0= ruleServiceClient ) )* this_END_19= RULE_END ) | (otherlv_20= Actionservers this_BEGIN_21= RULE_BEGIN ( (lv_actionserver_22_0= ruleActionServer ) )* this_END_23= RULE_END ) | (otherlv_24= Actionclients this_BEGIN_25= RULE_BEGIN ( (lv_actionclient_26_0= ruleActionClient ) )* this_END_27= RULE_END ) | (otherlv_28= Parameters this_BEGIN_29= RULE_BEGIN ( (lv_parameter_30_0= ruleParameter ) )* this_END_31= RULE_END ) )*
            loop13:
            do {
                int alt13=9;
                switch ( input.LA(1) ) {
                case Lifecycle:
                    {
                    alt13=1;
                    }
                    break;
                case Publishers:
                    {
                    alt13=2;
                    }
                    break;
                case Subscribers:
                    {
                    alt13=3;
                    }
                    break;
                case Serviceservers:
                    {
                    alt13=4;
                    }
                    break;
                case Serviceclients:
                    {
                    alt13=5;
                    }
                    break;
                case Actionservers:
                    {
                    alt13=6;
                    }
                    break;
                case Actionclients:
                    {
                    alt13=7;
                    }
                    break;
                case Parameters:
                    {
                    alt13=8;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalRos2Parser.g:295:4: (otherlv_2= Lifecycle ( (lv_isLifecycle_3_0= ruleboolean0 ) ) )
            	    {
            	    // InternalRos2Parser.g:295:4: (otherlv_2= Lifecycle ( (lv_isLifecycle_3_0= ruleboolean0 ) ) )
            	    // InternalRos2Parser.g:296:5: otherlv_2= Lifecycle ( (lv_isLifecycle_3_0= ruleboolean0 ) )
            	    {
            	    otherlv_2=(Token)match(input,Lifecycle,FOLLOW_16); 

            	    					newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getLifecycleKeyword_2_0_0());
            	    				
            	    // InternalRos2Parser.g:300:5: ( (lv_isLifecycle_3_0= ruleboolean0 ) )
            	    // InternalRos2Parser.g:301:6: (lv_isLifecycle_3_0= ruleboolean0 )
            	    {
            	    // InternalRos2Parser.g:301:6: (lv_isLifecycle_3_0= ruleboolean0 )
            	    // InternalRos2Parser.g:302:7: lv_isLifecycle_3_0= ruleboolean0
            	    {

            	    							newCompositeNode(grammarAccess.getNodeAccess().getIsLifecycleBoolean0ParserRuleCall_2_0_1_0());
            	    						
            	    pushFollow(FOLLOW_15);
            	    lv_isLifecycle_3_0=ruleboolean0();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    							}
            	    							set(
            	    								current,
            	    								"isLifecycle",
            	    								lv_isLifecycle_3_0,
            	    								"de.fraunhofer.ipa.ros.Basics.boolean0");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRos2Parser.g:321:4: (otherlv_4= Publishers this_BEGIN_5= RULE_BEGIN ( (lv_publisher_6_0= rulePublisher ) )* this_END_7= RULE_END )
            	    {
            	    // InternalRos2Parser.g:321:4: (otherlv_4= Publishers this_BEGIN_5= RULE_BEGIN ( (lv_publisher_6_0= rulePublisher ) )* this_END_7= RULE_END )
            	    // InternalRos2Parser.g:322:5: otherlv_4= Publishers this_BEGIN_5= RULE_BEGIN ( (lv_publisher_6_0= rulePublisher ) )* this_END_7= RULE_END
            	    {
            	    otherlv_4=(Token)match(input,Publishers,FOLLOW_4); 

            	    					newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getPublishersKeyword_2_1_0());
            	    				
            	    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            	    					newLeafNode(this_BEGIN_5, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_1_1());
            	    				
            	    // InternalRos2Parser.g:330:5: ( (lv_publisher_6_0= rulePublisher ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:331:6: (lv_publisher_6_0= rulePublisher )
            	    	    {
            	    	    // InternalRos2Parser.g:331:6: (lv_publisher_6_0= rulePublisher )
            	    	    // InternalRos2Parser.g:332:7: lv_publisher_6_0= rulePublisher
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_2_1_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_publisher_6_0=rulePublisher();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"publisher",
            	    	    								lv_publisher_6_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.Publisher");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop6;
            	        }
            	    } while (true);

            	    this_END_7=(Token)match(input,RULE_END,FOLLOW_15); 

            	    					newLeafNode(this_END_7, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRos2Parser.g:355:4: (otherlv_8= Subscribers this_BEGIN_9= RULE_BEGIN ( (lv_subscriber_10_0= ruleSubscriber ) )* this_END_11= RULE_END )
            	    {
            	    // InternalRos2Parser.g:355:4: (otherlv_8= Subscribers this_BEGIN_9= RULE_BEGIN ( (lv_subscriber_10_0= ruleSubscriber ) )* this_END_11= RULE_END )
            	    // InternalRos2Parser.g:356:5: otherlv_8= Subscribers this_BEGIN_9= RULE_BEGIN ( (lv_subscriber_10_0= ruleSubscriber ) )* this_END_11= RULE_END
            	    {
            	    otherlv_8=(Token)match(input,Subscribers,FOLLOW_4); 

            	    					newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getSubscribersKeyword_2_2_0());
            	    				
            	    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            	    					newLeafNode(this_BEGIN_9, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_2_1());
            	    				
            	    // InternalRos2Parser.g:364:5: ( (lv_subscriber_10_0= ruleSubscriber ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:365:6: (lv_subscriber_10_0= ruleSubscriber )
            	    	    {
            	    	    // InternalRos2Parser.g:365:6: (lv_subscriber_10_0= ruleSubscriber )
            	    	    // InternalRos2Parser.g:366:7: lv_subscriber_10_0= ruleSubscriber
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_2_2_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_subscriber_10_0=ruleSubscriber();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"subscriber",
            	    	    								lv_subscriber_10_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.Subscriber");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);

            	    this_END_11=(Token)match(input,RULE_END,FOLLOW_15); 

            	    					newLeafNode(this_END_11, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_2_3());
            	    				

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRos2Parser.g:389:4: (otherlv_12= Serviceservers this_BEGIN_13= RULE_BEGIN ( (lv_serviceserver_14_0= ruleServiceServer ) )* this_END_15= RULE_END )
            	    {
            	    // InternalRos2Parser.g:389:4: (otherlv_12= Serviceservers this_BEGIN_13= RULE_BEGIN ( (lv_serviceserver_14_0= ruleServiceServer ) )* this_END_15= RULE_END )
            	    // InternalRos2Parser.g:390:5: otherlv_12= Serviceservers this_BEGIN_13= RULE_BEGIN ( (lv_serviceserver_14_0= ruleServiceServer ) )* this_END_15= RULE_END
            	    {
            	    otherlv_12=(Token)match(input,Serviceservers,FOLLOW_4); 

            	    					newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getServiceserversKeyword_2_3_0());
            	    				
            	    this_BEGIN_13=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            	    					newLeafNode(this_BEGIN_13, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_3_1());
            	    				
            	    // InternalRos2Parser.g:398:5: ( (lv_serviceserver_14_0= ruleServiceServer ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_STRING)) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:399:6: (lv_serviceserver_14_0= ruleServiceServer )
            	    	    {
            	    	    // InternalRos2Parser.g:399:6: (lv_serviceserver_14_0= ruleServiceServer )
            	    	    // InternalRos2Parser.g:400:7: lv_serviceserver_14_0= ruleServiceServer
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_2_3_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_serviceserver_14_0=ruleServiceServer();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"serviceserver",
            	    	    								lv_serviceserver_14_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.ServiceServer");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    this_END_15=(Token)match(input,RULE_END,FOLLOW_15); 

            	    					newLeafNode(this_END_15, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_3_3());
            	    				

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRos2Parser.g:423:4: (otherlv_16= Serviceclients this_BEGIN_17= RULE_BEGIN ( (lv_serviceclient_18_0= ruleServiceClient ) )* this_END_19= RULE_END )
            	    {
            	    // InternalRos2Parser.g:423:4: (otherlv_16= Serviceclients this_BEGIN_17= RULE_BEGIN ( (lv_serviceclient_18_0= ruleServiceClient ) )* this_END_19= RULE_END )
            	    // InternalRos2Parser.g:424:5: otherlv_16= Serviceclients this_BEGIN_17= RULE_BEGIN ( (lv_serviceclient_18_0= ruleServiceClient ) )* this_END_19= RULE_END
            	    {
            	    otherlv_16=(Token)match(input,Serviceclients,FOLLOW_4); 

            	    					newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getServiceclientsKeyword_2_4_0());
            	    				
            	    this_BEGIN_17=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            	    					newLeafNode(this_BEGIN_17, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_4_1());
            	    				
            	    // InternalRos2Parser.g:432:5: ( (lv_serviceclient_18_0= ruleServiceClient ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:433:6: (lv_serviceclient_18_0= ruleServiceClient )
            	    	    {
            	    	    // InternalRos2Parser.g:433:6: (lv_serviceclient_18_0= ruleServiceClient )
            	    	    // InternalRos2Parser.g:434:7: lv_serviceclient_18_0= ruleServiceClient
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_2_4_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_serviceclient_18_0=ruleServiceClient();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"serviceclient",
            	    	    								lv_serviceclient_18_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.ServiceClient");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    this_END_19=(Token)match(input,RULE_END,FOLLOW_15); 

            	    					newLeafNode(this_END_19, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_4_3());
            	    				

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRos2Parser.g:457:4: (otherlv_20= Actionservers this_BEGIN_21= RULE_BEGIN ( (lv_actionserver_22_0= ruleActionServer ) )* this_END_23= RULE_END )
            	    {
            	    // InternalRos2Parser.g:457:4: (otherlv_20= Actionservers this_BEGIN_21= RULE_BEGIN ( (lv_actionserver_22_0= ruleActionServer ) )* this_END_23= RULE_END )
            	    // InternalRos2Parser.g:458:5: otherlv_20= Actionservers this_BEGIN_21= RULE_BEGIN ( (lv_actionserver_22_0= ruleActionServer ) )* this_END_23= RULE_END
            	    {
            	    otherlv_20=(Token)match(input,Actionservers,FOLLOW_4); 

            	    					newLeafNode(otherlv_20, grammarAccess.getNodeAccess().getActionserversKeyword_2_5_0());
            	    				
            	    this_BEGIN_21=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            	    					newLeafNode(this_BEGIN_21, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_5_1());
            	    				
            	    // InternalRos2Parser.g:466:5: ( (lv_actionserver_22_0= ruleActionServer ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_STRING)) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:467:6: (lv_actionserver_22_0= ruleActionServer )
            	    	    {
            	    	    // InternalRos2Parser.g:467:6: (lv_actionserver_22_0= ruleActionServer )
            	    	    // InternalRos2Parser.g:468:7: lv_actionserver_22_0= ruleActionServer
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_2_5_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_actionserver_22_0=ruleActionServer();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"actionserver",
            	    	    								lv_actionserver_22_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.ActionServer");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop10;
            	        }
            	    } while (true);

            	    this_END_23=(Token)match(input,RULE_END,FOLLOW_15); 

            	    					newLeafNode(this_END_23, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_5_3());
            	    				

            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRos2Parser.g:491:4: (otherlv_24= Actionclients this_BEGIN_25= RULE_BEGIN ( (lv_actionclient_26_0= ruleActionClient ) )* this_END_27= RULE_END )
            	    {
            	    // InternalRos2Parser.g:491:4: (otherlv_24= Actionclients this_BEGIN_25= RULE_BEGIN ( (lv_actionclient_26_0= ruleActionClient ) )* this_END_27= RULE_END )
            	    // InternalRos2Parser.g:492:5: otherlv_24= Actionclients this_BEGIN_25= RULE_BEGIN ( (lv_actionclient_26_0= ruleActionClient ) )* this_END_27= RULE_END
            	    {
            	    otherlv_24=(Token)match(input,Actionclients,FOLLOW_4); 

            	    					newLeafNode(otherlv_24, grammarAccess.getNodeAccess().getActionclientsKeyword_2_6_0());
            	    				
            	    this_BEGIN_25=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            	    					newLeafNode(this_BEGIN_25, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_6_1());
            	    				
            	    // InternalRos2Parser.g:500:5: ( (lv_actionclient_26_0= ruleActionClient ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_STRING)) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:501:6: (lv_actionclient_26_0= ruleActionClient )
            	    	    {
            	    	    // InternalRos2Parser.g:501:6: (lv_actionclient_26_0= ruleActionClient )
            	    	    // InternalRos2Parser.g:502:7: lv_actionclient_26_0= ruleActionClient
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_2_6_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_actionclient_26_0=ruleActionClient();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"actionclient",
            	    	    								lv_actionclient_26_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.ActionClient");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop11;
            	        }
            	    } while (true);

            	    this_END_27=(Token)match(input,RULE_END,FOLLOW_15); 

            	    					newLeafNode(this_END_27, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_6_3());
            	    				

            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalRos2Parser.g:525:4: (otherlv_28= Parameters this_BEGIN_29= RULE_BEGIN ( (lv_parameter_30_0= ruleParameter ) )* this_END_31= RULE_END )
            	    {
            	    // InternalRos2Parser.g:525:4: (otherlv_28= Parameters this_BEGIN_29= RULE_BEGIN ( (lv_parameter_30_0= ruleParameter ) )* this_END_31= RULE_END )
            	    // InternalRos2Parser.g:526:5: otherlv_28= Parameters this_BEGIN_29= RULE_BEGIN ( (lv_parameter_30_0= ruleParameter ) )* this_END_31= RULE_END
            	    {
            	    otherlv_28=(Token)match(input,Parameters,FOLLOW_4); 

            	    					newLeafNode(otherlv_28, grammarAccess.getNodeAccess().getParametersKeyword_2_7_0());
            	    				
            	    this_BEGIN_29=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            	    					newLeafNode(this_BEGIN_29, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_7_1());
            	    				
            	    // InternalRos2Parser.g:534:5: ( (lv_parameter_30_0= ruleParameter ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_STRING)) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:535:6: (lv_parameter_30_0= ruleParameter )
            	    	    {
            	    	    // InternalRos2Parser.g:535:6: (lv_parameter_30_0= ruleParameter )
            	    	    // InternalRos2Parser.g:536:7: lv_parameter_30_0= ruleParameter
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_2_7_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_parameter_30_0=ruleParameter();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"parameter",
            	    	    								lv_parameter_30_0,
            	    	    								"de.fraunhofer.ipa.ros2.Ros2.Parameter");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    this_END_31=(Token)match(input,RULE_END,FOLLOW_15); 

            	    					newLeafNode(this_END_31, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_7_3());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleQualityOfService"
    // InternalRos2Parser.g:563:1: entryRuleQualityOfService returns [EObject current=null] : iv_ruleQualityOfService= ruleQualityOfService EOF ;
    public final EObject entryRuleQualityOfService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualityOfService = null;


        try {
            // InternalRos2Parser.g:563:57: (iv_ruleQualityOfService= ruleQualityOfService EOF )
            // InternalRos2Parser.g:564:2: iv_ruleQualityOfService= ruleQualityOfService EOF
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
    // InternalRos2Parser.g:570:1: ruleQualityOfService returns [EObject current=null] : ( () this_BEGIN_1= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )* ) ) ) this_END_21= RULE_END ) ;
    public final EObject ruleQualityOfService() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_1=null;
        Token otherlv_3=null;
        Token lv_QoSProfile_4_1=null;
        Token lv_QoSProfile_4_2=null;
        Token lv_QoSProfile_4_3=null;
        Token lv_QoSProfile_4_4=null;
        Token otherlv_5=null;
        Token lv_History_6_1=null;
        Token lv_History_6_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_Reliability_10_1=null;
        Token lv_Reliability_10_2=null;
        Token otherlv_11=null;
        Token lv_Durability_12_1=null;
        Token lv_Durability_12_2=null;
        Token otherlv_13=null;
        Token lv_LeaseDuration_14_2=null;
        Token otherlv_15=null;
        Token lv_Liveliness_16_1=null;
        Token lv_Liveliness_16_2=null;
        Token otherlv_17=null;
        Token lv_Lifespan_18_2=null;
        Token otherlv_19=null;
        Token lv_Deadline_20_2=null;
        Token this_END_21=null;
        AntlrDatatypeRuleToken lv_Depth_8_0 = null;

        AntlrDatatypeRuleToken lv_LeaseDuration_14_1 = null;

        AntlrDatatypeRuleToken lv_Lifespan_18_1 = null;

        AntlrDatatypeRuleToken lv_Deadline_20_1 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:576:2: ( ( () this_BEGIN_1= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )* ) ) ) this_END_21= RULE_END ) )
            // InternalRos2Parser.g:577:2: ( () this_BEGIN_1= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )* ) ) ) this_END_21= RULE_END )
            {
            // InternalRos2Parser.g:577:2: ( () this_BEGIN_1= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )* ) ) ) this_END_21= RULE_END )
            // InternalRos2Parser.g:578:3: () this_BEGIN_1= RULE_BEGIN ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )* ) ) ) this_END_21= RULE_END
            {
            // InternalRos2Parser.g:578:3: ()
            // InternalRos2Parser.g:579:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQualityOfServiceAccess().getQualityOfServiceAction_0(),
            					current);
            			

            }

            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_18); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getQualityOfServiceAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalRos2Parser.g:589:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )* ) ) )
            // InternalRos2Parser.g:590:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )* ) )
            {
            // InternalRos2Parser.g:590:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )* ) )
            // InternalRos2Parser.g:591:5: ( ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            				
            // InternalRos2Parser.g:594:5: ( ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )* )
            // InternalRos2Parser.g:595:6: ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )*
            {
            // InternalRos2Parser.g:595:6: ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )*
            loop22:
            do {
                int alt22=10;
                alt22 = dfa22.predict(input);
                switch (alt22) {
            	case 1 :
            	    // InternalRos2Parser.g:596:4: ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) )
            	    {
            	    // InternalRos2Parser.g:596:4: ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) )
            	    // InternalRos2Parser.g:597:5: {...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalRos2Parser.g:597:113: ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) )
            	    // InternalRos2Parser.g:598:6: ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalRos2Parser.g:601:9: ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) )
            	    // InternalRos2Parser.g:601:10: {...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
            	    }
            	    // InternalRos2Parser.g:601:19: (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) )
            	    // InternalRos2Parser.g:601:20: otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) )
            	    {
            	    otherlv_3=(Token)match(input,Profile,FOLLOW_19); 

            	    									newLeafNode(otherlv_3, grammarAccess.getQualityOfServiceAccess().getProfileKeyword_2_0_0());
            	    								
            	    // InternalRos2Parser.g:605:9: ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) )
            	    // InternalRos2Parser.g:606:10: ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) )
            	    {
            	    // InternalRos2Parser.g:606:10: ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) )
            	    // InternalRos2Parser.g:607:11: (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos )
            	    {
            	    // InternalRos2Parser.g:607:11: (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos )
            	    int alt14=4;
            	    switch ( input.LA(1) ) {
            	    case Default_qos:
            	        {
            	        alt14=1;
            	        }
            	        break;
            	    case Services_qos:
            	        {
            	        alt14=2;
            	        }
            	        break;
            	    case Sensor_qos:
            	        {
            	        alt14=3;
            	        }
            	        break;
            	    case Parameter_qos:
            	        {
            	        alt14=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt14) {
            	        case 1 :
            	            // InternalRos2Parser.g:608:12: lv_QoSProfile_4_1= Default_qos
            	            {
            	            lv_QoSProfile_4_1=(Token)match(input,Default_qos,FOLLOW_18); 

            	            												newLeafNode(lv_QoSProfile_4_1, grammarAccess.getQualityOfServiceAccess().getQoSProfileDefault_qosKeyword_2_0_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_4_1, null);
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalRos2Parser.g:619:12: lv_QoSProfile_4_2= Services_qos
            	            {
            	            lv_QoSProfile_4_2=(Token)match(input,Services_qos,FOLLOW_18); 

            	            												newLeafNode(lv_QoSProfile_4_2, grammarAccess.getQualityOfServiceAccess().getQoSProfileServices_qosKeyword_2_0_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_4_2, null);
            	            											

            	            }
            	            break;
            	        case 3 :
            	            // InternalRos2Parser.g:630:12: lv_QoSProfile_4_3= Sensor_qos
            	            {
            	            lv_QoSProfile_4_3=(Token)match(input,Sensor_qos,FOLLOW_18); 

            	            												newLeafNode(lv_QoSProfile_4_3, grammarAccess.getQualityOfServiceAccess().getQoSProfileSensor_qosKeyword_2_0_1_0_2());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_4_3, null);
            	            											

            	            }
            	            break;
            	        case 4 :
            	            // InternalRos2Parser.g:641:12: lv_QoSProfile_4_4= Parameter_qos
            	            {
            	            lv_QoSProfile_4_4=(Token)match(input,Parameter_qos,FOLLOW_18); 

            	            												newLeafNode(lv_QoSProfile_4_4, grammarAccess.getQualityOfServiceAccess().getQoSProfileParameter_qosKeyword_2_0_1_0_3());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_4_4, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRos2Parser.g:660:4: ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) )
            	    {
            	    // InternalRos2Parser.g:660:4: ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) )
            	    // InternalRos2Parser.g:661:5: {...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalRos2Parser.g:661:113: ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) )
            	    // InternalRos2Parser.g:662:6: ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalRos2Parser.g:665:9: ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) )
            	    // InternalRos2Parser.g:665:10: {...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
            	    }
            	    // InternalRos2Parser.g:665:19: (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) )
            	    // InternalRos2Parser.g:665:20: otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) )
            	    {
            	    otherlv_5=(Token)match(input,History,FOLLOW_20); 

            	    									newLeafNode(otherlv_5, grammarAccess.getQualityOfServiceAccess().getHistoryKeyword_2_1_0());
            	    								
            	    // InternalRos2Parser.g:669:9: ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) )
            	    // InternalRos2Parser.g:670:10: ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) )
            	    {
            	    // InternalRos2Parser.g:670:10: ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) )
            	    // InternalRos2Parser.g:671:11: (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all )
            	    {
            	    // InternalRos2Parser.g:671:11: (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( LA15_0 == Keep_last ) {
            	        alt15=1;
            	    }
            	    else if ( LA15_0 == Keep_all ) {
            	        alt15=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalRos2Parser.g:672:12: lv_History_6_1= Keep_last
            	            {
            	            lv_History_6_1=(Token)match(input,Keep_last,FOLLOW_18); 

            	            												newLeafNode(lv_History_6_1, grammarAccess.getQualityOfServiceAccess().getHistoryKeep_lastKeyword_2_1_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "History", lv_History_6_1, null);
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalRos2Parser.g:683:12: lv_History_6_2= Keep_all
            	            {
            	            lv_History_6_2=(Token)match(input,Keep_all,FOLLOW_18); 

            	            												newLeafNode(lv_History_6_2, grammarAccess.getQualityOfServiceAccess().getHistoryKeep_allKeyword_2_1_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "History", lv_History_6_2, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRos2Parser.g:702:4: ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) )
            	    {
            	    // InternalRos2Parser.g:702:4: ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) )
            	    // InternalRos2Parser.g:703:5: {...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // InternalRos2Parser.g:703:113: ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) )
            	    // InternalRos2Parser.g:704:6: ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 2);
            	    					
            	    // InternalRos2Parser.g:707:9: ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) )
            	    // InternalRos2Parser.g:707:10: {...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
            	    }
            	    // InternalRos2Parser.g:707:19: (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) )
            	    // InternalRos2Parser.g:707:20: otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) )
            	    {
            	    otherlv_7=(Token)match(input,Depth,FOLLOW_21); 

            	    									newLeafNode(otherlv_7, grammarAccess.getQualityOfServiceAccess().getDepthKeyword_2_2_0());
            	    								
            	    // InternalRos2Parser.g:711:9: ( (lv_Depth_8_0= ruleInteger0 ) )
            	    // InternalRos2Parser.g:712:10: (lv_Depth_8_0= ruleInteger0 )
            	    {
            	    // InternalRos2Parser.g:712:10: (lv_Depth_8_0= ruleInteger0 )
            	    // InternalRos2Parser.g:713:11: lv_Depth_8_0= ruleInteger0
            	    {

            	    											newCompositeNode(grammarAccess.getQualityOfServiceAccess().getDepthInteger0ParserRuleCall_2_2_1_0());
            	    										
            	    pushFollow(FOLLOW_18);
            	    lv_Depth_8_0=ruleInteger0();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getQualityOfServiceRule());
            	    											}
            	    											set(
            	    												current,
            	    												"Depth",
            	    												lv_Depth_8_0,
            	    												"de.fraunhofer.ipa.ros.Basics.Integer0");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRos2Parser.g:736:4: ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) )
            	    {
            	    // InternalRos2Parser.g:736:4: ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) )
            	    // InternalRos2Parser.g:737:5: {...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // InternalRos2Parser.g:737:113: ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) )
            	    // InternalRos2Parser.g:738:6: ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 3);
            	    					
            	    // InternalRos2Parser.g:741:9: ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) )
            	    // InternalRos2Parser.g:741:10: {...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
            	    }
            	    // InternalRos2Parser.g:741:19: (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) )
            	    // InternalRos2Parser.g:741:20: otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) )
            	    {
            	    otherlv_9=(Token)match(input,Reliability,FOLLOW_22); 

            	    									newLeafNode(otherlv_9, grammarAccess.getQualityOfServiceAccess().getReliabilityKeyword_2_3_0());
            	    								
            	    // InternalRos2Parser.g:745:9: ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) )
            	    // InternalRos2Parser.g:746:10: ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) )
            	    {
            	    // InternalRos2Parser.g:746:10: ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) )
            	    // InternalRos2Parser.g:747:11: (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable )
            	    {
            	    // InternalRos2Parser.g:747:11: (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==Best_effort) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==Reliable) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalRos2Parser.g:748:12: lv_Reliability_10_1= Best_effort
            	            {
            	            lv_Reliability_10_1=(Token)match(input,Best_effort,FOLLOW_18); 

            	            												newLeafNode(lv_Reliability_10_1, grammarAccess.getQualityOfServiceAccess().getReliabilityBest_effortKeyword_2_3_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "Reliability", lv_Reliability_10_1, null);
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalRos2Parser.g:759:12: lv_Reliability_10_2= Reliable
            	            {
            	            lv_Reliability_10_2=(Token)match(input,Reliable,FOLLOW_18); 

            	            												newLeafNode(lv_Reliability_10_2, grammarAccess.getQualityOfServiceAccess().getReliabilityReliableKeyword_2_3_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "Reliability", lv_Reliability_10_2, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRos2Parser.g:778:4: ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) )
            	    {
            	    // InternalRos2Parser.g:778:4: ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) )
            	    // InternalRos2Parser.g:779:5: {...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // InternalRos2Parser.g:779:113: ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) )
            	    // InternalRos2Parser.g:780:6: ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 4);
            	    					
            	    // InternalRos2Parser.g:783:9: ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) )
            	    // InternalRos2Parser.g:783:10: {...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
            	    }
            	    // InternalRos2Parser.g:783:19: (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) )
            	    // InternalRos2Parser.g:783:20: otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) )
            	    {
            	    otherlv_11=(Token)match(input,Durability,FOLLOW_23); 

            	    									newLeafNode(otherlv_11, grammarAccess.getQualityOfServiceAccess().getDurabilityKeyword_2_4_0());
            	    								
            	    // InternalRos2Parser.g:787:9: ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) )
            	    // InternalRos2Parser.g:788:10: ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) )
            	    {
            	    // InternalRos2Parser.g:788:10: ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) )
            	    // InternalRos2Parser.g:789:11: (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile )
            	    {
            	    // InternalRos2Parser.g:789:11: (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==Transient_local) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==Volatile) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // InternalRos2Parser.g:790:12: lv_Durability_12_1= Transient_local
            	            {
            	            lv_Durability_12_1=(Token)match(input,Transient_local,FOLLOW_18); 

            	            												newLeafNode(lv_Durability_12_1, grammarAccess.getQualityOfServiceAccess().getDurabilityTransient_localKeyword_2_4_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "Durability", lv_Durability_12_1, null);
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalRos2Parser.g:801:12: lv_Durability_12_2= Volatile
            	            {
            	            lv_Durability_12_2=(Token)match(input,Volatile,FOLLOW_18); 

            	            												newLeafNode(lv_Durability_12_2, grammarAccess.getQualityOfServiceAccess().getDurabilityVolatileKeyword_2_4_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "Durability", lv_Durability_12_2, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRos2Parser.g:820:4: ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) )
            	    {
            	    // InternalRos2Parser.g:820:4: ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) )
            	    // InternalRos2Parser.g:821:5: {...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // InternalRos2Parser.g:821:113: ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) )
            	    // InternalRos2Parser.g:822:6: ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 5);
            	    					
            	    // InternalRos2Parser.g:825:9: ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) )
            	    // InternalRos2Parser.g:825:10: {...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
            	    }
            	    // InternalRos2Parser.g:825:19: (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) )
            	    // InternalRos2Parser.g:825:20: otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) )
            	    {
            	    otherlv_13=(Token)match(input,Lease_duration,FOLLOW_24); 

            	    									newLeafNode(otherlv_13, grammarAccess.getQualityOfServiceAccess().getLease_durationKeyword_2_5_0());
            	    								
            	    // InternalRos2Parser.g:829:9: ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) )
            	    // InternalRos2Parser.g:830:10: ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) )
            	    {
            	    // InternalRos2Parser.g:830:10: ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) )
            	    // InternalRos2Parser.g:831:11: (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite )
            	    {
            	    // InternalRos2Parser.g:831:11: (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==Infinite) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // InternalRos2Parser.g:832:12: lv_LeaseDuration_14_1= ruleEString
            	            {

            	            												newCompositeNode(grammarAccess.getQualityOfServiceAccess().getLeaseDurationEStringParserRuleCall_2_5_1_0_0());
            	            											
            	            pushFollow(FOLLOW_18);
            	            lv_LeaseDuration_14_1=ruleEString();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												set(
            	            													current,
            	            													"LeaseDuration",
            	            													lv_LeaseDuration_14_1,
            	            													"de.fraunhofer.ipa.ros.Basics.EString");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalRos2Parser.g:848:12: lv_LeaseDuration_14_2= Infinite
            	            {
            	            lv_LeaseDuration_14_2=(Token)match(input,Infinite,FOLLOW_18); 

            	            												newLeafNode(lv_LeaseDuration_14_2, grammarAccess.getQualityOfServiceAccess().getLeaseDurationInfiniteKeyword_2_5_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "LeaseDuration", lv_LeaseDuration_14_2, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRos2Parser.g:867:4: ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) )
            	    {
            	    // InternalRos2Parser.g:867:4: ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) )
            	    // InternalRos2Parser.g:868:5: {...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // InternalRos2Parser.g:868:113: ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) )
            	    // InternalRos2Parser.g:869:6: ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 6);
            	    					
            	    // InternalRos2Parser.g:872:9: ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) )
            	    // InternalRos2Parser.g:872:10: {...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
            	    }
            	    // InternalRos2Parser.g:872:19: (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) )
            	    // InternalRos2Parser.g:872:20: otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) )
            	    {
            	    otherlv_15=(Token)match(input,Liveliness,FOLLOW_25); 

            	    									newLeafNode(otherlv_15, grammarAccess.getQualityOfServiceAccess().getLivelinessKeyword_2_6_0());
            	    								
            	    // InternalRos2Parser.g:876:9: ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) )
            	    // InternalRos2Parser.g:877:10: ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) )
            	    {
            	    // InternalRos2Parser.g:877:10: ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) )
            	    // InternalRos2Parser.g:878:11: (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual )
            	    {
            	    // InternalRos2Parser.g:878:11: (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==Automatic) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==Manual) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalRos2Parser.g:879:12: lv_Liveliness_16_1= Automatic
            	            {
            	            lv_Liveliness_16_1=(Token)match(input,Automatic,FOLLOW_18); 

            	            												newLeafNode(lv_Liveliness_16_1, grammarAccess.getQualityOfServiceAccess().getLivelinessAutomaticKeyword_2_6_1_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "Liveliness", lv_Liveliness_16_1, null);
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalRos2Parser.g:890:12: lv_Liveliness_16_2= Manual
            	            {
            	            lv_Liveliness_16_2=(Token)match(input,Manual,FOLLOW_18); 

            	            												newLeafNode(lv_Liveliness_16_2, grammarAccess.getQualityOfServiceAccess().getLivelinessManualKeyword_2_6_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "Liveliness", lv_Liveliness_16_2, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // InternalRos2Parser.g:909:4: ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) )
            	    {
            	    // InternalRos2Parser.g:909:4: ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) )
            	    // InternalRos2Parser.g:910:5: {...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // InternalRos2Parser.g:910:113: ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) )
            	    // InternalRos2Parser.g:911:6: ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 7);
            	    					
            	    // InternalRos2Parser.g:914:9: ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) )
            	    // InternalRos2Parser.g:914:10: {...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
            	    }
            	    // InternalRos2Parser.g:914:19: (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) )
            	    // InternalRos2Parser.g:914:20: otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) )
            	    {
            	    otherlv_17=(Token)match(input,Lifespan,FOLLOW_24); 

            	    									newLeafNode(otherlv_17, grammarAccess.getQualityOfServiceAccess().getLifespanKeyword_2_7_0());
            	    								
            	    // InternalRos2Parser.g:918:9: ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) )
            	    // InternalRos2Parser.g:919:10: ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) )
            	    {
            	    // InternalRos2Parser.g:919:10: ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) )
            	    // InternalRos2Parser.g:920:11: (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite )
            	    {
            	    // InternalRos2Parser.g:920:11: (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==Infinite) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalRos2Parser.g:921:12: lv_Lifespan_18_1= ruleEString
            	            {

            	            												newCompositeNode(grammarAccess.getQualityOfServiceAccess().getLifespanEStringParserRuleCall_2_7_1_0_0());
            	            											
            	            pushFollow(FOLLOW_18);
            	            lv_Lifespan_18_1=ruleEString();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												set(
            	            													current,
            	            													"Lifespan",
            	            													lv_Lifespan_18_1,
            	            													"de.fraunhofer.ipa.ros.Basics.EString");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalRos2Parser.g:937:12: lv_Lifespan_18_2= Infinite
            	            {
            	            lv_Lifespan_18_2=(Token)match(input,Infinite,FOLLOW_18); 

            	            												newLeafNode(lv_Lifespan_18_2, grammarAccess.getQualityOfServiceAccess().getLifespanInfiniteKeyword_2_7_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "Lifespan", lv_Lifespan_18_2, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // InternalRos2Parser.g:956:4: ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) )
            	    {
            	    // InternalRos2Parser.g:956:4: ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) )
            	    // InternalRos2Parser.g:957:5: {...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // InternalRos2Parser.g:957:113: ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) )
            	    // InternalRos2Parser.g:958:6: ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 8);
            	    					
            	    // InternalRos2Parser.g:961:9: ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) )
            	    // InternalRos2Parser.g:961:10: {...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
            	    }
            	    // InternalRos2Parser.g:961:19: (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) )
            	    // InternalRos2Parser.g:961:20: otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) )
            	    {
            	    otherlv_19=(Token)match(input,Deadline,FOLLOW_24); 

            	    									newLeafNode(otherlv_19, grammarAccess.getQualityOfServiceAccess().getDeadlineKeyword_2_8_0());
            	    								
            	    // InternalRos2Parser.g:965:9: ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) )
            	    // InternalRos2Parser.g:966:10: ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) )
            	    {
            	    // InternalRos2Parser.g:966:10: ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) )
            	    // InternalRos2Parser.g:967:11: (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite )
            	    {
            	    // InternalRos2Parser.g:967:11: (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==Infinite) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalRos2Parser.g:968:12: lv_Deadline_20_1= ruleEString
            	            {

            	            												newCompositeNode(grammarAccess.getQualityOfServiceAccess().getDeadlineEStringParserRuleCall_2_8_1_0_0());
            	            											
            	            pushFollow(FOLLOW_18);
            	            lv_Deadline_20_1=ruleEString();

            	            state._fsp--;


            	            												if (current==null) {
            	            													current = createModelElementForParent(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												set(
            	            													current,
            	            													"Deadline",
            	            													lv_Deadline_20_1,
            	            													"de.fraunhofer.ipa.ros.Basics.EString");
            	            												afterParserOrEnumRuleCall();
            	            											

            	            }
            	            break;
            	        case 2 :
            	            // InternalRos2Parser.g:984:12: lv_Deadline_20_2= Infinite
            	            {
            	            lv_Deadline_20_2=(Token)match(input,Infinite,FOLLOW_18); 

            	            												newLeafNode(lv_Deadline_20_2, grammarAccess.getQualityOfServiceAccess().getDeadlineInfiniteKeyword_2_8_1_0_1());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getQualityOfServiceRule());
            	            												}
            	            												setWithLastConsumed(current, "Deadline", lv_Deadline_20_2, null);
            	            											

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2());
            				

            }

            this_END_21=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_21, grammarAccess.getQualityOfServiceAccess().getENDTerminalRuleCall_3());
            		

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
    // InternalRos2Parser.g:1018:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRos2Parser.g:1018:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRos2Parser.g:1019:2: iv_rulePublisher= rulePublisher EOF
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
    // InternalRos2Parser.g:1025:1: rulePublisher returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) ;
    public final EObject rulePublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        Enumerator lv_activeStates_10_0 = null;

        Enumerator lv_activeStates_12_0 = null;

        EObject lv_qos_15_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1031:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:1032:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:1032:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            // InternalRos2Parser.g:1033:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:1033:3: ()
            // InternalRos2Parser.g:1034:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublisherAccess().getPublisherAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:1040:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1041:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1041:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1042:5: lv_name_1_0= ruleEString
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
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getPublisherAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:1071:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:1072:4: ( ruleEString )
            {
            // InternalRos2Parser.g:1072:4: ( ruleEString )
            // InternalRos2Parser.g:1073:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:1087:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Ns) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRos2Parser.g:1088:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:1092:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1093:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1093:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1094:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Basics.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:1112:3: (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Active_in) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRos2Parser.g:1113:4: otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket
                    {
                    otherlv_8=(Token)match(input,Active_in,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getPublisherAccess().getActive_inKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,LeftSquareBracket,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getPublisherAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalRos2Parser.g:1121:4: ( (lv_activeStates_10_0= ruleLifecycleState ) )
                    // InternalRos2Parser.g:1122:5: (lv_activeStates_10_0= ruleLifecycleState )
                    {
                    // InternalRos2Parser.g:1122:5: (lv_activeStates_10_0= ruleLifecycleState )
                    // InternalRos2Parser.g:1123:6: lv_activeStates_10_0= ruleLifecycleState
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getActiveStatesLifecycleStateEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_activeStates_10_0=ruleLifecycleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						add(
                    							current,
                    							"activeStates",
                    							lv_activeStates_10_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:1140:4: (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRos2Parser.g:1141:5: otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FOLLOW_30); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPublisherAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRos2Parser.g:1145:5: ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    // InternalRos2Parser.g:1146:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    {
                    	    // InternalRos2Parser.g:1146:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    // InternalRos2Parser.g:1147:7: lv_activeStates_12_0= ruleLifecycleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getPublisherAccess().getActiveStatesLifecycleStateEnumRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_activeStates_12_0=ruleLifecycleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPublisherRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activeStates",
                    	    								lv_activeStates_12_0,
                    	    								"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getPublisherAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRos2Parser.g:1170:3: (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Qos) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRos2Parser.g:1171:4: otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) )
                    {
                    otherlv_14=(Token)match(input,Qos,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getPublisherAccess().getQosKeyword_8_0());
                    			
                    // InternalRos2Parser.g:1175:4: ( (lv_qos_15_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1176:5: (lv_qos_15_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1176:5: (lv_qos_15_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1177:6: lv_qos_15_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getQosQualityOfServiceParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_15_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPublisherRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_15_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getPublisherAccess().getENDTerminalRuleCall_9());
            		

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
    // InternalRos2Parser.g:1203:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRos2Parser.g:1203:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRos2Parser.g:1204:2: iv_ruleSubscriber= ruleSubscriber EOF
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
    // InternalRos2Parser.g:1210:1: ruleSubscriber returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) ;
    public final EObject ruleSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        Enumerator lv_activeStates_10_0 = null;

        Enumerator lv_activeStates_12_0 = null;

        EObject lv_qos_15_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1216:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:1217:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:1217:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            // InternalRos2Parser.g:1218:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:1218:3: ()
            // InternalRos2Parser.g:1219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubscriberAccess().getSubscriberAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:1225:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1226:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1226:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1227:5: lv_name_1_0= ruleEString
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
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSubscriberAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:1256:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:1257:4: ( ruleEString )
            {
            // InternalRos2Parser.g:1257:4: ( ruleEString )
            // InternalRos2Parser.g:1258:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:1272:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Ns) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRos2Parser.g:1273:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:1277:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1278:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1278:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1279:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Basics.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:1297:3: (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Active_in) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRos2Parser.g:1298:4: otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket
                    {
                    otherlv_8=(Token)match(input,Active_in,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getSubscriberAccess().getActive_inKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,LeftSquareBracket,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getSubscriberAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalRos2Parser.g:1306:4: ( (lv_activeStates_10_0= ruleLifecycleState ) )
                    // InternalRos2Parser.g:1307:5: (lv_activeStates_10_0= ruleLifecycleState )
                    {
                    // InternalRos2Parser.g:1307:5: (lv_activeStates_10_0= ruleLifecycleState )
                    // InternalRos2Parser.g:1308:6: lv_activeStates_10_0= ruleLifecycleState
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getActiveStatesLifecycleStateEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_activeStates_10_0=ruleLifecycleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						add(
                    							current,
                    							"activeStates",
                    							lv_activeStates_10_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:1325:4: (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==Comma) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalRos2Parser.g:1326:5: otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FOLLOW_30); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getSubscriberAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRos2Parser.g:1330:5: ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    // InternalRos2Parser.g:1331:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    {
                    	    // InternalRos2Parser.g:1331:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    // InternalRos2Parser.g:1332:7: lv_activeStates_12_0= ruleLifecycleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getSubscriberAccess().getActiveStatesLifecycleStateEnumRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_activeStates_12_0=ruleLifecycleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activeStates",
                    	    								lv_activeStates_12_0,
                    	    								"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getSubscriberAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRos2Parser.g:1355:3: (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Qos) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRos2Parser.g:1356:4: otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) )
                    {
                    otherlv_14=(Token)match(input,Qos,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getSubscriberAccess().getQosKeyword_8_0());
                    			
                    // InternalRos2Parser.g:1360:4: ( (lv_qos_15_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1361:5: (lv_qos_15_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1361:5: (lv_qos_15_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1362:6: lv_qos_15_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getQosQualityOfServiceParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_15_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubscriberRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_15_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getSubscriberAccess().getENDTerminalRuleCall_9());
            		

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
    // InternalRos2Parser.g:1388:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRos2Parser.g:1388:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRos2Parser.g:1389:2: iv_ruleServiceServer= ruleServiceServer EOF
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
    // InternalRos2Parser.g:1395:1: ruleServiceServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) ;
    public final EObject ruleServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        Enumerator lv_activeStates_10_0 = null;

        Enumerator lv_activeStates_12_0 = null;

        EObject lv_qos_15_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1401:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:1402:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:1402:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            // InternalRos2Parser.g:1403:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:1403:3: ()
            // InternalRos2Parser.g:1404:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceServerAccess().getServiceServerAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:1410:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1411:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1411:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1412:5: lv_name_1_0= ruleEString
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
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getServiceServerAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceServerAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:1441:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:1442:4: ( ruleEString )
            {
            // InternalRos2Parser.g:1442:4: ( ruleEString )
            // InternalRos2Parser.g:1443:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceServerAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:1457:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Ns) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRos2Parser.g:1458:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceServerAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:1462:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1463:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1463:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1464:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Basics.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:1482:3: (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Active_in) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRos2Parser.g:1483:4: otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket
                    {
                    otherlv_8=(Token)match(input,Active_in,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getServiceServerAccess().getActive_inKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,LeftSquareBracket,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getServiceServerAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalRos2Parser.g:1491:4: ( (lv_activeStates_10_0= ruleLifecycleState ) )
                    // InternalRos2Parser.g:1492:5: (lv_activeStates_10_0= ruleLifecycleState )
                    {
                    // InternalRos2Parser.g:1492:5: (lv_activeStates_10_0= ruleLifecycleState )
                    // InternalRos2Parser.g:1493:6: lv_activeStates_10_0= ruleLifecycleState
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getActiveStatesLifecycleStateEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_activeStates_10_0=ruleLifecycleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						add(
                    							current,
                    							"activeStates",
                    							lv_activeStates_10_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:1510:4: (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==Comma) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalRos2Parser.g:1511:5: otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FOLLOW_30); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getServiceServerAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRos2Parser.g:1515:5: ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    // InternalRos2Parser.g:1516:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    {
                    	    // InternalRos2Parser.g:1516:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    // InternalRos2Parser.g:1517:7: lv_activeStates_12_0= ruleLifecycleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceServerAccess().getActiveStatesLifecycleStateEnumRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_activeStates_12_0=ruleLifecycleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activeStates",
                    	    								lv_activeStates_12_0,
                    	    								"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getServiceServerAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRos2Parser.g:1540:3: (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==Qos) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRos2Parser.g:1541:4: otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) )
                    {
                    otherlv_14=(Token)match(input,Qos,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getServiceServerAccess().getQosKeyword_8_0());
                    			
                    // InternalRos2Parser.g:1545:4: ( (lv_qos_15_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1546:5: (lv_qos_15_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1546:5: (lv_qos_15_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1547:6: lv_qos_15_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getQosQualityOfServiceParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_15_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceServerRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_15_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getServiceServerAccess().getENDTerminalRuleCall_9());
            		

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
    // InternalRos2Parser.g:1573:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRos2Parser.g:1573:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRos2Parser.g:1574:2: iv_ruleServiceClient= ruleServiceClient EOF
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
    // InternalRos2Parser.g:1580:1: ruleServiceClient returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) ;
    public final EObject ruleServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        Enumerator lv_activeStates_10_0 = null;

        Enumerator lv_activeStates_12_0 = null;

        EObject lv_qos_15_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1586:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:1587:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:1587:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            // InternalRos2Parser.g:1588:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:1588:3: ()
            // InternalRos2Parser.g:1589:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceClientAccess().getServiceClientAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:1595:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1596:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1596:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1597:5: lv_name_1_0= ruleEString
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
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getServiceClientAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceClientAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:1626:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:1627:4: ( ruleEString )
            {
            // InternalRos2Parser.g:1627:4: ( ruleEString )
            // InternalRos2Parser.g:1628:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceClientAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:1642:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Ns) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalRos2Parser.g:1643:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:1647:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1648:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1648:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1649:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Basics.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:1667:3: (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==Active_in) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRos2Parser.g:1668:4: otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket
                    {
                    otherlv_8=(Token)match(input,Active_in,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getServiceClientAccess().getActive_inKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,LeftSquareBracket,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getServiceClientAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalRos2Parser.g:1676:4: ( (lv_activeStates_10_0= ruleLifecycleState ) )
                    // InternalRos2Parser.g:1677:5: (lv_activeStates_10_0= ruleLifecycleState )
                    {
                    // InternalRos2Parser.g:1677:5: (lv_activeStates_10_0= ruleLifecycleState )
                    // InternalRos2Parser.g:1678:6: lv_activeStates_10_0= ruleLifecycleState
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getActiveStatesLifecycleStateEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_activeStates_10_0=ruleLifecycleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						add(
                    							current,
                    							"activeStates",
                    							lv_activeStates_10_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:1695:4: (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==Comma) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRos2Parser.g:1696:5: otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FOLLOW_30); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getServiceClientAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRos2Parser.g:1700:5: ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    // InternalRos2Parser.g:1701:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    {
                    	    // InternalRos2Parser.g:1701:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    // InternalRos2Parser.g:1702:7: lv_activeStates_12_0= ruleLifecycleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getServiceClientAccess().getActiveStatesLifecycleStateEnumRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_activeStates_12_0=ruleLifecycleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activeStates",
                    	    								lv_activeStates_12_0,
                    	    								"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getServiceClientAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRos2Parser.g:1725:3: (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==Qos) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRos2Parser.g:1726:4: otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) )
                    {
                    otherlv_14=(Token)match(input,Qos,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getServiceClientAccess().getQosKeyword_8_0());
                    			
                    // InternalRos2Parser.g:1730:4: ( (lv_qos_15_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1731:5: (lv_qos_15_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1731:5: (lv_qos_15_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1732:6: lv_qos_15_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getQosQualityOfServiceParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_15_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceClientRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_15_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getServiceClientAccess().getENDTerminalRuleCall_9());
            		

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
    // InternalRos2Parser.g:1758:1: entryRuleActionServer returns [EObject current=null] : iv_ruleActionServer= ruleActionServer EOF ;
    public final EObject entryRuleActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionServer = null;


        try {
            // InternalRos2Parser.g:1758:53: (iv_ruleActionServer= ruleActionServer EOF )
            // InternalRos2Parser.g:1759:2: iv_ruleActionServer= ruleActionServer EOF
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
    // InternalRos2Parser.g:1765:1: ruleActionServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) ;
    public final EObject ruleActionServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        Enumerator lv_activeStates_10_0 = null;

        Enumerator lv_activeStates_12_0 = null;

        EObject lv_qos_15_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1771:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:1772:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:1772:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            // InternalRos2Parser.g:1773:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:1773:3: ()
            // InternalRos2Parser.g:1774:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionServerAccess().getActionServerAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:1780:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1781:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1781:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1782:5: lv_name_1_0= ruleEString
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
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getActionServerAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getActionServerAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getActionServerAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:1811:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:1812:4: ( ruleEString )
            {
            // InternalRos2Parser.g:1812:4: ( ruleEString )
            // InternalRos2Parser.g:1813:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionServerAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:1827:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Ns) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRos2Parser.g:1828:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionServerAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:1832:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1833:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1833:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1834:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionServerRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Basics.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:1852:3: (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==Active_in) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRos2Parser.g:1853:4: otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket
                    {
                    otherlv_8=(Token)match(input,Active_in,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionServerAccess().getActive_inKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,LeftSquareBracket,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionServerAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalRos2Parser.g:1861:4: ( (lv_activeStates_10_0= ruleLifecycleState ) )
                    // InternalRos2Parser.g:1862:5: (lv_activeStates_10_0= ruleLifecycleState )
                    {
                    // InternalRos2Parser.g:1862:5: (lv_activeStates_10_0= ruleLifecycleState )
                    // InternalRos2Parser.g:1863:6: lv_activeStates_10_0= ruleLifecycleState
                    {

                    						newCompositeNode(grammarAccess.getActionServerAccess().getActiveStatesLifecycleStateEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_activeStates_10_0=ruleLifecycleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionServerRule());
                    						}
                    						add(
                    							current,
                    							"activeStates",
                    							lv_activeStates_10_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:1880:4: (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==Comma) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalRos2Parser.g:1881:5: otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FOLLOW_30); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getActionServerAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRos2Parser.g:1885:5: ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    // InternalRos2Parser.g:1886:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    {
                    	    // InternalRos2Parser.g:1886:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    // InternalRos2Parser.g:1887:7: lv_activeStates_12_0= ruleLifecycleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionServerAccess().getActiveStatesLifecycleStateEnumRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_activeStates_12_0=ruleLifecycleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionServerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activeStates",
                    	    								lv_activeStates_12_0,
                    	    								"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionServerAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRos2Parser.g:1910:3: (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==Qos) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRos2Parser.g:1911:4: otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) )
                    {
                    otherlv_14=(Token)match(input,Qos,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionServerAccess().getQosKeyword_8_0());
                    			
                    // InternalRos2Parser.g:1915:4: ( (lv_qos_15_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1916:5: (lv_qos_15_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1916:5: (lv_qos_15_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1917:6: lv_qos_15_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getActionServerAccess().getQosQualityOfServiceParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_15_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionServerRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_15_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getActionServerAccess().getENDTerminalRuleCall_9());
            		

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
    // InternalRos2Parser.g:1943:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // InternalRos2Parser.g:1943:53: (iv_ruleActionClient= ruleActionClient EOF )
            // InternalRos2Parser.g:1944:2: iv_ruleActionClient= ruleActionClient EOF
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
    // InternalRos2Parser.g:1950:1: ruleActionClient returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) ;
    public final EObject ruleActionClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_END_16=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;

        Enumerator lv_activeStates_10_0 = null;

        Enumerator lv_activeStates_12_0 = null;

        EObject lv_qos_15_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:1956:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:1957:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:1957:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END )
            // InternalRos2Parser.g:1958:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )? (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:1958:3: ()
            // InternalRos2Parser.g:1959:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionClientAccess().getActionClientAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:1965:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1966:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1966:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1967:5: lv_name_1_0= ruleEString
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
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getActionClientAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getActionClientAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getActionClientAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:1996:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:1997:4: ( ruleEString )
            {
            // InternalRos2Parser.g:1997:4: ( ruleEString )
            // InternalRos2Parser.g:1998:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionClientAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:2012:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==Ns) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRos2Parser.g:2013:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:2017:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:2018:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:2018:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:2019:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionClientRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Basics.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:2037:3: (otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Active_in) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRos2Parser.g:2038:4: otherlv_8= Active_in otherlv_9= LeftSquareBracket ( (lv_activeStates_10_0= ruleLifecycleState ) ) (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )* otherlv_13= RightSquareBracket
                    {
                    otherlv_8=(Token)match(input,Active_in,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionClientAccess().getActive_inKeyword_7_0());
                    			
                    otherlv_9=(Token)match(input,LeftSquareBracket,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getActionClientAccess().getLeftSquareBracketKeyword_7_1());
                    			
                    // InternalRos2Parser.g:2046:4: ( (lv_activeStates_10_0= ruleLifecycleState ) )
                    // InternalRos2Parser.g:2047:5: (lv_activeStates_10_0= ruleLifecycleState )
                    {
                    // InternalRos2Parser.g:2047:5: (lv_activeStates_10_0= ruleLifecycleState )
                    // InternalRos2Parser.g:2048:6: lv_activeStates_10_0= ruleLifecycleState
                    {

                    						newCompositeNode(grammarAccess.getActionClientAccess().getActiveStatesLifecycleStateEnumRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_activeStates_10_0=ruleLifecycleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionClientRule());
                    						}
                    						add(
                    							current,
                    							"activeStates",
                    							lv_activeStates_10_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:2065:4: (otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==Comma) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalRos2Parser.g:2066:5: otherlv_11= Comma ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    {
                    	    otherlv_11=(Token)match(input,Comma,FOLLOW_30); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getActionClientAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRos2Parser.g:2070:5: ( (lv_activeStates_12_0= ruleLifecycleState ) )
                    	    // InternalRos2Parser.g:2071:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    {
                    	    // InternalRos2Parser.g:2071:6: (lv_activeStates_12_0= ruleLifecycleState )
                    	    // InternalRos2Parser.g:2072:7: lv_activeStates_12_0= ruleLifecycleState
                    	    {

                    	    							newCompositeNode(grammarAccess.getActionClientAccess().getActiveStatesLifecycleStateEnumRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_activeStates_12_0=ruleLifecycleState();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getActionClientRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"activeStates",
                    	    								lv_activeStates_12_0,
                    	    								"de.fraunhofer.ipa.ros2.Ros2.LifecycleState");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,RightSquareBracket,FOLLOW_31); 

                    				newLeafNode(otherlv_13, grammarAccess.getActionClientAccess().getRightSquareBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRos2Parser.g:2095:3: (otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Qos) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRos2Parser.g:2096:4: otherlv_14= Qos ( (lv_qos_15_0= ruleQualityOfService ) )
                    {
                    otherlv_14=(Token)match(input,Qos,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getActionClientAccess().getQosKeyword_8_0());
                    			
                    // InternalRos2Parser.g:2100:4: ( (lv_qos_15_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:2101:5: (lv_qos_15_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:2101:5: (lv_qos_15_0= ruleQualityOfService )
                    // InternalRos2Parser.g:2102:6: lv_qos_15_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getActionClientAccess().getQosQualityOfServiceParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_15_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionClientRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_15_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_16=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_16, grammarAccess.getActionClientAccess().getENDTerminalRuleCall_9());
            		

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
    // InternalRos2Parser.g:2128:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRos2Parser.g:2128:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRos2Parser.g:2129:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRos2Parser.g:2135:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? (otherlv_10= Qos ( (lv_qos_11_0= ruleQualityOfService ) ) )? this_END_12= RULE_END ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_END_12=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_namespace_7_0 = null;

        EObject lv_value_9_0 = null;

        EObject lv_qos_11_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2141:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? (otherlv_10= Qos ( (lv_qos_11_0= ruleQualityOfService ) ) )? this_END_12= RULE_END ) )
            // InternalRos2Parser.g:2142:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? (otherlv_10= Qos ( (lv_qos_11_0= ruleQualityOfService ) ) )? this_END_12= RULE_END )
            {
            // InternalRos2Parser.g:2142:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? (otherlv_10= Qos ( (lv_qos_11_0= ruleQualityOfService ) ) )? this_END_12= RULE_END )
            // InternalRos2Parser.g:2143:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? (otherlv_10= Qos ( (lv_qos_11_0= ruleQualityOfService ) ) )? this_END_12= RULE_END
            {
            // InternalRos2Parser.g:2143:3: ()
            // InternalRos2Parser.g:2144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:2150:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:2151:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:2151:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:2152:5: lv_name_1_0= ruleEString
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
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_26); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_4());
            		
            // InternalRos2Parser.g:2181:3: ( (lv_type_5_0= ruleParameterType ) )
            // InternalRos2Parser.g:2182:4: (lv_type_5_0= ruleParameterType )
            {
            // InternalRos2Parser.g:2182:4: (lv_type_5_0= ruleParameterType )
            // InternalRos2Parser.g:2183:5: lv_type_5_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_33);
            lv_type_5_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"de.fraunhofer.ipa.ros.Basics.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:2200:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Ns) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRos2Parser.g:2201:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_28); 

                    				newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getNsKeyword_6_0());
                    			
                    // InternalRos2Parser.g:2205:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:2206:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:2206:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:2207:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_namespace_7_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_7_0,
                    							"de.fraunhofer.ipa.ros.Basics.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:2225:3: (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Value_1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRos2Parser.g:2226:4: otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,Value_1,FOLLOW_35); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getValueKeyword_7_0());
                    			
                    // InternalRos2Parser.g:2230:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalRos2Parser.g:2231:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalRos2Parser.g:2231:5: (lv_value_9_0= ruleParameterValue )
                    // InternalRos2Parser.g:2232:6: lv_value_9_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_value_9_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_9_0,
                    							"de.fraunhofer.ipa.ros.Basics.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:2250:3: (otherlv_10= Qos ( (lv_qos_11_0= ruleQualityOfService ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Qos) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRos2Parser.g:2251:4: otherlv_10= Qos ( (lv_qos_11_0= ruleQualityOfService ) )
                    {
                    otherlv_10=(Token)match(input,Qos,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getQosKeyword_8_0());
                    			
                    // InternalRos2Parser.g:2255:4: ( (lv_qos_11_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:2256:5: (lv_qos_11_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:2256:5: (lv_qos_11_0= ruleQualityOfService )
                    // InternalRos2Parser.g:2257:6: lv_qos_11_0= ruleQualityOfService
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getQosQualityOfServiceParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_qos_11_0=ruleQualityOfService();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"qos",
                    							lv_qos_11_0,
                    							"de.fraunhofer.ipa.ros2.Ros2.QualityOfService");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            this_END_12=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_12, grammarAccess.getParameterAccess().getENDTerminalRuleCall_9());
            		

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


    // $ANTLR start "entryRulePackage_Impl"
    // InternalRos2Parser.g:2283:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // InternalRos2Parser.g:2283:53: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // InternalRos2Parser.g:2284:2: iv_rulePackage_Impl= rulePackage_Impl EOF
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
    // InternalRos2Parser.g:2290:1: rulePackage_Impl returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )? ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )* this_END_24= RULE_END ) ;
    public final EObject rulePackage_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_BEGIN_13=null;
        Token this_END_15=null;
        Token otherlv_16=null;
        Token this_BEGIN_17=null;
        Token this_END_19=null;
        Token otherlv_20=null;
        Token this_BEGIN_21=null;
        Token this_END_23=null;
        Token this_END_24=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_fromGitRepo_5_0 = null;

        EObject lv_dependency_8_0 = null;

        EObject lv_dependency_10_0 = null;

        EObject lv_spec_14_0 = null;

        EObject lv_spec_18_0 = null;

        EObject lv_spec_22_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2296:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )? ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )* this_END_24= RULE_END ) )
            // InternalRos2Parser.g:2297:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )? ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )* this_END_24= RULE_END )
            {
            // InternalRos2Parser.g:2297:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )? ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )* this_END_24= RULE_END )
            // InternalRos2Parser.g:2298:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )? ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )* this_END_24= RULE_END
            {
            // InternalRos2Parser.g:2298:3: ()
            // InternalRos2Parser.g:2299:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackage_ImplAccess().getPackageAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:2305:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:2306:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:2306:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:2307:5: lv_name_1_0= ruleRosNames
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
            						"de.fraunhofer.ipa.ros.Basics.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPackage_ImplAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_36); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRos2Parser.g:2332:3: (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==FromGitRepo) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRos2Parser.g:2333:4: otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,FromGitRepo,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackage_ImplAccess().getFromGitRepoKeyword_4_0());
                    			
                    // InternalRos2Parser.g:2337:4: ( (lv_fromGitRepo_5_0= ruleEString ) )
                    // InternalRos2Parser.g:2338:5: (lv_fromGitRepo_5_0= ruleEString )
                    {
                    // InternalRos2Parser.g:2338:5: (lv_fromGitRepo_5_0= ruleEString )
                    // InternalRos2Parser.g:2339:6: lv_fromGitRepo_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getFromGitRepoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_fromGitRepo_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    						}
                    						set(
                    							current,
                    							"fromGitRepo",
                    							lv_fromGitRepo_5_0,
                    							"de.fraunhofer.ipa.ros.Basics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:2357:3: (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Dependencies) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRos2Parser.g:2358:4: otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,Dependencies,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getPackage_ImplAccess().getDependenciesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,LeftSquareBracket,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getPackage_ImplAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalRos2Parser.g:2366:4: ( (lv_dependency_8_0= ruleDependency ) )
                    // InternalRos2Parser.g:2367:5: (lv_dependency_8_0= ruleDependency )
                    {
                    // InternalRos2Parser.g:2367:5: (lv_dependency_8_0= ruleDependency )
                    // InternalRos2Parser.g:2368:6: lv_dependency_8_0= ruleDependency
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getDependencyDependencyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_dependency_8_0=ruleDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    						}
                    						add(
                    							current,
                    							"dependency",
                    							lv_dependency_8_0,
                    							"de.fraunhofer.ipa.ros.Ros.Dependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:2385:4: (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==Comma) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalRos2Parser.g:2386:5: otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_11); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRos2Parser.g:2390:5: ( (lv_dependency_10_0= ruleDependency ) )
                    	    // InternalRos2Parser.g:2391:6: (lv_dependency_10_0= ruleDependency )
                    	    {
                    	    // InternalRos2Parser.g:2391:6: (lv_dependency_10_0= ruleDependency )
                    	    // InternalRos2Parser.g:2392:7: lv_dependency_10_0= ruleDependency
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getDependencyDependencyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_dependency_10_0=ruleDependency();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dependency",
                    	    								lv_dependency_10_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Dependency");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,RightSquareBracket,FOLLOW_38); 

                    				newLeafNode(otherlv_11, grammarAccess.getPackage_ImplAccess().getRightSquareBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRos2Parser.g:2415:3: ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )*
            loop56:
            do {
                int alt56=4;
                switch ( input.LA(1) ) {
                case Msgs:
                    {
                    alt56=1;
                    }
                    break;
                case Srvs:
                    {
                    alt56=2;
                    }
                    break;
                case Actions:
                    {
                    alt56=3;
                    }
                    break;

                }

                switch (alt56) {
            	case 1 :
            	    // InternalRos2Parser.g:2416:4: (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END )
            	    {
            	    // InternalRos2Parser.g:2416:4: (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END )
            	    // InternalRos2Parser.g:2417:5: otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END
            	    {
            	    otherlv_12=(Token)match(input,Msgs,FOLLOW_4); 

            	    					newLeafNode(otherlv_12, grammarAccess.getPackage_ImplAccess().getMsgsKeyword_6_0_0());
            	    				
            	    this_BEGIN_13=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

            	    					newLeafNode(this_BEGIN_13, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_6_0_1());
            	    				
            	    // InternalRos2Parser.g:2425:5: ( (lv_spec_14_0= ruleTopicSpec ) )*
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( ((LA53_0>=Header && LA53_0<=String)||(LA53_0>=RULE_ID && LA53_0<=RULE_STRING)) ) {
            	            alt53=1;
            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:2426:6: (lv_spec_14_0= ruleTopicSpec )
            	    	    {
            	    	    // InternalRos2Parser.g:2426:6: (lv_spec_14_0= ruleTopicSpec )
            	    	    // InternalRos2Parser.g:2427:7: lv_spec_14_0= ruleTopicSpec
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecTopicSpecParserRuleCall_6_0_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_39);
            	    	    lv_spec_14_0=ruleTopicSpec();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"spec",
            	    	    								lv_spec_14_0,
            	    	    								"de.fraunhofer.ipa.ros.Ros.TopicSpec");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop53;
            	        }
            	    } while (true);

            	    this_END_15=(Token)match(input,RULE_END,FOLLOW_38); 

            	    					newLeafNode(this_END_15, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_6_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRos2Parser.g:2450:4: (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END )
            	    {
            	    // InternalRos2Parser.g:2450:4: (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END )
            	    // InternalRos2Parser.g:2451:5: otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END
            	    {
            	    otherlv_16=(Token)match(input,Srvs,FOLLOW_4); 

            	    					newLeafNode(otherlv_16, grammarAccess.getPackage_ImplAccess().getSrvsKeyword_6_1_0());
            	    				
            	    this_BEGIN_17=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            	    					newLeafNode(this_BEGIN_17, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_6_1_1());
            	    				
            	    // InternalRos2Parser.g:2459:5: ( (lv_spec_18_0= ruleServiceSpec ) )*
            	    loop54:
            	    do {
            	        int alt54=2;
            	        int LA54_0 = input.LA(1);

            	        if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_STRING)) ) {
            	            alt54=1;
            	        }


            	        switch (alt54) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:2460:6: (lv_spec_18_0= ruleServiceSpec )
            	    	    {
            	    	    // InternalRos2Parser.g:2460:6: (lv_spec_18_0= ruleServiceSpec )
            	    	    // InternalRos2Parser.g:2461:7: lv_spec_18_0= ruleServiceSpec
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecServiceSpecParserRuleCall_6_1_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_spec_18_0=ruleServiceSpec();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"spec",
            	    	    								lv_spec_18_0,
            	    	    								"de.fraunhofer.ipa.ros.Ros.ServiceSpec");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop54;
            	        }
            	    } while (true);

            	    this_END_19=(Token)match(input,RULE_END,FOLLOW_38); 

            	    					newLeafNode(this_END_19, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_6_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRos2Parser.g:2484:4: (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END )
            	    {
            	    // InternalRos2Parser.g:2484:4: (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END )
            	    // InternalRos2Parser.g:2485:5: otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END
            	    {
            	    otherlv_20=(Token)match(input,Actions,FOLLOW_4); 

            	    					newLeafNode(otherlv_20, grammarAccess.getPackage_ImplAccess().getActionsKeyword_6_2_0());
            	    				
            	    this_BEGIN_21=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

            	    					newLeafNode(this_BEGIN_21, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_6_2_1());
            	    				
            	    // InternalRos2Parser.g:2493:5: ( (lv_spec_22_0= ruleActionSpec ) )*
            	    loop55:
            	    do {
            	        int alt55=2;
            	        int LA55_0 = input.LA(1);

            	        if ( ((LA55_0>=RULE_ID && LA55_0<=RULE_STRING)) ) {
            	            alt55=1;
            	        }


            	        switch (alt55) {
            	    	case 1 :
            	    	    // InternalRos2Parser.g:2494:6: (lv_spec_22_0= ruleActionSpec )
            	    	    {
            	    	    // InternalRos2Parser.g:2494:6: (lv_spec_22_0= ruleActionSpec )
            	    	    // InternalRos2Parser.g:2495:7: lv_spec_22_0= ruleActionSpec
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecActionSpecParserRuleCall_6_2_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_17);
            	    	    lv_spec_22_0=ruleActionSpec();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"spec",
            	    	    								lv_spec_22_0,
            	    	    								"de.fraunhofer.ipa.ros.Ros.ActionSpec");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop55;
            	        }
            	    } while (true);

            	    this_END_23=(Token)match(input,RULE_END,FOLLOW_38); 

            	    					newLeafNode(this_END_23, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_6_2_3());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            this_END_24=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_24, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_7());
            		

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


    // $ANTLR start "entryRuleTopicSpec"
    // InternalRos2Parser.g:2526:1: entryRuleTopicSpec returns [EObject current=null] : iv_ruleTopicSpec= ruleTopicSpec EOF ;
    public final EObject entryRuleTopicSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpec = null;


        try {
            // InternalRos2Parser.g:2526:50: (iv_ruleTopicSpec= ruleTopicSpec EOF )
            // InternalRos2Parser.g:2527:2: iv_ruleTopicSpec= ruleTopicSpec EOF
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
    // InternalRos2Parser.g:2533:1: ruleTopicSpec returns [EObject current=null] : ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Message (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? this_END_7= RULE_END ) ;
    public final EObject ruleTopicSpec() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_2=null;
        Token lv_name_1_3=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token this_END_7=null;
        AntlrDatatypeRuleToken lv_name_1_1 = null;

        EObject lv_message_5_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2539:2: ( ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Message (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? this_END_7= RULE_END ) )
            // InternalRos2Parser.g:2540:2: ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Message (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? this_END_7= RULE_END )
            {
            // InternalRos2Parser.g:2540:2: ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Message (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? this_END_7= RULE_END )
            // InternalRos2Parser.g:2541:3: () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Message (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? this_END_7= RULE_END
            {
            // InternalRos2Parser.g:2541:3: ()
            // InternalRos2Parser.g:2542:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicSpecAccess().getTopicSpecAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:2548:3: ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) )
            // InternalRos2Parser.g:2549:4: ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) )
            {
            // InternalRos2Parser.g:2549:4: ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) )
            // InternalRos2Parser.g:2550:5: (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String )
            {
            // InternalRos2Parser.g:2550:5: (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String )
            int alt57=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt57=1;
                }
                break;
            case Header:
                {
                alt57=2;
                }
                break;
            case String:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalRos2Parser.g:2551:6: lv_name_1_1= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTopicSpecAccess().getNameEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_1_1=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopicSpecRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_1,
                    							"de.fraunhofer.ipa.ros.Basics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:2567:6: lv_name_1_2= Header
                    {
                    lv_name_1_2=(Token)match(input,Header,FOLLOW_4); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getTopicSpecAccess().getNameHeaderKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicSpecRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:2578:6: lv_name_1_3= String
                    {
                    lv_name_1_3=(Token)match(input,String,FOLLOW_4); 

                    						newLeafNode(lv_name_1_3, grammarAccess.getTopicSpecAccess().getNameStringKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicSpecRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_3, null);
                    					

                    }
                    break;

            }


            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_40); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getTopicSpecAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Message,FOLLOW_41); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicSpecAccess().getMessageKeyword_3());
            		
            // InternalRos2Parser.g:2599:3: (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_BEGIN) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRos2Parser.g:2600:4: this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getTopicSpecAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    // InternalRos2Parser.g:2604:4: ( (lv_message_5_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2605:5: (lv_message_5_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2605:5: (lv_message_5_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2606:6: lv_message_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getTopicSpecAccess().getMessageMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_message_5_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopicSpecRule());
                    						}
                    						set(
                    							current,
                    							"message",
                    							lv_message_5_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_13); 

                    				newLeafNode(this_END_6, grammarAccess.getTopicSpecAccess().getENDTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }

            this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_7, grammarAccess.getTopicSpecAccess().getENDTerminalRuleCall_5());
            		

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
    // InternalRos2Parser.g:2636:1: entryRuleServiceSpec returns [EObject current=null] : iv_ruleServiceSpec= ruleServiceSpec EOF ;
    public final EObject entryRuleServiceSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSpec = null;


        try {
            // InternalRos2Parser.g:2636:52: (iv_ruleServiceSpec= ruleServiceSpec EOF )
            // InternalRos2Parser.g:2637:2: iv_ruleServiceSpec= ruleServiceSpec EOF
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
    // InternalRos2Parser.g:2643:1: ruleServiceSpec returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Request (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Response (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? this_END_11= RULE_END ) ;
    public final EObject ruleServiceSpec() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        Token this_END_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_request_5_0 = null;

        EObject lv_response_9_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2649:2: ( ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Request (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Response (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? this_END_11= RULE_END ) )
            // InternalRos2Parser.g:2650:2: ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Request (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Response (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? this_END_11= RULE_END )
            {
            // InternalRos2Parser.g:2650:2: ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Request (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Response (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? this_END_11= RULE_END )
            // InternalRos2Parser.g:2651:3: () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Request (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Response (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? this_END_11= RULE_END
            {
            // InternalRos2Parser.g:2651:3: ()
            // InternalRos2Parser.g:2652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceSpecAccess().getServiceSpecAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:2658:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:2659:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:2659:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:2660:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceSpecAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceSpecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_43); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Request,FOLLOW_44); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceSpecAccess().getRequestKeyword_3());
            		
            // InternalRos2Parser.g:2685:3: (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_BEGIN) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRos2Parser.g:2686:4: this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    // InternalRos2Parser.g:2690:4: ( (lv_request_5_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2691:5: (lv_request_5_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2691:5: (lv_request_5_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2692:6: lv_request_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getRequestMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_request_5_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceSpecRule());
                    						}
                    						set(
                    							current,
                    							"request",
                    							lv_request_5_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_45); 

                    				newLeafNode(this_END_6, grammarAccess.getServiceSpecAccess().getENDTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,Response,FOLLOW_41); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceSpecAccess().getResponseKeyword_5());
            		
            // InternalRos2Parser.g:2718:3: (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_BEGIN) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRos2Parser.g:2719:4: this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END
                    {
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

                    				newLeafNode(this_BEGIN_8, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_6_0());
                    			
                    // InternalRos2Parser.g:2723:4: ( (lv_response_9_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2724:5: (lv_response_9_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2724:5: (lv_response_9_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2725:6: lv_response_9_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getResponseMessageDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_response_9_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceSpecRule());
                    						}
                    						set(
                    							current,
                    							"response",
                    							lv_response_9_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_10=(Token)match(input,RULE_END,FOLLOW_13); 

                    				newLeafNode(this_END_10, grammarAccess.getServiceSpecAccess().getENDTerminalRuleCall_6_2());
                    			

                    }
                    break;

            }

            this_END_11=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_11, grammarAccess.getServiceSpecAccess().getENDTerminalRuleCall_7());
            		

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
    // InternalRos2Parser.g:2755:1: entryRuleActionSpec returns [EObject current=null] : iv_ruleActionSpec= ruleActionSpec EOF ;
    public final EObject entryRuleActionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSpec = null;


        try {
            // InternalRos2Parser.g:2755:51: (iv_ruleActionSpec= ruleActionSpec EOF )
            // InternalRos2Parser.g:2756:2: iv_ruleActionSpec= ruleActionSpec EOF
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
    // InternalRos2Parser.g:2762:1: ruleActionSpec returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Goal (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Result (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? otherlv_11= Feedback (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )? this_END_15= RULE_END ) ;
    public final EObject ruleActionSpec() throws RecognitionException {
        EObject current = null;

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
        Token this_END_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_goal_5_0 = null;

        EObject lv_result_9_0 = null;

        EObject lv_feedback_13_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2768:2: ( ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Goal (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Result (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? otherlv_11= Feedback (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )? this_END_15= RULE_END ) )
            // InternalRos2Parser.g:2769:2: ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Goal (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Result (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? otherlv_11= Feedback (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )? this_END_15= RULE_END )
            {
            // InternalRos2Parser.g:2769:2: ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Goal (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Result (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? otherlv_11= Feedback (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )? this_END_15= RULE_END )
            // InternalRos2Parser.g:2770:3: () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Goal (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Result (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? otherlv_11= Feedback (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )? this_END_15= RULE_END
            {
            // InternalRos2Parser.g:2770:3: ()
            // InternalRos2Parser.g:2771:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionSpecAccess().getActionSpecAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:2777:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:2778:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:2778:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:2779:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionSpecAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionSpecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_46); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Goal,FOLLOW_47); 

            			newLeafNode(otherlv_3, grammarAccess.getActionSpecAccess().getGoalKeyword_3());
            		
            // InternalRos2Parser.g:2804:3: (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_BEGIN) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRos2Parser.g:2805:4: this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    // InternalRos2Parser.g:2809:4: ( (lv_goal_5_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2810:5: (lv_goal_5_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2810:5: (lv_goal_5_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2811:6: lv_goal_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getGoalMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_goal_5_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"goal",
                    							lv_goal_5_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_48); 

                    				newLeafNode(this_END_6, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,Result,FOLLOW_49); 

            			newLeafNode(otherlv_7, grammarAccess.getActionSpecAccess().getResultKeyword_5());
            		
            // InternalRos2Parser.g:2837:3: (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_BEGIN) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRos2Parser.g:2838:4: this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END
                    {
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

                    				newLeafNode(this_BEGIN_8, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_6_0());
                    			
                    // InternalRos2Parser.g:2842:4: ( (lv_result_9_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2843:5: (lv_result_9_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2843:5: (lv_result_9_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2844:6: lv_result_9_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getResultMessageDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_result_9_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"result",
                    							lv_result_9_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_10=(Token)match(input,RULE_END,FOLLOW_50); 

                    				newLeafNode(this_END_10, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_6_2());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,Feedback,FOLLOW_41); 

            			newLeafNode(otherlv_11, grammarAccess.getActionSpecAccess().getFeedbackKeyword_7());
            		
            // InternalRos2Parser.g:2870:3: (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_BEGIN) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRos2Parser.g:2871:4: this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END
                    {
                    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_42); 

                    				newLeafNode(this_BEGIN_12, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_8_0());
                    			
                    // InternalRos2Parser.g:2875:4: ( (lv_feedback_13_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2876:5: (lv_feedback_13_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2876:5: (lv_feedback_13_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2877:6: lv_feedback_13_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getFeedbackMessageDefinitionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_feedback_13_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"feedback",
                    							lv_feedback_13_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_END_14=(Token)match(input,RULE_END,FOLLOW_13); 

                    				newLeafNode(this_END_14, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_8_2());
                    			

                    }
                    break;

            }

            this_END_15=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_15, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_9());
            		

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
    // InternalRos2Parser.g:2907:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalRos2Parser.g:2907:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalRos2Parser.g:2908:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
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
    // InternalRos2Parser.g:2914:1: ruleMessageDefinition returns [EObject current=null] : ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_MessagePart_1_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2920:2: ( ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* ) )
            // InternalRos2Parser.g:2921:2: ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* )
            {
            // InternalRos2Parser.g:2921:2: ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* )
            // InternalRos2Parser.g:2922:3: () ( (lv_MessagePart_1_0= ruleMessagePart ) )*
            {
            // InternalRos2Parser.g:2922:3: ()
            // InternalRos2Parser.g:2923:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:2929:3: ( (lv_MessagePart_1_0= ruleMessagePart ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=Float32_1 && LA64_0<=Float64_1)||LA64_0==Duration||(LA64_0>=String_2 && LA64_0<=Uint64_1)||(LA64_0>=Float32 && LA64_0<=Int64_1)||LA64_0==Uint8_1||LA64_0==Header||(LA64_0>=Bool_1 && LA64_0<=Char_1)||LA64_0==Int8_1||(LA64_0>=String_1 && LA64_0<=Uint64)||(LA64_0>=Int16 && LA64_0<=Int64)||LA64_0==Uint8||(LA64_0>=Bool && LA64_0<=Char)||LA64_0==Int8||LA64_0==Time||(LA64_0>=RULE_ID && LA64_0<=RULE_STRING)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // InternalRos2Parser.g:2930:4: (lv_MessagePart_1_0= ruleMessagePart )
            	    {
            	    // InternalRos2Parser.g:2930:4: (lv_MessagePart_1_0= ruleMessagePart )
            	    // InternalRos2Parser.g:2931:5: lv_MessagePart_1_0= ruleMessagePart
            	    {

            	    					newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_51);
            	    lv_MessagePart_1_0=ruleMessagePart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMessageDefinitionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"MessagePart",
            	    						lv_MessagePart_1_0,
            	    						"de.fraunhofer.ipa.ros.Basics.MessagePart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
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


    // $ANTLR start "entryRuleArtifact"
    // InternalRos2Parser.g:2952:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalRos2Parser.g:2952:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalRos2Parser.g:2953:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalRos2Parser.g:2959:1: ruleArtifact returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_node_4_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:2965:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END ) )
            // InternalRos2Parser.g:2966:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END )
            {
            // InternalRos2Parser.g:2966:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END )
            // InternalRos2Parser.g:2967:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END
            {
            // InternalRos2Parser.g:2967:3: ()
            // InternalRos2Parser.g:2968:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:2974:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:2975:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:2975:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:2976:5: lv_name_1_0= ruleRosNames
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
            						"de.fraunhofer.ipa.ros.Basics.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,Colon,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_52); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getArtifactAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRos2Parser.g:3001:3: ( (lv_node_4_0= ruleNode ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Node_1) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRos2Parser.g:3002:4: (lv_node_4_0= ruleNode )
                    {
                    // InternalRos2Parser.g:3002:4: (lv_node_4_0= ruleNode )
                    // InternalRos2Parser.g:3003:5: lv_node_4_0= ruleNode
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
                    						"de.fraunhofer.ipa.ros2.Ros2.Node");
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


    // $ANTLR start "entryRuleDependency"
    // InternalRos2Parser.g:3028:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalRos2Parser.g:3028:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalRos2Parser.g:3029:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalRos2Parser.g:3035:1: ruleDependency returns [EObject current=null] : (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDependency_0 = null;

        EObject this_ExternalDependency_1 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3041:2: ( (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) )
            // InternalRos2Parser.g:3042:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            {
            // InternalRos2Parser.g:3042:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_ID && LA66_0<=RULE_STRING)) ) {
                alt66=1;
            }
            else if ( (LA66_0==ExternalDependency) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalRos2Parser.g:3043:3: this_PackageDependency_0= rulePackageDependency
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
                    // InternalRos2Parser.g:3052:3: this_ExternalDependency_1= ruleExternalDependency
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
    // InternalRos2Parser.g:3064:1: entryRulePackageDependency returns [EObject current=null] : iv_rulePackageDependency= rulePackageDependency EOF ;
    public final EObject entryRulePackageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDependency = null;


        try {
            // InternalRos2Parser.g:3064:58: (iv_rulePackageDependency= rulePackageDependency EOF )
            // InternalRos2Parser.g:3065:2: iv_rulePackageDependency= rulePackageDependency EOF
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
    // InternalRos2Parser.g:3071:1: rulePackageDependency returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject rulePackageDependency() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRos2Parser.g:3077:2: ( ( ( ruleEString ) ) )
            // InternalRos2Parser.g:3078:2: ( ( ruleEString ) )
            {
            // InternalRos2Parser.g:3078:2: ( ( ruleEString ) )
            // InternalRos2Parser.g:3079:3: ( ruleEString )
            {
            // InternalRos2Parser.g:3079:3: ( ruleEString )
            // InternalRos2Parser.g:3080:4: ruleEString
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
    // InternalRos2Parser.g:3097:1: entryRuleExternalDependency returns [EObject current=null] : iv_ruleExternalDependency= ruleExternalDependency EOF ;
    public final EObject entryRuleExternalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDependency = null;


        try {
            // InternalRos2Parser.g:3097:59: (iv_ruleExternalDependency= ruleExternalDependency EOF )
            // InternalRos2Parser.g:3098:2: iv_ruleExternalDependency= ruleExternalDependency EOF
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
    // InternalRos2Parser.g:3104:1: ruleExternalDependency returns [EObject current=null] : ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3110:2: ( ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRos2Parser.g:3111:2: ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRos2Parser.g:3111:2: ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) )
            // InternalRos2Parser.g:3112:3: () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRos2Parser.g:3112:3: ()
            // InternalRos2Parser.g:3113:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ExternalDependency,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1());
            		
            // InternalRos2Parser.g:3123:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos2Parser.g:3124:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos2Parser.g:3124:4: (lv_name_2_0= ruleEString )
            // InternalRos2Parser.g:3125:5: lv_name_2_0= ruleEString
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
            						"de.fraunhofer.ipa.ros.Basics.EString");
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
    // InternalRos2Parser.g:3146:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRos2Parser.g:3146:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRos2Parser.g:3147:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalRos2Parser.g:3153:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3159:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRos2Parser.g:3160:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRos2Parser.g:3160:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt67=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt67=1;
                }
                break;
            case RelativeNamespace:
                {
                alt67=2;
                }
                break;
            case PrivateNamespace:
                {
                alt67=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalRos2Parser.g:3161:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalRos2Parser.g:3170:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalRos2Parser.g:3179:3: this_PrivateNamespace_2= rulePrivateNamespace
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
    // InternalRos2Parser.g:3191:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRos2Parser.g:3191:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRos2Parser.g:3192:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalRos2Parser.g:3198:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= GraphName ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:3204:2: (kw= GraphName )
            // InternalRos2Parser.g:3205:2: kw= GraphName
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
    // InternalRos2Parser.g:3213:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRos2Parser.g:3213:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRos2Parser.g:3214:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalRos2Parser.g:3220:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:3226:2: ( ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRos2Parser.g:3227:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:3227:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRos2Parser.g:3228:3: () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRos2Parser.g:3228:3: ()
            // InternalRos2Parser.g:3229:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,GlobalNamespace,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            // InternalRos2Parser.g:3239:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==LeftSquareBracket) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalRos2Parser.g:3240:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_54); 

                    				newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3244:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRos2Parser.g:3245:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRos2Parser.g:3245:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRos2Parser.g:3246:6: lv_parts_3_0= ruleGraphName
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
                    							"de.fraunhofer.ipa.ros.Basics.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:3263:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==Comma) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // InternalRos2Parser.g:3264:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_54); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRos2Parser.g:3268:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRos2Parser.g:3269:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRos2Parser.g:3269:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRos2Parser.g:3270:7: lv_parts_5_0= ruleGraphName
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
                    	    								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
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
    // InternalRos2Parser.g:3297:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRos2Parser.g:3297:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRos2Parser.g:3298:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalRos2Parser.g:3304:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:3310:2: ( ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRos2Parser.g:3311:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:3311:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRos2Parser.g:3312:3: () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRos2Parser.g:3312:3: ()
            // InternalRos2Parser.g:3313:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,RelativeNamespace,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            // InternalRos2Parser.g:3323:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==LeftSquareBracket) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRos2Parser.g:3324:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_54); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3328:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRos2Parser.g:3329:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRos2Parser.g:3329:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRos2Parser.g:3330:6: lv_parts_3_0= ruleGraphName
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
                    							"de.fraunhofer.ipa.ros.Basics.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:3347:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==Comma) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalRos2Parser.g:3348:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_54); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRos2Parser.g:3352:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRos2Parser.g:3353:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRos2Parser.g:3353:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRos2Parser.g:3354:7: lv_parts_5_0= ruleGraphName
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
                    	    								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
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
    // InternalRos2Parser.g:3381:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRos2Parser.g:3381:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRos2Parser.g:3382:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalRos2Parser.g:3388:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:3394:2: ( ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRos2Parser.g:3395:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:3395:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRos2Parser.g:3396:3: () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRos2Parser.g:3396:3: ()
            // InternalRos2Parser.g:3397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,PrivateNamespace,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            // InternalRos2Parser.g:3407:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==LeftSquareBracket) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalRos2Parser.g:3408:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_54); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3412:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRos2Parser.g:3413:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRos2Parser.g:3413:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRos2Parser.g:3414:6: lv_parts_3_0= ruleGraphName
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
                    							"de.fraunhofer.ipa.ros.Basics.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos2Parser.g:3431:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==Comma) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // InternalRos2Parser.g:3432:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_54); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRos2Parser.g:3436:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRos2Parser.g:3437:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRos2Parser.g:3437:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRos2Parser.g:3438:7: lv_parts_5_0= ruleGraphName
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
                    	    								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
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
    // InternalRos2Parser.g:3465:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRos2Parser.g:3465:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRos2Parser.g:3466:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalRos2Parser.g:3472:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
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
            // InternalRos2Parser.g:3478:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalRos2Parser.g:3479:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalRos2Parser.g:3479:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt74=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt74=1;
                }
                break;
            case Struct:
                {
                alt74=2;
                }
                break;
            case Integer:
                {
                alt74=3;
                }
                break;
            case String:
                {
                alt74=4;
                }
                break;
            case Double:
                {
                alt74=5;
                }
                break;
            case Boolean:
                {
                alt74=6;
                }
                break;
            case Base64:
                {
                alt74=7;
                }
                break;
            case Array:
                {
                alt74=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalRos2Parser.g:3480:3: this_ParameterListType_0= ruleParameterListType
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
                    // InternalRos2Parser.g:3489:3: this_ParameterStructType_1= ruleParameterStructType
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
                    // InternalRos2Parser.g:3498:3: this_ParameterIntegerType_2= ruleParameterIntegerType
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
                    // InternalRos2Parser.g:3507:3: this_ParameterStringType_3= ruleParameterStringType
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
                    // InternalRos2Parser.g:3516:3: this_ParameterDoubleType_4= ruleParameterDoubleType
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
                    // InternalRos2Parser.g:3525:3: this_ParameterBooleanType_5= ruleParameterBooleanType
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
                    // InternalRos2Parser.g:3534:3: this_ParameterBase64Type_6= ruleParameterBase64Type
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
                    // InternalRos2Parser.g:3543:3: this_ParameterArrayType_7= ruleParameterArrayType
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
    // InternalRos2Parser.g:3555:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRos2Parser.g:3555:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRos2Parser.g:3556:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalRos2Parser.g:3562:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
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
            // InternalRos2Parser.g:3568:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalRos2Parser.g:3569:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalRos2Parser.g:3569:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt75=7;
            alt75 = dfa75.predict(input);
            switch (alt75) {
                case 1 :
                    // InternalRos2Parser.g:3570:3: this_ParameterString_0= ruleParameterString
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
                    // InternalRos2Parser.g:3579:3: this_ParameterBase64_1= ruleParameterBase64
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
                    // InternalRos2Parser.g:3588:3: this_ParameterInteger_2= ruleParameterInteger
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
                    // InternalRos2Parser.g:3597:3: this_ParameterDouble_3= ruleParameterDouble
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
                    // InternalRos2Parser.g:3606:3: this_ParameterBoolean_4= ruleParameterBoolean
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
                    // InternalRos2Parser.g:3615:3: this_ParameterList_5= ruleParameterList
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
                    // InternalRos2Parser.g:3624:3: this_ParameterStruct_6= ruleParameterStruct
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
    // InternalRos2Parser.g:3636:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRos2Parser.g:3636:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRos2Parser.g:3637:2: iv_ruleParameterListType= ruleParameterListType EOF
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
    // InternalRos2Parser.g:3643:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) ;
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
            // InternalRos2Parser.g:3649:2: ( ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRos2Parser.g:3650:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRos2Parser.g:3650:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            // InternalRos2Parser.g:3651:3: () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRos2Parser.g:3651:3: ()
            // InternalRos2Parser.g:3652:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,List,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalRos2Parser.g:3666:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalRos2Parser.g:3667:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalRos2Parser.g:3667:4: (lv_sequence_3_0= ruleParameterType )
            // InternalRos2Parser.g:3668:5: lv_sequence_3_0= ruleParameterType
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
            						"de.fraunhofer.ipa.ros.Basics.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:3685:3: (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==Comma) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalRos2Parser.g:3686:4: otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_32); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRos2Parser.g:3690:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalRos2Parser.g:3691:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalRos2Parser.g:3691:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalRos2Parser.g:3692:6: lv_sequence_5_0= ruleParameterType
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
            	    							"de.fraunhofer.ipa.ros.Basics.ParameterType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
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
    // InternalRos2Parser.g:3718:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRos2Parser.g:3718:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRos2Parser.g:3719:2: iv_ruleParameterStructType= ruleParameterStructType EOF
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
    // InternalRos2Parser.g:3725:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) ;
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
            // InternalRos2Parser.g:3731:2: ( ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRos2Parser.g:3732:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRos2Parser.g:3732:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            // InternalRos2Parser.g:3733:3: () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRos2Parser.g:3733:3: ()
            // InternalRos2Parser.g:3734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Struct,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalRos2Parser.g:3748:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalRos2Parser.g:3749:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalRos2Parser.g:3749:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalRos2Parser.g:3750:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
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
            						"de.fraunhofer.ipa.ros.Basics.ParameterStructTypeMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:3767:3: (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==Comma) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalRos2Parser.g:3768:4: otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_6); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRos2Parser.g:3772:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalRos2Parser.g:3773:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalRos2Parser.g:3773:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalRos2Parser.g:3774:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
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
            	    							"de.fraunhofer.ipa.ros.Basics.ParameterStructTypeMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
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
    // InternalRos2Parser.g:3800:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRos2Parser.g:3800:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRos2Parser.g:3801:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
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
    // InternalRos2Parser.g:3807:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3813:2: ( ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) )
            // InternalRos2Parser.g:3814:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            {
            // InternalRos2Parser.g:3814:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            // InternalRos2Parser.g:3815:3: () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            {
            // InternalRos2Parser.g:3815:3: ()
            // InternalRos2Parser.g:3816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Integer,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
            		
            // InternalRos2Parser.g:3826:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==Default) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalRos2Parser.g:3827:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3831:4: ( (lv_default_3_0= ruleParameterInteger ) )
                    // InternalRos2Parser.g:3832:5: (lv_default_3_0= ruleParameterInteger )
                    {
                    // InternalRos2Parser.g:3832:5: (lv_default_3_0= ruleParameterInteger )
                    // InternalRos2Parser.g:3833:6: lv_default_3_0= ruleParameterInteger
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
    // InternalRos2Parser.g:3855:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRos2Parser.g:3855:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRos2Parser.g:3856:2: iv_ruleParameterStringType= ruleParameterStringType EOF
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
    // InternalRos2Parser.g:3862:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3868:2: ( ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) )
            // InternalRos2Parser.g:3869:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            {
            // InternalRos2Parser.g:3869:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            // InternalRos2Parser.g:3870:3: () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            {
            // InternalRos2Parser.g:3870:3: ()
            // InternalRos2Parser.g:3871:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            		
            // InternalRos2Parser.g:3881:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==Default) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalRos2Parser.g:3882:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3886:4: ( (lv_default_3_0= ruleParameterString ) )
                    // InternalRos2Parser.g:3887:5: (lv_default_3_0= ruleParameterString )
                    {
                    // InternalRos2Parser.g:3887:5: (lv_default_3_0= ruleParameterString )
                    // InternalRos2Parser.g:3888:6: lv_default_3_0= ruleParameterString
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
    // InternalRos2Parser.g:3910:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRos2Parser.g:3910:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRos2Parser.g:3911:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
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
    // InternalRos2Parser.g:3917:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3923:2: ( ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) )
            // InternalRos2Parser.g:3924:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            {
            // InternalRos2Parser.g:3924:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            // InternalRos2Parser.g:3925:3: () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            {
            // InternalRos2Parser.g:3925:3: ()
            // InternalRos2Parser.g:3926:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Double,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
            		
            // InternalRos2Parser.g:3936:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==Default) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalRos2Parser.g:3937:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_56); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3941:4: ( (lv_default_3_0= ruleParameterDouble ) )
                    // InternalRos2Parser.g:3942:5: (lv_default_3_0= ruleParameterDouble )
                    {
                    // InternalRos2Parser.g:3942:5: (lv_default_3_0= ruleParameterDouble )
                    // InternalRos2Parser.g:3943:6: lv_default_3_0= ruleParameterDouble
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
    // InternalRos2Parser.g:3965:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRos2Parser.g:3965:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRos2Parser.g:3966:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
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
    // InternalRos2Parser.g:3972:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:3978:2: ( ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) )
            // InternalRos2Parser.g:3979:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            {
            // InternalRos2Parser.g:3979:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            // InternalRos2Parser.g:3980:3: () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            {
            // InternalRos2Parser.g:3980:3: ()
            // InternalRos2Parser.g:3981:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Boolean,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
            		
            // InternalRos2Parser.g:3991:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==Default) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalRos2Parser.g:3992:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_16); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos2Parser.g:3996:4: ( (lv_default_3_0= ruleParameterBoolean ) )
                    // InternalRos2Parser.g:3997:5: (lv_default_3_0= ruleParameterBoolean )
                    {
                    // InternalRos2Parser.g:3997:5: (lv_default_3_0= ruleParameterBoolean )
                    // InternalRos2Parser.g:3998:6: lv_default_3_0= ruleParameterBoolean
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
    // InternalRos2Parser.g:4020:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRos2Parser.g:4020:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRos2Parser.g:4021:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
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
    // InternalRos2Parser.g:4027:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4033:2: ( ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) )
            // InternalRos2Parser.g:4034:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            {
            // InternalRos2Parser.g:4034:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            // InternalRos2Parser.g:4035:3: () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            {
            // InternalRos2Parser.g:4035:3: ()
            // InternalRos2Parser.g:4036:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Base64,FOLLOW_55); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
            		
            // InternalRos2Parser.g:4046:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==Default) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalRos2Parser.g:4047:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_57); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos2Parser.g:4051:4: ( (lv_default_3_0= ruleParameterBase64 ) )
                    // InternalRos2Parser.g:4052:5: (lv_default_3_0= ruleParameterBase64 )
                    {
                    // InternalRos2Parser.g:4052:5: (lv_default_3_0= ruleParameterBase64 )
                    // InternalRos2Parser.g:4053:6: lv_default_3_0= ruleParameterBase64
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
    // InternalRos2Parser.g:4075:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRos2Parser.g:4075:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRos2Parser.g:4076:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
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
    // InternalRos2Parser.g:4082:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? ) ;
    public final EObject ruleParameterArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4088:2: ( (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? ) )
            // InternalRos2Parser.g:4089:2: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? )
            {
            // InternalRos2Parser.g:4089:2: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? )
            // InternalRos2Parser.g:4090:3: otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )?
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRos2Parser.g:4098:3: ( (lv_type_2_0= ruleParameterType ) )
            // InternalRos2Parser.g:4099:4: (lv_type_2_0= ruleParameterType )
            {
            // InternalRos2Parser.g:4099:4: (lv_type_2_0= ruleParameterType )
            // InternalRos2Parser.g:4100:5: lv_type_2_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_58);
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

            otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_55); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterArrayTypeAccess().getRightSquareBracketKeyword_3());
            		
            // InternalRos2Parser.g:4121:3: (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==Default) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalRos2Parser.g:4122:4: otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) )
                    {
                    otherlv_4=(Token)match(input,Default,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRos2Parser.g:4126:4: ( (lv_default_5_0= ruleParameterList ) )
                    // InternalRos2Parser.g:4127:5: (lv_default_5_0= ruleParameterList )
                    {
                    // InternalRos2Parser.g:4127:5: (lv_default_5_0= ruleParameterList )
                    // InternalRos2Parser.g:4128:6: lv_default_5_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_5_0=ruleParameterList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"de.fraunhofer.ipa.ros.Basics.ParameterList");
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
    // $ANTLR end "ruleParameterArrayType"


    // $ANTLR start "entryRuleParameterList"
    // InternalRos2Parser.g:4150:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalRos2Parser.g:4150:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalRos2Parser.g:4151:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalRos2Parser.g:4157:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4163:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalRos2Parser.g:4164:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalRos2Parser.g:4164:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            // InternalRos2Parser.g:4165:3: () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalRos2Parser.g:4165:3: ()
            // InternalRos2Parser.g:4166:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRos2Parser.g:4176:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRos2Parser.g:4177:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRos2Parser.g:4177:4: (lv_value_2_0= ruleParameterValue )
            // InternalRos2Parser.g:4178:5: lv_value_2_0= ruleParameterValue
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
            						"de.fraunhofer.ipa.ros.Basics.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:4195:3: (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==Comma) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalRos2Parser.g:4196:4: otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_35); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRos2Parser.g:4200:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalRos2Parser.g:4201:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalRos2Parser.g:4201:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalRos2Parser.g:4202:6: lv_value_4_0= ruleParameterValue
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
            	    							"de.fraunhofer.ipa.ros.Basics.ParameterValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
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
    // InternalRos2Parser.g:4228:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRos2Parser.g:4228:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRos2Parser.g:4229:2: iv_ruleParameterAny= ruleParameterAny EOF
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
    // InternalRos2Parser.g:4235:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4241:2: ( ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) )
            // InternalRos2Parser.g:4242:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            {
            // InternalRos2Parser.g:4242:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            // InternalRos2Parser.g:4243:3: () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            {
            // InternalRos2Parser.g:4243:3: ()
            // InternalRos2Parser.g:4244:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ParameterAny,FOLLOW_59); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            // InternalRos2Parser.g:4254:3: (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==Value) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalRos2Parser.g:4255:4: otherlv_2= Value ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Value,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getValueKeyword_2_0());
                    			
                    // InternalRos2Parser.g:4259:4: ( (lv_value_3_0= ruleEString ) )
                    // InternalRos2Parser.g:4260:5: (lv_value_3_0= ruleEString )
                    {
                    // InternalRos2Parser.g:4260:5: (lv_value_3_0= ruleEString )
                    // InternalRos2Parser.g:4261:6: lv_value_3_0= ruleEString
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
    // InternalRos2Parser.g:4283:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRos2Parser.g:4283:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRos2Parser.g:4284:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalRos2Parser.g:4290:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4296:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRos2Parser.g:4297:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRos2Parser.g:4297:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRos2Parser.g:4298:3: (lv_value_0_0= ruleEString )
            {
            // InternalRos2Parser.g:4298:3: (lv_value_0_0= ruleEString )
            // InternalRos2Parser.g:4299:4: lv_value_0_0= ruleEString
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
    // InternalRos2Parser.g:4319:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRos2Parser.g:4319:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRos2Parser.g:4320:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalRos2Parser.g:4326:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4332:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalRos2Parser.g:4333:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalRos2Parser.g:4333:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalRos2Parser.g:4334:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalRos2Parser.g:4334:3: (lv_value_0_0= ruleBase64Binary )
            // InternalRos2Parser.g:4335:4: lv_value_0_0= ruleBase64Binary
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
    // InternalRos2Parser.g:4355:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRos2Parser.g:4355:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRos2Parser.g:4356:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalRos2Parser.g:4362:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4368:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalRos2Parser.g:4369:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalRos2Parser.g:4369:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalRos2Parser.g:4370:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalRos2Parser.g:4370:3: (lv_value_0_0= ruleInteger0 )
            // InternalRos2Parser.g:4371:4: lv_value_0_0= ruleInteger0
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
    // InternalRos2Parser.g:4391:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRos2Parser.g:4391:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRos2Parser.g:4392:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalRos2Parser.g:4398:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4404:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalRos2Parser.g:4405:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalRos2Parser.g:4405:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalRos2Parser.g:4406:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalRos2Parser.g:4406:3: (lv_value_0_0= ruleDouble0 )
            // InternalRos2Parser.g:4407:4: lv_value_0_0= ruleDouble0
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
    // InternalRos2Parser.g:4427:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRos2Parser.g:4427:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRos2Parser.g:4428:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalRos2Parser.g:4434:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4440:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalRos2Parser.g:4441:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalRos2Parser.g:4441:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalRos2Parser.g:4442:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalRos2Parser.g:4442:3: (lv_value_0_0= ruleboolean0 )
            // InternalRos2Parser.g:4443:4: lv_value_0_0= ruleboolean0
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
    // InternalRos2Parser.g:4463:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRos2Parser.g:4463:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRos2Parser.g:4464:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalRos2Parser.g:4470:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? ) ;
    public final EObject ruleParameterStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token this_END_5=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4476:2: ( ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? ) )
            // InternalRos2Parser.g:4477:2: ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? )
            {
            // InternalRos2Parser.g:4477:2: ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? )
            // InternalRos2Parser.g:4478:3: () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )?
            {
            // InternalRos2Parser.g:4478:3: ()
            // InternalRos2Parser.g:4479:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalRos2Parser.g:4485:3: (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==LeftSquareBracket) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalRos2Parser.g:4486:4: otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_4); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_60); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getParameterStructAccess().getBEGINTerminalRuleCall_1_1());
                    			
                    // InternalRos2Parser.g:4494:4: ( (lv_value_3_0= ruleParameterStructMember ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( ((LA86_0>=RULE_ID && LA86_0<=RULE_STRING)) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // InternalRos2Parser.g:4495:5: (lv_value_3_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRos2Parser.g:4495:5: (lv_value_3_0= ruleParameterStructMember )
                    	    // InternalRos2Parser.g:4496:6: lv_value_3_0= ruleParameterStructMember
                    	    {

                    	    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_60);
                    	    lv_value_3_0=ruleParameterStructMember();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"value",
                    	    							lv_value_3_0,
                    	    							"de.fraunhofer.ipa.ros.Basics.ParameterStructMember");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3());
                    			
                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getParameterStructAccess().getENDTerminalRuleCall_1_4());
                    			

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
    // InternalRos2Parser.g:4526:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRos2Parser.g:4526:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRos2Parser.g:4527:2: iv_ruleParameterDate= ruleParameterDate EOF
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
    // InternalRos2Parser.g:4533:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4539:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalRos2Parser.g:4540:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalRos2Parser.g:4540:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalRos2Parser.g:4541:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalRos2Parser.g:4541:3: (lv_value_0_0= ruleDateTime0 )
            // InternalRos2Parser.g:4542:4: lv_value_0_0= ruleDateTime0
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
    // InternalRos2Parser.g:4562:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRos2Parser.g:4562:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRos2Parser.g:4563:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalRos2Parser.g:4569:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4575:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) ) )
            // InternalRos2Parser.g:4576:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) )
            {
            // InternalRos2Parser.g:4576:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) )
            // InternalRos2Parser.g:4577:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) )
            {
            // InternalRos2Parser.g:4577:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRos2Parser.g:4578:4: (lv_name_0_0= ruleEString )
            {
            // InternalRos2Parser.g:4578:4: (lv_name_0_0= ruleEString )
            // InternalRos2Parser.g:4579:5: lv_name_0_0= ruleEString
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getColonKeyword_1());
            		
            // InternalRos2Parser.g:4600:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRos2Parser.g:4601:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRos2Parser.g:4601:4: (lv_value_2_0= ruleParameterValue )
            // InternalRos2Parser.g:4602:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.fraunhofer.ipa.ros.Basics.ParameterValue");
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
    // $ANTLR end "ruleParameterStructMember"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalRos2Parser.g:4623:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRos2Parser.g:4623:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRos2Parser.g:4624:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
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
    // InternalRos2Parser.g:4630:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4636:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalRos2Parser.g:4637:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalRos2Parser.g:4637:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalRos2Parser.g:4638:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalRos2Parser.g:4638:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRos2Parser.g:4639:4: (lv_name_0_0= ruleEString )
            {
            // InternalRos2Parser.g:4639:4: (lv_name_0_0= ruleEString )
            // InternalRos2Parser.g:4640:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalRos2Parser.g:4657:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalRos2Parser.g:4658:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalRos2Parser.g:4658:4: (lv_type_1_0= ruleParameterType )
            // InternalRos2Parser.g:4659:5: lv_type_1_0= ruleParameterType
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
    // InternalRos2Parser.g:4680:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRos2Parser.g:4680:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRos2Parser.g:4681:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalRos2Parser.g:4687:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4693:2: (this_BINARY_0= RULE_BINARY )
            // InternalRos2Parser.g:4694:2: this_BINARY_0= RULE_BINARY
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
    // InternalRos2Parser.g:4704:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalRos2Parser.g:4704:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalRos2Parser.g:4705:2: iv_ruleboolean0= ruleboolean0 EOF
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
    // InternalRos2Parser.g:4711:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4717:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalRos2Parser.g:4718:2: this_BOOLEAN_0= RULE_BOOLEAN
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
    // InternalRos2Parser.g:4728:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalRos2Parser.g:4728:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalRos2Parser.g:4729:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalRos2Parser.g:4735:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4741:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalRos2Parser.g:4742:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalRos2Parser.g:4752:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalRos2Parser.g:4752:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalRos2Parser.g:4753:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalRos2Parser.g:4759:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4765:2: (this_DECINT_0= RULE_DECINT )
            // InternalRos2Parser.g:4766:2: this_DECINT_0= RULE_DECINT
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
    // InternalRos2Parser.g:4776:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalRos2Parser.g:4776:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalRos2Parser.g:4777:2: iv_ruleDateTime0= ruleDateTime0 EOF
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
    // InternalRos2Parser.g:4783:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:4789:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalRos2Parser.g:4790:2: this_DATE_TIME_0= RULE_DATE_TIME
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
    // InternalRos2Parser.g:4800:1: entryRuleMessagePart returns [EObject current=null] : iv_ruleMessagePart= ruleMessagePart EOF ;
    public final EObject entryRuleMessagePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessagePart = null;


        try {
            // InternalRos2Parser.g:4800:52: (iv_ruleMessagePart= ruleMessagePart EOF )
            // InternalRos2Parser.g:4801:2: iv_ruleMessagePart= ruleMessagePart EOF
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
    // InternalRos2Parser.g:4807:1: ruleMessagePart returns [EObject current=null] : ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) ) ;
    public final EObject ruleMessagePart() throws RecognitionException {
        EObject current = null;

        Token lv_Data_1_2=null;
        EObject lv_Type_0_0 = null;

        AntlrDatatypeRuleToken lv_Data_1_1 = null;

        AntlrDatatypeRuleToken lv_Data_1_3 = null;



        	enterRule();

        try {
            // InternalRos2Parser.g:4813:2: ( ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) ) )
            // InternalRos2Parser.g:4814:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) )
            {
            // InternalRos2Parser.g:4814:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) )
            // InternalRos2Parser.g:4815:3: ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) )
            {
            // InternalRos2Parser.g:4815:3: ( (lv_Type_0_0= ruleAbstractType ) )
            // InternalRos2Parser.g:4816:4: (lv_Type_0_0= ruleAbstractType )
            {
            // InternalRos2Parser.g:4816:4: (lv_Type_0_0= ruleAbstractType )
            // InternalRos2Parser.g:4817:5: lv_Type_0_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getMessagePartAccess().getTypeAbstractTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_61);
            lv_Type_0_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessagePartRule());
            					}
            					set(
            						current,
            						"Type",
            						lv_Type_0_0,
            						"de.fraunhofer.ipa.ros.Basics.AbstractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos2Parser.g:4834:3: ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) )
            // InternalRos2Parser.g:4835:4: ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) )
            {
            // InternalRos2Parser.g:4835:4: ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) )
            // InternalRos2Parser.g:4836:5: (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString )
            {
            // InternalRos2Parser.g:4836:5: (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString )
            int alt88=3;
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
                alt88=1;
                }
                break;
            case RULE_MESSAGE_ASIGMENT:
                {
                alt88=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt88=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalRos2Parser.g:4837:6: lv_Data_1_1= ruleKEYWORD
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
                    							"de.fraunhofer.ipa.ros.Basics.KEYWORD");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:4853:6: lv_Data_1_2= RULE_MESSAGE_ASIGMENT
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
                    							"de.fraunhofer.ipa.ros.Basics.MESSAGE_ASIGMENT");
                    					

                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:4868:6: lv_Data_1_3= ruleEString
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
                    							"de.fraunhofer.ipa.ros.Basics.EString");
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
    // InternalRos2Parser.g:4890:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalRos2Parser.g:4890:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalRos2Parser.g:4891:2: iv_ruleAbstractType= ruleAbstractType EOF
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
    // InternalRos2Parser.g:4897:1: ruleAbstractType returns [EObject current=null] : (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray ) ;
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
            // InternalRos2Parser.g:4903:2: ( (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray ) )
            // InternalRos2Parser.g:4904:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )
            {
            // InternalRos2Parser.g:4904:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )
            int alt89=33;
            alt89 = dfa89.predict(input);
            switch (alt89) {
                case 1 :
                    // InternalRos2Parser.g:4905:3: this_bool_0= rulebool
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
                    // InternalRos2Parser.g:4914:3: this_int8_1= ruleint8
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
                    // InternalRos2Parser.g:4923:3: this_uint8_2= ruleuint8
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
                    // InternalRos2Parser.g:4932:3: this_int16_3= ruleint16
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
                    // InternalRos2Parser.g:4941:3: this_uint16_4= ruleuint16
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
                    // InternalRos2Parser.g:4950:3: this_int32_5= ruleint32
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
                    // InternalRos2Parser.g:4959:3: this_uint32_6= ruleuint32
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
                    // InternalRos2Parser.g:4968:3: this_int64_7= ruleint64
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
                    // InternalRos2Parser.g:4977:3: this_uint64_8= ruleuint64
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
                    // InternalRos2Parser.g:4986:3: this_float32_9= rulefloat32
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
                    // InternalRos2Parser.g:4995:3: this_float64_10= rulefloat64
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
                    // InternalRos2Parser.g:5004:3: this_string0_11= rulestring0
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
                    // InternalRos2Parser.g:5013:3: this_byte_12= rulebyte
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
                    // InternalRos2Parser.g:5022:3: this_time_13= ruletime
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
                    // InternalRos2Parser.g:5031:3: this_duration_14= ruleduration
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
                    // InternalRos2Parser.g:5040:3: this_Header_15= ruleHeader
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
                    // InternalRos2Parser.g:5049:3: this_boolArray_16= ruleboolArray
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
                    // InternalRos2Parser.g:5058:3: this_int8Array_17= ruleint8Array
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
                    // InternalRos2Parser.g:5067:3: this_uint8Array_18= ruleuint8Array
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
                    // InternalRos2Parser.g:5076:3: this_int16Array_19= ruleint16Array
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
                    // InternalRos2Parser.g:5085:3: this_uint16Array_20= ruleuint16Array
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
                    // InternalRos2Parser.g:5094:3: this_int32Array_21= ruleint32Array
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
                    // InternalRos2Parser.g:5103:3: this_uint32Array_22= ruleuint32Array
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
                    // InternalRos2Parser.g:5112:3: this_int64Array_23= ruleint64Array
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
                    // InternalRos2Parser.g:5121:3: this_uint64Array_24= ruleuint64Array
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
                    // InternalRos2Parser.g:5130:3: this_float32Array_25= rulefloat32Array
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
                    // InternalRos2Parser.g:5139:3: this_float64Array_26= rulefloat64Array
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
                    // InternalRos2Parser.g:5148:3: this_string0Array_27= rulestring0Array
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
                    // InternalRos2Parser.g:5157:3: this_byteArray_28= rulebyteArray
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
                    // InternalRos2Parser.g:5166:3: this_SpecBaseRef_29= ruleSpecBaseRef
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
                    // InternalRos2Parser.g:5175:3: this_ArraySpecRef_30= ruleArraySpecRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getArraySpecRefParserRuleCall_30());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArraySpecRef_30=ruleArraySpecRef();

                    state._fsp--;


                    			current = this_ArraySpecRef_30;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 32 :
                    // InternalRos2Parser.g:5184:3: this_char_31= rulechar
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getCharParserRuleCall_31());
                    		
                    pushFollow(FOLLOW_2);
                    this_char_31=rulechar();

                    state._fsp--;


                    			current = this_char_31;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 33 :
                    // InternalRos2Parser.g:5193:3: this_charArray_32= rulecharArray
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getCharArrayParserRuleCall_32());
                    		
                    pushFollow(FOLLOW_2);
                    this_charArray_32=rulecharArray();

                    state._fsp--;


                    			current = this_charArray_32;
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
    // InternalRos2Parser.g:5205:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalRos2Parser.g:5205:45: (iv_rulebool= rulebool EOF )
            // InternalRos2Parser.g:5206:2: iv_rulebool= rulebool EOF
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
    // InternalRos2Parser.g:5212:1: rulebool returns [EObject current=null] : ( () otherlv_1= Bool ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5218:2: ( ( () otherlv_1= Bool ) )
            // InternalRos2Parser.g:5219:2: ( () otherlv_1= Bool )
            {
            // InternalRos2Parser.g:5219:2: ( () otherlv_1= Bool )
            // InternalRos2Parser.g:5220:3: () otherlv_1= Bool
            {
            // InternalRos2Parser.g:5220:3: ()
            // InternalRos2Parser.g:5221:4: 
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
    // InternalRos2Parser.g:5235:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalRos2Parser.g:5235:45: (iv_ruleint8= ruleint8 EOF )
            // InternalRos2Parser.g:5236:2: iv_ruleint8= ruleint8 EOF
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
    // InternalRos2Parser.g:5242:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= Int8 ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5248:2: ( ( () otherlv_1= Int8 ) )
            // InternalRos2Parser.g:5249:2: ( () otherlv_1= Int8 )
            {
            // InternalRos2Parser.g:5249:2: ( () otherlv_1= Int8 )
            // InternalRos2Parser.g:5250:3: () otherlv_1= Int8
            {
            // InternalRos2Parser.g:5250:3: ()
            // InternalRos2Parser.g:5251:4: 
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
    // InternalRos2Parser.g:5265:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalRos2Parser.g:5265:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalRos2Parser.g:5266:2: iv_ruleuint8= ruleuint8 EOF
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
    // InternalRos2Parser.g:5272:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= Uint8 ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5278:2: ( ( () otherlv_1= Uint8 ) )
            // InternalRos2Parser.g:5279:2: ( () otherlv_1= Uint8 )
            {
            // InternalRos2Parser.g:5279:2: ( () otherlv_1= Uint8 )
            // InternalRos2Parser.g:5280:3: () otherlv_1= Uint8
            {
            // InternalRos2Parser.g:5280:3: ()
            // InternalRos2Parser.g:5281:4: 
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
    // InternalRos2Parser.g:5295:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalRos2Parser.g:5295:46: (iv_ruleint16= ruleint16 EOF )
            // InternalRos2Parser.g:5296:2: iv_ruleint16= ruleint16 EOF
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
    // InternalRos2Parser.g:5302:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= Int16 ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5308:2: ( ( () otherlv_1= Int16 ) )
            // InternalRos2Parser.g:5309:2: ( () otherlv_1= Int16 )
            {
            // InternalRos2Parser.g:5309:2: ( () otherlv_1= Int16 )
            // InternalRos2Parser.g:5310:3: () otherlv_1= Int16
            {
            // InternalRos2Parser.g:5310:3: ()
            // InternalRos2Parser.g:5311:4: 
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
    // InternalRos2Parser.g:5325:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalRos2Parser.g:5325:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalRos2Parser.g:5326:2: iv_ruleuint16= ruleuint16 EOF
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
    // InternalRos2Parser.g:5332:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= Uint16 ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5338:2: ( ( () otherlv_1= Uint16 ) )
            // InternalRos2Parser.g:5339:2: ( () otherlv_1= Uint16 )
            {
            // InternalRos2Parser.g:5339:2: ( () otherlv_1= Uint16 )
            // InternalRos2Parser.g:5340:3: () otherlv_1= Uint16
            {
            // InternalRos2Parser.g:5340:3: ()
            // InternalRos2Parser.g:5341:4: 
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
    // InternalRos2Parser.g:5355:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalRos2Parser.g:5355:46: (iv_ruleint32= ruleint32 EOF )
            // InternalRos2Parser.g:5356:2: iv_ruleint32= ruleint32 EOF
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
    // InternalRos2Parser.g:5362:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= Int32 ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5368:2: ( ( () otherlv_1= Int32 ) )
            // InternalRos2Parser.g:5369:2: ( () otherlv_1= Int32 )
            {
            // InternalRos2Parser.g:5369:2: ( () otherlv_1= Int32 )
            // InternalRos2Parser.g:5370:3: () otherlv_1= Int32
            {
            // InternalRos2Parser.g:5370:3: ()
            // InternalRos2Parser.g:5371:4: 
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
    // InternalRos2Parser.g:5385:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalRos2Parser.g:5385:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalRos2Parser.g:5386:2: iv_ruleuint32= ruleuint32 EOF
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
    // InternalRos2Parser.g:5392:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= Uint32 ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5398:2: ( ( () otherlv_1= Uint32 ) )
            // InternalRos2Parser.g:5399:2: ( () otherlv_1= Uint32 )
            {
            // InternalRos2Parser.g:5399:2: ( () otherlv_1= Uint32 )
            // InternalRos2Parser.g:5400:3: () otherlv_1= Uint32
            {
            // InternalRos2Parser.g:5400:3: ()
            // InternalRos2Parser.g:5401:4: 
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
    // InternalRos2Parser.g:5415:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalRos2Parser.g:5415:46: (iv_ruleint64= ruleint64 EOF )
            // InternalRos2Parser.g:5416:2: iv_ruleint64= ruleint64 EOF
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
    // InternalRos2Parser.g:5422:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= Int64 ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5428:2: ( ( () otherlv_1= Int64 ) )
            // InternalRos2Parser.g:5429:2: ( () otherlv_1= Int64 )
            {
            // InternalRos2Parser.g:5429:2: ( () otherlv_1= Int64 )
            // InternalRos2Parser.g:5430:3: () otherlv_1= Int64
            {
            // InternalRos2Parser.g:5430:3: ()
            // InternalRos2Parser.g:5431:4: 
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
    // InternalRos2Parser.g:5445:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalRos2Parser.g:5445:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalRos2Parser.g:5446:2: iv_ruleuint64= ruleuint64 EOF
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
    // InternalRos2Parser.g:5452:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= Uint64 ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5458:2: ( ( () otherlv_1= Uint64 ) )
            // InternalRos2Parser.g:5459:2: ( () otherlv_1= Uint64 )
            {
            // InternalRos2Parser.g:5459:2: ( () otherlv_1= Uint64 )
            // InternalRos2Parser.g:5460:3: () otherlv_1= Uint64
            {
            // InternalRos2Parser.g:5460:3: ()
            // InternalRos2Parser.g:5461:4: 
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
    // InternalRos2Parser.g:5475:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalRos2Parser.g:5475:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalRos2Parser.g:5476:2: iv_rulefloat32= rulefloat32 EOF
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
    // InternalRos2Parser.g:5482:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= Float32 ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5488:2: ( ( () otherlv_1= Float32 ) )
            // InternalRos2Parser.g:5489:2: ( () otherlv_1= Float32 )
            {
            // InternalRos2Parser.g:5489:2: ( () otherlv_1= Float32 )
            // InternalRos2Parser.g:5490:3: () otherlv_1= Float32
            {
            // InternalRos2Parser.g:5490:3: ()
            // InternalRos2Parser.g:5491:4: 
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
    // InternalRos2Parser.g:5505:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalRos2Parser.g:5505:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalRos2Parser.g:5506:2: iv_rulefloat64= rulefloat64 EOF
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
    // InternalRos2Parser.g:5512:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= Float64 ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5518:2: ( ( () otherlv_1= Float64 ) )
            // InternalRos2Parser.g:5519:2: ( () otherlv_1= Float64 )
            {
            // InternalRos2Parser.g:5519:2: ( () otherlv_1= Float64 )
            // InternalRos2Parser.g:5520:3: () otherlv_1= Float64
            {
            // InternalRos2Parser.g:5520:3: ()
            // InternalRos2Parser.g:5521:4: 
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
    // InternalRos2Parser.g:5535:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalRos2Parser.g:5535:48: (iv_rulestring0= rulestring0 EOF )
            // InternalRos2Parser.g:5536:2: iv_rulestring0= rulestring0 EOF
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
    // InternalRos2Parser.g:5542:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= String_1 ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5548:2: ( ( () otherlv_1= String_1 ) )
            // InternalRos2Parser.g:5549:2: ( () otherlv_1= String_1 )
            {
            // InternalRos2Parser.g:5549:2: ( () otherlv_1= String_1 )
            // InternalRos2Parser.g:5550:3: () otherlv_1= String_1
            {
            // InternalRos2Parser.g:5550:3: ()
            // InternalRos2Parser.g:5551:4: 
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


    // $ANTLR start "entryRulechar"
    // InternalRos2Parser.g:5565:1: entryRulechar returns [EObject current=null] : iv_rulechar= rulechar EOF ;
    public final EObject entryRulechar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechar = null;


        try {
            // InternalRos2Parser.g:5565:45: (iv_rulechar= rulechar EOF )
            // InternalRos2Parser.g:5566:2: iv_rulechar= rulechar EOF
            {
             newCompositeNode(grammarAccess.getCharRule()); 
            pushFollow(FOLLOW_1);
            iv_rulechar=rulechar();

            state._fsp--;

             current =iv_rulechar; 
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
    // $ANTLR end "entryRulechar"


    // $ANTLR start "rulechar"
    // InternalRos2Parser.g:5572:1: rulechar returns [EObject current=null] : ( () otherlv_1= Char ) ;
    public final EObject rulechar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5578:2: ( ( () otherlv_1= Char ) )
            // InternalRos2Parser.g:5579:2: ( () otherlv_1= Char )
            {
            // InternalRos2Parser.g:5579:2: ( () otherlv_1= Char )
            // InternalRos2Parser.g:5580:3: () otherlv_1= Char
            {
            // InternalRos2Parser.g:5580:3: ()
            // InternalRos2Parser.g:5581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCharAccess().getChar0Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Char,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCharAccess().getCharKeyword_1());
            		

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
    // $ANTLR end "rulechar"


    // $ANTLR start "entryRulebyte"
    // InternalRos2Parser.g:5595:1: entryRulebyte returns [EObject current=null] : iv_rulebyte= rulebyte EOF ;
    public final EObject entryRulebyte() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyte = null;


        try {
            // InternalRos2Parser.g:5595:45: (iv_rulebyte= rulebyte EOF )
            // InternalRos2Parser.g:5596:2: iv_rulebyte= rulebyte EOF
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
    // InternalRos2Parser.g:5602:1: rulebyte returns [EObject current=null] : ( () otherlv_1= Byte ) ;
    public final EObject rulebyte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5608:2: ( ( () otherlv_1= Byte ) )
            // InternalRos2Parser.g:5609:2: ( () otherlv_1= Byte )
            {
            // InternalRos2Parser.g:5609:2: ( () otherlv_1= Byte )
            // InternalRos2Parser.g:5610:3: () otherlv_1= Byte
            {
            // InternalRos2Parser.g:5610:3: ()
            // InternalRos2Parser.g:5611:4: 
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
    // InternalRos2Parser.g:5625:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalRos2Parser.g:5625:45: (iv_ruletime= ruletime EOF )
            // InternalRos2Parser.g:5626:2: iv_ruletime= ruletime EOF
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
    // InternalRos2Parser.g:5632:1: ruletime returns [EObject current=null] : ( () otherlv_1= Time ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5638:2: ( ( () otherlv_1= Time ) )
            // InternalRos2Parser.g:5639:2: ( () otherlv_1= Time )
            {
            // InternalRos2Parser.g:5639:2: ( () otherlv_1= Time )
            // InternalRos2Parser.g:5640:3: () otherlv_1= Time
            {
            // InternalRos2Parser.g:5640:3: ()
            // InternalRos2Parser.g:5641:4: 
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
    // InternalRos2Parser.g:5655:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalRos2Parser.g:5655:49: (iv_ruleduration= ruleduration EOF )
            // InternalRos2Parser.g:5656:2: iv_ruleduration= ruleduration EOF
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
    // InternalRos2Parser.g:5662:1: ruleduration returns [EObject current=null] : ( () otherlv_1= Duration ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5668:2: ( ( () otherlv_1= Duration ) )
            // InternalRos2Parser.g:5669:2: ( () otherlv_1= Duration )
            {
            // InternalRos2Parser.g:5669:2: ( () otherlv_1= Duration )
            // InternalRos2Parser.g:5670:3: () otherlv_1= Duration
            {
            // InternalRos2Parser.g:5670:3: ()
            // InternalRos2Parser.g:5671:4: 
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
    // InternalRos2Parser.g:5685:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalRos2Parser.g:5685:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalRos2Parser.g:5686:2: iv_ruleboolArray= ruleboolArray EOF
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
    // InternalRos2Parser.g:5692:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= Bool_1 ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5698:2: ( ( () otherlv_1= Bool_1 ) )
            // InternalRos2Parser.g:5699:2: ( () otherlv_1= Bool_1 )
            {
            // InternalRos2Parser.g:5699:2: ( () otherlv_1= Bool_1 )
            // InternalRos2Parser.g:5700:3: () otherlv_1= Bool_1
            {
            // InternalRos2Parser.g:5700:3: ()
            // InternalRos2Parser.g:5701:4: 
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
    // InternalRos2Parser.g:5715:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalRos2Parser.g:5715:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalRos2Parser.g:5716:2: iv_ruleint8Array= ruleint8Array EOF
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
    // InternalRos2Parser.g:5722:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= Int8_1 ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5728:2: ( ( () otherlv_1= Int8_1 ) )
            // InternalRos2Parser.g:5729:2: ( () otherlv_1= Int8_1 )
            {
            // InternalRos2Parser.g:5729:2: ( () otherlv_1= Int8_1 )
            // InternalRos2Parser.g:5730:3: () otherlv_1= Int8_1
            {
            // InternalRos2Parser.g:5730:3: ()
            // InternalRos2Parser.g:5731:4: 
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
    // InternalRos2Parser.g:5745:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalRos2Parser.g:5745:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalRos2Parser.g:5746:2: iv_ruleuint8Array= ruleuint8Array EOF
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
    // InternalRos2Parser.g:5752:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= Uint8_1 ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5758:2: ( ( () otherlv_1= Uint8_1 ) )
            // InternalRos2Parser.g:5759:2: ( () otherlv_1= Uint8_1 )
            {
            // InternalRos2Parser.g:5759:2: ( () otherlv_1= Uint8_1 )
            // InternalRos2Parser.g:5760:3: () otherlv_1= Uint8_1
            {
            // InternalRos2Parser.g:5760:3: ()
            // InternalRos2Parser.g:5761:4: 
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
    // InternalRos2Parser.g:5775:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalRos2Parser.g:5775:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalRos2Parser.g:5776:2: iv_ruleint16Array= ruleint16Array EOF
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
    // InternalRos2Parser.g:5782:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= Int16_1 ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5788:2: ( ( () otherlv_1= Int16_1 ) )
            // InternalRos2Parser.g:5789:2: ( () otherlv_1= Int16_1 )
            {
            // InternalRos2Parser.g:5789:2: ( () otherlv_1= Int16_1 )
            // InternalRos2Parser.g:5790:3: () otherlv_1= Int16_1
            {
            // InternalRos2Parser.g:5790:3: ()
            // InternalRos2Parser.g:5791:4: 
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
    // InternalRos2Parser.g:5805:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalRos2Parser.g:5805:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalRos2Parser.g:5806:2: iv_ruleuint16Array= ruleuint16Array EOF
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
    // InternalRos2Parser.g:5812:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= Uint16_1 ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5818:2: ( ( () otherlv_1= Uint16_1 ) )
            // InternalRos2Parser.g:5819:2: ( () otherlv_1= Uint16_1 )
            {
            // InternalRos2Parser.g:5819:2: ( () otherlv_1= Uint16_1 )
            // InternalRos2Parser.g:5820:3: () otherlv_1= Uint16_1
            {
            // InternalRos2Parser.g:5820:3: ()
            // InternalRos2Parser.g:5821:4: 
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
    // InternalRos2Parser.g:5835:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalRos2Parser.g:5835:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalRos2Parser.g:5836:2: iv_ruleint32Array= ruleint32Array EOF
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
    // InternalRos2Parser.g:5842:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= Int32_1 ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5848:2: ( ( () otherlv_1= Int32_1 ) )
            // InternalRos2Parser.g:5849:2: ( () otherlv_1= Int32_1 )
            {
            // InternalRos2Parser.g:5849:2: ( () otherlv_1= Int32_1 )
            // InternalRos2Parser.g:5850:3: () otherlv_1= Int32_1
            {
            // InternalRos2Parser.g:5850:3: ()
            // InternalRos2Parser.g:5851:4: 
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
    // InternalRos2Parser.g:5865:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalRos2Parser.g:5865:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalRos2Parser.g:5866:2: iv_ruleuint32Array= ruleuint32Array EOF
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
    // InternalRos2Parser.g:5872:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= Uint32_1 ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5878:2: ( ( () otherlv_1= Uint32_1 ) )
            // InternalRos2Parser.g:5879:2: ( () otherlv_1= Uint32_1 )
            {
            // InternalRos2Parser.g:5879:2: ( () otherlv_1= Uint32_1 )
            // InternalRos2Parser.g:5880:3: () otherlv_1= Uint32_1
            {
            // InternalRos2Parser.g:5880:3: ()
            // InternalRos2Parser.g:5881:4: 
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
    // InternalRos2Parser.g:5895:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalRos2Parser.g:5895:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalRos2Parser.g:5896:2: iv_ruleint64Array= ruleint64Array EOF
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
    // InternalRos2Parser.g:5902:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= Int64_1 ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5908:2: ( ( () otherlv_1= Int64_1 ) )
            // InternalRos2Parser.g:5909:2: ( () otherlv_1= Int64_1 )
            {
            // InternalRos2Parser.g:5909:2: ( () otherlv_1= Int64_1 )
            // InternalRos2Parser.g:5910:3: () otherlv_1= Int64_1
            {
            // InternalRos2Parser.g:5910:3: ()
            // InternalRos2Parser.g:5911:4: 
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
    // InternalRos2Parser.g:5925:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalRos2Parser.g:5925:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalRos2Parser.g:5926:2: iv_ruleuint64Array= ruleuint64Array EOF
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
    // InternalRos2Parser.g:5932:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= Uint64_1 ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5938:2: ( ( () otherlv_1= Uint64_1 ) )
            // InternalRos2Parser.g:5939:2: ( () otherlv_1= Uint64_1 )
            {
            // InternalRos2Parser.g:5939:2: ( () otherlv_1= Uint64_1 )
            // InternalRos2Parser.g:5940:3: () otherlv_1= Uint64_1
            {
            // InternalRos2Parser.g:5940:3: ()
            // InternalRos2Parser.g:5941:4: 
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
    // InternalRos2Parser.g:5955:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalRos2Parser.g:5955:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalRos2Parser.g:5956:2: iv_rulefloat32Array= rulefloat32Array EOF
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
    // InternalRos2Parser.g:5962:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= Float32_1 ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5968:2: ( ( () otherlv_1= Float32_1 ) )
            // InternalRos2Parser.g:5969:2: ( () otherlv_1= Float32_1 )
            {
            // InternalRos2Parser.g:5969:2: ( () otherlv_1= Float32_1 )
            // InternalRos2Parser.g:5970:3: () otherlv_1= Float32_1
            {
            // InternalRos2Parser.g:5970:3: ()
            // InternalRos2Parser.g:5971:4: 
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
    // InternalRos2Parser.g:5985:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalRos2Parser.g:5985:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalRos2Parser.g:5986:2: iv_rulefloat64Array= rulefloat64Array EOF
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
    // InternalRos2Parser.g:5992:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= Float64_1 ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:5998:2: ( ( () otherlv_1= Float64_1 ) )
            // InternalRos2Parser.g:5999:2: ( () otherlv_1= Float64_1 )
            {
            // InternalRos2Parser.g:5999:2: ( () otherlv_1= Float64_1 )
            // InternalRos2Parser.g:6000:3: () otherlv_1= Float64_1
            {
            // InternalRos2Parser.g:6000:3: ()
            // InternalRos2Parser.g:6001:4: 
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
    // InternalRos2Parser.g:6015:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalRos2Parser.g:6015:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalRos2Parser.g:6016:2: iv_rulestring0Array= rulestring0Array EOF
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
    // InternalRos2Parser.g:6022:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= String_2 ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:6028:2: ( ( () otherlv_1= String_2 ) )
            // InternalRos2Parser.g:6029:2: ( () otherlv_1= String_2 )
            {
            // InternalRos2Parser.g:6029:2: ( () otherlv_1= String_2 )
            // InternalRos2Parser.g:6030:3: () otherlv_1= String_2
            {
            // InternalRos2Parser.g:6030:3: ()
            // InternalRos2Parser.g:6031:4: 
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
    // InternalRos2Parser.g:6045:1: entryRulebyteArray returns [EObject current=null] : iv_rulebyteArray= rulebyteArray EOF ;
    public final EObject entryRulebyteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyteArray = null;


        try {
            // InternalRos2Parser.g:6045:50: (iv_rulebyteArray= rulebyteArray EOF )
            // InternalRos2Parser.g:6046:2: iv_rulebyteArray= rulebyteArray EOF
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
    // InternalRos2Parser.g:6052:1: rulebyteArray returns [EObject current=null] : ( () otherlv_1= Byte_1 ) ;
    public final EObject rulebyteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:6058:2: ( ( () otherlv_1= Byte_1 ) )
            // InternalRos2Parser.g:6059:2: ( () otherlv_1= Byte_1 )
            {
            // InternalRos2Parser.g:6059:2: ( () otherlv_1= Byte_1 )
            // InternalRos2Parser.g:6060:3: () otherlv_1= Byte_1
            {
            // InternalRos2Parser.g:6060:3: ()
            // InternalRos2Parser.g:6061:4: 
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


    // $ANTLR start "entryRulecharArray"
    // InternalRos2Parser.g:6075:1: entryRulecharArray returns [EObject current=null] : iv_rulecharArray= rulecharArray EOF ;
    public final EObject entryRulecharArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharArray = null;


        try {
            // InternalRos2Parser.g:6075:50: (iv_rulecharArray= rulecharArray EOF )
            // InternalRos2Parser.g:6076:2: iv_rulecharArray= rulecharArray EOF
            {
             newCompositeNode(grammarAccess.getCharArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecharArray=rulecharArray();

            state._fsp--;

             current =iv_rulecharArray; 
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
    // $ANTLR end "entryRulecharArray"


    // $ANTLR start "rulecharArray"
    // InternalRos2Parser.g:6082:1: rulecharArray returns [EObject current=null] : ( () otherlv_1= Char_1 ) ;
    public final EObject rulecharArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:6088:2: ( ( () otherlv_1= Char_1 ) )
            // InternalRos2Parser.g:6089:2: ( () otherlv_1= Char_1 )
            {
            // InternalRos2Parser.g:6089:2: ( () otherlv_1= Char_1 )
            // InternalRos2Parser.g:6090:3: () otherlv_1= Char_1
            {
            // InternalRos2Parser.g:6090:3: ()
            // InternalRos2Parser.g:6091:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCharArrayAccess().getCharArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Char_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCharArrayAccess().getCharKeyword_1());
            		

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
    // $ANTLR end "rulecharArray"


    // $ANTLR start "entryRuleHeader"
    // InternalRos2Parser.g:6105:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRos2Parser.g:6105:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRos2Parser.g:6106:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalRos2Parser.g:6112:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= Header ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:6118:2: ( ( () otherlv_1= Header ) )
            // InternalRos2Parser.g:6119:2: ( () otherlv_1= Header )
            {
            // InternalRos2Parser.g:6119:2: ( () otherlv_1= Header )
            // InternalRos2Parser.g:6120:3: () otherlv_1= Header
            {
            // InternalRos2Parser.g:6120:3: ()
            // InternalRos2Parser.g:6121:4: 
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
    // InternalRos2Parser.g:6135:1: entryRuleSpecBaseRef returns [EObject current=null] : iv_ruleSpecBaseRef= ruleSpecBaseRef EOF ;
    public final EObject entryRuleSpecBaseRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBaseRef = null;


        try {
            // InternalRos2Parser.g:6135:52: (iv_ruleSpecBaseRef= ruleSpecBaseRef EOF )
            // InternalRos2Parser.g:6136:2: iv_ruleSpecBaseRef= ruleSpecBaseRef EOF
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
    // InternalRos2Parser.g:6142:1: ruleSpecBaseRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSpecBaseRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRos2Parser.g:6148:2: ( ( ( ruleEString ) ) )
            // InternalRos2Parser.g:6149:2: ( ( ruleEString ) )
            {
            // InternalRos2Parser.g:6149:2: ( ( ruleEString ) )
            // InternalRos2Parser.g:6150:3: ( ruleEString )
            {
            // InternalRos2Parser.g:6150:3: ( ruleEString )
            // InternalRos2Parser.g:6151:4: ruleEString
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
    // InternalRos2Parser.g:6168:1: entryRuleArraySpecRef returns [EObject current=null] : iv_ruleArraySpecRef= ruleArraySpecRef EOF ;
    public final EObject entryRuleArraySpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecRef = null;


        try {
            // InternalRos2Parser.g:6168:53: (iv_ruleArraySpecRef= ruleArraySpecRef EOF )
            // InternalRos2Parser.g:6169:2: iv_ruleArraySpecRef= ruleArraySpecRef EOF
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
    // InternalRos2Parser.g:6175:1: ruleArraySpecRef returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) ;
    public final EObject ruleArraySpecRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:6181:2: ( ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) )
            // InternalRos2Parser.g:6182:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            {
            // InternalRos2Parser.g:6182:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            // InternalRos2Parser.g:6183:3: ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket
            {
            // InternalRos2Parser.g:6183:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:6184:4: ( ruleEString )
            {
            // InternalRos2Parser.g:6184:4: ( ruleEString )
            // InternalRos2Parser.g:6185:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArraySpecRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecCrossReference_0_0());
            				
            pushFollow(FOLLOW_62);
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
    // InternalRos2Parser.g:6207:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalRos2Parser.g:6207:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalRos2Parser.g:6208:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalRos2Parser.g:6214:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:6220:2: ( (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) )
            // InternalRos2Parser.g:6221:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            {
            // InternalRos2Parser.g:6221:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            int alt90=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt90=1;
                }
                break;
            case Message:
                {
                alt90=2;
                }
                break;
            case Result:
                {
                alt90=3;
                }
                break;
            case Feedback:
                {
                alt90=4;
                }
                break;
            case Name:
                {
                alt90=5;
                }
                break;
            case Value:
                {
                alt90=6;
                }
                break;
            case Service:
                {
                alt90=7;
                }
                break;
            case Type:
                {
                alt90=8;
                }
                break;
            case Action:
                {
                alt90=9;
                }
                break;
            case Duration:
                {
                alt90=10;
                }
                break;
            case Time:
                {
                alt90=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalRos2Parser.g:6222:3: kw= Goal
                    {
                    kw=(Token)match(input,Goal,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:6228:3: kw= Message
                    {
                    kw=(Token)match(input,Message,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:6234:3: kw= Result
                    {
                    kw=(Token)match(input,Result,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRos2Parser.g:6240:3: kw= Feedback
                    {
                    kw=(Token)match(input,Feedback,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRos2Parser.g:6246:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRos2Parser.g:6252:3: kw= Value
                    {
                    kw=(Token)match(input,Value,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRos2Parser.g:6258:3: kw= Service
                    {
                    kw=(Token)match(input,Service,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRos2Parser.g:6264:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRos2Parser.g:6270:3: kw= Action
                    {
                    kw=(Token)match(input,Action,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRos2Parser.g:6276:3: kw= Duration
                    {
                    kw=(Token)match(input,Duration,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRos2Parser.g:6282:3: kw= Time
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
    // InternalRos2Parser.g:6291:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRos2Parser.g:6291:47: (iv_ruleEString= ruleEString EOF )
            // InternalRos2Parser.g:6292:2: iv_ruleEString= ruleEString EOF
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
    // InternalRos2Parser.g:6298:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:6304:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRos2Parser.g:6305:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRos2Parser.g:6305:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==RULE_STRING) ) {
                alt91=1;
            }
            else if ( (LA91_0==RULE_ID) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // InternalRos2Parser.g:6306:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:6314:3: this_ID_1= RULE_ID
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
    // InternalRos2Parser.g:6325:1: entryRuleRosNames returns [String current=null] : iv_ruleRosNames= ruleRosNames EOF ;
    public final String entryRuleRosNames() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRosNames = null;


        try {
            // InternalRos2Parser.g:6325:48: (iv_ruleRosNames= ruleRosNames EOF )
            // InternalRos2Parser.g:6326:2: iv_ruleRosNames= ruleRosNames EOF
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
    // InternalRos2Parser.g:6332:1: ruleRosNames returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node ) ;
    public final AntlrDatatypeRuleToken ruleRosNames() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ROS_CONVENTION_A_0=null;
        Token this_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:6338:2: ( (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node ) )
            // InternalRos2Parser.g:6339:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node )
            {
            // InternalRos2Parser.g:6339:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node )
            int alt92=3;
            switch ( input.LA(1) ) {
            case RULE_ROS_CONVENTION_A:
                {
                alt92=1;
                }
                break;
            case RULE_ID:
                {
                alt92=2;
                }
                break;
            case Node:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalRos2Parser.g:6340:3: this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A
                    {
                    this_ROS_CONVENTION_A_0=(Token)match(input,RULE_ROS_CONVENTION_A,FOLLOW_2); 

                    			current.merge(this_ROS_CONVENTION_A_0);
                    		

                    			newLeafNode(this_ROS_CONVENTION_A_0, grammarAccess.getRosNamesAccess().getROS_CONVENTION_ATerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:6348:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getRosNamesAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:6356:3: kw= Node
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


    // $ANTLR start "ruleLifecycleState"
    // InternalRos2Parser.g:6365:1: ruleLifecycleState returns [Enumerator current=null] : ( (enumLiteral_0= Unconfigured ) | (enumLiteral_1= Inactive ) | (enumLiteral_2= Active ) | (enumLiteral_3= Finalized ) ) ;
    public final Enumerator ruleLifecycleState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRos2Parser.g:6371:2: ( ( (enumLiteral_0= Unconfigured ) | (enumLiteral_1= Inactive ) | (enumLiteral_2= Active ) | (enumLiteral_3= Finalized ) ) )
            // InternalRos2Parser.g:6372:2: ( (enumLiteral_0= Unconfigured ) | (enumLiteral_1= Inactive ) | (enumLiteral_2= Active ) | (enumLiteral_3= Finalized ) )
            {
            // InternalRos2Parser.g:6372:2: ( (enumLiteral_0= Unconfigured ) | (enumLiteral_1= Inactive ) | (enumLiteral_2= Active ) | (enumLiteral_3= Finalized ) )
            int alt93=4;
            switch ( input.LA(1) ) {
            case Unconfigured:
                {
                alt93=1;
                }
                break;
            case Inactive:
                {
                alt93=2;
                }
                break;
            case Active:
                {
                alt93=3;
                }
                break;
            case Finalized:
                {
                alt93=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalRos2Parser.g:6373:3: (enumLiteral_0= Unconfigured )
                    {
                    // InternalRos2Parser.g:6373:3: (enumLiteral_0= Unconfigured )
                    // InternalRos2Parser.g:6374:4: enumLiteral_0= Unconfigured
                    {
                    enumLiteral_0=(Token)match(input,Unconfigured,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStateAccess().getUNCONFIGUREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLifecycleStateAccess().getUNCONFIGUREDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:6381:3: (enumLiteral_1= Inactive )
                    {
                    // InternalRos2Parser.g:6381:3: (enumLiteral_1= Inactive )
                    // InternalRos2Parser.g:6382:4: enumLiteral_1= Inactive
                    {
                    enumLiteral_1=(Token)match(input,Inactive,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStateAccess().getINACTIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLifecycleStateAccess().getINACTIVEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:6389:3: (enumLiteral_2= Active )
                    {
                    // InternalRos2Parser.g:6389:3: (enumLiteral_2= Active )
                    // InternalRos2Parser.g:6390:4: enumLiteral_2= Active
                    {
                    enumLiteral_2=(Token)match(input,Active,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStateAccess().getACTIVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLifecycleStateAccess().getACTIVEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRos2Parser.g:6397:3: (enumLiteral_3= Finalized )
                    {
                    // InternalRos2Parser.g:6397:3: (enumLiteral_3= Finalized )
                    // InternalRos2Parser.g:6398:4: enumLiteral_3= Finalized
                    {
                    enumLiteral_3=(Token)match(input,Finalized,FOLLOW_2); 

                    				current = grammarAccess.getLifecycleStateAccess().getFINALIZEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLifecycleStateAccess().getFINALIZEDEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleLifecycleState"

    // Delegated rules


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA75 dfa75 = new DFA75(this);
    protected DFA89 dfa89 = new DFA89(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\10\12\uffff";
    static final String dfa_3s = "\1\u0083\12\uffff";
    static final String dfa_4s = "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String dfa_5s = "\1\0\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\12\uffff\1\5\4\uffff\1\6\1\10\11\uffff\1\12\3\uffff\1\11\5\uffff\1\3\2\uffff\1\2\34\uffff\1\4\65\uffff\1\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 595:6: ( ({...}? => ( ({...}? => (otherlv_3= Profile ( ( (lv_QoSProfile_4_1= Default_qos | lv_QoSProfile_4_2= Services_qos | lv_QoSProfile_4_3= Sensor_qos | lv_QoSProfile_4_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= History ( ( (lv_History_6_1= Keep_last | lv_History_6_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Depth ( (lv_Depth_8_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Reliability ( ( (lv_Reliability_10_1= Best_effort | lv_Reliability_10_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Durability ( ( (lv_Durability_12_1= Transient_local | lv_Durability_12_2= Volatile ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Lease_duration ( ( (lv_LeaseDuration_14_1= ruleEString | lv_LeaseDuration_14_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Liveliness ( ( (lv_Liveliness_16_1= Automatic | lv_Liveliness_16_2= Manual ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Lifespan ( ( (lv_Lifespan_18_1= ruleEString | lv_Lifespan_18_2= Infinite ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Deadline ( ( (lv_Deadline_20_1= ruleEString | lv_Deadline_20_2= Infinite ) ) ) ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_0 = input.LA(1);

                         
                        int index22_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA22_0==RULE_END) ) {s = 1;}

                        else if ( LA22_0 == Profile && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA22_0 == History && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA22_0 == Depth && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA22_0 == Reliability && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA22_0 == Durability && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA22_0 == Lease_duration && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA22_0 == Liveliness && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA22_0 == Lifespan && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA22_0 == Deadline && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                         
                        input.seek(index22_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\1\10\2\11\10\uffff";
    static final String dfa_8s = "\3\151\4\uffff\1\157\3\uffff";
    static final String dfa_9s = "\3\u0083\4\uffff\1\u0082\3\uffff";
    static final String dfa_10s = "\3\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\1\1\1\6";
    static final String dfa_11s = "\13\uffff}>";
    static final String[] dfa_12s = {
            "\1\10\5\uffff\1\10\1\uffff\1\7\1\10\1\uffff\1\3\1\6\1\4\1\5\6\uffff\1\2\1\1\3\uffff\1\10",
            "\1\11\5\uffff\1\11\1\10\1\uffff\1\11\13\uffff\2\11\3\uffff\1\11",
            "\1\11\5\uffff\1\11\1\10\1\uffff\1\11\13\uffff\2\11\3\uffff\1\11",
            "",
            "",
            "",
            "",
            "\1\12\1\uffff\2\12\1\uffff\4\12\6\uffff\2\12\2\uffff\1\10",
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

    class DFA75 extends DFA {

        public DFA75(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 75;
            this.eot = dfa_1;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "3569:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )";
        }
    }
    static final String dfa_13s = "\44\uffff";
    static final String dfa_14s = "\36\uffff\2\43\4\uffff";
    static final String dfa_15s = "\1\44\35\uffff\2\53\4\uffff";
    static final String dfa_16s = "\1\177\35\uffff\2\u0081\4\uffff";
    static final String dfa_17s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\40\1\41\1\37\1\36";
    static final String dfa_18s = "\44\uffff}>";
    static final String[] dfa_19s = {
            "\1\32\1\33\5\uffff\1\17\7\uffff\1\34\1\25\1\27\1\31\3\uffff\1\12\1\13\1\24\1\26\1\30\3\uffff\1\23\3\uffff\1\20\3\uffff\1\21\1\35\1\41\1\uffff\1\22\2\uffff\1\14\1\5\1\7\1\11\2\uffff\1\4\1\6\1\10\4\uffff\1\3\3\uffff\1\1\1\15\1\40\1\uffff\1\2\3\uffff\1\16\23\uffff\1\37\1\36",
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
            "\2\43\22\uffff\1\43\1\uffff\1\43\7\uffff\1\43\6\uffff\1\43\16\uffff\1\43\5\uffff\1\43\1\uffff\1\43\2\uffff\2\43\2\uffff\1\42\17\uffff\2\43\1\uffff\1\43",
            "\2\43\22\uffff\1\43\1\uffff\1\43\7\uffff\1\43\6\uffff\1\43\16\uffff\1\43\5\uffff\1\43\1\uffff\1\43\2\uffff\2\43\2\uffff\1\42\17\uffff\2\43\1\uffff\1\43",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA89 extends DFA {

        public DFA89(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 89;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "4904:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020044000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020004000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x4000010000000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L,0xC000000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0004800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x4000010000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000004C203602L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001208803080100L,0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080908000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000804000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000000400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0080000000000800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L,0xC000000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000400000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L,0x0000220000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L,0x0000020000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010100020000L,0x0000000000000008L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0300000000000000L,0x00000002004001B0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000220000200000L,0x0000000000000008L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000020000200000L,0x0000000000000008L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0xC0F2000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000044000L,0x0000000014000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000020000004000L,0x0000000014000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000000L,0x0000000014000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0xC0000000000000C0L,0x0000000000000008L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x7C78083000000000L,0xC000045C439E5C44L,0x0000000000000008L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000004L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x7C78083000000002L,0xC000045C439E5C44L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0002000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000002L,0x0000000080000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0xC004000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x8000180000000000L,0xC0000CA080010202L,0x0000000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L});

}
