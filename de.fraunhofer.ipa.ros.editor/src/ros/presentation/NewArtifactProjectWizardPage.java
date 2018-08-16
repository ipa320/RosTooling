package ros.presentation;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class NewArtifactProjectWizardPage extends WizardPage {
	private Text ProjectText;
	private ISelection selection;

	/**
	 * Constructor for NewCodeGenProjectWizardPage.
	 * 
	 * @param pageName
	 */
	public NewArtifactProjectWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("New ROS Artifact project");
		setDescription("This wizard creates a new ROS artifact project");
		//this.workbench = workbench;
	}

	
	public void createControl(Composite parent) {
		Composite Project = new Composite(parent, SWT.NULL);
        GridLayout layout = new GridLayout();
        Project.setLayout(layout);
        layout.numColumns = 2;
        Label label = new Label(Project, SWT.NONE);
        label.setText("Project name");

        ProjectText = new Text(Project, SWT.BORDER | SWT.SINGLE);
        ProjectText.setText("");
        ProjectText.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (!ProjectText.getText().isEmpty()) {
                    setPageComplete(true);

                }
            }

        });
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
        ProjectText.setLayoutData(gd);
        // required to avoid an error in the system
        setControl(Project);
        setPageComplete(false);

    }

    public String getProjectName() {
        return ProjectText.getText();
    }

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1)
				return;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer)
					container = (IContainer) obj;
				else
					container = ((IResource) obj).getParent();
				ProjectText.setText(container.getFullPath().toString());
			}
		}
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the container field.
	 */

	private void handleProjectBrowse() {
		DirectoryDialog dialog = new DirectoryDialog(getShell());			
		String dialogResult = dialog.open();
		if (dialogResult != null) {
			ProjectText.setText(dialogResult);
		}
	}

	
	/**
	 * Ensures that both text fields are set.
	 */

	private void dialogChanged() {
		return;
	}

}
