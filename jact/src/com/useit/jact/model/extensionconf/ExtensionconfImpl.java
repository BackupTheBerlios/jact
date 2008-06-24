package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ExtensionconfImpl
 * </p>
 * Created : Thu Dec 29 11:47:20 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ExtensionconfImpl.java,v 1.4 2005/12/29
 *          19:14:23 urs Exp $
 */
public class ExtensionconfImpl extends Extensionconf {

    /**
     * einfacher Konstruktor für Extensionconf
     */
    public ExtensionconfImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Extensionconf
     */
    public ExtensionconfImpl(Boolean astatic_, Boolean awriteprotect,
            Boolean aautofallthrough, Boolean aclearglobalvars) {
        super();

        this.static_ = astatic_;
        this.writeprotect = awriteprotect;
        this.autofallthrough = aautofallthrough;
        this.clearglobalvars = aclearglobalvars;
    }
}