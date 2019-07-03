package de.fraunhofer.ipa.ros.sirius;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import componentInterface.ComponentInterface;
import componentInterface.RosPublisher;
import componentInterface.RosSubscriber;
import rossystem.RosSystem;
import ros.Publisher;
import ros.impl.PublisherImpl;
import ros.Node;


public class AutoConnect implements IExternalJavaAction { 
	public IFile modelFile;
	protected IWorkbench workbench;
	protected IStructuredSelection selection;
	//public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
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
		Collection<Session> sessions = SessionManager.INSTANCE.getSessions(); 
		String representation_name = arg0.toString().substring(arg0.toString().indexOf("name:")+6,arg0.toString().indexOf(") (synchronized"));
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
										if (rospub.getPublisher().getMessage() == rossub.getSubscriber().getMessage()) {
											if (rospub.getPublisher().eContainer() != rossub.getSubscriber().eContainer()) {
												System.out.println("!!!!Matched found");
												System.out.println(rospub.getName());
												System.out.println(rossub.getName());
											}
										}
								}
							}
		}}}}
}}}}




