package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * Call_Logging_OptionsImpl
 * </p>
 * Created : Thu Dec 29 12:25:51 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Call_Logging_OptionsImpl.java,v 1.4
 *          2005/12/29 19:14:05 urs Exp $
 */
public class Call_Logging_OptionsImpl extends Call_Logging_Options {

    /**
     * einfacher Konstruktor für Call_Logging_Options
     */
    public Call_Logging_OptionsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Call_Logging_Options
     */
    public Call_Logging_OptionsImpl(String aaccountcode, String aamaflags) {
        super();

        this.accountcode = aaccountcode;
        this.amaflags = aamaflags;
    }
}