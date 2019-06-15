/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module Front</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.ModuleFront#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ModuleFront#getIsPresentIn <em>Is Present In</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getModuleFront()
 * @model
 * @generated
 */
public interface ModuleFront extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getModuleFront_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.ModuleFront#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Present In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Present In</em>' reference.
	 * @see #setIsPresentIn(Directory)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getModuleFront_IsPresentIn()
	 * @model required="true"
	 * @generated
	 */
	Directory getIsPresentIn();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.ModuleFront#getIsPresentIn <em>Is Present In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Present In</em>' reference.
	 * @see #getIsPresentIn()
	 * @generated
	 */
	void setIsPresentIn(Directory value);

} // ModuleFront
