/*
 * (c) urs zeidler
 */
package com.useit.jact.io.managerconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.managerconf.ManagerSection;
import com.useit.jact.model.managerconf.ManagerdenyImpl;
import com.useit.jact.model.managerconf.ManagergeneralSection;
import com.useit.jact.model.managerconf.ManagerpermitImpl;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.3 2006/01/09 10:17:34
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
        String[] entryStops = { "\n", "\r" };
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
        driverConf = buildManagergeneralSectionModelElement(entrylist);

        return driverConf;
    }

    @Override
    protected void buildManagergeneralSectionModelAgg(List entryList,
            ManagergeneralSection impl) {
        // aggregate schreiben
        // maps schreiben

        // ManagerSectionMap
        for (Iterator iter = headerList.iterator(); iter.hasNext();) {
            ConfSecHeader csh = (ConfSecHeader) iter.next();
            if (!csh.content.equals(GENERAL)) {
                ManagerSection aManagerSectionM = buildManagerSectionModelElement(csh.val);
                aManagerSectionM.setUsername(csh.content);
                impl.addManagerSection(aManagerSectionM);

            }
        }
    }

    @Override
    protected void buildManagerSectionModelAgg(List entryList,
            ManagerSection impl) {
        String tmp = findConfValue("deny", entryList);
        if (tmp != null) {
            String[] strings = tmp.split(",");
            for (int i = 0; i < strings.length; i++) {
                String string = strings[i];
                impl.addManagerdeny(new ManagerdenyImpl(string));
            }
        }
        tmp = findConfValue("permit", entryList);
        if (tmp != null) {
            String[] strings = tmp.split(",");
            for (int i = 0; i < strings.length; i++) {
                String string = strings[i];
                impl.addManagerpermit(new ManagerpermitImpl(string));
            }
        }
    }
}
