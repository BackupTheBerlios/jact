package com.useit.jact.model.indicationsconf;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.app.framework.model.dataModel.AbstractSimpleDataClass;


/**
 * <p>
 * CustomTone<br>
 * 
 * </p>
 * Created : Fri May 26 14:32:03 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: CustomTone.java,v 1.1 2008/06/24 20:45:13 urszeidler Exp $
 */
 public  class CustomTone extends AbstractSimpleDataClass implements ICustomTone{
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für CustomTone
	**/
	public CustomTone(){
		super();
	
	}
	/**
	* komplexer Konstruktor für CustomTone
	**/
	public CustomTone( String atonecode, String aname){
		super();
	
		this.tonecode = atonecode;	
		this.name = aname;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(CustomTone object){
		this.tonecode = object.tonecode;	
		this.name = object.name;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String tonecode;
	public static final String VALUEID_TONECODE="tonecode" ;

    /**   **/
	protected String name;
	public static final String VALUEID_NAME="name" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TONECODE.equals(valueid)){
			return true;
		}
		if(VALUEID_NAME.equals(valueid)){
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
		if(VALUEID_TONECODE.equals(valueid)){
			setTonecode((String)data);
			return;
		}
		if(VALUEID_NAME.equals(valueid)){
			setName((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TONECODE.equals(valueid)){
			return getTonecode();
			
		}
		if(VALUEID_NAME.equals(valueid)){
			return getName();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettonecode 
	* 
	**/
	public String getTonecode(){		return  tonecode;
	}
	/**
	*settonecode 
	*/
	public void setTonecode(String atonecode){
		if(atonecode==null){
		    changed = (this.tonecode!=null);
		    this.tonecode = null;	    
		}else{
			changed = atonecode.equals(this.tonecode);
			this.tonecode=atonecode;
		}
	}


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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("[")		
		.append("tonecode=")
		.append(tonecode)
		.append(",")
		.append("name=")
		.append(name)
    			.append("]");

		return sb.toString();		
	}}