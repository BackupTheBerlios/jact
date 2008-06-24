

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ITransfer<br>
 * Requests the remote caller be transferred a given extension. Returns -1 on hangup, or 0 on completion regardless of whether the transfer was successful. If the transfer was *not* supported or successful and there exists a priority n + 101, then that priority will be taken next.
 * </p>
 * Created : Wed Jul 05 18:53:44 CEST 2006
 * 
 * @behavior.elementname Transfer
 * @author urs
 * @version $Revision: 1.1 $, $Id: ITransfer.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ITransfer {
public static final String MODELNAME = "Transfer";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TECH="tech" ;
// 	public static final String VALUEID_DEST="dest" ;
	//test
	//---------  getter und setter
	/**
	* gettech 
	* 
	* @behavior.fieldname tech 
	**/
	public String getTech();
	
	/**
	*settech 
	* 
	* @behavior.fieldname tech 
	*/
	public void setTech(String atech);
	/**
	* getdest 
	* 
	* @behavior.fieldname dest 
	**/
	public String getDest();
	
	/**
	*setdest 
	* 
	* @behavior.fieldname dest 
	*/
	public void setDest(String adest);

}