/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Jee#getJee_project <em>Jee project</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getJee()
 * @model
 * @generated
 */
public interface Jee extends EObject {
	/**
	 * Returns the value of the '<em><b>Jee project</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.JEE_Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jee project</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getJee_Jee_project()
	 * @model containment="true"
	 * @generated
	 */
	EList<JEE_Project> getJee_project();

} // Jee
