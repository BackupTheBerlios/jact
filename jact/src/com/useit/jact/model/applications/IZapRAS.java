

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IZapRAS<br>
 * Executes a RAS server using pppd on the given channel. The channel must be a clear channel (i.e. PRI source) and a Zaptel channel to be able to use this function (No modem emulation is included). Your pppd must be patched to be zaptel aware. Arguments should be separated by | characters. Always returns -1.
 * </p>
 * Created : Wed Jul 05 18:55:35 CEST 2006
 * 
 * @behavior.elementname ZapRAS
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZapRAS.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IZapRAS {
public static final String MODELNAME = "ZapRAS";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_ARGS="args" ;
	//test
	//---------  getter und setter
	/**
	* getargs 
	* 
	* @behavior.fieldname args 
	**/
	public String getArgs();
	
	/**
	*setargs 
	* 
	* @behavior.fieldname args 
	*/
	public void setArgs(String aargs);

}