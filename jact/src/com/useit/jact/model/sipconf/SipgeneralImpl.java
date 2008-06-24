package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * SipgeneralImpl
 * </p>
 * Created : Sun Dec 25 18:59:17 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipgeneralImpl.java,v 1.7 2005/12/29 19:14:11
 *          urs Exp $
 */
public class SipgeneralImpl extends Sipgeneral {

    /**
     * einfacher Konstruktor für Sipgeneral
     */
    public SipgeneralImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Sipgeneral
     */
    public SipgeneralImpl(Boolean aautocreatepeer, String abindaddr,
            Integer abindport, String acanreinvite, PbxContext acontext,
            Integer adefaultexpirey, Dtmfmode adtmfmode, String aexternip,
            String aexternhost, String aexternrefresh, String alocalnet,
            String afromdomain, Integer amaxexpirey, Boolean anat,
            String anotifymimetype, Boolean apedantic, Integer aport,
            Boolean apromiscredir, Boolean asrvlookup, String atos,
            Boolean avideosupport, String auseragent, Boolean atrustrpid,
            String arealm, Boolean arelaxdtmf, Integer artptimeout,
            Integer artpholdtimeout, String aprogressinband,
            Boolean ausereqphone, Boolean acompactheaders, Boolean asipdebug,
            Integer acheckmwi, Boolean arecordhistory, CodecsSet aallow,
            CodecsSet adisallow) {
        super();

        this.autocreatepeer = aautocreatepeer;
        this.bindaddr = abindaddr;
        this.bindport = abindport;
        this.canreinvite = acanreinvite;
        this.context = acontext;
        this.defaultexpirey = adefaultexpirey;
        this.dtmfmode = adtmfmode;
        this.externip = aexternip;
        this.externhost = aexternhost;
        this.externrefresh = aexternrefresh;
        this.localnet = alocalnet;
        this.fromdomain = afromdomain;
        this.maxexpirey = amaxexpirey;
        this.nat = anat;
        this.notifymimetype = anotifymimetype;
        this.pedantic = apedantic;
        this.port = aport;
        this.promiscredir = apromiscredir;
        this.srvlookup = asrvlookup;
        this.tos = atos;
        this.videosupport = avideosupport;
        this.useragent = auseragent;
        this.trustrpid = atrustrpid;
        this.realm = arealm;
        this.rtptimeout = artptimeout;
        this.relaxdtmf = arelaxdtmf;
        this.rtpholdtimeout = artpholdtimeout;
        this.progressinband = aprogressinband;
        this.usereqphone = ausereqphone;
        this.compactheaders = acompactheaders;
        this.sipdebug = asipdebug;
        this.checkmwi = acheckmwi;
        this.recordhistory = arecordhistory;
        this.allow = aallow;
        this.disallow = adisallow;
    }
}