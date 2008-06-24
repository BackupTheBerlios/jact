package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * DISA<br>
 * -- Allows someone from outside the telephone switch (PBX) to obtain an "internal" system dialtone and to place calls from it as if they were placing a call from within the switch. A user calls a number that connects to the DISA application and is given dialtone. The user enters their passcode, followed by the pound sign (#). If the passcode is correct, the user is then given system dialtone on which a call may be placed. Obviously, this type of access has SERIOUS security implications, and GREAT care must be taken NOT to compromise your security.  There is a possibility of accessing DISA without password. Simply exchange your password with no-password.   Example: exten => s,1,DISA,no-password|local  but be aware of using this for your security compromising.  The arguments to this application (in extensions.conf) allow either specification of a single global password (that everyone uses), or individual passwords contained in a file. It also allow specification of the context on which the user will be dialing. If no context is specified, the DISA application defaults the context to "disa" presumably that a normal system will have a special context set up for DISA use with some or a lot of restrictions. The arguments are one of the following:   numeric-passcode  numeric-passcode|context  full-pathname-of-file-that-contains-passcodes  The file that contains the passcodes (if used) allows specification of either just a passcode (defaulting to the "disa" context, or passcode|context on each line of the file. The file may contain blank lines, or comments starting with "#" or ";". In addition, the above arguments may have |new-callerid-string appended to them, to specify a new (different) callerid to be used for this call, for example: numeric-passcode|context|"My Phone" <(234) 123-4567> or  full-pathname-of-passcode-file|"My Phone" <(234) 123-4567>. Last but not least, |mailbox[@context] may be appended, which will cause a stutter-dialtone (indication "dialrecall") to be used, if the specified mailbox contains any new messages, for example: numeric-passcode|context||1234 (w/a changing callerid). Note that in the case of specifying the numeric-passcode, the context must be specified if the callerid is specified also.  If login is successful, the application parses the dialed number in the specified (or default) context, and returns 0 with the new extension context filled-in and the priority set to 1, so that the PBX may re-apply the routing tables to it and complete the call normally.
 * </p>
 * Created : Sun Jul 09 18:49:49 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DISA.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class DISA extends PbxApplication implements IDISA{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für DISA
	**/
	public DISA(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DISA
	**/
	public DISA( String adirect, String ainward, String asystem, String aaccess){
		super();
	
		this.direct = adirect;	
		this.inward = ainward;	
		this.system = asystem;	
		this.access = aaccess;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(DISA object){
		this.direct = object.direct;	
		this.inward = object.inward;	
		this.system = object.system;	
		this.access = object.access;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String direct;
	public static final String VALUEID_DIRECT="direct" ;

    /**   **/
	protected String inward;
	public static final String VALUEID_INWARD="inward" ;

    /**   **/
	protected String system;
	public static final String VALUEID_SYSTEM="system" ;

    /**   **/
	protected String access;
	public static final String VALUEID_ACCESS="access" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_DIRECT.equals(valueid)){
			return true;
		}
		if(VALUEID_INWARD.equals(valueid)){
			return true;
		}
		if(VALUEID_SYSTEM.equals(valueid)){
			return true;
		}
		if(VALUEID_ACCESS.equals(valueid)){
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
		if(VALUEID_DIRECT.equals(valueid)){
			setDirect((String)data);
			return;
		}
		if(VALUEID_INWARD.equals(valueid)){
			setInward((String)data);
			return;
		}
		if(VALUEID_SYSTEM.equals(valueid)){
			setSystem((String)data);
			return;
		}
		if(VALUEID_ACCESS.equals(valueid)){
			setAccess((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_DIRECT.equals(valueid)){
			return getDirect();
			
		}
		if(VALUEID_INWARD.equals(valueid)){
			return getInward();
			
		}
		if(VALUEID_SYSTEM.equals(valueid)){
			return getSystem();
			
		}
		if(VALUEID_ACCESS.equals(valueid)){
			return getAccess();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getdirect 
	* 
	**/
	public String getDirect(){		return  direct;
	}
	/**
	*setdirect 
	*/
	public void setDirect(String adirect){
		if(adirect==null){
		    changed = (this.direct!=null);
		    this.direct = null;	    
		}else{
			changed = adirect.equals(this.direct);
			this.direct=adirect;
		}
	}


	/**
	* getinward 
	* 
	**/
	public String getInward(){		return  inward;
	}
	/**
	*setinward 
	*/
	public void setInward(String ainward){
		if(ainward==null){
		    changed = (this.inward!=null);
		    this.inward = null;	    
		}else{
			changed = ainward.equals(this.inward);
			this.inward=ainward;
		}
	}


	/**
	* getsystem 
	* 
	**/
	public String getSystem(){		return  system;
	}
	/**
	*setsystem 
	*/
	public void setSystem(String asystem){
		if(asystem==null){
		    changed = (this.system!=null);
		    this.system = null;	    
		}else{
			changed = asystem.equals(this.system);
			this.system=asystem;
		}
	}


	/**
	* getaccess 
	* 
	**/
	public String getAccess(){		return  access;
	}
	/**
	*setaccess 
	*/
	public void setAccess(String aaccess){
		if(aaccess==null){
		    changed = (this.access!=null);
		    this.access = null;	    
		}else{
			changed = aaccess.equals(this.access);
			this.access=aaccess;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("DISA, ")		
		//.append("direct=")
		.append(direct)
		.append(",")
		//.append("inward=")
		.append(inward)
		.append(",")
		//.append("system=")
		.append(system)
		.append(",")
		//.append("access=")
		.append(access)
    			.append("");

		return sb.toString();		
	}
}