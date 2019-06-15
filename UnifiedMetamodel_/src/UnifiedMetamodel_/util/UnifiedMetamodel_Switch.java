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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see UnifiedMetamodel_.UnifiedMetamodel_Package
 * @generated
 */
public class UnifiedMetamodel_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UnifiedMetamodel_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnifiedMetamodel_Switch() {
		if (modelPackage == null) {
			modelPackage = UnifiedMetamodel_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UnifiedMetamodel_Package.EJB: {
				Ejb ejb = (Ejb)theEObject;
				T result = caseEjb(ejb);
				if (result == null) result = caseLayer(ejb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.LAYER_SEGMENT: {
				LayerSegment layerSegment = (LayerSegment)theEObject;
				T result = caseLayerSegment(layerSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.DTO: {
				Dto dto = (Dto)theEObject;
				T result = caseDto(dto);
				if (result == null) result = caseLayerSegment(dto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.STORE: {
				Store store = (Store)theEObject;
				T result = caseStore(store);
				if (result == null) result = caseLayerSegment(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.UI: {
				UI ui = (UI)theEObject;
				T result = caseUI(ui);
				if (result == null) result = caseLayerSegment(ui);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.LAYER: {
				Layer layer = (Layer)theEObject;
				T result = caseLayer(layer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.REST_ENTITY: {
				RestEntity restEntity = (RestEntity)theEObject;
				T result = caseRestEntity(restEntity);
				if (result == null) result = caseLayerSegment(restEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.FACADE: {
				Facade facade = (Facade)theEObject;
				T result = caseFacade(facade);
				if (result == null) result = caseLayerSegment(facade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.WAR: {
				War war = (War)theEObject;
				T result = caseWar(war);
				if (result == null) result = caseLayer(war);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.RELATION_ARCH: {
				RelationArch relationArch = (RelationArch)theEObject;
				T result = caseRelationArch(relationArch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ARQUITECTURE_METAMODEL: {
				ArquitectureMetamodel arquitectureMetamodel = (ArquitectureMetamodel)theEObject;
				T result = caseArquitectureMetamodel(arquitectureMetamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.CONTAINERS: {
				Containers containers = (Containers)theEObject;
				T result = caseContainers(containers);
				if (result == null) result = caseLayerSegment(containers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.POJO: {
				Pojo pojo = (Pojo)theEObject;
				T result = casePojo(pojo);
				if (result == null) result = caseLayerSegment(pojo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.SERVICES: {
				Services services = (Services)theEObject;
				T result = caseServices(services);
				if (result == null) result = caseLayerSegment(services);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.METAMODEL: {
				Metamodel metamodel = (Metamodel)theEObject;
				T result = caseMetamodel(metamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.READ: {
				Read read = (Read)theEObject;
				T result = caseRead(read);
				if (result == null) result = caseOperations(read);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.CREATE: {
				Create create = (Create)theEObject;
				T result = caseCreate(create);
				if (result == null) result = caseOperations(create);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.SALE: {
				Sale sale = (Sale)theEObject;
				T result = caseSale(sale);
				if (result == null) result = caseTransaction(sale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.EXCHANGE: {
				Exchange exchange = (Exchange)theEObject;
				T result = caseExchange(exchange);
				if (result == null) result = caseTransaction(exchange);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.COMPOSITION: {
				Composition composition = (Composition)theEObject;
				T result = caseComposition(composition);
				if (result == null) result = caseRelationDom(composition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.OPERATIONS: {
				Operations operations = (Operations)theEObject;
				T result = caseOperations(operations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.LOGIN: {
				Login login = (Login)theEObject;
				T result = caseLogin(login);
				if (result == null) result = caseOperations(login);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.MODULE: {
				UnifiedMetamodel_.Module module = (UnifiedMetamodel_.Module)theEObject;
				T result = caseModule(module);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.SPECIAL_ENTITY: {
				SpecialEntity specialEntity = (SpecialEntity)theEObject;
				T result = caseSpecialEntity(specialEntity);
				if (result == null) result = caseEntity(specialEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.GENERAL_ENTITY: {
				GeneralEntity generalEntity = (GeneralEntity)theEObject;
				T result = caseGeneralEntity(generalEntity);
				if (result == null) result = caseEntity(generalEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ENTITY: {
				Entity entity = (Entity)theEObject;
				T result = caseEntity(entity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.RELATION_DOM: {
				RelationDom relationDom = (RelationDom)theEObject;
				T result = caseRelationDom(relationDom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.TRANSACTION: {
				Transaction transaction = (Transaction)theEObject;
				T result = caseTransaction(transaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.SUBMODULE: {
				Submodule submodule = (Submodule)theEObject;
				T result = caseSubmodule(submodule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.DOMAIN_METAMODEL: {
				DomainMetamodel domainMetamodel = (DomainMetamodel)theEObject;
				T result = caseDomainMetamodel(domainMetamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ACTION_DISPATCHER: {
				ActionDispatcher actionDispatcher = (ActionDispatcher)theEObject;
				T result = caseActionDispatcher(actionDispatcher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ROUTER: {
				Router router = (Router)theEObject;
				T result = caseRouter(router);
				if (result == null) result = caseModuleFront(router);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.JSON: {
				JSON json = (JSON)theEObject;
				T result = caseJSON(json);
				if (result == null) result = caseFile(json);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.MD: {
				MD md = (MD)theEObject;
				T result = caseMD(md);
				if (result == null) result = caseFile(md);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.CSS: {
				CSS css = (CSS)theEObject;
				T result = caseCSS(css);
				if (result == null) result = caseFile(css);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.API_CALL: {
				APICall apiCall = (APICall)theEObject;
				T result = caseAPICall(apiCall);
				if (result == null) result = caseModuleFront(apiCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.DIRECTORY: {
				Directory directory = (Directory)theEObject;
				T result = caseDirectory(directory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.UI_FRONT: {
				UIFront uiFront = (UIFront)theEObject;
				T result = caseUIFront(uiFront);
				if (result == null) result = caseComponentFront(uiFront);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.VISUALIZER: {
				Visualizer visualizer = (Visualizer)theEObject;
				T result = caseVisualizer(visualizer);
				if (result == null) result = caseUIFront(visualizer);
				if (result == null) result = caseComponentFront(visualizer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.DESIGN: {
				Design design = (Design)theEObject;
				T result = caseDesign(design);
				if (result == null) result = caseModuleFront(design);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ACTION_CREATOR: {
				ActionCreator actionCreator = (ActionCreator)theEObject;
				T result = caseActionCreator(actionCreator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ROUTER_COMPONENT: {
				RouterComponent routerComponent = (RouterComponent)theEObject;
				T result = caseRouterComponent(routerComponent);
				if (result == null) result = caseUIFront(routerComponent);
				if (result == null) result = caseComponentFront(routerComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.CONTAINER: {
				Container container = (Container)theEObject;
				T result = caseContainer(container);
				if (result == null) result = caseComponentFront(container);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.SERVICES_FRONT: {
				ServicesFront servicesFront = (ServicesFront)theEObject;
				T result = caseServicesFront(servicesFront);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.FUNCTIONALITY: {
				Functionality functionality = (Functionality)theEObject;
				T result = caseFunctionality(functionality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.JS: {
				JS js = (JS)theEObject;
				T result = caseJS(js);
				if (result == null) result = caseFile(js);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.REDUX: {
				Redux redux = (Redux)theEObject;
				T result = caseRedux(redux);
				if (result == null) result = caseModuleFront(redux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.TECH_FRONT: {
				TechFront techFront = (TechFront)theEObject;
				T result = caseTechFront(techFront);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.COMPONENT_FRONT: {
				ComponentFront componentFront = (ComponentFront)theEObject;
				T result = caseComponentFront(componentFront);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.REDUCER: {
				Reducer reducer = (Reducer)theEObject;
				T result = caseReducer(reducer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.MODULE_FRONT: {
				ModuleFront moduleFront = (ModuleFront)theEObject;
				T result = caseModuleFront(moduleFront);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.TECHNOLOGY_METAMODEL: {
				TechnologyMetamodel technologyMetamodel = (TechnologyMetamodel)theEObject;
				T result = caseTechnologyMetamodel(technologyMetamodel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.TECH_BACK: {
				TechBack techBack = (TechBack)theEObject;
				T result = caseTechBack(techBack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.JEE_PROJECT: {
				JEE_Project jeE_Project = (JEE_Project)theEObject;
				T result = caseJEE_Project(jeE_Project);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.NATIVE_CLASS: {
				NativeClass nativeClass = (NativeClass)theEObject;
				T result = caseNativeClass(nativeClass);
				if (result == null) result = caseEClass(nativeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.INTERFACE_CLASS: {
				InterfaceClass interfaceClass = (InterfaceClass)theEObject;
				T result = caseInterfaceClass(interfaceClass);
				if (result == null) result = caseEClass(interfaceClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.LIBRARY: {
				Library library = (Library)theEObject;
				T result = caseLibrary(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.JEE: {
				Jee jee = (Jee)theEObject;
				T result = caseJee(jee);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.GENERIC_CLASS: {
				GenericClass genericClass = (GenericClass)theEObject;
				T result = caseGenericClass(genericClass);
				if (result == null) result = caseEClass(genericClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.METHOD_BACK: {
				MethodBack methodBack = (MethodBack)theEObject;
				T result = caseMethodBack(methodBack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ABSTRACT_CLASS: {
				AbstractClass abstractClass = (AbstractClass)theEObject;
				T result = caseAbstractClass(abstractClass);
				if (result == null) result = caseEClass(abstractClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.EPACKAGE: {
				Epackage epackage = (Epackage)theEObject;
				T result = caseEpackage(epackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ECLASS: {
				EClass eClass = (EClass)theEObject;
				T result = caseEClass(eClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.ANOTATIONI: {
				Anotationi anotationi = (Anotationi)theEObject;
				T result = caseAnotationi(anotationi);
				if (result == null) result = caseEClass(anotationi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.SUBPROJECT: {
				Subproject subproject = (Subproject)theEObject;
				T result = caseSubproject(subproject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.DESCRIPTOR: {
				Descriptor descriptor = (Descriptor)theEObject;
				T result = caseDescriptor(descriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UnifiedMetamodel_Package.JAVA_SCRIPT: {
				JavaScript javaScript = (JavaScript)theEObject;
				T result = caseJavaScript(javaScript);
				if (result == null) result = caseLayer(javaScript);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ejb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ejb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEjb(Ejb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayerSegment(LayerSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDto(Dto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStore(Store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUI(UI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rest Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rest Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRestEntity(RestEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacade(Facade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>War</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>War</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWar(War object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Arch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Arch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationArch(RelationArch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arquitecture Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arquitecture Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArquitectureMetamodel(ArquitectureMetamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainers(Containers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pojo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pojo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePojo(Pojo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Services</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Services</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServices(Services object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetamodel(Metamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRead(Read object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Create</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Create</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreate(Create object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSale(Sale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exchange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exchange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExchange(Exchange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposition(Composition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperations(Operations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogin(Login object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModule(UnifiedMetamodel_.Module object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecialEntity(SpecialEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>General Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>General Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralEntity(GeneralEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relation Dom</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relation Dom</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationDom(RelationDom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransaction(Transaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Submodule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Submodule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubmodule(Submodule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainMetamodel(DomainMetamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Dispatcher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Dispatcher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionDispatcher(ActionDispatcher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Router</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Router</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouter(Router object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSON(JSON object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>MD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>MD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMD(MD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CSS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CSS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCSS(CSS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPICall(APICall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectory(Directory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Front</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Front</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIFront(UIFront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visualizer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visualizer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisualizer(Visualizer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Design</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Design</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDesign(Design object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Creator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Creator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionCreator(ActionCreator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Router Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Router Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouterComponent(RouterComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainer(Container object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Services Front</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Services Front</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServicesFront(ServicesFront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functionality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functionality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionality(Functionality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJS(JS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedux(Redux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Front</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Front</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentFront(ComponentFront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reducer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reducer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReducer(Reducer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Front</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Front</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleFront(ModuleFront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Technology Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Technology Metamodel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechnologyMetamodel(TechnologyMetamodel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tech Front</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tech Front</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechFront(TechFront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tech Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tech Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTechBack(TechBack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JEE Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JEE Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJEE_Project(JEE_Project object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Native Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Native Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNativeClass(NativeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceClass(InterfaceClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jee</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jee</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJee(Jee object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericClass(GenericClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Back</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Back</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodBack(MethodBack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractClass(AbstractClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Epackage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Epackage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEpackage(Epackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EClass</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEClass(EClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anotationi</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anotationi</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnotationi(Anotationi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subproject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subproject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubproject(Subproject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptor(Descriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Script</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Script</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaScript(JavaScript object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UnifiedMetamodel_Switch
