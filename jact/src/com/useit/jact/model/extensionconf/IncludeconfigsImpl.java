package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * IncludeconfigsImpl
 * </p>
 * Created : Thu Dec 29 11:47:22 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IncludeconfigsImpl.java,v 1.4 2005/12/29
 *          19:14:23 urs Exp $
 */
public class IncludeconfigsImpl extends Includeconfigs {

    /**
     * einfacher Konstruktor für Includeconfigs
     */
    public IncludeconfigsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Includeconfigs
     */
    public IncludeconfigsImpl(String aconfigname) {
        super();

        this.configname = aconfigname;
    }
}