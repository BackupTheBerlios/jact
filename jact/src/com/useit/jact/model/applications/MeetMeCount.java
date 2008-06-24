package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * MeetMeCount<br>
 * Plays back the number of users in the specifiedi MeetMe conference. If var is specified, playback will be skipped and the value will be returned in the variable. Returns 0 on success or -1 on a hangup. A ZAPTEL INTERFACE MUST BE INSTALLED FOR CONFERENCING FUNCTIONALITY.
 * </p>
 * Created : Sun Jul 09 18:50:51 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MeetMeCount.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class MeetMeCount extends PbxApplication implements IMeetMeCount{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MeetMeCount
	**/
	public MeetMeCount(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MeetMeCount
	**/
	public MeetMeCount( String aconfno, String avar){
		super();
	
		this.confno = aconfno;	
		this.var = avar;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MeetMeCount object){
		this.confno = object.confno;	
		this.var = object.var;	

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
	protected String var;
	public static final String VALUEID_VAR="var" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_CONFNO.equals(valueid)){
			return true;
		}
		if(VALUEID_VAR.equals(valueid)){
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
		if(VALUEID_VAR.equals(valueid)){
			setVar((String)data);
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
		if(VALUEID_VAR.equals(valueid)){
			return getVar();
			
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
	* getvar 
	* 
	**/
	public String getVar(){		return  var;
	}
	/**
	*setvar 
	*/
	public void setVar(String avar){
		if(avar==null){
		    changed = (this.var!=null);
		    this.var = null;	    
		}else{
			changed = avar.equals(this.var);
			this.var=avar;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("MeetMeCount, ")		
		//.append("confno=")
		.append(confno)
		.append(",")
		//.append("var=")
		.append(var)
    			.append("");

		return sb.toString();		
	}
}