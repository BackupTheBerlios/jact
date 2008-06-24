package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * GlobalvarsImpl
 * </p>
 * Created : Thu Dec 29 11:47:20 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: GlobalvarsImpl.java,v 1.4 2005/12/29 19:14:23
 *          urs Exp $
 */
public class GlobalvarsImpl extends Globalvars {

    /**
     * einfacher Konstruktor für Globalvars
     */
    public GlobalvarsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Globalvars
     */
    public GlobalvarsImpl(String aname, String avalue) {
        super();

        this.name = aname;
        this.value = avalue;
    }
}