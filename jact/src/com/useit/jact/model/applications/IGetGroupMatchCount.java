

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IGetGroupMatchCount<br>
 * Calculates the group count for all groups that match the specified pattern. Uses standard regular expression matching (see regex(7)). Stores result in GROUPCOUNT. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:55:04 CEST 2006
 * 
 * @behavior.elementname GetGroupMatchCount
 * @author urs
 * @version $Revision: 1.1 $, $Id: IGetGroupMatchCount.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IGetGroupMatchCount {
public static final String MODELNAME = "GetGroupMatchCount";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_GROUPMATCH="groupmatch" ;
// 	public static final String VALUEID_CATEGORY="category" ;
	//test
	//---------  getter und setter
	/**
	* getgroupmatch 
	* 
	* @behavior.fieldname groupmatch 
	**/
	public String getGroupmatch();
	
	/**
	*setgroupmatch 
	* 
	* @behavior.fieldname groupmatch 
	*/
	public void setGroupmatch(String agroupmatch);
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