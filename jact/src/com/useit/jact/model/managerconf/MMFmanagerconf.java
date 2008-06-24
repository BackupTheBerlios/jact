/*
 * (c) urs zeidler
 */
package com.useit.jact.model.managerconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFmanagerconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFmanagerconf.java,v 1.3 2006/01/09 10:17:42
 *          urs Exp $
 */
public class MMFmanagerconf implements ModelManagerInterface {
    private static MMFmanagerconf instance;

    public static final String MODELNAME = "managerconf";

    public static final String MANAGERSECTION = "MANAGERSECTION";

    public static final String MANAGERDENY = "MANAGERDENY";

    public static final String MANAGERPERMIT = "MANAGERPERMIT";

    public static final String MANAGERGENERALSECTION = "MANAGERGENERALSECTION";

    private MMFmanagerconf() {
        super();
    }

    /**
     * schreibt die managerconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.managerconf.ConfWriterImpl wrt = new com.useit.jact.io.managerconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die managerconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.managerconf.ConfWriterImpl wrt = new com.useit.jact.io.managerconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die managerconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.managerconf.ConfReaderImpl wrt = new com.useit.jact.io.managerconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die managerconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.managerconf.XmlHandlerImpl.writeConf(filename, conf);
    }

    /**
     * ließt die xml datei ein und gibt das managerconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.managerconf.XmlHandlerImpl.readConf(filename);
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
        if (MANAGERSECTION.equals(mapkey)) {
            return new ManagerSectionImpl();
        }

        if (MANAGERDENY.equals(mapkey)) {
            return new ManagerdenyImpl();
        }

        if (MANAGERPERMIT.equals(mapkey)) {
            return new ManagerpermitImpl();
        }

        if (MANAGERGENERALSECTION.equals(mapkey)) {
            return new ManagergeneralSectionImpl();
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

    public static MMFmanagerconf getInstance() {
        if (instance == null)
            instance = new MMFmanagerconf();

        return instance;
    }

}
