

package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IExtensionconf<br>
 * used by  the pbx_config module. This is where you configure all your   inbound and outbound calls in Asterisk.     This configuration file is reloaded   - With the "extensions reload" command in the CLI  - With the "reload" command (that reloads everything) in the CLI

The "General" category is for certain variables.
 * </p>
 * Created : Wed May 31 09:04:13 CEST 2006
 * 
 * @behavior.elementname Extensionconf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IExtensionconf.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IExtensionconf {
public static final String MODELNAME = "Extensionconf";	

/**
 * gibt die List<Context> contextMap zurück	
 * @return List<Context>
 * @behavior.list ContextMap 
 * @behavior.list.type Context 
 */
public List getContextMap();
/**
 * setzt die Map ContextMap
 * @param map contextMapMap
 * @behavior.list ContextMap 
 * @behavior.list.type Context 
 */
public void setContextMap(List aList);

/**
 * gibt die List<Globalvars> globalvarsMap zurück	
 * @return List<Globalvars>
 * @behavior.list GlobalvarsMap 
 * @behavior.list.type Globalvars 
 */
public List getGlobalvarsMap();
/**
 * setzt die Map GlobalvarsMap
 * @param map globalvarsMapMap
 * @behavior.list GlobalvarsMap 
 * @behavior.list.type Globalvars 
 */
public void setGlobalvarsMap(List aList);

/**
 * gibt die List<Includeconfigs> includeconfigsMap zurück	
 * @return List<Includeconfigs>
 * @behavior.list IncludeconfigsMap 
 * @behavior.list.type Includeconfigs 
 */
public List getIncludeconfigsMap();
/**
 * setzt die Map IncludeconfigsMap
 * @param map includeconfigsMapMap
 * @behavior.list IncludeconfigsMap 
 * @behavior.list.type Includeconfigs 
 */
public void setIncludeconfigsMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_STATIC_="static_" ;
// 	public static final String VALUEID_WRITEPROTECT="writeprotect" ;
// 	public static final String VALUEID_AUTOFALLTHROUGH="autofallthrough" ;
// 	public static final String VALUEID_CLEARGLOBALVARS="clearglobalvars" ;
	
	//---------  getter und setter
	
	/**
	* getstatic_ 
	* If static is set to no, or omitted, then the pbx_config will rewrite  this file when extensions are modified.  Remember that all comments  made in the file will be lost when that happens.  XXX Not yet implemented XXX
	* @behavior.fieldname static_ 
	**/
	public Boolean getStatic_();
	
	/**
	*setstatic_ 
	* If static is set to no, or omitted, then the pbx_config will rewrite  this file when extensions are modified.  Remember that all comments  made in the file will be lost when that happens.  XXX Not yet implemented XXX
	* @behavior.fieldname static_ 
	*/
	public void setStatic_(Boolean astatic_);


	/**
	* getwriteprotect 
	* if static yes and writeprotect no, you can save dialplan by CLI command 'save dialplan' too
	* @behavior.fieldname writeprotect 
	**/
	public Boolean getWriteprotect();
	
	/**
	*setwriteprotect 
	* if static yes and writeprotect no, you can save dialplan by CLI command 'save dialplan' too
	* @behavior.fieldname writeprotect 
	*/
	public void setWriteprotect(Boolean awriteprotect);


	/**
	* getautofallthrough 
	* If autofallthrough is set, then if an extension runs out of  things to do, it will terminate the call with BUSY, CONGESTION  or HANGUP depending on Asterisk's best guess (strongly recommended).If autofallthrough is not set, then if an extension runs out of   things to do, asterisk will wait for a new extension to be dialed   (this is the original behavior of Asterisk 1.0 and earlier).
	* @behavior.fieldname autofallthrough 
	**/
	public Boolean getAutofallthrough();
	
	/**
	*setautofallthrough 
	* If autofallthrough is set, then if an extension runs out of  things to do, it will terminate the call with BUSY, CONGESTION  or HANGUP depending on Asterisk's best guess (strongly recommended).If autofallthrough is not set, then if an extension runs out of   things to do, asterisk will wait for a new extension to be dialed   (this is the original behavior of Asterisk 1.0 and earlier).
	* @behavior.fieldname autofallthrough 
	*/
	public void setAutofallthrough(Boolean aautofallthrough);


	/**
	* getclearglobalvars 
	* If clearglobalvars is set, global variables will be cleared   and reparsed on an extensions reload, or Asterisk reload.

If clearglobalvars is not set, then global variables will persist  through reloads, and even if deleted from the extensions.conf or  one if its included files, will remain set to the previous value.
	* @behavior.fieldname clearglobalvars 
	**/
	public Boolean getClearglobalvars();
	
	/**
	*setclearglobalvars 
	* If clearglobalvars is set, global variables will be cleared   and reparsed on an extensions reload, or Asterisk reload.

If clearglobalvars is not set, then global variables will persist  through reloads, and even if deleted from the extensions.conf or  one if its included files, will remain set to the previous value.
	* @behavior.fieldname clearglobalvars 
	*/
	public void setClearglobalvars(Boolean aclearglobalvars);


}