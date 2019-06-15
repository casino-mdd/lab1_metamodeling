/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Technology Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.TechnologyMetamodel#getTechback <em>Techback</em>}</li>
 *   <li>{@link UnifiedMetamodel_.TechnologyMetamodel#getTechfront <em>Techfront</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getTechnologyMetamodel()
 * @model
 * @generated
 */
public interface TechnologyMetamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Techfront</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Techfront</em>' containment reference.
	 * @see #setTechfront(TechFront)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getTechnologyMetamodel_Techfront()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TechFront getTechfront();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.TechnologyMetamodel#getTechfront <em>Techfront</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Techfront</em>' containment reference.
	 * @see #getTechfront()
	 * @generated
	 */
	void setTechfront(TechFront value);

	/**
	 * Returns the value of the '<em><b>Techback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Techback</em>' containment reference.
	 * @see #setTechback(TechBack)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getTechnologyMetamodel_Techback()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TechBack getTechback();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.TechnologyMetamodel#getTechback <em>Techback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Techback</em>' containment reference.
	 * @see #getTechback()
	 * @generated
	 */
	void setTechback(TechBack value);

} // TechnologyMetamodel
