package de.fraunhofer.ipa.rossystem.deployment;

import java.util.ArrayList;
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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.dialogs.MessageDialog;
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

import componentInterface.ComponentInterface;
import componentInterface.RosParameter;
import rossystem.ComponentStack;
import rossystem.RosSystem;

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
            RosSystem system = (RosSystem)r.getContents().get(0);

            Display display = Display.getDefault();
            Shell shell = display.getActiveShell();

            Map<String, Integer> result = select_ros_distro(shell, project);

            DeploymentArtifactsGenerator generator = new DeploymentArtifactsGenerator();
            String distro = result.keySet().stream().findFirst().get();
            generator.get_ros_distro(distro);
            generator.get_ros_version(result.get(distro));

            Map<String, Map<RosParameter, String>> sys_param_port = set_ports_from_parameters(shell, system);
            generator.get_portt_list(sys_param_port);
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

      private Map<String, Map<RosParameter, String>> set_ports_from_parameters(Shell shell, RosSystem system) {
          Map<String, Map<RosParameter, String>> sys_param_portvalue_map=new HashMap<>();
          EList<ComponentInterface> roscomponents = new BasicEList<ComponentInterface>();
          EList<ComponentStack> stacks = system.getComponentStack();
          String label = system.getName();
          if (stacks.size() == 0) {
              roscomponents = system.getRosComponent();
              sys_param_portvalue_map.put(system.getName(), get_component_port_value(shell, roscomponents, label));
          }else {
              for (ComponentStack stack: stacks) {
                  label = stack.getName();
                  roscomponents = stack.getRosComponent();
                  sys_param_portvalue_map.put(stack.getName(), get_component_port_value(shell, roscomponents, label));
              }
          }

          return sys_param_portvalue_map;
      }

      private Map<RosParameter, String>get_component_port_value(Shell shell, EList<ComponentInterface> roscomponents, String label) {
          Map<RosParameter, String> param_portvalue_map=new HashMap<>();
          Map<String, RosParameter> param_name_map = new HashMap<String, RosParameter>();
          List<String> param_names = new ArrayList<String>();
          for (RosParameter param : get_all_ros_params(roscomponents)) {
              param_names.add(param.getName());
              param_name_map.put(param.getName(), param);
          }

          if (param_names.size() > 0) {
              ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, new LabelProvider());
              dialog.setElements(param_names.toArray());
              dialog.setTitle(String.format("%s: Select parameters for setting ports", label));
              dialog.setMessage("If your robot setup has devices connected through ports that have to be configure, please select their parameters. Otherwise, press cancel ");
              dialog.setMultipleSelection(true);
              dialog.open();

              if(dialog.getResult() != null) {
                  for(Object param_name : dialog.getResult()) {
                      RosParameter tmp_value = param_name_map.get(param_name.toString());
                      if(tmp_value != null) {
                          if(tmp_value.getValue() != null) {
                              String raw_value = tmp_value.getValue().toString().replace(" ", "");
                              String value = raw_value.substring(raw_value.lastIndexOf(":")+1, raw_value.lastIndexOf(")"));
                              MessageDialog dialog_check_port = new MessageDialog(shell, String.format("Check ports' values in %s", label), null,
                                      String.format("The value of \"%s\" is \"%s\"", param_name.toString(), value), MessageDialog.INFORMATION, new String[] { "OK" }, 0);
                              dialog_check_port.open();
                              param_portvalue_map.put(tmp_value, value);
                          }
                          else {
                              String value = "Deployment Artifacts couldn't be generated. The selected parameter ("+param_name.toString()+") doesn't have a value set, please define it on the rossystem file and try again.";
                              MessageDialog error_dialog = new MessageDialog(shell, "ERROR", null,
                                        value, MessageDialog.ERROR, new String[] { "Cancel" }, 0);
                              error_dialog.open();
                              param_portvalue_map.put(tmp_value, null);
                          }
                      }
                  }
              }
          }
        return param_portvalue_map;
      }

      private EList<RosParameter> get_all_ros_params(EList<ComponentInterface> roscomponents) {
          EList<RosParameter> all_ros_params = new BasicEList<RosParameter>();
          for (int i=0; i<roscomponents.size(); i++) {
              List<RosParameter>  component_params = get_ros_component_params(roscomponents.get(i));
                for (int j= 0;j<component_params.size();j++) {
                    all_ros_params.add(component_params.get(j));
                }
            }
          return all_ros_params;
      }

      private List<RosParameter> get_ros_component_params(ComponentInterface componentInterface_model){
          List<RosParameter> ros_component_params = new ArrayList<RosParameter>();
          for (RosParameter ros_param: componentInterface_model.getRosparameter()) {
              ros_component_params.add(ros_param);
          }
          return ros_component_params;
       }

      @Override
      public boolean isEnabled() {
        return true;
      }
    }
