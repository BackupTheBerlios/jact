package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * Analog_Trunk_FeaturesImpl
 * </p>
 * Created : Thu Dec 29 12:25:38 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Analog_Trunk_FeaturesImpl.java,v 1.4
 *          2005/12/29 19:14:05 urs Exp $
 */
public class Analog_Trunk_FeaturesImpl extends Analog_Trunk_Features {

    /**
     * einfacher Konstruktor für Analog_Trunk_Features
     */
    public Analog_Trunk_FeaturesImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Analog_Trunk_Features
     */
    public Analog_Trunk_FeaturesImpl(Boolean ausedistinctiveringdetection,
            String adring1, String adring2, String adring3,
            String adring1context, String adring2context,
            String adring3context, Boolean abusydetect, Integer abusycount,
            Boolean acallprogress, Boolean apulse) {
        super();

        this.usedistinctiveringdetection = ausedistinctiveringdetection;
        this.dring1 = adring1;
        this.dring2 = adring2;
        this.dring3 = adring3;
        this.dring1context = adring1context;
        this.dring2context = adring2context;
        this.dring3context = adring3context;
        this.busydetect = abusydetect;
        this.busycount = abusycount;
        this.callprogress = acallprogress;
        this.pulse = apulse;
    }
}