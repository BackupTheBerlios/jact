/*
 * (c) urs zeidler
 */
package com.useit.jact.model.indicationsconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFindicationsconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFindicationsconf.java,v 1.3 2006/01/09
 *          10:17:42 urs Exp $
 */
public class MMFindicationsconf implements ModelManagerInterface {
    private static MMFindicationsconf instance;

    public static final String MODELNAME = "indicationsconf";

    public static final String TONEDEFINITIONS = "TONEDEFINITIONS";

    public static final String CUSTOMTONE = "CUSTOMTONE";

    public static final String INDICATIONSCONF = "INDICATIONSCONF";

    private MMFindicationsconf() {
        super();
    }

    /**
     * schreibt die indicationsconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.indicationsconf.ConfWriterImpl wrt = new com.useit.jact.io.indicationsconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die indicationsconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.indicationsconf.ConfWriterImpl wrt = new com.useit.jact.io.indicationsconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die indicationsconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.indicationsconf.ConfReaderImpl wrt = new com.useit.jact.io.indicationsconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die indicationsconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.indicationsconf.XmlHandlerImpl.writeConf(filename,
                conf);
    }

    /**
     * ließt die xml datei ein und gibt das indicationsconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.indicationsconf.XmlHandlerImpl
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
        if (TONEDEFINITIONS.equals(mapkey)) {
            return new ToneDefinitionsImpl();
        }

        if (CUSTOMTONE.equals(mapkey)) {
            return new CustomToneImpl();
        }

        if (INDICATIONSCONF.equals(mapkey)) {
            return new IndicationsconfImpl();
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

    public static MMFindicationsconf getInstance() {
        if (instance == null)
            instance = new MMFindicationsconf();

        return instance;
    }

}
