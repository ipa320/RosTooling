package de.fraunhofer.ipa.ros.sirius;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import ros.Parameter;
import ros.impl.NodeImpl;



public class ParametersView implements IExternalJavaAction { 

	public IFile modelFile;
	protected IWorkbench workbench;
	protected IStructuredSelection selection;
	protected ExecutionEvent event;
	
	public ParametersView() {
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
				for (EObject rossystemEObj : view.getModels()) {
					NodeImpl rosnode = ((NodeImpl)rossystemEObj);
					System.out.println(rosnode.getParameter());
				}
			}}
	    Display display = Display.getDefault();
    	Shell activeShell = display.getActiveShell();
    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	System.out.println(arg0.toString());
    	System.out.println(arg1.toString());

    	/**ParametersWizard wizard = new ParametersWizard();
    	wizard.init(PlatformUI.getWorkbench(), new StructuredSelection(), arg0, arg1);
    	WizardDialog dialog = new WizardDialog(activeShell,wizard);
    	dialog.create();
    	dialog.getShell().setText(wizard.getWindowTitle());
    	dialog.open();*/
	}
}
