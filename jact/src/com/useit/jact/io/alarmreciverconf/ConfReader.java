/*
 * (c) urs zeidler
 */
package com.useit.jact.io.alarmreciverconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.alarmreciverconf.Alarmreceiverconf;
import com.useit.jact.model.alarmreciverconf.AlarmreceiverconfImpl;

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
    protected List getWorkingAlarmreceiverconfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Alarmreceiverconf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Alarmreceiverconf buildAlarmreceiverconfModelElement(
            List aEntryList) {
        Alarmreceiverconf impl = new AlarmreceiverconfImpl();
        buildAlarmreceiverconfModelVaues(aEntryList, impl);
        buildAlarmreceiverconfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildAlarmreceiverconfModelAgg(List entryList,
            Alarmreceiverconf impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildAlarmreceiverconfModelVaues(List entryList,
            Alarmreceiverconf impl) {
        String val = null;
        val = findConfValue("timestampformat", entryList);
        if (val != null)
            impl.setTimestampformat(val);

        val = findConfValue("eventcmd", entryList);
        if (val != null)
            impl.setEventcmd(val);

        val = findConfValue("eventspooldir", entryList);
        if (val != null)
            impl.setEventspooldir(val);

        val = findConfValue("logindividualevents", entryList);
        if (val != null)
            impl.setLogindividualevents(val);

        val = findConfValue("fdtimeout", entryList);
        if (val != null)
            impl.setFdtimeout(new Integer(val));

        val = findConfValue("sdtimeout", entryList);
        if (val != null)
            impl.setSdtimeout(new Integer(val));

        val = findConfValue("loudness", entryList);
        if (val != null)
            impl.setLoudness(new Integer(val));

        val = findConfValue("dbfamily", entryList);
        if (val != null)
            impl.setDbfamily(val);

    }

}
