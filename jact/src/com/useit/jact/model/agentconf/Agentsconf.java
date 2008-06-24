package com.useit.jact.model.agentconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.ArrayList;
import java.util.List;

import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Agentsconf<br>
 * ACD distributes incoming calls to the agents of a Queue.
 * </p>
 * Created : Fri May 26 14:32:01 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Agentsconf.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $
 */
 public  class Agentsconf extends AbstractSimpleDataClass implements IAgentsconf{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Agentsconf
	**/
	public Agentsconf(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Agentsconf
	**/
	public Agentsconf( String aautologoff, String aackcall, String awrapuptime, String amusic_class, String acustom_beep, String agroup){
		super();
	
		this.autologoff = aautologoff;	
		this.ackcall = aackcall;	
		this.wrapuptime = awrapuptime;	
		this.music_class = amusic_class;	
		this.custom_beep = acustom_beep;	
		this.group = agroup;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Agentsconf object){
		this.autologoff = object.autologoff;	
		this.ackcall = object.ackcall;	
		this.wrapuptime = object.wrapuptime;	
		this.music_class = object.music_class;	
		this.custom_beep = object.custom_beep;	
		this.group = object.group;	

	}
//--------------  map Funktionen
	//public static final String AGENTSMAP = "agentsMap";
	/** die typisierte List die die Aggregierten objekte(AgentsImpl) enthält */
	protected List<Agents> agentsMap = new ArrayList<Agents>();
	/** die typisierte Map die die Aggregierten objekte(AgentsImpl) enthält */
	//protected AgentsMap agentsMapMap = new AgentsMap();

	/**
	 * fügt ein Agents Objekt zu der Mapp hinzu
	 * @param aAgents
	 */
	public boolean addAgents(Agents aAgents){
		return agentsMap.add(aAgents);
	}

	/**
	 * removed ein Agents Objekt aus der Map
	 * @param aAgents
	 */
	public boolean removeAgents(Agents aAgents){
		return agentsMap.remove(aAgents);
	}

	

/**
 * gibt die List<Agents> agentsMap zurück	
 * @return List<Agents>
 * @see  IAgentsconf#getAgentsMap
 */
public List<Agents> getAgentsMap() {
	return agentsMap;
}
/**
 * setzt die Map AgentsMap
 * @param map agentsMapMap
 */
 @SuppressWarnings("unchecked")
public void setAgentsMap(List aList){
    agentsMap = aList;
   // agentsMapTyper.setList(aList); 
}

//--------------  Aggregat Funktionen
// ------   1-1 aggregates
protected Agentsrecording fAgentsrecording= new AgentsrecordingImpl();
/**
 * @return
 */
public Agentsrecording getAgentsrecording() {
	return fAgentsrecording;
}

/**
 * setzt den Agentsrecording und die Agentsrecordingid	
 * @param Agentsrecording
 */
public void setAgentsrecording(IAgentsrecording aAgentsrecording) {
	if (aAgentsrecording!=null) {
	fAgentsrecording = (Agentsrecording)aAgentsrecording;
	//agentsrecording = aAgentsrecording.get();
	} //end of if
	
}
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Define autologoff times if appropriate. This is how long

the phone has to ring with no answer before the agent is

automatically logged off (in seconds). Please note that if

this value is greater than the timeout value in your queue

that agents will not be removed! **/
	protected String autologoff;
	public static final String VALUEID_AUTOLOGOFF="autologoff" ;

    /**  Define ackcall to require an acknowledgement by '#' when

an agent logs in over agentcallpark. Default is "yes". **/
	protected String ackcall;
	public static final String VALUEID_ACKCALL="ackcall" ;

    /**  Define wrapuptime. This is the minimum amount of time when

after disconnecting before the caller can receive a new call

note this is in milliseconds. **/
	protected String wrapuptime;
	public static final String VALUEID_WRAPUPTIME="wrapuptime" ;

    /**  Define the default musiconhold for agents

musiconhold **/
	protected String music_class;
	public static final String VALUEID_MUSIC_CLASS="music_class" ;

    /**  An optional custom beep sound file to play to always-connected agents. **/
	protected String custom_beep;
	public static final String VALUEID_CUSTOM_BEEP="custom_beep" ;

    /**  Group memberships for agents (may change in mid-file just) **/
	protected String group;
	public static final String VALUEID_GROUP="group" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_AUTOLOGOFF.equals(valueid)){
			return true;
		}
		if(VALUEID_ACKCALL.equals(valueid)){
			return true;
		}
		if(VALUEID_WRAPUPTIME.equals(valueid)){
			return true;
		}
		if(VALUEID_MUSIC_CLASS.equals(valueid)){
			return true;
		}
		if(VALUEID_CUSTOM_BEEP.equals(valueid)){
			return true;
		}
		if(VALUEID_GROUP.equals(valueid)){
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
		if(VALUEID_AUTOLOGOFF.equals(valueid)){
			setAutologoff((String)data);
			return;
		}
		if(VALUEID_ACKCALL.equals(valueid)){
			setAckcall((String)data);
			return;
		}
		if(VALUEID_WRAPUPTIME.equals(valueid)){
			setWrapuptime((String)data);
			return;
		}
		if(VALUEID_MUSIC_CLASS.equals(valueid)){
			setMusic_class((String)data);
			return;
		}
		if(VALUEID_CUSTOM_BEEP.equals(valueid)){
			setCustom_beep((String)data);
			return;
		}
		if(VALUEID_GROUP.equals(valueid)){
			setGroup((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_AUTOLOGOFF.equals(valueid)){
			return getAutologoff();
			
		}
		if(VALUEID_ACKCALL.equals(valueid)){
			return getAckcall();
			
		}
		if(VALUEID_WRAPUPTIME.equals(valueid)){
			return getWrapuptime();
			
		}
		if(VALUEID_MUSIC_CLASS.equals(valueid)){
			return getMusic_class();
			
		}
		if(VALUEID_CUSTOM_BEEP.equals(valueid)){
			return getCustom_beep();
			
		}
		if(VALUEID_GROUP.equals(valueid)){
			return getGroup();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getautologoff 
	* Define autologoff times if appropriate. This is how long

the phone has to ring with no answer before the agent is

automatically logged off (in seconds). Please note that if

this value is greater than the timeout value in your queue

that agents will not be removed!
	**/
	public String getAutologoff(){		return  autologoff;
	}
	/**
	*setautologoff 
	*/
	public void setAutologoff(String aautologoff){
		if(aautologoff==null){
		    changed = (this.autologoff!=null);
		    this.autologoff = null;	    
		}else{
			changed = aautologoff.equals(this.autologoff);
			this.autologoff=aautologoff;
		}
	}


	/**
	* getackcall 
	* Define ackcall to require an acknowledgement by '#' when

an agent logs in over agentcallpark. Default is "yes".
	**/
	public String getAckcall(){		return  ackcall;
	}
	/**
	*setackcall 
	*/
	public void setAckcall(String aackcall){
		if(aackcall==null){
		    changed = (this.ackcall!=null);
		    this.ackcall = null;	    
		}else{
			changed = aackcall.equals(this.ackcall);
			this.ackcall=aackcall;
		}
	}


	/**
	* getwrapuptime 
	* Define wrapuptime. This is the minimum amount of time when

after disconnecting before the caller can receive a new call

note this is in milliseconds.
	**/
	public String getWrapuptime(){		return  wrapuptime;
	}
	/**
	*setwrapuptime 
	*/
	public void setWrapuptime(String awrapuptime){
		if(awrapuptime==null){
		    changed = (this.wrapuptime!=null);
		    this.wrapuptime = null;	    
		}else{
			changed = awrapuptime.equals(this.wrapuptime);
			this.wrapuptime=awrapuptime;
		}
	}


	/**
	* getmusic_class 
	* Define the default musiconhold for agents

musiconhold
	**/
	public String getMusic_class(){		return  music_class;
	}
	/**
	*setmusic_class 
	*/
	public void setMusic_class(String amusic_class){
		if(amusic_class==null){
		    changed = (this.music_class!=null);
		    this.music_class = null;	    
		}else{
			changed = amusic_class.equals(this.music_class);
			this.music_class=amusic_class;
		}
	}


	/**
	* getcustom_beep 
	* An optional custom beep sound file to play to always-connected agents.
	**/
	public String getCustom_beep(){		return  custom_beep;
	}
	/**
	*setcustom_beep 
	*/
	public void setCustom_beep(String acustom_beep){
		if(acustom_beep==null){
		    changed = (this.custom_beep!=null);
		    this.custom_beep = null;	    
		}else{
			changed = acustom_beep.equals(this.custom_beep);
			this.custom_beep=acustom_beep;
		}
	}


	/**
	* getgroup 
	* Group memberships for agents (may change in mid-file just)
	**/
	public String getGroup(){		return  group;
	}
	/**
	*setgroup 
	*/
	public void setGroup(String agroup){
		if(agroup==null){
		    changed = (this.group!=null);
		    this.group = null;	    
		}else{
			changed = agroup.equals(this.group);
			this.group=agroup;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("autologoff=")
		.append(autologoff)
		.append(",")
		.append("ackcall=")
		.append(ackcall)
		.append(",")
		.append("wrapuptime=")
		.append(wrapuptime)
		.append(",")
		.append("music_class=")
		.append(music_class)
		.append(",")
		.append("custom_beep=")
		.append(custom_beep)
		.append(",")
		.append("group=")
		.append(group)
    			.append("]");

		return sb.toString();		
	}}