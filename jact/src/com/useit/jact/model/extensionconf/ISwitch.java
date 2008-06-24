

package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISwitch<br>
 * The SWITCH statement permits a server to share the dialplain with another server. Use with care: Reciprocal switch statements are not allowed (e.g. both A -> B and B -> A), and the switched server needs to be on-line or else dialing can be severly delayed.
 * </p>
 * Created : Wed May 31 09:04:12 CEST 2006
 * 
 * @behavior.elementname Switch
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISwitch.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  ISwitch {
public static final String MODELNAME = "Switch";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_SWITCHDIALSTR="switchdialstr" ;
	
	//---------  getter und setter
	
	/**
	* getswitchdialstr 
	* 
	* @behavior.fieldname switchdialstr 
	**/
	public String getSwitchdialstr();
	
	/**
	*setswitchdialstr 
	* 
	* @behavior.fieldname switchdialstr 
	*/
	public void setSwitchdialstr(String aswitchdialstr);


}