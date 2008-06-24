package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SIPGetHeader<br>
 * Sets a channel variable to the content of a SIP header Skips to priority+101 if header does not exist Otherwise returns 0
 * </p>
 * Created : Sun Jul 09 18:49:19 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SIPGetHeader.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SIPGetHeader extends PbxApplication implements ISIPGetHeader{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SIPGetHeader
	**/
	public SIPGetHeader(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SIPGetHeader
	**/
	public SIPGetHeader( String avar, String aheadername){
		super();
	
		this.var = avar;	
		this.headername = aheadername;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SIPGetHeader object){
		this.var = object.var;	
		this.headername = object.headername;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String var;
	public static final String VALUEID_VAR="var" ;

    /**   **/
	protected String headername;
	public static final String VALUEID_HEADERNAME="headername" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_VAR.equals(valueid)){
			return true;
		}
		if(VALUEID_HEADERNAME.equals(valueid)){
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
		if(VALUEID_VAR.equals(valueid)){
			setVar((String)data);
			return;
		}
		if(VALUEID_HEADERNAME.equals(valueid)){
			setHeadername((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_VAR.equals(valueid)){
			return getVar();
			
		}
		if(VALUEID_HEADERNAME.equals(valueid)){
			return getHeadername();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getvar 
	* 
	**/
	public String getVar(){		return  var;
	}
	/**
	*setvar 
	*/
	public void setVar(String avar){
		if(avar==null){
		    changed = (this.var!=null);
		    this.var = null;	    
		}else{
			changed = avar.equals(this.var);
			this.var=avar;
		}
	}


	/**
	* getheadername 
	* 
	**/
	public String getHeadername(){		return  headername;
	}
	/**
	*setheadername 
	*/
	public void setHeadername(String aheadername){
		if(aheadername==null){
		    changed = (this.headername!=null);
		    this.headername = null;	    
		}else{
			changed = aheadername.equals(this.headername);
			this.headername=aheadername;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SIPGetHeader, ")		
		//.append("var=")
		.append(var)
		.append(",")
		//.append("headername=")
		.append(headername)
    			.append("");

		return sb.toString();		
	}
}