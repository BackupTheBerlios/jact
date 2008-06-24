package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * VoicemailcontextentryImpl
 * </p>
 * Created : Tue Dec 27 14:54:43 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailcontextentryImpl.java,v 1.5
 *          2005/12/29 19:14:12 urs Exp $
 */
public class VoicemailcontextentryImpl extends Voicemailcontextentry {

    /**
     * einfacher Konstruktor für Voicemailcontextentry
     */
    public VoicemailcontextentryImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Voicemailcontextentry
     */
    public VoicemailcontextentryImpl(String avoicemail_password,
            String auser_name, String auser_email_address,
            String apager_email_address, String auser_options) {
        super();

        this.voicemail_password = avoicemail_password;
        this.user_name = auser_name;
        this.user_email_address = auser_email_address;
        this.pager_email_address = apager_email_address;
        this.user_options = auser_options;
    }
}