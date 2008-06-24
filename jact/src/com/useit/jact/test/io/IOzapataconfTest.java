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
import com.useit.jact.model.types.PbxContext;
import com.useit.jact.model.types.Signalling;
import com.useit.jact.model.types.Switchtype;
import com.useit.jact.model.zapataconf.Analog_Handset_Features;
import com.useit.jact.model.zapataconf.Analog_Handset_FeaturesImpl;
import com.useit.jact.model.zapataconf.Analog_Trunk_Features;
import com.useit.jact.model.zapataconf.Analog_Trunk_FeaturesImpl;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_Options;
import com.useit.jact.model.zapataconf.Audio_Quality_Tuning_OptionsImpl;
import com.useit.jact.model.zapataconf.Call_Logging_Options;
import com.useit.jact.model.zapataconf.Call_Logging_OptionsImpl;
import com.useit.jact.model.zapataconf.Caller_ID_Options;
import com.useit.jact.model.zapataconf.Caller_ID_OptionsImpl;
import com.useit.jact.model.zapataconf.ISDN_PRI_Switch;
import com.useit.jact.model.zapataconf.ISDN_PRI_SwitchImpl;
import com.useit.jact.model.zapataconf.MMFzapataconf;
import com.useit.jact.model.zapataconf.Multilink_PPP;
import com.useit.jact.model.zapataconf.Multilink_PPPImpl;
import com.useit.jact.model.zapataconf.Other;
import com.useit.jact.model.zapataconf.OtherImpl;
import com.useit.jact.model.zapataconf.Timing_Parameters;
import com.useit.jact.model.zapataconf.Timing_ParametersImpl;
import com.useit.jact.model.zapataconf.Zapataconf;
import com.useit.jact.model.zapataconf.ZapataconfImpl;
import com.useit.jact.model.zapataconf.Zaptelchannel;
import com.useit.jact.model.zapataconf.ZaptelchannelImpl;

/**
 * <p>
 * IOzapataconfTest
 * </p>
 * Created : 06.09.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: IOzapataconfTest.java,v 1.4 2006/01/29
 *          12:03:54 urs Exp $
 */
public class IOzapataconfTest extends TestCase {
    /**
     * Logger for this class
     */
    private static final Logger LOGGER = Logger
            .getLogger(IOzapataconfTest.class);

    private Session session;

    public static void main(String[] args) {
        junit.swingui.TestRunner.run(IOzapataconfTest.class);
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

    // public final void testOtherLoadSaveXML() {
    // Other Obj = createOther();
    // MMFzapataconf.getInstance().writeConfXML("temp/Other.xml", Obj);
    // Object object =
    // MMFzapataconf.getInstance().readConfXML("temp/Other.xml");
    // assertEquals("load save XML Other",true,checkOther(Obj, object));
    // }
    // public final void testAnalog_Handset_FeaturesLoadSaveXML() {
    // Analog_Handset_Features Obj = createAnalog_Handset_Features();
    // MMFzapataconf.getInstance().writeConfXML("temp/Analog_Handset_Features.xml",
    // Obj);
    // Object object =
    // MMFzapataconf.getInstance().readConfXML("temp/Analog_Handset_Features.xml");
    // assertEquals("load save XML
    // Analog_Handset_Features",true,checkAnalog_Handset_Features(Obj, object));
    // }
    // public final void testTiming_ParametersLoadSaveXML() {
    // Timing_Parameters Obj = createTiming_Parameters();
    // MMFzapataconf.getInstance().writeConfXML("temp/Timing_Parameters.xml",
    // Obj);
    // Object object =
    // MMFzapataconf.getInstance().readConfXML("temp/Timing_Parameters.xml");
    // assertEquals("load save XML
    // Timing_Parameters",true,checkTiming_Parameters(Obj, object));
    // }
    // public final void testAnalog_Trunk_FeaturesLoadSaveXML() {
    // Analog_Trunk_Features Obj = createAnalog_Trunk_Features();
    // MMFzapataconf.getInstance().writeConfXML("temp/Analog_Trunk_Features.xml",
    // Obj);
    // Object object =
    // MMFzapataconf.getInstance().readConfXML("temp/Analog_Trunk_Features.xml");
    // assertEquals("load save XML
    // Analog_Trunk_Features",true,checkAnalog_Trunk_Features(Obj, object));
    // }
    // public final void testISDN_PRI_SwitchLoadSaveXML() {
    // ISDN_PRI_Switch Obj = createISDN_PRI_Switch();
    // MMFzapataconf.getInstance().writeConfXML("temp/ISDN_PRI_Switch.xml",
    // Obj);
    // Object object =
    // MMFzapataconf.getInstance().readConfXML("temp/ISDN_PRI_Switch.xml");
    // assertEquals("load save XML
    // ISDN_PRI_Switch",true,checkISDN_PRI_Switch(Obj, object));
    // }
    // public final void testMultilink_PPPLoadSaveXML() {
    // Multilink_PPP Obj = createMultilink_PPP();
    // MMFzapataconf.getInstance().writeConfXML("temp/Multilink_PPP.xml", Obj);
    // Object object =
    // MMFzapataconf.getInstance().readConfXML("temp/Multilink_PPP.xml");
    // assertEquals("load save XML Multilink_PPP",true,checkMultilink_PPP(Obj,
    // object));
    // }
    // public final void testAudio_Quality_Tuning_OptionsLoadSaveXML() {
    // Audio_Quality_Tuning_Options Obj = createAudio_Quality_Tuning_Options();
    // MMFzapataconf.getInstance().writeConfXML("temp/Audio_Quality_Tuning_Options.xml",
    // Obj);
    // Object object =
    // MMFzapataconf.getInstance().readConfXML("temp/Audio_Quality_Tuning_Options.xml");
    // assertEquals("load save XML
    // Audio_Quality_Tuning_Options",true,checkAudio_Quality_Tuning_Options(Obj,
    // object));
    // }
    // public final void testZaptelchannelLoadSaveXML() {
    // Zaptelchannel Obj = createZaptelchannel();
    // MMFzapataconf.getInstance().writeConfXML("temp/Zaptelchannel.xml", Obj);
    // Object object =
    // MMFzapataconf.getInstance().readConfXML("temp/Zaptelchannel.xml");
    // assertEquals("load save XML Zaptelchannel",true,checkZaptelchannel(Obj,
    // object));
    // }
    // public final void testCall_Logging_OptionsLoadSaveXML() {
    // Call_Logging_Options Obj = createCall_Logging_Options();
    // MMFzapataconf.getInstance().writeConfXML("temp/Call_Logging_Options.xml",
    // Obj);
    // Object object =
    // MMFzapataconf.getInstance().readConfXML("temp/Call_Logging_Options.xml");
    // assertEquals("load save XML
    // Call_Logging_Options",true,checkCall_Logging_Options(Obj, object));
    // }
    // public final void testCaller_ID_OptionsLoadSaveXML() {
    // Caller_ID_Options Obj = createCaller_ID_Options();
    // MMFzapataconf.getInstance().writeConfXML("temp/Caller_ID_Options.xml",
    // Obj);
    // Object object =
    // MMFzapataconf.getInstance().readConfXML("temp/Caller_ID_Options.xml");
    // assertEquals("load save XML
    // Caller_ID_Options",true,checkCaller_ID_Options(Obj, object));
    // }
    public final void testZapataconfLoadSaveXML() {
        Zapataconf Obj = createZapataconf();
        MMFzapataconf.getInstance().writeConfXML("temp/Zapataconf.xml", Obj);
        Object object = MMFzapataconf.getInstance().readConfXML(
                "temp/Zapataconf.xml");
        assertEquals("load save XML Zapataconf", true, checkZapataconf(Obj,
                object));
    }

    // public final void testOtherloadSaveConf() {
    // Other Obj = createOther();
    // try{
    // MMFzapataconf.getInstance().writetoFile(Obj,"temp/Other.cfg");
    // Object object = MMFzapataconf.getInstance().readConf(new
    // File("temp/Other.cfg"));
    // assertEquals("load save conf Other",true,checkOther(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testOtherloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testOtherloadSaveConf()", e);
    // }
    // }
    // public final void testAnalog_Handset_FeaturesloadSaveConf() {
    // Analog_Handset_Features Obj = createAnalog_Handset_Features();
    // try{
    // MMFzapataconf.getInstance().writetoFile(Obj,"temp/Analog_Handset_Features.cfg");
    // Object object = MMFzapataconf.getInstance().readConf(new
    // File("temp/Analog_Handset_Features.cfg"));
    // assertEquals("load save conf
    // Analog_Handset_Features",true,checkAnalog_Handset_Features(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testAnalog_Handset_FeaturesloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testAnalog_Handset_FeaturesloadSaveConf()", e);
    // }
    // }
    // public final void testTiming_ParametersloadSaveConf() {
    // Timing_Parameters Obj = createTiming_Parameters();
    // try{
    // MMFzapataconf.getInstance().writetoFile(Obj,"temp/Timing_Parameters.cfg");
    // Object object = MMFzapataconf.getInstance().readConf(new
    // File("temp/Timing_Parameters.cfg"));
    // assertEquals("load save conf
    // Timing_Parameters",true,checkTiming_Parameters(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testTiming_ParametersloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testTiming_ParametersloadSaveConf()", e);
    // }
    // }
    // public final void testAnalog_Trunk_FeaturesloadSaveConf() {
    // Analog_Trunk_Features Obj = createAnalog_Trunk_Features();
    // try{
    // MMFzapataconf.getInstance().writetoFile(Obj,"temp/Analog_Trunk_Features.cfg");
    // Object object = MMFzapataconf.getInstance().readConf(new
    // File("temp/Analog_Trunk_Features.cfg"));
    // assertEquals("load save conf
    // Analog_Trunk_Features",true,checkAnalog_Trunk_Features(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testAnalog_Trunk_FeaturesloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testAnalog_Trunk_FeaturesloadSaveConf()", e);
    // }
    // }
    // public final void testISDN_PRI_SwitchloadSaveConf() {
    // ISDN_PRI_Switch Obj = createISDN_PRI_Switch();
    // try{
    // MMFzapataconf.getInstance().writetoFile(Obj,"temp/ISDN_PRI_Switch.cfg");
    // Object object = MMFzapataconf.getInstance().readConf(new
    // File("temp/ISDN_PRI_Switch.cfg"));
    // assertEquals("load save conf
    // ISDN_PRI_Switch",true,checkISDN_PRI_Switch(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testISDN_PRI_SwitchloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testISDN_PRI_SwitchloadSaveConf()", e);
    // }
    // }
    // public final void testMultilink_PPPloadSaveConf() {
    // Multilink_PPP Obj = createMultilink_PPP();
    // try{
    // MMFzapataconf.getInstance().writetoFile(Obj,"temp/Multilink_PPP.cfg");
    // Object object = MMFzapataconf.getInstance().readConf(new
    // File("temp/Multilink_PPP.cfg"));
    // assertEquals("load save conf
    // Multilink_PPP",true,checkMultilink_PPP(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testMultilink_PPPloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testMultilink_PPPloadSaveConf()", e);
    // }
    // }
    // public final void testAudio_Quality_Tuning_OptionsloadSaveConf() {
    // Audio_Quality_Tuning_Options Obj = createAudio_Quality_Tuning_Options();
    // try{
    // MMFzapataconf.getInstance().writetoFile(Obj,"temp/Audio_Quality_Tuning_Options.cfg");
    // Object object = MMFzapataconf.getInstance().readConf(new
    // File("temp/Audio_Quality_Tuning_Options.cfg"));
    // assertEquals("load save conf
    // Audio_Quality_Tuning_Options",true,checkAudio_Quality_Tuning_Options(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testAudio_Quality_Tuning_OptionsloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testAudio_Quality_Tuning_OptionsloadSaveConf()", e);
    // }
    // }
    // public final void testZaptelchannelloadSaveConf() {
    // Zaptelchannel Obj = createZaptelchannel();
    // try{
    // MMFzapataconf.getInstance().writetoFile(Obj,"temp/Zaptelchannel.cfg");
    // Object object = MMFzapataconf.getInstance().readConf(new
    // File("temp/Zaptelchannel.cfg"));
    // assertEquals("load save conf
    // Zaptelchannel",true,checkZaptelchannel(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testZaptelchannelloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testZaptelchannelloadSaveConf()", e);
    // }
    // }
    // public final void testCall_Logging_OptionsloadSaveConf() {
    // Call_Logging_Options Obj = createCall_Logging_Options();
    // try{
    // MMFzapataconf.getInstance().writetoFile(Obj,"temp/Call_Logging_Options.cfg");
    // Object object = MMFzapataconf.getInstance().readConf(new
    // File("temp/Call_Logging_Options.cfg"));
    // assertEquals("load save conf
    // Call_Logging_Options",true,checkCall_Logging_Options(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testCall_Logging_OptionsloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testCall_Logging_OptionsloadSaveConf()", e);
    // }
    // }
    // public final void testCaller_ID_OptionsloadSaveConf() {
    // Caller_ID_Options Obj = createCaller_ID_Options();
    // try{
    // MMFzapataconf.getInstance().writetoFile(Obj,"temp/Caller_ID_Options.cfg");
    // Object object = MMFzapataconf.getInstance().readConf(new
    // File("temp/Caller_ID_Options.cfg"));
    // assertEquals("load save conf
    // Caller_ID_Options",true,checkCaller_ID_Options(Obj,object));
    // } catch (FileNotFoundException e) {
    // LOGGER.error("testCaller_ID_OptionsloadSaveConf()", e);
    // } catch (IOException e) {
    // LOGGER.error("testCaller_ID_OptionsloadSaveConf()", e);
    // }
    // }
    public final void testZapataconfloadSaveConf() {
        Zapataconf Obj = createZapataconf();
        try {
            MMFzapataconf.getInstance().writetoFile(Obj, "temp/Zapataconf.cfg");
            Object object = MMFzapataconf.getInstance().readConf(
                    new File("temp/Zapataconf.cfg"));
            assertEquals("load save conf Zapataconf", true, checkZapataconf(
                    Obj, object));
        } catch (FileNotFoundException e) {
            LOGGER.error("testZapataconfloadSaveConf()", e);
        } catch (IOException e) {
            LOGGER.error("testZapataconfloadSaveConf()", e);
        }
    }

    public final void testOtherLoadSaveHibernate() {
        Other Obj = createOther();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testOtherLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(OtherImpl.class, Obj.getId());
        assertEquals("load save Other", Obj, object);

    }

    public final void testAnalog_Handset_FeaturesLoadSaveHibernate() {
        Analog_Handset_Features Obj = createAnalog_Handset_Features();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testAnalog_Handset_FeaturesLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(Analog_Handset_FeaturesImpl.class, Obj
                .getId());
        assertEquals("load save Analog_Handset_Features", Obj, object);

    }

    public final void testTiming_ParametersLoadSaveHibernate() {
        Timing_Parameters Obj = createTiming_Parameters();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testTiming_ParametersLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(Timing_ParametersImpl.class, Obj.getId());
        assertEquals("load save Timing_Parameters", Obj, object);

    }

    public final void testAnalog_Trunk_FeaturesLoadSaveHibernate() {
        Analog_Trunk_Features Obj = createAnalog_Trunk_Features();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testAnalog_Trunk_FeaturesLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(Analog_Trunk_FeaturesImpl.class, Obj
                .getId());
        assertEquals("load save Analog_Trunk_Features", Obj, object);

    }

    public final void testISDN_PRI_SwitchLoadSaveHibernate() {
        ISDN_PRI_Switch Obj = createISDN_PRI_Switch();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testISDN_PRI_SwitchLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ISDN_PRI_SwitchImpl.class, Obj.getId());
        assertEquals("load save ISDN_PRI_Switch", Obj, object);

    }

    public final void testMultilink_PPPLoadSaveHibernate() {
        Multilink_PPP Obj = createMultilink_PPP();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testMultilink_PPPLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(Multilink_PPPImpl.class, Obj.getId());
        assertEquals("load save Multilink_PPP", Obj, object);

    }

    public final void testAudio_Quality_Tuning_OptionsLoadSaveHibernate() {
        Audio_Quality_Tuning_Options Obj = createAudio_Quality_Tuning_Options();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testAudio_Quality_Tuning_OptionsLoadSaveHibernate()",
                    e);
            transaction.rollback();
        }

        Object object = session.load(Audio_Quality_Tuning_OptionsImpl.class,
                Obj.getId());
        assertEquals("load save Audio_Quality_Tuning_Options", Obj, object);

    }

    public final void testZaptelchannelLoadSaveHibernate() {
        Zaptelchannel Obj = createZaptelchannel();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testZaptelchannelLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ZaptelchannelImpl.class, Obj.getId());
        assertEquals("load save Zaptelchannel", Obj, object);

    }

    public final void testCall_Logging_OptionsLoadSaveHibernate() {
        Call_Logging_Options Obj = createCall_Logging_Options();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testCall_Logging_OptionsLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(Call_Logging_OptionsImpl.class, Obj
                .getId());
        assertEquals("load save Call_Logging_Options", Obj, object);

    }

    public final void testCaller_ID_OptionsLoadSaveHibernate() {
        Caller_ID_Options Obj = createCaller_ID_Options();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testCaller_ID_OptionsLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(Caller_ID_OptionsImpl.class, Obj.getId());
        assertEquals("load save Caller_ID_Options", Obj, object);

    }

    public final void testZapataconfLoadSaveHibernate() {
        Zapataconf Obj = createZapataconf();
        Transaction transaction = session.beginTransaction();
        try {
            session.saveOrUpdate(Obj);
            transaction.commit();

        } catch (Exception e) {
            LOGGER.error("testZapataconfLoadSaveHibernate()", e);
            transaction.rollback();
        }

        Object object = session.load(ZapataconfImpl.class, Obj.getId());
        assertEquals("load save Zapataconf", Obj, object);

    }

    /*
     * überprüft Other
     */
    protected static boolean checkOther(Other org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Other copy = null;
        if (obj instanceof Other) {
            copy = (Other) obj;

        } else {
            LOGGER.warn("checkOther failed : cast " + org.getClass() + " : "
                    + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Other.VALUEID_MAILBOX).equals(
                copy.getByValue(Other.VALUEID_MAILBOX));
        if (!test)
            LOGGER.warn("checkOther failed : MAILBOX "
                    + org.getByValue(Other.VALUEID_MAILBOX) + " : "
                    + copy.getByValue(Other.VALUEID_MAILBOX));

        test = org.getByValue(Other.VALUEID_GROUP).equals(
                copy.getByValue(Other.VALUEID_GROUP));
        if (!test)
            LOGGER.warn("checkOther failed : GROUP "
                    + org.getByValue(Other.VALUEID_GROUP) + " : "
                    + copy.getByValue(Other.VALUEID_GROUP));

        test = org.getByValue(Other.VALUEID_LANGUAGE).equals(
                copy.getByValue(Other.VALUEID_LANGUAGE));
        if (!test)
            LOGGER.warn("checkOther failed : LANGUAGE "
                    + org.getByValue(Other.VALUEID_LANGUAGE) + " : "
                    + copy.getByValue(Other.VALUEID_LANGUAGE));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Analog_Handset_Features
     */
    protected static boolean checkAnalog_Handset_Features(
            Analog_Handset_Features org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Analog_Handset_Features copy = null;
        if (obj instanceof Analog_Handset_Features) {
            copy = (Analog_Handset_Features) obj;

        } else {
            LOGGER.warn("checkAnalog_Handset_Features failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Analog_Handset_Features.VALUEID_ADSI).equals(
                copy.getByValue(Analog_Handset_Features.VALUEID_ADSI));
        if (!test)
            LOGGER.warn("checkAnalog_Handset_Features failed : ADSI "
                    + org.getByValue(Analog_Handset_Features.VALUEID_ADSI)
                    + " : "
                    + copy.getByValue(Analog_Handset_Features.VALUEID_ADSI));

        test = org
                .getByValue(Analog_Handset_Features.VALUEID_IMMEDIATE)
                .equals(
                        copy
                                .getByValue(Analog_Handset_Features.VALUEID_IMMEDIATE));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Handset_Features failed : IMMEDIATE "
                            + org
                                    .getByValue(Analog_Handset_Features.VALUEID_IMMEDIATE)
                            + " : "
                            + copy
                                    .getByValue(Analog_Handset_Features.VALUEID_IMMEDIATE));

        test = org
                .getByValue(Analog_Handset_Features.VALUEID_CALLWAITING)
                .equals(
                        copy
                                .getByValue(Analog_Handset_Features.VALUEID_CALLWAITING));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Handset_Features failed : CALLWAITING "
                            + org
                                    .getByValue(Analog_Handset_Features.VALUEID_CALLWAITING)
                            + " : "
                            + copy
                                    .getByValue(Analog_Handset_Features.VALUEID_CALLWAITING));

        test = org
                .getByValue(Analog_Handset_Features.VALUEID_CALLWAITINGCALLERID)
                .equals(
                        copy
                                .getByValue(Analog_Handset_Features.VALUEID_CALLWAITINGCALLERID));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Handset_Features failed : CALLWAITINGCALLERID "
                            + org
                                    .getByValue(Analog_Handset_Features.VALUEID_CALLWAITINGCALLERID)
                            + " : "
                            + copy
                                    .getByValue(Analog_Handset_Features.VALUEID_CALLWAITINGCALLERID));

        test = org
                .getByValue(Analog_Handset_Features.VALUEID_THREEWAYCALLING)
                .equals(
                        copy
                                .getByValue(Analog_Handset_Features.VALUEID_THREEWAYCALLING));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Handset_Features failed : THREEWAYCALLING "
                            + org
                                    .getByValue(Analog_Handset_Features.VALUEID_THREEWAYCALLING)
                            + " : "
                            + copy
                                    .getByValue(Analog_Handset_Features.VALUEID_THREEWAYCALLING));

        test = org.getByValue(Analog_Handset_Features.VALUEID_TRANSFER).equals(
                copy.getByValue(Analog_Handset_Features.VALUEID_TRANSFER));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Handset_Features failed : TRANSFER "
                            + org
                                    .getByValue(Analog_Handset_Features.VALUEID_TRANSFER)
                            + " : "
                            + copy
                                    .getByValue(Analog_Handset_Features.VALUEID_TRANSFER));

        test = org
                .getByValue(Analog_Handset_Features.VALUEID_CANCALLFORWARD)
                .equals(
                        copy
                                .getByValue(Analog_Handset_Features.VALUEID_CANCALLFORWARD));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Handset_Features failed : CANCALLFORWARD "
                            + org
                                    .getByValue(Analog_Handset_Features.VALUEID_CANCALLFORWARD)
                            + " : "
                            + copy
                                    .getByValue(Analog_Handset_Features.VALUEID_CANCALLFORWARD));

        test = org
                .getByValue(Analog_Handset_Features.VALUEID_CALLRETURN)
                .equals(
                        copy
                                .getByValue(Analog_Handset_Features.VALUEID_CALLRETURN));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Handset_Features failed : CALLRETURN "
                            + org
                                    .getByValue(Analog_Handset_Features.VALUEID_CALLRETURN)
                            + " : "
                            + copy
                                    .getByValue(Analog_Handset_Features.VALUEID_CALLRETURN));

        test = org
                .getByValue(Analog_Handset_Features.VALUEID_CALLGROUP)
                .equals(
                        copy
                                .getByValue(Analog_Handset_Features.VALUEID_CALLGROUP));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Handset_Features failed : CALLGROUP "
                            + org
                                    .getByValue(Analog_Handset_Features.VALUEID_CALLGROUP)
                            + " : "
                            + copy
                                    .getByValue(Analog_Handset_Features.VALUEID_CALLGROUP));

        test = org
                .getByValue(Analog_Handset_Features.VALUEID_PICKUPGROUP)
                .equals(
                        copy
                                .getByValue(Analog_Handset_Features.VALUEID_PICKUPGROUP));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Handset_Features failed : PICKUPGROUP "
                            + org
                                    .getByValue(Analog_Handset_Features.VALUEID_PICKUPGROUP)
                            + " : "
                            + copy
                                    .getByValue(Analog_Handset_Features.VALUEID_PICKUPGROUP));

        test = org
                .getByValue(
                        Analog_Handset_Features.VALUEID_USEINCOMINGCALLERIDONZAPTRANSFER)
                .equals(
                        copy
                                .getByValue(Analog_Handset_Features.VALUEID_USEINCOMINGCALLERIDONZAPTRANSFER));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Handset_Features failed : USEINCOMINGCALLERIDONZAPTRANSFER "
                            + org
                                    .getByValue(Analog_Handset_Features.VALUEID_USEINCOMINGCALLERIDONZAPTRANSFER)
                            + " : "
                            + copy
                                    .getByValue(Analog_Handset_Features.VALUEID_USEINCOMINGCALLERIDONZAPTRANSFER));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Timing_Parameters
     */
    protected static boolean checkTiming_Parameters(Timing_Parameters org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Timing_Parameters copy = null;
        if (obj instanceof Timing_Parameters) {
            copy = (Timing_Parameters) obj;

        } else {
            LOGGER.warn("checkTiming_Parameters failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Timing_Parameters.VALUEID_PREWINK).equals(
                copy.getByValue(Timing_Parameters.VALUEID_PREWINK));
        if (!test)
            LOGGER.warn("checkTiming_Parameters failed : PREWINK "
                    + org.getByValue(Timing_Parameters.VALUEID_PREWINK) + " : "
                    + copy.getByValue(Timing_Parameters.VALUEID_PREWINK));

        test = org.getByValue(Timing_Parameters.VALUEID_PREFLASH).equals(
                copy.getByValue(Timing_Parameters.VALUEID_PREFLASH));
        if (!test)
            LOGGER.warn("checkTiming_Parameters failed : PREFLASH "
                    + org.getByValue(Timing_Parameters.VALUEID_PREFLASH)
                    + " : "
                    + copy.getByValue(Timing_Parameters.VALUEID_PREFLASH));

        test = org.getByValue(Timing_Parameters.VALUEID_WINK).equals(
                copy.getByValue(Timing_Parameters.VALUEID_WINK));
        if (!test)
            LOGGER.warn("checkTiming_Parameters failed : WINK "
                    + org.getByValue(Timing_Parameters.VALUEID_WINK) + " : "
                    + copy.getByValue(Timing_Parameters.VALUEID_WINK));

        test = org.getByValue(Timing_Parameters.VALUEID_RXWINK).equals(
                copy.getByValue(Timing_Parameters.VALUEID_RXWINK));
        if (!test)
            LOGGER.warn("checkTiming_Parameters failed : RXWINK "
                    + org.getByValue(Timing_Parameters.VALUEID_RXWINK) + " : "
                    + copy.getByValue(Timing_Parameters.VALUEID_RXWINK));

        test = org.getByValue(Timing_Parameters.VALUEID_RXFLASH).equals(
                copy.getByValue(Timing_Parameters.VALUEID_RXFLASH));
        if (!test)
            LOGGER.warn("checkTiming_Parameters failed : RXFLASH "
                    + org.getByValue(Timing_Parameters.VALUEID_RXFLASH) + " : "
                    + copy.getByValue(Timing_Parameters.VALUEID_RXFLASH));

        test = org.getByValue(Timing_Parameters.VALUEID_FLASH).equals(
                copy.getByValue(Timing_Parameters.VALUEID_FLASH));
        if (!test)
            LOGGER.warn("checkTiming_Parameters failed : FLASH "
                    + org.getByValue(Timing_Parameters.VALUEID_FLASH) + " : "
                    + copy.getByValue(Timing_Parameters.VALUEID_FLASH));

        test = org.getByValue(Timing_Parameters.VALUEID_START).equals(
                copy.getByValue(Timing_Parameters.VALUEID_START));
        if (!test)
            LOGGER.warn("checkTiming_Parameters failed : START "
                    + org.getByValue(Timing_Parameters.VALUEID_START) + " : "
                    + copy.getByValue(Timing_Parameters.VALUEID_START));

        test = org.getByValue(Timing_Parameters.VALUEID_DEBOUNCE).equals(
                copy.getByValue(Timing_Parameters.VALUEID_DEBOUNCE));
        if (!test)
            LOGGER.warn("checkTiming_Parameters failed : DEBOUNCE "
                    + org.getByValue(Timing_Parameters.VALUEID_DEBOUNCE)
                    + " : "
                    + copy.getByValue(Timing_Parameters.VALUEID_DEBOUNCE));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Analog_Trunk_Features
     */
    protected static boolean checkAnalog_Trunk_Features(
            Analog_Trunk_Features org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Analog_Trunk_Features copy = null;
        if (obj instanceof Analog_Trunk_Features) {
            copy = (Analog_Trunk_Features) obj;

        } else {
            LOGGER.warn("checkAnalog_Trunk_Features failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org
                .getByValue(
                        Analog_Trunk_Features.VALUEID_USEDISTINCTIVERINGDETECTION)
                .equals(
                        copy
                                .getByValue(Analog_Trunk_Features.VALUEID_USEDISTINCTIVERINGDETECTION));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Trunk_Features failed : USEDISTINCTIVERINGDETECTION "
                            + org
                                    .getByValue(Analog_Trunk_Features.VALUEID_USEDISTINCTIVERINGDETECTION)
                            + " : "
                            + copy
                                    .getByValue(Analog_Trunk_Features.VALUEID_USEDISTINCTIVERINGDETECTION));

        test = org.getByValue(Analog_Trunk_Features.VALUEID_DRING1).equals(
                copy.getByValue(Analog_Trunk_Features.VALUEID_DRING1));
        if (!test)
            LOGGER.warn("checkAnalog_Trunk_Features failed : DRING1 "
                    + org.getByValue(Analog_Trunk_Features.VALUEID_DRING1)
                    + " : "
                    + copy.getByValue(Analog_Trunk_Features.VALUEID_DRING1));

        test = org.getByValue(Analog_Trunk_Features.VALUEID_DRING2).equals(
                copy.getByValue(Analog_Trunk_Features.VALUEID_DRING2));
        if (!test)
            LOGGER.warn("checkAnalog_Trunk_Features failed : DRING2 "
                    + org.getByValue(Analog_Trunk_Features.VALUEID_DRING2)
                    + " : "
                    + copy.getByValue(Analog_Trunk_Features.VALUEID_DRING2));

        test = org.getByValue(Analog_Trunk_Features.VALUEID_DRING3).equals(
                copy.getByValue(Analog_Trunk_Features.VALUEID_DRING3));
        if (!test)
            LOGGER.warn("checkAnalog_Trunk_Features failed : DRING3 "
                    + org.getByValue(Analog_Trunk_Features.VALUEID_DRING3)
                    + " : "
                    + copy.getByValue(Analog_Trunk_Features.VALUEID_DRING3));

        test = org
                .getByValue(Analog_Trunk_Features.VALUEID_DRING1CONTEXT)
                .equals(
                        copy
                                .getByValue(Analog_Trunk_Features.VALUEID_DRING1CONTEXT));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Trunk_Features failed : DRING1CONTEXT "
                            + org
                                    .getByValue(Analog_Trunk_Features.VALUEID_DRING1CONTEXT)
                            + " : "
                            + copy
                                    .getByValue(Analog_Trunk_Features.VALUEID_DRING1CONTEXT));

        test = org
                .getByValue(Analog_Trunk_Features.VALUEID_DRING2CONTEXT)
                .equals(
                        copy
                                .getByValue(Analog_Trunk_Features.VALUEID_DRING2CONTEXT));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Trunk_Features failed : DRING2CONTEXT "
                            + org
                                    .getByValue(Analog_Trunk_Features.VALUEID_DRING2CONTEXT)
                            + " : "
                            + copy
                                    .getByValue(Analog_Trunk_Features.VALUEID_DRING2CONTEXT));

        test = org
                .getByValue(Analog_Trunk_Features.VALUEID_DRING3CONTEXT)
                .equals(
                        copy
                                .getByValue(Analog_Trunk_Features.VALUEID_DRING3CONTEXT));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Trunk_Features failed : DRING3CONTEXT "
                            + org
                                    .getByValue(Analog_Trunk_Features.VALUEID_DRING3CONTEXT)
                            + " : "
                            + copy
                                    .getByValue(Analog_Trunk_Features.VALUEID_DRING3CONTEXT));

        test = org.getByValue(Analog_Trunk_Features.VALUEID_BUSYDETECT).equals(
                copy.getByValue(Analog_Trunk_Features.VALUEID_BUSYDETECT));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Trunk_Features failed : BUSYDETECT "
                            + org
                                    .getByValue(Analog_Trunk_Features.VALUEID_BUSYDETECT)
                            + " : "
                            + copy
                                    .getByValue(Analog_Trunk_Features.VALUEID_BUSYDETECT));

        test = org.getByValue(Analog_Trunk_Features.VALUEID_BUSYCOUNT).equals(
                copy.getByValue(Analog_Trunk_Features.VALUEID_BUSYCOUNT));
        if (!test)
            LOGGER.warn("checkAnalog_Trunk_Features failed : BUSYCOUNT "
                    + org.getByValue(Analog_Trunk_Features.VALUEID_BUSYCOUNT)
                    + " : "
                    + copy.getByValue(Analog_Trunk_Features.VALUEID_BUSYCOUNT));

        test = org
                .getByValue(Analog_Trunk_Features.VALUEID_CALLPROGRESS)
                .equals(
                        copy
                                .getByValue(Analog_Trunk_Features.VALUEID_CALLPROGRESS));
        if (!test)
            LOGGER
                    .warn("checkAnalog_Trunk_Features failed : CALLPROGRESS "
                            + org
                                    .getByValue(Analog_Trunk_Features.VALUEID_CALLPROGRESS)
                            + " : "
                            + copy
                                    .getByValue(Analog_Trunk_Features.VALUEID_CALLPROGRESS));

        test = org.getByValue(Analog_Trunk_Features.VALUEID_PULSE).equals(
                copy.getByValue(Analog_Trunk_Features.VALUEID_PULSE));
        if (!test)
            LOGGER.warn("checkAnalog_Trunk_Features failed : PULSE "
                    + org.getByValue(Analog_Trunk_Features.VALUEID_PULSE)
                    + " : "
                    + copy.getByValue(Analog_Trunk_Features.VALUEID_PULSE));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft ISDN_PRI_Switch
     */
    protected static boolean checkISDN_PRI_Switch(ISDN_PRI_Switch org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        ISDN_PRI_Switch copy = null;
        if (obj instanceof ISDN_PRI_Switch) {
            copy = (ISDN_PRI_Switch) obj;

        } else {
            LOGGER.warn("checkISDN_PRI_Switch failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(ISDN_PRI_Switch.VALUEID_SWITCHTYPE).equals(
                copy.getByValue(ISDN_PRI_Switch.VALUEID_SWITCHTYPE));
        if (!test)
            LOGGER.warn("checkISDN_PRI_Switch failed : SWITCHTYPE "
                    + org.getByValue(ISDN_PRI_Switch.VALUEID_SWITCHTYPE)
                    + " : "
                    + copy.getByValue(ISDN_PRI_Switch.VALUEID_SWITCHTYPE));

        test = org.getByValue(ISDN_PRI_Switch.VALUEID_OVERLAPDIAL).equals(
                copy.getByValue(ISDN_PRI_Switch.VALUEID_OVERLAPDIAL));
        if (!test)
            LOGGER.warn("checkISDN_PRI_Switch failed : OVERLAPDIAL "
                    + org.getByValue(ISDN_PRI_Switch.VALUEID_OVERLAPDIAL)
                    + " : "
                    + copy.getByValue(ISDN_PRI_Switch.VALUEID_OVERLAPDIAL));

        test = org.getByValue(ISDN_PRI_Switch.VALUEID_PRIDIALPLAN).equals(
                copy.getByValue(ISDN_PRI_Switch.VALUEID_PRIDIALPLAN));
        if (!test)
            LOGGER.warn("checkISDN_PRI_Switch failed : PRIDIALPLAN "
                    + org.getByValue(ISDN_PRI_Switch.VALUEID_PRIDIALPLAN)
                    + " : "
                    + copy.getByValue(ISDN_PRI_Switch.VALUEID_PRIDIALPLAN));

        test = org.getByValue(ISDN_PRI_Switch.VALUEID_PRIINDICATION).equals(
                copy.getByValue(ISDN_PRI_Switch.VALUEID_PRIINDICATION));
        if (!test)
            LOGGER.warn("checkISDN_PRI_Switch failed : PRIINDICATION "
                    + org.getByValue(ISDN_PRI_Switch.VALUEID_PRIINDICATION)
                    + " : "
                    + copy.getByValue(ISDN_PRI_Switch.VALUEID_PRIINDICATION));

        // ---------------agg
        test = checkMultilink_PPP(org.getMultilink_PPP(), copy
                .getMultilink_PPP());
        if (!test)
            LOGGER.warn("checkISDN_PRI_Switch failed : multilink_PPP "
                    + org.toString() + " : " + copy.toString());
        // -----------------map
        return test;
    }

    /*
     * überprüft Multilink_PPP
     */
    protected static boolean checkMultilink_PPP(Multilink_PPP org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Multilink_PPP copy = null;
        if (obj instanceof Multilink_PPP) {
            copy = (Multilink_PPP) obj;

        } else {
            LOGGER.warn("checkMultilink_PPP failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Multilink_PPP.VALUEID_MINUNUSED).equals(
                copy.getByValue(Multilink_PPP.VALUEID_MINUNUSED));
        if (!test)
            LOGGER.warn("checkMultilink_PPP failed : MINUNUSED "
                    + org.getByValue(Multilink_PPP.VALUEID_MINUNUSED) + " : "
                    + copy.getByValue(Multilink_PPP.VALUEID_MINUNUSED));

        test = org.getByValue(Multilink_PPP.VALUEID_MINIDLE).equals(
                copy.getByValue(Multilink_PPP.VALUEID_MINIDLE));
        if (!test)
            LOGGER.warn("checkMultilink_PPP failed : MINIDLE "
                    + org.getByValue(Multilink_PPP.VALUEID_MINIDLE) + " : "
                    + copy.getByValue(Multilink_PPP.VALUEID_MINIDLE));

        test = org.getByValue(Multilink_PPP.VALUEID_IDLEDIAL).equals(
                copy.getByValue(Multilink_PPP.VALUEID_IDLEDIAL));
        if (!test)
            LOGGER.warn("checkMultilink_PPP failed : IDLEDIAL "
                    + org.getByValue(Multilink_PPP.VALUEID_IDLEDIAL) + " : "
                    + copy.getByValue(Multilink_PPP.VALUEID_IDLEDIAL));

        test = org.getByValue(Multilink_PPP.VALUEID_IDLEEXT).equals(
                copy.getByValue(Multilink_PPP.VALUEID_IDLEEXT));
        if (!test)
            LOGGER.warn("checkMultilink_PPP failed : IDLEEXT "
                    + org.getByValue(Multilink_PPP.VALUEID_IDLEEXT) + " : "
                    + copy.getByValue(Multilink_PPP.VALUEID_IDLEEXT));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Audio_Quality_Tuning_Options
     */
    protected static boolean checkAudio_Quality_Tuning_Options(
            Audio_Quality_Tuning_Options org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Audio_Quality_Tuning_Options copy = null;
        if (obj instanceof Audio_Quality_Tuning_Options) {
            copy = (Audio_Quality_Tuning_Options) obj;

        } else {
            LOGGER.warn("checkAudio_Quality_Tuning_Options failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org
                .getByValue(Audio_Quality_Tuning_Options.VALUEID_RELAXDTMF)
                .equals(
                        copy
                                .getByValue(Audio_Quality_Tuning_Options.VALUEID_RELAXDTMF));
        if (!test)
            LOGGER
                    .warn("checkAudio_Quality_Tuning_Options failed : RELAXDTMF "
                            + org
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_RELAXDTMF)
                            + " : "
                            + copy
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_RELAXDTMF));

        test = org
                .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOCANCEL)
                .equals(
                        copy
                                .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOCANCEL));
        if (!test)
            LOGGER
                    .warn("checkAudio_Quality_Tuning_Options failed : ECHOCANCEL "
                            + org
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOCANCEL)
                            + " : "
                            + copy
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOCANCEL));

        test = org
                .getByValue(
                        Audio_Quality_Tuning_Options.VALUEID_ECHOCANCELWHENBRIDGED)
                .equals(
                        copy
                                .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOCANCELWHENBRIDGED));
        if (!test)
            LOGGER
                    .warn("checkAudio_Quality_Tuning_Options failed : ECHOCANCELWHENBRIDGED "
                            + org
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOCANCELWHENBRIDGED)
                            + " : "
                            + copy
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOCANCELWHENBRIDGED));

        test = org
                .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOTRAINING)
                .equals(
                        copy
                                .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOTRAINING));
        if (!test)
            LOGGER
                    .warn("checkAudio_Quality_Tuning_Options failed : ECHOTRAINING "
                            + org
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOTRAINING)
                            + " : "
                            + copy
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOTRAINING));

        test = org
                .getByValue(Audio_Quality_Tuning_Options.VALUEID_RXGAIN)
                .equals(
                        copy
                                .getByValue(Audio_Quality_Tuning_Options.VALUEID_RXGAIN));
        if (!test)
            LOGGER
                    .warn("checkAudio_Quality_Tuning_Options failed : RXGAIN "
                            + org
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_RXGAIN)
                            + " : "
                            + copy
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_RXGAIN));

        test = org
                .getByValue(Audio_Quality_Tuning_Options.VALUEID_TXGAIN)
                .equals(
                        copy
                                .getByValue(Audio_Quality_Tuning_Options.VALUEID_TXGAIN));
        if (!test)
            LOGGER
                    .warn("checkAudio_Quality_Tuning_Options failed : TXGAIN "
                            + org
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_TXGAIN)
                            + " : "
                            + copy
                                    .getByValue(Audio_Quality_Tuning_Options.VALUEID_TXGAIN));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Zaptelchannel
     */
    protected static boolean checkZaptelchannel(Zaptelchannel org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Zaptelchannel copy = null;
        if (obj instanceof Zaptelchannel) {
            copy = (Zaptelchannel) obj;

        } else {
            LOGGER.warn("checkZaptelchannel failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Zaptelchannel.VALUEID_SIGNALLING).equals(
                copy.getByValue(Zaptelchannel.VALUEID_SIGNALLING));
        if (!test)
            LOGGER.warn("checkZaptelchannel failed : SIGNALLING "
                    + org.getByValue(Zaptelchannel.VALUEID_SIGNALLING) + " : "
                    + copy.getByValue(Zaptelchannel.VALUEID_SIGNALLING));

        test = org.getByValue(Zaptelchannel.VALUEID_CONTEXT).equals(
                copy.getByValue(Zaptelchannel.VALUEID_CONTEXT));
        if (!test)
            LOGGER.warn("checkZaptelchannel failed : CONTEXT "
                    + org.getByValue(Zaptelchannel.VALUEID_CONTEXT) + " : "
                    + copy.getByValue(Zaptelchannel.VALUEID_CONTEXT));

        test = org.getByValue(Zaptelchannel.VALUEID_CHANNEL).equals(
                copy.getByValue(Zaptelchannel.VALUEID_CHANNEL));
        if (!test)
            LOGGER.warn("checkZaptelchannel failed : CHANNEL "
                    + org.getByValue(Zaptelchannel.VALUEID_CHANNEL) + " : "
                    + copy.getByValue(Zaptelchannel.VALUEID_CHANNEL));

        // ---------------agg
        test = checkAnalog_Handset_Features(org.getAnalog_Handset_Features(),
                copy.getAnalog_Handset_Features());
        if (!test)
            LOGGER.warn("checkZaptelchannel failed : analog_Handset_Features "
                    + org.toString() + " : " + copy.toString());
        test = checkAnalog_Trunk_Features(org.getAnalog_Trunk_Features(), copy
                .getAnalog_Trunk_Features());
        if (!test)
            LOGGER.warn("checkZaptelchannel failed : analog_Trunk_Features "
                    + org.toString() + " : " + copy.toString());
        test = checkAudio_Quality_Tuning_Options(org
                .getAudio_Quality_Tuning_Options(), copy
                .getAudio_Quality_Tuning_Options());
        if (!test)
            LOGGER
                    .warn("checkZaptelchannel failed : audio_Quality_Tuning_Options "
                            + org.toString() + " : " + copy.toString());
        test = checkCall_Logging_Options(org.getCall_Logging_Options(), copy
                .getCall_Logging_Options());
        if (!test)
            LOGGER.warn("checkZaptelchannel failed : call_Logging_Options "
                    + org.toString() + " : " + copy.toString());
        test = checkCaller_ID_Options(org.getCaller_ID_Options(), copy
                .getCaller_ID_Options());
        if (!test)
            LOGGER.warn("checkZaptelchannel failed : caller_ID_Options "
                    + org.toString() + " : " + copy.toString());
        test = checkISDN_PRI_Switch(org.getISDN_PRI_Switch(), copy
                .getISDN_PRI_Switch());
        if (!test)
            LOGGER.warn("checkZaptelchannel failed : iSDN_PRI_Switch "
                    + org.toString() + " : " + copy.toString());
        test = checkTiming_Parameters(org.getTiming_Parameters(), copy
                .getTiming_Parameters());
        if (!test)
            LOGGER.warn("checkZaptelchannel failed : timing_Parameters "
                    + org.toString() + " : " + copy.toString());
        test = checkOther(org.getOther(), copy.getOther());
        if (!test)
            LOGGER.warn("checkZaptelchannel failed : other " + org.toString()
                    + " : " + copy.toString());
        // -----------------map
        return test;
    }

    /*
     * überprüft Call_Logging_Options
     */
    protected static boolean checkCall_Logging_Options(
            Call_Logging_Options org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Call_Logging_Options copy = null;
        if (obj instanceof Call_Logging_Options) {
            copy = (Call_Logging_Options) obj;

        } else {
            LOGGER.warn("checkCall_Logging_Options failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Call_Logging_Options.VALUEID_ACCOUNTCODE).equals(
                copy.getByValue(Call_Logging_Options.VALUEID_ACCOUNTCODE));
        if (!test)
            LOGGER
                    .warn("checkCall_Logging_Options failed : ACCOUNTCODE "
                            + org
                                    .getByValue(Call_Logging_Options.VALUEID_ACCOUNTCODE)
                            + " : "
                            + copy
                                    .getByValue(Call_Logging_Options.VALUEID_ACCOUNTCODE));

        test = org.getByValue(Call_Logging_Options.VALUEID_AMAFLAGS).equals(
                copy.getByValue(Call_Logging_Options.VALUEID_AMAFLAGS));
        if (!test)
            LOGGER.warn("checkCall_Logging_Options failed : AMAFLAGS "
                    + org.getByValue(Call_Logging_Options.VALUEID_AMAFLAGS)
                    + " : "
                    + copy.getByValue(Call_Logging_Options.VALUEID_AMAFLAGS));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Caller_ID_Options
     */
    protected static boolean checkCaller_ID_Options(Caller_ID_Options org,
            Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Caller_ID_Options copy = null;
        if (obj instanceof Caller_ID_Options) {
            copy = (Caller_ID_Options) obj;

        } else {
            LOGGER.warn("checkCaller_ID_Options failed : cast "
                    + org.getClass() + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        test = org.getByValue(Caller_ID_Options.VALUEID_CALLERID).equals(
                copy.getByValue(Caller_ID_Options.VALUEID_CALLERID));
        if (!test)
            LOGGER.warn("checkCaller_ID_Options failed : CALLERID "
                    + org.getByValue(Caller_ID_Options.VALUEID_CALLERID)
                    + " : "
                    + copy.getByValue(Caller_ID_Options.VALUEID_CALLERID));

        test = org.getByValue(Caller_ID_Options.VALUEID_USECALLERID).equals(
                copy.getByValue(Caller_ID_Options.VALUEID_USECALLERID));
        if (!test)
            LOGGER.warn("checkCaller_ID_Options failed : USECALLERID "
                    + org.getByValue(Caller_ID_Options.VALUEID_USECALLERID)
                    + " : "
                    + copy.getByValue(Caller_ID_Options.VALUEID_USECALLERID));

        test = org.getByValue(Caller_ID_Options.VALUEID_HIDECALLERID).equals(
                copy.getByValue(Caller_ID_Options.VALUEID_HIDECALLERID));
        if (!test)
            LOGGER.warn("checkCaller_ID_Options failed : HIDECALLERID "
                    + org.getByValue(Caller_ID_Options.VALUEID_HIDECALLERID)
                    + " : "
                    + copy.getByValue(Caller_ID_Options.VALUEID_HIDECALLERID));

        test = org.getByValue(Caller_ID_Options.VALUEID_RESTRICTCID).equals(
                copy.getByValue(Caller_ID_Options.VALUEID_RESTRICTCID));
        if (!test)
            LOGGER.warn("checkCaller_ID_Options failed : RESTRICTCID "
                    + org.getByValue(Caller_ID_Options.VALUEID_RESTRICTCID)
                    + " : "
                    + copy.getByValue(Caller_ID_Options.VALUEID_RESTRICTCID));

        test = org.getByValue(Caller_ID_Options.VALUEID_USECALLINGPRES).equals(
                copy.getByValue(Caller_ID_Options.VALUEID_USECALLINGPRES));
        if (!test)
            LOGGER
                    .warn("checkCaller_ID_Options failed : USECALLINGPRES "
                            + org
                                    .getByValue(Caller_ID_Options.VALUEID_USECALLINGPRES)
                            + " : "
                            + copy
                                    .getByValue(Caller_ID_Options.VALUEID_USECALLINGPRES));

        // ---------------agg
        // -----------------map
        return test;
    }

    /*
     * überprüft Zapataconf
     */
    protected static boolean checkZapataconf(Zapataconf org, Object obj) {
        if (org == null && obj == null)
            return true;
        if (org == null || obj == null)
            return false;

        Zapataconf copy = null;
        if (obj instanceof Zapataconf) {
            copy = (Zapataconf) obj;

        } else {
            LOGGER.warn("checkZapataconf failed : cast " + org.getClass()
                    + " : " + obj.getClass());

            return true;
        }
        // fields
        boolean test = true;
        // ---------------agg
        // -----------------map
        test = org.getZaptelchannelMap().size() == copy.getZaptelchannelMap()
                .size();

        if (!test) {
            LOGGER.warn("checkZapataconf failed : zaptelchannelMap  size"
                    + org.toString() + " : " + copy.toString());
            return test;
        }
        for (int i = 0; i < org.getZaptelchannelMap().size(); i++) {
            test = checkZaptelchannel(org.getZaptelchannelMap().get(i), copy
                    .getZaptelchannelMap().get(i));

            if (!test) {
                LOGGER
                        .warn("checkZapataconf failed : zaptelchannelMap  equals "
                                + i
                                + " "
                                + org.getZaptelchannelMap().get(i)
                                + " : " + copy.getZaptelchannelMap().get(i));
                return test;
            }
        }// end of for i to org.getZaptelchannelMap()

        // newZapataconf.addZaptelchannel(createZaptelchannel());
        return test;
    }

    /*
     * erzeugt und initalisiert Other
     */
    protected static Other createOther() {
        Other newOther = new OtherImpl();
        // fields
        newOther.setByValue(Other.VALUEID_MAILBOX, "MAILBOX");
        newOther.setByValue(Other.VALUEID_GROUP, "GROUP");
        newOther.setByValue(Other.VALUEID_LANGUAGE, "LANGUAGE");
        // agg
        // map
        return newOther;
    }

    /*
     * erzeugt und initalisiert Analog_Handset_Features
     */
    protected static Analog_Handset_Features createAnalog_Handset_Features() {
        Analog_Handset_Features newAnalog_Handset_Features = new Analog_Handset_FeaturesImpl();
        // fields
        newAnalog_Handset_Features.setByValue(
                Analog_Handset_Features.VALUEID_ADSI, "ADSI");
        newAnalog_Handset_Features.setByValue(
                Analog_Handset_Features.VALUEID_IMMEDIATE, Boolean.TRUE);
        newAnalog_Handset_Features.setByValue(
                Analog_Handset_Features.VALUEID_CALLWAITING, Boolean.TRUE);
        newAnalog_Handset_Features.setByValue(
                Analog_Handset_Features.VALUEID_CALLWAITINGCALLERID,
                Boolean.TRUE);
        newAnalog_Handset_Features.setByValue(
                Analog_Handset_Features.VALUEID_THREEWAYCALLING, Boolean.TRUE);
        newAnalog_Handset_Features.setByValue(
                Analog_Handset_Features.VALUEID_TRANSFER, Boolean.TRUE);
        newAnalog_Handset_Features.setByValue(
                Analog_Handset_Features.VALUEID_CANCALLFORWARD, Boolean.TRUE);
        newAnalog_Handset_Features.setByValue(
                Analog_Handset_Features.VALUEID_CALLRETURN, Boolean.TRUE);
        newAnalog_Handset_Features.setByValue(
                Analog_Handset_Features.VALUEID_CALLGROUP, "CALLGROUP");
        newAnalog_Handset_Features.setByValue(
                Analog_Handset_Features.VALUEID_PICKUPGROUP, "PICKUPGROUP");
        newAnalog_Handset_Features
                .setByValue(
                        Analog_Handset_Features.VALUEID_USEINCOMINGCALLERIDONZAPTRANSFER,
                        "USEINCOMINGCALLERIDONZAPTRANSFER");
        // agg
        // map
        return newAnalog_Handset_Features;
    }

    /*
     * erzeugt und initalisiert Timing_Parameters
     */
    protected static Timing_Parameters createTiming_Parameters() {
        Timing_Parameters newTiming_Parameters = new Timing_ParametersImpl();
        // fields
        newTiming_Parameters.setByValue(Timing_Parameters.VALUEID_PREWINK,
                Integer.valueOf(0));
        newTiming_Parameters.setByValue(Timing_Parameters.VALUEID_PREFLASH,
                Integer.valueOf(0));
        newTiming_Parameters.setByValue(Timing_Parameters.VALUEID_WINK, Integer
                .valueOf(0));
        newTiming_Parameters.setByValue(Timing_Parameters.VALUEID_RXWINK,
                Integer.valueOf(0));
        newTiming_Parameters.setByValue(Timing_Parameters.VALUEID_RXFLASH,
                Integer.valueOf(0));
        newTiming_Parameters.setByValue(Timing_Parameters.VALUEID_FLASH,
                Integer.valueOf(0));
        newTiming_Parameters.setByValue(Timing_Parameters.VALUEID_START,
                Integer.valueOf(0));
        newTiming_Parameters.setByValue(Timing_Parameters.VALUEID_DEBOUNCE,
                Integer.valueOf(0));
        // agg
        // map
        return newTiming_Parameters;
    }

    /*
     * erzeugt und initalisiert Analog_Trunk_Features
     */
    protected static Analog_Trunk_Features createAnalog_Trunk_Features() {
        Analog_Trunk_Features newAnalog_Trunk_Features = new Analog_Trunk_FeaturesImpl();
        // fields
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_USEDISTINCTIVERINGDETECTION,
                Boolean.TRUE);
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_DRING1, "DRING1");
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_DRING2, "DRING2");
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_DRING3, "DRING3");
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_DRING1CONTEXT, "DRING1CONTEXT");
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_DRING2CONTEXT, "DRING2CONTEXT");
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_DRING3CONTEXT, "DRING3CONTEXT");
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_BUSYDETECT, Boolean.TRUE);
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_BUSYCOUNT, Integer.valueOf(0));
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_CALLPROGRESS, Boolean.TRUE);
        newAnalog_Trunk_Features.setByValue(
                Analog_Trunk_Features.VALUEID_PULSE, Boolean.TRUE);
        // agg
        // map
        return newAnalog_Trunk_Features;
    }

    /*
     * erzeugt und initalisiert ISDN_PRI_Switch
     */
    protected static ISDN_PRI_Switch createISDN_PRI_Switch() {
        ISDN_PRI_Switch newISDN_PRI_Switch = new ISDN_PRI_SwitchImpl();
        // fields
        newISDN_PRI_Switch.setByValue(ISDN_PRI_Switch.VALUEID_SWITCHTYPE,
                new Switchtype(""));
        newISDN_PRI_Switch.setByValue(ISDN_PRI_Switch.VALUEID_OVERLAPDIAL,
                "OVERLAPDIAL");
        newISDN_PRI_Switch.setByValue(ISDN_PRI_Switch.VALUEID_PRIDIALPLAN,
                "PRIDIALPLAN");
        newISDN_PRI_Switch.setByValue(ISDN_PRI_Switch.VALUEID_PRIINDICATION,
                "PRIINDICATION");
        // agg
        newISDN_PRI_Switch.setMultilink_PPP(createMultilink_PPP());
        // map
        return newISDN_PRI_Switch;
    }

    /*
     * erzeugt und initalisiert Multilink_PPP
     */
    protected static Multilink_PPP createMultilink_PPP() {
        Multilink_PPP newMultilink_PPP = new Multilink_PPPImpl();
        // fields
        newMultilink_PPP.setByValue(Multilink_PPP.VALUEID_MINUNUSED,
                "MINUNUSED");
        newMultilink_PPP.setByValue(Multilink_PPP.VALUEID_MINIDLE, Integer
                .valueOf(0));
        newMultilink_PPP.setByValue(Multilink_PPP.VALUEID_IDLEDIAL, Integer
                .valueOf(0));
        newMultilink_PPP.setByValue(Multilink_PPP.VALUEID_IDLEEXT, "IDLEEXT");
        // agg
        // map
        return newMultilink_PPP;
    }

    /*
     * erzeugt und initalisiert Audio_Quality_Tuning_Options
     */
    protected static Audio_Quality_Tuning_Options createAudio_Quality_Tuning_Options() {
        Audio_Quality_Tuning_Options newAudio_Quality_Tuning_Options = new Audio_Quality_Tuning_OptionsImpl();
        // fields
        newAudio_Quality_Tuning_Options.setByValue(
                Audio_Quality_Tuning_Options.VALUEID_RELAXDTMF, Boolean.TRUE);
        newAudio_Quality_Tuning_Options.setByValue(
                Audio_Quality_Tuning_Options.VALUEID_ECHOCANCEL, Boolean.TRUE);
        newAudio_Quality_Tuning_Options.setByValue(
                Audio_Quality_Tuning_Options.VALUEID_ECHOCANCELWHENBRIDGED,
                Boolean.TRUE);
        newAudio_Quality_Tuning_Options
                .setByValue(Audio_Quality_Tuning_Options.VALUEID_ECHOTRAINING,
                        Boolean.TRUE);
        newAudio_Quality_Tuning_Options.setByValue(
                Audio_Quality_Tuning_Options.VALUEID_RXGAIN, Float
                        .valueOf(0.1f));
        newAudio_Quality_Tuning_Options.setByValue(
                Audio_Quality_Tuning_Options.VALUEID_TXGAIN, Float
                        .valueOf(0.1f));
        // agg
        // map
        return newAudio_Quality_Tuning_Options;
    }

    /*
     * erzeugt und initalisiert Zaptelchannel
     */
    protected static Zaptelchannel createZaptelchannel() {
        Zaptelchannel newZaptelchannel = new ZaptelchannelImpl();
        // fields
        newZaptelchannel.setByValue(Zaptelchannel.VALUEID_SIGNALLING,
                new Signalling(""));
        newZaptelchannel.setByValue(Zaptelchannel.VALUEID_CONTEXT,
                new PbxContext(""));
        newZaptelchannel.setByValue(Zaptelchannel.VALUEID_CHANNEL, "CHANNEL");
        // agg
        newZaptelchannel
                .setAnalog_Handset_Features(createAnalog_Handset_Features());
        newZaptelchannel
                .setAnalog_Trunk_Features(createAnalog_Trunk_Features());
        newZaptelchannel
                .setAudio_Quality_Tuning_Options(createAudio_Quality_Tuning_Options());
        newZaptelchannel.setCall_Logging_Options(createCall_Logging_Options());
        newZaptelchannel.setCaller_ID_Options(createCaller_ID_Options());
        newZaptelchannel.setISDN_PRI_Switch(createISDN_PRI_Switch());
        newZaptelchannel.setTiming_Parameters(createTiming_Parameters());
        newZaptelchannel.setOther(createOther());
        // map
        return newZaptelchannel;
    }

    /*
     * erzeugt und initalisiert Call_Logging_Options
     */
    protected static Call_Logging_Options createCall_Logging_Options() {
        Call_Logging_Options newCall_Logging_Options = new Call_Logging_OptionsImpl();
        // fields
        newCall_Logging_Options.setByValue(
                Call_Logging_Options.VALUEID_ACCOUNTCODE, "ACCOUNTCODE");
        newCall_Logging_Options.setByValue(
                Call_Logging_Options.VALUEID_AMAFLAGS, "AMAFLAGS");
        // agg
        // map
        return newCall_Logging_Options;
    }

    /*
     * erzeugt und initalisiert Caller_ID_Options
     */
    protected static Caller_ID_Options createCaller_ID_Options() {
        Caller_ID_Options newCaller_ID_Options = new Caller_ID_OptionsImpl();
        // fields
        newCaller_ID_Options.setByValue(Caller_ID_Options.VALUEID_CALLERID,
                "CALLERID");
        newCaller_ID_Options.setByValue(Caller_ID_Options.VALUEID_USECALLERID,
                Boolean.TRUE);
        newCaller_ID_Options.setByValue(Caller_ID_Options.VALUEID_HIDECALLERID,
                Boolean.TRUE);
        newCaller_ID_Options.setByValue(Caller_ID_Options.VALUEID_RESTRICTCID,
                Boolean.TRUE);
        newCaller_ID_Options.setByValue(
                Caller_ID_Options.VALUEID_USECALLINGPRES, Boolean.TRUE);
        // agg
        // map
        return newCaller_ID_Options;
    }

    /*
     * erzeugt und initalisiert Zapataconf
     */
    protected static Zapataconf createZapataconf() {
        Zapataconf newZapataconf = new ZapataconfImpl();
        // fields
        // agg
        // map
        for (int i = 0; i < 3; i++) {
            newZapataconf.addZaptelchannel(createZaptelchannel());

        }
        return newZapataconf;
    }

}
