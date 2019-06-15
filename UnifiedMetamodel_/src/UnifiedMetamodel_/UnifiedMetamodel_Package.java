/**
 */
package UnifiedMetamodel_;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see UnifiedMetamodel_.UnifiedMetamodel_Factory
 * @model kind="package"
 * @generated
 */
public interface UnifiedMetamodel_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "UnifiedMetamodel_";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://UnifiedMetamodel_";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "UnifiedMetamodel_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnifiedMetamodel_Package eINSTANCE = UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl.init();

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.LayerSegmentImpl <em>Layer Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.LayerSegmentImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getLayerSegment()
	 * @generated
	 */
	int LAYER_SEGMENT = 1;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.LayerImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 5;

	/**
	 * The feature id for the '<em><b>Layer Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__LAYER_SEGMENTS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.EjbImpl <em>Ejb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.EjbImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getEjb()
	 * @generated
	 */
	int EJB = 0;

	/**
	 * The feature id for the '<em><b>Layer Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB__LAYER_SEGMENTS = LAYER__LAYER_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB__NAME = LAYER__NAME;

	/**
	 * The number of structural features of the '<em>Ejb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_FEATURE_COUNT = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ejb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EJB_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow To Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT__ALLOW_TO_USE = 0;

	/**
	 * The feature id for the '<em><b>Layersegment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT__LAYERSEGMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Layer Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Layer Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.DtoImpl <em>Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.DtoImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getDto()
	 * @generated
	 */
	int DTO = 2;

	/**
	 * The feature id for the '<em><b>Allow To Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__ALLOW_TO_USE = LAYER_SEGMENT__ALLOW_TO_USE;

	/**
	 * The feature id for the '<em><b>Layersegment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__LAYERSEGMENT = LAYER_SEGMENT__LAYERSEGMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO__NAME = LAYER_SEGMENT__NAME;

	/**
	 * The number of structural features of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_FEATURE_COUNT = LAYER_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTO_OPERATION_COUNT = LAYER_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.StoreImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getStore()
	 * @generated
	 */
	int STORE = 3;

	/**
	 * The feature id for the '<em><b>Allow To Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ALLOW_TO_USE = LAYER_SEGMENT__ALLOW_TO_USE;

	/**
	 * The feature id for the '<em><b>Layersegment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__LAYERSEGMENT = LAYER_SEGMENT__LAYERSEGMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NAME = LAYER_SEGMENT__NAME;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = LAYER_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = LAYER_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.UIImpl <em>UI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.UIImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getUI()
	 * @generated
	 */
	int UI = 4;

	/**
	 * The feature id for the '<em><b>Allow To Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__ALLOW_TO_USE = LAYER_SEGMENT__ALLOW_TO_USE;

	/**
	 * The feature id for the '<em><b>Layersegment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__LAYERSEGMENT = LAYER_SEGMENT__LAYERSEGMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI__NAME = LAYER_SEGMENT__NAME;

	/**
	 * The number of structural features of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FEATURE_COUNT = LAYER_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_OPERATION_COUNT = LAYER_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.RestEntityImpl <em>Rest Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.RestEntityImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRestEntity()
	 * @generated
	 */
	int REST_ENTITY = 6;

	/**
	 * The feature id for the '<em><b>Allow To Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENTITY__ALLOW_TO_USE = LAYER_SEGMENT__ALLOW_TO_USE;

	/**
	 * The feature id for the '<em><b>Layersegment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENTITY__LAYERSEGMENT = LAYER_SEGMENT__LAYERSEGMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENTITY__NAME = LAYER_SEGMENT__NAME;

	/**
	 * The number of structural features of the '<em>Rest Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENTITY_FEATURE_COUNT = LAYER_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Rest Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REST_ENTITY_OPERATION_COUNT = LAYER_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.FacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.FacadeImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getFacade()
	 * @generated
	 */
	int FACADE = 7;

	/**
	 * The feature id for the '<em><b>Allow To Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE__ALLOW_TO_USE = LAYER_SEGMENT__ALLOW_TO_USE;

	/**
	 * The feature id for the '<em><b>Layersegment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE__LAYERSEGMENT = LAYER_SEGMENT__LAYERSEGMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE__NAME = LAYER_SEGMENT__NAME;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_FEATURE_COUNT = LAYER_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACADE_OPERATION_COUNT = LAYER_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.WarImpl <em>War</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.WarImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getWar()
	 * @generated
	 */
	int WAR = 8;

	/**
	 * The feature id for the '<em><b>Layer Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAR__LAYER_SEGMENTS = LAYER__LAYER_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAR__NAME = LAYER__NAME;

	/**
	 * The number of structural features of the '<em>War</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAR_FEATURE_COUNT = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>War</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAR_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ComponentImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 9;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__LAYERS = 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__RELATIONS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.RelationArchImpl <em>Relation Arch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.RelationArchImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRelationArch()
	 * @generated
	 */
	int RELATION_ARCH = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ARCH__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ARCH__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ARCH__NAME = 2;

	/**
	 * The number of structural features of the '<em>Relation Arch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ARCH_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relation Arch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_ARCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ArquitectureMetamodelImpl <em>Arquitecture Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ArquitectureMetamodelImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getArquitectureMetamodel()
	 * @generated
	 */
	int ARQUITECTURE_METAMODEL = 11;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURE_METAMODEL__COMPONENTS = 0;

	/**
	 * The number of structural features of the '<em>Arquitecture Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURE_METAMODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Arquitecture Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARQUITECTURE_METAMODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ContainersImpl <em>Containers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ContainersImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getContainers()
	 * @generated
	 */
	int CONTAINERS = 12;

	/**
	 * The feature id for the '<em><b>Allow To Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__ALLOW_TO_USE = LAYER_SEGMENT__ALLOW_TO_USE;

	/**
	 * The feature id for the '<em><b>Layersegment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__LAYERSEGMENT = LAYER_SEGMENT__LAYERSEGMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS__NAME = LAYER_SEGMENT__NAME;

	/**
	 * The number of structural features of the '<em>Containers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS_FEATURE_COUNT = LAYER_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Containers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINERS_OPERATION_COUNT = LAYER_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.PojoImpl <em>Pojo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.PojoImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getPojo()
	 * @generated
	 */
	int POJO = 13;

	/**
	 * The feature id for the '<em><b>Allow To Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO__ALLOW_TO_USE = LAYER_SEGMENT__ALLOW_TO_USE;

	/**
	 * The feature id for the '<em><b>Layersegment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO__LAYERSEGMENT = LAYER_SEGMENT__LAYERSEGMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO__NAME = LAYER_SEGMENT__NAME;

	/**
	 * The number of structural features of the '<em>Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_FEATURE_COUNT = LAYER_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pojo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POJO_OPERATION_COUNT = LAYER_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ServicesImpl <em>Services</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ServicesImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getServices()
	 * @generated
	 */
	int SERVICES = 14;

	/**
	 * The feature id for the '<em><b>Allow To Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__ALLOW_TO_USE = LAYER_SEGMENT__ALLOW_TO_USE;

	/**
	 * The feature id for the '<em><b>Layersegment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__LAYERSEGMENT = LAYER_SEGMENT__LAYERSEGMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES__NAME = LAYER_SEGMENT__NAME;

	/**
	 * The number of structural features of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FEATURE_COUNT = LAYER_SEGMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Services</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_OPERATION_COUNT = LAYER_SEGMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.MetamodelImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 15;

	/**
	 * The feature id for the '<em><b>Arquitecturemetamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__ARQUITECTUREMETAMODEL = 0;

	/**
	 * The feature id for the '<em><b>Domainmetamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__DOMAINMETAMODEL = 1;

	/**
	 * The feature id for the '<em><b>Technologymetamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__TECHNOLOGYMETAMODEL = 2;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.OperationsImpl <em>Operations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.OperationsImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getOperations()
	 * @generated
	 */
	int OPERATIONS = 21;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS__ENTITY = 0;

	/**
	 * The number of structural features of the '<em>Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ReadImpl <em>Read</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ReadImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRead()
	 * @generated
	 */
	int READ = 16;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ__ENTITY = OPERATIONS__ENTITY;

	/**
	 * The number of structural features of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_FEATURE_COUNT = OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_OPERATION_COUNT = OPERATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.CreateImpl <em>Create</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.CreateImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getCreate()
	 * @generated
	 */
	int CREATE = 17;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE__ENTITY = OPERATIONS__ENTITY;

	/**
	 * The number of structural features of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_FEATURE_COUNT = OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Create</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_OPERATION_COUNT = OPERATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.TransactionImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 28;

	/**
	 * The feature id for the '<em><b>Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__UPDATE = 0;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.SaleImpl <em>Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.SaleImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getSale()
	 * @generated
	 */
	int SALE = 18;

	/**
	 * The feature id for the '<em><b>Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE__UPDATE = TRANSACTION__UPDATE;

	/**
	 * The number of structural features of the '<em>Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALE_OPERATION_COUNT = TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ExchangeImpl <em>Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ExchangeImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getExchange()
	 * @generated
	 */
	int EXCHANGE = 19;

	/**
	 * The feature id for the '<em><b>Update</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__UPDATE = TRANSACTION__UPDATE;

	/**
	 * The number of structural features of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_OPERATION_COUNT = TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.RelationDomImpl <em>Relation Dom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.RelationDomImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRelationDom()
	 * @generated
	 */
	int RELATION_DOM = 27;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOM__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOM__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Relation Dom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Relation Dom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DOM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.CompositionImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 20;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOURCE = RELATION_DOM__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET = RELATION_DOM__TARGET;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = RELATION_DOM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = RELATION_DOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.LoginImpl <em>Login</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.LoginImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getLogin()
	 * @generated
	 */
	int LOGIN = 22;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN__ENTITY = OPERATIONS__ENTITY;

	/**
	 * The number of structural features of the '<em>Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_FEATURE_COUNT = OPERATIONS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_OPERATION_COUNT = OPERATIONS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ModuleImpl <em>Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ModuleImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getModule()
	 * @generated
	 */
	int MODULE = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Submodule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE__SUBMODULE = 1;

	/**
	 * The number of structural features of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.EntityImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.SpecialEntityImpl <em>Special Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.SpecialEntityImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getSpecialEntity()
	 * @generated
	 */
	int SPECIAL_ENTITY = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ENTITY__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ENTITY__TRANSACTION = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ENTITY__TYPE = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Special Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Special Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.GeneralEntityImpl <em>General Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.GeneralEntityImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getGeneralEntity()
	 * @generated
	 */
	int GENERAL_ENTITY = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ENTITY__NAME = ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>General Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ENTITY_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>General Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERAL_ENTITY_OPERATION_COUNT = ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.SubmoduleImpl <em>Submodule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.SubmoduleImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getSubmodule()
	 * @generated
	 */
	int SUBMODULE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE__OPERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE__ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE__RELATION = 3;

	/**
	 * The number of structural features of the '<em>Submodule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Submodule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBMODULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.DomainMetamodelImpl <em>Domain Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.DomainMetamodelImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getDomainMetamodel()
	 * @generated
	 */
	int DOMAIN_METAMODEL = 30;

	/**
	 * The feature id for the '<em><b>Module</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_METAMODEL__MODULE = 0;

	/**
	 * The number of structural features of the '<em>Domain Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_METAMODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Domain Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_METAMODEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ActionDispatcherImpl <em>Action Dispatcher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ActionDispatcherImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getActionDispatcher()
	 * @generated
	 */
	int ACTION_DISPATCHER = 31;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DISPATCHER__USE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DISPATCHER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Action Dispatcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DISPATCHER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Action Dispatcher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_DISPATCHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ModuleFrontImpl <em>Module Front</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ModuleFrontImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getModuleFront()
	 * @generated
	 */
	int MODULE_FRONT = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FRONT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Present In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FRONT__IS_PRESENT_IN = 1;

	/**
	 * The number of structural features of the '<em>Module Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FRONT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Module Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_FRONT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.RouterImpl <em>Router</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.RouterImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRouter()
	 * @generated
	 */
	int ROUTER = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__NAME = MODULE_FRONT__NAME;

	/**
	 * The feature id for the '<em><b>Is Present In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER__IS_PRESENT_IN = MODULE_FRONT__IS_PRESENT_IN;

	/**
	 * The number of structural features of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_FEATURE_COUNT = MODULE_FRONT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Router</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_OPERATION_COUNT = MODULE_FRONT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.FileImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getFile()
	 * @generated
	 */
	int FILE = 51;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = 1;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.JSONImpl <em>JSON</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.JSONImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getJSON()
	 * @generated
	 */
	int JSON = 33;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__TYPE = FILE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON__NAME = FILE__NAME;

	/**
	 * The number of structural features of the '<em>JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JSON</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.MDImpl <em>MD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.MDImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getMD()
	 * @generated
	 */
	int MD = 34;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MD__TYPE = FILE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MD__NAME = FILE__NAME;

	/**
	 * The number of structural features of the '<em>MD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MD_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>MD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MD_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.CSSImpl <em>CSS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.CSSImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getCSS()
	 * @generated
	 */
	int CSS = 35;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS__TYPE = FILE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS__NAME = FILE__NAME;

	/**
	 * The number of structural features of the '<em>CSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CSS_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.APICallImpl <em>API Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.APICallImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getAPICall()
	 * @generated
	 */
	int API_CALL = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL__NAME = MODULE_FRONT__NAME;

	/**
	 * The feature id for the '<em><b>Is Present In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL__IS_PRESENT_IN = MODULE_FRONT__IS_PRESENT_IN;

	/**
	 * The number of structural features of the '<em>API Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_FEATURE_COUNT = MODULE_FRONT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>API Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_CALL_OPERATION_COUNT = MODULE_FRONT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.DirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.DirectoryImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 37;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__PURPOSE = 0;

	/**
	 * The feature id for the '<em><b>Is Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__IS_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Directories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__DIRECTORIES = 2;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__FILES = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NAME = 4;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.StateImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getState()
	 * @generated
	 */
	int STATE = 38;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Reducer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__REDUCER = 1;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__USE = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ComponentFrontImpl <em>Component Front</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ComponentFrontImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getComponentFront()
	 * @generated
	 */
	int COMPONENT_FRONT = 52;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FRONT__USE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FRONT__NAME = 1;

	/**
	 * The feature id for the '<em><b>In Within</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FRONT__IN_WITHIN = 2;

	/**
	 * The number of structural features of the '<em>Component Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FRONT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Component Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FRONT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.UIFrontImpl <em>UI Front</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.UIFrontImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getUIFront()
	 * @generated
	 */
	int UI_FRONT = 39;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FRONT__USE = COMPONENT_FRONT__USE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FRONT__NAME = COMPONENT_FRONT__NAME;

	/**
	 * The feature id for the '<em><b>In Within</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FRONT__IN_WITHIN = COMPONENT_FRONT__IN_WITHIN;

	/**
	 * The number of structural features of the '<em>UI Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FRONT_FEATURE_COUNT = COMPONENT_FRONT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>UI Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_FRONT_OPERATION_COUNT = COMPONENT_FRONT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.VisualizerImpl <em>Visualizer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.VisualizerImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getVisualizer()
	 * @generated
	 */
	int VISUALIZER = 40;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER__USE = UI_FRONT__USE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER__NAME = UI_FRONT__NAME;

	/**
	 * The feature id for the '<em><b>In Within</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER__IN_WITHIN = UI_FRONT__IN_WITHIN;

	/**
	 * The number of structural features of the '<em>Visualizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER_FEATURE_COUNT = UI_FRONT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visualizer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZER_OPERATION_COUNT = UI_FRONT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.DesignImpl <em>Design</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.DesignImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getDesign()
	 * @generated
	 */
	int DESIGN = 41;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__NAME = MODULE_FRONT__NAME;

	/**
	 * The feature id for the '<em><b>Is Present In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN__IS_PRESENT_IN = MODULE_FRONT__IS_PRESENT_IN;

	/**
	 * The number of structural features of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_FEATURE_COUNT = MODULE_FRONT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Design</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESIGN_OPERATION_COUNT = MODULE_FRONT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ActionCreatorImpl <em>Action Creator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ActionCreatorImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getActionCreator()
	 * @generated
	 */
	int ACTION_CREATOR = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATOR__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CREATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.RouterComponentImpl <em>Router Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.RouterComponentImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRouterComponent()
	 * @generated
	 */
	int ROUTER_COMPONENT = 43;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_COMPONENT__USE = UI_FRONT__USE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_COMPONENT__NAME = UI_FRONT__NAME;

	/**
	 * The feature id for the '<em><b>In Within</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_COMPONENT__IN_WITHIN = UI_FRONT__IN_WITHIN;

	/**
	 * The feature id for the '<em><b>Routes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_COMPONENT__ROUTES = UI_FRONT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Router Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_COMPONENT_FEATURE_COUNT = UI_FRONT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Router Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTER_COMPONENT_OPERATION_COUNT = UI_FRONT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ContainerImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 44;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__USE = COMPONENT_FRONT__USE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__NAME = COMPONENT_FRONT__NAME;

	/**
	 * The feature id for the '<em><b>In Within</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__IN_WITHIN = COMPONENT_FRONT__IN_WITHIN;

	/**
	 * The feature id for the '<em><b>Dispatches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__DISPATCHES = COMPONENT_FRONT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__MAPS = COMPONENT_FRONT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = COMPONENT_FRONT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = COMPONENT_FRONT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ServicesFrontImpl <em>Services Front</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ServicesFrontImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getServicesFront()
	 * @generated
	 */
	int SERVICES_FRONT = 45;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FRONT__USE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FRONT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Is Organized In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FRONT__IS_ORGANIZED_IN = 2;

	/**
	 * The number of structural features of the '<em>Services Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FRONT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Services Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICES_FRONT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.FunctionalityImpl <em>Functionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.FunctionalityImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getFunctionality()
	 * @generated
	 */
	int FUNCTIONALITY = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__STATE = 2;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__SERVICES = 3;

	/**
	 * The feature id for the '<em><b>Is Organized By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY__IS_ORGANIZED_BY = 4;

	/**
	 * The number of structural features of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Functionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.JSImpl <em>JS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.JSImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getJS()
	 * @generated
	 */
	int JS = 47;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS__TYPE = FILE__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS__NAME = FILE__NAME;

	/**
	 * The number of structural features of the '<em>JS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_FEATURE_COUNT = FILE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>JS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JS_OPERATION_COUNT = FILE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ActionImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 48;

	/**
	 * The feature id for the '<em><b>Actiondispatcher</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIONDISPATCHER = 0;

	/**
	 * The feature id for the '<em><b>Actioncreator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTIONCREATOR = 1;

	/**
	 * The feature id for the '<em><b>Action Directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_DIRECTORY = 2;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ReduxImpl <em>Redux</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ReduxImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRedux()
	 * @generated
	 */
	int REDUX = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUX__NAME = MODULE_FRONT__NAME;

	/**
	 * The feature id for the '<em><b>Is Present In</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUX__IS_PRESENT_IN = MODULE_FRONT__IS_PRESENT_IN;

	/**
	 * The number of structural features of the '<em>Redux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUX_FEATURE_COUNT = MODULE_FRONT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Redux</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUX_OPERATION_COUNT = MODULE_FRONT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.ReducerImpl <em>Reducer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.ReducerImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getReducer()
	 * @generated
	 */
	int REDUCER = 53;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.TechnologyMetamodelImpl <em>Technology Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.TechnologyMetamodelImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getTechnologyMetamodel()
	 * @generated
	 */
	int TECHNOLOGY_METAMODEL = 55;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.TechFrontImpl <em>Tech Front</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.TechFrontImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getTechFront()
	 * @generated
	 */
	int TECH_FRONT = 50;

	/**
	 * The feature id for the '<em><b>Functionalities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FRONT__FUNCTIONALITIES = 0;

	/**
	 * The feature id for the '<em><b>Modules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FRONT__MODULES = 1;

	/**
	 * The feature id for the '<em><b>Directories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FRONT__DIRECTORIES = 2;

	/**
	 * The number of structural features of the '<em>Tech Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FRONT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tech Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_FRONT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Catches</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCER__CATCHES = 1;

	/**
	 * The feature id for the '<em><b>Reducer Directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCER__REDUCER_DIRECTORY = 2;

	/**
	 * The number of structural features of the '<em>Reducer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Reducer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REDUCER_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Techback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_METAMODEL__TECHBACK = 0;

	/**
	 * The feature id for the '<em><b>Techfront</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_METAMODEL__TECHFRONT = 1;

	/**
	 * The number of structural features of the '<em>Technology Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_METAMODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Technology Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_METAMODEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.TechBackImpl <em>Tech Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.TechBackImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getTechBack()
	 * @generated
	 */
	int TECH_BACK = 56;

	/**
	 * The feature id for the '<em><b>Jee project</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_BACK__JEE_PROJECT = 0;

	/**
	 * The number of structural features of the '<em>Tech Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_BACK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Tech Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECH_BACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.JEE_ProjectImpl <em>JEE Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.JEE_ProjectImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getJEE_Project()
	 * @generated
	 */
	int JEE_PROJECT = 57;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Subproject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_PROJECT__SUBPROJECT = 1;

	/**
	 * The number of structural features of the '<em>JEE Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_PROJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>JEE Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.EClassImpl <em>EClass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.EClassImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getEClass()
	 * @generated
	 */
	int ECLASS = 67;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__METHOD = 2;

	/**
	 * The feature id for the '<em><b>Anotationi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS__ANOTATIONI = 3;

	/**
	 * The number of structural features of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EClass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.NativeClassImpl <em>Native Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.NativeClassImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getNativeClass()
	 * @generated
	 */
	int NATIVE_CLASS = 58;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_CLASS__ATTRIBUTE = ECLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_CLASS__NAME = ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_CLASS__METHOD = ECLASS__METHOD;

	/**
	 * The feature id for the '<em><b>Anotationi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_CLASS__ANOTATIONI = ECLASS__ANOTATIONI;

	/**
	 * The feature id for the '<em><b>Primitive Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_CLASS__PRIMITIVE_REF = ECLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Native Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_CLASS_FEATURE_COUNT = ECLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Native Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_CLASS_OPERATION_COUNT = ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.InterfaceClassImpl <em>Interface Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.InterfaceClassImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getInterfaceClass()
	 * @generated
	 */
	int INTERFACE_CLASS = 59;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ATTRIBUTE = ECLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__NAME = ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__METHOD = ECLASS__METHOD;

	/**
	 * The feature id for the '<em><b>Anotationi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS__ANOTATIONI = ECLASS__ANOTATIONI;

	/**
	 * The number of structural features of the '<em>Interface Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_FEATURE_COUNT = ECLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_CLASS_OPERATION_COUNT = ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.LibraryImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Native</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__IS_NATIVE = 1;

	/**
	 * The feature id for the '<em><b>Nativeclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NATIVECLASS = 2;

	/**
	 * The feature id for the '<em><b>Anotationi</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__ANOTATIONI = 3;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.JeeImpl <em>Jee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.JeeImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getJee()
	 * @generated
	 */
	int JEE = 61;

	/**
	 * The feature id for the '<em><b>Jee project</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE__JEE_PROJECT = 0;

	/**
	 * The number of structural features of the '<em>Jee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Jee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.AttributeImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 62;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anotationi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANOTATIONI = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.GenericClassImpl <em>Generic Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.GenericClassImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getGenericClass()
	 * @generated
	 */
	int GENERIC_CLASS = 63;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CLASS__ATTRIBUTE = ECLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CLASS__NAME = ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CLASS__METHOD = ECLASS__METHOD;

	/**
	 * The feature id for the '<em><b>Anotationi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CLASS__ANOTATIONI = ECLASS__ANOTATIONI;

	/**
	 * The feature id for the '<em><b>Implement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CLASS__IMPLEMENT = ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CLASS__EXTENDS = ECLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generic Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CLASS_FEATURE_COUNT = ECLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Generic Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_CLASS_OPERATION_COUNT = ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.MethodBackImpl <em>Method Back</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.MethodBackImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getMethodBack()
	 * @generated
	 */
	int METHOD_BACK = 64;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_BACK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Anotationi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_BACK__ANOTATIONI = 1;

	/**
	 * The feature id for the '<em><b>Return</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_BACK__RETURN = 2;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_BACK__ARGUMENTS = 3;

	/**
	 * The number of structural features of the '<em>Method Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_BACK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Method Back</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_BACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.AbstractClassImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getAbstractClass()
	 * @generated
	 */
	int ABSTRACT_CLASS = 65;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__ATTRIBUTE = ECLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__NAME = ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__METHOD = ECLASS__METHOD;

	/**
	 * The feature id for the '<em><b>Anotationi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS__ANOTATIONI = ECLASS__ANOTATIONI;

	/**
	 * The number of structural features of the '<em>Abstract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_FEATURE_COUNT = ECLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Abstract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CLASS_OPERATION_COUNT = ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.EpackageImpl <em>Epackage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.EpackageImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getEpackage()
	 * @generated
	 */
	int EPACKAGE = 66;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE__CLASS = 1;

	/**
	 * The number of structural features of the '<em>Epackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Epackage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EPACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.AnotationiImpl <em>Anotationi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.AnotationiImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getAnotationi()
	 * @generated
	 */
	int ANOTATIONI = 68;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATIONI__ATTRIBUTE = ECLASS__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATIONI__NAME = ECLASS__NAME;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATIONI__METHOD = ECLASS__METHOD;

	/**
	 * The feature id for the '<em><b>Anotationi</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATIONI__ANOTATIONI = ECLASS__ANOTATIONI;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATIONI__PROPERTIES = ECLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATIONI__DESCRIPTOR = ECLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Anotationi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATIONI_FEATURE_COUNT = ECLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Anotationi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANOTATIONI_OPERATION_COUNT = ECLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.SubprojectImpl <em>Subproject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.SubprojectImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getSubproject()
	 * @generated
	 */
	int SUBPROJECT = 69;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Descriptor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROJECT__DESCRIPTOR = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROJECT__PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROJECT__LIBRARY = 3;

	/**
	 * The number of structural features of the '<em>Subproject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROJECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Subproject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.DescriptorImpl <em>Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.DescriptorImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getDescriptor()
	 * @generated
	 */
	int DESCRIPTOR = 70;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR__PATH = 1;

	/**
	 * The number of structural features of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link UnifiedMetamodel_.impl.JavaScriptImpl <em>Java Script</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see UnifiedMetamodel_.impl.JavaScriptImpl
	 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getJavaScript()
	 * @generated
	 */
	int JAVA_SCRIPT = 71;

	/**
	 * The feature id for the '<em><b>Layer Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT__LAYER_SEGMENTS = LAYER__LAYER_SEGMENTS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT__NAME = LAYER__NAME;

	/**
	 * The number of structural features of the '<em>Java Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_FEATURE_COUNT = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Java Script</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_SCRIPT_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Ejb <em>Ejb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ejb</em>'.
	 * @see UnifiedMetamodel_.Ejb
	 * @generated
	 */
	EClass getEjb();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.LayerSegment <em>Layer Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer Segment</em>'.
	 * @see UnifiedMetamodel_.LayerSegment
	 * @generated
	 */
	EClass getLayerSegment();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.LayerSegment#getAllowToUse <em>Allow To Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Allow To Use</em>'.
	 * @see UnifiedMetamodel_.LayerSegment#getAllowToUse()
	 * @see #getLayerSegment()
	 * @generated
	 */
	EReference getLayerSegment_AllowToUse();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.LayerSegment#getLayersegment <em>Layersegment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layersegment</em>'.
	 * @see UnifiedMetamodel_.LayerSegment#getLayersegment()
	 * @see #getLayerSegment()
	 * @generated
	 */
	EReference getLayerSegment_Layersegment();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.LayerSegment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.LayerSegment#getName()
	 * @see #getLayerSegment()
	 * @generated
	 */
	EAttribute getLayerSegment_Name();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Dto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto</em>'.
	 * @see UnifiedMetamodel_.Dto
	 * @generated
	 */
	EClass getDto();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see UnifiedMetamodel_.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI</em>'.
	 * @see UnifiedMetamodel_.UI
	 * @generated
	 */
	EClass getUI();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see UnifiedMetamodel_.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Layer#getLayerSegments <em>Layer Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layer Segments</em>'.
	 * @see UnifiedMetamodel_.Layer#getLayerSegments()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_LayerSegments();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Layer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Layer#getName()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Name();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.RestEntity <em>Rest Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Entity</em>'.
	 * @see UnifiedMetamodel_.RestEntity
	 * @generated
	 */
	EClass getRestEntity();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Facade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see UnifiedMetamodel_.Facade
	 * @generated
	 */
	EClass getFacade();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.War <em>War</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>War</em>'.
	 * @see UnifiedMetamodel_.War
	 * @generated
	 */
	EClass getWar();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see UnifiedMetamodel_.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Component#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see UnifiedMetamodel_.Component#getLayers()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Layers();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Component#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see UnifiedMetamodel_.Component#getRelations()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Relations();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.RelationArch <em>Relation Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Arch</em>'.
	 * @see UnifiedMetamodel_.RelationArch
	 * @generated
	 */
	EClass getRelationArch();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.RelationArch#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see UnifiedMetamodel_.RelationArch#getSource()
	 * @see #getRelationArch()
	 * @generated
	 */
	EReference getRelationArch_Source();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.RelationArch#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see UnifiedMetamodel_.RelationArch#getTarget()
	 * @see #getRelationArch()
	 * @generated
	 */
	EReference getRelationArch_Target();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.RelationArch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.RelationArch#getName()
	 * @see #getRelationArch()
	 * @generated
	 */
	EAttribute getRelationArch_Name();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.ArquitectureMetamodel <em>Arquitecture Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arquitecture Metamodel</em>'.
	 * @see UnifiedMetamodel_.ArquitectureMetamodel
	 * @generated
	 */
	EClass getArquitectureMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.ArquitectureMetamodel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see UnifiedMetamodel_.ArquitectureMetamodel#getComponents()
	 * @see #getArquitectureMetamodel()
	 * @generated
	 */
	EReference getArquitectureMetamodel_Components();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Containers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containers</em>'.
	 * @see UnifiedMetamodel_.Containers
	 * @generated
	 */
	EClass getContainers();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Pojo <em>Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pojo</em>'.
	 * @see UnifiedMetamodel_.Pojo
	 * @generated
	 */
	EClass getPojo();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services</em>'.
	 * @see UnifiedMetamodel_.Services
	 * @generated
	 */
	EClass getServices();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see UnifiedMetamodel_.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the containment reference '{@link UnifiedMetamodel_.Metamodel#getArquitecturemetamodel <em>Arquitecturemetamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arquitecturemetamodel</em>'.
	 * @see UnifiedMetamodel_.Metamodel#getArquitecturemetamodel()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Arquitecturemetamodel();

	/**
	 * Returns the meta object for the containment reference '{@link UnifiedMetamodel_.Metamodel#getDomainmetamodel <em>Domainmetamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domainmetamodel</em>'.
	 * @see UnifiedMetamodel_.Metamodel#getDomainmetamodel()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Domainmetamodel();

	/**
	 * Returns the meta object for the containment reference '{@link UnifiedMetamodel_.Metamodel#getTechnologymetamodel <em>Technologymetamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technologymetamodel</em>'.
	 * @see UnifiedMetamodel_.Metamodel#getTechnologymetamodel()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Technologymetamodel();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read</em>'.
	 * @see UnifiedMetamodel_.Read
	 * @generated
	 */
	EClass getRead();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create</em>'.
	 * @see UnifiedMetamodel_.Create
	 * @generated
	 */
	EClass getCreate();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Sale <em>Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sale</em>'.
	 * @see UnifiedMetamodel_.Sale
	 * @generated
	 */
	EClass getSale();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Exchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange</em>'.
	 * @see UnifiedMetamodel_.Exchange
	 * @generated
	 */
	EClass getExchange();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see UnifiedMetamodel_.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations</em>'.
	 * @see UnifiedMetamodel_.Operations
	 * @generated
	 */
	EClass getOperations();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.Operations#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see UnifiedMetamodel_.Operations#getEntity()
	 * @see #getOperations()
	 * @generated
	 */
	EReference getOperations_Entity();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Login <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login</em>'.
	 * @see UnifiedMetamodel_.Login
	 * @generated
	 */
	EClass getLogin();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module</em>'.
	 * @see UnifiedMetamodel_.Module
	 * @generated
	 */
	EClass getModule();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Module#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Module#getName()
	 * @see #getModule()
	 * @generated
	 */
	EAttribute getModule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Module#getSubmodule <em>Submodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submodule</em>'.
	 * @see UnifiedMetamodel_.Module#getSubmodule()
	 * @see #getModule()
	 * @generated
	 */
	EReference getModule_Submodule();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.SpecialEntity <em>Special Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Entity</em>'.
	 * @see UnifiedMetamodel_.SpecialEntity
	 * @generated
	 */
	EClass getSpecialEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.SpecialEntity#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transaction</em>'.
	 * @see UnifiedMetamodel_.SpecialEntity#getTransaction()
	 * @see #getSpecialEntity()
	 * @generated
	 */
	EReference getSpecialEntity_Transaction();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.SpecialEntity#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see UnifiedMetamodel_.SpecialEntity#getType()
	 * @see #getSpecialEntity()
	 * @generated
	 */
	EAttribute getSpecialEntity_Type();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.GeneralEntity <em>General Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>General Entity</em>'.
	 * @see UnifiedMetamodel_.GeneralEntity
	 * @generated
	 */
	EClass getGeneralEntity();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see UnifiedMetamodel_.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.RelationDom <em>Relation Dom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Dom</em>'.
	 * @see UnifiedMetamodel_.RelationDom
	 * @generated
	 */
	EClass getRelationDom();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.RelationDom#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see UnifiedMetamodel_.RelationDom#getSource()
	 * @see #getRelationDom()
	 * @generated
	 */
	EReference getRelationDom_Source();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.RelationDom#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see UnifiedMetamodel_.RelationDom#getTarget()
	 * @see #getRelationDom()
	 * @generated
	 */
	EReference getRelationDom_Target();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see UnifiedMetamodel_.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference list '{@link UnifiedMetamodel_.Transaction#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Update</em>'.
	 * @see UnifiedMetamodel_.Transaction#getUpdate()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Update();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Submodule <em>Submodule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Submodule</em>'.
	 * @see UnifiedMetamodel_.Submodule
	 * @generated
	 */
	EClass getSubmodule();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Submodule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Submodule#getName()
	 * @see #getSubmodule()
	 * @generated
	 */
	EAttribute getSubmodule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Submodule#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see UnifiedMetamodel_.Submodule#getOperations()
	 * @see #getSubmodule()
	 * @generated
	 */
	EReference getSubmodule_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Submodule#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see UnifiedMetamodel_.Submodule#getEntity()
	 * @see #getSubmodule()
	 * @generated
	 */
	EReference getSubmodule_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Submodule#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relation</em>'.
	 * @see UnifiedMetamodel_.Submodule#getRelation()
	 * @see #getSubmodule()
	 * @generated
	 */
	EReference getSubmodule_Relation();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.DomainMetamodel <em>Domain Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain Metamodel</em>'.
	 * @see UnifiedMetamodel_.DomainMetamodel
	 * @generated
	 */
	EClass getDomainMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.DomainMetamodel#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Module</em>'.
	 * @see UnifiedMetamodel_.DomainMetamodel#getModule()
	 * @see #getDomainMetamodel()
	 * @generated
	 */
	EReference getDomainMetamodel_Module();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.ActionDispatcher <em>Action Dispatcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Dispatcher</em>'.
	 * @see UnifiedMetamodel_.ActionDispatcher
	 * @generated
	 */
	EClass getActionDispatcher();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.ActionDispatcher#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see UnifiedMetamodel_.ActionDispatcher#getUse()
	 * @see #getActionDispatcher()
	 * @generated
	 */
	EReference getActionDispatcher_Use();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.ActionDispatcher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.ActionDispatcher#getName()
	 * @see #getActionDispatcher()
	 * @generated
	 */
	EAttribute getActionDispatcher_Name();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router</em>'.
	 * @see UnifiedMetamodel_.Router
	 * @generated
	 */
	EClass getRouter();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.JSON <em>JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON</em>'.
	 * @see UnifiedMetamodel_.JSON
	 * @generated
	 */
	EClass getJSON();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.MD <em>MD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MD</em>'.
	 * @see UnifiedMetamodel_.MD
	 * @generated
	 */
	EClass getMD();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.CSS <em>CSS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CSS</em>'.
	 * @see UnifiedMetamodel_.CSS
	 * @generated
	 */
	EClass getCSS();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.APICall <em>API Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Call</em>'.
	 * @see UnifiedMetamodel_.APICall
	 * @generated
	 */
	EClass getAPICall();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see UnifiedMetamodel_.Directory
	 * @generated
	 */
	EClass getDirectory();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Directory#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see UnifiedMetamodel_.Directory#getPurpose()
	 * @see #getDirectory()
	 * @generated
	 */
	EAttribute getDirectory_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Directory#isIsRoot <em>Is Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Root</em>'.
	 * @see UnifiedMetamodel_.Directory#isIsRoot()
	 * @see #getDirectory()
	 * @generated
	 */
	EAttribute getDirectory_IsRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Directory#getDirectories <em>Directories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directories</em>'.
	 * @see UnifiedMetamodel_.Directory#getDirectories()
	 * @see #getDirectory()
	 * @generated
	 */
	EReference getDirectory_Directories();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Directory#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see UnifiedMetamodel_.Directory#getFiles()
	 * @see #getDirectory()
	 * @generated
	 */
	EReference getDirectory_Files();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Directory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Directory#getName()
	 * @see #getDirectory()
	 * @generated
	 */
	EAttribute getDirectory_Name();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see UnifiedMetamodel_.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.State#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see UnifiedMetamodel_.State#getAction()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Action();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.State#getReducer <em>Reducer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reducer</em>'.
	 * @see UnifiedMetamodel_.State#getReducer()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Reducer();

	/**
	 * Returns the meta object for the reference list '{@link UnifiedMetamodel_.State#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see UnifiedMetamodel_.State#getUse()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Use();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.UIFront <em>UI Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Front</em>'.
	 * @see UnifiedMetamodel_.UIFront
	 * @generated
	 */
	EClass getUIFront();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Visualizer <em>Visualizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualizer</em>'.
	 * @see UnifiedMetamodel_.Visualizer
	 * @generated
	 */
	EClass getVisualizer();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Design</em>'.
	 * @see UnifiedMetamodel_.Design
	 * @generated
	 */
	EClass getDesign();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.ActionCreator <em>Action Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Creator</em>'.
	 * @see UnifiedMetamodel_.ActionCreator
	 * @generated
	 */
	EClass getActionCreator();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.ActionCreator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.ActionCreator#getName()
	 * @see #getActionCreator()
	 * @generated
	 */
	EAttribute getActionCreator_Name();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.RouterComponent <em>Router Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Router Component</em>'.
	 * @see UnifiedMetamodel_.RouterComponent
	 * @generated
	 */
	EClass getRouterComponent();

	/**
	 * Returns the meta object for the reference list '{@link UnifiedMetamodel_.RouterComponent#getRoutes <em>Routes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Routes</em>'.
	 * @see UnifiedMetamodel_.RouterComponent#getRoutes()
	 * @see #getRouterComponent()
	 * @generated
	 */
	EReference getRouterComponent_Routes();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see UnifiedMetamodel_.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the reference list '{@link UnifiedMetamodel_.Container#getDispatches <em>Dispatches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dispatches</em>'.
	 * @see UnifiedMetamodel_.Container#getDispatches()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Dispatches();

	/**
	 * Returns the meta object for the reference list '{@link UnifiedMetamodel_.Container#getMaps <em>Maps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Maps</em>'.
	 * @see UnifiedMetamodel_.Container#getMaps()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Maps();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.ServicesFront <em>Services Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Services Front</em>'.
	 * @see UnifiedMetamodel_.ServicesFront
	 * @generated
	 */
	EClass getServicesFront();

	/**
	 * Returns the meta object for the reference list '{@link UnifiedMetamodel_.ServicesFront#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see UnifiedMetamodel_.ServicesFront#getUse()
	 * @see #getServicesFront()
	 * @generated
	 */
	EReference getServicesFront_Use();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.ServicesFront#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.ServicesFront#getName()
	 * @see #getServicesFront()
	 * @generated
	 */
	EAttribute getServicesFront_Name();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.ServicesFront#getIsOrganizedIn <em>Is Organized In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Organized In</em>'.
	 * @see UnifiedMetamodel_.ServicesFront#getIsOrganizedIn()
	 * @see #getServicesFront()
	 * @generated
	 */
	EReference getServicesFront_IsOrganizedIn();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Functionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functionality</em>'.
	 * @see UnifiedMetamodel_.Functionality
	 * @generated
	 */
	EClass getFunctionality();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Functionality#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Functionality#getName()
	 * @see #getFunctionality()
	 * @generated
	 */
	EAttribute getFunctionality_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Functionality#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see UnifiedMetamodel_.Functionality#getComponents()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Functionality#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State</em>'.
	 * @see UnifiedMetamodel_.Functionality#getState()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_State();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Functionality#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Services</em>'.
	 * @see UnifiedMetamodel_.Functionality#getServices()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_Services();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.Functionality#getIsOrganizedBy <em>Is Organized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Organized By</em>'.
	 * @see UnifiedMetamodel_.Functionality#getIsOrganizedBy()
	 * @see #getFunctionality()
	 * @generated
	 */
	EReference getFunctionality_IsOrganizedBy();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.JS <em>JS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JS</em>'.
	 * @see UnifiedMetamodel_.JS
	 * @generated
	 */
	EClass getJS();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see UnifiedMetamodel_.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Action#getActiondispatcher <em>Actiondispatcher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actiondispatcher</em>'.
	 * @see UnifiedMetamodel_.Action#getActiondispatcher()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actiondispatcher();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Action#getActioncreator <em>Actioncreator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actioncreator</em>'.
	 * @see UnifiedMetamodel_.Action#getActioncreator()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actioncreator();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.Action#getActionDirectory <em>Action Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Directory</em>'.
	 * @see UnifiedMetamodel_.Action#getActionDirectory()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ActionDirectory();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Redux <em>Redux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Redux</em>'.
	 * @see UnifiedMetamodel_.Redux
	 * @generated
	 */
	EClass getRedux();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see UnifiedMetamodel_.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.File#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see UnifiedMetamodel_.File#getType()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Type();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.File#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.File#getName()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Name();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.ComponentFront <em>Component Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Front</em>'.
	 * @see UnifiedMetamodel_.ComponentFront
	 * @generated
	 */
	EClass getComponentFront();

	/**
	 * Returns the meta object for the reference list '{@link UnifiedMetamodel_.ComponentFront#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see UnifiedMetamodel_.ComponentFront#getUse()
	 * @see #getComponentFront()
	 * @generated
	 */
	EReference getComponentFront_Use();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.ComponentFront#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.ComponentFront#getName()
	 * @see #getComponentFront()
	 * @generated
	 */
	EAttribute getComponentFront_Name();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.ComponentFront#getInWithin <em>In Within</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>In Within</em>'.
	 * @see UnifiedMetamodel_.ComponentFront#getInWithin()
	 * @see #getComponentFront()
	 * @generated
	 */
	EReference getComponentFront_InWithin();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Reducer <em>Reducer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reducer</em>'.
	 * @see UnifiedMetamodel_.Reducer
	 * @generated
	 */
	EClass getReducer();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Reducer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Reducer#getName()
	 * @see #getReducer()
	 * @generated
	 */
	EAttribute getReducer_Name();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.Reducer#getCatches <em>Catches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Catches</em>'.
	 * @see UnifiedMetamodel_.Reducer#getCatches()
	 * @see #getReducer()
	 * @generated
	 */
	EReference getReducer_Catches();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.Reducer#getReducerDirectory <em>Reducer Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reducer Directory</em>'.
	 * @see UnifiedMetamodel_.Reducer#getReducerDirectory()
	 * @see #getReducer()
	 * @generated
	 */
	EReference getReducer_ReducerDirectory();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.ModuleFront <em>Module Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Front</em>'.
	 * @see UnifiedMetamodel_.ModuleFront
	 * @generated
	 */
	EClass getModuleFront();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.ModuleFront#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.ModuleFront#getName()
	 * @see #getModuleFront()
	 * @generated
	 */
	EAttribute getModuleFront_Name();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.ModuleFront#getIsPresentIn <em>Is Present In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Present In</em>'.
	 * @see UnifiedMetamodel_.ModuleFront#getIsPresentIn()
	 * @see #getModuleFront()
	 * @generated
	 */
	EReference getModuleFront_IsPresentIn();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.TechnologyMetamodel <em>Technology Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology Metamodel</em>'.
	 * @see UnifiedMetamodel_.TechnologyMetamodel
	 * @generated
	 */
	EClass getTechnologyMetamodel();

	/**
	 * Returns the meta object for the containment reference '{@link UnifiedMetamodel_.TechnologyMetamodel#getTechfront <em>Techfront</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Techfront</em>'.
	 * @see UnifiedMetamodel_.TechnologyMetamodel#getTechfront()
	 * @see #getTechnologyMetamodel()
	 * @generated
	 */
	EReference getTechnologyMetamodel_Techfront();

	/**
	 * Returns the meta object for the containment reference '{@link UnifiedMetamodel_.TechnologyMetamodel#getTechback <em>Techback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Techback</em>'.
	 * @see UnifiedMetamodel_.TechnologyMetamodel#getTechback()
	 * @see #getTechnologyMetamodel()
	 * @generated
	 */
	EReference getTechnologyMetamodel_Techback();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.TechFront <em>Tech Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Front</em>'.
	 * @see UnifiedMetamodel_.TechFront
	 * @generated
	 */
	EClass getTechFront();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.TechFront#getFunctionalities <em>Functionalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functionalities</em>'.
	 * @see UnifiedMetamodel_.TechFront#getFunctionalities()
	 * @see #getTechFront()
	 * @generated
	 */
	EReference getTechFront_Functionalities();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.TechFront#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Modules</em>'.
	 * @see UnifiedMetamodel_.TechFront#getModules()
	 * @see #getTechFront()
	 * @generated
	 */
	EReference getTechFront_Modules();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.TechFront#getDirectories <em>Directories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Directories</em>'.
	 * @see UnifiedMetamodel_.TechFront#getDirectories()
	 * @see #getTechFront()
	 * @generated
	 */
	EReference getTechFront_Directories();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.TechBack <em>Tech Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tech Back</em>'.
	 * @see UnifiedMetamodel_.TechBack
	 * @generated
	 */
	EClass getTechBack();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.TechBack#getJee_project <em>Jee project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jee project</em>'.
	 * @see UnifiedMetamodel_.TechBack#getJee_project()
	 * @see #getTechBack()
	 * @generated
	 */
	EReference getTechBack_Jee_project();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.JEE_Project <em>JEE Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JEE Project</em>'.
	 * @see UnifiedMetamodel_.JEE_Project
	 * @generated
	 */
	EClass getJEE_Project();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.JEE_Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.JEE_Project#getName()
	 * @see #getJEE_Project()
	 * @generated
	 */
	EAttribute getJEE_Project_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.JEE_Project#getSubproject <em>Subproject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subproject</em>'.
	 * @see UnifiedMetamodel_.JEE_Project#getSubproject()
	 * @see #getJEE_Project()
	 * @generated
	 */
	EReference getJEE_Project_Subproject();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.NativeClass <em>Native Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Class</em>'.
	 * @see UnifiedMetamodel_.NativeClass
	 * @generated
	 */
	EClass getNativeClass();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.NativeClass#getPrimitiveRef <em>Primitive Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Ref</em>'.
	 * @see UnifiedMetamodel_.NativeClass#getPrimitiveRef()
	 * @see #getNativeClass()
	 * @generated
	 */
	EAttribute getNativeClass_PrimitiveRef();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.InterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Class</em>'.
	 * @see UnifiedMetamodel_.InterfaceClass
	 * @generated
	 */
	EClass getInterfaceClass();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see UnifiedMetamodel_.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Library#isIsNative <em>Is Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Native</em>'.
	 * @see UnifiedMetamodel_.Library#isIsNative()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_IsNative();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Library#getNativeclass <em>Nativeclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nativeclass</em>'.
	 * @see UnifiedMetamodel_.Library#getNativeclass()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Nativeclass();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Library#getAnotationi <em>Anotationi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Anotationi</em>'.
	 * @see UnifiedMetamodel_.Library#getAnotationi()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Anotationi();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Jee <em>Jee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jee</em>'.
	 * @see UnifiedMetamodel_.Jee
	 * @generated
	 */
	EClass getJee();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Jee#getJee_project <em>Jee project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jee project</em>'.
	 * @see UnifiedMetamodel_.Jee#getJee_project()
	 * @see #getJee()
	 * @generated
	 */
	EReference getJee_Jee_project();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see UnifiedMetamodel_.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.Attribute#getAnotationi <em>Anotationi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anotationi</em>'.
	 * @see UnifiedMetamodel_.Attribute#getAnotationi()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Anotationi();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see UnifiedMetamodel_.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.GenericClass <em>Generic Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Class</em>'.
	 * @see UnifiedMetamodel_.GenericClass
	 * @generated
	 */
	EClass getGenericClass();

	/**
	 * Returns the meta object for the reference list '{@link UnifiedMetamodel_.GenericClass#getImplement <em>Implement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Implement</em>'.
	 * @see UnifiedMetamodel_.GenericClass#getImplement()
	 * @see #getGenericClass()
	 * @generated
	 */
	EReference getGenericClass_Implement();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.GenericClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see UnifiedMetamodel_.GenericClass#getExtends()
	 * @see #getGenericClass()
	 * @generated
	 */
	EReference getGenericClass_Extends();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.MethodBack <em>Method Back</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method Back</em>'.
	 * @see UnifiedMetamodel_.MethodBack
	 * @generated
	 */
	EClass getMethodBack();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.MethodBack#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.MethodBack#getName()
	 * @see #getMethodBack()
	 * @generated
	 */
	EAttribute getMethodBack_Name();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.MethodBack#getAnotationi <em>Anotationi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anotationi</em>'.
	 * @see UnifiedMetamodel_.MethodBack#getAnotationi()
	 * @see #getMethodBack()
	 * @generated
	 */
	EReference getMethodBack_Anotationi();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.MethodBack#getReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Return</em>'.
	 * @see UnifiedMetamodel_.MethodBack#getReturn()
	 * @see #getMethodBack()
	 * @generated
	 */
	EReference getMethodBack_Return();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.MethodBack#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arguments</em>'.
	 * @see UnifiedMetamodel_.MethodBack#getArguments()
	 * @see #getMethodBack()
	 * @generated
	 */
	EReference getMethodBack_Arguments();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.AbstractClass <em>Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Class</em>'.
	 * @see UnifiedMetamodel_.AbstractClass
	 * @generated
	 */
	EClass getAbstractClass();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Epackage <em>Epackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Epackage</em>'.
	 * @see UnifiedMetamodel_.Epackage
	 * @generated
	 */
	EClass getEpackage();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Epackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Epackage#getName()
	 * @see #getEpackage()
	 * @generated
	 */
	EAttribute getEpackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Epackage#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see UnifiedMetamodel_.Epackage#getClass_()
	 * @see #getEpackage()
	 * @generated
	 */
	EReference getEpackage_Class();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EClass</em>'.
	 * @see UnifiedMetamodel_.EClass
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.EClass#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see UnifiedMetamodel_.EClass#getAttribute()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.EClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.EClass#getName()
	 * @see #getEClass()
	 * @generated
	 */
	EAttribute getEClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.EClass#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see UnifiedMetamodel_.EClass#getMethod()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Method();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.EClass#getAnotationi <em>Anotationi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anotationi</em>'.
	 * @see UnifiedMetamodel_.EClass#getAnotationi()
	 * @see #getEClass()
	 * @generated
	 */
	EReference getEClass_Anotationi();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Anotationi <em>Anotationi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anotationi</em>'.
	 * @see UnifiedMetamodel_.Anotationi
	 * @generated
	 */
	EClass getAnotationi();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Anotationi#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see UnifiedMetamodel_.Anotationi#getProperties()
	 * @see #getAnotationi()
	 * @generated
	 */
	EAttribute getAnotationi_Properties();

	/**
	 * Returns the meta object for the reference '{@link UnifiedMetamodel_.Anotationi#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Descriptor</em>'.
	 * @see UnifiedMetamodel_.Anotationi#getDescriptor()
	 * @see #getAnotationi()
	 * @generated
	 */
	EReference getAnotationi_Descriptor();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Subproject <em>Subproject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subproject</em>'.
	 * @see UnifiedMetamodel_.Subproject
	 * @generated
	 */
	EClass getSubproject();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Subproject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Subproject#getName()
	 * @see #getSubproject()
	 * @generated
	 */
	EAttribute getSubproject_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Subproject#getDescriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Descriptor</em>'.
	 * @see UnifiedMetamodel_.Subproject#getDescriptor()
	 * @see #getSubproject()
	 * @generated
	 */
	EReference getSubproject_Descriptor();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Subproject#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see UnifiedMetamodel_.Subproject#getPackage()
	 * @see #getSubproject()
	 * @generated
	 */
	EReference getSubproject_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link UnifiedMetamodel_.Subproject#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library</em>'.
	 * @see UnifiedMetamodel_.Subproject#getLibrary()
	 * @see #getSubproject()
	 * @generated
	 */
	EReference getSubproject_Library();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor</em>'.
	 * @see UnifiedMetamodel_.Descriptor
	 * @generated
	 */
	EClass getDescriptor();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Descriptor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see UnifiedMetamodel_.Descriptor#getName()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Name();

	/**
	 * Returns the meta object for the attribute '{@link UnifiedMetamodel_.Descriptor#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see UnifiedMetamodel_.Descriptor#getPath()
	 * @see #getDescriptor()
	 * @generated
	 */
	EAttribute getDescriptor_Path();

	/**
	 * Returns the meta object for class '{@link UnifiedMetamodel_.JavaScript <em>Java Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Script</em>'.
	 * @see UnifiedMetamodel_.JavaScript
	 * @generated
	 */
	EClass getJavaScript();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnifiedMetamodel_Factory getUnifiedMetamodel_Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.EjbImpl <em>Ejb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.EjbImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getEjb()
		 * @generated
		 */
		EClass EJB = eINSTANCE.getEjb();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.LayerSegmentImpl <em>Layer Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.LayerSegmentImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getLayerSegment()
		 * @generated
		 */
		EClass LAYER_SEGMENT = eINSTANCE.getLayerSegment();
		/**
		 * The meta object literal for the '<em><b>Allow To Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_SEGMENT__ALLOW_TO_USE = eINSTANCE.getLayerSegment_AllowToUse();
		/**
		 * The meta object literal for the '<em><b>Layersegment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER_SEGMENT__LAYERSEGMENT = eINSTANCE.getLayerSegment_Layersegment();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER_SEGMENT__NAME = eINSTANCE.getLayerSegment_Name();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.DtoImpl <em>Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.DtoImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getDto()
		 * @generated
		 */
		EClass DTO = eINSTANCE.getDto();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.StoreImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.UIImpl <em>UI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.UIImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getUI()
		 * @generated
		 */
		EClass UI = eINSTANCE.getUI();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.LayerImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();
		/**
		 * The meta object literal for the '<em><b>Layer Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__LAYER_SEGMENTS = eINSTANCE.getLayer_LayerSegments();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.RestEntityImpl <em>Rest Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.RestEntityImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRestEntity()
		 * @generated
		 */
		EClass REST_ENTITY = eINSTANCE.getRestEntity();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.FacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.FacadeImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getFacade()
		 * @generated
		 */
		EClass FACADE = eINSTANCE.getFacade();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.WarImpl <em>War</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.WarImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getWar()
		 * @generated
		 */
		EClass WAR = eINSTANCE.getWar();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ComponentImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();
		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__LAYERS = eINSTANCE.getComponent_Layers();
		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__RELATIONS = eINSTANCE.getComponent_Relations();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.RelationArchImpl <em>Relation Arch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.RelationArchImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRelationArch()
		 * @generated
		 */
		EClass RELATION_ARCH = eINSTANCE.getRelationArch();
		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ARCH__SOURCE = eINSTANCE.getRelationArch_Source();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_ARCH__TARGET = eINSTANCE.getRelationArch_Target();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATION_ARCH__NAME = eINSTANCE.getRelationArch_Name();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ArquitectureMetamodelImpl <em>Arquitecture Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ArquitectureMetamodelImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getArquitectureMetamodel()
		 * @generated
		 */
		EClass ARQUITECTURE_METAMODEL = eINSTANCE.getArquitectureMetamodel();
		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARQUITECTURE_METAMODEL__COMPONENTS = eINSTANCE.getArquitectureMetamodel_Components();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ContainersImpl <em>Containers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ContainersImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getContainers()
		 * @generated
		 */
		EClass CONTAINERS = eINSTANCE.getContainers();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.PojoImpl <em>Pojo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.PojoImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getPojo()
		 * @generated
		 */
		EClass POJO = eINSTANCE.getPojo();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ServicesImpl <em>Services</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ServicesImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getServices()
		 * @generated
		 */
		EClass SERVICES = eINSTANCE.getServices();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.MetamodelImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();
		/**
		 * The meta object literal for the '<em><b>Arquitecturemetamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__ARQUITECTUREMETAMODEL = eINSTANCE.getMetamodel_Arquitecturemetamodel();
		/**
		 * The meta object literal for the '<em><b>Domainmetamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__DOMAINMETAMODEL = eINSTANCE.getMetamodel_Domainmetamodel();
		/**
		 * The meta object literal for the '<em><b>Technologymetamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__TECHNOLOGYMETAMODEL = eINSTANCE.getMetamodel_Technologymetamodel();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ReadImpl <em>Read</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ReadImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRead()
		 * @generated
		 */
		EClass READ = eINSTANCE.getRead();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.CreateImpl <em>Create</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.CreateImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getCreate()
		 * @generated
		 */
		EClass CREATE = eINSTANCE.getCreate();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.SaleImpl <em>Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.SaleImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getSale()
		 * @generated
		 */
		EClass SALE = eINSTANCE.getSale();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ExchangeImpl <em>Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ExchangeImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getExchange()
		 * @generated
		 */
		EClass EXCHANGE = eINSTANCE.getExchange();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.CompositionImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.OperationsImpl <em>Operations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.OperationsImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getOperations()
		 * @generated
		 */
		EClass OPERATIONS = eINSTANCE.getOperations();
		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATIONS__ENTITY = eINSTANCE.getOperations_Entity();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.LoginImpl <em>Login</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.LoginImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getLogin()
		 * @generated
		 */
		EClass LOGIN = eINSTANCE.getLogin();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ModuleImpl <em>Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ModuleImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getModule()
		 * @generated
		 */
		EClass MODULE = eINSTANCE.getModule();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE__NAME = eINSTANCE.getModule_Name();
		/**
		 * The meta object literal for the '<em><b>Submodule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE__SUBMODULE = eINSTANCE.getModule_Submodule();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.SpecialEntityImpl <em>Special Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.SpecialEntityImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getSpecialEntity()
		 * @generated
		 */
		EClass SPECIAL_ENTITY = eINSTANCE.getSpecialEntity();
		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIAL_ENTITY__TRANSACTION = eINSTANCE.getSpecialEntity_Transaction();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_ENTITY__TYPE = eINSTANCE.getSpecialEntity_Type();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.GeneralEntityImpl <em>General Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.GeneralEntityImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getGeneralEntity()
		 * @generated
		 */
		EClass GENERAL_ENTITY = eINSTANCE.getGeneralEntity();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.EntityImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.RelationDomImpl <em>Relation Dom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.RelationDomImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRelationDom()
		 * @generated
		 */
		EClass RELATION_DOM = eINSTANCE.getRelationDom();
		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOM__SOURCE = eINSTANCE.getRelationDom_Source();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DOM__TARGET = eINSTANCE.getRelationDom_Target();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.TransactionImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();
		/**
		 * The meta object literal for the '<em><b>Update</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__UPDATE = eINSTANCE.getTransaction_Update();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.SubmoduleImpl <em>Submodule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.SubmoduleImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getSubmodule()
		 * @generated
		 */
		EClass SUBMODULE = eINSTANCE.getSubmodule();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBMODULE__NAME = eINSTANCE.getSubmodule_Name();
		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULE__OPERATIONS = eINSTANCE.getSubmodule_Operations();
		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULE__ENTITY = eINSTANCE.getSubmodule_Entity();
		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBMODULE__RELATION = eINSTANCE.getSubmodule_Relation();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.DomainMetamodelImpl <em>Domain Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.DomainMetamodelImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getDomainMetamodel()
		 * @generated
		 */
		EClass DOMAIN_METAMODEL = eINSTANCE.getDomainMetamodel();
		/**
		 * The meta object literal for the '<em><b>Module</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN_METAMODEL__MODULE = eINSTANCE.getDomainMetamodel_Module();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ActionDispatcherImpl <em>Action Dispatcher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ActionDispatcherImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getActionDispatcher()
		 * @generated
		 */
		EClass ACTION_DISPATCHER = eINSTANCE.getActionDispatcher();
		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_DISPATCHER__USE = eINSTANCE.getActionDispatcher_Use();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_DISPATCHER__NAME = eINSTANCE.getActionDispatcher_Name();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.RouterImpl <em>Router</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.RouterImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRouter()
		 * @generated
		 */
		EClass ROUTER = eINSTANCE.getRouter();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.JSONImpl <em>JSON</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.JSONImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getJSON()
		 * @generated
		 */
		EClass JSON = eINSTANCE.getJSON();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.MDImpl <em>MD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.MDImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getMD()
		 * @generated
		 */
		EClass MD = eINSTANCE.getMD();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.CSSImpl <em>CSS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.CSSImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getCSS()
		 * @generated
		 */
		EClass CSS = eINSTANCE.getCSS();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.APICallImpl <em>API Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.APICallImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getAPICall()
		 * @generated
		 */
		EClass API_CALL = eINSTANCE.getAPICall();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.DirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.DirectoryImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getDirectory()
		 * @generated
		 */
		EClass DIRECTORY = eINSTANCE.getDirectory();
		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTORY__PURPOSE = eINSTANCE.getDirectory_Purpose();
		/**
		 * The meta object literal for the '<em><b>Is Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTORY__IS_ROOT = eINSTANCE.getDirectory_IsRoot();
		/**
		 * The meta object literal for the '<em><b>Directories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORY__DIRECTORIES = eINSTANCE.getDirectory_Directories();
		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORY__FILES = eINSTANCE.getDirectory_Files();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIRECTORY__NAME = eINSTANCE.getDirectory_Name();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.StateImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();
		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTION = eINSTANCE.getState_Action();
		/**
		 * The meta object literal for the '<em><b>Reducer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__REDUCER = eINSTANCE.getState_Reducer();
		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__USE = eINSTANCE.getState_Use();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.UIFrontImpl <em>UI Front</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.UIFrontImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getUIFront()
		 * @generated
		 */
		EClass UI_FRONT = eINSTANCE.getUIFront();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.VisualizerImpl <em>Visualizer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.VisualizerImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getVisualizer()
		 * @generated
		 */
		EClass VISUALIZER = eINSTANCE.getVisualizer();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.DesignImpl <em>Design</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.DesignImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getDesign()
		 * @generated
		 */
		EClass DESIGN = eINSTANCE.getDesign();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ActionCreatorImpl <em>Action Creator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ActionCreatorImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getActionCreator()
		 * @generated
		 */
		EClass ACTION_CREATOR = eINSTANCE.getActionCreator();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CREATOR__NAME = eINSTANCE.getActionCreator_Name();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.RouterComponentImpl <em>Router Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.RouterComponentImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRouterComponent()
		 * @generated
		 */
		EClass ROUTER_COMPONENT = eINSTANCE.getRouterComponent();
		/**
		 * The meta object literal for the '<em><b>Routes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTER_COMPONENT__ROUTES = eINSTANCE.getRouterComponent_Routes();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ContainerImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();
		/**
		 * The meta object literal for the '<em><b>Dispatches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__DISPATCHES = eINSTANCE.getContainer_Dispatches();
		/**
		 * The meta object literal for the '<em><b>Maps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__MAPS = eINSTANCE.getContainer_Maps();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ServicesFrontImpl <em>Services Front</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ServicesFrontImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getServicesFront()
		 * @generated
		 */
		EClass SERVICES_FRONT = eINSTANCE.getServicesFront();
		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES_FRONT__USE = eINSTANCE.getServicesFront_Use();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICES_FRONT__NAME = eINSTANCE.getServicesFront_Name();
		/**
		 * The meta object literal for the '<em><b>Is Organized In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICES_FRONT__IS_ORGANIZED_IN = eINSTANCE.getServicesFront_IsOrganizedIn();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.FunctionalityImpl <em>Functionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.FunctionalityImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getFunctionality()
		 * @generated
		 */
		EClass FUNCTIONALITY = eINSTANCE.getFunctionality();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONALITY__NAME = eINSTANCE.getFunctionality_Name();
		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__COMPONENTS = eINSTANCE.getFunctionality_Components();
		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__STATE = eINSTANCE.getFunctionality_State();
		/**
		 * The meta object literal for the '<em><b>Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__SERVICES = eINSTANCE.getFunctionality_Services();
		/**
		 * The meta object literal for the '<em><b>Is Organized By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONALITY__IS_ORGANIZED_BY = eINSTANCE.getFunctionality_IsOrganizedBy();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.JSImpl <em>JS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.JSImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getJS()
		 * @generated
		 */
		EClass JS = eINSTANCE.getJS();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ActionImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();
		/**
		 * The meta object literal for the '<em><b>Actiondispatcher</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTIONDISPATCHER = eINSTANCE.getAction_Actiondispatcher();
		/**
		 * The meta object literal for the '<em><b>Actioncreator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTIONCREATOR = eINSTANCE.getAction_Actioncreator();
		/**
		 * The meta object literal for the '<em><b>Action Directory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTION_DIRECTORY = eINSTANCE.getAction_ActionDirectory();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ReduxImpl <em>Redux</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ReduxImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getRedux()
		 * @generated
		 */
		EClass REDUX = eINSTANCE.getRedux();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.FileImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__TYPE = eINSTANCE.getFile_Type();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__NAME = eINSTANCE.getFile_Name();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ComponentFrontImpl <em>Component Front</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ComponentFrontImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getComponentFront()
		 * @generated
		 */
		EClass COMPONENT_FRONT = eINSTANCE.getComponentFront();
		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_FRONT__USE = eINSTANCE.getComponentFront_Use();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_FRONT__NAME = eINSTANCE.getComponentFront_Name();
		/**
		 * The meta object literal for the '<em><b>In Within</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_FRONT__IN_WITHIN = eINSTANCE.getComponentFront_InWithin();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ReducerImpl <em>Reducer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ReducerImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getReducer()
		 * @generated
		 */
		EClass REDUCER = eINSTANCE.getReducer();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REDUCER__NAME = eINSTANCE.getReducer_Name();
		/**
		 * The meta object literal for the '<em><b>Catches</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCER__CATCHES = eINSTANCE.getReducer_Catches();
		/**
		 * The meta object literal for the '<em><b>Reducer Directory</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REDUCER__REDUCER_DIRECTORY = eINSTANCE.getReducer_ReducerDirectory();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.ModuleFrontImpl <em>Module Front</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.ModuleFrontImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getModuleFront()
		 * @generated
		 */
		EClass MODULE_FRONT = eINSTANCE.getModuleFront();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_FRONT__NAME = eINSTANCE.getModuleFront_Name();
		/**
		 * The meta object literal for the '<em><b>Is Present In</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODULE_FRONT__IS_PRESENT_IN = eINSTANCE.getModuleFront_IsPresentIn();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.TechnologyMetamodelImpl <em>Technology Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.TechnologyMetamodelImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getTechnologyMetamodel()
		 * @generated
		 */
		EClass TECHNOLOGY_METAMODEL = eINSTANCE.getTechnologyMetamodel();
		/**
		 * The meta object literal for the '<em><b>Techfront</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_METAMODEL__TECHFRONT = eINSTANCE.getTechnologyMetamodel_Techfront();
		/**
		 * The meta object literal for the '<em><b>Techback</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY_METAMODEL__TECHBACK = eINSTANCE.getTechnologyMetamodel_Techback();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.TechFrontImpl <em>Tech Front</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.TechFrontImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getTechFront()
		 * @generated
		 */
		EClass TECH_FRONT = eINSTANCE.getTechFront();
		/**
		 * The meta object literal for the '<em><b>Functionalities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_FRONT__FUNCTIONALITIES = eINSTANCE.getTechFront_Functionalities();
		/**
		 * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_FRONT__MODULES = eINSTANCE.getTechFront_Modules();
		/**
		 * The meta object literal for the '<em><b>Directories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_FRONT__DIRECTORIES = eINSTANCE.getTechFront_Directories();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.TechBackImpl <em>Tech Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.TechBackImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getTechBack()
		 * @generated
		 */
		EClass TECH_BACK = eINSTANCE.getTechBack();
		/**
		 * The meta object literal for the '<em><b>Jee project</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECH_BACK__JEE_PROJECT = eINSTANCE.getTechBack_Jee_project();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.JEE_ProjectImpl <em>JEE Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.JEE_ProjectImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getJEE_Project()
		 * @generated
		 */
		EClass JEE_PROJECT = eINSTANCE.getJEE_Project();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JEE_PROJECT__NAME = eINSTANCE.getJEE_Project_Name();
		/**
		 * The meta object literal for the '<em><b>Subproject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JEE_PROJECT__SUBPROJECT = eINSTANCE.getJEE_Project_Subproject();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.NativeClassImpl <em>Native Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.NativeClassImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getNativeClass()
		 * @generated
		 */
		EClass NATIVE_CLASS = eINSTANCE.getNativeClass();
		/**
		 * The meta object literal for the '<em><b>Primitive Ref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_CLASS__PRIMITIVE_REF = eINSTANCE.getNativeClass_PrimitiveRef();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.InterfaceClassImpl <em>Interface Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.InterfaceClassImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getInterfaceClass()
		 * @generated
		 */
		EClass INTERFACE_CLASS = eINSTANCE.getInterfaceClass();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.LibraryImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__NAME = eINSTANCE.getLibrary_Name();
		/**
		 * The meta object literal for the '<em><b>Is Native</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIBRARY__IS_NATIVE = eINSTANCE.getLibrary_IsNative();
		/**
		 * The meta object literal for the '<em><b>Nativeclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__NATIVECLASS = eINSTANCE.getLibrary_Nativeclass();
		/**
		 * The meta object literal for the '<em><b>Anotationi</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__ANOTATIONI = eINSTANCE.getLibrary_Anotationi();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.JeeImpl <em>Jee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.JeeImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getJee()
		 * @generated
		 */
		EClass JEE = eINSTANCE.getJee();
		/**
		 * The meta object literal for the '<em><b>Jee project</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JEE__JEE_PROJECT = eINSTANCE.getJee_Jee_project();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.AttributeImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();
		/**
		 * The meta object literal for the '<em><b>Anotationi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ANOTATIONI = eINSTANCE.getAttribute_Anotationi();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.GenericClassImpl <em>Generic Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.GenericClassImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getGenericClass()
		 * @generated
		 */
		EClass GENERIC_CLASS = eINSTANCE.getGenericClass();
		/**
		 * The meta object literal for the '<em><b>Implement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CLASS__IMPLEMENT = eINSTANCE.getGenericClass_Implement();
		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_CLASS__EXTENDS = eINSTANCE.getGenericClass_Extends();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.MethodBackImpl <em>Method Back</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.MethodBackImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getMethodBack()
		 * @generated
		 */
		EClass METHOD_BACK = eINSTANCE.getMethodBack();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD_BACK__NAME = eINSTANCE.getMethodBack_Name();
		/**
		 * The meta object literal for the '<em><b>Anotationi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_BACK__ANOTATIONI = eINSTANCE.getMethodBack_Anotationi();
		/**
		 * The meta object literal for the '<em><b>Return</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_BACK__RETURN = eINSTANCE.getMethodBack_Return();
		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD_BACK__ARGUMENTS = eINSTANCE.getMethodBack_Arguments();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.AbstractClassImpl <em>Abstract Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.AbstractClassImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getAbstractClass()
		 * @generated
		 */
		EClass ABSTRACT_CLASS = eINSTANCE.getAbstractClass();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.EpackageImpl <em>Epackage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.EpackageImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getEpackage()
		 * @generated
		 */
		EClass EPACKAGE = eINSTANCE.getEpackage();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EPACKAGE__NAME = eINSTANCE.getEpackage_Name();
		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EPACKAGE__CLASS = eINSTANCE.getEpackage_Class();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.EClassImpl <em>EClass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.EClassImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getEClass()
		 * @generated
		 */
		EClass ECLASS = eINSTANCE.getEClass();
		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ATTRIBUTE = eINSTANCE.getEClass_Attribute();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECLASS__NAME = eINSTANCE.getEClass_Name();
		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__METHOD = eINSTANCE.getEClass_Method();
		/**
		 * The meta object literal for the '<em><b>Anotationi</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECLASS__ANOTATIONI = eINSTANCE.getEClass_Anotationi();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.AnotationiImpl <em>Anotationi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.AnotationiImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getAnotationi()
		 * @generated
		 */
		EClass ANOTATIONI = eINSTANCE.getAnotationi();
		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANOTATIONI__PROPERTIES = eINSTANCE.getAnotationi_Properties();
		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANOTATIONI__DESCRIPTOR = eINSTANCE.getAnotationi_Descriptor();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.SubprojectImpl <em>Subproject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.SubprojectImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getSubproject()
		 * @generated
		 */
		EClass SUBPROJECT = eINSTANCE.getSubproject();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBPROJECT__NAME = eINSTANCE.getSubproject_Name();
		/**
		 * The meta object literal for the '<em><b>Descriptor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROJECT__DESCRIPTOR = eINSTANCE.getSubproject_Descriptor();
		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROJECT__PACKAGE = eINSTANCE.getSubproject_Package();
		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROJECT__LIBRARY = eINSTANCE.getSubproject_Library();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.DescriptorImpl <em>Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.DescriptorImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getDescriptor()
		 * @generated
		 */
		EClass DESCRIPTOR = eINSTANCE.getDescriptor();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__NAME = eINSTANCE.getDescriptor_Name();
		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTOR__PATH = eINSTANCE.getDescriptor_Path();
		/**
		 * The meta object literal for the '{@link UnifiedMetamodel_.impl.JavaScriptImpl <em>Java Script</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see UnifiedMetamodel_.impl.JavaScriptImpl
		 * @see UnifiedMetamodel_.impl.UnifiedMetamodel_PackageImpl#getJavaScript()
		 * @generated
		 */
		EClass JAVA_SCRIPT = eINSTANCE.getJavaScript();

	}

} //UnifiedMetamodel_Package
