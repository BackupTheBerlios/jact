package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Zaptelchannels<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Zaptelchannels.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Zaptelchannels extends AbstractSimpleDataClass implements IZaptelchannels{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Zaptelchannels
	**/
	public Zaptelchannels(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Zaptelchannels
	**/
	public Zaptelchannels( String adevice, String achannellist){
		super();
	
		this.device = adevice;	
		this.channellist = achannellist;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Zaptelchannels object){
		this.device = object.device;	
		this.channellist = object.channellist;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String device;
	public static final String VALUEID_DEVICE="device" ;

    /**   **/
	protected String channellist;
	public static final String VALUEID_CHANNELLIST="channellist" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_DEVICE.equals(valueid)){
			return true;
		}
		if(VALUEID_CHANNELLIST.equals(valueid)){
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
		if(VALUEID_DEVICE.equals(valueid)){
			setDevice((String)data);
			return;
		}
		if(VALUEID_CHANNELLIST.equals(valueid)){
			setChannellist((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_DEVICE.equals(valueid)){
			return getDevice();
			
		}
		if(VALUEID_CHANNELLIST.equals(valueid)){
			return getChannellist();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getdevice 
	* 
	**/
	public String getDevice(){		return  device;
	}
	/**
	*setdevice 
	*/
	public void setDevice(String adevice){
		if(adevice==null){
		    changed = (this.device!=null);
		    this.device = null;	    
		}else{
			changed = adevice.equals(this.device);
			this.device=adevice;
		}
	}


	/**
	* getchannellist 
	* 
	**/
	public String getChannellist(){		return  channellist;
	}
	/**
	*setchannellist 
	*/
	public void setChannellist(String achannellist){
		if(achannellist==null){
		    changed = (this.channellist!=null);
		    this.channellist = null;	    
		}else{
			changed = achannellist.equals(this.channellist);
			this.channellist=achannellist;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("device=")
		.append(device)
		.append(",")
		.append("channellist=")
		.append(channellist)
    			.append("]");

		return sb.toString();		
	}}