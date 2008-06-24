package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.Dialplan;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Presentation;

/**
 * <p>
 * MisdnSectionsImpl
 * </p>
 * Created : Sun Dec 25 18:59:03 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnSectionsImpl.java,v 1.6 2005/12/29
 *          19:14:08 urs Exp $
 */
public class MisdnSectionsImpl extends MisdnSections {

    /**
     * einfacher Konstruktor für MisdnSections
     */
    public MisdnSectionsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für MisdnSections
     */
    public MisdnSectionsImpl(PbxContext acontext, String alanguage,
            String anationalprefix, String ainternationalprefix,
            Integer arxgain, Integer atxgain, Boolean ate_choose_channel,
            Boolean aearly_bconnect, Dialplan adialplan,
            Boolean ause_callingpres, Boolean aalways_immediate,
            Boolean aimmediate, Boolean ahold_allowed, String apickgroup,
            String acallgroup, Presentation apresentation, Boolean aechocancel,
            Boolean aechocancelwhenbridged, String aechotraining,
            String asectionname) {
        super();

        this.context = acontext;
        this.language = alanguage;
        this.nationalprefix = anationalprefix;
        this.internationalprefix = ainternationalprefix;
        this.rxgain = arxgain;
        this.txgain = atxgain;
        this.te_choose_channel = ate_choose_channel;
        this.early_bconnect = aearly_bconnect;
        this.dialplan = adialplan;
        this.use_callingpres = ause_callingpres;
        this.always_immediate = aalways_immediate;
        this.immediate = aimmediate;
        this.hold_allowed = ahold_allowed;
        this.pickgroup = apickgroup;
        this.callgroup = acallgroup;
        this.presentation = apresentation;
        this.echocancel = aechocancel;
        this.echocancelwhenbridged = aechocancelwhenbridged;
        this.echotraining = aechotraining;
        this.sectionname = asectionname;
    }
}