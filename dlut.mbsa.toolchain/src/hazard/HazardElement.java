/**
 */
package hazard;

import base.ArtifactElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hazard.HazardElement#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @see hazard.Hazard_Package#getHazardElement()
 * @model abstract="true"
 * @generated
 */
public interface HazardElement extends ArtifactElement {

	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(int)
	 * @see hazard.Hazard_Package#getHazardElement_Identity()
	 * @model
	 * @generated
	 */
	int getIdentity();

	/**
	 * Sets the value of the '{@link hazard.HazardElement#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(int value);
} // HazardElement
