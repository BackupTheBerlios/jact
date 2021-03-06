package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * TestServer<br>
 * Perform test server function and write call report. Results stored in /var/log/asterisk/testreports/<testid>-server.txt
 * </p>
 * Created : Sun Jul 09 18:50:57 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TestServer.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class TestServer extends PbxApplication implements ITestServer{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor f�r TestServer
	**/
	public TestServer(){
		super();
	
	}
	/**
	 * �bernimmt alle Werte aus dem �bergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim �ndern der daten
	 * @param object
	 */
	public void assignTo(TestServer object){

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

	/**
	 * �berpr�ft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
	    return false;
	}
	
	/**
	 * setzt einen Wert per valueid
	 * @param valueid
	 * @param data
	 */
	public void setByValue(String valueid,Object data){
	}
	/**
	 * gibt einen Wert by Vauleid zur�ck
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
	    
	    return null;
	}

	
	//---------  getter und setter

	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("TestServer, ")		
		.append("");

		return sb.toString();		
	}
}