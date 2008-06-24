/*
 * (c) urs zeidler
 */
package com.useit.jact.io.voicemailconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.voicemailconf.VoicemailConf;
import com.useit.jact.model.voicemailconf.VoicemailConfImpl;
import com.useit.jact.model.voicemailconf.Voicemailcontext;
import com.useit.jact.model.voicemailconf.VoicemailcontextImpl;
import com.useit.jact.model.voicemailconf.Voicemailcontextentry;
import com.useit.jact.model.voicemailconf.VoicemailcontextentryImpl;
import com.useit.jact.model.voicemailconf.Voicemailgeneral;
import com.useit.jact.model.voicemailconf.VoicemailgeneralImpl;
import com.useit.jact.model.voicemailconf.Zonemessages;
import com.useit.jact.model.voicemailconf.ZonemessagesImpl;

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
    protected List getWorkingVoicemailConfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein VoicemailConf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected VoicemailConf buildVoicemailConfModelElement(List aEntryList) {
        VoicemailConf impl = new VoicemailConfImpl();
        buildVoicemailConfModelVaues(aEntryList, impl);
        buildVoicemailConfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildVoicemailConfModelAgg(List entryList, VoicemailConf impl) {

        // aggregate schreiben
        // Voicemailgeneral
        Voicemailgeneral aVoicemailgeneral = buildVoicemailgeneralModelElement(entryList);
        impl.setVoicemailgeneral(aVoicemailgeneral);
        // writeVoicemailgeneral(strB, impl.getVoicemailgeneral());
        // maps schreiben
        // VoicemailcontextMap
        for (Iterator iter = impl.getVoicemailcontextMap().iterator(); iter
                .hasNext();) {
            Voicemailcontext aVoicemailcontextM = buildVoicemailcontextModelElement(entryList);
            impl.addVoicemailcontext(aVoicemailcontextM);
            // Voicemailcontext mobj = (Voicemailcontext) iter.next();
            // writeVoicemailcontext(strB,mobj);
        }
        // ZonemessagesMap
        for (Iterator iter = impl.getZonemessagesMap().iterator(); iter
                .hasNext();) {
            Zonemessages aZonemessagesM = buildZonemessagesModelElement(entryList);
            impl.addZonemessages(aZonemessagesM);
            // Zonemessages mobj = (Zonemessages) iter.next();
            // writeZonemessages(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildVoicemailConfModelVaues(List entryList,
            VoicemailConf impl) {
        String val = null;
    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingZonemessagesEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Zonemessages objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Zonemessages buildZonemessagesModelElement(List aEntryList) {
        Zonemessages impl = new ZonemessagesImpl();
        buildZonemessagesModelVaues(aEntryList, impl);
        buildZonemessagesModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildZonemessagesModelAgg(List entryList, Zonemessages impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildZonemessagesModelVaues(List entryList, Zonemessages impl) {
        String val = null;
        val = findConfValue("timezonename", entryList);
        if (val != null)
            impl.setTimezonename(val);

        val = findConfValue("country", entryList);
        if (val != null)
            impl.setCountry(val);

        val = findConfValue("city", entryList);
        if (val != null)
            impl.setCity(val);

        val = findConfValue("options", entryList);
        if (val != null)
            impl.setOptions(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingVoicemailcontextEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Voicemailcontext objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Voicemailcontext buildVoicemailcontextModelElement(List aEntryList) {
        Voicemailcontext impl = new VoicemailcontextImpl();
        buildVoicemailcontextModelVaues(aEntryList, impl);
        buildVoicemailcontextModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildVoicemailcontextModelAgg(List entryList,
            Voicemailcontext impl) {

        // aggregate schreiben
        // maps schreiben
        // VoicemailcontextentryMap
        for (Iterator iter = impl.getVoicemailcontextentryMap().iterator(); iter
                .hasNext();) {
            Voicemailcontextentry aVoicemailcontextentryM = buildVoicemailcontextentryModelElement(entryList);
            impl.addVoicemailcontextentry(aVoicemailcontextentryM);
            // Voicemailcontextentry mobj = (Voicemailcontextentry) iter.next();
            // writeVoicemailcontextentry(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildVoicemailcontextModelVaues(List entryList,
            Voicemailcontext impl) {
        String val = null;
        val = findConfValue("contextname", entryList);
        if (val != null)
            impl.setContextname(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingVoicemailcontextentryEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Voicemailcontextentry objekt und ließt die entry list dafür
     * ein
     * 
     * @param aEntryList
     * @return
     */
    protected Voicemailcontextentry buildVoicemailcontextentryModelElement(
            List aEntryList) {
        Voicemailcontextentry impl = new VoicemailcontextentryImpl();
        buildVoicemailcontextentryModelVaues(aEntryList, impl);
        buildVoicemailcontextentryModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildVoicemailcontextentryModelAgg(List entryList,
            Voicemailcontextentry impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildVoicemailcontextentryModelVaues(List entryList,
            Voicemailcontextentry impl) {
        String val = null;
        val = findConfValue("mailbox", entryList);
        if (val != null)
            impl.setMailbox(val);

        val = findConfValue("voicemail_password", entryList);
        if (val != null)
            impl.setVoicemail_password(val);

        val = findConfValue("user_name", entryList);
        if (val != null)
            impl.setUser_name(val);

        val = findConfValue("user_email_address", entryList);
        if (val != null)
            impl.setUser_email_address(val);

        val = findConfValue("pager_email_address", entryList);
        if (val != null)
            impl.setPager_email_address(val);

        val = findConfValue("user_options", entryList);
        if (val != null)
            impl.setUser_options(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingVoicemailgeneralEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Voicemailgeneral objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Voicemailgeneral buildVoicemailgeneralModelElement(List aEntryList) {
        Voicemailgeneral impl = new VoicemailgeneralImpl();
        buildVoicemailgeneralModelVaues(aEntryList, impl);
        buildVoicemailgeneralModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildVoicemailgeneralModelAgg(List entryList,
            Voicemailgeneral impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildVoicemailgeneralModelVaues(List entryList,
            Voicemailgeneral impl) {
        String val = null;
        val = findConfValue("attach", entryList);
        if (val != null)
            impl.setAttach(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("delete", entryList);
        if (val != null)
            impl.setDelete(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("mailcmd", entryList);
        if (val != null)
            impl.setMailcmd(val);

        val = findConfValue("maxsilence", entryList);
        if (val != null)
            impl.setMaxsilence(val);

        val = findConfValue("envelope", entryList);
        if (val != null)
            impl.setEnvelope(val);

        val = findConfValue("externnotify", entryList);
        if (val != null)
            impl.setExternnotify(val);

        val = findConfValue("silencethreshold", entryList);
        if (val != null)
            impl.setSilencethreshold(val);

        val = findConfValue("serveremail", entryList);
        if (val != null)
            impl.setServeremail(val);

        val = findConfValue("maxmessage", entryList);
        if (val != null)
            impl.setMaxmessage(val);

        val = findConfValue("minmessage", entryList);
        if (val != null)
            impl.setMinmessage(val);

        val = findConfValue("format", entryList);
        if (val != null)
            impl.setFormat(val);

        val = findConfValue("maxgreet", entryList);
        if (val != null)
            impl.setMaxgreet(val);

        val = findConfValue("skipms", entryList);
        if (val != null)
            impl.setSkipms(val);

        val = findConfValue("maxlogins", entryList);
        if (val != null)
            impl.setMaxlogins(val);

        val = findConfValue("cidinternalcontexts", entryList);
        if (val != null)
            impl.setCidinternalcontexts(val);

        val = findConfValue("review", entryList);
        if (val != null)
            impl.setReview(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("operator", entryList);
        if (val != null)
            impl.setOperator(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("saycid", entryList);
        if (val != null)
            impl.setSaycid(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("dialout", entryList);
        if (val != null)
            impl.setDialout(val);

        val = findConfValue("callback", entryList);
        if (val != null)
            impl.setCallback(val);

        val = findConfValue("dbuser", entryList);
        if (val != null)
            impl.setDbuser(val);

        val = findConfValue("dbpass", entryList);
        if (val != null)
            impl.setDbpass(val);

        val = findConfValue("dbhost", entryList);
        if (val != null)
            impl.setDbhost(val);

        val = findConfValue("dbname", entryList);
        if (val != null)
            impl.setDbname(val);

        val = findConfValue("dboption", entryList);
        if (val != null)
            impl.setDboption(val);

        val = findConfValue("pbxskip", entryList);
        if (val != null)
            impl.setPbxskip(val);

        val = findConfValue("fromstring", entryList);
        if (val != null)
            impl.setFromstring(val);

        val = findConfValue("emailsubject", entryList);
        if (val != null)
            impl.setEmailsubject(val);

        val = findConfValue("emailbody", entryList);
        if (val != null)
            impl.setEmailbody(val);

        val = findConfValue("exitcontext", entryList);
        if (val != null)
            impl.setExitcontext(val);

        val = findConfValue("nextaftercmd", entryList);
        if (val != null)
            impl.setNextaftercmd(val);

    }

}
