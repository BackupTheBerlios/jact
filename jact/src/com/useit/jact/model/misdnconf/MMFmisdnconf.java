/*
 * (c) urs zeidler
 */
package com.useit.jact.model.misdnconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFmisdnconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFmisdnconf.java,v 1.3 2006/01/09 10:17:42
 *          urs Exp $
 */
public class MMFmisdnconf implements ModelManagerInterface {
    private static MMFmisdnconf instance;

    public static final String MODELNAME = "misdnconf";

    public static final String MISDNCONF = "MISDNCONF";

    public static final String MISDNCRYPTKEY = "MISDNCRYPTKEY";

    public static final String MISDNSECTIONS = "MISDNSECTIONS";

    public static final String MISDNPORTS = "MISDNPORTS";

    private MMFmisdnconf() {
        super();
    }

    /**
     * schreibt die misdnconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.misdnconf.ConfWriterImpl wrt = new com.useit.jact.io.misdnconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die misdnconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.misdnconf.ConfWriterImpl wrt = new com.useit.jact.io.misdnconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die misdnconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.misdnconf.ConfReaderImpl wrt = new com.useit.jact.io.misdnconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die misdnconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.misdnconf.XmlHandlerImpl.writeConf(filename, conf);
    }

    /**
     * ließt die xml datei ein und gibt das misdnconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.misdnconf.XmlHandlerImpl.readConf(filename);
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
        if (MISDNCONF.equals(mapkey)) {
            return new MisdnconfImpl();
        }

        if (MISDNCRYPTKEY.equals(mapkey)) {
            return new MisdnCryptkeyImpl();
        }

        if (MISDNSECTIONS.equals(mapkey)) {
            return new MisdnSectionsImpl();
        }

        if (MISDNPORTS.equals(mapkey)) {
            return new MisdnPortsImpl();
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

    public static MMFmisdnconf getInstance() {
        if (instance == null)
            instance = new MMFmisdnconf();

        return instance;
    }

}
