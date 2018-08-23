/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see eaglemodel.EaglemodelFactory
 * @model kind="package"
 * @generated
 */
public interface EaglemodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eaglemodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/eagle/eaglemodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.eagle.eaglemodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EaglemodelPackage eINSTANCE = eaglemodel.impl.EaglemodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link eaglemodel.impl.EagleImpl <em>Eagle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.EagleImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getEagle()
	 * @generated
	 */
	int EAGLE = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAGLE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Compatibility</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAGLE__COMPATIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Drawing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAGLE__DRAWING = 2;

	/**
	 * The number of structural features of the '<em>Eagle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAGLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Eagle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EAGLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.CompatibilityImpl <em>Compatibility</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.CompatibilityImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getCompatibility()
	 * @generated
	 */
	int COMPATIBILITY = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY__NOTE = 0;

	/**
	 * The number of structural features of the '<em>Compatibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Compatibility</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPATIBILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.NoteImpl <em>Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.NoteImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getNote()
	 * @generated
	 */
	int NOTE = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.DrawingImpl <em>Drawing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.DrawingImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getDrawing()
	 * @generated
	 */
	int DRAWING = 3;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING__SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>Grid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING__GRID = 1;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING__LAYERS = 2;

	/**
	 * The feature id for the '<em><b>Schematic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING__SCHEMATIC = 3;

	/**
	 * The number of structural features of the '<em>Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Drawing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.SettingsImpl <em>Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.SettingsImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getSettings()
	 * @generated
	 */
	int SETTINGS = 4;

	/**
	 * The feature id for the '<em><b>Settings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS__SETTINGS = 0;

	/**
	 * The number of structural features of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.SettingImpl <em>Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.SettingImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getSetting()
	 * @generated
	 */
	int SETTING = 5;

	/**
	 * The feature id for the '<em><b>Alwaysvectorfont</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__ALWAYSVECTORFONT = 0;

	/**
	 * The feature id for the '<em><b>Verticaltext</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__VERTICALTEXT = 1;

	/**
	 * The number of structural features of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.GridImpl <em>Grid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.GridImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getGrid()
	 * @generated
	 */
	int GRID = 6;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__DISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Unitdist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__UNITDIST = 1;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__UNIT = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__STYLE = 3;

	/**
	 * The feature id for the '<em><b>Multiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__MULTIPLE = 4;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__DISPLAY = 5;

	/**
	 * The feature id for the '<em><b>Altdistance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ALTDISTANCE = 6;

	/**
	 * The feature id for the '<em><b>Altunitdist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ALTUNITDIST = 7;

	/**
	 * The feature id for the '<em><b>Altunit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID__ALTUNIT = 8;

	/**
	 * The number of structural features of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Grid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.LayersImpl <em>Layers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.LayersImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getLayers()
	 * @generated
	 */
	int LAYERS = 7;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERS__LAYERS = 0;

	/**
	 * The number of structural features of the '<em>Layers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Layers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.LayerImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 8;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__COLOR = 2;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__FILL = 3;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__VISIBLE = 4;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__ACTIVE = 5;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.SchematicImpl <em>Schematic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.SchematicImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getSchematic()
	 * @generated
	 */
	int SCHEMATIC = 9;

	/**
	 * The feature id for the '<em><b>Xreflabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC__XREFLABEL = 0;

	/**
	 * The feature id for the '<em><b>Xrefpart</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC__XREFPART = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Libraries</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC__LIBRARIES = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC__ATTRIBUTES = 4;

	/**
	 * The feature id for the '<em><b>Variantdefs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC__VARIANTDEFS = 5;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC__CLASSES = 6;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC__PARTS = 7;

	/**
	 * The feature id for the '<em><b>Sheets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC__SHEETS = 8;

	/**
	 * The feature id for the '<em><b>Errors</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC__ERRORS = 9;

	/**
	 * The number of structural features of the '<em>Schematic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Schematic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMATIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.DescriptionImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 10;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.LibrariesImpl <em>Libraries</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.LibrariesImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getLibraries()
	 * @generated
	 */
	int LIBRARIES = 11;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES__LIBRARY = 0;

	/**
	 * The number of structural features of the '<em>Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Libraries</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.LibraryImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__PACKAGES = 2;

	/**
	 * The feature id for the '<em><b>Symbols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__SYMBOLS = 3;

	/**
	 * The feature id for the '<em><b>Devicesets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__DEVICESETS = 4;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.AttributesImpl <em>Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.AttributesImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getAttributes()
	 * @generated
	 */
	int ATTRIBUTES = 13;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES__ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.AttributeImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__Y = 3;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SIZE = 4;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__LAYER = 5;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FONT = 6;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RATIO = 7;

	/**
	 * The feature id for the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ROT = 8;

	/**
	 * The feature id for the '<em><b>Display</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DISPLAY = 9;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONSTANT = 10;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.VariantdefsImpl <em>Variantdefs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.VariantdefsImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getVariantdefs()
	 * @generated
	 */
	int VARIANTDEFS = 15;

	/**
	 * The feature id for the '<em><b>Variantdef</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTDEFS__VARIANTDEF = 0;

	/**
	 * The number of structural features of the '<em>Variantdefs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTDEFS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variantdefs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTDEFS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.VariantdefImpl <em>Variantdef</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.VariantdefImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getVariantdef()
	 * @generated
	 */
	int VARIANTDEF = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTDEF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTDEF__CURRENT = 1;

	/**
	 * The number of structural features of the '<em>Variantdef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTDEF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variantdef</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANTDEF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.VariantImpl <em>Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.VariantImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getVariant()
	 * @generated
	 */
	int VARIANT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Populate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__POPULATE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__VALUE = 2;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT__TECHNOLOGY = 3;

	/**
	 * The number of structural features of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.ClassesImpl <em>Classes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.ClassesImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getClasses()
	 * @generated
	 */
	int CLASSES = 18;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES__CLASS = 0;

	/**
	 * The number of structural features of the '<em>Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Classes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.ClassImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 19;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Drill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__DRILL = 3;

	/**
	 * The feature id for the '<em><b>Clearance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__CLEARANCE = 4;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.ClearanceImpl <em>Clearance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.ClearanceImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getClearance()
	 * @generated
	 */
	int CLEARANCE = 20;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Clearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Clearance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLEARANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.PartsImpl <em>Parts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.PartsImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getParts()
	 * @generated
	 */
	int PARTS = 21;

	/**
	 * The feature id for the '<em><b>Part</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS__PART = 0;

	/**
	 * The number of structural features of the '<em>Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Parts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.PartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.PartImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPart()
	 * @generated
	 */
	int PART = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__NAME = 0;

	/**
	 * The feature id for the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__LIBRARY = 1;

	/**
	 * The feature id for the '<em><b>Deviceset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__DEVICESET = 2;

	/**
	 * The feature id for the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__DEVICE = 3;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__TECHNOLOGY = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__GATE = 6;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__X = 7;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__Y = 8;

	/**
	 * The feature id for the '<em><b>Smashed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__SMASHED = 9;

	/**
	 * The feature id for the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ROT = 10;

	/**
	 * The feature id for the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__UID = 11;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Variant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART__VARIANT = 13;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.SheetsImpl <em>Sheets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.SheetsImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getSheets()
	 * @generated
	 */
	int SHEETS = 23;

	/**
	 * The feature id for the '<em><b>Sheet</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEETS__SHEET = 0;

	/**
	 * The number of structural features of the '<em>Sheets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sheets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.SheetImpl <em>Sheet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.SheetImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getSheet()
	 * @generated
	 */
	int SHEET = 24;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Plain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__PLAIN = 1;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Busses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__BUSSES = 3;

	/**
	 * The feature id for the '<em><b>Nets</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET__NETS = 4;

	/**
	 * The number of structural features of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sheet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.ErrorsImpl <em>Errors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.ErrorsImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getErrors()
	 * @generated
	 */
	int ERRORS = 25;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRORS__ERROR = 0;

	/**
	 * The number of structural features of the '<em>Errors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRORS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Errors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERRORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.PackagesImpl <em>Packages</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.PackagesImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPackages()
	 * @generated
	 */
	int PACKAGES = 26;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES__PACKAGE = 0;

	/**
	 * The number of structural features of the '<em>Packages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Packages</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.PackageImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__POLYGON = 2;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__WIRE = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__DIMENSION = 5;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CIRCLE = 6;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__RECTANGLE = 7;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__FRAME = 8;

	/**
	 * The feature id for the '<em><b>Hole</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__HOLE = 9;

	/**
	 * The feature id for the '<em><b>Pad</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PAD = 10;

	/**
	 * The feature id for the '<em><b>Smd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__SMD = 11;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.SymbolsImpl <em>Symbols</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.SymbolsImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getSymbols()
	 * @generated
	 */
	int SYMBOLS = 28;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLS__SYMBOL = 0;

	/**
	 * The number of structural features of the '<em>Symbols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Symbols</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.SymbolImpl <em>Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.SymbolImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getSymbol()
	 * @generated
	 */
	int SYMBOL = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__POLYGON = 2;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__WIRE = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__TEXT = 4;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__DIMENSION = 5;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__PIN = 6;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__CIRCLE = 7;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__RECTANGLE = 8;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL__FRAME = 9;

	/**
	 * The number of structural features of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.DevicesetsImpl <em>Devicesets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.DevicesetsImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getDevicesets()
	 * @generated
	 */
	int DEVICESETS = 30;

	/**
	 * The feature id for the '<em><b>Deviceset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESETS__DEVICESET = 0;

	/**
	 * The number of structural features of the '<em>Devicesets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Devicesets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.DevicesetImpl <em>Deviceset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.DevicesetImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getDeviceset()
	 * @generated
	 */
	int DEVICESET = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESET__PREFIX = 1;

	/**
	 * The feature id for the '<em><b>Uservalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESET__USERVALUE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESET__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Gates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESET__GATES = 4;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESET__DEVICES = 5;

	/**
	 * The number of structural features of the '<em>Deviceset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESET_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Deviceset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICESET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.PolygonImpl <em>Polygon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.PolygonImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPolygon()
	 * @generated
	 */
	int POLYGON = 32;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__WIDTH = 0;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__LAYER = 1;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__SPACING = 2;

	/**
	 * The feature id for the '<em><b>Pour</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__POUR = 3;

	/**
	 * The feature id for the '<em><b>Isolate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__ISOLATE = 4;

	/**
	 * The feature id for the '<em><b>Orphans</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__ORPHANS = 5;

	/**
	 * The feature id for the '<em><b>Thermals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__THERMALS = 6;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__RANK = 7;

	/**
	 * The feature id for the '<em><b>Vertex</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON__VERTEX = 8;

	/**
	 * The number of structural features of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Polygon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POLYGON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.VertexImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 33;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__Y = 1;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__CURVE = 2;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.WireImpl <em>Wire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.WireImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getWire()
	 * @generated
	 */
	int WIRE = 34;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__X1 = 0;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__Y1 = 1;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__X2 = 2;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__Y2 = 3;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__WIDTH = 4;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__LAYER = 5;

	/**
	 * The feature id for the '<em><b>Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__EXTENT = 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__STYLE = 7;

	/**
	 * The feature id for the '<em><b>Curve</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__CURVE = 8;

	/**
	 * The feature id for the '<em><b>Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE__CAP = 9;

	/**
	 * The number of structural features of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Wire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WIRE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.TextImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 35;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__Y = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__LAYER = 3;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__FONT = 4;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__RATIO = 5;

	/**
	 * The feature id for the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ROT = 6;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__ALIGN = 7;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__DISTANCE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__VALUE = 9;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.DimensionImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 36;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__X1 = 0;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__Y1 = 1;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__X2 = 2;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__Y2 = 3;

	/**
	 * The feature id for the '<em><b>X3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__X3 = 4;

	/**
	 * The feature id for the '<em><b>Y3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__Y3 = 5;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__LAYER = 6;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__DTYPE = 7;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__WIDTH = 8;

	/**
	 * The feature id for the '<em><b>Extwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__EXTWIDTH = 9;

	/**
	 * The feature id for the '<em><b>Extlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__EXTLENGTH = 10;

	/**
	 * The feature id for the '<em><b>Extoffset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__EXTOFFSET = 11;

	/**
	 * The feature id for the '<em><b>Textsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__TEXTSIZE = 12;

	/**
	 * The feature id for the '<em><b>Textratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__TEXTRATIO = 13;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__UNIT = 14;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__PRECISION = 15;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__VISIBLE = 16;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.PinImpl <em>Pin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.PinImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPin()
	 * @generated
	 */
	int PIN = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__Y = 2;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__VISIBLE = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__DIRECTION = 5;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__FUNCTION = 6;

	/**
	 * The feature id for the '<em><b>Swaplevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__SWAPLEVEL = 7;

	/**
	 * The feature id for the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN__ROT = 8;

	/**
	 * The number of structural features of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Pin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.CircleImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 38;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__Y = 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__LAYER = 4;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.RectangleImpl <em>Rectangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.RectangleImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 39;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__X1 = 0;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__Y1 = 1;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__X2 = 2;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__Y2 = 3;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__LAYER = 4;

	/**
	 * The feature id for the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE__ROT = 5;

	/**
	 * The number of structural features of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rectangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECTANGLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.FrameImpl <em>Frame</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.FrameImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getFrame()
	 * @generated
	 */
	int FRAME = 40;

	/**
	 * The feature id for the '<em><b>X1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__X1 = 0;

	/**
	 * The feature id for the '<em><b>Y1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__Y1 = 1;

	/**
	 * The feature id for the '<em><b>X2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__X2 = 2;

	/**
	 * The feature id for the '<em><b>Y2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__Y2 = 3;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__COLUMNS = 4;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__ROWS = 5;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__LAYER = 6;

	/**
	 * The feature id for the '<em><b>Borderleft</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__BORDERLEFT = 7;

	/**
	 * The feature id for the '<em><b>Bordertop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__BORDERTOP = 8;

	/**
	 * The feature id for the '<em><b>Borderright</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__BORDERRIGHT = 9;

	/**
	 * The feature id for the '<em><b>Borderbottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME__BORDERBOTTOM = 10;

	/**
	 * The number of structural features of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Frame</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.HoleImpl <em>Hole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.HoleImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getHole()
	 * @generated
	 */
	int HOLE = 41;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE__Y = 1;

	/**
	 * The feature id for the '<em><b>Drill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE__DRILL = 2;

	/**
	 * The number of structural features of the '<em>Hole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Hole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.PadImpl <em>Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.PadImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPad()
	 * @generated
	 */
	int PAD = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__NAME = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__Y = 2;

	/**
	 * The feature id for the '<em><b>Drill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__DRILL = 3;

	/**
	 * The feature id for the '<em><b>Diameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__DIAMETER = 4;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__SHAPE = 5;

	/**
	 * The feature id for the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__ROT = 6;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__STOP = 7;

	/**
	 * The feature id for the '<em><b>Thermals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__THERMALS = 8;

	/**
	 * The feature id for the '<em><b>First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD__FIRST = 9;

	/**
	 * The number of structural features of the '<em>Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.SMDImpl <em>SMD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.SMDImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getSMD()
	 * @generated
	 */
	int SMD = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__NAME = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__Y = 2;

	/**
	 * The feature id for the '<em><b>Dx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__DX = 3;

	/**
	 * The feature id for the '<em><b>Dy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__DY = 4;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__LAYER = 5;

	/**
	 * The feature id for the '<em><b>Roundness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__ROUNDNESS = 6;

	/**
	 * The feature id for the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__ROT = 7;

	/**
	 * The feature id for the '<em><b>Stop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__STOP = 8;

	/**
	 * The feature id for the '<em><b>Thermals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__THERMALS = 9;

	/**
	 * The feature id for the '<em><b>Cream</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD__CREAM = 10;

	/**
	 * The number of structural features of the '<em>SMD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>SMD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.GatesImpl <em>Gates</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.GatesImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getGates()
	 * @generated
	 */
	int GATES = 44;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATES__GATE = 0;

	/**
	 * The number of structural features of the '<em>Gates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Gates</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.GateImpl <em>Gate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.GateImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getGate()
	 * @generated
	 */
	int GATE = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__Y = 3;

	/**
	 * The feature id for the '<em><b>Addlevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__ADDLEVEL = 4;

	/**
	 * The feature id for the '<em><b>Swaplevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE__SWAPLEVEL = 5;

	/**
	 * The number of structural features of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Gate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.DevicesImpl <em>Devices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.DevicesImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getDevices()
	 * @generated
	 */
	int DEVICES = 46;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES__DEVICE = 0;

	/**
	 * The number of structural features of the '<em>Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.DeviceImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Connects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__CONNECTS = 2;

	/**
	 * The feature id for the '<em><b>Technologies</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TECHNOLOGIES = 3;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.ConnectsImpl <em>Connects</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.ConnectsImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getConnects()
	 * @generated
	 */
	int CONNECTS = 48;

	/**
	 * The feature id for the '<em><b>Connect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTS__CONNECT = 0;

	/**
	 * The number of structural features of the '<em>Connects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Connects</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.ConnectImpl <em>Connect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.ConnectImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getConnect()
	 * @generated
	 */
	int CONNECT = 49;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__GATE = 0;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__PIN = 1;

	/**
	 * The feature id for the '<em><b>Pad</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__PAD = 2;

	/**
	 * The feature id for the '<em><b>Route</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT__ROUTE = 3;

	/**
	 * The number of structural features of the '<em>Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Connect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.TechnologiesImpl <em>Technologies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.TechnologiesImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getTechnologies()
	 * @generated
	 */
	int TECHNOLOGIES = 50;

	/**
	 * The feature id for the '<em><b>Technology</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGIES__TECHNOLOGY = 0;

	/**
	 * The number of structural features of the '<em>Technologies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Technologies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.TechnologyImpl <em>Technology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.TechnologyImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getTechnology()
	 * @generated
	 */
	int TECHNOLOGY = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Technology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TECHNOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.PlainImpl <em>Plain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.PlainImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPlain()
	 * @generated
	 */
	int PLAIN = 52;

	/**
	 * The feature id for the '<em><b>Polygon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN__POLYGON = 0;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN__WIRE = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN__TEXT = 2;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN__DIMENSION = 3;

	/**
	 * The feature id for the '<em><b>Circle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN__CIRCLE = 4;

	/**
	 * The feature id for the '<em><b>Rectangle</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN__RECTANGLE = 5;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN__FRAME = 6;

	/**
	 * The feature id for the '<em><b>Hole</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN__HOLE = 7;

	/**
	 * The number of structural features of the '<em>Plain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Plain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.InstancesImpl <em>Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.InstancesImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getInstances()
	 * @generated
	 */
	int INSTANCES = 53;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCES__INSTANCE = 0;

	/**
	 * The number of structural features of the '<em>Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.InstanceImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 54;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PART = 0;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__GATE = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__X = 2;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__Y = 3;

	/**
	 * The feature id for the '<em><b>Smashed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__SMASHED = 4;

	/**
	 * The feature id for the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ROT = 5;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ATTRIBUTE = 6;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.BussesImpl <em>Busses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.BussesImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getBusses()
	 * @generated
	 */
	int BUSSES = 55;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSES__BUS = 0;

	/**
	 * The number of structural features of the '<em>Busses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Busses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.BusImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getBus()
	 * @generated
	 */
	int BUS = 56;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__NAME = 0;

	/**
	 * The feature id for the '<em><b>Segment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__SEGMENT = 1;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.NetsImpl <em>Nets</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.NetsImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getNets()
	 * @generated
	 */
	int NETS = 57;

	/**
	 * The feature id for the '<em><b>Net</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETS__NET = 0;

	/**
	 * The number of structural features of the '<em>Nets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nets</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NETS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.NetImpl <em>Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.NetImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getNet()
	 * @generated
	 */
	int NET = 58;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Segment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET__SEGMENT = 2;

	/**
	 * The number of structural features of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.SegmentImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 59;

	/**
	 * The feature id for the '<em><b>Pinref</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__PINREF = 0;

	/**
	 * The feature id for the '<em><b>Wire</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__WIRE = 1;

	/**
	 * The feature id for the '<em><b>Junction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__JUNCTION = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__LABEL = 3;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.PinrefImpl <em>Pinref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.PinrefImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPinref()
	 * @generated
	 */
	int PINREF = 60;

	/**
	 * The feature id for the '<em><b>Part</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINREF__PART = 0;

	/**
	 * The feature id for the '<em><b>Gate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINREF__GATE = 1;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINREF__PIN = 2;

	/**
	 * The number of structural features of the '<em>Pinref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINREF_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Pinref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PINREF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.JunctionImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 61;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__Y = 1;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.LabelImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 62;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__Y = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LAYER = 3;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT = 4;

	/**
	 * The feature id for the '<em><b>Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__RATIO = 5;

	/**
	 * The feature id for the '<em><b>Rot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ROT = 6;

	/**
	 * The feature id for the '<em><b>Xref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__XREF = 7;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.impl.ApprovedImpl <em>Approved</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.impl.ApprovedImpl
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getApproved()
	 * @generated
	 */
	int APPROVED = 63;

	/**
	 * The feature id for the '<em><b>Hash</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED__HASH = 0;

	/**
	 * The number of structural features of the '<em>Approved</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Approved</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPROVED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eaglemodel.Severity <em>Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.Severity
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getSeverity()
	 * @generated
	 */
	int SEVERITY = 64;

	/**
	 * The meta object id for the '{@link eaglemodel.GateAddLevel <em>Gate Add Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.GateAddLevel
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getGateAddLevel()
	 * @generated
	 */
	int GATE_ADD_LEVEL = 65;

	/**
	 * The meta object id for the '{@link eaglemodel.WireStyle <em>Wire Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.WireStyle
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getWireStyle()
	 * @generated
	 */
	int WIRE_STYLE = 66;

	/**
	 * The meta object id for the '{@link eaglemodel.WireCap <em>Wire Cap</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.WireCap
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getWireCap()
	 * @generated
	 */
	int WIRE_CAP = 67;

	/**
	 * The meta object id for the '{@link eaglemodel.DimensionType <em>Dimension Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.DimensionType
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getDimensionType()
	 * @generated
	 */
	int DIMENSION_TYPE = 68;

	/**
	 * The meta object id for the '{@link eaglemodel.GridUnit <em>Grid Unit</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.GridUnit
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getGridUnit()
	 * @generated
	 */
	int GRID_UNIT = 69;

	/**
	 * The meta object id for the '{@link eaglemodel.GridStyle <em>Grid Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.GridStyle
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getGridStyle()
	 * @generated
	 */
	int GRID_STYLE = 70;

	/**
	 * The meta object id for the '{@link eaglemodel.TextFont <em>Text Font</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.TextFont
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getTextFont()
	 * @generated
	 */
	int TEXT_FONT = 71;

	/**
	 * The meta object id for the '{@link eaglemodel.Align <em>Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.Align
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getAlign()
	 * @generated
	 */
	int ALIGN = 72;

	/**
	 * The meta object id for the '{@link eaglemodel.PadShape <em>Pad Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.PadShape
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPadShape()
	 * @generated
	 */
	int PAD_SHAPE = 73;

	/**
	 * The meta object id for the '{@link eaglemodel.PolygonPour <em>Polygon Pour</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.PolygonPour
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPolygonPour()
	 * @generated
	 */
	int POLYGON_POUR = 74;

	/**
	 * The meta object id for the '{@link eaglemodel.PinVisible <em>Pin Visible</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.PinVisible
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPinVisible()
	 * @generated
	 */
	int PIN_VISIBLE = 75;

	/**
	 * The meta object id for the '{@link eaglemodel.PinLength <em>Pin Length</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.PinLength
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPinLength()
	 * @generated
	 */
	int PIN_LENGTH = 76;

	/**
	 * The meta object id for the '{@link eaglemodel.PinDirection <em>Pin Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.PinDirection
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPinDirection()
	 * @generated
	 */
	int PIN_DIRECTION = 77;

	/**
	 * The meta object id for the '{@link eaglemodel.PinFunction <em>Pin Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.PinFunction
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getPinFunction()
	 * @generated
	 */
	int PIN_FUNCTION = 78;

	/**
	 * The meta object id for the '{@link eaglemodel.ContactRoute <em>Contact Route</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.ContactRoute
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getContactRoute()
	 * @generated
	 */
	int CONTACT_ROUTE = 79;

	/**
	 * The meta object id for the '{@link eaglemodel.AttributeDisplay <em>Attribute Display</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.AttributeDisplay
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getAttributeDisplay()
	 * @generated
	 */
	int ATTRIBUTE_DISPLAY = 80;

	/**
	 * The meta object id for the '{@link eaglemodel.VerticalText <em>Vertical Text</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eaglemodel.VerticalText
	 * @see eaglemodel.impl.EaglemodelPackageImpl#getVerticalText()
	 * @generated
	 */
	int VERTICAL_TEXT = 81;


	/**
	 * Returns the meta object for class '{@link eaglemodel.Eagle <em>Eagle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eagle</em>'.
	 * @see eaglemodel.Eagle
	 * @generated
	 */
	EClass getEagle();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Eagle#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see eaglemodel.Eagle#getVersion()
	 * @see #getEagle()
	 * @generated
	 */
	EAttribute getEagle_Version();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Eagle#getCompatibility <em>Compatibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compatibility</em>'.
	 * @see eaglemodel.Eagle#getCompatibility()
	 * @see #getEagle()
	 * @generated
	 */
	EReference getEagle_Compatibility();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Eagle#getDrawing <em>Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Drawing</em>'.
	 * @see eaglemodel.Eagle#getDrawing()
	 * @see #getEagle()
	 * @generated
	 */
	EReference getEagle_Drawing();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Compatibility <em>Compatibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compatibility</em>'.
	 * @see eaglemodel.Compatibility
	 * @generated
	 */
	EClass getCompatibility();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Compatibility#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see eaglemodel.Compatibility#getNote()
	 * @see #getCompatibility()
	 * @generated
	 */
	EReference getCompatibility_Note();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Note <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note</em>'.
	 * @see eaglemodel.Note
	 * @generated
	 */
	EClass getNote();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Note#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see eaglemodel.Note#getVersion()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Version();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Note#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see eaglemodel.Note#getSeverity()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Severity();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Note#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eaglemodel.Note#getValue()
	 * @see #getNote()
	 * @generated
	 */
	EAttribute getNote_Value();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Drawing <em>Drawing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawing</em>'.
	 * @see eaglemodel.Drawing
	 * @generated
	 */
	EClass getDrawing();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Drawing#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Settings</em>'.
	 * @see eaglemodel.Drawing#getSettings()
	 * @see #getDrawing()
	 * @generated
	 */
	EReference getDrawing_Settings();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Drawing#getGrid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Grid</em>'.
	 * @see eaglemodel.Drawing#getGrid()
	 * @see #getDrawing()
	 * @generated
	 */
	EReference getDrawing_Grid();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Drawing#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layers</em>'.
	 * @see eaglemodel.Drawing#getLayers()
	 * @see #getDrawing()
	 * @generated
	 */
	EReference getDrawing_Layers();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Drawing#getSchematic <em>Schematic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schematic</em>'.
	 * @see eaglemodel.Drawing#getSchematic()
	 * @see #getDrawing()
	 * @generated
	 */
	EReference getDrawing_Schematic();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Settings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings</em>'.
	 * @see eaglemodel.Settings
	 * @generated
	 */
	EClass getSettings();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Settings#getSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Settings</em>'.
	 * @see eaglemodel.Settings#getSettings()
	 * @see #getSettings()
	 * @generated
	 */
	EReference getSettings_Settings();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting</em>'.
	 * @see eaglemodel.Setting
	 * @generated
	 */
	EClass getSetting();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Setting#isAlwaysvectorfont <em>Alwaysvectorfont</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alwaysvectorfont</em>'.
	 * @see eaglemodel.Setting#isAlwaysvectorfont()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Alwaysvectorfont();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Setting#getVerticaltext <em>Verticaltext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verticaltext</em>'.
	 * @see eaglemodel.Setting#getVerticaltext()
	 * @see #getSetting()
	 * @generated
	 */
	EAttribute getSetting_Verticaltext();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid</em>'.
	 * @see eaglemodel.Grid
	 * @generated
	 */
	EClass getGrid();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Grid#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see eaglemodel.Grid#getDistance()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Distance();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Grid#getUnitdist <em>Unitdist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unitdist</em>'.
	 * @see eaglemodel.Grid#getUnitdist()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Unitdist();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Grid#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see eaglemodel.Grid#getUnit()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Unit();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Grid#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see eaglemodel.Grid#getStyle()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Style();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Grid#getMultiple <em>Multiple</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiple</em>'.
	 * @see eaglemodel.Grid#getMultiple()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Multiple();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Grid#isDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see eaglemodel.Grid#isDisplay()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Display();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Grid#getAltdistance <em>Altdistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altdistance</em>'.
	 * @see eaglemodel.Grid#getAltdistance()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Altdistance();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Grid#getAltunitdist <em>Altunitdist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altunitdist</em>'.
	 * @see eaglemodel.Grid#getAltunitdist()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Altunitdist();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Grid#getAltunit <em>Altunit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Altunit</em>'.
	 * @see eaglemodel.Grid#getAltunit()
	 * @see #getGrid()
	 * @generated
	 */
	EAttribute getGrid_Altunit();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Layers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layers</em>'.
	 * @see eaglemodel.Layers
	 * @generated
	 */
	EClass getLayers();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Layers#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see eaglemodel.Layers#getLayers()
	 * @see #getLayers()
	 * @generated
	 */
	EReference getLayers_Layers();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see eaglemodel.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Layer#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see eaglemodel.Layer#getNumber()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Number();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Layer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Layer#getName()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Layer#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see eaglemodel.Layer#getColor()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Color();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Layer#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see eaglemodel.Layer#getFill()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Fill();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Layer#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see eaglemodel.Layer#isVisible()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Visible();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Layer#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see eaglemodel.Layer#isActive()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Active();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Schematic <em>Schematic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schematic</em>'.
	 * @see eaglemodel.Schematic
	 * @generated
	 */
	EClass getSchematic();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Schematic#getXreflabel <em>Xreflabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xreflabel</em>'.
	 * @see eaglemodel.Schematic#getXreflabel()
	 * @see #getSchematic()
	 * @generated
	 */
	EAttribute getSchematic_Xreflabel();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Schematic#getXrefpart <em>Xrefpart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xrefpart</em>'.
	 * @see eaglemodel.Schematic#getXrefpart()
	 * @see #getSchematic()
	 * @generated
	 */
	EAttribute getSchematic_Xrefpart();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Schematic#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see eaglemodel.Schematic#getDescription()
	 * @see #getSchematic()
	 * @generated
	 */
	EReference getSchematic_Description();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Schematic#getLibraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Libraries</em>'.
	 * @see eaglemodel.Schematic#getLibraries()
	 * @see #getSchematic()
	 * @generated
	 */
	EReference getSchematic_Libraries();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Schematic#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attributes</em>'.
	 * @see eaglemodel.Schematic#getAttributes()
	 * @see #getSchematic()
	 * @generated
	 */
	EReference getSchematic_Attributes();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Schematic#getVariantdefs <em>Variantdefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variantdefs</em>'.
	 * @see eaglemodel.Schematic#getVariantdefs()
	 * @see #getSchematic()
	 * @generated
	 */
	EReference getSchematic_Variantdefs();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Schematic#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Classes</em>'.
	 * @see eaglemodel.Schematic#getClasses()
	 * @see #getSchematic()
	 * @generated
	 */
	EReference getSchematic_Classes();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Schematic#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parts</em>'.
	 * @see eaglemodel.Schematic#getParts()
	 * @see #getSchematic()
	 * @generated
	 */
	EReference getSchematic_Parts();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Schematic#getSheets <em>Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sheets</em>'.
	 * @see eaglemodel.Schematic#getSheets()
	 * @see #getSchematic()
	 * @generated
	 */
	EReference getSchematic_Sheets();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Schematic#getErrors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Errors</em>'.
	 * @see eaglemodel.Schematic#getErrors()
	 * @see #getSchematic()
	 * @generated
	 */
	EReference getSchematic_Errors();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see eaglemodel.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Description#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see eaglemodel.Description#getLanguage()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Language();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Description#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eaglemodel.Description#getValue()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Value();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Libraries <em>Libraries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Libraries</em>'.
	 * @see eaglemodel.Libraries
	 * @generated
	 */
	EClass getLibraries();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Libraries#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library</em>'.
	 * @see eaglemodel.Libraries#getLibrary()
	 * @see #getLibraries()
	 * @generated
	 */
	EReference getLibraries_Library();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see eaglemodel.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Library#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Library#getName()
	 * @see #getLibrary()
	 * @generated
	 */
	EAttribute getLibrary_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Library#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see eaglemodel.Library#getDescription()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Description();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Library#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Packages</em>'.
	 * @see eaglemodel.Library#getPackages()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Packages();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Library#getSymbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Symbols</em>'.
	 * @see eaglemodel.Library#getSymbols()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Symbols();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Library#getDevicesets <em>Devicesets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devicesets</em>'.
	 * @see eaglemodel.Library#getDevicesets()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_Devicesets();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributes</em>'.
	 * @see eaglemodel.Attributes
	 * @generated
	 */
	EClass getAttributes();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Attributes#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see eaglemodel.Attributes#getAttribute()
	 * @see #getAttributes()
	 * @generated
	 */
	EReference getAttributes_Attribute();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see eaglemodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eaglemodel.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Attribute#getX()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Attribute#getY()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see eaglemodel.Attribute#getSize()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Size();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eaglemodel.Attribute#getLayer()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Layer();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see eaglemodel.Attribute#getFont()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Font();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see eaglemodel.Attribute#getRatio()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Ratio();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#getRot <em>Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rot</em>'.
	 * @see eaglemodel.Attribute#getRot()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Rot();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display</em>'.
	 * @see eaglemodel.Attribute#getDisplay()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Display();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Attribute#isConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constant</em>'.
	 * @see eaglemodel.Attribute#isConstant()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Constant();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Variantdefs <em>Variantdefs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variantdefs</em>'.
	 * @see eaglemodel.Variantdefs
	 * @generated
	 */
	EClass getVariantdefs();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Variantdefs#getVariantdef <em>Variantdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variantdef</em>'.
	 * @see eaglemodel.Variantdefs#getVariantdef()
	 * @see #getVariantdefs()
	 * @generated
	 */
	EReference getVariantdefs_Variantdef();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Variantdef <em>Variantdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variantdef</em>'.
	 * @see eaglemodel.Variantdef
	 * @generated
	 */
	EClass getVariantdef();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Variantdef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Variantdef#getName()
	 * @see #getVariantdef()
	 * @generated
	 */
	EAttribute getVariantdef_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Variantdef#isCurrent <em>Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current</em>'.
	 * @see eaglemodel.Variantdef#isCurrent()
	 * @see #getVariantdef()
	 * @generated
	 */
	EAttribute getVariantdef_Current();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Variant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variant</em>'.
	 * @see eaglemodel.Variant
	 * @generated
	 */
	EClass getVariant();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Variant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Variant#getName()
	 * @see #getVariant()
	 * @generated
	 */
	EAttribute getVariant_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Variant#isPopulate <em>Populate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Populate</em>'.
	 * @see eaglemodel.Variant#isPopulate()
	 * @see #getVariant()
	 * @generated
	 */
	EAttribute getVariant_Populate();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Variant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eaglemodel.Variant#getValue()
	 * @see #getVariant()
	 * @generated
	 */
	EAttribute getVariant_Value();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Variant#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see eaglemodel.Variant#getTechnology()
	 * @see #getVariant()
	 * @generated
	 */
	EAttribute getVariant_Technology();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Classes <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classes</em>'.
	 * @see eaglemodel.Classes
	 * @generated
	 */
	EClass getClasses();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Classes#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see eaglemodel.Classes#getClass_()
	 * @see #getClasses()
	 * @generated
	 */
	EReference getClasses_Class();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see eaglemodel.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Class#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see eaglemodel.Class#getNumber()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Number();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Class#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see eaglemodel.Class#getWidth()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Width();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Class#getDrill <em>Drill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drill</em>'.
	 * @see eaglemodel.Class#getDrill()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Drill();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Class#getClearance <em>Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clearance</em>'.
	 * @see eaglemodel.Class#getClearance()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Clearance();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Clearance <em>Clearance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clearance</em>'.
	 * @see eaglemodel.Clearance
	 * @generated
	 */
	EClass getClearance();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Clearance#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see eaglemodel.Clearance#getClass_()
	 * @see #getClearance()
	 * @generated
	 */
	EAttribute getClearance_Class();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Clearance#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eaglemodel.Clearance#getValue()
	 * @see #getClearance()
	 * @generated
	 */
	EAttribute getClearance_Value();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Parts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parts</em>'.
	 * @see eaglemodel.Parts
	 * @generated
	 */
	EClass getParts();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Parts#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Part</em>'.
	 * @see eaglemodel.Parts#getPart()
	 * @see #getParts()
	 * @generated
	 */
	EReference getParts_Part();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see eaglemodel.Part
	 * @generated
	 */
	EClass getPart();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Part#getName()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Library</em>'.
	 * @see eaglemodel.Part#getLibrary()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Library();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getDeviceset <em>Deviceset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deviceset</em>'.
	 * @see eaglemodel.Part#getDeviceset()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Deviceset();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device</em>'.
	 * @see eaglemodel.Part#getDevice()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Device();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Technology</em>'.
	 * @see eaglemodel.Part#getTechnology()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Technology();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eaglemodel.Part#getValue()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Value();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gate</em>'.
	 * @see eaglemodel.Part#getGate()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Gate();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Part#getX()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Part#getY()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#isSmashed <em>Smashed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smashed</em>'.
	 * @see eaglemodel.Part#isSmashed()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Smashed();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getRot <em>Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rot</em>'.
	 * @see eaglemodel.Part#getRot()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Rot();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Part#getUid <em>Uid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uid</em>'.
	 * @see eaglemodel.Part#getUid()
	 * @see #getPart()
	 * @generated
	 */
	EAttribute getPart_Uid();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Part#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see eaglemodel.Part#getAttribute()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Part#getVariant <em>Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variant</em>'.
	 * @see eaglemodel.Part#getVariant()
	 * @see #getPart()
	 * @generated
	 */
	EReference getPart_Variant();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Sheets <em>Sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sheets</em>'.
	 * @see eaglemodel.Sheets
	 * @generated
	 */
	EClass getSheets();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Sheets#getSheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sheet</em>'.
	 * @see eaglemodel.Sheets#getSheet()
	 * @see #getSheets()
	 * @generated
	 */
	EReference getSheets_Sheet();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Sheet <em>Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sheet</em>'.
	 * @see eaglemodel.Sheet
	 * @generated
	 */
	EClass getSheet();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Sheet#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see eaglemodel.Sheet#getDescription()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Description();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Sheet#getPlain <em>Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Plain</em>'.
	 * @see eaglemodel.Sheet#getPlain()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Plain();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Sheet#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instances</em>'.
	 * @see eaglemodel.Sheet#getInstances()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Instances();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Sheet#getBusses <em>Busses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Busses</em>'.
	 * @see eaglemodel.Sheet#getBusses()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Busses();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Sheet#getNets <em>Nets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nets</em>'.
	 * @see eaglemodel.Sheet#getNets()
	 * @see #getSheet()
	 * @generated
	 */
	EReference getSheet_Nets();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Errors <em>Errors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Errors</em>'.
	 * @see eaglemodel.Errors
	 * @generated
	 */
	EClass getErrors();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Errors#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error</em>'.
	 * @see eaglemodel.Errors#getError()
	 * @see #getErrors()
	 * @generated
	 */
	EReference getErrors_Error();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Packages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Packages</em>'.
	 * @see eaglemodel.Packages
	 * @generated
	 */
	EClass getPackages();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Packages#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see eaglemodel.Packages#getPackage()
	 * @see #getPackages()
	 * @generated
	 */
	EReference getPackages_Package();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see eaglemodel.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Package#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see eaglemodel.Package#getDescription()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Package#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see eaglemodel.Package#getPolygon()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Package#getWire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wire</em>'.
	 * @see eaglemodel.Package#getWire()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Wire();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Package#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see eaglemodel.Package#getText()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Package#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see eaglemodel.Package#getDimension()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Dimension();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Package#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see eaglemodel.Package#getCircle()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Package#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rectangle</em>'.
	 * @see eaglemodel.Package#getRectangle()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Rectangle();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Package#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see eaglemodel.Package#getFrame()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Package#getHole <em>Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hole</em>'.
	 * @see eaglemodel.Package#getHole()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Hole();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Package#getPad <em>Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pad</em>'.
	 * @see eaglemodel.Package#getPad()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Pad();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Package#getSmd <em>Smd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smd</em>'.
	 * @see eaglemodel.Package#getSmd()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Smd();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Symbols <em>Symbols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbols</em>'.
	 * @see eaglemodel.Symbols
	 * @generated
	 */
	EClass getSymbols();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Symbols#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Symbol</em>'.
	 * @see eaglemodel.Symbols#getSymbol()
	 * @see #getSymbols()
	 * @generated
	 */
	EReference getSymbols_Symbol();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Symbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbol</em>'.
	 * @see eaglemodel.Symbol
	 * @generated
	 */
	EClass getSymbol();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Symbol#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Symbol#getName()
	 * @see #getSymbol()
	 * @generated
	 */
	EAttribute getSymbol_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Symbol#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see eaglemodel.Symbol#getDescription()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Symbol#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see eaglemodel.Symbol#getPolygon()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Symbol#getWire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wire</em>'.
	 * @see eaglemodel.Symbol#getWire()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Wire();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Symbol#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see eaglemodel.Symbol#getText()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Symbol#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see eaglemodel.Symbol#getDimension()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Dimension();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Symbol#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pin</em>'.
	 * @see eaglemodel.Symbol#getPin()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Pin();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Symbol#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see eaglemodel.Symbol#getCircle()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Symbol#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rectangle</em>'.
	 * @see eaglemodel.Symbol#getRectangle()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Rectangle();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Symbol#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see eaglemodel.Symbol#getFrame()
	 * @see #getSymbol()
	 * @generated
	 */
	EReference getSymbol_Frame();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Devicesets <em>Devicesets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devicesets</em>'.
	 * @see eaglemodel.Devicesets
	 * @generated
	 */
	EClass getDevicesets();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Devicesets#getDeviceset <em>Deviceset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deviceset</em>'.
	 * @see eaglemodel.Devicesets#getDeviceset()
	 * @see #getDevicesets()
	 * @generated
	 */
	EReference getDevicesets_Deviceset();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Deviceset <em>Deviceset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deviceset</em>'.
	 * @see eaglemodel.Deviceset
	 * @generated
	 */
	EClass getDeviceset();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Deviceset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Deviceset#getName()
	 * @see #getDeviceset()
	 * @generated
	 */
	EAttribute getDeviceset_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Deviceset#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see eaglemodel.Deviceset#getPrefix()
	 * @see #getDeviceset()
	 * @generated
	 */
	EAttribute getDeviceset_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Deviceset#isUservalue <em>Uservalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uservalue</em>'.
	 * @see eaglemodel.Deviceset#isUservalue()
	 * @see #getDeviceset()
	 * @generated
	 */
	EAttribute getDeviceset_Uservalue();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Deviceset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Description</em>'.
	 * @see eaglemodel.Deviceset#getDescription()
	 * @see #getDeviceset()
	 * @generated
	 */
	EReference getDeviceset_Description();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Deviceset#getGates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gates</em>'.
	 * @see eaglemodel.Deviceset#getGates()
	 * @see #getDeviceset()
	 * @generated
	 */
	EReference getDeviceset_Gates();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Deviceset#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Devices</em>'.
	 * @see eaglemodel.Deviceset#getDevices()
	 * @see #getDeviceset()
	 * @generated
	 */
	EReference getDeviceset_Devices();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Polygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Polygon</em>'.
	 * @see eaglemodel.Polygon
	 * @generated
	 */
	EClass getPolygon();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Polygon#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see eaglemodel.Polygon#getWidth()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Width();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Polygon#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eaglemodel.Polygon#getLayer()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Layer();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Polygon#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see eaglemodel.Polygon#getSpacing()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Spacing();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Polygon#getPour <em>Pour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pour</em>'.
	 * @see eaglemodel.Polygon#getPour()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Pour();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Polygon#getIsolate <em>Isolate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Isolate</em>'.
	 * @see eaglemodel.Polygon#getIsolate()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Isolate();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Polygon#isOrphans <em>Orphans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orphans</em>'.
	 * @see eaglemodel.Polygon#isOrphans()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Orphans();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Polygon#isThermals <em>Thermals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thermals</em>'.
	 * @see eaglemodel.Polygon#isThermals()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Thermals();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Polygon#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see eaglemodel.Polygon#getRank()
	 * @see #getPolygon()
	 * @generated
	 */
	EAttribute getPolygon_Rank();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Polygon#getVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertex</em>'.
	 * @see eaglemodel.Polygon#getVertex()
	 * @see #getPolygon()
	 * @generated
	 */
	EReference getPolygon_Vertex();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see eaglemodel.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Vertex#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Vertex#getX()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Vertex#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Vertex#getY()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Vertex#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve</em>'.
	 * @see eaglemodel.Vertex#getCurve()
	 * @see #getVertex()
	 * @generated
	 */
	EAttribute getVertex_Curve();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Wire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wire</em>'.
	 * @see eaglemodel.Wire
	 * @generated
	 */
	EClass getWire();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Wire#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see eaglemodel.Wire#getX1()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_X1();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Wire#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see eaglemodel.Wire#getY1()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Y1();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Wire#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see eaglemodel.Wire#getX2()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_X2();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Wire#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see eaglemodel.Wire#getY2()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Y2();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Wire#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see eaglemodel.Wire#getWidth()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Width();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Wire#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eaglemodel.Wire#getLayer()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Layer();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Wire#getExtent <em>Extent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extent</em>'.
	 * @see eaglemodel.Wire#getExtent()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Extent();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Wire#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see eaglemodel.Wire#getStyle()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Style();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Wire#getCurve <em>Curve</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curve</em>'.
	 * @see eaglemodel.Wire#getCurve()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Curve();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Wire#getCap <em>Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap</em>'.
	 * @see eaglemodel.Wire#getCap()
	 * @see #getWire()
	 * @generated
	 */
	EAttribute getWire_Cap();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see eaglemodel.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Text#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Text#getX()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Text#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Text#getY()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Text#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see eaglemodel.Text#getSize()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Size();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Text#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eaglemodel.Text#getLayer()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Layer();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Text#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see eaglemodel.Text#getFont()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Font();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Text#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see eaglemodel.Text#getRatio()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Ratio();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Text#getRot <em>Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rot</em>'.
	 * @see eaglemodel.Text#getRot()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Rot();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Text#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see eaglemodel.Text#getAlign()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Align();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Text#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see eaglemodel.Text#getDistance()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Distance();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Text#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see eaglemodel.Text#getValue()
	 * @see #getText()
	 * @generated
	 */
	EAttribute getText_Value();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see eaglemodel.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see eaglemodel.Dimension#getX1()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_X1();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see eaglemodel.Dimension#getY1()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Y1();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see eaglemodel.Dimension#getX2()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_X2();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see eaglemodel.Dimension#getY2()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Y2();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getX3 <em>X3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X3</em>'.
	 * @see eaglemodel.Dimension#getX3()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_X3();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getY3 <em>Y3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y3</em>'.
	 * @see eaglemodel.Dimension#getY3()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Y3();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eaglemodel.Dimension#getLayer()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Layer();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtype</em>'.
	 * @see eaglemodel.Dimension#getDtype()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Dtype();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see eaglemodel.Dimension#getWidth()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Width();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getExtwidth <em>Extwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extwidth</em>'.
	 * @see eaglemodel.Dimension#getExtwidth()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Extwidth();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getExtlength <em>Extlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extlength</em>'.
	 * @see eaglemodel.Dimension#getExtlength()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Extlength();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getExtoffset <em>Extoffset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extoffset</em>'.
	 * @see eaglemodel.Dimension#getExtoffset()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Extoffset();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getTextsize <em>Textsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textsize</em>'.
	 * @see eaglemodel.Dimension#getTextsize()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Textsize();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getTextratio <em>Textratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Textratio</em>'.
	 * @see eaglemodel.Dimension#getTextratio()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Textratio();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see eaglemodel.Dimension#getUnit()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Unit();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see eaglemodel.Dimension#getPrecision()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Precision();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Dimension#isVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see eaglemodel.Dimension#isVisible()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Visible();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Pin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pin</em>'.
	 * @see eaglemodel.Pin
	 * @generated
	 */
	EClass getPin();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pin#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Pin#getName()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pin#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Pin#getX()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pin#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Pin#getY()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pin#getVisible <em>Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visible</em>'.
	 * @see eaglemodel.Pin#getVisible()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Visible();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pin#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see eaglemodel.Pin#getLength()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Length();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pin#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see eaglemodel.Pin#getDirection()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Direction();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pin#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see eaglemodel.Pin#getFunction()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Function();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pin#getSwaplevel <em>Swaplevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swaplevel</em>'.
	 * @see eaglemodel.Pin#getSwaplevel()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Swaplevel();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pin#getRot <em>Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rot</em>'.
	 * @see eaglemodel.Pin#getRot()
	 * @see #getPin()
	 * @generated
	 */
	EAttribute getPin_Rot();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see eaglemodel.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Circle#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Circle#getX()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Circle#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Circle#getY()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see eaglemodel.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Circle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see eaglemodel.Circle#getWidth()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Width();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Circle#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eaglemodel.Circle#getLayer()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Layer();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rectangle</em>'.
	 * @see eaglemodel.Rectangle
	 * @generated
	 */
	EClass getRectangle();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Rectangle#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see eaglemodel.Rectangle#getX1()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_X1();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Rectangle#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see eaglemodel.Rectangle#getY1()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Y1();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Rectangle#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see eaglemodel.Rectangle#getX2()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_X2();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Rectangle#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see eaglemodel.Rectangle#getY2()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Y2();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Rectangle#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eaglemodel.Rectangle#getLayer()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Layer();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Rectangle#getRot <em>Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rot</em>'.
	 * @see eaglemodel.Rectangle#getRot()
	 * @see #getRectangle()
	 * @generated
	 */
	EAttribute getRectangle_Rot();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Frame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Frame</em>'.
	 * @see eaglemodel.Frame
	 * @generated
	 */
	EClass getFrame();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#getX1 <em>X1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X1</em>'.
	 * @see eaglemodel.Frame#getX1()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_X1();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#getY1 <em>Y1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y1</em>'.
	 * @see eaglemodel.Frame#getY1()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Y1();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#getX2 <em>X2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X2</em>'.
	 * @see eaglemodel.Frame#getX2()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_X2();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#getY2 <em>Y2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y2</em>'.
	 * @see eaglemodel.Frame#getY2()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Y2();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see eaglemodel.Frame#getColumns()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Columns();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see eaglemodel.Frame#getRows()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Rows();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eaglemodel.Frame#getLayer()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Layer();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#isBorderleft <em>Borderleft</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borderleft</em>'.
	 * @see eaglemodel.Frame#isBorderleft()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Borderleft();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#isBordertop <em>Bordertop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bordertop</em>'.
	 * @see eaglemodel.Frame#isBordertop()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Bordertop();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#isBorderright <em>Borderright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borderright</em>'.
	 * @see eaglemodel.Frame#isBorderright()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Borderright();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Frame#isBorderbottom <em>Borderbottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Borderbottom</em>'.
	 * @see eaglemodel.Frame#isBorderbottom()
	 * @see #getFrame()
	 * @generated
	 */
	EAttribute getFrame_Borderbottom();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Hole <em>Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hole</em>'.
	 * @see eaglemodel.Hole
	 * @generated
	 */
	EClass getHole();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Hole#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Hole#getX()
	 * @see #getHole()
	 * @generated
	 */
	EAttribute getHole_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Hole#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Hole#getY()
	 * @see #getHole()
	 * @generated
	 */
	EAttribute getHole_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Hole#getDrill <em>Drill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drill</em>'.
	 * @see eaglemodel.Hole#getDrill()
	 * @see #getHole()
	 * @generated
	 */
	EAttribute getHole_Drill();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Pad <em>Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pad</em>'.
	 * @see eaglemodel.Pad
	 * @generated
	 */
	EClass getPad();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pad#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Pad#getName()
	 * @see #getPad()
	 * @generated
	 */
	EAttribute getPad_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pad#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Pad#getX()
	 * @see #getPad()
	 * @generated
	 */
	EAttribute getPad_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pad#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Pad#getY()
	 * @see #getPad()
	 * @generated
	 */
	EAttribute getPad_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pad#getDrill <em>Drill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drill</em>'.
	 * @see eaglemodel.Pad#getDrill()
	 * @see #getPad()
	 * @generated
	 */
	EAttribute getPad_Drill();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pad#getDiameter <em>Diameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Diameter</em>'.
	 * @see eaglemodel.Pad#getDiameter()
	 * @see #getPad()
	 * @generated
	 */
	EAttribute getPad_Diameter();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pad#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see eaglemodel.Pad#getShape()
	 * @see #getPad()
	 * @generated
	 */
	EAttribute getPad_Shape();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pad#getRot <em>Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rot</em>'.
	 * @see eaglemodel.Pad#getRot()
	 * @see #getPad()
	 * @generated
	 */
	EAttribute getPad_Rot();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pad#isStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop</em>'.
	 * @see eaglemodel.Pad#isStop()
	 * @see #getPad()
	 * @generated
	 */
	EAttribute getPad_Stop();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pad#isThermals <em>Thermals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thermals</em>'.
	 * @see eaglemodel.Pad#isThermals()
	 * @see #getPad()
	 * @generated
	 */
	EAttribute getPad_Thermals();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pad#isFirst <em>First</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First</em>'.
	 * @see eaglemodel.Pad#isFirst()
	 * @see #getPad()
	 * @generated
	 */
	EAttribute getPad_First();

	/**
	 * Returns the meta object for class '{@link eaglemodel.SMD <em>SMD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMD</em>'.
	 * @see eaglemodel.SMD
	 * @generated
	 */
	EClass getSMD();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.SMD#getName()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.SMD#getX()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.SMD#getY()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#getDx <em>Dx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dx</em>'.
	 * @see eaglemodel.SMD#getDx()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_Dx();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#getDy <em>Dy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dy</em>'.
	 * @see eaglemodel.SMD#getDy()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_Dy();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eaglemodel.SMD#getLayer()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_Layer();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#getRoundness <em>Roundness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Roundness</em>'.
	 * @see eaglemodel.SMD#getRoundness()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_Roundness();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#getRot <em>Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rot</em>'.
	 * @see eaglemodel.SMD#getRot()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_Rot();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#isStop <em>Stop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stop</em>'.
	 * @see eaglemodel.SMD#isStop()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_Stop();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#isThermals <em>Thermals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thermals</em>'.
	 * @see eaglemodel.SMD#isThermals()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_Thermals();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.SMD#isCream <em>Cream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cream</em>'.
	 * @see eaglemodel.SMD#isCream()
	 * @see #getSMD()
	 * @generated
	 */
	EAttribute getSMD_Cream();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Gates <em>Gates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gates</em>'.
	 * @see eaglemodel.Gates
	 * @generated
	 */
	EClass getGates();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Gates#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gate</em>'.
	 * @see eaglemodel.Gates#getGate()
	 * @see #getGates()
	 * @generated
	 */
	EReference getGates_Gate();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Gate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gate</em>'.
	 * @see eaglemodel.Gate
	 * @generated
	 */
	EClass getGate();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Gate#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Gate#getName()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Gate#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see eaglemodel.Gate#getSymbol()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Gate#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Gate#getX()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Gate#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Gate#getY()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Gate#getAddlevel <em>Addlevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addlevel</em>'.
	 * @see eaglemodel.Gate#getAddlevel()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Addlevel();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Gate#getSwaplevel <em>Swaplevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Swaplevel</em>'.
	 * @see eaglemodel.Gate#getSwaplevel()
	 * @see #getGate()
	 * @generated
	 */
	EAttribute getGate_Swaplevel();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Devices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Devices</em>'.
	 * @see eaglemodel.Devices
	 * @generated
	 */
	EClass getDevices();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Devices#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Device</em>'.
	 * @see eaglemodel.Devices#getDevice()
	 * @see #getDevices()
	 * @generated
	 */
	EReference getDevices_Device();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see eaglemodel.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Device#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Device#getName()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Name();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Device#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see eaglemodel.Device#getPackage()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Package();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Device#getConnects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connects</em>'.
	 * @see eaglemodel.Device#getConnects()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Connects();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Device#getTechnologies <em>Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Technologies</em>'.
	 * @see eaglemodel.Device#getTechnologies()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Technologies();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Connects <em>Connects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connects</em>'.
	 * @see eaglemodel.Connects
	 * @generated
	 */
	EClass getConnects();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Connects#getConnect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connect</em>'.
	 * @see eaglemodel.Connects#getConnect()
	 * @see #getConnects()
	 * @generated
	 */
	EReference getConnects_Connect();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Connect <em>Connect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connect</em>'.
	 * @see eaglemodel.Connect
	 * @generated
	 */
	EClass getConnect();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Connect#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gate</em>'.
	 * @see eaglemodel.Connect#getGate()
	 * @see #getConnect()
	 * @generated
	 */
	EAttribute getConnect_Gate();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Connect#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see eaglemodel.Connect#getPin()
	 * @see #getConnect()
	 * @generated
	 */
	EAttribute getConnect_Pin();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Connect#getPad <em>Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pad</em>'.
	 * @see eaglemodel.Connect#getPad()
	 * @see #getConnect()
	 * @generated
	 */
	EAttribute getConnect_Pad();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Connect#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Route</em>'.
	 * @see eaglemodel.Connect#getRoute()
	 * @see #getConnect()
	 * @generated
	 */
	EAttribute getConnect_Route();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Technologies <em>Technologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technologies</em>'.
	 * @see eaglemodel.Technologies
	 * @generated
	 */
	EClass getTechnologies();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Technologies#getTechnology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Technology</em>'.
	 * @see eaglemodel.Technologies#getTechnology()
	 * @see #getTechnologies()
	 * @generated
	 */
	EReference getTechnologies_Technology();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Technology <em>Technology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Technology</em>'.
	 * @see eaglemodel.Technology
	 * @generated
	 */
	EClass getTechnology();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Technology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Technology#getName()
	 * @see #getTechnology()
	 * @generated
	 */
	EAttribute getTechnology_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Technology#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see eaglemodel.Technology#getAttribute()
	 * @see #getTechnology()
	 * @generated
	 */
	EReference getTechnology_Attribute();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Plain <em>Plain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plain</em>'.
	 * @see eaglemodel.Plain
	 * @generated
	 */
	EClass getPlain();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Plain#getPolygon <em>Polygon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Polygon</em>'.
	 * @see eaglemodel.Plain#getPolygon()
	 * @see #getPlain()
	 * @generated
	 */
	EReference getPlain_Polygon();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Plain#getWire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wire</em>'.
	 * @see eaglemodel.Plain#getWire()
	 * @see #getPlain()
	 * @generated
	 */
	EReference getPlain_Wire();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Plain#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Text</em>'.
	 * @see eaglemodel.Plain#getText()
	 * @see #getPlain()
	 * @generated
	 */
	EReference getPlain_Text();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Plain#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dimension</em>'.
	 * @see eaglemodel.Plain#getDimension()
	 * @see #getPlain()
	 * @generated
	 */
	EReference getPlain_Dimension();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Plain#getCircle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circle</em>'.
	 * @see eaglemodel.Plain#getCircle()
	 * @see #getPlain()
	 * @generated
	 */
	EReference getPlain_Circle();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Plain#getRectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rectangle</em>'.
	 * @see eaglemodel.Plain#getRectangle()
	 * @see #getPlain()
	 * @generated
	 */
	EReference getPlain_Rectangle();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Plain#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Frame</em>'.
	 * @see eaglemodel.Plain#getFrame()
	 * @see #getPlain()
	 * @generated
	 */
	EReference getPlain_Frame();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Plain#getHole <em>Hole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hole</em>'.
	 * @see eaglemodel.Plain#getHole()
	 * @see #getPlain()
	 * @generated
	 */
	EReference getPlain_Hole();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Instances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instances</em>'.
	 * @see eaglemodel.Instances
	 * @generated
	 */
	EClass getInstances();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Instances#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instance</em>'.
	 * @see eaglemodel.Instances#getInstance()
	 * @see #getInstances()
	 * @generated
	 */
	EReference getInstances_Instance();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see eaglemodel.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Instance#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see eaglemodel.Instance#getPart()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Part();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Instance#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gate</em>'.
	 * @see eaglemodel.Instance#getGate()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Gate();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Instance#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Instance#getX()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Instance#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Instance#getY()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Instance#isSmashed <em>Smashed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Smashed</em>'.
	 * @see eaglemodel.Instance#isSmashed()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Smashed();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Instance#getRot <em>Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rot</em>'.
	 * @see eaglemodel.Instance#getRot()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Rot();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Instance#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see eaglemodel.Instance#getAttribute()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Attribute();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Busses <em>Busses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Busses</em>'.
	 * @see eaglemodel.Busses
	 * @generated
	 */
	EClass getBusses();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Busses#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus</em>'.
	 * @see eaglemodel.Busses#getBus()
	 * @see #getBusses()
	 * @generated
	 */
	EReference getBusses_Bus();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see eaglemodel.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Bus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Bus#getName()
	 * @see #getBus()
	 * @generated
	 */
	EAttribute getBus_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Bus#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segment</em>'.
	 * @see eaglemodel.Bus#getSegment()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Segment();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Nets <em>Nets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nets</em>'.
	 * @see eaglemodel.Nets
	 * @generated
	 */
	EClass getNets();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Nets#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Net</em>'.
	 * @see eaglemodel.Nets#getNet()
	 * @see #getNets()
	 * @generated
	 */
	EReference getNets_Net();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Net <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Net</em>'.
	 * @see eaglemodel.Net
	 * @generated
	 */
	EClass getNet();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Net#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eaglemodel.Net#getName()
	 * @see #getNet()
	 * @generated
	 */
	EAttribute getNet_Name();

	/**
	 * Returns the meta object for the containment reference '{@link eaglemodel.Net#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class</em>'.
	 * @see eaglemodel.Net#getClass_()
	 * @see #getNet()
	 * @generated
	 */
	EReference getNet_Class();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Net#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segment</em>'.
	 * @see eaglemodel.Net#getSegment()
	 * @see #getNet()
	 * @generated
	 */
	EReference getNet_Segment();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see eaglemodel.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Segment#getPinref <em>Pinref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pinref</em>'.
	 * @see eaglemodel.Segment#getPinref()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Pinref();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Segment#getWire <em>Wire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Wire</em>'.
	 * @see eaglemodel.Segment#getWire()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Wire();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Segment#getJunction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Junction</em>'.
	 * @see eaglemodel.Segment#getJunction()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Junction();

	/**
	 * Returns the meta object for the containment reference list '{@link eaglemodel.Segment#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Label</em>'.
	 * @see eaglemodel.Segment#getLabel()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Label();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Pinref <em>Pinref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pinref</em>'.
	 * @see eaglemodel.Pinref
	 * @generated
	 */
	EClass getPinref();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pinref#getPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part</em>'.
	 * @see eaglemodel.Pinref#getPart()
	 * @see #getPinref()
	 * @generated
	 */
	EAttribute getPinref_Part();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pinref#getGate <em>Gate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gate</em>'.
	 * @see eaglemodel.Pinref#getGate()
	 * @see #getPinref()
	 * @generated
	 */
	EAttribute getPinref_Gate();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Pinref#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see eaglemodel.Pinref#getPin()
	 * @see #getPinref()
	 * @generated
	 */
	EAttribute getPinref_Pin();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see eaglemodel.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Junction#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Junction#getX()
	 * @see #getJunction()
	 * @generated
	 */
	EAttribute getJunction_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Junction#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Junction#getY()
	 * @see #getJunction()
	 * @generated
	 */
	EAttribute getJunction_Y();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see eaglemodel.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Label#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see eaglemodel.Label#getX()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_X();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Label#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see eaglemodel.Label#getY()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Y();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Label#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see eaglemodel.Label#getSize()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Size();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Label#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layer</em>'.
	 * @see eaglemodel.Label#getLayer()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Layer();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Label#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see eaglemodel.Label#getFont()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Font();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Label#getRatio <em>Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ratio</em>'.
	 * @see eaglemodel.Label#getRatio()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Ratio();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Label#getRot <em>Rot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rot</em>'.
	 * @see eaglemodel.Label#getRot()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Rot();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Label#isXref <em>Xref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xref</em>'.
	 * @see eaglemodel.Label#isXref()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Xref();

	/**
	 * Returns the meta object for class '{@link eaglemodel.Approved <em>Approved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Approved</em>'.
	 * @see eaglemodel.Approved
	 * @generated
	 */
	EClass getApproved();

	/**
	 * Returns the meta object for the attribute '{@link eaglemodel.Approved#getHash <em>Hash</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hash</em>'.
	 * @see eaglemodel.Approved#getHash()
	 * @see #getApproved()
	 * @generated
	 */
	EAttribute getApproved_Hash();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.Severity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Severity</em>'.
	 * @see eaglemodel.Severity
	 * @generated
	 */
	EEnum getSeverity();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.GateAddLevel <em>Gate Add Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gate Add Level</em>'.
	 * @see eaglemodel.GateAddLevel
	 * @generated
	 */
	EEnum getGateAddLevel();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.WireStyle <em>Wire Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wire Style</em>'.
	 * @see eaglemodel.WireStyle
	 * @generated
	 */
	EEnum getWireStyle();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.WireCap <em>Wire Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Wire Cap</em>'.
	 * @see eaglemodel.WireCap
	 * @generated
	 */
	EEnum getWireCap();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.DimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dimension Type</em>'.
	 * @see eaglemodel.DimensionType
	 * @generated
	 */
	EEnum getDimensionType();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.GridUnit <em>Grid Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grid Unit</em>'.
	 * @see eaglemodel.GridUnit
	 * @generated
	 */
	EEnum getGridUnit();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.GridStyle <em>Grid Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grid Style</em>'.
	 * @see eaglemodel.GridStyle
	 * @generated
	 */
	EEnum getGridStyle();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.TextFont <em>Text Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Text Font</em>'.
	 * @see eaglemodel.TextFont
	 * @generated
	 */
	EEnum getTextFont();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.Align <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align</em>'.
	 * @see eaglemodel.Align
	 * @generated
	 */
	EEnum getAlign();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.PadShape <em>Pad Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pad Shape</em>'.
	 * @see eaglemodel.PadShape
	 * @generated
	 */
	EEnum getPadShape();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.PolygonPour <em>Polygon Pour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Polygon Pour</em>'.
	 * @see eaglemodel.PolygonPour
	 * @generated
	 */
	EEnum getPolygonPour();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.PinVisible <em>Pin Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Visible</em>'.
	 * @see eaglemodel.PinVisible
	 * @generated
	 */
	EEnum getPinVisible();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.PinLength <em>Pin Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Length</em>'.
	 * @see eaglemodel.PinLength
	 * @generated
	 */
	EEnum getPinLength();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.PinDirection <em>Pin Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Direction</em>'.
	 * @see eaglemodel.PinDirection
	 * @generated
	 */
	EEnum getPinDirection();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.PinFunction <em>Pin Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pin Function</em>'.
	 * @see eaglemodel.PinFunction
	 * @generated
	 */
	EEnum getPinFunction();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.ContactRoute <em>Contact Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contact Route</em>'.
	 * @see eaglemodel.ContactRoute
	 * @generated
	 */
	EEnum getContactRoute();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.AttributeDisplay <em>Attribute Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Display</em>'.
	 * @see eaglemodel.AttributeDisplay
	 * @generated
	 */
	EEnum getAttributeDisplay();

	/**
	 * Returns the meta object for enum '{@link eaglemodel.VerticalText <em>Vertical Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertical Text</em>'.
	 * @see eaglemodel.VerticalText
	 * @generated
	 */
	EEnum getVerticalText();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EaglemodelFactory getEaglemodelFactory();

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
		 * The meta object literal for the '{@link eaglemodel.impl.EagleImpl <em>Eagle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.EagleImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getEagle()
		 * @generated
		 */
		EClass EAGLE = eINSTANCE.getEagle();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EAGLE__VERSION = eINSTANCE.getEagle_Version();

		/**
		 * The meta object literal for the '<em><b>Compatibility</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EAGLE__COMPATIBILITY = eINSTANCE.getEagle_Compatibility();

		/**
		 * The meta object literal for the '<em><b>Drawing</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EAGLE__DRAWING = eINSTANCE.getEagle_Drawing();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.CompatibilityImpl <em>Compatibility</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.CompatibilityImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getCompatibility()
		 * @generated
		 */
		EClass COMPATIBILITY = eINSTANCE.getCompatibility();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPATIBILITY__NOTE = eINSTANCE.getCompatibility_Note();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.NoteImpl <em>Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.NoteImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getNote()
		 * @generated
		 */
		EClass NOTE = eINSTANCE.getNote();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__VERSION = eINSTANCE.getNote_Version();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__SEVERITY = eINSTANCE.getNote_Severity();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE__VALUE = eINSTANCE.getNote_Value();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.DrawingImpl <em>Drawing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.DrawingImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getDrawing()
		 * @generated
		 */
		EClass DRAWING = eINSTANCE.getDrawing();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING__SETTINGS = eINSTANCE.getDrawing_Settings();

		/**
		 * The meta object literal for the '<em><b>Grid</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING__GRID = eINSTANCE.getDrawing_Grid();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING__LAYERS = eINSTANCE.getDrawing_Layers();

		/**
		 * The meta object literal for the '<em><b>Schematic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DRAWING__SCHEMATIC = eINSTANCE.getDrawing_Schematic();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.SettingsImpl <em>Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.SettingsImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getSettings()
		 * @generated
		 */
		EClass SETTINGS = eINSTANCE.getSettings();

		/**
		 * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTINGS__SETTINGS = eINSTANCE.getSettings_Settings();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.SettingImpl <em>Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.SettingImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getSetting()
		 * @generated
		 */
		EClass SETTING = eINSTANCE.getSetting();

		/**
		 * The meta object literal for the '<em><b>Alwaysvectorfont</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING__ALWAYSVECTORFONT = eINSTANCE.getSetting_Alwaysvectorfont();

		/**
		 * The meta object literal for the '<em><b>Verticaltext</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING__VERTICALTEXT = eINSTANCE.getSetting_Verticaltext();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.GridImpl <em>Grid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.GridImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getGrid()
		 * @generated
		 */
		EClass GRID = eINSTANCE.getGrid();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__DISTANCE = eINSTANCE.getGrid_Distance();

		/**
		 * The meta object literal for the '<em><b>Unitdist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__UNITDIST = eINSTANCE.getGrid_Unitdist();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__UNIT = eINSTANCE.getGrid_Unit();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__STYLE = eINSTANCE.getGrid_Style();

		/**
		 * The meta object literal for the '<em><b>Multiple</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__MULTIPLE = eINSTANCE.getGrid_Multiple();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__DISPLAY = eINSTANCE.getGrid_Display();

		/**
		 * The meta object literal for the '<em><b>Altdistance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__ALTDISTANCE = eINSTANCE.getGrid_Altdistance();

		/**
		 * The meta object literal for the '<em><b>Altunitdist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__ALTUNITDIST = eINSTANCE.getGrid_Altunitdist();

		/**
		 * The meta object literal for the '<em><b>Altunit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID__ALTUNIT = eINSTANCE.getGrid_Altunit();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.LayersImpl <em>Layers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.LayersImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getLayers()
		 * @generated
		 */
		EClass LAYERS = eINSTANCE.getLayers();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYERS__LAYERS = eINSTANCE.getLayers_Layers();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.LayerImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__NUMBER = eINSTANCE.getLayer_Number();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__COLOR = eINSTANCE.getLayer_Color();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__FILL = eINSTANCE.getLayer_Fill();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__VISIBLE = eINSTANCE.getLayer_Visible();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__ACTIVE = eINSTANCE.getLayer_Active();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.SchematicImpl <em>Schematic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.SchematicImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getSchematic()
		 * @generated
		 */
		EClass SCHEMATIC = eINSTANCE.getSchematic();

		/**
		 * The meta object literal for the '<em><b>Xreflabel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMATIC__XREFLABEL = eINSTANCE.getSchematic_Xreflabel();

		/**
		 * The meta object literal for the '<em><b>Xrefpart</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMATIC__XREFPART = eINSTANCE.getSchematic_Xrefpart();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMATIC__DESCRIPTION = eINSTANCE.getSchematic_Description();

		/**
		 * The meta object literal for the '<em><b>Libraries</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMATIC__LIBRARIES = eINSTANCE.getSchematic_Libraries();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMATIC__ATTRIBUTES = eINSTANCE.getSchematic_Attributes();

		/**
		 * The meta object literal for the '<em><b>Variantdefs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMATIC__VARIANTDEFS = eINSTANCE.getSchematic_Variantdefs();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMATIC__CLASSES = eINSTANCE.getSchematic_Classes();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMATIC__PARTS = eINSTANCE.getSchematic_Parts();

		/**
		 * The meta object literal for the '<em><b>Sheets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMATIC__SHEETS = eINSTANCE.getSchematic_Sheets();

		/**
		 * The meta object literal for the '<em><b>Errors</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMATIC__ERRORS = eINSTANCE.getSchematic_Errors();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.DescriptionImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__LANGUAGE = eINSTANCE.getDescription_Language();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__VALUE = eINSTANCE.getDescription_Value();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.LibrariesImpl <em>Libraries</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.LibrariesImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getLibraries()
		 * @generated
		 */
		EClass LIBRARIES = eINSTANCE.getLibraries();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARIES__LIBRARY = eINSTANCE.getLibraries_Library();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.LibraryImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getLibrary()
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
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__DESCRIPTION = eINSTANCE.getLibrary_Description();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__PACKAGES = eINSTANCE.getLibrary_Packages();

		/**
		 * The meta object literal for the '<em><b>Symbols</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__SYMBOLS = eINSTANCE.getLibrary_Symbols();

		/**
		 * The meta object literal for the '<em><b>Devicesets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__DEVICESETS = eINSTANCE.getLibrary_Devicesets();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.AttributesImpl <em>Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.AttributesImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getAttributes()
		 * @generated
		 */
		EClass ATTRIBUTES = eINSTANCE.getAttributes();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTES__ATTRIBUTE = eINSTANCE.getAttributes_Attribute();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.AttributeImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getAttribute()
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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__X = eINSTANCE.getAttribute_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__Y = eINSTANCE.getAttribute_Y();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SIZE = eINSTANCE.getAttribute_Size();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__LAYER = eINSTANCE.getAttribute_Layer();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__FONT = eINSTANCE.getAttribute_Font();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__RATIO = eINSTANCE.getAttribute_Ratio();

		/**
		 * The meta object literal for the '<em><b>Rot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__ROT = eINSTANCE.getAttribute_Rot();

		/**
		 * The meta object literal for the '<em><b>Display</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DISPLAY = eINSTANCE.getAttribute_Display();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__CONSTANT = eINSTANCE.getAttribute_Constant();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.VariantdefsImpl <em>Variantdefs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.VariantdefsImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getVariantdefs()
		 * @generated
		 */
		EClass VARIANTDEFS = eINSTANCE.getVariantdefs();

		/**
		 * The meta object literal for the '<em><b>Variantdef</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIANTDEFS__VARIANTDEF = eINSTANCE.getVariantdefs_Variantdef();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.VariantdefImpl <em>Variantdef</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.VariantdefImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getVariantdef()
		 * @generated
		 */
		EClass VARIANTDEF = eINSTANCE.getVariantdef();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANTDEF__NAME = eINSTANCE.getVariantdef_Name();

		/**
		 * The meta object literal for the '<em><b>Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANTDEF__CURRENT = eINSTANCE.getVariantdef_Current();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.VariantImpl <em>Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.VariantImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getVariant()
		 * @generated
		 */
		EClass VARIANT = eINSTANCE.getVariant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT__NAME = eINSTANCE.getVariant_Name();

		/**
		 * The meta object literal for the '<em><b>Populate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT__POPULATE = eINSTANCE.getVariant_Populate();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT__VALUE = eINSTANCE.getVariant_Value();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIANT__TECHNOLOGY = eINSTANCE.getVariant_Technology();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.ClassesImpl <em>Classes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.ClassesImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getClasses()
		 * @generated
		 */
		EClass CLASSES = eINSTANCE.getClasses();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASSES__CLASS = eINSTANCE.getClasses_Class();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.ClassImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NUMBER = eINSTANCE.getClass_Number();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__WIDTH = eINSTANCE.getClass_Width();

		/**
		 * The meta object literal for the '<em><b>Drill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__DRILL = eINSTANCE.getClass_Drill();

		/**
		 * The meta object literal for the '<em><b>Clearance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__CLEARANCE = eINSTANCE.getClass_Clearance();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.ClearanceImpl <em>Clearance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.ClearanceImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getClearance()
		 * @generated
		 */
		EClass CLEARANCE = eINSTANCE.getClearance();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE__CLASS = eINSTANCE.getClearance_Class();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLEARANCE__VALUE = eINSTANCE.getClearance_Value();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.PartsImpl <em>Parts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.PartsImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getParts()
		 * @generated
		 */
		EClass PARTS = eINSTANCE.getParts();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTS__PART = eINSTANCE.getParts_Part();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.PartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.PartImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPart()
		 * @generated
		 */
		EClass PART = eINSTANCE.getPart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__NAME = eINSTANCE.getPart_Name();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__LIBRARY = eINSTANCE.getPart_Library();

		/**
		 * The meta object literal for the '<em><b>Deviceset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__DEVICESET = eINSTANCE.getPart_Deviceset();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__DEVICE = eINSTANCE.getPart_Device();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__TECHNOLOGY = eINSTANCE.getPart_Technology();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__VALUE = eINSTANCE.getPart_Value();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__GATE = eINSTANCE.getPart_Gate();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__X = eINSTANCE.getPart_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__Y = eINSTANCE.getPart_Y();

		/**
		 * The meta object literal for the '<em><b>Smashed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__SMASHED = eINSTANCE.getPart_Smashed();

		/**
		 * The meta object literal for the '<em><b>Rot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__ROT = eINSTANCE.getPart_Rot();

		/**
		 * The meta object literal for the '<em><b>Uid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PART__UID = eINSTANCE.getPart_Uid();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__ATTRIBUTE = eINSTANCE.getPart_Attribute();

		/**
		 * The meta object literal for the '<em><b>Variant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PART__VARIANT = eINSTANCE.getPart_Variant();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.SheetsImpl <em>Sheets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.SheetsImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getSheets()
		 * @generated
		 */
		EClass SHEETS = eINSTANCE.getSheets();

		/**
		 * The meta object literal for the '<em><b>Sheet</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEETS__SHEET = eINSTANCE.getSheets_Sheet();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.SheetImpl <em>Sheet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.SheetImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getSheet()
		 * @generated
		 */
		EClass SHEET = eINSTANCE.getSheet();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__DESCRIPTION = eINSTANCE.getSheet_Description();

		/**
		 * The meta object literal for the '<em><b>Plain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__PLAIN = eINSTANCE.getSheet_Plain();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__INSTANCES = eINSTANCE.getSheet_Instances();

		/**
		 * The meta object literal for the '<em><b>Busses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__BUSSES = eINSTANCE.getSheet_Busses();

		/**
		 * The meta object literal for the '<em><b>Nets</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHEET__NETS = eINSTANCE.getSheet_Nets();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.ErrorsImpl <em>Errors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.ErrorsImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getErrors()
		 * @generated
		 */
		EClass ERRORS = eINSTANCE.getErrors();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERRORS__ERROR = eINSTANCE.getErrors_Error();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.PackagesImpl <em>Packages</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.PackagesImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPackages()
		 * @generated
		 */
		EClass PACKAGES = eINSTANCE.getPackages();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGES__PACKAGE = eINSTANCE.getPackages_Package();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.PackageImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__DESCRIPTION = eINSTANCE.getPackage_Description();

		/**
		 * The meta object literal for the '<em><b>Polygon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__POLYGON = eINSTANCE.getPackage_Polygon();

		/**
		 * The meta object literal for the '<em><b>Wire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__WIRE = eINSTANCE.getPackage_Wire();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__TEXT = eINSTANCE.getPackage_Text();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__DIMENSION = eINSTANCE.getPackage_Dimension();

		/**
		 * The meta object literal for the '<em><b>Circle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CIRCLE = eINSTANCE.getPackage_Circle();

		/**
		 * The meta object literal for the '<em><b>Rectangle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__RECTANGLE = eINSTANCE.getPackage_Rectangle();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__FRAME = eINSTANCE.getPackage_Frame();

		/**
		 * The meta object literal for the '<em><b>Hole</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__HOLE = eINSTANCE.getPackage_Hole();

		/**
		 * The meta object literal for the '<em><b>Pad</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__PAD = eINSTANCE.getPackage_Pad();

		/**
		 * The meta object literal for the '<em><b>Smd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__SMD = eINSTANCE.getPackage_Smd();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.SymbolsImpl <em>Symbols</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.SymbolsImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getSymbols()
		 * @generated
		 */
		EClass SYMBOLS = eINSTANCE.getSymbols();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLS__SYMBOL = eINSTANCE.getSymbols_Symbol();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.SymbolImpl <em>Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.SymbolImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getSymbol()
		 * @generated
		 */
		EClass SYMBOL = eINSTANCE.getSymbol();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOL__NAME = eINSTANCE.getSymbol_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__DESCRIPTION = eINSTANCE.getSymbol_Description();

		/**
		 * The meta object literal for the '<em><b>Polygon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__POLYGON = eINSTANCE.getSymbol_Polygon();

		/**
		 * The meta object literal for the '<em><b>Wire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__WIRE = eINSTANCE.getSymbol_Wire();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__TEXT = eINSTANCE.getSymbol_Text();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__DIMENSION = eINSTANCE.getSymbol_Dimension();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__PIN = eINSTANCE.getSymbol_Pin();

		/**
		 * The meta object literal for the '<em><b>Circle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__CIRCLE = eINSTANCE.getSymbol_Circle();

		/**
		 * The meta object literal for the '<em><b>Rectangle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__RECTANGLE = eINSTANCE.getSymbol_Rectangle();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOL__FRAME = eINSTANCE.getSymbol_Frame();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.DevicesetsImpl <em>Devicesets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.DevicesetsImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getDevicesets()
		 * @generated
		 */
		EClass DEVICESETS = eINSTANCE.getDevicesets();

		/**
		 * The meta object literal for the '<em><b>Deviceset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICESETS__DEVICESET = eINSTANCE.getDevicesets_Deviceset();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.DevicesetImpl <em>Deviceset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.DevicesetImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getDeviceset()
		 * @generated
		 */
		EClass DEVICESET = eINSTANCE.getDeviceset();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICESET__NAME = eINSTANCE.getDeviceset_Name();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICESET__PREFIX = eINSTANCE.getDeviceset_Prefix();

		/**
		 * The meta object literal for the '<em><b>Uservalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICESET__USERVALUE = eINSTANCE.getDeviceset_Uservalue();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICESET__DESCRIPTION = eINSTANCE.getDeviceset_Description();

		/**
		 * The meta object literal for the '<em><b>Gates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICESET__GATES = eINSTANCE.getDeviceset_Gates();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICESET__DEVICES = eINSTANCE.getDeviceset_Devices();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.PolygonImpl <em>Polygon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.PolygonImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPolygon()
		 * @generated
		 */
		EClass POLYGON = eINSTANCE.getPolygon();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__WIDTH = eINSTANCE.getPolygon_Width();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__LAYER = eINSTANCE.getPolygon_Layer();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__SPACING = eINSTANCE.getPolygon_Spacing();

		/**
		 * The meta object literal for the '<em><b>Pour</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__POUR = eINSTANCE.getPolygon_Pour();

		/**
		 * The meta object literal for the '<em><b>Isolate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__ISOLATE = eINSTANCE.getPolygon_Isolate();

		/**
		 * The meta object literal for the '<em><b>Orphans</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__ORPHANS = eINSTANCE.getPolygon_Orphans();

		/**
		 * The meta object literal for the '<em><b>Thermals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__THERMALS = eINSTANCE.getPolygon_Thermals();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POLYGON__RANK = eINSTANCE.getPolygon_Rank();

		/**
		 * The meta object literal for the '<em><b>Vertex</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POLYGON__VERTEX = eINSTANCE.getPolygon_Vertex();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.VertexImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__X = eINSTANCE.getVertex_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__Y = eINSTANCE.getVertex_Y();

		/**
		 * The meta object literal for the '<em><b>Curve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERTEX__CURVE = eINSTANCE.getVertex_Curve();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.WireImpl <em>Wire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.WireImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getWire()
		 * @generated
		 */
		EClass WIRE = eINSTANCE.getWire();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__X1 = eINSTANCE.getWire_X1();

		/**
		 * The meta object literal for the '<em><b>Y1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__Y1 = eINSTANCE.getWire_Y1();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__X2 = eINSTANCE.getWire_X2();

		/**
		 * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__Y2 = eINSTANCE.getWire_Y2();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__WIDTH = eINSTANCE.getWire_Width();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__LAYER = eINSTANCE.getWire_Layer();

		/**
		 * The meta object literal for the '<em><b>Extent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__EXTENT = eINSTANCE.getWire_Extent();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__STYLE = eINSTANCE.getWire_Style();

		/**
		 * The meta object literal for the '<em><b>Curve</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__CURVE = eINSTANCE.getWire_Curve();

		/**
		 * The meta object literal for the '<em><b>Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WIRE__CAP = eINSTANCE.getWire_Cap();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.TextImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__X = eINSTANCE.getText_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__Y = eINSTANCE.getText_Y();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__SIZE = eINSTANCE.getText_Size();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__LAYER = eINSTANCE.getText_Layer();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__FONT = eINSTANCE.getText_Font();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__RATIO = eINSTANCE.getText_Ratio();

		/**
		 * The meta object literal for the '<em><b>Rot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__ROT = eINSTANCE.getText_Rot();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__ALIGN = eINSTANCE.getText_Align();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__DISTANCE = eINSTANCE.getText_Distance();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT__VALUE = eINSTANCE.getText_Value();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.DimensionImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__X1 = eINSTANCE.getDimension_X1();

		/**
		 * The meta object literal for the '<em><b>Y1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__Y1 = eINSTANCE.getDimension_Y1();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__X2 = eINSTANCE.getDimension_X2();

		/**
		 * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__Y2 = eINSTANCE.getDimension_Y2();

		/**
		 * The meta object literal for the '<em><b>X3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__X3 = eINSTANCE.getDimension_X3();

		/**
		 * The meta object literal for the '<em><b>Y3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__Y3 = eINSTANCE.getDimension_Y3();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__LAYER = eINSTANCE.getDimension_Layer();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__DTYPE = eINSTANCE.getDimension_Dtype();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__WIDTH = eINSTANCE.getDimension_Width();

		/**
		 * The meta object literal for the '<em><b>Extwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__EXTWIDTH = eINSTANCE.getDimension_Extwidth();

		/**
		 * The meta object literal for the '<em><b>Extlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__EXTLENGTH = eINSTANCE.getDimension_Extlength();

		/**
		 * The meta object literal for the '<em><b>Extoffset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__EXTOFFSET = eINSTANCE.getDimension_Extoffset();

		/**
		 * The meta object literal for the '<em><b>Textsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__TEXTSIZE = eINSTANCE.getDimension_Textsize();

		/**
		 * The meta object literal for the '<em><b>Textratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__TEXTRATIO = eINSTANCE.getDimension_Textratio();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__UNIT = eINSTANCE.getDimension_Unit();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__PRECISION = eINSTANCE.getDimension_Precision();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__VISIBLE = eINSTANCE.getDimension_Visible();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.PinImpl <em>Pin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.PinImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPin()
		 * @generated
		 */
		EClass PIN = eINSTANCE.getPin();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__NAME = eINSTANCE.getPin_Name();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__X = eINSTANCE.getPin_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__Y = eINSTANCE.getPin_Y();

		/**
		 * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__VISIBLE = eINSTANCE.getPin_Visible();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__LENGTH = eINSTANCE.getPin_Length();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__DIRECTION = eINSTANCE.getPin_Direction();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__FUNCTION = eINSTANCE.getPin_Function();

		/**
		 * The meta object literal for the '<em><b>Swaplevel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__SWAPLEVEL = eINSTANCE.getPin_Swaplevel();

		/**
		 * The meta object literal for the '<em><b>Rot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIN__ROT = eINSTANCE.getPin_Rot();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.CircleImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__X = eINSTANCE.getCircle_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__Y = eINSTANCE.getCircle_Y();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__WIDTH = eINSTANCE.getCircle_Width();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__LAYER = eINSTANCE.getCircle_Layer();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.RectangleImpl <em>Rectangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.RectangleImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getRectangle()
		 * @generated
		 */
		EClass RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__X1 = eINSTANCE.getRectangle_X1();

		/**
		 * The meta object literal for the '<em><b>Y1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__Y1 = eINSTANCE.getRectangle_Y1();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__X2 = eINSTANCE.getRectangle_X2();

		/**
		 * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__Y2 = eINSTANCE.getRectangle_Y2();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__LAYER = eINSTANCE.getRectangle_Layer();

		/**
		 * The meta object literal for the '<em><b>Rot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECTANGLE__ROT = eINSTANCE.getRectangle_Rot();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.FrameImpl <em>Frame</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.FrameImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getFrame()
		 * @generated
		 */
		EClass FRAME = eINSTANCE.getFrame();

		/**
		 * The meta object literal for the '<em><b>X1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__X1 = eINSTANCE.getFrame_X1();

		/**
		 * The meta object literal for the '<em><b>Y1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__Y1 = eINSTANCE.getFrame_Y1();

		/**
		 * The meta object literal for the '<em><b>X2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__X2 = eINSTANCE.getFrame_X2();

		/**
		 * The meta object literal for the '<em><b>Y2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__Y2 = eINSTANCE.getFrame_Y2();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__COLUMNS = eINSTANCE.getFrame_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__ROWS = eINSTANCE.getFrame_Rows();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__LAYER = eINSTANCE.getFrame_Layer();

		/**
		 * The meta object literal for the '<em><b>Borderleft</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__BORDERLEFT = eINSTANCE.getFrame_Borderleft();

		/**
		 * The meta object literal for the '<em><b>Bordertop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__BORDERTOP = eINSTANCE.getFrame_Bordertop();

		/**
		 * The meta object literal for the '<em><b>Borderright</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__BORDERRIGHT = eINSTANCE.getFrame_Borderright();

		/**
		 * The meta object literal for the '<em><b>Borderbottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRAME__BORDERBOTTOM = eINSTANCE.getFrame_Borderbottom();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.HoleImpl <em>Hole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.HoleImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getHole()
		 * @generated
		 */
		EClass HOLE = eINSTANCE.getHole();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLE__X = eINSTANCE.getHole_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLE__Y = eINSTANCE.getHole_Y();

		/**
		 * The meta object literal for the '<em><b>Drill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLE__DRILL = eINSTANCE.getHole_Drill();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.PadImpl <em>Pad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.PadImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPad()
		 * @generated
		 */
		EClass PAD = eINSTANCE.getPad();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAD__NAME = eINSTANCE.getPad_Name();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAD__X = eINSTANCE.getPad_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAD__Y = eINSTANCE.getPad_Y();

		/**
		 * The meta object literal for the '<em><b>Drill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAD__DRILL = eINSTANCE.getPad_Drill();

		/**
		 * The meta object literal for the '<em><b>Diameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAD__DIAMETER = eINSTANCE.getPad_Diameter();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAD__SHAPE = eINSTANCE.getPad_Shape();

		/**
		 * The meta object literal for the '<em><b>Rot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAD__ROT = eINSTANCE.getPad_Rot();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAD__STOP = eINSTANCE.getPad_Stop();

		/**
		 * The meta object literal for the '<em><b>Thermals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAD__THERMALS = eINSTANCE.getPad_Thermals();

		/**
		 * The meta object literal for the '<em><b>First</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAD__FIRST = eINSTANCE.getPad_First();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.SMDImpl <em>SMD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.SMDImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getSMD()
		 * @generated
		 */
		EClass SMD = eINSTANCE.getSMD();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__NAME = eINSTANCE.getSMD_Name();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__X = eINSTANCE.getSMD_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__Y = eINSTANCE.getSMD_Y();

		/**
		 * The meta object literal for the '<em><b>Dx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__DX = eINSTANCE.getSMD_Dx();

		/**
		 * The meta object literal for the '<em><b>Dy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__DY = eINSTANCE.getSMD_Dy();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__LAYER = eINSTANCE.getSMD_Layer();

		/**
		 * The meta object literal for the '<em><b>Roundness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__ROUNDNESS = eINSTANCE.getSMD_Roundness();

		/**
		 * The meta object literal for the '<em><b>Rot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__ROT = eINSTANCE.getSMD_Rot();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__STOP = eINSTANCE.getSMD_Stop();

		/**
		 * The meta object literal for the '<em><b>Thermals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__THERMALS = eINSTANCE.getSMD_Thermals();

		/**
		 * The meta object literal for the '<em><b>Cream</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMD__CREAM = eINSTANCE.getSMD_Cream();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.GatesImpl <em>Gates</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.GatesImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getGates()
		 * @generated
		 */
		EClass GATES = eINSTANCE.getGates();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GATES__GATE = eINSTANCE.getGates_Gate();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.GateImpl <em>Gate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.GateImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getGate()
		 * @generated
		 */
		EClass GATE = eINSTANCE.getGate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__NAME = eINSTANCE.getGate_Name();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__SYMBOL = eINSTANCE.getGate_Symbol();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__X = eINSTANCE.getGate_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__Y = eINSTANCE.getGate_Y();

		/**
		 * The meta object literal for the '<em><b>Addlevel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__ADDLEVEL = eINSTANCE.getGate_Addlevel();

		/**
		 * The meta object literal for the '<em><b>Swaplevel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GATE__SWAPLEVEL = eINSTANCE.getGate_Swaplevel();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.DevicesImpl <em>Devices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.DevicesImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getDevices()
		 * @generated
		 */
		EClass DEVICES = eINSTANCE.getDevices();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICES__DEVICE = eINSTANCE.getDevices_Device();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.DeviceImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__NAME = eINSTANCE.getDevice_Name();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__PACKAGE = eINSTANCE.getDevice_Package();

		/**
		 * The meta object literal for the '<em><b>Connects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__CONNECTS = eINSTANCE.getDevice_Connects();

		/**
		 * The meta object literal for the '<em><b>Technologies</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__TECHNOLOGIES = eINSTANCE.getDevice_Technologies();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.ConnectsImpl <em>Connects</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.ConnectsImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getConnects()
		 * @generated
		 */
		EClass CONNECTS = eINSTANCE.getConnects();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTS__CONNECT = eINSTANCE.getConnects_Connect();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.ConnectImpl <em>Connect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.ConnectImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getConnect()
		 * @generated
		 */
		EClass CONNECT = eINSTANCE.getConnect();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT__GATE = eINSTANCE.getConnect_Gate();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT__PIN = eINSTANCE.getConnect_Pin();

		/**
		 * The meta object literal for the '<em><b>Pad</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT__PAD = eINSTANCE.getConnect_Pad();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECT__ROUTE = eINSTANCE.getConnect_Route();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.TechnologiesImpl <em>Technologies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.TechnologiesImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getTechnologies()
		 * @generated
		 */
		EClass TECHNOLOGIES = eINSTANCE.getTechnologies();

		/**
		 * The meta object literal for the '<em><b>Technology</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGIES__TECHNOLOGY = eINSTANCE.getTechnologies_Technology();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.TechnologyImpl <em>Technology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.TechnologyImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getTechnology()
		 * @generated
		 */
		EClass TECHNOLOGY = eINSTANCE.getTechnology();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TECHNOLOGY__NAME = eINSTANCE.getTechnology_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TECHNOLOGY__ATTRIBUTE = eINSTANCE.getTechnology_Attribute();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.PlainImpl <em>Plain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.PlainImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPlain()
		 * @generated
		 */
		EClass PLAIN = eINSTANCE.getPlain();

		/**
		 * The meta object literal for the '<em><b>Polygon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN__POLYGON = eINSTANCE.getPlain_Polygon();

		/**
		 * The meta object literal for the '<em><b>Wire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN__WIRE = eINSTANCE.getPlain_Wire();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN__TEXT = eINSTANCE.getPlain_Text();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN__DIMENSION = eINSTANCE.getPlain_Dimension();

		/**
		 * The meta object literal for the '<em><b>Circle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN__CIRCLE = eINSTANCE.getPlain_Circle();

		/**
		 * The meta object literal for the '<em><b>Rectangle</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN__RECTANGLE = eINSTANCE.getPlain_Rectangle();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN__FRAME = eINSTANCE.getPlain_Frame();

		/**
		 * The meta object literal for the '<em><b>Hole</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAIN__HOLE = eINSTANCE.getPlain_Hole();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.InstancesImpl <em>Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.InstancesImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getInstances()
		 * @generated
		 */
		EClass INSTANCES = eINSTANCE.getInstances();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCES__INSTANCE = eINSTANCE.getInstances_Instance();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.InstanceImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__PART = eINSTANCE.getInstance_Part();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__GATE = eINSTANCE.getInstance_Gate();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__X = eINSTANCE.getInstance_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__Y = eINSTANCE.getInstance_Y();

		/**
		 * The meta object literal for the '<em><b>Smashed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__SMASHED = eINSTANCE.getInstance_Smashed();

		/**
		 * The meta object literal for the '<em><b>Rot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANCE__ROT = eINSTANCE.getInstance_Rot();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__ATTRIBUTE = eINSTANCE.getInstance_Attribute();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.BussesImpl <em>Busses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.BussesImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getBusses()
		 * @generated
		 */
		EClass BUSSES = eINSTANCE.getBusses();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUSSES__BUS = eINSTANCE.getBusses_Bus();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.BusImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUS__NAME = eINSTANCE.getBus_Name();

		/**
		 * The meta object literal for the '<em><b>Segment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__SEGMENT = eINSTANCE.getBus_Segment();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.NetsImpl <em>Nets</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.NetsImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getNets()
		 * @generated
		 */
		EClass NETS = eINSTANCE.getNets();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NETS__NET = eINSTANCE.getNets_Net();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.NetImpl <em>Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.NetImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getNet()
		 * @generated
		 */
		EClass NET = eINSTANCE.getNet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NET__NAME = eINSTANCE.getNet_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET__CLASS = eINSTANCE.getNet_Class();

		/**
		 * The meta object literal for the '<em><b>Segment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NET__SEGMENT = eINSTANCE.getNet_Segment();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.SegmentImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Pinref</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__PINREF = eINSTANCE.getSegment_Pinref();

		/**
		 * The meta object literal for the '<em><b>Wire</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__WIRE = eINSTANCE.getSegment_Wire();

		/**
		 * The meta object literal for the '<em><b>Junction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__JUNCTION = eINSTANCE.getSegment_Junction();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__LABEL = eINSTANCE.getSegment_Label();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.PinrefImpl <em>Pinref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.PinrefImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPinref()
		 * @generated
		 */
		EClass PINREF = eINSTANCE.getPinref();

		/**
		 * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINREF__PART = eINSTANCE.getPinref_Part();

		/**
		 * The meta object literal for the '<em><b>Gate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINREF__GATE = eINSTANCE.getPinref_Gate();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PINREF__PIN = eINSTANCE.getPinref_Pin();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.JunctionImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNCTION__X = eINSTANCE.getJunction_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNCTION__Y = eINSTANCE.getJunction_Y();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.LabelImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__X = eINSTANCE.getLabel_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__Y = eINSTANCE.getLabel_Y();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__SIZE = eINSTANCE.getLabel_Size();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__LAYER = eINSTANCE.getLabel_Layer();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FONT = eINSTANCE.getLabel_Font();

		/**
		 * The meta object literal for the '<em><b>Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__RATIO = eINSTANCE.getLabel_Ratio();

		/**
		 * The meta object literal for the '<em><b>Rot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ROT = eINSTANCE.getLabel_Rot();

		/**
		 * The meta object literal for the '<em><b>Xref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__XREF = eINSTANCE.getLabel_Xref();

		/**
		 * The meta object literal for the '{@link eaglemodel.impl.ApprovedImpl <em>Approved</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.impl.ApprovedImpl
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getApproved()
		 * @generated
		 */
		EClass APPROVED = eINSTANCE.getApproved();

		/**
		 * The meta object literal for the '<em><b>Hash</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPROVED__HASH = eINSTANCE.getApproved_Hash();

		/**
		 * The meta object literal for the '{@link eaglemodel.Severity <em>Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.Severity
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getSeverity()
		 * @generated
		 */
		EEnum SEVERITY = eINSTANCE.getSeverity();

		/**
		 * The meta object literal for the '{@link eaglemodel.GateAddLevel <em>Gate Add Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.GateAddLevel
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getGateAddLevel()
		 * @generated
		 */
		EEnum GATE_ADD_LEVEL = eINSTANCE.getGateAddLevel();

		/**
		 * The meta object literal for the '{@link eaglemodel.WireStyle <em>Wire Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.WireStyle
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getWireStyle()
		 * @generated
		 */
		EEnum WIRE_STYLE = eINSTANCE.getWireStyle();

		/**
		 * The meta object literal for the '{@link eaglemodel.WireCap <em>Wire Cap</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.WireCap
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getWireCap()
		 * @generated
		 */
		EEnum WIRE_CAP = eINSTANCE.getWireCap();

		/**
		 * The meta object literal for the '{@link eaglemodel.DimensionType <em>Dimension Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.DimensionType
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getDimensionType()
		 * @generated
		 */
		EEnum DIMENSION_TYPE = eINSTANCE.getDimensionType();

		/**
		 * The meta object literal for the '{@link eaglemodel.GridUnit <em>Grid Unit</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.GridUnit
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getGridUnit()
		 * @generated
		 */
		EEnum GRID_UNIT = eINSTANCE.getGridUnit();

		/**
		 * The meta object literal for the '{@link eaglemodel.GridStyle <em>Grid Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.GridStyle
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getGridStyle()
		 * @generated
		 */
		EEnum GRID_STYLE = eINSTANCE.getGridStyle();

		/**
		 * The meta object literal for the '{@link eaglemodel.TextFont <em>Text Font</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.TextFont
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getTextFont()
		 * @generated
		 */
		EEnum TEXT_FONT = eINSTANCE.getTextFont();

		/**
		 * The meta object literal for the '{@link eaglemodel.Align <em>Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.Align
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getAlign()
		 * @generated
		 */
		EEnum ALIGN = eINSTANCE.getAlign();

		/**
		 * The meta object literal for the '{@link eaglemodel.PadShape <em>Pad Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.PadShape
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPadShape()
		 * @generated
		 */
		EEnum PAD_SHAPE = eINSTANCE.getPadShape();

		/**
		 * The meta object literal for the '{@link eaglemodel.PolygonPour <em>Polygon Pour</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.PolygonPour
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPolygonPour()
		 * @generated
		 */
		EEnum POLYGON_POUR = eINSTANCE.getPolygonPour();

		/**
		 * The meta object literal for the '{@link eaglemodel.PinVisible <em>Pin Visible</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.PinVisible
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPinVisible()
		 * @generated
		 */
		EEnum PIN_VISIBLE = eINSTANCE.getPinVisible();

		/**
		 * The meta object literal for the '{@link eaglemodel.PinLength <em>Pin Length</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.PinLength
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPinLength()
		 * @generated
		 */
		EEnum PIN_LENGTH = eINSTANCE.getPinLength();

		/**
		 * The meta object literal for the '{@link eaglemodel.PinDirection <em>Pin Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.PinDirection
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPinDirection()
		 * @generated
		 */
		EEnum PIN_DIRECTION = eINSTANCE.getPinDirection();

		/**
		 * The meta object literal for the '{@link eaglemodel.PinFunction <em>Pin Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.PinFunction
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getPinFunction()
		 * @generated
		 */
		EEnum PIN_FUNCTION = eINSTANCE.getPinFunction();

		/**
		 * The meta object literal for the '{@link eaglemodel.ContactRoute <em>Contact Route</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.ContactRoute
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getContactRoute()
		 * @generated
		 */
		EEnum CONTACT_ROUTE = eINSTANCE.getContactRoute();

		/**
		 * The meta object literal for the '{@link eaglemodel.AttributeDisplay <em>Attribute Display</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.AttributeDisplay
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getAttributeDisplay()
		 * @generated
		 */
		EEnum ATTRIBUTE_DISPLAY = eINSTANCE.getAttributeDisplay();

		/**
		 * The meta object literal for the '{@link eaglemodel.VerticalText <em>Vertical Text</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eaglemodel.VerticalText
		 * @see eaglemodel.impl.EaglemodelPackageImpl#getVerticalText()
		 * @generated
		 */
		EEnum VERTICAL_TEXT = eINSTANCE.getVerticalText();

	}

} //EaglemodelPackage
