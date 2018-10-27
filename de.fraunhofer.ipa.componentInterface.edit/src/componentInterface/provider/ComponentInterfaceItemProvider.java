/**
 */
package componentInterface.provider;


import componentInterface.ComponentInterface;
import componentInterface.ComponentInterfaceFactory;
import componentInterface.ComponentInterfacePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ros.provider.NamespacedElementItemProvider;

/**
 * This is the item provider adapter for a {@link componentInterface.ComponentInterface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInterfaceItemProvider extends NamespacedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfaceItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(ComponentInterfacePackage.Literals.COMPONENT_INTERFACE__ROSPUBLISHER);
			childrenFeatures.add(ComponentInterfacePackage.Literals.COMPONENT_INTERFACE__ROSSUBSCRIBER);
			childrenFeatures.add(ComponentInterfacePackage.Literals.COMPONENT_INTERFACE__ROSSERVICESERVER);
			childrenFeatures.add(ComponentInterfacePackage.Literals.COMPONENT_INTERFACE__ROSSERVICECLIENT);
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
	 * This returns ComponentInterface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ComponentInterface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ComponentInterface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ComponentInterface_type") :
			getString("_UI_ComponentInterface_type") + " " + label;
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

		switch (notification.getFeatureID(ComponentInterface.class)) {
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSPUBLISHER:
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSUBSCRIBER:
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICESERVER:
			case ComponentInterfacePackage.COMPONENT_INTERFACE__ROSSERVICECLIENT:
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
				(ComponentInterfacePackage.Literals.COMPONENT_INTERFACE__ROSPUBLISHER,
				 ComponentInterfaceFactory.eINSTANCE.createRosPublisher()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentInterfacePackage.Literals.COMPONENT_INTERFACE__ROSSUBSCRIBER,
				 ComponentInterfaceFactory.eINSTANCE.createRosSubscriber()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentInterfacePackage.Literals.COMPONENT_INTERFACE__ROSSERVICESERVER,
				 ComponentInterfaceFactory.eINSTANCE.createRosServiceServer()));

		newChildDescriptors.add
			(createChildParameter
				(ComponentInterfacePackage.Literals.COMPONENT_INTERFACE__ROSSERVICECLIENT,
				 ComponentInterfaceFactory.eINSTANCE.createRosServiceClient()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ComponentInterfaceEditPlugin.INSTANCE;
	}

}
