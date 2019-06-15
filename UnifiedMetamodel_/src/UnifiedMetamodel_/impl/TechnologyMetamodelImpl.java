/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.TechBack;
import UnifiedMetamodel_.TechFront;
import UnifiedMetamodel_.TechnologyMetamodel;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technology Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.TechnologyMetamodelImpl#getTechback <em>Techback</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.TechnologyMetamodelImpl#getTechfront <em>Techfront</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnologyMetamodelImpl extends MinimalEObjectImpl.Container implements TechnologyMetamodel {
	/**
	 * The cached value of the '{@link #getTechback() <em>Techback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechback()
	 * @generated
	 * @ordered
	 */
	protected TechBack techback;

	/**
	 * The cached value of the '{@link #getTechfront() <em>Techfront</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechfront()
	 * @generated
	 * @ordered
	 */
	protected TechFront techfront;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyMetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.TECHNOLOGY_METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechFront getTechfront() {
		return techfront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechfront(TechFront newTechfront, NotificationChain msgs) {
		TechFront oldTechfront = techfront;
		techfront = newTechfront;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHFRONT, oldTechfront, newTechfront);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechfront(TechFront newTechfront) {
		if (newTechfront != techfront) {
			NotificationChain msgs = null;
			if (techfront != null)
				msgs = ((InternalEObject)techfront).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHFRONT, null, msgs);
			if (newTechfront != null)
				msgs = ((InternalEObject)newTechfront).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHFRONT, null, msgs);
			msgs = basicSetTechfront(newTechfront, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHFRONT, newTechfront, newTechfront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechBack getTechback() {
		return techback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechback(TechBack newTechback, NotificationChain msgs) {
		TechBack oldTechback = techback;
		techback = newTechback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHBACK, oldTechback, newTechback);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTechback(TechBack newTechback) {
		if (newTechback != techback) {
			NotificationChain msgs = null;
			if (techback != null)
				msgs = ((InternalEObject)techback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHBACK, null, msgs);
			if (newTechback != null)
				msgs = ((InternalEObject)newTechback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHBACK, null, msgs);
			msgs = basicSetTechback(newTechback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHBACK, newTechback, newTechback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHBACK:
				return basicSetTechback(null, msgs);
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHFRONT:
				return basicSetTechfront(null, msgs);
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
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHBACK:
				return getTechback();
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHFRONT:
				return getTechfront();
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
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHBACK:
				setTechback((TechBack)newValue);
				return;
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHFRONT:
				setTechfront((TechFront)newValue);
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
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHBACK:
				setTechback((TechBack)null);
				return;
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHFRONT:
				setTechfront((TechFront)null);
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
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHBACK:
				return techback != null;
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL__TECHFRONT:
				return techfront != null;
		}
		return super.eIsSet(featureID);
	}

} //TechnologyMetamodelImpl
