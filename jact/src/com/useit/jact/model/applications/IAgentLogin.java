

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAgentLogin<br>
 * Asks the agent to login to the system. Always returns -1. While logged in, the agent can receive calls and will hear a 'beep' when a new call comes in. The agent can dump the call by pressing the star key. The option string may contain zero or more of the following characters:  's' -- silent login - do not announce the login ok segment after agent logged in/off
 * </p>
 * Created : Wed Jul 05 18:56:11 CEST 2006
 * 
 * @behavior.elementname AgentLogin
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAgentLogin.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IAgentLogin {
public static final String MODELNAME = "AgentLogin";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_AGENTNO="agentno" ;
// 	public static final String VALUEID_OPTIONS="options" ;
	//test
	//---------  getter und setter
	/**
	* getagentNo 
	* 
	* @behavior.fieldname agentNo 
	**/
	public String getAgentNo();
	
	/**
	*setagentNo 
	* 
	* @behavior.fieldname agentNo 
	*/
	public void setAgentNo(String aagentNo);
	/**
	* getoptions 
	* 
	* @behavior.fieldname options 
	**/
	public String getOptions();
	
	/**
	*setoptions 
	* 
	* @behavior.fieldname options 
	*/
	public void setOptions(String aoptions);

}