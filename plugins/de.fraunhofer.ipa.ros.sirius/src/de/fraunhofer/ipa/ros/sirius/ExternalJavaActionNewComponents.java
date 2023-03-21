package de.fraunhofer.ipa.ros.sirius;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import componentInterface.presentation.ComponentInterfaceEditorPlugin;
import componentInterface.presentation.ComponentInterfaceModelWizardOnlyRosInputModel;


public class ExternalJavaActionNewComponents implements IExternalJavaAction {

    public IFile modelFile;
    protected IWorkbench workbench;
    protected IStructuredSelection selection;
    public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
    protected ExecutionEvent event;

    public ExternalJavaActionNewComponents() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> arg0) {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void execute(Collection<? extends EObject> arg0, Map<String, Object> arg1) {
        Display display = Display.getDefault();
        Shell activeShell = display.getActiveShell();
        ComponentInterfaceModelWizardOnlyRosInputModel wizard = new ComponentInterfaceModelWizardOnlyRosInputModel();
        wizard.init(PlatformUI.getWorkbench(), new StructuredSelection(), arg0, arg1);
        WizardDialog dialog = new WizardDialog(activeShell,wizard);
        dialog.create();
        dialog.getShell().setText(wizard.getWindowTitle());
        dialog.open();
    }
}
