package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * IaxpermitImpl
 * </p>
 * Created : Mon Dec 12 20:32:48 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxpermitImpl.java,v 1.2 2005/12/25 18:09:54
 *          urs Exp $
 */
public class IaxpermitImpl extends Iaxpermit {

    /**
     * einfacher Konstruktor für Iaxpermit
     */
    public IaxpermitImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Iaxpermit
     */
    public IaxpermitImpl(String avalue) {
        super();

        this.value = avalue;
    }
}