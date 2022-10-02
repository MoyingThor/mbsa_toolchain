/**
 */
package hazard;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazardous Situation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hazard.HazardousSituation#getSeverity <em>Severity</em>}</li>
 *   <li>{@link hazard.HazardousSituation#getProbability <em>Probability</em>}</li>
 *   <li>{@link hazard.HazardousSituation#getCauses <em>Causes</em>}</li>
 * </ul>
 *
 * @see hazard.Hazard_Package#getHazardousSituation()
 * @model
 * @generated
 */
public interface HazardousSituation extends HazardElement {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * The literals are from the enumeration {@link hazard.Severity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see hazard.Severity
	 * @see #setSeverity(Severity)
	 * @see hazard.Hazard_Package#getHazardousSituation_Severity()
	 * @model
	 * @generated
	 */
	Severity getSeverity();

	/**
	 * Sets the value of the '{@link hazard.HazardousSituation#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see hazard.Severity
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Severity value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * The literals are from the enumeration {@link hazard.Probability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see hazard.Probability
	 * @see #setProbability(Probability)
	 * @see hazard.Hazard_Package#getHazardousSituation_Probability()
	 * @model
	 * @generated
	 */
	Probability getProbability();

	/**
	 * Sets the value of the '{@link hazard.HazardousSituation#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see hazard.Probability
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(Probability value);

	/**
	 * Returns the value of the '<em><b>Causes</b></em>' containment reference list.
	 * The list contents are of type {@link hazard.Cause}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Causes</em>' containment reference list.
	 * @see hazard.Hazard_Package#getHazardousSituation_Causes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cause> getCauses();

} // HazardousSituation
