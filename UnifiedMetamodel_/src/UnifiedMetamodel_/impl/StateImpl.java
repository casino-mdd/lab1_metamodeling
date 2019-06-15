/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Action;
import UnifiedMetamodel_.ModuleFront;
import UnifiedMetamodel_.Reducer;
import UnifiedMetamodel_.State;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.StateImpl#getAction <em>Action</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.StateImpl#getReducer <em>Reducer</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.StateImpl#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

	/**
	 * The cached value of the '{@link #getReducer() <em>Reducer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReducer()
	 * @generated
	 * @ordered
	 */
	protected EList<Reducer> reducer;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, UnifiedMetamodel_Package.STATE__ACTION);
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reducer> getReducer() {
		if (reducer == null) {
			reducer = new EObjectContainmentEList<Reducer>(Reducer.class, this, UnifiedMetamodel_Package.STATE__REDUCER);
		}
		return reducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ModuleFront> getUse() {
		if (use == null) {
			use = new EObjectResolvingEList<ModuleFront>(ModuleFront.class, this, UnifiedMetamodel_Package.STATE__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.STATE__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.STATE__REDUCER:
				return ((InternalEList<?>)getReducer()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.STATE__ACTION:
				return getAction();
			case UnifiedMetamodel_Package.STATE__REDUCER:
				return getReducer();
			case UnifiedMetamodel_Package.STATE__USE:
				return getUse();
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
			case UnifiedMetamodel_Package.STATE__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case UnifiedMetamodel_Package.STATE__REDUCER:
				getReducer().clear();
				getReducer().addAll((Collection<? extends Reducer>)newValue);
				return;
			case UnifiedMetamodel_Package.STATE__USE:
				getUse().clear();
				getUse().addAll((Collection<? extends ModuleFront>)newValue);
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
			case UnifiedMetamodel_Package.STATE__ACTION:
				getAction().clear();
				return;
			case UnifiedMetamodel_Package.STATE__REDUCER:
				getReducer().clear();
				return;
			case UnifiedMetamodel_Package.STATE__USE:
				getUse().clear();
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
			case UnifiedMetamodel_Package.STATE__ACTION:
				return action != null && !action.isEmpty();
			case UnifiedMetamodel_Package.STATE__REDUCER:
				return reducer != null && !reducer.isEmpty();
			case UnifiedMetamodel_Package.STATE__USE:
				return use != null && !use.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
