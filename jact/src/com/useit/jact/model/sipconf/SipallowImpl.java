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

// import com.useit.jact.model.dataModel.Sipallow;

/**
 * <p>
 * SipallowImpl
 * </p>
 * Created : Mon Sep 05 18:20:25 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipallowImpl.java,v 1.2 2005/09/20 14:02:04
 *          urs Exp $
 */
public class SipallowImpl extends Sipallow {

    /**
     * einfacher Konstruktor für Sipallow
     */
    public SipallowImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Sipallow
     */
    public SipallowImpl(Codecs aValue) {
        super();

        this.fValue = aValue;
    }
}
