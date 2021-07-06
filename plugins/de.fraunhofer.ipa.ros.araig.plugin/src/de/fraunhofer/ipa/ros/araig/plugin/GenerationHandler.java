package de.fraunhofer.ipa.ros.araig.plugin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

import componentInterface.ComponentInterface;
import componentInterface.RosPublisher;
import de.fraunhofer.ipa.ros.araig.plugin.generator.CalculatorPyCodeGenerator;
import de.fraunhofer.ipa.ros.araig.plugin.generator.CustomOutputProvider;
import ros.Artifact;
import ros.Node;
import ros.Package;
import ros.PackageSet;
import ros.Publisher;
import ros.Subscriber;
import ros.TopicSpec;
import ros.impl.ArtifactImpl;
import ros.impl.NodeImpl;
import ros.impl.PackageImpl;
import ros.impl.PackageSetImpl;
import ros.impl.PublisherImpl;
import ros.impl.SubscriberImpl;
import ros.impl.TopicSpecImpl;
import rossystem.RosSystem;

public class GenerationHandler extends AbstractHandler implements IHandler {
	
	@Inject
	private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
	
	@Inject
	IResourceDescriptions resourceDescriptions;
	
	@Inject
	IResourceSetProvider resourceSetProvider;

	static Map<String, OutputConfiguration> getOutputConfigurationsAsMap(IOutputConfigurationProvider provider) {
		Map<String, OutputConfiguration> outputs = new HashMap<String, OutputConfiguration>();
		for(OutputConfiguration c: provider.getOutputConfigurations()) {
			outputs.put(c.getName(), c);
		}
		return outputs;
	}

	@SuppressWarnings("null")
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof IFile) {
			IFile file = (IFile) firstElement;
			IProject project = file.getProject();

			URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			ResourceSet rs = resourceSetProvider.get(project);
			Resource r = rs.getResource(uri, true);
				
			Display display = Display.getDefault();
			Shell shell = display.getActiveShell();

			RosSystem rossystem = (RosSystem)r.getContents().get(0);
			EList<ComponentInterface> roscomponents = rossystem.getRosComponent();
			List<EObject> RosInterfaces = new ArrayList<EObject>();
			for (int i=0; i<roscomponents.size(); i++) {
				List<EObject>  NewRosInterfaces = getInterfaces(roscomponents.get(i));
				for (int j= 0;j<NewRosInterfaces.size();j++) {
					RosInterfaces.add(NewRosInterfaces.get(j));
				}
			}
			// Step 1: set name for the Calculator
			InputDialog dialogInput = new InputDialog(shell,"Set name to the calculator", "Set name to the calculator", null, null);
			dialogInput.open();
			String CalculatorName = dialogInput.getValue();
			
			// Step 2: select publishers from the robot system to be subscribed
			ElementListSelectionDialog dialogSelect = new ElementListSelectionDialog(shell, new LabelProvider());
		
			String[] ListofInterfaces = new String[RosInterfaces.size()];
			for (int i=0; i<RosInterfaces.size(); i++) {
				ListofInterfaces[i]=(getViewMenuInterfaceName(RosInterfaces.get(i)));
			}
			dialogSelect.setElements(ListofInterfaces);
			dialogSelect.setTitle("Select the ROS interfaces to subscribe");
			dialogSelect.setMessage("!!! This features requires that the option: Project -> Build Automatilly is enable !!!");
			dialogSelect.setMultipleSelection(true);
			dialogSelect.open();
			List<Subscriber> CalculatorSubscribers = new ArrayList<Subscriber>();

			Object[] SelectedPublishersFromSystem = dialogSelect.getResult();
			for (Object result_: SelectedPublishersFromSystem) {
				for (EObject ResultInterface: RosInterfaces) {
					if((getViewMenuInterfaceName(ResultInterface)).equals(result_.toString())) {
						EObject SelectedInterface = ResultInterface;
						if (SelectedInterface.getClass().toString().contains("componentInterface.impl.RosPublisherImpl")) {
							Subscriber sub = new SubscriberImpl();
							sub.setName(((RosPublisher) SelectedInterface).getName());
							sub.setMessage(((RosPublisher)SelectedInterface).getPublisher().getMessage());
							CalculatorSubscribers.add(sub);
						}
			}}}
			
			//Step 3: select publishers from the runner
			ElementTreeSelectionDialog RunnerModelSelectionDialog = new ElementTreeSelectionDialog(shell, new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
			RunnerModelSelectionDialog.setTitle("Select the .ros model that defines the ARAIG test runner");
			RunnerModelSelectionDialog.setMessage("Select one element from the tree:");
			RunnerModelSelectionDialog.addFilter(new FileExtensionFilter("ros"));
			RunnerModelSelectionDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
			RunnerModelSelectionDialog.open();
			Object RunnerModel = RunnerModelSelectionDialog.getFirstResult();
			IFile RunnerModelFile = (IFile) RunnerModel;
			URI RunnerModelUri = URI.createPlatformResourceURI(RunnerModelFile.getFullPath().toString(), true);

			ResourceSet RunnerModelResourceSet = resourceSetProvider.get(project);
			Resource RunnerModelResource = RunnerModelResourceSet.getResource(RunnerModelUri, true);

			PackageSet RosModel = (PackageSet)RunnerModelResource.getContents().get(0);
			Node RosNode = RosModel.getPackage().get(0).getArtifact().get(0).getNode();
			List<Publisher> RosPublishers = RosNode.getPublisher();
			String[] ListofInterfacesRunner = new String[RosPublishers.size()];
			for (int i=0; i<RosPublishers.size(); i++) {
				ListofInterfacesRunner[i]=(RosPublishers.get(i).getName());
			}
			ElementListSelectionDialog dialogSelect2 = new ElementListSelectionDialog(shell, new LabelProvider());
			dialogSelect2.setElements(ListofInterfacesRunner);
			dialogSelect2.setTitle("Select the ROS interfaces from the runner to subscribe");
			dialogSelect2.setMessage("!!! This features requires that the option: Project -> Build Automatilly is enable !!!");
			dialogSelect2.setMultipleSelection(true);
			dialogSelect2.open();
			Object[] SelectedPublishersFromRunner = dialogSelect.getResult();
			for(Object pub:SelectedPublishersFromRunner) {
				for(Publisher publisher : RosPublishers) {
					if (publisher.getName() == pub.toString().replace("[Publisher]  ","")) {
						Subscriber sub = new SubscriberImpl();
						sub.setName(publisher.getName());
						sub.setMessage(publisher.getMessage());
						CalculatorSubscribers.add(sub);
					}
				}
			}
			
			//Step 4: configure outputs
			InputDialog dialogInputPublishers = new InputDialog(shell,"Add the list of outputs for the calculators", "Set the list with the names of the outputs separated by commas, i.e. 'FirstOut, SecondOut'", null, null);
			dialogInputPublishers.open();
			List<String> InputPublishersList = Arrays.asList(dialogInputPublishers.getValue().split(",", -1));
			List<Publisher> CalculatorPublishers = new ArrayList<Publisher>();
		
			String[] MessageTypes = {"Bool","Float64"};
			Package std_msgsPkg=new PackageImpl();
			std_msgsPkg.setName("std_msgs");
			
			TopicSpec message_bool = new TopicSpecImpl();
			message_bool.setName("Bool");
			message_bool.setPackage(std_msgsPkg);

			TopicSpec message_float = new TopicSpecImpl();
			message_float.setName("Float64");
			message_float.setPackage(std_msgsPkg);
			
			ElementListSelectionDialog dialogSelect3 = new ElementListSelectionDialog(shell, new LabelProvider());
			dialogSelect3.setElements(MessageTypes);

			for(String pub: InputPublishersList) {
				Publisher new_pub=new PublisherImpl();
				dialogSelect3.setTitle("Select type for the publisher "+pub);
				dialogSelect3.setMessage("Select type for the publisher "+pub);
				dialogSelect3.setMultipleSelection(false);
				dialogSelect3.open();
				new_pub.setName(pub.replace(" ", ""));
				if (dialogSelect3.getResult()[0] == "Bool") {
					new_pub.setMessage((TopicSpec)message_bool);
				} else if (dialogSelect3.getResult()[0] == "Float64"){
					new_pub.setMessage((TopicSpec)message_float);
				}
				CalculatorPublishers.add(new_pub);
			}
			String calculator_name = CalculatorName+"_calculator";
			String RelativePathTogenerationFolder = "src-gen/calculators/";
			String RelativePathToCalculatorModel = RelativePathTogenerationFolder+calculator_name+".ros";
			IFile CalculatorModelFile = project.getFile(RelativePathToCalculatorModel);
			
			// prepare the Xtext generation environment
			CalculatorPyCodeGenerator generator = new CalculatorPyCodeGenerator();
			final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
			fsa.setProject(project);
			fsa.setOutputConfigurations(getOutputConfigurationsAsMap(new CustomOutputProvider()));
			fsa.setMonitor(new NullProgressMonitor());
			GeneratorContext generatorContext = new GeneratorContext();
			if (!project.getFolder(RelativePathTogenerationFolder).exists()) {
				generator.createXtextGenerationFolder(fsa, generatorContext);
			}

			ResourceSet rs_result = new ResourceSetImpl();
			URI model_result_uri= URI.createPlatformResourceURI(CalculatorModelFile.getFullPath().toString(),true);
			Resource model_result= rs_result.createResource(model_result_uri);

			PackageSet CalculatorModelResult = new PackageSetImpl();
			Package resul_model_package = new PackageImpl();
			Artifact  result_model_artifact = new ArtifactImpl();
			Node result_model_node = new NodeImpl();
			
			result_model_node.setName(CalculatorName);
			result_model_artifact.setName(CalculatorName);
			resul_model_package.setName(project.getName());
			
			std_msgsPkg.getSpec().add(message_bool);
			std_msgsPkg.getSpec().add(message_float);

			save_model(model_result, CalculatorModelResult);
			CalculatorModelResult.getPackage().add(std_msgsPkg);
			save_model(model_result, CalculatorModelResult);

			for (Publisher pub: CalculatorPublishers) {
				result_model_node.getPublisher().add(pub);
			}
			for (Subscriber sub: CalculatorSubscribers) {
				result_model_node.getSubscriber().add(sub);
			}
			result_model_artifact.setNode(result_model_node);
			resul_model_package.getArtifact().add(result_model_artifact);
			CalculatorModelResult.getPackage().add(resul_model_package);
			save_model(model_result, CalculatorModelResult);

			// Call the python code generator
			ResourceSet rs2 = resourceSetProvider.get(project);
			Resource r2 = rs2.getResource(model_result_uri, true);
			generator.doGenerate(r2, fsa, generatorContext);
		}}
		return null;
	}

	private List<EObject> getInterfaces(ComponentInterface componentInterface_model) {
		List<EObject> ROSInterfaces = new ArrayList<EObject>();
		for (RosPublisher RosPub: componentInterface_model.getRospublisher()) {
			ROSInterfaces.add(RosPub);
		}
		return ROSInterfaces;
	}
	
	private String getInterfaceName(EObject RosInterface) {
		String name = RosInterface.toString().substring(RosInterface.toString().indexOf("name:")+6,RosInterface.toString().indexOf(","));
		return name;
	}
	private String getViewMenuInterfaceName(EObject RosInterface) {
		String name = "["+RosInterface.toString().substring(RosInterface.toString().indexOf("impl.Ros")+8,RosInterface.toString().indexOf("Impl@"))+"]  "+
				getInterfaceName(RosInterface);
		return name;
	}

	private void  save_model(Resource model_result, PackageSet CalculatorModelResult) {
		model_result.getContents().add(CalculatorModelResult);
		try {
			model_result.save(null);
			model_result.load(null);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	@Override
	  public boolean isEnabled() {
		return true;
	  }
	}

