/*
 * (c) urs zeidler
 */
package com.useit.jact.model.agentconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFagentconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFagentconf.java,v 1.3 2006/01/09 10:17:42
 *          urs Exp $
 */
public class MMFagentconf implements ModelManagerInterface {
    private static MMFagentconf instance;

    public static final String MODELNAME = "agentconf";

    public static final String AGENTS = "AGENTS";

    public static final String AGENTSCONF = "AGENTSCONF";

    public static final String AGENTSRECORDING = "AGENTSRECORDING";

    private MMFagentconf() {
        super();
    }

    /**
     * schreibt die agentconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.agentconf.ConfWriterImpl wrt = new com.useit.jact.io.agentconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die agentconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.agentconf.ConfWriterImpl wrt = new com.useit.jact.io.agentconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die agentconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.agentconf.ConfReaderImpl wrt = new com.useit.jact.io.agentconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die agentconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.agentconf.XmlHandlerImpl.writeConf(filename, conf);
    }

    /**
     * ließt die xml datei ein und gibt das agentconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.agentconf.XmlHandlerImpl.readConf(filename);
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
        if (AGENTS.equals(mapkey)) {
            return new AgentsImpl();
        }

        if (AGENTSCONF.equals(mapkey)) {
            return new AgentsconfImpl();
        }

        if (AGENTSRECORDING.equals(mapkey)) {
            return new AgentsrecordingImpl();
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

    public static MMFagentconf getInstance() {
        if (instance == null)
            instance = new MMFagentconf();

        return instance;
    }

}
