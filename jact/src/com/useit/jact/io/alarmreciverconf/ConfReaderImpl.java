/*
 * (c) urs zeidler
 */
package com.useit.jact.io.alarmreciverconf;

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
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.3 2006/01/09 10:17:34
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {

    /**
     * 
     */
    public ConfReaderImpl() {
        super();
        COMMENTTOK = "#";
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
        driverConf = buildAlarmreceiverconfModelElement(entrylist);

        return driverConf;
    }

}
