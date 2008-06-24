

package com.useit.jact.model.misdndriverconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import java.util.List;

import com.useit.jact.model.types.MCardOptionSet;
import com.useit.jact.model.types.MisdnCardTypes;


/**
 * <p>
 * IMisdnCards<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:30 CEST 2006
 * 
 * @behavior.elementname MisdnCards
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMisdnCards.java,v 1.1 2008/06/24 20:45:02 urszeidler Exp $
 */
 public  interface  IMisdnCards {
public static final String MODELNAME = "MisdnCards";	

/**
 * gibt die List<MisdncardPorts> misdncardPortsMap zurück	
 * @return List<MisdncardPorts>
 * @behavior.list MisdncardPortsMap 
 * @behavior.list.type MisdncardPorts 
 */
public List getMisdncardPortsMap();
/**
 * setzt die Map MisdncardPortsMap
 * @param map misdncardPortsMapMap
 * @behavior.list MisdncardPortsMap 
 * @behavior.list.type MisdncardPorts 
 */
public void setMisdncardPortsMap(List aList);
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CARDNAME="cardname" ;
// 	public static final String VALUEID_CARDTYPE="cardtype" ;
// 	public static final String VALUEID_CARDOPTIONS="cardoptions" ;
	
	//---------  getter und setter

	/**
	* getcardName 
	* 
	* @behavior.fieldname cardName 
	**/
	public String getCardName();
	
	/**
	*setcardName 
	* 
	* @behavior.fieldname cardName 
	*/
	public void setCardName(String acardName);


	/**
	* getcardType 
	* 
	* @behavior.fieldname cardType 
	**/
	public MisdnCardTypes getCardType();
	
	/**
	*setcardType 
	* 
	* @behavior.fieldname cardType 
	*/
	public void setCardType(MisdnCardTypes acardType);


	/**
	* getcardOptions 
	* 
	* @behavior.fieldname cardOptions 
	**/
	public MCardOptionSet getCardOptions();
	
	/**
	*setcardOptions 
	* 
	* @behavior.fieldname cardOptions 
	*/
	public void setCardOptions(MCardOptionSet acardOptions);


}