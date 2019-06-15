/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link UnifiedMetamodel_.Metamodel#getArquitecturemetamodel <em>Arquitecturemetamodel</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Metamodel#getDomainmetamodel <em>Domainmetamodel</em>}</li>
 *   <li>{@link UnifiedMetamodel_.Metamodel#getTechnologymetamodel <em>Technologymetamodel</em>}</li>
 * </ul>
 *
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject {

	/**
	 * Returns the value of the '<em><b>Arquitecturemetamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arquitecturemetamodel</em>' containment reference.
	 * @see #setArquitecturemetamodel(ArquitectureMetamodel)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMetamodel_Arquitecturemetamodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ArquitectureMetamodel getArquitecturemetamodel();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Metamodel#getArquitecturemetamodel <em>Arquitecturemetamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arquitecturemetamodel</em>' containment reference.
	 * @see #getArquitecturemetamodel()
	 * @generated
	 */
	void setArquitecturemetamodel(ArquitectureMetamodel value);

	/**
	 * Returns the value of the '<em><b>Domainmetamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainmetamodel</em>' containment reference.
	 * @see #setDomainmetamodel(DomainMetamodel)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMetamodel_Domainmetamodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DomainMetamodel getDomainmetamodel();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Metamodel#getDomainmetamodel <em>Domainmetamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domainmetamodel</em>' containment reference.
	 * @see #getDomainmetamodel()
	 * @generated
	 */
	void setDomainmetamodel(DomainMetamodel value);

	/**
	 * Returns the value of the '<em><b>Technologymetamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technologymetamodel</em>' containment reference.
	 * @see #setTechnologymetamodel(TechnologyMetamodel)
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#getMetamodel_Technologymetamodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TechnologyMetamodel getTechnologymetamodel();

	/**
	 * Sets the value of the '{@link UnifiedMetamodel_.Metamodel#getTechnologymetamodel <em>Technologymetamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technologymetamodel</em>' containment reference.
	 * @see #getTechnologymetamodel()
	 * @generated
	 */
	void setTechnologymetamodel(TechnologyMetamodel value);
} // Metamodel
