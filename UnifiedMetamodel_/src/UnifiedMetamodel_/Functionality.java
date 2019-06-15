/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Functionality#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Functionality#getComponents <em>Components</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Functionality#getState <em>State</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Functionality#getServices <em>Services</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Functionality#getIsOrganizedBy <em>Is Organized By</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getFunctionality()
 * @model
 * @generated
 */
public interface Functionality extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getFunctionality_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Functionality#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.ComponentFront}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getFunctionality_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentFront> getComponents();

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getFunctionality_State()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getState();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.ServicesFront}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getFunctionality_Services()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServicesFront> getServices();

	/**
	 * Returns the value of the '<em><b>Is Organized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Organized By</em>' reference.
	 * @see #setIsOrganizedBy(Directory)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getFunctionality_IsOrganizedBy()
	 * @model required="true"
	 * @generated
	 */
	Directory getIsOrganizedBy();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Functionality#getIsOrganizedBy <em>Is Organized By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Organized By</em>' reference.
	 * @see #getIsOrganizedBy()
	 * @generated
	 */
	void setIsOrganizedBy(Directory value);

} // Functionality
