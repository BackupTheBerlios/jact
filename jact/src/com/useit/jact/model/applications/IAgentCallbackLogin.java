

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.AbstractExtension;


/**
 * <p>
 * IAgentCallbackLogin<br>
 * Asks the agent to login to the system with callback. The agent's callback extension is called (optionally with the specified context). The option string may contain zero or more of the following characters:  's' -- silent login - do not announce the login ok segment agent logged in/off
 * </p>
 * Created : Wed Jul 05 18:53:38 CEST 2006
 * 
 * @behavior.elementname AgentCallbackLogin
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAgentCallbackLogin.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IAgentCallbackLogin {
public static final String MODELNAME = "AgentCallbackLogin";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_AGENTNO="agentno" ;
// 	public static final String VALUEID_EXTENSION="extension" ;
// 	public static final String VALUEID_OPTIONS="options" ;
// 	public static final String VALUEID_EXTEN="exten" ;
// 	public static final String VALUEID_CONTEXT="context" ;
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
	* getextension 
	* 
	* @behavior.fieldname extension 
	**/
	public AbstractExtension getExtension();
	
	/**
	*setextension 
	* 
	* @behavior.fieldname extension 
	*/
	public void setExtension(AbstractExtension aextension);
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
	/**
	* getexten 
	* 
	* @behavior.fieldname exten 
	**/
	public String getExten();
	
	/**
	*setexten 
	* 
	* @behavior.fieldname exten 
	*/
	public void setExten(String aexten);
	/**
	* getcontext 
	* 
	* @behavior.fieldname context 
	**/
	public String getContext();
	
	/**
	*setcontext 
	* 
	* @behavior.fieldname context 
	*/
	public void setContext(String acontext);

}