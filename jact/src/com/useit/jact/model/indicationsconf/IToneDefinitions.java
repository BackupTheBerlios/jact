

package com.useit.jact.model.indicationsconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IToneDefinitions<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:35 CEST 2006
 * 
 * @behavior.elementname ToneDefinitions
 * @author urs
 * @version $Revision: 1.1 $, $Id: IToneDefinitions.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  IToneDefinitions {
public static final String MODELNAME = "ToneDefinitions";	

/**
 * gibt die List<CustomTone> customToneMap zurück	
 * @return List<CustomTone>
 * @behavior.list CustomToneMap 
 * @behavior.list.type CustomTone 
 */
public List getCustomToneMap();
/**
 * setzt die Map CustomToneMap
 * @param map customToneMapMap
 * @behavior.list CustomToneMap 
 * @behavior.list.type CustomTone 
 */
public void setCustomToneMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_COUNTRYCODE="countrycode" ;
// 	public static final String VALUEID_DESCRIPTION="description" ;
// 	public static final String VALUEID_ALIAS="alias" ;
// 	public static final String VALUEID_RINGCADENCE="ringcadence" ;
// 	public static final String VALUEID_DIAL="dial" ;
// 	public static final String VALUEID_BUSY="busy" ;
// 	public static final String VALUEID_RING="ring" ;
// 	public static final String VALUEID_CONGESTION="congestion" ;
// 	public static final String VALUEID_CALLWAITING="callwaiting" ;
// 	public static final String VALUEID_DIALRECALL="dialrecall" ;
// 	public static final String VALUEID_RECORD="record" ;
// 	public static final String VALUEID_INFO="info" ;
	
	//---------  getter und setter

	/**
	* getcountrycode 
	* 
	* @behavior.fieldname countrycode 
	**/
	public String getCountrycode();
	
	/**
	*setcountrycode 
	* 
	* @behavior.fieldname countrycode 
	*/
	public void setCountrycode(String acountrycode);


	/**
	* getdescription 
	* 
	* @behavior.fieldname description 
	**/
	public String getDescription();
	
	/**
	*setdescription 
	* 
	* @behavior.fieldname description 
	*/
	public void setDescription(String adescription);


	/**
	* getalias 
	* 
	* @behavior.fieldname alias 
	**/
	public String getAlias();
	
	/**
	*setalias 
	* 
	* @behavior.fieldname alias 
	*/
	public void setAlias(String aalias);


	/**
	* getringcadence 
	* 
	* @behavior.fieldname ringcadence 
	**/
	public String getRingcadence();
	
	/**
	*setringcadence 
	* 
	* @behavior.fieldname ringcadence 
	*/
	public void setRingcadence(String aringcadence);


	/**
	* getdial 
	* 
	* @behavior.fieldname dial 
	**/
	public String getDial();
	
	/**
	*setdial 
	* 
	* @behavior.fieldname dial 
	*/
	public void setDial(String adial);


	/**
	* getbusy 
	* 
	* @behavior.fieldname busy 
	**/
	public String getBusy();
	
	/**
	*setbusy 
	* 
	* @behavior.fieldname busy 
	*/
	public void setBusy(String abusy);


	/**
	* getring 
	* 
	* @behavior.fieldname ring 
	**/
	public String getRing();
	
	/**
	*setring 
	* 
	* @behavior.fieldname ring 
	*/
	public void setRing(String aring);


	/**
	* getcongestion 
	* 
	* @behavior.fieldname congestion 
	**/
	public String getCongestion();
	
	/**
	*setcongestion 
	* 
	* @behavior.fieldname congestion 
	*/
	public void setCongestion(String acongestion);


	/**
	* getcallwaiting 
	* 
	* @behavior.fieldname callwaiting 
	**/
	public String getCallwaiting();
	
	/**
	*setcallwaiting 
	* 
	* @behavior.fieldname callwaiting 
	*/
	public void setCallwaiting(String acallwaiting);


	/**
	* getdialrecall 
	* 
	* @behavior.fieldname dialrecall 
	**/
	public String getDialrecall();
	
	/**
	*setdialrecall 
	* 
	* @behavior.fieldname dialrecall 
	*/
	public void setDialrecall(String adialrecall);


	/**
	* getrecord 
	* 
	* @behavior.fieldname record 
	**/
	public String getRecord();
	
	/**
	*setrecord 
	* 
	* @behavior.fieldname record 
	*/
	public void setRecord(String arecord);


	/**
	* getinfo 
	* 
	* @behavior.fieldname info 
	**/
	public String getInfo();
	
	/**
	*setinfo 
	* 
	* @behavior.fieldname info 
	*/
	public void setInfo(String ainfo);


}