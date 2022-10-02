/**
 */
package component.impl;

import base.ArtifactElement;
import component.Component;
import component.ComponentElement;
import component.Component_Package;
import component.FailureMode;
import component.Function;
import component.Input;
import component.Output;

import component.SafetyMechanism;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link component.impl.ComponentImpl#getIdentity <em>Identity</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getComponent_name <em>Component name</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getReuse <em>Reuse</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getCots <em>Cots</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getFit <em>Fit</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#isSafety_related <em>Safety related</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getSil <em>Sil</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getSub_components <em>Sub components</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getFailure_modes <em>Failure modes</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getSafety_mechanisms <em>Safety mechanisms</em>}</li>
 *   <li>{@link component.impl.ComponentImpl#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ComponentElementImpl implements Component {
	/**
	 * The default value of the '{@link #getIdentity() <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected static final int IDENTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdentity() <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentity()
	 * @generated
	 * @ordered
	 */
	protected int identity = IDENTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getComponent_name() <em>Component name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent_name()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponent_name() <em>Component name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent_name()
	 * @generated
	 * @ordered
	 */
	protected String component_name = COMPONENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReuse() <em>Reuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuse()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REUSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReuse() <em>Reuse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReuse()
	 * @generated
	 * @ordered
	 */
	protected Boolean reuse = REUSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCots() <em>Cots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCots()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean COTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCots() <em>Cots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCots()
	 * @generated
	 * @ordered
	 */
	protected Boolean cots = COTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFit() <em>Fit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFit()
	 * @generated
	 * @ordered
	 */
	protected static final float FIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFit() <em>Fit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFit()
	 * @generated
	 * @ordered
	 */
	protected float fit = FIT_EDEFAULT;

	/**
	 * The default value of the '{@link #isSafety_related() <em>Safety related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafety_related()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFETY_RELATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafety_related() <em>Safety related</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafety_related()
	 * @generated
	 * @ordered
	 */
	protected boolean safety_related = SAFETY_RELATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSil() <em>Sil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSil()
	 * @generated
	 * @ordered
	 */
	protected static final int SIL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSil() <em>Sil</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSil()
	 * @generated
	 * @ordered
	 */
	protected int sil = SIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Function function;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Input> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Output> outputs;

	/**
	 * The cached value of the '{@link #getSub_components() <em>Sub components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub_components()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentElement> sub_components;

	/**
	 * The cached value of the '{@link #getFailure_modes() <em>Failure modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure_modes()
	 * @generated
	 * @ordered
	 */
	protected EList<FailureMode> failure_modes;

	/**
	 * The cached value of the '{@link #getSafety_mechanisms() <em>Safety mechanisms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafety_mechanisms()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyMechanism> safety_mechanisms;

	/**
	 * The cached value of the '{@link #getRequirements() <em>Requirements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<ArtifactElement> requirements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Component_Package.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getIdentity() {
		return identity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentity(int newIdentity) {
		int oldIdentity = identity;
		identity = newIdentity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.COMPONENT__IDENTITY, oldIdentity, identity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComponent_name() {
		return component_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComponent_name(String newComponent_name) {
		String oldComponent_name = component_name;
		component_name = newComponent_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.COMPONENT__COMPONENT_NAME, oldComponent_name, component_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getReuse() {
		return reuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReuse(Boolean newReuse) {
		Boolean oldReuse = reuse;
		reuse = newReuse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.COMPONENT__REUSE, oldReuse, reuse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getCots() {
		return cots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCots(Boolean newCots) {
		Boolean oldCots = cots;
		cots = newCots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.COMPONENT__COTS, oldCots, cots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getFit() {
		return fit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFit(float newFit) {
		float oldFit = fit;
		fit = newFit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.COMPONENT__FIT, oldFit, fit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSafety_related() {
		return safety_related;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSafety_related(boolean newSafety_related) {
		boolean oldSafety_related = safety_related;
		safety_related = newSafety_related;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.COMPONENT__SAFETY_RELATED, oldSafety_related, safety_related));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSil() {
		return sil;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSil(int newSil) {
		int oldSil = sil;
		sil = newSil;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.COMPONENT__SIL, oldSil, sil));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getFunction() {
		if (function != null && function.eIsProxy()) {
			InternalEObject oldFunction = (InternalEObject)function;
			function = (Function)eResolveProxy(oldFunction);
			if (function != oldFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Component_Package.COMPONENT__FUNCTION, oldFunction, function));
			}
		}
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunction(Function newFunction) {
		Function oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Component_Package.COMPONENT__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Input> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList<Input>(Input.class, this, Component_Package.COMPONENT__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Output> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList<Output>(Output.class, this, Component_Package.COMPONENT__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentElement> getSub_components() {
		if (sub_components == null) {
			sub_components = new EObjectContainmentEList<ComponentElement>(ComponentElement.class, this, Component_Package.COMPONENT__SUB_COMPONENTS);
		}
		return sub_components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FailureMode> getFailure_modes() {
		if (failure_modes == null) {
			failure_modes = new EObjectContainmentEList<FailureMode>(FailureMode.class, this, Component_Package.COMPONENT__FAILURE_MODES);
		}
		return failure_modes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SafetyMechanism> getSafety_mechanisms() {
		if (safety_mechanisms == null) {
			safety_mechanisms = new EObjectContainmentEList<SafetyMechanism>(SafetyMechanism.class, this, Component_Package.COMPONENT__SAFETY_MECHANISMS);
		}
		return safety_mechanisms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ArtifactElement> getRequirements() {
		if (requirements == null) {
			requirements = new EObjectResolvingEList<ArtifactElement>(ArtifactElement.class, this, Component_Package.COMPONENT__REQUIREMENTS);
		}
		return requirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Component_Package.COMPONENT__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case Component_Package.COMPONENT__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case Component_Package.COMPONENT__SUB_COMPONENTS:
				return ((InternalEList<?>)getSub_components()).basicRemove(otherEnd, msgs);
			case Component_Package.COMPONENT__FAILURE_MODES:
				return ((InternalEList<?>)getFailure_modes()).basicRemove(otherEnd, msgs);
			case Component_Package.COMPONENT__SAFETY_MECHANISMS:
				return ((InternalEList<?>)getSafety_mechanisms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Component_Package.COMPONENT__IDENTITY:
				return getIdentity();
			case Component_Package.COMPONENT__COMPONENT_NAME:
				return getComponent_name();
			case Component_Package.COMPONENT__REUSE:
				return getReuse();
			case Component_Package.COMPONENT__COTS:
				return getCots();
			case Component_Package.COMPONENT__FIT:
				return getFit();
			case Component_Package.COMPONENT__SAFETY_RELATED:
				return isSafety_related();
			case Component_Package.COMPONENT__SIL:
				return getSil();
			case Component_Package.COMPONENT__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case Component_Package.COMPONENT__INPUTS:
				return getInputs();
			case Component_Package.COMPONENT__OUTPUTS:
				return getOutputs();
			case Component_Package.COMPONENT__SUB_COMPONENTS:
				return getSub_components();
			case Component_Package.COMPONENT__FAILURE_MODES:
				return getFailure_modes();
			case Component_Package.COMPONENT__SAFETY_MECHANISMS:
				return getSafety_mechanisms();
			case Component_Package.COMPONENT__REQUIREMENTS:
				return getRequirements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Component_Package.COMPONENT__IDENTITY:
				setIdentity((Integer)newValue);
				return;
			case Component_Package.COMPONENT__COMPONENT_NAME:
				setComponent_name((String)newValue);
				return;
			case Component_Package.COMPONENT__REUSE:
				setReuse((Boolean)newValue);
				return;
			case Component_Package.COMPONENT__COTS:
				setCots((Boolean)newValue);
				return;
			case Component_Package.COMPONENT__FIT:
				setFit((Float)newValue);
				return;
			case Component_Package.COMPONENT__SAFETY_RELATED:
				setSafety_related((Boolean)newValue);
				return;
			case Component_Package.COMPONENT__SIL:
				setSil((Integer)newValue);
				return;
			case Component_Package.COMPONENT__FUNCTION:
				setFunction((Function)newValue);
				return;
			case Component_Package.COMPONENT__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Input>)newValue);
				return;
			case Component_Package.COMPONENT__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Output>)newValue);
				return;
			case Component_Package.COMPONENT__SUB_COMPONENTS:
				getSub_components().clear();
				getSub_components().addAll((Collection<? extends ComponentElement>)newValue);
				return;
			case Component_Package.COMPONENT__FAILURE_MODES:
				getFailure_modes().clear();
				getFailure_modes().addAll((Collection<? extends FailureMode>)newValue);
				return;
			case Component_Package.COMPONENT__SAFETY_MECHANISMS:
				getSafety_mechanisms().clear();
				getSafety_mechanisms().addAll((Collection<? extends SafetyMechanism>)newValue);
				return;
			case Component_Package.COMPONENT__REQUIREMENTS:
				getRequirements().clear();
				getRequirements().addAll((Collection<? extends ArtifactElement>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Component_Package.COMPONENT__IDENTITY:
				setIdentity(IDENTITY_EDEFAULT);
				return;
			case Component_Package.COMPONENT__COMPONENT_NAME:
				setComponent_name(COMPONENT_NAME_EDEFAULT);
				return;
			case Component_Package.COMPONENT__REUSE:
				setReuse(REUSE_EDEFAULT);
				return;
			case Component_Package.COMPONENT__COTS:
				setCots(COTS_EDEFAULT);
				return;
			case Component_Package.COMPONENT__FIT:
				setFit(FIT_EDEFAULT);
				return;
			case Component_Package.COMPONENT__SAFETY_RELATED:
				setSafety_related(SAFETY_RELATED_EDEFAULT);
				return;
			case Component_Package.COMPONENT__SIL:
				setSil(SIL_EDEFAULT);
				return;
			case Component_Package.COMPONENT__FUNCTION:
				setFunction((Function)null);
				return;
			case Component_Package.COMPONENT__INPUTS:
				getInputs().clear();
				return;
			case Component_Package.COMPONENT__OUTPUTS:
				getOutputs().clear();
				return;
			case Component_Package.COMPONENT__SUB_COMPONENTS:
				getSub_components().clear();
				return;
			case Component_Package.COMPONENT__FAILURE_MODES:
				getFailure_modes().clear();
				return;
			case Component_Package.COMPONENT__SAFETY_MECHANISMS:
				getSafety_mechanisms().clear();
				return;
			case Component_Package.COMPONENT__REQUIREMENTS:
				getRequirements().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Component_Package.COMPONENT__IDENTITY:
				return identity != IDENTITY_EDEFAULT;
			case Component_Package.COMPONENT__COMPONENT_NAME:
				return COMPONENT_NAME_EDEFAULT == null ? component_name != null : !COMPONENT_NAME_EDEFAULT.equals(component_name);
			case Component_Package.COMPONENT__REUSE:
				return REUSE_EDEFAULT == null ? reuse != null : !REUSE_EDEFAULT.equals(reuse);
			case Component_Package.COMPONENT__COTS:
				return COTS_EDEFAULT == null ? cots != null : !COTS_EDEFAULT.equals(cots);
			case Component_Package.COMPONENT__FIT:
				return fit != FIT_EDEFAULT;
			case Component_Package.COMPONENT__SAFETY_RELATED:
				return safety_related != SAFETY_RELATED_EDEFAULT;
			case Component_Package.COMPONENT__SIL:
				return sil != SIL_EDEFAULT;
			case Component_Package.COMPONENT__FUNCTION:
				return function != null;
			case Component_Package.COMPONENT__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case Component_Package.COMPONENT__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case Component_Package.COMPONENT__SUB_COMPONENTS:
				return sub_components != null && !sub_components.isEmpty();
			case Component_Package.COMPONENT__FAILURE_MODES:
				return failure_modes != null && !failure_modes.isEmpty();
			case Component_Package.COMPONENT__SAFETY_MECHANISMS:
				return safety_mechanisms != null && !safety_mechanisms.isEmpty();
			case Component_Package.COMPONENT__REQUIREMENTS:
				return requirements != null && !requirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (identity: ");
		result.append(identity);
		result.append(", component_name: ");
		result.append(component_name);
		result.append(", reuse: ");
		result.append(reuse);
		result.append(", cots: ");
		result.append(cots);
		result.append(", fit: ");
		result.append(fit);
		result.append(", safety_related: ");
		result.append(safety_related);
		result.append(", sil: ");
		result.append(sil);
		result.append(')');
		return result.toString();
	}

} //ComponentImpl
