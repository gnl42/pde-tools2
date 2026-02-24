/**
 */
package me.glindholm.pdetools2.model.pdetools;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Java Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.JavaInfo#getQualifiedTypeName <em>Qualified Type Name</em>}</li>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.JavaInfo#getEnclosingElementName <em>Enclosing Element Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getJavaInfo()
 * @model
 * @generated
 */
public interface JavaInfo extends ClipboardElement {
	/**
	 * Returns the value of the '<em><b>Qualified Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qualified Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualified Type Name</em>' attribute.
	 * @see #setQualifiedTypeName(String)
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getJavaInfo_QualifiedTypeName()
	 * @model unique="false"
	 * @generated
	 */
	String getQualifiedTypeName();

	/**
	 * Sets the value of the '{@link me.glindholm.pdetools2.model.pdetools.JavaInfo#getQualifiedTypeName <em>Qualified Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualified Type Name</em>' attribute.
	 * @see #getQualifiedTypeName()
	 * @generated
	 */
	void setQualifiedTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Enclosing Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enclosing Element Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enclosing Element Name</em>' attribute.
	 * @see #setEnclosingElementName(String)
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getJavaInfo_EnclosingElementName()
	 * @model unique="false"
	 * @generated
	 */
	String getEnclosingElementName();

	/**
	 * Sets the value of the '{@link me.glindholm.pdetools2.model.pdetools.JavaInfo#getEnclosingElementName <em>Enclosing Element Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enclosing Element Name</em>' attribute.
	 * @see #getEnclosingElementName()
	 * @generated
	 */
	void setEnclosingElementName(String value);

} // JavaInfo
