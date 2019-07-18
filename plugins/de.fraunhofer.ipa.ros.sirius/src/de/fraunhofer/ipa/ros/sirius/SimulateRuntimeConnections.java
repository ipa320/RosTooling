package de.fraunhofer.ipa.ros.sirius;

import java.util.Collection;
import java.util.Map;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DAnalysis;
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
import rossystem.impl.ServiceConnectionImpl;
import rossystem.impl.TopicConnectionImpl;


public class SimulateRuntimeConnections implements IExternalJavaAction { 
	public IFile modelFile;
	protected IWorkbench workbench;
	protected IStructuredSelection selection;
	//public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
	protected ExecutionEvent event;
	
	public SimulateRuntimeConnections() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
		Collection<Session> sessions = SessionManager.INSTANCE.getSessions(); 
		String representation_name = arg0.toString().substring(arg0.toString().indexOf("name:")+6,arg0.toString().indexOf(") (synchronized"));
		boolean duplicated=false;
		 for (Session session:sessions) {
			 DAnalysis slaveAnalysis=(DAnalysis)session.getSessionResource().getContents().get(0);
			 EList<DView> owned_views = slaveAnalysis.getOwnedViews();
			 for (DView view:owned_views) {
				 if (view.getOwnedRepresentationDescriptors().toString().contains(representation_name)) {
					for (EObject rossystem:view.getModels()) {
						for (ComponentInterface component:((RosSystem) rossystem).getRosComponent()) {
							for (RosPublisher rospub:component.getRospublisher()) {
								for (ComponentInterface component2:((RosSystem) rossystem).getRosComponent()) {
									for (RosSubscriber rossub:component2.getRossubscriber()) {
										if (rospub.getPublisher().getMessage()==rossub.getSubscriber().getMessage() && rospub.getName().equals(rossub.getName())) {
											if (rospub.getPublisher().eContainer() != rossub.getSubscriber().eContainer()) {
												duplicated=false;
												System.out.println("Topic Connection found ["+rospub.getPublisher().eContainer()+"]"+rospub.getPublisher().getName()+"->["+rossub.getSubscriber().eContainer()+"]"+rossub.getSubscriber().getName());
												//Check if connection already exists
												for (TopicConnection topic_con:((RosSystem)rossystem).getTopicConnections()){
													for (RosPublisher pub_con:topic_con.getFrom()) {
														for(RosSubscriber sub_con:topic_con.getTo()) {
															if (pub_con==rospub && sub_con==rossub) {
																
																duplicated=true;
												}}}}
												if (!duplicated){
													TopicConnection topic_connection = new TopicConnectionImpl();
													topic_connection.setTopicName(rospub.getName());
													topic_connection.getFrom().add(rospub);
													topic_connection.getTo().add(rossub);
													((RosSystem)rossystem).getTopicConnections().add(topic_connection);
												}
							}}}}}
							for (RosServiceClient rosscl:component.getRosserviceclient()) {
								for (ComponentInterface component2:((RosSystem) rossystem).getRosComponent()) {
									for (RosServiceServer rosss:component2.getRosserviceserver()) {
										if (rosscl.getSrvclient().getService()==rosss.getSrvserver().getService() && rosscl.getName().equals(rosss.getName())) {
											if (rosscl.getSrvclient().eContainer() != rosss.getSrvserver().eContainer()) {
												duplicated=false;
												System.out.println("Service Connection found ["+rosscl.getSrvclient().eContainer()+"]"+rosscl.getSrvclient().getName()+"->["+rosss.getSrvserver().eContainer()+"]"+rosss.getSrvserver().getName());
												//Check if connection already exists
												for (ServiceConnection srv_con:((RosSystem)rossystem).getServiceConnections()){
													for (RosServiceServer srvs_con:srv_con.getFrom()) {
														if (srvs_con==rosss && srv_con==rosscl) {
																duplicated=true;
												}}}}
												if (!duplicated){
													ServiceConnection srv_connection = new ServiceConnectionImpl();
													srv_connection.setServiceName(rosscl.getName());
													srv_connection.setTo(rosscl);
													srv_connection.getFrom().add(rosss);
													if (!(((RosSystem)rossystem).getServiceConnections().contains(srv_connection))){
														((RosSystem)rossystem).getServiceConnections().add(srv_connection);
												}
							}}}}}
							for (RosActionClient rosac:component.getRosactionclient()) {
								for (ComponentInterface component2:((RosSystem) rossystem).getRosComponent()) {
									for (RosActionServer rosas:component2.getRosactionserver()) {
										if (rosac.getActclient().getAction()==rosas.getActserver().getAction() && rosac.getName().equals(rosas.getName())) {
											if (rosac.getActclient().eContainer() != rosas.getActserver().eContainer()) {
												duplicated=false;
												System.out.println("Action Connection found ["+rosac.getActclient().eContainer()+"]"+rosac.getActclient().getName()+"->["+rosas.getActserver().eContainer()+"]"+rosas.getActserver().getName());
												//Check if connection already exists
												for (ActionConnection act_con:((RosSystem)rossystem).getActionConnections()){
													if (rosac==act_con && rosas==act_con) {
														duplicated=true;
												}}}
												if (!duplicated){
												ActionConnection action_connection = new ActionConnectionImpl();
												action_connection.setActionName(rosac.getName());
												action_connection.setFrom(rosas);
												action_connection.setTo(rosac);
												if (!(((RosSystem)rossystem).getActionConnections().contains(action_connection))){
													((RosSystem)rossystem).getActionConnections().add(action_connection);
												}
							}}}}}
					}}}}
		 }
	}
}




