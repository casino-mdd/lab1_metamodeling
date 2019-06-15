/**
 */
package UnifiedMetamodel_.impl;

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
import UnifiedMetamodel_.Containers;
import UnifiedMetamodel_.Create;
import UnifiedMetamodel_.Descriptor;
import UnifiedMetamodel_.Design;
import UnifiedMetamodel_.Directory;
import UnifiedMetamodel_.DomainMetamodel;
import UnifiedMetamodel_.Dto;
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
import UnifiedMetamodel_.UnifiedMetamodel_Factory;
import UnifiedMetamodel_.UnifiedMetamodel_Package;
import UnifiedMetamodel_.Visualizer;
import UnifiedMetamodel_.War;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnifiedMetamodel_FactoryImpl extends EFactoryImpl implements UnifiedMetamodel_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnifiedMetamodel_Factory init() {
		try {
			UnifiedMetamodel_Factory theUnifiedMetamodel_Factory = (UnifiedMetamodel_Factory)EPackage.Registry.INSTANCE.getEFactory(UnifiedMetamodel_Package.eNS_URI);
			if (theUnifiedMetamodel_Factory != null) {
				return theUnifiedMetamodel_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnifiedMetamodel_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnifiedMetamodel_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UnifiedMetamodel_Package.EJB: return createEjb();
			case UnifiedMetamodel_Package.LAYER_SEGMENT: return createLayerSegment();
			case UnifiedMetamodel_Package.DTO: return createDto();
			case UnifiedMetamodel_Package.STORE: return createStore();
			case UnifiedMetamodel_Package.UI: return createUI();
			case UnifiedMetamodel_Package.LAYER: return createLayer();
			case UnifiedMetamodel_Package.REST_ENTITY: return createRestEntity();
			case UnifiedMetamodel_Package.FACADE: return createFacade();
			case UnifiedMetamodel_Package.WAR: return createWar();
			case UnifiedMetamodel_Package.COMPONENT: return createComponent();
			case UnifiedMetamodel_Package.RELATION_ARCH: return createRelationArch();
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL: return createArquitectureMetamodel();
			case UnifiedMetamodel_Package.CONTAINERS: return createContainers();
			case UnifiedMetamodel_Package.POJO: return createPojo();
			case UnifiedMetamodel_Package.SERVICES: return createServices();
			case UnifiedMetamodel_Package.METAMODEL: return createMetamodel();
			case UnifiedMetamodel_Package.READ: return createRead();
			case UnifiedMetamodel_Package.CREATE: return createCreate();
			case UnifiedMetamodel_Package.SALE: return createSale();
			case UnifiedMetamodel_Package.EXCHANGE: return createExchange();
			case UnifiedMetamodel_Package.COMPOSITION: return createComposition();
			case UnifiedMetamodel_Package.OPERATIONS: return createOperations();
			case UnifiedMetamodel_Package.LOGIN: return createLogin();
			case UnifiedMetamodel_Package.MODULE: return createModule();
			case UnifiedMetamodel_Package.SPECIAL_ENTITY: return createSpecialEntity();
			case UnifiedMetamodel_Package.GENERAL_ENTITY: return createGeneralEntity();
			case UnifiedMetamodel_Package.ENTITY: return createEntity();
			case UnifiedMetamodel_Package.RELATION_DOM: return createRelationDom();
			case UnifiedMetamodel_Package.TRANSACTION: return createTransaction();
			case UnifiedMetamodel_Package.SUBMODULE: return createSubmodule();
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL: return createDomainMetamodel();
			case UnifiedMetamodel_Package.ACTION_DISPATCHER: return createActionDispatcher();
			case UnifiedMetamodel_Package.ROUTER: return createRouter();
			case UnifiedMetamodel_Package.JSON: return createJSON();
			case UnifiedMetamodel_Package.MD: return createMD();
			case UnifiedMetamodel_Package.CSS: return createCSS();
			case UnifiedMetamodel_Package.API_CALL: return createAPICall();
			case UnifiedMetamodel_Package.DIRECTORY: return createDirectory();
			case UnifiedMetamodel_Package.STATE: return createState();
			case UnifiedMetamodel_Package.UI_FRONT: return createUIFront();
			case UnifiedMetamodel_Package.VISUALIZER: return createVisualizer();
			case UnifiedMetamodel_Package.DESIGN: return createDesign();
			case UnifiedMetamodel_Package.ACTION_CREATOR: return createActionCreator();
			case UnifiedMetamodel_Package.ROUTER_COMPONENT: return createRouterComponent();
			case UnifiedMetamodel_Package.CONTAINER: return createContainer();
			case UnifiedMetamodel_Package.SERVICES_FRONT: return createServicesFront();
			case UnifiedMetamodel_Package.FUNCTIONALITY: return createFunctionality();
			case UnifiedMetamodel_Package.JS: return createJS();
			case UnifiedMetamodel_Package.ACTION: return createAction();
			case UnifiedMetamodel_Package.REDUX: return createRedux();
			case UnifiedMetamodel_Package.TECH_FRONT: return createTechFront();
			case UnifiedMetamodel_Package.FILE: return createFile();
			case UnifiedMetamodel_Package.COMPONENT_FRONT: return createComponentFront();
			case UnifiedMetamodel_Package.REDUCER: return createReducer();
			case UnifiedMetamodel_Package.MODULE_FRONT: return createModuleFront();
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL: return createTechnologyMetamodel();
			case UnifiedMetamodel_Package.TECH_BACK: return createTechBack();
			case UnifiedMetamodel_Package.JEE_PROJECT: return createJEE_Project();
			case UnifiedMetamodel_Package.NATIVE_CLASS: return createNativeClass();
			case UnifiedMetamodel_Package.INTERFACE_CLASS: return createInterfaceClass();
			case UnifiedMetamodel_Package.LIBRARY: return createLibrary();
			case UnifiedMetamodel_Package.JEE: return createJee();
			case UnifiedMetamodel_Package.ATTRIBUTE: return createAttribute();
			case UnifiedMetamodel_Package.GENERIC_CLASS: return createGenericClass();
			case UnifiedMetamodel_Package.METHOD_BACK: return createMethodBack();
			case UnifiedMetamodel_Package.ABSTRACT_CLASS: return createAbstractClass();
			case UnifiedMetamodel_Package.EPACKAGE: return createEpackage();
			case UnifiedMetamodel_Package.ECLASS: return createEClass();
			case UnifiedMetamodel_Package.ANOTATIONI: return createAnotationi();
			case UnifiedMetamodel_Package.SUBPROJECT: return createSubproject();
			case UnifiedMetamodel_Package.DESCRIPTOR: return createDescriptor();
			case UnifiedMetamodel_Package.JAVA_SCRIPT: return createJavaScript();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ejb createEjb() {
		EjbImpl ejb = new EjbImpl();
		return ejb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayerSegment createLayerSegment() {
		LayerSegmentImpl layerSegment = new LayerSegmentImpl();
		return layerSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dto createDto() {
		DtoImpl dto = new DtoImpl();
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UI createUI() {
		UIImpl ui = new UIImpl();
		return ui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layer createLayer() {
		LayerImpl layer = new LayerImpl();
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RestEntity createRestEntity() {
		RestEntityImpl restEntity = new RestEntityImpl();
		return restEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Facade createFacade() {
		FacadeImpl facade = new FacadeImpl();
		return facade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public War createWar() {
		WarImpl war = new WarImpl();
		return war;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationArch createRelationArch() {
		RelationArchImpl relationArch = new RelationArchImpl();
		return relationArch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArquitectureMetamodel createArquitectureMetamodel() {
		ArquitectureMetamodelImpl arquitectureMetamodel = new ArquitectureMetamodelImpl();
		return arquitectureMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Containers createContainers() {
		ContainersImpl containers = new ContainersImpl();
		return containers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pojo createPojo() {
		PojoImpl pojo = new PojoImpl();
		return pojo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Services createServices() {
		ServicesImpl services = new ServicesImpl();
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metamodel createMetamodel() {
		MetamodelImpl metamodel = new MetamodelImpl();
		return metamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Read createRead() {
		ReadImpl read = new ReadImpl();
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Create createCreate() {
		CreateImpl create = new CreateImpl();
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sale createSale() {
		SaleImpl sale = new SaleImpl();
		return sale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exchange createExchange() {
		ExchangeImpl exchange = new ExchangeImpl();
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Composition createComposition() {
		CompositionImpl composition = new CompositionImpl();
		return composition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operations createOperations() {
		OperationsImpl operations = new OperationsImpl();
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Login createLogin() {
		LoginImpl login = new LoginImpl();
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnifiedMetamodel_.Module createModule() {
		ModuleImpl module = new ModuleImpl();
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SpecialEntity createSpecialEntity() {
		SpecialEntityImpl specialEntity = new SpecialEntityImpl();
		return specialEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GeneralEntity createGeneralEntity() {
		GeneralEntityImpl generalEntity = new GeneralEntityImpl();
		return generalEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelationDom createRelationDom() {
		RelationDomImpl relationDom = new RelationDomImpl();
		return relationDom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Submodule createSubmodule() {
		SubmoduleImpl submodule = new SubmoduleImpl();
		return submodule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainMetamodel createDomainMetamodel() {
		DomainMetamodelImpl domainMetamodel = new DomainMetamodelImpl();
		return domainMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionDispatcher createActionDispatcher() {
		ActionDispatcherImpl actionDispatcher = new ActionDispatcherImpl();
		return actionDispatcher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Router createRouter() {
		RouterImpl router = new RouterImpl();
		return router;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSON createJSON() {
		JSONImpl json = new JSONImpl();
		return json;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MD createMD() {
		MDImpl md = new MDImpl();
		return md;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CSS createCSS() {
		CSSImpl css = new CSSImpl();
		return css;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public APICall createAPICall() {
		APICallImpl apiCall = new APICallImpl();
		return apiCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directory createDirectory() {
		DirectoryImpl directory = new DirectoryImpl();
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UIFront createUIFront() {
		UIFrontImpl uiFront = new UIFrontImpl();
		return uiFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Visualizer createVisualizer() {
		VisualizerImpl visualizer = new VisualizerImpl();
		return visualizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Design createDesign() {
		DesignImpl design = new DesignImpl();
		return design;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionCreator createActionCreator() {
		ActionCreatorImpl actionCreator = new ActionCreatorImpl();
		return actionCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RouterComponent createRouterComponent() {
		RouterComponentImpl routerComponent = new RouterComponentImpl();
		return routerComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnifiedMetamodel_.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicesFront createServicesFront() {
		ServicesFrontImpl servicesFront = new ServicesFrontImpl();
		return servicesFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Functionality createFunctionality() {
		FunctionalityImpl functionality = new FunctionalityImpl();
		return functionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JS createJS() {
		JSImpl js = new JSImpl();
		return js;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Redux createRedux() {
		ReduxImpl redux = new ReduxImpl();
		return redux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentFront createComponentFront() {
		ComponentFrontImpl componentFront = new ComponentFrontImpl();
		return componentFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reducer createReducer() {
		ReducerImpl reducer = new ReducerImpl();
		return reducer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleFront createModuleFront() {
		ModuleFrontImpl moduleFront = new ModuleFrontImpl();
		return moduleFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechnologyMetamodel createTechnologyMetamodel() {
		TechnologyMetamodelImpl technologyMetamodel = new TechnologyMetamodelImpl();
		return technologyMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechFront createTechFront() {
		TechFrontImpl techFront = new TechFrontImpl();
		return techFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TechBack createTechBack() {
		TechBackImpl techBack = new TechBackImpl();
		return techBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JEE_Project createJEE_Project() {
		JEE_ProjectImpl jeE_Project = new JEE_ProjectImpl();
		return jeE_Project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NativeClass createNativeClass() {
		NativeClassImpl nativeClass = new NativeClassImpl();
		return nativeClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterfaceClass createInterfaceClass() {
		InterfaceClassImpl interfaceClass = new InterfaceClassImpl();
		return interfaceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Jee createJee() {
		JeeImpl jee = new JeeImpl();
		return jee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenericClass createGenericClass() {
		GenericClassImpl genericClass = new GenericClassImpl();
		return genericClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MethodBack createMethodBack() {
		MethodBackImpl methodBack = new MethodBackImpl();
		return methodBack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AbstractClass createAbstractClass() {
		AbstractClassImpl abstractClass = new AbstractClassImpl();
		return abstractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Epackage createEpackage() {
		EpackageImpl epackage = new EpackageImpl();
		return epackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnifiedMetamodel_.EClass createEClass() {
		EClassImpl eClass = new EClassImpl();
		return eClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Anotationi createAnotationi() {
		AnotationiImpl anotationi = new AnotationiImpl();
		return anotationi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Subproject createSubproject() {
		SubprojectImpl subproject = new SubprojectImpl();
		return subproject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Descriptor createDescriptor() {
		DescriptorImpl descriptor = new DescriptorImpl();
		return descriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JavaScript createJavaScript() {
		JavaScriptImpl javaScript = new JavaScriptImpl();
		return javaScript;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnifiedMetamodel_Package getUnifiedMetamodel_Package() {
		return (UnifiedMetamodel_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnifiedMetamodel_Package getPackage() {
		return UnifiedMetamodel_Package.eINSTANCE;
	}

} //UnifiedMetamodel_FactoryImpl
