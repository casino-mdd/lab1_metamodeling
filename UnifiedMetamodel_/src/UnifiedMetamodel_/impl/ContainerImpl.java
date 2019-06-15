/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.ActionDispatcher;
import UnifiedMetamodel_.Reducer;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.ContainerImpl#getDispatches <em>Dispatches</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ContainerImpl#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends ComponentFrontImpl implements UnifiedMetamodel_.Container {
	/**
	 * The cached value of the '{@link #getDispatches() <em>Dispatches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispatches()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionDispatcher> dispatches;

	/**
	 * The cached value of the '{@link #getMaps() <em>Maps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<Reducer> maps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionDispatcher> getDispatches() {
		if (dispatches == null) {
			dispatches = new EObjectResolvingEList<ActionDispatcher>(ActionDispatcher.class, this, UnifiedMetamodel_Package.CONTAINER__DISPATCHES);
		}
		return dispatches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reducer> getMaps() {
		if (maps == null) {
			maps = new EObjectResolvingEList<Reducer>(Reducer.class, this, UnifiedMetamodel_Package.CONTAINER__MAPS);
		}
		return maps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedMetamodel_Package.CONTAINER__DISPATCHES:
				return getDispatches();
			case UnifiedMetamodel_Package.CONTAINER__MAPS:
				return getMaps();
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
			case UnifiedMetamodel_Package.CONTAINER__DISPATCHES:
				getDispatches().clear();
				getDispatches().addAll((Collection<? extends ActionDispatcher>)newValue);
				return;
			case UnifiedMetamodel_Package.CONTAINER__MAPS:
				getMaps().clear();
				getMaps().addAll((Collection<? extends Reducer>)newValue);
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
			case UnifiedMetamodel_Package.CONTAINER__DISPATCHES:
				getDispatches().clear();
				return;
			case UnifiedMetamodel_Package.CONTAINER__MAPS:
				getMaps().clear();
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
			case UnifiedMetamodel_Package.CONTAINER__DISPATCHES:
				return dispatches != null && !dispatches.isEmpty();
			case UnifiedMetamodel_Package.CONTAINER__MAPS:
				return maps != null && !maps.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContainerImpl
