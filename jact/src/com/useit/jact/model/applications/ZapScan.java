package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ZapScan<br>
 * allows a call center manager to monitor Zap channels in a convenient way. Use '#' to select the next channel and use '*' to exit Limit scanning to a channel GROUP by setting the option group argument.
 * </p>
 * Created : Sun Jul 09 18:50:55 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ZapScan.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class ZapScan extends PbxApplication implements IZapScan{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ZapScan
	**/
	public ZapScan(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ZapScan
	**/
	public ZapScan( String agroup){
		super();
	
		this.group = agroup;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ZapScan object){
		this.group = object.group;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String group;
	public static final String VALUEID_GROUP="group" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_GROUP.equals(valueid)){
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
		if(VALUEID_GROUP.equals(valueid)){
			setGroup((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_GROUP.equals(valueid)){
			return getGroup();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getgroup 
	* 
	**/
	public String getGroup(){		return  group;
	}
	/**
	*setgroup 
	*/
	public void setGroup(String agroup){
		if(agroup==null){
		    changed = (this.group!=null);
		    this.group = null;	    
		}else{
			changed = agroup.equals(this.group);
			this.group=agroup;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ZapScan, ")		
		//.append("group=")
		.append(group)
    			.append("");

		return sb.toString();		
	}
}