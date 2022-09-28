/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Safety Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.ComponentSafetyElement#getIdentity <em>Identity</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getComponentSafetyElement()
 * @model abstract="true"
 * @generated
 */
public interface ComponentSafetyElement extends ComponentAsset {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(int)
	 * @see component.Component_Package#getComponentSafetyElement_Identity()
	 * @model
	 * @generated
	 */
	int getIdentity();

	/**
	 * Sets the value of the '{@link component.ComponentSafetyElement#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(int value);

} // ComponentSafetyElement
