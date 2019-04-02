package model.spec.check;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
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
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
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
public class CompareModelWizard extends Wizard implements INewWizard {

	protected SelectinputFile getInputFileCreationPage;
	protected IStructuredSelection selection;
	protected IWorkbench workbench;
	public FileDialog fDialog;
	public IProject project;
	public EObject eobject;


	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		project = workbench.getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput().getAdapter(IResource.class).getProject();
		setWindowTitle("Compare");
	}

	@Override
	public boolean performFinish() {
		try {

			final String Inputpath = getInputFileCreationPage.getInputPath();
			String Inputpath_win = Inputpath.replace("\\","/");
			String RelativePath = Inputpath_win.replace(project.getLocation().toString(), project.getName());
			ResourceSet rs_input = new ResourceSetImpl();
			//TODO: this only works for files in your workspace
			Resource resource_input = rs_input.getResource(URI.createPlatformResourceURI(RelativePath,true),true);			
			PackageSet packageSet_model_input = (PackageSet) resource_input.getContents().get(0);
			EList<Package> package_model_input = (EList<Package>) packageSet_model_input.getPackage();
			EList<Artifact> artifact_input = (EList<Artifact>) package_model_input.get(0).getArtifact();
			Node rosnode_input = (Node) artifact_input.get(0).getNode();
			EList <Publisher> pubs_input = (EList<Publisher>) rosnode_input.getPublisher();
			EList <Subscriber> subs_input = (EList<Subscriber>) rosnode_input.getSubscriber();
			EList <ServiceClient> scls_input = (EList<ServiceClient>) rosnode_input.getServiceclient();
			EList <ServiceServer> ssrs_input = (EList<ServiceServer>) rosnode_input.getServiceserver();
			EList <ActionClient> acls_input = (EList<ActionClient>) rosnode_input.getActionclient();
			EList <ActionServer> asrs_input = (EList<ActionServer>) rosnode_input.getActionserver();

			final String Specpath = getInputFileCreationPage.getSpecPath();
			String Specpath_win = Specpath.replace("\\","/");
			IProject project_basics =  ResourcesPlugin.getWorkspace().getRoot().getProject("de.fraunhofer.ipa.ros.communication.objects");
			String SpecRelativePath = Specpath_win.replace(project_basics.getLocation().toString(), project_basics.getName());
			ResourceSet rs_spec = new ResourceSetImpl();
			//TODO: this only works for files in your workspace
			Resource resource_spec = rs_spec.getResource(URI.createPlatformResourceURI(SpecRelativePath,true),true);			
			PackageSet packageSet_model_spec = (PackageSet) resource_spec.getContents().get(0);
			EList<Package> package_model_spec = (EList<Package>) packageSet_model_spec.getPackage();
			EList<Artifact> artifact_spec = (EList<Artifact>) package_model_spec.get(0).getArtifact();
			Node rosnode_spec = (Node) artifact_spec.get(0).getNode();
			EList <Publisher> pubs_spec = (EList<Publisher>) rosnode_spec.getPublisher();
			EList <Subscriber> subs_spec = (EList<Subscriber>) rosnode_spec.getSubscriber();
			EList <ServiceClient> scls_spec = (EList<ServiceClient>) rosnode_spec.getServiceclient();
			EList <ServiceServer> ssrs_spec = (EList<ServiceServer>) rosnode_spec.getServiceserver();
			EList <ActionClient> acls_spec = (EList<ActionClient>) rosnode_spec.getActionclient();
			EList <ActionServer> asrs_spec = (EList<ActionServer>) rosnode_spec.getActionserver();

			ArrayList<String> Errors = new ArrayList<>();
			ArrayList<String> OKs = new ArrayList<>();
			
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) throws InvocationTargetException, InterruptedException {
						try {
							for(Publisher pub:pubs_spec) {
								boolean pub_ok = false;
								for (Publisher pub_i:pubs_input) {
									if (pub.getMessage().getFullname().equals(pub_i.getMessage().getFullname())){
										pub_ok = true;
										OKs.add("- OK: Topic for message type " + pub.getMessage().getFullname() +" found: \n"  +pub.getName() + " -> " + pub_i.getName());
									}
								}
								if (!pub_ok) {
									Errors.add("- ERROR: missed a publisher for message type:\n" +pub.getMessage().getFullname());
								}
						}
							for(Subscriber sub:subs_spec) {
								boolean sub_ok = false;
								for (Subscriber sub_i:subs_input) {
									if (sub.getMessage().getFullname().equals(sub_i.getMessage().getFullname())){
										sub_ok = true;
										OKs.add("- OK: Topic for message type " + sub.getMessage().getFullname() +" found: \n"  +sub.getName() + " -> " + sub_i.getName());
									}
								}
								if (!sub_ok) {
									Errors.add("- ERROR: missed a publisher for message type:\n" +sub.getMessage().getFullname());
								}
						}
							for(ServiceClient scl:scls_spec) {
								boolean scl_ok = false;
								for (ServiceClient scl_i:scls_input) {
									if (scl.getService().getFullname().equals(scl_i.getService().getFullname())){
										scl_ok = true;
										OKs.add("- OK: Service Client for service type " + scl.getService().getFullname() +" found: \n"  +scl.getName() + " -> " + scl_i.getName());
									}
								}
								if (!scl_ok) {
									Errors.add("- ERROR: missed a ServiceClient for service type:\n" +scl.getService().getFullname());
								}
						}
							for(ServiceServer ssr:ssrs_spec) {
								boolean ssr_ok = false;
								for (ServiceServer ssr_i:ssrs_input) {
									if (ssr.getService().getFullname().equals(ssr_i.getService().getFullname())){
										ssr_ok = true;
										OKs.add("- OK: Service Server for service type " + ssr.getService().getFullname() +" found: \n"  +ssr.getName() + " -> " + ssr_i.getName());
									}
								}
								if (!ssr_ok) {
									Errors.add("- ERROR: missed a ServiceServer for service type:\n" +ssr.getService().getFullname());
								}
						}
							for(ActionClient acl:acls_spec) {
								boolean acl_ok = false;
								for (ActionClient acl_i:acls_input) {
									if (acl.getAction().getFullname().equals(acl_i.getAction().getFullname())){
										acl_ok = true;
										OKs.add("- OK: Action Client for action type " + acl.getAction().getFullname() +" found: \n"  +acl.getName() + " -> " + acl_i.getName());
									}
								}
								if (!acl_ok) {
									Errors.add("- ERROR: missed a ActionClient for action type:\n" +acl.getAction().getFullname());
								}
						}
							for(ActionServer asr:asrs_spec) {
								boolean asr_ok = false;
								for (ActionServer asr_i:asrs_input) {
									if (asr.getAction().getFullname().equals(asr_i.getAction().getFullname())){
										asr_ok = true;
										OKs.add("- OK: Action Server for action type " + asr.getAction().getFullname() +" found: \n"  +asr.getName() + " -> " + asr_i.getName());
									}
								}
								if (!asr_ok) {
									Errors.add("- ERROR: missed a ActionServer for action type:\n" +asr.getAction().getFullname());
								}
						}
					}finally {
						// create a dialog with ok and cancel buttons and a question icon
						MessageBox dialog;
						String message ="Check File:\n "+ Inputpath + "\nwith the specification:\n"+ Specpath+"\n";
						if (!Errors.isEmpty()) {
							dialog = new MessageBox(getShell(), SWT.ICON_ERROR | SWT.OK);
							message = "\nERRORS:\n";
							for (String s:Errors) {
								message+=s+"\n";
							}
						} else {
							dialog = new MessageBox(getShell(), SWT.ICON_WORKING | SWT.OK);
						}
						if (!OKs.isEmpty()) {
							message+="\nOK:\n";
							for (String s:OKs) {
								message+=s+"\n";
							}
						}
						dialog.setText("Specification checker");
						dialog.setMessage(message);
						// open dialog and await user selection
						dialog.open();
					}
			}};

			getContainer().run(false, false, operation);
			return true;
		}catch (Exception exception) {
			return false;
		} 
		}

	public class SelectinputFile extends WizardSelectionPage{
		private Composite container;
		private Text locationPathField;
		private Text locationPathField2;
		private Button browseButton1;
		private Button browseButton2;
		private String spec_path;
		private String input_path;

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
			label1.setText("Input model");
			IWorkspaceRoot ws = ResourcesPlugin.getWorkspace().getRoot();
			String Workspace_path = ws.getProject("de.fraunhofer.ipa.ros.communication.objects").getLocation().toString();			
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
						FileDialog dlg = new FileDialog(getShell(),  SWT.OPEN  );
						dlg.setText("Open");
						dlg.setFilterExtensions(new String[] { "*.ros" } );
						if (ws.getLocation().toString().length() > 10) {
							dlg.setFilterPath(ws.getLocation().toString());
						} else if (Workspace_path.toString().length() > 20){
							dlg.setFilterPath("../"+Workspace_path);
						}
						input_path = dlg.open();
						if (input_path == null) return;
						locationPathField.setText(input_path);
					}
			});
			Label label2 = new Label(container, SWT.NONE);
			label2.setText("Specification model");
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
						FileDialog dlg2 = new FileDialog(getShell(),  SWT.OPEN  );
						dlg2.setText("Open");
						dlg2.setFilterExtensions(new String[] { "*.ros" } );
						dlg2.setFilterPath(Workspace_path+"/BasicSpecs");
						spec_path = dlg2.open();
						if (spec_path == null) return;
						locationPathField2.setText(spec_path);
					}
				
			});
			input_path = locationPathField.getText();
			spec_path = locationPathField2.getText();
			setControl(container);
			setPageComplete(true);
			}

		public String getSpecPath() {
			return spec_path;
		}
		public String getInputPath() {
			return input_path;
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