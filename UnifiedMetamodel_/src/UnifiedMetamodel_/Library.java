/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Library#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Library#isIsNative <em>Is Native</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Library#getNativeclass <em>Nativeclass</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Library#getAnotationi <em>Anotationi</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLibrary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Library#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Native</em>' attribute.
	 * @see #setIsNative(boolean)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLibrary_IsNative()
	 * @model
	 * @generated
	 */
	boolean isIsNative();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Library#isIsNative <em>Is Native</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Native</em>' attribute.
	 * @see #isIsNative()
	 * @generated
	 */
	void setIsNative(boolean value);

	/**
	 * Returns the value of the '<em><b>Nativeclass</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.NativeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nativeclass</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLibrary_Nativeclass()
	 * @model containment="true"
	 * @generated
	 */
	EList<NativeClass> getNativeclass();

	/**
	 * Returns the value of the '<em><b>Anotationi</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Anotationi}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anotationi</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLibrary_Anotationi()
	 * @model containment="true"
	 * @generated
	 */
	EList<Anotationi> getAnotationi();

} // Library
