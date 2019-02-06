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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PackageSet'", "'{'", "'package'", "','", "'}'", "'Package'", "'spec'", "'artifact'", "'Artifact'", "'node'", "'CatkinPackage'", "'dependency'", "'ServiceSpec'", "'request'", "'response'", "'TopicSpec'", "'message'", "'ActionSpec'", "'goal'", "'result'", "'feedback'", "'MessageDefinition'", "'Node'", "'name'", "'serviceserver'", "'publisher'", "'subscriber'", "'serviceclient'", "'actionserver'", "'actionclient'", "'parameter'", "'ServiceServer'", "'service'", "'namespace'", "'Publisher'", "'Subscriber'", "'ServiceClient'", "'ActionServer'", "'action'", "'ActionClient'", "'GraphName'", "'Parameter'", "'type'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'ParameterListType'", "'sequence'", "'default'", "'ParameterStructType'", "'parameterstructypetmember'", "'ParameterIntegerType'", "'ParameterStringType'", "'ParameterDoubleType'", "'ParameterDateType'", "'ParameterBooleanType'", "'ParameterBase64Type'", "'ParameterAnyType'", "'ParameterArrayType'", "'ParameterSequence'", "'value'", "'ParameterAny'", "'ParameterString'", "'ParameterBase64'", "'ParameterInteger'", "'ParameterDouble'", "'ParameterBoolean'", "'ParameterStruct'", "'ParameterDate'", "'Base64Binary'", "'Int'", "'Double'", "'Boolean'", "'ParameterStructMember'", "'DateTime'", "'ParameterStructTypeMember'", "'PackageDependency'", "'ExternalDependency'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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

            if ( (LA5_0==88) ) {
                alt5=1;
            }
            else if ( (LA5_0==89) ) {
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
            case 54:
                {
                alt6=1;
                }
                break;
            case 56:
                {
                alt6=2;
                }
                break;
            case 57:
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
            case 58:
                {
                alt7=1;
                }
                break;
            case 61:
                {
                alt7=2;
                }
                break;
            case 63:
                {
                alt7=3;
                }
                break;
            case 64:
                {
                alt7=4;
                }
                break;
            case 65:
                {
                alt7=5;
                }
                break;
            case 66:
                {
                alt7=6;
                }
                break;
            case 67:
                {
                alt7=7;
                }
                break;
            case 68:
                {
                alt7=8;
                }
                break;
            case 69:
                {
                alt7=9;
                }
                break;
            case 70:
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
            case 73:
                {
                alt8=1;
                }
                break;
            case 74:
                {
                alt8=2;
                }
                break;
            case 75:
                {
                alt8=3;
                }
                break;
            case 76:
                {
                alt8=4;
                }
                break;
            case 77:
                {
                alt8=5;
                }
                break;
            case 78:
                {
                alt8=6;
                }
                break;
            case 71:
                {
                alt8=7;
                }
                break;
            case 79:
                {
                alt8=8;
                }
                break;
            case 80:
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
                    otherlv_4=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getServiceSpecAccess().getRequestKeyword_4_0());
                    			
                    // InternalRos.g:1127:4: ( (lv_request_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:1128:5: (lv_request_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1128:5: (lv_request_5_0= ruleMessageDefinition )
                    // InternalRos.g:1129:6: lv_request_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getServiceSpecAccess().getRequestMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_22);
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
                    otherlv_6=(Token)match(input,25,FOLLOW_21); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_23); 

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
                    otherlv_4=(Token)match(input,27,FOLLOW_21); 

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

            otherlv_3=(Token)match(input,12,FOLLOW_24); 

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
                    otherlv_4=(Token)match(input,29,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionSpecAccess().getGoalKeyword_4_0());
                    			
                    // InternalRos.g:1316:4: ( (lv_goal_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:1317:5: (lv_goal_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1317:5: (lv_goal_5_0= ruleMessageDefinition )
                    // InternalRos.g:1318:6: lv_goal_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getGoalMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
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
                    otherlv_6=(Token)match(input,30,FOLLOW_21); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionSpecAccess().getResultKeyword_5_0());
                    			
                    // InternalRos.g:1341:4: ( (lv_result_7_0= ruleMessageDefinition ) )
                    // InternalRos.g:1342:5: (lv_result_7_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1342:5: (lv_result_7_0= ruleMessageDefinition )
                    // InternalRos.g:1343:6: lv_result_7_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getResultMessageDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_26);
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
                    otherlv_8=(Token)match(input,31,FOLLOW_21); 

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


    // $ANTLR start "entryRuleMessageDefinition"
    // InternalRos.g:1394:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalRos.g:1394:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalRos.g:1395:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
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
    // InternalRos.g:1401:1: ruleMessageDefinition returns [EObject current=null] : ( () otherlv_1= 'MessageDefinition' ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:1407:2: ( ( () otherlv_1= 'MessageDefinition' ) )
            // InternalRos.g:1408:2: ( () otherlv_1= 'MessageDefinition' )
            {
            // InternalRos.g:1408:2: ( () otherlv_1= 'MessageDefinition' )
            // InternalRos.g:1409:3: () otherlv_1= 'MessageDefinition'
            {
            // InternalRos.g:1409:3: ()
            // InternalRos.g:1410:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageDefinitionAccess().getMessageDefinitionKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:1424:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRos.g:1424:45: (iv_ruleNode= ruleNode EOF )
            // InternalRos.g:1425:2: iv_ruleNode= ruleNode EOF
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
    // InternalRos.g:1431:1: ruleNode returns [EObject current=null] : (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) ;
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
            // InternalRos.g:1437:2: ( (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' ) )
            // InternalRos.g:1438:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            {
            // InternalRos.g:1438:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}' )
            // InternalRos.g:1439:3: otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )? (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )? (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )? (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )? (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )? (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )? (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )? otherlv_46= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getNameKeyword_2());
            		
            // InternalRos.g:1451:3: ( (lv_name_3_0= ruleRosNames ) )
            // InternalRos.g:1452:4: (lv_name_3_0= ruleRosNames )
            {
            // InternalRos.g:1452:4: (lv_name_3_0= ruleRosNames )
            // InternalRos.g:1453:5: lv_name_3_0= ruleRosNames
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

            // InternalRos.g:1470:3: (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRos.g:1471:4: otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getServiceserverKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_29); 

                    				newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRos.g:1479:4: ( (lv_serviceserver_6_0= ruleServiceServer ) )
                    // InternalRos.g:1480:5: (lv_serviceserver_6_0= ruleServiceServer )
                    {
                    // InternalRos.g:1480:5: (lv_serviceserver_6_0= ruleServiceServer )
                    // InternalRos.g:1481:6: lv_serviceserver_6_0= ruleServiceServer
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

                    // InternalRos.g:1498:4: (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==14) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalRos.g:1499:5: otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_29); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRos.g:1503:5: ( (lv_serviceserver_8_0= ruleServiceServer ) )
                    	    // InternalRos.g:1504:6: (lv_serviceserver_8_0= ruleServiceServer )
                    	    {
                    	    // InternalRos.g:1504:6: (lv_serviceserver_8_0= ruleServiceServer )
                    	    // InternalRos.g:1505:7: lv_serviceserver_8_0= ruleServiceServer
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

                    otherlv_9=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1528:3: (otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRos.g:1529:4: otherlv_10= 'publisher' otherlv_11= '{' ( (lv_publisher_12_0= rulePublisher ) ) (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getPublisherKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRos.g:1537:4: ( (lv_publisher_12_0= rulePublisher ) )
                    // InternalRos.g:1538:5: (lv_publisher_12_0= rulePublisher )
                    {
                    // InternalRos.g:1538:5: (lv_publisher_12_0= rulePublisher )
                    // InternalRos.g:1539:6: lv_publisher_12_0= rulePublisher
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

                    // InternalRos.g:1556:4: (otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalRos.g:1557:5: otherlv_13= ',' ( (lv_publisher_14_0= rulePublisher ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRos.g:1561:5: ( (lv_publisher_14_0= rulePublisher ) )
                    	    // InternalRos.g:1562:6: (lv_publisher_14_0= rulePublisher )
                    	    {
                    	    // InternalRos.g:1562:6: (lv_publisher_14_0= rulePublisher )
                    	    // InternalRos.g:1563:7: lv_publisher_14_0= rulePublisher
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

                    otherlv_15=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1586:3: (otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRos.g:1587:4: otherlv_16= 'subscriber' otherlv_17= '{' ( (lv_subscriber_18_0= ruleSubscriber ) ) (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getSubscriberKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRos.g:1595:4: ( (lv_subscriber_18_0= ruleSubscriber ) )
                    // InternalRos.g:1596:5: (lv_subscriber_18_0= ruleSubscriber )
                    {
                    // InternalRos.g:1596:5: (lv_subscriber_18_0= ruleSubscriber )
                    // InternalRos.g:1597:6: lv_subscriber_18_0= ruleSubscriber
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

                    // InternalRos.g:1614:4: (otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==14) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalRos.g:1615:5: otherlv_19= ',' ( (lv_subscriber_20_0= ruleSubscriber ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_33); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getNodeAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRos.g:1619:5: ( (lv_subscriber_20_0= ruleSubscriber ) )
                    	    // InternalRos.g:1620:6: (lv_subscriber_20_0= ruleSubscriber )
                    	    {
                    	    // InternalRos.g:1620:6: (lv_subscriber_20_0= ruleSubscriber )
                    	    // InternalRos.g:1621:7: lv_subscriber_20_0= ruleSubscriber
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

                    otherlv_21=(Token)match(input,15,FOLLOW_34); 

                    				newLeafNode(otherlv_21, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1644:3: (otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRos.g:1645:4: otherlv_22= 'serviceclient' otherlv_23= '{' ( (lv_serviceclient_24_0= ruleServiceClient ) ) (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getServiceclientKeyword_7_0());
                    			
                    otherlv_23=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_23, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRos.g:1653:4: ( (lv_serviceclient_24_0= ruleServiceClient ) )
                    // InternalRos.g:1654:5: (lv_serviceclient_24_0= ruleServiceClient )
                    {
                    // InternalRos.g:1654:5: (lv_serviceclient_24_0= ruleServiceClient )
                    // InternalRos.g:1655:6: lv_serviceclient_24_0= ruleServiceClient
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

                    // InternalRos.g:1672:4: (otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalRos.g:1673:5: otherlv_25= ',' ( (lv_serviceclient_26_0= ruleServiceClient ) )
                    	    {
                    	    otherlv_25=(Token)match(input,14,FOLLOW_35); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getNodeAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRos.g:1677:5: ( (lv_serviceclient_26_0= ruleServiceClient ) )
                    	    // InternalRos.g:1678:6: (lv_serviceclient_26_0= ruleServiceClient )
                    	    {
                    	    // InternalRos.g:1678:6: (lv_serviceclient_26_0= ruleServiceClient )
                    	    // InternalRos.g:1679:7: lv_serviceclient_26_0= ruleServiceClient
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

                    otherlv_27=(Token)match(input,15,FOLLOW_36); 

                    				newLeafNode(otherlv_27, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1702:3: (otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==39) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRos.g:1703:4: otherlv_28= 'actionserver' otherlv_29= '{' ( (lv_actionserver_30_0= ruleActionServer ) ) (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getNodeAccess().getActionserverKeyword_8_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_37); 

                    				newLeafNode(otherlv_29, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalRos.g:1711:4: ( (lv_actionserver_30_0= ruleActionServer ) )
                    // InternalRos.g:1712:5: (lv_actionserver_30_0= ruleActionServer )
                    {
                    // InternalRos.g:1712:5: (lv_actionserver_30_0= ruleActionServer )
                    // InternalRos.g:1713:6: lv_actionserver_30_0= ruleActionServer
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

                    // InternalRos.g:1730:4: (otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==14) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalRos.g:1731:5: otherlv_31= ',' ( (lv_actionserver_32_0= ruleActionServer ) )
                    	    {
                    	    otherlv_31=(Token)match(input,14,FOLLOW_37); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getNodeAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalRos.g:1735:5: ( (lv_actionserver_32_0= ruleActionServer ) )
                    	    // InternalRos.g:1736:6: (lv_actionserver_32_0= ruleActionServer )
                    	    {
                    	    // InternalRos.g:1736:6: (lv_actionserver_32_0= ruleActionServer )
                    	    // InternalRos.g:1737:7: lv_actionserver_32_0= ruleActionServer
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

                    otherlv_33=(Token)match(input,15,FOLLOW_38); 

                    				newLeafNode(otherlv_33, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1760:3: (otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==40) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalRos.g:1761:4: otherlv_34= 'actionclient' otherlv_35= '{' ( (lv_actionclient_36_0= ruleActionClient ) ) (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_34, grammarAccess.getNodeAccess().getActionclientKeyword_9_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_39); 

                    				newLeafNode(otherlv_35, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalRos.g:1769:4: ( (lv_actionclient_36_0= ruleActionClient ) )
                    // InternalRos.g:1770:5: (lv_actionclient_36_0= ruleActionClient )
                    {
                    // InternalRos.g:1770:5: (lv_actionclient_36_0= ruleActionClient )
                    // InternalRos.g:1771:6: lv_actionclient_36_0= ruleActionClient
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

                    // InternalRos.g:1788:4: (otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalRos.g:1789:5: otherlv_37= ',' ( (lv_actionclient_38_0= ruleActionClient ) )
                    	    {
                    	    otherlv_37=(Token)match(input,14,FOLLOW_39); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getNodeAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRos.g:1793:5: ( (lv_actionclient_38_0= ruleActionClient ) )
                    	    // InternalRos.g:1794:6: (lv_actionclient_38_0= ruleActionClient )
                    	    {
                    	    // InternalRos.g:1794:6: (lv_actionclient_38_0= ruleActionClient )
                    	    // InternalRos.g:1795:7: lv_actionclient_38_0= ruleActionClient
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

                    otherlv_39=(Token)match(input,15,FOLLOW_40); 

                    				newLeafNode(otherlv_39, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:1818:3: (otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalRos.g:1819:4: otherlv_40= 'parameter' otherlv_41= '{' ( (lv_parameter_42_0= ruleParameter ) ) (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_40, grammarAccess.getNodeAccess().getParameterKeyword_10_0());
                    			
                    otherlv_41=(Token)match(input,12,FOLLOW_41); 

                    				newLeafNode(otherlv_41, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalRos.g:1827:4: ( (lv_parameter_42_0= ruleParameter ) )
                    // InternalRos.g:1828:5: (lv_parameter_42_0= ruleParameter )
                    {
                    // InternalRos.g:1828:5: (lv_parameter_42_0= ruleParameter )
                    // InternalRos.g:1829:6: lv_parameter_42_0= ruleParameter
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

                    // InternalRos.g:1846:4: (otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalRos.g:1847:5: otherlv_43= ',' ( (lv_parameter_44_0= ruleParameter ) )
                    	    {
                    	    otherlv_43=(Token)match(input,14,FOLLOW_41); 

                    	    					newLeafNode(otherlv_43, grammarAccess.getNodeAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalRos.g:1851:5: ( (lv_parameter_44_0= ruleParameter ) )
                    	    // InternalRos.g:1852:6: (lv_parameter_44_0= ruleParameter )
                    	    {
                    	    // InternalRos.g:1852:6: (lv_parameter_44_0= ruleParameter )
                    	    // InternalRos.g:1853:7: lv_parameter_44_0= ruleParameter
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
    // InternalRos.g:1884:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRos.g:1884:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRos.g:1885:2: iv_ruleServiceServer= ruleServiceServer EOF
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
    // InternalRos.g:1891:1: ruleServiceServer returns [EObject current=null] : (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:1897:2: ( (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:1898:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:1898:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:1899:3: otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceServerAccess().getServiceServerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getNameKeyword_2());
            		
            // InternalRos.g:1911:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:1912:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:1912:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:1913:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
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

            otherlv_4=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceServerAccess().getServiceKeyword_4());
            		
            // InternalRos.g:1934:3: ( ( ruleEString ) )
            // InternalRos.g:1935:4: ( ruleEString )
            {
            // InternalRos.g:1935:4: ( ruleEString )
            // InternalRos.g:1936:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceServerAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:1950:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==44) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalRos.g:1951:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceServerAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:1955:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:1956:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:1956:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:1957:6: lv_namespace_7_0= ruleNamespace
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
    // InternalRos.g:1983:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRos.g:1983:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRos.g:1984:2: iv_rulePublisher= rulePublisher EOF
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
    // InternalRos.g:1990:1: rulePublisher returns [EObject current=null] : (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:1996:2: ( (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:1997:2: (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:1997:2: (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:1998:3: otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPublisherAccess().getPublisherKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getNameKeyword_2());
            		
            // InternalRos.g:2010:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2011:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2011:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2012:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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
            		
            // InternalRos.g:2033:3: ( ( ruleEString ) )
            // InternalRos.g:2034:4: ( ruleEString )
            {
            // InternalRos.g:2034:4: ( ruleEString )
            // InternalRos.g:2035:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2049:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==44) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalRos.g:2050:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2054:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2055:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2055:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2056:6: lv_namespace_7_0= ruleNamespace
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
    // InternalRos.g:2082:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRos.g:2082:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRos.g:2083:2: iv_ruleSubscriber= ruleSubscriber EOF
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
    // InternalRos.g:2089:1: ruleSubscriber returns [EObject current=null] : (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2095:2: ( (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2096:2: (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2096:2: (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2097:3: otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubscriberAccess().getSubscriberKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getNameKeyword_2());
            		
            // InternalRos.g:2109:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2110:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2110:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2111:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_45);
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
            		
            // InternalRos.g:2132:3: ( ( ruleEString ) )
            // InternalRos.g:2133:4: ( ruleEString )
            {
            // InternalRos.g:2133:4: ( ruleEString )
            // InternalRos.g:2134:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2148:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==44) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalRos.g:2149:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2153:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2154:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2154:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2155:6: lv_namespace_7_0= ruleNamespace
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
    // InternalRos.g:2181:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRos.g:2181:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRos.g:2182:2: iv_ruleServiceClient= ruleServiceClient EOF
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
    // InternalRos.g:2188:1: ruleServiceClient returns [EObject current=null] : (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2194:2: ( (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2195:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2195:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2196:3: otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceClientAccess().getServiceClientKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getNameKeyword_2());
            		
            // InternalRos.g:2208:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2209:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2209:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2210:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceClientAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_42);
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

            otherlv_4=(Token)match(input,43,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceClientAccess().getServiceKeyword_4());
            		
            // InternalRos.g:2231:3: ( ( ruleEString ) )
            // InternalRos.g:2232:4: ( ruleEString )
            {
            // InternalRos.g:2232:4: ( ruleEString )
            // InternalRos.g:2233:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceClientAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2247:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==44) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalRos.g:2248:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2252:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2253:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2253:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2254:6: lv_namespace_7_0= ruleNamespace
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
    // InternalRos.g:2280:1: entryRuleActionServer returns [EObject current=null] : iv_ruleActionServer= ruleActionServer EOF ;
    public final EObject entryRuleActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionServer = null;


        try {
            // InternalRos.g:2280:53: (iv_ruleActionServer= ruleActionServer EOF )
            // InternalRos.g:2281:2: iv_ruleActionServer= ruleActionServer EOF
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
    // InternalRos.g:2287:1: ruleActionServer returns [EObject current=null] : (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2293:2: ( (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2294:2: (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2294:2: (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2295:3: otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionServerAccess().getActionServerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getActionServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getActionServerAccess().getNameKeyword_2());
            		
            // InternalRos.g:2307:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2308:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2308:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2309:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
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

            otherlv_4=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getActionServerAccess().getActionKeyword_4());
            		
            // InternalRos.g:2330:3: ( ( ruleEString ) )
            // InternalRos.g:2331:4: ( ruleEString )
            {
            // InternalRos.g:2331:4: ( ruleEString )
            // InternalRos.g:2332:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionServerAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2346:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==44) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalRos.g:2347:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionServerAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2351:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2352:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2352:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2353:6: lv_namespace_7_0= ruleNamespace
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
    // InternalRos.g:2379:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // InternalRos.g:2379:53: (iv_ruleActionClient= ruleActionClient EOF )
            // InternalRos.g:2380:2: iv_ruleActionClient= ruleActionClient EOF
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
    // InternalRos.g:2386:1: ruleActionClient returns [EObject current=null] : (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2392:2: ( (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2393:2: (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2393:2: (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2394:3: otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionClientAccess().getActionClientKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getActionClientAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getActionClientAccess().getNameKeyword_2());
            		
            // InternalRos.g:2406:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2407:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2407:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2408:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionClientAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_46);
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

            otherlv_4=(Token)match(input,49,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getActionClientAccess().getActionKeyword_4());
            		
            // InternalRos.g:2429:3: ( ( ruleEString ) )
            // InternalRos.g:2430:4: ( ruleEString )
            {
            // InternalRos.g:2430:4: ( ruleEString )
            // InternalRos.g:2431:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionClientAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_43);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2445:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==44) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalRos.g:2446:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2450:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2451:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2451:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2452:6: lv_namespace_7_0= ruleNamespace
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
    // InternalRos.g:2478:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRos.g:2478:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRos.g:2479:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalRos.g:2485:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GraphName' ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:2491:2: (kw= 'GraphName' )
            // InternalRos.g:2492:2: kw= 'GraphName'
            {
            kw=(Token)match(input,51,FOLLOW_2); 

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
    // InternalRos.g:2500:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRos.g:2500:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRos.g:2501:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRos.g:2507:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) ;
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
            // InternalRos.g:2513:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) )
            // InternalRos.g:2514:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            {
            // InternalRos.g:2514:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            // InternalRos.g:2515:3: otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_2());
            		
            // InternalRos.g:2527:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2528:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2528:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2529:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
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

            // InternalRos.g:2546:3: (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==44) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalRos.g:2547:4: otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_44); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getNamespaceKeyword_4_0());
                    			
                    // InternalRos.g:2551:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalRos.g:2552:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalRos.g:2552:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalRos.g:2553:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_48);
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

            otherlv_6=(Token)match(input,53,FOLLOW_49); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getTypeKeyword_5());
            		
            // InternalRos.g:2575:3: ( (lv_type_7_0= ruleParameterType ) )
            // InternalRos.g:2576:4: (lv_type_7_0= ruleParameterType )
            {
            // InternalRos.g:2576:4: (lv_type_7_0= ruleParameterType )
            // InternalRos.g:2577:5: lv_type_7_0= ruleParameterType
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
    // InternalRos.g:2602:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRos.g:2602:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRos.g:2603:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalRos.g:2609:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:2615:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2616:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2616:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2617:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2617:3: ()
            // InternalRos.g:2618:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2632:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==55) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalRos.g:2633:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2641:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2642:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2642:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2643:6: lv_parts_5_0= ruleGraphName
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

                    // InternalRos.g:2660:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==14) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalRos.g:2661:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2665:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2666:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2666:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2667:7: lv_parts_7_0= ruleGraphName
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
    // InternalRos.g:2698:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRos.g:2698:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRos.g:2699:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalRos.g:2705:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:2711:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2712:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2712:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2713:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2713:3: ()
            // InternalRos.g:2714:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2728:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==55) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalRos.g:2729:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2737:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2738:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2738:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2739:6: lv_parts_5_0= ruleGraphName
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

                    // InternalRos.g:2756:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==14) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalRos.g:2757:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2761:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2762:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2762:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2763:7: lv_parts_7_0= ruleGraphName
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
    // InternalRos.g:2794:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRos.g:2794:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRos.g:2795:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalRos.g:2801:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:2807:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:2808:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:2808:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:2809:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:2809:3: ()
            // InternalRos.g:2810:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_50); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2824:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==55) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalRos.g:2825:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_51); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2833:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:2834:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:2834:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:2835:6: lv_parts_5_0= ruleGraphName
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

                    // InternalRos.g:2852:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==14) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalRos.g:2853:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_51); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2857:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:2858:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:2858:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:2859:7: lv_parts_7_0= ruleGraphName
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
    // InternalRos.g:2890:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRos.g:2890:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRos.g:2891:2: iv_ruleParameterListType= ruleParameterListType EOF
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
    // InternalRos.g:2897:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' ) ;
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
            // InternalRos.g:2903:2: ( ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' ) )
            // InternalRos.g:2904:2: ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' )
            {
            // InternalRos.g:2904:2: ( () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}' )
            // InternalRos.g:2905:3: () otherlv_1= 'ParameterListType' otherlv_2= '{' (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )? (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )? otherlv_11= '}'
            {
            // InternalRos.g:2905:3: ()
            // InternalRos.g:2906:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getParameterListTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_52); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:2920:3: (otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==59) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalRos.g:2921:4: otherlv_3= 'sequence' otherlv_4= '{' ( (lv_sequence_5_0= ruleParameterType ) ) (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterListTypeAccess().getSequenceKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_49); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:2929:4: ( (lv_sequence_5_0= ruleParameterType ) )
                    // InternalRos.g:2930:5: (lv_sequence_5_0= ruleParameterType )
                    {
                    // InternalRos.g:2930:5: (lv_sequence_5_0= ruleParameterType )
                    // InternalRos.g:2931:6: lv_sequence_5_0= ruleParameterType
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

                    // InternalRos.g:2948:4: (otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==14) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalRos.g:2949:5: otherlv_6= ',' ( (lv_sequence_7_0= ruleParameterType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_49); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:2953:5: ( (lv_sequence_7_0= ruleParameterType ) )
                    	    // InternalRos.g:2954:6: (lv_sequence_7_0= ruleParameterType )
                    	    {
                    	    // InternalRos.g:2954:6: (lv_sequence_7_0= ruleParameterType )
                    	    // InternalRos.g:2955:7: lv_sequence_7_0= ruleParameterType
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

                    otherlv_8=(Token)match(input,15,FOLLOW_53); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterListTypeAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalRos.g:2978:3: (otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==60) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRos.g:2979:4: otherlv_9= 'default' ( (lv_default_10_0= ruleParameterSequence ) )
                    {
                    otherlv_9=(Token)match(input,60,FOLLOW_54); 

                    				newLeafNode(otherlv_9, grammarAccess.getParameterListTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRos.g:2983:4: ( (lv_default_10_0= ruleParameterSequence ) )
                    // InternalRos.g:2984:5: (lv_default_10_0= ruleParameterSequence )
                    {
                    // InternalRos.g:2984:5: (lv_default_10_0= ruleParameterSequence )
                    // InternalRos.g:2985:6: lv_default_10_0= ruleParameterSequence
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
    // InternalRos.g:3011:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRos.g:3011:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRos.g:3012:2: iv_ruleParameterStructType= ruleParameterStructType EOF
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
    // InternalRos.g:3018:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:3024:2: ( ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:3025:2: ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:3025:2: ( () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:3026:3: () otherlv_1= 'ParameterStructType' otherlv_2= '{' (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:3026:3: ()
            // InternalRos.g:3027:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getParameterStructTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_55); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3041:3: (otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==62) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRos.g:3042:4: otherlv_3= 'parameterstructypetmember' otherlv_4= '{' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,62,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_56); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:3050:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
                    // InternalRos.g:3051:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
                    {
                    // InternalRos.g:3051:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
                    // InternalRos.g:3052:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
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

                    // InternalRos.g:3069:4: (otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==14) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalRos.g:3070:5: otherlv_6= ',' ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_56); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:3074:5: ( (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember ) )
                    	    // InternalRos.g:3075:6: (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember )
                    	    {
                    	    // InternalRos.g:3075:6: (lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember )
                    	    // InternalRos.g:3076:7: lv_parameterstructypetmember_7_0= ruleParameterStructTypeMember
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
    // InternalRos.g:3107:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRos.g:3107:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRos.g:3108:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
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
    // InternalRos.g:3114:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3120:2: ( ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3121:2: ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3121:2: ( () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}' )
            // InternalRos.g:3122:3: () otherlv_1= 'ParameterIntegerType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3122:3: ()
            // InternalRos.g:3123:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,63,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3137:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==60) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRos.g:3138:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) )
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_57); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3142:4: ( (lv_default_4_0= ruleParameterInteger ) )
                    // InternalRos.g:3143:5: (lv_default_4_0= ruleParameterInteger )
                    {
                    // InternalRos.g:3143:5: (lv_default_4_0= ruleParameterInteger )
                    // InternalRos.g:3144:6: lv_default_4_0= ruleParameterInteger
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
    // InternalRos.g:3170:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRos.g:3170:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRos.g:3171:2: iv_ruleParameterStringType= ruleParameterStringType EOF
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
    // InternalRos.g:3177:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3183:2: ( ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3184:2: ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3184:2: ( () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}' )
            // InternalRos.g:3185:3: () otherlv_1= 'ParameterStringType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3185:3: ()
            // InternalRos.g:3186:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getParameterStringTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3200:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==60) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRos.g:3201:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) )
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_58); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3205:4: ( (lv_default_4_0= ruleParameterString ) )
                    // InternalRos.g:3206:5: (lv_default_4_0= ruleParameterString )
                    {
                    // InternalRos.g:3206:5: (lv_default_4_0= ruleParameterString )
                    // InternalRos.g:3207:6: lv_default_4_0= ruleParameterString
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
    // InternalRos.g:3233:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRos.g:3233:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRos.g:3234:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
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
    // InternalRos.g:3240:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3246:2: ( ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3247:2: ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3247:2: ( () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}' )
            // InternalRos.g:3248:3: () otherlv_1= 'ParameterDoubleType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3248:3: ()
            // InternalRos.g:3249:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3263:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==60) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRos.g:3264:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) )
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_59); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3268:4: ( (lv_default_4_0= ruleParameterDouble ) )
                    // InternalRos.g:3269:5: (lv_default_4_0= ruleParameterDouble )
                    {
                    // InternalRos.g:3269:5: (lv_default_4_0= ruleParameterDouble )
                    // InternalRos.g:3270:6: lv_default_4_0= ruleParameterDouble
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
    // InternalRos.g:3296:1: entryRuleParameterDateType returns [EObject current=null] : iv_ruleParameterDateType= ruleParameterDateType EOF ;
    public final EObject entryRuleParameterDateType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDateType = null;


        try {
            // InternalRos.g:3296:58: (iv_ruleParameterDateType= ruleParameterDateType EOF )
            // InternalRos.g:3297:2: iv_ruleParameterDateType= ruleParameterDateType EOF
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
    // InternalRos.g:3303:1: ruleParameterDateType returns [EObject current=null] : ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterDateType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3309:2: ( ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3310:2: ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3310:2: ( () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}' )
            // InternalRos.g:3311:3: () otherlv_1= 'ParameterDateType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3311:3: ()
            // InternalRos.g:3312:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDateTypeAccess().getParameterDateTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDateTypeAccess().getParameterDateTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDateTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3326:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==60) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalRos.g:3327:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDate ) )
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_60); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDateTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3331:4: ( (lv_default_4_0= ruleParameterDate ) )
                    // InternalRos.g:3332:5: (lv_default_4_0= ruleParameterDate )
                    {
                    // InternalRos.g:3332:5: (lv_default_4_0= ruleParameterDate )
                    // InternalRos.g:3333:6: lv_default_4_0= ruleParameterDate
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
    // InternalRos.g:3359:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRos.g:3359:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRos.g:3360:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
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
    // InternalRos.g:3366:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3372:2: ( ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3373:2: ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3373:2: ( () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}' )
            // InternalRos.g:3374:3: () otherlv_1= 'ParameterBooleanType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3374:3: ()
            // InternalRos.g:3375:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,67,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3389:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==60) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRos.g:3390:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) )
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_61); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3394:4: ( (lv_default_4_0= ruleParameterBoolean ) )
                    // InternalRos.g:3395:5: (lv_default_4_0= ruleParameterBoolean )
                    {
                    // InternalRos.g:3395:5: (lv_default_4_0= ruleParameterBoolean )
                    // InternalRos.g:3396:6: lv_default_4_0= ruleParameterBoolean
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
    // InternalRos.g:3422:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRos.g:3422:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRos.g:3423:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
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
    // InternalRos.g:3429:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3435:2: ( ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3436:2: ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3436:2: ( () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}' )
            // InternalRos.g:3437:3: () otherlv_1= 'ParameterBase64Type' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3437:3: ()
            // InternalRos.g:3438:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,68,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3452:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==60) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalRos.g:3453:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) )
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_62); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3457:4: ( (lv_default_4_0= ruleParameterBase64 ) )
                    // InternalRos.g:3458:5: (lv_default_4_0= ruleParameterBase64 )
                    {
                    // InternalRos.g:3458:5: (lv_default_4_0= ruleParameterBase64 )
                    // InternalRos.g:3459:6: lv_default_4_0= ruleParameterBase64
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
    // InternalRos.g:3485:1: entryRuleParameterAnyType returns [EObject current=null] : iv_ruleParameterAnyType= ruleParameterAnyType EOF ;
    public final EObject entryRuleParameterAnyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAnyType = null;


        try {
            // InternalRos.g:3485:57: (iv_ruleParameterAnyType= ruleParameterAnyType EOF )
            // InternalRos.g:3486:2: iv_ruleParameterAnyType= ruleParameterAnyType EOF
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
    // InternalRos.g:3492:1: ruleParameterAnyType returns [EObject current=null] : ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAnyType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3498:2: ( ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3499:2: ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3499:2: ( () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}' )
            // InternalRos.g:3500:3: () otherlv_1= 'ParameterAnyType' otherlv_2= '{' (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3500:3: ()
            // InternalRos.g:3501:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyTypeAccess().getParameterAnyTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyTypeAccess().getParameterAnyTypeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3515:3: (otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==60) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRos.g:3516:4: otherlv_3= 'default' ( (lv_default_4_0= ruleParameterAny ) )
                    {
                    otherlv_3=(Token)match(input,60,FOLLOW_63); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyTypeAccess().getDefaultKeyword_3_0());
                    			
                    // InternalRos.g:3520:4: ( (lv_default_4_0= ruleParameterAny ) )
                    // InternalRos.g:3521:5: (lv_default_4_0= ruleParameterAny )
                    {
                    // InternalRos.g:3521:5: (lv_default_4_0= ruleParameterAny )
                    // InternalRos.g:3522:6: lv_default_4_0= ruleParameterAny
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
    // InternalRos.g:3548:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRos.g:3548:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRos.g:3549:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
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
    // InternalRos.g:3555:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' ) ;
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
            // InternalRos.g:3561:2: ( (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' ) )
            // InternalRos.g:3562:2: (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' )
            {
            // InternalRos.g:3562:2: (otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}' )
            // InternalRos.g:3563:3: otherlv_0= 'ParameterArrayType' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getParameterArrayTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,53,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalRos.g:3575:3: ( (lv_type_3_0= ruleParameterType ) )
            // InternalRos.g:3576:4: (lv_type_3_0= ruleParameterType )
            {
            // InternalRos.g:3576:4: (lv_type_3_0= ruleParameterType )
            // InternalRos.g:3577:5: lv_type_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_53);
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

            // InternalRos.g:3594:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==60) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalRos.g:3595:4: otherlv_4= 'default' ( (lv_default_5_0= ruleParameterSequence ) )
                    {
                    otherlv_4=(Token)match(input,60,FOLLOW_54); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRos.g:3599:4: ( (lv_default_5_0= ruleParameterSequence ) )
                    // InternalRos.g:3600:5: (lv_default_5_0= ruleParameterSequence )
                    {
                    // InternalRos.g:3600:5: (lv_default_5_0= ruleParameterSequence )
                    // InternalRos.g:3601:6: lv_default_5_0= ruleParameterSequence
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
    // InternalRos.g:3627:1: entryRuleParameterSequence returns [EObject current=null] : iv_ruleParameterSequence= ruleParameterSequence EOF ;
    public final EObject entryRuleParameterSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterSequence = null;


        try {
            // InternalRos.g:3627:58: (iv_ruleParameterSequence= ruleParameterSequence EOF )
            // InternalRos.g:3628:2: iv_ruleParameterSequence= ruleParameterSequence EOF
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
    // InternalRos.g:3634:1: ruleParameterSequence returns [EObject current=null] : ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:3640:2: ( ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:3641:2: ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:3641:2: ( () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:3642:3: () otherlv_1= 'ParameterSequence' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:3642:3: ()
            // InternalRos.g:3643:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterSequenceAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterSequenceAccess().getParameterSequenceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterSequenceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3657:3: (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==72) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalRos.g:3658:4: otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterValue ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterSequenceAccess().getValueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_65); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterSequenceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:3666:4: ( (lv_value_5_0= ruleParameterValue ) )
                    // InternalRos.g:3667:5: (lv_value_5_0= ruleParameterValue )
                    {
                    // InternalRos.g:3667:5: (lv_value_5_0= ruleParameterValue )
                    // InternalRos.g:3668:6: lv_value_5_0= ruleParameterValue
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

                    // InternalRos.g:3685:4: (otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==14) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // InternalRos.g:3686:5: otherlv_6= ',' ( (lv_value_7_0= ruleParameterValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_65); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterSequenceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:3690:5: ( (lv_value_7_0= ruleParameterValue ) )
                    	    // InternalRos.g:3691:6: (lv_value_7_0= ruleParameterValue )
                    	    {
                    	    // InternalRos.g:3691:6: (lv_value_7_0= ruleParameterValue )
                    	    // InternalRos.g:3692:7: lv_value_7_0= ruleParameterValue
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
    // InternalRos.g:3723:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRos.g:3723:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRos.g:3724:2: iv_ruleParameterAny= ruleParameterAny EOF
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
    // InternalRos.g:3730:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3736:2: ( ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:3737:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:3737:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRos.g:3738:3: () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:3738:3: ()
            // InternalRos.g:3739:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3753:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==72) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalRos.g:3754:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyAccess().getValueKeyword_3_0());
                    			
                    // InternalRos.g:3758:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRos.g:3759:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRos.g:3759:5: (lv_value_4_0= ruleEString )
                    // InternalRos.g:3760:6: lv_value_4_0= ruleEString
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
    // InternalRos.g:3786:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRos.g:3786:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRos.g:3787:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalRos.g:3793:1: ruleParameterString returns [EObject current=null] : (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3799:2: ( (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // InternalRos.g:3800:2: (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3800:2: (otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // InternalRos.g:3801:3: otherlv_0= 'ParameterString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStringAccess().getParameterStringKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,72,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStringAccess().getValueKeyword_2());
            		
            // InternalRos.g:3813:3: ( (lv_value_3_0= ruleEString ) )
            // InternalRos.g:3814:4: (lv_value_3_0= ruleEString )
            {
            // InternalRos.g:3814:4: (lv_value_3_0= ruleEString )
            // InternalRos.g:3815:5: lv_value_3_0= ruleEString
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
    // InternalRos.g:3840:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRos.g:3840:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRos.g:3841:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalRos.g:3847:1: ruleParameterBase64 returns [EObject current=null] : (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3853:2: ( (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' ) )
            // InternalRos.g:3854:2: (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3854:2: (otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}' )
            // InternalRos.g:3855:3: otherlv_0= 'ParameterBase64' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBase64Binary ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterBase64Access().getParameterBase64Keyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64Access().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,72,FOLLOW_67); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBase64Access().getValueKeyword_2());
            		
            // InternalRos.g:3867:3: ( (lv_value_3_0= ruleBase64Binary ) )
            // InternalRos.g:3868:4: (lv_value_3_0= ruleBase64Binary )
            {
            // InternalRos.g:3868:4: (lv_value_3_0= ruleBase64Binary )
            // InternalRos.g:3869:5: lv_value_3_0= ruleBase64Binary
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
    // InternalRos.g:3894:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRos.g:3894:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRos.g:3895:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalRos.g:3901:1: ruleParameterInteger returns [EObject current=null] : (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3907:2: ( (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' ) )
            // InternalRos.g:3908:2: (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3908:2: (otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}' )
            // InternalRos.g:3909:3: otherlv_0= 'ParameterInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleInt0 ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterIntegerAccess().getParameterIntegerKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,72,FOLLOW_68); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterIntegerAccess().getValueKeyword_2());
            		
            // InternalRos.g:3921:3: ( (lv_value_3_0= ruleInt0 ) )
            // InternalRos.g:3922:4: (lv_value_3_0= ruleInt0 )
            {
            // InternalRos.g:3922:4: (lv_value_3_0= ruleInt0 )
            // InternalRos.g:3923:5: lv_value_3_0= ruleInt0
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
    // InternalRos.g:3948:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRos.g:3948:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRos.g:3949:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalRos.g:3955:1: ruleParameterDouble returns [EObject current=null] : (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3961:2: ( (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' ) )
            // InternalRos.g:3962:2: (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' )
            {
            // InternalRos.g:3962:2: (otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}' )
            // InternalRos.g:3963:3: otherlv_0= 'ParameterDouble' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDouble ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterDoubleAccess().getParameterDoubleKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,72,FOLLOW_69); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDoubleAccess().getValueKeyword_2());
            		
            // InternalRos.g:3975:3: ( (lv_value_3_0= ruleDouble ) )
            // InternalRos.g:3976:4: (lv_value_3_0= ruleDouble )
            {
            // InternalRos.g:3976:4: (lv_value_3_0= ruleDouble )
            // InternalRos.g:3977:5: lv_value_3_0= ruleDouble
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
    // InternalRos.g:4002:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRos.g:4002:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRos.g:4003:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalRos.g:4009:1: ruleParameterBoolean returns [EObject current=null] : (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4015:2: ( (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' ) )
            // InternalRos.g:4016:2: (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            {
            // InternalRos.g:4016:2: (otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}' )
            // InternalRos.g:4017:3: otherlv_0= 'ParameterBoolean' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleBoolean ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterBooleanAccess().getParameterBooleanKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,72,FOLLOW_70); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterBooleanAccess().getValueKeyword_2());
            		
            // InternalRos.g:4029:3: ( (lv_value_3_0= ruleBoolean ) )
            // InternalRos.g:4030:4: (lv_value_3_0= ruleBoolean )
            {
            // InternalRos.g:4030:4: (lv_value_3_0= ruleBoolean )
            // InternalRos.g:4031:5: lv_value_3_0= ruleBoolean
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
    // InternalRos.g:4056:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRos.g:4056:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRos.g:4057:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalRos.g:4063:1: ruleParameterStruct returns [EObject current=null] : ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:4069:2: ( ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:4070:2: ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:4070:2: ( () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:4071:3: () otherlv_1= 'ParameterStruct' otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:4071:3: ()
            // InternalRos.g:4072:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getParameterStructKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:4086:3: (otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==72) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalRos.g:4087:4: otherlv_3= 'value' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,72,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getValueKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_71); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:4095:4: ( (lv_value_5_0= ruleParameterStructMember ) )
                    // InternalRos.g:4096:5: (lv_value_5_0= ruleParameterStructMember )
                    {
                    // InternalRos.g:4096:5: (lv_value_5_0= ruleParameterStructMember )
                    // InternalRos.g:4097:6: lv_value_5_0= ruleParameterStructMember
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

                    // InternalRos.g:4114:4: (otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==14) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalRos.g:4115:5: otherlv_6= ',' ( (lv_value_7_0= ruleParameterStructMember ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_71); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:4119:5: ( (lv_value_7_0= ruleParameterStructMember ) )
                    	    // InternalRos.g:4120:6: (lv_value_7_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRos.g:4120:6: (lv_value_7_0= ruleParameterStructMember )
                    	    // InternalRos.g:4121:7: lv_value_7_0= ruleParameterStructMember
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
    // InternalRos.g:4152:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRos.g:4152:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRos.g:4153:2: iv_ruleParameterDate= ruleParameterDate EOF
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
    // InternalRos.g:4159:1: ruleParameterDate returns [EObject current=null] : (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4165:2: ( (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' ) )
            // InternalRos.g:4166:2: (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' )
            {
            // InternalRos.g:4166:2: (otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}' )
            // InternalRos.g:4167:3: otherlv_0= 'ParameterDate' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleDateTime ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterDateAccess().getParameterDateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDateAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,72,FOLLOW_72); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterDateAccess().getValueKeyword_2());
            		
            // InternalRos.g:4179:3: ( (lv_value_3_0= ruleDateTime ) )
            // InternalRos.g:4180:4: (lv_value_3_0= ruleDateTime )
            {
            // InternalRos.g:4180:4: (lv_value_3_0= ruleDateTime )
            // InternalRos.g:4181:5: lv_value_3_0= ruleDateTime
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
    // InternalRos.g:4206:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRos.g:4206:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRos.g:4207:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalRos.g:4213:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Base64Binary' ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4219:2: (kw= 'Base64Binary' )
            // InternalRos.g:4220:2: kw= 'Base64Binary'
            {
            kw=(Token)match(input,81,FOLLOW_2); 

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
    // InternalRos.g:4228:1: entryRuleInt0 returns [String current=null] : iv_ruleInt0= ruleInt0 EOF ;
    public final String entryRuleInt0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInt0 = null;


        try {
            // InternalRos.g:4228:44: (iv_ruleInt0= ruleInt0 EOF )
            // InternalRos.g:4229:2: iv_ruleInt0= ruleInt0 EOF
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
    // InternalRos.g:4235:1: ruleInt0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Int' ;
    public final AntlrDatatypeRuleToken ruleInt0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4241:2: (kw= 'Int' )
            // InternalRos.g:4242:2: kw= 'Int'
            {
            kw=(Token)match(input,82,FOLLOW_2); 

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
    // InternalRos.g:4250:1: entryRuleDouble returns [String current=null] : iv_ruleDouble= ruleDouble EOF ;
    public final String entryRuleDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble = null;


        try {
            // InternalRos.g:4250:46: (iv_ruleDouble= ruleDouble EOF )
            // InternalRos.g:4251:2: iv_ruleDouble= ruleDouble EOF
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
    // InternalRos.g:4257:1: ruleDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Double' ;
    public final AntlrDatatypeRuleToken ruleDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4263:2: (kw= 'Double' )
            // InternalRos.g:4264:2: kw= 'Double'
            {
            kw=(Token)match(input,83,FOLLOW_2); 

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
    // InternalRos.g:4272:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalRos.g:4272:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalRos.g:4273:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalRos.g:4279:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Boolean' ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4285:2: (kw= 'Boolean' )
            // InternalRos.g:4286:2: kw= 'Boolean'
            {
            kw=(Token)match(input,84,FOLLOW_2); 

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
    // InternalRos.g:4294:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRos.g:4294:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRos.g:4295:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalRos.g:4301:1: ruleParameterStructMember returns [EObject current=null] : (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) ;
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
            // InternalRos.g:4307:2: ( (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) )
            // InternalRos.g:4308:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            {
            // InternalRos.g:4308:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            // InternalRos.g:4309:3: otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,85,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructMemberAccess().getParameterStructMemberKeyword_0());
            		
            // InternalRos.g:4313:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos.g:4314:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos.g:4314:4: (lv_name_1_0= ruleEString )
            // InternalRos.g:4315:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_66); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,72,FOLLOW_65); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterStructMemberAccess().getValueKeyword_3());
            		
            // InternalRos.g:4340:3: ( (lv_value_4_0= ruleParameterValue ) )
            // InternalRos.g:4341:4: (lv_value_4_0= ruleParameterValue )
            {
            // InternalRos.g:4341:4: (lv_value_4_0= ruleParameterValue )
            // InternalRos.g:4342:5: lv_value_4_0= ruleParameterValue
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
    // InternalRos.g:4367:1: entryRuleDateTime returns [String current=null] : iv_ruleDateTime= ruleDateTime EOF ;
    public final String entryRuleDateTime() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime = null;


        try {
            // InternalRos.g:4367:48: (iv_ruleDateTime= ruleDateTime EOF )
            // InternalRos.g:4368:2: iv_ruleDateTime= ruleDateTime EOF
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
    // InternalRos.g:4374:1: ruleDateTime returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DateTime' ;
    public final AntlrDatatypeRuleToken ruleDateTime() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:4380:2: (kw= 'DateTime' )
            // InternalRos.g:4381:2: kw= 'DateTime'
            {
            kw=(Token)match(input,86,FOLLOW_2); 

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
    // InternalRos.g:4389:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRos.g:4389:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRos.g:4390:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
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
    // InternalRos.g:4396:1: ruleParameterStructTypeMember returns [EObject current=null] : (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' ) ;
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
            // InternalRos.g:4402:2: ( (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' ) )
            // InternalRos.g:4403:2: (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' )
            {
            // InternalRos.g:4403:2: (otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}' )
            // InternalRos.g:4404:3: otherlv_0= 'ParameterStructTypeMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleParameterType ) ) (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,87,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructTypeMemberAccess().getParameterStructTypeMemberKeyword_0());
            		
            // InternalRos.g:4408:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos.g:4409:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos.g:4409:4: (lv_name_1_0= ruleEString )
            // InternalRos.g:4410:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_49); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterStructTypeMemberAccess().getTypeKeyword_3());
            		
            // InternalRos.g:4435:3: ( (lv_type_4_0= ruleParameterType ) )
            // InternalRos.g:4436:4: (lv_type_4_0= ruleParameterType )
            {
            // InternalRos.g:4436:4: (lv_type_4_0= ruleParameterType )
            // InternalRos.g:4437:5: lv_type_4_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_53);
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

            // InternalRos.g:4454:3: (otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==60) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalRos.g:4455:4: otherlv_5= 'default' ( (lv_default_6_0= ruleParameterStruct ) )
                    {
                    otherlv_5=(Token)match(input,60,FOLLOW_73); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterStructTypeMemberAccess().getDefaultKeyword_5_0());
                    			
                    // InternalRos.g:4459:4: ( (lv_default_6_0= ruleParameterStruct ) )
                    // InternalRos.g:4460:5: (lv_default_6_0= ruleParameterStruct )
                    {
                    // InternalRos.g:4460:5: (lv_default_6_0= ruleParameterStruct )
                    // InternalRos.g:4461:6: lv_default_6_0= ruleParameterStruct
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
    // InternalRos.g:4487:1: entryRulePackageDependency returns [EObject current=null] : iv_rulePackageDependency= rulePackageDependency EOF ;
    public final EObject entryRulePackageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDependency = null;


        try {
            // InternalRos.g:4487:58: (iv_rulePackageDependency= rulePackageDependency EOF )
            // InternalRos.g:4488:2: iv_rulePackageDependency= rulePackageDependency EOF
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
    // InternalRos.g:4494:1: rulePackageDependency returns [EObject current=null] : (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject rulePackageDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRos.g:4500:2: ( (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // InternalRos.g:4501:2: (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // InternalRos.g:4501:2: (otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}' )
            // InternalRos.g:4502:3: otherlv_0= 'PackageDependency' otherlv_1= '{' otherlv_2= 'package' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,88,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDependencyAccess().getPackageDependencyKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_74); 

            			newLeafNode(otherlv_1, grammarAccess.getPackageDependencyAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPackageDependencyAccess().getPackageKeyword_2());
            		
            // InternalRos.g:4514:3: ( ( ruleEString ) )
            // InternalRos.g:4515:4: ( ruleEString )
            {
            // InternalRos.g:4515:4: ( ruleEString )
            // InternalRos.g:4516:5: ruleEString
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
    // InternalRos.g:4538:1: entryRuleExternalDependency returns [EObject current=null] : iv_ruleExternalDependency= ruleExternalDependency EOF ;
    public final EObject entryRuleExternalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDependency = null;


        try {
            // InternalRos.g:4538:59: (iv_ruleExternalDependency= ruleExternalDependency EOF )
            // InternalRos.g:4539:2: iv_ruleExternalDependency= ruleExternalDependency EOF
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
    // InternalRos.g:4545:1: ruleExternalDependency returns [EObject current=null] : ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4551:2: ( ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRos.g:4552:2: ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRos.g:4552:2: ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRos.g:4553:3: () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRos.g:4553:3: ()
            // InternalRos.g:4554:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1());
            		
            // InternalRos.g:4564:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:4565:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:4565:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:4566:5: lv_name_2_0= ruleEString
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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000468000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000448000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000003000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000003008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000E0008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000003F800008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000003F000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000003E000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000003C000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000038000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000030000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000008000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0340000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020100000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0xA400000000000000L,0x000000000000007FL});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0080000000008000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x1800000000008000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1000000000008000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x4000000000008000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x000000000001FE80L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000002000L});

}