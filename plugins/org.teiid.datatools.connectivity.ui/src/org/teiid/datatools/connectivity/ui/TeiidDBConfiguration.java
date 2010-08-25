package org.teiid.datatools.connectivity.ui;

import org.eclipse.datatools.sqltools.core.SQLDevToolsConfiguration;

public class TeiidDBConfiguration extends SQLDevToolsConfiguration {

    private static final String[] PRODUCTS = {"Teiid Server", "Teiid"}; //$NON-NLS-1$

    private String format( String in ) {
        return in.trim().toLowerCase();
    }

    /* (non-Javadoc)
     * @see org.eclipse.datatools.sqltools.core.SQLDevToolsConfiguration#recognize(java.lang.String, java.lang.String)
     */
    @Override
    public boolean recognize( String product,
                              String version ) {
        if (product != null) {
            String formattedProduct = format(product);
            for (int i = 0; i < PRODUCTS.length; i++) {
                if (formattedProduct.equals(format(PRODUCTS[i]))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* (non-Javadoc)
     * @see org.eclipse.datatools.sqltools.core.SQLDevToolsConfiguration#getAssociatedConnectionProfileType()
     */
    @Override
    public String[] getAssociatedConnectionProfileType() {
        return new String[] {"org.teiid.datatools.connectivity.connectionProfile"}; //$NON-NLS-1$
    }

}
