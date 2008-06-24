

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISayUnixTime<br>
 * unixtime: time, in seconds since Jan 1, 1970. May be negative.  defaults to now.  timezone: timezone, see /usr/share/zoneinfo for a list.  defaults to machine default.  format: a format the time is to be said in. See voicemail.conf.  defaults to "ABdY 'digits/at' IMp"  Returns 0 or -1 on hangup.
 * </p>
 * Created : Wed Jul 05 18:54:20 CEST 2006
 * 
 * @behavior.elementname SayUnixTime
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISayUnixTime.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  ISayUnixTime {
public static final String MODELNAME = "SayUnixTime";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_UNIXTIME="unixtime" ;
// 	public static final String VALUEID_TIMEZONE="timezone" ;
// 	public static final String VALUEID_FORMAT="format" ;
	//test
	//---------  getter und setter
	/**
	* getunixtime 
	* 
	* @behavior.fieldname unixtime 
	**/
	public String getUnixtime();
	
	/**
	*setunixtime 
	* 
	* @behavior.fieldname unixtime 
	*/
	public void setUnixtime(String aunixtime);
	/**
	* gettimezone 
	* 
	* @behavior.fieldname timezone 
	**/
	public String getTimezone();
	
	/**
	*settimezone 
	* 
	* @behavior.fieldname timezone 
	*/
	public void setTimezone(String atimezone);
	/**
	* getformat 
	* 
	* @behavior.fieldname format 
	**/
	public String getFormat();
	
	/**
	*setformat 
	* 
	* @behavior.fieldname format 
	*/
	public void setFormat(String aformat);

}