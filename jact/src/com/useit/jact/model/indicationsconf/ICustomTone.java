

package com.useit.jact.model.indicationsconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ICustomTone<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:35 CEST 2006
 * 
 * @behavior.elementname CustomTone
 * @author urs
 * @version $Revision: 1.1 $, $Id: ICustomTone.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  interface  ICustomTone {
public static final String MODELNAME = "CustomTone";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TONECODE="tonecode" ;
// 	public static final String VALUEID_NAME="name" ;
	
	//---------  getter und setter

	/**
	* gettonecode 
	* 
	* @behavior.fieldname tonecode 
	**/
	public String getTonecode();
	
	/**
	*settonecode 
	* 
	* @behavior.fieldname tonecode 
	*/
	public void setTonecode(String atonecode);


	/**
	* getname 
	* 
	* @behavior.fieldname name 
	**/
	public String getName();
	
	/**
	*setname 
	* 
	* @behavior.fieldname name 
	*/
	public void setName(String aname);


}