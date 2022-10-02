/**
 */
package hazard;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hazard.HazardPackageInterface#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see hazard.Hazard_Package#getHazardPackageInterface()
 * @model
 * @generated
 */
public interface HazardPackageInterface extends HazardPackage {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(HazardPackage)
	 * @see hazard.Hazard_Package#getHazardPackageInterface_Implements()
	 * @model required="true"
	 * @generated
	 */
	HazardPackage getImplements();

	/**
	 * Sets the value of the '{@link hazard.HazardPackageInterface#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(HazardPackage value);

} // HazardPackageInterface
