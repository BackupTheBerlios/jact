package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SMS<br>
 * SMS handles exchange of SMS data with a call to/from SMS capabale phone or SMS PSTN service centre. Can send and/or receive SMS messages. Returns 0 if call handled correctly, or -1 if there were any problems. Works to ETSI ES 201 912 compatible with BT SMS PSTN service in UK Typical usage is to use to handle called from the SMS service centre CLI, or to set up a call using 'outgoing' or manager interface to connect service centre to SMS() name is the name of the queue used in /var/spool/asterisk/sms Argument 'a' means answer, i.e. send initial FSK packet. Argument 's' means act as service centre talking to a phone. Messages are processed as per text file message queues. smsq is a command to generate message queues and send messages.
 * </p>
 * Created : Sun Jul 09 18:49:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SMS.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SMS extends PbxApplication implements ISMS{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SMS
	**/
	public SMS(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SMS
	**/
	public SMS( String aname, String aa, String as){
		super();
	
		this.name = aname;	
		this.a = aa;	
		this.s = as;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SMS object){
		this.name = object.name;	
		this.a = object.a;	
		this.s = object.s;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String name;
	public static final String VALUEID_NAME="name" ;

    /**   **/
	protected String a;
	public static final String VALUEID_A="a" ;

    /**   **/
	protected String s;
	public static final String VALUEID_S="s" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_NAME.equals(valueid)){
			return true;
		}
		if(VALUEID_A.equals(valueid)){
			return true;
		}
		if(VALUEID_S.equals(valueid)){
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
		if(VALUEID_NAME.equals(valueid)){
			setName((String)data);
			return;
		}
		if(VALUEID_A.equals(valueid)){
			setA((String)data);
			return;
		}
		if(VALUEID_S.equals(valueid)){
			setS((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_NAME.equals(valueid)){
			return getName();
			
		}
		if(VALUEID_A.equals(valueid)){
			return getA();
			
		}
		if(VALUEID_S.equals(valueid)){
			return getS();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getname 
	* 
	**/
	public String getName(){		return  name;
	}
	/**
	*setname 
	*/
	public void setName(String aname){
		if(aname==null){
		    changed = (this.name!=null);
		    this.name = null;	    
		}else{
			changed = aname.equals(this.name);
			this.name=aname;
		}
	}


	/**
	* geta 
	* 
	**/
	public String getA(){		return  a;
	}
	/**
	*seta 
	*/
	public void setA(String aa){
		if(aa==null){
		    changed = (this.a!=null);
		    this.a = null;	    
		}else{
			changed = aa.equals(this.a);
			this.a=aa;
		}
	}


	/**
	* gets 
	* 
	**/
	public String getS(){		return  s;
	}
	/**
	*sets 
	*/
	public void setS(String as){
		if(as==null){
		    changed = (this.s!=null);
		    this.s = null;	    
		}else{
			changed = as.equals(this.s);
			this.s=as;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SMS, ")		
		//.append("name=")
		.append(name)
		.append(",")
		//.append("a=")
		.append(a)
		.append(",")
		//.append("s=")
		.append(s)
    			.append("");

		return sb.toString();		
	}
}