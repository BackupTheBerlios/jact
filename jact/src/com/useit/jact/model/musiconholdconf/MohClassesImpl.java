package com.useit.jact.model.musiconholdconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * MohClassesImpl
 * </p>
 * Created : Tue Dec 27 14:54:55 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MohClassesImpl.java,v 1.4 2005/12/29 19:14:24
 *          urs Exp $
 */
public class MohClassesImpl extends MohClasses {

    /**
     * einfacher Konstruktor für MohClasses
     */
    public MohClassesImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für MohClasses
     */
    public MohClassesImpl(String aname, String aplayer, String amohdir,
            String amohpara) {
        super();

        this.name = aname;
        this.player = aplayer;
        this.mohdir = amohdir;
        this.mohpara = amohpara;
    }
}