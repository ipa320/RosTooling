package de.fraunhofer.ipa.ros.observer;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
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

import componentInterface.ComponentInterface;
import componentInterface.RosPublisher;
import de.fraunhofer.ipa.ros.observer.generator.CustomOutputProvider;
import de.fraunhofer.ipa.ros.observer.generator.ObserverPyCodeGenerator;
import ros.Subscriber;
import ros.impl.SubscriberImpl;
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

    @SuppressWarnings("null")
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection) selection;
            Object firstElement = structuredSelection.getFirstElement();
            if (firstElement instanceof IFile) {
            IFile file = (IFile) firstElement;
            IProject project = file.getProject();

            URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
            ResourceSet rs = resourceSetProvider.get(project);
            Resource r = rs.getResource(uri, true);

            Display display = Display.getDefault();
            Shell shell = display.getActiveShell();

            RosSystem rossystem = (RosSystem)r.getContents().get(0);
            EList<ComponentInterface> roscomponents = rossystem.getRosComponent();
            List<EObject> RosInterfaces = new ArrayList<EObject>();
            for (int i=0; i<roscomponents.size(); i++) {
                List<EObject>  NewRosInterfaces = getInterfaces(roscomponents.get(i));
                for (int j= 0;j<NewRosInterfaces.size();j++) {
                    RosInterfaces.add(NewRosInterfaces.get(j));
                }
            }

            ElementListSelectionDialog dialogSelect = new ElementListSelectionDialog(shell, new LabelProvider());

            String[] ListofInterfaces = new String[RosInterfaces.size()];
            for (int i=0; i<RosInterfaces.size(); i++) {
                ListofInterfaces[i]=(getViewMenuInterfaceName(RosInterfaces.get(i)));
            }

            dialogSelect.setElements(ListofInterfaces);
            dialogSelect.setTitle("Select the ROS interfaces to observe");
            dialogSelect.setMessage("!!! This features requires that the option: Project -> Build Automatilly is enable !!!");
            dialogSelect.setMultipleSelection(true);
            dialogSelect.open();

            Object[] results = dialogSelect.getResult();

            String observer_name = "my_observer";
            String RelativePathTogenerationFolder = "src-gen/observers/";
            String RelativePathToObserverModel = RelativePathTogenerationFolder+observer_name+".ros";
            IFile ObserverModelFile = project.getFile(RelativePathToObserverModel);

            String ros_model =
                    "PackageSet { \n" +
                    "  CatkinPackage rosgraph_monitor {" +
                    "    Artifact "+observer_name+" {\n" +
                    "      Node { name /"+observer_name+"\n";
            ros_model+="        Publishers { \n"+
                    "          Publisher { name '/diagnostics' message 'diagnostic_msgs.DiagnosticArray'}}\n";
            List<Subscriber> rossubscribers = new ArrayList<Subscriber>();

            for (Object result_: results) {
                for (EObject ResultInterface: RosInterfaces) {
                    if((getViewMenuInterfaceName(ResultInterface)).equals(result_.toString())) {
                        EObject SelectedInterface = ResultInterface;

                        if (SelectedInterface.getClass().toString().contains("componentInterface.impl.RosPublisherImpl")) {
                            Subscriber sub = new SubscriberImpl();
                            sub.setName(((RosPublisher) SelectedInterface).getName());
                            sub.setMessage(((RosPublisher)SelectedInterface).getPublisher().getMessage());
                            rossubscribers.add(sub);
                        }
                    }}}
            if (!rossubscribers.isEmpty()) {
                ros_model+="        Subscribers {\n";
                for(int i=0;i<rossubscribers.size();i++) {
                    ros_model+="          Subscriber { name '"+rossubscribers.get(i).getName()+"' message '"+rossubscribers.get(i).getMessage().getFullname().replace("/", ".")+"'},\n";
                }
                ros_model=ros_model.substring(0, ros_model.length() - 2);
                ros_model+="}";
            }
            ros_model+="}}}}";


            byte[] bytes = (ros_model).getBytes();

            // prepare the Xtext generation environment
            ObserverPyCodeGenerator generator = new ObserverPyCodeGenerator();
            final EclipseResourceFileSystemAccess2 fsa = fileAccessProvider.get();
            fsa.setProject(project);
            fsa.setOutputConfigurations(getOutputConfigurationsAsMap(new CustomOutputProvider()));
            fsa.setMonitor(new NullProgressMonitor());
            GeneratorContext generatorContext = new GeneratorContext();
            if (!project.getFolder(RelativePathTogenerationFolder).exists()) {
                generator.createXtextGenerationFolder(fsa, generatorContext);
            }
            InputStream source = new ByteArrayInputStream(bytes);
            try {
                if (!ObserverModelFile.exists()) {
                    ObserverModelFile.create(source, IResource.NONE, null);
                } else{
                    @SuppressWarnings("resource")
                    OutputStream outputStream = new FileOutputStream(new File(project.getLocation().toString()+"/"+RelativePathToObserverModel));
                    outputStream.write(bytes);
                }

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (CoreException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            URI uriObserverFile = URI.createPlatformResourceURI(ObserverModelFile.getFullPath().toString(), true);

            // Call the python code generator
            ResourceSet rs2 = resourceSetProvider.get(project);
            Resource r2 = rs2.getResource(uriObserverFile, true);
            generator.doGenerate(r2, fsa, generatorContext);
        }}
        return null;
    }

    private List<EObject> getInterfaces(ComponentInterface componentInterface_model) {
        List<EObject> ROSInterfaces = new ArrayList<EObject>();
        for (RosPublisher RosPub: componentInterface_model.getRospublisher()) {
            ROSInterfaces.add(RosPub);
        }
        /**for (RosSubscriber RosSub: componentInterface_model.getRossubscriber()) {
            ROSInterfaces.add(RosSub);
        }
        for (RosServiceClient RosSrvc: componentInterface_model.getRosserviceclient()) {
            ROSInterfaces.add(RosSrvc);
        }
        for (RosServiceServer RosSrvs: componentInterface_model.getRosserviceserver()) {
            ROSInterfaces.add(RosSrvs);
        }
        for (RosActionClient RosActc: componentInterface_model.getRosactionclient()) {
            ROSInterfaces.add(RosActc);
        }
        for (RosActionServer RosActs: componentInterface_model.getRosactionserver()) {
            ROSInterfaces.add(RosActs);
        }*/
        return ROSInterfaces;
    }

    private String getInterfaceName(EObject RosInterface) {
        String name = RosInterface.toString().substring(RosInterface.toString().indexOf("name:")+6,RosInterface.toString().indexOf(","));
        return name;
    }
    private String getViewMenuInterfaceName(EObject RosInterface) {
        String name = "["+RosInterface.toString().substring(RosInterface.toString().indexOf("impl.Ros")+8,RosInterface.toString().indexOf("Impl@"))+"]  "+
                getInterfaceName(RosInterface);
        return name;
    }

    @Override
      public boolean isEnabled() {
        return true;
      }
    }
