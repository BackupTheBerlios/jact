package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;

/**
 * <p>
 * IaxpeerImpl
 * </p>
 * Created : Mon Dec 12 20:32:52 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxpeerImpl.java,v 1.2 2005/12/25 18:09:54
 *          urs Exp $
 */
public class IaxpeerImpl extends Iaxpeer {

    /**
     * einfacher Konstruktor für Iaxpeer
     */
    public IaxpeerImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Iaxpeer
     */
    public IaxpeerImpl(String aiaxpeername, PeerType apeertype,
            String acallerid, String aauth, String asecret, String ainkeys,
            String ahost, String adefaultip, PbxContext acontext,
            String adbsecret, String asetvar, PbxContext apeercontext,
            Integer aqualify, Boolean atrunk, String atimezone,
            String aregexten, CodecsSet adisallow, CodecsSet aallow,
            String amailbox, String aaccountcode, String aoutkey,
            Boolean anotransfer, Boolean aqualifysmoothing,
            Integer aqualifyfreqok, Integer aqualifyfreqnotok) {
        super();

        this.iaxpeername = aiaxpeername;
        this.peertype = apeertype;
        this.callerid = acallerid;
        this.auth = aauth;
        this.secret = asecret;
        this.inkeys = ainkeys;
        this.host = ahost;
        this.defaultip = adefaultip;
        this.context = acontext;
        this.dbsecret = adbsecret;
        this.setvar = asetvar;
        this.peercontext = apeercontext;
        this.qualify = aqualify;
        this.trunk = atrunk;
        this.timezone = atimezone;
        this.regexten = aregexten;
        this.disallow = adisallow;
        this.allow = aallow;
        this.mailbox = amailbox;
        this.accountcode = aaccountcode;
        this.outkey = aoutkey;
        this.notransfer = anotransfer;
        this.qualifysmoothing = aqualifysmoothing;
        this.qualifyfreqok = aqualifyfreqok;
        this.qualifyfreqnotok = aqualifyfreqnotok;
    }
}