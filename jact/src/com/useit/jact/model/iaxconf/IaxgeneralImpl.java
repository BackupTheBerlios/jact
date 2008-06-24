package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;

/**
 * <p>
 * IaxgeneralImpl
 * </p>
 * Created : Mon Dec 12 20:32:53 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxgeneralImpl.java,v 1.2 2005/12/25 18:09:54
 *          urs Exp $
 */
public class IaxgeneralImpl extends Iaxgeneral {

    /**
     * einfacher Konstruktor für Iaxgeneral
     */
    public IaxgeneralImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Iaxgeneral
     */
    public IaxgeneralImpl(Integer abindport, String abindaddr,
            String aiaxcompat, Boolean anochecksums, Boolean adelayreject,
            Amaflags aamaflags, String aaccountcode, String alanguage,
            String abandwidth, Integer atrunktimestamps, String aauthdebug,
            String atos, Boolean amailboxdetail, String aregcontext,
            Boolean aautokill, String acodecpriority, Integer artcachefriends,
            Boolean artupdate, Boolean artautoclear, Boolean artignoreexpire,
            Integer atrunkfreq, CodecsSet adisallow, CodecsSet aallow,
            Integer aminregexpire, Integer amaxregexpire, Boolean anotransfer) {
        super();

        this.bindport = abindport;
        this.bindaddr = abindaddr;
        this.iaxcompat = aiaxcompat;
        this.nochecksums = anochecksums;
        this.delayreject = adelayreject;
        this.amaflags = aamaflags;
        this.accountcode = aaccountcode;
        this.language = alanguage;
        this.bandwidth = abandwidth;
        this.trunktimestamps = atrunktimestamps;
        this.authdebug = aauthdebug;
        this.tos = atos;
        this.mailboxdetail = amailboxdetail;
        this.regcontext = aregcontext;
        this.autokill = aautokill;
        this.codecpriority = acodecpriority;
        this.rtcachefriends = artcachefriends;
        this.rtupdate = artupdate;
        this.rtautoclear = artautoclear;
        this.rtignoreexpire = artignoreexpire;
        this.trunkfreq = atrunkfreq;
        this.disallow = adisallow;
        this.allow = aallow;
        this.minregexpire = aminregexpire;
        this.maxregexpire = amaxregexpire;
        this.notransfer = anotransfer;
    }
}