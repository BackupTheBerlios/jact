

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IChangeMonitor<br>
 * Changes monitoring filename of a channel. Has no effect if the channel is not monitored The argument is the new filename base to use for monitoring this channel.
 * </p>
 * Created : Wed Jul 05 18:53:39 CEST 2006
 * 
 * @behavior.elementname ChangeMonitor
 * @author urs
 * @version $Revision: 1.1 $, $Id: IChangeMonitor.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IChangeMonitor {
public static final String MODELNAME = "ChangeMonitor";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FILENAME_BASE="filename_base" ;
	//test
	//---------  getter und setter
	/**
	* getfilename_base 
	* 
	* @behavior.fieldname filename_base 
	**/
	public String getFilename_base();
	
	/**
	*setfilename_base 
	* 
	* @behavior.fieldname filename_base 
	*/
	public void setFilename_base(String afilename_base);

}