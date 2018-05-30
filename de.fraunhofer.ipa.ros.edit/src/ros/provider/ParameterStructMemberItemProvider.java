/**
 */
package ros.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ros.ParameterStructMember;
import ros.RosFactory;
import ros.RosPackage;

/**
 * This is the item provider adapter for a {@link ros.ParameterStructMember} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterStructMemberItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterStructMemberItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterStructMember_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterStructMember_name_feature", "_UI_ParameterStructMember_type"),
				 RosPackage.Literals.PARAMETER_STRUCT_MEMBER__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE);
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
	 * This returns ParameterStructMember.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ParameterStructMember"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ParameterStructMember)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ParameterStructMember_type") :
			getString("_UI_ParameterStructMember_type") + " " + label;
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

		switch (notification.getFeatureID(ParameterStructMember.class)) {
			case RosPackage.PARAMETER_STRUCT_MEMBER__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case RosPackage.PARAMETER_STRUCT_MEMBER__VALUE:
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
				(RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE,
				 RosFactory.eINSTANCE.createParameterAny()));

		newChildDescriptors.add
			(createChildParameter
				(RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE,
				 RosFactory.eINSTANCE.createParameterString()));

		newChildDescriptors.add
			(createChildParameter
				(RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE,
				 RosFactory.eINSTANCE.createParameterBase64()));

		newChildDescriptors.add
			(createChildParameter
				(RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE,
				 RosFactory.eINSTANCE.createParameterInteger()));

		newChildDescriptors.add
			(createChildParameter
				(RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE,
				 RosFactory.eINSTANCE.createParameterDouble()));

		newChildDescriptors.add
			(createChildParameter
				(RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE,
				 RosFactory.eINSTANCE.createParameterBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE,
				 RosFactory.eINSTANCE.createParameterSequence()));

		newChildDescriptors.add
			(createChildParameter
				(RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE,
				 RosFactory.eINSTANCE.createParameterStruct()));

		newChildDescriptors.add
			(createChildParameter
				(RosPackage.Literals.PARAMETER_STRUCT_MEMBER__VALUE,
				 RosFactory.eINSTANCE.createParameterDate()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RosEditPlugin.INSTANCE;
	}

}
