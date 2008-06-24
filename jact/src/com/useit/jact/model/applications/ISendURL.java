

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ISendURL<br>
 * Requests client go to URL. If the client does not support html transport, and there exists a step with priority n + 101, then execution will continue at that step. Otherwise, execution will continue at the next priority level. SendURL only returns 0 if the URL was sent correctly or if the channel does not support HTML transport, and -1 otherwise. If the option 'wait' is specified, execution will wait for an acknowledgement that the URL has been loaded before continuing and will return -1 if the peer is unable to load the URL
 * </p>
 * Created : Wed Jul 05 18:54:36 CEST 2006
 * 
 * @behavior.elementname SendURL
 * @author urs
 * @version $Revision: 1.1 $, $Id: ISendURL.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  interface  ISendURL {
public static final String MODELNAME = "SendURL";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_URL="url" ;
// 	public static final String VALUEID_OPTION="option" ;
	//test
	//---------  getter und setter
	/**
	* getuRL 
	* 
	* @behavior.fieldname uRL 
	**/
	public String getURL();
	
	/**
	*setuRL 
	* 
	* @behavior.fieldname uRL 
	*/
	public void setURL(String auRL);
	/**
	* getoption 
	* 
	* @behavior.fieldname option 
	**/
	public String getOption();
	
	/**
	*setoption 
	* 
	* @behavior.fieldname option 
	*/
	public void setOption(String aoption);

}