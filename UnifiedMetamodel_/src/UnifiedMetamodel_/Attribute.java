/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Attribute#getAnotationi <em>Anotationi</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Attribute#getName <em>Name</em>}' attribute.
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
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAttribute_Anotationi()
	 * @model
	 * @generated
	 */
	Anotationi getAnotationi();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Attribute#getAnotationi <em>Anotationi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anotationi</em>' reference.
	 * @see #getAnotationi()
	 * @generated
	 */
	void setAnotationi(Anotationi value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAttribute_Type()
	 * @model
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Attribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

} // Attribute
