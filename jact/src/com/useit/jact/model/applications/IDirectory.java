

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDirectory<br>
 * Presents the user with a directory of extensions from which they may select by name. The list of names  and extensions is discovered from voicemail.conf. The vm-context argument is required, and specifies the context of voicemail.conf to use. The dial-context is the context to use for dialing the users, and defaults to the vm-context if unspecified. The 'f' option causes the directory to match based on the first name in voicemail.conf instead of the last name. Returns 0 unless the user hangs up. It also sets up the channel on exit to enter the extension the user selected. If the user enters '0' and there exists an extension 'o' in the current context, the directory will exit with 0 and call control will resume at that extension. Entering '*' will exit similarly, but to the 'a' extension, much like app_voicemail's behavior.
 * </p>
 * Created : Wed Jul 05 18:54:16 CEST 2006
 * 
 * @behavior.elementname Directory
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDirectory.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IDirectory {
public static final String MODELNAME = "Directory";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_VM="vm" ;
// 	public static final String VALUEID_DIAL="dial" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_OPTIONS="options" ;
	//test
	//---------  getter und setter
	/**
	* getvm 
	* 
	* @behavior.fieldname vm 
	**/
	public String getVm();
	
	/**
	*setvm 
	* 
	* @behavior.fieldname vm 
	*/
	public void setVm(String avm);
	/**
	* getdial 
	* 
	* @behavior.fieldname dial 
	**/
	public String getDial();
	
	/**
	*setdial 
	* 
	* @behavior.fieldname dial 
	*/
	public void setDial(String adial);
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