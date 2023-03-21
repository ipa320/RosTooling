package de.fraunhofer.ipa.ros.sirius;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.IWorkbench;
import componentInterface.ComponentInterface;
import componentInterface.RosActionClient;
import componentInterface.RosActionServer;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import rossystem.ActionConnection;
import rossystem.RosSystem;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;
import rossystem.impl.ActionConnectionImpl;
import rossystem.impl.RosSystemImpl;
import rossystem.impl.ServiceConnectionImpl;
import rossystem.impl.TopicConnectionImpl;

public class AutoConnect implements IExternalJavaAction {
    public IFile modelFile;
    protected IWorkbench workbench;
    protected IStructuredSelection selection;
    // public static final List<String> FILE_EXTENSIONS =
    // Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
    protected ExecutionEvent event;

    public AutoConnect() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> arg0) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
        boolean duplicated = false;
        for (EObject diagram : arg0) {
            List<DView> owned_views = ConnectionsCheckUtils.getDiagramViews(diagram);
            for (DView view : owned_views) {
                for (EObject rossystemEObj : view.getModels()) {
                    RosSystemImpl rossystem = ((RosSystemImpl)rossystemEObj);
                    for (ComponentInterface component : rossystem.getRosComponent()) {
                        for (RosPublisher rospub : component.getRospublisher()) {
                            for (ComponentInterface component2 : rossystem.getRosComponent()) {
                                for (RosSubscriber rossub : component2.getRossubscriber()) {
                                    if (ConnectionsCheckUtils.containEqualCommunicationObjects(
                                            rospub.getPublisher().getMessage(), rossub.getSubscriber().getMessage())) {
                                        if (rospub.eContainer() != rossub.eContainer()) {
                                            duplicated = false;
                                            System.out.println("Possible Topic Connection found [" + rospub.eContainer()
                                                    + "]" + rospub.getName() + "->[" + rossub.eContainer() + "]"
                                                    + rossub.getName());
                                            // Check if connection already exists
                                            duplicated = ConnectionsCheckUtils
                                                    .isDuplicatedTopicConnection(rossystem, rospub, rossub);
                                            if (!duplicated) {
                                                TopicConnection topic_connection = new TopicConnectionImpl();
                                                topic_connection.setTopicName(rospub.getName());
                                                topic_connection.getFrom().add(rospub);
                                                topic_connection.getTo().add(rossub);
                                                rossystem.getTopicConnections().add(topic_connection);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (RosServiceClient rosscl : component.getRosserviceclient()) {
                            for (ComponentInterface component2 : ((RosSystem) rossystem).getRosComponent()) {
                                for (RosServiceServer rosss : component2.getRosserviceserver()) {
                                    if (ConnectionsCheckUtils.containEqualCommunicationObjects(
                                            rosscl.getSrvclient().getService(), rosss.getSrvserver().getService())) {
                                        if (rosscl.eContainer() != rosss.eContainer()) {
                                            duplicated = false;
                                            System.out.println("Possible Service Connection found ["
                                                    + rosscl.eContainer() + "]" + rosscl.getName() + "->["
                                                    + rosss.eContainer() + "]" + rosss.getName());
                                            // Check if connection already exists
                                            duplicated = ConnectionsCheckUtils.isDuplicatedServiceConnection(
                                                    rossystem, rosss, rosscl);
                                            if (!duplicated) {
                                                ServiceConnection srv_connection = new ServiceConnectionImpl();
                                                srv_connection.setServiceName(rosscl.getName());
                                                srv_connection.setTo(rosscl);
                                                srv_connection.getFrom().add(rosss);
                                                rossystem.getServiceConnections().add(srv_connection);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        for (RosActionClient rosac : component.getRosactionclient()) {
                            for (ComponentInterface component2 : rossystem.getRosComponent()) {
                                for (RosActionServer rosas : component2.getRosactionserver()) {
                                    if (ConnectionsCheckUtils.containEqualCommunicationObjects(
                                            rosac.getActclient().getAction(), rosas.getActserver().getAction())) {
                                        if (rosac.eContainer() != rosas.eContainer()) {

                                            System.out.println("Possible Action Connection found [" + rosac.eContainer()
                                                    + "]" + rosac.getName() + "->[" + rosas.eContainer() + "]"
                                                    + rosas.getName());
                                            // Check if connection already exists
                                            duplicated = ConnectionsCheckUtils
                                                    .isDuplicatedActionConnection(rossystem, rosac, rosas);
                                            if (!duplicated) {
                                                ActionConnection action_connection = new ActionConnectionImpl();
                                                action_connection.setActionName(rosac.getName());
                                                action_connection.setFrom(rosas);
                                                action_connection.setTo(rosac);
                                                rossystem.getActionConnections().add(action_connection);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

}
