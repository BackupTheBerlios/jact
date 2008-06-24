

package com.useit.jact.model.misdndriverconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IMisdnDriverConf<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:30 CEST 2006
 * 
 * @behavior.elementname MisdnDriverConf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMisdnDriverConf.java,v 1.1 2008/06/24 20:45:01 urszeidler Exp $
 */
 public  interface  IMisdnDriverConf {
public static final String MODELNAME = "MisdnDriverConf";	

/**
 * gibt die List<MisdnCards> misdnCardsMap zurück	
 * @return List<MisdnCards>
 * @behavior.list MisdnCardsMap 
 * @behavior.list.type MisdnCards 
 */
public List getMisdnCardsMap();
/**
 * setzt die Map MisdnCardsMap
 * @param map misdnCardsMapMap
 * @behavior.list MisdnCardsMap 
 * @behavior.list.type MisdnCards 
 */
public void setMisdnCardsMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_POLL="poll" ;
// 	public static final String VALUEID_PCM="pcm" ;
// 	public static final String VALUEID_DEBUG="debug" ;
	
	//---------  getter und setter

	/**
	* getpoll 
	* Only one poll value must be given for all cards. Give the number of samples for each fifo process. By default 128 is used. Decrease to reduce delay, increase to reduce cpu load. If unsure, don't mess with it! Valid is 8, 16, 32, 64, 128, 256.
	* @behavior.fieldname poll 
	**/
	public Integer getPoll();
	
	/**
	*setpoll 
	* Only one poll value must be given for all cards. Give the number of samples for each fifo process. By default 128 is used. Decrease to reduce delay, increase to reduce cpu load. If unsure, don't mess with it! Valid is 8, 16, 32, 64, 128, 256.
	* @behavior.fieldname poll 
	*/
	public void setPoll(Integer apoll);


	/**
	* getpcm 
	* Give the id of the PCM bus. All PCM busses with the same ID are expected to be connected and have equal slots. Only one chip of the PCM bus must be master, the others slave. -1 means no support of PCM bus.
	* @behavior.fieldname pcm 
	**/
	public Boolean getPcm();
	
	/**
	*setpcm 
	* Give the id of the PCM bus. All PCM busses with the same ID are expected to be connected and have equal slots. Only one chip of the PCM bus must be master, the others slave. -1 means no support of PCM bus.
	* @behavior.fieldname pcm 
	*/
	public void setPcm(Boolean apcm);


	/**
	* getdebug 
	* 
	* @behavior.fieldname debug 
	**/
	public Integer getDebug();
	
	/**
	*setdebug 
	* 
	* @behavior.fieldname debug 
	*/
	public void setDebug(Integer adebug);


}