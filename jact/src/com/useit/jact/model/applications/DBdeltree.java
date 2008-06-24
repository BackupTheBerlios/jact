package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * DBdeltree<br>
 * Deletes a family or keytree from the Asterisk database. Always returns 0.
 * </p>
 * Created : Sun Jul 09 18:50:35 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: DBdeltree.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class DBdeltree extends PbxApplication implements IDBdeltree{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für DBdeltree
	**/
	public DBdeltree(){
		super();
	
	}
	/**
	* komplexer Konstruktor für DBdeltree
	**/
	public DBdeltree( String afamily, String akeytree){
		super();
	
		this.family = afamily;	
		this.keytree = akeytree;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(DBdeltree object){
		this.family = object.family;	
		this.keytree = object.keytree;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String family;
	public static final String VALUEID_FAMILY="family" ;

    /**   **/
	protected String keytree;
	public static final String VALUEID_KEYTREE="keytree" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FAMILY.equals(valueid)){
			return true;
		}
		if(VALUEID_KEYTREE.equals(valueid)){
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
		if(VALUEID_FAMILY.equals(valueid)){
			setFamily((String)data);
			return;
		}
		if(VALUEID_KEYTREE.equals(valueid)){
			setKeytree((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_FAMILY.equals(valueid)){
			return getFamily();
			
		}
		if(VALUEID_KEYTREE.equals(valueid)){
			return getKeytree();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getfamily 
	* 
	**/
	public String getFamily(){		return  family;
	}
	/**
	*setfamily 
	*/
	public void setFamily(String afamily){
		if(afamily==null){
		    changed = (this.family!=null);
		    this.family = null;	    
		}else{
			changed = afamily.equals(this.family);
			this.family=afamily;
		}
	}


	/**
	* getkeytree 
	* 
	**/
	public String getKeytree(){		return  keytree;
	}
	/**
	*setkeytree 
	*/
	public void setKeytree(String akeytree){
		if(akeytree==null){
		    changed = (this.keytree!=null);
		    this.keytree = null;	    
		}else{
			changed = akeytree.equals(this.keytree);
			this.keytree=akeytree;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("DBdeltree, ")		
		//.append("family=")
		.append(family)
		.append(",")
		//.append("keytree=")
		.append(keytree)
    			.append("");

		return sb.toString();		
	}
}