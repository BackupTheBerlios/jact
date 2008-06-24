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
import com.useit.jact.model.managerconf.MMFmanagerconf;
import com.useit.jact.model.managerconf.ManagerSection;
import com.useit.jact.model.managerconf.ManagerSectionImpl;
import com.useit.jact.model.managerconf.Managerdeny;
import com.useit.jact.model.managerconf.ManagerdenyImpl;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.ManagergeneralSectionImpl;
import com.useit.jact.model.managerconf.Managerpermit;
import com.useit.jact.model.managerconf.ManagerpermitImpl;

/**
 * <p>
 * IOmanagerconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOmanagerconfTest.java,v 1.4 2006/01/12
 *          19:44:45 urs Exp $
 */
public class IOmanagerconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOmanagerconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOmanagerconfTest.class);
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

    // public final void testManagerSectionLoadSaveXML() {
    // ManagerSection Obj = createManagerSection();
    // MMFmanagerconf.getInstance().writeConfXML("temp/ManagerSection.xml",
    // Obj);
    // Object object =
    // MMFmanagerconf.getInstance().readConfXML("temp/ManagerSection.xml");
    // assertEquals("load save XML ManagerSection",true,checkManagerSection(Obj,
    // object));
    // }
    // public final void testManagerdenyLoadSaveXML() {
    // Managerdeny Obj = createManagerdeny();
    // MMFmanagerconf.getInstance().writeConfXML("temp/Managerdeny.xml", Obj);
    // Object object =
    // MMFmanagerconf.getInstance().readConfXML("temp/Managerdeny.xml");
    // assertEquals("load save XML Managerdeny",true,checkManagerdeny(Obj,
    // object));
    // }
    // public final void testManagerpermitLoadSaveXML() {
    // Managerpermit Obj = createManagerpermit();
    // MMFmanagerconf.getInstance().writeConfXML("temp/Managerpermit.xml", Obj);
    // Object object =
    // MMFmanagerconf.getInstance().readConfXML("temp/Managerpermit.xml");
    // assertEquals("load save XML Managerpermit",true,checkManagerpermit(Obj,
    // object));
    // }
    public final void testManagergeneralSectionLoadSaveXML() {
        ManagergeneralSection Obj = createManagergeneralSection();
        MMFmanagerconf.getInstance().writeConfXML(
                "temp/ManagergeneralSection.xml", Obj);
        Object object = MMFmanagerconf.getInstance().readConfXML(
                "temp/ManagergeneralSection.xml");
        assertEquals("load save XML ManagergeneralSection", true,
                checkManagergeneralSection(Obj, object));
    }

    // public final void testManagerSectionloadSaveConf() {
    // ManagerSection Obj = createManagerSection();
    // try{
    // MMFmanagerconf.getInstance().writetoFile(Obj,"temp/ManagerSection.cfg");
    // Object object = MMFmanagerconf.getInstance().readConf(new
    // File("temp/ManagerSection.cfg"));
    // assertEquals("load save conf
    // ManagerSection",true,checkManagerSection(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testManagerSectionloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testManagerSectionloadSaveConf()", e);
    // }
    // }
    // public final void testManagerdenyloadSaveConf() {
    // Managerdeny Obj = createManagerdeny();
    // try{
    // MMFmanagerconf.getInstance().writetoFile(Obj,"temp/Managerdeny.cfg");
    // Object object = MMFmanagerconf.getInstance().readConf(new
    // File("temp/Managerdeny.cfg"));
    // assertEquals("load save conf
    // Managerdeny",true,checkManagerdeny(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testManagerdenyloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testManagerdenyloadSaveConf()", e);
    // }
    // }
    // public final void testManagerpermitloadSaveConf() {
    // Managerpermit Obj = createManagerpermit();
    // try{
    // MMFmanagerconf.getInstance().writetoFile(Obj,"temp/Managerpermit.cfg");
    // Object object = MMFmanagerconf.getInstance().readConf(new
    // File("temp/Managerpermit.cfg"));
    // assertEquals("load save conf
    // Managerpermit",true,checkManagerpermit(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testManagerpermitloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testManagerpermitloadSaveConf()", e);
    // }
    // }
    public final void testManagergeneralSectionloadSaveConf() {
        ManagergeneralSection Obj = createManagergeneralSection();
        try {
            MMFmanagerconf.getInstance().writetoFile(Obj,
                    "temp/ManagergeneralSection.cfg");
            Object object = MMFmanagerconf.getInstance().readConf(
                    new File("temp/ManagergeneralSection.cfg"));
            assertEquals("load save conf ManagergeneralSection", true,
                    checkManagergeneralSection(Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testManagergeneralSectionloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testManagergeneralSectionloadSaveConf()", e);
        }
    }

    public final void testManagerSectionLoadSaveHibernate() {
        ManagerSection Obj = createManagerSection();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testManagerSectionLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ManagerSectionImpl.class, Obj.getId());
        assertEquals("load save ManagerSection", Obj, object);

    }

    public final void testManagerdenyLoadSaveHibernate() {
        Managerdeny Obj = createManagerdeny();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testManagerdenyLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ManagerdenyImpl.class, Obj.getId());
        assertEquals("load save Managerdeny", Obj, object);

    }

    public final void testManagerpermitLoadSaveHibernate() {
        Managerpermit Obj = createManagerpermit();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testManagerpermitLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ManagerpermitImpl.class, Obj.getId());
        assertEquals("load save Managerpermit", Obj, object);

    }

    public final void testManagergeneralSectionLoadSaveHibernate() {
        ManagergeneralSection Obj = createManagergeneralSection();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testManagergeneralSectionLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ManagergeneralSectionImpl.class, Obj
                .getId());
        assertEquals("load save ManagergeneralSection", Obj, object);

    }

    /*
     * überprüft ManagerSection
     */
    protected static boolean checkManagerSection(ManagerSection org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        ManagerSection copy = null;
        if (obj instanceof ManagerSection) {
            copy = (ManagerSection) obj;

        } else {
            LOGGER.warn("checkManagerSection failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(ManagerSection.VALUEID_USERNAME).equals(
                copy.getByValue(ManagerSection.VALUEID_USERNAME));
        if (!test)
            LOGGER.warn("checkManagerSection failed : USERNAME "
                    + org.getByValue(ManagerSection.VALUEID_USERNAME) + " : "
                    + copy.getByValue(ManagerSection.VALUEID_USERNAME));

        test = org.getByValue(ManagerSection.VALUEID_SECRET).equals(
                copy.getByValue(ManagerSection.VALUEID_SECRET));
        if (!test)
            LOGGER.warn("checkManagerSection failed : SECRET "
                    + org.getByValue(ManagerSection.VALUEID_SECRET) + " : "
                    + copy.getByValue(ManagerSection.VALUEID_SECRET));

        test = org.getByValue(ManagerSection.VALUEID_READ).equals(
                copy.getByValue(ManagerSection.VALUEID_READ));
        if (!test)
            LOGGER.warn("checkManagerSection failed : READ "
                    + org.getByValue(ManagerSection.VALUEID_READ) + " : "
                    + copy.getByValue(ManagerSection.VALUEID_READ));

        test = org.getByValue(ManagerSection.VALUEID_WRITE).equals(
                copy.getByValue(ManagerSection.VALUEID_WRITE));
        if (!test)
            LOGGER.warn("checkManagerSection failed : WRITE "
                    + org.getByValue(ManagerSection.VALUEID_WRITE) + " : "
                    + copy.getByValue(ManagerSection.VALUEID_WRITE));

        // ---------------agg
        // -----------------map
        test = org.getManagerdenyMap().size() == copy.getManagerdenyMap()
                .size();

        if (!test) {
            LOGGER.warn("checkManagerSection failed : managerdenyMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getManagerdenyMap().size(); i++) {
            test = checkManagerdeny(org.getManagerdenyMap().get(i), copy
                    .getManagerdenyMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkManagerSection failed : managerdenyMap  equals "
                                + i
                                + " "
                                + org.getManagerdenyMap().get(i)
                                + " : " + copy.getManagerdenyMap().get(i));
                return test;
            }
        }// end of for i to org.getManagerdenyMap()

        // newManagerSection.addManagerdeny(createManagerdeny());
        test = org.getManagerpermitMap().size() == copy.getManagerpermitMap()
                .size();

        if (!test) {
            LOGGER.warn("checkManagerSection failed : managerpermitMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getManagerpermitMap().size(); i++) {
            test = checkManagerpermit(org.getManagerpermitMap().get(i), copy
                    .getManagerpermitMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkManagerSection failed : managerpermitMap  equals "
                                + i
                                + " "
                                + org.getManagerpermitMap().get(i)
                                + " : " + copy.getManagerpermitMap().get(i));
                return test;
            }
        }// end of for i to org.getManagerpermitMap()

        // newManagerSection.addManagerpermit(createManagerpermit());
        return test;
    }

    /*
     * überprüft Managerdeny
     */
    protected static boolean checkManagerdeny(Managerdeny org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Managerdeny copy = null;
        if (obj instanceof Managerdeny) {
            copy = (Managerdeny) obj;

        } else {
            LOGGER.warn("checkManagerdeny failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Managerdeny.VALUEID_VALUE).equals(
                copy.getByValue(Managerdeny.VALUEID_VALUE));
        if (!test)
            LOGGER.warn("checkManagerdeny failed : VALUE "
                    + org.getByValue(Managerdeny.VALUEID_VALUE) + " : "
                    + copy.getByValue(Managerdeny.VALUEID_VALUE));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Managerpermit
     */
    protected static boolean checkManagerpermit(Managerpermit org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Managerpermit copy = null;
        if (obj instanceof Managerpermit) {
            copy = (Managerpermit) obj;

        } else {
            LOGGER.warn("checkManagerpermit failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Managerpermit.VALUEID_VALUE).equals(
                copy.getByValue(Managerpermit.VALUEID_VALUE));
        if (!test)
            LOGGER.warn("checkManagerpermit failed : VALUE "
                    + org.getByValue(Managerpermit.VALUEID_VALUE) + " : "
                    + copy.getByValue(Managerpermit.VALUEID_VALUE));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft ManagergeneralSection
     */
    protected static boolean checkManagergeneralSection(
            ManagergeneralSection org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        ManagergeneralSection copy = null;
        if (obj instanceof ManagergeneralSection) {
            copy = (ManagergeneralSection) obj;

        } else {
            LOGGER.warn("checkManagergeneralSection failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;

        test = org.getByValue(ManagergeneralSection.VALUEID_ENABLED).equals(
                copy.getByValue(ManagergeneralSection.VALUEID_ENABLED));
        if (!test)
            LOGGER.warn("checkManagergeneralSection failed : ENABLED "
                    + org.getByValue(ManagergeneralSection.VALUEID_ENABLED)
                    + " : "
                    + copy.getByValue(ManagergeneralSection.VALUEID_ENABLED));

        test = org.getByValue(ManagergeneralSection.VALUEID_PORTNO).equals(
                copy.getByValue(ManagergeneralSection.VALUEID_PORTNO));
        if (!test)
            LOGGER.warn("checkManagergeneralSection failed : PORTNO "
                    + org.getByValue(ManagergeneralSection.VALUEID_PORTNO)
                    + " : "
                    + copy.getByValue(ManagergeneralSection.VALUEID_PORTNO));

        test = org.getByValue(ManagergeneralSection.VALUEID_BINDADDR).equals(
                copy.getByValue(ManagergeneralSection.VALUEID_BINDADDR));
        if (!test)
            LOGGER.warn("checkManagergeneralSection failed : BINDADDR "
                    + org.getByValue(ManagergeneralSection.VALUEID_BINDADDR)
                    + " : "
                    + copy.getByValue(ManagergeneralSection.VALUEID_BINDADDR));

        test = org.getByValue(ManagergeneralSection.VALUEID_PORT).equals(
                copy.getByValue(ManagergeneralSection.VALUEID_PORT));
        if (!test)
            LOGGER.warn("checkManagergeneralSection failed : PORT "
                    + org.getByValue(ManagergeneralSection.VALUEID_PORT)
                    + " : "
                    + copy.getByValue(ManagergeneralSection.VALUEID_PORT));

        // ---------------agg
        // -----------------map
        test = org.getManagerSectionMap().size() == copy.getManagerSectionMap()
                .size();

        if (!test) {
            LOGGER
                    .warn("checkManagergeneralSection failed : managerSectionMap  size"
                            + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getManagerSectionMap().size(); i++) {
            test = checkManagerSection(org.getManagerSectionMap().get(i), copy
                    .getManagerSectionMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkManagergeneralSection failed : managerSectionMap  equals "
                                + i
                                + " "
                                + org.getManagerSectionMap().get(i)
                                + " : " + copy.getManagerSectionMap().get(i));
                return test;
            }
        }// end of for i to org.getManagerSectionMap()

        // newManagergeneralSection.addManagerSection(createManagerSection());
        return test;
    }

    /*
     * erzeugt und initalisiert ManagerSection
     */
    protected static ManagerSection createManagerSection() {
        ManagerSection newManagerSection = new ManagerSectionImpl();
        // fields
        newManagerSection.setByValue(ManagerSection.VALUEID_USERNAME,
                "USERNAME");
        newManagerSection.setByValue(ManagerSection.VALUEID_SECRET, "SECRET");
        newManagerSection.setByValue(ManagerSection.VALUEID_READ, "READ");
        newManagerSection.setByValue(ManagerSection.VALUEID_WRITE, "WRITE");
        // agg
        // map
        newManagerSection.addManagerdeny(createManagerdeny());
        newManagerSection.addManagerpermit(createManagerpermit());
        return newManagerSection;
    }

    /*
     * erzeugt und initalisiert Managerdeny
     */
    protected static Managerdeny createManagerdeny() {
        Managerdeny newManagerdeny = new ManagerdenyImpl();
        // fields
        newManagerdeny.setByValue(Managerdeny.VALUEID_VALUE, "VALUE");
        // agg
        // map
        return newManagerdeny;
    }

    /*
     * erzeugt und initalisiert Managerpermit
     */
    protected static Managerpermit createManagerpermit() {
        Managerpermit newManagerpermit = new ManagerpermitImpl();
        // fields
        newManagerpermit.setByValue(Managerpermit.VALUEID_VALUE, "VALUE");
        // agg
        // map
        return newManagerpermit;
    }

    /*
     * erzeugt und initalisiert ManagergeneralSection
     */
    protected static ManagergeneralSection createManagergeneralSection() {
        ManagergeneralSection newManagergeneralSection = new ManagergeneralSectionImpl();
        // fields
        newManagergeneralSection.setByValue(
                ManagergeneralSection.VALUEID_GENERALID, "GENERALID");
        newManagergeneralSection.setByValue(
                ManagergeneralSection.VALUEID_ENABLED, Boolean.TRUE);
        newManagergeneralSection.setByValue(
                ManagergeneralSection.VALUEID_PORTNO, Integer.valueOf(0));
        newManagergeneralSection.setByValue(
                ManagergeneralSection.VALUEID_BINDADDR, "BINDADDR");
        newManagergeneralSection.setByValue(ManagergeneralSection.VALUEID_PORT,
                Integer.valueOf(0));
        newManagergeneralSection.setByValue(
                ManagergeneralSection.VALUEID_FILEID, "FILEID");
        // agg
        // map
        newManagergeneralSection.addManagerSection(createManagerSection());
        return newManagergeneralSection;
    }

}
