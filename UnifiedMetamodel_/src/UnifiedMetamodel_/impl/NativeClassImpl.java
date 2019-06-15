/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.NativeClass;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Native Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.NativeClassImpl#getPrimitiveRef <em>Primitive Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NativeClassImpl extends EClassImpl implements NativeClass {
	/**
	 * The default value of the '{@link #getPrimitiveRef() <em>Primitive Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveRef()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIMITIVE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimitiveRef() <em>Primitive Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveRef()
	 * @generated
	 * @ordered
	 */
	protected String primitiveRef = PRIMITIVE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NativeClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.NATIVE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrimitiveRef() {
		return primitiveRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrimitiveRef(String newPrimitiveRef) {
		String oldPrimitiveRef = primitiveRef;
		primitiveRef = newPrimitiveRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.NATIVE_CLASS__PRIMITIVE_REF, oldPrimitiveRef, primitiveRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.NATIVE_CLASS__PRIMITIVE_REF:
				return getPrimitiveRef();
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
			case UnifiedMetamodel_Package.NATIVE_CLASS__PRIMITIVE_REF:
				setPrimitiveRef((String)newValue);
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
			case UnifiedMetamodel_Package.NATIVE_CLASS__PRIMITIVE_REF:
				setPrimitiveRef(PRIMITIVE_REF_EDEFAULT);
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
			case UnifiedMetamodel_Package.NATIVE_CLASS__PRIMITIVE_REF:
				return PRIMITIVE_REF_EDEFAULT == null ? primitiveRef != null : !PRIMITIVE_REF_EDEFAULT.equals(primitiveRef);
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
		result.append(" (primitiveRef: ");
		result.append(primitiveRef);
		result.append(')');
		return result.toString();
	}

} //NativeClassImpl
