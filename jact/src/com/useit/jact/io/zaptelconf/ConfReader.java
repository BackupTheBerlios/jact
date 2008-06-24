/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zaptelconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.zaptelconf.Zaptelchannels;
import com.useit.jact.model.zaptelconf.ZaptelchannelsImpl;
import com.useit.jact.model.zaptelconf.Zaptelconf;
import com.useit.jact.model.zaptelconf.ZaptelconfImpl;
import com.useit.jact.model.zaptelconf.Zapteldynamicspan;
import com.useit.jact.model.zaptelconf.ZapteldynamicspanImpl;
import com.useit.jact.model.zaptelconf.Zaptelspan;
import com.useit.jact.model.zaptelconf.ZaptelspanImpl;
import com.useit.jact.model.zaptelconf.Zapteltonezone;
import com.useit.jact.model.zaptelconf.ZapteltonezoneImpl;

/**
 * <p>
 * ConfReader , die Abstract Confreader klasse, zerlegt per tokenieser den
 * Stringstream in entrys
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReader.java,v 1.8 2006/03/17 10:42:52 urs
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
    protected List getWorkingZapteltonezoneEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Zapteltonezone objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Zapteltonezone buildZapteltonezoneModelElement(List aEntryList) {
        Zapteltonezone impl = new ZapteltonezoneImpl();
        buildZapteltonezoneModelVaues(aEntryList, impl);
        buildZapteltonezoneModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildZapteltonezoneModelAgg(List entryList,
            Zapteltonezone impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildZapteltonezoneModelVaues(List entryList,
            Zapteltonezone impl) {
        String val = null;
        val = findConfValue("zonename", entryList);
        if (val != null)
            impl.setZonename(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingZaptelchannelsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Zaptelchannels objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Zaptelchannels buildZaptelchannelsModelElement(List aEntryList) {
        Zaptelchannels impl = new ZaptelchannelsImpl();
        buildZaptelchannelsModelVaues(aEntryList, impl);
        buildZaptelchannelsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildZaptelchannelsModelAgg(List entryList,
            Zaptelchannels impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildZaptelchannelsModelVaues(List entryList,
            Zaptelchannels impl) {
        String val = null;
        val = findConfValue("device", entryList);
        if (val != null)
            impl.setDevice(val);

        val = findConfValue("channellist", entryList);
        if (val != null)
            impl.setChannellist(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingZaptelconfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Zaptelconf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Zaptelconf buildZaptelconfModelElement(List aEntryList) {
        Zaptelconf impl = new ZaptelconfImpl();
        buildZaptelconfModelVaues(aEntryList, impl);
        buildZaptelconfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildZaptelconfModelAgg(List entryList, Zaptelconf impl) {

        // aggregate schreiben
        // maps schreiben
        // ZaptelchannelsMap
        for (Iterator iter = impl.getZaptelchannelsMap().iterator(); iter
                .hasNext();) {
            Zaptelchannels aZaptelchannelsM = buildZaptelchannelsModelElement(entryList);
            impl.addZaptelchannels(aZaptelchannelsM);
            // Zaptelchannels mobj = (Zaptelchannels) iter.next();
            // writeZaptelchannels(strB,mobj);
        }
        // ZapteldynamicspanMap
        for (Iterator iter = impl.getZapteldynamicspanMap().iterator(); iter
                .hasNext();) {
            Zapteldynamicspan aZapteldynamicspanM = buildZapteldynamicspanModelElement(entryList);
            impl.addZapteldynamicspan(aZapteldynamicspanM);
            // Zapteldynamicspan mobj = (Zapteldynamicspan) iter.next();
            // writeZapteldynamicspan(strB,mobj);
        }
        // ZaptelspanMap
        for (Iterator iter = impl.getZaptelspanMap().iterator(); iter.hasNext();) {
            Zaptelspan aZaptelspanM = buildZaptelspanModelElement(entryList);
            impl.addZaptelspan(aZaptelspanM);
            // Zaptelspan mobj = (Zaptelspan) iter.next();
            // writeZaptelspan(strB,mobj);
        }
        // ZapteltonezoneMap
        for (Iterator iter = impl.getZapteltonezoneMap().iterator(); iter
                .hasNext();) {
            Zapteltonezone aZapteltonezoneM = buildZapteltonezoneModelElement(entryList);
            impl.addZapteltonezone(aZapteltonezoneM);
            // Zapteltonezone mobj = (Zapteltonezone) iter.next();
            // writeZapteltonezone(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildZaptelconfModelVaues(List entryList, Zaptelconf impl) {
        String val = null;
        val = findConfValue("defaultzone", entryList);
        if (val != null)
            impl.setDefaultzone(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingZapteldynamicspanEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Zapteldynamicspan objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Zapteldynamicspan buildZapteldynamicspanModelElement(
            List aEntryList) {
        Zapteldynamicspan impl = new ZapteldynamicspanImpl();
        buildZapteldynamicspanModelVaues(aEntryList, impl);
        buildZapteldynamicspanModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildZapteldynamicspanModelAgg(List entryList,
            Zapteldynamicspan impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildZapteldynamicspanModelVaues(List entryList,
            Zapteldynamicspan impl) {
        String val = null;
        val = findConfValue("driver", entryList);
        if (val != null)
            impl.setDriver(val);

        val = findConfValue("address", entryList);
        if (val != null)
            impl.setAddress(val);

        val = findConfValue("numchans", entryList);
        if (val != null)
            impl.setNumchans(new Integer(val));

        val = findConfValue("timing", entryList);
        if (val != null)
            impl.setTiming(new Integer(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingZaptelspanEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Zaptelspan objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Zaptelspan buildZaptelspanModelElement(List aEntryList) {
        Zaptelspan impl = new ZaptelspanImpl();
        buildZaptelspanModelVaues(aEntryList, impl);
        buildZaptelspanModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildZaptelspanModelAgg(List entryList, Zaptelspan impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildZaptelspanModelVaues(List entryList, Zaptelspan impl) {
        String val = null;
        val = findConfValue("span_num", entryList);
        if (val != null)
            impl.setSpan_num(new Integer(val));

        val = findConfValue("timing", entryList);
        if (val != null)
            impl.setTiming(new Integer(val));

        val = findConfValue("lbo", entryList);
        if (val != null)
            impl.setLbo(new Integer(val));

        val = findConfValue("framing", entryList);
        if (val != null)
            impl.setFraming(val);

        val = findConfValue("coding", entryList);
        if (val != null)
            impl.setCoding(val);

        val = findConfValue("yellow", entryList);
        if (val != null)
            impl.setYellow(val);

    }

}
