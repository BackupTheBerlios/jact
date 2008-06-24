

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDISA<br>
 * -- Allows someone from outside the telephone switch (PBX) to obtain an "internal" system dialtone and to place calls from it as if they were placing a call from within the switch. A user calls a number that connects to the DISA application and is given dialtone. The user enters their passcode, followed by the pound sign (#). If the passcode is correct, the user is then given system dialtone on which a call may be placed. Obviously, this type of access has SERIOUS security implications, and GREAT care must be taken NOT to compromise your security.  There is a possibility of accessing DISA without password. Simply exchange your password with no-password.   Example: exten => s,1,DISA,no-password|local  but be aware of using this for your security compromising.  The arguments to this application (in extensions.conf) allow either specification of a single global password (that everyone uses), or individual passwords contained in a file. It also allow specification of the context on which the user will be dialing. If no context is specified, the DISA application defaults the context to "disa" presumably that a normal system will have a special context set up for DISA use with some or a lot of restrictions. The arguments are one of the following:   numeric-passcode  numeric-passcode|context  full-pathname-of-file-that-contains-passcodes  The file that contains the passcodes (if used) allows specification of either just a passcode (defaulting to the "disa" context, or passcode|context on each line of the file. The file may contain blank lines, or comments starting with "#" or ";". In addition, the above arguments may have |new-callerid-string appended to them, to specify a new (different) callerid to be used for this call, for example: numeric-passcode|context|"My Phone" <(234) 123-4567> or  full-pathname-of-passcode-file|"My Phone" <(234) 123-4567>. Last but not least, |mailbox[@context] may be appended, which will cause a stutter-dialtone (indication "dialrecall") to be used, if the specified mailbox contains any new messages, for example: numeric-passcode|context||1234 (w/a changing callerid). Note that in the case of specifying the numeric-passcode, the context must be specified if the callerid is specified also.  If login is successful, the application parses the dialed number in the specified (or default) context, and returns 0 with the new extension context filled-in and the priority set to 1, so that the PBX may re-apply the routing tables to it and complete the call normally.
 * </p>
 * Created : Wed Jul 05 18:54:35 CEST 2006
 * 
 * @behavior.elementname DISA
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDISA.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IDISA {
public static final String MODELNAME = "DISA";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_DIRECT="direct" ;
// 	public static final String VALUEID_INWARD="inward" ;
// 	public static final String VALUEID_SYSTEM="system" ;
// 	public static final String VALUEID_ACCESS="access" ;
	//test
	//---------  getter und setter
	/**
	* getdirect 
	* 
	* @behavior.fieldname direct 
	**/
	public String getDirect();
	
	/**
	*setdirect 
	* 
	* @behavior.fieldname direct 
	*/
	public void setDirect(String adirect);
	/**
	* getinward 
	* 
	* @behavior.fieldname inward 
	**/
	public String getInward();
	
	/**
	*setinward 
	* 
	* @behavior.fieldname inward 
	*/
	public void setInward(String ainward);
	/**
	* getsystem 
	* 
	* @behavior.fieldname system 
	**/
	public String getSystem();
	
	/**
	*setsystem 
	* 
	* @behavior.fieldname system 
	*/
	public void setSystem(String asystem);
	/**
	* getaccess 
	* 
	* @behavior.fieldname access 
	**/
	public String getAccess();
	
	/**
	*setaccess 
	* 
	* @behavior.fieldname access 
	*/
	public void setAccess(String aaccess);

}