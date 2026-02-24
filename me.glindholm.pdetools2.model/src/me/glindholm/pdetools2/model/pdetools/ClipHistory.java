/**
 */
package me.glindholm.pdetools2.model.pdetools;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clip History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.ClipHistory#getActiveEntry <em>Active Entry</em>}</li>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.ClipHistory#getEntries <em>Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getClipHistory()
 * @model
 * @generated
 */
public interface ClipHistory extends ClipboardElement {
	/**
	 * Returns the value of the '<em><b>Active Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Entry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Entry</em>' reference.
	 * @see #setActiveEntry(ClipboardEntry)
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getClipHistory_ActiveEntry()
	 * @model
	 * @generated
	 */
	ClipboardEntry getActiveEntry();

	/**
	 * Sets the value of the '{@link me.glindholm.pdetools2.model.pdetools.ClipHistory#getActiveEntry <em>Active Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Entry</em>' reference.
	 * @see #getActiveEntry()
	 * @generated
	 */
	void setActiveEntry(ClipboardEntry value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link me.glindholm.pdetools2.model.pdetools.ClipboardEntry}.
	 * It is bidirectional and its opposite is '{@link me.glindholm.pdetools2.model.pdetools.ClipboardEntry#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getClipHistory_Entries()
	 * @see me.glindholm.pdetools2.model.pdetools.ClipboardEntry#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ClipboardEntry> getEntries();

} // ClipHistory
