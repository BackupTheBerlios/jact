

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IRealTime<br>
 * All unique column names will be set as channel variables with optional prefix to the name. e.g. prefix of 'var_' would make the column 'name' become the variable ${var_name}
 * </p>
 * Created : Wed Jul 05 18:54:27 CEST 2006
 * 
 * @behavior.elementname RealTime
 * @author urs
 * @version $Revision: 1.1 $, $Id: IRealTime.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IRealTime {
public static final String MODELNAME = "RealTime";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FAMILY="family" ;
// 	public static final String VALUEID_COLMATCH="colmatch" ;
// 	public static final String VALUEID_VALUE="value" ;
// 	public static final String VALUEID_PREFIX="prefix" ;
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
	* getprefix 
	* 
	* @behavior.fieldname prefix 
	**/
	public String getPrefix();
	
	/**
	*setprefix 
	* 
	* @behavior.fieldname prefix 
	*/
	public void setPrefix(String aprefix);

}