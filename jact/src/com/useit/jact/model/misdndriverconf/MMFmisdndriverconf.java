/*
 * (c) urs zeidler
 */
package com.useit.jact.model.misdndriverconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFmisdndriverconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFmisdndriverconf.java,v 1.3 2006/01/09
 *          10:17:46 urs Exp $
 */
public class MMFmisdndriverconf implements ModelManagerInterface {
    private static MMFmisdndriverconf instance;

    public static final String MODELNAME = "misdndriverconf";

    public static final String MISDNCARDPORTS = "MISDNCARDPORTS";

    public static final String MISDNCARDS = "MISDNCARDS";

    public static final String MISDNDRIVERCONF = "MISDNDRIVERCONF";

    private MMFmisdndriverconf() {
        super();
    }

    /**
     * schreibt die misdndriverconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.misdndriverconf.ConfWriterImpl wrt = new com.useit.jact.io.misdndriverconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die misdndriverconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.misdndriverconf.ConfWriterImpl wrt = new com.useit.jact.io.misdndriverconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die misdndriverconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.misdndriverconf.ConfReaderImpl wrt = new com.useit.jact.io.misdndriverconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die misdndriverconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.misdndriverconf.XmlHandlerImpl.writeConf(filename,
                conf);
    }

    /**
     * ließt die xml datei ein und gibt das misdndriverconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.misdndriverconf.XmlHandlerImpl
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
        if (MISDNCARDPORTS.equals(mapkey)) {
            return new MisdncardPortsImpl();
        }

        if (MISDNCARDS.equals(mapkey)) {
            return new MisdnCardsImpl();
        }

        if (MISDNDRIVERCONF.equals(mapkey)) {
            return new MisdnDriverConfImpl();
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

    public static MMFmisdndriverconf getInstance() {
        if (instance == null)
            instance = new MMFmisdndriverconf();

        return instance;
    }

}
