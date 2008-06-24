

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ICheckGroup<br>
 * Checks that the current number of total channels in the current channel's group does not exceed 'max'. If the number does not exceed 'max', we continue to the next step. If the number does in fact exceed max, if priority n+101 exists, then execution continues at that step, otherwise -1 is returned.
 * </p>
 * Created : Wed Jul 05 18:55:19 CEST 2006
 * 
 * @behavior.elementname CheckGroup
 * @author urs
 * @version $Revision: 1.1 $, $Id: ICheckGroup.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ICheckGroup {
public static final String MODELNAME = "CheckGroup";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_MAX="max" ;
// 	public static final String VALUEID_CATEGORY="category" ;
	//test
	//---------  getter und setter
	/**
	* getmax 
	* 
	* @behavior.fieldname max 
	**/
	public String getMax();
	
	/**
	*setmax 
	* 
	* @behavior.fieldname max 
	*/
	public void setMax(String amax);
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