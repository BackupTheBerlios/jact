/*
 * (c) urs zeidler
 */
package com.useit.jact.io.queueconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.QueuememberImpl;
import com.useit.jact.model.queueconf.Queuesection;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.7 2006/01/29 12:03:56
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {

    public static final String GENERAL = "general";

    public static final Pattern memberPattern = Pattern
            .compile("[ ]*member[ ]*[=>]+[ ]*(.[^;]+)/(.[^;]+)");

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

        // Object driverConf;
        Queuegeneral driverConf = buildQueuegeneralModelElement(getWorkingQueuegeneralEntryList());

        List list = getWorkingQueuesectionEntryList();
        for (int i = 0; i < list.size(); i++) {
            ConfSecHeader csh = (ConfSecHeader) list.get(i);
            Queuesection qsec = buildQueuesectionModelElement(csh.val);
            qsec.setSectionname(csh.content);
            buildMembers(csh, qsec);
            driverConf.addQueuesection(qsec);
        }// end of for i to list

        return driverConf;
    }

    private void buildMembers(ConfSecHeader csh, Queuesection qsec) {
        for (int i = 0; i < csh.val.size(); i++) {
            Object obj = csh.val.get(i);
            if (obj instanceof Confvalue) {
                Confvalue cv = (Confvalue) obj;
                Matcher matcher = memberPattern.matcher(cv.content);
                if (matcher.find()) {
                    QueuememberImpl impl = new QueuememberImpl();
                    impl.setTech(matcher.group(1));
                    impl.setDialstring(matcher.group(2));
                    qsec.addQueuemember(impl);
                }

            }// end of if (obj instanceof Confvalue)
        }// end of for i to csh.val
    }

    @Override
    protected List getWorkingQueuegeneralEntryList() {
        ConfSecHeader header = findConfHeader(GENERAL);
        if (header != null)
            return header.val;
        return null;
    }

    @Override
    protected List getWorkingQueuesectionEntryList() {
        ArrayList list = new ArrayList();
        for (Iterator iter = headerList.iterator(); iter.hasNext();) {
            ConfSecHeader h = (ConfSecHeader) iter.next();
            if (!h.content.equals(GENERAL))
                list.add(h);
        }
        return list;
    }
}
