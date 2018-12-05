/**
 */
package componentInterface.presentation;


import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
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
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

import componentInterface.ComponentInterfaceFactory;
import componentInterface.ComponentInterfacePackage;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInterfaceModelWizard extends Wizard implements INewWizard {
	/**
	 * The supported extensions for created files.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));

	/**
	 * A formatted list of supported file extensions, suitable for display.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String FORMATTED_FILE_EXTENSIONS =
		ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");

	/**
	 * This caches an instance of the model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfacePackage componentInterfacePackage = ComponentInterfacePackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceFactory componentInterfaceFactory = componentInterfacePackage.getComponentInterfaceFactory();

	/**
	 * This is the file creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInterfaceModelWizardNewFileCreationPage newFileCreationPage;
	protected SelectinputFile getInputFileCreationPage;

	/**
	 * This is the initial object creation page.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ComponentInterfaceModelWizardNamNSCreationPage getNameandNamespaceCreationPage;

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

	public FileDialog fDialog;

	/**
	 * This just records the information.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(ComponentInterfaceEditorPlugin.INSTANCE.getImage("full/wizban/NewComponentInterface")));
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
			for (EClassifier eClassifier : componentInterfacePackage.getEClassifiers()) {
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
	 * Do the work after everything is specified.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean performFinish() {
		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();
			final String modelName = newFileCreationPage.getFileName().replace(".componentinterface", "");
			final String ComponentName = getNameandNamespaceCreationPage.getComponentInterfaceName();
			final String ComponentNameSpace = getNameandNamespaceCreationPage.getComponentInterfaceNameSpace();
			final String Inputpath = getInputFileCreationPage.getPath();

			ResourceSet resourceSet = new ResourceSetImpl();
			URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
			Resource resource = resourceSet.createResource(fileURI);

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							

							
							// Add the initial model object to the contents.
							//
							//EObject rootObject = createInitialModel();
							//if (rootObject != null) {
							//	resource.getContents().add(rootObject);
							//}
							StringBuilder model_output = new StringBuilder();
							resource.getContents().clear();
							model_output.append("ComponentInterface { name '"+ComponentName+"' NameSpace RelativeNamespace {parts{ '"+ComponentNameSpace+"' } }\n");

							
							
							Scanner in = new Scanner(new FileReader(Inputpath));
							StringBuilder sb = new StringBuilder();
							
							String pkg_name=null;
							String artifact_name=null;
							String node_name=null;
							List<String> pubs = new ArrayList<String>();
							List<String> subs = new ArrayList<String>();
							List<String> srvser = new ArrayList<String>();
							List<String> srvcl = new ArrayList<String>();

							while(in.hasNext()) {
								String next_st = in.next();
								sb.append(next_st);
								if (next_st.equals("CatkinPackage")) {
									pkg_name = in.next();
								}if (next_st.equals("Artifact")) {
									artifact_name = in.next();
								}if (next_st.equals("Node")) {
									in.next();
									in.next();
									node_name = in.next();
								}if (next_st.equals("Publisher")) {
									in.next();
									in.next();
									String pub_name= in.next();
									pubs.add(pub_name.replace("\"",""));
								}if (next_st.equals("Subscriber")) {
									in.next();
									in.next();
									String sub_name= in.next();
									subs.add(sub_name.replace("\"",""));
								}if (next_st.equals("ServiceServer")) {
									in.next();
									in.next();
									String srv_name= in.next();
									srvser.add(srv_name.replace("\"",""));
								}if (next_st.equals("ServiceClient")) {
									in.next();
									in.next();
									String srv_name= in.next();
									srvcl.add(srv_name.replace("\"",""));
								}
							}
							in.close();
							String outString = sb.toString();

							if (pubs.size() > 0) {
								int cout_pub = pubs.size();
								model_output.append("    RosPublishers{\n");
								for(String pub:pubs) {
									cout_pub--;
									model_output.append("        RosPublisher '/"+ComponentNameSpace+"/"+pub.replace("/", "")+"' { RefPublisher '"+pkg_name+"."+artifact_name+"."+node_name+"."+pub+"'}");
									if (cout_pub > 0) {
										model_output.append(",\n");
									}
								}
								model_output.append("}\n");
							}if (subs.size() > 0) {
								int cout_subs = subs.size();
								model_output.append("    RosSubscribers{\n");
								for(String sub:subs) {
									cout_subs--;
									model_output.append("        RosSubscriber '/"+ComponentNameSpace+"/"+sub.replace("/", "")+"' { RefSubscriber '"+pkg_name+"."+artifact_name+"."+node_name+"."+sub+"'}");
									if (cout_subs > 0) {
										model_output.append(",\n");
									}
								}
								model_output.append("}\n");
							}if (srvser.size() > 0) {
								int cout_srvs = srvser.size();
								model_output.append("    RosSrvServers{\n");
								for(String srvsr:srvser) {
									cout_srvs--;
									model_output.append("        RosServiceServer '/"+ComponentNameSpace+"/"+srvsr.replace("/", "")+"' { RefServer '"+pkg_name+"."+artifact_name+"."+node_name+"."+srvsr+"'}");
									if (cout_srvs > 0) {
										model_output.append(",\n");
									}
								}
								model_output.append("}\n");
							}if (srvcl.size() > 0) {
								int cout_srvc = srvcl.size();
								model_output.append("    RosSrvClients{\n");
								for(String srvc:srvcl) {
									cout_srvc--;
									model_output.append("        RosServiceClient '/"+ComponentNameSpace+"/"+srvc.replace("/", "")+"' { RefClient '"+pkg_name+"."+artifact_name+"."+node_name+"."+srvc+"'}");
									if (cout_srvc > 0) {
										model_output.append(",\n");
									}
								}
								model_output.append("}\n");
							}
							model_output.append("}");
							byte[] bytes = model_output.toString().getBytes();
							InputStream source = new ByteArrayInputStream(bytes);
							modelFile.create(source, IResource.FILE, null);
							// Save the contents of the resource to the file system.
							//
							//Map<Object, Object> options = new HashMap<Object, Object>();
							//options.put(XMLResource.OPTION_ENCODING, initialObjectCreationPage.getEncoding());
							//resource.save(options);

						}
						catch (Exception exception) {
							ComponentInterfaceEditorPlugin.INSTANCE.log(exception);
						}
						finally {
							progressMonitor.done();
						}
					}
				};

			getContainer().run(false, false, operation);

			// Select the new file resource in the current view.
			//
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

			// Open an editor on the new file.
			//
			
			try {
				page.openEditor(new FileEditorInput(modelFile), "componentInterface.presentation.ComponentInterfaceEditorID");
						//workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());
			} catch (PartInitException exception) {
				MessageDialog.openError(workbenchWindow.getShell(),
						ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
				return false;
			}
			
			//LoadResourceAction loadResourceAction = new LoadResourceAction();
			//loadResourceAction.setActiveWorkbenchPart(activePart);
			//loadResourceAction.setActiveEditor(page.getActiveEditor());
			//loadResourceAction.run();
						
			return true;
		}
		catch (Exception exception) {
			ComponentInterfaceEditorPlugin.INSTANCE.log(exception);
			return false;
		}
	}


	/**
	 * This is the one page of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public class ComponentInterfaceModelWizardNewFileCreationPage extends WizardNewFileCreationPage {
		/**
		 * Pass in the selection.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ComponentInterfaceModelWizardNewFileCreationPage(String pageId, IStructuredSelection selection) {
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
					setErrorMessage(ComponentInterfaceEditorPlugin.INSTANCE.getString(key, new Object [] { FORMATTED_FILE_EXTENSIONS }));
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



	public class ComponentInterfaceModelWizardNamNSCreationPage extends WizardPage {
	    private Text CIName;
	    private Text CINameSpace;
	    private Composite container;

		public ComponentInterfaceModelWizardNamNSCreationPage(String pageId) {
			super(pageId);
		}
	
	    @Override
	    public void createControl(Composite parent) {
	        container = new Composite(parent, SWT.NONE);
	        GridLayout layout = new GridLayout(2, false);
	        container.setLayout(layout);
	        layout.numColumns = 2;
	        Label label1 = new Label(container, SWT.NONE);
	        label1.setText("ComponentInterface name");
	        CIName = new Text(container, SWT.BORDER | SWT.SINGLE);
	        CIName.setText("");
	        CIName.addKeyListener(new KeyListener() {
	            public void keyPressed(KeyEvent e) {
	            }
	            public void keyReleased(KeyEvent e) {
	                if (!CIName.getText().isEmpty()) {
	                    setPageComplete(true);
	                }
	            }
	        });
	        Label label2 = new Label(container, SWT.NONE);
	        label2.setText("ComponentInterface namespace");
	        CINameSpace = new Text(container, SWT.BORDER | SWT.SINGLE);
	        CINameSpace.setText("");
	        CINameSpace.addKeyListener(new KeyListener() {
	            public void keyPressed(KeyEvent e) {
	            }
	            public void keyReleased(KeyEvent e) {
	                if (!CINameSpace.getText().isEmpty()) {
	                    setPageComplete(true);
	                }
	            }

	        });

	        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
			gd.grabExcessHorizontalSpace = true;
			gd.horizontalAlignment = GridData.FILL;
	        CIName.setLayoutData(gd);
	        CINameSpace.setLayoutData(gd);
	        
	        // required to avoid an error in the system
	        setControl(container);
	        setPageComplete(false);
	    }

	    public String getComponentInterfaceName() {
	        return CIName.getText();
	    }
	    
	    public String getComponentInterfaceNameSpace() {
	        return CINameSpace.getText();
	    }

	}
	

	public class SelectinputFile extends WizardSelectionPage{

	    private Composite container;
	    private Text locationPathField;
		private Button browseButton;
		private String path;

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
					FileDialog dlg = new FileDialog(getShell(),  SWT.OPEN  );
					dlg.setText("Open");
					path = dlg.open();
					if (path == null) return;
					locationPathField.setText(path);

				}

			});
	        setControl(container);
	        setPageComplete(true);
	        

			}

		public String getPath() {
			return path;
		}

}

	/**
	 * The framework calls this to create the contents of the wizard.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
		@Override
	public void addPages() {
		// Create a page, set the title, and the initial model file name.
		//
		newFileCreationPage = new ComponentInterfaceModelWizardNewFileCreationPage("Whatever", selection);
		newFileCreationPage.setTitle(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceModelWizard_label"));
		newFileCreationPage.setDescription(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceModelWizard_description"));
		newFileCreationPage.setFileName(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameDefaultBase") + "." + FILE_EXTENSIONS.get(0));
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
					String defaultModelBaseFilename = ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameDefaultBase");
					String defaultModelFilenameExtension = FILE_EXTENSIONS.get(0);
					String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
					for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
						modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
					}
					newFileCreationPage.setFileName(modelFilename);
				}
			}
		}
		
		getNameandNamespaceCreationPage = new ComponentInterfaceModelWizardNamNSCreationPage("Whatever3");
		getNameandNamespaceCreationPage.setTitle("Set Name and Namespace to the ComponentInterface");
		getNameandNamespaceCreationPage.setDescription("Set Name and Namespace to the ComponentInterface");
		addPage(getNameandNamespaceCreationPage);

		
		getInputFileCreationPage = new SelectinputFile("Whatever4");
		getInputFileCreationPage.setTitle("Select ROS model input");
		getInputFileCreationPage.setDescription("Select ROS model input");
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
