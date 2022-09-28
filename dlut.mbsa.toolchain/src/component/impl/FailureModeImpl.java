/**
 */
package component.impl;

import component.Component_Package;
import component.FailureMode;
import component.FinalEffect;
import component.HigherLevelEffect;
import component.RegionalEffect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failure Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.FailureModeImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link component.impl.FailureModeImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link component.impl.FailureModeImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link component.impl.FailureModeImpl#getRegional <em>Regional</em>}</li>
 *   <li>{@link component.impl.FailureModeImpl#getHigher_level <em>Higher level</em>}</li>
 *   <li>{@link component.impl.FailureModeImpl#getFinal <em>Final</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailureModeImpl extends ComponentSafetyElementImpl implements FailureMode {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCause() <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected String cause = CAUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final float PROBABILITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected float probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRegional() <em>Regional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegional()
	 * @generated
	 * @ordered
	 */
	protected RegionalEffect regional;

	/**
	 * The cached value of the '{@link #getHigher_level() <em>Higher level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHigher_level()
	 * @generated
	 * @ordered
	 */
	protected HigherLevelEffect higher_level;

	/**
	 * The cached value of the '{@link #getFinal() <em>Final</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinal()
	 * @generated
	 * @ordered
	 */
	protected FinalEffect final_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailureModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_Package.Literals.FAILURE_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.FAILURE_MODE__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCause(String newCause) {
		String oldCause = cause;
		cause = newCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.FAILURE_MODE__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbability(float newProbability) {
		float oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.FAILURE_MODE__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegionalEffect getRegional() {
		return regional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegional(RegionalEffect newRegional, NotificationChain msgs) {
		RegionalEffect oldRegional = regional;
		regional = newRegional;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_Package.FAILURE_MODE__REGIONAL, oldRegional, newRegional);
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
	public void setRegional(RegionalEffect newRegional) {
		if (newRegional != regional) {
			NotificationChain msgs = null;
			if (regional != null)
				msgs = ((InternalEObject)regional).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Component_Package.FAILURE_MODE__REGIONAL, null, msgs);
			if (newRegional != null)
				msgs = ((InternalEObject)newRegional).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Component_Package.FAILURE_MODE__REGIONAL, null, msgs);
			msgs = basicSetRegional(newRegional, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.FAILURE_MODE__REGIONAL, newRegional, newRegional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HigherLevelEffect getHigher_level() {
		return higher_level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHigher_level(HigherLevelEffect newHigher_level, NotificationChain msgs) {
		HigherLevelEffect oldHigher_level = higher_level;
		higher_level = newHigher_level;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_Package.FAILURE_MODE__HIGHER_LEVEL, oldHigher_level, newHigher_level);
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
	public void setHigher_level(HigherLevelEffect newHigher_level) {
		if (newHigher_level != higher_level) {
			NotificationChain msgs = null;
			if (higher_level != null)
				msgs = ((InternalEObject)higher_level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Component_Package.FAILURE_MODE__HIGHER_LEVEL, null, msgs);
			if (newHigher_level != null)
				msgs = ((InternalEObject)newHigher_level).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Component_Package.FAILURE_MODE__HIGHER_LEVEL, null, msgs);
			msgs = basicSetHigher_level(newHigher_level, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.FAILURE_MODE__HIGHER_LEVEL, newHigher_level, newHigher_level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FinalEffect getFinal() {
		return final_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinal(FinalEffect newFinal, NotificationChain msgs) {
		FinalEffect oldFinal = final_;
		final_ = newFinal;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Component_Package.FAILURE_MODE__FINAL, oldFinal, newFinal);
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
	public void setFinal(FinalEffect newFinal) {
		if (newFinal != final_) {
			NotificationChain msgs = null;
			if (final_ != null)
				msgs = ((InternalEObject)final_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Component_Package.FAILURE_MODE__FINAL, null, msgs);
			if (newFinal != null)
				msgs = ((InternalEObject)newFinal).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Component_Package.FAILURE_MODE__FINAL, null, msgs);
			msgs = basicSetFinal(newFinal, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.FAILURE_MODE__FINAL, newFinal, newFinal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_Package.FAILURE_MODE__REGIONAL:
				return basicSetRegional(null, msgs);
			case Component_Package.FAILURE_MODE__HIGHER_LEVEL:
				return basicSetHigher_level(null, msgs);
			case Component_Package.FAILURE_MODE__FINAL:
				return basicSetFinal(null, msgs);
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
			case Component_Package.FAILURE_MODE__MODE:
				return getMode();
			case Component_Package.FAILURE_MODE__CAUSE:
				return getCause();
			case Component_Package.FAILURE_MODE__PROBABILITY:
				return getProbability();
			case Component_Package.FAILURE_MODE__REGIONAL:
				return getRegional();
			case Component_Package.FAILURE_MODE__HIGHER_LEVEL:
				return getHigher_level();
			case Component_Package.FAILURE_MODE__FINAL:
				return getFinal();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Component_Package.FAILURE_MODE__MODE:
				setMode((String)newValue);
				return;
			case Component_Package.FAILURE_MODE__CAUSE:
				setCause((String)newValue);
				return;
			case Component_Package.FAILURE_MODE__PROBABILITY:
				setProbability((Float)newValue);
				return;
			case Component_Package.FAILURE_MODE__REGIONAL:
				setRegional((RegionalEffect)newValue);
				return;
			case Component_Package.FAILURE_MODE__HIGHER_LEVEL:
				setHigher_level((HigherLevelEffect)newValue);
				return;
			case Component_Package.FAILURE_MODE__FINAL:
				setFinal((FinalEffect)newValue);
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
			case Component_Package.FAILURE_MODE__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case Component_Package.FAILURE_MODE__CAUSE:
				setCause(CAUSE_EDEFAULT);
				return;
			case Component_Package.FAILURE_MODE__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case Component_Package.FAILURE_MODE__REGIONAL:
				setRegional((RegionalEffect)null);
				return;
			case Component_Package.FAILURE_MODE__HIGHER_LEVEL:
				setHigher_level((HigherLevelEffect)null);
				return;
			case Component_Package.FAILURE_MODE__FINAL:
				setFinal((FinalEffect)null);
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
			case Component_Package.FAILURE_MODE__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case Component_Package.FAILURE_MODE__CAUSE:
				return CAUSE_EDEFAULT == null ? cause != null : !CAUSE_EDEFAULT.equals(cause);
			case Component_Package.FAILURE_MODE__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case Component_Package.FAILURE_MODE__REGIONAL:
				return regional != null;
			case Component_Package.FAILURE_MODE__HIGHER_LEVEL:
				return higher_level != null;
			case Component_Package.FAILURE_MODE__FINAL:
				return final_ != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (mode: ");
		result.append(mode);
		result.append(", cause: ");
		result.append(cause);
		result.append(", probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //FailureModeImpl
