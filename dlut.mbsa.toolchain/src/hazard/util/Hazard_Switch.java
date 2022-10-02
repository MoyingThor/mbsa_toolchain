/**
 */
package hazard.util;

import base.ArtifactElement;
import base.BaseElement;
import base.Element;
import base.ModelElement;

import hazard.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
 * @see hazard.Hazard_Package
 * @generated
 */
public class Hazard_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hazard_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard_Switch() {
		if (modelPackage == null) {
			modelPackage = Hazard_Package.eINSTANCE;
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
			case Hazard_Package.HAZARD_ELEMENT: {
				HazardElement hazardElement = (HazardElement)theEObject;
				T result = caseHazardElement(hazardElement);
				if (result == null) result = caseArtifactElement(hazardElement);
				if (result == null) result = caseModelElement(hazardElement);
				if (result == null) result = caseBaseElement(hazardElement);
				if (result == null) result = caseElement(hazardElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hazard_Package.HAZARD_PACKAGE: {
				HazardPackage hazardPackage = (HazardPackage)theEObject;
				T result = caseHazardPackage(hazardPackage);
				if (result == null) result = caseHazardElement(hazardPackage);
				if (result == null) result = caseArtifactElement(hazardPackage);
				if (result == null) result = caseModelElement(hazardPackage);
				if (result == null) result = caseBaseElement(hazardPackage);
				if (result == null) result = caseElement(hazardPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hazard_Package.HAZARD_PACKAGE_BINDING: {
				HazardPackageBinding hazardPackageBinding = (HazardPackageBinding)theEObject;
				T result = caseHazardPackageBinding(hazardPackageBinding);
				if (result == null) result = caseHazardPackage(hazardPackageBinding);
				if (result == null) result = caseHazardElement(hazardPackageBinding);
				if (result == null) result = caseArtifactElement(hazardPackageBinding);
				if (result == null) result = caseModelElement(hazardPackageBinding);
				if (result == null) result = caseBaseElement(hazardPackageBinding);
				if (result == null) result = caseElement(hazardPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hazard_Package.HAZARD_PACKAGE_INTERFACE: {
				HazardPackageInterface hazardPackageInterface = (HazardPackageInterface)theEObject;
				T result = caseHazardPackageInterface(hazardPackageInterface);
				if (result == null) result = caseHazardPackage(hazardPackageInterface);
				if (result == null) result = caseHazardElement(hazardPackageInterface);
				if (result == null) result = caseArtifactElement(hazardPackageInterface);
				if (result == null) result = caseModelElement(hazardPackageInterface);
				if (result == null) result = caseBaseElement(hazardPackageInterface);
				if (result == null) result = caseElement(hazardPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hazard_Package.HAZARDOUS_SITUATION: {
				HazardousSituation hazardousSituation = (HazardousSituation)theEObject;
				T result = caseHazardousSituation(hazardousSituation);
				if (result == null) result = caseHazardElement(hazardousSituation);
				if (result == null) result = caseArtifactElement(hazardousSituation);
				if (result == null) result = caseModelElement(hazardousSituation);
				if (result == null) result = caseBaseElement(hazardousSituation);
				if (result == null) result = caseElement(hazardousSituation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hazard_Package.CAUSE: {
				Cause cause = (Cause)theEObject;
				T result = caseCause(cause);
				if (result == null) result = caseHazardElement(cause);
				if (result == null) result = caseArtifactElement(cause);
				if (result == null) result = caseModelElement(cause);
				if (result == null) result = caseBaseElement(cause);
				if (result == null) result = caseElement(cause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hazard_Package.CONTROL_MEASURE: {
				ControlMeasure controlMeasure = (ControlMeasure)theEObject;
				T result = caseControlMeasure(controlMeasure);
				if (result == null) result = caseHazardElement(controlMeasure);
				if (result == null) result = caseArtifactElement(controlMeasure);
				if (result == null) result = caseModelElement(controlMeasure);
				if (result == null) result = caseBaseElement(controlMeasure);
				if (result == null) result = caseElement(controlMeasure);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hazard_Package.VERIFICATIONOF_EFFECTIVENESS: {
				VerificationofEffectiveness verificationofEffectiveness = (VerificationofEffectiveness)theEObject;
				T result = caseVerificationofEffectiveness(verificationofEffectiveness);
				if (result == null) result = caseHazardElement(verificationofEffectiveness);
				if (result == null) result = caseArtifactElement(verificationofEffectiveness);
				if (result == null) result = caseModelElement(verificationofEffectiveness);
				if (result == null) result = caseBaseElement(verificationofEffectiveness);
				if (result == null) result = caseElement(verificationofEffectiveness);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hazard_Package.VALIDATION: {
				Validation validation = (Validation)theEObject;
				T result = caseValidation(validation);
				if (result == null) result = caseHazardElement(validation);
				if (result == null) result = caseArtifactElement(validation);
				if (result == null) result = caseModelElement(validation);
				if (result == null) result = caseBaseElement(validation);
				if (result == null) result = caseElement(validation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Hazard_Package.SAFETY_DECISION_RATIONALE: {
				SafetyDecisionRationale safetyDecisionRationale = (SafetyDecisionRationale)theEObject;
				T result = caseSafetyDecisionRationale(safetyDecisionRationale);
				if (result == null) result = caseHazardElement(safetyDecisionRationale);
				if (result == null) result = caseArtifactElement(safetyDecisionRationale);
				if (result == null) result = caseModelElement(safetyDecisionRationale);
				if (result == null) result = caseBaseElement(safetyDecisionRationale);
				if (result == null) result = caseElement(safetyDecisionRationale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardElement(HazardElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardPackage(HazardPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardPackageBinding(HazardPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazard Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazard Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardPackageInterface(HazardPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hazardous Situation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hazardous Situation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHazardousSituation(HazardousSituation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCause(Cause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Measure</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Measure</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlMeasure(ControlMeasure object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Verificationof Effectiveness</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Verificationof Effectiveness</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVerificationofEffectiveness(VerificationofEffectiveness object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidation(Validation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Decision Rationale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Decision Rationale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafetyDecisionRationale(SafetyDecisionRationale object) {
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

} //Hazard_Switch
