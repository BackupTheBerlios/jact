package com.useit.jact.model.queueconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * QueuememberImpl
 * </p>
 * Created : Tue Dec 27 15:30:05 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuememberImpl.java,v 1.4 2005/12/29
 *          19:14:15 urs Exp $
 */
public class QueuememberImpl extends Queuemember {

    /**
     * einfacher Konstruktor für Queuemember
     */
    public QueuememberImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Queuemember
     */
    public QueuememberImpl(String atech, String adialstring) {
        super();

        this.tech = atech;
        this.dialstring = adialstring;
    }
}