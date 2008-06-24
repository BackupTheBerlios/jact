

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMonitor<br>
 * Used to start monitoring a channel. The channel's input and output voice packets are logged to files until the channel hangs up or monitoring is stopped by the StopMonitor application.  file_format  optional, if not set, defaults to "wav"  fname_base  if set, changes the filename used to the one specified.  options:  m - when the recording ends mix the two leg files into one and  delete the two leg files. If the variable MONITOR_EXEC is set, the  application referenced in it will be executed instead of  soxmix and the raw leg files will NOT be deleted automatically.  soxmix or MONITOR_EXEC is handed 3 arguments, the two leg files  and a target mixed file name which is the same as the leg file names  only without the in/out designator.  If MONITOR_EXEC_ARGS is set, the contents will be passed on as  additional arguements to MONITOR_EXEC  Both MONITOR_EXEC and the Mix flag can be set from the  administrator interface   b - Don't begin recording unless a call is bridged to another channel  Returns -1 if monitor files can't be opened or if the channel is already monitored, otherwise 0.
 * </p>
 * Created : Wed Jul 05 18:55:16 CEST 2006
 * 
 * @behavior.elementname Monitor
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMonitor.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IMonitor {
public static final String MODELNAME = "Monitor";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FILE_FORMAT="file_format" ;
// 	public static final String VALUEID_URLBASE="urlbase" ;
// 	public static final String VALUEID_FNAME_BASE="fname_base" ;
// 	public static final String VALUEID_OPTIONS="options" ;
	//test
	//---------  getter und setter
	/**
	* getfile_format 
	* 
	* @behavior.fieldname file_format 
	**/
	public String getFile_format();
	
	/**
	*setfile_format 
	* 
	* @behavior.fieldname file_format 
	*/
	public void setFile_format(String afile_format);
	/**
	* geturlbase 
	* 
	* @behavior.fieldname urlbase 
	**/
	public String getUrlbase();
	
	/**
	*seturlbase 
	* 
	* @behavior.fieldname urlbase 
	*/
	public void setUrlbase(String aurlbase);
	/**
	* getfname_base 
	* 
	* @behavior.fieldname fname_base 
	**/
	public String getFname_base();
	
	/**
	*setfname_base 
	* 
	* @behavior.fieldname fname_base 
	*/
	public void setFname_base(String afname_base);
	/**
	* getoptions 
	* 
	* @behavior.fieldname options 
	**/
	public String getOptions();
	
	/**
	*setoptions 
	* 
	* @behavior.fieldname options 
	*/
	public void setOptions(String aoptions);

}