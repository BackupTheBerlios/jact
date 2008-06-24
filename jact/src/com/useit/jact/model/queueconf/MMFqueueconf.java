/*
 * (c) urs zeidler
 */
package com.useit.jact.model.queueconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFqueueconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFqueueconf.java,v 1.4 2006/01/14 15:44:47
 *          urs Exp $
 */
public class MMFqueueconf implements ModelManagerInterface {
    private static MMFqueueconf instance;

    public static final String MODELNAME = "queueconf";

    public static final String QUEUEGENERAL = "QUEUEGENERAL";

    public static final String QUEUESECTION = "QUEUESECTION";

    public static final String QUEUEMEMBER = "QUEUEMEMBER";

    private MMFqueueconf() {
        super();
    }

    /**
     * schreibt die queueconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.queueconf.ConfWriterImpl wrt = new com.useit.jact.io.queueconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die queueconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.queueconf.ConfWriterImpl wrt = new com.useit.jact.io.queueconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die queueconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.queueconf.ConfReaderImpl wrt = new com.useit.jact.io.queueconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die queueconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.queueconf.XmlHandlerImpl.writeConf(filename, conf);
    }

    /**
     * ließt die xml datei ein und gibt das queueconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.queueconf.XmlHandlerImpl.readConf(filename);
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
        if (QUEUEGENERAL.equals(mapkey)) {
            return new QueuegeneralImpl();
        }

        if (QUEUESECTION.equals(mapkey)) {
            return new QueuesectionImpl();
        }

        if (QUEUEMEMBER.equals(mapkey)) {
            return new QueuememberImpl();
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

    public static MMFqueueconf getInstance() {
        if (instance == null)
            instance = new MMFqueueconf();

        return instance;
    }

}
