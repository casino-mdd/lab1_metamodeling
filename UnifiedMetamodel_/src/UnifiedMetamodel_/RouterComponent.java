/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Router Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.RouterComponent#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getRouterComponent()
 * @model
 * @generated
 */
public interface RouterComponent extends UIFront {
	/**
	 * Returns the value of the '<em><b>Routes</b></em>' reference list.
	 * The list contents are of type {@link UnifiedMetamodel_.UIFront}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' reference list.
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getRouterComponent_Routes()
	 * @model required="true"
	 * @generated
	 */
	EList<UIFront> getRoutes();

} // RouterComponent
