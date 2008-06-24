

package com.useit.jact.model.queueconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * IQueuemember<br>
 * Each member of this call queue is listed on a separate line in the form technology/dialstring.  "member" means a normal member of a queue.  An optional penalty may be specified after a comma, such that entries with higher penalties are considered last.
 * </p>
 * Created : Fri May 26 14:30:30 CEST 2006
 * 
 * @behavior.elementname Queuemember
 * @author urs
 * @version $Revision: 1.1 $, $Id: IQueuemember.java,v 1.1 2008/06/24 20:45:20 urszeidler Exp $
 */
 public  interface  IQueuemember {
public static final String MODELNAME = "Queuemember";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TECH="tech" ;
// 	public static final String VALUEID_DIALSTRING="dialstring" ;
	
	//---------  getter und setter

	/**
	* gettech 
	* the technology
	* @behavior.fieldname tech 
	**/
	public String getTech();
	
	/**
	*settech 
	* the technology
	* @behavior.fieldname tech 
	*/
	public void setTech(String atech);


	/**
	* getdialstring 
	* the dial string
	* @behavior.fieldname dialstring 
	**/
	public String getDialstring();
	
	/**
	*setdialstring 
	* the dial string
	* @behavior.fieldname dialstring 
	*/
	public void setDialstring(String adialstring);


}