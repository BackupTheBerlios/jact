package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Caller_ID_Options<br>
 * caller id
 * </p>
 * Created : Fri May 26 14:32:08 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Caller_ID_Options.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Caller_ID_Options extends AbstractSimpleDataClass implements ICaller_ID_Options{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Caller_ID_Options
	**/
	public Caller_ID_Options(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Caller_ID_Options
	**/
	public Caller_ID_Options( String acallerid, Boolean ausecallerid, Boolean ahidecallerid, Boolean arestrictcid, Boolean ausecallingpres){
		super();
	
		this.callerid = acallerid;	
		this.usecallerid = ausecallerid;	
		this.hidecallerid = ahidecallerid;	
		this.restrictcid = arestrictcid;	
		this.usecallingpres = ausecallingpres;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Caller_ID_Options object){
		this.callerid = object.callerid;	
		this.usecallerid = object.usecallerid;	
		this.hidecallerid = object.hidecallerid;	
		this.restrictcid = object.restrictcid;	
		this.usecallingpres = object.usecallingpres;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Sets the Caller ID string to forward to the recipient when calls come in from this channel. You normally use this to set the Caller ID for handsets. Specify the Caller ID name in double quotation marks, followed by the Caller ID number in <> symbols. For trunk lines, set to "asreceived" to pass the received Caller ID forward.   callerid="Mark Spencer" <256 428-6000>   callerid=   callerid=asreceived Important Note: :Caller ID can only be transmitted to the public phone network with supported hardware, such as a PRI. It is not possible to set external caller ID on analog lines. **/
	protected String callerid;
	public static final String VALUEID_CALLERID="callerid" ;

    /**  For handsets, this option will cause Asterisk to send Caller ID data to the handset when ringing it. For trunk lines, this option causes Asterisk to look for Caller ID on incoming calls. Default:yes.    usecallerid=no **/
	protected Boolean usecallerid;
	public static final String VALUEID_USECALLERID="usecallerid" ;

    /**  (Not for FXO trunk lines) For PRI channels, this will stop the sending of Caller ID on outgoing calls. For FXS handsets, this will stop Asterisk from sending this channel's Caller ID information to the called party when you make a call using this handset. FXS handset users may enable or disable sending of their Caller ID for the current call only by lifting the handset and dialing *82 (enable) or *67 (disable); you will then get a "dialrecall" tone whereupon you can dial the number of the extension you wish to contact. Default:no.    hidecallerid=yes **/
	protected Boolean hidecallerid;
	public static final String VALUEID_HIDECALLERID="hidecallerid" ;

    /**  (PRI channels only) This option has effect only when hidecallerid=no. If hidecallerid=no and restrictcid=yes, Asterisk will prevent the sending of the Caller ID data as a presentation number when making outgoing calls (ANI data is still sent). Default:no.    restrictcid=yes **/
	protected Boolean restrictcid;
	public static final String VALUEID_RESTRICTCID="restrictcid" ;

    /**  (PRI channels only) Whether or not to use the Caller ID presentation for the outgoing call that the calling switch is sending. See also the CallingPres command.    usecallingpres=no **/
	protected Boolean usecallingpres;
	public static final String VALUEID_USECALLINGPRES="usecallingpres" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CALLERID.equals(valueid)){
			return true;
		}
		if(VALUEID_USECALLERID.equals(valueid)){
			return true;
		}
		if(VALUEID_HIDECALLERID.equals(valueid)){
			return true;
		}
		if(VALUEID_RESTRICTCID.equals(valueid)){
			return true;
		}
		if(VALUEID_USECALLINGPRES.equals(valueid)){
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
		if(VALUEID_CALLERID.equals(valueid)){
			setCallerid((String)data);
			return;
		}
		if(VALUEID_USECALLERID.equals(valueid)){
			if(data instanceof String){
		        setUsecallerid(new Boolean((String)data));
		        return;
		    }
			setUsecallerid((Boolean)data);
			return;
		}
		if(VALUEID_HIDECALLERID.equals(valueid)){
			if(data instanceof String){
		        setHidecallerid(new Boolean((String)data));
		        return;
		    }
			setHidecallerid((Boolean)data);
			return;
		}
		if(VALUEID_RESTRICTCID.equals(valueid)){
			if(data instanceof String){
		        setRestrictcid(new Boolean((String)data));
		        return;
		    }
			setRestrictcid((Boolean)data);
			return;
		}
		if(VALUEID_USECALLINGPRES.equals(valueid)){
			if(data instanceof String){
		        setUsecallingpres(new Boolean((String)data));
		        return;
		    }
			setUsecallingpres((Boolean)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CALLERID.equals(valueid)){
			return getCallerid();
			
		}
		if(VALUEID_USECALLERID.equals(valueid)){
			return getUsecallerid();
			
		}
		if(VALUEID_HIDECALLERID.equals(valueid)){
			return getHidecallerid();
			
		}
		if(VALUEID_RESTRICTCID.equals(valueid)){
			return getRestrictcid();
			
		}
		if(VALUEID_USECALLINGPRES.equals(valueid)){
			return getUsecallingpres();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getcallerid 
	* Sets the Caller ID string to forward to the recipient when calls come in from this channel. You normally use this to set the Caller ID for handsets. Specify the Caller ID name in double quotation marks, followed by the Caller ID number in <> symbols. For trunk lines, set to "asreceived" to pass the received Caller ID forward.   callerid="Mark Spencer" <256 428-6000>   callerid=   callerid=asreceived Important Note: :Caller ID can only be transmitted to the public phone network with supported hardware, such as a PRI. It is not possible to set external caller ID on analog lines.
	**/
	public String getCallerid(){		return  callerid;
	}
	/**
	*setcallerid 
	*/
	public void setCallerid(String acallerid){
		if(acallerid==null){
		    changed = (this.callerid!=null);
		    this.callerid = null;	    
		}else{
			changed = acallerid.equals(this.callerid);
			this.callerid=acallerid;
		}
	}


	/**
	* getusecallerid 
	* For handsets, this option will cause Asterisk to send Caller ID data to the handset when ringing it. For trunk lines, this option causes Asterisk to look for Caller ID on incoming calls. Default:yes.    usecallerid=no
	**/
	public Boolean getUsecallerid(){		return  usecallerid;
	}
	/**
	*setusecallerid 
	*/
	public void setUsecallerid(Boolean ausecallerid){
		if(ausecallerid==null){
		    changed = (this.usecallerid!=null);
		    this.usecallerid = null;	    
		}else{
			changed = ausecallerid.equals(this.usecallerid);
			this.usecallerid=ausecallerid;
		}
	}


	/**
	* gethidecallerid 
	* (Not for FXO trunk lines) For PRI channels, this will stop the sending of Caller ID on outgoing calls. For FXS handsets, this will stop Asterisk from sending this channel's Caller ID information to the called party when you make a call using this handset. FXS handset users may enable or disable sending of their Caller ID for the current call only by lifting the handset and dialing *82 (enable) or *67 (disable); you will then get a "dialrecall" tone whereupon you can dial the number of the extension you wish to contact. Default:no.    hidecallerid=yes
	**/
	public Boolean getHidecallerid(){		return  hidecallerid;
	}
	/**
	*sethidecallerid 
	*/
	public void setHidecallerid(Boolean ahidecallerid){
		if(ahidecallerid==null){
		    changed = (this.hidecallerid!=null);
		    this.hidecallerid = null;	    
		}else{
			changed = ahidecallerid.equals(this.hidecallerid);
			this.hidecallerid=ahidecallerid;
		}
	}


	/**
	* getrestrictcid 
	* (PRI channels only) This option has effect only when hidecallerid=no. If hidecallerid=no and restrictcid=yes, Asterisk will prevent the sending of the Caller ID data as a presentation number when making outgoing calls (ANI data is still sent). Default:no.    restrictcid=yes
	**/
	public Boolean getRestrictcid(){		return  restrictcid;
	}
	/**
	*setrestrictcid 
	*/
	public void setRestrictcid(Boolean arestrictcid){
		if(arestrictcid==null){
		    changed = (this.restrictcid!=null);
		    this.restrictcid = null;	    
		}else{
			changed = arestrictcid.equals(this.restrictcid);
			this.restrictcid=arestrictcid;
		}
	}


	/**
	* getusecallingpres 
	* (PRI channels only) Whether or not to use the Caller ID presentation for the outgoing call that the calling switch is sending. See also the CallingPres command.    usecallingpres=no
	**/
	public Boolean getUsecallingpres(){		return  usecallingpres;
	}
	/**
	*setusecallingpres 
	*/
	public void setUsecallingpres(Boolean ausecallingpres){
		if(ausecallingpres==null){
		    changed = (this.usecallingpres!=null);
		    this.usecallingpres = null;	    
		}else{
			changed = ausecallingpres.equals(this.usecallingpres);
			this.usecallingpres=ausecallingpres;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("callerid=")
		.append(callerid)
		.append(",")
		.append("usecallerid=")
		.append(usecallerid)
		.append(",")
		.append("hidecallerid=")
		.append(hidecallerid)
		.append(",")
		.append("restrictcid=")
		.append(restrictcid)
		.append(",")
		.append("usecallingpres=")
		.append(usecallingpres)
    			.append("]");

		return sb.toString();		
	}}