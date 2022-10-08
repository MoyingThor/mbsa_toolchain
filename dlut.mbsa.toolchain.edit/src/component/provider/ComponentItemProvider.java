/**
 */
package component.provider;


import component.Component;
import component.Component_Factory;
import component.Component_Package;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link component.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends ComponentElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIdentityPropertyDescriptor(object);
			addComponent_namePropertyDescriptor(object);
			addReusePropertyDescriptor(object);
			addCotsPropertyDescriptor(object);
			addFitPropertyDescriptor(object);
			addSafety_relatedPropertyDescriptor(object);
			addSilPropertyDescriptor(object);
			addFunctionPropertyDescriptor(object);
			addComponentTypePropertyDescriptor(object);
			addRequirementsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Identity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdentityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_identity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_identity_feature", "_UI_Component_type"),
				 Component_Package.Literals.COMPONENT__IDENTITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponent_namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_component_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_component_name_feature", "_UI_Component_type"),
				 Component_Package.Literals.COMPONENT__COMPONENT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reuse feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReusePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_reuse_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_reuse_feature", "_UI_Component_type"),
				 Component_Package.Literals.COMPONENT__REUSE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cots feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCotsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_cots_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_cots_feature", "_UI_Component_type"),
				 Component_Package.Literals.COMPONENT__COTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_fit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_fit_feature", "_UI_Component_type"),
				 Component_Package.Literals.COMPONENT__FIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Safety related feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSafety_relatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_safety_related_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_safety_related_feature", "_UI_Component_type"),
				 Component_Package.Literals.COMPONENT__SAFETY_RELATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sil feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSilPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_sil_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_sil_feature", "_UI_Component_type"),
				 Component_Package.Literals.COMPONENT__SIL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_function_feature", "_UI_Component_type"),
				 Component_Package.Literals.COMPONENT__FUNCTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Component Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addComponentTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_componentType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_componentType_feature", "_UI_Component_type"),
				 Component_Package.Literals.COMPONENT__COMPONENT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requirements feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequirementsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Component_requirements_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Component_requirements_feature", "_UI_Component_type"),
				 Component_Package.Literals.COMPONENT__REQUIREMENTS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Component_Package.Literals.COMPONENT__INPUTS);
			childrenFeatures.add(Component_Package.Literals.COMPONENT__OUTPUTS);
			childrenFeatures.add(Component_Package.Literals.COMPONENT__SUB_COMPONENTS);
			childrenFeatures.add(Component_Package.Literals.COMPONENT__FAILURE_MODES);
			childrenFeatures.add(Component_Package.Literals.COMPONENT__SAFETY_MECHANISMS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component)object).getComponent_name();
		return label == null || label.length() == 0 ?
			getString("_UI_Component_type") :
			getString("_UI_Component_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Component.class)) {
			case Component_Package.COMPONENT__IDENTITY:
			case Component_Package.COMPONENT__COMPONENT_NAME:
			case Component_Package.COMPONENT__REUSE:
			case Component_Package.COMPONENT__COTS:
			case Component_Package.COMPONENT__FIT:
			case Component_Package.COMPONENT__SAFETY_RELATED:
			case Component_Package.COMPONENT__SIL:
			case Component_Package.COMPONENT__COMPONENT_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Component_Package.COMPONENT__INPUTS:
			case Component_Package.COMPONENT__OUTPUTS:
			case Component_Package.COMPONENT__SUB_COMPONENTS:
			case Component_Package.COMPONENT__FAILURE_MODES:
			case Component_Package.COMPONENT__SAFETY_MECHANISMS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__INPUTS,
				 Component_Factory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__OUTPUTS,
				 Component_Factory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createComponentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createComponentPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createComponentPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createComponent()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createComponentRelationship()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createOutput()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createFailureMode()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createSafetyMechanism()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createRegionalEffect()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createHigherLevelEffect()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SUB_COMPONENTS,
				 Component_Factory.eINSTANCE.createFinalEffect()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__FAILURE_MODES,
				 Component_Factory.eINSTANCE.createFailureMode()));

		newChildDescriptors.add
			(createChildParameter
				(Component_Package.Literals.COMPONENT__SAFETY_MECHANISMS,
				 Component_Factory.eINSTANCE.createSafetyMechanism()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == Component_Package.Literals.COMPONENT__INPUTS ||
			childFeature == Component_Package.Literals.COMPONENT__SUB_COMPONENTS ||
			childFeature == Component_Package.Literals.COMPONENT__OUTPUTS ||
			childFeature == Component_Package.Literals.COMPONENT__FAILURE_MODES ||
			childFeature == Component_Package.Literals.COMPONENT__SAFETY_MECHANISMS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
