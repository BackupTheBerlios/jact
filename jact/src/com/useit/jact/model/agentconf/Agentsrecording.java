package com.useit.jact.model.agentconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Agentsrecording<br>
 * This section is devoted to recording agent's calls The keywords are global to the chan_agent channel driver
 * </p>
 * Created : Fri May 26 14:32:01 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Agentsrecording.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $
 */
 public  class Agentsrecording extends AbstractSimpleDataClass implements IAgentsrecording{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Agentsrecording
	**/
	public Agentsrecording(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Agentsrecording
	**/
	public Agentsrecording( Boolean arecordagentcalls, String arecordformat, String acreatelink, String aurlprefix, String asavecallsin){
		super();
	
		this.recordagentcalls = arecordagentcalls;	
		this.recordformat = arecordformat;	
		this.createlink = acreatelink;	
		this.urlprefix = aurlprefix;	
		this.savecallsin = asavecallsin;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Agentsrecording object){
		this.recordagentcalls = object.recordagentcalls;	
		this.recordformat = object.recordformat;	
		this.createlink = object.createlink;	
		this.urlprefix = object.urlprefix;	
		this.savecallsin = object.savecallsin;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Enable recording calls addressed to agents. It's turned off by default. **/
	protected Boolean recordagentcalls;
	public static final String VALUEID_RECORDAGENTCALLS="recordagentcalls" ;

    /**  The format to be used to record the calls (wav, gsm, wav49)

By default its "wav". **/
	protected String recordformat;
	public static final String VALUEID_RECORDFORMAT="recordformat" ;

    /**  Insert into CDR userfield a name of the the created recording

By default it's turned off. **/
	protected String createlink;
	public static final String VALUEID_CREATELINK="createlink" ;

    /**  The text to be added to the name of the recording. Allows forming a url link. **/
	protected String urlprefix;
	public static final String VALUEID_URLPREFIX="urlprefix" ;

    /**  The optional directory to save the conversations in. The default is

/var/spool/asterisk/monitor **/
	protected String savecallsin;
	public static final String VALUEID_SAVECALLSIN="savecallsin" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_RECORDAGENTCALLS.equals(valueid)){
			return true;
		}
		if(VALUEID_RECORDFORMAT.equals(valueid)){
			return true;
		}
		if(VALUEID_CREATELINK.equals(valueid)){
			return true;
		}
		if(VALUEID_URLPREFIX.equals(valueid)){
			return true;
		}
		if(VALUEID_SAVECALLSIN.equals(valueid)){
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
		if(VALUEID_RECORDAGENTCALLS.equals(valueid)){
			if(data instanceof String){
		        setRecordagentcalls(new Boolean((String)data));
		        return;
		    }
			setRecordagentcalls((Boolean)data);
			return;
		}
		if(VALUEID_RECORDFORMAT.equals(valueid)){
			setRecordformat((String)data);
			return;
		}
		if(VALUEID_CREATELINK.equals(valueid)){
			setCreatelink((String)data);
			return;
		}
		if(VALUEID_URLPREFIX.equals(valueid)){
			setUrlprefix((String)data);
			return;
		}
		if(VALUEID_SAVECALLSIN.equals(valueid)){
			setSavecallsin((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_RECORDAGENTCALLS.equals(valueid)){
			return getRecordagentcalls();
			
		}
		if(VALUEID_RECORDFORMAT.equals(valueid)){
			return getRecordformat();
			
		}
		if(VALUEID_CREATELINK.equals(valueid)){
			return getCreatelink();
			
		}
		if(VALUEID_URLPREFIX.equals(valueid)){
			return getUrlprefix();
			
		}
		if(VALUEID_SAVECALLSIN.equals(valueid)){
			return getSavecallsin();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getrecordagentcalls 
	* Enable recording calls addressed to agents. It's turned off by default.
	**/
	public Boolean getRecordagentcalls(){		return  recordagentcalls;
	}
	/**
	*setrecordagentcalls 
	*/
	public void setRecordagentcalls(Boolean arecordagentcalls){
		if(arecordagentcalls==null){
		    changed = (this.recordagentcalls!=null);
		    this.recordagentcalls = null;	    
		}else{
			changed = arecordagentcalls.equals(this.recordagentcalls);
			this.recordagentcalls=arecordagentcalls;
		}
	}


	/**
	* getrecordformat 
	* The format to be used to record the calls (wav, gsm, wav49)

By default its "wav".
	**/
	public String getRecordformat(){		return  recordformat;
	}
	/**
	*setrecordformat 
	*/
	public void setRecordformat(String arecordformat){
		if(arecordformat==null){
		    changed = (this.recordformat!=null);
		    this.recordformat = null;	    
		}else{
			changed = arecordformat.equals(this.recordformat);
			this.recordformat=arecordformat;
		}
	}


	/**
	* getcreatelink 
	* Insert into CDR userfield a name of the the created recording

By default it's turned off.
	**/
	public String getCreatelink(){		return  createlink;
	}
	/**
	*setcreatelink 
	*/
	public void setCreatelink(String acreatelink){
		if(acreatelink==null){
		    changed = (this.createlink!=null);
		    this.createlink = null;	    
		}else{
			changed = acreatelink.equals(this.createlink);
			this.createlink=acreatelink;
		}
	}


	/**
	* geturlprefix 
	* The text to be added to the name of the recording. Allows forming a url link.
	**/
	public String getUrlprefix(){		return  urlprefix;
	}
	/**
	*seturlprefix 
	*/
	public void setUrlprefix(String aurlprefix){
		if(aurlprefix==null){
		    changed = (this.urlprefix!=null);
		    this.urlprefix = null;	    
		}else{
			changed = aurlprefix.equals(this.urlprefix);
			this.urlprefix=aurlprefix;
		}
	}


	/**
	* getsavecallsin 
	* The optional directory to save the conversations in. The default is

/var/spool/asterisk/monitor
	**/
	public String getSavecallsin(){		return  savecallsin;
	}
	/**
	*setsavecallsin 
	*/
	public void setSavecallsin(String asavecallsin){
		if(asavecallsin==null){
		    changed = (this.savecallsin!=null);
		    this.savecallsin = null;	    
		}else{
			changed = asavecallsin.equals(this.savecallsin);
			this.savecallsin=asavecallsin;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("recordagentcalls=")
		.append(recordagentcalls)
		.append(",")
		.append("recordformat=")
		.append(recordformat)
		.append(",")
		.append("createlink=")
		.append(createlink)
		.append(",")
		.append("urlprefix=")
		.append(urlprefix)
		.append(",")
		.append("savecallsin=")
		.append(savecallsin)
    			.append("]");

		return sb.toString();		
	}}