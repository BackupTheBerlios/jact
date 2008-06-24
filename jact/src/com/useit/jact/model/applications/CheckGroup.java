package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * CheckGroup<br>
 * Checks that the current number of total channels in the current channel's group does not exceed 'max'. If the number does not exceed 'max', we continue to the next step. If the number does in fact exceed max, if priority n+101 exists, then execution continues at that step, otherwise -1 is returned.
 * </p>
 * Created : Sun Jul 09 18:50:36 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: CheckGroup.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class CheckGroup extends PbxApplication implements ICheckGroup{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für CheckGroup
	**/
	public CheckGroup(){
		super();
	
	}
	/**
	* komplexer Konstruktor für CheckGroup
	**/
	public CheckGroup( String amax, String acategory){
		super();
	
		this.max = amax;	
		this.category = acategory;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(CheckGroup object){
		this.max = object.max;	
		this.category = object.category;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String max;
	public static final String VALUEID_MAX="max" ;

    /**   **/
	protected String category;
	public static final String VALUEID_CATEGORY="category" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_MAX.equals(valueid)){
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
		if(VALUEID_MAX.equals(valueid)){
			setMax((String)data);
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
		if(VALUEID_MAX.equals(valueid)){
			return getMax();
			
		}
		if(VALUEID_CATEGORY.equals(valueid)){
			return getCategory();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getmax 
	* 
	**/
	public String getMax(){		return  max;
	}
	/**
	*setmax 
	*/
	public void setMax(String amax){
		if(amax==null){
		    changed = (this.max!=null);
		    this.max = null;	    
		}else{
			changed = amax.equals(this.max);
			this.max=amax;
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
		sb.append("CheckGroup, ")		
		//.append("max=")
		.append(max)
		.append(",")
		//.append("category=")
		.append(category)
    			.append("");

		return sb.toString();		
	}
}