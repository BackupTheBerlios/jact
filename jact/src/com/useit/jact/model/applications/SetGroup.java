package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SetGroup<br>
 * Sets the channel group to the specified value. Equivalent to SetVar(GROUP=group). Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:49:01 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SetGroup.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class SetGroup extends PbxApplication implements ISetGroup{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SetGroup
	**/
	public SetGroup(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SetGroup
	**/
	public SetGroup( String agroup){
		super();
	
		this.group = agroup;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SetGroup object){
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
		sb.append("SetGroup, ")		
		//.append("group=")
		.append(group)
    			.append("");

		return sb.toString();		
	}
}