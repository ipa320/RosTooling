package de.fraunhofer.ipa.ros.sirius;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.ui.IWorkbench;

import rossystem.ActionConnection;
import rossystem.ServiceConnection;
import rossystem.TopicConnection;
import rossystem.impl.RosSystemImpl;

public class RemoveAllConnections implements IExternalJavaAction {
    public IFile modelFile;
    protected IWorkbench workbench;
    protected IStructuredSelection selection;
    // public static final List<String> FILE_EXTENSIONS =
    // Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
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
        for (EObject diagram : arg0) {
            List<DView> owned_views = ConnectionsCheckUtils.getDiagramViews(diagram);
            for (DView view : owned_views) {
                for (EObject rossystem : view.getModels()) {
                    Iterator<TopicConnection> it = ((RosSystemImpl) rossystem).getTopicConnections().iterator();
                    while (it.hasNext()) {
                        it.next();
                        it.remove();
                    }
                    Iterator<ServiceConnection> is = ((RosSystemImpl) rossystem).getServiceConnections().iterator();
                    while (is.hasNext()) {
                        is.next();
                        is.remove();
                    }
                    Iterator<ActionConnection> ia = ((RosSystemImpl) rossystem).getActionConnections().iterator();
                    while (ia.hasNext()) {
                        ia.next();
                        ia.remove();
                    }
                }
            }
        }
    }
}
