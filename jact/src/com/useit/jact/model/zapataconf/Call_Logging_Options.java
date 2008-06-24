package com.useit.jact.model.zapataconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * Call_Logging_Options<br>
 * Asterisk normally generates Call Detail Records (CDR), being a log or database of the calls made through Asterisk. This data can be used for Automated Machine Accounting (AMA). See Asterisk Billing.
 * </p>
 * Created : Fri May 26 14:32:08 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Call_Logging_Options.java,v 1.1 2008/06/24 20:45:09 urszeidler Exp $
 */
 public  class Call_Logging_Options extends AbstractSimpleDataClass implements ICall_Logging_Options{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Call_Logging_Options
	**/
	public Call_Logging_Options(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Call_Logging_Options
	**/
	public Call_Logging_Options( String aaccountcode, String aamaflags){
		super();
	
		this.accountcode = aaccountcode;	
		this.amaflags = aamaflags;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Call_Logging_Options object){
		this.accountcode = object.accountcode;	
		this.amaflags = object.amaflags;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**  Sets the data for the "account code" field in the CDR for calls placed from this channel. The account code may be any alphanumeric string. It may be overridden at call time with the (( Asterisk cmd SetAccount|SetAccount)) command.   accountcode=spencer145 **/
	protected String accountcode;
	public static final String VALUEID_ACCOUNTCODE="accountcode" ;

    /**  Sets the AMA flags, affecting the categorization of entries in the call detail records. Possible values are:     * default:Let the CDR system use its default value.     * omit:Do not record calls.     * billing:Mark the entry for billing     * documentation:Mark the entry for documentation.    amaflags=billing **/
	protected String amaflags;
	public static final String VALUEID_AMAFLAGS="amaflags" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			return true;
		}
		if(VALUEID_AMAFLAGS.equals(valueid)){
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
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			setAccountcode((String)data);
			return;
		}
		if(VALUEID_AMAFLAGS.equals(valueid)){
			setAmaflags((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_ACCOUNTCODE.equals(valueid)){
			return getAccountcode();
			
		}
		if(VALUEID_AMAFLAGS.equals(valueid)){
			return getAmaflags();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getaccountcode 
	* Sets the data for the "account code" field in the CDR for calls placed from this channel. The account code may be any alphanumeric string. It may be overridden at call time with the (( Asterisk cmd SetAccount|SetAccount)) command.   accountcode=spencer145
	**/
	public String getAccountcode(){		return  accountcode;
	}
	/**
	*setaccountcode 
	*/
	public void setAccountcode(String aaccountcode){
		if(aaccountcode==null){
		    changed = (this.accountcode!=null);
		    this.accountcode = null;	    
		}else{
			changed = aaccountcode.equals(this.accountcode);
			this.accountcode=aaccountcode;
		}
	}


	/**
	* getamaflags 
	* Sets the AMA flags, affecting the categorization of entries in the call detail records. Possible values are:     * default:Let the CDR system use its default value.     * omit:Do not record calls.     * billing:Mark the entry for billing     * documentation:Mark the entry for documentation.    amaflags=billing
	**/
	public String getAmaflags(){		return  amaflags;
	}
	/**
	*setamaflags 
	*/
	public void setAmaflags(String aamaflags){
		if(aamaflags==null){
		    changed = (this.amaflags!=null);
		    this.amaflags = null;	    
		}else{
			changed = aamaflags.equals(this.amaflags);
			this.amaflags=aamaflags;
		}
	}



	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("accountcode=")
		.append(accountcode)
		.append(",")
		.append("amaflags=")
		.append(amaflags)
    			.append("]");

		return sb.toString();		
	}}