

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMeetMeAdmin<br>
 * Run admin command for conference  'K' -- Kick all users out of conference  'k' -- Kick one user out of conference  'e' -- Eject last user that joined  'L' -- Lock conference  'l' -- Unlock conference  'M' -- Mute conference  'm' -- Unmute conference  'N' -- Mute entire conference (except admin)  'n' -- Unmute entire conference (except admin)
 * </p>
 * Created : Wed Jul 05 18:54:56 CEST 2006
 * 
 * @behavior.elementname MeetMeAdmin
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMeetMeAdmin.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IMeetMeAdmin {
public static final String MODELNAME = "MeetMeAdmin";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONFNO="confno" ;
// 	public static final String VALUEID_COMMAND="command" ;
// 	public static final String VALUEID_USER="user" ;
	//test
	//---------  getter und setter
	/**
	* getconfno 
	* 
	* @behavior.fieldname confno 
	**/
	public String getConfno();
	
	/**
	*setconfno 
	* 
	* @behavior.fieldname confno 
	*/
	public void setConfno(String aconfno);
	/**
	* getcommand 
	* 
	* @behavior.fieldname command 
	**/
	public String getCommand();
	
	/**
	*setcommand 
	* 
	* @behavior.fieldname command 
	*/
	public void setCommand(String acommand);
	/**
	* getuser 
	* 
	* @behavior.fieldname user 
	**/
	public String getUser();
	
	/**
	*setuser 
	* 
	* @behavior.fieldname user 
	*/
	public void setUser(String auser);

}