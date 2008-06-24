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
import com.useit.jact.model.zaptelconf.MMFzaptelconf;
import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.ZaptelchannelsImpl;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.ZaptelconfImpl;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.ZapteldynamicspanImpl;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.ZaptelspanImpl;
import com.useit.jact.model.zaptelconf.Zapteltonezone;
import com.useit.jact.model.zaptelconf.ZapteltonezoneImpl;

/**
 * <p>
 * IOzaptelconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOzaptelconfTest.java,v 1.4 2006/01/29
 *          12:03:54 urs Exp $
 */
public class IOzaptelconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOzaptelconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOzaptelconfTest.class);
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

    // public final void testZaptelchannelsLoadSaveXML() {
    // Zaptelchannels Obj = createZaptelchannels();
    // MMFzaptelconf.getInstance().writeConfXML("temp/Zaptelchannels.xml", Obj);
    // Object object =
    // MMFzaptelconf.getInstance().readConfXML("temp/Zaptelchannels.xml");
    // assertEquals("load save XML Zaptelchannels",true,checkZaptelchannels(Obj,
    // object));
    // }
    // public final void testZapteltonezoneLoadSaveXML() {
    // Zapteltonezone Obj = createZapteltonezone();
    // MMFzaptelconf.getInstance().writeConfXML("temp/Zapteltonezone.xml", Obj);
    // Object object =
    // MMFzaptelconf.getInstance().readConfXML("temp/Zapteltonezone.xml");
    // assertEquals("load save XML Zapteltonezone",true,checkZapteltonezone(Obj,
    // object));
    // }
    // public final void testZaptelspanLoadSaveXML() {
    // Zaptelspan Obj = createZaptelspan();
    // MMFzaptelconf.getInstance().writeConfXML("temp/Zaptelspan.xml", Obj);
    // Object object =
    // MMFzaptelconf.getInstance().readConfXML("temp/Zaptelspan.xml");
    // assertEquals("load save XML Zaptelspan",true,checkZaptelspan(Obj,
    // object));
    // }
    // public final void testZapteldynamicspanLoadSaveXML() {
    // Zapteldynamicspan Obj = createZapteldynamicspan();
    // MMFzaptelconf.getInstance().writeConfXML("temp/Zapteldynamicspan.xml",
    // Obj);
    // Object object =
    // MMFzaptelconf.getInstance().readConfXML("temp/Zapteldynamicspan.xml");
    // assertEquals("load save XML
    // Zapteldynamicspan",true,checkZapteldynamicspan(Obj, object));
    // }
    public final void testZaptelconfLoadSaveXML() {
        Zaptelconf Obj = createZaptelconf();
        MMFzaptelconf.getInstance().writeConfXML("temp/Zaptelconf.xml", Obj);
        Object object = MMFzaptelconf.getInstance().readConfXML(
                "temp/Zaptelconf.xml");
        assertEquals("load save XML Zaptelconf", true, checkZaptelconf(Obj,
                object));
    }

    // public final void testZaptelchannelsloadSaveConf() {
    // Zaptelchannels Obj = createZaptelchannels();
    // try{
    // MMFzaptelconf.getInstance().writetoFile(Obj,"temp/Zaptelchannels.cfg");
    // Object object = MMFzaptelconf.getInstance().readConf(new
    // File("temp/Zaptelchannels.cfg"));
    // assertEquals("load save conf
    // Zaptelchannels",true,checkZaptelchannels(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testZaptelchannelsloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testZaptelchannelsloadSaveConf()", e);
    // }
    // }
    // public final void testZapteltonezoneloadSaveConf() {
    // Zapteltonezone Obj = createZapteltonezone();
    // try{
    // MMFzaptelconf.getInstance().writetoFile(Obj,"temp/Zapteltonezone.cfg");
    // Object object = MMFzaptelconf.getInstance().readConf(new
    // File("temp/Zapteltonezone.cfg"));
    // assertEquals("load save conf
    // Zapteltonezone",true,checkZapteltonezone(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testZapteltonezoneloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testZapteltonezoneloadSaveConf()", e);
    // }
    // }
    // public final void testZaptelspanloadSaveConf() {
    // Zaptelspan Obj = createZaptelspan();
    // try{
    // MMFzaptelconf.getInstance().writetoFile(Obj,"temp/Zaptelspan.cfg");
    // Object object = MMFzaptelconf.getInstance().readConf(new
    // File("temp/Zaptelspan.cfg"));
    // assertEquals("load save conf
    // Zaptelspan",true,checkZaptelspan(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testZaptelspanloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testZaptelspanloadSaveConf()", e);
    // }
    // }
    // public final void testZapteldynamicspanloadSaveConf() {
    // Zapteldynamicspan Obj = createZapteldynamicspan();
    // try{
    // MMFzaptelconf.getInstance().writetoFile(Obj,"temp/Zapteldynamicspan.cfg");
    // Object object = MMFzaptelconf.getInstance().readConf(new
    // File("temp/Zapteldynamicspan.cfg"));
    // assertEquals("load save conf
    // Zapteldynamicspan",true,checkZapteldynamicspan(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testZapteldynamicspanloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testZapteldynamicspanloadSaveConf()", e);
    // }
    // }
    public final void testZaptelconfloadSaveConf() {
        Zaptelconf Obj = createZaptelconf();
        try {
            MMFzaptelconf.getInstance().writetoFile(Obj, "temp/Zaptelconf.cfg");
            Object object = MMFzaptelconf.getInstance().readConf(
                    new File("temp/Zaptelconf.cfg"));
            assertEquals("load save conf Zaptelconf", true, checkZaptelconf(
                    Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testZaptelconfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testZaptelconfloadSaveConf()", e);
        }
    }

    public final void testZaptelchannelsLoadSaveHibernate() {
        Zaptelchannels Obj = createZaptelchannels();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testZaptelchannelsLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ZaptelchannelsImpl.class, Obj.getId());
        assertEquals("load save Zaptelchannels", Obj, object);

    }

    public final void testZapteltonezoneLoadSaveHibernate() {
        Zapteltonezone Obj = createZapteltonezone();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testZapteltonezoneLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ZapteltonezoneImpl.class, Obj.getId());
        assertEquals("load save Zapteltonezone", Obj, object);

    }

    public final void testZaptelspanLoadSaveHibernate() {
        Zaptelspan Obj = createZaptelspan();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testZaptelspanLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ZaptelspanImpl.class, Obj.getId());
        assertEquals("load save Zaptelspan", Obj, object);

    }

    public final void testZapteldynamicspanLoadSaveHibernate() {
        Zapteldynamicspan Obj = createZapteldynamicspan();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testZapteldynamicspanLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ZapteldynamicspanImpl.class, Obj.getId());
        assertEquals("load save Zapteldynamicspan", Obj, object);

    }

    public final void testZaptelconfLoadSaveHibernate() {
        Zaptelconf Obj = createZaptelconf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testZaptelconfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ZaptelconfImpl.class, Obj.getId());
        assertEquals("load save Zaptelconf", Obj, object);

    }

    /*
     * überprüft Zaptelchannels
     */
    protected static boolean checkZaptelchannels(Zaptelchannels org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Zaptelchannels copy = null;
        if (obj instanceof Zaptelchannels) {
            copy = (Zaptelchannels) obj;

        } else {
            LOGGER.warn("checkZaptelchannels failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Zaptelchannels.VALUEID_DEVICE).equals(
                copy.getByValue(Zaptelchannels.VALUEID_DEVICE));
        if (!test)
            LOGGER.warn("checkZaptelchannels failed : DEVICE "
                    + org.getByValue(Zaptelchannels.VALUEID_DEVICE) + " : "
                    + copy.getByValue(Zaptelchannels.VALUEID_DEVICE));

        test = org.getByValue(Zaptelchannels.VALUEID_CHANNELLIST).equals(
                copy.getByValue(Zaptelchannels.VALUEID_CHANNELLIST));
        if (!test)
            LOGGER.warn("checkZaptelchannels failed : CHANNELLIST "
                    + org.getByValue(Zaptelchannels.VALUEID_CHANNELLIST)
                    + " : "
                    + copy.getByValue(Zaptelchannels.VALUEID_CHANNELLIST));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Zapteltonezone
     */
    protected static boolean checkZapteltonezone(Zapteltonezone org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Zapteltonezone copy = null;
        if (obj instanceof Zapteltonezone) {
            copy = (Zapteltonezone) obj;

        } else {
            LOGGER.warn("checkZapteltonezone failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Zapteltonezone.VALUEID_ZONENAME).equals(
                copy.getByValue(Zapteltonezone.VALUEID_ZONENAME));
        if (!test)
            LOGGER.warn("checkZapteltonezone failed : ZONENAME "
                    + org.getByValue(Zapteltonezone.VALUEID_ZONENAME) + " : "
                    + copy.getByValue(Zapteltonezone.VALUEID_ZONENAME));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Zaptelspan
     */
    protected static boolean checkZaptelspan(Zaptelspan org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Zaptelspan copy = null;
        if (obj instanceof Zaptelspan) {
            copy = (Zaptelspan) obj;

        } else {
            LOGGER.warn("checkZaptelspan failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Zaptelspan.VALUEID_SPAN_NUM).equals(
                copy.getByValue(Zaptelspan.VALUEID_SPAN_NUM));
        if (!test)
            LOGGER.warn("checkZaptelspan failed : SPAN_NUM "
                    + org.getByValue(Zaptelspan.VALUEID_SPAN_NUM) + " : "
                    + copy.getByValue(Zaptelspan.VALUEID_SPAN_NUM));

        test = org.getByValue(Zaptelspan.VALUEID_TIMING).equals(
                copy.getByValue(Zaptelspan.VALUEID_TIMING));
        if (!test)
            LOGGER.warn("checkZaptelspan failed : TIMING "
                    + org.getByValue(Zaptelspan.VALUEID_TIMING) + " : "
                    + copy.getByValue(Zaptelspan.VALUEID_TIMING));

        test = org.getByValue(Zaptelspan.VALUEID_LBO).equals(
                copy.getByValue(Zaptelspan.VALUEID_LBO));
        if (!test)
            LOGGER.warn("checkZaptelspan failed : LBO "
                    + org.getByValue(Zaptelspan.VALUEID_LBO) + " : "
                    + copy.getByValue(Zaptelspan.VALUEID_LBO));

        test = org.getByValue(Zaptelspan.VALUEID_FRAMING).equals(
                copy.getByValue(Zaptelspan.VALUEID_FRAMING));
        if (!test)
            LOGGER.warn("checkZaptelspan failed : FRAMING "
                    + org.getByValue(Zaptelspan.VALUEID_FRAMING) + " : "
                    + copy.getByValue(Zaptelspan.VALUEID_FRAMING));

        test = org.getByValue(Zaptelspan.VALUEID_CODING).equals(
                copy.getByValue(Zaptelspan.VALUEID_CODING));
        if (!test)
            LOGGER.warn("checkZaptelspan failed : CODING "
                    + org.getByValue(Zaptelspan.VALUEID_CODING) + " : "
                    + copy.getByValue(Zaptelspan.VALUEID_CODING));

        test = org.getByValue(Zaptelspan.VALUEID_YELLOW).equals(
                copy.getByValue(Zaptelspan.VALUEID_YELLOW));
        if (!test)
            LOGGER.warn("checkZaptelspan failed : YELLOW "
                    + org.getByValue(Zaptelspan.VALUEID_YELLOW) + " : "
                    + copy.getByValue(Zaptelspan.VALUEID_YELLOW));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Zapteldynamicspan
     */
    protected static boolean checkZapteldynamicspan(Zapteldynamicspan org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Zapteldynamicspan copy = null;
        if (obj instanceof Zapteldynamicspan) {
            copy = (Zapteldynamicspan) obj;

        } else {
            LOGGER.warn("checkZapteldynamicspan failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Zapteldynamicspan.VALUEID_DRIVER).equals(
                copy.getByValue(Zapteldynamicspan.VALUEID_DRIVER));
        if (!test)
            LOGGER.warn("checkZapteldynamicspan failed : DRIVER "
                    + org.getByValue(Zapteldynamicspan.VALUEID_DRIVER) + " : "
                    + copy.getByValue(Zapteldynamicspan.VALUEID_DRIVER));

        test = org.getByValue(Zapteldynamicspan.VALUEID_ADDRESS).equals(
                copy.getByValue(Zapteldynamicspan.VALUEID_ADDRESS));
        if (!test)
            LOGGER.warn("checkZapteldynamicspan failed : ADDRESS "
                    + org.getByValue(Zapteldynamicspan.VALUEID_ADDRESS) + " : "
                    + copy.getByValue(Zapteldynamicspan.VALUEID_ADDRESS));

        test = org.getByValue(Zapteldynamicspan.VALUEID_NUMCHANS).equals(
                copy.getByValue(Zapteldynamicspan.VALUEID_NUMCHANS));
        if (!test)
            LOGGER.warn("checkZapteldynamicspan failed : NUMCHANS "
                    + org.getByValue(Zapteldynamicspan.VALUEID_NUMCHANS)
                    + " : "
                    + copy.getByValue(Zapteldynamicspan.VALUEID_NUMCHANS));

        test = org.getByValue(Zapteldynamicspan.VALUEID_TIMING).equals(
                copy.getByValue(Zapteldynamicspan.VALUEID_TIMING));
        if (!test)
            LOGGER.warn("checkZapteldynamicspan failed : TIMING "
                    + org.getByValue(Zapteldynamicspan.VALUEID_TIMING) + " : "
                    + copy.getByValue(Zapteldynamicspan.VALUEID_TIMING));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Zaptelconf
     */
    protected static boolean checkZaptelconf(Zaptelconf org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Zaptelconf copy = null;
        if (obj instanceof Zaptelconf) {
            copy = (Zaptelconf) obj;

        } else {
            LOGGER.warn("checkZaptelconf failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Zaptelconf.VALUEID_DEFAULTZONE).equals(
                copy.getByValue(Zaptelconf.VALUEID_DEFAULTZONE));
        if (!test)
            LOGGER.warn("checkZaptelconf failed : DEFAULTZONE "
                    + org.getByValue(Zaptelconf.VALUEID_DEFAULTZONE) + " : "
                    + copy.getByValue(Zaptelconf.VALUEID_DEFAULTZONE));

        // ---------------agg
        // -----------------map
        test = org.getZaptelchannelsMap().size() == copy.getZaptelchannelsMap()
                .size();

        if (!test) {
            LOGGER.warn("checkZaptelconf failed : zaptelchannelsMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getZaptelchannelsMap().size(); i++) {
            test = checkZaptelchannels(org.getZaptelchannelsMap().get(i), copy
                    .getZaptelchannelsMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkZaptelconf failed : zaptelchannelsMap  equals "
                                + i
                                + " "
                                + org.getZaptelchannelsMap().get(i)
                                + " : " + copy.getZaptelchannelsMap().get(i));
                return test;
            }
        }// end of for i to org.getZaptelchannelsMap()

        // newZaptelconf.addZaptelchannels(createZaptelchannels());
        test = org.getZapteldynamicspanMap().size() == copy
                .getZapteldynamicspanMap().size();

        if (!test) {
            LOGGER.warn("checkZaptelconf failed : zapteldynamicspanMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getZapteldynamicspanMap().size(); i++) {
            test = checkZapteldynamicspan(org.getZapteldynamicspanMap().get(i),
                    copy.getZapteldynamicspanMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkZaptelconf failed : zapteldynamicspanMap  equals "
                                + i
                                + " "
                                + org.getZapteldynamicspanMap().get(i)
                                + " : "
                                + copy.getZapteldynamicspanMap().get(i));
                return test;
            }
        }// end of for i to org.getZapteldynamicspanMap()

        // newZaptelconf.addZapteldynamicspan(createZapteldynamicspan());
        test = org.getZaptelspanMap().size() == copy.getZaptelspanMap().size();

        if (!test) {
            LOGGER.warn("checkZaptelconf failed : zaptelspanMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getZaptelspanMap().size(); i++) {
            test = checkZaptelspan(org.getZaptelspanMap().get(i), copy
                    .getZaptelspanMap().get(i));

            if (!test) {
                LOGGER.warn("checkZaptelconf failed : zaptelspanMap  equals "
                        + i + " " + org.getZaptelspanMap().get(i) + " : "
                        + copy.getZaptelspanMap().get(i));
                return test;
            }
        }// end of for i to org.getZaptelspanMap()

        // newZaptelconf.addZaptelspan(createZaptelspan());
        test = org.getZapteltonezoneMap().size() == copy.getZapteltonezoneMap()
                .size();

        if (!test) {
            LOGGER.warn("checkZaptelconf failed : zapteltonezoneMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getZapteltonezoneMap().size(); i++) {
            test = checkZapteltonezone(org.getZapteltonezoneMap().get(i), copy
                    .getZapteltonezoneMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkZaptelconf failed : zapteltonezoneMap  equals "
                                + i
                                + " "
                                + org.getZapteltonezoneMap().get(i)
                                + " : " + copy.getZapteltonezoneMap().get(i));
                return test;
            }
        }// end of for i to org.getZapteltonezoneMap()

        // newZaptelconf.addZapteltonezone(createZapteltonezone());
        return test;
    }

    /*
     * erzeugt und initalisiert Zaptelchannels
     */
    protected static Zaptelchannels createZaptelchannels() {
        Zaptelchannels newZaptelchannels = new ZaptelchannelsImpl();
        // fields
        for (int i = 0; i < 10; i++) {
            newZaptelchannels.setByValue(Zaptelchannels.VALUEID_DEVICE,
                    "DEVICE");
            newZaptelchannels.setByValue(Zaptelchannels.VALUEID_CHANNELLIST,
                    "CHANNELLIST" + i);

        }
        // agg
        // map
        return newZaptelchannels;
    }

    /*
     * erzeugt und initalisiert Zapteltonezone
     */
    protected static Zapteltonezone createZapteltonezone() {
        Zapteltonezone newZapteltonezone = new ZapteltonezoneImpl();
        // fields
        newZapteltonezone.setByValue(Zapteltonezone.VALUEID_ZONENAME,
                "ZONENAME");
        // agg
        // map
        return newZapteltonezone;
    }

    /*
     * erzeugt und initalisiert Zaptelspan
     */
    protected static Zaptelspan createZaptelspan() {
        Zaptelspan newZaptelspan = new ZaptelspanImpl();
        // fields
        for (int i = 0; i < 3; i++) {
            newZaptelspan.setByValue(Zaptelspan.VALUEID_SPAN_NUM, Integer
                    .valueOf(i));
            newZaptelspan.setByValue(Zaptelspan.VALUEID_TIMING, Integer
                    .valueOf(0));
            newZaptelspan
                    .setByValue(Zaptelspan.VALUEID_LBO, Integer.valueOf(0));
            newZaptelspan.setByValue(Zaptelspan.VALUEID_FRAMING, "FRAMING");
            newZaptelspan.setByValue(Zaptelspan.VALUEID_CODING, "CODING");
            newZaptelspan.setByValue(Zaptelspan.VALUEID_YELLOW, "YELLOW");

        }
        // agg
        // map
        return newZaptelspan;
    }

    /*
     * erzeugt und initalisiert Zapteldynamicspan
     */
    protected static Zapteldynamicspan createZapteldynamicspan() {
        Zapteldynamicspan newZapteldynamicspan = new ZapteldynamicspanImpl();
        // fields
        newZapteldynamicspan.setByValue(Zapteldynamicspan.VALUEID_DRIVER,
                "DRIVER");
        newZapteldynamicspan.setByValue(Zapteldynamicspan.VALUEID_ADDRESS,
                "ADDRESS");
        newZapteldynamicspan.setByValue(Zapteldynamicspan.VALUEID_NUMCHANS,
                Integer.valueOf(0));
        newZapteldynamicspan.setByValue(Zapteldynamicspan.VALUEID_TIMING,
                Integer.valueOf(0));
        // agg
        // map
        return newZapteldynamicspan;
    }

    /*
     * erzeugt und initalisiert Zaptelconf
     */
    protected static Zaptelconf createZaptelconf() {
        Zaptelconf newZaptelconf = new ZaptelconfImpl();
        // fields
        newZaptelconf.setByValue(Zaptelconf.VALUEID_DEFAULTZONE, "DEFAULTZONE");
        // agg
        // map
        newZaptelconf.addZaptelchannels(createZaptelchannels());
        newZaptelconf.addZapteldynamicspan(createZapteldynamicspan());
        newZaptelconf.addZaptelspan(createZaptelspan());
        newZaptelconf.addZapteltonezone(createZapteltonezone());
        return newZaptelconf;
    }

}
