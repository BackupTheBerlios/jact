/*
 * (c) urs zeidler
 */
package com.useit.jact.model.featureconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFfeatureconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFfeatureconf.java,v 1.3 2006/01/09 10:17:46
 *          urs Exp $
 */
public class MMFfeatureconf implements ModelManagerInterface {
    private static MMFfeatureconf instance;

    public static final String MODELNAME = "featureconf";

    public static final String FEATUREMAP = "FEATUREMAP";

    public static final String FEATURESCONF = "FEATURESCONF";

    private MMFfeatureconf() {
        super();
    }

    /**
     * schreibt die featureconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.featureconf.ConfWriterImpl wrt = new com.useit.jact.io.featureconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die featureconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.featureconf.ConfWriterImpl wrt = new com.useit.jact.io.featureconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die featureconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.featureconf.ConfReaderImpl wrt = new com.useit.jact.io.featureconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die featureconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.featureconf.XmlHandlerImpl.writeConf(filename, conf);
    }

    /**
     * ließt die xml datei ein und gibt das featureconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.featureconf.XmlHandlerImpl.readConf(filename);
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
        if (FEATUREMAP.equals(mapkey)) {
            return new FeaturemapImpl();
        }

        if (FEATURESCONF.equals(mapkey)) {
            return new FeaturesconfImpl();
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

    public static MMFfeatureconf getInstance() {
        if (instance == null)
            instance = new MMFfeatureconf();

        return instance;
    }

}
