/**
 */
package de.jax.smarthome.regelSprache.impl;

import de.jax.smarthome.regelSprache.Definition;
import de.jax.smarthome.regelSprache.Geraet;
import de.jax.smarthome.regelSprache.Model;
import de.jax.smarthome.regelSprache.Regel;
import de.jax.smarthome.regelSprache.RegelSpracheFactory;
import de.jax.smarthome.regelSprache.RegelSprachePackage;
import de.jax.smarthome.regelSprache.Zustand;

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
public class RegelSprachePackageImpl extends EPackageImpl implements RegelSprachePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass geraetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass zustandEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass regelEClass = null;

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
   * @see de.jax.smarthome.regelSprache.RegelSprachePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private RegelSprachePackageImpl()
  {
    super(eNS_URI, RegelSpracheFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link RegelSprachePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static RegelSprachePackage init()
  {
    if (isInited) return (RegelSprachePackage)EPackage.Registry.INSTANCE.getEPackage(RegelSprachePackage.eNS_URI);

    // Obtain or create and register package
    RegelSprachePackageImpl theRegelSprachePackage = (RegelSprachePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RegelSprachePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RegelSprachePackageImpl());

    isInited = true;

    // Create package meta-data objects
    theRegelSprachePackage.createPackageContents();

    // Initialize created meta-data
    theRegelSprachePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theRegelSprachePackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(RegelSprachePackage.eNS_URI, theRegelSprachePackage);
    return theRegelSprachePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Definitionen()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefinition()
  {
    return definitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGeraet()
  {
    return geraetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeraet_Artikel()
  {
    return (EAttribute)geraetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGeraet_Name()
  {
    return (EAttribute)geraetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGeraet_Zustaende()
  {
    return (EReference)geraetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getZustand()
  {
    return zustandEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getZustand_Name()
  {
    return (EAttribute)zustandEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRegel()
  {
    return regelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegel_WennArtikel()
  {
    return (EAttribute)regelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegel_WennGeraet()
  {
    return (EReference)regelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegel_Wenn()
  {
    return (EReference)regelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRegel_DannArtikel()
  {
    return (EAttribute)regelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegel_DannGeraet()
  {
    return (EReference)regelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRegel_Dann()
  {
    return (EReference)regelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RegelSpracheFactory getRegelSpracheFactory()
  {
    return (RegelSpracheFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__DEFINITIONEN);

    definitionEClass = createEClass(DEFINITION);

    geraetEClass = createEClass(GERAET);
    createEAttribute(geraetEClass, GERAET__ARTIKEL);
    createEAttribute(geraetEClass, GERAET__NAME);
    createEReference(geraetEClass, GERAET__ZUSTAENDE);

    zustandEClass = createEClass(ZUSTAND);
    createEAttribute(zustandEClass, ZUSTAND__NAME);

    regelEClass = createEClass(REGEL);
    createEAttribute(regelEClass, REGEL__WENN_ARTIKEL);
    createEReference(regelEClass, REGEL__WENN_GERAET);
    createEReference(regelEClass, REGEL__WENN);
    createEAttribute(regelEClass, REGEL__DANN_ARTIKEL);
    createEReference(regelEClass, REGEL__DANN_GERAET);
    createEReference(regelEClass, REGEL__DANN);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    geraetEClass.getESuperTypes().add(this.getDefinition());
    regelEClass.getESuperTypes().add(this.getDefinition());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Definitionen(), this.getDefinition(), null, "definitionen", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(geraetEClass, Geraet.class, "Geraet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGeraet_Artikel(), ecorePackage.getEString(), "artikel", null, 0, 1, Geraet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGeraet_Name(), ecorePackage.getEString(), "name", null, 0, 1, Geraet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGeraet_Zustaende(), this.getZustand(), null, "zustaende", null, 0, -1, Geraet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(zustandEClass, Zustand.class, "Zustand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getZustand_Name(), ecorePackage.getEString(), "name", null, 0, 1, Zustand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(regelEClass, Regel.class, "Regel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRegel_WennArtikel(), ecorePackage.getEString(), "wennArtikel", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegel_WennGeraet(), this.getGeraet(), null, "wennGeraet", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegel_Wenn(), this.getZustand(), null, "wenn", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRegel_DannArtikel(), ecorePackage.getEString(), "dannArtikel", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegel_DannGeraet(), this.getGeraet(), null, "dannGeraet", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRegel_Dann(), this.getZustand(), null, "dann", null, 0, 1, Regel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //RegelSprachePackageImpl
