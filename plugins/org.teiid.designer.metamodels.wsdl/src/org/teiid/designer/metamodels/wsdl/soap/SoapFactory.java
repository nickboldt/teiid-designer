/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.metamodels.wsdl.soap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * 
 * @see org.teiid.designer.metamodels.wsdl.soap.SoapPackage
 * @generated
 *
 * @since 8.0
 */
public interface SoapFactory extends EFactory {

    /**
     * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    SoapFactory eINSTANCE = new org.teiid.designer.metamodels.wsdl.soap.impl.SoapFactoryImpl();

    /**
     * Returns a new object of class '<em>Address</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Address</em>'.
     * @generated
     */
    SoapAddress createSoapAddress();

    /**
     * Returns a new object of class '<em>Header Fault</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Header Fault</em>'.
     * @generated
     */
    SoapHeaderFault createSoapHeaderFault();

    /**
     * Returns a new object of class '<em>Fault</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Fault</em>'.
     * @generated
     */
    SoapFault createSoapFault();

    /**
     * Returns a new object of class '<em>Header</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Header</em>'.
     * @generated
     */
    SoapHeader createSoapHeader();

    /**
     * Returns a new object of class '<em>Body</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Body</em>'.
     * @generated
     */
    SoapBody createSoapBody();

    /**
     * Returns a new object of class '<em>Operation</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Operation</em>'.
     * @generated
     */
    SoapOperation createSoapOperation();

    /**
     * Returns a new object of class '<em>Binding</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return a new object of class '<em>Binding</em>'.
     * @generated
     */
    SoapBinding createSoapBinding();

    /**
     * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @return the package supported by this factory.
     * @generated
     */
    SoapPackage getSoapPackage(); // NO_UCD

} // SoapFactory
