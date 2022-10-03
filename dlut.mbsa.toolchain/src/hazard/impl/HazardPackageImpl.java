/**
 */
package hazard.impl;

import hazard.HazardElement;
import hazard.HazardPackage;
import hazard.HazardPackageInterface;
import hazard.Hazard_Package;
import hazard.HazardousSituation;

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
 * An implementation of the model object '<em><b>Hazard Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hazard.impl.HazardPackageImpl#getHazardElement <em>Hazard Element</em>}</li>
 *   <li>{@link hazard.impl.HazardPackageImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HazardPackageImpl extends HazardElementImpl implements HazardPackage {
	/**
	 * The cached value of the '{@link #getHazardElement() <em>Hazard Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardElement()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardElement> hazardElement;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardPackageInterface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hazard_Package.Literals.HAZARD_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HazardElement> getHazardElement() {
		if (hazardElement == null) {
			hazardElement = new EObjectContainmentEList<HazardElement>(HazardElement.class, this, Hazard_Package.HAZARD_PACKAGE__HAZARD_ELEMENT);
		}
		return hazardElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HazardPackageInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<HazardPackageInterface>(HazardPackageInterface.class, this, Hazard_Package.HAZARD_PACKAGE__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Hazard_Package.HAZARD_PACKAGE__HAZARD_ELEMENT:
				return ((InternalEList<?>)getHazardElement()).basicRemove(otherEnd, msgs);
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
			case Hazard_Package.HAZARD_PACKAGE__HAZARD_ELEMENT:
				return getHazardElement();
			case Hazard_Package.HAZARD_PACKAGE__INTERFACE:
				return getInterface();
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
			case Hazard_Package.HAZARD_PACKAGE__HAZARD_ELEMENT:
				getHazardElement().clear();
				getHazardElement().addAll((Collection<? extends HazardElement>)newValue);
				return;
			case Hazard_Package.HAZARD_PACKAGE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends HazardPackageInterface>)newValue);
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
			case Hazard_Package.HAZARD_PACKAGE__HAZARD_ELEMENT:
				getHazardElement().clear();
				return;
			case Hazard_Package.HAZARD_PACKAGE__INTERFACE:
				getInterface().clear();
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
			case Hazard_Package.HAZARD_PACKAGE__HAZARD_ELEMENT:
				return hazardElement != null && !hazardElement.isEmpty();
			case Hazard_Package.HAZARD_PACKAGE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HazardPackageImpl
