/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Directory;
import UnifiedMetamodel_.ModuleFront;
import UnifiedMetamodel_.ServicesFront;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Services Front</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.ServicesFrontImpl#getUse <em>Use</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ServicesFrontImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ServicesFrontImpl#getIsOrganizedIn <em>Is Organized In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServicesFrontImpl extends MinimalEObjectImpl.Container implements ServicesFront {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<ModuleFront> use;

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
	 * The cached value of the '{@link #getIsOrganizedIn() <em>Is Organized In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrganizedIn()
	 * @generated
	 * @ordered
	 */
	protected Directory isOrganizedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServicesFrontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.SERVICES_FRONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleFront> getUse() {
		if (use == null) {
			use = new EObjectResolvingEList<ModuleFront>(ModuleFront.class, this, UnifiedMetamodel_Package.SERVICES_FRONT__USE);
		}
		return use;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.SERVICES_FRONT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directory getIsOrganizedIn() {
		if (isOrganizedIn != null && isOrganizedIn.eIsProxy()) {
			InternalEObject oldIsOrganizedIn = (InternalEObject)isOrganizedIn;
			isOrganizedIn = (Directory)eResolveProxy(oldIsOrganizedIn);
			if (isOrganizedIn != oldIsOrganizedIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.SERVICES_FRONT__IS_ORGANIZED_IN, oldIsOrganizedIn, isOrganizedIn));
			}
		}
		return isOrganizedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory basicGetIsOrganizedIn() {
		return isOrganizedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOrganizedIn(Directory newIsOrganizedIn) {
		Directory oldIsOrganizedIn = isOrganizedIn;
		isOrganizedIn = newIsOrganizedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.SERVICES_FRONT__IS_ORGANIZED_IN, oldIsOrganizedIn, isOrganizedIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.SERVICES_FRONT__USE:
				return getUse();
			case UnifiedMetamodel_Package.SERVICES_FRONT__NAME:
				return getName();
			case UnifiedMetamodel_Package.SERVICES_FRONT__IS_ORGANIZED_IN:
				if (resolve) return getIsOrganizedIn();
				return basicGetIsOrganizedIn();
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
			case UnifiedMetamodel_Package.SERVICES_FRONT__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends ModuleFront>)newValue);
				return;
			case UnifiedMetamodel_Package.SERVICES_FRONT__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.SERVICES_FRONT__IS_ORGANIZED_IN:
				setIsOrganizedIn((Directory)newValue);
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
			case UnifiedMetamodel_Package.SERVICES_FRONT__USE:
				getUse().clear();
				return;
			case UnifiedMetamodel_Package.SERVICES_FRONT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.SERVICES_FRONT__IS_ORGANIZED_IN:
				setIsOrganizedIn((Directory)null);
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
			case UnifiedMetamodel_Package.SERVICES_FRONT__USE:
				return use != null && !use.isEmpty();
			case UnifiedMetamodel_Package.SERVICES_FRONT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.SERVICES_FRONT__IS_ORGANIZED_IN:
				return isOrganizedIn != null;
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

} //ServicesFrontImpl
