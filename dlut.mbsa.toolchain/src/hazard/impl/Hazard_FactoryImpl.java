/**
 */
package hazard.impl;

import hazard.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hazard_FactoryImpl extends EFactoryImpl implements Hazard_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Hazard_Factory init() {
		try {
			Hazard_Factory theHazard_Factory = (Hazard_Factory)EPackage.Registry.INSTANCE.getEFactory(Hazard_Package.eNS_URI);
			if (theHazard_Factory != null) {
				return theHazard_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Hazard_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hazard_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Hazard_Package.HAZARD_PACKAGE: return createHazardPackage();
			case Hazard_Package.HAZARD_PACKAGE_BINDING: return createHazardPackageBinding();
			case Hazard_Package.HAZARD_PACKAGE_INTERFACE: return createHazardPackageInterface();
			case Hazard_Package.HAZARDOUS_SITUATION: return createHazardousSituation();
			case Hazard_Package.CAUSE: return createCause();
			case Hazard_Package.CONTROL_MEASURE: return createControlMeasure();
			case Hazard_Package.VERIFICATIONOF_EFFECTIVENESS: return createVerificationofEffectiveness();
			case Hazard_Package.VALIDATION: return createValidation();
			case Hazard_Package.SAFETY_DECISION_RATIONALE: return createSafetyDecisionRationale();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Hazard_Package.SEVERITY:
				return createSeverityFromString(eDataType, initialValue);
			case Hazard_Package.PROBABILITY:
				return createProbabilityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Hazard_Package.SEVERITY:
				return convertSeverityToString(eDataType, instanceValue);
			case Hazard_Package.PROBABILITY:
				return convertProbabilityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HazardPackage createHazardPackage() {
		HazardPackageImpl hazardPackage = new HazardPackageImpl();
		return hazardPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HazardPackageBinding createHazardPackageBinding() {
		HazardPackageBindingImpl hazardPackageBinding = new HazardPackageBindingImpl();
		return hazardPackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HazardPackageInterface createHazardPackageInterface() {
		HazardPackageInterfaceImpl hazardPackageInterface = new HazardPackageInterfaceImpl();
		return hazardPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HazardousSituation createHazardousSituation() {
		HazardousSituationImpl hazardousSituation = new HazardousSituationImpl();
		return hazardousSituation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cause createCause() {
		CauseImpl cause = new CauseImpl();
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ControlMeasure createControlMeasure() {
		ControlMeasureImpl controlMeasure = new ControlMeasureImpl();
		return controlMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerificationofEffectiveness createVerificationofEffectiveness() {
		VerificationofEffectivenessImpl verificationofEffectiveness = new VerificationofEffectivenessImpl();
		return verificationofEffectiveness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Validation createValidation() {
		ValidationImpl validation = new ValidationImpl();
		return validation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyDecisionRationale createSafetyDecisionRationale() {
		SafetyDecisionRationaleImpl safetyDecisionRationale = new SafetyDecisionRationaleImpl();
		return safetyDecisionRationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Severity createSeverityFromString(EDataType eDataType, String initialValue) {
		Severity result = Severity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeverityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Probability createProbabilityFromString(EDataType eDataType, String initialValue) {
		Probability result = Probability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProbabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hazard_Package getHazard_Package() {
		return (Hazard_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Hazard_Package getPackage() {
		return Hazard_Package.eINSTANCE;
	}

} //Hazard_FactoryImpl
