/*
 * (c) urs zeidler
 */
package com.useit.jact.model.alarmreciverconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFalarmreciverconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFalarmreciverconf.java,v 1.3 2006/01/09
 *          10:17:35 urs Exp $
 */
public class MMFalarmreciverconf implements ModelManagerInterface {
    private static MMFalarmreciverconf instance;

    public static final String MODELNAME = "alarmreciverconf";

    public static final String ALARMRECEIVERCONF = "ALARMRECEIVERCONF";

    private MMFalarmreciverconf() {
        super();
    }

    /**
     * schreibt die alarmreciverconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.alarmreciverconf.ConfWriterImpl wrt = new com.useit.jact.io.alarmreciverconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die alarmreciverconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.alarmreciverconf.ConfWriterImpl wrt = new com.useit.jact.io.alarmreciverconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die alarmreciverconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.alarmreciverconf.ConfReaderImpl wrt = new com.useit.jact.io.alarmreciverconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die alarmreciverconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.alarmreciverconf.XmlHandlerImpl.writeConf(filename,
                conf);
    }

    /**
     * ließt die xml datei ein und gibt das alarmreciverconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.alarmreciverconf.XmlHandlerImpl
                .readConf(filename);
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
        if (ALARMRECEIVERCONF.equals(mapkey)) {
            return new AlarmreceiverconfImpl();
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

    public static MMFalarmreciverconf getInstance() {
        if (instance == null)
            instance = new MMFalarmreciverconf();

        return instance;
    }

}
