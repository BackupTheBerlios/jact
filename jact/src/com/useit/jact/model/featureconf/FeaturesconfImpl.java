package com.useit.jact.model.featureconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * FeaturesconfImpl
 * </p>
 * Created : Tue Dec 27 15:30:11 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: FeaturesconfImpl.java,v 1.5 2006/01/05
 *          12:57:43 urs Exp $
 */
public class FeaturesconfImpl extends Featuresconf {

    /**
     * einfacher Konstruktor für Featuresconf
     */
    public FeaturesconfImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Featuresconf
     */
    public FeaturesconfImpl(String aparkext, String aparkpos,
            PbxContext acontext, Integer aparkingtime,
            Integer atransferdigittimeout, String acourtesytone,
            String axfersound, String axferfailsound, Boolean aadsipark,
            String apickupexten, String afileid, Integer afeaturedigittimeout) {
        super();

        this.parkext = aparkext;
        this.parkpos = aparkpos;
        this.context = acontext;
        this.parkingtime = aparkingtime;
        this.transferdigittimeout = atransferdigittimeout;
        this.courtesytone = acourtesytone;
        this.xfersound = axfersound;
        this.xferfailsound = axferfailsound;
        this.adsipark = aadsipark;
        this.pickupexten = apickupexten;
        // this.fileid = afileid;
        this.featuredigittimeout = afeaturedigittimeout;
    }
}