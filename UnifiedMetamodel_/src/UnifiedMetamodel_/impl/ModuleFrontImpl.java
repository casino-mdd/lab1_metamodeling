/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Directory;
import UnifiedMetamodel_.ModuleFront;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Front</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.ModuleFrontImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ModuleFrontImpl#getIsPresentIn <em>Is Present In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleFrontImpl extends MinimalEObjectImpl.Container implements ModuleFront {
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
	 * The cached value of the '{@link #getIsPresentIn() <em>Is Present In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsPresentIn()
	 * @generated
	 * @ordered
	 */
	protected Directory isPresentIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleFrontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.MODULE_FRONT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.MODULE_FRONT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directory getIsPresentIn() {
		if (isPresentIn != null && isPresentIn.eIsProxy()) {
			InternalEObject oldIsPresentIn = (InternalEObject)isPresentIn;
			isPresentIn = (Directory)eResolveProxy(oldIsPresentIn);
			if (isPresentIn != oldIsPresentIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.MODULE_FRONT__IS_PRESENT_IN, oldIsPresentIn, isPresentIn));
			}
		}
		return isPresentIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory basicGetIsPresentIn() {
		return isPresentIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPresentIn(Directory newIsPresentIn) {
		Directory oldIsPresentIn = isPresentIn;
		isPresentIn = newIsPresentIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.MODULE_FRONT__IS_PRESENT_IN, oldIsPresentIn, isPresentIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.MODULE_FRONT__NAME:
				return getName();
			case UnifiedMetamodel_Package.MODULE_FRONT__IS_PRESENT_IN:
				if (resolve) return getIsPresentIn();
				return basicGetIsPresentIn();
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
			case UnifiedMetamodel_Package.MODULE_FRONT__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.MODULE_FRONT__IS_PRESENT_IN:
				setIsPresentIn((Directory)newValue);
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
			case UnifiedMetamodel_Package.MODULE_FRONT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.MODULE_FRONT__IS_PRESENT_IN:
				setIsPresentIn((Directory)null);
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
			case UnifiedMetamodel_Package.MODULE_FRONT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.MODULE_FRONT__IS_PRESENT_IN:
				return isPresentIn != null;
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

} //ModuleFrontImpl
