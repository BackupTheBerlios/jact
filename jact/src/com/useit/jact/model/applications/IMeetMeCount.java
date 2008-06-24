

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMeetMeCount<br>
 * Plays back the number of users in the specifiedi MeetMe conference. If var is specified, playback will be skipped and the value will be returned in the variable. Returns 0 on success or -1 on a hangup. A ZAPTEL INTERFACE MUST BE INSTALLED FOR CONFERENCING FUNCTIONALITY.
 * </p>
 * Created : Wed Jul 05 18:55:30 CEST 2006
 * 
 * @behavior.elementname MeetMeCount
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMeetMeCount.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IMeetMeCount {
public static final String MODELNAME = "MeetMeCount";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONFNO="confno" ;
// 	public static final String VALUEID_VAR="var" ;
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
	* getvar 
	* 
	* @behavior.fieldname var 
	**/
	public String getVar();
	
	/**
	*setvar 
	* 
	* @behavior.fieldname var 
	*/
	public void setVar(String avar);

}