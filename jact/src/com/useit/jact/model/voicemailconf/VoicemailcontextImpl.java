package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * VoicemailcontextImpl
 * </p>
 * Created : Tue Dec 27 14:54:37 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: VoicemailcontextImpl.java,v 1.5 2005/12/29
 *          19:14:12 urs Exp $
 */
public class VoicemailcontextImpl extends Voicemailcontext {

    /**
     * einfacher Konstruktor f�r Voicemailcontext
     */
    public VoicemailcontextImpl() {
        super();

    }

    /**
     * komplexer Konstruktor f�r Voicemailcontext
     */
    public VoicemailcontextImpl(String acontextname) {
        super();

        this.contextname = acontextname;
    }
}