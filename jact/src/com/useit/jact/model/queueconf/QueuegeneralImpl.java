package com.useit.jact.model.queueconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * QueuegeneralImpl
 * </p>
 * Created : Tue Dec 27 15:30:02 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: QueuegeneralImpl.java,v 1.4 2005/12/29
 *          19:14:15 urs Exp $
 */
public class QueuegeneralImpl extends Queuegeneral {

    /**
     * einfacher Konstruktor f�r Queuegeneral
     */
    public QueuegeneralImpl() {
        super();

    }

    /**
     * komplexer Konstruktor f�r Queuegeneral
     */
    public QueuegeneralImpl(Boolean apersistentmembers) {
        super();

        this.persistentmembers = apersistentmembers;
    }
}