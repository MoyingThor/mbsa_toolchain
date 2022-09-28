/**
 */
package component.util;

import base.ArtifactElement;
import base.BaseElement;
import base.Element;
import base.ModelElement;

import component.*;

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
 * @see component.Component_Package
 * @generated
 */
public class Component_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Component_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component_Switch() {
		if (modelPackage == null) {
			modelPackage = Component_Package.eINSTANCE;
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
			case Component_Package.COMPONENT_ELEMENT: {
				ComponentElement componentElement = (ComponentElement)theEObject;
				T result = caseComponentElement(componentElement);
				if (result == null) result = caseArtifactElement(componentElement);
				if (result == null) result = caseModelElement(componentElement);
				if (result == null) result = caseBaseElement(componentElement);
				if (result == null) result = caseElement(componentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.COMPONENT_PACKAGE: {
				ComponentPackage componentPackage = (ComponentPackage)theEObject;
				T result = caseComponentPackage(componentPackage);
				if (result == null) result = caseComponentElement(componentPackage);
				if (result == null) result = caseArtifactElement(componentPackage);
				if (result == null) result = caseModelElement(componentPackage);
				if (result == null) result = caseBaseElement(componentPackage);
				if (result == null) result = caseElement(componentPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.COMPONENT_PACKAGE_INTERFACE: {
				ComponentPackageInterface componentPackageInterface = (ComponentPackageInterface)theEObject;
				T result = caseComponentPackageInterface(componentPackageInterface);
				if (result == null) result = caseComponentElement(componentPackageInterface);
				if (result == null) result = caseArtifactElement(componentPackageInterface);
				if (result == null) result = caseModelElement(componentPackageInterface);
				if (result == null) result = caseBaseElement(componentPackageInterface);
				if (result == null) result = caseElement(componentPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.COMPONENT_PACKAGE_BINDING: {
				ComponentPackageBinding componentPackageBinding = (ComponentPackageBinding)theEObject;
				T result = caseComponentPackageBinding(componentPackageBinding);
				if (result == null) result = caseComponentElement(componentPackageBinding);
				if (result == null) result = caseArtifactElement(componentPackageBinding);
				if (result == null) result = caseModelElement(componentPackageBinding);
				if (result == null) result = caseBaseElement(componentPackageBinding);
				if (result == null) result = caseElement(componentPackageBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseComponentElement(component);
				if (result == null) result = caseArtifactElement(component);
				if (result == null) result = caseModelElement(component);
				if (result == null) result = caseBaseElement(component);
				if (result == null) result = caseElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.COMPONENT_RELATIONSHIP: {
				ComponentRelationship componentRelationship = (ComponentRelationship)theEObject;
				T result = caseComponentRelationship(componentRelationship);
				if (result == null) result = caseComponentElement(componentRelationship);
				if (result == null) result = caseArtifactElement(componentRelationship);
				if (result == null) result = caseModelElement(componentRelationship);
				if (result == null) result = caseBaseElement(componentRelationship);
				if (result == null) result = caseElement(componentRelationship);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.COMPONENT_ASSET: {
				ComponentAsset componentAsset = (ComponentAsset)theEObject;
				T result = caseComponentAsset(componentAsset);
				if (result == null) result = caseComponentElement(componentAsset);
				if (result == null) result = caseArtifactElement(componentAsset);
				if (result == null) result = caseModelElement(componentAsset);
				if (result == null) result = caseBaseElement(componentAsset);
				if (result == null) result = caseElement(componentAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseComponentAsset(function);
				if (result == null) result = caseComponentElement(function);
				if (result == null) result = caseArtifactElement(function);
				if (result == null) result = caseModelElement(function);
				if (result == null) result = caseBaseElement(function);
				if (result == null) result = caseElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.INPUT: {
				Input input = (Input)theEObject;
				T result = caseInput(input);
				if (result == null) result = caseComponentAsset(input);
				if (result == null) result = caseComponentElement(input);
				if (result == null) result = caseArtifactElement(input);
				if (result == null) result = caseModelElement(input);
				if (result == null) result = caseBaseElement(input);
				if (result == null) result = caseElement(input);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.OUTPUT: {
				Output output = (Output)theEObject;
				T result = caseOutput(output);
				if (result == null) result = caseComponentAsset(output);
				if (result == null) result = caseComponentElement(output);
				if (result == null) result = caseArtifactElement(output);
				if (result == null) result = caseModelElement(output);
				if (result == null) result = caseBaseElement(output);
				if (result == null) result = caseElement(output);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.COMPONENT_SAFETY_ELEMENT: {
				ComponentSafetyElement componentSafetyElement = (ComponentSafetyElement)theEObject;
				T result = caseComponentSafetyElement(componentSafetyElement);
				if (result == null) result = caseComponentAsset(componentSafetyElement);
				if (result == null) result = caseComponentElement(componentSafetyElement);
				if (result == null) result = caseArtifactElement(componentSafetyElement);
				if (result == null) result = caseModelElement(componentSafetyElement);
				if (result == null) result = caseBaseElement(componentSafetyElement);
				if (result == null) result = caseElement(componentSafetyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.FAILURE_MODE: {
				FailureMode failureMode = (FailureMode)theEObject;
				T result = caseFailureMode(failureMode);
				if (result == null) result = caseComponentSafetyElement(failureMode);
				if (result == null) result = caseComponentAsset(failureMode);
				if (result == null) result = caseComponentElement(failureMode);
				if (result == null) result = caseArtifactElement(failureMode);
				if (result == null) result = caseModelElement(failureMode);
				if (result == null) result = caseBaseElement(failureMode);
				if (result == null) result = caseElement(failureMode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.SAFETY_MECHANISM: {
				Safety_Mechanism safety_Mechanism = (Safety_Mechanism)theEObject;
				T result = caseSafety_Mechanism(safety_Mechanism);
				if (result == null) result = caseComponentSafetyElement(safety_Mechanism);
				if (result == null) result = caseComponentAsset(safety_Mechanism);
				if (result == null) result = caseComponentElement(safety_Mechanism);
				if (result == null) result = caseArtifactElement(safety_Mechanism);
				if (result == null) result = caseModelElement(safety_Mechanism);
				if (result == null) result = caseBaseElement(safety_Mechanism);
				if (result == null) result = caseElement(safety_Mechanism);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.FAILURE_EFFECT: {
				FailureEffect failureEffect = (FailureEffect)theEObject;
				T result = caseFailureEffect(failureEffect);
				if (result == null) result = caseComponentSafetyElement(failureEffect);
				if (result == null) result = caseComponentAsset(failureEffect);
				if (result == null) result = caseComponentElement(failureEffect);
				if (result == null) result = caseArtifactElement(failureEffect);
				if (result == null) result = caseModelElement(failureEffect);
				if (result == null) result = caseBaseElement(failureEffect);
				if (result == null) result = caseElement(failureEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.REGIONAL_EFFECT: {
				RegionalEffect regionalEffect = (RegionalEffect)theEObject;
				T result = caseRegionalEffect(regionalEffect);
				if (result == null) result = caseFailureEffect(regionalEffect);
				if (result == null) result = caseComponentSafetyElement(regionalEffect);
				if (result == null) result = caseComponentAsset(regionalEffect);
				if (result == null) result = caseComponentElement(regionalEffect);
				if (result == null) result = caseArtifactElement(regionalEffect);
				if (result == null) result = caseModelElement(regionalEffect);
				if (result == null) result = caseBaseElement(regionalEffect);
				if (result == null) result = caseElement(regionalEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.HIGHER_LEVEL_EFFECT: {
				HigherLevelEffect higherLevelEffect = (HigherLevelEffect)theEObject;
				T result = caseHigherLevelEffect(higherLevelEffect);
				if (result == null) result = caseFailureEffect(higherLevelEffect);
				if (result == null) result = caseComponentSafetyElement(higherLevelEffect);
				if (result == null) result = caseComponentAsset(higherLevelEffect);
				if (result == null) result = caseComponentElement(higherLevelEffect);
				if (result == null) result = caseArtifactElement(higherLevelEffect);
				if (result == null) result = caseModelElement(higherLevelEffect);
				if (result == null) result = caseBaseElement(higherLevelEffect);
				if (result == null) result = caseElement(higherLevelEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Component_Package.FINAL_EFFECT: {
				FinalEffect finalEffect = (FinalEffect)theEObject;
				T result = caseFinalEffect(finalEffect);
				if (result == null) result = caseFailureEffect(finalEffect);
				if (result == null) result = caseComponentSafetyElement(finalEffect);
				if (result == null) result = caseComponentAsset(finalEffect);
				if (result == null) result = caseComponentElement(finalEffect);
				if (result == null) result = caseArtifactElement(finalEffect);
				if (result == null) result = caseModelElement(finalEffect);
				if (result == null) result = caseBaseElement(finalEffect);
				if (result == null) result = caseElement(finalEffect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentElement(ComponentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPackage(ComponentPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPackageInterface(ComponentPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Package Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Package Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentPackageBinding(ComponentPackageBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentRelationship(ComponentRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentAsset(ComponentAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutput(Output object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Safety Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Safety Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSafetyElement(ComponentSafetyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Mode</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Mode</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureMode(FailureMode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Safety Mechanism</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Safety Mechanism</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSafety_Mechanism(Safety_Mechanism object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failure Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failure Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailureEffect(FailureEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regional Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regional Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegionalEffect(RegionalEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Higher Level Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Higher Level Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHigherLevelEffect(HigherLevelEffect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Final Effect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Final Effect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinalEffect(FinalEffect object) {
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

} //Component_Switch
