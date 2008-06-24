package com.useit.jact.model.agentconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Agents<br>
 * this last section contains the definition of the agents.
 * </p>
 * Created : Fri May 26 14:32:01 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Agents.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $
 */
 public  class Agents extends AbstractSimpleDataClass implements IAgents{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Agents
	**/
	public Agents(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Agents
	**/
	public Agents( String aagentid, String aagentpassword, String aname){
		super();
	
		this.agentid = aagentid;	
		this.agentpassword = aagentpassword;	
		this.name = aname;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Agents object){
		this.agentid = object.agentid;	
		this.agentpassword = object.agentpassword;	
		this.name = object.name;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  the agent id **/
	protected String agentid;
	public static final String VALUEID_AGENTID="agentid" ;

    /**  the passwort **/
	protected String agentpassword;
	public static final String VALUEID_AGENTPASSWORD="agentpassword" ;

    /**  the name **/
	protected String name;
	public static final String VALUEID_NAME="name" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_AGENTID.equals(valueid)){
			return true;
		}
		if(VALUEID_AGENTPASSWORD.equals(valueid)){
			return true;
		}
		if(VALUEID_NAME.equals(valueid)){
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
		if(VALUEID_AGENTID.equals(valueid)){
			setAgentid((String)data);
			return;
		}
		if(VALUEID_AGENTPASSWORD.equals(valueid)){
			setAgentpassword((String)data);
			return;
		}
		if(VALUEID_NAME.equals(valueid)){
			setName((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_AGENTID.equals(valueid)){
			return getAgentid();
			
		}
		if(VALUEID_AGENTPASSWORD.equals(valueid)){
			return getAgentpassword();
			
		}
		if(VALUEID_NAME.equals(valueid)){
			return getName();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getagentid 
	* the agent id
	**/
	public String getAgentid(){		return  agentid;
	}
	/**
	*setagentid 
	*/
	public void setAgentid(String aagentid){
		if(aagentid==null){
		    changed = (this.agentid!=null);
		    this.agentid = null;	    
		}else{
			changed = aagentid.equals(this.agentid);
			this.agentid=aagentid;
		}
	}


	/**
	* getagentpassword 
	* the passwort
	**/
	public String getAgentpassword(){		return  agentpassword;
	}
	/**
	*setagentpassword 
	*/
	public void setAgentpassword(String aagentpassword){
		if(aagentpassword==null){
		    changed = (this.agentpassword!=null);
		    this.agentpassword = null;	    
		}else{
			changed = aagentpassword.equals(this.agentpassword);
			this.agentpassword=aagentpassword;
		}
	}


	/**
	* getname 
	* the name
	**/
	public String getName(){		return  name;
	}
	/**
	*setname 
	*/
	public void setName(String aname){
		if(aname==null){
		    changed = (this.name!=null);
		    this.name = null;	    
		}else{
			changed = aname.equals(this.name);
			this.name=aname;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("agentid=")
		.append(agentid)
		.append(",")
		.append("agentpassword=")
		.append(agentpassword)
		.append(",")
		.append("name=")
		.append(name)
    			.append("]");

		return sb.toString();		
	}}