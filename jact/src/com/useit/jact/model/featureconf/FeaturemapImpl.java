package com.useit.jact.model.featureconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * FeaturemapImpl
 * </p>
 * Created : Tue Dec 27 15:30:11 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: FeaturemapImpl.java,v 1.4 2005/12/29 19:14:20
 *          urs Exp $
 */
public class FeaturemapImpl extends Featuremap {

    /**
     * einfacher Konstruktor für Featuremap
     */
    public FeaturemapImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Featuremap
     */
    public FeaturemapImpl(String ablindxfer, String adisconnect,
            String aautomon, String aatxfer) {
        super();

        this.blindxfer = ablindxfer;
        this.disconnect = adisconnect;
        this.automon = aautomon;
        this.atxfer = aatxfer;
    }
}