package de.fraunhofer.ipa.ros.sirius;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import ros.Parameter;
import ros.ParameterBoolean;
import ros.ParameterStringType;
import ros.ParameterType;
import ros.impl.ParameterBooleanImpl;
import ros.impl.ParameterBooleanTypeImpl;
import ros.impl.ParameterDateTypeImpl;
import ros.impl.ParameterDoubleTypeImpl;
import ros.impl.ParameterImpl;
import ros.impl.ParameterIntegerTypeImpl;
import ros.impl.ParameterStringImpl;
import ros.impl.ParameterStringTypeImpl;
import ros.impl.ParameterTypeImpl;


public class ExternalJavaActionNewParameter implements IExternalJavaAction {
    public IFile modelFile;
    protected IWorkbench workbench;
    protected IStructuredSelection selection;
    //public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
    protected ExecutionEvent event;

    public ExternalJavaActionNewParameter() {
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
        ElementListSelectionDialog dlg = new ElementListSelectionDialog(activeShell, new LabelProvider());
        dlg.setTitle("ParameterType");
        dlg.setMessage("Select a type for your parameter (* = any string, ? = any char):");
        Collection <Parameter> param_collection = (Collection<Parameter>) arg0;
        Parameter param = param_collection.iterator().next();
        ParameterType type = null;

        dlg.setElements( new Object[] {"Boolean","String","Integer","Date","Double"});
        dlg.open();

        Object selected_type = dlg.getFirstResult();
        if (selected_type.toString() == "Boolean") {
            type = new ParameterBooleanTypeImpl();
        }
        if (selected_type.toString() == "String") {
            type = new ParameterStringTypeImpl();
        }
        if (selected_type.toString() == "Integer") {
            type = new ParameterIntegerTypeImpl();
        }
        if (selected_type.toString() == "Date") {
            type = new ParameterDateTypeImpl();
        }
        if (selected_type.toString() == "Double") {
            type = new ParameterDoubleTypeImpl();
        }
        param.setType(type);


}
}
