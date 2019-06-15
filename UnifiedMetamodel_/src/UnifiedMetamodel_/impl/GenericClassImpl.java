/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.AbstractClass;
import UnifiedMetamodel_.GenericClass;
import UnifiedMetamodel_.InterfaceClass;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.GenericClassImpl#getImplement <em>Implement</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.GenericClassImpl#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericClassImpl extends EClassImpl implements GenericClass {
	/**
	 * The cached value of the '{@link #getImplement() <em>Implement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplement()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClass> implement;

	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected AbstractClass extends_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.GENERIC_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterfaceClass> getImplement() {
		if (implement == null) {
			implement = new EObjectResolvingEList<InterfaceClass>(InterfaceClass.class, this, UnifiedMetamodel_Package.GENERIC_CLASS__IMPLEMENT);
		}
		return implement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractClass getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (AbstractClass)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.GENERIC_CLASS__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractClass basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtends(AbstractClass newExtends) {
		AbstractClass oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.GENERIC_CLASS__EXTENDS, oldExtends, extends_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.GENERIC_CLASS__IMPLEMENT:
				return getImplement();
			case UnifiedMetamodel_Package.GENERIC_CLASS__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
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
			case UnifiedMetamodel_Package.GENERIC_CLASS__IMPLEMENT:
				getImplement().clear();
				getImplement().addAll((Collection<? extends InterfaceClass>)newValue);
				return;
			case UnifiedMetamodel_Package.GENERIC_CLASS__EXTENDS:
				setExtends((AbstractClass)newValue);
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
			case UnifiedMetamodel_Package.GENERIC_CLASS__IMPLEMENT:
				getImplement().clear();
				return;
			case UnifiedMetamodel_Package.GENERIC_CLASS__EXTENDS:
				setExtends((AbstractClass)null);
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
			case UnifiedMetamodel_Package.GENERIC_CLASS__IMPLEMENT:
				return implement != null && !implement.isEmpty();
			case UnifiedMetamodel_Package.GENERIC_CLASS__EXTENDS:
				return extends_ != null;
		}
		return super.eIsSet(featureID);
	}

} //GenericClassImpl
