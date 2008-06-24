

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IPark<br>
 * Used to park yourself (typically in combination with a supervised transfer to know the parking space). This application is always registered internally and does not need to be explicitly added into the dialplan, although you should include the 'parkedcalls' context.
 * </p>
 * Created : Wed Jul 05 18:54:40 CEST 2006
 * 
 * @behavior.elementname Park
 * @author urs
 * @version $Revision: 1.1 $, $Id: IPark.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IPark {
public static final String MODELNAME = "Park";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_EXTEN="exten" ;
	//test
	//---------  getter und setter
	/**
	* getexten 
	* 
	* @behavior.fieldname exten 
	**/
	public String getExten();
	
	/**
	*setexten 
	* 
	* @behavior.fieldname exten 
	*/
	public void setExten(String aexten);

}