

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IHasNewVoicemail<br>
 * Branches to priority + 101, if there is voicemail in folder 'folder' or INBOX. if folder is not specified. Optionally sets <varname> to the number of messages in that folder.
 * </p>
 * Created : Wed Jul 05 18:54:51 CEST 2006
 * 
 * @behavior.elementname HasNewVoicemail
 * @author urs
 * @version $Revision: 1.1 $, $Id: IHasNewVoicemail.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IHasNewVoicemail {
public static final String MODELNAME = "HasNewVoicemail";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_VMBOX="vmbox" ;
// 	public static final String VALUEID_FOLDER="folder" ;
// 	public static final String VALUEID_CONTEXT="context" ;
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