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
 * PermitImpl
 * </p>
 * Created : Sun Aug 07 20:38:19 CEST 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: PermitImpl.java,v 1.3 2005/09/20 14:01:44 urs
 *          Exp $
 */
public class PermitImpl extends Permit {

    /**
     * einfacher Konstruktor für Permit
     */
    public PermitImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Permit
     */
    public PermitImpl(String aValue) {
        super();

        this.fValue = aValue;
    }

}
