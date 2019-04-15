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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PackageSet'", "'{'", "'package'", "','", "'}'", "'Package'", "'spec'", "'artifact'", "'Artifact'", "'node'", "'CatkinPackage'", "'dependency'", "'ServiceSpec'", "'request'", "'response'", "'TopicSpec'", "'message'", "'ActionSpec'", "'goal'", "'result'", "'feedback'", "'Node'", "'name'", "'serviceserver'", "'publisher'", "'subscriber'", "'serviceclient'", "'actionserver'", "'actionclient'", "'parameter'", "'ServiceServer'", "'service'", "'namespace'", "'Publisher'", "'Subscriber'", "'ServiceClient'", "'ActionServer'", "'action'", "'ActionClient'", "'GraphName'", "'Parameter'", "'type'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'ParameterListType'", "'sequence'", "'default'", "'ParameterStructType'", "'parameterstructypetmember'", "'ParameterIntegerType'", "'ParameterStringType'", "'ParameterDoubleType'", "'ParameterDateType'", "'ParameterBooleanType'", "'ParameterBase64Type'", "'ParameterAnyType'", "'ParameterArrayType'", "'ParameterSequence'", "'value'", "'ParameterAny'", "'ParameterString'", "'ParameterBase64'", "'ParameterInteger'", "'ParameterDouble'", "'ParameterBoolean'", "'ParameterStruct'", "'ParameterDate'", "'Base64Binary'", "'Int'", "'Double'", "'Boolean'", "'ParameterStructMember'", "'DateTime'", "'ParameterStructTypeMember'", "'PackageDependency'", "'ExternalDependency'", "'bool'", "'int8'", "'uint8'", "'int16'", "'uint16'", "'int32'", "'uint32'", "'int64'", "'uint64'", "'float32'", "'float64'", "'string'", "'time'", "'duration'", "'bool[]'", "'int8[]'", "'uint8[]'", "'int16[]'", "'uint16[]'", "'int32[]'", "'uint32[]'", "'int64[]'", "'uint64[]'", "'float32[]'", "'float64[]'", "'string[]'"
    };
    public static final int T__50=50;
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
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
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
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
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
    // InternalRos.g:71:1: rulePackageSet returns [EObject current=null] : ( () otherlv_1= 'PackageSet' otherlv_2= '{' (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject rulePackageSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_package_5_0 = null;

        EObject lv_package_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:77:2: ( ( () otherlv_1= 'PackageSet' otherlv_2= '{' (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:78:2: ( () otherlv_1= 'PackageSet' otherlv_2= '{' (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:78:2: ( () otherlv_1= 'PackageSet' otherlv_2= '{' (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:79:3: () otherlv_1= 'PackageSet' otherlv_2= '{' (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:79:3: ()
            // InternalRos.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackageSetAccess().getPackageSetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageSetAccess().getPackageSetKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageSetAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:94:3: (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRos.g:95:4: otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPackageSetAccess().getPackageKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackageSetAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:103:4: ( (lv_package_5_0= rulePackage ) )
                    // InternalRos.g:104:5: (lv_package_5_0= rulePackage )
                    {
                    // InternalRos.g:104:5: (lv_package_5_0= rulePackage )
                    // InternalRos.g:105:6: lv_package_5_0= rulePackage
                    {

                    						newCompositeNode(grammarAccess.getPackageSetAccess().getPackagePackageParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:122:4: (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRos.g:123:5: otherlv_6= ',' ( (lv_package_7_0= rulePackage ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPackageSetAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:127:5: ( (lv_package_7_0= rulePackage ) )
                    	    // InternalRos.g:128:6: (lv_package_7_0= rulePackage )
                    	    {
                    	    // InternalRos.g:128:6: (lv_package_7_0= rulePackage )
                    	    // InternalRos.g:129:7: lv_package_7_0= rulePackage
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackageSetAccess().getPackagePackageParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_package_7_0=rulePackage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackageSetRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"package",
                    	    								lv_package_7_0,
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

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPackageSetAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getPackageSetAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:160:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalRos.g:160:48: (iv_rulePackage= rulePackage EOF )
            // InternalRos.g:161:2: iv_rulePackage= rulePackage EOF
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
    // InternalRos.g:167:1: rulePackage returns [EObject current=null] : (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        EObject this_Package_Impl_0 = null;

        EObject this_CatkinPackage_1 = null;



        	enterRule();

        try {
            // InternalRos.g:173:2: ( (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage ) )
            // InternalRos.g:174:2: (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage )
            {
            // InternalRos.g:174:2: (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==21) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRos.g:175:3: this_Package_Impl_0= rulePackage_Impl
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
                    // InternalRos.g:184:3: this_CatkinPackage_1= ruleCatkinPackage
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
    // InternalRos.g:196:1: entryRuleSpecBase returns [EObject current=null] : iv_ruleSpecBase= ruleSpecBase EOF ;
    public final EObject entryRuleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBase = null;


        try {
            // InternalRos.g:196:49: (iv_ruleSpecBase= ruleSpecBase EOF )
            // InternalRos.g:197:2: iv_ruleSpecBase= ruleSpecBase EOF
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
    // InternalRos.g:203:1: ruleSpecBase returns [EObject current=null] : (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec ) ;
    public final EObject ruleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject this_ServiceSpec_0 = null;

        EObject this_TopicSpec_1 = null;

        EObject this_ActionSpec_2 = null;



        	enterRule();

        try {
            // InternalRos.g:209:2: ( (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec ) )
            // InternalRos.g:210:2: (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec )
            {
            // InternalRos.g:210:2: (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 28:
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
                    // InternalRos.g:211:3: this_ServiceSpec_0= ruleServiceSpec
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
                    // InternalRos.g:220:3: this_TopicSpec_1= ruleTopicSpec
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
                    // InternalRos.g:229:3: this_ActionSpec_2= ruleActionSpec
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
    // InternalRos.g:241:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalRos.g:241:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalRos.g:242:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalRos.g:248:1: ruleDependency returns [EObject current=null] : (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDependency_0 = null;

        EObject this_ExternalDependency_1 = null;



        	enterRule();

        try {
            // InternalRos.g:254:2: ( (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) )
            // InternalRos.g:255:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            {
            // InternalRos.g:255:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==87) ) {
                alt5=1;
            }
            else if ( (LA5_0==88) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRos.g:256:3: this_PackageDependency_0= rulePackageDependency
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
                    // InternalRos.g:265:3: this_ExternalDependency_1= ruleExternalDependency
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
    // InternalRos.g:277:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRos.g:277:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRos.g:278:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalRos.g:284:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRos.g:290:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRos.g:291:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRos.g:291:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt6=1;
                }
                break;
            case 55:
                {
                alt6=2;
                }
                break;
            case 56:
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
                    // InternalRos.g:292:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalRos.g:301:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalRos.g:310:3: this_PrivateNamespace_2= rulePrivateNamespace
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


    // $ANTLR start "entryRuleParameterType"
    // InternalRos.g:322:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRos.g:322:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRos.g:323:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalRos.g:329:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterDateType_5= ruleParameterDateType | this_ParameterBooleanType_6= ruleParameterBooleanType | this_ParameterBase64Type_7= ruleParameterBase64Type | this_ParameterAnyType_8= ruleParameterAnyType | this_ParameterArrayType_9= ruleParameterArrayType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterListType_0 = null;

        EObject this_ParameterStructType_1 = null;

        EObject this_ParameterIntegerType_2 = null;

        EObject this_ParameterStringType_3 = null;

        EObject this_ParameterDoubleType_4 = null;

        EObject this_ParameterDateType_5 = null;

        EObject this_ParameterBooleanType_6 = null;

        EObject this_ParameterBase64Type_7 = null;

        EObject this_ParameterAnyType_8 = null;

        EObject this_ParameterArrayType_9 = null;



        	enterRule();

        try {
            // InternalRos.g:335:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterDateType_5= ruleParameterDateType | this_ParameterBooleanType_6= ruleParameterBooleanType | this_ParameterBase64Type_7= ruleParameterBase64Type | this_ParameterAnyType_8= ruleParameterAnyType | this_ParameterArrayType_9= ruleParameterArrayType ) )
            // InternalRos.g:336:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterDateType_5= ruleParameterDateType | this_ParameterBooleanType_6= ruleParameterBooleanType | this_ParameterBase64Type_7= ruleParameterBase64Type | this_ParameterAnyType_8= ruleParameterAnyType | this_ParameterArrayType_9= ruleParameterArrayType )
            {
            // InternalRos.g:336:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterDateType_5= ruleParameterDateType | this_ParameterBooleanType_6= ruleParameterBooleanType | this_ParameterBase64Type_7= ruleParameterBase64Type | this_ParameterAnyType_8= ruleParameterAnyType | this_ParameterArrayType_9= ruleParameterArrayType )
            int alt7=10;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt7=1;
                }
                break;
            case 60:
                {
                alt7=2;
                }
                break;
            case 62:
                {
                alt7=3;
                }
                break;
            case 63:
                {
                alt7=4;
                }
                break;
            case 64:
                {
                alt7=5;
                }
                break;
            case 65:
                {
                alt7=6;
                }
                break;
            case 66:
                {
                alt7=7;
                }
                break;
            case 67:
                {
                alt7=8;
                }
                break;
            case 68:
                {
                alt7=9;
                }
                break;
            case 69:
                {
                alt7=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRos.g:337:3: this_ParameterListType_0= ruleParameterListType
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
                    // InternalRos.g:346:3: this_ParameterStructType_1= ruleParameterStructType
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
                    // InternalRos.g:355:3: this_ParameterIntegerType_2= ruleParameterIntegerType
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
                    // InternalRos.g:364:3: this_ParameterStringType_3= ruleParameterStringType
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
                    // InternalRos.g:373:3: this_ParameterDoubleType_4= ruleParameterDoubleType
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
                    // InternalRos.g:382:3: this_ParameterDateType_5= ruleParameterDateType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDateTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDateType_5=ruleParameterDateType();

                    state._fsp--;


                    			current = this_ParameterDateType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRos.g:391:3: this_ParameterBooleanType_6= ruleParameterBooleanType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBooleanType_6=ruleParameterBooleanType();

                    state._fsp--;


                    			current = this_ParameterBooleanType_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRos.g:400:3: this_ParameterBase64Type_7= ruleParameterBase64Type
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64Type_7=ruleParameterBase64Type();

                    state._fsp--;


                    			current = this_ParameterBase64Type_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRos.g:409:3: this_ParameterAnyType_8= ruleParameterAnyType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterAnyTypeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterAnyType_8=ruleParameterAnyType();

                    state._fsp--;


                    			current = this_ParameterAnyType_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRos.g:418:3: this_ParameterArrayType_9= ruleParameterArrayType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterArrayType_9=ruleParameterArrayType();

                    state._fsp--;


                    			current = this_ParameterArrayType_9;
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
    // InternalRos.g:430:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRos.g:430:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRos.g:431:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalRos.g:437:1: ruleParameterValue returns [EObject current=null] : (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterAny_0 = null;

        EObject this_ParameterString_1 = null;

        EObject this_ParameterBase64_2 = null;

        EObject this_ParameterInteger_3 = null;

        EObject this_ParameterDouble_4 = null;

        EObject this_ParameterBoolean_5 = null;

        EObject this_ParameterSequence_6 = null;

        EObject this_ParameterStruct_7 = null;

        EObject this_ParameterDate_8 = null;



        	enterRule();

        try {
            // InternalRos.g:443:2: ( (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate ) )
            // InternalRos.g:444:2: (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate )
            {
            // InternalRos.g:444:2: (this_ParameterAny_0= ruleParameterAny | this_ParameterString_1= ruleParameterString | this_ParameterBase64_2= ruleParameterBase64 | this_ParameterInteger_3= ruleParameterInteger | this_ParameterDouble_4= ruleParameterDouble | this_ParameterBoolean_5= ruleParameterBoolean | this_ParameterSequence_6= ruleParameterSequence | this_ParameterStruct_7= ruleParameterStruct | this_ParameterDate_8= ruleParameterDate )
            int alt8=9;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt8=1;
                }
                break;
            case 73:
                {
                alt8=2;
                }
                break;
            case 74:
                {
                alt8=3;
                }
                break;
            case 75:
                {
                alt8=4;
                }
                break;
            case 76:
                {
                alt8=5;
                }
                break;
            case 77:
                {
                alt8=6;
                }
                break;
            case 70:
                {
                alt8=7;
                }
                break;
            case 78:
                {
                alt8=8;
                }
                break;
            case 79:
                {
                alt8=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRos.g:445:3: this_ParameterAny_0= ruleParameterAny
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterAnyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterAny_0=ruleParameterAny();

                    state._fsp--;


                    			current = this_ParameterAny_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:454:3: this_ParameterString_1= ruleParameterString
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterString_1=ruleParameterString();

                    state._fsp--;


                    			current = this_ParameterString_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRos.g:463:3: this_ParameterBase64_2= ruleParameterBase64
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64_2=ruleParameterBase64();

                    state._fsp--;


                    			current = this_ParameterBase64_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRos.g:472:3: this_ParameterInteger_3= ruleParameterInteger
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterInteger_3=ruleParameterInteger();

                    state._fsp--;


                    			current = this_ParameterInteger_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRos.g:481:3: this_ParameterDouble_4= ruleParameterDouble
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDouble_4=ruleParameterDouble();

                    state._fsp--;


                    			current = this_ParameterDouble_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRos.g:490:3: this_ParameterBoolean_5= ruleParameterBoolean
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBoolean_5=ruleParameterBoolean();

                    state._fsp--;


                    			current = this_ParameterBoolean_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRos.g:499:3: this_ParameterSequence_6= ruleParameterSequence
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterSequenceParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterSequence_6=ruleParameterSequence();

                    state._fsp--;


                    			current = this_ParameterSequence_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRos.g:508:3: this_ParameterStruct_7= ruleParameterStruct
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStruct_7=ruleParameterStruct();

                    state._fsp--;


                    			current = this_ParameterStruct_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRos.g:517:3: this_ParameterDate_8= ruleParameterDate
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDateParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDate_8=ruleParameterDate();

                    state._fsp--;


                    			current = this_ParameterDate_8;
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


    // $ANTLR start "entryRulePackage_Impl"
    // InternalRos.g:529:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // InternalRos.g:529:53: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // InternalRos.g:530:2: iv_rulePackage_Impl= rulePackage_Impl EOF
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
    // InternalRos.g:536:1: rulePackage_Impl returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject rulePackage_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_spec_6_0 = null;

        EObject lv_spec_8_0 = null;

        EObject lv_artifact_12_0 = null;

        EObject lv_artifact_14_0 = null;



        	enterRule();

        try {
            // InternalRos.g:542:2: ( ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalRos.g:543:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalRos.g:543:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalRos.g:544:3: () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalRos.g:544:3: ()
            // InternalRos.g:545:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackage_ImplAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPackage_ImplAccess().getPackageKeyword_1());
            		
            // InternalRos.g:555:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:556:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:556:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:557:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:578:3: (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRos.g:579:4: otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getPackage_ImplAccess().getSpecKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRos.g:587:4: ( (lv_spec_6_0= ruleSpecBase ) )
                    // InternalRos.g:588:5: (lv_spec_6_0= ruleSpecBase )
                    {
                    // InternalRos.g:588:5: (lv_spec_6_0= ruleSpecBase )
                    // InternalRos.g:589:6: lv_spec_6_0= ruleSpecBase
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:606:4: (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRos.g:607:5: otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getPackage_ImplAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRos.g:611:5: ( (lv_spec_8_0= ruleSpecBase ) )
                    	    // InternalRos.g:612:6: (lv_spec_8_0= ruleSpecBase )
                    	    {
                    	    // InternalRos.g:612:6: (lv_spec_8_0= ruleSpecBase )
                    	    // InternalRos.g:613:7: lv_spec_8_0= ruleSpecBase
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:636:3: (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRos.g:637:4: otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getPackage_ImplAccess().getArtifactKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRos.g:645:4: ( (lv_artifact_12_0= ruleArtifact ) )
                    // InternalRos.g:646:5: (lv_artifact_12_0= ruleArtifact )
                    {
                    // InternalRos.g:646:5: (lv_artifact_12_0= ruleArtifact )
                    // InternalRos.g:647:6: lv_artifact_12_0= ruleArtifact
                    {

                    						newCompositeNode(grammarAccess.getPackage_ImplAccess().getArtifactArtifactParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:664:4: (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRos.g:665:5: otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRos.g:669:5: ( (lv_artifact_14_0= ruleArtifact ) )
                    	    // InternalRos.g:670:6: (lv_artifact_14_0= ruleArtifact )
                    	    {
                    	    // InternalRos.g:670:6: (lv_artifact_14_0= ruleArtifact )
                    	    // InternalRos.g:671:7: lv_artifact_14_0= ruleArtifact
                    	    {

                    	    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getArtifactArtifactParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_artifact_14_0=ruleArtifact();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"artifact",
                    	    								lv_artifact_14_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Artifact");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:702:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRos.g:702:47: (iv_ruleEString= ruleEString EOF )
            // InternalRos.g:703:2: iv_ruleEString= ruleEString EOF
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
    // InternalRos.g:709:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRos.g:715:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRos.g:716:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRos.g:716:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalRos.g:717:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:725:3: this_ID_1= RULE_ID
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
    // InternalRos.g:736:1: entryRuleRosNames returns [String current=null] : iv_ruleRosNames= ruleRosNames EOF ;
    public final String entryRuleRosNames() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRosNames = null;


        try {
            // InternalRos.g:736:48: (iv_ruleRosNames= ruleRosNames EOF )
            // InternalRos.g:737:2: iv_ruleRosNames= ruleRosNames EOF
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
    // InternalRos.g:743:1: ruleRosNames returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleRosNames() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalRos.g:749:2: (this_ID_0= RULE_ID )
            // InternalRos.g:750:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            		current.merge(this_ID_0);
            	

            		newLeafNode(this_ID_0, grammarAccess.getRosNamesAccess().getIDTerminalRuleCall());
            	

            }


            	leaveRule();

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
    // InternalRos.g:760:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalRos.g:760:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalRos.g:761:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalRos.g:767:1: ruleArtifact returns [EObject current=null] : ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_node_5_0 = null;



        	enterRule();

        try {
            // InternalRos.g:773:2: ( ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )? otherlv_6= '}' ) )
            // InternalRos.g:774:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )? otherlv_6= '}' )
            {
            // InternalRos.g:774:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )? otherlv_6= '}' )
            // InternalRos.g:775:3: () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )? otherlv_6= '}'
            {
            // InternalRos.g:775:3: ()
            // InternalRos.g:776:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
            		
            // InternalRos.g:786:3: ( (lv_name_2_0= ruleRosNames ) )
            // InternalRos.g:787:4: (lv_name_2_0= ruleRosNames )
            {
            // InternalRos.g:787:4: (lv_name_2_0= ruleRosNames )
            // InternalRos.g:788:5: lv_name_2_0= ruleRosNames
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

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:809:3: (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRos.g:810:4: otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getNodeKeyword_4_0());
                    			
                    // InternalRos.g:814:4: ( (lv_node_5_0= ruleNode ) )
                    // InternalRos.g:815:5: (lv_node_5_0= ruleNode )
                    {
                    // InternalRos.g:815:5: (lv_node_5_0= ruleNode )
                    // InternalRos.g:816:6: lv_node_5_0= ruleNode
                    {

                    						newCompositeNode(grammarAccess.getArtifactAccess().getNodeNodeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_node_5_0=ruleNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactRule());
                    						}
                    						set(
                    							current,
                    							"node",
                    							lv_node_5_0,
                    							"de.fraunhofer.ipa.ros.Ros.Node");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:842:1: entryRuleCatkinPackage returns [EObject current=null] : iv_ruleCatkinPackage= ruleCatkinPackage EOF ;
    public final EObject entryRuleCatkinPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatkinPackage = null;


        try {
            // InternalRos.g:842:54: (iv_ruleCatkinPackage= ruleCatkinPackage EOF )
            // InternalRos.g:843:2: iv_ruleCatkinPackage= ruleCatkinPackage EOF
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
    // InternalRos.g:849:1: ruleCatkinPackage returns [EObject current=null] : ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? (otherlv_16= 'dependency' otherlv_17= '{' ( (lv_dependency_18_0= ruleDependency ) ) (otherlv_19= ',' ( (lv_dependency_20_0= ruleDependency ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleCatkinPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_spec_6_0 = null;

        EObject lv_spec_8_0 = null;

        EObject lv_artifact_12_0 = null;

        EObject lv_artifact_14_0 = null;

        EObject lv_dependency_18_0 = null;

        EObject lv_dependency_20_0 = null;



        	enterRule();

        try {
            // InternalRos.g:855:2: ( ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? (otherlv_16= 'dependency' otherlv_17= '{' ( (lv_dependency_18_0= ruleDependency ) ) (otherlv_19= ',' ( (lv_dependency_20_0= ruleDependency ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalRos.g:856:2: ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? (otherlv_16= 'dependency' otherlv_17= '{' ( (lv_dependency_18_0= ruleDependency ) ) (otherlv_19= ',' ( (lv_dependency_20_0= ruleDependency ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalRos.g:856:2: ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? (otherlv_16= 'dependency' otherlv_17= '{' ( (lv_dependency_18_0= ruleDependency ) ) (otherlv_19= ',' ( (lv_dependency_20_0= ruleDependency ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalRos.g:857:3: () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )? (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )? (otherlv_16= 'dependency' otherlv_17= '{' ( (lv_dependency_18_0= ruleDependency ) ) (otherlv_19= ',' ( (lv_dependency_20_0= ruleDependency ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalRos.g:857:3: ()
            // InternalRos.g:858:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCatkinPackageAccess().getCatkinPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCatkinPackageAccess().getCatkinPackageKeyword_1());
            		
            // InternalRos.g:868:3: ( (lv_name_2_0= ruleRosNames ) )
            // InternalRos.g:869:4: (lv_name_2_0= ruleRosNames )
            {
            // InternalRos.g:869:4: (lv_name_2_0= ruleRosNames )
            // InternalRos.g:870:5: lv_name_2_0= ruleRosNames
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

            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:891:3: (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRos.g:892:4: otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getCatkinPackageAccess().getSpecKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRos.g:900:4: ( (lv_spec_6_0= ruleSpecBase ) )
                    // InternalRos.g:901:5: (lv_spec_6_0= ruleSpecBase )
                    {
                    // InternalRos.g:901:5: (lv_spec_6_0= ruleSpecBase )
                    // InternalRos.g:902:6: lv_spec_6_0= ruleSpecBase
                    {

                    						newCompositeNode(grammarAccess.getCatkinPackageAccess().getSpecSpecBaseParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:919:4: (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==14) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalRos.g:920:5: otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCatkinPackageAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRos.g:924:5: ( (lv_spec_8_0= ruleSpecBase ) )
                    	    // InternalRos.g:925:6: (lv_spec_8_0= ruleSpecBase )
                    	    {
                    	    // InternalRos.g:925:6: (lv_spec_8_0= ruleSpecBase )
                    	    // InternalRos.g:926:7: lv_spec_8_0= ruleSpecBase
                    	    {

                    	    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getSpecSpecBaseParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:949:3: (otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRos.g:950:4: otherlv_10= 'artifact' otherlv_11= '{' ( (lv_artifact_12_0= ruleArtifact ) ) (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getCatkinPackageAccess().getArtifactKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRos.g:958:4: ( (lv_artifact_12_0= ruleArtifact ) )
                    // InternalRos.g:959:5: (lv_artifact_12_0= ruleArtifact )
                    {
                    // InternalRos.g:959:5: (lv_artifact_12_0= ruleArtifact )
                    // InternalRos.g:960:6: lv_artifact_12_0= ruleArtifact
                    {

                    						newCompositeNode(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:977:4: (otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRos.g:978:5: otherlv_13= ',' ( (lv_artifact_14_0= ruleArtifact ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getCatkinPackageAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRos.g:982:5: ( (lv_artifact_14_0= ruleArtifact ) )
                    	    // InternalRos.g:983:6: (lv_artifact_14_0= ruleArtifact )
                    	    {
                    	    // InternalRos.g:983:6: (lv_artifact_14_0= ruleArtifact )
                    	    // InternalRos.g:984:7: lv_artifact_14_0= ruleArtifact
                    	    {

                    	    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_artifact_14_0=ruleArtifact();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"artifact",
                    	    								lv_artifact_14_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Artifact");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1007:3: (otherlv_16= 'dependency' otherlv_17= '{' ( (lv_dependency_18_0= ruleDependency ) ) (otherlv_19= ',' ( (lv_dependency_20_0= ruleDependency ) ) )* otherlv_21= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRos.g:1008:4: otherlv_16= 'dependency' otherlv_17= '{' ( (lv_dependency_18_0= ruleDependency ) ) (otherlv_19= ',' ( (lv_dependency_20_0= ruleDependency ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getCatkinPackageAccess().getDependencyKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_17, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRos.g:1016:4: ( (lv_dependency_18_0= ruleDependency ) )
                    // InternalRos.g:1017:5: (lv_dependency_18_0= ruleDependency )
                    {
                    // InternalRos.g:1017:5: (lv_dependency_18_0= ruleDependency )
                    // InternalRos.g:1018:6: lv_dependency_18_0= ruleDependency
                    {

                    						newCompositeNode(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_dependency_18_0=ruleDependency();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    						}
                    						add(
                    							current,
                    							"dependency",
                    							lv_dependency_18_0,
                    							"de.fraunhofer.ipa.ros.Ros.Dependency");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1035:4: (otherlv_19= ',' ( (lv_dependency_20_0= ruleDependency ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==14) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRos.g:1036:5: otherlv_19= ',' ( (lv_dependency_20_0= ruleDependency ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_19); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getCatkinPackageAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRos.g:1040:5: ( (lv_dependency_20_0= ruleDependency ) )
                    	    // InternalRos.g:1041:6: (lv_dependency_20_0= ruleDependency )
                    	    {
                    	    // InternalRos.g:1041:6: (lv_dependency_20_0= ruleDependency )
                    	    // InternalRos.g:1042:7: lv_dependency_20_0= ruleDependency
                    	    {

                    	    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_dependency_20_0=ruleDependency();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"dependency",
                    	    								lv_dependency_20_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Dependency");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:1073:1: entryRuleServiceSpec returns [EObject current=null] : iv_ruleServiceSpec= ruleServiceSpec EOF ;
    public final EObject entryRuleServiceSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSpec = null;


        try {
            // InternalRos.g:1073:52: (iv_ruleServiceSpec= ruleServiceSpec EOF )
            // InternalRos.g:1074:2: iv_ruleServiceSpec= ruleServiceSpec EOF
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
    // InternalRos.g:1080:1: ruleServiceSpec returns [EObject current=null] : ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:1086:2: ( ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:1087:2: ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:1087:2: ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' )
            // InternalRos.g:1088:3: () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}'
            {
            // InternalRos.g:1088:3: ()
            // InternalRos.g:1089:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceSpecAccess().getServiceSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceSpecAccess().getServiceSpecKeyword_1());
            		
            // InternalRos.g:1099:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:1100:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:1100:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:1101:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:1122:3: (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRos.g:1123:4: otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getServiceSpecAccess().getRequestKeyword_4_0());
                    			
                    // InternalRos.g:1127:4: ( (lv_request_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:1128:5: (lv_request_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1128:5: (lv_request_5_0= ruleMessageDefinition )
                    // InternalRos.g:1129:6: lv_request_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getRequestMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_21);
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

            // InternalRos.g:1147:3: (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRos.g:1148:4: otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceSpecAccess().getResponseKeyword_5_0());
                    			
                    // InternalRos.g:1152:4: ( (lv_response_7_0= ruleMessageDefinition ) )
                    // InternalRos.g:1153:5: (lv_response_7_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1153:5: (lv_response_7_0= ruleMessageDefinition )
                    // InternalRos.g:1154:6: lv_response_7_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getResponseMessageDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:1180:1: entryRuleTopicSpec returns [EObject current=null] : iv_ruleTopicSpec= ruleTopicSpec EOF ;
    public final EObject entryRuleTopicSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpec = null;


        try {
            // InternalRos.g:1180:50: (iv_ruleTopicSpec= ruleTopicSpec EOF )
            // InternalRos.g:1181:2: iv_ruleTopicSpec= ruleTopicSpec EOF
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
    // InternalRos.g:1187:1: ruleTopicSpec returns [EObject current=null] : ( () otherlv_1= 'TopicSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleTopicSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_message_5_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1193:2: ( ( () otherlv_1= 'TopicSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' ) )
            // InternalRos.g:1194:2: ( () otherlv_1= 'TopicSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' )
            {
            // InternalRos.g:1194:2: ( () otherlv_1= 'TopicSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' )
            // InternalRos.g:1195:3: () otherlv_1= 'TopicSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}'
            {
            // InternalRos.g:1195:3: ()
            // InternalRos.g:1196:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicSpecAccess().getTopicSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicSpecAccess().getTopicSpecKeyword_1());
            		
            // InternalRos.g:1206:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:1207:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:1207:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:1208:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTopicSpecAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopicSpecRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:1229:3: (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRos.g:1230:4: otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTopicSpecAccess().getMessageKeyword_4_0());
                    			
                    // InternalRos.g:1234:4: ( (lv_message_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:1235:5: (lv_message_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1235:5: (lv_message_5_0= ruleMessageDefinition )
                    // InternalRos.g:1236:6: lv_message_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getTopicSpecAccess().getMessageMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:1262:1: entryRuleActionSpec returns [EObject current=null] : iv_ruleActionSpec= ruleActionSpec EOF ;
    public final EObject entryRuleActionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSpec = null;


        try {
            // InternalRos.g:1262:51: (iv_ruleActionSpec= ruleActionSpec EOF )
            // InternalRos.g:1263:2: iv_ruleActionSpec= ruleActionSpec EOF
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
    // InternalRos.g:1269:1: ruleActionSpec returns [EObject current=null] : ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' ) ;
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
            // InternalRos.g:1275:2: ( ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' ) )
            // InternalRos.g:1276:2: ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' )
            {
            // InternalRos.g:1276:2: ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' )
            // InternalRos.g:1277:3: () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}'
            {
            // InternalRos.g:1277:3: ()
            // InternalRos.g:1278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionSpecAccess().getActionSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getActionSpecAccess().getActionSpecKeyword_1());
            		
            // InternalRos.g:1288:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:1289:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:1289:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:1290:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getActionSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:1311:3: (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRos.g:1312:4: otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionSpecAccess().getGoalKeyword_4_0());
                    			
                    // InternalRos.g:1316:4: ( (lv_goal_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:1317:5: (lv_goal_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1317:5: (lv_goal_5_0= ruleMessageDefinition )
                    // InternalRos.g:1318:6: lv_goal_5_0= ruleMessageDefinition
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

            // InternalRos.g:1336:3: (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRos.g:1337:4: otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionSpecAccess().getResultKeyword_5_0());
                    			
                    // InternalRos.g:1341:4: ( (lv_result_7_0= ruleMessageDefinition ) )
                    // InternalRos.g:1342:5: (lv_result_7_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1342:5: (lv_result_7_0= ruleMessageDefinition )
                    // InternalRos.g:1343:6: lv_result_7_0= ruleMessageDefinition
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

            // InternalRos.g:1361:3: (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRos.g:1362:4: otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) )
                    {
                    otherlv_8=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionSpecAccess().getFeedbackKeyword_6_0());
                    			
                    // InternalRos.g:1366:4: ( (lv_feedback_9_0= ruleMessageDefinition ) )
                    // InternalRos.g:1367:5: (lv_feedback_9_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1367:5: (lv_feedback_9_0= ruleMessageDefinition )
                    // InternalRos.g:1368:6: lv_feedback_9_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getFeedbackMessageDefinitionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleNode"
    // InternalRos.g:1394:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRos.g:1394:45: (iv_ruleNode= ruleNode EOF )
            // InternalRos.g:1395:2: iv_ruleNode= ruleNode EOF
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
    // InternalRos.g:1401:1: ruleNode returns [EObject current=null] : (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_serviceserver_6_0 = null;

        EObject lv_serviceserver_8_0 = null;

        EObject lv_publisher_12_0 = null;

        EObject lv_publisher_14_0 = null;

        EObject lv_subscriber_18_0 = null;

        EObject lv_subscriber_20_0 = null;

        EObject lv_serviceclient_24_0 = null;

        EObject lv_serviceclient_26_0 = null;

        EObject lv_actionserver_30_0 = null;

        EObject lv_actionserver_32_0 = null;

        EObject lv_actionclient_36_0 = null;

        EObject lv_actionclient_38_0 = null;

        EObject lv_parameter_42_0 = null;

        EObject lv_parameter_44_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1407:2: ( (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalRos.g:1408:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalRos.g:1408:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalRos.g:1409:3: otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getNameKeyword_2());
            		
            // InternalRos.g:1421:3: ( (lv_name_3_0= ruleRosNames ) )
            // InternalRos.g:1422:4: (lv_name_3_0= ruleRosNames )
            {
            // InternalRos.g:1422:4: (lv_name_3_0= ruleRosNames )
            // InternalRos.g:1423:5: lv_name_3_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameRosNamesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
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

            // InternalRos.g:1440:3: (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==34) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRos.g:1441:4: otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getServiceserverKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_28); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRos.g:1449:4: ( (lv_serviceserver_6_0= ruleServiceServer ) )
                    // InternalRos.g:1450:5: (lv_serviceserver_6_0= ruleServiceServer )
                    {
                    // InternalRos.g:1450:5: (lv_serviceserver_6_0= ruleServiceServer )
                    // InternalRos.g:1451:6: lv_serviceserver_6_0= ruleServiceServer
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_serviceserver_6_0=ruleServiceServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"serviceserver",
                    							lv_serviceserver_6_0,
                    							"de.fraunhofer.ipa.ros.Ros.ServiceServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1468:4: (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalRos.g:1469:5: otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_28); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRos.g:1473:5: ( (lv_serviceserver_8_0= ruleServiceServer ) )
                    	    // InternalRos.g:1474:6: (lv_serviceserver_8_0= ruleServiceServer )
                    	    {
                    	    // InternalRos.g:1474:6: (lv_serviceserver_8_0= ruleServiceServer )
                    	    // InternalRos.g:1475:7: lv_serviceserver_8_0= ruleServiceServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_serviceserver_8_0=ruleServiceServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceserver",
                    	    								lv_serviceserver_8_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.ServiceServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1498:3: (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRos.g:1499:4: otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getPublisherKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_30); 

                    				newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRos.g:1507:4: ( (lv_publisher_12_0= rulePublisher ) )
                    // InternalRos.g:1508:5: (lv_publisher_12_0= rulePublisher )
                    {
                    // InternalRos.g:1508:5: (lv_publisher_12_0= rulePublisher )
                    // InternalRos.g:1509:6: lv_publisher_12_0= rulePublisher
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_publisher_12_0=rulePublisher();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"publisher",
                    							lv_publisher_12_0,
                    							"de.fraunhofer.ipa.ros.Ros.Publisher");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1526:4: (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalRos.g:1527:5: otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_30); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRos.g:1531:5: ( (lv_publisher_14_0= rulePublisher ) )
                    	    // InternalRos.g:1532:6: (lv_publisher_14_0= rulePublisher )
                    	    {
                    	    // InternalRos.g:1532:6: (lv_publisher_14_0= rulePublisher )
                    	    // InternalRos.g:1533:7: lv_publisher_14_0= rulePublisher
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_publisher_14_0=rulePublisher();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"publisher",
                    	    								lv_publisher_14_0,
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

                    otherlv_15=(Token)match(input,15,FOLLOW_31); 

                    				newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1556:3: (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==36) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRos.g:1557:4: otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getSubscriberKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_32); 

                    				newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRos.g:1565:4: ( (lv_subscriber_18_0= ruleSubscriber ) )
                    // InternalRos.g:1566:5: (lv_subscriber_18_0= ruleSubscriber )
                    {
                    // InternalRos.g:1566:5: (lv_subscriber_18_0= ruleSubscriber )
                    // InternalRos.g:1567:6: lv_subscriber_18_0= ruleSubscriber
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_subscriber_18_0=ruleSubscriber();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"subscriber",
                    							lv_subscriber_18_0,
                    							"de.fraunhofer.ipa.ros.Ros.Subscriber");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1584:4: (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalRos.g:1585:5: otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_32); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRos.g:1589:5: ( (lv_subscriber_20_0= ruleSubscriber ) )
                    	    // InternalRos.g:1590:6: (lv_subscriber_20_0= ruleSubscriber )
                    	    {
                    	    // InternalRos.g:1590:6: (lv_subscriber_20_0= ruleSubscriber )
                    	    // InternalRos.g:1591:7: lv_subscriber_20_0= ruleSubscriber
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_subscriber_20_0=ruleSubscriber();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subscriber",
                    	    								lv_subscriber_20_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Subscriber");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_33); 

                    				newLeafNode(otherlv_21, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1614:3: (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRos.g:1615:4: otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getServiceclientKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_34); 

                    				newLeafNode(otherlv_23, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRos.g:1623:4: ( (lv_serviceclient_24_0= ruleServiceClient ) )
                    // InternalRos.g:1624:5: (lv_serviceclient_24_0= ruleServiceClient )
                    {
                    // InternalRos.g:1624:5: (lv_serviceclient_24_0= ruleServiceClient )
                    // InternalRos.g:1625:6: lv_serviceclient_24_0= ruleServiceClient
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_serviceclient_24_0=ruleServiceClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"serviceclient",
                    							lv_serviceclient_24_0,
                    							"de.fraunhofer.ipa.ros.Ros.ServiceClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1642:4: (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalRos.g:1643:5: otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_34); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRos.g:1647:5: ( (lv_serviceclient_26_0= ruleServiceClient ) )
                    	    // InternalRos.g:1648:6: (lv_serviceclient_26_0= ruleServiceClient )
                    	    {
                    	    // InternalRos.g:1648:6: (lv_serviceclient_26_0= ruleServiceClient )
                    	    // InternalRos.g:1649:7: lv_serviceclient_26_0= ruleServiceClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_serviceclient_26_0=ruleServiceClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"serviceclient",
                    	    								lv_serviceclient_26_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.ServiceClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,15,FOLLOW_35); 

                    				newLeafNode(otherlv_27, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1672:3: (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRos.g:1673:4: otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getNodeAccess().getActionserverKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_29, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRos.g:1681:4: ( (lv_actionserver_30_0= ruleActionServer ) )
                    // InternalRos.g:1682:5: (lv_actionserver_30_0= ruleActionServer )
                    {
                    // InternalRos.g:1682:5: (lv_actionserver_30_0= ruleActionServer )
                    // InternalRos.g:1683:6: lv_actionserver_30_0= ruleActionServer
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actionserver_30_0=ruleActionServer();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"actionserver",
                    							lv_actionserver_30_0,
                    							"de.fraunhofer.ipa.ros.Ros.ActionServer");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1700:4: (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalRos.g:1701:5: otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_36); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRos.g:1705:5: ( (lv_actionserver_32_0= ruleActionServer ) )
                    	    // InternalRos.g:1706:6: (lv_actionserver_32_0= ruleActionServer )
                    	    {
                    	    // InternalRos.g:1706:6: (lv_actionserver_32_0= ruleActionServer )
                    	    // InternalRos.g:1707:7: lv_actionserver_32_0= ruleActionServer
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actionserver_32_0=ruleActionServer();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionserver",
                    	    								lv_actionserver_32_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.ActionServer");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,15,FOLLOW_37); 

                    				newLeafNode(otherlv_33, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1730:3: (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRos.g:1731:4: otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_34, grammarAccess.getNodeAccess().getActionclientKeyword_9_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_38); 

                    				newLeafNode(otherlv_35, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRos.g:1739:4: ( (lv_actionclient_36_0= ruleActionClient ) )
                    // InternalRos.g:1740:5: (lv_actionclient_36_0= ruleActionClient )
                    {
                    // InternalRos.g:1740:5: (lv_actionclient_36_0= ruleActionClient )
                    // InternalRos.g:1741:6: lv_actionclient_36_0= ruleActionClient
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_actionclient_36_0=ruleActionClient();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"actionclient",
                    							lv_actionclient_36_0,
                    							"de.fraunhofer.ipa.ros.Ros.ActionClient");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1758:4: (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalRos.g:1759:5: otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_38); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getNodeAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRos.g:1763:5: ( (lv_actionclient_38_0= ruleActionClient ) )
                    	    // InternalRos.g:1764:6: (lv_actionclient_38_0= ruleActionClient )
                    	    {
                    	    // InternalRos.g:1764:6: (lv_actionclient_38_0= ruleActionClient )
                    	    // InternalRos.g:1765:7: lv_actionclient_38_0= ruleActionClient
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_actionclient_38_0=ruleActionClient();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actionclient",
                    	    								lv_actionclient_38_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.ActionClient");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,15,FOLLOW_39); 

                    				newLeafNode(otherlv_39, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1788:3: (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==40) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRos.g:1789:4: otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_40, grammarAccess.getNodeAccess().getParameterKeyword_10_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_40); 

                    				newLeafNode(otherlv_41, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalRos.g:1797:4: ( (lv_parameter_42_0= ruleParameter ) )
                    // InternalRos.g:1798:5: (lv_parameter_42_0= ruleParameter )
                    {
                    // InternalRos.g:1798:5: (lv_parameter_42_0= ruleParameter )
                    // InternalRos.g:1799:6: lv_parameter_42_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_parameter_42_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_42_0,
                    							"de.fraunhofer.ipa.ros.Ros.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:1816:4: (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalRos.g:1817:5: otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_40); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getNodeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalRos.g:1821:5: ( (lv_parameter_44_0= ruleParameter ) )
                    	    // InternalRos.g:1822:6: (lv_parameter_44_0= ruleParameter )
                    	    {
                    	    // InternalRos.g:1822:6: (lv_parameter_44_0= ruleParameter )
                    	    // InternalRos.g:1823:7: lv_parameter_44_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameter_44_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_44_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_45, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_46=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_46, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:1854:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRos.g:1854:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRos.g:1855:2: iv_ruleServiceServer= ruleServiceServer EOF
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
    // InternalRos.g:1861:1: ruleServiceServer returns [EObject current=null] : (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:1867:2: ( (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:1868:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:1868:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:1869:3: otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceServerAccess().getServiceServerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getNameKeyword_2());
            		
            // InternalRos.g:1881:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1882:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1882:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1883:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
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

            otherlv_4=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceServerAccess().getServiceKeyword_4());
            		
            // InternalRos.g:1904:3: ( ( ruleEString ) )
            // InternalRos.g:1905:4: ( ruleEString )
            {
            // InternalRos.g:1905:4: ( ruleEString )
            // InternalRos.g:1906:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceServerAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:1920:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRos.g:1921:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceServerAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:1925:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:1926:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:1926:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:1927:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:1953:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRos.g:1953:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRos.g:1954:2: iv_rulePublisher= rulePublisher EOF
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
    // InternalRos.g:1960:1: rulePublisher returns [EObject current=null] : (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:1966:2: ( (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:1967:2: (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:1967:2: (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:1968:3: otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPublisherAccess().getPublisherKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getNameKeyword_2());
            		
            // InternalRos.g:1980:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1981:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1981:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1982:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_4=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getMessageKeyword_4());
            		
            // InternalRos.g:2003:3: ( ( ruleEString ) )
            // InternalRos.g:2004:4: ( ruleEString )
            {
            // InternalRos.g:2004:4: ( ruleEString )
            // InternalRos.g:2005:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2019:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==43) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRos.g:2020:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2024:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2025:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2025:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2026:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getPublisherAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:2052:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRos.g:2052:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRos.g:2053:2: iv_ruleSubscriber= ruleSubscriber EOF
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
    // InternalRos.g:2059:1: ruleSubscriber returns [EObject current=null] : (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2065:2: ( (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2066:2: (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2066:2: (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2067:3: otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubscriberAccess().getSubscriberKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getNameKeyword_2());
            		
            // InternalRos.g:2079:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2080:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2080:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2081:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_4=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getMessageKeyword_4());
            		
            // InternalRos.g:2102:3: ( ( ruleEString ) )
            // InternalRos.g:2103:4: ( ruleEString )
            {
            // InternalRos.g:2103:4: ( ruleEString )
            // InternalRos.g:2104:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2118:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRos.g:2119:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2123:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2124:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2124:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2125:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getSubscriberAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:2151:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRos.g:2151:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRos.g:2152:2: iv_ruleServiceClient= ruleServiceClient EOF
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
    // InternalRos.g:2158:1: ruleServiceClient returns [EObject current=null] : (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2164:2: ( (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2165:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2165:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2166:3: otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceClientAccess().getServiceClientKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getNameKeyword_2());
            		
            // InternalRos.g:2178:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2179:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2179:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2180:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceClientAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_41);
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

            otherlv_4=(Token)match(input,42,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceClientAccess().getServiceKeyword_4());
            		
            // InternalRos.g:2201:3: ( ( ruleEString ) )
            // InternalRos.g:2202:4: ( ruleEString )
            {
            // InternalRos.g:2202:4: ( ruleEString )
            // InternalRos.g:2203:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceClientAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2217:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRos.g:2218:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2222:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2223:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2223:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2224:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getServiceClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:2250:1: entryRuleActionServer returns [EObject current=null] : iv_ruleActionServer= ruleActionServer EOF ;
    public final EObject entryRuleActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionServer = null;


        try {
            // InternalRos.g:2250:53: (iv_ruleActionServer= ruleActionServer EOF )
            // InternalRos.g:2251:2: iv_ruleActionServer= ruleActionServer EOF
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
    // InternalRos.g:2257:1: ruleActionServer returns [EObject current=null] : (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2263:2: ( (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2264:2: (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2264:2: (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2265:3: otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionServerAccess().getActionServerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getActionServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getActionServerAccess().getNameKeyword_2());
            		
            // InternalRos.g:2277:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2278:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2278:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2279:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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

            otherlv_4=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getActionServerAccess().getActionKeyword_4());
            		
            // InternalRos.g:2300:3: ( ( ruleEString ) )
            // InternalRos.g:2301:4: ( ruleEString )
            {
            // InternalRos.g:2301:4: ( ruleEString )
            // InternalRos.g:2302:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionServerAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2316:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==43) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRos.g:2317:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionServerAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2321:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2322:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2322:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2323:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionServerAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:2349:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // InternalRos.g:2349:53: (iv_ruleActionClient= ruleActionClient EOF )
            // InternalRos.g:2350:2: iv_ruleActionClient= ruleActionClient EOF
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
    // InternalRos.g:2356:1: ruleActionClient returns [EObject current=null] : (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2362:2: ( (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2363:2: (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2363:2: (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2364:3: otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionClientAccess().getActionClientKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getActionClientAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getActionClientAccess().getNameKeyword_2());
            		
            // InternalRos.g:2376:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2377:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2377:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2378:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionClientAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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

            otherlv_4=(Token)match(input,48,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getActionClientAccess().getActionKeyword_4());
            		
            // InternalRos.g:2399:3: ( ( ruleEString ) )
            // InternalRos.g:2400:4: ( ruleEString )
            {
            // InternalRos.g:2400:4: ( ruleEString )
            // InternalRos.g:2401:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionClientAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_42);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2415:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==43) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRos.g:2416:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2420:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2421:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2421:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2422:6: lv_namespace_7_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getActionClientAccess().getNamespaceNamespaceParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:2448:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRos.g:2448:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRos.g:2449:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalRos.g:2455:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GraphName' ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:2461:2: (kw= 'GraphName' )
            // InternalRos.g:2462:2: kw= 'GraphName'
            {
            kw=(Token)match(input,50,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParameter"
    // InternalRos.g:2470:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRos.g:2470:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRos.g:2471:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRos.g:2477:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) ;
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
            // InternalRos.g:2483:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) )
            // InternalRos.g:2484:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            {
            // InternalRos.g:2484:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            // InternalRos.g:2485:3: otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_2());
            		
            // InternalRos.g:2497:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2498:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2498:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2499:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalRos.g:2516:3: (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==43) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRos.g:2517:4: otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_43); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getNamespaceKeyword_4_0());
                    			
                    // InternalRos.g:2521:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalRos.g:2522:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalRos.g:2522:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalRos.g:2523:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_47);
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

            otherlv_6=(Token)match(input,52,FOLLOW_48); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getTypeKeyword_5());
            		
            // InternalRos.g:2545:3: ( (lv_type_7_0= ruleParameterType ) )
            // InternalRos.g:2546:4: (lv_type_7_0= ruleParameterType )
            {
            // InternalRos.g:2546:4: (lv_type_7_0= ruleParameterType )
            // InternalRos.g:2547:5: lv_type_7_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getTypeParameterTypeParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalRos.g:2572:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRos.g:2572:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRos.g:2573:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalRos.g:2579:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:2585:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2586:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2586:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2587:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2587:3: ()
            // InternalRos.g:2588:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2602:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==54) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRos.g:2603:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2611:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2612:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2612:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2613:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:2630:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==14) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalRos.g:2631:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2635:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2636:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2636:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2637:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:2668:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRos.g:2668:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRos.g:2669:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalRos.g:2675:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:2681:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2682:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2682:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2683:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2683:3: ()
            // InternalRos.g:2684:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2698:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==54) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRos.g:2699:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2707:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2708:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2708:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2709:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:2726:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==14) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalRos.g:2727:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2731:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2732:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2732:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2733:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:2764:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRos.g:2764:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRos.g:2765:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalRos.g:2771:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:2777:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2778:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2778:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2779:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2779:3: ()
            // InternalRos.g:2780:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2794:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRos.g:2795:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,54,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2803:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2804:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2804:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2805:6: lv_parts_5_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:2822:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==14) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalRos.g:2823:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_50); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2827:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2828:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2828:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2829:7: lv_parts_7_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParameterListType"
    // InternalRos.g:2860:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRos.g:2860:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRos.g:2861:2: iv_ruleParameterListType= ruleParameterListType EOF
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
    // InternalRos.g:2867:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleParameterListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_sequence_5_0 = null;

        EObject lv_sequence_7_0 = null;

        EObject lv_default_10_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2873:2: ( ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' ) )
            // InternalRos.g:2874:2: ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' )
            {
            // InternalRos.g:2874:2: ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' )
            // InternalRos.g:2875:3: () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}'
            {
            // InternalRos.g:2875:3: ()
            // InternalRos.g:2876:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getParameterListTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2890:3: (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==58) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRos.g:2891:4: otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,58,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterListTypeAccess().getSequenceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_48); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2899:4: ( (lv_sequence_5_0= ruleParameterType ) )
                    // InternalRos.g:2900:5: (lv_sequence_5_0= ruleParameterType )
                    {
                    // InternalRos.g:2900:5: (lv_sequence_5_0= ruleParameterType )
                    // InternalRos.g:2901:6: lv_sequence_5_0= ruleParameterType
                    {

                    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:2918:4: (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==14) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalRos.g:2919:5: otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_48); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2923:5: ( (lv_sequence_7_0= ruleParameterType ) )
                    	    // InternalRos.g:2924:6: (lv_sequence_7_0= ruleParameterType )
                    	    {
                    	    // InternalRos.g:2924:6: (lv_sequence_7_0= ruleParameterType )
                    	    // InternalRos.g:2925:7: lv_sequence_7_0= ruleParameterType
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_sequence_7_0=ruleParameterType();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sequence",
                    	    								lv_sequence_7_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.ParameterType");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_52); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:2948:3: (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==59) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRos.g:2949:4: otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) )
                    {
                    otherlv_9=(Token)match(input,59,FOLLOW_53); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterListTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRos.g:2953:4: ( (lv_default_10_0= ruleParameterSequence ) )
                    // InternalRos.g:2954:5: (lv_default_10_0= ruleParameterSequence )
                    {
                    // InternalRos.g:2954:5: (lv_default_10_0= ruleParameterSequence )
                    // InternalRos.g:2955:6: lv_default_10_0= ruleParameterSequence
                    {

                    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getDefaultParameterSequenceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_10_0=ruleParameterSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_10_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterSequence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:2981:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRos.g:2981:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRos.g:2982:2: iv_ruleParameterStructType= ruleParameterStructType EOF
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
    // InternalRos.g:2988:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleParameterStructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_parameterstructypetmember_5_0 = null;

        EObject lv_parameterstructypetmember_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:2994:2: ( ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2995:2: ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2995:2: ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2996:3: () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2996:3: ()
            // InternalRos.g:2997:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getParameterStructTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3011:3: (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==61) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRos.g:3012:4: otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,61,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_55); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:3020:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
                    // InternalRos.g:3021:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
                    {
                    // InternalRos.g:3021:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
                    // InternalRos.g:3022:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:3039:4: (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==14) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalRos.g:3040:5: otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_55); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:3044:5: ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) )
                    	    // InternalRos.g:3045:6: (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember )
                    	    {
                    	    // InternalRos.g:3045:6: (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember )
                    	    // InternalRos.g:3046:7: lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameterstructypetmember_7_0=ruleParameterStructTypeMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameterstructypetmember",
                    	    								lv_parameterstructypetmember_7_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.ParameterStructTypeMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterStructTypeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParameterStructTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3077:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRos.g:3077:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRos.g:3078:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
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
    // InternalRos.g:3084:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3090:2: ( ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3091:2: ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3091:2: ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' )
            // InternalRos.g:3092:3: () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3092:3: ()
            // InternalRos.g:3093:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3107:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==59) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRos.g:3108:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_56); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3112:4: ( (lv_default_4_0= ruleParameterInteger ) )
                    // InternalRos.g:3113:5: (lv_default_4_0= ruleParameterInteger )
                    {
                    // InternalRos.g:3113:5: (lv_default_4_0= ruleParameterInteger )
                    // InternalRos.g:3114:6: lv_default_4_0= ruleParameterInteger
                    {

                    						newCompositeNode(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterIntegerTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterInteger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterIntegerTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3140:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRos.g:3140:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRos.g:3141:2: iv_ruleParameterStringType= ruleParameterStringType EOF
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
    // InternalRos.g:3147:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3153:2: ( ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3154:2: ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3154:2: ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            // InternalRos.g:3155:3: () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3155:3: ()
            // InternalRos.g:3156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getParameterStringTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3170:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==59) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRos.g:3171:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_57); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3175:4: ( (lv_default_4_0= ruleParameterString ) )
                    // InternalRos.g:3176:5: (lv_default_4_0= ruleParameterString )
                    {
                    // InternalRos.g:3176:5: (lv_default_4_0= ruleParameterString )
                    // InternalRos.g:3177:6: lv_default_4_0= ruleParameterString
                    {

                    						newCompositeNode(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterStringTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3203:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRos.g:3203:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRos.g:3204:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
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
    // InternalRos.g:3210:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3216:2: ( ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3217:2: ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3217:2: ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' )
            // InternalRos.g:3218:3: () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3218:3: ()
            // InternalRos.g:3219:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3233:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==59) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRos.g:3234:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_58); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3238:4: ( (lv_default_4_0= ruleParameterDouble ) )
                    // InternalRos.g:3239:5: (lv_default_4_0= ruleParameterDouble )
                    {
                    // InternalRos.g:3239:5: (lv_default_4_0= ruleParameterDouble )
                    // InternalRos.g:3240:6: lv_default_4_0= ruleParameterDouble
                    {

                    						newCompositeNode(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDoubleTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterDoubleTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleParameterDateType"
    // InternalRos.g:3266:1: entryRuleParameterDateType returns [EObject current=null] : iv_ruleParameterDateType= ruleParameterDateType EOF ;
    public final EObject entryRuleParameterDateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDateType = null;


        try {
            // InternalRos.g:3266:58: (iv_ruleParameterDateType= ruleParameterDateType EOF )
            // InternalRos.g:3267:2: iv_ruleParameterDateType= ruleParameterDateType EOF
            {
             newCompositeNode(grammarAccess.getParameterDateTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDateType=ruleParameterDateType();

            state._fsp--;

             current =iv_ruleParameterDateType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterDateType"


    // $ANTLR start "ruleParameterDateType"
    // InternalRos.g:3273:1: ruleParameterDateType returns [EObject current=null] : ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterDateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3279:2: ( ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3280:2: ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3280:2: ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' )
            // InternalRos.g:3281:3: () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3281:3: ()
            // InternalRos.g:3282:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDateTypeAccess().getParameterDateTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDateTypeAccess().getParameterDateTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDateTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3296:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==59) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRos.g:3297:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_59); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDateTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3301:4: ( (lv_default_4_0= ruleParameterDate ) )
                    // InternalRos.g:3302:5: (lv_default_4_0= ruleParameterDate )
                    {
                    // InternalRos.g:3302:5: (lv_default_4_0= ruleParameterDate )
                    // InternalRos.g:3303:6: lv_default_4_0= ruleParameterDate
                    {

                    						newCompositeNode(grammarAccess.getParameterDateTypeAccess().getDefaultParameterDateParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDateTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterDateTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDateType"


    // $ANTLR start "entryRuleParameterBooleanType"
    // InternalRos.g:3329:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRos.g:3329:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRos.g:3330:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
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
    // InternalRos.g:3336:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3342:2: ( ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3343:2: ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3343:2: ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' )
            // InternalRos.g:3344:3: () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3344:3: ()
            // InternalRos.g:3345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3359:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==59) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRos.g:3360:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_60); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3364:4: ( (lv_default_4_0= ruleParameterBoolean ) )
                    // InternalRos.g:3365:5: (lv_default_4_0= ruleParameterBoolean )
                    {
                    // InternalRos.g:3365:5: (lv_default_4_0= ruleParameterBoolean )
                    // InternalRos.g:3366:6: lv_default_4_0= ruleParameterBoolean
                    {

                    						newCompositeNode(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBooleanTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterBooleanTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3392:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRos.g:3392:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRos.g:3393:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
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
    // InternalRos.g:3399:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3405:2: ( ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3406:2: ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3406:2: ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' )
            // InternalRos.g:3407:3: () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3407:3: ()
            // InternalRos.g:3408:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3422:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==59) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalRos.g:3423:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_61); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3427:4: ( (lv_default_4_0= ruleParameterBase64 ) )
                    // InternalRos.g:3428:5: (lv_default_4_0= ruleParameterBase64 )
                    {
                    // InternalRos.g:3428:5: (lv_default_4_0= ruleParameterBase64 )
                    // InternalRos.g:3429:6: lv_default_4_0= ruleParameterBase64
                    {

                    						newCompositeNode(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterBase64();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBase64TypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterBase64");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterBase64TypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleParameterAnyType"
    // InternalRos.g:3455:1: entryRuleParameterAnyType returns [EObject current=null] : iv_ruleParameterAnyType= ruleParameterAnyType EOF ;
    public final EObject entryRuleParameterAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAnyType = null;


        try {
            // InternalRos.g:3455:57: (iv_ruleParameterAnyType= ruleParameterAnyType EOF )
            // InternalRos.g:3456:2: iv_ruleParameterAnyType= ruleParameterAnyType EOF
            {
             newCompositeNode(grammarAccess.getParameterAnyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterAnyType=ruleParameterAnyType();

            state._fsp--;

             current =iv_ruleParameterAnyType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterAnyType"


    // $ANTLR start "ruleParameterAnyType"
    // InternalRos.g:3462:1: ruleParameterAnyType returns [EObject current=null] : ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3468:2: ( ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3469:2: ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3469:2: ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' )
            // InternalRos.g:3470:3: () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3470:3: ()
            // InternalRos.g:3471:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyTypeAccess().getParameterAnyTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyTypeAccess().getParameterAnyTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3485:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==59) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRos.g:3486:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_62); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3490:4: ( (lv_default_4_0= ruleParameterAny ) )
                    // InternalRos.g:3491:5: (lv_default_4_0= ruleParameterAny )
                    {
                    // InternalRos.g:3491:5: (lv_default_4_0= ruleParameterAny )
                    // InternalRos.g:3492:6: lv_default_4_0= ruleParameterAny
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyTypeAccess().getDefaultParameterAnyParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_4_0=ruleParameterAny();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterAnyTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_4_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterAny");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterAnyTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterAnyType"


    // $ANTLR start "entryRuleParameterArrayType"
    // InternalRos.g:3518:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRos.g:3518:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRos.g:3519:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
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
    // InternalRos.g:3525:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' ) ;
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
            // InternalRos.g:3531:2: ( (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' ) )
            // InternalRos.g:3532:2: (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' )
            {
            // InternalRos.g:3532:2: (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' )
            // InternalRos.g:3533:3: otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getParameterArrayTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalRos.g:3545:3: ( (lv_type_3_0= ruleParameterType ) )
            // InternalRos.g:3546:4: (lv_type_3_0= ruleParameterType )
            {
            // InternalRos.g:3546:4: (lv_type_3_0= ruleParameterType )
            // InternalRos.g:3547:5: lv_type_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_52);
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

            // InternalRos.g:3564:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==59) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalRos.g:3565:4: otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) )
                    {
                    otherlv_4=(Token)match(input,59,FOLLOW_53); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRos.g:3569:4: ( (lv_default_5_0= ruleParameterSequence ) )
                    // InternalRos.g:3570:5: (lv_default_5_0= ruleParameterSequence )
                    {
                    // InternalRos.g:3570:5: (lv_default_5_0= ruleParameterSequence )
                    // InternalRos.g:3571:6: lv_default_5_0= ruleParameterSequence
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterSequenceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_5_0=ruleParameterSequence();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterSequence");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleParameterSequence"
    // InternalRos.g:3597:1: entryRuleParameterSequence returns [EObject current=null] : iv_ruleParameterSequence= ruleParameterSequence EOF ;
    public final EObject entryRuleParameterSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSequence = null;


        try {
            // InternalRos.g:3597:58: (iv_ruleParameterSequence= ruleParameterSequence EOF )
            // InternalRos.g:3598:2: iv_ruleParameterSequence= ruleParameterSequence EOF
            {
             newCompositeNode(grammarAccess.getParameterSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterSequence=ruleParameterSequence();

            state._fsp--;

             current =iv_ruleParameterSequence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterSequence"


    // $ANTLR start "ruleParameterSequence"
    // InternalRos.g:3604:1: ruleParameterSequence returns [EObject current=null] : ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleParameterSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_value_5_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3610:2: ( ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:3611:2: ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:3611:2: ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:3612:3: () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:3612:3: ()
            // InternalRos.g:3613:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterSequenceAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterSequenceAccess().getParameterSequenceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterSequenceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3627:3: (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==71) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalRos.g:3628:4: otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterSequenceAccess().getValueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterSequenceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:3636:4: ( (lv_value_5_0= ruleParameterValue ) )
                    // InternalRos.g:3637:5: (lv_value_5_0= ruleParameterValue )
                    {
                    // InternalRos.g:3637:5: (lv_value_5_0= ruleParameterValue )
                    // InternalRos.g:3638:6: lv_value_5_0= ruleParameterValue
                    {

                    						newCompositeNode(grammarAccess.getParameterSequenceAccess().getValueParameterValueParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_value_5_0=ruleParameterValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterSequenceRule());
                    						}
                    						add(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRos.g:3655:4: (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalRos.g:3656:5: otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_64); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterSequenceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:3660:5: ( (lv_value_7_0= ruleParameterValue ) )
                    	    // InternalRos.g:3661:6: (lv_value_7_0= ruleParameterValue )
                    	    {
                    	    // InternalRos.g:3661:6: (lv_value_7_0= ruleParameterValue )
                    	    // InternalRos.g:3662:7: lv_value_7_0= ruleParameterValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterSequenceAccess().getValueParameterValueParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_value_7_0=ruleParameterValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterSequenceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_7_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.ParameterValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterSequenceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParameterSequenceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterSequence"


    // $ANTLR start "entryRuleParameterAny"
    // InternalRos.g:3693:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRos.g:3693:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRos.g:3694:2: iv_ruleParameterAny= ruleParameterAny EOF
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
    // InternalRos.g:3700:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3706:2: ( ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3707:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3707:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRos.g:3708:3: () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3708:3: ()
            // InternalRos.g:3709:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3723:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==71) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalRos.g:3724:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,71,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyAccess().getValueKeyword_3_0());
                    			
                    // InternalRos.g:3728:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRos.g:3729:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRos.g:3729:5: (lv_value_4_0= ruleEString )
                    // InternalRos.g:3730:6: lv_value_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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
    // InternalRos.g:3756:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRos.g:3756:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRos.g:3757:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalRos.g:3763:1: ruleParameterString returns [EObject current=null] : (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3769:2: ( (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalRos.g:3770:2: (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3770:2: (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalRos.g:3771:3: otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStringAccess().getParameterStringKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,71,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStringAccess().getValueKeyword_2());
            		
            // InternalRos.g:3783:3: ( (lv_value_3_0= ruleEString ) )
            // InternalRos.g:3784:4: (lv_value_3_0= ruleEString )
            {
            // InternalRos.g:3784:4: (lv_value_3_0= ruleEString )
            // InternalRos.g:3785:5: lv_value_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStringRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterStringAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3810:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRos.g:3810:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRos.g:3811:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalRos.g:3817:1: ruleParameterBase64 returns [EObject current=null] : (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3823:2: ( (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' ) )
            // InternalRos.g:3824:2: (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3824:2: (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' )
            // InternalRos.g:3825:3: otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterBase64Access().getParameterBase64Keyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64Access().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,71,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBase64Access().getValueKeyword_2());
            		
            // InternalRos.g:3837:3: ( (lv_value_3_0= ruleBase64Binary ) )
            // InternalRos.g:3838:4: (lv_value_3_0= ruleBase64Binary )
            {
            // InternalRos.g:3838:4: (lv_value_3_0= ruleBase64Binary )
            // InternalRos.g:3839:5: lv_value_3_0= ruleBase64Binary
            {

            					newCompositeNode(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleBase64Binary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterBase64Rule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.Ros.Base64Binary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterBase64Access().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3864:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRos.g:3864:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRos.g:3865:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalRos.g:3871:1: ruleParameterInteger returns [EObject current=null] : (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3877:2: ( (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) )
            // InternalRos.g:3878:2: (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3878:2: (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            // InternalRos.g:3879:3: otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterIntegerAccess().getParameterIntegerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,71,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterIntegerAccess().getValueKeyword_2());
            		
            // InternalRos.g:3891:3: ( (lv_value_3_0= ruleInt0 ) )
            // InternalRos.g:3892:4: (lv_value_3_0= ruleInt0 )
            {
            // InternalRos.g:3892:4: (lv_value_3_0= ruleInt0 )
            // InternalRos.g:3893:5: lv_value_3_0= ruleInt0
            {

            					newCompositeNode(grammarAccess.getParameterIntegerAccess().getValueInt0ParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleInt0();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterIntegerRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.Ros.Int0");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterIntegerAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3918:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRos.g:3918:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRos.g:3919:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalRos.g:3925:1: ruleParameterDouble returns [EObject current=null] : (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3931:2: ( (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' ) )
            // InternalRos.g:3932:2: (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3932:2: (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' )
            // InternalRos.g:3933:3: otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterDoubleAccess().getParameterDoubleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,71,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDoubleAccess().getValueKeyword_2());
            		
            // InternalRos.g:3945:3: ( (lv_value_3_0= ruleDouble ) )
            // InternalRos.g:3946:4: (lv_value_3_0= ruleDouble )
            {
            // InternalRos.g:3946:4: (lv_value_3_0= ruleDouble )
            // InternalRos.g:3947:5: lv_value_3_0= ruleDouble
            {

            					newCompositeNode(grammarAccess.getParameterDoubleAccess().getValueDoubleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterDoubleRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.Ros.Double");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterDoubleAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:3972:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRos.g:3972:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRos.g:3973:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalRos.g:3979:1: ruleParameterBoolean returns [EObject current=null] : (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3985:2: ( (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) )
            // InternalRos.g:3986:2: (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3986:2: (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            // InternalRos.g:3987:3: otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterBooleanAccess().getParameterBooleanKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,71,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBooleanAccess().getValueKeyword_2());
            		
            // InternalRos.g:3999:3: ( (lv_value_3_0= ruleBoolean ) )
            // InternalRos.g:4000:4: (lv_value_3_0= ruleBoolean )
            {
            // InternalRos.g:4000:4: (lv_value_3_0= ruleBoolean )
            // InternalRos.g:4001:5: lv_value_3_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getParameterBooleanAccess().getValueBooleanParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterBooleanRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.Ros.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterBooleanAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:4026:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRos.g:4026:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRos.g:4027:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalRos.g:4033:1: ruleParameterStruct returns [EObject current=null] : ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleParameterStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_value_5_0 = null;

        EObject lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4039:2: ( ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:4040:2: ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:4040:2: ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:4041:3: () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:4041:3: ()
            // InternalRos.g:4042:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getParameterStructKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:4056:3: (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==71) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRos.g:4057:4: otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,71,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getValueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_70); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:4065:4: ( (lv_value_5_0= ruleParameterStructMember ) )
                    // InternalRos.g:4066:5: (lv_value_5_0= ruleParameterStructMember )
                    {
                    // InternalRos.g:4066:5: (lv_value_5_0= ruleParameterStructMember )
                    // InternalRos.g:4067:6: lv_value_5_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:4084:4: (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==14) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalRos.g:4085:5: otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_70); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:4089:5: ( (lv_value_7_0= ruleParameterStructMember ) )
                    	    // InternalRos.g:4090:6: (lv_value_7_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRos.g:4090:6: (lv_value_7_0= ruleParameterStructMember )
                    	    // InternalRos.g:4091:7: lv_value_7_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_value_7_0=ruleParameterStructMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"value",
                    	    								lv_value_7_0,
                    	    								"de.fraunhofer.ipa.ros.Ros.ParameterStructMember");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:4122:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRos.g:4122:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRos.g:4123:2: iv_ruleParameterDate= ruleParameterDate EOF
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
    // InternalRos.g:4129:1: ruleParameterDate returns [EObject current=null] : (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4135:2: ( (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' ) )
            // InternalRos.g:4136:2: (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' )
            {
            // InternalRos.g:4136:2: (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' )
            // InternalRos.g:4137:3: otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterDateAccess().getParameterDateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDateAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,71,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDateAccess().getValueKeyword_2());
            		
            // InternalRos.g:4149:3: ( (lv_value_3_0= ruleDateTime ) )
            // InternalRos.g:4150:4: (lv_value_3_0= ruleDateTime )
            {
            // InternalRos.g:4150:4: (lv_value_3_0= ruleDateTime )
            // InternalRos.g:4151:5: lv_value_3_0= ruleDateTime
            {

            					newCompositeNode(grammarAccess.getParameterDateAccess().getValueDateTimeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_value_3_0=ruleDateTime();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterDateRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"de.fraunhofer.ipa.ros.Ros.DateTime");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getParameterDateAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleBase64Binary"
    // InternalRos.g:4176:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRos.g:4176:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRos.g:4177:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalRos.g:4183:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Base64Binary' ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4189:2: (kw= 'Base64Binary' )
            // InternalRos.g:4190:2: kw= 'Base64Binary'
            {
            kw=(Token)match(input,80,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBase64BinaryAccess().getBase64BinaryKeyword());
            	

            }


            	leaveRule();

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


    // $ANTLR start "entryRuleInt0"
    // InternalRos.g:4198:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // InternalRos.g:4198:44: (iv_ruleInt0= ruleInt0 EOF )
            // InternalRos.g:4199:2: iv_ruleInt0= ruleInt0 EOF
            {
             newCompositeNode(grammarAccess.getInt0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInt0=ruleInt0();

            state._fsp--;

             current =iv_ruleInt0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInt0"


    // $ANTLR start "ruleInt0"
    // InternalRos.g:4205:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4211:2: (kw= 'Int' )
            // InternalRos.g:4212:2: kw= 'Int'
            {
            kw=(Token)match(input,81,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getInt0Access().getIntKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInt0"


    // $ANTLR start "entryRuleDouble"
    // InternalRos.g:4220:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalRos.g:4220:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalRos.g:4221:2: iv_ruleDouble= ruleDouble EOF
            {
             newCompositeNode(grammarAccess.getDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble=ruleDouble();

            state._fsp--;

             current =iv_ruleDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDouble"


    // $ANTLR start "ruleDouble"
    // InternalRos.g:4227:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Double' ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4233:2: (kw= 'Double' )
            // InternalRos.g:4234:2: kw= 'Double'
            {
            kw=(Token)match(input,82,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDoubleAccess().getDoubleKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble"


    // $ANTLR start "entryRuleBoolean"
    // InternalRos.g:4242:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalRos.g:4242:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalRos.g:4243:2: iv_ruleBoolean= ruleBoolean EOF
            {
             newCompositeNode(grammarAccess.getBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;

             current =iv_ruleBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalRos.g:4249:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4255:2: (kw= 'Boolean' )
            // InternalRos.g:4256:2: kw= 'Boolean'
            {
            kw=(Token)match(input,83,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getBooleanAccess().getBooleanKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalRos.g:4264:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRos.g:4264:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRos.g:4265:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalRos.g:4271:1: ruleParameterStructMember returns [EObject current=null] : (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) ;
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
            // InternalRos.g:4277:2: ( (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) )
            // InternalRos.g:4278:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            {
            // InternalRos.g:4278:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            // InternalRos.g:4279:3: otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructMemberAccess().getParameterStructMemberKeyword_0());
            		
            // InternalRos.g:4283:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos.g:4284:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos.g:4284:4: (lv_name_1_0= ruleEString )
            // InternalRos.g:4285:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,71,FOLLOW_64); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterStructMemberAccess().getValueKeyword_3());
            		
            // InternalRos.g:4310:3: ( (lv_value_4_0= ruleParameterValue ) )
            // InternalRos.g:4311:4: (lv_value_4_0= ruleParameterValue )
            {
            // InternalRos.g:4311:4: (lv_value_4_0= ruleParameterValue )
            // InternalRos.g:4312:5: lv_value_4_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRuleDateTime"
    // InternalRos.g:4337:1: entryRuleDateTime returns [String current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final String entryRuleDateTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime = null;


        try {
            // InternalRos.g:4337:48: (iv_ruleDateTime= ruleDateTime EOF )
            // InternalRos.g:4338:2: iv_ruleDateTime= ruleDateTime EOF
            {
             newCompositeNode(grammarAccess.getDateTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateTime=ruleDateTime();

            state._fsp--;

             current =iv_ruleDateTime.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDateTime"


    // $ANTLR start "ruleDateTime"
    // InternalRos.g:4344:1: ruleDateTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DateTime' ;
    public final AntlrDatatypeRuleToken ruleDateTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4350:2: (kw= 'DateTime' )
            // InternalRos.g:4351:2: kw= 'DateTime'
            {
            kw=(Token)match(input,85,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getDateTimeAccess().getDateTimeKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTime"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalRos.g:4359:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRos.g:4359:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRos.g:4360:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
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
    // InternalRos.g:4366:1: ruleParameterStructTypeMember returns [EObject current=null] : (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_default_6_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4372:2: ( (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' ) )
            // InternalRos.g:4373:2: (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' )
            {
            // InternalRos.g:4373:2: (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' )
            // InternalRos.g:4374:3: otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructTypeMemberAccess().getParameterStructTypeMemberKeyword_0());
            		
            // InternalRos.g:4378:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos.g:4379:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos.g:4379:4: (lv_name_1_0= ruleEString )
            // InternalRos.g:4380:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.fraunhofer.ipa.ros.Ros.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,52,FOLLOW_48); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterStructTypeMemberAccess().getTypeKeyword_3());
            		
            // InternalRos.g:4405:3: ( (lv_type_4_0= ruleParameterType ) )
            // InternalRos.g:4406:4: (lv_type_4_0= ruleParameterType )
            {
            // InternalRos.g:4406:4: (lv_type_4_0= ruleParameterType )
            // InternalRos.g:4407:5: lv_type_4_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_52);
            lv_type_4_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"de.fraunhofer.ipa.ros.Ros.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:4424:3: (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==59) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalRos.g:4425:4: otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) )
                    {
                    otherlv_5=(Token)match(input,59,FOLLOW_72); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterStructTypeMemberAccess().getDefaultKeyword_5_0());
                    			
                    // InternalRos.g:4429:4: ( (lv_default_6_0= ruleParameterStruct ) )
                    // InternalRos.g:4430:5: (lv_default_6_0= ruleParameterStruct )
                    {
                    // InternalRos.g:4430:5: (lv_default_6_0= ruleParameterStruct )
                    // InternalRos.g:4431:6: lv_default_6_0= ruleParameterStruct
                    {

                    						newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getDefaultParameterStructParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_default_6_0=ruleParameterStruct();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_6_0,
                    							"de.fraunhofer.ipa.ros.Ros.ParameterStruct");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getParameterStructTypeMemberAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRulePackageDependency"
    // InternalRos.g:4457:1: entryRulePackageDependency returns [EObject current=null] : iv_rulePackageDependency= rulePackageDependency EOF ;
    public final EObject entryRulePackageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDependency = null;


        try {
            // InternalRos.g:4457:58: (iv_rulePackageDependency= rulePackageDependency EOF )
            // InternalRos.g:4458:2: iv_rulePackageDependency= rulePackageDependency EOF
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
    // InternalRos.g:4464:1: rulePackageDependency returns [EObject current=null] : (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject rulePackageDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRos.g:4470:2: ( (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalRos.g:4471:2: (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRos.g:4471:2: (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalRos.g:4472:3: otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDependencyAccess().getPackageDependencyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_73); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageDependencyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDependencyAccess().getPackageKeyword_2());
            		
            // InternalRos.g:4484:3: ( ( ruleEString ) )
            // InternalRos.g:4485:4: ( ruleEString )
            {
            // InternalRos.g:4485:4: ( ruleEString )
            // InternalRos.g:4486:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPackageDependencyRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPackageDependencyAccess().getPackagePackageCrossReference_3_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPackageDependencyAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:4508:1: entryRuleExternalDependency returns [EObject current=null] : iv_ruleExternalDependency= ruleExternalDependency EOF ;
    public final EObject entryRuleExternalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDependency = null;


        try {
            // InternalRos.g:4508:59: (iv_ruleExternalDependency= ruleExternalDependency EOF )
            // InternalRos.g:4509:2: iv_ruleExternalDependency= ruleExternalDependency EOF
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
    // InternalRos.g:4515:1: ruleExternalDependency returns [EObject current=null] : ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4521:2: ( ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRos.g:4522:2: ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRos.g:4522:2: ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRos.g:4523:3: () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRos.g:4523:3: ()
            // InternalRos.g:4524:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,88,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1());
            		
            // InternalRos.g:4534:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:4535:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:4535:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:4536:5: lv_name_2_0= ruleEString
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


    // $ANTLR start "entryRuleMessagePart"
    // InternalRos.g:4557:1: entryRuleMessagePart returns [EObject current=null] : iv_ruleMessagePart= ruleMessagePart EOF ;
    public final EObject entryRuleMessagePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessagePart = null;


        try {
            // InternalRos.g:4557:52: (iv_ruleMessagePart= ruleMessagePart EOF )
            // InternalRos.g:4558:2: iv_ruleMessagePart= ruleMessagePart EOF
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
    // InternalRos.g:4564:1: ruleMessagePart returns [EObject current=null] : ( ( (lv_Type_0_0= ruleAbstractType ) ) ( (lv_Data_1_0= ruleEString ) ) ) ;
    public final EObject ruleMessagePart() throws RecognitionException {
        EObject current = null;

        EObject lv_Type_0_0 = null;

        AntlrDatatypeRuleToken lv_Data_1_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4570:2: ( ( ( (lv_Type_0_0= ruleAbstractType ) ) ( (lv_Data_1_0= ruleEString ) ) ) )
            // InternalRos.g:4571:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( (lv_Data_1_0= ruleEString ) ) )
            {
            // InternalRos.g:4571:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( (lv_Data_1_0= ruleEString ) ) )
            // InternalRos.g:4572:3: ( (lv_Type_0_0= ruleAbstractType ) ) ( (lv_Data_1_0= ruleEString ) )
            {
            // InternalRos.g:4572:3: ( (lv_Type_0_0= ruleAbstractType ) )
            // InternalRos.g:4573:4: (lv_Type_0_0= ruleAbstractType )
            {
            // InternalRos.g:4573:4: (lv_Type_0_0= ruleAbstractType )
            // InternalRos.g:4574:5: lv_Type_0_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getMessagePartAccess().getTypeAbstractTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalRos.g:4591:3: ( (lv_Data_1_0= ruleEString ) )
            // InternalRos.g:4592:4: (lv_Data_1_0= ruleEString )
            {
            // InternalRos.g:4592:4: (lv_Data_1_0= ruleEString )
            // InternalRos.g:4593:5: lv_Data_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMessagePartAccess().getDataEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_Data_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessagePartRule());
            					}
            					set(
            						current,
            						"Data",
            						lv_Data_1_0,
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
    // $ANTLR end "ruleMessagePart"


    // $ANTLR start "entryRuleAbstractType"
    // InternalRos.g:4614:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalRos.g:4614:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalRos.g:4615:2: iv_ruleAbstractType= ruleAbstractType EOF
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
    // InternalRos.g:4621:1: ruleAbstractType returns [EObject current=null] : (this_TopicSpecRef_0= ruleTopicSpecRef | this_bool_1= rulebool | this_int8_2= ruleint8 | this_uint8_3= ruleuint8 | this_int16_4= ruleint16 | this_uint16_5= ruleuint16 | this_int32_6= ruleint32 | this_uint32_7= ruleuint32 | this_int64_8= ruleint64 | this_uint64_9= ruleuint64 | this_float32_10= rulefloat32 | this_float64_11= rulefloat64 | this_string0_12= rulestring0 | this_time_13= ruletime | this_duration_14= ruleduration | this_boolArray_15= ruleboolArray | this_int8Array_16= ruleint8Array | this_uint8Array_17= ruleuint8Array | this_int16Array_18= ruleint16Array | this_uint16Array_19= ruleuint16Array | this_int32Array_20= ruleint32Array | this_uint32Array_21= ruleuint32Array | this_int64Array_22= ruleint64Array | this_uint64Array_23= ruleuint64Array | this_float32Array_24= rulefloat32Array | this_float64Array_25= rulefloat64Array | this_string0Array_26= rulestring0Array ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject this_TopicSpecRef_0 = null;

        EObject this_bool_1 = null;

        EObject this_int8_2 = null;

        EObject this_uint8_3 = null;

        EObject this_int16_4 = null;

        EObject this_uint16_5 = null;

        EObject this_int32_6 = null;

        EObject this_uint32_7 = null;

        EObject this_int64_8 = null;

        EObject this_uint64_9 = null;

        EObject this_float32_10 = null;

        EObject this_float64_11 = null;

        EObject this_string0_12 = null;

        EObject this_time_13 = null;

        EObject this_duration_14 = null;

        EObject this_boolArray_15 = null;

        EObject this_int8Array_16 = null;

        EObject this_uint8Array_17 = null;

        EObject this_int16Array_18 = null;

        EObject this_uint16Array_19 = null;

        EObject this_int32Array_20 = null;

        EObject this_uint32Array_21 = null;

        EObject this_int64Array_22 = null;

        EObject this_uint64Array_23 = null;

        EObject this_float32Array_24 = null;

        EObject this_float64Array_25 = null;

        EObject this_string0Array_26 = null;



        	enterRule();

        try {
            // InternalRos.g:4627:2: ( (this_TopicSpecRef_0= ruleTopicSpecRef | this_bool_1= rulebool | this_int8_2= ruleint8 | this_uint8_3= ruleuint8 | this_int16_4= ruleint16 | this_uint16_5= ruleuint16 | this_int32_6= ruleint32 | this_uint32_7= ruleuint32 | this_int64_8= ruleint64 | this_uint64_9= ruleuint64 | this_float32_10= rulefloat32 | this_float64_11= rulefloat64 | this_string0_12= rulestring0 | this_time_13= ruletime | this_duration_14= ruleduration | this_boolArray_15= ruleboolArray | this_int8Array_16= ruleint8Array | this_uint8Array_17= ruleuint8Array | this_int16Array_18= ruleint16Array | this_uint16Array_19= ruleuint16Array | this_int32Array_20= ruleint32Array | this_uint32Array_21= ruleuint32Array | this_int64Array_22= ruleint64Array | this_uint64Array_23= ruleuint64Array | this_float32Array_24= rulefloat32Array | this_float64Array_25= rulefloat64Array | this_string0Array_26= rulestring0Array ) )
            // InternalRos.g:4628:2: (this_TopicSpecRef_0= ruleTopicSpecRef | this_bool_1= rulebool | this_int8_2= ruleint8 | this_uint8_3= ruleuint8 | this_int16_4= ruleint16 | this_uint16_5= ruleuint16 | this_int32_6= ruleint32 | this_uint32_7= ruleuint32 | this_int64_8= ruleint64 | this_uint64_9= ruleuint64 | this_float32_10= rulefloat32 | this_float64_11= rulefloat64 | this_string0_12= rulestring0 | this_time_13= ruletime | this_duration_14= ruleduration | this_boolArray_15= ruleboolArray | this_int8Array_16= ruleint8Array | this_uint8Array_17= ruleuint8Array | this_int16Array_18= ruleint16Array | this_uint16Array_19= ruleuint16Array | this_int32Array_20= ruleint32Array | this_uint32Array_21= ruleuint32Array | this_int64Array_22= ruleint64Array | this_uint64Array_23= ruleuint64Array | this_float32Array_24= rulefloat32Array | this_float64Array_25= rulefloat64Array | this_string0Array_26= rulestring0Array )
            {
            // InternalRos.g:4628:2: (this_TopicSpecRef_0= ruleTopicSpecRef | this_bool_1= rulebool | this_int8_2= ruleint8 | this_uint8_3= ruleuint8 | this_int16_4= ruleint16 | this_uint16_5= ruleuint16 | this_int32_6= ruleint32 | this_uint32_7= ruleuint32 | this_int64_8= ruleint64 | this_uint64_9= ruleuint64 | this_float32_10= rulefloat32 | this_float64_11= rulefloat64 | this_string0_12= rulestring0 | this_time_13= ruletime | this_duration_14= ruleduration | this_boolArray_15= ruleboolArray | this_int8Array_16= ruleint8Array | this_uint8Array_17= ruleuint8Array | this_int16Array_18= ruleint16Array | this_uint16Array_19= ruleuint16Array | this_int32Array_20= ruleint32Array | this_uint32Array_21= ruleuint32Array | this_int64Array_22= ruleint64Array | this_uint64Array_23= ruleuint64Array | this_float32Array_24= rulefloat32Array | this_float64Array_25= rulefloat64Array | this_string0Array_26= rulestring0Array )
            int alt73=27;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt73=1;
                }
                break;
            case 89:
                {
                alt73=2;
                }
                break;
            case 90:
                {
                alt73=3;
                }
                break;
            case 91:
                {
                alt73=4;
                }
                break;
            case 92:
                {
                alt73=5;
                }
                break;
            case 93:
                {
                alt73=6;
                }
                break;
            case 94:
                {
                alt73=7;
                }
                break;
            case 95:
                {
                alt73=8;
                }
                break;
            case 96:
                {
                alt73=9;
                }
                break;
            case 97:
                {
                alt73=10;
                }
                break;
            case 98:
                {
                alt73=11;
                }
                break;
            case 99:
                {
                alt73=12;
                }
                break;
            case 100:
                {
                alt73=13;
                }
                break;
            case 101:
                {
                alt73=14;
                }
                break;
            case 102:
                {
                alt73=15;
                }
                break;
            case 103:
                {
                alt73=16;
                }
                break;
            case 104:
                {
                alt73=17;
                }
                break;
            case 105:
                {
                alt73=18;
                }
                break;
            case 106:
                {
                alt73=19;
                }
                break;
            case 107:
                {
                alt73=20;
                }
                break;
            case 108:
                {
                alt73=21;
                }
                break;
            case 109:
                {
                alt73=22;
                }
                break;
            case 110:
                {
                alt73=23;
                }
                break;
            case 111:
                {
                alt73=24;
                }
                break;
            case 112:
                {
                alt73=25;
                }
                break;
            case 113:
                {
                alt73=26;
                }
                break;
            case 114:
                {
                alt73=27;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalRos.g:4629:3: this_TopicSpecRef_0= ruleTopicSpecRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getTopicSpecRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TopicSpecRef_0=ruleTopicSpecRef();

                    state._fsp--;


                    			current = this_TopicSpecRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:4638:3: this_bool_1= rulebool
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_bool_1=rulebool();

                    state._fsp--;


                    			current = this_bool_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRos.g:4647:3: this_int8_2= ruleint8
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_int8_2=ruleint8();

                    state._fsp--;


                    			current = this_int8_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRos.g:4656:3: this_uint8_3= ruleuint8
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint8_3=ruleuint8();

                    state._fsp--;


                    			current = this_uint8_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRos.g:4665:3: this_int16_4= ruleint16
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_int16_4=ruleint16();

                    state._fsp--;


                    			current = this_int16_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRos.g:4674:3: this_uint16_5= ruleuint16
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint16_5=ruleuint16();

                    state._fsp--;


                    			current = this_uint16_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRos.g:4683:3: this_int32_6= ruleint32
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_int32_6=ruleint32();

                    state._fsp--;


                    			current = this_int32_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRos.g:4692:3: this_uint32_7= ruleuint32
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint32_7=ruleuint32();

                    state._fsp--;


                    			current = this_uint32_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRos.g:4701:3: this_int64_8= ruleint64
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_int64_8=ruleint64();

                    state._fsp--;


                    			current = this_int64_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRos.g:4710:3: this_uint64_9= ruleuint64
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint64_9=ruleuint64();

                    state._fsp--;


                    			current = this_uint64_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalRos.g:4719:3: this_float32_10= rulefloat32
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_float32_10=rulefloat32();

                    state._fsp--;


                    			current = this_float32_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalRos.g:4728:3: this_float64_11= rulefloat64
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_float64_11=rulefloat64();

                    state._fsp--;


                    			current = this_float64_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalRos.g:4737:3: this_string0_12= rulestring0
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_string0_12=rulestring0();

                    state._fsp--;


                    			current = this_string0_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalRos.g:4746:3: this_time_13= ruletime
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
                    // InternalRos.g:4755:3: this_duration_14= ruleduration
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
                    // InternalRos.g:4764:3: this_boolArray_15= ruleboolArray
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_boolArray_15=ruleboolArray();

                    state._fsp--;


                    			current = this_boolArray_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalRos.g:4773:3: this_int8Array_16= ruleint8Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_int8Array_16=ruleint8Array();

                    state._fsp--;


                    			current = this_int8Array_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalRos.g:4782:3: this_uint8Array_17= ruleuint8Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint8Array_17=ruleuint8Array();

                    state._fsp--;


                    			current = this_uint8Array_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalRos.g:4791:3: this_int16Array_18= ruleint16Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_int16Array_18=ruleint16Array();

                    state._fsp--;


                    			current = this_int16Array_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalRos.g:4800:3: this_uint16Array_19= ruleuint16Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint16Array_19=ruleuint16Array();

                    state._fsp--;


                    			current = this_uint16Array_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalRos.g:4809:3: this_int32Array_20= ruleint32Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_int32Array_20=ruleint32Array();

                    state._fsp--;


                    			current = this_int32Array_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalRos.g:4818:3: this_uint32Array_21= ruleuint32Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint32Array_21=ruleuint32Array();

                    state._fsp--;


                    			current = this_uint32Array_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 23 :
                    // InternalRos.g:4827:3: this_int64Array_22= ruleint64Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_22());
                    		
                    pushFollow(FOLLOW_2);
                    this_int64Array_22=ruleint64Array();

                    state._fsp--;


                    			current = this_int64Array_22;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 24 :
                    // InternalRos.g:4836:3: this_uint64Array_23= ruleuint64Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_23());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint64Array_23=ruleuint64Array();

                    state._fsp--;


                    			current = this_uint64Array_23;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 25 :
                    // InternalRos.g:4845:3: this_float32Array_24= rulefloat32Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_24());
                    		
                    pushFollow(FOLLOW_2);
                    this_float32Array_24=rulefloat32Array();

                    state._fsp--;


                    			current = this_float32Array_24;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 26 :
                    // InternalRos.g:4854:3: this_float64Array_25= rulefloat64Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_25());
                    		
                    pushFollow(FOLLOW_2);
                    this_float64Array_25=rulefloat64Array();

                    state._fsp--;


                    			current = this_float64Array_25;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 27 :
                    // InternalRos.g:4863:3: this_string0Array_26= rulestring0Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_26());
                    		
                    pushFollow(FOLLOW_2);
                    this_string0Array_26=rulestring0Array();

                    state._fsp--;


                    			current = this_string0Array_26;
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


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalRos.g:4875:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalRos.g:4875:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalRos.g:4876:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
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
    // InternalRos.g:4882:1: ruleMessageDefinition returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_MessagePart_2_0 = null;

        EObject lv_MessagePart_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4888:2: ( ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' ) )
            // InternalRos.g:4889:2: ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' )
            {
            // InternalRos.g:4889:2: ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' )
            // InternalRos.g:4890:3: () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}'
            {
            // InternalRos.g:4890:3: ()
            // InternalRos.g:4891:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRos.g:4901:3: ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=RULE_STRING && LA75_0<=RULE_ID)||(LA75_0>=89 && LA75_0<=114)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalRos.g:4902:4: ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )*
                    {
                    // InternalRos.g:4902:4: ( (lv_MessagePart_2_0= ruleMessagePart ) )
                    // InternalRos.g:4903:5: (lv_MessagePart_2_0= ruleMessagePart )
                    {
                    // InternalRos.g:4903:5: (lv_MessagePart_2_0= ruleMessagePart )
                    // InternalRos.g:4904:6: lv_MessagePart_2_0= ruleMessagePart
                    {

                    						newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_74);
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

                    // InternalRos.g:4921:4: ( (lv_MessagePart_3_0= ruleMessagePart ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( ((LA74_0>=RULE_STRING && LA74_0<=RULE_ID)||(LA74_0>=89 && LA74_0<=114)) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalRos.g:4922:5: (lv_MessagePart_3_0= ruleMessagePart )
                    	    {
                    	    // InternalRos.g:4922:5: (lv_MessagePart_3_0= ruleMessagePart )
                    	    // InternalRos.g:4923:6: lv_MessagePart_3_0= ruleMessagePart
                    	    {

                    	    						newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_74);
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
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

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


    // $ANTLR start "entryRulebool"
    // InternalRos.g:4949:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalRos.g:4949:45: (iv_rulebool= rulebool EOF )
            // InternalRos.g:4950:2: iv_rulebool= rulebool EOF
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
    // InternalRos.g:4956:1: rulebool returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4962:2: ( ( () otherlv_1= 'bool' ) )
            // InternalRos.g:4963:2: ( () otherlv_1= 'bool' )
            {
            // InternalRos.g:4963:2: ( () otherlv_1= 'bool' )
            // InternalRos.g:4964:3: () otherlv_1= 'bool'
            {
            // InternalRos.g:4964:3: ()
            // InternalRos.g:4965:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_2); 

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
    // InternalRos.g:4979:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalRos.g:4979:45: (iv_ruleint8= ruleint8 EOF )
            // InternalRos.g:4980:2: iv_ruleint8= ruleint8 EOF
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
    // InternalRos.g:4986:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= 'int8' ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:4992:2: ( ( () otherlv_1= 'int8' ) )
            // InternalRos.g:4993:2: ( () otherlv_1= 'int8' )
            {
            // InternalRos.g:4993:2: ( () otherlv_1= 'int8' )
            // InternalRos.g:4994:3: () otherlv_1= 'int8'
            {
            // InternalRos.g:4994:3: ()
            // InternalRos.g:4995:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt8Access().getInt8Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_2); 

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
    // InternalRos.g:5009:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalRos.g:5009:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalRos.g:5010:2: iv_ruleuint8= ruleuint8 EOF
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
    // InternalRos.g:5016:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= 'uint8' ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5022:2: ( ( () otherlv_1= 'uint8' ) )
            // InternalRos.g:5023:2: ( () otherlv_1= 'uint8' )
            {
            // InternalRos.g:5023:2: ( () otherlv_1= 'uint8' )
            // InternalRos.g:5024:3: () otherlv_1= 'uint8'
            {
            // InternalRos.g:5024:3: ()
            // InternalRos.g:5025:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint8Access().getUint8Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,91,FOLLOW_2); 

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
    // InternalRos.g:5039:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalRos.g:5039:46: (iv_ruleint16= ruleint16 EOF )
            // InternalRos.g:5040:2: iv_ruleint16= ruleint16 EOF
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
    // InternalRos.g:5046:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= 'int16' ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5052:2: ( ( () otherlv_1= 'int16' ) )
            // InternalRos.g:5053:2: ( () otherlv_1= 'int16' )
            {
            // InternalRos.g:5053:2: ( () otherlv_1= 'int16' )
            // InternalRos.g:5054:3: () otherlv_1= 'int16'
            {
            // InternalRos.g:5054:3: ()
            // InternalRos.g:5055:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt16Access().getInt16Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,92,FOLLOW_2); 

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
    // InternalRos.g:5069:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalRos.g:5069:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalRos.g:5070:2: iv_ruleuint16= ruleuint16 EOF
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
    // InternalRos.g:5076:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= 'uint16' ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5082:2: ( ( () otherlv_1= 'uint16' ) )
            // InternalRos.g:5083:2: ( () otherlv_1= 'uint16' )
            {
            // InternalRos.g:5083:2: ( () otherlv_1= 'uint16' )
            // InternalRos.g:5084:3: () otherlv_1= 'uint16'
            {
            // InternalRos.g:5084:3: ()
            // InternalRos.g:5085:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint16Access().getUint16Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,93,FOLLOW_2); 

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
    // InternalRos.g:5099:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalRos.g:5099:46: (iv_ruleint32= ruleint32 EOF )
            // InternalRos.g:5100:2: iv_ruleint32= ruleint32 EOF
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
    // InternalRos.g:5106:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= 'int32' ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5112:2: ( ( () otherlv_1= 'int32' ) )
            // InternalRos.g:5113:2: ( () otherlv_1= 'int32' )
            {
            // InternalRos.g:5113:2: ( () otherlv_1= 'int32' )
            // InternalRos.g:5114:3: () otherlv_1= 'int32'
            {
            // InternalRos.g:5114:3: ()
            // InternalRos.g:5115:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt32Access().getInt32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,94,FOLLOW_2); 

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
    // InternalRos.g:5129:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalRos.g:5129:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalRos.g:5130:2: iv_ruleuint32= ruleuint32 EOF
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
    // InternalRos.g:5136:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= 'uint32' ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5142:2: ( ( () otherlv_1= 'uint32' ) )
            // InternalRos.g:5143:2: ( () otherlv_1= 'uint32' )
            {
            // InternalRos.g:5143:2: ( () otherlv_1= 'uint32' )
            // InternalRos.g:5144:3: () otherlv_1= 'uint32'
            {
            // InternalRos.g:5144:3: ()
            // InternalRos.g:5145:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint32Access().getUint32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,95,FOLLOW_2); 

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
    // InternalRos.g:5159:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalRos.g:5159:46: (iv_ruleint64= ruleint64 EOF )
            // InternalRos.g:5160:2: iv_ruleint64= ruleint64 EOF
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
    // InternalRos.g:5166:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= 'int64' ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5172:2: ( ( () otherlv_1= 'int64' ) )
            // InternalRos.g:5173:2: ( () otherlv_1= 'int64' )
            {
            // InternalRos.g:5173:2: ( () otherlv_1= 'int64' )
            // InternalRos.g:5174:3: () otherlv_1= 'int64'
            {
            // InternalRos.g:5174:3: ()
            // InternalRos.g:5175:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt64Access().getInt64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,96,FOLLOW_2); 

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
    // InternalRos.g:5189:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalRos.g:5189:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalRos.g:5190:2: iv_ruleuint64= ruleuint64 EOF
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
    // InternalRos.g:5196:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= 'uint64' ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5202:2: ( ( () otherlv_1= 'uint64' ) )
            // InternalRos.g:5203:2: ( () otherlv_1= 'uint64' )
            {
            // InternalRos.g:5203:2: ( () otherlv_1= 'uint64' )
            // InternalRos.g:5204:3: () otherlv_1= 'uint64'
            {
            // InternalRos.g:5204:3: ()
            // InternalRos.g:5205:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint64Access().getUint64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,97,FOLLOW_2); 

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
    // InternalRos.g:5219:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalRos.g:5219:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalRos.g:5220:2: iv_rulefloat32= rulefloat32 EOF
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
    // InternalRos.g:5226:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= 'float32' ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5232:2: ( ( () otherlv_1= 'float32' ) )
            // InternalRos.g:5233:2: ( () otherlv_1= 'float32' )
            {
            // InternalRos.g:5233:2: ( () otherlv_1= 'float32' )
            // InternalRos.g:5234:3: () otherlv_1= 'float32'
            {
            // InternalRos.g:5234:3: ()
            // InternalRos.g:5235:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat32Access().getFloat32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_2); 

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
    // InternalRos.g:5249:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalRos.g:5249:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalRos.g:5250:2: iv_rulefloat64= rulefloat64 EOF
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
    // InternalRos.g:5256:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= 'float64' ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5262:2: ( ( () otherlv_1= 'float64' ) )
            // InternalRos.g:5263:2: ( () otherlv_1= 'float64' )
            {
            // InternalRos.g:5263:2: ( () otherlv_1= 'float64' )
            // InternalRos.g:5264:3: () otherlv_1= 'float64'
            {
            // InternalRos.g:5264:3: ()
            // InternalRos.g:5265:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat64Access().getFloat64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_2); 

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
    // InternalRos.g:5279:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalRos.g:5279:48: (iv_rulestring0= rulestring0 EOF )
            // InternalRos.g:5280:2: iv_rulestring0= rulestring0 EOF
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
    // InternalRos.g:5286:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5292:2: ( ( () otherlv_1= 'string' ) )
            // InternalRos.g:5293:2: ( () otherlv_1= 'string' )
            {
            // InternalRos.g:5293:2: ( () otherlv_1= 'string' )
            // InternalRos.g:5294:3: () otherlv_1= 'string'
            {
            // InternalRos.g:5294:3: ()
            // InternalRos.g:5295:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_2); 

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


    // $ANTLR start "entryRuletime"
    // InternalRos.g:5309:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalRos.g:5309:45: (iv_ruletime= ruletime EOF )
            // InternalRos.g:5310:2: iv_ruletime= ruletime EOF
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
    // InternalRos.g:5316:1: ruletime returns [EObject current=null] : ( () otherlv_1= 'time' ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5322:2: ( ( () otherlv_1= 'time' ) )
            // InternalRos.g:5323:2: ( () otherlv_1= 'time' )
            {
            // InternalRos.g:5323:2: ( () otherlv_1= 'time' )
            // InternalRos.g:5324:3: () otherlv_1= 'time'
            {
            // InternalRos.g:5324:3: ()
            // InternalRos.g:5325:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeAccess().getTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,101,FOLLOW_2); 

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
    // InternalRos.g:5339:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalRos.g:5339:49: (iv_ruleduration= ruleduration EOF )
            // InternalRos.g:5340:2: iv_ruleduration= ruleduration EOF
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
    // InternalRos.g:5346:1: ruleduration returns [EObject current=null] : ( () otherlv_1= 'duration' ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5352:2: ( ( () otherlv_1= 'duration' ) )
            // InternalRos.g:5353:2: ( () otherlv_1= 'duration' )
            {
            // InternalRos.g:5353:2: ( () otherlv_1= 'duration' )
            // InternalRos.g:5354:3: () otherlv_1= 'duration'
            {
            // InternalRos.g:5354:3: ()
            // InternalRos.g:5355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_2); 

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
    // InternalRos.g:5369:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalRos.g:5369:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalRos.g:5370:2: iv_ruleboolArray= ruleboolArray EOF
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
    // InternalRos.g:5376:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= 'bool[]' ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5382:2: ( ( () otherlv_1= 'bool[]' ) )
            // InternalRos.g:5383:2: ( () otherlv_1= 'bool[]' )
            {
            // InternalRos.g:5383:2: ( () otherlv_1= 'bool[]' )
            // InternalRos.g:5384:3: () otherlv_1= 'bool[]'
            {
            // InternalRos.g:5384:3: ()
            // InternalRos.g:5385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolArrayAccess().getBoolArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_2); 

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
    // InternalRos.g:5399:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalRos.g:5399:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalRos.g:5400:2: iv_ruleint8Array= ruleint8Array EOF
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
    // InternalRos.g:5406:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= 'int8[]' ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5412:2: ( ( () otherlv_1= 'int8[]' ) )
            // InternalRos.g:5413:2: ( () otherlv_1= 'int8[]' )
            {
            // InternalRos.g:5413:2: ( () otherlv_1= 'int8[]' )
            // InternalRos.g:5414:3: () otherlv_1= 'int8[]'
            {
            // InternalRos.g:5414:3: ()
            // InternalRos.g:5415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,104,FOLLOW_2); 

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
    // InternalRos.g:5429:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalRos.g:5429:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalRos.g:5430:2: iv_ruleuint8Array= ruleuint8Array EOF
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
    // InternalRos.g:5436:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= 'uint8[]' ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5442:2: ( ( () otherlv_1= 'uint8[]' ) )
            // InternalRos.g:5443:2: ( () otherlv_1= 'uint8[]' )
            {
            // InternalRos.g:5443:2: ( () otherlv_1= 'uint8[]' )
            // InternalRos.g:5444:3: () otherlv_1= 'uint8[]'
            {
            // InternalRos.g:5444:3: ()
            // InternalRos.g:5445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_2); 

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
    // InternalRos.g:5459:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalRos.g:5459:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalRos.g:5460:2: iv_ruleint16Array= ruleint16Array EOF
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
    // InternalRos.g:5466:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= 'int16[]' ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5472:2: ( ( () otherlv_1= 'int16[]' ) )
            // InternalRos.g:5473:2: ( () otherlv_1= 'int16[]' )
            {
            // InternalRos.g:5473:2: ( () otherlv_1= 'int16[]' )
            // InternalRos.g:5474:3: () otherlv_1= 'int16[]'
            {
            // InternalRos.g:5474:3: ()
            // InternalRos.g:5475:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,106,FOLLOW_2); 

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
    // InternalRos.g:5489:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalRos.g:5489:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalRos.g:5490:2: iv_ruleuint16Array= ruleuint16Array EOF
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
    // InternalRos.g:5496:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= 'uint16[]' ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5502:2: ( ( () otherlv_1= 'uint16[]' ) )
            // InternalRos.g:5503:2: ( () otherlv_1= 'uint16[]' )
            {
            // InternalRos.g:5503:2: ( () otherlv_1= 'uint16[]' )
            // InternalRos.g:5504:3: () otherlv_1= 'uint16[]'
            {
            // InternalRos.g:5504:3: ()
            // InternalRos.g:5505:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,107,FOLLOW_2); 

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
    // InternalRos.g:5519:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalRos.g:5519:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalRos.g:5520:2: iv_ruleint32Array= ruleint32Array EOF
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
    // InternalRos.g:5526:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= 'int32[]' ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5532:2: ( ( () otherlv_1= 'int32[]' ) )
            // InternalRos.g:5533:2: ( () otherlv_1= 'int32[]' )
            {
            // InternalRos.g:5533:2: ( () otherlv_1= 'int32[]' )
            // InternalRos.g:5534:3: () otherlv_1= 'int32[]'
            {
            // InternalRos.g:5534:3: ()
            // InternalRos.g:5535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,108,FOLLOW_2); 

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
    // InternalRos.g:5549:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalRos.g:5549:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalRos.g:5550:2: iv_ruleuint32Array= ruleuint32Array EOF
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
    // InternalRos.g:5556:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= 'uint32[]' ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5562:2: ( ( () otherlv_1= 'uint32[]' ) )
            // InternalRos.g:5563:2: ( () otherlv_1= 'uint32[]' )
            {
            // InternalRos.g:5563:2: ( () otherlv_1= 'uint32[]' )
            // InternalRos.g:5564:3: () otherlv_1= 'uint32[]'
            {
            // InternalRos.g:5564:3: ()
            // InternalRos.g:5565:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,109,FOLLOW_2); 

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
    // InternalRos.g:5579:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalRos.g:5579:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalRos.g:5580:2: iv_ruleint64Array= ruleint64Array EOF
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
    // InternalRos.g:5586:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= 'int64[]' ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5592:2: ( ( () otherlv_1= 'int64[]' ) )
            // InternalRos.g:5593:2: ( () otherlv_1= 'int64[]' )
            {
            // InternalRos.g:5593:2: ( () otherlv_1= 'int64[]' )
            // InternalRos.g:5594:3: () otherlv_1= 'int64[]'
            {
            // InternalRos.g:5594:3: ()
            // InternalRos.g:5595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,110,FOLLOW_2); 

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
    // InternalRos.g:5609:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalRos.g:5609:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalRos.g:5610:2: iv_ruleuint64Array= ruleuint64Array EOF
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
    // InternalRos.g:5616:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= 'uint64[]' ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5622:2: ( ( () otherlv_1= 'uint64[]' ) )
            // InternalRos.g:5623:2: ( () otherlv_1= 'uint64[]' )
            {
            // InternalRos.g:5623:2: ( () otherlv_1= 'uint64[]' )
            // InternalRos.g:5624:3: () otherlv_1= 'uint64[]'
            {
            // InternalRos.g:5624:3: ()
            // InternalRos.g:5625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,111,FOLLOW_2); 

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
    // InternalRos.g:5639:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalRos.g:5639:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalRos.g:5640:2: iv_rulefloat32Array= rulefloat32Array EOF
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
    // InternalRos.g:5646:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= 'float32[]' ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5652:2: ( ( () otherlv_1= 'float32[]' ) )
            // InternalRos.g:5653:2: ( () otherlv_1= 'float32[]' )
            {
            // InternalRos.g:5653:2: ( () otherlv_1= 'float32[]' )
            // InternalRos.g:5654:3: () otherlv_1= 'float32[]'
            {
            // InternalRos.g:5654:3: ()
            // InternalRos.g:5655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,112,FOLLOW_2); 

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
    // InternalRos.g:5669:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalRos.g:5669:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalRos.g:5670:2: iv_rulefloat64Array= rulefloat64Array EOF
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
    // InternalRos.g:5676:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= 'float64[]' ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5682:2: ( ( () otherlv_1= 'float64[]' ) )
            // InternalRos.g:5683:2: ( () otherlv_1= 'float64[]' )
            {
            // InternalRos.g:5683:2: ( () otherlv_1= 'float64[]' )
            // InternalRos.g:5684:3: () otherlv_1= 'float64[]'
            {
            // InternalRos.g:5684:3: ()
            // InternalRos.g:5685:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,113,FOLLOW_2); 

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
    // InternalRos.g:5699:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalRos.g:5699:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalRos.g:5700:2: iv_rulestring0Array= rulestring0Array EOF
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
    // InternalRos.g:5706:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= 'string[]' ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5712:2: ( ( () otherlv_1= 'string[]' ) )
            // InternalRos.g:5713:2: ( () otherlv_1= 'string[]' )
            {
            // InternalRos.g:5713:2: ( () otherlv_1= 'string[]' )
            // InternalRos.g:5714:3: () otherlv_1= 'string[]'
            {
            // InternalRos.g:5714:3: ()
            // InternalRos.g:5715:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0ArrayAccess().getStringArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,114,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTopicSpecRef"
    // InternalRos.g:5729:1: entryRuleTopicSpecRef returns [EObject current=null] : iv_ruleTopicSpecRef= ruleTopicSpecRef EOF ;
    public final EObject entryRuleTopicSpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpecRef = null;


        try {
            // InternalRos.g:5729:53: (iv_ruleTopicSpecRef= ruleTopicSpecRef EOF )
            // InternalRos.g:5730:2: iv_ruleTopicSpecRef= ruleTopicSpecRef EOF
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
    // InternalRos.g:5736:1: ruleTopicSpecRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleTopicSpecRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRos.g:5742:2: ( ( ( ruleEString ) ) )
            // InternalRos.g:5743:2: ( ( ruleEString ) )
            {
            // InternalRos.g:5743:2: ( ( ruleEString ) )
            // InternalRos.g:5744:3: ( ruleEString )
            {
            // InternalRos.g:5744:3: ( ruleEString )
            // InternalRos.g:5745:4: ruleEString
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000014800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000468000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000448000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000E0008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000001FC00008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000001F800008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000001F000008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000001E000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000001C000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000018000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x01A0000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010080000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0xD200000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0040000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0C00000000008000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800000000008000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x2000000000008000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000080L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FF40L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000008030L,0x0007FFFFFE000000L});

}