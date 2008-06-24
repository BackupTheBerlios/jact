

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMacroIf<br>
 * Executes macro defined in <macroname_a> if <expr> is true (otherwise <macroname_b> if provided) Arguments and return values as in application macro()
 * </p>
 * Created : Wed Jul 05 18:56:01 CEST 2006
 * 
 * @behavior.elementname MacroIf
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMacroIf.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  IMacroIf {
public static final String MODELNAME = "MacroIf";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_EXPR="expr" ;
// 	public static final String VALUEID_MACRONAME_A="macroname_a" ;
// 	public static final String VALUEID_MACRONAME_B="macroname_b" ;
// 	public static final String VALUEID_ARG1="arg1" ;
	//test
	//---------  getter und setter
	/**
	* getexpr 
	* 
	* @behavior.fieldname expr 
	**/
	public String getExpr();
	
	/**
	*setexpr 
	* 
	* @behavior.fieldname expr 
	*/
	public void setExpr(String aexpr);
	/**
	* getmacroname_a 
	* 
	* @behavior.fieldname macroname_a 
	**/
	public String getMacroname_a();
	
	/**
	*setmacroname_a 
	* 
	* @behavior.fieldname macroname_a 
	*/
	public void setMacroname_a(String amacroname_a);
	/**
	* getmacroname_b 
	* 
	* @behavior.fieldname macroname_b 
	**/
	public String getMacroname_b();
	
	/**
	*setmacroname_b 
	* 
	* @behavior.fieldname macroname_b 
	*/
	public void setMacroname_b(String amacroname_b);
	/**
	* getarg1 
	* 
	* @behavior.fieldname arg1 
	**/
	public String getArg1();
	
	/**
	*setarg1 
	* 
	* @behavior.fieldname arg1 
	*/
	public void setArg1(String aarg1);

}