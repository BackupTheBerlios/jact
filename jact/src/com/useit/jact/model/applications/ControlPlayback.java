package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * ControlPlayback<br>
 * Plays back a given filename (do not put extension). Options may also  be included following a pipe symbol. You can use * and # to rewind and  fast forward the playback specified. If 'stopchar' is added the file will  terminate playback when 'stopchar' is pressed. Returns -1 if the channel  was hung up. if the file does not exist jumps to n+101 if it present.   Example: exten => 1234,1,ControlPlayback(file|4000|*|#|1|0)
 * </p>
 * Created : Sun Jul 09 18:50:41 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: ControlPlayback.java,v 1.1 2008/06/24 20:44:57 urszeidler Exp $
 */
 public  class ControlPlayback extends PbxApplication implements IControlPlayback{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für ControlPlayback
	**/
	public ControlPlayback(){
		super();
	
	}
	/**
	* komplexer Konstruktor für ControlPlayback
	**/
	public ControlPlayback( String afilename, String askipms, String affchar, String arewchar, String astopchar, String apausechr){
		super();
	
		this.filename = afilename;	
		this.skipms = askipms;	
		this.ffchar = affchar;	
		this.rewchar = arewchar;	
		this.stopchar = astopchar;	
		this.pausechr = apausechr;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(ControlPlayback object){
		this.filename = object.filename;	
		this.skipms = object.skipms;	
		this.ffchar = object.ffchar;	
		this.rewchar = object.rewchar;	
		this.stopchar = object.stopchar;	
		this.pausechr = object.pausechr;	

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
	protected String skipms;
	public static final String VALUEID_SKIPMS="skipms" ;

    /**   **/
	protected String ffchar;
	public static final String VALUEID_FFCHAR="ffchar" ;

    /**   **/
	protected String rewchar;
	public static final String VALUEID_REWCHAR="rewchar" ;

    /**   **/
	protected String stopchar;
	public static final String VALUEID_STOPCHAR="stopchar" ;

    /**   **/
	protected String pausechr;
	public static final String VALUEID_PAUSECHR="pausechr" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FILENAME.equals(valueid)){
			return true;
		}
		if(VALUEID_SKIPMS.equals(valueid)){
			return true;
		}
		if(VALUEID_FFCHAR.equals(valueid)){
			return true;
		}
		if(VALUEID_REWCHAR.equals(valueid)){
			return true;
		}
		if(VALUEID_STOPCHAR.equals(valueid)){
			return true;
		}
		if(VALUEID_PAUSECHR.equals(valueid)){
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
		if(VALUEID_SKIPMS.equals(valueid)){
			setSkipms((String)data);
			return;
		}
		if(VALUEID_FFCHAR.equals(valueid)){
			setFfchar((String)data);
			return;
		}
		if(VALUEID_REWCHAR.equals(valueid)){
			setRewchar((String)data);
			return;
		}
		if(VALUEID_STOPCHAR.equals(valueid)){
			setStopchar((String)data);
			return;
		}
		if(VALUEID_PAUSECHR.equals(valueid)){
			setPausechr((String)data);
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
		if(VALUEID_SKIPMS.equals(valueid)){
			return getSkipms();
			
		}
		if(VALUEID_FFCHAR.equals(valueid)){
			return getFfchar();
			
		}
		if(VALUEID_REWCHAR.equals(valueid)){
			return getRewchar();
			
		}
		if(VALUEID_STOPCHAR.equals(valueid)){
			return getStopchar();
			
		}
		if(VALUEID_PAUSECHR.equals(valueid)){
			return getPausechr();
			
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
	* getskipms 
	* 
	**/
	public String getSkipms(){		return  skipms;
	}
	/**
	*setskipms 
	*/
	public void setSkipms(String askipms){
		if(askipms==null){
		    changed = (this.skipms!=null);
		    this.skipms = null;	    
		}else{
			changed = askipms.equals(this.skipms);
			this.skipms=askipms;
		}
	}


	/**
	* getffchar 
	* 
	**/
	public String getFfchar(){		return  ffchar;
	}
	/**
	*setffchar 
	*/
	public void setFfchar(String affchar){
		if(affchar==null){
		    changed = (this.ffchar!=null);
		    this.ffchar = null;	    
		}else{
			changed = affchar.equals(this.ffchar);
			this.ffchar=affchar;
		}
	}


	/**
	* getrewchar 
	* 
	**/
	public String getRewchar(){		return  rewchar;
	}
	/**
	*setrewchar 
	*/
	public void setRewchar(String arewchar){
		if(arewchar==null){
		    changed = (this.rewchar!=null);
		    this.rewchar = null;	    
		}else{
			changed = arewchar.equals(this.rewchar);
			this.rewchar=arewchar;
		}
	}


	/**
	* getstopchar 
	* 
	**/
	public String getStopchar(){		return  stopchar;
	}
	/**
	*setstopchar 
	*/
	public void setStopchar(String astopchar){
		if(astopchar==null){
		    changed = (this.stopchar!=null);
		    this.stopchar = null;	    
		}else{
			changed = astopchar.equals(this.stopchar);
			this.stopchar=astopchar;
		}
	}


	/**
	* getpausechr 
	* 
	**/
	public String getPausechr(){		return  pausechr;
	}
	/**
	*setpausechr 
	*/
	public void setPausechr(String apausechr){
		if(apausechr==null){
		    changed = (this.pausechr!=null);
		    this.pausechr = null;	    
		}else{
			changed = apausechr.equals(this.pausechr);
			this.pausechr=apausechr;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("ControlPlayback, ")		
		//.append("filename=")
		.append(filename)
		.append(",")
		//.append("skipms=")
		.append(skipms)
		.append(",")
		//.append("ffchar=")
		.append(ffchar)
		.append(",")
		//.append("rewchar=")
		.append(rewchar)
		.append(",")
		//.append("stopchar=")
		.append(stopchar)
		.append(",")
		//.append("pausechr=")
		.append(pausechr)
    			.append("");

		return sb.toString();		
	}
}