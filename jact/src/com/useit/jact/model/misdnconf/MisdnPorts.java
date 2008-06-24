package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;
import com.useit.jact.model.types.MisdnPortOptions;


/**
 * <p>
 * MisdnPorts<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:01 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MisdnPorts.java,v 1.1 2008/06/24 20:45:14 urszeidler Exp $
 */
 public  class MisdnPorts extends AbstractSimpleDataClass implements IMisdnPorts{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MisdnPorts
	**/
	public MisdnPorts(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MisdnPorts
	**/
	public MisdnPorts( Integer aportN, MisdnPortOptions aportOption){
		super();
	
		this.portN = aportN;	
		this.portOption = aportOption;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MisdnPorts object){
		this.portN = object.portN;	
		this.portOption = object.portOption;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected Integer portN;
	public static final String VALUEID_PORTN="portn" ;

    /**   **/
	protected MisdnPortOptions portOption;
	public static final String VALUEID_PORTOPTION="portoption" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_PORTN.equals(valueid)){
			return true;
		}
		if(VALUEID_PORTOPTION.equals(valueid)){
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
		if(VALUEID_PORTN.equals(valueid)){
			if(data instanceof String){
		        setPortN(new Integer((String)data));
		        return;
		    }
			setPortN((Integer)data);
			return;
		}
		if(VALUEID_PORTOPTION.equals(valueid)){
			if(data instanceof String){
		        setPortOption(new MisdnPortOptions((String)data));
		        return;
		    }
			setPortOption((MisdnPortOptions)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_PORTN.equals(valueid)){
			return getPortN();
			
		}
		if(VALUEID_PORTOPTION.equals(valueid)){
			return getPortOption();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getportN 
	* 
	**/
	public Integer getPortN(){		return  portN;
	}
	/**
	*setportN 
	*/
	public void setPortN(Integer aportN){
		if(aportN==null){
		    changed = (this.portN!=null);
		    this.portN = null;	    
		}else{
			changed = aportN.equals(this.portN);
			this.portN=aportN;
		}
	}


	/**
	* getportOption 
	* 
	**/
	public MisdnPortOptions getPortOption(){		return  portOption;
	}
	/**
	*setportOption 
	*/
	public void setPortOption(MisdnPortOptions aportOption){
		if(aportOption==null){
		    changed = (this.portOption!=null);
		    this.portOption = null;	    
		}else{
			changed = aportOption.equals(this.portOption);
			this.portOption=aportOption;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("portN=")
		.append(portN)
		.append(",")
		.append("portOption=")
		.append(portOption)
    			.append("]");

		return sb.toString();		
	}}