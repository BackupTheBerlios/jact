package com.useit.jact.model.misdndriverconf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * MisdnDriverConfImpl
 * </p>
 * Created : Sun Dec 25 16:49:58 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnDriverConfImpl.java,v 1.2 2006/01/05
 *          12:57:43 urs Exp $
 */
public class MisdnDriverConfImpl extends MisdnDriverConf {

    /**
     * einfacher Konstruktor für MisdnDriverConf
     */
    public MisdnDriverConfImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für MisdnDriverConf
     */
    public MisdnDriverConfImpl(String afileid, Integer apoll, Boolean apcm,
            Integer adebug) {
        super();

        this.poll = apoll;
        this.pcm = apcm;
        this.debug = adebug;
    }
    /**
     * gibt einen port oder null
     * 
     * @param cnr
     * @return
     */
    public MisdncardPorts findPort(Integer cnr) {
        for (Iterator iter = misdnCardsMap.iterator(); iter.hasNext();) {
            MisdnCardsImpl card = (MisdnCardsImpl) iter.next();
            MisdncardPorts port = card.getMisdncardPortsMap().get(cnr);
            if (port != null)
                return port;
        }
        return null;

    }

    /**
     * @return
     */
    public int getPortCount() {
        int i = 0;
        for (Iterator iter = misdnCardsMap.iterator(); iter.hasNext();) {
            MisdnCards card = (MisdnCards) iter.next();
            i = i + card.getMisdncardPortsMap().size();
        }
        return i;
    }

    /**
     * gibt eine Port map aller ports aller karten zurück
     * 
     * @return
     */
    public List<MisdncardPorts> getAllPorts() {
        List<MisdncardPorts> portsMap = new ArrayList<MisdncardPorts>();
        for (Iterator iter = getMisdnCardsMap().iterator(); iter.hasNext();) {
            MisdnCardsImpl card = (MisdnCardsImpl) iter.next();
            portsMap.addAll(card.getMisdncardPortsMap());
        }

        return portsMap;
    }

}