/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>React Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.ReactApplication#getFunctionalities <em>Functionalities</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ReactApplication#getModules <em>Modules</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ReactApplication#getName <em>Name</em>}</li>
 *   <li>{@link UnifiedMetamodel_.ReactApplication#getDirectories <em>Directories</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReactApplication()
 * @model
 * @generated
 */
public interface ReactApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Functionalities</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Functionality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionalities</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReactApplication_Functionalities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Functionality> getFunctionalities();

	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.ModuleFront}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReactApplication_Modules()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ModuleFront> getModules();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReactApplication_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.ReactApplication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Directories</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Directory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directories</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getReactApplication_Directories()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Directory> getDirectories();

} // ReactApplication
