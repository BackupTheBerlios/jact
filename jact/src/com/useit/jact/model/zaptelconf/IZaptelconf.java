

package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IZaptelconf<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:32 CEST 2006
 * 
 * @behavior.elementname Zaptelconf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZaptelconf.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IZaptelconf {
public static final String MODELNAME = "Zaptelconf";	

/**
 * gibt die List<Zaptelchannels> zaptelchannelsMap zurück	
 * @return List<Zaptelchannels>
 * @behavior.list ZaptelchannelsMap 
 * @behavior.list.type Zaptelchannels 
 */
public List getZaptelchannelsMap();
/**
 * setzt die Map ZaptelchannelsMap
 * @param map zaptelchannelsMapMap
 * @behavior.list ZaptelchannelsMap 
 * @behavior.list.type Zaptelchannels 
 */
public void setZaptelchannelsMap(List aList);

/**
 * gibt die List<Zapteldynamicspan> zapteldynamicspanMap zurück	
 * @return List<Zapteldynamicspan>
 * @behavior.list ZapteldynamicspanMap 
 * @behavior.list.type Zapteldynamicspan 
 */
public List getZapteldynamicspanMap();
/**
 * setzt die Map ZapteldynamicspanMap
 * @param map zapteldynamicspanMapMap
 * @behavior.list ZapteldynamicspanMap 
 * @behavior.list.type Zapteldynamicspan 
 */
public void setZapteldynamicspanMap(List aList);

/**
 * gibt die List<Zaptelspan> zaptelspanMap zurück	
 * @return List<Zaptelspan>
 * @behavior.list ZaptelspanMap 
 * @behavior.list.type Zaptelspan 
 */
public List getZaptelspanMap();
/**
 * setzt die Map ZaptelspanMap
 * @param map zaptelspanMapMap
 * @behavior.list ZaptelspanMap 
 * @behavior.list.type Zaptelspan 
 */
public void setZaptelspanMap(List aList);

/**
 * gibt die List<Zapteltonezone> zapteltonezoneMap zurück	
 * @return List<Zapteltonezone>
 * @behavior.list ZapteltonezoneMap 
 * @behavior.list.type Zapteltonezone 
 */
public List getZapteltonezoneMap();
/**
 * setzt die Map ZapteltonezoneMap
 * @param map zapteltonezoneMapMap
 * @behavior.list ZapteltonezoneMap 
 * @behavior.list.type Zapteltonezone 
 */
public void setZapteltonezoneMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_DEFAULTZONE="defaultzone" ;
	
	//---------  getter und setter

	/**
	* getdefaultzone 
	* 
	* @behavior.fieldname defaultzone 
	**/
	public String getDefaultzone();
	
	/**
	*setdefaultzone 
	* 
	* @behavior.fieldname defaultzone 
	*/
	public void setDefaultzone(String adefaultzone);


}