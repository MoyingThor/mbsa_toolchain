/**
 */
package hazard;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Measure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hazard.ControlMeasure#getSafetyDecisionRationale <em>Safety Decision Rationale</em>}</li>
 *   <li>{@link hazard.ControlMeasure#getVerificationofEffectiveness <em>Verificationof Effectiveness</em>}</li>
 *   <li>{@link hazard.ControlMeasure#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @see hazard.Hazard_Package#getControlMeasure()
 * @model
 * @generated
 */
public interface ControlMeasure extends HazardElement {
	/**
	 * Returns the value of the '<em><b>Safety Decision Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Decision Rationale</em>' containment reference.
	 * @see #setSafetyDecisionRationale(SafetyDecisionRationale)
	 * @see hazard.Hazard_Package#getControlMeasure_SafetyDecisionRationale()
	 * @model containment="true"
	 * @generated
	 */
	SafetyDecisionRationale getSafetyDecisionRationale();

	/**
	 * Sets the value of the '{@link hazard.ControlMeasure#getSafetyDecisionRationale <em>Safety Decision Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Decision Rationale</em>' containment reference.
	 * @see #getSafetyDecisionRationale()
	 * @generated
	 */
	void setSafetyDecisionRationale(SafetyDecisionRationale value);

	/**
	 * Returns the value of the '<em><b>Verificationof Effectiveness</b></em>' containment reference list.
	 * The list contents are of type {@link hazard.VerificationofEffectiveness}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verificationof Effectiveness</em>' containment reference list.
	 * @see hazard.Hazard_Package#getControlMeasure_VerificationofEffectiveness()
	 * @model containment="true"
	 * @generated
	 */
	EList<VerificationofEffectiveness> getVerificationofEffectiveness();

	/**
	 * Returns the value of the '<em><b>Validation</b></em>' containment reference list.
	 * The list contents are of type {@link hazard.Validation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation</em>' containment reference list.
	 * @see hazard.Hazard_Package#getControlMeasure_Validation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Validation> getValidation();

} // ControlMeasure
