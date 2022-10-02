/**
 */
package requirement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import requirement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Requirement_FactoryImpl extends EFactoryImpl implements Requirement_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Requirement_Factory init() {
		try {
			Requirement_Factory theRequirement_Factory = (Requirement_Factory)EPackage.Registry.INSTANCE.getEFactory(Requirement_Package.eNS_URI);
			if (theRequirement_Factory != null) {
				return theRequirement_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Requirement_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_FactoryImpl() {
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
			case Requirement_Package.REQUIREMENT_PACKAGE: return createRequirementPackage();
			case Requirement_Package.REQUIREMENT_PACKAGE_BINDING: return createRequirementPackageBinding();
			case Requirement_Package.REQUIREMENT_PACKAGE_INTERFACE: return createRequirementPackageInterface();
			case Requirement_Package.REQUIREMENT: return createRequirement();
			case Requirement_Package.REQUIREMENT_RELATIONSHIP: return createRequirementRelationship();
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
	public RequirementPackage createRequirementPackage() {
		RequirementPackageImpl requirementPackage = new RequirementPackageImpl();
		return requirementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementPackageBinding createRequirementPackageBinding() {
		RequirementPackageBindingImpl requirementPackageBinding = new RequirementPackageBindingImpl();
		return requirementPackageBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementPackageInterface createRequirementPackageInterface() {
		RequirementPackageInterfaceImpl requirementPackageInterface = new RequirementPackageInterfaceImpl();
		return requirementPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementRelationship createRequirementRelationship() {
		RequirementRelationshipImpl requirementRelationship = new RequirementRelationshipImpl();
		return requirementRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement_Package getRequirement_Package() {
		return (Requirement_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Requirement_Package getPackage() {
		return Requirement_Package.eINSTANCE;
	}

} //Requirement_FactoryImpl
