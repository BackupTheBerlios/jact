

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetGroup<br>
 * Sets the channel group to the specified value. Equivalent to SetVar(GROUP=group). Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:53:48 CEST 2006
 * 
 * @behavior.elementname SetGroup
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetGroup.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ISetGroup {
public static final String MODELNAME = "SetGroup";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_GROUP="group" ;
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

}