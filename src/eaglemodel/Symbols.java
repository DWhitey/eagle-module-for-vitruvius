/**
 */
package eaglemodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbols</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.Symbols#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see eaglemodel.EaglemodelPackage#getSymbols()
 * @model
 * @generated
 */
public interface Symbols extends EObject {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' containment reference list.
	 * The list contents are of type {@link eaglemodel.Symbol}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Symbol</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' containment reference list.
	 * @see eaglemodel.EaglemodelPackage#getSymbols_Symbol()
	 * @model containment="true"
	 * @generated
	 */
	EList<Symbol> getSymbol();

} // Symbols
