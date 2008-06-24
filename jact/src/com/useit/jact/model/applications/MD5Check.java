package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * MD5Check<br>
 * Calculates a MD5 checksum on <string> and compares it with the hash. Returns 0 if <md5hash> is correct for <string>. Jumps to priority+101 if incorrect.
 * </p>
 * Created : Sun Jul 09 18:50:29 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: MD5Check.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class MD5Check extends PbxApplication implements IMD5Check{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für MD5Check
	**/
	public MD5Check(){
		super();
	
	}
	/**
	* komplexer Konstruktor für MD5Check
	**/
	public MD5Check( String amd5hash, String astring){
		super();
	
		this.md5hash = amd5hash;	
		this.string = astring;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(MD5Check object){
		this.md5hash = object.md5hash;	
		this.string = object.string;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String md5hash;
	public static final String VALUEID_MD5HASH="md5hash" ;

    /**   **/
	protected String string;
	public static final String VALUEID_STRING="string" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_MD5HASH.equals(valueid)){
			return true;
		}
		if(VALUEID_STRING.equals(valueid)){
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
		if(VALUEID_MD5HASH.equals(valueid)){
			setMd5hash((String)data);
			return;
		}
		if(VALUEID_STRING.equals(valueid)){
			setString((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_MD5HASH.equals(valueid)){
			return getMd5hash();
			
		}
		if(VALUEID_STRING.equals(valueid)){
			return getString();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getmd5hash 
	* 
	**/
	public String getMd5hash(){		return  md5hash;
	}
	/**
	*setmd5hash 
	*/
	public void setMd5hash(String amd5hash){
		if(amd5hash==null){
		    changed = (this.md5hash!=null);
		    this.md5hash = null;	    
		}else{
			changed = amd5hash.equals(this.md5hash);
			this.md5hash=amd5hash;
		}
	}


	/**
	* getstring 
	* 
	**/
	public String getString(){		return  string;
	}
	/**
	*setstring 
	*/
	public void setString(String astring){
		if(astring==null){
		    changed = (this.string!=null);
		    this.string = null;	    
		}else{
			changed = astring.equals(this.string);
			this.string=astring;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("MD5Check, ")		
		//.append("md5hash=")
		.append(md5hash)
		.append(",")
		//.append("string=")
		.append(string)
    			.append("");

		return sb.toString();		
	}
}