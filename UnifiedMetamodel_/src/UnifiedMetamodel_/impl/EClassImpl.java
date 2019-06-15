/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Anotationi;
import UnifiedMetamodel_.Attribute;
import UnifiedMetamodel_.EClass;
import UnifiedMetamodel_.MethodBack;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.EClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.EClassImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.EClassImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.EClassImpl#getAnotationi <em>Anotationi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EClassImpl extends MinimalEObjectImpl.Container implements EClass {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

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
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodBack> method;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected org.eclipse.emf.ecore.EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.ECLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, UnifiedMetamodel_Package.ECLASS__ATTRIBUTE);
		}
		return attribute;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.ECLASS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MethodBack> getMethod() {
		if (method == null) {
			method = new EObjectContainmentEList<MethodBack>(MethodBack.class, this, UnifiedMetamodel_Package.ECLASS__METHOD);
		}
		return method;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.ECLASS__ANOTATIONI, oldAnotationi, anotationi));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.ECLASS__ANOTATIONI, oldAnotationi, anotationi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.ECLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.ECLASS__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.ECLASS__ATTRIBUTE:
				return getAttribute();
			case UnifiedMetamodel_Package.ECLASS__NAME:
				return getName();
			case UnifiedMetamodel_Package.ECLASS__METHOD:
				return getMethod();
			case UnifiedMetamodel_Package.ECLASS__ANOTATIONI:
				if (resolve) return getAnotationi();
				return basicGetAnotationi();
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
			case UnifiedMetamodel_Package.ECLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case UnifiedMetamodel_Package.ECLASS__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.ECLASS__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends MethodBack>)newValue);
				return;
			case UnifiedMetamodel_Package.ECLASS__ANOTATIONI:
				setAnotationi((Anotationi)newValue);
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
			case UnifiedMetamodel_Package.ECLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case UnifiedMetamodel_Package.ECLASS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.ECLASS__METHOD:
				getMethod().clear();
				return;
			case UnifiedMetamodel_Package.ECLASS__ANOTATIONI:
				setAnotationi((Anotationi)null);
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
			case UnifiedMetamodel_Package.ECLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case UnifiedMetamodel_Package.ECLASS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.ECLASS__METHOD:
				return method != null && !method.isEmpty();
			case UnifiedMetamodel_Package.ECLASS__ANOTATIONI:
				return anotationi != null;
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

} //EClassImpl
