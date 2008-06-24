

package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * IExtension<br>
 * Extension names may be numbers, letters, or combinations thereof. If an extension name is prefixed by a '_' character, it is interpreted as a pattern rather than a literal.  In patterns, some characters have special meanings:
 * </p>
 * Created : Wed May 31 09:04:11 CEST 2006
 * 
 * @behavior.elementname Extension
 * @author urs
 * @version $Revision: 1.1 $, $Id: IExtension.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IExtension {
public static final String MODELNAME = "Extension";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_EXTEN="exten" ;
// 	public static final String VALUEID_PRIORITY="priority" ;
// 	public static final String VALUEID_APPLICATION="application" ;
	
	//---------  getter und setter
	
	/**
	* getexten 
	* extension is the label of the extension, and can be either a literal constant string (alphanumeric plus a few special symols allowed) or a dynamically evaluated pattern (see below) to match many possible phone numbers, for example. Every command line that is part of a given extensions has this same label.
	* @behavior.fieldname exten 
	**/
	public String getExten();
	
	/**
	*setexten 
	* extension is the label of the extension, and can be either a literal constant string (alphanumeric plus a few special symols allowed) or a dynamically evaluated pattern (see below) to match many possible phone numbers, for example. Every command line that is part of a given extensions has this same label.
	* @behavior.fieldname exten 
	*/
	public void setExten(String aexten);


	/**
	* getpriority 
	* priority is usually an integer (see note, however). It's just a sequence number for each command line of an extension. The first executable command of an extensions has the priority "1", so when Asterisk transfers a call to an extension, it will look for a command with priority 1. If there is not a line with a priority of 1, then the extension will not match the dialed number. After executing the priority 1 command, Asterisk will increment the priority to "2" unless the command itself determines the next priority to be executed. If this next priority is not defined in the extension, Asterisk finishes processing for this extension, even if there exists another command with a priority higher than the missing one.
	* @behavior.fieldname priority 
	**/
	public Integer getPriority();
	
	/**
	*setpriority 
	* priority is usually an integer (see note, however). It's just a sequence number for each command line of an extension. The first executable command of an extensions has the priority "1", so when Asterisk transfers a call to an extension, it will look for a command with priority 1. If there is not a line with a priority of 1, then the extension will not match the dialed number. After executing the priority 1 command, Asterisk will increment the priority to "2" unless the command itself determines the next priority to be executed. If this next priority is not defined in the extension, Asterisk finishes processing for this extension, even if there exists another command with a priority higher than the missing one.
	* @behavior.fieldname priority 
	*/
	public void setPriority(Integer apriority);


	/**
	* getapplication 
	* command is the name of the command (also called an "application") to execute.
	* @behavior.fieldname application 
	**/
	public PbxApplication getApplication();
	
	/**
	*setapplication 
	* command is the name of the command (also called an "application") to execute.
	* @behavior.fieldname application 
	*/
	public void setApplication(PbxApplication aapplication);


}