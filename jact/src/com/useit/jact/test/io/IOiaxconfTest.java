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
import com.useit.jact.model.iaxconf.Iaxdeny;
import com.useit.jact.model.iaxconf.IaxdenyImpl;
import com.useit.jact.model.iaxconf.Iaxgeneral;
import com.useit.jact.model.iaxconf.IaxgeneralImpl;
import com.useit.jact.model.iaxconf.Iaxjitter;
import com.useit.jact.model.iaxconf.IaxjitterImpl;
import com.useit.jact.model.iaxconf.Iaxpeer;
import com.useit.jact.model.iaxconf.IaxpeerImpl;
import com.useit.jact.model.iaxconf.Iaxpermit;
import com.useit.jact.model.iaxconf.IaxpermitImpl;
import com.useit.jact.model.iaxconf.Iaxregister;
import com.useit.jact.model.iaxconf.IaxregisterImpl;
import com.useit.jact.model.iaxconf.MMFiaxconf;
import com.useit.jact.model.types.Amaflags;
import com.useit.jact.model.types.CodecsSet;
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.PeerType;

/**
 * <p>
 * IOiaxconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOiaxconfTest.java,v 1.3 2006/01/12 15:20:10
 *          urs Exp $
 */
public class IOiaxconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger.getLogger(IOiaxconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOiaxconfTest.class);
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

    // public final void testIaxjitterLoadSaveXML() {
    // Iaxjitter Obj = createIaxjitter();
    // MMFiaxconf.getInstance().writeConfXML("temp/Iaxjitter.xml", Obj);
    // Object object =
    // MMFiaxconf.getInstance().readConfXML("temp/Iaxjitter.xml");
    // assertEquals("load save XML Iaxjitter",true,checkIaxjitter(Obj, object));
    // }
    // public final void testIaxregisterLoadSaveXML() {
    // Iaxregister Obj = createIaxregister();
    // MMFiaxconf.getInstance().writeConfXML("temp/Iaxregister.xml", Obj);
    // Object object =
    // MMFiaxconf.getInstance().readConfXML("temp/Iaxregister.xml");
    // assertEquals("load save XML Iaxregister",true,checkIaxregister(Obj,
    // object));
    // }
    // public final void testIaxdenyLoadSaveXML() {
    // Iaxdeny Obj = createIaxdeny();
    // MMFiaxconf.getInstance().writeConfXML("temp/Iaxdeny.xml", Obj);
    // Object object = MMFiaxconf.getInstance().readConfXML("temp/Iaxdeny.xml");
    // assertEquals("load save XML Iaxdeny",true,checkIaxdeny(Obj, object));
    // }
    // public final void testIaxpermitLoadSaveXML() {
    // Iaxpermit Obj = createIaxpermit();
    // MMFiaxconf.getInstance().writeConfXML("temp/Iaxpermit.xml", Obj);
    // Object object =
    // MMFiaxconf.getInstance().readConfXML("temp/Iaxpermit.xml");
    // assertEquals("load save XML Iaxpermit",true,checkIaxpermit(Obj, object));
    // }
    // public final void testIaxpeerLoadSaveXML() {
    // Iaxpeer Obj = createIaxpeer();
    // MMFiaxconf.getInstance().writeConfXML("temp/Iaxpeer.xml", Obj);
    // Object object = MMFiaxconf.getInstance().readConfXML("temp/Iaxpeer.xml");
    // assertEquals("load save XML Iaxpeer",true,checkIaxpeer(Obj, object));
    // }
    public final void testIaxgeneralLoadSaveXML() {
        Iaxgeneral Obj = createIaxgeneral();
        MMFiaxconf.getInstance().writeConfXML("temp/Iaxgeneral.xml", Obj);
        Object object = MMFiaxconf.getInstance().readConfXML(
                "temp/Iaxgeneral.xml");
        assertEquals("load save XML Iaxgeneral", true, checkIaxgeneral(Obj,
                object));
    }

    // public final void testIaxjitterloadSaveConf() {
    // Iaxjitter Obj = createIaxjitter();
    // try{
    // MMFiaxconf.getInstance().writetoFile(Obj,"temp/Iaxjitter.cfg");
    // Object object = MMFiaxconf.getInstance().readConf(new
    // File("temp/Iaxjitter.cfg"));
    // assertEquals("load save conf Iaxjitter",true,checkIaxjitter(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testIaxjitterloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testIaxjitterloadSaveConf()", e);
    // }
    // }
    // public final void testIaxregisterloadSaveConf() {
    // Iaxregister Obj = createIaxregister();
    // try{
    // MMFiaxconf.getInstance().writetoFile(Obj,"temp/Iaxregister.cfg");
    // Object object = MMFiaxconf.getInstance().readConf(new
    // File("temp/Iaxregister.cfg"));
    // assertEquals("load save conf
    // Iaxregister",true,checkIaxregister(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testIaxregisterloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testIaxregisterloadSaveConf()", e);
    // }
    // }
    // public final void testIaxdenyloadSaveConf() {
    // Iaxdeny Obj = createIaxdeny();
    // try{
    // MMFiaxconf.getInstance().writetoFile(Obj,"temp/Iaxdeny.cfg");
    // Object object = MMFiaxconf.getInstance().readConf(new
    // File("temp/Iaxdeny.cfg"));
    // assertEquals("load save conf Iaxdeny",true,checkIaxdeny(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testIaxdenyloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testIaxdenyloadSaveConf()", e);
    // }
    // }
    // public final void testIaxpermitloadSaveConf() {
    // Iaxpermit Obj = createIaxpermit();
    // try{
    // MMFiaxconf.getInstance().writetoFile(Obj,"temp/Iaxpermit.cfg");
    // Object object = MMFiaxconf.getInstance().readConf(new
    // File("temp/Iaxpermit.cfg"));
    // assertEquals("load save conf Iaxpermit",true,checkIaxpermit(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testIaxpermitloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testIaxpermitloadSaveConf()", e);
    // }
    // }
    // public final void testIaxpeerloadSaveConf() {
    // Iaxpeer Obj = createIaxpeer();
    // try{
    // MMFiaxconf.getInstance().writetoFile(Obj,"temp/Iaxpeer.cfg");
    // Object object = MMFiaxconf.getInstance().readConf(new
    // File("temp/Iaxpeer.cfg"));
    // assertEquals("load save conf Iaxpeer",true,checkIaxpeer(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testIaxpeerloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testIaxpeerloadSaveConf()", e);
    // }
    // }
    public final void testIaxgeneralloadSaveConf() {
        Iaxgeneral Obj = createIaxgeneral();
        try {
            MMFiaxconf.getInstance().writetoFile(Obj, "temp/Iaxgeneral.cfg");
            Object object = MMFiaxconf.getInstance().readConf(
                    new File("temp/Iaxgeneral.cfg"));
            assertEquals("load save conf Iaxgeneral", true, checkIaxgeneral(
                    Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testIaxgeneralloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testIaxgeneralloadSaveConf()", e);
        }
    }

    public final void testIaxjitterLoadSaveHibernate() {
        Iaxjitter Obj = createIaxjitter();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testIaxjitterLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(IaxjitterImpl.class, Obj.getId());
        assertEquals("load save Iaxjitter", Obj, object);

    }

    public final void testIaxregisterLoadSaveHibernate() {
        Iaxregister Obj = createIaxregister();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testIaxregisterLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(IaxregisterImpl.class, Obj.getId());
        assertEquals("load save Iaxregister", Obj, object);

    }

    public final void testIaxdenyLoadSaveHibernate() {
        Iaxdeny Obj = createIaxdeny();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testIaxdenyLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(IaxdenyImpl.class, Obj.getId());
        assertEquals("load save Iaxdeny", Obj, object);

    }

    public final void testIaxpermitLoadSaveHibernate() {
        Iaxpermit Obj = createIaxpermit();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testIaxpermitLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(IaxpermitImpl.class, Obj.getId());
        assertEquals("load save Iaxpermit", Obj, object);

    }

    public final void testIaxpeerLoadSaveHibernate() {
        Iaxpeer Obj = createIaxpeer();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testIaxpeerLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(IaxpeerImpl.class, Obj.getId());
        assertEquals("load save Iaxpeer", Obj, object);

    }

    public final void testIaxgeneralLoadSaveHibernate() {
        Iaxgeneral Obj = createIaxgeneral();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testIaxgeneralLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(IaxgeneralImpl.class, Obj.getId());
        assertEquals("load save Iaxgeneral", Obj, object);

    }

    /*
     * überprüft Iaxjitter
     */
    protected static boolean checkIaxjitter(Iaxjitter org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Iaxjitter copy = null;
        if (obj instanceof Iaxjitter) {
            copy = (Iaxjitter) obj;

        } else {
            LOGGER.warn("checkIaxjitter failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Iaxjitter.VALUEID_JITTERBUFFER).equals(
                copy.getByValue(Iaxjitter.VALUEID_JITTERBUFFER));
        if (!test)
            LOGGER.warn("checkIaxjitter failed : JITTERBUFFER "
                    + org.getByValue(Iaxjitter.VALUEID_JITTERBUFFER) + " : "
                    + copy.getByValue(Iaxjitter.VALUEID_JITTERBUFFER));

        test = org.getByValue(Iaxjitter.VALUEID_FORCEJITTERBUFFER).equals(
                copy.getByValue(Iaxjitter.VALUEID_FORCEJITTERBUFFER));
        if (!test)
            LOGGER.warn("checkIaxjitter failed : FORCEJITTERBUFFER "
                    + org.getByValue(Iaxjitter.VALUEID_FORCEJITTERBUFFER)
                    + " : "
                    + copy.getByValue(Iaxjitter.VALUEID_FORCEJITTERBUFFER));

        test = org.getByValue(Iaxjitter.VALUEID_DROPCOUNT).equals(
                copy.getByValue(Iaxjitter.VALUEID_DROPCOUNT));
        if (!test)
            LOGGER.warn("checkIaxjitter failed : DROPCOUNT "
                    + org.getByValue(Iaxjitter.VALUEID_DROPCOUNT) + " : "
                    + copy.getByValue(Iaxjitter.VALUEID_DROPCOUNT));

        test = org.getByValue(Iaxjitter.VALUEID_MAXJITTERBUFFER).equals(
                copy.getByValue(Iaxjitter.VALUEID_MAXJITTERBUFFER));
        if (!test)
            LOGGER.warn("checkIaxjitter failed : MAXJITTERBUFFER "
                    + org.getByValue(Iaxjitter.VALUEID_MAXJITTERBUFFER) + " : "
                    + copy.getByValue(Iaxjitter.VALUEID_MAXJITTERBUFFER));

        test = org.getByValue(Iaxjitter.VALUEID_RESYNCTHRESHOLD).equals(
                copy.getByValue(Iaxjitter.VALUEID_RESYNCTHRESHOLD));
        if (!test)
            LOGGER.warn("checkIaxjitter failed : RESYNCTHRESHOLD "
                    + org.getByValue(Iaxjitter.VALUEID_RESYNCTHRESHOLD) + " : "
                    + copy.getByValue(Iaxjitter.VALUEID_RESYNCTHRESHOLD));

        test = org.getByValue(Iaxjitter.VALUEID_MAXJITTERINTERPS).equals(
                copy.getByValue(Iaxjitter.VALUEID_MAXJITTERINTERPS));
        if (!test)
            LOGGER.warn("checkIaxjitter failed : MAXJITTERINTERPS "
                    + org.getByValue(Iaxjitter.VALUEID_MAXJITTERINTERPS)
                    + " : "
                    + copy.getByValue(Iaxjitter.VALUEID_MAXJITTERINTERPS));

        test = org.getByValue(Iaxjitter.VALUEID_MAXEXCESSBUFFER).equals(
                copy.getByValue(Iaxjitter.VALUEID_MAXEXCESSBUFFER));
        if (!test)
            LOGGER.warn("checkIaxjitter failed : MAXEXCESSBUFFER "
                    + org.getByValue(Iaxjitter.VALUEID_MAXEXCESSBUFFER) + " : "
                    + copy.getByValue(Iaxjitter.VALUEID_MAXEXCESSBUFFER));

        test = org.getByValue(Iaxjitter.VALUEID_MINEXCESSBUFFER).equals(
                copy.getByValue(Iaxjitter.VALUEID_MINEXCESSBUFFER));
        if (!test)
            LOGGER.warn("checkIaxjitter failed : MINEXCESSBUFFER "
                    + org.getByValue(Iaxjitter.VALUEID_MINEXCESSBUFFER) + " : "
                    + copy.getByValue(Iaxjitter.VALUEID_MINEXCESSBUFFER));

        test = org.getByValue(Iaxjitter.VALUEID_JITTERSHRINKRATE).equals(
                copy.getByValue(Iaxjitter.VALUEID_JITTERSHRINKRATE));
        if (!test)
            LOGGER.warn("checkIaxjitter failed : JITTERSHRINKRATE "
                    + org.getByValue(Iaxjitter.VALUEID_JITTERSHRINKRATE)
                    + " : "
                    + copy.getByValue(Iaxjitter.VALUEID_JITTERSHRINKRATE));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Iaxregister
     */
    protected static boolean checkIaxregister(Iaxregister org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Iaxregister copy = null;
        if (obj instanceof Iaxregister) {
            copy = (Iaxregister) obj;

        } else {
            LOGGER.warn("checkIaxregister failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Iaxregister.VALUEID_USER).equals(
                copy.getByValue(Iaxregister.VALUEID_USER));
        if (!test)
            LOGGER.warn("checkIaxregister failed : USER "
                    + org.getByValue(Iaxregister.VALUEID_USER) + " : "
                    + copy.getByValue(Iaxregister.VALUEID_USER));

        test = org.getByValue(Iaxregister.VALUEID_AUTHUSER).equals(
                copy.getByValue(Iaxregister.VALUEID_AUTHUSER));
        if (!test)
            LOGGER.warn("checkIaxregister failed : AUTHUSER "
                    + org.getByValue(Iaxregister.VALUEID_AUTHUSER) + " : "
                    + copy.getByValue(Iaxregister.VALUEID_AUTHUSER));

        test = org.getByValue(Iaxregister.VALUEID_SECRET).equals(
                copy.getByValue(Iaxregister.VALUEID_SECRET));
        if (!test)
            LOGGER.warn("checkIaxregister failed : SECRET "
                    + org.getByValue(Iaxregister.VALUEID_SECRET) + " : "
                    + copy.getByValue(Iaxregister.VALUEID_SECRET));

        test = org.getByValue(Iaxregister.VALUEID_HOST).equals(
                copy.getByValue(Iaxregister.VALUEID_HOST));
        if (!test)
            LOGGER.warn("checkIaxregister failed : HOST "
                    + org.getByValue(Iaxregister.VALUEID_HOST) + " : "
                    + copy.getByValue(Iaxregister.VALUEID_HOST));

        test = org.getByValue(Iaxregister.VALUEID_PORT).equals(
                copy.getByValue(Iaxregister.VALUEID_PORT));
        if (!test)
            LOGGER.warn("checkIaxregister failed : PORT "
                    + org.getByValue(Iaxregister.VALUEID_PORT) + " : "
                    + copy.getByValue(Iaxregister.VALUEID_PORT));

        test = org.getByValue(Iaxregister.VALUEID_EXTENSION).equals(
                copy.getByValue(Iaxregister.VALUEID_EXTENSION));
        if (!test)
            LOGGER.warn("checkIaxregister failed : EXTENSION "
                    + org.getByValue(Iaxregister.VALUEID_EXTENSION) + " : "
                    + copy.getByValue(Iaxregister.VALUEID_EXTENSION));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Iaxdeny
     */
    protected static boolean checkIaxdeny(Iaxdeny org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Iaxdeny copy = null;
        if (obj instanceof Iaxdeny) {
            copy = (Iaxdeny) obj;

        } else {
            LOGGER.warn("checkIaxdeny failed : cast " + org.getClass() + " : "
                    + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Iaxdeny.VALUEID_VALUE).equals(
                copy.getByValue(Iaxdeny.VALUEID_VALUE));
        if (!test)
            LOGGER.warn("checkIaxdeny failed : VALUE "
                    + org.getByValue(Iaxdeny.VALUEID_VALUE) + " : "
                    + copy.getByValue(Iaxdeny.VALUEID_VALUE));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Iaxpermit
     */
    protected static boolean checkIaxpermit(Iaxpermit org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Iaxpermit copy = null;
        if (obj instanceof Iaxpermit) {
            copy = (Iaxpermit) obj;

        } else {
            LOGGER.warn("checkIaxpermit failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Iaxpermit.VALUEID_VALUE).equals(
                copy.getByValue(Iaxpermit.VALUEID_VALUE));
        if (!test)
            LOGGER.warn("checkIaxpermit failed : VALUE "
                    + org.getByValue(Iaxpermit.VALUEID_VALUE) + " : "
                    + copy.getByValue(Iaxpermit.VALUEID_VALUE));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Iaxpeer
     */
    protected static boolean checkIaxpeer(Iaxpeer org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Iaxpeer copy = null;
        if (obj instanceof Iaxpeer) {
            copy = (Iaxpeer) obj;

        } else {
            LOGGER.warn("checkIaxpeer failed : cast " + org.getClass() + " : "
                    + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Iaxpeer.VALUEID_IAXPEERNAME).equals(
                copy.getByValue(Iaxpeer.VALUEID_IAXPEERNAME));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : IAXPEERNAME "
                    + org.getByValue(Iaxpeer.VALUEID_IAXPEERNAME) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_IAXPEERNAME));

        test = org.getByValue(Iaxpeer.VALUEID_PEERTYPE).equals(
                copy.getByValue(Iaxpeer.VALUEID_PEERTYPE));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : PEERTYPE "
                    + org.getByValue(Iaxpeer.VALUEID_PEERTYPE) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_PEERTYPE));

        test = org.getByValue(Iaxpeer.VALUEID_CALLERID).equals(
                copy.getByValue(Iaxpeer.VALUEID_CALLERID));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : CALLERID "
                    + org.getByValue(Iaxpeer.VALUEID_CALLERID) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_CALLERID));

        test = org.getByValue(Iaxpeer.VALUEID_AUTH).equals(
                copy.getByValue(Iaxpeer.VALUEID_AUTH));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : AUTH "
                    + org.getByValue(Iaxpeer.VALUEID_AUTH) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_AUTH));

        test = org.getByValue(Iaxpeer.VALUEID_SECRET).equals(
                copy.getByValue(Iaxpeer.VALUEID_SECRET));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : SECRET "
                    + org.getByValue(Iaxpeer.VALUEID_SECRET) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_SECRET));

        test = org.getByValue(Iaxpeer.VALUEID_INKEYS).equals(
                copy.getByValue(Iaxpeer.VALUEID_INKEYS));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : INKEYS "
                    + org.getByValue(Iaxpeer.VALUEID_INKEYS) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_INKEYS));

        test = org.getByValue(Iaxpeer.VALUEID_HOST).equals(
                copy.getByValue(Iaxpeer.VALUEID_HOST));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : HOST "
                    + org.getByValue(Iaxpeer.VALUEID_HOST) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_HOST));

        test = org.getByValue(Iaxpeer.VALUEID_DEFAULTIP).equals(
                copy.getByValue(Iaxpeer.VALUEID_DEFAULTIP));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : DEFAULTIP "
                    + org.getByValue(Iaxpeer.VALUEID_DEFAULTIP) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_DEFAULTIP));

        test = org.getByValue(Iaxpeer.VALUEID_CONTEXT).equals(
                copy.getByValue(Iaxpeer.VALUEID_CONTEXT));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : CONTEXT "
                    + org.getByValue(Iaxpeer.VALUEID_CONTEXT) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_CONTEXT));

        test = org.getByValue(Iaxpeer.VALUEID_DBSECRET).equals(
                copy.getByValue(Iaxpeer.VALUEID_DBSECRET));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : DBSECRET "
                    + org.getByValue(Iaxpeer.VALUEID_DBSECRET) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_DBSECRET));

        test = org.getByValue(Iaxpeer.VALUEID_SETVAR).equals(
                copy.getByValue(Iaxpeer.VALUEID_SETVAR));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : SETVAR "
                    + org.getByValue(Iaxpeer.VALUEID_SETVAR) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_SETVAR));

        test = org.getByValue(Iaxpeer.VALUEID_PEERCONTEXT).equals(
                copy.getByValue(Iaxpeer.VALUEID_PEERCONTEXT));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : PEERCONTEXT "
                    + org.getByValue(Iaxpeer.VALUEID_PEERCONTEXT) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_PEERCONTEXT));

        test = org.getByValue(Iaxpeer.VALUEID_QUALIFY).equals(
                copy.getByValue(Iaxpeer.VALUEID_QUALIFY));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : QUALIFY "
                    + org.getByValue(Iaxpeer.VALUEID_QUALIFY) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_QUALIFY));

        test = org.getByValue(Iaxpeer.VALUEID_TRUNK).equals(
                copy.getByValue(Iaxpeer.VALUEID_TRUNK));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : TRUNK "
                    + org.getByValue(Iaxpeer.VALUEID_TRUNK) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_TRUNK));

        test = org.getByValue(Iaxpeer.VALUEID_TIMEZONE).equals(
                copy.getByValue(Iaxpeer.VALUEID_TIMEZONE));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : TIMEZONE "
                    + org.getByValue(Iaxpeer.VALUEID_TIMEZONE) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_TIMEZONE));

        test = org.getByValue(Iaxpeer.VALUEID_REGEXTEN).equals(
                copy.getByValue(Iaxpeer.VALUEID_REGEXTEN));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : REGEXTEN "
                    + org.getByValue(Iaxpeer.VALUEID_REGEXTEN) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_REGEXTEN));

        test = org.getByValue(Iaxpeer.VALUEID_DISALLOW).equals(
                copy.getByValue(Iaxpeer.VALUEID_DISALLOW));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : DISALLOW "
                    + org.getByValue(Iaxpeer.VALUEID_DISALLOW) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_DISALLOW));

        test = org.getByValue(Iaxpeer.VALUEID_ALLOW).equals(
                copy.getByValue(Iaxpeer.VALUEID_ALLOW));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : ALLOW "
                    + org.getByValue(Iaxpeer.VALUEID_ALLOW) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_ALLOW));

        test = org.getByValue(Iaxpeer.VALUEID_MAILBOX).equals(
                copy.getByValue(Iaxpeer.VALUEID_MAILBOX));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : MAILBOX "
                    + org.getByValue(Iaxpeer.VALUEID_MAILBOX) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_MAILBOX));

        test = org.getByValue(Iaxpeer.VALUEID_ACCOUNTCODE).equals(
                copy.getByValue(Iaxpeer.VALUEID_ACCOUNTCODE));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : ACCOUNTCODE "
                    + org.getByValue(Iaxpeer.VALUEID_ACCOUNTCODE) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_ACCOUNTCODE));

        test = org.getByValue(Iaxpeer.VALUEID_OUTKEY).equals(
                copy.getByValue(Iaxpeer.VALUEID_OUTKEY));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : OUTKEY "
                    + org.getByValue(Iaxpeer.VALUEID_OUTKEY) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_OUTKEY));

        test = org.getByValue(Iaxpeer.VALUEID_NOTRANSFER).equals(
                copy.getByValue(Iaxpeer.VALUEID_NOTRANSFER));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : NOTRANSFER "
                    + org.getByValue(Iaxpeer.VALUEID_NOTRANSFER) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_NOTRANSFER));

        test = org.getByValue(Iaxpeer.VALUEID_QUALIFYSMOOTHING).equals(
                copy.getByValue(Iaxpeer.VALUEID_QUALIFYSMOOTHING));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : QUALIFYSMOOTHING "
                    + org.getByValue(Iaxpeer.VALUEID_QUALIFYSMOOTHING) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_QUALIFYSMOOTHING));

        test = org.getByValue(Iaxpeer.VALUEID_QUALIFYFREQOK).equals(
                copy.getByValue(Iaxpeer.VALUEID_QUALIFYFREQOK));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : QUALIFYFREQOK "
                    + org.getByValue(Iaxpeer.VALUEID_QUALIFYFREQOK) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_QUALIFYFREQOK));

        test = org.getByValue(Iaxpeer.VALUEID_QUALIFYFREQNOTOK).equals(
                copy.getByValue(Iaxpeer.VALUEID_QUALIFYFREQNOTOK));
        if (!test)
            LOGGER.warn("checkIaxpeer failed : QUALIFYFREQNOTOK "
                    + org.getByValue(Iaxpeer.VALUEID_QUALIFYFREQNOTOK) + " : "
                    + copy.getByValue(Iaxpeer.VALUEID_QUALIFYFREQNOTOK));

        // ---------------agg
        // -----------------map
        test = org.getIaxdenyMap().size() == copy.getIaxdenyMap().size();

        if (!test) {
            LOGGER.warn("checkIaxpeer failed : iaxdenyMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getIaxdenyMap().size(); i++) {
            test = checkIaxdeny(org.getIaxdenyMap().get(i), copy
                    .getIaxdenyMap().get(i));

            if (!test) {
                LOGGER.warn("checkIaxpeer failed : iaxdenyMap  equals " + i
                        + " " + org.getIaxdenyMap().get(i) + " : "
                        + copy.getIaxdenyMap().get(i));
                return test;
            }
        }// end of for i to org.getIaxdenyMap()

        // newIaxpeer.addIaxdeny(createIaxdeny());
        test = org.getIaxpermitMap().size() == copy.getIaxpermitMap().size();

        if (!test) {
            LOGGER.warn("checkIaxpeer failed : iaxpermitMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getIaxpermitMap().size(); i++) {
            test = checkIaxpermit(org.getIaxpermitMap().get(i), copy
                    .getIaxpermitMap().get(i));

            if (!test) {
                LOGGER.warn("checkIaxpeer failed : iaxpermitMap  equals " + i
                        + " " + org.getIaxpermitMap().get(i) + " : "
                        + copy.getIaxpermitMap().get(i));
                return test;
            }
        }// end of for i to org.getIaxpermitMap()

        // newIaxpeer.addIaxpermit(createIaxpermit());
        return test;
    }

    /*
     * überprüft Iaxgeneral
     */
    protected static boolean checkIaxgeneral(Iaxgeneral org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Iaxgeneral copy = null;
        if (obj instanceof Iaxgeneral) {
            copy = (Iaxgeneral) obj;

        } else {
            LOGGER.warn("checkIaxgeneral failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Iaxgeneral.VALUEID_BINDPORT).equals(
                copy.getByValue(Iaxgeneral.VALUEID_BINDPORT));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : BINDPORT "
                    + org.getByValue(Iaxgeneral.VALUEID_BINDPORT) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_BINDPORT));

        test = org.getByValue(Iaxgeneral.VALUEID_BINDADDR).equals(
                copy.getByValue(Iaxgeneral.VALUEID_BINDADDR));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : BINDADDR "
                    + org.getByValue(Iaxgeneral.VALUEID_BINDADDR) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_BINDADDR));

        test = org.getByValue(Iaxgeneral.VALUEID_IAXCOMPAT).equals(
                copy.getByValue(Iaxgeneral.VALUEID_IAXCOMPAT));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : IAXCOMPAT "
                    + org.getByValue(Iaxgeneral.VALUEID_IAXCOMPAT) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_IAXCOMPAT));

        test = org.getByValue(Iaxgeneral.VALUEID_NOCHECKSUMS).equals(
                copy.getByValue(Iaxgeneral.VALUEID_NOCHECKSUMS));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : NOCHECKSUMS "
                    + org.getByValue(Iaxgeneral.VALUEID_NOCHECKSUMS) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_NOCHECKSUMS));

        test = org.getByValue(Iaxgeneral.VALUEID_DELAYREJECT).equals(
                copy.getByValue(Iaxgeneral.VALUEID_DELAYREJECT));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : DELAYREJECT "
                    + org.getByValue(Iaxgeneral.VALUEID_DELAYREJECT) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_DELAYREJECT));

        test = org.getByValue(Iaxgeneral.VALUEID_AMAFLAGS).equals(
                copy.getByValue(Iaxgeneral.VALUEID_AMAFLAGS));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : AMAFLAGS "
                    + org.getByValue(Iaxgeneral.VALUEID_AMAFLAGS) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_AMAFLAGS));

        test = org.getByValue(Iaxgeneral.VALUEID_ACCOUNTCODE).equals(
                copy.getByValue(Iaxgeneral.VALUEID_ACCOUNTCODE));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : ACCOUNTCODE "
                    + org.getByValue(Iaxgeneral.VALUEID_ACCOUNTCODE) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_ACCOUNTCODE));

        test = org.getByValue(Iaxgeneral.VALUEID_LANGUAGE).equals(
                copy.getByValue(Iaxgeneral.VALUEID_LANGUAGE));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : LANGUAGE "
                    + org.getByValue(Iaxgeneral.VALUEID_LANGUAGE) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_LANGUAGE));

        test = org.getByValue(Iaxgeneral.VALUEID_BANDWIDTH).equals(
                copy.getByValue(Iaxgeneral.VALUEID_BANDWIDTH));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : BANDWIDTH "
                    + org.getByValue(Iaxgeneral.VALUEID_BANDWIDTH) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_BANDWIDTH));

        test = org.getByValue(Iaxgeneral.VALUEID_TRUNKTIMESTAMPS).equals(
                copy.getByValue(Iaxgeneral.VALUEID_TRUNKTIMESTAMPS));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : TRUNKTIMESTAMPS "
                    + org.getByValue(Iaxgeneral.VALUEID_TRUNKTIMESTAMPS)
                    + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_TRUNKTIMESTAMPS));

        test = org.getByValue(Iaxgeneral.VALUEID_AUTHDEBUG).equals(
                copy.getByValue(Iaxgeneral.VALUEID_AUTHDEBUG));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : AUTHDEBUG "
                    + org.getByValue(Iaxgeneral.VALUEID_AUTHDEBUG) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_AUTHDEBUG));

        test = org.getByValue(Iaxgeneral.VALUEID_TOS).equals(
                copy.getByValue(Iaxgeneral.VALUEID_TOS));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : TOS "
                    + org.getByValue(Iaxgeneral.VALUEID_TOS) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_TOS));

        test = org.getByValue(Iaxgeneral.VALUEID_MAILBOXDETAIL).equals(
                copy.getByValue(Iaxgeneral.VALUEID_MAILBOXDETAIL));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : MAILBOXDETAIL "
                    + org.getByValue(Iaxgeneral.VALUEID_MAILBOXDETAIL) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_MAILBOXDETAIL));

        test = org.getByValue(Iaxgeneral.VALUEID_REGCONTEXT).equals(
                copy.getByValue(Iaxgeneral.VALUEID_REGCONTEXT));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : REGCONTEXT "
                    + org.getByValue(Iaxgeneral.VALUEID_REGCONTEXT) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_REGCONTEXT));

        test = org.getByValue(Iaxgeneral.VALUEID_AUTOKILL).equals(
                copy.getByValue(Iaxgeneral.VALUEID_AUTOKILL));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : AUTOKILL "
                    + org.getByValue(Iaxgeneral.VALUEID_AUTOKILL) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_AUTOKILL));

        test = org.getByValue(Iaxgeneral.VALUEID_CODECPRIORITY).equals(
                copy.getByValue(Iaxgeneral.VALUEID_CODECPRIORITY));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : CODECPRIORITY "
                    + org.getByValue(Iaxgeneral.VALUEID_CODECPRIORITY) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_CODECPRIORITY));

        test = org.getByValue(Iaxgeneral.VALUEID_RTCACHEFRIENDS).equals(
                copy.getByValue(Iaxgeneral.VALUEID_RTCACHEFRIENDS));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : RTCACHEFRIENDS "
                    + org.getByValue(Iaxgeneral.VALUEID_RTCACHEFRIENDS) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_RTCACHEFRIENDS));

        test = org.getByValue(Iaxgeneral.VALUEID_RTUPDATE).equals(
                copy.getByValue(Iaxgeneral.VALUEID_RTUPDATE));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : RTUPDATE "
                    + org.getByValue(Iaxgeneral.VALUEID_RTUPDATE) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_RTUPDATE));

        test = org.getByValue(Iaxgeneral.VALUEID_RTAUTOCLEAR).equals(
                copy.getByValue(Iaxgeneral.VALUEID_RTAUTOCLEAR));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : RTAUTOCLEAR "
                    + org.getByValue(Iaxgeneral.VALUEID_RTAUTOCLEAR) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_RTAUTOCLEAR));

        test = org.getByValue(Iaxgeneral.VALUEID_RTIGNOREEXPIRE).equals(
                copy.getByValue(Iaxgeneral.VALUEID_RTIGNOREEXPIRE));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : RTIGNOREEXPIRE "
                    + org.getByValue(Iaxgeneral.VALUEID_RTIGNOREEXPIRE) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_RTIGNOREEXPIRE));

        test = org.getByValue(Iaxgeneral.VALUEID_TRUNKFREQ).equals(
                copy.getByValue(Iaxgeneral.VALUEID_TRUNKFREQ));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : TRUNKFREQ "
                    + org.getByValue(Iaxgeneral.VALUEID_TRUNKFREQ) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_TRUNKFREQ));

        test = org.getByValue(Iaxgeneral.VALUEID_DISALLOW).equals(
                copy.getByValue(Iaxgeneral.VALUEID_DISALLOW));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : DISALLOW "
                    + org.getByValue(Iaxgeneral.VALUEID_DISALLOW) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_DISALLOW));

        test = org.getByValue(Iaxgeneral.VALUEID_ALLOW).equals(
                copy.getByValue(Iaxgeneral.VALUEID_ALLOW));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : ALLOW "
                    + org.getByValue(Iaxgeneral.VALUEID_ALLOW) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_ALLOW));

        test = org.getByValue(Iaxgeneral.VALUEID_MINREGEXPIRE).equals(
                copy.getByValue(Iaxgeneral.VALUEID_MINREGEXPIRE));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : MINREGEXPIRE "
                    + org.getByValue(Iaxgeneral.VALUEID_MINREGEXPIRE) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_MINREGEXPIRE));

        test = org.getByValue(Iaxgeneral.VALUEID_MAXREGEXPIRE).equals(
                copy.getByValue(Iaxgeneral.VALUEID_MAXREGEXPIRE));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : MAXREGEXPIRE "
                    + org.getByValue(Iaxgeneral.VALUEID_MAXREGEXPIRE) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_MAXREGEXPIRE));

        test = org.getByValue(Iaxgeneral.VALUEID_NOTRANSFER).equals(
                copy.getByValue(Iaxgeneral.VALUEID_NOTRANSFER));
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : NOTRANSFER "
                    + org.getByValue(Iaxgeneral.VALUEID_NOTRANSFER) + " : "
                    + copy.getByValue(Iaxgeneral.VALUEID_NOTRANSFER));

        // ---------------agg
        test = checkIaxjitter(org.getIaxjitter(), copy.getIaxjitter());
        if (!test)
            LOGGER.warn("checkIaxgeneral failed : iaxjitter " + org.toString()
                    + " : " + copy.toString());
        // -----------------map
        test = org.getIaxpeerMap().size() == copy.getIaxpeerMap().size();

        if (!test) {
            LOGGER.warn("checkIaxgeneral failed : iaxpeerMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getIaxpeerMap().size(); i++) {
            test = checkIaxpeer(org.getIaxpeerMap().get(i), copy
                    .getIaxpeerMap().get(i));

            if (!test) {
                LOGGER.warn("checkIaxgeneral failed : iaxpeerMap  equals " + i
                        + " " + org.getIaxpeerMap().get(i) + " : "
                        + copy.getIaxpeerMap().get(i));
                return test;
            }
        }// end of for i to org.getIaxpeerMap()

        // newIaxgeneral.addIaxpeer(createIaxpeer());
        test = org.getIaxregisterMap().size() == copy.getIaxregisterMap()
                .size();

        if (!test) {
            LOGGER.warn("checkIaxgeneral failed : iaxregisterMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getIaxregisterMap().size(); i++) {
            test = checkIaxregister(org.getIaxregisterMap().get(i), copy
                    .getIaxregisterMap().get(i));

            if (!test) {
                LOGGER.warn("checkIaxgeneral failed : iaxregisterMap  equals "
                        + i + " " + org.getIaxregisterMap().get(i) + " : "
                        + copy.getIaxregisterMap().get(i));
                return test;
            }
        }// end of for i to org.getIaxregisterMap()

        // newIaxgeneral.addIaxregister(createIaxregister());
        return test;
    }

    /*
     * erzeugt und initalisiert Iaxjitter
     */
    protected static Iaxjitter createIaxjitter() {
        Iaxjitter newIaxjitter = new IaxjitterImpl();
        // fields
        newIaxjitter.setByValue(Iaxjitter.VALUEID_JITTERBUFFER, Boolean.TRUE);
        newIaxjitter.setByValue(Iaxjitter.VALUEID_FORCEJITTERBUFFER,
                Boolean.TRUE);
        newIaxjitter
                .setByValue(Iaxjitter.VALUEID_DROPCOUNT, Integer.valueOf(0));
        newIaxjitter.setByValue(Iaxjitter.VALUEID_MAXJITTERBUFFER, Integer
                .valueOf(0));
        newIaxjitter.setByValue(Iaxjitter.VALUEID_RESYNCTHRESHOLD, Integer
                .valueOf(0));
        newIaxjitter.setByValue(Iaxjitter.VALUEID_MAXJITTERINTERPS, Integer
                .valueOf(0));
        newIaxjitter.setByValue(Iaxjitter.VALUEID_MAXEXCESSBUFFER, Integer
                .valueOf(0));
        newIaxjitter.setByValue(Iaxjitter.VALUEID_MINEXCESSBUFFER, Integer
                .valueOf(0));
        newIaxjitter.setByValue(Iaxjitter.VALUEID_JITTERSHRINKRATE, Integer
                .valueOf(0));
        // agg
        // map
        return newIaxjitter;
    }

    /*
     * erzeugt und initalisiert Iaxregister
     */
    protected static Iaxregister createIaxregister() {
        Iaxregister newIaxregister = new IaxregisterImpl();
        // fields
        newIaxregister.setByValue(Iaxregister.VALUEID_USER, "USER");
        newIaxregister.setByValue(Iaxregister.VALUEID_AUTHUSER, "AUTHUSER");
        newIaxregister.setByValue(Iaxregister.VALUEID_SECRET, "SECRET");
        newIaxregister.setByValue(Iaxregister.VALUEID_HOST, "HOST");
        newIaxregister.setByValue(Iaxregister.VALUEID_PORT, Integer.valueOf(0));
        newIaxregister.setByValue(Iaxregister.VALUEID_EXTENSION, "EXTENSION");
        // agg
        // map
        return newIaxregister;
    }

    /*
     * erzeugt und initalisiert Iaxdeny
     */
    protected static Iaxdeny createIaxdeny() {
        Iaxdeny newIaxdeny = new IaxdenyImpl();
        // fields
        newIaxdeny.setByValue(Iaxdeny.VALUEID_VALUE, "VALUE");
        // agg
        // map
        return newIaxdeny;
    }

    /*
     * erzeugt und initalisiert Iaxpermit
     */
    protected static Iaxpermit createIaxpermit() {
        Iaxpermit newIaxpermit = new IaxpermitImpl();
        // fields
        newIaxpermit.setByValue(Iaxpermit.VALUEID_VALUE, "VALUE");
        // agg
        // map
        return newIaxpermit;
    }

    /*
     * erzeugt und initalisiert Iaxpeer
     */
    protected static Iaxpeer createIaxpeer() {
        Iaxpeer newIaxpeer = new IaxpeerImpl();
        // fields
        newIaxpeer.setByValue(Iaxpeer.VALUEID_IAXPEERNAME, "IAXPEERNAME");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_PEERTYPE, new PeerType(""));
        newIaxpeer.setByValue(Iaxpeer.VALUEID_CALLERID, "CALLERID");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_AUTH, "AUTH");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_SECRET, "SECRET");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_INKEYS, "INKEYS");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_HOST, "HOST");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_DEFAULTIP, "DEFAULTIP");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_CONTEXT, new PbxContext(""));
        newIaxpeer.setByValue(Iaxpeer.VALUEID_DBSECRET, "DBSECRET");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_SETVAR, "SETVAR");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_PEERCONTEXT, new PbxContext(""));
        newIaxpeer.setByValue(Iaxpeer.VALUEID_QUALIFY, Integer.valueOf(0));
        newIaxpeer.setByValue(Iaxpeer.VALUEID_TRUNK, Boolean.TRUE);
        newIaxpeer.setByValue(Iaxpeer.VALUEID_TIMEZONE, "TIMEZONE");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_REGEXTEN, "REGEXTEN");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_DISALLOW, new CodecsSet(""));
        newIaxpeer.setByValue(Iaxpeer.VALUEID_ALLOW, new CodecsSet(""));
        newIaxpeer.setByValue(Iaxpeer.VALUEID_MAILBOX, "MAILBOX");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_ACCOUNTCODE, "ACCOUNTCODE");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_OUTKEY, "OUTKEY");
        newIaxpeer.setByValue(Iaxpeer.VALUEID_NOTRANSFER, Boolean.TRUE);
        newIaxpeer.setByValue(Iaxpeer.VALUEID_QUALIFYSMOOTHING, Boolean.TRUE);
        newIaxpeer
                .setByValue(Iaxpeer.VALUEID_QUALIFYFREQOK, Integer.valueOf(0));
        newIaxpeer.setByValue(Iaxpeer.VALUEID_QUALIFYFREQNOTOK, Integer
                .valueOf(0));
        // agg
        // map
        newIaxpeer.addIaxdeny(createIaxdeny());
        newIaxpeer.addIaxpermit(createIaxpermit());
        return newIaxpeer;
    }

    /*
     * erzeugt und initalisiert Iaxgeneral
     */
    protected static Iaxgeneral createIaxgeneral() {
        Iaxgeneral newIaxgeneral = new IaxgeneralImpl();
        // fields
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_BINDPORT, Integer
                .valueOf(0));
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_BINDADDR, "BINDADDR");
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_IAXCOMPAT, "IAXCOMPAT");
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_NOCHECKSUMS, Boolean.TRUE);
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_DELAYREJECT, Boolean.TRUE);
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_AMAFLAGS, new Amaflags(""));
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_ACCOUNTCODE, "ACCOUNTCODE");
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_LANGUAGE, "LANGUAGE");
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_BANDWIDTH, "BANDWIDTH");
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_TRUNKTIMESTAMPS, Integer
                .valueOf(0));
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_AUTHDEBUG, "AUTHDEBUG");
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_TOS, "TOS");
        newIaxgeneral
                .setByValue(Iaxgeneral.VALUEID_MAILBOXDETAIL, Boolean.TRUE);
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_REGCONTEXT, "REGCONTEXT");
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_AUTOKILL, Boolean.TRUE);
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_CODECPRIORITY,
                "CODECPRIORITY");
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_RTCACHEFRIENDS, Integer
                .valueOf(0));
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_RTUPDATE, Boolean.TRUE);
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_RTAUTOCLEAR, Boolean.TRUE);
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_RTIGNOREEXPIRE,
                Boolean.TRUE);
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_TRUNKFREQ, Integer
                .valueOf(0));
        newIaxgeneral
                .setByValue(Iaxgeneral.VALUEID_DISALLOW, new CodecsSet(""));
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_ALLOW, new CodecsSet(""));
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_MINREGEXPIRE, Integer
                .valueOf(0));
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_MAXREGEXPIRE, Integer
                .valueOf(0));
        newIaxgeneral.setByValue(Iaxgeneral.VALUEID_NOTRANSFER, Boolean.TRUE);
        // agg
        newIaxgeneral.setIaxjitter(createIaxjitter());
        // map
        newIaxgeneral.addIaxpeer(createIaxpeer());
        newIaxgeneral.addIaxregister(createIaxregister());
        return newIaxgeneral;
    }

}
