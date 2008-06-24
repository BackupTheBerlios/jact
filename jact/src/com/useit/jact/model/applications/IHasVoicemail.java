

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IHasVoicemail<br>
 * Branches to priority + 101, if there is voicemail in folder indicated. Optionally sets <varname> to the number of messages in that folder. Assumes folder of INBOX if not specified.
 * </p>
 * Created : Wed Jul 05 18:55:54 CEST 2006
 * 
 * @behavior.elementname HasVoicemail
 * @author urs
 * @version $Revision: 1.1 $, $Id: IHasVoicemail.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IHasVoicemail {
public static final String MODELNAME = "HasVoicemail";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_VMBOX="vmbox" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_FOLDER="folder" ;
// 	public static final String VALUEID_VARNAME="varname" ;
	//test
	//---------  getter und setter
	/**
	* getvmbox 
	* 
	* @behavior.fieldname vmbox 
	**/
	public String getVmbox();
	
	/**
	*setvmbox 
	* 
	* @behavior.fieldname vmbox 
	*/
	public void setVmbox(String avmbox);
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
	* getfolder 
	* 
	* @behavior.fieldname folder 
	**/
	public String getFolder();
	
	/**
	*setfolder 
	* 
	* @behavior.fieldname folder 
	*/
	public void setFolder(String afolder);
	/**
	* getvarname 
	* 
	* @behavior.fieldname varname 
	**/
	public String getVarname();
	
	/**
	*setvarname 
	* 
	* @behavior.fieldname varname 
	*/
	public void setVarname(String avarname);

}