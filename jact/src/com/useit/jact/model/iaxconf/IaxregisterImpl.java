package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * IaxregisterImpl
 * </p>
 * Created : Mon Dec 12 20:32:45 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxregisterImpl.java,v 1.2 2005/12/25
 *          18:09:54 urs Exp $
 */
public class IaxregisterImpl extends Iaxregister {

    /**
     * einfacher Konstruktor für Iaxregister
     */
    public IaxregisterImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Iaxregister
     */
    public IaxregisterImpl(String auser, String aauthuser, String asecret,
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