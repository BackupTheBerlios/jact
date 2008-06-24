package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.PbxApplication;

/**
 * <p>
 * ExtensionImpl
 * </p>
 * Created : Thu Dec 29 11:47:16 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExtensionImpl.java,v 1.5 2005/12/29 19:14:23
 *          urs Exp $
 */
public class ExtensionImpl extends Extension {

    /**
     * einfacher Konstruktor für Extension
     */
    public ExtensionImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Extension
     */
    public ExtensionImpl(String aexten, Integer apriority, String aoffset,
            String aalias, PbxApplication aapplication, String aapplication_para) {
        super();

        this.exten = aexten;
        this.priority = apriority;
        this.application = aapplication;
    }
}