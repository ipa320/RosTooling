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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_ROS_CONVENTION_A", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_DECINT", "RULE_DATE_TIME", "RULE_MESSAGE_ASIGMENT", "RULE_ROS_CONVENTION_PARAM", "RULE_DIGIT", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PackageSet'", "'{'", "'package'", "','", "'}'", "'Package'", "'spec'", "'Specs'", "'artifact'", "'node'", "'Artifact'", "'CatkinPackage'", "'dependency'", "'Dependencies'", "'ServiceSpec'", "'request'", "'response'", "'TopicSpec'", "'Header'", "'String'", "'message'", "'ActionSpec'", "'goal'", "'result'", "'feedback'", "'Node'", "'name'", "'serviceserver'", "'ServiceServers'", "'publisher'", "'Publishers'", "'subscriber'", "'Subscribers'", "'serviceclient'", "'ServiceClients'", "'actionserver'", "'ActionServers'", "'actionclient'", "'ActionClients'", "'parameter'", "'Parameters'", "'ServiceServer'", "'service'", "'namespace'", "'Publisher'", "'Subscriber'", "'ServiceClient'", "'ActionServer'", "'action'", "'ActionClient'", "'GraphName'", "'PackageDependency'", "'ExternalDependency'", "'GlobalNamespace'", "'parts'", "'RelativeNamespace'", "'PrivateNamespace'", "'Parameter'", "'type'", "'List'", "'Struct'", "'Integer'", "'default'", "'Double'", "'Boolean'", "'Base64'", "'Array'", "'ParameterAny'", "'value'", "'ParameterStructMember'", "'bool'", "'int8'", "'uint8'", "'int16'", "'uint16'", "'int32'", "'uint32'", "'int64'", "'uint64'", "'float32'", "'float64'", "'string'", "'byte'", "'time'", "'duration'", "'bool[]'", "'int8[]'", "'uint8[]'", "'int16[]'", "'uint16[]'", "'int32[]'", "'uint32[]'", "'int64[]'", "'uint64[]'", "'float32[]'", "'float64[]'", "'string[]'", "'byte[]'", "'[]'"
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
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=22;
    public static final int RULE_DOUBLE=9;
    public static final int RULE_ROS_CONVENTION_A=6;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int RULE_ROS_CONVENTION_PARAM=13;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
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
    // InternalRos.g:71:1: rulePackageSet returns [EObject current=null] : ( () otherlv_1= 'PackageSet' otherlv_2= '{' ( (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' ) | ( ( (lv_package_9_0= rulePackage ) ) (otherlv_10= ',' ( (lv_package_11_0= rulePackage ) ) )* ) )? otherlv_12= '}' ) ;
    public final EObject rulePackageSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_package_5_0 = null;

        EObject lv_package_7_0 = null;

        EObject lv_package_9_0 = null;

        EObject lv_package_11_0 = null;



        	enterRule();

        try {
            // InternalRos.g:77:2: ( ( () otherlv_1= 'PackageSet' otherlv_2= '{' ( (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' ) | ( ( (lv_package_9_0= rulePackage ) ) (otherlv_10= ',' ( (lv_package_11_0= rulePackage ) ) )* ) )? otherlv_12= '}' ) )
            // InternalRos.g:78:2: ( () otherlv_1= 'PackageSet' otherlv_2= '{' ( (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' ) | ( ( (lv_package_9_0= rulePackage ) ) (otherlv_10= ',' ( (lv_package_11_0= rulePackage ) ) )* ) )? otherlv_12= '}' )
            {
            // InternalRos.g:78:2: ( () otherlv_1= 'PackageSet' otherlv_2= '{' ( (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' ) | ( ( (lv_package_9_0= rulePackage ) ) (otherlv_10= ',' ( (lv_package_11_0= rulePackage ) ) )* ) )? otherlv_12= '}' )
            // InternalRos.g:79:3: () otherlv_1= 'PackageSet' otherlv_2= '{' ( (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' ) | ( ( (lv_package_9_0= rulePackage ) ) (otherlv_10= ',' ( (lv_package_11_0= rulePackage ) ) )* ) )? otherlv_12= '}'
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
            		
            // InternalRos.g:94:3: ( (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' ) | ( ( (lv_package_9_0= rulePackage ) ) (otherlv_10= ',' ( (lv_package_11_0= rulePackage ) ) )* ) )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==30||LA3_0==36) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // InternalRos.g:95:4: (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' )
                    {
                    // InternalRos.g:95:4: (otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}' )
                    // InternalRos.g:96:5: otherlv_3= 'package' otherlv_4= '{' ( (lv_package_5_0= rulePackage ) ) (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_3); 

                    					newLeafNode(otherlv_3, grammarAccess.getPackageSetAccess().getPackageKeyword_3_0_0());
                    				
                    otherlv_4=(Token)match(input,26,FOLLOW_5); 

                    					newLeafNode(otherlv_4, grammarAccess.getPackageSetAccess().getLeftCurlyBracketKeyword_3_0_1());
                    				
                    // InternalRos.g:104:5: ( (lv_package_5_0= rulePackage ) )
                    // InternalRos.g:105:6: (lv_package_5_0= rulePackage )
                    {
                    // InternalRos.g:105:6: (lv_package_5_0= rulePackage )
                    // InternalRos.g:106:7: lv_package_5_0= rulePackage
                    {

                    							newCompositeNode(grammarAccess.getPackageSetAccess().getPackagePackageParserRuleCall_3_0_2_0());
                    						
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

                    // InternalRos.g:123:5: (otherlv_6= ',' ( (lv_package_7_0= rulePackage ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==28) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalRos.g:124:6: otherlv_6= ',' ( (lv_package_7_0= rulePackage ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_5); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getPackageSetAccess().getCommaKeyword_3_0_3_0());
                    	    					
                    	    // InternalRos.g:128:6: ( (lv_package_7_0= rulePackage ) )
                    	    // InternalRos.g:129:7: (lv_package_7_0= rulePackage )
                    	    {
                    	    // InternalRos.g:129:7: (lv_package_7_0= rulePackage )
                    	    // InternalRos.g:130:8: lv_package_7_0= rulePackage
                    	    {

                    	    								newCompositeNode(grammarAccess.getPackageSetAccess().getPackagePackageParserRuleCall_3_0_3_1_0());
                    	    							
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

                    otherlv_8=(Token)match(input,29,FOLLOW_7); 

                    					newLeafNode(otherlv_8, grammarAccess.getPackageSetAccess().getRightCurlyBracketKeyword_3_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:154:4: ( ( (lv_package_9_0= rulePackage ) ) (otherlv_10= ',' ( (lv_package_11_0= rulePackage ) ) )* )
                    {
                    // InternalRos.g:154:4: ( ( (lv_package_9_0= rulePackage ) ) (otherlv_10= ',' ( (lv_package_11_0= rulePackage ) ) )* )
                    // InternalRos.g:155:5: ( (lv_package_9_0= rulePackage ) ) (otherlv_10= ',' ( (lv_package_11_0= rulePackage ) ) )*
                    {
                    // InternalRos.g:155:5: ( (lv_package_9_0= rulePackage ) )
                    // InternalRos.g:156:6: (lv_package_9_0= rulePackage )
                    {
                    // InternalRos.g:156:6: (lv_package_9_0= rulePackage )
                    // InternalRos.g:157:7: lv_package_9_0= rulePackage
                    {

                    							newCompositeNode(grammarAccess.getPackageSetAccess().getPackagePackageParserRuleCall_3_1_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_package_9_0=rulePackage();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackageSetRule());
                    							}
                    							add(
                    								current,
                    								"package",
                    								lv_package_9_0,
                    								"de.fraunhofer.ipa.ros.Ros.Package");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:174:5: (otherlv_10= ',' ( (lv_package_11_0= rulePackage ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==28) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRos.g:175:6: otherlv_10= ',' ( (lv_package_11_0= rulePackage ) )
                    	    {
                    	    otherlv_10=(Token)match(input,28,FOLLOW_5); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getPackageSetAccess().getCommaKeyword_3_1_1_0());
                    	    					
                    	    // InternalRos.g:179:6: ( (lv_package_11_0= rulePackage ) )
                    	    // InternalRos.g:180:7: (lv_package_11_0= rulePackage )
                    	    {
                    	    // InternalRos.g:180:7: (lv_package_11_0= rulePackage )
                    	    // InternalRos.g:181:8: lv_package_11_0= rulePackage
                    	    {

                    	    								newCompositeNode(grammarAccess.getPackageSetAccess().getPackagePackageParserRuleCall_3_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_package_11_0=rulePackage();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPackageSetRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"package",
                    	    									lv_package_11_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Package");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getPackageSetAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:209:1: entryRulePackage returns [EObject current=null] : iv_rulePackage= rulePackage EOF ;
    public final EObject entryRulePackage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage = null;


        try {
            // InternalRos.g:209:48: (iv_rulePackage= rulePackage EOF )
            // InternalRos.g:210:2: iv_rulePackage= rulePackage EOF
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
    // InternalRos.g:216:1: rulePackage returns [EObject current=null] : (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage ) ;
    public final EObject rulePackage() throws RecognitionException {
        EObject current = null;

        EObject this_Package_Impl_0 = null;

        EObject this_CatkinPackage_1 = null;



        	enterRule();

        try {
            // InternalRos.g:222:2: ( (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage ) )
            // InternalRos.g:223:2: (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage )
            {
            // InternalRos.g:223:2: (this_Package_Impl_0= rulePackage_Impl | this_CatkinPackage_1= ruleCatkinPackage )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRos.g:224:3: this_Package_Impl_0= rulePackage_Impl
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
                    // InternalRos.g:233:3: this_CatkinPackage_1= ruleCatkinPackage
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
    // InternalRos.g:245:1: entryRuleSpecBase returns [EObject current=null] : iv_ruleSpecBase= ruleSpecBase EOF ;
    public final EObject entryRuleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBase = null;


        try {
            // InternalRos.g:245:49: (iv_ruleSpecBase= ruleSpecBase EOF )
            // InternalRos.g:246:2: iv_ruleSpecBase= ruleSpecBase EOF
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
    // InternalRos.g:252:1: ruleSpecBase returns [EObject current=null] : (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec ) ;
    public final EObject ruleSpecBase() throws RecognitionException {
        EObject current = null;

        EObject this_ServiceSpec_0 = null;

        EObject this_TopicSpec_1 = null;

        EObject this_ActionSpec_2 = null;



        	enterRule();

        try {
            // InternalRos.g:258:2: ( (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec ) )
            // InternalRos.g:259:2: (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec )
            {
            // InternalRos.g:259:2: (this_ServiceSpec_0= ruleServiceSpec | this_TopicSpec_1= ruleTopicSpec | this_ActionSpec_2= ruleActionSpec )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 42:
                {
                alt5=2;
                }
                break;
            case 46:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRos.g:260:3: this_ServiceSpec_0= ruleServiceSpec
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
                    // InternalRos.g:269:3: this_TopicSpec_1= ruleTopicSpec
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
                    // InternalRos.g:278:3: this_ActionSpec_2= ruleActionSpec
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
    // InternalRos.g:290:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // InternalRos.g:290:51: (iv_ruleDependency= ruleDependency EOF )
            // InternalRos.g:291:2: iv_ruleDependency= ruleDependency EOF
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
    // InternalRos.g:297:1: ruleDependency returns [EObject current=null] : (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        EObject this_PackageDependency_0 = null;

        EObject this_ExternalDependency_1 = null;



        	enterRule();

        try {
            // InternalRos.g:303:2: ( (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency ) )
            // InternalRos.g:304:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            {
            // InternalRos.g:304:2: (this_PackageDependency_0= rulePackageDependency | this_ExternalDependency_1= ruleExternalDependency )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==76) ) {
                alt6=1;
            }
            else if ( (LA6_0==77) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRos.g:305:3: this_PackageDependency_0= rulePackageDependency
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
                    // InternalRos.g:314:3: this_ExternalDependency_1= ruleExternalDependency
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
    // InternalRos.g:326:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalRos.g:326:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalRos.g:327:2: iv_ruleNamespace= ruleNamespace EOF
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
    // InternalRos.g:333:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalRos.g:339:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalRos.g:340:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalRos.g:340:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt7=1;
                }
                break;
            case 80:
                {
                alt7=2;
                }
                break;
            case 81:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRos.g:341:3: this_GlobalNamespace_0= ruleGlobalNamespace
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
                    // InternalRos.g:350:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
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
                    // InternalRos.g:359:3: this_PrivateNamespace_2= rulePrivateNamespace
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
    // InternalRos.g:371:1: entryRulePackage_Impl returns [EObject current=null] : iv_rulePackage_Impl= rulePackage_Impl EOF ;
    public final EObject entryRulePackage_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackage_Impl = null;


        try {
            // InternalRos.g:371:53: (iv_rulePackage_Impl= rulePackage_Impl EOF )
            // InternalRos.g:372:2: iv_rulePackage_Impl= rulePackage_Impl EOF
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
    // InternalRos.g:378:1: rulePackage_Impl returns [EObject current=null] : ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )? otherlv_25= '}' ) ;
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
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_spec_6_0 = null;

        EObject lv_spec_8_0 = null;

        EObject lv_spec_12_0 = null;

        EObject lv_spec_14_0 = null;

        EObject lv_artifact_18_0 = null;

        EObject lv_artifact_20_0 = null;

        EObject lv_artifact_22_0 = null;

        EObject lv_artifact_24_0 = null;



        	enterRule();

        try {
            // InternalRos.g:384:2: ( ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )? otherlv_25= '}' ) )
            // InternalRos.g:385:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )? otherlv_25= '}' )
            {
            // InternalRos.g:385:2: ( () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )? otherlv_25= '}' )
            // InternalRos.g:386:3: () otherlv_1= 'Package' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )? otherlv_25= '}'
            {
            // InternalRos.g:386:3: ()
            // InternalRos.g:387:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPackage_ImplAccess().getPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getPackage_ImplAccess().getPackageKeyword_1());
            		
            // InternalRos.g:397:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:398:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:398:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:399:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,26,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:420:3: ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            else if ( (LA10_0==32) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // InternalRos.g:421:4: (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )
                    {
                    // InternalRos.g:421:4: (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )
                    // InternalRos.g:422:5: otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getPackage_ImplAccess().getSpecKeyword_4_0_0());
                    				
                    otherlv_5=(Token)match(input,26,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_4_0_1());
                    				
                    // InternalRos.g:430:5: ( (lv_spec_6_0= ruleSpecBase ) )
                    // InternalRos.g:431:6: (lv_spec_6_0= ruleSpecBase )
                    {
                    // InternalRos.g:431:6: (lv_spec_6_0= ruleSpecBase )
                    // InternalRos.g:432:7: lv_spec_6_0= ruleSpecBase
                    {

                    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_4_0_2_0());
                    						
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

                    // InternalRos.g:449:5: (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==28) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRos.g:450:6: otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_10); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getPackage_ImplAccess().getCommaKeyword_4_0_3_0());
                    	    					
                    	    // InternalRos.g:454:6: ( (lv_spec_8_0= ruleSpecBase ) )
                    	    // InternalRos.g:455:7: (lv_spec_8_0= ruleSpecBase )
                    	    {
                    	    // InternalRos.g:455:7: (lv_spec_8_0= ruleSpecBase )
                    	    // InternalRos.g:456:8: lv_spec_8_0= ruleSpecBase
                    	    {

                    	    								newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_4_0_3_1_0());
                    	    							
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_11); 

                    					newLeafNode(otherlv_9, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_4_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:480:4: (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' )
                    {
                    // InternalRos.g:480:4: (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' )
                    // InternalRos.g:481:5: otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_3); 

                    					newLeafNode(otherlv_10, grammarAccess.getPackage_ImplAccess().getSpecsKeyword_4_1_0());
                    				
                    otherlv_11=(Token)match(input,26,FOLLOW_10); 

                    					newLeafNode(otherlv_11, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_4_1_1());
                    				
                    // InternalRos.g:489:5: ( (lv_spec_12_0= ruleSpecBase ) )
                    // InternalRos.g:490:6: (lv_spec_12_0= ruleSpecBase )
                    {
                    // InternalRos.g:490:6: (lv_spec_12_0= ruleSpecBase )
                    // InternalRos.g:491:7: lv_spec_12_0= ruleSpecBase
                    {

                    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_4_1_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_spec_12_0=ruleSpecBase();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    							}
                    							add(
                    								current,
                    								"spec",
                    								lv_spec_12_0,
                    								"de.fraunhofer.ipa.ros.Ros.SpecBase");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:508:5: (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==28) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRos.g:509:6: otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) )
                    	    {
                    	    otherlv_13=(Token)match(input,28,FOLLOW_10); 

                    	    						newLeafNode(otherlv_13, grammarAccess.getPackage_ImplAccess().getCommaKeyword_4_1_3_0());
                    	    					
                    	    // InternalRos.g:513:6: ( (lv_spec_14_0= ruleSpecBase ) )
                    	    // InternalRos.g:514:7: (lv_spec_14_0= ruleSpecBase )
                    	    {
                    	    // InternalRos.g:514:7: (lv_spec_14_0= ruleSpecBase )
                    	    // InternalRos.g:515:8: lv_spec_14_0= ruleSpecBase
                    	    {

                    	    								newCompositeNode(grammarAccess.getPackage_ImplAccess().getSpecSpecBaseParserRuleCall_4_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_spec_14_0=ruleSpecBase();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"spec",
                    	    									lv_spec_14_0,
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

                    otherlv_15=(Token)match(input,29,FOLLOW_11); 

                    					newLeafNode(otherlv_15, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_4_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalRos.g:539:3: ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            else if ( (LA13_0==35) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // InternalRos.g:540:4: (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' )
                    {
                    // InternalRos.g:540:4: (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' )
                    // InternalRos.g:541:5: otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_3); 

                    					newLeafNode(otherlv_16, grammarAccess.getPackage_ImplAccess().getArtifactKeyword_5_0_0());
                    				
                    otherlv_17=(Token)match(input,26,FOLLOW_12); 

                    					newLeafNode(otherlv_17, grammarAccess.getPackage_ImplAccess().getLeftCurlyBracketKeyword_5_0_1());
                    				
                    // InternalRos.g:549:5: ( (lv_artifact_18_0= ruleArtifact ) )
                    // InternalRos.g:550:6: (lv_artifact_18_0= ruleArtifact )
                    {
                    // InternalRos.g:550:6: (lv_artifact_18_0= ruleArtifact )
                    // InternalRos.g:551:7: lv_artifact_18_0= ruleArtifact
                    {

                    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getArtifactArtifactParserRuleCall_5_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_artifact_18_0=ruleArtifact();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    							}
                    							add(
                    								current,
                    								"artifact",
                    								lv_artifact_18_0,
                    								"de.fraunhofer.ipa.ros.Ros.Artifact");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:568:5: (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalRos.g:569:6: otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) )
                    	    {
                    	    otherlv_19=(Token)match(input,28,FOLLOW_12); 

                    	    						newLeafNode(otherlv_19, grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_0_3_0());
                    	    					
                    	    // InternalRos.g:573:6: ( (lv_artifact_20_0= ruleArtifact ) )
                    	    // InternalRos.g:574:7: (lv_artifact_20_0= ruleArtifact )
                    	    {
                    	    // InternalRos.g:574:7: (lv_artifact_20_0= ruleArtifact )
                    	    // InternalRos.g:575:8: lv_artifact_20_0= ruleArtifact
                    	    {

                    	    								newCompositeNode(grammarAccess.getPackage_ImplAccess().getArtifactArtifactParserRuleCall_5_0_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_artifact_20_0=ruleArtifact();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"artifact",
                    	    									lv_artifact_20_0,
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

                    otherlv_21=(Token)match(input,29,FOLLOW_7); 

                    					newLeafNode(otherlv_21, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_5_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:599:4: ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* )
                    {
                    // InternalRos.g:599:4: ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* )
                    // InternalRos.g:600:5: ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )*
                    {
                    // InternalRos.g:600:5: ( (lv_artifact_22_0= ruleArtifact ) )
                    // InternalRos.g:601:6: (lv_artifact_22_0= ruleArtifact )
                    {
                    // InternalRos.g:601:6: (lv_artifact_22_0= ruleArtifact )
                    // InternalRos.g:602:7: lv_artifact_22_0= ruleArtifact
                    {

                    							newCompositeNode(grammarAccess.getPackage_ImplAccess().getArtifactArtifactParserRuleCall_5_1_0_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_artifact_22_0=ruleArtifact();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    							}
                    							add(
                    								current,
                    								"artifact",
                    								lv_artifact_22_0,
                    								"de.fraunhofer.ipa.ros.Ros.Artifact");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:619:5: (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==28) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRos.g:620:6: otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) )
                    	    {
                    	    otherlv_23=(Token)match(input,28,FOLLOW_12); 

                    	    						newLeafNode(otherlv_23, grammarAccess.getPackage_ImplAccess().getCommaKeyword_5_1_1_0());
                    	    					
                    	    // InternalRos.g:624:6: ( (lv_artifact_24_0= ruleArtifact ) )
                    	    // InternalRos.g:625:7: (lv_artifact_24_0= ruleArtifact )
                    	    {
                    	    // InternalRos.g:625:7: (lv_artifact_24_0= ruleArtifact )
                    	    // InternalRos.g:626:8: lv_artifact_24_0= ruleArtifact
                    	    {

                    	    								newCompositeNode(grammarAccess.getPackage_ImplAccess().getArtifactArtifactParserRuleCall_5_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_artifact_24_0=ruleArtifact();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getPackage_ImplRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"artifact",
                    	    									lv_artifact_24_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Artifact");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_25=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getPackage_ImplAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:654:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRos.g:654:47: (iv_ruleEString= ruleEString EOF )
            // InternalRos.g:655:2: iv_ruleEString= ruleEString EOF
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
    // InternalRos.g:661:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRos.g:667:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRos.g:668:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRos.g:668:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalRos.g:669:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:677:3: this_ID_1= RULE_ID
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
    // InternalRos.g:688:1: entryRuleRosNames returns [String current=null] : iv_ruleRosNames= ruleRosNames EOF ;
    public final String entryRuleRosNames() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRosNames = null;


        try {
            // InternalRos.g:688:48: (iv_ruleRosNames= ruleRosNames EOF )
            // InternalRos.g:689:2: iv_ruleRosNames= ruleRosNames EOF
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
    // InternalRos.g:695:1: ruleRosNames returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= 'node' ) ;
    public final AntlrDatatypeRuleToken ruleRosNames() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ROS_CONVENTION_A_0=null;
        Token this_ID_1=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:701:2: ( (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= 'node' ) )
            // InternalRos.g:702:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= 'node' )
            {
            // InternalRos.g:702:2: (this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A | this_ID_1= RULE_ID | kw= 'node' )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_ROS_CONVENTION_A:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case 34:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalRos.g:703:3: this_ROS_CONVENTION_A_0= RULE_ROS_CONVENTION_A
                    {
                    this_ROS_CONVENTION_A_0=(Token)match(input,RULE_ROS_CONVENTION_A,FOLLOW_2); 

                    			current.merge(this_ROS_CONVENTION_A_0);
                    		

                    			newLeafNode(this_ROS_CONVENTION_A_0, grammarAccess.getRosNamesAccess().getROS_CONVENTION_ATerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:711:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getRosNamesAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRos.g:719:3: kw= 'node'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

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
    // InternalRos.g:728:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalRos.g:728:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalRos.g:729:2: iv_ruleArtifact= ruleArtifact EOF
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
    // InternalRos.g:735:1: ruleArtifact returns [EObject current=null] : ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) ) | ( (lv_node_6_0= ruleNode ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_node_5_0 = null;

        EObject lv_node_6_0 = null;



        	enterRule();

        try {
            // InternalRos.g:741:2: ( ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) ) | ( (lv_node_6_0= ruleNode ) ) )? otherlv_7= '}' ) )
            // InternalRos.g:742:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) ) | ( (lv_node_6_0= ruleNode ) ) )? otherlv_7= '}' )
            {
            // InternalRos.g:742:2: ( () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) ) | ( (lv_node_6_0= ruleNode ) ) )? otherlv_7= '}' )
            // InternalRos.g:743:3: () otherlv_1= 'Artifact' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) ) | ( (lv_node_6_0= ruleNode ) ) )? otherlv_7= '}'
            {
            // InternalRos.g:743:3: ()
            // InternalRos.g:744:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getArtifactAccess().getArtifactAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getArtifactAccess().getArtifactKeyword_1());
            		
            // InternalRos.g:754:3: ( (lv_name_2_0= ruleRosNames ) )
            // InternalRos.g:755:4: (lv_name_2_0= ruleRosNames )
            {
            // InternalRos.g:755:4: (lv_name_2_0= ruleRosNames )
            // InternalRos.g:756:5: lv_name_2_0= ruleRosNames
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

            otherlv_3=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:777:3: ( (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) ) | ( (lv_node_6_0= ruleNode ) ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            else if ( (LA16_0==50) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalRos.g:778:4: (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )
                    {
                    // InternalRos.g:778:4: (otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) ) )
                    // InternalRos.g:779:5: otherlv_4= 'node' ( (lv_node_5_0= ruleNode ) )
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_15); 

                    					newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getNodeKeyword_4_0_0());
                    				
                    // InternalRos.g:783:5: ( (lv_node_5_0= ruleNode ) )
                    // InternalRos.g:784:6: (lv_node_5_0= ruleNode )
                    {
                    // InternalRos.g:784:6: (lv_node_5_0= ruleNode )
                    // InternalRos.g:785:7: lv_node_5_0= ruleNode
                    {

                    							newCompositeNode(grammarAccess.getArtifactAccess().getNodeNodeParserRuleCall_4_0_1_0());
                    						
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


                    }
                    break;
                case 2 :
                    // InternalRos.g:804:4: ( (lv_node_6_0= ruleNode ) )
                    {
                    // InternalRos.g:804:4: ( (lv_node_6_0= ruleNode ) )
                    // InternalRos.g:805:5: (lv_node_6_0= ruleNode )
                    {
                    // InternalRos.g:805:5: (lv_node_6_0= ruleNode )
                    // InternalRos.g:806:6: lv_node_6_0= ruleNode
                    {

                    						newCompositeNode(grammarAccess.getArtifactAccess().getNodeNodeParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_node_6_0=ruleNode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArtifactRule());
                    						}
                    						set(
                    							current,
                    							"node",
                    							lv_node_6_0,
                    							"de.fraunhofer.ipa.ros.Ros.Node");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:832:1: entryRuleCatkinPackage returns [EObject current=null] : iv_ruleCatkinPackage= ruleCatkinPackage EOF ;
    public final EObject entryRuleCatkinPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatkinPackage = null;


        try {
            // InternalRos.g:832:54: (iv_ruleCatkinPackage= ruleCatkinPackage EOF )
            // InternalRos.g:833:2: iv_ruleCatkinPackage= ruleCatkinPackage EOF
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
    // InternalRos.g:839:1: ruleCatkinPackage returns [EObject current=null] : ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )? ( (otherlv_25= 'dependency' otherlv_26= '{' ( (lv_dependency_27_0= ruleDependency ) ) (otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) ) )* otherlv_30= '}' ) | (otherlv_31= 'Dependencies' otherlv_32= '{' ( (lv_dependency_33_0= ruleDependency ) ) (otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) ) )* otherlv_36= '}' ) )? otherlv_37= '}' ) ;
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
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_spec_6_0 = null;

        EObject lv_spec_8_0 = null;

        EObject lv_spec_12_0 = null;

        EObject lv_spec_14_0 = null;

        EObject lv_artifact_18_0 = null;

        EObject lv_artifact_20_0 = null;

        EObject lv_artifact_22_0 = null;

        EObject lv_artifact_24_0 = null;

        EObject lv_dependency_27_0 = null;

        EObject lv_dependency_29_0 = null;

        EObject lv_dependency_33_0 = null;

        EObject lv_dependency_35_0 = null;



        	enterRule();

        try {
            // InternalRos.g:845:2: ( ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )? ( (otherlv_25= 'dependency' otherlv_26= '{' ( (lv_dependency_27_0= ruleDependency ) ) (otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) ) )* otherlv_30= '}' ) | (otherlv_31= 'Dependencies' otherlv_32= '{' ( (lv_dependency_33_0= ruleDependency ) ) (otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) ) )* otherlv_36= '}' ) )? otherlv_37= '}' ) )
            // InternalRos.g:846:2: ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )? ( (otherlv_25= 'dependency' otherlv_26= '{' ( (lv_dependency_27_0= ruleDependency ) ) (otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) ) )* otherlv_30= '}' ) | (otherlv_31= 'Dependencies' otherlv_32= '{' ( (lv_dependency_33_0= ruleDependency ) ) (otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) ) )* otherlv_36= '}' ) )? otherlv_37= '}' )
            {
            // InternalRos.g:846:2: ( () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )? ( (otherlv_25= 'dependency' otherlv_26= '{' ( (lv_dependency_27_0= ruleDependency ) ) (otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) ) )* otherlv_30= '}' ) | (otherlv_31= 'Dependencies' otherlv_32= '{' ( (lv_dependency_33_0= ruleDependency ) ) (otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) ) )* otherlv_36= '}' ) )? otherlv_37= '}' )
            // InternalRos.g:847:3: () otherlv_1= 'CatkinPackage' ( (lv_name_2_0= ruleRosNames ) ) otherlv_3= '{' ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )? ( (otherlv_25= 'dependency' otherlv_26= '{' ( (lv_dependency_27_0= ruleDependency ) ) (otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) ) )* otherlv_30= '}' ) | (otherlv_31= 'Dependencies' otherlv_32= '{' ( (lv_dependency_33_0= ruleDependency ) ) (otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) ) )* otherlv_36= '}' ) )? otherlv_37= '}'
            {
            // InternalRos.g:847:3: ()
            // InternalRos.g:848:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCatkinPackageAccess().getCatkinPackageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getCatkinPackageAccess().getCatkinPackageKeyword_1());
            		
            // InternalRos.g:858:3: ( (lv_name_2_0= ruleRosNames ) )
            // InternalRos.g:859:4: (lv_name_2_0= ruleRosNames )
            {
            // InternalRos.g:859:4: (lv_name_2_0= ruleRosNames )
            // InternalRos.g:860:5: lv_name_2_0= ruleRosNames
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

            otherlv_3=(Token)match(input,26,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:881:3: ( (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' ) | (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' ) )?
            int alt19=3;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            else if ( (LA19_0==32) ) {
                alt19=2;
            }
            switch (alt19) {
                case 1 :
                    // InternalRos.g:882:4: (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )
                    {
                    // InternalRos.g:882:4: (otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}' )
                    // InternalRos.g:883:5: otherlv_4= 'spec' otherlv_5= '{' ( (lv_spec_6_0= ruleSpecBase ) ) (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getCatkinPackageAccess().getSpecKeyword_4_0_0());
                    				
                    otherlv_5=(Token)match(input,26,FOLLOW_10); 

                    					newLeafNode(otherlv_5, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_4_0_1());
                    				
                    // InternalRos.g:891:5: ( (lv_spec_6_0= ruleSpecBase ) )
                    // InternalRos.g:892:6: (lv_spec_6_0= ruleSpecBase )
                    {
                    // InternalRos.g:892:6: (lv_spec_6_0= ruleSpecBase )
                    // InternalRos.g:893:7: lv_spec_6_0= ruleSpecBase
                    {

                    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getSpecSpecBaseParserRuleCall_4_0_2_0());
                    						
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

                    // InternalRos.g:910:5: (otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==28) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalRos.g:911:6: otherlv_7= ',' ( (lv_spec_8_0= ruleSpecBase ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_10); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getCatkinPackageAccess().getCommaKeyword_4_0_3_0());
                    	    					
                    	    // InternalRos.g:915:6: ( (lv_spec_8_0= ruleSpecBase ) )
                    	    // InternalRos.g:916:7: (lv_spec_8_0= ruleSpecBase )
                    	    {
                    	    // InternalRos.g:916:7: (lv_spec_8_0= ruleSpecBase )
                    	    // InternalRos.g:917:8: lv_spec_8_0= ruleSpecBase
                    	    {

                    	    								newCompositeNode(grammarAccess.getCatkinPackageAccess().getSpecSpecBaseParserRuleCall_4_0_3_1_0());
                    	    							
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
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_17); 

                    					newLeafNode(otherlv_9, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_4_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:941:4: (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' )
                    {
                    // InternalRos.g:941:4: (otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}' )
                    // InternalRos.g:942:5: otherlv_10= 'Specs' otherlv_11= '{' ( (lv_spec_12_0= ruleSpecBase ) ) (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_3); 

                    					newLeafNode(otherlv_10, grammarAccess.getCatkinPackageAccess().getSpecsKeyword_4_1_0());
                    				
                    otherlv_11=(Token)match(input,26,FOLLOW_10); 

                    					newLeafNode(otherlv_11, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_4_1_1());
                    				
                    // InternalRos.g:950:5: ( (lv_spec_12_0= ruleSpecBase ) )
                    // InternalRos.g:951:6: (lv_spec_12_0= ruleSpecBase )
                    {
                    // InternalRos.g:951:6: (lv_spec_12_0= ruleSpecBase )
                    // InternalRos.g:952:7: lv_spec_12_0= ruleSpecBase
                    {

                    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getSpecSpecBaseParserRuleCall_4_1_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_spec_12_0=ruleSpecBase();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    							}
                    							add(
                    								current,
                    								"spec",
                    								lv_spec_12_0,
                    								"de.fraunhofer.ipa.ros.Ros.SpecBase");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:969:5: (otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==28) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalRos.g:970:6: otherlv_13= ',' ( (lv_spec_14_0= ruleSpecBase ) )
                    	    {
                    	    otherlv_13=(Token)match(input,28,FOLLOW_10); 

                    	    						newLeafNode(otherlv_13, grammarAccess.getCatkinPackageAccess().getCommaKeyword_4_1_3_0());
                    	    					
                    	    // InternalRos.g:974:6: ( (lv_spec_14_0= ruleSpecBase ) )
                    	    // InternalRos.g:975:7: (lv_spec_14_0= ruleSpecBase )
                    	    {
                    	    // InternalRos.g:975:7: (lv_spec_14_0= ruleSpecBase )
                    	    // InternalRos.g:976:8: lv_spec_14_0= ruleSpecBase
                    	    {

                    	    								newCompositeNode(grammarAccess.getCatkinPackageAccess().getSpecSpecBaseParserRuleCall_4_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_spec_14_0=ruleSpecBase();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"spec",
                    	    									lv_spec_14_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.SpecBase");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,29,FOLLOW_17); 

                    					newLeafNode(otherlv_15, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_4_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalRos.g:1000:3: ( (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' ) | ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* ) )?
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==33) ) {
                alt22=1;
            }
            else if ( (LA22_0==35) ) {
                alt22=2;
            }
            switch (alt22) {
                case 1 :
                    // InternalRos.g:1001:4: (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' )
                    {
                    // InternalRos.g:1001:4: (otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}' )
                    // InternalRos.g:1002:5: otherlv_16= 'artifact' otherlv_17= '{' ( (lv_artifact_18_0= ruleArtifact ) ) (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,33,FOLLOW_3); 

                    					newLeafNode(otherlv_16, grammarAccess.getCatkinPackageAccess().getArtifactKeyword_5_0_0());
                    				
                    otherlv_17=(Token)match(input,26,FOLLOW_12); 

                    					newLeafNode(otherlv_17, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_5_0_1());
                    				
                    // InternalRos.g:1010:5: ( (lv_artifact_18_0= ruleArtifact ) )
                    // InternalRos.g:1011:6: (lv_artifact_18_0= ruleArtifact )
                    {
                    // InternalRos.g:1011:6: (lv_artifact_18_0= ruleArtifact )
                    // InternalRos.g:1012:7: lv_artifact_18_0= ruleArtifact
                    {

                    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_artifact_18_0=ruleArtifact();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    							}
                    							add(
                    								current,
                    								"artifact",
                    								lv_artifact_18_0,
                    								"de.fraunhofer.ipa.ros.Ros.Artifact");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:1029:5: (otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==28) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRos.g:1030:6: otherlv_19= ',' ( (lv_artifact_20_0= ruleArtifact ) )
                    	    {
                    	    otherlv_19=(Token)match(input,28,FOLLOW_12); 

                    	    						newLeafNode(otherlv_19, grammarAccess.getCatkinPackageAccess().getCommaKeyword_5_0_3_0());
                    	    					
                    	    // InternalRos.g:1034:6: ( (lv_artifact_20_0= ruleArtifact ) )
                    	    // InternalRos.g:1035:7: (lv_artifact_20_0= ruleArtifact )
                    	    {
                    	    // InternalRos.g:1035:7: (lv_artifact_20_0= ruleArtifact )
                    	    // InternalRos.g:1036:8: lv_artifact_20_0= ruleArtifact
                    	    {

                    	    								newCompositeNode(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_0_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_artifact_20_0=ruleArtifact();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"artifact",
                    	    									lv_artifact_20_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Artifact");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,29,FOLLOW_18); 

                    					newLeafNode(otherlv_21, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_5_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:1060:4: ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* )
                    {
                    // InternalRos.g:1060:4: ( ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )* )
                    // InternalRos.g:1061:5: ( (lv_artifact_22_0= ruleArtifact ) ) (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )*
                    {
                    // InternalRos.g:1061:5: ( (lv_artifact_22_0= ruleArtifact ) )
                    // InternalRos.g:1062:6: (lv_artifact_22_0= ruleArtifact )
                    {
                    // InternalRos.g:1062:6: (lv_artifact_22_0= ruleArtifact )
                    // InternalRos.g:1063:7: lv_artifact_22_0= ruleArtifact
                    {

                    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_1_0_0());
                    						
                    pushFollow(FOLLOW_19);
                    lv_artifact_22_0=ruleArtifact();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    							}
                    							add(
                    								current,
                    								"artifact",
                    								lv_artifact_22_0,
                    								"de.fraunhofer.ipa.ros.Ros.Artifact");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:1080:5: (otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==28) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRos.g:1081:6: otherlv_23= ',' ( (lv_artifact_24_0= ruleArtifact ) )
                    	    {
                    	    otherlv_23=(Token)match(input,28,FOLLOW_12); 

                    	    						newLeafNode(otherlv_23, grammarAccess.getCatkinPackageAccess().getCommaKeyword_5_1_1_0());
                    	    					
                    	    // InternalRos.g:1085:6: ( (lv_artifact_24_0= ruleArtifact ) )
                    	    // InternalRos.g:1086:7: (lv_artifact_24_0= ruleArtifact )
                    	    {
                    	    // InternalRos.g:1086:7: (lv_artifact_24_0= ruleArtifact )
                    	    // InternalRos.g:1087:8: lv_artifact_24_0= ruleArtifact
                    	    {

                    	    								newCompositeNode(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_19);
                    	    lv_artifact_24_0=ruleArtifact();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"artifact",
                    	    									lv_artifact_24_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Artifact");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalRos.g:1107:3: ( (otherlv_25= 'dependency' otherlv_26= '{' ( (lv_dependency_27_0= ruleDependency ) ) (otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) ) )* otherlv_30= '}' ) | (otherlv_31= 'Dependencies' otherlv_32= '{' ( (lv_dependency_33_0= ruleDependency ) ) (otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) ) )* otherlv_36= '}' ) )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==37) ) {
                alt25=1;
            }
            else if ( (LA25_0==38) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // InternalRos.g:1108:4: (otherlv_25= 'dependency' otherlv_26= '{' ( (lv_dependency_27_0= ruleDependency ) ) (otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) ) )* otherlv_30= '}' )
                    {
                    // InternalRos.g:1108:4: (otherlv_25= 'dependency' otherlv_26= '{' ( (lv_dependency_27_0= ruleDependency ) ) (otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) ) )* otherlv_30= '}' )
                    // InternalRos.g:1109:5: otherlv_25= 'dependency' otherlv_26= '{' ( (lv_dependency_27_0= ruleDependency ) ) (otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,37,FOLLOW_3); 

                    					newLeafNode(otherlv_25, grammarAccess.getCatkinPackageAccess().getDependencyKeyword_6_0_0());
                    				
                    otherlv_26=(Token)match(input,26,FOLLOW_20); 

                    					newLeafNode(otherlv_26, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_6_0_1());
                    				
                    // InternalRos.g:1117:5: ( (lv_dependency_27_0= ruleDependency ) )
                    // InternalRos.g:1118:6: (lv_dependency_27_0= ruleDependency )
                    {
                    // InternalRos.g:1118:6: (lv_dependency_27_0= ruleDependency )
                    // InternalRos.g:1119:7: lv_dependency_27_0= ruleDependency
                    {

                    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_dependency_27_0=ruleDependency();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    							}
                    							add(
                    								current,
                    								"dependency",
                    								lv_dependency_27_0,
                    								"de.fraunhofer.ipa.ros.Ros.Dependency");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:1136:5: (otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==28) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRos.g:1137:6: otherlv_28= ',' ( (lv_dependency_29_0= ruleDependency ) )
                    	    {
                    	    otherlv_28=(Token)match(input,28,FOLLOW_20); 

                    	    						newLeafNode(otherlv_28, grammarAccess.getCatkinPackageAccess().getCommaKeyword_6_0_3_0());
                    	    					
                    	    // InternalRos.g:1141:6: ( (lv_dependency_29_0= ruleDependency ) )
                    	    // InternalRos.g:1142:7: (lv_dependency_29_0= ruleDependency )
                    	    {
                    	    // InternalRos.g:1142:7: (lv_dependency_29_0= ruleDependency )
                    	    // InternalRos.g:1143:8: lv_dependency_29_0= ruleDependency
                    	    {

                    	    								newCompositeNode(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_0_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_dependency_29_0=ruleDependency();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"dependency",
                    	    									lv_dependency_29_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Dependency");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,29,FOLLOW_7); 

                    					newLeafNode(otherlv_30, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_6_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:1167:4: (otherlv_31= 'Dependencies' otherlv_32= '{' ( (lv_dependency_33_0= ruleDependency ) ) (otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) ) )* otherlv_36= '}' )
                    {
                    // InternalRos.g:1167:4: (otherlv_31= 'Dependencies' otherlv_32= '{' ( (lv_dependency_33_0= ruleDependency ) ) (otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) ) )* otherlv_36= '}' )
                    // InternalRos.g:1168:5: otherlv_31= 'Dependencies' otherlv_32= '{' ( (lv_dependency_33_0= ruleDependency ) ) (otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) ) )* otherlv_36= '}'
                    {
                    otherlv_31=(Token)match(input,38,FOLLOW_3); 

                    					newLeafNode(otherlv_31, grammarAccess.getCatkinPackageAccess().getDependenciesKeyword_6_1_0());
                    				
                    otherlv_32=(Token)match(input,26,FOLLOW_20); 

                    					newLeafNode(otherlv_32, grammarAccess.getCatkinPackageAccess().getLeftCurlyBracketKeyword_6_1_1());
                    				
                    // InternalRos.g:1176:5: ( (lv_dependency_33_0= ruleDependency ) )
                    // InternalRos.g:1177:6: (lv_dependency_33_0= ruleDependency )
                    {
                    // InternalRos.g:1177:6: (lv_dependency_33_0= ruleDependency )
                    // InternalRos.g:1178:7: lv_dependency_33_0= ruleDependency
                    {

                    							newCompositeNode(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_1_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_dependency_33_0=ruleDependency();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    							}
                    							add(
                    								current,
                    								"dependency",
                    								lv_dependency_33_0,
                    								"de.fraunhofer.ipa.ros.Ros.Dependency");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:1195:5: (otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==28) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRos.g:1196:6: otherlv_34= ',' ( (lv_dependency_35_0= ruleDependency ) )
                    	    {
                    	    otherlv_34=(Token)match(input,28,FOLLOW_20); 

                    	    						newLeafNode(otherlv_34, grammarAccess.getCatkinPackageAccess().getCommaKeyword_6_1_3_0());
                    	    					
                    	    // InternalRos.g:1200:6: ( (lv_dependency_35_0= ruleDependency ) )
                    	    // InternalRos.g:1201:7: (lv_dependency_35_0= ruleDependency )
                    	    {
                    	    // InternalRos.g:1201:7: (lv_dependency_35_0= ruleDependency )
                    	    // InternalRos.g:1202:8: lv_dependency_35_0= ruleDependency
                    	    {

                    	    								newCompositeNode(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_dependency_35_0=ruleDependency();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getCatkinPackageRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"dependency",
                    	    									lv_dependency_35_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Dependency");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,29,FOLLOW_7); 

                    					newLeafNode(otherlv_36, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_6_1_4());
                    				

                    }


                    }
                    break;

            }

            otherlv_37=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_37, grammarAccess.getCatkinPackageAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:1234:1: entryRuleServiceSpec returns [EObject current=null] : iv_ruleServiceSpec= ruleServiceSpec EOF ;
    public final EObject entryRuleServiceSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceSpec = null;


        try {
            // InternalRos.g:1234:52: (iv_ruleServiceSpec= ruleServiceSpec EOF )
            // InternalRos.g:1235:2: iv_ruleServiceSpec= ruleServiceSpec EOF
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
    // InternalRos.g:1241:1: ruleServiceSpec returns [EObject current=null] : ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:1247:2: ( ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:1248:2: ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:1248:2: ( () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}' )
            // InternalRos.g:1249:3: () otherlv_1= 'ServiceSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )? otherlv_8= '}'
            {
            // InternalRos.g:1249:3: ()
            // InternalRos.g:1250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getServiceSpecAccess().getServiceSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceSpecAccess().getServiceSpecKeyword_1());
            		
            // InternalRos.g:1260:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:1261:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:1261:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:1262:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:1283:3: (otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRos.g:1284:4: otherlv_4= 'request' ( (lv_request_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,40,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getServiceSpecAccess().getRequestKeyword_4_0());
                    			
                    // InternalRos.g:1288:4: ( (lv_request_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:1289:5: (lv_request_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1289:5: (lv_request_5_0= ruleMessageDefinition )
                    // InternalRos.g:1290:6: lv_request_5_0= ruleMessageDefinition
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

            // InternalRos.g:1308:3: (otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRos.g:1309:4: otherlv_6= 'response' ( (lv_response_7_0= ruleMessageDefinition ) )
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceSpecAccess().getResponseKeyword_5_0());
                    			
                    // InternalRos.g:1313:4: ( (lv_response_7_0= ruleMessageDefinition ) )
                    // InternalRos.g:1314:5: (lv_response_7_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1314:5: (lv_response_7_0= ruleMessageDefinition )
                    // InternalRos.g:1315:6: lv_response_7_0= ruleMessageDefinition
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

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:1341:1: entryRuleTopicSpec returns [EObject current=null] : iv_ruleTopicSpec= ruleTopicSpec EOF ;
    public final EObject entryRuleTopicSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpec = null;


        try {
            // InternalRos.g:1341:50: (iv_ruleTopicSpec= ruleTopicSpec EOF )
            // InternalRos.g:1342:2: iv_ruleTopicSpec= ruleTopicSpec EOF
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
    // InternalRos.g:1348:1: ruleTopicSpec returns [EObject current=null] : ( () otherlv_1= 'TopicSpec' ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' ) ;
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
            // InternalRos.g:1354:2: ( ( () otherlv_1= 'TopicSpec' ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' ) )
            // InternalRos.g:1355:2: ( () otherlv_1= 'TopicSpec' ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' )
            {
            // InternalRos.g:1355:2: ( () otherlv_1= 'TopicSpec' ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}' )
            // InternalRos.g:1356:3: () otherlv_1= 'TopicSpec' ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) ) otherlv_3= '{' (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )? otherlv_6= '}'
            {
            // InternalRos.g:1356:3: ()
            // InternalRos.g:1357:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicSpecAccess().getTopicSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicSpecAccess().getTopicSpecKeyword_1());
            		
            // InternalRos.g:1367:3: ( ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) ) )
            // InternalRos.g:1368:4: ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) )
            {
            // InternalRos.g:1368:4: ( (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' ) )
            // InternalRos.g:1369:5: (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' )
            {
            // InternalRos.g:1369:5: (lv_name_2_1= ruleEString | lv_name_2_2= 'Header' | lv_name_2_3= 'String' )
            int alt28=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt28=1;
                }
                break;
            case 43:
                {
                alt28=2;
                }
                break;
            case 44:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalRos.g:1370:6: lv_name_2_1= ruleEString
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
                    // InternalRos.g:1386:6: lv_name_2_2= 'Header'
                    {
                    lv_name_2_2=(Token)match(input,43,FOLLOW_3); 

                    						newLeafNode(lv_name_2_2, grammarAccess.getTopicSpecAccess().getNameHeaderKeyword_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicSpecRule());
                    						}
                    						setWithLastConsumed(current, "name", lv_name_2_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalRos.g:1397:6: lv_name_2_3= 'String'
                    {
                    lv_name_2_3=(Token)match(input,44,FOLLOW_3); 

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

            otherlv_3=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:1414:3: (otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRos.g:1415:4: otherlv_4= 'message' ( (lv_message_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTopicSpecAccess().getMessageKeyword_4_0());
                    			
                    // InternalRos.g:1419:4: ( (lv_message_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:1420:5: (lv_message_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1420:5: (lv_message_5_0= ruleMessageDefinition )
                    // InternalRos.g:1421:6: lv_message_5_0= ruleMessageDefinition
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

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:1447:1: entryRuleActionSpec returns [EObject current=null] : iv_ruleActionSpec= ruleActionSpec EOF ;
    public final EObject entryRuleActionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionSpec = null;


        try {
            // InternalRos.g:1447:51: (iv_ruleActionSpec= ruleActionSpec EOF )
            // InternalRos.g:1448:2: iv_ruleActionSpec= ruleActionSpec EOF
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
    // InternalRos.g:1454:1: ruleActionSpec returns [EObject current=null] : ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' ) ;
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
            // InternalRos.g:1460:2: ( ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' ) )
            // InternalRos.g:1461:2: ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' )
            {
            // InternalRos.g:1461:2: ( () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}' )
            // InternalRos.g:1462:3: () otherlv_1= 'ActionSpec' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )? (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )? (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )? otherlv_10= '}'
            {
            // InternalRos.g:1462:3: ()
            // InternalRos.g:1463:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActionSpecAccess().getActionSpecAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getActionSpecAccess().getActionSpecKeyword_1());
            		
            // InternalRos.g:1473:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:1474:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:1474:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:1475:5: lv_name_2_0= ruleEString
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

            otherlv_3=(Token)match(input,26,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getActionSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRos.g:1496:3: (otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRos.g:1497:4: otherlv_4= 'goal' ( (lv_goal_5_0= ruleMessageDefinition ) )
                    {
                    otherlv_4=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getActionSpecAccess().getGoalKeyword_4_0());
                    			
                    // InternalRos.g:1501:4: ( (lv_goal_5_0= ruleMessageDefinition ) )
                    // InternalRos.g:1502:5: (lv_goal_5_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1502:5: (lv_goal_5_0= ruleMessageDefinition )
                    // InternalRos.g:1503:6: lv_goal_5_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getGoalMessageDefinitionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

            // InternalRos.g:1521:3: (otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==48) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRos.g:1522:4: otherlv_6= 'result' ( (lv_result_7_0= ruleMessageDefinition ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionSpecAccess().getResultKeyword_5_0());
                    			
                    // InternalRos.g:1526:4: ( (lv_result_7_0= ruleMessageDefinition ) )
                    // InternalRos.g:1527:5: (lv_result_7_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1527:5: (lv_result_7_0= ruleMessageDefinition )
                    // InternalRos.g:1528:6: lv_result_7_0= ruleMessageDefinition
                    {

                    						newCompositeNode(grammarAccess.getActionSpecAccess().getResultMessageDefinitionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

            // InternalRos.g:1546:3: (otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==49) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRos.g:1547:4: otherlv_8= 'feedback' ( (lv_feedback_9_0= ruleMessageDefinition ) )
                    {
                    otherlv_8=(Token)match(input,49,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getActionSpecAccess().getFeedbackKeyword_6_0());
                    			
                    // InternalRos.g:1551:4: ( (lv_feedback_9_0= ruleMessageDefinition ) )
                    // InternalRos.g:1552:5: (lv_feedback_9_0= ruleMessageDefinition )
                    {
                    // InternalRos.g:1552:5: (lv_feedback_9_0= ruleMessageDefinition )
                    // InternalRos.g:1553:6: lv_feedback_9_0= ruleMessageDefinition
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

            otherlv_10=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:1579:1: entryRuleMessageDefinition returns [EObject current=null] : iv_ruleMessageDefinition= ruleMessageDefinition EOF ;
    public final EObject entryRuleMessageDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageDefinition = null;


        try {
            // InternalRos.g:1579:58: (iv_ruleMessageDefinition= ruleMessageDefinition EOF )
            // InternalRos.g:1580:2: iv_ruleMessageDefinition= ruleMessageDefinition EOF
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
    // InternalRos.g:1586:1: ruleMessageDefinition returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleMessageDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_MessagePart_2_0 = null;

        EObject lv_MessagePart_3_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1592:2: ( ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' ) )
            // InternalRos.g:1593:2: ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' )
            {
            // InternalRos.g:1593:2: ( () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}' )
            // InternalRos.g:1594:3: () otherlv_1= '{' ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )? otherlv_4= '}'
            {
            // InternalRos.g:1594:3: ()
            // InternalRos.g:1595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMessageDefinitionAccess().getMessageDefinitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageDefinitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRos.g:1605:3: ( ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)||LA34_0==43||(LA34_0>=95 && LA34_0<=122)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRos.g:1606:4: ( (lv_MessagePart_2_0= ruleMessagePart ) ) ( (lv_MessagePart_3_0= ruleMessagePart ) )*
                    {
                    // InternalRos.g:1606:4: ( (lv_MessagePart_2_0= ruleMessagePart ) )
                    // InternalRos.g:1607:5: (lv_MessagePart_2_0= ruleMessagePart )
                    {
                    // InternalRos.g:1607:5: (lv_MessagePart_2_0= ruleMessagePart )
                    // InternalRos.g:1608:6: lv_MessagePart_2_0= ruleMessagePart
                    {

                    						newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_28);
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

                    // InternalRos.g:1625:4: ( (lv_MessagePart_3_0= ruleMessagePart ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_ID)||LA33_0==43||(LA33_0>=95 && LA33_0<=122)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalRos.g:1626:5: (lv_MessagePart_3_0= ruleMessagePart )
                    	    {
                    	    // InternalRos.g:1626:5: (lv_MessagePart_3_0= ruleMessagePart )
                    	    // InternalRos.g:1627:6: lv_MessagePart_3_0= ruleMessagePart
                    	    {

                    	    						newCompositeNode(grammarAccess.getMessageDefinitionAccess().getMessagePartMessagePartParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_28);
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
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:1653:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalRos.g:1653:45: (iv_ruleNode= ruleNode EOF )
            // InternalRos.g:1654:2: iv_ruleNode= ruleNode EOF
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
    // InternalRos.g:1660:1: ruleNode returns [EObject current=null] : (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) ( (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' ) | (otherlv_10= 'ServiceServers' otherlv_11= '{' ( (lv_serviceserver_12_0= ruleServiceServer ) ) (otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'publisher' otherlv_17= '{' ( (lv_publisher_18_0= rulePublisher ) ) (otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) ) )* otherlv_21= '}' ) | (otherlv_22= 'Publishers' otherlv_23= '{' ( (lv_publisher_24_0= rulePublisher ) ) (otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) ) )* otherlv_27= '}' ) )? ( (otherlv_28= 'subscriber' otherlv_29= '{' ( (lv_subscriber_30_0= ruleSubscriber ) ) (otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) ) )* otherlv_33= '}' ) | (otherlv_34= 'Subscribers' otherlv_35= '{' ( (lv_subscriber_36_0= ruleSubscriber ) ) (otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) ) )* otherlv_39= '}' ) )? ( (otherlv_40= 'serviceclient' otherlv_41= '{' ( (lv_serviceclient_42_0= ruleServiceClient ) ) (otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) ) )* otherlv_45= '}' ) | (otherlv_46= 'ServiceClients' otherlv_47= '{' ( (lv_serviceclient_48_0= ruleServiceClient ) ) (otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) ) )* otherlv_51= '}' ) )? ( (otherlv_52= 'actionserver' otherlv_53= '{' ( (lv_actionserver_54_0= ruleActionServer ) ) (otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) ) )* otherlv_57= '}' ) | (otherlv_58= 'ActionServers' otherlv_59= '{' ( (lv_actionserver_60_0= ruleActionServer ) ) (otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) ) )* otherlv_63= '}' ) )? ( (otherlv_64= 'actionclient' otherlv_65= '{' ( (lv_actionclient_66_0= ruleActionClient ) ) (otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) ) )* otherlv_69= '}' ) | (otherlv_70= 'ActionClients' otherlv_71= '{' ( (lv_actionclient_72_0= ruleActionClient ) ) (otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) ) )* otherlv_75= '}' ) )? ( (otherlv_76= 'parameter' otherlv_77= '{' ( (lv_parameter_78_0= ruleParameter ) ) (otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) ) )* otherlv_81= '}' ) | (otherlv_82= 'Parameters' otherlv_83= '{' ( (lv_parameter_84_0= ruleParameter ) ) (otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) ) )* otherlv_87= '}' ) )? otherlv_88= '}' ) ;
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
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token otherlv_73=null;
        Token otherlv_75=null;
        Token otherlv_76=null;
        Token otherlv_77=null;
        Token otherlv_79=null;
        Token otherlv_81=null;
        Token otherlv_82=null;
        Token otherlv_83=null;
        Token otherlv_85=null;
        Token otherlv_87=null;
        Token otherlv_88=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_serviceserver_6_0 = null;

        EObject lv_serviceserver_8_0 = null;

        EObject lv_serviceserver_12_0 = null;

        EObject lv_serviceserver_14_0 = null;

        EObject lv_publisher_18_0 = null;

        EObject lv_publisher_20_0 = null;

        EObject lv_publisher_24_0 = null;

        EObject lv_publisher_26_0 = null;

        EObject lv_subscriber_30_0 = null;

        EObject lv_subscriber_32_0 = null;

        EObject lv_subscriber_36_0 = null;

        EObject lv_subscriber_38_0 = null;

        EObject lv_serviceclient_42_0 = null;

        EObject lv_serviceclient_44_0 = null;

        EObject lv_serviceclient_48_0 = null;

        EObject lv_serviceclient_50_0 = null;

        EObject lv_actionserver_54_0 = null;

        EObject lv_actionserver_56_0 = null;

        EObject lv_actionserver_60_0 = null;

        EObject lv_actionserver_62_0 = null;

        EObject lv_actionclient_66_0 = null;

        EObject lv_actionclient_68_0 = null;

        EObject lv_actionclient_72_0 = null;

        EObject lv_actionclient_74_0 = null;

        EObject lv_parameter_78_0 = null;

        EObject lv_parameter_80_0 = null;

        EObject lv_parameter_84_0 = null;

        EObject lv_parameter_86_0 = null;



        	enterRule();

        try {
            // InternalRos.g:1666:2: ( (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) ( (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' ) | (otherlv_10= 'ServiceServers' otherlv_11= '{' ( (lv_serviceserver_12_0= ruleServiceServer ) ) (otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'publisher' otherlv_17= '{' ( (lv_publisher_18_0= rulePublisher ) ) (otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) ) )* otherlv_21= '}' ) | (otherlv_22= 'Publishers' otherlv_23= '{' ( (lv_publisher_24_0= rulePublisher ) ) (otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) ) )* otherlv_27= '}' ) )? ( (otherlv_28= 'subscriber' otherlv_29= '{' ( (lv_subscriber_30_0= ruleSubscriber ) ) (otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) ) )* otherlv_33= '}' ) | (otherlv_34= 'Subscribers' otherlv_35= '{' ( (lv_subscriber_36_0= ruleSubscriber ) ) (otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) ) )* otherlv_39= '}' ) )? ( (otherlv_40= 'serviceclient' otherlv_41= '{' ( (lv_serviceclient_42_0= ruleServiceClient ) ) (otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) ) )* otherlv_45= '}' ) | (otherlv_46= 'ServiceClients' otherlv_47= '{' ( (lv_serviceclient_48_0= ruleServiceClient ) ) (otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) ) )* otherlv_51= '}' ) )? ( (otherlv_52= 'actionserver' otherlv_53= '{' ( (lv_actionserver_54_0= ruleActionServer ) ) (otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) ) )* otherlv_57= '}' ) | (otherlv_58= 'ActionServers' otherlv_59= '{' ( (lv_actionserver_60_0= ruleActionServer ) ) (otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) ) )* otherlv_63= '}' ) )? ( (otherlv_64= 'actionclient' otherlv_65= '{' ( (lv_actionclient_66_0= ruleActionClient ) ) (otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) ) )* otherlv_69= '}' ) | (otherlv_70= 'ActionClients' otherlv_71= '{' ( (lv_actionclient_72_0= ruleActionClient ) ) (otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) ) )* otherlv_75= '}' ) )? ( (otherlv_76= 'parameter' otherlv_77= '{' ( (lv_parameter_78_0= ruleParameter ) ) (otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) ) )* otherlv_81= '}' ) | (otherlv_82= 'Parameters' otherlv_83= '{' ( (lv_parameter_84_0= ruleParameter ) ) (otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) ) )* otherlv_87= '}' ) )? otherlv_88= '}' ) )
            // InternalRos.g:1667:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) ( (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' ) | (otherlv_10= 'ServiceServers' otherlv_11= '{' ( (lv_serviceserver_12_0= ruleServiceServer ) ) (otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'publisher' otherlv_17= '{' ( (lv_publisher_18_0= rulePublisher ) ) (otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) ) )* otherlv_21= '}' ) | (otherlv_22= 'Publishers' otherlv_23= '{' ( (lv_publisher_24_0= rulePublisher ) ) (otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) ) )* otherlv_27= '}' ) )? ( (otherlv_28= 'subscriber' otherlv_29= '{' ( (lv_subscriber_30_0= ruleSubscriber ) ) (otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) ) )* otherlv_33= '}' ) | (otherlv_34= 'Subscribers' otherlv_35= '{' ( (lv_subscriber_36_0= ruleSubscriber ) ) (otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) ) )* otherlv_39= '}' ) )? ( (otherlv_40= 'serviceclient' otherlv_41= '{' ( (lv_serviceclient_42_0= ruleServiceClient ) ) (otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) ) )* otherlv_45= '}' ) | (otherlv_46= 'ServiceClients' otherlv_47= '{' ( (lv_serviceclient_48_0= ruleServiceClient ) ) (otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) ) )* otherlv_51= '}' ) )? ( (otherlv_52= 'actionserver' otherlv_53= '{' ( (lv_actionserver_54_0= ruleActionServer ) ) (otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) ) )* otherlv_57= '}' ) | (otherlv_58= 'ActionServers' otherlv_59= '{' ( (lv_actionserver_60_0= ruleActionServer ) ) (otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) ) )* otherlv_63= '}' ) )? ( (otherlv_64= 'actionclient' otherlv_65= '{' ( (lv_actionclient_66_0= ruleActionClient ) ) (otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) ) )* otherlv_69= '}' ) | (otherlv_70= 'ActionClients' otherlv_71= '{' ( (lv_actionclient_72_0= ruleActionClient ) ) (otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) ) )* otherlv_75= '}' ) )? ( (otherlv_76= 'parameter' otherlv_77= '{' ( (lv_parameter_78_0= ruleParameter ) ) (otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) ) )* otherlv_81= '}' ) | (otherlv_82= 'Parameters' otherlv_83= '{' ( (lv_parameter_84_0= ruleParameter ) ) (otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) ) )* otherlv_87= '}' ) )? otherlv_88= '}' )
            {
            // InternalRos.g:1667:2: (otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) ( (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' ) | (otherlv_10= 'ServiceServers' otherlv_11= '{' ( (lv_serviceserver_12_0= ruleServiceServer ) ) (otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'publisher' otherlv_17= '{' ( (lv_publisher_18_0= rulePublisher ) ) (otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) ) )* otherlv_21= '}' ) | (otherlv_22= 'Publishers' otherlv_23= '{' ( (lv_publisher_24_0= rulePublisher ) ) (otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) ) )* otherlv_27= '}' ) )? ( (otherlv_28= 'subscriber' otherlv_29= '{' ( (lv_subscriber_30_0= ruleSubscriber ) ) (otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) ) )* otherlv_33= '}' ) | (otherlv_34= 'Subscribers' otherlv_35= '{' ( (lv_subscriber_36_0= ruleSubscriber ) ) (otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) ) )* otherlv_39= '}' ) )? ( (otherlv_40= 'serviceclient' otherlv_41= '{' ( (lv_serviceclient_42_0= ruleServiceClient ) ) (otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) ) )* otherlv_45= '}' ) | (otherlv_46= 'ServiceClients' otherlv_47= '{' ( (lv_serviceclient_48_0= ruleServiceClient ) ) (otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) ) )* otherlv_51= '}' ) )? ( (otherlv_52= 'actionserver' otherlv_53= '{' ( (lv_actionserver_54_0= ruleActionServer ) ) (otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) ) )* otherlv_57= '}' ) | (otherlv_58= 'ActionServers' otherlv_59= '{' ( (lv_actionserver_60_0= ruleActionServer ) ) (otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) ) )* otherlv_63= '}' ) )? ( (otherlv_64= 'actionclient' otherlv_65= '{' ( (lv_actionclient_66_0= ruleActionClient ) ) (otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) ) )* otherlv_69= '}' ) | (otherlv_70= 'ActionClients' otherlv_71= '{' ( (lv_actionclient_72_0= ruleActionClient ) ) (otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) ) )* otherlv_75= '}' ) )? ( (otherlv_76= 'parameter' otherlv_77= '{' ( (lv_parameter_78_0= ruleParameter ) ) (otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) ) )* otherlv_81= '}' ) | (otherlv_82= 'Parameters' otherlv_83= '{' ( (lv_parameter_84_0= ruleParameter ) ) (otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) ) )* otherlv_87= '}' ) )? otherlv_88= '}' )
            // InternalRos.g:1668:3: otherlv_0= 'Node' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleRosNames ) ) ( (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' ) | (otherlv_10= 'ServiceServers' otherlv_11= '{' ( (lv_serviceserver_12_0= ruleServiceServer ) ) (otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) ) )* otherlv_15= '}' ) )? ( (otherlv_16= 'publisher' otherlv_17= '{' ( (lv_publisher_18_0= rulePublisher ) ) (otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) ) )* otherlv_21= '}' ) | (otherlv_22= 'Publishers' otherlv_23= '{' ( (lv_publisher_24_0= rulePublisher ) ) (otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) ) )* otherlv_27= '}' ) )? ( (otherlv_28= 'subscriber' otherlv_29= '{' ( (lv_subscriber_30_0= ruleSubscriber ) ) (otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) ) )* otherlv_33= '}' ) | (otherlv_34= 'Subscribers' otherlv_35= '{' ( (lv_subscriber_36_0= ruleSubscriber ) ) (otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) ) )* otherlv_39= '}' ) )? ( (otherlv_40= 'serviceclient' otherlv_41= '{' ( (lv_serviceclient_42_0= ruleServiceClient ) ) (otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) ) )* otherlv_45= '}' ) | (otherlv_46= 'ServiceClients' otherlv_47= '{' ( (lv_serviceclient_48_0= ruleServiceClient ) ) (otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) ) )* otherlv_51= '}' ) )? ( (otherlv_52= 'actionserver' otherlv_53= '{' ( (lv_actionserver_54_0= ruleActionServer ) ) (otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) ) )* otherlv_57= '}' ) | (otherlv_58= 'ActionServers' otherlv_59= '{' ( (lv_actionserver_60_0= ruleActionServer ) ) (otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) ) )* otherlv_63= '}' ) )? ( (otherlv_64= 'actionclient' otherlv_65= '{' ( (lv_actionclient_66_0= ruleActionClient ) ) (otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) ) )* otherlv_69= '}' ) | (otherlv_70= 'ActionClients' otherlv_71= '{' ( (lv_actionclient_72_0= ruleActionClient ) ) (otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) ) )* otherlv_75= '}' ) )? ( (otherlv_76= 'parameter' otherlv_77= '{' ( (lv_parameter_78_0= ruleParameter ) ) (otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) ) )* otherlv_81= '}' ) | (otherlv_82= 'Parameters' otherlv_83= '{' ( (lv_parameter_84_0= ruleParameter ) ) (otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) ) )* otherlv_87= '}' ) )? otherlv_88= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNodeAccess().getNodeKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getNameKeyword_2());
            		
            // InternalRos.g:1680:3: ( (lv_name_3_0= ruleRosNames ) )
            // InternalRos.g:1681:4: (lv_name_3_0= ruleRosNames )
            {
            // InternalRos.g:1681:4: (lv_name_3_0= ruleRosNames )
            // InternalRos.g:1682:5: lv_name_3_0= ruleRosNames
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameRosNamesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalRos.g:1699:3: ( (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' ) | (otherlv_10= 'ServiceServers' otherlv_11= '{' ( (lv_serviceserver_12_0= ruleServiceServer ) ) (otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) ) )* otherlv_15= '}' ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==52) ) {
                alt37=1;
            }
            else if ( (LA37_0==53) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // InternalRos.g:1700:4: (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )
                    {
                    // InternalRos.g:1700:4: (otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}' )
                    // InternalRos.g:1701:5: otherlv_4= 'serviceserver' otherlv_5= '{' ( (lv_serviceserver_6_0= ruleServiceServer ) ) (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,52,FOLLOW_3); 

                    					newLeafNode(otherlv_4, grammarAccess.getNodeAccess().getServiceserverKeyword_4_0_0());
                    				
                    otherlv_5=(Token)match(input,26,FOLLOW_31); 

                    					newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_0_1());
                    				
                    // InternalRos.g:1709:5: ( (lv_serviceserver_6_0= ruleServiceServer ) )
                    // InternalRos.g:1710:6: (lv_serviceserver_6_0= ruleServiceServer )
                    {
                    // InternalRos.g:1710:6: (lv_serviceserver_6_0= ruleServiceServer )
                    // InternalRos.g:1711:7: lv_serviceserver_6_0= ruleServiceServer
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_0_2_0());
                    						
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

                    // InternalRos.g:1728:5: (otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==28) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalRos.g:1729:6: otherlv_7= ',' ( (lv_serviceserver_8_0= ruleServiceServer ) )
                    	    {
                    	    otherlv_7=(Token)match(input,28,FOLLOW_31); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getCommaKeyword_4_0_3_0());
                    	    					
                    	    // InternalRos.g:1733:6: ( (lv_serviceserver_8_0= ruleServiceServer ) )
                    	    // InternalRos.g:1734:7: (lv_serviceserver_8_0= ruleServiceServer )
                    	    {
                    	    // InternalRos.g:1734:7: (lv_serviceserver_8_0= ruleServiceServer )
                    	    // InternalRos.g:1735:8: lv_serviceserver_8_0= ruleServiceServer
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_0_3_1_0());
                    	    							
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
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,29,FOLLOW_32); 

                    					newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:1759:4: (otherlv_10= 'ServiceServers' otherlv_11= '{' ( (lv_serviceserver_12_0= ruleServiceServer ) ) (otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) ) )* otherlv_15= '}' )
                    {
                    // InternalRos.g:1759:4: (otherlv_10= 'ServiceServers' otherlv_11= '{' ( (lv_serviceserver_12_0= ruleServiceServer ) ) (otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) ) )* otherlv_15= '}' )
                    // InternalRos.g:1760:5: otherlv_10= 'ServiceServers' otherlv_11= '{' ( (lv_serviceserver_12_0= ruleServiceServer ) ) (otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,53,FOLLOW_3); 

                    					newLeafNode(otherlv_10, grammarAccess.getNodeAccess().getServiceServersKeyword_4_1_0());
                    				
                    otherlv_11=(Token)match(input,26,FOLLOW_31); 

                    					newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_4_1_1());
                    				
                    // InternalRos.g:1768:5: ( (lv_serviceserver_12_0= ruleServiceServer ) )
                    // InternalRos.g:1769:6: (lv_serviceserver_12_0= ruleServiceServer )
                    {
                    // InternalRos.g:1769:6: (lv_serviceserver_12_0= ruleServiceServer )
                    // InternalRos.g:1770:7: lv_serviceserver_12_0= ruleServiceServer
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_1_2_0());
                    						
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:1787:5: (otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==28) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalRos.g:1788:6: otherlv_13= ',' ( (lv_serviceserver_14_0= ruleServiceServer ) )
                    	    {
                    	    otherlv_13=(Token)match(input,28,FOLLOW_31); 

                    	    						newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getCommaKeyword_4_1_3_0());
                    	    					
                    	    // InternalRos.g:1792:6: ( (lv_serviceserver_14_0= ruleServiceServer ) )
                    	    // InternalRos.g:1793:7: (lv_serviceserver_14_0= ruleServiceServer )
                    	    {
                    	    // InternalRos.g:1793:7: (lv_serviceserver_14_0= ruleServiceServer )
                    	    // InternalRos.g:1794:8: lv_serviceserver_14_0= ruleServiceServer
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getServiceserverServiceServerParserRuleCall_4_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_serviceserver_14_0=ruleServiceServer();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"serviceserver",
                    	    									lv_serviceserver_14_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.ServiceServer");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,29,FOLLOW_32); 

                    					newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_4_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalRos.g:1818:3: ( (otherlv_16= 'publisher' otherlv_17= '{' ( (lv_publisher_18_0= rulePublisher ) ) (otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) ) )* otherlv_21= '}' ) | (otherlv_22= 'Publishers' otherlv_23= '{' ( (lv_publisher_24_0= rulePublisher ) ) (otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) ) )* otherlv_27= '}' ) )?
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==54) ) {
                alt40=1;
            }
            else if ( (LA40_0==55) ) {
                alt40=2;
            }
            switch (alt40) {
                case 1 :
                    // InternalRos.g:1819:4: (otherlv_16= 'publisher' otherlv_17= '{' ( (lv_publisher_18_0= rulePublisher ) ) (otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) ) )* otherlv_21= '}' )
                    {
                    // InternalRos.g:1819:4: (otherlv_16= 'publisher' otherlv_17= '{' ( (lv_publisher_18_0= rulePublisher ) ) (otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) ) )* otherlv_21= '}' )
                    // InternalRos.g:1820:5: otherlv_16= 'publisher' otherlv_17= '{' ( (lv_publisher_18_0= rulePublisher ) ) (otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,54,FOLLOW_3); 

                    					newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getPublisherKeyword_5_0_0());
                    				
                    otherlv_17=(Token)match(input,26,FOLLOW_33); 

                    					newLeafNode(otherlv_17, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_5_0_1());
                    				
                    // InternalRos.g:1828:5: ( (lv_publisher_18_0= rulePublisher ) )
                    // InternalRos.g:1829:6: (lv_publisher_18_0= rulePublisher )
                    {
                    // InternalRos.g:1829:6: (lv_publisher_18_0= rulePublisher )
                    // InternalRos.g:1830:7: lv_publisher_18_0= rulePublisher
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_5_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_publisher_18_0=rulePublisher();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"publisher",
                    								lv_publisher_18_0,
                    								"de.fraunhofer.ipa.ros.Ros.Publisher");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:1847:5: (otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==28) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalRos.g:1848:6: otherlv_19= ',' ( (lv_publisher_20_0= rulePublisher ) )
                    	    {
                    	    otherlv_19=(Token)match(input,28,FOLLOW_33); 

                    	    						newLeafNode(otherlv_19, grammarAccess.getNodeAccess().getCommaKeyword_5_0_3_0());
                    	    					
                    	    // InternalRos.g:1852:6: ( (lv_publisher_20_0= rulePublisher ) )
                    	    // InternalRos.g:1853:7: (lv_publisher_20_0= rulePublisher )
                    	    {
                    	    // InternalRos.g:1853:7: (lv_publisher_20_0= rulePublisher )
                    	    // InternalRos.g:1854:8: lv_publisher_20_0= rulePublisher
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_5_0_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_publisher_20_0=rulePublisher();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"publisher",
                    	    									lv_publisher_20_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Publisher");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,29,FOLLOW_34); 

                    					newLeafNode(otherlv_21, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_5_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:1878:4: (otherlv_22= 'Publishers' otherlv_23= '{' ( (lv_publisher_24_0= rulePublisher ) ) (otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) ) )* otherlv_27= '}' )
                    {
                    // InternalRos.g:1878:4: (otherlv_22= 'Publishers' otherlv_23= '{' ( (lv_publisher_24_0= rulePublisher ) ) (otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) ) )* otherlv_27= '}' )
                    // InternalRos.g:1879:5: otherlv_22= 'Publishers' otherlv_23= '{' ( (lv_publisher_24_0= rulePublisher ) ) (otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,55,FOLLOW_3); 

                    					newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getPublishersKeyword_5_1_0());
                    				
                    otherlv_23=(Token)match(input,26,FOLLOW_33); 

                    					newLeafNode(otherlv_23, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_5_1_1());
                    				
                    // InternalRos.g:1887:5: ( (lv_publisher_24_0= rulePublisher ) )
                    // InternalRos.g:1888:6: (lv_publisher_24_0= rulePublisher )
                    {
                    // InternalRos.g:1888:6: (lv_publisher_24_0= rulePublisher )
                    // InternalRos.g:1889:7: lv_publisher_24_0= rulePublisher
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_5_1_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_publisher_24_0=rulePublisher();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"publisher",
                    								lv_publisher_24_0,
                    								"de.fraunhofer.ipa.ros.Ros.Publisher");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:1906:5: (otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==28) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalRos.g:1907:6: otherlv_25= ',' ( (lv_publisher_26_0= rulePublisher ) )
                    	    {
                    	    otherlv_25=(Token)match(input,28,FOLLOW_33); 

                    	    						newLeafNode(otherlv_25, grammarAccess.getNodeAccess().getCommaKeyword_5_1_3_0());
                    	    					
                    	    // InternalRos.g:1911:6: ( (lv_publisher_26_0= rulePublisher ) )
                    	    // InternalRos.g:1912:7: (lv_publisher_26_0= rulePublisher )
                    	    {
                    	    // InternalRos.g:1912:7: (lv_publisher_26_0= rulePublisher )
                    	    // InternalRos.g:1913:8: lv_publisher_26_0= rulePublisher
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_5_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_publisher_26_0=rulePublisher();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"publisher",
                    	    									lv_publisher_26_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Publisher");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,29,FOLLOW_34); 

                    					newLeafNode(otherlv_27, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_5_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalRos.g:1937:3: ( (otherlv_28= 'subscriber' otherlv_29= '{' ( (lv_subscriber_30_0= ruleSubscriber ) ) (otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) ) )* otherlv_33= '}' ) | (otherlv_34= 'Subscribers' otherlv_35= '{' ( (lv_subscriber_36_0= ruleSubscriber ) ) (otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) ) )* otherlv_39= '}' ) )?
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            else if ( (LA43_0==57) ) {
                alt43=2;
            }
            switch (alt43) {
                case 1 :
                    // InternalRos.g:1938:4: (otherlv_28= 'subscriber' otherlv_29= '{' ( (lv_subscriber_30_0= ruleSubscriber ) ) (otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) ) )* otherlv_33= '}' )
                    {
                    // InternalRos.g:1938:4: (otherlv_28= 'subscriber' otherlv_29= '{' ( (lv_subscriber_30_0= ruleSubscriber ) ) (otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) ) )* otherlv_33= '}' )
                    // InternalRos.g:1939:5: otherlv_28= 'subscriber' otherlv_29= '{' ( (lv_subscriber_30_0= ruleSubscriber ) ) (otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,56,FOLLOW_3); 

                    					newLeafNode(otherlv_28, grammarAccess.getNodeAccess().getSubscriberKeyword_6_0_0());
                    				
                    otherlv_29=(Token)match(input,26,FOLLOW_35); 

                    					newLeafNode(otherlv_29, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_6_0_1());
                    				
                    // InternalRos.g:1947:5: ( (lv_subscriber_30_0= ruleSubscriber ) )
                    // InternalRos.g:1948:6: (lv_subscriber_30_0= ruleSubscriber )
                    {
                    // InternalRos.g:1948:6: (lv_subscriber_30_0= ruleSubscriber )
                    // InternalRos.g:1949:7: lv_subscriber_30_0= ruleSubscriber
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_6_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_subscriber_30_0=ruleSubscriber();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"subscriber",
                    								lv_subscriber_30_0,
                    								"de.fraunhofer.ipa.ros.Ros.Subscriber");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:1966:5: (otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==28) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalRos.g:1967:6: otherlv_31= ',' ( (lv_subscriber_32_0= ruleSubscriber ) )
                    	    {
                    	    otherlv_31=(Token)match(input,28,FOLLOW_35); 

                    	    						newLeafNode(otherlv_31, grammarAccess.getNodeAccess().getCommaKeyword_6_0_3_0());
                    	    					
                    	    // InternalRos.g:1971:6: ( (lv_subscriber_32_0= ruleSubscriber ) )
                    	    // InternalRos.g:1972:7: (lv_subscriber_32_0= ruleSubscriber )
                    	    {
                    	    // InternalRos.g:1972:7: (lv_subscriber_32_0= ruleSubscriber )
                    	    // InternalRos.g:1973:8: lv_subscriber_32_0= ruleSubscriber
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_6_0_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_subscriber_32_0=ruleSubscriber();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"subscriber",
                    	    									lv_subscriber_32_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Subscriber");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,29,FOLLOW_36); 

                    					newLeafNode(otherlv_33, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_6_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:1997:4: (otherlv_34= 'Subscribers' otherlv_35= '{' ( (lv_subscriber_36_0= ruleSubscriber ) ) (otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) ) )* otherlv_39= '}' )
                    {
                    // InternalRos.g:1997:4: (otherlv_34= 'Subscribers' otherlv_35= '{' ( (lv_subscriber_36_0= ruleSubscriber ) ) (otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) ) )* otherlv_39= '}' )
                    // InternalRos.g:1998:5: otherlv_34= 'Subscribers' otherlv_35= '{' ( (lv_subscriber_36_0= ruleSubscriber ) ) (otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,57,FOLLOW_3); 

                    					newLeafNode(otherlv_34, grammarAccess.getNodeAccess().getSubscribersKeyword_6_1_0());
                    				
                    otherlv_35=(Token)match(input,26,FOLLOW_35); 

                    					newLeafNode(otherlv_35, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_6_1_1());
                    				
                    // InternalRos.g:2006:5: ( (lv_subscriber_36_0= ruleSubscriber ) )
                    // InternalRos.g:2007:6: (lv_subscriber_36_0= ruleSubscriber )
                    {
                    // InternalRos.g:2007:6: (lv_subscriber_36_0= ruleSubscriber )
                    // InternalRos.g:2008:7: lv_subscriber_36_0= ruleSubscriber
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_6_1_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_subscriber_36_0=ruleSubscriber();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"subscriber",
                    								lv_subscriber_36_0,
                    								"de.fraunhofer.ipa.ros.Ros.Subscriber");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:2025:5: (otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==28) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalRos.g:2026:6: otherlv_37= ',' ( (lv_subscriber_38_0= ruleSubscriber ) )
                    	    {
                    	    otherlv_37=(Token)match(input,28,FOLLOW_35); 

                    	    						newLeafNode(otherlv_37, grammarAccess.getNodeAccess().getCommaKeyword_6_1_3_0());
                    	    					
                    	    // InternalRos.g:2030:6: ( (lv_subscriber_38_0= ruleSubscriber ) )
                    	    // InternalRos.g:2031:7: (lv_subscriber_38_0= ruleSubscriber )
                    	    {
                    	    // InternalRos.g:2031:7: (lv_subscriber_38_0= ruleSubscriber )
                    	    // InternalRos.g:2032:8: lv_subscriber_38_0= ruleSubscriber
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_6_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_subscriber_38_0=ruleSubscriber();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"subscriber",
                    	    									lv_subscriber_38_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Subscriber");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,29,FOLLOW_36); 

                    					newLeafNode(otherlv_39, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_6_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalRos.g:2056:3: ( (otherlv_40= 'serviceclient' otherlv_41= '{' ( (lv_serviceclient_42_0= ruleServiceClient ) ) (otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) ) )* otherlv_45= '}' ) | (otherlv_46= 'ServiceClients' otherlv_47= '{' ( (lv_serviceclient_48_0= ruleServiceClient ) ) (otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) ) )* otherlv_51= '}' ) )?
            int alt46=3;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            else if ( (LA46_0==59) ) {
                alt46=2;
            }
            switch (alt46) {
                case 1 :
                    // InternalRos.g:2057:4: (otherlv_40= 'serviceclient' otherlv_41= '{' ( (lv_serviceclient_42_0= ruleServiceClient ) ) (otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) ) )* otherlv_45= '}' )
                    {
                    // InternalRos.g:2057:4: (otherlv_40= 'serviceclient' otherlv_41= '{' ( (lv_serviceclient_42_0= ruleServiceClient ) ) (otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) ) )* otherlv_45= '}' )
                    // InternalRos.g:2058:5: otherlv_40= 'serviceclient' otherlv_41= '{' ( (lv_serviceclient_42_0= ruleServiceClient ) ) (otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) ) )* otherlv_45= '}'
                    {
                    otherlv_40=(Token)match(input,58,FOLLOW_3); 

                    					newLeafNode(otherlv_40, grammarAccess.getNodeAccess().getServiceclientKeyword_7_0_0());
                    				
                    otherlv_41=(Token)match(input,26,FOLLOW_37); 

                    					newLeafNode(otherlv_41, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7_0_1());
                    				
                    // InternalRos.g:2066:5: ( (lv_serviceclient_42_0= ruleServiceClient ) )
                    // InternalRos.g:2067:6: (lv_serviceclient_42_0= ruleServiceClient )
                    {
                    // InternalRos.g:2067:6: (lv_serviceclient_42_0= ruleServiceClient )
                    // InternalRos.g:2068:7: lv_serviceclient_42_0= ruleServiceClient
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_7_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_serviceclient_42_0=ruleServiceClient();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"serviceclient",
                    								lv_serviceclient_42_0,
                    								"de.fraunhofer.ipa.ros.Ros.ServiceClient");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:2085:5: (otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==28) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalRos.g:2086:6: otherlv_43= ',' ( (lv_serviceclient_44_0= ruleServiceClient ) )
                    	    {
                    	    otherlv_43=(Token)match(input,28,FOLLOW_37); 

                    	    						newLeafNode(otherlv_43, grammarAccess.getNodeAccess().getCommaKeyword_7_0_3_0());
                    	    					
                    	    // InternalRos.g:2090:6: ( (lv_serviceclient_44_0= ruleServiceClient ) )
                    	    // InternalRos.g:2091:7: (lv_serviceclient_44_0= ruleServiceClient )
                    	    {
                    	    // InternalRos.g:2091:7: (lv_serviceclient_44_0= ruleServiceClient )
                    	    // InternalRos.g:2092:8: lv_serviceclient_44_0= ruleServiceClient
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_7_0_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_serviceclient_44_0=ruleServiceClient();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"serviceclient",
                    	    									lv_serviceclient_44_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.ServiceClient");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_45=(Token)match(input,29,FOLLOW_38); 

                    					newLeafNode(otherlv_45, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_7_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:2116:4: (otherlv_46= 'ServiceClients' otherlv_47= '{' ( (lv_serviceclient_48_0= ruleServiceClient ) ) (otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) ) )* otherlv_51= '}' )
                    {
                    // InternalRos.g:2116:4: (otherlv_46= 'ServiceClients' otherlv_47= '{' ( (lv_serviceclient_48_0= ruleServiceClient ) ) (otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) ) )* otherlv_51= '}' )
                    // InternalRos.g:2117:5: otherlv_46= 'ServiceClients' otherlv_47= '{' ( (lv_serviceclient_48_0= ruleServiceClient ) ) (otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) ) )* otherlv_51= '}'
                    {
                    otherlv_46=(Token)match(input,59,FOLLOW_3); 

                    					newLeafNode(otherlv_46, grammarAccess.getNodeAccess().getServiceClientsKeyword_7_1_0());
                    				
                    otherlv_47=(Token)match(input,26,FOLLOW_37); 

                    					newLeafNode(otherlv_47, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_7_1_1());
                    				
                    // InternalRos.g:2125:5: ( (lv_serviceclient_48_0= ruleServiceClient ) )
                    // InternalRos.g:2126:6: (lv_serviceclient_48_0= ruleServiceClient )
                    {
                    // InternalRos.g:2126:6: (lv_serviceclient_48_0= ruleServiceClient )
                    // InternalRos.g:2127:7: lv_serviceclient_48_0= ruleServiceClient
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_7_1_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_serviceclient_48_0=ruleServiceClient();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"serviceclient",
                    								lv_serviceclient_48_0,
                    								"de.fraunhofer.ipa.ros.Ros.ServiceClient");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:2144:5: (otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==28) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalRos.g:2145:6: otherlv_49= ',' ( (lv_serviceclient_50_0= ruleServiceClient ) )
                    	    {
                    	    otherlv_49=(Token)match(input,28,FOLLOW_37); 

                    	    						newLeafNode(otherlv_49, grammarAccess.getNodeAccess().getCommaKeyword_7_1_3_0());
                    	    					
                    	    // InternalRos.g:2149:6: ( (lv_serviceclient_50_0= ruleServiceClient ) )
                    	    // InternalRos.g:2150:7: (lv_serviceclient_50_0= ruleServiceClient )
                    	    {
                    	    // InternalRos.g:2150:7: (lv_serviceclient_50_0= ruleServiceClient )
                    	    // InternalRos.g:2151:8: lv_serviceclient_50_0= ruleServiceClient
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getServiceclientServiceClientParserRuleCall_7_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_serviceclient_50_0=ruleServiceClient();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"serviceclient",
                    	    									lv_serviceclient_50_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.ServiceClient");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_51=(Token)match(input,29,FOLLOW_38); 

                    					newLeafNode(otherlv_51, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_7_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalRos.g:2175:3: ( (otherlv_52= 'actionserver' otherlv_53= '{' ( (lv_actionserver_54_0= ruleActionServer ) ) (otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) ) )* otherlv_57= '}' ) | (otherlv_58= 'ActionServers' otherlv_59= '{' ( (lv_actionserver_60_0= ruleActionServer ) ) (otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) ) )* otherlv_63= '}' ) )?
            int alt49=3;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==60) ) {
                alt49=1;
            }
            else if ( (LA49_0==61) ) {
                alt49=2;
            }
            switch (alt49) {
                case 1 :
                    // InternalRos.g:2176:4: (otherlv_52= 'actionserver' otherlv_53= '{' ( (lv_actionserver_54_0= ruleActionServer ) ) (otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) ) )* otherlv_57= '}' )
                    {
                    // InternalRos.g:2176:4: (otherlv_52= 'actionserver' otherlv_53= '{' ( (lv_actionserver_54_0= ruleActionServer ) ) (otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) ) )* otherlv_57= '}' )
                    // InternalRos.g:2177:5: otherlv_52= 'actionserver' otherlv_53= '{' ( (lv_actionserver_54_0= ruleActionServer ) ) (otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) ) )* otherlv_57= '}'
                    {
                    otherlv_52=(Token)match(input,60,FOLLOW_3); 

                    					newLeafNode(otherlv_52, grammarAccess.getNodeAccess().getActionserverKeyword_8_0_0());
                    				
                    otherlv_53=(Token)match(input,26,FOLLOW_39); 

                    					newLeafNode(otherlv_53, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_8_0_1());
                    				
                    // InternalRos.g:2185:5: ( (lv_actionserver_54_0= ruleActionServer ) )
                    // InternalRos.g:2186:6: (lv_actionserver_54_0= ruleActionServer )
                    {
                    // InternalRos.g:2186:6: (lv_actionserver_54_0= ruleActionServer )
                    // InternalRos.g:2187:7: lv_actionserver_54_0= ruleActionServer
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_8_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_actionserver_54_0=ruleActionServer();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"actionserver",
                    								lv_actionserver_54_0,
                    								"de.fraunhofer.ipa.ros.Ros.ActionServer");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:2204:5: (otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==28) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalRos.g:2205:6: otherlv_55= ',' ( (lv_actionserver_56_0= ruleActionServer ) )
                    	    {
                    	    otherlv_55=(Token)match(input,28,FOLLOW_39); 

                    	    						newLeafNode(otherlv_55, grammarAccess.getNodeAccess().getCommaKeyword_8_0_3_0());
                    	    					
                    	    // InternalRos.g:2209:6: ( (lv_actionserver_56_0= ruleActionServer ) )
                    	    // InternalRos.g:2210:7: (lv_actionserver_56_0= ruleActionServer )
                    	    {
                    	    // InternalRos.g:2210:7: (lv_actionserver_56_0= ruleActionServer )
                    	    // InternalRos.g:2211:8: lv_actionserver_56_0= ruleActionServer
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_8_0_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_actionserver_56_0=ruleActionServer();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"actionserver",
                    	    									lv_actionserver_56_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.ActionServer");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_57=(Token)match(input,29,FOLLOW_40); 

                    					newLeafNode(otherlv_57, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_8_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:2235:4: (otherlv_58= 'ActionServers' otherlv_59= '{' ( (lv_actionserver_60_0= ruleActionServer ) ) (otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) ) )* otherlv_63= '}' )
                    {
                    // InternalRos.g:2235:4: (otherlv_58= 'ActionServers' otherlv_59= '{' ( (lv_actionserver_60_0= ruleActionServer ) ) (otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) ) )* otherlv_63= '}' )
                    // InternalRos.g:2236:5: otherlv_58= 'ActionServers' otherlv_59= '{' ( (lv_actionserver_60_0= ruleActionServer ) ) (otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) ) )* otherlv_63= '}'
                    {
                    otherlv_58=(Token)match(input,61,FOLLOW_3); 

                    					newLeafNode(otherlv_58, grammarAccess.getNodeAccess().getActionServersKeyword_8_1_0());
                    				
                    otherlv_59=(Token)match(input,26,FOLLOW_39); 

                    					newLeafNode(otherlv_59, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_8_1_1());
                    				
                    // InternalRos.g:2244:5: ( (lv_actionserver_60_0= ruleActionServer ) )
                    // InternalRos.g:2245:6: (lv_actionserver_60_0= ruleActionServer )
                    {
                    // InternalRos.g:2245:6: (lv_actionserver_60_0= ruleActionServer )
                    // InternalRos.g:2246:7: lv_actionserver_60_0= ruleActionServer
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_8_1_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_actionserver_60_0=ruleActionServer();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"actionserver",
                    								lv_actionserver_60_0,
                    								"de.fraunhofer.ipa.ros.Ros.ActionServer");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:2263:5: (otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) ) )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==28) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalRos.g:2264:6: otherlv_61= ',' ( (lv_actionserver_62_0= ruleActionServer ) )
                    	    {
                    	    otherlv_61=(Token)match(input,28,FOLLOW_39); 

                    	    						newLeafNode(otherlv_61, grammarAccess.getNodeAccess().getCommaKeyword_8_1_3_0());
                    	    					
                    	    // InternalRos.g:2268:6: ( (lv_actionserver_62_0= ruleActionServer ) )
                    	    // InternalRos.g:2269:7: (lv_actionserver_62_0= ruleActionServer )
                    	    {
                    	    // InternalRos.g:2269:7: (lv_actionserver_62_0= ruleActionServer )
                    	    // InternalRos.g:2270:8: lv_actionserver_62_0= ruleActionServer
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getActionserverActionServerParserRuleCall_8_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_actionserver_62_0=ruleActionServer();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"actionserver",
                    	    									lv_actionserver_62_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.ActionServer");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);

                    otherlv_63=(Token)match(input,29,FOLLOW_40); 

                    					newLeafNode(otherlv_63, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_8_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalRos.g:2294:3: ( (otherlv_64= 'actionclient' otherlv_65= '{' ( (lv_actionclient_66_0= ruleActionClient ) ) (otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) ) )* otherlv_69= '}' ) | (otherlv_70= 'ActionClients' otherlv_71= '{' ( (lv_actionclient_72_0= ruleActionClient ) ) (otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) ) )* otherlv_75= '}' ) )?
            int alt52=3;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==62) ) {
                alt52=1;
            }
            else if ( (LA52_0==63) ) {
                alt52=2;
            }
            switch (alt52) {
                case 1 :
                    // InternalRos.g:2295:4: (otherlv_64= 'actionclient' otherlv_65= '{' ( (lv_actionclient_66_0= ruleActionClient ) ) (otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) ) )* otherlv_69= '}' )
                    {
                    // InternalRos.g:2295:4: (otherlv_64= 'actionclient' otherlv_65= '{' ( (lv_actionclient_66_0= ruleActionClient ) ) (otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) ) )* otherlv_69= '}' )
                    // InternalRos.g:2296:5: otherlv_64= 'actionclient' otherlv_65= '{' ( (lv_actionclient_66_0= ruleActionClient ) ) (otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) ) )* otherlv_69= '}'
                    {
                    otherlv_64=(Token)match(input,62,FOLLOW_3); 

                    					newLeafNode(otherlv_64, grammarAccess.getNodeAccess().getActionclientKeyword_9_0_0());
                    				
                    otherlv_65=(Token)match(input,26,FOLLOW_41); 

                    					newLeafNode(otherlv_65, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_9_0_1());
                    				
                    // InternalRos.g:2304:5: ( (lv_actionclient_66_0= ruleActionClient ) )
                    // InternalRos.g:2305:6: (lv_actionclient_66_0= ruleActionClient )
                    {
                    // InternalRos.g:2305:6: (lv_actionclient_66_0= ruleActionClient )
                    // InternalRos.g:2306:7: lv_actionclient_66_0= ruleActionClient
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_9_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_actionclient_66_0=ruleActionClient();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"actionclient",
                    								lv_actionclient_66_0,
                    								"de.fraunhofer.ipa.ros.Ros.ActionClient");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:2323:5: (otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==28) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalRos.g:2324:6: otherlv_67= ',' ( (lv_actionclient_68_0= ruleActionClient ) )
                    	    {
                    	    otherlv_67=(Token)match(input,28,FOLLOW_41); 

                    	    						newLeafNode(otherlv_67, grammarAccess.getNodeAccess().getCommaKeyword_9_0_3_0());
                    	    					
                    	    // InternalRos.g:2328:6: ( (lv_actionclient_68_0= ruleActionClient ) )
                    	    // InternalRos.g:2329:7: (lv_actionclient_68_0= ruleActionClient )
                    	    {
                    	    // InternalRos.g:2329:7: (lv_actionclient_68_0= ruleActionClient )
                    	    // InternalRos.g:2330:8: lv_actionclient_68_0= ruleActionClient
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_9_0_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_actionclient_68_0=ruleActionClient();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"actionclient",
                    	    									lv_actionclient_68_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.ActionClient");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_69=(Token)match(input,29,FOLLOW_42); 

                    					newLeafNode(otherlv_69, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_9_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:2354:4: (otherlv_70= 'ActionClients' otherlv_71= '{' ( (lv_actionclient_72_0= ruleActionClient ) ) (otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) ) )* otherlv_75= '}' )
                    {
                    // InternalRos.g:2354:4: (otherlv_70= 'ActionClients' otherlv_71= '{' ( (lv_actionclient_72_0= ruleActionClient ) ) (otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) ) )* otherlv_75= '}' )
                    // InternalRos.g:2355:5: otherlv_70= 'ActionClients' otherlv_71= '{' ( (lv_actionclient_72_0= ruleActionClient ) ) (otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) ) )* otherlv_75= '}'
                    {
                    otherlv_70=(Token)match(input,63,FOLLOW_3); 

                    					newLeafNode(otherlv_70, grammarAccess.getNodeAccess().getActionClientsKeyword_9_1_0());
                    				
                    otherlv_71=(Token)match(input,26,FOLLOW_41); 

                    					newLeafNode(otherlv_71, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_9_1_1());
                    				
                    // InternalRos.g:2363:5: ( (lv_actionclient_72_0= ruleActionClient ) )
                    // InternalRos.g:2364:6: (lv_actionclient_72_0= ruleActionClient )
                    {
                    // InternalRos.g:2364:6: (lv_actionclient_72_0= ruleActionClient )
                    // InternalRos.g:2365:7: lv_actionclient_72_0= ruleActionClient
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_9_1_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_actionclient_72_0=ruleActionClient();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"actionclient",
                    								lv_actionclient_72_0,
                    								"de.fraunhofer.ipa.ros.Ros.ActionClient");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:2382:5: (otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==28) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalRos.g:2383:6: otherlv_73= ',' ( (lv_actionclient_74_0= ruleActionClient ) )
                    	    {
                    	    otherlv_73=(Token)match(input,28,FOLLOW_41); 

                    	    						newLeafNode(otherlv_73, grammarAccess.getNodeAccess().getCommaKeyword_9_1_3_0());
                    	    					
                    	    // InternalRos.g:2387:6: ( (lv_actionclient_74_0= ruleActionClient ) )
                    	    // InternalRos.g:2388:7: (lv_actionclient_74_0= ruleActionClient )
                    	    {
                    	    // InternalRos.g:2388:7: (lv_actionclient_74_0= ruleActionClient )
                    	    // InternalRos.g:2389:8: lv_actionclient_74_0= ruleActionClient
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getActionclientActionClientParserRuleCall_9_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_actionclient_74_0=ruleActionClient();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"actionclient",
                    	    									lv_actionclient_74_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.ActionClient");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_75=(Token)match(input,29,FOLLOW_42); 

                    					newLeafNode(otherlv_75, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_9_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalRos.g:2413:3: ( (otherlv_76= 'parameter' otherlv_77= '{' ( (lv_parameter_78_0= ruleParameter ) ) (otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) ) )* otherlv_81= '}' ) | (otherlv_82= 'Parameters' otherlv_83= '{' ( (lv_parameter_84_0= ruleParameter ) ) (otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) ) )* otherlv_87= '}' ) )?
            int alt55=3;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==64) ) {
                alt55=1;
            }
            else if ( (LA55_0==65) ) {
                alt55=2;
            }
            switch (alt55) {
                case 1 :
                    // InternalRos.g:2414:4: (otherlv_76= 'parameter' otherlv_77= '{' ( (lv_parameter_78_0= ruleParameter ) ) (otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) ) )* otherlv_81= '}' )
                    {
                    // InternalRos.g:2414:4: (otherlv_76= 'parameter' otherlv_77= '{' ( (lv_parameter_78_0= ruleParameter ) ) (otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) ) )* otherlv_81= '}' )
                    // InternalRos.g:2415:5: otherlv_76= 'parameter' otherlv_77= '{' ( (lv_parameter_78_0= ruleParameter ) ) (otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) ) )* otherlv_81= '}'
                    {
                    otherlv_76=(Token)match(input,64,FOLLOW_3); 

                    					newLeafNode(otherlv_76, grammarAccess.getNodeAccess().getParameterKeyword_10_0_0());
                    				
                    otherlv_77=(Token)match(input,26,FOLLOW_43); 

                    					newLeafNode(otherlv_77, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_10_0_1());
                    				
                    // InternalRos.g:2423:5: ( (lv_parameter_78_0= ruleParameter ) )
                    // InternalRos.g:2424:6: (lv_parameter_78_0= ruleParameter )
                    {
                    // InternalRos.g:2424:6: (lv_parameter_78_0= ruleParameter )
                    // InternalRos.g:2425:7: lv_parameter_78_0= ruleParameter
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_10_0_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_parameter_78_0=ruleParameter();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"parameter",
                    								lv_parameter_78_0,
                    								"de.fraunhofer.ipa.ros.Ros.Parameter");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:2442:5: (otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==28) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // InternalRos.g:2443:6: otherlv_79= ',' ( (lv_parameter_80_0= ruleParameter ) )
                    	    {
                    	    otherlv_79=(Token)match(input,28,FOLLOW_43); 

                    	    						newLeafNode(otherlv_79, grammarAccess.getNodeAccess().getCommaKeyword_10_0_3_0());
                    	    					
                    	    // InternalRos.g:2447:6: ( (lv_parameter_80_0= ruleParameter ) )
                    	    // InternalRos.g:2448:7: (lv_parameter_80_0= ruleParameter )
                    	    {
                    	    // InternalRos.g:2448:7: (lv_parameter_80_0= ruleParameter )
                    	    // InternalRos.g:2449:8: lv_parameter_80_0= ruleParameter
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_10_0_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameter_80_0=ruleParameter();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parameter",
                    	    									lv_parameter_80_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Parameter");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_81=(Token)match(input,29,FOLLOW_7); 

                    					newLeafNode(otherlv_81, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalRos.g:2473:4: (otherlv_82= 'Parameters' otherlv_83= '{' ( (lv_parameter_84_0= ruleParameter ) ) (otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) ) )* otherlv_87= '}' )
                    {
                    // InternalRos.g:2473:4: (otherlv_82= 'Parameters' otherlv_83= '{' ( (lv_parameter_84_0= ruleParameter ) ) (otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) ) )* otherlv_87= '}' )
                    // InternalRos.g:2474:5: otherlv_82= 'Parameters' otherlv_83= '{' ( (lv_parameter_84_0= ruleParameter ) ) (otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) ) )* otherlv_87= '}'
                    {
                    otherlv_82=(Token)match(input,65,FOLLOW_3); 

                    					newLeafNode(otherlv_82, grammarAccess.getNodeAccess().getParametersKeyword_10_1_0());
                    				
                    otherlv_83=(Token)match(input,26,FOLLOW_43); 

                    					newLeafNode(otherlv_83, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_10_1_1());
                    				
                    // InternalRos.g:2482:5: ( (lv_parameter_84_0= ruleParameter ) )
                    // InternalRos.g:2483:6: (lv_parameter_84_0= ruleParameter )
                    {
                    // InternalRos.g:2483:6: (lv_parameter_84_0= ruleParameter )
                    // InternalRos.g:2484:7: lv_parameter_84_0= ruleParameter
                    {

                    							newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_10_1_2_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_parameter_84_0=ruleParameter();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    							}
                    							add(
                    								current,
                    								"parameter",
                    								lv_parameter_84_0,
                    								"de.fraunhofer.ipa.ros.Ros.Parameter");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalRos.g:2501:5: (otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==28) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalRos.g:2502:6: otherlv_85= ',' ( (lv_parameter_86_0= ruleParameter ) )
                    	    {
                    	    otherlv_85=(Token)match(input,28,FOLLOW_43); 

                    	    						newLeafNode(otherlv_85, grammarAccess.getNodeAccess().getCommaKeyword_10_1_3_0());
                    	    					
                    	    // InternalRos.g:2506:6: ( (lv_parameter_86_0= ruleParameter ) )
                    	    // InternalRos.g:2507:7: (lv_parameter_86_0= ruleParameter )
                    	    {
                    	    // InternalRos.g:2507:7: (lv_parameter_86_0= ruleParameter )
                    	    // InternalRos.g:2508:8: lv_parameter_86_0= ruleParameter
                    	    {

                    	    								newCompositeNode(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_10_1_3_1_0());
                    	    							
                    	    pushFollow(FOLLOW_6);
                    	    lv_parameter_86_0=ruleParameter();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"parameter",
                    	    									lv_parameter_86_0,
                    	    									"de.fraunhofer.ipa.ros.Ros.Parameter");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_87=(Token)match(input,29,FOLLOW_7); 

                    					newLeafNode(otherlv_87, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_10_1_4());
                    				

                    }


                    }
                    break;

            }

            otherlv_88=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_88, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

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
    // InternalRos.g:2540:1: entryRuleServiceServer returns [EObject current=null] : iv_ruleServiceServer= ruleServiceServer EOF ;
    public final EObject entryRuleServiceServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceServer = null;


        try {
            // InternalRos.g:2540:54: (iv_ruleServiceServer= ruleServiceServer EOF )
            // InternalRos.g:2541:2: iv_ruleServiceServer= ruleServiceServer EOF
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
    // InternalRos.g:2547:1: ruleServiceServer returns [EObject current=null] : (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2553:2: ( (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2554:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2554:2: (otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2555:3: otherlv_0= 'ServiceServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,66,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceServerAccess().getServiceServerKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceServerAccess().getNameKeyword_2());
            		
            // InternalRos.g:2567:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2568:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2568:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2569:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_4=(Token)match(input,67,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceServerAccess().getServiceKeyword_4());
            		
            // InternalRos.g:2590:3: ( ( ruleEString ) )
            // InternalRos.g:2591:4: ( ruleEString )
            {
            // InternalRos.g:2591:4: ( ruleEString )
            // InternalRos.g:2592:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceServerAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2606:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==68) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalRos.g:2607:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceServerAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2611:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2612:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2612:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2613:6: lv_namespace_7_0= ruleNamespace
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

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:2639:1: entryRulePublisher returns [EObject current=null] : iv_rulePublisher= rulePublisher EOF ;
    public final EObject entryRulePublisher() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePublisher = null;


        try {
            // InternalRos.g:2639:50: (iv_rulePublisher= rulePublisher EOF )
            // InternalRos.g:2640:2: iv_rulePublisher= rulePublisher EOF
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
    // InternalRos.g:2646:1: rulePublisher returns [EObject current=null] : (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2652:2: ( (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2653:2: (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2653:2: (otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2654:3: otherlv_0= 'Publisher' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPublisherAccess().getPublisherKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getPublisherAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPublisherAccess().getNameKeyword_2());
            		
            // InternalRos.g:2666:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2667:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2667:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2668:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
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

            otherlv_4=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getPublisherAccess().getMessageKeyword_4());
            		
            // InternalRos.g:2689:3: ( ( ruleEString ) )
            // InternalRos.g:2690:4: ( ruleEString )
            {
            // InternalRos.g:2690:4: ( ruleEString )
            // InternalRos.g:2691:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPublisherRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2705:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==68) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalRos.g:2706:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getPublisherAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2710:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2711:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2711:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2712:6: lv_namespace_7_0= ruleNamespace
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

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:2738:1: entryRuleSubscriber returns [EObject current=null] : iv_ruleSubscriber= ruleSubscriber EOF ;
    public final EObject entryRuleSubscriber() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubscriber = null;


        try {
            // InternalRos.g:2738:51: (iv_ruleSubscriber= ruleSubscriber EOF )
            // InternalRos.g:2739:2: iv_ruleSubscriber= ruleSubscriber EOF
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
    // InternalRos.g:2745:1: ruleSubscriber returns [EObject current=null] : (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2751:2: ( (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2752:2: (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2752:2: (otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2753:3: otherlv_0= 'Subscriber' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'message' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSubscriberAccess().getSubscriberKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getSubscriberAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getSubscriberAccess().getNameKeyword_2());
            		
            // InternalRos.g:2765:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2766:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2766:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2767:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_47);
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

            otherlv_4=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSubscriberAccess().getMessageKeyword_4());
            		
            // InternalRos.g:2788:3: ( ( ruleEString ) )
            // InternalRos.g:2789:4: ( ruleEString )
            {
            // InternalRos.g:2789:4: ( ruleEString )
            // InternalRos.g:2790:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSubscriberRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2804:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==68) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalRos.g:2805:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubscriberAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2809:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2810:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2810:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2811:6: lv_namespace_7_0= ruleNamespace
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

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:2837:1: entryRuleServiceClient returns [EObject current=null] : iv_ruleServiceClient= ruleServiceClient EOF ;
    public final EObject entryRuleServiceClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceClient = null;


        try {
            // InternalRos.g:2837:54: (iv_ruleServiceClient= ruleServiceClient EOF )
            // InternalRos.g:2838:2: iv_ruleServiceClient= ruleServiceClient EOF
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
    // InternalRos.g:2844:1: ruleServiceClient returns [EObject current=null] : (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2850:2: ( (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2851:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2851:2: (otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2852:3: otherlv_0= 'ServiceClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'service' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceClientAccess().getServiceClientKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getServiceClientAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getServiceClientAccess().getNameKeyword_2());
            		
            // InternalRos.g:2864:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2865:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2865:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2866:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getServiceClientAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_44);
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

            otherlv_4=(Token)match(input,67,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getServiceClientAccess().getServiceKeyword_4());
            		
            // InternalRos.g:2887:3: ( ( ruleEString ) )
            // InternalRos.g:2888:4: ( ruleEString )
            {
            // InternalRos.g:2888:4: ( ruleEString )
            // InternalRos.g:2889:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getServiceClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getServiceClientAccess().getServiceServiceSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:2903:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==68) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalRos.g:2904:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getServiceClientAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:2908:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:2909:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:2909:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:2910:6: lv_namespace_7_0= ruleNamespace
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

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:2936:1: entryRuleActionServer returns [EObject current=null] : iv_ruleActionServer= ruleActionServer EOF ;
    public final EObject entryRuleActionServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionServer = null;


        try {
            // InternalRos.g:2936:53: (iv_ruleActionServer= ruleActionServer EOF )
            // InternalRos.g:2937:2: iv_ruleActionServer= ruleActionServer EOF
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
    // InternalRos.g:2943:1: ruleActionServer returns [EObject current=null] : (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:2949:2: ( (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:2950:2: (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:2950:2: (otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:2951:3: otherlv_0= 'ActionServer' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionServerAccess().getActionServerKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getActionServerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getActionServerAccess().getNameKeyword_2());
            		
            // InternalRos.g:2963:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:2964:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:2964:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:2965:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionServerAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_48);
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

            otherlv_4=(Token)match(input,73,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getActionServerAccess().getActionKeyword_4());
            		
            // InternalRos.g:2986:3: ( ( ruleEString ) )
            // InternalRos.g:2987:4: ( ruleEString )
            {
            // InternalRos.g:2987:4: ( ruleEString )
            // InternalRos.g:2988:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionServerRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionServerAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:3002:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==68) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalRos.g:3003:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionServerAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:3007:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:3008:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:3008:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:3009:6: lv_namespace_7_0= ruleNamespace
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

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:3035:1: entryRuleActionClient returns [EObject current=null] : iv_ruleActionClient= ruleActionClient EOF ;
    public final EObject entryRuleActionClient() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionClient = null;


        try {
            // InternalRos.g:3035:53: (iv_ruleActionClient= ruleActionClient EOF )
            // InternalRos.g:3036:2: iv_ruleActionClient= ruleActionClient EOF
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
    // InternalRos.g:3042:1: ruleActionClient returns [EObject current=null] : (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) ;
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
            // InternalRos.g:3048:2: ( (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' ) )
            // InternalRos.g:3049:2: (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            {
            // InternalRos.g:3049:2: (otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}' )
            // InternalRos.g:3050:3: otherlv_0= 'ActionClient' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) otherlv_4= 'action' ( ( ruleEString ) ) (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActionClientAccess().getActionClientKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getActionClientAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getActionClientAccess().getNameKeyword_2());
            		
            // InternalRos.g:3062:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:3063:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:3063:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:3064:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActionClientAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_48);
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

            otherlv_4=(Token)match(input,73,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getActionClientAccess().getActionKeyword_4());
            		
            // InternalRos.g:3085:3: ( ( ruleEString ) )
            // InternalRos.g:3086:4: ( ruleEString )
            {
            // InternalRos.g:3086:4: ( ruleEString )
            // InternalRos.g:3087:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionClientRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionClientAccess().getActionActionSpecCrossReference_5_0());
            				
            pushFollow(FOLLOW_45);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRos.g:3101:3: (otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==68) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalRos.g:3102:4: otherlv_6= 'namespace' ( (lv_namespace_7_0= ruleNamespace ) )
                    {
                    otherlv_6=(Token)match(input,68,FOLLOW_46); 

                    				newLeafNode(otherlv_6, grammarAccess.getActionClientAccess().getNamespaceKeyword_6_0());
                    			
                    // InternalRos.g:3106:4: ( (lv_namespace_7_0= ruleNamespace ) )
                    // InternalRos.g:3107:5: (lv_namespace_7_0= ruleNamespace )
                    {
                    // InternalRos.g:3107:5: (lv_namespace_7_0= ruleNamespace )
                    // InternalRos.g:3108:6: lv_namespace_7_0= ruleNamespace
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

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:3134:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalRos.g:3134:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalRos.g:3135:2: iv_ruleGraphName= ruleGraphName EOF
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
    // InternalRos.g:3141:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'GraphName' ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:3147:2: (kw= 'GraphName' )
            // InternalRos.g:3148:2: kw= 'GraphName'
            {
            kw=(Token)match(input,75,FOLLOW_2); 

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
    // InternalRos.g:3156:1: entryRulePackageDependency returns [EObject current=null] : iv_rulePackageDependency= rulePackageDependency EOF ;
    public final EObject entryRulePackageDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePackageDependency = null;


        try {
            // InternalRos.g:3156:58: (iv_rulePackageDependency= rulePackageDependency EOF )
            // InternalRos.g:3157:2: iv_rulePackageDependency= rulePackageDependency EOF
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
    // InternalRos.g:3163:1: rulePackageDependency returns [EObject current=null] : (otherlv_0= 'PackageDependency' ( ( ruleEString ) ) ) ;
    public final EObject rulePackageDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRos.g:3169:2: ( (otherlv_0= 'PackageDependency' ( ( ruleEString ) ) ) )
            // InternalRos.g:3170:2: (otherlv_0= 'PackageDependency' ( ( ruleEString ) ) )
            {
            // InternalRos.g:3170:2: (otherlv_0= 'PackageDependency' ( ( ruleEString ) ) )
            // InternalRos.g:3171:3: otherlv_0= 'PackageDependency' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,76,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPackageDependencyAccess().getPackageDependencyKeyword_0());
            		
            // InternalRos.g:3175:3: ( ( ruleEString ) )
            // InternalRos.g:3176:4: ( ruleEString )
            {
            // InternalRos.g:3176:4: ( ruleEString )
            // InternalRos.g:3177:5: ruleEString
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
    // InternalRos.g:3195:1: entryRuleExternalDependency returns [EObject current=null] : iv_ruleExternalDependency= ruleExternalDependency EOF ;
    public final EObject entryRuleExternalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDependency = null;


        try {
            // InternalRos.g:3195:59: (iv_ruleExternalDependency= ruleExternalDependency EOF )
            // InternalRos.g:3196:2: iv_ruleExternalDependency= ruleExternalDependency EOF
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
    // InternalRos.g:3202:1: ruleExternalDependency returns [EObject current=null] : ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleExternalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3208:2: ( ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalRos.g:3209:2: ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalRos.g:3209:2: ( () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) ) )
            // InternalRos.g:3210:3: () otherlv_1= 'ExternalDependency' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalRos.g:3210:3: ()
            // InternalRos.g:3211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,77,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1());
            		
            // InternalRos.g:3221:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRos.g:3222:4: (lv_name_2_0= ruleEString )
            {
            // InternalRos.g:3222:4: (lv_name_2_0= ruleEString )
            // InternalRos.g:3223:5: lv_name_2_0= ruleEString
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
    // InternalRos.g:3244:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalRos.g:3244:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalRos.g:3245:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
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
    // InternalRos.g:3251:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:3257:2: ( ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:3258:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:3258:2: ( () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:3259:3: () otherlv_1= 'GlobalNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:3259:3: ()
            // InternalRos.g:3260:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,78,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3274:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==79) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalRos.g:3275:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getGlobalNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:3283:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:3284:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:3284:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:3285:6: lv_parts_5_0= ruleGraphName
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

                    // InternalRos.g:3302:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==28) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalRos.g:3303:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_50); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:3307:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:3308:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:3308:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:3309:7: lv_parts_7_0= ruleGraphName
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
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getGlobalNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:3340:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalRos.g:3340:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalRos.g:3341:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
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
    // InternalRos.g:3347:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:3353:2: ( ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:3354:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:3354:2: ( () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:3355:3: () otherlv_1= 'RelativeNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:3355:3: ()
            // InternalRos.g:3356:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,80,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3370:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==79) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalRos.g:3371:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelativeNamespace_ImplAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:3379:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:3380:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:3380:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:3381:6: lv_parts_5_0= ruleGraphName
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

                    // InternalRos.g:3398:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==28) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // InternalRos.g:3399:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_50); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:3403:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:3404:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:3404:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:3405:7: lv_parts_7_0= ruleGraphName
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
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRelativeNamespace_ImplAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:3436:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalRos.g:3436:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalRos.g:3437:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
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
    // InternalRos.g:3443:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
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
            // InternalRos.g:3449:2: ( ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalRos.g:3450:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalRos.g:3450:2: ( () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalRos.g:3451:3: () otherlv_1= 'PrivateNamespace' otherlv_2= '{' (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalRos.g:3451:3: ()
            // InternalRos.g:3452:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,81,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_49); 

            			newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3466:3: (otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==79) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalRos.g:3467:4: otherlv_3= 'parts' otherlv_4= '{' ( (lv_parts_5_0= ruleGraphName ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,79,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrivateNamespaceAccess().getPartsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,26,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalRos.g:3475:4: ( (lv_parts_5_0= ruleGraphName ) )
                    // InternalRos.g:3476:5: (lv_parts_5_0= ruleGraphName )
                    {
                    // InternalRos.g:3476:5: (lv_parts_5_0= ruleGraphName )
                    // InternalRos.g:3477:6: lv_parts_5_0= ruleGraphName
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

                    // InternalRos.g:3494:4: (otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) ) )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==28) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // InternalRos.g:3495:5: otherlv_6= ',' ( (lv_parts_7_0= ruleGraphName ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_50); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalRos.g:3499:5: ( (lv_parts_7_0= ruleGraphName ) )
                    	    // InternalRos.g:3500:6: (lv_parts_7_0= ruleGraphName )
                    	    {
                    	    // InternalRos.g:3500:6: (lv_parts_7_0= ruleGraphName )
                    	    // InternalRos.g:3501:7: lv_parts_7_0= ruleGraphName
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
                    	    break loop66;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,29,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getPrivateNamespaceAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:3532:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalRos.g:3532:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalRos.g:3533:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalRos.g:3539:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) ;
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
            // InternalRos.g:3545:2: ( (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' ) )
            // InternalRos.g:3546:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            {
            // InternalRos.g:3546:2: (otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}' )
            // InternalRos.g:3547:3: otherlv_0= 'Parameter' otherlv_1= '{' otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )? otherlv_6= 'type' ( (lv_type_7_0= ruleParameterType ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,82,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,51,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_2());
            		
            // InternalRos.g:3559:3: ( (lv_name_3_0= ruleEString ) )
            // InternalRos.g:3560:4: (lv_name_3_0= ruleEString )
            {
            // InternalRos.g:3560:4: (lv_name_3_0= ruleEString )
            // InternalRos.g:3561:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_51);
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

            // InternalRos.g:3578:3: (otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==68) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalRos.g:3579:4: otherlv_4= 'namespace' ( (lv_namespace_5_0= ruleNamespace ) )
                    {
                    otherlv_4=(Token)match(input,68,FOLLOW_46); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getNamespaceKeyword_4_0());
                    			
                    // InternalRos.g:3583:4: ( (lv_namespace_5_0= ruleNamespace ) )
                    // InternalRos.g:3584:5: (lv_namespace_5_0= ruleNamespace )
                    {
                    // InternalRos.g:3584:5: (lv_namespace_5_0= ruleNamespace )
                    // InternalRos.g:3585:6: lv_namespace_5_0= ruleNamespace
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getNamespaceNamespaceParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_52);
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

            otherlv_6=(Token)match(input,83,FOLLOW_53); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getTypeKeyword_5());
            		
            // InternalRos.g:3607:3: ( (lv_type_7_0= ruleParameterType ) )
            // InternalRos.g:3608:4: (lv_type_7_0= ruleParameterType )
            {
            // InternalRos.g:3608:4: (lv_type_7_0= ruleParameterType )
            // InternalRos.g:3609:5: lv_type_7_0= ruleParameterType
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

            otherlv_8=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:3634:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalRos.g:3634:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalRos.g:3635:2: iv_ruleParameterType= ruleParameterType EOF
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
    // InternalRos.g:3641:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
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
            // InternalRos.g:3647:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalRos.g:3648:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalRos.g:3648:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt69=8;
            switch ( input.LA(1) ) {
            case 84:
                {
                alt69=1;
                }
                break;
            case 85:
                {
                alt69=2;
                }
                break;
            case 86:
                {
                alt69=3;
                }
                break;
            case 44:
                {
                alt69=4;
                }
                break;
            case 88:
                {
                alt69=5;
                }
                break;
            case 89:
                {
                alt69=6;
                }
                break;
            case 90:
                {
                alt69=7;
                }
                break;
            case 91:
                {
                alt69=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalRos.g:3649:3: this_ParameterListType_0= ruleParameterListType
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
                    // InternalRos.g:3658:3: this_ParameterStructType_1= ruleParameterStructType
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
                    // InternalRos.g:3667:3: this_ParameterIntegerType_2= ruleParameterIntegerType
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
                    // InternalRos.g:3676:3: this_ParameterStringType_3= ruleParameterStringType
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
                    // InternalRos.g:3685:3: this_ParameterDoubleType_4= ruleParameterDoubleType
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
                    // InternalRos.g:3694:3: this_ParameterBooleanType_5= ruleParameterBooleanType
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
                    // InternalRos.g:3703:3: this_ParameterBase64Type_6= ruleParameterBase64Type
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
                    // InternalRos.g:3712:3: this_ParameterArrayType_7= ruleParameterArrayType
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
    // InternalRos.g:3724:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalRos.g:3724:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalRos.g:3725:2: iv_ruleParameterValue= ruleParameterValue EOF
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
    // InternalRos.g:3731:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
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
            // InternalRos.g:3737:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalRos.g:3738:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalRos.g:3738:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt70=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
                {
                alt70=1;
                }
                break;
            case RULE_BINARY:
                {
                alt70=2;
                }
                break;
            case RULE_DECINT:
                {
                alt70=3;
                }
                break;
            case RULE_DOUBLE:
                {
                alt70=4;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt70=5;
                }
                break;
            case 26:
                {
                int LA70_6 = input.LA(2);

                if ( ((LA70_6>=RULE_STRING && LA70_6<=RULE_ID)||(LA70_6>=RULE_BINARY && LA70_6<=RULE_DECINT)||LA70_6==26||(LA70_6>=28 && LA70_6<=29)) ) {
                    alt70=6;
                }
                else if ( (LA70_6==94) ) {
                    alt70=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 70, 6, input);

                    throw nvae;
                }
                }
                break;
            case EOF:
            case 28:
            case 29:
                {
                alt70=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalRos.g:3739:3: this_ParameterString_0= ruleParameterString
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
                    // InternalRos.g:3748:3: this_ParameterBase64_1= ruleParameterBase64
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
                    // InternalRos.g:3757:3: this_ParameterInteger_2= ruleParameterInteger
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
                    // InternalRos.g:3766:3: this_ParameterDouble_3= ruleParameterDouble
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
                    // InternalRos.g:3775:3: this_ParameterBoolean_4= ruleParameterBoolean
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
                    // InternalRos.g:3784:3: this_ParameterList_5= ruleParameterList
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
                    // InternalRos.g:3793:3: this_ParameterStruct_6= ruleParameterStruct
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
    // InternalRos.g:3805:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalRos.g:3805:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalRos.g:3806:2: iv_ruleParameterListType= ruleParameterListType EOF
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
    // InternalRos.g:3812:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) ;
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
            // InternalRos.g:3818:2: ( ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' ) )
            // InternalRos.g:3819:2: ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' )
            {
            // InternalRos.g:3819:2: ( () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}' )
            // InternalRos.g:3820:3: () otherlv_1= 'List' otherlv_2= '{' ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= '}'
            {
            // InternalRos.g:3820:3: ()
            // InternalRos.g:3821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,84,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3835:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalRos.g:3836:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalRos.g:3836:4: (lv_sequence_3_0= ruleParameterType )
            // InternalRos.g:3837:5: lv_sequence_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalRos.g:3854:3: (otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==28) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalRos.g:3855:4: otherlv_4= ',' ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_53); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRos.g:3859:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalRos.g:3860:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalRos.g:3860:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalRos.g:3861:6: lv_sequence_5_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());
            	    					
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


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:3887:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalRos.g:3887:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalRos.g:3888:2: iv_ruleParameterStructType= ruleParameterStructType EOF
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
    // InternalRos.g:3894:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= 'Struct' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' ) ;
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
            // InternalRos.g:3900:2: ( ( () otherlv_1= 'Struct' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' ) )
            // InternalRos.g:3901:2: ( () otherlv_1= 'Struct' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' )
            {
            // InternalRos.g:3901:2: ( () otherlv_1= 'Struct' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}' )
            // InternalRos.g:3902:3: () otherlv_1= 'Struct' otherlv_2= '{' ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= '}'
            {
            // InternalRos.g:3902:3: ()
            // InternalRos.g:3903:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,85,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:3917:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalRos.g:3918:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalRos.g:3918:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalRos.g:3919:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalRos.g:3936:3: (otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==28) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalRos.g:3937:4: otherlv_4= ',' ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_8); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalRos.g:3941:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalRos.g:3942:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalRos.g:3942:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalRos.g:3943:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
            	    {

            	    						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());
            	    					
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


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:3969:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalRos.g:3969:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalRos.g:3970:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
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
    // InternalRos.g:3976:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:3982:2: ( ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? ) )
            // InternalRos.g:3983:2: ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? )
            {
            // InternalRos.g:3983:2: ( () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )? )
            // InternalRos.g:3984:3: () otherlv_1= 'Integer' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )?
            {
            // InternalRos.g:3984:3: ()
            // InternalRos.g:3985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,86,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
            		
            // InternalRos.g:3995:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==26) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalRos.g:3996:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterInteger ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_55); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,87,FOLLOW_56); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRos.g:4004:4: ( (lv_default_4_0= ruleParameterInteger ) )
                    // InternalRos.g:4005:5: (lv_default_4_0= ruleParameterInteger )
                    {
                    // InternalRos.g:4005:5: (lv_default_4_0= ruleParameterInteger )
                    // InternalRos.g:4006:6: lv_default_4_0= ruleParameterInteger
                    {

                    						newCompositeNode(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_2_0());
                    					
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

                    otherlv_5=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterIntegerTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalRos.g:4032:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalRos.g:4032:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalRos.g:4033:2: iv_ruleParameterStringType= ruleParameterStringType EOF
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
    // InternalRos.g:4039:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4045:2: ( ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? ) )
            // InternalRos.g:4046:2: ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? )
            {
            // InternalRos.g:4046:2: ( () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )? )
            // InternalRos.g:4047:3: () otherlv_1= 'String' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )?
            {
            // InternalRos.g:4047:3: ()
            // InternalRos.g:4048:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            		
            // InternalRos.g:4058:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==26) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalRos.g:4059:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterString ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_55); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,87,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRos.g:4067:4: ( (lv_default_4_0= ruleParameterString ) )
                    // InternalRos.g:4068:5: (lv_default_4_0= ruleParameterString )
                    {
                    // InternalRos.g:4068:5: (lv_default_4_0= ruleParameterString )
                    // InternalRos.g:4069:6: lv_default_4_0= ruleParameterString
                    {

                    						newCompositeNode(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_2_0());
                    					
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

                    otherlv_5=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterStringTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalRos.g:4095:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalRos.g:4095:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalRos.g:4096:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
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
    // InternalRos.g:4102:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4108:2: ( ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? ) )
            // InternalRos.g:4109:2: ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? )
            {
            // InternalRos.g:4109:2: ( () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )? )
            // InternalRos.g:4110:3: () otherlv_1= 'Double' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )?
            {
            // InternalRos.g:4110:3: ()
            // InternalRos.g:4111:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,88,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
            		
            // InternalRos.g:4121:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==26) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalRos.g:4122:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterDouble ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_55); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,87,FOLLOW_57); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRos.g:4130:4: ( (lv_default_4_0= ruleParameterDouble ) )
                    // InternalRos.g:4131:5: (lv_default_4_0= ruleParameterDouble )
                    {
                    // InternalRos.g:4131:5: (lv_default_4_0= ruleParameterDouble )
                    // InternalRos.g:4132:6: lv_default_4_0= ruleParameterDouble
                    {

                    						newCompositeNode(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_2_0());
                    					
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

                    otherlv_5=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterDoubleTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalRos.g:4158:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalRos.g:4158:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalRos.g:4159:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
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
    // InternalRos.g:4165:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4171:2: ( ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? ) )
            // InternalRos.g:4172:2: ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? )
            {
            // InternalRos.g:4172:2: ( () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )? )
            // InternalRos.g:4173:3: () otherlv_1= 'Boolean' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )?
            {
            // InternalRos.g:4173:3: ()
            // InternalRos.g:4174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,89,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
            		
            // InternalRos.g:4184:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==26) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalRos.g:4185:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBoolean ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_55); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,87,FOLLOW_58); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRos.g:4193:4: ( (lv_default_4_0= ruleParameterBoolean ) )
                    // InternalRos.g:4194:5: (lv_default_4_0= ruleParameterBoolean )
                    {
                    // InternalRos.g:4194:5: (lv_default_4_0= ruleParameterBoolean )
                    // InternalRos.g:4195:6: lv_default_4_0= ruleParameterBoolean
                    {

                    						newCompositeNode(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_2_0());
                    					
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

                    otherlv_5=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterBooleanTypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalRos.g:4221:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalRos.g:4221:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalRos.g:4222:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
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
    // InternalRos.g:4228:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_default_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4234:2: ( ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? ) )
            // InternalRos.g:4235:2: ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? )
            {
            // InternalRos.g:4235:2: ( () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )? )
            // InternalRos.g:4236:3: () otherlv_1= 'Base64' (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )?
            {
            // InternalRos.g:4236:3: ()
            // InternalRos.g:4237:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,90,FOLLOW_54); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
            		
            // InternalRos.g:4247:3: (otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==26) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalRos.g:4248:4: otherlv_2= '{' otherlv_3= 'default' ( (lv_default_4_0= ruleParameterBase64 ) ) otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_55); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getLeftCurlyBracketKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,87,FOLLOW_59); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_1());
                    			
                    // InternalRos.g:4256:4: ( (lv_default_4_0= ruleParameterBase64 ) )
                    // InternalRos.g:4257:5: (lv_default_4_0= ruleParameterBase64 )
                    {
                    // InternalRos.g:4257:5: (lv_default_4_0= ruleParameterBase64 )
                    // InternalRos.g:4258:6: lv_default_4_0= ruleParameterBase64
                    {

                    						newCompositeNode(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_2_0());
                    					
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

                    otherlv_5=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getParameterBase64TypeAccess().getRightCurlyBracketKeyword_2_3());
                    			

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
    // InternalRos.g:4284:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalRos.g:4284:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalRos.g:4285:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
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
    // InternalRos.g:4291:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' ) ;
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
            // InternalRos.g:4297:2: ( (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' ) )
            // InternalRos.g:4298:2: (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' )
            {
            // InternalRos.g:4298:2: (otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}' )
            // InternalRos.g:4299:3: otherlv_0= 'Array' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleParameterType ) ) (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,83,FOLLOW_53); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterArrayTypeAccess().getTypeKeyword_2());
            		
            // InternalRos.g:4311:3: ( (lv_type_3_0= ruleParameterType ) )
            // InternalRos.g:4312:4: (lv_type_3_0= ruleParameterType )
            {
            // InternalRos.g:4312:4: (lv_type_3_0= ruleParameterType )
            // InternalRos.g:4313:5: lv_type_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_60);
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

            // InternalRos.g:4330:3: (otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==87) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalRos.g:4331:4: otherlv_4= 'default' ( (lv_default_5_0= ruleParameterList ) )
                    {
                    otherlv_4=(Token)match(input,87,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalRos.g:4335:4: ( (lv_default_5_0= ruleParameterList ) )
                    // InternalRos.g:4336:5: (lv_default_5_0= ruleParameterList )
                    {
                    // InternalRos.g:4336:5: (lv_default_5_0= ruleParameterList )
                    // InternalRos.g:4337:6: lv_default_5_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
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

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:4363:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalRos.g:4363:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalRos.g:4364:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalRos.g:4370:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4376:2: ( ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' ) )
            // InternalRos.g:4377:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            {
            // InternalRos.g:4377:2: ( () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}' )
            // InternalRos.g:4378:3: () otherlv_1= '{' ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= '}'
            {
            // InternalRos.g:4378:3: ()
            // InternalRos.g:4379:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_61); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRos.g:4389:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalRos.g:4390:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalRos.g:4390:4: (lv_value_2_0= ruleParameterValue )
            // InternalRos.g:4391:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalRos.g:4408:3: (otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==28) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalRos.g:4409:4: otherlv_3= ',' ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,28,FOLLOW_61); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalRos.g:4413:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalRos.g:4414:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalRos.g:4414:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalRos.g:4415:6: lv_value_4_0= ruleParameterValue
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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
            	    break loop79;
                }
            } while (true);

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:4441:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalRos.g:4441:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalRos.g:4442:2: iv_ruleParameterAny= ruleParameterAny EOF
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
    // InternalRos.g:4448:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4454:2: ( ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalRos.g:4455:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalRos.g:4455:2: ( () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}' )
            // InternalRos.g:4456:3: () otherlv_1= 'ParameterAny' otherlv_2= '{' (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalRos.g:4456:3: ()
            // InternalRos.g:4457:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,92,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_62); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRos.g:4471:3: (otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) ) )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==93) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalRos.g:4472:4: otherlv_3= 'value' ( (lv_value_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,93,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAnyAccess().getValueKeyword_3_0());
                    			
                    // InternalRos.g:4476:4: ( (lv_value_4_0= ruleEString ) )
                    // InternalRos.g:4477:5: (lv_value_4_0= ruleEString )
                    {
                    // InternalRos.g:4477:5: (lv_value_4_0= ruleEString )
                    // InternalRos.g:4478:6: lv_value_4_0= ruleEString
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

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:4504:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalRos.g:4504:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalRos.g:4505:2: iv_ruleParameterString= ruleParameterString EOF
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
    // InternalRos.g:4511:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4517:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalRos.g:4518:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalRos.g:4518:2: ( (lv_value_0_0= ruleEString ) )
            // InternalRos.g:4519:3: (lv_value_0_0= ruleEString )
            {
            // InternalRos.g:4519:3: (lv_value_0_0= ruleEString )
            // InternalRos.g:4520:4: lv_value_0_0= ruleEString
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
    // InternalRos.g:4540:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalRos.g:4540:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalRos.g:4541:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
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
    // InternalRos.g:4547:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4553:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalRos.g:4554:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalRos.g:4554:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalRos.g:4555:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalRos.g:4555:3: (lv_value_0_0= ruleBase64Binary )
            // InternalRos.g:4556:4: lv_value_0_0= ruleBase64Binary
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
    // InternalRos.g:4576:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalRos.g:4576:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalRos.g:4577:2: iv_ruleParameterInteger= ruleParameterInteger EOF
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
    // InternalRos.g:4583:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4589:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalRos.g:4590:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalRos.g:4590:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalRos.g:4591:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalRos.g:4591:3: (lv_value_0_0= ruleInteger0 )
            // InternalRos.g:4592:4: lv_value_0_0= ruleInteger0
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
    // InternalRos.g:4612:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalRos.g:4612:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalRos.g:4613:2: iv_ruleParameterDouble= ruleParameterDouble EOF
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
    // InternalRos.g:4619:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4625:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalRos.g:4626:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalRos.g:4626:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalRos.g:4627:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalRos.g:4627:3: (lv_value_0_0= ruleDouble0 )
            // InternalRos.g:4628:4: lv_value_0_0= ruleDouble0
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
    // InternalRos.g:4648:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalRos.g:4648:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalRos.g:4649:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
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
    // InternalRos.g:4655:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4661:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalRos.g:4662:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalRos.g:4662:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalRos.g:4663:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalRos.g:4663:3: (lv_value_0_0= ruleboolean0 )
            // InternalRos.g:4664:4: lv_value_0_0= ruleboolean0
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
    // InternalRos.g:4684:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalRos.g:4684:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalRos.g:4685:2: iv_ruleParameterStruct= ruleParameterStruct EOF
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
    // InternalRos.g:4691:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) ;
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
            // InternalRos.g:4697:2: ( ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? ) )
            // InternalRos.g:4698:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            {
            // InternalRos.g:4698:2: ( () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )? )
            // InternalRos.g:4699:3: () (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            {
            // InternalRos.g:4699:3: ()
            // InternalRos.g:4700:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalRos.g:4706:3: (otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==26) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalRos.g:4707:4: otherlv_1= '{' ( (lv_value_2_0= ruleParameterStructMember ) ) (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )* otherlv_7= '}'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_63); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalRos.g:4711:4: ( (lv_value_2_0= ruleParameterStructMember ) )
                    // InternalRos.g:4712:5: (lv_value_2_0= ruleParameterStructMember )
                    {
                    // InternalRos.g:4712:5: (lv_value_2_0= ruleParameterStructMember )
                    // InternalRos.g:4713:6: lv_value_2_0= ruleParameterStructMember
                    {

                    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalRos.g:4730:4: (otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}' )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( (LA81_0==28) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // InternalRos.g:4731:5: otherlv_3= ',' otherlv_4= '{' ( (lv_value_5_0= ruleParameterStructMember ) ) otherlv_6= '}'
                    	    {
                    	    otherlv_3=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getParameterStructAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    otherlv_4=(Token)match(input,26,FOLLOW_63); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getLeftCurlyBracketKeyword_1_2_1());
                    	    				
                    	    // InternalRos.g:4739:5: ( (lv_value_5_0= ruleParameterStructMember ) )
                    	    // InternalRos.g:4740:6: (lv_value_5_0= ruleParameterStructMember )
                    	    {
                    	    // InternalRos.g:4740:6: (lv_value_5_0= ruleParameterStructMember )
                    	    // InternalRos.g:4741:7: lv_value_5_0= ruleParameterStructMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_2_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
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

                    	    otherlv_6=(Token)match(input,29,FOLLOW_6); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterStructAccess().getRightCurlyBracketKeyword_1_2_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:4772:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalRos.g:4772:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalRos.g:4773:2: iv_ruleParameterDate= ruleParameterDate EOF
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
    // InternalRos.g:4779:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4785:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalRos.g:4786:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalRos.g:4786:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalRos.g:4787:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalRos.g:4787:3: (lv_value_0_0= ruleDateTime0 )
            // InternalRos.g:4788:4: lv_value_0_0= ruleDateTime0
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
    // InternalRos.g:4808:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalRos.g:4808:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalRos.g:4809:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
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
    // InternalRos.g:4815:1: ruleParameterStructMember returns [EObject current=null] : (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) ;
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
            // InternalRos.g:4821:2: ( (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' ) )
            // InternalRos.g:4822:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            {
            // InternalRos.g:4822:2: (otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}' )
            // InternalRos.g:4823:3: otherlv_0= 'ParameterStructMember' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'value' ( (lv_value_4_0= ruleParameterValue ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,94,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterStructMemberAccess().getParameterStructMemberKeyword_0());
            		
            // InternalRos.g:4827:3: ( (lv_name_1_0= ruleEString ) )
            // InternalRos.g:4828:4: (lv_name_1_0= ruleEString )
            {
            // InternalRos.g:4828:4: (lv_name_1_0= ruleEString )
            // InternalRos.g:4829:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,26,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructMemberAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,93,FOLLOW_61); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterStructMemberAccess().getValueKeyword_3());
            		
            // InternalRos.g:4854:3: ( (lv_value_4_0= ruleParameterValue ) )
            // InternalRos.g:4855:4: (lv_value_4_0= ruleParameterValue )
            {
            // InternalRos.g:4855:4: (lv_value_4_0= ruleParameterValue )
            // InternalRos.g:4856:5: lv_value_4_0= ruleParameterValue
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

            otherlv_5=(Token)match(input,29,FOLLOW_2); 

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
    // InternalRos.g:4881:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalRos.g:4881:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalRos.g:4882:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
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
    // InternalRos.g:4888:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalRos.g:4894:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalRos.g:4895:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalRos.g:4895:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalRos.g:4896:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalRos.g:4896:3: ( (lv_name_0_0= ruleEString ) )
            // InternalRos.g:4897:4: (lv_name_0_0= ruleEString )
            {
            // InternalRos.g:4897:4: (lv_name_0_0= ruleEString )
            // InternalRos.g:4898:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_53);
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

            // InternalRos.g:4915:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalRos.g:4916:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalRos.g:4916:4: (lv_type_1_0= ruleParameterType )
            // InternalRos.g:4917:5: lv_type_1_0= ruleParameterType
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
    // InternalRos.g:4938:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalRos.g:4938:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalRos.g:4939:2: iv_ruleBase64Binary= ruleBase64Binary EOF
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
    // InternalRos.g:4945:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalRos.g:4951:2: (this_BINARY_0= RULE_BINARY )
            // InternalRos.g:4952:2: this_BINARY_0= RULE_BINARY
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
    // InternalRos.g:4962:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalRos.g:4962:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalRos.g:4963:2: iv_ruleboolean0= ruleboolean0 EOF
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
    // InternalRos.g:4969:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalRos.g:4975:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalRos.g:4976:2: this_BOOLEAN_0= RULE_BOOLEAN
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
    // InternalRos.g:4986:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalRos.g:4986:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalRos.g:4987:2: iv_ruleDouble0= ruleDouble0 EOF
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
    // InternalRos.g:4993:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalRos.g:4999:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalRos.g:5000:2: this_DOUBLE_0= RULE_DOUBLE
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
    // InternalRos.g:5010:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalRos.g:5010:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalRos.g:5011:2: iv_ruleInteger0= ruleInteger0 EOF
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
    // InternalRos.g:5017:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalRos.g:5023:2: (this_DECINT_0= RULE_DECINT )
            // InternalRos.g:5024:2: this_DECINT_0= RULE_DECINT
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
    // InternalRos.g:5034:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalRos.g:5034:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalRos.g:5035:2: iv_ruleDateTime0= ruleDateTime0 EOF
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
    // InternalRos.g:5041:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalRos.g:5047:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalRos.g:5048:2: this_DATE_TIME_0= RULE_DATE_TIME
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
    // InternalRos.g:5058:1: entryRuleMessagePart returns [EObject current=null] : iv_ruleMessagePart= ruleMessagePart EOF ;
    public final EObject entryRuleMessagePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessagePart = null;


        try {
            // InternalRos.g:5058:52: (iv_ruleMessagePart= ruleMessagePart EOF )
            // InternalRos.g:5059:2: iv_ruleMessagePart= ruleMessagePart EOF
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
    // InternalRos.g:5065:1: ruleMessagePart returns [EObject current=null] : ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) ) ;
    public final EObject ruleMessagePart() throws RecognitionException {
        EObject current = null;

        Token lv_Data_1_2=null;
        EObject lv_Type_0_0 = null;

        AntlrDatatypeRuleToken lv_Data_1_1 = null;

        AntlrDatatypeRuleToken lv_Data_1_3 = null;



        	enterRule();

        try {
            // InternalRos.g:5071:2: ( ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) ) )
            // InternalRos.g:5072:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) )
            {
            // InternalRos.g:5072:2: ( ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) ) )
            // InternalRos.g:5073:3: ( (lv_Type_0_0= ruleAbstractType ) ) ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) )
            {
            // InternalRos.g:5073:3: ( (lv_Type_0_0= ruleAbstractType ) )
            // InternalRos.g:5074:4: (lv_Type_0_0= ruleAbstractType )
            {
            // InternalRos.g:5074:4: (lv_Type_0_0= ruleAbstractType )
            // InternalRos.g:5075:5: lv_Type_0_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getMessagePartAccess().getTypeAbstractTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_65);
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

            // InternalRos.g:5092:3: ( ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) ) )
            // InternalRos.g:5093:4: ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) )
            {
            // InternalRos.g:5093:4: ( (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString ) )
            // InternalRos.g:5094:5: (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString )
            {
            // InternalRos.g:5094:5: (lv_Data_1_1= ruleKEYWORD | lv_Data_1_2= RULE_MESSAGE_ASIGMENT | lv_Data_1_3= ruleEString )
            int alt83=3;
            switch ( input.LA(1) ) {
            case 45:
            case 47:
            case 48:
            case 49:
            case 51:
            case 67:
            case 73:
            case 83:
            case 93:
            case 108:
            case 109:
                {
                alt83=1;
                }
                break;
            case RULE_MESSAGE_ASIGMENT:
                {
                alt83=2;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt83=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalRos.g:5095:6: lv_Data_1_1= ruleKEYWORD
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
                    // InternalRos.g:5111:6: lv_Data_1_2= RULE_MESSAGE_ASIGMENT
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
                    // InternalRos.g:5126:6: lv_Data_1_3= ruleEString
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
    // InternalRos.g:5148:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalRos.g:5148:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalRos.g:5149:2: iv_ruleAbstractType= ruleAbstractType EOF
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
    // InternalRos.g:5155:1: ruleAbstractType returns [EObject current=null] : (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef ) ;
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
            // InternalRos.g:5161:2: ( (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef ) )
            // InternalRos.g:5162:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )
            {
            // InternalRos.g:5162:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )
            int alt84=31;
            alt84 = dfa84.predict(input);
            switch (alt84) {
                case 1 :
                    // InternalRos.g:5163:3: this_bool_0= rulebool
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
                    // InternalRos.g:5172:3: this_int8_1= ruleint8
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
                    // InternalRos.g:5181:3: this_uint8_2= ruleuint8
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
                    // InternalRos.g:5190:3: this_int16_3= ruleint16
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
                    // InternalRos.g:5199:3: this_uint16_4= ruleuint16
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
                    // InternalRos.g:5208:3: this_int32_5= ruleint32
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
                    // InternalRos.g:5217:3: this_uint32_6= ruleuint32
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
                    // InternalRos.g:5226:3: this_int64_7= ruleint64
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
                    // InternalRos.g:5235:3: this_uint64_8= ruleuint64
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
                    // InternalRos.g:5244:3: this_float32_9= rulefloat32
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
                    // InternalRos.g:5253:3: this_float64_10= rulefloat64
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
                    // InternalRos.g:5262:3: this_string0_11= rulestring0
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
                    // InternalRos.g:5271:3: this_byte_12= rulebyte
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
                    // InternalRos.g:5280:3: this_time_13= ruletime
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
                    // InternalRos.g:5289:3: this_duration_14= ruleduration
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
                    // InternalRos.g:5298:3: this_Header_15= ruleHeader
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
                    // InternalRos.g:5307:3: this_boolArray_16= ruleboolArray
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
                    // InternalRos.g:5316:3: this_int8Array_17= ruleint8Array
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
                    // InternalRos.g:5325:3: this_uint8Array_18= ruleuint8Array
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
                    // InternalRos.g:5334:3: this_int16Array_19= ruleint16Array
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
                    // InternalRos.g:5343:3: this_uint16Array_20= ruleuint16Array
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
                    // InternalRos.g:5352:3: this_int32Array_21= ruleint32Array
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
                    // InternalRos.g:5361:3: this_uint32Array_22= ruleuint32Array
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
                    // InternalRos.g:5370:3: this_int64Array_23= ruleint64Array
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
                    // InternalRos.g:5379:3: this_uint64Array_24= ruleuint64Array
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
                    // InternalRos.g:5388:3: this_float32Array_25= rulefloat32Array
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
                    // InternalRos.g:5397:3: this_float64Array_26= rulefloat64Array
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
                    // InternalRos.g:5406:3: this_string0Array_27= rulestring0Array
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
                    // InternalRos.g:5415:3: this_byteArray_28= rulebyteArray
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
                    // InternalRos.g:5424:3: this_TopicSpecRef_29= ruleTopicSpecRef
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
                    // InternalRos.g:5433:3: this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef
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
    // InternalRos.g:5445:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalRos.g:5445:45: (iv_rulebool= rulebool EOF )
            // InternalRos.g:5446:2: iv_rulebool= rulebool EOF
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
    // InternalRos.g:5452:1: rulebool returns [EObject current=null] : ( () otherlv_1= 'bool' ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5458:2: ( ( () otherlv_1= 'bool' ) )
            // InternalRos.g:5459:2: ( () otherlv_1= 'bool' )
            {
            // InternalRos.g:5459:2: ( () otherlv_1= 'bool' )
            // InternalRos.g:5460:3: () otherlv_1= 'bool'
            {
            // InternalRos.g:5460:3: ()
            // InternalRos.g:5461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,95,FOLLOW_2); 

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
    // InternalRos.g:5475:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalRos.g:5475:45: (iv_ruleint8= ruleint8 EOF )
            // InternalRos.g:5476:2: iv_ruleint8= ruleint8 EOF
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
    // InternalRos.g:5482:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= 'int8' ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5488:2: ( ( () otherlv_1= 'int8' ) )
            // InternalRos.g:5489:2: ( () otherlv_1= 'int8' )
            {
            // InternalRos.g:5489:2: ( () otherlv_1= 'int8' )
            // InternalRos.g:5490:3: () otherlv_1= 'int8'
            {
            // InternalRos.g:5490:3: ()
            // InternalRos.g:5491:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt8Access().getInt8Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,96,FOLLOW_2); 

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
    // InternalRos.g:5505:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalRos.g:5505:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalRos.g:5506:2: iv_ruleuint8= ruleuint8 EOF
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
    // InternalRos.g:5512:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= 'uint8' ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5518:2: ( ( () otherlv_1= 'uint8' ) )
            // InternalRos.g:5519:2: ( () otherlv_1= 'uint8' )
            {
            // InternalRos.g:5519:2: ( () otherlv_1= 'uint8' )
            // InternalRos.g:5520:3: () otherlv_1= 'uint8'
            {
            // InternalRos.g:5520:3: ()
            // InternalRos.g:5521:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint8Access().getUint8Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,97,FOLLOW_2); 

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
    // InternalRos.g:5535:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalRos.g:5535:46: (iv_ruleint16= ruleint16 EOF )
            // InternalRos.g:5536:2: iv_ruleint16= ruleint16 EOF
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
    // InternalRos.g:5542:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= 'int16' ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5548:2: ( ( () otherlv_1= 'int16' ) )
            // InternalRos.g:5549:2: ( () otherlv_1= 'int16' )
            {
            // InternalRos.g:5549:2: ( () otherlv_1= 'int16' )
            // InternalRos.g:5550:3: () otherlv_1= 'int16'
            {
            // InternalRos.g:5550:3: ()
            // InternalRos.g:5551:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt16Access().getInt16Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,98,FOLLOW_2); 

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
    // InternalRos.g:5565:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalRos.g:5565:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalRos.g:5566:2: iv_ruleuint16= ruleuint16 EOF
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
    // InternalRos.g:5572:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= 'uint16' ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5578:2: ( ( () otherlv_1= 'uint16' ) )
            // InternalRos.g:5579:2: ( () otherlv_1= 'uint16' )
            {
            // InternalRos.g:5579:2: ( () otherlv_1= 'uint16' )
            // InternalRos.g:5580:3: () otherlv_1= 'uint16'
            {
            // InternalRos.g:5580:3: ()
            // InternalRos.g:5581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint16Access().getUint16Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,99,FOLLOW_2); 

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
    // InternalRos.g:5595:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalRos.g:5595:46: (iv_ruleint32= ruleint32 EOF )
            // InternalRos.g:5596:2: iv_ruleint32= ruleint32 EOF
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
    // InternalRos.g:5602:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= 'int32' ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5608:2: ( ( () otherlv_1= 'int32' ) )
            // InternalRos.g:5609:2: ( () otherlv_1= 'int32' )
            {
            // InternalRos.g:5609:2: ( () otherlv_1= 'int32' )
            // InternalRos.g:5610:3: () otherlv_1= 'int32'
            {
            // InternalRos.g:5610:3: ()
            // InternalRos.g:5611:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt32Access().getInt32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,100,FOLLOW_2); 

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
    // InternalRos.g:5625:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalRos.g:5625:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalRos.g:5626:2: iv_ruleuint32= ruleuint32 EOF
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
    // InternalRos.g:5632:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= 'uint32' ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5638:2: ( ( () otherlv_1= 'uint32' ) )
            // InternalRos.g:5639:2: ( () otherlv_1= 'uint32' )
            {
            // InternalRos.g:5639:2: ( () otherlv_1= 'uint32' )
            // InternalRos.g:5640:3: () otherlv_1= 'uint32'
            {
            // InternalRos.g:5640:3: ()
            // InternalRos.g:5641:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint32Access().getUint32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,101,FOLLOW_2); 

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
    // InternalRos.g:5655:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalRos.g:5655:46: (iv_ruleint64= ruleint64 EOF )
            // InternalRos.g:5656:2: iv_ruleint64= ruleint64 EOF
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
    // InternalRos.g:5662:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= 'int64' ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5668:2: ( ( () otherlv_1= 'int64' ) )
            // InternalRos.g:5669:2: ( () otherlv_1= 'int64' )
            {
            // InternalRos.g:5669:2: ( () otherlv_1= 'int64' )
            // InternalRos.g:5670:3: () otherlv_1= 'int64'
            {
            // InternalRos.g:5670:3: ()
            // InternalRos.g:5671:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt64Access().getInt64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,102,FOLLOW_2); 

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
    // InternalRos.g:5685:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalRos.g:5685:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalRos.g:5686:2: iv_ruleuint64= ruleuint64 EOF
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
    // InternalRos.g:5692:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= 'uint64' ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5698:2: ( ( () otherlv_1= 'uint64' ) )
            // InternalRos.g:5699:2: ( () otherlv_1= 'uint64' )
            {
            // InternalRos.g:5699:2: ( () otherlv_1= 'uint64' )
            // InternalRos.g:5700:3: () otherlv_1= 'uint64'
            {
            // InternalRos.g:5700:3: ()
            // InternalRos.g:5701:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint64Access().getUint64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,103,FOLLOW_2); 

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
    // InternalRos.g:5715:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalRos.g:5715:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalRos.g:5716:2: iv_rulefloat32= rulefloat32 EOF
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
    // InternalRos.g:5722:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= 'float32' ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5728:2: ( ( () otherlv_1= 'float32' ) )
            // InternalRos.g:5729:2: ( () otherlv_1= 'float32' )
            {
            // InternalRos.g:5729:2: ( () otherlv_1= 'float32' )
            // InternalRos.g:5730:3: () otherlv_1= 'float32'
            {
            // InternalRos.g:5730:3: ()
            // InternalRos.g:5731:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat32Access().getFloat32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,104,FOLLOW_2); 

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
    // InternalRos.g:5745:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalRos.g:5745:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalRos.g:5746:2: iv_rulefloat64= rulefloat64 EOF
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
    // InternalRos.g:5752:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= 'float64' ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5758:2: ( ( () otherlv_1= 'float64' ) )
            // InternalRos.g:5759:2: ( () otherlv_1= 'float64' )
            {
            // InternalRos.g:5759:2: ( () otherlv_1= 'float64' )
            // InternalRos.g:5760:3: () otherlv_1= 'float64'
            {
            // InternalRos.g:5760:3: ()
            // InternalRos.g:5761:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat64Access().getFloat64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,105,FOLLOW_2); 

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
    // InternalRos.g:5775:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalRos.g:5775:48: (iv_rulestring0= rulestring0 EOF )
            // InternalRos.g:5776:2: iv_rulestring0= rulestring0 EOF
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
    // InternalRos.g:5782:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5788:2: ( ( () otherlv_1= 'string' ) )
            // InternalRos.g:5789:2: ( () otherlv_1= 'string' )
            {
            // InternalRos.g:5789:2: ( () otherlv_1= 'string' )
            // InternalRos.g:5790:3: () otherlv_1= 'string'
            {
            // InternalRos.g:5790:3: ()
            // InternalRos.g:5791:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,106,FOLLOW_2); 

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
    // InternalRos.g:5805:1: entryRulebyte returns [EObject current=null] : iv_rulebyte= rulebyte EOF ;
    public final EObject entryRulebyte() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyte = null;


        try {
            // InternalRos.g:5805:45: (iv_rulebyte= rulebyte EOF )
            // InternalRos.g:5806:2: iv_rulebyte= rulebyte EOF
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
    // InternalRos.g:5812:1: rulebyte returns [EObject current=null] : ( () otherlv_1= 'byte' ) ;
    public final EObject rulebyte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5818:2: ( ( () otherlv_1= 'byte' ) )
            // InternalRos.g:5819:2: ( () otherlv_1= 'byte' )
            {
            // InternalRos.g:5819:2: ( () otherlv_1= 'byte' )
            // InternalRos.g:5820:3: () otherlv_1= 'byte'
            {
            // InternalRos.g:5820:3: ()
            // InternalRos.g:5821:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getByteAccess().getByteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,107,FOLLOW_2); 

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
    // InternalRos.g:5835:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalRos.g:5835:45: (iv_ruletime= ruletime EOF )
            // InternalRos.g:5836:2: iv_ruletime= ruletime EOF
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
    // InternalRos.g:5842:1: ruletime returns [EObject current=null] : ( () otherlv_1= 'time' ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5848:2: ( ( () otherlv_1= 'time' ) )
            // InternalRos.g:5849:2: ( () otherlv_1= 'time' )
            {
            // InternalRos.g:5849:2: ( () otherlv_1= 'time' )
            // InternalRos.g:5850:3: () otherlv_1= 'time'
            {
            // InternalRos.g:5850:3: ()
            // InternalRos.g:5851:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeAccess().getTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,108,FOLLOW_2); 

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
    // InternalRos.g:5865:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalRos.g:5865:49: (iv_ruleduration= ruleduration EOF )
            // InternalRos.g:5866:2: iv_ruleduration= ruleduration EOF
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
    // InternalRos.g:5872:1: ruleduration returns [EObject current=null] : ( () otherlv_1= 'duration' ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5878:2: ( ( () otherlv_1= 'duration' ) )
            // InternalRos.g:5879:2: ( () otherlv_1= 'duration' )
            {
            // InternalRos.g:5879:2: ( () otherlv_1= 'duration' )
            // InternalRos.g:5880:3: () otherlv_1= 'duration'
            {
            // InternalRos.g:5880:3: ()
            // InternalRos.g:5881:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,109,FOLLOW_2); 

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
    // InternalRos.g:5895:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalRos.g:5895:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalRos.g:5896:2: iv_ruleboolArray= ruleboolArray EOF
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
    // InternalRos.g:5902:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= 'bool[]' ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5908:2: ( ( () otherlv_1= 'bool[]' ) )
            // InternalRos.g:5909:2: ( () otherlv_1= 'bool[]' )
            {
            // InternalRos.g:5909:2: ( () otherlv_1= 'bool[]' )
            // InternalRos.g:5910:3: () otherlv_1= 'bool[]'
            {
            // InternalRos.g:5910:3: ()
            // InternalRos.g:5911:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolArrayAccess().getBoolArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,110,FOLLOW_2); 

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
    // InternalRos.g:5925:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalRos.g:5925:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalRos.g:5926:2: iv_ruleint8Array= ruleint8Array EOF
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
    // InternalRos.g:5932:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= 'int8[]' ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5938:2: ( ( () otherlv_1= 'int8[]' ) )
            // InternalRos.g:5939:2: ( () otherlv_1= 'int8[]' )
            {
            // InternalRos.g:5939:2: ( () otherlv_1= 'int8[]' )
            // InternalRos.g:5940:3: () otherlv_1= 'int8[]'
            {
            // InternalRos.g:5940:3: ()
            // InternalRos.g:5941:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,111,FOLLOW_2); 

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
    // InternalRos.g:5955:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalRos.g:5955:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalRos.g:5956:2: iv_ruleuint8Array= ruleuint8Array EOF
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
    // InternalRos.g:5962:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= 'uint8[]' ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5968:2: ( ( () otherlv_1= 'uint8[]' ) )
            // InternalRos.g:5969:2: ( () otherlv_1= 'uint8[]' )
            {
            // InternalRos.g:5969:2: ( () otherlv_1= 'uint8[]' )
            // InternalRos.g:5970:3: () otherlv_1= 'uint8[]'
            {
            // InternalRos.g:5970:3: ()
            // InternalRos.g:5971:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,112,FOLLOW_2); 

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
    // InternalRos.g:5985:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalRos.g:5985:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalRos.g:5986:2: iv_ruleint16Array= ruleint16Array EOF
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
    // InternalRos.g:5992:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= 'int16[]' ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:5998:2: ( ( () otherlv_1= 'int16[]' ) )
            // InternalRos.g:5999:2: ( () otherlv_1= 'int16[]' )
            {
            // InternalRos.g:5999:2: ( () otherlv_1= 'int16[]' )
            // InternalRos.g:6000:3: () otherlv_1= 'int16[]'
            {
            // InternalRos.g:6000:3: ()
            // InternalRos.g:6001:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,113,FOLLOW_2); 

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
    // InternalRos.g:6015:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalRos.g:6015:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalRos.g:6016:2: iv_ruleuint16Array= ruleuint16Array EOF
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
    // InternalRos.g:6022:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= 'uint16[]' ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6028:2: ( ( () otherlv_1= 'uint16[]' ) )
            // InternalRos.g:6029:2: ( () otherlv_1= 'uint16[]' )
            {
            // InternalRos.g:6029:2: ( () otherlv_1= 'uint16[]' )
            // InternalRos.g:6030:3: () otherlv_1= 'uint16[]'
            {
            // InternalRos.g:6030:3: ()
            // InternalRos.g:6031:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,114,FOLLOW_2); 

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
    // InternalRos.g:6045:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalRos.g:6045:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalRos.g:6046:2: iv_ruleint32Array= ruleint32Array EOF
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
    // InternalRos.g:6052:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= 'int32[]' ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6058:2: ( ( () otherlv_1= 'int32[]' ) )
            // InternalRos.g:6059:2: ( () otherlv_1= 'int32[]' )
            {
            // InternalRos.g:6059:2: ( () otherlv_1= 'int32[]' )
            // InternalRos.g:6060:3: () otherlv_1= 'int32[]'
            {
            // InternalRos.g:6060:3: ()
            // InternalRos.g:6061:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,115,FOLLOW_2); 

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
    // InternalRos.g:6075:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalRos.g:6075:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalRos.g:6076:2: iv_ruleuint32Array= ruleuint32Array EOF
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
    // InternalRos.g:6082:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= 'uint32[]' ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6088:2: ( ( () otherlv_1= 'uint32[]' ) )
            // InternalRos.g:6089:2: ( () otherlv_1= 'uint32[]' )
            {
            // InternalRos.g:6089:2: ( () otherlv_1= 'uint32[]' )
            // InternalRos.g:6090:3: () otherlv_1= 'uint32[]'
            {
            // InternalRos.g:6090:3: ()
            // InternalRos.g:6091:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,116,FOLLOW_2); 

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
    // InternalRos.g:6105:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalRos.g:6105:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalRos.g:6106:2: iv_ruleint64Array= ruleint64Array EOF
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
    // InternalRos.g:6112:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= 'int64[]' ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6118:2: ( ( () otherlv_1= 'int64[]' ) )
            // InternalRos.g:6119:2: ( () otherlv_1= 'int64[]' )
            {
            // InternalRos.g:6119:2: ( () otherlv_1= 'int64[]' )
            // InternalRos.g:6120:3: () otherlv_1= 'int64[]'
            {
            // InternalRos.g:6120:3: ()
            // InternalRos.g:6121:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,117,FOLLOW_2); 

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
    // InternalRos.g:6135:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalRos.g:6135:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalRos.g:6136:2: iv_ruleuint64Array= ruleuint64Array EOF
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
    // InternalRos.g:6142:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= 'uint64[]' ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6148:2: ( ( () otherlv_1= 'uint64[]' ) )
            // InternalRos.g:6149:2: ( () otherlv_1= 'uint64[]' )
            {
            // InternalRos.g:6149:2: ( () otherlv_1= 'uint64[]' )
            // InternalRos.g:6150:3: () otherlv_1= 'uint64[]'
            {
            // InternalRos.g:6150:3: ()
            // InternalRos.g:6151:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,118,FOLLOW_2); 

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
    // InternalRos.g:6165:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalRos.g:6165:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalRos.g:6166:2: iv_rulefloat32Array= rulefloat32Array EOF
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
    // InternalRos.g:6172:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= 'float32[]' ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6178:2: ( ( () otherlv_1= 'float32[]' ) )
            // InternalRos.g:6179:2: ( () otherlv_1= 'float32[]' )
            {
            // InternalRos.g:6179:2: ( () otherlv_1= 'float32[]' )
            // InternalRos.g:6180:3: () otherlv_1= 'float32[]'
            {
            // InternalRos.g:6180:3: ()
            // InternalRos.g:6181:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,119,FOLLOW_2); 

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
    // InternalRos.g:6195:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalRos.g:6195:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalRos.g:6196:2: iv_rulefloat64Array= rulefloat64Array EOF
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
    // InternalRos.g:6202:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= 'float64[]' ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6208:2: ( ( () otherlv_1= 'float64[]' ) )
            // InternalRos.g:6209:2: ( () otherlv_1= 'float64[]' )
            {
            // InternalRos.g:6209:2: ( () otherlv_1= 'float64[]' )
            // InternalRos.g:6210:3: () otherlv_1= 'float64[]'
            {
            // InternalRos.g:6210:3: ()
            // InternalRos.g:6211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,120,FOLLOW_2); 

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
    // InternalRos.g:6225:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalRos.g:6225:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalRos.g:6226:2: iv_rulestring0Array= rulestring0Array EOF
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
    // InternalRos.g:6232:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= 'string[]' ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6238:2: ( ( () otherlv_1= 'string[]' ) )
            // InternalRos.g:6239:2: ( () otherlv_1= 'string[]' )
            {
            // InternalRos.g:6239:2: ( () otherlv_1= 'string[]' )
            // InternalRos.g:6240:3: () otherlv_1= 'string[]'
            {
            // InternalRos.g:6240:3: ()
            // InternalRos.g:6241:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0ArrayAccess().getStringArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,121,FOLLOW_2); 

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
    // InternalRos.g:6255:1: entryRulebyteArray returns [EObject current=null] : iv_rulebyteArray= rulebyteArray EOF ;
    public final EObject entryRulebyteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyteArray = null;


        try {
            // InternalRos.g:6255:50: (iv_rulebyteArray= rulebyteArray EOF )
            // InternalRos.g:6256:2: iv_rulebyteArray= rulebyteArray EOF
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
    // InternalRos.g:6262:1: rulebyteArray returns [EObject current=null] : ( () otherlv_1= 'byte[]' ) ;
    public final EObject rulebyteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6268:2: ( ( () otherlv_1= 'byte[]' ) )
            // InternalRos.g:6269:2: ( () otherlv_1= 'byte[]' )
            {
            // InternalRos.g:6269:2: ( () otherlv_1= 'byte[]' )
            // InternalRos.g:6270:3: () otherlv_1= 'byte[]'
            {
            // InternalRos.g:6270:3: ()
            // InternalRos.g:6271:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getByteArrayAccess().getByteArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,122,FOLLOW_2); 

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
    // InternalRos.g:6285:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalRos.g:6285:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalRos.g:6286:2: iv_ruleHeader= ruleHeader EOF
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
    // InternalRos.g:6292:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= 'Header' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6298:2: ( ( () otherlv_1= 'Header' ) )
            // InternalRos.g:6299:2: ( () otherlv_1= 'Header' )
            {
            // InternalRos.g:6299:2: ( () otherlv_1= 'Header' )
            // InternalRos.g:6300:3: () otherlv_1= 'Header'
            {
            // InternalRos.g:6300:3: ()
            // InternalRos.g:6301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeaderAccess().getHeaderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_2); 

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
    // InternalRos.g:6315:1: entryRuleTopicSpecRef returns [EObject current=null] : iv_ruleTopicSpecRef= ruleTopicSpecRef EOF ;
    public final EObject entryRuleTopicSpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopicSpecRef = null;


        try {
            // InternalRos.g:6315:53: (iv_ruleTopicSpecRef= ruleTopicSpecRef EOF )
            // InternalRos.g:6316:2: iv_ruleTopicSpecRef= ruleTopicSpecRef EOF
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
    // InternalRos.g:6322:1: ruleTopicSpecRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleTopicSpecRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalRos.g:6328:2: ( ( ( ruleEString ) ) )
            // InternalRos.g:6329:2: ( ( ruleEString ) )
            {
            // InternalRos.g:6329:2: ( ( ruleEString ) )
            // InternalRos.g:6330:3: ( ruleEString )
            {
            // InternalRos.g:6330:3: ( ruleEString )
            // InternalRos.g:6331:4: ruleEString
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
    // InternalRos.g:6348:1: entryRuleArrayTopicSpecRef returns [EObject current=null] : iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF ;
    public final EObject entryRuleArrayTopicSpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayTopicSpecRef = null;


        try {
            // InternalRos.g:6348:58: (iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF )
            // InternalRos.g:6349:2: iv_ruleArrayTopicSpecRef= ruleArrayTopicSpecRef EOF
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
    // InternalRos.g:6355:1: ruleArrayTopicSpecRef returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '[]' ) ;
    public final EObject ruleArrayTopicSpecRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRos.g:6361:2: ( ( ( ( ruleEString ) ) otherlv_1= '[]' ) )
            // InternalRos.g:6362:2: ( ( ( ruleEString ) ) otherlv_1= '[]' )
            {
            // InternalRos.g:6362:2: ( ( ( ruleEString ) ) otherlv_1= '[]' )
            // InternalRos.g:6363:3: ( ( ruleEString ) ) otherlv_1= '[]'
            {
            // InternalRos.g:6363:3: ( ( ruleEString ) )
            // InternalRos.g:6364:4: ( ruleEString )
            {
            // InternalRos.g:6364:4: ( ruleEString )
            // InternalRos.g:6365:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArrayTopicSpecRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArrayTopicSpecRefAccess().getTopicSpecTopicSpecCrossReference_0_0());
            				
            pushFollow(FOLLOW_66);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,123,FOLLOW_2); 

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
    // InternalRos.g:6387:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalRos.g:6387:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalRos.g:6388:2: iv_ruleKEYWORD= ruleKEYWORD EOF
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
    // InternalRos.g:6394:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'goal' | kw= 'message' | kw= 'result' | kw= 'feedback' | kw= 'name' | kw= 'value' | kw= 'service' | kw= 'type' | kw= 'action' | kw= 'duration' | kw= 'time' ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalRos.g:6400:2: ( (kw= 'goal' | kw= 'message' | kw= 'result' | kw= 'feedback' | kw= 'name' | kw= 'value' | kw= 'service' | kw= 'type' | kw= 'action' | kw= 'duration' | kw= 'time' ) )
            // InternalRos.g:6401:2: (kw= 'goal' | kw= 'message' | kw= 'result' | kw= 'feedback' | kw= 'name' | kw= 'value' | kw= 'service' | kw= 'type' | kw= 'action' | kw= 'duration' | kw= 'time' )
            {
            // InternalRos.g:6401:2: (kw= 'goal' | kw= 'message' | kw= 'result' | kw= 'feedback' | kw= 'name' | kw= 'value' | kw= 'service' | kw= 'type' | kw= 'action' | kw= 'duration' | kw= 'time' )
            int alt85=11;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt85=1;
                }
                break;
            case 45:
                {
                alt85=2;
                }
                break;
            case 48:
                {
                alt85=3;
                }
                break;
            case 49:
                {
                alt85=4;
                }
                break;
            case 51:
                {
                alt85=5;
                }
                break;
            case 93:
                {
                alt85=6;
                }
                break;
            case 67:
                {
                alt85=7;
                }
                break;
            case 83:
                {
                alt85=8;
                }
                break;
            case 73:
                {
                alt85=9;
                }
                break;
            case 109:
                {
                alt85=10;
                }
                break;
            case 108:
                {
                alt85=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // InternalRos.g:6402:3: kw= 'goal'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRos.g:6408:3: kw= 'message'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalRos.g:6414:3: kw= 'result'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalRos.g:6420:3: kw= 'feedback'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalRos.g:6426:3: kw= 'name'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalRos.g:6432:3: kw= 'value'
                    {
                    kw=(Token)match(input,93,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalRos.g:6438:3: kw= 'service'
                    {
                    kw=(Token)match(input,67,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalRos.g:6444:3: kw= 'type'
                    {
                    kw=(Token)match(input,83,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalRos.g:6450:3: kw= 'action'
                    {
                    kw=(Token)match(input,73,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalRos.g:6456:3: kw= 'duration'
                    {
                    kw=(Token)match(input,109,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalRos.g:6462:3: kw= 'time'
                    {
                    kw=(Token)match(input,108,FOLLOW_2); 

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


    protected DFA84 dfa84 = new DFA84(this);
    static final String dfa_1s = "\42\uffff";
    static final String dfa_2s = "\36\uffff\2\41\2\uffff";
    static final String dfa_3s = "\1\4\35\uffff\2\4\2\uffff";
    static final String dfa_4s = "\1\172\35\uffff\2\173\2\uffff";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\37\1\36";
    static final String dfa_6s = "\42\uffff}>";
    static final String[] dfa_7s = {
            "\1\36\1\37\45\uffff\1\20\63\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35",
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
            "\2\41\6\uffff\1\41\40\uffff\1\41\1\uffff\3\41\1\uffff\1\41\17\uffff\1\41\5\uffff\1\41\11\uffff\1\41\11\uffff\1\41\16\uffff\2\41\15\uffff\1\40",
            "\2\41\6\uffff\1\41\40\uffff\1\41\1\uffff\3\41\1\uffff\1\41\17\uffff\1\41\5\uffff\1\41\11\uffff\1\41\11\uffff\1\41\16\uffff\2\41\15\uffff\1\40",
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

    class DFA84 extends DFA {

        public DFA84(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 84;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "5162:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_TopicSpecRef_29= ruleTopicSpecRef | this_ArrayTopicSpecRef_30= ruleArrayTopicSpecRef )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001068000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000BA0000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000448000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000A20000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004000420000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000006BA0000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000006A20000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000006030000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000030020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000180000000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000200020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0003800020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0003000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080020000030L,0x07FFFFFF80000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xFFF0000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xFFC0000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xFF00000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xFC00000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xF000000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xC000000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000034000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000020000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000100000000000L,0x000000000F700000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000020000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00000000040007B0L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000020000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x000BA00000001030L,0x0000300020080208L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});

}