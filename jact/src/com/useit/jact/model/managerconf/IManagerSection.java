

package com.useit.jact.model.managerconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IManagerSection<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:35 CEST 2006
 * 
 * @behavior.elementname ManagerSection
 * @author urs
 * @version $Revision: 1.1 $, $Id: IManagerSection.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  IManagerSection {
public static final String MODELNAME = "ManagerSection";	

/**
 * gibt die List<Managerdeny> managerdenyMap zurück	
 * @return List<Managerdeny>
 * @behavior.list ManagerdenyMap 
 * @behavior.list.type Managerdeny 
 */
public List getManagerdenyMap();
/**
 * setzt die Map ManagerdenyMap
 * @param map managerdenyMapMap
 * @behavior.list ManagerdenyMap 
 * @behavior.list.type Managerdeny 
 */
public void setManagerdenyMap(List aList);

/**
 * gibt die List<Managerpermit> managerpermitMap zurück	
 * @return List<Managerpermit>
 * @behavior.list ManagerpermitMap 
 * @behavior.list.type Managerpermit 
 */
public List getManagerpermitMap();
/**
 * setzt die Map ManagerpermitMap
 * @param map managerpermitMapMap
 * @behavior.list ManagerpermitMap 
 * @behavior.list.type Managerpermit 
 */
public void setManagerpermitMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_USERNAME="username" ;
// 	public static final String VALUEID_SECRET="secret" ;
// 	public static final String VALUEID_READ="read" ;
// 	public static final String VALUEID_WRITE="write" ;
	
	//---------  getter und setter

	/**
	* getusername 
	* 
	* @behavior.fieldname username 
	**/
	public String getUsername();
	
	/**
	*setusername 
	* 
	* @behavior.fieldname username 
	*/
	public void setUsername(String ausername);


	/**
	* getsecret 
	* 
	* @behavior.fieldname secret 
	**/
	public String getSecret();
	
	/**
	*setsecret 
	* 
	* @behavior.fieldname secret 
	*/
	public void setSecret(String asecret);


	/**
	* getread 
	* 
	* @behavior.fieldname read 
	**/
	public String getRead();
	
	/**
	*setread 
	* 
	* @behavior.fieldname read 
	*/
	public void setRead(String aread);


	/**
	* getwrite 
	* 
	* @behavior.fieldname write 
	**/
	public String getWrite();
	
	/**
	*setwrite 
	* 
	* @behavior.fieldname write 
	*/
	public void setWrite(String awrite);


}