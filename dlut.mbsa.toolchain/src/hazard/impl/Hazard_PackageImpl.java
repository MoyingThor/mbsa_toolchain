/**
 */
package hazard.impl;

import base.Base_Package;

import base.impl.Base_PackageImpl;

import hazard.Cause;
import hazard.ControlMeasure;
import hazard.HazardElement;
import hazard.HazardPackage;
import hazard.HazardPackageBinding;
import hazard.HazardPackageInterface;
import hazard.Hazard_Factory;
import hazard.Hazard_Package;
import hazard.HazardousSituation;
import hazard.Probability;
import hazard.SafetyDecisionRationale;
import hazard.Severity;
import hazard.Validation;
import hazard.VerificationofEffectiveness;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hazard_PackageImpl extends EPackageImpl implements Hazard_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardPackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hazardousSituationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass causeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationofEffectivenessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyDecisionRationaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum severityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum probabilityEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hazard.Hazard_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Hazard_PackageImpl() {
		super(eNS_URI, Hazard_Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Hazard_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Hazard_Package init() {
		if (isInited) return (Hazard_Package)EPackage.Registry.INSTANCE.getEPackage(Hazard_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredHazard_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Hazard_PackageImpl theHazard_Package = registeredHazard_Package instanceof Hazard_PackageImpl ? (Hazard_PackageImpl)registeredHazard_Package : new Hazard_PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Base_PackageImpl theBase_Package = (Base_PackageImpl)(registeredPackage instanceof Base_PackageImpl ? registeredPackage : Base_Package.eINSTANCE);

		// Create package meta-data objects
		theHazard_Package.createPackageContents();
		theBase_Package.createPackageContents();

		// Initialize created meta-data
		theHazard_Package.initializePackageContents();
		theBase_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theHazard_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hazard_Package.eNS_URI, theHazard_Package);
		return theHazard_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHazardElement() {
		return hazardElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHazardPackage() {
		return hazardPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHazardPackage_Hazards() {
		return (EReference)hazardPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHazardPackage_Interface() {
		return (EReference)hazardPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHazardPackageBinding() {
		return hazardPackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHazardPackageBinding_ParticipantPackage() {
		return (EReference)hazardPackageBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHazardPackageInterface() {
		return hazardPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHazardPackageInterface_Implements() {
		return (EReference)hazardPackageInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHazardousSituation() {
		return hazardousSituationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHazardousSituation_Severity() {
		return (EAttribute)hazardousSituationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHazardousSituation_Probability() {
		return (EAttribute)hazardousSituationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHazardousSituation_Causes() {
		return (EReference)hazardousSituationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCause() {
		return causeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCause_ControlMeasure() {
		return (EReference)causeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getControlMeasure() {
		return controlMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlMeasure_SafetyDecisionRationale() {
		return (EReference)controlMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlMeasure_VerificationofEffectiveness() {
		return (EReference)controlMeasureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getControlMeasure_Validation() {
		return (EReference)controlMeasureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerificationofEffectiveness() {
		return verificationofEffectivenessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerificationofEffectiveness_Text() {
		return (EAttribute)verificationofEffectivenessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getValidation() {
		return validationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getValidation_Text() {
		return (EAttribute)validationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafetyDecisionRationale() {
		return safetyDecisionRationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyDecisionRationale_Text() {
		return (EAttribute)safetyDecisionRationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeverity() {
		return severityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProbability() {
		return probabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hazard_Factory getHazard_Factory() {
		return (Hazard_Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		hazardElementEClass = createEClass(HAZARD_ELEMENT);

		hazardPackageEClass = createEClass(HAZARD_PACKAGE);
		createEReference(hazardPackageEClass, HAZARD_PACKAGE__HAZARDS);
		createEReference(hazardPackageEClass, HAZARD_PACKAGE__INTERFACE);

		hazardPackageBindingEClass = createEClass(HAZARD_PACKAGE_BINDING);
		createEReference(hazardPackageBindingEClass, HAZARD_PACKAGE_BINDING__PARTICIPANT_PACKAGE);

		hazardPackageInterfaceEClass = createEClass(HAZARD_PACKAGE_INTERFACE);
		createEReference(hazardPackageInterfaceEClass, HAZARD_PACKAGE_INTERFACE__IMPLEMENTS);

		hazardousSituationEClass = createEClass(HAZARDOUS_SITUATION);
		createEAttribute(hazardousSituationEClass, HAZARDOUS_SITUATION__SEVERITY);
		createEAttribute(hazardousSituationEClass, HAZARDOUS_SITUATION__PROBABILITY);
		createEReference(hazardousSituationEClass, HAZARDOUS_SITUATION__CAUSES);

		causeEClass = createEClass(CAUSE);
		createEReference(causeEClass, CAUSE__CONTROL_MEASURE);

		controlMeasureEClass = createEClass(CONTROL_MEASURE);
		createEReference(controlMeasureEClass, CONTROL_MEASURE__SAFETY_DECISION_RATIONALE);
		createEReference(controlMeasureEClass, CONTROL_MEASURE__VERIFICATIONOF_EFFECTIVENESS);
		createEReference(controlMeasureEClass, CONTROL_MEASURE__VALIDATION);

		verificationofEffectivenessEClass = createEClass(VERIFICATIONOF_EFFECTIVENESS);
		createEAttribute(verificationofEffectivenessEClass, VERIFICATIONOF_EFFECTIVENESS__TEXT);

		validationEClass = createEClass(VALIDATION);
		createEAttribute(validationEClass, VALIDATION__TEXT);

		safetyDecisionRationaleEClass = createEClass(SAFETY_DECISION_RATIONALE);
		createEAttribute(safetyDecisionRationaleEClass, SAFETY_DECISION_RATIONALE__TEXT);

		// Create enums
		severityEEnum = createEEnum(SEVERITY);
		probabilityEEnum = createEEnum(PROBABILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Base_Package theBase_Package = (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		hazardElementEClass.getESuperTypes().add(theBase_Package.getArtifactElement());
		hazardPackageEClass.getESuperTypes().add(this.getHazardElement());
		hazardPackageBindingEClass.getESuperTypes().add(this.getHazardPackage());
		hazardPackageInterfaceEClass.getESuperTypes().add(this.getHazardPackage());
		hazardousSituationEClass.getESuperTypes().add(this.getHazardElement());
		causeEClass.getESuperTypes().add(this.getHazardElement());
		controlMeasureEClass.getESuperTypes().add(this.getHazardElement());
		verificationofEffectivenessEClass.getESuperTypes().add(this.getHazardElement());
		validationEClass.getESuperTypes().add(this.getHazardElement());
		safetyDecisionRationaleEClass.getESuperTypes().add(this.getHazardElement());

		// Initialize classes and features; add operations and parameters
		initEClass(hazardElementEClass, HazardElement.class, "HazardElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hazardPackageEClass, HazardPackage.class, "HazardPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHazardPackage_Hazards(), this.getHazardousSituation(), null, "hazards", null, 0, -1, HazardPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardPackage_Interface(), this.getHazardPackageInterface(), null, "interface", null, 0, -1, HazardPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardPackageBindingEClass, HazardPackageBinding.class, "HazardPackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHazardPackageBinding_ParticipantPackage(), this.getHazardPackage(), null, "participantPackage", null, 2, -1, HazardPackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardPackageInterfaceEClass, HazardPackageInterface.class, "HazardPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHazardPackageInterface_Implements(), this.getHazardPackage(), null, "implements", null, 1, 1, HazardPackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hazardousSituationEClass, HazardousSituation.class, "HazardousSituation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHazardousSituation_Severity(), this.getSeverity(), "severity", null, 0, 1, HazardousSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHazardousSituation_Probability(), this.getProbability(), "probability", null, 0, 1, HazardousSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHazardousSituation_Causes(), this.getCause(), null, "causes", null, 0, -1, HazardousSituation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(causeEClass, Cause.class, "Cause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCause_ControlMeasure(), this.getControlMeasure(), null, "controlMeasure", null, 0, -1, Cause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(controlMeasureEClass, ControlMeasure.class, "ControlMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControlMeasure_SafetyDecisionRationale(), this.getSafetyDecisionRationale(), null, "safetyDecisionRationale", null, 0, 1, ControlMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlMeasure_VerificationofEffectiveness(), this.getVerificationofEffectiveness(), null, "verificationofEffectiveness", null, 0, -1, ControlMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getControlMeasure_Validation(), this.getValidation(), null, "validation", null, 0, -1, ControlMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verificationofEffectivenessEClass, VerificationofEffectiveness.class, "VerificationofEffectiveness", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerificationofEffectiveness_Text(), ecorePackage.getEString(), "text", null, 0, 1, VerificationofEffectiveness.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(validationEClass, Validation.class, "Validation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValidation_Text(), ecorePackage.getEString(), "text", null, 0, 1, Validation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyDecisionRationaleEClass, SafetyDecisionRationale.class, "SafetyDecisionRationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSafetyDecisionRationale_Text(), ecorePackage.getEString(), "text", null, 0, 1, SafetyDecisionRationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(severityEEnum, Severity.class, "Severity");
		addEEnumLiteral(severityEEnum, Severity.CATASTROPHIC);
		addEEnumLiteral(severityEEnum, Severity.CRITICAL);
		addEEnumLiteral(severityEEnum, Severity.SERIOUS);
		addEEnumLiteral(severityEEnum, Severity.MINOR);
		addEEnumLiteral(severityEEnum, Severity.NEGLIGIBLE);

		initEEnum(probabilityEEnum, Probability.class, "Probability");
		addEEnumLiteral(probabilityEEnum, Probability.FREQUENT);
		addEEnumLiteral(probabilityEEnum, Probability.PROBABLE);
		addEEnumLiteral(probabilityEEnum, Probability.OCCASIONAL);
		addEEnumLiteral(probabilityEEnum, Probability.REMOTE);
		addEEnumLiteral(probabilityEEnum, Probability.IMPROBABLE);

		// Create resource
		createResource(eNS_URI);
	}

} //Hazard_PackageImpl
