/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Container#getDispatches <em>Dispatches</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Container#getMaps <em>Maps</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getContainer()
 * @model
 * @generated
 */
public interface Container extends ComponentFront {
	/**
	 * Returns the value of the '<em><b>Dispatches</b></em>' reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.ActionDispatcher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispatches</em>' reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getContainer_Dispatches()
	 * @model
	 * @generated
	 */
	EList<ActionDispatcher> getDispatches();

	/**
	 * Returns the value of the '<em><b>Maps</b></em>' reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Reducer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps</em>' reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getContainer_Maps()
	 * @model
	 * @generated
	 */
	EList<Reducer> getMaps();

} // Container
