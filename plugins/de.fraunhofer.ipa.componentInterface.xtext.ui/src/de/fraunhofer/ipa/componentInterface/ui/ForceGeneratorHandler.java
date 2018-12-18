package de.fraunhofer.ipa.componentInterface.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class ForceGeneratorHandler extends AbstractHandler {
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		String project_name = selection.toString().substring(selection.toString().indexOf("/"), selection.toString().indexOf("/", 4));
		String file_path = ResourcesPlugin.getWorkspace().getRoot().getProject(project_name).getLocation().toString()+"/"+selection.toString().substring(selection.toString().indexOf("/", 4), selection.toString().length()-1);
		final IWorkspace workspace = ResourcesPlugin.getWorkspace();
		Job cleanJob = new Job(file_path) {
		  public IStatus run(IProgressMonitor monitor) {
		    try {
		       workspace.build(IncrementalProjectBuilder.CLEAN_BUILD, monitor);
		       return Status.OK_STATUS;
		    } catch(CoreException ex) {
		      return ex.getStatus();
		    }
		  }
		};
		cleanJob.schedule();
		// TODO: call the generator for the selected file and not clean all

		/**
		 *File SelectedFile = new File(file_path);
		 *ComponentInterfaceGenerator generator = new ComponentInterfaceGenerator();		
		 * 
		 * ResourcesPlugin.getWorkspace().getRoot().getProject(project_name).refreshLocal(IResource.DEPTH_INFINITE, null);
		 * try {
			InputStream inputStream =  new FileInputStream(SelectedFile);
			//System.out.println(getStringFromInputStream(inputStream));
			//Resource resource = getClass().getResource(SelectedFile.getName());
			//resource.load(inputStream, null);
			//System.out.println(resource.getAllContents());
			//System.out.println(resource.isLoaded());
			URI selectionURI = new URI("platform:/resource/"+selection.toString().substring(selection.toString().indexOf("/", 4), selection.toString().length()-1));
			Resource resource = null;
			resource.setURI(selectionURI);
			//generator.doGenerate(resource, null, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}*/
		return null;
	}

}