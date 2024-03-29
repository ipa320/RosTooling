/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.ros1.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.fraunhofer.ipa.ros1.ide.contentassist.antlr.internal.InternalRos1Parser;
import de.fraunhofer.ipa.ros1.services.Ros1GrammarAccess;
import java.util.Map;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.TokenSource;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class Ros1Parser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(Ros1GrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, Ros1GrammarAccess grammarAccess) {
			builder.put(grammarAccess.getPackage_ImplAccess().getAlternatives_6(), "rule__Package_Impl__Alternatives_6");
			builder.put(grammarAccess.getTopicSpecAccess().getNameAlternatives_1_0(), "rule__TopicSpec__NameAlternatives_1_0");
			builder.put(grammarAccess.getNodeAccess().getAlternatives_2(), "rule__Node__Alternatives_2");
			builder.put(grammarAccess.getDependencyAccess().getAlternatives(), "rule__Dependency__Alternatives");
			builder.put(grammarAccess.getNamespaceAccess().getAlternatives(), "rule__Namespace__Alternatives");
			builder.put(grammarAccess.getRosParamNamesAccess().getAlternatives(), "rule__RosParamNames__Alternatives");
			builder.put(grammarAccess.getParameterTypeAccess().getAlternatives(), "rule__ParameterType__Alternatives");
			builder.put(grammarAccess.getParameterValueAccess().getAlternatives(), "rule__ParameterValue__Alternatives");
			builder.put(grammarAccess.getMessagePartAccess().getDataAlternatives_1_0(), "rule__MessagePart__DataAlternatives_1_0");
			builder.put(grammarAccess.getAbstractTypeAccess().getAlternatives(), "rule__AbstractType__Alternatives");
			builder.put(grammarAccess.getKEYWORDAccess().getAlternatives(), "rule__KEYWORD__Alternatives");
			builder.put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
			builder.put(grammarAccess.getRosNamesAccess().getAlternatives(), "rule__RosNames__Alternatives");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup(), "rule__CatkinPackage__Group__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup_4(), "rule__CatkinPackage__Group_4__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup_5(), "rule__CatkinPackage__Group_5__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup_6(), "rule__CatkinPackage__Group_6__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getGroup_6_3(), "rule__CatkinPackage__Group_6_3__0");
			builder.put(grammarAccess.getPackageSetAccess().getGroup(), "rule__PackageSet__Group__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup(), "rule__Package_Impl__Group__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup_4(), "rule__Package_Impl__Group_4__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup_5(), "rule__Package_Impl__Group_5__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup_5_3(), "rule__Package_Impl__Group_5_3__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup_6_0(), "rule__Package_Impl__Group_6_0__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup_6_1(), "rule__Package_Impl__Group_6_1__0");
			builder.put(grammarAccess.getPackage_ImplAccess().getGroup_6_2(), "rule__Package_Impl__Group_6_2__0");
			builder.put(grammarAccess.getTopicSpecAccess().getGroup(), "rule__TopicSpec__Group__0");
			builder.put(grammarAccess.getTopicSpecAccess().getGroup_4(), "rule__TopicSpec__Group_4__0");
			builder.put(grammarAccess.getServiceSpecAccess().getGroup(), "rule__ServiceSpec__Group__0");
			builder.put(grammarAccess.getServiceSpecAccess().getGroup_4(), "rule__ServiceSpec__Group_4__0");
			builder.put(grammarAccess.getServiceSpecAccess().getGroup_6(), "rule__ServiceSpec__Group_6__0");
			builder.put(grammarAccess.getActionSpecAccess().getGroup(), "rule__ActionSpec__Group__0");
			builder.put(grammarAccess.getActionSpecAccess().getGroup_4(), "rule__ActionSpec__Group_4__0");
			builder.put(grammarAccess.getActionSpecAccess().getGroup_6(), "rule__ActionSpec__Group_6__0");
			builder.put(grammarAccess.getActionSpecAccess().getGroup_8(), "rule__ActionSpec__Group_8__0");
			builder.put(grammarAccess.getMessageDefinitionAccess().getGroup(), "rule__MessageDefinition__Group__0");
			builder.put(grammarAccess.getArtifactAccess().getGroup(), "rule__Artifact__Group__0");
			builder.put(grammarAccess.getNodeAccess().getGroup(), "rule__Node__Group__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_2_0(), "rule__Node__Group_2_0__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_2_1(), "rule__Node__Group_2_1__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_2_2(), "rule__Node__Group_2_2__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_2_3(), "rule__Node__Group_2_3__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_2_4(), "rule__Node__Group_2_4__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_2_5(), "rule__Node__Group_2_5__0");
			builder.put(grammarAccess.getNodeAccess().getGroup_2_6(), "rule__Node__Group_2_6__0");
			builder.put(grammarAccess.getPublisherAccess().getGroup(), "rule__Publisher__Group__0");
			builder.put(grammarAccess.getPublisherAccess().getGroup_6(), "rule__Publisher__Group_6__0");
			builder.put(grammarAccess.getSubscriberAccess().getGroup(), "rule__Subscriber__Group__0");
			builder.put(grammarAccess.getSubscriberAccess().getGroup_6(), "rule__Subscriber__Group_6__0");
			builder.put(grammarAccess.getServiceServerAccess().getGroup(), "rule__ServiceServer__Group__0");
			builder.put(grammarAccess.getServiceServerAccess().getGroup_6(), "rule__ServiceServer__Group_6__0");
			builder.put(grammarAccess.getServiceClientAccess().getGroup(), "rule__ServiceClient__Group__0");
			builder.put(grammarAccess.getServiceClientAccess().getGroup_6(), "rule__ServiceClient__Group_6__0");
			builder.put(grammarAccess.getActionServerAccess().getGroup(), "rule__ActionServer__Group__0");
			builder.put(grammarAccess.getActionServerAccess().getGroup_6(), "rule__ActionServer__Group_6__0");
			builder.put(grammarAccess.getActionClientAccess().getGroup(), "rule__ActionClient__Group__0");
			builder.put(grammarAccess.getActionClientAccess().getGroup_6(), "rule__ActionClient__Group_6__0");
			builder.put(grammarAccess.getExternalDependencyAccess().getGroup(), "rule__ExternalDependency__Group__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup(), "rule__GlobalNamespace__Group__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup_2(), "rule__GlobalNamespace__Group_2__0");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getGroup_2_2(), "rule__GlobalNamespace__Group_2_2__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup(), "rule__RelativeNamespace_Impl__Group__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2(), "rule__RelativeNamespace_Impl__Group_2__0");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getGroup_2_2(), "rule__RelativeNamespace_Impl__Group_2_2__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup(), "rule__PrivateNamespace__Group__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup_2(), "rule__PrivateNamespace__Group_2__0");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getGroup_2_2(), "rule__PrivateNamespace__Group_2_2__0");
			builder.put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_4(), "rule__Parameter__Group_4__0");
			builder.put(grammarAccess.getParameterAccess().getGroup_7(), "rule__Parameter__Group_7__0");
			builder.put(grammarAccess.getParameterListTypeAccess().getGroup(), "rule__ParameterListType__Group__0");
			builder.put(grammarAccess.getParameterListTypeAccess().getGroup_4(), "rule__ParameterListType__Group_4__0");
			builder.put(grammarAccess.getParameterStructTypeAccess().getGroup(), "rule__ParameterStructType__Group__0");
			builder.put(grammarAccess.getParameterStructTypeAccess().getGroup_4(), "rule__ParameterStructType__Group_4__0");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getGroup(), "rule__ParameterIntegerType__Group__0");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getGroup_2(), "rule__ParameterIntegerType__Group_2__0");
			builder.put(grammarAccess.getParameterStringTypeAccess().getGroup(), "rule__ParameterStringType__Group__0");
			builder.put(grammarAccess.getParameterStringTypeAccess().getGroup_2(), "rule__ParameterStringType__Group_2__0");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getGroup(), "rule__ParameterDoubleType__Group__0");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getGroup_2(), "rule__ParameterDoubleType__Group_2__0");
			builder.put(grammarAccess.getParameterDateTypeAccess().getGroup(), "rule__ParameterDateType__Group__0");
			builder.put(grammarAccess.getParameterDateTypeAccess().getGroup_2(), "rule__ParameterDateType__Group_2__0");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getGroup(), "rule__ParameterBooleanType__Group__0");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getGroup_2(), "rule__ParameterBooleanType__Group_2__0");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getGroup(), "rule__ParameterBase64Type__Group__0");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getGroup_2(), "rule__ParameterBase64Type__Group_2__0");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getGroup(), "rule__ParameterAnyType__Group__0");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getGroup_2(), "rule__ParameterAnyType__Group_2__0");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getGroup(), "rule__ParameterArrayType__Group__0");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getGroup_4(), "rule__ParameterArrayType__Group_4__0");
			builder.put(grammarAccess.getParameterListAccess().getGroup(), "rule__ParameterList__Group__0");
			builder.put(grammarAccess.getParameterListAccess().getGroup_3(), "rule__ParameterList__Group_3__0");
			builder.put(grammarAccess.getParameterAnyAccess().getGroup(), "rule__ParameterAny__Group__0");
			builder.put(grammarAccess.getParameterAnyAccess().getGroup_2(), "rule__ParameterAny__Group_2__0");
			builder.put(grammarAccess.getParameterStructAccess().getGroup(), "rule__ParameterStruct__Group__0");
			builder.put(grammarAccess.getParameterStructAccess().getGroup_1(), "rule__ParameterStruct__Group_1__0");
			builder.put(grammarAccess.getParameterStructMemberAccess().getGroup(), "rule__ParameterStructMember__Group__0");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getGroup(), "rule__ParameterStructTypeMember__Group__0");
			builder.put(grammarAccess.getMessagePartAccess().getGroup(), "rule__MessagePart__Group__0");
			builder.put(grammarAccess.getBoolAccess().getGroup(), "rule__Bool__Group__0");
			builder.put(grammarAccess.getInt8Access().getGroup(), "rule__Int8__Group__0");
			builder.put(grammarAccess.getUint8Access().getGroup(), "rule__Uint8__Group__0");
			builder.put(grammarAccess.getInt16Access().getGroup(), "rule__Int16__Group__0");
			builder.put(grammarAccess.getUint16Access().getGroup(), "rule__Uint16__Group__0");
			builder.put(grammarAccess.getInt32Access().getGroup(), "rule__Int32__Group__0");
			builder.put(grammarAccess.getUint32Access().getGroup(), "rule__Uint32__Group__0");
			builder.put(grammarAccess.getInt64Access().getGroup(), "rule__Int64__Group__0");
			builder.put(grammarAccess.getUint64Access().getGroup(), "rule__Uint64__Group__0");
			builder.put(grammarAccess.getFloat32Access().getGroup(), "rule__Float32__Group__0");
			builder.put(grammarAccess.getFloat64Access().getGroup(), "rule__Float64__Group__0");
			builder.put(grammarAccess.getString0Access().getGroup(), "rule__String0__Group__0");
			builder.put(grammarAccess.getCharAccess().getGroup(), "rule__Char__Group__0");
			builder.put(grammarAccess.getByteAccess().getGroup(), "rule__Byte__Group__0");
			builder.put(grammarAccess.getTimeAccess().getGroup(), "rule__Time__Group__0");
			builder.put(grammarAccess.getDurationAccess().getGroup(), "rule__Duration__Group__0");
			builder.put(grammarAccess.getBoolArrayAccess().getGroup(), "rule__BoolArray__Group__0");
			builder.put(grammarAccess.getInt8ArrayAccess().getGroup(), "rule__Int8Array__Group__0");
			builder.put(grammarAccess.getUint8ArrayAccess().getGroup(), "rule__Uint8Array__Group__0");
			builder.put(grammarAccess.getInt16ArrayAccess().getGroup(), "rule__Int16Array__Group__0");
			builder.put(grammarAccess.getUint16ArrayAccess().getGroup(), "rule__Uint16Array__Group__0");
			builder.put(grammarAccess.getInt32ArrayAccess().getGroup(), "rule__Int32Array__Group__0");
			builder.put(grammarAccess.getUint32ArrayAccess().getGroup(), "rule__Uint32Array__Group__0");
			builder.put(grammarAccess.getInt64ArrayAccess().getGroup(), "rule__Int64Array__Group__0");
			builder.put(grammarAccess.getUint64ArrayAccess().getGroup(), "rule__Uint64Array__Group__0");
			builder.put(grammarAccess.getFloat32ArrayAccess().getGroup(), "rule__Float32Array__Group__0");
			builder.put(grammarAccess.getFloat64ArrayAccess().getGroup(), "rule__Float64Array__Group__0");
			builder.put(grammarAccess.getString0ArrayAccess().getGroup(), "rule__String0Array__Group__0");
			builder.put(grammarAccess.getByteArrayAccess().getGroup(), "rule__ByteArray__Group__0");
			builder.put(grammarAccess.getCharArrayAccess().getGroup(), "rule__CharArray__Group__0");
			builder.put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
			builder.put(grammarAccess.getArraySpecRefAccess().getGroup(), "rule__ArraySpecRef__Group__0");
			builder.put(grammarAccess.getCatkinPackageAccess().getNameAssignment_1(), "rule__CatkinPackage__NameAssignment_1");
			builder.put(grammarAccess.getCatkinPackageAccess().getFromGitRepoAssignment_4_1(), "rule__CatkinPackage__FromGitRepoAssignment_4_1");
			builder.put(grammarAccess.getCatkinPackageAccess().getArtifactAssignment_5_2(), "rule__CatkinPackage__ArtifactAssignment_5_2");
			builder.put(grammarAccess.getCatkinPackageAccess().getDependencyAssignment_6_2(), "rule__CatkinPackage__DependencyAssignment_6_2");
			builder.put(grammarAccess.getCatkinPackageAccess().getDependencyAssignment_6_3_1(), "rule__CatkinPackage__DependencyAssignment_6_3_1");
			builder.put(grammarAccess.getPackageSetAccess().getPackageAssignment_1(), "rule__PackageSet__PackageAssignment_1");
			builder.put(grammarAccess.getPackage_ImplAccess().getNameAssignment_1(), "rule__Package_Impl__NameAssignment_1");
			builder.put(grammarAccess.getPackage_ImplAccess().getFromGitRepoAssignment_4_1(), "rule__Package_Impl__FromGitRepoAssignment_4_1");
			builder.put(grammarAccess.getPackage_ImplAccess().getDependencyAssignment_5_2(), "rule__Package_Impl__DependencyAssignment_5_2");
			builder.put(grammarAccess.getPackage_ImplAccess().getDependencyAssignment_5_3_1(), "rule__Package_Impl__DependencyAssignment_5_3_1");
			builder.put(grammarAccess.getPackage_ImplAccess().getSpecAssignment_6_0_2(), "rule__Package_Impl__SpecAssignment_6_0_2");
			builder.put(grammarAccess.getPackage_ImplAccess().getSpecAssignment_6_1_2(), "rule__Package_Impl__SpecAssignment_6_1_2");
			builder.put(grammarAccess.getPackage_ImplAccess().getSpecAssignment_6_2_2(), "rule__Package_Impl__SpecAssignment_6_2_2");
			builder.put(grammarAccess.getTopicSpecAccess().getNameAssignment_1(), "rule__TopicSpec__NameAssignment_1");
			builder.put(grammarAccess.getTopicSpecAccess().getMessageAssignment_4_1(), "rule__TopicSpec__MessageAssignment_4_1");
			builder.put(grammarAccess.getServiceSpecAccess().getNameAssignment_1(), "rule__ServiceSpec__NameAssignment_1");
			builder.put(grammarAccess.getServiceSpecAccess().getRequestAssignment_4_1(), "rule__ServiceSpec__RequestAssignment_4_1");
			builder.put(grammarAccess.getServiceSpecAccess().getResponseAssignment_6_1(), "rule__ServiceSpec__ResponseAssignment_6_1");
			builder.put(grammarAccess.getActionSpecAccess().getNameAssignment_1(), "rule__ActionSpec__NameAssignment_1");
			builder.put(grammarAccess.getActionSpecAccess().getGoalAssignment_4_1(), "rule__ActionSpec__GoalAssignment_4_1");
			builder.put(grammarAccess.getActionSpecAccess().getResultAssignment_6_1(), "rule__ActionSpec__ResultAssignment_6_1");
			builder.put(grammarAccess.getActionSpecAccess().getFeedbackAssignment_8_1(), "rule__ActionSpec__FeedbackAssignment_8_1");
			builder.put(grammarAccess.getMessageDefinitionAccess().getMessagePartAssignment_1(), "rule__MessageDefinition__MessagePartAssignment_1");
			builder.put(grammarAccess.getArtifactAccess().getNameAssignment_1(), "rule__Artifact__NameAssignment_1");
			builder.put(grammarAccess.getArtifactAccess().getNodeAssignment_4(), "rule__Artifact__NodeAssignment_4");
			builder.put(grammarAccess.getNodeAccess().getNameAssignment_1(), "rule__Node__NameAssignment_1");
			builder.put(grammarAccess.getNodeAccess().getPublisherAssignment_2_0_2(), "rule__Node__PublisherAssignment_2_0_2");
			builder.put(grammarAccess.getNodeAccess().getSubscriberAssignment_2_1_2(), "rule__Node__SubscriberAssignment_2_1_2");
			builder.put(grammarAccess.getNodeAccess().getServiceserverAssignment_2_2_2(), "rule__Node__ServiceserverAssignment_2_2_2");
			builder.put(grammarAccess.getNodeAccess().getServiceclientAssignment_2_3_2(), "rule__Node__ServiceclientAssignment_2_3_2");
			builder.put(grammarAccess.getNodeAccess().getActionserverAssignment_2_4_2(), "rule__Node__ActionserverAssignment_2_4_2");
			builder.put(grammarAccess.getNodeAccess().getActionclientAssignment_2_5_2(), "rule__Node__ActionclientAssignment_2_5_2");
			builder.put(grammarAccess.getNodeAccess().getParameterAssignment_2_6_2(), "rule__Node__ParameterAssignment_2_6_2");
			builder.put(grammarAccess.getPublisherAccess().getNameAssignment_1(), "rule__Publisher__NameAssignment_1");
			builder.put(grammarAccess.getPublisherAccess().getMessageAssignment_5(), "rule__Publisher__MessageAssignment_5");
			builder.put(grammarAccess.getPublisherAccess().getNamespaceAssignment_6_1(), "rule__Publisher__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getSubscriberAccess().getNameAssignment_1(), "rule__Subscriber__NameAssignment_1");
			builder.put(grammarAccess.getSubscriberAccess().getMessageAssignment_5(), "rule__Subscriber__MessageAssignment_5");
			builder.put(grammarAccess.getSubscriberAccess().getNamespaceAssignment_6_1(), "rule__Subscriber__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getServiceServerAccess().getNameAssignment_1(), "rule__ServiceServer__NameAssignment_1");
			builder.put(grammarAccess.getServiceServerAccess().getServiceAssignment_5(), "rule__ServiceServer__ServiceAssignment_5");
			builder.put(grammarAccess.getServiceServerAccess().getNamespaceAssignment_6_1(), "rule__ServiceServer__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getServiceClientAccess().getNameAssignment_1(), "rule__ServiceClient__NameAssignment_1");
			builder.put(grammarAccess.getServiceClientAccess().getServiceAssignment_5(), "rule__ServiceClient__ServiceAssignment_5");
			builder.put(grammarAccess.getServiceClientAccess().getNamespaceAssignment_6_1(), "rule__ServiceClient__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getActionServerAccess().getNameAssignment_1(), "rule__ActionServer__NameAssignment_1");
			builder.put(grammarAccess.getActionServerAccess().getActionAssignment_5(), "rule__ActionServer__ActionAssignment_5");
			builder.put(grammarAccess.getActionServerAccess().getNamespaceAssignment_6_1(), "rule__ActionServer__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getActionClientAccess().getNameAssignment_1(), "rule__ActionClient__NameAssignment_1");
			builder.put(grammarAccess.getActionClientAccess().getActionAssignment_5(), "rule__ActionClient__ActionAssignment_5");
			builder.put(grammarAccess.getActionClientAccess().getNamespaceAssignment_6_1(), "rule__ActionClient__NamespaceAssignment_6_1");
			builder.put(grammarAccess.getPackageDependencyAccess().getPackageAssignment(), "rule__PackageDependency__PackageAssignment");
			builder.put(grammarAccess.getExternalDependencyAccess().getNameAssignment_2(), "rule__ExternalDependency__NameAssignment_2");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_1(), "rule__GlobalNamespace__PartsAssignment_2_1");
			builder.put(grammarAccess.getGlobalNamespaceAccess().getPartsAssignment_2_2_1(), "rule__GlobalNamespace__PartsAssignment_2_2_1");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_1(), "rule__RelativeNamespace_Impl__PartsAssignment_2_1");
			builder.put(grammarAccess.getRelativeNamespace_ImplAccess().getPartsAssignment_2_2_1(), "rule__RelativeNamespace_Impl__PartsAssignment_2_2_1");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_1(), "rule__PrivateNamespace__PartsAssignment_2_1");
			builder.put(grammarAccess.getPrivateNamespaceAccess().getPartsAssignment_2_2_1(), "rule__PrivateNamespace__PartsAssignment_2_2_1");
			builder.put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getNamespaceAssignment_4_1(), "rule__Parameter__NamespaceAssignment_4_1");
			builder.put(grammarAccess.getParameterAccess().getTypeAssignment_6(), "rule__Parameter__TypeAssignment_6");
			builder.put(grammarAccess.getParameterAccess().getValueAssignment_7_1(), "rule__Parameter__ValueAssignment_7_1");
			builder.put(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_3(), "rule__ParameterListType__SequenceAssignment_3");
			builder.put(grammarAccess.getParameterListTypeAccess().getSequenceAssignment_4_1(), "rule__ParameterListType__SequenceAssignment_4_1");
			builder.put(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_3(), "rule__ParameterStructType__ParameterstructypetmemberAssignment_3");
			builder.put(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberAssignment_4_1(), "rule__ParameterStructType__ParameterstructypetmemberAssignment_4_1");
			builder.put(grammarAccess.getParameterIntegerTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterIntegerType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterStringTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterStringType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterDoubleTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterDoubleType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterDateTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterDateType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterBooleanTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterBooleanType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterBase64TypeAccess().getDefaultAssignment_2_1(), "rule__ParameterBase64Type__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterAnyTypeAccess().getDefaultAssignment_2_1(), "rule__ParameterAnyType__DefaultAssignment_2_1");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getTypeAssignment_2(), "rule__ParameterArrayType__TypeAssignment_2");
			builder.put(grammarAccess.getParameterArrayTypeAccess().getDefaultAssignment_4_1(), "rule__ParameterArrayType__DefaultAssignment_4_1");
			builder.put(grammarAccess.getParameterListAccess().getValueAssignment_2(), "rule__ParameterList__ValueAssignment_2");
			builder.put(grammarAccess.getParameterListAccess().getValueAssignment_3_1(), "rule__ParameterList__ValueAssignment_3_1");
			builder.put(grammarAccess.getParameterAnyAccess().getValueAssignment_2_1(), "rule__ParameterAny__ValueAssignment_2_1");
			builder.put(grammarAccess.getParameterStringAccess().getValueAssignment(), "rule__ParameterString__ValueAssignment");
			builder.put(grammarAccess.getParameterBase64Access().getValueAssignment(), "rule__ParameterBase64__ValueAssignment");
			builder.put(grammarAccess.getParameterIntegerAccess().getValueAssignment(), "rule__ParameterInteger__ValueAssignment");
			builder.put(grammarAccess.getParameterDoubleAccess().getValueAssignment(), "rule__ParameterDouble__ValueAssignment");
			builder.put(grammarAccess.getParameterBooleanAccess().getValueAssignment(), "rule__ParameterBoolean__ValueAssignment");
			builder.put(grammarAccess.getParameterStructAccess().getValueAssignment_1_2(), "rule__ParameterStruct__ValueAssignment_1_2");
			builder.put(grammarAccess.getParameterDateAccess().getValueAssignment(), "rule__ParameterDate__ValueAssignment");
			builder.put(grammarAccess.getParameterStructMemberAccess().getNameAssignment_0(), "rule__ParameterStructMember__NameAssignment_0");
			builder.put(grammarAccess.getParameterStructMemberAccess().getValueAssignment_2(), "rule__ParameterStructMember__ValueAssignment_2");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getNameAssignment_0(), "rule__ParameterStructTypeMember__NameAssignment_0");
			builder.put(grammarAccess.getParameterStructTypeMemberAccess().getTypeAssignment_1(), "rule__ParameterStructTypeMember__TypeAssignment_1");
			builder.put(grammarAccess.getMessagePartAccess().getTypeAssignment_0(), "rule__MessagePart__TypeAssignment_0");
			builder.put(grammarAccess.getMessagePartAccess().getDataAssignment_1(), "rule__MessagePart__DataAssignment_1");
			builder.put(grammarAccess.getSpecBaseRefAccess().getReferenceAssignment(), "rule__SpecBaseRef__ReferenceAssignment");
			builder.put(grammarAccess.getArraySpecRefAccess().getReferenceAssignment_0(), "rule__ArraySpecRef__ReferenceAssignment_0");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private Ros1GrammarAccess grammarAccess;

	@Override
	protected InternalRos1Parser createParser() {
		InternalRos1Parser result = new InternalRos1Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected TokenSource createLexer(CharStream stream) {
		return new Ros1TokenSource(super.createLexer(stream));
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Ros1GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Ros1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
