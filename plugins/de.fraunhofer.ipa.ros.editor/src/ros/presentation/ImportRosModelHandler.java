package ros.presentation;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class ImportRosModelHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) {
        Shell activeShell = HandlerUtil.getActiveShell(event);
        ImportRosModel wizard = new ImportRosModel();
        wizard.init(PlatformUI.getWorkbench(), new StructuredSelection());
        WizardDialog dialog = new WizardDialog(activeShell,wizard);
        dialog.create();
        dialog.getShell().setText(wizard.getWindowTitle());
        int result = dialog.open();
        return null;
    }

}
