package com.useit.jact.model.agentconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * AgentsrecordingImpl
 * </p>
 * Created : Tue Dec 27 16:22:43 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsrecordingImpl.java,v 1.4 2005/12/29
 *          19:14:24 urs Exp $
 */
public class AgentsrecordingImpl extends Agentsrecording {

    /**
     * einfacher Konstruktor für Agentsrecording
     */
    public AgentsrecordingImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Agentsrecording
     */
    public AgentsrecordingImpl(Boolean arecordagentcalls, String arecordformat,
            String acreatelink, String aurlprefix, String asavecallsin) {
        super();

        this.recordagentcalls = arecordagentcalls;
        this.recordformat = arecordformat;
        this.createlink = acreatelink;
        this.urlprefix = aurlprefix;
        this.savecallsin = asavecallsin;
    }
}