

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDBput<br>
 * Stores the given value in the Asterisk database. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:54:02 CEST 2006
 * 
 * @behavior.elementname DBput
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDBput.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IDBput {
public static final String MODELNAME = "DBput";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FAMILY="family" ;
// 	public static final String VALUEID_KEY="key" ;
// 	public static final String VALUEID_VALUE="value" ;
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
	/**
	* getvalue 
	* 
	* @behavior.fieldname value 
	**/
	public String getValue();
	
	/**
	*setvalue 
	* 
	* @behavior.fieldname value 
	*/
	public void setValue(String avalue);

}