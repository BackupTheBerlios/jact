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
import com.useit.jact.model.meetmeconf.MMFmeetmeconf;
import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.MeetmeconfImpl;
import com.useit.jact.model.meetmeconf.Meetmerooms;
import com.useit.jact.model.meetmeconf.MeetmeroomsImpl;

/**
 * <p>
 * IOmeetmeconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOmeetmeconfTest.java,v 1.4 2006/01/12
 *          19:44:45 urs Exp $
 */
public class IOmeetmeconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOmeetmeconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOmeetmeconfTest.class);
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

    public final void testMeetmeconfLoadSaveXML() {
        Meetmeconf Obj = createMeetmeconf();
        MMFmeetmeconf.getInstance().writeConfXML("temp/Meetmeconf.xml", Obj);
        Object object = MMFmeetmeconf.getInstance().readConfXML(
                "temp/Meetmeconf.xml");
        assertEquals("load save XML Meetmeconf", true, checkMeetmeconf(Obj,
                object));
    }

    public final void testMeetmeconfloadSaveConf() {
        Meetmeconf Obj = createMeetmeconf();
        try {
            MMFmeetmeconf.getInstance().writetoFile(Obj, "temp/Meetmeconf.cfg");
            Object object = MMFmeetmeconf.getInstance().readConf(
                    new File("temp/Meetmeconf.cfg"));
            assertEquals("load save conf Meetmeconf", true, checkMeetmeconf(
                    Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testMeetmeconfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testMeetmeconfloadSaveConf()", e);
        }
    }

    // public final void testMeetmeroomsloadSaveConf() {
    // Meetmerooms Obj = createMeetmerooms();
    // try{
    // MMFmeetmeconf.getInstance().writetoFile(Obj,"temp/Meetmerooms.cfg");
    // Object object = MMFmeetmeconf.getInstance().readConf(new
    // File("temp/Meetmerooms.cfg"));
    // assertEquals("load save conf
    // Meetmerooms",true,checkMeetmerooms(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testMeetmeroomsloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testMeetmeroomsloadSaveConf()", e);
    // }
    // }

    public final void testMeetmeconfLoadSaveHibernate() {
        Meetmeconf Obj = createMeetmeconf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMeetmeconfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(MeetmeconfImpl.class, Obj.getId());
        assertEquals("load save Meetmeconf", Obj, object);

    }

    public final void testMeetmeroomsLoadSaveHibernate() {
        Meetmerooms Obj = createMeetmerooms();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMeetmeroomsLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(MeetmeroomsImpl.class, Obj.getId());
        assertEquals("load save Meetmerooms", Obj, object);

    }

    /*
     * überprüft Meetmeconf
     */
    protected static boolean checkMeetmeconf(Meetmeconf org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Meetmeconf copy = null;
        if (obj instanceof Meetmeconf) {
            copy = (Meetmeconf) obj;

        } else {
            LOGGER.warn("checkMeetmeconf failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Meetmeconf.VALUEID_FILEID).equals(
                copy.getByValue(Meetmeconf.VALUEID_FILEID));
        if (!test)
            LOGGER.warn("checkMeetmeconf failed : FILEID "
                    + org.getByValue(Meetmeconf.VALUEID_FILEID) + " : "
                    + copy.getByValue(Meetmeconf.VALUEID_FILEID));

        // ---------------agg
        // -----------------map
        test = org.getMeetmeroomsMap().size() == copy.getMeetmeroomsMap()
                .size();

        if (!test) {
            LOGGER.warn("checkMeetmeconf failed : meetmeroomsMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getMeetmeroomsMap().size(); i++) {
            test = checkMeetmerooms(org.getMeetmeroomsMap().get(i), copy
                    .getMeetmeroomsMap().get(i));

            if (!test) {
                LOGGER.warn("checkMeetmeconf failed : meetmeroomsMap  equals "
                        + i + " " + org.getMeetmeroomsMap().get(i) + " : "
                        + copy.getMeetmeroomsMap().get(i));
                return test;
            }
        }// end of for i to org.getMeetmeroomsMap()

        // newMeetmeconf.addMeetmerooms(createMeetmerooms());
        return test;
    }

    /*
     * überprüft Meetmerooms
     */
    protected static boolean checkMeetmerooms(Meetmerooms org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Meetmerooms copy = null;
        if (obj instanceof Meetmerooms) {
            copy = (Meetmerooms) obj;

        } else {
            LOGGER.warn("checkMeetmerooms failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Meetmerooms.VALUEID_CONFNO).equals(
                copy.getByValue(Meetmerooms.VALUEID_CONFNO));
        if (!test)
            LOGGER.warn("checkMeetmerooms failed : CONFNO "
                    + org.getByValue(Meetmerooms.VALUEID_CONFNO) + " : "
                    + copy.getByValue(Meetmerooms.VALUEID_CONFNO));

        test = org.getByValue(Meetmerooms.VALUEID_PINCODE).equals(
                copy.getByValue(Meetmerooms.VALUEID_PINCODE));
        if (!test)
            LOGGER.warn("checkMeetmerooms failed : PINCODE "
                    + org.getByValue(Meetmerooms.VALUEID_PINCODE) + " : "
                    + copy.getByValue(Meetmerooms.VALUEID_PINCODE));

        test = org.getByValue(Meetmerooms.VALUEID_ADMINPIN).equals(
                copy.getByValue(Meetmerooms.VALUEID_ADMINPIN));
        if (!test)
            LOGGER.warn("checkMeetmerooms failed : ADMINPIN "
                    + org.getByValue(Meetmerooms.VALUEID_ADMINPIN) + " : "
                    + copy.getByValue(Meetmerooms.VALUEID_ADMINPIN));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * erzeugt und initalisiert Meetmeconf
     */
    protected static Meetmeconf createMeetmeconf() {
        Meetmeconf newMeetmeconf = new MeetmeconfImpl();
        // fields
        newMeetmeconf.setByValue(Meetmeconf.VALUEID_FILEID, "FILEID");
        // agg
        // map
        newMeetmeconf.addMeetmerooms(createMeetmerooms());
        return newMeetmeconf;
    }

    /*
     * erzeugt und initalisiert Meetmerooms
     */
    protected static Meetmerooms createMeetmerooms() {
        Meetmerooms newMeetmerooms = new MeetmeroomsImpl();
        // fields
        newMeetmerooms.setByValue(Meetmerooms.VALUEID_CONFNO, "CONFNO");
        newMeetmerooms.setByValue(Meetmerooms.VALUEID_PINCODE, "PINCODE");
        newMeetmerooms.setByValue(Meetmerooms.VALUEID_ADMINPIN, "ADMINPIN");
        // agg
        // map
        return newMeetmerooms;
    }

}
