/**
 * generated by Xtext 2.18.0
 */
package com.yakindu.solidity.solidity;

import org.yakindu.base.types.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Invocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.yakindu.solidity.solidity.OperationInvocation#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see com.yakindu.solidity.solidity.SolidityPackage#getOperationInvocation()
 * @model
 * @generated
 */
public interface OperationInvocation extends ModifierInvocation {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Operation)
	 * @see com.yakindu.solidity.solidity.SolidityPackage#getOperationInvocation_Reference()
	 * @model
	 * @generated
	 */
	Operation getReference();

	/**
	 * Sets the value of the '{@link com.yakindu.solidity.solidity.OperationInvocation#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Operation value);

} // OperationInvocation
