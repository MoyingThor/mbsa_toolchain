/**
 */
package hazard;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hazard.Hazard_Package
 * @generated
 */
public interface Hazard_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hazard_Factory eINSTANCE = hazard.impl.Hazard_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Hazard Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Package</em>'.
	 * @generated
	 */
	HazardPackage createHazardPackage();

	/**
	 * Returns a new object of class '<em>Hazard Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Package Binding</em>'.
	 * @generated
	 */
	HazardPackageBinding createHazardPackageBinding();

	/**
	 * Returns a new object of class '<em>Hazard Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazard Package Interface</em>'.
	 * @generated
	 */
	HazardPackageInterface createHazardPackageInterface();

	/**
	 * Returns a new object of class '<em>Hazardous Situation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hazardous Situation</em>'.
	 * @generated
	 */
	HazardousSituation createHazardousSituation();

	/**
	 * Returns a new object of class '<em>Cause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cause</em>'.
	 * @generated
	 */
	Cause createCause();

	/**
	 * Returns a new object of class '<em>Control Measure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Measure</em>'.
	 * @generated
	 */
	ControlMeasure createControlMeasure();

	/**
	 * Returns a new object of class '<em>Verificationof Effectiveness</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Verificationof Effectiveness</em>'.
	 * @generated
	 */
	VerificationofEffectiveness createVerificationofEffectiveness();

	/**
	 * Returns a new object of class '<em>Validation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation</em>'.
	 * @generated
	 */
	Validation createValidation();

	/**
	 * Returns a new object of class '<em>Safety Decision Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Safety Decision Rationale</em>'.
	 * @generated
	 */
	SafetyDecisionRationale createSafetyDecisionRationale();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Hazard_Package getHazard_Package();

} //Hazard_Factory
