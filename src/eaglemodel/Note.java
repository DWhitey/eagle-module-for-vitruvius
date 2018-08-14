/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Note#getVersion <em>Version</em>}</li>
 *   <li>{@link eaglemodel.Note#getSeverity <em>Severity</em>}</li>
 *   <li>{@link eaglemodel.Note#getPcdata <em>Pcdata</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getNote()
 * @model
 * @generated
 */
public interface Note extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see eaglemodel.EaglemodelPackage#getNote_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link eaglemodel.Note#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see eaglemodel.EaglemodelPackage#getNote_Severity()
	 * @model required="true"
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link eaglemodel.Note#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

	/**
	 * Returns the value of the '<em><b>Pcdata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pcdata</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pcdata</em>' attribute.
	 * @see #setPcdata(String)
	 * @see eaglemodel.EaglemodelPackage#getNote_Pcdata()
	 * @model
	 * @generated
	 */
	String getPcdata();

	/**
	 * Sets the value of the '{@link eaglemodel.Note#getPcdata <em>Pcdata</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pcdata</em>' attribute.
	 * @see #getPcdata()
	 * @generated
	 */
	void setPcdata(String value);

} // Note
