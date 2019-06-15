/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.JEE_Project;
import UnifiedMetamodel_.Jee;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.JeeImpl#getJee_project <em>Jee project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JeeImpl extends MinimalEObjectImpl.Container implements Jee {
	/**
	 * The cached value of the '{@link #getJee_project() <em>Jee project</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJee_project()
	 * @generated
	 * @ordered
	 */
	protected EList<JEE_Project> jee_project;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.JEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JEE_Project> getJee_project() {
		if (jee_project == null) {
			jee_project = new EObjectContainmentEList<JEE_Project>(JEE_Project.class, this, UnifiedMetamodel_Package.JEE__JEE_PROJECT);
		}
		return jee_project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.JEE__JEE_PROJECT:
				return ((InternalEList<?>)getJee_project()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.JEE__JEE_PROJECT:
				return getJee_project();
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
			case UnifiedMetamodel_Package.JEE__JEE_PROJECT:
				getJee_project().clear();
				getJee_project().addAll((Collection<? extends JEE_Project>)newValue);
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
			case UnifiedMetamodel_Package.JEE__JEE_PROJECT:
				getJee_project().clear();
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
			case UnifiedMetamodel_Package.JEE__JEE_PROJECT:
				return jee_project != null && !jee_project.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JeeImpl
