/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.EClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link UnifiedMetamodel_.EClass#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.EClass#getMethod <em>Method</em>}</li>
 *   <li>{@link UnifiedMetamodel_.EClass#getAnotationi <em>Anotationi</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getEClass()
 * @model
 * @generated
 */
public interface EClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getEClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getEClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.EClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.MethodBack}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getEClass_Method()
	 * @model containment="true"
	 * @generated
	 */
	EList<MethodBack> getMethod();

	/**
	 * Returns the value of the '<em><b>Anotationi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anotationi</em>' reference.
	 * @see #setAnotationi(Anotationi)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getEClass_Anotationi()
	 * @model
	 * @generated
	 */
	Anotationi getAnotationi();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.EClass#getAnotationi <em>Anotationi</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anotationi</em>' reference.
	 * @see #getAnotationi()
	 * @generated
	 */
	void setAnotationi(Anotationi value);

} // EClass
