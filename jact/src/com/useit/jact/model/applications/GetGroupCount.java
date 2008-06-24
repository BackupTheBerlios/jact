package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * GetGroupCount<br>
 * Calculates the group count for the specified group, or uses the current channel's group if not specifed (and non-empty). Stores result in GROUPCOUNT. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:49:02 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GetGroupCount.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class GetGroupCount extends PbxApplication implements IGetGroupCount{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für GetGroupCount
	**/
	public GetGroupCount(){
		super();
	
	}
	/**
	* komplexer Konstruktor für GetGroupCount
	**/
	public GetGroupCount( String agroup, String acategory){
		super();
	
		this.group = agroup;	
		this.category = acategory;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(GetGroupCount object){
		this.group = object.group;	
		this.category = object.category;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String group;
	public static final String VALUEID_GROUP="group" ;

    /**   **/
	protected String category;
	public static final String VALUEID_CATEGORY="category" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_GROUP.equals(valueid)){
			return true;
		}
		if(VALUEID_CATEGORY.equals(valueid)){
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
		if(VALUEID_CATEGORY.equals(valueid)){
			setCategory((String)data);
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
		if(VALUEID_CATEGORY.equals(valueid)){
			return getCategory();
			
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
	* getcategory 
	* 
	**/
	public String getCategory(){		return  category;
	}
	/**
	*setcategory 
	*/
	public void setCategory(String acategory){
		if(acategory==null){
		    changed = (this.category!=null);
		    this.category = null;	    
		}else{
			changed = acategory.equals(this.category);
			this.category=acategory;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("GetGroupCount, ")		
		//.append("group=")
		.append(group)
		.append(",")
		//.append("category=")
		.append(category)
    			.append("");

		return sb.toString();		
	}
}