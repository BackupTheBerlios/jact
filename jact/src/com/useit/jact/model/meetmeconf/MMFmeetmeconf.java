/*
 * (c) urs zeidler
 */
package com.useit.jact.model.meetmeconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFmeetmeconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFmeetmeconf.java,v 1.3 2006/01/09 10:17:46
 *          urs Exp $
 */
public class MMFmeetmeconf implements ModelManagerInterface {
    private static MMFmeetmeconf instance;

    public static final String MODELNAME = "meetmeconf";

    public static final String MEETMECONF = "MEETMECONF";

    public static final String MEETMEROOMS = "MEETMEROOMS";

    private MMFmeetmeconf() {
        super();
    }

    /**
     * schreibt die meetmeconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.meetmeconf.ConfWriterImpl wrt = new com.useit.jact.io.meetmeconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die meetmeconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.meetmeconf.ConfWriterImpl wrt = new com.useit.jact.io.meetmeconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die meetmeconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.meetmeconf.ConfReaderImpl wrt = new com.useit.jact.io.meetmeconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die meetmeconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.meetmeconf.XmlHandlerImpl.writeConf(filename, conf);
    }

    /**
     * ließt die xml datei ein und gibt das meetmeconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.meetmeconf.XmlHandlerImpl.readConf(filename);
    }

    /**
     * die statische model id
     * 
     * @return
     */
    public String getMODELNAME() {
        return MODELNAME;
    }

    /*
     * (Kein Javadoc)
     * 
     * @see com.useit.app.framework.model.dataModel.ModelManagerInterface#newObject(java.lang.String)
     */
    public Object newObject(String mapkey) {
        if (MEETMECONF.equals(mapkey)) {
            return new MeetmeconfImpl();
        }

        if (MEETMEROOMS.equals(mapkey)) {
            return new MeetmeroomsImpl();
        }

        return null;
    }

    /*
     * (Kein Javadoc)
     * 
     * @see com.useit.app.framework.model.dataModel.ModelManagerInterface#addObject(java.lang.String,
     *      java.util.Map, java.lang.Object)
     */
    public void addObject(String mapkey, Map map, Object object) {
    }

    /*
     * private Integer newInt(Set set) { Integer test = new Integer(set.size());
     * while (set.contains(test)) { test = new Integer(test.intValue()+1);
     *  } return test; }
     */

    public static MMFmeetmeconf getInstance() {
        if (instance == null)
            instance = new MMFmeetmeconf();

        return instance;
    }

}
