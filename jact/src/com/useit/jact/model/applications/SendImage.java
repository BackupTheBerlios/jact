package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * SendImage<br>
 * Sends an image on a channel. If the channel does not support image transport, and there exists a step with priority n + 101, then execution will continue at that step. Otherwise, execution will continue at the next priority level. SendImage only returns 0 if the image was sent correctly or if the channel does not support image transport, and -1 otherwise.
 * </p>
 * Created : Sun Jul 09 18:49:12 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: SendImage.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class SendImage extends PbxApplication implements ISendImage{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für SendImage
	**/
	public SendImage(){
		super();
	
	}
	/**
	* komplexer Konstruktor für SendImage
	**/
	public SendImage( String afilename){
		super();
	
		this.filename = afilename;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(SendImage object){
		this.filename = object.filename;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String filename;
	public static final String VALUEID_FILENAME="filename" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FILENAME.equals(valueid)){
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
		if(VALUEID_FILENAME.equals(valueid)){
			setFilename((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_FILENAME.equals(valueid)){
			return getFilename();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getfilename 
	* 
	**/
	public String getFilename(){		return  filename;
	}
	/**
	*setfilename 
	*/
	public void setFilename(String afilename){
		if(afilename==null){
		    changed = (this.filename!=null);
		    this.filename = null;	    
		}else{
			changed = afilename.equals(this.filename);
			this.filename=afilename;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("SendImage, ")		
		//.append("filename=")
		.append(filename)
    			.append("");

		return sb.toString();		
	}
}