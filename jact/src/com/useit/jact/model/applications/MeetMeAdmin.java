package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * MeetMeAdmin<br>
 * Run admin command for conference  'K' -- Kick all users out of conference  'k' -- Kick one user out of conference  'e' -- Eject last user that joined  'L' -- Lock conference  'l' -- Unlock conference  'M' -- Mute conference  'm' -- Unmute conference  'N' -- Mute entire conference (except admin)  'n' -- Unmute entire conference (except admin)
 * </p>
 * Created : Sun Jul 09 18:50:11 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetMeAdmin.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class MeetMeAdmin extends PbxApplication implements IMeetMeAdmin{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MeetMeAdmin
	**/
	public MeetMeAdmin(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MeetMeAdmin
	**/
	public MeetMeAdmin( String aconfno, String acommand, String auser){
		super();
	
		this.confno = aconfno;	
		this.command = acommand;	
		this.user = auser;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MeetMeAdmin object){
		this.confno = object.confno;	
		this.command = object.command;	
		this.user = object.user;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String confno;
	public static final String VALUEID_CONFNO="confno" ;

    /**   **/
	protected String command;
	public static final String VALUEID_COMMAND="command" ;

    /**   **/
	protected String user;
	public static final String VALUEID_USER="user" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONFNO.equals(valueid)){
			return true;
		}
		if(VALUEID_COMMAND.equals(valueid)){
			return true;
		}
		if(VALUEID_USER.equals(valueid)){
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
		if(VALUEID_CONFNO.equals(valueid)){
			setConfno((String)data);
			return;
		}
		if(VALUEID_COMMAND.equals(valueid)){
			setCommand((String)data);
			return;
		}
		if(VALUEID_USER.equals(valueid)){
			setUser((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_CONFNO.equals(valueid)){
			return getConfno();
			
		}
		if(VALUEID_COMMAND.equals(valueid)){
			return getCommand();
			
		}
		if(VALUEID_USER.equals(valueid)){
			return getUser();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getconfno 
	* 
	**/
	public String getConfno(){		return  confno;
	}
	/**
	*setconfno 
	*/
	public void setConfno(String aconfno){
		if(aconfno==null){
		    changed = (this.confno!=null);
		    this.confno = null;	    
		}else{
			changed = aconfno.equals(this.confno);
			this.confno=aconfno;
		}
	}


	/**
	* getcommand 
	* 
	**/
	public String getCommand(){		return  command;
	}
	/**
	*setcommand 
	*/
	public void setCommand(String acommand){
		if(acommand==null){
		    changed = (this.command!=null);
		    this.command = null;	    
		}else{
			changed = acommand.equals(this.command);
			this.command=acommand;
		}
	}


	/**
	* getuser 
	* 
	**/
	public String getUser(){		return  user;
	}
	/**
	*setuser 
	*/
	public void setUser(String auser){
		if(auser==null){
		    changed = (this.user!=null);
		    this.user = null;	    
		}else{
			changed = auser.equals(this.user);
			this.user=auser;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("MeetMeAdmin, ")		
		//.append("confno=")
		.append(confno)
		.append(",")
		//.append("command=")
		.append(command)
		.append(",")
		//.append("user=")
		.append(user)
    			.append("");

		return sb.toString();		
	}
}