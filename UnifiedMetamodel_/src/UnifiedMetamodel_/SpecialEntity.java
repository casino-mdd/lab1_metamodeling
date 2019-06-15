/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.SpecialEntity#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link UnifiedMetamodel_.SpecialEntity#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSpecialEntity()
 * @model
 * @generated
 */
public interface SpecialEntity extends Entity {
	/**
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Transaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSpecialEntity_Transaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transaction> getTransaction();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSpecialEntity_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.SpecialEntity#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // SpecialEntity
