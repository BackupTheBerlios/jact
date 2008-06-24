

package com.useit.jact.model.voicemailconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IVoicemailcontext<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:31 CEST 2006
 * 
 * @behavior.elementname Voicemailcontext
 * @author urs
 * @version $Revision: 1.1 $, $Id: IVoicemailcontext.java,v 1.1 2008/06/24 20:45:14 urszeidler Exp $
 */
 public  interface  IVoicemailcontext {
public static final String MODELNAME = "Voicemailcontext";	

/**
 * gibt die List<Voicemailcontextentry> voicemailcontextentryMap zurück	
 * @return List<Voicemailcontextentry>
 * @behavior.list VoicemailcontextentryMap 
 * @behavior.list.type Voicemailcontextentry 
 */
public List getVoicemailcontextentryMap();
/**
 * setzt die Map VoicemailcontextentryMap
 * @param map voicemailcontextentryMapMap
 * @behavior.list VoicemailcontextentryMap 
 * @behavior.list.type Voicemailcontextentry 
 */
public void setVoicemailcontextentryMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONTEXTNAME="contextname" ;
	
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


}