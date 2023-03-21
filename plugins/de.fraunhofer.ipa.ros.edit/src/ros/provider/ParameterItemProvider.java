/**
 */
package ros.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ros.Parameter;
import ros.RosFactory;
import ros.RosPackage;

/**
 * This is the item provider adapter for a {@link ros.Parameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterItemProvider extends InterfaceTypeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
        if (itemPropertyDescriptors == null) {
            super.getPropertyDescriptors(object);

            addValuePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Parameter_value_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Parameter_value_feature", "_UI_Parameter_type"),
                 RosPackage.Literals.PARAMETER__VALUE,
                 true,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
        if (childrenFeatures == null) {
            super.getChildrenFeatures(object);
            childrenFeatures.add(RosPackage.Literals.PARAMETER__TYPE);
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature(Object object, Object child) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature(object, child);
    }

    /**
     * This returns Parameter.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/Parameter"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((Parameter)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_Parameter_type") :
            getString("_UI_Parameter_type") + " " + label;
    }


    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
        updateChildren(notification);

        switch (notification.getFeatureID(Parameter.class)) {
            case RosPackage.PARAMETER__TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
                return;
        }
        super.notifyChanged(notification);
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
        super.collectNewChildDescriptors(newChildDescriptors, object);

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER__TYPE,
                 RosFactory.eINSTANCE.createParameterListType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER__TYPE,
                 RosFactory.eINSTANCE.createParameterStructType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER__TYPE,
                 RosFactory.eINSTANCE.createParameterIntegerType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER__TYPE,
                 RosFactory.eINSTANCE.createParameterStringType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER__TYPE,
                 RosFactory.eINSTANCE.createParameterDoubleType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER__TYPE,
                 RosFactory.eINSTANCE.createParameterDateType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER__TYPE,
                 RosFactory.eINSTANCE.createParameterBooleanType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER__TYPE,
                 RosFactory.eINSTANCE.createParameterBase64Type()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER__TYPE,
                 RosFactory.eINSTANCE.createParameterAnyType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER__TYPE,
                 RosFactory.eINSTANCE.createParameterArrayType()));
    }

}
