package de.fraunhofer.ipa.ros.sirius;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import ros.Parameter;
import ros.ParameterType;
import ros.impl.ParameterArrayTypeImpl;
import ros.impl.ParameterBase64TypeImpl;
import ros.impl.ParameterBooleanTypeImpl;
import ros.impl.ParameterDateTypeImpl;
import ros.impl.ParameterDoubleTypeImpl;
import ros.impl.ParameterIntegerTypeImpl;
import ros.impl.ParameterStringTypeImpl;


public class ExternalJavaActionNewParameter implements IExternalJavaAction { 

	public IFile modelFile;
	protected IWorkbench workbench;
	protected IStructuredSelection selection;
	//public static final List<String> FILE_EXTENSIONS = Collections.unmodifiableList(Arrays.asList(ComponentInterfaceEditorPlugin.INSTANCE.getString("_UI_ComponentInterfaceEditorFilenameExtensions").split("\\s*,\\s*")));
	protected ExecutionEvent event;
	EList<ParameterType> subtypes;
	EList<String> subtypes_;
	EList<Combo> combos;
	EList<String> subtypes_string;

	
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

		dlg.setElements( new Object[] {"Boolean","String","Integer","Double","Base64", "Array"});/** "List","Struc","Date"*/
		dlg.open();
		
		Object selected_type = dlg.getFirstResult();
		type = GetSelectedType(selected_type.toString(), activeShell);
		/**if (selected_type.toString() == "List") {
			type = new ParameterListTypeImpl();
		}
		if (selected_type.toString() == "Struc") {
			type = new ParameterStructTypeImpl();
		}*/
		param.setType(type);
	}
	
	@SuppressWarnings("null")
	public ParameterType GetSelectedType(String selected_type, Shell activeShell) {
		ParameterType type = null;
		if (selected_type== "Boolean") {
			type = new ParameterBooleanTypeImpl();
		}
		if (selected_type == "String") {
			type = new ParameterStringTypeImpl();
		}
		if (selected_type == "Integer") {
			type = new ParameterIntegerTypeImpl();
		}
		/**if (selected_type == "Date") {
			type = new ParameterDateTypeImpl();
		}*/
		if (selected_type.toString() == "Double") {
			type = new ParameterDoubleTypeImpl();
		}
		if (selected_type.toString() == "Base64") {
			type = new ParameterBase64TypeImpl();
		}
		if (selected_type.toString() == "Array") {
			ParameterType subtype = null;
			type = new ParameterArrayTypeImpl();
			ElementListSelectionDialog dlg = new ElementListSelectionDialog(activeShell, new LabelProvider());
			dlg.setTitle("ArraySubtype");
			dlg.setMessage("Select a type for the elements of your Array:");
			dlg.setElements( new Object[] {"Boolean","String","Integer","Date","Double","Base64", "List", "Array","Struc"});
			dlg.open();
			Object selected_subtype = dlg.getFirstResult();
			subtype = GetSelectedType(selected_subtype.toString(), activeShell);
			((ParameterArrayTypeImpl) type).setType(subtype);
		}
		/**if (selected_type.toString() == "List") {
			EList<Combo> combos = null;
			type = new ParameterListTypeImpl();

			InputDialog dlg = new InputDialog(activeShell, "Lenght of the list parameter", null, "2",null);
	    	int lenght = 0;
		    if (dlg.open() == 0) {
		    	String param = dlg.getValue();
		    	try {
		    		lenght = Integer.parseInt(param);
		    	} catch (NumberFormatException e){
		    		 lenght = 1;
		    	}
		    }	
	    	for (int i=1;i<lenght+1;i++) {
	    		subtypes.add(GetSelectedType("String",activeShell));
	    	}
		    	
	        GridLayout gridLayout = new GridLayout();
	        gridLayout.numColumns = 1;
	        activeShell.setLayout(gridLayout);
    	    new Label(activeShell, SWT.NULL).setText("List parameter definition: ");
    		Combo combo = new Combo(activeShell, SWT.DOWN);

	    	for (int i=1;i<lenght+1;i++) {
	    		String items[] = { "Boolean","String","Integer","Date","Double","Base64"};
	    		GridData gridData = new GridData(GridData.CENTER);
	    		gridData.horizontalSpan = 1;
	    	    new Label(activeShell, SWT.NULL).setText("Type element "+ i +" :");
	    		combo.setItems(items);
	    		combo.setLayoutData(gridData);
			    activeShell.pack();
			    activeShell.open();
	    	}

		    while (!activeShell.isDisposed()) {
		    	if (!activeShell.getDisplay().readAndDispatch ()) 
		    		activeShell.getDisplay().sleep ();
		     }

		    for (int i=0; i<subtypes.size(); i++) {
		    	((ParameterListTypeImpl) type).getSequence().add(subtypes.get(i));
		    }
		}*/

		return type;
	}
}

