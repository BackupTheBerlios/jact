

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IMacro<br>
 * Executes a macro using the context 'macro-<macroname>', jumping to the 's' extension of that context and executing each step, then returning when the steps end.  The calling extension, context, and priority are stored in ${MACRO_EXTEN},  ${MACRO_CONTEXT} and ${MACRO_PRIORITY} respectively. Arguments become ${ARG1}, ${ARG2}, etc in the macro context. If you Goto out of the Macro context, the Macro will terminate and control will be returned at the location of the Goto. Macro returns -1 if any step in the macro returns -1, and 0 otherwise. If ${MACRO_OFFSET} is set at termination, Macro will attempt to continue at priority MACRO_OFFSET + N + 1 if such a step exists, and N + 1 otherwise.
 * </p>
 * Created : Wed Jul 05 18:53:36 CEST 2006
 * 
 * @behavior.elementname Macro
 * @author urs
 * @version $Revision: 1.1 $, $Id: IMacro.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IMacro {
public static final String MODELNAME = "Macro";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_MACRONAME="macroname" ;
// 	public static final String VALUEID_ARG1="arg1" ;
// 	public static final String VALUEID_ARG2="arg2" ;
	//test
	//---------  getter und setter
	/**
	* getmacroname 
	* 
	* @behavior.fieldname macroname 
	**/
	public String getMacroname();
	
	/**
	*setmacroname 
	* 
	* @behavior.fieldname macroname 
	*/
	public void setMacroname(String amacroname);
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
	/**
	* getarg2 
	* 
	* @behavior.fieldname arg2 
	**/
	public String getArg2();
	
	/**
	*setarg2 
	* 
	* @behavior.fieldname arg2 
	*/
	public void setArg2(String aarg2);

}