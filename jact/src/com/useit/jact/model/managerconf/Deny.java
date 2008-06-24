/*******************************************************************************
 * Copyright (c) 2005 Urs Zeidler
 * This program is free software, distributed under the terms of 
 * the GNU General Public License Version 2. See the LICENSE file 
 * at the top of the source tree.
 * 
 *
 * Contributors:
 *     Urs Zeidler
 *******************************************************************************/
package com.useit.jact.model.managerconf;

// import com.useit.jact.db.ConnectionManager;
// import com.useit.jact.config.ApplicationConfig;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;

/**
 * <p>
 * Deny<br>
 * 
 * </p>
 * Created : Wed Aug 17 01:27:25 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Deny.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
public class Deny extends AbstractSimpleDataClass {
    // --------------- Konstruktor ---------------------
    /**
     * einfacher Konstruktor für Deny
     */
    public Deny() {
        super();

    }

    /**
     * komplexer Konstruktor für Deny
     */
    public Deny(String aValue) {
        super();

        this.fValue = aValue;
    }

    /**
     * Übernimmt alle Werte aus dem übergebenen object, werden nur als
     * referenzen Kopiert, also aufpaassen beim ändern der daten
     * 
     * @param object
     */
    public void assignTo(Deny object) {
        this.fValue = object.fValue;

    }

    // -------------- map Funktionen

    // -------------- Aggregat Funktionen
    // ------ 1-1 aggregates
    // -------------- loadsavedelete Methoden
    // -------------- getter und setter und felder

    protected String fValue;

    // --------- getter und setter

    /**
     * getValue
     * 
     */
    public String getValue() {
        return fValue;
    }

    /**
     * setValue
     */
    public void setValue(String aValue) {
        if (aValue == null) {
            changed = (this.fValue != null);
            this.fValue = null;
        } else {
            changed = aValue.equals(this.fValue);
            this.fValue = aValue;
        }
    }

    /**
     * eine einfache to string methode die nur die Felder anzeigt.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[").append("fValue=").append(fValue).append("]");

        return sb.toString();
    }
}
