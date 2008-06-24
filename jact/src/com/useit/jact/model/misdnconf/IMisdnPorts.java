

package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.MisdnPortOptions;


/**
 * <p>
 * IMisdnPorts<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:33 CEST 2006
 * 
 * @behavior.elementname MisdnPorts
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMisdnPorts.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  IMisdnPorts {
public static final String MODELNAME = "MisdnPorts";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_PORTN="portn" ;
// 	public static final String VALUEID_PORTOPTION="portoption" ;
	
	//---------  getter und setter

	/**
	* getportN 
	* 
	* @behavior.fieldname portN 
	**/
	public Integer getPortN();
	
	/**
	*setportN 
	* 
	* @behavior.fieldname portN 
	*/
	public void setPortN(Integer aportN);


	/**
	* getportOption 
	* 
	* @behavior.fieldname portOption 
	**/
	public MisdnPortOptions getPortOption();
	
	/**
	*setportOption 
	* 
	* @behavior.fieldname portOption 
	*/
	public void setPortOption(MisdnPortOptions aportOption);


}