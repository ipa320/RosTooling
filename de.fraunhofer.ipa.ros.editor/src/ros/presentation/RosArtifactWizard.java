package ros.presentation;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.dialect.command.CreateRepresentationCommand;
import org.eclipse.sirius.business.api.helper.SiriusResourceHelper;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.ui.business.api.dialect.DialectUIManager;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelection;
import org.eclipse.sirius.ui.business.api.viewpoint.ViewpointSelectionCallbackWithConfimation;
import org.eclipse.sirius.ui.business.internal.commands.ChangeViewpointSelectionCommand;
import org.eclipse.sirius.ui.tools.api.project.ModelingProjectManager;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.description.RepresentationDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import ros.RosFactory;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "mpe". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class RosArtifactWizard extends Wizard implements INewWizard {
	private NewArtifactProjectWizardPage page;
	private ISelection selection;

	/**
	 * Constructor for NewCodeGenProjectWizard.
	 */
	public RosArtifactWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new NewArtifactProjectWizardPage(selection);
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
		final String ProjectName = page.getProjectName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(ProjectName, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} catch (GenerationFailedException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * TODO: add dependency to predefined msgs and open automatically the Properties view
	 */

	private void doFinish( String ProjectName, IProgressMonitor monitor)
		throws CoreException, GenerationFailedException {
		IProject project = ModelingProjectManager.INSTANCE.createNewModelingProject(ProjectName, null, true, monitor);
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = "org.eclipse.xtext.ui.shared.xtextNature";
		description.setNatureIds(newNatures);
		project.setDescription(description, monitor);
		IFile file = project.getFile(ProjectName+".rosartifact");
		project.open(IResource.BACKGROUND_REFRESH, monitor);
		byte[] bytes = ("Artifact "+ProjectName+" {}").getBytes();
		InputStream source = new ByteArrayInputStream(bytes);
		file.create(source, IResource.NONE, null);
		
		//Add viewpoints to the aird file
		IFile airdFile = project.getFile("representations.aird");
		URI airdFileURI = URI.createPlatformResourceURI(airdFile.getFullPath().toOSString(), true);
		Session session = SessionManager.INSTANCE.getSession(airdFileURI, monitor);
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
		EObject rootObject = RosFactory.eINSTANCE.createArtifact();
		rootObject = session.getSemanticResources().iterator().next().getContents().get(0);

		//create representation
		Collection<RepresentationDescription> descriptions = DialectManager.INSTANCE.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(false),  rootObject );
		RepresentationDescription description_ = descriptions.iterator().next();
		DialectManager viewpointDialectManager = DialectManager.INSTANCE;
		Command createViewCommand = new CreateRepresentationCommand(session,
				  description_, rootObject, ProjectName, monitor);
		session.getTransactionalEditingDomain().getCommandStack().execute(createViewCommand);
		SessionManager.INSTANCE.notifyRepresentationCreated(session);

		//open editor 
		Collection<DRepresentation> representations = viewpointDialectManager.getRepresentations(description_, session);
		DRepresentation myDiagramRepresentation = representations.iterator().next();
		DialectUIManager dialectUIManager = DialectUIManager.INSTANCE; dialectUIManager.openEditor(session, myDiagramRepresentation, monitor);
		
		project.open(IResource.BACKGROUND_REFRESH, monitor);

		//TODO: HotFix to copy basic msgs 
		try {
			File srcFolder = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()+"/../de.fraunhofer.ipa.ros/basic_msgs");
	    	//File srcFolder = new File(ResourcesPlugin.getWorkspace().getRoot().findMember("de.fraunhofer.ipa.ros.objects").getLocation().toString()+"/basic_msgs");
	    	File destFolder = new File(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()+project.getFullPath().toString()+"/basic_msgs");
	    	copyDependencies(srcFolder,destFolder);
		} catch(IOException e){
        	e.printStackTrace();
        }
    	ResourcesPlugin.getWorkspace().getRoot().getProject(project.getName()).refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		project.open(IResource.BACKGROUND_REFRESH, monitor);
		monitor.worked(1);
	}
	
	public void copyDependencies(File srcFolder, File destFolder) throws IOException {
		if(srcFolder.isDirectory()){
        		if(!destFolder.exists()){
    			destFolder.mkdir();
    		   System.out.println("Directory copied from " + srcFolder + "  to " + destFolder);
    		}
    		String files[] = srcFolder.list();
    		for (String file : files) {
    		   File srcFile = new File(srcFolder, file);
    		   File destFile = new File(destFolder, file);
    		   copyDependencies(srcFile,destFile);
    		}
    	}else{
    		InputStream in = new FileInputStream(srcFolder);
    	        OutputStream out = new FileOutputStream(destFolder);        
    	        byte[] buffer = new byte[1024];
    	        int length;
    	        while ((length = in.read(buffer)) > 0){
    	    	   out.write(buffer, 0, length);
    	        }
    	        in.close();
    	        out.close();
    	        System.out.println("File copied from " + srcFolder + " to " + destFolder);
    	}
    }
		
	
	protected IProject getProjectHandle() {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(page.getName());
	}
	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}
