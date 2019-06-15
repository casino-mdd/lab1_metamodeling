/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Submodule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Submodule#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Submodule#getOperations <em>Operations</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Submodule#getEntity <em>Entity</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Submodule#getRelation <em>Relation</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSubmodule()
 * @model
 * @generated
 */
public interface Submodule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSubmodule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Submodule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operations</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Operations}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSubmodule_Operations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operations> getOperations();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSubmodule_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.RelationDom}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getSubmodule_Relation()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationDom> getRelation();

} // Submodule
