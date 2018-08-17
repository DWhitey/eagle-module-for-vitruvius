/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Segment#getPinref <em>Pinref</em>}</li>
 *   <li>{@link eaglemodel.Segment#getWire <em>Wire</em>}</li>
 *   <li>{@link eaglemodel.Segment#getJunction <em>Junction</em>}</li>
 *   <li>{@link eaglemodel.Segment#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getSegment()
 * @model
 * @generated
 */
public interface Segment extends EObject {
	/**
	 * Returns the value of the '<em><b>Pinref</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Pinref}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pinref</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pinref</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getSegment_Pinref()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pinref> getPinref();

	/**
	 * Returns the value of the '<em><b>Wire</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Wire}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getSegment_Wire()
	 * @model containment="true"
	 * @generated
	 */
	EList<Wire> getWire();

	/**
	 * Returns the value of the '<em><b>Junction</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Junction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Junction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Junction</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getSegment_Junction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Junction> getJunction();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Label}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getSegment_Label()
	 * @model containment="true"
	 * @generated
	 */
	EList<Label> getLabel();

} // Segment
