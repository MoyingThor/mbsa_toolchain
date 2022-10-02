/**
 */
package requirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.RequirementPackage#getRequirementElement <em>Requirement Element</em>}</li>
 *   <li>{@link requirement.RequirementPackage#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getRequirementPackage()
 * @model
 * @generated
 */
public interface RequirementPackage extends RequirementElement {
	/**
	 * Returns the value of the '<em><b>Requirement Element</b></em>' containment reference list.
	 * The list contents are of type {@link requirement.RequirementElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Element</em>' containment reference list.
	 * @see requirement.Requirement_Package#getRequirementPackage_RequirementElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementElement> getRequirementElement();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link requirement.RequirementPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see requirement.Requirement_Package#getRequirementPackage_Interface()
	 * @model
	 * @generated
	 */
	EList<RequirementPackageInterface> getInterface();

} // RequirementPackage
