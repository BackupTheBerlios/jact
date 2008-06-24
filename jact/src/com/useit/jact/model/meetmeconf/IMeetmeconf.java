

package com.useit.jact.model.meetmeconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IMeetmeconf<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:36 CEST 2006
 * 
 * @behavior.elementname Meetmeconf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMeetmeconf.java,v 1.1 2008/06/24 20:45:17 urszeidler Exp $
 */
 public  interface  IMeetmeconf {
public static final String MODELNAME = "Meetmeconf";	

/**
 * gibt die List<Meetmerooms> meetmeroomsMap zurück	
 * @return List<Meetmerooms>
 * @behavior.list MeetmeroomsMap 
 * @behavior.list.type Meetmerooms 
 */
public List getMeetmeroomsMap();
/**
 * setzt die Map MeetmeroomsMap
 * @param map meetmeroomsMapMap
 * @behavior.list MeetmeroomsMap 
 * @behavior.list.type Meetmerooms 
 */
public void setMeetmeroomsMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FILEID="fileid" ;
	
	//---------  getter und setter

	/**
	* getfileid 
	* 
	* @behavior.fieldname fileid 
	**/
	public String getFileid();
	
	/**
	*setfileid 
	* 
	* @behavior.fieldname fileid 
	*/
	public void setFileid(String afileid);


}