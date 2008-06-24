

package com.useit.jact.model.misdnconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMisdnCryptkey<br>
 * Keys for cryption, you reference them in the dialplan later also in dynamic encr.
 * </p>
 * Created : Fri May 26 14:30:33 CEST 2006
 * 
 * @behavior.elementname MisdnCryptkey
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMisdnCryptkey.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  IMisdnCryptkey {
public static final String MODELNAME = "MisdnCryptkey";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_KEYNAME="keyname" ;
// 	public static final String VALUEID_KEYVALUE="keyvalue" ;
	
	//---------  getter und setter

	/**
	* getkeyname 
	* key name
	* @behavior.fieldname keyname 
	**/
	public String getKeyname();
	
	/**
	*setkeyname 
	* key name
	* @behavior.fieldname keyname 
	*/
	public void setKeyname(String akeyname);


	/**
	* getkeyvalue 
	* key value
	* @behavior.fieldname keyvalue 
	**/
	public String getKeyvalue();
	
	/**
	*setkeyvalue 
	* key value
	* @behavior.fieldname keyvalue 
	*/
	public void setKeyvalue(String akeyvalue);


}