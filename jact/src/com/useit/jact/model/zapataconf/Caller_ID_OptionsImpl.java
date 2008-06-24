package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * Caller_ID_OptionsImpl
 * </p>
 * Created : Thu Dec 29 12:25:54 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Caller_ID_OptionsImpl.java,v 1.4 2005/12/29
 *          19:14:05 urs Exp $
 */
public class Caller_ID_OptionsImpl extends Caller_ID_Options {

    /**
     * einfacher Konstruktor für Caller_ID_Options
     */
    public Caller_ID_OptionsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Caller_ID_Options
     */
    public Caller_ID_OptionsImpl(String acallerid, Boolean ausecallerid,
            Boolean ahidecallerid, Boolean arestrictcid, Boolean ausecallingpres) {
        super();

        this.callerid = acallerid;
        this.usecallerid = ausecallerid;
        this.hidecallerid = ahidecallerid;
        this.restrictcid = arestrictcid;
        this.usecallingpres = ausecallingpres;
    }
}