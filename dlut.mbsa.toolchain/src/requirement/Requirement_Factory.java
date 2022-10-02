/**
 */
package requirement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see requirement.Requirement_Package
 * @generated
 */
public interface Requirement_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Requirement_Factory eINSTANCE = requirement.impl.Requirement_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirement Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Package</em>'.
	 * @generated
	 */
	RequirementPackage createRequirementPackage();

	/**
	 * Returns a new object of class '<em>Requirement Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Package Binding</em>'.
	 * @generated
	 */
	RequirementPackageBinding createRequirementPackageBinding();

	/**
	 * Returns a new object of class '<em>Requirement Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Package Interface</em>'.
	 * @generated
	 */
	RequirementPackageInterface createRequirementPackageInterface();

	/**
	 * Returns a new object of class '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement</em>'.
	 * @generated
	 */
	Requirement createRequirement();

	/**
	 * Returns a new object of class '<em>Requirement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Relationship</em>'.
	 * @generated
	 */
	RequirementRelationship createRequirementRelationship();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Requirement_Package getRequirement_Package();

} //Requirement_Factory
