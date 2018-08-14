/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Net#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Net#getClass_ <em>Class</em>}</li>
 *   <li>{@link eaglemodel.Net#getSegment <em>Segment</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getNet()
 * @model
 * @generated
 */
public interface Net extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getNet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Net#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(eaglemodel.Class)
	 * @see eaglemodel.EaglemodelPackage#getNet_Class()
	 * @model
	 * @generated
	 */
	eaglemodel.Class getClass_();

	/**
	 * Sets the value of the '{@link eaglemodel.Net#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(eaglemodel.Class value);

	/**
	 * Returns the value of the '<em><b>Segment</b></em>' reference list.
	 * The list contents are of type {@link eaglemodel.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' reference list.
	 * @see eaglemodel.EaglemodelPackage#getNet_Segment()
	 * @model type="eaglemodel.Segment"
	 * @generated
	 */
	EList getSegment();

} // Net
