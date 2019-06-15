/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Front</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.ComponentFront#getUse <em>Use</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ComponentFront#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ComponentFront#getInWithin <em>In Within</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getComponentFront()
 * @model
 * @generated
 */
public interface ComponentFront extends EObject {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.ModuleFront}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getComponentFront_Use()
	 * @model
	 * @generated
	 */
	EList<ModuleFront> getUse();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getComponentFront_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.ComponentFront#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>In Within</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Within</em>' reference.
	 * @see #setInWithin(Directory)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getComponentFront_InWithin()
	 * @model required="true"
	 * @generated
	 */
	Directory getInWithin();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.ComponentFront#getInWithin <em>In Within</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Within</em>' reference.
	 * @see #getInWithin()
	 * @generated
	 */
	void setInWithin(Directory value);

} // ComponentFront
