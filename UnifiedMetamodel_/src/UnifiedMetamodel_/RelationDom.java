/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Dom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.RelationDom#getSource <em>Source</em>}</li>
 *   <li>{@link UnifiedMetamodel_.RelationDom#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getRelationDom()
 * @model
 * @generated
 */
public interface RelationDom extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Entity)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getRelationDom_Source()
	 * @model
	 * @generated
	 */
	Entity getSource();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.RelationDom#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Entity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Entity)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getRelationDom_Target()
	 * @model
	 * @generated
	 */
	Entity getTarget();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.RelationDom#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Entity value);

} // RelationDom
