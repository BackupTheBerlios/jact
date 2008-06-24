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
import com.useit.jact.model.voicemailconf.MMFvoicemailconf;
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.VoicemailConfImpl;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.VoicemailcontextImpl;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;
import com.useit.jact.model.voicemailconf.VoicemailcontextentryImpl;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.VoicemailgeneralImpl;
import com.useit.jact.model.voicemailconf.Zonemessages;
import com.useit.jact.model.voicemailconf.ZonemessagesImpl;

/**
 * <p>
 * IOvoicemailconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOvoicemailconfTest.java,v 1.5 2006/01/14
 *          15:00:13 urs Exp $
 */
public class IOvoicemailconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOvoicemailconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOvoicemailconfTest.class);
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

    // public final void testVoicemailgeneralLoadSaveXML() {
    // Voicemailgeneral Obj = createVoicemailgeneral();
    // MMFvoicemailconf.getInstance().writeConfXML("temp/Voicemailgeneral.xml",
    // Obj);
    // Object object =
    // MMFvoicemailconf.getInstance().readConfXML("temp/Voicemailgeneral.xml");
    // assertEquals("load save XML
    // Voicemailgeneral",true,checkVoicemailgeneral(Obj, object));
    // }
    public final void testVoicemailConfLoadSaveXML() {
        VoicemailConf Obj = createVoicemailConf();
        MMFvoicemailconf.getInstance().writeConfXML("temp/VoicemailConf.xml",
                Obj);
        Object object = MMFvoicemailconf.getInstance().readConfXML(
                "temp/VoicemailConf.xml");
        assertEquals("load save XML VoicemailConf", true, checkVoicemailConf(
                Obj, object));
    }

    // public final void testVoicemailcontextLoadSaveXML() {
    // Voicemailcontext Obj = createVoicemailcontext();
    // MMFvoicemailconf.getInstance().writeConfXML("temp/Voicemailcontext.xml",
    // Obj);
    // Object object =
    // MMFvoicemailconf.getInstance().readConfXML("temp/Voicemailcontext.xml");
    // assertEquals("load save XML
    // Voicemailcontext",true,checkVoicemailcontext(Obj, object));
    // }
    // public final void testZonemessagesLoadSaveXML() {
    // Zonemessages Obj = createZonemessages();
    // MMFvoicemailconf.getInstance().writeConfXML("temp/Zonemessages.xml",
    // Obj);
    // Object object =
    // MMFvoicemailconf.getInstance().readConfXML("temp/Zonemessages.xml");
    // assertEquals("load save XML Zonemessages",true,checkZonemessages(Obj,
    // object));
    // }
    // public final void testVoicemailcontextentryLoadSaveXML() {
    // Voicemailcontextentry Obj = createVoicemailcontextentry();
    // MMFvoicemailconf.getInstance().writeConfXML("temp/Voicemailcontextentry.xml",
    // Obj);
    // Object object =
    // MMFvoicemailconf.getInstance().readConfXML("temp/Voicemailcontextentry.xml");
    // assertEquals("load save XML
    // Voicemailcontextentry",true,checkVoicemailcontextentry(Obj, object));
    // }

    // public final void testVoicemailgeneralloadSaveConf() {
    // Voicemailgeneral Obj = createVoicemailgeneral();
    // try{
    // MMFvoicemailconf.getInstance().writetoFile(Obj,"temp/Voicemailgeneral.cfg");
    // Object object = MMFvoicemailconf.getInstance().readConf(new
    // File("temp/Voicemailgeneral.cfg"));
    // assertEquals("load save conf
    // Voicemailgeneral",true,checkVoicemailgeneral(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testVoicemailgeneralloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testVoicemailgeneralloadSaveConf()", e);
    // }
    // }
    public final void testVoicemailConfloadSaveConf() {
        VoicemailConf Obj = createVoicemailConf();
        try {
            MMFvoicemailconf.getInstance().writetoFile(Obj,
                    "temp/VoicemailConf.cfg");
            Object object = MMFvoicemailconf.getInstance().readConf(
                    new File("temp/VoicemailConf.cfg"));
            assertEquals("load save conf VoicemailConf", true,
                    checkVoicemailConf(Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testVoicemailConfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testVoicemailConfloadSaveConf()", e);
        }
    }

    // public final void testVoicemailcontextloadSaveConf() {
    // Voicemailcontext Obj = createVoicemailcontext();
    // try{
    // MMFvoicemailconf.getInstance().writetoFile(Obj,"temp/Voicemailcontext.cfg");
    // Object object = MMFvoicemailconf.getInstance().readConf(new
    // File("temp/Voicemailcontext.cfg"));
    // assertEquals("load save conf
    // Voicemailcontext",true,checkVoicemailcontext(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testVoicemailcontextloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testVoicemailcontextloadSaveConf()", e);
    // }
    // }
    // public final void testZonemessagesloadSaveConf() {
    // Zonemessages Obj = createZonemessages();
    // try{
    // MMFvoicemailconf.getInstance().writetoFile(Obj,"temp/Zonemessages.cfg");
    // Object object = MMFvoicemailconf.getInstance().readConf(new
    // File("temp/Zonemessages.cfg"));
    // assertEquals("load save conf
    // Zonemessages",true,checkZonemessages(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testZonemessagesloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testZonemessagesloadSaveConf()", e);
    // }
    // }
    // public final void testVoicemailcontextentryloadSaveConf() {
    // Voicemailcontextentry Obj = createVoicemailcontextentry();
    // try{
    // MMFvoicemailconf.getInstance().writetoFile(Obj,"temp/Voicemailcontextentry.cfg");
    // Object object = MMFvoicemailconf.getInstance().readConf(new
    // File("temp/Voicemailcontextentry.cfg"));
    // assertEquals("load save conf
    // Voicemailcontextentry",true,checkVoicemailcontextentry(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testVoicemailcontextentryloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testVoicemailcontextentryloadSaveConf()", e);
    // }
    // }
    //	
    public final void testVoicemailgeneralLoadSaveHibernate() {
        Voicemailgeneral Obj = createVoicemailgeneral();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testVoicemailgeneralLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(VoicemailgeneralImpl.class, Obj.getId());
        assertEquals("load save Voicemailgeneral", Obj, object);

    }

    public final void testVoicemailConfLoadSaveHibernate() {
        VoicemailConf Obj = createVoicemailConf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testVoicemailConfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(VoicemailConfImpl.class, Obj.getId());
        assertEquals("load save VoicemailConf", Obj, object);

    }

    public final void testVoicemailcontextLoadSaveHibernate() {
        Voicemailcontext Obj = createVoicemailcontext();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testVoicemailcontextLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(VoicemailcontextImpl.class, Obj.getId());
        assertEquals("load save Voicemailcontext", Obj, object);

    }

    public final void testZonemessagesLoadSaveHibernate() {
        Zonemessages Obj = createZonemessages();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testZonemessagesLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ZonemessagesImpl.class, Obj.getId());
        assertEquals("load save Zonemessages", Obj, object);

    }

    public final void testVoicemailcontextentryLoadSaveHibernate() {
        Voicemailcontextentry Obj = createVoicemailcontextentry();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testVoicemailcontextentryLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(VoicemailcontextentryImpl.class, Obj
                .getId());
        assertEquals("load save Voicemailcontextentry", Obj, object);

    }

    /*
     * überprüft Voicemailgeneral
     */
    protected static boolean checkVoicemailgeneral(Voicemailgeneral org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Voicemailgeneral copy = null;
        if (obj instanceof Voicemailgeneral) {
            copy = (Voicemailgeneral) obj;

        } else {
            LOGGER.warn("checkVoicemailgeneral failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Voicemailgeneral.VALUEID_ATTACH).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_ATTACH));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : ATTACH "
                    + org.getByValue(Voicemailgeneral.VALUEID_ATTACH) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_ATTACH));

        test = org.getByValue(Voicemailgeneral.VALUEID_DELETE).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_DELETE));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : DELETE "
                    + org.getByValue(Voicemailgeneral.VALUEID_DELETE) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_DELETE));

        test = org.getByValue(Voicemailgeneral.VALUEID_MAILCMD).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_MAILCMD));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : MAILCMD "
                    + org.getByValue(Voicemailgeneral.VALUEID_MAILCMD) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_MAILCMD));

        test = org.getByValue(Voicemailgeneral.VALUEID_MAXSILENCE).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_MAXSILENCE));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : MAXSILENCE "
                    + org.getByValue(Voicemailgeneral.VALUEID_MAXSILENCE)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_MAXSILENCE));

        test = org.getByValue(Voicemailgeneral.VALUEID_ENVELOPE).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_ENVELOPE));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : ENVELOPE "
                    + org.getByValue(Voicemailgeneral.VALUEID_ENVELOPE) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_ENVELOPE));

        test = org.getByValue(Voicemailgeneral.VALUEID_EXTERNNOTIFY).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_EXTERNNOTIFY));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : EXTERNNOTIFY "
                    + org.getByValue(Voicemailgeneral.VALUEID_EXTERNNOTIFY)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_EXTERNNOTIFY));

        test = org
                .getByValue(Voicemailgeneral.VALUEID_SILENCETHRESHOLD)
                .equals(
                        copy
                                .getByValue(Voicemailgeneral.VALUEID_SILENCETHRESHOLD));
        if (!test)
            LOGGER
                    .warn("checkVoicemailgeneral failed : SILENCETHRESHOLD "
                            + org
                                    .getByValue(Voicemailgeneral.VALUEID_SILENCETHRESHOLD)
                            + " : "
                            + copy
                                    .getByValue(Voicemailgeneral.VALUEID_SILENCETHRESHOLD));

        test = org.getByValue(Voicemailgeneral.VALUEID_SERVEREMAIL).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_SERVEREMAIL));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : SERVEREMAIL "
                    + org.getByValue(Voicemailgeneral.VALUEID_SERVEREMAIL)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_SERVEREMAIL));

        test = org.getByValue(Voicemailgeneral.VALUEID_MAXMESSAGE).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_MAXMESSAGE));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : MAXMESSAGE "
                    + org.getByValue(Voicemailgeneral.VALUEID_MAXMESSAGE)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_MAXMESSAGE));

        test = org.getByValue(Voicemailgeneral.VALUEID_MINMESSAGE).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_MINMESSAGE));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : MINMESSAGE "
                    + org.getByValue(Voicemailgeneral.VALUEID_MINMESSAGE)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_MINMESSAGE));

        test = org.getByValue(Voicemailgeneral.VALUEID_FORMAT).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_FORMAT));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : FORMAT "
                    + org.getByValue(Voicemailgeneral.VALUEID_FORMAT) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_FORMAT));

        test = org.getByValue(Voicemailgeneral.VALUEID_MAXGREET).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_MAXGREET));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : MAXGREET "
                    + org.getByValue(Voicemailgeneral.VALUEID_MAXGREET) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_MAXGREET));

        test = org.getByValue(Voicemailgeneral.VALUEID_SKIPMS).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_SKIPMS));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : SKIPMS "
                    + org.getByValue(Voicemailgeneral.VALUEID_SKIPMS) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_SKIPMS));

        test = org.getByValue(Voicemailgeneral.VALUEID_MAXLOGINS).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_MAXLOGINS));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : MAXLOGINS "
                    + org.getByValue(Voicemailgeneral.VALUEID_MAXLOGINS)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_MAXLOGINS));

        test = org
                .getByValue(Voicemailgeneral.VALUEID_CIDINTERNALCONTEXTS)
                .equals(
                        copy
                                .getByValue(Voicemailgeneral.VALUEID_CIDINTERNALCONTEXTS));
        if (!test)
            LOGGER
                    .warn("checkVoicemailgeneral failed : CIDINTERNALCONTEXTS "
                            + org
                                    .getByValue(Voicemailgeneral.VALUEID_CIDINTERNALCONTEXTS)
                            + " : "
                            + copy
                                    .getByValue(Voicemailgeneral.VALUEID_CIDINTERNALCONTEXTS));

        test = org.getByValue(Voicemailgeneral.VALUEID_REVIEW).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_REVIEW));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : REVIEW "
                    + org.getByValue(Voicemailgeneral.VALUEID_REVIEW) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_REVIEW));

        test = org.getByValue(Voicemailgeneral.VALUEID_OPERATOR).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_OPERATOR));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : OPERATOR "
                    + org.getByValue(Voicemailgeneral.VALUEID_OPERATOR) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_OPERATOR));

        test = org.getByValue(Voicemailgeneral.VALUEID_SAYCID).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_SAYCID));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : SAYCID "
                    + org.getByValue(Voicemailgeneral.VALUEID_SAYCID) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_SAYCID));

        test = org.getByValue(Voicemailgeneral.VALUEID_DIALOUT).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_DIALOUT));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : DIALOUT "
                    + org.getByValue(Voicemailgeneral.VALUEID_DIALOUT) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_DIALOUT));

        test = org.getByValue(Voicemailgeneral.VALUEID_CALLBACK).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_CALLBACK));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : CALLBACK "
                    + org.getByValue(Voicemailgeneral.VALUEID_CALLBACK) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_CALLBACK));

        test = org.getByValue(Voicemailgeneral.VALUEID_DBUSER).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_DBUSER));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : DBUSER "
                    + org.getByValue(Voicemailgeneral.VALUEID_DBUSER) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_DBUSER));

        test = org.getByValue(Voicemailgeneral.VALUEID_DBPASS).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_DBPASS));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : DBPASS "
                    + org.getByValue(Voicemailgeneral.VALUEID_DBPASS) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_DBPASS));

        test = org.getByValue(Voicemailgeneral.VALUEID_DBHOST).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_DBHOST));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : DBHOST "
                    + org.getByValue(Voicemailgeneral.VALUEID_DBHOST) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_DBHOST));

        test = org.getByValue(Voicemailgeneral.VALUEID_DBNAME).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_DBNAME));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : DBNAME "
                    + org.getByValue(Voicemailgeneral.VALUEID_DBNAME) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_DBNAME));

        test = org.getByValue(Voicemailgeneral.VALUEID_DBOPTION).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_DBOPTION));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : DBOPTION "
                    + org.getByValue(Voicemailgeneral.VALUEID_DBOPTION) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_DBOPTION));

        test = org.getByValue(Voicemailgeneral.VALUEID_PBXSKIP).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_PBXSKIP));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : PBXSKIP "
                    + org.getByValue(Voicemailgeneral.VALUEID_PBXSKIP) + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_PBXSKIP));

        test = org.getByValue(Voicemailgeneral.VALUEID_FROMSTRING).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_FROMSTRING));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : FROMSTRING "
                    + org.getByValue(Voicemailgeneral.VALUEID_FROMSTRING)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_FROMSTRING));

        test = org.getByValue(Voicemailgeneral.VALUEID_EMAILSUBJECT).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_EMAILSUBJECT));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : EMAILSUBJECT "
                    + org.getByValue(Voicemailgeneral.VALUEID_EMAILSUBJECT)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_EMAILSUBJECT));

        test = org.getByValue(Voicemailgeneral.VALUEID_EMAILBODY).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_EMAILBODY));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : EMAILBODY "
                    + org.getByValue(Voicemailgeneral.VALUEID_EMAILBODY)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_EMAILBODY));

        test = org.getByValue(Voicemailgeneral.VALUEID_EXITCONTEXT).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_EXITCONTEXT));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : EXITCONTEXT "
                    + org.getByValue(Voicemailgeneral.VALUEID_EXITCONTEXT)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_EXITCONTEXT));

        test = org.getByValue(Voicemailgeneral.VALUEID_NEXTAFTERCMD).equals(
                copy.getByValue(Voicemailgeneral.VALUEID_NEXTAFTERCMD));
        if (!test)
            LOGGER.warn("checkVoicemailgeneral failed : NEXTAFTERCMD "
                    + org.getByValue(Voicemailgeneral.VALUEID_NEXTAFTERCMD)
                    + " : "
                    + copy.getByValue(Voicemailgeneral.VALUEID_NEXTAFTERCMD));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft VoicemailConf
     */
    protected static boolean checkVoicemailConf(VoicemailConf org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        VoicemailConf copy = null;
        if (obj instanceof VoicemailConf) {
            copy = (VoicemailConf) obj;

        } else {
            LOGGER.warn("checkVoicemailConf failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        // ---------------agg
        test = checkVoicemailgeneral(org.getVoicemailgeneral(), copy
                .getVoicemailgeneral());
        if (!test)
            LOGGER.warn("checkVoicemailConf failed : voicemailgeneral "
                    + org.toString() + " : " + copy.toString());
        // -----------------map
        test = org.getVoicemailcontextMap().size() == copy
                .getVoicemailcontextMap().size();

        if (!test) {
            LOGGER.warn("checkVoicemailConf failed : voicemailcontextMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getVoicemailcontextMap().size(); i++) {
            test = checkVoicemailcontext(org.getVoicemailcontextMap().get(i),
                    copy.getVoicemailcontextMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkVoicemailConf failed : voicemailcontextMap  equals "
                                + i
                                + " "
                                + org.getVoicemailcontextMap().get(i)
                                + " : " + copy.getVoicemailcontextMap().get(i));
                return test;
            }
        }// end of for i to org.getVoicemailcontextMap()

        // newVoicemailConf.addVoicemailcontext(createVoicemailcontext());
        test = org.getZonemessagesMap().size() == copy.getZonemessagesMap()
                .size();

        if (!test) {
            LOGGER.warn("checkVoicemailConf failed : zonemessagesMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getZonemessagesMap().size(); i++) {
            test = checkZonemessages(org.getZonemessagesMap().get(i), copy
                    .getZonemessagesMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkVoicemailConf failed : zonemessagesMap  equals "
                                + i
                                + " "
                                + org.getZonemessagesMap().get(i)
                                + " : " + copy.getZonemessagesMap().get(i));
                return test;
            }
        }// end of for i to org.getZonemessagesMap()

        // newVoicemailConf.addZonemessages(createZonemessages());
        return test;
    }

    /*
     * überprüft Voicemailcontext
     */
    protected static boolean checkVoicemailcontext(Voicemailcontext org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Voicemailcontext copy = null;
        if (obj instanceof Voicemailcontext) {
            copy = (Voicemailcontext) obj;

        } else {
            LOGGER.warn("checkVoicemailcontext failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Voicemailcontext.VALUEID_CONTEXTNAME).equals(
                copy.getByValue(Voicemailcontext.VALUEID_CONTEXTNAME));
        if (!test)
            LOGGER.warn("checkVoicemailcontext failed : CONTEXTNAME "
                    + org.getByValue(Voicemailcontext.VALUEID_CONTEXTNAME)
                    + " : "
                    + copy.getByValue(Voicemailcontext.VALUEID_CONTEXTNAME));

        // ---------------agg
        // -----------------map
        test = org.getVoicemailcontextentryMap().size() == copy
                .getVoicemailcontextentryMap().size();

        if (!test) {
            LOGGER
                    .warn("checkVoicemailcontext failed : voicemailcontextentryMap  size"
                            + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getVoicemailcontextentryMap().size(); i++) {
            test = checkVoicemailcontextentry(org.getVoicemailcontextentryMap()
                    .get(i), copy.getVoicemailcontextentryMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkVoicemailcontext failed : voicemailcontextentryMap  equals "
                                + i
                                + " "
                                + org.getVoicemailcontextentryMap().get(i)
                                + " : "
                                + copy.getVoicemailcontextentryMap().get(i));
                return test;
            }
        }// end of for i to org.getVoicemailcontextentryMap()

        // newVoicemailcontext.addVoicemailcontextentry(createVoicemailcontextentry());
        return test;
    }

    /*
     * überprüft Zonemessages
     */
    protected static boolean checkZonemessages(Zonemessages org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Zonemessages copy = null;
        if (obj instanceof Zonemessages) {
            copy = (Zonemessages) obj;

        } else {
            LOGGER.warn("checkZonemessages failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Zonemessages.VALUEID_TIMEZONENAME).equals(
                copy.getByValue(Zonemessages.VALUEID_TIMEZONENAME));
        if (!test)
            LOGGER.warn("checkZonemessages failed : TIMEZONENAME "
                    + org.getByValue(Zonemessages.VALUEID_TIMEZONENAME) + " : "
                    + copy.getByValue(Zonemessages.VALUEID_TIMEZONENAME));

        test = org.getByValue(Zonemessages.VALUEID_COUNTRY).equals(
                copy.getByValue(Zonemessages.VALUEID_COUNTRY));
        if (!test)
            LOGGER.warn("checkZonemessages failed : COUNTRY "
                    + org.getByValue(Zonemessages.VALUEID_COUNTRY) + " : "
                    + copy.getByValue(Zonemessages.VALUEID_COUNTRY));

        test = org.getByValue(Zonemessages.VALUEID_CITY).equals(
                copy.getByValue(Zonemessages.VALUEID_CITY));
        if (!test)
            LOGGER.warn("checkZonemessages failed : CITY "
                    + org.getByValue(Zonemessages.VALUEID_CITY) + " : "
                    + copy.getByValue(Zonemessages.VALUEID_CITY));

        test = org.getByValue(Zonemessages.VALUEID_OPTIONS).equals(
                copy.getByValue(Zonemessages.VALUEID_OPTIONS));
        if (!test)
            LOGGER.warn("checkZonemessages failed : OPTIONS "
                    + org.getByValue(Zonemessages.VALUEID_OPTIONS) + " : "
                    + copy.getByValue(Zonemessages.VALUEID_OPTIONS));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Voicemailcontextentry
     */
    protected static boolean checkVoicemailcontextentry(
            Voicemailcontextentry org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Voicemailcontextentry copy = null;
        if (obj instanceof Voicemailcontextentry) {
            copy = (Voicemailcontextentry) obj;

        } else {
            LOGGER.warn("checkVoicemailcontextentry failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Voicemailcontextentry.VALUEID_MAILBOX).equals(
                copy.getByValue(Voicemailcontextentry.VALUEID_MAILBOX));
        if (!test)
            LOGGER.warn("checkVoicemailcontextentry failed : MAILBOX "
                    + org.getByValue(Voicemailcontextentry.VALUEID_MAILBOX)
                    + " : "
                    + copy.getByValue(Voicemailcontextentry.VALUEID_MAILBOX));

        test = org
                .getByValue(Voicemailcontextentry.VALUEID_VOICEMAIL_PASSWORD)
                .equals(
                        copy
                                .getByValue(Voicemailcontextentry.VALUEID_VOICEMAIL_PASSWORD));
        if (!test)
            LOGGER
                    .warn("checkVoicemailcontextentry failed : VOICEMAIL_PASSWORD "
                            + org
                                    .getByValue(Voicemailcontextentry.VALUEID_VOICEMAIL_PASSWORD)
                            + " : "
                            + copy
                                    .getByValue(Voicemailcontextentry.VALUEID_VOICEMAIL_PASSWORD));

        test = org.getByValue(Voicemailcontextentry.VALUEID_USER_NAME).equals(
                copy.getByValue(Voicemailcontextentry.VALUEID_USER_NAME));
        if (!test)
            LOGGER.warn("checkVoicemailcontextentry failed : USER_NAME "
                    + org.getByValue(Voicemailcontextentry.VALUEID_USER_NAME)
                    + " : "
                    + copy.getByValue(Voicemailcontextentry.VALUEID_USER_NAME));

        test = org
                .getByValue(Voicemailcontextentry.VALUEID_USER_EMAIL_ADDRESS)
                .equals(
                        copy
                                .getByValue(Voicemailcontextentry.VALUEID_USER_EMAIL_ADDRESS));
        if (!test)
            LOGGER
                    .warn("checkVoicemailcontextentry failed : USER_EMAIL_ADDRESS "
                            + org
                                    .getByValue(Voicemailcontextentry.VALUEID_USER_EMAIL_ADDRESS)
                            + " : "
                            + copy
                                    .getByValue(Voicemailcontextentry.VALUEID_USER_EMAIL_ADDRESS));

        test = org
                .getByValue(Voicemailcontextentry.VALUEID_PAGER_EMAIL_ADDRESS)
                .equals(
                        copy
                                .getByValue(Voicemailcontextentry.VALUEID_PAGER_EMAIL_ADDRESS));
        if (!test)
            LOGGER
                    .warn("checkVoicemailcontextentry failed : PAGER_EMAIL_ADDRESS "
                            + org
                                    .getByValue(Voicemailcontextentry.VALUEID_PAGER_EMAIL_ADDRESS)
                            + " : "
                            + copy
                                    .getByValue(Voicemailcontextentry.VALUEID_PAGER_EMAIL_ADDRESS));

        test = org
                .getByValue(Voicemailcontextentry.VALUEID_USER_OPTIONS)
                .equals(
                        copy
                                .getByValue(Voicemailcontextentry.VALUEID_USER_OPTIONS));
        if (!test)
            LOGGER
                    .warn("checkVoicemailcontextentry failed : USER_OPTIONS "
                            + org
                                    .getByValue(Voicemailcontextentry.VALUEID_USER_OPTIONS)
                            + " : "
                            + copy
                                    .getByValue(Voicemailcontextentry.VALUEID_USER_OPTIONS));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * erzeugt und initalisiert Voicemailgeneral
     */
    protected static Voicemailgeneral createVoicemailgeneral() {
        Voicemailgeneral newVoicemailgeneral = new VoicemailgeneralImpl();
        // fields
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_ATTACH,
                Boolean.TRUE);
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_DELETE,
                Boolean.TRUE);
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_MAILCMD,
                "MAILCMD");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_MAXSILENCE,
                "MAXSILENCE");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_ENVELOPE,
                "ENVELOPE");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_EXTERNNOTIFY,
                "EXTERNNOTIFY");
        newVoicemailgeneral.setByValue(
                Voicemailgeneral.VALUEID_SILENCETHRESHOLD, "SILENCETHRESHOLD");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_SERVEREMAIL,
                "SERVEREMAIL");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_MAXMESSAGE,
                "MAXMESSAGE");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_MINMESSAGE,
                "MINMESSAGE");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_FORMAT,
                "FORMAT");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_MAXGREET,
                "MAXGREET");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_SKIPMS,
                "SKIPMS");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_MAXLOGINS,
                "MAXLOGINS");
        newVoicemailgeneral.setByValue(
                Voicemailgeneral.VALUEID_CIDINTERNALCONTEXTS,
                "CIDINTERNALCONTEXTS");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_REVIEW,
                Boolean.TRUE);
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_OPERATOR,
                Boolean.TRUE);
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_SAYCID,
                Boolean.TRUE);
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_DIALOUT,
                "DIALOUT");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_CALLBACK,
                "CALLBACK");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_DBUSER,
                "DBUSER");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_DBPASS,
                "DBPASS");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_DBHOST,
                "DBHOST");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_DBNAME,
                "DBNAME");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_DBOPTION,
                "DBOPTION");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_PBXSKIP,
                "PBXSKIP");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_FROMSTRING,
                "FROMSTRING");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_EMAILSUBJECT,
                "EMAILSUBJECT");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_EMAILBODY,
                "EMAILBODY");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_EXITCONTEXT,
                "EXITCONTEXT");
        newVoicemailgeneral.setByValue(Voicemailgeneral.VALUEID_NEXTAFTERCMD,
                "NEXTAFTERCMD");
        // agg
        // map
        return newVoicemailgeneral;
    }

    /*
     * erzeugt und initalisiert VoicemailConf
     */
    protected static VoicemailConf createVoicemailConf() {
        VoicemailConf newVoicemailConf = new VoicemailConfImpl();
        // fields
        // agg
        newVoicemailConf.setVoicemailgeneral(createVoicemailgeneral());
        // map
        newVoicemailConf.addVoicemailcontext(createVoicemailcontext());
        newVoicemailConf.addZonemessages(createZonemessages());
        return newVoicemailConf;
    }

    /*
     * erzeugt und initalisiert Voicemailcontext
     */
    protected static Voicemailcontext createVoicemailcontext() {
        Voicemailcontext newVoicemailcontext = new VoicemailcontextImpl();
        // fields
        newVoicemailcontext.setByValue(Voicemailcontext.VALUEID_CONTEXTNAME,
                "CONTEXTNAME");
        // agg
        // map
        newVoicemailcontext
                .addVoicemailcontextentry(createVoicemailcontextentry());
        return newVoicemailcontext;
    }

    /*
     * erzeugt und initalisiert Zonemessages
     */
    protected static Zonemessages createZonemessages() {
        Zonemessages newZonemessages = new ZonemessagesImpl();
        // fields
        newZonemessages.setByValue(Zonemessages.VALUEID_TIMEZONENAME,
                "TIMEZONENAME");
        newZonemessages.setByValue(Zonemessages.VALUEID_COUNTRY, "COUNTRY");
        newZonemessages.setByValue(Zonemessages.VALUEID_CITY, "CITY");
        newZonemessages.setByValue(Zonemessages.VALUEID_OPTIONS, "OPTIONS");
        // agg
        // map
        return newZonemessages;
    }

    /*
     * erzeugt und initalisiert Voicemailcontextentry
     */
    protected static Voicemailcontextentry createVoicemailcontextentry() {
        Voicemailcontextentry newVoicemailcontextentry = new VoicemailcontextentryImpl();
        // fields
        newVoicemailcontextentry.setByValue(
                Voicemailcontextentry.VALUEID_MAILBOX, "MAILBOX");
        newVoicemailcontextentry.setByValue(
                Voicemailcontextentry.VALUEID_VOICEMAIL_PASSWORD,
                "VOICEMAIL_PASSWORD");
        newVoicemailcontextentry.setByValue(
                Voicemailcontextentry.VALUEID_USER_NAME, "USER_NAME");
        newVoicemailcontextentry.setByValue(
                Voicemailcontextentry.VALUEID_USER_EMAIL_ADDRESS,
                "USER_EMAIL_ADDRESS");
        newVoicemailcontextentry.setByValue(
                Voicemailcontextentry.VALUEID_PAGER_EMAIL_ADDRESS,
                "PAGER_EMAIL_ADDRESS");
        newVoicemailcontextentry.setByValue(
                Voicemailcontextentry.VALUEID_USER_OPTIONS, "USER_OPTIONS");
        // agg
        // map
        return newVoicemailcontextentry;
    }

}
