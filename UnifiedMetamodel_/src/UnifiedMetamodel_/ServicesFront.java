/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Services Front</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.ServicesFront#getUse <em>Use</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ServicesFront#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ServicesFront#getIsOrganizedIn <em>Is Organized In</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getServicesFront()
 * @model
 * @generated
 */
public interface ServicesFront extends EObject {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.ModuleFront}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getServicesFront_Use()
	 * @model required="true"
	 * @generated
	 */
	EList<ModuleFront> getUse();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getServicesFront_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.ServicesFront#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Is Organized In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Organized In</em>' reference.
	 * @see #setIsOrganizedIn(Directory)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getServicesFront_IsOrganizedIn()
	 * @model
	 * @generated
	 */
	Directory getIsOrganizedIn();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.ServicesFront#getIsOrganizedIn <em>Is Organized In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Organized In</em>' reference.
	 * @see #getIsOrganizedIn()
	 * @generated
	 */
	void setIsOrganizedIn(Directory value);

} // ServicesFront
