/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.ActionCreator;
import UnifiedMetamodel_.Directory;
import UnifiedMetamodel_.Reducer;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reducer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.ReducerImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ReducerImpl#getCatches <em>Catches</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ReducerImpl#getReducerDirectory <em>Reducer Directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReducerImpl extends MinimalEObjectImpl.Container implements Reducer {
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
	 * The cached value of the '{@link #getCatches() <em>Catches</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatches()
	 * @generated
	 * @ordered
	 */
	protected ActionCreator catches;

	/**
	 * The cached value of the '{@link #getReducerDirectory() <em>Reducer Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReducerDirectory()
	 * @generated
	 * @ordered
	 */
	protected Directory reducerDirectory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReducerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.REDUCER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.REDUCER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionCreator getCatches() {
		if (catches != null && catches.eIsProxy()) {
			InternalEObject oldCatches = (InternalEObject)catches;
			catches = (ActionCreator)eResolveProxy(oldCatches);
			if (catches != oldCatches) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.REDUCER__CATCHES, oldCatches, catches));
			}
		}
		return catches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCreator basicGetCatches() {
		return catches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCatches(ActionCreator newCatches) {
		ActionCreator oldCatches = catches;
		catches = newCatches;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.REDUCER__CATCHES, oldCatches, catches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directory getReducerDirectory() {
		if (reducerDirectory != null && reducerDirectory.eIsProxy()) {
			InternalEObject oldReducerDirectory = (InternalEObject)reducerDirectory;
			reducerDirectory = (Directory)eResolveProxy(oldReducerDirectory);
			if (reducerDirectory != oldReducerDirectory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.REDUCER__REDUCER_DIRECTORY, oldReducerDirectory, reducerDirectory));
			}
		}
		return reducerDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory basicGetReducerDirectory() {
		return reducerDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReducerDirectory(Directory newReducerDirectory) {
		Directory oldReducerDirectory = reducerDirectory;
		reducerDirectory = newReducerDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.REDUCER__REDUCER_DIRECTORY, oldReducerDirectory, reducerDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.REDUCER__NAME:
				return getName();
			case UnifiedMetamodel_Package.REDUCER__CATCHES:
				if (resolve) return getCatches();
				return basicGetCatches();
			case UnifiedMetamodel_Package.REDUCER__REDUCER_DIRECTORY:
				if (resolve) return getReducerDirectory();
				return basicGetReducerDirectory();
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
			case UnifiedMetamodel_Package.REDUCER__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.REDUCER__CATCHES:
				setCatches((ActionCreator)newValue);
				return;
			case UnifiedMetamodel_Package.REDUCER__REDUCER_DIRECTORY:
				setReducerDirectory((Directory)newValue);
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
			case UnifiedMetamodel_Package.REDUCER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.REDUCER__CATCHES:
				setCatches((ActionCreator)null);
				return;
			case UnifiedMetamodel_Package.REDUCER__REDUCER_DIRECTORY:
				setReducerDirectory((Directory)null);
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
			case UnifiedMetamodel_Package.REDUCER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.REDUCER__CATCHES:
				return catches != null;
			case UnifiedMetamodel_Package.REDUCER__REDUCER_DIRECTORY:
				return reducerDirectory != null;
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

} //ReducerImpl
