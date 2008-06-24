

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISystem<br>
 * Executes a command by using system(). Returns -1 on failure to execute the specified command. If the command itself executes but is in error, and if there exists a priority n + 101, where 'n' is the priority of the current instance, then the channel will be setup to continue at that priority level. Otherwise, System returns 0.
 * </p>
 * Created : Wed Jul 05 18:54:52 CEST 2006
 * 
 * @behavior.elementname System
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISystem.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ISystem {
public static final String MODELNAME = "System";	
 
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