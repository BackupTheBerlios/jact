

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMP3Player<br>
 * Executes mpg123 to play the given location which typically would be a filename o a URL. User can exit by pressing any key .Returns -1 on hangup or 0 otherwise.
 * </p>
 * Created : Wed Jul 05 18:53:43 CEST 2006
 * 
 * @behavior.elementname MP3Player
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMP3Player.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IMP3Player {
public static final String MODELNAME = "MP3Player";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_LOCATION="location" ;
	//test
	//---------  getter und setter
	/**
	* getlocation 
	* 
	* @behavior.fieldname location 
	**/
	public String getLocation();
	
	/**
	*setlocation 
	* 
	* @behavior.fieldname location 
	*/
	public void setLocation(String alocation);

}