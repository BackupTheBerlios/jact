package com.useit.jact.model.misdndriverconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.MPortOptionSet;
import com.useit.jact.model.types.MisdnPortOptions;

/**
 * <p>
 * MisdncardPortsImpl
 * </p>
 * Created : Sun Dec 25 16:49:57 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdncardPortsImpl.java,v 1.2 2005/12/30
 *          20:27:53 urs Exp $
 */
public class MisdncardPortsImpl extends MisdncardPorts {

    /**
     * einfacher Konstruktor für MisdncardPorts
     */
    public MisdncardPortsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für MisdncardPorts
     */
    public MisdncardPortsImpl(Integer aportN, MisdnPortOptions aportOption,
            MPortOptionSet amPortOption) {
        super();

        this.portN = aportN;
        this.portOption = aportOption;
        this.mPortOption = amPortOption;
    }

    /**
     * setmPortOption
     */
    public void setmPortOption(MPortOptionSet amPortOption) {
        if (amPortOption == null) {
            changed = (this.mPortOption != null);
            this.mPortOption = null;
        } else {
            changed = amPortOption.equals(this.mPortOption);
            this.mPortOption = amPortOption;
        }
    }

    /**
     * getmPortOption
     * 
     */
    public MPortOptionSet getmPortOption() {
        return mPortOption;
    }

}