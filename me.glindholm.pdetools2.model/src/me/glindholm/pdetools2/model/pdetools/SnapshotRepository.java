/**
 */
package me.glindholm.pdetools2.model.pdetools;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Snapshot Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.SnapshotRepository#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getSnapshotRepository()
 * @model
 * @generated
 */
public interface SnapshotRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Groups</b></em>' containment reference list.
	 * The list contents are of type {@link me.glindholm.pdetools2.model.pdetools.SnapshotGroup}.
	 * It is bidirectional and its opposite is '{@link me.glindholm.pdetools2.model.pdetools.SnapshotGroup#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Groups</em>' containment reference list.
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getSnapshotRepository_Groups()
	 * @see me.glindholm.pdetools2.model.pdetools.SnapshotGroup#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<SnapshotGroup> getGroups();

} // SnapshotRepository
