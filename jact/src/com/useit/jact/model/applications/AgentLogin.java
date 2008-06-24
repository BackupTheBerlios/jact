package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * AgentLogin<br>
 * Asks the agent to login to the system. Always returns -1. While logged in, the agent can receive calls and will hear a 'beep' when a new call comes in. The agent can dump the call by pressing the star key. The option string may contain zero or more of the following characters:  's' -- silent login - do not announce the login ok segment after agent logged in/off
 * </p>
 * Created : Sun Jul 09 18:51:33 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentLogin.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class AgentLogin extends PbxApplication implements IAgentLogin{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für AgentLogin
	**/
	public AgentLogin(){
		super();
	
	}
	/**
	* komplexer Konstruktor für AgentLogin
	**/
	public AgentLogin( String aagentNo, String aoptions){
		super();
	
		this.agentNo = aagentNo;	
		this.options = aoptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(AgentLogin object){
		this.agentNo = object.agentNo;	
		this.options = object.options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String agentNo;
	public static final String VALUEID_AGENTNO="agentno" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_AGENTNO.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
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
		if(VALUEID_AGENTNO.equals(valueid)){
			setAgentNo((String)data);
			return;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			setOptions((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_AGENTNO.equals(valueid)){
			return getAgentNo();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getagentNo 
	* 
	**/
	public String getAgentNo(){		return  agentNo;
	}
	/**
	*setagentNo 
	*/
	public void setAgentNo(String aagentNo){
		if(aagentNo==null){
		    changed = (this.agentNo!=null);
		    this.agentNo = null;	    
		}else{
			changed = aagentNo.equals(this.agentNo);
			this.agentNo=aagentNo;
		}
	}


	/**
	* getoptions 
	* 
	**/
	public String getOptions(){		return  options;
	}
	/**
	*setoptions 
	*/
	public void setOptions(String aoptions){
		if(aoptions==null){
		    changed = (this.options!=null);
		    this.options = null;	    
		}else{
			changed = aoptions.equals(this.options);
			this.options=aoptions;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("AgentLogin, ")		
		//.append("agentNo=")
		.append(agentNo)
		.append(",")
		//.append("options=")
		.append(options)
    			.append("");

		return sb.toString();		
	}
}