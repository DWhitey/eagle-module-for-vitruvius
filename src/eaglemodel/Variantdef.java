/**
 */
package eaglemodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variantdef</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eaglemodel.Variantdef#getName <em>Name</em>}</li>
 *   <li>{@link eaglemodel.Variantdef#isCurrent <em>Current</em>}</li>
 * </ul>
 * </p>
 *
 * @see eaglemodel.EaglemodelPackage#getVariantdef()
 * @model
 * @generated
 */
public interface Variantdef extends EObject {
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
	 * @see eaglemodel.EaglemodelPackage#getVariantdef_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link eaglemodel.Variantdef#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current</em>' attribute.
	 * @see #setCurrent(boolean)
	 * @see eaglemodel.EaglemodelPackage#getVariantdef_Current()
	 * @model default="false"
	 * @generated
	 */
	boolean isCurrent();

	/**
	 * Sets the value of the '{@link eaglemodel.Variantdef#isCurrent <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' attribute.
	 * @see #isCurrent()
	 * @generated
	 */
	void setCurrent(boolean value);

} // Variantdef
