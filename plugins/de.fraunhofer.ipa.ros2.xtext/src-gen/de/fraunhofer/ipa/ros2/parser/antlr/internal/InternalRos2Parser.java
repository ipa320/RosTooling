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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExternalDependency", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "ServiceClients", "ServiceServers", "Transient_local", "ActionClients", "ActionServers", "Dependencies", "Parameter_qos", "ParameterAny", "FromGitRepo", "Reliability", "Services_qos", "Subscribers", "Best_effort", "Default_qos", "Durability", "Parameters", "Publishers", "Artifacts", "Sensor_qos", "GraphName", "Float32_1", "Float64_1", "Feedback_1", "Keep_last", "Response", "String_2", "Uint16_1", "Uint32_1", "Uint64_1", "Default", "Duration", "Feedback", "History", "Keep_all", "Message_1", "Profile", "Reliable", "Request", "Volatile", "Boolean", "Integer", "Int16_1", "Int32_1", "Int64_1", "Uint8_1", "Action_1", "Float32", "Float64", "Message", "Result_1", "Service", "Array", "Base64", "Double", "Header", "String", "Struct", "Bool_1", "Byte_1", "Int8_1", "Action", "Depth", "Result", "Specs", "String_1", "Uint16", "Uint32", "Uint64", "Goal_1", "Int16", "Int32", "Int64", "Node_1", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Goal", "Int8", "Msg", "Name", "Node", "Qos", "Srv", "Time", "Type", "Any", "Ns", "Comma", "HyphenMinus", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Float32_1=28;
    public static final int Node=92;
    public static final int RULE_DATE_TIME=114;
    public static final int Uint64_1=36;
    public static final int String=63;
    public static final int History=40;
    public static final int Int16=77;
    public static final int Float32=54;
    public static final int Goal=88;
    public static final int Bool=86;
    public static final int Uint16=73;
    public static final int Boolean=47;
    public static final int ExternalDependency=4;
    public static final int Uint8=82;
    public static final int Parameters=23;
    public static final int RULE_ID=115;
    public static final int RULE_DIGIT=104;
    public static final int GlobalNamespace=7;
    public static final int Artifacts=25;
    public static final int Node_1=80;
    public static final int ServiceServers=9;
    public static final int Int16_1=49;
    public static final int Header=62;
    public static final int RULE_INT=117;
    public static final int Byte=87;
    public static final int RULE_ML_COMMENT=124;
    public static final int LeftSquareBracket=102;
    public static final int Specs=71;
    public static final int Base64=60;
    public static final int Message_1=42;
    public static final int Profile=43;
    public static final int Depth=69;
    public static final int Comma=99;
    public static final int HyphenMinus=100;
    public static final int RULE_MESSAGE_ASIGMENT=118;
    public static final int Goal_1=76;
    public static final int Int32=78;
    public static final int Publishers=24;
    public static final int Parameter_qos=14;
    public static final int RULE_DECINT=107;
    public static final int Reliable=44;
    public static final int Uint32=74;
    public static final int FromGitRepo=16;
    public static final int Msg=90;
    public static final int RULE_HOUR=112;
    public static final int Int8=89;
    public static final int Default=37;
    public static final int Int8_1=67;
    public static final int Uint16_1=34;
    public static final int Type=96;
    public static final int Float64=55;
    public static final int Int32_1=50;
    public static final int Result_1=57;
    public static final int Keep_all=41;
    public static final int RULE_BINARY=105;
    public static final int ActionClients=11;
    public static final int String_1=72;
    public static final int Subscribers=19;
    public static final int String_2=33;
    public static final int RULE_DAY=109;
    public static final int RULE_BEGIN=119;
    public static final int Services_qos=18;
    public static final int RULE_BOOLEAN=106;
    public static final int RelativeNamespace=5;
    public static final int RULE_YEAR=111;
    public static final int Feedback_1=30;
    public static final int Result=70;
    public static final int Name=91;
    public static final int RULE_MIN_SEC=113;
    public static final int Default_qos=21;
    public static final int ParameterAny=15;
    public static final int List=85;
    public static final int Dependencies=13;
    public static final int RightSquareBracket=103;
    public static final int PrivateNamespace=6;
    public static final int ServiceClients=8;
    public static final int GraphName=27;
    public static final int Byte_1=66;
    public static final int Float64_1=29;
    public static final int Durability=22;
    public static final int Uint32_1=35;
    public static final int Duration=38;
    public static final int Action_1=53;
    public static final int Double=61;
    public static final int Keep_last=31;
    public static final int Type_1=81;
    public static final int Value=83;
    public static final int Transient_local=10;
    public static final int Uint64=75;
    public static final int Action=68;
    public static final int RULE_END=120;
    public static final int Message=56;
    public static final int Time=95;
    public static final int RULE_STRING=116;
    public static final int Best_effort=20;
    public static final int Bool_1=65;
    public static final int Any=97;
    public static final int Struct=64;
    public static final int RULE_SL_COMMENT=121;
    public static final int Uint8_1=52;
    public static final int RULE_DOUBLE=108;
    public static final int Feedback=39;
    public static final int Srv=94;
    public static final int RULE_ROS_CONVENTION_A=122;
    public static final int RULE_ROS_CONVENTION_PARAM=123;
    public static final int Colon=101;
    public static final int EOF=-1;
    public static final int Ns=98;
    public static final int RULE_WS=125;
    public static final int Request=45;
    public static final int Int64_1=51;
    public static final int Service=58;
    public static final int Sensor_qos=26;
    public static final int RULE_ANY_OTHER=126;
    public static final int Volatile=46;
    public static final int Date=84;
    public static final int Response=32;
    public static final int Integer=48;
    public static final int Array=59;
    public static final int Qos=93;
    public static final int Int64=79;
    public static final int RULE_MONTH=110;
    public static final int ActionServers=12;
    public static final int Reliability=17;

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
                                    "de.fraunhofer.ipa.ros.Basics.RosNames");
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
                                                "de.fraunhofer.ipa.ros.Basics.EString");
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

                        if ( (LA2_0==Node||LA2_0==RULE_ID||LA2_0==RULE_ROS_CONVENTION_A) ) {
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
    // InternalRos2Parser.g:262:1: ruleQualityOfService returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleQualityOfService() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_QoSProfile_3_1=null;
        Token lv_QoSProfile_3_2=null;
        Token lv_QoSProfile_3_3=null;
        Token lv_QoSProfile_3_4=null;
        Token otherlv_4=null;
        Token lv_History_5_1=null;
        Token lv_History_5_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_Reliability_9_1=null;
        Token lv_Reliability_9_2=null;
        Token otherlv_10=null;
        Token lv_Durability_11_1=null;
        Token lv_Durability_11_2=null;
        AntlrDatatypeRuleToken lv_Depth_7_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:268:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRos2Parser.g:269:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRos2Parser.g:269:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )* ) ) ) )
            // InternalRos2Parser.g:270:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )* ) ) )
            {
            // InternalRos2Parser.g:270:3: ()
            // InternalRos2Parser.g:271:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getQualityOfServiceAccess().getQualityOfServiceAction_0(),
                                current);


            }

            // InternalRos2Parser.g:277:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )* ) ) )
            // InternalRos2Parser.g:278:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )* ) )
            {
            // InternalRos2Parser.g:278:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )* ) )
            // InternalRos2Parser.g:279:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )* )
            {

                              getUnorderedGroupHelper().enter(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1());

            // InternalRos2Parser.g:282:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )* )
            // InternalRos2Parser.g:283:6: ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )*
            {
            // InternalRos2Parser.g:283:6: ( ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) ) )*
            loop10:
            do {
                int alt10=6;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == Profile && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == History && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 == Depth && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 == Reliability && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 == Durability && getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 4) ) {
                    alt10=5;
                }


                switch (alt10) {
                case 1 :
                    // InternalRos2Parser.g:284:4: ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) )
                    {
                    // InternalRos2Parser.g:284:4: ({...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) ) )
                    // InternalRos2Parser.g:285:5: {...}? => ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalRos2Parser.g:285:113: ( ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) ) )
                    // InternalRos2Parser.g:286:6: ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) )
                    {

                                            getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 0);

                    // InternalRos2Parser.g:289:9: ({...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) ) )
                    // InternalRos2Parser.g:289:10: {...}? => (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) )
                    {
                    if ( !((true)) ) {
                        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
                    }
                    // InternalRos2Parser.g:289:19: (otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) ) )
                    // InternalRos2Parser.g:289:20: otherlv_2= Profile ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) )
                    {
                    otherlv_2=(Token)match(input,Profile,FOLLOW_14);

                                                        newLeafNode(otherlv_2, grammarAccess.getQualityOfServiceAccess().getProfileKeyword_1_0_0());

                    // InternalRos2Parser.g:293:9: ( ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) ) )
                    // InternalRos2Parser.g:294:10: ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) )
                    {
                    // InternalRos2Parser.g:294:10: ( (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos ) )
                    // InternalRos2Parser.g:295:11: (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos )
                    {
                    // InternalRos2Parser.g:295:11: (lv_QoSProfile_3_1= Default_qos | lv_QoSProfile_3_2= Services_qos | lv_QoSProfile_3_3= Sensor_qos | lv_QoSProfile_3_4= Parameter_qos )
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
                            // InternalRos2Parser.g:296:12: lv_QoSProfile_3_1= Default_qos
                            {
                            lv_QoSProfile_3_1=(Token)match(input,Default_qos,FOLLOW_15);

                                                                            newLeafNode(lv_QoSProfile_3_1, grammarAccess.getQualityOfServiceAccess().getQoSProfileDefault_qosKeyword_1_0_1_0_0());


                                                                            if (current==null) {
                                                                                current = createModelElement(grammarAccess.getQualityOfServiceRule());
                                                                            }
                                                                            setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_3_1, null);


                            }
                            break;
                        case 2 :
                            // InternalRos2Parser.g:307:12: lv_QoSProfile_3_2= Services_qos
                            {
                            lv_QoSProfile_3_2=(Token)match(input,Services_qos,FOLLOW_15);

                                                                            newLeafNode(lv_QoSProfile_3_2, grammarAccess.getQualityOfServiceAccess().getQoSProfileServices_qosKeyword_1_0_1_0_1());


                                                                            if (current==null) {
                                                                                current = createModelElement(grammarAccess.getQualityOfServiceRule());
                                                                            }
                                                                            setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_3_2, null);


                            }
                            break;
                        case 3 :
                            // InternalRos2Parser.g:318:12: lv_QoSProfile_3_3= Sensor_qos
                            {
                            lv_QoSProfile_3_3=(Token)match(input,Sensor_qos,FOLLOW_15);

                                                                            newLeafNode(lv_QoSProfile_3_3, grammarAccess.getQualityOfServiceAccess().getQoSProfileSensor_qosKeyword_1_0_1_0_2());


                                                                            if (current==null) {
                                                                                current = createModelElement(grammarAccess.getQualityOfServiceRule());
                                                                            }
                                                                            setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_3_3, null);


                            }
                            break;
                        case 4 :
                            // InternalRos2Parser.g:329:12: lv_QoSProfile_3_4= Parameter_qos
                            {
                            lv_QoSProfile_3_4=(Token)match(input,Parameter_qos,FOLLOW_15);

                                                                            newLeafNode(lv_QoSProfile_3_4, grammarAccess.getQualityOfServiceAccess().getQoSProfileParameter_qosKeyword_1_0_1_0_3());


                                                                            if (current==null) {
                                                                                current = createModelElement(grammarAccess.getQualityOfServiceRule());
                                                                            }
                                                                            setWithLastConsumed(current, "QoSProfile", lv_QoSProfile_3_4, null);


                            }
                            break;

                    }


                    }


                    }


                    }


                    }


                                            getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1());


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:348:4: ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) )
                    {
                    // InternalRos2Parser.g:348:4: ({...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) ) )
                    // InternalRos2Parser.g:349:5: {...}? => ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalRos2Parser.g:349:113: ( ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) ) )
                    // InternalRos2Parser.g:350:6: ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) )
                    {

                                            getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 1);

                    // InternalRos2Parser.g:353:9: ({...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) ) )
                    // InternalRos2Parser.g:353:10: {...}? => (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) )
                    {
                    if ( !((true)) ) {
                        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
                    }
                    // InternalRos2Parser.g:353:19: (otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) ) )
                    // InternalRos2Parser.g:353:20: otherlv_4= History ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) )
                    {
                    otherlv_4=(Token)match(input,History,FOLLOW_16);

                                                        newLeafNode(otherlv_4, grammarAccess.getQualityOfServiceAccess().getHistoryKeyword_1_1_0());

                    // InternalRos2Parser.g:357:9: ( ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) ) )
                    // InternalRos2Parser.g:358:10: ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) )
                    {
                    // InternalRos2Parser.g:358:10: ( (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all ) )
                    // InternalRos2Parser.g:359:11: (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all )
                    {
                    // InternalRos2Parser.g:359:11: (lv_History_5_1= Keep_last | lv_History_5_2= Keep_all )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( LA7_0 == Keep_last ) {
                        alt7=1;
                    }
                    else if ( LA7_0 == Keep_all ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalRos2Parser.g:360:12: lv_History_5_1= Keep_last
                            {
                            lv_History_5_1=(Token)match(input,Keep_last,FOLLOW_15);

                                                                            newLeafNode(lv_History_5_1, grammarAccess.getQualityOfServiceAccess().getHistoryKeep_lastKeyword_1_1_1_0_0());


                                                                            if (current==null) {
                                                                                current = createModelElement(grammarAccess.getQualityOfServiceRule());
                                                                            }
                                                                            setWithLastConsumed(current, "History", lv_History_5_1, null);


                            }
                            break;
                        case 2 :
                            // InternalRos2Parser.g:371:12: lv_History_5_2= Keep_all
                            {
                            lv_History_5_2=(Token)match(input,Keep_all,FOLLOW_15);

                                                                            newLeafNode(lv_History_5_2, grammarAccess.getQualityOfServiceAccess().getHistoryKeep_allKeyword_1_1_1_0_1());


                                                                            if (current==null) {
                                                                                current = createModelElement(grammarAccess.getQualityOfServiceRule());
                                                                            }
                                                                            setWithLastConsumed(current, "History", lv_History_5_2, null);


                            }
                            break;

                    }


                    }


                    }


                    }


                    }


                                            getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1());


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:390:4: ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) )
                    {
                    // InternalRos2Parser.g:390:4: ({...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) ) )
                    // InternalRos2Parser.g:391:5: {...}? => ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalRos2Parser.g:391:113: ( ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) ) )
                    // InternalRos2Parser.g:392:6: ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) )
                    {

                                            getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 2);

                    // InternalRos2Parser.g:395:9: ({...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) ) )
                    // InternalRos2Parser.g:395:10: {...}? => (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) )
                    {
                    if ( !((true)) ) {
                        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
                    }
                    // InternalRos2Parser.g:395:19: (otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) ) )
                    // InternalRos2Parser.g:395:20: otherlv_6= Depth ( (lv_Depth_7_0= ruleInteger0 ) )
                    {
                    otherlv_6=(Token)match(input,Depth,FOLLOW_17);

                                                        newLeafNode(otherlv_6, grammarAccess.getQualityOfServiceAccess().getDepthKeyword_1_2_0());

                    // InternalRos2Parser.g:399:9: ( (lv_Depth_7_0= ruleInteger0 ) )
                    // InternalRos2Parser.g:400:10: (lv_Depth_7_0= ruleInteger0 )
                    {
                    // InternalRos2Parser.g:400:10: (lv_Depth_7_0= ruleInteger0 )
                    // InternalRos2Parser.g:401:11: lv_Depth_7_0= ruleInteger0
                    {

                                                                newCompositeNode(grammarAccess.getQualityOfServiceAccess().getDepthInteger0ParserRuleCall_1_2_1_0());

                    pushFollow(FOLLOW_15);
                    lv_Depth_7_0=ruleInteger0();

                    state._fsp--;


                                                                if (current==null) {
                                                                    current = createModelElementForParent(grammarAccess.getQualityOfServiceRule());
                                                                }
                                                                set(
                                                                    current,
                                                                    "Depth",
                                                                    lv_Depth_7_0,
                                                                    "de.fraunhofer.ipa.ros.Basics.Integer0");
                                                                afterParserOrEnumRuleCall();


                    }


                    }


                    }


                    }


                                            getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1());


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRos2Parser.g:424:4: ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) )
                    {
                    // InternalRos2Parser.g:424:4: ({...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) ) )
                    // InternalRos2Parser.g:425:5: {...}? => ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 3) ) {
                        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 3)");
                    }
                    // InternalRos2Parser.g:425:113: ( ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) ) )
                    // InternalRos2Parser.g:426:6: ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) )
                    {

                                            getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 3);

                    // InternalRos2Parser.g:429:9: ({...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) ) )
                    // InternalRos2Parser.g:429:10: {...}? => (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) )
                    {
                    if ( !((true)) ) {
                        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
                    }
                    // InternalRos2Parser.g:429:19: (otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) ) )
                    // InternalRos2Parser.g:429:20: otherlv_8= Reliability ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) )
                    {
                    otherlv_8=(Token)match(input,Reliability,FOLLOW_18);

                                                        newLeafNode(otherlv_8, grammarAccess.getQualityOfServiceAccess().getReliabilityKeyword_1_3_0());

                    // InternalRos2Parser.g:433:9: ( ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) ) )
                    // InternalRos2Parser.g:434:10: ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) )
                    {
                    // InternalRos2Parser.g:434:10: ( (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable ) )
                    // InternalRos2Parser.g:435:11: (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable )
                    {
                    // InternalRos2Parser.g:435:11: (lv_Reliability_9_1= Best_effort | lv_Reliability_9_2= Reliable )
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==Best_effort) ) {
                        alt8=1;
                    }
                    else if ( (LA8_0==Reliable) ) {
                        alt8=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 0, input);

                        throw nvae;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalRos2Parser.g:436:12: lv_Reliability_9_1= Best_effort
                            {
                            lv_Reliability_9_1=(Token)match(input,Best_effort,FOLLOW_15);

                                                                            newLeafNode(lv_Reliability_9_1, grammarAccess.getQualityOfServiceAccess().getReliabilityBest_effortKeyword_1_3_1_0_0());


                                                                            if (current==null) {
                                                                                current = createModelElement(grammarAccess.getQualityOfServiceRule());
                                                                            }
                                                                            setWithLastConsumed(current, "Reliability", lv_Reliability_9_1, null);


                            }
                            break;
                        case 2 :
                            // InternalRos2Parser.g:447:12: lv_Reliability_9_2= Reliable
                            {
                            lv_Reliability_9_2=(Token)match(input,Reliable,FOLLOW_15);

                                                                            newLeafNode(lv_Reliability_9_2, grammarAccess.getQualityOfServiceAccess().getReliabilityReliableKeyword_1_3_1_0_1());


                                                                            if (current==null) {
                                                                                current = createModelElement(grammarAccess.getQualityOfServiceRule());
                                                                            }
                                                                            setWithLastConsumed(current, "Reliability", lv_Reliability_9_2, null);


                            }
                            break;

                    }


                    }


                    }


                    }


                    }


                                            getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1());


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRos2Parser.g:466:4: ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) )
                    {
                    // InternalRos2Parser.g:466:4: ({...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) ) )
                    // InternalRos2Parser.g:467:5: {...}? => ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 4) ) {
                        throw new FailedPredicateException(input, "ruleQualityOfService", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 4)");
                    }
                    // InternalRos2Parser.g:467:113: ( ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) ) )
                    // InternalRos2Parser.g:468:6: ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) )
                    {

                                            getUnorderedGroupHelper().select(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1(), 4);

                    // InternalRos2Parser.g:471:9: ({...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) ) )
                    // InternalRos2Parser.g:471:10: {...}? => (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) )
                    {
                    if ( !((true)) ) {
                        throw new FailedPredicateException(input, "ruleQualityOfService", "true");
                    }
                    // InternalRos2Parser.g:471:19: (otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) ) )
                    // InternalRos2Parser.g:471:20: otherlv_10= Durability ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) )
                    {
                    otherlv_10=(Token)match(input,Durability,FOLLOW_19);

                                                        newLeafNode(otherlv_10, grammarAccess.getQualityOfServiceAccess().getDurabilityKeyword_1_4_0());

                    // InternalRos2Parser.g:475:9: ( ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) ) )
                    // InternalRos2Parser.g:476:10: ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) )
                    {
                    // InternalRos2Parser.g:476:10: ( (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile ) )
                    // InternalRos2Parser.g:477:11: (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile )
                    {
                    // InternalRos2Parser.g:477:11: (lv_Durability_11_1= Transient_local | lv_Durability_11_2= Volatile )
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==Transient_local) ) {
                        alt9=1;
                    }
                    else if ( (LA9_0==Volatile) ) {
                        alt9=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalRos2Parser.g:478:12: lv_Durability_11_1= Transient_local
                            {
                            lv_Durability_11_1=(Token)match(input,Transient_local,FOLLOW_15);

                                                                            newLeafNode(lv_Durability_11_1, grammarAccess.getQualityOfServiceAccess().getDurabilityTransient_localKeyword_1_4_1_0_0());


                                                                            if (current==null) {
                                                                                current = createModelElement(grammarAccess.getQualityOfServiceRule());
                                                                            }
                                                                            setWithLastConsumed(current, "Durability", lv_Durability_11_1, null);


                            }
                            break;
                        case 2 :
                            // InternalRos2Parser.g:489:12: lv_Durability_11_2= Volatile
                            {
                            lv_Durability_11_2=(Token)match(input,Volatile,FOLLOW_15);

                                                                            newLeafNode(lv_Durability_11_2, grammarAccess.getQualityOfServiceAccess().getDurabilityVolatileKeyword_1_4_1_0_1());


                                                                            if (current==null) {
                                                                                current = createModelElement(grammarAccess.getQualityOfServiceRule());
                                                                            }
                                                                            setWithLastConsumed(current, "Durability", lv_Durability_11_2, null);


                            }
                            break;

                    }


                    }


                    }


                    }


                    }


                                            getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1());


                    }


                    }


                    }
                    break;

                default :
                    break loop10;
                }
            } while (true);


            }


            }


                              getUnorderedGroupHelper().leave(grammarAccess.getQualityOfServiceAccess().getUnorderedGroup_1());


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
    // InternalRos2Parser.g:519:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRos2Parser.g:519:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRos2Parser.g:520:2: iv_rulePublisher= rulePublisher EOF
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
    // InternalRos2Parser.g:526:1: rulePublisher returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )? this_END_12= RULE_END ) ;
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
            // InternalRos2Parser.g:532:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )? this_END_12= RULE_END ) )
            // InternalRos2Parser.g:533:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )? this_END_12= RULE_END )
            {
            // InternalRos2Parser.g:533:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )? this_END_12= RULE_END )
            // InternalRos2Parser.g:534:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )? this_END_12= RULE_END
            {
            // InternalRos2Parser.g:534:3: ()
            // InternalRos2Parser.g:535:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getPublisherAccess().getPublisherAction_0(),
                                current);


            }

            // InternalRos2Parser.g:541:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:542:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:542:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:543:5: lv_name_1_0= ruleEString
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20);

                        newLeafNode(this_BEGIN_3, grammarAccess.getPublisherAccess().getBEGINTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type_1,FOLLOW_6);

                        newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getTypeKeyword_4());

            // InternalRos2Parser.g:572:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:573:4: ( ruleEString )
            {
            // InternalRos2Parser.g:573:4: ( ruleEString )
            // InternalRos2Parser.g:574:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getPublisherRule());
                                }


                                newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0());

            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalRos2Parser.g:588:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Ns) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRos2Parser.g:589:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_22);

                                    newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getNsKeyword_6_0());

                    // InternalRos2Parser.g:593:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:594:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:594:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:595:6: lv_namespace_7_0= ruleNamespace
                    {

                                            newCompositeNode(grammarAccess.getPublisherAccess().getNamespaceNamespaceParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_23);
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

            // InternalRos2Parser.g:613:3: (otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Qos) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRos2Parser.g:614:4: otherlv_8= Qos this_BEGIN_9= RULE_BEGIN ( (lv_qos_10_0= ruleQualityOfService ) ) this_END_11= RULE_END
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_4);

                                    newLeafNode(otherlv_8, grammarAccess.getPublisherAccess().getQosKeyword_7_0());

                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_24);

                                    newLeafNode(this_BEGIN_9, grammarAccess.getPublisherAccess().getBEGINTerminalRuleCall_7_1());

                    // InternalRos2Parser.g:622:4: ( (lv_qos_10_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:623:5: (lv_qos_10_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:623:5: (lv_qos_10_0= ruleQualityOfService )
                    // InternalRos2Parser.g:624:6: lv_qos_10_0= ruleQualityOfService
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
    // InternalRos2Parser.g:654:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRos2Parser.g:654:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRos2Parser.g:655:2: iv_ruleSubscriber= ruleSubscriber EOF
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
    // InternalRos2Parser.g:661:1: ruleSubscriber returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) ;
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
            // InternalRos2Parser.g:667:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) )
            // InternalRos2Parser.g:668:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            {
            // InternalRos2Parser.g:668:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            // InternalRos2Parser.g:669:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END
            {
            // InternalRos2Parser.g:669:3: ()
            // InternalRos2Parser.g:670:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getSubscriberAccess().getSubscriberAction_0(),
                                current);


            }

            // InternalRos2Parser.g:676:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:677:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:677:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:678:5: lv_name_1_0= ruleEString
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20);

                        newLeafNode(this_BEGIN_3, grammarAccess.getSubscriberAccess().getBEGINTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type_1,FOLLOW_6);

                        newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getTypeKeyword_4());

            // InternalRos2Parser.g:707:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:708:4: ( ruleEString )
            {
            // InternalRos2Parser.g:708:4: ( ruleEString )
            // InternalRos2Parser.g:709:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getSubscriberRule());
                                }


                                newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0());

            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalRos2Parser.g:723:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Ns) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRos2Parser.g:724:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_22);

                                    newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getNsKeyword_6_0());

                    // InternalRos2Parser.g:728:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:729:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:729:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:730:6: lv_namespace_7_0= ruleNamespace
                    {

                                            newCompositeNode(grammarAccess.getSubscriberAccess().getNamespaceNamespaceParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_23);
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

            // InternalRos2Parser.g:748:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Qos) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRos2Parser.g:749:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_24);

                                    newLeafNode(otherlv_8, grammarAccess.getSubscriberAccess().getQosKeyword_7_0());

                    // InternalRos2Parser.g:753:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:754:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:754:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:755:6: lv_qos_9_0= ruleQualityOfService
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
    // InternalRos2Parser.g:781:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRos2Parser.g:781:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRos2Parser.g:782:2: iv_ruleServiceServer= ruleServiceServer EOF
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
    // InternalRos2Parser.g:788:1: ruleServiceServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) ;
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
            // InternalRos2Parser.g:794:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) )
            // InternalRos2Parser.g:795:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            {
            // InternalRos2Parser.g:795:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            // InternalRos2Parser.g:796:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END
            {
            // InternalRos2Parser.g:796:3: ()
            // InternalRos2Parser.g:797:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getServiceServerAccess().getServiceServerAction_0(),
                                current);


            }

            // InternalRos2Parser.g:803:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:804:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:804:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:805:5: lv_name_1_0= ruleEString
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20);

                        newLeafNode(this_BEGIN_3, grammarAccess.getServiceServerAccess().getBEGINTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type_1,FOLLOW_6);

                        newLeafNode(otherlv_4, grammarAccess.getServiceServerAccess().getTypeKeyword_4());

            // InternalRos2Parser.g:834:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:835:4: ( ruleEString )
            {
            // InternalRos2Parser.g:835:4: ( ruleEString )
            // InternalRos2Parser.g:836:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getServiceServerRule());
                                }


                                newCompositeNode(grammarAccess.getServiceServerAccess().getServiceServiceSpecCrossReference_5_0());

            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalRos2Parser.g:850:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Ns) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRos2Parser.g:851:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_22);

                                    newLeafNode(otherlv_6, grammarAccess.getServiceServerAccess().getNsKeyword_6_0());

                    // InternalRos2Parser.g:855:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:856:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:856:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:857:6: lv_namespace_7_0= ruleNamespace
                    {

                                            newCompositeNode(grammarAccess.getServiceServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_23);
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

            // InternalRos2Parser.g:875:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Qos) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRos2Parser.g:876:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_24);

                                    newLeafNode(otherlv_8, grammarAccess.getServiceServerAccess().getQosKeyword_7_0());

                    // InternalRos2Parser.g:880:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:881:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:881:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:882:6: lv_qos_9_0= ruleQualityOfService
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
    // InternalRos2Parser.g:908:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRos2Parser.g:908:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRos2Parser.g:909:2: iv_ruleServiceClient= ruleServiceClient EOF
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
    // InternalRos2Parser.g:915:1: ruleServiceClient returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) ;
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
            // InternalRos2Parser.g:921:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) )
            // InternalRos2Parser.g:922:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            {
            // InternalRos2Parser.g:922:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            // InternalRos2Parser.g:923:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END
            {
            // InternalRos2Parser.g:923:3: ()
            // InternalRos2Parser.g:924:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getServiceClientAccess().getServiceClientAction_0(),
                                current);


            }

            // InternalRos2Parser.g:930:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:931:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:931:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:932:5: lv_name_1_0= ruleEString
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20);

                        newLeafNode(this_BEGIN_3, grammarAccess.getServiceClientAccess().getBEGINTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type_1,FOLLOW_6);

                        newLeafNode(otherlv_4, grammarAccess.getServiceClientAccess().getTypeKeyword_4());

            // InternalRos2Parser.g:961:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:962:4: ( ruleEString )
            {
            // InternalRos2Parser.g:962:4: ( ruleEString )
            // InternalRos2Parser.g:963:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getServiceClientRule());
                                }


                                newCompositeNode(grammarAccess.getServiceClientAccess().getServiceServiceSpecCrossReference_5_0());

            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalRos2Parser.g:977:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Ns) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRos2Parser.g:978:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_22);

                                    newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getNsKeyword_6_0());

                    // InternalRos2Parser.g:982:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:983:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:983:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:984:6: lv_namespace_7_0= ruleNamespace
                    {

                                            newCompositeNode(grammarAccess.getServiceClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_23);
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

            // InternalRos2Parser.g:1002:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Qos) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRos2Parser.g:1003:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_24);

                                    newLeafNode(otherlv_8, grammarAccess.getServiceClientAccess().getQosKeyword_7_0());

                    // InternalRos2Parser.g:1007:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1008:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1008:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1009:6: lv_qos_9_0= ruleQualityOfService
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
    // InternalRos2Parser.g:1035:1: entryRuleActionServer returns [EObject current=null] : iv_ruleActionServer= ruleActionServer EOF ;
    public final EObject entryRuleActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionServer = null;


        try {
            // InternalRos2Parser.g:1035:53: (iv_ruleActionServer= ruleActionServer EOF )
            // InternalRos2Parser.g:1036:2: iv_ruleActionServer= ruleActionServer EOF
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
    // InternalRos2Parser.g:1042:1: ruleActionServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) ;
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
            // InternalRos2Parser.g:1048:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) )
            // InternalRos2Parser.g:1049:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            {
            // InternalRos2Parser.g:1049:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            // InternalRos2Parser.g:1050:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END
            {
            // InternalRos2Parser.g:1050:3: ()
            // InternalRos2Parser.g:1051:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getActionServerAccess().getActionServerAction_0(),
                                current);


            }

            // InternalRos2Parser.g:1057:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1058:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1058:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1059:5: lv_name_1_0= ruleEString
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20);

                        newLeafNode(this_BEGIN_3, grammarAccess.getActionServerAccess().getBEGINTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type_1,FOLLOW_6);

                        newLeafNode(otherlv_4, grammarAccess.getActionServerAccess().getTypeKeyword_4());

            // InternalRos2Parser.g:1088:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:1089:4: ( ruleEString )
            {
            // InternalRos2Parser.g:1089:4: ( ruleEString )
            // InternalRos2Parser.g:1090:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getActionServerRule());
                                }


                                newCompositeNode(grammarAccess.getActionServerAccess().getActionActionSpecCrossReference_5_0());

            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalRos2Parser.g:1104:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Ns) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRos2Parser.g:1105:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_22);

                                    newLeafNode(otherlv_6, grammarAccess.getActionServerAccess().getNsKeyword_6_0());

                    // InternalRos2Parser.g:1109:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1110:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1110:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1111:6: lv_namespace_7_0= ruleNamespace
                    {

                                            newCompositeNode(grammarAccess.getActionServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_23);
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

            // InternalRos2Parser.g:1129:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Qos) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRos2Parser.g:1130:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_24);

                                    newLeafNode(otherlv_8, grammarAccess.getActionServerAccess().getQosKeyword_7_0());

                    // InternalRos2Parser.g:1134:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1135:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1135:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1136:6: lv_qos_9_0= ruleQualityOfService
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
    // InternalRos2Parser.g:1162:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // InternalRos2Parser.g:1162:53: (iv_ruleActionClient= ruleActionClient EOF )
            // InternalRos2Parser.g:1163:2: iv_ruleActionClient= ruleActionClient EOF
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
    // InternalRos2Parser.g:1169:1: ruleActionClient returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) ;
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
            // InternalRos2Parser.g:1175:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END ) )
            // InternalRos2Parser.g:1176:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            {
            // InternalRos2Parser.g:1176:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END )
            // InternalRos2Parser.g:1177:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? this_END_10= RULE_END
            {
            // InternalRos2Parser.g:1177:3: ()
            // InternalRos2Parser.g:1178:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getActionClientAccess().getActionClientAction_0(),
                                current);


            }

            // InternalRos2Parser.g:1184:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1185:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1185:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1186:5: lv_name_1_0= ruleEString
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20);

                        newLeafNode(this_BEGIN_3, grammarAccess.getActionClientAccess().getBEGINTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type_1,FOLLOW_6);

                        newLeafNode(otherlv_4, grammarAccess.getActionClientAccess().getTypeKeyword_4());

            // InternalRos2Parser.g:1215:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:1216:4: ( ruleEString )
            {
            // InternalRos2Parser.g:1216:4: ( ruleEString )
            // InternalRos2Parser.g:1217:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getActionClientRule());
                                }


                                newCompositeNode(grammarAccess.getActionClientAccess().getActionActionSpecCrossReference_5_0());

            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            // InternalRos2Parser.g:1231:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Ns) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRos2Parser.g:1232:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_22);

                                    newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getNsKeyword_6_0());

                    // InternalRos2Parser.g:1236:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1237:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1237:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1238:6: lv_namespace_7_0= ruleNamespace
                    {

                                            newCompositeNode(grammarAccess.getActionClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_23);
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

            // InternalRos2Parser.g:1256:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Qos) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRos2Parser.g:1257:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_24);

                                    newLeafNode(otherlv_8, grammarAccess.getActionClientAccess().getQosKeyword_7_0());

                    // InternalRos2Parser.g:1261:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1262:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1262:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1263:6: lv_qos_9_0= ruleQualityOfService
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
    // InternalRos2Parser.g:1289:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRos2Parser.g:1289:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRos2Parser.g:1290:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRos2Parser.g:1296:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? (otherlv_10= Default ( (lv_value_11_0= ruleParameterValue ) ) )? this_END_12= RULE_END ) ;
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

        EObject lv_qos_9_0 = null;

        EObject lv_value_11_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:1302:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? (otherlv_10= Default ( (lv_value_11_0= ruleParameterValue ) ) )? this_END_12= RULE_END ) )
            // InternalRos2Parser.g:1303:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? (otherlv_10= Default ( (lv_value_11_0= ruleParameterValue ) ) )? this_END_12= RULE_END )
            {
            // InternalRos2Parser.g:1303:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? (otherlv_10= Default ( (lv_value_11_0= ruleParameterValue ) ) )? this_END_12= RULE_END )
            // InternalRos2Parser.g:1304:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( (lv_type_5_0= ruleParameterType ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )? (otherlv_10= Default ( (lv_value_11_0= ruleParameterValue ) ) )? this_END_12= RULE_END
            {
            // InternalRos2Parser.g:1304:3: ()
            // InternalRos2Parser.g:1305:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterAccess().getParameterAction_0(),
                                current);


            }

            // InternalRos2Parser.g:1311:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos2Parser.g:1312:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos2Parser.g:1312:4: (lv_name_1_0= ruleEString )
            // InternalRos2Parser.g:1313:5: lv_name_1_0= ruleEString
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_20);

                        newLeafNode(this_BEGIN_3, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Type_1,FOLLOW_25);

                        newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_4());

            // InternalRos2Parser.g:1342:3: ( (lv_type_5_0= ruleParameterType ) )
            // InternalRos2Parser.g:1343:4: (lv_type_5_0= ruleParameterType )
            {
            // InternalRos2Parser.g:1343:4: (lv_type_5_0= ruleParameterType )
            // InternalRos2Parser.g:1344:5: lv_type_5_0= ruleParameterType
            {

                                newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_5_0());

            pushFollow(FOLLOW_26);
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

            // InternalRos2Parser.g:1361:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Ns) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRos2Parser.g:1362:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_22);

                                    newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getNsKeyword_6_0());

                    // InternalRos2Parser.g:1366:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos2Parser.g:1367:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos2Parser.g:1367:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos2Parser.g:1368:6: lv_namespace_7_0= ruleNamespace
                    {

                                            newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_6_1_0());

                    pushFollow(FOLLOW_27);
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

            // InternalRos2Parser.g:1386:3: (otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Qos) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRos2Parser.g:1387:4: otherlv_8= Qos ( (lv_qos_9_0= ruleQualityOfService ) )
                    {
                    otherlv_8=(Token)match(input,Qos,FOLLOW_28);

                                    newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getQosKeyword_7_0());

                    // InternalRos2Parser.g:1391:4: ( (lv_qos_9_0= ruleQualityOfService ) )
                    // InternalRos2Parser.g:1392:5: (lv_qos_9_0= ruleQualityOfService )
                    {
                    // InternalRos2Parser.g:1392:5: (lv_qos_9_0= ruleQualityOfService )
                    // InternalRos2Parser.g:1393:6: lv_qos_9_0= ruleQualityOfService
                    {

                                            newCompositeNode(grammarAccess.getParameterAccess().getQosQualityOfServiceParserRuleCall_7_1_0());

                    pushFollow(FOLLOW_29);
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

            // InternalRos2Parser.g:1411:3: (otherlv_10= Default ( (lv_value_11_0= ruleParameterValue ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Default) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRos2Parser.g:1412:4: otherlv_10= Default ( (lv_value_11_0= ruleParameterValue ) )
                    {
                    otherlv_10=(Token)match(input,Default,FOLLOW_30);

                                    newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getDefaultKeyword_8_0());

                    // InternalRos2Parser.g:1416:4: ( (lv_value_11_0= ruleParameterValue ) )
                    // InternalRos2Parser.g:1417:5: (lv_value_11_0= ruleParameterValue )
                    {
                    // InternalRos2Parser.g:1417:5: (lv_value_11_0= ruleParameterValue )
                    // InternalRos2Parser.g:1418:6: lv_value_11_0= ruleParameterValue
                    {

                                            newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_8_1_0());

                    pushFollow(FOLLOW_13);
                    lv_value_11_0=ruleParameterValue();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getParameterRule());
                                            }
                                            set(
                                                current,
                                                "value",
                                                lv_value_11_0,
                                                "de.fraunhofer.ipa.ros.Basics.ParameterValue");
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
    // InternalRos2Parser.g:1444:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // InternalRos2Parser.g:1444:53: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // InternalRos2Parser.g:1445:2: iv_rulePackage_Impl= rulePackage_Impl EOF
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
    // InternalRos2Parser.g:1451:1: rulePackage_Impl returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN rulePreListElement ( (lv_spec_9_0= ruleSpecBase ) ) ( rulePreListElement ( (lv_spec_11_0= ruleSpecBase ) ) )* this_END_12= RULE_END )? (otherlv_13= Dependencies otherlv_14= LeftSquareBracket ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= Comma ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= RightSquareBracket )? this_END_19= RULE_END ) ;
    public final EObject rulePackage_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token this_END_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_fromGitRepo_5_0 = null;

        EObject lv_spec_9_0 = null;

        EObject lv_spec_11_0 = null;

        EObject lv_dependency_15_0 = null;

        EObject lv_dependency_17_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:1457:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN rulePreListElement ( (lv_spec_9_0= ruleSpecBase ) ) ( rulePreListElement ( (lv_spec_11_0= ruleSpecBase ) ) )* this_END_12= RULE_END )? (otherlv_13= Dependencies otherlv_14= LeftSquareBracket ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= Comma ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= RightSquareBracket )? this_END_19= RULE_END ) )
            // InternalRos2Parser.g:1458:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN rulePreListElement ( (lv_spec_9_0= ruleSpecBase ) ) ( rulePreListElement ( (lv_spec_11_0= ruleSpecBase ) ) )* this_END_12= RULE_END )? (otherlv_13= Dependencies otherlv_14= LeftSquareBracket ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= Comma ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= RightSquareBracket )? this_END_19= RULE_END )
            {
            // InternalRos2Parser.g:1458:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN rulePreListElement ( (lv_spec_9_0= ruleSpecBase ) ) ( rulePreListElement ( (lv_spec_11_0= ruleSpecBase ) ) )* this_END_12= RULE_END )? (otherlv_13= Dependencies otherlv_14= LeftSquareBracket ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= Comma ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= RightSquareBracket )? this_END_19= RULE_END )
            // InternalRos2Parser.g:1459:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN rulePreListElement ( (lv_spec_9_0= ruleSpecBase ) ) ( rulePreListElement ( (lv_spec_11_0= ruleSpecBase ) ) )* this_END_12= RULE_END )? (otherlv_13= Dependencies otherlv_14= LeftSquareBracket ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= Comma ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= RightSquareBracket )? this_END_19= RULE_END
            {
            // InternalRos2Parser.g:1459:3: ()
            // InternalRos2Parser.g:1460:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getPackage_ImplAccess().getPackageAction_0(),
                                current);


            }

            // InternalRos2Parser.g:1466:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:1467:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:1467:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:1468:5: lv_name_1_0= ruleRosNames
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_31);

                        newLeafNode(this_BEGIN_3, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_3());

            // InternalRos2Parser.g:1493:3: (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FromGitRepo) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRos2Parser.g:1494:4: otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,FromGitRepo,FOLLOW_6);

                                    newLeafNode(otherlv_4, grammarAccess.getPackage_ImplAccess().getFromGitRepoKeyword_4_0());

                    // InternalRos2Parser.g:1498:4: ( (lv_fromGitRepo_5_0= ruleEString ) )
                    // InternalRos2Parser.g:1499:5: (lv_fromGitRepo_5_0= ruleEString )
                    {
                    // InternalRos2Parser.g:1499:5: (lv_fromGitRepo_5_0= ruleEString )
                    // InternalRos2Parser.g:1500:6: lv_fromGitRepo_5_0= ruleEString
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
                                                "de.fraunhofer.ipa.ros.Basics.EString");
                                            afterParserOrEnumRuleCall();


                    }


                    }


                    }
                    break;

            }

            // InternalRos2Parser.g:1518:3: (otherlv_6= Specs this_BEGIN_7= RULE_BEGIN rulePreListElement ( (lv_spec_9_0= ruleSpecBase ) ) ( rulePreListElement ( (lv_spec_11_0= ruleSpecBase ) ) )* this_END_12= RULE_END )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Specs) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRos2Parser.g:1519:4: otherlv_6= Specs this_BEGIN_7= RULE_BEGIN rulePreListElement ( (lv_spec_9_0= ruleSpecBase ) ) ( rulePreListElement ( (lv_spec_11_0= ruleSpecBase ) ) )* this_END_12= RULE_END
                    {
                    otherlv_6=(Token)match(input,Specs,FOLLOW_4);

                                    newLeafNode(otherlv_6, grammarAccess.getPackage_ImplAccess().getSpecsKeyword_5_0());

                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_33);

                                    newLeafNode(this_BEGIN_7, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_5_1());


                                    newCompositeNode(grammarAccess.getPackage_ImplAccess().getPreListElementParserRuleCall_5_2());

                    pushFollow(FOLLOW_34);
                    rulePreListElement();

                    state._fsp--;


                                    afterParserOrEnumRuleCall();

                    // InternalRos2Parser.g:1534:4: ( (lv_spec_9_0= ruleSpecBase ) )
                    // InternalRos2Parser.g:1535:5: (lv_spec_9_0= ruleSpecBase )
                    {
                    // InternalRos2Parser.g:1535:5: (lv_spec_9_0= ruleSpecBase )
                    // InternalRos2Parser.g:1536:6: lv_spec_9_0= ruleSpecBase
                    {

                                            newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_5_3_0());

                    pushFollow(FOLLOW_35);
                    lv_spec_9_0=ruleSpecBase();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                                            }
                                            add(
                                                current,
                                                "spec",
                                                lv_spec_9_0,
                                                "de.fraunhofer.ipa.ros.Ros.SpecBase");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalRos2Parser.g:1553:4: ( rulePreListElement ( (lv_spec_11_0= ruleSpecBase ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==HyphenMinus) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                        case 1 :
                            // InternalRos2Parser.g:1554:5: rulePreListElement ( (lv_spec_11_0= ruleSpecBase ) )
                            {

                                                newCompositeNode(grammarAccess.getPackage_ImplAccess().getPreListElementParserRuleCall_5_4_0());

                            pushFollow(FOLLOW_34);
                            rulePreListElement();

                            state._fsp--;


                                                afterParserOrEnumRuleCall();

                            // InternalRos2Parser.g:1561:5: ( (lv_spec_11_0= ruleSpecBase ) )
                            // InternalRos2Parser.g:1562:6: (lv_spec_11_0= ruleSpecBase )
                            {
                            // InternalRos2Parser.g:1562:6: (lv_spec_11_0= ruleSpecBase )
                            // InternalRos2Parser.g:1563:7: lv_spec_11_0= ruleSpecBase
                            {

                                                        newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_5_4_1_0());

                            pushFollow(FOLLOW_35);
                            lv_spec_11_0=ruleSpecBase();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                                                        }
                                                        add(
                                                            current,
                                                            "spec",
                                                            lv_spec_11_0,
                                                            "de.fraunhofer.ipa.ros.Ros.SpecBase");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                        default :
                            break loop27;
                        }
                    } while (true);

                    this_END_12=(Token)match(input,RULE_END,FOLLOW_9);

                                    newLeafNode(this_END_12, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_5_5());


                    }
                    break;

            }

            // InternalRos2Parser.g:1586:3: (otherlv_13= Dependencies otherlv_14= LeftSquareBracket ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= Comma ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= RightSquareBracket )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Dependencies) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRos2Parser.g:1587:4: otherlv_13= Dependencies otherlv_14= LeftSquareBracket ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= Comma ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= RightSquareBracket
                    {
                    otherlv_13=(Token)match(input,Dependencies,FOLLOW_10);

                                    newLeafNode(otherlv_13, grammarAccess.getPackage_ImplAccess().getDependenciesKeyword_6_0());

                    otherlv_14=(Token)match(input,LeftSquareBracket,FOLLOW_11);

                                    newLeafNode(otherlv_14, grammarAccess.getPackage_ImplAccess().getLeftSquareBracketKeyword_6_1());

                    // InternalRos2Parser.g:1595:4: ( (lv_dependency_15_0= ruleDependency ) )
                    // InternalRos2Parser.g:1596:5: (lv_dependency_15_0= ruleDependency )
                    {
                    // InternalRos2Parser.g:1596:5: (lv_dependency_15_0= ruleDependency )
                    // InternalRos2Parser.g:1597:6: lv_dependency_15_0= ruleDependency
                    {

                                            newCompositeNode(grammarAccess.getPackage_ImplAccess().getDependencyDependencyParserRuleCall_6_2_0());

                    pushFollow(FOLLOW_12);
                    lv_dependency_15_0=ruleDependency();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                                            }
                                            add(
                                                current,
                                                "dependency",
                                                lv_dependency_15_0,
                                                "de.fraunhofer.ipa.ros.Ros.Dependency");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalRos2Parser.g:1614:4: (otherlv_16= Comma ( (lv_dependency_17_0= ruleDependency ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==Comma) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                        case 1 :
                            // InternalRos2Parser.g:1615:5: otherlv_16= Comma ( (lv_dependency_17_0= ruleDependency ) )
                            {
                            otherlv_16=(Token)match(input,Comma,FOLLOW_11);

                                                newLeafNode(otherlv_16, grammarAccess.getPackage_ImplAccess().getCommaKeyword_6_3_0());

                            // InternalRos2Parser.g:1619:5: ( (lv_dependency_17_0= ruleDependency ) )
                            // InternalRos2Parser.g:1620:6: (lv_dependency_17_0= ruleDependency )
                            {
                            // InternalRos2Parser.g:1620:6: (lv_dependency_17_0= ruleDependency )
                            // InternalRos2Parser.g:1621:7: lv_dependency_17_0= ruleDependency
                            {

                                                        newCompositeNode(grammarAccess.getPackage_ImplAccess().getDependencyDependencyParserRuleCall_6_3_1_0());

                            pushFollow(FOLLOW_12);
                            lv_dependency_17_0=ruleDependency();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                                                        }
                                                        add(
                                                            current,
                                                            "dependency",
                                                            lv_dependency_17_0,
                                                            "de.fraunhofer.ipa.ros.Ros.Dependency");
                                                        afterParserOrEnumRuleCall();


                            }


                            }


                            }
                            break;

                        default :
                            break loop29;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,RightSquareBracket,FOLLOW_13);

                                    newLeafNode(otherlv_18, grammarAccess.getPackage_ImplAccess().getRightSquareBracketKeyword_6_4());


                    }
                    break;

            }

            this_END_19=(Token)match(input,RULE_END,FOLLOW_2);

                        newLeafNode(this_END_19, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_7());


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
    // InternalRos2Parser.g:1652:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalRos2Parser.g:1652:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalRos2Parser.g:1653:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalRos2Parser.g:1659:1: ruleArtifact returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_node_4_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:1665:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END ) )
            // InternalRos2Parser.g:1666:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END )
            {
            // InternalRos2Parser.g:1666:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END )
            // InternalRos2Parser.g:1667:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN ( (lv_node_4_0= ruleNode ) )? this_END_5= RULE_END
            {
            // InternalRos2Parser.g:1667:3: ()
            // InternalRos2Parser.g:1668:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getArtifactAccess().getArtifactAction_0(),
                                current);


            }

            // InternalRos2Parser.g:1674:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:1675:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:1675:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:1676:5: lv_name_1_0= ruleRosNames
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_36);

                        newLeafNode(this_BEGIN_3, grammarAccess.getArtifactAccess().getBEGINTerminalRuleCall_3());

            // InternalRos2Parser.g:1701:3: ( (lv_node_4_0= ruleNode ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Node_1) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRos2Parser.g:1702:4: (lv_node_4_0= ruleNode )
                    {
                    // InternalRos2Parser.g:1702:4: (lv_node_4_0= ruleNode )
                    // InternalRos2Parser.g:1703:5: lv_node_4_0= ruleNode
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
    // InternalRos2Parser.g:1728:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRos2Parser.g:1728:45: (iv_ruleNode= ruleNode EOF )
            // InternalRos2Parser.g:1729:2: iv_ruleNode= ruleNode EOF
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
    // InternalRos2Parser.g:1735:1: ruleNode returns [EObject current=null] : (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= ServiceServers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= ServiceClients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= ActionServers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= ActionClients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )* ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token this_END_5=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token otherlv_14=null;
        Token this_BEGIN_15=null;
        Token this_END_17=null;
        Token otherlv_18=null;
        Token this_BEGIN_19=null;
        Token this_END_21=null;
        Token otherlv_22=null;
        Token this_BEGIN_23=null;
        Token this_END_25=null;
        Token otherlv_26=null;
        Token this_BEGIN_27=null;
        Token this_END_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_publisher_4_0 = null;

        EObject lv_subscriber_8_0 = null;

        EObject lv_serviceserver_12_0 = null;

        EObject lv_serviceclient_16_0 = null;

        EObject lv_actionserver_20_0 = null;

        EObject lv_actionclient_24_0 = null;

        EObject lv_parameter_28_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:1741:2: ( (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= ServiceServers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= ServiceClients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= ActionServers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= ActionClients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )* ) )
            // InternalRos2Parser.g:1742:2: (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= ServiceServers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= ServiceClients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= ActionServers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= ActionClients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )* )
            {
            // InternalRos2Parser.g:1742:2: (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= ServiceServers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= ServiceClients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= ActionServers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= ActionClients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )* )
            // InternalRos2Parser.g:1743:3: otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= ServiceServers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= ServiceClients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= ActionServers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= ActionClients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )*
            {
            otherlv_0=(Token)match(input,Node_1,FOLLOW_37);

                        newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());

            // InternalRos2Parser.g:1747:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRos2Parser.g:1748:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRos2Parser.g:1748:4: (lv_name_1_0= ruleRosNames )
            // InternalRos2Parser.g:1749:5: lv_name_1_0= ruleRosNames
            {

                                newCompositeNode(grammarAccess.getNodeAccess().getNameRosNamesParserRuleCall_1_0());

            pushFollow(FOLLOW_38);
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

            // InternalRos2Parser.g:1766:3: ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= ServiceServers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= ServiceClients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= ActionServers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= ActionClients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )*
            loop39:
            do {
                int alt39=8;
                switch ( input.LA(1) ) {
                case Publishers:
                    {
                    alt39=1;
                    }
                    break;
                case Subscribers:
                    {
                    alt39=2;
                    }
                    break;
                case ServiceServers:
                    {
                    alt39=3;
                    }
                    break;
                case ServiceClients:
                    {
                    alt39=4;
                    }
                    break;
                case ActionServers:
                    {
                    alt39=5;
                    }
                    break;
                case ActionClients:
                    {
                    alt39=6;
                    }
                    break;
                case Parameters:
                    {
                    alt39=7;
                    }
                    break;

                }

                switch (alt39) {
                case 1 :
                    // InternalRos2Parser.g:1767:4: (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END )
                    {
                    // InternalRos2Parser.g:1767:4: (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END )
                    // InternalRos2Parser.g:1768:5: otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END
                    {
                    otherlv_2=(Token)match(input,Publishers,FOLLOW_4);

                                        newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getPublishersKeyword_2_0_0());

                    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_39);

                                        newLeafNode(this_BEGIN_3, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_0_1());

                    // InternalRos2Parser.g:1776:5: ( (lv_publisher_4_0= rulePublisher ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_STRING)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                        case 1 :
                            // InternalRos2Parser.g:1777:6: (lv_publisher_4_0= rulePublisher )
                            {
                            // InternalRos2Parser.g:1777:6: (lv_publisher_4_0= rulePublisher )
                            // InternalRos2Parser.g:1778:7: lv_publisher_4_0= rulePublisher
                            {

                                                        newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_2_0_2_0());

                            pushFollow(FOLLOW_39);
                            lv_publisher_4_0=rulePublisher();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getNodeRule());
                                                        }
                                                        add(
                                                            current,
                                                            "publisher",
                                                            lv_publisher_4_0,
                                                            "de.fraunhofer.ipa.ros2.Ros2.Publisher");
                                                        afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            break loop32;
                        }
                    } while (true);

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_38);

                                        newLeafNode(this_END_5, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_0_3());


                    }


                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:1801:4: (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END )
                    {
                    // InternalRos2Parser.g:1801:4: (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END )
                    // InternalRos2Parser.g:1802:5: otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END
                    {
                    otherlv_6=(Token)match(input,Subscribers,FOLLOW_4);

                                        newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getSubscribersKeyword_2_1_0());

                    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_39);

                                        newLeafNode(this_BEGIN_7, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_1_1());

                    // InternalRos2Parser.g:1810:5: ( (lv_subscriber_8_0= ruleSubscriber ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_STRING)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                        case 1 :
                            // InternalRos2Parser.g:1811:6: (lv_subscriber_8_0= ruleSubscriber )
                            {
                            // InternalRos2Parser.g:1811:6: (lv_subscriber_8_0= ruleSubscriber )
                            // InternalRos2Parser.g:1812:7: lv_subscriber_8_0= ruleSubscriber
                            {

                                                        newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_2_1_2_0());

                            pushFollow(FOLLOW_39);
                            lv_subscriber_8_0=ruleSubscriber();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getNodeRule());
                                                        }
                                                        add(
                                                            current,
                                                            "subscriber",
                                                            lv_subscriber_8_0,
                                                            "de.fraunhofer.ipa.ros2.Ros2.Subscriber");
                                                        afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            break loop33;
                        }
                    } while (true);

                    this_END_9=(Token)match(input,RULE_END,FOLLOW_38);

                                        newLeafNode(this_END_9, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_1_3());


                    }


                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:1835:4: (otherlv_10= ServiceServers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END )
                    {
                    // InternalRos2Parser.g:1835:4: (otherlv_10= ServiceServers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END )
                    // InternalRos2Parser.g:1836:5: otherlv_10= ServiceServers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END
                    {
                    otherlv_10=(Token)match(input,ServiceServers,FOLLOW_4);

                                        newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getServiceServersKeyword_2_2_0());

                    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_39);

                                        newLeafNode(this_BEGIN_11, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_2_1());

                    // InternalRos2Parser.g:1844:5: ( (lv_serviceserver_12_0= ruleServiceServer ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( ((LA34_0>=RULE_ID && LA34_0<=RULE_STRING)) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                        case 1 :
                            // InternalRos2Parser.g:1845:6: (lv_serviceserver_12_0= ruleServiceServer )
                            {
                            // InternalRos2Parser.g:1845:6: (lv_serviceserver_12_0= ruleServiceServer )
                            // InternalRos2Parser.g:1846:7: lv_serviceserver_12_0= ruleServiceServer
                            {

                                                        newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_2_2_2_0());

                            pushFollow(FOLLOW_39);
                            lv_serviceserver_12_0=ruleServiceServer();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getNodeRule());
                                                        }
                                                        add(
                                                            current,
                                                            "serviceserver",
                                                            lv_serviceserver_12_0,
                                                            "de.fraunhofer.ipa.ros2.Ros2.ServiceServer");
                                                        afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            break loop34;
                        }
                    } while (true);

                    this_END_13=(Token)match(input,RULE_END,FOLLOW_38);

                                        newLeafNode(this_END_13, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_2_3());


                    }


                    }
                    break;
                case 4 :
                    // InternalRos2Parser.g:1869:4: (otherlv_14= ServiceClients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END )
                    {
                    // InternalRos2Parser.g:1869:4: (otherlv_14= ServiceClients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END )
                    // InternalRos2Parser.g:1870:5: otherlv_14= ServiceClients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END
                    {
                    otherlv_14=(Token)match(input,ServiceClients,FOLLOW_4);

                                        newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getServiceClientsKeyword_2_3_0());

                    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_39);

                                        newLeafNode(this_BEGIN_15, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_3_1());

                    // InternalRos2Parser.g:1878:5: ( (lv_serviceclient_16_0= ruleServiceClient ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( ((LA35_0>=RULE_ID && LA35_0<=RULE_STRING)) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                        case 1 :
                            // InternalRos2Parser.g:1879:6: (lv_serviceclient_16_0= ruleServiceClient )
                            {
                            // InternalRos2Parser.g:1879:6: (lv_serviceclient_16_0= ruleServiceClient )
                            // InternalRos2Parser.g:1880:7: lv_serviceclient_16_0= ruleServiceClient
                            {

                                                        newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_2_3_2_0());

                            pushFollow(FOLLOW_39);
                            lv_serviceclient_16_0=ruleServiceClient();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getNodeRule());
                                                        }
                                                        add(
                                                            current,
                                                            "serviceclient",
                                                            lv_serviceclient_16_0,
                                                            "de.fraunhofer.ipa.ros2.Ros2.ServiceClient");
                                                        afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            break loop35;
                        }
                    } while (true);

                    this_END_17=(Token)match(input,RULE_END,FOLLOW_38);

                                        newLeafNode(this_END_17, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_3_3());


                    }


                    }
                    break;
                case 5 :
                    // InternalRos2Parser.g:1903:4: (otherlv_18= ActionServers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END )
                    {
                    // InternalRos2Parser.g:1903:4: (otherlv_18= ActionServers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END )
                    // InternalRos2Parser.g:1904:5: otherlv_18= ActionServers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END
                    {
                    otherlv_18=(Token)match(input,ActionServers,FOLLOW_4);

                                        newLeafNode(otherlv_18, grammarAccess.getNodeAccess().getActionServersKeyword_2_4_0());

                    this_BEGIN_19=(Token)match(input,RULE_BEGIN,FOLLOW_39);

                                        newLeafNode(this_BEGIN_19, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_4_1());

                    // InternalRos2Parser.g:1912:5: ( (lv_actionserver_20_0= ruleActionServer ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STRING)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                        case 1 :
                            // InternalRos2Parser.g:1913:6: (lv_actionserver_20_0= ruleActionServer )
                            {
                            // InternalRos2Parser.g:1913:6: (lv_actionserver_20_0= ruleActionServer )
                            // InternalRos2Parser.g:1914:7: lv_actionserver_20_0= ruleActionServer
                            {

                                                        newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_2_4_2_0());

                            pushFollow(FOLLOW_39);
                            lv_actionserver_20_0=ruleActionServer();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getNodeRule());
                                                        }
                                                        add(
                                                            current,
                                                            "actionserver",
                                                            lv_actionserver_20_0,
                                                            "de.fraunhofer.ipa.ros2.Ros2.ActionServer");
                                                        afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            break loop36;
                        }
                    } while (true);

                    this_END_21=(Token)match(input,RULE_END,FOLLOW_38);

                                        newLeafNode(this_END_21, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_4_3());


                    }


                    }
                    break;
                case 6 :
                    // InternalRos2Parser.g:1937:4: (otherlv_22= ActionClients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END )
                    {
                    // InternalRos2Parser.g:1937:4: (otherlv_22= ActionClients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END )
                    // InternalRos2Parser.g:1938:5: otherlv_22= ActionClients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END
                    {
                    otherlv_22=(Token)match(input,ActionClients,FOLLOW_4);

                                        newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getActionClientsKeyword_2_5_0());

                    this_BEGIN_23=(Token)match(input,RULE_BEGIN,FOLLOW_39);

                                        newLeafNode(this_BEGIN_23, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_5_1());

                    // InternalRos2Parser.g:1946:5: ( (lv_actionclient_24_0= ruleActionClient ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_STRING)) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                        case 1 :
                            // InternalRos2Parser.g:1947:6: (lv_actionclient_24_0= ruleActionClient )
                            {
                            // InternalRos2Parser.g:1947:6: (lv_actionclient_24_0= ruleActionClient )
                            // InternalRos2Parser.g:1948:7: lv_actionclient_24_0= ruleActionClient
                            {

                                                        newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_2_5_2_0());

                            pushFollow(FOLLOW_39);
                            lv_actionclient_24_0=ruleActionClient();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getNodeRule());
                                                        }
                                                        add(
                                                            current,
                                                            "actionclient",
                                                            lv_actionclient_24_0,
                                                            "de.fraunhofer.ipa.ros2.Ros2.ActionClient");
                                                        afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            break loop37;
                        }
                    } while (true);

                    this_END_25=(Token)match(input,RULE_END,FOLLOW_38);

                                        newLeafNode(this_END_25, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_5_3());


                    }


                    }
                    break;
                case 7 :
                    // InternalRos2Parser.g:1971:4: (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END )
                    {
                    // InternalRos2Parser.g:1971:4: (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END )
                    // InternalRos2Parser.g:1972:5: otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END
                    {
                    otherlv_26=(Token)match(input,Parameters,FOLLOW_4);

                                        newLeafNode(otherlv_26, grammarAccess.getNodeAccess().getParametersKeyword_2_6_0());

                    this_BEGIN_27=(Token)match(input,RULE_BEGIN,FOLLOW_39);

                                        newLeafNode(this_BEGIN_27, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_6_1());

                    // InternalRos2Parser.g:1980:5: ( (lv_parameter_28_0= ruleParameter ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=RULE_ID && LA38_0<=RULE_STRING)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                        case 1 :
                            // InternalRos2Parser.g:1981:6: (lv_parameter_28_0= ruleParameter )
                            {
                            // InternalRos2Parser.g:1981:6: (lv_parameter_28_0= ruleParameter )
                            // InternalRos2Parser.g:1982:7: lv_parameter_28_0= ruleParameter
                            {

                                                        newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_2_6_2_0());

                            pushFollow(FOLLOW_39);
                            lv_parameter_28_0=ruleParameter();

                            state._fsp--;


                                                        if (current==null) {
                                                            current = createModelElementForParent(grammarAccess.getNodeRule());
                                                        }
                                                        add(
                                                            current,
                                                            "parameter",
                                                            lv_parameter_28_0,
                                                            "de.fraunhofer.ipa.ros2.Ros2.Parameter");
                                                        afterParserOrEnumRuleCall();


                            }


                            }
                            break;

                        default :
                            break loop38;
                        }
                    } while (true);

                    this_END_29=(Token)match(input,RULE_END,FOLLOW_38);

                                        newLeafNode(this_END_29, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_6_3());


                    }


                    }
                    break;

                default :
                    break loop39;
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


    // $ANTLR start "entryRuleSpecBase"
    // InternalRos2Parser.g:2009:1: entryRuleSpecBase returns [EObject current=null] : iv_ruleSpecBase= ruleSpecBase EOF ;
    public final EObject entryRuleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBase = null;


        try {
            // InternalRos2Parser.g:2009:49: (iv_ruleSpecBase= ruleSpecBase EOF )
            // InternalRos2Parser.g:2010:2: iv_ruleSpecBase= ruleSpecBase EOF
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
    // InternalRos2Parser.g:2016:1: ruleSpecBase returns [EObject current=null] : (this_TopicSpec_0= ruleTopicSpec | this_ServiceSpec_1= ruleServiceSpec | this_ActionSpec_2= ruleActionSpec ) ;
    public final EObject ruleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject this_TopicSpec_0 = null;

        EObject this_ServiceSpec_1 = null;

        EObject this_ActionSpec_2 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:2022:2: ( (this_TopicSpec_0= ruleTopicSpec | this_ServiceSpec_1= ruleServiceSpec | this_ActionSpec_2= ruleActionSpec ) )
            // InternalRos2Parser.g:2023:2: (this_TopicSpec_0= ruleTopicSpec | this_ServiceSpec_1= ruleServiceSpec | this_ActionSpec_2= ruleActionSpec )
            {
            // InternalRos2Parser.g:2023:2: (this_TopicSpec_0= ruleTopicSpec | this_ServiceSpec_1= ruleServiceSpec | this_ActionSpec_2= ruleActionSpec )
            int alt40=3;
            switch ( input.LA(1) ) {
            case Msg:
                {
                alt40=1;
                }
                break;
            case Srv:
                {
                alt40=2;
                }
                break;
            case Action_1:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalRos2Parser.g:2024:3: this_TopicSpec_0= ruleTopicSpec
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
                    // InternalRos2Parser.g:2033:3: this_ServiceSpec_1= ruleServiceSpec
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
                    // InternalRos2Parser.g:2042:3: this_ActionSpec_2= ruleActionSpec
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
    // InternalRos2Parser.g:2054:1: entryRuleTopicSpec returns [EObject current=null] : iv_ruleTopicSpec= ruleTopicSpec EOF ;
    public final EObject entryRuleTopicSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpec = null;


        try {
            // InternalRos2Parser.g:2054:50: (iv_ruleTopicSpec= ruleTopicSpec EOF )
            // InternalRos2Parser.g:2055:2: iv_ruleTopicSpec= ruleTopicSpec EOF
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
    // InternalRos2Parser.g:2061:1: ruleTopicSpec returns [EObject current=null] : ( () otherlv_1= Msg ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Message_1 (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? this_END_8= RULE_END ) ;
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
            // InternalRos2Parser.g:2067:2: ( ( () otherlv_1= Msg ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Message_1 (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? this_END_8= RULE_END ) )
            // InternalRos2Parser.g:2068:2: ( () otherlv_1= Msg ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Message_1 (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? this_END_8= RULE_END )
            {
            // InternalRos2Parser.g:2068:2: ( () otherlv_1= Msg ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Message_1 (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? this_END_8= RULE_END )
            // InternalRos2Parser.g:2069:3: () otherlv_1= Msg ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Message_1 (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? this_END_8= RULE_END
            {
            // InternalRos2Parser.g:2069:3: ()
            // InternalRos2Parser.g:2070:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getTopicSpecAccess().getTopicSpecAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Msg,FOLLOW_40);

                        newLeafNode(otherlv_1, grammarAccess.getTopicSpecAccess().getMsgKeyword_1());

            // InternalRos2Parser.g:2080:3: ( ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) ) )
            // InternalRos2Parser.g:2081:4: ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) )
            {
            // InternalRos2Parser.g:2081:4: ( (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String ) )
            // InternalRos2Parser.g:2082:5: (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String )
            {
            // InternalRos2Parser.g:2082:5: (lv_name_2_1= ruleEString | lv_name_2_2= Header | lv_name_2_3= String )
            int alt41=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt41=1;
                }
                break;
            case Header:
                {
                alt41=2;
                }
                break;
            case String:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalRos2Parser.g:2083:6: lv_name_2_1= ruleEString
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
                                                "de.fraunhofer.ipa.ros.Basics.EString");
                                            afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:2099:6: lv_name_2_2= Header
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
                    // InternalRos2Parser.g:2110:6: lv_name_2_3= String
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

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_41);

                        newLeafNode(this_BEGIN_3, grammarAccess.getTopicSpecAccess().getBEGINTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Message_1,FOLLOW_42);

                        newLeafNode(otherlv_4, grammarAccess.getTopicSpecAccess().getMessageKeyword_4());

            // InternalRos2Parser.g:2131:3: (this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_BEGIN) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRos2Parser.g:2132:4: this_BEGIN_5= RULE_BEGIN ( (lv_message_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_43);

                                    newLeafNode(this_BEGIN_5, grammarAccess.getTopicSpecAccess().getBEGINTerminalRuleCall_5_0());

                    // InternalRos2Parser.g:2136:4: ( (lv_message_6_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2137:5: (lv_message_6_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2137:5: (lv_message_6_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2138:6: lv_message_6_0= ruleMessageDefinition
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
    // InternalRos2Parser.g:2168:1: entryRuleServiceSpec returns [EObject current=null] : iv_ruleServiceSpec= ruleServiceSpec EOF ;
    public final EObject entryRuleServiceSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSpec = null;


        try {
            // InternalRos2Parser.g:2168:52: (iv_ruleServiceSpec= ruleServiceSpec EOF )
            // InternalRos2Parser.g:2169:2: iv_ruleServiceSpec= ruleServiceSpec EOF
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
    // InternalRos2Parser.g:2175:1: ruleServiceSpec returns [EObject current=null] : ( () otherlv_1= Srv ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Request (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Response (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? this_END_12= RULE_END ) ;
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
            // InternalRos2Parser.g:2181:2: ( ( () otherlv_1= Srv ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Request (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Response (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? this_END_12= RULE_END ) )
            // InternalRos2Parser.g:2182:2: ( () otherlv_1= Srv ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Request (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Response (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? this_END_12= RULE_END )
            {
            // InternalRos2Parser.g:2182:2: ( () otherlv_1= Srv ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Request (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Response (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? this_END_12= RULE_END )
            // InternalRos2Parser.g:2183:3: () otherlv_1= Srv ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Request (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Response (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? this_END_12= RULE_END
            {
            // InternalRos2Parser.g:2183:3: ()
            // InternalRos2Parser.g:2184:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getServiceSpecAccess().getServiceSpecAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Srv,FOLLOW_6);

                        newLeafNode(otherlv_1, grammarAccess.getServiceSpecAccess().getSrvKeyword_1());

            // InternalRos2Parser.g:2194:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos2Parser.g:2195:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos2Parser.g:2195:4: (lv_name_2_0= ruleEString )
            // InternalRos2Parser.g:2196:5: lv_name_2_0= ruleEString
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
                                    "de.fraunhofer.ipa.ros.Basics.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_44);

                        newLeafNode(this_BEGIN_3, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Request,FOLLOW_45);

                        newLeafNode(otherlv_4, grammarAccess.getServiceSpecAccess().getRequestKeyword_4());

            // InternalRos2Parser.g:2221:3: (this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_BEGIN) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRos2Parser.g:2222:4: this_BEGIN_5= RULE_BEGIN ( (lv_request_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_43);

                                    newLeafNode(this_BEGIN_5, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_5_0());

                    // InternalRos2Parser.g:2226:4: ( (lv_request_6_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2227:5: (lv_request_6_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2227:5: (lv_request_6_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2228:6: lv_request_6_0= ruleMessageDefinition
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

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_46);

                                    newLeafNode(this_END_7, grammarAccess.getServiceSpecAccess().getENDTerminalRuleCall_5_2());


                    }
                    break;

            }

            otherlv_8=(Token)match(input,Response,FOLLOW_42);

                        newLeafNode(otherlv_8, grammarAccess.getServiceSpecAccess().getResponseKeyword_6());

            // InternalRos2Parser.g:2254:3: (this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_BEGIN) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRos2Parser.g:2255:4: this_BEGIN_9= RULE_BEGIN ( (lv_response_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END
                    {
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_43);

                                    newLeafNode(this_BEGIN_9, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_7_0());

                    // InternalRos2Parser.g:2259:4: ( (lv_response_10_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2260:5: (lv_response_10_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2260:5: (lv_response_10_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2261:6: lv_response_10_0= ruleMessageDefinition
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
    // InternalRos2Parser.g:2291:1: entryRuleActionSpec returns [EObject current=null] : iv_ruleActionSpec= ruleActionSpec EOF ;
    public final EObject entryRuleActionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSpec = null;


        try {
            // InternalRos2Parser.g:2291:51: (iv_ruleActionSpec= ruleActionSpec EOF )
            // InternalRos2Parser.g:2292:2: iv_ruleActionSpec= ruleActionSpec EOF
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
    // InternalRos2Parser.g:2298:1: ruleActionSpec returns [EObject current=null] : ( () otherlv_1= Action_1 ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Goal_1 (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Result_1 (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? otherlv_12= Feedback_1 (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )? this_END_16= RULE_END ) ;
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
            // InternalRos2Parser.g:2304:2: ( ( () otherlv_1= Action_1 ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Goal_1 (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Result_1 (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? otherlv_12= Feedback_1 (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )? this_END_16= RULE_END ) )
            // InternalRos2Parser.g:2305:2: ( () otherlv_1= Action_1 ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Goal_1 (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Result_1 (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? otherlv_12= Feedback_1 (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )? this_END_16= RULE_END )
            {
            // InternalRos2Parser.g:2305:2: ( () otherlv_1= Action_1 ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Goal_1 (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Result_1 (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? otherlv_12= Feedback_1 (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )? this_END_16= RULE_END )
            // InternalRos2Parser.g:2306:3: () otherlv_1= Action_1 ( (lv_name_2_0= ruleEString ) ) this_BEGIN_3= RULE_BEGIN otherlv_4= Goal_1 (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )? otherlv_8= Result_1 (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )? otherlv_12= Feedback_1 (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )? this_END_16= RULE_END
            {
            // InternalRos2Parser.g:2306:3: ()
            // InternalRos2Parser.g:2307:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getActionSpecAccess().getActionSpecAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Action_1,FOLLOW_6);

                        newLeafNode(otherlv_1, grammarAccess.getActionSpecAccess().getActionKeyword_1());

            // InternalRos2Parser.g:2317:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos2Parser.g:2318:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos2Parser.g:2318:4: (lv_name_2_0= ruleEString )
            // InternalRos2Parser.g:2319:5: lv_name_2_0= ruleEString
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
                                    "de.fraunhofer.ipa.ros.Basics.EString");
                                afterParserOrEnumRuleCall();


            }


            }

            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_47);

                        newLeafNode(this_BEGIN_3, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_3());

            otherlv_4=(Token)match(input,Goal_1,FOLLOW_48);

                        newLeafNode(otherlv_4, grammarAccess.getActionSpecAccess().getGoalKeyword_4());

            // InternalRos2Parser.g:2344:3: (this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_BEGIN) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRos2Parser.g:2345:4: this_BEGIN_5= RULE_BEGIN ( (lv_goal_6_0= ruleMessageDefinition ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_43);

                                    newLeafNode(this_BEGIN_5, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_5_0());

                    // InternalRos2Parser.g:2349:4: ( (lv_goal_6_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2350:5: (lv_goal_6_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2350:5: (lv_goal_6_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2351:6: lv_goal_6_0= ruleMessageDefinition
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

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_49);

                                    newLeafNode(this_END_7, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_5_2());


                    }
                    break;

            }

            otherlv_8=(Token)match(input,Result_1,FOLLOW_50);

                        newLeafNode(otherlv_8, grammarAccess.getActionSpecAccess().getResultKeyword_6());

            // InternalRos2Parser.g:2377:3: (this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_BEGIN) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRos2Parser.g:2378:4: this_BEGIN_9= RULE_BEGIN ( (lv_result_10_0= ruleMessageDefinition ) ) this_END_11= RULE_END
                    {
                    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_43);

                                    newLeafNode(this_BEGIN_9, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_7_0());

                    // InternalRos2Parser.g:2382:4: ( (lv_result_10_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2383:5: (lv_result_10_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2383:5: (lv_result_10_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2384:6: lv_result_10_0= ruleMessageDefinition
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

                    this_END_11=(Token)match(input,RULE_END,FOLLOW_51);

                                    newLeafNode(this_END_11, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_7_2());


                    }
                    break;

            }

            otherlv_12=(Token)match(input,Feedback_1,FOLLOW_42);

                        newLeafNode(otherlv_12, grammarAccess.getActionSpecAccess().getFeedbackKeyword_8());

            // InternalRos2Parser.g:2410:3: (this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_BEGIN) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRos2Parser.g:2411:4: this_BEGIN_13= RULE_BEGIN ( (lv_feedback_14_0= ruleMessageDefinition ) ) this_END_15= RULE_END
                    {
                    this_BEGIN_13=(Token)match(input,RULE_BEGIN,FOLLOW_43);

                                    newLeafNode(this_BEGIN_13, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_9_0());

                    // InternalRos2Parser.g:2415:4: ( (lv_feedback_14_0= ruleMessageDefinition ) )
                    // InternalRos2Parser.g:2416:5: (lv_feedback_14_0= ruleMessageDefinition )
                    {
                    // InternalRos2Parser.g:2416:5: (lv_feedback_14_0= ruleMessageDefinition )
                    // InternalRos2Parser.g:2417:6: lv_feedback_14_0= ruleMessageDefinition
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
    // InternalRos2Parser.g:2447:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalRos2Parser.g:2447:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalRos2Parser.g:2448:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
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
    // InternalRos2Parser.g:2454:1: ruleMessageDefinition returns [EObject current=null] : ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )+ ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_MessagePart_1_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:2460:2: ( ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )+ ) )
            // InternalRos2Parser.g:2461:2: ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )+ )
            {
            // InternalRos2Parser.g:2461:2: ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )+ )
            // InternalRos2Parser.g:2462:3: () ( (lv_MessagePart_1_0= ruleMessagePart ) )+
            {
            // InternalRos2Parser.g:2462:3: ()
            // InternalRos2Parser.g:2463:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
                                current);


            }

            // InternalRos2Parser.g:2469:3: ( (lv_MessagePart_1_0= ruleMessagePart ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=Duration && LA48_0<=Feedback)||LA48_0==Message||LA48_0==Service||LA48_0==Action||LA48_0==Result||LA48_0==Value||LA48_0==Goal||LA48_0==Name||(LA48_0>=Time && LA48_0<=Type)||(LA48_0>=RULE_ID && LA48_0<=RULE_STRING)||LA48_0==RULE_MESSAGE_ASIGMENT) ) {
                    alt48=1;
                }


                switch (alt48) {
                case 1 :
                    // InternalRos2Parser.g:2470:4: (lv_MessagePart_1_0= ruleMessagePart )
                    {
                    // InternalRos2Parser.g:2470:4: (lv_MessagePart_1_0= ruleMessagePart )
                    // InternalRos2Parser.g:2471:5: lv_MessagePart_1_0= ruleMessagePart
                    {

                                        newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_1_0());

                    pushFollow(FOLLOW_52);
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
                    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
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
    // InternalRos2Parser.g:2492:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalRos2Parser.g:2492:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalRos2Parser.g:2493:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalRos2Parser.g:2499:1: ruleDependency returns [EObject current=null] : (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDependency_0 = null;

        EObject this_ExternalDependency_1 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:2505:2: ( (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) )
            // InternalRos2Parser.g:2506:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            {
            // InternalRos2Parser.g:2506:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=RULE_ID && LA49_0<=RULE_STRING)) ) {
                alt49=1;
            }
            else if ( (LA49_0==ExternalDependency) ) {
                alt49=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // InternalRos2Parser.g:2507:3: this_PackageDependency_0= rulePackageDependency
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
                    // InternalRos2Parser.g:2516:3: this_ExternalDependency_1= ruleExternalDependency
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
    // InternalRos2Parser.g:2528:1: entryRulePackageDependency returns [EObject current=null] : iv_rulePackageDependency= rulePackageDependency EOF ;
    public final EObject entryRulePackageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDependency = null;


        try {
            // InternalRos2Parser.g:2528:58: (iv_rulePackageDependency= rulePackageDependency EOF )
            // InternalRos2Parser.g:2529:2: iv_rulePackageDependency= rulePackageDependency EOF
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
    // InternalRos2Parser.g:2535:1: rulePackageDependency returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject rulePackageDependency() throws RecognitionException {
        EObject current = null;


            enterRule();

        try {
            // InternalRos2Parser.g:2541:2: ( ( ( ruleEString ) ) )
            // InternalRos2Parser.g:2542:2: ( ( ruleEString ) )
            {
            // InternalRos2Parser.g:2542:2: ( ( ruleEString ) )
            // InternalRos2Parser.g:2543:3: ( ruleEString )
            {
            // InternalRos2Parser.g:2543:3: ( ruleEString )
            // InternalRos2Parser.g:2544:4: ruleEString
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
    // InternalRos2Parser.g:2561:1: entryRuleExternalDependency returns [EObject current=null] : iv_ruleExternalDependency= ruleExternalDependency EOF ;
    public final EObject entryRuleExternalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDependency = null;


        try {
            // InternalRos2Parser.g:2561:59: (iv_ruleExternalDependency= ruleExternalDependency EOF )
            // InternalRos2Parser.g:2562:2: iv_ruleExternalDependency= ruleExternalDependency EOF
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
    // InternalRos2Parser.g:2568:1: ruleExternalDependency returns [EObject current=null] : ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:2574:2: ( ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRos2Parser.g:2575:2: ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRos2Parser.g:2575:2: ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) )
            // InternalRos2Parser.g:2576:3: () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRos2Parser.g:2576:3: ()
            // InternalRos2Parser.g:2577:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,ExternalDependency,FOLLOW_6);

                        newLeafNode(otherlv_1, grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1());

            // InternalRos2Parser.g:2587:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos2Parser.g:2588:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos2Parser.g:2588:4: (lv_name_2_0= ruleEString )
            // InternalRos2Parser.g:2589:5: lv_name_2_0= ruleEString
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
    // InternalRos2Parser.g:2610:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRos2Parser.g:2610:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRos2Parser.g:2611:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalRos2Parser.g:2617:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:2623:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRos2Parser.g:2624:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRos2Parser.g:2624:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt50=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt50=1;
                }
                break;
            case RelativeNamespace:
                {
                alt50=2;
                }
                break;
            case PrivateNamespace:
                {
                alt50=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalRos2Parser.g:2625:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalRos2Parser.g:2634:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalRos2Parser.g:2643:3: this_PrivateNamespace_2= rulePrivateNamespace
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
    // InternalRos2Parser.g:2655:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRos2Parser.g:2655:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRos2Parser.g:2656:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalRos2Parser.g:2662:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= GraphName ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();

        try {
            // InternalRos2Parser.g:2668:2: (kw= GraphName )
            // InternalRos2Parser.g:2669:2: kw= GraphName
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
    // InternalRos2Parser.g:2677:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRos2Parser.g:2677:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRos2Parser.g:2678:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalRos2Parser.g:2684:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:2690:2: ( ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRos2Parser.g:2691:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:2691:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRos2Parser.g:2692:3: () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRos2Parser.g:2692:3: ()
            // InternalRos2Parser.g:2693:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,GlobalNamespace,FOLLOW_53);

                        newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());

            // InternalRos2Parser.g:2703:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LeftSquareBracket) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRos2Parser.g:2704:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_54);

                                    newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0());

                    // InternalRos2Parser.g:2708:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRos2Parser.g:2709:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRos2Parser.g:2709:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRos2Parser.g:2710:6: lv_parts_3_0= ruleGraphName
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

                    // InternalRos2Parser.g:2727:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==Comma) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                        case 1 :
                            // InternalRos2Parser.g:2728:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                            {
                            otherlv_4=(Token)match(input,Comma,FOLLOW_54);

                                                newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0());

                            // InternalRos2Parser.g:2732:5: ( (lv_parts_5_0= ruleGraphName ) )
                            // InternalRos2Parser.g:2733:6: (lv_parts_5_0= ruleGraphName )
                            {
                            // InternalRos2Parser.g:2733:6: (lv_parts_5_0= ruleGraphName )
                            // InternalRos2Parser.g:2734:7: lv_parts_5_0= ruleGraphName
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
                            break loop51;
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
    // InternalRos2Parser.g:2761:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRos2Parser.g:2761:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRos2Parser.g:2762:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalRos2Parser.g:2768:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:2774:2: ( ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRos2Parser.g:2775:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:2775:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRos2Parser.g:2776:3: () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRos2Parser.g:2776:3: ()
            // InternalRos2Parser.g:2777:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,RelativeNamespace,FOLLOW_53);

                        newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());

            // InternalRos2Parser.g:2787:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LeftSquareBracket) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRos2Parser.g:2788:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_54);

                                    newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0());

                    // InternalRos2Parser.g:2792:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRos2Parser.g:2793:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRos2Parser.g:2793:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRos2Parser.g:2794:6: lv_parts_3_0= ruleGraphName
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

                    // InternalRos2Parser.g:2811:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==Comma) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                        case 1 :
                            // InternalRos2Parser.g:2812:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                            {
                            otherlv_4=(Token)match(input,Comma,FOLLOW_54);

                                                newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0());

                            // InternalRos2Parser.g:2816:5: ( (lv_parts_5_0= ruleGraphName ) )
                            // InternalRos2Parser.g:2817:6: (lv_parts_5_0= ruleGraphName )
                            {
                            // InternalRos2Parser.g:2817:6: (lv_parts_5_0= ruleGraphName )
                            // InternalRos2Parser.g:2818:7: lv_parts_5_0= ruleGraphName
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
                            break loop53;
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
    // InternalRos2Parser.g:2845:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRos2Parser.g:2845:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRos2Parser.g:2846:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalRos2Parser.g:2852:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:2858:2: ( ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRos2Parser.g:2859:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:2859:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRos2Parser.g:2860:3: () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRos2Parser.g:2860:3: ()
            // InternalRos2Parser.g:2861:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,PrivateNamespace,FOLLOW_53);

                        newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());

            // InternalRos2Parser.g:2871:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==LeftSquareBracket) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRos2Parser.g:2872:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_54);

                                    newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0());

                    // InternalRos2Parser.g:2876:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRos2Parser.g:2877:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRos2Parser.g:2877:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRos2Parser.g:2878:6: lv_parts_3_0= ruleGraphName
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

                    // InternalRos2Parser.g:2895:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==Comma) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                        case 1 :
                            // InternalRos2Parser.g:2896:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                            {
                            otherlv_4=(Token)match(input,Comma,FOLLOW_54);

                                                newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0());

                            // InternalRos2Parser.g:2900:5: ( (lv_parts_5_0= ruleGraphName ) )
                            // InternalRos2Parser.g:2901:6: (lv_parts_5_0= ruleGraphName )
                            {
                            // InternalRos2Parser.g:2901:6: (lv_parts_5_0= ruleGraphName )
                            // InternalRos2Parser.g:2902:7: lv_parts_5_0= ruleGraphName
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
                            break loop55;
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
    // InternalRos2Parser.g:2929:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRos2Parser.g:2929:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRos2Parser.g:2930:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalRos2Parser.g:2936:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
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
            // InternalRos2Parser.g:2942:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalRos2Parser.g:2943:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalRos2Parser.g:2943:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt57=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt57=1;
                }
                break;
            case Struct:
                {
                alt57=2;
                }
                break;
            case Integer:
                {
                alt57=3;
                }
                break;
            case String:
                {
                alt57=4;
                }
                break;
            case Double:
                {
                alt57=5;
                }
                break;
            case Boolean:
                {
                alt57=6;
                }
                break;
            case Base64:
                {
                alt57=7;
                }
                break;
            case RULE_BEGIN:
                {
                alt57=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalRos2Parser.g:2944:3: this_ParameterListType_0= ruleParameterListType
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
                    // InternalRos2Parser.g:2953:3: this_ParameterStructType_1= ruleParameterStructType
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
                    // InternalRos2Parser.g:2962:3: this_ParameterIntegerType_2= ruleParameterIntegerType
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
                    // InternalRos2Parser.g:2971:3: this_ParameterStringType_3= ruleParameterStringType
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
                    // InternalRos2Parser.g:2980:3: this_ParameterDoubleType_4= ruleParameterDoubleType
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
                    // InternalRos2Parser.g:2989:3: this_ParameterBooleanType_5= ruleParameterBooleanType
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
                    // InternalRos2Parser.g:2998:3: this_ParameterBase64Type_6= ruleParameterBase64Type
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
                    // InternalRos2Parser.g:3007:3: this_ParameterArrayType_7= ruleParameterArrayType
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
    // InternalRos2Parser.g:3019:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRos2Parser.g:3019:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRos2Parser.g:3020:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalRos2Parser.g:3026:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
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
            // InternalRos2Parser.g:3032:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalRos2Parser.g:3033:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalRos2Parser.g:3033:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt58=7;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // InternalRos2Parser.g:3034:3: this_ParameterString_0= ruleParameterString
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
                    // InternalRos2Parser.g:3043:3: this_ParameterBase64_1= ruleParameterBase64
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
                    // InternalRos2Parser.g:3052:3: this_ParameterInteger_2= ruleParameterInteger
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
                    // InternalRos2Parser.g:3061:3: this_ParameterDouble_3= ruleParameterDouble
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
                    // InternalRos2Parser.g:3070:3: this_ParameterBoolean_4= ruleParameterBoolean
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
                    // InternalRos2Parser.g:3079:3: this_ParameterList_5= ruleParameterList
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
                    // InternalRos2Parser.g:3088:3: this_ParameterStruct_6= ruleParameterStruct
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
    // InternalRos2Parser.g:3100:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRos2Parser.g:3100:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRos2Parser.g:3101:2: iv_ruleParameterListType= ruleParameterListType EOF
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
    // InternalRos2Parser.g:3107:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) ;
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
            // InternalRos2Parser.g:3113:2: ( ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRos2Parser.g:3114:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRos2Parser.g:3114:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            // InternalRos2Parser.g:3115:3: () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRos2Parser.g:3115:3: ()
            // InternalRos2Parser.g:3116:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,List,FOLLOW_10);

                        newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());

            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_25);

                        newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2());

            // InternalRos2Parser.g:3130:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalRos2Parser.g:3131:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalRos2Parser.g:3131:4: (lv_sequence_3_0= ruleParameterType )
            // InternalRos2Parser.g:3132:5: lv_sequence_3_0= ruleParameterType
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

            // InternalRos2Parser.g:3149:3: (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==Comma) ) {
                    alt59=1;
                }


                switch (alt59) {
                case 1 :
                    // InternalRos2Parser.g:3150:4: otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) )
                    {
                    otherlv_4=(Token)match(input,Comma,FOLLOW_25);

                                    newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());

                    // InternalRos2Parser.g:3154:4: ( (lv_sequence_5_0= ruleParameterType ) )
                    // InternalRos2Parser.g:3155:5: (lv_sequence_5_0= ruleParameterType )
                    {
                    // InternalRos2Parser.g:3155:5: (lv_sequence_5_0= ruleParameterType )
                    // InternalRos2Parser.g:3156:6: lv_sequence_5_0= ruleParameterType
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
                    break loop59;
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
    // InternalRos2Parser.g:3182:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRos2Parser.g:3182:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRos2Parser.g:3183:2: iv_ruleParameterStructType= ruleParameterStructType EOF
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
    // InternalRos2Parser.g:3189:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) ;
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
            // InternalRos2Parser.g:3195:2: ( ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRos2Parser.g:3196:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRos2Parser.g:3196:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            // InternalRos2Parser.g:3197:3: () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRos2Parser.g:3197:3: ()
            // InternalRos2Parser.g:3198:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Struct,FOLLOW_10);

                        newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());

            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_6);

                        newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2());

            // InternalRos2Parser.g:3212:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalRos2Parser.g:3213:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalRos2Parser.g:3213:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalRos2Parser.g:3214:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
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

            // InternalRos2Parser.g:3231:3: (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==Comma) ) {
                    alt60=1;
                }


                switch (alt60) {
                case 1 :
                    // InternalRos2Parser.g:3232:4: otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
                    {
                    otherlv_4=(Token)match(input,Comma,FOLLOW_6);

                                    newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());

                    // InternalRos2Parser.g:3236:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
                    // InternalRos2Parser.g:3237:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
                    {
                    // InternalRos2Parser.g:3237:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
                    // InternalRos2Parser.g:3238:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
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
                    break loop60;
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
    // InternalRos2Parser.g:3264:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRos2Parser.g:3264:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRos2Parser.g:3265:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
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
    // InternalRos2Parser.g:3271:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3277:2: ( ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) )
            // InternalRos2Parser.g:3278:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            {
            // InternalRos2Parser.g:3278:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            // InternalRos2Parser.g:3279:3: () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            {
            // InternalRos2Parser.g:3279:3: ()
            // InternalRos2Parser.g:3280:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Integer,FOLLOW_55);

                        newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());

            // InternalRos2Parser.g:3290:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Default) ) {
                int LA61_1 = input.LA(2);

                if ( (LA61_1==RULE_DECINT) ) {
                    alt61=1;
                }
            }
            switch (alt61) {
                case 1 :
                    // InternalRos2Parser.g:3291:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_17);

                                    newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());

                    // InternalRos2Parser.g:3295:4: ( (lv_default_3_0= ruleParameterInteger ) )
                    // InternalRos2Parser.g:3296:5: (lv_default_3_0= ruleParameterInteger )
                    {
                    // InternalRos2Parser.g:3296:5: (lv_default_3_0= ruleParameterInteger )
                    // InternalRos2Parser.g:3297:6: lv_default_3_0= ruleParameterInteger
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
    // InternalRos2Parser.g:3319:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRos2Parser.g:3319:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRos2Parser.g:3320:2: iv_ruleParameterStringType= ruleParameterStringType EOF
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
    // InternalRos2Parser.g:3326:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3332:2: ( ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) )
            // InternalRos2Parser.g:3333:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            {
            // InternalRos2Parser.g:3333:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            // InternalRos2Parser.g:3334:3: () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            {
            // InternalRos2Parser.g:3334:3: ()
            // InternalRos2Parser.g:3335:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,String,FOLLOW_55);

                        newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());

            // InternalRos2Parser.g:3345:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Default) ) {
                int LA62_1 = input.LA(2);

                if ( (LA62_1==RULE_STRING) ) {
                    alt62=1;
                }
                else if ( (LA62_1==RULE_ID) ) {
                    alt62=1;
                }
            }
            switch (alt62) {
                case 1 :
                    // InternalRos2Parser.g:3346:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_6);

                                    newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());

                    // InternalRos2Parser.g:3350:4: ( (lv_default_3_0= ruleParameterString ) )
                    // InternalRos2Parser.g:3351:5: (lv_default_3_0= ruleParameterString )
                    {
                    // InternalRos2Parser.g:3351:5: (lv_default_3_0= ruleParameterString )
                    // InternalRos2Parser.g:3352:6: lv_default_3_0= ruleParameterString
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
    // InternalRos2Parser.g:3374:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRos2Parser.g:3374:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRos2Parser.g:3375:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
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
    // InternalRos2Parser.g:3381:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3387:2: ( ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) )
            // InternalRos2Parser.g:3388:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            {
            // InternalRos2Parser.g:3388:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            // InternalRos2Parser.g:3389:3: () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            {
            // InternalRos2Parser.g:3389:3: ()
            // InternalRos2Parser.g:3390:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Double,FOLLOW_55);

                        newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());

            // InternalRos2Parser.g:3400:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Default) ) {
                int LA63_1 = input.LA(2);

                if ( (LA63_1==RULE_DOUBLE) ) {
                    alt63=1;
                }
            }
            switch (alt63) {
                case 1 :
                    // InternalRos2Parser.g:3401:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_56);

                                    newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());

                    // InternalRos2Parser.g:3405:4: ( (lv_default_3_0= ruleParameterDouble ) )
                    // InternalRos2Parser.g:3406:5: (lv_default_3_0= ruleParameterDouble )
                    {
                    // InternalRos2Parser.g:3406:5: (lv_default_3_0= ruleParameterDouble )
                    // InternalRos2Parser.g:3407:6: lv_default_3_0= ruleParameterDouble
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
    // InternalRos2Parser.g:3429:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRos2Parser.g:3429:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRos2Parser.g:3430:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
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
    // InternalRos2Parser.g:3436:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3442:2: ( ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) )
            // InternalRos2Parser.g:3443:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            {
            // InternalRos2Parser.g:3443:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            // InternalRos2Parser.g:3444:3: () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            {
            // InternalRos2Parser.g:3444:3: ()
            // InternalRos2Parser.g:3445:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Boolean,FOLLOW_55);

                        newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());

            // InternalRos2Parser.g:3455:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Default) ) {
                int LA64_1 = input.LA(2);

                if ( (LA64_1==RULE_BOOLEAN) ) {
                    alt64=1;
                }
            }
            switch (alt64) {
                case 1 :
                    // InternalRos2Parser.g:3456:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_57);

                                    newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());

                    // InternalRos2Parser.g:3460:4: ( (lv_default_3_0= ruleParameterBoolean ) )
                    // InternalRos2Parser.g:3461:5: (lv_default_3_0= ruleParameterBoolean )
                    {
                    // InternalRos2Parser.g:3461:5: (lv_default_3_0= ruleParameterBoolean )
                    // InternalRos2Parser.g:3462:6: lv_default_3_0= ruleParameterBoolean
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
    // InternalRos2Parser.g:3484:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRos2Parser.g:3484:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRos2Parser.g:3485:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
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
    // InternalRos2Parser.g:3491:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3497:2: ( ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) )
            // InternalRos2Parser.g:3498:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            {
            // InternalRos2Parser.g:3498:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            // InternalRos2Parser.g:3499:3: () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            {
            // InternalRos2Parser.g:3499:3: ()
            // InternalRos2Parser.g:3500:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,Base64,FOLLOW_55);

                        newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());

            // InternalRos2Parser.g:3510:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Default) ) {
                int LA65_1 = input.LA(2);

                if ( (LA65_1==RULE_BINARY) ) {
                    alt65=1;
                }
            }
            switch (alt65) {
                case 1 :
                    // InternalRos2Parser.g:3511:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_58);

                                    newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());

                    // InternalRos2Parser.g:3515:4: ( (lv_default_3_0= ruleParameterBase64 ) )
                    // InternalRos2Parser.g:3516:5: (lv_default_3_0= ruleParameterBase64 )
                    {
                    // InternalRos2Parser.g:3516:5: (lv_default_3_0= ruleParameterBase64 )
                    // InternalRos2Parser.g:3517:6: lv_default_3_0= ruleParameterBase64
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
    // InternalRos2Parser.g:3539:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRos2Parser.g:3539:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRos2Parser.g:3540:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
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
    // InternalRos2Parser.g:3546:1: ruleParameterArrayType returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END ) ;
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
            // InternalRos2Parser.g:3552:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END ) )
            // InternalRos2Parser.g:3553:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END )
            {
            // InternalRos2Parser.g:3553:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END )
            // InternalRos2Parser.g:3554:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_59);

                        newLeafNode(this_BEGIN_0, grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_0());

            otherlv_1=(Token)match(input,Array,FOLLOW_25);

                        newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_1());

            // InternalRos2Parser.g:3562:3: ( (lv_type_2_0= ruleParameterType ) )
            // InternalRos2Parser.g:3563:4: (lv_type_2_0= ruleParameterType )
            {
            // InternalRos2Parser.g:3563:4: (lv_type_2_0= ruleParameterType )
            // InternalRos2Parser.g:3564:5: lv_type_2_0= ruleParameterType
            {

                                newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());

            pushFollow(FOLLOW_29);
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

            // InternalRos2Parser.g:3581:3: (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Default) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalRos2Parser.g:3582:4: otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) )
                    {
                    otherlv_3=(Token)match(input,Default,FOLLOW_10);

                                    newLeafNode(otherlv_3, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_3_0());

                    // InternalRos2Parser.g:3586:4: ( (lv_default_4_0= ruleParameterList ) )
                    // InternalRos2Parser.g:3587:5: (lv_default_4_0= ruleParameterList )
                    {
                    // InternalRos2Parser.g:3587:5: (lv_default_4_0= ruleParameterList )
                    // InternalRos2Parser.g:3588:6: lv_default_4_0= ruleParameterList
                    {

                                            newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_3_1_0());

                    pushFollow(FOLLOW_13);
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
    // InternalRos2Parser.g:3614:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalRos2Parser.g:3614:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalRos2Parser.g:3615:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalRos2Parser.g:3621:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3627:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalRos2Parser.g:3628:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalRos2Parser.g:3628:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            // InternalRos2Parser.g:3629:3: () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalRos2Parser.g:3629:3: ()
            // InternalRos2Parser.g:3630:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_30);

                        newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1());

            // InternalRos2Parser.g:3640:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRos2Parser.g:3641:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRos2Parser.g:3641:4: (lv_value_2_0= ruleParameterValue )
            // InternalRos2Parser.g:3642:5: lv_value_2_0= ruleParameterValue
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

            // InternalRos2Parser.g:3659:3: (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==Comma) ) {
                    alt67=1;
                }


                switch (alt67) {
                case 1 :
                    // InternalRos2Parser.g:3660:4: otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) )
                    {
                    otherlv_3=(Token)match(input,Comma,FOLLOW_30);

                                    newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());

                    // InternalRos2Parser.g:3664:4: ( (lv_value_4_0= ruleParameterValue ) )
                    // InternalRos2Parser.g:3665:5: (lv_value_4_0= ruleParameterValue )
                    {
                    // InternalRos2Parser.g:3665:5: (lv_value_4_0= ruleParameterValue )
                    // InternalRos2Parser.g:3666:6: lv_value_4_0= ruleParameterValue
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
                    break loop67;
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
    // InternalRos2Parser.g:3692:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRos2Parser.g:3692:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRos2Parser.g:3693:2: iv_ruleParameterAny= ruleParameterAny EOF
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
    // InternalRos2Parser.g:3699:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3705:2: ( ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) )
            // InternalRos2Parser.g:3706:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            {
            // InternalRos2Parser.g:3706:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            // InternalRos2Parser.g:3707:3: () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            {
            // InternalRos2Parser.g:3707:3: ()
            // InternalRos2Parser.g:3708:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
                                current);


            }

            otherlv_1=(Token)match(input,ParameterAny,FOLLOW_60);

                        newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());

            // InternalRos2Parser.g:3718:3: (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==Value) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalRos2Parser.g:3719:4: otherlv_2= Value ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Value,FOLLOW_6);

                                    newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getValueKeyword_2_0());

                    // InternalRos2Parser.g:3723:4: ( (lv_value_3_0= ruleEString ) )
                    // InternalRos2Parser.g:3724:5: (lv_value_3_0= ruleEString )
                    {
                    // InternalRos2Parser.g:3724:5: (lv_value_3_0= ruleEString )
                    // InternalRos2Parser.g:3725:6: lv_value_3_0= ruleEString
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
    // InternalRos2Parser.g:3747:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRos2Parser.g:3747:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRos2Parser.g:3748:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalRos2Parser.g:3754:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3760:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRos2Parser.g:3761:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRos2Parser.g:3761:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRos2Parser.g:3762:3: (lv_value_0_0= ruleEString )
            {
            // InternalRos2Parser.g:3762:3: (lv_value_0_0= ruleEString )
            // InternalRos2Parser.g:3763:4: lv_value_0_0= ruleEString
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
    // InternalRos2Parser.g:3783:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRos2Parser.g:3783:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRos2Parser.g:3784:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalRos2Parser.g:3790:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3796:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalRos2Parser.g:3797:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalRos2Parser.g:3797:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalRos2Parser.g:3798:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalRos2Parser.g:3798:3: (lv_value_0_0= ruleBase64Binary )
            // InternalRos2Parser.g:3799:4: lv_value_0_0= ruleBase64Binary
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
    // InternalRos2Parser.g:3819:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRos2Parser.g:3819:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRos2Parser.g:3820:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalRos2Parser.g:3826:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3832:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalRos2Parser.g:3833:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalRos2Parser.g:3833:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalRos2Parser.g:3834:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalRos2Parser.g:3834:3: (lv_value_0_0= ruleInteger0 )
            // InternalRos2Parser.g:3835:4: lv_value_0_0= ruleInteger0
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
    // InternalRos2Parser.g:3855:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRos2Parser.g:3855:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRos2Parser.g:3856:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalRos2Parser.g:3862:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3868:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalRos2Parser.g:3869:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalRos2Parser.g:3869:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalRos2Parser.g:3870:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalRos2Parser.g:3870:3: (lv_value_0_0= ruleDouble0 )
            // InternalRos2Parser.g:3871:4: lv_value_0_0= ruleDouble0
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
    // InternalRos2Parser.g:3891:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRos2Parser.g:3891:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRos2Parser.g:3892:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalRos2Parser.g:3898:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:3904:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalRos2Parser.g:3905:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalRos2Parser.g:3905:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalRos2Parser.g:3906:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalRos2Parser.g:3906:3: (lv_value_0_0= ruleboolean0 )
            // InternalRos2Parser.g:3907:4: lv_value_0_0= ruleboolean0
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
    // InternalRos2Parser.g:3927:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRos2Parser.g:3927:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRos2Parser.g:3928:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalRos2Parser.g:3934:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? ) ;
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
            // InternalRos2Parser.g:3940:2: ( ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? ) )
            // InternalRos2Parser.g:3941:2: ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? )
            {
            // InternalRos2Parser.g:3941:2: ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? )
            // InternalRos2Parser.g:3942:3: () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )?
            {
            // InternalRos2Parser.g:3942:3: ()
            // InternalRos2Parser.g:3943:4:
            {

                            current = forceCreateModelElement(
                                grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
                                current);


            }

            // InternalRos2Parser.g:3949:3: (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==LeftSquareBracket) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalRos2Parser.g:3950:4: otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_6);

                                    newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0());

                    // InternalRos2Parser.g:3954:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalRos2Parser.g:3955:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalRos2Parser.g:3955:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalRos2Parser.g:3956:6: lv_value_2_0= ruleParameterStructMember
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
                                                "de.fraunhofer.ipa.ros.Basics.ParameterStructMember");
                                            afterParserOrEnumRuleCall();


                    }


                    }

                    // InternalRos2Parser.g:3973:4: (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==Comma) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                        case 1 :
                            // InternalRos2Parser.g:3974:5: otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket
                            {
                            otherlv_3=(Token)match(input,Comma,FOLLOW_10);

                                                newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());

                            otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_6);

                                                newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_2_1());

                            // InternalRos2Parser.g:3982:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                            // InternalRos2Parser.g:3983:6: (lv_value_5_0= ruleParameterStructMember )
                            {
                            // InternalRos2Parser.g:3983:6: (lv_value_5_0= ruleParameterStructMember )
                            // InternalRos2Parser.g:3984:7: lv_value_5_0= ruleParameterStructMember
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
                                                            "de.fraunhofer.ipa.ros.Basics.ParameterStructMember");
                                                        afterParserOrEnumRuleCall();


                            }


                            }

                            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_12);

                                                newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_2_3());


                            }
                            break;

                        default :
                            break loop69;
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
    // InternalRos2Parser.g:4015:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRos2Parser.g:4015:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRos2Parser.g:4016:2: iv_ruleParameterDate= ruleParameterDate EOF
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
    // InternalRos2Parser.g:4022:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:4028:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalRos2Parser.g:4029:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalRos2Parser.g:4029:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalRos2Parser.g:4030:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalRos2Parser.g:4030:3: (lv_value_0_0= ruleDateTime0 )
            // InternalRos2Parser.g:4031:4: lv_value_0_0= ruleDateTime0
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
    // InternalRos2Parser.g:4051:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRos2Parser.g:4051:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRos2Parser.g:4052:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalRos2Parser.g:4058:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:4064:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END ) )
            // InternalRos2Parser.g:4065:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END )
            {
            // InternalRos2Parser.g:4065:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END )
            // InternalRos2Parser.g:4066:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END
            {
            // InternalRos2Parser.g:4066:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRos2Parser.g:4067:4: (lv_name_0_0= ruleEString )
            {
            // InternalRos2Parser.g:4067:4: (lv_name_0_0= ruleEString )
            // InternalRos2Parser.g:4068:5: lv_name_0_0= ruleEString
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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_30);

                        newLeafNode(this_BEGIN_2, grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_2());

            // InternalRos2Parser.g:4093:3: ( (lv_value_3_0= ruleParameterValue ) )
            // InternalRos2Parser.g:4094:4: (lv_value_3_0= ruleParameterValue )
            {
            // InternalRos2Parser.g:4094:4: (lv_value_3_0= ruleParameterValue )
            // InternalRos2Parser.g:4095:5: lv_value_3_0= ruleParameterValue
            {

                                newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());

            pushFollow(FOLLOW_13);
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
    // InternalRos2Parser.g:4120:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRos2Parser.g:4120:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRos2Parser.g:4121:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
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
    // InternalRos2Parser.g:4127:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:4133:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalRos2Parser.g:4134:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalRos2Parser.g:4134:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalRos2Parser.g:4135:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalRos2Parser.g:4135:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRos2Parser.g:4136:4: (lv_name_0_0= ruleEString )
            {
            // InternalRos2Parser.g:4136:4: (lv_name_0_0= ruleEString )
            // InternalRos2Parser.g:4137:5: lv_name_0_0= ruleEString
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

            // InternalRos2Parser.g:4154:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalRos2Parser.g:4155:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalRos2Parser.g:4155:4: (lv_type_1_0= ruleParameterType )
            // InternalRos2Parser.g:4156:5: lv_type_1_0= ruleParameterType
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
    // InternalRos2Parser.g:4177:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRos2Parser.g:4177:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRos2Parser.g:4178:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalRos2Parser.g:4184:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4190:2: (this_BINARY_0= RULE_BINARY )
            // InternalRos2Parser.g:4191:2: this_BINARY_0= RULE_BINARY
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
    // InternalRos2Parser.g:4201:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalRos2Parser.g:4201:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalRos2Parser.g:4202:2: iv_ruleboolean0= ruleboolean0 EOF
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
    // InternalRos2Parser.g:4208:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4214:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalRos2Parser.g:4215:2: this_BOOLEAN_0= RULE_BOOLEAN
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
    // InternalRos2Parser.g:4225:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalRos2Parser.g:4225:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalRos2Parser.g:4226:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalRos2Parser.g:4232:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4238:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalRos2Parser.g:4239:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalRos2Parser.g:4249:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalRos2Parser.g:4249:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalRos2Parser.g:4250:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalRos2Parser.g:4256:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4262:2: (this_DECINT_0= RULE_DECINT )
            // InternalRos2Parser.g:4263:2: this_DECINT_0= RULE_DECINT
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
    // InternalRos2Parser.g:4273:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalRos2Parser.g:4273:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalRos2Parser.g:4274:2: iv_ruleDateTime0= ruleDateTime0 EOF
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
    // InternalRos2Parser.g:4280:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4286:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalRos2Parser.g:4287:2: this_DATE_TIME_0= RULE_DATE_TIME
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
    // InternalRos2Parser.g:4297:1: entryRuleMessagePart returns [EObject current=null] : iv_ruleMessagePart= ruleMessagePart EOF ;
    public final EObject entryRuleMessagePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessagePart = null;


        try {
            // InternalRos2Parser.g:4297:52: (iv_ruleMessagePart= ruleMessagePart EOF )
            // InternalRos2Parser.g:4298:2: iv_ruleMessagePart= ruleMessagePart EOF
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
    // InternalRos2Parser.g:4304:1: ruleMessagePart returns [EObject current=null] : ( ( ( (lv_Data_0_1= ruleKEYWORD | lv_Data_0_2= RULE_MESSAGE_ASIGMENT | lv_Data_0_3= ruleEString ) ) ) otherlv_1= Colon ( (lv_Type_2_0= ruleAbstractType ) ) ) ;
    public final EObject ruleMessagePart() throws RecognitionException {
        EObject current = null;

        Token lv_Data_0_2=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_Data_0_1 = null;

        AntlrDatatypeRuleToken lv_Data_0_3 = null;

        EObject lv_Type_2_0 = null;



            enterRule();

        try {
            // InternalRos2Parser.g:4310:2: ( ( ( ( (lv_Data_0_1= ruleKEYWORD | lv_Data_0_2= RULE_MESSAGE_ASIGMENT | lv_Data_0_3= ruleEString ) ) ) otherlv_1= Colon ( (lv_Type_2_0= ruleAbstractType ) ) ) )
            // InternalRos2Parser.g:4311:2: ( ( ( (lv_Data_0_1= ruleKEYWORD | lv_Data_0_2= RULE_MESSAGE_ASIGMENT | lv_Data_0_3= ruleEString ) ) ) otherlv_1= Colon ( (lv_Type_2_0= ruleAbstractType ) ) )
            {
            // InternalRos2Parser.g:4311:2: ( ( ( (lv_Data_0_1= ruleKEYWORD | lv_Data_0_2= RULE_MESSAGE_ASIGMENT | lv_Data_0_3= ruleEString ) ) ) otherlv_1= Colon ( (lv_Type_2_0= ruleAbstractType ) ) )
            // InternalRos2Parser.g:4312:3: ( ( (lv_Data_0_1= ruleKEYWORD | lv_Data_0_2= RULE_MESSAGE_ASIGMENT | lv_Data_0_3= ruleEString ) ) ) otherlv_1= Colon ( (lv_Type_2_0= ruleAbstractType ) )
            {
            // InternalRos2Parser.g:4312:3: ( ( (lv_Data_0_1= ruleKEYWORD | lv_Data_0_2= RULE_MESSAGE_ASIGMENT | lv_Data_0_3= ruleEString ) ) )
            // InternalRos2Parser.g:4313:4: ( (lv_Data_0_1= ruleKEYWORD | lv_Data_0_2= RULE_MESSAGE_ASIGMENT | lv_Data_0_3= ruleEString ) )
            {
            // InternalRos2Parser.g:4313:4: ( (lv_Data_0_1= ruleKEYWORD | lv_Data_0_2= RULE_MESSAGE_ASIGMENT | lv_Data_0_3= ruleEString ) )
            // InternalRos2Parser.g:4314:5: (lv_Data_0_1= ruleKEYWORD | lv_Data_0_2= RULE_MESSAGE_ASIGMENT | lv_Data_0_3= ruleEString )
            {
            // InternalRos2Parser.g:4314:5: (lv_Data_0_1= ruleKEYWORD | lv_Data_0_2= RULE_MESSAGE_ASIGMENT | lv_Data_0_3= ruleEString )
            int alt71=3;
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
                alt71=1;
                }
                break;
            case RULE_MESSAGE_ASIGMENT:
                {
                alt71=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt71=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalRos2Parser.g:4315:6: lv_Data_0_1= ruleKEYWORD
                    {

                                            newCompositeNode(grammarAccess.getMessagePartAccess().getDataKEYWORDParserRuleCall_0_0_0());

                    pushFollow(FOLLOW_3);
                    lv_Data_0_1=ruleKEYWORD();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getMessagePartRule());
                                            }
                                            set(
                                                current,
                                                "Data",
                                                lv_Data_0_1,
                                                "de.fraunhofer.ipa.ros.Basics.KEYWORD");
                                            afterParserOrEnumRuleCall();


                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:4331:6: lv_Data_0_2= RULE_MESSAGE_ASIGMENT
                    {
                    lv_Data_0_2=(Token)match(input,RULE_MESSAGE_ASIGMENT,FOLLOW_3);

                                            newLeafNode(lv_Data_0_2, grammarAccess.getMessagePartAccess().getDataMESSAGE_ASIGMENTTerminalRuleCall_0_0_1());


                                            if (current==null) {
                                                current = createModelElement(grammarAccess.getMessagePartRule());
                                            }
                                            setWithLastConsumed(
                                                current,
                                                "Data",
                                                lv_Data_0_2,
                                                "de.fraunhofer.ipa.ros.Basics.MESSAGE_ASIGMENT");


                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:4346:6: lv_Data_0_3= ruleEString
                    {

                                            newCompositeNode(grammarAccess.getMessagePartAccess().getDataEStringParserRuleCall_0_0_2());

                    pushFollow(FOLLOW_3);
                    lv_Data_0_3=ruleEString();

                    state._fsp--;


                                            if (current==null) {
                                                current = createModelElementForParent(grammarAccess.getMessagePartRule());
                                            }
                                            set(
                                                current,
                                                "Data",
                                                lv_Data_0_3,
                                                "de.fraunhofer.ipa.ros.Basics.EString");
                                            afterParserOrEnumRuleCall();


                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_62);

                        newLeafNode(otherlv_1, grammarAccess.getMessagePartAccess().getColonKeyword_1());

            // InternalRos2Parser.g:4368:3: ( (lv_Type_2_0= ruleAbstractType ) )
            // InternalRos2Parser.g:4369:4: (lv_Type_2_0= ruleAbstractType )
            {
            // InternalRos2Parser.g:4369:4: (lv_Type_2_0= ruleAbstractType )
            // InternalRos2Parser.g:4370:5: lv_Type_2_0= ruleAbstractType
            {

                                newCompositeNode(grammarAccess.getMessagePartAccess().getTypeAbstractTypeParserRuleCall_2_0());

            pushFollow(FOLLOW_2);
            lv_Type_2_0=ruleAbstractType();

            state._fsp--;


                                if (current==null) {
                                    current = createModelElementForParent(grammarAccess.getMessagePartRule());
                                }
                                set(
                                    current,
                                    "Type",
                                    lv_Type_2_0,
                                    "de.fraunhofer.ipa.ros.Basics.AbstractType");
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
    // $ANTLR end "ruleMessagePart"


    // $ANTLR start "entryRuleAbstractType"
    // InternalRos2Parser.g:4391:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalRos2Parser.g:4391:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalRos2Parser.g:4392:2: iv_ruleAbstractType= ruleAbstractType EOF
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
    // InternalRos2Parser.g:4398:1: ruleAbstractType returns [EObject current=null] : (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef ) ;
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
            // InternalRos2Parser.g:4404:2: ( (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef ) )
            // InternalRos2Parser.g:4405:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )
            {
            // InternalRos2Parser.g:4405:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )
            int alt72=31;
            switch ( input.LA(1) ) {
            case Bool:
                {
                alt72=1;
                }
                break;
            case Int8:
                {
                alt72=2;
                }
                break;
            case Uint8:
                {
                alt72=3;
                }
                break;
            case Int16:
                {
                alt72=4;
                }
                break;
            case Uint16:
                {
                alt72=5;
                }
                break;
            case Int32:
                {
                alt72=6;
                }
                break;
            case Uint32:
                {
                alt72=7;
                }
                break;
            case Int64:
                {
                alt72=8;
                }
                break;
            case Uint64:
                {
                alt72=9;
                }
                break;
            case Float32:
                {
                alt72=10;
                }
                break;
            case Float64:
                {
                alt72=11;
                }
                break;
            case String_1:
                {
                alt72=12;
                }
                break;
            case Byte:
                {
                alt72=13;
                }
                break;
            case Time:
                {
                alt72=14;
                }
                break;
            case Duration:
                {
                alt72=15;
                }
                break;
            case Header:
                {
                alt72=16;
                }
                break;
            case Bool_1:
                {
                alt72=17;
                }
                break;
            case Int8_1:
                {
                alt72=18;
                }
                break;
            case Uint8_1:
                {
                alt72=19;
                }
                break;
            case Int16_1:
                {
                alt72=20;
                }
                break;
            case Uint16_1:
                {
                alt72=21;
                }
                break;
            case Int32_1:
                {
                alt72=22;
                }
                break;
            case Uint32_1:
                {
                alt72=23;
                }
                break;
            case Int64_1:
                {
                alt72=24;
                }
                break;
            case Uint64_1:
                {
                alt72=25;
                }
                break;
            case Float32_1:
                {
                alt72=26;
                }
                break;
            case Float64_1:
                {
                alt72=27;
                }
                break;
            case String_2:
                {
                alt72=28;
                }
                break;
            case Byte_1:
                {
                alt72=29;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt72=30;
                }
                break;
            case LeftSquareBracket:
                {
                alt72=31;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalRos2Parser.g:4406:3: this_bool_0= rulebool
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
                    // InternalRos2Parser.g:4415:3: this_int8_1= ruleint8
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
                    // InternalRos2Parser.g:4424:3: this_uint8_2= ruleuint8
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
                    // InternalRos2Parser.g:4433:3: this_int16_3= ruleint16
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
                    // InternalRos2Parser.g:4442:3: this_uint16_4= ruleuint16
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
                    // InternalRos2Parser.g:4451:3: this_int32_5= ruleint32
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
                    // InternalRos2Parser.g:4460:3: this_uint32_6= ruleuint32
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
                    // InternalRos2Parser.g:4469:3: this_int64_7= ruleint64
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
                    // InternalRos2Parser.g:4478:3: this_uint64_8= ruleuint64
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
                    // InternalRos2Parser.g:4487:3: this_float32_9= rulefloat32
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
                    // InternalRos2Parser.g:4496:3: this_float64_10= rulefloat64
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
                    // InternalRos2Parser.g:4505:3: this_string0_11= rulestring0
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
                    // InternalRos2Parser.g:4514:3: this_byte_12= rulebyte
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
                    // InternalRos2Parser.g:4523:3: this_time_13= ruletime
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
                    // InternalRos2Parser.g:4532:3: this_duration_14= ruleduration
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
                    // InternalRos2Parser.g:4541:3: this_Header_15= ruleHeader
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
                    // InternalRos2Parser.g:4550:3: this_boolArray_16= ruleboolArray
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
                    // InternalRos2Parser.g:4559:3: this_int8Array_17= ruleint8Array
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
                    // InternalRos2Parser.g:4568:3: this_uint8Array_18= ruleuint8Array
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
                    // InternalRos2Parser.g:4577:3: this_int16Array_19= ruleint16Array
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
                    // InternalRos2Parser.g:4586:3: this_uint16Array_20= ruleuint16Array
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
                    // InternalRos2Parser.g:4595:3: this_int32Array_21= ruleint32Array
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
                    // InternalRos2Parser.g:4604:3: this_uint32Array_22= ruleuint32Array
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
                    // InternalRos2Parser.g:4613:3: this_int64Array_23= ruleint64Array
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
                    // InternalRos2Parser.g:4622:3: this_uint64Array_24= ruleuint64Array
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
                    // InternalRos2Parser.g:4631:3: this_float32Array_25= rulefloat32Array
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
                    // InternalRos2Parser.g:4640:3: this_float64Array_26= rulefloat64Array
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
                    // InternalRos2Parser.g:4649:3: this_string0Array_27= rulestring0Array
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
                    // InternalRos2Parser.g:4658:3: this_byteArray_28= rulebyteArray
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
                    // InternalRos2Parser.g:4667:3: this_TopicSpecRef_29= ruleTopicSpecRef
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
                    // InternalRos2Parser.g:4676:3: this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef
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
    // InternalRos2Parser.g:4688:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalRos2Parser.g:4688:45: (iv_rulebool= rulebool EOF )
            // InternalRos2Parser.g:4689:2: iv_rulebool= rulebool EOF
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
    // InternalRos2Parser.g:4695:1: rulebool returns [EObject current=null] : ( () otherlv_1= Bool ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4701:2: ( ( () otherlv_1= Bool ) )
            // InternalRos2Parser.g:4702:2: ( () otherlv_1= Bool )
            {
            // InternalRos2Parser.g:4702:2: ( () otherlv_1= Bool )
            // InternalRos2Parser.g:4703:3: () otherlv_1= Bool
            {
            // InternalRos2Parser.g:4703:3: ()
            // InternalRos2Parser.g:4704:4:
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
    // InternalRos2Parser.g:4718:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalRos2Parser.g:4718:45: (iv_ruleint8= ruleint8 EOF )
            // InternalRos2Parser.g:4719:2: iv_ruleint8= ruleint8 EOF
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
    // InternalRos2Parser.g:4725:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= Int8 ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4731:2: ( ( () otherlv_1= Int8 ) )
            // InternalRos2Parser.g:4732:2: ( () otherlv_1= Int8 )
            {
            // InternalRos2Parser.g:4732:2: ( () otherlv_1= Int8 )
            // InternalRos2Parser.g:4733:3: () otherlv_1= Int8
            {
            // InternalRos2Parser.g:4733:3: ()
            // InternalRos2Parser.g:4734:4:
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
    // InternalRos2Parser.g:4748:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalRos2Parser.g:4748:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalRos2Parser.g:4749:2: iv_ruleuint8= ruleuint8 EOF
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
    // InternalRos2Parser.g:4755:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= Uint8 ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4761:2: ( ( () otherlv_1= Uint8 ) )
            // InternalRos2Parser.g:4762:2: ( () otherlv_1= Uint8 )
            {
            // InternalRos2Parser.g:4762:2: ( () otherlv_1= Uint8 )
            // InternalRos2Parser.g:4763:3: () otherlv_1= Uint8
            {
            // InternalRos2Parser.g:4763:3: ()
            // InternalRos2Parser.g:4764:4:
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
    // InternalRos2Parser.g:4778:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalRos2Parser.g:4778:46: (iv_ruleint16= ruleint16 EOF )
            // InternalRos2Parser.g:4779:2: iv_ruleint16= ruleint16 EOF
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
    // InternalRos2Parser.g:4785:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= Int16 ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4791:2: ( ( () otherlv_1= Int16 ) )
            // InternalRos2Parser.g:4792:2: ( () otherlv_1= Int16 )
            {
            // InternalRos2Parser.g:4792:2: ( () otherlv_1= Int16 )
            // InternalRos2Parser.g:4793:3: () otherlv_1= Int16
            {
            // InternalRos2Parser.g:4793:3: ()
            // InternalRos2Parser.g:4794:4:
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
    // InternalRos2Parser.g:4808:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalRos2Parser.g:4808:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalRos2Parser.g:4809:2: iv_ruleuint16= ruleuint16 EOF
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
    // InternalRos2Parser.g:4815:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= Uint16 ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4821:2: ( ( () otherlv_1= Uint16 ) )
            // InternalRos2Parser.g:4822:2: ( () otherlv_1= Uint16 )
            {
            // InternalRos2Parser.g:4822:2: ( () otherlv_1= Uint16 )
            // InternalRos2Parser.g:4823:3: () otherlv_1= Uint16
            {
            // InternalRos2Parser.g:4823:3: ()
            // InternalRos2Parser.g:4824:4:
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
    // InternalRos2Parser.g:4838:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalRos2Parser.g:4838:46: (iv_ruleint32= ruleint32 EOF )
            // InternalRos2Parser.g:4839:2: iv_ruleint32= ruleint32 EOF
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
    // InternalRos2Parser.g:4845:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= Int32 ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4851:2: ( ( () otherlv_1= Int32 ) )
            // InternalRos2Parser.g:4852:2: ( () otherlv_1= Int32 )
            {
            // InternalRos2Parser.g:4852:2: ( () otherlv_1= Int32 )
            // InternalRos2Parser.g:4853:3: () otherlv_1= Int32
            {
            // InternalRos2Parser.g:4853:3: ()
            // InternalRos2Parser.g:4854:4:
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
    // InternalRos2Parser.g:4868:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalRos2Parser.g:4868:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalRos2Parser.g:4869:2: iv_ruleuint32= ruleuint32 EOF
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
    // InternalRos2Parser.g:4875:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= Uint32 ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4881:2: ( ( () otherlv_1= Uint32 ) )
            // InternalRos2Parser.g:4882:2: ( () otherlv_1= Uint32 )
            {
            // InternalRos2Parser.g:4882:2: ( () otherlv_1= Uint32 )
            // InternalRos2Parser.g:4883:3: () otherlv_1= Uint32
            {
            // InternalRos2Parser.g:4883:3: ()
            // InternalRos2Parser.g:4884:4:
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
    // InternalRos2Parser.g:4898:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalRos2Parser.g:4898:46: (iv_ruleint64= ruleint64 EOF )
            // InternalRos2Parser.g:4899:2: iv_ruleint64= ruleint64 EOF
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
    // InternalRos2Parser.g:4905:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= Int64 ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4911:2: ( ( () otherlv_1= Int64 ) )
            // InternalRos2Parser.g:4912:2: ( () otherlv_1= Int64 )
            {
            // InternalRos2Parser.g:4912:2: ( () otherlv_1= Int64 )
            // InternalRos2Parser.g:4913:3: () otherlv_1= Int64
            {
            // InternalRos2Parser.g:4913:3: ()
            // InternalRos2Parser.g:4914:4:
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
    // InternalRos2Parser.g:4928:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalRos2Parser.g:4928:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalRos2Parser.g:4929:2: iv_ruleuint64= ruleuint64 EOF
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
    // InternalRos2Parser.g:4935:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= Uint64 ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4941:2: ( ( () otherlv_1= Uint64 ) )
            // InternalRos2Parser.g:4942:2: ( () otherlv_1= Uint64 )
            {
            // InternalRos2Parser.g:4942:2: ( () otherlv_1= Uint64 )
            // InternalRos2Parser.g:4943:3: () otherlv_1= Uint64
            {
            // InternalRos2Parser.g:4943:3: ()
            // InternalRos2Parser.g:4944:4:
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
    // InternalRos2Parser.g:4958:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalRos2Parser.g:4958:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalRos2Parser.g:4959:2: iv_rulefloat32= rulefloat32 EOF
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
    // InternalRos2Parser.g:4965:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= Float32 ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:4971:2: ( ( () otherlv_1= Float32 ) )
            // InternalRos2Parser.g:4972:2: ( () otherlv_1= Float32 )
            {
            // InternalRos2Parser.g:4972:2: ( () otherlv_1= Float32 )
            // InternalRos2Parser.g:4973:3: () otherlv_1= Float32
            {
            // InternalRos2Parser.g:4973:3: ()
            // InternalRos2Parser.g:4974:4:
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
    // InternalRos2Parser.g:4988:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalRos2Parser.g:4988:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalRos2Parser.g:4989:2: iv_rulefloat64= rulefloat64 EOF
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
    // InternalRos2Parser.g:4995:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= Float64 ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5001:2: ( ( () otherlv_1= Float64 ) )
            // InternalRos2Parser.g:5002:2: ( () otherlv_1= Float64 )
            {
            // InternalRos2Parser.g:5002:2: ( () otherlv_1= Float64 )
            // InternalRos2Parser.g:5003:3: () otherlv_1= Float64
            {
            // InternalRos2Parser.g:5003:3: ()
            // InternalRos2Parser.g:5004:4:
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
    // InternalRos2Parser.g:5018:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalRos2Parser.g:5018:48: (iv_rulestring0= rulestring0 EOF )
            // InternalRos2Parser.g:5019:2: iv_rulestring0= rulestring0 EOF
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
    // InternalRos2Parser.g:5025:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= String_1 ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5031:2: ( ( () otherlv_1= String_1 ) )
            // InternalRos2Parser.g:5032:2: ( () otherlv_1= String_1 )
            {
            // InternalRos2Parser.g:5032:2: ( () otherlv_1= String_1 )
            // InternalRos2Parser.g:5033:3: () otherlv_1= String_1
            {
            // InternalRos2Parser.g:5033:3: ()
            // InternalRos2Parser.g:5034:4:
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
    // InternalRos2Parser.g:5048:1: entryRulebyte returns [EObject current=null] : iv_rulebyte= rulebyte EOF ;
    public final EObject entryRulebyte() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyte = null;


        try {
            // InternalRos2Parser.g:5048:45: (iv_rulebyte= rulebyte EOF )
            // InternalRos2Parser.g:5049:2: iv_rulebyte= rulebyte EOF
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
    // InternalRos2Parser.g:5055:1: rulebyte returns [EObject current=null] : ( () otherlv_1= Byte ) ;
    public final EObject rulebyte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5061:2: ( ( () otherlv_1= Byte ) )
            // InternalRos2Parser.g:5062:2: ( () otherlv_1= Byte )
            {
            // InternalRos2Parser.g:5062:2: ( () otherlv_1= Byte )
            // InternalRos2Parser.g:5063:3: () otherlv_1= Byte
            {
            // InternalRos2Parser.g:5063:3: ()
            // InternalRos2Parser.g:5064:4:
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
    // InternalRos2Parser.g:5078:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalRos2Parser.g:5078:45: (iv_ruletime= ruletime EOF )
            // InternalRos2Parser.g:5079:2: iv_ruletime= ruletime EOF
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
    // InternalRos2Parser.g:5085:1: ruletime returns [EObject current=null] : ( () otherlv_1= Time ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5091:2: ( ( () otherlv_1= Time ) )
            // InternalRos2Parser.g:5092:2: ( () otherlv_1= Time )
            {
            // InternalRos2Parser.g:5092:2: ( () otherlv_1= Time )
            // InternalRos2Parser.g:5093:3: () otherlv_1= Time
            {
            // InternalRos2Parser.g:5093:3: ()
            // InternalRos2Parser.g:5094:4:
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
    // InternalRos2Parser.g:5108:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalRos2Parser.g:5108:49: (iv_ruleduration= ruleduration EOF )
            // InternalRos2Parser.g:5109:2: iv_ruleduration= ruleduration EOF
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
    // InternalRos2Parser.g:5115:1: ruleduration returns [EObject current=null] : ( () otherlv_1= Duration ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5121:2: ( ( () otherlv_1= Duration ) )
            // InternalRos2Parser.g:5122:2: ( () otherlv_1= Duration )
            {
            // InternalRos2Parser.g:5122:2: ( () otherlv_1= Duration )
            // InternalRos2Parser.g:5123:3: () otherlv_1= Duration
            {
            // InternalRos2Parser.g:5123:3: ()
            // InternalRos2Parser.g:5124:4:
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
    // InternalRos2Parser.g:5138:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalRos2Parser.g:5138:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalRos2Parser.g:5139:2: iv_ruleboolArray= ruleboolArray EOF
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
    // InternalRos2Parser.g:5145:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= Bool_1 ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5151:2: ( ( () otherlv_1= Bool_1 ) )
            // InternalRos2Parser.g:5152:2: ( () otherlv_1= Bool_1 )
            {
            // InternalRos2Parser.g:5152:2: ( () otherlv_1= Bool_1 )
            // InternalRos2Parser.g:5153:3: () otherlv_1= Bool_1
            {
            // InternalRos2Parser.g:5153:3: ()
            // InternalRos2Parser.g:5154:4:
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
    // InternalRos2Parser.g:5168:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalRos2Parser.g:5168:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalRos2Parser.g:5169:2: iv_ruleint8Array= ruleint8Array EOF
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
    // InternalRos2Parser.g:5175:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= Int8_1 ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5181:2: ( ( () otherlv_1= Int8_1 ) )
            // InternalRos2Parser.g:5182:2: ( () otherlv_1= Int8_1 )
            {
            // InternalRos2Parser.g:5182:2: ( () otherlv_1= Int8_1 )
            // InternalRos2Parser.g:5183:3: () otherlv_1= Int8_1
            {
            // InternalRos2Parser.g:5183:3: ()
            // InternalRos2Parser.g:5184:4:
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
    // InternalRos2Parser.g:5198:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalRos2Parser.g:5198:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalRos2Parser.g:5199:2: iv_ruleuint8Array= ruleuint8Array EOF
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
    // InternalRos2Parser.g:5205:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= Uint8_1 ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5211:2: ( ( () otherlv_1= Uint8_1 ) )
            // InternalRos2Parser.g:5212:2: ( () otherlv_1= Uint8_1 )
            {
            // InternalRos2Parser.g:5212:2: ( () otherlv_1= Uint8_1 )
            // InternalRos2Parser.g:5213:3: () otherlv_1= Uint8_1
            {
            // InternalRos2Parser.g:5213:3: ()
            // InternalRos2Parser.g:5214:4:
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
    // InternalRos2Parser.g:5228:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalRos2Parser.g:5228:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalRos2Parser.g:5229:2: iv_ruleint16Array= ruleint16Array EOF
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
    // InternalRos2Parser.g:5235:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= Int16_1 ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5241:2: ( ( () otherlv_1= Int16_1 ) )
            // InternalRos2Parser.g:5242:2: ( () otherlv_1= Int16_1 )
            {
            // InternalRos2Parser.g:5242:2: ( () otherlv_1= Int16_1 )
            // InternalRos2Parser.g:5243:3: () otherlv_1= Int16_1
            {
            // InternalRos2Parser.g:5243:3: ()
            // InternalRos2Parser.g:5244:4:
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
    // InternalRos2Parser.g:5258:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalRos2Parser.g:5258:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalRos2Parser.g:5259:2: iv_ruleuint16Array= ruleuint16Array EOF
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
    // InternalRos2Parser.g:5265:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= Uint16_1 ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5271:2: ( ( () otherlv_1= Uint16_1 ) )
            // InternalRos2Parser.g:5272:2: ( () otherlv_1= Uint16_1 )
            {
            // InternalRos2Parser.g:5272:2: ( () otherlv_1= Uint16_1 )
            // InternalRos2Parser.g:5273:3: () otherlv_1= Uint16_1
            {
            // InternalRos2Parser.g:5273:3: ()
            // InternalRos2Parser.g:5274:4:
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
    // InternalRos2Parser.g:5288:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalRos2Parser.g:5288:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalRos2Parser.g:5289:2: iv_ruleint32Array= ruleint32Array EOF
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
    // InternalRos2Parser.g:5295:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= Int32_1 ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5301:2: ( ( () otherlv_1= Int32_1 ) )
            // InternalRos2Parser.g:5302:2: ( () otherlv_1= Int32_1 )
            {
            // InternalRos2Parser.g:5302:2: ( () otherlv_1= Int32_1 )
            // InternalRos2Parser.g:5303:3: () otherlv_1= Int32_1
            {
            // InternalRos2Parser.g:5303:3: ()
            // InternalRos2Parser.g:5304:4:
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
    // InternalRos2Parser.g:5318:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalRos2Parser.g:5318:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalRos2Parser.g:5319:2: iv_ruleuint32Array= ruleuint32Array EOF
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
    // InternalRos2Parser.g:5325:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= Uint32_1 ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5331:2: ( ( () otherlv_1= Uint32_1 ) )
            // InternalRos2Parser.g:5332:2: ( () otherlv_1= Uint32_1 )
            {
            // InternalRos2Parser.g:5332:2: ( () otherlv_1= Uint32_1 )
            // InternalRos2Parser.g:5333:3: () otherlv_1= Uint32_1
            {
            // InternalRos2Parser.g:5333:3: ()
            // InternalRos2Parser.g:5334:4:
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
    // InternalRos2Parser.g:5348:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalRos2Parser.g:5348:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalRos2Parser.g:5349:2: iv_ruleint64Array= ruleint64Array EOF
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
    // InternalRos2Parser.g:5355:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= Int64_1 ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5361:2: ( ( () otherlv_1= Int64_1 ) )
            // InternalRos2Parser.g:5362:2: ( () otherlv_1= Int64_1 )
            {
            // InternalRos2Parser.g:5362:2: ( () otherlv_1= Int64_1 )
            // InternalRos2Parser.g:5363:3: () otherlv_1= Int64_1
            {
            // InternalRos2Parser.g:5363:3: ()
            // InternalRos2Parser.g:5364:4:
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
    // InternalRos2Parser.g:5378:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalRos2Parser.g:5378:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalRos2Parser.g:5379:2: iv_ruleuint64Array= ruleuint64Array EOF
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
    // InternalRos2Parser.g:5385:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= Uint64_1 ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5391:2: ( ( () otherlv_1= Uint64_1 ) )
            // InternalRos2Parser.g:5392:2: ( () otherlv_1= Uint64_1 )
            {
            // InternalRos2Parser.g:5392:2: ( () otherlv_1= Uint64_1 )
            // InternalRos2Parser.g:5393:3: () otherlv_1= Uint64_1
            {
            // InternalRos2Parser.g:5393:3: ()
            // InternalRos2Parser.g:5394:4:
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
    // InternalRos2Parser.g:5408:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalRos2Parser.g:5408:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalRos2Parser.g:5409:2: iv_rulefloat32Array= rulefloat32Array EOF
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
    // InternalRos2Parser.g:5415:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= Float32_1 ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5421:2: ( ( () otherlv_1= Float32_1 ) )
            // InternalRos2Parser.g:5422:2: ( () otherlv_1= Float32_1 )
            {
            // InternalRos2Parser.g:5422:2: ( () otherlv_1= Float32_1 )
            // InternalRos2Parser.g:5423:3: () otherlv_1= Float32_1
            {
            // InternalRos2Parser.g:5423:3: ()
            // InternalRos2Parser.g:5424:4:
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
    // InternalRos2Parser.g:5438:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalRos2Parser.g:5438:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalRos2Parser.g:5439:2: iv_rulefloat64Array= rulefloat64Array EOF
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
    // InternalRos2Parser.g:5445:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= Float64_1 ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5451:2: ( ( () otherlv_1= Float64_1 ) )
            // InternalRos2Parser.g:5452:2: ( () otherlv_1= Float64_1 )
            {
            // InternalRos2Parser.g:5452:2: ( () otherlv_1= Float64_1 )
            // InternalRos2Parser.g:5453:3: () otherlv_1= Float64_1
            {
            // InternalRos2Parser.g:5453:3: ()
            // InternalRos2Parser.g:5454:4:
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
    // InternalRos2Parser.g:5468:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalRos2Parser.g:5468:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalRos2Parser.g:5469:2: iv_rulestring0Array= rulestring0Array EOF
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
    // InternalRos2Parser.g:5475:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= String_2 ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5481:2: ( ( () otherlv_1= String_2 ) )
            // InternalRos2Parser.g:5482:2: ( () otherlv_1= String_2 )
            {
            // InternalRos2Parser.g:5482:2: ( () otherlv_1= String_2 )
            // InternalRos2Parser.g:5483:3: () otherlv_1= String_2
            {
            // InternalRos2Parser.g:5483:3: ()
            // InternalRos2Parser.g:5484:4:
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
    // InternalRos2Parser.g:5498:1: entryRulebyteArray returns [EObject current=null] : iv_rulebyteArray= rulebyteArray EOF ;
    public final EObject entryRulebyteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyteArray = null;


        try {
            // InternalRos2Parser.g:5498:50: (iv_rulebyteArray= rulebyteArray EOF )
            // InternalRos2Parser.g:5499:2: iv_rulebyteArray= rulebyteArray EOF
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
    // InternalRos2Parser.g:5505:1: rulebyteArray returns [EObject current=null] : ( () otherlv_1= Byte_1 ) ;
    public final EObject rulebyteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5511:2: ( ( () otherlv_1= Byte_1 ) )
            // InternalRos2Parser.g:5512:2: ( () otherlv_1= Byte_1 )
            {
            // InternalRos2Parser.g:5512:2: ( () otherlv_1= Byte_1 )
            // InternalRos2Parser.g:5513:3: () otherlv_1= Byte_1
            {
            // InternalRos2Parser.g:5513:3: ()
            // InternalRos2Parser.g:5514:4:
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
    // InternalRos2Parser.g:5528:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRos2Parser.g:5528:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRos2Parser.g:5529:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalRos2Parser.g:5535:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= Header ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5541:2: ( ( () otherlv_1= Header ) )
            // InternalRos2Parser.g:5542:2: ( () otherlv_1= Header )
            {
            // InternalRos2Parser.g:5542:2: ( () otherlv_1= Header )
            // InternalRos2Parser.g:5543:3: () otherlv_1= Header
            {
            // InternalRos2Parser.g:5543:3: ()
            // InternalRos2Parser.g:5544:4:
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
    // InternalRos2Parser.g:5558:1: entryRuleTopicSpecRef returns [EObject current=null] : iv_ruleTopicSpecRef= ruleTopicSpecRef EOF ;
    public final EObject entryRuleTopicSpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpecRef = null;


        try {
            // InternalRos2Parser.g:5558:53: (iv_ruleTopicSpecRef= ruleTopicSpecRef EOF )
            // InternalRos2Parser.g:5559:2: iv_ruleTopicSpecRef= ruleTopicSpecRef EOF
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
    // InternalRos2Parser.g:5565:1: ruleTopicSpecRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleTopicSpecRef() throws RecognitionException {
        EObject current = null;


            enterRule();

        try {
            // InternalRos2Parser.g:5571:2: ( ( ( ruleEString ) ) )
            // InternalRos2Parser.g:5572:2: ( ( ruleEString ) )
            {
            // InternalRos2Parser.g:5572:2: ( ( ruleEString ) )
            // InternalRos2Parser.g:5573:3: ( ruleEString )
            {
            // InternalRos2Parser.g:5573:3: ( ruleEString )
            // InternalRos2Parser.g:5574:4: ruleEString
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
    // InternalRos2Parser.g:5591:1: entryRuleArrayTopicSpecRef returns [EObject current=null] : iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF ;
    public final EObject entryRuleArrayTopicSpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTopicSpecRef = null;


        try {
            // InternalRos2Parser.g:5591:58: (iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF )
            // InternalRos2Parser.g:5592:2: iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF
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
    // InternalRos2Parser.g:5598:1: ruleArrayTopicSpecRef returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( ( ruleEString ) ) otherlv_2= RightSquareBracket ) ;
    public final EObject ruleArrayTopicSpecRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5604:2: ( (otherlv_0= LeftSquareBracket ( ( ruleEString ) ) otherlv_2= RightSquareBracket ) )
            // InternalRos2Parser.g:5605:2: (otherlv_0= LeftSquareBracket ( ( ruleEString ) ) otherlv_2= RightSquareBracket )
            {
            // InternalRos2Parser.g:5605:2: (otherlv_0= LeftSquareBracket ( ( ruleEString ) ) otherlv_2= RightSquareBracket )
            // InternalRos2Parser.g:5606:3: otherlv_0= LeftSquareBracket ( ( ruleEString ) ) otherlv_2= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_6);

                        newLeafNode(otherlv_0, grammarAccess.getArrayTopicSpecRefAccess().getLeftSquareBracketKeyword_0());

            // InternalRos2Parser.g:5610:3: ( ( ruleEString ) )
            // InternalRos2Parser.g:5611:4: ( ruleEString )
            {
            // InternalRos2Parser.g:5611:4: ( ruleEString )
            // InternalRos2Parser.g:5612:5: ruleEString
            {

                                if (current==null) {
                                    current = createModelElement(grammarAccess.getArrayTopicSpecRefRule());
                                }


                                newCompositeNode(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_1_0());

            pushFollow(FOLLOW_61);
            ruleEString();

            state._fsp--;


                                afterParserOrEnumRuleCall();


            }


            }

            otherlv_2=(Token)match(input,RightSquareBracket,FOLLOW_2);

                        newLeafNode(otherlv_2, grammarAccess.getArrayTopicSpecRefAccess().getRightSquareBracketKeyword_2());


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
    // InternalRos2Parser.g:5634:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalRos2Parser.g:5634:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalRos2Parser.g:5635:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalRos2Parser.g:5641:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5647:2: ( (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) )
            // InternalRos2Parser.g:5648:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            {
            // InternalRos2Parser.g:5648:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            int alt73=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt73=1;
                }
                break;
            case Message:
                {
                alt73=2;
                }
                break;
            case Result:
                {
                alt73=3;
                }
                break;
            case Feedback:
                {
                alt73=4;
                }
                break;
            case Name:
                {
                alt73=5;
                }
                break;
            case Value:
                {
                alt73=6;
                }
                break;
            case Service:
                {
                alt73=7;
                }
                break;
            case Type:
                {
                alt73=8;
                }
                break;
            case Action:
                {
                alt73=9;
                }
                break;
            case Duration:
                {
                alt73=10;
                }
                break;
            case Time:
                {
                alt73=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalRos2Parser.g:5649:3: kw= Goal
                    {
                    kw=(Token)match(input,Goal,FOLLOW_2);

                                current.merge(kw);
                                newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGoalKeyword_0());


                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:5655:3: kw= Message
                    {
                    kw=(Token)match(input,Message,FOLLOW_2);

                                current.merge(kw);
                                newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMessageKeyword_1());


                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:5661:3: kw= Result
                    {
                    kw=(Token)match(input,Result,FOLLOW_2);

                                current.merge(kw);
                                newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResultKeyword_2());


                    }
                    break;
                case 4 :
                    // InternalRos2Parser.g:5667:3: kw= Feedback
                    {
                    kw=(Token)match(input,Feedback,FOLLOW_2);

                                current.merge(kw);
                                newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());


                    }
                    break;
                case 5 :
                    // InternalRos2Parser.g:5673:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2);

                                current.merge(kw);
                                newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());


                    }
                    break;
                case 6 :
                    // InternalRos2Parser.g:5679:3: kw= Value
                    {
                    kw=(Token)match(input,Value,FOLLOW_2);

                                current.merge(kw);
                                newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_5());


                    }
                    break;
                case 7 :
                    // InternalRos2Parser.g:5685:3: kw= Service
                    {
                    kw=(Token)match(input,Service,FOLLOW_2);

                                current.merge(kw);
                                newLeafNode(kw, grammarAccess.getKEYWORDAccess().getServiceKeyword_6());


                    }
                    break;
                case 8 :
                    // InternalRos2Parser.g:5691:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2);

                                current.merge(kw);
                                newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());


                    }
                    break;
                case 9 :
                    // InternalRos2Parser.g:5697:3: kw= Action
                    {
                    kw=(Token)match(input,Action,FOLLOW_2);

                                current.merge(kw);
                                newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_8());


                    }
                    break;
                case 10 :
                    // InternalRos2Parser.g:5703:3: kw= Duration
                    {
                    kw=(Token)match(input,Duration,FOLLOW_2);

                                current.merge(kw);
                                newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDurationKeyword_9());


                    }
                    break;
                case 11 :
                    // InternalRos2Parser.g:5709:3: kw= Time
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
    // InternalRos2Parser.g:5718:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRos2Parser.g:5718:47: (iv_ruleEString= ruleEString EOF )
            // InternalRos2Parser.g:5719:2: iv_ruleEString= ruleEString EOF
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
    // InternalRos2Parser.g:5725:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5731:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRos2Parser.g:5732:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRos2Parser.g:5732:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==RULE_STRING) ) {
                alt74=1;
            }
            else if ( (LA74_0==RULE_ID) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalRos2Parser.g:5733:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2);

                                current.merge(this_STRING_0);


                                newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:5741:3: this_ID_1= RULE_ID
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
    // InternalRos2Parser.g:5752:1: entryRuleRosNames returns [String current=null] : iv_ruleRosNames= ruleRosNames EOF ;
    public final String entryRuleRosNames() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRosNames = null;


        try {
            // InternalRos2Parser.g:5752:48: (iv_ruleRosNames= ruleRosNames EOF )
            // InternalRos2Parser.g:5753:2: iv_ruleRosNames= ruleRosNames EOF
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
    // InternalRos2Parser.g:5759:1: ruleRosNames returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node ) ;
    public final AntlrDatatypeRuleToken ruleRosNames() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ROS_CONVENTION_A_0=null;
        Token this_ID_1=null;
        Token kw=null;


            enterRule();

        try {
            // InternalRos2Parser.g:5765:2: ( (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node ) )
            // InternalRos2Parser.g:5766:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node )
            {
            // InternalRos2Parser.g:5766:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node )
            int alt75=3;
            switch ( input.LA(1) ) {
            case RULE_ROS_CONVENTION_A:
                {
                alt75=1;
                }
                break;
            case RULE_ID:
                {
                alt75=2;
                }
                break;
            case Node:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalRos2Parser.g:5767:3: this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A
                    {
                    this_ROS_CONVENTION_A_0=(Token)match(input,RULE_ROS_CONVENTION_A,FOLLOW_2);

                                current.merge(this_ROS_CONVENTION_A_0);


                                newLeafNode(this_ROS_CONVENTION_A_0, grammarAccess.getRosNamesAccess().getROS_CONVENTION_ATerminalRuleCall_0());


                    }
                    break;
                case 2 :
                    // InternalRos2Parser.g:5775:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2);

                                current.merge(this_ID_1);


                                newLeafNode(this_ID_1, grammarAccess.getRosNamesAccess().getIDTerminalRuleCall_1());


                    }
                    break;
                case 3 :
                    // InternalRos2Parser.g:5783:3: kw= Node
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


    // $ANTLR start "entryRulePreListElement"
    // InternalRos2Parser.g:5792:1: entryRulePreListElement returns [String current=null] : iv_rulePreListElement= rulePreListElement EOF ;
    public final String entryRulePreListElement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePreListElement = null;



            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalRos2Parser.g:5794:2: (iv_rulePreListElement= rulePreListElement EOF )
            // InternalRos2Parser.g:5795:2: iv_rulePreListElement= rulePreListElement EOF
            {
             newCompositeNode(grammarAccess.getPreListElementRule());
            pushFollow(FOLLOW_1);
            iv_rulePreListElement=rulePreListElement();

            state._fsp--;

             current =iv_rulePreListElement.getText();
            match(input,EOF,FOLLOW_2);

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

                myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRulePreListElement"


    // $ANTLR start "rulePreListElement"
    // InternalRos2Parser.g:5804:1: rulePreListElement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= HyphenMinus ;
    public final AntlrDatatypeRuleToken rulePreListElement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


            enterRule();
            HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_SL_COMMENT");

        try {
            // InternalRos2Parser.g:5811:2: (kw= HyphenMinus )
            // InternalRos2Parser.g:5812:2: kw= HyphenMinus
            {
            kw=(Token)match(input,HyphenMinus,FOLLOW_2);

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPreListElementAccess().getHyphenMinusKeyword());


            }


                leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

                myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "rulePreListElement"

    // Delegated rules


    protected DFA58 dfa58 = new DFA58(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\7\12\uffff";
    static final String dfa_3s = "\1\143\5\uffff\1\143\1\uffff\2\143\1\uffff";
    static final String dfa_4s = "\1\170\5\uffff\1\164\1\uffff\2\147\1\uffff";
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

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "3033:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )";
        }
    }


    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002012000L,0x0100000000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002002000L,0x0100000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0508000010000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L,0x0100000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L,0x0018000000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000008800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004244000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000090000420002L,0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000400000000400L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0100000420000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000090000420000L,0x0100000000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xB001800000000000L,0x0080000000200001L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L,0x0100000420000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L,0x0100000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000092000420000L,0x0100000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x00181E4000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000012000L,0x0100000000000080L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000002000L,0x0100000000000080L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L,0x0000000044000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0100001000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0100000000010000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0408000010000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000001881B02L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0118000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC000000000000000L,0x0018000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x050000C000000000L,0x0058000189080050L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000100000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0200000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000040000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x050000C000000002L,0x0058000189080050L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x40DE005E30000000L,0x0018004082C4EF0EL});

}
