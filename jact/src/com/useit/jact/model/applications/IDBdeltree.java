

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDBdeltree<br>
 * Deletes a family or keytree from the Asterisk database. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:55:17 CEST 2006
 * 
 * @behavior.elementname DBdeltree
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDBdeltree.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IDBdeltree {
public static final String MODELNAME = "DBdeltree";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FAMILY="family" ;
// 	public static final String VALUEID_KEYTREE="keytree" ;
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
	* getkeytree 
	* 
	* @behavior.fieldname keytree 
	**/
	public String getKeytree();
	
	/**
	*setkeytree 
	* 
	* @behavior.fieldname keytree 
	*/
	public void setKeytree(String akeytree);

}