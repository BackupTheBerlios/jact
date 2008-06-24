

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMusicOnHold<br>
 * Plays hold music specified by class. If omitted, the default music source for the channel will be used. Set the default  class with the SetMusicOnHold() application. Returns -1 on hangup. Never returns otherwise.
 * </p>
 * Created : Wed Jul 05 18:54:11 CEST 2006
 * 
 * @behavior.elementname MusicOnHold
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMusicOnHold.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IMusicOnHold {
public static final String MODELNAME = "MusicOnHold";	
 
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