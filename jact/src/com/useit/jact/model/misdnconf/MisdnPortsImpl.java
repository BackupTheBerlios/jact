package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;
import com.useit.jact.model.types.MisdnPortOptions;

/**
 * <p>
 * MisdnPortsImpl
 * </p>
 * Created : Sun Dec 25 18:59:04 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnPortsImpl.java,v 1.6 2005/12/29 19:14:08
 *          urs Exp $
 */
public class MisdnPortsImpl extends MisdnPorts {

    /**
     * einfacher Konstruktor für MisdnPorts
     */
    public MisdnPortsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für MisdnPorts
     */
    public MisdnPortsImpl(Integer aportN, MisdnPortOptions aportOption) {
        super();

        this.portN = aportN;
        this.portOption = aportOption;
    }

    /**
     * @param port
     */
    public MisdnPortsImpl(MisdncardPorts port) {
        this.portN = port.getPortN();
        this.portOption = port.getPortOption();
    }

}