/**
 */
package eaglemodel.impl;

import eaglemodel.Busses;
import eaglemodel.Description;
import eaglemodel.EaglemodelPackage;
import eaglemodel.Instances;
import eaglemodel.Nets;
import eaglemodel.Plain;
import eaglemodel.Sheet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.SheetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eaglemodel.impl.SheetImpl#getPlain <em>Plain</em>}</li>
 *   <li>{@link eaglemodel.impl.SheetImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link eaglemodel.impl.SheetImpl#getBusses <em>Busses</em>}</li>
 *   <li>{@link eaglemodel.impl.SheetImpl#getNets <em>Nets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SheetImpl extends MinimalEObjectImpl.Container implements Sheet {
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getPlain() <em>Plain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlain()
	 * @generated
	 * @ordered
	 */
	protected Plain plain;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected Instances instances;

	/**
	 * The cached value of the '{@link #getBusses() <em>Busses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusses()
	 * @generated
	 * @ordered
	 */
	protected Busses busses;

	/**
	 * The cached value of the '{@link #getNets() <em>Nets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNets()
	 * @generated
	 * @ordered
	 */
	protected Nets nets;

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
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.SHEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SHEET__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SHEET__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plain getPlain() {
		return plain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlain(Plain newPlain, NotificationChain msgs) {
		Plain oldPlain = plain;
		plain = newPlain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__PLAIN, oldPlain, newPlain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlain(Plain newPlain) {
		if (newPlain != plain) {
			NotificationChain msgs = null;
			if (plain != null)
				msgs = ((InternalEObject)plain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SHEET__PLAIN, null, msgs);
			if (newPlain != null)
				msgs = ((InternalEObject)newPlain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SHEET__PLAIN, null, msgs);
			msgs = basicSetPlain(newPlain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__PLAIN, newPlain, newPlain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instances getInstances() {
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstances(Instances newInstances, NotificationChain msgs) {
		Instances oldInstances = instances;
		instances = newInstances;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__INSTANCES, oldInstances, newInstances);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstances(Instances newInstances) {
		if (newInstances != instances) {
			NotificationChain msgs = null;
			if (instances != null)
				msgs = ((InternalEObject)instances).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SHEET__INSTANCES, null, msgs);
			if (newInstances != null)
				msgs = ((InternalEObject)newInstances).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SHEET__INSTANCES, null, msgs);
			msgs = basicSetInstances(newInstances, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__INSTANCES, newInstances, newInstances));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Busses getBusses() {
		return busses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBusses(Busses newBusses, NotificationChain msgs) {
		Busses oldBusses = busses;
		busses = newBusses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__BUSSES, oldBusses, newBusses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBusses(Busses newBusses) {
		if (newBusses != busses) {
			NotificationChain msgs = null;
			if (busses != null)
				msgs = ((InternalEObject)busses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SHEET__BUSSES, null, msgs);
			if (newBusses != null)
				msgs = ((InternalEObject)newBusses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SHEET__BUSSES, null, msgs);
			msgs = basicSetBusses(newBusses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__BUSSES, newBusses, newBusses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nets getNets() {
		return nets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNets(Nets newNets, NotificationChain msgs) {
		Nets oldNets = nets;
		nets = newNets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__NETS, oldNets, newNets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNets(Nets newNets) {
		if (newNets != nets) {
			NotificationChain msgs = null;
			if (nets != null)
				msgs = ((InternalEObject)nets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SHEET__NETS, null, msgs);
			if (newNets != null)
				msgs = ((InternalEObject)newNets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EaglemodelPackage.SHEET__NETS, null, msgs);
			msgs = basicSetNets(newNets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EaglemodelPackage.SHEET__NETS, newNets, newNets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.SHEET__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case EaglemodelPackage.SHEET__PLAIN:
				return basicSetPlain(null, msgs);
			case EaglemodelPackage.SHEET__INSTANCES:
				return basicSetInstances(null, msgs);
			case EaglemodelPackage.SHEET__BUSSES:
				return basicSetBusses(null, msgs);
			case EaglemodelPackage.SHEET__NETS:
				return basicSetNets(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EaglemodelPackage.SHEET__DESCRIPTION:
				return getDescription();
			case EaglemodelPackage.SHEET__PLAIN:
				return getPlain();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaglemodelPackage.SHEET__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case EaglemodelPackage.SHEET__PLAIN:
				setPlain((Plain)newValue);
				return;
			case EaglemodelPackage.SHEET__INSTANCES:
				setInstances((Instances)newValue);
				return;
			case EaglemodelPackage.SHEET__BUSSES:
				setBusses((Busses)newValue);
				return;
			case EaglemodelPackage.SHEET__NETS:
				setNets((Nets)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EaglemodelPackage.SHEET__DESCRIPTION:
				setDescription((Description)null);
				return;
			case EaglemodelPackage.SHEET__PLAIN:
				setPlain((Plain)null);
				return;
			case EaglemodelPackage.SHEET__INSTANCES:
				setInstances((Instances)null);
				return;
			case EaglemodelPackage.SHEET__BUSSES:
				setBusses((Busses)null);
				return;
			case EaglemodelPackage.SHEET__NETS:
				setNets((Nets)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EaglemodelPackage.SHEET__DESCRIPTION:
				return description != null;
			case EaglemodelPackage.SHEET__PLAIN:
				return plain != null;
			case EaglemodelPackage.SHEET__INSTANCES:
				return instances != null;
			case EaglemodelPackage.SHEET__BUSSES:
				return busses != null;
			case EaglemodelPackage.SHEET__NETS:
				return nets != null;
		}
		return super.eIsSet(featureID);
	}

} //SheetImpl
