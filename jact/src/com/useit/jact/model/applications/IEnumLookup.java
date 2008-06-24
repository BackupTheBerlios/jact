

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IEnumLookup<br>
 * Looks up an extension via ENUM and sets the variable 'ENUM'. For VoIP URIs this variable will  look like 'TECHNOLOGY/URI' with the appropriate technology. Returns -1 on hangup, or 0 on completion regardless of whether the  lookup was successful.  Currently, the enumservices SIP, H323, IAX, IAX2 and TEL are recognized.  A good SIP, H323, IAX or IAX2 entry will result in normal priority handling,  whereas a good TEL entry will increase the priority by 51 (if existing). If the lookup was *not* successful and there exists a priority n + 101, then that priority will be taken next.
 * </p>
 * Created : Wed Jul 05 18:56:02 CEST 2006
 * 
 * @behavior.elementname EnumLookup
 * @author urs
 * @version $Revision: 1.1 $, $Id: IEnumLookup.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IEnumLookup {
public static final String MODELNAME = "EnumLookup";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_EXTEN="exten" ;
	//test
	//---------  getter und setter
	/**
	* getexten 
	* 
	* @behavior.fieldname exten 
	**/
	public String getExten();
	
	/**
	*setexten 
	* 
	* @behavior.fieldname exten 
	*/
	public void setExten(String aexten);

}