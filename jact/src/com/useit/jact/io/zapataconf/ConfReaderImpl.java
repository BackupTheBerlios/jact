/*
 * (c) urs zeidler
 */
package com.useit.jact.io.zapataconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.useit.app.framework.helper.UseFileHelper;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.4 2006/01/29 12:03:54
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {

    public static final String CHANNEL = "channels";

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

        Object driverConf = null;
        // driverConf = buildAgentsconfModelElement(entrylist);
        // TODO: implement read conf
        return driverConf;
    }

}
