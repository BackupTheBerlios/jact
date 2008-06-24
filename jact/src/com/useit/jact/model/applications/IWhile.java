

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IWhile<br>
 * Start a While Loop. Execution will return to this point when EndWhile is called until expr is no longer true.
 * </p>
 * Created : Wed Jul 05 18:56:12 CEST 2006
 * 
 * @behavior.elementname While
 * @author urs
 * @version $Revision: 1.1 $, $Id: IWhile.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IWhile {
public static final String MODELNAME = "While";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_EXPR="expr" ;
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

}