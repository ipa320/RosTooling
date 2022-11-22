/*
 * generated by Xtext 2.25.0
 */
package de.fraunhofer.ipa.ros1.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.ros1.services.Ros1GrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class Ros1SyntacticSequencer extends AbstractSyntacticSequencer {

	protected Ros1GrammarAccess grammarAccess;
	protected AbstractElementAlias match_AmentPackage___ArtifactsKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q;
	protected AbstractElementAlias match_CatkinPackage___ArtifactsKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q;
	protected AbstractElementAlias match_Node___ActionclientKeyword_8_0_BEGINTerminalRuleCall_8_1_ENDTerminalRuleCall_8_3__q;
	protected AbstractElementAlias match_Node___ActionserverKeyword_7_0_BEGINTerminalRuleCall_7_1_ENDTerminalRuleCall_7_3__q;
	protected AbstractElementAlias match_Node___ParametersKeyword_9_0_BEGINTerminalRuleCall_9_1_ENDTerminalRuleCall_9_3__q;
	protected AbstractElementAlias match_Node___PublishersKeyword_3_0_BEGINTerminalRuleCall_3_1_ENDTerminalRuleCall_3_3__q;
	protected AbstractElementAlias match_Node___ServiceclientKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q;
	protected AbstractElementAlias match_Node___ServiceserverKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q;
	protected AbstractElementAlias match_Node___SubscribersKeyword_4_0_BEGINTerminalRuleCall_4_1_ENDTerminalRuleCall_4_3__q;
	protected AbstractElementAlias match_Package_Impl___SpecsKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (Ros1GrammarAccess) access;
		match_AmentPackage___ArtifactsKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAmentPackageAccess().getArtifactsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getAmentPackageAccess().getBEGINTerminalRuleCall_6_1()), new TokenAlias(false, false, grammarAccess.getAmentPackageAccess().getENDTerminalRuleCall_6_3()));
		match_CatkinPackage___ArtifactsKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getCatkinPackageAccess().getArtifactsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getCatkinPackageAccess().getBEGINTerminalRuleCall_5_1()), new TokenAlias(false, false, grammarAccess.getCatkinPackageAccess().getENDTerminalRuleCall_5_3()));
		match_Node___ActionclientKeyword_8_0_BEGINTerminalRuleCall_8_1_ENDTerminalRuleCall_8_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNodeAccess().getActionclientKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_8_1()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getENDTerminalRuleCall_8_3()));
		match_Node___ActionserverKeyword_7_0_BEGINTerminalRuleCall_7_1_ENDTerminalRuleCall_7_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNodeAccess().getActionserverKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_7_1()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getENDTerminalRuleCall_7_3()));
		match_Node___ParametersKeyword_9_0_BEGINTerminalRuleCall_9_1_ENDTerminalRuleCall_9_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNodeAccess().getParametersKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_9_1()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getENDTerminalRuleCall_9_3()));
		match_Node___PublishersKeyword_3_0_BEGINTerminalRuleCall_3_1_ENDTerminalRuleCall_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNodeAccess().getPublishersKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_3_1()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getENDTerminalRuleCall_3_3()));
		match_Node___ServiceclientKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNodeAccess().getServiceclientKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_6_1()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getENDTerminalRuleCall_6_3()));
		match_Node___ServiceserverKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNodeAccess().getServiceserverKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_5_1()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getENDTerminalRuleCall_5_3()));
		match_Node___SubscribersKeyword_4_0_BEGINTerminalRuleCall_4_1_ENDTerminalRuleCall_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNodeAccess().getSubscribersKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getBEGINTerminalRuleCall_4_1()), new TokenAlias(false, false, grammarAccess.getNodeAccess().getENDTerminalRuleCall_4_3()));
		match_Package_Impl___SpecsKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPackage_ImplAccess().getSpecsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getPackage_ImplAccess().getBEGINTerminalRuleCall_5_1()), new TokenAlias(false, false, grammarAccess.getPackage_ImplAccess().getENDTerminalRuleCall_5_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBEGINRule())
			return getBEGINToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getENDRule())
			return getENDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getBEGINToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	/**
	 * Synthetic terminal rule. The concrete syntax is to be specified by clients.
	 * Defaults to the empty string.
	 */
	protected String getENDToken(EObject semanticObject, RuleCall ruleCall, INode node) { return ""; }
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AmentPackage___ArtifactsKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q.equals(syntax))
				emit_AmentPackage___ArtifactsKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_CatkinPackage___ArtifactsKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q.equals(syntax))
				emit_CatkinPackage___ArtifactsKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Node___ActionclientKeyword_8_0_BEGINTerminalRuleCall_8_1_ENDTerminalRuleCall_8_3__q.equals(syntax))
				emit_Node___ActionclientKeyword_8_0_BEGINTerminalRuleCall_8_1_ENDTerminalRuleCall_8_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Node___ActionserverKeyword_7_0_BEGINTerminalRuleCall_7_1_ENDTerminalRuleCall_7_3__q.equals(syntax))
				emit_Node___ActionserverKeyword_7_0_BEGINTerminalRuleCall_7_1_ENDTerminalRuleCall_7_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Node___ParametersKeyword_9_0_BEGINTerminalRuleCall_9_1_ENDTerminalRuleCall_9_3__q.equals(syntax))
				emit_Node___ParametersKeyword_9_0_BEGINTerminalRuleCall_9_1_ENDTerminalRuleCall_9_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Node___PublishersKeyword_3_0_BEGINTerminalRuleCall_3_1_ENDTerminalRuleCall_3_3__q.equals(syntax))
				emit_Node___PublishersKeyword_3_0_BEGINTerminalRuleCall_3_1_ENDTerminalRuleCall_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Node___ServiceclientKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q.equals(syntax))
				emit_Node___ServiceclientKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Node___ServiceserverKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q.equals(syntax))
				emit_Node___ServiceserverKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Node___SubscribersKeyword_4_0_BEGINTerminalRuleCall_4_1_ENDTerminalRuleCall_4_3__q.equals(syntax))
				emit_Node___SubscribersKeyword_4_0_BEGINTerminalRuleCall_4_1_ENDTerminalRuleCall_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Package_Impl___SpecsKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q.equals(syntax))
				emit_Package_Impl___SpecsKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('artifacts:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     fromGitRepo=EString (ambiguity) 'dependencies:' '[' dependency+=Dependency
	 *     fromGitRepo=EString (ambiguity) END (rule end)
	 *     name=RosNames ':' BEGIN (ambiguity) 'dependencies:' '[' dependency+=Dependency
	 *     name=RosNames ':' BEGIN (ambiguity) END (rule end)
	 */
	protected void emit_AmentPackage___ArtifactsKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('artifacts:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     fromGitRepo=EString (ambiguity) 'dependencies:' '[' dependency+=Dependency
	 *     fromGitRepo=EString (ambiguity) END (rule end)
	 *     name=RosNames ':' BEGIN (ambiguity) 'dependencies:' '[' dependency+=Dependency
	 *     name=RosNames ':' BEGIN (ambiguity) END (rule end)
	 */
	protected void emit_CatkinPackage___ArtifactsKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('actionclient:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         ('subscribers:' BEGIN END)? 
	 *         ('serviceserver:' BEGIN END)? 
	 *         ('serviceclient:' BEGIN END)? 
	 *         ('actionserver:' BEGIN END)? 
	 *         (ambiguity) 
	 *         'parameters:' 
	 *         BEGIN 
	 *         parameter+=Parameter
	 *     )
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         ('subscribers:' BEGIN END)? 
	 *         ('serviceserver:' BEGIN END)? 
	 *         ('serviceclient:' BEGIN END)? 
	 *         ('actionserver:' BEGIN END)? 
	 *         (ambiguity) 
	 *         ('parameters:' BEGIN END)? 
	 *         END 
	 *         (rule end)
	 *     )
	 *     actionserver+=ActionServer END (ambiguity) 'parameters:' BEGIN parameter+=Parameter
	 *     actionserver+=ActionServer END (ambiguity) ('parameters:' BEGIN END)? END (rule end)
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? (ambiguity) 'parameters:' BEGIN parameter+=Parameter
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? (ambiguity) ('parameters:' BEGIN END)? END (rule end)
	 *     serviceclient+=ServiceClient END ('actionserver:' BEGIN END)? (ambiguity) 'parameters:' BEGIN parameter+=Parameter
	 *     serviceclient+=ServiceClient END ('actionserver:' BEGIN END)? (ambiguity) ('parameters:' BEGIN END)? END (rule end)
	 *     serviceserver+=ServiceServer END ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? (ambiguity) 'parameters:' BEGIN parameter+=Parameter
	 *     serviceserver+=ServiceServer END ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? (ambiguity) ('parameters:' BEGIN END)? END (rule end)
	 *     subscriber+=Subscriber END ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? (ambiguity) 'parameters:' BEGIN parameter+=Parameter
	 *     subscriber+=Subscriber END ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? (ambiguity) ('parameters:' BEGIN END)? END (rule end)
	 */
	protected void emit_Node___ActionclientKeyword_8_0_BEGINTerminalRuleCall_8_1_ENDTerminalRuleCall_8_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('actionserver:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         ('subscribers:' BEGIN END)? 
	 *         ('serviceserver:' BEGIN END)? 
	 *         ('serviceclient:' BEGIN END)? 
	 *         (ambiguity) 
	 *         ('actionclient:' BEGIN END)? 
	 *         'parameters:' 
	 *         BEGIN 
	 *         parameter+=Parameter
	 *     )
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         ('subscribers:' BEGIN END)? 
	 *         ('serviceserver:' BEGIN END)? 
	 *         ('serviceclient:' BEGIN END)? 
	 *         (ambiguity) 
	 *         ('actionclient:' BEGIN END)? 
	 *         ('parameters:' BEGIN END)? 
	 *         END 
	 *         (rule end)
	 *     )
	 *     name=RosNames BEGIN ('publishers:' BEGIN END)? ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? (ambiguity) 'actionclient:' BEGIN actionclient+=ActionClient
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? (ambiguity) 'actionclient:' BEGIN actionclient+=ActionClient
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? (ambiguity) ('actionclient:' BEGIN END)? 'parameters:' BEGIN parameter+=Parameter
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? (ambiguity) ('actionclient:' BEGIN END)? ('parameters:' BEGIN END)? END (rule end)
	 *     serviceclient+=ServiceClient END (ambiguity) 'actionclient:' BEGIN actionclient+=ActionClient
	 *     serviceclient+=ServiceClient END (ambiguity) ('actionclient:' BEGIN END)? 'parameters:' BEGIN parameter+=Parameter
	 *     serviceclient+=ServiceClient END (ambiguity) ('actionclient:' BEGIN END)? ('parameters:' BEGIN END)? END (rule end)
	 *     serviceserver+=ServiceServer END ('serviceclient:' BEGIN END)? (ambiguity) 'actionclient:' BEGIN actionclient+=ActionClient
	 *     serviceserver+=ServiceServer END ('serviceclient:' BEGIN END)? (ambiguity) ('actionclient:' BEGIN END)? 'parameters:' BEGIN parameter+=Parameter
	 *     serviceserver+=ServiceServer END ('serviceclient:' BEGIN END)? (ambiguity) ('actionclient:' BEGIN END)? ('parameters:' BEGIN END)? END (rule end)
	 *     subscriber+=Subscriber END ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? (ambiguity) 'actionclient:' BEGIN actionclient+=ActionClient
	 *     subscriber+=Subscriber END ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? (ambiguity) ('actionclient:' BEGIN END)? 'parameters:' BEGIN parameter+=Parameter
	 *     subscriber+=Subscriber END ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? (ambiguity) ('actionclient:' BEGIN END)? ('parameters:' BEGIN END)? END (rule end)
	 */
	protected void emit_Node___ActionserverKeyword_7_0_BEGINTerminalRuleCall_7_1_ENDTerminalRuleCall_7_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('parameters:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         ('subscribers:' BEGIN END)? 
	 *         ('serviceserver:' BEGIN END)? 
	 *         ('serviceclient:' BEGIN END)? 
	 *         ('actionserver:' BEGIN END)? 
	 *         ('actionclient:' BEGIN END)? 
	 *         (ambiguity) 
	 *         END 
	 *         (rule end)
	 *     )
	 *     actionclient+=ActionClient END (ambiguity) END (rule end)
	 *     actionserver+=ActionServer END ('actionclient:' BEGIN END)? (ambiguity) END (rule end)
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? (ambiguity) END (rule end)
	 *     serviceclient+=ServiceClient END ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? (ambiguity) END (rule end)
	 *     serviceserver+=ServiceServer END ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? (ambiguity) END (rule end)
	 *     subscriber+=Subscriber END ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? (ambiguity) END (rule end)
	 */
	protected void emit_Node___ParametersKeyword_9_0_BEGINTerminalRuleCall_9_1_ENDTerminalRuleCall_9_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('publishers:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         (ambiguity) 
	 *         ('subscribers:' BEGIN END)? 
	 *         ('serviceserver:' BEGIN END)? 
	 *         ('serviceclient:' BEGIN END)? 
	 *         ('actionserver:' BEGIN END)? 
	 *         ('actionclient:' BEGIN END)? 
	 *         'parameters:' 
	 *         BEGIN 
	 *         parameter+=Parameter
	 *     )
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         (ambiguity) 
	 *         ('subscribers:' BEGIN END)? 
	 *         ('serviceserver:' BEGIN END)? 
	 *         ('serviceclient:' BEGIN END)? 
	 *         ('actionserver:' BEGIN END)? 
	 *         ('actionclient:' BEGIN END)? 
	 *         ('parameters:' BEGIN END)? 
	 *         END 
	 *         (rule end)
	 *     )
	 *     name=RosNames BEGIN (ambiguity) 'subscribers:' BEGIN subscriber+=Subscriber
	 *     name=RosNames BEGIN (ambiguity) ('subscribers:' BEGIN END)? 'serviceserver:' BEGIN serviceserver+=ServiceServer
	 *     name=RosNames BEGIN (ambiguity) ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? 'serviceclient:' BEGIN serviceclient+=ServiceClient
	 *     name=RosNames BEGIN (ambiguity) ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? 'actionserver:' BEGIN actionserver+=ActionServer
	 *     name=RosNames BEGIN (ambiguity) ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? 'actionclient:' BEGIN actionclient+=ActionClient
	 */
	protected void emit_Node___PublishersKeyword_3_0_BEGINTerminalRuleCall_3_1_ENDTerminalRuleCall_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('serviceclient:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         ('subscribers:' BEGIN END)? 
	 *         ('serviceserver:' BEGIN END)? 
	 *         (ambiguity) 
	 *         ('actionserver:' BEGIN END)? 
	 *         ('actionclient:' BEGIN END)? 
	 *         'parameters:' 
	 *         BEGIN 
	 *         parameter+=Parameter
	 *     )
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         ('subscribers:' BEGIN END)? 
	 *         ('serviceserver:' BEGIN END)? 
	 *         (ambiguity) 
	 *         ('actionserver:' BEGIN END)? 
	 *         ('actionclient:' BEGIN END)? 
	 *         ('parameters:' BEGIN END)? 
	 *         END 
	 *         (rule end)
	 *     )
	 *     name=RosNames BEGIN ('publishers:' BEGIN END)? ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? (ambiguity) 'actionserver:' BEGIN actionserver+=ActionServer
	 *     name=RosNames BEGIN ('publishers:' BEGIN END)? ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? (ambiguity) ('actionserver:' BEGIN END)? 'actionclient:' BEGIN actionclient+=ActionClient
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? (ambiguity) 'actionserver:' BEGIN actionserver+=ActionServer
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? (ambiguity) ('actionserver:' BEGIN END)? 'actionclient:' BEGIN actionclient+=ActionClient
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? (ambiguity) ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? 'parameters:' BEGIN parameter+=Parameter
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? ('serviceserver:' BEGIN END)? (ambiguity) ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? ('parameters:' BEGIN END)? END (rule end)
	 *     serviceserver+=ServiceServer END (ambiguity) 'actionserver:' BEGIN actionserver+=ActionServer
	 *     serviceserver+=ServiceServer END (ambiguity) ('actionserver:' BEGIN END)? 'actionclient:' BEGIN actionclient+=ActionClient
	 *     serviceserver+=ServiceServer END (ambiguity) ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? 'parameters:' BEGIN parameter+=Parameter
	 *     serviceserver+=ServiceServer END (ambiguity) ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? ('parameters:' BEGIN END)? END (rule end)
	 *     subscriber+=Subscriber END ('serviceserver:' BEGIN END)? (ambiguity) 'actionserver:' BEGIN actionserver+=ActionServer
	 *     subscriber+=Subscriber END ('serviceserver:' BEGIN END)? (ambiguity) ('actionserver:' BEGIN END)? 'actionclient:' BEGIN actionclient+=ActionClient
	 *     subscriber+=Subscriber END ('serviceserver:' BEGIN END)? (ambiguity) ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? 'parameters:' BEGIN parameter+=Parameter
	 *     subscriber+=Subscriber END ('serviceserver:' BEGIN END)? (ambiguity) ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? ('parameters:' BEGIN END)? END (rule end)
	 */
	protected void emit_Node___ServiceclientKeyword_6_0_BEGINTerminalRuleCall_6_1_ENDTerminalRuleCall_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('serviceserver:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         ('subscribers:' BEGIN END)? 
	 *         (ambiguity) 
	 *         ('serviceclient:' BEGIN END)? 
	 *         ('actionserver:' BEGIN END)? 
	 *         ('actionclient:' BEGIN END)? 
	 *         'parameters:' 
	 *         BEGIN 
	 *         parameter+=Parameter
	 *     )
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         ('subscribers:' BEGIN END)? 
	 *         (ambiguity) 
	 *         ('serviceclient:' BEGIN END)? 
	 *         ('actionserver:' BEGIN END)? 
	 *         ('actionclient:' BEGIN END)? 
	 *         ('parameters:' BEGIN END)? 
	 *         END 
	 *         (rule end)
	 *     )
	 *     name=RosNames BEGIN ('publishers:' BEGIN END)? ('subscribers:' BEGIN END)? (ambiguity) 'serviceclient:' BEGIN serviceclient+=ServiceClient
	 *     name=RosNames BEGIN ('publishers:' BEGIN END)? ('subscribers:' BEGIN END)? (ambiguity) ('serviceclient:' BEGIN END)? 'actionserver:' BEGIN actionserver+=ActionServer
	 *     name=RosNames BEGIN ('publishers:' BEGIN END)? ('subscribers:' BEGIN END)? (ambiguity) ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? 'actionclient:' BEGIN actionclient+=ActionClient
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? (ambiguity) 'serviceclient:' BEGIN serviceclient+=ServiceClient
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? (ambiguity) ('serviceclient:' BEGIN END)? 'actionserver:' BEGIN actionserver+=ActionServer
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? (ambiguity) ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? 'actionclient:' BEGIN actionclient+=ActionClient
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? (ambiguity) ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? 'parameters:' BEGIN parameter+=Parameter
	 *     publisher+=Publisher END ('subscribers:' BEGIN END)? (ambiguity) ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? ('parameters:' BEGIN END)? END (rule end)
	 *     subscriber+=Subscriber END (ambiguity) 'serviceclient:' BEGIN serviceclient+=ServiceClient
	 *     subscriber+=Subscriber END (ambiguity) ('serviceclient:' BEGIN END)? 'actionserver:' BEGIN actionserver+=ActionServer
	 *     subscriber+=Subscriber END (ambiguity) ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? 'actionclient:' BEGIN actionclient+=ActionClient
	 *     subscriber+=Subscriber END (ambiguity) ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? 'parameters:' BEGIN parameter+=Parameter
	 *     subscriber+=Subscriber END (ambiguity) ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? ('parameters:' BEGIN END)? END (rule end)
	 */
	protected void emit_Node___ServiceserverKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('subscribers:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         (ambiguity) 
	 *         ('serviceserver:' BEGIN END)? 
	 *         ('serviceclient:' BEGIN END)? 
	 *         ('actionserver:' BEGIN END)? 
	 *         ('actionclient:' BEGIN END)? 
	 *         'parameters:' 
	 *         BEGIN 
	 *         parameter+=Parameter
	 *     )
	 *     (
	 *         name=RosNames 
	 *         BEGIN 
	 *         ('publishers:' BEGIN END)? 
	 *         (ambiguity) 
	 *         ('serviceserver:' BEGIN END)? 
	 *         ('serviceclient:' BEGIN END)? 
	 *         ('actionserver:' BEGIN END)? 
	 *         ('actionclient:' BEGIN END)? 
	 *         ('parameters:' BEGIN END)? 
	 *         END 
	 *         (rule end)
	 *     )
	 *     name=RosNames BEGIN ('publishers:' BEGIN END)? (ambiguity) 'serviceserver:' BEGIN serviceserver+=ServiceServer
	 *     name=RosNames BEGIN ('publishers:' BEGIN END)? (ambiguity) ('serviceserver:' BEGIN END)? 'serviceclient:' BEGIN serviceclient+=ServiceClient
	 *     name=RosNames BEGIN ('publishers:' BEGIN END)? (ambiguity) ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? 'actionserver:' BEGIN actionserver+=ActionServer
	 *     name=RosNames BEGIN ('publishers:' BEGIN END)? (ambiguity) ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? 'actionclient:' BEGIN actionclient+=ActionClient
	 *     publisher+=Publisher END (ambiguity) 'serviceserver:' BEGIN serviceserver+=ServiceServer
	 *     publisher+=Publisher END (ambiguity) ('serviceserver:' BEGIN END)? 'serviceclient:' BEGIN serviceclient+=ServiceClient
	 *     publisher+=Publisher END (ambiguity) ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? 'actionserver:' BEGIN actionserver+=ActionServer
	 *     publisher+=Publisher END (ambiguity) ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? 'actionclient:' BEGIN actionclient+=ActionClient
	 *     publisher+=Publisher END (ambiguity) ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? 'parameters:' BEGIN parameter+=Parameter
	 *     publisher+=Publisher END (ambiguity) ('serviceserver:' BEGIN END)? ('serviceclient:' BEGIN END)? ('actionserver:' BEGIN END)? ('actionclient:' BEGIN END)? ('parameters:' BEGIN END)? END (rule end)
	 */
	protected void emit_Node___SubscribersKeyword_4_0_BEGINTerminalRuleCall_4_1_ENDTerminalRuleCall_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('specs:' BEGIN END)?
	 *
	 * This ambiguous syntax occurs at:
	 *     fromGitRepo=EString (ambiguity) 'dependencies:' '[' dependency+=Dependency
	 *     fromGitRepo=EString (ambiguity) END (rule end)
	 *     name=RosNames ':' BEGIN (ambiguity) 'dependencies:' '[' dependency+=Dependency
	 *     name=RosNames ':' BEGIN (ambiguity) END (rule end)
	 */
	protected void emit_Package_Impl___SpecsKeyword_5_0_BEGINTerminalRuleCall_5_1_ENDTerminalRuleCall_5_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
