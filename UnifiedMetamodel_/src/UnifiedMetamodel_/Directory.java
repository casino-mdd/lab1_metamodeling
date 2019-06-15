/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Directory#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Directory#isIsRoot <em>Is Root</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Directory#getDirectories <em>Directories</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Directory#getFiles <em>Files</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Directory#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getDirectory()
 * @model
 * @generated
 */
public interface Directory extends EObject {
	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getDirectory_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Directory#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Root</em>' attribute.
	 * @see #setIsRoot(boolean)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getDirectory_IsRoot()
	 * @model
	 * @generated
	 */
	boolean isIsRoot();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Directory#isIsRoot <em>Is Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Root</em>' attribute.
	 * @see #isIsRoot()
	 * @generated
	 */
	void setIsRoot(boolean value);

	/**
	 * Returns the value of the '<em><b>Directories</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.Directory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directories</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getDirectory_Directories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Directory> getDirectories();

	/**
	 * Returns the value of the '<em><b>Files</b></em>' containment reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.File}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Files</em>' containment reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getDirectory_Files()
	 * @model containment="true"
	 * @generated
	 */
	EList<File> getFiles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getDirectory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Directory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Directory
