/**
 */
package me.glindholm.pdetools2.model.pdetools;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Name Owner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.FieldNameOwner#getFieldName <em>Field Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getFieldNameOwner()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface FieldNameOwner extends EObject {
	/**
	 * Returns the value of the '<em><b>Field Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Name</em>' attribute.
	 * @see #setFieldName(String)
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getFieldNameOwner_FieldName()
	 * @model unique="false"
	 * @generated
	 */
	String getFieldName();

	/**
	 * Sets the value of the '{@link me.glindholm.pdetools2.model.pdetools.FieldNameOwner#getFieldName <em>Field Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Name</em>' attribute.
	 * @see #getFieldName()
	 * @generated
	 */
	void setFieldName(String value);

} // FieldNameOwner
