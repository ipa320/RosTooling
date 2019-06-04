package de.fraunhofer.ipa.ros.plugin;

import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IFolderLayout;
 
public class ResourceManagerPerspectiveFactory implements IPerspectiveFactory {
 
    private static final String NAVIGATOR_VIEW_ID = "de.fraunhofer.ipa.ros.ResourceManagerView";
 
    private static final String BOTTOM = "bottom";
    
    @Override
    public void createInitialLayout(IPageLayout myLayout) {
		defineBaseActions(myLayout);
		defineBaseLayout(myLayout);
    }
    
    public void defineBaseActions(final IPageLayout myLayout) {
    	myLayout.addNewWizardShortcut("org.eclipse.ui.wizards.new.folder"); //$NON-NLS-1$ 
    	myLayout.addNewWizardShortcut("org.eclipse.ui.wizards.new.file"); //$NON-NLS-1$

    	myLayout.addNewWizardShortcut("componentInterface.presentation.ComponentInterfaceModelWizardID");
        myLayout.addShowViewShortcut(NAVIGATOR_VIEW_ID);
        myLayout.addShowViewShortcut(IPageLayout.ID_PROP_SHEET);
        myLayout.addShowViewShortcut(IPageLayout.ID_OUTLINE);
        myLayout.addShowViewShortcut(IPageLayout.ID_PROBLEM_VIEW);
        defineCustomActions(myLayout);

    	
    }
    
    protected void defineBaseLayout(final IPageLayout layout) {
        final String editorArea = layout.getEditorArea();
        layout.addView(NAVIGATOR_VIEW_ID, IPageLayout.LEFT, (float) 0.25, editorArea);
        layout.addView(IPageLayout.ID_OUTLINE, IPageLayout.BOTTOM, 0.50f, NAVIGATOR_VIEW_ID);

        defineCustomLayout(layout);
        
        // Place problem, properties and advance views to bottom of editor area.
        final IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, (float) 0.65, editorArea); //$NON-NLS-1$
        bottom.addView(IPageLayout.ID_PROP_SHEET);
        addBottomViews(bottom);
        bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
        bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
        bottom.addView(IPageLayout.ID_PROGRESS_VIEW);
    }
    
	
	protected void defineCustomActions(IPageLayout layout) {
		layout.addNewWizardShortcut("componentInterface.presentation.ComponentInterfaceModelWizardID");
	}

	
	protected void defineCustomLayout(IPageLayout layout) {
		
	}

	
	protected void addBottomViews(IFolderLayout bottom) {
		bottom.addView("org.sirius.component.design.ComponentParamView");
	}
}
