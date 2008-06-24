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
import com.useit.jact.model.musiconholdconf.MMFmusiconholdconf;
import com.useit.jact.model.musiconholdconf.MohClasses;
import com.useit.jact.model.musiconholdconf.MohClassesImpl;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConfImpl;

/**
 * <p>
 * IOmusiconholdconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOmusiconholdconfTest.java,v 1.4 2006/01/13
 *          16:54:44 urs Exp $
 */
public class IOmusiconholdconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOmusiconholdconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOmusiconholdconfTest.class);
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

    // public final void testMohClassesLoadSaveXML() {
    // MohClasses Obj = createMohClasses();
    // MMFmusiconholdconf.getInstance().writeConfXML("temp/MohClasses.xml",
    // Obj);
    // Object object =
    // MMFmusiconholdconf.getInstance().readConfXML("temp/MohClasses.xml");
    // assertEquals("load save XML MohClasses",true,checkMohClasses(Obj,
    // object));
    // }
    public final void testMusic_on_HoldConfLoadSaveXML() {
        Music_on_HoldConf Obj = createMusic_on_HoldConf();
        MMFmusiconholdconf.getInstance().writeConfXML(
                "temp/Music_on_HoldConf.xml", Obj);
        Object object = MMFmusiconholdconf.getInstance().readConfXML(
                "temp/Music_on_HoldConf.xml");
        assertEquals("load save XML Music_on_HoldConf", true,
                checkMusic_on_HoldConf(Obj, object));
    }

    // public final void testMohClassesloadSaveConf() {
    // MohClasses Obj = createMohClasses();
    // try{
    // MMFmusiconholdconf.getInstance().writetoFile(Obj,"temp/MohClasses.cfg");
    // Object object = MMFmusiconholdconf.getInstance().readConf(new
    // File("temp/MohClasses.cfg"));
    // assertEquals("load save conf
    // MohClasses",true,checkMohClasses(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testMohClassesloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testMohClassesloadSaveConf()", e);
    // }
    // }
    public final void testMusic_on_HoldConfloadSaveConf() {
        Music_on_HoldConf Obj = createMusic_on_HoldConf();
        try {
            MMFmusiconholdconf.getInstance().writetoFile(Obj,
                    "temp/Music_on_HoldConf.cfg");
            Object object = MMFmusiconholdconf.getInstance().readConf(
                    new File("temp/Music_on_HoldConf.cfg"));
            assertEquals("load save conf Music_on_HoldConf", true,
                    checkMusic_on_HoldConf(Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testMusic_on_HoldConfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testMusic_on_HoldConfloadSaveConf()", e);
        }
    }

    public final void testMohClassesLoadSaveHibernate() {
        MohClasses Obj = createMohClasses();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMohClassesLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(MohClassesImpl.class, Obj.getId());
        assertEquals("load save MohClasses", Obj, object);

    }

    public final void testMusic_on_HoldConfLoadSaveHibernate() {
        Music_on_HoldConf Obj = createMusic_on_HoldConf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMusic_on_HoldConfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(Music_on_HoldConfImpl.class, Obj.getId());
        assertEquals("load save Music_on_HoldConf", Obj, object);

    }

    /*
     * überprüft MohClasses
     */
    protected static boolean checkMohClasses(MohClasses org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        MohClasses copy = null;
        if (obj instanceof MohClasses) {
            copy = (MohClasses) obj;

        } else {
            LOGGER.warn("checkMohClasses failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(MohClasses.VALUEID_NAME).equals(
                copy.getByValue(MohClasses.VALUEID_NAME));
        if (!test)
            LOGGER.warn("checkMohClasses failed : NAME "
                    + org.getByValue(MohClasses.VALUEID_NAME) + " : "
                    + copy.getByValue(MohClasses.VALUEID_NAME));

        test = org.getByValue(MohClasses.VALUEID_PLAYER).equals(
                copy.getByValue(MohClasses.VALUEID_PLAYER));
        if (!test)
            LOGGER.warn("checkMohClasses failed : PLAYER "
                    + org.getByValue(MohClasses.VALUEID_PLAYER) + " : "
                    + copy.getByValue(MohClasses.VALUEID_PLAYER));

        test = org.getByValue(MohClasses.VALUEID_MOHDIR).equals(
                copy.getByValue(MohClasses.VALUEID_MOHDIR));
        if (!test)
            LOGGER.warn("checkMohClasses failed : MOHDIR "
                    + org.getByValue(MohClasses.VALUEID_MOHDIR) + " : "
                    + copy.getByValue(MohClasses.VALUEID_MOHDIR));

        test = org.getByValue(MohClasses.VALUEID_MOHPARA).equals(
                copy.getByValue(MohClasses.VALUEID_MOHPARA));
        if (!test)
            LOGGER.warn("checkMohClasses failed : MOHPARA "
                    + org.getByValue(MohClasses.VALUEID_MOHPARA) + " : "
                    + copy.getByValue(MohClasses.VALUEID_MOHPARA));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Music_on_HoldConf
     */
    protected static boolean checkMusic_on_HoldConf(Music_on_HoldConf org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Music_on_HoldConf copy = null;
        if (obj instanceof Music_on_HoldConf) {
            copy = (Music_on_HoldConf) obj;

        } else {
            LOGGER.warn("checkMusic_on_HoldConf failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        // ---------------agg
        // -----------------map
        test = org.getMohClassesMap().size() == copy.getMohClassesMap().size();

        if (!test) {
            LOGGER.warn("checkMusic_on_HoldConf failed : mohClassesMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getMohClassesMap().size(); i++) {
            test = checkMohClasses(org.getMohClassesMap().get(i), copy
                    .getMohClassesMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkMusic_on_HoldConf failed : mohClassesMap  equals "
                                + i
                                + " "
                                + org.getMohClassesMap().get(i)
                                + " : " + copy.getMohClassesMap().get(i));
                return test;
            }
        }// end of for i to org.getMohClassesMap()

        // newMusic_on_HoldConf.addMohClasses(createMohClasses());
        return test;
    }

    /*
     * erzeugt und initalisiert MohClasses
     */
    protected static MohClasses createMohClasses() {
        MohClasses newMohClasses = new MohClassesImpl();
        // fields
        newMohClasses.setByValue(MohClasses.VALUEID_NAME, "NAME");
        newMohClasses.setByValue(MohClasses.VALUEID_PLAYER, "PLAYER");
        newMohClasses.setByValue(MohClasses.VALUEID_MOHDIR, "MOHDIR");
        newMohClasses.setByValue(MohClasses.VALUEID_MOHPARA, "MOHPARA");
        // agg
        // map
        return newMohClasses;
    }

    /*
     * erzeugt und initalisiert Music_on_HoldConf
     */
    protected static Music_on_HoldConf createMusic_on_HoldConf() {
        Music_on_HoldConf newMusic_on_HoldConf = new Music_on_HoldConfImpl();
        // fields
        // agg
        // map
        newMusic_on_HoldConf.addMohClasses(createMohClasses());
        return newMusic_on_HoldConf;
    }

}
