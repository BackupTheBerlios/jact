package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ZapBarge<br>
 * Barges in on a specified zap channel or prompts if one is not specified. Returns -1 when caller user hangs up and is independent of the state of the channel being monitored.
 * </p>
 * Created : Sun Jul 09 18:50:25 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapBarge.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class ZapBarge extends PbxApplication implements IZapBarge{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ZapBarge
	**/
	public ZapBarge(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ZapBarge
	**/
	public ZapBarge( String achannel){
		super();
	
		this.channel = achannel;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ZapBarge object){
		this.channel = object.channel;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String channel;
	public static final String VALUEID_CHANNEL="channel" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CHANNEL.equals(valueid)){
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
		if(VALUEID_CHANNEL.equals(valueid)){
			setChannel((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CHANNEL.equals(valueid)){
			return getChannel();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getchannel 
	* 
	**/
	public String getChannel(){		return  channel;
	}
	/**
	*setchannel 
	*/
	public void setChannel(String achannel){
		if(achannel==null){
		    changed = (this.channel!=null);
		    this.channel = null;	    
		}else{
			changed = achannel.equals(this.channel);
			this.channel=achannel;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ZapBarge, ")		
		//.append("channel=")
		.append(channel)
    			.append("");

		return sb.toString();		
	}
}