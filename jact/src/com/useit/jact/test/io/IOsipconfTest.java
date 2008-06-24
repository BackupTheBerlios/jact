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
import com.useit.jact.model.sipconf.MMFsipconf;
import com.useit.jact.model.sipconf.SipConf;
import com.useit.jact.model.sipconf.SipConfImpl;
import com.useit.jact.model.sipconf.Sipauth;
import com.useit.jact.model.sipconf.SipauthImpl;
import com.useit.jact.model.sipconf.Sipgeneral;
import com.useit.jact.model.sipconf.SipgeneralImpl;
import com.useit.jact.model.sipconf.Sippeers;
import com.useit.jact.model.sipconf.SippeersImpl;
import com.useit.jact.model.sipconf.Sipregister;
import com.useit.jact.model.sipconf.SipregisterImpl;
import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.Dtmfmode;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;

/**
 * <p>
 * IOsipconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOsipconfTest.java,v 1.4 2006/01/13 16:54:44
 *          urs Exp $
 */
public class IOsipconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(IOsipconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOsipconfTest.class);
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

    // public final void testSipregisterLoadSaveXML() {
    // Sipregister Obj = createSipregister();
    // MMFsipconf.getInstance().writeConfXML("temp/Sipregister.xml", Obj);
    // Object object =
    // MMFsipconf.getInstance().readConfXML("temp/Sipregister.xml");
    // assertEquals("load save XML Sipregister",true,checkSipregister(Obj,
    // object));
    // }
    // public final void testSipauthLoadSaveXML() {
    // Sipauth Obj = createSipauth();
    // MMFsipconf.getInstance().writeConfXML("temp/Sipauth.xml", Obj);
    // Object object = MMFsipconf.getInstance().readConfXML("temp/Sipauth.xml");
    // assertEquals("load save XML Sipauth",true,checkSipauth(Obj, object));
    // }
    public final void testSipConfLoadSaveXML() {
        SipConf Obj = createSipConf();
        MMFsipconf.getInstance().writeConfXML("temp/SipConf.xml", Obj);
        Object object = MMFsipconf.getInstance()
                .readConfXML("temp/SipConf.xml");
        assertEquals("load save XML SipConf", true, checkSipConf(Obj, object));
    }

    // public final void testSippeersLoadSaveXML() {
    // Sippeers Obj = createSippeers();
    // MMFsipconf.getInstance().writeConfXML("temp/Sippeers.xml", Obj);
    // Object object =
    // MMFsipconf.getInstance().readConfXML("temp/Sippeers.xml");
    // assertEquals("load save XML Sippeers",true,checkSippeers(Obj, object));
    // }
    // public final void testSipgeneralLoadSaveXML() {
    // Sipgeneral Obj = createSipgeneral();
    // MMFsipconf.getInstance().writeConfXML("temp/Sipgeneral.xml", Obj);
    // Object object =
    // MMFsipconf.getInstance().readConfXML("temp/Sipgeneral.xml");
    // assertEquals("load save XML Sipgeneral",true,checkSipgeneral(Obj,
    // object));
    // }
    //	
    // public final void testSipregisterloadSaveConf() {
    // Sipregister Obj = createSipregister();
    // try{
    // MMFsipconf.getInstance().writetoFile(Obj,"temp/Sipregister.cfg");
    // Object object = MMFsipconf.getInstance().readConf(new
    // File("temp/Sipregister.cfg"));
    // assertEquals("load save conf
    // Sipregister",true,checkSipregister(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testSipregisterloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testSipregisterloadSaveConf()", e);
    // }
    // }
    // public final void testSipauthloadSaveConf() {
    // Sipauth Obj = createSipauth();
    // try{
    // MMFsipconf.getInstance().writetoFile(Obj,"temp/Sipauth.cfg");
    // Object object = MMFsipconf.getInstance().readConf(new
    // File("temp/Sipauth.cfg"));
    // assertEquals("load save conf Sipauth",true,checkSipauth(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testSipauthloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testSipauthloadSaveConf()", e);
    // }
    // }
    public final void testSipConfloadSaveConf() {
        SipConf Obj = createSipConf();
        try {
            MMFsipconf.getInstance().writetoFile(Obj, "temp/SipConf.cfg");
            Object object = MMFsipconf.getInstance().readConf(
                    new File("temp/SipConf.cfg"));
            assertEquals("load save conf SipConf", true, checkSipConf(Obj,
                    object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testSipConfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testSipConfloadSaveConf()", e);
        }
    }

    // public final void testSippeersloadSaveConf() {
    // Sippeers Obj = createSippeers();
    // try{
    // MMFsipconf.getInstance().writetoFile(Obj,"temp/Sippeers.cfg");
    // Object object = MMFsipconf.getInstance().readConf(new
    // File("temp/Sippeers.cfg"));
    // assertEquals("load save conf Sippeers",true,checkSippeers(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testSippeersloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testSippeersloadSaveConf()", e);
    // }
    // }
    // public final void testSipgeneralloadSaveConf() {
    // Sipgeneral Obj = createSipgeneral();
    // try{
    // MMFsipconf.getInstance().writetoFile(Obj,"temp/Sipgeneral.cfg");
    // Object object = MMFsipconf.getInstance().readConf(new
    // File("temp/Sipgeneral.cfg"));
    // assertEquals("load save conf
    // Sipgeneral",true,checkSipgeneral(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testSipgeneralloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testSipgeneralloadSaveConf()", e);
    // }
    // }

    public final void testSipregisterLoadSaveHibernate() {
        Sipregister Obj = createSipregister();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testSipregisterLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(SipregisterImpl.class, Obj.getId());
        assertEquals("load save Sipregister", Obj, object);

    }

    public final void testSipauthLoadSaveHibernate() {
        Sipauth Obj = createSipauth();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testSipauthLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(SipauthImpl.class, Obj.getId());
        assertEquals("load save Sipauth", Obj, object);

    }

    public final void testSipConfLoadSaveHibernate() {
        SipConf Obj = createSipConf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testSipConfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(SipConfImpl.class, Obj.getId());
        assertEquals("load save SipConf", Obj, object);

    }

    public final void testSippeersLoadSaveHibernate() {
        Sippeers Obj = createSippeers();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testSippeersLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(SippeersImpl.class, Obj.getId());
        assertEquals("load save Sippeers", Obj, object);

    }

    public final void testSipgeneralLoadSaveHibernate() {
        Sipgeneral Obj = createSipgeneral();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testSipgeneralLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(SipgeneralImpl.class, Obj.getId());
        assertEquals("load save Sipgeneral", Obj, object);

    }

    /*
     * überprüft Sipregister
     */
    protected static boolean checkSipregister(Sipregister org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Sipregister copy = null;
        if (obj instanceof Sipregister) {
            copy = (Sipregister) obj;

        } else {
            LOGGER.warn("checkSipregister failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Sipregister.VALUEID_USER).equals(
                copy.getByValue(Sipregister.VALUEID_USER));
        if (!test)
            LOGGER.warn("checkSipregister failed : USER "
                    + org.getByValue(Sipregister.VALUEID_USER) + " : "
                    + copy.getByValue(Sipregister.VALUEID_USER));

        test = org.getByValue(Sipregister.VALUEID_AUTHUSER).equals(
                copy.getByValue(Sipregister.VALUEID_AUTHUSER));
        if (!test)
            LOGGER.warn("checkSipregister failed : AUTHUSER "
                    + org.getByValue(Sipregister.VALUEID_AUTHUSER) + " : "
                    + copy.getByValue(Sipregister.VALUEID_AUTHUSER));

        test = org.getByValue(Sipregister.VALUEID_SECRET).equals(
                copy.getByValue(Sipregister.VALUEID_SECRET));
        if (!test)
            LOGGER.warn("checkSipregister failed : SECRET "
                    + org.getByValue(Sipregister.VALUEID_SECRET) + " : "
                    + copy.getByValue(Sipregister.VALUEID_SECRET));

        test = org.getByValue(Sipregister.VALUEID_HOST).equals(
                copy.getByValue(Sipregister.VALUEID_HOST));
        if (!test)
            LOGGER.warn("checkSipregister failed : HOST "
                    + org.getByValue(Sipregister.VALUEID_HOST) + " : "
                    + copy.getByValue(Sipregister.VALUEID_HOST));

        test = org.getByValue(Sipregister.VALUEID_PORT).equals(
                copy.getByValue(Sipregister.VALUEID_PORT));
        if (!test)
            LOGGER.warn("checkSipregister failed : PORT "
                    + org.getByValue(Sipregister.VALUEID_PORT) + " : "
                    + copy.getByValue(Sipregister.VALUEID_PORT));

        test = org.getByValue(Sipregister.VALUEID_EXTENSION).equals(
                copy.getByValue(Sipregister.VALUEID_EXTENSION));
        if (!test)
            LOGGER.warn("checkSipregister failed : EXTENSION "
                    + org.getByValue(Sipregister.VALUEID_EXTENSION) + " : "
                    + copy.getByValue(Sipregister.VALUEID_EXTENSION));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Sipauth
     */
    protected static boolean checkSipauth(Sipauth org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Sipauth copy = null;
        if (obj instanceof Sipauth) {
            copy = (Sipauth) obj;

        } else {
            LOGGER.warn("checkSipauth failed : cast " + org.getClass() + " : "
                    + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Sipauth.VALUEID_USER).equals(
                copy.getByValue(Sipauth.VALUEID_USER));
        if (!test)
            LOGGER.warn("checkSipauth failed : USER "
                    + org.getByValue(Sipauth.VALUEID_USER) + " : "
                    + copy.getByValue(Sipauth.VALUEID_USER));

        test = org.getByValue(Sipauth.VALUEID_SECRET).equals(
                copy.getByValue(Sipauth.VALUEID_SECRET));
        if (!test)
            LOGGER.warn("checkSipauth failed : SECRET "
                    + org.getByValue(Sipauth.VALUEID_SECRET) + " : "
                    + copy.getByValue(Sipauth.VALUEID_SECRET));

        test = org.getByValue(Sipauth.VALUEID_MD5SECRET).equals(
                copy.getByValue(Sipauth.VALUEID_MD5SECRET));
        if (!test)
            LOGGER.warn("checkSipauth failed : MD5SECRET "
                    + org.getByValue(Sipauth.VALUEID_MD5SECRET) + " : "
                    + copy.getByValue(Sipauth.VALUEID_MD5SECRET));

        test = org.getByValue(Sipauth.VALUEID_REALM).equals(
                copy.getByValue(Sipauth.VALUEID_REALM));
        if (!test)
            LOGGER.warn("checkSipauth failed : REALM "
                    + org.getByValue(Sipauth.VALUEID_REALM) + " : "
                    + copy.getByValue(Sipauth.VALUEID_REALM));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft SipConf
     */
    protected static boolean checkSipConf(SipConf org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        SipConf copy = null;
        if (obj instanceof SipConf) {
            copy = (SipConf) obj;

        } else {
            LOGGER.warn("checkSipConf failed : cast " + org.getClass() + " : "
                    + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        // ---------------agg
        test = checkSipgeneral(org.getSipgeneral(), copy.getSipgeneral());
        if (!test)
            LOGGER.warn("checkSipConf failed : sipgeneral " + org.toString()
                    + " : " + copy.toString());
        // -----------------map
        test = org.getSippeersMap().size() == copy.getSippeersMap().size();

        if (!test) {
            LOGGER.warn("checkSipConf failed : sippeersMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getSippeersMap().size(); i++) {
            test = checkSippeers(org.getSippeersMap().get(i), copy
                    .getSippeersMap().get(i));

            if (!test) {
                LOGGER.warn("checkSipConf failed : sippeersMap  equals " + i
                        + " " + org.getSippeersMap().get(i) + " : "
                        + copy.getSippeersMap().get(i));
                return test;
            }
        }// end of for i to org.getSippeersMap()

        // newSipConf.addSippeers(createSippeers());
        return test;
    }

    /*
     * überprüft Sippeers
     */
    protected static boolean checkSippeers(Sippeers org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Sippeers copy = null;
        if (obj instanceof Sippeers) {
            copy = (Sippeers) obj;

        } else {
            LOGGER.warn("checkSippeers failed : cast " + org.getClass() + " : "
                    + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Sippeers.VALUEID_SECTIONNAME).equals(
                copy.getByValue(Sippeers.VALUEID_SECTIONNAME));
        if (!test)
            LOGGER.warn("checkSippeers failed : SECTIONNAME "
                    + org.getByValue(Sippeers.VALUEID_SECTIONNAME) + " : "
                    + copy.getByValue(Sippeers.VALUEID_SECTIONNAME));

        test = org.getByValue(Sippeers.VALUEID_ACCOUNTCODE).equals(
                copy.getByValue(Sippeers.VALUEID_ACCOUNTCODE));
        if (!test)
            LOGGER.warn("checkSippeers failed : ACCOUNTCODE "
                    + org.getByValue(Sippeers.VALUEID_ACCOUNTCODE) + " : "
                    + copy.getByValue(Sippeers.VALUEID_ACCOUNTCODE));

        test = org.getByValue(Sippeers.VALUEID_AMAFLAGS).equals(
                copy.getByValue(Sippeers.VALUEID_AMAFLAGS));
        if (!test)
            LOGGER.warn("checkSippeers failed : AMAFLAGS "
                    + org.getByValue(Sippeers.VALUEID_AMAFLAGS) + " : "
                    + copy.getByValue(Sippeers.VALUEID_AMAFLAGS));

        test = org.getByValue(Sippeers.VALUEID_CALLGROUP).equals(
                copy.getByValue(Sippeers.VALUEID_CALLGROUP));
        if (!test)
            LOGGER.warn("checkSippeers failed : CALLGROUP "
                    + org.getByValue(Sippeers.VALUEID_CALLGROUP) + " : "
                    + copy.getByValue(Sippeers.VALUEID_CALLGROUP));

        test = org.getByValue(Sippeers.VALUEID_CANREINVITE).equals(
                copy.getByValue(Sippeers.VALUEID_CANREINVITE));
        if (!test)
            LOGGER.warn("checkSippeers failed : CANREINVITE "
                    + org.getByValue(Sippeers.VALUEID_CANREINVITE) + " : "
                    + copy.getByValue(Sippeers.VALUEID_CANREINVITE));

        test = org.getByValue(Sippeers.VALUEID_CONTEXT).equals(
                copy.getByValue(Sippeers.VALUEID_CONTEXT));
        if (!test)
            LOGGER.warn("checkSippeers failed : CONTEXT "
                    + org.getByValue(Sippeers.VALUEID_CONTEXT) + " : "
                    + copy.getByValue(Sippeers.VALUEID_CONTEXT));

        test = org.getByValue(Sippeers.VALUEID_DEFAULTIP).equals(
                copy.getByValue(Sippeers.VALUEID_DEFAULTIP));
        if (!test)
            LOGGER.warn("checkSippeers failed : DEFAULTIP "
                    + org.getByValue(Sippeers.VALUEID_DEFAULTIP) + " : "
                    + copy.getByValue(Sippeers.VALUEID_DEFAULTIP));

        test = org.getByValue(Sippeers.VALUEID_DTMFMODE).equals(
                copy.getByValue(Sippeers.VALUEID_DTMFMODE));
        if (!test)
            LOGGER.warn("checkSippeers failed : DTMFMODE "
                    + org.getByValue(Sippeers.VALUEID_DTMFMODE) + " : "
                    + copy.getByValue(Sippeers.VALUEID_DTMFMODE));

        test = org.getByValue(Sippeers.VALUEID_FROMUSER).equals(
                copy.getByValue(Sippeers.VALUEID_FROMUSER));
        if (!test)
            LOGGER.warn("checkSippeers failed : FROMUSER "
                    + org.getByValue(Sippeers.VALUEID_FROMUSER) + " : "
                    + copy.getByValue(Sippeers.VALUEID_FROMUSER));

        test = org.getByValue(Sippeers.VALUEID_FROMDOMAIN).equals(
                copy.getByValue(Sippeers.VALUEID_FROMDOMAIN));
        if (!test)
            LOGGER.warn("checkSippeers failed : FROMDOMAIN "
                    + org.getByValue(Sippeers.VALUEID_FROMDOMAIN) + " : "
                    + copy.getByValue(Sippeers.VALUEID_FROMDOMAIN));

        test = org.getByValue(Sippeers.VALUEID_HOST).equals(
                copy.getByValue(Sippeers.VALUEID_HOST));
        if (!test)
            LOGGER.warn("checkSippeers failed : HOST "
                    + org.getByValue(Sippeers.VALUEID_HOST) + " : "
                    + copy.getByValue(Sippeers.VALUEID_HOST));

        test = org.getByValue(Sippeers.VALUEID_INCOMINGLIMIT).equals(
                copy.getByValue(Sippeers.VALUEID_INCOMINGLIMIT));
        if (!test)
            LOGGER.warn("checkSippeers failed : INCOMINGLIMIT "
                    + org.getByValue(Sippeers.VALUEID_INCOMINGLIMIT) + " : "
                    + copy.getByValue(Sippeers.VALUEID_INCOMINGLIMIT));

        test = org.getByValue(Sippeers.VALUEID_OUTGOINGLIMIT).equals(
                copy.getByValue(Sippeers.VALUEID_OUTGOINGLIMIT));
        if (!test)
            LOGGER.warn("checkSippeers failed : OUTGOINGLIMIT "
                    + org.getByValue(Sippeers.VALUEID_OUTGOINGLIMIT) + " : "
                    + copy.getByValue(Sippeers.VALUEID_OUTGOINGLIMIT));

        test = org.getByValue(Sippeers.VALUEID_INSECURE).equals(
                copy.getByValue(Sippeers.VALUEID_INSECURE));
        if (!test)
            LOGGER.warn("checkSippeers failed : INSECURE "
                    + org.getByValue(Sippeers.VALUEID_INSECURE) + " : "
                    + copy.getByValue(Sippeers.VALUEID_INSECURE));

        test = org.getByValue(Sippeers.VALUEID_LANGUAGE).equals(
                copy.getByValue(Sippeers.VALUEID_LANGUAGE));
        if (!test)
            LOGGER.warn("checkSippeers failed : LANGUAGE "
                    + org.getByValue(Sippeers.VALUEID_LANGUAGE) + " : "
                    + copy.getByValue(Sippeers.VALUEID_LANGUAGE));

        test = org.getByValue(Sippeers.VALUEID_MAILBOX).equals(
                copy.getByValue(Sippeers.VALUEID_MAILBOX));
        if (!test)
            LOGGER.warn("checkSippeers failed : MAILBOX "
                    + org.getByValue(Sippeers.VALUEID_MAILBOX) + " : "
                    + copy.getByValue(Sippeers.VALUEID_MAILBOX));

        test = org.getByValue(Sippeers.VALUEID_MD5SECRET).equals(
                copy.getByValue(Sippeers.VALUEID_MD5SECRET));
        if (!test)
            LOGGER.warn("checkSippeers failed : MD5SECRET "
                    + org.getByValue(Sippeers.VALUEID_MD5SECRET) + " : "
                    + copy.getByValue(Sippeers.VALUEID_MD5SECRET));

        test = org.getByValue(Sippeers.VALUEID_NAT).equals(
                copy.getByValue(Sippeers.VALUEID_NAT));
        if (!test)
            LOGGER.warn("checkSippeers failed : NAT "
                    + org.getByValue(Sippeers.VALUEID_NAT) + " : "
                    + copy.getByValue(Sippeers.VALUEID_NAT));

        test = org.getByValue(Sippeers.VALUEID_PICKUPGROUP).equals(
                copy.getByValue(Sippeers.VALUEID_PICKUPGROUP));
        if (!test)
            LOGGER.warn("checkSippeers failed : PICKUPGROUP "
                    + org.getByValue(Sippeers.VALUEID_PICKUPGROUP) + " : "
                    + copy.getByValue(Sippeers.VALUEID_PICKUPGROUP));

        test = org.getByValue(Sippeers.VALUEID_PORT).equals(
                copy.getByValue(Sippeers.VALUEID_PORT));
        if (!test)
            LOGGER.warn("checkSippeers failed : PORT "
                    + org.getByValue(Sippeers.VALUEID_PORT) + " : "
                    + copy.getByValue(Sippeers.VALUEID_PORT));

        test = org.getByValue(Sippeers.VALUEID_QUALIFY).equals(
                copy.getByValue(Sippeers.VALUEID_QUALIFY));
        if (!test)
            LOGGER.warn("checkSippeers failed : QUALIFY "
                    + org.getByValue(Sippeers.VALUEID_QUALIFY) + " : "
                    + copy.getByValue(Sippeers.VALUEID_QUALIFY));

        test = org.getByValue(Sippeers.VALUEID_RESTRICTCID).equals(
                copy.getByValue(Sippeers.VALUEID_RESTRICTCID));
        if (!test)
            LOGGER.warn("checkSippeers failed : RESTRICTCID "
                    + org.getByValue(Sippeers.VALUEID_RESTRICTCID) + " : "
                    + copy.getByValue(Sippeers.VALUEID_RESTRICTCID));

        test = org.getByValue(Sippeers.VALUEID_RTPTIMEOUT).equals(
                copy.getByValue(Sippeers.VALUEID_RTPTIMEOUT));
        if (!test)
            LOGGER.warn("checkSippeers failed : RTPTIMEOUT "
                    + org.getByValue(Sippeers.VALUEID_RTPTIMEOUT) + " : "
                    + copy.getByValue(Sippeers.VALUEID_RTPTIMEOUT));

        test = org.getByValue(Sippeers.VALUEID_RTPHOLDTIMEOUT).equals(
                copy.getByValue(Sippeers.VALUEID_RTPHOLDTIMEOUT));
        if (!test)
            LOGGER.warn("checkSippeers failed : RTPHOLDTIMEOUT "
                    + org.getByValue(Sippeers.VALUEID_RTPHOLDTIMEOUT) + " : "
                    + copy.getByValue(Sippeers.VALUEID_RTPHOLDTIMEOUT));

        test = org.getByValue(Sippeers.VALUEID_SECRET).equals(
                copy.getByValue(Sippeers.VALUEID_SECRET));
        if (!test)
            LOGGER.warn("checkSippeers failed : SECRET "
                    + org.getByValue(Sippeers.VALUEID_SECRET) + " : "
                    + copy.getByValue(Sippeers.VALUEID_SECRET));

        test = org.getByValue(Sippeers.VALUEID_TYPE).equals(
                copy.getByValue(Sippeers.VALUEID_TYPE));
        if (!test)
            LOGGER.warn("checkSippeers failed : TYPE "
                    + org.getByValue(Sippeers.VALUEID_TYPE) + " : "
                    + copy.getByValue(Sippeers.VALUEID_TYPE));

        test = org.getByValue(Sippeers.VALUEID_USERNAME).equals(
                copy.getByValue(Sippeers.VALUEID_USERNAME));
        if (!test)
            LOGGER.warn("checkSippeers failed : USERNAME "
                    + org.getByValue(Sippeers.VALUEID_USERNAME) + " : "
                    + copy.getByValue(Sippeers.VALUEID_USERNAME));

        test = org.getByValue(Sippeers.VALUEID_MUSICONHOLD).equals(
                copy.getByValue(Sippeers.VALUEID_MUSICONHOLD));
        if (!test)
            LOGGER.warn("checkSippeers failed : MUSICONHOLD "
                    + org.getByValue(Sippeers.VALUEID_MUSICONHOLD) + " : "
                    + copy.getByValue(Sippeers.VALUEID_MUSICONHOLD));

        test = org.getByValue(Sippeers.VALUEID_CALLERID).equals(
                copy.getByValue(Sippeers.VALUEID_CALLERID));
        if (!test)
            LOGGER.warn("checkSippeers failed : CALLERID "
                    + org.getByValue(Sippeers.VALUEID_CALLERID) + " : "
                    + copy.getByValue(Sippeers.VALUEID_CALLERID));

        test = org.getByValue(Sippeers.VALUEID_DISALLOW).equals(
                copy.getByValue(Sippeers.VALUEID_DISALLOW));
        if (!test)
            LOGGER.warn("checkSippeers failed : DISALLOW "
                    + org.getByValue(Sippeers.VALUEID_DISALLOW) + " : "
                    + copy.getByValue(Sippeers.VALUEID_DISALLOW));

        test = org.getByValue(Sippeers.VALUEID_ALLOW).equals(
                copy.getByValue(Sippeers.VALUEID_ALLOW));
        if (!test)
            LOGGER.warn("checkSippeers failed : ALLOW "
                    + org.getByValue(Sippeers.VALUEID_ALLOW) + " : "
                    + copy.getByValue(Sippeers.VALUEID_ALLOW));

        // ---------------agg
        // -----------------map
        test = org.getSipauthMap().size() == copy.getSipauthMap().size();

        if (!test) {
            LOGGER.warn("checkSippeers failed : sipauthMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getSipauthMap().size(); i++) {
            test = checkSipauth(org.getSipauthMap().get(i), copy
                    .getSipauthMap().get(i));

            if (!test) {
                LOGGER.warn("checkSippeers failed : sipauthMap  equals " + i
                        + " " + org.getSipauthMap().get(i) + " : "
                        + copy.getSipauthMap().get(i));
                return test;
            }
        }// end of for i to org.getSipauthMap()

        // newSippeers.addSipauth(createSipauth());
        return test;
    }

    /*
     * überprüft Sipgeneral
     */
    protected static boolean checkSipgeneral(Sipgeneral org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Sipgeneral copy = null;
        if (obj instanceof Sipgeneral) {
            copy = (Sipgeneral) obj;

        } else {
            LOGGER.warn("checkSipgeneral failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Sipgeneral.VALUEID_AUTOCREATEPEER).equals(
                copy.getByValue(Sipgeneral.VALUEID_AUTOCREATEPEER));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : AUTOCREATEPEER "
                    + org.getByValue(Sipgeneral.VALUEID_AUTOCREATEPEER) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_AUTOCREATEPEER));

        test = org.getByValue(Sipgeneral.VALUEID_BINDADDR).equals(
                copy.getByValue(Sipgeneral.VALUEID_BINDADDR));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : BINDADDR "
                    + org.getByValue(Sipgeneral.VALUEID_BINDADDR) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_BINDADDR));

        test = org.getByValue(Sipgeneral.VALUEID_BINDPORT).equals(
                copy.getByValue(Sipgeneral.VALUEID_BINDPORT));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : BINDPORT "
                    + org.getByValue(Sipgeneral.VALUEID_BINDPORT) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_BINDPORT));

        test = org.getByValue(Sipgeneral.VALUEID_CANREINVITE).equals(
                copy.getByValue(Sipgeneral.VALUEID_CANREINVITE));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : CANREINVITE "
                    + org.getByValue(Sipgeneral.VALUEID_CANREINVITE) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_CANREINVITE));

        test = org.getByValue(Sipgeneral.VALUEID_CONTEXT).equals(
                copy.getByValue(Sipgeneral.VALUEID_CONTEXT));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : CONTEXT "
                    + org.getByValue(Sipgeneral.VALUEID_CONTEXT) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_CONTEXT));

        test = org.getByValue(Sipgeneral.VALUEID_DEFAULTEXPIREY).equals(
                copy.getByValue(Sipgeneral.VALUEID_DEFAULTEXPIREY));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : DEFAULTEXPIREY "
                    + org.getByValue(Sipgeneral.VALUEID_DEFAULTEXPIREY) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_DEFAULTEXPIREY));

        test = org.getByValue(Sipgeneral.VALUEID_DTMFMODE).equals(
                copy.getByValue(Sipgeneral.VALUEID_DTMFMODE));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : DTMFMODE "
                    + org.getByValue(Sipgeneral.VALUEID_DTMFMODE) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_DTMFMODE));

        test = org.getByValue(Sipgeneral.VALUEID_EXTERNIP).equals(
                copy.getByValue(Sipgeneral.VALUEID_EXTERNIP));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : EXTERNIP "
                    + org.getByValue(Sipgeneral.VALUEID_EXTERNIP) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_EXTERNIP));

        test = org.getByValue(Sipgeneral.VALUEID_EXTERNHOST).equals(
                copy.getByValue(Sipgeneral.VALUEID_EXTERNHOST));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : EXTERNHOST "
                    + org.getByValue(Sipgeneral.VALUEID_EXTERNHOST) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_EXTERNHOST));

        test = org.getByValue(Sipgeneral.VALUEID_EXTERNREFRESH).equals(
                copy.getByValue(Sipgeneral.VALUEID_EXTERNREFRESH));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : EXTERNREFRESH "
                    + org.getByValue(Sipgeneral.VALUEID_EXTERNREFRESH) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_EXTERNREFRESH));

        test = org.getByValue(Sipgeneral.VALUEID_LOCALNET).equals(
                copy.getByValue(Sipgeneral.VALUEID_LOCALNET));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : LOCALNET "
                    + org.getByValue(Sipgeneral.VALUEID_LOCALNET) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_LOCALNET));

        test = org.getByValue(Sipgeneral.VALUEID_FROMDOMAIN).equals(
                copy.getByValue(Sipgeneral.VALUEID_FROMDOMAIN));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : FROMDOMAIN "
                    + org.getByValue(Sipgeneral.VALUEID_FROMDOMAIN) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_FROMDOMAIN));

        test = org.getByValue(Sipgeneral.VALUEID_MAXEXPIREY).equals(
                copy.getByValue(Sipgeneral.VALUEID_MAXEXPIREY));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : MAXEXPIREY "
                    + org.getByValue(Sipgeneral.VALUEID_MAXEXPIREY) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_MAXEXPIREY));

        test = org.getByValue(Sipgeneral.VALUEID_NAT).equals(
                copy.getByValue(Sipgeneral.VALUEID_NAT));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : NAT "
                    + org.getByValue(Sipgeneral.VALUEID_NAT) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_NAT));

        test = org.getByValue(Sipgeneral.VALUEID_NOTIFYMIMETYPE).equals(
                copy.getByValue(Sipgeneral.VALUEID_NOTIFYMIMETYPE));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : NOTIFYMIMETYPE "
                    + org.getByValue(Sipgeneral.VALUEID_NOTIFYMIMETYPE) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_NOTIFYMIMETYPE));

        test = org.getByValue(Sipgeneral.VALUEID_PEDANTIC).equals(
                copy.getByValue(Sipgeneral.VALUEID_PEDANTIC));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : PEDANTIC "
                    + org.getByValue(Sipgeneral.VALUEID_PEDANTIC) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_PEDANTIC));

        test = org.getByValue(Sipgeneral.VALUEID_PORT).equals(
                copy.getByValue(Sipgeneral.VALUEID_PORT));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : PORT "
                    + org.getByValue(Sipgeneral.VALUEID_PORT) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_PORT));

        test = org.getByValue(Sipgeneral.VALUEID_PROMISCREDIR).equals(
                copy.getByValue(Sipgeneral.VALUEID_PROMISCREDIR));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : PROMISCREDIR "
                    + org.getByValue(Sipgeneral.VALUEID_PROMISCREDIR) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_PROMISCREDIR));

        test = org.getByValue(Sipgeneral.VALUEID_SRVLOOKUP).equals(
                copy.getByValue(Sipgeneral.VALUEID_SRVLOOKUP));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : SRVLOOKUP "
                    + org.getByValue(Sipgeneral.VALUEID_SRVLOOKUP) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_SRVLOOKUP));

        test = org.getByValue(Sipgeneral.VALUEID_TOS).equals(
                copy.getByValue(Sipgeneral.VALUEID_TOS));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : TOS "
                    + org.getByValue(Sipgeneral.VALUEID_TOS) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_TOS));

        test = org.getByValue(Sipgeneral.VALUEID_VIDEOSUPPORT).equals(
                copy.getByValue(Sipgeneral.VALUEID_VIDEOSUPPORT));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : VIDEOSUPPORT "
                    + org.getByValue(Sipgeneral.VALUEID_VIDEOSUPPORT) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_VIDEOSUPPORT));

        test = org.getByValue(Sipgeneral.VALUEID_USERAGENT).equals(
                copy.getByValue(Sipgeneral.VALUEID_USERAGENT));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : USERAGENT "
                    + org.getByValue(Sipgeneral.VALUEID_USERAGENT) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_USERAGENT));

        test = org.getByValue(Sipgeneral.VALUEID_TRUSTRPID).equals(
                copy.getByValue(Sipgeneral.VALUEID_TRUSTRPID));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : TRUSTRPID "
                    + org.getByValue(Sipgeneral.VALUEID_TRUSTRPID) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_TRUSTRPID));

        test = org.getByValue(Sipgeneral.VALUEID_REALM).equals(
                copy.getByValue(Sipgeneral.VALUEID_REALM));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : REALM "
                    + org.getByValue(Sipgeneral.VALUEID_REALM) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_REALM));

        test = org.getByValue(Sipgeneral.VALUEID_RELAXDTMF).equals(
                copy.getByValue(Sipgeneral.VALUEID_RELAXDTMF));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : RELAXDTMF "
                    + org.getByValue(Sipgeneral.VALUEID_RELAXDTMF) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_RELAXDTMF));

        test = org.getByValue(Sipgeneral.VALUEID_RTPTIMEOUT).equals(
                copy.getByValue(Sipgeneral.VALUEID_RTPTIMEOUT));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : RTPTIMEOUT "
                    + org.getByValue(Sipgeneral.VALUEID_RTPTIMEOUT) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_RTPTIMEOUT));

        test = org.getByValue(Sipgeneral.VALUEID_RTPHOLDTIMEOUT).equals(
                copy.getByValue(Sipgeneral.VALUEID_RTPHOLDTIMEOUT));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : RTPHOLDTIMEOUT "
                    + org.getByValue(Sipgeneral.VALUEID_RTPHOLDTIMEOUT) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_RTPHOLDTIMEOUT));

        test = org.getByValue(Sipgeneral.VALUEID_PROGRESSINBAND).equals(
                copy.getByValue(Sipgeneral.VALUEID_PROGRESSINBAND));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : PROGRESSINBAND "
                    + org.getByValue(Sipgeneral.VALUEID_PROGRESSINBAND) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_PROGRESSINBAND));

        test = org.getByValue(Sipgeneral.VALUEID_USEREQPHONE).equals(
                copy.getByValue(Sipgeneral.VALUEID_USEREQPHONE));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : USEREQPHONE "
                    + org.getByValue(Sipgeneral.VALUEID_USEREQPHONE) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_USEREQPHONE));

        test = org.getByValue(Sipgeneral.VALUEID_COMPACTHEADERS).equals(
                copy.getByValue(Sipgeneral.VALUEID_COMPACTHEADERS));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : COMPACTHEADERS "
                    + org.getByValue(Sipgeneral.VALUEID_COMPACTHEADERS) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_COMPACTHEADERS));

        test = org.getByValue(Sipgeneral.VALUEID_SIPDEBUG).equals(
                copy.getByValue(Sipgeneral.VALUEID_SIPDEBUG));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : SIPDEBUG "
                    + org.getByValue(Sipgeneral.VALUEID_SIPDEBUG) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_SIPDEBUG));

        test = org.getByValue(Sipgeneral.VALUEID_CHECKMWI).equals(
                copy.getByValue(Sipgeneral.VALUEID_CHECKMWI));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : CHECKMWI "
                    + org.getByValue(Sipgeneral.VALUEID_CHECKMWI) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_CHECKMWI));

        test = org.getByValue(Sipgeneral.VALUEID_RECORDHISTORY).equals(
                copy.getByValue(Sipgeneral.VALUEID_RECORDHISTORY));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : RECORDHISTORY "
                    + org.getByValue(Sipgeneral.VALUEID_RECORDHISTORY) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_RECORDHISTORY));

        test = org.getByValue(Sipgeneral.VALUEID_ALLOW).equals(
                copy.getByValue(Sipgeneral.VALUEID_ALLOW));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : ALLOW "
                    + org.getByValue(Sipgeneral.VALUEID_ALLOW) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_ALLOW));

        test = org.getByValue(Sipgeneral.VALUEID_DISALLOW).equals(
                copy.getByValue(Sipgeneral.VALUEID_DISALLOW));
        if (!test)
            LOGGER.warn("checkSipgeneral failed : DISALLOW "
                    + org.getByValue(Sipgeneral.VALUEID_DISALLOW) + " : "
                    + copy.getByValue(Sipgeneral.VALUEID_DISALLOW));

        // ---------------agg
        // -----------------map
        test = org.getSipauthMap().size() == copy.getSipauthMap().size();

        if (!test) {
            LOGGER.warn("checkSipgeneral failed : sipauthMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getSipauthMap().size(); i++) {
            test = checkSipauth(org.getSipauthMap().get(i), copy
                    .getSipauthMap().get(i));

            if (!test) {
                LOGGER.warn("checkSipgeneral failed : sipauthMap  equals " + i
                        + " " + org.getSipauthMap().get(i) + " : "
                        + copy.getSipauthMap().get(i));
                return test;
            }
        }// end of for i to org.getSipauthMap()

        // newSipgeneral.addSipauth(createSipauth());
        test = org.getSipregisterMap().size() == copy.getSipregisterMap()
                .size();

        if (!test) {
            LOGGER.warn("checkSipgeneral failed : sipregisterMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getSipregisterMap().size(); i++) {
            test = checkSipregister(org.getSipregisterMap().get(i), copy
                    .getSipregisterMap().get(i));

            if (!test) {
                LOGGER.warn("checkSipgeneral failed : sipregisterMap  equals "
                        + i + " " + org.getSipregisterMap().get(i) + " : "
                        + copy.getSipregisterMap().get(i));
                return test;
            }
        }// end of for i to org.getSipregisterMap()

        // newSipgeneral.addSipregister(createSipregister());
        return test;
    }

    /*
     * erzeugt und initalisiert Sipregister
     */
    protected static Sipregister createSipregister() {
        Sipregister newSipregister = new SipregisterImpl();
        // fields
        newSipregister.setByValue(Sipregister.VALUEID_USER, "USER");
        newSipregister.setByValue(Sipregister.VALUEID_AUTHUSER, "AUTHUSER");
        newSipregister.setByValue(Sipregister.VALUEID_SECRET, "SECRET");
        newSipregister.setByValue(Sipregister.VALUEID_HOST, "HOST");
        newSipregister.setByValue(Sipregister.VALUEID_PORT, Integer.valueOf(0));
        newSipregister.setByValue(Sipregister.VALUEID_EXTENSION, "EXTENSION");
        // agg
        // map
        return newSipregister;
    }

    /*
     * erzeugt und initalisiert Sipauth
     */
    protected static Sipauth createSipauth() {
        Sipauth newSipauth = new SipauthImpl();
        // fields
        newSipauth.setByValue(Sipauth.VALUEID_USER, "USER");
        newSipauth.setByValue(Sipauth.VALUEID_SECRET, "SECRET");
        newSipauth.setByValue(Sipauth.VALUEID_MD5SECRET, "MD5SECRET");
        newSipauth.setByValue(Sipauth.VALUEID_REALM, "REALM");
        // agg
        // map
        return newSipauth;
    }

    /*
     * erzeugt und initalisiert SipConf
     */
    protected static SipConf createSipConf() {
        SipConf newSipConf = new SipConfImpl();
        // fields
        // agg
        newSipConf.setSipgeneral(createSipgeneral());
        // map
        newSipConf.addSippeers(createSippeers());
        return newSipConf;
    }

    /*
     * erzeugt und initalisiert Sippeers
     */
    protected static Sippeers createSippeers() {
        Sippeers newSippeers = new SippeersImpl();
        // fields
        newSippeers.setByValue(Sippeers.VALUEID_SECTIONNAME, "SECTIONNAME");
        newSippeers.setByValue(Sippeers.VALUEID_ACCOUNTCODE, "ACCOUNTCODE");
        newSippeers.setByValue(Sippeers.VALUEID_AMAFLAGS, new Amaflags(""));
        newSippeers.setByValue(Sippeers.VALUEID_CALLGROUP, "CALLGROUP");
        newSippeers.setByValue(Sippeers.VALUEID_CANREINVITE, "CANREINVITE");
        newSippeers.setByValue(Sippeers.VALUEID_CONTEXT, new PbxContext(""));
        newSippeers.setByValue(Sippeers.VALUEID_DEFAULTIP, "DEFAULTIP");
        newSippeers.setByValue(Sippeers.VALUEID_DTMFMODE, new Dtmfmode(""));
        newSippeers.setByValue(Sippeers.VALUEID_FROMUSER, "FROMUSER");
        newSippeers.setByValue(Sippeers.VALUEID_FROMDOMAIN, "FROMDOMAIN");
        newSippeers.setByValue(Sippeers.VALUEID_HOST, "HOST");
        newSippeers.setByValue(Sippeers.VALUEID_INCOMINGLIMIT, Integer
                .valueOf(0));
        newSippeers.setByValue(Sippeers.VALUEID_OUTGOINGLIMIT, Integer
                .valueOf(0));
        newSippeers.setByValue(Sippeers.VALUEID_INSECURE, "INSECURE");
        newSippeers.setByValue(Sippeers.VALUEID_LANGUAGE, "LANGUAGE");
        newSippeers.setByValue(Sippeers.VALUEID_MAILBOX, "MAILBOX");
        newSippeers.setByValue(Sippeers.VALUEID_MD5SECRET, "MD5SECRET");
        newSippeers.setByValue(Sippeers.VALUEID_NAT, Boolean.TRUE);
        newSippeers.setByValue(Sippeers.VALUEID_PICKUPGROUP, "PICKUPGROUP");
        newSippeers.setByValue(Sippeers.VALUEID_PORT, Integer.valueOf(0));
        newSippeers.setByValue(Sippeers.VALUEID_QUALIFY, "QUALIFY");
        newSippeers.setByValue(Sippeers.VALUEID_RESTRICTCID, Boolean.TRUE);
        newSippeers.setByValue(Sippeers.VALUEID_RTPTIMEOUT, Integer.valueOf(0));
        newSippeers.setByValue(Sippeers.VALUEID_RTPHOLDTIMEOUT, Integer
                .valueOf(0));
        newSippeers.setByValue(Sippeers.VALUEID_SECRET, "SECRET");
        newSippeers.setByValue(Sippeers.VALUEID_TYPE, new PeerType(""));
        newSippeers.setByValue(Sippeers.VALUEID_USERNAME, "USERNAME");
        newSippeers.setByValue(Sippeers.VALUEID_MUSICONHOLD, "MUSICONHOLD");
        newSippeers.setByValue(Sippeers.VALUEID_CALLERID, "CALLERID");
        newSippeers.setByValue(Sippeers.VALUEID_DISALLOW, new CodecsSet(
                "g729,gsm"));
        newSippeers.setByValue(Sippeers.VALUEID_ALLOW, new CodecsSet("all"));
        // agg
        // map
        // newSippeers.addSipauth(createSipauth());
        return newSippeers;
    }

    /*
     * erzeugt und initalisiert Sipgeneral
     */
    protected static Sipgeneral createSipgeneral() {
        Sipgeneral newSipgeneral = new SipgeneralImpl();
        // fields
        newSipgeneral.setByValue(Sipgeneral.VALUEID_AUTOCREATEPEER,
                Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_BINDADDR, "BINDADDR");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_BINDPORT, Integer
                .valueOf(0));
        newSipgeneral.setByValue(Sipgeneral.VALUEID_CANREINVITE, "CANREINVITE");
        newSipgeneral
                .setByValue(Sipgeneral.VALUEID_CONTEXT, new PbxContext(""));
        newSipgeneral.setByValue(Sipgeneral.VALUEID_DEFAULTEXPIREY, Integer
                .valueOf(0));
        newSipgeneral.setByValue(Sipgeneral.VALUEID_DTMFMODE, new Dtmfmode(""));
        newSipgeneral.setByValue(Sipgeneral.VALUEID_EXTERNIP, "EXTERNIP");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_EXTERNHOST, "EXTERNHOST");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_EXTERNREFRESH,
                "EXTERNREFRESH");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_LOCALNET, "LOCALNET");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_FROMDOMAIN, "FROMDOMAIN");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_MAXEXPIREY, Integer
                .valueOf(0));
        newSipgeneral.setByValue(Sipgeneral.VALUEID_NAT, Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_NOTIFYMIMETYPE,
                "NOTIFYMIMETYPE");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_PEDANTIC, Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_PORT, Integer.valueOf(0));
        newSipgeneral.setByValue(Sipgeneral.VALUEID_PROMISCREDIR, Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_SRVLOOKUP, Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_TOS, "TOS");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_VIDEOSUPPORT, Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_USERAGENT, "USERAGENT");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_TRUSTRPID, Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_REALM, "REALM");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_RELAXDTMF, Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_RTPTIMEOUT, Integer
                .valueOf(0));
        newSipgeneral.setByValue(Sipgeneral.VALUEID_RTPHOLDTIMEOUT, Integer
                .valueOf(0));
        newSipgeneral.setByValue(Sipgeneral.VALUEID_PROGRESSINBAND,
                "PROGRESSINBAND");
        newSipgeneral.setByValue(Sipgeneral.VALUEID_USEREQPHONE, Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_COMPACTHEADERS,
                Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_SIPDEBUG, Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_CHECKMWI, Integer
                .valueOf(0));
        newSipgeneral
                .setByValue(Sipgeneral.VALUEID_RECORDHISTORY, Boolean.TRUE);
        newSipgeneral.setByValue(Sipgeneral.VALUEID_ALLOW, new CodecsSet(
                "g729,gsm"));
        newSipgeneral.setByValue(Sipgeneral.VALUEID_DISALLOW, new CodecsSet(
                "all"));
        // agg
        // map
        // newSipgeneral.addSipauth(createSipauth());
        newSipgeneral.addSipregister(createSipregister());
        return newSipgeneral;
    }

}
