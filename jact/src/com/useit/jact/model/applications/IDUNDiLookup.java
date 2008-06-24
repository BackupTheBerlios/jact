

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IDUNDiLookup<br>
 * Looks up a given number in the global context specified or in the reserved 'e164' context if not specified. Returns -1 if the channel is hungup during the lookup or 0 otherwise. On completion, the variable ${DUNDTECH} and ${DUNDDEST} will contain the technology and destination of the appropriate technology and destination to access the number. If no answer was found, and the priority n + 101 exists, execution will continue at that location.
 * </p>
 * Created : Wed Jul 05 18:54:38 CEST 2006
 * 
 * @behavior.elementname DUNDiLookup
 * @author urs
 * @version $Revision: 1.1 $, $Id: IDUNDiLookup.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  IDUNDiLookup {
public static final String MODELNAME = "DUNDiLookup";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_NUMBER="number" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_OPTIONS="options" ;
	//test
	//---------  getter und setter
	/**
	* getnumber 
	* 
	* @behavior.fieldname number 
	**/
	public String getNumber();
	
	/**
	*setnumber 
	* 
	* @behavior.fieldname number 
	*/
	public void setNumber(String anumber);
	/**
	* getcontext 
	* 
	* @behavior.fieldname context 
	**/
	public String getContext();
	
	/**
	*setcontext 
	* 
	* @behavior.fieldname context 
	*/
	public void setContext(String acontext);
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