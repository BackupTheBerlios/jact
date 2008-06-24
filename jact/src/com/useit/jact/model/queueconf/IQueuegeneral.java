

package com.useit.jact.model.queueconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IQueuegeneral<br>
 * Global settings for call queues
 * </p>
 * Created : Fri May 26 14:30:29 CEST 2006
 * 
 * @behavior.elementname Queuegeneral
 * @author urs
 * @version $Revision: 1.1 $, $Id: IQueuegeneral.java,v 1.1 2008/06/24 20:45:20 urszeidler Exp $
 */
 public  interface  IQueuegeneral {
public static final String MODELNAME = "Queuegeneral";	

/**
 * gibt die List<Queuesection> queuesectionMap zurück	
 * @return List<Queuesection>
 * @behavior.list QueuesectionMap 
 * @behavior.list.type Queuesection 
 */
public List getQueuesectionMap();
/**
 * setzt die Map QueuesectionMap
 * @param map queuesectionMapMap
 * @behavior.list QueuesectionMap 
 * @behavior.list.type Queuesection 
 */
public void setQueuesectionMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_PERSISTENTMEMBERS="persistentmembers" ;
	
	//---------  getter und setter

	/**
	* getpersistentmembers 
	* Persistent Members

    Store each dynamic agent in each queue in the astdb so that  when asterisk is restarted, each agent will be automatically  readded into their recorded queues. Default is 'yes'.
	* @behavior.fieldname persistentmembers 
	**/
	public Boolean getPersistentmembers();
	
	/**
	*setpersistentmembers 
	* Persistent Members

    Store each dynamic agent in each queue in the astdb so that  when asterisk is restarted, each agent will be automatically  readded into their recorded queues. Default is 'yes'.
	* @behavior.fieldname persistentmembers 
	*/
	public void setPersistentmembers(Boolean apersistentmembers);


}