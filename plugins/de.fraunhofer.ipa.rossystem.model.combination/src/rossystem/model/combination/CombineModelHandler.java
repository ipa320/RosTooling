package rossystem.model.combination;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class CombineModelHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) {
        Shell activeShell = HandlerUtil.getActiveShell(event);
        CombineModelsWizard wizard = new CombineModelsWizard();
        wizard.init(PlatformUI.getWorkbench(), new StructuredSelection());
        WizardDialog dialog = new WizardDialog(activeShell,wizard);
        dialog.create();
        dialog.getShell().setText("Combine ROS System Models");
        int result = dialog.open();
        return null;
    }

}
