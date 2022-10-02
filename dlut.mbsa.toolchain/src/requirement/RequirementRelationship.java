/**
 */
package requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.RequirementRelationship#getLabel <em>Label</em>}</li>
 *   <li>{@link requirement.RequirementRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link requirement.RequirementRelationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getRequirementRelationship()
 * @model
 * @generated
 */
public interface RequirementRelationship extends RequirementElement {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see requirement.Requirement_Package#getRequirementRelationship_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link requirement.RequirementRelationship#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Requirement)
	 * @see requirement.Requirement_Package#getRequirementRelationship_Source()
	 * @model
	 * @generated
	 */
	Requirement getSource();

	/**
	 * Sets the value of the '{@link requirement.RequirementRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Requirement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Requirement)
	 * @see requirement.Requirement_Package#getRequirementRelationship_Target()
	 * @model
	 * @generated
	 */
	Requirement getTarget();

	/**
	 * Sets the value of the '{@link requirement.RequirementRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Requirement value);

} // RequirementRelationship
