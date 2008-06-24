

package com.useit.jact.model.sipconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * ISipConf<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:37 CEST 2006
 * 
 * @behavior.elementname SipConf
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISipConf.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  ISipConf {
public static final String MODELNAME = "SipConf";	

/**
 * gibt die List<Sippeers> sippeersMap zurück	
 * @return List<Sippeers>
 * @behavior.list SippeersMap 
 * @behavior.list.type Sippeers 
 */
public List getSippeersMap();
/**
 * setzt die Map SippeersMap
 * @param map sippeersMapMap
 * @behavior.list SippeersMap 
 * @behavior.list.type Sippeers 
 */
public void setSippeersMap(List aList);
 
// ------   1-1 aggregates
/**
 * @return Sipgeneral the aggregates instance
 * @behavior.agg  
 * @behavior.agg.type Sipgeneral 
 */
public ISipgeneral getSipgeneral();

/**
 * setzt den Sipgeneral und die Sipgeneralid	
 * @param Sipgeneral
 */
public void setSipgeneral(ISipgeneral aSipgeneral);
	
	//---------  getter und setter

}