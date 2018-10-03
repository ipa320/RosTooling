/**
 */
package componentInterface;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see componentInterface.ComponentInterfacePackage
 * @generated
 */
public interface ComponentInterfaceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComponentInterfaceFactory eINSTANCE = componentInterface.impl.ComponentInterfaceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Component Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Interface</em>'.
	 * @generated
	 */
	ComponentInterface createComponentInterface();

	/**
	 * Returns a new object of class '<em>Remap Pub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remap Pub</em>'.
	 * @generated
	 */
	RemapPub createRemapPub();

	/**
	 * Returns a new object of class '<em>Remap Sub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remap Sub</em>'.
	 * @generated
	 */
	RemapSub createRemapSub();

	/**
	 * Returns a new object of class '<em>Remap Srv Serv</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remap Srv Serv</em>'.
	 * @generated
	 */
	RemapSrvServ createRemapSrvServ();

	/**
	 * Returns a new object of class '<em>Remap Srv Cli</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remap Srv Cli</em>'.
	 * @generated
	 */
	RemapSrvCli createRemapSrvCli();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComponentInterfacePackage getComponentInterfacePackage();

} //ComponentInterfaceFactory
