/*
 * (c) urs zeidler
 */
package com.useit.jact.io.misdndriverconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.misdndriverconf.MisdnCards;
import com.useit.jact.model.misdndriverconf.MisdnCardsImpl;
import com.useit.jact.model.misdndriverconf.MisdnDriverConf;
import com.useit.jact.model.misdndriverconf.MisdnDriverConfImpl;
import com.useit.jact.model.misdndriverconf.MisdncardPorts;
import com.useit.jact.model.misdndriverconf.MisdncardPortsImpl;
import com.useit.jact.model.types.MCardOptionSet;
import com.useit.jact.model.types.MPortOptionSet;
import com.useit.jact.model.types.MisdnCardTypes;
import com.useit.jact.model.types.MisdnPortOptions;

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
    protected List getWorkingMisdnCardsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein MisdnCards objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected MisdnCards buildMisdnCardsModelElement(List aEntryList) {
        MisdnCards impl = new MisdnCardsImpl();
        buildMisdnCardsModelVaues(aEntryList, impl);
        buildMisdnCardsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMisdnCardsModelAgg(List entryList, MisdnCards impl) {

        // aggregate schreiben
        // maps schreiben
        // MisdncardPortsMap
        for (Iterator iter = impl.getMisdncardPortsMap().iterator(); iter
                .hasNext();) {
            MisdncardPorts aMisdncardPortsM = buildMisdncardPortsModelElement(entryList);
            impl.addMisdncardPorts(aMisdncardPortsM);
            // MisdncardPorts mobj = (MisdncardPorts) iter.next();
            // writeMisdncardPorts(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMisdnCardsModelVaues(List entryList, MisdnCards impl) {
        String val = null;
        val = findConfValue("cardName", entryList);
        if (val != null)
            impl.setCardName(val);

        val = findConfValue("cardType", entryList);
        if (val != null)
            impl.setCardType(new MisdnCardTypes(val));

        val = findConfValue("cardOptions", entryList);
        if (val != null)
            impl.setCardOptions(new MCardOptionSet(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingMisdnDriverConfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein MisdnDriverConf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected MisdnDriverConf buildMisdnDriverConfModelElement(List aEntryList) {
        MisdnDriverConf impl = new MisdnDriverConfImpl();
        buildMisdnDriverConfModelVaues(aEntryList, impl);
        buildMisdnDriverConfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMisdnDriverConfModelAgg(List entryList,
            MisdnDriverConf impl) {

        // aggregate schreiben
        // maps schreiben
        // MisdnCardsMap
        for (Iterator iter = impl.getMisdnCardsMap().iterator(); iter.hasNext();) {
            MisdnCards aMisdnCardsM = buildMisdnCardsModelElement(entryList);
            impl.addMisdnCards(aMisdnCardsM);
            // MisdnCards mobj = (MisdnCards) iter.next();
            // writeMisdnCards(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMisdnDriverConfModelVaues(List entryList,
            MisdnDriverConf impl) {
        String val = null;
        val = findConfValue("poll", entryList);
        if (val != null)
            impl.setPoll(new Integer(val));

        val = findConfValue("pcm", entryList);
        if (val != null)
            impl.setPcm(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("debug", entryList);
        if (val != null)
            impl.setDebug(new Integer(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingMisdncardPortsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein MisdncardPorts objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected MisdncardPorts buildMisdncardPortsModelElement(List aEntryList) {
        MisdncardPorts impl = new MisdncardPortsImpl();
        buildMisdncardPortsModelVaues(aEntryList, impl);
        buildMisdncardPortsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMisdncardPortsModelAgg(List entryList,
            MisdncardPorts impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMisdncardPortsModelVaues(List entryList,
            MisdncardPorts impl) {
        String val = null;
        val = findConfValue("portN", entryList);
        if (val != null)
            impl.setPortN(new Integer(val));

        val = findConfValue("portOption", entryList);
        if (val != null)
            impl.setPortOption(new MisdnPortOptions(val));

        val = findConfValue("mPortOption", entryList);
        if (val != null)
            impl.setMPortOption(new MPortOptionSet(val));

    }

}
