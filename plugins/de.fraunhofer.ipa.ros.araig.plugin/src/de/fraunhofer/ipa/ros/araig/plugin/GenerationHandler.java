package de.fraunhofer.ipa.ros.araig.plugin;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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

import com.google.common.reflect.Parameter;
import com.google.inject.Inject;
import com.google.inject.Provider;

import componentInterface.ComponentInterface;
import componentInterface.RosParameter;
import componentInterface.RosPublisher;
import componentInterface.impl.RosParameterImpl;
import de.fraunhofer.ipa.ros.araig.plugin.generator.CalculatorLogic;
import de.fraunhofer.ipa.ros.araig.plugin.generator.CompareParam;
import de.fraunhofer.ipa.ros.araig.plugin.generator.ComparePoses;
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
import rossystem.impl.RosSystemImpl;

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
			create_calculator_ui(shell, RosInterfaces, project);

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
	
	private void create_calculator_ui(Shell shell, List<EObject> RosInterfaces, IProject project) {
		List<Subscriber> CalculatorSubscribers = new ArrayList<Subscriber>();		
		List<RosParameter> CalculatorParameters = new ArrayList<RosParameter>();	
		List<Publisher> CalculatorPublishers = new ArrayList<Publisher>();

		Map<String, TopicSpec> msg_map= new HashMap<String, TopicSpec>() {{
	        put("BoolStamped", new TopicSpecImpl());
	        put("Float64Stamped", new TopicSpecImpl());
	    }};
	    
	    // TODO: solve without it, it can't find araig_msgs
		create_msg_model(project, "araig_msgs", msg_map);
		
		// Step 1: set name for the Calculator
		InputDialog dialogInput = new InputDialog(shell,"Set name to the calculator", "Set name to the calculator", null, null);
		dialogInput.open();
		String CalculatorName = dialogInput.getValue();
		
		// Step 2: choose calculator logic 
		Map<String, CalculatorLogicType> LogicMap = new HashMap<String, CalculatorLogicType>() {{
			// name for ui, CalculatorLogic (logic class name, input numbers, output numbers)		
			put("Compare with a parameter", new CalculatorLogicType("compare_with_param", 2, 1));
	        put("Compare with two topics in PostStamped", new CalculatorLogicType("compare_with_topics_in_PostStamped", 2, 1));
	        put("Compare with two topics in BoolStamped", new CalculatorLogicType("compare_with_topics_in_BoolStamped", 2, 1));
	        put("Get temporal pose difference", new CalculatorLogicType("diff_pose_temporal", 3, 2));
	        put("Stop timer", new CalculatorLogicType("stop_timer", 2, 1));
	    }};

	    ElementListSelectionDialog dialogSelect2 = new ElementListSelectionDialog(shell, new LabelProvider());
		dialogSelect2.setElements(LogicMap.keySet().toArray());
		dialogSelect2.setTitle("Select the logic for the calculator");
		dialogSelect2.setMultipleSelection(false);
		dialogSelect2.open();
		CalculatorLogicType logic = LogicMap.get(dialogSelect2.getResult()[0]);
		
		// Step 3: choose inputs
		Map<String, Integer> InputSourceMap = new HashMap<String, Integer>() {{
	        put("robot system", 1);
	        put("sensors", 2);
	        put("exist calculators", 3);
	        put("parameter", 4);
		}};
			// for each input
		for (int n = 0; n < logic.get_input_num(); n++) {
			
			ElementListSelectionDialog dialogSelect3 = new ElementListSelectionDialog(shell, new LabelProvider());
			dialogSelect3.setElements(InputSourceMap.keySet().toArray());
			dialogSelect3.setTitle("Select a source of input");
			dialogSelect3.setMultipleSelection(false);
			dialogSelect3.open();	
			
			ElementListSelectionDialog dialogSelect = new ElementListSelectionDialog(shell, new LabelProvider());
			int source_case = InputSourceMap.get(dialogSelect3.getResult()[0]);
			
			// a topic of publisher in robot system
			if (source_case == 1) {
				String[] ListofInterfaces = new String[RosInterfaces.size()];
				for (int i=0; i<RosInterfaces.size(); i++) {
					ListofInterfaces[i]=(getViewMenuInterfaceName(RosInterfaces.get(i)));
				}
				dialogSelect.setElements(ListofInterfaces);
				dialogSelect.setTitle("Select the ROS interfaces to subscribe");
				dialogSelect.setMessage("!!! This features requires that the option: Project -> Build Automatilly is enable !!!");
				dialogSelect.setMultipleSelection(false);
				dialogSelect.open();

				Object PublisherFromSystem = dialogSelect.getResult()[0];
				for (EObject ResultInterface: RosInterfaces) {
					if((getViewMenuInterfaceName(ResultInterface)).equals(PublisherFromSystem.toString())) {
						EObject SelectedInterface = ResultInterface;
						if (SelectedInterface.getClass().toString().contains("componentInterface.impl.RosPublisherImpl")) {
							Subscriber sub = new SubscriberImpl();
							sub.setName(((RosPublisher) SelectedInterface).getName());
							sub.setMessage(((RosPublisher)SelectedInterface).getPublisher().getMessage());
							CalculatorSubscribers.add(sub);
							}
						}
					}
				}
			
			// a topic of publisher from sensor model or exist calculator model
			if (source_case == 2 || source_case == 3) {
				ElementTreeSelectionDialog TreeSelectionDialog = new ElementTreeSelectionDialog(shell, new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
				if (source_case == 2) {
					TreeSelectionDialog.setTitle("Select the .ros model of a sensor");
					}
				if (source_case == 3) {
					TreeSelectionDialog.setTitle("Select the .ros model of an exist calculator");
					}
				TreeSelectionDialog.setMessage("Select one element from the tree:");
				TreeSelectionDialog.addFilter(new FileExtensionFilter("ros"));
				TreeSelectionDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				TreeSelectionDialog.open();
				
				Object Model = TreeSelectionDialog.getFirstResult();
				IFile ModelFile = (IFile) Model;
				URI ModelUri = URI.createPlatformResourceURI(ModelFile.getFullPath().toString(), true);
				
				ResourceSet ModelResourceSet = resourceSetProvider.get(project);
				Resource ModelResource = ModelResourceSet.getResource(ModelUri, true);

				PackageSet RosModel = (PackageSet)ModelResource.getContents().get(0);
				Node RosNode = RosModel.getPackage().get(0).getArtifact().get(0).getNode();
				List<Publisher> RosPublishers = RosNode.getPublisher();
				String[] ListofInterfaces = new String[RosPublishers.size()];
				for (int i=0; i<RosPublishers.size(); i++) {
					ListofInterfaces[i]=(RosPublishers.get(i).getName());
				}
				
				dialogSelect.setElements(ListofInterfaces);
				dialogSelect.setTitle("Select the ROS interfaces to subscribe");
				dialogSelect.setMessage("!!! This features requires that the option: Project -> Build Automatilly is enable !!!");
				dialogSelect.setMultipleSelection(false);
				dialogSelect.open();
				Object SelectedPublisher = dialogSelect.getResult()[0];
					for(Publisher publisher : RosPublishers) {
						if (publisher.getName() == SelectedPublisher.toString().replace("[Publisher]  ","")) {
							Subscriber sub = new SubscriberImpl();
							sub.setName(publisher.getName());
							sub.setMessage(check_if_costume_msg(publisher.getMessage(), msg_map));
							CalculatorSubscribers.add(sub);
							}
						}
				}
			
			// parameter as a input
			// TODO: How to set value for a parameter
			if (source_case == 4) {
				InputDialog param_dialog = new InputDialog(shell,"Set name to the parameter", "Set name to the parameter", null, null);
				param_dialog.open();
				RosParameter param = new RosParameterImpl();
				param.setName(dialogInput.getValue());
				CalculatorParameters.add(param);
			}
			
		}
		
		//Step 4: configure outputs
		for (int n = 0; n < logic.get_output_num(); n++) {
		    ElementListSelectionDialog dialogSelectOutputmethod = new ElementListSelectionDialog(shell, new LabelProvider());
			Map<String, Integer> method = new HashMap<String, Integer>() {{
		        put("exsit topic from  subscribers of a model", 1);
		        put("create a new topic", 2);
			}};
		    dialogSelectOutputmethod.setElements(method.keySet().toArray());
		    dialogSelectOutputmethod.setTitle("Select the method to create a publisher");
		    dialogSelectOutputmethod.setMultipleSelection(false);
		    dialogSelectOutputmethod.open();
		    if (method.get(dialogSelectOutputmethod.getResult()[0]) == 1) {
				ElementTreeSelectionDialog TreeSelectionDialog = new ElementTreeSelectionDialog(shell, new WorkbenchLabelProvider(), new BaseWorkbenchContentProvider());
				TreeSelectionDialog.setTitle("Select the .ros model of runner or an exist calculator");
				TreeSelectionDialog.setMessage("Select one element from the tree:");
				TreeSelectionDialog.addFilter(new FileExtensionFilter("ros"));
				TreeSelectionDialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				TreeSelectionDialog.open();
				
				Object Model = TreeSelectionDialog.getFirstResult();
				IFile ModelFile = (IFile) Model;
				URI ModelUri = URI.createPlatformResourceURI(ModelFile.getFullPath().toString(), true);
				
				ResourceSet ModelResourceSet = resourceSetProvider.get(project);
				Resource ModelResource = ModelResourceSet.getResource(ModelUri, true);

				PackageSet RosModel = (PackageSet)ModelResource.getContents().get(0);
				Node RosNode = RosModel.getPackage().get(0).getArtifact().get(0).getNode();
				List<Subscriber> RosSubscribers = RosNode.getSubscriber();
				String[] ListofInterfaces = new String[RosSubscribers.size()];
				for (int i=0; i<RosSubscribers.size(); i++) {
					ListofInterfaces[i]=(RosSubscribers.get(i).getName());
				}
				
				ElementListSelectionDialog dialogSelect = new ElementListSelectionDialog(shell, new LabelProvider());
				dialogSelect.setElements(ListofInterfaces);
				dialogSelect.setTitle("Select the ROS interfaces to publsuher");
				dialogSelect.setMessage("!!! This features requires that the option: Project -> Build Automatilly is enable !!!");
				dialogSelect.setMultipleSelection(false);
				dialogSelect.open();
				Object SelectedSubscriber = dialogSelect.getResult()[0];
					for(Subscriber subscriber : RosSubscribers) {
						if (subscriber.getName() == SelectedSubscriber.toString().replace("[Publisher]  ","")) {
							Publisher new_pub = new PublisherImpl();
							new_pub.setName(subscriber.getName());
							new_pub.setMessage(check_if_costume_msg(subscriber.getMessage(), msg_map));
							CalculatorPublishers.add(new_pub);
							}
						}
			}
		    else {
		    	InputDialog dialogInputPublisher = new InputDialog(shell,
		    			"Add a publisher for the calculators", 
		    			"Set the name of the publisher", 
		    			null, null);
		    	dialogInputPublisher.open();
		    	String publisher_topic = dialogInputPublisher.getValue();
		    	
				//for multiple publishers
		    	//List<String> InputPublishersList = Arrays.asList(dialogInputPublishers.getValue().split(",", -1));
				//new_pub.setName(publisher_topic.replace(" ", ""));

				ElementListSelectionDialog dialogSelectTopicType = new ElementListSelectionDialog(shell, new LabelProvider());
				dialogSelectTopicType.setElements(msg_map.keySet().toArray());
				
				Publisher new_pub=new PublisherImpl();
				dialogSelectTopicType.setTitle("Select type for the publisher "+publisher_topic);
				dialogSelectTopicType.setMessage("Select type for the publisher "+publisher_topic);
				dialogSelectTopicType.setMultipleSelection(false);
				dialogSelectTopicType.open();
				new_pub.setName(publisher_topic);
				new_pub.setMessage(msg_map.get(dialogSelectTopicType.getResult()[0]));
				CalculatorPublishers.add(new_pub);
		    }
		}		
		CalculatorLogicFactory shapeFactory = new CalculatorLogicFactory();
		CalculatorLogic logic_class = shapeFactory.create(logic.get_class_name());
		create_calculator_model(project, CalculatorName, "calculator", CalculatorPublishers, CalculatorSubscribers, logic_class);		
	}
	
	private TopicSpec check_if_costume_msg(TopicSpec msg, Map<String,TopicSpec> costume_msg_map) {
		String msg_type = msg.getName();
		if (msg_type.equals("BoolStamped") || msg_type.equals("FloatStamped")) {
			return costume_msg_map.get(msg_type);
		}
		else {
			return msg;
		}
	}
	
	private void create_calculator_model(IProject project, 
			String node_name, 
			String node_type, 
			List<Publisher> publishers, 
			List<Subscriber> subscribers, 
			CalculatorLogic clazz,
			String parent_folder, 
			Boolean generate_code) {
		ResourceSet rs_result = new ResourceSetImpl();
		PackageSet ROSModelResult = new PackageSetImpl();
		Package result_model_package = new PackageImpl();
		result_model_package.setName(project.getName());
		Artifact  result_model_artifact = new ArtifactImpl();
		result_model_artifact.setName(node_name);
		Node result_model_node = new NodeImpl();
		result_model_node.setName(node_name);
		
		String RelativePathTogenerationFolder = String.join("/", parent_folder, node_type);
		String RelativePathToROSModel = String.join("/", RelativePathTogenerationFolder, node_name +".ros");
		IFile ROSModelFile = project.getFile(RelativePathToROSModel);
		URI ros_model_result_uri= URI.createPlatformResourceURI(ROSModelFile.getFullPath().toString(),true);
		Resource model_result= rs_result.createResource(ros_model_result_uri);
		
		for (Publisher pub: publishers) {
			result_model_node.getPublisher().add(pub);
		}
		for (Subscriber sub: subscribers) {
			result_model_node.getSubscriber().add(sub);
		}
		
		result_model_artifact.setNode(result_model_node);
		result_model_package.getArtifact().add(result_model_artifact);
		ROSModelResult.getPackage().add(result_model_package);
		
		save_model(model_result, ROSModelResult);
		
		// Call the python code generator
		if (generate_code) {
			call_generator(project, ros_model_result_uri, RelativePathTogenerationFolder, clazz);
		}
	}
	
	private void create_calculator_model(IProject project, 
			String node_name, 
			String node_type, 
			List<Publisher> publishers, 
			List<Subscriber> subscribers, 
			CalculatorLogic clazz) {
		create_calculator_model(project, node_name, node_type, publishers, subscribers, clazz, "src-gen", true);
	}

	private void create_msg_model(IProject project, String msg_pkg_name, Map<String, TopicSpec> msg_map) {
		ResourceSet rs_result = new ResourceSetImpl();
		PackageSet MsgModelResult = new PackageSetImpl();
		Package msg_model_package = new PackageImpl();
		msg_model_package.setName(msg_pkg_name);
				
		String RelativePathTogenerationFolder = "msgs/";
		String RelativePathToMsgModel = RelativePathTogenerationFolder+msg_pkg_name+".ros";
		IFile msgModelFile = project.getFile(RelativePathToMsgModel);
		URI msg_model_result_uri= URI.createPlatformResourceURI(msgModelFile.getFullPath().toString(),true);
		Resource msg_model_result= rs_result.createResource(msg_model_result_uri);
		
	    for (Map.Entry<String, TopicSpec> msg : msg_map.entrySet()) {
	    	msg.getValue().setName(msg.getKey());
	    	msg.getValue().setPackage(msg_model_package);
	    	msg_model_package.getSpec().add(msg.getValue());
	    }
	    
		MsgModelResult.getPackage().add(msg_model_package); 
		// without it, error:can#t find msg type
		save_model(msg_model_result, MsgModelResult);
	}
	
	private void call_generator(IProject project, URI ros_model_result_uri, String RelativePathTogenerationFolder, CalculatorLogic clazz) {		
		ResourceSet rs2 = resourceSetProvider.get(project);
		Resource r2 = rs2.getResource(ros_model_result_uri, true);
		
		final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
		fsa.setProject(project);
		fsa.setOutputConfigurations(getOutputConfigurationsAsMap(new CustomOutputProvider()));
		fsa.setMonitor(new NullProgressMonitor());
		GeneratorContext generatorContext = new GeneratorContext();
		if (!project.getFolder(RelativePathTogenerationFolder).exists()) {
			clazz.createXtextGenerationFolder(fsa, generatorContext);
		}
		
		clazz.doGenerate(r2, fsa, generatorContext);
	}
	
	@Override
	  public boolean isEnabled() {
		return true;
	  }
	
	private class CalculatorLogicType {
		    private String class_name; 
		    private int input_num;
		    private int output_num;
		    
		    public CalculatorLogicType(String class_name,int input_num,int output_num) {
		        super();
		        this.class_name = class_name;
		        this.input_num = input_num;
		        this.output_num = output_num;
		    }	
		    
		    public String get_class_name() {
		        return class_name;
		    }
		    public void set_class_name(String class_name) {
		        this.class_name = class_name;
		    }
		    public int get_input_num() {
		        return input_num;
		    }
		    public void set_input_num(int input_num) {
		        this.input_num = input_num;
		    }
		    public int get_output_num() {
		        return output_num;
		    }
		    public void set_output_num(int output_num) {
		        this.input_num = output_num;
		    }
	}
		
}
	
	final class CalculatorLogicFactory {
	
	    public <T extends CalculatorLogic> CalculatorLogic create(String clazz_name) {
	        CalculatorLogic toReturn = null;
	        if (clazz_name == "compare_with_param") {
	        	toReturn = new CompareParam();
	        }
	        else if (clazz_name == "compare_with_topics_in_PostStamped") {
	        	toReturn = new ComparePoses();
	        }
	        return toReturn;
	    }
	}
	

	