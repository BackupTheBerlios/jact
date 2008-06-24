/*
 * (c) urs zeidler
 */
package com.useit.jact.io.musiconholdconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.musiconholdconf.MohClasses;
import com.useit.jact.model.musiconholdconf.MohClassesImpl;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConf;
import com.useit.jact.model.musiconholdconf.Music_on_HoldConfImpl;

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
    protected List getWorkingMohClassesEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein MohClasses objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected MohClasses buildMohClassesModelElement(List aEntryList) {
        MohClasses impl = new MohClassesImpl();
        buildMohClassesModelVaues(aEntryList, impl);
        buildMohClassesModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMohClassesModelAgg(List entryList, MohClasses impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMohClassesModelVaues(List entryList, MohClasses impl) {
        String val = null;
        val = findConfValue("name", entryList);
        if (val != null)
            impl.setName(val);

        val = findConfValue("player", entryList);
        if (val != null)
            impl.setPlayer(val);

        val = findConfValue("mohdir", entryList);
        if (val != null)
            impl.setMohdir(val);

        val = findConfValue("mohpara", entryList);
        if (val != null)
            impl.setMohpara(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingMusic_on_HoldConfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Music_on_HoldConf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Music_on_HoldConf buildMusic_on_HoldConfModelElement(
            List aEntryList) {
        Music_on_HoldConf impl = new Music_on_HoldConfImpl();
        buildMusic_on_HoldConfModelVaues(aEntryList, impl);
        buildMusic_on_HoldConfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMusic_on_HoldConfModelAgg(List entryList,
            Music_on_HoldConf impl) {

        // aggregate schreiben
        // maps schreiben
        // MohClassesMap
        for (Iterator iter = impl.getMohClassesMap().iterator(); iter.hasNext();) {
            MohClasses aMohClassesM = buildMohClassesModelElement(entryList);
            impl.addMohClasses(aMohClassesM);
            // MohClasses mobj = (MohClasses) iter.next();
            // writeMohClasses(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMusic_on_HoldConfModelVaues(List entryList,
            Music_on_HoldConf impl) {
        String val = null;
    }

}
