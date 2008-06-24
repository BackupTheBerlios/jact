

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IRecord<br>
 * Records from the channel into a given filename. If the file exists it will be overwritten. - 'format' is the format of the file type to be recorded (wav, gsm, etc). - 'silence' is the number of seconds of silence to allow before returning. - 'maxduration' is the maximum recording duration in seconds. If missing or 0 there is no maximum. - 'options' may contain any of the following letters:  's' : skip recording if the line is not yet answered  'n' : do not answer, but record anyway if line not yet answered  'a' : append to existing recording rather than replacing  't' : use alternate '*' terminator key instead of default '#'  'q' : quiet (do not play a beep tone)  If filename contains '%d', these characters will be replaced with a number incremented by one each time the file is recorded.   Formats: g723, g729, gsm, h263, ulaw, alaw, vox, wav, WAV  User can press '#' to terminate the recording and continue to the next priority.  Returns -1 when the user hangs up.
 * </p>
 * Created : Wed Jul 05 18:55:52 CEST 2006
 * 
 * @behavior.elementname Record
 * @author urs
 * @version $Revision: 1.1 $, $Id: IRecord.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IRecord {
public static final String MODELNAME = "Record";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FILENAME="filename" ;
// 	public static final String VALUEID_FORMAT="format" ;
// 	public static final String VALUEID_SILENCE="silence" ;
// 	public static final String VALUEID_MAXDURATION="maxduration" ;
// 	public static final String VALUEID_OPTIONS="options" ;
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
	/**
	* getsilence 
	* 
	* @behavior.fieldname silence 
	**/
	public String getSilence();
	
	/**
	*setsilence 
	* 
	* @behavior.fieldname silence 
	*/
	public void setSilence(String asilence);
	/**
	* getmaxduration 
	* 
	* @behavior.fieldname maxduration 
	**/
	public String getMaxduration();
	
	/**
	*setmaxduration 
	* 
	* @behavior.fieldname maxduration 
	*/
	public void setMaxduration(String amaxduration);
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