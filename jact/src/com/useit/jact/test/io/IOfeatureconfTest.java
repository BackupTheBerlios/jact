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
import com.useit.jact.model.featureconf.Featuremap;
import com.useit.jact.model.featureconf.FeaturemapImpl;
import com.useit.jact.model.featureconf.Featuresconf;
import com.useit.jact.model.featureconf.FeaturesconfImpl;
import com.useit.jact.model.featureconf.MMFfeatureconf;
import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * IOfeatureconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOfeatureconfTest.java,v 1.4 2006/01/13
 *          16:54:44 urs Exp $
 */
public class IOfeatureconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOfeatureconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOfeatureconfTest.class);
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

    // public final void testFeaturemapLoadSaveXML() {
    // Featuremap Obj = createFeaturemap();
    // MMFfeatureconf.getInstance().writeConfXML("temp/Featuremap.xml", Obj);
    // Object object =
    // MMFfeatureconf.getInstance().readConfXML("temp/Featuremap.xml");
    // assertEquals("load save XML Featuremap",true,checkFeaturemap(Obj,
    // object));
    // }
    public final void testFeaturesconfLoadSaveXML() {
        Featuresconf Obj = createFeaturesconf();
        MMFfeatureconf.getInstance().writeConfXML("temp/Featuresconf.xml", Obj);
        Object object = MMFfeatureconf.getInstance().readConfXML(
                "temp/Featuresconf.xml");
        assertEquals("load save XML Featuresconf", true, checkFeaturesconf(Obj,
                object));
    }

    // public final void testFeaturemaploadSaveConf() {
    // Featuremap Obj = createFeaturemap();
    // try{
    // MMFfeatureconf.getInstance().writetoFile(Obj,"temp/Featuremap.cfg");
    // Object object = MMFfeatureconf.getInstance().readConf(new
    // File("temp/Featuremap.cfg"));
    // assertEquals("load save conf
    // Featuremap",true,checkFeaturemap(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testFeaturemaploadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testFeaturemaploadSaveConf()", e);
    // }
    // }
    public final void testFeaturesconfloadSaveConf() {
        Featuresconf Obj = createFeaturesconf();
        try {
            MMFfeatureconf.getInstance().writetoFile(Obj,
                    "temp/Featuresconf.cfg");
            Object object = MMFfeatureconf.getInstance().readConf(
                    new File("temp/Featuresconf.cfg"));
            assertEquals("load save conf Featuresconf", true,
                    checkFeaturesconf(Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testFeaturesconfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testFeaturesconfloadSaveConf()", e);
        }
    }

    public final void testFeaturemapLoadSaveHibernate() {
        Featuremap Obj = createFeaturemap();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testFeaturemapLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(FeaturemapImpl.class, Obj.getId());
        assertEquals("load save Featuremap", Obj, object);

    }

    public final void testFeaturesconfLoadSaveHibernate() {
        Featuresconf Obj = createFeaturesconf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testFeaturesconfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(FeaturesconfImpl.class, Obj.getId());
        assertEquals("load save Featuresconf", Obj, object);

    }

    /*
     * überprüft Featuremap
     */
    protected static boolean checkFeaturemap(Featuremap org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Featuremap copy = null;
        if (obj instanceof Featuremap) {
            copy = (Featuremap) obj;

        } else {
            LOGGER.warn("checkFeaturemap failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Featuremap.VALUEID_BLINDXFER).equals(
                copy.getByValue(Featuremap.VALUEID_BLINDXFER));
        if (!test)
            LOGGER.warn("checkFeaturemap failed : BLINDXFER "
                    + org.getByValue(Featuremap.VALUEID_BLINDXFER) + " : "
                    + copy.getByValue(Featuremap.VALUEID_BLINDXFER));

        test = org.getByValue(Featuremap.VALUEID_DISCONNECT).equals(
                copy.getByValue(Featuremap.VALUEID_DISCONNECT));
        if (!test)
            LOGGER.warn("checkFeaturemap failed : DISCONNECT "
                    + org.getByValue(Featuremap.VALUEID_DISCONNECT) + " : "
                    + copy.getByValue(Featuremap.VALUEID_DISCONNECT));

        test = org.getByValue(Featuremap.VALUEID_AUTOMON).equals(
                copy.getByValue(Featuremap.VALUEID_AUTOMON));
        if (!test)
            LOGGER.warn("checkFeaturemap failed : AUTOMON "
                    + org.getByValue(Featuremap.VALUEID_AUTOMON) + " : "
                    + copy.getByValue(Featuremap.VALUEID_AUTOMON));

        test = org.getByValue(Featuremap.VALUEID_ATXFER).equals(
                copy.getByValue(Featuremap.VALUEID_ATXFER));
        if (!test)
            LOGGER.warn("checkFeaturemap failed : ATXFER "
                    + org.getByValue(Featuremap.VALUEID_ATXFER) + " : "
                    + copy.getByValue(Featuremap.VALUEID_ATXFER));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Featuresconf
     */
    protected static boolean checkFeaturesconf(Featuresconf org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Featuresconf copy = null;
        if (obj instanceof Featuresconf) {
            copy = (Featuresconf) obj;

        } else {
            LOGGER.warn("checkFeaturesconf failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Featuresconf.VALUEID_PARKEXT).equals(
                copy.getByValue(Featuresconf.VALUEID_PARKEXT));
        if (!test)
            LOGGER.warn("checkFeaturesconf failed : PARKEXT "
                    + org.getByValue(Featuresconf.VALUEID_PARKEXT) + " : "
                    + copy.getByValue(Featuresconf.VALUEID_PARKEXT));

        test = org.getByValue(Featuresconf.VALUEID_PARKPOS).equals(
                copy.getByValue(Featuresconf.VALUEID_PARKPOS));
        if (!test)
            LOGGER.warn("checkFeaturesconf failed : PARKPOS "
                    + org.getByValue(Featuresconf.VALUEID_PARKPOS) + " : "
                    + copy.getByValue(Featuresconf.VALUEID_PARKPOS));

        test = org.getByValue(Featuresconf.VALUEID_CONTEXT).equals(
                copy.getByValue(Featuresconf.VALUEID_CONTEXT));
        if (!test)
            LOGGER.warn("checkFeaturesconf failed : CONTEXT "
                    + org.getByValue(Featuresconf.VALUEID_CONTEXT) + " : "
                    + copy.getByValue(Featuresconf.VALUEID_CONTEXT));

        test = org.getByValue(Featuresconf.VALUEID_PARKINGTIME).equals(
                copy.getByValue(Featuresconf.VALUEID_PARKINGTIME));
        if (!test)
            LOGGER.warn("checkFeaturesconf failed : PARKINGTIME "
                    + org.getByValue(Featuresconf.VALUEID_PARKINGTIME) + " : "
                    + copy.getByValue(Featuresconf.VALUEID_PARKINGTIME));

        test = org
                .getByValue(Featuresconf.VALUEID_TRANSFERDIGITTIMEOUT)
                .equals(
                        copy
                                .getByValue(Featuresconf.VALUEID_TRANSFERDIGITTIMEOUT));
        if (!test)
            LOGGER
                    .warn("checkFeaturesconf failed : TRANSFERDIGITTIMEOUT "
                            + org
                                    .getByValue(Featuresconf.VALUEID_TRANSFERDIGITTIMEOUT)
                            + " : "
                            + copy
                                    .getByValue(Featuresconf.VALUEID_TRANSFERDIGITTIMEOUT));

        test = org.getByValue(Featuresconf.VALUEID_COURTESYTONE).equals(
                copy.getByValue(Featuresconf.VALUEID_COURTESYTONE));
        if (!test)
            LOGGER.warn("checkFeaturesconf failed : COURTESYTONE "
                    + org.getByValue(Featuresconf.VALUEID_COURTESYTONE) + " : "
                    + copy.getByValue(Featuresconf.VALUEID_COURTESYTONE));

        test = org.getByValue(Featuresconf.VALUEID_XFERSOUND).equals(
                copy.getByValue(Featuresconf.VALUEID_XFERSOUND));
        if (!test)
            LOGGER.warn("checkFeaturesconf failed : XFERSOUND "
                    + org.getByValue(Featuresconf.VALUEID_XFERSOUND) + " : "
                    + copy.getByValue(Featuresconf.VALUEID_XFERSOUND));

        test = org.getByValue(Featuresconf.VALUEID_XFERFAILSOUND).equals(
                copy.getByValue(Featuresconf.VALUEID_XFERFAILSOUND));
        if (!test)
            LOGGER.warn("checkFeaturesconf failed : XFERFAILSOUND "
                    + org.getByValue(Featuresconf.VALUEID_XFERFAILSOUND)
                    + " : "
                    + copy.getByValue(Featuresconf.VALUEID_XFERFAILSOUND));

        test = org.getByValue(Featuresconf.VALUEID_ADSIPARK).equals(
                copy.getByValue(Featuresconf.VALUEID_ADSIPARK));
        if (!test)
            LOGGER.warn("checkFeaturesconf failed : ADSIPARK "
                    + org.getByValue(Featuresconf.VALUEID_ADSIPARK) + " : "
                    + copy.getByValue(Featuresconf.VALUEID_ADSIPARK));

        test = org.getByValue(Featuresconf.VALUEID_PICKUPEXTEN).equals(
                copy.getByValue(Featuresconf.VALUEID_PICKUPEXTEN));
        if (!test)
            LOGGER.warn("checkFeaturesconf failed : PICKUPEXTEN "
                    + org.getByValue(Featuresconf.VALUEID_PICKUPEXTEN) + " : "
                    + copy.getByValue(Featuresconf.VALUEID_PICKUPEXTEN));

        test = org.getByValue(Featuresconf.VALUEID_FEATUREDIGITTIMEOUT).equals(
                copy.getByValue(Featuresconf.VALUEID_FEATUREDIGITTIMEOUT));
        if (!test)
            LOGGER
                    .warn("checkFeaturesconf failed : FEATUREDIGITTIMEOUT "
                            + org
                                    .getByValue(Featuresconf.VALUEID_FEATUREDIGITTIMEOUT)
                            + " : "
                            + copy
                                    .getByValue(Featuresconf.VALUEID_FEATUREDIGITTIMEOUT));

        // ---------------agg
        test = checkFeaturemap(org.getFeaturemap(), copy.getFeaturemap());
        if (!test)
            LOGGER.warn("checkFeaturesconf failed : featuremap "
                    + org.toString() + " : " + copy.toString());
        // -----------------map
        return test;
    }

    /*
     * erzeugt und initalisiert Featuremap
     */
    protected static Featuremap createFeaturemap() {
        Featuremap newFeaturemap = new FeaturemapImpl();
        // fields
        newFeaturemap.setByValue(Featuremap.VALUEID_BLINDXFER, "BLINDXFER");
        newFeaturemap.setByValue(Featuremap.VALUEID_DISCONNECT, "DISCONNECT");
        newFeaturemap.setByValue(Featuremap.VALUEID_AUTOMON, "AUTOMON");
        newFeaturemap.setByValue(Featuremap.VALUEID_ATXFER, "ATXFER");
        // agg
        // map
        return newFeaturemap;
    }

    /*
     * erzeugt und initalisiert Featuresconf
     */
    protected static Featuresconf createFeaturesconf() {
        Featuresconf newFeaturesconf = new FeaturesconfImpl();
        // fields
        newFeaturesconf.setByValue(Featuresconf.VALUEID_PARKEXT, "PARKEXT");
        newFeaturesconf.setByValue(Featuresconf.VALUEID_PARKPOS, "PARKPOS");
        newFeaturesconf.setByValue(Featuresconf.VALUEID_CONTEXT,
                new PbxContext(""));
        newFeaturesconf.setByValue(Featuresconf.VALUEID_PARKINGTIME, Integer
                .valueOf(0));
        newFeaturesconf.setByValue(Featuresconf.VALUEID_TRANSFERDIGITTIMEOUT,
                Integer.valueOf(0));
        newFeaturesconf.setByValue(Featuresconf.VALUEID_COURTESYTONE,
                "COURTESYTONE");
        newFeaturesconf.setByValue(Featuresconf.VALUEID_XFERSOUND, "XFERSOUND");
        newFeaturesconf.setByValue(Featuresconf.VALUEID_XFERFAILSOUND,
                "XFERFAILSOUND");
        newFeaturesconf.setByValue(Featuresconf.VALUEID_ADSIPARK, Boolean.TRUE);
        newFeaturesconf.setByValue(Featuresconf.VALUEID_PICKUPEXTEN,
                "PICKUPEXTEN");
        newFeaturesconf.setByValue(Featuresconf.VALUEID_FEATUREDIGITTIMEOUT,
                Integer.valueOf(0));
        // agg
        newFeaturesconf.setFeaturemap(createFeaturemap());
        // map
        return newFeaturesconf;
    }

}
