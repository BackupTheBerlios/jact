package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Playback<br>
 * Plays back a given filename (do not put extension). Options may also be included following a pipe symbol. The 'skip' option causes the playback of the message to be skipped if the channel is not in the 'up' state (i.e. it hasn't been answered yet. If 'skip' is  specified, the application will return immediately should the channel not be off hook. Otherwise, unless 'noanswer' is specified, the channel channel will be answered before the sound is played. Not all channels support playing messages while still hook. Returns -1 if the channel was hung up. If the file does not exist, will jump to priority n+101 if present.
 * </p>
 * Created : Sun Jul 09 18:51:45 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Playback.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class Playback extends PbxApplication implements IPlayback{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Playback
	**/
	public Playback(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Playback
	**/
	public Playback( String afilename, String aoption){
		super();
	
		this.filename = afilename;	
		this.option = aoption;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Playback object){
		this.filename = object.filename;	
		this.option = object.option;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String filename;
	public static final String VALUEID_FILENAME="filename" ;

    /**   **/
	protected String option;
	public static final String VALUEID_OPTION="option" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FILENAME.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTION.equals(valueid)){
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
		if(VALUEID_OPTION.equals(valueid)){
			setOption((String)data);
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
		if(VALUEID_OPTION.equals(valueid)){
			return getOption();
			
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
	* getoption 
	* 
	**/
	public String getOption(){		return  option;
	}
	/**
	*setoption 
	*/
	public void setOption(String aoption){
		if(aoption==null){
		    changed = (this.option!=null);
		    this.option = null;	    
		}else{
			changed = aoption.equals(this.option);
			this.option=aoption;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Playback, ")		
		//.append("filename=")
		.append(filename)
		.append(",")
		//.append("option=")
		.append(option)
    			.append("");

		return sb.toString();		
	}
}