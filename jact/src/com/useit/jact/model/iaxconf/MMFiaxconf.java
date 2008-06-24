/*
 * (c) urs zeidler
 */
package com.useit.jact.model.iaxconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;

/**
 * <p>
 * MMFiaxconf
 * </p>
 * Created : 04.01.2006
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: MMFiaxconf.java,v 1.3 2006/01/09 10:17:41 urs
 *          Exp $
 */
public class MMFiaxconf implements ModelManagerInterface {
    private static MMFiaxconf instance;

    public static final String MODELNAME = "iaxconf";

    public static final String IAXJITTER = "IAXJITTER";

    public static final String IAXREGISTER = "IAXREGISTER";

    public static final String IAXDENY = "IAXDENY";

    public static final String IAXPERMIT = "IAXPERMIT";

    public static final String IAXPEER = "IAXPEER";

    public static final String IAXGENERAL = "IAXGENERAL";

    private MMFiaxconf() {
        super();
    }

    /**
     * schreibt die iaxconf config als datei
     * 
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename)
            throws FileNotFoundException, IOException {
        com.useit.jact.io.iaxconf.ConfWriterImpl wrt = new com.useit.jact.io.iaxconf.ConfWriterImpl();
        wrt.writetoFile(data, filename);
    }

    /**
     * gibt die iaxconf config als string zurück
     * 
     * @param data
     */
    public String writetoString(Object data) {
        com.useit.jact.io.iaxconf.ConfWriterImpl wrt = new com.useit.jact.io.iaxconf.ConfWriterImpl();
        return wrt.writetoString(data);
    }

    /**
     * ließ die iaxconf config aus einer Config datei
     * 
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException,
            IOException {
        com.useit.jact.io.iaxconf.ConfReaderImpl wrt = new com.useit.jact.io.iaxconf.ConfReaderImpl();
        return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die iaxconf config als XML
     * 
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf) {
        com.useit.jact.io.iaxconf.XmlHandlerImpl.writeConf(filename, conf);
    }

    /**
     * ließt die xml datei ein und gibt das iaxconf zurück
     * 
     * @param filename
     * @return
     */
    public Object readConfXML(String filename) {
        return com.useit.jact.io.iaxconf.XmlHandlerImpl.readConf(filename);
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
        if (IAXJITTER.equals(mapkey)) {
            return new IaxjitterImpl();
        }

        if (IAXREGISTER.equals(mapkey)) {
            return new IaxregisterImpl();
        }

        if (IAXDENY.equals(mapkey)) {
            return new IaxdenyImpl();
        }

        if (IAXPERMIT.equals(mapkey)) {
            return new IaxpermitImpl();
        }

        if (IAXPEER.equals(mapkey)) {
            return new IaxpeerImpl();
        }

        if (IAXGENERAL.equals(mapkey)) {
            return new IaxgeneralImpl();
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

    public static MMFiaxconf getInstance() {
        if (instance == null)
            instance = new MMFiaxconf();

        return instance;
    }

}
