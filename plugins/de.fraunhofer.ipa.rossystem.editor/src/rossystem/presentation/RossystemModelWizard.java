/**
 */
package rossystem.presentation;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.MissingResourceException;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import rossystem.RossystemFactory;
import rossystem.RossystemPackage;
import rossystem.provider.RossystemEditPlugin;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RossystemModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(RossystemEditorPlugin.INSTANCE.getString("_UI_RossystemEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		RossystemEditorPlugin.INSTANCE.getString("_UI_RossystemEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RossystemPackage rossystemPackage = RossystemPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RossystemFactory rossystemFactory = rossystemPackage.getRossystemFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RossystemModelWizardNewFileCreationPage newFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RossystemModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default container.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected List<String> initialObjectNames;

	private SelectinputFile getInputFileCreationPage;
	private File[] InputFiles;
	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(RossystemEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(RossystemEditorPlugin.INSTANCE.getImage("full/wizban/NewRossystem")));
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : rossystemPackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass)eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, CommonPlugin.INSTANCE.getComparator());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EObject createInitialModel() {
		EClass eClass = (EClass)rossystemPackage.getEClassifier(initialObjectCreationPage.getInitialObjectName());
		EObject rootObject = rossystemFactory.create(eClass);
		return rootObject;
	}

	/**
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean performFinish() {
		try {
			final IFile modelFile = getModelFile();
			final String ModelName = newFileCreationPage.getFileName().replace(".rossystem", "");
			InputFiles = getInputFileCreationPage.getPaths();
			WorkspaceModifyOperation operation =new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							ResourceSet resourceSet = new ResourceSetImpl();
							URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
							Resource resource = resourceSet.createResource(fileURI);
							
							StringBuilder model_output = new StringBuilder();
							resource.getContents().clear();
							model_output.append("RosSystem { Name '"+ModelName+"' ");
							if (!(InputFiles==null)){
								int cout = InputFiles.length;
								if (cout > 0) {
									model_output.append(" RosComponents ( \n    ");
									for (File file:InputFiles) {
										Scanner in = new Scanner(new FileReader(file.getAbsolutePath()));
										while (in.hasNext()) {
											model_output.append(in.next());
											model_output.append(" ");
										}
										in.close();
										cout--;
										if (cout > 0) {
											model_output.append(",\n    ");
										} else {
											model_output.append(")");
										}
								}}}
							model_output.append("\n}");
							byte[] bytes = model_output.toString().getBytes();
							InputStream source = new ByteArrayInputStream(bytes);
							modelFile.create(source, IResource.FILE, null);
			
					}
					catch (Exception exception) {
						RossystemEditorPlugin.INSTANCE.log(exception);
					}
					finally {
						progressMonitor.done();
					}
				}
			};

		getContainer().run(false, false, operation);

		IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
		IWorkbenchPage page = workbenchWindow.getActivePage();
		final IWorkbenchPart activePart = page.getActivePart();
		if (activePart instanceof ISetSelectionTarget) {
		final ISelection targetSelection = new StructuredSelection(modelFile);
		getShell().getDisplay().asyncExec
			(new Runnable() {
				 public void run() {
					 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
				 }
			 });
		}


		/**LoadResourceAction loadResourceAction = new LoadResourceAction();
		loadResourceAction.setActiveWorkbenchPart(activePart);
		loadResourceAction.setActiveEditor(page.getActiveEditor());
		loadResourceAction.run();*/
	
	
			// Open an editor on the new file.
			//
			try {
				page.openEditor(new FileEditorInput(modelFile), "rossystem.presentation.RossystemEditorID" );
				 //workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
				return true;
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), RossystemEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}
			
			
			
			}
			catch (Exception exception) {
				RossystemEditorPlugin.INSTANCE.log(exception);
				return false;
			}
	}	
			//System.out.println(project.getFile("representation.aird").getFullPath());
			// Do the work within an operation.
			//
			/**WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							// Create a resource set
							//
							ResourceSet resourceSet = new ResourceSetImpl();

							
							StringBuilder model_output = new StringBuilder();
							resource.getContents().clear();
							model_output.append("RosSystem { Name '"+ModelName+"' ");


							StringBuilder sb = new StringBuilder();
							List<String> components = new ArrayList<String>();
							
							for (File file:InputFiles) {
								Scanner in = new Scanner(new FileReader(file.getAbsolutePath()));
								while (in.hasNext()) {
									if (in.next().equals("name")) {
										components.add(in.next());
									}
								}
								in.close();
								}

								if ( components.size() > 0) {
									int cout_components = components.size();
									model_output.append(" RosComponents ( ");
									for (String component_name:components) {
										cout_components--;
										model_output.append(component_name+" ");
										if (cout_components > 0) {
											model_output.append(", ");
										}
									}
									model_output.append(")");
								}
							
							model_output.append("\n}");
							byte[] bytes = model_output.toString().getBytes();
							InputStream source = new ByteArrayInputStream(bytes);
							modelFile.create(source, IResource.FILE, null);
							
							
							
							//Add viewpoints to the aird file
							IFile airdFile = project.getFile("representations.aird");
							URI airdFileURI = URI.createPlatformResourceURI(airdFile.getFullPath().toOSString(), true);
							Session session = SessionManager.INSTANCE.getSession(airdFileURI, progressMonitor);
							Set<Viewpoint> availableViewPoints = ViewpointSelection.getViewpoints("rossystem");
							Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
							for(Viewpoint p : availableViewPoints)
								viewpoints.add(SiriusResourceHelper.getCorrespondingViewpoint(session, p));
							ViewpointSelection.Callback callback = new ViewpointSelectionCallbackWithConfimation();
							// Get the URI of the model file.
							//
							//URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);

							// Create a resource for this file.
							//
							//Resource resource = resourceSet.createResource(fileURI);

							// Add the initial model object to the contents.
							//
							//EObject rootObject = createInitialModel();
							//if (rootObject != null) {
								//resource.getContents().add(rootObject);
							//}

							// Save the contents of the resource to the file system.
							//
							//Map<Object, Object> options = new HashMap<Object, Object>();
							//options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
							//resource.save(options);
						}
						catch (Exception exception) {
							RossystemEditorPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);
			
			//Add viewpoints to the aird file
			IRunnableWithProgress op = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					IFile airdFile = project.getFile("representations.aird");
					URI airdFileURI = URI.createPlatformResourceURI(airdFile.getFullPath().toOSString(), true);
					Session session = SessionManager.INSTANCE.getSession(airdFileURI,monitor);
					Set<Viewpoint> availableViewPoints = ViewpointSelection.getViewpoints("ros");
					Set<Viewpoint> viewpoints = new HashSet<Viewpoint>();
					for(Viewpoint p : availableViewPoints)
						viewpoints.add(SiriusResourceHelper.getCorrespondingViewpoint(session, p));
					ViewpointSelection.Callback callback = new ViewpointSelectionCallbackWithConfimation();
					
					//set ros model as root object for the representation
					@SuppressWarnings("restriction")
					RecordingCommand command = new ChangeViewpointSelectionCommand( session, callback, viewpoints, new HashSet<Viewpoint>(), true, monitor);
					TransactionalEditingDomain domain = session.getTransactionalEditingDomain();
					domain.getCommandStack().execute(command);
					EObject rootObject = RossystemFactory.eINSTANCE.createRosSystem();
					rootObject = session.getSemanticResources().iterator().next().getContents().get(0);
		
					//create representation
					Collection<RepresentationDescription> descriptions = DialectManager.INSTANCE.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false),  rootObject );
					RepresentationDescription description_ = descriptions.iterator().next();
					DialectManager viewpointDialectManager = DialectManager.INSTANCE;
					CreateRepresentationCommand createViewCommand = new CreateRepresentationCommand(session,
							  description_, rootObject, modelFile.getProject().getName(), monitor);
					session.getTransactionalEditingDomain().getCommandStack().execute(createViewCommand);
					SessionManager.INSTANCE.notifyRepresentationCreated(session);
		
					//open editor 
					Collection<DRepresentation> representations = viewpointDialectManager.getRepresentations(description_, session);
					DRepresentation myDiagramRepresentation = representations.iterator().next();
					DialectUIManager dialectUIManager = DialectUIManager.INSTANCE; dialectUIManager.openEditor(session, myDiagramRepresentation, monitor);
					
					try {
						project.open(IResource.BACKGROUND_REFRESH, monitor);
				    	ResourcesPlugin.getWorkspace().getRoot().getProject(project.getName()).refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
						project.open(IResource.BACKGROUND_REFRESH, monitor);
						monitor.worked(1);
					} catch (CoreException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			};**/

			/**IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(modelFile);
				getShell().getDisplay().asyncExec
					(new Runnable() {
						 public void run() {
							 ((ISetSelectionTarget)activePart).selectReveal(targetSelection);
						 }
					 });
			}*/
			
			
			/**LoadResourceAction loadResourceAction = new LoadResourceAction();
			loadResourceAction.setActiveWorkbenchPart(activePart);
			loadResourceAction.setActiveEditor(page.getActiveEditor());
			loadResourceAction.run();**/
			

			// Open an editor on the new file.
			//
			/**try {
				page.openEditor
					(new FileEditorInput(modelFile), "rossystem.presentation.RossystemEditorID" );
					 //workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
				return true;
			}
			catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(), RossystemEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}*/


	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class RossystemModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public RossystemModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
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
					setErrorMessage(RossystemEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
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

	
	public class RossystemModelWizardAddComponents extends WizardPage {
		public RossystemModelWizardAddComponents(String pageId) {
			super(pageId);
		}

		@Override
		public void createControl(Composite parent) {
			// TODO Auto-generated method stub
			
		}
		
	}
	/**
	 * This is the page where the type of object to create is selected.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class RossystemModelWizardInitialObjectCreationPage extends WizardPage {
		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo initialObjectField;

		/**
		 * @generated
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 */
		protected List<String> encodings;

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Combo encodingField;

		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public RossystemModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}


		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE); {
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label containerLabel = new Label(composite, SWT.LEFT);
			{
				containerLabel.setText(RossystemEditorPlugin.INSTANCE.getString("_UI_ModelObject"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				containerLabel.setLayoutData(data);
			}

			initialObjectField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				initialObjectField.setLayoutData(data);
			}

			for (String objectName : getInitialObjectNames()) {
				initialObjectField.add(getLabel(objectName));
			}

			if (initialObjectField.getItemCount() == 1) {
				initialObjectField.select(0);
			}
			initialObjectField.addModifyListener(validator);

			Label encodingLabel = new Label(composite, SWT.LEFT);
			{
				encodingLabel.setText(RossystemEditorPlugin.INSTANCE.getString("_UI_XMLEncoding"));

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				encodingLabel.setLayoutData(data);
			}
			encodingField = new Combo(composite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				encodingField.setLayoutData(data);
			}

			for (String encoding : getEncodings()) {
				encodingField.add(encoding);
			}

			encodingField.select(0);
			encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected ModifyListener validator =
			new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					setPageComplete(validatePage());
				}
			};

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected boolean validatePage() {
			return getInitialObjectName() != null && getEncodings().contains(encodingField.getText());
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				if (initialObjectField.getItemCount() == 1) {
					initialObjectField.clearSelection();
					encodingField.setFocus();
				}
				else {
					encodingField.clearSelection();
					initialObjectField.setFocus();
				}
			}
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getInitialObjectName() {
			String label = initialObjectField.getText();

			for (String name : getInitialObjectNames()) {
				if (getLabel(name).equals(label)) {
					return name;
				}
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public String getEncoding() {
			return encodingField.getText();
		}

		/**
		 * Returns the label for the specified type name.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected String getLabel(String typeName) {
			try {
				return RossystemEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
			}
			catch(MissingResourceException mre) {
				RossystemEditorPlugin.INSTANCE.log(mre);
			}
			return typeName;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected Collection<String> getEncodings() {
			if (encodings == null) {
				encodings = new ArrayList<String>();
				for (StringTokenizer stringTokenizer = new StringTokenizer(RossystemEditorPlugin.INSTANCE.getString("_UI_XMLEncodingChoices")); stringTokenizer.hasMoreTokens(); ) {
					encodings.add(stringTokenizer.nextToken());
				}
			}
			return encodings;
		}
	}
	
	
	public class SelectinputFile extends WizardSelectionPage{

	    private Composite container;
	    private Text locationPathField;
		private Button browseButton;
		private File[] selectedFiles = null;

		protected SelectinputFile(String pageId) {
			super(pageId);
		}

		@Override
		public void createControl(Composite parent) {
	        container = new Composite(parent, SWT.NONE);

			GridLayout layout = new GridLayout(2, false);
			container.setLayout(layout);
			
			locationPathField = new Text(container, SWT.BORDER | SWT.SINGLE);
			GridData gd = new GridData (GridData.FILL_HORIZONTAL);
			gd.grabExcessHorizontalSpace = true;
			gd.horizontalAlignment = GridData.FILL;
			locationPathField.setLayoutData(gd);
			browseButton = new Button(container, SWT.PUSH);
			browseButton.setText("Browse...");
			browseButton.addSelectionListener(new SelectionListener() {
				public void widgetDefaultSelected(SelectionEvent e) {
					
				}
	 
				public void widgetSelected(SelectionEvent e) {
					//TODO filter to only show the ros models on my workspace
					FileDialog dlg = new FileDialog(getShell(),  SWT.MULTI  );

					dlg.setText("Open");
					dlg.setFilterExtensions(new String[] { "*.componentinterface" } );
					IWorkspaceRoot ws = ResourcesPlugin.getWorkspace().getRoot();
					String Workspace_path = ws.getProject("de.fraunhofer.ipa.ros.communication.objects").getLocation().toString();
					if (Workspace_path.length() > 20) {
						dlg.setFilterPath(Workspace_path);
					} else if (ws.getLocation().toString().length() > 10){
						dlg.setFilterPath(ws.getLocation().toString());
					}
					dlg.open();
					String [] filenames = dlg.getFileNames();
					String filterPath = dlg.getFilterPath();
					selectedFiles = new File[filenames.length];
					
					for(int i = 0; i < filenames.length; i++)
					{
					    if(filterPath != null && filterPath.trim().length() > 0)
					    {
					        selectedFiles[i] = new File(filterPath, filenames[i]);
					    }
					    else
					    {
					        selectedFiles[i] = new File(filenames[i]);
					    }
					}
					if (filenames == null) 
						return;
					locationPathField.setText(filenames[0].toString());
				}

			});
	        setControl(container);
	        setPageComplete(true);
	        

			}

		public File[] getPaths() {
			return selectedFiles;
		}

}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
		@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new RossystemModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(RossystemEditorPlugin.INSTANCE.getString("_UI_RossystemModelWizard_label"));
		newFileCreationPage.setDescription(RossystemEditorPlugin.INSTANCE.getString("_UI_RossystemModelWizard_description"));
		newFileCreationPage.setFileName(RossystemEditorPlugin.INSTANCE.getString("_UI_RossystemEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
		addPage(newFileCreationPage);

		// Try and get the resource selection to determine a current directory for the file dialog.
		//
		if (selection != null && !selection.isEmpty()) {
			// Get the resource...
			//
			Object selectedElement = selection.iterator().next();
			if (selectedElement instanceof IResource) {
				// Get the resource parent, if its a file.
				//
				IResource selectedResource = (IResource)selectedElement;
				if (selectedResource.getType() == IResource.FILE) {
					selectedResource = selectedResource.getParent();
				}

				// This gives us a directory...
				//
				if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
					// Set this for the container.
					//
					newFileCreationPage.setContainerFullPath(selectedResource.getFullPath());

					// Make up a unique new name here.
					//
					String defaultModelBaseFilename = RossystemEditorPlugin.INSTANCE.getString("_UI_RossystemEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		initialObjectCreationPage = new RossystemModelWizardInitialObjectCreationPage("Whatever2");
		initialObjectCreationPage.setTitle(RossystemEditorPlugin.INSTANCE.getString("_UI_RossystemModelWizard_label"));
		initialObjectCreationPage.setDescription(RossystemEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
		//addPage(initialObjectCreationPage);
		getInputFileCreationPage = new SelectinputFile("Whatever4");
		getInputFileCreationPage.setTitle("Select ROS components");
		getInputFileCreationPage.setDescription("Optional step, only required if the new system is a composition of subsystems");
		addPage(getInputFileCreationPage);
	}

	/**
	 * Get the file from the page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getModelFile() {
		return newFileCreationPage.getModelFile();
	}

}
