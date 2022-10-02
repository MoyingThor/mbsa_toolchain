/**
 */
package hazard.impl;

import hazard.Cause;
import hazard.Hazard_Package;
import hazard.HazardousSituation;
import hazard.Probability;
import hazard.Severity;

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
 * An implementation of the model object '<em><b>Hazardous Situation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hazard.impl.HazardousSituationImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link hazard.impl.HazardousSituationImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link hazard.impl.HazardousSituationImpl#getCauses <em>Causes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardousSituationImpl extends HazardElementImpl implements HazardousSituation {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final Severity SEVERITY_EDEFAULT = Severity.CATASTROPHIC;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected Severity severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final Probability PROBABILITY_EDEFAULT = Probability.FREQUENT;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected Probability probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCauses() <em>Causes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauses()
	 * @generated
	 * @ordered
	 */
	protected EList<Cause> causes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardousSituationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hazard_Package.Literals.HAZARDOUS_SITUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Severity getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(Severity newSeverity) {
		Severity oldSeverity = severity;
		severity = newSeverity == null ? SEVERITY_EDEFAULT : newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hazard_Package.HAZARDOUS_SITUATION__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Probability getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProbability(Probability newProbability) {
		Probability oldProbability = probability;
		probability = newProbability == null ? PROBABILITY_EDEFAULT : newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hazard_Package.HAZARDOUS_SITUATION__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cause> getCauses() {
		if (causes == null) {
			causes = new EObjectContainmentEList<Cause>(Cause.class, this, Hazard_Package.HAZARDOUS_SITUATION__CAUSES);
		}
		return causes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hazard_Package.HAZARDOUS_SITUATION__CAUSES:
				return ((InternalEList<?>)getCauses()).basicRemove(otherEnd, msgs);
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
			case Hazard_Package.HAZARDOUS_SITUATION__SEVERITY:
				return getSeverity();
			case Hazard_Package.HAZARDOUS_SITUATION__PROBABILITY:
				return getProbability();
			case Hazard_Package.HAZARDOUS_SITUATION__CAUSES:
				return getCauses();
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
			case Hazard_Package.HAZARDOUS_SITUATION__SEVERITY:
				setSeverity((Severity)newValue);
				return;
			case Hazard_Package.HAZARDOUS_SITUATION__PROBABILITY:
				setProbability((Probability)newValue);
				return;
			case Hazard_Package.HAZARDOUS_SITUATION__CAUSES:
				getCauses().clear();
				getCauses().addAll((Collection<? extends Cause>)newValue);
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
			case Hazard_Package.HAZARDOUS_SITUATION__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
			case Hazard_Package.HAZARDOUS_SITUATION__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case Hazard_Package.HAZARDOUS_SITUATION__CAUSES:
				getCauses().clear();
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
			case Hazard_Package.HAZARDOUS_SITUATION__SEVERITY:
				return severity != SEVERITY_EDEFAULT;
			case Hazard_Package.HAZARDOUS_SITUATION__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case Hazard_Package.HAZARDOUS_SITUATION__CAUSES:
				return causes != null && !causes.isEmpty();
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
		result.append(" (severity: ");
		result.append(severity);
		result.append(", probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //HazardousSituationImpl
