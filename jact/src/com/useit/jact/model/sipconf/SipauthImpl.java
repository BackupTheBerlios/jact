package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * SipauthImpl
 * </p>
 * Created : Sun Dec 25 18:59:11 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipauthImpl.java,v 1.4 2005/12/29 19:14:11
 *          urs Exp $
 */
public class SipauthImpl extends Sipauth {

    /**
     * einfacher Konstruktor für Sipauth
     */
    public SipauthImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Sipauth
     */
    public SipauthImpl(String auser, String asecret, String amd5secret,
            String arealm) {
        super();

        this.user = auser;
        this.secret = asecret;
        this.md5secret = amd5secret;
        this.realm = arealm;
    }
}