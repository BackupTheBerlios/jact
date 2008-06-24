

package com.useit.jact.model.agentconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAgents<br>
 * this last section contains the definition of the agents.
 * </p>
 * Created : Fri May 26 14:30:33 CEST 2006
 * 
 * @behavior.elementname Agents
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAgents.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $
 */
 public  interface  IAgents {
public static final String MODELNAME = "Agents";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_AGENTID="agentid" ;
// 	public static final String VALUEID_AGENTPASSWORD="agentpassword" ;
// 	public static final String VALUEID_NAME="name" ;
	
	//---------  getter und setter

	/**
	* getagentid 
	* the agent id
	* @behavior.fieldname agentid 
	**/
	public String getAgentid();
	
	/**
	*setagentid 
	* the agent id
	* @behavior.fieldname agentid 
	*/
	public void setAgentid(String aagentid);


	/**
	* getagentpassword 
	* the passwort
	* @behavior.fieldname agentpassword 
	**/
	public String getAgentpassword();
	
	/**
	*setagentpassword 
	* the passwort
	* @behavior.fieldname agentpassword 
	*/
	public void setAgentpassword(String aagentpassword);


	/**
	* getname 
	* the name
	* @behavior.fieldname name 
	**/
	public String getName();
	
	/**
	*setname 
	* the name
	* @behavior.fieldname name 
	*/
	public void setName(String aname);


}