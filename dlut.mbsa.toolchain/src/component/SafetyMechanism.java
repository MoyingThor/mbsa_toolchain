/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Mechanism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.SafetyMechanism#getHandle <em>Handle</em>}</li>
 *   <li>{@link component.SafetyMechanism#getMechanism <em>Mechanism</em>}</li>
 *   <li>{@link component.SafetyMechanism#getCoverage <em>Coverage</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getSafetyMechanism()
 * @model
 * @generated
 */
public interface SafetyMechanism extends ComponentSafetyElement {
	/**
	 * Returns the value of the '<em><b>Handle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Handle</em>' reference.
	 * @see #setHandle(FailureMode)
	 * @see component.Component_Package#getSafetyMechanism_Handle()
	 * @model
	 * @generated
	 */
	FailureMode getHandle();

	/**
	 * Sets the value of the '{@link component.SafetyMechanism#getHandle <em>Handle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handle</em>' reference.
	 * @see #getHandle()
	 * @generated
	 */
	void setHandle(FailureMode value);

	/**
	 * Returns the value of the '<em><b>Mechanism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mechanism</em>' attribute.
	 * @see #setMechanism(String)
	 * @see component.Component_Package#getSafetyMechanism_Mechanism()
	 * @model
	 * @generated
	 */
	String getMechanism();

	/**
	 * Sets the value of the '{@link component.SafetyMechanism#getMechanism <em>Mechanism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mechanism</em>' attribute.
	 * @see #getMechanism()
	 * @generated
	 */
	void setMechanism(String value);

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coverage</em>' attribute.
	 * @see #setCoverage(float)
	 * @see component.Component_Package#getSafetyMechanism_Coverage()
	 * @model
	 * @generated
	 */
	float getCoverage();

	/**
	 * Sets the value of the '{@link component.SafetyMechanism#getCoverage <em>Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' attribute.
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(float value);

} // SafetyMechanism
