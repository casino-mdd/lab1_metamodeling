/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tech Back</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.TechBack#getJee_project <em>Jee project</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getTechBack()
 * @model
 * @generated
 */
public interface TechBack extends EObject {
	/**
	 * Returns the value of the '<em><b>Jee project</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.JEE_Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jee project</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getTechBack_Jee_project()
	 * @model containment="true"
	 * @generated
	 */
	EList<JEE_Project> getJee_project();

} // TechBack
