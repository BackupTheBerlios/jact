package com.useit.jact.model.indicationsconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * ToneDefinitionsImpl
 * </p>
 * Created : Tue Dec 27 14:56:04 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ToneDefinitionsImpl.java,v 1.4 2005/12/29
 *          19:14:17 urs Exp $
 */
public class ToneDefinitionsImpl extends ToneDefinitions {

    /**
     * einfacher Konstruktor für ToneDefinitions
     */
    public ToneDefinitionsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für ToneDefinitions
     */
    public ToneDefinitionsImpl(String acountrycode, String adescription,
            String aalias, String aringcadence, String adial, String abusy,
            String aring, String acongestion, String acallwaiting,
            String adialrecall, String arecord, String ainfo) {
        super();

        this.countrycode = acountrycode;
        this.description = adescription;
        this.alias = aalias;
        this.ringcadence = aringcadence;
        this.dial = adial;
        this.busy = abusy;
        this.ring = aring;
        this.congestion = acongestion;
        this.callwaiting = acallwaiting;
        this.dialrecall = adialrecall;
        this.record = arecord;
        this.info = ainfo;
    }
}