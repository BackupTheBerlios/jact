

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISendText<br>
 * Sends text to client. If the client does not support text transport, and there exists a step with priority n + 101, then execution will continue at that step. Otherwise, execution will continue at the next priority level. SendText only returns 0 if the text was sent correctly or if the channel does not support text transport, and -1 otherwise.
 * </p>
 * Created : Wed Jul 05 18:55:09 CEST 2006
 * 
 * @behavior.elementname SendText
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISendText.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  interface  ISendText {
public static final String MODELNAME = "SendText";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TEXT="text" ;
	//test
	//---------  getter und setter
	/**
	* gettext 
	* 
	* @behavior.fieldname text 
	**/
	public String getText();
	
	/**
	*settext 
	* 
	* @behavior.fieldname text 
	*/
	public void setText(String atext);

}