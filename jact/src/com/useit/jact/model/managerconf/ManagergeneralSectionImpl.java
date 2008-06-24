package com.useit.jact.model.managerconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ManagergeneralSectionImpl
 * </p>
 * Created : Tue Dec 27 14:31:37 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ManagergeneralSectionImpl.java,v 1.2
 *          2005/12/29 19:14:09 urs Exp $
 */
public class ManagergeneralSectionImpl extends ManagergeneralSection {

    /**
     * einfacher Konstruktor für ManagergeneralSection
     */
    public ManagergeneralSectionImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für ManagergeneralSection
     */
    public ManagergeneralSectionImpl(String ageneralid, Boolean aenabled,
            Integer aportno, String abindaddr, Integer aport, String afileid) {
        super();

        this.generalid = ageneralid;
        this.enabled = aenabled;
        this.portno = aportno;
        this.bindaddr = abindaddr;
        this.port = aport;
        this.fileid = afileid;
    }
}