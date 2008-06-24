package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Background<br>
 * Plays given files, while simultaneously waiting for the user to begin typing an extension. The timeouts do not count until the last BackGround application has ended. Options may also be included following a pipe  symbol. The 'skip' option causes the playback of the message to be  skipped if the channel is not in the 'up' state (i.e. it hasn't been answered yet. If 'skip' is specified, the application will return immediately should the channel not be off hook. Otherwise, unless  'noanswer' is specified, the channel channel will be answered before the sound is played. Not all channels support playing messages while still hook. The 'langoverride' may be a language to use for playing the prompt which differs from the current language of the channel. Returns -1 if  the channel was hung up, or if the file does not exist. Returns 0 otherwise.
 * </p>
 * Created : Sun Jul 09 18:50:02 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Background.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class Background extends PbxApplication implements IBackground{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Background
	**/
	public Background(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Background
	**/
	public Background( String afilename1, String afilename2, String aoptions, String alangoverride){
		super();
	
		this.filename1 = afilename1;	
		this.filename2 = afilename2;	
		this.options = aoptions;	
		this.langoverride = alangoverride;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Background object){
		this.filename1 = object.filename1;	
		this.filename2 = object.filename2;	
		this.options = object.options;	
		this.langoverride = object.langoverride;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String filename1;
	public static final String VALUEID_FILENAME1="filename1" ;

    /**   **/
	protected String filename2;
	public static final String VALUEID_FILENAME2="filename2" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

    /**   **/
	protected String langoverride;
	public static final String VALUEID_LANGOVERRIDE="langoverride" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FILENAME1.equals(valueid)){
			return true;
		}
		if(VALUEID_FILENAME2.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return true;
		}
		if(VALUEID_LANGOVERRIDE.equals(valueid)){
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
		if(VALUEID_FILENAME1.equals(valueid)){
			setFilename1((String)data);
			return;
		}
		if(VALUEID_FILENAME2.equals(valueid)){
			setFilename2((String)data);
			return;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			setOptions((String)data);
			return;
		}
		if(VALUEID_LANGOVERRIDE.equals(valueid)){
			setLangoverride((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_FILENAME1.equals(valueid)){
			return getFilename1();
			
		}
		if(VALUEID_FILENAME2.equals(valueid)){
			return getFilename2();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
		if(VALUEID_LANGOVERRIDE.equals(valueid)){
			return getLangoverride();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getfilename1 
	* 
	**/
	public String getFilename1(){		return  filename1;
	}
	/**
	*setfilename1 
	*/
	public void setFilename1(String afilename1){
		if(afilename1==null){
		    changed = (this.filename1!=null);
		    this.filename1 = null;	    
		}else{
			changed = afilename1.equals(this.filename1);
			this.filename1=afilename1;
		}
	}


	/**
	* getfilename2 
	* 
	**/
	public String getFilename2(){		return  filename2;
	}
	/**
	*setfilename2 
	*/
	public void setFilename2(String afilename2){
		if(afilename2==null){
		    changed = (this.filename2!=null);
		    this.filename2 = null;	    
		}else{
			changed = afilename2.equals(this.filename2);
			this.filename2=afilename2;
		}
	}


	/**
	* getoptions 
	* 
	**/
	public String getOptions(){		return  options;
	}
	/**
	*setoptions 
	*/
	public void setOptions(String aoptions){
		if(aoptions==null){
		    changed = (this.options!=null);
		    this.options = null;	    
		}else{
			changed = aoptions.equals(this.options);
			this.options=aoptions;
		}
	}


	/**
	* getlangoverride 
	* 
	**/
	public String getLangoverride(){		return  langoverride;
	}
	/**
	*setlangoverride 
	*/
	public void setLangoverride(String alangoverride){
		if(alangoverride==null){
		    changed = (this.langoverride!=null);
		    this.langoverride = null;	    
		}else{
			changed = alangoverride.equals(this.langoverride);
			this.langoverride=alangoverride;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Background, ")		
		//.append("filename1=")
		.append(filename1)
		.append(",")
		//.append("filename2=")
		.append(filename2)
		.append(",")
		//.append("options=")
		.append(options)
		.append(",")
		//.append("langoverride=")
		.append(langoverride)
    			.append("");

		return sb.toString();		
	}
}