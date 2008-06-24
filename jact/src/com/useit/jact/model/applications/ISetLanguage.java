

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISetLanguage<br>
 * Set the channel language to 'language'. This information is used for the syntax in generation of numbers, and to choose a natural language file when available.  For example, if language is set to 'fr' and the file 'demo-congrats' is  requested to be played, if the file 'fr/demo-congrats' exists, then it will play that file, and if not will play the normal 'demo-congrats'. Always returns 0.
 * </p>
 * Created : Wed Jul 05 18:55:41 CEST 2006
 * 
 * @behavior.elementname SetLanguage
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISetLanguage.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  ISetLanguage {
public static final String MODELNAME = "SetLanguage";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_LANGUAGE="language" ;
	//test
	//---------  getter und setter
	/**
	* getlanguage 
	* 
	* @behavior.fieldname language 
	**/
	public String getLanguage();
	
	/**
	*setlanguage 
	* 
	* @behavior.fieldname language 
	*/
	public void setLanguage(String alanguage);

}