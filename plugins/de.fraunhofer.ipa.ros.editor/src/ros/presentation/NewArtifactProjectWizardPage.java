package ros.presentation;

import java.util.Collection;
import java.util.MissingResourceException;
import java.util.StringTokenizer;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

import ros.provider.RosEditPlugin;

/**
 * The "New" wizard page allows setting the container for the new file as well
 * as the file name. The page will only accept file name without the extension
 * OR with the extension that matches the expected one (mpe).
 */

public class NewArtifactProjectWizardPage extends WizardPage {
    private Text ProjectText;

    /**
     * Constructor for NewCodeGenProjectWizardPage.
     *
     * @param pageName
     */
    public NewArtifactProjectWizardPage(ISelection selection) {
        super("wizardPage");
        setTitle("New ROS Component project");
        setDescription("This wizard creates a new ROS project");
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

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ModifyListener validator =
        new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                setPageComplete(validatePage());
            }
        };

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected boolean validatePage() {
        return true;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
    }

    /**
     * Returns the label for the specified type name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected String getLabel(String typeName) {
        try {
            return RosEditPlugin.INSTANCE.getString("_UI_" + typeName + "_type");
        }
        catch(MissingResourceException mre) {
            RosEditorPlugin.INSTANCE.log(mre);
        }
        return typeName;
    }

    public String getProjectName() {
        return ProjectText.getText();
    }

}
