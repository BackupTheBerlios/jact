package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * UserEvent<br>
 * Sends an arbitrary event to the manager interface, with an optional body representing additional arguments. The format of the event will be:  Event: UserEvent<specified event name>  Channel: <channel name>  Uniqueid: <call uniqueid>  [body] If the body is not specified, only Event, Channel, and Uniqueid fields will be present. Returns 0.
 * </p>
 * Created : Sun Jul 09 18:48:54 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: UserEvent.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class UserEvent extends PbxApplication implements IUserEvent{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für UserEvent
	**/
	public UserEvent(){
		super();
	
	}
	/**
	* komplexer Konstruktor für UserEvent
	**/
	public UserEvent( String aeventname, String abody){
		super();
	
		this.eventname = aeventname;	
		this.body = abody;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(UserEvent object){
		this.eventname = object.eventname;	
		this.body = object.body;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String eventname;
	public static final String VALUEID_EVENTNAME="eventname" ;

    /**   **/
	protected String body;
	public static final String VALUEID_BODY="body" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_EVENTNAME.equals(valueid)){
			return true;
		}
		if(VALUEID_BODY.equals(valueid)){
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
		if(VALUEID_EVENTNAME.equals(valueid)){
			setEventname((String)data);
			return;
		}
		if(VALUEID_BODY.equals(valueid)){
			setBody((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_EVENTNAME.equals(valueid)){
			return getEventname();
			
		}
		if(VALUEID_BODY.equals(valueid)){
			return getBody();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* geteventname 
	* 
	**/
	public String getEventname(){		return  eventname;
	}
	/**
	*seteventname 
	*/
	public void setEventname(String aeventname){
		if(aeventname==null){
		    changed = (this.eventname!=null);
		    this.eventname = null;	    
		}else{
			changed = aeventname.equals(this.eventname);
			this.eventname=aeventname;
		}
	}


	/**
	* getbody 
	* 
	**/
	public String getBody(){		return  body;
	}
	/**
	*setbody 
	*/
	public void setBody(String abody){
		if(abody==null){
		    changed = (this.body!=null);
		    this.body = null;	    
		}else{
			changed = abody.equals(this.body);
			this.body=abody;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("UserEvent, ")		
		//.append("eventname=")
		.append(eventname)
		.append(",")
		//.append("body=")
		.append(body)
    			.append("");

		return sb.toString();		
	}
}