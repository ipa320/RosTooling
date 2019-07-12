package de.fraunhofer.ipa.ros.sirius;

import java.util.Collection;
import java.util.Iterator;
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
import rossystem.RosSystem;

import rossystem.ActionConnection;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;


public class RemoveAllConnections implements IExternalJavaAction { 
	public IFile modelFile;
	protected IWorkbench workbench;
	protected IStructuredSelection selection;
	//public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
	protected ExecutionEvent event;
	
	public RemoveAllConnections() {
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
						Iterator<TopicConnection> it = ((RosSystem)rossystem).getTopicConnections().iterator();
						while (it.hasNext()) {
							it.next();
						    it.remove();
						}
						Iterator<ServiceConnection> is = ((RosSystem)rossystem).getServiceConnections().iterator();
						while (is.hasNext()) {
							is.next();
						    is.remove();
						}
						Iterator<ActionConnection> ia = ((RosSystem)rossystem).getActionConnections().iterator();
						while (ia.hasNext()) {
							ia.next();
							ia.remove();
						}
				}}}
		 }
	}
}




