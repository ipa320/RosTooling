/**
 */
package componentInterface.impl;

import componentInterface.*;

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
			ComponentInterfaceFactory theComponentInterfaceFactory = (ComponentInterfaceFactory)EPackage.Registry.INSTANCE.getEFactory(ComponentInterfacePackage.eNS_URI);
			if (theComponentInterfaceFactory != null) {
				return theComponentInterfaceFactory;
			}
		}
		catch (Exception exception) {
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
			case ComponentInterfacePackage.COMPONENT_INTERFACE: return createComponentInterface();
			case ComponentInterfacePackage.REMAP_PUB: return createRemapPub();
			case ComponentInterfacePackage.REMAP_SUB: return createRemapSub();
			case ComponentInterfacePackage.REMAP_SRV_SERV: return createRemapSrvServ();
			case ComponentInterfacePackage.REMAP_SRV_CLI: return createRemapSrvCli();
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
	public RemapPub createRemapPub() {
		RemapPubImpl remapPub = new RemapPubImpl();
		return remapPub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapSub createRemapSub() {
		RemapSubImpl remapSub = new RemapSubImpl();
		return remapSub;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapSrvServ createRemapSrvServ() {
		RemapSrvServImpl remapSrvServ = new RemapSrvServImpl();
		return remapSrvServ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemapSrvCli createRemapSrvCli() {
		RemapSrvCliImpl remapSrvCli = new RemapSrvCliImpl();
		return remapSrvCli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInterfacePackage getComponentInterfacePackage() {
		return (ComponentInterfacePackage)getEPackage();
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
