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
import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.CustomToneImpl;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.IndicationsconfImpl;
import com.useit.jact.model.indicationsconf.MMFindicationsconf;
import com.useit.jact.model.indicationsconf.ToneDefinitions;
import com.useit.jact.model.indicationsconf.ToneDefinitionsImpl;

/**
 * <p>
 * IOindicationsconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOindicationsconfTest.java,v 1.4 2006/01/12
 *          18:03:53 urs Exp $
 */
public class IOindicationsconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOindicationsconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOindicationsconfTest.class);
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

    // public final void testToneDefinitionsLoadSaveXML() {
    // ToneDefinitions Obj = createToneDefinitions();
    // MMFindicationsconf.getInstance().writeConfXML("temp/ToneDefinitions.xml",
    // Obj);
    // Object object =
    // MMFindicationsconf.getInstance().readConfXML("temp/ToneDefinitions.xml");
    // assertEquals("load save XML
    // ToneDefinitions",true,checkToneDefinitions(Obj, object));
    // }
    // public final void testCustomToneLoadSaveXML() {
    // CustomTone Obj = createCustomTone();
    // MMFindicationsconf.getInstance().writeConfXML("temp/CustomTone.xml",
    // Obj);
    // Object object =
    // MMFindicationsconf.getInstance().readConfXML("temp/CustomTone.xml");
    // assertEquals("load save XML CustomTone",true,checkCustomTone(Obj,
    // object));
    // }
    public final void testIndicationsconfLoadSaveXML() {
        Indicationsconf Obj = createIndicationsconf();
        MMFindicationsconf.getInstance().writeConfXML(
                "temp/Indicationsconf.xml", Obj);
        Object object = MMFindicationsconf.getInstance().readConfXML(
                "temp/Indicationsconf.xml");
        assertEquals("load save XML Indicationsconf", true,
                checkIndicationsconf(Obj, object));
    }

    // public final void testToneDefinitionsloadSaveConf() {
    // ToneDefinitions Obj = createToneDefinitions();
    // try{
    // MMFindicationsconf.getInstance().writetoFile(Obj,"temp/ToneDefinitions.cfg");
    // Object object = MMFindicationsconf.getInstance().readConf(new
    // File("temp/ToneDefinitions.cfg"));
    // assertEquals("load save conf
    // ToneDefinitions",true,checkToneDefinitions(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testToneDefinitionsloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testToneDefinitionsloadSaveConf()", e);
    // }
    // }
    // public final void testCustomToneloadSaveConf() {
    // CustomTone Obj = createCustomTone();
    // try{
    // MMFindicationsconf.getInstance().writetoFile(Obj,"temp/CustomTone.cfg");
    // Object object = MMFindicationsconf.getInstance().readConf(new
    // File("temp/CustomTone.cfg"));
    // assertEquals("load save conf
    // CustomTone",true,checkCustomTone(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testCustomToneloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testCustomToneloadSaveConf()", e);
    // }
    // }
    public final void testIndicationsconfloadSaveConf() {
        Indicationsconf Obj = createIndicationsconf();
        try {
            MMFindicationsconf.getInstance().writetoFile(Obj,
                    "temp/Indicationsconf.cfg");
            Object object = MMFindicationsconf.getInstance().readConf(
                    new File("temp/Indicationsconf.cfg"));
            assertEquals("load save conf Indicationsconf", true,
                    checkIndicationsconf(Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testIndicationsconfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testIndicationsconfloadSaveConf()", e);
        }
    }

    public final void testToneDefinitionsLoadSaveHibernate() {
        ToneDefinitions Obj = createToneDefinitions();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testToneDefinitionsLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ToneDefinitionsImpl.class, Obj.getId());
        assertEquals("load save ToneDefinitions", Obj, object);

    }

    public final void testCustomToneLoadSaveHibernate() {
        CustomTone Obj = createCustomTone();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testCustomToneLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(CustomToneImpl.class, Obj.getId());
        assertEquals("load save CustomTone", Obj, object);

    }

    public final void testIndicationsconfLoadSaveHibernate() {
        Indicationsconf Obj = createIndicationsconf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testIndicationsconfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(IndicationsconfImpl.class, Obj.getId());
        assertEquals("load save Indicationsconf", Obj, object);

    }

    /*
     * überprüft ToneDefinitions
     */
    protected static boolean checkToneDefinitions(ToneDefinitions org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        ToneDefinitions copy = null;
        if (obj instanceof ToneDefinitions) {
            copy = (ToneDefinitions) obj;

        } else {
            LOGGER.warn("checkToneDefinitions failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(ToneDefinitions.VALUEID_COUNTRYCODE).equals(
                copy.getByValue(ToneDefinitions.VALUEID_COUNTRYCODE));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : COUNTRYCODE "
                    + org.getByValue(ToneDefinitions.VALUEID_COUNTRYCODE)
                    + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_COUNTRYCODE));

        test = org.getByValue(ToneDefinitions.VALUEID_DESCRIPTION).equals(
                copy.getByValue(ToneDefinitions.VALUEID_DESCRIPTION));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : DESCRIPTION "
                    + org.getByValue(ToneDefinitions.VALUEID_DESCRIPTION)
                    + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_DESCRIPTION));

        test = org.getByValue(ToneDefinitions.VALUEID_ALIAS).equals(
                copy.getByValue(ToneDefinitions.VALUEID_ALIAS));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : ALIAS "
                    + org.getByValue(ToneDefinitions.VALUEID_ALIAS) + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_ALIAS));

        test = org.getByValue(ToneDefinitions.VALUEID_RINGCADENCE).equals(
                copy.getByValue(ToneDefinitions.VALUEID_RINGCADENCE));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : RINGCADENCE "
                    + org.getByValue(ToneDefinitions.VALUEID_RINGCADENCE)
                    + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_RINGCADENCE));

        test = org.getByValue(ToneDefinitions.VALUEID_DIAL).equals(
                copy.getByValue(ToneDefinitions.VALUEID_DIAL));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : DIAL "
                    + org.getByValue(ToneDefinitions.VALUEID_DIAL) + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_DIAL));

        test = org.getByValue(ToneDefinitions.VALUEID_BUSY).equals(
                copy.getByValue(ToneDefinitions.VALUEID_BUSY));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : BUSY "
                    + org.getByValue(ToneDefinitions.VALUEID_BUSY) + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_BUSY));

        test = org.getByValue(ToneDefinitions.VALUEID_RING).equals(
                copy.getByValue(ToneDefinitions.VALUEID_RING));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : RING "
                    + org.getByValue(ToneDefinitions.VALUEID_RING) + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_RING));

        test = org.getByValue(ToneDefinitions.VALUEID_CONGESTION).equals(
                copy.getByValue(ToneDefinitions.VALUEID_CONGESTION));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : CONGESTION "
                    + org.getByValue(ToneDefinitions.VALUEID_CONGESTION)
                    + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_CONGESTION));

        test = org.getByValue(ToneDefinitions.VALUEID_CALLWAITING).equals(
                copy.getByValue(ToneDefinitions.VALUEID_CALLWAITING));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : CALLWAITING "
                    + org.getByValue(ToneDefinitions.VALUEID_CALLWAITING)
                    + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_CALLWAITING));

        test = org.getByValue(ToneDefinitions.VALUEID_DIALRECALL).equals(
                copy.getByValue(ToneDefinitions.VALUEID_DIALRECALL));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : DIALRECALL "
                    + org.getByValue(ToneDefinitions.VALUEID_DIALRECALL)
                    + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_DIALRECALL));

        test = org.getByValue(ToneDefinitions.VALUEID_RECORD).equals(
                copy.getByValue(ToneDefinitions.VALUEID_RECORD));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : RECORD "
                    + org.getByValue(ToneDefinitions.VALUEID_RECORD) + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_RECORD));

        test = org.getByValue(ToneDefinitions.VALUEID_INFO).equals(
                copy.getByValue(ToneDefinitions.VALUEID_INFO));
        if (!test)
            LOGGER.warn("checkToneDefinitions failed : INFO "
                    + org.getByValue(ToneDefinitions.VALUEID_INFO) + " : "
                    + copy.getByValue(ToneDefinitions.VALUEID_INFO));

        // ---------------agg
        // -----------------map
        test = org.getCustomToneMap().size() == copy.getCustomToneMap().size();

        if (!test) {
            LOGGER.warn("checkToneDefinitions failed : customToneMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getCustomToneMap().size(); i++) {
            test = checkCustomTone(org.getCustomToneMap().get(i), copy
                    .getCustomToneMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkToneDefinitions failed : customToneMap  equals "
                                + i
                                + " "
                                + org.getCustomToneMap().get(i)
                                + " : " + copy.getCustomToneMap().get(i));
                return test;
            }
        }// end of for i to org.getCustomToneMap()

        // newToneDefinitions.addCustomTone(createCustomTone());
        return test;
    }

    /*
     * überprüft CustomTone
     */
    protected static boolean checkCustomTone(CustomTone org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        CustomTone copy = null;
        if (obj instanceof CustomTone) {
            copy = (CustomTone) obj;

        } else {
            LOGGER.warn("checkCustomTone failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(CustomTone.VALUEID_TONECODE).equals(
                copy.getByValue(CustomTone.VALUEID_TONECODE));
        if (!test)
            LOGGER.warn("checkCustomTone failed : TONECODE "
                    + org.getByValue(CustomTone.VALUEID_TONECODE) + " : "
                    + copy.getByValue(CustomTone.VALUEID_TONECODE));

        test = org.getByValue(CustomTone.VALUEID_NAME).equals(
                copy.getByValue(CustomTone.VALUEID_NAME));
        if (!test)
            LOGGER.warn("checkCustomTone failed : NAME "
                    + org.getByValue(CustomTone.VALUEID_NAME) + " : "
                    + copy.getByValue(CustomTone.VALUEID_NAME));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Indicationsconf
     */
    protected static boolean checkIndicationsconf(Indicationsconf org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Indicationsconf copy = null;
        if (obj instanceof Indicationsconf) {
            copy = (Indicationsconf) obj;

        } else {
            LOGGER.warn("checkIndicationsconf failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Indicationsconf.VALUEID_COUNTRY).equals(
                copy.getByValue(Indicationsconf.VALUEID_COUNTRY));
        if (!test)
            LOGGER.warn("checkIndicationsconf failed : COUNTRY "
                    + org.getByValue(Indicationsconf.VALUEID_COUNTRY) + " : "
                    + copy.getByValue(Indicationsconf.VALUEID_COUNTRY));

        // ---------------agg
        // -----------------map
        test = org.getToneDefinitionsMap().size() == copy
                .getToneDefinitionsMap().size();

        if (!test) {
            LOGGER
                    .warn("checkIndicationsconf failed : toneDefinitionsMap  size"
                            + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getToneDefinitionsMap().size(); i++) {
            test = checkToneDefinitions(org.getToneDefinitionsMap().get(i),
                    copy.getToneDefinitionsMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkIndicationsconf failed : toneDefinitionsMap  equals "
                                + i
                                + " "
                                + org.getToneDefinitionsMap().get(i)
                                + " : " + copy.getToneDefinitionsMap().get(i));
                return test;
            }
        }// end of for i to org.getToneDefinitionsMap()

        // newIndicationsconf.addToneDefinitions(createToneDefinitions());
        return test;
    }

    /*
     * erzeugt und initalisiert ToneDefinitions
     */
    protected static ToneDefinitions createToneDefinitions() {
        ToneDefinitions newToneDefinitions = new ToneDefinitionsImpl();
        // fields
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_COUNTRYCODE,
                "COUNTRYCODE");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_DESCRIPTION,
                "DESCRIPTION");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_ALIAS, "ALIAS");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_RINGCADENCE,
                "RINGCADENCE");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_DIAL, "DIAL");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_BUSY, "BUSY");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_RING, "RING");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_CONGESTION,
                "CONGESTION");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_CALLWAITING,
                "CALLWAITING");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_DIALRECALL,
                "DIALRECALL");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_RECORD, "RECORD");
        newToneDefinitions.setByValue(ToneDefinitions.VALUEID_INFO, "INFO");
        // agg
        // map
        newToneDefinitions.addCustomTone(createCustomTone());
        return newToneDefinitions;
    }

    /*
     * erzeugt und initalisiert CustomTone
     */
    protected static CustomTone createCustomTone() {
        CustomTone newCustomTone = new CustomToneImpl();
        // fields
        newCustomTone.setByValue(CustomTone.VALUEID_TONECODE, "TONECODE");
        newCustomTone.setByValue(CustomTone.VALUEID_NAME, "NAME");
        // agg
        // map
        return newCustomTone;
    }

    /*
     * erzeugt und initalisiert Indicationsconf
     */
    protected static Indicationsconf createIndicationsconf() {
        Indicationsconf newIndicationsconf = new IndicationsconfImpl();
        // fields
        newIndicationsconf.setByValue(Indicationsconf.VALUEID_COUNTRY,
                "COUNTRY");
        // agg
        // map
        newIndicationsconf.addToneDefinitions(createToneDefinitions());
        return newIndicationsconf;
    }

}
