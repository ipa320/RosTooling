/**
 */
package ros.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ros.ParameterListType;
import ros.RosFactory;
import ros.RosPackage;

/**
 * This is the item provider adapter for a {@link ros.ParameterListType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterListTypeItemProvider extends ParameterTypeItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterListTypeItemProvider(AdapterFactory adapterFactory) {
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

        }
        return itemPropertyDescriptors;
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
            childrenFeatures.add(RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE);
            childrenFeatures.add(RosPackage.Literals.PARAMETER_LIST_TYPE__DEFAULT);
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
     * This returns ParameterListType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/ParameterListType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        return getString("_UI_ParameterListType_type");
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

        switch (notification.getFeatureID(ParameterListType.class)) {
            case RosPackage.PARAMETER_LIST_TYPE__SEQUENCE:
            case RosPackage.PARAMETER_LIST_TYPE__DEFAULT:
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
                (RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE,
                 RosFactory.eINSTANCE.createParameterListType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE,
                 RosFactory.eINSTANCE.createParameterStructType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE,
                 RosFactory.eINSTANCE.createParameterIntegerType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE,
                 RosFactory.eINSTANCE.createParameterStringType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE,
                 RosFactory.eINSTANCE.createParameterDoubleType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE,
                 RosFactory.eINSTANCE.createParameterDateType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE,
                 RosFactory.eINSTANCE.createParameterBooleanType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE,
                 RosFactory.eINSTANCE.createParameterBase64Type()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE,
                 RosFactory.eINSTANCE.createParameterAnyType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER_LIST_TYPE__SEQUENCE,
                 RosFactory.eINSTANCE.createParameterArrayType()));

        newChildDescriptors.add
            (createChildParameter
                (RosPackage.Literals.PARAMETER_LIST_TYPE__DEFAULT,
                 RosFactory.eINSTANCE.createParameterSequence()));
    }

}
