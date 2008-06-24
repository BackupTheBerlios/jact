package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Record<br>
 * Records from the channel into a given filename. If the file exists it will be overwritten. - 'format' is the format of the file type to be recorded (wav, gsm, etc). - 'silence' is the number of seconds of silence to allow before returning. - 'maxduration' is the maximum recording duration in seconds. If missing or 0 there is no maximum. - 'options' may contain any of the following letters:  's' : skip recording if the line is not yet answered  'n' : do not answer, but record anyway if line not yet answered  'a' : append to existing recording rather than replacing  't' : use alternate '*' terminator key instead of default '#'  'q' : quiet (do not play a beep tone)  If filename contains '%d', these characters will be replaced with a number incremented by one each time the file is recorded.   Formats: g723, g729, gsm, h263, ulaw, alaw, vox, wav, WAV  User can press '#' to terminate the recording and continue to the next priority.  Returns -1 when the user hangs up.
 * </p>
 * Created : Sun Jul 09 18:51:13 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Record.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class Record extends PbxApplication implements IRecord{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Record
	**/
	public Record(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Record
	**/
	public Record( String afilename, String aformat, String asilence, String amaxduration, String aoptions){
		super();
	
		this.filename = afilename;	
		this.format = aformat;	
		this.silence = asilence;	
		this.maxduration = amaxduration;	
		this.options = aoptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Record object){
		this.filename = object.filename;	
		this.format = object.format;	
		this.silence = object.silence;	
		this.maxduration = object.maxduration;	
		this.options = object.options;	

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
	protected String format;
	public static final String VALUEID_FORMAT="format" ;

    /**   **/
	protected String silence;
	public static final String VALUEID_SILENCE="silence" ;

    /**   **/
	protected String maxduration;
	public static final String VALUEID_MAXDURATION="maxduration" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FILENAME.equals(valueid)){
			return true;
		}
		if(VALUEID_FORMAT.equals(valueid)){
			return true;
		}
		if(VALUEID_SILENCE.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXDURATION.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
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
		if(VALUEID_FORMAT.equals(valueid)){
			setFormat((String)data);
			return;
		}
		if(VALUEID_SILENCE.equals(valueid)){
			setSilence((String)data);
			return;
		}
		if(VALUEID_MAXDURATION.equals(valueid)){
			setMaxduration((String)data);
			return;
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			setOptions((String)data);
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
		if(VALUEID_FORMAT.equals(valueid)){
			return getFormat();
			
		}
		if(VALUEID_SILENCE.equals(valueid)){
			return getSilence();
			
		}
		if(VALUEID_MAXDURATION.equals(valueid)){
			return getMaxduration();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
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
	* getformat 
	* 
	**/
	public String getFormat(){		return  format;
	}
	/**
	*setformat 
	*/
	public void setFormat(String aformat){
		if(aformat==null){
		    changed = (this.format!=null);
		    this.format = null;	    
		}else{
			changed = aformat.equals(this.format);
			this.format=aformat;
		}
	}


	/**
	* getsilence 
	* 
	**/
	public String getSilence(){		return  silence;
	}
	/**
	*setsilence 
	*/
	public void setSilence(String asilence){
		if(asilence==null){
		    changed = (this.silence!=null);
		    this.silence = null;	    
		}else{
			changed = asilence.equals(this.silence);
			this.silence=asilence;
		}
	}


	/**
	* getmaxduration 
	* 
	**/
	public String getMaxduration(){		return  maxduration;
	}
	/**
	*setmaxduration 
	*/
	public void setMaxduration(String amaxduration){
		if(amaxduration==null){
		    changed = (this.maxduration!=null);
		    this.maxduration = null;	    
		}else{
			changed = amaxduration.equals(this.maxduration);
			this.maxduration=amaxduration;
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
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Record, ")		
		//.append("filename=")
		.append(filename)
		.append(",")
		//.append("format=")
		.append(format)
		.append(",")
		//.append("silence=")
		.append(silence)
		.append(",")
		//.append("maxduration=")
		.append(maxduration)
		.append(",")
		//.append("options=")
		.append(options)
    			.append("");

		return sb.toString();		
	}
}