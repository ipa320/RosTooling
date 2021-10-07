package de.fraunhofer.ipa.rossystem.deployment;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.builder.EclipseResourceFileSystemAccess2;
import org.eclipse.xtext.generator.GeneratorContext;
import org.eclipse.xtext.generator.IOutputConfigurationProvider;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.fraunhofer.ipa.rossystem.deployment.CustomOutputProvider;
import de.fraunhofer.ipa.rossystem.deployment.DeploymentArtifactsGenerator;

public class GenerationHandler extends AbstractHandler implements IHandler {
	 
	  @Inject
	  private Provider<EclipseResourceFileSystemAccess2> fileAccessProvider;
	 
	  @Inject
	  IResourceDescriptions resourceDescriptions;
	 
	  @Inject
	  IResourceSetProvider resourceSetProvider;

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
	        
	        Display display = Display.getDefault();
	        Shell shell = display.getActiveShell();
	        
	        Map<String, Integer> result = select_ros_distro(shell, project);
	        
	        DeploymentArtifactsGenerator generator = new DeploymentArtifactsGenerator();
	        String distro = result.keySet().stream().findFirst().get();
	        generator.get_ros_distro(distro);
	        generator.get_ros_version(result.get(distro));
	        
	        // Todo: check if package type maps to the select version	        
			generator.doGenerate(r, fsa, new GeneratorContext());
	      }
	    }
	    return null;
	  }
	  
	  private Map<String, Integer> select_ros_distro(Shell shell, IProject project) {
		  Map<String, Integer> ros_distro_map = new HashMap<String, Integer>() {{
		        put("melodic", 1);
		        put("noetic", 1);
		        put("foxy", 2);
		  }}; 
		  
		  ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new LabelProvider());
		  dialog.setElements(ros_distro_map.keySet().toArray());
		  dialog.setTitle("Select a ROS Distro");
		  dialog.setMultipleSelection(false);
		  dialog.open();
		  
		  Map<String, Integer> result = new HashMap<String, Integer>() {{
		        put(dialog.getResult()[0].toString(), ros_distro_map.get(dialog.getResult()[0]));
          }}; 
		  return result;
	  }

	 
	  @Override
	  public boolean isEnabled() {
	    return true;
	  }
	}
