/**
 */
package de.fraunhofer.ipa.componentInterface.impl;

import de.fraunhofer.ipa.componentInterface.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentInterfaceFactoryImpl extends EFactoryImpl implements ComponentInterfaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComponentInterfaceFactory init() {
		try {
			ComponentInterfaceFactory theComponentInterfaceFactory = (ComponentInterfaceFactory) EPackage.Registry.INSTANCE
					.getEFactory(ComponentInterfacePackage.eNS_URI);
			if (theComponentInterfaceFactory != null) {
				return theComponentInterfaceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComponentInterfaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfaceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ComponentInterfacePackage.COMPONENT_INTERFACE:
			return createComponentInterface();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterface createComponentInterface() {
		ComponentInterfaceImpl componentInterface = new ComponentInterfaceImpl();
		return componentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfacePackage getComponentInterfacePackage() {
		return (ComponentInterfacePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComponentInterfacePackage getPackage() {
		return ComponentInterfacePackage.eINSTANCE;
	}

} //ComponentInterfaceFactoryImpl
