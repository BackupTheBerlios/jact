package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.Switchtype;

/**
 * <p>
 * ISDN_PRI_SwitchImpl
 * </p>
 * Created : Thu Dec 29 12:25:42 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISDN_PRI_SwitchImpl.java,v 1.4 2005/12/29
 *          19:14:05 urs Exp $
 */
public class ISDN_PRI_SwitchImpl extends ISDN_PRI_Switch {

    /**
     * einfacher Konstruktor für ISDN_PRI_Switch
     */
    public ISDN_PRI_SwitchImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für ISDN_PRI_Switch
     */
    public ISDN_PRI_SwitchImpl(Switchtype aswitchtype, String aoverlapdial,
            String apridialplan, String apriindication) {
        super();

        this.switchtype = aswitchtype;
        this.overlapdial = aoverlapdial;
        this.pridialplan = apridialplan;
        this.priindication = apriindication;
    }
}