package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Eval<br>
 * Normally Asterisk evaluates variables inline. But what if you want to store variable offsets in a database, to be evaluated later? Eval is the answer, by allowing a string to be evaluated twice in the dialplan, the first time as part of the normal dialplan, and the second using Eval.
 * </p>
 * Created : Sun Jul 09 18:48:59 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Eval.java,v 1.1 2008/06/24 20:44:58 urszeidler Exp $
 */
 public  class Eval extends PbxApplication implements IEval{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Eval
	**/
	public Eval(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Eval
	**/
	public Eval( String anewvar, String asomestring){
		super();
	
		this.newvar = anewvar;	
		this.somestring = asomestring;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Eval object){
		this.newvar = object.newvar;	
		this.somestring = object.somestring;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String newvar;
	public static final String VALUEID_NEWVAR="newvar" ;

    /**   **/
	protected String somestring;
	public static final String VALUEID_SOMESTRING="somestring" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_NEWVAR.equals(valueid)){
			return true;
		}
		if(VALUEID_SOMESTRING.equals(valueid)){
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
		if(VALUEID_NEWVAR.equals(valueid)){
			setNewvar((String)data);
			return;
		}
		if(VALUEID_SOMESTRING.equals(valueid)){
			setSomestring((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_NEWVAR.equals(valueid)){
			return getNewvar();
			
		}
		if(VALUEID_SOMESTRING.equals(valueid)){
			return getSomestring();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getnewvar 
	* 
	**/
	public String getNewvar(){		return  newvar;
	}
	/**
	*setnewvar 
	*/
	public void setNewvar(String anewvar){
		if(anewvar==null){
		    changed = (this.newvar!=null);
		    this.newvar = null;	    
		}else{
			changed = anewvar.equals(this.newvar);
			this.newvar=anewvar;
		}
	}


	/**
	* getsomestring 
	* 
	**/
	public String getSomestring(){		return  somestring;
	}
	/**
	*setsomestring 
	*/
	public void setSomestring(String asomestring){
		if(asomestring==null){
		    changed = (this.somestring!=null);
		    this.somestring = null;	    
		}else{
			changed = asomestring.equals(this.somestring);
			this.somestring=asomestring;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Eval, ")		
		//.append("newvar=")
		.append(newvar)
		.append(",")
		//.append("somestring=")
		.append(somestring)
    			.append("");

		return sb.toString();		
	}
}