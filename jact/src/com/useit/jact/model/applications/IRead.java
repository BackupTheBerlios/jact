

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IRead<br>
 * Reads a #-terminated string of digits a certain number of times from the user in to the given variable.  filename -- file to play before reading digits.  maxdigits -- maximum acceptable number of digits. Stops reading after  maxdigits have been entered (without requiring the user to  press the '#' key).  Defaults to 0 - no limit - wait for the user press the '#' key.  Any value below 0 means the same. Max accepted value is 255.  option -- may be 'skip' to return immediately if the line is not up,  or 'noanswer' to read digits even if the line is not up.  attempts -- if greater than 1, that many attempts will be made in the   event no data is entered.  timeout -- if greater than 0, that value will override the default timeoft.  Returns -1 on hangup or error and 0 otherwise.
 * </p>
 * Created : Wed Jul 05 18:56:28 CEST 2006
 * 
 * @behavior.elementname Read
 * @author urs
 * @version $Revision: 1.1 $, $Id: IRead.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IRead {
public static final String MODELNAME = "Read";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_VARIABLE="variable" ;
// 	public static final String VALUEID_FILENAME="filename" ;
// 	public static final String VALUEID_MAXDIGITS="maxdigits" ;
// 	public static final String VALUEID_OPTION="option" ;
// 	public static final String VALUEID_ATTEMPTS="attempts" ;
// 	public static final String VALUEID_TIMEOUT="timeout" ;
	//test
	//---------  getter und setter
	/**
	* getvariable 
	* 
	* @behavior.fieldname variable 
	**/
	public String getVariable();
	
	/**
	*setvariable 
	* 
	* @behavior.fieldname variable 
	*/
	public void setVariable(String avariable);
	/**
	* getfilename 
	* 
	* @behavior.fieldname filename 
	**/
	public String getFilename();
	
	/**
	*setfilename 
	* 
	* @behavior.fieldname filename 
	*/
	public void setFilename(String afilename);
	/**
	* getmaxdigits 
	* 
	* @behavior.fieldname maxdigits 
	**/
	public String getMaxdigits();
	
	/**
	*setmaxdigits 
	* 
	* @behavior.fieldname maxdigits 
	*/
	public void setMaxdigits(String amaxdigits);
	/**
	* getoption 
	* 
	* @behavior.fieldname option 
	**/
	public String getOption();
	
	/**
	*setoption 
	* 
	* @behavior.fieldname option 
	*/
	public void setOption(String aoption);
	/**
	* getattempts 
	* 
	* @behavior.fieldname attempts 
	**/
	public String getAttempts();
	
	/**
	*setattempts 
	* 
	* @behavior.fieldname attempts 
	*/
	public void setAttempts(String aattempts);
	/**
	* gettimeout 
	* 
	* @behavior.fieldname timeout 
	**/
	public String getTimeout();
	
	/**
	*settimeout 
	* 
	* @behavior.fieldname timeout 
	*/
	public void setTimeout(String atimeout);

}