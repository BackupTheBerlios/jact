/*
 * (c) urs zeidler
 */
package com.useit.jact.io.managerconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
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
    protected List getWorkingManagergeneralSectionEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein ManagergeneralSection objekt und ließt die entry list dafür
     * ein
     * 
     * @param aEntryList
     * @return
     */
    protected ManagergeneralSection buildManagergeneralSectionModelElement(
            List aEntryList) {
        ManagergeneralSection impl = new ManagergeneralSectionImpl();
        buildManagergeneralSectionModelVaues(aEntryList, impl);
        buildManagergeneralSectionModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildManagergeneralSectionModelAgg(List entryList,
            ManagergeneralSection impl) {

        // aggregate schreiben
        // maps schreiben
        // ManagerSectionMap
        for (Iterator iter = impl.getManagerSectionMap().iterator(); iter
                .hasNext();) {
            ManagerSection aManagerSectionM = buildManagerSectionModelElement(entryList);
            impl.addManagerSection(aManagerSectionM);
            // ManagerSection mobj = (ManagerSection) iter.next();
            // writeManagerSection(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildManagergeneralSectionModelVaues(List entryList,
            ManagergeneralSection impl) {
        String val = null;
        val = findConfValue("generalid", entryList);
        if (val != null)
            impl.setGeneralid(val);

        val = findConfValue("enabled", entryList);
        if (val != null)
            impl.setEnabled(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("portno", entryList);
        if (val != null)
            impl.setPortno(new Integer(val));

        val = findConfValue("bindaddr", entryList);
        if (val != null)
            impl.setBindaddr(val);

        val = findConfValue("port", entryList);
        if (val != null)
            impl.setPort(new Integer(val));

        val = findConfValue("fileid", entryList);
        if (val != null)
            impl.setFileid(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingManagerdenyEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Managerdeny objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Managerdeny buildManagerdenyModelElement(List aEntryList) {
        Managerdeny impl = new ManagerdenyImpl();
        buildManagerdenyModelVaues(aEntryList, impl);
        buildManagerdenyModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildManagerdenyModelAgg(List entryList, Managerdeny impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildManagerdenyModelVaues(List entryList, Managerdeny impl) {
        String val = null;
        val = findConfValue("value", entryList);
        if (val != null)
            impl.setValue(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingManagerSectionEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein ManagerSection objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected ManagerSection buildManagerSectionModelElement(List aEntryList) {
        ManagerSection impl = new ManagerSectionImpl();
        buildManagerSectionModelVaues(aEntryList, impl);
        buildManagerSectionModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildManagerSectionModelAgg(List entryList,
            ManagerSection impl) {

        // aggregate schreiben
        // maps schreiben
        // ManagerdenyMap
        for (Iterator iter = impl.getManagerdenyMap().iterator(); iter
                .hasNext();) {
            Managerdeny aManagerdenyM = buildManagerdenyModelElement(entryList);
            impl.addManagerdeny(aManagerdenyM);
            // Managerdeny mobj = (Managerdeny) iter.next();
            // writeManagerdeny(strB,mobj);
        }
        // ManagerpermitMap
        for (Iterator iter = impl.getManagerpermitMap().iterator(); iter
                .hasNext();) {
            Managerpermit aManagerpermitM = buildManagerpermitModelElement(entryList);
            impl.addManagerpermit(aManagerpermitM);
            // Managerpermit mobj = (Managerpermit) iter.next();
            // writeManagerpermit(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildManagerSectionModelVaues(List entryList,
            ManagerSection impl) {
        String val = null;
        val = findConfValue("username", entryList);
        if (val != null)
            impl.setUsername(val);

        val = findConfValue("secret", entryList);
        if (val != null)
            impl.setSecret(val);

        val = findConfValue("read", entryList);
        if (val != null)
            impl.setRead(val);

        val = findConfValue("write", entryList);
        if (val != null)
            impl.setWrite(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingManagerpermitEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Managerpermit objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Managerpermit buildManagerpermitModelElement(List aEntryList) {
        Managerpermit impl = new ManagerpermitImpl();
        buildManagerpermitModelVaues(aEntryList, impl);
        buildManagerpermitModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildManagerpermitModelAgg(List entryList, Managerpermit impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildManagerpermitModelVaues(List entryList,
            Managerpermit impl) {
        String val = null;
        val = findConfValue("value", entryList);
        if (val != null)
            impl.setValue(val);

    }

}
