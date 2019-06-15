/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.State#getAction <em>Action</em>}</li>
 *   <li>{@link UnifiedMetamodel_.State#getReducer <em>Reducer</em>}</li>
 *   <li>{@link UnifiedMetamodel_.State#getUse <em>Use</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getState_Action()
	 * @model containment="true"
	 * @generated
	 */
	EList<Action> getAction();

	/**
	 * Returns the value of the '<em><b>Reducer</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Reducer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reducer</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getState_Reducer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reducer> getReducer();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.ModuleFront}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getState_Use()
	 * @model required="true"
	 * @generated
	 */
	EList<ModuleFront> getUse();

} // State
