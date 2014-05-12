/**
 */
package de.jax.smarthome.regelSprache;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.jax.smarthome.regelSprache.RegelSpracheFactory
 * @model kind="package"
 * @generated
 */
public interface RegelSprachePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "regelSprache";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.jax.de/smarthome/RegelSprache";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "regelSprache";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RegelSprachePackage eINSTANCE = de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl.init();

  /**
   * The meta object id for the '{@link de.jax.smarthome.regelSprache.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.jax.smarthome.regelSprache.impl.ModelImpl
   * @see de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Definitionen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DEFINITIONEN = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.jax.smarthome.regelSprache.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.jax.smarthome.regelSprache.impl.DefinitionImpl
   * @see de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.jax.smarthome.regelSprache.impl.GeraetImpl <em>Geraet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.jax.smarthome.regelSprache.impl.GeraetImpl
   * @see de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl#getGeraet()
   * @generated
   */
  int GERAET = 2;

  /**
   * The feature id for the '<em><b>Artikel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GERAET__ARTIKEL = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GERAET__NAME = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Zustaende</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GERAET__ZUSTAENDE = DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Geraet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GERAET_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.jax.smarthome.regelSprache.impl.ZustandImpl <em>Zustand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.jax.smarthome.regelSprache.impl.ZustandImpl
   * @see de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl#getZustand()
   * @generated
   */
  int ZUSTAND = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUSTAND__NAME = 0;

  /**
   * The number of structural features of the '<em>Zustand</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZUSTAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.jax.smarthome.regelSprache.impl.RegelImpl <em>Regel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.jax.smarthome.regelSprache.impl.RegelImpl
   * @see de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl#getRegel()
   * @generated
   */
  int REGEL = 4;

  /**
   * The feature id for the '<em><b>Wenn Artikel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEL__WENN_ARTIKEL = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Wenn Geraet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEL__WENN_GERAET = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Wenn</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEL__WENN = DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Dann Artikel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEL__DANN_ARTIKEL = DEFINITION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Dann Geraet</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEL__DANN_GERAET = DEFINITION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Dann</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEL__DANN = DEFINITION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Regel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEL_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 6;


  /**
   * Returns the meta object for class '{@link de.jax.smarthome.regelSprache.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.jax.smarthome.regelSprache.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.jax.smarthome.regelSprache.Model#getDefinitionen <em>Definitionen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitionen</em>'.
   * @see de.jax.smarthome.regelSprache.Model#getDefinitionen()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Definitionen();

  /**
   * Returns the meta object for class '{@link de.jax.smarthome.regelSprache.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see de.jax.smarthome.regelSprache.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for class '{@link de.jax.smarthome.regelSprache.Geraet <em>Geraet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geraet</em>'.
   * @see de.jax.smarthome.regelSprache.Geraet
   * @generated
   */
  EClass getGeraet();

  /**
   * Returns the meta object for the attribute '{@link de.jax.smarthome.regelSprache.Geraet#getArtikel <em>Artikel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artikel</em>'.
   * @see de.jax.smarthome.regelSprache.Geraet#getArtikel()
   * @see #getGeraet()
   * @generated
   */
  EAttribute getGeraet_Artikel();

  /**
   * Returns the meta object for the attribute '{@link de.jax.smarthome.regelSprache.Geraet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.jax.smarthome.regelSprache.Geraet#getName()
   * @see #getGeraet()
   * @generated
   */
  EAttribute getGeraet_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.jax.smarthome.regelSprache.Geraet#getZustaende <em>Zustaende</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Zustaende</em>'.
   * @see de.jax.smarthome.regelSprache.Geraet#getZustaende()
   * @see #getGeraet()
   * @generated
   */
  EReference getGeraet_Zustaende();

  /**
   * Returns the meta object for class '{@link de.jax.smarthome.regelSprache.Zustand <em>Zustand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Zustand</em>'.
   * @see de.jax.smarthome.regelSprache.Zustand
   * @generated
   */
  EClass getZustand();

  /**
   * Returns the meta object for the attribute '{@link de.jax.smarthome.regelSprache.Zustand#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.jax.smarthome.regelSprache.Zustand#getName()
   * @see #getZustand()
   * @generated
   */
  EAttribute getZustand_Name();

  /**
   * Returns the meta object for class '{@link de.jax.smarthome.regelSprache.Regel <em>Regel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regel</em>'.
   * @see de.jax.smarthome.regelSprache.Regel
   * @generated
   */
  EClass getRegel();

  /**
   * Returns the meta object for the attribute '{@link de.jax.smarthome.regelSprache.Regel#getWennArtikel <em>Wenn Artikel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wenn Artikel</em>'.
   * @see de.jax.smarthome.regelSprache.Regel#getWennArtikel()
   * @see #getRegel()
   * @generated
   */
  EAttribute getRegel_WennArtikel();

  /**
   * Returns the meta object for the reference '{@link de.jax.smarthome.regelSprache.Regel#getWennGeraet <em>Wenn Geraet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Wenn Geraet</em>'.
   * @see de.jax.smarthome.regelSprache.Regel#getWennGeraet()
   * @see #getRegel()
   * @generated
   */
  EReference getRegel_WennGeraet();

  /**
   * Returns the meta object for the reference '{@link de.jax.smarthome.regelSprache.Regel#getWenn <em>Wenn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Wenn</em>'.
   * @see de.jax.smarthome.regelSprache.Regel#getWenn()
   * @see #getRegel()
   * @generated
   */
  EReference getRegel_Wenn();

  /**
   * Returns the meta object for the attribute '{@link de.jax.smarthome.regelSprache.Regel#getDannArtikel <em>Dann Artikel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dann Artikel</em>'.
   * @see de.jax.smarthome.regelSprache.Regel#getDannArtikel()
   * @see #getRegel()
   * @generated
   */
  EAttribute getRegel_DannArtikel();

  /**
   * Returns the meta object for the reference '{@link de.jax.smarthome.regelSprache.Regel#getDannGeraet <em>Dann Geraet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dann Geraet</em>'.
   * @see de.jax.smarthome.regelSprache.Regel#getDannGeraet()
   * @see #getRegel()
   * @generated
   */
  EReference getRegel_DannGeraet();

  /**
   * Returns the meta object for the reference '{@link de.jax.smarthome.regelSprache.Regel#getDann <em>Dann</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dann</em>'.
   * @see de.jax.smarthome.regelSprache.Regel#getDann()
   * @see #getRegel()
   * @generated
   */
  EReference getRegel_Dann();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RegelSpracheFactory getRegelSpracheFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.jax.smarthome.regelSprache.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.jax.smarthome.regelSprache.impl.ModelImpl
     * @see de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Definitionen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DEFINITIONEN = eINSTANCE.getModel_Definitionen();

    /**
     * The meta object literal for the '{@link de.jax.smarthome.regelSprache.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.jax.smarthome.regelSprache.impl.DefinitionImpl
     * @see de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '{@link de.jax.smarthome.regelSprache.impl.GeraetImpl <em>Geraet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.jax.smarthome.regelSprache.impl.GeraetImpl
     * @see de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl#getGeraet()
     * @generated
     */
    EClass GERAET = eINSTANCE.getGeraet();

    /**
     * The meta object literal for the '<em><b>Artikel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GERAET__ARTIKEL = eINSTANCE.getGeraet_Artikel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GERAET__NAME = eINSTANCE.getGeraet_Name();

    /**
     * The meta object literal for the '<em><b>Zustaende</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GERAET__ZUSTAENDE = eINSTANCE.getGeraet_Zustaende();

    /**
     * The meta object literal for the '{@link de.jax.smarthome.regelSprache.impl.ZustandImpl <em>Zustand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.jax.smarthome.regelSprache.impl.ZustandImpl
     * @see de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl#getZustand()
     * @generated
     */
    EClass ZUSTAND = eINSTANCE.getZustand();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ZUSTAND__NAME = eINSTANCE.getZustand_Name();

    /**
     * The meta object literal for the '{@link de.jax.smarthome.regelSprache.impl.RegelImpl <em>Regel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.jax.smarthome.regelSprache.impl.RegelImpl
     * @see de.jax.smarthome.regelSprache.impl.RegelSprachePackageImpl#getRegel()
     * @generated
     */
    EClass REGEL = eINSTANCE.getRegel();

    /**
     * The meta object literal for the '<em><b>Wenn Artikel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGEL__WENN_ARTIKEL = eINSTANCE.getRegel_WennArtikel();

    /**
     * The meta object literal for the '<em><b>Wenn Geraet</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGEL__WENN_GERAET = eINSTANCE.getRegel_WennGeraet();

    /**
     * The meta object literal for the '<em><b>Wenn</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGEL__WENN = eINSTANCE.getRegel_Wenn();

    /**
     * The meta object literal for the '<em><b>Dann Artikel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REGEL__DANN_ARTIKEL = eINSTANCE.getRegel_DannArtikel();

    /**
     * The meta object literal for the '<em><b>Dann Geraet</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGEL__DANN_GERAET = eINSTANCE.getRegel_DannGeraet();

    /**
     * The meta object literal for the '<em><b>Dann</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGEL__DANN = eINSTANCE.getRegel_Dann();

  }

} //RegelSprachePackage
