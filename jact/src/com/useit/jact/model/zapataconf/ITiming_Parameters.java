

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ITiming_Parameters<br>
 * These keywords are used only with (non-PRI) T1 lines. All values are in milliseconds. These do not need to be set in most configurations, as the defaults work with most hardware. It has been noted that the common Adtran Atlas uses long winks of about 300 milliseconds, and channels from them should be configured accordingly.
 * </p>
 * Created : Fri May 26 14:30:39 CEST 2006
 * 
 * @behavior.elementname Timing_Parameters
 * @author urs
 * @version $Revision: 1.1 $, $Id: ITiming_Parameters.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  ITiming_Parameters {
public static final String MODELNAME = "Timing_Parameters";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_PREWINK="prewink" ;
// 	public static final String VALUEID_PREFLASH="preflash" ;
// 	public static final String VALUEID_WINK="wink" ;
// 	public static final String VALUEID_RXWINK="rxwink" ;
// 	public static final String VALUEID_RXFLASH="rxflash" ;
// 	public static final String VALUEID_FLASH="flash" ;
// 	public static final String VALUEID_START="start" ;
// 	public static final String VALUEID_DEBOUNCE="debounce" ;
	
	//---------  getter und setter

	/**
	* getprewink 
	* Sets the pre-wink timing.
	* @behavior.fieldname prewink 
	**/
	public Integer getPrewink();
	
	/**
	*setprewink 
	* Sets the pre-wink timing.
	* @behavior.fieldname prewink 
	*/
	public void setPrewink(Integer aprewink);


	/**
	* getpreflash 
	* Sets the pre-flash timing.
	* @behavior.fieldname preflash 
	**/
	public Integer getPreflash();
	
	/**
	*setpreflash 
	* Sets the pre-flash timing.
	* @behavior.fieldname preflash 
	*/
	public void setPreflash(Integer apreflash);


	/**
	* getwink 
	* Sets the wink timing.
	* @behavior.fieldname wink 
	**/
	public Integer getWink();
	
	/**
	*setwink 
	* Sets the wink timing.
	* @behavior.fieldname wink 
	*/
	public void setWink(Integer awink);


	/**
	* getrxwink 
	* Sets the receive wink timing.
	* @behavior.fieldname rxwink 
	**/
	public Integer getRxwink();
	
	/**
	*setrxwink 
	* Sets the receive wink timing.
	* @behavior.fieldname rxwink 
	*/
	public void setRxwink(Integer arxwink);


	/**
	* getrxflash 
	* Sets the receive flash timing.
	* @behavior.fieldname rxflash 
	**/
	public Integer getRxflash();
	
	/**
	*setrxflash 
	* Sets the receive flash timing.
	* @behavior.fieldname rxflash 
	*/
	public void setRxflash(Integer arxflash);


	/**
	* getflash 
	* Sets the flash timing.
	* @behavior.fieldname flash 
	**/
	public Integer getFlash();
	
	/**
	*setflash 
	* Sets the flash timing.
	* @behavior.fieldname flash 
	*/
	public void setFlash(Integer aflash);


	/**
	* getstart 
	* Sets the start timing.
	* @behavior.fieldname start 
	**/
	public Integer getStart();
	
	/**
	*setstart 
	* Sets the start timing.
	* @behavior.fieldname start 
	*/
	public void setStart(Integer astart);


	/**
	* getdebounce 
	* Sets the debounce timing. "The debounce settings in the Asterisk configuration affects how Asterisk handles hookswitch transitions on its FXO/FXS interfaces."
	* @behavior.fieldname debounce 
	**/
	public Integer getDebounce();
	
	/**
	*setdebounce 
	* Sets the debounce timing. "The debounce settings in the Asterisk configuration affects how Asterisk handles hookswitch transitions on its FXO/FXS interfaces."
	* @behavior.fieldname debounce 
	*/
	public void setDebounce(Integer adebounce);


}