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
import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;
import com.useit.jact.model.alarmreciverconf.AlarmreceiverconfImpl;
import com.useit.jact.model.alarmreciverconf.MMFalarmreciverconf;

/**
 * <p>
 * IOalarmreciverconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOalarmreciverconfTest.java,v 1.3 2006/01/12
 *          15:20:10 urs Exp $
 */
public class IOalarmreciverconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOalarmreciverconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOalarmreciverconfTest.class);
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

    public final void testAlarmreceiverconfLoadSaveXML() {
        Alarmreceiverconf Obj = createAlarmreceiverconf();
        MMFalarmreciverconf.getInstance().writeConfXML(
                "temp/Alarmreceiverconf.xml", Obj);
        Object object = MMFalarmreciverconf.getInstance().readConfXML(
                "temp/Alarmreceiverconf.xml");
        assertEquals("load save XML Alarmreceiverconf", true,
                checkAlarmreceiverconf(Obj, object));
    }

    public final void testAlarmreceiverconfloadSaveConf() {
        Alarmreceiverconf Obj = createAlarmreceiverconf();
        try {
            MMFalarmreciverconf.getInstance().writetoFile(Obj,
                    "temp/Alarmreceiverconf.cfg");
            Object object = MMFalarmreciverconf.getInstance().readConf(
                    new File("temp/Alarmreceiverconf.cfg"));
            assertEquals("load save conf Alarmreceiverconf", true,
                    checkAlarmreceiverconf(Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testAlarmreceiverconfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testAlarmreceiverconfloadSaveConf()", e);
        }
    }

    public final void testAlarmreceiverconfLoadSaveHibernate() {
        Alarmreceiverconf Obj = createAlarmreceiverconf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testAlarmreceiverconfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(AlarmreceiverconfImpl.class, Obj.getId());
        assertEquals("load save Alarmreceiverconf", Obj, object);

    }

    /*
     * überprüft Alarmreceiverconf
     */
    protected static boolean checkAlarmreceiverconf(Alarmreceiverconf org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Alarmreceiverconf copy = null;
        if (obj instanceof Alarmreceiverconf) {
            copy = (Alarmreceiverconf) obj;

        } else {
            LOGGER.warn("checkAlarmreceiverconf failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org
                .getByValue(Alarmreceiverconf.VALUEID_TIMESTAMPFORMAT)
                .equals(
                        copy
                                .getByValue(Alarmreceiverconf.VALUEID_TIMESTAMPFORMAT));
        if (!test)
            LOGGER
                    .warn("checkAlarmreceiverconf failed : TIMESTAMPFORMAT "
                            + org
                                    .getByValue(Alarmreceiverconf.VALUEID_TIMESTAMPFORMAT)
                            + " : "
                            + copy
                                    .getByValue(Alarmreceiverconf.VALUEID_TIMESTAMPFORMAT));

        test = org.getByValue(Alarmreceiverconf.VALUEID_EVENTCMD).equals(
                copy.getByValue(Alarmreceiverconf.VALUEID_EVENTCMD));
        if (!test)
            LOGGER.warn("checkAlarmreceiverconf failed : EVENTCMD "
                    + org.getByValue(Alarmreceiverconf.VALUEID_EVENTCMD)
                    + " : "
                    + copy.getByValue(Alarmreceiverconf.VALUEID_EVENTCMD));

        test = org.getByValue(Alarmreceiverconf.VALUEID_EVENTSPOOLDIR).equals(
                copy.getByValue(Alarmreceiverconf.VALUEID_EVENTSPOOLDIR));
        if (!test)
            LOGGER.warn("checkAlarmreceiverconf failed : EVENTSPOOLDIR "
                    + org.getByValue(Alarmreceiverconf.VALUEID_EVENTSPOOLDIR)
                    + " : "
                    + copy.getByValue(Alarmreceiverconf.VALUEID_EVENTSPOOLDIR));

        test = org
                .getByValue(Alarmreceiverconf.VALUEID_LOGINDIVIDUALEVENTS)
                .equals(
                        copy
                                .getByValue(Alarmreceiverconf.VALUEID_LOGINDIVIDUALEVENTS));
        if (!test)
            LOGGER
                    .warn("checkAlarmreceiverconf failed : LOGINDIVIDUALEVENTS "
                            + org
                                    .getByValue(Alarmreceiverconf.VALUEID_LOGINDIVIDUALEVENTS)
                            + " : "
                            + copy
                                    .getByValue(Alarmreceiverconf.VALUEID_LOGINDIVIDUALEVENTS));

        test = org.getByValue(Alarmreceiverconf.VALUEID_FDTIMEOUT).equals(
                copy.getByValue(Alarmreceiverconf.VALUEID_FDTIMEOUT));
        if (!test)
            LOGGER.warn("checkAlarmreceiverconf failed : FDTIMEOUT "
                    + org.getByValue(Alarmreceiverconf.VALUEID_FDTIMEOUT)
                    + " : "
                    + copy.getByValue(Alarmreceiverconf.VALUEID_FDTIMEOUT));

        test = org.getByValue(Alarmreceiverconf.VALUEID_SDTIMEOUT).equals(
                copy.getByValue(Alarmreceiverconf.VALUEID_SDTIMEOUT));
        if (!test)
            LOGGER.warn("checkAlarmreceiverconf failed : SDTIMEOUT "
                    + org.getByValue(Alarmreceiverconf.VALUEID_SDTIMEOUT)
                    + " : "
                    + copy.getByValue(Alarmreceiverconf.VALUEID_SDTIMEOUT));

        test = org.getByValue(Alarmreceiverconf.VALUEID_LOUDNESS).equals(
                copy.getByValue(Alarmreceiverconf.VALUEID_LOUDNESS));
        if (!test)
            LOGGER.warn("checkAlarmreceiverconf failed : LOUDNESS "
                    + org.getByValue(Alarmreceiverconf.VALUEID_LOUDNESS)
                    + " : "
                    + copy.getByValue(Alarmreceiverconf.VALUEID_LOUDNESS));

        test = org.getByValue(Alarmreceiverconf.VALUEID_DBFAMILY).equals(
                copy.getByValue(Alarmreceiverconf.VALUEID_DBFAMILY));
        if (!test)
            LOGGER.warn("checkAlarmreceiverconf failed : DBFAMILY "
                    + org.getByValue(Alarmreceiverconf.VALUEID_DBFAMILY)
                    + " : "
                    + copy.getByValue(Alarmreceiverconf.VALUEID_DBFAMILY));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * erzeugt und initalisiert Alarmreceiverconf
     */
    protected static Alarmreceiverconf createAlarmreceiverconf() {
        Alarmreceiverconf newAlarmreceiverconf = new AlarmreceiverconfImpl();
        // fields
        newAlarmreceiverconf.setByValue(
                Alarmreceiverconf.VALUEID_TIMESTAMPFORMAT, "TIMESTAMPFORMAT");
        newAlarmreceiverconf.setByValue(Alarmreceiverconf.VALUEID_EVENTCMD,
                "EVENTCMD");
        newAlarmreceiverconf.setByValue(
                Alarmreceiverconf.VALUEID_EVENTSPOOLDIR, "EVENTSPOOLDIR");
        newAlarmreceiverconf.setByValue(
                Alarmreceiverconf.VALUEID_LOGINDIVIDUALEVENTS,
                "LOGINDIVIDUALEVENTS");
        newAlarmreceiverconf.setByValue(Alarmreceiverconf.VALUEID_FDTIMEOUT,
                Integer.valueOf(0));
        newAlarmreceiverconf.setByValue(Alarmreceiverconf.VALUEID_SDTIMEOUT,
                Integer.valueOf(0));
        newAlarmreceiverconf.setByValue(Alarmreceiverconf.VALUEID_LOUDNESS,
                Integer.valueOf(0));
        newAlarmreceiverconf.setByValue(Alarmreceiverconf.VALUEID_DBFAMILY,
                "DBFAMILY");
        // agg
        // map
        return newAlarmreceiverconf;
    }

}
