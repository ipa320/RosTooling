package ros.presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

import ros.Artifact;
import ros.PackageSet;
import ros.RosFactory;
import ros.impl.AmentPackageImpl;
import ros.impl.ArtifactImpl;
import ros.impl.PackageSetImpl;

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
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(ProjectName);
        try {
            if (!project.exists()) {
                project.create(monitor);
            }
            if (!project.isOpen()) {
                project.open(IResource.BACKGROUND_REFRESH, monitor);
            }
	        //IProject project = ModelingProjectManager.INSTANCE.createNewModelingProject(ProjectName, null, true, monitor);
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
	            //e.printStackTrace();
	        } catch (InterruptedException e) {
	            // TODO Auto-generated catch block
	            //e.printStackTrace();
	        }
	        IProject ObjectsProject = ResourcesPlugin.getWorkspace().getRoot().getProject("de.fraunhofer.ipa.ros.communication.objects");
	        description.setReferencedProjects(new IProject[] {ObjectsProject});
	        description.setNatureIds(newNatures);
	        project.setDescription(description, monitor);
	
	        IFolder dir = project.getFolder("rosnodes");
	        dir.create(true, true, null);
	        IFile file = project.getFile("rosnodes/"+ProjectName+".ros2");
	        //System.out.println(file.getFullPath());
	        project.open(IResource.BACKGROUND_REFRESH, monitor);
	
	        ResourceSet resourceSet = new ResourceSetImpl();
	        Resource resource = resourceSet.createResource(URI.createPlatformResourceURI(file.getFullPath().toOSString(),true));
	        EObject PackageRootObject = RosFactory.eINSTANCE.createAmentPackage();
	        //EObject PackageSetRootObject = RosFactory.eINSTANCE.createPackageSet();
	
	        if (PackageRootObject != null) {
	            resource.getContents().add(PackageRootObject);
	        }
	        //PackageSet packageSet_model = (PackageSetImpl) resource.getContents().get(0);
	        AmentPackageImpl pkg = (AmentPackageImpl) resource.getContents().get(0);
	        //Artifact artifact = new ArtifactImpl();
	        //artifact.setName(project.getName());
	        pkg.setName(project.getName());
	        //pkg.getArtifact().add(artifact);
	        //packageSet_model.getPackage().add(pkg);
            resource.save(null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
