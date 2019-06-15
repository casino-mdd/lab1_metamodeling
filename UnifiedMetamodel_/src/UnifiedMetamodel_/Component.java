/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Component#getLayers <em>Layers</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Component#getRelations <em>Relations</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Component#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getComponent_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.RelationArch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getComponent_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<RelationArch> getRelations();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getComponent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Component
