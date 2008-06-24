/*
 * (c) urs zeidler
 */
package com.useit.jact.model.zaptelconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFzaptelconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFzaptelconf.java,v 1.3 2006/01/09 10:17:46
 *          urs Exp $
 */
public class MMFzaptelconf implements ModelManagerInterface {
    private static MMFzaptelconf instance;

    public static final String MODELNAME = "zaptelconf";

    public static final String ZAPTELCHANNELS = "ZAPTELCHANNELS";

    public static final String ZAPTELTONEZONE = "ZAPTELTONEZONE";

    public static final String ZAPTELSPAN = "ZAPTELSPAN";

    public static final String ZAPTELDYNAMICSPAN = "ZAPTELDYNAMICSPAN";

    public static final String ZAPTELCONF = "ZAPTELCONF";

    private MMFzaptelconf() {
        super();
    }

    /**
     * schreibt die zaptelconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.zaptelconf.ConfWriterImpl wrt = new com.useit.jact.io.zaptelconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die zaptelconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.zaptelconf.ConfWriterImpl wrt = new com.useit.jact.io.zaptelconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die zaptelconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.zaptelconf.ConfReaderImpl wrt = new com.useit.jact.io.zaptelconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die zaptelconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.zaptelconf.XmlHandlerImpl.writeConf(filename, conf);
    }

    /**
     * ließt die xml datei ein und gibt das zaptelconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.zaptelconf.XmlHandlerImpl.readConf(filename);
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
        if (ZAPTELCHANNELS.equals(mapkey)) {
            return new ZaptelchannelsImpl();
        }

        if (ZAPTELTONEZONE.equals(mapkey)) {
            return new ZapteltonezoneImpl();
        }

        if (ZAPTELSPAN.equals(mapkey)) {
            return new ZaptelspanImpl();
        }

        if (ZAPTELDYNAMICSPAN.equals(mapkey)) {
            return new ZapteldynamicspanImpl();
        }

        if (ZAPTELCONF.equals(mapkey)) {
            return new ZaptelconfImpl();
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

    public static MMFzaptelconf getInstance() {
        if (instance == null)
            instance = new MMFzaptelconf();

        return instance;
    }

}
