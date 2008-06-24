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

import com.useit.jact.model.types.Codecs;

// import com.useit.jact.model.dataModel.Sipdisallow;

/**
 * <p>
 * SipdisallowImpl
 * </p>
 * Created : Mon Sep 05 18:20:25 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipdisallowImpl.java,v 1.2 2005/09/20
 *          14:02:04 urs Exp $
 */
public class SipdisallowImpl extends Sipdisallow {

    /**
     * einfacher Konstruktor für Sipdisallow
     */
    public SipdisallowImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Sipdisallow
     */
    public SipdisallowImpl(Codecs aValue) {
        super();

        this.fValue = aValue;
    }
}
