

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IADSIProg<br>
 * Programs an ADSI Phone with the given script. If none is specified, the default is used. Returns 0 unless CPE is hungup.
 * </p>
 * Created : Wed Jul 05 18:55:33 CEST 2006
 * 
 * @behavior.elementname ADSIProg
 * @author urs
 * @version $Revision: 1.1 $, $Id: IADSIProg.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IADSIProg {
public static final String MODELNAME = "ADSIProg";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_SCRIPT="script" ;
	//test
	//---------  getter und setter
	/**
	* getscript 
	* 
	* @behavior.fieldname script 
	**/
	public String getScript();
	
	/**
	*setscript 
	* 
	* @behavior.fieldname script 
	*/
	public void setScript(String ascript);

}