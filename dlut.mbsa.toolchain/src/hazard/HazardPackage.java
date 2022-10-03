/**
 */
package hazard;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hazard.HazardPackage#getHazardElement <em>Hazard Element</em>}</li>
 *   <li>{@link hazard.HazardPackage#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see hazard.Hazard_Package#getHazardPackage()
 * @model
 * @generated
 */
public interface HazardPackage extends HazardElement {
	/**
	 * Returns the value of the '<em><b>Hazard Element</b></em>' containment reference list.
	 * The list contents are of type {@link hazard.HazardElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Element</em>' containment reference list.
	 * @see hazard.Hazard_Package#getHazardPackage_HazardElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<HazardElement> getHazardElement();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link hazard.HazardPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see hazard.Hazard_Package#getHazardPackage_Interface()
	 * @model
	 * @generated
	 */
	EList<HazardPackageInterface> getInterface();

} // HazardPackage
