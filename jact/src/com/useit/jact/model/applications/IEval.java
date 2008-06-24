

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IEval<br>
 * Normally Asterisk evaluates variables inline. But what if you want to store variable offsets in a database, to be evaluated later? Eval is the answer, by allowing a string to be evaluated twice in the dialplan, the first time as part of the normal dialplan, and the second using Eval.
 * </p>
 * Created : Wed Jul 05 18:53:46 CEST 2006
 * 
 * @behavior.elementname Eval
 * @author urs
 * @version $Revision: 1.1 $, $Id: IEval.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IEval {
public static final String MODELNAME = "Eval";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_NEWVAR="newvar" ;
// 	public static final String VALUEID_SOMESTRING="somestring" ;
	//test
	//---------  getter und setter
	/**
	* getnewvar 
	* 
	* @behavior.fieldname newvar 
	**/
	public String getNewvar();
	
	/**
	*setnewvar 
	* 
	* @behavior.fieldname newvar 
	*/
	public void setNewvar(String anewvar);
	/**
	* getsomestring 
	* 
	* @behavior.fieldname somestring 
	**/
	public String getSomestring();
	
	/**
	*setsomestring 
	* 
	* @behavior.fieldname somestring 
	*/
	public void setSomestring(String asomestring);

}