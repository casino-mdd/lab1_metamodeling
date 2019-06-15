/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Back</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.MethodBack#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.MethodBack#getAnotationi <em>Anotationi</em>}</li>
 *   <li>{@link UnifiedMetamodel_.MethodBack#getReturn <em>Return</em>}</li>
 *   <li>{@link UnifiedMetamodel_.MethodBack#getArguments <em>Arguments</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMethodBack()
 * @model
 * @generated
 */
public interface MethodBack extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMethodBack_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.MethodBack#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Anotationi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anotationi</em>' reference.
	 * @see #setAnotationi(Anotationi)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMethodBack_Anotationi()
	 * @model
	 * @generated
	 */
	Anotationi getAnotationi();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.MethodBack#getAnotationi <em>Anotationi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anotationi</em>' reference.
	 * @see #getAnotationi()
	 * @generated
	 */
	void setAnotationi(Anotationi value);

	/**
	 * Returns the value of the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return</em>' reference.
	 * @see #setReturn(EClass)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMethodBack_Return()
	 * @model
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.MethodBack#getReturn <em>Return</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return</em>' reference.
	 * @see #getReturn()
	 * @generated
	 */
	void setReturn(EClass value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' reference.
	 * @see #setArguments(EClass)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMethodBack_Arguments()
	 * @model
	 * @generated
	 */
	EClass getArguments();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.MethodBack#getArguments <em>Arguments</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arguments</em>' reference.
	 * @see #getArguments()
	 * @generated
	 */
	void setArguments(EClass value);

} // MethodBack
