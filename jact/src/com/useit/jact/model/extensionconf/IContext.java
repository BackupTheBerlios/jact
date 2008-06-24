

package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IContext<br>
 * The Dialplan constists of collection of contexts. These context definitions are the most important part of the extensions.conf file and are the most important part of Asterisk configuration. A context is just a collection of extensions.
 * </p>
 * Created : Wed May 31 09:04:12 CEST 2006
 * 
 * @behavior.elementname Context
 * @author urs
 * @version $Revision: 1.1 $, $Id: IContext.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IContext {
public static final String MODELNAME = "Context";	

/**
 * gibt die List<Extension> extensionMap zurück	
 * @return List<Extension>
 * @behavior.list ExtensionMap 
 * @behavior.list.type Extension 
 */
public List getExtensionMap();
/**
 * setzt die Map ExtensionMap
 * @param map extensionMapMap
 * @behavior.list ExtensionMap 
 * @behavior.list.type Extension 
 */
public void setExtensionMap(List aList);

/**
 * gibt die List<Includecontext> includecontextMap zurück	
 * @return List<Includecontext>
 * @behavior.list IncludecontextMap 
 * @behavior.list.type Includecontext 
 */
public List getIncludecontextMap();
/**
 * setzt die Map IncludecontextMap
 * @param map includecontextMapMap
 * @behavior.list IncludecontextMap 
 * @behavior.list.type Includecontext 
 */
public void setIncludecontextMap(List aList);

/**
 * gibt die List<Switch> switchMap zurück	
 * @return List<Switch>
 * @behavior.list SwitchMap 
 * @behavior.list.type Switch 
 */
public List getSwitchMap();
/**
 * setzt die Map SwitchMap
 * @param map switchMapMap
 * @behavior.list SwitchMap 
 * @behavior.list.type Switch 
 */
public void setSwitchMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONTEXTNAME="contextname" ;
// 	public static final String VALUEID_IGNOREPAT="ignorepat" ;
	
	//---------  getter und setter
	
	/**
	* getcontextname 
	* 
	* @behavior.fieldname contextname 
	**/
	public String getContextname();
	
	/**
	*setcontextname 
	* 
	* @behavior.fieldname contextname 
	*/
	public void setContextname(String acontextname);


	/**
	* getignorepat 
	* 
	* @behavior.fieldname ignorepat 
	**/
	public String getIgnorepat();
	
	/**
	*setignorepat 
	* 
	* @behavior.fieldname ignorepat 
	*/
	public void setIgnorepat(String aignorepat);


}