/*
 * (c) urs zeidler
 */
package com.useit.jact.gui.agentconf;

import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.Agentsrecording;

// import com.beronet.App.CSS.model.dataModel.Agentsconf;
// import com.beronet.App.CSS.model.dataModel.Agents;
// import com.beronet.App.CSS.model.dataModel.Agentsrecording;
/**
 * <p>
 * DataClassRendere, eine Statische Klasse die ein Daten Object zu seiner Gui<br>
 * represetation als String zurückgibt.
 * </p>
 * Created : 25.02.2004
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: DataClassRendere.java,v 1.5 2006/01/05
 *          12:57:43 urs Exp $
 */
public abstract class DataClassRendere {

    protected static DataClassRendere defaultInstance;

    /**
     * 
     */
    protected DataClassRendere() {
        super();
    }

    private static DataClassRendere getInstance() {
        if (defaultInstance == null) {

            defaultInstance = new DataClassRendereImpl();
        }
        return defaultInstance;
    }

    /**
     * gibt den string des Datenobjectes zurück für Agentsconf
     */
    public abstract String displayString(Agentsconf aAgentsconf);// {

    // return aAgentsconf == null ? "" : aAgentsconf.toString();
    // //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Agents
     */
    public abstract String displayString(Agents aAgents);// {

    // return aAgents == null ? "" : aAgents.toString(); //"DataObjectName";
    // }
    /**
     * gibt den string des Datenobjectes zurück für Agentsrecording
     */
    public abstract String displayString(Agentsrecording aAgentsrecording);// {

    // return aAgentsrecording == null ? "" : aAgentsrecording.toString();
    // //"DataObjectName";
    // }

    public static String displayString(Object obj) {
        if (obj instanceof Agentsconf)
            return getInstance().displayString((Agentsconf) obj);
        if (obj instanceof Agents)
            return getInstance().displayString((Agents) obj);
        if (obj instanceof Agentsrecording)
            return getInstance().displayString((Agentsrecording) obj);
        return obj.toString();
    }
}
