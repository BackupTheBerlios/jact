

package com.useit.jact.model.managerconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IManagergeneralSection<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:35 CEST 2006
 * 
 * @behavior.elementname ManagergeneralSection
 * @author urs
 * @version $Revision: 1.1 $, $Id: IManagergeneralSection.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  IManagergeneralSection {
public static final String MODELNAME = "ManagergeneralSection";	

/**
 * gibt die List<ManagerSection> managerSectionMap zurück	
 * @return List<ManagerSection>
 * @behavior.list ManagerSectionMap 
 * @behavior.list.type ManagerSection 
 */
public List getManagerSectionMap();
/**
 * setzt die Map ManagerSectionMap
 * @param map managerSectionMapMap
 * @behavior.list ManagerSectionMap 
 * @behavior.list.type ManagerSection 
 */
public void setManagerSectionMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_GENERALID="generalid" ;
// 	public static final String VALUEID_ENABLED="enabled" ;
// 	public static final String VALUEID_PORTNO="portno" ;
// 	public static final String VALUEID_BINDADDR="bindaddr" ;
// 	public static final String VALUEID_PORT="port" ;
// 	public static final String VALUEID_FILEID="fileid" ;
	
	//---------  getter und setter

	/**
	* getgeneralid 
	* 
	* @behavior.fieldname generalid 
	**/
	public String getGeneralid();
	
	/**
	*setgeneralid 
	* 
	* @behavior.fieldname generalid 
	*/
	public void setGeneralid(String ageneralid);


	/**
	* getenabled 
	* 
	* @behavior.fieldname enabled 
	**/
	public Boolean getEnabled();
	
	/**
	*setenabled 
	* 
	* @behavior.fieldname enabled 
	*/
	public void setEnabled(Boolean aenabled);


	/**
	* getportno 
	* Note: "portno" is changing to "port" in a forthcoming CVS version. 
	* @behavior.fieldname portno 
	**/
	public Integer getPortno();
	
	/**
	*setportno 
	* Note: "portno" is changing to "port" in a forthcoming CVS version. 
	* @behavior.fieldname portno 
	*/
	public void setPortno(Integer aportno);


	/**
	* getbindaddr 
	* 
	* @behavior.fieldname bindaddr 
	**/
	public String getBindaddr();
	
	/**
	*setbindaddr 
	* 
	* @behavior.fieldname bindaddr 
	*/
	public void setBindaddr(String abindaddr);


	/**
	* getport 
	* 
	* @behavior.fieldname port 
	**/
	public Integer getPort();
	
	/**
	*setport 
	* 
	* @behavior.fieldname port 
	*/
	public void setPort(Integer aport);


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