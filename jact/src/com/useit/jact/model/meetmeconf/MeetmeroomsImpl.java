package com.useit.jact.model.meetmeconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * MeetmeroomsImpl
 * </p>
 * Created : Tue Dec 27 14:56:16 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetmeroomsImpl.java,v 1.4 2005/12/29
 *          19:14:15 urs Exp $
 */
public class MeetmeroomsImpl extends Meetmerooms {

    /**
     * einfacher Konstruktor für Meetmerooms
     */
    public MeetmeroomsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Meetmerooms
     */
    public MeetmeroomsImpl(String aconfno, String apincode, String aadminpin) {
        super();

        this.confno = aconfno;
        this.pincode = apincode;
        this.adminpin = aadminpin;
    }
}