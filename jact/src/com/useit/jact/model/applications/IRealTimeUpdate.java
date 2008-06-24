

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IRealTimeUpdate<br>
 * The column <newcol> in 'family' matching column <colmatch>=<value> will be updated to <newval>
 * </p>
 * Created : Wed Jul 05 18:55:22 CEST 2006
 * 
 * @behavior.elementname RealTimeUpdate
 * @author urs
 * @version $Revision: 1.1 $, $Id: IRealTimeUpdate.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IRealTimeUpdate {
public static final String MODELNAME = "RealTimeUpdate";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FAMILY="family" ;
// 	public static final String VALUEID_COLMATCH="colmatch" ;
// 	public static final String VALUEID_VALUE="value" ;
// 	public static final String VALUEID_NEWCOL="newcol" ;
// 	public static final String VALUEID_NEWVAL="newval" ;
	//test
	//---------  getter und setter
	/**
	* getfamily 
	* 
	* @behavior.fieldname family 
	**/
	public String getFamily();
	
	/**
	*setfamily 
	* 
	* @behavior.fieldname family 
	*/
	public void setFamily(String afamily);
	/**
	* getcolmatch 
	* 
	* @behavior.fieldname colmatch 
	**/
	public String getColmatch();
	
	/**
	*setcolmatch 
	* 
	* @behavior.fieldname colmatch 
	*/
	public void setColmatch(String acolmatch);
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
	* getnewcol 
	* 
	* @behavior.fieldname newcol 
	**/
	public String getNewcol();
	
	/**
	*setnewcol 
	* 
	* @behavior.fieldname newcol 
	*/
	public void setNewcol(String anewcol);
	/**
	* getnewval 
	* 
	* @behavior.fieldname newval 
	**/
	public String getNewval();
	
	/**
	*setnewval 
	* 
	* @behavior.fieldname newval 
	*/
	public void setNewval(String anewval);

}