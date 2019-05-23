package de.fraunhofer.ipa.ros.sirius;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import ros.Parameter;
import ros.ParameterBoolean;
import ros.ParameterType;
import ros.impl.ParameterAnyTypeImpl;
import ros.impl.ParameterArrayTypeImpl;
import ros.impl.ParameterBase64TypeImpl;
import ros.impl.ParameterBooleanTypeImpl;
import ros.impl.ParameterDateTypeImpl;
import ros.impl.ParameterDoubleTypeImpl;
import ros.impl.ParameterIntegerTypeImpl;
import ros.impl.ParameterListTypeImpl;
import ros.impl.ParameterStringTypeImpl;
import ros.impl.ParameterStructTypeImpl;


public class ExternalJavaActionNewParameter implements IExternalJavaAction { 
	protected ParameterBoolean default_;
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
		//ParameterSetDialog dlg = new ParameterSetDialog(activeShell, new LabelProvider());
		ElementListSelectionDialog dlg = new ElementListSelectionDialog(activeShell, new LabelProvider());
		dlg.setTitle("ParameterType");
		dlg.setMessage("Select a type for your parameter (* = any string, ? = any char):");
		Collection <Parameter> param_collection = (Collection<Parameter>) arg0;
		Parameter param = param_collection.iterator().next();
		ParameterType type = null;

		dlg.setElements( new Object[]  {"Any","Array","Base64","Boolean","Date","Double","Integer","List","String","Struct"});
		dlg.open();
		//Text value = dlg.getValue();
		Object selected_type = dlg.getFirstResult();
	
		if (selected_type.toString() == "Any") {
			type = new ParameterAnyTypeImpl();
		}
		if (selected_type.toString() == "Array") {
			type = new ParameterArrayTypeImpl();
		}
		if (selected_type.toString() == "Base64") {
			type = new ParameterBase64TypeImpl();
		}
		if (selected_type.toString() == "Boolean") {
			type = new ParameterBooleanTypeImpl();
		}
		if (selected_type.toString() == "Date") {
			type = new ParameterDateTypeImpl();
		}
		if (selected_type.toString() == "Double") {
			type = new ParameterDoubleTypeImpl();
		}
		if (selected_type.toString() == "Integer") {
			type = new ParameterIntegerTypeImpl();
		}
		if (selected_type.toString() == "List") {
			type = new ParameterListTypeImpl();
		}
		if (selected_type.toString() == "String") {
			type = new ParameterStringTypeImpl();
		}
		if (selected_type.toString() == "Struct") {
			type = new ParameterStructTypeImpl();
		}
		
		param.setType(type);

}
/**
public class ParameterSetDialog extends ElementListSelectionDialog{
	private Object[] fElements;
	private Text Value;

	protected ParameterSetDialog(Shell parent, ILabelProvider renderer) {
		super(parent, renderer);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite contents = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(contents, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		GridLayout layout = new GridLayout(2, false);
		container.setLayout(layout);

		setDefaultValue(container);
		return contents;
	}
	private void setDefaultValue(Composite container) {
		Label lbtFirstName = new Label(container, SWT.NONE);
		lbtFirstName.setText("DefaultValue (optional)");

		GridData dataValue = new GridData();
		dataValue.grabExcessHorizontalSpace = true;
		dataValue.horizontalAlignment = GridData.FILL;

		Value = new Text(container, SWT.BORDER);
		Value.setLayoutData(dataValue);
	}

	private Text getValue() {
		return Value;
	}

}*/
}

