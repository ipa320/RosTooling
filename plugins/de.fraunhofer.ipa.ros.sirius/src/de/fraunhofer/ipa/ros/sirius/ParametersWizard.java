package de.fraunhofer.ipa.ros.sirius;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardSelectionPage;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import componentInterface.ComponentInterface;
import componentInterface.RosActionClient;
import componentInterface.RosActionServer;
import componentInterface.RosParameter;
import componentInterface.RosPublisher;
import componentInterface.RosServiceClient;
import componentInterface.RosServiceServer;
import componentInterface.RosSubscriber;
import componentInterface.impl.RosActionClientImpl;
import componentInterface.impl.RosActionServerImpl;
import componentInterface.impl.RosParameterImpl;
import componentInterface.impl.RosPublisherImpl;
import componentInterface.impl.RosServiceClientImpl;
import componentInterface.impl.RosServiceServerImpl;
import componentInterface.impl.RosSubscriberImpl;
import ros.ActionClient;
import ros.ActionServer;
import ros.Artifact;
import ros.Node;
import ros.Package;
import ros.PackageSet;
import ros.Publisher;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;
import ros.Parameter;
import rossystem.RosSystem;

/**
 * This is a simple wizard for creating a new model file.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParametersWizard extends Wizard implements INewWizard {

	protected IStructuredSelection selection;
	protected IWorkbench workbench;
	public FileDialog fDialog;
	public String ComponentName;
	public String ComponentNameSpace;
	public String NameSpaceInterfaces;
	//public ComponentInterface CI_input;
	public IProject project;
	public EObject eobject;


	public void init(IWorkbench workbench, IStructuredSelection selection, Collection<? extends EObject> node, Map<String, Object> nameSpace) {
		this.workbench = workbench;
		this.selection = selection;
		try {

			project = workbench.getActiveWorkbenchWindow().getActivePage().getActiveEditor().getEditorInput().getAdapter(IResource.class).getProject();
			setWindowTitle("Ros node parameters");
		}finally{
			
		}
		}

	@Override
	public boolean performFinish() {
		try {
			

			WorkspaceModifyOperation operation =
				new WorkspaceModifyOperation() {
					@Override
					protected void execute(IProgressMonitor progressMonitor) {
						try {
							
					}catch (Exception exception) {
					}
					finally {
						progressMonitor.done();
					}
					}};
			getContainer().run(false, false, operation);
			return true;
		}catch (Exception exception) {
			return false;
		}
	}



	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub
		
	}

}
