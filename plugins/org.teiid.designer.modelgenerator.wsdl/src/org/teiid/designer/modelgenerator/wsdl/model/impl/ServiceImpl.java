/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.modelgenerator.wsdl.model.impl;

import org.teiid.designer.modelgenerator.wsdl.model.Model;
import org.teiid.designer.modelgenerator.wsdl.model.Port;
import org.teiid.designer.modelgenerator.wsdl.model.Service;

/**
 * @since 8.0
 */
public class ServiceImpl extends WSDLElementImpl implements Service {

    private Port[] m_ports;
    private Model m_model;
    private String catalogNamespace;

    @Override
	public Port[] getPorts() {
        if (m_ports == null) return null;
        // defensive copy of Port array
        int arrayLength = m_ports.length;
        Port[] retPorts = new Port[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            retPorts[i] = (Port)m_ports[i].copy();
        }
        return retPorts;
    }

    @Override
	public Service copy() {
        ServiceImpl newImpl = new ServiceImpl();
        newImpl.setId(getId());
        newImpl.setName(getName());
        newImpl.setPorts(getPorts());
        newImpl.setNamespaceURI(getNamespaceURI());
        return newImpl;
    }

    @Override
	public void setPorts( Port[] ports ) {
        m_ports = ports;
    }

    @Override
    public String toString() {

        StringBuffer buff = new StringBuffer();
        buff.append("<service name='"); //$NON-NLS-1$
        buff.append(getName());
        buff.append("' id='"); //$NON-NLS-1$
        buff.append(getId());
        buff.append("'>"); //$NON-NLS-1$
        for (int i = 0; i < m_ports.length; i++) {
            buff.append(m_ports[i].toString());
        }
        buff.append("</service>"); //$NON-NLS-1$
        return buff.toString();
    }

    @Override
	public void setModel( Model theModel ) {
        m_model = theModel;
    }

    @Override
	public Model getModel() {
        return m_model;
    }

    @Override
    public String getNamespaceURI() {
        return catalogNamespace;
    }

    /**
     * @param namespaceURI
     */
    public void setNamespaceURI( String namespaceURI ) {
        catalogNamespace = namespaceURI;
    }

}
