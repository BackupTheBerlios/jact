

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISendDTMF<br>
 * Sends DTMF digits on a channel.   Accepted digits: 0-9, *#abcd  Returns 0 on success or -1 on a hangup.
 * </p>
 * Created : Wed Jul 05 18:56:26 CEST 2006
 * 
 * @behavior.elementname SendDTMF
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISendDTMF.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ISendDTMF {
public static final String MODELNAME = "SendDTMF";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_DIGITS="digits" ;
// 	public static final String VALUEID_TIMEOUT_MS="timeout_ms" ;
	//test
	//---------  getter und setter
	/**
	* getdigits 
	* 
	* @behavior.fieldname digits 
	**/
	public String getDigits();
	
	/**
	*setdigits 
	* 
	* @behavior.fieldname digits 
	*/
	public void setDigits(String adigits);
	/**
	* gettimeout_ms 
	* 
	* @behavior.fieldname timeout_ms 
	**/
	public String getTimeout_ms();
	
	/**
	*settimeout_ms 
	* 
	* @behavior.fieldname timeout_ms 
	*/
	public void setTimeout_ms(String atimeout_ms);

}