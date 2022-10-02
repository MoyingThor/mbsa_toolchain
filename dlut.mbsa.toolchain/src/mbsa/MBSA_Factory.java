/**
 */
package mbsa;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mbsa.MBSA_Package
 * @generated
 */
public interface MBSA_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MBSA_Factory eINSTANCE = mbsa.impl.MBSA_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MBSA Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MBSA Package</em>'.
	 * @generated
	 */
	MBSAPackage createMBSAPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MBSA_Package getMBSA_Package();

} //MBSA_Factory
