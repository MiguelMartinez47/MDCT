/**
 */
package model4datactrackprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link model4datactrackprofile.DataField#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataField()
 * @model
 * @generated
 */
public interface DataField extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see model4datactrackprofile.Model4datactrackprofilePackage#getDataField_Value()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link model4datactrackprofile.DataField#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // DataField
