package de.fraunhofer.ipa.ros.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.ros.services.RosGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExternalDependency", "RelativeNamespace", "PrivateNamespace", "GlobalNamespace", "Serviceclients", "Serviceservers", "Actionclients", "Actionservers", "Dependencies", "ParameterAny", "FromGitRepo", "Subscribers", "Parameters", "Publishers", "GraphName", "Float32_1", "Float64_1", "Actions", "Default", "Duration", "Feedback", "Response", "String_2", "Uint16_1", "Uint32_1", "Uint64_1", "Boolean", "Integer", "Float32", "Float64", "Int16_1", "Int32_1", "Int64_1", "Message", "Request", "Service", "Uint8_1", "Array", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Char_1", "Int8_1", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "Int16", "Int32", "Int64", "Msgs", "Node_1", "Srvs", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Char", "Goal", "Int8", "Name", "Node", "Time", "Type", "Any", "Ns", "LeftSquareBracketRightSquareBracket", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Float32_1=19;
    public static final int Node=75;
    public static final int RULE_DATE_TIME=95;
    public static final int Uint64_1=29;
    public static final int Serviceclients=8;
    public static final int String=45;
    public static final int Int16=58;
    public static final int Float32=32;
    public static final int Goal=72;
    public static final int Actionservers=11;
    public static final int Bool=69;
    public static final int Msgs=61;
    public static final int Uint16=54;
    public static final int Boolean=30;
    public static final int ExternalDependency=4;
    public static final int Uint8=65;
    public static final int Parameters=16;
    public static final int RULE_ID=96;
    public static final int Actions=21;
    public static final int RULE_DIGIT=85;
    public static final int GlobalNamespace=7;
    public static final int Node_1=62;
    public static final int Int16_1=34;
    public static final int Header=44;
    public static final int RULE_INT=98;
    public static final int Byte=70;
    public static final int RULE_ML_COMMENT=105;
    public static final int LeftSquareBracket=83;
    public static final int Base64=42;
    public static final int Comma=81;
    public static final int RULE_MESSAGE_ASIGMENT=99;
    public static final int LeftSquareBracketRightSquareBracket=80;
    public static final int Int32=59;
    public static final int Char=71;
    public static final int Publishers=17;
    public static final int Srvs=63;
    public static final int RULE_DECINT=88;
    public static final int Uint32=55;
    public static final int FromGitRepo=14;
    public static final int RULE_HOUR=93;
    public static final int Int8=73;
    public static final int Default=22;
    public static final int Int8_1=51;
    public static final int Uint16_1=27;
    public static final int Type=77;
    public static final int Float64=33;
    public static final int Int32_1=35;
    public static final int RULE_BINARY=86;
    public static final int String_1=53;
    public static final int Subscribers=15;
    public static final int String_2=26;
    public static final int Actionclients=10;
    public static final int RULE_DAY=90;
    public static final int RULE_BEGIN=100;
    public static final int RULE_BOOLEAN=87;
    public static final int RelativeNamespace=5;
    public static final int Serviceservers=9;
    public static final int RULE_YEAR=92;
    public static final int Result=52;
    public static final int Name=74;
    public static final int RULE_MIN_SEC=94;
    public static final int Char_1=50;
    public static final int ParameterAny=13;
    public static final int List=68;
    public static final int Dependencies=12;
    public static final int RightSquareBracket=84;
    public static final int PrivateNamespace=6;
    public static final int GraphName=18;
    public static final int Byte_1=49;
    public static final int Float64_1=20;
    public static final int Duration=23;
    public static final int Uint32_1=28;
    public static final int Double=43;
    public static final int Type_1=64;
    public static final int Value=66;
    public static final int Uint64=56;
    public static final int Action=47;
    public static final int RULE_END=101;
    public static final int Message=37;
    public static final int Value_1=57;
    public static final int Time=76;
    public static final int RULE_STRING=97;
    public static final int Bool_1=48;
    public static final int Any=78;
    public static final int Struct=46;
    public static final int RULE_SL_COMMENT=102;
    public static final int Uint8_1=40;
    public static final int RULE_DOUBLE=89;
    public static final int Feedback=24;
    public static final int RULE_ROS_CONVENTION_A=103;
    public static final int RULE_ROS_CONVENTION_PARAM=104;
    public static final int Colon=82;
    public static final int EOF=-1;
    public static final int Ns=79;
    public static final int RULE_WS=106;
    public static final int Int64_1=36;
    public static final int Request=38;
    public static final int Service=39;
    public static final int RULE_ANY_OTHER=107;
    public static final int Date=67;
    public static final int Response=25;
    public static final int Integer=31;
    public static final int Array=41;
    public static final int Int64=60;
    public static final int RULE_MONTH=91;

    // delegates
    // delegators


        public InternalRosParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosParser.g"; }



     	private RosGrammarAccess grammarAccess;

        public InternalRosParser(TokenStream input, RosGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "PackageSet";
       	}

       	@Override
       	protected RosGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePackageSet"
    // InternalRosParser.g:57:1: entryRulePackageSet returns [EObject current=null] : iv_rulePackageSet= rulePackageSet EOF ;
    public final EObject entryRulePackageSet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageSet = null;


        try {
            // InternalRosParser.g:57:51: (iv_rulePackageSet= rulePackageSet EOF )
            // InternalRosParser.g:58:2: iv_rulePackageSet= rulePackageSet EOF
            {
             newCompositeNode(grammarAccess.getPackageSetRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageSet=rulePackageSet();

            state._fsp--;

             current =iv_rulePackageSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageSet"


    // $ANTLR start "rulePackageSet"
    // InternalRosParser.g:64:1: rulePackageSet returns [EObject current=null] : ( () ( (lv_package_1_0= rulePackage_Impl ) )* ) ;
    public final EObject rulePackageSet() throws RecognitionException {
        EObject current = null;

        EObject lv_package_1_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:70:2: ( ( () ( (lv_package_1_0= rulePackage_Impl ) )* ) )
            // InternalRosParser.g:71:2: ( () ( (lv_package_1_0= rulePackage_Impl ) )* )
            {
            // InternalRosParser.g:71:2: ( () ( (lv_package_1_0= rulePackage_Impl ) )* )
            // InternalRosParser.g:72:3: () ( (lv_package_1_0= rulePackage_Impl ) )*
            {
            // InternalRosParser.g:72:3: ()
            // InternalRosParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageSetAccess().getPackageSetAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:79:3: ( (lv_package_1_0= rulePackage_Impl ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Node||LA1_0==RULE_ID||LA1_0==RULE_ROS_CONVENTION_A) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRosParser.g:80:4: (lv_package_1_0= rulePackage_Impl )
            	    {
            	    // InternalRosParser.g:80:4: (lv_package_1_0= rulePackage_Impl )
            	    // InternalRosParser.g:81:5: lv_package_1_0= rulePackage_Impl
            	    {

            	    					newCompositeNode(grammarAccess.getPackageSetAccess().getPackagePackage_ImplParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_package_1_0=rulePackage_Impl();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPackageSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"package",
            	    						lv_package_1_0,
            	    						"de.fraunhofer.ipa.ros.Ros.Package_Impl");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "rulePackageSet"


    // $ANTLR start "entryRulePackage_Impl"
    // InternalRosParser.g:102:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // InternalRosParser.g:102:53: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // InternalRosParser.g:103:2: iv_rulePackage_Impl= rulePackage_Impl EOF
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
    // InternalRosParser.g:109:1: rulePackage_Impl returns [EObject current=null] : ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )? ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )* this_END_24= RULE_END ) ;
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
            // InternalRosParser.g:115:2: ( ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )? ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )* this_END_24= RULE_END ) )
            // InternalRosParser.g:116:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )? ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )* this_END_24= RULE_END )
            {
            // InternalRosParser.g:116:2: ( () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )? ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )* this_END_24= RULE_END )
            // InternalRosParser.g:117:3: () ( (lv_name_1_0= ruleRosNames ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )? (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )? ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )* this_END_24= RULE_END
            {
            // InternalRosParser.g:117:3: ()
            // InternalRosParser.g:118:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackage_ImplAccess().getPackageAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:124:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRosParser.g:125:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRosParser.g:125:4: (lv_name_1_0= ruleRosNames )
            // InternalRosParser.g:126:5: lv_name_1_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getPackage_ImplAccess().getNameRosNamesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPackage_ImplAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_6); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRosParser.g:151:3: (otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FromGitRepo) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosParser.g:152:4: otherlv_4= FromGitRepo ( (lv_fromGitRepo_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,FromGitRepo,FOLLOW_7); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackage_ImplAccess().getFromGitRepoKeyword_4_0());
                    			
                    // InternalRosParser.g:156:4: ( (lv_fromGitRepo_5_0= ruleEString ) )
                    // InternalRosParser.g:157:5: (lv_fromGitRepo_5_0= ruleEString )
                    {
                    // InternalRosParser.g:157:5: (lv_fromGitRepo_5_0= ruleEString )
                    // InternalRosParser.g:158:6: lv_fromGitRepo_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getFromGitRepoEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

            // InternalRosParser.g:176:3: (otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Dependencies) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosParser.g:177:4: otherlv_6= Dependencies otherlv_7= LeftSquareBracket ( (lv_dependency_8_0= ruleDependency ) ) (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )* otherlv_11= RightSquareBracket
                    {
                    otherlv_6=(Token)match(input,Dependencies,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getPackage_ImplAccess().getDependenciesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,LeftSquareBracket,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getPackage_ImplAccess().getLeftSquareBracketKeyword_5_1());
                    			
                    // InternalRosParser.g:185:4: ( (lv_dependency_8_0= ruleDependency ) )
                    // InternalRosParser.g:186:5: (lv_dependency_8_0= ruleDependency )
                    {
                    // InternalRosParser.g:186:5: (lv_dependency_8_0= ruleDependency )
                    // InternalRosParser.g:187:6: lv_dependency_8_0= ruleDependency
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getDependencyDependencyParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalRosParser.g:204:4: (otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==Comma) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalRosParser.g:205:5: otherlv_9= Comma ( (lv_dependency_10_0= ruleDependency ) )
                    	    {
                    	    otherlv_9=(Token)match(input,Comma,FOLLOW_10); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRosParser.g:209:5: ( (lv_dependency_10_0= ruleDependency ) )
                    	    // InternalRosParser.g:210:6: (lv_dependency_10_0= ruleDependency )
                    	    {
                    	    // InternalRosParser.g:210:6: (lv_dependency_10_0= ruleDependency )
                    	    // InternalRosParser.g:211:7: lv_dependency_10_0= ruleDependency
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getDependencyDependencyParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,RightSquareBracket,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getPackage_ImplAccess().getRightSquareBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRosParser.g:234:3: ( (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END ) | (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END ) | (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case Msgs:
                    {
                    alt8=1;
                    }
                    break;
                case Srvs:
                    {
                    alt8=2;
                    }
                    break;
                case Actions:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // InternalRosParser.g:235:4: (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END )
            	    {
            	    // InternalRosParser.g:235:4: (otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END )
            	    // InternalRosParser.g:236:5: otherlv_12= Msgs this_BEGIN_13= RULE_BEGIN ( (lv_spec_14_0= ruleTopicSpec ) )* this_END_15= RULE_END
            	    {
            	    otherlv_12=(Token)match(input,Msgs,FOLLOW_5); 

            	    					newLeafNode(otherlv_12, grammarAccess.getPackage_ImplAccess().getMsgsKeyword_6_0_0());
            	    				
            	    this_BEGIN_13=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            	    					newLeafNode(this_BEGIN_13, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_6_0_1());
            	    				
            	    // InternalRosParser.g:244:5: ( (lv_spec_14_0= ruleTopicSpec ) )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( ((LA5_0>=Header && LA5_0<=String)||(LA5_0>=RULE_ID && LA5_0<=RULE_STRING)) ) {
            	            alt5=1;
            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalRosParser.g:245:6: (lv_spec_14_0= ruleTopicSpec )
            	    	    {
            	    	    // InternalRosParser.g:245:6: (lv_spec_14_0= ruleTopicSpec )
            	    	    // InternalRosParser.g:246:7: lv_spec_14_0= ruleTopicSpec
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecTopicSpecParserRuleCall_6_0_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_13);
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
            	    	    break loop5;
            	        }
            	    } while (true);

            	    this_END_15=(Token)match(input,RULE_END,FOLLOW_12); 

            	    					newLeafNode(this_END_15, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_6_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRosParser.g:269:4: (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END )
            	    {
            	    // InternalRosParser.g:269:4: (otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END )
            	    // InternalRosParser.g:270:5: otherlv_16= Srvs this_BEGIN_17= RULE_BEGIN ( (lv_spec_18_0= ruleServiceSpec ) )* this_END_19= RULE_END
            	    {
            	    otherlv_16=(Token)match(input,Srvs,FOLLOW_5); 

            	    					newLeafNode(otherlv_16, grammarAccess.getPackage_ImplAccess().getSrvsKeyword_6_1_0());
            	    				
            	    this_BEGIN_17=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    					newLeafNode(this_BEGIN_17, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_6_1_1());
            	    				
            	    // InternalRosParser.g:278:5: ( (lv_spec_18_0= ruleServiceSpec ) )*
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalRosParser.g:279:6: (lv_spec_18_0= ruleServiceSpec )
            	    	    {
            	    	    // InternalRosParser.g:279:6: (lv_spec_18_0= ruleServiceSpec )
            	    	    // InternalRosParser.g:280:7: lv_spec_18_0= ruleServiceSpec
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecServiceSpecParserRuleCall_6_1_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
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
            	    	    break loop6;
            	        }
            	    } while (true);

            	    this_END_19=(Token)match(input,RULE_END,FOLLOW_12); 

            	    					newLeafNode(this_END_19, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_6_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRosParser.g:303:4: (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END )
            	    {
            	    // InternalRosParser.g:303:4: (otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END )
            	    // InternalRosParser.g:304:5: otherlv_20= Actions this_BEGIN_21= RULE_BEGIN ( (lv_spec_22_0= ruleActionSpec ) )* this_END_23= RULE_END
            	    {
            	    otherlv_20=(Token)match(input,Actions,FOLLOW_5); 

            	    					newLeafNode(otherlv_20, grammarAccess.getPackage_ImplAccess().getActionsKeyword_6_2_0());
            	    				
            	    this_BEGIN_21=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    					newLeafNode(this_BEGIN_21, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_6_2_1());
            	    				
            	    // InternalRosParser.g:312:5: ( (lv_spec_22_0= ruleActionSpec ) )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( ((LA7_0>=RULE_ID && LA7_0<=RULE_STRING)) ) {
            	            alt7=1;
            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // InternalRosParser.g:313:6: (lv_spec_22_0= ruleActionSpec )
            	    	    {
            	    	    // InternalRosParser.g:313:6: (lv_spec_22_0= ruleActionSpec )
            	    	    // InternalRosParser.g:314:7: lv_spec_22_0= ruleActionSpec
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecActionSpecParserRuleCall_6_2_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
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
            	    	    break loop7;
            	        }
            	    } while (true);

            	    this_END_23=(Token)match(input,RULE_END,FOLLOW_12); 

            	    					newLeafNode(this_END_23, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_6_2_3());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalRosParser.g:345:1: entryRuleTopicSpec returns [EObject current=null] : iv_ruleTopicSpec= ruleTopicSpec EOF ;
    public final EObject entryRuleTopicSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpec = null;


        try {
            // InternalRosParser.g:345:50: (iv_ruleTopicSpec= ruleTopicSpec EOF )
            // InternalRosParser.g:346:2: iv_ruleTopicSpec= ruleTopicSpec EOF
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
    // InternalRosParser.g:352:1: ruleTopicSpec returns [EObject current=null] : ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Message (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? this_END_7= RULE_END ) ;
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
            // InternalRosParser.g:358:2: ( ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Message (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? this_END_7= RULE_END ) )
            // InternalRosParser.g:359:2: ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Message (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? this_END_7= RULE_END )
            {
            // InternalRosParser.g:359:2: ( () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Message (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? this_END_7= RULE_END )
            // InternalRosParser.g:360:3: () ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Message (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? this_END_7= RULE_END
            {
            // InternalRosParser.g:360:3: ()
            // InternalRosParser.g:361:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicSpecAccess().getTopicSpecAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:367:3: ( ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) ) )
            // InternalRosParser.g:368:4: ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) )
            {
            // InternalRosParser.g:368:4: ( (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String ) )
            // InternalRosParser.g:369:5: (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String )
            {
            // InternalRosParser.g:369:5: (lv_name_1_1= ruleEString | lv_name_1_2= Header | lv_name_1_3= String )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_STRING:
                {
                alt9=1;
                }
                break;
            case Header:
                {
                alt9=2;
                }
                break;
            case String:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalRosParser.g:370:6: lv_name_1_1= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTopicSpecAccess().getNameEStringParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_5);
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
                    // InternalRosParser.g:386:6: lv_name_1_2= Header
                    {
                    lv_name_1_2=(Token)match(input,Header,FOLLOW_5); 

                    						newLeafNode(lv_name_1_2, grammarAccess.getTopicSpecAccess().getNameHeaderKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicSpecRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalRosParser.g:397:6: lv_name_1_3= String
                    {
                    lv_name_1_3=(Token)match(input,String,FOLLOW_5); 

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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_15); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getTopicSpecAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Message,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicSpecAccess().getMessageKeyword_3());
            		
            // InternalRosParser.g:418:3: (this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_BEGIN) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRosParser.g:419:4: this_BEGIN_4= RULE_BEGIN ( (lv_message_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getTopicSpecAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    // InternalRosParser.g:423:4: ( (lv_message_5_0= ruleMessageDefinition ) )
                    // InternalRosParser.g:424:5: (lv_message_5_0= ruleMessageDefinition )
                    {
                    // InternalRosParser.g:424:5: (lv_message_5_0= ruleMessageDefinition )
                    // InternalRosParser.g:425:6: lv_message_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getTopicSpecAccess().getMessageMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_18); 

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
    // InternalRosParser.g:455:1: entryRuleServiceSpec returns [EObject current=null] : iv_ruleServiceSpec= ruleServiceSpec EOF ;
    public final EObject entryRuleServiceSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSpec = null;


        try {
            // InternalRosParser.g:455:52: (iv_ruleServiceSpec= ruleServiceSpec EOF )
            // InternalRosParser.g:456:2: iv_ruleServiceSpec= ruleServiceSpec EOF
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
    // InternalRosParser.g:462:1: ruleServiceSpec returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Request (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Response (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? this_END_11= RULE_END ) ;
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
            // InternalRosParser.g:468:2: ( ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Request (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Response (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? this_END_11= RULE_END ) )
            // InternalRosParser.g:469:2: ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Request (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Response (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? this_END_11= RULE_END )
            {
            // InternalRosParser.g:469:2: ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Request (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Response (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? this_END_11= RULE_END )
            // InternalRosParser.g:470:3: () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Request (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Response (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? this_END_11= RULE_END
            {
            // InternalRosParser.g:470:3: ()
            // InternalRosParser.g:471:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceSpecAccess().getServiceSpecAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:477:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosParser.g:478:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosParser.g:478:4: (lv_name_1_0= ruleEString )
            // InternalRosParser.g:479:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceSpecAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_19); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Request,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceSpecAccess().getRequestKeyword_3());
            		
            // InternalRosParser.g:504:3: (this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_BEGIN) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRosParser.g:505:4: this_BEGIN_4= RULE_BEGIN ( (lv_request_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    // InternalRosParser.g:509:4: ( (lv_request_5_0= ruleMessageDefinition ) )
                    // InternalRosParser.g:510:5: (lv_request_5_0= ruleMessageDefinition )
                    {
                    // InternalRosParser.g:510:5: (lv_request_5_0= ruleMessageDefinition )
                    // InternalRosParser.g:511:6: lv_request_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getRequestMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_21); 

                    				newLeafNode(this_END_6, grammarAccess.getServiceSpecAccess().getENDTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,Response,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getServiceSpecAccess().getResponseKeyword_5());
            		
            // InternalRosParser.g:537:3: (this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_BEGIN) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRosParser.g:538:4: this_BEGIN_8= RULE_BEGIN ( (lv_response_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END
                    {
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_8, grammarAccess.getServiceSpecAccess().getBEGINTerminalRuleCall_6_0());
                    			
                    // InternalRosParser.g:542:4: ( (lv_response_9_0= ruleMessageDefinition ) )
                    // InternalRosParser.g:543:5: (lv_response_9_0= ruleMessageDefinition )
                    {
                    // InternalRosParser.g:543:5: (lv_response_9_0= ruleMessageDefinition )
                    // InternalRosParser.g:544:6: lv_response_9_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getResponseMessageDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    this_END_10=(Token)match(input,RULE_END,FOLLOW_18); 

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
    // InternalRosParser.g:574:1: entryRuleActionSpec returns [EObject current=null] : iv_ruleActionSpec= ruleActionSpec EOF ;
    public final EObject entryRuleActionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSpec = null;


        try {
            // InternalRosParser.g:574:51: (iv_ruleActionSpec= ruleActionSpec EOF )
            // InternalRosParser.g:575:2: iv_ruleActionSpec= ruleActionSpec EOF
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
    // InternalRosParser.g:581:1: ruleActionSpec returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Goal (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Result (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? otherlv_11= Feedback (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )? this_END_15= RULE_END ) ;
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
            // InternalRosParser.g:587:2: ( ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Goal (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Result (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? otherlv_11= Feedback (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )? this_END_15= RULE_END ) )
            // InternalRosParser.g:588:2: ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Goal (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Result (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? otherlv_11= Feedback (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )? this_END_15= RULE_END )
            {
            // InternalRosParser.g:588:2: ( () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Goal (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Result (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? otherlv_11= Feedback (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )? this_END_15= RULE_END )
            // InternalRosParser.g:589:3: () ( (lv_name_1_0= ruleEString ) ) this_BEGIN_2= RULE_BEGIN otherlv_3= Goal (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )? otherlv_7= Result (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )? otherlv_11= Feedback (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )? this_END_15= RULE_END
            {
            // InternalRosParser.g:589:3: ()
            // InternalRosParser.g:590:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionSpecAccess().getActionSpecAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:596:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosParser.g:597:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosParser.g:597:4: (lv_name_1_0= ruleEString )
            // InternalRosParser.g:598:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionSpecAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
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

            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_22); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_2());
            		
            otherlv_3=(Token)match(input,Goal,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getActionSpecAccess().getGoalKeyword_3());
            		
            // InternalRosParser.g:623:3: (this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_BEGIN) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRosParser.g:624:4: this_BEGIN_4= RULE_BEGIN ( (lv_goal_5_0= ruleMessageDefinition ) ) this_END_6= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    // InternalRosParser.g:628:4: ( (lv_goal_5_0= ruleMessageDefinition ) )
                    // InternalRosParser.g:629:5: (lv_goal_5_0= ruleMessageDefinition )
                    {
                    // InternalRosParser.g:629:5: (lv_goal_5_0= ruleMessageDefinition )
                    // InternalRosParser.g:630:6: lv_goal_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getGoalMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    this_END_6=(Token)match(input,RULE_END,FOLLOW_24); 

                    				newLeafNode(this_END_6, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,Result,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getActionSpecAccess().getResultKeyword_5());
            		
            // InternalRosParser.g:656:3: (this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_BEGIN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRosParser.g:657:4: this_BEGIN_8= RULE_BEGIN ( (lv_result_9_0= ruleMessageDefinition ) ) this_END_10= RULE_END
                    {
                    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_8, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_6_0());
                    			
                    // InternalRosParser.g:661:4: ( (lv_result_9_0= ruleMessageDefinition ) )
                    // InternalRosParser.g:662:5: (lv_result_9_0= ruleMessageDefinition )
                    {
                    // InternalRosParser.g:662:5: (lv_result_9_0= ruleMessageDefinition )
                    // InternalRosParser.g:663:6: lv_result_9_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getResultMessageDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    this_END_10=(Token)match(input,RULE_END,FOLLOW_26); 

                    				newLeafNode(this_END_10, grammarAccess.getActionSpecAccess().getENDTerminalRuleCall_6_2());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,Feedback,FOLLOW_16); 

            			newLeafNode(otherlv_11, grammarAccess.getActionSpecAccess().getFeedbackKeyword_7());
            		
            // InternalRosParser.g:689:3: (this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_BEGIN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRosParser.g:690:4: this_BEGIN_12= RULE_BEGIN ( (lv_feedback_13_0= ruleMessageDefinition ) ) this_END_14= RULE_END
                    {
                    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_17); 

                    				newLeafNode(this_BEGIN_12, grammarAccess.getActionSpecAccess().getBEGINTerminalRuleCall_8_0());
                    			
                    // InternalRosParser.g:694:4: ( (lv_feedback_13_0= ruleMessageDefinition ) )
                    // InternalRosParser.g:695:5: (lv_feedback_13_0= ruleMessageDefinition )
                    {
                    // InternalRosParser.g:695:5: (lv_feedback_13_0= ruleMessageDefinition )
                    // InternalRosParser.g:696:6: lv_feedback_13_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getFeedbackMessageDefinitionParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

                    this_END_14=(Token)match(input,RULE_END,FOLLOW_18); 

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
    // InternalRosParser.g:726:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalRosParser.g:726:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalRosParser.g:727:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
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
    // InternalRosParser.g:733:1: ruleMessageDefinition returns [EObject current=null] : ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_MessagePart_1_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:739:2: ( ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* ) )
            // InternalRosParser.g:740:2: ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* )
            {
            // InternalRosParser.g:740:2: ( () ( (lv_MessagePart_1_0= ruleMessagePart ) )* )
            // InternalRosParser.g:741:3: () ( (lv_MessagePart_1_0= ruleMessagePart ) )*
            {
            // InternalRosParser.g:741:3: ()
            // InternalRosParser.g:742:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:748:3: ( (lv_MessagePart_1_0= ruleMessagePart ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=Float32_1 && LA16_0<=Float64_1)||LA16_0==Duration||(LA16_0>=String_2 && LA16_0<=Uint64_1)||(LA16_0>=Float32 && LA16_0<=Int64_1)||LA16_0==Uint8_1||LA16_0==Header||(LA16_0>=Bool_1 && LA16_0<=Int8_1)||(LA16_0>=String_1 && LA16_0<=Uint64)||(LA16_0>=Int16 && LA16_0<=Int64)||LA16_0==Uint8||(LA16_0>=Bool && LA16_0<=Char)||LA16_0==Int8||LA16_0==Time||(LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRosParser.g:749:4: (lv_MessagePart_1_0= ruleMessagePart )
            	    {
            	    // InternalRosParser.g:749:4: (lv_MessagePart_1_0= ruleMessagePart )
            	    // InternalRosParser.g:750:5: lv_MessagePart_1_0= ruleMessagePart
            	    {

            	    					newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_27);
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
            	    break loop16;
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


    // $ANTLR start "entryRuleNode"
    // InternalRosParser.g:771:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRosParser.g:771:45: (iv_ruleNode= ruleNode EOF )
            // InternalRosParser.g:772:2: iv_ruleNode= ruleNode EOF
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
    // InternalRosParser.g:778:1: ruleNode returns [EObject current=null] : (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= Serviceservers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= Serviceclients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= Actionservers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= Actionclients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )* ) ;
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
            // InternalRosParser.g:784:2: ( (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= Serviceservers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= Serviceclients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= Actionservers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= Actionclients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )* ) )
            // InternalRosParser.g:785:2: (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= Serviceservers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= Serviceclients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= Actionservers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= Actionclients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )* )
            {
            // InternalRosParser.g:785:2: (otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= Serviceservers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= Serviceclients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= Actionservers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= Actionclients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )* )
            // InternalRosParser.g:786:3: otherlv_0= Node_1 ( (lv_name_1_0= ruleRosNames ) ) ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= Serviceservers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= Serviceclients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= Actionservers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= Actionclients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )*
            {
            otherlv_0=(Token)match(input,Node_1,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            // InternalRosParser.g:790:3: ( (lv_name_1_0= ruleRosNames ) )
            // InternalRosParser.g:791:4: (lv_name_1_0= ruleRosNames )
            {
            // InternalRosParser.g:791:4: (lv_name_1_0= ruleRosNames )
            // InternalRosParser.g:792:5: lv_name_1_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameRosNamesParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalRosParser.g:809:3: ( (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END ) | (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END ) | (otherlv_10= Serviceservers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END ) | (otherlv_14= Serviceclients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END ) | (otherlv_18= Actionservers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END ) | (otherlv_22= Actionclients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END ) | (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END ) )*
            loop24:
            do {
                int alt24=8;
                switch ( input.LA(1) ) {
                case Publishers:
                    {
                    alt24=1;
                    }
                    break;
                case Subscribers:
                    {
                    alt24=2;
                    }
                    break;
                case Serviceservers:
                    {
                    alt24=3;
                    }
                    break;
                case Serviceclients:
                    {
                    alt24=4;
                    }
                    break;
                case Actionservers:
                    {
                    alt24=5;
                    }
                    break;
                case Actionclients:
                    {
                    alt24=6;
                    }
                    break;
                case Parameters:
                    {
                    alt24=7;
                    }
                    break;

                }

                switch (alt24) {
            	case 1 :
            	    // InternalRosParser.g:810:4: (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END )
            	    {
            	    // InternalRosParser.g:810:4: (otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END )
            	    // InternalRosParser.g:811:5: otherlv_2= Publishers this_BEGIN_3= RULE_BEGIN ( (lv_publisher_4_0= rulePublisher ) )* this_END_5= RULE_END
            	    {
            	    otherlv_2=(Token)match(input,Publishers,FOLLOW_5); 

            	    					newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getPublishersKeyword_2_0_0());
            	    				
            	    this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    					newLeafNode(this_BEGIN_3, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_0_1());
            	    				
            	    // InternalRosParser.g:819:5: ( (lv_publisher_4_0= rulePublisher ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalRosParser.g:820:6: (lv_publisher_4_0= rulePublisher )
            	    	    {
            	    	    // InternalRosParser.g:820:6: (lv_publisher_4_0= rulePublisher )
            	    	    // InternalRosParser.g:821:7: lv_publisher_4_0= rulePublisher
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_2_0_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_publisher_4_0=rulePublisher();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"publisher",
            	    	    								lv_publisher_4_0,
            	    	    								"de.fraunhofer.ipa.ros.Ros.Publisher");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    this_END_5=(Token)match(input,RULE_END,FOLLOW_29); 

            	    					newLeafNode(this_END_5, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_0_3());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRosParser.g:844:4: (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END )
            	    {
            	    // InternalRosParser.g:844:4: (otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END )
            	    // InternalRosParser.g:845:5: otherlv_6= Subscribers this_BEGIN_7= RULE_BEGIN ( (lv_subscriber_8_0= ruleSubscriber ) )* this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Subscribers,FOLLOW_5); 

            	    					newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getSubscribersKeyword_2_1_0());
            	    				
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    					newLeafNode(this_BEGIN_7, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_1_1());
            	    				
            	    // InternalRosParser.g:853:5: ( (lv_subscriber_8_0= ruleSubscriber ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( ((LA18_0>=RULE_ID && LA18_0<=RULE_STRING)) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalRosParser.g:854:6: (lv_subscriber_8_0= ruleSubscriber )
            	    	    {
            	    	    // InternalRosParser.g:854:6: (lv_subscriber_8_0= ruleSubscriber )
            	    	    // InternalRosParser.g:855:7: lv_subscriber_8_0= ruleSubscriber
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_2_1_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_subscriber_8_0=ruleSubscriber();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"subscriber",
            	    	    								lv_subscriber_8_0,
            	    	    								"de.fraunhofer.ipa.ros.Ros.Subscriber");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_29); 

            	    					newLeafNode(this_END_9, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_1_3());
            	    				

            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRosParser.g:878:4: (otherlv_10= Serviceservers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END )
            	    {
            	    // InternalRosParser.g:878:4: (otherlv_10= Serviceservers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END )
            	    // InternalRosParser.g:879:5: otherlv_10= Serviceservers this_BEGIN_11= RULE_BEGIN ( (lv_serviceserver_12_0= ruleServiceServer ) )* this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Serviceservers,FOLLOW_5); 

            	    					newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getServiceserversKeyword_2_2_0());
            	    				
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    					newLeafNode(this_BEGIN_11, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_2_1());
            	    				
            	    // InternalRosParser.g:887:5: ( (lv_serviceserver_12_0= ruleServiceServer ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // InternalRosParser.g:888:6: (lv_serviceserver_12_0= ruleServiceServer )
            	    	    {
            	    	    // InternalRosParser.g:888:6: (lv_serviceserver_12_0= ruleServiceServer )
            	    	    // InternalRosParser.g:889:7: lv_serviceserver_12_0= ruleServiceServer
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_2_2_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_serviceserver_12_0=ruleServiceServer();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"serviceserver",
            	    	    								lv_serviceserver_12_0,
            	    	    								"de.fraunhofer.ipa.ros.Ros.ServiceServer");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_29); 

            	    					newLeafNode(this_END_13, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_2_3());
            	    				

            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRosParser.g:912:4: (otherlv_14= Serviceclients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END )
            	    {
            	    // InternalRosParser.g:912:4: (otherlv_14= Serviceclients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END )
            	    // InternalRosParser.g:913:5: otherlv_14= Serviceclients this_BEGIN_15= RULE_BEGIN ( (lv_serviceclient_16_0= ruleServiceClient ) )* this_END_17= RULE_END
            	    {
            	    otherlv_14=(Token)match(input,Serviceclients,FOLLOW_5); 

            	    					newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getServiceclientsKeyword_2_3_0());
            	    				
            	    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    					newLeafNode(this_BEGIN_15, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_3_1());
            	    				
            	    // InternalRosParser.g:921:5: ( (lv_serviceclient_16_0= ruleServiceClient ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_STRING)) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalRosParser.g:922:6: (lv_serviceclient_16_0= ruleServiceClient )
            	    	    {
            	    	    // InternalRosParser.g:922:6: (lv_serviceclient_16_0= ruleServiceClient )
            	    	    // InternalRosParser.g:923:7: lv_serviceclient_16_0= ruleServiceClient
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_2_3_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_serviceclient_16_0=ruleServiceClient();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"serviceclient",
            	    	    								lv_serviceclient_16_0,
            	    	    								"de.fraunhofer.ipa.ros.Ros.ServiceClient");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);

            	    this_END_17=(Token)match(input,RULE_END,FOLLOW_29); 

            	    					newLeafNode(this_END_17, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_3_3());
            	    				

            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRosParser.g:946:4: (otherlv_18= Actionservers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END )
            	    {
            	    // InternalRosParser.g:946:4: (otherlv_18= Actionservers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END )
            	    // InternalRosParser.g:947:5: otherlv_18= Actionservers this_BEGIN_19= RULE_BEGIN ( (lv_actionserver_20_0= ruleActionServer ) )* this_END_21= RULE_END
            	    {
            	    otherlv_18=(Token)match(input,Actionservers,FOLLOW_5); 

            	    					newLeafNode(otherlv_18, grammarAccess.getNodeAccess().getActionserversKeyword_2_4_0());
            	    				
            	    this_BEGIN_19=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    					newLeafNode(this_BEGIN_19, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_4_1());
            	    				
            	    // InternalRosParser.g:955:5: ( (lv_actionserver_20_0= ruleActionServer ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_STRING)) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // InternalRosParser.g:956:6: (lv_actionserver_20_0= ruleActionServer )
            	    	    {
            	    	    // InternalRosParser.g:956:6: (lv_actionserver_20_0= ruleActionServer )
            	    	    // InternalRosParser.g:957:7: lv_actionserver_20_0= ruleActionServer
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_2_4_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_actionserver_20_0=ruleActionServer();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"actionserver",
            	    	    								lv_actionserver_20_0,
            	    	    								"de.fraunhofer.ipa.ros.Ros.ActionServer");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);

            	    this_END_21=(Token)match(input,RULE_END,FOLLOW_29); 

            	    					newLeafNode(this_END_21, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_4_3());
            	    				

            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRosParser.g:980:4: (otherlv_22= Actionclients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END )
            	    {
            	    // InternalRosParser.g:980:4: (otherlv_22= Actionclients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END )
            	    // InternalRosParser.g:981:5: otherlv_22= Actionclients this_BEGIN_23= RULE_BEGIN ( (lv_actionclient_24_0= ruleActionClient ) )* this_END_25= RULE_END
            	    {
            	    otherlv_22=(Token)match(input,Actionclients,FOLLOW_5); 

            	    					newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getActionclientsKeyword_2_5_0());
            	    				
            	    this_BEGIN_23=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    					newLeafNode(this_BEGIN_23, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_5_1());
            	    				
            	    // InternalRosParser.g:989:5: ( (lv_actionclient_24_0= ruleActionClient ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_STRING)) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // InternalRosParser.g:990:6: (lv_actionclient_24_0= ruleActionClient )
            	    	    {
            	    	    // InternalRosParser.g:990:6: (lv_actionclient_24_0= ruleActionClient )
            	    	    // InternalRosParser.g:991:7: lv_actionclient_24_0= ruleActionClient
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_2_5_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_actionclient_24_0=ruleActionClient();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"actionclient",
            	    	    								lv_actionclient_24_0,
            	    	    								"de.fraunhofer.ipa.ros.Ros.ActionClient");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);

            	    this_END_25=(Token)match(input,RULE_END,FOLLOW_29); 

            	    					newLeafNode(this_END_25, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_5_3());
            	    				

            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRosParser.g:1014:4: (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END )
            	    {
            	    // InternalRosParser.g:1014:4: (otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END )
            	    // InternalRosParser.g:1015:5: otherlv_26= Parameters this_BEGIN_27= RULE_BEGIN ( (lv_parameter_28_0= ruleParameter ) )* this_END_29= RULE_END
            	    {
            	    otherlv_26=(Token)match(input,Parameters,FOLLOW_5); 

            	    					newLeafNode(otherlv_26, grammarAccess.getNodeAccess().getParametersKeyword_2_6_0());
            	    				
            	    this_BEGIN_27=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    					newLeafNode(this_BEGIN_27, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2_6_1());
            	    				
            	    // InternalRosParser.g:1023:5: ( (lv_parameter_28_0= ruleParameter ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_STRING)) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // InternalRosParser.g:1024:6: (lv_parameter_28_0= ruleParameter )
            	    	    {
            	    	    // InternalRosParser.g:1024:6: (lv_parameter_28_0= ruleParameter )
            	    	    // InternalRosParser.g:1025:7: lv_parameter_28_0= ruleParameter
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_2_6_2_0());
            	    	    						
            	    	    pushFollow(FOLLOW_14);
            	    	    lv_parameter_28_0=ruleParameter();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"parameter",
            	    	    								lv_parameter_28_0,
            	    	    								"de.fraunhofer.ipa.ros.Basics.Parameter");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);

            	    this_END_29=(Token)match(input,RULE_END,FOLLOW_29); 

            	    					newLeafNode(this_END_29, grammarAccess.getNodeAccess().getENDTerminalRuleCall_2_6_3());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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


    // $ANTLR start "entryRulePublisher"
    // InternalRosParser.g:1052:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRosParser.g:1052:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRosParser.g:1053:2: iv_rulePublisher= rulePublisher EOF
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
    // InternalRosParser.g:1059:1: rulePublisher returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) ;
    public final EObject rulePublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:1065:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) )
            // InternalRosParser.g:1066:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            {
            // InternalRosParser.g:1066:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            // InternalRosParser.g:1067:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END
            {
            // InternalRosParser.g:1067:3: ()
            // InternalRosParser.g:1068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPublisherAccess().getPublisherAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:1074:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosParser.g:1075:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosParser.g:1075:4: (lv_name_1_0= ruleEString )
            // InternalRosParser.g:1076:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getPublisherAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getTypeKeyword_4());
            		
            // InternalRosParser.g:1105:3: ( ( ruleEString ) )
            // InternalRosParser.g:1106:4: ( ruleEString )
            {
            // InternalRosParser.g:1106:4: ( ruleEString )
            // InternalRosParser.g:1107:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosParser.g:1121:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Ns) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRosParser.g:1122:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getNsKeyword_6_0());
                    			
                    // InternalRosParser.g:1126:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosParser.g:1127:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosParser.g:1127:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosParser.g:1128:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getPublisherAccess().getENDTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRosParser.g:1154:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRosParser.g:1154:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRosParser.g:1155:2: iv_ruleSubscriber= ruleSubscriber EOF
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
    // InternalRosParser.g:1161:1: ruleSubscriber returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) ;
    public final EObject ruleSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:1167:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) )
            // InternalRosParser.g:1168:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            {
            // InternalRosParser.g:1168:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            // InternalRosParser.g:1169:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END
            {
            // InternalRosParser.g:1169:3: ()
            // InternalRosParser.g:1170:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubscriberAccess().getSubscriberAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:1176:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosParser.g:1177:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosParser.g:1177:4: (lv_name_1_0= ruleEString )
            // InternalRosParser.g:1178:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getSubscriberAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getTypeKeyword_4());
            		
            // InternalRosParser.g:1207:3: ( ( ruleEString ) )
            // InternalRosParser.g:1208:4: ( ruleEString )
            {
            // InternalRosParser.g:1208:4: ( ruleEString )
            // InternalRosParser.g:1209:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosParser.g:1223:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==Ns) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRosParser.g:1224:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getNsKeyword_6_0());
                    			
                    // InternalRosParser.g:1228:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosParser.g:1229:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosParser.g:1229:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosParser.g:1230:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getSubscriberAccess().getENDTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRosParser.g:1256:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRosParser.g:1256:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRosParser.g:1257:2: iv_ruleServiceServer= ruleServiceServer EOF
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
    // InternalRosParser.g:1263:1: ruleServiceServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) ;
    public final EObject ruleServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:1269:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) )
            // InternalRosParser.g:1270:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            {
            // InternalRosParser.g:1270:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            // InternalRosParser.g:1271:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END
            {
            // InternalRosParser.g:1271:3: ()
            // InternalRosParser.g:1272:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceServerAccess().getServiceServerAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:1278:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosParser.g:1279:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosParser.g:1279:4: (lv_name_1_0= ruleEString )
            // InternalRosParser.g:1280:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceServerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getServiceServerAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceServerAccess().getTypeKeyword_4());
            		
            // InternalRosParser.g:1309:3: ( ( ruleEString ) )
            // InternalRosParser.g:1310:4: ( ruleEString )
            {
            // InternalRosParser.g:1310:4: ( ruleEString )
            // InternalRosParser.g:1311:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceServerAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosParser.g:1325:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Ns) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRosParser.g:1326:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceServerAccess().getNsKeyword_6_0());
                    			
                    // InternalRosParser.g:1330:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosParser.g:1331:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosParser.g:1331:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosParser.g:1332:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getServiceServerAccess().getENDTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRosParser.g:1358:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRosParser.g:1358:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRosParser.g:1359:2: iv_ruleServiceClient= ruleServiceClient EOF
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
    // InternalRosParser.g:1365:1: ruleServiceClient returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) ;
    public final EObject ruleServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:1371:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) )
            // InternalRosParser.g:1372:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            {
            // InternalRosParser.g:1372:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            // InternalRosParser.g:1373:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END
            {
            // InternalRosParser.g:1373:3: ()
            // InternalRosParser.g:1374:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceClientAccess().getServiceClientAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:1380:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosParser.g:1381:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosParser.g:1381:4: (lv_name_1_0= ruleEString )
            // InternalRosParser.g:1382:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceClientAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getServiceClientAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceClientAccess().getTypeKeyword_4());
            		
            // InternalRosParser.g:1411:3: ( ( ruleEString ) )
            // InternalRosParser.g:1412:4: ( ruleEString )
            {
            // InternalRosParser.g:1412:4: ( ruleEString )
            // InternalRosParser.g:1413:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceClientAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosParser.g:1427:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Ns) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRosParser.g:1428:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getNsKeyword_6_0());
                    			
                    // InternalRosParser.g:1432:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosParser.g:1433:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosParser.g:1433:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosParser.g:1434:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getServiceClientAccess().getENDTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRosParser.g:1460:1: entryRuleActionServer returns [EObject current=null] : iv_ruleActionServer= ruleActionServer EOF ;
    public final EObject entryRuleActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionServer = null;


        try {
            // InternalRosParser.g:1460:53: (iv_ruleActionServer= ruleActionServer EOF )
            // InternalRosParser.g:1461:2: iv_ruleActionServer= ruleActionServer EOF
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
    // InternalRosParser.g:1467:1: ruleActionServer returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) ;
    public final EObject ruleActionServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:1473:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) )
            // InternalRosParser.g:1474:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            {
            // InternalRosParser.g:1474:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            // InternalRosParser.g:1475:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END
            {
            // InternalRosParser.g:1475:3: ()
            // InternalRosParser.g:1476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionServerAccess().getActionServerAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:1482:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosParser.g:1483:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosParser.g:1483:4: (lv_name_1_0= ruleEString )
            // InternalRosParser.g:1484:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionServerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getActionServerAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getActionServerAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getActionServerAccess().getTypeKeyword_4());
            		
            // InternalRosParser.g:1513:3: ( ( ruleEString ) )
            // InternalRosParser.g:1514:4: ( ruleEString )
            {
            // InternalRosParser.g:1514:4: ( ruleEString )
            // InternalRosParser.g:1515:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionServerAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosParser.g:1529:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Ns) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRosParser.g:1530:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionServerAccess().getNsKeyword_6_0());
                    			
                    // InternalRosParser.g:1534:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosParser.g:1535:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosParser.g:1535:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosParser.g:1536:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getActionServerAccess().getENDTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRosParser.g:1562:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // InternalRosParser.g:1562:53: (iv_ruleActionClient= ruleActionClient EOF )
            // InternalRosParser.g:1563:2: iv_ruleActionClient= ruleActionClient EOF
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
    // InternalRosParser.g:1569:1: ruleActionClient returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) ;
    public final EObject ruleActionClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_END_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:1575:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END ) )
            // InternalRosParser.g:1576:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            {
            // InternalRosParser.g:1576:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END )
            // InternalRosParser.g:1577:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN otherlv_4= Type_1 ( ( ruleEString ) ) (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )? this_END_8= RULE_END
            {
            // InternalRosParser.g:1577:3: ()
            // InternalRosParser.g:1578:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionClientAccess().getActionClientAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:1584:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosParser.g:1585:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosParser.g:1585:4: (lv_name_1_0= ruleEString )
            // InternalRosParser.g:1586:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionClientAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getActionClientAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_30); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getActionClientAccess().getBEGINTerminalRuleCall_3());
            		
            otherlv_4=(Token)match(input,Type_1,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getActionClientAccess().getTypeKeyword_4());
            		
            // InternalRosParser.g:1615:3: ( ( ruleEString ) )
            // InternalRosParser.g:1616:4: ( ruleEString )
            {
            // InternalRosParser.g:1616:4: ( ruleEString )
            // InternalRosParser.g:1617:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionClientAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosParser.g:1631:3: (otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Ns) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRosParser.g:1632:4: otherlv_6= Ns ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,Ns,FOLLOW_32); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getNsKeyword_6_0());
                    			
                    // InternalRosParser.g:1636:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRosParser.g:1637:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRosParser.g:1637:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRosParser.g:1638:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            this_END_8=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_8, grammarAccess.getActionClientAccess().getENDTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleDependency"
    // InternalRosParser.g:1664:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalRosParser.g:1664:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalRosParser.g:1665:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalRosParser.g:1671:1: ruleDependency returns [EObject current=null] : (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDependency_0 = null;

        EObject this_ExternalDependency_1 = null;



        	enterRule();

        try {
            // InternalRosParser.g:1677:2: ( (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) )
            // InternalRosParser.g:1678:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            {
            // InternalRosParser.g:1678:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)) ) {
                alt31=1;
            }
            else if ( (LA31_0==ExternalDependency) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalRosParser.g:1679:3: this_PackageDependency_0= rulePackageDependency
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
                    // InternalRosParser.g:1688:3: this_ExternalDependency_1= ruleExternalDependency
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
    // InternalRosParser.g:1700:1: entryRulePackageDependency returns [EObject current=null] : iv_rulePackageDependency= rulePackageDependency EOF ;
    public final EObject entryRulePackageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDependency = null;


        try {
            // InternalRosParser.g:1700:58: (iv_rulePackageDependency= rulePackageDependency EOF )
            // InternalRosParser.g:1701:2: iv_rulePackageDependency= rulePackageDependency EOF
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
    // InternalRosParser.g:1707:1: rulePackageDependency returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject rulePackageDependency() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRosParser.g:1713:2: ( ( ( ruleEString ) ) )
            // InternalRosParser.g:1714:2: ( ( ruleEString ) )
            {
            // InternalRosParser.g:1714:2: ( ( ruleEString ) )
            // InternalRosParser.g:1715:3: ( ruleEString )
            {
            // InternalRosParser.g:1715:3: ( ruleEString )
            // InternalRosParser.g:1716:4: ruleEString
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
    // InternalRosParser.g:1733:1: entryRuleExternalDependency returns [EObject current=null] : iv_ruleExternalDependency= ruleExternalDependency EOF ;
    public final EObject entryRuleExternalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDependency = null;


        try {
            // InternalRosParser.g:1733:59: (iv_ruleExternalDependency= ruleExternalDependency EOF )
            // InternalRosParser.g:1734:2: iv_ruleExternalDependency= ruleExternalDependency EOF
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
    // InternalRosParser.g:1740:1: ruleExternalDependency returns [EObject current=null] : ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:1746:2: ( ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRosParser.g:1747:2: ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRosParser.g:1747:2: ( () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) ) )
            // InternalRosParser.g:1748:3: () otherlv_1= ExternalDependency ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRosParser.g:1748:3: ()
            // InternalRosParser.g:1749:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ExternalDependency,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1());
            		
            // InternalRosParser.g:1759:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRosParser.g:1760:4: (lv_name_2_0= ruleEString )
            {
            // InternalRosParser.g:1760:4: (lv_name_2_0= ruleEString )
            // InternalRosParser.g:1761:5: lv_name_2_0= ruleEString
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
    // InternalRosParser.g:1782:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRosParser.g:1782:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRosParser.g:1783:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalRosParser.g:1789:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRosParser.g:1795:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRosParser.g:1796:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRosParser.g:1796:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt32=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt32=1;
                }
                break;
            case RelativeNamespace:
                {
                alt32=2;
                }
                break;
            case PrivateNamespace:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalRosParser.g:1797:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalRosParser.g:1806:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalRosParser.g:1815:3: this_PrivateNamespace_2= rulePrivateNamespace
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
    // InternalRosParser.g:1827:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRosParser.g:1827:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRosParser.g:1828:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalRosParser.g:1834:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= GraphName ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosParser.g:1840:2: (kw= GraphName )
            // InternalRosParser.g:1841:2: kw= GraphName
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
    // InternalRosParser.g:1849:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRosParser.g:1849:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRosParser.g:1850:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalRosParser.g:1856:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRosParser.g:1862:2: ( ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRosParser.g:1863:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRosParser.g:1863:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRosParser.g:1864:3: () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRosParser.g:1864:3: ()
            // InternalRosParser.g:1865:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,GlobalNamespace,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            // InternalRosParser.g:1875:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==LeftSquareBracket) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRosParser.g:1876:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRosParser.g:1880:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRosParser.g:1881:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRosParser.g:1881:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRosParser.g:1882:6: lv_parts_3_0= ruleGraphName
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

                    // InternalRosParser.g:1899:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==Comma) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalRosParser.g:1900:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_34); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRosParser.g:1904:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRosParser.g:1905:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRosParser.g:1905:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRosParser.g:1906:7: lv_parts_5_0= ruleGraphName
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
                    	    break loop33;
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
    // InternalRosParser.g:1933:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRosParser.g:1933:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRosParser.g:1934:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalRosParser.g:1940:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRosParser.g:1946:2: ( ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRosParser.g:1947:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRosParser.g:1947:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRosParser.g:1948:3: () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRosParser.g:1948:3: ()
            // InternalRosParser.g:1949:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,RelativeNamespace,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            // InternalRosParser.g:1959:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==LeftSquareBracket) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRosParser.g:1960:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRosParser.g:1964:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRosParser.g:1965:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRosParser.g:1965:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRosParser.g:1966:6: lv_parts_3_0= ruleGraphName
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

                    // InternalRosParser.g:1983:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==Comma) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalRosParser.g:1984:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_34); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRosParser.g:1988:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRosParser.g:1989:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRosParser.g:1989:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRosParser.g:1990:7: lv_parts_5_0= ruleGraphName
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
                    	    break loop35;
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
    // InternalRosParser.g:2017:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRosParser.g:2017:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRosParser.g:2018:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalRosParser.g:2024:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
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
            // InternalRosParser.g:2030:2: ( ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalRosParser.g:2031:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalRosParser.g:2031:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalRosParser.g:2032:3: () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalRosParser.g:2032:3: ()
            // InternalRosParser.g:2033:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,PrivateNamespace,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            // InternalRosParser.g:2043:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==LeftSquareBracket) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRosParser.g:2044:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalRosParser.g:2048:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalRosParser.g:2049:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalRosParser.g:2049:5: (lv_parts_3_0= ruleGraphName )
                    // InternalRosParser.g:2050:6: lv_parts_3_0= ruleGraphName
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

                    // InternalRosParser.g:2067:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==Comma) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalRosParser.g:2068:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_34); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalRosParser.g:2072:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalRosParser.g:2073:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalRosParser.g:2073:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalRosParser.g:2074:7: lv_parts_5_0= ruleGraphName
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
                    	    break loop37;
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


    // $ANTLR start "entryRuleParameter"
    // InternalRosParser.g:2101:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRosParser.g:2101:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRosParser.g:2102:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRosParser.g:2108:1: ruleParameter returns [EObject current=null] : ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= Type_1 ( (lv_type_7_0= ruleParameterType ) ) (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? this_END_10= RULE_END ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_BEGIN_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_END_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_namespace_5_0 = null;

        EObject lv_type_7_0 = null;

        EObject lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:2114:2: ( ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= Type_1 ( (lv_type_7_0= ruleParameterType ) ) (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? this_END_10= RULE_END ) )
            // InternalRosParser.g:2115:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= Type_1 ( (lv_type_7_0= ruleParameterType ) ) (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? this_END_10= RULE_END )
            {
            // InternalRosParser.g:2115:2: ( () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= Type_1 ( (lv_type_7_0= ruleParameterType ) ) (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? this_END_10= RULE_END )
            // InternalRosParser.g:2116:3: () ( (lv_name_1_0= ruleEString ) ) otherlv_2= Colon this_BEGIN_3= RULE_BEGIN (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= Type_1 ( (lv_type_7_0= ruleParameterType ) ) (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )? this_END_10= RULE_END
            {
            // InternalRosParser.g:2116:3: ()
            // InternalRosParser.g:2117:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:2123:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRosParser.g:2124:4: (lv_name_1_0= ruleEString )
            {
            // InternalRosParser.g:2124:4: (lv_name_1_0= ruleEString )
            // InternalRosParser.g:2125:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_2=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getColonKeyword_2());
            		
            this_BEGIN_3=(Token)match(input,RULE_BEGIN,FOLLOW_35); 

            			newLeafNode(this_BEGIN_3, grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_3());
            		
            // InternalRosParser.g:2150:3: (otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==Ns) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRosParser.g:2151:4: otherlv_4= Ns ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,Ns,FOLLOW_32); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getNsKeyword_4_0());
                    			
                    // InternalRosParser.g:2155:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalRosParser.g:2156:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalRosParser.g:2156:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalRosParser.g:2157:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_namespace_5_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_5_0,
                    							"de.fraunhofer.ipa.ros.Basics.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,Type_1,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getTypeKeyword_5());
            		
            // InternalRosParser.g:2179:3: ( (lv_type_7_0= ruleParameterType ) )
            // InternalRosParser.g:2180:4: (lv_type_7_0= ruleParameterType )
            {
            // InternalRosParser.g:2180:4: (lv_type_7_0= ruleParameterType )
            // InternalRosParser.g:2181:5: lv_type_7_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_37);
            lv_type_7_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"de.fraunhofer.ipa.ros.Basics.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRosParser.g:2198:3: (otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==Value_1) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRosParser.g:2199:4: otherlv_8= Value_1 ( (lv_value_9_0= ruleParameterValue ) )
                    {
                    otherlv_8=(Token)match(input,Value_1,FOLLOW_38); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getValueKeyword_7_0());
                    			
                    // InternalRosParser.g:2203:4: ( (lv_value_9_0= ruleParameterValue ) )
                    // InternalRosParser.g:2204:5: (lv_value_9_0= ruleParameterValue )
                    {
                    // InternalRosParser.g:2204:5: (lv_value_9_0= ruleParameterValue )
                    // InternalRosParser.g:2205:6: lv_value_9_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getValueParameterValueParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_18);
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

            this_END_10=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_10, grammarAccess.getParameterAccess().getENDTerminalRuleCall_8());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleParameterType"
    // InternalRosParser.g:2231:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRosParser.g:2231:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRosParser.g:2232:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalRosParser.g:2238:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
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
            // InternalRosParser.g:2244:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalRosParser.g:2245:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalRosParser.g:2245:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt41=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt41=1;
                }
                break;
            case Struct:
                {
                alt41=2;
                }
                break;
            case Integer:
                {
                alt41=3;
                }
                break;
            case String:
                {
                alt41=4;
                }
                break;
            case Double:
                {
                alt41=5;
                }
                break;
            case Boolean:
                {
                alt41=6;
                }
                break;
            case Base64:
                {
                alt41=7;
                }
                break;
            case RULE_BEGIN:
                {
                alt41=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalRosParser.g:2246:3: this_ParameterListType_0= ruleParameterListType
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
                    // InternalRosParser.g:2255:3: this_ParameterStructType_1= ruleParameterStructType
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
                    // InternalRosParser.g:2264:3: this_ParameterIntegerType_2= ruleParameterIntegerType
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
                    // InternalRosParser.g:2273:3: this_ParameterStringType_3= ruleParameterStringType
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
                    // InternalRosParser.g:2282:3: this_ParameterDoubleType_4= ruleParameterDoubleType
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
                    // InternalRosParser.g:2291:3: this_ParameterBooleanType_5= ruleParameterBooleanType
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
                    // InternalRosParser.g:2300:3: this_ParameterBase64Type_6= ruleParameterBase64Type
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
                    // InternalRosParser.g:2309:3: this_ParameterArrayType_7= ruleParameterArrayType
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
    // InternalRosParser.g:2321:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRosParser.g:2321:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRosParser.g:2322:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalRosParser.g:2328:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
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
            // InternalRosParser.g:2334:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalRosParser.g:2335:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalRosParser.g:2335:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt42=7;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // InternalRosParser.g:2336:3: this_ParameterString_0= ruleParameterString
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
                    // InternalRosParser.g:2345:3: this_ParameterBase64_1= ruleParameterBase64
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
                    // InternalRosParser.g:2354:3: this_ParameterInteger_2= ruleParameterInteger
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
                    // InternalRosParser.g:2363:3: this_ParameterDouble_3= ruleParameterDouble
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
                    // InternalRosParser.g:2372:3: this_ParameterBoolean_4= ruleParameterBoolean
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
                    // InternalRosParser.g:2381:3: this_ParameterList_5= ruleParameterList
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
                    // InternalRosParser.g:2390:3: this_ParameterStruct_6= ruleParameterStruct
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
    // InternalRosParser.g:2402:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRosParser.g:2402:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRosParser.g:2403:2: iv_ruleParameterListType= ruleParameterListType EOF
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
    // InternalRosParser.g:2409:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) ;
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
            // InternalRosParser.g:2415:2: ( ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRosParser.g:2416:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRosParser.g:2416:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            // InternalRosParser.g:2417:3: () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRosParser.g:2417:3: ()
            // InternalRosParser.g:2418:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,List,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalRosParser.g:2432:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalRosParser.g:2433:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalRosParser.g:2433:4: (lv_sequence_3_0= ruleParameterType )
            // InternalRosParser.g:2434:5: lv_sequence_3_0= ruleParameterType
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

            // InternalRosParser.g:2451:3: (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==Comma) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRosParser.g:2452:4: otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_36); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRosParser.g:2456:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalRosParser.g:2457:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalRosParser.g:2457:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalRosParser.g:2458:6: lv_sequence_5_0= ruleParameterType
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
            	    break loop43;
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
    // InternalRosParser.g:2484:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRosParser.g:2484:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRosParser.g:2485:2: iv_ruleParameterStructType= ruleParameterStructType EOF
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
    // InternalRosParser.g:2491:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) ;
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
            // InternalRosParser.g:2497:2: ( ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalRosParser.g:2498:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalRosParser.g:2498:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            // InternalRosParser.g:2499:3: () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalRosParser.g:2499:3: ()
            // InternalRosParser.g:2500:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Struct,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalRosParser.g:2514:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalRosParser.g:2515:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalRosParser.g:2515:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalRosParser.g:2516:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
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

            // InternalRosParser.g:2533:3: (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Comma) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalRosParser.g:2534:4: otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRosParser.g:2538:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalRosParser.g:2539:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalRosParser.g:2539:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalRosParser.g:2540:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
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
            	    break loop44;
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
    // InternalRosParser.g:2566:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRosParser.g:2566:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRosParser.g:2567:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
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
    // InternalRosParser.g:2573:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:2579:2: ( ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) )
            // InternalRosParser.g:2580:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            {
            // InternalRosParser.g:2580:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            // InternalRosParser.g:2581:3: () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            {
            // InternalRosParser.g:2581:3: ()
            // InternalRosParser.g:2582:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Integer,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
            		
            // InternalRosParser.g:2592:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Default) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_DECINT) ) {
                    alt45=1;
                }
            }
            switch (alt45) {
                case 1 :
                    // InternalRosParser.g:2593:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRosParser.g:2597:4: ( (lv_default_3_0= ruleParameterInteger ) )
                    // InternalRosParser.g:2598:5: (lv_default_3_0= ruleParameterInteger )
                    {
                    // InternalRosParser.g:2598:5: (lv_default_3_0= ruleParameterInteger )
                    // InternalRosParser.g:2599:6: lv_default_3_0= ruleParameterInteger
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
    // InternalRosParser.g:2621:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRosParser.g:2621:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRosParser.g:2622:2: iv_ruleParameterStringType= ruleParameterStringType EOF
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
    // InternalRosParser.g:2628:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:2634:2: ( ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) )
            // InternalRosParser.g:2635:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            {
            // InternalRosParser.g:2635:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            // InternalRosParser.g:2636:3: () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            {
            // InternalRosParser.g:2636:3: ()
            // InternalRosParser.g:2637:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            		
            // InternalRosParser.g:2647:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==Default) ) {
                int LA46_1 = input.LA(2);

                if ( ((LA46_1>=RULE_ID && LA46_1<=RULE_STRING)) ) {
                    alt46=1;
                }
            }
            switch (alt46) {
                case 1 :
                    // InternalRosParser.g:2648:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRosParser.g:2652:4: ( (lv_default_3_0= ruleParameterString ) )
                    // InternalRosParser.g:2653:5: (lv_default_3_0= ruleParameterString )
                    {
                    // InternalRosParser.g:2653:5: (lv_default_3_0= ruleParameterString )
                    // InternalRosParser.g:2654:6: lv_default_3_0= ruleParameterString
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
    // InternalRosParser.g:2676:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRosParser.g:2676:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRosParser.g:2677:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
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
    // InternalRosParser.g:2683:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:2689:2: ( ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) )
            // InternalRosParser.g:2690:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            {
            // InternalRosParser.g:2690:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            // InternalRosParser.g:2691:3: () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            {
            // InternalRosParser.g:2691:3: ()
            // InternalRosParser.g:2692:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Double,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
            		
            // InternalRosParser.g:2702:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==Default) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_DOUBLE) ) {
                    alt47=1;
                }
            }
            switch (alt47) {
                case 1 :
                    // InternalRosParser.g:2703:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_41); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRosParser.g:2707:4: ( (lv_default_3_0= ruleParameterDouble ) )
                    // InternalRosParser.g:2708:5: (lv_default_3_0= ruleParameterDouble )
                    {
                    // InternalRosParser.g:2708:5: (lv_default_3_0= ruleParameterDouble )
                    // InternalRosParser.g:2709:6: lv_default_3_0= ruleParameterDouble
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
    // InternalRosParser.g:2731:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRosParser.g:2731:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRosParser.g:2732:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
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
    // InternalRosParser.g:2738:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:2744:2: ( ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) )
            // InternalRosParser.g:2745:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            {
            // InternalRosParser.g:2745:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            // InternalRosParser.g:2746:3: () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            {
            // InternalRosParser.g:2746:3: ()
            // InternalRosParser.g:2747:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Boolean,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
            		
            // InternalRosParser.g:2757:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Default) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==RULE_BOOLEAN) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // InternalRosParser.g:2758:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRosParser.g:2762:4: ( (lv_default_3_0= ruleParameterBoolean ) )
                    // InternalRosParser.g:2763:5: (lv_default_3_0= ruleParameterBoolean )
                    {
                    // InternalRosParser.g:2763:5: (lv_default_3_0= ruleParameterBoolean )
                    // InternalRosParser.g:2764:6: lv_default_3_0= ruleParameterBoolean
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
    // InternalRosParser.g:2786:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRosParser.g:2786:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRosParser.g:2787:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
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
    // InternalRosParser.g:2793:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:2799:2: ( ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) )
            // InternalRosParser.g:2800:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            {
            // InternalRosParser.g:2800:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            // InternalRosParser.g:2801:3: () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            {
            // InternalRosParser.g:2801:3: ()
            // InternalRosParser.g:2802:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Base64,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
            		
            // InternalRosParser.g:2812:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Default) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_BINARY) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // InternalRosParser.g:2813:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRosParser.g:2817:4: ( (lv_default_3_0= ruleParameterBase64 ) )
                    // InternalRosParser.g:2818:5: (lv_default_3_0= ruleParameterBase64 )
                    {
                    // InternalRosParser.g:2818:5: (lv_default_3_0= ruleParameterBase64 )
                    // InternalRosParser.g:2819:6: lv_default_3_0= ruleParameterBase64
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
    // InternalRosParser.g:2841:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRosParser.g:2841:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRosParser.g:2842:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
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
    // InternalRosParser.g:2848:1: ruleParameterArrayType returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END ) ;
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
            // InternalRosParser.g:2854:2: ( (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END ) )
            // InternalRosParser.g:2855:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END )
            {
            // InternalRosParser.g:2855:2: (this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END )
            // InternalRosParser.g:2856:3: this_BEGIN_0= RULE_BEGIN otherlv_1= Array ( (lv_type_2_0= ruleParameterType ) ) (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )? this_END_5= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_44); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getParameterArrayTypeAccess().getBEGINTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,Array,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_1());
            		
            // InternalRosParser.g:2864:3: ( (lv_type_2_0= ruleParameterType ) )
            // InternalRosParser.g:2865:4: (lv_type_2_0= ruleParameterType )
            {
            // InternalRosParser.g:2865:4: (lv_type_2_0= ruleParameterType )
            // InternalRosParser.g:2866:5: lv_type_2_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalRosParser.g:2883:3: (otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Default) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalRosParser.g:2884:4: otherlv_3= Default ( (lv_default_4_0= ruleParameterList ) )
                    {
                    otherlv_3=(Token)match(input,Default,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRosParser.g:2888:4: ( (lv_default_4_0= ruleParameterList ) )
                    // InternalRosParser.g:2889:5: (lv_default_4_0= ruleParameterList )
                    {
                    // InternalRosParser.g:2889:5: (lv_default_4_0= ruleParameterList )
                    // InternalRosParser.g:2890:6: lv_default_4_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
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
    // InternalRosParser.g:2916:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalRosParser.g:2916:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalRosParser.g:2917:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalRosParser.g:2923:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:2929:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalRosParser.g:2930:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalRosParser.g:2930:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            // InternalRosParser.g:2931:3: () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalRosParser.g:2931:3: ()
            // InternalRosParser.g:2932:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRosParser.g:2942:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRosParser.g:2943:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRosParser.g:2943:4: (lv_value_2_0= ruleParameterValue )
            // InternalRosParser.g:2944:5: lv_value_2_0= ruleParameterValue
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

            // InternalRosParser.g:2961:3: (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==Comma) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalRosParser.g:2962:4: otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_38); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRosParser.g:2966:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalRosParser.g:2967:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalRosParser.g:2967:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalRosParser.g:2968:6: lv_value_4_0= ruleParameterValue
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
            	    break loop51;
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
    // InternalRosParser.g:2994:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRosParser.g:2994:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRosParser.g:2995:2: iv_ruleParameterAny= ruleParameterAny EOF
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
    // InternalRosParser.g:3001:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:3007:2: ( ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) )
            // InternalRosParser.g:3008:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            {
            // InternalRosParser.g:3008:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            // InternalRosParser.g:3009:3: () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            {
            // InternalRosParser.g:3009:3: ()
            // InternalRosParser.g:3010:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ParameterAny,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            // InternalRosParser.g:3020:3: (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Value) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalRosParser.g:3021:4: otherlv_2= Value ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Value,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getValueKeyword_2_0());
                    			
                    // InternalRosParser.g:3025:4: ( (lv_value_3_0= ruleEString ) )
                    // InternalRosParser.g:3026:5: (lv_value_3_0= ruleEString )
                    {
                    // InternalRosParser.g:3026:5: (lv_value_3_0= ruleEString )
                    // InternalRosParser.g:3027:6: lv_value_3_0= ruleEString
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
    // InternalRosParser.g:3049:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRosParser.g:3049:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRosParser.g:3050:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalRosParser.g:3056:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:3062:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRosParser.g:3063:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRosParser.g:3063:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRosParser.g:3064:3: (lv_value_0_0= ruleEString )
            {
            // InternalRosParser.g:3064:3: (lv_value_0_0= ruleEString )
            // InternalRosParser.g:3065:4: lv_value_0_0= ruleEString
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
    // InternalRosParser.g:3085:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRosParser.g:3085:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRosParser.g:3086:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalRosParser.g:3092:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:3098:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalRosParser.g:3099:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalRosParser.g:3099:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalRosParser.g:3100:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalRosParser.g:3100:3: (lv_value_0_0= ruleBase64Binary )
            // InternalRosParser.g:3101:4: lv_value_0_0= ruleBase64Binary
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
    // InternalRosParser.g:3121:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRosParser.g:3121:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRosParser.g:3122:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalRosParser.g:3128:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:3134:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalRosParser.g:3135:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalRosParser.g:3135:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalRosParser.g:3136:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalRosParser.g:3136:3: (lv_value_0_0= ruleInteger0 )
            // InternalRosParser.g:3137:4: lv_value_0_0= ruleInteger0
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
    // InternalRosParser.g:3157:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRosParser.g:3157:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRosParser.g:3158:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalRosParser.g:3164:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:3170:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalRosParser.g:3171:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalRosParser.g:3171:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalRosParser.g:3172:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalRosParser.g:3172:3: (lv_value_0_0= ruleDouble0 )
            // InternalRosParser.g:3173:4: lv_value_0_0= ruleDouble0
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
    // InternalRosParser.g:3193:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRosParser.g:3193:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRosParser.g:3194:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalRosParser.g:3200:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:3206:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalRosParser.g:3207:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalRosParser.g:3207:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalRosParser.g:3208:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalRosParser.g:3208:3: (lv_value_0_0= ruleboolean0 )
            // InternalRosParser.g:3209:4: lv_value_0_0= ruleboolean0
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
    // InternalRosParser.g:3229:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRosParser.g:3229:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRosParser.g:3230:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalRosParser.g:3236:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? ) ;
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
            // InternalRosParser.g:3242:2: ( ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? ) )
            // InternalRosParser.g:3243:2: ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? )
            {
            // InternalRosParser.g:3243:2: ( () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )? )
            // InternalRosParser.g:3244:3: () (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )?
            {
            // InternalRosParser.g:3244:3: ()
            // InternalRosParser.g:3245:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalRosParser.g:3251:3: (otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LeftSquareBracket) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalRosParser.g:3252:4: otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )* otherlv_7= RightSquareBracket
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalRosParser.g:3256:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalRosParser.g:3257:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalRosParser.g:3257:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalRosParser.g:3258:6: lv_value_2_0= ruleParameterStructMember
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

                    // InternalRosParser.g:3275:4: (otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==Comma) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalRosParser.g:3276:5: otherlv_3= Comma otherlv_4= LeftSquareBracket ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= RightSquareBracket
                    	    {
                    	    otherlv_3=(Token)match(input,Comma,FOLLOW_9); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,LeftSquareBracket,FOLLOW_7); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_2_1());
                    	    				
                    	    // InternalRosParser.g:3284:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalRosParser.g:3285:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRosParser.g:3285:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalRosParser.g:3286:7: lv_value_5_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop53;
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
    // InternalRosParser.g:3317:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRosParser.g:3317:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRosParser.g:3318:2: iv_ruleParameterDate= ruleParameterDate EOF
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
    // InternalRosParser.g:3324:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:3330:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalRosParser.g:3331:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalRosParser.g:3331:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalRosParser.g:3332:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalRosParser.g:3332:3: (lv_value_0_0= ruleDateTime0 )
            // InternalRosParser.g:3333:4: lv_value_0_0= ruleDateTime0
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
    // InternalRosParser.g:3353:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRosParser.g:3353:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRosParser.g:3354:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalRosParser.g:3360:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:3366:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END ) )
            // InternalRosParser.g:3367:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END )
            {
            // InternalRosParser.g:3367:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END )
            // InternalRosParser.g:3368:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterValue ) ) this_END_4= RULE_END
            {
            // InternalRosParser.g:3368:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosParser.g:3369:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosParser.g:3369:4: (lv_name_0_0= ruleEString )
            // InternalRosParser.g:3370:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
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

            otherlv_1=(Token)match(input,Colon,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_38); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getParameterStructMemberAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRosParser.g:3395:3: ( (lv_value_3_0= ruleParameterValue ) )
            // InternalRosParser.g:3396:4: (lv_value_3_0= ruleParameterValue )
            {
            // InternalRosParser.g:3396:4: (lv_value_3_0= ruleParameterValue )
            // InternalRosParser.g:3397:5: lv_value_3_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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
    // InternalRosParser.g:3422:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRosParser.g:3422:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRosParser.g:3423:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
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
    // InternalRosParser.g:3429:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRosParser.g:3435:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalRosParser.g:3436:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalRosParser.g:3436:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalRosParser.g:3437:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalRosParser.g:3437:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRosParser.g:3438:4: (lv_name_0_0= ruleEString )
            {
            // InternalRosParser.g:3438:4: (lv_name_0_0= ruleEString )
            // InternalRosParser.g:3439:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalRosParser.g:3456:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalRosParser.g:3457:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalRosParser.g:3457:4: (lv_type_1_0= ruleParameterType )
            // InternalRosParser.g:3458:5: lv_type_1_0= ruleParameterType
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
    // InternalRosParser.g:3479:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRosParser.g:3479:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRosParser.g:3480:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalRosParser.g:3486:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalRosParser.g:3492:2: (this_BINARY_0= RULE_BINARY )
            // InternalRosParser.g:3493:2: this_BINARY_0= RULE_BINARY
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
    // InternalRosParser.g:3503:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalRosParser.g:3503:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalRosParser.g:3504:2: iv_ruleboolean0= ruleboolean0 EOF
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
    // InternalRosParser.g:3510:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalRosParser.g:3516:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalRosParser.g:3517:2: this_BOOLEAN_0= RULE_BOOLEAN
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
    // InternalRosParser.g:3527:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalRosParser.g:3527:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalRosParser.g:3528:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalRosParser.g:3534:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalRosParser.g:3540:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalRosParser.g:3541:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalRosParser.g:3551:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalRosParser.g:3551:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalRosParser.g:3552:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalRosParser.g:3558:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalRosParser.g:3564:2: (this_DECINT_0= RULE_DECINT )
            // InternalRosParser.g:3565:2: this_DECINT_0= RULE_DECINT
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
    // InternalRosParser.g:3575:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalRosParser.g:3575:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalRosParser.g:3576:2: iv_ruleDateTime0= ruleDateTime0 EOF
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
    // InternalRosParser.g:3582:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalRosParser.g:3588:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalRosParser.g:3589:2: this_DATE_TIME_0= RULE_DATE_TIME
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
    // InternalRosParser.g:3599:1: entryRuleMessagePart returns [EObject current=null] : iv_ruleMessagePart= ruleMessagePart EOF ;
    public final EObject entryRuleMessagePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessagePart = null;


        try {
            // InternalRosParser.g:3599:52: (iv_ruleMessagePart= ruleMessagePart EOF )
            // InternalRosParser.g:3600:2: iv_ruleMessagePart= ruleMessagePart EOF
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
    // InternalRosParser.g:3606:1: ruleMessagePart returns [EObject current=null] : ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) ) ;
    public final EObject ruleMessagePart() throws RecognitionException {
        EObject current = null;

        Token lv_Data_1_2=null;
        EObject lv_Type_0_0 = null;

        AntlrDatatypeRuleToken lv_Data_1_1 = null;

        AntlrDatatypeRuleToken lv_Data_1_3 = null;



        	enterRule();

        try {
            // InternalRosParser.g:3612:2: ( ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) ) )
            // InternalRosParser.g:3613:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) )
            {
            // InternalRosParser.g:3613:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) )
            // InternalRosParser.g:3614:3: ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) )
            {
            // InternalRosParser.g:3614:3: ( (lv_Type_0_0= ruleAbstractType ) )
            // InternalRosParser.g:3615:4: (lv_Type_0_0= ruleAbstractType )
            {
            // InternalRosParser.g:3615:4: (lv_Type_0_0= ruleAbstractType )
            // InternalRosParser.g:3616:5: lv_Type_0_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getMessagePartAccess().getTypeAbstractTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_48);
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

            // InternalRosParser.g:3633:3: ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) )
            // InternalRosParser.g:3634:4: ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) )
            {
            // InternalRosParser.g:3634:4: ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) )
            // InternalRosParser.g:3635:5: (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString )
            {
            // InternalRosParser.g:3635:5: (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString )
            int alt55=3;
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
                alt55=1;
                }
                break;
            case RULE_MESSAGE_ASIGMENT:
                {
                alt55=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
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
                    // InternalRosParser.g:3636:6: lv_Data_1_1= ruleKEYWORD
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
                    // InternalRosParser.g:3652:6: lv_Data_1_2= RULE_MESSAGE_ASIGMENT
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
                    // InternalRosParser.g:3667:6: lv_Data_1_3= ruleEString
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
    // InternalRosParser.g:3689:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalRosParser.g:3689:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalRosParser.g:3690:2: iv_ruleAbstractType= ruleAbstractType EOF
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
    // InternalRosParser.g:3696:1: ruleAbstractType returns [EObject current=null] : (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray ) ;
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
            // InternalRosParser.g:3702:2: ( (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray ) )
            // InternalRosParser.g:3703:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )
            {
            // InternalRosParser.g:3703:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )
            int alt56=33;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalRosParser.g:3704:3: this_bool_0= rulebool
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
                    // InternalRosParser.g:3713:3: this_int8_1= ruleint8
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
                    // InternalRosParser.g:3722:3: this_uint8_2= ruleuint8
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
                    // InternalRosParser.g:3731:3: this_int16_3= ruleint16
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
                    // InternalRosParser.g:3740:3: this_uint16_4= ruleuint16
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
                    // InternalRosParser.g:3749:3: this_int32_5= ruleint32
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
                    // InternalRosParser.g:3758:3: this_uint32_6= ruleuint32
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
                    // InternalRosParser.g:3767:3: this_int64_7= ruleint64
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
                    // InternalRosParser.g:3776:3: this_uint64_8= ruleuint64
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
                    // InternalRosParser.g:3785:3: this_float32_9= rulefloat32
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
                    // InternalRosParser.g:3794:3: this_float64_10= rulefloat64
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
                    // InternalRosParser.g:3803:3: this_string0_11= rulestring0
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
                    // InternalRosParser.g:3812:3: this_byte_12= rulebyte
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
                    // InternalRosParser.g:3821:3: this_time_13= ruletime
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
                    // InternalRosParser.g:3830:3: this_duration_14= ruleduration
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
                    // InternalRosParser.g:3839:3: this_Header_15= ruleHeader
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
                    // InternalRosParser.g:3848:3: this_boolArray_16= ruleboolArray
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
                    // InternalRosParser.g:3857:3: this_int8Array_17= ruleint8Array
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
                    // InternalRosParser.g:3866:3: this_uint8Array_18= ruleuint8Array
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
                    // InternalRosParser.g:3875:3: this_int16Array_19= ruleint16Array
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
                    // InternalRosParser.g:3884:3: this_uint16Array_20= ruleuint16Array
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
                    // InternalRosParser.g:3893:3: this_int32Array_21= ruleint32Array
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
                    // InternalRosParser.g:3902:3: this_uint32Array_22= ruleuint32Array
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
                    // InternalRosParser.g:3911:3: this_int64Array_23= ruleint64Array
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
                    // InternalRosParser.g:3920:3: this_uint64Array_24= ruleuint64Array
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
                    // InternalRosParser.g:3929:3: this_float32Array_25= rulefloat32Array
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
                    // InternalRosParser.g:3938:3: this_float64Array_26= rulefloat64Array
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
                    // InternalRosParser.g:3947:3: this_string0Array_27= rulestring0Array
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
                    // InternalRosParser.g:3956:3: this_byteArray_28= rulebyteArray
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
                    // InternalRosParser.g:3965:3: this_SpecBaseRef_29= ruleSpecBaseRef
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
                    // InternalRosParser.g:3974:3: this_ArraySpecRef_30= ruleArraySpecRef
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
                    // InternalRosParser.g:3983:3: this_char_31= rulechar
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
                    // InternalRosParser.g:3992:3: this_charArray_32= rulecharArray
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
    // InternalRosParser.g:4004:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalRosParser.g:4004:45: (iv_rulebool= rulebool EOF )
            // InternalRosParser.g:4005:2: iv_rulebool= rulebool EOF
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
    // InternalRosParser.g:4011:1: rulebool returns [EObject current=null] : ( () otherlv_1= Bool ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4017:2: ( ( () otherlv_1= Bool ) )
            // InternalRosParser.g:4018:2: ( () otherlv_1= Bool )
            {
            // InternalRosParser.g:4018:2: ( () otherlv_1= Bool )
            // InternalRosParser.g:4019:3: () otherlv_1= Bool
            {
            // InternalRosParser.g:4019:3: ()
            // InternalRosParser.g:4020:4: 
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
    // InternalRosParser.g:4034:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalRosParser.g:4034:45: (iv_ruleint8= ruleint8 EOF )
            // InternalRosParser.g:4035:2: iv_ruleint8= ruleint8 EOF
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
    // InternalRosParser.g:4041:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= Int8 ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4047:2: ( ( () otherlv_1= Int8 ) )
            // InternalRosParser.g:4048:2: ( () otherlv_1= Int8 )
            {
            // InternalRosParser.g:4048:2: ( () otherlv_1= Int8 )
            // InternalRosParser.g:4049:3: () otherlv_1= Int8
            {
            // InternalRosParser.g:4049:3: ()
            // InternalRosParser.g:4050:4: 
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
    // InternalRosParser.g:4064:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalRosParser.g:4064:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalRosParser.g:4065:2: iv_ruleuint8= ruleuint8 EOF
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
    // InternalRosParser.g:4071:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= Uint8 ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4077:2: ( ( () otherlv_1= Uint8 ) )
            // InternalRosParser.g:4078:2: ( () otherlv_1= Uint8 )
            {
            // InternalRosParser.g:4078:2: ( () otherlv_1= Uint8 )
            // InternalRosParser.g:4079:3: () otherlv_1= Uint8
            {
            // InternalRosParser.g:4079:3: ()
            // InternalRosParser.g:4080:4: 
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
    // InternalRosParser.g:4094:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalRosParser.g:4094:46: (iv_ruleint16= ruleint16 EOF )
            // InternalRosParser.g:4095:2: iv_ruleint16= ruleint16 EOF
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
    // InternalRosParser.g:4101:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= Int16 ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4107:2: ( ( () otherlv_1= Int16 ) )
            // InternalRosParser.g:4108:2: ( () otherlv_1= Int16 )
            {
            // InternalRosParser.g:4108:2: ( () otherlv_1= Int16 )
            // InternalRosParser.g:4109:3: () otherlv_1= Int16
            {
            // InternalRosParser.g:4109:3: ()
            // InternalRosParser.g:4110:4: 
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
    // InternalRosParser.g:4124:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalRosParser.g:4124:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalRosParser.g:4125:2: iv_ruleuint16= ruleuint16 EOF
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
    // InternalRosParser.g:4131:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= Uint16 ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4137:2: ( ( () otherlv_1= Uint16 ) )
            // InternalRosParser.g:4138:2: ( () otherlv_1= Uint16 )
            {
            // InternalRosParser.g:4138:2: ( () otherlv_1= Uint16 )
            // InternalRosParser.g:4139:3: () otherlv_1= Uint16
            {
            // InternalRosParser.g:4139:3: ()
            // InternalRosParser.g:4140:4: 
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
    // InternalRosParser.g:4154:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalRosParser.g:4154:46: (iv_ruleint32= ruleint32 EOF )
            // InternalRosParser.g:4155:2: iv_ruleint32= ruleint32 EOF
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
    // InternalRosParser.g:4161:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= Int32 ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4167:2: ( ( () otherlv_1= Int32 ) )
            // InternalRosParser.g:4168:2: ( () otherlv_1= Int32 )
            {
            // InternalRosParser.g:4168:2: ( () otherlv_1= Int32 )
            // InternalRosParser.g:4169:3: () otherlv_1= Int32
            {
            // InternalRosParser.g:4169:3: ()
            // InternalRosParser.g:4170:4: 
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
    // InternalRosParser.g:4184:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalRosParser.g:4184:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalRosParser.g:4185:2: iv_ruleuint32= ruleuint32 EOF
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
    // InternalRosParser.g:4191:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= Uint32 ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4197:2: ( ( () otherlv_1= Uint32 ) )
            // InternalRosParser.g:4198:2: ( () otherlv_1= Uint32 )
            {
            // InternalRosParser.g:4198:2: ( () otherlv_1= Uint32 )
            // InternalRosParser.g:4199:3: () otherlv_1= Uint32
            {
            // InternalRosParser.g:4199:3: ()
            // InternalRosParser.g:4200:4: 
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
    // InternalRosParser.g:4214:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalRosParser.g:4214:46: (iv_ruleint64= ruleint64 EOF )
            // InternalRosParser.g:4215:2: iv_ruleint64= ruleint64 EOF
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
    // InternalRosParser.g:4221:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= Int64 ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4227:2: ( ( () otherlv_1= Int64 ) )
            // InternalRosParser.g:4228:2: ( () otherlv_1= Int64 )
            {
            // InternalRosParser.g:4228:2: ( () otherlv_1= Int64 )
            // InternalRosParser.g:4229:3: () otherlv_1= Int64
            {
            // InternalRosParser.g:4229:3: ()
            // InternalRosParser.g:4230:4: 
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
    // InternalRosParser.g:4244:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalRosParser.g:4244:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalRosParser.g:4245:2: iv_ruleuint64= ruleuint64 EOF
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
    // InternalRosParser.g:4251:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= Uint64 ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4257:2: ( ( () otherlv_1= Uint64 ) )
            // InternalRosParser.g:4258:2: ( () otherlv_1= Uint64 )
            {
            // InternalRosParser.g:4258:2: ( () otherlv_1= Uint64 )
            // InternalRosParser.g:4259:3: () otherlv_1= Uint64
            {
            // InternalRosParser.g:4259:3: ()
            // InternalRosParser.g:4260:4: 
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
    // InternalRosParser.g:4274:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalRosParser.g:4274:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalRosParser.g:4275:2: iv_rulefloat32= rulefloat32 EOF
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
    // InternalRosParser.g:4281:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= Float32 ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4287:2: ( ( () otherlv_1= Float32 ) )
            // InternalRosParser.g:4288:2: ( () otherlv_1= Float32 )
            {
            // InternalRosParser.g:4288:2: ( () otherlv_1= Float32 )
            // InternalRosParser.g:4289:3: () otherlv_1= Float32
            {
            // InternalRosParser.g:4289:3: ()
            // InternalRosParser.g:4290:4: 
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
    // InternalRosParser.g:4304:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalRosParser.g:4304:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalRosParser.g:4305:2: iv_rulefloat64= rulefloat64 EOF
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
    // InternalRosParser.g:4311:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= Float64 ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4317:2: ( ( () otherlv_1= Float64 ) )
            // InternalRosParser.g:4318:2: ( () otherlv_1= Float64 )
            {
            // InternalRosParser.g:4318:2: ( () otherlv_1= Float64 )
            // InternalRosParser.g:4319:3: () otherlv_1= Float64
            {
            // InternalRosParser.g:4319:3: ()
            // InternalRosParser.g:4320:4: 
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
    // InternalRosParser.g:4334:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalRosParser.g:4334:48: (iv_rulestring0= rulestring0 EOF )
            // InternalRosParser.g:4335:2: iv_rulestring0= rulestring0 EOF
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
    // InternalRosParser.g:4341:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= String_1 ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4347:2: ( ( () otherlv_1= String_1 ) )
            // InternalRosParser.g:4348:2: ( () otherlv_1= String_1 )
            {
            // InternalRosParser.g:4348:2: ( () otherlv_1= String_1 )
            // InternalRosParser.g:4349:3: () otherlv_1= String_1
            {
            // InternalRosParser.g:4349:3: ()
            // InternalRosParser.g:4350:4: 
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
    // InternalRosParser.g:4364:1: entryRulechar returns [EObject current=null] : iv_rulechar= rulechar EOF ;
    public final EObject entryRulechar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechar = null;


        try {
            // InternalRosParser.g:4364:45: (iv_rulechar= rulechar EOF )
            // InternalRosParser.g:4365:2: iv_rulechar= rulechar EOF
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
    // InternalRosParser.g:4371:1: rulechar returns [EObject current=null] : ( () otherlv_1= Char ) ;
    public final EObject rulechar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4377:2: ( ( () otherlv_1= Char ) )
            // InternalRosParser.g:4378:2: ( () otherlv_1= Char )
            {
            // InternalRosParser.g:4378:2: ( () otherlv_1= Char )
            // InternalRosParser.g:4379:3: () otherlv_1= Char
            {
            // InternalRosParser.g:4379:3: ()
            // InternalRosParser.g:4380:4: 
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
    // InternalRosParser.g:4394:1: entryRulebyte returns [EObject current=null] : iv_rulebyte= rulebyte EOF ;
    public final EObject entryRulebyte() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyte = null;


        try {
            // InternalRosParser.g:4394:45: (iv_rulebyte= rulebyte EOF )
            // InternalRosParser.g:4395:2: iv_rulebyte= rulebyte EOF
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
    // InternalRosParser.g:4401:1: rulebyte returns [EObject current=null] : ( () otherlv_1= Byte ) ;
    public final EObject rulebyte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4407:2: ( ( () otherlv_1= Byte ) )
            // InternalRosParser.g:4408:2: ( () otherlv_1= Byte )
            {
            // InternalRosParser.g:4408:2: ( () otherlv_1= Byte )
            // InternalRosParser.g:4409:3: () otherlv_1= Byte
            {
            // InternalRosParser.g:4409:3: ()
            // InternalRosParser.g:4410:4: 
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
    // InternalRosParser.g:4424:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalRosParser.g:4424:45: (iv_ruletime= ruletime EOF )
            // InternalRosParser.g:4425:2: iv_ruletime= ruletime EOF
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
    // InternalRosParser.g:4431:1: ruletime returns [EObject current=null] : ( () otherlv_1= Time ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4437:2: ( ( () otherlv_1= Time ) )
            // InternalRosParser.g:4438:2: ( () otherlv_1= Time )
            {
            // InternalRosParser.g:4438:2: ( () otherlv_1= Time )
            // InternalRosParser.g:4439:3: () otherlv_1= Time
            {
            // InternalRosParser.g:4439:3: ()
            // InternalRosParser.g:4440:4: 
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
    // InternalRosParser.g:4454:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalRosParser.g:4454:49: (iv_ruleduration= ruleduration EOF )
            // InternalRosParser.g:4455:2: iv_ruleduration= ruleduration EOF
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
    // InternalRosParser.g:4461:1: ruleduration returns [EObject current=null] : ( () otherlv_1= Duration ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4467:2: ( ( () otherlv_1= Duration ) )
            // InternalRosParser.g:4468:2: ( () otherlv_1= Duration )
            {
            // InternalRosParser.g:4468:2: ( () otherlv_1= Duration )
            // InternalRosParser.g:4469:3: () otherlv_1= Duration
            {
            // InternalRosParser.g:4469:3: ()
            // InternalRosParser.g:4470:4: 
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
    // InternalRosParser.g:4484:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalRosParser.g:4484:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalRosParser.g:4485:2: iv_ruleboolArray= ruleboolArray EOF
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
    // InternalRosParser.g:4491:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= Bool_1 ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4497:2: ( ( () otherlv_1= Bool_1 ) )
            // InternalRosParser.g:4498:2: ( () otherlv_1= Bool_1 )
            {
            // InternalRosParser.g:4498:2: ( () otherlv_1= Bool_1 )
            // InternalRosParser.g:4499:3: () otherlv_1= Bool_1
            {
            // InternalRosParser.g:4499:3: ()
            // InternalRosParser.g:4500:4: 
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
    // InternalRosParser.g:4514:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalRosParser.g:4514:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalRosParser.g:4515:2: iv_ruleint8Array= ruleint8Array EOF
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
    // InternalRosParser.g:4521:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= Int8_1 ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4527:2: ( ( () otherlv_1= Int8_1 ) )
            // InternalRosParser.g:4528:2: ( () otherlv_1= Int8_1 )
            {
            // InternalRosParser.g:4528:2: ( () otherlv_1= Int8_1 )
            // InternalRosParser.g:4529:3: () otherlv_1= Int8_1
            {
            // InternalRosParser.g:4529:3: ()
            // InternalRosParser.g:4530:4: 
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
    // InternalRosParser.g:4544:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalRosParser.g:4544:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalRosParser.g:4545:2: iv_ruleuint8Array= ruleuint8Array EOF
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
    // InternalRosParser.g:4551:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= Uint8_1 ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4557:2: ( ( () otherlv_1= Uint8_1 ) )
            // InternalRosParser.g:4558:2: ( () otherlv_1= Uint8_1 )
            {
            // InternalRosParser.g:4558:2: ( () otherlv_1= Uint8_1 )
            // InternalRosParser.g:4559:3: () otherlv_1= Uint8_1
            {
            // InternalRosParser.g:4559:3: ()
            // InternalRosParser.g:4560:4: 
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
    // InternalRosParser.g:4574:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalRosParser.g:4574:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalRosParser.g:4575:2: iv_ruleint16Array= ruleint16Array EOF
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
    // InternalRosParser.g:4581:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= Int16_1 ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4587:2: ( ( () otherlv_1= Int16_1 ) )
            // InternalRosParser.g:4588:2: ( () otherlv_1= Int16_1 )
            {
            // InternalRosParser.g:4588:2: ( () otherlv_1= Int16_1 )
            // InternalRosParser.g:4589:3: () otherlv_1= Int16_1
            {
            // InternalRosParser.g:4589:3: ()
            // InternalRosParser.g:4590:4: 
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
    // InternalRosParser.g:4604:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalRosParser.g:4604:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalRosParser.g:4605:2: iv_ruleuint16Array= ruleuint16Array EOF
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
    // InternalRosParser.g:4611:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= Uint16_1 ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4617:2: ( ( () otherlv_1= Uint16_1 ) )
            // InternalRosParser.g:4618:2: ( () otherlv_1= Uint16_1 )
            {
            // InternalRosParser.g:4618:2: ( () otherlv_1= Uint16_1 )
            // InternalRosParser.g:4619:3: () otherlv_1= Uint16_1
            {
            // InternalRosParser.g:4619:3: ()
            // InternalRosParser.g:4620:4: 
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
    // InternalRosParser.g:4634:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalRosParser.g:4634:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalRosParser.g:4635:2: iv_ruleint32Array= ruleint32Array EOF
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
    // InternalRosParser.g:4641:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= Int32_1 ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4647:2: ( ( () otherlv_1= Int32_1 ) )
            // InternalRosParser.g:4648:2: ( () otherlv_1= Int32_1 )
            {
            // InternalRosParser.g:4648:2: ( () otherlv_1= Int32_1 )
            // InternalRosParser.g:4649:3: () otherlv_1= Int32_1
            {
            // InternalRosParser.g:4649:3: ()
            // InternalRosParser.g:4650:4: 
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
    // InternalRosParser.g:4664:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalRosParser.g:4664:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalRosParser.g:4665:2: iv_ruleuint32Array= ruleuint32Array EOF
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
    // InternalRosParser.g:4671:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= Uint32_1 ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4677:2: ( ( () otherlv_1= Uint32_1 ) )
            // InternalRosParser.g:4678:2: ( () otherlv_1= Uint32_1 )
            {
            // InternalRosParser.g:4678:2: ( () otherlv_1= Uint32_1 )
            // InternalRosParser.g:4679:3: () otherlv_1= Uint32_1
            {
            // InternalRosParser.g:4679:3: ()
            // InternalRosParser.g:4680:4: 
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
    // InternalRosParser.g:4694:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalRosParser.g:4694:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalRosParser.g:4695:2: iv_ruleint64Array= ruleint64Array EOF
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
    // InternalRosParser.g:4701:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= Int64_1 ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4707:2: ( ( () otherlv_1= Int64_1 ) )
            // InternalRosParser.g:4708:2: ( () otherlv_1= Int64_1 )
            {
            // InternalRosParser.g:4708:2: ( () otherlv_1= Int64_1 )
            // InternalRosParser.g:4709:3: () otherlv_1= Int64_1
            {
            // InternalRosParser.g:4709:3: ()
            // InternalRosParser.g:4710:4: 
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
    // InternalRosParser.g:4724:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalRosParser.g:4724:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalRosParser.g:4725:2: iv_ruleuint64Array= ruleuint64Array EOF
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
    // InternalRosParser.g:4731:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= Uint64_1 ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4737:2: ( ( () otherlv_1= Uint64_1 ) )
            // InternalRosParser.g:4738:2: ( () otherlv_1= Uint64_1 )
            {
            // InternalRosParser.g:4738:2: ( () otherlv_1= Uint64_1 )
            // InternalRosParser.g:4739:3: () otherlv_1= Uint64_1
            {
            // InternalRosParser.g:4739:3: ()
            // InternalRosParser.g:4740:4: 
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
    // InternalRosParser.g:4754:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalRosParser.g:4754:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalRosParser.g:4755:2: iv_rulefloat32Array= rulefloat32Array EOF
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
    // InternalRosParser.g:4761:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= Float32_1 ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4767:2: ( ( () otherlv_1= Float32_1 ) )
            // InternalRosParser.g:4768:2: ( () otherlv_1= Float32_1 )
            {
            // InternalRosParser.g:4768:2: ( () otherlv_1= Float32_1 )
            // InternalRosParser.g:4769:3: () otherlv_1= Float32_1
            {
            // InternalRosParser.g:4769:3: ()
            // InternalRosParser.g:4770:4: 
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
    // InternalRosParser.g:4784:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalRosParser.g:4784:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalRosParser.g:4785:2: iv_rulefloat64Array= rulefloat64Array EOF
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
    // InternalRosParser.g:4791:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= Float64_1 ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4797:2: ( ( () otherlv_1= Float64_1 ) )
            // InternalRosParser.g:4798:2: ( () otherlv_1= Float64_1 )
            {
            // InternalRosParser.g:4798:2: ( () otherlv_1= Float64_1 )
            // InternalRosParser.g:4799:3: () otherlv_1= Float64_1
            {
            // InternalRosParser.g:4799:3: ()
            // InternalRosParser.g:4800:4: 
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
    // InternalRosParser.g:4814:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalRosParser.g:4814:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalRosParser.g:4815:2: iv_rulestring0Array= rulestring0Array EOF
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
    // InternalRosParser.g:4821:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= String_2 ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4827:2: ( ( () otherlv_1= String_2 ) )
            // InternalRosParser.g:4828:2: ( () otherlv_1= String_2 )
            {
            // InternalRosParser.g:4828:2: ( () otherlv_1= String_2 )
            // InternalRosParser.g:4829:3: () otherlv_1= String_2
            {
            // InternalRosParser.g:4829:3: ()
            // InternalRosParser.g:4830:4: 
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
    // InternalRosParser.g:4844:1: entryRulebyteArray returns [EObject current=null] : iv_rulebyteArray= rulebyteArray EOF ;
    public final EObject entryRulebyteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyteArray = null;


        try {
            // InternalRosParser.g:4844:50: (iv_rulebyteArray= rulebyteArray EOF )
            // InternalRosParser.g:4845:2: iv_rulebyteArray= rulebyteArray EOF
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
    // InternalRosParser.g:4851:1: rulebyteArray returns [EObject current=null] : ( () otherlv_1= Byte_1 ) ;
    public final EObject rulebyteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4857:2: ( ( () otherlv_1= Byte_1 ) )
            // InternalRosParser.g:4858:2: ( () otherlv_1= Byte_1 )
            {
            // InternalRosParser.g:4858:2: ( () otherlv_1= Byte_1 )
            // InternalRosParser.g:4859:3: () otherlv_1= Byte_1
            {
            // InternalRosParser.g:4859:3: ()
            // InternalRosParser.g:4860:4: 
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
    // InternalRosParser.g:4874:1: entryRulecharArray returns [EObject current=null] : iv_rulecharArray= rulecharArray EOF ;
    public final EObject entryRulecharArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharArray = null;


        try {
            // InternalRosParser.g:4874:50: (iv_rulecharArray= rulecharArray EOF )
            // InternalRosParser.g:4875:2: iv_rulecharArray= rulecharArray EOF
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
    // InternalRosParser.g:4881:1: rulecharArray returns [EObject current=null] : ( () otherlv_1= Char_1 ) ;
    public final EObject rulecharArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4887:2: ( ( () otherlv_1= Char_1 ) )
            // InternalRosParser.g:4888:2: ( () otherlv_1= Char_1 )
            {
            // InternalRosParser.g:4888:2: ( () otherlv_1= Char_1 )
            // InternalRosParser.g:4889:3: () otherlv_1= Char_1
            {
            // InternalRosParser.g:4889:3: ()
            // InternalRosParser.g:4890:4: 
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
    // InternalRosParser.g:4904:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRosParser.g:4904:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRosParser.g:4905:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalRosParser.g:4911:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= Header ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4917:2: ( ( () otherlv_1= Header ) )
            // InternalRosParser.g:4918:2: ( () otherlv_1= Header )
            {
            // InternalRosParser.g:4918:2: ( () otherlv_1= Header )
            // InternalRosParser.g:4919:3: () otherlv_1= Header
            {
            // InternalRosParser.g:4919:3: ()
            // InternalRosParser.g:4920:4: 
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
    // InternalRosParser.g:4934:1: entryRuleSpecBaseRef returns [EObject current=null] : iv_ruleSpecBaseRef= ruleSpecBaseRef EOF ;
    public final EObject entryRuleSpecBaseRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBaseRef = null;


        try {
            // InternalRosParser.g:4934:52: (iv_ruleSpecBaseRef= ruleSpecBaseRef EOF )
            // InternalRosParser.g:4935:2: iv_ruleSpecBaseRef= ruleSpecBaseRef EOF
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
    // InternalRosParser.g:4941:1: ruleSpecBaseRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSpecBaseRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRosParser.g:4947:2: ( ( ( ruleEString ) ) )
            // InternalRosParser.g:4948:2: ( ( ruleEString ) )
            {
            // InternalRosParser.g:4948:2: ( ( ruleEString ) )
            // InternalRosParser.g:4949:3: ( ruleEString )
            {
            // InternalRosParser.g:4949:3: ( ruleEString )
            // InternalRosParser.g:4950:4: ruleEString
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
    // InternalRosParser.g:4967:1: entryRuleArraySpecRef returns [EObject current=null] : iv_ruleArraySpecRef= ruleArraySpecRef EOF ;
    public final EObject entryRuleArraySpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecRef = null;


        try {
            // InternalRosParser.g:4967:53: (iv_ruleArraySpecRef= ruleArraySpecRef EOF )
            // InternalRosParser.g:4968:2: iv_ruleArraySpecRef= ruleArraySpecRef EOF
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
    // InternalRosParser.g:4974:1: ruleArraySpecRef returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) ;
    public final EObject ruleArraySpecRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:4980:2: ( ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) )
            // InternalRosParser.g:4981:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            {
            // InternalRosParser.g:4981:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            // InternalRosParser.g:4982:3: ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket
            {
            // InternalRosParser.g:4982:3: ( ( ruleEString ) )
            // InternalRosParser.g:4983:4: ( ruleEString )
            {
            // InternalRosParser.g:4983:4: ( ruleEString )
            // InternalRosParser.g:4984:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArraySpecRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecCrossReference_0_0());
            				
            pushFollow(FOLLOW_49);
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
    // InternalRosParser.g:5006:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalRosParser.g:5006:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalRosParser.g:5007:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalRosParser.g:5013:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRosParser.g:5019:2: ( (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) )
            // InternalRosParser.g:5020:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            {
            // InternalRosParser.g:5020:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            int alt57=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt57=1;
                }
                break;
            case Message:
                {
                alt57=2;
                }
                break;
            case Result:
                {
                alt57=3;
                }
                break;
            case Feedback:
                {
                alt57=4;
                }
                break;
            case Name:
                {
                alt57=5;
                }
                break;
            case Value:
                {
                alt57=6;
                }
                break;
            case Service:
                {
                alt57=7;
                }
                break;
            case Type:
                {
                alt57=8;
                }
                break;
            case Action:
                {
                alt57=9;
                }
                break;
            case Duration:
                {
                alt57=10;
                }
                break;
            case Time:
                {
                alt57=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalRosParser.g:5021:3: kw= Goal
                    {
                    kw=(Token)match(input,Goal,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosParser.g:5027:3: kw= Message
                    {
                    kw=(Token)match(input,Message,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRosParser.g:5033:3: kw= Result
                    {
                    kw=(Token)match(input,Result,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRosParser.g:5039:3: kw= Feedback
                    {
                    kw=(Token)match(input,Feedback,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRosParser.g:5045:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRosParser.g:5051:3: kw= Value
                    {
                    kw=(Token)match(input,Value,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRosParser.g:5057:3: kw= Service
                    {
                    kw=(Token)match(input,Service,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRosParser.g:5063:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRosParser.g:5069:3: kw= Action
                    {
                    kw=(Token)match(input,Action,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRosParser.g:5075:3: kw= Duration
                    {
                    kw=(Token)match(input,Duration,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRosParser.g:5081:3: kw= Time
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
    // InternalRosParser.g:5090:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRosParser.g:5090:47: (iv_ruleEString= ruleEString EOF )
            // InternalRosParser.g:5091:2: iv_ruleEString= ruleEString EOF
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
    // InternalRosParser.g:5097:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRosParser.g:5103:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRosParser.g:5104:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRosParser.g:5104:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_ID) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalRosParser.g:5105:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosParser.g:5113:3: this_ID_1= RULE_ID
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
    // InternalRosParser.g:5124:1: entryRuleRosNames returns [String current=null] : iv_ruleRosNames= ruleRosNames EOF ;
    public final String entryRuleRosNames() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRosNames = null;


        try {
            // InternalRosParser.g:5124:48: (iv_ruleRosNames= ruleRosNames EOF )
            // InternalRosParser.g:5125:2: iv_ruleRosNames= ruleRosNames EOF
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
    // InternalRosParser.g:5131:1: ruleRosNames returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node ) ;
    public final AntlrDatatypeRuleToken ruleRosNames() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ROS_CONVENTION_A_0=null;
        Token this_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRosParser.g:5137:2: ( (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node ) )
            // InternalRosParser.g:5138:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node )
            {
            // InternalRosParser.g:5138:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= Node )
            int alt59=3;
            switch ( input.LA(1) ) {
            case RULE_ROS_CONVENTION_A:
                {
                alt59=1;
                }
                break;
            case RULE_ID:
                {
                alt59=2;
                }
                break;
            case Node:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalRosParser.g:5139:3: this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A
                    {
                    this_ROS_CONVENTION_A_0=(Token)match(input,RULE_ROS_CONVENTION_A,FOLLOW_2); 

                    			current.merge(this_ROS_CONVENTION_A_0);
                    		

                    			newLeafNode(this_ROS_CONVENTION_A_0, grammarAccess.getRosNamesAccess().getROS_CONVENTION_ATerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRosParser.g:5147:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getRosNamesAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRosParser.g:5155:3: kw= Node
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

    // Delegated rules


    protected DFA42 dfa42 = new DFA42(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\7\12\uffff";
    static final String dfa_3s = "\1\121\5\uffff\1\121\1\uffff\2\121\1\uffff";
    static final String dfa_4s = "\1\145\5\uffff\1\141\1\uffff\2\124\1\uffff";
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

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "2335:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )";
        }
    }
    static final String dfa_8s = "\44\uffff";
    static final String dfa_9s = "\36\uffff\2\42\4\uffff";
    static final String dfa_10s = "\1\23\35\uffff\2\27\4\uffff";
    static final String dfa_11s = "\1\141\35\uffff\2\143\4\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\40\1\41\1\36\1\37";
    static final String dfa_13s = "\44\uffff}>";
    static final String[] dfa_14s = {
            "\1\32\1\33\2\uffff\1\17\2\uffff\1\34\1\25\1\27\1\31\2\uffff\1\12\1\13\1\24\1\26\1\30\3\uffff\1\23\3\uffff\1\20\3\uffff\1\21\1\35\1\41\1\22\1\uffff\1\14\1\5\1\7\1\11\1\uffff\1\4\1\6\1\10\4\uffff\1\3\3\uffff\1\1\1\15\1\40\1\uffff\1\2\2\uffff\1\16\23\uffff\1\37\1\36",
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
            "\2\42\14\uffff\1\42\1\uffff\1\42\7\uffff\1\42\4\uffff\1\42\15\uffff\1\42\5\uffff\1\42\1\uffff\1\42\1\uffff\2\42\2\uffff\1\43\17\uffff\2\42\1\uffff\1\42",
            "\2\42\14\uffff\1\42\1\uffff\1\42\7\uffff\1\42\4\uffff\1\42\15\uffff\1\42\5\uffff\1\42\1\uffff\1\42\1\uffff\2\42\2\uffff\1\43\17\uffff\2\42\1\uffff\1\42",
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

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "3703:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000002L,0x0000008100000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0xA000000000205000L,0x0000002000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000300000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xA000000000201000L,0x0000002000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L,0x0000000300000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000000L,0x0000000000120000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xA000000000200000L,0x0000002000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000300000000000L,0x0000002300000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000002300000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x1DEF111F3C980000L,0x00000023000012E2L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000001000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1DEF111F3C980002L,0x00000003000012E2L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000038F00L,0x0000008100000800L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000038F02L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000002000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008001L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00006C00C0000000L,0x0000001000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000303C80000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000400000L,0x0000002000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x001080A001800000L,0x0000000B00003504L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});

}