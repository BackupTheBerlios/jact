

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ILookupBlacklist<br>
 * Looks up the Caller*ID number on the active channel in the Asterisk database (family 'blacklist'). If the number is found, and if there exists a priority n + 101, where 'n' is the priority of the current instance, then the channel will be setup to continue at that priority level. Otherwise, it returns 0. Does nothing if no Caller*ID was received on the channel. Example: database put blacklist <name/number> 1
 * </p>
 * Created : Wed Jul 05 18:54:00 CEST 2006
 * 
 * @behavior.elementname LookupBlacklist
 * @author urs
 * @version $Revision: 1.1 $, $Id: ILookupBlacklist.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  ILookupBlacklist {
public static final String MODELNAME = "LookupBlacklist";	
 
// ------   1-1 aggregates
	//test
	//---------  getter und setter

}