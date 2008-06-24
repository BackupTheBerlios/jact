package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ZapteldynamicspanImpl
 * </p>
 * Created : Sun Dec 25 18:59:45 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapteldynamicspanImpl.java,v 1.4 2005/12/29
 *          19:14:07 urs Exp $
 */
public class ZapteldynamicspanImpl extends Zapteldynamicspan {

    /**
     * einfacher Konstruktor für Zapteldynamicspan
     */
    public ZapteldynamicspanImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Zapteldynamicspan
     */
    public ZapteldynamicspanImpl(String adriver, String aaddress,
            Integer anumchans, Integer atiming) {
        super();

        this.driver = adriver;
        this.address = aaddress;
        this.numchans = anumchans;
        this.timing = atiming;
    }
}