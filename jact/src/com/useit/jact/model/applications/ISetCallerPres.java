

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetCallerPres<br>
 * Set Caller*ID presentation on a call.  Always returns 0. Valid presentations are:   allowed_not_screened : Presentation Allowed, Not Screened  allowed_passed_screen : Presentation Allowed, Passed Screen  allowed_failed_screen : Presentation Allowed, Failed Screen  allowed : Presentation Allowed, Network Number  prohib_not_screened : Presentation Prohibited, Not Screened  prohib_passed_screen : Presentation Prohibited, Passed Screen  prohib_failed_screen : Presentation Prohibited, Failed Screen  prohib : Presentation Prohibited, Network Number  unavailable : Number Unavailable
 * </p>
 * Created : Wed Jul 05 18:53:57 CEST 2006
 * 
 * @behavior.elementname SetCallerPres
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetCallerPres.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ISetCallerPres {
public static final String MODELNAME = "SetCallerPres";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_PRESENTATION="presentation" ;
	//test
	//---------  getter und setter
	/**
	* getpresentation 
	* 
	* @behavior.fieldname presentation 
	**/
	public String getPresentation();
	
	/**
	*setpresentation 
	* 
	* @behavior.fieldname presentation 
	*/
	public void setPresentation(String apresentation);

}