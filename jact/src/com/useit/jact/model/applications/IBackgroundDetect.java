

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IBackgroundDetect<br>
 * Plays back a given filename, waiting for interruption from a given digit (the digit must start the beginning of a valid extension, or it will be ignored). During the playback of the file, audio is monitored in the receive direction, and if a period of non-silence which is greater than 'min' ms yet less than 'max' ms is followed by silence for at least 'sil' ms then the audio playback is aborted and processing jumps to the 'talk' extension if available. If unspecified, sil, min, and max default to 1000, 100, and infinity respectively. Returns -1 on hangup, and 0 on successful playback completion with no exit conditions.
 * </p>
 * Created : Wed Jul 05 18:55:28 CEST 2006
 * 
 * @behavior.elementname BackgroundDetect
 * @author urs
 * @version $Revision: 1.1 $, $Id: IBackgroundDetect.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IBackgroundDetect {
public static final String MODELNAME = "BackgroundDetect";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FILENAME="filename" ;
// 	public static final String VALUEID_SIL="sil" ;
// 	public static final String VALUEID_MIN="min" ;
// 	public static final String VALUEID_MAX="max" ;
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
	* getsil 
	* 
	* @behavior.fieldname sil 
	**/
	public String getSil();
	
	/**
	*setsil 
	* 
	* @behavior.fieldname sil 
	*/
	public void setSil(String asil);
	/**
	* getmin 
	* 
	* @behavior.fieldname min 
	**/
	public String getMin();
	
	/**
	*setmin 
	* 
	* @behavior.fieldname min 
	*/
	public void setMin(String amin);
	/**
	* getmax 
	* 
	* @behavior.fieldname max 
	**/
	public String getMax();
	
	/**
	*setmax 
	* 
	* @behavior.fieldname max 
	*/
	public void setMax(String amax);

}