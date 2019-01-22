/**
 */
package componentInterface.presentation;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.ViewpointFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import componentInterface.ComponentInterfaceFactory;
import componentInterface.ComponentInterfacePackage;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInterfaceModelWizardOnlyRosInputModel extends Wizard implements INewWizard {

	public static final List<String> FILE_EXTENSIONS =
		Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
	public static final String FORMATTED_FILE_EXTENSIONS =
		ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").replaceAll("\\s*,\\s*", ", ");
	protected ComponentInterfacePackage componentInterfacePackage = ComponentInterfacePackage.eINSTANCE;
	protected ComponentInterfaceFactory componentInterfaceFactory = componentInterfacePackage.getComponentInterfaceFactory();
	protected SelectinputFile getInputFileCreationPage;
	protected IStructuredSelection selection;
	protected IWorkbench workbench;
	protected List<String> initialObjectNames;
	public FileDialog fDialog;
	public IFile modelFile;
	public String ComponentName;
	public String ComponentNameSpace;
	public Collection<? extends EObject> CInterface;

	public void init(IWorkbench workbench, IStructuredSelection selection, Collection<? extends EObject> CI, Map<String, Object> nameSpace) {
		this.workbench = workbench;
		this.selection = selection;
		ComponentName = CI.toString().substring(CI.toString().indexOf("name:")+6,CI.toString().indexOf(","));
		ComponentNameSpace = CI.toString().substring(CI.toString().indexOf("NameSpace:")+11,CI.toString().indexOf(")]"));
	    setWindowTitle(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(ComponentInterfaceEditorPlugin.INSTANCE.getImage("full/wizban/NewComponentInterface")));
	}


	@Override
	public boolean performFinish() {
		try {

			final String Inputpath = getInputFileCreationPage.getPath();

			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							String representation_name = workbench.getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput().getName();
							IProject project = workbench.getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput().getAdapter(IResource.class).getProject();
							IFile aird_file = project.getFile("representations.aird");
							//TODO: super ugly hot-fix
							 DAnalysis slaveAnalysis = ViewpointFactory.eINSTANCE.createDAnalysis();
							 EList<DView> owned_views = slaveAnalysis.getOwnedViews();
							 System.out.println(owned_views);

							 for (DView view:owned_views) {
								 System.out.println(view.getOwnedRepresentationDescriptors().toString());
								 if (view.getOwnedRepresentationDescriptors().toString().contains(representation_name)) {
									 System.out.println(view.getOwnedRepresentationDescriptors());
								 }
							 }
							/**InputStream air_file_is = aird_file.getContents();
							if (aird_file == null) throw new FileNotFoundException();
							Scanner aird_file_in = new Scanner(new FileReader(aird_file.getRawLocation().toOSString()));
							while (aird_file_in.hasNext()) {
								String next = aird_file_in.next();
								System.out.println("\nNEXT:");
								System.out.print(next);

								if (next.equals(representation_name )) {
									while (aird_file_in.hasNext()) {
										String next2 = aird_file_in.next();
										if (next2.contains("href=")) {
											System.out.println("FileREF: "+aird_file_in.next());
											return;
									}
								}
							}
							}*/
							StringBuilder model_output = new StringBuilder();
							if (ComponentNameSpace.isEmpty()) {
								model_output.append("ComponentInterface { name '"+ComponentName+"' \n");
							} else {
								model_output.append("ComponentInterface { name '"+ComponentName+"' NameSpace '"+ComponentNameSpace+"' \n");
							}

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
									pkg_name = in.next().replace("{", "");
								}if (next_st.equals("Artifact")) {
									artifact_name = in.next();
								}if (next_st.equals("Node")) {
									in.next();
									in.next();
									node_name = in.next().replace("{", "");
								}if (next_st.equals("Publisher")) {
									in.next();
									in.next();
									String pub_name= in.next().replace("{", "");
									pubs.add(pub_name.replace("\"",""));
								}if (next_st.equals("Subscriber")) {
									in.next();
									in.next();
									String sub_name= in.next().replace("{", "");
									subs.add(sub_name.replace("\"",""));
								}if (next_st.equals("ServiceServer")) {
									in.next();
									in.next();
									String srv_name= in.next().replace("{", "");
									srvser.add(srv_name.replace("\"",""));
								}if (next_st.equals("ServiceClient")) {
									in.next();
									in.next();
									String srv_name= in.next().replace("{", "");
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
									if (ComponentNameSpace.isEmpty()) {
										model_output.append("        RosPublisher '"+pub.replaceFirst("/", "")+"' { RefPublisher '"+pkg_name+"."+artifact_name+"."+node_name+"."+pub+"'}");
									} else {
										model_output.append("        RosPublisher '"+ComponentNameSpace.replaceFirst("/", "")+"/"+pub.replaceFirst("/", "")+"' { RefPublisher '"+pkg_name+"."+artifact_name+"."+node_name+"."+pub+"'}");
									}
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
									if (ComponentNameSpace.isEmpty()) {
										model_output.append("        RosSubscriber '"+sub.replaceFirst("/", "")+"' { RefSubscriber '"+pkg_name+"."+artifact_name+"."+node_name+"."+sub+"'}");
									} else {
										model_output.append("        RosSubscriber '"+ComponentNameSpace.replaceFirst("/", "")+"/"+sub.replaceFirst("/", "")+"' { RefSubscriber '"+pkg_name+"."+artifact_name+"."+node_name+"."+sub+"'}");
									}
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
									if (ComponentNameSpace.isEmpty()) {
										model_output.append("        RosServiceServer '"+srvsr.replaceFirst("/", "")+"' { RefServer '"+pkg_name+"."+artifact_name+"."+node_name+"."+srvsr+"'}");
									} else {
										model_output.append("        RosServiceServer '"+ComponentNameSpace.replaceFirst("/", "")+"/"+srvsr.replaceFirst("/", "")+"' { RefServer '"+pkg_name+"."+artifact_name+"."+node_name+"."+srvsr+"'}");
									}
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
									if (ComponentNameSpace.isEmpty()) {
										model_output.append("        RosServiceClient '"+srvc.replaceFirst("/", "")+"' { RefClient '"+pkg_name+"."+artifact_name+"."+node_name+"."+srvc+"'}");
									} else {
										model_output.append("        RosServiceClient '"+ComponentNameSpace.replaceFirst("/", "")+"/"+srvc.replaceFirst("/", "")+"' { RefClient '"+pkg_name+"."+artifact_name+"."+node_name+"."+srvc+"'}");
									}
									if (cout_srvc > 0) {
										model_output.append(",\n");
									}
								}
								model_output.append("}\n");
							}
							model_output.append("}");
							byte[] bytes = model_output.toString().getBytes();
							InputStream source = new ByteArrayInputStream(bytes);
							System.out.println(model_output);

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
						
			return true;
		}
		catch (Exception exception) {
			ComponentInterfaceEditorPlugin.INSTANCE.log(exception);
			return false;
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
						FileDialog dlg = new FileDialog(getShell(),  SWT.OPEN  );
						dlg.setText("Open");
						dlg.setFilterExtensions(new String[] { "*.ros" } );
						IWorkspaceRoot ws = ResourcesPlugin.getWorkspace().getRoot();
						String Workspace_path = ws.getProject("de.fraunhofer.ipa.ros.communication.objects").getLocation().toString();
						if (ws.getLocation().toString().length() > 10) {
							dlg.setFilterPath(ws.getLocation().toString());
						} else if (Workspace_path.toString().length() > 20){
							dlg.setFilterPath("../"+Workspace_path);
						}
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

	@Override
	public void addPages() {
		getInputFileCreationPage = new SelectinputFile("Whatever4");
		getInputFileCreationPage.setTitle("Select ROS model input");
		getInputFileCreationPage.setDescription("Select ROS model input");
		addPage(getInputFileCreationPage);
	}


	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}

}
