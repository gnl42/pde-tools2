/**
 */
package me.glindholm.pdetools2.model.pdetools;

import org.eclipse.core.resources.IFolder;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Palette</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.Palette#getParent <em>Parent</em>}</li>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.Palette#getFolder <em>Folder</em>}</li>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.Palette#getSubPalettes <em>Sub Palettes</em>}</li>
 *   <li>{@link me.glindholm.pdetools2.model.pdetools.Palette#getImageFiles <em>Image Files</em>}</li>
 * </ul>
 * </p>
 *
 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getPalette()
 * @model
 * @generated
 */
public interface Palette extends FieldNameOwner {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link me.glindholm.pdetools2.model.pdetools.Palette#getSubPalettes <em>Sub Palettes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(Palette)
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getPalette_Parent()
	 * @see me.glindholm.pdetools2.model.pdetools.Palette#getSubPalettes
	 * @model opposite="subPalettes" transient="false"
	 * @generated
	 */
	Palette getParent();

	/**
	 * Sets the value of the '{@link me.glindholm.pdetools2.model.pdetools.Palette#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Palette value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * 팔레트가 표현하는 워크스페이스상의 폴더.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Folder</em>' attribute.
	 * @see #setFolder(IFolder)
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getPalette_Folder()
	 * @model unique="false" dataType="me.glindholm.pdetools2.model.pdetools.IFolder"
	 * @generated
	 */
	IFolder getFolder();

	/**
	 * Sets the value of the '{@link me.glindholm.pdetools2.model.pdetools.Palette#getFolder <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' attribute.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(IFolder value);

	/**
	 * Returns the value of the '<em><b>Sub Palettes</b></em>' containment reference list.
	 * The list contents are of type {@link me.glindholm.pdetools2.model.pdetools.Palette}.
	 * It is bidirectional and its opposite is '{@link me.glindholm.pdetools2.model.pdetools.Palette#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Palettes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Palettes</em>' containment reference list.
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getPalette_SubPalettes()
	 * @see me.glindholm.pdetools2.model.pdetools.Palette#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Palette> getSubPalettes();

	/**
	 * Returns the value of the '<em><b>Image Files</b></em>' containment reference list.
	 * The list contents are of type {@link me.glindholm.pdetools2.model.pdetools.ImageFile}.
	 * It is bidirectional and its opposite is '{@link me.glindholm.pdetools2.model.pdetools.ImageFile#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Files</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Files</em>' containment reference list.
	 * @see me.glindholm.pdetools2.model.pdetools.PdetoolsPackage#getPalette_ImageFiles()
	 * @see me.glindholm.pdetools2.model.pdetools.ImageFile#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ImageFile> getImageFiles();

} // Palette
