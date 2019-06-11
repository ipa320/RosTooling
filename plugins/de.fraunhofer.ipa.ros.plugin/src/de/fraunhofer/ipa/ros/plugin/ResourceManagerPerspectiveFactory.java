package de.fraunhofer.ipa.ros.plugin;

import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IFolderLayout;
 
public class ResourceManagerPerspectiveFactory implements IPerspectiveFactory {
 
    private static final String NAVIGATOR_VIEW_ID = "de.fraunhofer.ipa.ros.ResourceManagerView";
     
    @Override
    public void createInitialLayout(IPageLayout myLayout) {
		defineActions(myLayout);
		defineLayout(myLayout);
    }
    
    public void defineActions(final IPageLayout myLayout) {
    	myLayout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder"); //$NON-NLS-1$ 
    	myLayout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file"); //$NON-NLS-1$
    	myLayout.addNewWizardShortcut("RosDeveloper");
    	myLayout.addShowViewShortcut(IPageLayout.ID_BOOKMARKS);
    	myLayout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
    	myLayout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
    	myLayout.addShowViewShortcut(IPageLayout.ID_TASK_LIST);
    	myLayout.addShowViewShortcut(IPageLayout.ID_PROJECT_EXPLORER);
    }
    
    protected void defineLayout(final IPageLayout layout) {
        // Editors are placed for free.
        String editorArea = layout.getEditorArea();

        // Place navigator and outline to left of editor area.
        IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, (float) 0.26, editorArea);
        left.addView(IPageLayout.ID_OUTLINE);
        left.addView(NAVIGATOR_VIEW_ID);
    }

}
