

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.AbstractExtension;


/**
 * <p>
 * IGoto<br>
 * Set the priority to the specified value, optionally setting the extension and optionally the context as well. The extension BYEXTENSION is special in that it uses the current extension, thus permitting you to go to a different context, without specifying a specific extension. Always returns 0, even if the given context, extension, or priority is invalid.
 * </p>
 * Created : Wed Jul 05 18:55:14 CEST 2006
 * 
 * @behavior.elementname Goto
 * @author urs
 * @version $Revision: 1.1 $, $Id: IGoto.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  IGoto {
public static final String MODELNAME = "Goto";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_CONTEXT="context" ;
// 	public static final String VALUEID_EXTENSION="extension" ;
// 	public static final String VALUEID_PRIORITY="priority" ;
	//test
	//---------  getter und setter
	/**
	* getcontext 
	* 
	* @behavior.fieldname context 
	**/
	public String getContext();
	
	/**
	*setcontext 
	* 
	* @behavior.fieldname context 
	*/
	public void setContext(String acontext);
	/**
	* getextension 
	* 
	* @behavior.fieldname extension 
	**/
	public AbstractExtension getExtension();
	
	/**
	*setextension 
	* 
	* @behavior.fieldname extension 
	*/
	public void setExtension(AbstractExtension aextension);
	/**
	* getpriority 
	* 
	* @behavior.fieldname priority 
	**/
	public String getPriority();
	
	/**
	*setpriority 
	* 
	* @behavior.fieldname priority 
	*/
	public void setPriority(String apriority);

}