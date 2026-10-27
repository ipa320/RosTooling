package de.fraunhofer.ipa.roscode.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import ros.Package;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.fraunhofer.ipa.ros2.generator.Ros2Generator;

public class GenerationRos2CppHandler extends AbstractHandler implements IHandler {

      @Inject
      private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;

      @Inject
      IResourceDescriptions resourceDescriptions;

      @Inject
      IResourceSetProvider resourceSetProvider;

      @Inject
      private Ros2Generator ros2Generator;

    static Map<String, OutputConfiguration> getOutputConfigurationsAsMap(IOutputConfigurationProvider provider) {
        Map<String, OutputConfiguration> outputs = new HashMap<String, OutputConfiguration>();
        for(OutputConfiguration c: provider.getOutputConfigurations()) {
            outputs.put(c.getName(), c);
        }
        return outputs;
    }

      @Override
      public Object execute(ExecutionEvent event) throws ExecutionException {

        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
          IStructuredSelection structuredSelection = (IStructuredSelection) selection;
          Object firstElement = structuredSelection.getFirstElement();
          if (firstElement instanceof IFile) {
            IFile file = (IFile) firstElement;
            IProject project = file.getProject();

            final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
            fsa.setProject(project);
            fsa.setOutputConfigurations(getOutputConfigurationsAsMap(new CustomOutputProvider()));
            fsa.setMonitor(new NullProgressMonitor());

            URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
            ResourceSet rs = resourceSetProvider.get(project);
            Resource r = rs.getResource(uri, true);

            List<String> existingFiles = new ArrayList<String>();
            IFolder srcGenFolder = project.getFolder("src-gen");
            if (srcGenFolder.exists()) {
                TreeIterator<EObject> it = r.getAllContents();
                boolean foundPkg = false;
                while (it.hasNext()) {
                    EObject obj = it.next();
                    if (obj instanceof ros.Package) {
                        String pkgName = ((ros.Package) obj).getName().toLowerCase();
                        IFolder pkgFolder = srcGenFolder.getFolder(pkgName);
                        if (pkgFolder.exists()) {
                            collectFiles(pkgFolder, existingFiles);
                        }
                        foundPkg = true;
                    }
                }
                if (!foundPkg) {
                    collectFiles(srcGenFolder, existingFiles);
                }
            }

            if (ros2Generator == null) {
                ros2Generator = Activator.getInstance().getInjector(Activator.DE_FRAUNHOFER_IPA_ROS2_ROS2).getInstance(Ros2Generator.class);
            }
            ros2Generator.generateTargeted(r, fsa, null, "cpp", "auto", existingFiles);

            try {
                project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
            } catch (CoreException e) {
                // ignore
            }
          }
        }
        return null;
      }

      private void collectFiles(IContainer container, List<String> result) {
          try {
              for (IResource member : container.members()) {
                  if (member instanceof IFile) {
                      result.add(member.getProjectRelativePath().toString());
                  } else if (member instanceof IContainer) {
                      collectFiles((IContainer) member, result);
                  }
              }
          } catch (CoreException e) {
              // ignore
          }
      }

      @Override
      public boolean isEnabled() {
        return true;
      }
    }
