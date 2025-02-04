/**
 * generated by Xtext 2.18.0
 */
package com.yakindu.solidity.solidity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Assembly Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.FunctionalAssemblyExpression#getLabel <em>Label</em>}</li>
 *   <li>{@link com.yakindu.solidity.solidity.FunctionalAssemblyExpression#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getFunctionalAssemblyExpression()
 * @model
 * @generated
 */
public interface FunctionalAssemblyExpression extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getFunctionalAssemblyExpression_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.FunctionalAssemblyExpression#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getFunctionalAssemblyExpression_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getParameters();

} // FunctionalAssemblyExpression
