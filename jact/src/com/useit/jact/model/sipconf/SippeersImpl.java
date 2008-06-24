package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;

/**
 * <p>
 * SippeersImpl
 * </p>
 * Created : Sun Dec 25 18:59:15 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SippeersImpl.java,v 1.6 2005/12/29 19:14:11
 *          urs Exp $
 */
public class SippeersImpl extends Sippeers {

    /**
     * einfacher Konstruktor für Sippeers
     */
    public SippeersImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Sippeers
     */
    public SippeersImpl(String asectionname, String aaccountcode,
            Amaflags aamaflags, String acallgroup, String acanreinvite,
            PbxContext acontext, String adefaultip, Dtmfmode adtmfmode,
            String afromuser, String afromdomain, String ahost,
            Integer aincominglimit, Integer aoutgoinglimit, String ainsecure,
            String alanguage, String amailbox, String amd5secret, Boolean anat,
            String apickupgroup, Integer aport, String aqualify,
            Boolean arestrictcid, Integer artptimeout, Integer artpholdtimeout,
            String asecret, PeerType atype, String ausername,
            String amusiconhold, String acallerid, CodecsSet adisallow,
            CodecsSet aallow) {
        super();

        this.sectionname = asectionname;
        this.accountcode = aaccountcode;
        this.amaflags = aamaflags;
        this.callgroup = acallgroup;
        this.canreinvite = acanreinvite;
        this.context = acontext;
        this.defaultip = adefaultip;
        this.dtmfmode = adtmfmode;
        this.fromuser = afromuser;
        this.fromdomain = afromdomain;
        this.host = ahost;
        this.incominglimit = aincominglimit;
        this.outgoinglimit = aoutgoinglimit;
        this.insecure = ainsecure;
        this.language = alanguage;
        this.mailbox = amailbox;
        this.md5secret = amd5secret;
        this.nat = anat;
        this.pickupgroup = apickupgroup;
        this.port = aport;
        this.qualify = aqualify;
        this.restrictcid = arestrictcid;
        this.rtptimeout = artptimeout;
        this.rtpholdtimeout = artpholdtimeout;
        this.secret = asecret;
        this.type = atype;
        this.username = ausername;
        this.musiconhold = amusiconhold;
        this.callerid = acallerid;
        this.disallow = adisallow;
        this.allow = aallow;
    }
}