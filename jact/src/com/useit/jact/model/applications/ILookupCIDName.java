

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ILookupCIDName<br>
 * Looks up the Caller*ID number on the active channel in the Asterisk database (family 'cidname') and sets the Caller*ID name. Does nothing if no Caller*ID was received on the channel. This is useful if you do not subscribe to Caller*ID name delivery, or if you want to change the names on some incoming calls. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:53:51 CEST 2006
 * 
 * @behavior.elementname LookupCIDName
 * @author urs
 * @version $Revision: 1.1 $, $Id: ILookupCIDName.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ILookupCIDName {
public static final String MODELNAME = "LookupCIDName";	
 
// ------   1-1 aggregates
	//test
	//---------  getter und setter

}