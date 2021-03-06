/*
 * JBoss, Home of Professional Open Source.
 *
 * See the LEGAL.txt file distributed with this work for information regarding copyright ownership and licensing.
 *
 * See the AUTHORS.txt file distributed with this work for a full listing of individual contributors.
 */
package org.teiid.designer.runtime.ui.wizards.webservices;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.eclipse.core.resources.IFile;
import org.teiid.designer.core.util.StringUtilities;
import org.teiid.designer.runtime.ui.wizards.webservices.util.RestProcedure;
import org.teiid.designer.runtime.ui.wizards.webservices.util.WebArchiveBuilderConstants;

/**
 * @since 8.0
 */
public class RestWarDataserviceModel {

    private String warFilename;
    private String contextName;
    private String vdbLocation;
    private String jndiName;
    private boolean includeJars;

    private String warFilenameDefault;
    private String contextNameDefault;
    private String jndiNameDefault;
    private boolean includeJarsDefault;
    private boolean version82_OrGreater;
    private String engineJarLocation;
    private String commonCoreJarLocation;

    private IFile theVdb;
    private Map<String, List<RestProcedure>> restProcedureMap;

    private boolean isReadyForFinish = false;
    private static RestWarDataserviceModel dataserviceModel;

    /**
     * @return restProcedureMap
     */
    public Map<String, List<RestProcedure>> getRestProcedureMap() {
        return restProcedureMap;
    }

    /**
     * @param restProcedureMap Sets restProcedureMap to the specified value.
     */
    public void setRestProcedureArrayList( Map<String, List<RestProcedure>> restProcedureMap ) {
        this.restProcedureMap = restProcedureMap;
    }

    /**
     * @since 7.4
     */
    private RestWarDataserviceModel() {
    }

    /**
     * @return DataserviceModel
     * @since 7.4
     */
    public static RestWarDataserviceModel getInstance() {
        if (dataserviceModel == null) {
            dataserviceModel = new RestWarDataserviceModel();
        }
        return dataserviceModel;
    }

    /**
     * @return Returns the contextName.
     * @since 7.4
     */
    public String getContextName() {
        return this.contextName;
    }

    /**
     * @param contextName The contextName to set.
     * @since 7.4
     */
    public void setContextName( String contextName ) {
        this.contextName = contextName;
    }

    /**
     * @return Returns the warFilename.
     * @since 7.4
     */
    public String getWarFileLocation() {
        return this.warFilename;
    }

    /**
     * @param warFilename The warFilename to set.
     * @since 7.4
     */
    public void setWarFileLocation( String warFilename ) {
        this.warFilename = warFilename;
    }

    /**
     * @return Returns the vdbLocation.
     * @since 7.4
     */
    public String getVdbLocation() {
        return this.vdbLocation;
    }

    /**
     * @return Returns the includeJars.
     * @since 7.4
     */
    public boolean isIncludeJars() {
        return this.includeJars;
    }

    /**
     * @return Sets the includeJars.
     * @since 7.4
     */
    public void setIncludeJars( boolean includeJars ) {
        this.includeJars = includeJars;
    }

    /**
     * @return Returns the jndiName.
     * @since 7.4
     */
    public String getJndiName() {
        return this.jndiName;
    }

    /**
     * @param vdbLocation The vdbLocation to set.
     * @since 7.4
     */
    public void setVdbLocation( String vdbLocation ) {
        this.vdbLocation = vdbLocation;
    }

    /**
     * @param contextNameDefault The contextNameDefault to set.
     * @since 7.4
     */
    public void setContextNameDefault( String contextNameDefault ) {
        this.contextNameDefault = contextNameDefault;
        this.contextName = contextNameDefault;

    }

    /**
     * @param jndiNameDefault The jndiNameDefault to set.
     * @since 7.4
     */
    public void setJndiNameDefault( String jndiNameDefault ) {
        // this.jndiNameDefault = jndiNameDefault;
        this.jndiName = jndiNameDefault;

    }

    /**
     * @param includeJarsDefault The includeJarsDefault to set.
     * @since 7.4
     */
    public void setIncludeJarsDefault( boolean includeJarsDefault ) {
        this.includeJarsDefault = includeJarsDefault;
        this.includeJarsDefault = includeJarsDefault;

    }

    /**
     * @param includeJarsDefault The includeJarsDefault
     * @since 7.4
     */
    public boolean isIncludeJarsDefault() {
        return this.includeJarsDefault;

    }

    /**
     * @param jndiName The jndiName to set.
     * @since 7.4
     */
    public void setJndiName( String jndiName ) {
        this.jndiName = jndiName;
    }

    /**
     * @param warFilenameDefault The warFilenameDefault to set.
     * @since 7.4
     */
    public void setWarFilenameDefault( String warFilenameDefault ) {
        this.warFilenameDefault = warFilenameDefault;
        this.warFilename = warFilenameDefault;
    }

    /**
     * @return Returns the contextNameDefault.
     * @since 7.4
     */
    public String getContextNameDefault() {
        return this.contextNameDefault;
    }

    /**
     * @return Returns the warFilenameDefault.
     * @since 7.4
     */
    public String getWarFilenameDefault() {
        return this.warFilenameDefault;
    }

    /**
     * @return Returns the JNDINameDefault.
     * @since 7.4
     */
    public String getJndiNameDefault() {
        return this.jndiNameDefault;
    }

    /**
     * @return boolean isReadyForFinish
     * @since 7.4
     */
    public boolean isReadyForFinish() {
        return this.isReadyForFinish;
    }

    /**
     * @param boolean isReadyForFinish
     * @since 7.4
     */
    public void setIsReadyForFinish( boolean isReadyForFinish ) {
        this.isReadyForFinish = isReadyForFinish;
    }

    /**
     * @param theVdb
     * @since 7.4
     */
    public void setVdbFile( IFile theVdb ) {
        this.theVdb = theVdb;
    }

    /**
     * @return
     * @since 7.4
     */
    public IFile getVdbFile() {
        return this.theVdb;
    }

    /**
     * @return
     * @since 7.4
     */
    public Properties getProperties() {
        Properties properties = new Properties();

        properties.put(WebArchiveBuilderConstants.PROPERTY_WAR_FILE_SAVE_LOCATION, this.getWarFileLocation());
        properties.put(WebArchiveBuilderConstants.PROPERTY_CONTEXT_NAME, this.getContextName());
        properties.put(WebArchiveBuilderConstants.PROPERTY_JNDI_NAME, this.getJndiName());
        properties.put(WebArchiveBuilderConstants.PROPERTY_VDB_FILE_NAME, this.getVdbFile().getLocation().toOSString());
        properties.put(WebArchiveBuilderConstants.PROPERTY_INCLUDE_RESTEASY_JARS, this.isIncludeJars());
        properties.put(WebArchiveBuilderConstants.PROPERTY_VDB_REST_PROCEDURES, this.getRestProcedureMap());
        properties.put(WebArchiveBuilderConstants.PROPERTY_8_2_OR_HIGHER, this.isVersion82_OrGreater());
        properties.put(WebArchiveBuilderConstants.PROPERTY_ENGINE_JAR, this.getEngineJarLocation());
        properties.put(WebArchiveBuilderConstants.PROPERTY_COMMON_CORE_JAR, this.getCommonCoreJarLocation());

        return properties;
    }

	/**
	 * @return the version82_OrGreater
	 * @since 8.1
	 */
	public boolean isVersion82_OrGreater() {
		return version82_OrGreater;
	}

	/**
	 * @param version82_OrGreater the version82_OrGreater to set
	 * @since 8.1
	 */
	public void setVersion82_OrGreater(boolean version82_OrGreater) {
		this.version82_OrGreater = version82_OrGreater;
	}

	/**
	 * @return the engineJarLocation
	 * @since 8.1
	 */
	public String getEngineJarLocation() {
		return engineJarLocation == null ? StringUtilities.EMPTY_STRING : engineJarLocation;
	}

	/**
	 * @param engineJarLocation the engineJarLocation to set
	 * @since 8.1
	 */
	public void setEngineJarLocation(String engineJarLocation) {
		this.engineJarLocation = engineJarLocation;
	}

	/**
	 * @return the commonCoreJarLocation
	 * @since 8.1
	 */
	public String getCommonCoreJarLocation() {
		return commonCoreJarLocation == null ? StringUtilities.EMPTY_STRING : commonCoreJarLocation;
	}

	/**
	 * @param commonCoreJarLocation the commonCoreJarLocation to set
	 * @since 8.1
	 */
	public void setCommonCoreJarLocation(String commonCoreJarLocation) {
		this.commonCoreJarLocation = commonCoreJarLocation;
	}
}
