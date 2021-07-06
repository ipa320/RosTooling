package de.fraunhofer.ipa.ros.araig.plugin;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class FileExtensionFilter extends ViewerFilter {

  private String fTargetExtension;

  public FileExtensionFilter(String targetExtension) {
    fTargetExtension = targetExtension;
  }

  @Override
  public boolean select(Viewer viewer, Object parent, Object element) {
    if (element instanceof IFile) {
      return ((IFile)element).getName().toLowerCase().endsWith("." + fTargetExtension); 
    }

    if (element instanceof IProject && !((IProject)element).isOpen())
      return false;

    if (element instanceof IContainer) { // i.e. IProject, IFolder
      try {
        IResource[] resources = ((IContainer)element).members();
        for (IResource resource : resources) {
          if (select(viewer, parent, resource))
            return true;
        }
      } catch (CoreException e) {
        // Ignore
      }
    }

    return false;  
  }

}