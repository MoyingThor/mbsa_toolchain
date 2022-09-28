/**
 */
package component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Package Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.ComponentPackageBinding#getParticipantPackage <em>Participant Package</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getComponentPackageBinding()
 * @model
 * @generated
 */
public interface ComponentPackageBinding extends ComponentElement {
	/**
	 * Returns the value of the '<em><b>Participant Package</b></em>' reference list.
	 * The list contents are of type {@link component.ComponentPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Package</em>' reference list.
	 * @see component.Component_Package#getComponentPackageBinding_ParticipantPackage()
	 * @model lower="2"
	 * @generated
	 */
	EList<ComponentPackage> getParticipantPackage();

} // ComponentPackageBinding
