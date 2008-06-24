

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetVar<br>
 * Set a variables to a CDR. You can specify an endless list of name / value pairs to be set as channel variables. The last arg (if it doesn't contain an '=' ) is intrepreted as a string of options. Valid Options:  - c - CDR, if set set the var as a CDR variable also.  - r - Recursive CDR, if there are any stacked CDRs, also apply to all as a cdr var.  - g - Set a global variable not a channel variable.  #n=value: Sets variable n to value. If prefixed with _, single inheritance assumed. If prefixed with __, infinite inheritance is assumed.
 * </p>
 * Created : Wed Jul 05 18:56:30 CEST 2006
 * 
 * @behavior.elementname SetVar
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetVar.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  ISetVar {
public static final String MODELNAME = "SetVar";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_N1="n1" ;
// 	public static final String VALUEID_N2="n2" ;
// 	public static final String VALUEID_VALUE="value" ;
// 	public static final String VALUEID_OPTIONS="options" ;
	//test
	//---------  getter und setter
	/**
	* getn1 
	* 
	* @behavior.fieldname n1 
	**/
	public String getN1();
	
	/**
	*setn1 
	* 
	* @behavior.fieldname n1 
	*/
	public void setN1(String an1);
	/**
	* getn2 
	* 
	* @behavior.fieldname n2 
	**/
	public String getN2();
	
	/**
	*setn2 
	* 
	* @behavior.fieldname n2 
	*/
	public void setN2(String an2);
	/**
	* getvalue 
	* 
	* @behavior.fieldname value 
	**/
	public String getValue();
	
	/**
	*setvalue 
	* 
	* @behavior.fieldname value 
	*/
	public void setValue(String avalue);
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