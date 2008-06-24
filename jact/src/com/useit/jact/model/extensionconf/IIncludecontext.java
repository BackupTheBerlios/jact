

package com.useit.jact.model.extensionconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxContext;


/**
 * <p>
 * IIncludecontext<br>
 * 
 * </p>
 * Created : Wed May 31 09:04:12 CEST 2006
 * 
 * @behavior.elementname Includecontext
 * @author urs
 * @version $Revision: 1.1 $, $Id: IIncludecontext.java,v 1.1 2008/06/24 20:45:10 urszeidler Exp $
 */
 public  interface  IIncludecontext {
public static final String MODELNAME = "Includecontext";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONTEXNAME="contexname" ;
// 	public static final String VALUEID_TIMEING="timeing" ;
	
	//---------  getter und setter
	
	/**
	* getcontexname 
	* 
	* @behavior.fieldname contexname 
	**/
	public PbxContext getContexname();
	
	/**
	*setcontexname 
	* 
	* @behavior.fieldname contexname 
	*/
	public void setContexname(PbxContext acontexname);


	/**
	* gettimeing 
	* <time range>|<days of week>|<days of month>|<months>
	* @behavior.fieldname timeing 
	**/
	public String getTimeing();
	
	/**
	*settimeing 
	* <time range>|<days of week>|<days of month>|<months>
	* @behavior.fieldname timeing 
	*/
	public void setTimeing(String atimeing);


}