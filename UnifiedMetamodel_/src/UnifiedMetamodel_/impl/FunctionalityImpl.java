/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.ComponentFront;
import UnifiedMetamodel_.Directory;
import UnifiedMetamodel_.Functionality;
import UnifiedMetamodel_.ServicesFront;
import UnifiedMetamodel_.State;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.FunctionalityImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.FunctionalityImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.FunctionalityImpl#getState <em>State</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.FunctionalityImpl#getServices <em>Services</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.FunctionalityImpl#getIsOrganizedBy <em>Is Organized By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalityImpl extends MinimalEObjectImpl.Container implements Functionality {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentFront> components;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected EList<State> state;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServicesFront> services;

	/**
	 * The cached value of the '{@link #getIsOrganizedBy() <em>Is Organized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrganizedBy()
	 * @generated
	 * @ordered
	 */
	protected Directory isOrganizedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.FUNCTIONALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.FUNCTIONALITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComponentFront> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<ComponentFront>(ComponentFront.class, this, UnifiedMetamodel_Package.FUNCTIONALITY__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<State> getState() {
		if (state == null) {
			state = new EObjectContainmentEList<State>(State.class, this, UnifiedMetamodel_Package.FUNCTIONALITY__STATE);
		}
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ServicesFront> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<ServicesFront>(ServicesFront.class, this, UnifiedMetamodel_Package.FUNCTIONALITY__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directory getIsOrganizedBy() {
		if (isOrganizedBy != null && isOrganizedBy.eIsProxy()) {
			InternalEObject oldIsOrganizedBy = (InternalEObject)isOrganizedBy;
			isOrganizedBy = (Directory)eResolveProxy(oldIsOrganizedBy);
			if (isOrganizedBy != oldIsOrganizedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.FUNCTIONALITY__IS_ORGANIZED_BY, oldIsOrganizedBy, isOrganizedBy));
			}
		}
		return isOrganizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory basicGetIsOrganizedBy() {
		return isOrganizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOrganizedBy(Directory newIsOrganizedBy) {
		Directory oldIsOrganizedBy = isOrganizedBy;
		isOrganizedBy = newIsOrganizedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.FUNCTIONALITY__IS_ORGANIZED_BY, oldIsOrganizedBy, isOrganizedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.FUNCTIONALITY__COMPONENTS:
				return ((InternalEList<?>)getComponents()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.FUNCTIONALITY__STATE:
				return ((InternalEList<?>)getState()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.FUNCTIONALITY__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.FUNCTIONALITY__NAME:
				return getName();
			case UnifiedMetamodel_Package.FUNCTIONALITY__COMPONENTS:
				return getComponents();
			case UnifiedMetamodel_Package.FUNCTIONALITY__STATE:
				return getState();
			case UnifiedMetamodel_Package.FUNCTIONALITY__SERVICES:
				return getServices();
			case UnifiedMetamodel_Package.FUNCTIONALITY__IS_ORGANIZED_BY:
				if (resolve) return getIsOrganizedBy();
				return basicGetIsOrganizedBy();
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
			case UnifiedMetamodel_Package.FUNCTIONALITY__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.FUNCTIONALITY__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends ComponentFront>)newValue);
				return;
			case UnifiedMetamodel_Package.FUNCTIONALITY__STATE:
				getState().clear();
				getState().addAll((Collection<? extends State>)newValue);
				return;
			case UnifiedMetamodel_Package.FUNCTIONALITY__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends ServicesFront>)newValue);
				return;
			case UnifiedMetamodel_Package.FUNCTIONALITY__IS_ORGANIZED_BY:
				setIsOrganizedBy((Directory)newValue);
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
			case UnifiedMetamodel_Package.FUNCTIONALITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.FUNCTIONALITY__COMPONENTS:
				getComponents().clear();
				return;
			case UnifiedMetamodel_Package.FUNCTIONALITY__STATE:
				getState().clear();
				return;
			case UnifiedMetamodel_Package.FUNCTIONALITY__SERVICES:
				getServices().clear();
				return;
			case UnifiedMetamodel_Package.FUNCTIONALITY__IS_ORGANIZED_BY:
				setIsOrganizedBy((Directory)null);
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
			case UnifiedMetamodel_Package.FUNCTIONALITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.FUNCTIONALITY__COMPONENTS:
				return components != null && !components.isEmpty();
			case UnifiedMetamodel_Package.FUNCTIONALITY__STATE:
				return state != null && !state.isEmpty();
			case UnifiedMetamodel_Package.FUNCTIONALITY__SERVICES:
				return services != null && !services.isEmpty();
			case UnifiedMetamodel_Package.FUNCTIONALITY__IS_ORGANIZED_BY:
				return isOrganizedBy != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FunctionalityImpl
