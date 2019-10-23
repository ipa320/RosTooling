/**
 */
package ros.presentation;


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;


public class ImportRosModel extends Wizard implements INewWizard {
	public IStructuredSelection selection;
	protected IWorkbench workbench;
	protected getHAROSConfiguration getHAROSConfigurationPage;
	protected RosModelWizardNewFileCreationPage newFileCreationPage;
	public IProject project;
	protected String package_name;
	protected String node_name;
	protected String workspace_path;
	public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays.asList(RosEditorPlugin.INSTANCE.getString("_UI_RosEditorFilenameExtensions").split("\\s*,\\s*")));
	public static final String FORMATTED_FILE_EXTENSIONS = RosEditorPlugin.INSTANCE.getString("_UI_RosEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		workbench = this.workbench;
		UpdateUserSelection(selection);
		selection = this.selection;
		setWindowTitle("Import a ROS model from code analysis");
	}

	public void UpdateUserSelection(IStructuredSelection inputSelec){
		selection=inputSelec;
	}
	
	@Override
	public boolean performFinish() {
		try {
			final IFile modelFile = newFileCreationPage.getModelFile();
			project = modelFile.getProject();
			final String package_name = getHAROSConfigurationPage.getPackageName();
			final String node_name = getHAROSConfigurationPage.getNodeName();
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
					
					try {
						URL url = new URL("platform:/plugin/de.fraunhofer.ipa.ros/tools/test.sh");
						File file = new File(FileLocator.resolve(url).toURI());
						String URLfile = file.getAbsolutePath();
						
						URL url_py = new URL("platform:/plugin/de.fraunhofer.ipa.ros/tools/ros_model_extractor.py");
						File file_py = new File(FileLocator.resolve(url_py).toURI());
						String URLfile_py = file_py.getAbsolutePath();
						workspace_path = getHAROSConfigurationPage.getWorkspacePath();
						workspace_path = workspace_path.replace("build/compile_commands.json", "devel/setup.bash");
						String args = workspace_path+" "+package_name+" "+node_name+" "+URLfile_py;
						Process p = Runtime.getRuntime().exec("bash "+URLfile+" "+args);
						BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
						p.waitFor();
						StringBuilder builder = new StringBuilder();
						String line;
						while ( (line = in.readLine()) != null) {
							builder.append(line);
							builder.append(System.getProperty("line.separator"));
						}
						byte[] bytes = builder.toString().getBytes();
						InputStream source = new ByteArrayInputStream(bytes);
						modelFile.create(source, IResource.FILE, null);
						//Add viewpoints to the aird file
						/*IFile airdFile = project.getFile("representations.aird");
						URI airdFileURI = URI.createPlatformResourceURI(airdFile.getFullPath().toOSString(), true);
						Session session = SessionManager.INSTANCE.getSession(airdFileURI, progressMonitor);
						Set<Viewpoint> availableViewPoints = ViewpointSelection.getViewpoints("ros");
						Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
						for(Viewpoint view_p : availableViewPoints)
							viewpoints.add(SiriusResourceHelper.getCorrespondingViewpoint(session, view_p));
						ViewpointSelection.Callback callback = new ViewpointSelectionCallbackWithConfimation();*/
						
						//set ros model as root object for the representation
						/*@SuppressWarnings("restriction")
						RecordingCommand command = new ChangeViewpointSelectionCommand( session, callback, viewpoints, new HashSet<Viewpoint>(), true, progressMonitor);
						TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
						domain.getCommandStack().execute(command);
						EObject rootObject = RosFactory.eINSTANCE.createArtifact();
						rootObject = session.getSemanticResources().iterator().next().getContents().get(0);
						Collection<RepresentationDescription> descriptions = DialectManager.INSTANCE.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false), rootObject);
						RepresentationDescription description_ = descriptions.iterator().next();
						DialectManager viewpointDialectManager = DialectManager.INSTANCE;
						Command createViewCommand = new CreateRepresentationCommand(session,
								  description_, rootObject, project.getName(), progressMonitor);
						session.getTransactionalEditingDomain().getCommandStack().execute(createViewCommand);
						SessionManager.INSTANCE.notifyRepresentationCreated(session);
						open editor 
						Collection<DRepresentation> representations = viewpointDialectManager.getRepresentations(description_, session);
						DRepresentation myDiagramRepresentation = representations.iterator().next();
						DialectUIManager dialectUIManager = DialectUIManager.INSTANCE; dialectUIManager.openEditor(session, myDiagramRepresentation, progressMonitor);*/
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (MalformedURLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (URISyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}};
		getContainer().run(false, false, operation);
		return true;
	}catch (Exception exception) {
		RosEditorPlugin.INSTANCE.log(exception);
		return false;
		

	}
	}
	
	
	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class RosModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public RosModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
			super(pageId, selection);

		}

		/**
		 * The framework calls this to see if the file is correct.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		protected boolean validatePage() {
			if (super.validatePage()) {
				String extension = new Path(getFileName()).getFileExtension();
				if (extension == null || !FILE_EXTENSIONS.contains(extension)) {
					String key = FILE_EXTENSIONS.size() > 1 ? "_WARN_FilenameExtensions" : "_WARN_FilenameExtension";
					setErrorMessage(RosEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
					return false;
				}
				return true;
			}
			return false;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public IFile getModelFile() {
			return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
		}
	}



	public class getHAROSConfiguration extends WizardSelectionPage{
		private Composite container;
		private Text package_name;
		private Text node_name;
		private Text workspace_path;
		protected getHAROSConfiguration(String pageName) {
			super(pageName);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void createControl(Composite parent) {
			container = new Composite(parent, SWT.NONE);
			GridLayout layout = new GridLayout(2, false);
			container.setLayout(layout);
			
			layout.numColumns = 2;
			Label label1 = new Label(container, SWT.NONE);
			label1.setText("Ros Package Name");
			package_name = new Text(container, SWT.BORDER | SWT.SINGLE);
			package_name.setText("");
			package_name.addKeyListener(new KeyListener() {
				public void keyPressed(KeyEvent e) {
				}
				public void keyReleased(KeyEvent e) {
					if (!package_name.getText().isEmpty()) {
						setPageComplete(true);
					}
				}
			});
			Label label2 = new Label(container, SWT.NONE);
			label2.setText("Ros Node name");
			node_name = new Text(container, SWT.BORDER | SWT.SINGLE);
			node_name.setText("");
			node_name.addKeyListener(new KeyListener() {
				public void keyPressed(KeyEvent e) {
				}
				public void keyReleased(KeyEvent e) {
					if (!node_name.getText().isEmpty()) {
						setPageComplete(true);
					}
				}

			});
			GridLayout gridLayout = new GridLayout();
			gridLayout.numColumns = 1;
			container.setLayout(gridLayout);

			Group WorspaceGroup = new Group(container, SWT.NONE);
			WorspaceGroup.setText("Path to compile_commands.json file of your ROS workspace (under catkin_ws/build/)");
			WorspaceGroup.setLayout(gridLayout);
			workspace_path = new Text(WorspaceGroup, SWT.BORDER | SWT.SINGLE);
			Button browseButton = new Button(WorspaceGroup, SWT.PUSH);
			browseButton.setText("Browse...");
			browseButton.addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent e) {
				}

				public void widgetSelected(SelectionEvent e) {
					FileDialog dlg = new FileDialog(getShell(),  SWT.OPEN  );
					dlg.setText("Open");
					dlg.setFilterExtensions(new String[] { "compile_commands.json" } );
					String path = dlg.open();
					if (path == null) return;
					workspace_path.setText(path);
				}

			});

			GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.grabExcessHorizontalSpace = false;
			gd.horizontalAlignment = GridData.FILL;
			package_name.setLayoutData(gd);
			node_name.setLayoutData(gd);
			WorspaceGroup.setLayoutData(gd);
			setControl(container);
			setPageComplete(false);
		}

		public String getPackageName() {
			return package_name.getText();
		}

		public String getNodeName() {
			return node_name.getText();
		}

		public String getWorkspacePath() {
			return workspace_path.getText();
		}
	}
	
	@Override
	public void addPages() {
		newFileCreationPage = new RosModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(RosEditorPlugin.INSTANCE.getString("_UI_RosModelWizard_label"));
		newFileCreationPage.setDescription(RosEditorPlugin.INSTANCE.getString("_UI_RosModelWizard_description"));
		newFileCreationPage.setFileName(RosEditorPlugin.INSTANCE.getString("_UI_RosEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);
		if (selection != null && !selection.isEmpty()) {
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {

				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());
					String defaultModelBaseFilename = RosEditorPlugin.INSTANCE.getString("_UI_RosEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}

		getHAROSConfigurationPage = new getHAROSConfiguration("Whatever4");
		getHAROSConfigurationPage.setTitle("Select ROS model input");
		getHAROSConfigurationPage.setDescription("Select ROS model input");
		addPage(getHAROSConfigurationPage);
	}

	
}
