/**
 */
package PackageFormat2.provider;


import PackageFormat2.PackageFormat2Factory;
import PackageFormat2.PackageFormat2Package;
import PackageFormat2.PackageType;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

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

import ros1.provider.Ros1EditPlugin;

/**
 * This is the item provider adapter for a {@link PackageFormat2.PackageType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PackageTypeItemProvider 
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
	public PackageTypeItemProvider(AdapterFactory adapterFactory) {
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
			addVersionPropertyDescriptor(object);
			addLicensePropertyDescriptor(object);
			addFormatPropertyDescriptor(object);
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
				 getString("_UI_PackageType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageType_name_feature", "_UI_PackageType_type"),
				 PackageFormat2Package.Literals.PACKAGE_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PackageType_version_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageType_version_feature", "_UI_PackageType_type"),
				 PackageFormat2Package.Literals.PACKAGE_TYPE__VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the License feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicensePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PackageType_license_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageType_license_feature", "_UI_PackageType_type"),
				 PackageFormat2Package.Literals.PACKAGE_TYPE__LICENSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Format feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFormatPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PackageType_format_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PackageType_format_feature", "_UI_PackageType_type"),
				 PackageFormat2Package.Literals.PACKAGE_TYPE__FORMAT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(PackageFormat2Package.Literals.PACKAGE_TYPE__DESCRIPTION);
			childrenFeatures.add(PackageFormat2Package.Literals.PACKAGE_TYPE__MAINTAINER);
			childrenFeatures.add(PackageFormat2Package.Literals.PACKAGE_TYPE__URL);
			childrenFeatures.add(PackageFormat2Package.Literals.PACKAGE_TYPE__AUTHOR);
			childrenFeatures.add(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP);
			childrenFeatures.add(PackageFormat2Package.Literals.PACKAGE_TYPE__EXPORT);
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
	 * This returns PackageType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PackageType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PackageType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_PackageType_type") :
			getString("_UI_PackageType_type") + " " + label;
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

		switch (notification.getFeatureID(PackageType.class)) {
			case PackageFormat2Package.PACKAGE_TYPE__NAME:
			case PackageFormat2Package.PACKAGE_TYPE__VERSION:
			case PackageFormat2Package.PACKAGE_TYPE__LICENSE:
			case PackageFormat2Package.PACKAGE_TYPE__FORMAT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case PackageFormat2Package.PACKAGE_TYPE__DESCRIPTION:
			case PackageFormat2Package.PACKAGE_TYPE__MAINTAINER:
			case PackageFormat2Package.PACKAGE_TYPE__URL:
			case PackageFormat2Package.PACKAGE_TYPE__AUTHOR:
			case PackageFormat2Package.PACKAGE_TYPE__GROUP:
			case PackageFormat2Package.PACKAGE_TYPE__EXPORT:
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
				(PackageFormat2Package.Literals.PACKAGE_TYPE__DESCRIPTION,
				 PackageFormat2Factory.eINSTANCE.createDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__MAINTAINER,
				 PackageFormat2Factory.eINSTANCE.createPersonWithEmailType()));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__URL,
				 PackageFormat2Factory.eINSTANCE.createUrlType()));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__AUTHOR,
				 PackageFormat2Factory.eINSTANCE.createPersonWithOptionalEmailType()));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(PackageFormat2Package.Literals.PACKAGE_TYPE__BUILD_DEPEND,
					 PackageFormat2Factory.eINSTANCE.createDependencyType())));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(PackageFormat2Package.Literals.PACKAGE_TYPE__BUILD_EXPORT_DEPEND,
					 PackageFormat2Factory.eINSTANCE.createDependencyType())));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(PackageFormat2Package.Literals.PACKAGE_TYPE__BUILDTOOL_DEPEND,
					 PackageFormat2Factory.eINSTANCE.createDependencyType())));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(PackageFormat2Package.Literals.PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND,
					 PackageFormat2Factory.eINSTANCE.createDependencyType())));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(PackageFormat2Package.Literals.PACKAGE_TYPE__EXEC_DEPEND,
					 PackageFormat2Factory.eINSTANCE.createDependencyType())));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(PackageFormat2Package.Literals.PACKAGE_TYPE__DEPEND,
					 PackageFormat2Factory.eINSTANCE.createDependencyType())));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(PackageFormat2Package.Literals.PACKAGE_TYPE__DOC_DEPEND,
					 PackageFormat2Factory.eINSTANCE.createDependencyType())));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(PackageFormat2Package.Literals.PACKAGE_TYPE__TEST_DEPEND,
					 PackageFormat2Factory.eINSTANCE.createDependencyType())));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(PackageFormat2Package.Literals.PACKAGE_TYPE__CONFLICT,
					 PackageFormat2Factory.eINSTANCE.createDependencyType())));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(PackageFormat2Package.Literals.PACKAGE_TYPE__REPLACE,
					 PackageFormat2Factory.eINSTANCE.createDependencyType())));

		newChildDescriptors.add
			(createChildParameter
				(PackageFormat2Package.Literals.PACKAGE_TYPE__EXPORT,
				 PackageFormat2Factory.eINSTANCE.createExportType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == PackageFormat2Package.Literals.PACKAGE_TYPE__BUILD_DEPEND ||
			childFeature == PackageFormat2Package.Literals.PACKAGE_TYPE__BUILD_EXPORT_DEPEND ||
			childFeature == PackageFormat2Package.Literals.PACKAGE_TYPE__BUILDTOOL_DEPEND ||
			childFeature == PackageFormat2Package.Literals.PACKAGE_TYPE__BUILDTOOL_EXPORT_DEPEND ||
			childFeature == PackageFormat2Package.Literals.PACKAGE_TYPE__EXEC_DEPEND ||
			childFeature == PackageFormat2Package.Literals.PACKAGE_TYPE__DEPEND ||
			childFeature == PackageFormat2Package.Literals.PACKAGE_TYPE__DOC_DEPEND ||
			childFeature == PackageFormat2Package.Literals.PACKAGE_TYPE__TEST_DEPEND ||
			childFeature == PackageFormat2Package.Literals.PACKAGE_TYPE__CONFLICT ||
			childFeature == PackageFormat2Package.Literals.PACKAGE_TYPE__REPLACE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Ros1EditPlugin.INSTANCE;
	}

}
