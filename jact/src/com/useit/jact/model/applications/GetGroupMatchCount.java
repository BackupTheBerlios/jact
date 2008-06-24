package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * GetGroupMatchCount<br>
 * Calculates the group count for all groups that match the specified pattern. Uses standard regular expression matching (see regex(7)). Stores result in GROUPCOUNT. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:50:19 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: GetGroupMatchCount.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class GetGroupMatchCount extends PbxApplication implements IGetGroupMatchCount{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für GetGroupMatchCount
	**/
	public GetGroupMatchCount(){
		super();
	
	}
	/**
	* komplexer Konstruktor für GetGroupMatchCount
	**/
	public GetGroupMatchCount( String agroupmatch, String acategory){
		super();
	
		this.groupmatch = agroupmatch;	
		this.category = acategory;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(GetGroupMatchCount object){
		this.groupmatch = object.groupmatch;	
		this.category = object.category;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String groupmatch;
	public static final String VALUEID_GROUPMATCH="groupmatch" ;

    /**   **/
	protected String category;
	public static final String VALUEID_CATEGORY="category" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_GROUPMATCH.equals(valueid)){
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
		if(VALUEID_GROUPMATCH.equals(valueid)){
			setGroupmatch((String)data);
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
		if(VALUEID_GROUPMATCH.equals(valueid)){
			return getGroupmatch();
			
		}
		if(VALUEID_CATEGORY.equals(valueid)){
			return getCategory();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getgroupmatch 
	* 
	**/
	public String getGroupmatch(){		return  groupmatch;
	}
	/**
	*setgroupmatch 
	*/
	public void setGroupmatch(String agroupmatch){
		if(agroupmatch==null){
		    changed = (this.groupmatch!=null);
		    this.groupmatch = null;	    
		}else{
			changed = agroupmatch.equals(this.groupmatch);
			this.groupmatch=agroupmatch;
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
		sb.append("GetGroupMatchCount, ")		
		//.append("groupmatch=")
		.append(groupmatch)
		.append(",")
		//.append("category=")
		.append(category)
    			.append("");

		return sb.toString();		
	}
}