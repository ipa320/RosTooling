package de.fraunhofer.ipa.ros.seronetgw.rosgw.presentation;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;

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

public class GwProjectWizard extends Wizard implements INewWizard {
	private NewGwProjectWizardPage page;
	private ISelection selection;
	protected IWorkbench workbench;


	/**
	 * Constructor for NewCodeGenProjectWizard.
	 */
	public GwProjectWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new NewGwProjectWizardPage(selection);
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
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(ProjectName);
		project.create(monitor);
		project.open(monitor);

		IProjectDescription description = project.getDescription();
		String[] natures = description.getNatureIds();
		String[] newNatures = new String[natures.length + 1];
		System.arraycopy(natures, 0, newNatures, 0, natures.length);
		newNatures[natures.length] = "org.eclipse.xtext.ui.shared.xtextNature";
		description.setNatureIds(newNatures);
		project.setDescription(description, monitor);


		IFile modelFile = project.getFile(ProjectName+".rosgw");
		project.open(IResource.BACKGROUND_REFRESH, monitor);
		byte[] bytes = ("RosGateway {}").getBytes();
		InputStream source = new ByteArrayInputStream(bytes);
		modelFile.create(source, IResource.NONE, monitor);

    	ResourcesPlugin.getWorkspace().getRoot().getProject(project.getName()).refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		project.open(IResource.BACKGROUND_REFRESH, monitor);
		monitor.done();
		
		// Open an editor on the new file and call load resources


		final ISelection targetSelection = new StructuredSelection(modelFile);
		getShell().getDisplay().syncExec(new Runnable() {
				public void run() {
					IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
					IWorkbenchPage page = workbenchWindow.getActivePage();		
					final IWorkbenchPart activePart = page.getActivePart();
					((ISetSelectionTarget) activePart).selectReveal(targetSelection);
					try {
						page.openEditor(new FileEditorInput(modelFile),
								workbench.getEditorRegistry().getDefaultEditor(modelFile.getFullPath().toString()).getId());

					} catch (PartInitException exception) {
						MessageDialog.openError(workbenchWindow.getShell(),
								RosgwEditorPlugin.INSTANCE.getString("_UI_OpenEditorError_label"), exception.getMessage());
					}

					LoadResourceAction loadResourceAction = new LoadResourceAction();
					loadResourceAction.setActiveWorkbenchPart(activePart);
					loadResourceAction.setActiveEditor(page.getActiveEditor());
					loadResourceAction.run();

				}
			});
				
		project.open(IResource.BACKGROUND_REFRESH, null);

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
	}
}
