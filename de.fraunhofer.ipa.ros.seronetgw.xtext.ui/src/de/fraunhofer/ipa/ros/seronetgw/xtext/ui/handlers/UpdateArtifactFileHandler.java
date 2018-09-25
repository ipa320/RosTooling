package de.fraunhofer.ipa.ros.seronetgw.xtext.ui.handlers;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;


public class UpdateArtifactFileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// String root = ResourcesPlugin.getWorkspace().getRoot().getFullPath().toString();
		
		// gets root for the workspace 
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		// gets all projects in the root 
		IProject[] projects = root.getProjects();
		
		// traverse all projects and update files having .rosartifact extension
		for (int i = 0; i < projects.length; i++)
		{
			try {
			
				IFile modelArtifactFile = projects[i].getFile(projects[i].getName()+".rosartifact");
				projects[i].open(IResource.BACKGROUND_REFRESH, null);			
				byte[] buf = ("\n").getBytes();
				InputStream source = new ByteArrayInputStream(buf);
				
				if (modelArtifactFile.exists())
				{
					//System.out.println("Artifact File " + i + " : " + projects[i].getFile(projects[i].getName().toString()));
					modelArtifactFile.appendContents(source, IResource.NONE, null);					
					
				}
				
				projects[i].refreshLocal(IResource.DEPTH_INFINITE, null);
			
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
	}
}
