

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IZapateller<br>
 * Generates special information tone to block telemarketers from calling you. Returns 0 normally or -1 on hangup. Options is a pipe-delimited list of options. The following options are available: 'answer' causes the line to be answered before playing the tone, 'nocallerid' causes Zapateller to only play the tone if there is no callerid information available. Options should be separated by | characters
 * </p>
 * Created : Wed Jul 05 18:55:06 CEST 2006
 * 
 * @behavior.elementname Zapateller
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZapateller.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IZapateller {
public static final String MODELNAME = "Zapateller";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_OPTIONS="options" ;
	//test
	//---------  getter und setter
	/**
	* getoptions 
	* 
	* @behavior.fieldname options 
	**/
	public String getOptions();
	
	/**
	*setoptions 
	* 
	* @behavior.fieldname options 
	*/
	public void setOptions(String aoptions);

}