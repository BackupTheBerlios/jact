/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.agentconf;

import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.Agentsrecording;

/**
 * <p>
 * DataClassRendereImpl, eine Statische Klasse die ein Daten Object zu seiner
 * Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendereImpl.java,v 1.6 2006/01/29
 *          12:03:55 urs Exp $
 */
public final class DataClassRendereImpl extends DataClassRendere {
    /**
     * 
     */
    protected DataClassRendereImpl() {
        super();
    }

    /**
     * gibt den string des Datenobjectes zurück für Agentsconf
     */
    public String displayString(Agentsconf aAgentsconf) {
        return aAgentsconf == null ? "" : "agents config";// aAgentsconf.toString();
                                                            // //"DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Agents
     */
    public String displayString(Agents aAgents) {
        return aAgents == null ? "" : aAgents.toString(); // "DataObjectName";
    }

    /**
     * gibt den string des Datenobjectes zurück für Agentsrecording
     */
    public String displayString(Agentsrecording aAgentsrecording) {
        return aAgentsrecording == null ? "none" : "agents recording";// aAgentsrecording.toString();
                                                                        // //"DataObjectName";
    }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Agentsconf
    // */
    // public String displayString(AgentsconfMap aAgentsconfMap){
    // return aAgentsconfMap == null ? "" : aAgentsconfMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Agents
    // */
    // public String displayString(AgentsMap aAgentsMap){
    // return aAgentsMap == null ? "" : aAgentsMap.toString();
    // //"DataObjectName";
    // }
    // /**
    // * gibt den string des Datenobjectes zurück
    // * für Agentsrecording
    // */
    // public String displayString(AgentsrecordingMap aAgentsrecordingMap){
    // return aAgentsrecordingMap == null ? "" : aAgentsrecordingMap.toString();
    // //"DataObjectName";
    // }
}
