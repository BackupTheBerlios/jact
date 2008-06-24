/*
 * (c) urs zeidler
 */
package com.useit.jact.io.meetmeconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.useit.jact.io.AbstractConfReader;
import com.useit.jact.model.meetmeconf.Meetmeconf;
import com.useit.jact.model.meetmeconf.MeetmeconfImpl;
import com.useit.jact.model.meetmeconf.Meetmerooms;
import com.useit.jact.model.meetmeconf.MeetmeroomsImpl;

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
    protected List getWorkingMeetmeroomsEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Meetmerooms objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Meetmerooms buildMeetmeroomsModelElement(List aEntryList) {
        Meetmerooms impl = new MeetmeroomsImpl();
        buildMeetmeroomsModelVaues(aEntryList, impl);
        buildMeetmeroomsModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMeetmeroomsModelAgg(List entryList, Meetmerooms impl) {

        // aggregate schreiben
        // maps schreiben
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMeetmeroomsModelVaues(List entryList, Meetmerooms impl) {
        String val = null;
        val = findConfValue("confno", entryList);
        if (val != null)
            impl.setConfno(val);

        val = findConfValue("pincode", entryList);
        if (val != null)
            impl.setPincode(val);

        val = findConfValue("adminpin", entryList);
        if (val != null)
            impl.setAdminpin(val);

    }

    /**
     * gibt gelegenheit die entry liste neu zu bestimmen
     * 
     * @return
     */
    protected List getWorkingMeetmeconfEntryList() {
        return entrylist;

    }

    /**
     * erzeugt ein Meetmeconf objekt und ließt die entry list dafür ein
     * 
     * @param aEntryList
     * @return
     */
    protected Meetmeconf buildMeetmeconfModelElement(List aEntryList) {
        Meetmeconf impl = new MeetmeconfImpl();
        buildMeetmeconfModelVaues(aEntryList, impl);
        buildMeetmeconfModelAgg(aEntryList, impl);

        return impl;
    }

    /**
     * @param entryList
     * @param impl
     */
    protected void buildMeetmeconfModelAgg(List entryList, Meetmeconf impl) {

        // aggregate schreiben
        // maps schreiben
        // MeetmeroomsMap
        for (Iterator iter = impl.getMeetmeroomsMap().iterator(); iter
                .hasNext();) {
            Meetmerooms aMeetmeroomsM = buildMeetmeroomsModelElement(entryList);
            impl.addMeetmerooms(aMeetmeroomsM);
            // Meetmerooms mobj = (Meetmerooms) iter.next();
            // writeMeetmerooms(strB,mobj);
        }
    }

    /**
     * füllt das object mit den werten der entrylist
     * 
     * @param entryList
     * @param impl
     */
    protected void buildMeetmeconfModelVaues(List entryList, Meetmeconf impl) {
        String val = null;
        val = findConfValue("fileid", entryList);
        if (val != null)
            impl.setFileid(val);

    }

}
