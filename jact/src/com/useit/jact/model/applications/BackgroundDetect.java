package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * BackgroundDetect<br>
 * Plays back a given filename, waiting for interruption from a given digit (the digit must start the beginning of a valid extension, or it will be ignored). During the playback of the file, audio is monitored in the receive direction, and if a period of non-silence which is greater than 'min' ms yet less than 'max' ms is followed by silence for at least 'sil' ms then the audio playback is aborted and processing jumps to the 'talk' extension if available. If unspecified, sil, min, and max default to 1000, 100, and infinity respectively. Returns -1 on hangup, and 0 on successful playback completion with no exit conditions.
 * </p>
 * Created : Sun Jul 09 18:50:48 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: BackgroundDetect.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class BackgroundDetect extends PbxApplication implements IBackgroundDetect{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für BackgroundDetect
	**/
	public BackgroundDetect(){
		super();
	
	}
	/**
	* komplexer Konstruktor für BackgroundDetect
	**/
	public BackgroundDetect( String afilename, String asil, String amin, String amax){
		super();
	
		this.filename = afilename;	
		this.sil = asil;	
		this.min = amin;	
		this.max = amax;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(BackgroundDetect object){
		this.filename = object.filename;	
		this.sil = object.sil;	
		this.min = object.min;	
		this.max = object.max;	

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
	protected String sil;
	public static final String VALUEID_SIL="sil" ;

    /**   **/
	protected String min;
	public static final String VALUEID_MIN="min" ;

    /**   **/
	protected String max;
	public static final String VALUEID_MAX="max" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FILENAME.equals(valueid)){
			return true;
		}
		if(VALUEID_SIL.equals(valueid)){
			return true;
		}
		if(VALUEID_MIN.equals(valueid)){
			return true;
		}
		if(VALUEID_MAX.equals(valueid)){
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
		if(VALUEID_SIL.equals(valueid)){
			setSil((String)data);
			return;
		}
		if(VALUEID_MIN.equals(valueid)){
			setMin((String)data);
			return;
		}
		if(VALUEID_MAX.equals(valueid)){
			setMax((String)data);
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
		if(VALUEID_SIL.equals(valueid)){
			return getSil();
			
		}
		if(VALUEID_MIN.equals(valueid)){
			return getMin();
			
		}
		if(VALUEID_MAX.equals(valueid)){
			return getMax();
			
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
	* getsil 
	* 
	**/
	public String getSil(){		return  sil;
	}
	/**
	*setsil 
	*/
	public void setSil(String asil){
		if(asil==null){
		    changed = (this.sil!=null);
		    this.sil = null;	    
		}else{
			changed = asil.equals(this.sil);
			this.sil=asil;
		}
	}


	/**
	* getmin 
	* 
	**/
	public String getMin(){		return  min;
	}
	/**
	*setmin 
	*/
	public void setMin(String amin){
		if(amin==null){
		    changed = (this.min!=null);
		    this.min = null;	    
		}else{
			changed = amin.equals(this.min);
			this.min=amin;
		}
	}


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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("BackgroundDetect, ")		
		//.append("filename=")
		.append(filename)
		.append(",")
		//.append("sil=")
		.append(sil)
		.append(",")
		//.append("min=")
		.append(min)
		.append(",")
		//.append("max=")
		.append(max)
    			.append("");

		return sb.toString();		
	}
}