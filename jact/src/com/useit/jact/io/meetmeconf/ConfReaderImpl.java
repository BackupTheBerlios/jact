/*
 * (c) urs zeidler
 */
package com.useit.jact.io.meetmeconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.Meetmerooms;
import com.useit.jact.model.meetmeconf.MeetmeroomsImpl;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.4 2006/01/12 19:44:45
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {
    public static final Pattern confPattern = Pattern
            .compile("[ ]*conf[ ]*=>[ ]*(\\w[^;]+)[ ]*");

    public static final String ROOMS = "rooms";

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

        Meetmeconf driverConf = buildMeetmeconfModelElement(entrylist);

        for (int i = 0; i < entrylist.size(); i++) {
            Confentry ce = (Confentry) entrylist.get(i);
            if (ce instanceof Confvalue) {
                Confvalue cv = (Confvalue) ce;
                Matcher matcher = confPattern.matcher(cv.content);
                if (matcher.find()) {
                    driverConf.addMeetmerooms(buildRoom(driverConf, matcher
                            .group(1)));
                }
            }// end of if (ce instanceof Confvalue)
        }// end of for i to entrylist

        return driverConf;
    }

    private Meetmerooms buildRoom(Meetmeconf driverConf, String string) {
        MeetmeroomsImpl impl = new MeetmeroomsImpl();
        String[] strings = string.split(",");
        impl.setConfno(strings[0]);
        if (strings.length == 2)
            impl.setPincode(strings[1]);
        if (strings.length == 3)
            impl.setAdminpin(strings[2]);
        return impl;
    }

}
