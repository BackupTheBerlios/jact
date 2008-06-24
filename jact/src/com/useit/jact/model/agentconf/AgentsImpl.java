package com.useit.jact.model.agentconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * AgentsImpl
 * </p>
 * Created : Tue Dec 27 16:22:39 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsImpl.java,v 1.4 2005/12/29 19:14:24 urs
 *          Exp $
 */
public class AgentsImpl extends Agents {

    /**
     * einfacher Konstruktor für Agents
     */
    public AgentsImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Agents
     */
    public AgentsImpl(String aagentid, String aagentpassword, String aname) {
        super();

        this.agentid = aagentid;
        this.agentpassword = aagentpassword;
        this.name = aname;
    }
}