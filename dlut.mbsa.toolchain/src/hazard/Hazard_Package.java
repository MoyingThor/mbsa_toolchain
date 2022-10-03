/**
 */
package hazard;

import base.Base_Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hazard.Hazard_Factory
 * @model kind="package"
 * @generated
 */
public interface Hazard_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hazard";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://dlut.mbsa/hazard";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hazard_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hazard_Package eINSTANCE = hazard.impl.Hazard_PackageImpl.init();

	/**
	 * The meta object id for the '{@link hazard.impl.HazardElementImpl <em>Hazard Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.impl.HazardElementImpl
	 * @see hazard.impl.Hazard_PackageImpl#getHazardElement()
	 * @generated
	 */
	int HAZARD_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__ABSTRACT_FORM = Base_Package.ARTIFACT_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__IMPLEMENTATION_CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT__IDENTITY = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hazard Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_ELEMENT_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hazard.impl.HazardPackageImpl <em>Hazard Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.impl.HazardPackageImpl
	 * @see hazard.impl.Hazard_PackageImpl#getHazardPackage()
	 * @generated
	 */
	int HAZARD_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__GID = HAZARD_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__IS_CITATION = HAZARD_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__IS_ABSTRACT = HAZARD_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__CITED_ELEMENT = HAZARD_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__ABSTRACT_FORM = HAZARD_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__NAME = HAZARD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__DESCRIPTION = HAZARD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__IMPLEMENTATION_CONSTRAINT = HAZARD_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__NOTE = HAZARD_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__TAGGED_VALUE = HAZARD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__IDENTITY = HAZARD_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Hazard Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__HAZARD_ELEMENT = HAZARD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE__INTERFACE = HAZARD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hazard Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_FEATURE_COUNT = HAZARD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link hazard.impl.HazardPackageBindingImpl <em>Hazard Package Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.impl.HazardPackageBindingImpl
	 * @see hazard.impl.Hazard_PackageImpl#getHazardPackageBinding()
	 * @generated
	 */
	int HAZARD_PACKAGE_BINDING = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__GID = HAZARD_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__IS_CITATION = HAZARD_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__IS_ABSTRACT = HAZARD_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__CITED_ELEMENT = HAZARD_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__ABSTRACT_FORM = HAZARD_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__NAME = HAZARD_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__DESCRIPTION = HAZARD_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__IMPLEMENTATION_CONSTRAINT = HAZARD_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__NOTE = HAZARD_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__TAGGED_VALUE = HAZARD_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__IDENTITY = HAZARD_PACKAGE__IDENTITY;

	/**
	 * The feature id for the '<em><b>Hazard Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__HAZARD_ELEMENT = HAZARD_PACKAGE__HAZARD_ELEMENT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__INTERFACE = HAZARD_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Participant Package</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING__PARTICIPANT_PACKAGE = HAZARD_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hazard Package Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_BINDING_FEATURE_COUNT = HAZARD_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hazard.impl.HazardPackageInterfaceImpl <em>Hazard Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.impl.HazardPackageInterfaceImpl
	 * @see hazard.impl.Hazard_PackageImpl#getHazardPackageInterface()
	 * @generated
	 */
	int HAZARD_PACKAGE_INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__GID = HAZARD_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__IS_CITATION = HAZARD_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__IS_ABSTRACT = HAZARD_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__CITED_ELEMENT = HAZARD_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__ABSTRACT_FORM = HAZARD_PACKAGE__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__NAME = HAZARD_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__DESCRIPTION = HAZARD_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__IMPLEMENTATION_CONSTRAINT = HAZARD_PACKAGE__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__NOTE = HAZARD_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__TAGGED_VALUE = HAZARD_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__IDENTITY = HAZARD_PACKAGE__IDENTITY;

	/**
	 * The feature id for the '<em><b>Hazard Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__HAZARD_ELEMENT = HAZARD_PACKAGE__HAZARD_ELEMENT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__INTERFACE = HAZARD_PACKAGE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE__IMPLEMENTS = HAZARD_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hazard Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARD_PACKAGE_INTERFACE_FEATURE_COUNT = HAZARD_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hazard.impl.HazardousSituationImpl <em>Hazardous Situation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.impl.HazardousSituationImpl
	 * @see hazard.impl.Hazard_PackageImpl#getHazardousSituation()
	 * @generated
	 */
	int HAZARDOUS_SITUATION = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__GID = HAZARD_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__IS_CITATION = HAZARD_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__IS_ABSTRACT = HAZARD_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__CITED_ELEMENT = HAZARD_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__ABSTRACT_FORM = HAZARD_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__NAME = HAZARD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__DESCRIPTION = HAZARD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__IMPLEMENTATION_CONSTRAINT = HAZARD_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__NOTE = HAZARD_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__TAGGED_VALUE = HAZARD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__IDENTITY = HAZARD_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__SEVERITY = HAZARD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__PROBABILITY = HAZARD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Causes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION__CAUSES = HAZARD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hazardous Situation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HAZARDOUS_SITUATION_FEATURE_COUNT = HAZARD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hazard.impl.CauseImpl <em>Cause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.impl.CauseImpl
	 * @see hazard.impl.Hazard_PackageImpl#getCause()
	 * @generated
	 */
	int CAUSE = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__GID = HAZARD_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__IS_CITATION = HAZARD_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__IS_ABSTRACT = HAZARD_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__CITED_ELEMENT = HAZARD_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__ABSTRACT_FORM = HAZARD_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__NAME = HAZARD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__DESCRIPTION = HAZARD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__IMPLEMENTATION_CONSTRAINT = HAZARD_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__NOTE = HAZARD_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__TAGGED_VALUE = HAZARD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__IDENTITY = HAZARD_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Control Measure</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE__CONTROL_MEASURE = HAZARD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAUSE_FEATURE_COUNT = HAZARD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hazard.impl.ControlMeasureImpl <em>Control Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.impl.ControlMeasureImpl
	 * @see hazard.impl.Hazard_PackageImpl#getControlMeasure()
	 * @generated
	 */
	int CONTROL_MEASURE = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__GID = HAZARD_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__IS_CITATION = HAZARD_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__IS_ABSTRACT = HAZARD_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__CITED_ELEMENT = HAZARD_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__ABSTRACT_FORM = HAZARD_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__NAME = HAZARD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__DESCRIPTION = HAZARD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__IMPLEMENTATION_CONSTRAINT = HAZARD_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__NOTE = HAZARD_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__TAGGED_VALUE = HAZARD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__IDENTITY = HAZARD_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Safety Decision Rationale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__SAFETY_DECISION_RATIONALE = HAZARD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Verificationof Effectiveness</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__VERIFICATIONOF_EFFECTIVENESS = HAZARD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Validation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE__VALIDATION = HAZARD_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Control Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_MEASURE_FEATURE_COUNT = HAZARD_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link hazard.impl.VerificationofEffectivenessImpl <em>Verificationof Effectiveness</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.impl.VerificationofEffectivenessImpl
	 * @see hazard.impl.Hazard_PackageImpl#getVerificationofEffectiveness()
	 * @generated
	 */
	int VERIFICATIONOF_EFFECTIVENESS = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__GID = HAZARD_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__IS_CITATION = HAZARD_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__IS_ABSTRACT = HAZARD_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__CITED_ELEMENT = HAZARD_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__ABSTRACT_FORM = HAZARD_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__NAME = HAZARD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__DESCRIPTION = HAZARD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__IMPLEMENTATION_CONSTRAINT = HAZARD_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__NOTE = HAZARD_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__TAGGED_VALUE = HAZARD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__IDENTITY = HAZARD_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS__TEXT = HAZARD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Verificationof Effectiveness</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERIFICATIONOF_EFFECTIVENESS_FEATURE_COUNT = HAZARD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hazard.impl.ValidationImpl <em>Validation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.impl.ValidationImpl
	 * @see hazard.impl.Hazard_PackageImpl#getValidation()
	 * @generated
	 */
	int VALIDATION = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__GID = HAZARD_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__IS_CITATION = HAZARD_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__IS_ABSTRACT = HAZARD_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__CITED_ELEMENT = HAZARD_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__ABSTRACT_FORM = HAZARD_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__NAME = HAZARD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__DESCRIPTION = HAZARD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__IMPLEMENTATION_CONSTRAINT = HAZARD_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__NOTE = HAZARD_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__TAGGED_VALUE = HAZARD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__IDENTITY = HAZARD_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION__TEXT = HAZARD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Validation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_FEATURE_COUNT = HAZARD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hazard.impl.SafetyDecisionRationaleImpl <em>Safety Decision Rationale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.impl.SafetyDecisionRationaleImpl
	 * @see hazard.impl.Hazard_PackageImpl#getSafetyDecisionRationale()
	 * @generated
	 */
	int SAFETY_DECISION_RATIONALE = 9;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__GID = HAZARD_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__IS_CITATION = HAZARD_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__IS_ABSTRACT = HAZARD_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__CITED_ELEMENT = HAZARD_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Abstract Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__ABSTRACT_FORM = HAZARD_ELEMENT__ABSTRACT_FORM;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__NAME = HAZARD_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__DESCRIPTION = HAZARD_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__IMPLEMENTATION_CONSTRAINT = HAZARD_ELEMENT__IMPLEMENTATION_CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__NOTE = HAZARD_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__TAGGED_VALUE = HAZARD_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>Identity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__IDENTITY = HAZARD_ELEMENT__IDENTITY;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE__TEXT = HAZARD_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Safety Decision Rationale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_DECISION_RATIONALE_FEATURE_COUNT = HAZARD_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link hazard.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.Severity
	 * @see hazard.impl.Hazard_PackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 10;

	/**
	 * The meta object id for the '{@link hazard.Probability <em>Probability</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hazard.Probability
	 * @see hazard.impl.Hazard_PackageImpl#getProbability()
	 * @generated
	 */
	int PROBABILITY = 11;


	/**
	 * Returns the meta object for class '{@link hazard.HazardElement <em>Hazard Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Element</em>'.
	 * @see hazard.HazardElement
	 * @generated
	 */
	EClass getHazardElement();

	/**
	 * Returns the meta object for the attribute '{@link hazard.HazardElement#getIdentity <em>Identity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identity</em>'.
	 * @see hazard.HazardElement#getIdentity()
	 * @see #getHazardElement()
	 * @generated
	 */
	EAttribute getHazardElement_Identity();

	/**
	 * Returns the meta object for class '{@link hazard.HazardPackage <em>Hazard Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Package</em>'.
	 * @see hazard.HazardPackage
	 * @generated
	 */
	EClass getHazardPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link hazard.HazardPackage#getHazardElement <em>Hazard Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard Element</em>'.
	 * @see hazard.HazardPackage#getHazardElement()
	 * @see #getHazardPackage()
	 * @generated
	 */
	EReference getHazardPackage_HazardElement();

	/**
	 * Returns the meta object for the reference list '{@link hazard.HazardPackage#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface</em>'.
	 * @see hazard.HazardPackage#getInterface()
	 * @see #getHazardPackage()
	 * @generated
	 */
	EReference getHazardPackage_Interface();

	/**
	 * Returns the meta object for class '{@link hazard.HazardPackageBinding <em>Hazard Package Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Package Binding</em>'.
	 * @see hazard.HazardPackageBinding
	 * @generated
	 */
	EClass getHazardPackageBinding();

	/**
	 * Returns the meta object for the reference list '{@link hazard.HazardPackageBinding#getParticipantPackage <em>Participant Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participant Package</em>'.
	 * @see hazard.HazardPackageBinding#getParticipantPackage()
	 * @see #getHazardPackageBinding()
	 * @generated
	 */
	EReference getHazardPackageBinding_ParticipantPackage();

	/**
	 * Returns the meta object for class '{@link hazard.HazardPackageInterface <em>Hazard Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazard Package Interface</em>'.
	 * @see hazard.HazardPackageInterface
	 * @generated
	 */
	EClass getHazardPackageInterface();

	/**
	 * Returns the meta object for the reference '{@link hazard.HazardPackageInterface#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see hazard.HazardPackageInterface#getImplements()
	 * @see #getHazardPackageInterface()
	 * @generated
	 */
	EReference getHazardPackageInterface_Implements();

	/**
	 * Returns the meta object for class '{@link hazard.HazardousSituation <em>Hazardous Situation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hazardous Situation</em>'.
	 * @see hazard.HazardousSituation
	 * @generated
	 */
	EClass getHazardousSituation();

	/**
	 * Returns the meta object for the attribute '{@link hazard.HazardousSituation#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see hazard.HazardousSituation#getSeverity()
	 * @see #getHazardousSituation()
	 * @generated
	 */
	EAttribute getHazardousSituation_Severity();

	/**
	 * Returns the meta object for the attribute '{@link hazard.HazardousSituation#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Probability</em>'.
	 * @see hazard.HazardousSituation#getProbability()
	 * @see #getHazardousSituation()
	 * @generated
	 */
	EAttribute getHazardousSituation_Probability();

	/**
	 * Returns the meta object for the reference list '{@link hazard.HazardousSituation#getCauses <em>Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Causes</em>'.
	 * @see hazard.HazardousSituation#getCauses()
	 * @see #getHazardousSituation()
	 * @generated
	 */
	EReference getHazardousSituation_Causes();

	/**
	 * Returns the meta object for class '{@link hazard.Cause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cause</em>'.
	 * @see hazard.Cause
	 * @generated
	 */
	EClass getCause();

	/**
	 * Returns the meta object for the reference list '{@link hazard.Cause#getControlMeasure <em>Control Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Control Measure</em>'.
	 * @see hazard.Cause#getControlMeasure()
	 * @see #getCause()
	 * @generated
	 */
	EReference getCause_ControlMeasure();

	/**
	 * Returns the meta object for class '{@link hazard.ControlMeasure <em>Control Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Measure</em>'.
	 * @see hazard.ControlMeasure
	 * @generated
	 */
	EClass getControlMeasure();

	/**
	 * Returns the meta object for the containment reference '{@link hazard.ControlMeasure#getSafetyDecisionRationale <em>Safety Decision Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Safety Decision Rationale</em>'.
	 * @see hazard.ControlMeasure#getSafetyDecisionRationale()
	 * @see #getControlMeasure()
	 * @generated
	 */
	EReference getControlMeasure_SafetyDecisionRationale();

	/**
	 * Returns the meta object for the containment reference list '{@link hazard.ControlMeasure#getVerificationofEffectiveness <em>Verificationof Effectiveness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Verificationof Effectiveness</em>'.
	 * @see hazard.ControlMeasure#getVerificationofEffectiveness()
	 * @see #getControlMeasure()
	 * @generated
	 */
	EReference getControlMeasure_VerificationofEffectiveness();

	/**
	 * Returns the meta object for the containment reference list '{@link hazard.ControlMeasure#getValidation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Validation</em>'.
	 * @see hazard.ControlMeasure#getValidation()
	 * @see #getControlMeasure()
	 * @generated
	 */
	EReference getControlMeasure_Validation();

	/**
	 * Returns the meta object for class '{@link hazard.VerificationofEffectiveness <em>Verificationof Effectiveness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Verificationof Effectiveness</em>'.
	 * @see hazard.VerificationofEffectiveness
	 * @generated
	 */
	EClass getVerificationofEffectiveness();

	/**
	 * Returns the meta object for the attribute '{@link hazard.VerificationofEffectiveness#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see hazard.VerificationofEffectiveness#getText()
	 * @see #getVerificationofEffectiveness()
	 * @generated
	 */
	EAttribute getVerificationofEffectiveness_Text();

	/**
	 * Returns the meta object for class '{@link hazard.Validation <em>Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation</em>'.
	 * @see hazard.Validation
	 * @generated
	 */
	EClass getValidation();

	/**
	 * Returns the meta object for the attribute '{@link hazard.Validation#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see hazard.Validation#getText()
	 * @see #getValidation()
	 * @generated
	 */
	EAttribute getValidation_Text();

	/**
	 * Returns the meta object for class '{@link hazard.SafetyDecisionRationale <em>Safety Decision Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Decision Rationale</em>'.
	 * @see hazard.SafetyDecisionRationale
	 * @generated
	 */
	EClass getSafetyDecisionRationale();

	/**
	 * Returns the meta object for the attribute '{@link hazard.SafetyDecisionRationale#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see hazard.SafetyDecisionRationale#getText()
	 * @see #getSafetyDecisionRationale()
	 * @generated
	 */
	EAttribute getSafetyDecisionRationale_Text();

	/**
	 * Returns the meta object for enum '{@link hazard.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see hazard.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the meta object for enum '{@link hazard.Probability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Probability</em>'.
	 * @see hazard.Probability
	 * @generated
	 */
	EEnum getProbability();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hazard_Factory getHazard_Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hazard.impl.HazardElementImpl <em>Hazard Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.impl.HazardElementImpl
		 * @see hazard.impl.Hazard_PackageImpl#getHazardElement()
		 * @generated
		 */
		EClass HAZARD_ELEMENT = eINSTANCE.getHazardElement();

		/**
		 * The meta object literal for the '<em><b>Identity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARD_ELEMENT__IDENTITY = eINSTANCE.getHazardElement_Identity();

		/**
		 * The meta object literal for the '{@link hazard.impl.HazardPackageImpl <em>Hazard Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.impl.HazardPackageImpl
		 * @see hazard.impl.Hazard_PackageImpl#getHazardPackage()
		 * @generated
		 */
		EClass HAZARD_PACKAGE = eINSTANCE.getHazardPackage();

		/**
		 * The meta object literal for the '<em><b>Hazard Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_PACKAGE__HAZARD_ELEMENT = eINSTANCE.getHazardPackage_HazardElement();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_PACKAGE__INTERFACE = eINSTANCE.getHazardPackage_Interface();

		/**
		 * The meta object literal for the '{@link hazard.impl.HazardPackageBindingImpl <em>Hazard Package Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.impl.HazardPackageBindingImpl
		 * @see hazard.impl.Hazard_PackageImpl#getHazardPackageBinding()
		 * @generated
		 */
		EClass HAZARD_PACKAGE_BINDING = eINSTANCE.getHazardPackageBinding();

		/**
		 * The meta object literal for the '<em><b>Participant Package</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_PACKAGE_BINDING__PARTICIPANT_PACKAGE = eINSTANCE.getHazardPackageBinding_ParticipantPackage();

		/**
		 * The meta object literal for the '{@link hazard.impl.HazardPackageInterfaceImpl <em>Hazard Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.impl.HazardPackageInterfaceImpl
		 * @see hazard.impl.Hazard_PackageImpl#getHazardPackageInterface()
		 * @generated
		 */
		EClass HAZARD_PACKAGE_INTERFACE = eINSTANCE.getHazardPackageInterface();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARD_PACKAGE_INTERFACE__IMPLEMENTS = eINSTANCE.getHazardPackageInterface_Implements();

		/**
		 * The meta object literal for the '{@link hazard.impl.HazardousSituationImpl <em>Hazardous Situation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.impl.HazardousSituationImpl
		 * @see hazard.impl.Hazard_PackageImpl#getHazardousSituation()
		 * @generated
		 */
		EClass HAZARDOUS_SITUATION = eINSTANCE.getHazardousSituation();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARDOUS_SITUATION__SEVERITY = eINSTANCE.getHazardousSituation_Severity();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HAZARDOUS_SITUATION__PROBABILITY = eINSTANCE.getHazardousSituation_Probability();

		/**
		 * The meta object literal for the '<em><b>Causes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HAZARDOUS_SITUATION__CAUSES = eINSTANCE.getHazardousSituation_Causes();

		/**
		 * The meta object literal for the '{@link hazard.impl.CauseImpl <em>Cause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.impl.CauseImpl
		 * @see hazard.impl.Hazard_PackageImpl#getCause()
		 * @generated
		 */
		EClass CAUSE = eINSTANCE.getCause();

		/**
		 * The meta object literal for the '<em><b>Control Measure</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAUSE__CONTROL_MEASURE = eINSTANCE.getCause_ControlMeasure();

		/**
		 * The meta object literal for the '{@link hazard.impl.ControlMeasureImpl <em>Control Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.impl.ControlMeasureImpl
		 * @see hazard.impl.Hazard_PackageImpl#getControlMeasure()
		 * @generated
		 */
		EClass CONTROL_MEASURE = eINSTANCE.getControlMeasure();

		/**
		 * The meta object literal for the '<em><b>Safety Decision Rationale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MEASURE__SAFETY_DECISION_RATIONALE = eINSTANCE.getControlMeasure_SafetyDecisionRationale();

		/**
		 * The meta object literal for the '<em><b>Verificationof Effectiveness</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MEASURE__VERIFICATIONOF_EFFECTIVENESS = eINSTANCE.getControlMeasure_VerificationofEffectiveness();

		/**
		 * The meta object literal for the '<em><b>Validation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_MEASURE__VALIDATION = eINSTANCE.getControlMeasure_Validation();

		/**
		 * The meta object literal for the '{@link hazard.impl.VerificationofEffectivenessImpl <em>Verificationof Effectiveness</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.impl.VerificationofEffectivenessImpl
		 * @see hazard.impl.Hazard_PackageImpl#getVerificationofEffectiveness()
		 * @generated
		 */
		EClass VERIFICATIONOF_EFFECTIVENESS = eINSTANCE.getVerificationofEffectiveness();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERIFICATIONOF_EFFECTIVENESS__TEXT = eINSTANCE.getVerificationofEffectiveness_Text();

		/**
		 * The meta object literal for the '{@link hazard.impl.ValidationImpl <em>Validation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.impl.ValidationImpl
		 * @see hazard.impl.Hazard_PackageImpl#getValidation()
		 * @generated
		 */
		EClass VALIDATION = eINSTANCE.getValidation();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION__TEXT = eINSTANCE.getValidation_Text();

		/**
		 * The meta object literal for the '{@link hazard.impl.SafetyDecisionRationaleImpl <em>Safety Decision Rationale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.impl.SafetyDecisionRationaleImpl
		 * @see hazard.impl.Hazard_PackageImpl#getSafetyDecisionRationale()
		 * @generated
		 */
		EClass SAFETY_DECISION_RATIONALE = eINSTANCE.getSafetyDecisionRationale();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_DECISION_RATIONALE__TEXT = eINSTANCE.getSafetyDecisionRationale_Text();

		/**
		 * The meta object literal for the '{@link hazard.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.Severity
		 * @see hazard.impl.Hazard_PackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '{@link hazard.Probability <em>Probability</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hazard.Probability
		 * @see hazard.impl.Hazard_PackageImpl#getProbability()
		 * @generated
		 */
		EEnum PROBABILITY = eINSTANCE.getProbability();

	}

} //Hazard_Package
