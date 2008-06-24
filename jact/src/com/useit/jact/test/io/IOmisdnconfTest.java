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
import com.useit.jact.model.misdnconf.MMFmisdnconf;
import com.useit.jact.model.misdnconf.MisdnCryptkey;
import com.useit.jact.model.misdnconf.MisdnCryptkeyImpl;
import com.useit.jact.model.misdnconf.MisdnPorts;
import com.useit.jact.model.misdnconf.MisdnPortsImpl;
import com.useit.jact.model.misdnconf.MisdnSections;
import com.useit.jact.model.misdnconf.MisdnSectionsImpl;
import com.useit.jact.model.misdnconf.Misdnconf;
import com.useit.jact.model.misdnconf.MisdnconfImpl;
import com.useit.jact.model.types.Dialplan;
import com.useit.jact.model.types.MisdnPortOptions;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Presentation;

/**
 * <p>
 * IOmisdnconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOmisdnconfTest.java,v 1.4 2006/01/13
 *          16:54:44 urs Exp $
 */
public class IOmisdnconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOmisdnconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOmisdnconfTest.class);
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

    public final void testMisdnconfLoadSaveXML() {
        Misdnconf Obj = createMisdnconf();
        MMFmisdnconf.getInstance().writeConfXML("temp/Misdnconf.xml", Obj);
        Object object = MMFmisdnconf.getInstance().readConfXML(
                "temp/Misdnconf.xml");
        assertEquals("load save XML Misdnconf", true, checkMisdnconf(Obj,
                object));
    }

    // public final void testMisdnCryptkeyLoadSaveXML() {
    // MisdnCryptkey Obj = createMisdnCryptkey();
    // MMFmisdnconf.getInstance().writeConfXML("temp/MisdnCryptkey.xml", Obj);
    // Object object =
    // MMFmisdnconf.getInstance().readConfXML("temp/MisdnCryptkey.xml");
    // assertEquals("load save XML MisdnCryptkey",true,checkMisdnCryptkey(Obj,
    // object));
    // }
    // public final void testMisdnSectionsLoadSaveXML() {
    // MisdnSections Obj = createMisdnSections();
    // MMFmisdnconf.getInstance().writeConfXML("temp/MisdnSections.xml", Obj);
    // Object object =
    // MMFmisdnconf.getInstance().readConfXML("temp/MisdnSections.xml");
    // assertEquals("load save XML MisdnSections",true,checkMisdnSections(Obj,
    // object));
    // }
    // public final void testMisdnPortsLoadSaveXML() {
    // MisdnPorts Obj = createMisdnPorts();
    // MMFmisdnconf.getInstance().writeConfXML("temp/MisdnPorts.xml", Obj);
    // Object object =
    // MMFmisdnconf.getInstance().readConfXML("temp/MisdnPorts.xml");
    // assertEquals("load save XML MisdnPorts",true,checkMisdnPorts(Obj,
    // object));
    // }

    public final void testMisdnconfloadSaveConf() {
        Misdnconf Obj = createMisdnconf();
        try {
            MMFmisdnconf.getInstance().writetoFile(Obj, "temp/Misdnconf.cfg");
            Object object = MMFmisdnconf.getInstance().readConf(
                    new File("temp/Misdnconf.cfg"));
            assertEquals("load save conf Misdnconf", true, checkMisdnconf(Obj,
                    object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testMisdnconfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testMisdnconfloadSaveConf()", e);
        }
    }

    // public final void testMisdnCryptkeyloadSaveConf() {
    // MisdnCryptkey Obj = createMisdnCryptkey();
    // try{
    // MMFmisdnconf.getInstance().writetoFile(Obj,"temp/MisdnCryptkey.cfg");
    // Object object = MMFmisdnconf.getInstance().readConf(new
    // File("temp/MisdnCryptkey.cfg"));
    // assertEquals("load save conf
    // MisdnCryptkey",true,checkMisdnCryptkey(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testMisdnCryptkeyloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testMisdnCryptkeyloadSaveConf()", e);
    // }
    // }
    // public final void testMisdnSectionsloadSaveConf() {
    // MisdnSections Obj = createMisdnSections();
    // try{
    // MMFmisdnconf.getInstance().writetoFile(Obj,"temp/MisdnSections.cfg");
    // Object object = MMFmisdnconf.getInstance().readConf(new
    // File("temp/MisdnSections.cfg"));
    // assertEquals("load save conf
    // MisdnSections",true,checkMisdnSections(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testMisdnSectionsloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testMisdnSectionsloadSaveConf()", e);
    // }
    // }
    // public final void testMisdnPortsloadSaveConf() {
    // MisdnPorts Obj = createMisdnPorts();
    // try{
    // MMFmisdnconf.getInstance().writetoFile(Obj,"temp/MisdnPorts.cfg");
    // Object object = MMFmisdnconf.getInstance().readConf(new
    // File("temp/MisdnPorts.cfg"));
    // assertEquals("load save conf
    // MisdnPorts",true,checkMisdnPorts(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testMisdnPortsloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testMisdnPortsloadSaveConf()", e);
    // }
    // }

    public final void testMisdnconfLoadSaveHibernate() {
        Misdnconf Obj = createMisdnconf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMisdnconfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(MisdnconfImpl.class, Obj.getId());
        assertEquals("load save Misdnconf", Obj, object);

    }

    public final void testMisdnCryptkeyLoadSaveHibernate() {
        MisdnCryptkey Obj = createMisdnCryptkey();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMisdnCryptkeyLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(MisdnCryptkeyImpl.class, Obj.getId());
        assertEquals("load save MisdnCryptkey", Obj, object);

    }

    public final void testMisdnSectionsLoadSaveHibernate() {
        MisdnSections Obj = createMisdnSections("testhibernate");
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMisdnSectionsLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(MisdnSectionsImpl.class, Obj.getId());
        assertEquals("load save MisdnSections", Obj, object);

    }

    public final void testMisdnPortsLoadSaveHibernate() {
        MisdnPorts Obj = createMisdnPorts();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMisdnPortsLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(MisdnPortsImpl.class, Obj.getId());
        assertEquals("load save MisdnPorts", Obj, object);

    }

    /*
     * überprüft Misdnconf
     */
    protected static boolean checkMisdnconf(Misdnconf org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Misdnconf copy = null;
        if (obj instanceof Misdnconf) {
            copy = (Misdnconf) obj;

        } else {
            LOGGER.warn("checkMisdnconf failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Misdnconf.VALUEID_DEBUG).equals(
                copy.getByValue(Misdnconf.VALUEID_DEBUG));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : DEBUG "
                    + org.getByValue(Misdnconf.VALUEID_DEBUG) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_DEBUG));

        test = org.getByValue(Misdnconf.VALUEID_TRACEFILE).equals(
                copy.getByValue(Misdnconf.VALUEID_TRACEFILE));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : TRACEFILE "
                    + org.getByValue(Misdnconf.VALUEID_TRACEFILE) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_TRACEFILE));

        test = org.getByValue(Misdnconf.VALUEID_TRACE_CALLS).equals(
                copy.getByValue(Misdnconf.VALUEID_TRACE_CALLS));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : TRACE_CALLS "
                    + org.getByValue(Misdnconf.VALUEID_TRACE_CALLS) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_TRACE_CALLS));

        test = org.getByValue(Misdnconf.VALUEID_TRACE_DIR).equals(
                copy.getByValue(Misdnconf.VALUEID_TRACE_DIR));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : TRACE_DIR "
                    + org.getByValue(Misdnconf.VALUEID_TRACE_DIR) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_TRACE_DIR));

        test = org.getByValue(Misdnconf.VALUEID_BRIDGING).equals(
                copy.getByValue(Misdnconf.VALUEID_BRIDGING));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : BRIDGING "
                    + org.getByValue(Misdnconf.VALUEID_BRIDGING) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_BRIDGING));

        test = org
                .getByValue(Misdnconf.VALUEID_STOP_TONE_AFTER_FIRST_DIGIT)
                .equals(
                        copy
                                .getByValue(Misdnconf.VALUEID_STOP_TONE_AFTER_FIRST_DIGIT));
        if (!test)
            LOGGER
                    .warn("checkMisdnconf failed : STOP_TONE_AFTER_FIRST_DIGIT "
                            + org
                                    .getByValue(Misdnconf.VALUEID_STOP_TONE_AFTER_FIRST_DIGIT)
                            + " : "
                            + copy
                                    .getByValue(Misdnconf.VALUEID_STOP_TONE_AFTER_FIRST_DIGIT));

        test = org.getByValue(Misdnconf.VALUEID_APPEND_DIGITS2EXTEN).equals(
                copy.getByValue(Misdnconf.VALUEID_APPEND_DIGITS2EXTEN));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : APPEND_DIGITS2EXTEN "
                    + org.getByValue(Misdnconf.VALUEID_APPEND_DIGITS2EXTEN)
                    + " : "
                    + copy.getByValue(Misdnconf.VALUEID_APPEND_DIGITS2EXTEN));

        test = org.getByValue(Misdnconf.VALUEID_L1_INFO_OK).equals(
                copy.getByValue(Misdnconf.VALUEID_L1_INFO_OK));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : L1_INFO_OK "
                    + org.getByValue(Misdnconf.VALUEID_L1_INFO_OK) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_L1_INFO_OK));

        test = org.getByValue(Misdnconf.VALUEID_CLEAR_L3).equals(
                copy.getByValue(Misdnconf.VALUEID_CLEAR_L3));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : CLEAR_L3 "
                    + org.getByValue(Misdnconf.VALUEID_CLEAR_L3) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_CLEAR_L3));

        test = org.getByValue(Misdnconf.VALUEID_DYNAMIC_CRYPT).equals(
                copy.getByValue(Misdnconf.VALUEID_DYNAMIC_CRYPT));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : DYNAMIC_CRYPT "
                    + org.getByValue(Misdnconf.VALUEID_DYNAMIC_CRYPT) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_DYNAMIC_CRYPT));

        test = org.getByValue(Misdnconf.VALUEID_CRYPT_PREFIX).equals(
                copy.getByValue(Misdnconf.VALUEID_CRYPT_PREFIX));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : CRYPT_PREFIX "
                    + org.getByValue(Misdnconf.VALUEID_CRYPT_PREFIX) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_CRYPT_PREFIX));

        test = org.getByValue(Misdnconf.VALUEID_FILEID).equals(
                copy.getByValue(Misdnconf.VALUEID_FILEID));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : FILEID "
                    + org.getByValue(Misdnconf.VALUEID_FILEID) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_FILEID));

        test = org.getByValue(Misdnconf.VALUEID_CONTEXT).equals(
                copy.getByValue(Misdnconf.VALUEID_CONTEXT));
        if (!test)
            LOGGER.warn("checkMisdnconf failed : CONTEXT "
                    + org.getByValue(Misdnconf.VALUEID_CONTEXT) + " : "
                    + copy.getByValue(Misdnconf.VALUEID_CONTEXT));

        // ---------------agg
        test = checkMisdnSections(org.getMisdnSections(), copy
                .getMisdnSections());
        if (!test)
            LOGGER.warn("checkMisdnconf failed : misdnSections "
                    + org.toString() + " : " + copy.toString());
        // -----------------map
        test = org.getMisdnCryptkeyMap().size() == copy.getMisdnCryptkeyMap()
                .size();

        if (!test) {
            LOGGER.warn("checkMisdnconf failed : misdnCryptkeyMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getMisdnCryptkeyMap().size(); i++) {
            test = checkMisdnCryptkey(org.getMisdnCryptkeyMap().get(i), copy
                    .getMisdnCryptkeyMap().get(i));

            if (!test) {
                LOGGER.warn("checkMisdnconf failed : misdnCryptkeyMap  equals "
                        + i + " " + org.getMisdnCryptkeyMap().get(i) + " : "
                        + copy.getMisdnCryptkeyMap().get(i));
                return test;
            }
        }// end of for i to org.getMisdnCryptkeyMap()

        // newMisdnconf.addMisdnCryptkey(createMisdnCryptkey());
        test = org.getMisdnSectionsMap().size() == copy.getMisdnSectionsMap()
                .size();

        if (!test) {
            LOGGER.warn("checkMisdnconf failed : misdnSectionsMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getMisdnSectionsMap().size(); i++) {
            test = checkMisdnSections(org.getMisdnSectionsMap().get(i), copy
                    .getMisdnSectionsMap().get(i));

            if (!test) {
                LOGGER.warn("checkMisdnconf failed : misdnSectionsMap  equals "
                        + i + " " + org.getMisdnSectionsMap().get(i) + " : "
                        + copy.getMisdnSectionsMap().get(i));
                return test;
            }
        }// end of for i to org.getMisdnSectionsMap()

        // newMisdnconf.addMisdnSections(createMisdnSections());
        return test;
    }

    /*
     * überprüft MisdnCryptkey
     */
    protected static boolean checkMisdnCryptkey(MisdnCryptkey org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        MisdnCryptkey copy = null;
        if (obj instanceof MisdnCryptkey) {
            copy = (MisdnCryptkey) obj;

        } else {
            LOGGER.warn("checkMisdnCryptkey failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(MisdnCryptkey.VALUEID_KEYNAME).equals(
                copy.getByValue(MisdnCryptkey.VALUEID_KEYNAME));
        if (!test)
            LOGGER.warn("checkMisdnCryptkey failed : KEYNAME "
                    + org.getByValue(MisdnCryptkey.VALUEID_KEYNAME) + " : "
                    + copy.getByValue(MisdnCryptkey.VALUEID_KEYNAME));

        test = org.getByValue(MisdnCryptkey.VALUEID_KEYVALUE).equals(
                copy.getByValue(MisdnCryptkey.VALUEID_KEYVALUE));
        if (!test)
            LOGGER.warn("checkMisdnCryptkey failed : KEYVALUE "
                    + org.getByValue(MisdnCryptkey.VALUEID_KEYVALUE) + " : "
                    + copy.getByValue(MisdnCryptkey.VALUEID_KEYVALUE));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft MisdnSections
     */
    protected static boolean checkMisdnSections(MisdnSections org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        MisdnSections copy = null;
        if (obj instanceof MisdnSections) {
            copy = (MisdnSections) obj;

        } else {
            LOGGER.warn("checkMisdnSections failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(MisdnSections.VALUEID_CONTEXT).equals(
                copy.getByValue(MisdnSections.VALUEID_CONTEXT));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : CONTEXT "
                    + org.getByValue(MisdnSections.VALUEID_CONTEXT) + " : "
                    + copy.getByValue(MisdnSections.VALUEID_CONTEXT));

        test = org.getByValue(MisdnSections.VALUEID_LANGUAGE).equals(
                copy.getByValue(MisdnSections.VALUEID_LANGUAGE));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : LANGUAGE "
                    + org.getByValue(MisdnSections.VALUEID_LANGUAGE) + " : "
                    + copy.getByValue(MisdnSections.VALUEID_LANGUAGE));

        test = org.getByValue(MisdnSections.VALUEID_NATIONALPREFIX).equals(
                copy.getByValue(MisdnSections.VALUEID_NATIONALPREFIX));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : NATIONALPREFIX "
                    + org.getByValue(MisdnSections.VALUEID_NATIONALPREFIX)
                    + " : "
                    + copy.getByValue(MisdnSections.VALUEID_NATIONALPREFIX));

        test = org
                .getByValue(MisdnSections.VALUEID_INTERNATIONALPREFIX)
                .equals(
                        copy
                                .getByValue(MisdnSections.VALUEID_INTERNATIONALPREFIX));
        if (!test)
            LOGGER
                    .warn("checkMisdnSections failed : INTERNATIONALPREFIX "
                            + org
                                    .getByValue(MisdnSections.VALUEID_INTERNATIONALPREFIX)
                            + " : "
                            + copy
                                    .getByValue(MisdnSections.VALUEID_INTERNATIONALPREFIX));

        test = org.getByValue(MisdnSections.VALUEID_RXGAIN).equals(
                copy.getByValue(MisdnSections.VALUEID_RXGAIN));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : RXGAIN "
                    + org.getByValue(MisdnSections.VALUEID_RXGAIN) + " : "
                    + copy.getByValue(MisdnSections.VALUEID_RXGAIN));

        test = org.getByValue(MisdnSections.VALUEID_TXGAIN).equals(
                copy.getByValue(MisdnSections.VALUEID_TXGAIN));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : TXGAIN "
                    + org.getByValue(MisdnSections.VALUEID_TXGAIN) + " : "
                    + copy.getByValue(MisdnSections.VALUEID_TXGAIN));

        test = org.getByValue(MisdnSections.VALUEID_TE_CHOOSE_CHANNEL).equals(
                copy.getByValue(MisdnSections.VALUEID_TE_CHOOSE_CHANNEL));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : TE_CHOOSE_CHANNEL "
                    + org.getByValue(MisdnSections.VALUEID_TE_CHOOSE_CHANNEL)
                    + " : "
                    + copy.getByValue(MisdnSections.VALUEID_TE_CHOOSE_CHANNEL));

        test = org.getByValue(MisdnSections.VALUEID_EARLY_BCONNECT).equals(
                copy.getByValue(MisdnSections.VALUEID_EARLY_BCONNECT));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : EARLY_BCONNECT "
                    + org.getByValue(MisdnSections.VALUEID_EARLY_BCONNECT)
                    + " : "
                    + copy.getByValue(MisdnSections.VALUEID_EARLY_BCONNECT));

        test = org.getByValue(MisdnSections.VALUEID_DIALPLAN).equals(
                copy.getByValue(MisdnSections.VALUEID_DIALPLAN));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : DIALPLAN "
                    + org.getByValue(MisdnSections.VALUEID_DIALPLAN) + " : "
                    + copy.getByValue(MisdnSections.VALUEID_DIALPLAN));

        test = org.getByValue(MisdnSections.VALUEID_USE_CALLINGPRES).equals(
                copy.getByValue(MisdnSections.VALUEID_USE_CALLINGPRES));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : USE_CALLINGPRES "
                    + org.getByValue(MisdnSections.VALUEID_USE_CALLINGPRES)
                    + " : "
                    + copy.getByValue(MisdnSections.VALUEID_USE_CALLINGPRES));

        test = org.getByValue(MisdnSections.VALUEID_ALWAYS_IMMEDIATE).equals(
                copy.getByValue(MisdnSections.VALUEID_ALWAYS_IMMEDIATE));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : ALWAYS_IMMEDIATE "
                    + org.getByValue(MisdnSections.VALUEID_ALWAYS_IMMEDIATE)
                    + " : "
                    + copy.getByValue(MisdnSections.VALUEID_ALWAYS_IMMEDIATE));

        test = org.getByValue(MisdnSections.VALUEID_IMMEDIATE).equals(
                copy.getByValue(MisdnSections.VALUEID_IMMEDIATE));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : IMMEDIATE "
                    + org.getByValue(MisdnSections.VALUEID_IMMEDIATE) + " : "
                    + copy.getByValue(MisdnSections.VALUEID_IMMEDIATE));

        test = org.getByValue(MisdnSections.VALUEID_HOLD_ALLOWED).equals(
                copy.getByValue(MisdnSections.VALUEID_HOLD_ALLOWED));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : HOLD_ALLOWED "
                    + org.getByValue(MisdnSections.VALUEID_HOLD_ALLOWED)
                    + " : "
                    + copy.getByValue(MisdnSections.VALUEID_HOLD_ALLOWED));

        test = org.getByValue(MisdnSections.VALUEID_PICKGROUP).equals(
                copy.getByValue(MisdnSections.VALUEID_PICKGROUP));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : PICKGROUP "
                    + org.getByValue(MisdnSections.VALUEID_PICKGROUP) + " : "
                    + copy.getByValue(MisdnSections.VALUEID_PICKGROUP));

        test = org.getByValue(MisdnSections.VALUEID_CALLGROUP).equals(
                copy.getByValue(MisdnSections.VALUEID_CALLGROUP));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : CALLGROUP "
                    + org.getByValue(MisdnSections.VALUEID_CALLGROUP) + " : "
                    + copy.getByValue(MisdnSections.VALUEID_CALLGROUP));

        test = org.getByValue(MisdnSections.VALUEID_PRESENTATION).equals(
                copy.getByValue(MisdnSections.VALUEID_PRESENTATION));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : PRESENTATION "
                    + org.getByValue(MisdnSections.VALUEID_PRESENTATION)
                    + " : "
                    + copy.getByValue(MisdnSections.VALUEID_PRESENTATION));

        test = org.getByValue(MisdnSections.VALUEID_ECHOCANCEL).equals(
                copy.getByValue(MisdnSections.VALUEID_ECHOCANCEL));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : ECHOCANCEL "
                    + org.getByValue(MisdnSections.VALUEID_ECHOCANCEL) + " : "
                    + copy.getByValue(MisdnSections.VALUEID_ECHOCANCEL));

        test = org
                .getByValue(MisdnSections.VALUEID_ECHOCANCELWHENBRIDGED)
                .equals(
                        copy
                                .getByValue(MisdnSections.VALUEID_ECHOCANCELWHENBRIDGED));
        if (!test)
            LOGGER
                    .warn("checkMisdnSections failed : ECHOCANCELWHENBRIDGED "
                            + org
                                    .getByValue(MisdnSections.VALUEID_ECHOCANCELWHENBRIDGED)
                            + " : "
                            + copy
                                    .getByValue(MisdnSections.VALUEID_ECHOCANCELWHENBRIDGED));

        test = org.getByValue(MisdnSections.VALUEID_ECHOTRAINING).equals(
                copy.getByValue(MisdnSections.VALUEID_ECHOTRAINING));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : ECHOTRAINING "
                    + org.getByValue(MisdnSections.VALUEID_ECHOTRAINING)
                    + " : "
                    + copy.getByValue(MisdnSections.VALUEID_ECHOTRAINING));

        test = org.getByValue(MisdnSections.VALUEID_SECTIONNAME).equals(
                copy.getByValue(MisdnSections.VALUEID_SECTIONNAME));
        if (!test)
            LOGGER.warn("checkMisdnSections failed : SECTIONNAME "
                    + org.getByValue(MisdnSections.VALUEID_SECTIONNAME) + " : "
                    + copy.getByValue(MisdnSections.VALUEID_SECTIONNAME));

        // ---------------agg
        // -----------------map
        test = org.getMisdnPortsMap().size() == copy.getMisdnPortsMap().size();

        if (!test) {
            LOGGER.warn("checkMisdnSections failed : misdnPortsMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getMisdnPortsMap().size(); i++) {
            test = checkMisdnPorts(org.getMisdnPortsMap().get(i), copy
                    .getMisdnPortsMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkMisdnSections failed : misdnPortsMap  equals "
                                + i
                                + " "
                                + org.getMisdnPortsMap().get(i)
                                + " : " + copy.getMisdnPortsMap().get(i));
                return test;
            }
        }// end of for i to org.getMisdnPortsMap()

        // newMisdnSections.addMisdnPorts(createMisdnPorts());
        return test;
    }

    /*
     * überprüft MisdnPorts
     */
    protected static boolean checkMisdnPorts(MisdnPorts org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        MisdnPorts copy = null;
        if (obj instanceof MisdnPorts) {
            copy = (MisdnPorts) obj;

        } else {
            LOGGER.warn("checkMisdnPorts failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(MisdnPorts.VALUEID_PORTN).equals(
                copy.getByValue(MisdnPorts.VALUEID_PORTN));
        if (!test)
            LOGGER.warn("checkMisdnPorts failed : PORTN "
                    + org.getByValue(MisdnPorts.VALUEID_PORTN) + " : "
                    + copy.getByValue(MisdnPorts.VALUEID_PORTN));

        test = org.getByValue(MisdnPorts.VALUEID_PORTOPTION).equals(
                copy.getByValue(MisdnPorts.VALUEID_PORTOPTION));
        if (!test)
            LOGGER.warn("checkMisdnPorts failed : PORTOPTION "
                    + org.getByValue(MisdnPorts.VALUEID_PORTOPTION) + " : "
                    + copy.getByValue(MisdnPorts.VALUEID_PORTOPTION));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * erzeugt und initalisiert Misdnconf
     */
    protected static Misdnconf createMisdnconf() {
        Misdnconf newMisdnconf = new MisdnconfImpl();
        // fields
        newMisdnconf.setByValue(Misdnconf.VALUEID_DEBUG, Integer.valueOf(0));
        newMisdnconf.setByValue(Misdnconf.VALUEID_TRACEFILE, "TRACEFILE");
        newMisdnconf.setByValue(Misdnconf.VALUEID_TRACE_CALLS, Boolean.TRUE);
        newMisdnconf.setByValue(Misdnconf.VALUEID_TRACE_DIR, "TRACE_DIR");
        newMisdnconf.setByValue(Misdnconf.VALUEID_BRIDGING, Boolean.TRUE);
        newMisdnconf.setByValue(Misdnconf.VALUEID_STOP_TONE_AFTER_FIRST_DIGIT,
                Boolean.TRUE);
        newMisdnconf.setByValue(Misdnconf.VALUEID_APPEND_DIGITS2EXTEN,
                Boolean.TRUE);
        newMisdnconf.setByValue(Misdnconf.VALUEID_L1_INFO_OK, Boolean.TRUE);
        newMisdnconf.setByValue(Misdnconf.VALUEID_CLEAR_L3, Boolean.TRUE);
        newMisdnconf.setByValue(Misdnconf.VALUEID_DYNAMIC_CRYPT, Boolean.TRUE);
        newMisdnconf.setByValue(Misdnconf.VALUEID_CRYPT_PREFIX, "CRYPT_PREFIX");
        newMisdnconf.setByValue(Misdnconf.VALUEID_FILEID, "FILEID");
        newMisdnconf.setByValue(Misdnconf.VALUEID_CONTEXT, new PbxContext(""));
        // agg
        newMisdnconf.setMisdnSections(createMisdnSections("default"));
        // map
        newMisdnconf.addMisdnCryptkey(createMisdnCryptkey());
        newMisdnconf.addMisdnSections(createMisdnSections("section"));
        return newMisdnconf;
    }

    /*
     * erzeugt und initalisiert MisdnCryptkey
     */
    protected static MisdnCryptkey createMisdnCryptkey() {
        MisdnCryptkey newMisdnCryptkey = new MisdnCryptkeyImpl();
        // fields
        newMisdnCryptkey.setByValue(MisdnCryptkey.VALUEID_KEYNAME, "KEYNAME");
        newMisdnCryptkey.setByValue(MisdnCryptkey.VALUEID_KEYVALUE, "KEYVALUE");
        // agg
        // map
        return newMisdnCryptkey;
    }

    /*
     * erzeugt und initalisiert MisdnSections
     */
    protected static MisdnSections createMisdnSections(String string) {
        MisdnSections newMisdnSections = new MisdnSectionsImpl();
        // fields
        newMisdnSections.setByValue(MisdnSections.VALUEID_CONTEXT,
                new PbxContext(""));
        newMisdnSections.setByValue(MisdnSections.VALUEID_LANGUAGE, "LANGUAGE");
        newMisdnSections.setByValue(MisdnSections.VALUEID_NATIONALPREFIX,
                "NATIONALPREFIX");
        newMisdnSections.setByValue(MisdnSections.VALUEID_INTERNATIONALPREFIX,
                "INTERNATIONALPREFIX");
        newMisdnSections.setByValue(MisdnSections.VALUEID_RXGAIN, Integer
                .valueOf(0));
        newMisdnSections.setByValue(MisdnSections.VALUEID_TXGAIN, Integer
                .valueOf(0));
        newMisdnSections.setByValue(MisdnSections.VALUEID_TE_CHOOSE_CHANNEL,
                Boolean.TRUE);
        newMisdnSections.setByValue(MisdnSections.VALUEID_EARLY_BCONNECT,
                Boolean.TRUE);
        newMisdnSections.setByValue(MisdnSections.VALUEID_DIALPLAN,
                new Dialplan("subscriber"));
        newMisdnSections.setByValue(MisdnSections.VALUEID_USE_CALLINGPRES,
                Boolean.TRUE);
        newMisdnSections.setByValue(MisdnSections.VALUEID_ALWAYS_IMMEDIATE,
                Boolean.TRUE);
        newMisdnSections.setByValue(MisdnSections.VALUEID_IMMEDIATE,
                Boolean.TRUE);
        newMisdnSections.setByValue(MisdnSections.VALUEID_HOLD_ALLOWED,
                Boolean.TRUE);
        newMisdnSections.setByValue(MisdnSections.VALUEID_PICKGROUP,
                "PICKGROUP");
        newMisdnSections.setByValue(MisdnSections.VALUEID_CALLGROUP,
                "CALLGROUP");
        newMisdnSections.setByValue(MisdnSections.VALUEID_PRESENTATION,
                new Presentation("not_screened"));
        newMisdnSections.setByValue(MisdnSections.VALUEID_ECHOCANCEL,
                Boolean.TRUE);
        newMisdnSections.setByValue(
                MisdnSections.VALUEID_ECHOCANCELWHENBRIDGED, Boolean.TRUE);
        newMisdnSections.setByValue(MisdnSections.VALUEID_ECHOTRAINING,
                "ECHOTRAINING");
        newMisdnSections.setByValue(MisdnSections.VALUEID_SECTIONNAME, string);
        // agg
        // map
        newMisdnSections.addMisdnPorts(createMisdnPorts());
        return newMisdnSections;
    }

    /*
     * erzeugt und initalisiert MisdnPorts
     */
    protected static MisdnPorts createMisdnPorts() {
        MisdnPorts newMisdnPorts = new MisdnPortsImpl();
        // fields
        newMisdnPorts.setByValue(MisdnPorts.VALUEID_PORTN, Integer.valueOf(0));
        newMisdnPorts.setByValue(MisdnPorts.VALUEID_PORTOPTION,
                new MisdnPortOptions("te_ptp"));
        // agg
        // map
        return newMisdnPorts;
    }

}
