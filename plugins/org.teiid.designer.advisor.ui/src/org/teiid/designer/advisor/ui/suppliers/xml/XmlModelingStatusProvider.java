/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.advisor.ui.suppliers.xml;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.swt.graphics.Image;
import org.teiid.designer.advisor.ui.AdvisorUiPlugin;
import org.teiid.designer.advisor.ui.core.status.AdvisorStatusManager;
import org.teiid.designer.advisor.ui.core.status.IStatusContentProvider;
import org.teiid.designer.advisor.ui.core.status.IStatusRowProvider;
import org.teiid.designer.advisor.ui.suppliers.ModelValidationStatusRowProvider;
import org.teiid.designer.advisor.ui.suppliers.relational.SourceModelStatusRowProvider;
import org.teiid.designer.advisor.ui.suppliers.relational.ViewModelStatusRowProvider;
import org.teiid.designer.advisor.ui.views.status.StatusValidationConstants;

public class XmlModelingStatusProvider  implements IStatusContentProvider {
    
    private AdvisorStatusManager statusManager = new XmlModelingStatusManager();

    private IStatusRowProvider[] providers;

    /**
     * {@inheritDoc}
     * 
     * @see IStatusContentProvider#getDefaultStatus()
     */
    @Override
    public IStatus getDefaultStatus() {
        return StatusValidationConstants.STATUS_MSGS.ADVISOR_NO_PROJECT_SELECTED;
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusContentProvider#getDescription()
     */
    @Override
    public String getDescription() {
        return "Xml Modeling + Relational Modeling Description"; //$NON-NLS-1$
    }

    /**
     * 
     * @return
     */
    @Override
    public String getId() {
        return this.statusManager.getId();
    }
    /**
     * {@inheritDoc}
     * 
     * @see IStatusContentProvider#getImage(int)
     */
    @Override
    public Image getImage( int id ) {
        return AdvisorUiPlugin.getImageHelper().NEW_MODEL_IMAGE;
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusContentProvider#getLinkTooltip(int)
     */
    @Override
    public String getLinkTooltip( int id ) {
        return "Xml Modeling Tooltip"; //$NON-NLS-1$
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusContentProvider#getRowsProviders()
     */
    @Override
    public IStatusRowProvider[] getRowsProviders() {
        if (this.providers == null) {
            initRowProviders();
        }
        return this.providers;
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusContentProvider#getStatus(int)
     */
    @Override
    public IStatus getStatus( int id ) {
        return statusManager.getCurrentStatus().get(id);
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusContentProvider#getStatusImage(int)
     */
    @Override
    public Image getStatusImage( int id ) {
        return AdvisorUiPlugin.getImageHelper().CHECKED_BOX_IMAGE;
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusContentProvider#getText(int)
     */
    @Override
    public String getText( int id ) {
        return "Xml Modeling Text"; //$NON-NLS-1$
    }

    /**
     * {@inheritDoc}
     * 
     * @see IStatusContentProvider#getTitle()
     */
    @Override
    public String getTitle() {
    	if( statusManager == null || statusManager.getCurrentObject() == null ) {
    		return "Xml Modeling Title"; //$NON-NLS-1$
    	}
    	
        return ((IProject)statusManager.getCurrentObject()).getName();
    }

    private void initRowProviders() {
        this.providers = new IStatusRowProvider[4];

        this.providers[0] = new ModelValidationStatusRowProvider();
        this.providers[1] = new SourceModelStatusRowProvider();
        this.providers[2] = new ViewModelStatusRowProvider();
        this.providers[3] = new XmlModelStatusRowProvider();
    }
    
    @Override
    public void updateStatus( boolean forceUpdate ) {
    	this.statusManager.updateStatus(forceUpdate);
    }

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		
	}
}
