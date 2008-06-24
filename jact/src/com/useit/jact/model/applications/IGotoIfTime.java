

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IGotoIfTime<br>
 * If the current time matches the specified time, then branch to the specified extension. Each of the elements may be specified either as '*' (for always) or as a range. See the 'include' syntax for details.
 * </p>
 * Created : Wed Jul 05 18:54:14 CEST 2006
 * 
 * @behavior.elementname GotoIfTime
 * @author urs
 * @version $Revision: 1.1 $, $Id: IGotoIfTime.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IGotoIfTime {
public static final String MODELNAME = "GotoIfTime";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TIMES="times" ;
// 	public static final String VALUEID_WEEKDAYS="weekdays" ;
// 	public static final String VALUEID_MDAYS="mdays" ;
// 	public static final String VALUEID_MONTHS="months" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_EXTENSION="extension" ;
// 	public static final String VALUEID_PRI="pri" ;
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
	* getcontext 
	* 
	* @behavior.fieldname context 
	**/
	public String getContext();
	
	/**
	*setcontext 
	* 
	* @behavior.fieldname context 
	*/
	public void setContext(String acontext);
	/**
	* getextension 
	* 
	* @behavior.fieldname extension 
	**/
	public String getExtension();
	
	/**
	*setextension 
	* 
	* @behavior.fieldname extension 
	*/
	public void setExtension(String aextension);
	/**
	* getpri 
	* 
	* @behavior.fieldname pri 
	**/
	public String getPri();
	
	/**
	*setpri 
	* 
	* @behavior.fieldname pri 
	*/
	public void setPri(String apri);

}