package rossystem.model.combination;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import componentInterface.ComponentInterface;
import componentInterface.RosActionClient;
import componentInterface.RosActionServer;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import componentInterface.impl.ComponentInterfaceImpl;
import componentInterface.impl.RosPublisherImpl;
import rossystem.RosSystem;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CombineModelsWizard extends Wizard implements INewWizard {

    protected SelectinputFile getInputFileCreationPage;
    //protected RossystemPackage rossystemPackage = RossystemPackage.eINSTANCE;
    //protected RossystemFactory rossystemFactory = rossystemPackage.getRossystemFactory();

    public void init(IWorkbench workbench, IStructuredSelection selection) {
        setWindowTitle("Combine System Models");
    }

    public void addComponentAndSave(RosSystem RosSystemResult, ComponentInterface component, Resource resource_result2) {
        RosSystemResult.getRosComponent().add(component);
        resource_result2.getContents().add(RosSystemResult);
        try {
            resource_result2.save(null);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }


    public RosPublisher NewPub(RosPublisher pub) {
        RosPublisher ros_pub = new RosPublisherImpl();
        ros_pub.setName(pub.getName());
        ros_pub.setNs(pub.getNs());
        ros_pub.setPublisher(pub.getPublisher());
        return ros_pub;
    }

    @Override
    public boolean performFinish() {
        try {
            ArrayList<String> Report = new ArrayList<>();

            IFile InputFile = getInputFileCreationPage.getInputFile();
            String RelativePath = InputFile.getProject().getName()+"/"+InputFile.getProjectRelativePath();
            ResourceSet rs_input = new ResourceSetImpl();
            Resource resource_input = rs_input.getResource(URI.createPlatformResourceURI(RelativePath,true),true);
            RosSystem RosSystemInput = (RosSystem) resource_input.getContents().get(0);
            EList<ComponentInterface> components_input = (EList<ComponentInterface>) RosSystemInput.getRosComponent();

            final IFile InputFile2 = getInputFileCreationPage.getSpecFile();
            String InputFile2RelativePath = InputFile2.getProject().getName()+"/"+InputFile2.getProjectRelativePath();
            ResourceSet rs_spec = new ResourceSetImpl();
            Resource resource_input2 = rs_spec.getResource(URI.createPlatformResourceURI(InputFile2RelativePath,true),true);
            RosSystem RosSystemInput2 = (RosSystem) resource_input2.getContents().get(0);
            EList<ComponentInterface> components_input2 = (EList<ComponentInterface>) RosSystemInput2.getRosComponent();
            Report.add("Combine the system model "+RosSystemInput.getName()+" from file:\n "+ InputFile.getName() +
                    "\nwith the system model "+RosSystemInput2.getName()+" from :\n"+ InputFile2.getName()+"\n");

            Report.add(RosSystemInput.getName()+": "+components_input.size()+" components");
            Report.add(RosSystemInput2.getName()+": "+components_input2.size()+" components");

            final IFile modelFile = getInputFileCreationPage.getResultFile();

            final boolean minimal_model_combination = getInputFileCreationPage.get_minimal_model();


            WorkspaceModifyOperation operation =
                new WorkspaceModifyOperation() {
                    @Override
                    protected void execute(IProgressMonitor progressMonitor) throws InvocationTargetException, InterruptedException {
                        try {

                            ResourceSet resourceSet = new ResourceSetImpl();
                            URI fileURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), true);
                            Resource resource_result = resourceSet.createResource(fileURI);
                            StringBuilder model_output = new StringBuilder();
                            resource_result.getContents().clear();
                            model_output.append("RosSystem { Name 'result' }");
                            byte[] bytes = model_output.toString().getBytes();
                            InputStream source = new ByteArrayInputStream(bytes);
                            try {
                                modelFile.create(source, IResource.FILE, null);
                            } catch (CoreException e) {
                                // TODO Auto-generated catch block
                                e.printStackTrace();
                            }

                            String ResultFileRelativePath = modelFile.getProject().getName()+"/"+modelFile.getProjectRelativePath();
                            ResourceSet rs_result = new ResourceSetImpl();
                            Resource resource_result2= rs_result.getResource(URI.createPlatformResourceURI(ResultFileRelativePath,true),true);
                            RosSystem RosSystemResult = (RosSystem) resource_result2.getContents().get(0);

                            List<ComponentInterface> components1_ = new ArrayList<>();
                            components1_.addAll(components_input);

                            List<ComponentInterface> components2_ = new ArrayList<>();
                            components2_.addAll(components_input2);

                            boolean component_found;

                            if (!minimal_model_combination) {
                                for(int i = 0; i < components2_.size(); i++) {
                                    ComponentInterface comp2 = components2_.get(i);
                                    component_found=false;
                                    for (int j = 0; j < components1_.size(); j++) {
                                        ComponentInterface comp = components1_.get(j);
                                        if (comp2.getName().equals(comp.getName())) {component_found=true;}}
                                        if (!component_found) {
                                            addComponentAndSave(RosSystemResult,comp2,resource_result2);
                                        }
                                }
                            }
                            int count=0;

                            for (int i = 0; i < components1_.size(); i++) {
                                ComponentInterface comp = components1_.get(i);
                                component_found=false;
                                for (int j = 0; j < components2_.size(); j++) {
                                    ComponentInterface comp2 = components2_.get(j);
                                    if (comp2.getName().equals(comp.getName())) {
                                        count++;
                                        System.out.println(count);
                                        component_found = true;
                                        addComponentAndSave(RosSystemResult,computeInterfaces(comp, comp2),resource_result2);
                                }}
                                if (!component_found) {
                                    addComponentAndSave(RosSystemResult,comp,resource_result2);
                                }

                        }
                            Report.add("Result model: "+RosSystemResult.getRosComponent().size()+" components");
                        }

                        finally {
                            // create a dialog with ok and cancel buttons and a question icon
                            String message = null;

                            MessageBox dialog;
                            if (!Report.isEmpty()) {
                                dialog = new MessageBox(getShell(), SWT.ICON_WORKING | SWT.OK);
                                for (String s:Report) {
                                    message+=s+"\n";
                                }
                            } else {
                                dialog = new MessageBox(getShell(), SWT.ICON_WORKING | SWT.OK);
                            }

                            dialog.setText("Report");
                            dialog.setMessage(message);
                            // open dialog and await user selection
                            dialog.open();
        }}};
            getContainer().run(false, false, operation);
            return true;
        }catch (Exception exception) {
            return false;
        } }


    public ComponentInterface computeInterfaces (ComponentInterface comp, ComponentInterface comp2) {
        ComponentInterface component_ = new ComponentInterfaceImpl();
        component_.setName(comp.getName());
        component_.setNameSpace(comp.getNameSpace());
        System.out.println(component_);
        EList <RosPublisher> pubs_input = (EList<RosPublisher>) comp.getRospublisher();
        EList <RosSubscriber> subs_input = (EList<RosSubscriber>) comp.getRossubscriber();
        EList <RosServiceClient> scls_input = (EList<RosServiceClient>) comp.getRosserviceclient();
        EList <RosServiceServer> ssrs_input = (EList<RosServiceServer>) comp.getRosserviceserver();
        EList <RosActionClient> acls_input = (EList<RosActionClient>) comp.getRosactionclient();
        EList <RosActionServer> asrs_input = (EList<RosActionServer>) comp.getRosactionserver();

        EList <RosPublisher> pubs_input2 = (EList<RosPublisher>) comp2.getRospublisher();
        EList <RosSubscriber> subs_input2 = (EList<RosSubscriber>) comp2.getRossubscriber();
        EList <RosServiceClient> scls_input2 = (EList<RosServiceClient>) comp2.getRosserviceclient();
        EList <RosServiceServer> ssrs_input2 = (EList<RosServiceServer>) comp2.getRosserviceserver();
        EList <RosActionClient> acls_input2 = (EList<RosActionClient>) comp2.getRosactionclient();
        EList <RosActionServer> asrs_input2 = (EList<RosActionServer>) comp2.getRosactionserver();

        //PUBLISHERS
        List<RosPublisher> pubs_input_ = new ArrayList<>();
        pubs_input_.addAll(pubs_input);

        List<RosPublisher> pubs_input2_ = new ArrayList<>();
        pubs_input2_.addAll(pubs_input2);
        for(RosPublisher pub:pubs_input2_) {
            boolean pub_found = false;
            for (RosPublisher pub_i:pubs_input_) {
                if (pub_i.getName().equals(pub.getName())){
                    pub_found=true;
                    component_.getRospublisher().add(pub_i);
            }}
            if (!pub_found) {
                component_.getRospublisher().add(pub);
            }
        }
        for(RosPublisher pub:pubs_input_) {
            boolean pub_found = false;
            for (RosPublisher pub_i:pubs_input2_) {
                if (pub_i.getName().equals(pub.getName())){
                    pub_found=true;
            }}
            if (!pub_found) {
                component_.getRospublisher().add(pub);
            }
        }
        //SUBSCRIBERS
        List<RosSubscriber> subs_input_ = new ArrayList<>();
        subs_input_.addAll(subs_input);

        List<RosSubscriber> subs_input2_ = new ArrayList<>();
        subs_input2_.addAll(subs_input2);
        for(RosSubscriber sub:subs_input2_) {
            boolean sub_found = false;
            for (RosSubscriber sub_i:subs_input_) {
                if (sub_i.getName().equals(sub.getName())){
                    sub_found=true;
                    component_.getRossubscriber().add(sub_i);
            }}
            if (!sub_found) {
                component_.getRossubscriber().add(sub);
            }
        }
        for(RosSubscriber sub:subs_input_) {
            boolean sub_found = false;
            for (RosSubscriber sub_i:subs_input2_) {
                if (sub_i.getName().equals(sub.getName())){
                    sub_found=true;
            }}
            if (!sub_found) {
                component_.getRossubscriber().add(sub);
            }
        }

        //SERVICE SERVER
        List<RosServiceServer> ssrs_input_ = new ArrayList<>();
        ssrs_input_.addAll(ssrs_input);

        List<RosServiceServer> ssrs_input2_ = new ArrayList<>();
        ssrs_input2_.addAll(ssrs_input2);
        for(RosServiceServer srv:ssrs_input2_) {
            boolean srv_found = false;
            for (RosServiceServer srv_i:ssrs_input_) {
                if (srv_i.getName().equals(srv.getName())){
                    srv_found=true;
                    component_.getRosserviceserver().add(srv_i);
            }}
            if (!srv_found) {
                component_.getRosserviceserver().add(srv);
            }
        }
        for(RosServiceServer srv:ssrs_input_) {
            boolean srv_found = false;
            for (RosServiceServer srv_i:ssrs_input2_) {
                if (srv_i.getName().equals(srv.getName())){
                    srv_found=true;
            }}
            if (!srv_found) {
                component_.getRosserviceserver().add(srv);
            }
        }

        //SERVICE CLIENT
        List<RosServiceClient> scls_input_ = new ArrayList<>();
        scls_input_.addAll(scls_input);

        List<RosServiceClient> scls_input2_ = new ArrayList<>();
        scls_input2_.addAll(scls_input2);
        for(RosServiceClient cli:scls_input2_) {
            boolean cli_found = false;
            for (RosServiceClient cli_i:scls_input_) {
                if (cli_i.getName().equals(cli.getName())){
                    cli_found=true;
                    component_.getRosserviceclient().add(cli_i);
            }}
            if (!cli_found) {
                component_.getRosserviceclient().add(cli);
            }
        }
        for(RosServiceClient cli:scls_input_) {
            boolean cli_found = false;
            for (RosServiceClient cli_i:scls_input2_) {
                if (cli_i.getName().equals(cli.getName())){
                    cli_found=true;
            }}
            if (!cli_found) {
                component_.getRosserviceclient().add(cli);
            }
        }

        //SERVICE SERVER
        List<RosActionServer> asrs_input_ = new ArrayList<>();
        asrs_input_.addAll(asrs_input);

        List<RosActionServer> asrs_input2_ = new ArrayList<>();
        asrs_input2_.addAll(asrs_input2);
        for(RosActionServer srv:asrs_input2_) {
            boolean srv_found = false;
            for (RosActionServer srv_i:asrs_input_) {
                if (srv_i.getName().equals(srv.getName())){
                    srv_found=true;
                    component_.getRosactionserver().add(srv_i);
            }}
            if (!srv_found) {
                component_.getRosactionserver().add(srv);
            }
        }
        for(RosActionServer srv:asrs_input_) {
            boolean srv_found = false;
            for (RosActionServer srv_i:asrs_input2_) {
                if (srv_i.getName().equals(srv.getName())){
                    srv_found=true;
            }}
            if (!srv_found) {
                component_.getRosactionserver().add(srv);
            }
        }

        //ACTION CLIENT
        List<RosActionClient> acls_input_ = new ArrayList<>();
        acls_input_.addAll(acls_input);

        List<RosActionClient> acls_input2_ = new ArrayList<>();
        acls_input2_.addAll(acls_input2);
        for(RosActionClient cli:acls_input2_) {
            boolean cli_found = false;
            for (RosActionClient cli_i:acls_input_) {
                if (cli_i.getName().equals(cli.getName())){
                    cli_found=true;
                    component_.getRosactionclient().add(cli_i);
            }}
            if (!cli_found) {
                component_.getRosactionclient().add(cli);
            }
        }
        for(RosActionClient cli:acls_input_) {
            boolean cli_found = false;
            for (RosActionClient cli_i:acls_input2_) {
                if (cli_i.getName().equals(cli.getName())){
                    cli_found=true;
            }}
            if (!cli_found) {
                component_.getRosactionclient().add(cli);
            }
        }

        return component_;
    }

    public class SelectinputFile extends WizardSelectionPage{
        private Composite container;
        private Text locationPathField;
        private Text locationPathField2;
        private Text locationPathField3;

        private Button browseButton1;
        private Button browseButton2;
        private Button browseButton3;
        private Button browseButton4;

        private boolean minimal_model;


        protected IFile SpecFile;
        protected IFile InputFile;
        protected IContainer ResultFolder;
        private String spec_path;
        private String input_path;
        private String folder_path;

        protected SelectinputFile(String pageId) {
            super(pageId);
        }
        @Override
        public void createControl(Composite parent) {
            container = new Composite(parent, SWT.NONE);
            GridLayout layout = new GridLayout(2, false);
            container.setLayout(layout);
            layout.numColumns = 1;
            Label label1 = new Label(container, SWT.NONE);
            label1.setText("Select a RosSystems model (result from a static analysis)");
            locationPathField = new Text(container, SWT.BORDER | SWT.SINGLE);
            GridData gd = new GridData (GridData.FILL_HORIZONTAL);
            gd.grabExcessHorizontalSpace = true;
            gd.horizontalAlignment = GridData.FILL;
            locationPathField.setLayoutData(gd);
            browseButton1 = new Button(container, SWT.PUSH);
            browseButton1.setText("Browse...");
            browseButton1.addSelectionListener(new SelectionListener() {
                public void widgetDefaultSelected(SelectionEvent e) {
                }
                    public void widgetSelected(SelectionEvent e) {
                        IFile[] files_input = WorkspaceResourceDialog.openFileSelection(getShell(), "Select a RosSystems model (result from a static analysis)", "open", false, null, null);
                        InputFile= files_input[0];
                        input_path = InputFile.getLocation().toString();
                        if (input_path == null) return;
                        locationPathField.setText(InputFile.getName());
                    }
            });
            Label label2 = new Label(container, SWT.NONE);
            label2.setText("RosSystems model (result from a runtime analysis)");
            locationPathField2 = new Text(container, SWT.BORDER | SWT.SINGLE);
            GridData gd2 = new GridData (GridData.FILL_HORIZONTAL);
            gd2.grabExcessHorizontalSpace = true;
            gd2.horizontalAlignment = GridData.FILL;
            locationPathField2.setLayoutData(gd2);
            browseButton2 = new Button(container, SWT.PUSH);
            browseButton2.setText("Browse...");
            browseButton2.addSelectionListener(new SelectionListener() {
                public void widgetDefaultSelected(SelectionEvent e) {
                }
                    public void widgetSelected(SelectionEvent e) {
                        IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), "Select a RosSystems model (result from a runtime analysis)", "open", false, null, null);
                        SpecFile= files[0];
                        spec_path= SpecFile.getLocation().toString();
                        if (spec_path == null) return;
                        locationPathField2.setText(SpecFile.getName());
                    }
            });
            Label label3 = new Label(container, SWT.NONE);
            label3.setText("Path for result model");
            locationPathField3 = new Text(container, SWT.BORDER | SWT.SINGLE);
            GridData gd3 = new GridData (GridData.FILL_HORIZONTAL);
            gd3.grabExcessHorizontalSpace = true;
            gd3.horizontalAlignment = GridData.FILL;
            locationPathField3.setLayoutData(gd3);
            browseButton3 = new Button(container, SWT.PUSH);
            browseButton3.setText("Browse...");
            browseButton3.addSelectionListener(new SelectionListener() {
                public void widgetDefaultSelected(SelectionEvent e) {
                }
                    public void widgetSelected(SelectionEvent e) {
                        IContainer[] path = WorkspaceResourceDialog.openFolderSelection(getShell(), "Select a RosSystems model (result from a runtime analysis)", "open", false, null, null);
                        ResultFolder = path[0];
                        folder_path= ResultFolder.getLocation().toString();
                        if (folder_path == null) return;
                        locationPathField3.setText(ResultFolder.getName());
                    }
            });

            Label label4 = new Label(container, SWT.NONE);
            //label4.setText("Mininal model");
            GridData gd4 = new GridData (GridData.FILL_HORIZONTAL);
            gd4.grabExcessHorizontalSpace = true;
            gd4.horizontalAlignment = GridData.FILL;
            browseButton4 = new Button(container, SWT.CHECK);
            browseButton4.setText("Combine to the minimal model (restrictive strategy)");
            browseButton4.addSelectionListener(new SelectionListener() {
                public void widgetDefaultSelected(SelectionEvent e) {
                }
                    public void widgetSelected(SelectionEvent e) {
                        minimal_model = browseButton4.getSelection();

                    }
            });

            setControl(container);
            setPageComplete(true);
            }

        public IFile getSpecFile() {
            return SpecFile;
        }
        public IFile getInputFile() {
            return InputFile;
        }
        public IFile getResultFile() {
            return ResourcesPlugin.getWorkspace().getRoot().getFile(ResultFolder.getFullPath().append("result.rossystem"));
        }

        public boolean get_minimal_model() {
            return minimal_model;
        }
    }

    @Override
    public void addPages() {
        getInputFileCreationPage = new SelectinputFile("Whatever");
        getInputFileCreationPage.setTitle("Select ROS model input");
        getInputFileCreationPage.setDescription("Select ROS model input");
        addPage(getInputFileCreationPage);
    }

}
