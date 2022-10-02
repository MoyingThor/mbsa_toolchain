/**
 */
package requirement.impl;

import base.impl.ArtifactElementImpl;

import org.eclipse.emf.ecore.EClass;

import requirement.RequirementElement;
import requirement.Requirement_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class RequirementElementImpl extends ArtifactElementImpl implements RequirementElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirement_Package.Literals.REQUIREMENT_ELEMENT;
	}

} //RequirementElementImpl
