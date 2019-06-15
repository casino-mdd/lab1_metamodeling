/**
 */
package UnifiedMetamodel_.util;

import UnifiedMetamodel_.APICall;
import UnifiedMetamodel_.AbstractClass;
import UnifiedMetamodel_.Action;
import UnifiedMetamodel_.ActionCreator;
import UnifiedMetamodel_.ActionDispatcher;
import UnifiedMetamodel_.Anotationi;
import UnifiedMetamodel_.ArquitectureMetamodel;
import UnifiedMetamodel_.Attribute;
import UnifiedMetamodel_.CSS;
import UnifiedMetamodel_.Component;
import UnifiedMetamodel_.ComponentFront;
import UnifiedMetamodel_.Composition;
import UnifiedMetamodel_.Container;
import UnifiedMetamodel_.Containers;
import UnifiedMetamodel_.Create;
import UnifiedMetamodel_.Descriptor;
import UnifiedMetamodel_.Design;
import UnifiedMetamodel_.Directory;
import UnifiedMetamodel_.DomainMetamodel;
import UnifiedMetamodel_.Dto;
import UnifiedMetamodel_.EClass;
import UnifiedMetamodel_.Ejb;
import UnifiedMetamodel_.Entity;
import UnifiedMetamodel_.Epackage;
import UnifiedMetamodel_.Exchange;
import UnifiedMetamodel_.Facade;
import UnifiedMetamodel_.File;
import UnifiedMetamodel_.Functionality;
import UnifiedMetamodel_.GeneralEntity;
import UnifiedMetamodel_.GenericClass;
import UnifiedMetamodel_.InterfaceClass;
import UnifiedMetamodel_.JEE_Project;
import UnifiedMetamodel_.JS;
import UnifiedMetamodel_.JSON;
import UnifiedMetamodel_.JavaScript;
import UnifiedMetamodel_.Jee;
import UnifiedMetamodel_.Layer;
import UnifiedMetamodel_.LayerSegment;
import UnifiedMetamodel_.Library;
import UnifiedMetamodel_.Login;
import UnifiedMetamodel_.MD;
import UnifiedMetamodel_.Metamodel;
import UnifiedMetamodel_.MethodBack;
import UnifiedMetamodel_.ModuleFront;
import UnifiedMetamodel_.NativeClass;
import UnifiedMetamodel_.Operations;
import UnifiedMetamodel_.Pojo;
import UnifiedMetamodel_.Read;
import UnifiedMetamodel_.Reducer;
import UnifiedMetamodel_.Redux;
import UnifiedMetamodel_.RelationArch;
import UnifiedMetamodel_.RelationDom;
import UnifiedMetamodel_.RestEntity;
import UnifiedMetamodel_.Router;
import UnifiedMetamodel_.RouterComponent;
import UnifiedMetamodel_.Sale;
import UnifiedMetamodel_.Services;
import UnifiedMetamodel_.ServicesFront;
import UnifiedMetamodel_.SpecialEntity;
import UnifiedMetamodel_.State;
import UnifiedMetamodel_.Store;
import UnifiedMetamodel_.Submodule;
import UnifiedMetamodel_.Subproject;
import UnifiedMetamodel_.TechBack;
import UnifiedMetamodel_.TechFront;
import UnifiedMetamodel_.TechnologyMetamodel;
import UnifiedMetamodel_.Transaction;
import UnifiedMetamodel_.UI;
import UnifiedMetamodel_.UIFront;
import UnifiedMetamodel_.UnifiedMetamodel_Package;
import UnifiedMetamodel_.Visualizer;
import UnifiedMetamodel_.War;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package
 * @generated
 */
public class UnifiedMetamodel_AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UnifiedMetamodel_Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnifiedMetamodel_AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UnifiedMetamodel_Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnifiedMetamodel_Switch<Adapter> modelSwitch =
		new UnifiedMetamodel_Switch<Adapter>() {
			@Override
			public Adapter caseEjb(Ejb object) {
				return createEjbAdapter();
			}
			@Override
			public Adapter caseLayerSegment(LayerSegment object) {
				return createLayerSegmentAdapter();
			}
			@Override
			public Adapter caseDto(Dto object) {
				return createDtoAdapter();
			}
			@Override
			public Adapter caseStore(Store object) {
				return createStoreAdapter();
			}
			@Override
			public Adapter caseUI(UI object) {
				return createUIAdapter();
			}
			@Override
			public Adapter caseLayer(Layer object) {
				return createLayerAdapter();
			}
			@Override
			public Adapter caseRestEntity(RestEntity object) {
				return createRestEntityAdapter();
			}
			@Override
			public Adapter caseFacade(Facade object) {
				return createFacadeAdapter();
			}
			@Override
			public Adapter caseWar(War object) {
				return createWarAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseRelationArch(RelationArch object) {
				return createRelationArchAdapter();
			}
			@Override
			public Adapter caseArquitectureMetamodel(ArquitectureMetamodel object) {
				return createArquitectureMetamodelAdapter();
			}
			@Override
			public Adapter caseContainers(Containers object) {
				return createContainersAdapter();
			}
			@Override
			public Adapter casePojo(Pojo object) {
				return createPojoAdapter();
			}
			@Override
			public Adapter caseServices(Services object) {
				return createServicesAdapter();
			}
			@Override
			public Adapter caseMetamodel(Metamodel object) {
				return createMetamodelAdapter();
			}
			@Override
			public Adapter caseRead(Read object) {
				return createReadAdapter();
			}
			@Override
			public Adapter caseCreate(Create object) {
				return createCreateAdapter();
			}
			@Override
			public Adapter caseSale(Sale object) {
				return createSaleAdapter();
			}
			@Override
			public Adapter caseExchange(Exchange object) {
				return createExchangeAdapter();
			}
			@Override
			public Adapter caseComposition(Composition object) {
				return createCompositionAdapter();
			}
			@Override
			public Adapter caseOperations(Operations object) {
				return createOperationsAdapter();
			}
			@Override
			public Adapter caseLogin(Login object) {
				return createLoginAdapter();
			}
			@Override
			public Adapter caseModule(UnifiedMetamodel_.Module object) {
				return createModuleAdapter();
			}
			@Override
			public Adapter caseSpecialEntity(SpecialEntity object) {
				return createSpecialEntityAdapter();
			}
			@Override
			public Adapter caseGeneralEntity(GeneralEntity object) {
				return createGeneralEntityAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseRelationDom(RelationDom object) {
				return createRelationDomAdapter();
			}
			@Override
			public Adapter caseTransaction(Transaction object) {
				return createTransactionAdapter();
			}
			@Override
			public Adapter caseSubmodule(Submodule object) {
				return createSubmoduleAdapter();
			}
			@Override
			public Adapter caseDomainMetamodel(DomainMetamodel object) {
				return createDomainMetamodelAdapter();
			}
			@Override
			public Adapter caseActionDispatcher(ActionDispatcher object) {
				return createActionDispatcherAdapter();
			}
			@Override
			public Adapter caseRouter(Router object) {
				return createRouterAdapter();
			}
			@Override
			public Adapter caseJSON(JSON object) {
				return createJSONAdapter();
			}
			@Override
			public Adapter caseMD(MD object) {
				return createMDAdapter();
			}
			@Override
			public Adapter caseCSS(CSS object) {
				return createCSSAdapter();
			}
			@Override
			public Adapter caseAPICall(APICall object) {
				return createAPICallAdapter();
			}
			@Override
			public Adapter caseDirectory(Directory object) {
				return createDirectoryAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseUIFront(UIFront object) {
				return createUIFrontAdapter();
			}
			@Override
			public Adapter caseVisualizer(Visualizer object) {
				return createVisualizerAdapter();
			}
			@Override
			public Adapter caseDesign(Design object) {
				return createDesignAdapter();
			}
			@Override
			public Adapter caseActionCreator(ActionCreator object) {
				return createActionCreatorAdapter();
			}
			@Override
			public Adapter caseRouterComponent(RouterComponent object) {
				return createRouterComponentAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseServicesFront(ServicesFront object) {
				return createServicesFrontAdapter();
			}
			@Override
			public Adapter caseFunctionality(Functionality object) {
				return createFunctionalityAdapter();
			}
			@Override
			public Adapter caseJS(JS object) {
				return createJSAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseRedux(Redux object) {
				return createReduxAdapter();
			}
			@Override
			public Adapter caseTechFront(TechFront object) {
				return createTechFrontAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter caseComponentFront(ComponentFront object) {
				return createComponentFrontAdapter();
			}
			@Override
			public Adapter caseReducer(Reducer object) {
				return createReducerAdapter();
			}
			@Override
			public Adapter caseModuleFront(ModuleFront object) {
				return createModuleFrontAdapter();
			}
			@Override
			public Adapter caseTechnologyMetamodel(TechnologyMetamodel object) {
				return createTechnologyMetamodelAdapter();
			}
			@Override
			public Adapter caseTechBack(TechBack object) {
				return createTechBackAdapter();
			}
			@Override
			public Adapter caseJEE_Project(JEE_Project object) {
				return createJEE_ProjectAdapter();
			}
			@Override
			public Adapter caseNativeClass(NativeClass object) {
				return createNativeClassAdapter();
			}
			@Override
			public Adapter caseInterfaceClass(InterfaceClass object) {
				return createInterfaceClassAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter caseJee(Jee object) {
				return createJeeAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseGenericClass(GenericClass object) {
				return createGenericClassAdapter();
			}
			@Override
			public Adapter caseMethodBack(MethodBack object) {
				return createMethodBackAdapter();
			}
			@Override
			public Adapter caseAbstractClass(AbstractClass object) {
				return createAbstractClassAdapter();
			}
			@Override
			public Adapter caseEpackage(Epackage object) {
				return createEpackageAdapter();
			}
			@Override
			public Adapter caseEClass(EClass object) {
				return createEClassAdapter();
			}
			@Override
			public Adapter caseAnotationi(Anotationi object) {
				return createAnotationiAdapter();
			}
			@Override
			public Adapter caseSubproject(Subproject object) {
				return createSubprojectAdapter();
			}
			@Override
			public Adapter caseDescriptor(Descriptor object) {
				return createDescriptorAdapter();
			}
			@Override
			public Adapter caseJavaScript(JavaScript object) {
				return createJavaScriptAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Ejb <em>Ejb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Ejb
	 * @generated
	 */
	public Adapter createEjbAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.LayerSegment <em>Layer Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.LayerSegment
	 * @generated
	 */
	public Adapter createLayerSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Dto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Dto
	 * @generated
	 */
	public Adapter createDtoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.UI <em>UI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.UI
	 * @generated
	 */
	public Adapter createUIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.RestEntity <em>Rest Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.RestEntity
	 * @generated
	 */
	public Adapter createRestEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Facade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Facade
	 * @generated
	 */
	public Adapter createFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.War <em>War</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.War
	 * @generated
	 */
	public Adapter createWarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.RelationArch <em>Relation Arch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.RelationArch
	 * @generated
	 */
	public Adapter createRelationArchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.ArquitectureMetamodel <em>Arquitecture Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.ArquitectureMetamodel
	 * @generated
	 */
	public Adapter createArquitectureMetamodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Containers <em>Containers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Containers
	 * @generated
	 */
	public Adapter createContainersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Pojo <em>Pojo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Pojo
	 * @generated
	 */
	public Adapter createPojoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Services <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Services
	 * @generated
	 */
	public Adapter createServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Metamodel
	 * @generated
	 */
	public Adapter createMetamodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Read <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Read
	 * @generated
	 */
	public Adapter createReadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Create <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Create
	 * @generated
	 */
	public Adapter createCreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Sale <em>Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Sale
	 * @generated
	 */
	public Adapter createSaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Exchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Exchange
	 * @generated
	 */
	public Adapter createExchangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Composition
	 * @generated
	 */
	public Adapter createCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Operations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Operations
	 * @generated
	 */
	public Adapter createOperationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Login <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Login
	 * @generated
	 */
	public Adapter createLoginAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.SpecialEntity <em>Special Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.SpecialEntity
	 * @generated
	 */
	public Adapter createSpecialEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.GeneralEntity <em>General Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.GeneralEntity
	 * @generated
	 */
	public Adapter createGeneralEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.RelationDom <em>Relation Dom</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.RelationDom
	 * @generated
	 */
	public Adapter createRelationDomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Transaction
	 * @generated
	 */
	public Adapter createTransactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Submodule <em>Submodule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Submodule
	 * @generated
	 */
	public Adapter createSubmoduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.DomainMetamodel <em>Domain Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.DomainMetamodel
	 * @generated
	 */
	public Adapter createDomainMetamodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.ActionDispatcher <em>Action Dispatcher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.ActionDispatcher
	 * @generated
	 */
	public Adapter createActionDispatcherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Router <em>Router</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Router
	 * @generated
	 */
	public Adapter createRouterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.JSON <em>JSON</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.JSON
	 * @generated
	 */
	public Adapter createJSONAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.MD <em>MD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.MD
	 * @generated
	 */
	public Adapter createMDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.CSS <em>CSS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.CSS
	 * @generated
	 */
	public Adapter createCSSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.APICall <em>API Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.APICall
	 * @generated
	 */
	public Adapter createAPICallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Directory
	 * @generated
	 */
	public Adapter createDirectoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.UIFront <em>UI Front</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.UIFront
	 * @generated
	 */
	public Adapter createUIFrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Visualizer <em>Visualizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Visualizer
	 * @generated
	 */
	public Adapter createVisualizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Design <em>Design</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Design
	 * @generated
	 */
	public Adapter createDesignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.ActionCreator <em>Action Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.ActionCreator
	 * @generated
	 */
	public Adapter createActionCreatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.RouterComponent <em>Router Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.RouterComponent
	 * @generated
	 */
	public Adapter createRouterComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.ServicesFront <em>Services Front</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.ServicesFront
	 * @generated
	 */
	public Adapter createServicesFrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Functionality <em>Functionality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Functionality
	 * @generated
	 */
	public Adapter createFunctionalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.JS <em>JS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.JS
	 * @generated
	 */
	public Adapter createJSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Redux <em>Redux</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Redux
	 * @generated
	 */
	public Adapter createReduxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.ComponentFront <em>Component Front</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.ComponentFront
	 * @generated
	 */
	public Adapter createComponentFrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Reducer <em>Reducer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Reducer
	 * @generated
	 */
	public Adapter createReducerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.ModuleFront <em>Module Front</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.ModuleFront
	 * @generated
	 */
	public Adapter createModuleFrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.TechnologyMetamodel <em>Technology Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.TechnologyMetamodel
	 * @generated
	 */
	public Adapter createTechnologyMetamodelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.TechFront <em>Tech Front</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.TechFront
	 * @generated
	 */
	public Adapter createTechFrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.TechBack <em>Tech Back</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.TechBack
	 * @generated
	 */
	public Adapter createTechBackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.JEE_Project <em>JEE Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.JEE_Project
	 * @generated
	 */
	public Adapter createJEE_ProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.NativeClass <em>Native Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.NativeClass
	 * @generated
	 */
	public Adapter createNativeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.InterfaceClass <em>Interface Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.InterfaceClass
	 * @generated
	 */
	public Adapter createInterfaceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Jee <em>Jee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Jee
	 * @generated
	 */
	public Adapter createJeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.GenericClass <em>Generic Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.GenericClass
	 * @generated
	 */
	public Adapter createGenericClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.MethodBack <em>Method Back</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.MethodBack
	 * @generated
	 */
	public Adapter createMethodBackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.AbstractClass <em>Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.AbstractClass
	 * @generated
	 */
	public Adapter createAbstractClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Epackage <em>Epackage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Epackage
	 * @generated
	 */
	public Adapter createEpackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.EClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.EClass
	 * @generated
	 */
	public Adapter createEClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Anotationi <em>Anotationi</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Anotationi
	 * @generated
	 */
	public Adapter createAnotationiAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Subproject <em>Subproject</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Subproject
	 * @generated
	 */
	public Adapter createSubprojectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.Descriptor
	 * @generated
	 */
	public Adapter createDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link UnifiedMetamodel_.JavaScript <em>Java Script</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see UnifiedMetamodel_.JavaScript
	 * @generated
	 */
	public Adapter createJavaScriptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UnifiedMetamodel_AdapterFactory
