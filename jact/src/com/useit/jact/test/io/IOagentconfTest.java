/*
 * (c) urs zeidler
 */
package com.useit.jact.test.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import junit.framework.TestCase;

import org.apache.log4j.Logger;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.useit.app.framework.db.HibernateUtil;
import com.useit.jact.model.agentconf.Agents;
import com.useit.jact.model.agentconf.AgentsImpl;
import com.useit.jact.model.agentconf.Agentsconf;
import com.useit.jact.model.agentconf.AgentsconfImpl;
import com.useit.jact.model.agentconf.Agentsrecording;
import com.useit.jact.model.agentconf.AgentsrecordingImpl;
import com.useit.jact.model.agentconf.MMFagentconf;

/**
 * <p>
 * IOagentconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOagentconfTest.java,v 1.3 2006/01/12
 *          15:20:10 urs Exp $
 */
public class IOagentconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOagentconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOagentconfTest.class);
    }

    /*
     * @see
     */
    protected void setUp() throws Exception {
        super.setUp();
        session = HibernateUtil.getSessionFactory().openSession();

    }

    /*
     * @see
     */
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // public final void testAgentsLoadSaveXML() {
    // Agents Obj = createAgents();
    // MMFagentconf.getInstance().writeConfXML("temp/Agents.xml", Obj);
    // Object object =
    // MMFagentconf.getInstance().readConfXML("temp/Agents.xml");
    // assertEquals("load save XML Agents",true,checkAgents(Obj, object));
    // }
    public final void testAgentsconfLoadSaveXML() {
        Agentsconf Obj = createAgentsconf();
        MMFagentconf.getInstance().writeConfXML("temp/Agentsconf.xml", Obj);
        Object object = MMFagentconf.getInstance().readConfXML(
                "temp/Agentsconf.xml");
        assertEquals("load save XML Agentsconf", true, checkAgentsconf(Obj,
                object));
    }

    // public final void testAgentsrecordingLoadSaveXML() {
    // Agentsrecording Obj = createAgentsrecording();
    // MMFagentconf.getInstance().writeConfXML("temp/Agentsrecording.xml", Obj);
    // Object object =
    // MMFagentconf.getInstance().readConfXML("temp/Agentsrecording.xml");
    // assertEquals("load save XML
    // Agentsrecording",true,checkAgentsrecording(Obj, object));
    // }
    //	
    // public final void testAgentsloadSaveConf() {
    // Agents Obj = createAgents();
    // try{
    // MMFagentconf.getInstance().writetoFile(Obj,"temp/Agents.cfg");
    // Object object = MMFagentconf.getInstance().readConf(new
    // File("temp/Agents.cfg"));
    // assertEquals("load save conf Agents",true,checkAgents(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testAgentsloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testAgentsloadSaveConf()", e);
    // }
    // }
    public final void testAgentsconfloadSaveConf() {
        Agentsconf Obj = createAgentsconf();
        try {
            MMFagentconf.getInstance().writetoFile(Obj, "temp/Agentsconf.cfg");
            Object object = MMFagentconf.getInstance().readConf(
                    new File("temp/Agentsconf.cfg"));
            assertEquals("load save conf Agentsconf", true, checkAgentsconf(
                    Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testAgentsconfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testAgentsconfloadSaveConf()", e);
        }
    }

    // public final void testAgentsrecordingloadSaveConf() {
    // Agentsrecording Obj = createAgentsrecording();
    // try{
    // MMFagentconf.getInstance().writetoFile(Obj,"temp/Agentsrecording.cfg");
    // Object object = MMFagentconf.getInstance().readConf(new
    // File("temp/Agentsrecording.cfg"));
    // assertEquals("load save conf
    // Agentsrecording",true,checkAgentsrecording(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testAgentsrecordingloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testAgentsrecordingloadSaveConf()", e);
    // }
    // }
    //	
    public final void testAgentsLoadSaveHibernate() {
        Agents Obj = createAgents();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testAgentsLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(AgentsImpl.class, Obj.getId());
        assertEquals("load save Agents", Obj, object);

    }

    public final void testAgentsconfLoadSaveHibernate() {
        Agentsconf Obj = createAgentsconf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testAgentsconfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(AgentsconfImpl.class, Obj.getId());
        assertEquals("load save Agentsconf", Obj, object);

    }

    public final void testAgentsrecordingLoadSaveHibernate() {
        Agentsrecording Obj = createAgentsrecording();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testAgentsrecordingLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(AgentsrecordingImpl.class, Obj.getId());
        assertEquals("load save Agentsrecording", Obj, object);

    }

    /*
     * überprüft Agents
     */
    protected static boolean checkAgents(Agents org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Agents copy = null;
        if (obj instanceof Agents) {
            copy = (Agents) obj;

        } else {
            LOGGER.warn("checkAgents failed : cast " + org.getClass() + " : "
                    + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Agents.VALUEID_AGENTID).equals(
                copy.getByValue(Agents.VALUEID_AGENTID));
        if (!test)
            LOGGER.warn("checkAgents failed : AGENTID "
                    + org.getByValue(Agents.VALUEID_AGENTID) + " : "
                    + copy.getByValue(Agents.VALUEID_AGENTID));

        test = org.getByValue(Agents.VALUEID_AGENTPASSWORD).equals(
                copy.getByValue(Agents.VALUEID_AGENTPASSWORD));
        if (!test)
            LOGGER.warn("checkAgents failed : AGENTPASSWORD "
                    + org.getByValue(Agents.VALUEID_AGENTPASSWORD) + " : "
                    + copy.getByValue(Agents.VALUEID_AGENTPASSWORD));

        test = org.getByValue(Agents.VALUEID_NAME).equals(
                copy.getByValue(Agents.VALUEID_NAME));
        if (!test)
            LOGGER.warn("checkAgents failed : NAME "
                    + org.getByValue(Agents.VALUEID_NAME) + " : "
                    + copy.getByValue(Agents.VALUEID_NAME));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Agentsconf
     */
    protected static boolean checkAgentsconf(Agentsconf org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Agentsconf copy = null;
        if (obj instanceof Agentsconf) {
            copy = (Agentsconf) obj;

        } else {
            LOGGER.warn("checkAgentsconf failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Agentsconf.VALUEID_AUTOLOGOFF).equals(
                copy.getByValue(Agentsconf.VALUEID_AUTOLOGOFF));
        if (!test)
            LOGGER.warn("checkAgentsconf failed : AUTOLOGOFF "
                    + org.getByValue(Agentsconf.VALUEID_AUTOLOGOFF) + " : "
                    + copy.getByValue(Agentsconf.VALUEID_AUTOLOGOFF));

        test = org.getByValue(Agentsconf.VALUEID_ACKCALL).equals(
                copy.getByValue(Agentsconf.VALUEID_ACKCALL));
        if (!test)
            LOGGER.warn("checkAgentsconf failed : ACKCALL "
                    + org.getByValue(Agentsconf.VALUEID_ACKCALL) + " : "
                    + copy.getByValue(Agentsconf.VALUEID_ACKCALL));

        test = org.getByValue(Agentsconf.VALUEID_WRAPUPTIME).equals(
                copy.getByValue(Agentsconf.VALUEID_WRAPUPTIME));
        if (!test)
            LOGGER.warn("checkAgentsconf failed : WRAPUPTIME "
                    + org.getByValue(Agentsconf.VALUEID_WRAPUPTIME) + " : "
                    + copy.getByValue(Agentsconf.VALUEID_WRAPUPTIME));

        test = org.getByValue(Agentsconf.VALUEID_MUSIC_CLASS).equals(
                copy.getByValue(Agentsconf.VALUEID_MUSIC_CLASS));
        if (!test)
            LOGGER.warn("checkAgentsconf failed : MUSIC_CLASS "
                    + org.getByValue(Agentsconf.VALUEID_MUSIC_CLASS) + " : "
                    + copy.getByValue(Agentsconf.VALUEID_MUSIC_CLASS));

        test = org.getByValue(Agentsconf.VALUEID_CUSTOM_BEEP).equals(
                copy.getByValue(Agentsconf.VALUEID_CUSTOM_BEEP));
        if (!test)
            LOGGER.warn("checkAgentsconf failed : CUSTOM_BEEP "
                    + org.getByValue(Agentsconf.VALUEID_CUSTOM_BEEP) + " : "
                    + copy.getByValue(Agentsconf.VALUEID_CUSTOM_BEEP));

        test = org.getByValue(Agentsconf.VALUEID_GROUP).equals(
                copy.getByValue(Agentsconf.VALUEID_GROUP));
        if (!test)
            LOGGER.warn("checkAgentsconf failed : GROUP "
                    + org.getByValue(Agentsconf.VALUEID_GROUP) + " : "
                    + copy.getByValue(Agentsconf.VALUEID_GROUP));

        // ---------------agg
        test = checkAgentsrecording(org.getAgentsrecording(), copy
                .getAgentsrecording());
        if (!test)
            LOGGER.warn("checkAgentsconf failed : agentsrecording "
                    + org.toString() + " : " + copy.toString());
        // -----------------map
        test = org.getAgentsMap().size() == copy.getAgentsMap().size();

        if (!test) {
            LOGGER.warn("checkAgentsconf failed : agentsMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getAgentsMap().size(); i++) {
            test = checkAgents(org.getAgentsMap().get(i), copy.getAgentsMap()
                    .get(i));

            if (!test) {
                LOGGER.warn("checkAgentsconf failed : agentsMap  equals " + i
                        + " " + org.getAgentsMap().get(i) + " : "
                        + copy.getAgentsMap().get(i));
                return test;
            }
        }// end of for i to org.getAgentsMap()

        // newAgentsconf.addAgents(createAgents());
        return test;
    }

    /*
     * überprüft Agentsrecording
     */
    protected static boolean checkAgentsrecording(Agentsrecording org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Agentsrecording copy = null;
        if (obj instanceof Agentsrecording) {
            copy = (Agentsrecording) obj;

        } else {
            LOGGER.warn("checkAgentsrecording failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Agentsrecording.VALUEID_RECORDAGENTCALLS).equals(
                copy.getByValue(Agentsrecording.VALUEID_RECORDAGENTCALLS));
        if (!test)
            LOGGER
                    .warn("checkAgentsrecording failed : RECORDAGENTCALLS "
                            + org
                                    .getByValue(Agentsrecording.VALUEID_RECORDAGENTCALLS)
                            + " : "
                            + copy
                                    .getByValue(Agentsrecording.VALUEID_RECORDAGENTCALLS));

        test = org.getByValue(Agentsrecording.VALUEID_RECORDFORMAT).equals(
                copy.getByValue(Agentsrecording.VALUEID_RECORDFORMAT));
        if (!test)
            LOGGER.warn("checkAgentsrecording failed : RECORDFORMAT "
                    + org.getByValue(Agentsrecording.VALUEID_RECORDFORMAT)
                    + " : "
                    + copy.getByValue(Agentsrecording.VALUEID_RECORDFORMAT));

        test = org.getByValue(Agentsrecording.VALUEID_CREATELINK).equals(
                copy.getByValue(Agentsrecording.VALUEID_CREATELINK));
        if (!test)
            LOGGER.warn("checkAgentsrecording failed : CREATELINK "
                    + org.getByValue(Agentsrecording.VALUEID_CREATELINK)
                    + " : "
                    + copy.getByValue(Agentsrecording.VALUEID_CREATELINK));

        test = org.getByValue(Agentsrecording.VALUEID_URLPREFIX).equals(
                copy.getByValue(Agentsrecording.VALUEID_URLPREFIX));
        if (!test)
            LOGGER.warn("checkAgentsrecording failed : URLPREFIX "
                    + org.getByValue(Agentsrecording.VALUEID_URLPREFIX) + " : "
                    + copy.getByValue(Agentsrecording.VALUEID_URLPREFIX));

        test = org.getByValue(Agentsrecording.VALUEID_SAVECALLSIN).equals(
                copy.getByValue(Agentsrecording.VALUEID_SAVECALLSIN));
        if (!test)
            LOGGER.warn("checkAgentsrecording failed : SAVECALLSIN "
                    + org.getByValue(Agentsrecording.VALUEID_SAVECALLSIN)
                    + " : "
                    + copy.getByValue(Agentsrecording.VALUEID_SAVECALLSIN));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * erzeugt und initalisiert Agents
     */
    protected static Agents createAgents() {
        Agents newAgents = new AgentsImpl();
        // fields
        newAgents.setByValue(Agents.VALUEID_AGENTID, "AGENTID");
        newAgents.setByValue(Agents.VALUEID_AGENTPASSWORD, "AGENTPASSWORD");
        newAgents.setByValue(Agents.VALUEID_NAME, "NAME");
        // agg
        // map
        return newAgents;
    }

    /*
     * erzeugt und initalisiert Agentsconf
     */
    protected static Agentsconf createAgentsconf() {
        Agentsconf newAgentsconf = new AgentsconfImpl();
        // fields
        newAgentsconf.setByValue(Agentsconf.VALUEID_AUTOLOGOFF, "AUTOLOGOFF");
        newAgentsconf.setByValue(Agentsconf.VALUEID_ACKCALL, "ACKCALL");
        newAgentsconf.setByValue(Agentsconf.VALUEID_WRAPUPTIME, "WRAPUPTIME");
        newAgentsconf.setByValue(Agentsconf.VALUEID_MUSIC_CLASS, "MUSIC_CLASS");
        newAgentsconf.setByValue(Agentsconf.VALUEID_CUSTOM_BEEP, "CUSTOM_BEEP");
        newAgentsconf.setByValue(Agentsconf.VALUEID_GROUP, "GROUP");
        // agg
        newAgentsconf.setAgentsrecording(createAgentsrecording());
        // map
        newAgentsconf.addAgents(createAgents());
        return newAgentsconf;
    }

    /*
     * erzeugt und initalisiert Agentsrecording
     */
    protected static Agentsrecording createAgentsrecording() {
        Agentsrecording newAgentsrecording = new AgentsrecordingImpl();
        // fields
        newAgentsrecording.setByValue(Agentsrecording.VALUEID_RECORDAGENTCALLS,
                Boolean.TRUE);
        newAgentsrecording.setByValue(Agentsrecording.VALUEID_RECORDFORMAT,
                "RECORDFORMAT");
        newAgentsrecording.setByValue(Agentsrecording.VALUEID_CREATELINK,
                "CREATELINK");
        newAgentsrecording.setByValue(Agentsrecording.VALUEID_URLPREFIX,
                "URLPREFIX");
        newAgentsrecording.setByValue(Agentsrecording.VALUEID_SAVECALLSIN,
                "SAVECALLSIN");
        // agg
        // map
        return newAgentsrecording;
    }

}
