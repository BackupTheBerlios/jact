package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * MisdnCryptkeyImpl
 * </p>
 * Created : Sun Dec 25 18:59:02 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCryptkeyImpl.java,v 1.5 2005/12/29
 *          19:14:08 urs Exp $
 */
public class MisdnCryptkeyImpl extends MisdnCryptkey {

    /**
     * einfacher Konstruktor für MisdnCryptkey
     */
    public MisdnCryptkeyImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für MisdnCryptkey
     */
    public MisdnCryptkeyImpl(String akeyname, String akeyvalue) {
        super();

        this.keyname = akeyname;
        this.keyvalue = akeyvalue;
    }
}