/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reducer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Reducer#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Reducer#getCatches <em>Catches</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Reducer#getReducerDirectory <em>Reducer Directory</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReducer()
 * @model
 * @generated
 */
public interface Reducer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReducer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Reducer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Catches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catches</em>' reference.
	 * @see #setCatches(ActionCreator)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReducer_Catches()
	 * @model
	 * @generated
	 */
	ActionCreator getCatches();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Reducer#getCatches <em>Catches</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Catches</em>' reference.
	 * @see #getCatches()
	 * @generated
	 */
	void setCatches(ActionCreator value);

	/**
	 * Returns the value of the '<em><b>Reducer Directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reducer Directory</em>' reference.
	 * @see #setReducerDirectory(Directory)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReducer_ReducerDirectory()
	 * @model
	 * @generated
	 */
	Directory getReducerDirectory();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Reducer#getReducerDirectory <em>Reducer Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reducer Directory</em>' reference.
	 * @see #getReducerDirectory()
	 * @generated
	 */
	void setReducerDirectory(Directory value);

} // Reducer
