/**
 */
package eaglemodel.impl;

import eaglemodel.Bus;
import eaglemodel.Description;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Instance;
import eaglemodel.Net;
import eaglemodel.Plain;
import eaglemodel.Sheet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eaglemodel.impl.SheetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.impl.SheetImpl#getPlain <em>Plain</em>}</li>
 *   <li>{@link eaglemodel.impl.SheetImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link eaglemodel.impl.SheetImpl#getBusses <em>Busses</em>}</li>
 *   <li>{@link eaglemodel.impl.SheetImpl#getNets <em>Nets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SheetImpl extends MinimalEObjectImpl.Container implements Sheet {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getPlain() <em>Plain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlain()
	 * @generated
	 * @ordered
	 */
	protected Plain plain;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList instances;

	/**
	 * The cached value of the '{@link #getBusses() <em>Busses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusses()
	 * @generated
	 * @ordered
	 */
	protected EList busses;

	/**
	 * The cached value of the '{@link #getNets() <em>Nets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNets()
	 * @generated
	 * @ordered
	 */
	protected EList nets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SheetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (Description)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.SHEET__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plain getPlain() {
		if (plain != null && plain.eIsProxy()) {
			InternalEObject oldPlain = (InternalEObject)plain;
			plain = (Plain)eResolveProxy(oldPlain);
			if (plain != oldPlain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EaglemodelPackage.SHEET__PLAIN, oldPlain, plain));
			}
		}
		return plain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plain basicGetPlain() {
		return plain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlain(Plain newPlain) {
		Plain oldPlain = plain;
		plain = newPlain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__PLAIN, oldPlain, plain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getInstances() {
		if (instances == null) {
			instances = new EObjectResolvingEList(Instance.class, this, EaglemodelPackage.SHEET__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getBusses() {
		if (busses == null) {
			busses = new EObjectResolvingEList(Bus.class, this, EaglemodelPackage.SHEET__BUSSES);
		}
		return busses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNets() {
		if (nets == null) {
			nets = new EObjectResolvingEList(Net.class, this, EaglemodelPackage.SHEET__NETS);
		}
		return nets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.SHEET__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case EaglemodelPackage.SHEET__PLAIN:
				if (resolve) return getPlain();
				return basicGetPlain();
			case EaglemodelPackage.SHEET__INSTANCES:
				return getInstances();
			case EaglemodelPackage.SHEET__BUSSES:
				return getBusses();
			case EaglemodelPackage.SHEET__NETS:
				return getNets();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaglemodelPackage.SHEET__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case EaglemodelPackage.SHEET__PLAIN:
				setPlain((Plain)newValue);
				return;
			case EaglemodelPackage.SHEET__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SHEET__BUSSES:
				getBusses().clear();
				getBusses().addAll((Collection)newValue);
				return;
			case EaglemodelPackage.SHEET__NETS:
				getNets().clear();
				getNets().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case EaglemodelPackage.SHEET__DESCRIPTION:
				setDescription((Description)null);
				return;
			case EaglemodelPackage.SHEET__PLAIN:
				setPlain((Plain)null);
				return;
			case EaglemodelPackage.SHEET__INSTANCES:
				getInstances().clear();
				return;
			case EaglemodelPackage.SHEET__BUSSES:
				getBusses().clear();
				return;
			case EaglemodelPackage.SHEET__NETS:
				getNets().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EaglemodelPackage.SHEET__DESCRIPTION:
				return description != null;
			case EaglemodelPackage.SHEET__PLAIN:
				return plain != null;
			case EaglemodelPackage.SHEET__INSTANCES:
				return instances != null && !instances.isEmpty();
			case EaglemodelPackage.SHEET__BUSSES:
				return busses != null && !busses.isEmpty();
			case EaglemodelPackage.SHEET__NETS:
				return nets != null && !nets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SheetImpl
