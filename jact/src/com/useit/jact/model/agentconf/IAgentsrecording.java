

package com.useit.jact.model.agentconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAgentsrecording<br>
 * This section is devoted to recording agent's calls The keywords are global to the chan_agent channel driver
 * </p>
 * Created : Fri May 26 14:30:34 CEST 2006
 * 
 * @behavior.elementname Agentsrecording
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAgentsrecording.java,v 1.1 2008/06/24 20:45:19 urszeidler Exp $
 */
 public  interface  IAgentsrecording {
public static final String MODELNAME = "Agentsrecording";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_RECORDAGENTCALLS="recordagentcalls" ;
// 	public static final String VALUEID_RECORDFORMAT="recordformat" ;
// 	public static final String VALUEID_CREATELINK="createlink" ;
// 	public static final String VALUEID_URLPREFIX="urlprefix" ;
// 	public static final String VALUEID_SAVECALLSIN="savecallsin" ;
	
	//---------  getter und setter

	/**
	* getrecordagentcalls 
	* Enable recording calls addressed to agents. It's turned off by default.
	* @behavior.fieldname recordagentcalls 
	**/
	public Boolean getRecordagentcalls();
	
	/**
	*setrecordagentcalls 
	* Enable recording calls addressed to agents. It's turned off by default.
	* @behavior.fieldname recordagentcalls 
	*/
	public void setRecordagentcalls(Boolean arecordagentcalls);


	/**
	* getrecordformat 
	* The format to be used to record the calls (wav, gsm, wav49)

By default its "wav".
	* @behavior.fieldname recordformat 
	**/
	public String getRecordformat();
	
	/**
	*setrecordformat 
	* The format to be used to record the calls (wav, gsm, wav49)

By default its "wav".
	* @behavior.fieldname recordformat 
	*/
	public void setRecordformat(String arecordformat);


	/**
	* getcreatelink 
	* Insert into CDR userfield a name of the the created recording

By default it's turned off.
	* @behavior.fieldname createlink 
	**/
	public String getCreatelink();
	
	/**
	*setcreatelink 
	* Insert into CDR userfield a name of the the created recording

By default it's turned off.
	* @behavior.fieldname createlink 
	*/
	public void setCreatelink(String acreatelink);


	/**
	* geturlprefix 
	* The text to be added to the name of the recording. Allows forming a url link.
	* @behavior.fieldname urlprefix 
	**/
	public String getUrlprefix();
	
	/**
	*seturlprefix 
	* The text to be added to the name of the recording. Allows forming a url link.
	* @behavior.fieldname urlprefix 
	*/
	public void setUrlprefix(String aurlprefix);


	/**
	* getsavecallsin 
	* The optional directory to save the conversations in. The default is

/var/spool/asterisk/monitor
	* @behavior.fieldname savecallsin 
	**/
	public String getSavecallsin();
	
	/**
	*setsavecallsin 
	* The optional directory to save the conversations in. The default is

/var/spool/asterisk/monitor
	* @behavior.fieldname savecallsin 
	*/
	public void setSavecallsin(String asavecallsin);


}