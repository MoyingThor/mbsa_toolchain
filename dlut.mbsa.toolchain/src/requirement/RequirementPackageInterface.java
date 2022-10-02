/**
 */
package requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.RequirementPackageInterface#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getRequirementPackageInterface()
 * @model
 * @generated
 */
public interface RequirementPackageInterface extends RequirementPackage {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(RequirementPackage)
	 * @see requirement.Requirement_Package#getRequirementPackageInterface_Implements()
	 * @model required="true"
	 * @generated
	 */
	RequirementPackage getImplements();

	/**
	 * Sets the value of the '{@link requirement.RequirementPackageInterface#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(RequirementPackage value);

} // RequirementPackageInterface
