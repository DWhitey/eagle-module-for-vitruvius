/**
 */
package eaglemodel.impl;

import eaglemodel.EaglemodelPackage;
import eaglemodel.Junction;
import eaglemodel.Label;
import eaglemodel.Pinref;
import eaglemodel.Segment;
import eaglemodel.Wire;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eaglemodel.impl.SegmentImpl#getPinref <em>Pinref</em>}</li>
 *   <li>{@link eaglemodel.impl.SegmentImpl#getWire <em>Wire</em>}</li>
 *   <li>{@link eaglemodel.impl.SegmentImpl#getJunction <em>Junction</em>}</li>
 *   <li>{@link eaglemodel.impl.SegmentImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SegmentImpl extends MinimalEObjectImpl.Container implements Segment {
	/**
	 * The cached value of the '{@link #getPinref() <em>Pinref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinref()
	 * @generated
	 * @ordered
	 */
	protected EList<Pinref> pinref;

	/**
	 * The cached value of the '{@link #getWire() <em>Wire</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWire()
	 * @generated
	 * @ordered
	 */
	protected EList<Wire> wire;

	/**
	 * The cached value of the '{@link #getJunction() <em>Junction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJunction()
	 * @generated
	 * @ordered
	 */
	protected EList<Junction> junction;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected EList<Label> label;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EaglemodelPackage.Literals.SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pinref> getPinref() {
		if (pinref == null) {
			pinref = new EObjectContainmentEList<Pinref>(Pinref.class, this, EaglemodelPackage.SEGMENT__PINREF);
		}
		return pinref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Wire> getWire() {
		if (wire == null) {
			wire = new EObjectContainmentEList<Wire>(Wire.class, this, EaglemodelPackage.SEGMENT__WIRE);
		}
		return wire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Junction> getJunction() {
		if (junction == null) {
			junction = new EObjectContainmentEList<Junction>(Junction.class, this, EaglemodelPackage.SEGMENT__JUNCTION);
		}
		return junction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Label> getLabel() {
		if (label == null) {
			label = new EObjectContainmentEList<Label>(Label.class, this, EaglemodelPackage.SEGMENT__LABEL);
		}
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EaglemodelPackage.SEGMENT__PINREF:
				return ((InternalEList<?>)getPinref()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.SEGMENT__WIRE:
				return ((InternalEList<?>)getWire()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.SEGMENT__JUNCTION:
				return ((InternalEList<?>)getJunction()).basicRemove(otherEnd, msgs);
			case EaglemodelPackage.SEGMENT__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
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
			case EaglemodelPackage.SEGMENT__PINREF:
				return getPinref();
			case EaglemodelPackage.SEGMENT__WIRE:
				return getWire();
			case EaglemodelPackage.SEGMENT__JUNCTION:
				return getJunction();
			case EaglemodelPackage.SEGMENT__LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EaglemodelPackage.SEGMENT__PINREF:
				getPinref().clear();
				getPinref().addAll((Collection<? extends Pinref>)newValue);
				return;
			case EaglemodelPackage.SEGMENT__WIRE:
				getWire().clear();
				getWire().addAll((Collection<? extends Wire>)newValue);
				return;
			case EaglemodelPackage.SEGMENT__JUNCTION:
				getJunction().clear();
				getJunction().addAll((Collection<? extends Junction>)newValue);
				return;
			case EaglemodelPackage.SEGMENT__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends Label>)newValue);
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
			case EaglemodelPackage.SEGMENT__PINREF:
				getPinref().clear();
				return;
			case EaglemodelPackage.SEGMENT__WIRE:
				getWire().clear();
				return;
			case EaglemodelPackage.SEGMENT__JUNCTION:
				getJunction().clear();
				return;
			case EaglemodelPackage.SEGMENT__LABEL:
				getLabel().clear();
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
			case EaglemodelPackage.SEGMENT__PINREF:
				return pinref != null && !pinref.isEmpty();
			case EaglemodelPackage.SEGMENT__WIRE:
				return wire != null && !wire.isEmpty();
			case EaglemodelPackage.SEGMENT__JUNCTION:
				return junction != null && !junction.isEmpty();
			case EaglemodelPackage.SEGMENT__LABEL:
				return label != null && !label.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SegmentImpl
