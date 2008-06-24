/*
 * (c) urs zeidler
 */
package com.useit.jact.io.indicationsconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.CustomToneImpl;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.IndicationsconfImpl;
import com.useit.jact.model.indicationsconf.ToneDefinitions;
import com.useit.jact.model.indicationsconf.ToneDefinitionsImpl;

/**
 * <p>
 * ConfReader , die Abstract Confreader klasse, zerlegt per tokenieser den
 * Stringstream in entrys
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReader.java,v 1.7 2006/03/17 10:42:52 urs
 *          Exp $
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
    protected List getWorkingToneDefinitionsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein ToneDefinitions objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected ToneDefinitions buildToneDefinitionsModelElement(List aEntryList) {
        ToneDefinitions impl = new ToneDefinitionsImpl();
        buildToneDefinitionsModelVaues(aEntryList, impl);
        buildToneDefinitionsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildToneDefinitionsModelAgg(List entryList,
            ToneDefinitions impl) {

        // aggregate schreiben
        // maps schreiben
        // CustomToneMap
        for (Iterator iter = impl.getCustomToneMap().iterator(); iter.hasNext();) {
            CustomTone aCustomToneM = buildCustomToneModelElement(entryList);
            impl.addCustomTone(aCustomToneM);
            // CustomTone mobj = (CustomTone) iter.next();
            // writeCustomTone(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildToneDefinitionsModelVaues(List entryList,
            ToneDefinitions impl) {
        String val = null;
        val = findConfValue("countrycode", entryList);
        if (val != null)
            impl.setCountrycode(val);

        val = findConfValue("description", entryList);
        if (val != null)
            impl.setDescription(val);

        val = findConfValue("alias", entryList);
        if (val != null)
            impl.setAlias(val);

        val = findConfValue("ringcadence", entryList);
        if (val != null)
            impl.setRingcadence(val);

        val = findConfValue("dial", entryList);
        if (val != null)
            impl.setDial(val);

        val = findConfValue("busy", entryList);
        if (val != null)
            impl.setBusy(val);

        val = findConfValue("ring", entryList);
        if (val != null)
            impl.setRing(val);

        val = findConfValue("congestion", entryList);
        if (val != null)
            impl.setCongestion(val);

        val = findConfValue("callwaiting", entryList);
        if (val != null)
            impl.setCallwaiting(val);

        val = findConfValue("dialrecall", entryList);
        if (val != null)
            impl.setDialrecall(val);

        val = findConfValue("record", entryList);
        if (val != null)
            impl.setRecord(val);

        val = findConfValue("info", entryList);
        if (val != null)
            impl.setInfo(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingIndicationsconfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Indicationsconf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Indicationsconf buildIndicationsconfModelElement(List aEntryList) {
        Indicationsconf impl = new IndicationsconfImpl();
        buildIndicationsconfModelVaues(aEntryList, impl);
        buildIndicationsconfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildIndicationsconfModelAgg(List entryList,
            Indicationsconf impl) {

        // aggregate schreiben
        // maps schreiben
        // ToneDefinitionsMap
        for (Iterator iter = impl.getToneDefinitionsMap().iterator(); iter
                .hasNext();) {
            ToneDefinitions aToneDefinitionsM = buildToneDefinitionsModelElement(entryList);
            impl.addToneDefinitions(aToneDefinitionsM);
            // ToneDefinitions mobj = (ToneDefinitions) iter.next();
            // writeToneDefinitions(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildIndicationsconfModelVaues(List entryList,
            Indicationsconf impl) {
        String val = null;
        val = findConfValue("country", entryList);
        if (val != null)
            impl.setCountry(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingCustomToneEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein CustomTone objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected CustomTone buildCustomToneModelElement(List aEntryList) {
        CustomTone impl = new CustomToneImpl();
        buildCustomToneModelVaues(aEntryList, impl);
        buildCustomToneModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildCustomToneModelAgg(List entryList, CustomTone impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildCustomToneModelVaues(List entryList, CustomTone impl) {
        String val = null;
        val = findConfValue("tonecode", entryList);
        if (val != null)
            impl.setTonecode(val);

        val = findConfValue("name", entryList);
        if (val != null)
            impl.setName(val);

    }

}
