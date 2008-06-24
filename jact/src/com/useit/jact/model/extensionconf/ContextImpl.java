package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;

import com.useit.jact.model.types.PbxContext;

/**
 * <p>
 * ContextImpl
 * </p>
 * Created : Thu Dec 29 11:47:16 CET 2005
 * 
 * @author urs
 * @version $Revision: 1.1 $, $Id: ContextImpl.java,v 1.4 2005/12/29 19:14:23
 *          urs Exp $
 */
public class ContextImpl extends Context {
    /**
     * einfacher Konstruktor für Context
     */
    public ContextImpl() {
        super();
       // contexname = new PbxContext("");
    }

    /**
     * komplexer Konstruktor für Context
     */
    public ContextImpl(PbxContext acontexname, String aignorepat) {
        super();

       // this.contexname = acontexname;
        this.ignorepat = aignorepat;
    }
    
    public static final String VALUEID_CONTEXNAME="contexname" ;

    /**
     * überprüft ob es das value in dem Objekt gibt
     * @param valueid
     * @return
     */
    public static boolean hasValue(String valueid){
        if(VALUEID_CONTEXNAME.equals(valueid)){
            return true;
        }
        if(VALUEID_IGNOREPAT.equals(valueid)){
            return true;
        }
        return false;
    }
    
    /**
     * setzt einen Wert per valueid
     * @param valueid
     * @param data
     */
    public void setByValue(String valueid,Object data){
        if(VALUEID_CONTEXNAME.equals(valueid)){
            if(data instanceof String){
                setContextname((String)data);
                return;
            }
            //setContexname((PbxContext)data);
            return;
        }
        if(VALUEID_IGNOREPAT.equals(valueid)){
            setIgnorepat((String)data);
            return;
        }
    }
    /**
     * gibt einen Wert by Vauleid zurück
     * @param valueid
     * @return
     */
    public Object getByValue(String valueid){
        if(VALUEID_CONTEXNAME.equals(valueid)){
            return getContextname();
            
        }
        if(VALUEID_IGNOREPAT.equals(valueid)){
            return getIgnorepat();
            
        }
        
        return null;
    }
    
//    /**   **/
//   // protected PbxContext contexname;
//
//    public PbxContext getContexname() {
//        return contexname;
//    }
//    public void setContexname(PbxContext context) {
//        contexname = context;
//        
//    }
}