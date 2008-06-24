

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISendImage<br>
 * Sends an image on a channel. If the channel does not support image transport, and there exists a step with priority n + 101, then execution will continue at that step. Otherwise, execution will continue at the next priority level. SendImage only returns 0 if the image was sent correctly or if the channel does not support image transport, and -1 otherwise.
 * </p>
 * Created : Wed Jul 05 18:53:59 CEST 2006
 * 
 * @behavior.elementname SendImage
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISendImage.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ISendImage {
public static final String MODELNAME = "SendImage";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_FILENAME="filename" ;
	//test
	//---------  getter und setter
	/**
	* getfilename 
	* 
	* @behavior.fieldname filename 
	**/
	public String getFilename();
	
	/**
	*setfilename 
	* 
	* @behavior.fieldname filename 
	*/
	public void setFilename(String afilename);

}