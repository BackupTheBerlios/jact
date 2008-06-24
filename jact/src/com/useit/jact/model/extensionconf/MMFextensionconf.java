/*
 * (c) urs zeidler
 */
package com.useit.jact.model.extensionconf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import com.useit.app.framework.model.dataModel.ModelManagerInterface;


/** 
 * <p> 
 * MMFextensionconf
 * </p> 
 * Created : 04.01.2006 
 * @author urs 
 * @version $Revision: 1.1 $, $Id: MMFextensionconf.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $ 
 */
public class MMFextensionconf implements ModelManagerInterface {
    private static MMFextensionconf instance;
    public static final String MODELNAME="extensionconf";
	public static final String EXTENSION="EXTENSION";
	public static final String CONTEXT="CONTEXT";
	public static final String INCLUDECONTEXT="INCLUDECONTEXT";
	public static final String SWITCH="SWITCH";
	public static final String EXTENSIONCONF="EXTENSIONCONF";
	public static final String GLOBALVARS="GLOBALVARS";
	public static final String INCLUDECONFIGS="INCLUDECONFIGS";
 
    private MMFextensionconf() {
        super();
    }

   /**
     * schreibt die extensionconf config als datei
     * @param data
     * @param string
     * @throws IOException
     * @throws FileNotFoundException
     */
    public void writetoFile(Object data, String filename) throws FileNotFoundException, IOException {
		com.useit.jact.io.extensionconf.ConfWriterImpl wrt = new com.useit.jact.io.extensionconf.ConfWriterImpl();
		wrt.writetoFile(data,filename);
    }
    
    /**
     * gibt die extensionconf config als string zurück
     * @param data
     */
    public String writetoString(Object data) {
		com.useit.jact.io.extensionconf.ConfWriterImpl wrt = new com.useit.jact.io.extensionconf.ConfWriterImpl();
    	return wrt.writetoString(data);
    }
    /**
     * ließ die extensionconf config aus einer Config datei
     * @param selectedFile
     * @return
     * @throws IOException
     * @throws FileNotFoundException
     */
    public Object readConf(File selectedFile) throws FileNotFoundException, IOException {
		com.useit.jact.io.extensionconf.ConfReaderImpl wrt = new com.useit.jact.io.extensionconf.ConfReaderImpl();
    	return wrt.readConf(selectedFile);
    }

    /**
     * schreibt die extensionconf config als XML
     * @param filename
     * @param conf
     */
    public void writeConfXML(String filename, Object conf){
    	com.useit.jact.io.extensionconf.XmlHandlerImpl.writeConf(filename,conf);
    }
    /**
     * ließt die xml datei ein und gibt das extensionconf zurück
     * @param filename
     * @return
     */
    public Object readConfXML(String filename){
    	return com.useit.jact.io.extensionconf.XmlHandlerImpl.readConf(filename);
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
        if(EXTENSION.equals(mapkey)){
            return new ExtensionImpl();
        }
		
        if(CONTEXT.equals(mapkey)){
            return new ContextImpl();
        }
		
        if(INCLUDECONTEXT.equals(mapkey)){
            return new IncludecontextImpl();
        }
		
        if(SWITCH.equals(mapkey)){
            return new SwitchImpl();
        }
		
        if(EXTENSIONCONF.equals(mapkey)){
            return new ExtensionconfImpl();
        }
		
        if(GLOBALVARS.equals(mapkey)){
            return new GlobalvarsImpl();
        }
		
        if(INCLUDECONFIGS.equals(mapkey)){
            return new IncludeconfigsImpl();
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

    public static MMFextensionconf getInstance() {
        if(instance==null)
            instance= new MMFextensionconf();
        
        return instance;
    }

}
