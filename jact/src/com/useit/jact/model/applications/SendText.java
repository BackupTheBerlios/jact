package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SendText<br>
 * Sends text to client. If the client does not support text transport, and there exists a step with priority n + 101, then execution will continue at that step. Otherwise, execution will continue at the next priority level. SendText only returns 0 if the text was sent correctly or if the channel does not support text transport, and -1 otherwise.
 * </p>
 * Created : Sun Jul 09 18:50:24 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendText.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SendText extends PbxApplication implements ISendText{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SendText
	**/
	public SendText(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SendText
	**/
	public SendText( String atext){
		super();
	
		this.text = atext;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SendText object){
		this.text = object.text;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String text;
	public static final String VALUEID_TEXT="text" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_TEXT.equals(valueid)){
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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SendText, ")		
		//.append("text=")
		.append(text)
    			.append("");

		return sb.toString();		
	}
}