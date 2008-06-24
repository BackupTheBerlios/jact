package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * PauseQueueMember<br>
 * Pauses (blocks calls for) a queue member. The given interface will be paused in the given queue. This prevents any calls from being sent from the queue to the interface until it is unpaused with UnpauseQueueMember or the manager interface. If no queuename is given, the interface is paused in every queue it is a member of. If the interface is not in the named queue, or if no queue is given and the interface is not in any queue, it will jump to  priority n+101, if it exists. Returns -1 if the interface is not found and no extension to jump to exists, 0 otherwise. Example: PauseQueueMember(|SIP/3000)
 * </p>
 * Created : Sun Jul 09 18:49:06 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: PauseQueueMember.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class PauseQueueMember extends PbxApplication implements IPauseQueueMember{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für PauseQueueMember
	**/
	public PauseQueueMember(){
		super();
	
	}
	/**
	* komplexer Konstruktor für PauseQueueMember
	**/
	public PauseQueueMember( String aqueuename, String ainterface_){
		super();
	
		this.queuename = aqueuename;	
		this.interface_ = ainterface_;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(PauseQueueMember object){
		this.queuename = object.queuename;	
		this.interface_ = object.interface_;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String queuename;
	public static final String VALUEID_QUEUENAME="queuename" ;

    /**   **/
	protected String interface_;
	public static final String VALUEID_INTERFACE_="interface_" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_QUEUENAME.equals(valueid)){
			return true;
		}
		if(VALUEID_INTERFACE_.equals(valueid)){
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
		if(VALUEID_QUEUENAME.equals(valueid)){
			setQueuename((String)data);
			return;
		}
		if(VALUEID_INTERFACE_.equals(valueid)){
			setInterface_((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_QUEUENAME.equals(valueid)){
			return getQueuename();
			
		}
		if(VALUEID_INTERFACE_.equals(valueid)){
			return getInterface_();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getqueuename 
	* 
	**/
	public String getQueuename(){		return  queuename;
	}
	/**
	*setqueuename 
	*/
	public void setQueuename(String aqueuename){
		if(aqueuename==null){
		    changed = (this.queuename!=null);
		    this.queuename = null;	    
		}else{
			changed = aqueuename.equals(this.queuename);
			this.queuename=aqueuename;
		}
	}


	/**
	* getinterface_ 
	* 
	**/
	public String getInterface_(){		return  interface_;
	}
	/**
	*setinterface_ 
	*/
	public void setInterface_(String ainterface_){
		if(ainterface_==null){
		    changed = (this.interface_!=null);
		    this.interface_ = null;	    
		}else{
			changed = ainterface_.equals(this.interface_);
			this.interface_=ainterface_;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("PauseQueueMember, ")		
		//.append("queuename=")
		.append(queuename)
		.append(",")
		//.append("interface_=")
		.append(interface_)
    			.append("");

		return sb.toString();		
	}
}