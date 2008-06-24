package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * VoicemailgeneralImpl
 * </p>
 * Created : Tue Dec 27 14:54:35 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailgeneralImpl.java,v 1.5 2005/12/29
 *          19:14:12 urs Exp $
 */
public class VoicemailgeneralImpl extends Voicemailgeneral {

    /**
     * einfacher Konstruktor für Voicemailgeneral
     */
    public VoicemailgeneralImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Voicemailgeneral
     */
    public VoicemailgeneralImpl(Boolean aattach, Boolean adelete,
            String amailcmd, String amaxsilence, String aenvelope,
            String aexternnotify, String asilencethreshold,
            String aserveremail, String amaxmessage, String aminmessage,
            String aformat, String amaxgreet, String askipms,
            String amaxlogins, String acidinternalcontexts, Boolean areview,
            Boolean aoperator, Boolean asaycid, String adialout,
            String acallback, String adbuser, String adbpass, String adbhost,
            String adbname, String adboption, String apbxskip,
            String afromstring, String aemailsubject, String aemailbody,
            String aexitcontext, String anextaftercmd) {
        super();

        this.attach = aattach;
        this.delete = adelete;
        this.mailcmd = amailcmd;
        this.maxsilence = amaxsilence;
        this.envelope = aenvelope;
        this.externnotify = aexternnotify;
        this.silencethreshold = asilencethreshold;
        this.serveremail = aserveremail;
        this.maxmessage = amaxmessage;
        this.minmessage = aminmessage;
        this.format = aformat;
        this.maxgreet = amaxgreet;
        this.skipms = askipms;
        this.maxlogins = amaxlogins;
        this.cidinternalcontexts = acidinternalcontexts;
        this.review = areview;
        this.operator = aoperator;
        this.saycid = asaycid;
        this.dialout = adialout;
        this.callback = acallback;
        this.dbuser = adbuser;
        this.dbpass = adbpass;
        this.dbhost = adbhost;
        this.dbname = adbname;
        this.dboption = adboption;
        this.pbxskip = apbxskip;
        this.fromstring = afromstring;
        this.emailsubject = aemailsubject;
        this.emailbody = aemailbody;
        this.exitcontext = aexitcontext;
        this.nextaftercmd = anextaftercmd;
    }
}