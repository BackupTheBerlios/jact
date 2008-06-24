package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * Analog_Handset_FeaturesImpl
 * </p>
 * Created : Thu Dec 29 12:25:34 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Analog_Handset_FeaturesImpl.java,v 1.4
 *          2005/12/29 19:14:05 urs Exp $
 */
public class Analog_Handset_FeaturesImpl extends Analog_Handset_Features {

    /**
     * einfacher Konstruktor für Analog_Handset_Features
     */
    public Analog_Handset_FeaturesImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Analog_Handset_Features
     */
    public Analog_Handset_FeaturesImpl(String aadsi, Boolean aimmediate,
            Boolean acallwaiting, Boolean acallwaitingcallerid,
            Boolean athreewaycalling, Boolean atransfer,
            Boolean acancallforward, Boolean acallreturn, String acallgroup,
            String apickupgroup, String auseincomingcalleridonzaptransfer) {
        super();

        this.adsi = aadsi;
        this.immediate = aimmediate;
        this.callwaiting = acallwaiting;
        this.callwaitingcallerid = acallwaitingcallerid;
        this.threewaycalling = athreewaycalling;
        this.transfer = atransfer;
        this.cancallforward = acancallforward;
        this.callreturn = acallreturn;
        this.callgroup = acallgroup;
        this.pickupgroup = apickupgroup;
        this.useincomingcalleridonzaptransfer = auseincomingcalleridonzaptransfer;
    }
}