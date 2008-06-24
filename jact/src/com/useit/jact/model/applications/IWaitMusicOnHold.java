

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IWaitMusicOnHold<br>
 * Plays hold music specified number of seconds. Returns 0 when done, or -1 on hangup. If no hold music is available, the delay will still occur with no sound.
 * </p>
 * Created : Wed Jul 05 18:55:49 CEST 2006
 * 
 * @behavior.elementname WaitMusicOnHold
 * @author urs
 * @version $Revision: 1.1 $, $Id: IWaitMusicOnHold.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IWaitMusicOnHold {
public static final String MODELNAME = "WaitMusicOnHold";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_DELAY="delay" ;
	//test
	//---------  getter und setter
	/**
	* getdelay 
	* 
	* @behavior.fieldname delay 
	**/
	public String getDelay();
	
	/**
	*setdelay 
	* 
	* @behavior.fieldname delay 
	*/
	public void setDelay(String adelay);

}