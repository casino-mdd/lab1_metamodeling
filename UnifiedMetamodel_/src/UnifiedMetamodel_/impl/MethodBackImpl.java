/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Anotationi;
import UnifiedMetamodel_.EClass;
import UnifiedMetamodel_.MethodBack;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Back</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.MethodBackImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.MethodBackImpl#getAnotationi <em>Anotationi</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.MethodBackImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.MethodBackImpl#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodBackImpl extends MinimalEObjectImpl.Container implements MethodBack {
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
	 * The cached value of the '{@link #getAnotationi() <em>Anotationi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotationi()
	 * @generated
	 * @ordered
	 */
	protected Anotationi anotationi;

	/**
	 * The cached value of the '{@link #getReturn() <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturn()
	 * @generated
	 * @ordered
	 */
	protected EClass return_;

	/**
	 * The cached value of the '{@link #getArguments() <em>Arguments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArguments()
	 * @generated
	 * @ordered
	 */
	protected EClass arguments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodBackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.METHOD_BACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METHOD_BACK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anotationi getAnotationi() {
		if (anotationi != null && anotationi.eIsProxy()) {
			InternalEObject oldAnotationi = (InternalEObject)anotationi;
			anotationi = (Anotationi)eResolveProxy(oldAnotationi);
			if (anotationi != oldAnotationi) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.METHOD_BACK__ANOTATIONI, oldAnotationi, anotationi));
			}
		}
		return anotationi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anotationi basicGetAnotationi() {
		return anotationi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnotationi(Anotationi newAnotationi) {
		Anotationi oldAnotationi = anotationi;
		anotationi = newAnotationi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METHOD_BACK__ANOTATIONI, oldAnotationi, anotationi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReturn() {
		if (return_ != null && return_.eIsProxy()) {
			InternalEObject oldReturn = (InternalEObject)return_;
			return_ = (EClass)eResolveProxy(oldReturn);
			if (return_ != oldReturn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.METHOD_BACK__RETURN, oldReturn, return_));
			}
		}
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetReturn() {
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturn(EClass newReturn) {
		EClass oldReturn = return_;
		return_ = newReturn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METHOD_BACK__RETURN, oldReturn, return_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArguments() {
		if (arguments != null && arguments.eIsProxy()) {
			InternalEObject oldArguments = (InternalEObject)arguments;
			arguments = (EClass)eResolveProxy(oldArguments);
			if (arguments != oldArguments) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS, oldArguments, arguments));
			}
		}
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetArguments() {
		return arguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setArguments(EClass newArguments) {
		EClass oldArguments = arguments;
		arguments = newArguments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS, oldArguments, arguments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.METHOD_BACK__NAME:
				return getName();
			case UnifiedMetamodel_Package.METHOD_BACK__ANOTATIONI:
				if (resolve) return getAnotationi();
				return basicGetAnotationi();
			case UnifiedMetamodel_Package.METHOD_BACK__RETURN:
				if (resolve) return getReturn();
				return basicGetReturn();
			case UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS:
				if (resolve) return getArguments();
				return basicGetArguments();
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
			case UnifiedMetamodel_Package.METHOD_BACK__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__ANOTATIONI:
				setAnotationi((Anotationi)newValue);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__RETURN:
				setReturn((EClass)newValue);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS:
				setArguments((EClass)newValue);
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
			case UnifiedMetamodel_Package.METHOD_BACK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__ANOTATIONI:
				setAnotationi((Anotationi)null);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__RETURN:
				setReturn((EClass)null);
				return;
			case UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS:
				setArguments((EClass)null);
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
			case UnifiedMetamodel_Package.METHOD_BACK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.METHOD_BACK__ANOTATIONI:
				return anotationi != null;
			case UnifiedMetamodel_Package.METHOD_BACK__RETURN:
				return return_ != null;
			case UnifiedMetamodel_Package.METHOD_BACK__ARGUMENTS:
				return arguments != null;
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

} //MethodBackImpl
