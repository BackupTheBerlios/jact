

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IPrivacyManager<br>
 * If no Caller*ID is sent, PrivacyManager answers the channel and asks the caller to enter their phone number. The caller is given 3 attempts. If after 3 attempts, they do not enter at least a 10 digit phone number, and if there exists a priority n + 101, where 'n' is the priority of the current instance, then the channel will be setup to continue at that priority level. Otherwise, it returns 0. Does nothing if Caller*ID was received on the channel.  Configuration file privacy.conf contains two variables:  maxretries default 3 -maximum number of attempts the caller is allowed to input a callerid.  minlength default 10 -minimum allowable digits in the input callerid number.
 * </p>
 * Created : Wed Jul 05 18:55:42 CEST 2006
 * 
 * @behavior.elementname PrivacyManager
 * @author urs
 * @version $Revision: 1.1 $, $Id: IPrivacyManager.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IPrivacyManager {
public static final String MODELNAME = "PrivacyManager";	
 
// ------   1-1 aggregates
	//test
	//---------  getter und setter

}