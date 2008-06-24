

package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;


/**
 * <p>
 * ITestClient<br>
 * Executes test client with given testid. Results stored in /var/log/asterisk/testreports/<testid>-client.txt
 * </p>
 * Created : Wed Jul 05 18:54:37 CEST 2006
 * 
 * @behavior.elementname TestClient
 * @author urs
 * @version $Revision: 1.1 $, $Id: ITestClient.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  interface  ITestClient {
public static final String MODELNAME = "TestClient";	
 
// ------   1-1 aggregates
// 	public static final String VALUEID_TESTID="testid" ;
	//test
	//---------  getter und setter
	/**
	* gettestid 
	* 
	* @behavior.fieldname testid 
	**/
	public String getTestid();
	
	/**
	*settestid 
	* 
	* @behavior.fieldname testid 
	*/
	public void setTestid(String atestid);

}