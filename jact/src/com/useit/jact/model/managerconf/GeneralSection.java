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
 * GeneralSection<br>
 * 
 * </p>
 * Created : Wed Aug 17 01:27:24 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GeneralSection.java,v 1.5 2005/09/20 14:01:44
 *          urs Exp $
 */
public class GeneralSection extends AbstractSimpleDataClass {
    // --------------- Konstruktor ---------------------
    /**
     * einfacher Konstruktor für GeneralSection
     */
    public GeneralSection() {
        super();

    }

    /**
     * komplexer Konstruktor für GeneralSection
     */
    public GeneralSection(String aGeneralid, Boolean aEnabled, Integer aPortno,
            String aBindaddr, Integer aPort) {
        super();

        this.fGeneralid = aGeneralid;
        this.fEnabled = aEnabled;
        this.fPortno = aPortno;
        this.fBindaddr = aBindaddr;
        this.fPort = aPort;
    }

    /**
     * Übernimmt alle Werte aus dem übergebenen object, werden nur als
     * referenzen Kopiert, also aufpaassen beim ändern der daten
     * 
     * @param object
     */
    public void assignTo(GeneralSection object) {
        this.fGeneralid = object.fGeneralid;
        this.fEnabled = object.fEnabled;
        this.fPortno = object.fPortno;
        this.fBindaddr = object.fBindaddr;
        this.fPort = object.fPort;

    }

    // -------------- map Funktionen

    // -------------- Aggregat Funktionen
    // ------ 1-1 aggregates
    // -------------- loadsavedelete Methoden
    // -------------- getter und setter und felder

    protected String fGeneralid;

    protected Boolean fEnabled;

    protected Integer fPortno;

    protected String fBindaddr;

    protected Integer fPort;

    // --------- getter und setter

    /**
     * getGeneralid
     * 
     */
    public String getGeneralid() {
        return fGeneralid;
    }

    /**
     * setGeneralid
     */
    public void setGeneralid(String aGeneralid) {
        if (aGeneralid == null) {
            changed = (this.fGeneralid != null);
            this.fGeneralid = null;
        } else {
            changed = aGeneralid.equals(this.fGeneralid);
            this.fGeneralid = aGeneralid;
        }
    }

    /**
     * getEnabled
     * 
     */
    public Boolean getEnabled() {
        return fEnabled;
    }

    /**
     * setEnabled
     */
    public void setEnabled(Boolean aEnabled) {
        if (aEnabled == null) {
            changed = (this.fEnabled != null);
            this.fEnabled = null;
        } else {
            changed = aEnabled.equals(this.fEnabled);
            this.fEnabled = aEnabled;
        }
    }

    /**
     * getPortno Note: "portno" is changing to "port" in a forthcoming CVS
     * version.
     */
    public Integer getPortno() {
        return fPortno;
    }

    /**
     * setPortno
     */
    public void setPortno(Integer aPortno) {
        if (aPortno == null) {
            changed = (this.fPortno != null);
            this.fPortno = null;
        } else {
            changed = aPortno.equals(this.fPortno);
            this.fPortno = aPortno;
        }
    }

    /**
     * getBindaddr
     * 
     */
    public String getBindaddr() {
        return fBindaddr;
    }

    /**
     * setBindaddr
     */
    public void setBindaddr(String aBindaddr) {
        if (aBindaddr == null) {
            changed = (this.fBindaddr != null);
            this.fBindaddr = null;
        } else {
            changed = aBindaddr.equals(this.fBindaddr);
            this.fBindaddr = aBindaddr;
        }
    }

    /**
     * getPort
     * 
     */
    public Integer getPort() {
        return fPort;
    }

    /**
     * setPort
     */
    public void setPort(Integer aPort) {
        if (aPort == null) {
            changed = (this.fPort != null);
            this.fPort = null;
        } else {
            changed = aPort.equals(this.fPort);
            this.fPort = aPort;
        }
    }

    /**
     * eine einfache to string methode die nur die Felder anzeigt.
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[").append("fGeneralid=").append(fGeneralid).append(",")
                .append("fEnabled=").append(fEnabled).append(",").append(
                        "fPortno=").append(fPortno).append(",").append(
                        "fBindaddr=").append(fBindaddr).append(",").append(
                        "fPort=").append(fPort).append("]");

        return sb.toString();
    }
}
