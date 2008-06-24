package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ZaptelconfImpl
 * </p>
 * Created : Sun Dec 25 18:59:47 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelconfImpl.java,v 1.4 2005/12/29 19:14:07
 *          urs Exp $
 */
public class ZaptelconfImpl extends Zaptelconf {

    /**
     * einfacher Konstruktor für Zaptelconf
     */
    public ZaptelconfImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Zaptelconf
     */
    public ZaptelconfImpl(String adefaultzone) {
        super();

        this.defaultzone = adefaultzone;
    }
}