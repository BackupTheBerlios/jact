

package com.useit.jact.model.agentconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IAgentsconf<br>
 * ACD distributes incoming calls to the agents of a Queue.
 * </p>
 * Created : Fri May 26 14:30:33 CEST 2006
 * 
 * @behavior.elementname Agentsconf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAgentsconf.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $
 */
 public  interface  IAgentsconf {
public static final String MODELNAME = "Agentsconf";	

/**
 * gibt die List<Agents> agentsMap zurück	
 * @return List<Agents>
 * @behavior.list AgentsMap 
 * @behavior.list.type Agents 
 */
public List getAgentsMap();
/**
 * setzt die Map AgentsMap
 * @param map agentsMapMap
 * @behavior.list AgentsMap 
 * @behavior.list.type Agents 
 */
public void setAgentsMap(List aList);
 
// ------   1-1 aggregates
/**
 * @return Agentsrecording the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Agentsrecording 
 */
public IAgentsrecording getAgentsrecording();

/**
 * setzt den Agentsrecording und die Agentsrecordingid	
 * @param Agentsrecording
 */
public void setAgentsrecording(IAgentsrecording aAgentsrecording);
// 	public static final String VALUEID_AUTOLOGOFF="autologoff" ;
// 	public static final String VALUEID_ACKCALL="ackcall" ;
// 	public static final String VALUEID_WRAPUPTIME="wrapuptime" ;
// 	public static final String VALUEID_MUSIC_CLASS="music_class" ;
// 	public static final String VALUEID_CUSTOM_BEEP="custom_beep" ;
// 	public static final String VALUEID_GROUP="group" ;
	
	//---------  getter und setter

	/**
	* getautologoff 
	* Define autologoff times if appropriate. This is how long

the phone has to ring with no answer before the agent is

automatically logged off (in seconds). Please note that if

this value is greater than the timeout value in your queue

that agents will not be removed!
	* @behavior.fieldname autologoff 
	**/
	public String getAutologoff();
	
	/**
	*setautologoff 
	* Define autologoff times if appropriate. This is how long

the phone has to ring with no answer before the agent is

automatically logged off (in seconds). Please note that if

this value is greater than the timeout value in your queue

that agents will not be removed!
	* @behavior.fieldname autologoff 
	*/
	public void setAutologoff(String aautologoff);


	/**
	* getackcall 
	* Define ackcall to require an acknowledgement by '#' when

an agent logs in over agentcallpark. Default is "yes".
	* @behavior.fieldname ackcall 
	**/
	public String getAckcall();
	
	/**
	*setackcall 
	* Define ackcall to require an acknowledgement by '#' when

an agent logs in over agentcallpark. Default is "yes".
	* @behavior.fieldname ackcall 
	*/
	public void setAckcall(String aackcall);


	/**
	* getwrapuptime 
	* Define wrapuptime. This is the minimum amount of time when

after disconnecting before the caller can receive a new call

note this is in milliseconds.
	* @behavior.fieldname wrapuptime 
	**/
	public String getWrapuptime();
	
	/**
	*setwrapuptime 
	* Define wrapuptime. This is the minimum amount of time when

after disconnecting before the caller can receive a new call

note this is in milliseconds.
	* @behavior.fieldname wrapuptime 
	*/
	public void setWrapuptime(String awrapuptime);


	/**
	* getmusic_class 
	* Define the default musiconhold for agents

musiconhold
	* @behavior.fieldname music_class 
	**/
	public String getMusic_class();
	
	/**
	*setmusic_class 
	* Define the default musiconhold for agents

musiconhold
	* @behavior.fieldname music_class 
	*/
	public void setMusic_class(String amusic_class);


	/**
	* getcustom_beep 
	* An optional custom beep sound file to play to always-connected agents.
	* @behavior.fieldname custom_beep 
	**/
	public String getCustom_beep();
	
	/**
	*setcustom_beep 
	* An optional custom beep sound file to play to always-connected agents.
	* @behavior.fieldname custom_beep 
	*/
	public void setCustom_beep(String acustom_beep);


	/**
	* getgroup 
	* Group memberships for agents (may change in mid-file just)
	* @behavior.fieldname group 
	**/
	public String getGroup();
	
	/**
	*setgroup 
	* Group memberships for agents (may change in mid-file just)
	* @behavior.fieldname group 
	*/
	public void setGroup(String agroup);


}