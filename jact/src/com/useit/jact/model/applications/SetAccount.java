package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetAccount<br>
 * Set the channel account code for billing purposes. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:49:18 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetAccount.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SetAccount extends PbxApplication implements ISetAccount{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetAccount
	**/
	public SetAccount(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetAccount
	**/
	public SetAccount( String aaccount){
		super();
	
		this.account = aaccount;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetAccount object){
		this.account = object.account;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String account;
	public static final String VALUEID_ACCOUNT="account" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_ACCOUNT.equals(valueid)){
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
		if(VALUEID_ACCOUNT.equals(valueid)){
			setAccount((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_ACCOUNT.equals(valueid)){
			return getAccount();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getaccount 
	* 
	**/
	public String getAccount(){		return  account;
	}
	/**
	*setaccount 
	*/
	public void setAccount(String aaccount){
		if(aaccount==null){
		    changed = (this.account!=null);
		    this.account = null;	    
		}else{
			changed = aaccount.equals(this.account);
			this.account=aaccount;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SetAccount, ")		
		//.append("account=")
		.append(account)
    			.append("");

		return sb.toString();		
	}
}