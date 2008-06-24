package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * TestClient<br>
 * Executes test client with given testid. Results stored in /var/log/asterisk/testreports/<testid>-client.txt
 * </p>
 * Created : Sun Jul 09 18:49:52 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: TestClient.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class TestClient extends PbxApplication implements ITestClient{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für TestClient
	**/
	public TestClient(){
		super();
	
	}
	/**
	* komplexer Konstruktor für TestClient
	**/
	public TestClient( String atestid){
		super();
	
		this.testid = atestid;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(TestClient object){
		this.testid = object.testid;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String testid;
	public static final String VALUEID_TESTID="testid" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TESTID.equals(valueid)){
			return true;
		}
	    return false;
	}
	
	/**
	 * setzt einen Wert per valueid
	 * @param valueid
	 * @param data
	 */
	public void setByValue(String valueid,Object data){
		if(VALUEID_TESTID.equals(valueid)){
			setTestid((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TESTID.equals(valueid)){
			return getTestid();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettestid 
	* 
	**/
	public String getTestid(){		return  testid;
	}
	/**
	*settestid 
	*/
	public void setTestid(String atestid){
		if(atestid==null){
		    changed = (this.testid!=null);
		    this.testid = null;	    
		}else{
			changed = atestid.equals(this.testid);
			this.testid=atestid;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("TestClient, ")		
		//.append("testid=")
		.append(testid)
    			.append("");

		return sb.toString();		
	}
}