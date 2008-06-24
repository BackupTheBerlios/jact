package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SubString<br>
 * (Deprecated, use ${variable:a:b} instead)   SubString(variable=string_of_digits|count1|count2): Assigns the substring of string_of_digits to a given variable. Parameter count1 may be positive or negative. If it's positive then we skip the first count1 digits from the left. If it's negative, we move count1 digits counting from the end of the string to the left. Parameter count2 implies how many digits we are taking from the point that count1 placed us. If count2 is negative, then that many digits are omitted from the end. For example: exten => _NXXXXXX,1,SubString,test=2564286161|0|3 assigns the area code (3 first digits) to variable test. exten => _NXXXXXX,1,SubString,test=2564286161|-7|7 assigns the last 7 digits to variable test. exten => _NXXXXXX,1,SubString,test=2564286161|0|-4 assigns all but the last 4 digits to variable test. If there are no parameters it'll return with -1. If there wrong parameters it go on and return with 0
 * </p>
 * Created : Sun Jul 09 18:50:00 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SubString.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SubString extends PbxApplication implements ISubString{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SubString
	**/
	public SubString(){
		super();
	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SubString object){

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
	    return false;
	}
	
	/**
	 * setzt einen Wert per valueid
	 * @param valueid
	 * @param data
	 */
	public void setByValue(String valueid,Object data){
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
	    
	    return null;
	}

	
	//---------  getter und setter

	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SubString, ")		
		.append("");

		return sb.toString();		
	}
}