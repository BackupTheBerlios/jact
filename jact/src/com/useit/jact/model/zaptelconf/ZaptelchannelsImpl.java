package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ZaptelchannelsImpl
 * </p>
 * Created : Sun Dec 25 18:59:41 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelchannelsImpl.java,v 1.4 2005/12/29
 *          19:14:07 urs Exp $
 */
public class ZaptelchannelsImpl extends Zaptelchannels {

    /**
     * einfacher Konstruktor für Zaptelchannels
     */
    public ZaptelchannelsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Zaptelchannels
     */
    public ZaptelchannelsImpl(String adevice, String achannellist) {
        super();

        this.device = adevice;
        this.channellist = achannellist;
    }
}