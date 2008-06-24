package com.useit.jact.model.managerconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ManagerpermitImpl
 * </p>
 * Created : Tue Dec 27 14:31:36 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagerpermitImpl.java,v 1.2 2005/12/29
 *          19:14:09 urs Exp $
 */
public class ManagerpermitImpl extends Managerpermit {

    /**
     * einfacher Konstruktor für Managerpermit
     */
    public ManagerpermitImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Managerpermit
     */
    public ManagerpermitImpl(String avalue) {
        super();

        this.value = avalue;
    }
}