package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Analog_Handset_Features<br>
 * headset
 * </p>
 * Created : Fri May 26 14:32:06 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Analog_Handset_Features.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  class Analog_Handset_Features extends AbstractSimpleDataClass implements IAnalog_Handset_Features{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Analog_Handset_Features
	**/
	public Analog_Handset_Features(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Analog_Handset_Features
	**/
	public Analog_Handset_Features( String aadsi, Boolean aimmediate, Boolean acallwaiting, Boolean acallwaitingcallerid, Boolean athreewaycalling, Boolean atransfer, Boolean acancallforward, Boolean acallreturn, String acallgroup, String apickupgroup, String auseincomingcalleridonzaptransfer){
		super();
	
		this.adsi = aadsi;	
		this.immediate = aimmediate;	
		this.callwaiting = acallwaiting;	
		this.callwaitingcallerid = acallwaitingcallerid;	
		this.threewaycalling = athreewaycalling;	
		this.transfer = atransfer;	
		this.cancallforward = acancallforward;	
		this.callreturn = acallreturn;	
		this.callgroup = acallgroup;	
		this.pickupgroup = apickupgroup;	
		this.useincomingcalleridonzaptransfer = auseincomingcalleridonzaptransfer;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Analog_Handset_Features object){
		this.adsi = object.adsi;	
		this.immediate = object.immediate;	
		this.callwaiting = object.callwaiting;	
		this.callwaitingcallerid = object.callwaitingcallerid;	
		this.threewaycalling = object.threewaycalling;	
		this.transfer = object.transfer;	
		this.cancallforward = object.cancallforward;	
		this.callreturn = object.callreturn;	
		this.callgroup = object.callgroup;	
		this.pickupgroup = object.pickupgroup;	
		this.useincomingcalleridonzaptransfer = object.useincomingcalleridonzaptransfer;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  If your handset has ADSI (Analog Display Services Interface) capability, set set adsi=yes. The ADSI specification is system similar to Caller ID to pass encoded information to an analog handset. It allows the creation of interactive visual menus on a multiline display, offering access to services such as voicemail through a text interface. **/
	protected String adsi;
	public static final String VALUEID_ADSI="adsi" ;

    /**  Normally (i.e. with immediate set to 'no', the default), when you lift an FXS handset, the Zaptel driver provides you a dialtone and listens for digits that you dial, passing them on to Asterisk. Asterisk waits until the number you've dialed matches an extension, and then begins executing the first command on the matching extension. If you set immediate=yes, then Asterisk will instruct the Zaptel driver to not generate a dialtone when you lift a handset, instead passing control immediately to Asterisk. Asterisk will start executing the commands for this channel's "s" extension. This is sometimes referred to as "batphone mode". Default no.    immediate=yes **/
	protected Boolean immediate;
	public static final String VALUEID_IMMEDIATE="immediate" ;

    /**  If enabled, Asterisk will generate "call waiting pips" when you are already in a conversation on your FXS handset when someone tries to call you. If the channel has call waiting by default, you can temporarily disable it by lifting the handset and dialing *70, whereupon you will get a dialrecall tone and may then dial the intended number. There is no corresponding way to temporarily enable call waiting for channels that have it off by default. Default no.    callwaiting=yes **/
	protected Boolean callwaiting;
	public static final String VALUEID_CALLWAITING="callwaiting" ;

    /**  Sets whether Asterisk will send Caller ID data to the handset during call waiting indication. Requires also setting callwaiting=yes. Default no.    callwaitingcallerid=yes **/
	protected Boolean callwaitingcallerid;
	public static final String VALUEID_CALLWAITINGCALLERID="callwaitingcallerid" ;

    /**  If enabled, you can place a call on hold by pressing a hook flash, whereupon you get a dialrecall tone and can make another call. Default no.    threewaycalling=yes **/
	protected Boolean threewaycalling;
	public static final String VALUEID_THREEWAYCALLING="threewaycalling" ;

    /**  This option has effect only when threewaycalling=yes. If threewaycalling=yes and transfer=yes, then once you've placed a call on hold with a hook flash, you can transfer that call to another extension by dialing the extension and hanging up. Default no.    transfer=yes **/
	protected Boolean transfer;
	public static final String VALUEID_TRANSFER="transfer" ;

    /**  If enabled, you may activate "call forwarding immediate" by dialing *72 (whereupon you get a dialrecall tone) followed by the extension number you wish to forward your calls to. If someone dials your extension, the call will be redirected to the forwarding number. You may disable the call forwarding by dialing *73. Default no.    cancallforward=yes **/
	protected Boolean cancallforward;
	public static final String VALUEID_CANCALLFORWARD="cancallforward" ;

    /**  If enabled, you may dial *69 to have Asterisk read to you the caller ID of the last person to call. You will hear the dialrecall tone if there is no record of a last caller. Default no.    callreturn=yes **/
	protected Boolean callreturn;
	public static final String VALUEID_CALLRETURN="callreturn" ;

    /**  A channel may belong to zero or more callgroups. Callgroups specify who may answer this phone when it is ringing. If this channel is ringing, then any other channel whose pickupgroups include one of this channel's callgroups may answer the call by dialing *8#. This feature is supported by Zap, SIP, Skinny and MGCP channels. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups.   group=1   callgroup=1,2,3 **/
	protected String callgroup;
	public static final String VALUEID_CALLGROUP="callgroup" ;

    /**  A channel may belong to zero or more pickupgroups. Pickupgroups specify whose phones you may answer. If another channel is ringing, and this channel's pickupgroups include one of the ringing channel's callgroups, then this channel may answer the call by dialing *8#. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups. **/
	protected String pickupgroup;
	public static final String VALUEID_PICKUPGROUP="pickupgroup" ;

    /**  If you set this option (Use Incoming Caller ID On Zap Transfer) to 'yes', then when you transfer a call to another phone, the original caller's Caller ID will get forwarded on too. Default no.    useincomingcalleridonzaptransfer=yes **/
	protected String useincomingcalleridonzaptransfer;
	public static final String VALUEID_USEINCOMINGCALLERIDONZAPTRANSFER="useincomingcalleridonzaptransfer" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_ADSI.equals(valueid)){
			return true;
		}
		if(VALUEID_IMMEDIATE.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLWAITING.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLWAITINGCALLERID.equals(valueid)){
			return true;
		}
		if(VALUEID_THREEWAYCALLING.equals(valueid)){
			return true;
		}
		if(VALUEID_TRANSFER.equals(valueid)){
			return true;
		}
		if(VALUEID_CANCALLFORWARD.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLRETURN.equals(valueid)){
			return true;
		}
		if(VALUEID_CALLGROUP.equals(valueid)){
			return true;
		}
		if(VALUEID_PICKUPGROUP.equals(valueid)){
			return true;
		}
		if(VALUEID_USEINCOMINGCALLERIDONZAPTRANSFER.equals(valueid)){
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
		if(VALUEID_ADSI.equals(valueid)){
			setAdsi((String)data);
			return;
		}
		if(VALUEID_IMMEDIATE.equals(valueid)){
			if(data instanceof String){
		        setImmediate(new Boolean((String)data));
		        return;
		    }
			setImmediate((Boolean)data);
			return;
		}
		if(VALUEID_CALLWAITING.equals(valueid)){
			if(data instanceof String){
		        setCallwaiting(new Boolean((String)data));
		        return;
		    }
			setCallwaiting((Boolean)data);
			return;
		}
		if(VALUEID_CALLWAITINGCALLERID.equals(valueid)){
			if(data instanceof String){
		        setCallwaitingcallerid(new Boolean((String)data));
		        return;
		    }
			setCallwaitingcallerid((Boolean)data);
			return;
		}
		if(VALUEID_THREEWAYCALLING.equals(valueid)){
			if(data instanceof String){
		        setThreewaycalling(new Boolean((String)data));
		        return;
		    }
			setThreewaycalling((Boolean)data);
			return;
		}
		if(VALUEID_TRANSFER.equals(valueid)){
			if(data instanceof String){
		        setTransfer(new Boolean((String)data));
		        return;
		    }
			setTransfer((Boolean)data);
			return;
		}
		if(VALUEID_CANCALLFORWARD.equals(valueid)){
			if(data instanceof String){
		        setCancallforward(new Boolean((String)data));
		        return;
		    }
			setCancallforward((Boolean)data);
			return;
		}
		if(VALUEID_CALLRETURN.equals(valueid)){
			if(data instanceof String){
		        setCallreturn(new Boolean((String)data));
		        return;
		    }
			setCallreturn((Boolean)data);
			return;
		}
		if(VALUEID_CALLGROUP.equals(valueid)){
			setCallgroup((String)data);
			return;
		}
		if(VALUEID_PICKUPGROUP.equals(valueid)){
			setPickupgroup((String)data);
			return;
		}
		if(VALUEID_USEINCOMINGCALLERIDONZAPTRANSFER.equals(valueid)){
			setUseincomingcalleridonzaptransfer((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_ADSI.equals(valueid)){
			return getAdsi();
			
		}
		if(VALUEID_IMMEDIATE.equals(valueid)){
			return getImmediate();
			
		}
		if(VALUEID_CALLWAITING.equals(valueid)){
			return getCallwaiting();
			
		}
		if(VALUEID_CALLWAITINGCALLERID.equals(valueid)){
			return getCallwaitingcallerid();
			
		}
		if(VALUEID_THREEWAYCALLING.equals(valueid)){
			return getThreewaycalling();
			
		}
		if(VALUEID_TRANSFER.equals(valueid)){
			return getTransfer();
			
		}
		if(VALUEID_CANCALLFORWARD.equals(valueid)){
			return getCancallforward();
			
		}
		if(VALUEID_CALLRETURN.equals(valueid)){
			return getCallreturn();
			
		}
		if(VALUEID_CALLGROUP.equals(valueid)){
			return getCallgroup();
			
		}
		if(VALUEID_PICKUPGROUP.equals(valueid)){
			return getPickupgroup();
			
		}
		if(VALUEID_USEINCOMINGCALLERIDONZAPTRANSFER.equals(valueid)){
			return getUseincomingcalleridonzaptransfer();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getadsi 
	* If your handset has ADSI (Analog Display Services Interface) capability, set set adsi=yes. The ADSI specification is system similar to Caller ID to pass encoded information to an analog handset. It allows the creation of interactive visual menus on a multiline display, offering access to services such as voicemail through a text interface.
	**/
	public String getAdsi(){		return  adsi;
	}
	/**
	*setadsi 
	*/
	public void setAdsi(String aadsi){
		if(aadsi==null){
		    changed = (this.adsi!=null);
		    this.adsi = null;	    
		}else{
			changed = aadsi.equals(this.adsi);
			this.adsi=aadsi;
		}
	}


	/**
	* getimmediate 
	* Normally (i.e. with immediate set to 'no', the default), when you lift an FXS handset, the Zaptel driver provides you a dialtone and listens for digits that you dial, passing them on to Asterisk. Asterisk waits until the number you've dialed matches an extension, and then begins executing the first command on the matching extension. If you set immediate=yes, then Asterisk will instruct the Zaptel driver to not generate a dialtone when you lift a handset, instead passing control immediately to Asterisk. Asterisk will start executing the commands for this channel's "s" extension. This is sometimes referred to as "batphone mode". Default no.    immediate=yes
	**/
	public Boolean getImmediate(){		return  immediate;
	}
	/**
	*setimmediate 
	*/
	public void setImmediate(Boolean aimmediate){
		if(aimmediate==null){
		    changed = (this.immediate!=null);
		    this.immediate = null;	    
		}else{
			changed = aimmediate.equals(this.immediate);
			this.immediate=aimmediate;
		}
	}


	/**
	* getcallwaiting 
	* If enabled, Asterisk will generate "call waiting pips" when you are already in a conversation on your FXS handset when someone tries to call you. If the channel has call waiting by default, you can temporarily disable it by lifting the handset and dialing *70, whereupon you will get a dialrecall tone and may then dial the intended number. There is no corresponding way to temporarily enable call waiting for channels that have it off by default. Default no.    callwaiting=yes
	**/
	public Boolean getCallwaiting(){		return  callwaiting;
	}
	/**
	*setcallwaiting 
	*/
	public void setCallwaiting(Boolean acallwaiting){
		if(acallwaiting==null){
		    changed = (this.callwaiting!=null);
		    this.callwaiting = null;	    
		}else{
			changed = acallwaiting.equals(this.callwaiting);
			this.callwaiting=acallwaiting;
		}
	}


	/**
	* getcallwaitingcallerid 
	* Sets whether Asterisk will send Caller ID data to the handset during call waiting indication. Requires also setting callwaiting=yes. Default no.    callwaitingcallerid=yes
	**/
	public Boolean getCallwaitingcallerid(){		return  callwaitingcallerid;
	}
	/**
	*setcallwaitingcallerid 
	*/
	public void setCallwaitingcallerid(Boolean acallwaitingcallerid){
		if(acallwaitingcallerid==null){
		    changed = (this.callwaitingcallerid!=null);
		    this.callwaitingcallerid = null;	    
		}else{
			changed = acallwaitingcallerid.equals(this.callwaitingcallerid);
			this.callwaitingcallerid=acallwaitingcallerid;
		}
	}


	/**
	* getthreewaycalling 
	* If enabled, you can place a call on hold by pressing a hook flash, whereupon you get a dialrecall tone and can make another call. Default no.    threewaycalling=yes
	**/
	public Boolean getThreewaycalling(){		return  threewaycalling;
	}
	/**
	*setthreewaycalling 
	*/
	public void setThreewaycalling(Boolean athreewaycalling){
		if(athreewaycalling==null){
		    changed = (this.threewaycalling!=null);
		    this.threewaycalling = null;	    
		}else{
			changed = athreewaycalling.equals(this.threewaycalling);
			this.threewaycalling=athreewaycalling;
		}
	}


	/**
	* gettransfer 
	* This option has effect only when threewaycalling=yes. If threewaycalling=yes and transfer=yes, then once you've placed a call on hold with a hook flash, you can transfer that call to another extension by dialing the extension and hanging up. Default no.    transfer=yes
	**/
	public Boolean getTransfer(){		return  transfer;
	}
	/**
	*settransfer 
	*/
	public void setTransfer(Boolean atransfer){
		if(atransfer==null){
		    changed = (this.transfer!=null);
		    this.transfer = null;	    
		}else{
			changed = atransfer.equals(this.transfer);
			this.transfer=atransfer;
		}
	}


	/**
	* getcancallforward 
	* If enabled, you may activate "call forwarding immediate" by dialing *72 (whereupon you get a dialrecall tone) followed by the extension number you wish to forward your calls to. If someone dials your extension, the call will be redirected to the forwarding number. You may disable the call forwarding by dialing *73. Default no.    cancallforward=yes
	**/
	public Boolean getCancallforward(){		return  cancallforward;
	}
	/**
	*setcancallforward 
	*/
	public void setCancallforward(Boolean acancallforward){
		if(acancallforward==null){
		    changed = (this.cancallforward!=null);
		    this.cancallforward = null;	    
		}else{
			changed = acancallforward.equals(this.cancallforward);
			this.cancallforward=acancallforward;
		}
	}


	/**
	* getcallreturn 
	* If enabled, you may dial *69 to have Asterisk read to you the caller ID of the last person to call. You will hear the dialrecall tone if there is no record of a last caller. Default no.    callreturn=yes
	**/
	public Boolean getCallreturn(){		return  callreturn;
	}
	/**
	*setcallreturn 
	*/
	public void setCallreturn(Boolean acallreturn){
		if(acallreturn==null){
		    changed = (this.callreturn!=null);
		    this.callreturn = null;	    
		}else{
			changed = acallreturn.equals(this.callreturn);
			this.callreturn=acallreturn;
		}
	}


	/**
	* getcallgroup 
	* A channel may belong to zero or more callgroups. Callgroups specify who may answer this phone when it is ringing. If this channel is ringing, then any other channel whose pickupgroups include one of this channel's callgroups may answer the call by dialing *8#. This feature is supported by Zap, SIP, Skinny and MGCP channels. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups.   group=1   callgroup=1,2,3
	**/
	public String getCallgroup(){		return  callgroup;
	}
	/**
	*setcallgroup 
	*/
	public void setCallgroup(String acallgroup){
		if(acallgroup==null){
		    changed = (this.callgroup!=null);
		    this.callgroup = null;	    
		}else{
			changed = acallgroup.equals(this.callgroup);
			this.callgroup=acallgroup;
		}
	}


	/**
	* getpickupgroup 
	* A channel may belong to zero or more pickupgroups. Pickupgroups specify whose phones you may answer. If another channel is ringing, and this channel's pickupgroups include one of the ringing channel's callgroups, then this channel may answer the call by dialing *8#. Group numbers can range from 0 to 31. The default value is an empty string, i.e. no groups.
	**/
	public String getPickupgroup(){		return  pickupgroup;
	}
	/**
	*setpickupgroup 
	*/
	public void setPickupgroup(String apickupgroup){
		if(apickupgroup==null){
		    changed = (this.pickupgroup!=null);
		    this.pickupgroup = null;	    
		}else{
			changed = apickupgroup.equals(this.pickupgroup);
			this.pickupgroup=apickupgroup;
		}
	}


	/**
	* getuseincomingcalleridonzaptransfer 
	* If you set this option (Use Incoming Caller ID On Zap Transfer) to 'yes', then when you transfer a call to another phone, the original caller's Caller ID will get forwarded on too. Default no.    useincomingcalleridonzaptransfer=yes
	**/
	public String getUseincomingcalleridonzaptransfer(){		return  useincomingcalleridonzaptransfer;
	}
	/**
	*setuseincomingcalleridonzaptransfer 
	*/
	public void setUseincomingcalleridonzaptransfer(String auseincomingcalleridonzaptransfer){
		if(auseincomingcalleridonzaptransfer==null){
		    changed = (this.useincomingcalleridonzaptransfer!=null);
		    this.useincomingcalleridonzaptransfer = null;	    
		}else{
			changed = auseincomingcalleridonzaptransfer.equals(this.useincomingcalleridonzaptransfer);
			this.useincomingcalleridonzaptransfer=auseincomingcalleridonzaptransfer;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("adsi=")
		.append(adsi)
		.append(",")
		.append("immediate=")
		.append(immediate)
		.append(",")
		.append("callwaiting=")
		.append(callwaiting)
		.append(",")
		.append("callwaitingcallerid=")
		.append(callwaitingcallerid)
		.append(",")
		.append("threewaycalling=")
		.append(threewaycalling)
		.append(",")
		.append("transfer=")
		.append(transfer)
		.append(",")
		.append("cancallforward=")
		.append(cancallforward)
		.append(",")
		.append("callreturn=")
		.append(callreturn)
		.append(",")
		.append("callgroup=")
		.append(callgroup)
		.append(",")
		.append("pickupgroup=")
		.append(pickupgroup)
		.append(",")
		.append("useincomingcalleridonzaptransfer=")
		.append(useincomingcalleridonzaptransfer)
    			.append("]");

		return sb.toString();		
	}}