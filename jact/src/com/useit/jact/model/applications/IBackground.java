

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IBackground<br>
 * Plays given files, while simultaneously waiting for the user to begin typing an extension. The timeouts do not count until the last BackGround application has ended. Options may also be included following a pipe  symbol. The 'skip' option causes the playback of the message to be  skipped if the channel is not in the 'up' state (i.e. it hasn't been answered yet. If 'skip' is specified, the application will return immediately should the channel not be off hook. Otherwise, unless  'noanswer' is specified, the channel channel will be answered before the sound is played. Not all channels support playing messages while still hook. The 'langoverride' may be a language to use for playing the prompt which differs from the current language of the channel. Returns -1 if  the channel was hung up, or if the file does not exist. Returns 0 otherwise.
 * </p>
 * Created : Wed Jul 05 18:54:48 CEST 2006
 * 
 * @behavior.elementname Background
 * @author urs
 * @version $Revision: 1.1 $, $Id: IBackground.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IBackground {
public static final String MODELNAME = "Background";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FILENAME1="filename1" ;
// 	public static final String VALUEID_FILENAME2="filename2" ;
// 	public static final String VALUEID_OPTIONS="options" ;
// 	public static final String VALUEID_LANGOVERRIDE="langoverride" ;
	//test
	//---------  getter und setter
	/**
	* getfilename1 
	* 
	* @behavior.fieldname filename1 
	**/
	public String getFilename1();
	
	/**
	*setfilename1 
	* 
	* @behavior.fieldname filename1 
	*/
	public void setFilename1(String afilename1);
	/**
	* getfilename2 
	* 
	* @behavior.fieldname filename2 
	**/
	public String getFilename2();
	
	/**
	*setfilename2 
	* 
	* @behavior.fieldname filename2 
	*/
	public void setFilename2(String afilename2);
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
	/**
	* getlangoverride 
	* 
	* @behavior.fieldname langoverride 
	**/
	public String getLangoverride();
	
	/**
	*setlangoverride 
	* 
	* @behavior.fieldname langoverride 
	*/
	public void setLangoverride(String alangoverride);

}