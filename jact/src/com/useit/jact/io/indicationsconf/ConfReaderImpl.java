/*
 * (c) urs zeidler
 */
package com.useit.jact.io.indicationsconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.indicationsconf.CustomTone;
import com.useit.jact.model.indicationsconf.CustomToneImpl;
import com.useit.jact.model.indicationsconf.Indicationsconf;
import com.useit.jact.model.indicationsconf.ToneDefinitions;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.4 2006/01/12 18:03:53
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {

    public static final String GENERAL = "general";

    /**
     * 
     */
    public ConfReaderImpl() {
        super();
        COMMENTTOK = ";";
        SECHEADERTOK = "[";
        entryStops = new String[] { "\n", "\r" };
    }

    /**
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        String content = UseFileHelper.readStringFromFile(selectedFile, 400);

        buildEntryList(content);

        Object driverConf;
        driverConf = buildIndicationsconfModelElement(entrylist);

        return driverConf;
    }

    @Override
    protected ToneDefinitions buildToneDefinitionsModelElement(List aEntryList) {
        // ArrayList list = new ArrayList();
        // for (int i = 0; i < aEntryList.size(); i++) {
        // Object test = (Object) aEntryList.get(i);
        //        
        // }//end of for i to aEntryList

        return super.buildToneDefinitionsModelElement(aEntryList);
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildIndicationsconfModelAgg(List entryList,
            Indicationsconf impl) {

        ArrayList list = new ArrayList();
        for (int i = 0; i < headerList.size(); i++) {
            ConfSecHeader he = (ConfSecHeader) headerList.get(i);
            if (!he.content.equals(GENERAL))
                list.add(he);
        }// end of for i to aEntryList

        // aggregate schreiben
        // maps schreiben
        // ToneDefinitionsMap
        for (Iterator iter = list.iterator(); iter.hasNext();) {
            ConfSecHeader he = (ConfSecHeader) iter.next();
            ToneDefinitions aToneDefinitionsM = buildToneDefinitionsModelElement(he.val);
            aToneDefinitionsM.setCountrycode(he.content);
            impl.addToneDefinitions(aToneDefinitionsM);
            // ToneDefinitions mobj = (ToneDefinitions) iter.next();
            // writeToneDefinitions(strB,mobj);
        }
    }

    @Override
    protected void buildToneDefinitionsModelAgg(List entryList,
            ToneDefinitions impl) {
        // aggregate schreiben
        // maps schreiben
        // CustomToneMap
        for (Iterator iter = entryList.iterator(); iter.hasNext();) {
            Confvalue cv = (Confvalue) iter.next();
            if (cv.key != null)
                if (!ToneDefinitions.hasValue(cv.key)) {

                    CustomTone aCustomToneM = buildCustomTone(cv);
                    impl.addCustomTone(aCustomToneM);
                }
            // CustomTone mobj = (CustomTone) iter.next();
            // writeCustomTone(strB,mobj);
        }
    }

    private CustomTone buildCustomTone(Confvalue cv) {
        CustomToneImpl impl = new CustomToneImpl(cv.value, cv.key);
        return impl;
    }
}
