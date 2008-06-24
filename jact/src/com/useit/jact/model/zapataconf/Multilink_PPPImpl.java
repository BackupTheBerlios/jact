package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * Multilink_PPPImpl
 * </p>
 * Created : Thu Dec 29 12:25:44 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Multilink_PPPImpl.java,v 1.4 2005/12/29
 *          19:14:05 urs Exp $
 */
public class Multilink_PPPImpl extends Multilink_PPP {

    /**
     * einfacher Konstruktor für Multilink_PPP
     */
    public Multilink_PPPImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Multilink_PPP
     */
    public Multilink_PPPImpl(String aminunused, Integer aminidle,
            Integer aidledial, String aidleext) {
        super();

        this.minunused = aminunused;
        this.minidle = aminidle;
        this.idledial = aidledial;
        this.idleext = aidleext;
    }
}