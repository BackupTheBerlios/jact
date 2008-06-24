package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * Audio_Quality_Tuning_OptionsImpl
 * </p>
 * Created : Thu Dec 29 12:25:46 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: Audio_Quality_Tuning_OptionsImpl.java,v 1.4
 *          2005/12/29 19:14:05 urs Exp $
 */
public class Audio_Quality_Tuning_OptionsImpl extends
        Audio_Quality_Tuning_Options {

    /**
     * einfacher Konstruktor für Audio_Quality_Tuning_Options
     */
    public Audio_Quality_Tuning_OptionsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Audio_Quality_Tuning_Options
     */
    public Audio_Quality_Tuning_OptionsImpl(Boolean arelaxdtmf,
            Boolean aechocancel, Boolean aechocancelwhenbridged,
            Boolean aechotraining, Float arxgain, Float atxgain) {
        super();

        this.relaxdtmf = arelaxdtmf;
        this.echocancel = aechocancel;
        this.echocancelwhenbridged = aechocancelwhenbridged;
        this.echotraining = aechotraining;
        this.rxgain = arxgain;
        this.txgain = atxgain;
    }
}