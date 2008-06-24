package com.useit.jact.model.indicationsconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * IndicationsconfImpl
 * </p>
 * Created : Tue Dec 27 14:56:06 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IndicationsconfImpl.java,v 1.4 2005/12/29
 *          19:14:17 urs Exp $
 */
public class IndicationsconfImpl extends Indicationsconf {

    /**
     * einfacher Konstruktor für Indicationsconf
     */
    public IndicationsconfImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Indicationsconf
     */
    public IndicationsconfImpl(String acountry) {
        super();

        this.country = acountry;
    }
}