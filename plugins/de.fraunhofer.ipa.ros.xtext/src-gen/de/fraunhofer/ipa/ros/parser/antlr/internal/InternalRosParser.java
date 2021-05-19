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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ROS_CONVENTION_A", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_DECINT", "RULE_DATE_TIME", "RULE_MESSAGE_ASIGMENT", "RULE_ROS_CONVENTION_PARAM", "RULE_DIGIT", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PackageSet'", "'{'", "','", "'}'", "'Package'", "'Specs'", "'node'", "'Artifact'", "'CatkinPackage'", "'Dependencies'", "'ServiceSpec'", "'request'", "'response'", "'TopicSpec'", "'Header'", "'String'", "'message'", "'ActionSpec'", "'goal'", "'result'", "'feedback'", "'Node'", "'name'", "'Publishers'", "'Subscribers'", "'ServiceServers'", "'ServiceClients'", "'ActionServers'", "'ActionClients'", "'Parameters'", "'ServiceServer'", "'service'", "'namespace'", "'Publisher'", "'Subscriber'", "'ServiceClient'", "'ActionServer'", "'action'", "'ActionClient'", "'GraphName'", "'PackageDependency'", "'ExternalDependency'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'Parameter'", "'type'", "'List'", "'Struct'", "'Integer'", "'default'", "'Double'", "'Boolean'", "'Base64'", "'Array'", "'ParameterAny'", "'value'", "'ParameterStructMember'", "'bool'", "'int8'", "'uint8'", "'int16'", "'uint16'", "'int32'", "'uint32'", "'int64'", "'uint64'", "'float32'", "'float64'", "'string'", "'byte'", "'time'", "'duration'", "'bool[]'", "'int8[]'", "'uint8[]'", "'int16[]'", "'uint16[]'", "'int32[]'", "'uint32[]'", "'int64[]'", "'uint64[]'", "'float32[]'", "'float64[]'", "'string[]'", "'byte[]'", "'[]'"
    };
    public static final int T__50=50;
    public static final int RULE_DATE_TIME=11;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_DIGIT=14;
    public static final int RULE_INT=20;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=21;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_MESSAGE_ASIGMENT=12;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DECINT=10;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_HOUR=18;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_BINARY=7;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int RULE_DAY=15;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_YEAR=17;
    public static final int RULE_MIN_SEC=19;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__25=25;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=22;
    public static final int RULE_DOUBLE=9;
    public static final int RULE_ROS_CONVENTION_A=6;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int RULE_ROS_CONVENTION_PARAM=13;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=23;
    public static final int RULE_ANY_OTHER=24;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int RULE_MONTH=16;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalRosParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRos.g"; }



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
    // InternalRos.g:64:1: entryRulePackageSet returns [EObject current=null] : iv_rulePackageSet= rulePackageSet EOF ;
    public final EObject entryRulePackageSet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageSet = null;


        try {
            // InternalRos.g:64:51: (iv_rulePackageSet= rulePackageSet EOF )
            // InternalRos.g:65:2: iv_rulePackageSet= rulePackageSet EOF
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
    // InternalRos.g:71:1: rulePackageSet returns [EObject current=null] : ( () otherlv_1= 'PackageSet' otherlv_2= '{' ( ( (lv_package_3_0= rulePackage ) ) (otherlv_4= ',' ( (lv_package_5_0= rulePackage ) ) )* )? otherlv_6= '}' ) ;
    public final EObject rulePackageSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_package_3_0 = null;

        EObject lv_package_5_0 = null;



        	enterRule();

        try {
            // InternalRos.g:77:2: ( ( () otherlv_1= 'PackageSet' otherlv_2= '{' ( ( (lv_package_3_0= rulePackage ) ) (otherlv_4= ',' ( (lv_package_5_0= rulePackage ) ) )* )? otherlv_6= '}' ) )
            // InternalRos.g:78:2: ( () otherlv_1= 'PackageSet' otherlv_2= '{' ( ( (lv_package_3_0= rulePackage ) ) (otherlv_4= ',' ( (lv_package_5_0= rulePackage ) ) )* )? otherlv_6= '}' )
            {
            // InternalRos.g:78:2: ( () otherlv_1= 'PackageSet' otherlv_2= '{' ( ( (lv_package_3_0= rulePackage ) ) (otherlv_4= ',' ( (lv_package_5_0= rulePackage ) ) )* )? otherlv_6= '}' )
            // InternalRos.g:79:3: () otherlv_1= 'PackageSet' otherlv_2= '{' ( ( (lv_package_3_0= rulePackage ) ) (otherlv_4= ',' ( (lv_package_5_0= rulePackage ) ) )* )? otherlv_6= '}'
            {
            // InternalRos.g:79:3: ()
            // InternalRos.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageSetAccess().getPackageSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageSetAccess().getPackageSetKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageSetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:94:3: ( ( (lv_package_3_0= rulePackage ) ) (otherlv_4= ',' ( (lv_package_5_0= rulePackage ) ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29||LA2_0==33) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRos.g:95:4: ( (lv_package_3_0= rulePackage ) ) (otherlv_4= ',' ( (lv_package_5_0= rulePackage ) ) )*
                    {
                    // InternalRos.g:95:4: ( (lv_package_3_0= rulePackage ) )
                    // InternalRos.g:96:5: (lv_package_3_0= rulePackage )
                    {
                    // InternalRos.g:96:5: (lv_package_3_0= rulePackage )
                    // InternalRos.g:97:6: lv_package_3_0= rulePackage
                    {

                    						newCompositeNode(grammarAccess.getPackageSetAccess().getPackagePackageParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_package_3_0=rulePackage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackageSetRule());
                    						}
                    						add(
                    							current,
                    							"package",
                    							lv_package_3_0,
                    							"de.fraunhofer.ipa.ros.Ros.Package");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:114:4: (otherlv_4= ',' ( (lv_package_5_0= rulePackage ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==27) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRos.g:115:5: otherlv_4= ',' ( (lv_package_5_0= rulePackage ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPackageSetAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalRos.g:119:5: ( (lv_package_5_0= rulePackage ) )
                    	    // InternalRos.g:120:6: (lv_package_5_0= rulePackage )
                    	    {
                    	    // InternalRos.g:120:6: (lv_package_5_0= rulePackage )
                    	    // InternalRos.g:121:7: lv_package_5_0= rulePackage
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackageSetAccess().getPackagePackageParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_package_5_0=rulePackage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackageSetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"package",
                    	    								lv_package_5_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Package");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPackageSetAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulePackage"
    // InternalRos.g:148:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalRos.g:148:48: (iv_rulePackage= rulePackage EOF )
            // InternalRos.g:149:2: iv_rulePackage= rulePackage EOF
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
    // InternalRos.g:155:1: rulePackage returns [EObject current=null] : (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        EObject this_Package_Impl_0 = null;

        EObject this_CatkinPackage_1 = null;



        	enterRule();

        try {
            // InternalRos.g:161:2: ( (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage ) )
            // InternalRos.g:162:2: (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage )
            {
            // InternalRos.g:162:2: (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRos.g:163:3: this_Package_Impl_0= rulePackage_Impl
                    {

                    			newCompositeNode(grammarAccess.getPackageAccess().getPackage_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Package_Impl_0=rulePackage_Impl();

                    state._fsp--;


                    			current = this_Package_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:172:3: this_CatkinPackage_1= ruleCatkinPackage
                    {

                    			newCompositeNode(grammarAccess.getPackageAccess().getCatkinPackageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CatkinPackage_1=ruleCatkinPackage();

                    state._fsp--;


                    			current = this_CatkinPackage_1;
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
    // $ANTLR end "rulePackage"


    // $ANTLR start "entryRuleSpecBase"
    // InternalRos.g:184:1: entryRuleSpecBase returns [EObject current=null] : iv_ruleSpecBase= ruleSpecBase EOF ;
    public final EObject entryRuleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBase = null;


        try {
            // InternalRos.g:184:49: (iv_ruleSpecBase= ruleSpecBase EOF )
            // InternalRos.g:185:2: iv_ruleSpecBase= ruleSpecBase EOF
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
    // InternalRos.g:191:1: ruleSpecBase returns [EObject current=null] : (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec ) ;
    public final EObject ruleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject this_ServiceSpec_0 = null;

        EObject this_TopicSpec_1 = null;

        EObject this_ActionSpec_2 = null;



        	enterRule();

        try {
            // InternalRos.g:197:2: ( (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec ) )
            // InternalRos.g:198:2: (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec )
            {
            // InternalRos.g:198:2: (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt4=1;
                }
                break;
            case 38:
                {
                alt4=2;
                }
                break;
            case 42:
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
                    // InternalRos.g:199:3: this_ServiceSpec_0= ruleServiceSpec
                    {

                    			newCompositeNode(grammarAccess.getSpecBaseAccess().getServiceSpecParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ServiceSpec_0=ruleServiceSpec();

                    state._fsp--;


                    			current = this_ServiceSpec_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:208:3: this_TopicSpec_1= ruleTopicSpec
                    {

                    			newCompositeNode(grammarAccess.getSpecBaseAccess().getTopicSpecParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TopicSpec_1=ruleTopicSpec();

                    state._fsp--;


                    			current = this_TopicSpec_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRos.g:217:3: this_ActionSpec_2= ruleActionSpec
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


    // $ANTLR start "entryRuleDependency"
    // InternalRos.g:229:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalRos.g:229:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalRos.g:230:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalRos.g:236:1: ruleDependency returns [EObject current=null] : (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDependency_0 = null;

        EObject this_ExternalDependency_1 = null;



        	enterRule();

        try {
            // InternalRos.g:242:2: ( (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) )
            // InternalRos.g:243:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            {
            // InternalRos.g:243:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==65) ) {
                alt5=1;
            }
            else if ( (LA5_0==66) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRos.g:244:3: this_PackageDependency_0= rulePackageDependency
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
                    // InternalRos.g:253:3: this_ExternalDependency_1= ruleExternalDependency
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


    // $ANTLR start "entryRuleNamespace"
    // InternalRos.g:265:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRos.g:265:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRos.g:266:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalRos.g:272:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRos.g:278:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRos.g:279:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRos.g:279:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt6=1;
                }
                break;
            case 69:
                {
                alt6=2;
                }
                break;
            case 70:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRos.g:280:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalRos.g:289:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalRos.g:298:3: this_PrivateNamespace_2= rulePrivateNamespace
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


    // $ANTLR start "entryRulePackage_Impl"
    // InternalRos.g:310:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // InternalRos.g:310:53: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // InternalRos.g:311:2: iv_rulePackage_Impl= rulePackage_Impl EOF
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
    // InternalRos.g:317:1: rulePackage_Impl returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )? otherlv_13= '}' ) ;
    public final EObject rulePackage_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_spec_6_0 = null;

        EObject lv_spec_8_0 = null;

        EObject lv_artifact_10_0 = null;

        EObject lv_artifact_12_0 = null;



        	enterRule();

        try {
            // InternalRos.g:323:2: ( ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )? otherlv_13= '}' ) )
            // InternalRos.g:324:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )? otherlv_13= '}' )
            {
            // InternalRos.g:324:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )? otherlv_13= '}' )
            // InternalRos.g:325:3: () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )? otherlv_13= '}'
            {
            // InternalRos.g:325:3: ()
            // InternalRos.g:326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackage_ImplAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPackage_ImplAccess().getPackageKeyword_1());
            		
            // InternalRos.g:336:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:337:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:337:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:338:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPackage_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:359:3: (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRos.g:360:4: otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackage_ImplAccess().getSpecsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRos.g:368:4: ( (lv_spec_6_0= ruleSpecBase ) )
                    // InternalRos.g:369:5: (lv_spec_6_0= ruleSpecBase )
                    {
                    // InternalRos.g:369:5: (lv_spec_6_0= ruleSpecBase )
                    // InternalRos.g:370:6: lv_spec_6_0= ruleSpecBase
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_spec_6_0=ruleSpecBase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    						}
                    						add(
                    							current,
                    							"spec",
                    							lv_spec_6_0,
                    							"de.fraunhofer.ipa.ros.Ros.SpecBase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:387:4: (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==27) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRos.g:388:5: otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPackage_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRos.g:392:5: ( (lv_spec_8_0= ruleSpecBase ) )
                    	    // InternalRos.g:393:6: (lv_spec_8_0= ruleSpecBase )
                    	    {
                    	    // InternalRos.g:393:6: (lv_spec_8_0= ruleSpecBase )
                    	    // InternalRos.g:394:7: lv_spec_8_0= ruleSpecBase
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,28,FOLLOW_10); 

                    				newLeafNode(otherlv_9, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:417:3: ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRos.g:418:4: ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )*
                    {
                    // InternalRos.g:418:4: ( (lv_artifact_10_0= ruleArtifact ) )
                    // InternalRos.g:419:5: (lv_artifact_10_0= ruleArtifact )
                    {
                    // InternalRos.g:419:5: (lv_artifact_10_0= ruleArtifact )
                    // InternalRos.g:420:6: lv_artifact_10_0= ruleArtifact
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getArtifactArtifactParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_artifact_10_0=ruleArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    						}
                    						add(
                    							current,
                    							"artifact",
                    							lv_artifact_10_0,
                    							"de.fraunhofer.ipa.ros.Ros.Artifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:437:4: (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==27) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRos.g:438:5: otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) )
                    	    {
                    	    otherlv_11=(Token)match(input,27,FOLLOW_11); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalRos.g:442:5: ( (lv_artifact_12_0= ruleArtifact ) )
                    	    // InternalRos.g:443:6: (lv_artifact_12_0= ruleArtifact )
                    	    {
                    	    // InternalRos.g:443:6: (lv_artifact_12_0= ruleArtifact )
                    	    // InternalRos.g:444:7: lv_artifact_12_0= ruleArtifact
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getArtifactArtifactParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_artifact_12_0=ruleArtifact();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"artifact",
                    	    								lv_artifact_12_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Artifact");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_13=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEString"
    // InternalRos.g:471:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRos.g:471:47: (iv_ruleEString= ruleEString EOF )
            // InternalRos.g:472:2: iv_ruleEString= ruleEString EOF
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
    // InternalRos.g:478:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRos.g:484:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRos.g:485:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRos.g:485:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalRos.g:486:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:494:3: this_ID_1= RULE_ID
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
    // InternalRos.g:505:1: entryRuleRosNames returns [String current=null] : iv_ruleRosNames= ruleRosNames EOF ;
    public final String entryRuleRosNames() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRosNames = null;


        try {
            // InternalRos.g:505:48: (iv_ruleRosNames= ruleRosNames EOF )
            // InternalRos.g:506:2: iv_ruleRosNames= ruleRosNames EOF
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
    // InternalRos.g:512:1: ruleRosNames returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= 'node' ) ;
    public final AntlrDatatypeRuleToken ruleRosNames() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ROS_CONVENTION_A_0=null;
        Token this_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:518:2: ( (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= 'node' ) )
            // InternalRos.g:519:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= 'node' )
            {
            // InternalRos.g:519:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= 'node' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_ROS_CONVENTION_A:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRos.g:520:3: this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A
                    {
                    this_ROS_CONVENTION_A_0=(Token)match(input,RULE_ROS_CONVENTION_A,FOLLOW_2); 

                    			current.merge(this_ROS_CONVENTION_A_0);
                    		

                    			newLeafNode(this_ROS_CONVENTION_A_0, grammarAccess.getRosNamesAccess().getROS_CONVENTION_ATerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:528:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getRosNamesAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRos.g:536:3: kw= 'node'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

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


    // $ANTLR start "entryRuleArtifact"
    // InternalRos.g:545:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalRos.g:545:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalRos.g:546:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalRos.g:552:1: ruleArtifact returns [EObject current=null] : ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (lv_node_4_0= ruleNode ) )? otherlv_5= '}' ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_node_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:558:2: ( ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (lv_node_4_0= ruleNode ) )? otherlv_5= '}' ) )
            // InternalRos.g:559:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (lv_node_4_0= ruleNode ) )? otherlv_5= '}' )
            {
            // InternalRos.g:559:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (lv_node_4_0= ruleNode ) )? otherlv_5= '}' )
            // InternalRos.g:560:3: () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (lv_node_4_0= ruleNode ) )? otherlv_5= '}'
            {
            // InternalRos.g:560:3: ()
            // InternalRos.g:561:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
            		
            // InternalRos.g:571:3: ( (lv_name_2_0= ruleRosNames ) )
            // InternalRos.g:572:4: (lv_name_2_0= ruleRosNames )
            {
            // InternalRos.g:572:4: (lv_name_2_0= ruleRosNames )
            // InternalRos.g:573:5: lv_name_2_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getArtifactAccess().getNameRosNamesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtifactRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.Ros.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:594:3: ( (lv_node_4_0= ruleNode ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRos.g:595:4: (lv_node_4_0= ruleNode )
                    {
                    // InternalRos.g:595:4: (lv_node_4_0= ruleNode )
                    // InternalRos.g:596:5: lv_node_4_0= ruleNode
                    {

                    					newCompositeNode(grammarAccess.getArtifactAccess().getNodeNodeParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleCatkinPackage"
    // InternalRos.g:621:1: entryRuleCatkinPackage returns [EObject current=null] : iv_ruleCatkinPackage= ruleCatkinPackage EOF ;
    public final EObject entryRuleCatkinPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatkinPackage = null;


        try {
            // InternalRos.g:621:54: (iv_ruleCatkinPackage= ruleCatkinPackage EOF )
            // InternalRos.g:622:2: iv_ruleCatkinPackage= ruleCatkinPackage EOF
            {
             newCompositeNode(grammarAccess.getCatkinPackageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCatkinPackage=ruleCatkinPackage();

            state._fsp--;

             current =iv_ruleCatkinPackage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCatkinPackage"


    // $ANTLR start "ruleCatkinPackage"
    // InternalRos.g:628:1: ruleCatkinPackage returns [EObject current=null] : ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )? (otherlv_13= 'Dependencies' otherlv_14= '{' ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= ',' ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleCatkinPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_spec_6_0 = null;

        EObject lv_spec_8_0 = null;

        EObject lv_artifact_10_0 = null;

        EObject lv_artifact_12_0 = null;

        EObject lv_dependency_15_0 = null;

        EObject lv_dependency_17_0 = null;



        	enterRule();

        try {
            // InternalRos.g:634:2: ( ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )? (otherlv_13= 'Dependencies' otherlv_14= '{' ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= ',' ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalRos.g:635:2: ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )? (otherlv_13= 'Dependencies' otherlv_14= '{' ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= ',' ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalRos.g:635:2: ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )? (otherlv_13= 'Dependencies' otherlv_14= '{' ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= ',' ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalRos.g:636:3: () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )? (otherlv_13= 'Dependencies' otherlv_14= '{' ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= ',' ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            // InternalRos.g:636:3: ()
            // InternalRos.g:637:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCatkinPackageAccess().getCatkinPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getCatkinPackageAccess().getCatkinPackageKeyword_1());
            		
            // InternalRos.g:647:3: ( (lv_name_2_0= ruleRosNames ) )
            // InternalRos.g:648:4: (lv_name_2_0= ruleRosNames )
            {
            // InternalRos.g:648:4: (lv_name_2_0= ruleRosNames )
            // InternalRos.g:649:5: lv_name_2_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getCatkinPackageAccess().getNameRosNamesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.Ros.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:670:3: (otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRos.g:671:4: otherlv_4= 'Specs' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCatkinPackageAccess().getSpecsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,26,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRos.g:679:4: ( (lv_spec_6_0= ruleSpecBase ) )
                    // InternalRos.g:680:5: (lv_spec_6_0= ruleSpecBase )
                    {
                    // InternalRos.g:680:5: (lv_spec_6_0= ruleSpecBase )
                    // InternalRos.g:681:6: lv_spec_6_0= ruleSpecBase
                    {

                    						newCompositeNode(grammarAccess.getCatkinPackageAccess().getSpecSpecBaseParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_spec_6_0=ruleSpecBase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    						}
                    						add(
                    							current,
                    							"spec",
                    							lv_spec_6_0,
                    							"de.fraunhofer.ipa.ros.Ros.SpecBase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:698:4: (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==27) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalRos.g:699:5: otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCatkinPackageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRos.g:703:5: ( (lv_spec_8_0= ruleSpecBase ) )
                    	    // InternalRos.g:704:6: (lv_spec_8_0= ruleSpecBase )
                    	    {
                    	    // InternalRos.g:704:6: (lv_spec_8_0= ruleSpecBase )
                    	    // InternalRos.g:705:7: lv_spec_8_0= ruleSpecBase
                    	    {

                    	    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getSpecSpecBaseParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_spec_8_0=ruleSpecBase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"spec",
                    	    								lv_spec_8_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.SpecBase");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:728:3: ( ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRos.g:729:4: ( (lv_artifact_10_0= ruleArtifact ) ) (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )*
                    {
                    // InternalRos.g:729:4: ( (lv_artifact_10_0= ruleArtifact ) )
                    // InternalRos.g:730:5: (lv_artifact_10_0= ruleArtifact )
                    {
                    // InternalRos.g:730:5: (lv_artifact_10_0= ruleArtifact )
                    // InternalRos.g:731:6: lv_artifact_10_0= ruleArtifact
                    {

                    						newCompositeNode(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_0_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_artifact_10_0=ruleArtifact();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    						}
                    						add(
                    							current,
                    							"artifact",
                    							lv_artifact_10_0,
                    							"de.fraunhofer.ipa.ros.Ros.Artifact");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:748:4: (otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==27) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalRos.g:749:5: otherlv_11= ',' ( (lv_artifact_12_0= ruleArtifact ) )
                    	    {
                    	    otherlv_11=(Token)match(input,27,FOLLOW_11); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getCatkinPackageAccess().getCommaKeyword_5_1_0());
                    	    				
                    	    // InternalRos.g:753:5: ( (lv_artifact_12_0= ruleArtifact ) )
                    	    // InternalRos.g:754:6: (lv_artifact_12_0= ruleArtifact )
                    	    {
                    	    // InternalRos.g:754:6: (lv_artifact_12_0= ruleArtifact )
                    	    // InternalRos.g:755:7: lv_artifact_12_0= ruleArtifact
                    	    {

                    	    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_artifact_12_0=ruleArtifact();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"artifact",
                    	    								lv_artifact_12_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Artifact");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalRos.g:774:3: (otherlv_13= 'Dependencies' otherlv_14= '{' ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= ',' ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRos.g:775:4: otherlv_13= 'Dependencies' otherlv_14= '{' ( (lv_dependency_15_0= ruleDependency ) ) (otherlv_16= ',' ( (lv_dependency_17_0= ruleDependency ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getCatkinPackageAccess().getDependenciesKeyword_6_0());
                    			
                    otherlv_14=(Token)match(input,26,FOLLOW_18); 

                    				newLeafNode(otherlv_14, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRos.g:783:4: ( (lv_dependency_15_0= ruleDependency ) )
                    // InternalRos.g:784:5: (lv_dependency_15_0= ruleDependency )
                    {
                    // InternalRos.g:784:5: (lv_dependency_15_0= ruleDependency )
                    // InternalRos.g:785:6: lv_dependency_15_0= ruleDependency
                    {

                    						newCompositeNode(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_dependency_15_0=ruleDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    						}
                    						add(
                    							current,
                    							"dependency",
                    							lv_dependency_15_0,
                    							"de.fraunhofer.ipa.ros.Ros.Dependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:802:4: (otherlv_16= ',' ( (lv_dependency_17_0= ruleDependency ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==27) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRos.g:803:5: otherlv_16= ',' ( (lv_dependency_17_0= ruleDependency ) )
                    	    {
                    	    otherlv_16=(Token)match(input,27,FOLLOW_18); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getCatkinPackageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRos.g:807:5: ( (lv_dependency_17_0= ruleDependency ) )
                    	    // InternalRos.g:808:6: (lv_dependency_17_0= ruleDependency )
                    	    {
                    	    // InternalRos.g:808:6: (lv_dependency_17_0= ruleDependency )
                    	    // InternalRos.g:809:7: lv_dependency_17_0= ruleDependency
                    	    {

                    	    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_dependency_17_0=ruleDependency();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
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
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_18, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCatkinPackage"


    // $ANTLR start "entryRuleServiceSpec"
    // InternalRos.g:840:1: entryRuleServiceSpec returns [EObject current=null] : iv_ruleServiceSpec= ruleServiceSpec EOF ;
    public final EObject entryRuleServiceSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSpec = null;


        try {
            // InternalRos.g:840:52: (iv_ruleServiceSpec= ruleServiceSpec EOF )
            // InternalRos.g:841:2: iv_ruleServiceSpec= ruleServiceSpec EOF
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
    // InternalRos.g:847:1: ruleServiceSpec returns [EObject current=null] : ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleServiceSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_request_5_0 = null;

        EObject lv_response_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:853:2: ( ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:854:2: ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:854:2: ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' )
            // InternalRos.g:855:3: () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}'
            {
            // InternalRos.g:855:3: ()
            // InternalRos.g:856:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceSpecAccess().getServiceSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceSpecAccess().getServiceSpecKeyword_1());
            		
            // InternalRos.g:866:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:867:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:867:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:868:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceSpecAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:889:3: (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRos.g:890:4: otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getServiceSpecAccess().getRequestKeyword_4_0());
                    			
                    // InternalRos.g:894:4: ( (lv_request_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:895:5: (lv_request_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:895:5: (lv_request_5_0= ruleMessageDefinition )
                    // InternalRos.g:896:6: lv_request_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getRequestMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
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


                    }
                    break;

            }

            // InternalRos.g:914:3: (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRos.g:915:4: otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceSpecAccess().getResponseKeyword_5_0());
                    			
                    // InternalRos.g:919:4: ( (lv_response_7_0= ruleMessageDefinition ) )
                    // InternalRos.g:920:5: (lv_response_7_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:920:5: (lv_response_7_0= ruleMessageDefinition )
                    // InternalRos.g:921:6: lv_response_7_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getResponseMessageDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_response_7_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getServiceSpecRule());
                    						}
                    						set(
                    							current,
                    							"response",
                    							lv_response_7_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceSpecAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleTopicSpec"
    // InternalRos.g:947:1: entryRuleTopicSpec returns [EObject current=null] : iv_ruleTopicSpec= ruleTopicSpec EOF ;
    public final EObject entryRuleTopicSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpec = null;


        try {
            // InternalRos.g:947:50: (iv_ruleTopicSpec= ruleTopicSpec EOF )
            // InternalRos.g:948:2: iv_ruleTopicSpec= ruleTopicSpec EOF
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
    // InternalRos.g:954:1: ruleTopicSpec returns [EObject current=null] : ( () otherlv_1= 'TopicSpec' ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleTopicSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_2=null;
        Token lv_name_2_3=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_1 = null;

        EObject lv_message_5_0 = null;



        	enterRule();

        try {
            // InternalRos.g:960:2: ( ( () otherlv_1= 'TopicSpec' ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' ) )
            // InternalRos.g:961:2: ( () otherlv_1= 'TopicSpec' ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' )
            {
            // InternalRos.g:961:2: ( () otherlv_1= 'TopicSpec' ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' )
            // InternalRos.g:962:3: () otherlv_1= 'TopicSpec' ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}'
            {
            // InternalRos.g:962:3: ()
            // InternalRos.g:963:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicSpecAccess().getTopicSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicSpecAccess().getTopicSpecKeyword_1());
            		
            // InternalRos.g:973:3: ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) )
            // InternalRos.g:974:4: ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) )
            {
            // InternalRos.g:974:4: ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) )
            // InternalRos.g:975:5: (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' )
            {
            // InternalRos.g:975:5: (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' )
            int alt22=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt22=1;
                }
                break;
            case 39:
                {
                alt22=2;
                }
                break;
            case 40:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalRos.g:976:6: lv_name_2_1= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTopicSpecAccess().getNameEStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_3);
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
                    // InternalRos.g:992:6: lv_name_2_2= 'Header'
                    {
                    lv_name_2_2=(Token)match(input,39,FOLLOW_3); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getTopicSpecAccess().getNameHeaderKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicSpecRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalRos.g:1003:6: lv_name_2_3= 'String'
                    {
                    lv_name_2_3=(Token)match(input,40,FOLLOW_3); 

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

            otherlv_3=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:1020:3: (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==41) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRos.g:1021:4: otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTopicSpecAccess().getMessageKeyword_4_0());
                    			
                    // InternalRos.g:1025:4: ( (lv_message_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:1026:5: (lv_message_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1026:5: (lv_message_5_0= ruleMessageDefinition )
                    // InternalRos.g:1027:6: lv_message_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getTopicSpecAccess().getMessageMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTopicSpecAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleActionSpec"
    // InternalRos.g:1053:1: entryRuleActionSpec returns [EObject current=null] : iv_ruleActionSpec= ruleActionSpec EOF ;
    public final EObject entryRuleActionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSpec = null;


        try {
            // InternalRos.g:1053:51: (iv_ruleActionSpec= ruleActionSpec EOF )
            // InternalRos.g:1054:2: iv_ruleActionSpec= ruleActionSpec EOF
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
    // InternalRos.g:1060:1: ruleActionSpec returns [EObject current=null] : ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleActionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_goal_5_0 = null;

        EObject lv_result_7_0 = null;

        EObject lv_feedback_9_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1066:2: ( ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' ) )
            // InternalRos.g:1067:2: ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' )
            {
            // InternalRos.g:1067:2: ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' )
            // InternalRos.g:1068:3: () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}'
            {
            // InternalRos.g:1068:3: ()
            // InternalRos.g:1069:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionSpecAccess().getActionSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getActionSpecAccess().getActionSpecKeyword_1());
            		
            // InternalRos.g:1079:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:1080:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:1080:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:1081:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionSpecAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
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

            otherlv_3=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getActionSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:1102:3: (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRos.g:1103:4: otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionSpecAccess().getGoalKeyword_4_0());
                    			
                    // InternalRos.g:1107:4: ( (lv_goal_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:1108:5: (lv_goal_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1108:5: (lv_goal_5_0= ruleMessageDefinition )
                    // InternalRos.g:1109:6: lv_goal_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getGoalMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_24);
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


                    }
                    break;

            }

            // InternalRos.g:1127:3: (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRos.g:1128:4: otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionSpecAccess().getResultKeyword_5_0());
                    			
                    // InternalRos.g:1132:4: ( (lv_result_7_0= ruleMessageDefinition ) )
                    // InternalRos.g:1133:5: (lv_result_7_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1133:5: (lv_result_7_0= ruleMessageDefinition )
                    // InternalRos.g:1134:6: lv_result_7_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getResultMessageDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_result_7_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"result",
                    							lv_result_7_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRos.g:1152:3: (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==45) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRos.g:1153:4: otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) )
                    {
                    otherlv_8=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionSpecAccess().getFeedbackKeyword_6_0());
                    			
                    // InternalRos.g:1157:4: ( (lv_feedback_9_0= ruleMessageDefinition ) )
                    // InternalRos.g:1158:5: (lv_feedback_9_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1158:5: (lv_feedback_9_0= ruleMessageDefinition )
                    // InternalRos.g:1159:6: lv_feedback_9_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getFeedbackMessageDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_feedback_9_0=ruleMessageDefinition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionSpecRule());
                    						}
                    						set(
                    							current,
                    							"feedback",
                    							lv_feedback_9_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessageDefinition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getActionSpecAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:1185:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalRos.g:1185:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalRos.g:1186:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
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
    // InternalRos.g:1192:1: ruleMessageDefinition returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_MessagePart_2_0 = null;

        EObject lv_MessagePart_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1198:2: ( ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' ) )
            // InternalRos.g:1199:2: ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' )
            {
            // InternalRos.g:1199:2: ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' )
            // InternalRos.g:1200:3: () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}'
            {
            // InternalRos.g:1200:3: ()
            // InternalRos.g:1201:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRos.g:1211:3: ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_ID)||LA28_0==39||(LA28_0>=84 && LA28_0<=111)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRos.g:1212:4: ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )*
                    {
                    // InternalRos.g:1212:4: ( (lv_MessagePart_2_0= ruleMessagePart ) )
                    // InternalRos.g:1213:5: (lv_MessagePart_2_0= ruleMessagePart )
                    {
                    // InternalRos.g:1213:5: (lv_MessagePart_2_0= ruleMessagePart )
                    // InternalRos.g:1214:6: lv_MessagePart_2_0= ruleMessagePart
                    {

                    						newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_MessagePart_2_0=ruleMessagePart();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMessageDefinitionRule());
                    						}
                    						add(
                    							current,
                    							"MessagePart",
                    							lv_MessagePart_2_0,
                    							"de.fraunhofer.ipa.ros.Ros.MessagePart");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1231:4: ( (lv_MessagePart_3_0= ruleMessagePart ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_ID)||LA27_0==39||(LA27_0>=84 && LA27_0<=111)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalRos.g:1232:5: (lv_MessagePart_3_0= ruleMessagePart )
                    	    {
                    	    // InternalRos.g:1232:5: (lv_MessagePart_3_0= ruleMessagePart )
                    	    // InternalRos.g:1233:6: lv_MessagePart_3_0= ruleMessagePart
                    	    {

                    	    						newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_26);
                    	    lv_MessagePart_3_0=ruleMessagePart();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getMessageDefinitionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"MessagePart",
                    	    							lv_MessagePart_3_0,
                    	    							"de.fraunhofer.ipa.ros.Ros.MessagePart");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageDefinitionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:1259:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRos.g:1259:45: (iv_ruleNode= ruleNode EOF )
            // InternalRos.g:1260:2: iv_ruleNode= ruleNode EOF
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
    // InternalRos.g:1266:1: ruleNode returns [EObject current=null] : (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )* ) ) ) otherlv_47= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_publisher_7_0 = null;

        EObject lv_publisher_9_0 = null;

        EObject lv_subscriber_13_0 = null;

        EObject lv_subscriber_15_0 = null;

        EObject lv_serviceserver_19_0 = null;

        EObject lv_serviceserver_21_0 = null;

        EObject lv_serviceclient_25_0 = null;

        EObject lv_serviceclient_27_0 = null;

        EObject lv_actionserver_31_0 = null;

        EObject lv_actionserver_33_0 = null;

        EObject lv_actionclient_37_0 = null;

        EObject lv_actionclient_39_0 = null;

        EObject lv_parameter_43_0 = null;

        EObject lv_parameter_45_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1272:2: ( (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )* ) ) ) otherlv_47= '}' ) )
            // InternalRos.g:1273:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )* ) ) ) otherlv_47= '}' )
            {
            // InternalRos.g:1273:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )* ) ) ) otherlv_47= '}' )
            // InternalRos.g:1274:3: otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )* ) ) ) otherlv_47= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getNameKeyword_2());
            		
            // InternalRos.g:1286:3: ( (lv_name_3_0= ruleRosNames ) )
            // InternalRos.g:1287:4: (lv_name_3_0= ruleRosNames )
            {
            // InternalRos.g:1287:4: (lv_name_3_0= ruleRosNames )
            // InternalRos.g:1288:5: lv_name_3_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameRosNamesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_3_0=ruleRosNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.Ros.RosNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:1305:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )* ) ) )
            // InternalRos.g:1306:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )* ) )
            {
            // InternalRos.g:1306:4: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )* ) )
            // InternalRos.g:1307:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getNodeAccess().getUnorderedGroup_4());
            				
            // InternalRos.g:1310:5: ( ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )* )
            // InternalRos.g:1311:6: ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )*
            {
            // InternalRos.g:1311:6: ( ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) ) )*
            loop36:
            do {
                int alt36=8;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 1) ) {
                    alt36=2;
                }
                else if ( LA36_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 2) ) {
                    alt36=3;
                }
                else if ( LA36_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 3) ) {
                    alt36=4;
                }
                else if ( LA36_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 4) ) {
                    alt36=5;
                }
                else if ( LA36_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 5) ) {
                    alt36=6;
                }
                else if ( LA36_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 6) ) {
                    alt36=7;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRos.g:1312:4: ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) )
            	    {
            	    // InternalRos.g:1312:4: ({...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) ) )
            	    // InternalRos.g:1313:5: {...}? => ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // InternalRos.g:1313:101: ( ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) ) )
            	    // InternalRos.g:1314:6: ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 0);
            	    					
            	    // InternalRos.g:1317:9: ({...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' ) )
            	    // InternalRos.g:1317:10: {...}? => (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "true");
            	    }
            	    // InternalRos.g:1317:19: (otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}' )
            	    // InternalRos.g:1317:20: otherlv_5= 'Publishers' otherlv_6= '{' ( (lv_publisher_7_0= rulePublisher ) ) (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )* otherlv_10= '}'
            	    {
            	    otherlv_5=(Token)match(input,48,FOLLOW_3); 

            	    									newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getPublishersKeyword_4_0_0());
            	    								
            	    otherlv_6=(Token)match(input,26,FOLLOW_29); 

            	    									newLeafNode(otherlv_6, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_0_1());
            	    								
            	    // InternalRos.g:1325:9: ( (lv_publisher_7_0= rulePublisher ) )
            	    // InternalRos.g:1326:10: (lv_publisher_7_0= rulePublisher )
            	    {
            	    // InternalRos.g:1326:10: (lv_publisher_7_0= rulePublisher )
            	    // InternalRos.g:1327:11: lv_publisher_7_0= rulePublisher
            	    {

            	    											newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_4_0_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_publisher_7_0=rulePublisher();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNodeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"publisher",
            	    												lv_publisher_7_0,
            	    												"de.fraunhofer.ipa.ros.Ros.Publisher");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRos.g:1344:9: (otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==27) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // InternalRos.g:1345:10: otherlv_8= ',' ( (lv_publisher_9_0= rulePublisher ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,27,FOLLOW_29); 

            	    	    										newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getCommaKeyword_4_0_3_0());
            	    	    									
            	    	    // InternalRos.g:1349:10: ( (lv_publisher_9_0= rulePublisher ) )
            	    	    // InternalRos.g:1350:11: (lv_publisher_9_0= rulePublisher )
            	    	    {
            	    	    // InternalRos.g:1350:11: (lv_publisher_9_0= rulePublisher )
            	    	    // InternalRos.g:1351:12: lv_publisher_9_0= rulePublisher
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_4_0_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_publisher_9_0=rulePublisher();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"publisher",
            	    	    													lv_publisher_9_0,
            	    	    													"de.fraunhofer.ipa.ros.Ros.Publisher");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);

            	    otherlv_10=(Token)match(input,28,FOLLOW_28); 

            	    									newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_0_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRos.g:1379:4: ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) )
            	    {
            	    // InternalRos.g:1379:4: ({...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) ) )
            	    // InternalRos.g:1380:5: {...}? => ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // InternalRos.g:1380:101: ( ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) ) )
            	    // InternalRos.g:1381:6: ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 1);
            	    					
            	    // InternalRos.g:1384:9: ({...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' ) )
            	    // InternalRos.g:1384:10: {...}? => (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "true");
            	    }
            	    // InternalRos.g:1384:19: (otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}' )
            	    // InternalRos.g:1384:20: otherlv_11= 'Subscribers' otherlv_12= '{' ( (lv_subscriber_13_0= ruleSubscriber ) ) (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )* otherlv_16= '}'
            	    {
            	    otherlv_11=(Token)match(input,49,FOLLOW_3); 

            	    									newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getSubscribersKeyword_4_1_0());
            	    								
            	    otherlv_12=(Token)match(input,26,FOLLOW_30); 

            	    									newLeafNode(otherlv_12, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_1_1());
            	    								
            	    // InternalRos.g:1392:9: ( (lv_subscriber_13_0= ruleSubscriber ) )
            	    // InternalRos.g:1393:10: (lv_subscriber_13_0= ruleSubscriber )
            	    {
            	    // InternalRos.g:1393:10: (lv_subscriber_13_0= ruleSubscriber )
            	    // InternalRos.g:1394:11: lv_subscriber_13_0= ruleSubscriber
            	    {

            	    											newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_4_1_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_subscriber_13_0=ruleSubscriber();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNodeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"subscriber",
            	    												lv_subscriber_13_0,
            	    												"de.fraunhofer.ipa.ros.Ros.Subscriber");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRos.g:1411:9: (otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==27) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // InternalRos.g:1412:10: otherlv_14= ',' ( (lv_subscriber_15_0= ruleSubscriber ) )
            	    	    {
            	    	    otherlv_14=(Token)match(input,27,FOLLOW_30); 

            	    	    										newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getCommaKeyword_4_1_3_0());
            	    	    									
            	    	    // InternalRos.g:1416:10: ( (lv_subscriber_15_0= ruleSubscriber ) )
            	    	    // InternalRos.g:1417:11: (lv_subscriber_15_0= ruleSubscriber )
            	    	    {
            	    	    // InternalRos.g:1417:11: (lv_subscriber_15_0= ruleSubscriber )
            	    	    // InternalRos.g:1418:12: lv_subscriber_15_0= ruleSubscriber
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_4_1_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_subscriber_15_0=ruleSubscriber();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"subscriber",
            	    	    													lv_subscriber_15_0,
            	    	    													"de.fraunhofer.ipa.ros.Ros.Subscriber");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);

            	    otherlv_16=(Token)match(input,28,FOLLOW_28); 

            	    									newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_1_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRos.g:1446:4: ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) )
            	    {
            	    // InternalRos.g:1446:4: ({...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) ) )
            	    // InternalRos.g:1447:5: {...}? => ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // InternalRos.g:1447:101: ( ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) ) )
            	    // InternalRos.g:1448:6: ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 2);
            	    					
            	    // InternalRos.g:1451:9: ({...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' ) )
            	    // InternalRos.g:1451:10: {...}? => (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "true");
            	    }
            	    // InternalRos.g:1451:19: (otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}' )
            	    // InternalRos.g:1451:20: otherlv_17= 'ServiceServers' otherlv_18= '{' ( (lv_serviceserver_19_0= ruleServiceServer ) ) (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )* otherlv_22= '}'
            	    {
            	    otherlv_17=(Token)match(input,50,FOLLOW_3); 

            	    									newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getServiceServersKeyword_4_2_0());
            	    								
            	    otherlv_18=(Token)match(input,26,FOLLOW_31); 

            	    									newLeafNode(otherlv_18, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_2_1());
            	    								
            	    // InternalRos.g:1459:9: ( (lv_serviceserver_19_0= ruleServiceServer ) )
            	    // InternalRos.g:1460:10: (lv_serviceserver_19_0= ruleServiceServer )
            	    {
            	    // InternalRos.g:1460:10: (lv_serviceserver_19_0= ruleServiceServer )
            	    // InternalRos.g:1461:11: lv_serviceserver_19_0= ruleServiceServer
            	    {

            	    											newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_serviceserver_19_0=ruleServiceServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNodeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"serviceserver",
            	    												lv_serviceserver_19_0,
            	    												"de.fraunhofer.ipa.ros.Ros.ServiceServer");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRos.g:1478:9: (otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==27) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalRos.g:1479:10: otherlv_20= ',' ( (lv_serviceserver_21_0= ruleServiceServer ) )
            	    	    {
            	    	    otherlv_20=(Token)match(input,27,FOLLOW_31); 

            	    	    										newLeafNode(otherlv_20, grammarAccess.getNodeAccess().getCommaKeyword_4_2_3_0());
            	    	    									
            	    	    // InternalRos.g:1483:10: ( (lv_serviceserver_21_0= ruleServiceServer ) )
            	    	    // InternalRos.g:1484:11: (lv_serviceserver_21_0= ruleServiceServer )
            	    	    {
            	    	    // InternalRos.g:1484:11: (lv_serviceserver_21_0= ruleServiceServer )
            	    	    // InternalRos.g:1485:12: lv_serviceserver_21_0= ruleServiceServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_2_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_serviceserver_21_0=ruleServiceServer();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"serviceserver",
            	    	    													lv_serviceserver_21_0,
            	    	    													"de.fraunhofer.ipa.ros.Ros.ServiceServer");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);

            	    otherlv_22=(Token)match(input,28,FOLLOW_28); 

            	    									newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_2_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRos.g:1513:4: ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) )
            	    {
            	    // InternalRos.g:1513:4: ({...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) ) )
            	    // InternalRos.g:1514:5: {...}? => ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 3)");
            	    }
            	    // InternalRos.g:1514:101: ( ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) ) )
            	    // InternalRos.g:1515:6: ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 3);
            	    					
            	    // InternalRos.g:1518:9: ({...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' ) )
            	    // InternalRos.g:1518:10: {...}? => (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "true");
            	    }
            	    // InternalRos.g:1518:19: (otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}' )
            	    // InternalRos.g:1518:20: otherlv_23= 'ServiceClients' otherlv_24= '{' ( (lv_serviceclient_25_0= ruleServiceClient ) ) (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )* otherlv_28= '}'
            	    {
            	    otherlv_23=(Token)match(input,51,FOLLOW_3); 

            	    									newLeafNode(otherlv_23, grammarAccess.getNodeAccess().getServiceClientsKeyword_4_3_0());
            	    								
            	    otherlv_24=(Token)match(input,26,FOLLOW_32); 

            	    									newLeafNode(otherlv_24, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_3_1());
            	    								
            	    // InternalRos.g:1526:9: ( (lv_serviceclient_25_0= ruleServiceClient ) )
            	    // InternalRos.g:1527:10: (lv_serviceclient_25_0= ruleServiceClient )
            	    {
            	    // InternalRos.g:1527:10: (lv_serviceclient_25_0= ruleServiceClient )
            	    // InternalRos.g:1528:11: lv_serviceclient_25_0= ruleServiceClient
            	    {

            	    											newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_4_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_serviceclient_25_0=ruleServiceClient();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNodeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"serviceclient",
            	    												lv_serviceclient_25_0,
            	    												"de.fraunhofer.ipa.ros.Ros.ServiceClient");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRos.g:1545:9: (otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==27) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalRos.g:1546:10: otherlv_26= ',' ( (lv_serviceclient_27_0= ruleServiceClient ) )
            	    	    {
            	    	    otherlv_26=(Token)match(input,27,FOLLOW_32); 

            	    	    										newLeafNode(otherlv_26, grammarAccess.getNodeAccess().getCommaKeyword_4_3_3_0());
            	    	    									
            	    	    // InternalRos.g:1550:10: ( (lv_serviceclient_27_0= ruleServiceClient ) )
            	    	    // InternalRos.g:1551:11: (lv_serviceclient_27_0= ruleServiceClient )
            	    	    {
            	    	    // InternalRos.g:1551:11: (lv_serviceclient_27_0= ruleServiceClient )
            	    	    // InternalRos.g:1552:12: lv_serviceclient_27_0= ruleServiceClient
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_4_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_serviceclient_27_0=ruleServiceClient();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"serviceclient",
            	    	    													lv_serviceclient_27_0,
            	    	    													"de.fraunhofer.ipa.ros.Ros.ServiceClient");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);

            	    otherlv_28=(Token)match(input,28,FOLLOW_28); 

            	    									newLeafNode(otherlv_28, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRos.g:1580:4: ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) )
            	    {
            	    // InternalRos.g:1580:4: ({...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) ) )
            	    // InternalRos.g:1581:5: {...}? => ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 4)");
            	    }
            	    // InternalRos.g:1581:101: ( ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) ) )
            	    // InternalRos.g:1582:6: ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 4);
            	    					
            	    // InternalRos.g:1585:9: ({...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' ) )
            	    // InternalRos.g:1585:10: {...}? => (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "true");
            	    }
            	    // InternalRos.g:1585:19: (otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}' )
            	    // InternalRos.g:1585:20: otherlv_29= 'ActionServers' otherlv_30= '{' ( (lv_actionserver_31_0= ruleActionServer ) ) (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )* otherlv_34= '}'
            	    {
            	    otherlv_29=(Token)match(input,52,FOLLOW_3); 

            	    									newLeafNode(otherlv_29, grammarAccess.getNodeAccess().getActionServersKeyword_4_4_0());
            	    								
            	    otherlv_30=(Token)match(input,26,FOLLOW_33); 

            	    									newLeafNode(otherlv_30, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_4_1());
            	    								
            	    // InternalRos.g:1593:9: ( (lv_actionserver_31_0= ruleActionServer ) )
            	    // InternalRos.g:1594:10: (lv_actionserver_31_0= ruleActionServer )
            	    {
            	    // InternalRos.g:1594:10: (lv_actionserver_31_0= ruleActionServer )
            	    // InternalRos.g:1595:11: lv_actionserver_31_0= ruleActionServer
            	    {

            	    											newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_4_4_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_actionserver_31_0=ruleActionServer();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNodeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"actionserver",
            	    												lv_actionserver_31_0,
            	    												"de.fraunhofer.ipa.ros.Ros.ActionServer");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRos.g:1612:9: (otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==27) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalRos.g:1613:10: otherlv_32= ',' ( (lv_actionserver_33_0= ruleActionServer ) )
            	    	    {
            	    	    otherlv_32=(Token)match(input,27,FOLLOW_33); 

            	    	    										newLeafNode(otherlv_32, grammarAccess.getNodeAccess().getCommaKeyword_4_4_3_0());
            	    	    									
            	    	    // InternalRos.g:1617:10: ( (lv_actionserver_33_0= ruleActionServer ) )
            	    	    // InternalRos.g:1618:11: (lv_actionserver_33_0= ruleActionServer )
            	    	    {
            	    	    // InternalRos.g:1618:11: (lv_actionserver_33_0= ruleActionServer )
            	    	    // InternalRos.g:1619:12: lv_actionserver_33_0= ruleActionServer
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_4_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_actionserver_33_0=ruleActionServer();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"actionserver",
            	    	    													lv_actionserver_33_0,
            	    	    													"de.fraunhofer.ipa.ros.Ros.ActionServer");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);

            	    otherlv_34=(Token)match(input,28,FOLLOW_28); 

            	    									newLeafNode(otherlv_34, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRos.g:1647:4: ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) )
            	    {
            	    // InternalRos.g:1647:4: ({...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) ) )
            	    // InternalRos.g:1648:5: {...}? => ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 5)");
            	    }
            	    // InternalRos.g:1648:101: ( ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) ) )
            	    // InternalRos.g:1649:6: ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 5);
            	    					
            	    // InternalRos.g:1652:9: ({...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' ) )
            	    // InternalRos.g:1652:10: {...}? => (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "true");
            	    }
            	    // InternalRos.g:1652:19: (otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}' )
            	    // InternalRos.g:1652:20: otherlv_35= 'ActionClients' otherlv_36= '{' ( (lv_actionclient_37_0= ruleActionClient ) ) (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )* otherlv_40= '}'
            	    {
            	    otherlv_35=(Token)match(input,53,FOLLOW_3); 

            	    									newLeafNode(otherlv_35, grammarAccess.getNodeAccess().getActionClientsKeyword_4_5_0());
            	    								
            	    otherlv_36=(Token)match(input,26,FOLLOW_34); 

            	    									newLeafNode(otherlv_36, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_5_1());
            	    								
            	    // InternalRos.g:1660:9: ( (lv_actionclient_37_0= ruleActionClient ) )
            	    // InternalRos.g:1661:10: (lv_actionclient_37_0= ruleActionClient )
            	    {
            	    // InternalRos.g:1661:10: (lv_actionclient_37_0= ruleActionClient )
            	    // InternalRos.g:1662:11: lv_actionclient_37_0= ruleActionClient
            	    {

            	    											newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_4_5_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_actionclient_37_0=ruleActionClient();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNodeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"actionclient",
            	    												lv_actionclient_37_0,
            	    												"de.fraunhofer.ipa.ros.Ros.ActionClient");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRos.g:1679:9: (otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==27) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // InternalRos.g:1680:10: otherlv_38= ',' ( (lv_actionclient_39_0= ruleActionClient ) )
            	    	    {
            	    	    otherlv_38=(Token)match(input,27,FOLLOW_34); 

            	    	    										newLeafNode(otherlv_38, grammarAccess.getNodeAccess().getCommaKeyword_4_5_3_0());
            	    	    									
            	    	    // InternalRos.g:1684:10: ( (lv_actionclient_39_0= ruleActionClient ) )
            	    	    // InternalRos.g:1685:11: (lv_actionclient_39_0= ruleActionClient )
            	    	    {
            	    	    // InternalRos.g:1685:11: (lv_actionclient_39_0= ruleActionClient )
            	    	    // InternalRos.g:1686:12: lv_actionclient_39_0= ruleActionClient
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_4_5_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_actionclient_39_0=ruleActionClient();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"actionclient",
            	    	    													lv_actionclient_39_0,
            	    	    													"de.fraunhofer.ipa.ros.Ros.ActionClient");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);

            	    otherlv_40=(Token)match(input,28,FOLLOW_28); 

            	    									newLeafNode(otherlv_40, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_5_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRos.g:1714:4: ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) )
            	    {
            	    // InternalRos.g:1714:4: ({...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) ) )
            	    // InternalRos.g:1715:5: {...}? => ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "getUnorderedGroupHelper().canSelect(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 6)");
            	    }
            	    // InternalRos.g:1715:101: ( ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) ) )
            	    // InternalRos.g:1716:6: ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getNodeAccess().getUnorderedGroup_4(), 6);
            	    					
            	    // InternalRos.g:1719:9: ({...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' ) )
            	    // InternalRos.g:1719:10: {...}? => (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleNode", "true");
            	    }
            	    // InternalRos.g:1719:19: (otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}' )
            	    // InternalRos.g:1719:20: otherlv_41= 'Parameters' otherlv_42= '{' ( (lv_parameter_43_0= ruleParameter ) ) (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )* otherlv_46= '}'
            	    {
            	    otherlv_41=(Token)match(input,54,FOLLOW_3); 

            	    									newLeafNode(otherlv_41, grammarAccess.getNodeAccess().getParametersKeyword_4_6_0());
            	    								
            	    otherlv_42=(Token)match(input,26,FOLLOW_35); 

            	    									newLeafNode(otherlv_42, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_6_1());
            	    								
            	    // InternalRos.g:1727:9: ( (lv_parameter_43_0= ruleParameter ) )
            	    // InternalRos.g:1728:10: (lv_parameter_43_0= ruleParameter )
            	    {
            	    // InternalRos.g:1728:10: (lv_parameter_43_0= ruleParameter )
            	    // InternalRos.g:1729:11: lv_parameter_43_0= ruleParameter
            	    {

            	    											newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_4_6_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_parameter_43_0=ruleParameter();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getNodeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"parameter",
            	    												lv_parameter_43_0,
            	    												"de.fraunhofer.ipa.ros.Ros.Parameter");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalRos.g:1746:9: (otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) ) )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==27) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // InternalRos.g:1747:10: otherlv_44= ',' ( (lv_parameter_45_0= ruleParameter ) )
            	    	    {
            	    	    otherlv_44=(Token)match(input,27,FOLLOW_35); 

            	    	    										newLeafNode(otherlv_44, grammarAccess.getNodeAccess().getCommaKeyword_4_6_3_0());
            	    	    									
            	    	    // InternalRos.g:1751:10: ( (lv_parameter_45_0= ruleParameter ) )
            	    	    // InternalRos.g:1752:11: (lv_parameter_45_0= ruleParameter )
            	    	    {
            	    	    // InternalRos.g:1752:11: (lv_parameter_45_0= ruleParameter )
            	    	    // InternalRos.g:1753:12: lv_parameter_45_0= ruleParameter
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_4_6_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_parameter_45_0=ruleParameter();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getNodeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"parameter",
            	    	    													lv_parameter_45_0,
            	    	    													"de.fraunhofer.ipa.ros.Ros.Parameter");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop35;
            	        }
            	    } while (true);

            	    otherlv_46=(Token)match(input,28,FOLLOW_28); 

            	    									newLeafNode(otherlv_46, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_6_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNodeAccess().getUnorderedGroup_4());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getNodeAccess().getUnorderedGroup_4());
            				

            }

            otherlv_47=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_47, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleServiceServer"
    // InternalRos.g:1796:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRos.g:1796:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRos.g:1797:2: iv_ruleServiceServer= ruleServiceServer EOF
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
    // InternalRos.g:1803:1: ruleServiceServer returns [EObject current=null] : (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleServiceServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1809:2: ( (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:1810:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:1810:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:1811:3: otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceServerAccess().getServiceServerKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getNameKeyword_2());
            		
            // InternalRos.g:1823:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1824:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1824:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1825:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceServerAccess().getServiceKeyword_4());
            		
            // InternalRos.g:1846:3: ( ( ruleEString ) )
            // InternalRos.g:1847:4: ( ruleEString )
            {
            // InternalRos.g:1847:4: ( ruleEString )
            // InternalRos.g:1848:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceServerAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:1862:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalRos.g:1863:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceServerAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:1867:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:1868:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:1868:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:1869:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceServerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulePublisher"
    // InternalRos.g:1895:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRos.g:1895:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRos.g:1896:2: iv_rulePublisher= rulePublisher EOF
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
    // InternalRos.g:1902:1: rulePublisher returns [EObject current=null] : (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
    public final EObject rulePublisher() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1908:2: ( (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:1909:2: (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:1909:2: (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:1910:3: otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPublisherAccess().getPublisherKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getNameKeyword_2());
            		
            // InternalRos.g:1922:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1923:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1923:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1924:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPublisherRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getMessageKeyword_4());
            		
            // InternalRos.g:1945:3: ( ( ruleEString ) )
            // InternalRos.g:1946:4: ( ruleEString )
            {
            // InternalRos.g:1946:4: ( ruleEString )
            // InternalRos.g:1947:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:1961:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==57) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRos.g:1962:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:1966:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:1967:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:1967:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:1968:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getPublisherAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:1994:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRos.g:1994:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRos.g:1995:2: iv_ruleSubscriber= ruleSubscriber EOF
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
    // InternalRos.g:2001:1: ruleSubscriber returns [EObject current=null] : (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleSubscriber() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2007:2: ( (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2008:2: (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2008:2: (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2009:3: otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubscriberAccess().getSubscriberKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getNameKeyword_2());
            		
            // InternalRos.g:2021:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2022:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2022:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2023:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubscriberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getMessageKeyword_4());
            		
            // InternalRos.g:2044:3: ( ( ruleEString ) )
            // InternalRos.g:2045:4: ( ruleEString )
            {
            // InternalRos.g:2045:4: ( ruleEString )
            // InternalRos.g:2046:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2060:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==57) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRos.g:2061:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2065:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2066:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2066:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2067:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSubscriberAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleServiceClient"
    // InternalRos.g:2093:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRos.g:2093:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRos.g:2094:2: iv_ruleServiceClient= ruleServiceClient EOF
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
    // InternalRos.g:2100:1: ruleServiceClient returns [EObject current=null] : (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleServiceClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2106:2: ( (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2107:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2107:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2108:3: otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceClientAccess().getServiceClientKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getNameKeyword_2());
            		
            // InternalRos.g:2120:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2121:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2121:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2122:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceClientAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getServiceClientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,56,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceClientAccess().getServiceKeyword_4());
            		
            // InternalRos.g:2143:3: ( ( ruleEString ) )
            // InternalRos.g:2144:4: ( ruleEString )
            {
            // InternalRos.g:2144:4: ( ruleEString )
            // InternalRos.g:2145:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceClientAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2159:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRos.g:2160:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2164:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2165:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2165:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2166:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceClientAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:2192:1: entryRuleActionServer returns [EObject current=null] : iv_ruleActionServer= ruleActionServer EOF ;
    public final EObject entryRuleActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionServer = null;


        try {
            // InternalRos.g:2192:53: (iv_ruleActionServer= ruleActionServer EOF )
            // InternalRos.g:2193:2: iv_ruleActionServer= ruleActionServer EOF
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
    // InternalRos.g:2199:1: ruleActionServer returns [EObject current=null] : (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleActionServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2205:2: ( (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2206:2: (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2206:2: (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2207:3: otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionServerAccess().getActionServerKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getActionServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getActionServerAccess().getNameKeyword_2());
            		
            // InternalRos.g:2219:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2220:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2220:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2221:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionServerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getActionServerAccess().getActionKeyword_4());
            		
            // InternalRos.g:2242:3: ( ( ruleEString ) )
            // InternalRos.g:2243:4: ( ruleEString )
            {
            // InternalRos.g:2243:4: ( ruleEString )
            // InternalRos.g:2244:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionServerAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2258:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==57) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRos.g:2259:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionServerAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2263:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2264:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2264:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2265:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getActionServerAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:2291:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // InternalRos.g:2291:53: (iv_ruleActionClient= ruleActionClient EOF )
            // InternalRos.g:2292:2: iv_ruleActionClient= ruleActionClient EOF
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
    // InternalRos.g:2298:1: ruleActionClient returns [EObject current=null] : (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleActionClient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2304:2: ( (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2305:2: (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2305:2: (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2306:3: otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionClientAccess().getActionClientKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getActionClientAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getActionClientAccess().getNameKeyword_2());
            		
            // InternalRos.g:2318:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2319:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2319:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2320:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionClientAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_40);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActionClientRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,62,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getActionClientAccess().getActionKeyword_4());
            		
            // InternalRos.g:2341:3: ( ( ruleEString ) )
            // InternalRos.g:2342:4: ( ruleEString )
            {
            // InternalRos.g:2342:4: ( ruleEString )
            // InternalRos.g:2343:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionClientAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_37);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2357:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==57) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRos.g:2358:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2362:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2363:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2363:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2364:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getActionClientAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleGraphName"
    // InternalRos.g:2390:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRos.g:2390:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRos.g:2391:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalRos.g:2397:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GraphName' ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:2403:2: (kw= 'GraphName' )
            // InternalRos.g:2404:2: kw= 'GraphName'
            {
            kw=(Token)match(input,64,FOLLOW_2); 

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


    // $ANTLR start "entryRulePackageDependency"
    // InternalRos.g:2412:1: entryRulePackageDependency returns [EObject current=null] : iv_rulePackageDependency= rulePackageDependency EOF ;
    public final EObject entryRulePackageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDependency = null;


        try {
            // InternalRos.g:2412:58: (iv_rulePackageDependency= rulePackageDependency EOF )
            // InternalRos.g:2413:2: iv_rulePackageDependency= rulePackageDependency EOF
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
    // InternalRos.g:2419:1: rulePackageDependency returns [EObject current=null] : (otherlv_0= 'PackageDependency' ( ( ruleEString ) ) ) ;
    public final EObject rulePackageDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRos.g:2425:2: ( (otherlv_0= 'PackageDependency' ( ( ruleEString ) ) ) )
            // InternalRos.g:2426:2: (otherlv_0= 'PackageDependency' ( ( ruleEString ) ) )
            {
            // InternalRos.g:2426:2: (otherlv_0= 'PackageDependency' ( ( ruleEString ) ) )
            // InternalRos.g:2427:3: otherlv_0= 'PackageDependency' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDependencyAccess().getPackageDependencyKeyword_0());
            		
            // InternalRos.g:2431:3: ( ( ruleEString ) )
            // InternalRos.g:2432:4: ( ruleEString )
            {
            // InternalRos.g:2432:4: ( ruleEString )
            // InternalRos.g:2433:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPackageDependencyAccess().getPackagePackageCrossReference_1_0());
            				
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
    // $ANTLR end "rulePackageDependency"


    // $ANTLR start "entryRuleExternalDependency"
    // InternalRos.g:2451:1: entryRuleExternalDependency returns [EObject current=null] : iv_ruleExternalDependency= ruleExternalDependency EOF ;
    public final EObject entryRuleExternalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDependency = null;


        try {
            // InternalRos.g:2451:59: (iv_ruleExternalDependency= ruleExternalDependency EOF )
            // InternalRos.g:2452:2: iv_ruleExternalDependency= ruleExternalDependency EOF
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
    // InternalRos.g:2458:1: ruleExternalDependency returns [EObject current=null] : ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2464:2: ( ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRos.g:2465:2: ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRos.g:2465:2: ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRos.g:2466:3: () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRos.g:2466:3: ()
            // InternalRos.g:2467:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1());
            		
            // InternalRos.g:2477:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:2478:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:2478:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:2479:5: lv_name_2_0= ruleEString
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


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalRos.g:2500:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRos.g:2500:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRos.g:2501:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalRos.g:2507:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2513:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2514:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2514:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2515:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2515:3: ()
            // InternalRos.g:2516:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2530:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==68) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRos.g:2531:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2539:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2540:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2540:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2541:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_5);
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

                    // InternalRos.g:2558:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==27) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalRos.g:2559:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FOLLOW_42); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2563:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2564:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2564:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2565:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:2596:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRos.g:2596:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRos.g:2597:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalRos.g:2603:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2609:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2610:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2610:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2611:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2611:3: ()
            // InternalRos.g:2612:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2626:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==68) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRos.g:2627:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2635:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2636:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2636:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2637:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_5);
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

                    // InternalRos.g:2654:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==27) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalRos.g:2655:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FOLLOW_42); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2659:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2660:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2660:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2661:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:2692:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRos.g:2692:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRos.g:2693:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalRos.g:2699:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_parts_5_0 = null;

        AntlrDatatypeRuleToken lv_parts_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2705:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2706:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2706:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2707:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2707:3: ()
            // InternalRos.g:2708:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2722:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==68) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalRos.g:2723:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,68,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_42); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2731:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2732:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2732:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2733:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_5);
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

                    // InternalRos.g:2750:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==27) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalRos.g:2751:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FOLLOW_42); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2755:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2756:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2756:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2757:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_5);
                    	    lv_parts_7_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_7_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,28,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:2788:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRos.g:2788:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRos.g:2789:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRos.g:2795:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_namespace_5_0 = null;

        EObject lv_type_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2801:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) )
            // InternalRos.g:2802:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            {
            // InternalRos.g:2802:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            // InternalRos.g:2803:3: otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_2());
            		
            // InternalRos.g:2815:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2816:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2816:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2817:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_43);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2834:3: (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==57) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRos.g:2835:4: otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,57,FOLLOW_38); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getNamespaceKeyword_4_0());
                    			
                    // InternalRos.g:2839:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalRos.g:2840:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalRos.g:2840:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalRos.g:2841:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_namespace_5_0=ruleNamespace();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						set(
                    							current,
                    							"namespace",
                    							lv_namespace_5_0,
                    							"de.fraunhofer.ipa.ros.Ros.Namespace");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,72,FOLLOW_45); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getTypeKeyword_5());
            		
            // InternalRos.g:2863:3: ( (lv_type_7_0= ruleParameterType ) )
            // InternalRos.g:2864:4: (lv_type_7_0= ruleParameterType )
            {
            // InternalRos.g:2864:4: (lv_type_7_0= ruleParameterType )
            // InternalRos.g:2865:5: lv_type_7_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_14);
            lv_type_7_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_7_0,
            						"de.fraunhofer.ipa.ros.Ros.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:2890:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRos.g:2890:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRos.g:2891:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalRos.g:2897:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
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
            // InternalRos.g:2903:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalRos.g:2904:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalRos.g:2904:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt50=8;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt50=1;
                }
                break;
            case 74:
                {
                alt50=2;
                }
                break;
            case 75:
                {
                alt50=3;
                }
                break;
            case 40:
                {
                alt50=4;
                }
                break;
            case 77:
                {
                alt50=5;
                }
                break;
            case 78:
                {
                alt50=6;
                }
                break;
            case 79:
                {
                alt50=7;
                }
                break;
            case 80:
                {
                alt50=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalRos.g:2905:3: this_ParameterListType_0= ruleParameterListType
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
                    // InternalRos.g:2914:3: this_ParameterStructType_1= ruleParameterStructType
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
                    // InternalRos.g:2923:3: this_ParameterIntegerType_2= ruleParameterIntegerType
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
                    // InternalRos.g:2932:3: this_ParameterStringType_3= ruleParameterStringType
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
                    // InternalRos.g:2941:3: this_ParameterDoubleType_4= ruleParameterDoubleType
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
                    // InternalRos.g:2950:3: this_ParameterBooleanType_5= ruleParameterBooleanType
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
                    // InternalRos.g:2959:3: this_ParameterBase64Type_6= ruleParameterBase64Type
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
                    // InternalRos.g:2968:3: this_ParameterArrayType_7= ruleParameterArrayType
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
    // InternalRos.g:2980:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRos.g:2980:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRos.g:2981:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalRos.g:2987:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
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
            // InternalRos.g:2993:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalRos.g:2994:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalRos.g:2994:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt51=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt51=1;
                }
                break;
            case RULE_BINARY:
                {
                alt51=2;
                }
                break;
            case RULE_DECINT:
                {
                alt51=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt51=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt51=5;
                }
                break;
            case 26:
                {
                int LA51_6 = input.LA(2);

                if ( ((LA51_6>=RULE_STRING && LA51_6<=RULE_ID)||(LA51_6>=RULE_BINARY && LA51_6<=RULE_DECINT)||(LA51_6>=26 && LA51_6<=28)) ) {
                    alt51=6;
                }
                else if ( (LA51_6==83) ) {
                    alt51=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 6, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 27:
            case 28:
                {
                alt51=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalRos.g:2995:3: this_ParameterString_0= ruleParameterString
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
                    // InternalRos.g:3004:3: this_ParameterBase64_1= ruleParameterBase64
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
                    // InternalRos.g:3013:3: this_ParameterInteger_2= ruleParameterInteger
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
                    // InternalRos.g:3022:3: this_ParameterDouble_3= ruleParameterDouble
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
                    // InternalRos.g:3031:3: this_ParameterBoolean_4= ruleParameterBoolean
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
                    // InternalRos.g:3040:3: this_ParameterList_5= ruleParameterList
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
                    // InternalRos.g:3049:3: this_ParameterStruct_6= ruleParameterStruct
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
    // InternalRos.g:3061:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRos.g:3061:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRos.g:3062:2: iv_ruleParameterListType= ruleParameterListType EOF
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
    // InternalRos.g:3068:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) ;
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
            // InternalRos.g:3074:2: ( ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) )
            // InternalRos.g:3075:2: ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' )
            {
            // InternalRos.g:3075:2: ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' )
            // InternalRos.g:3076:3: () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}'
            {
            // InternalRos.g:3076:3: ()
            // InternalRos.g:3077:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3091:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalRos.g:3092:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalRos.g:3092:4: (lv_sequence_3_0= ruleParameterType )
            // InternalRos.g:3093:5: lv_sequence_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalRos.g:3110:3: (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==27) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalRos.g:3111:4: otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_45); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRos.g:3115:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalRos.g:3116:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalRos.g:3116:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalRos.g:3117:6: lv_sequence_5_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
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
            	    break loop52;
                }
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3143:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRos.g:3143:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRos.g:3144:2: iv_ruleParameterStructType= ruleParameterStructType EOF
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
    // InternalRos.g:3150:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= 'Struct' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' ) ;
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
            // InternalRos.g:3156:2: ( ( () otherlv_1= 'Struct' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' ) )
            // InternalRos.g:3157:2: ( () otherlv_1= 'Struct' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' )
            {
            // InternalRos.g:3157:2: ( () otherlv_1= 'Struct' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' )
            // InternalRos.g:3158:3: () otherlv_1= 'Struct' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}'
            {
            // InternalRos.g:3158:3: ()
            // InternalRos.g:3159:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3173:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalRos.g:3174:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalRos.g:3174:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalRos.g:3175:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalRos.g:3192:3: (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==27) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalRos.g:3193:4: otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRos.g:3197:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalRos.g:3198:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalRos.g:3198:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalRos.g:3199:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
            	    {

            	    						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
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
            	    break loop53;
                }
            } while (true);

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3225:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRos.g:3225:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRos.g:3226:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
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
    // InternalRos.g:3232:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= 'Integer' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterInteger ) ) )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3238:2: ( ( () otherlv_1= 'Integer' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterInteger ) ) )? ) )
            // InternalRos.g:3239:2: ( () otherlv_1= 'Integer' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            {
            // InternalRos.g:3239:2: ( () otherlv_1= 'Integer' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            // InternalRos.g:3240:3: () otherlv_1= 'Integer' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterInteger ) ) )?
            {
            // InternalRos.g:3240:3: ()
            // InternalRos.g:3241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,75,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
            		
            // InternalRos.g:3251:3: (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterInteger ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==76) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_DECINT) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // InternalRos.g:3252:4: otherlv_2= 'default' ( (lv_default_3_0= ruleParameterInteger ) )
                    {
                    otherlv_2=(Token)match(input,76,FOLLOW_47); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos.g:3256:4: ( (lv_default_3_0= ruleParameterInteger ) )
                    // InternalRos.g:3257:5: (lv_default_3_0= ruleParameterInteger )
                    {
                    // InternalRos.g:3257:5: (lv_default_3_0= ruleParameterInteger )
                    // InternalRos.g:3258:6: lv_default_3_0= ruleParameterInteger
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
    // InternalRos.g:3280:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRos.g:3280:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRos.g:3281:2: iv_ruleParameterStringType= ruleParameterStringType EOF
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
    // InternalRos.g:3287:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= 'String' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterString ) ) )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3293:2: ( ( () otherlv_1= 'String' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterString ) ) )? ) )
            // InternalRos.g:3294:2: ( () otherlv_1= 'String' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterString ) ) )? )
            {
            // InternalRos.g:3294:2: ( () otherlv_1= 'String' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterString ) ) )? )
            // InternalRos.g:3295:3: () otherlv_1= 'String' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterString ) ) )?
            {
            // InternalRos.g:3295:3: ()
            // InternalRos.g:3296:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            		
            // InternalRos.g:3306:3: (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==76) ) {
                int LA55_1 = input.LA(2);

                if ( ((LA55_1>=RULE_STRING && LA55_1<=RULE_ID)) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalRos.g:3307:4: otherlv_2= 'default' ( (lv_default_3_0= ruleParameterString ) )
                    {
                    otherlv_2=(Token)match(input,76,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos.g:3311:4: ( (lv_default_3_0= ruleParameterString ) )
                    // InternalRos.g:3312:5: (lv_default_3_0= ruleParameterString )
                    {
                    // InternalRos.g:3312:5: (lv_default_3_0= ruleParameterString )
                    // InternalRos.g:3313:6: lv_default_3_0= ruleParameterString
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
    // InternalRos.g:3335:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRos.g:3335:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRos.g:3336:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
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
    // InternalRos.g:3342:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= 'Double' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterDouble ) ) )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3348:2: ( ( () otherlv_1= 'Double' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterDouble ) ) )? ) )
            // InternalRos.g:3349:2: ( () otherlv_1= 'Double' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            {
            // InternalRos.g:3349:2: ( () otherlv_1= 'Double' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            // InternalRos.g:3350:3: () otherlv_1= 'Double' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterDouble ) ) )?
            {
            // InternalRos.g:3350:3: ()
            // InternalRos.g:3351:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
            		
            // InternalRos.g:3361:3: (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterDouble ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==76) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==RULE_DOUBLE) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalRos.g:3362:4: otherlv_2= 'default' ( (lv_default_3_0= ruleParameterDouble ) )
                    {
                    otherlv_2=(Token)match(input,76,FOLLOW_48); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos.g:3366:4: ( (lv_default_3_0= ruleParameterDouble ) )
                    // InternalRos.g:3367:5: (lv_default_3_0= ruleParameterDouble )
                    {
                    // InternalRos.g:3367:5: (lv_default_3_0= ruleParameterDouble )
                    // InternalRos.g:3368:6: lv_default_3_0= ruleParameterDouble
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
    // InternalRos.g:3390:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRos.g:3390:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRos.g:3391:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
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
    // InternalRos.g:3397:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= 'Boolean' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3403:2: ( ( () otherlv_1= 'Boolean' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) )
            // InternalRos.g:3404:2: ( () otherlv_1= 'Boolean' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            {
            // InternalRos.g:3404:2: ( () otherlv_1= 'Boolean' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            // InternalRos.g:3405:3: () otherlv_1= 'Boolean' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            {
            // InternalRos.g:3405:3: ()
            // InternalRos.g:3406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
            		
            // InternalRos.g:3416:3: (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==76) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==RULE_BOOLEAN) ) {
                    alt57=1;
                }
            }
            switch (alt57) {
                case 1 :
                    // InternalRos.g:3417:4: otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBoolean ) )
                    {
                    otherlv_2=(Token)match(input,76,FOLLOW_49); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos.g:3421:4: ( (lv_default_3_0= ruleParameterBoolean ) )
                    // InternalRos.g:3422:5: (lv_default_3_0= ruleParameterBoolean )
                    {
                    // InternalRos.g:3422:5: (lv_default_3_0= ruleParameterBoolean )
                    // InternalRos.g:3423:6: lv_default_3_0= ruleParameterBoolean
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
    // InternalRos.g:3445:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRos.g:3445:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRos.g:3446:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
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
    // InternalRos.g:3452:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= 'Base64' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3458:2: ( ( () otherlv_1= 'Base64' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) )
            // InternalRos.g:3459:2: ( () otherlv_1= 'Base64' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            {
            // InternalRos.g:3459:2: ( () otherlv_1= 'Base64' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            // InternalRos.g:3460:3: () otherlv_1= 'Base64' (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            {
            // InternalRos.g:3460:3: ()
            // InternalRos.g:3461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
            		
            // InternalRos.g:3471:3: (otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==76) ) {
                int LA58_1 = input.LA(2);

                if ( (LA58_1==RULE_BINARY) ) {
                    alt58=1;
                }
            }
            switch (alt58) {
                case 1 :
                    // InternalRos.g:3472:4: otherlv_2= 'default' ( (lv_default_3_0= ruleParameterBase64 ) )
                    {
                    otherlv_2=(Token)match(input,76,FOLLOW_50); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalRos.g:3476:4: ( (lv_default_3_0= ruleParameterBase64 ) )
                    // InternalRos.g:3477:5: (lv_default_3_0= ruleParameterBase64 )
                    {
                    // InternalRos.g:3477:5: (lv_default_3_0= ruleParameterBase64 )
                    // InternalRos.g:3478:6: lv_default_3_0= ruleParameterBase64
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
    // InternalRos.g:3500:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRos.g:3500:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRos.g:3501:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
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
    // InternalRos.g:3507:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleParameterArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_type_3_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3513:2: ( (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' ) )
            // InternalRos.g:3514:2: (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' )
            {
            // InternalRos.g:3514:2: (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' )
            // InternalRos.g:3515:3: otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,72,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalRos.g:3527:3: ( (lv_type_3_0= ruleParameterType ) )
            // InternalRos.g:3528:4: (lv_type_3_0= ruleParameterType )
            {
            // InternalRos.g:3528:4: (lv_type_3_0= ruleParameterType )
            // InternalRos.g:3529:5: lv_type_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_51);
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

            // InternalRos.g:3546:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==76) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRos.g:3547:4: otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) )
                    {
                    otherlv_4=(Token)match(input,76,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRos.g:3551:4: ( (lv_default_5_0= ruleParameterList ) )
                    // InternalRos.g:3552:5: (lv_default_5_0= ruleParameterList )
                    {
                    // InternalRos.g:3552:5: (lv_default_5_0= ruleParameterList )
                    // InternalRos.g:3553:6: lv_default_5_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
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

            otherlv_6=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterArrayTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3579:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalRos.g:3579:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalRos.g:3580:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalRos.g:3586:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3592:2: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) )
            // InternalRos.g:3593:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            {
            // InternalRos.g:3593:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            // InternalRos.g:3594:3: () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}'
            {
            // InternalRos.g:3594:3: ()
            // InternalRos.g:3595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRos.g:3605:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRos.g:3606:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRos.g:3606:4: (lv_value_2_0= ruleParameterValue )
            // InternalRos.g:3607:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
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

            // InternalRos.g:3624:3: (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==27) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalRos.g:3625:4: otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,27,FOLLOW_52); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRos.g:3629:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalRos.g:3630:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalRos.g:3630:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalRos.g:3631:6: lv_value_4_0= ruleParameterValue
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
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
            	    break loop60;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterListAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3657:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRos.g:3657:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRos.g:3658:2: iv_ruleParameterAny= ruleParameterAny EOF
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
    // InternalRos.g:3664:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3670:2: ( ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3671:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3671:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRos.g:3672:3: () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3672:3: ()
            // InternalRos.g:3673:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3687:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==82) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRos.g:3688:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,82,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyAccess().getValueKeyword_3_0());
                    			
                    // InternalRos.g:3692:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRos.g:3693:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRos.g:3693:5: (lv_value_4_0= ruleEString )
                    // InternalRos.g:3694:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_value_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterAnyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"de.fraunhofer.ipa.ros.Ros.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAnyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3720:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRos.g:3720:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRos.g:3721:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalRos.g:3727:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3733:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRos.g:3734:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRos.g:3734:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRos.g:3735:3: (lv_value_0_0= ruleEString )
            {
            // InternalRos.g:3735:3: (lv_value_0_0= ruleEString )
            // InternalRos.g:3736:4: lv_value_0_0= ruleEString
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
    // InternalRos.g:3756:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRos.g:3756:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRos.g:3757:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalRos.g:3763:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3769:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalRos.g:3770:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalRos.g:3770:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalRos.g:3771:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalRos.g:3771:3: (lv_value_0_0= ruleBase64Binary )
            // InternalRos.g:3772:4: lv_value_0_0= ruleBase64Binary
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
    // InternalRos.g:3792:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRos.g:3792:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRos.g:3793:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalRos.g:3799:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3805:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalRos.g:3806:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalRos.g:3806:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalRos.g:3807:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalRos.g:3807:3: (lv_value_0_0= ruleInteger0 )
            // InternalRos.g:3808:4: lv_value_0_0= ruleInteger0
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
    // InternalRos.g:3828:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRos.g:3828:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRos.g:3829:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalRos.g:3835:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3841:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalRos.g:3842:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalRos.g:3842:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalRos.g:3843:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalRos.g:3843:3: (lv_value_0_0= ruleDouble0 )
            // InternalRos.g:3844:4: lv_value_0_0= ruleDouble0
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
    // InternalRos.g:3864:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRos.g:3864:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRos.g:3865:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalRos.g:3871:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3877:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalRos.g:3878:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalRos.g:3878:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalRos.g:3879:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalRos.g:3879:3: (lv_value_0_0= ruleboolean0 )
            // InternalRos.g:3880:4: lv_value_0_0= ruleboolean0
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
    // InternalRos.g:3900:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRos.g:3900:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRos.g:3901:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalRos.g:3907:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) ;
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
            // InternalRos.g:3913:2: ( ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) )
            // InternalRos.g:3914:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            {
            // InternalRos.g:3914:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            // InternalRos.g:3915:3: () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            {
            // InternalRos.g:3915:3: ()
            // InternalRos.g:3916:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalRos.g:3922:3: (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==26) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRos.g:3923:4: otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_54); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalRos.g:3927:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalRos.g:3928:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalRos.g:3928:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalRos.g:3929:6: lv_value_2_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_5);
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

                    // InternalRos.g:3946:4: (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==27) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalRos.g:3947:5: otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}'
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,26,FOLLOW_54); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1());
                    	    				
                    	    // InternalRos.g:3955:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalRos.g:3956:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRos.g:3956:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalRos.g:3957:7: lv_value_5_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
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

                    	    otherlv_6=(Token)match(input,28,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_3());
                    			

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
    // InternalRos.g:3988:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRos.g:3988:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRos.g:3989:2: iv_ruleParameterDate= ruleParameterDate EOF
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
    // InternalRos.g:3995:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4001:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalRos.g:4002:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalRos.g:4002:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalRos.g:4003:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalRos.g:4003:3: (lv_value_0_0= ruleDateTime0 )
            // InternalRos.g:4004:4: lv_value_0_0= ruleDateTime0
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
    // InternalRos.g:4024:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRos.g:4024:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRos.g:4025:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalRos.g:4031:1: ruleParameterStructMember returns [EObject current=null] : (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4037:2: ( (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) )
            // InternalRos.g:4038:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            {
            // InternalRos.g:4038:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            // InternalRos.g:4039:3: otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,83,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructMemberAccess().getParameterStructMemberKeyword_0());
            		
            // InternalRos.g:4043:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos.g:4044:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos.g:4044:4: (lv_name_1_0= ruleEString )
            // InternalRos.g:4045:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,26,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,82,FOLLOW_52); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterStructMemberAccess().getValueKeyword_3());
            		
            // InternalRos.g:4070:3: ( (lv_value_4_0= ruleParameterValue ) )
            // InternalRos.g:4071:4: (lv_value_4_0= ruleParameterValue )
            {
            // InternalRos.g:4071:4: (lv_value_4_0= ruleParameterValue )
            // InternalRos.g:4072:5: lv_value_4_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterStructMemberAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:4097:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRos.g:4097:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRos.g:4098:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
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
    // InternalRos.g:4104:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4110:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalRos.g:4111:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalRos.g:4111:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalRos.g:4112:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalRos.g:4112:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRos.g:4113:4: (lv_name_0_0= ruleEString )
            {
            // InternalRos.g:4113:4: (lv_name_0_0= ruleEString )
            // InternalRos.g:4114:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_45);
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

            // InternalRos.g:4131:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalRos.g:4132:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalRos.g:4132:4: (lv_type_1_0= ruleParameterType )
            // InternalRos.g:4133:5: lv_type_1_0= ruleParameterType
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
    // InternalRos.g:4154:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRos.g:4154:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRos.g:4155:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalRos.g:4161:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalRos.g:4167:2: (this_BINARY_0= RULE_BINARY )
            // InternalRos.g:4168:2: this_BINARY_0= RULE_BINARY
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
    // InternalRos.g:4178:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalRos.g:4178:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalRos.g:4179:2: iv_ruleboolean0= ruleboolean0 EOF
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
    // InternalRos.g:4185:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalRos.g:4191:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalRos.g:4192:2: this_BOOLEAN_0= RULE_BOOLEAN
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
    // InternalRos.g:4202:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalRos.g:4202:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalRos.g:4203:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalRos.g:4209:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalRos.g:4215:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalRos.g:4216:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalRos.g:4226:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalRos.g:4226:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalRos.g:4227:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalRos.g:4233:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalRos.g:4239:2: (this_DECINT_0= RULE_DECINT )
            // InternalRos.g:4240:2: this_DECINT_0= RULE_DECINT
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
    // InternalRos.g:4250:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalRos.g:4250:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalRos.g:4251:2: iv_ruleDateTime0= ruleDateTime0 EOF
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
    // InternalRos.g:4257:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalRos.g:4263:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalRos.g:4264:2: this_DATE_TIME_0= RULE_DATE_TIME
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
    // InternalRos.g:4274:1: entryRuleMessagePart returns [EObject current=null] : iv_ruleMessagePart= ruleMessagePart EOF ;
    public final EObject entryRuleMessagePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessagePart = null;


        try {
            // InternalRos.g:4274:52: (iv_ruleMessagePart= ruleMessagePart EOF )
            // InternalRos.g:4275:2: iv_ruleMessagePart= ruleMessagePart EOF
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
    // InternalRos.g:4281:1: ruleMessagePart returns [EObject current=null] : ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) ) ;
    public final EObject ruleMessagePart() throws RecognitionException {
        EObject current = null;

        Token lv_Data_1_2=null;
        EObject lv_Type_0_0 = null;

        AntlrDatatypeRuleToken lv_Data_1_1 = null;

        AntlrDatatypeRuleToken lv_Data_1_3 = null;



        	enterRule();

        try {
            // InternalRos.g:4287:2: ( ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) ) )
            // InternalRos.g:4288:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) )
            {
            // InternalRos.g:4288:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) )
            // InternalRos.g:4289:3: ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) )
            {
            // InternalRos.g:4289:3: ( (lv_Type_0_0= ruleAbstractType ) )
            // InternalRos.g:4290:4: (lv_Type_0_0= ruleAbstractType )
            {
            // InternalRos.g:4290:4: (lv_Type_0_0= ruleAbstractType )
            // InternalRos.g:4291:5: lv_Type_0_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getMessagePartAccess().getTypeAbstractTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_56);
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

            // InternalRos.g:4308:3: ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) )
            // InternalRos.g:4309:4: ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) )
            {
            // InternalRos.g:4309:4: ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) )
            // InternalRos.g:4310:5: (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString )
            {
            // InternalRos.g:4310:5: (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 41:
            case 43:
            case 44:
            case 45:
            case 47:
            case 56:
            case 62:
            case 72:
            case 82:
            case 97:
            case 98:
                {
                alt64=1;
                }
                break;
            case RULE_MESSAGE_ASIGMENT:
                {
                alt64=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalRos.g:4311:6: lv_Data_1_1= ruleKEYWORD
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
                    // InternalRos.g:4327:6: lv_Data_1_2= RULE_MESSAGE_ASIGMENT
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
                    // InternalRos.g:4342:6: lv_Data_1_3= ruleEString
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
    // InternalRos.g:4364:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalRos.g:4364:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalRos.g:4365:2: iv_ruleAbstractType= ruleAbstractType EOF
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
    // InternalRos.g:4371:1: ruleAbstractType returns [EObject current=null] : (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef ) ;
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
            // InternalRos.g:4377:2: ( (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef ) )
            // InternalRos.g:4378:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )
            {
            // InternalRos.g:4378:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )
            int alt65=31;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // InternalRos.g:4379:3: this_bool_0= rulebool
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
                    // InternalRos.g:4388:3: this_int8_1= ruleint8
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
                    // InternalRos.g:4397:3: this_uint8_2= ruleuint8
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
                    // InternalRos.g:4406:3: this_int16_3= ruleint16
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
                    // InternalRos.g:4415:3: this_uint16_4= ruleuint16
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
                    // InternalRos.g:4424:3: this_int32_5= ruleint32
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
                    // InternalRos.g:4433:3: this_uint32_6= ruleuint32
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
                    // InternalRos.g:4442:3: this_int64_7= ruleint64
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
                    // InternalRos.g:4451:3: this_uint64_8= ruleuint64
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
                    // InternalRos.g:4460:3: this_float32_9= rulefloat32
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
                    // InternalRos.g:4469:3: this_float64_10= rulefloat64
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
                    // InternalRos.g:4478:3: this_string0_11= rulestring0
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
                    // InternalRos.g:4487:3: this_byte_12= rulebyte
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
                    // InternalRos.g:4496:3: this_time_13= ruletime
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
                    // InternalRos.g:4505:3: this_duration_14= ruleduration
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
                    // InternalRos.g:4514:3: this_Header_15= ruleHeader
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
                    // InternalRos.g:4523:3: this_boolArray_16= ruleboolArray
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
                    // InternalRos.g:4532:3: this_int8Array_17= ruleint8Array
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
                    // InternalRos.g:4541:3: this_uint8Array_18= ruleuint8Array
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
                    // InternalRos.g:4550:3: this_int16Array_19= ruleint16Array
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
                    // InternalRos.g:4559:3: this_uint16Array_20= ruleuint16Array
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
                    // InternalRos.g:4568:3: this_int32Array_21= ruleint32Array
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
                    // InternalRos.g:4577:3: this_uint32Array_22= ruleuint32Array
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
                    // InternalRos.g:4586:3: this_int64Array_23= ruleint64Array
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
                    // InternalRos.g:4595:3: this_uint64Array_24= ruleuint64Array
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
                    // InternalRos.g:4604:3: this_float32Array_25= rulefloat32Array
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
                    // InternalRos.g:4613:3: this_float64Array_26= rulefloat64Array
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
                    // InternalRos.g:4622:3: this_string0Array_27= rulestring0Array
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
                    // InternalRos.g:4631:3: this_byteArray_28= rulebyteArray
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
                    // InternalRos.g:4640:3: this_TopicSpecRef_29= ruleTopicSpecRef
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
                    // InternalRos.g:4649:3: this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef
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
    // InternalRos.g:4661:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalRos.g:4661:45: (iv_rulebool= rulebool EOF )
            // InternalRos.g:4662:2: iv_rulebool= rulebool EOF
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
    // InternalRos.g:4668:1: rulebool returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4674:2: ( ( () otherlv_1= 'bool' ) )
            // InternalRos.g:4675:2: ( () otherlv_1= 'bool' )
            {
            // InternalRos.g:4675:2: ( () otherlv_1= 'bool' )
            // InternalRos.g:4676:3: () otherlv_1= 'bool'
            {
            // InternalRos.g:4676:3: ()
            // InternalRos.g:4677:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_2); 

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
    // InternalRos.g:4691:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalRos.g:4691:45: (iv_ruleint8= ruleint8 EOF )
            // InternalRos.g:4692:2: iv_ruleint8= ruleint8 EOF
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
    // InternalRos.g:4698:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= 'int8' ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4704:2: ( ( () otherlv_1= 'int8' ) )
            // InternalRos.g:4705:2: ( () otherlv_1= 'int8' )
            {
            // InternalRos.g:4705:2: ( () otherlv_1= 'int8' )
            // InternalRos.g:4706:3: () otherlv_1= 'int8'
            {
            // InternalRos.g:4706:3: ()
            // InternalRos.g:4707:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt8Access().getInt8Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_2); 

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
    // InternalRos.g:4721:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalRos.g:4721:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalRos.g:4722:2: iv_ruleuint8= ruleuint8 EOF
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
    // InternalRos.g:4728:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= 'uint8' ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4734:2: ( ( () otherlv_1= 'uint8' ) )
            // InternalRos.g:4735:2: ( () otherlv_1= 'uint8' )
            {
            // InternalRos.g:4735:2: ( () otherlv_1= 'uint8' )
            // InternalRos.g:4736:3: () otherlv_1= 'uint8'
            {
            // InternalRos.g:4736:3: ()
            // InternalRos.g:4737:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint8Access().getUint8Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_2); 

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
    // InternalRos.g:4751:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalRos.g:4751:46: (iv_ruleint16= ruleint16 EOF )
            // InternalRos.g:4752:2: iv_ruleint16= ruleint16 EOF
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
    // InternalRos.g:4758:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= 'int16' ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4764:2: ( ( () otherlv_1= 'int16' ) )
            // InternalRos.g:4765:2: ( () otherlv_1= 'int16' )
            {
            // InternalRos.g:4765:2: ( () otherlv_1= 'int16' )
            // InternalRos.g:4766:3: () otherlv_1= 'int16'
            {
            // InternalRos.g:4766:3: ()
            // InternalRos.g:4767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt16Access().getInt16Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,87,FOLLOW_2); 

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
    // InternalRos.g:4781:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalRos.g:4781:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalRos.g:4782:2: iv_ruleuint16= ruleuint16 EOF
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
    // InternalRos.g:4788:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= 'uint16' ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4794:2: ( ( () otherlv_1= 'uint16' ) )
            // InternalRos.g:4795:2: ( () otherlv_1= 'uint16' )
            {
            // InternalRos.g:4795:2: ( () otherlv_1= 'uint16' )
            // InternalRos.g:4796:3: () otherlv_1= 'uint16'
            {
            // InternalRos.g:4796:3: ()
            // InternalRos.g:4797:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint16Access().getUint16Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,88,FOLLOW_2); 

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
    // InternalRos.g:4811:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalRos.g:4811:46: (iv_ruleint32= ruleint32 EOF )
            // InternalRos.g:4812:2: iv_ruleint32= ruleint32 EOF
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
    // InternalRos.g:4818:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= 'int32' ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4824:2: ( ( () otherlv_1= 'int32' ) )
            // InternalRos.g:4825:2: ( () otherlv_1= 'int32' )
            {
            // InternalRos.g:4825:2: ( () otherlv_1= 'int32' )
            // InternalRos.g:4826:3: () otherlv_1= 'int32'
            {
            // InternalRos.g:4826:3: ()
            // InternalRos.g:4827:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt32Access().getInt32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_2); 

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
    // InternalRos.g:4841:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalRos.g:4841:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalRos.g:4842:2: iv_ruleuint32= ruleuint32 EOF
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
    // InternalRos.g:4848:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= 'uint32' ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4854:2: ( ( () otherlv_1= 'uint32' ) )
            // InternalRos.g:4855:2: ( () otherlv_1= 'uint32' )
            {
            // InternalRos.g:4855:2: ( () otherlv_1= 'uint32' )
            // InternalRos.g:4856:3: () otherlv_1= 'uint32'
            {
            // InternalRos.g:4856:3: ()
            // InternalRos.g:4857:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint32Access().getUint32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_2); 

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
    // InternalRos.g:4871:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalRos.g:4871:46: (iv_ruleint64= ruleint64 EOF )
            // InternalRos.g:4872:2: iv_ruleint64= ruleint64 EOF
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
    // InternalRos.g:4878:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= 'int64' ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4884:2: ( ( () otherlv_1= 'int64' ) )
            // InternalRos.g:4885:2: ( () otherlv_1= 'int64' )
            {
            // InternalRos.g:4885:2: ( () otherlv_1= 'int64' )
            // InternalRos.g:4886:3: () otherlv_1= 'int64'
            {
            // InternalRos.g:4886:3: ()
            // InternalRos.g:4887:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt64Access().getInt64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,91,FOLLOW_2); 

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
    // InternalRos.g:4901:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalRos.g:4901:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalRos.g:4902:2: iv_ruleuint64= ruleuint64 EOF
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
    // InternalRos.g:4908:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= 'uint64' ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4914:2: ( ( () otherlv_1= 'uint64' ) )
            // InternalRos.g:4915:2: ( () otherlv_1= 'uint64' )
            {
            // InternalRos.g:4915:2: ( () otherlv_1= 'uint64' )
            // InternalRos.g:4916:3: () otherlv_1= 'uint64'
            {
            // InternalRos.g:4916:3: ()
            // InternalRos.g:4917:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint64Access().getUint64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,92,FOLLOW_2); 

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
    // InternalRos.g:4931:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalRos.g:4931:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalRos.g:4932:2: iv_rulefloat32= rulefloat32 EOF
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
    // InternalRos.g:4938:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= 'float32' ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4944:2: ( ( () otherlv_1= 'float32' ) )
            // InternalRos.g:4945:2: ( () otherlv_1= 'float32' )
            {
            // InternalRos.g:4945:2: ( () otherlv_1= 'float32' )
            // InternalRos.g:4946:3: () otherlv_1= 'float32'
            {
            // InternalRos.g:4946:3: ()
            // InternalRos.g:4947:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat32Access().getFloat32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_2); 

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
    // InternalRos.g:4961:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalRos.g:4961:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalRos.g:4962:2: iv_rulefloat64= rulefloat64 EOF
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
    // InternalRos.g:4968:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= 'float64' ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4974:2: ( ( () otherlv_1= 'float64' ) )
            // InternalRos.g:4975:2: ( () otherlv_1= 'float64' )
            {
            // InternalRos.g:4975:2: ( () otherlv_1= 'float64' )
            // InternalRos.g:4976:3: () otherlv_1= 'float64'
            {
            // InternalRos.g:4976:3: ()
            // InternalRos.g:4977:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat64Access().getFloat64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,94,FOLLOW_2); 

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
    // InternalRos.g:4991:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalRos.g:4991:48: (iv_rulestring0= rulestring0 EOF )
            // InternalRos.g:4992:2: iv_rulestring0= rulestring0 EOF
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
    // InternalRos.g:4998:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5004:2: ( ( () otherlv_1= 'string' ) )
            // InternalRos.g:5005:2: ( () otherlv_1= 'string' )
            {
            // InternalRos.g:5005:2: ( () otherlv_1= 'string' )
            // InternalRos.g:5006:3: () otherlv_1= 'string'
            {
            // InternalRos.g:5006:3: ()
            // InternalRos.g:5007:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,95,FOLLOW_2); 

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
    // InternalRos.g:5021:1: entryRulebyte returns [EObject current=null] : iv_rulebyte= rulebyte EOF ;
    public final EObject entryRulebyte() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyte = null;


        try {
            // InternalRos.g:5021:45: (iv_rulebyte= rulebyte EOF )
            // InternalRos.g:5022:2: iv_rulebyte= rulebyte EOF
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
    // InternalRos.g:5028:1: rulebyte returns [EObject current=null] : ( () otherlv_1= 'byte' ) ;
    public final EObject rulebyte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5034:2: ( ( () otherlv_1= 'byte' ) )
            // InternalRos.g:5035:2: ( () otherlv_1= 'byte' )
            {
            // InternalRos.g:5035:2: ( () otherlv_1= 'byte' )
            // InternalRos.g:5036:3: () otherlv_1= 'byte'
            {
            // InternalRos.g:5036:3: ()
            // InternalRos.g:5037:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getByteAccess().getByteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,96,FOLLOW_2); 

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
    // InternalRos.g:5051:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalRos.g:5051:45: (iv_ruletime= ruletime EOF )
            // InternalRos.g:5052:2: iv_ruletime= ruletime EOF
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
    // InternalRos.g:5058:1: ruletime returns [EObject current=null] : ( () otherlv_1= 'time' ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5064:2: ( ( () otherlv_1= 'time' ) )
            // InternalRos.g:5065:2: ( () otherlv_1= 'time' )
            {
            // InternalRos.g:5065:2: ( () otherlv_1= 'time' )
            // InternalRos.g:5066:3: () otherlv_1= 'time'
            {
            // InternalRos.g:5066:3: ()
            // InternalRos.g:5067:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeAccess().getTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,97,FOLLOW_2); 

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
    // InternalRos.g:5081:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalRos.g:5081:49: (iv_ruleduration= ruleduration EOF )
            // InternalRos.g:5082:2: iv_ruleduration= ruleduration EOF
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
    // InternalRos.g:5088:1: ruleduration returns [EObject current=null] : ( () otherlv_1= 'duration' ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5094:2: ( ( () otherlv_1= 'duration' ) )
            // InternalRos.g:5095:2: ( () otherlv_1= 'duration' )
            {
            // InternalRos.g:5095:2: ( () otherlv_1= 'duration' )
            // InternalRos.g:5096:3: () otherlv_1= 'duration'
            {
            // InternalRos.g:5096:3: ()
            // InternalRos.g:5097:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_2); 

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
    // InternalRos.g:5111:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalRos.g:5111:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalRos.g:5112:2: iv_ruleboolArray= ruleboolArray EOF
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
    // InternalRos.g:5118:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= 'bool[]' ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5124:2: ( ( () otherlv_1= 'bool[]' ) )
            // InternalRos.g:5125:2: ( () otherlv_1= 'bool[]' )
            {
            // InternalRos.g:5125:2: ( () otherlv_1= 'bool[]' )
            // InternalRos.g:5126:3: () otherlv_1= 'bool[]'
            {
            // InternalRos.g:5126:3: ()
            // InternalRos.g:5127:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolArrayAccess().getBoolArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_2); 

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
    // InternalRos.g:5141:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalRos.g:5141:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalRos.g:5142:2: iv_ruleint8Array= ruleint8Array EOF
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
    // InternalRos.g:5148:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= 'int8[]' ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5154:2: ( ( () otherlv_1= 'int8[]' ) )
            // InternalRos.g:5155:2: ( () otherlv_1= 'int8[]' )
            {
            // InternalRos.g:5155:2: ( () otherlv_1= 'int8[]' )
            // InternalRos.g:5156:3: () otherlv_1= 'int8[]'
            {
            // InternalRos.g:5156:3: ()
            // InternalRos.g:5157:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_2); 

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
    // InternalRos.g:5171:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalRos.g:5171:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalRos.g:5172:2: iv_ruleuint8Array= ruleuint8Array EOF
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
    // InternalRos.g:5178:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= 'uint8[]' ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5184:2: ( ( () otherlv_1= 'uint8[]' ) )
            // InternalRos.g:5185:2: ( () otherlv_1= 'uint8[]' )
            {
            // InternalRos.g:5185:2: ( () otherlv_1= 'uint8[]' )
            // InternalRos.g:5186:3: () otherlv_1= 'uint8[]'
            {
            // InternalRos.g:5186:3: ()
            // InternalRos.g:5187:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,101,FOLLOW_2); 

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
    // InternalRos.g:5201:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalRos.g:5201:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalRos.g:5202:2: iv_ruleint16Array= ruleint16Array EOF
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
    // InternalRos.g:5208:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= 'int16[]' ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5214:2: ( ( () otherlv_1= 'int16[]' ) )
            // InternalRos.g:5215:2: ( () otherlv_1= 'int16[]' )
            {
            // InternalRos.g:5215:2: ( () otherlv_1= 'int16[]' )
            // InternalRos.g:5216:3: () otherlv_1= 'int16[]'
            {
            // InternalRos.g:5216:3: ()
            // InternalRos.g:5217:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_2); 

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
    // InternalRos.g:5231:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalRos.g:5231:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalRos.g:5232:2: iv_ruleuint16Array= ruleuint16Array EOF
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
    // InternalRos.g:5238:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= 'uint16[]' ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5244:2: ( ( () otherlv_1= 'uint16[]' ) )
            // InternalRos.g:5245:2: ( () otherlv_1= 'uint16[]' )
            {
            // InternalRos.g:5245:2: ( () otherlv_1= 'uint16[]' )
            // InternalRos.g:5246:3: () otherlv_1= 'uint16[]'
            {
            // InternalRos.g:5246:3: ()
            // InternalRos.g:5247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_2); 

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
    // InternalRos.g:5261:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalRos.g:5261:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalRos.g:5262:2: iv_ruleint32Array= ruleint32Array EOF
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
    // InternalRos.g:5268:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= 'int32[]' ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5274:2: ( ( () otherlv_1= 'int32[]' ) )
            // InternalRos.g:5275:2: ( () otherlv_1= 'int32[]' )
            {
            // InternalRos.g:5275:2: ( () otherlv_1= 'int32[]' )
            // InternalRos.g:5276:3: () otherlv_1= 'int32[]'
            {
            // InternalRos.g:5276:3: ()
            // InternalRos.g:5277:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,104,FOLLOW_2); 

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
    // InternalRos.g:5291:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalRos.g:5291:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalRos.g:5292:2: iv_ruleuint32Array= ruleuint32Array EOF
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
    // InternalRos.g:5298:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= 'uint32[]' ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5304:2: ( ( () otherlv_1= 'uint32[]' ) )
            // InternalRos.g:5305:2: ( () otherlv_1= 'uint32[]' )
            {
            // InternalRos.g:5305:2: ( () otherlv_1= 'uint32[]' )
            // InternalRos.g:5306:3: () otherlv_1= 'uint32[]'
            {
            // InternalRos.g:5306:3: ()
            // InternalRos.g:5307:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_2); 

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
    // InternalRos.g:5321:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalRos.g:5321:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalRos.g:5322:2: iv_ruleint64Array= ruleint64Array EOF
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
    // InternalRos.g:5328:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= 'int64[]' ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5334:2: ( ( () otherlv_1= 'int64[]' ) )
            // InternalRos.g:5335:2: ( () otherlv_1= 'int64[]' )
            {
            // InternalRos.g:5335:2: ( () otherlv_1= 'int64[]' )
            // InternalRos.g:5336:3: () otherlv_1= 'int64[]'
            {
            // InternalRos.g:5336:3: ()
            // InternalRos.g:5337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,106,FOLLOW_2); 

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
    // InternalRos.g:5351:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalRos.g:5351:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalRos.g:5352:2: iv_ruleuint64Array= ruleuint64Array EOF
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
    // InternalRos.g:5358:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= 'uint64[]' ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5364:2: ( ( () otherlv_1= 'uint64[]' ) )
            // InternalRos.g:5365:2: ( () otherlv_1= 'uint64[]' )
            {
            // InternalRos.g:5365:2: ( () otherlv_1= 'uint64[]' )
            // InternalRos.g:5366:3: () otherlv_1= 'uint64[]'
            {
            // InternalRos.g:5366:3: ()
            // InternalRos.g:5367:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,107,FOLLOW_2); 

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
    // InternalRos.g:5381:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalRos.g:5381:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalRos.g:5382:2: iv_rulefloat32Array= rulefloat32Array EOF
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
    // InternalRos.g:5388:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= 'float32[]' ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5394:2: ( ( () otherlv_1= 'float32[]' ) )
            // InternalRos.g:5395:2: ( () otherlv_1= 'float32[]' )
            {
            // InternalRos.g:5395:2: ( () otherlv_1= 'float32[]' )
            // InternalRos.g:5396:3: () otherlv_1= 'float32[]'
            {
            // InternalRos.g:5396:3: ()
            // InternalRos.g:5397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,108,FOLLOW_2); 

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
    // InternalRos.g:5411:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalRos.g:5411:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalRos.g:5412:2: iv_rulefloat64Array= rulefloat64Array EOF
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
    // InternalRos.g:5418:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= 'float64[]' ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5424:2: ( ( () otherlv_1= 'float64[]' ) )
            // InternalRos.g:5425:2: ( () otherlv_1= 'float64[]' )
            {
            // InternalRos.g:5425:2: ( () otherlv_1= 'float64[]' )
            // InternalRos.g:5426:3: () otherlv_1= 'float64[]'
            {
            // InternalRos.g:5426:3: ()
            // InternalRos.g:5427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,109,FOLLOW_2); 

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
    // InternalRos.g:5441:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalRos.g:5441:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalRos.g:5442:2: iv_rulestring0Array= rulestring0Array EOF
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
    // InternalRos.g:5448:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= 'string[]' ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5454:2: ( ( () otherlv_1= 'string[]' ) )
            // InternalRos.g:5455:2: ( () otherlv_1= 'string[]' )
            {
            // InternalRos.g:5455:2: ( () otherlv_1= 'string[]' )
            // InternalRos.g:5456:3: () otherlv_1= 'string[]'
            {
            // InternalRos.g:5456:3: ()
            // InternalRos.g:5457:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0ArrayAccess().getStringArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,110,FOLLOW_2); 

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
    // InternalRos.g:5471:1: entryRulebyteArray returns [EObject current=null] : iv_rulebyteArray= rulebyteArray EOF ;
    public final EObject entryRulebyteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyteArray = null;


        try {
            // InternalRos.g:5471:50: (iv_rulebyteArray= rulebyteArray EOF )
            // InternalRos.g:5472:2: iv_rulebyteArray= rulebyteArray EOF
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
    // InternalRos.g:5478:1: rulebyteArray returns [EObject current=null] : ( () otherlv_1= 'byte[]' ) ;
    public final EObject rulebyteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5484:2: ( ( () otherlv_1= 'byte[]' ) )
            // InternalRos.g:5485:2: ( () otherlv_1= 'byte[]' )
            {
            // InternalRos.g:5485:2: ( () otherlv_1= 'byte[]' )
            // InternalRos.g:5486:3: () otherlv_1= 'byte[]'
            {
            // InternalRos.g:5486:3: ()
            // InternalRos.g:5487:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getByteArrayAccess().getByteArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,111,FOLLOW_2); 

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
    // InternalRos.g:5501:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRos.g:5501:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRos.g:5502:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalRos.g:5508:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= 'Header' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5514:2: ( ( () otherlv_1= 'Header' ) )
            // InternalRos.g:5515:2: ( () otherlv_1= 'Header' )
            {
            // InternalRos.g:5515:2: ( () otherlv_1= 'Header' )
            // InternalRos.g:5516:3: () otherlv_1= 'Header'
            {
            // InternalRos.g:5516:3: ()
            // InternalRos.g:5517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeaderAccess().getHeaderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

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
    // InternalRos.g:5531:1: entryRuleTopicSpecRef returns [EObject current=null] : iv_ruleTopicSpecRef= ruleTopicSpecRef EOF ;
    public final EObject entryRuleTopicSpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpecRef = null;


        try {
            // InternalRos.g:5531:53: (iv_ruleTopicSpecRef= ruleTopicSpecRef EOF )
            // InternalRos.g:5532:2: iv_ruleTopicSpecRef= ruleTopicSpecRef EOF
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
    // InternalRos.g:5538:1: ruleTopicSpecRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleTopicSpecRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRos.g:5544:2: ( ( ( ruleEString ) ) )
            // InternalRos.g:5545:2: ( ( ruleEString ) )
            {
            // InternalRos.g:5545:2: ( ( ruleEString ) )
            // InternalRos.g:5546:3: ( ruleEString )
            {
            // InternalRos.g:5546:3: ( ruleEString )
            // InternalRos.g:5547:4: ruleEString
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
    // InternalRos.g:5564:1: entryRuleArrayTopicSpecRef returns [EObject current=null] : iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF ;
    public final EObject entryRuleArrayTopicSpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTopicSpecRef = null;


        try {
            // InternalRos.g:5564:58: (iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF )
            // InternalRos.g:5565:2: iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF
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
    // InternalRos.g:5571:1: ruleArrayTopicSpecRef returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '[]' ) ;
    public final EObject ruleArrayTopicSpecRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5577:2: ( ( ( ( ruleEString ) ) otherlv_1= '[]' ) )
            // InternalRos.g:5578:2: ( ( ( ruleEString ) ) otherlv_1= '[]' )
            {
            // InternalRos.g:5578:2: ( ( ( ruleEString ) ) otherlv_1= '[]' )
            // InternalRos.g:5579:3: ( ( ruleEString ) ) otherlv_1= '[]'
            {
            // InternalRos.g:5579:3: ( ( ruleEString ) )
            // InternalRos.g:5580:4: ( ruleEString )
            {
            // InternalRos.g:5580:4: ( ruleEString )
            // InternalRos.g:5581:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayTopicSpecRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0_0());
            				
            pushFollow(FOLLOW_57);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,112,FOLLOW_2); 

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
    // InternalRos.g:5603:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalRos.g:5603:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalRos.g:5604:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalRos.g:5610:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'goal' | kw= 'message' | kw= 'result' | kw= 'feedback' | kw= 'name' | kw= 'value' | kw= 'service' | kw= 'type' | kw= 'action' | kw= 'duration' | kw= 'time' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:5616:2: ( (kw= 'goal' | kw= 'message' | kw= 'result' | kw= 'feedback' | kw= 'name' | kw= 'value' | kw= 'service' | kw= 'type' | kw= 'action' | kw= 'duration' | kw= 'time' ) )
            // InternalRos.g:5617:2: (kw= 'goal' | kw= 'message' | kw= 'result' | kw= 'feedback' | kw= 'name' | kw= 'value' | kw= 'service' | kw= 'type' | kw= 'action' | kw= 'duration' | kw= 'time' )
            {
            // InternalRos.g:5617:2: (kw= 'goal' | kw= 'message' | kw= 'result' | kw= 'feedback' | kw= 'name' | kw= 'value' | kw= 'service' | kw= 'type' | kw= 'action' | kw= 'duration' | kw= 'time' )
            int alt66=11;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt66=1;
                }
                break;
            case 41:
                {
                alt66=2;
                }
                break;
            case 44:
                {
                alt66=3;
                }
                break;
            case 45:
                {
                alt66=4;
                }
                break;
            case 47:
                {
                alt66=5;
                }
                break;
            case 82:
                {
                alt66=6;
                }
                break;
            case 56:
                {
                alt66=7;
                }
                break;
            case 72:
                {
                alt66=8;
                }
                break;
            case 62:
                {
                alt66=9;
                }
                break;
            case 98:
                {
                alt66=10;
                }
                break;
            case 97:
                {
                alt66=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // InternalRos.g:5618:3: kw= 'goal'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:5624:3: kw= 'message'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRos.g:5630:3: kw= 'result'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRos.g:5636:3: kw= 'feedback'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRos.g:5642:3: kw= 'name'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRos.g:5648:3: kw= 'value'
                    {
                    kw=(Token)match(input,82,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRos.g:5654:3: kw= 'service'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRos.g:5660:3: kw= 'type'
                    {
                    kw=(Token)match(input,72,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRos.g:5666:3: kw= 'action'
                    {
                    kw=(Token)match(input,62,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRos.g:5672:3: kw= 'duration'
                    {
                    kw=(Token)match(input,98,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRos.g:5678:3: kw= 'time'
                    {
                    kw=(Token)match(input,97,FOLLOW_2); 

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


    protected DFA65 dfa65 = new DFA65(this);
    static final String dfa_1s = "\42\uffff";
    static final String dfa_2s = "\36\uffff\2\41\2\uffff";
    static final String dfa_3s = "\1\4\35\uffff\2\4\2\uffff";
    static final String dfa_4s = "\1\157\35\uffff\2\160\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\37\1\36";
    static final String dfa_6s = "\42\uffff}>";
    static final String[] dfa_7s = {
            "\1\36\1\37\41\uffff\1\20\54\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35",
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
            "\2\41\6\uffff\1\41\34\uffff\1\41\1\uffff\3\41\1\uffff\1\41\10\uffff\1\41\5\uffff\1\41\11\uffff\1\41\11\uffff\1\41\16\uffff\2\41\15\uffff\1\40",
            "\2\41\6\uffff\1\41\34\uffff\1\41\1\uffff\3\41\1\uffff\1\41\10\uffff\1\41\5\uffff\1\41\11\uffff\1\41\11\uffff\1\41\16\uffff\2\41\15\uffff\1\40",
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

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4378:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000230000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000150000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000044800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000060L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000550000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000510000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000418000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000018000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000380010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000300010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008010000030L,0x0000FFFFFFF00000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x007F000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000010000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000068L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000010000000000L,0x000000000001EE00L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000010000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00000000040007B0L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000010000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x4100BA0000001030L,0x0000000600040100L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});

}
