

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IWaitForSilence<br>
 * Wait for Silence: Waits for up to 'x'  milliseconds of silence, 'y' times or 1 if omitted Examples:  - WaitForSilence(500,2) will wait for 1/2 second of silence, twice  - WaitForSilence(1000) will wait for 1 second of silence, once
 * </p>
 * Created : Wed Jul 05 18:54:09 CEST 2006
 * 
 * @behavior.elementname WaitForSilence
 * @author urs
 * @version $Revision: 1.1 $, $Id: IWaitForSilence.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IWaitForSilence {
public static final String MODELNAME = "WaitForSilence";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_X="x" ;
// 	public static final String VALUEID_Y="y" ;
	//test
	//---------  getter und setter
	/**
	* getx 
	* 
	* @behavior.fieldname x 
	**/
	public String getX();
	
	/**
	*setx 
	* 
	* @behavior.fieldname x 
	*/
	public void setX(String ax);
	/**
	* gety 
	* 
	* @behavior.fieldname y 
	**/
	public String getY();
	
	/**
	*sety 
	* 
	* @behavior.fieldname y 
	*/
	public void setY(String ay);

}