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

/**
 * <p>
 * GeneralSectionImpl
 * </p>
 * Created : Sun Aug 07 20:24:54 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GeneralSectionImpl.java,v 1.3 2005/09/20
 *          14:01:44 urs Exp $
 */
public class GeneralSectionImpl extends GeneralSection {

    /**
     * einfacher Konstruktor für GeneralSection
     */
    public GeneralSectionImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für GeneralSection
     */
    public GeneralSectionImpl(String aGeneralid, Boolean aEnabled,
            Integer aPortno, String aBindaddr, Integer aPort) {
        super();

        this.fGeneralid = aGeneralid;
        this.fEnabled = aEnabled;
        this.fPortno = aPortno;
        this.fBindaddr = aBindaddr;
        this.fPort = aPort;
    }

}
