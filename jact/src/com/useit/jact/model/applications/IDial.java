

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDial<br>
 * Requests one or more channels and places specified outgoing calls on them. As soon as a channel answers, the Dial app will answer the originating channel (if it needs to be answered) and will bridge a call with the channel which first answered. All other calls placed by the Dial app will be hung up. If a timeout is not specified, the Dial application will wait indefinitely until either one of the called channels answers, the user hangs up, or all channels return busy or error. In general, the dialer will return 0 if it was unable to place the call, or the timeout expired. However, if all channels were busy, and there exists an extension with priority n+101 (where n is the priority of the dialer instance), then it will be the next executed extension (this allows you to setup different behavior on busy from no-answer).  This application returns -1 if the originating channel hangs up, or if the call is bridged and either of the parties in the bridge terminate the call. The option string may contain zero or more of the following characters:  'd' -- allow the calling user to dial a 1 digit extension while waiting for a call to  be answered exiting to that extension if it exists in the context defined by  ${EXITCONTEXT} or the current context.  't' -- allow the called user to transfer the calling user by hitting #.  'T' -- allow the calling user to transfer the call by hitting #.  'w' -- allow the called user to write the conversation to disk via app_monitor  'W' -- allow the calling user to write the conversation to disk via app_monitor  'f' -- Forces callerid to be set as the extension of the line   making/redirecting the outgoing call. For example, some PSTNs  don't allow callerids from other extensions then the ones  that are assigned to you.  'o' -- Original (inbound) Caller*ID should be placed on the outbound leg of the call  instead of using the destination extension (old style asterisk behavior)  'r' -- indicate ringing to the calling party, pass no audio until answered.  'm[(class)]' -- provide hold music to the calling party until answered (optionally  with the specified class.  'M(x[^arg]) -- Executes the macro (x with ^ delim arg list) upon connect of the call.  Also, the macro can set the MACRO_RESULT variable to do the following:  -- ABORT - Hangup both legs of the call.  -- CONGESTION - Behave as if line congestion was encountered.  -- BUSY - Behave as if a busy signal was encountered. (n+101)  -- CONTINUE - Hangup the called party and continue on in the dialplan.  -- GOTO:<context>^<exten>^<priority> - Transfer the call.  'h' -- allow callee to hang up by hitting *.  'H' -- allow caller to hang up by hitting *.  'C' -- reset call detail record for this call.  'P[(x)]' -- privacy mode, using 'x' as database if provided.  'g' -- goes on in context if the destination channel hangs up  'A(x)' -- play an announcement to the called party, using x as file  'S(x)' -- hangup the call after x seconds AFTER called party picked up  'D([digits])' -- Send DTMF digit string *after* called party has answered  but before the bridge. (w=500ms sec pause)  'L(x[:y][:z])' -- Limit the call to 'x' ms warning when 'y' ms are left  repeated every 'z' ms) Only 'x' is required, 'y' and 'z' are optional.  The following special variables are optional:  * LIMIT_PLAYAUDIO_CALLER yes|no (default yes)  Play sounds to the caller.  * LIMIT_PLAYAUDIO_CALLEE yes|no  Play sounds to the callee.  * LIMIT_TIMEOUT_FILE File to play when time is up.  * LIMIT_CONNECT_FILE File to play when call begins.  * LIMIT_WARNING_FILE File to play as warning if 'y' is defined.  'timeleft' is a special sound macro to auto-say the time   left and is the default.   In addition to transferring the call, a call may be parked and then picked up by another user.  The optional URL will be sent to the called party if the channel supports it.  If the OUTBOUND_GROUP variable is set, all peer channels created by this  application will be put into that group (as in SetGroup).  This application sets the following channel variables upon completion:  DIALEDTIME Time from dial to answer  ANSWEREDTIME Time for actual call  DIALSTATUS The status of the call as a text string, one of  CHANUNAVAIL | CONGESTION | NOANSWER | BUSY | ANSWER | CANCEL
 * </p>
 * Created : Wed Jul 05 18:54:01 CEST 2006
 * 
 * @behavior.elementname Dial
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDial.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IDial {
public static final String MODELNAME = "Dial";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TECHNOLOGY="technology" ;
// 	public static final String VALUEID_RESOURCE="resource" ;
// 	public static final String VALUEID_TECHNOLOGY2="technology2" ;
// 	public static final String VALUEID_RESOURCE2="resource2" ;
// 	public static final String VALUEID_TIMEOUT="timeout" ;
// 	public static final String VALUEID_OPTIONS="options" ;
// 	public static final String VALUEID_URL="url" ;
	//test
	//---------  getter und setter
	/**
	* gettechnology 
	* 
	* @behavior.fieldname technology 
	**/
	public String getTechnology();
	
	/**
	*settechnology 
	* 
	* @behavior.fieldname technology 
	*/
	public void setTechnology(String atechnology);
	/**
	* getresource 
	* 
	* @behavior.fieldname resource 
	**/
	public String getResource();
	
	/**
	*setresource 
	* 
	* @behavior.fieldname resource 
	*/
	public void setResource(String aresource);
	/**
	* gettechnology2 
	* 
	* @behavior.fieldname technology2 
	**/
	public String getTechnology2();
	
	/**
	*settechnology2 
	* 
	* @behavior.fieldname technology2 
	*/
	public void setTechnology2(String atechnology2);
	/**
	* getresource2 
	* 
	* @behavior.fieldname resource2 
	**/
	public String getResource2();
	
	/**
	*setresource2 
	* 
	* @behavior.fieldname resource2 
	*/
	public void setResource2(String aresource2);
	/**
	* gettimeout 
	* 
	* @behavior.fieldname timeout 
	**/
	public String getTimeout();
	
	/**
	*settimeout 
	* 
	* @behavior.fieldname timeout 
	*/
	public void setTimeout(String atimeout);
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
	* getuRL 
	* 
	* @behavior.fieldname uRL 
	**/
	public String getURL();
	
	/**
	*setuRL 
	* 
	* @behavior.fieldname uRL 
	*/
	public void setURL(String auRL);

}