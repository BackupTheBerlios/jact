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
import com.useit.jact.model.queueconf.MMFqueueconf;
import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.QueuegeneralImpl;
import com.useit.jact.model.queueconf.Queuemember;
import com.useit.jact.model.queueconf.QueuememberImpl;
import com.useit.jact.model.queueconf.Queuesection;
import com.useit.jact.model.queueconf.QueuesectionImpl;
import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * IOqueueconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOqueueconfTest.java,v 1.4 2006/01/14
 *          15:44:47 urs Exp $
 */
public class IOqueueconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOqueueconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOqueueconfTest.class);
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

    public final void testQueuegeneralLoadSaveXML() {
        Queuegeneral Obj = createQueuegeneral();
        MMFqueueconf.getInstance().writeConfXML("temp/Queuegeneral.xml", Obj);
        Object object = MMFqueueconf.getInstance().readConfXML(
                "temp/Queuegeneral.xml");
        assertEquals("load save XML Queuegeneral", true, checkQueuegeneral(Obj,
                object));
    }

    // public final void testQueuesectionLoadSaveXML() {
    // Queuesection Obj = createQueuesection();
    // MMFqueueconf.getInstance().writeConfXML("temp/Queuesection.xml", Obj);
    // Object object =
    // MMFqueueconf.getInstance().readConfXML("temp/Queuesection.xml");
    // assertEquals("load save XML Queuesection",true,checkQueuesection(Obj,
    // object));
    // }
    // public final void testQueuememberLoadSaveXML() {
    // Queuemember Obj = createQueuemember();
    // MMFqueueconf.getInstance().writeConfXML("temp/Queuemember.xml", Obj);
    // Object object =
    // MMFqueueconf.getInstance().readConfXML("temp/Queuemember.xml");
    // assertEquals("load save XML Queuemember",true,checkQueuemember(Obj,
    // object));
    // }
    //	
    public final void testQueuegeneralloadSaveConf() {
        Queuegeneral Obj = createQueuegeneral();
        try {
            MMFqueueconf.getInstance()
                    .writetoFile(Obj, "temp/Queuegeneral.cfg");
            Object object = MMFqueueconf.getInstance().readConf(
                    new File("temp/Queuegeneral.cfg"));
            assertEquals("load save conf Queuegeneral", true,
                    checkQueuegeneral(Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testQueuegeneralloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testQueuegeneralloadSaveConf()", e);
        }
    }

    // public final void testQueuesectionloadSaveConf() {
    // Queuesection Obj = createQueuesection();
    // try{
    // MMFqueueconf.getInstance().writetoFile(Obj,"temp/Queuesection.cfg");
    // Object object = MMFqueueconf.getInstance().readConf(new
    // File("temp/Queuesection.cfg"));
    // assertEquals("load save conf
    // Queuesection",true,checkQueuesection(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testQueuesectionloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testQueuesectionloadSaveConf()", e);
    // }
    // }
    // public final void testQueuememberloadSaveConf() {
    // Queuemember Obj = createQueuemember();
    // try{
    // MMFqueueconf.getInstance().writetoFile(Obj,"temp/Queuemember.cfg");
    // Object object = MMFqueueconf.getInstance().readConf(new
    // File("temp/Queuemember.cfg"));
    // assertEquals("load save conf
    // Queuemember",true,checkQueuemember(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testQueuememberloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testQueuememberloadSaveConf()", e);
    // }
    // }
    //	
    public final void testQueuegeneralLoadSaveHibernate() {
        Queuegeneral Obj = createQueuegeneral();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testQueuegeneralLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(QueuegeneralImpl.class, Obj.getId());
        assertEquals("load save Queuegeneral", Obj, object);

    }

    public final void testQueuesectionLoadSaveHibernate() {
        Queuesection Obj = createQueuesection();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testQueuesectionLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(QueuesectionImpl.class, Obj.getId());
        assertEquals("load save Queuesection", Obj, object);

    }

    public final void testQueuememberLoadSaveHibernate() {
        Queuemember Obj = createQueuemember();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testQueuememberLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(QueuememberImpl.class, Obj.getId());
        assertEquals("load save Queuemember", Obj, object);

    }

    /*
     * überprüft Queuegeneral
     */
    protected static boolean checkQueuegeneral(Queuegeneral org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Queuegeneral copy = null;
        if (obj instanceof Queuegeneral) {
            copy = (Queuegeneral) obj;

        } else {
            LOGGER.warn("checkQueuegeneral failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Queuegeneral.VALUEID_PERSISTENTMEMBERS).equals(
                copy.getByValue(Queuegeneral.VALUEID_PERSISTENTMEMBERS));
        if (!test)
            LOGGER.warn("checkQueuegeneral failed : PERSISTENTMEMBERS "
                    + org.getByValue(Queuegeneral.VALUEID_PERSISTENTMEMBERS)
                    + " : "
                    + copy.getByValue(Queuegeneral.VALUEID_PERSISTENTMEMBERS));

        // ---------------agg
        // -----------------map
        test = org.getQueuesectionMap().size() == copy.getQueuesectionMap()
                .size();

        if (!test) {
            LOGGER.warn("checkQueuegeneral failed : queuesectionMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getQueuesectionMap().size(); i++) {
            test = checkQueuesection(org.getQueuesectionMap().get(i), copy
                    .getQueuesectionMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkQueuegeneral failed : queuesectionMap  equals "
                                + i
                                + " "
                                + org.getQueuesectionMap().get(i)
                                + " : " + copy.getQueuesectionMap().get(i));
                return test;
            }
        }// end of for i to org.getQueuesectionMap()

        // newQueuegeneral.addQueuesection(createQueuesection());
        return test;
    }

    /*
     * überprüft Queuesection
     */
    protected static boolean checkQueuesection(Queuesection org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Queuesection copy = null;
        if (obj instanceof Queuesection) {
            copy = (Queuesection) obj;

        } else {
            LOGGER.warn("checkQueuesection failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Queuesection.VALUEID_SECTIONNAME).equals(
                copy.getByValue(Queuesection.VALUEID_SECTIONNAME));
        if (!test)
            LOGGER.warn("checkQueuesection failed : SECTIONNAME "
                    + org.getByValue(Queuesection.VALUEID_SECTIONNAME) + " : "
                    + copy.getByValue(Queuesection.VALUEID_SECTIONNAME));

        test = org.getByValue(Queuesection.VALUEID_MUSICONHOLD).equals(
                copy.getByValue(Queuesection.VALUEID_MUSICONHOLD));
        if (!test)
            LOGGER.warn("checkQueuesection failed : MUSICONHOLD "
                    + org.getByValue(Queuesection.VALUEID_MUSICONHOLD) + " : "
                    + copy.getByValue(Queuesection.VALUEID_MUSICONHOLD));

        test = org.getByValue(Queuesection.VALUEID_ANNOUNCE).equals(
                copy.getByValue(Queuesection.VALUEID_ANNOUNCE));
        if (!test)
            LOGGER.warn("checkQueuesection failed : ANNOUNCE "
                    + org.getByValue(Queuesection.VALUEID_ANNOUNCE) + " : "
                    + copy.getByValue(Queuesection.VALUEID_ANNOUNCE));

        test = org.getByValue(Queuesection.VALUEID_STRATEGY).equals(
                copy.getByValue(Queuesection.VALUEID_STRATEGY));
        if (!test)
            LOGGER.warn("checkQueuesection failed : STRATEGY "
                    + org.getByValue(Queuesection.VALUEID_STRATEGY) + " : "
                    + copy.getByValue(Queuesection.VALUEID_STRATEGY));

        test = org.getByValue(Queuesection.VALUEID_SERVICELEVEL).equals(
                copy.getByValue(Queuesection.VALUEID_SERVICELEVEL));
        if (!test)
            LOGGER.warn("checkQueuesection failed : SERVICELEVEL "
                    + org.getByValue(Queuesection.VALUEID_SERVICELEVEL) + " : "
                    + copy.getByValue(Queuesection.VALUEID_SERVICELEVEL));

        test = org.getByValue(Queuesection.VALUEID_CONTEXT).equals(
                copy.getByValue(Queuesection.VALUEID_CONTEXT));
        if (!test)
            LOGGER.warn("checkQueuesection failed : CONTEXT "
                    + org.getByValue(Queuesection.VALUEID_CONTEXT) + " : "
                    + copy.getByValue(Queuesection.VALUEID_CONTEXT));

        test = org.getByValue(Queuesection.VALUEID_TIMEOUT).equals(
                copy.getByValue(Queuesection.VALUEID_TIMEOUT));
        if (!test)
            LOGGER.warn("checkQueuesection failed : TIMEOUT "
                    + org.getByValue(Queuesection.VALUEID_TIMEOUT) + " : "
                    + copy.getByValue(Queuesection.VALUEID_TIMEOUT));

        test = org.getByValue(Queuesection.VALUEID_RETRY).equals(
                copy.getByValue(Queuesection.VALUEID_RETRY));
        if (!test)
            LOGGER.warn("checkQueuesection failed : RETRY "
                    + org.getByValue(Queuesection.VALUEID_RETRY) + " : "
                    + copy.getByValue(Queuesection.VALUEID_RETRY));

        test = org.getByValue(Queuesection.VALUEID_WEIGHT).equals(
                copy.getByValue(Queuesection.VALUEID_WEIGHT));
        if (!test)
            LOGGER.warn("checkQueuesection failed : WEIGHT "
                    + org.getByValue(Queuesection.VALUEID_WEIGHT) + " : "
                    + copy.getByValue(Queuesection.VALUEID_WEIGHT));

        test = org.getByValue(Queuesection.VALUEID_WRAPUPTIME).equals(
                copy.getByValue(Queuesection.VALUEID_WRAPUPTIME));
        if (!test)
            LOGGER.warn("checkQueuesection failed : WRAPUPTIME "
                    + org.getByValue(Queuesection.VALUEID_WRAPUPTIME) + " : "
                    + copy.getByValue(Queuesection.VALUEID_WRAPUPTIME));

        test = org.getByValue(Queuesection.VALUEID_MAXLEN).equals(
                copy.getByValue(Queuesection.VALUEID_MAXLEN));
        if (!test)
            LOGGER.warn("checkQueuesection failed : MAXLEN "
                    + org.getByValue(Queuesection.VALUEID_MAXLEN) + " : "
                    + copy.getByValue(Queuesection.VALUEID_MAXLEN));

        test = org.getByValue(Queuesection.VALUEID_ANNOUNCEFREQUENCY).equals(
                copy.getByValue(Queuesection.VALUEID_ANNOUNCEFREQUENCY));
        if (!test)
            LOGGER.warn("checkQueuesection failed : ANNOUNCEFREQUENCY "
                    + org.getByValue(Queuesection.VALUEID_ANNOUNCEFREQUENCY)
                    + " : "
                    + copy.getByValue(Queuesection.VALUEID_ANNOUNCEFREQUENCY));

        test = org.getByValue(Queuesection.VALUEID_ANNOUNCEHOLDTIME).equals(
                copy.getByValue(Queuesection.VALUEID_ANNOUNCEHOLDTIME));
        if (!test)
            LOGGER.warn("checkQueuesection failed : ANNOUNCEHOLDTIME "
                    + org.getByValue(Queuesection.VALUEID_ANNOUNCEHOLDTIME)
                    + " : "
                    + copy.getByValue(Queuesection.VALUEID_ANNOUNCEHOLDTIME));

        test = org
                .getByValue(Queuesection.VALUEID_ANNOUNCEROUNDSECONDS)
                .equals(
                        copy
                                .getByValue(Queuesection.VALUEID_ANNOUNCEROUNDSECONDS));
        if (!test)
            LOGGER
                    .warn("checkQueuesection failed : ANNOUNCEROUNDSECONDS "
                            + org
                                    .getByValue(Queuesection.VALUEID_ANNOUNCEROUNDSECONDS)
                            + " : "
                            + copy
                                    .getByValue(Queuesection.VALUEID_ANNOUNCEROUNDSECONDS));

        test = org.getByValue(Queuesection.VALUEID_MONITORFORMAT).equals(
                copy.getByValue(Queuesection.VALUEID_MONITORFORMAT));
        if (!test)
            LOGGER.warn("checkQueuesection failed : MONITORFORMAT "
                    + org.getByValue(Queuesection.VALUEID_MONITORFORMAT)
                    + " : "
                    + copy.getByValue(Queuesection.VALUEID_MONITORFORMAT));

        test = org.getByValue(Queuesection.VALUEID_MONITORJOIN).equals(
                copy.getByValue(Queuesection.VALUEID_MONITORJOIN));
        if (!test)
            LOGGER.warn("checkQueuesection failed : MONITORJOIN "
                    + org.getByValue(Queuesection.VALUEID_MONITORJOIN) + " : "
                    + copy.getByValue(Queuesection.VALUEID_MONITORJOIN));

        test = org.getByValue(Queuesection.VALUEID_JOINEMPTY).equals(
                copy.getByValue(Queuesection.VALUEID_JOINEMPTY));
        if (!test)
            LOGGER.warn("checkQueuesection failed : JOINEMPTY "
                    + org.getByValue(Queuesection.VALUEID_JOINEMPTY) + " : "
                    + copy.getByValue(Queuesection.VALUEID_JOINEMPTY));

        test = org.getByValue(Queuesection.VALUEID_LEAVEWHENEMPTY).equals(
                copy.getByValue(Queuesection.VALUEID_LEAVEWHENEMPTY));
        if (!test)
            LOGGER.warn("checkQueuesection failed : LEAVEWHENEMPTY "
                    + org.getByValue(Queuesection.VALUEID_LEAVEWHENEMPTY)
                    + " : "
                    + copy.getByValue(Queuesection.VALUEID_LEAVEWHENEMPTY));

        test = org.getByValue(Queuesection.VALUEID_EVENTWHENCALLED).equals(
                copy.getByValue(Queuesection.VALUEID_EVENTWHENCALLED));
        if (!test)
            LOGGER.warn("checkQueuesection failed : EVENTWHENCALLED "
                    + org.getByValue(Queuesection.VALUEID_EVENTWHENCALLED)
                    + " : "
                    + copy.getByValue(Queuesection.VALUEID_EVENTWHENCALLED));

        test = org
                .getByValue(Queuesection.VALUEID_EVENTMEMBERSTATUSOFF)
                .equals(
                        copy
                                .getByValue(Queuesection.VALUEID_EVENTMEMBERSTATUSOFF));
        if (!test)
            LOGGER
                    .warn("checkQueuesection failed : EVENTMEMBERSTATUSOFF "
                            + org
                                    .getByValue(Queuesection.VALUEID_EVENTMEMBERSTATUSOFF)
                            + " : "
                            + copy
                                    .getByValue(Queuesection.VALUEID_EVENTMEMBERSTATUSOFF));

        test = org.getByValue(Queuesection.VALUEID_REPORTHOLDTIME).equals(
                copy.getByValue(Queuesection.VALUEID_REPORTHOLDTIME));
        if (!test)
            LOGGER.warn("checkQueuesection failed : REPORTHOLDTIME "
                    + org.getByValue(Queuesection.VALUEID_REPORTHOLDTIME)
                    + " : "
                    + copy.getByValue(Queuesection.VALUEID_REPORTHOLDTIME));

        test = org.getByValue(Queuesection.VALUEID_MEMBERDELAY).equals(
                copy.getByValue(Queuesection.VALUEID_MEMBERDELAY));
        if (!test)
            LOGGER.warn("checkQueuesection failed : MEMBERDELAY "
                    + org.getByValue(Queuesection.VALUEID_MEMBERDELAY) + " : "
                    + copy.getByValue(Queuesection.VALUEID_MEMBERDELAY));

        test = org.getByValue(Queuesection.VALUEID_TIMEOUTRESTART).equals(
                copy.getByValue(Queuesection.VALUEID_TIMEOUTRESTART));
        if (!test)
            LOGGER.warn("checkQueuesection failed : TIMEOUTRESTART "
                    + org.getByValue(Queuesection.VALUEID_TIMEOUTRESTART)
                    + " : "
                    + copy.getByValue(Queuesection.VALUEID_TIMEOUTRESTART));

        // ---------------agg
        // -----------------map
        test = org.getQueuememberMap().size() == copy.getQueuememberMap()
                .size();

        if (!test) {
            LOGGER.warn("checkQueuesection failed : queuememberMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getQueuememberMap().size(); i++) {
            test = checkQueuemember(org.getQueuememberMap().get(i), copy
                    .getQueuememberMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkQueuesection failed : queuememberMap  equals "
                                + i
                                + " "
                                + org.getQueuememberMap().get(i)
                                + " : " + copy.getQueuememberMap().get(i));
                return test;
            }
        }// end of for i to org.getQueuememberMap()

        // newQueuesection.addQueuemember(createQueuemember());
        return test;
    }

    /*
     * überprüft Queuemember
     */
    protected static boolean checkQueuemember(Queuemember org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Queuemember copy = null;
        if (obj instanceof Queuemember) {
            copy = (Queuemember) obj;

        } else {
            LOGGER.warn("checkQueuemember failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Queuemember.VALUEID_TECH).equals(
                copy.getByValue(Queuemember.VALUEID_TECH));
        if (!test)
            LOGGER.warn("checkQueuemember failed : TECH "
                    + org.getByValue(Queuemember.VALUEID_TECH) + " : "
                    + copy.getByValue(Queuemember.VALUEID_TECH));

        test = org.getByValue(Queuemember.VALUEID_DIALSTRING).equals(
                copy.getByValue(Queuemember.VALUEID_DIALSTRING));
        if (!test)
            LOGGER.warn("checkQueuemember failed : DIALSTRING "
                    + org.getByValue(Queuemember.VALUEID_DIALSTRING) + " : "
                    + copy.getByValue(Queuemember.VALUEID_DIALSTRING));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * erzeugt und initalisiert Queuegeneral
     */
    protected static Queuegeneral createQueuegeneral() {
        Queuegeneral newQueuegeneral = new QueuegeneralImpl();
        // fields
        newQueuegeneral.setByValue(Queuegeneral.VALUEID_PERSISTENTMEMBERS,
                Boolean.TRUE);
        // agg
        // map
        newQueuegeneral.addQueuesection(createQueuesection());
        return newQueuegeneral;
    }

    /*
     * erzeugt und initalisiert Queuesection
     */
    protected static Queuesection createQueuesection() {
        Queuesection newQueuesection = new QueuesectionImpl();
        // fields
        newQueuesection.setByValue(Queuesection.VALUEID_SECTIONNAME,
                "SECTIONNAME");
        newQueuesection.setByValue(Queuesection.VALUEID_MUSICONHOLD,
                "MUSICONHOLD");
        newQueuesection.setByValue(Queuesection.VALUEID_ANNOUNCE, "ANNOUNCE");
        newQueuesection.setByValue(Queuesection.VALUEID_STRATEGY, "STRATEGY");
        newQueuesection.setByValue(Queuesection.VALUEID_SERVICELEVEL, Integer
                .valueOf(0));
        newQueuesection.setByValue(Queuesection.VALUEID_CONTEXT,
                new PbxContext(""));
        newQueuesection.setByValue(Queuesection.VALUEID_TIMEOUT, Integer
                .valueOf(0));
        newQueuesection.setByValue(Queuesection.VALUEID_RETRY, Integer
                .valueOf(0));
        newQueuesection.setByValue(Queuesection.VALUEID_WEIGHT, "WEIGHT");
        newQueuesection.setByValue(Queuesection.VALUEID_WRAPUPTIME, Integer
                .valueOf(0));
        newQueuesection.setByValue(Queuesection.VALUEID_MAXLEN, Integer
                .valueOf(0));
        newQueuesection.setByValue(Queuesection.VALUEID_ANNOUNCEFREQUENCY,
                Integer.valueOf(0));
        newQueuesection.setByValue(Queuesection.VALUEID_ANNOUNCEHOLDTIME,
                Boolean.TRUE);
        newQueuesection.setByValue(Queuesection.VALUEID_ANNOUNCEROUNDSECONDS,
                "ANNOUNCEROUNDSECONDS");
        newQueuesection.setByValue(Queuesection.VALUEID_MONITORFORMAT,
                "MONITORFORMAT");
        newQueuesection.setByValue(Queuesection.VALUEID_MONITORJOIN,
                Boolean.TRUE);
        newQueuesection.setByValue(Queuesection.VALUEID_JOINEMPTY, "JOINEMPTY");
        newQueuesection.setByValue(Queuesection.VALUEID_LEAVEWHENEMPTY,
                "LEAVEWHENEMPTY");
        newQueuesection.setByValue(Queuesection.VALUEID_EVENTWHENCALLED,
                Boolean.TRUE);
        newQueuesection.setByValue(Queuesection.VALUEID_EVENTMEMBERSTATUSOFF,
                Boolean.TRUE);
        newQueuesection.setByValue(Queuesection.VALUEID_REPORTHOLDTIME,
                Boolean.TRUE);
        newQueuesection.setByValue(Queuesection.VALUEID_MEMBERDELAY, Integer
                .valueOf(0));
        newQueuesection.setByValue(Queuesection.VALUEID_TIMEOUTRESTART,
                Boolean.TRUE);
        // agg
        // map
        newQueuesection.addQueuemember(createQueuemember());
        return newQueuesection;
    }

    /*
     * erzeugt und initalisiert Queuemember
     */
    protected static Queuemember createQueuemember() {
        Queuemember newQueuemember = new QueuememberImpl();
        // fields
        newQueuemember.setByValue(Queuemember.VALUEID_TECH, "TECH");
        newQueuemember.setByValue(Queuemember.VALUEID_DIALSTRING, "DIALSTRING");
        // agg
        // map
        return newQueuemember;
    }

}
