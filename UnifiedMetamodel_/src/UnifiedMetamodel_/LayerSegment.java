/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.LayerSegment#getAllowToUse <em>Allow To Use</em>}</li>
 *   <li>{@link UnifiedMetamodel_.LayerSegment#getLayersegment <em>Layersegment</em>}</li>
 *   <li>{@link UnifiedMetamodel_.LayerSegment#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLayerSegment()
 * @model
 * @generated
 */
public interface LayerSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Allow To Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow To Use</em>' reference.
	 * @see #setAllowToUse(LayerSegment)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLayerSegment_AllowToUse()
	 * @model
	 * @generated
	 */
	LayerSegment getAllowToUse();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.LayerSegment#getAllowToUse <em>Allow To Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow To Use</em>' reference.
	 * @see #getAllowToUse()
	 * @generated
	 */
	void setAllowToUse(LayerSegment value);

	/**
	 * Returns the value of the '<em><b>Layersegment</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.LayerSegment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layersegment</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLayerSegment_Layersegment()
	 * @model containment="true"
	 * @generated
	 */
	EList<LayerSegment> getLayersegment();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getLayerSegment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.LayerSegment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // LayerSegment
