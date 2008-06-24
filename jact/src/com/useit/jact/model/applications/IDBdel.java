

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDBdel<br>
 * Deletes a key from the Asterisk database. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:56:24 CEST 2006
 * 
 * @behavior.elementname DBdel
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDBdel.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IDBdel {
public static final String MODELNAME = "DBdel";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FAMILY="family" ;
// 	public static final String VALUEID_KEY="key" ;
	//test
	//---------  getter und setter
	/**
	* getfamily 
	* 
	* @behavior.fieldname family 
	**/
	public String getFamily();
	
	/**
	*setfamily 
	* 
	* @behavior.fieldname family 
	*/
	public void setFamily(String afamily);
	/**
	* getkey 
	* 
	* @behavior.fieldname key 
	**/
	public String getKey();
	
	/**
	*setkey 
	* 
	* @behavior.fieldname key 
	*/
	public void setKey(String akey);

}