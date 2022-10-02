/**
 */
package mbsa.impl;

import base.impl.ArtifactElementImpl;

import component.ComponentPackage;

import hazard.HazardPackage;

import java.util.Collection;

import mbsa.MBSAPackage;
import mbsa.MBSA_Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import requirement.RequirementPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MBSA Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mbsa.impl.MBSAPackageImpl#getMbsaPackages <em>Mbsa Packages</em>}</li>
 *   <li>{@link mbsa.impl.MBSAPackageImpl#getComponentPackage <em>Component Package</em>}</li>
 *   <li>{@link mbsa.impl.MBSAPackageImpl#getRequirementPackage <em>Requirement Package</em>}</li>
 *   <li>{@link mbsa.impl.MBSAPackageImpl#getHazardPackage <em>Hazard Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MBSAPackageImpl extends ArtifactElementImpl implements MBSAPackage {
	/**
	 * The cached value of the '{@link #getMbsaPackages() <em>Mbsa Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMbsaPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<MBSAPackage> mbsaPackages;

	/**
	 * The cached value of the '{@link #getComponentPackage() <em>Component Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentPackage> componentPackage;

	/**
	 * The cached value of the '{@link #getRequirementPackage() <em>Requirement Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementPackage> requirementPackage;

	/**
	 * The cached value of the '{@link #getHazardPackage() <em>Hazard Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<HazardPackage> hazardPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MBSAPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MBSA_Package.Literals.MBSA_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MBSAPackage> getMbsaPackages() {
		if (mbsaPackages == null) {
			mbsaPackages = new EObjectContainmentEList<MBSAPackage>(MBSAPackage.class, this, MBSA_Package.MBSA_PACKAGE__MBSA_PACKAGES);
		}
		return mbsaPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentPackage> getComponentPackage() {
		if (componentPackage == null) {
			componentPackage = new EObjectContainmentEList<ComponentPackage>(ComponentPackage.class, this, MBSA_Package.MBSA_PACKAGE__COMPONENT_PACKAGE);
		}
		return componentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementPackage> getRequirementPackage() {
		if (requirementPackage == null) {
			requirementPackage = new EObjectContainmentEList<RequirementPackage>(RequirementPackage.class, this, MBSA_Package.MBSA_PACKAGE__REQUIREMENT_PACKAGE);
		}
		return requirementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HazardPackage> getHazardPackage() {
		if (hazardPackage == null) {
			hazardPackage = new EObjectContainmentEList<HazardPackage>(HazardPackage.class, this, MBSA_Package.MBSA_PACKAGE__HAZARD_PACKAGE);
		}
		return hazardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MBSA_Package.MBSA_PACKAGE__MBSA_PACKAGES:
				return ((InternalEList<?>)getMbsaPackages()).basicRemove(otherEnd, msgs);
			case MBSA_Package.MBSA_PACKAGE__COMPONENT_PACKAGE:
				return ((InternalEList<?>)getComponentPackage()).basicRemove(otherEnd, msgs);
			case MBSA_Package.MBSA_PACKAGE__REQUIREMENT_PACKAGE:
				return ((InternalEList<?>)getRequirementPackage()).basicRemove(otherEnd, msgs);
			case MBSA_Package.MBSA_PACKAGE__HAZARD_PACKAGE:
				return ((InternalEList<?>)getHazardPackage()).basicRemove(otherEnd, msgs);
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
			case MBSA_Package.MBSA_PACKAGE__MBSA_PACKAGES:
				return getMbsaPackages();
			case MBSA_Package.MBSA_PACKAGE__COMPONENT_PACKAGE:
				return getComponentPackage();
			case MBSA_Package.MBSA_PACKAGE__REQUIREMENT_PACKAGE:
				return getRequirementPackage();
			case MBSA_Package.MBSA_PACKAGE__HAZARD_PACKAGE:
				return getHazardPackage();
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
			case MBSA_Package.MBSA_PACKAGE__MBSA_PACKAGES:
				getMbsaPackages().clear();
				getMbsaPackages().addAll((Collection<? extends MBSAPackage>)newValue);
				return;
			case MBSA_Package.MBSA_PACKAGE__COMPONENT_PACKAGE:
				getComponentPackage().clear();
				getComponentPackage().addAll((Collection<? extends ComponentPackage>)newValue);
				return;
			case MBSA_Package.MBSA_PACKAGE__REQUIREMENT_PACKAGE:
				getRequirementPackage().clear();
				getRequirementPackage().addAll((Collection<? extends RequirementPackage>)newValue);
				return;
			case MBSA_Package.MBSA_PACKAGE__HAZARD_PACKAGE:
				getHazardPackage().clear();
				getHazardPackage().addAll((Collection<? extends HazardPackage>)newValue);
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
			case MBSA_Package.MBSA_PACKAGE__MBSA_PACKAGES:
				getMbsaPackages().clear();
				return;
			case MBSA_Package.MBSA_PACKAGE__COMPONENT_PACKAGE:
				getComponentPackage().clear();
				return;
			case MBSA_Package.MBSA_PACKAGE__REQUIREMENT_PACKAGE:
				getRequirementPackage().clear();
				return;
			case MBSA_Package.MBSA_PACKAGE__HAZARD_PACKAGE:
				getHazardPackage().clear();
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
			case MBSA_Package.MBSA_PACKAGE__MBSA_PACKAGES:
				return mbsaPackages != null && !mbsaPackages.isEmpty();
			case MBSA_Package.MBSA_PACKAGE__COMPONENT_PACKAGE:
				return componentPackage != null && !componentPackage.isEmpty();
			case MBSA_Package.MBSA_PACKAGE__REQUIREMENT_PACKAGE:
				return requirementPackage != null && !requirementPackage.isEmpty();
			case MBSA_Package.MBSA_PACKAGE__HAZARD_PACKAGE:
				return hazardPackage != null && !hazardPackage.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MBSAPackageImpl
