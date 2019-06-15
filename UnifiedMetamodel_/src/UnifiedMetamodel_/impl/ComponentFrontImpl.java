/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.ComponentFront;
import UnifiedMetamodel_.Directory;
import UnifiedMetamodel_.ModuleFront;
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
 * An implementation of the model object '<em><b>Component Front</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.ComponentFrontImpl#getUse <em>Use</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ComponentFrontImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ComponentFrontImpl#getInWithin <em>In Within</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentFrontImpl extends MinimalEObjectImpl.Container implements ComponentFront {
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
	 * The cached value of the '{@link #getInWithin() <em>In Within</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInWithin()
	 * @generated
	 * @ordered
	 */
	protected Directory inWithin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFrontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.COMPONENT_FRONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleFront> getUse() {
		if (use == null) {
			use = new EObjectResolvingEList<ModuleFront>(ModuleFront.class, this, UnifiedMetamodel_Package.COMPONENT_FRONT__USE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.COMPONENT_FRONT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directory getInWithin() {
		if (inWithin != null && inWithin.eIsProxy()) {
			InternalEObject oldInWithin = (InternalEObject)inWithin;
			inWithin = (Directory)eResolveProxy(oldInWithin);
			if (inWithin != oldInWithin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.COMPONENT_FRONT__IN_WITHIN, oldInWithin, inWithin));
			}
		}
		return inWithin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory basicGetInWithin() {
		return inWithin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInWithin(Directory newInWithin) {
		Directory oldInWithin = inWithin;
		inWithin = newInWithin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.COMPONENT_FRONT__IN_WITHIN, oldInWithin, inWithin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.COMPONENT_FRONT__USE:
				return getUse();
			case UnifiedMetamodel_Package.COMPONENT_FRONT__NAME:
				return getName();
			case UnifiedMetamodel_Package.COMPONENT_FRONT__IN_WITHIN:
				if (resolve) return getInWithin();
				return basicGetInWithin();
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
			case UnifiedMetamodel_Package.COMPONENT_FRONT__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends ModuleFront>)newValue);
				return;
			case UnifiedMetamodel_Package.COMPONENT_FRONT__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.COMPONENT_FRONT__IN_WITHIN:
				setInWithin((Directory)newValue);
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
			case UnifiedMetamodel_Package.COMPONENT_FRONT__USE:
				getUse().clear();
				return;
			case UnifiedMetamodel_Package.COMPONENT_FRONT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.COMPONENT_FRONT__IN_WITHIN:
				setInWithin((Directory)null);
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
			case UnifiedMetamodel_Package.COMPONENT_FRONT__USE:
				return use != null && !use.isEmpty();
			case UnifiedMetamodel_Package.COMPONENT_FRONT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.COMPONENT_FRONT__IN_WITHIN:
				return inWithin != null;
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

} //ComponentFrontImpl
