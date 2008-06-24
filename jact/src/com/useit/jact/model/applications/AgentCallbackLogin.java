package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.AbstractExtension;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * AgentCallbackLogin<br>
 * Asks the agent to login to the system with callback. The agent's callback extension is called (optionally with the specified context). The option string may contain zero or more of the following characters:  's' -- silent login - do not announce the login ok segment agent logged in/off
 * </p>
 * Created : Sun Jul 09 18:48:50 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AgentCallbackLogin.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class AgentCallbackLogin extends PbxApplication implements IAgentCallbackLogin{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für AgentCallbackLogin
	**/
	public AgentCallbackLogin(){
		super();
	
	}
	/**
	* komplexer Konstruktor für AgentCallbackLogin
	**/
	public AgentCallbackLogin( String aagentNo, String aoptions, String aexten, String acontext, AbstractExtension aextension){
		super();
	
		this.agentNo = aagentNo;	
		this.extension = aextension;	
		this.options = aoptions;	
		this.exten = aexten;	
		this.context = acontext;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(AgentCallbackLogin object){
		this.agentNo = object.agentNo;	
		this.extension = object.extension;	
		this.options = object.options;	
		this.exten = object.exten;	
		this.context = object.context;	

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
	protected AbstractExtension extension;
	public static final String VALUEID_EXTENSION="extension" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

    /**   **/
	protected String exten;
	public static final String VALUEID_EXTEN="exten" ;

    /**   **/
	protected String context;
	public static final String VALUEID_CONTEXT="context" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_AGENTNO.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTENSION.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return true;
		}
		if(VALUEID_EXTEN.equals(valueid)){
			return true;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
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
		if(VALUEID_EXTENSION.equals(valueid)){
			if(data instanceof String){
		        setExtension(new AbstractExtension((String)data));
		        return;
		    }
			setExtension((AbstractExtension)data);
			return;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			setOptions((String)data);
			return;
		}
		if(VALUEID_EXTEN.equals(valueid)){
			setExten((String)data);
			return;
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			setContext((String)data);
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
		if(VALUEID_EXTENSION.equals(valueid)){
			return getExtension();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
		if(VALUEID_EXTEN.equals(valueid)){
			return getExten();
			
		}
		if(VALUEID_CONTEXT.equals(valueid)){
			return getContext();
			
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
	* getextension 
	* 
	**/
	public AbstractExtension getExtension(){		return  extension;
	}
	/**
	*setextension 
	*/
	public void setExtension(AbstractExtension aextension){
		if(aextension==null){
		    changed = (this.extension!=null);
		    this.extension = null;	    
		}else{
			changed = aextension.equals(this.extension);
			this.extension=aextension;
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
	* getexten 
	* 
	**/
	public String getExten(){		return  exten;
	}
	/**
	*setexten 
	*/
	public void setExten(String aexten){
		if(aexten==null){
		    changed = (this.exten!=null);
		    this.exten = null;	    
		}else{
			changed = aexten.equals(this.exten);
			this.exten=aexten;
		}
	}


	/**
	* getcontext 
	* 
	**/
	public String getContext(){		return  context;
	}
	/**
	*setcontext 
	*/
	public void setContext(String acontext){
		if(acontext==null){
		    changed = (this.context!=null);
		    this.context = null;	    
		}else{
			changed = acontext.equals(this.context);
			this.context=acontext;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("AgentCallbackLogin, ")		
		//.append("agentNo=")
		.append(agentNo)
		.append(",")
		//.append("extension=")
		.append(extension)
		.append(",")
		//.append("options=")
		.append(options)
		.append(",")
		//.append("exten=")
		.append(exten)
		.append(",")
		//.append("context=")
		.append(context)
    			.append("");

		return sb.toString();		
	}
}