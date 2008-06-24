

package com.useit.jact.model.indicationsconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IIndicationsconf<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:36 CEST 2006
 * 
 * @behavior.elementname Indicationsconf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IIndicationsconf.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  IIndicationsconf {
public static final String MODELNAME = "Indicationsconf";	

/**
 * gibt die List<ToneDefinitions> toneDefinitionsMap zurück	
 * @return List<ToneDefinitions>
 * @behavior.list ToneDefinitionsMap 
 * @behavior.list.type ToneDefinitions 
 */
public List getToneDefinitionsMap();
/**
 * setzt die Map ToneDefinitionsMap
 * @param map toneDefinitionsMapMap
 * @behavior.list ToneDefinitionsMap 
 * @behavior.list.type ToneDefinitions 
 */
public void setToneDefinitionsMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_COUNTRY="country" ;
	
	//---------  getter und setter

	/**
	* getcountry 
	* 
	* @behavior.fieldname country 
	**/
	public String getCountry();
	
	/**
	*setcountry 
	* 
	* @behavior.fieldname country 
	*/
	public void setCountry(String acountry);


}