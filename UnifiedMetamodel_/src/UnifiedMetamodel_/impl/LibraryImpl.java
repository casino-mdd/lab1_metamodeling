/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Anotationi;
import UnifiedMetamodel_.Library;
import UnifiedMetamodel_.NativeClass;
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
 * An implementation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.LibraryImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.LibraryImpl#isIsNative <em>Is Native</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.LibraryImpl#getNativeclass <em>Nativeclass</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.LibraryImpl#getAnotationi <em>Anotationi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryImpl extends MinimalEObjectImpl.Container implements Library {
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
	 * The default value of the '{@link #isIsNative() <em>Is Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNative() <em>Is Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNative()
	 * @generated
	 * @ordered
	 */
	protected boolean isNative = IS_NATIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNativeclass() <em>Nativeclass</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNativeclass()
	 * @generated
	 * @ordered
	 */
	protected EList<NativeClass> nativeclass;

	/**
	 * The cached value of the '{@link #getAnotationi() <em>Anotationi</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnotationi()
	 * @generated
	 * @ordered
	 */
	protected EList<Anotationi> anotationi;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.LIBRARY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.LIBRARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsNative() {
		return isNative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNative(boolean newIsNative) {
		boolean oldIsNative = isNative;
		isNative = newIsNative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.LIBRARY__IS_NATIVE, oldIsNative, isNative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NativeClass> getNativeclass() {
		if (nativeclass == null) {
			nativeclass = new EObjectContainmentEList<NativeClass>(NativeClass.class, this, UnifiedMetamodel_Package.LIBRARY__NATIVECLASS);
		}
		return nativeclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Anotationi> getAnotationi() {
		if (anotationi == null) {
			anotationi = new EObjectContainmentEList<Anotationi>(Anotationi.class, this, UnifiedMetamodel_Package.LIBRARY__ANOTATIONI);
		}
		return anotationi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.LIBRARY__NATIVECLASS:
				return ((InternalEList<?>)getNativeclass()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.LIBRARY__ANOTATIONI:
				return ((InternalEList<?>)getAnotationi()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.LIBRARY__NAME:
				return getName();
			case UnifiedMetamodel_Package.LIBRARY__IS_NATIVE:
				return isIsNative();
			case UnifiedMetamodel_Package.LIBRARY__NATIVECLASS:
				return getNativeclass();
			case UnifiedMetamodel_Package.LIBRARY__ANOTATIONI:
				return getAnotationi();
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
			case UnifiedMetamodel_Package.LIBRARY__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.LIBRARY__IS_NATIVE:
				setIsNative((Boolean)newValue);
				return;
			case UnifiedMetamodel_Package.LIBRARY__NATIVECLASS:
				getNativeclass().clear();
				getNativeclass().addAll((Collection<? extends NativeClass>)newValue);
				return;
			case UnifiedMetamodel_Package.LIBRARY__ANOTATIONI:
				getAnotationi().clear();
				getAnotationi().addAll((Collection<? extends Anotationi>)newValue);
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
			case UnifiedMetamodel_Package.LIBRARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.LIBRARY__IS_NATIVE:
				setIsNative(IS_NATIVE_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.LIBRARY__NATIVECLASS:
				getNativeclass().clear();
				return;
			case UnifiedMetamodel_Package.LIBRARY__ANOTATIONI:
				getAnotationi().clear();
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
			case UnifiedMetamodel_Package.LIBRARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.LIBRARY__IS_NATIVE:
				return isNative != IS_NATIVE_EDEFAULT;
			case UnifiedMetamodel_Package.LIBRARY__NATIVECLASS:
				return nativeclass != null && !nativeclass.isEmpty();
			case UnifiedMetamodel_Package.LIBRARY__ANOTATIONI:
				return anotationi != null && !anotationi.isEmpty();
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
		result.append(", isNative: ");
		result.append(isNative);
		result.append(')');
		return result.toString();
	}

} //LibraryImpl
