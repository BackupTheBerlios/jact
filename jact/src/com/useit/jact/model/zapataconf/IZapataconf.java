

package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;


/**
 * <p>
 * IZapataconf<br>
 * The format of the zapata.conf file is unfortunately not as simple as it could be. Most keywords do not do anything by themselves; they merely set up the parameters of any channel definitions that follow. The channel keyword actually creates the channel, using the settings specified before it.
 * </p>
 * Created : Fri May 26 14:30:41 CEST 2006
 * 
 * @behavior.elementname Zapataconf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZapataconf.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IZapataconf {
public static final String MODELNAME = "Zapataconf";	

/**
 * gibt die List<Zaptelchannel> zaptelchannelMap zurück	
 * @return List<Zaptelchannel>
 * @behavior.list ZaptelchannelMap 
 * @behavior.list.type Zaptelchannel 
 */
public List getZaptelchannelMap();
/**
 * setzt die Map ZaptelchannelMap
 * @param map zaptelchannelMapMap
 * @behavior.list ZaptelchannelMap 
 * @behavior.list.type Zaptelchannel 
 */
public void setZaptelchannelMap(List aList);
 
// ------   1-1 aggregates
	
	//---------  getter und setter

}