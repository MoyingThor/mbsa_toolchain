/**
 */
package requirement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import requirement.RequirementElement;
import requirement.RequirementPackage;
import requirement.RequirementPackageInterface;
import requirement.Requirement_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirement.impl.RequirementPackageImpl#getRequirementElement <em>Requirement Element</em>}</li>
 *   <li>{@link requirement.impl.RequirementPackageImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementPackageImpl extends RequirementElementImpl implements RequirementPackage {
	/**
	 * The cached value of the '{@link #getRequirementElement() <em>Requirement Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementElement()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementElement> requirementElement;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementPackageInterface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirement_Package.Literals.REQUIREMENT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementElement> getRequirementElement() {
		if (requirementElement == null) {
			requirementElement = new EObjectContainmentEList<RequirementElement>(RequirementElement.class, this, Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ELEMENT);
		}
		return requirementElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementPackageInterface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectResolvingEList<RequirementPackageInterface>(RequirementPackageInterface.class, this, Requirement_Package.REQUIREMENT_PACKAGE__INTERFACE);
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
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ELEMENT:
				return ((InternalEList<?>)getRequirementElement()).basicRemove(otherEnd, msgs);
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
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ELEMENT:
				return getRequirementElement();
			case Requirement_Package.REQUIREMENT_PACKAGE__INTERFACE:
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
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ELEMENT:
				getRequirementElement().clear();
				getRequirementElement().addAll((Collection<? extends RequirementElement>)newValue);
				return;
			case Requirement_Package.REQUIREMENT_PACKAGE__INTERFACE:
				getInterface().clear();
				getInterface().addAll((Collection<? extends RequirementPackageInterface>)newValue);
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
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ELEMENT:
				getRequirementElement().clear();
				return;
			case Requirement_Package.REQUIREMENT_PACKAGE__INTERFACE:
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
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ELEMENT:
				return requirementElement != null && !requirementElement.isEmpty();
			case Requirement_Package.REQUIREMENT_PACKAGE__INTERFACE:
				return interface_ != null && !interface_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementPackageImpl
