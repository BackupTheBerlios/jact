package com.useit.jact.model.meetmeconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * MeetmeconfImpl
 * </p>
 * Created : Tue Dec 27 14:56:12 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetmeconfImpl.java,v 1.4 2005/12/29 19:14:15
 *          urs Exp $
 */
public class MeetmeconfImpl extends Meetmeconf {

    /**
     * einfacher Konstruktor für Meetmeconf
     */
    public MeetmeconfImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Meetmeconf
     */
    public MeetmeconfImpl(String afileid) {
        super();

        this.fileid = afileid;
    }
}