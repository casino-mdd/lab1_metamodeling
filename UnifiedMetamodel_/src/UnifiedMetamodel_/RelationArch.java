/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Arch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.RelationArch#getSource <em>Source</em>}</li>
 *   <li>{@link UnifiedMetamodel_.RelationArch#getTarget <em>Target</em>}</li>
 *   <li>{@link UnifiedMetamodel_.RelationArch#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getRelationArch()
 * @model
 * @generated
 */
public interface RelationArch extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Layer)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getRelationArch_Source()
	 * @model required="true"
	 * @generated
	 */
	Layer getSource();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.RelationArch#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Layer value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Layer)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getRelationArch_Target()
	 * @model required="true"
	 * @generated
	 */
	Layer getTarget();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.RelationArch#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Layer value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getRelationArch_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.RelationArch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // RelationArch
