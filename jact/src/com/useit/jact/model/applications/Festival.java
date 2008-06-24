package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Festival<br>
 * Connect to Festival, send the argument, get back the waveform,play it to the user, allowing any given interrupt keys to immediately terminate and return the value, or 'any' to allow any number back (useful in dialplan)
 * </p>
 * Created : Sun Jul 09 18:50:42 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Festival.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class Festival extends PbxApplication implements IFestival{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Festival
	**/
	public Festival(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Festival
	**/
	public Festival( String atext, String aintkeys){
		super();
	
		this.text = atext;	
		this.intkeys = aintkeys;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Festival object){
		this.text = object.text;	
		this.intkeys = object.intkeys;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String text;
	public static final String VALUEID_TEXT="text" ;

    /**   **/
	protected String intkeys;
	public static final String VALUEID_INTKEYS="intkeys" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TEXT.equals(valueid)){
			return true;
		}
		if(VALUEID_INTKEYS.equals(valueid)){
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
		if(VALUEID_TEXT.equals(valueid)){
			setText((String)data);
			return;
		}
		if(VALUEID_INTKEYS.equals(valueid)){
			setIntkeys((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_TEXT.equals(valueid)){
			return getText();
			
		}
		if(VALUEID_INTKEYS.equals(valueid)){
			return getIntkeys();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* gettext 
	* 
	**/
	public String getText(){		return  text;
	}
	/**
	*settext 
	*/
	public void setText(String atext){
		if(atext==null){
		    changed = (this.text!=null);
		    this.text = null;	    
		}else{
			changed = atext.equals(this.text);
			this.text=atext;
		}
	}


	/**
	* getintkeys 
	* 
	**/
	public String getIntkeys(){		return  intkeys;
	}
	/**
	*setintkeys 
	*/
	public void setIntkeys(String aintkeys){
		if(aintkeys==null){
		    changed = (this.intkeys!=null);
		    this.intkeys = null;	    
		}else{
			changed = aintkeys.equals(this.intkeys);
			this.intkeys=aintkeys;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Festival, ")		
		//.append("text=")
		.append(text)
		.append(",")
		//.append("intkeys=")
		.append(intkeys)
    			.append("");

		return sb.toString();		
	}
}