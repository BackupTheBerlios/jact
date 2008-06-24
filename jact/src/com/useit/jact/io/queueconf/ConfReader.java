/*
 * (c) urs zeidler
 */
package com.useit.jact.io.queueconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.queueconf.Queuegeneral;
import com.useit.jact.model.queueconf.QueuegeneralImpl;
import com.useit.jact.model.queueconf.Queuemember;
import com.useit.jact.model.queueconf.QueuememberImpl;
import com.useit.jact.model.queueconf.Queuesection;
import com.useit.jact.model.queueconf.QueuesectionImpl;
import com.useit.jact.model.types.PbxContext;

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
    protected List getWorkingQueuegeneralEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Queuegeneral objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Queuegeneral buildQueuegeneralModelElement(List aEntryList) {
        Queuegeneral impl = new QueuegeneralImpl();
        buildQueuegeneralModelVaues(aEntryList, impl);
        buildQueuegeneralModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildQueuegeneralModelAgg(List entryList, Queuegeneral impl) {

        // aggregate schreiben
        // maps schreiben
        // QueuesectionMap
        for (Iterator iter = impl.getQueuesectionMap().iterator(); iter
                .hasNext();) {
            Queuesection aQueuesectionM = buildQueuesectionModelElement(entryList);
            impl.addQueuesection(aQueuesectionM);
            // Queuesection mobj = (Queuesection) iter.next();
            // writeQueuesection(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildQueuegeneralModelVaues(List entryList, Queuegeneral impl) {
        String val = null;
        val = findConfValue("persistentmembers", entryList);
        if (val != null)
            impl
                    .setPersistentmembers(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingQueuesectionEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Queuesection objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Queuesection buildQueuesectionModelElement(List aEntryList) {
        Queuesection impl = new QueuesectionImpl();
        buildQueuesectionModelVaues(aEntryList, impl);
        buildQueuesectionModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildQueuesectionModelAgg(List entryList, Queuesection impl) {

        // aggregate schreiben
        // maps schreiben
        // QueuememberMap
        for (Iterator iter = impl.getQueuememberMap().iterator(); iter
                .hasNext();) {
            Queuemember aQueuememberM = buildQueuememberModelElement(entryList);
            impl.addQueuemember(aQueuememberM);
            // Queuemember mobj = (Queuemember) iter.next();
            // writeQueuemember(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildQueuesectionModelVaues(List entryList, Queuesection impl) {
        String val = null;
        val = findConfValue("musiconhold", entryList);
        if (val != null)
            impl.setMusiconhold(val);

        val = findConfValue("sectionname", entryList);
        if (val != null)
            impl.setSectionname(val);

        val = findConfValue("announce", entryList);
        if (val != null)
            impl.setAnnounce(val);

        val = findConfValue("strategy", entryList);
        if (val != null)
            impl.setStrategy(val);

        val = findConfValue("servicelevel", entryList);
        if (val != null)
            impl.setServicelevel(new Integer(val));

        val = findConfValue("context", entryList);
        if (val != null)
            impl.setContext(new PbxContext(val));

        val = findConfValue("timeout", entryList);
        if (val != null)
            impl.setTimeout(new Integer(val));

        val = findConfValue("retry", entryList);
        if (val != null)
            impl.setRetry(new Integer(val));

        val = findConfValue("weight", entryList);
        if (val != null)
            impl.setWeight(val);

        val = findConfValue("wrapuptime", entryList);
        if (val != null)
            impl.setWrapuptime(new Integer(val));

        val = findConfValue("maxlen", entryList);
        if (val != null)
            impl.setMaxlen(new Integer(val));

        val = findConfValue("announcefrequency", entryList);
        if (val != null)
            impl.setAnnouncefrequency(new Integer(val));

        val = findConfValue("announceholdtime", entryList);
        if (val != null)
            impl
                    .setAnnounceholdtime(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("announceroundseconds", entryList);
        if (val != null)
            impl.setAnnounceroundseconds(val);

        val = findConfValue("monitorformat", entryList);
        if (val != null)
            impl.setMonitorformat(val);

        val = findConfValue("monitorjoin", entryList);
        if (val != null)
            impl.setMonitorjoin(com.useit.app.framework.helper.UseStringHelper
                    .parseBoolCommon(val));

        val = findConfValue("joinempty", entryList);
        if (val != null)
            impl.setJoinempty(val);

        val = findConfValue("leavewhenempty", entryList);
        if (val != null)
            impl.setLeavewhenempty(val);

        val = findConfValue("eventwhencalled", entryList);
        if (val != null)
            impl
                    .setEventwhencalled(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("eventmemberstatusoff", entryList);
        if (val != null)
            impl
                    .setEventmemberstatusoff(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("reportholdtime", entryList);
        if (val != null)
            impl
                    .setReportholdtime(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

        val = findConfValue("memberdelay", entryList);
        if (val != null)
            impl.setMemberdelay(new Integer(val));

        val = findConfValue("timeoutrestart", entryList);
        if (val != null)
            impl
                    .setTimeoutrestart(com.useit.app.framework.helper.UseStringHelper
                            .parseBoolCommon(val));

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingQueuememberEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Queuemember objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Queuemember buildQueuememberModelElement(List aEntryList) {
        Queuemember impl = new QueuememberImpl();
        buildQueuememberModelVaues(aEntryList, impl);
        buildQueuememberModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildQueuememberModelAgg(List entryList, Queuemember impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildQueuememberModelVaues(List entryList, Queuemember impl) {
        String val = null;
        val = findConfValue("tech", entryList);
        if (val != null)
            impl.setTech(val);

        val = findConfValue("dialstring", entryList);
        if (val != null)
            impl.setDialstring(val);

    }

}
