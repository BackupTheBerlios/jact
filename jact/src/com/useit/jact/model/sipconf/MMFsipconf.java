/*
 * (c) urs zeidler
 */
package com.useit.jact.model.sipconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;


/** 
 * <p> 
 * MMFsipconf
 * </p> 
 * Created : 04.01.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: MMFsipconf.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $ 
 */
public class MMFsipconf implements ModelManagerInterface {
    private static MMFsipconf instance;
    public static final String MODELNAME="sipconf";
	public static final String SIPREGISTER="SIPREGISTER";
	public static final String SIPAUTH="SIPAUTH";
	public static final String SIPCONF="SIPCONF";
	public static final String SIPPEERS="SIPPEERS";
	public static final String SIPGENERAL="SIPGENERAL";
 
    private MMFsipconf() {
        super();
    }

   /**
     * schreibt die sipconf config als datei
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename) throws FileNotFoundException, IOException {
		com.useit.jact.io.sipconf.ConfWriterImpl wrt = new com.useit.jact.io.sipconf.ConfWriterImpl();
		wrt.writetoFile(data,filename);
    }
    
    /**
     * gibt die sipconf config als string zurück
     * @param data
     */
    public String writetoString(Object data) {
		com.useit.jact.io.sipconf.ConfWriterImpl wrt = new com.useit.jact.io.sipconf.ConfWriterImpl();
    	return wrt.writetoString(data);
    }
    /**
     * ließ die sipconf config aus einer Config datei
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException, IOException {
		com.useit.jact.io.sipconf.ConfReaderImpl wrt = new com.useit.jact.io.sipconf.ConfReaderImpl();
    	return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die sipconf config als XML
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf){
    	com.useit.jact.io.sipconf.XmlHandlerImpl.writeConf(filename,conf);
    }
    /**
     * ließt die xml datei ein und gibt das sipconf zurück
     * @param filename
     * @return
     */
    public Object readConfXML(String filename){
    	return com.useit.jact.io.sipconf.XmlHandlerImpl.readConf(filename);
    }
    /**
     * die statische model id 
     * @return
     */
    public String getMODELNAME() {
        return MODELNAME;
    }
    
    /* (Kein Javadoc)
     * @see com.useit.app.framework.model.dataModel.ModelManagerInterface#newObject(java.lang.String)
     */
    public Object newObject(String mapkey) {
        if(SIPREGISTER.equals(mapkey)){
            return new SipregisterImpl();
        }
		
        if(SIPAUTH.equals(mapkey)){
            return new SipauthImpl();
        }
		
        if(SIPCONF.equals(mapkey)){
            return new SipConfImpl();
        }
		
        if(SIPPEERS.equals(mapkey)){
            return new SippeersImpl();
        }
		
        if(SIPGENERAL.equals(mapkey)){
            return new SipgeneralImpl();
        }
		
        return null;
    }

    /* (Kein Javadoc)
     * @see com.useit.app.framework.model.dataModel.ModelManagerInterface#addObject(java.lang.String, java.util.Map, java.lang.Object)
     */
    public void addObject(String mapkey, Map map, Object object) {
    }
    /*
   private Integer newInt(Set set) {
        Integer test = new Integer(set.size());
        while (set.contains(test)) {
            test = new Integer(test.intValue()+1);
            
        }
        return test;
    }
     */

    public static MMFsipconf getInstance() {
        if(instance==null)
            instance= new MMFsipconf();
        
        return instance;
    }

}
