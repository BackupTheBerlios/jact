package com.useit.jact.model.queueconf;

import com.useit.jact.model.types.PbxContext;

//import com.useit.jact.db.ConnectionManager;


/**
 * <p>
 * QueuesectionImpl
 * </p>
 * Created : Tue Dec 27 15:30:03 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuesectionImpl.java,v 1.4 2005/12/29
 *          19:14:15 urs Exp $
 */
public class QueuesectionImpl extends Queuesection {

    /**
     * einfacher Konstruktor für Queuesection
     */
    public QueuesectionImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Queuesection
     */
    public QueuesectionImpl(String amusiconhold, String aannounce,
            String astrategy, Integer aservicelevel, PbxContext acontext,
            Integer atimeout, Integer aretry, String aweight,
            Integer awrapuptime, Integer amaxlen, Integer aannouncefrequency,
            Boolean aannounceholdtime, String aannounceroundseconds,
            String amonitorformat, Boolean amonitorjoin, String ajoinempty,
            String aleavewhenempty, Boolean aeventwhencalled,
            Boolean aeventmemberstatusoff, Boolean areportholdtime,
            Integer amemberdelay, Boolean atimeoutrestart) {
        super();

        this.musiconhold = amusiconhold;
        this.announce = aannounce;
        this.strategy = astrategy;
        this.servicelevel = aservicelevel;
        this.context = acontext;
        this.timeout = atimeout;
        this.retry = aretry;
        this.weight = aweight;
        this.wrapuptime = awrapuptime;
        this.maxlen = amaxlen;
        this.announcefrequency = aannouncefrequency;
        this.announceholdtime = aannounceholdtime;
        this.announceroundseconds = aannounceroundseconds;
        this.monitorformat = amonitorformat;
        this.monitorjoin = amonitorjoin;
        this.joinempty = ajoinempty;
        this.leavewhenempty = aleavewhenempty;
        this.eventwhencalled = aeventwhencalled;
        this.eventmemberstatusoff = aeventmemberstatusoff;
        this.reportholdtime = areportholdtime;
        this.memberdelay = amemberdelay;
        this.timeoutrestart = atimeoutrestart;
    }
}