/**
 */
package hazard.impl;

import hazard.ControlMeasure;
import hazard.Hazard_Package;
import hazard.SafetyDecisionRationale;
import hazard.Validation;
import hazard.VerificationofEffectiveness;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hazard.impl.ControlMeasureImpl#getSafetyDecisionRationale <em>Safety Decision Rationale</em>}</li>
 *   <li>{@link hazard.impl.ControlMeasureImpl#getVerificationofEffectiveness <em>Verificationof Effectiveness</em>}</li>
 *   <li>{@link hazard.impl.ControlMeasureImpl#getValidation <em>Validation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlMeasureImpl extends HazardElementImpl implements ControlMeasure {
	/**
	 * The cached value of the '{@link #getSafetyDecisionRationale() <em>Safety Decision Rationale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyDecisionRationale()
	 * @generated
	 * @ordered
	 */
	protected SafetyDecisionRationale safetyDecisionRationale;

	/**
	 * The cached value of the '{@link #getVerificationofEffectiveness() <em>Verificationof Effectiveness</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationofEffectiveness()
	 * @generated
	 * @ordered
	 */
	protected EList<VerificationofEffectiveness> verificationofEffectiveness;

	/**
	 * The cached value of the '{@link #getValidation() <em>Validation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidation()
	 * @generated
	 * @ordered
	 */
	protected EList<Validation> validation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlMeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hazard_Package.Literals.CONTROL_MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyDecisionRationale getSafetyDecisionRationale() {
		return safetyDecisionRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSafetyDecisionRationale(SafetyDecisionRationale newSafetyDecisionRationale, NotificationChain msgs) {
		SafetyDecisionRationale oldSafetyDecisionRationale = safetyDecisionRationale;
		safetyDecisionRationale = newSafetyDecisionRationale;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Hazard_Package.CONTROL_MEASURE__SAFETY_DECISION_RATIONALE, oldSafetyDecisionRationale, newSafetyDecisionRationale);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSafetyDecisionRationale(SafetyDecisionRationale newSafetyDecisionRationale) {
		if (newSafetyDecisionRationale != safetyDecisionRationale) {
			NotificationChain msgs = null;
			if (safetyDecisionRationale != null)
				msgs = ((InternalEObject)safetyDecisionRationale).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Hazard_Package.CONTROL_MEASURE__SAFETY_DECISION_RATIONALE, null, msgs);
			if (newSafetyDecisionRationale != null)
				msgs = ((InternalEObject)newSafetyDecisionRationale).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Hazard_Package.CONTROL_MEASURE__SAFETY_DECISION_RATIONALE, null, msgs);
			msgs = basicSetSafetyDecisionRationale(newSafetyDecisionRationale, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hazard_Package.CONTROL_MEASURE__SAFETY_DECISION_RATIONALE, newSafetyDecisionRationale, newSafetyDecisionRationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<VerificationofEffectiveness> getVerificationofEffectiveness() {
		if (verificationofEffectiveness == null) {
			verificationofEffectiveness = new EObjectContainmentEList<VerificationofEffectiveness>(VerificationofEffectiveness.class, this, Hazard_Package.CONTROL_MEASURE__VERIFICATIONOF_EFFECTIVENESS);
		}
		return verificationofEffectiveness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Validation> getValidation() {
		if (validation == null) {
			validation = new EObjectContainmentEList<Validation>(Validation.class, this, Hazard_Package.CONTROL_MEASURE__VALIDATION);
		}
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hazard_Package.CONTROL_MEASURE__SAFETY_DECISION_RATIONALE:
				return basicSetSafetyDecisionRationale(null, msgs);
			case Hazard_Package.CONTROL_MEASURE__VERIFICATIONOF_EFFECTIVENESS:
				return ((InternalEList<?>)getVerificationofEffectiveness()).basicRemove(otherEnd, msgs);
			case Hazard_Package.CONTROL_MEASURE__VALIDATION:
				return ((InternalEList<?>)getValidation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Hazard_Package.CONTROL_MEASURE__SAFETY_DECISION_RATIONALE:
				return getSafetyDecisionRationale();
			case Hazard_Package.CONTROL_MEASURE__VERIFICATIONOF_EFFECTIVENESS:
				return getVerificationofEffectiveness();
			case Hazard_Package.CONTROL_MEASURE__VALIDATION:
				return getValidation();
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
			case Hazard_Package.CONTROL_MEASURE__SAFETY_DECISION_RATIONALE:
				setSafetyDecisionRationale((SafetyDecisionRationale)newValue);
				return;
			case Hazard_Package.CONTROL_MEASURE__VERIFICATIONOF_EFFECTIVENESS:
				getVerificationofEffectiveness().clear();
				getVerificationofEffectiveness().addAll((Collection<? extends VerificationofEffectiveness>)newValue);
				return;
			case Hazard_Package.CONTROL_MEASURE__VALIDATION:
				getValidation().clear();
				getValidation().addAll((Collection<? extends Validation>)newValue);
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
			case Hazard_Package.CONTROL_MEASURE__SAFETY_DECISION_RATIONALE:
				setSafetyDecisionRationale((SafetyDecisionRationale)null);
				return;
			case Hazard_Package.CONTROL_MEASURE__VERIFICATIONOF_EFFECTIVENESS:
				getVerificationofEffectiveness().clear();
				return;
			case Hazard_Package.CONTROL_MEASURE__VALIDATION:
				getValidation().clear();
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
			case Hazard_Package.CONTROL_MEASURE__SAFETY_DECISION_RATIONALE:
				return safetyDecisionRationale != null;
			case Hazard_Package.CONTROL_MEASURE__VERIFICATIONOF_EFFECTIVENESS:
				return verificationofEffectiveness != null && !verificationofEffectiveness.isEmpty();
			case Hazard_Package.CONTROL_MEASURE__VALIDATION:
				return validation != null && !validation.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlMeasureImpl
