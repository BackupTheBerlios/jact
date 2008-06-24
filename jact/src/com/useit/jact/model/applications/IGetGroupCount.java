

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IGetGroupCount<br>
 * Calculates the group count for the specified group, or uses the current channel's group if not specifed (and non-empty). Stores result in GROUPCOUNT. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:53:49 CEST 2006
 * 
 * @behavior.elementname GetGroupCount
 * @author urs
 * @version $Revision: 1.1 $, $Id: IGetGroupCount.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  interface  IGetGroupCount {
public static final String MODELNAME = "GetGroupCount";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_GROUP="group" ;
// 	public static final String VALUEID_CATEGORY="category" ;
	//test
	//---------  getter und setter
	/**
	* getgroup 
	* 
	* @behavior.fieldname group 
	**/
	public String getGroup();
	
	/**
	*setgroup 
	* 
	* @behavior.fieldname group 
	*/
	public void setGroup(String agroup);
	/**
	* getcategory 
	* 
	* @behavior.fieldname category 
	**/
	public String getCategory();
	
	/**
	*setcategory 
	* 
	* @behavior.fieldname category 
	*/
	public void setCategory(String acategory);

}