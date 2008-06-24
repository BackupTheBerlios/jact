package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * OtherImpl
 * </p>
 * Created : Thu Dec 29 12:25:32 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: OtherImpl.java,v 1.4 2005/12/29 19:14:05 urs
 *          Exp $
 */
public class OtherImpl extends Other {

    /**
     * einfacher Konstruktor für Other
     */
    public OtherImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Other
     */
    public OtherImpl(String amailbox, String agroup, String alanguage) {
        super();

        this.mailbox = amailbox;
        this.group = agroup;
        this.language = alanguage;
    }
}