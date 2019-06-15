/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Action#getActiondispatcher <em>Actiondispatcher</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Action#getActioncreator <em>Actioncreator</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Action#getActionDirectory <em>Action Directory</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Actiondispatcher</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.ActionDispatcher}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actiondispatcher</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAction_Actiondispatcher()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionDispatcher> getActiondispatcher();

	/**
	 * Returns the value of the '<em><b>Actioncreator</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.ActionCreator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actioncreator</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAction_Actioncreator()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActionCreator> getActioncreator();

	/**
	 * Returns the value of the '<em><b>Action Directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Directory</em>' reference.
	 * @see #setActionDirectory(Directory)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getAction_ActionDirectory()
	 * @model
	 * @generated
	 */
	Directory getActionDirectory();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Action#getActionDirectory <em>Action Directory</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Directory</em>' reference.
	 * @see #getActionDirectory()
	 * @generated
	 */
	void setActionDirectory(Directory value);

} // Action
