/**
 */
package de.jax.heim.regelsprache;

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
 * @see de.jax.heim.regelsprache.RegelspracheFactory
 * @model kind="package"
 * @generated
 */
public interface RegelsprachePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "regelsprache";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.jax.de/heim/Regelsprache";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "regelsprache";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RegelsprachePackage eINSTANCE = de.jax.heim.regelsprache.impl.RegelsprachePackageImpl.init();

  /**
   * The meta object id for the '{@link de.jax.heim.regelsprache.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.jax.heim.regelsprache.impl.ModelImpl
   * @see de.jax.heim.regelsprache.impl.RegelsprachePackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Deklarationen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DEKLARATIONEN = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.jax.heim.regelsprache.impl.DeklarationImpl <em>Deklaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.jax.heim.regelsprache.impl.DeklarationImpl
   * @see de.jax.heim.regelsprache.impl.RegelsprachePackageImpl#getDeklaration()
   * @generated
   */
  int DEKLARATION = 1;

  /**
   * The number of structural features of the '<em>Deklaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEKLARATION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.jax.heim.regelsprache.impl.GeraetImpl <em>Geraet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.jax.heim.regelsprache.impl.GeraetImpl
   * @see de.jax.heim.regelsprache.impl.RegelsprachePackageImpl#getGeraet()
   * @generated
   */
  int GERAET = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GERAET__NAME = DEKLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Zustaende</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GERAET__ZUSTAENDE = DEKLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Geraet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GERAET_FEATURE_COUNT = DEKLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.jax.heim.regelsprache.impl.ZustandImpl <em>Zustand</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.jax.heim.regelsprache.impl.ZustandImpl
   * @see de.jax.heim.regelsprache.impl.RegelsprachePackageImpl#getZustand()
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
   * The meta object id for the '{@link de.jax.heim.regelsprache.impl.RegelImpl <em>Regel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.jax.heim.regelsprache.impl.RegelImpl
   * @see de.jax.heim.regelsprache.impl.RegelsprachePackageImpl#getRegel()
   * @generated
   */
  int REGEL = 4;

  /**
   * The feature id for the '<em><b>Wenn</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEL__WENN = DEKLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Dann</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEL__DANN = DEKLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Regel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGEL_FEATURE_COUNT = DEKLARATION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link de.jax.heim.regelsprache.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see de.jax.heim.regelsprache.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link de.jax.heim.regelsprache.Model#getDeklarationen <em>Deklarationen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Deklarationen</em>'.
   * @see de.jax.heim.regelsprache.Model#getDeklarationen()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Deklarationen();

  /**
   * Returns the meta object for class '{@link de.jax.heim.regelsprache.Deklaration <em>Deklaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Deklaration</em>'.
   * @see de.jax.heim.regelsprache.Deklaration
   * @generated
   */
  EClass getDeklaration();

  /**
   * Returns the meta object for class '{@link de.jax.heim.regelsprache.Geraet <em>Geraet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Geraet</em>'.
   * @see de.jax.heim.regelsprache.Geraet
   * @generated
   */
  EClass getGeraet();

  /**
   * Returns the meta object for the attribute '{@link de.jax.heim.regelsprache.Geraet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.jax.heim.regelsprache.Geraet#getName()
   * @see #getGeraet()
   * @generated
   */
  EAttribute getGeraet_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.jax.heim.regelsprache.Geraet#getZustaende <em>Zustaende</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Zustaende</em>'.
   * @see de.jax.heim.regelsprache.Geraet#getZustaende()
   * @see #getGeraet()
   * @generated
   */
  EReference getGeraet_Zustaende();

  /**
   * Returns the meta object for class '{@link de.jax.heim.regelsprache.Zustand <em>Zustand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Zustand</em>'.
   * @see de.jax.heim.regelsprache.Zustand
   * @generated
   */
  EClass getZustand();

  /**
   * Returns the meta object for the attribute '{@link de.jax.heim.regelsprache.Zustand#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.jax.heim.regelsprache.Zustand#getName()
   * @see #getZustand()
   * @generated
   */
  EAttribute getZustand_Name();

  /**
   * Returns the meta object for class '{@link de.jax.heim.regelsprache.Regel <em>Regel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Regel</em>'.
   * @see de.jax.heim.regelsprache.Regel
   * @generated
   */
  EClass getRegel();

  /**
   * Returns the meta object for the reference '{@link de.jax.heim.regelsprache.Regel#getWenn <em>Wenn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Wenn</em>'.
   * @see de.jax.heim.regelsprache.Regel#getWenn()
   * @see #getRegel()
   * @generated
   */
  EReference getRegel_Wenn();

  /**
   * Returns the meta object for the containment reference '{@link de.jax.heim.regelsprache.Regel#getDann <em>Dann</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Dann</em>'.
   * @see de.jax.heim.regelsprache.Regel#getDann()
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
  RegelspracheFactory getRegelspracheFactory();

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
     * The meta object literal for the '{@link de.jax.heim.regelsprache.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.jax.heim.regelsprache.impl.ModelImpl
     * @see de.jax.heim.regelsprache.impl.RegelsprachePackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Deklarationen</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DEKLARATIONEN = eINSTANCE.getModel_Deklarationen();

    /**
     * The meta object literal for the '{@link de.jax.heim.regelsprache.impl.DeklarationImpl <em>Deklaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.jax.heim.regelsprache.impl.DeklarationImpl
     * @see de.jax.heim.regelsprache.impl.RegelsprachePackageImpl#getDeklaration()
     * @generated
     */
    EClass DEKLARATION = eINSTANCE.getDeklaration();

    /**
     * The meta object literal for the '{@link de.jax.heim.regelsprache.impl.GeraetImpl <em>Geraet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.jax.heim.regelsprache.impl.GeraetImpl
     * @see de.jax.heim.regelsprache.impl.RegelsprachePackageImpl#getGeraet()
     * @generated
     */
    EClass GERAET = eINSTANCE.getGeraet();

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
     * The meta object literal for the '{@link de.jax.heim.regelsprache.impl.ZustandImpl <em>Zustand</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.jax.heim.regelsprache.impl.ZustandImpl
     * @see de.jax.heim.regelsprache.impl.RegelsprachePackageImpl#getZustand()
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
     * The meta object literal for the '{@link de.jax.heim.regelsprache.impl.RegelImpl <em>Regel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.jax.heim.regelsprache.impl.RegelImpl
     * @see de.jax.heim.regelsprache.impl.RegelsprachePackageImpl#getRegel()
     * @generated
     */
    EClass REGEL = eINSTANCE.getRegel();

    /**
     * The meta object literal for the '<em><b>Wenn</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGEL__WENN = eINSTANCE.getRegel_Wenn();

    /**
     * The meta object literal for the '<em><b>Dann</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REGEL__DANN = eINSTANCE.getRegel_Dann();

  }

} //RegelsprachePackage
