/*
 * (c) urs zeidler
 */
package com.useit.jact.model.musiconholdconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFmusiconholdconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFmusiconholdconf.java,v 1.3 2006/01/09
 *          10:17:46 urs Exp $
 */
public class MMFmusiconholdconf implements ModelManagerInterface {
    private static MMFmusiconholdconf instance;

    public static final String MODELNAME = "musiconholdconf";

    public static final String MOHCLASSES = "MOHCLASSES";

    public static final String MUSIC_ON_HOLDCONF = "MUSIC_ON_HOLDCONF";

    private MMFmusiconholdconf() {
        super();
    }

    /**
     * schreibt die musiconholdconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.musiconholdconf.ConfWriterImpl wrt = new com.useit.jact.io.musiconholdconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die musiconholdconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.musiconholdconf.ConfWriterImpl wrt = new com.useit.jact.io.musiconholdconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die musiconholdconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.musiconholdconf.ConfReaderImpl wrt = new com.useit.jact.io.musiconholdconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die musiconholdconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.musiconholdconf.XmlHandlerImpl.writeConf(filename,
                conf);
    }

    /**
     * ließt die xml datei ein und gibt das musiconholdconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.musiconholdconf.XmlHandlerImpl
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
        if (MOHCLASSES.equals(mapkey)) {
            return new MohClassesImpl();
        }

        if (MUSIC_ON_HOLDCONF.equals(mapkey)) {
            return new Music_on_HoldConfImpl();
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

    public static MMFmusiconholdconf getInstance() {
        if (instance == null)
            instance = new MMFmusiconholdconf();

        return instance;
    }

}
