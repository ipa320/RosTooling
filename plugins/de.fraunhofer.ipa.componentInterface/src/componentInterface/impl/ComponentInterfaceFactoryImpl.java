/**
 */
package componentInterface.impl;

import componentInterface.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case ComponentInterfacePackage.ROS_PUBLISHER: return createRosPublisher();
			case ComponentInterfacePackage.ROS_SUBSCRIBER: return createRosSubscriber();
			case ComponentInterfacePackage.ROS_SERVICE_SERVER: return createRosServiceServer();
			case ComponentInterfacePackage.ROS_SERVICE_CLIENT: return createRosServiceClient();
			case ComponentInterfacePackage.ROS_ACTION_SERVER: return createRosActionServer();
			case ComponentInterfacePackage.ROS_ACTION_CLIENT: return createRosActionClient();
			case ComponentInterfacePackage.ROS_PARAMETER: return createRosParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ComponentInterfacePackage.NS:
				return createNSFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ComponentInterfacePackage.NS:
				return convertNSToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentInterface createComponentInterface() {
		ComponentInterfaceImpl componentInterface = new ComponentInterfaceImpl();
		return componentInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosPublisher createRosPublisher() {
		RosPublisherImpl rosPublisher = new RosPublisherImpl();
		return rosPublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosSubscriber createRosSubscriber() {
		RosSubscriberImpl rosSubscriber = new RosSubscriberImpl();
		return rosSubscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosServiceServer createRosServiceServer() {
		RosServiceServerImpl rosServiceServer = new RosServiceServerImpl();
		return rosServiceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosServiceClient createRosServiceClient() {
		RosServiceClientImpl rosServiceClient = new RosServiceClientImpl();
		return rosServiceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosActionServer createRosActionServer() {
		RosActionServerImpl rosActionServer = new RosActionServerImpl();
		return rosActionServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosActionClient createRosActionClient() {
		RosActionClientImpl rosActionClient = new RosActionClientImpl();
		return rosActionClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RosParameter createRosParameter() {
		RosParameterImpl rosParameter = new RosParameterImpl();
		return rosParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNSFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNSToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
