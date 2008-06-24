

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IExecIfTime<br>
 * If the current time matches the specified time, then execute the specified application. Each of the elements may be specified either as '*' (for always) or as a range. See the 'include' syntax for details.
 * </p>
 * Created : Wed Jul 05 18:54:03 CEST 2006
 * 
 * @behavior.elementname ExecIfTime
 * @author urs
 * @version $Revision: 1.1 $, $Id: IExecIfTime.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IExecIfTime {
public static final String MODELNAME = "ExecIfTime";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TIMES="times" ;
// 	public static final String VALUEID_WEEKDAYS="weekdays" ;
// 	public static final String VALUEID_MDAYS="mdays" ;
// 	public static final String VALUEID_MONTHS="months" ;
// 	public static final String VALUEID_APPNAME="appname" ;
// 	public static final String VALUEID_APPDATA="appdata" ;
	//test
	//---------  getter und setter
	/**
	* gettimes 
	* 
	* @behavior.fieldname times 
	**/
	public String getTimes();
	
	/**
	*settimes 
	* 
	* @behavior.fieldname times 
	*/
	public void setTimes(String atimes);
	/**
	* getweekdays 
	* 
	* @behavior.fieldname weekdays 
	**/
	public String getWeekdays();
	
	/**
	*setweekdays 
	* 
	* @behavior.fieldname weekdays 
	*/
	public void setWeekdays(String aweekdays);
	/**
	* getmdays 
	* 
	* @behavior.fieldname mdays 
	**/
	public String getMdays();
	
	/**
	*setmdays 
	* 
	* @behavior.fieldname mdays 
	*/
	public void setMdays(String amdays);
	/**
	* getmonths 
	* 
	* @behavior.fieldname months 
	**/
	public String getMonths();
	
	/**
	*setmonths 
	* 
	* @behavior.fieldname months 
	*/
	public void setMonths(String amonths);
	/**
	* getappname 
	* 
	* @behavior.fieldname appname 
	**/
	public String getAppname();
	
	/**
	*setappname 
	* 
	* @behavior.fieldname appname 
	*/
	public void setAppname(String aappname);
	/**
	* getappdata 
	* 
	* @behavior.fieldname appdata 
	**/
	public String getAppdata();
	
	/**
	*setappdata 
	* 
	* @behavior.fieldname appdata 
	*/
	public void setAppdata(String aappdata);

}