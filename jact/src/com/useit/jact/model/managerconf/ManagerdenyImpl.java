package com.useit.jact.model.managerconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ManagerdenyImpl
 * </p>
 * Created : Tue Dec 27 14:31:35 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagerdenyImpl.java,v 1.2 2005/12/29
 *          19:14:09 urs Exp $
 */
public class ManagerdenyImpl extends Managerdeny {

    /**
     * einfacher Konstruktor für Managerdeny
     */
    public ManagerdenyImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Managerdeny
     */
    public ManagerdenyImpl(String avalue) {
        super();

        this.value = avalue;
    }
}