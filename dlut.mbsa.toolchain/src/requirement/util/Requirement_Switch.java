/**
 */
package requirement.util;

import base.ArtifactElement;
import base.BaseElement;
import base.Element;
import base.ModelElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import requirement.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see requirement.Requirement_Package
 * @generated
 */
public class Requirement_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Requirement_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Switch() {
		if (modelPackage == null) {
			modelPackage = Requirement_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Requirement_Package.REQUIREMENT_ELEMENT: {
				RequirementElement requirementElement = (RequirementElement)theEObject;
				T result = caseRequirementElement(requirementElement);
				if (result == null) result = caseArtifactElement(requirementElement);
				if (result == null) result = caseModelElement(requirementElement);
				if (result == null) result = caseBaseElement(requirementElement);
				if (result == null) result = caseElement(requirementElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.REQUIREMENT_PACKAGE: {
				RequirementPackage requirementPackage = (RequirementPackage)theEObject;
				T result = caseRequirementPackage(requirementPackage);
				if (result == null) result = caseRequirementElement(requirementPackage);
				if (result == null) result = caseArtifactElement(requirementPackage);
				if (result == null) result = caseModelElement(requirementPackage);
				if (result == null) result = caseBaseElement(requirementPackage);
				if (result == null) result = caseElement(requirementPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.REQUIREMENT_PACKAGE_BINDING: {
				RequirementPackageBinding requirementPackageBinding = (RequirementPackageBinding)theEObject;
				T result = caseRequirementPackageBinding(requirementPackageBinding);
				if (result == null) result = caseRequirementPackage(requirementPackageBinding);
				if (result == null) result = caseRequirementElement(requirementPackageBinding);
				if (result == null) result = caseArtifactElement(requirementPackageBinding);
				if (result == null) result = caseModelElement(requirementPackageBinding);
				if (result == null) result = caseBaseElement(requirementPackageBinding);
				if (result == null) result = caseElement(requirementPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.REQUIREMENT_PACKAGE_INTERFACE: {
				RequirementPackageInterface requirementPackageInterface = (RequirementPackageInterface)theEObject;
				T result = caseRequirementPackageInterface(requirementPackageInterface);
				if (result == null) result = caseRequirementPackage(requirementPackageInterface);
				if (result == null) result = caseRequirementElement(requirementPackageInterface);
				if (result == null) result = caseArtifactElement(requirementPackageInterface);
				if (result == null) result = caseModelElement(requirementPackageInterface);
				if (result == null) result = caseBaseElement(requirementPackageInterface);
				if (result == null) result = caseElement(requirementPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseRequirementElement(requirement);
				if (result == null) result = caseArtifactElement(requirement);
				if (result == null) result = caseModelElement(requirement);
				if (result == null) result = caseBaseElement(requirement);
				if (result == null) result = caseElement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.REQUIREMENT_RELATIONSHIP: {
				RequirementRelationship requirementRelationship = (RequirementRelationship)theEObject;
				T result = caseRequirementRelationship(requirementRelationship);
				if (result == null) result = caseRequirementElement(requirementRelationship);
				if (result == null) result = caseArtifactElement(requirementRelationship);
				if (result == null) result = caseModelElement(requirementRelationship);
				if (result == null) result = caseBaseElement(requirementRelationship);
				if (result == null) result = caseElement(requirementRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementElement(RequirementElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementPackage(RequirementPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementPackageBinding(RequirementPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementPackageInterface(RequirementPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementRelationship(RequirementRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseElement(BaseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactElement(ArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Requirement_Switch
