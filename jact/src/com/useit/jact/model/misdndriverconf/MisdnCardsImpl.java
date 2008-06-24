package com.useit.jact.model.misdndriverconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.MCardOptionSet;
import com.useit.jact.model.types.MisdnCardTypes;

/**
 * <p>
 * MisdnCardsImpl
 * </p>
 * Created : Sun Dec 25 16:49:57 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnCardsImpl.java,v 1.1 2005/12/25 18:10:04
 *          urs Exp $
 */
public class MisdnCardsImpl extends MisdnCards {

    /**
     * einfacher Konstruktor für MisdnCards
     */
    public MisdnCardsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für MisdnCards
     */
    public MisdnCardsImpl(String acardName, MisdnCardTypes acardType,
            MCardOptionSet acardOptions) {
        super();

        this.cardName = acardName;
        this.cardType = acardType;
        this.cardOptions = acardOptions;
    }
}