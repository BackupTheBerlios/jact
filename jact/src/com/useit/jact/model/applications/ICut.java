

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ICut<br>
 * newvar - new variable created from result string  varname - variable you want cut  delimiter - defaults to '-'  fieldspec - number of the field you want (1-based offset)  may also be specified as a range (with -)  or group of ranges and fields (with &)  Returns 0 or -1 on hangup or error.
 * </p>
 * Created : Wed Jul 05 18:56:06 CEST 2006
 * 
 * @behavior.elementname Cut
 * @author urs
 * @version $Revision: 1.1 $, $Id: ICut.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  ICut {
public static final String MODELNAME = "Cut";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_NEWVAR="newvar" ;
// 	public static final String VALUEID_VARNAME="varname" ;
// 	public static final String VALUEID_DELIMITER="delimiter" ;
// 	public static final String VALUEID_FIELD="field" ;
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
	* getvarname 
	* 
	* @behavior.fieldname varname 
	**/
	public String getVarname();
	
	/**
	*setvarname 
	* 
	* @behavior.fieldname varname 
	*/
	public void setVarname(String avarname);
	/**
	* getdelimiter 
	* 
	* @behavior.fieldname delimiter 
	**/
	public String getDelimiter();
	
	/**
	*setdelimiter 
	* 
	* @behavior.fieldname delimiter 
	*/
	public void setDelimiter(String adelimiter);
	/**
	* getfield 
	* 
	* @behavior.fieldname field 
	**/
	public String getField();
	
	/**
	*setfield 
	* 
	* @behavior.fieldname field 
	*/
	public void setField(String afield);

}