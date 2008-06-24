package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * AgentMonitorOutgoing<br>
 * Tries to figure out the id of the agent who is placing outgoing call based on comparision of the callerid of the current interface and the global variable  placed by the AgentCallbackLogin application. That's why it should be used only with the AgentCallbackLogin app. Uses the monitoring functions in chan_agent  instead of Monitor application. That have to be configured in the agents.conf file.  Return value: Normally the app returns 0 unless the options are passed. Also if the callerid or the agentid are not specified it'll look for n+101 priority.  Options:  'd' - make the app return -1 if there is an error condition and there is   no extension n+101  'c' - change the CDR so that the source of the call is 'Agent/agent_id'  'n' - don't generate the warnings when there is no callerid or the   agentid is not known.  It's handy if you want to have one context for agent and non-agent calls.
 * </p>
 * Created : Sun Jul 09 18:49:32 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentMonitorOutgoing.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class AgentMonitorOutgoing extends PbxApplication implements IAgentMonitorOutgoing{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für AgentMonitorOutgoing
	**/
	public AgentMonitorOutgoing(){
		super();
	
	}
	/**
	* komplexer Konstruktor für AgentMonitorOutgoing
	**/
	public AgentMonitorOutgoing( String aoptions){
		super();
	
		this.options = aoptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(AgentMonitorOutgoing object){
		this.options = object.options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
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
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

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
		sb.append("AgentMonitorOutgoing, ")		
		//.append("options=")
		.append(options)
    			.append("");

		return sb.toString();		
	}
}