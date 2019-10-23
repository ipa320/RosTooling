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
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
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
import org.eclipse.sirius.tools.api.command.semantic.AddSemanticResourceCommand;
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
	protected IWorkbench workbench;

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
		//page.setTitle(RosEditorPlugin.INSTANCE.getString("_UI_RosModelWizard_label"));
		//page.setDescription(RosEditorPlugin.INSTANCE.getString("_UI_Wizard_initial_object_description"));
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

	private void doFinish( String ProjectName, IProgressMonitor monitor)
		throws CoreException, GenerationFailedException {
		IProject project = ModelingProjectManager.INSTANCE.createNewModelingProject(ProjectName, null, true, monitor);
		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = "org.eclipse.xtext.ui.shared.xtextNature";

		//clone, import and add reference to Communication Objects
		try {
			ImportCommObjectsHandler.CloneAndImport();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IProject ObjectsProject = ResourcesPlugin.getWorkspace().getRoot().getProject("de.fraunhofer.ipa.ros.communication.objects");
		description.setReferencedProjects(new IProject[] {ObjectsProject});
		description.setNatureIds(newNatures);
		project.setDescription(description, monitor);
		
		IFolder dir = project.getFolder("rosnodes");
		dir.create(true, true, null);
		IFolder dir2 = project.getFolder("components");
		dir2.create(true, true, null);
		IFile file = project.getFile("rosnodes/"+ProjectName+".ros");
		project.open(IResource.BACKGROUND_REFRESH, monitor);
		byte[] bytes = ("PackageSet { package {\n" +"	CatkinPackage " +ProjectName+ "{ artifact {\n" +"		Artifact  "+ProjectName+" {}}}}}").getBytes();
		InputStream source = new ByteArrayInputStream(bytes);
		file.create(source, IResource.NONE, null);
		
		//Add viewpoints to the aird file
		IFile airdFile = project.getFile("representations.aird");
		URI airdFileURI = URI.createPlatformResourceURI(airdFile.getFullPath().toOSString(), true);
		URI rosFileURI = URI.createPlatformResourceURI(file.getFullPath().toOSString(), true);

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
		EObject rootObject = RosFactory.eINSTANCE.createArtifact();
		session.addSemanticResource(rosFileURI, monitor);
		domain.getCommandStack().execute(command);


		
		//Add resource dependencies to communication objects
		if (ResourcesPlugin.getWorkspace().getRoot().getProject("de.fraunhofer.ipa.ros.communication.objects").exists()) {
	        File[] Objectfiles = new File(ResourcesPlugin.getWorkspace().getRoot().getProject("de.fraunhofer.ipa.ros.communication.objects").getLocation().toString()+"/basic_msgs").listFiles();
			for (File Ofile:Objectfiles) {
				if(Ofile.isFile()){
					IFile Oifile= ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(Path.fromOSString(Ofile.getAbsolutePath()));
					if (Oifile.getFileExtension().contains("ros")) {
						AddSemanticResourceCommand addCommandToSession = new AddSemanticResourceCommand(session, URI.createPlatformResourceURI(Oifile.getFullPath().toOSString(), true), monitor );
						domain.getCommandStack().execute(addCommandToSession);
					}
				}
			}
		}
		//create representation
		try {
			rootObject = session.getSemanticResources().iterator().next().getContents().get(0).eContents().get(0).eContents().get(0);
			Collection<RepresentationDescription> representationDescriptions = DialectManager.INSTANCE.getAvailableRepresentationDescriptions(session.getSelectedViewpoints(true), rootObject);
			SessionManager.INSTANCE.notifyRepresentationCreated(session);			
			RepresentationDescription description_ = representationDescriptions.iterator().next();
			Command createViewCommand = new CreateRepresentationCommand(session, description_, rootObject, ProjectName, monitor);
			session.getTransactionalEditingDomain().getCommandStack().execute(createViewCommand);
			DialectManager viewpointDialectManager = DialectManager.INSTANCE;
			project.open(IResource.BACKGROUND_REFRESH, monitor);
			Collection<DRepresentation> representations = viewpointDialectManager.getRepresentations(description_, session);
			DRepresentation myDiagramRepresentation = representations.iterator().next();
			DialectUIManager dialectUIManager = DialectUIManager.INSTANCE; dialectUIManager.openEditor(session, myDiagramRepresentation, monitor);

		} finally {
			session.open(monitor);
	    	//ResourcesPlugin.getWorkspace().getRoot().getProject(project.getName()).refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
			//project.open(IResource.BACKGROUND_REFRESH, monitor);
		}

		monitor.worked(1);
	}
	
	public void copyDependencies(File srcFolder, File destFolder) throws IOException {
		if(srcFolder.isDirectory()){
        		if(!destFolder.exists()){
    			destFolder.mkdir();
    		   //System.out.println("Directory copied from " + srcFolder + "  to " + destFolder);
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
    	        //System.out.println("File copied from " + srcFolder + " to " + destFolder);
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
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(RosEditorPlugin.INSTANCE.getString("_UI_Wizard_label"));
		setDefaultPageImageDescriptor(ExtendedImageRegistry.INSTANCE.getImageDescriptor(RosEditorPlugin.INSTANCE.getImage("full/wizban/NewRos")));

	}
}
