

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISoftHangup<br>
 * Hangs up the requested channel. Always returns 0 - 'options' may contain the following letter:  'a' : hang up all channels on a specified device instead of a single resource
 * </p>
 * Created : Wed Jul 05 18:55:39 CEST 2006
 * 
 * @behavior.elementname SoftHangup
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISoftHangup.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  ISoftHangup {
public static final String MODELNAME = "SoftHangup";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TECHNOLOGY="technology" ;
// 	public static final String VALUEID_RESOURCE="resource" ;
// 	public static final String VALUEID_OPTIONS="options" ;
	//test
	//---------  getter und setter
	/**
	* gettechnology 
	* 
	* @behavior.fieldname technology 
	**/
	public String getTechnology();
	
	/**
	*settechnology 
	* 
	* @behavior.fieldname technology 
	*/
	public void setTechnology(String atechnology);
	/**
	* getresource 
	* 
	* @behavior.fieldname resource 
	**/
	public String getResource();
	
	/**
	*setresource 
	* 
	* @behavior.fieldname resource 
	*/
	public void setResource(String aresource);
	/**
	* getoptions 
	* 
	* @behavior.fieldname options 
	**/
	public String getOptions();
	
	/**
	*setoptions 
	* 
	* @behavior.fieldname options 
	*/
	public void setOptions(String aoptions);

}