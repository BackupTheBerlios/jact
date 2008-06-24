package com.useit.jact.model.iaxconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * IaxdenyImpl
 * </p>
 * Created : Mon Dec 12 20:32:46 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IaxdenyImpl.java,v 1.2 2005/12/25 18:09:54
 *          urs Exp $
 */
public class IaxdenyImpl extends Iaxdeny {

    /**
     * einfacher Konstruktor für Iaxdeny
     */
    public IaxdenyImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Iaxdeny
     */
    public IaxdenyImpl(String avalue) {
        super();

        this.value = avalue;
    }
}