/**
 */
package hazard;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hazard.Cause#getControlMeasure <em>Control Measure</em>}</li>
 * </ul>
 *
 * @see hazard.Hazard_Package#getCause()
 * @model
 * @generated
 */
public interface Cause extends HazardElement {
	/**
	 * Returns the value of the '<em><b>Control Measure</b></em>' containment reference list.
	 * The list contents are of type {@link hazard.ControlMeasure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Measure</em>' containment reference list.
	 * @see hazard.Hazard_Package#getCause_ControlMeasure()
	 * @model containment="true"
	 * @generated
	 */
	EList<ControlMeasure> getControlMeasure();

} // Cause
