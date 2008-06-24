

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IControlPlayback<br>
 * Plays back a given filename (do not put extension). Options may also  be included following a pipe symbol. You can use * and # to rewind and  fast forward the playback specified. If 'stopchar' is added the file will  terminate playback when 'stopchar' is pressed. Returns -1 if the channel  was hung up. if the file does not exist jumps to n+101 if it present.   Example: exten => 1234,1,ControlPlayback(file|4000|*|#|1|0)
 * </p>
 * Created : Wed Jul 05 18:55:23 CEST 2006
 * 
 * @behavior.elementname ControlPlayback
 * @author urs
 * @version $Revision: 1.1 $, $Id: IControlPlayback.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IControlPlayback {
public static final String MODELNAME = "ControlPlayback";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FILENAME="filename" ;
// 	public static final String VALUEID_SKIPMS="skipms" ;
// 	public static final String VALUEID_FFCHAR="ffchar" ;
// 	public static final String VALUEID_REWCHAR="rewchar" ;
// 	public static final String VALUEID_STOPCHAR="stopchar" ;
// 	public static final String VALUEID_PAUSECHR="pausechr" ;
	//test
	//---------  getter und setter
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
	* getskipms 
	* 
	* @behavior.fieldname skipms 
	**/
	public String getSkipms();
	
	/**
	*setskipms 
	* 
	* @behavior.fieldname skipms 
	*/
	public void setSkipms(String askipms);
	/**
	* getffchar 
	* 
	* @behavior.fieldname ffchar 
	**/
	public String getFfchar();
	
	/**
	*setffchar 
	* 
	* @behavior.fieldname ffchar 
	*/
	public void setFfchar(String affchar);
	/**
	* getrewchar 
	* 
	* @behavior.fieldname rewchar 
	**/
	public String getRewchar();
	
	/**
	*setrewchar 
	* 
	* @behavior.fieldname rewchar 
	*/
	public void setRewchar(String arewchar);
	/**
	* getstopchar 
	* 
	* @behavior.fieldname stopchar 
	**/
	public String getStopchar();
	
	/**
	*setstopchar 
	* 
	* @behavior.fieldname stopchar 
	*/
	public void setStopchar(String astopchar);
	/**
	* getpausechr 
	* 
	* @behavior.fieldname pausechr 
	**/
	public String getPausechr();
	
	/**
	*setpausechr 
	* 
	* @behavior.fieldname pausechr 
	*/
	public void setPausechr(String apausechr);

}