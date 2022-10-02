/**
 */
package mbsa.provider;


import base.provider.ArtifactElementItemProvider;

import component.Component_Factory;

import hazard.Hazard_Factory;

import java.util.Collection;
import java.util.List;

import mbsa.MBSAPackage;
import mbsa.MBSA_Factory;
import mbsa.MBSA_Package;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import requirement.Requirement_Factory;

/**
 * This is the item provider adapter for a {@link mbsa.MBSAPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MBSAPackageItemProvider extends ArtifactElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MBSAPackageItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(MBSA_Package.Literals.MBSA_PACKAGE__MBSA_PACKAGES);
			childrenFeatures.add(MBSA_Package.Literals.MBSA_PACKAGE__COMPONENT_PACKAGE);
			childrenFeatures.add(MBSA_Package.Literals.MBSA_PACKAGE__REQUIREMENT_PACKAGE);
			childrenFeatures.add(MBSA_Package.Literals.MBSA_PACKAGE__HAZARD_PACKAGE);
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
	 * This returns MBSAPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MBSAPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MBSAPackage)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_MBSAPackage_type") :
			getString("_UI_MBSAPackage_type") + " " + label;
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

		switch (notification.getFeatureID(MBSAPackage.class)) {
			case MBSA_Package.MBSA_PACKAGE__MBSA_PACKAGES:
			case MBSA_Package.MBSA_PACKAGE__COMPONENT_PACKAGE:
			case MBSA_Package.MBSA_PACKAGE__REQUIREMENT_PACKAGE:
			case MBSA_Package.MBSA_PACKAGE__HAZARD_PACKAGE:
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
				(MBSA_Package.Literals.MBSA_PACKAGE__MBSA_PACKAGES,
				 MBSA_Factory.eINSTANCE.createMBSAPackage()));

		newChildDescriptors.add
			(createChildParameter
				(MBSA_Package.Literals.MBSA_PACKAGE__COMPONENT_PACKAGE,
				 Component_Factory.eINSTANCE.createComponentPackage()));

		newChildDescriptors.add
			(createChildParameter
				(MBSA_Package.Literals.MBSA_PACKAGE__REQUIREMENT_PACKAGE,
				 Requirement_Factory.eINSTANCE.createRequirementPackage()));

		newChildDescriptors.add
			(createChildParameter
				(MBSA_Package.Literals.MBSA_PACKAGE__REQUIREMENT_PACKAGE,
				 Requirement_Factory.eINSTANCE.createRequirementPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(MBSA_Package.Literals.MBSA_PACKAGE__REQUIREMENT_PACKAGE,
				 Requirement_Factory.eINSTANCE.createRequirementPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(MBSA_Package.Literals.MBSA_PACKAGE__HAZARD_PACKAGE,
				 Hazard_Factory.eINSTANCE.createHazardPackage()));

		newChildDescriptors.add
			(createChildParameter
				(MBSA_Package.Literals.MBSA_PACKAGE__HAZARD_PACKAGE,
				 Hazard_Factory.eINSTANCE.createHazardPackageBinding()));

		newChildDescriptors.add
			(createChildParameter
				(MBSA_Package.Literals.MBSA_PACKAGE__HAZARD_PACKAGE,
				 Hazard_Factory.eINSTANCE.createHazardPackageInterface()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MBSAEditPlugin.INSTANCE;
	}

}
