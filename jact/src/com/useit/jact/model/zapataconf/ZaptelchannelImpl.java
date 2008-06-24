package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Signalling;

/**
 * <p>
 * ZaptelchannelImpl
 * </p>
 * Created : Thu Dec 29 12:25:49 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZaptelchannelImpl.java,v 1.4 2005/12/29
 *          19:14:05 urs Exp $
 */
public class ZaptelchannelImpl extends Zaptelchannel {

    /**
     * einfacher Konstruktor für Zaptelchannel
     */
    public ZaptelchannelImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Zaptelchannel
     */
    public ZaptelchannelImpl(Signalling asignalling, PbxContext acontext,
            String achannel) {
        super();

        this.signalling = asignalling;
        this.context = acontext;
        this.channel = achannel;
    }
}