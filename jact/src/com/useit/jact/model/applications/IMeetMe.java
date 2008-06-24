

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMeetMe<br>
 * Enters the user into a specified MeetMe conference. If the conference number is omitted, the user will be prompted to enter one.  MeetMe returns 0 if user pressed # to exit (see option 'p'), otherwise -1. Please note: A ZAPTEL INTERFACE MUST BE INSTALLED FOR CONFERENCING TO WORK!  The option string may contain zero or more of the following characters:  'm' -- set monitor only mode (Listen only, no talking)  't' -- set talk only mode. (Talk only, no listening)  'T' -- set talker detection (sent to manager interface and meetme list)  'i' -- announce user join/leave  'p' -- allow user to exit the conference by pressing '#'  'X' -- allow user to exit the conference by entering a valid single  digit extension ${MEETME_EXIT_CONTEXT} or the current context  if that variable is not defined.  'd' -- dynamically add conference  'D' -- dynamically add conference, prompting for a PIN  'e' -- select an empty conference  'E' -- select an empty pinless conference  'v' -- video mode  'r' -- Record conference (records as ${MEETME_RECORDINGFILE}  using format ${MEETME_RECORDINGFORMAT}). Default filename is  meetme-conf-rec-${CONFNO}-${UNIQUEID} and the default format is wav.  'q' -- quiet mode (don't play enter/leave sounds)  'M' -- enable music on hold when the conference has a single caller  'x' -- close the conference when last marked user exits  'w' -- wait until the marked user enters the conference  'b' -- run AGI script specified in ${MEETME_AGI_BACKGROUND}  Default: conf-background.agi  (Note: This does not work with non-Zap channels in the same conference)  's' -- Present menu (user or admin) when '*' is received ('send' to menu)  'a' -- set admin mode  'A' -- set marked mode  'P' -- always prompt for the pin even if it is specified
 * </p>
 * Created : Wed Jul 05 18:56:14 CEST 2006
 * 
 * @behavior.elementname MeetMe
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMeetMe.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IMeetMe {
public static final String MODELNAME = "MeetMe";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONFNO="confno" ;
// 	public static final String VALUEID_OPTIONS="options" ;
// 	public static final String VALUEID_PIN="pin" ;
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
	* getpin 
	* 
	* @behavior.fieldname pin 
	**/
	public String getPin();
	
	/**
	*setpin 
	* 
	* @behavior.fieldname pin 
	*/
	public void setPin(String apin);

}