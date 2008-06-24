

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ITrySystem<br>
 * Executes a command by using system(). Returns 0 on any situation. If the command itself executes but is in error, and if there exists a priority n + 101, where 'n' is the priority of the current instance, then the channel will be setup to continue at that priority level. Otherwise, System returns 0.
 * </p>
 * Created : Wed Jul 05 18:54:24 CEST 2006
 * 
 * @behavior.elementname TrySystem
 * @author urs
 * @version $Revision: 1.1 $, $Id: ITrySystem.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ITrySystem {
public static final String MODELNAME = "TrySystem";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_COMMAND="command" ;
	//test
	//---------  getter und setter
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

}