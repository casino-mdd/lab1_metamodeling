/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Descriptor;
import UnifiedMetamodel_.Epackage;
import UnifiedMetamodel_.Library;
import UnifiedMetamodel_.Subproject;
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
 * An implementation of the model object '<em><b>Subproject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.SubprojectImpl#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.SubprojectImpl#getDescriptor <em>Descriptor</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.SubprojectImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.SubprojectImpl#getLibrary <em>Library</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubprojectImpl extends MinimalEObjectImpl.Container implements Subproject {
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
	 * The cached value of the '{@link #getDescriptor() <em>Descriptor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptor()
	 * @generated
	 * @ordered
	 */
	protected EList<Descriptor> descriptor;

	/**
	 * The cached value of the '{@link #getPackage() <em>Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<Epackage> package_;

	/**
	 * The cached value of the '{@link #getLibrary() <em>Library</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibrary()
	 * @generated
	 * @ordered
	 */
	protected EList<Library> library;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubprojectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.SUBPROJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.SUBPROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Descriptor> getDescriptor() {
		if (descriptor == null) {
			descriptor = new EObjectContainmentEList<Descriptor>(Descriptor.class, this, UnifiedMetamodel_Package.SUBPROJECT__DESCRIPTOR);
		}
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Epackage> getPackage() {
		if (package_ == null) {
			package_ = new EObjectContainmentEList<Epackage>(Epackage.class, this, UnifiedMetamodel_Package.SUBPROJECT__PACKAGE);
		}
		return package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Library> getLibrary() {
		if (library == null) {
			library = new EObjectContainmentEList<Library>(Library.class, this, UnifiedMetamodel_Package.SUBPROJECT__LIBRARY);
		}
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.SUBPROJECT__DESCRIPTOR:
				return ((InternalEList<?>)getDescriptor()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.SUBPROJECT__PACKAGE:
				return ((InternalEList<?>)getPackage()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.SUBPROJECT__LIBRARY:
				return ((InternalEList<?>)getLibrary()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.SUBPROJECT__NAME:
				return getName();
			case UnifiedMetamodel_Package.SUBPROJECT__DESCRIPTOR:
				return getDescriptor();
			case UnifiedMetamodel_Package.SUBPROJECT__PACKAGE:
				return getPackage();
			case UnifiedMetamodel_Package.SUBPROJECT__LIBRARY:
				return getLibrary();
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
			case UnifiedMetamodel_Package.SUBPROJECT__NAME:
				setName((String)newValue);
				return;
			case UnifiedMetamodel_Package.SUBPROJECT__DESCRIPTOR:
				getDescriptor().clear();
				getDescriptor().addAll((Collection<? extends Descriptor>)newValue);
				return;
			case UnifiedMetamodel_Package.SUBPROJECT__PACKAGE:
				getPackage().clear();
				getPackage().addAll((Collection<? extends Epackage>)newValue);
				return;
			case UnifiedMetamodel_Package.SUBPROJECT__LIBRARY:
				getLibrary().clear();
				getLibrary().addAll((Collection<? extends Library>)newValue);
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
			case UnifiedMetamodel_Package.SUBPROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UnifiedMetamodel_Package.SUBPROJECT__DESCRIPTOR:
				getDescriptor().clear();
				return;
			case UnifiedMetamodel_Package.SUBPROJECT__PACKAGE:
				getPackage().clear();
				return;
			case UnifiedMetamodel_Package.SUBPROJECT__LIBRARY:
				getLibrary().clear();
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
			case UnifiedMetamodel_Package.SUBPROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UnifiedMetamodel_Package.SUBPROJECT__DESCRIPTOR:
				return descriptor != null && !descriptor.isEmpty();
			case UnifiedMetamodel_Package.SUBPROJECT__PACKAGE:
				return package_ != null && !package_.isEmpty();
			case UnifiedMetamodel_Package.SUBPROJECT__LIBRARY:
				return library != null && !library.isEmpty();
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

} //SubprojectImpl
