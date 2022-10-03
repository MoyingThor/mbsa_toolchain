/**
 */
package component.impl;

import base.Base_Package;

import base.impl.Base_PackageImpl;

import component.Component;
import component.ComponentAsset;
import component.ComponentElement;
import component.ComponentPackage;
import component.ComponentPackageBinding;
import component.ComponentPackageInterface;
import component.ComponentRelationship;
import component.ComponentSafetyElement;
import component.Component_Factory;
import component.Component_Package;
import component.FailureEffect;
import component.FailureMode;
import component.FailureSeverity;
import component.FinalEffect;
import component.Function;
import component.HigherLevelEffect;
import component.Input;
import component.Output;
import component.RegionalEffect;
import component.SafetyMechanism;
import component.Safety_Mechanism;

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
public class Component_PackageImpl extends EPackageImpl implements Component_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentPackageBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSafetyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyMechanismEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failureEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionalEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass higherLevelEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum failureSeverityEEnum = null;

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
	 * @see component.Component_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Component_PackageImpl() {
		super(eNS_URI, Component_Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Component_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Component_Package init() {
		if (isInited) return (Component_Package)EPackage.Registry.INSTANCE.getEPackage(Component_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredComponent_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Component_PackageImpl theComponent_Package = registeredComponent_Package instanceof Component_PackageImpl ? (Component_PackageImpl)registeredComponent_Package : new Component_PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Base_PackageImpl theBase_Package = (Base_PackageImpl)(registeredPackage instanceof Base_PackageImpl ? registeredPackage : Base_Package.eINSTANCE);

		// Create package meta-data objects
		theComponent_Package.createPackageContents();
		theBase_Package.createPackageContents();

		// Initialize created meta-data
		theComponent_Package.initializePackageContents();
		theBase_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComponent_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Component_Package.eNS_URI, theComponent_Package);
		return theComponent_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentElement() {
		return componentElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPackage() {
		return componentPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPackage_Components() {
		return (EReference)componentPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPackage_Interface() {
		return (EReference)componentPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPackageInterface() {
		return componentPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPackageInterface_Implements() {
		return (EReference)componentPackageInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentPackageBinding() {
		return componentPackageBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentPackageBinding_ParticipantPackage() {
		return (EReference)componentPackageBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Identity() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Component_name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Reuse() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Cots() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Fit() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Safety_related() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Sil() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Function() {
		return (EReference)componentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Inputs() {
		return (EReference)componentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Outputs() {
		return (EReference)componentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Sub_components() {
		return (EReference)componentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Failure_modes() {
		return (EReference)componentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Safety_mechanisms() {
		return (EReference)componentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Requirements() {
		return (EReference)componentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentRelationship() {
		return componentRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentRelationship_Label() {
		return (EAttribute)componentRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentRelationship_Source() {
		return (EReference)componentRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentRelationship_Target() {
		return (EReference)componentRelationshipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentAsset() {
		return componentAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunction() {
		return functionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunction_Func() {
		return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Input() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInput_Source() {
		return (EReference)inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Output() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOutput_Target() {
		return (EReference)outputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentSafetyElement() {
		return componentSafetyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentSafetyElement_Identity() {
		return (EAttribute)componentSafetyElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFailureMode() {
		return failureModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFailureMode_Mode() {
		return (EAttribute)failureModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFailureMode_Cause() {
		return (EAttribute)failureModeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFailureMode_Probability() {
		return (EAttribute)failureModeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFailureMode_Hazards() {
		return (EReference)failureModeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFailureMode_Regional() {
		return (EReference)failureModeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFailureMode_Higher_level() {
		return (EReference)failureModeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFailureMode_Final() {
		return (EReference)failureModeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafetyMechanism() {
		return safetyMechanismEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSafetyMechanism_Handle() {
		return (EReference)safetyMechanismEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyMechanism_Mechanism() {
		return (EAttribute)safetyMechanismEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyMechanism_Coverage() {
		return (EAttribute)safetyMechanismEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFailureEffect() {
		return failureEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFailureEffect_Desc() {
		return (EAttribute)failureEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFailureEffect_Affected() {
		return (EReference)failureEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegionalEffect() {
		return regionalEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHigherLevelEffect() {
		return higherLevelEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFinalEffect() {
		return finalEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFailureSeverity() {
		return failureSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component_Factory getComponent_Factory() {
		return (Component_Factory)getEFactoryInstance();
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
		componentElementEClass = createEClass(COMPONENT_ELEMENT);

		componentPackageEClass = createEClass(COMPONENT_PACKAGE);
		createEReference(componentPackageEClass, COMPONENT_PACKAGE__COMPONENTS);
		createEReference(componentPackageEClass, COMPONENT_PACKAGE__INTERFACE);

		componentPackageInterfaceEClass = createEClass(COMPONENT_PACKAGE_INTERFACE);
		createEReference(componentPackageInterfaceEClass, COMPONENT_PACKAGE_INTERFACE__IMPLEMENTS);

		componentPackageBindingEClass = createEClass(COMPONENT_PACKAGE_BINDING);
		createEReference(componentPackageBindingEClass, COMPONENT_PACKAGE_BINDING__PARTICIPANT_PACKAGE);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__IDENTITY);
		createEAttribute(componentEClass, COMPONENT__COMPONENT_NAME);
		createEAttribute(componentEClass, COMPONENT__REUSE);
		createEAttribute(componentEClass, COMPONENT__COTS);
		createEAttribute(componentEClass, COMPONENT__FIT);
		createEAttribute(componentEClass, COMPONENT__SAFETY_RELATED);
		createEAttribute(componentEClass, COMPONENT__SIL);
		createEReference(componentEClass, COMPONENT__FUNCTION);
		createEReference(componentEClass, COMPONENT__INPUTS);
		createEReference(componentEClass, COMPONENT__OUTPUTS);
		createEReference(componentEClass, COMPONENT__SUB_COMPONENTS);
		createEReference(componentEClass, COMPONENT__FAILURE_MODES);
		createEReference(componentEClass, COMPONENT__SAFETY_MECHANISMS);
		createEReference(componentEClass, COMPONENT__REQUIREMENTS);

		componentRelationshipEClass = createEClass(COMPONENT_RELATIONSHIP);
		createEAttribute(componentRelationshipEClass, COMPONENT_RELATIONSHIP__LABEL);
		createEReference(componentRelationshipEClass, COMPONENT_RELATIONSHIP__SOURCE);
		createEReference(componentRelationshipEClass, COMPONENT_RELATIONSHIP__TARGET);

		componentAssetEClass = createEClass(COMPONENT_ASSET);

		functionEClass = createEClass(FUNCTION);
		createEAttribute(functionEClass, FUNCTION__FUNC);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__INPUT);
		createEReference(inputEClass, INPUT__SOURCE);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__OUTPUT);
		createEReference(outputEClass, OUTPUT__TARGET);

		componentSafetyElementEClass = createEClass(COMPONENT_SAFETY_ELEMENT);
		createEAttribute(componentSafetyElementEClass, COMPONENT_SAFETY_ELEMENT__IDENTITY);

		failureModeEClass = createEClass(FAILURE_MODE);
		createEAttribute(failureModeEClass, FAILURE_MODE__MODE);
		createEAttribute(failureModeEClass, FAILURE_MODE__CAUSE);
		createEAttribute(failureModeEClass, FAILURE_MODE__PROBABILITY);
		createEReference(failureModeEClass, FAILURE_MODE__HAZARDS);
		createEReference(failureModeEClass, FAILURE_MODE__REGIONAL);
		createEReference(failureModeEClass, FAILURE_MODE__HIGHER_LEVEL);
		createEReference(failureModeEClass, FAILURE_MODE__FINAL);

		safetyMechanismEClass = createEClass(SAFETY_MECHANISM);
		createEReference(safetyMechanismEClass, SAFETY_MECHANISM__HANDLE);
		createEAttribute(safetyMechanismEClass, SAFETY_MECHANISM__MECHANISM);
		createEAttribute(safetyMechanismEClass, SAFETY_MECHANISM__COVERAGE);

		failureEffectEClass = createEClass(FAILURE_EFFECT);
		createEAttribute(failureEffectEClass, FAILURE_EFFECT__DESC);
		createEReference(failureEffectEClass, FAILURE_EFFECT__AFFECTED);

		regionalEffectEClass = createEClass(REGIONAL_EFFECT);

		higherLevelEffectEClass = createEClass(HIGHER_LEVEL_EFFECT);

		finalEffectEClass = createEClass(FINAL_EFFECT);

		// Create enums
		failureSeverityEEnum = createEEnum(FAILURE_SEVERITY);
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
		componentElementEClass.getESuperTypes().add(theBase_Package.getArtifactElement());
		componentPackageEClass.getESuperTypes().add(this.getComponentElement());
		componentPackageInterfaceEClass.getESuperTypes().add(this.getComponentElement());
		componentPackageBindingEClass.getESuperTypes().add(this.getComponentElement());
		componentEClass.getESuperTypes().add(this.getComponentElement());
		componentRelationshipEClass.getESuperTypes().add(this.getComponentElement());
		componentAssetEClass.getESuperTypes().add(this.getComponentElement());
		functionEClass.getESuperTypes().add(this.getComponentAsset());
		inputEClass.getESuperTypes().add(this.getComponentAsset());
		outputEClass.getESuperTypes().add(this.getComponentAsset());
		componentSafetyElementEClass.getESuperTypes().add(this.getComponentAsset());
		failureModeEClass.getESuperTypes().add(this.getComponentSafetyElement());
		safetyMechanismEClass.getESuperTypes().add(this.getComponentSafetyElement());
		failureEffectEClass.getESuperTypes().add(this.getComponentSafetyElement());
		regionalEffectEClass.getESuperTypes().add(this.getFailureEffect());
		higherLevelEffectEClass.getESuperTypes().add(this.getFailureEffect());
		finalEffectEClass.getESuperTypes().add(this.getFailureEffect());

		// Initialize classes and features; add operations and parameters
		initEClass(componentElementEClass, ComponentElement.class, "ComponentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentPackageEClass, ComponentPackage.class, "ComponentPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPackage_Components(), this.getComponentElement(), null, "components", null, 0, -1, ComponentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentPackage_Interface(), this.getComponentPackageInterface(), null, "interface", null, 0, -1, ComponentPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentPackageInterfaceEClass, ComponentPackageInterface.class, "ComponentPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPackageInterface_Implements(), this.getComponentPackage(), null, "implements", null, 1, 1, ComponentPackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentPackageBindingEClass, ComponentPackageBinding.class, "ComponentPackageBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentPackageBinding_ParticipantPackage(), this.getComponentPackage(), null, "participantPackage", null, 2, -1, ComponentPackageBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_Identity(), ecorePackage.getEInt(), "identity", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Component_name(), ecorePackage.getEString(), "component_name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Reuse(), ecorePackage.getEBooleanObject(), "reuse", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Cots(), ecorePackage.getEBooleanObject(), "cots", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Fit(), ecorePackage.getEFloat(), "fit", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Safety_related(), ecorePackage.getEBoolean(), "safety_related", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Sil(), ecorePackage.getEInt(), "sil", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Function(), this.getFunction(), null, "function", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Inputs(), this.getInput(), null, "inputs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Sub_components(), this.getComponentElement(), null, "sub_components", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Failure_modes(), this.getFailureMode(), null, "failure_modes", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Safety_mechanisms(), this.getSafetyMechanism(), null, "safety_mechanisms", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Requirements(), theBase_Package.getArtifactElement(), null, "requirements", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentRelationshipEClass, ComponentRelationship.class, "ComponentRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentRelationship_Label(), ecorePackage.getEString(), "label", null, 0, 1, ComponentRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentRelationship_Source(), this.getComponent(), null, "source", null, 0, 1, ComponentRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentRelationship_Target(), this.getComponent(), null, "target", null, 0, 1, ComponentRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentAssetEClass, ComponentAsset.class, "ComponentAsset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunction_Func(), ecorePackage.getEString(), "func", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Input(), ecorePackage.getEString(), "input", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInput_Source(), this.getComponent(), null, "source", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Output(), ecorePackage.getEString(), "output", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutput_Target(), this.getComponent(), null, "target", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSafetyElementEClass, ComponentSafetyElement.class, "ComponentSafetyElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentSafetyElement_Identity(), ecorePackage.getEInt(), "identity", null, 0, 1, ComponentSafetyElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureModeEClass, FailureMode.class, "FailureMode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailureMode_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, FailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureMode_Cause(), ecorePackage.getEString(), "cause", null, 0, 1, FailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFailureMode_Probability(), ecorePackage.getEFloat(), "probability", null, 0, 1, FailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureMode_Hazards(), theBase_Package.getArtifactElement(), null, "hazards", null, 0, -1, FailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureMode_Regional(), this.getRegionalEffect(), null, "regional", null, 0, 1, FailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureMode_Higher_level(), this.getHigherLevelEffect(), null, "higher_level", null, 0, 1, FailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureMode_Final(), this.getFinalEffect(), null, "final", null, 0, 1, FailureMode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyMechanismEClass, SafetyMechanism.class, "SafetyMechanism", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSafetyMechanism_Handle(), this.getFailureMode(), null, "handle", null, 0, 1, SafetyMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyMechanism_Mechanism(), ecorePackage.getEString(), "mechanism", null, 0, 1, SafetyMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSafetyMechanism_Coverage(), ecorePackage.getEFloat(), "coverage", null, 0, 1, SafetyMechanism.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failureEffectEClass, FailureEffect.class, "FailureEffect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFailureEffect_Desc(), ecorePackage.getEString(), "desc", null, 0, 1, FailureEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailureEffect_Affected(), this.getComponent(), null, "affected", null, 0, -1, FailureEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regionalEffectEClass, RegionalEffect.class, "RegionalEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(higherLevelEffectEClass, HigherLevelEffect.class, "HigherLevelEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalEffectEClass, FinalEffect.class, "FinalEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(failureSeverityEEnum, FailureSeverity.class, "FailureSeverity");
		addEEnumLiteral(failureSeverityEEnum, FailureSeverity.CATASTROPHIC);
		addEEnumLiteral(failureSeverityEEnum, FailureSeverity.FATAL);
		addEEnumLiteral(failureSeverityEEnum, FailureSeverity.MODERATE);
		addEEnumLiteral(failureSeverityEEnum, FailureSeverity.MINOR);

		// Create resource
		createResource(eNS_URI);
	}

} //Component_PackageImpl
