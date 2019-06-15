/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.ArquitectureMetamodel;
import UnifiedMetamodel_.DomainMetamodel;
import UnifiedMetamodel_.Metamodel;
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
 * An implementation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.MetamodelImpl#getArquitecturemetamodel <em>Arquitecturemetamodel</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.MetamodelImpl#getDomainmetamodel <em>Domainmetamodel</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.MetamodelImpl#getTechnologymetamodel <em>Technologymetamodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetamodelImpl extends MinimalEObjectImpl.Container implements Metamodel {
	/**
	 * The cached value of the '{@link #getArquitecturemetamodel() <em>Arquitecturemetamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArquitecturemetamodel()
	 * @generated
	 * @ordered
	 */
	protected ArquitectureMetamodel arquitecturemetamodel;
	/**
	 * The cached value of the '{@link #getDomainmetamodel() <em>Domainmetamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainmetamodel()
	 * @generated
	 * @ordered
	 */
	protected DomainMetamodel domainmetamodel;

	/**
	 * The cached value of the '{@link #getTechnologymetamodel() <em>Technologymetamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTechnologymetamodel()
	 * @generated
	 * @ordered
	 */
	protected TechnologyMetamodel technologymetamodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.METAMODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArquitectureMetamodel getArquitecturemetamodel() {
		return arquitecturemetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArquitecturemetamodel(ArquitectureMetamodel newArquitecturemetamodel, NotificationChain msgs) {
		ArquitectureMetamodel oldArquitecturemetamodel = arquitecturemetamodel;
		arquitecturemetamodel = newArquitecturemetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METAMODEL__ARQUITECTUREMETAMODEL, oldArquitecturemetamodel, newArquitecturemetamodel);
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
	public void setArquitecturemetamodel(ArquitectureMetamodel newArquitecturemetamodel) {
		if (newArquitecturemetamodel != arquitecturemetamodel) {
			NotificationChain msgs = null;
			if (arquitecturemetamodel != null)
				msgs = ((InternalEObject)arquitecturemetamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnifiedMetamodel_Package.METAMODEL__ARQUITECTUREMETAMODEL, null, msgs);
			if (newArquitecturemetamodel != null)
				msgs = ((InternalEObject)newArquitecturemetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnifiedMetamodel_Package.METAMODEL__ARQUITECTUREMETAMODEL, null, msgs);
			msgs = basicSetArquitecturemetamodel(newArquitecturemetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METAMODEL__ARQUITECTUREMETAMODEL, newArquitecturemetamodel, newArquitecturemetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainMetamodel getDomainmetamodel() {
		return domainmetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainmetamodel(DomainMetamodel newDomainmetamodel, NotificationChain msgs) {
		DomainMetamodel oldDomainmetamodel = domainmetamodel;
		domainmetamodel = newDomainmetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METAMODEL__DOMAINMETAMODEL, oldDomainmetamodel, newDomainmetamodel);
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
	public void setDomainmetamodel(DomainMetamodel newDomainmetamodel) {
		if (newDomainmetamodel != domainmetamodel) {
			NotificationChain msgs = null;
			if (domainmetamodel != null)
				msgs = ((InternalEObject)domainmetamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnifiedMetamodel_Package.METAMODEL__DOMAINMETAMODEL, null, msgs);
			if (newDomainmetamodel != null)
				msgs = ((InternalEObject)newDomainmetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnifiedMetamodel_Package.METAMODEL__DOMAINMETAMODEL, null, msgs);
			msgs = basicSetDomainmetamodel(newDomainmetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METAMODEL__DOMAINMETAMODEL, newDomainmetamodel, newDomainmetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechnologyMetamodel getTechnologymetamodel() {
		return technologymetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTechnologymetamodel(TechnologyMetamodel newTechnologymetamodel, NotificationChain msgs) {
		TechnologyMetamodel oldTechnologymetamodel = technologymetamodel;
		technologymetamodel = newTechnologymetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METAMODEL__TECHNOLOGYMETAMODEL, oldTechnologymetamodel, newTechnologymetamodel);
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
	public void setTechnologymetamodel(TechnologyMetamodel newTechnologymetamodel) {
		if (newTechnologymetamodel != technologymetamodel) {
			NotificationChain msgs = null;
			if (technologymetamodel != null)
				msgs = ((InternalEObject)technologymetamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UnifiedMetamodel_Package.METAMODEL__TECHNOLOGYMETAMODEL, null, msgs);
			if (newTechnologymetamodel != null)
				msgs = ((InternalEObject)newTechnologymetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UnifiedMetamodel_Package.METAMODEL__TECHNOLOGYMETAMODEL, null, msgs);
			msgs = basicSetTechnologymetamodel(newTechnologymetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.METAMODEL__TECHNOLOGYMETAMODEL, newTechnologymetamodel, newTechnologymetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.METAMODEL__ARQUITECTUREMETAMODEL:
				return basicSetArquitecturemetamodel(null, msgs);
			case UnifiedMetamodel_Package.METAMODEL__DOMAINMETAMODEL:
				return basicSetDomainmetamodel(null, msgs);
			case UnifiedMetamodel_Package.METAMODEL__TECHNOLOGYMETAMODEL:
				return basicSetTechnologymetamodel(null, msgs);
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
			case UnifiedMetamodel_Package.METAMODEL__ARQUITECTUREMETAMODEL:
				return getArquitecturemetamodel();
			case UnifiedMetamodel_Package.METAMODEL__DOMAINMETAMODEL:
				return getDomainmetamodel();
			case UnifiedMetamodel_Package.METAMODEL__TECHNOLOGYMETAMODEL:
				return getTechnologymetamodel();
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
			case UnifiedMetamodel_Package.METAMODEL__ARQUITECTUREMETAMODEL:
				setArquitecturemetamodel((ArquitectureMetamodel)newValue);
				return;
			case UnifiedMetamodel_Package.METAMODEL__DOMAINMETAMODEL:
				setDomainmetamodel((DomainMetamodel)newValue);
				return;
			case UnifiedMetamodel_Package.METAMODEL__TECHNOLOGYMETAMODEL:
				setTechnologymetamodel((TechnologyMetamodel)newValue);
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
			case UnifiedMetamodel_Package.METAMODEL__ARQUITECTUREMETAMODEL:
				setArquitecturemetamodel((ArquitectureMetamodel)null);
				return;
			case UnifiedMetamodel_Package.METAMODEL__DOMAINMETAMODEL:
				setDomainmetamodel((DomainMetamodel)null);
				return;
			case UnifiedMetamodel_Package.METAMODEL__TECHNOLOGYMETAMODEL:
				setTechnologymetamodel((TechnologyMetamodel)null);
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
			case UnifiedMetamodel_Package.METAMODEL__ARQUITECTUREMETAMODEL:
				return arquitecturemetamodel != null;
			case UnifiedMetamodel_Package.METAMODEL__DOMAINMETAMODEL:
				return domainmetamodel != null;
			case UnifiedMetamodel_Package.METAMODEL__TECHNOLOGYMETAMODEL:
				return technologymetamodel != null;
		}
		return super.eIsSet(featureID);
	}

} //MetamodelImpl
