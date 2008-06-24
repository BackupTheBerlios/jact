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
package com.useit.jact.model.sipconf;

// import com.useit.jact.db.ConnectionManager;
// import com.useit.jact.config.ApplicationConfig;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.Codecs;

/**
 * <p>
 * Sipdisallow<br>
 * all :Disallow all codecs (global configuration)
 * </p>
 * Created : Thu Sep 08 19:35:46 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Sipdisallow.java,v 1.5 2005/09/20 14:02:05
 *          urs Exp $
 */
public class Sipdisallow extends AbstractSimpleDataClass {
    // --------------- Konstruktor ---------------------
    /**
     * einfacher Konstruktor für Sipdisallow
     */
    public Sipdisallow() {
        super();

    }

    /**
     * komplexer Konstruktor für Sipdisallow
     */
    public Sipdisallow(Codecs aValue) {
        super();

        this.fValue = aValue;
    }

    /**
     * Übernimmt alle Werte aus dem übergebenen object, werden nur als
     * referenzen Kopiert, also aufpaassen beim ändern der daten
     * 
     * @param object
     */
    public void assignTo(Sipdisallow object) {
        this.fValue = object.fValue;

    }

    // -------------- map Funktionen

    // -------------- Aggregat Funktionen
    // ------ 1-1 aggregates
    // -------------- loadsavedelete Methoden
    // -------------- getter und setter und felder

    protected Codecs fValue;

    // --------- getter und setter

    /**
     * getValue the Codec
     */
    public Codecs getValue() {
        return fValue;
    }

    /**
     * setValue
     */
    public void setValue(Codecs aValue) {
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
