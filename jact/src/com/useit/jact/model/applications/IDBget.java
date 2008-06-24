

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDBget<br>
 * Retrieves a value from the Asterisk database and stores it in the given variable. Always returns 0. If the requested key is not found, jumps to priority n+101 if available.
 * </p>
 * Created : Wed Jul 05 18:56:15 CEST 2006
 * 
 * @behavior.elementname DBget
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDBget.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IDBget {
public static final String MODELNAME = "DBget";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_VARNAME="varname" ;
// 	public static final String VALUEID_FAMILY="family" ;
// 	public static final String VALUEID_KEY="key" ;
	//test
	//---------  getter und setter
	/**
	* getvarname 
	* 
	* @behavior.fieldname varname 
	**/
	public String getVarname();
	
	/**
	*setvarname 
	* 
	* @behavior.fieldname varname 
	*/
	public void setVarname(String avarname);
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