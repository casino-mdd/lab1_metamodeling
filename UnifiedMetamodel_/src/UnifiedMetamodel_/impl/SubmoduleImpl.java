/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Entity;
import UnifiedMetamodel_.Operations;
import UnifiedMetamodel_.RelationDom;
import UnifiedMetamodel_.Submodule;
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
 * An implementation of the model object '<em><b>Submodule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.SubmoduleImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.SubmoduleImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.SubmoduleImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.SubmoduleImpl#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubmoduleImpl extends MinimalEObjectImpl.Container implements Submodule {
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
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operations> operations;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getRelation() <em>Relation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationDom> relation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubmoduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.SUBMODULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.SUBMODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Operations> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<Operations>(Operations.class, this, UnifiedMetamodel_Package.SUBMODULE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, UnifiedMetamodel_Package.SUBMODULE__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelationDom> getRelation() {
		if (relation == null) {
			relation = new EObjectContainmentEList<RelationDom>(RelationDom.class, this, UnifiedMetamodel_Package.SUBMODULE__RELATION);
		}
		return relation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.SUBMODULE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.SUBMODULE__ENTITY:
				return ((InternalEList<?>)getEntity()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.SUBMODULE__RELATION:
				return ((InternalEList<?>)getRelation()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.SUBMODULE__NAME:
				return getName();
			case UnifiedMetamodel_Package.SUBMODULE__OPERATIONS:
				return getOperations();
			case UnifiedMetamodel_Package.SUBMODULE__ENTITY:
				return getEntity();
			case UnifiedMetamodel_Package.SUBMODULE__RELATION:
				return getRelation();
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
			case UnifiedMetamodel_Package.SUBMODULE__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.SUBMODULE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends Operations>)newValue);
				return;
			case UnifiedMetamodel_Package.SUBMODULE__ENTITY:
				getEntity().clear();
				getEntity().addAll((Collection<? extends Entity>)newValue);
				return;
			case UnifiedMetamodel_Package.SUBMODULE__RELATION:
				getRelation().clear();
				getRelation().addAll((Collection<? extends RelationDom>)newValue);
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
			case UnifiedMetamodel_Package.SUBMODULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.SUBMODULE__OPERATIONS:
				getOperations().clear();
				return;
			case UnifiedMetamodel_Package.SUBMODULE__ENTITY:
				getEntity().clear();
				return;
			case UnifiedMetamodel_Package.SUBMODULE__RELATION:
				getRelation().clear();
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
			case UnifiedMetamodel_Package.SUBMODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.SUBMODULE__OPERATIONS:
				return operations != null && !operations.isEmpty();
			case UnifiedMetamodel_Package.SUBMODULE__ENTITY:
				return entity != null && !entity.isEmpty();
			case UnifiedMetamodel_Package.SUBMODULE__RELATION:
				return relation != null && !relation.isEmpty();
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

} //SubmoduleImpl
