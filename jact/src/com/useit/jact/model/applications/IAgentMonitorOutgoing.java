

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAgentMonitorOutgoing<br>
 * Tries to figure out the id of the agent who is placing outgoing call based on comparision of the callerid of the current interface and the global variable  placed by the AgentCallbackLogin application. That's why it should be used only with the AgentCallbackLogin app. Uses the monitoring functions in chan_agent  instead of Monitor application. That have to be configured in the agents.conf file.  Return value: Normally the app returns 0 unless the options are passed. Also if the callerid or the agentid are not specified it'll look for n+101 priority.  Options:  'd' - make the app return -1 if there is an error condition and there is   no extension n+101  'c' - change the CDR so that the source of the call is 'Agent/agent_id'  'n' - don't generate the warnings when there is no callerid or the   agentid is not known.  It's handy if you want to have one context for agent and non-agent calls.
 * </p>
 * Created : Wed Jul 05 18:54:18 CEST 2006
 * 
 * @behavior.elementname AgentMonitorOutgoing
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAgentMonitorOutgoing.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IAgentMonitorOutgoing {
public static final String MODELNAME = "AgentMonitorOutgoing";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_OPTIONS="options" ;
	//test
	//---------  getter und setter
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