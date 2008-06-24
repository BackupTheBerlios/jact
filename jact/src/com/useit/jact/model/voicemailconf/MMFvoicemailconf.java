/*
 * (c) urs zeidler
 */
package com.useit.jact.model.voicemailconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFvoicemailconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFvoicemailconf.java,v 1.4 2006/01/14
 *          15:00:13 urs Exp $
 */
public class MMFvoicemailconf implements ModelManagerInterface {
    private static MMFvoicemailconf instance;

    public static final String MODELNAME = "voicemailconf";

    public static final String VOICEMAILGENERAL = "VOICEMAILGENERAL";

    public static final String VOICEMAILCONF = "VOICEMAILCONF";

    public static final String VOICEMAILCONTEXT = "VOICEMAILCONTEXT";

    public static final String ZONEMESSAGES = "ZONEMESSAGES";

    public static final String VOICEMAILCONTEXTENTRY = "VOICEMAILCONTEXTENTRY";

    private MMFvoicemailconf() {
        super();
    }

    /**
     * schreibt die voicemailconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.voicemailconf.ConfWriterImpl wrt = new com.useit.jact.io.voicemailconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die voicemailconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.voicemailconf.ConfWriterImpl wrt = new com.useit.jact.io.voicemailconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die voicemailconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.voicemailconf.ConfReaderImpl wrt = new com.useit.jact.io.voicemailconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die voicemailconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.voicemailconf.XmlHandlerImpl
                .writeConf(filename, conf);
    }

    /**
     * ließt die xml datei ein und gibt das voicemailconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.voicemailconf.XmlHandlerImpl
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
        if (VOICEMAILGENERAL.equals(mapkey)) {
            return new VoicemailgeneralImpl();
        }

        if (VOICEMAILCONF.equals(mapkey)) {
            return new VoicemailConfImpl();
        }

        if (VOICEMAILCONTEXT.equals(mapkey)) {
            return new VoicemailcontextImpl();
        }

        if (ZONEMESSAGES.equals(mapkey)) {
            return new ZonemessagesImpl();
        }

        if (VOICEMAILCONTEXTENTRY.equals(mapkey)) {
            return new VoicemailcontextentryImpl();
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

    public static MMFvoicemailconf getInstance() {
        if (instance == null)
            instance = new MMFvoicemailconf();

        return instance;
    }

}
