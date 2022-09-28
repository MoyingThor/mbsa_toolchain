/**
 */
package component;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.ComponentPackageInterface#getImplements <em>Implements</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getComponentPackageInterface()
 * @model
 * @generated
 */
public interface ComponentPackageInterface extends ComponentElement {
	/**
	 * Returns the value of the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implements</em>' reference.
	 * @see #setImplements(ComponentPackage)
	 * @see component.Component_Package#getComponentPackageInterface_Implements()
	 * @model required="true"
	 * @generated
	 */
	ComponentPackage getImplements();

	/**
	 * Sets the value of the '{@link component.ComponentPackageInterface#getImplements <em>Implements</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implements</em>' reference.
	 * @see #getImplements()
	 * @generated
	 */
	void setImplements(ComponentPackage value);

} // ComponentPackageInterface
