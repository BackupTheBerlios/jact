package com.useit.jact.model.applications;

//import com.useit.jact.db.ConnectionManager;
//import com.useit.jact.config.ApplicationConfig;
import com.useit.jact.model.types.PbxApplication;


/**
 * <p>
 * Read<br>
 * Reads a #-terminated string of digits a certain number of times from the user in to the given variable.  filename -- file to play before reading digits.  maxdigits -- maximum acceptable number of digits. Stops reading after  maxdigits have been entered (without requiring the user to  press the '#' key).  Defaults to 0 - no limit - wait for the user press the '#' key.  Any value below 0 means the same. Max accepted value is 255.  option -- may be 'skip' to return immediately if the line is not up,  or 'noanswer' to read digits even if the line is not up.  attempts -- if greater than 1, that many attempts will be made in the   event no data is entered.  timeout -- if greater than 0, that value will override the default timeoft.  Returns -1 on hangup or error and 0 otherwise.
 * </p>
 * Created : Sun Jul 09 18:51:51 CEST 2006
 *
 * @author urs
 * @version $Revision: 1.1 $, $Id: Read.java,v 1.1 2008/06/24 20:44:59 urszeidler Exp $
 */
 public  class Read extends PbxApplication implements IRead{
	protected boolean changed;
	
	// --------------- Konstruktor ---------------------
	/**
	* einfacher Konstruktor für Read
	**/
	public Read(){
		super();
	
	}
	/**
	* komplexer Konstruktor für Read
	**/
	public Read( String avariable, String afilename, String amaxdigits, String aoption, String aattempts, String atimeout){
		super();
	
		this.variable = avariable;	
		this.filename = afilename;	
		this.maxdigits = amaxdigits;	
		this.option = aoption;	
		this.attempts = aattempts;	
		this.timeout = atimeout;	
	}
	/**
	 * Übernimmt alle Werte aus dem übergebenen object, werden nur als referenzen Kopiert, also aufpaassen beim ändern der daten
	 * @param object
	 */
	public void assignTo(Read object){
		this.variable = object.variable;	
		this.filename = object.filename;	
		this.maxdigits = object.maxdigits;	
		this.option = object.option;	
		this.attempts = object.attempts;	
		this.timeout = object.timeout;	

	}
//--------------  map Funktionen
	
//--------------  Aggregat Funktionen
// ------   1-1 aggregates
//--------------  loadsavedelete Methoden
//--------------   getter und setter und felder	

    /**   **/
	protected String variable;
	public static final String VALUEID_VARIABLE="variable" ;

    /**   **/
	protected String filename;
	public static final String VALUEID_FILENAME="filename" ;

    /**   **/
	protected String maxdigits;
	public static final String VALUEID_MAXDIGITS="maxdigits" ;

    /**   **/
	protected String option;
	public static final String VALUEID_OPTION="option" ;

    /**   **/
	protected String attempts;
	public static final String VALUEID_ATTEMPTS="attempts" ;

    /**   **/
	protected String timeout;
	public static final String VALUEID_TIMEOUT="timeout" ;

	/**
	 * überprüft ob es das value in dem Objekt gibt
	 * @param valueid
	 * @return
	 */
	public static boolean hasValue(String valueid){
		if(VALUEID_VARIABLE.equals(valueid)){
			return true;
		}
		if(VALUEID_FILENAME.equals(valueid)){
			return true;
		}
		if(VALUEID_MAXDIGITS.equals(valueid)){
			return true;
		}
		if(VALUEID_OPTION.equals(valueid)){
			return true;
		}
		if(VALUEID_ATTEMPTS.equals(valueid)){
			return true;
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
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
		if(VALUEID_VARIABLE.equals(valueid)){
			setVariable((String)data);
			return;
		}
		if(VALUEID_FILENAME.equals(valueid)){
			setFilename((String)data);
			return;
		}
		if(VALUEID_MAXDIGITS.equals(valueid)){
			setMaxdigits((String)data);
			return;
		}
		if(VALUEID_OPTION.equals(valueid)){
			setOption((String)data);
			return;
		}
		if(VALUEID_ATTEMPTS.equals(valueid)){
			setAttempts((String)data);
			return;
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			setTimeout((String)data);
			return;
		}
	}
	/**
	 * gibt einen Wert by Vauleid zurück
	 * @param valueid
	 * @return
	 */
	public Object getByValue(String valueid){
		if(VALUEID_VARIABLE.equals(valueid)){
			return getVariable();
			
		}
		if(VALUEID_FILENAME.equals(valueid)){
			return getFilename();
			
		}
		if(VALUEID_MAXDIGITS.equals(valueid)){
			return getMaxdigits();
			
		}
		if(VALUEID_OPTION.equals(valueid)){
			return getOption();
			
		}
		if(VALUEID_ATTEMPTS.equals(valueid)){
			return getAttempts();
			
		}
		if(VALUEID_TIMEOUT.equals(valueid)){
			return getTimeout();
			
		}
	    
	    return null;
	}

	
	//---------  getter und setter

	/**
	* getvariable 
	* 
	**/
	public String getVariable(){		return  variable;
	}
	/**
	*setvariable 
	*/
	public void setVariable(String avariable){
		if(avariable==null){
		    changed = (this.variable!=null);
		    this.variable = null;	    
		}else{
			changed = avariable.equals(this.variable);
			this.variable=avariable;
		}
	}


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
	* getmaxdigits 
	* 
	**/
	public String getMaxdigits(){		return  maxdigits;
	}
	/**
	*setmaxdigits 
	*/
	public void setMaxdigits(String amaxdigits){
		if(amaxdigits==null){
		    changed = (this.maxdigits!=null);
		    this.maxdigits = null;	    
		}else{
			changed = amaxdigits.equals(this.maxdigits);
			this.maxdigits=amaxdigits;
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
	* getattempts 
	* 
	**/
	public String getAttempts(){		return  attempts;
	}
	/**
	*setattempts 
	*/
	public void setAttempts(String aattempts){
		if(aattempts==null){
		    changed = (this.attempts!=null);
		    this.attempts = null;	    
		}else{
			changed = aattempts.equals(this.attempts);
			this.attempts=aattempts;
		}
	}


	/**
	* gettimeout 
	* 
	**/
	public String getTimeout(){		return  timeout;
	}
	/**
	*settimeout 
	*/
	public void setTimeout(String atimeout){
		if(atimeout==null){
		    changed = (this.timeout!=null);
		    this.timeout = null;	    
		}else{
			changed = atimeout.equals(this.timeout);
			this.timeout=atimeout;
		}
	}


	/** 
	 * eine einfache to string methode die nur die Felder anzeigt.
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Read, ")		
		//.append("variable=")
		.append(variable)
		.append(",")
		//.append("filename=")
		.append(filename)
		.append(",")
		//.append("maxdigits=")
		.append(maxdigits)
		.append(",")
		//.append("option=")
		.append(option)
		.append(",")
		//.append("attempts=")
		.append(attempts)
		.append(",")
		//.append("timeout=")
		.append(timeout)
    			.append("");

		return sb.toString();		
	}
}