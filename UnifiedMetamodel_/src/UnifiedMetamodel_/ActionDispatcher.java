/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Dispatcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.ActionDispatcher#getUse <em>Use</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ActionDispatcher#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getActionDispatcher()
 * @model
 * @generated
 */
public interface ActionDispatcher extends EObject {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference.
	 * @see #setUse(ActionCreator)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getActionDispatcher_Use()
	 * @model
	 * @generated
	 */
	ActionCreator getUse();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.ActionDispatcher#getUse <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(ActionCreator value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getActionDispatcher_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.ActionDispatcher#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ActionDispatcher
