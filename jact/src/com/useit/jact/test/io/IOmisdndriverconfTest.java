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
import com.useit.jact.model.misdndriverconf.MMFmisdndriverconf;
import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnCardsImpl;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdnDriverConfImpl;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;
import com.useit.jact.model.misdndriverconf.MisdncardPortsImpl;
import com.useit.jact.model.types.MCardOptionSet;
import com.useit.jact.model.types.MPortOptionSet;
import com.useit.jact.model.types.MisdnCardTypes;
import com.useit.jact.model.types.MisdnPortOptions;

/**
 * <p>
 * IOmisdndriverconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOmisdndriverconfTest.java,v 1.3 2006/01/12
 *          15:20:10 urs Exp $
 */
public class IOmisdndriverconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOmisdndriverconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOmisdndriverconfTest.class);
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

    public final void testMisdncardPortsLoadSaveXML() {
        MisdncardPorts Obj = createMisdncardPorts();
        MMFmisdndriverconf.getInstance().writeConfXML(
                "temp/MisdncardPorts.xml", Obj);
        Object object = MMFmisdndriverconf.getInstance().readConfXML(
                "temp/MisdncardPorts.xml");
        assertEquals("load save XML MisdncardPorts", true, checkMisdncardPorts(
                Obj, object));
    }

    public final void testMisdnCardsLoadSaveXML() {
        MisdnCards Obj = createMisdnCards();
        MMFmisdndriverconf.getInstance().writeConfXML("temp/MisdnCards.xml",
                Obj);
        Object object = MMFmisdndriverconf.getInstance().readConfXML(
                "temp/MisdnCards.xml");
        assertEquals("load save XML MisdnCards", true, checkMisdnCards(Obj,
                object));
    }

    public final void testMisdnDriverConfLoadSaveXML() {
        MisdnDriverConf Obj = createMisdnDriverConf();
        MMFmisdndriverconf.getInstance().writeConfXML(
                "temp/MisdnDriverConf.xml", Obj);
        Object object = MMFmisdndriverconf.getInstance().readConfXML(
                "temp/MisdnDriverConf.xml");
        assertEquals("load save XML MisdnDriverConf", true,
                checkMisdnDriverConf(Obj, object));
    }

    public final void testMisdncardPortsloadSaveConf() {
        MisdncardPorts Obj = createMisdncardPorts();
        try {
            MMFmisdndriverconf.getInstance().writetoFile(Obj,
                    "temp/MisdncardPorts.cfg");
            Object object = MMFmisdndriverconf.getInstance().readConf(
                    new File("temp/MisdncardPorts.cfg"));
            assertEquals("load save conf MisdncardPorts", true,
                    checkMisdncardPorts(Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testMisdncardPortsloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testMisdncardPortsloadSaveConf()", e);
        }
    }

    public final void testMisdnCardsloadSaveConf() {
        MisdnCards Obj = createMisdnCards();
        try {
            MMFmisdndriverconf.getInstance().writetoFile(Obj,
                    "temp/MisdnCards.cfg");
            Object object = MMFmisdndriverconf.getInstance().readConf(
                    new File("temp/MisdnCards.cfg"));
            assertEquals("load save conf MisdnCards", true, checkMisdnCards(
                    Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testMisdnCardsloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testMisdnCardsloadSaveConf()", e);
        }
    }

    public final void testMisdnDriverConfloadSaveConf() {
        MisdnDriverConf Obj = createMisdnDriverConf();
        try {
            MMFmisdndriverconf.getInstance().writetoFile(Obj,
                    "temp/MisdnDriverConf.cfg");
            Object object = MMFmisdndriverconf.getInstance().readConf(
                    new File("temp/MisdnDriverConf.cfg"));
            assertEquals("load save conf MisdnDriverConf", true,
                    checkMisdnDriverConf(Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testMisdnDriverConfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testMisdnDriverConfloadSaveConf()", e);
        }
    }

    public final void testMisdncardPortsLoadSaveHibernate() {
        MisdncardPorts Obj = createMisdncardPorts();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMisdncardPortsLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(MisdncardPortsImpl.class, Obj.getId());
        assertEquals("load save MisdncardPorts", Obj, object);

    }

    public final void testMisdnCardsLoadSaveHibernate() {
        MisdnCards Obj = createMisdnCards();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMisdnCardsLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(MisdnCardsImpl.class, Obj.getId());
        assertEquals("load save MisdnCards", Obj, object);

    }

    public final void testMisdnDriverConfLoadSaveHibernate() {
        MisdnDriverConf Obj = createMisdnDriverConf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMisdnDriverConfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(MisdnDriverConfImpl.class, Obj.getId());
        assertEquals("load save MisdnDriverConf", Obj, object);

    }

    /*
     * überprüft MisdncardPorts
     */
    protected static boolean checkMisdncardPorts(MisdncardPorts org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        MisdncardPorts copy = null;
        if (obj instanceof MisdncardPorts) {
            copy = (MisdncardPorts) obj;

        } else {
            LOGGER.warn("checkMisdncardPorts failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(MisdncardPorts.VALUEID_PORTN).equals(
                copy.getByValue(MisdncardPorts.VALUEID_PORTN));
        if (!test)
            LOGGER.warn("checkMisdncardPorts failed : PORTN "
                    + org.getByValue(MisdncardPorts.VALUEID_PORTN) + " : "
                    + copy.getByValue(MisdncardPorts.VALUEID_PORTN));

        test = org.getByValue(MisdncardPorts.VALUEID_PORTOPTION).equals(
                copy.getByValue(MisdncardPorts.VALUEID_PORTOPTION));
        if (!test)
            LOGGER.warn("checkMisdncardPorts failed : PORTOPTION "
                    + org.getByValue(MisdncardPorts.VALUEID_PORTOPTION) + " : "
                    + copy.getByValue(MisdncardPorts.VALUEID_PORTOPTION));

        test = org.getByValue(MisdncardPorts.VALUEID_MPORTOPTION).equals(
                copy.getByValue(MisdncardPorts.VALUEID_MPORTOPTION));
        if (!test)
            LOGGER.warn("checkMisdncardPorts failed : MPORTOPTION "
                    + org.getByValue(MisdncardPorts.VALUEID_MPORTOPTION)
                    + " : "
                    + copy.getByValue(MisdncardPorts.VALUEID_MPORTOPTION));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft MisdnCards
     */
    protected static boolean checkMisdnCards(MisdnCards org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        MisdnCards copy = null;
        if (obj instanceof MisdnCards) {
            copy = (MisdnCards) obj;

        } else {
            LOGGER.warn("checkMisdnCards failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(MisdnCards.VALUEID_CARDNAME).equals(
                copy.getByValue(MisdnCards.VALUEID_CARDNAME));
        if (!test)
            LOGGER.warn("checkMisdnCards failed : CARDNAME "
                    + org.getByValue(MisdnCards.VALUEID_CARDNAME) + " : "
                    + copy.getByValue(MisdnCards.VALUEID_CARDNAME));

        test = org.getByValue(MisdnCards.VALUEID_CARDTYPE).equals(
                copy.getByValue(MisdnCards.VALUEID_CARDTYPE));
        if (!test)
            LOGGER.warn("checkMisdnCards failed : CARDTYPE "
                    + org.getByValue(MisdnCards.VALUEID_CARDTYPE) + " : "
                    + copy.getByValue(MisdnCards.VALUEID_CARDTYPE));

        test = org.getByValue(MisdnCards.VALUEID_CARDOPTIONS).equals(
                copy.getByValue(MisdnCards.VALUEID_CARDOPTIONS));
        if (!test)
            LOGGER.warn("checkMisdnCards failed : CARDOPTIONS "
                    + org.getByValue(MisdnCards.VALUEID_CARDOPTIONS) + " : "
                    + copy.getByValue(MisdnCards.VALUEID_CARDOPTIONS));

        // ---------------agg
        // -----------------map
        test = org.getMisdncardPortsMap().size() == copy.getMisdncardPortsMap()
                .size();

        if (!test) {
            LOGGER.warn("checkMisdnCards failed : misdncardPortsMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getMisdncardPortsMap().size(); i++) {
            test = checkMisdncardPorts(org.getMisdncardPortsMap().get(i), copy
                    .getMisdncardPortsMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkMisdnCards failed : misdncardPortsMap  equals "
                                + i
                                + " "
                                + org.getMisdncardPortsMap().get(i)
                                + " : " + copy.getMisdncardPortsMap().get(i));
                return test;
            }
        }// end of for i to org.getMisdncardPortsMap()

        // newMisdnCards.addMisdncardPorts(createMisdncardPorts());
        return test;
    }

    /*
     * überprüft MisdnDriverConf
     */
    protected static boolean checkMisdnDriverConf(MisdnDriverConf org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        MisdnDriverConf copy = null;
        if (obj instanceof MisdnDriverConf) {
            copy = (MisdnDriverConf) obj;

        } else {
            LOGGER.warn("checkMisdnDriverConf failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(MisdnDriverConf.VALUEID_POLL).equals(
                copy.getByValue(MisdnDriverConf.VALUEID_POLL));
        if (!test)
            LOGGER.warn("checkMisdnDriverConf failed : POLL "
                    + org.getByValue(MisdnDriverConf.VALUEID_POLL) + " : "
                    + copy.getByValue(MisdnDriverConf.VALUEID_POLL));

        test = org.getByValue(MisdnDriverConf.VALUEID_PCM).equals(
                copy.getByValue(MisdnDriverConf.VALUEID_PCM));
        if (!test)
            LOGGER.warn("checkMisdnDriverConf failed : PCM "
                    + org.getByValue(MisdnDriverConf.VALUEID_PCM) + " : "
                    + copy.getByValue(MisdnDriverConf.VALUEID_PCM));

        test = org.getByValue(MisdnDriverConf.VALUEID_DEBUG).equals(
                copy.getByValue(MisdnDriverConf.VALUEID_DEBUG));
        if (!test)
            LOGGER.warn("checkMisdnDriverConf failed : DEBUG "
                    + org.getByValue(MisdnDriverConf.VALUEID_DEBUG) + " : "
                    + copy.getByValue(MisdnDriverConf.VALUEID_DEBUG));

        // ---------------agg
        // -----------------map
        test = org.getMisdnCardsMap().size() == copy.getMisdnCardsMap().size();

        if (!test) {
            LOGGER.warn("checkMisdnDriverConf failed : misdnCardsMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getMisdnCardsMap().size(); i++) {
            test = checkMisdnCards(org.getMisdnCardsMap().get(i), copy
                    .getMisdnCardsMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkMisdnDriverConf failed : misdnCardsMap  equals "
                                + i
                                + " "
                                + org.getMisdnCardsMap().get(i)
                                + " : " + copy.getMisdnCardsMap().get(i));
                return test;
            }
        }// end of for i to org.getMisdnCardsMap()

        // newMisdnDriverConf.addMisdnCards(createMisdnCards());
        return test;
    }

    /*
     * erzeugt und initalisiert MisdncardPorts
     */
    protected static MisdncardPorts createMisdncardPorts() {
        MisdncardPorts newMisdncardPorts = new MisdncardPortsImpl();
        // fields
        newMisdncardPorts.setByValue(MisdncardPorts.VALUEID_PORTN, Integer
                .valueOf(0));
        newMisdncardPorts.setByValue(MisdncardPorts.VALUEID_PORTOPTION,
                new MisdnPortOptions(""));
        newMisdncardPorts.setByValue(MisdncardPorts.VALUEID_MPORTOPTION,
                new MPortOptionSet(""));
        // agg
        // map
        return newMisdncardPorts;
    }

    /*
     * erzeugt und initalisiert MisdnCards
     */
    protected static MisdnCards createMisdnCards() {
        MisdnCards newMisdnCards = new MisdnCardsImpl();
        // fields
        newMisdnCards.setByValue(MisdnCards.VALUEID_CARDNAME, "CARDNAME");
        newMisdnCards.setByValue(MisdnCards.VALUEID_CARDTYPE,
                new MisdnCardTypes(""));
        newMisdnCards.setByValue(MisdnCards.VALUEID_CARDOPTIONS,
                new MCardOptionSet(""));
        // agg
        // map
        newMisdnCards.addMisdncardPorts(createMisdncardPorts());
        return newMisdnCards;
    }

    /*
     * erzeugt und initalisiert MisdnDriverConf
     */
    protected static MisdnDriverConf createMisdnDriverConf() {
        MisdnDriverConf newMisdnDriverConf = new MisdnDriverConfImpl();
        // fields
        newMisdnDriverConf.setByValue(MisdnDriverConf.VALUEID_POLL, Integer
                .valueOf(0));
        newMisdnDriverConf
                .setByValue(MisdnDriverConf.VALUEID_PCM, Boolean.TRUE);
        newMisdnDriverConf.setByValue(MisdnDriverConf.VALUEID_DEBUG, Integer
                .valueOf(0));
        // agg
        // map
        newMisdnDriverConf.addMisdnCards(createMisdnCards());
        return newMisdnDriverConf;
    }

}
