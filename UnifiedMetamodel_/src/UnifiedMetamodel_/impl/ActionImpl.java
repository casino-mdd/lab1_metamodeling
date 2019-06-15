/**
 */
package UnifiedMetamodel_.impl;

import UnifiedMetamodel_.Action;
import UnifiedMetamodel_.ActionCreator;
import UnifiedMetamodel_.ActionDispatcher;
import UnifiedMetamodel_.Directory;
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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.impl.ActionImpl#getActiondispatcher <em>Actiondispatcher</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ActionImpl#getActioncreator <em>Actioncreator</em>}</li>
 *   <li>{@link UnifiedMetamodel_.impl.ActionImpl#getActionDirectory <em>Action Directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getActiondispatcher() <em>Actiondispatcher</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiondispatcher()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionDispatcher> actiondispatcher;

	/**
	 * The cached value of the '{@link #getActioncreator() <em>Actioncreator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActioncreator()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionCreator> actioncreator;

	/**
	 * The cached value of the '{@link #getActionDirectory() <em>Action Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionDirectory()
	 * @generated
	 * @ordered
	 */
	protected Directory actionDirectory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedMetamodel_Package.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionDispatcher> getActiondispatcher() {
		if (actiondispatcher == null) {
			actiondispatcher = new EObjectContainmentEList<ActionDispatcher>(ActionDispatcher.class, this, UnifiedMetamodel_Package.ACTION__ACTIONDISPATCHER);
		}
		return actiondispatcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ActionCreator> getActioncreator() {
		if (actioncreator == null) {
			actioncreator = new EObjectContainmentEList<ActionCreator>(ActionCreator.class, this, UnifiedMetamodel_Package.ACTION__ACTIONCREATOR);
		}
		return actioncreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directory getActionDirectory() {
		if (actionDirectory != null && actionDirectory.eIsProxy()) {
			InternalEObject oldActionDirectory = (InternalEObject)actionDirectory;
			actionDirectory = (Directory)eResolveProxy(oldActionDirectory);
			if (actionDirectory != oldActionDirectory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedMetamodel_Package.ACTION__ACTION_DIRECTORY, oldActionDirectory, actionDirectory));
			}
		}
		return actionDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Directory basicGetActionDirectory() {
		return actionDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionDirectory(Directory newActionDirectory) {
		Directory oldActionDirectory = actionDirectory;
		actionDirectory = newActionDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedMetamodel_Package.ACTION__ACTION_DIRECTORY, oldActionDirectory, actionDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UnifiedMetamodel_Package.ACTION__ACTIONDISPATCHER:
				return ((InternalEList<?>)getActiondispatcher()).basicRemove(otherEnd, msgs);
			case UnifiedMetamodel_Package.ACTION__ACTIONCREATOR:
				return ((InternalEList<?>)getActioncreator()).basicRemove(otherEnd, msgs);
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
			case UnifiedMetamodel_Package.ACTION__ACTIONDISPATCHER:
				return getActiondispatcher();
			case UnifiedMetamodel_Package.ACTION__ACTIONCREATOR:
				return getActioncreator();
			case UnifiedMetamodel_Package.ACTION__ACTION_DIRECTORY:
				if (resolve) return getActionDirectory();
				return basicGetActionDirectory();
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
			case UnifiedMetamodel_Package.ACTION__ACTIONDISPATCHER:
				getActiondispatcher().clear();
				getActiondispatcher().addAll((Collection<? extends ActionDispatcher>)newValue);
				return;
			case UnifiedMetamodel_Package.ACTION__ACTIONCREATOR:
				getActioncreator().clear();
				getActioncreator().addAll((Collection<? extends ActionCreator>)newValue);
				return;
			case UnifiedMetamodel_Package.ACTION__ACTION_DIRECTORY:
				setActionDirectory((Directory)newValue);
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
			case UnifiedMetamodel_Package.ACTION__ACTIONDISPATCHER:
				getActiondispatcher().clear();
				return;
			case UnifiedMetamodel_Package.ACTION__ACTIONCREATOR:
				getActioncreator().clear();
				return;
			case UnifiedMetamodel_Package.ACTION__ACTION_DIRECTORY:
				setActionDirectory((Directory)null);
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
			case UnifiedMetamodel_Package.ACTION__ACTIONDISPATCHER:
				return actiondispatcher != null && !actiondispatcher.isEmpty();
			case UnifiedMetamodel_Package.ACTION__ACTIONCREATOR:
				return actioncreator != null && !actioncreator.isEmpty();
			case UnifiedMetamodel_Package.ACTION__ACTION_DIRECTORY:
				return actionDirectory != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
