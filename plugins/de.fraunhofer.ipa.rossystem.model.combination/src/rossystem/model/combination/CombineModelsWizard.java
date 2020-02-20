package rossystem.model.combination;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
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
import componentInterface.ComponentInterface;
import componentInterface.RosActionClient;
import componentInterface.RosActionServer;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
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

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		setWindowTitle("Combine System Models");
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
			RosSystemImpl rossystem = ((RosSystemImpl)RosSystemInput2);

			EList<ComponentInterface> components_input2 = (EList<ComponentInterface>) RosSystemInput2.getRosComponent();

			ArrayList<String> Errors = new ArrayList<>();
			ArrayList<String> OKs = new ArrayList<>();
			
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) throws InvocationTargetException, InterruptedException {
						try {
							Boolean component_exists;
							System.out.println("SIZE");
							System.out.println(components_input.size());

							for (ComponentInterface comp:components_input) {
								component_exists=false;
								for (ComponentInterface  comp2:components_input2) {
									if ( comp2.getName().contains(comp.getName())) {
										component_exists=true;
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

										for(RosPublisher pub:pubs_input) {
											System.out.println("Found Name: "+pub.getName());

											for (RosPublisher pub_i:pubs_input2) {
												if (pub_i.getName().equals(pub.getName())){
													System.out.println("Found coincidence: "+pub_i.getName()+" "+pub.getName());
													pub_i.setPublisher(pub.getPublisher());
												} else {
													comp2.getRospublisher().add(pub);
												}
										}}
								}} 
						/**if (!component_exists){
								System.out.println("Component not found"+comp.getName());
								RosSystemInput2.getRosComponent().add(comp);
								rossystem.getRosComponent().add(comp);
								resource_input2.save(null);

							}*/
						}
						try {
							resource_input2.save(null);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}}
						finally {
							// create a dialog with ok and cancel buttons and a question icon
							MessageBox dialog;
							String message ="Combine the file:\n "+ InputFile2.getName() + "\nwith the model:\n"+ InputFile.getName()+"\n";
							if (!Errors.isEmpty()) {
								dialog = new MessageBox(getShell(), SWT.ICON_ERROR | SWT.OK);
								message+="\nERRORS:\n";
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
		protected IFile SpecFile;
		protected IFile InputFile;
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
						IFile[] files_input = WorkspaceResourceDialog.openFileSelection(getShell(), "Select a RosSystems model", "open", false, null, null);
						InputFile= files_input[0];
						input_path = InputFile.getLocation().toString();
						if (input_path == null) return;
						locationPathField.setText(InputFile.getName());
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
						IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), "Select a RosSystems model", "open", false, null, null);
						SpecFile= files[0];
						spec_path= SpecFile.getLocation().toString();
						if (spec_path == null) return;
						locationPathField2.setText(SpecFile.getName());
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
	}

	@Override
	public void addPages() {
		getInputFileCreationPage = new SelectinputFile("Whatever");
		getInputFileCreationPage.setTitle("Select ROS model input");
		getInputFileCreationPage.setDescription("Select ROS model input");
		addPage(getInputFileCreationPage);
	}

}