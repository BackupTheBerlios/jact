

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IRandom<br>
 * probability := INTEGER in the range 1 to 100
 * </p>
 * Created : Wed Jul 05 18:56:32 CEST 2006
 * 
 * @behavior.elementname Random
 * @author urs
 * @version $Revision: 1.1 $, $Id: IRandom.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IRandom {
public static final String MODELNAME = "Random";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_PROBABILITY="probability" ;
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_EXTENSION="extension" ;
// 	public static final String VALUEID_PRIORITY="priority" ;
	//test
	//---------  getter und setter
	/**
	* getprobability 
	* 
	* @behavior.fieldname probability 
	**/
	public String getProbability();
	
	/**
	*setprobability 
	* 
	* @behavior.fieldname probability 
	*/
	public void setProbability(String aprobability);
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
	* getextension 
	* 
	* @behavior.fieldname extension 
	**/
	public String getExtension();
	
	/**
	*setextension 
	* 
	* @behavior.fieldname extension 
	*/
	public void setExtension(String aextension);
	/**
	* getpriority 
	* 
	* @behavior.fieldname priority 
	**/
	public String getPriority();
	
	/**
	*setpriority 
	* 
	* @behavior.fieldname priority 
	*/
	public void setPriority(String apriority);

}