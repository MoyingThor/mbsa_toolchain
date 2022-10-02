/**
 */
package requirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Package Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.RequirementPackageBinding#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getRequirementPackageBinding()
 * @model
 * @generated
 */
public interface RequirementPackageBinding extends RequirementPackage {
	/**
	 * Returns the value of the '<em><b>Participant Package</b></em>' reference list.
	 * The list contents are of type {@link requirement.RequirementPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Package</em>' reference list.
	 * @see requirement.Requirement_Package#getRequirementPackageBinding_ParticipantPackage()
	 * @model lower="2"
	 * @generated
	 */
	EList<RequirementPackage> getParticipantPackage();

} // RequirementPackageBinding
