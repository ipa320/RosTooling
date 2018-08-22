/**
 */
package de.fraunhofer.ipa.ros.seronetgw.rosgw.impl;

import de.fraunhofer.ipa.ros.seronetgw.rosgw.*;

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
public class RosgwFactoryImpl extends EFactoryImpl implements RosgwFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RosgwFactory init() {
		try {
			RosgwFactory theRosgwFactory = (RosgwFactory) EPackage.Registry.INSTANCE.getEFactory(RosgwPackage.eNS_URI);
			if (theRosgwFactory != null) {
				return theRosgwFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RosgwFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosgwFactoryImpl() {
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
		case RosgwPackage.ROS_GATEWAY:
			return createRosGateway();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosGateway createRosGateway() {
		RosGatewayImpl rosGateway = new RosGatewayImpl();
		return rosGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RosgwPackage getRosgwPackage() {
		return (RosgwPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RosgwPackage getPackage() {
		return RosgwPackage.eINSTANCE;
	}

} //RosgwFactoryImpl
