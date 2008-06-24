package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * IncludecontextImpl
 * </p>
 * Created : Thu Dec 29 11:47:18 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IncludecontextImpl.java,v 1.4 2005/12/29
 *          19:14:23 urs Exp $
 */
public class IncludecontextImpl extends Includecontext {

    /**
     * einfacher Konstruktor für Includecontext
     */
    public IncludecontextImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Includecontext
     */
    public IncludecontextImpl(PbxContext acontexname, String atimeing) {
        super();

        this.contexname = acontexname;
        this.timeing = atimeing;
    }
}