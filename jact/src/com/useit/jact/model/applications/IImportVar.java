

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IImportVar<br>
 * Sets variable n to variable as evaluated on the specified channel (instead of current). If prefixed with _, single inheritance assumed. If prefixed with __, infinite inheritance is assumed.
 * </p>
 * Created : Wed Jul 05 18:55:48 CEST 2006
 * 
 * @behavior.elementname ImportVar
 * @author urs
 * @version $Revision: 1.1 $, $Id: IImportVar.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IImportVar {
public static final String MODELNAME = "ImportVar";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_N="n" ;
// 	public static final String VALUEID_CHANNEL="channel" ;
// 	public static final String VALUEID_VARIABLE="variable" ;
	//test
	//---------  getter und setter
	/**
	* getn 
	* 
	* @behavior.fieldname n 
	**/
	public String getN();
	
	/**
	*setn 
	* 
	* @behavior.fieldname n 
	*/
	public void setN(String an);
	/**
	* getchannel 
	* 
	* @behavior.fieldname channel 
	**/
	public String getChannel();
	
	/**
	*setchannel 
	* 
	* @behavior.fieldname channel 
	*/
	public void setChannel(String achannel);
	/**
	* getvariable 
	* 
	* @behavior.fieldname variable 
	**/
	public String getVariable();
	
	/**
	*setvariable 
	* 
	* @behavior.fieldname variable 
	*/
	public void setVariable(String avariable);

}