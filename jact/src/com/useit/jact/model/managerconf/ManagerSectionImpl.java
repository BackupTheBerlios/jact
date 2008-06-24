package com.useit.jact.model.managerconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ManagerSectionImpl
 * </p>
 * Created : Tue Dec 27 14:55:56 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagerSectionImpl.java,v 1.5 2005/12/29
 *          19:14:09 urs Exp $
 */
public class ManagerSectionImpl extends ManagerSection {

    /**
     * einfacher Konstruktor für ManagerSection
     */
    public ManagerSectionImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für ManagerSection
     */
    public ManagerSectionImpl(String ausername, String asecret, String aread,
            String awrite) {
        super();

        this.username = ausername;
        this.secret = asecret;
        this.read = aread;
        this.write = awrite;
    }
}