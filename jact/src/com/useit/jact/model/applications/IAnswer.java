

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IAnswer<br>
 * If the channel is ringing, answer it, otherwise do nothing.  If delay is specified, asterisk will pause execution for the specified amount of milliseconds if an answer is required, in order to give audio a chance to become ready. Returns 0 unless it tries to answer the channel and fails.
 * </p>
 * Created : Wed Jul 05 18:56:07 CEST 2006
 * 
 * @behavior.elementname Answer
 * @author urs
 * @version $Revision: 1.1 $, $Id: IAnswer.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IAnswer {
public static final String MODELNAME = "Answer";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_DELAY="delay" ;
	//test
	//---------  getter und setter
	/**
	* getdelay 
	* 
	* @behavior.fieldname delay 
	**/
	public String getDelay();
	
	/**
	*setdelay 
	* 
	* @behavior.fieldname delay 
	*/
	public void setDelay(String adelay);

}