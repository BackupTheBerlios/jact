/*
 * (c) urs zeidler
 */
package com.useit.jact.io.voicemailconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.useit.app.framework.helper.UseFileHelper;
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.VoicemailcontextentryImpl;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.Zonemessages;
import com.useit.jact.model.voicemailconf.ZonemessagesImpl;

/**
 * <p>
 * ConfReaderImpl
 * </p>
 * Created : 31.08.2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ConfReaderImpl.java,v 1.4 2006/01/13 19:28:09
 *          urs Exp $
 */
public class ConfReaderImpl extends ConfReader {

    public static final String GENERAL = "general";

    public static final String ZONEMESSAGES = "zonemessages";

    public static final Pattern zoneMessagePattern = Pattern
            .compile("[ ]*(.+)[ ]*=[ ]*(\\w+[^;])/(\\w[^;/|]+)[|](.+[^;])|[ ]*(.+)[ ]*=[ ]*(\\w+[^;])/(\\w[^;/|]+)");

    public static final Pattern mailboxPattern = Pattern
            .compile("[ ]*(.*)[=>]+[ ]*(.[^;]+)");

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

        VoicemailConf driverConf = null;
        // ConfSecHeader secHeader = findConfHeader(GENERAL);
        // if(secHeader!=null)
        driverConf = buildVoicemailConfModelElement(entrylist);

        return driverConf;
    }

    @Override
    protected void buildVoicemailConfModelAgg(List entryList, VoicemailConf impl) {

        // aggregate schreiben
        // Voicemailgeneral
        ConfSecHeader secHeader = findConfHeader(GENERAL);
        if (secHeader != null) {
            Voicemailgeneral aVoicemailgeneral = buildVoicemailgeneralModelElement(entryList);
            impl.setVoicemailgeneral(aVoicemailgeneral);
        }
        // writeVoicemailgeneral(strB, impl.getVoicemailgeneral());
        // maps schreiben
        // VoicemailcontextMap
        List<ConfSecHeader> list = excludeHeader(new String[] { GENERAL,
                ZONEMESSAGES });

        for (int i = 0; i < list.size(); i++) {
            ConfSecHeader ch = list.get(i);
            Voicemailcontext aVoicemailcontextM = buildVoicemailcontextModelElement(ch.val);
            aVoicemailcontextM.setContextname(ch.content);
            impl.addVoicemailcontext(aVoicemailcontextM);

        }// end of for i to list

        // ZonemessagesMap
        secHeader = findConfHeader(ZONEMESSAGES);
        if (secHeader != null)
            for (Iterator iter = secHeader.iterator(); iter.hasNext();) {
                Object obj = iter.next();
                if (obj instanceof Confvalue) {
                    Confvalue cv = (Confvalue) obj;
                    Zonemessages aZonemessagesM = buildZoneMessage(cv);
                    if (aZonemessagesM != null)
                        impl.addZonemessages(aZonemessagesM);
                }// end of if (obj instanceof Confvalue)
            }
    }

    private Zonemessages buildZoneMessage(Confvalue cv) {
        ZonemessagesImpl z = null;
        Matcher matcher = zoneMessagePattern.matcher(cv.content);
        if (matcher.find()) {
            z = new ZonemessagesImpl();
            if (matcher.group(1) != null) {
                z.setTimezonename(matcher.group(1));
                z.setCountry(matcher.group(2));
                z.setCity(matcher.group(3));
                z.setOptions(matcher.group(4));
            } else if (matcher.group(5) != null) {
                z.setTimezonename(matcher.group(5));
                z.setCountry(matcher.group(6));
                z.setCity(matcher.group(7));

            }
        }

        return z;
    }

    @Override
    protected void buildVoicemailcontextModelAgg(List entryList,
            Voicemailcontext impl) {
        // aggregate schreiben
        // maps schreiben
        // VoicemailcontextentryMap
        for (Iterator iter = entryList.iterator(); iter.hasNext();) {
            Object obj = iter.next();
            if (obj instanceof Confvalue) {
                Confvalue cv = (Confvalue) obj;
                Matcher matcher = mailboxPattern.matcher(cv.content);
                if (matcher.find()) {
                    VoicemailcontextentryImpl entryImpl = new VoicemailcontextentryImpl();
                    entryImpl.setMailbox(matcher.group(1));
                    String[] det = matcher.group(2).split(",");
                    if (det.length > 4)
                        entryImpl.setUser_options(det[4]);
                    if (det.length > 3)
                        entryImpl.setPager_email_address(det[3]);
                    if (det.length > 2)
                        entryImpl.setUser_email_address(det[2]);
                    if (det.length > 1)
                        entryImpl.setUser_name(det[1]);
                    if (det.length > 0)
                        entryImpl.setVoicemail_password(det[0]);

                    impl.addVoicemailcontextentry(entryImpl);
                }

            }// end of if (obj instanceof Confvalue)
        }
    }
}
