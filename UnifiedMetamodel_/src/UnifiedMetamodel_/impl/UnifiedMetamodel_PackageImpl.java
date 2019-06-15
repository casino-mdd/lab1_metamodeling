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
import UnifiedMetamodel_.Component;
import UnifiedMetamodel_.ComponentFront;
import UnifiedMetamodel_.Composition;
import UnifiedMetamodel_.Containers;
import UnifiedMetamodel_.Create;
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
import UnifiedMetamodel_.JavaScript;
import UnifiedMetamodel_.Jee;
import UnifiedMetamodel_.Layer;
import UnifiedMetamodel_.LayerSegment;
import UnifiedMetamodel_.Library;
import UnifiedMetamodel_.Login;
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
import UnifiedMetamodel_.UIFront;
import UnifiedMetamodel_.UnifiedMetamodel_Factory;
import UnifiedMetamodel_.UnifiedMetamodel_Package;

import UnifiedMetamodel_.Visualizer;
import UnifiedMetamodel_.War;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnifiedMetamodel_PackageImpl extends EPackageImpl implements UnifiedMetamodel_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ejbEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerSegmentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtoEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restEntityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facadeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass warEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationArchEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arquitectureMetamodelEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containersEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pojoEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metamodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass saleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialEntityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalEntityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationDomEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass submoduleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainMetamodelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionDispatcherEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsonEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mdEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cssEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apiCallEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directoryEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiFrontEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionCreatorEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routerComponentEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass servicesFrontEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduxEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentFrontEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reducerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moduleFrontEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technologyMetamodelEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techFrontEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass techBackEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jeE_ProjectEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nativeClassEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceClassEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jeeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericClassEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodBackEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractClassEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass epackageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eClassEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anotationiEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprojectEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaScriptEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see UnifiedMetamodel_.UnifiedMetamodel_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnifiedMetamodel_PackageImpl() {
		super(eNS_URI, UnifiedMetamodel_Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UnifiedMetamodel_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UnifiedMetamodel_Package init() {
		if (isInited) return (UnifiedMetamodel_Package)EPackage.Registry.INSTANCE.getEPackage(UnifiedMetamodel_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredUnifiedMetamodel_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		UnifiedMetamodel_PackageImpl theUnifiedMetamodel_Package = registeredUnifiedMetamodel_Package instanceof UnifiedMetamodel_PackageImpl ? (UnifiedMetamodel_PackageImpl)registeredUnifiedMetamodel_Package : new UnifiedMetamodel_PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUnifiedMetamodel_Package.createPackageContents();

		// Initialize created meta-data
		theUnifiedMetamodel_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnifiedMetamodel_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnifiedMetamodel_Package.eNS_URI, theUnifiedMetamodel_Package);
		return theUnifiedMetamodel_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEjb() {
		return ejbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayerSegment() {
		return layerSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerSegment_AllowToUse() {
		return (EReference)layerSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayerSegment_Layersegment() {
		return (EReference)layerSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayerSegment_Name() {
		return (EAttribute)layerSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDto() {
		return dtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUI() {
		return uiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayer_LayerSegments() {
		return (EReference)layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayer_Name() {
		return (EAttribute)layerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRestEntity() {
		return restEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFacade() {
		return facadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWar() {
		return warEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Layers() {
		return (EReference)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponent_Relations() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponent_Name() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationArch() {
		return relationArchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationArch_Source() {
		return (EReference)relationArchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationArch_Target() {
		return (EReference)relationArchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRelationArch_Name() {
		return (EAttribute)relationArchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArquitectureMetamodel() {
		return arquitectureMetamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArquitectureMetamodel_Components() {
		return (EReference)arquitectureMetamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainers() {
		return containersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPojo() {
		return pojoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServices() {
		return servicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetamodel() {
		return metamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetamodel_Arquitecturemetamodel() {
		return (EReference)metamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetamodel_Domainmetamodel() {
		return (EReference)metamodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetamodel_Technologymetamodel() {
		return (EReference)metamodelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRead() {
		return readEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCreate() {
		return createEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSale() {
		return saleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExchange() {
		return exchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComposition() {
		return compositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperations() {
		return operationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperations_Entity() {
		return (EReference)operationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogin() {
		return loginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModule() {
		return moduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModule_Name() {
		return (EAttribute)moduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModule_Submodule() {
		return (EReference)moduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecialEntity() {
		return specialEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecialEntity_Transaction() {
		return (EReference)specialEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecialEntity_Type() {
		return (EAttribute)specialEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeneralEntity() {
		return generalEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntity_Name() {
		return (EAttribute)entityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelationDom() {
		return relationDomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationDom_Source() {
		return (EReference)relationDomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRelationDom_Target() {
		return (EReference)relationDomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransaction_Update() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubmodule() {
		return submoduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubmodule_Name() {
		return (EAttribute)submoduleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubmodule_Operations() {
		return (EReference)submoduleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubmodule_Entity() {
		return (EReference)submoduleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubmodule_Relation() {
		return (EReference)submoduleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDomainMetamodel() {
		return domainMetamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDomainMetamodel_Module() {
		return (EReference)domainMetamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionDispatcher() {
		return actionDispatcherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActionDispatcher_Use() {
		return (EReference)actionDispatcherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionDispatcher_Name() {
		return (EAttribute)actionDispatcherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouter() {
		return routerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJSON() {
		return jsonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMD() {
		return mdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCSS() {
		return cssEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAPICall() {
		return apiCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDirectory() {
		return directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDirectory_Purpose() {
		return (EAttribute)directoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDirectory_IsRoot() {
		return (EAttribute)directoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectory_Directories() {
		return (EReference)directoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDirectory_Files() {
		return (EReference)directoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDirectory_Name() {
		return (EAttribute)directoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Action() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Reducer() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Use() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUIFront() {
		return uiFrontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisualizer() {
		return visualizerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDesign() {
		return designEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActionCreator() {
		return actionCreatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActionCreator_Name() {
		return (EAttribute)actionCreatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouterComponent() {
		return routerComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRouterComponent_Routes() {
		return (EReference)routerComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Dispatches() {
		return (EReference)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Maps() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServicesFront() {
		return servicesFrontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServicesFront_Use() {
		return (EReference)servicesFrontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServicesFront_Name() {
		return (EAttribute)servicesFrontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServicesFront_IsOrganizedIn() {
		return (EReference)servicesFrontEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionality() {
		return functionalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionality_Name() {
		return (EAttribute)functionalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionality_Components() {
		return (EReference)functionalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionality_State() {
		return (EReference)functionalityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionality_Services() {
		return (EReference)functionalityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionality_IsOrganizedBy() {
		return (EReference)functionalityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJS() {
		return jsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Actiondispatcher() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_Actioncreator() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAction_ActionDirectory() {
		return (EReference)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRedux() {
		return reduxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Type() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Name() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentFront() {
		return componentFrontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentFront_Use() {
		return (EReference)componentFrontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentFront_Name() {
		return (EAttribute)componentFrontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComponentFront_InWithin() {
		return (EReference)componentFrontEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReducer() {
		return reducerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReducer_Name() {
		return (EAttribute)reducerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReducer_Catches() {
		return (EReference)reducerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReducer_ReducerDirectory() {
		return (EReference)reducerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModuleFront() {
		return moduleFrontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModuleFront_Name() {
		return (EAttribute)moduleFrontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModuleFront_IsPresentIn() {
		return (EReference)moduleFrontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnologyMetamodel() {
		return technologyMetamodelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnologyMetamodel_Techfront() {
		return (EReference)technologyMetamodelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechnologyMetamodel_Techback() {
		return (EReference)technologyMetamodelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechFront() {
		return techFrontEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechFront_Functionalities() {
		return (EReference)techFrontEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechFront_Modules() {
		return (EReference)techFrontEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechFront_Directories() {
		return (EReference)techFrontEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechBack() {
		return techBackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTechBack_Jee_project() {
		return (EReference)techBackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJEE_Project() {
		return jeE_ProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJEE_Project_Name() {
		return (EAttribute)jeE_ProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJEE_Project_Subproject() {
		return (EReference)jeE_ProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNativeClass() {
		return nativeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNativeClass_PrimitiveRef() {
		return (EAttribute)nativeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceClass() {
		return interfaceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibrary_Name() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLibrary_IsNative() {
		return (EAttribute)libraryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLibrary_Nativeclass() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLibrary_Anotationi() {
		return (EReference)libraryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJee() {
		return jeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJee_Jee_project() {
		return (EReference)jeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Name() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_Anotationi() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAttribute_Type() {
		return (EReference)attributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGenericClass() {
		return genericClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenericClass_Implement() {
		return (EReference)genericClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGenericClass_Extends() {
		return (EReference)genericClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodBack() {
		return methodBackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodBack_Name() {
		return (EAttribute)methodBackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodBack_Anotationi() {
		return (EReference)methodBackEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodBack_Return() {
		return (EReference)methodBackEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMethodBack_Arguments() {
		return (EReference)methodBackEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractClass() {
		return abstractClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEpackage() {
		return epackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEpackage_Name() {
		return (EAttribute)epackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEpackage_Class() {
		return (EReference)epackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEClass() {
		return eClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Attribute() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEClass_Name() {
		return (EAttribute)eClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Method() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEClass_Anotationi() {
		return (EReference)eClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnotationi() {
		return anotationiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnotationi_Properties() {
		return (EAttribute)anotationiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnotationi_Descriptor() {
		return (EReference)anotationiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSubproject() {
		return subprojectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSubproject_Name() {
		return (EAttribute)subprojectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubproject_Descriptor() {
		return (EReference)subprojectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubproject_Package() {
		return (EReference)subprojectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSubproject_Library() {
		return (EReference)subprojectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDescriptor() {
		return descriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptor_Name() {
		return (EAttribute)descriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDescriptor_Path() {
		return (EAttribute)descriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaScript() {
		return javaScriptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnifiedMetamodel_Factory getUnifiedMetamodel_Factory() {
		return (UnifiedMetamodel_Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ejbEClass = createEClass(EJB);

		layerSegmentEClass = createEClass(LAYER_SEGMENT);
		createEReference(layerSegmentEClass, LAYER_SEGMENT__ALLOW_TO_USE);
		createEReference(layerSegmentEClass, LAYER_SEGMENT__LAYERSEGMENT);
		createEAttribute(layerSegmentEClass, LAYER_SEGMENT__NAME);

		dtoEClass = createEClass(DTO);

		storeEClass = createEClass(STORE);

		uiEClass = createEClass(UI);

		layerEClass = createEClass(LAYER);
		createEReference(layerEClass, LAYER__LAYER_SEGMENTS);
		createEAttribute(layerEClass, LAYER__NAME);

		restEntityEClass = createEClass(REST_ENTITY);

		facadeEClass = createEClass(FACADE);

		warEClass = createEClass(WAR);

		componentEClass = createEClass(COMPONENT);
		createEReference(componentEClass, COMPONENT__LAYERS);
		createEReference(componentEClass, COMPONENT__RELATIONS);
		createEAttribute(componentEClass, COMPONENT__NAME);

		relationArchEClass = createEClass(RELATION_ARCH);
		createEReference(relationArchEClass, RELATION_ARCH__SOURCE);
		createEReference(relationArchEClass, RELATION_ARCH__TARGET);
		createEAttribute(relationArchEClass, RELATION_ARCH__NAME);

		arquitectureMetamodelEClass = createEClass(ARQUITECTURE_METAMODEL);
		createEReference(arquitectureMetamodelEClass, ARQUITECTURE_METAMODEL__COMPONENTS);

		containersEClass = createEClass(CONTAINERS);

		pojoEClass = createEClass(POJO);

		servicesEClass = createEClass(SERVICES);

		metamodelEClass = createEClass(METAMODEL);
		createEReference(metamodelEClass, METAMODEL__ARQUITECTUREMETAMODEL);
		createEReference(metamodelEClass, METAMODEL__DOMAINMETAMODEL);
		createEReference(metamodelEClass, METAMODEL__TECHNOLOGYMETAMODEL);

		readEClass = createEClass(READ);

		createEClass = createEClass(CREATE);

		saleEClass = createEClass(SALE);

		exchangeEClass = createEClass(EXCHANGE);

		compositionEClass = createEClass(COMPOSITION);

		operationsEClass = createEClass(OPERATIONS);
		createEReference(operationsEClass, OPERATIONS__ENTITY);

		loginEClass = createEClass(LOGIN);

		moduleEClass = createEClass(MODULE);
		createEAttribute(moduleEClass, MODULE__NAME);
		createEReference(moduleEClass, MODULE__SUBMODULE);

		specialEntityEClass = createEClass(SPECIAL_ENTITY);
		createEReference(specialEntityEClass, SPECIAL_ENTITY__TRANSACTION);
		createEAttribute(specialEntityEClass, SPECIAL_ENTITY__TYPE);

		generalEntityEClass = createEClass(GENERAL_ENTITY);

		entityEClass = createEClass(ENTITY);
		createEAttribute(entityEClass, ENTITY__NAME);

		relationDomEClass = createEClass(RELATION_DOM);
		createEReference(relationDomEClass, RELATION_DOM__SOURCE);
		createEReference(relationDomEClass, RELATION_DOM__TARGET);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__UPDATE);

		submoduleEClass = createEClass(SUBMODULE);
		createEAttribute(submoduleEClass, SUBMODULE__NAME);
		createEReference(submoduleEClass, SUBMODULE__OPERATIONS);
		createEReference(submoduleEClass, SUBMODULE__ENTITY);
		createEReference(submoduleEClass, SUBMODULE__RELATION);

		domainMetamodelEClass = createEClass(DOMAIN_METAMODEL);
		createEReference(domainMetamodelEClass, DOMAIN_METAMODEL__MODULE);

		actionDispatcherEClass = createEClass(ACTION_DISPATCHER);
		createEReference(actionDispatcherEClass, ACTION_DISPATCHER__USE);
		createEAttribute(actionDispatcherEClass, ACTION_DISPATCHER__NAME);

		routerEClass = createEClass(ROUTER);

		jsonEClass = createEClass(JSON);

		mdEClass = createEClass(MD);

		cssEClass = createEClass(CSS);

		apiCallEClass = createEClass(API_CALL);

		directoryEClass = createEClass(DIRECTORY);
		createEAttribute(directoryEClass, DIRECTORY__PURPOSE);
		createEAttribute(directoryEClass, DIRECTORY__IS_ROOT);
		createEReference(directoryEClass, DIRECTORY__DIRECTORIES);
		createEReference(directoryEClass, DIRECTORY__FILES);
		createEAttribute(directoryEClass, DIRECTORY__NAME);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ACTION);
		createEReference(stateEClass, STATE__REDUCER);
		createEReference(stateEClass, STATE__USE);

		uiFrontEClass = createEClass(UI_FRONT);

		visualizerEClass = createEClass(VISUALIZER);

		designEClass = createEClass(DESIGN);

		actionCreatorEClass = createEClass(ACTION_CREATOR);
		createEAttribute(actionCreatorEClass, ACTION_CREATOR__NAME);

		routerComponentEClass = createEClass(ROUTER_COMPONENT);
		createEReference(routerComponentEClass, ROUTER_COMPONENT__ROUTES);

		containerEClass = createEClass(CONTAINER);
		createEReference(containerEClass, CONTAINER__DISPATCHES);
		createEReference(containerEClass, CONTAINER__MAPS);

		servicesFrontEClass = createEClass(SERVICES_FRONT);
		createEReference(servicesFrontEClass, SERVICES_FRONT__USE);
		createEAttribute(servicesFrontEClass, SERVICES_FRONT__NAME);
		createEReference(servicesFrontEClass, SERVICES_FRONT__IS_ORGANIZED_IN);

		functionalityEClass = createEClass(FUNCTIONALITY);
		createEAttribute(functionalityEClass, FUNCTIONALITY__NAME);
		createEReference(functionalityEClass, FUNCTIONALITY__COMPONENTS);
		createEReference(functionalityEClass, FUNCTIONALITY__STATE);
		createEReference(functionalityEClass, FUNCTIONALITY__SERVICES);
		createEReference(functionalityEClass, FUNCTIONALITY__IS_ORGANIZED_BY);

		jsEClass = createEClass(JS);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__ACTIONDISPATCHER);
		createEReference(actionEClass, ACTION__ACTIONCREATOR);
		createEReference(actionEClass, ACTION__ACTION_DIRECTORY);

		reduxEClass = createEClass(REDUX);

		techFrontEClass = createEClass(TECH_FRONT);
		createEReference(techFrontEClass, TECH_FRONT__FUNCTIONALITIES);
		createEReference(techFrontEClass, TECH_FRONT__MODULES);
		createEReference(techFrontEClass, TECH_FRONT__DIRECTORIES);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__TYPE);
		createEAttribute(fileEClass, FILE__NAME);

		componentFrontEClass = createEClass(COMPONENT_FRONT);
		createEReference(componentFrontEClass, COMPONENT_FRONT__USE);
		createEAttribute(componentFrontEClass, COMPONENT_FRONT__NAME);
		createEReference(componentFrontEClass, COMPONENT_FRONT__IN_WITHIN);

		reducerEClass = createEClass(REDUCER);
		createEAttribute(reducerEClass, REDUCER__NAME);
		createEReference(reducerEClass, REDUCER__CATCHES);
		createEReference(reducerEClass, REDUCER__REDUCER_DIRECTORY);

		moduleFrontEClass = createEClass(MODULE_FRONT);
		createEAttribute(moduleFrontEClass, MODULE_FRONT__NAME);
		createEReference(moduleFrontEClass, MODULE_FRONT__IS_PRESENT_IN);

		technologyMetamodelEClass = createEClass(TECHNOLOGY_METAMODEL);
		createEReference(technologyMetamodelEClass, TECHNOLOGY_METAMODEL__TECHBACK);
		createEReference(technologyMetamodelEClass, TECHNOLOGY_METAMODEL__TECHFRONT);

		techBackEClass = createEClass(TECH_BACK);
		createEReference(techBackEClass, TECH_BACK__JEE_PROJECT);

		jeE_ProjectEClass = createEClass(JEE_PROJECT);
		createEAttribute(jeE_ProjectEClass, JEE_PROJECT__NAME);
		createEReference(jeE_ProjectEClass, JEE_PROJECT__SUBPROJECT);

		nativeClassEClass = createEClass(NATIVE_CLASS);
		createEAttribute(nativeClassEClass, NATIVE_CLASS__PRIMITIVE_REF);

		interfaceClassEClass = createEClass(INTERFACE_CLASS);

		libraryEClass = createEClass(LIBRARY);
		createEAttribute(libraryEClass, LIBRARY__NAME);
		createEAttribute(libraryEClass, LIBRARY__IS_NATIVE);
		createEReference(libraryEClass, LIBRARY__NATIVECLASS);
		createEReference(libraryEClass, LIBRARY__ANOTATIONI);

		jeeEClass = createEClass(JEE);
		createEReference(jeeEClass, JEE__JEE_PROJECT);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__NAME);
		createEReference(attributeEClass, ATTRIBUTE__ANOTATIONI);
		createEReference(attributeEClass, ATTRIBUTE__TYPE);

		genericClassEClass = createEClass(GENERIC_CLASS);
		createEReference(genericClassEClass, GENERIC_CLASS__IMPLEMENT);
		createEReference(genericClassEClass, GENERIC_CLASS__EXTENDS);

		methodBackEClass = createEClass(METHOD_BACK);
		createEAttribute(methodBackEClass, METHOD_BACK__NAME);
		createEReference(methodBackEClass, METHOD_BACK__ANOTATIONI);
		createEReference(methodBackEClass, METHOD_BACK__RETURN);
		createEReference(methodBackEClass, METHOD_BACK__ARGUMENTS);

		abstractClassEClass = createEClass(ABSTRACT_CLASS);

		epackageEClass = createEClass(EPACKAGE);
		createEAttribute(epackageEClass, EPACKAGE__NAME);
		createEReference(epackageEClass, EPACKAGE__CLASS);

		eClassEClass = createEClass(ECLASS);
		createEReference(eClassEClass, ECLASS__ATTRIBUTE);
		createEAttribute(eClassEClass, ECLASS__NAME);
		createEReference(eClassEClass, ECLASS__METHOD);
		createEReference(eClassEClass, ECLASS__ANOTATIONI);

		anotationiEClass = createEClass(ANOTATIONI);
		createEAttribute(anotationiEClass, ANOTATIONI__PROPERTIES);
		createEReference(anotationiEClass, ANOTATIONI__DESCRIPTOR);

		subprojectEClass = createEClass(SUBPROJECT);
		createEAttribute(subprojectEClass, SUBPROJECT__NAME);
		createEReference(subprojectEClass, SUBPROJECT__DESCRIPTOR);
		createEReference(subprojectEClass, SUBPROJECT__PACKAGE);
		createEReference(subprojectEClass, SUBPROJECT__LIBRARY);

		descriptorEClass = createEClass(DESCRIPTOR);
		createEAttribute(descriptorEClass, DESCRIPTOR__NAME);
		createEAttribute(descriptorEClass, DESCRIPTOR__PATH);

		javaScriptEClass = createEClass(JAVA_SCRIPT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ejbEClass.getESuperTypes().add(this.getLayer());
		dtoEClass.getESuperTypes().add(this.getLayerSegment());
		storeEClass.getESuperTypes().add(this.getLayerSegment());
		uiEClass.getESuperTypes().add(this.getLayerSegment());
		restEntityEClass.getESuperTypes().add(this.getLayerSegment());
		facadeEClass.getESuperTypes().add(this.getLayerSegment());
		warEClass.getESuperTypes().add(this.getLayer());
		containersEClass.getESuperTypes().add(this.getLayerSegment());
		pojoEClass.getESuperTypes().add(this.getLayerSegment());
		servicesEClass.getESuperTypes().add(this.getLayerSegment());
		readEClass.getESuperTypes().add(this.getOperations());
		createEClass.getESuperTypes().add(this.getOperations());
		saleEClass.getESuperTypes().add(this.getTransaction());
		exchangeEClass.getESuperTypes().add(this.getTransaction());
		compositionEClass.getESuperTypes().add(this.getRelationDom());
		loginEClass.getESuperTypes().add(this.getOperations());
		specialEntityEClass.getESuperTypes().add(this.getEntity());
		generalEntityEClass.getESuperTypes().add(this.getEntity());
		routerEClass.getESuperTypes().add(this.getModuleFront());
		jsonEClass.getESuperTypes().add(this.getFile());
		mdEClass.getESuperTypes().add(this.getFile());
		cssEClass.getESuperTypes().add(this.getFile());
		apiCallEClass.getESuperTypes().add(this.getModuleFront());
		uiFrontEClass.getESuperTypes().add(this.getComponentFront());
		visualizerEClass.getESuperTypes().add(this.getUIFront());
		designEClass.getESuperTypes().add(this.getModuleFront());
		routerComponentEClass.getESuperTypes().add(this.getUIFront());
		containerEClass.getESuperTypes().add(this.getComponentFront());
		jsEClass.getESuperTypes().add(this.getFile());
		reduxEClass.getESuperTypes().add(this.getModuleFront());
		nativeClassEClass.getESuperTypes().add(this.getEClass());
		interfaceClassEClass.getESuperTypes().add(this.getEClass());
		genericClassEClass.getESuperTypes().add(this.getEClass());
		abstractClassEClass.getESuperTypes().add(this.getEClass());
		anotationiEClass.getESuperTypes().add(this.getEClass());
		javaScriptEClass.getESuperTypes().add(this.getLayer());

		// Initialize classes, features, and operations; add parameters
		initEClass(ejbEClass, Ejb.class, "Ejb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layerSegmentEClass, LayerSegment.class, "LayerSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayerSegment_AllowToUse(), this.getLayerSegment(), null, "allowToUse", null, 0, 1, LayerSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayerSegment_Layersegment(), this.getLayerSegment(), null, "layersegment", null, 0, -1, LayerSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayerSegment_Name(), ecorePackage.getEString(), "name", null, 0, 1, LayerSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dtoEClass, Dto.class, "Dto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiEClass, UnifiedMetamodel_.UI.class, "UI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(layerEClass, Layer.class, "Layer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayer_LayerSegments(), this.getLayerSegment(), null, "layerSegments", null, 0, -1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Layer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(restEntityEClass, RestEntity.class, "RestEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(facadeEClass, Facade.class, "Facade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(warEClass, War.class, "War", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponent_Layers(), this.getLayer(), null, "layers", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponent_Relations(), this.getRelationArch(), null, "relations", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationArchEClass, RelationArch.class, "RelationArch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationArch_Source(), this.getLayer(), null, "source", null, 1, 1, RelationArch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationArch_Target(), this.getLayer(), null, "target", null, 1, 1, RelationArch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRelationArch_Name(), ecorePackage.getEString(), "name", null, 0, 1, RelationArch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arquitectureMetamodelEClass, ArquitectureMetamodel.class, "ArquitectureMetamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArquitectureMetamodel_Components(), this.getComponent(), null, "components", null, 0, -1, ArquitectureMetamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containersEClass, Containers.class, "Containers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pojoEClass, Pojo.class, "Pojo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(servicesEClass, Services.class, "Services", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metamodelEClass, Metamodel.class, "Metamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetamodel_Arquitecturemetamodel(), this.getArquitectureMetamodel(), null, "arquitecturemetamodel", null, 1, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodel_Domainmetamodel(), this.getDomainMetamodel(), null, "domainmetamodel", null, 1, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetamodel_Technologymetamodel(), this.getTechnologyMetamodel(), null, "technologymetamodel", null, 1, 1, Metamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(readEClass, Read.class, "Read", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(createEClass, Create.class, "Create", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(saleEClass, Sale.class, "Sale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exchangeEClass, Exchange.class, "Exchange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositionEClass, Composition.class, "Composition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationsEClass, Operations.class, "Operations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperations_Entity(), this.getEntity(), null, "entity", null, 0, 1, Operations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loginEClass, Login.class, "Login", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(moduleEClass, UnifiedMetamodel_.Module.class, "Module", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModule_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnifiedMetamodel_.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModule_Submodule(), this.getSubmodule(), null, "submodule", null, 0, -1, UnifiedMetamodel_.Module.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specialEntityEClass, SpecialEntity.class, "SpecialEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecialEntity_Transaction(), this.getTransaction(), null, "transaction", null, 0, -1, SpecialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialEntity_Type(), ecorePackage.getEString(), "type", null, 0, 1, SpecialEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generalEntityEClass, GeneralEntity.class, "GeneralEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationDomEClass, RelationDom.class, "RelationDom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationDom_Source(), this.getEntity(), null, "source", null, 0, 1, RelationDom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationDom_Target(), this.getEntity(), null, "target", null, 0, 1, RelationDom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_Update(), this.getGeneralEntity(), null, "update", null, 0, -1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(submoduleEClass, Submodule.class, "Submodule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubmodule_Name(), ecorePackage.getEString(), "name", null, 0, 1, Submodule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmodule_Operations(), this.getOperations(), null, "operations", null, 0, -1, Submodule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmodule_Entity(), this.getEntity(), null, "entity", null, 0, -1, Submodule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubmodule_Relation(), this.getRelationDom(), null, "relation", null, 0, -1, Submodule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainMetamodelEClass, DomainMetamodel.class, "DomainMetamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainMetamodel_Module(), this.getModule(), null, "module", null, 0, -1, DomainMetamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionDispatcherEClass, ActionDispatcher.class, "ActionDispatcher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionDispatcher_Use(), this.getActionCreator(), null, "use", null, 0, 1, ActionDispatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getActionDispatcher_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionDispatcher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routerEClass, Router.class, "Router", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(jsonEClass, UnifiedMetamodel_.JSON.class, "JSON", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mdEClass, UnifiedMetamodel_.MD.class, "MD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cssEClass, UnifiedMetamodel_.CSS.class, "CSS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apiCallEClass, APICall.class, "APICall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(directoryEClass, Directory.class, "Directory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDirectory_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectory_IsRoot(), ecorePackage.getEBoolean(), "isRoot", null, 0, 1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectory_Directories(), this.getDirectory(), null, "directories", null, 0, -1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDirectory_Files(), this.getFile(), null, "files", null, 0, -1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDirectory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Directory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Action(), this.getAction(), null, "action", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Reducer(), this.getReducer(), null, "reducer", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Use(), this.getModuleFront(), null, "use", null, 1, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiFrontEClass, UIFront.class, "UIFront", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visualizerEClass, Visualizer.class, "Visualizer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(designEClass, Design.class, "Design", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionCreatorEClass, ActionCreator.class, "ActionCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionCreator_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionCreator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routerComponentEClass, RouterComponent.class, "RouterComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRouterComponent_Routes(), this.getUIFront(), null, "routes", null, 1, -1, RouterComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, UnifiedMetamodel_.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContainer_Dispatches(), this.getActionDispatcher(), null, "dispatches", null, 0, -1, UnifiedMetamodel_.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Maps(), this.getReducer(), null, "maps", null, 0, -1, UnifiedMetamodel_.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(servicesFrontEClass, ServicesFront.class, "ServicesFront", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServicesFront_Use(), this.getModuleFront(), null, "use", null, 1, -1, ServicesFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServicesFront_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServicesFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServicesFront_IsOrganizedIn(), this.getDirectory(), null, "isOrganizedIn", null, 0, 1, ServicesFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionalityEClass, Functionality.class, "Functionality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionality_Name(), ecorePackage.getEString(), "name", null, 0, 1, Functionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionality_Components(), this.getComponentFront(), null, "components", null, 0, -1, Functionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionality_State(), this.getState(), null, "state", null, 0, -1, Functionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionality_Services(), this.getServicesFront(), null, "services", null, 0, -1, Functionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionality_IsOrganizedBy(), this.getDirectory(), null, "IsOrganizedBy", null, 1, 1, Functionality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jsEClass, UnifiedMetamodel_.JS.class, "JS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Actiondispatcher(), this.getActionDispatcher(), null, "actiondispatcher", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_Actioncreator(), this.getActionCreator(), null, "actioncreator", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAction_ActionDirectory(), this.getDirectory(), null, "actionDirectory", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reduxEClass, Redux.class, "Redux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(techFrontEClass, TechFront.class, "TechFront", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechFront_Functionalities(), this.getFunctionality(), null, "functionalities", null, 1, -1, TechFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechFront_Modules(), this.getModuleFront(), null, "modules", null, 1, -1, TechFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechFront_Directories(), this.getDirectory(), null, "directories", null, 1, -1, TechFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Type(), ecorePackage.getEString(), "type", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Name(), ecorePackage.getEString(), "name", null, 0, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentFrontEClass, ComponentFront.class, "ComponentFront", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentFront_Use(), this.getModuleFront(), null, "use", null, 0, -1, ComponentFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentFront_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComponentFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentFront_InWithin(), this.getDirectory(), null, "inWithin", null, 1, 1, ComponentFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reducerEClass, Reducer.class, "Reducer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReducer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Reducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReducer_Catches(), this.getActionCreator(), null, "catches", null, 0, 1, Reducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReducer_ReducerDirectory(), this.getDirectory(), null, "reducerDirectory", null, 0, 1, Reducer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moduleFrontEClass, ModuleFront.class, "ModuleFront", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModuleFront_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModuleFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModuleFront_IsPresentIn(), this.getDirectory(), null, "isPresentIn", null, 1, 1, ModuleFront.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technologyMetamodelEClass, TechnologyMetamodel.class, "TechnologyMetamodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechnologyMetamodel_Techback(), this.getTechBack(), null, "techback", null, 1, 1, TechnologyMetamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTechnologyMetamodel_Techfront(), this.getTechFront(), null, "techfront", null, 1, 1, TechnologyMetamodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(techBackEClass, TechBack.class, "TechBack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTechBack_Jee_project(), this.getJEE_Project(), null, "jee_project", null, 0, -1, TechBack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jeE_ProjectEClass, JEE_Project.class, "JEE_Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJEE_Project_Name(), ecorePackage.getEString(), "name", null, 0, 1, JEE_Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJEE_Project_Subproject(), this.getSubproject(), null, "subproject", null, 0, -1, JEE_Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nativeClassEClass, NativeClass.class, "NativeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNativeClass_PrimitiveRef(), ecorePackage.getEString(), "primitiveRef", null, 0, 1, NativeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceClassEClass, InterfaceClass.class, "InterfaceClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLibrary_Name(), ecorePackage.getEString(), "name", null, 0, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLibrary_IsNative(), ecorePackage.getEBoolean(), "isNative", null, 0, 1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Nativeclass(), this.getNativeClass(), null, "nativeclass", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLibrary_Anotationi(), this.getAnotationi(), null, "anotationi", null, 0, -1, Library.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jeeEClass, Jee.class, "Jee", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJee_Jee_project(), this.getJEE_Project(), null, "jee_project", null, 0, -1, Jee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Anotationi(), this.getAnotationi(), null, "anotationi", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttribute_Type(), this.getEClass(), null, "type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericClassEClass, GenericClass.class, "GenericClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericClass_Implement(), this.getInterfaceClass(), null, "implement", null, 0, -1, GenericClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericClass_Extends(), this.getAbstractClass(), null, "extends", null, 1, 1, GenericClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodBackEClass, MethodBack.class, "MethodBack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodBack_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodBack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodBack_Anotationi(), this.getAnotationi(), null, "anotationi", null, 0, 1, MethodBack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodBack_Return(), this.getEClass(), null, "return", null, 0, 1, MethodBack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMethodBack_Arguments(), this.getEClass(), null, "arguments", null, 0, 1, MethodBack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractClassEClass, AbstractClass.class, "AbstractClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(epackageEClass, Epackage.class, "Epackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEpackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Epackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEpackage_Class(), this.getEClass(), null, "class", null, 0, -1, Epackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eClassEClass, UnifiedMetamodel_.EClass.class, "EClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEClass_Attribute(), this.getAttribute(), null, "attribute", null, 0, -1, UnifiedMetamodel_.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnifiedMetamodel_.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Method(), this.getMethodBack(), null, "method", null, 0, -1, UnifiedMetamodel_.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEClass_Anotationi(), this.getAnotationi(), null, "anotationi", null, 0, 1, UnifiedMetamodel_.EClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anotationiEClass, Anotationi.class, "Anotationi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnotationi_Properties(), ecorePackage.getEString(), "properties", null, 0, 1, Anotationi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnotationi_Descriptor(), this.getDescriptor(), null, "descriptor", null, 0, 1, Anotationi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprojectEClass, Subproject.class, "Subproject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubproject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Subproject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubproject_Descriptor(), this.getDescriptor(), null, "descriptor", null, 0, -1, Subproject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubproject_Package(), this.getEpackage(), null, "package", null, 0, -1, Subproject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubproject_Library(), this.getLibrary(), null, "library", null, 0, -1, Subproject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(descriptorEClass, UnifiedMetamodel_.Descriptor.class, "Descriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnifiedMetamodel_.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDescriptor_Path(), ecorePackage.getEString(), "path", null, 0, 1, UnifiedMetamodel_.Descriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaScriptEClass, JavaScript.class, "JavaScript", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //UnifiedMetamodel_PackageImpl
