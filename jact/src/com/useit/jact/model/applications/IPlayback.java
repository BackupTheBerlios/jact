

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IPlayback<br>
 * Plays back a given filename (do not put extension). Options may also be included following a pipe symbol. The 'skip' option causes the playback of the message to be skipped if the channel is not in the 'up' state (i.e. it hasn't been answered yet. If 'skip' is  specified, the application will return immediately should the channel not be off hook. Otherwise, unless 'noanswer' is specified, the channel channel will be answered before the sound is played. Not all channels support playing messages while still hook. Returns -1 if the channel was hung up. If the file does not exist, will jump to priority n+101 if present.
 * </p>
 * Created : Wed Jul 05 18:56:23 CEST 2006
 * 
 * @behavior.elementname Playback
 * @author urs
 * @version $Revision: 1.1 $, $Id: IPlayback.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IPlayback {
public static final String MODELNAME = "Playback";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FILENAME="filename" ;
// 	public static final String VALUEID_OPTION="option" ;
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