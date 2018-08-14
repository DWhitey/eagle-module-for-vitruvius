/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Part#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Part#getLibrary <em>Library</em>}</li>
 *   <li>{@link eaglemodel.Part#getDeviceset <em>Deviceset</em>}</li>
 *   <li>{@link eaglemodel.Part#getDevice <em>Device</em>}</li>
 *   <li>{@link eaglemodel.Part#getTechnology <em>Technology</em>}</li>
 *   <li>{@link eaglemodel.Part#getValue <em>Value</em>}</li>
 *   <li>{@link eaglemodel.Part#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link eaglemodel.Part#getVariant <em>Variant</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getPart()
 * @model
 * @generated
 */
public interface Part extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see eaglemodel.EaglemodelPackage#getPart_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Part#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute.
	 * @see #setLibrary(String)
	 * @see eaglemodel.EaglemodelPackage#getPart_Library()
	 * @model required="true"
	 * @generated
	 */
	String getLibrary();

	/**
	 * Sets the value of the '{@link eaglemodel.Part#getLibrary <em>Library</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Library</em>' attribute.
	 * @see #getLibrary()
	 * @generated
	 */
	void setLibrary(String value);

	/**
	 * Returns the value of the '<em><b>Deviceset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deviceset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deviceset</em>' attribute.
	 * @see #setDeviceset(String)
	 * @see eaglemodel.EaglemodelPackage#getPart_Deviceset()
	 * @model required="true"
	 * @generated
	 */
	String getDeviceset();

	/**
	 * Sets the value of the '{@link eaglemodel.Part#getDeviceset <em>Deviceset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deviceset</em>' attribute.
	 * @see #getDeviceset()
	 * @generated
	 */
	void setDeviceset(String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(String)
	 * @see eaglemodel.EaglemodelPackage#getPart_Device()
	 * @model required="true"
	 * @generated
	 */
	String getDevice();

	/**
	 * Sets the value of the '{@link eaglemodel.Part#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(String value);

	/**
	 * Returns the value of the '<em><b>Technology</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technology</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technology</em>' attribute.
	 * @see #setTechnology(String)
	 * @see eaglemodel.EaglemodelPackage#getPart_Technology()
	 * @model
	 * @generated
	 */
	String getTechnology();

	/**
	 * Sets the value of the '{@link eaglemodel.Part#getTechnology <em>Technology</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technology</em>' attribute.
	 * @see #getTechnology()
	 * @generated
	 */
	void setTechnology(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see eaglemodel.EaglemodelPackage#getPart_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link eaglemodel.Part#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getPart_Attribute()
	 * @model type="eaglemodel.Attribute"
	 * @generated
	 */
	EList getAttribute();

	/**
	 * Returns the value of the '<em><b>Variant</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Variant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variant</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getPart_Variant()
	 * @model type="eaglemodel.Variant"
	 * @generated
	 */
	EList getVariant();

} // Part
