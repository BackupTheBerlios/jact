

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IChanIsAvail<br>
 * Checks is any of the requested channels are available. If none of the requested channels are available the new priority will be n+101 (unless such a priority does not exist or on error, in which case ChanIsAvail will return -1). If any of the requested channels are available, the next priority will be n+1, the channel variable ${AVAILCHAN} will be set to the name of the available channel and the ChanIsAvail app will return 0. ${AVAILORIGCHAN} is the canonical channel name that was used to create the channel. ${AVAILSTATUS} is the status code for the channel. If the option 's' is specified (state), will consider channel unavailable when the channel is in use at all, even if it can take another call.
 * </p>
 * Created : Wed Jul 05 18:53:34 CEST 2006
 * 
 * @behavior.elementname ChanIsAvail
 * @author urs
 * @version $Revision: 1.1 $, $Id: IChanIsAvail.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IChanIsAvail {
public static final String MODELNAME = "ChanIsAvail";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FORMATSTR="formatstr" ;
// 	public static final String VALUEID_TECHNOLOGY="technology" ;
// 	public static final String VALUEID_RESOURCE="resource" ;
// 	public static final String VALUEID_TECHNOLOGY2="technology2" ;
// 	public static final String VALUEID_RESOURCE2="resource2" ;
// 	public static final String VALUEID_OPTION="option" ;
	//test
	//---------  getter und setter
	public static final String 	FORMATSTR = "Test";
	/**
	* getformatstr 
	* 
	* @behavior.fieldname formatstr 
	**/
	public String getFormatstr();
	
	/**
	*setformatstr 
	* 
	* @behavior.fieldname formatstr 
	*/
	public void setFormatstr(String aformatstr);
	/**
	* gettechnology 
	* 
	* @behavior.fieldname technology 
	**/
	public String getTechnology();
	
	/**
	*settechnology 
	* 
	* @behavior.fieldname technology 
	*/
	public void setTechnology(String atechnology);
	/**
	* getresource 
	* 
	* @behavior.fieldname resource 
	**/
	public String getResource();
	
	/**
	*setresource 
	* 
	* @behavior.fieldname resource 
	*/
	public void setResource(String aresource);
	/**
	* gettechnology2 
	* 
	* @behavior.fieldname technology2 
	**/
	public String getTechnology2();
	
	/**
	*settechnology2 
	* 
	* @behavior.fieldname technology2 
	*/
	public void setTechnology2(String atechnology2);
	/**
	* getresource2 
	* 
	* @behavior.fieldname resource2 
	**/
	public String getResource2();
	
	/**
	*setresource2 
	* 
	* @behavior.fieldname resource2 
	*/
	public void setResource2(String aresource2);
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

}