package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ZapteltonezoneImpl
 * </p>
 * Created : Sun Dec 25 18:59:43 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapteltonezoneImpl.java,v 1.4 2005/12/29
 *          19:14:07 urs Exp $
 */
public class ZapteltonezoneImpl extends Zapteltonezone {

    /**
     * einfacher Konstruktor für Zapteltonezone
     */
    public ZapteltonezoneImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Zapteltonezone
     */
    public ZapteltonezoneImpl(String azonename) {
        super();

        this.zonename = azonename;
    }
}