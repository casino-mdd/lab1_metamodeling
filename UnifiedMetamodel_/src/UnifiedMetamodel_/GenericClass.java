/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.GenericClass#getImplement <em>Implement</em>}</li>
 *   <li>{@link UnifiedMetamodel_.GenericClass#getExtends <em>Extends</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getGenericClass()
 * @model
 * @generated
 */
public interface GenericClass extends EClass {
	/**
	 * Returns the value of the '<em><b>Implement</b></em>' reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implement</em>' reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getGenericClass_Implement()
	 * @model
	 * @generated
	 */
	EList<InterfaceClass> getImplement();

	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(AbstractClass)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getGenericClass_Extends()
	 * @model required="true"
	 * @generated
	 */
	AbstractClass getExtends();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.GenericClass#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(AbstractClass value);

} // GenericClass
