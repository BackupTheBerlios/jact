package com.useit.jact.model.sipconf;

import java.util.Iterator;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * SipConfImpl
 * </p>
 * Created : Sun Dec 25 18:59:13 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: SipConfImpl.java,v 1.9 2006/03/17 15:47:22
 *          urs Exp $
 */
public class SipConfImpl extends SipConf {

    /**
     * einfacher Konstruktor für SipConf
     */
    public SipConfImpl() {
        super();

    }

    /**
     * gibt einen sippeer zurück mit dem section namen
     * 
     * @param string
     * @return
     */
    public SippeersImpl getSippeer(String string) {
        for (Iterator<Sippeers> iter = sippeersMap.iterator(); iter.hasNext();) {
            Sippeers sp = iter.next();
            if (sp.getSectionname().equals(string))
                return (SippeersImpl) sp;
        }
        return null;
    }
}