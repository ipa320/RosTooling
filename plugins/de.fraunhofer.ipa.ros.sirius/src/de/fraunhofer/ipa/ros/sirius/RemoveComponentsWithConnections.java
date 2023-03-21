package de.fraunhofer.ipa.ros.sirius;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.ui.IWorkbench;

import componentInterface.RosActionClient;
import componentInterface.RosActionServer;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import componentInterface.impl.ComponentInterfaceImpl;
import rossystem.ActionConnection;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;
import rossystem.impl.RosSystemImpl;

public class RemoveComponentsWithConnections implements IExternalJavaAction {
    public IFile modelFile;
    protected IWorkbench workbench;
    protected IStructuredSelection selection;
    // public static final List<String> FILE_EXTENSIONS =
    // Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
    protected ExecutionEvent event;

    public RemoveComponentsWithConnections() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> arg0) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {

        for (EObject component:arg0) {
            ComponentInterfaceImpl selected_component = (ComponentInterfaceImpl) component;
            RosSystemImpl system = (RosSystemImpl) component.eContainer();
            System.out.println(system.eContents());
            System.out.println(selected_component);
            System.out.println(system.getTopicConnections());
            ArrayList<TopicConnection> TopicConnectionsToRemove = new ArrayList<TopicConnection>();
            ArrayList<ServiceConnection> ServiceConnectionsToRemove = new ArrayList<ServiceConnection>();
            ArrayList<ActionConnection> ActionConnectionsToRemove = new ArrayList<ActionConnection>();

            for (TopicConnection topic_connection: system.getTopicConnections()) {
                for (RosPublisher rospub:selected_component.getRospublisher()) {
                    for (RosPublisher from: topic_connection.getFrom()) {
                        if (rospub.equals(from)){
                            if (topic_connection.getFrom().size()>1){
                                topic_connection.getFrom().remove(rospub);
                            }else {
                                TopicConnectionsToRemove.add(topic_connection);
                            }
                        }
                    }
                for (RosSubscriber rossub:selected_component.getRossubscriber()) {
                    for (RosSubscriber to: topic_connection.getTo()) {
                        if (rossub.equals(to)){
                            if (topic_connection.getTo().size()>1){
                                topic_connection.getTo().remove(rossub);
                            }else {
                                TopicConnectionsToRemove.add(topic_connection);
                            }
                        }
                    }
                }
            }
            for (ServiceConnection service_connection: system.getServiceConnections()) {
                for (RosServiceServer rossrv:selected_component.getRosserviceserver()) {
                    for (RosServiceServer from: service_connection.getFrom()) {
                        if (rossrv.equals(from)){
                            if (service_connection.getFrom().size()>1){
                                service_connection.getFrom().remove(rossrv);
                            }else {
                                ServiceConnectionsToRemove.add(service_connection);
                            }
                        }
                    }
                for (RosServiceClient rossrvcli:selected_component.getRosserviceclient()) {
                        if (rossrvcli.equals(service_connection.getTo())){
                            ServiceConnectionsToRemove.add(service_connection);
                        }
                    }
                }
            }
            for (ActionConnection action_connection: system.getActionConnections()) {
                for (RosActionServer rosact:selected_component.getRosactionserver()) {
                        if (rosact.equals(action_connection.getFrom())){
                            ActionConnectionsToRemove.add(action_connection);
                        }
                    }
                for (RosActionClient rosactcli:selected_component.getRosactionclient()) {
                        if (rosactcli.equals(action_connection.getTo())){
                            ActionConnectionsToRemove.add(action_connection);
                        }
                    }
                }
            }
            for( TopicConnection connection:TopicConnectionsToRemove) { system.getTopicConnections().remove(connection);}
            for( ServiceConnection connection:ServiceConnectionsToRemove) { system.getServiceConnections().remove(connection);}
            for( ActionConnection connection:ActionConnectionsToRemove) { system.getActionConnections().remove(connection);}

            system.getRosComponent().remove(selected_component);
        }
    }
}
