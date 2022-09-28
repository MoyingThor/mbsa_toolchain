/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.FailureMode#getMode <em>Mode</em>}</li>
 *   <li>{@link component.FailureMode#getCause <em>Cause</em>}</li>
 *   <li>{@link component.FailureMode#getProbability <em>Probability</em>}</li>
 *   <li>{@link component.FailureMode#getRegional <em>Regional</em>}</li>
 *   <li>{@link component.FailureMode#getHigher_level <em>Higher level</em>}</li>
 *   <li>{@link component.FailureMode#getFinal <em>Final</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getFailureMode()
 * @model
 * @generated
 */
public interface FailureMode extends ComponentSafetyElement {
	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see #setMode(String)
	 * @see component.Component_Package#getFailureMode_Mode()
	 * @model
	 * @generated
	 */
	String getMode();

	/**
	 * Sets the value of the '{@link component.FailureMode#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see #getMode()
	 * @generated
	 */
	void setMode(String value);

	/**
	 * Returns the value of the '<em><b>Cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cause</em>' attribute.
	 * @see #setCause(String)
	 * @see component.Component_Package#getFailureMode_Cause()
	 * @model
	 * @generated
	 */
	String getCause();

	/**
	 * Sets the value of the '{@link component.FailureMode#getCause <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cause</em>' attribute.
	 * @see #getCause()
	 * @generated
	 */
	void setCause(String value);

	/**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(float)
	 * @see component.Component_Package#getFailureMode_Probability()
	 * @model
	 * @generated
	 */
	float getProbability();

	/**
	 * Sets the value of the '{@link component.FailureMode#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
	void setProbability(float value);

	/**
	 * Returns the value of the '<em><b>Regional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regional</em>' containment reference.
	 * @see #setRegional(RegionalEffect)
	 * @see component.Component_Package#getFailureMode_Regional()
	 * @model containment="true"
	 * @generated
	 */
	RegionalEffect getRegional();

	/**
	 * Sets the value of the '{@link component.FailureMode#getRegional <em>Regional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regional</em>' containment reference.
	 * @see #getRegional()
	 * @generated
	 */
	void setRegional(RegionalEffect value);

	/**
	 * Returns the value of the '<em><b>Higher level</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Higher level</em>' containment reference.
	 * @see #setHigher_level(HigherLevelEffect)
	 * @see component.Component_Package#getFailureMode_Higher_level()
	 * @model containment="true"
	 * @generated
	 */
	HigherLevelEffect getHigher_level();

	/**
	 * Sets the value of the '{@link component.FailureMode#getHigher_level <em>Higher level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Higher level</em>' containment reference.
	 * @see #getHigher_level()
	 * @generated
	 */
	void setHigher_level(HigherLevelEffect value);

	/**
	 * Returns the value of the '<em><b>Final</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final</em>' containment reference.
	 * @see #setFinal(FinalEffect)
	 * @see component.Component_Package#getFailureMode_Final()
	 * @model containment="true"
	 * @generated
	 */
	FinalEffect getFinal();

	/**
	 * Sets the value of the '{@link component.FailureMode#getFinal <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final</em>' containment reference.
	 * @see #getFinal()
	 * @generated
	 */
	void setFinal(FinalEffect value);

} // FailureMode
