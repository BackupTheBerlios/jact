package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Monitor<br>
 * Used to start monitoring a channel. The channel's input and output voice packets are logged to files until the channel hangs up or monitoring is stopped by the StopMonitor application.  file_format  optional, if not set, defaults to "wav"  fname_base  if set, changes the filename used to the one specified.  options:  m - when the recording ends mix the two leg files into one and  delete the two leg files. If the variable MONITOR_EXEC is set, the  application referenced in it will be executed instead of  soxmix and the raw leg files will NOT be deleted automatically.  soxmix or MONITOR_EXEC is handed 3 arguments, the two leg files  and a target mixed file name which is the same as the leg file names  only without the in/out designator.  If MONITOR_EXEC_ARGS is set, the contents will be passed on as  additional arguements to MONITOR_EXEC  Both MONITOR_EXEC and the Mix flag can be set from the  administrator interface   b - Don't begin recording unless a call is bridged to another channel  Returns -1 if monitor files can't be opened or if the channel is already monitored, otherwise 0.
 * </p>
 * Created : Sun Jul 09 18:50:33 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Monitor.java,v 1.1 2008/06/24 20:44:56 urszeidler Exp $
 */
 public  class Monitor extends PbxApplication implements IMonitor{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Monitor
	**/
	public Monitor(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Monitor
	**/
	public Monitor( String afile_format, String aurlbase, String afname_base, String aoptions){
		super();
	
		this.file_format = afile_format;	
		this.urlbase = aurlbase;	
		this.fname_base = afname_base;	
		this.options = aoptions;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Monitor object){
		this.file_format = object.file_format;	
		this.urlbase = object.urlbase;	
		this.fname_base = object.fname_base;	
		this.options = object.options;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String file_format;
	public static final String VALUEID_FILE_FORMAT="file_format" ;

    /**   **/
	protected String urlbase;
	public static final String VALUEID_URLBASE="urlbase" ;

    /**   **/
	protected String fname_base;
	public static final String VALUEID_FNAME_BASE="fname_base" ;

    /**   **/
	protected String options;
	public static final String VALUEID_OPTIONS="options" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_FILE_FORMAT.equals(valueid)){
			return true;
		}
		if(VALUEID_URLBASE.equals(valueid)){
			return true;
		}
		if(VALUEID_FNAME_BASE.equals(valueid)){
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
		if(VALUEID_FILE_FORMAT.equals(valueid)){
			setFile_format((String)data);
			return;
		}
		if(VALUEID_URLBASE.equals(valueid)){
			setUrlbase((String)data);
			return;
		}
		if(VALUEID_FNAME_BASE.equals(valueid)){
			setFname_base((String)data);
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
		if(VALUEID_FILE_FORMAT.equals(valueid)){
			return getFile_format();
			
		}
		if(VALUEID_URLBASE.equals(valueid)){
			return getUrlbase();
			
		}
		if(VALUEID_FNAME_BASE.equals(valueid)){
			return getFname_base();
			
		}
		if(VALUEID_OPTIONS.equals(valueid)){
			return getOptions();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getfile_format 
	* 
	**/
	public String getFile_format(){		return  file_format;
	}
	/**
	*setfile_format 
	*/
	public void setFile_format(String afile_format){
		if(afile_format==null){
		    changed = (this.file_format!=null);
		    this.file_format = null;	    
		}else{
			changed = afile_format.equals(this.file_format);
			this.file_format=afile_format;
		}
	}


	/**
	* geturlbase 
	* 
	**/
	public String getUrlbase(){		return  urlbase;
	}
	/**
	*seturlbase 
	*/
	public void setUrlbase(String aurlbase){
		if(aurlbase==null){
		    changed = (this.urlbase!=null);
		    this.urlbase = null;	    
		}else{
			changed = aurlbase.equals(this.urlbase);
			this.urlbase=aurlbase;
		}
	}


	/**
	* getfname_base 
	* 
	**/
	public String getFname_base(){		return  fname_base;
	}
	/**
	*setfname_base 
	*/
	public void setFname_base(String afname_base){
		if(afname_base==null){
		    changed = (this.fname_base!=null);
		    this.fname_base = null;	    
		}else{
			changed = afname_base.equals(this.fname_base);
			this.fname_base=afname_base;
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
		sb.append("Monitor, ")		
		//.append("file_format=")
		.append(file_format)
		.append(",")
		//.append("urlbase=")
		.append(urlbase)
		.append(",")
		//.append("fname_base=")
		.append(fname_base)
		.append(",")
		//.append("options=")
		.append(options)
    			.append("");

		return sb.toString();		
	}
}