

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetAccount<br>
 * Set the channel account code for billing purposes. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:54:04 CEST 2006
 * 
 * @behavior.elementname SetAccount
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetAccount.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  ISetAccount {
public static final String MODELNAME = "SetAccount";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_ACCOUNT="account" ;
	//test
	//---------  getter und setter
	/**
	* getaccount 
	* 
	* @behavior.fieldname account 
	**/
	public String getAccount();
	
	/**
	*setaccount 
	* 
	* @behavior.fieldname account 
	*/
	public void setAccount(String aaccount);

}