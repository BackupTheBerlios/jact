package com.useit.jact.model.agentconf;

//import com.useit.jact.db.ConnectionManager;

/**
 * <p>
 * AgentsconfImpl
 * </p>
 * Created : Tue Dec 27 16:22:42 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentsconfImpl.java,v 1.4 2005/12/29 19:14:24
 *          urs Exp $
 */
public class AgentsconfImpl extends Agentsconf {

    /**
     * einfacher Konstruktor für Agentsconf
     */
    public AgentsconfImpl() {
        super();

    }

    /**
     * komplexer Konstruktor für Agentsconf
     */
    public AgentsconfImpl(String aautologoff, String aackcall,
            String awrapuptime, String amusic_class, String acustom_beep,
            String agroup) {
        super();

        this.autologoff = aautologoff;
        this.ackcall = aackcall;
        this.wrapuptime = awrapuptime;
        this.music_class = amusic_class;
        this.custom_beep = acustom_beep;
        this.group = agroup;
    }
}