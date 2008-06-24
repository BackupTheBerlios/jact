package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ZonemessagesImpl
 * </p>
 * Created : Tue Dec 27 14:54:41 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZonemessagesImpl.java,v 1.5 2005/12/29
 *          19:14:12 urs Exp $
 */
public class ZonemessagesImpl extends Zonemessages {

    /**
     * einfacher Konstruktor für Zonemessages
     */
    public ZonemessagesImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Zonemessages
     */
    public ZonemessagesImpl(String atimezonename, String acountry,
            String acity, String aoptions) {
        super();

        this.timezonename = atimezonename;
        this.country = acountry;
        this.city = acity;
        this.options = aoptions;
    }
}