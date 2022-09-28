/**
 */
package component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.ComponentPackage#getComponents <em>Components</em>}</li>
 *   <li>{@link component.ComponentPackage#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getComponentPackage()
 * @model
 * @generated
 */
public interface ComponentPackage extends ComponentElement {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link component.ComponentElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see component.Component_Package#getComponentPackage_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentElement> getComponents();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference list.
	 * The list contents are of type {@link component.ComponentPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference list.
	 * @see component.Component_Package#getComponentPackage_Interface()
	 * @model
	 * @generated
	 */
	EList<ComponentPackageInterface> getInterface();

} // ComponentPackage
