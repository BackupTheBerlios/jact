package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * SipregisterImpl
 * </p>
 * Created : Sun Dec 25 18:59:10 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipregisterImpl.java,v 1.4 2005/12/29
 *          19:14:11 urs Exp $
 */
public class SipregisterImpl extends Sipregister {

    /**
     * einfacher Konstruktor für Sipregister
     */
    public SipregisterImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Sipregister
     */
    public SipregisterImpl(String auser, String aauthuser, String asecret,
            String ahost, Integer aport, String aextension) {
        super();

        this.user = auser;
        this.authuser = aauthuser;
        this.secret = asecret;
        this.host = ahost;
        this.port = aport;
        this.extension = aextension;
    }
}