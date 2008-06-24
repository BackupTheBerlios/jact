

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IICES<br>
 * Streams to an icecast server using ices (available separately). A configuration file must be supplied for ices (see examples/asterisk-ices.conf). Returns -1 on hangup or 0 otherwise.
 * </p>
 * Created : Wed Jul 05 18:54:28 CEST 2006
 * 
 * @behavior.elementname ICES
 * @author urs
 * @version $Revision: 1.1 $, $Id: IICES.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IICES {
public static final String MODELNAME = "ICES";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONFIG="config" ;
// 	public static final String VALUEID_XML="xml" ;
	//test
	//---------  getter und setter
	/**
	* getconfig 
	* 
	* @behavior.fieldname config 
	**/
	public String getConfig();
	
	/**
	*setconfig 
	* 
	* @behavior.fieldname config 
	*/
	public void setConfig(String aconfig);
	/**
	* getxml 
	* 
	* @behavior.fieldname xml 
	**/
	public String getXml();
	
	/**
	*setxml 
	* 
	* @behavior.fieldname xml 
	*/
	public void setXml(String axml);

}