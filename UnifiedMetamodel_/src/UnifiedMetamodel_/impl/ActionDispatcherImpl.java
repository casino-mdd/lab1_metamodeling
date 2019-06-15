/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.ActionCreator;
import UnifiedMetamodel_.ActionDispatcher;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Dispatcher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.ActionDispatcherImpl#getUse <em>Use</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ActionDispatcherImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionDispatcherImpl extends MinimalEObjectImpl.Container implements ActionDispatcher {
	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected ActionCreator use;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionDispatcherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.ACTION_DISPATCHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionCreator getUse() {
		if (use != null && use.eIsProxy()) {
			InternalEObject oldUse = (InternalEObject)use;
			use = (ActionCreator)eResolveProxy(oldUse);
			if (use != oldUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.ACTION_DISPATCHER__USE, oldUse, use));
			}
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCreator basicGetUse() {
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUse(ActionCreator newUse) {
		ActionCreator oldUse = use;
		use = newUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.ACTION_DISPATCHER__USE, oldUse, use));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.ACTION_DISPATCHER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.ACTION_DISPATCHER__USE:
				if (resolve) return getUse();
				return basicGetUse();
			case UnifiedMetamodel_Package.ACTION_DISPATCHER__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UnifiedMetamodel_Package.ACTION_DISPATCHER__USE:
				setUse((ActionCreator)newValue);
				return;
			case UnifiedMetamodel_Package.ACTION_DISPATCHER__NAME:
				setName((String)newValue);
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
			case UnifiedMetamodel_Package.ACTION_DISPATCHER__USE:
				setUse((ActionCreator)null);
				return;
			case UnifiedMetamodel_Package.ACTION_DISPATCHER__NAME:
				setName(NAME_EDEFAULT);
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
			case UnifiedMetamodel_Package.ACTION_DISPATCHER__USE:
				return use != null;
			case UnifiedMetamodel_Package.ACTION_DISPATCHER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //ActionDispatcherImpl
