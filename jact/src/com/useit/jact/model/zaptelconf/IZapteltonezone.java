

package com.useit.jact.model.zaptelconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IZapteltonezone<br>
 * 
 * </p>
 * Created : Fri May 26 14:30:32 CEST 2006
 * 
 * @behavior.elementname Zapteltonezone
 * @author urs
 * @version $Revision: 1.1 $, $Id: IZapteltonezone.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IZapteltonezone {
public static final String MODELNAME = "Zapteltonezone";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_ZONENAME="zonename" ;
	
	//---------  getter und setter

	/**
	* getzonename 
	* 
	* @behavior.fieldname zonename 
	**/
	public String getZonename();
	
	/**
	*setzonename 
	* 
	* @behavior.fieldname zonename 
	*/
	public void setZonename(String azonename);


}