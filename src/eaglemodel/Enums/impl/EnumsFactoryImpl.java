/**
 */
package eaglemodel.Enums.impl;

import eaglemodel.Enums.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class EnumsFactoryImpl extends EFactoryImpl implements EnumsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumsFactory init() {
		try {
			EnumsFactory theEnumsFactory = (EnumsFactory)EPackage.Registry.INSTANCE.getEFactory(EnumsPackage.eNS_URI);
			if (theEnumsFactory != null) {
				return theEnumsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnumsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case EnumsPackage.GATE_ADD_LEVEL:
				return createGateAddLevelFromString(eDataType, initialValue);
			case EnumsPackage.WIRE_STYLE:
				return createWireStyleFromString(eDataType, initialValue);
			case EnumsPackage.WIRE_CAP:
				return createWireCapFromString(eDataType, initialValue);
			case EnumsPackage.DIMENSION_TYPE:
				return createDimensionTypeFromString(eDataType, initialValue);
			case EnumsPackage.GRID_UNIT:
				return createGridUnitFromString(eDataType, initialValue);
			case EnumsPackage.GRID_STYLE:
				return createGridStyleFromString(eDataType, initialValue);
			case EnumsPackage.TEXT_FONT:
				return createTextFontFromString(eDataType, initialValue);
			case EnumsPackage.ALIGN:
				return createAlignFromString(eDataType, initialValue);
			case EnumsPackage.PAD_SHAPE:
				return createPadShapeFromString(eDataType, initialValue);
			case EnumsPackage.POLYGON_POUR:
				return createPolygonPourFromString(eDataType, initialValue);
			case EnumsPackage.PIN_VISIBLE:
				return createPinVisibleFromString(eDataType, initialValue);
			case EnumsPackage.PIN_LENGTH:
				return createPinLengthFromString(eDataType, initialValue);
			case EnumsPackage.PIN_DIRECTION:
				return createPinDirectionFromString(eDataType, initialValue);
			case EnumsPackage.PIN_FUNCTION:
				return createPinFunctionFromString(eDataType, initialValue);
			case EnumsPackage.CONTACT_ROUTE:
				return createContactRouteFromString(eDataType, initialValue);
			case EnumsPackage.ATTRIBUTE_DISPLAY:
				return createAttributeDisplayFromString(eDataType, initialValue);
			case EnumsPackage.VERTICAL_TEXT:
				return createVerticalTextFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case EnumsPackage.GATE_ADD_LEVEL:
				return convertGateAddLevelToString(eDataType, instanceValue);
			case EnumsPackage.WIRE_STYLE:
				return convertWireStyleToString(eDataType, instanceValue);
			case EnumsPackage.WIRE_CAP:
				return convertWireCapToString(eDataType, instanceValue);
			case EnumsPackage.DIMENSION_TYPE:
				return convertDimensionTypeToString(eDataType, instanceValue);
			case EnumsPackage.GRID_UNIT:
				return convertGridUnitToString(eDataType, instanceValue);
			case EnumsPackage.GRID_STYLE:
				return convertGridStyleToString(eDataType, instanceValue);
			case EnumsPackage.TEXT_FONT:
				return convertTextFontToString(eDataType, instanceValue);
			case EnumsPackage.ALIGN:
				return convertAlignToString(eDataType, instanceValue);
			case EnumsPackage.PAD_SHAPE:
				return convertPadShapeToString(eDataType, instanceValue);
			case EnumsPackage.POLYGON_POUR:
				return convertPolygonPourToString(eDataType, instanceValue);
			case EnumsPackage.PIN_VISIBLE:
				return convertPinVisibleToString(eDataType, instanceValue);
			case EnumsPackage.PIN_LENGTH:
				return convertPinLengthToString(eDataType, instanceValue);
			case EnumsPackage.PIN_DIRECTION:
				return convertPinDirectionToString(eDataType, instanceValue);
			case EnumsPackage.PIN_FUNCTION:
				return convertPinFunctionToString(eDataType, instanceValue);
			case EnumsPackage.CONTACT_ROUTE:
				return convertContactRouteToString(eDataType, instanceValue);
			case EnumsPackage.ATTRIBUTE_DISPLAY:
				return convertAttributeDisplayToString(eDataType, instanceValue);
			case EnumsPackage.VERTICAL_TEXT:
				return convertVerticalTextToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GateAddLevel createGateAddLevelFromString(EDataType eDataType, String initialValue) {
		GateAddLevel result = GateAddLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGateAddLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireStyle createWireStyleFromString(EDataType eDataType, String initialValue) {
		WireStyle result = WireStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWireStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireCap createWireCapFromString(EDataType eDataType, String initialValue) {
		WireCap result = WireCap.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWireCapToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType createDimensionTypeFromString(EDataType eDataType, String initialValue) {
		DimensionType result = DimensionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridUnit createGridUnitFromString(EDataType eDataType, String initialValue) {
		GridUnit result = GridUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGridUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridStyle createGridStyleFromString(EDataType eDataType, String initialValue) {
		GridStyle result = GridStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGridStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextFont createTextFontFromString(EDataType eDataType, String initialValue) {
		TextFont result = TextFont.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextFontToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align createAlignFromString(EDataType eDataType, String initialValue) {
		Align result = Align.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PadShape createPadShapeFromString(EDataType eDataType, String initialValue) {
		PadShape result = PadShape.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPadShapeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonPour createPolygonPourFromString(EDataType eDataType, String initialValue) {
		PolygonPour result = PolygonPour.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPolygonPourToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinVisible createPinVisibleFromString(EDataType eDataType, String initialValue) {
		PinVisible result = PinVisible.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinVisibleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinLength createPinLengthFromString(EDataType eDataType, String initialValue) {
		PinLength result = PinLength.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinLengthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinDirection createPinDirectionFromString(EDataType eDataType, String initialValue) {
		PinDirection result = PinDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PinFunction createPinFunctionFromString(EDataType eDataType, String initialValue) {
		PinFunction result = PinFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPinFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactRoute createContactRouteFromString(EDataType eDataType, String initialValue) {
		ContactRoute result = ContactRoute.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContactRouteToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDisplay createAttributeDisplayFromString(EDataType eDataType, String initialValue) {
		AttributeDisplay result = AttributeDisplay.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAttributeDisplayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalText createVerticalTextFromString(EDataType eDataType, String initialValue) {
		VerticalText result = VerticalText.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalTextToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumsPackage getEnumsPackage() {
		return (EnumsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static EnumsPackage getPackage() {
		return EnumsPackage.eINSTANCE;
	}

} //EnumsFactoryImpl
