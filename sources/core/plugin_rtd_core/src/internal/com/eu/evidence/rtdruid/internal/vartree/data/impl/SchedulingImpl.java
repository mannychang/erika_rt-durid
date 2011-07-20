/**
 * <copyright>
 * </copyright>
 *
 * %W%
 * @version %I% %H%
 */
package com.eu.evidence.rtdruid.internal.vartree.data.impl;




import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import com.eu.evidence.rtdruid.vartree.data.DataPackage;
import com.eu.evidence.rtdruid.vartree.data.Scheduling;
import com.eu.evidence.rtdruid.vartree.data.init.ObjectWithIDImpl;
import com.eu.evidence.rtdruid.vartree.variables.IntegerVar;
import com.eu.evidence.rtdruid.vartree.variables.StringVar;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scheduling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.eu.evidence.rtdruid.internal.vartree.data.impl.SchedulingImpl#getModeRef <em>Mode Ref</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.internal.vartree.data.impl.SchedulingImpl#getPreemptionGroupName <em>Preemption Group Name</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.internal.vartree.data.impl.SchedulingImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.internal.vartree.data.impl.SchedulingImpl#getStack <em>Stack</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.internal.vartree.data.impl.SchedulingImpl#getThreshold <em>Threshold</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SchedulingImpl extends ObjectWithIDImpl implements Scheduling
{
	/**
	 * The default value of the '{@link #getModeRef() <em>Mode Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getModeRef()
	 * @generated
	 * @ordered
	 */
  protected static final StringVar MODE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModeRef() <em>Mode Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getModeRef()
	 * @generated
	 * @ordered
	 */
  protected StringVar modeRef = MODE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getPreemptionGroupName() <em>Preemption Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPreemptionGroupName()
	 * @generated
	 * @ordered
	 */
  protected static final StringVar PREEMPTION_GROUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPreemptionGroupName() <em>Preemption Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPreemptionGroupName()
	 * @generated
	 * @ordered
	 */
  protected StringVar preemptionGroupName = PREEMPTION_GROUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
  protected static final IntegerVar PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
  protected IntegerVar priority = PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
  protected static final IntegerVar THRESHOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThreshold() <em>Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getThreshold()
	 * @generated
	 * @ordered
	 */
  protected IntegerVar threshold = THRESHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getStack() <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStack()
	 * @generated
	 * @ordered
	 */
	protected static final IntegerVar STACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStack() <em>Stack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStack()
	 * @generated
	 * @ordered
	 */
	protected IntegerVar stack = STACK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SchedulingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EClass eStaticClass() {
		return DataPackage.eINSTANCE.getScheduling();
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StringVar getModeRef() {
		return modeRef;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated NOT
   */
  public void setModeRef(StringVar newModeRef)
  {
	if ( !checkNewID(makeID(newModeRef)) ) return;
  	
  	// Store old ID
  	String old_ID = getObjectID();
  	
	setModeRefGen(newModeRef);
	
	// ASk to update ID
  	didSetObjectID(old_ID);
  }
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private void setModeRefGen(StringVar newModeRef) {
    StringVar oldModeRef = modeRef;
    modeRef = newModeRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEDULING__MODE_REF, oldModeRef, modeRef));
  }

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IntegerVar getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPriority(IntegerVar newPriority) {
		IntegerVar oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEDULING__PRIORITY, oldPriority, priority));
	}

  
	/**
	 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
	 * @generated
	 */
  	public IntegerVar getStack() {
		return stack;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStack(IntegerVar newStack) {
		IntegerVar oldStack = stack;
		stack = newStack;
 		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEDULING__STACK, oldStack, stack));
 	}

  	
	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public IntegerVar getThreshold() {
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setThreshold(IntegerVar newThreshold) {
		IntegerVar oldThreshold = threshold;
		threshold = newThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEDULING__THRESHOLD, oldThreshold, threshold));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StringVar getPreemptionGroupName() {
		return preemptionGroupName;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPreemptionGroupName(StringVar newPreemptionGroupName) {
		StringVar oldPreemptionGroupName = preemptionGroupName;
		preemptionGroupName = newPreemptionGroupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.SCHEDULING__PREEMPTION_GROUP_NAME, oldPreemptionGroupName, preemptionGroupName));
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case DataPackage.SCHEDULING__MODE_REF:
				return getModeRef();
			case DataPackage.SCHEDULING__PREEMPTION_GROUP_NAME:
				return getPreemptionGroupName();
			case DataPackage.SCHEDULING__PRIORITY:
				return getPriority();
			case DataPackage.SCHEDULING__STACK:
				return getStack();
			case DataPackage.SCHEDULING__THRESHOLD:
				return getThreshold();
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
			case DataPackage.SCHEDULING__MODE_REF:
				setModeRef((StringVar)newValue);
				return;
			case DataPackage.SCHEDULING__PREEMPTION_GROUP_NAME:
				setPreemptionGroupName((StringVar)newValue);
				return;
			case DataPackage.SCHEDULING__PRIORITY:
				setPriority((IntegerVar)newValue);
				return;
			case DataPackage.SCHEDULING__STACK:
				setStack((IntegerVar)newValue);
				return;
			case DataPackage.SCHEDULING__THRESHOLD:
				setThreshold((IntegerVar)newValue);
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
			case DataPackage.SCHEDULING__MODE_REF:
				setModeRef(MODE_REF_EDEFAULT);
				return;
			case DataPackage.SCHEDULING__PREEMPTION_GROUP_NAME:
				setPreemptionGroupName(PREEMPTION_GROUP_NAME_EDEFAULT);
				return;
			case DataPackage.SCHEDULING__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case DataPackage.SCHEDULING__STACK:
				setStack(STACK_EDEFAULT);
				return;
		case DataPackage.SCHEDULING__THRESHOLD:
				setThreshold(THRESHOLD_EDEFAULT);
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
			case DataPackage.SCHEDULING__MODE_REF:
				return MODE_REF_EDEFAULT == null ? modeRef != null : !MODE_REF_EDEFAULT.equals(modeRef);
			case DataPackage.SCHEDULING__PREEMPTION_GROUP_NAME:
				return PREEMPTION_GROUP_NAME_EDEFAULT == null ? preemptionGroupName != null : !PREEMPTION_GROUP_NAME_EDEFAULT.equals(preemptionGroupName);
			case DataPackage.SCHEDULING__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case DataPackage.SCHEDULING__STACK:
				return STACK_EDEFAULT == null ? stack != null : !STACK_EDEFAULT.equals(stack);
			case DataPackage.SCHEDULING__THRESHOLD:
				return THRESHOLD_EDEFAULT == null ? threshold != null : !THRESHOLD_EDEFAULT.equals(threshold);
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
		result.append(" (ModeRef: ");
		result.append(modeRef);
		result.append(", PreemptionGroupName: ");
		result.append(preemptionGroupName);
		result.append(", Priority: ");
		result.append(priority);
		result.append(", Stack: ");
		result.append(stack);
		result.append(", Threshold: ");
		result.append(threshold);
		result.append(')');
		return result.toString();
	}

	/* (non-Javadoc)
	 * @see rtdruid.vartree.data.ObjectWithID#getObjectID()
	 */
	public String getObjectID() {
		return makeID(modeRef);
	}

	/* (non-Javadoc)
	 * @see rtdruid.vartree.data.ObjectWithID#setObjectID(java.lang.String)
	 */
	public boolean setObjectID(String newID) {
	  	if ( !checkNewID(newID) ) return false;

	  	// Store old ID
	  	String old_ID = getObjectID();
	  	
		String[] tmp = resolveID(newID);
		setModeRefGen(tmp[0] == null ? (StringVar) null : new StringVar(tmp[0]));

		// ASk to update ID
	  	didSetObjectID(old_ID);
		return true;
	}
} //SchedulingImpl
