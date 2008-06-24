package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * AddQueueMember<br>
 * Dynamically adds interface to an existing queue. If the interface is already in the queue and there exists an n+101 priority then it will then jump to this priority. Otherwise it will return an error Returns -1 if there is an error. Example: AddQueueMember(techsupport|SIP/3000)
 * </p>
 * Created : Sun Jul 09 18:49:56 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: AddQueueMember.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class AddQueueMember extends PbxApplication implements IAddQueueMember{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für AddQueueMember
	**/
	public AddQueueMember(){
		super();
	
	}
	/**
	* komplexer Konstruktor für AddQueueMember
	**/
	public AddQueueMember( String aqueuename, String ainterface_, String apenalty){
		super();
	
		this.queuename = aqueuename;	
		this.interface_ = ainterface_;	
		this.penalty = apenalty;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(AddQueueMember object){
		this.queuename = object.queuename;	
		this.interface_ = object.interface_;	
		this.penalty = object.penalty;	

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

    /**   **/
	protected String penalty;
	public static final String VALUEID_PENALTY="penalty" ;

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
		if(VALUEID_PENALTY.equals(valueid)){
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
		if(VALUEID_PENALTY.equals(valueid)){
			setPenalty((String)data);
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
		if(VALUEID_PENALTY.equals(valueid)){
			return getPenalty();
			
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
	* getpenalty 
	* 
	**/
	public String getPenalty(){		return  penalty;
	}
	/**
	*setpenalty 
	*/
	public void setPenalty(String apenalty){
		if(apenalty==null){
		    changed = (this.penalty!=null);
		    this.penalty = null;	    
		}else{
			changed = apenalty.equals(this.penalty);
			this.penalty=apenalty;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("AddQueueMember, ")		
		//.append("queuename=")
		.append(queuename)
		.append(",")
		//.append("interface_=")
		.append(interface_)
		.append(",")
		//.append("penalty=")
		.append(penalty)
    			.append("");

		return sb.toString();		
	}
}