/**
 */
package me.glindholm.pdetools2.model.pdetools;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.CommandHistory#getEvents <em>Events</em>}</li>
 * </ul>
 * </p>
 *
 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getCommandHistory()
 * @model
 * @generated
 */
public interface CommandHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link me.glindholm.pdetools2.model.pdetools.CommandEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getCommandHistory_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommandEvent> getEvents();

} // CommandHistory
