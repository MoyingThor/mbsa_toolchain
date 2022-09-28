/**
 */
package component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failure Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link component.FailureEffect#getDesc <em>Desc</em>}</li>
 *   <li>{@link component.FailureEffect#getAffected <em>Affected</em>}</li>
 * </ul>
 *
 * @see component.Component_Package#getFailureEffect()
 * @model abstract="true"
 * @generated
 */
public interface FailureEffect extends ComponentSafetyElement {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see component.Component_Package#getFailureEffect_Desc()
	 * @model
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link component.FailureEffect#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Affected</b></em>' reference list.
	 * The list contents are of type {@link component.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected</em>' reference list.
	 * @see component.Component_Package#getFailureEffect_Affected()
	 * @model
	 * @generated
	 */
	EList<Component> getAffected();

} // FailureEffect
