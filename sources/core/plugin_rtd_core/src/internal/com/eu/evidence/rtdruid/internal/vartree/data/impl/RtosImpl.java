/**
 * <copyright>
 * </copyright>
 *
 * %W%
 * @version %I% %H%
 */
package com.eu.evidence.rtdruid.internal.vartree.data.impl;




import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import com.eu.evidence.rtdruid.vartree.data.DataPackage;
import com.eu.evidence.rtdruid.vartree.data.Rtos;
import com.eu.evidence.rtdruid.vartree.data.init.ObjectWithIDImpl;
import com.eu.evidence.rtdruid.vartree.variables.OilVar;
import com.eu.evidence.rtdruid.vartree.variables.StringVar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtos</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.eu.evidence.rtdruid.internal.vartree.data.impl.RtosImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.internal.vartree.data.impl.RtosImpl#getOilVar <em>Oil Var</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.internal.vartree.data.impl.RtosImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.vartree.data.impl.RtosImpl#getMethods <em>Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RtosImpl extends ObjectWithIDImpl implements Rtos
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final StringVar NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected StringVar name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOilVar() <em>Oil Var</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOilVar()
	 * @generated
	 * @ordered
	 */
  protected static final OilVar OIL_VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOilVar() <em>Oil Var</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOilVar()
	 * @generated
	 * @ordered
	 */
  protected OilVar oilVar = OIL_VAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final StringVar TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected StringVar type = TYPE_EDEFAULT;

 	/**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
	protected EList methods;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RtosImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EClass eStaticClass() {
		return DataPackage.eINSTANCE.getRtos();
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StringVar getName() {
		return name;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void setName(StringVar newName)
  {
	if ( !checkNewID(makeID(newName)) ) return;
  	
  	// Store old ID
  	String old_ID = getObjectID();
  	
    StringVar oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RTOS__NAME, oldName, name));
	
	// ASk to update ID
  	didSetObjectID(old_ID);

  }

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OilVar getOilVar() {
		return oilVar;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setOilVar(OilVar newOilVar) {
		OilVar oldOilVar = oilVar;
		oilVar = newOilVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RTOS__OIL_VAR, oldOilVar, oilVar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringVar getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(StringVar newType) {
		StringVar oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.RTOS__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
		public EList getMethods() {
		if (methods == null) {
			methods = new EDataTypeUniqueEList(StringVar.class, this, DataPackage.RTOS__METHODS);
		}
		return methods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
  public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case DataPackage.RTOS__NAME:
				return getName();
			case DataPackage.RTOS__OIL_VAR:
				return getOilVar();
			case DataPackage.RTOS__TYPE:
				return getType();
			case DataPackage.RTOS__METHODS:
				return getMethods();
		}
		return super.eGet(eFeature, resolve);
//		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case DataPackage.RTOS__NAME:
				setName((StringVar)newValue);
				return;
			case DataPackage.RTOS__OIL_VAR:
				setOilVar((OilVar)newValue);
				return;
			case DataPackage.RTOS__TYPE:
				setType((StringVar)newValue);
				return;
			case DataPackage.RTOS__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection)newValue);
				return;
		}
		super.eSet(eFeature, newValue);
//		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case DataPackage.RTOS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.RTOS__OIL_VAR:
				setOilVar(OIL_VAR_EDEFAULT);
				return;
			case DataPackage.RTOS__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case DataPackage.RTOS__METHODS:
				getMethods().clear();
				return;
		}
		super.eUnset(eFeature);
//		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case DataPackage.RTOS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DataPackage.RTOS__OIL_VAR:
				return OIL_VAR_EDEFAULT == null ? oilVar != null : !OIL_VAR_EDEFAULT.equals(oilVar);
			case DataPackage.RTOS__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case DataPackage.RTOS__METHODS:
				return methods != null && !methods.isEmpty();
		}
		return super.eIsSet(eFeature);
//		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Name: ");
		result.append(name);
		result.append(", OilVar: ");
		result.append(oilVar);
		result.append(", Type: ");
		result.append(type);
		result.append(", Methods: ");
		result.append(methods);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see rtdruid.vartree.data.ObjectWithID#getObjectID()
	 */
	public String getObjectID() {
		if (true) return "Rtos"; // just until a cpu can contain only one RTOS
		
		return makeID(name);
	}

	/* (non-Javadoc)
	 * @see rtdruid.vartree.data.ObjectWithID#setObjectID(java.lang.String)
	 */
	public boolean setObjectID(String newID) {
	  	if ( !checkNewID(newID) ) return false;

	  	// Store old ID
//	  	String old_ID = getObjectID();
		// ASk to update ID
//	  	didSetObjectID(old_ID);

	  	// just until a cpu can contain only one RTOS
		// setName(newID == null ? (StringVar) null : new StringVar(newID));
		return true;
	}
} //RtosImpl
