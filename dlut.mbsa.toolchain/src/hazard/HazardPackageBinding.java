/**
 */
package hazard;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Package Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hazard.HazardPackageBinding#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @see hazard.Hazard_Package#getHazardPackageBinding()
 * @model
 * @generated
 */
public interface HazardPackageBinding extends HazardPackage {
	/**
	 * Returns the value of the '<em><b>Participant Package</b></em>' reference list.
	 * The list contents are of type {@link hazard.HazardPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Package</em>' reference list.
	 * @see hazard.Hazard_Package#getHazardPackageBinding_ParticipantPackage()
	 * @model lower="2"
	 * @generated
	 */
	EList<HazardPackage> getParticipantPackage();

} // HazardPackageBinding
