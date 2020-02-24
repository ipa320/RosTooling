package rossystem.model.combination;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import rossystem.TopicConnection;
import rossystem.impl.RosSystemImpl;
import rossystem.ServiceConnection;
import rossystem.ActionConnection;
import rossystem.RosSystem;
import rossystem.RossystemFactory;
import rossystem.RossystemPackage;
import componentInterface.ComponentInterface;
import componentInterface.RosActionClient;
import componentInterface.RosActionServer;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import componentInterface.impl.ComponentInterfaceImpl;
import componentInterface.impl.RosPublisherImpl;
import componentInterface.impl.RosPublisherImpl;
import ros.ActionClient;
import ros.ActionServer;
import ros.Artifact;
import ros.Node;
import ros.Package;
import ros.PackageSet;
import ros.Publisher;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CombineModelsWizard extends Wizard implements INewWizard {

	protected SelectinputFile getInputFileCreationPage;
	//protected RossystemPackage rossystemPackage = RossystemPackage.eINSTANCE;
	//protected RossystemFactory rossystemFactory = rossystemPackage.getRossystemFactory();

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Combine System Models");
	}

	public void addComponentAndSave(RosSystem RosSystemResult, ComponentInterface component, Resource resource_result2) {
		RosSystemResult.getRosComponent().add(component);
		resource_result2.getContents().add(RosSystemResult);
		try {
			resource_result2.save(null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	public RosPublisher NewPub(RosPublisher pub) {
		RosPublisher ros_pub = new RosPublisherImpl();
		ros_pub.setName(pub.getName());
		ros_pub.setNs(pub.getNs());
		ros_pub.setPublisher(pub.getPublisher());
		return ros_pub;
	}
		
	@Override
	public boolean performFinish() {
		try {
			IFile InputFile = getInputFileCreationPage.getInputFile();
			String RelativePath = InputFile.getProject().getName()+"/"+InputFile.getProjectRelativePath();
			ResourceSet rs_input = new ResourceSetImpl();
			Resource resource_input = rs_input.getResource(URI.createPlatformResourceURI(RelativePath,true),true);			
			RosSystem RosSystemInput = (RosSystem) resource_input.getContents().get(0);
			EList<ComponentInterface> components_input = (EList<ComponentInterface>) RosSystemInput.getRosComponent();

			final IFile InputFile2 = getInputFileCreationPage.getSpecFile();
			String InputFile2RelativePath = InputFile2.getProject().getName()+"/"+InputFile2.getProjectRelativePath();
			ResourceSet rs_spec = new ResourceSetImpl();
			Resource resource_input2 = rs_spec.getResource(URI.createPlatformResourceURI(InputFile2RelativePath,true),true);
			RosSystem RosSystemInput2 = (RosSystem) resource_input2.getContents().get(0);
			EList<ComponentInterface> components_input2 = (EList<ComponentInterface>) RosSystemInput2.getRosComponent();

			
			final IFile modelFile = getInputFileCreationPage.getResultFile();

			ArrayList<String> Report = new ArrayList<>();
			
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) throws InvocationTargetException, InterruptedException {
						try {

							ResourceSet resourceSet = new ResourceSetImpl();
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
							Resource resource_result = resourceSet.createResource(fileURI);
							StringBuilder model_output = new StringBuilder();
							resource_result.getContents().clear();
							model_output.append("RosSystem { Name 'result' }");
							byte[] bytes = model_output.toString().getBytes();
							InputStream source = new ByteArrayInputStream(bytes);
							try {
								modelFile.create(source, IResource.FILE, null);
							} catch (CoreException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
							String ResultFileRelativePath = modelFile.getProject().getName()+"/"+modelFile.getProjectRelativePath();
							ResourceSet rs_result = new ResourceSetImpl();
							Resource resource_result2= rs_result.getResource(URI.createPlatformResourceURI(ResultFileRelativePath,true),true);
							RosSystem RosSystemResult = (RosSystem) resource_result2.getContents().get(0);

							boolean component_found;
							for(int i = 0; i < components_input2.size(); i++) {
								ComponentInterface comp2 = components_input2.get(i);
								component_found=false;
								for (int j = 0; j < components_input.size(); j++) {
									ComponentInterface comp = components_input.get(j);
									if (comp2.getName().contains(comp.getName())) {component_found=true;}}
									if (!component_found) {
										addComponentAndSave(RosSystemResult,comp2,resource_result2);
									}
							}

							for (int i = 0; i < components_input.size(); i++) {
								ComponentInterface comp = components_input.get(i);
								component_found=false;
								for (int j = 0; j < components_input2.size(); j++) {
									ComponentInterface comp2 = components_input2.get(j);
									if (comp2.getName().contains(comp.getName())) {
										component_found = true;
										addComponentAndSave(RosSystemResult,computeInterfaces(comp, comp2),resource_result2);
								}}
								if (!component_found) {
									addComponentAndSave(RosSystemResult,comp,resource_result2);
								}
						}

						try {
							resource_result2.save(null);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}}

						finally {
							// create a dialog with ok and cancel buttons and a question icon
							MessageBox dialog;
							String message ="Combine the file:\n "+ InputFile2.getName() + "\nwith the model:\n"+ InputFile.getName()+"\n";
							if (!Report.isEmpty()) {
								dialog = new MessageBox(getShell(), SWT.ICON_ERROR | SWT.OK);
								for (String s:Report) {
									//message+=s+"\n";
									System.out.println(s);
								}
							} else {
								dialog = new MessageBox(getShell(), SWT.ICON_WORKING | SWT.OK);
							}

							dialog.setText("Report");
							dialog.setMessage(message);
							// open dialog and await user selection
							dialog.open();
		}}};
			getContainer().run(false, false, operation);
			return true;
		}catch (Exception exception) {
			return false;
		} }

	public ComponentInterface computeInterfaces (ComponentInterface comp, ComponentInterface comp2) {
		ComponentInterface component_ = new ComponentInterfaceImpl();
		component_.setName(comp.getName());
		component_.setNameSpace(comp.getNameSpace());

		EList <RosPublisher> pubs_input = (EList<RosPublisher>) comp.getRospublisher();
		EList <RosSubscriber> subs_input = (EList<RosSubscriber>) comp.getRossubscriber();
		EList <RosServiceClient> scls_input = (EList<RosServiceClient>) comp.getRosserviceclient();
		EList <RosServiceServer> ssrs_input = (EList<RosServiceServer>) comp.getRosserviceserver();
		EList <RosActionClient> acls_input = (EList<RosActionClient>) comp.getRosactionclient();
		EList <RosActionServer> asrs_input = (EList<RosActionServer>) comp.getRosactionserver();

		EList <RosPublisher> pubs_input2 = (EList<RosPublisher>) comp2.getRospublisher();
		EList <RosSubscriber> subs_input2 = (EList<RosSubscriber>) comp2.getRossubscriber();
		EList <RosServiceClient> scls_input2 = (EList<RosServiceClient>) comp2.getRosserviceclient();
		EList <RosServiceServer> ssrs_input2 = (EList<RosServiceServer>) comp2.getRosserviceserver();
		EList <RosActionClient> acls_input2 = (EList<RosActionClient>) comp2.getRosactionclient();
		EList <RosActionServer> asrs_input2 = (EList<RosActionServer>) comp2.getRosactionserver();
		
		for(RosPublisher pub:pubs_input2) {
			boolean pub_found = false;
			for (RosPublisher pub_i:pubs_input) {
				if (pub_i.getName().equals(pub.getName())){
					pub_found=true;
					component_.getRospublisher().add(NewPub(pub_i));
			}}
			if (!pub_found) {
				component_.getRospublisher().add(NewPub(pub));													
			}
		}
		for(RosPublisher pub:pubs_input) {
			boolean pub_found = false;
			for (RosPublisher pub_i:pubs_input2) {
				if (pub_i.getName().equals(pub.getName())){
					pub_found=true;
			}}
			if (!pub_found) {
				component_.getRospublisher().add(NewPub(pub));													
			}
		}
		return component_;
	}

	public class SelectinputFile extends WizardSelectionPage{
		private Composite container;
		private Text locationPathField;
		private Text locationPathField2;
		private Text locationPathField3;

		private Button browseButton1;
		private Button browseButton2;
		private Button browseButton3;

		protected IFile SpecFile;
		protected IFile InputFile;
		protected IContainer ResultFolder;
		private String spec_path;
		private String input_path;
		private String folder_path;

		protected SelectinputFile(String pageId) {
			super(pageId);
		}
		@Override
		public void createControl(Composite parent) {
			container = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout(2, false);
			container.setLayout(layout);
			layout.numColumns = 1;
			Label label1 = new Label(container, SWT.NONE);
			label1.setText("Select a RosSystems model (result from a static analysis)");
			locationPathField = new Text(container, SWT.BORDER | SWT.SINGLE);
			GridData gd = new GridData (GridData.FILL_HORIZONTAL);
			gd.grabExcessHorizontalSpace = true;
			gd.horizontalAlignment = GridData.FILL;
			locationPathField.setLayoutData(gd);
			browseButton1 = new Button(container, SWT.PUSH);
			browseButton1.setText("Browse...");
			browseButton1.addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent e) {
				}
					public void widgetSelected(SelectionEvent e) {
						IFile[] files_input = WorkspaceResourceDialog.openFileSelection(getShell(), "Select a RosSystems model (result from a static analysis)", "open", false, null, null);
						InputFile= files_input[0];
						input_path = InputFile.getLocation().toString();
						if (input_path == null) return;
						locationPathField.setText(InputFile.getName());
					}
			});
			Label label2 = new Label(container, SWT.NONE);
			label2.setText("RosSystems model (result from a runtime analysis)");
			locationPathField2 = new Text(container, SWT.BORDER | SWT.SINGLE);
			GridData gd2 = new GridData (GridData.FILL_HORIZONTAL);
			gd2.grabExcessHorizontalSpace = true;
			gd2.horizontalAlignment = GridData.FILL;
			locationPathField2.setLayoutData(gd2);
			browseButton2 = new Button(container, SWT.PUSH);
			browseButton2.setText("Browse...");
			browseButton2.addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent e) {
				}
					public void widgetSelected(SelectionEvent e) {
						IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), "Select a RosSystems model (result from a runtime analysis)", "open", false, null, null);
						SpecFile= files[0];
						spec_path= SpecFile.getLocation().toString();
						if (spec_path == null) return;
						locationPathField2.setText(SpecFile.getName());
					}
			});
			Label label3 = new Label(container, SWT.NONE);
			label3.setText("Path for result model");
			locationPathField3 = new Text(container, SWT.BORDER | SWT.SINGLE);
			GridData gd3 = new GridData (GridData.FILL_HORIZONTAL);
			gd3.grabExcessHorizontalSpace = true;
			gd3.horizontalAlignment = GridData.FILL;
			locationPathField3.setLayoutData(gd3);
			browseButton3 = new Button(container, SWT.PUSH);
			browseButton3.setText("Browse...");
			browseButton3.addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent e) {
				}
					public void widgetSelected(SelectionEvent e) {
						IContainer[] path = WorkspaceResourceDialog.openFolderSelection(getShell(), "Select a RosSystems model (result from a runtime analysis)", "open", false, null, null);
						ResultFolder = path[0];
						folder_path= ResultFolder.getLocation().toString();
						if (folder_path == null) return;
						locationPathField3.setText(ResultFolder.getName());
					}
			});
			setControl(container);
			setPageComplete(true);
			}

		public IFile getSpecFile() {
			return SpecFile;
		}
		public IFile getInputFile() {
			return InputFile;
		}
		public IFile getResultFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(ResultFolder.getFullPath().append("result.rossystem"));
		}
	}

	@Override
	public void addPages() {
		getInputFileCreationPage = new SelectinputFile("Whatever");
		getInputFileCreationPage.setTitle("Select ROS model input");
		getInputFileCreationPage.setDescription("Select ROS model input");
		addPage(getInputFileCreationPage);
	}

}
