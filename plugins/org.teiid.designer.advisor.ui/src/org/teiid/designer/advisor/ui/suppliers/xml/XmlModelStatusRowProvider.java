/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.advisor.ui.suppliers.xml;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.graphics.Image;
import org.teiid.designer.advisor.ui.AdvisorUiConstants;
import org.teiid.designer.advisor.ui.AdvisorUiPlugin;
import org.teiid.designer.advisor.ui.core.status.IStatusRowProvider;

public class XmlModelStatusRowProvider implements IStatusRowProvider {

    /**
     * 
     */
    public XmlModelStatusRowProvider() {

    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusRowProvider#getId()
     */
    @Override
    public int getId() {
        return AdvisorUiConstants.Groups.GROUP_VIEW_MAPPINGS;
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusRowProvider#getImage(org.eclipse.core.runtime.IStatus)
     */
    @Override
    public Image getImage( IStatus status ) {

        return AdvisorUiPlugin.getImageHelper().CHECKED_BOX_IMAGE;
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusRowProvider#getImageTooltip(org.eclipse.core.runtime.IStatus)
     */
    @Override
    public String getImageTooltip( IStatus status ) {
        return "Xml Models Tooltip"; //$NON-NLS-1$
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusRowProvider#getLinkImage(org.eclipse.core.runtime.IStatus)
     */
    @Override
    public Image getLinkImage( IStatus status ) {
        return AdvisorUiPlugin.getImageHelper().LIGHTBULB_IMAGE;
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusRowProvider#getLinkTooltip(org.eclipse.core.runtime.IStatus)
     */
    @Override
    public String getLinkTooltip( IStatus status ) {
        return "Xml Models Tooltip"; //$NON-NLS-1$
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusRowProvider#getText(org.eclipse.core.runtime.IStatus)
     */
    @Override
    public String getText( IStatus status ) {
        return "Xml Models Text"; //$NON-NLS-1$
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusRowProvider#getTextTooltip(org.eclipse.core.runtime.IStatus)
     */
    @Override
    public String getTextTooltip( IStatus status ) {
        return "Xml Models Text Tooltip"; //$NON-NLS-1$
    }

}
