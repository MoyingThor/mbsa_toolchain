/**
 */
package hazard.impl;

import hazard.Cause;
import hazard.ControlMeasure;
import hazard.Hazard_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hazard.impl.CauseImpl#getControlMeasure <em>Control Measure</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CauseImpl extends HazardElementImpl implements Cause {
	/**
	 * The cached value of the '{@link #getControlMeasure() <em>Control Measure</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlMeasure> controlMeasure;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hazard_Package.Literals.CAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlMeasure> getControlMeasure() {
		if (controlMeasure == null) {
			controlMeasure = new EObjectResolvingEList<ControlMeasure>(ControlMeasure.class, this, Hazard_Package.CAUSE__CONTROL_MEASURE);
		}
		return controlMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hazard_Package.CAUSE__CONTROL_MEASURE:
				return getControlMeasure();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Hazard_Package.CAUSE__CONTROL_MEASURE:
				getControlMeasure().clear();
				getControlMeasure().addAll((Collection<? extends ControlMeasure>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Hazard_Package.CAUSE__CONTROL_MEASURE:
				getControlMeasure().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Hazard_Package.CAUSE__CONTROL_MEASURE:
				return controlMeasure != null && !controlMeasure.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CauseImpl
