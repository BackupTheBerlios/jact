

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetMusicOnHold<br>
 * Sets the default class for music on hold for a given channel. When music on hold is activated, this class will be used to select which music is played.
 * </p>
 * Created : Wed Jul 05 18:54:57 CEST 2006
 * 
 * @behavior.elementname SetMusicOnHold
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetMusicOnHold.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ISetMusicOnHold {
public static final String MODELNAME = "SetMusicOnHold";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CLASS_="class_" ;
	//test
	//---------  getter und setter
	/**
	* getclass_ 
	* 
	* @behavior.fieldname class_ 
	**/
	public String getClass_();
	
	/**
	*setclass_ 
	* 
	* @behavior.fieldname class_ 
	*/
	public void setClass_(String aclass_);

}