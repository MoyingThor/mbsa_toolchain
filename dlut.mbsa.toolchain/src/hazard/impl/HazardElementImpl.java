/**
 */
package hazard.impl;

import base.impl.ArtifactElementImpl;

import hazard.HazardElement;
import hazard.Hazard_Package;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hazard Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class HazardElementImpl extends ArtifactElementImpl implements HazardElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HazardElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hazard_Package.Literals.HAZARD_ELEMENT;
	}

} //HazardElementImpl
