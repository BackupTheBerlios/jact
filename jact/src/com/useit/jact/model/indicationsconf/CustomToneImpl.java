package com.useit.jact.model.indicationsconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * CustomToneImpl
 * </p>
 * Created : Tue Dec 27 14:56:04 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: CustomToneImpl.java,v 1.4 2005/12/29 19:14:17
 *          urs Exp $
 */
public class CustomToneImpl extends CustomTone {

    /**
     * einfacher Konstruktor für CustomTone
     */
    public CustomToneImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für CustomTone
     */
    public CustomToneImpl(String atonecode, String aname) {
        super();

        this.tonecode = atonecode;
        this.name = aname;
    }
}