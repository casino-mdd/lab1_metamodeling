/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Layer#getLayerSegments <em>Layer Segments</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Layer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLayer()
 * @model
 * @generated
 */
public interface Layer extends EObject {
	/**
	 * Returns the value of the '<em><b>Layer Segments</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.LayerSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer Segments</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLayer_LayerSegments()
	 * @model containment="true"
	 * @generated
	 */
	EList<LayerSegment> getLayerSegments();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Layer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Layer
