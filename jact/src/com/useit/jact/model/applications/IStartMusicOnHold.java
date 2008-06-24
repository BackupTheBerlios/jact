

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IStartMusicOnHold<br>
 * Starts playing music on hold, uses default music class for channel. Starts playing music specified by class. If omitted, the default music source for the channel will be used. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:54:41 CEST 2006
 * 
 * @behavior.elementname StartMusicOnHold
 * @author urs
 * @version $Revision: 1.1 $, $Id: IStartMusicOnHold.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IStartMusicOnHold {
public static final String MODELNAME = "StartMusicOnHold";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CLASS_="class_" ;
	//test
	//---------  getter und setter
	/**
	* getclass_ 
	* 
	* @behavior.fieldname class_ 
	**/
	public String getClass_();
	
	/**
	*setclass_ 
	* 
	* @behavior.fieldname class_ 
	*/
	public void setClass_(String aclass_);

}