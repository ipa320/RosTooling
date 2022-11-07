package de.fraunhofer.ipa.ros1.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fraunhofer.ipa.ros1.services.Ros1GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRos1Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ExternalDependency", "Dependencies", "FromGitRepo", "Subscribers", "Parameters", "Publishers", "Artifacts", "Node_1", "Type", "Node", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "RightCurlyBracket", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ID", "RULE_ROS_CONVENTION_A", "RULE_STRING", "RULE_ROS_CONVENTION_PARAM", "RULE_INT", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int RULE_END=20;
    public static final int RULE_BEGIN=19;
    public static final int Node=13;
    public static final int RULE_STRING=24;
    public static final int RULE_SL_COMMENT=21;
    public static final int Comma=14;
    public static final int RULE_ROS_CONVENTION_A=23;
    public static final int Publishers=9;
    public static final int RULE_ROS_CONVENTION_PARAM=25;
    public static final int Dependencies=5;
    public static final int Colon=15;
    public static final int RightCurlyBracket=18;
    public static final int EOF=-1;
    public static final int RightSquareBracket=17;
    public static final int FromGitRepo=6;
    public static final int ExternalDependency=4;
    public static final int Parameters=8;
    public static final int RULE_ID=22;
    public static final int RULE_WS=28;
    public static final int RULE_ANY_OTHER=29;
    public static final int Artifacts=10;
    public static final int Node_1=11;
    public static final int Type=12;
    public static final int RULE_INT=26;
    public static final int RULE_ML_COMMENT=27;
    public static final int LeftSquareBracket=16;
    public static final int Subscribers=7;

    // delegates
    // delegators


        public InternalRos1Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRos1Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRos1Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalRos1Parser.g"; }


    	private Ros1GrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("Comma", "','");
    		tokenNameToValue.put("Colon", "':'");
    		tokenNameToValue.put("LeftSquareBracket", "'['");
    		tokenNameToValue.put("RightSquareBracket", "']'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("Node", "'node'");
    		tokenNameToValue.put("Node_1", "'node:'");
    		tokenNameToValue.put("Type", "'type:'");
    		tokenNameToValue.put("Artifacts", "'artifacts:'");
    		tokenNameToValue.put("Parameters", "'parameters:'");
    		tokenNameToValue.put("Publishers", "'publishers:'");
    		tokenNameToValue.put("FromGitRepo", "'fromGitRepo:'");
    		tokenNameToValue.put("Subscribers", "'subscribers:'");
    		tokenNameToValue.put("Dependencies", "'dependencies:'");
    		tokenNameToValue.put("ExternalDependency", "'ExternalDependency'");
    	}

    	public void setGrammarAccess(Ros1GrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleCatkinPackage"
    // InternalRos1Parser.g:70:1: entryRuleCatkinPackage : ruleCatkinPackage EOF ;
    public final void entryRuleCatkinPackage() throws RecognitionException {
        try {
            // InternalRos1Parser.g:71:1: ( ruleCatkinPackage EOF )
            // InternalRos1Parser.g:72:1: ruleCatkinPackage EOF
            {
             before(grammarAccess.getCatkinPackageRule()); 
            pushFollow(FOLLOW_1);
            ruleCatkinPackage();

            state._fsp--;

             after(grammarAccess.getCatkinPackageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCatkinPackage"


    // $ANTLR start "ruleCatkinPackage"
    // InternalRos1Parser.g:79:1: ruleCatkinPackage : ( ( rule__CatkinPackage__Group__0 ) ) ;
    public final void ruleCatkinPackage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:83:2: ( ( ( rule__CatkinPackage__Group__0 ) ) )
            // InternalRos1Parser.g:84:2: ( ( rule__CatkinPackage__Group__0 ) )
            {
            // InternalRos1Parser.g:84:2: ( ( rule__CatkinPackage__Group__0 ) )
            // InternalRos1Parser.g:85:3: ( rule__CatkinPackage__Group__0 )
            {
             before(grammarAccess.getCatkinPackageAccess().getGroup()); 
            // InternalRos1Parser.g:86:3: ( rule__CatkinPackage__Group__0 )
            // InternalRos1Parser.g:86:4: rule__CatkinPackage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCatkinPackageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCatkinPackage"


    // $ANTLR start "entryRuleArtifact"
    // InternalRos1Parser.g:95:1: entryRuleArtifact : ruleArtifact EOF ;
    public final void entryRuleArtifact() throws RecognitionException {
        try {
            // InternalRos1Parser.g:96:1: ( ruleArtifact EOF )
            // InternalRos1Parser.g:97:1: ruleArtifact EOF
            {
             before(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_1);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getArtifactRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // InternalRos1Parser.g:104:1: ruleArtifact : ( ( rule__Artifact__Group__0 ) ) ;
    public final void ruleArtifact() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:108:2: ( ( ( rule__Artifact__Group__0 ) ) )
            // InternalRos1Parser.g:109:2: ( ( rule__Artifact__Group__0 ) )
            {
            // InternalRos1Parser.g:109:2: ( ( rule__Artifact__Group__0 ) )
            // InternalRos1Parser.g:110:3: ( rule__Artifact__Group__0 )
            {
             before(grammarAccess.getArtifactAccess().getGroup()); 
            // InternalRos1Parser.g:111:3: ( rule__Artifact__Group__0 )
            // InternalRos1Parser.g:111:4: rule__Artifact__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleNode"
    // InternalRos1Parser.g:120:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalRos1Parser.g:121:1: ( ruleNode EOF )
            // InternalRos1Parser.g:122:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalRos1Parser.g:129:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:133:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalRos1Parser.g:134:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalRos1Parser.g:134:2: ( ( rule__Node__Group__0 ) )
            // InternalRos1Parser.g:135:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalRos1Parser.g:136:3: ( rule__Node__Group__0 )
            // InternalRos1Parser.g:136:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRulePublisher"
    // InternalRos1Parser.g:145:1: entryRulePublisher : rulePublisher EOF ;
    public final void entryRulePublisher() throws RecognitionException {
        try {
            // InternalRos1Parser.g:146:1: ( rulePublisher EOF )
            // InternalRos1Parser.g:147:1: rulePublisher EOF
            {
             before(grammarAccess.getPublisherRule()); 
            pushFollow(FOLLOW_1);
            rulePublisher();

            state._fsp--;

             after(grammarAccess.getPublisherRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePublisher"


    // $ANTLR start "rulePublisher"
    // InternalRos1Parser.g:154:1: rulePublisher : ( ( rule__Publisher__Group__0 ) ) ;
    public final void rulePublisher() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:158:2: ( ( ( rule__Publisher__Group__0 ) ) )
            // InternalRos1Parser.g:159:2: ( ( rule__Publisher__Group__0 ) )
            {
            // InternalRos1Parser.g:159:2: ( ( rule__Publisher__Group__0 ) )
            // InternalRos1Parser.g:160:3: ( rule__Publisher__Group__0 )
            {
             before(grammarAccess.getPublisherAccess().getGroup()); 
            // InternalRos1Parser.g:161:3: ( rule__Publisher__Group__0 )
            // InternalRos1Parser.g:161:4: rule__Publisher__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublisher"


    // $ANTLR start "entryRuleSubscriber"
    // InternalRos1Parser.g:170:1: entryRuleSubscriber : ruleSubscriber EOF ;
    public final void entryRuleSubscriber() throws RecognitionException {
        try {
            // InternalRos1Parser.g:171:1: ( ruleSubscriber EOF )
            // InternalRos1Parser.g:172:1: ruleSubscriber EOF
            {
             before(grammarAccess.getSubscriberRule()); 
            pushFollow(FOLLOW_1);
            ruleSubscriber();

            state._fsp--;

             after(grammarAccess.getSubscriberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubscriber"


    // $ANTLR start "ruleSubscriber"
    // InternalRos1Parser.g:179:1: ruleSubscriber : ( ( rule__Subscriber__Group__0 ) ) ;
    public final void ruleSubscriber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:183:2: ( ( ( rule__Subscriber__Group__0 ) ) )
            // InternalRos1Parser.g:184:2: ( ( rule__Subscriber__Group__0 ) )
            {
            // InternalRos1Parser.g:184:2: ( ( rule__Subscriber__Group__0 ) )
            // InternalRos1Parser.g:185:3: ( rule__Subscriber__Group__0 )
            {
             before(grammarAccess.getSubscriberAccess().getGroup()); 
            // InternalRos1Parser.g:186:3: ( rule__Subscriber__Group__0 )
            // InternalRos1Parser.g:186:4: rule__Subscriber__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubscriber"


    // $ANTLR start "entryRuleParameter"
    // InternalRos1Parser.g:195:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalRos1Parser.g:196:1: ( ruleParameter EOF )
            // InternalRos1Parser.g:197:1: ruleParameter EOF
            {
             before(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalRos1Parser.g:204:1: ruleParameter : ( ( rule__Parameter__Group__0 ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:208:2: ( ( ( rule__Parameter__Group__0 ) ) )
            // InternalRos1Parser.g:209:2: ( ( rule__Parameter__Group__0 ) )
            {
            // InternalRos1Parser.g:209:2: ( ( rule__Parameter__Group__0 ) )
            // InternalRos1Parser.g:210:3: ( rule__Parameter__Group__0 )
            {
             before(grammarAccess.getParameterAccess().getGroup()); 
            // InternalRos1Parser.g:211:3: ( rule__Parameter__Group__0 )
            // InternalRos1Parser.g:211:4: rule__Parameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleDependency"
    // InternalRos1Parser.g:220:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // InternalRos1Parser.g:221:1: ( ruleDependency EOF )
            // InternalRos1Parser.g:222:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // InternalRos1Parser.g:229:1: ruleDependency : ( ( rule__Dependency__Alternatives ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:233:2: ( ( ( rule__Dependency__Alternatives ) ) )
            // InternalRos1Parser.g:234:2: ( ( rule__Dependency__Alternatives ) )
            {
            // InternalRos1Parser.g:234:2: ( ( rule__Dependency__Alternatives ) )
            // InternalRos1Parser.g:235:3: ( rule__Dependency__Alternatives )
            {
             before(grammarAccess.getDependencyAccess().getAlternatives()); 
            // InternalRos1Parser.g:236:3: ( rule__Dependency__Alternatives )
            // InternalRos1Parser.g:236:4: rule__Dependency__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Dependency__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDependencyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRulePackageDependency"
    // InternalRos1Parser.g:245:1: entryRulePackageDependency : rulePackageDependency EOF ;
    public final void entryRulePackageDependency() throws RecognitionException {
        try {
            // InternalRos1Parser.g:246:1: ( rulePackageDependency EOF )
            // InternalRos1Parser.g:247:1: rulePackageDependency EOF
            {
             before(grammarAccess.getPackageDependencyRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDependency();

            state._fsp--;

             after(grammarAccess.getPackageDependencyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePackageDependency"


    // $ANTLR start "rulePackageDependency"
    // InternalRos1Parser.g:254:1: rulePackageDependency : ( ( rule__PackageDependency__PackageAssignment ) ) ;
    public final void rulePackageDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:258:2: ( ( ( rule__PackageDependency__PackageAssignment ) ) )
            // InternalRos1Parser.g:259:2: ( ( rule__PackageDependency__PackageAssignment ) )
            {
            // InternalRos1Parser.g:259:2: ( ( rule__PackageDependency__PackageAssignment ) )
            // InternalRos1Parser.g:260:3: ( rule__PackageDependency__PackageAssignment )
            {
             before(grammarAccess.getPackageDependencyAccess().getPackageAssignment()); 
            // InternalRos1Parser.g:261:3: ( rule__PackageDependency__PackageAssignment )
            // InternalRos1Parser.g:261:4: rule__PackageDependency__PackageAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PackageDependency__PackageAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPackageDependencyAccess().getPackageAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePackageDependency"


    // $ANTLR start "entryRuleExternalDependency"
    // InternalRos1Parser.g:270:1: entryRuleExternalDependency : ruleExternalDependency EOF ;
    public final void entryRuleExternalDependency() throws RecognitionException {
        try {
            // InternalRos1Parser.g:271:1: ( ruleExternalDependency EOF )
            // InternalRos1Parser.g:272:1: ruleExternalDependency EOF
            {
             before(grammarAccess.getExternalDependencyRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalDependency();

            state._fsp--;

             after(grammarAccess.getExternalDependencyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalDependency"


    // $ANTLR start "ruleExternalDependency"
    // InternalRos1Parser.g:279:1: ruleExternalDependency : ( ( rule__ExternalDependency__Group__0 ) ) ;
    public final void ruleExternalDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:283:2: ( ( ( rule__ExternalDependency__Group__0 ) ) )
            // InternalRos1Parser.g:284:2: ( ( rule__ExternalDependency__Group__0 ) )
            {
            // InternalRos1Parser.g:284:2: ( ( rule__ExternalDependency__Group__0 ) )
            // InternalRos1Parser.g:285:3: ( rule__ExternalDependency__Group__0 )
            {
             before(grammarAccess.getExternalDependencyAccess().getGroup()); 
            // InternalRos1Parser.g:286:3: ( rule__ExternalDependency__Group__0 )
            // InternalRos1Parser.g:286:4: rule__ExternalDependency__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDependency__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalDependency"


    // $ANTLR start "entryRuleRosNames"
    // InternalRos1Parser.g:295:1: entryRuleRosNames : ruleRosNames EOF ;
    public final void entryRuleRosNames() throws RecognitionException {
        try {
            // InternalRos1Parser.g:296:1: ( ruleRosNames EOF )
            // InternalRos1Parser.g:297:1: ruleRosNames EOF
            {
             before(grammarAccess.getRosNamesRule()); 
            pushFollow(FOLLOW_1);
            ruleRosNames();

            state._fsp--;

             after(grammarAccess.getRosNamesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosNames"


    // $ANTLR start "ruleRosNames"
    // InternalRos1Parser.g:304:1: ruleRosNames : ( ( rule__RosNames__Alternatives ) ) ;
    public final void ruleRosNames() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:308:2: ( ( ( rule__RosNames__Alternatives ) ) )
            // InternalRos1Parser.g:309:2: ( ( rule__RosNames__Alternatives ) )
            {
            // InternalRos1Parser.g:309:2: ( ( rule__RosNames__Alternatives ) )
            // InternalRos1Parser.g:310:3: ( rule__RosNames__Alternatives )
            {
             before(grammarAccess.getRosNamesAccess().getAlternatives()); 
            // InternalRos1Parser.g:311:3: ( rule__RosNames__Alternatives )
            // InternalRos1Parser.g:311:4: rule__RosNames__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RosNames__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRosNamesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosNames"


    // $ANTLR start "entryRuleEString"
    // InternalRos1Parser.g:320:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRos1Parser.g:321:1: ( ruleEString EOF )
            // InternalRos1Parser.g:322:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRos1Parser.g:329:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:333:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRos1Parser.g:334:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRos1Parser.g:334:2: ( ( rule__EString__Alternatives ) )
            // InternalRos1Parser.g:335:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRos1Parser.g:336:3: ( rule__EString__Alternatives )
            // InternalRos1Parser.g:336:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Dependency__Alternatives"
    // InternalRos1Parser.g:344:1: rule__Dependency__Alternatives : ( ( rulePackageDependency ) | ( ruleExternalDependency ) );
    public final void rule__Dependency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:348:1: ( ( rulePackageDependency ) | ( ruleExternalDependency ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID||LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==ExternalDependency) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRos1Parser.g:349:2: ( rulePackageDependency )
                    {
                    // InternalRos1Parser.g:349:2: ( rulePackageDependency )
                    // InternalRos1Parser.g:350:3: rulePackageDependency
                    {
                     before(grammarAccess.getDependencyAccess().getPackageDependencyParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDependency();

                    state._fsp--;

                     after(grammarAccess.getDependencyAccess().getPackageDependencyParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRos1Parser.g:355:2: ( ruleExternalDependency )
                    {
                    // InternalRos1Parser.g:355:2: ( ruleExternalDependency )
                    // InternalRos1Parser.g:356:3: ruleExternalDependency
                    {
                     before(grammarAccess.getDependencyAccess().getExternalDependencyParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalDependency();

                    state._fsp--;

                     after(grammarAccess.getDependencyAccess().getExternalDependencyParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dependency__Alternatives"


    // $ANTLR start "rule__RosNames__Alternatives"
    // InternalRos1Parser.g:365:1: rule__RosNames__Alternatives : ( ( RULE_ROS_CONVENTION_A ) | ( RULE_ID ) | ( Node ) );
    public final void rule__RosNames__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:369:1: ( ( RULE_ROS_CONVENTION_A ) | ( RULE_ID ) | ( Node ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_ROS_CONVENTION_A:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                alt2=2;
                }
                break;
            case Node:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRos1Parser.g:370:2: ( RULE_ROS_CONVENTION_A )
                    {
                    // InternalRos1Parser.g:370:2: ( RULE_ROS_CONVENTION_A )
                    // InternalRos1Parser.g:371:3: RULE_ROS_CONVENTION_A
                    {
                     before(grammarAccess.getRosNamesAccess().getROS_CONVENTION_ATerminalRuleCall_0()); 
                    match(input,RULE_ROS_CONVENTION_A,FOLLOW_2); 
                     after(grammarAccess.getRosNamesAccess().getROS_CONVENTION_ATerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRos1Parser.g:376:2: ( RULE_ID )
                    {
                    // InternalRos1Parser.g:376:2: ( RULE_ID )
                    // InternalRos1Parser.g:377:3: RULE_ID
                    {
                     before(grammarAccess.getRosNamesAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getRosNamesAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRos1Parser.g:382:2: ( Node )
                    {
                    // InternalRos1Parser.g:382:2: ( Node )
                    // InternalRos1Parser.g:383:3: Node
                    {
                     before(grammarAccess.getRosNamesAccess().getNodeKeyword_2()); 
                    match(input,Node,FOLLOW_2); 
                     after(grammarAccess.getRosNamesAccess().getNodeKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosNames__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRos1Parser.g:392:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:396:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRos1Parser.g:397:2: ( RULE_STRING )
                    {
                    // InternalRos1Parser.g:397:2: ( RULE_STRING )
                    // InternalRos1Parser.g:398:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRos1Parser.g:403:2: ( RULE_ID )
                    {
                    // InternalRos1Parser.g:403:2: ( RULE_ID )
                    // InternalRos1Parser.g:404:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__CatkinPackage__Group__0"
    // InternalRos1Parser.g:413:1: rule__CatkinPackage__Group__0 : rule__CatkinPackage__Group__0__Impl rule__CatkinPackage__Group__1 ;
    public final void rule__CatkinPackage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:417:1: ( rule__CatkinPackage__Group__0__Impl rule__CatkinPackage__Group__1 )
            // InternalRos1Parser.g:418:2: rule__CatkinPackage__Group__0__Impl rule__CatkinPackage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CatkinPackage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__0"


    // $ANTLR start "rule__CatkinPackage__Group__0__Impl"
    // InternalRos1Parser.g:425:1: rule__CatkinPackage__Group__0__Impl : ( () ) ;
    public final void rule__CatkinPackage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:429:1: ( ( () ) )
            // InternalRos1Parser.g:430:1: ( () )
            {
            // InternalRos1Parser.g:430:1: ( () )
            // InternalRos1Parser.g:431:2: ()
            {
             before(grammarAccess.getCatkinPackageAccess().getCatkinPackageAction_0()); 
            // InternalRos1Parser.g:432:2: ()
            // InternalRos1Parser.g:432:3: 
            {
            }

             after(grammarAccess.getCatkinPackageAccess().getCatkinPackageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__0__Impl"


    // $ANTLR start "rule__CatkinPackage__Group__1"
    // InternalRos1Parser.g:440:1: rule__CatkinPackage__Group__1 : rule__CatkinPackage__Group__1__Impl rule__CatkinPackage__Group__2 ;
    public final void rule__CatkinPackage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:444:1: ( rule__CatkinPackage__Group__1__Impl rule__CatkinPackage__Group__2 )
            // InternalRos1Parser.g:445:2: rule__CatkinPackage__Group__1__Impl rule__CatkinPackage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CatkinPackage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__1"


    // $ANTLR start "rule__CatkinPackage__Group__1__Impl"
    // InternalRos1Parser.g:452:1: rule__CatkinPackage__Group__1__Impl : ( ( rule__CatkinPackage__NameAssignment_1 ) ) ;
    public final void rule__CatkinPackage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:456:1: ( ( ( rule__CatkinPackage__NameAssignment_1 ) ) )
            // InternalRos1Parser.g:457:1: ( ( rule__CatkinPackage__NameAssignment_1 ) )
            {
            // InternalRos1Parser.g:457:1: ( ( rule__CatkinPackage__NameAssignment_1 ) )
            // InternalRos1Parser.g:458:2: ( rule__CatkinPackage__NameAssignment_1 )
            {
             before(grammarAccess.getCatkinPackageAccess().getNameAssignment_1()); 
            // InternalRos1Parser.g:459:2: ( rule__CatkinPackage__NameAssignment_1 )
            // InternalRos1Parser.g:459:3: rule__CatkinPackage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CatkinPackage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCatkinPackageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__1__Impl"


    // $ANTLR start "rule__CatkinPackage__Group__2"
    // InternalRos1Parser.g:467:1: rule__CatkinPackage__Group__2 : rule__CatkinPackage__Group__2__Impl rule__CatkinPackage__Group__3 ;
    public final void rule__CatkinPackage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:471:1: ( rule__CatkinPackage__Group__2__Impl rule__CatkinPackage__Group__3 )
            // InternalRos1Parser.g:472:2: rule__CatkinPackage__Group__2__Impl rule__CatkinPackage__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CatkinPackage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__2"


    // $ANTLR start "rule__CatkinPackage__Group__2__Impl"
    // InternalRos1Parser.g:479:1: rule__CatkinPackage__Group__2__Impl : ( Colon ) ;
    public final void rule__CatkinPackage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:483:1: ( ( Colon ) )
            // InternalRos1Parser.g:484:1: ( Colon )
            {
            // InternalRos1Parser.g:484:1: ( Colon )
            // InternalRos1Parser.g:485:2: Colon
            {
             before(grammarAccess.getCatkinPackageAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__2__Impl"


    // $ANTLR start "rule__CatkinPackage__Group__3"
    // InternalRos1Parser.g:494:1: rule__CatkinPackage__Group__3 : rule__CatkinPackage__Group__3__Impl rule__CatkinPackage__Group__4 ;
    public final void rule__CatkinPackage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:498:1: ( rule__CatkinPackage__Group__3__Impl rule__CatkinPackage__Group__4 )
            // InternalRos1Parser.g:499:2: rule__CatkinPackage__Group__3__Impl rule__CatkinPackage__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__CatkinPackage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__3"


    // $ANTLR start "rule__CatkinPackage__Group__3__Impl"
    // InternalRos1Parser.g:506:1: rule__CatkinPackage__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__CatkinPackage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:510:1: ( ( RULE_BEGIN ) )
            // InternalRos1Parser.g:511:1: ( RULE_BEGIN )
            {
            // InternalRos1Parser.g:511:1: ( RULE_BEGIN )
            // InternalRos1Parser.g:512:2: RULE_BEGIN
            {
             before(grammarAccess.getCatkinPackageAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__3__Impl"


    // $ANTLR start "rule__CatkinPackage__Group__4"
    // InternalRos1Parser.g:521:1: rule__CatkinPackage__Group__4 : rule__CatkinPackage__Group__4__Impl rule__CatkinPackage__Group__5 ;
    public final void rule__CatkinPackage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:525:1: ( rule__CatkinPackage__Group__4__Impl rule__CatkinPackage__Group__5 )
            // InternalRos1Parser.g:526:2: rule__CatkinPackage__Group__4__Impl rule__CatkinPackage__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__CatkinPackage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__4"


    // $ANTLR start "rule__CatkinPackage__Group__4__Impl"
    // InternalRos1Parser.g:533:1: rule__CatkinPackage__Group__4__Impl : ( ( rule__CatkinPackage__Group_4__0 )? ) ;
    public final void rule__CatkinPackage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:537:1: ( ( ( rule__CatkinPackage__Group_4__0 )? ) )
            // InternalRos1Parser.g:538:1: ( ( rule__CatkinPackage__Group_4__0 )? )
            {
            // InternalRos1Parser.g:538:1: ( ( rule__CatkinPackage__Group_4__0 )? )
            // InternalRos1Parser.g:539:2: ( rule__CatkinPackage__Group_4__0 )?
            {
             before(grammarAccess.getCatkinPackageAccess().getGroup_4()); 
            // InternalRos1Parser.g:540:2: ( rule__CatkinPackage__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==FromGitRepo) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRos1Parser.g:540:3: rule__CatkinPackage__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CatkinPackage__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCatkinPackageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__4__Impl"


    // $ANTLR start "rule__CatkinPackage__Group__5"
    // InternalRos1Parser.g:548:1: rule__CatkinPackage__Group__5 : rule__CatkinPackage__Group__5__Impl rule__CatkinPackage__Group__6 ;
    public final void rule__CatkinPackage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:552:1: ( rule__CatkinPackage__Group__5__Impl rule__CatkinPackage__Group__6 )
            // InternalRos1Parser.g:553:2: rule__CatkinPackage__Group__5__Impl rule__CatkinPackage__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__CatkinPackage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__5"


    // $ANTLR start "rule__CatkinPackage__Group__5__Impl"
    // InternalRos1Parser.g:560:1: rule__CatkinPackage__Group__5__Impl : ( ( rule__CatkinPackage__Group_5__0 )? ) ;
    public final void rule__CatkinPackage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:564:1: ( ( ( rule__CatkinPackage__Group_5__0 )? ) )
            // InternalRos1Parser.g:565:1: ( ( rule__CatkinPackage__Group_5__0 )? )
            {
            // InternalRos1Parser.g:565:1: ( ( rule__CatkinPackage__Group_5__0 )? )
            // InternalRos1Parser.g:566:2: ( rule__CatkinPackage__Group_5__0 )?
            {
             before(grammarAccess.getCatkinPackageAccess().getGroup_5()); 
            // InternalRos1Parser.g:567:2: ( rule__CatkinPackage__Group_5__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Artifacts) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRos1Parser.g:567:3: rule__CatkinPackage__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CatkinPackage__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCatkinPackageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__5__Impl"


    // $ANTLR start "rule__CatkinPackage__Group__6"
    // InternalRos1Parser.g:575:1: rule__CatkinPackage__Group__6 : rule__CatkinPackage__Group__6__Impl rule__CatkinPackage__Group__7 ;
    public final void rule__CatkinPackage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:579:1: ( rule__CatkinPackage__Group__6__Impl rule__CatkinPackage__Group__7 )
            // InternalRos1Parser.g:580:2: rule__CatkinPackage__Group__6__Impl rule__CatkinPackage__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__CatkinPackage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__6"


    // $ANTLR start "rule__CatkinPackage__Group__6__Impl"
    // InternalRos1Parser.g:587:1: rule__CatkinPackage__Group__6__Impl : ( ( rule__CatkinPackage__Group_6__0 )? ) ;
    public final void rule__CatkinPackage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:591:1: ( ( ( rule__CatkinPackage__Group_6__0 )? ) )
            // InternalRos1Parser.g:592:1: ( ( rule__CatkinPackage__Group_6__0 )? )
            {
            // InternalRos1Parser.g:592:1: ( ( rule__CatkinPackage__Group_6__0 )? )
            // InternalRos1Parser.g:593:2: ( rule__CatkinPackage__Group_6__0 )?
            {
             before(grammarAccess.getCatkinPackageAccess().getGroup_6()); 
            // InternalRos1Parser.g:594:2: ( rule__CatkinPackage__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Dependencies) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRos1Parser.g:594:3: rule__CatkinPackage__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CatkinPackage__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCatkinPackageAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__6__Impl"


    // $ANTLR start "rule__CatkinPackage__Group__7"
    // InternalRos1Parser.g:602:1: rule__CatkinPackage__Group__7 : rule__CatkinPackage__Group__7__Impl ;
    public final void rule__CatkinPackage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:606:1: ( rule__CatkinPackage__Group__7__Impl )
            // InternalRos1Parser.g:607:2: rule__CatkinPackage__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__7"


    // $ANTLR start "rule__CatkinPackage__Group__7__Impl"
    // InternalRos1Parser.g:613:1: rule__CatkinPackage__Group__7__Impl : ( RULE_END ) ;
    public final void rule__CatkinPackage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:617:1: ( ( RULE_END ) )
            // InternalRos1Parser.g:618:1: ( RULE_END )
            {
            // InternalRos1Parser.g:618:1: ( RULE_END )
            // InternalRos1Parser.g:619:2: RULE_END
            {
             before(grammarAccess.getCatkinPackageAccess().getENDTerminalRuleCall_7()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getENDTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group__7__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_4__0"
    // InternalRos1Parser.g:629:1: rule__CatkinPackage__Group_4__0 : rule__CatkinPackage__Group_4__0__Impl rule__CatkinPackage__Group_4__1 ;
    public final void rule__CatkinPackage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:633:1: ( rule__CatkinPackage__Group_4__0__Impl rule__CatkinPackage__Group_4__1 )
            // InternalRos1Parser.g:634:2: rule__CatkinPackage__Group_4__0__Impl rule__CatkinPackage__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__CatkinPackage__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_4__0"


    // $ANTLR start "rule__CatkinPackage__Group_4__0__Impl"
    // InternalRos1Parser.g:641:1: rule__CatkinPackage__Group_4__0__Impl : ( FromGitRepo ) ;
    public final void rule__CatkinPackage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:645:1: ( ( FromGitRepo ) )
            // InternalRos1Parser.g:646:1: ( FromGitRepo )
            {
            // InternalRos1Parser.g:646:1: ( FromGitRepo )
            // InternalRos1Parser.g:647:2: FromGitRepo
            {
             before(grammarAccess.getCatkinPackageAccess().getFromGitRepoKeyword_4_0()); 
            match(input,FromGitRepo,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getFromGitRepoKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_4__0__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_4__1"
    // InternalRos1Parser.g:656:1: rule__CatkinPackage__Group_4__1 : rule__CatkinPackage__Group_4__1__Impl ;
    public final void rule__CatkinPackage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:660:1: ( rule__CatkinPackage__Group_4__1__Impl )
            // InternalRos1Parser.g:661:2: rule__CatkinPackage__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_4__1"


    // $ANTLR start "rule__CatkinPackage__Group_4__1__Impl"
    // InternalRos1Parser.g:667:1: rule__CatkinPackage__Group_4__1__Impl : ( ( rule__CatkinPackage__FromGitRepoAssignment_4_1 ) ) ;
    public final void rule__CatkinPackage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:671:1: ( ( ( rule__CatkinPackage__FromGitRepoAssignment_4_1 ) ) )
            // InternalRos1Parser.g:672:1: ( ( rule__CatkinPackage__FromGitRepoAssignment_4_1 ) )
            {
            // InternalRos1Parser.g:672:1: ( ( rule__CatkinPackage__FromGitRepoAssignment_4_1 ) )
            // InternalRos1Parser.g:673:2: ( rule__CatkinPackage__FromGitRepoAssignment_4_1 )
            {
             before(grammarAccess.getCatkinPackageAccess().getFromGitRepoAssignment_4_1()); 
            // InternalRos1Parser.g:674:2: ( rule__CatkinPackage__FromGitRepoAssignment_4_1 )
            // InternalRos1Parser.g:674:3: rule__CatkinPackage__FromGitRepoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__CatkinPackage__FromGitRepoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getCatkinPackageAccess().getFromGitRepoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_4__1__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_5__0"
    // InternalRos1Parser.g:683:1: rule__CatkinPackage__Group_5__0 : rule__CatkinPackage__Group_5__0__Impl rule__CatkinPackage__Group_5__1 ;
    public final void rule__CatkinPackage__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:687:1: ( rule__CatkinPackage__Group_5__0__Impl rule__CatkinPackage__Group_5__1 )
            // InternalRos1Parser.g:688:2: rule__CatkinPackage__Group_5__0__Impl rule__CatkinPackage__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__CatkinPackage__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_5__0"


    // $ANTLR start "rule__CatkinPackage__Group_5__0__Impl"
    // InternalRos1Parser.g:695:1: rule__CatkinPackage__Group_5__0__Impl : ( Artifacts ) ;
    public final void rule__CatkinPackage__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:699:1: ( ( Artifacts ) )
            // InternalRos1Parser.g:700:1: ( Artifacts )
            {
            // InternalRos1Parser.g:700:1: ( Artifacts )
            // InternalRos1Parser.g:701:2: Artifacts
            {
             before(grammarAccess.getCatkinPackageAccess().getArtifactsKeyword_5_0()); 
            match(input,Artifacts,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getArtifactsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_5__0__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_5__1"
    // InternalRos1Parser.g:710:1: rule__CatkinPackage__Group_5__1 : rule__CatkinPackage__Group_5__1__Impl rule__CatkinPackage__Group_5__2 ;
    public final void rule__CatkinPackage__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:714:1: ( rule__CatkinPackage__Group_5__1__Impl rule__CatkinPackage__Group_5__2 )
            // InternalRos1Parser.g:715:2: rule__CatkinPackage__Group_5__1__Impl rule__CatkinPackage__Group_5__2
            {
            pushFollow(FOLLOW_8);
            rule__CatkinPackage__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_5__1"


    // $ANTLR start "rule__CatkinPackage__Group_5__1__Impl"
    // InternalRos1Parser.g:722:1: rule__CatkinPackage__Group_5__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__CatkinPackage__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:726:1: ( ( RULE_BEGIN ) )
            // InternalRos1Parser.g:727:1: ( RULE_BEGIN )
            {
            // InternalRos1Parser.g:727:1: ( RULE_BEGIN )
            // InternalRos1Parser.g:728:2: RULE_BEGIN
            {
             before(grammarAccess.getCatkinPackageAccess().getBEGINTerminalRuleCall_5_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getBEGINTerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_5__1__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_5__2"
    // InternalRos1Parser.g:737:1: rule__CatkinPackage__Group_5__2 : rule__CatkinPackage__Group_5__2__Impl rule__CatkinPackage__Group_5__3 ;
    public final void rule__CatkinPackage__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:741:1: ( rule__CatkinPackage__Group_5__2__Impl rule__CatkinPackage__Group_5__3 )
            // InternalRos1Parser.g:742:2: rule__CatkinPackage__Group_5__2__Impl rule__CatkinPackage__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__CatkinPackage__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_5__2"


    // $ANTLR start "rule__CatkinPackage__Group_5__2__Impl"
    // InternalRos1Parser.g:749:1: rule__CatkinPackage__Group_5__2__Impl : ( ( rule__CatkinPackage__ArtifactAssignment_5_2 )* ) ;
    public final void rule__CatkinPackage__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:753:1: ( ( ( rule__CatkinPackage__ArtifactAssignment_5_2 )* ) )
            // InternalRos1Parser.g:754:1: ( ( rule__CatkinPackage__ArtifactAssignment_5_2 )* )
            {
            // InternalRos1Parser.g:754:1: ( ( rule__CatkinPackage__ArtifactAssignment_5_2 )* )
            // InternalRos1Parser.g:755:2: ( rule__CatkinPackage__ArtifactAssignment_5_2 )*
            {
             before(grammarAccess.getCatkinPackageAccess().getArtifactAssignment_5_2()); 
            // InternalRos1Parser.g:756:2: ( rule__CatkinPackage__ArtifactAssignment_5_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Node||(LA7_0>=RULE_ID && LA7_0<=RULE_ROS_CONVENTION_A)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRos1Parser.g:756:3: rule__CatkinPackage__ArtifactAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CatkinPackage__ArtifactAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getCatkinPackageAccess().getArtifactAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_5__2__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_5__3"
    // InternalRos1Parser.g:764:1: rule__CatkinPackage__Group_5__3 : rule__CatkinPackage__Group_5__3__Impl ;
    public final void rule__CatkinPackage__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:768:1: ( rule__CatkinPackage__Group_5__3__Impl )
            // InternalRos1Parser.g:769:2: rule__CatkinPackage__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_5__3"


    // $ANTLR start "rule__CatkinPackage__Group_5__3__Impl"
    // InternalRos1Parser.g:775:1: rule__CatkinPackage__Group_5__3__Impl : ( RULE_END ) ;
    public final void rule__CatkinPackage__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:779:1: ( ( RULE_END ) )
            // InternalRos1Parser.g:780:1: ( RULE_END )
            {
            // InternalRos1Parser.g:780:1: ( RULE_END )
            // InternalRos1Parser.g:781:2: RULE_END
            {
             before(grammarAccess.getCatkinPackageAccess().getENDTerminalRuleCall_5_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getENDTerminalRuleCall_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_5__3__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_6__0"
    // InternalRos1Parser.g:791:1: rule__CatkinPackage__Group_6__0 : rule__CatkinPackage__Group_6__0__Impl rule__CatkinPackage__Group_6__1 ;
    public final void rule__CatkinPackage__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:795:1: ( rule__CatkinPackage__Group_6__0__Impl rule__CatkinPackage__Group_6__1 )
            // InternalRos1Parser.g:796:2: rule__CatkinPackage__Group_6__0__Impl rule__CatkinPackage__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__CatkinPackage__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6__0"


    // $ANTLR start "rule__CatkinPackage__Group_6__0__Impl"
    // InternalRos1Parser.g:803:1: rule__CatkinPackage__Group_6__0__Impl : ( Dependencies ) ;
    public final void rule__CatkinPackage__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:807:1: ( ( Dependencies ) )
            // InternalRos1Parser.g:808:1: ( Dependencies )
            {
            // InternalRos1Parser.g:808:1: ( Dependencies )
            // InternalRos1Parser.g:809:2: Dependencies
            {
             before(grammarAccess.getCatkinPackageAccess().getDependenciesKeyword_6_0()); 
            match(input,Dependencies,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getDependenciesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6__0__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_6__1"
    // InternalRos1Parser.g:818:1: rule__CatkinPackage__Group_6__1 : rule__CatkinPackage__Group_6__1__Impl rule__CatkinPackage__Group_6__2 ;
    public final void rule__CatkinPackage__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:822:1: ( rule__CatkinPackage__Group_6__1__Impl rule__CatkinPackage__Group_6__2 )
            // InternalRos1Parser.g:823:2: rule__CatkinPackage__Group_6__1__Impl rule__CatkinPackage__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__CatkinPackage__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6__1"


    // $ANTLR start "rule__CatkinPackage__Group_6__1__Impl"
    // InternalRos1Parser.g:830:1: rule__CatkinPackage__Group_6__1__Impl : ( LeftSquareBracket ) ;
    public final void rule__CatkinPackage__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:834:1: ( ( LeftSquareBracket ) )
            // InternalRos1Parser.g:835:1: ( LeftSquareBracket )
            {
            // InternalRos1Parser.g:835:1: ( LeftSquareBracket )
            // InternalRos1Parser.g:836:2: LeftSquareBracket
            {
             before(grammarAccess.getCatkinPackageAccess().getLeftSquareBracketKeyword_6_1()); 
            match(input,LeftSquareBracket,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getLeftSquareBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6__1__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_6__2"
    // InternalRos1Parser.g:845:1: rule__CatkinPackage__Group_6__2 : rule__CatkinPackage__Group_6__2__Impl rule__CatkinPackage__Group_6__3 ;
    public final void rule__CatkinPackage__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:849:1: ( rule__CatkinPackage__Group_6__2__Impl rule__CatkinPackage__Group_6__3 )
            // InternalRos1Parser.g:850:2: rule__CatkinPackage__Group_6__2__Impl rule__CatkinPackage__Group_6__3
            {
            pushFollow(FOLLOW_12);
            rule__CatkinPackage__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6__2"


    // $ANTLR start "rule__CatkinPackage__Group_6__2__Impl"
    // InternalRos1Parser.g:857:1: rule__CatkinPackage__Group_6__2__Impl : ( ( rule__CatkinPackage__DependencyAssignment_6_2 ) ) ;
    public final void rule__CatkinPackage__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:861:1: ( ( ( rule__CatkinPackage__DependencyAssignment_6_2 ) ) )
            // InternalRos1Parser.g:862:1: ( ( rule__CatkinPackage__DependencyAssignment_6_2 ) )
            {
            // InternalRos1Parser.g:862:1: ( ( rule__CatkinPackage__DependencyAssignment_6_2 ) )
            // InternalRos1Parser.g:863:2: ( rule__CatkinPackage__DependencyAssignment_6_2 )
            {
             before(grammarAccess.getCatkinPackageAccess().getDependencyAssignment_6_2()); 
            // InternalRos1Parser.g:864:2: ( rule__CatkinPackage__DependencyAssignment_6_2 )
            // InternalRos1Parser.g:864:3: rule__CatkinPackage__DependencyAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__CatkinPackage__DependencyAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getCatkinPackageAccess().getDependencyAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6__2__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_6__3"
    // InternalRos1Parser.g:872:1: rule__CatkinPackage__Group_6__3 : rule__CatkinPackage__Group_6__3__Impl rule__CatkinPackage__Group_6__4 ;
    public final void rule__CatkinPackage__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:876:1: ( rule__CatkinPackage__Group_6__3__Impl rule__CatkinPackage__Group_6__4 )
            // InternalRos1Parser.g:877:2: rule__CatkinPackage__Group_6__3__Impl rule__CatkinPackage__Group_6__4
            {
            pushFollow(FOLLOW_12);
            rule__CatkinPackage__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6__3"


    // $ANTLR start "rule__CatkinPackage__Group_6__3__Impl"
    // InternalRos1Parser.g:884:1: rule__CatkinPackage__Group_6__3__Impl : ( ( rule__CatkinPackage__Group_6_3__0 )* ) ;
    public final void rule__CatkinPackage__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:888:1: ( ( ( rule__CatkinPackage__Group_6_3__0 )* ) )
            // InternalRos1Parser.g:889:1: ( ( rule__CatkinPackage__Group_6_3__0 )* )
            {
            // InternalRos1Parser.g:889:1: ( ( rule__CatkinPackage__Group_6_3__0 )* )
            // InternalRos1Parser.g:890:2: ( rule__CatkinPackage__Group_6_3__0 )*
            {
             before(grammarAccess.getCatkinPackageAccess().getGroup_6_3()); 
            // InternalRos1Parser.g:891:2: ( rule__CatkinPackage__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Comma) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRos1Parser.g:891:3: rule__CatkinPackage__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__CatkinPackage__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCatkinPackageAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6__3__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_6__4"
    // InternalRos1Parser.g:899:1: rule__CatkinPackage__Group_6__4 : rule__CatkinPackage__Group_6__4__Impl ;
    public final void rule__CatkinPackage__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:903:1: ( rule__CatkinPackage__Group_6__4__Impl )
            // InternalRos1Parser.g:904:2: rule__CatkinPackage__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6__4"


    // $ANTLR start "rule__CatkinPackage__Group_6__4__Impl"
    // InternalRos1Parser.g:910:1: rule__CatkinPackage__Group_6__4__Impl : ( RightSquareBracket ) ;
    public final void rule__CatkinPackage__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:914:1: ( ( RightSquareBracket ) )
            // InternalRos1Parser.g:915:1: ( RightSquareBracket )
            {
            // InternalRos1Parser.g:915:1: ( RightSquareBracket )
            // InternalRos1Parser.g:916:2: RightSquareBracket
            {
             before(grammarAccess.getCatkinPackageAccess().getRightSquareBracketKeyword_6_4()); 
            match(input,RightSquareBracket,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getRightSquareBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6__4__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_6_3__0"
    // InternalRos1Parser.g:926:1: rule__CatkinPackage__Group_6_3__0 : rule__CatkinPackage__Group_6_3__0__Impl rule__CatkinPackage__Group_6_3__1 ;
    public final void rule__CatkinPackage__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:930:1: ( rule__CatkinPackage__Group_6_3__0__Impl rule__CatkinPackage__Group_6_3__1 )
            // InternalRos1Parser.g:931:2: rule__CatkinPackage__Group_6_3__0__Impl rule__CatkinPackage__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
            rule__CatkinPackage__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6_3__0"


    // $ANTLR start "rule__CatkinPackage__Group_6_3__0__Impl"
    // InternalRos1Parser.g:938:1: rule__CatkinPackage__Group_6_3__0__Impl : ( Comma ) ;
    public final void rule__CatkinPackage__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:942:1: ( ( Comma ) )
            // InternalRos1Parser.g:943:1: ( Comma )
            {
            // InternalRos1Parser.g:943:1: ( Comma )
            // InternalRos1Parser.g:944:2: Comma
            {
             before(grammarAccess.getCatkinPackageAccess().getCommaKeyword_6_3_0()); 
            match(input,Comma,FOLLOW_2); 
             after(grammarAccess.getCatkinPackageAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6_3__0__Impl"


    // $ANTLR start "rule__CatkinPackage__Group_6_3__1"
    // InternalRos1Parser.g:953:1: rule__CatkinPackage__Group_6_3__1 : rule__CatkinPackage__Group_6_3__1__Impl ;
    public final void rule__CatkinPackage__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:957:1: ( rule__CatkinPackage__Group_6_3__1__Impl )
            // InternalRos1Parser.g:958:2: rule__CatkinPackage__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CatkinPackage__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6_3__1"


    // $ANTLR start "rule__CatkinPackage__Group_6_3__1__Impl"
    // InternalRos1Parser.g:964:1: rule__CatkinPackage__Group_6_3__1__Impl : ( ( rule__CatkinPackage__DependencyAssignment_6_3_1 ) ) ;
    public final void rule__CatkinPackage__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:968:1: ( ( ( rule__CatkinPackage__DependencyAssignment_6_3_1 ) ) )
            // InternalRos1Parser.g:969:1: ( ( rule__CatkinPackage__DependencyAssignment_6_3_1 ) )
            {
            // InternalRos1Parser.g:969:1: ( ( rule__CatkinPackage__DependencyAssignment_6_3_1 ) )
            // InternalRos1Parser.g:970:2: ( rule__CatkinPackage__DependencyAssignment_6_3_1 )
            {
             before(grammarAccess.getCatkinPackageAccess().getDependencyAssignment_6_3_1()); 
            // InternalRos1Parser.g:971:2: ( rule__CatkinPackage__DependencyAssignment_6_3_1 )
            // InternalRos1Parser.g:971:3: rule__CatkinPackage__DependencyAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CatkinPackage__DependencyAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCatkinPackageAccess().getDependencyAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__Group_6_3__1__Impl"


    // $ANTLR start "rule__Artifact__Group__0"
    // InternalRos1Parser.g:980:1: rule__Artifact__Group__0 : rule__Artifact__Group__0__Impl rule__Artifact__Group__1 ;
    public final void rule__Artifact__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:984:1: ( rule__Artifact__Group__0__Impl rule__Artifact__Group__1 )
            // InternalRos1Parser.g:985:2: rule__Artifact__Group__0__Impl rule__Artifact__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Artifact__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__0"


    // $ANTLR start "rule__Artifact__Group__0__Impl"
    // InternalRos1Parser.g:992:1: rule__Artifact__Group__0__Impl : ( () ) ;
    public final void rule__Artifact__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:996:1: ( ( () ) )
            // InternalRos1Parser.g:997:1: ( () )
            {
            // InternalRos1Parser.g:997:1: ( () )
            // InternalRos1Parser.g:998:2: ()
            {
             before(grammarAccess.getArtifactAccess().getArtifactAction_0()); 
            // InternalRos1Parser.g:999:2: ()
            // InternalRos1Parser.g:999:3: 
            {
            }

             after(grammarAccess.getArtifactAccess().getArtifactAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__0__Impl"


    // $ANTLR start "rule__Artifact__Group__1"
    // InternalRos1Parser.g:1007:1: rule__Artifact__Group__1 : rule__Artifact__Group__1__Impl rule__Artifact__Group__2 ;
    public final void rule__Artifact__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1011:1: ( rule__Artifact__Group__1__Impl rule__Artifact__Group__2 )
            // InternalRos1Parser.g:1012:2: rule__Artifact__Group__1__Impl rule__Artifact__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Artifact__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__1"


    // $ANTLR start "rule__Artifact__Group__1__Impl"
    // InternalRos1Parser.g:1019:1: rule__Artifact__Group__1__Impl : ( ( rule__Artifact__NameAssignment_1 ) ) ;
    public final void rule__Artifact__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1023:1: ( ( ( rule__Artifact__NameAssignment_1 ) ) )
            // InternalRos1Parser.g:1024:1: ( ( rule__Artifact__NameAssignment_1 ) )
            {
            // InternalRos1Parser.g:1024:1: ( ( rule__Artifact__NameAssignment_1 ) )
            // InternalRos1Parser.g:1025:2: ( rule__Artifact__NameAssignment_1 )
            {
             before(grammarAccess.getArtifactAccess().getNameAssignment_1()); 
            // InternalRos1Parser.g:1026:2: ( rule__Artifact__NameAssignment_1 )
            // InternalRos1Parser.g:1026:3: rule__Artifact__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArtifactAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__1__Impl"


    // $ANTLR start "rule__Artifact__Group__2"
    // InternalRos1Parser.g:1034:1: rule__Artifact__Group__2 : rule__Artifact__Group__2__Impl rule__Artifact__Group__3 ;
    public final void rule__Artifact__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1038:1: ( rule__Artifact__Group__2__Impl rule__Artifact__Group__3 )
            // InternalRos1Parser.g:1039:2: rule__Artifact__Group__2__Impl rule__Artifact__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Artifact__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__2"


    // $ANTLR start "rule__Artifact__Group__2__Impl"
    // InternalRos1Parser.g:1046:1: rule__Artifact__Group__2__Impl : ( Colon ) ;
    public final void rule__Artifact__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1050:1: ( ( Colon ) )
            // InternalRos1Parser.g:1051:1: ( Colon )
            {
            // InternalRos1Parser.g:1051:1: ( Colon )
            // InternalRos1Parser.g:1052:2: Colon
            {
             before(grammarAccess.getArtifactAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getArtifactAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__2__Impl"


    // $ANTLR start "rule__Artifact__Group__3"
    // InternalRos1Parser.g:1061:1: rule__Artifact__Group__3 : rule__Artifact__Group__3__Impl rule__Artifact__Group__4 ;
    public final void rule__Artifact__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1065:1: ( rule__Artifact__Group__3__Impl rule__Artifact__Group__4 )
            // InternalRos1Parser.g:1066:2: rule__Artifact__Group__3__Impl rule__Artifact__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Artifact__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__3"


    // $ANTLR start "rule__Artifact__Group__3__Impl"
    // InternalRos1Parser.g:1073:1: rule__Artifact__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Artifact__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1077:1: ( ( RULE_BEGIN ) )
            // InternalRos1Parser.g:1078:1: ( RULE_BEGIN )
            {
            // InternalRos1Parser.g:1078:1: ( RULE_BEGIN )
            // InternalRos1Parser.g:1079:2: RULE_BEGIN
            {
             before(grammarAccess.getArtifactAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getArtifactAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__3__Impl"


    // $ANTLR start "rule__Artifact__Group__4"
    // InternalRos1Parser.g:1088:1: rule__Artifact__Group__4 : rule__Artifact__Group__4__Impl rule__Artifact__Group__5 ;
    public final void rule__Artifact__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1092:1: ( rule__Artifact__Group__4__Impl rule__Artifact__Group__5 )
            // InternalRos1Parser.g:1093:2: rule__Artifact__Group__4__Impl rule__Artifact__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Artifact__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Artifact__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__4"


    // $ANTLR start "rule__Artifact__Group__4__Impl"
    // InternalRos1Parser.g:1100:1: rule__Artifact__Group__4__Impl : ( ( rule__Artifact__NodeAssignment_4 )? ) ;
    public final void rule__Artifact__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1104:1: ( ( ( rule__Artifact__NodeAssignment_4 )? ) )
            // InternalRos1Parser.g:1105:1: ( ( rule__Artifact__NodeAssignment_4 )? )
            {
            // InternalRos1Parser.g:1105:1: ( ( rule__Artifact__NodeAssignment_4 )? )
            // InternalRos1Parser.g:1106:2: ( rule__Artifact__NodeAssignment_4 )?
            {
             before(grammarAccess.getArtifactAccess().getNodeAssignment_4()); 
            // InternalRos1Parser.g:1107:2: ( rule__Artifact__NodeAssignment_4 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Node_1) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRos1Parser.g:1107:3: rule__Artifact__NodeAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Artifact__NodeAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArtifactAccess().getNodeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__4__Impl"


    // $ANTLR start "rule__Artifact__Group__5"
    // InternalRos1Parser.g:1115:1: rule__Artifact__Group__5 : rule__Artifact__Group__5__Impl ;
    public final void rule__Artifact__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1119:1: ( rule__Artifact__Group__5__Impl )
            // InternalRos1Parser.g:1120:2: rule__Artifact__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Artifact__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__5"


    // $ANTLR start "rule__Artifact__Group__5__Impl"
    // InternalRos1Parser.g:1126:1: rule__Artifact__Group__5__Impl : ( RULE_END ) ;
    public final void rule__Artifact__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1130:1: ( ( RULE_END ) )
            // InternalRos1Parser.g:1131:1: ( RULE_END )
            {
            // InternalRos1Parser.g:1131:1: ( RULE_END )
            // InternalRos1Parser.g:1132:2: RULE_END
            {
             before(grammarAccess.getArtifactAccess().getENDTerminalRuleCall_5()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getArtifactAccess().getENDTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalRos1Parser.g:1142:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1146:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalRos1Parser.g:1147:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalRos1Parser.g:1154:1: rule__Node__Group__0__Impl : ( Node_1 ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1158:1: ( ( Node_1 ) )
            // InternalRos1Parser.g:1159:1: ( Node_1 )
            {
            // InternalRos1Parser.g:1159:1: ( Node_1 )
            // InternalRos1Parser.g:1160:2: Node_1
            {
             before(grammarAccess.getNodeAccess().getNodeKeyword_0()); 
            match(input,Node_1,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalRos1Parser.g:1169:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1173:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalRos1Parser.g:1174:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalRos1Parser.g:1181:1: rule__Node__Group__1__Impl : ( ( rule__Node__NameAssignment_1 ) ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1185:1: ( ( ( rule__Node__NameAssignment_1 ) ) )
            // InternalRos1Parser.g:1186:1: ( ( rule__Node__NameAssignment_1 ) )
            {
            // InternalRos1Parser.g:1186:1: ( ( rule__Node__NameAssignment_1 ) )
            // InternalRos1Parser.g:1187:2: ( rule__Node__NameAssignment_1 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_1()); 
            // InternalRos1Parser.g:1188:2: ( rule__Node__NameAssignment_1 )
            // InternalRos1Parser.g:1188:3: rule__Node__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalRos1Parser.g:1196:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1200:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalRos1Parser.g:1201:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalRos1Parser.g:1208:1: rule__Node__Group__2__Impl : ( RULE_BEGIN ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1212:1: ( ( RULE_BEGIN ) )
            // InternalRos1Parser.g:1213:1: ( RULE_BEGIN )
            {
            // InternalRos1Parser.g:1213:1: ( RULE_BEGIN )
            // InternalRos1Parser.g:1214:2: RULE_BEGIN
            {
             before(grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // InternalRos1Parser.g:1223:1: rule__Node__Group__3 : rule__Node__Group__3__Impl rule__Node__Group__4 ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1227:1: ( rule__Node__Group__3__Impl rule__Node__Group__4 )
            // InternalRos1Parser.g:1228:2: rule__Node__Group__3__Impl rule__Node__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Node__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalRos1Parser.g:1235:1: rule__Node__Group__3__Impl : ( ( rule__Node__Group_3__0 )? ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1239:1: ( ( ( rule__Node__Group_3__0 )? ) )
            // InternalRos1Parser.g:1240:1: ( ( rule__Node__Group_3__0 )? )
            {
            // InternalRos1Parser.g:1240:1: ( ( rule__Node__Group_3__0 )? )
            // InternalRos1Parser.g:1241:2: ( rule__Node__Group_3__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_3()); 
            // InternalRos1Parser.g:1242:2: ( rule__Node__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Publishers) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRos1Parser.g:1242:3: rule__Node__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__4"
    // InternalRos1Parser.g:1250:1: rule__Node__Group__4 : rule__Node__Group__4__Impl rule__Node__Group__5 ;
    public final void rule__Node__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1254:1: ( rule__Node__Group__4__Impl rule__Node__Group__5 )
            // InternalRos1Parser.g:1255:2: rule__Node__Group__4__Impl rule__Node__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Node__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4"


    // $ANTLR start "rule__Node__Group__4__Impl"
    // InternalRos1Parser.g:1262:1: rule__Node__Group__4__Impl : ( ( rule__Node__Group_4__0 )? ) ;
    public final void rule__Node__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1266:1: ( ( ( rule__Node__Group_4__0 )? ) )
            // InternalRos1Parser.g:1267:1: ( ( rule__Node__Group_4__0 )? )
            {
            // InternalRos1Parser.g:1267:1: ( ( rule__Node__Group_4__0 )? )
            // InternalRos1Parser.g:1268:2: ( rule__Node__Group_4__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_4()); 
            // InternalRos1Parser.g:1269:2: ( rule__Node__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Subscribers) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRos1Parser.g:1269:3: rule__Node__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__5"
    // InternalRos1Parser.g:1277:1: rule__Node__Group__5 : rule__Node__Group__5__Impl rule__Node__Group__6 ;
    public final void rule__Node__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1281:1: ( rule__Node__Group__5__Impl rule__Node__Group__6 )
            // InternalRos1Parser.g:1282:2: rule__Node__Group__5__Impl rule__Node__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Node__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5"


    // $ANTLR start "rule__Node__Group__5__Impl"
    // InternalRos1Parser.g:1289:1: rule__Node__Group__5__Impl : ( ( rule__Node__Group_5__0 )? ) ;
    public final void rule__Node__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1293:1: ( ( ( rule__Node__Group_5__0 )? ) )
            // InternalRos1Parser.g:1294:1: ( ( rule__Node__Group_5__0 )? )
            {
            // InternalRos1Parser.g:1294:1: ( ( rule__Node__Group_5__0 )? )
            // InternalRos1Parser.g:1295:2: ( rule__Node__Group_5__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_5()); 
            // InternalRos1Parser.g:1296:2: ( rule__Node__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Parameters) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRos1Parser.g:1296:3: rule__Node__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__5__Impl"


    // $ANTLR start "rule__Node__Group__6"
    // InternalRos1Parser.g:1304:1: rule__Node__Group__6 : rule__Node__Group__6__Impl ;
    public final void rule__Node__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1308:1: ( rule__Node__Group__6__Impl )
            // InternalRos1Parser.g:1309:2: rule__Node__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6"


    // $ANTLR start "rule__Node__Group__6__Impl"
    // InternalRos1Parser.g:1315:1: rule__Node__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Node__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1319:1: ( ( RULE_END ) )
            // InternalRos1Parser.g:1320:1: ( RULE_END )
            {
            // InternalRos1Parser.g:1320:1: ( RULE_END )
            // InternalRos1Parser.g:1321:2: RULE_END
            {
             before(grammarAccess.getNodeAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group__6__Impl"


    // $ANTLR start "rule__Node__Group_3__0"
    // InternalRos1Parser.g:1331:1: rule__Node__Group_3__0 : rule__Node__Group_3__0__Impl rule__Node__Group_3__1 ;
    public final void rule__Node__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1335:1: ( rule__Node__Group_3__0__Impl rule__Node__Group_3__1 )
            // InternalRos1Parser.g:1336:2: rule__Node__Group_3__0__Impl rule__Node__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__0"


    // $ANTLR start "rule__Node__Group_3__0__Impl"
    // InternalRos1Parser.g:1343:1: rule__Node__Group_3__0__Impl : ( Publishers ) ;
    public final void rule__Node__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1347:1: ( ( Publishers ) )
            // InternalRos1Parser.g:1348:1: ( Publishers )
            {
            // InternalRos1Parser.g:1348:1: ( Publishers )
            // InternalRos1Parser.g:1349:2: Publishers
            {
             before(grammarAccess.getNodeAccess().getPublishersKeyword_3_0()); 
            match(input,Publishers,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getPublishersKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__0__Impl"


    // $ANTLR start "rule__Node__Group_3__1"
    // InternalRos1Parser.g:1358:1: rule__Node__Group_3__1 : rule__Node__Group_3__1__Impl rule__Node__Group_3__2 ;
    public final void rule__Node__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1362:1: ( rule__Node__Group_3__1__Impl rule__Node__Group_3__2 )
            // InternalRos1Parser.g:1363:2: rule__Node__Group_3__1__Impl rule__Node__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__1"


    // $ANTLR start "rule__Node__Group_3__1__Impl"
    // InternalRos1Parser.g:1370:1: rule__Node__Group_3__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Node__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1374:1: ( ( RULE_BEGIN ) )
            // InternalRos1Parser.g:1375:1: ( RULE_BEGIN )
            {
            // InternalRos1Parser.g:1375:1: ( RULE_BEGIN )
            // InternalRos1Parser.g:1376:2: RULE_BEGIN
            {
             before(grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__1__Impl"


    // $ANTLR start "rule__Node__Group_3__2"
    // InternalRos1Parser.g:1385:1: rule__Node__Group_3__2 : rule__Node__Group_3__2__Impl rule__Node__Group_3__3 ;
    public final void rule__Node__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1389:1: ( rule__Node__Group_3__2__Impl rule__Node__Group_3__3 )
            // InternalRos1Parser.g:1390:2: rule__Node__Group_3__2__Impl rule__Node__Group_3__3
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__2"


    // $ANTLR start "rule__Node__Group_3__2__Impl"
    // InternalRos1Parser.g:1397:1: rule__Node__Group_3__2__Impl : ( ( rule__Node__PublisherAssignment_3_2 )* ) ;
    public final void rule__Node__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1401:1: ( ( ( rule__Node__PublisherAssignment_3_2 )* ) )
            // InternalRos1Parser.g:1402:1: ( ( rule__Node__PublisherAssignment_3_2 )* )
            {
            // InternalRos1Parser.g:1402:1: ( ( rule__Node__PublisherAssignment_3_2 )* )
            // InternalRos1Parser.g:1403:2: ( rule__Node__PublisherAssignment_3_2 )*
            {
             before(grammarAccess.getNodeAccess().getPublisherAssignment_3_2()); 
            // InternalRos1Parser.g:1404:2: ( rule__Node__PublisherAssignment_3_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID||LA13_0==RULE_STRING) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRos1Parser.g:1404:3: rule__Node__PublisherAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Node__PublisherAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getPublisherAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__2__Impl"


    // $ANTLR start "rule__Node__Group_3__3"
    // InternalRos1Parser.g:1412:1: rule__Node__Group_3__3 : rule__Node__Group_3__3__Impl ;
    public final void rule__Node__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1416:1: ( rule__Node__Group_3__3__Impl )
            // InternalRos1Parser.g:1417:2: rule__Node__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__3"


    // $ANTLR start "rule__Node__Group_3__3__Impl"
    // InternalRos1Parser.g:1423:1: rule__Node__Group_3__3__Impl : ( RULE_END ) ;
    public final void rule__Node__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1427:1: ( ( RULE_END ) )
            // InternalRos1Parser.g:1428:1: ( RULE_END )
            {
            // InternalRos1Parser.g:1428:1: ( RULE_END )
            // InternalRos1Parser.g:1429:2: RULE_END
            {
             before(grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_3__3__Impl"


    // $ANTLR start "rule__Node__Group_4__0"
    // InternalRos1Parser.g:1439:1: rule__Node__Group_4__0 : rule__Node__Group_4__0__Impl rule__Node__Group_4__1 ;
    public final void rule__Node__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1443:1: ( rule__Node__Group_4__0__Impl rule__Node__Group_4__1 )
            // InternalRos1Parser.g:1444:2: rule__Node__Group_4__0__Impl rule__Node__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_4__0"


    // $ANTLR start "rule__Node__Group_4__0__Impl"
    // InternalRos1Parser.g:1451:1: rule__Node__Group_4__0__Impl : ( Subscribers ) ;
    public final void rule__Node__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1455:1: ( ( Subscribers ) )
            // InternalRos1Parser.g:1456:1: ( Subscribers )
            {
            // InternalRos1Parser.g:1456:1: ( Subscribers )
            // InternalRos1Parser.g:1457:2: Subscribers
            {
             before(grammarAccess.getNodeAccess().getSubscribersKeyword_4_0()); 
            match(input,Subscribers,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getSubscribersKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_4__0__Impl"


    // $ANTLR start "rule__Node__Group_4__1"
    // InternalRos1Parser.g:1466:1: rule__Node__Group_4__1 : rule__Node__Group_4__1__Impl rule__Node__Group_4__2 ;
    public final void rule__Node__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1470:1: ( rule__Node__Group_4__1__Impl rule__Node__Group_4__2 )
            // InternalRos1Parser.g:1471:2: rule__Node__Group_4__1__Impl rule__Node__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_4__1"


    // $ANTLR start "rule__Node__Group_4__1__Impl"
    // InternalRos1Parser.g:1478:1: rule__Node__Group_4__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Node__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1482:1: ( ( RULE_BEGIN ) )
            // InternalRos1Parser.g:1483:1: ( RULE_BEGIN )
            {
            // InternalRos1Parser.g:1483:1: ( RULE_BEGIN )
            // InternalRos1Parser.g:1484:2: RULE_BEGIN
            {
             before(grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_4_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_4__1__Impl"


    // $ANTLR start "rule__Node__Group_4__2"
    // InternalRos1Parser.g:1493:1: rule__Node__Group_4__2 : rule__Node__Group_4__2__Impl rule__Node__Group_4__3 ;
    public final void rule__Node__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1497:1: ( rule__Node__Group_4__2__Impl rule__Node__Group_4__3 )
            // InternalRos1Parser.g:1498:2: rule__Node__Group_4__2__Impl rule__Node__Group_4__3
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_4__2"


    // $ANTLR start "rule__Node__Group_4__2__Impl"
    // InternalRos1Parser.g:1505:1: rule__Node__Group_4__2__Impl : ( ( rule__Node__SubscriberAssignment_4_2 )* ) ;
    public final void rule__Node__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1509:1: ( ( ( rule__Node__SubscriberAssignment_4_2 )* ) )
            // InternalRos1Parser.g:1510:1: ( ( rule__Node__SubscriberAssignment_4_2 )* )
            {
            // InternalRos1Parser.g:1510:1: ( ( rule__Node__SubscriberAssignment_4_2 )* )
            // InternalRos1Parser.g:1511:2: ( rule__Node__SubscriberAssignment_4_2 )*
            {
             before(grammarAccess.getNodeAccess().getSubscriberAssignment_4_2()); 
            // InternalRos1Parser.g:1512:2: ( rule__Node__SubscriberAssignment_4_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||LA14_0==RULE_STRING) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRos1Parser.g:1512:3: rule__Node__SubscriberAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Node__SubscriberAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getSubscriberAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_4__2__Impl"


    // $ANTLR start "rule__Node__Group_4__3"
    // InternalRos1Parser.g:1520:1: rule__Node__Group_4__3 : rule__Node__Group_4__3__Impl ;
    public final void rule__Node__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1524:1: ( rule__Node__Group_4__3__Impl )
            // InternalRos1Parser.g:1525:2: rule__Node__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_4__3"


    // $ANTLR start "rule__Node__Group_4__3__Impl"
    // InternalRos1Parser.g:1531:1: rule__Node__Group_4__3__Impl : ( RULE_END ) ;
    public final void rule__Node__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1535:1: ( ( RULE_END ) )
            // InternalRos1Parser.g:1536:1: ( RULE_END )
            {
            // InternalRos1Parser.g:1536:1: ( RULE_END )
            // InternalRos1Parser.g:1537:2: RULE_END
            {
             before(grammarAccess.getNodeAccess().getENDTerminalRuleCall_4_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getENDTerminalRuleCall_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_4__3__Impl"


    // $ANTLR start "rule__Node__Group_5__0"
    // InternalRos1Parser.g:1547:1: rule__Node__Group_5__0 : rule__Node__Group_5__0__Impl rule__Node__Group_5__1 ;
    public final void rule__Node__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1551:1: ( rule__Node__Group_5__0__Impl rule__Node__Group_5__1 )
            // InternalRos1Parser.g:1552:2: rule__Node__Group_5__0__Impl rule__Node__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Node__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__0"


    // $ANTLR start "rule__Node__Group_5__0__Impl"
    // InternalRos1Parser.g:1559:1: rule__Node__Group_5__0__Impl : ( Parameters ) ;
    public final void rule__Node__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1563:1: ( ( Parameters ) )
            // InternalRos1Parser.g:1564:1: ( Parameters )
            {
            // InternalRos1Parser.g:1564:1: ( Parameters )
            // InternalRos1Parser.g:1565:2: Parameters
            {
             before(grammarAccess.getNodeAccess().getParametersKeyword_5_0()); 
            match(input,Parameters,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getParametersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__0__Impl"


    // $ANTLR start "rule__Node__Group_5__1"
    // InternalRos1Parser.g:1574:1: rule__Node__Group_5__1 : rule__Node__Group_5__1__Impl rule__Node__Group_5__2 ;
    public final void rule__Node__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1578:1: ( rule__Node__Group_5__1__Impl rule__Node__Group_5__2 )
            // InternalRos1Parser.g:1579:2: rule__Node__Group_5__1__Impl rule__Node__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__1"


    // $ANTLR start "rule__Node__Group_5__1__Impl"
    // InternalRos1Parser.g:1586:1: rule__Node__Group_5__1__Impl : ( RULE_BEGIN ) ;
    public final void rule__Node__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1590:1: ( ( RULE_BEGIN ) )
            // InternalRos1Parser.g:1591:1: ( RULE_BEGIN )
            {
            // InternalRos1Parser.g:1591:1: ( RULE_BEGIN )
            // InternalRos1Parser.g:1592:2: RULE_BEGIN
            {
             before(grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_5_1()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__1__Impl"


    // $ANTLR start "rule__Node__Group_5__2"
    // InternalRos1Parser.g:1601:1: rule__Node__Group_5__2 : rule__Node__Group_5__2__Impl rule__Node__Group_5__3 ;
    public final void rule__Node__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1605:1: ( rule__Node__Group_5__2__Impl rule__Node__Group_5__3 )
            // InternalRos1Parser.g:1606:2: rule__Node__Group_5__2__Impl rule__Node__Group_5__3
            {
            pushFollow(FOLLOW_16);
            rule__Node__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__2"


    // $ANTLR start "rule__Node__Group_5__2__Impl"
    // InternalRos1Parser.g:1613:1: rule__Node__Group_5__2__Impl : ( ( rule__Node__ParameterAssignment_5_2 )* ) ;
    public final void rule__Node__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1617:1: ( ( ( rule__Node__ParameterAssignment_5_2 )* ) )
            // InternalRos1Parser.g:1618:1: ( ( rule__Node__ParameterAssignment_5_2 )* )
            {
            // InternalRos1Parser.g:1618:1: ( ( rule__Node__ParameterAssignment_5_2 )* )
            // InternalRos1Parser.g:1619:2: ( rule__Node__ParameterAssignment_5_2 )*
            {
             before(grammarAccess.getNodeAccess().getParameterAssignment_5_2()); 
            // InternalRos1Parser.g:1620:2: ( rule__Node__ParameterAssignment_5_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||LA15_0==RULE_STRING) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRos1Parser.g:1620:3: rule__Node__ParameterAssignment_5_2
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Node__ParameterAssignment_5_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getParameterAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__2__Impl"


    // $ANTLR start "rule__Node__Group_5__3"
    // InternalRos1Parser.g:1628:1: rule__Node__Group_5__3 : rule__Node__Group_5__3__Impl ;
    public final void rule__Node__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1632:1: ( rule__Node__Group_5__3__Impl )
            // InternalRos1Parser.g:1633:2: rule__Node__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__3"


    // $ANTLR start "rule__Node__Group_5__3__Impl"
    // InternalRos1Parser.g:1639:1: rule__Node__Group_5__3__Impl : ( RULE_END ) ;
    public final void rule__Node__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1643:1: ( ( RULE_END ) )
            // InternalRos1Parser.g:1644:1: ( RULE_END )
            {
            // InternalRos1Parser.g:1644:1: ( RULE_END )
            // InternalRos1Parser.g:1645:2: RULE_END
            {
             before(grammarAccess.getNodeAccess().getENDTerminalRuleCall_5_3()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getENDTerminalRuleCall_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_5__3__Impl"


    // $ANTLR start "rule__Publisher__Group__0"
    // InternalRos1Parser.g:1655:1: rule__Publisher__Group__0 : rule__Publisher__Group__0__Impl rule__Publisher__Group__1 ;
    public final void rule__Publisher__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1659:1: ( rule__Publisher__Group__0__Impl rule__Publisher__Group__1 )
            // InternalRos1Parser.g:1660:2: rule__Publisher__Group__0__Impl rule__Publisher__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Publisher__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__0"


    // $ANTLR start "rule__Publisher__Group__0__Impl"
    // InternalRos1Parser.g:1667:1: rule__Publisher__Group__0__Impl : ( () ) ;
    public final void rule__Publisher__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1671:1: ( ( () ) )
            // InternalRos1Parser.g:1672:1: ( () )
            {
            // InternalRos1Parser.g:1672:1: ( () )
            // InternalRos1Parser.g:1673:2: ()
            {
             before(grammarAccess.getPublisherAccess().getPublisherAction_0()); 
            // InternalRos1Parser.g:1674:2: ()
            // InternalRos1Parser.g:1674:3: 
            {
            }

             after(grammarAccess.getPublisherAccess().getPublisherAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__0__Impl"


    // $ANTLR start "rule__Publisher__Group__1"
    // InternalRos1Parser.g:1682:1: rule__Publisher__Group__1 : rule__Publisher__Group__1__Impl rule__Publisher__Group__2 ;
    public final void rule__Publisher__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1686:1: ( rule__Publisher__Group__1__Impl rule__Publisher__Group__2 )
            // InternalRos1Parser.g:1687:2: rule__Publisher__Group__1__Impl rule__Publisher__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Publisher__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__1"


    // $ANTLR start "rule__Publisher__Group__1__Impl"
    // InternalRos1Parser.g:1694:1: rule__Publisher__Group__1__Impl : ( ( rule__Publisher__NameAssignment_1 ) ) ;
    public final void rule__Publisher__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1698:1: ( ( ( rule__Publisher__NameAssignment_1 ) ) )
            // InternalRos1Parser.g:1699:1: ( ( rule__Publisher__NameAssignment_1 ) )
            {
            // InternalRos1Parser.g:1699:1: ( ( rule__Publisher__NameAssignment_1 ) )
            // InternalRos1Parser.g:1700:2: ( rule__Publisher__NameAssignment_1 )
            {
             before(grammarAccess.getPublisherAccess().getNameAssignment_1()); 
            // InternalRos1Parser.g:1701:2: ( rule__Publisher__NameAssignment_1 )
            // InternalRos1Parser.g:1701:3: rule__Publisher__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__1__Impl"


    // $ANTLR start "rule__Publisher__Group__2"
    // InternalRos1Parser.g:1709:1: rule__Publisher__Group__2 : rule__Publisher__Group__2__Impl rule__Publisher__Group__3 ;
    public final void rule__Publisher__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1713:1: ( rule__Publisher__Group__2__Impl rule__Publisher__Group__3 )
            // InternalRos1Parser.g:1714:2: rule__Publisher__Group__2__Impl rule__Publisher__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Publisher__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__2"


    // $ANTLR start "rule__Publisher__Group__2__Impl"
    // InternalRos1Parser.g:1721:1: rule__Publisher__Group__2__Impl : ( Colon ) ;
    public final void rule__Publisher__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1725:1: ( ( Colon ) )
            // InternalRos1Parser.g:1726:1: ( Colon )
            {
            // InternalRos1Parser.g:1726:1: ( Colon )
            // InternalRos1Parser.g:1727:2: Colon
            {
             before(grammarAccess.getPublisherAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__2__Impl"


    // $ANTLR start "rule__Publisher__Group__3"
    // InternalRos1Parser.g:1736:1: rule__Publisher__Group__3 : rule__Publisher__Group__3__Impl rule__Publisher__Group__4 ;
    public final void rule__Publisher__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1740:1: ( rule__Publisher__Group__3__Impl rule__Publisher__Group__4 )
            // InternalRos1Parser.g:1741:2: rule__Publisher__Group__3__Impl rule__Publisher__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Publisher__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__3"


    // $ANTLR start "rule__Publisher__Group__3__Impl"
    // InternalRos1Parser.g:1748:1: rule__Publisher__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Publisher__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1752:1: ( ( RULE_BEGIN ) )
            // InternalRos1Parser.g:1753:1: ( RULE_BEGIN )
            {
            // InternalRos1Parser.g:1753:1: ( RULE_BEGIN )
            // InternalRos1Parser.g:1754:2: RULE_BEGIN
            {
             before(grammarAccess.getPublisherAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__3__Impl"


    // $ANTLR start "rule__Publisher__Group__4"
    // InternalRos1Parser.g:1763:1: rule__Publisher__Group__4 : rule__Publisher__Group__4__Impl rule__Publisher__Group__5 ;
    public final void rule__Publisher__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1767:1: ( rule__Publisher__Group__4__Impl rule__Publisher__Group__5 )
            // InternalRos1Parser.g:1768:2: rule__Publisher__Group__4__Impl rule__Publisher__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Publisher__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__4"


    // $ANTLR start "rule__Publisher__Group__4__Impl"
    // InternalRos1Parser.g:1775:1: rule__Publisher__Group__4__Impl : ( Type ) ;
    public final void rule__Publisher__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1779:1: ( ( Type ) )
            // InternalRos1Parser.g:1780:1: ( Type )
            {
            // InternalRos1Parser.g:1780:1: ( Type )
            // InternalRos1Parser.g:1781:2: Type
            {
             before(grammarAccess.getPublisherAccess().getTypeKeyword_4()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__4__Impl"


    // $ANTLR start "rule__Publisher__Group__5"
    // InternalRos1Parser.g:1790:1: rule__Publisher__Group__5 : rule__Publisher__Group__5__Impl rule__Publisher__Group__6 ;
    public final void rule__Publisher__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1794:1: ( rule__Publisher__Group__5__Impl rule__Publisher__Group__6 )
            // InternalRos1Parser.g:1795:2: rule__Publisher__Group__5__Impl rule__Publisher__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Publisher__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Publisher__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__5"


    // $ANTLR start "rule__Publisher__Group__5__Impl"
    // InternalRos1Parser.g:1802:1: rule__Publisher__Group__5__Impl : ( ( rule__Publisher__MessageAssignment_5 ) ) ;
    public final void rule__Publisher__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1806:1: ( ( ( rule__Publisher__MessageAssignment_5 ) ) )
            // InternalRos1Parser.g:1807:1: ( ( rule__Publisher__MessageAssignment_5 ) )
            {
            // InternalRos1Parser.g:1807:1: ( ( rule__Publisher__MessageAssignment_5 ) )
            // InternalRos1Parser.g:1808:2: ( rule__Publisher__MessageAssignment_5 )
            {
             before(grammarAccess.getPublisherAccess().getMessageAssignment_5()); 
            // InternalRos1Parser.g:1809:2: ( rule__Publisher__MessageAssignment_5 )
            // InternalRos1Parser.g:1809:3: rule__Publisher__MessageAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__MessageAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPublisherAccess().getMessageAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__5__Impl"


    // $ANTLR start "rule__Publisher__Group__6"
    // InternalRos1Parser.g:1817:1: rule__Publisher__Group__6 : rule__Publisher__Group__6__Impl ;
    public final void rule__Publisher__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1821:1: ( rule__Publisher__Group__6__Impl )
            // InternalRos1Parser.g:1822:2: rule__Publisher__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Publisher__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__6"


    // $ANTLR start "rule__Publisher__Group__6__Impl"
    // InternalRos1Parser.g:1828:1: rule__Publisher__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Publisher__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1832:1: ( ( RULE_END ) )
            // InternalRos1Parser.g:1833:1: ( RULE_END )
            {
            // InternalRos1Parser.g:1833:1: ( RULE_END )
            // InternalRos1Parser.g:1834:2: RULE_END
            {
             before(grammarAccess.getPublisherAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getPublisherAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__Group__6__Impl"


    // $ANTLR start "rule__Subscriber__Group__0"
    // InternalRos1Parser.g:1844:1: rule__Subscriber__Group__0 : rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1 ;
    public final void rule__Subscriber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1848:1: ( rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1 )
            // InternalRos1Parser.g:1849:2: rule__Subscriber__Group__0__Impl rule__Subscriber__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Subscriber__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__0"


    // $ANTLR start "rule__Subscriber__Group__0__Impl"
    // InternalRos1Parser.g:1856:1: rule__Subscriber__Group__0__Impl : ( () ) ;
    public final void rule__Subscriber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1860:1: ( ( () ) )
            // InternalRos1Parser.g:1861:1: ( () )
            {
            // InternalRos1Parser.g:1861:1: ( () )
            // InternalRos1Parser.g:1862:2: ()
            {
             before(grammarAccess.getSubscriberAccess().getSubscriberAction_0()); 
            // InternalRos1Parser.g:1863:2: ()
            // InternalRos1Parser.g:1863:3: 
            {
            }

             after(grammarAccess.getSubscriberAccess().getSubscriberAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__0__Impl"


    // $ANTLR start "rule__Subscriber__Group__1"
    // InternalRos1Parser.g:1871:1: rule__Subscriber__Group__1 : rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2 ;
    public final void rule__Subscriber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1875:1: ( rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2 )
            // InternalRos1Parser.g:1876:2: rule__Subscriber__Group__1__Impl rule__Subscriber__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Subscriber__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__1"


    // $ANTLR start "rule__Subscriber__Group__1__Impl"
    // InternalRos1Parser.g:1883:1: rule__Subscriber__Group__1__Impl : ( ( rule__Subscriber__NameAssignment_1 ) ) ;
    public final void rule__Subscriber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1887:1: ( ( ( rule__Subscriber__NameAssignment_1 ) ) )
            // InternalRos1Parser.g:1888:1: ( ( rule__Subscriber__NameAssignment_1 ) )
            {
            // InternalRos1Parser.g:1888:1: ( ( rule__Subscriber__NameAssignment_1 ) )
            // InternalRos1Parser.g:1889:2: ( rule__Subscriber__NameAssignment_1 )
            {
             before(grammarAccess.getSubscriberAccess().getNameAssignment_1()); 
            // InternalRos1Parser.g:1890:2: ( rule__Subscriber__NameAssignment_1 )
            // InternalRos1Parser.g:1890:3: rule__Subscriber__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__1__Impl"


    // $ANTLR start "rule__Subscriber__Group__2"
    // InternalRos1Parser.g:1898:1: rule__Subscriber__Group__2 : rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3 ;
    public final void rule__Subscriber__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1902:1: ( rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3 )
            // InternalRos1Parser.g:1903:2: rule__Subscriber__Group__2__Impl rule__Subscriber__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Subscriber__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__2"


    // $ANTLR start "rule__Subscriber__Group__2__Impl"
    // InternalRos1Parser.g:1910:1: rule__Subscriber__Group__2__Impl : ( Colon ) ;
    public final void rule__Subscriber__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1914:1: ( ( Colon ) )
            // InternalRos1Parser.g:1915:1: ( Colon )
            {
            // InternalRos1Parser.g:1915:1: ( Colon )
            // InternalRos1Parser.g:1916:2: Colon
            {
             before(grammarAccess.getSubscriberAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__2__Impl"


    // $ANTLR start "rule__Subscriber__Group__3"
    // InternalRos1Parser.g:1925:1: rule__Subscriber__Group__3 : rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4 ;
    public final void rule__Subscriber__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1929:1: ( rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4 )
            // InternalRos1Parser.g:1930:2: rule__Subscriber__Group__3__Impl rule__Subscriber__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Subscriber__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__3"


    // $ANTLR start "rule__Subscriber__Group__3__Impl"
    // InternalRos1Parser.g:1937:1: rule__Subscriber__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Subscriber__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1941:1: ( ( RULE_BEGIN ) )
            // InternalRos1Parser.g:1942:1: ( RULE_BEGIN )
            {
            // InternalRos1Parser.g:1942:1: ( RULE_BEGIN )
            // InternalRos1Parser.g:1943:2: RULE_BEGIN
            {
             before(grammarAccess.getSubscriberAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__3__Impl"


    // $ANTLR start "rule__Subscriber__Group__4"
    // InternalRos1Parser.g:1952:1: rule__Subscriber__Group__4 : rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5 ;
    public final void rule__Subscriber__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1956:1: ( rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5 )
            // InternalRos1Parser.g:1957:2: rule__Subscriber__Group__4__Impl rule__Subscriber__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Subscriber__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__4"


    // $ANTLR start "rule__Subscriber__Group__4__Impl"
    // InternalRos1Parser.g:1964:1: rule__Subscriber__Group__4__Impl : ( Type ) ;
    public final void rule__Subscriber__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1968:1: ( ( Type ) )
            // InternalRos1Parser.g:1969:1: ( Type )
            {
            // InternalRos1Parser.g:1969:1: ( Type )
            // InternalRos1Parser.g:1970:2: Type
            {
             before(grammarAccess.getSubscriberAccess().getTypeKeyword_4()); 
            match(input,Type,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getTypeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__4__Impl"


    // $ANTLR start "rule__Subscriber__Group__5"
    // InternalRos1Parser.g:1979:1: rule__Subscriber__Group__5 : rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6 ;
    public final void rule__Subscriber__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1983:1: ( rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6 )
            // InternalRos1Parser.g:1984:2: rule__Subscriber__Group__5__Impl rule__Subscriber__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__Subscriber__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__5"


    // $ANTLR start "rule__Subscriber__Group__5__Impl"
    // InternalRos1Parser.g:1991:1: rule__Subscriber__Group__5__Impl : ( ( rule__Subscriber__MessageAssignment_5 ) ) ;
    public final void rule__Subscriber__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:1995:1: ( ( ( rule__Subscriber__MessageAssignment_5 ) ) )
            // InternalRos1Parser.g:1996:1: ( ( rule__Subscriber__MessageAssignment_5 ) )
            {
            // InternalRos1Parser.g:1996:1: ( ( rule__Subscriber__MessageAssignment_5 ) )
            // InternalRos1Parser.g:1997:2: ( rule__Subscriber__MessageAssignment_5 )
            {
             before(grammarAccess.getSubscriberAccess().getMessageAssignment_5()); 
            // InternalRos1Parser.g:1998:2: ( rule__Subscriber__MessageAssignment_5 )
            // InternalRos1Parser.g:1998:3: rule__Subscriber__MessageAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__MessageAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSubscriberAccess().getMessageAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__5__Impl"


    // $ANTLR start "rule__Subscriber__Group__6"
    // InternalRos1Parser.g:2006:1: rule__Subscriber__Group__6 : rule__Subscriber__Group__6__Impl ;
    public final void rule__Subscriber__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2010:1: ( rule__Subscriber__Group__6__Impl )
            // InternalRos1Parser.g:2011:2: rule__Subscriber__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subscriber__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__6"


    // $ANTLR start "rule__Subscriber__Group__6__Impl"
    // InternalRos1Parser.g:2017:1: rule__Subscriber__Group__6__Impl : ( RULE_END ) ;
    public final void rule__Subscriber__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2021:1: ( ( RULE_END ) )
            // InternalRos1Parser.g:2022:1: ( RULE_END )
            {
            // InternalRos1Parser.g:2022:1: ( RULE_END )
            // InternalRos1Parser.g:2023:2: RULE_END
            {
             before(grammarAccess.getSubscriberAccess().getENDTerminalRuleCall_6()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getSubscriberAccess().getENDTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__Group__6__Impl"


    // $ANTLR start "rule__Parameter__Group__0"
    // InternalRos1Parser.g:2033:1: rule__Parameter__Group__0 : rule__Parameter__Group__0__Impl rule__Parameter__Group__1 ;
    public final void rule__Parameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2037:1: ( rule__Parameter__Group__0__Impl rule__Parameter__Group__1 )
            // InternalRos1Parser.g:2038:2: rule__Parameter__Group__0__Impl rule__Parameter__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Parameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0"


    // $ANTLR start "rule__Parameter__Group__0__Impl"
    // InternalRos1Parser.g:2045:1: rule__Parameter__Group__0__Impl : ( () ) ;
    public final void rule__Parameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2049:1: ( ( () ) )
            // InternalRos1Parser.g:2050:1: ( () )
            {
            // InternalRos1Parser.g:2050:1: ( () )
            // InternalRos1Parser.g:2051:2: ()
            {
             before(grammarAccess.getParameterAccess().getParameterAction_0()); 
            // InternalRos1Parser.g:2052:2: ()
            // InternalRos1Parser.g:2052:3: 
            {
            }

             after(grammarAccess.getParameterAccess().getParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__0__Impl"


    // $ANTLR start "rule__Parameter__Group__1"
    // InternalRos1Parser.g:2060:1: rule__Parameter__Group__1 : rule__Parameter__Group__1__Impl rule__Parameter__Group__2 ;
    public final void rule__Parameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2064:1: ( rule__Parameter__Group__1__Impl rule__Parameter__Group__2 )
            // InternalRos1Parser.g:2065:2: rule__Parameter__Group__1__Impl rule__Parameter__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Parameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1"


    // $ANTLR start "rule__Parameter__Group__1__Impl"
    // InternalRos1Parser.g:2072:1: rule__Parameter__Group__1__Impl : ( ( rule__Parameter__NameAssignment_1 ) ) ;
    public final void rule__Parameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2076:1: ( ( ( rule__Parameter__NameAssignment_1 ) ) )
            // InternalRos1Parser.g:2077:1: ( ( rule__Parameter__NameAssignment_1 ) )
            {
            // InternalRos1Parser.g:2077:1: ( ( rule__Parameter__NameAssignment_1 ) )
            // InternalRos1Parser.g:2078:2: ( rule__Parameter__NameAssignment_1 )
            {
             before(grammarAccess.getParameterAccess().getNameAssignment_1()); 
            // InternalRos1Parser.g:2079:2: ( rule__Parameter__NameAssignment_1 )
            // InternalRos1Parser.g:2079:3: rule__Parameter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__1__Impl"


    // $ANTLR start "rule__Parameter__Group__2"
    // InternalRos1Parser.g:2087:1: rule__Parameter__Group__2 : rule__Parameter__Group__2__Impl rule__Parameter__Group__3 ;
    public final void rule__Parameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2091:1: ( rule__Parameter__Group__2__Impl rule__Parameter__Group__3 )
            // InternalRos1Parser.g:2092:2: rule__Parameter__Group__2__Impl rule__Parameter__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Parameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2"


    // $ANTLR start "rule__Parameter__Group__2__Impl"
    // InternalRos1Parser.g:2099:1: rule__Parameter__Group__2__Impl : ( Colon ) ;
    public final void rule__Parameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2103:1: ( ( Colon ) )
            // InternalRos1Parser.g:2104:1: ( Colon )
            {
            // InternalRos1Parser.g:2104:1: ( Colon )
            // InternalRos1Parser.g:2105:2: Colon
            {
             before(grammarAccess.getParameterAccess().getColonKeyword_2()); 
            match(input,Colon,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__2__Impl"


    // $ANTLR start "rule__Parameter__Group__3"
    // InternalRos1Parser.g:2114:1: rule__Parameter__Group__3 : rule__Parameter__Group__3__Impl rule__Parameter__Group__4 ;
    public final void rule__Parameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2118:1: ( rule__Parameter__Group__3__Impl rule__Parameter__Group__4 )
            // InternalRos1Parser.g:2119:2: rule__Parameter__Group__3__Impl rule__Parameter__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Parameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3"


    // $ANTLR start "rule__Parameter__Group__3__Impl"
    // InternalRos1Parser.g:2126:1: rule__Parameter__Group__3__Impl : ( RULE_BEGIN ) ;
    public final void rule__Parameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2130:1: ( ( RULE_BEGIN ) )
            // InternalRos1Parser.g:2131:1: ( RULE_BEGIN )
            {
            // InternalRos1Parser.g:2131:1: ( RULE_BEGIN )
            // InternalRos1Parser.g:2132:2: RULE_BEGIN
            {
             before(grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_3()); 
            match(input,RULE_BEGIN,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getBEGINTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__3__Impl"


    // $ANTLR start "rule__Parameter__Group__4"
    // InternalRos1Parser.g:2141:1: rule__Parameter__Group__4 : rule__Parameter__Group__4__Impl rule__Parameter__Group__5 ;
    public final void rule__Parameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2145:1: ( rule__Parameter__Group__4__Impl rule__Parameter__Group__5 )
            // InternalRos1Parser.g:2146:2: rule__Parameter__Group__4__Impl rule__Parameter__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Parameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4"


    // $ANTLR start "rule__Parameter__Group__4__Impl"
    // InternalRos1Parser.g:2153:1: rule__Parameter__Group__4__Impl : ( RULE_END ) ;
    public final void rule__Parameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2157:1: ( ( RULE_END ) )
            // InternalRos1Parser.g:2158:1: ( RULE_END )
            {
            // InternalRos1Parser.g:2158:1: ( RULE_END )
            // InternalRos1Parser.g:2159:2: RULE_END
            {
             before(grammarAccess.getParameterAccess().getENDTerminalRuleCall_4()); 
            match(input,RULE_END,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getENDTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__4__Impl"


    // $ANTLR start "rule__Parameter__Group__5"
    // InternalRos1Parser.g:2168:1: rule__Parameter__Group__5 : rule__Parameter__Group__5__Impl ;
    public final void rule__Parameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2172:1: ( rule__Parameter__Group__5__Impl )
            // InternalRos1Parser.g:2173:2: rule__Parameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5"


    // $ANTLR start "rule__Parameter__Group__5__Impl"
    // InternalRos1Parser.g:2179:1: rule__Parameter__Group__5__Impl : ( RightCurlyBracket ) ;
    public final void rule__Parameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2183:1: ( ( RightCurlyBracket ) )
            // InternalRos1Parser.g:2184:1: ( RightCurlyBracket )
            {
            // InternalRos1Parser.g:2184:1: ( RightCurlyBracket )
            // InternalRos1Parser.g:2185:2: RightCurlyBracket
            {
             before(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__Group__5__Impl"


    // $ANTLR start "rule__ExternalDependency__Group__0"
    // InternalRos1Parser.g:2195:1: rule__ExternalDependency__Group__0 : rule__ExternalDependency__Group__0__Impl rule__ExternalDependency__Group__1 ;
    public final void rule__ExternalDependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2199:1: ( rule__ExternalDependency__Group__0__Impl rule__ExternalDependency__Group__1 )
            // InternalRos1Parser.g:2200:2: rule__ExternalDependency__Group__0__Impl rule__ExternalDependency__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ExternalDependency__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDependency__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDependency__Group__0"


    // $ANTLR start "rule__ExternalDependency__Group__0__Impl"
    // InternalRos1Parser.g:2207:1: rule__ExternalDependency__Group__0__Impl : ( () ) ;
    public final void rule__ExternalDependency__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2211:1: ( ( () ) )
            // InternalRos1Parser.g:2212:1: ( () )
            {
            // InternalRos1Parser.g:2212:1: ( () )
            // InternalRos1Parser.g:2213:2: ()
            {
             before(grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0()); 
            // InternalRos1Parser.g:2214:2: ()
            // InternalRos1Parser.g:2214:3: 
            {
            }

             after(grammarAccess.getExternalDependencyAccess().getExternalDependencyAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDependency__Group__0__Impl"


    // $ANTLR start "rule__ExternalDependency__Group__1"
    // InternalRos1Parser.g:2222:1: rule__ExternalDependency__Group__1 : rule__ExternalDependency__Group__1__Impl rule__ExternalDependency__Group__2 ;
    public final void rule__ExternalDependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2226:1: ( rule__ExternalDependency__Group__1__Impl rule__ExternalDependency__Group__2 )
            // InternalRos1Parser.g:2227:2: rule__ExternalDependency__Group__1__Impl rule__ExternalDependency__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ExternalDependency__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalDependency__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDependency__Group__1"


    // $ANTLR start "rule__ExternalDependency__Group__1__Impl"
    // InternalRos1Parser.g:2234:1: rule__ExternalDependency__Group__1__Impl : ( ExternalDependency ) ;
    public final void rule__ExternalDependency__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2238:1: ( ( ExternalDependency ) )
            // InternalRos1Parser.g:2239:1: ( ExternalDependency )
            {
            // InternalRos1Parser.g:2239:1: ( ExternalDependency )
            // InternalRos1Parser.g:2240:2: ExternalDependency
            {
             before(grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1()); 
            match(input,ExternalDependency,FOLLOW_2); 
             after(grammarAccess.getExternalDependencyAccess().getExternalDependencyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDependency__Group__1__Impl"


    // $ANTLR start "rule__ExternalDependency__Group__2"
    // InternalRos1Parser.g:2249:1: rule__ExternalDependency__Group__2 : rule__ExternalDependency__Group__2__Impl ;
    public final void rule__ExternalDependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2253:1: ( rule__ExternalDependency__Group__2__Impl )
            // InternalRos1Parser.g:2254:2: rule__ExternalDependency__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDependency__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDependency__Group__2"


    // $ANTLR start "rule__ExternalDependency__Group__2__Impl"
    // InternalRos1Parser.g:2260:1: rule__ExternalDependency__Group__2__Impl : ( ( rule__ExternalDependency__NameAssignment_2 ) ) ;
    public final void rule__ExternalDependency__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2264:1: ( ( ( rule__ExternalDependency__NameAssignment_2 ) ) )
            // InternalRos1Parser.g:2265:1: ( ( rule__ExternalDependency__NameAssignment_2 ) )
            {
            // InternalRos1Parser.g:2265:1: ( ( rule__ExternalDependency__NameAssignment_2 ) )
            // InternalRos1Parser.g:2266:2: ( rule__ExternalDependency__NameAssignment_2 )
            {
             before(grammarAccess.getExternalDependencyAccess().getNameAssignment_2()); 
            // InternalRos1Parser.g:2267:2: ( rule__ExternalDependency__NameAssignment_2 )
            // InternalRos1Parser.g:2267:3: rule__ExternalDependency__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalDependency__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalDependencyAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDependency__Group__2__Impl"


    // $ANTLR start "rule__CatkinPackage__NameAssignment_1"
    // InternalRos1Parser.g:2276:1: rule__CatkinPackage__NameAssignment_1 : ( ruleRosNames ) ;
    public final void rule__CatkinPackage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2280:1: ( ( ruleRosNames ) )
            // InternalRos1Parser.g:2281:2: ( ruleRosNames )
            {
            // InternalRos1Parser.g:2281:2: ( ruleRosNames )
            // InternalRos1Parser.g:2282:3: ruleRosNames
            {
             before(grammarAccess.getCatkinPackageAccess().getNameRosNamesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosNames();

            state._fsp--;

             after(grammarAccess.getCatkinPackageAccess().getNameRosNamesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__NameAssignment_1"


    // $ANTLR start "rule__CatkinPackage__FromGitRepoAssignment_4_1"
    // InternalRos1Parser.g:2291:1: rule__CatkinPackage__FromGitRepoAssignment_4_1 : ( ruleEString ) ;
    public final void rule__CatkinPackage__FromGitRepoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2295:1: ( ( ruleEString ) )
            // InternalRos1Parser.g:2296:2: ( ruleEString )
            {
            // InternalRos1Parser.g:2296:2: ( ruleEString )
            // InternalRos1Parser.g:2297:3: ruleEString
            {
             before(grammarAccess.getCatkinPackageAccess().getFromGitRepoEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCatkinPackageAccess().getFromGitRepoEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__FromGitRepoAssignment_4_1"


    // $ANTLR start "rule__CatkinPackage__ArtifactAssignment_5_2"
    // InternalRos1Parser.g:2306:1: rule__CatkinPackage__ArtifactAssignment_5_2 : ( ruleArtifact ) ;
    public final void rule__CatkinPackage__ArtifactAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2310:1: ( ( ruleArtifact ) )
            // InternalRos1Parser.g:2311:2: ( ruleArtifact )
            {
            // InternalRos1Parser.g:2311:2: ( ruleArtifact )
            // InternalRos1Parser.g:2312:3: ruleArtifact
            {
             before(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleArtifact();

            state._fsp--;

             after(grammarAccess.getCatkinPackageAccess().getArtifactArtifactParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__ArtifactAssignment_5_2"


    // $ANTLR start "rule__CatkinPackage__DependencyAssignment_6_2"
    // InternalRos1Parser.g:2321:1: rule__CatkinPackage__DependencyAssignment_6_2 : ( ruleDependency ) ;
    public final void rule__CatkinPackage__DependencyAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2325:1: ( ( ruleDependency ) )
            // InternalRos1Parser.g:2326:2: ( ruleDependency )
            {
            // InternalRos1Parser.g:2326:2: ( ruleDependency )
            // InternalRos1Parser.g:2327:3: ruleDependency
            {
             before(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__DependencyAssignment_6_2"


    // $ANTLR start "rule__CatkinPackage__DependencyAssignment_6_3_1"
    // InternalRos1Parser.g:2336:1: rule__CatkinPackage__DependencyAssignment_6_3_1 : ( ruleDependency ) ;
    public final void rule__CatkinPackage__DependencyAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2340:1: ( ( ruleDependency ) )
            // InternalRos1Parser.g:2341:2: ( ruleDependency )
            {
            // InternalRos1Parser.g:2341:2: ( ruleDependency )
            // InternalRos1Parser.g:2342:3: ruleDependency
            {
             before(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDependency();

            state._fsp--;

             after(grammarAccess.getCatkinPackageAccess().getDependencyDependencyParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CatkinPackage__DependencyAssignment_6_3_1"


    // $ANTLR start "rule__Artifact__NameAssignment_1"
    // InternalRos1Parser.g:2351:1: rule__Artifact__NameAssignment_1 : ( ruleRosNames ) ;
    public final void rule__Artifact__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2355:1: ( ( ruleRosNames ) )
            // InternalRos1Parser.g:2356:2: ( ruleRosNames )
            {
            // InternalRos1Parser.g:2356:2: ( ruleRosNames )
            // InternalRos1Parser.g:2357:3: ruleRosNames
            {
             before(grammarAccess.getArtifactAccess().getNameRosNamesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosNames();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getNameRosNamesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__NameAssignment_1"


    // $ANTLR start "rule__Artifact__NodeAssignment_4"
    // InternalRos1Parser.g:2366:1: rule__Artifact__NodeAssignment_4 : ( ruleNode ) ;
    public final void rule__Artifact__NodeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2370:1: ( ( ruleNode ) )
            // InternalRos1Parser.g:2371:2: ( ruleNode )
            {
            // InternalRos1Parser.g:2371:2: ( ruleNode )
            // InternalRos1Parser.g:2372:3: ruleNode
            {
             before(grammarAccess.getArtifactAccess().getNodeNodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getArtifactAccess().getNodeNodeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Artifact__NodeAssignment_4"


    // $ANTLR start "rule__Node__NameAssignment_1"
    // InternalRos1Parser.g:2381:1: rule__Node__NameAssignment_1 : ( ruleRosNames ) ;
    public final void rule__Node__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2385:1: ( ( ruleRosNames ) )
            // InternalRos1Parser.g:2386:2: ( ruleRosNames )
            {
            // InternalRos1Parser.g:2386:2: ( ruleRosNames )
            // InternalRos1Parser.g:2387:3: ruleRosNames
            {
             before(grammarAccess.getNodeAccess().getNameRosNamesParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRosNames();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getNameRosNamesParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__NameAssignment_1"


    // $ANTLR start "rule__Node__PublisherAssignment_3_2"
    // InternalRos1Parser.g:2396:1: rule__Node__PublisherAssignment_3_2 : ( rulePublisher ) ;
    public final void rule__Node__PublisherAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2400:1: ( ( rulePublisher ) )
            // InternalRos1Parser.g:2401:2: ( rulePublisher )
            {
            // InternalRos1Parser.g:2401:2: ( rulePublisher )
            // InternalRos1Parser.g:2402:3: rulePublisher
            {
             before(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            rulePublisher();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getPublisherPublisherParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__PublisherAssignment_3_2"


    // $ANTLR start "rule__Node__SubscriberAssignment_4_2"
    // InternalRos1Parser.g:2411:1: rule__Node__SubscriberAssignment_4_2 : ( ruleSubscriber ) ;
    public final void rule__Node__SubscriberAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2415:1: ( ( ruleSubscriber ) )
            // InternalRos1Parser.g:2416:2: ( ruleSubscriber )
            {
            // InternalRos1Parser.g:2416:2: ( ruleSubscriber )
            // InternalRos1Parser.g:2417:3: ruleSubscriber
            {
             before(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubscriber();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getSubscriberSubscriberParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__SubscriberAssignment_4_2"


    // $ANTLR start "rule__Node__ParameterAssignment_5_2"
    // InternalRos1Parser.g:2426:1: rule__Node__ParameterAssignment_5_2 : ( ruleParameter ) ;
    public final void rule__Node__ParameterAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2430:1: ( ( ruleParameter ) )
            // InternalRos1Parser.g:2431:2: ( ruleParameter )
            {
            // InternalRos1Parser.g:2431:2: ( ruleParameter )
            // InternalRos1Parser.g:2432:3: ruleParameter
            {
             before(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getParameterParameterParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ParameterAssignment_5_2"


    // $ANTLR start "rule__Publisher__NameAssignment_1"
    // InternalRos1Parser.g:2441:1: rule__Publisher__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Publisher__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2445:1: ( ( ruleEString ) )
            // InternalRos1Parser.g:2446:2: ( ruleEString )
            {
            // InternalRos1Parser.g:2446:2: ( ruleEString )
            // InternalRos1Parser.g:2447:3: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__NameAssignment_1"


    // $ANTLR start "rule__Publisher__MessageAssignment_5"
    // InternalRos1Parser.g:2456:1: rule__Publisher__MessageAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Publisher__MessageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2460:1: ( ( ( ruleEString ) ) )
            // InternalRos1Parser.g:2461:2: ( ( ruleEString ) )
            {
            // InternalRos1Parser.g:2461:2: ( ( ruleEString ) )
            // InternalRos1Parser.g:2462:3: ( ruleEString )
            {
             before(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0()); 
            // InternalRos1Parser.g:2463:3: ( ruleEString )
            // InternalRos1Parser.g:2464:4: ruleEString
            {
             before(grammarAccess.getPublisherAccess().getMessageTopicSpecEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPublisherAccess().getMessageTopicSpecEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPublisherAccess().getMessageTopicSpecCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Publisher__MessageAssignment_5"


    // $ANTLR start "rule__Subscriber__NameAssignment_1"
    // InternalRos1Parser.g:2475:1: rule__Subscriber__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Subscriber__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2479:1: ( ( ruleEString ) )
            // InternalRos1Parser.g:2480:2: ( ruleEString )
            {
            // InternalRos1Parser.g:2480:2: ( ruleEString )
            // InternalRos1Parser.g:2481:3: ruleEString
            {
             before(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__NameAssignment_1"


    // $ANTLR start "rule__Subscriber__MessageAssignment_5"
    // InternalRos1Parser.g:2490:1: rule__Subscriber__MessageAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Subscriber__MessageAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2494:1: ( ( ( ruleEString ) ) )
            // InternalRos1Parser.g:2495:2: ( ( ruleEString ) )
            {
            // InternalRos1Parser.g:2495:2: ( ( ruleEString ) )
            // InternalRos1Parser.g:2496:3: ( ruleEString )
            {
             before(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0()); 
            // InternalRos1Parser.g:2497:3: ( ruleEString )
            // InternalRos1Parser.g:2498:4: ruleEString
            {
             before(grammarAccess.getSubscriberAccess().getMessageTopicSpecEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubscriberAccess().getMessageTopicSpecEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSubscriberAccess().getMessageTopicSpecCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subscriber__MessageAssignment_5"


    // $ANTLR start "rule__Parameter__NameAssignment_1"
    // InternalRos1Parser.g:2509:1: rule__Parameter__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Parameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2513:1: ( ( ruleEString ) )
            // InternalRos1Parser.g:2514:2: ( ruleEString )
            {
            // InternalRos1Parser.g:2514:2: ( ruleEString )
            // InternalRos1Parser.g:2515:3: ruleEString
            {
             before(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment_1"


    // $ANTLR start "rule__PackageDependency__PackageAssignment"
    // InternalRos1Parser.g:2524:1: rule__PackageDependency__PackageAssignment : ( ( ruleEString ) ) ;
    public final void rule__PackageDependency__PackageAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2528:1: ( ( ( ruleEString ) ) )
            // InternalRos1Parser.g:2529:2: ( ( ruleEString ) )
            {
            // InternalRos1Parser.g:2529:2: ( ( ruleEString ) )
            // InternalRos1Parser.g:2530:3: ( ruleEString )
            {
             before(grammarAccess.getPackageDependencyAccess().getPackagePackageCrossReference_0()); 
            // InternalRos1Parser.g:2531:3: ( ruleEString )
            // InternalRos1Parser.g:2532:4: ruleEString
            {
             before(grammarAccess.getPackageDependencyAccess().getPackagePackageEStringParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPackageDependencyAccess().getPackagePackageEStringParserRuleCall_0_1()); 

            }

             after(grammarAccess.getPackageDependencyAccess().getPackagePackageCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PackageDependency__PackageAssignment"


    // $ANTLR start "rule__ExternalDependency__NameAssignment_2"
    // InternalRos1Parser.g:2543:1: rule__ExternalDependency__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__ExternalDependency__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRos1Parser.g:2547:1: ( ( ruleEString ) )
            // InternalRos1Parser.g:2548:2: ( ruleEString )
            {
            // InternalRos1Parser.g:2548:2: ( ruleEString )
            // InternalRos1Parser.g:2549:3: ruleEString
            {
             before(grammarAccess.getExternalDependencyAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalDependencyAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalDependency__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C02000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000100460L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000D02000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000C02002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001400010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100380L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001500000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001400002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});

}