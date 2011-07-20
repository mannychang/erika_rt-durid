/**
 * <copyright>
 * </copyright>
 *
 * %W%
 * @version %I% %H%
 */
package com.eu.evidence.rtdruid.vartree.data;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.eu.evidence.rtdruid.vartree.data.Functional#getEventList <em>Event List</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.vartree.data.Functional#getPartialOrderList <em>Partial Order List</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.vartree.data.Functional#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.vartree.data.Functional#getTimeConstList <em>Time Const List</em>}</li>
 *   <li>{@link com.eu.evidence.rtdruid.vartree.data.Functional#getTypeList <em>Type List</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.eu.evidence.rtdruid.vartree.data.DataPackage#getFunctional()
 * @model 
 * @generated
 */
public interface Functional extends ObjectWithID{
	/**
	 * Returns the value of the '<em><b>Event List</b></em>' containment reference list.
	 * The list contents are of type {@link com.eu.evidence.rtdruid.vartree.data.Event}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Event List</em>' containment reference list.
	 * @see com.eu.evidence.rtdruid.vartree.data.DataPackage#getFunctional_EventList()
	 * @model type="rtdruid.vartree.data.Event" containment="true"
	 * @generated
	 */
  EList getEventList();

	/**
	 * Returns the value of the '<em><b>Partial Order List</b></em>' containment reference list.
	 * The list contents are of type {@link com.eu.evidence.rtdruid.vartree.data.PartialOrder}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partial Order List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Partial Order List</em>' containment reference list.
	 * @see com.eu.evidence.rtdruid.vartree.data.DataPackage#getFunctional_PartialOrderList()
	 * @model type="rtdruid.vartree.data.PartialOrder" containment="true"
	 * @generated
	 */
  EList getPartialOrderList();

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference list.
	 * The list contents are of type {@link com.eu.evidence.rtdruid.vartree.data.SystemImplementation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference list.
	 * @see com.eu.evidence.rtdruid.vartree.data.DataPackage#getFunctional_Implementation()
	 * @model type="rtdruid.vartree.data.SystemImplementation" containment="true"
	 * @generated
	 */
	EList getImplementation();

	/**
	 * Returns the value of the '<em><b>Time Const List</b></em>' containment reference list.
	 * The list contents are of type {@link com.eu.evidence.rtdruid.vartree.data.TimeConst}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Const List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Const List</em>' containment reference list.
	 * @see com.eu.evidence.rtdruid.vartree.data.DataPackage#getFunctional_TimeConstList()
	 * @model type="rtdruid.vartree.data.TimeConst" containment="true"
	 * @generated
	 */
  EList getTimeConstList();
  
  	/**
  	 * Returns the value of the '<em><b>Type List</b></em>' containment reference list.
  	 * The list contents are of type {@link rtdruid.vartree.data.Type}.
  	 * <!-- begin-user-doc -->
  	 * <p>
  	 * If the meaning of the '<em>Type List</em>' containment reference list isn't clear,
  	 * there really should be more of a description here...
  	 * </p>
  	 * <!-- end-user-doc -->
  	 * @return the value of the '<em>Type List</em>' containment reference list.
  	 * @see rtdruid.vartree.data.DataPackage#getFunctional_TypeList()
  	 * @model type="rtdruid.vartree.data.Type" containment="true"
  	 * @generated
  	 */
  EList getTypeList();

} // Functional
