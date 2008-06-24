package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * SwitchImpl
 * </p>
 * Created : Thu Dec 29 11:47:18 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SwitchImpl.java,v 1.4 2005/12/29 19:14:23 urs
 *          Exp $
 */
public class SwitchImpl extends Switch {

    /**
     * einfacher Konstruktor für Switch
     */
    public SwitchImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Switch
     */
    public SwitchImpl(String aswitchdialstr) {
        super();

        this.switchdialstr = aswitchdialstr;
    }
}