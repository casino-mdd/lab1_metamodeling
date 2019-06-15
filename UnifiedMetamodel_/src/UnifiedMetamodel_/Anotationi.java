/**
 */
package UnifiedMetamodel_;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anotationi</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Anotationi#getProperties <em>Properties</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Anotationi#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAnotationi()
 * @model
 * @generated
 */
public interface Anotationi extends EClass {
	/**
	 * Returns the value of the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' attribute.
	 * @see #setProperties(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAnotationi_Properties()
	 * @model
	 * @generated
	 */
	String getProperties();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Anotationi#getProperties <em>Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' attribute.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(String value);

	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' reference.
	 * @see #setDescriptor(Descriptor)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAnotationi_Descriptor()
	 * @model
	 * @generated
	 */
	Descriptor getDescriptor();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Anotationi#getDescriptor <em>Descriptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' reference.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(Descriptor value);

} // Anotationi
