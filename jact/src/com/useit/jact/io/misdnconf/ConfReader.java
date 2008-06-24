/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdnconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
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
 * ConfReader , die Abstract Confreader klasse, zerlegt per tokenieser den
 * Stringstream in entrys
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReader.java,v 1.13 2006/03/17 10:42:52
 *          urs Exp $
 */
public class ConfReader extends AbstractConfReader {

    /**
     * 
     */
    public ConfReader() {
        super();
    }

    /**
     * ließt den file und bildet die Entrylist
     * 
     * @param file
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void readConfFile(String file) throws FileNotFoundException,
            IOException {
        String content = readStringFromFile(new File(file), 500);
        buildEntryList(content);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingMisdnCryptkeyEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein MisdnCryptkey objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected MisdnCryptkey buildMisdnCryptkeyModelElement(List aEntryList) {
        MisdnCryptkey impl = new MisdnCryptkeyImpl();
        buildMisdnCryptkeyModelVaues(aEntryList, impl);
        buildMisdnCryptkeyModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMisdnCryptkeyModelAgg(List entryList, MisdnCryptkey impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMisdnCryptkeyModelVaues(List entryList,
            MisdnCryptkey impl) {
        String val = null;
        val = findConfValue("keyname", entryList);
        if (val != null)
            impl.setKeyname(val);

        val = findConfValue("keyvalue", entryList);
        if (val != null)
            impl.setKeyvalue(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingMisdnPortsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein MisdnPorts objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected MisdnPorts buildMisdnPortsModelElement(List aEntryList) {
        MisdnPorts impl = new MisdnPortsImpl();
        buildMisdnPortsModelVaues(aEntryList, impl);
        buildMisdnPortsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMisdnPortsModelAgg(List entryList, MisdnPorts impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMisdnPortsModelVaues(List entryList, MisdnPorts impl) {
        String val = null;
        val = findConfValue("portN", entryList);
        if (val != null)
            impl.setPortN(new Integer(val));

        val = findConfValue("portOption", entryList);
        if (val != null)
            impl.setPortOption(new MisdnPortOptions(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingMisdnSectionsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein MisdnSections objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected MisdnSections buildMisdnSectionsModelElement(List aEntryList) {
        MisdnSections impl = new MisdnSectionsImpl();
        buildMisdnSectionsModelVaues(aEntryList, impl);
        buildMisdnSectionsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMisdnSectionsModelAgg(List entryList, MisdnSections impl) {

        // aggregate schreiben
        // maps schreiben
        // MisdnPortsMap
        for (Iterator iter = impl.getMisdnPortsMap().iterator(); iter.hasNext();) {
            MisdnPorts aMisdnPortsM = buildMisdnPortsModelElement(entryList);
            impl.addMisdnPorts(aMisdnPortsM);
            // MisdnPorts mobj = (MisdnPorts) iter.next();
            // writeMisdnPorts(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMisdnSectionsModelVaues(List entryList,
            MisdnSections impl) {
        String val = null;
        val = findConfValue("context", entryList);
        if (val != null)
            impl.setContext(new PbxContext(val));

        val = findConfValue("language", entryList);
        if (val != null)
            impl.setLanguage(val);

        val = findConfValue("nationalprefix", entryList);
        if (val != null)
            impl.setNationalprefix(val);

        val = findConfValue("internationalprefix", entryList);
        if (val != null)
            impl.setInternationalprefix(val);

        val = findConfValue("rxgain", entryList);
        if (val != null)
            impl.setRxgain(new Integer(val));

        val = findConfValue("txgain", entryList);
        if (val != null)
            impl.setTxgain(new Integer(val));

        val = findConfValue("te_choose_channel", entryList);
        if (val != null)
            impl
                    .setTe_choose_channel(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("early_bconnect", entryList);
        if (val != null)
            impl
                    .setEarly_bconnect(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("dialplan", entryList);
        if (val != null)
            impl.setDialplan(new Dialplan(val));

        val = findConfValue("use_callingpres", entryList);
        if (val != null)
            impl
                    .setUse_callingpres(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("always_immediate", entryList);
        if (val != null)
            impl
                    .setAlways_immediate(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("immediate", entryList);
        if (val != null)
            impl.setImmediate(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("hold_allowed", entryList);
        if (val != null)
            impl.setHold_allowed(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("pickgroup", entryList);
        if (val != null)
            impl.setPickgroup(val);

        val = findConfValue("callgroup", entryList);
        if (val != null)
            impl.setCallgroup(val);

        val = findConfValue("presentation", entryList);
        if (val != null)
            impl.setPresentation(new Presentation(val));

        val = findConfValue("echocancel", entryList);
        if (val != null)
            impl.setEchocancel(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("echocancelwhenbridged", entryList);
        if (val != null)
            impl
                    .setEchocancelwhenbridged(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("echotraining", entryList);
        if (val != null)
            impl.setEchotraining(val);

        val = findConfValue("sectionname", entryList);
        if (val != null)
            impl.setSectionname(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingMisdnconfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Misdnconf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Misdnconf buildMisdnconfModelElement(List aEntryList) {
        Misdnconf impl = new MisdnconfImpl();
        buildMisdnconfModelVaues(aEntryList, impl);
        buildMisdnconfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMisdnconfModelAgg(List entryList, Misdnconf impl) {

        // aggregate schreiben
        // MisdnSections
        MisdnSections aMisdnSections = buildMisdnSectionsModelElement(entryList);
        impl.setMisdnSections(aMisdnSections);
        // writeMisdnSections(strB, impl.getMisdnSections());
        // maps schreiben
        // MisdnCryptkeyMap
        for (Iterator iter = impl.getMisdnCryptkeyMap().iterator(); iter
                .hasNext();) {
            MisdnCryptkey aMisdnCryptkeyM = buildMisdnCryptkeyModelElement(entryList);
            impl.addMisdnCryptkey(aMisdnCryptkeyM);
            // MisdnCryptkey mobj = (MisdnCryptkey) iter.next();
            // writeMisdnCryptkey(strB,mobj);
        }
        // MisdnSectionsMap
        for (Iterator iter = impl.getMisdnSectionsMap().iterator(); iter
                .hasNext();) {
            MisdnSections aMisdnSectionsM = buildMisdnSectionsModelElement(entryList);
            impl.addMisdnSections(aMisdnSectionsM);
            // MisdnSections mobj = (MisdnSections) iter.next();
            // writeMisdnSections(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMisdnconfModelVaues(List entryList, Misdnconf impl) {
        String val = null;
        val = findConfValue("debug", entryList);
        if (val != null)
            impl.setDebug(new Integer(val));

        val = findConfValue("tracefile", entryList);
        if (val != null)
            impl.setTracefile(val);

        val = findConfValue("trace_calls", entryList);
        if (val != null)
            impl.setTrace_calls(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("trace_dir", entryList);
        if (val != null)
            impl.setTrace_dir(val);

        val = findConfValue("bridging", entryList);
        if (val != null)
            impl.setBridging(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("stop_tone_after_first_digit", entryList);
        if (val != null)
            impl
                    .setStop_tone_after_first_digit(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("append_digits2exten", entryList);
        if (val != null)
            impl
                    .setAppend_digits2exten(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("l1_info_ok", entryList);
        if (val != null)
            impl.setL1_info_ok(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("clear_l3", entryList);
        if (val != null)
            impl.setClear_l3(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("dynamic_crypt", entryList);
        if (val != null)
            impl
                    .setDynamic_crypt(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("crypt_prefix", entryList);
        if (val != null)
            impl.setCrypt_prefix(val);

        val = findConfValue("fileid", entryList);
        if (val != null)
            impl.setFileid(val);

        val = findConfValue("context", entryList);
        if (val != null)
            impl.setContext(new PbxContext(val));

    }

}
